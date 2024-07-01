package Servico;

import Modelo.Empregado;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeEmpregados {
    private List<Empregado> listaEmpregados;

    public GerenciadorDeEmpregados() {
        listaEmpregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        listaEmpregados.add(empregado);
    }

    public Empregado buscarEmpregadoPorId(int id) {
        for (Empregado empregado : listaEmpregados) {
            if (empregado.getId() == id) {
                return empregado;
            }
        }
        return null;
    }

    public void listarEmpregados() {
        for (Empregado empregado : listaEmpregados) {
            System.out.println(empregado);
        }
    }

    public List<Empregado> getListaEmpregados() {
        return listaEmpregados;
    }

    public void salvarDados(String caminhoArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminhoArquivo))) {
            oos.writeObject(listaEmpregados);
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void carregarDados(String caminhoArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminhoArquivo))) {
            listaEmpregados = (List<Empregado>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }
}

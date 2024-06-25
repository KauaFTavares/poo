import java.util.ArrayList;
import java.util.List;

public class BancodeEmpregados {
    private List <Empregado> listaEmpregados;

    public BancodeEmpregados(){
        listaEmpregados = new ArrayList<>();
    }

    public void adicionarEmpregado (Empregado empregado) {
        listaEmpregados.add(empregado);
    }

    public Empregado buscarEmpregadoPorId (int Id) {
        for (Empregado empregado : listaEmpregados){
            if (empregado.getId() == Id) {
                return empregado;
            }
    
        }


    return null;
    }

    public void listarEmpregados(){
        for (Empregado empregado : listaEmpregados) {
            System.out.println(empregado);
        }
    }

}


package sistema;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Material> materiais;

    public Biblioteca() {
        this.materiais = new ArrayList<>();
    }
    public void adicionarMaterial(Material m) {
        materiais.add(m);
        System.out.println("Novo material cadastrado com sucesso!");
    }
    public void listarMateriais() {
        if (materiais.isEmpty()) {
            System.out.println("Nenhum material cadastrado!");
        } else {
            for (Material m: materiais) {
                System.out.println(m);
            }
        }
    }
    public Material pesquisarPorTitulo(String titulo) {
        for (Material m : materiais) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        return null;
    }
    public boolean excluirMaterial(String titulo) {
        Material material = pesquisarPorTitulo(titulo);
        if (material != null) {
            materiais.remove(material);
            System.out.println("Material excluído com sucesso!");
            return true;
        } else {
            System.out.println("Material não encontrado!");
            return false;
        }
    }
}

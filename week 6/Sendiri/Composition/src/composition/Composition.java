package composition;

import java.util.*;

/**
 *
 * @author jovan
 */

//membuat class pohon
class Tree{
    private int height; 
    private int age;
    private String type;
    private List<Leaf> leaves;
    
    Tree(int height, int age, String type){
        this.height = height;
        this.age = age;
        this.type = type;
        this.leaves = new ArrayList<Leaf>();
        leaves.add(new Leaf(1, type, "green"));
        leaves.add(new Leaf(2, type, "brownish green"));
    }
    
    public void showLeaves(){
        for(Leaf l: leaves){
            System.out.println(l.toString());
        }
    }
}

//komposisi suatu pohon adalah daun
class Leaf{
    private int id;
    private String type;
    private String color;
    
    Leaf(int id, String type, String color){
        this.id = id;
        this.type = type;
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "id: " + id + ", type: " + type + ", color: " + color;
    }
}

public class Composition {

    public static void main(String[] args) {
        Tree tree = new Tree(250, 35, "Maple");
        tree.showLeaves();
    }

}

/*
Jawaban:
Composition adalah suatu relationship dimana suatu instance memiliki tanggungjawab
terhadap pembuatan instance lainnya sehingga jangka hidup suatu instance tersebut
bergantung pada pemilik instance tersebut

pada kasus ini, pohon memiliki daun sebagai salah satu komposisinya
*/
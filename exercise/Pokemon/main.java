package Pokemon;

/**
 * Created by rama on 10/13/17.
 */
public class main {
    public static void main(String[]args){
        Gokemon gm1 = new Gokemon();
        gm1.setName("Pikachu");
        gm1.setLevel(23);
        gm1.setHitpoin(200);
        gm1.setType("Normal");
        Gokemon gm2 =  new Gokemon();
        gm2.setName("Bulbasaur");
        gm2.setLevel(20);
        gm2.setHitpoin(169);
        gm2.setType("Grass");
        Gokemon gm3 = new Gokemon();
        gm3.setName("Meow");
        gm3.setLevel(21);
        gm3.setHitpoin(179);
        gm3.setType("Normal");

        Trainer tn = new Trainer();
        tn.listPokemon.add(gm1.getName()+"(lvl "+gm1.getLevel()+")");
        tn.listPokemon.add(gm2.getName()+"(lvl "+gm2.getLevel()+")");
        tn.listPokemon.add(gm3.getName()+"(lvl "+gm3.getLevel()+")");

        tn.setName("ALi Suppa");
        tn.setGender('L');
        tn.setAge(17);

        System.out.println("Nama: "+tn.getName());
        System.out.println("Jenis Kelamin: "+tn.getGender());
        System.out.println("Usia: "+tn.getAge());
        System.out.println("Daftar Pokemon: ");
        for(int i=0;i<tn.listPokemon.size();i++) {
            System.out.println(i+1+". "+tn.listPokemon.get(i));
        }
    }
}

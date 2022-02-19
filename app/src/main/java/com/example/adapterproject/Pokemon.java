package com.example.adapterproject;

public class Pokemon {
    private String name;
    private String descriptionmain;
    private String descriptionactivity;
    private int pic;

    public Pokemon(String n){
        name = n;
        if(name.equals("Charizard")){
            descriptionmain = "Charizard is the final evolution of Charmander. It spits fire that is hot enough to melt boulders. This Pokémon is my favorite Fire-Type Pokémon because it is the first thing I imagine when I think of a Fire-Type Pokémon. It is a crazy damage dealer. ";
            descriptionactivity = "Species:\tFlame Pokémon\n" +
                    "Height:\t1.7 m (5′07″)\n" +
                    "Weight:\t90.5 kg (199.5 lbs)";
            pic = R.drawable.charizard;
        }
        if(name.equals("Blastoise")){
            descriptionmain = "Blastoise is the final evolution of Squirtle. The jets of water it spouts from the rocket cannons on its shell can punch through thick steel. Blastoise is a great Pokémon to have on your team as it is extremely bulky and offensive, due to its high damaging move Hydro Pump.";
            descriptionactivity = "Species:\tShellfish Pokémon\n" +
                    "Height:\t1.6 m (5′03″)\n" +
                    "Weight:\t85.5 kg (188.5 lbs)";
            pic = R.drawable.blastoise;
        }
        if(name.equals("Venusaur")){
            descriptionmain = "Venusaur is the final evolution of Bulbasaur. The plant on Venusaur's back blooms when it is absorbing solar energy. It stays on the move to seek sunlight. Venusaur is my least favorite final starter evolution out of the Kanto region. It looks weird and is outclassed by several other Pokémon.";
            descriptionactivity = "Species:\tSeed Pokémon\n" +
                    "Height:\t2.0 m (6′07″)\n" +
                    "Weight:\t100.0 kg (220.5 lbs)";
            pic = R.drawable.venasaur;
        }
        if(name.equals("Pikachu")){
            descriptionmain = "Pikachu evolves into Raichu. Its nature is to store up electricity. Forests where nests of Pikachu live are dangerous, since the trees are often struck by lightning. The only reason I don't like Pikachu is because of the TV show. For some reason that Pikachu is able to hold its ground against Charizards, which honestly makes no sense to me.";
            descriptionactivity = "Species:\tMouse Pokémon\n" +
                    "Height:\t0.4 m (1′04″)\n" +
                    "Weight:\t6.0 kg (13.2 lbs)";
            pic = R.drawable.pikachu;
        }
        if(name.equals("Shedinja")){
            descriptionmain = "Shedinja is a bug shell that came to life. This Pokémon is either extremely overpowered or completely useless. I say this because of its ability Wonder Guard. This ability allows Shedinja to not take any damage from attacks unless the attack is super effective. However, this crazy ability is kept in check by the fact that Shedinja has 1 HP.";
            descriptionactivity = "Species:\tShed Pokémon\n" +
                    "Height:\t0.8 m (2′07″)\n" +
                    "Weight:\t1.2 kg (2.6 lbs)";
            pic = R.drawable.shedinja;
        }
        if(name.equals("Xurkitree")){
            descriptionmain = "Xurkitree is one of the Ultra Beasts. It is an extremely strong Electric-Type, having an extremely high special attack stat. It has great competitive use, having great average stats as well. It looks really cool, which is why it is my favorite Ultra Beast.";
            descriptionactivity = "Species:\tGlowing Pokémon\n" +
                    "Height:\t3.8 m (12′06″)\n" +
                    "Weight:\t100.0 kg (220.5 lbs)";
            pic = R.drawable.xurkitree;
        }

    }
    public String getName() {
        return name;
    }
    public String getDescriptionmain() {
        return descriptionmain;
    }
    public String getDescriptionactivity() {
        return descriptionactivity;
    }
    public int getPic(){
        return pic;
    }
}
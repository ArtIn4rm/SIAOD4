package com.company;

public class Main {

    public static void main(String[] args){
        HashMap map = new HashMap(20);
        map.add(new Position("agfhksf", 11));
        map.add(new Position("fghakd", 67));
        map.add(new Position("bdfggf", 54));
        map.add(new Position("yioew", 79));
        map.add(new Position("vbnxls", 15));

        map.add(new Position("dfgaae", 19));
        map.add(new Position("vblsftu", 93));
        map.add(new Position("rtywif", 10));
        map.add(new Position("fgdjfs", 18));
        map.add(new Position("sdagske", 71));

        map.add(new Position("rtueiwod", 98));
        map.add(new Position("lgshkfl", 54));
        map.add(new Position("vbfgjksd", 28));
        map.add(new Position("rteeidhf", 14));
        map.add(new Position("cvdfgsjlld", 17));

        for(int i = 0; i < 20; i++){
            for(int j = 0; j < map.map[i].size; j++){
                System.out.print(map.map[i].get(j).key + ": " + map.map[i].get(j).value + ", ");
            }
            System.out.print("\n");
        }

        /*System.out.println(map.find("agfhksf") + "");
        System.out.println(map.find("fghakd") + "");
        System.out.println(map.find("bdfggf") + "");
        System.out.println(map.find("yioew") + "");
        System.out.println(map.find("vbnxls") + "");

        System.out.println(map.find("dfgaae") + "");
        System.out.println(map.find("vblsftu") + "");
        System.out.println(map.find("rtywif") + "");
        System.out.println(map.find("fgdjfs") + "");
        System.out.println(map.find("sdagske") + "");

        System.out.println(map.find("rtueiwod") + "");
        System.out.println(map.find("lgshkfl") + "");
        System.out.println(map.find("vbfgjksd") + "");
        System.out.println(map.find("rteeidhf") + "");
        System.out.println(map.find("cvdfgsjlld") + "");*/

        System.out.println("--------------------------------");

        map.remove("agfhksf");

        for(int i = 0; i < 20; i++){
            for(int j = 0; j < map.map[i].size; j++){
                System.out.print(map.map[i].get(j).key + ": " + map.map[i].get(j).value + ", ");
            }
            System.out.print("\n");
        }
    }
}

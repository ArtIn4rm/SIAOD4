package com.company;

class HashMap{
    LinkedList<Position>[] map;
    int B;

    HashMap(int B){
        this.map = new LinkedList[B];
        for(int i = 0; i < B; i++){
            map[i] = new LinkedList<>();
        }
        this.B = B;
    }

    int hash(String key){
        int sum = 0;
        for(int i = 0; i < key.length(); i++){
            sum += (int) key.charAt(i);
        }
        return sum % this.B;
    }

    void add(Position pos){
        String key = pos.key;
        int index = hash(key);
        if(map[index].size == 0){
            map[index].add(pos);
        } else {
            boolean isCorrect = false;
            for(int i = 0; i < map[index].size && !isCorrect; i++){
                for(int j = 0; j < map[index].get(i).key.length() && j < key.length(); j++){
                    if(map[index].get(i).key.charAt(j) < key.charAt(j)){
                        if(i+1 == map[index].size){
                            map[index].add(pos);
                            isCorrect = true;
                            break;
                        }
                        if(i+1 < map[index].size && key.charAt(j) < map[index].get(i+1).key.charAt(j)){
                            map[index].add(i+1,pos);
                            isCorrect = true;
                            break;
                        }
                    }
                    if(map[index].get(i).key.charAt(j) != key.charAt(j)){
                        map[index].add(i, pos);
                        isCorrect = true;
                        break;
                    }
                }
            }
        }
    }

    int find(String key){
        int index = hash(key);
        int last = map[index].size / 2;
        boolean isFounded = false;
        while(!isFounded){
            if(key.equals(map[index].get(last).key)){
                return map[index].get(last).value;
            }
            boolean isBigger = false;
            for(int j = 0; j < map[index].get(last).key.length() && j < key.length(); j++){
                if(map[index].get(last).key.charAt(j) < key.charAt(j)){
                    isBigger = true;
                    break;
                }
                if(map[index].get(last).key.charAt(j) != key.charAt(j)){
                    break;
                }
            }
            if(isBigger){
                last = (map[index].size - last)/2 + last;
            } else {
                last = last/2;
            }
            if(last == 0 || last == map[index].size){
                if(key.equals(map[index].get(last).key)){
                    return map[index].get(last).value;
                } else isFounded = true;
            }
        }
        return -10000;
    }

    void remove(String key){
        int index = hash(key);
        int last = map[index].size / 2;
        boolean isFounded = false;
        while(!isFounded){
            if(key.equals(map[index].get(last).key)){
                map[index].remove(last);
                break;
            }
            boolean isBigger = false;
            for(int j = 0; j < map[index].get(last).key.length() && j < key.length(); j++){
                if(map[index].get(last).key.charAt(j) < key.charAt(j)){
                    isBigger = true;
                    break;
                }
                if(map[index].get(last).key.charAt(j) != key.charAt(j)){
                    break;
                }
            }
            if(isBigger){
                last = (map[index].size - last)/2 + last;
            } else {
                last = last/2;
            }
            if(last == 0 || last == map[index].size){
                if(key.equals(map[index].get(last).key)){
                    map[index].remove(last);
                    break;
                } else isFounded = true;
            }
        }
    }

}

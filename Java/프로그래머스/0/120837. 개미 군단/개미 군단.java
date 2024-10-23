enum Ants {
    GENERAL("장군개미", 5),
    SOLDIER("병정개미", 3),
    WORKER("일개미", 1);
    
    private final String name;
    private final int attack;
    
    Ants(String name, int attack){
        this.name = name;
        this.attack = attack;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAttack(){
        return attack;
    }
}
    

class Solution {
    private int readyToAttack(Ants ants, int hp) {
        return hp / ants.getAttack();
    }
    public int solution(int hp) {
        int count = 0;
        
        count += readyToAttack(Ants.GENERAL, hp);
        hp %= Ants.GENERAL.getAttack();
        
        count += readyToAttack(Ants.SOLDIER, hp);
        hp %= Ants.SOLDIER.getAttack();
        
        count += readyToAttack(Ants.WORKER, hp);
        
        return count;
    }
    
    
}
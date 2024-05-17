public class MinHours {
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int out = 0;
        int sum = 0;
        for(int i=0; i<experience.length; i++){
            sum += energy[i];
        }
        if(initialEnergy <= sum) {
            out += sum - initialEnergy + 1;
        }
        int initExperience = initialExperience;

        for(int i=0; i<experience.length; i++){
            if(initExperience < experience[i]){
                out += experience[i]-initExperience+1;
                initExperience = experience[i]+1;
            }else if(initExperience == experience[i]){
                out++;
                initExperience++;
            }
            initExperience += experience[i];
        }
        return out;
    }

    public static void main(String[] args) {
        int[] eng = {1,2,3,4,5,6,7,8,9};
        int[] exp = {1,2,3,1,2,3,1,2,10};
        System.out.println(minNumberOfHours(100,100,eng,exp));
    }
}

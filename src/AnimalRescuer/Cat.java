package AnimalRescuer;

    public class Cat {
    private String color;
   private String weight;
    int ageInMonths = 34;
    String ownerName = "Constantin";
    String race = "Rasa de pisica";
    public String name = "Zeus";
    boolean isMale = true;
    double levelHealth;
    int hungerLevel;
    int moodLevel;
    String favoriteFood;

}

   public  String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void setName(String name){
        this.name = name;
    }
   public String getName(){
        return this.name;
    }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getWeight() {
        return weight;
    }

        public int getAgeInMonths() {
            return ageInMonths;
        }

        public void setAgeInMonths(int ageInMonths) {
            this.ageInMonths = ageInMonths;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public String getRace() {
            return race;
        }

        public void setRace(String race) {
            this.race = race;
        }

        public boolean isMale() {
            return isMale;
        }

        public void setMale(boolean male) {
            isMale = male;
        }

        public double getLevelHealth() {
            return levelHealth;
        }

        public void setLevelHealth(double levelHealth) {
            this.levelHealth = levelHealth;
        }

        public int getHungerLevel() {
            return hungerLevel;
        }

        public void setHungerLevel(int hungerLevel) {
            this.hungerLevel = hungerLevel;
        }

        public int getMoodLevel() {
            return moodLevel;
        }

        public void setMoodLevel(int moodLevel) {
            this.moodLevel = moodLevel;
        }

        public String getFavoriteFood() {
            return favoriteFood;
        }

        public void setFavoriteFood(String favoriteFood) {
            this.favoriteFood = favoriteFood;
        }
    }
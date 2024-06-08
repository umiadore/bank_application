public enum AgeCategory {
    CHILD(0,14),
    TEEN(14,18),
    ADULT(18,65),
    PENSIONER(65, Integer.MAX_VALUE);

    private int startPeriod;
    private int endPeriod;

    public int getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(int startPeriod) {
        this.startPeriod = startPeriod;
    }

    public int getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(int endPeriod) {
        this.endPeriod = endPeriod;
    }

    AgeCategory(int startPeriod, int endPeriod) {
        this.startPeriod = startPeriod;
        this.endPeriod = endPeriod;
    }
    public static AgeCategory getCategoryByAge (int age)  {
        AgeCategory [] categories = AgeCategory.values();
        for (int i = 0; i < categories.length; i++) {
            AgeCategory ageCategory = categories[i];
            if (age >= ageCategory.startPeriod && age < ageCategory.endPeriod)  {
                return ageCategory;
            }
        }
        return null;
    }
}

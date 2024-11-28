package org.college.practise2.task2.p2;

public class DishType {
    private boolean isSweet;
    private boolean isSpicy;
    private boolean isSalt;
    private boolean isHot;
    private boolean isCold;

    public DishType(boolean isSweet, boolean isSpicy, boolean isSalt, boolean isHot, boolean isCold) {
        this.isSweet = isSweet;
        this.isSpicy = isSpicy;
        this.isSalt = isSalt;
        this.isHot = isHot;
        this.isCold = isCold;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }

    public boolean isSalt() {
        return isSalt;
    }

    public void setSalt(boolean salt) {
        isSalt = salt;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }
}

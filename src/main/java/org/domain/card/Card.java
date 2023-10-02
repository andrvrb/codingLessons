package org.domain.card;

import org.exception.MyException;

public class Card {
    Integer num;
    String fio;

    Boolean isActive;


    public void CheckActive() throws MyException {
        if (num>2) {
            System.out.println("Карта сотрудника готова к отображению. " + "Номер удостоверения: " + num);
        } else {
            throw new MyException("Карта сотрудника (номер удостоверения: " + num + ") не готова к отображению! Проверьте правильность введенных данных!");
        }
    }

    public Card(Integer num, Boolean isActive) {
        this.num = num;
        this.isActive = isActive;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

}

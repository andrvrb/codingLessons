package org.domain.card;

import org.exception.MyException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты карточки сотрудника")
class CardTest {

    @Test
    void exceptionTest() {
        Card card = new Card(2, true);
        try {
            card.CheckActive();
        } catch(MyException e) {
            System.out.println(e.getMessage());
        }
    }

}
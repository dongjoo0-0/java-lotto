package lotto;

import lotto.domain.Money;
import lotto.domain.Profit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProfitTest {

    @Test
    @DisplayName("Money 객체 두개를 입력받아 수익률 객체를 생성한다.")
    void create() {
        Assertions.assertThatNoException()
                .isThrownBy(() -> new Profit(new Money(1000), new Money(5000)));
    }

    @Test
    @DisplayName("원금이 0일 경우 예외를 던진다.")
    void validateNotZeroDominator() {
        Money zeroMoney = new Money(0);
        Money profit = new Money(5000);
        Assertions.assertThatThrownBy(() -> new Profit(zeroMoney, profit))
                .isInstanceOf(IllegalArgumentException.class);
    }
}

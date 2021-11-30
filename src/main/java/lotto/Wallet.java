package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Wallet {
    private Money money;
    private final List<Lotto> lottos;

    /*
        CONSTRUCTOR
     */
    public Wallet(int money) {
        this(new Money(money), new ArrayList<>());
    }

    public Wallet(int money, List<Lotto> lottos) {
        this(new Money(money), lottos);
    }

    public Wallet(Money money, List<Lotto> lottos) {
        this.money = money;
        this.lottos = lottos;
    }

    /*
        INTERFACE
     */
    public void buyLotto(Money unitPrice) {
        final int quotient = this.money.quotient(unitPrice);

        for (int i = 0; i < quotient; i++) {
            this.money = this.money.subtract(unitPrice);
            this.lottos.add(new Lotto());
        }
    }

    public void buyLotto(Money unitPrice, List<Integer> manualNumber) {
        this.money = this.money.subtract(unitPrice);
        this.lottos.add(new Lotto(manualNumber));
    }

    public List<Lotto> getLottos() {
        return this.lottos;
    }

    /*
        FUNCTION
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wallet wallet = (Wallet) o;
        return Objects.equals(money, wallet.money) && lottos.size() == lottos.stream().filter(wallet.lottos::contains).count();
    }

    @Override
    public int hashCode() {
        return Objects.hash(money, lottos);
    }
}
package lotto.domain.place;

import java.util.Objects;

public class LottoFirstPlace extends LottoPlace {
  private static final long WIN_MONEY = 2_000_000_000;
  private static final int MATCHED = 6;

  protected LottoFirstPlace(int count) {
    super(count);
  }

  public static LottoPlace create() {
    return new LottoFirstPlace(0);
  }

  @Override
  public LottoPlace win() {
    return new LottoFirstPlace(plusCount());
  }

  @Override
  public boolean matchedLottoNumberCount(int matched) {
    return matched == getMatched();
  }

  @Override
  public int getMatched() {
    return MATCHED;
  }

  @Override
  public long getWinMoney() {
    return WIN_MONEY;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LottoFirstPlace that = (LottoFirstPlace) o;
    return Objects.equals(count, that.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }

  @Override
  public String toString() {
    return "count : " + count + ", winMoney : " + WIN_MONEY;
  }
}
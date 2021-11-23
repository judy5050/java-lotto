package step2_2.domain;

import java.util.Arrays;

public enum LottoReward {

    FIRST(6, 2_000_000_000),
    SECOND(5, 1_500_000),
    THIRD(4, 50_000),
    FOURTH(3, 5_000),
    BANG(0, 0);

    private final long matchCount;
    private final int reward;

    LottoReward(int matchCount, int reward) {
        this.matchCount = matchCount;
        this.reward = reward;
    }

    public static LottoReward fromMatchCount(long matchCount) {
        return Arrays.stream(LottoReward.values())
            .filter(lottoReward -> lottoReward.matchCount == matchCount)
            .findAny()
            .orElse(BANG);
    }

    public int getReward() {
        return reward;
    }

    public long getMatchCount() {
        return matchCount;
    }

    public boolean isWin() {
        return this != BANG;
    }
}
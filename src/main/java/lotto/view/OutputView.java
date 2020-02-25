package lotto.view;

import lotto.domain.WinningPrize;
import lotto.dto.LottoDto;
import lotto.dto.LottoResultDto;
import lotto.dto.LottosDto;

public class OutputView {
	public static void printWrongMoneyInput(Exception e) {
		System.out.println(e.getMessage());
		System.out.println("금액이 정수가 아닙니다. 다시 입력해주세요.");
	}

	public static void printLottoCount(int lottoCount) {
		System.out.println(String.format("%,d개를 구매했습니다.", lottoCount));
	}

	public static void printLottos(LottosDto lottosDto) {
		for (LottoDto lotto : lottosDto.getLottosDto()) {
			System.out.println(lotto.getLottoNumbers().getLottoNumbers());
		}
	}

	public static void printWrongBonusNumberInput(Exception e) {
		System.out.println(e.getMessage());
		System.out.println("정수가 아닌 보너스 번호입니다.");
	}

	public static void printExceptionMessage(IllegalArgumentException e) {
		System.out.println(e.getMessage());
	}

	public static void printLottoResult(LottoResultDto lottoResultDto) {
		for (WinningPrize winningPrize : WinningPrize.values()) {
			System.out.println(
				String.format("%s(%,d원): %d개", winningPrize.getPrizeDescription(), winningPrize.getPrize(),
					lottoResultDto.getWinnerCountMapper().get(winningPrize)));
		}
		System.out.println(String.format("총 수익률: %,d%%", lottoResultDto.getEarningRate()));
	}
}

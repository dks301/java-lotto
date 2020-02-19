# java-lotto
로또 미션 진행을 위한 저장소

## 기능 요구 사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.

## 프로그래밍 요구 사항
* indent의 depth를 1단계로
* else 사용 금지
* 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
* 배열 대신 ArrayList를 사용한다.
* enum을 적용해 구현한다.

## 구현할 기능 목록
* [ ] 구입 금액을 입력하는 기능
    * [ ] **예외** null값이나 빈 값이 들어오는 경우
    * [ ] **예외** 구입 금액이 정수가 아닌 경우
    * [ ] **예외** 천 원 단위가 아닌 경우
    * [ ] **예외** 한 장도 살수 없는 금액인 경우
    
* [ ] 금액으로 로또 장수를 결정하는 기능

* [ ] 로또를 섞는 기능

* [ ] 공 6개를 꺼내는 기능

* [ ] 지난 주 당첨 번호를 입력받는 기능(구분자는 콤마(",")로 구분)
    * [ ] **예외** null값이나 빈 값이 들어오는 경우
    * [ ] **예외** 숫자가 아닌 값이 들어오는 경우
    * [ ] **예외** 번호가 6개가 아닌 경우
    * [ ] **예외** 중복 숫자가 들어오는 경우
    * [ ] **예외** 1에서 45 사이의 숫자가 아닌 경우

* [ ] 보너스 볼을 입력받는 기능
    * [ ] **예외** null값이나 빈 값이 들어오는 경우
    * [ ] **예외** 숫자가 아닌 값이 들어오는 경우
    * [ ] **예외** 중복 숫자가 들어오는 경우
    * [ ] **예외** 1에서 45 사이의 숫자가 아닌 경우


* [ ] 당첨 여부를 판단하는 기능

* [ ] 당첨 통계를 출력하는 기능

* [ ] 총 수익률을 계산하는 기능
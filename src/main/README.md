### 목표 규칙 완성 여부 
 - 한 메서드에 오직 한 단계의 들여쓰기만 한다.
 - else 예약어를 쓰지 않는다.
 - 모든 원시값과 문자열을 포장한다.
 - 줄여쓰지 않는다(축약 금지).
 - 일급 콜렉션을 쓴다.

 ---
 ### 기능 요구사항 정리
 v. LottoMachine & LottoAutoMachine
 - 로또 생성방식을 결정하는 클래스 

 v. LottoShop
 - 로또를 구매할 수 있다. 
 - 구매한 로또를 반환한다.
 
 v.Lotto 
 - LottoNumber를 가진 일급컬렉션 
 - 발급받은 총 6개의 숫자로 이루어진 LottoNumber클래스를 가지고 있다.
 
 v. LottoNumber
 - 로또번호 규칙을 나타내는 클래스 
 
 v.Lottos
 - 발급 받은 모든 로또를 가지고있는 일급컬렉션 
 
 v. PrizeInformation
 - 상금정책을 나타낸다.
 
 v. PrizeLotto
 - 당첨번호를 나타낸다.
 
 v. MachStatus
 - 로또번호 매칭 상태를 나타내는 값 객체
 
 v. LottoPrice
 - 로또 가격은 개당 1000원
 - 최소금액 1000원
 
 v. Reward
 - 구매한 로또가 당첨번호와 일치하는지 확인한다. 
 - 일치여부에 따라 상금이 주어진다. 
 
 
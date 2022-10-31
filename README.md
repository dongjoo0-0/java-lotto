# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 1단계 - 문자열 계산기 기능 요구사항
* 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
* 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.
* 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
* 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
* 예를 들어 2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

### 1단계 기능 분리
* 덧셈을 한다.
* 뺄셈을 한다.
* 곱하기를 한다.
* 나누기를 한다.
* 문자열을 문자 배열로 변경 한다.
* 문자가 숫자인 경우 계산을 한다.
    * 숫자가 0인 경우 합산을 한다.
    * 숫자가 0이 아닌 경우 계산기로 계산을 한다.
* 문자가 사칙연산 기호면 그에 맞는 계산기를 제공한다.
* 더이상 배열이 없을경우 결과를 반환 한다.

## 2단계 기능 요구사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.
* 당첨 번호를 입력하면 당첨 통계를 보여 준다.

## 2단계 기능 분리
* 금액 만큼 로또를 제공해 주는 기능 개발.
* 로또 출력시 1-45 사이의 숫자가 중복되지 않는 로또 발급.
* 로또에 당첨번호 일치 갯수 확인 기능 개발.
* 갯수당 가격 산정
* 당첨 총액 대비 수익률 비교 개발.
```shell
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```


## 3단계 기능 분리
* 로또를 수동으로 입력받을 수 있는 기능 구현.
  * 로또 상점에 수동 구입 갯수를 입력
  * 수동구입 번호를 받아서 로또 생성
  * 받은 금액분 - 수동구입분 하여 잔여 복권 구매
  * 수동구입 추가 가능 여부 확인 로직 추가.
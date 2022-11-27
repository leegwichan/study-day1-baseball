# 구현할 기능 목록

### InputView
- [ ] 야구 게임 숫자를 입력 받음
  - 숫자가 아닐 경우, `IllegalArgumentException` 에러를 발생시킴
- [ ] 재시작을 여부를 입력 받음
  - 입력 형식 (1 또는 2)이 일치하지 않을 경우 `IllegalArgumentException` 에러를 발생시킴

### OutputView
- [ ] 입력한 수의 결과를 볼, 스트라이크로 표시하는 기능
  - 하나도 없을 경우 "낫싱"으로 표기

- [ ] 다 맞추었을 때 게임 종료를 표기하는 기능

### BaseballApplication
- [ ] 전반적인 실행 로직 구현

### Answer : 정답을 가지고 있음
- [ ] 생성시에 자동으로 값을 생성하는 기능
- [ ] List<Number>로 field 값을 가지게 함
- [ ] NumberList로 주었을 때 얼마나 일치하는지 정보를 넘기는 기능

### Question : 입력한 값을 가지고 있음
- [ ] 생성시에 숫자가 중복되지 않았는지 판단함
    - 그렇지 않으면 `IllegalArgumentException`을 발생시킴
- [ ] List<Number>로 field 값을 가지게 함
- [ ] 현재 가지고 있는 List<Number>를 제공하는 기능

### Number : 숫자 한 자리씩을 담당함
- [x] 생성시에 1부터 9사이의 숫자인지 확인함
  - 그렇지 않으면 `IllegalArgumentException`을 발생시킴
- [ ] 가지고 있는 숫자와 값이 일치하는지 확인하는 기능
- [ ] 가지고 있는 값을 제공하는 기능

### BaseballGame
- [ ] 해당 객체 생성시에 Answer를 생성함
- [ ] 
- [ ] 값을 비교하여 결과값을 

### BaseballFactory

- [ ] : field 값으로 받는 숫자 개수 등의 값을 가지고 있음
- [ ] : 그 값에 따라 Answer를 생성함
- 추후 수정 예정
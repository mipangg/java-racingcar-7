# 미션 2. 자동차 경주

---

## 구현 기능 목록

---

### 1. 유저에게 입력 받기
- 경주할 자동차 이름
    - 쉼표(,)를 기준으로 구분
      1. 입력된 이름이 없는 경우
         - IllegalArgumentException 발생
      2. 입력된 이름이 1 개일 경우
         - 혼자서 경주 진행
      3. 입력된 이름이 2 개 이상일 경우
         - 모두 경주 진행
    - 각자의 이름은 5 자 이하만 가능
      1. 6 자 이상일 경우
         - IllegalArgumentException 발생
      2. 빈칸일 경우
         - IllegalArgumentException 발생
- 자동차 경주를 시도할 횟수
    1. 음수일 경우
       - IllegalArgumentException 발생
    2. 0 일 경우
       - 경주를 진행하지 않고 종료
    3. 입력된 값이 숫자가 아닌 경우
       - IllegalArgumentException 발생
  

### 2. 자동차 경주 게임 실행
- 입력된 횟수만큼 경기 진행
  - 0 ~ 9 사이의 무작위 값을 구함
    1. 값이 4 이상인 경우
        - 전진하는 것으로 값을 저장
    2. 값이 4보다 작을 경우
        - 전진하지 않는 것으로 값을 저장
- 각 사용자들이 전진한 횟수를 비교하여 가장 큰 값을 찾음

### 3. 우승자 출력
1. 입력된 이름이 2 개 이상, 시도한 횟수가 1 회 이상인 경우
   - 전진한 횟수가 가장 많은 사용자, 즉 우승자를 출력
2. 입력된 이름이 1 개인 경우
    - 입력된 1 명을 우승자로, 실행 결과와 함께 출력
3. 시도한 횟수가 0일 경우
    - '실행 결과', '최종 우승자 : ' 타이틀만 출력하고 결과는 출력되지 않음

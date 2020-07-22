# MyDiary

## 0. 기술 사용

- Front-End : IOS
- Back-End : Spring boot, AWS EC2, Nginx, Firebase
## 1. 기획서

### 1.1. 기획의도

- IOS를 공부하면서 Spring boot를 활용해 서버에 저장하는 시스템

## 2. 작업 컨벤션

### 2. 1 Jira Naming Convention

- **[Front-end] or [Back-end] 앞에 쓰기**
- **에픽을 계층적으로 생성해서 할당하기**
- 예시
  - 에픽네이밍 :` [Front-End][Css관리]`
  - 작업네이밍 : `[Front-End][React Component]지도`

### 2. 2 Branch Naming Convention

- 혼자 프로젝트 하므로 브런치를 작성하지 않는다.

### 2.3 Git Commit Naming Convention

- 다음과 같은 prefix를 붙이고 뒤에 추가 설명을 쓴다.
- prefix
  - feat : 새로운 기능 추가
  - fix : 버그 수정
  - docs : 문서 수정
  - style : 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
  - refactor : 코드 리펙토링
  - test : 테스트 코드, 리펙토링 테스트 코드 추가
  - chore : 빌드 업무 수정, 패키지 매니저 수정
- 예시
  - `refactor: ui 개선`
  - `style: 지도 컴포넌트 css 작업`
  - `feat : 회원가입 폼 추가`

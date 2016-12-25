
ex14) 서비스앱 제작
고객에게 제공할 앱에 대한 작업을 진행하였다
각종 여러가지 ui로 데이터를 출력할 수 있다

### 20161225-7
>레이아웃 디폴트 표시 데이터 편집

### 20161225-6
>현제 나의 스탬프를 보는 화면에서 쿠폰<->스탬프를 전환하는 버튼 이벤트를 추가하였다

### 20161225-5
>셋팅 버튼을 누르면 스낵바가 뜨도록 추가하여 어디서 이벤트를 처리해야할 지 알 수 있게끔 해놨다

### 20161225-4
>처음으로 보여주는 탭 번호 변경, 등록된 상점 클릭하면 화면이동

### 20161225-3
>매장 선택화면에서 각 버튼 이벤트 추가

### 20161225-2
>공지리스트 변수 명 변경

### 20161225-1
>상점 리스트를 보는 레이아웃의 각 버튼이나 이미지뷰 등의 아이디를 유지보수 하기 쉬운 이름으로 변경하여 난독화를 줄였다

### 20161225
>메리크리스마스 ㅠㅜ

### 20161212
>ex13예제의 데이터베이스 이동 부분을 디버깅 시에는 무조건 새로운 데이터베이스 파일로 옮기도록 수정하였다

### 20161211-1
>팝업이 뜨면 자동으로 키보드가 뜨도록 수정하였다

### 20161211
>저장되어 있는 상점들중 찾으려는 상점에 대한 정보를 조금씩 쓸때마다 리스트에 비슷한걸 찾은 결과를 갱신해서 출력하는 솔류션 구현

### 20161210-3
>등록된 상점들 중 하나를 택해서 세부 정보를 볼때 해당 매점이 위치한 정보가 정상적으로 출력되도록 수정하였다

### 20161210-2
>사용자가 등록한 상점의 정보를 출력하는 ui에 지도를 작은 사이즈로 출력하도록 수정하였다
>지도를 불러오는데 문제가 있던 부분을 수정하였다. 앱이 작동하는 디바이스의 안드로이드 버전을 float로 저장한게 문제였다. 따라서 sdk버전을 int형으로 저장하도록 수정하였다
>fragment끼리 데이터를 주고 받기 위해 bundle을 사용했다

### 20161210-1
>테스트 데이터를 제공하는 클레스를 따로 만들어 어플리케이션이 정상작동하는지 테스트 하고 있다
>지도에 getMapAsync메소드가 널인 오류가 존재함을 발견했다

### 20161210
>신규 추가 팝업이 뜨며, 검색란에 뭐든 작성을 하면 그 이벤트를 잡아낼 수 있다
>갤럭시s2에 안드로이드 마쉬멜로를 포팅하여 기기에 직접 테스트를 할 수 있게 됬다

### 20161206-2
>google map을 연동하여 상점의 위치를 알려주는 예제를 구현하려 했으나 가상머신에 깔린 google play services 버전이 낮아 테스트할 수 없었다

### 20161206-1
>구글 맵을 연동하기 전 앱 도메인을 변경하기 위해 안드로이드 스튜디오의 기능을 사용하였는데 잘 작동하지 않아 새로운 프로젝트를 만들어 소스들을 다시 셋팅하였다

### 20161206
>깃허브에 올리기위해 작업한 내용이 담긴 디렉토리를 옮기는 명령어와 깃허브에서 받은 최신 데이터를 가져오는 명령어를 매번 치기가 귀찮아서 쉘스크립트를 추가로 구현하였다

>오늘 같이 모여서 알게 되었는데 나의 소스를 참고하는 팀원이 있어 주석을 약간 추가하였다. 또한 디자인파트에서 작업해준 내용을 토데로 상점의 정보를 나타내는 ui를 구현하기 위해 탭을 하나 더 추가하였다

### 20161204
>디자이너가 작업한 기본 ui틀에 따라 신규 매장 추가 버튼을 플롯팅 버튼에서 리스트뷰의 아이템으로 대체하였다

### 20161202
>앱 실행 로딩 화면을 출력과 사용자 정보 입력화면을 출력하는 예제를 추가로 구현하였다

### 20161201
>햄버거 매뉴에 해당 사용자의 정보가 뜨며, 등록된 상점의 스탬프 현황을 한줄에 5개씩 정렬하여 출력할 수 있다

### 20161130
>fragment ui를 각 탭마다 다른 ui를 뷰할 수 있도록 추가 구현하였다

ex13) SQLite 사용 예제

본 예제는 Mariadb에서 생성한 데이터베이스 파일을  SQLite의 .db파일을 안드로이드 프로젝트에 그데로 사용하는 예제이다.

필요한 준비물
  - Mariadb에서 모델링한 데이터베이스
  - 안드로이드 프로젝트

프로젝트 내용 요약:
  - SQLiteDatabaseControl패키지에서 데이터베이스 초기화 또는 불러오기 기능이 구현되어 있음
  - 메인 Class인 SQLiteManager에서 위의 패키지를 사용하는 방법에 대한 소스가 작성되어 있음
  - .db에 저장되어 있던 내용을 불러와서 로그에 출력함
=======
# 클라이언트 데이터베이스 모델링

## 작업내용

>mysql workbench로 모델링한 내용을 sqlite데이터베이스에 적용시켜 .db파일로 추출함
임베디드 기기인 안드로이드 디바이스에도 데이터베이스를 사용할 목적으로 제작함

## 사용한 툴
>phpmyadmin, db browser for sqlite, mysql workbench

## 파일 설명

CustomerDatabase:
- Log.txt 는 mariadb 기준의 sql문을 sqlite로 변환하면서 변경된 내용이 저장되어있음
- .mwb 는 workbench로 모델링한 파일
- .sql 는 phpmyadmin에서 데이터베이스에 적용된 쿼리 내용들
- .db 는 sqlite로 모델링된 파일

ShopkeeperDatabase:
- 위와 동일 찡긋

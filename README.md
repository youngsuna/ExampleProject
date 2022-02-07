# ExampleProject

구성요소
1. Server
 - ServerApplication : Eureka 서버 기동
2. Client 1
 - Client1Application : eureka 클라이언트 등록
 - DiscoveryController : 서버에 등록된 클라이언트 확인 API (http://localhost:8011/services)
 - DiscoveryService : client2 호출 메소드 구현

3. Client 2
 - Client2Application : eureka 클라이언트 등록
 - DeliveryService : 데이터 리스트 
 - DeliveryController : 데이터리스트 get

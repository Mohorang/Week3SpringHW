# Week3SpringHW

**1. 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)**<br>
수정 삭제의 API의 리퀘스트 방식은 @RequestBody를 이용하였습니다. id와 패스워드,수정내용이 담긴 body를 데이터로서 서버가 받으면<br>
해당id를 가진 Entity와 Dto에 담긴 view에서 입력한 패스워드를 비교하여 일치시 Dto에 담긴 수정내용대로 entity를 수정했습니다. <br>
삭제API의 경우 패스워드를 수정과 같은 방식으로 패스워드를 비교하고 일치시 해당 id의 내용들을 삭제하는 식으로 삭제 API를 구현햇습니다.<br>

**2. 어떤 상황에 어떤 방식의 request를 써야하나요?<br>**
주고받는 데이터가 json형식일 때에는 @RequestBody를 사용하는것이 편리햇습니다.<br>
특히 @RequestBody는 자동으로 해당 Dto의 내용들로 객체를 생성해주기 때문에 더욱 편햇습니다.<br>
param의 경우에는 특정 변수만 받아올 때 사용하면 좋을 것 같습니다.<br>

**3. RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?**<br>
RESTful하다의 의미도 솔직히 완전히 이해하지 못햇습니다.<br> 이해한범위에서 RESTful하다라는건 **POST,PUT,DELETE,GET**의 메소드들을<br>
적재적소에 사용한다 정도로 이해하였기에 Entity에 새로운 요소들을 넣어줄때에는 **POST**,<br>
데이터를 요청할때에는 **GET** <br>
수정을 할 때에는 **PUT** <br>
삭제가 하고 싶을때에는 DELETE를 사용하는하여 제가 생각한 범위에서의 RESTful한 API설계는 작성하였다고 생각합니다.

package common.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDAO {
    protected  Log log = LogFactory.getLog(AbstractDAO.class);

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    // bean 등록이 되면 static으로 쓸 수 있는것 같다. 정의가 어디에 되어있는지!! bean이 뭔지 점점 알아가는 것 같다
    // 이거 안된 이유는 1차로 web.xml에서 dao-context.xml 를 못불러왔다 오타로 인해 param-name랑 param-value를 써야하는데 param-value만 2개!!!


}

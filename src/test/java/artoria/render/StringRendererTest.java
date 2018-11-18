package artoria.render;

import artoria.logging.Logger;
import artoria.logging.LoggerFactory;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StringRendererTest {
    private static Logger log = LoggerFactory.getLogger(StringRendererTest.class);
    private Map<String, Object> data = new HashMap<String, Object>();

    @Before
    public void init() {
        data.put("hello", "world");
        data.put("hello1", new Object());
    }

    @Test
    public void test1() throws Exception {
        String tmp = "hello, ${hello}! \n" +
                "hello, ${hello1}! \n" +
                "hello, ${hello2}! \n" +
                "${hello}${hello}.";
        String result = StringRenderUtils.renderToString(data, "test1", tmp);
        log.info(result);
    }

}

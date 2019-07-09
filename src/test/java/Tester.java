import com.live.Animal;
import com.live.Dog;
import com.live.Zoo;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class Tester {
    
    @Test 
    public void testZoo() {
        Animal zoo  = new Dog("test");
        Assert.assertThat(zoo.getName(), Is.is("test"));
    }
}

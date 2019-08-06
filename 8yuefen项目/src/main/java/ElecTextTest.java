import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;



/**
 * @ProjectName: 8yuefen项目
 * @Package: PACKAGE_NAME
 * @ClassName: ElecTextTest
 * @Description: java类作用描述
 * @Author: layker
 * @CreateDate: 2019/8/5 1:21
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/8/5 1:21
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @version: $
 */
@RunWith(Arquillian.class)
public class ElecTextTest {


    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class).addClass(com.houhong.entry.ElecText.class).addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Deployment
    public static JavaArchive createDeployment1() {
        return ShrinkWrap.create(JavaArchive.class).addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getTextID() {
    }

    @org.junit.Test
    public void setTextID() {
    }

    @org.junit.Test
    public void getTextName() {
    }

    @org.junit.Test
    public void setTextName() {
    }

    @org.junit.Test
    public void getTextDate() {
    }

    @org.junit.Test
    public void setTextDate() {
    }

    @org.junit.Test
    public void getTextRemark() {
    }

    @org.junit.Test
    public void setTextRemark() {
    }
}

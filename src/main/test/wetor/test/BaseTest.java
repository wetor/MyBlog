package wetor.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.wetor.service.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BaseTest {
    @Autowired
    public IUserService userService;
    @Autowired
    public IArticleService articleService;
    @Autowired
    public ITagService tagService;
    @Autowired
    public ITagMapService tagMapService;
    @Autowired
    public ICommentService commentService;
    @Autowired
    public IGroupService groupService;
}

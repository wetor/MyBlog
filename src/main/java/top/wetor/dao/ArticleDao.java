package top.wetor.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.wetor.domain.Article;

import java.util.List;

@Component
@Mapper
public interface ArticleDao {
    /**
     * 新建文章
     * @param article 文章
     */
    void insertArticle(Article article);
    /**
     * 通过id删除文章
     * @param id id
     */
    void deleteArticleById(Integer id);

    /**
     * 修改文章信息
     * @param article 文章
     */
    void updateArticle(Article article);
    /**
     * 通过id查询文章
     * @param id id
     * @param contentShow null/0:极简(不含文章内容) 1:简略(含文章内容摘要) 2:完整(包含文章内容)
     * @return 文章
     */
    Article selectArticleById(@Param("id")Integer id, @Param("contentShow")Integer contentShow);

    /**
     * 查询即将插入的文章id
     * @return 文章id
     */
    Integer selectNextArticleId();
    /**
     * 查询文章数
     * @param stateShow 0:一般 1:置顶 2:隐藏 3:删除 4:用户(一般+置顶) 5:用户(一般+置顶+隐藏)
     * @return 文章数
     */
    Integer selectArticleCount(@Param("stateShow")Integer stateShow);
    /**
     * 查询按时间排序的一定数量文章
     * @param begin 开始序号，从0开始
     * @param number 个数
     * @param contentShow null/0:极简(不含文章内容) 1:简略(含文章内容摘要) 2:完整(包含文章内容)
     * @param stateShow 0:一般 1:置顶 2:隐藏 3:删除 4:用户(一般+置顶) 5:用户(一般+置顶+隐藏)
     * @param asc 是否正序排列(由旧到新)
     * @return 文章列表
     */
    List<Article> selectArticlePage(@Param("begin") Integer begin, @Param("number")Integer number, @Param("contentShow")Integer contentShow, @Param("stateShow")Integer stateShow, @Param("asc")Boolean asc);

    /**
     * 查询全部文章
     * @param contentShow null/0:极简(不含文章内容) 1:简略(含文章内容摘要) 2:完整(包含文章内容)
     * @param stateShow 0:一般 1:置顶 2:隐藏 3:删除 4:用户(一般+置顶) 5:用户(一般+置顶+隐藏)
     * @return 全部文章列表
     */
    List<Article> selectArticleAll(@Param("contentShow")Integer contentShow, @Param("stateShow")Integer stateShow, @Param("asc")Boolean asc);
    /**
     * 查询属于指定对象的全部文章
     * @param bean 0:User  1:Group  2:Tag
     * @param id id
     * @param contentShow null/0:极简(不含文章内容) 1:简略(含文章内容摘要) 2:完整(包含文章内容)
     * @param stateShow 0:一般 1:置顶 2:隐藏 3:删除 4:用户(一般+置顶) 5:用户(一般+置顶+隐藏)
     * @param asc 是否正序排列(由旧到新)
     * @return 全部文章列表
     */
    List<Article> selectArticleAllByType(@Param("bean")Integer bean,@Param("id")Integer id, @Param("contentShow")Integer contentShow, @Param("stateShow")Integer stateShow, @Param("asc")Boolean asc);
    /**
     * 查询属于指定对象的一定数量文章
     * @param bean 0:User  1:Group  2:Tag
     * @param id id
     * @param begin 开始序号，从0开始
     * @param number 个数
     * @param contentShow null/0:极简(不含文章内容) 1:简略(含文章内容摘要) 2:完整(包含文章内容)
     * @param stateShow 0:一般 1:置顶 2:隐藏 3:删除 4:用户(一般+置顶) 5:用户(一般+置顶+隐藏)
     * @param asc 是否正序排列(由旧到新)
     * @return 文章列表
     */
    List<Article> selectArticlePageByType(@Param("bean")Integer bean,@Param("id")Integer id, @Param("begin") Integer begin, @Param("number")Integer number, @Param("contentShow")Integer contentShow, @Param("stateShow")Integer stateShow, @Param("asc")Boolean asc);

}

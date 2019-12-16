package top.wetor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wetor.dao.TagMapDao;
import top.wetor.domain.Article;
import top.wetor.domain.Tag;
import top.wetor.service.ITagMapService;

import java.util.List;
@Service("tagMapService")
public class TagMapService implements ITagMapService {
    @Autowired
    private TagMapDao tagMapDao;

    @Override
    public void insertTagMap(TagMapDao tagMap) {
        tagMapDao.insertTagMap(tagMap);
    }

    @Override
    public void insertTagMapByArticle(Integer a_id, String tags) {
        tagMapDao.insertTagMapByArticle(a_id, tags);
    }

    @Override
    public void deleteTagMapByArticleId(Integer a_id) {
        tagMapDao.deleteTagMapByArticleId(a_id);
    }

    @Override
    public List<Tag> selectTagByArticleId(Integer a_id) {
        return tagMapDao.selectTagByArticleId(a_id);
    }

    @Override
    public List<Article> selectArticleByTagId(Integer t_id, Integer mode, Boolean asc) {
        return tagMapDao.selectArticleByTagId(t_id, mode, asc);
    }
}

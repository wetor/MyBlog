package top.wetor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wetor.dao.TagDao;
import top.wetor.domain.Tag;
import top.wetor.service.ITagService;

import java.util.List;
@Service("tagService")
public class TagService implements ITagService {
    @Autowired
    private TagDao tagDao;

    @Override
    public void insertTag(Tag tag) {
        tagDao.insertTag(tag);
    }

    @Override
    public void deleteTagById(Integer id) {
        tagDao.deleteTagById(id);
    }

    @Override
    public void deleteTagByString(String tags) {
        tagDao.deleteTagByString(tags);
    }

    @Override
    public void updateTagByString(String tags) {
        tagDao.updateTagByString(tags);
    }

    @Override
    public void updateTagAll(List<String> list) {
        tagDao.updateTagAll(list);
    }

    @Override
    public Tag selectTagById(Integer id) {
        return tagDao.selectTagById(id);
    }

    @Override
    public Tag selectTagByContent(String content) {
        return tagDao.selectTagByContent(content);
    }

    @Override
    public Integer selectTagCount() {
        return tagDao.selectTagCount();
    }
}

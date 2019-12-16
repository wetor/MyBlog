package top.wetor.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wetor.dao.GroupDao;
import top.wetor.domain.Group;
import top.wetor.service.IGroupService;

import java.util.List;
@Service("groupService")
public class GroupService implements IGroupService {
    @Autowired
    private GroupDao groupDao;

    @Override
    public void insertGroup(Group group) {
        groupDao.insertGroup(group);
    }

    @Override
    public void deleteGroupById(Integer id) {
        groupDao.deleteGroupById(id);
    }

    @Override
    public void updateGroup(Group group) {
        groupDao.updateGroup(group);
    }

    @Override
    public Group selectGroupById(Integer id) {
        return groupDao.selectGroupById(id);
    }

    @Override
    public Integer selectGroupArticleCountById(Integer id) {
        return groupDao.selectGroupArticleCountById(id);
    }

    @Override
    public Integer selectGroupCount() {
        return groupDao.selectGroupCount();
    }

    @Override
    public List<Group> selectGroupPage(Integer begin, Integer number) {
        return groupDao.selectGroupPage(begin, number);
    }

    @Override
    public List<Group> selectGroupAll() {
        return groupDao.selectGroupAll();
    }
}

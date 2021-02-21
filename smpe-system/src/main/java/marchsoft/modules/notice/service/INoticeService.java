package marchsoft.modules.notice.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import marchsoft.base.PageVO;
import marchsoft.modules.notice.entity.Notice;
import marchsoft.base.IBasicService;
import marchsoft.modules.notice.entity.dto.NoticeQueryCriteria;

import java.util.Set;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangmingcan
 * @since 2021-02-19
 */
public interface INoticeService extends IBasicService<Notice> {

    /**
     * @author Wangmingcan
     * @date 2021-02-19 11:15
     * @param criteria
     * @param pageVO
     * @return IPage<Notice>
     * @description 查询通知模板
     */
    IPage<Notice> queryAll(NoticeQueryCriteria criteria, PageVO pageVO);


    /**
     * @author Wangmingcan
     * @date 15:27
     * @param resources
     * @return void
     * @description 新增通知模板
     */
    void create(Notice resources);

    /**
     * @author Wangmingcan
     * @date 2021-02-21 15:33
     * @param resources
     * @return void
     * @description 修改通知模板
     */
    void update(Notice resources);

    /**
     * @author Wangmingcan
     * @date 2021-02-21 15:44
     * @param ids
     * @return
     * @description 验证通知模板是否被关联
     */
    void verification(Set<Long> ids);

    /**
     * @author Wangmingcan
     * @date 2021-02-21 15:44
     * @param ids
     * @return
     * @description 删除通知模板
     */
    void delete(Set<Long> ids);

}

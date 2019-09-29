package cn.mj.util;

import cn.mj.pojo.PageRequest;
import cn.mj.pojo.PageResult;

public interface CurdSrvice<T> {
    /**
     *
     * @param record
     * 保存操作
     */
    int save(T record);

    /**
     *
     * @param record
     * 删除操作
     */
    int delete(T record);

    /**
     *
     * @param id
     * 根据ID查询
     */
    int findById(Long id);

    /**
     *
     * @param pageRequest
     * 分页查询
     * 这里统一封装了分页请求和结果，避免直接引入具体框架的分页 对象，
     * 如Mybatis或JPA的分页对象从而避免因为替换ORM框架而导致服务层、
     * 控制层的分页接口也需要变动的情况，替换ORM框架也不会影响服务层
     * 以上的分页接口，起到了解耦的作用
     *
     */
    PageResult findPage(PageRequest pageRequest);
}

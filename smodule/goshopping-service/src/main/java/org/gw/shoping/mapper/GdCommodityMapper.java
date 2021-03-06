package org.gw.shoping.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.fresh.gd.commons.consts.pojo.dto.shoping.*;
import org.gw.shoping.entity.GdCommodity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.security.access.method.P;

import java.util.List;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author guowei.zhang
 * @since 2019-04-12
 */
@Mapper
public interface GdCommodityMapper extends BaseMapper<GdCommodity> {

    /**
     * 功能描述
     * 用户展示
     *
     * @param
     * @return java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>
     * @author zgw
     */
    @Select("select * from gd_commodity")
    List<GdCommodityDTO> selShopAllUser();

    /**
     * 功能描述
     * Admin管理 商品信息 带分页
     *
     * @param page
     * @return java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityDTO>
     * @author zgw
     */
    List<GdCommodityDTO> selShopAllAdmin(Page<GdCommodityDTO> page, @Param("comdityname") String comdityname, @Param
            ("storeid") Integer storeid, @Param("") Integer comditytypeId);

    /**
     * 功能描述:
     * 微信客户端首页活动标题及显示商品4条商品
     *
     * @param: [参数暂定]
     * @return: java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO>
     * @auther: 贾轶飞
     * @date: 2019/4/26 15:05
     */
    List<GdCommodityListDTO> selheadlineAll();

    /**
     * 功能描述:
     * 单个商品描述
     *
     * @param: [comdityId]商品id
     * @return: org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO
     * @auther: 贾轶飞
     * @date: 2019/4/26 15:08
     */
    GdCommodityListDTO selOne(@Param("comdityId") Integer comdityId);

    /**
     * 功能描述:
     * 根据商品分类查询商品
     *
     * @param: [tid]
     * @return: java.util.List<org.gw.shoping.entity.GdCommodity>
     * @auther: 郭家恒
     * @date: 2019/4/26 15:12
     */
    List<GdCommodityDTO> QueryComByType(@Param("tid") Integer tid);


    /** 功能描述:
    *客户端显示全部页面所有商品类型id查询
    * @param: [typeid]商品的类型id
    * @return: java.util.List<org.fresh.gd.commons.consts.pojo.dto.shoping.GdCommodityListDTO>
    * @auther: 贾轶飞
    * @date: 2019/4/26 15:10
    */
//    List<GdCommodityListDTO> wsSelAll(@Param("typeid")String typeid);

    List<GdinventoryallDTO> nventoryallmap(GdComditynameDTO gdComditynameDTO);

    @Select("select * from gd_commodity g,gd_activities a where g.activityId=a.activityId and g.activityId=#{activityId}")
    List<GdActivitiesAndShopDTO> selGdActivAndShop(@Param("activityId") Integer activityId);


    List<GdActivitiesAndShopDTO> selGdActivAndShopLike(@Param("comdityname") String comdityname);



}

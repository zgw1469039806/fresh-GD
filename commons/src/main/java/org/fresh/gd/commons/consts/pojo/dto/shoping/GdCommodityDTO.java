package org.fresh.gd.commons.consts.pojo.dto.shoping;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-21 11:19
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@ApiModel("商品信息数据模型")
@Data
public class GdCommodityDTO {

    /**
     * 商品ID
     */
    @ApiModelProperty("商品ID")
    private Integer comdityId;

    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    private String comdityname;

    /**
     * 商品类别
     */
    @ApiModelProperty("商品类别")
    private Integer comditytypeId;

    /**
     * 商品单位
     */
    @ApiModelProperty("商品单位")
    private String comditydw;

    /**
     * 商品描述
     */
    @ApiModelProperty("商品描述")
    private String comditydescribe;

    /**
     * 商品单价
     */
    @ApiModelProperty("商品单价")
    private String comdityprice;


    /**
     * 是否打折;0为false,2为true
     */
    @ApiModelProperty("是否打折")
    private Integer isnodiscount;

    /**
     * 库存数量
     */
    @ApiModelProperty("库存数量")
    private String stock;

    /**
     * 对应积分
     */
    @ApiModelProperty("对应积分")
    private String corresponding;

    /**
     * 所属店铺ID
     */
    @ApiModelProperty("所属店铺ID")
    private Integer storeid;


    @ApiModelProperty("页码")
    private Integer pageNo;

    @ApiModelProperty("所属门店名")
    private String ssmdName;

}

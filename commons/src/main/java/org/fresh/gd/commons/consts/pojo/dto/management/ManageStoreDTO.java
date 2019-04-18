package org.fresh.gd.commons.consts.pojo.dto.management;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @DATA 2019-04-17 14:42
 * @Author 张国伟  WeChat:17630376104
 * @Description 门店图片数据模型
 */
@ApiModel("门店图片数据模型")
@Data
public class ManageStoreDTO {



    @ApiModelProperty("店铺ID")
    private Integer storeid;


    @ApiModelProperty("店铺名称")
    private String storename;


    @ApiModelProperty("店铺地址")
    private String storeaddress;



    @ApiModelProperty("图片链接")
    private String storeImages;



}

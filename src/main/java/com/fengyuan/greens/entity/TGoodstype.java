package com.fengyuan.greens.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
@TableName("t_goodstype")
public class TGoodstype extends Model<TGoodstype> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String typename;
	private Integer typeflag;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public Integer getTypeflag() {
		return typeflag;
	}

	public void setTypeflag(Integer typeflag) {
		this.typeflag = typeflag;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}

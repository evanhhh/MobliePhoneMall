package com.ppx.hellomall.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 测试类 图书
 * </p>
 *
 * @author hucongting
 * @since 2018-08-31
 */
public class Bookinfo extends Model<Bookinfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 关联图书类型主键
     */
	private Integer btid;
    /**
     * 图书名
     */
	private String bookname;
    /**
     * 图书简介
     */
	private String bookdesc;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBtid() {
		return btid;
	}

	public void setBtid(Integer btid) {
		this.btid = btid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookdesc() {
		return bookdesc;
	}

	public void setBookdesc(String bookdesc) {
		this.bookdesc = bookdesc;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}
	
	public Bookinfo() {
		super();
	}

	public Bookinfo(Integer id, Integer btid, String bookname, String bookdesc) {
		super();
		this.id = id;
		this.btid = btid;
		this.bookname = bookname;
		this.bookdesc = bookdesc;
	}

	@Override
	public String toString() {
		return "Bookinfo [id=" + id + ", btid=" + btid + ", bookname=" + bookname + ", bookdesc=" + bookdesc + "]";
	}

	
	
}

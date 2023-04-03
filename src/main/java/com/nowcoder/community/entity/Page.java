package com.nowcoder.community.entity;

import lombok.Data;

/**
 * @Description: 分页信息
 * @Author: cckong
 * @Date:
 */
@Data
public class Page {
    private int current=1;//当前页码
    private int limit=10;//每页内容上限

    private int rows;//数据总数 总页数
    private String path;//查询路径 分页链接

    public void setCurrent(int current) {
        if(current>=1){
            this.current = current;

        }
    }

    public void setLimit(int limit) {
        if(limit>=1&&limit<=100){
            this.limit = limit;
        }

    }

    public void setRows(int rows) {
        if(rows>=0){
            this.rows = rows;
        }

    }
    //获取当前页的起始行
    public int getOffset(){
        return (current-1)*limit;
    }
    //获取总页数
    public int getTotal(){
        if(rows%limit==0){
            return rows/limit;
        }else{
            return rows/limit+1;
        }
    }
    //获取起始页码 保证在当前页码 左有2页面 右有2页面
    public int getFrom(){
        int from=current-2;
        return from<1?1:from;
    }


    //获取结束页码
    public int getTo(){
        int to=current+2;
        int total=getTotal();
        return to>total?total:to;
    }
}

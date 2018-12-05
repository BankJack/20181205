package test2;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式
 */
public class Data {
    private Data(){}

    private static Data instance = new Data();

    public static Data getInstance(){
        return instance;
    }

    /**
     * 初始化数据
     * @return
     */
    public Map<String,WorldCup> getData(){
        Map<String,WorldCup> map = new HashMap<>();
        WorldCup cup1 = new WorldCup("第一届","1930年","乌拉圭","乌拉圭");
        WorldCup cup2 = new WorldCup("第二届","1934年","意大利","意大利");
        WorldCup cup3 = new WorldCup("第三届","1938年","法国","意大利");
        WorldCup cup4 = new WorldCup("第四届","1950年","巴西","乌拉圭");
        WorldCup cup5 = new WorldCup("第五届","1954年","瑞士","西德");
        WorldCup cup6 = new WorldCup("第六届","1958年","瑞典","巴西");
        WorldCup cup7 = new WorldCup("第七届","1962年","智利","巴西");
        WorldCup cup8 = new WorldCup("第八届","1966年","英格兰","英格兰");
        WorldCup cup9 = new WorldCup("第九届","1970年","墨西哥","巴西");
        WorldCup cup10 = new WorldCup("第十届","1974年","前西德","西德");
        WorldCup cup11 = new WorldCup("第十一届","1978年","阿根廷","阿根廷");
        WorldCup cup12 = new WorldCup("第十二届","1982年","西班牙","意大利");
        WorldCup cup13 = new WorldCup("第十三届","1986年","墨西哥","阿根廷");
        WorldCup cup14 = new WorldCup("第十四届","1990年","意大利","西德");
        WorldCup cup15 = new WorldCup("第十五届","1994年","美国","巴西");
        WorldCup cup16 = new WorldCup("第十六届","1998年","法国","法国");
        WorldCup cup17 = new WorldCup("第十七届","2002年","韩日","巴西");
        WorldCup cup18 = new WorldCup("第十八届","2006年","德国","意大利");
        WorldCup cup19 = new WorldCup("第十九届","2010年","南非","西班牙");
        WorldCup cup20 = new WorldCup("第二十届","2014年","巴西","德国");
        map.put("1930",cup1);
        map.put("1934",cup2);
        map.put("1938",cup3);
        map.put("1950",cup4);
        map.put("1954",cup5);
        map.put("1958",cup6);
        map.put("1962",cup7);
        map.put("1966",cup8);
        map.put("1970",cup9);
        map.put("1974",cup10);
        map.put("1978",cup11);
        map.put("1982",cup12);
        map.put("1986",cup13);
        map.put("1990",cup14);
        map.put("1994",cup15);
        map.put("1998",cup16);
        map.put("2002",cup17);
        map.put("2006",cup18);
        map.put("2010",cup19);
        map.put("2014",cup20);

        return map;
    }
}

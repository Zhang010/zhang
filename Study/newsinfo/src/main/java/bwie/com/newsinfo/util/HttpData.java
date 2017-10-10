package bwie.com.newsinfo.util;

import java.util.List;

/**
 * Created by 13435 on 2017/9/13.
 */

public class HttpData {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"adf4825f810457e706a126749f0defd5","title":"下周七天之内，必有喜事登门的生肖","date":"2017-09-18 12:45","category":"头条","author_name":"缘光风水","url":"http://mini.eastday.com/mobile/170918124516994.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170917_cd76b36770fff3a98e69f33456d9090b_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170917_9b22919f577ff19f905b44e88e703a75_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170917_d3ba447ad96168c80d889494b980a853_mwpm_03200403.jpg"},{"uniquekey":"0e2a028307e9a45811ba9d6ee5d8900a","title":"莫斯科中国贸易中心展示中国速度 落成后将集中服务在俄中企","date":"2017-09-18 12:55","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918125528538.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918125528_0e3a716c78039de7d2c03494b76dab96_1_mwpm_03200403.jpg"},{"uniquekey":"c461b4d4b4544813456b8d64cbd04620","title":"这三个生肖女最旺夫益子，有你吗？","date":"2017-09-18 12:09","category":"头条","author_name":"风水徐先生","url":"http://mini.eastday.com/mobile/170918120948338.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918_783f5a681ccfcca728517b9853b655fb_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918_1847ec0823eb2135157942c176ad27df_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918_9845d7bb653d0326221f5b188e0f5bdf_cover_mwpm_03200403.jpg"},{"uniquekey":"3647602ae235e7bdca411012db074d0e","title":"军训晕倒、体测猝死\u2026\u2026我们怎么用好日子养出了弱孩子？","date":"2017-09-18 12:06","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170918120624583.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170918/20170918120624_e3800084d23f41fd895783f3e8a0622b_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170918/20170918120624_e3800084d23f41fd895783f3e8a0622b_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170918/20170918120624_e3800084d23f41fd895783f3e8a0622b_2_mwpm_03200403.jpg"},{"uniquekey":"239e8064064c4dc0b902d108839f6229","title":"许家印391亿美元身价成中国新首富","date":"2017-09-18 12:01","category":"头条","author_name":"新浪综合 ","url":"http://mini.eastday.com/mobile/170918120119020.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918120119_b7930d8d6cbfc7a5ea7126868e8b3e8e_1_mwpm_03200403.png"},{"uniquekey":"e88eabf12b08282f8864164e9fcbfc86","title":"慈禧出殡时的诡异现象","date":"2017-09-18 11:56","category":"头条","author_name":"大熊闻三方","url":"http://mini.eastday.com/mobile/170918115629812.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918_ddfc60950f8986508a251770014fbbc4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918_29334409683d980feef04737550f89bb_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918_6bdc0fb87916d983a72e1b2d58b1844d_cover_mwpm_03200403.jpg"},{"uniquekey":"daaa0a93caee5d37de8d35b130c173fc","title":"万万没想到，郑州市最凶的区和最富的区竟然是\u2026\u2026你在哪个区？","date":"2017-09-18 11:45","category":"头条","author_name":"百姓观察者","url":"http://mini.eastday.com/mobile/170918114544733.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170918/20170918_4ea5ce079a4951f56eb986e3996f3f34_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170918/20170918_643886c678d051886baf850df9c9e460_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170918/20170918_a6d5f957793186594ce4148c33fa8030_cover_mwpm_03200403.jpg"},{"uniquekey":"cd7aac50b9e3ec7a64983a9c66a8c0c5","title":"石墨烯第一龙头卷土重来，周末再迎一利好，有望赶超建科院","date":"2017-09-18 11:44","category":"头条","author_name":"大斑马科技","url":"http://mini.eastday.com/mobile/170918114423537.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170918/20170918_4c9a9efca16267cf041ea543a93f2194_cover_mwpm_03200403.jpg"},{"uniquekey":"9c8393a9a61b97cbdd12fb5378f64cd1","title":"河北省海兴县：漳卫新河入海口段河道污染禁而不止","date":"2017-09-18 11:40","category":"头条","author_name":"百姓观察者","url":"http://mini.eastday.com/mobile/170918114039250.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918_fb8e7f6ba64189cf2489d4f5024eb253_cover_mwpm_03200403.jpg"},{"uniquekey":"a36e850cbe3f6730fedad013ac9f2d7b","title":"女子因网上订餐给了商家差评，没想到给家里带来这么大的灾祸","date":"2017-09-18 11:36","category":"头条","author_name":"熠书","url":"http://mini.eastday.com/mobile/170918113612802.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_33ea543ec175a073bdf1996c4a14c27b_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_989110d07cb4dce8e4404ab98d373a7a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_894bf662cf29ab5b4a95566febb1d1d2_cover_mwpm_03200403.jpg"},{"uniquekey":"1f2b040480852ab07bd3daac98d91ebd","title":"《学习文选》：金砖会晤携手打造世界经济新亮点","date":"2017-09-18 11:35","category":"头条","author_name":"人民网-理论频道","url":"http://mini.eastday.com/mobile/170918113522996.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918113522_d3b3b16d9edea5510e32a92592eeedd7_1_mwpm_03200403.jpg"},{"uniquekey":"c6d8a6e1ceda7bb71f956325f2ed248e","title":"实拍越南街头小商贩，有一种商品中国男人打死都不会买","date":"2017-09-18 11:24","category":"头条","author_name":"镜观世界","url":"http://mini.eastday.com/mobile/170918112424207.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170918/20170918_a2eb3d433b8247298b511238c18a9316_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170918/20170918_5f9ab4ab3657aade4b78c687e92afbeb_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170918/20170918_be5ffaa0f003e2cc1a986edb972e7554_cover_mwpm_03200403.jpg"},{"uniquekey":"214efb2f4b1daf5cd5dcac8fcd3e2ad3","title":"韩国防部：美将出动航母战斗群参加10月韩美联演","date":"2017-09-18 11:17","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918111749531.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918111749_045b29d0e6403588a99eea4532c822c3_1_mwpm_03200403.jpg"},{"uniquekey":"fb20b509aa0782d71c83240b9355b947","title":"武汉市水上运动协会帆船帆板东湖训练基地落成","date":"2017-09-18 11:17","category":"头条","author_name":"湖北日报数字传媒","url":"http://mini.eastday.com/mobile/170918111721877.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918_ce56ca728cfee799198cc42d04e8394f_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170918/20170918_1524748250c19dc93916ca7608075c78_mwpm_03200403.jpg"},{"uniquekey":"50e5b2eb41873a3409184d7b055ffefb","title":"女性坚持健身锻炼，能给身体带来哪些好处？","date":"2017-09-18 11:16","category":"头条","author_name":" 运动发骚客","url":"http://mini.eastday.com/mobile/170918111640339.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918_7e2db1605658945ea97b62145cfb3186_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170918_865869302905c07f339e4b3364d13774_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170918_3475549ace96537eb21918756dc89e64_cover_mwpm_03200403.jpg"},{"uniquekey":"c0c19603eb2158a134a2860bac1cc1b3","title":"阿里巴巴王坚登上《我是未来》预言未来","date":"2017-09-18 11:12","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170918111218606.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918111218_74782d4f27f9585f48bdccdf4a2cf00d_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170918/20170918111218_74782d4f27f9585f48bdccdf4a2cf00d_1_mwpm_03200403.jpg"},{"uniquekey":"7b84d3ea754c08fe93c4869505d9c8ff","title":"农民在山里放养它，省事省力好赚钱，一年纯赚二十万","date":"2017-09-18 11:08","category":"头条","author_name":"华俊竹","url":"http://mini.eastday.com/mobile/170918110855739.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918_3462e87b37bae4ae00cbe7b743186660_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170918_994738192aa90de52ea5956e2a8015cd_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170918_e4c7f25b4571ef9570c2bc7bac37111b_cover_mwpm_03200403.jpg"},{"uniquekey":"f43c2e17da0fc429cc9e0a8f70d426e5","title":"点一根烟全身皮肤被烧光 他犯的错误很多人也在犯","date":"2017-09-18 11:33","category":"头条","author_name":"东方网东方头条傅文婧","url":"http://mini.eastday.com/mobile/170918110229806.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918_ebee1dc481165b92ff72d7ccf1850530_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170918/20170918_1df3add21c46e690e09acb90fd24137c_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170918/20170918_64aa47458deef3cfb8b99772906a519a_mwpm_03200403.jpg"},{"uniquekey":"c8833fab4134471857ba1e1c134e7ce4","title":"韩-新加坡将办国际水资源研讨会 谋求水资源产业合作","date":"2017-09-18 10:57","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918105719877.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918105719_dda57aea2777eddf19beed25838cb447_1_mwpm_03200403.jpg"},{"uniquekey":"3c1a1ed726a978e56a2f5ede2df24522","title":"澳门第六届立法会选举顺利完成，驻澳联络办发表谈话","date":"2017-09-18 10:54","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170918105454182.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170918/20170918105454_f9b12a3a21b334ffc31878499206ba4f_1_mwpm_03200403.jpg"},{"uniquekey":"6c87b1a92806ec9195ded24e9a3ac32f","title":"韩整形医院宣传照造假 美瞳彩妆一样都不少","date":"2017-09-18 10:47","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918104709875.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918104709_b276505c1abeb7484a3936ca335208d2_1_mwpm_03200403.jpg"},{"uniquekey":"e997671ce7e5790946135b18dc935093","title":"美军后悔花了六百亿仍然没用，在这武器上面中国已达到怪物级别","date":"2017-09-18 10:39","category":"头条","author_name":"军事武器新视野","url":"http://mini.eastday.com/mobile/170918103909253.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_cee7d623ba7659935d03e9c2d6f89611_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_a40fac5b0425c93060efe8ac49765e09_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_d9820ccf584db859ce55b454f3eb37ca_cover_mwpm_03200403.jpg"},{"uniquekey":"3565b9d4f61034b1539b35742e4a523e","title":"泰国住宅闯入5米巨蟒, 蟒蛇吐出未消化物后女主人当场崩溃","date":"2017-09-18 10:36","category":"头条","author_name":"图看世界","url":"http://mini.eastday.com/mobile/170918103641987.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918_fb215bcd3af8facadc5bb716d27cd4c9_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170918_3ba210c5bd13c182af6e245cd6bfed9e_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170918_baf4242ce7f2dc9fab1f8f2321d55855_cover_mwpm_03200403.jpg"},{"uniquekey":"63d06a7a4e7babaca3ed72fd2963cf64","title":"战机升空即消失令美恐慌，这是中国东海舰队的新杀手锏","date":"2017-09-18 10:34","category":"头条","author_name":"军事武器新视野","url":"http://mini.eastday.com/mobile/170918103433218.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918_4a2cd936c111303450e4c91be4a1e189_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170918/20170918_b891712f2daea844376c1ab0edc3d68a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170918/20170918_17c50f0711395d35dd7f9d50ccc55173_cover_mwpm_03200403.jpg"},{"uniquekey":"e15ea974e34a50527ab455ac96c01718","title":"你们家还在用这种碗盛饭菜吗？赶紧扔掉！","date":"2017-09-18 10:32","category":"头条","author_name":"茄子营养师","url":"http://mini.eastday.com/mobile/170918103257757.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918_db3732fac585519a0a93cc0c11051632_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170918_096f4c6a2f73de818818db7c0ead6e2a_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170918_7cb5cd870763dc4dce8a14888a339094_mwpm_03200403.jpg"},{"uniquekey":"fa71fc3902cca96782592495ddd3a98f","title":"量子通信第一龙头从152跌至2元，中报预增600%，有望暴涨","date":"2017-09-18 10:29","category":"头条","author_name":"娘娘说","url":"http://mini.eastday.com/mobile/170918102942745.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_8ac64891001de2c9533180ab9b57d495_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_8c5d81f2ce7a6f8f0a9957bf3556294c_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_cb36e4ae1f36b0b5b57f53313d7724ad_cover_mwpm_03200403.jpg"},{"uniquekey":"69c3c4ac043b1fc0c20d4bda4ed03d8b","title":"南昌启用三类新型电警 首日抓拍违法行为125起","date":"2017-09-18 10:24","category":"头条","author_name":"南昌头条","url":"http://mini.eastday.com/mobile/170918102444965.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170918/20170918_e756bebe90ae2feb5046a9e2e8d19fe4_mwpm_03200403.jpg"},{"uniquekey":"0f48becf042edc4f8965205e3b8fa74b","title":"李尚福任中央军委装备发展部部长","date":"2017-09-18 10:13","category":"头条","author_name":"军报记者","url":"http://mini.eastday.com/mobile/170918101348182.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170918/20170918101348_38c0bed82cc0a6a28ab6b43321f3d420_1_mwpm_03200403.jpg"},{"uniquekey":"8db3b6fd88411660f74ce7f599a0abe5","title":"偏财超旺的三个生肖10月份接财接福","date":"2017-09-18 10:11","category":"头条","author_name":"小诸葛风水命理","url":"http://mini.eastday.com/mobile/170918101144601.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918_f46fc4184d8192fec2ae5df8686e224a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170918/20170918_b855c2f3974916a3e67c2ac165b7bca0_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170918/20170918_dd379807235d38e8e7f9881ec38a8a17_cover_mwpm_03200403.jpg"},{"uniquekey":"b3f1b8875dbf54eb20c5627314863f75","title":"一对情侣在地铁上突然同时晕倒吓傻乘客，知道实情后乘客纷纷大骂","date":"2017-09-18 10:09","category":"头条","author_name":"爱生活爱探秘","url":"http://mini.eastday.com/mobile/170918100934924.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_0b4868b60c9f6a48175620be11d52527_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_5f38b625fd0ca7f0617640da6d24b8ac_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_cfccb05fcd396f7812d30f3b94d126aa_cover_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"adf4825f810457e706a126749f0defd5","title":"下周七天之内，必有喜事登门的生肖","date":"2017-09-18 12:45","category":"头条","author_name":"缘光风水","url":"http://mini.eastday.com/mobile/170918124516994.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170917_cd76b36770fff3a98e69f33456d9090b_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170917_9b22919f577ff19f905b44e88e703a75_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170917_d3ba447ad96168c80d889494b980a853_mwpm_03200403.jpg"},{"uniquekey":"0e2a028307e9a45811ba9d6ee5d8900a","title":"莫斯科中国贸易中心展示中国速度 落成后将集中服务在俄中企","date":"2017-09-18 12:55","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918125528538.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918125528_0e3a716c78039de7d2c03494b76dab96_1_mwpm_03200403.jpg"},{"uniquekey":"c461b4d4b4544813456b8d64cbd04620","title":"这三个生肖女最旺夫益子，有你吗？","date":"2017-09-18 12:09","category":"头条","author_name":"风水徐先生","url":"http://mini.eastday.com/mobile/170918120948338.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918_783f5a681ccfcca728517b9853b655fb_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918_1847ec0823eb2135157942c176ad27df_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918_9845d7bb653d0326221f5b188e0f5bdf_cover_mwpm_03200403.jpg"},{"uniquekey":"3647602ae235e7bdca411012db074d0e","title":"军训晕倒、体测猝死\u2026\u2026我们怎么用好日子养出了弱孩子？","date":"2017-09-18 12:06","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170918120624583.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170918/20170918120624_e3800084d23f41fd895783f3e8a0622b_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170918/20170918120624_e3800084d23f41fd895783f3e8a0622b_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170918/20170918120624_e3800084d23f41fd895783f3e8a0622b_2_mwpm_03200403.jpg"},{"uniquekey":"239e8064064c4dc0b902d108839f6229","title":"许家印391亿美元身价成中国新首富","date":"2017-09-18 12:01","category":"头条","author_name":"新浪综合 ","url":"http://mini.eastday.com/mobile/170918120119020.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918120119_b7930d8d6cbfc7a5ea7126868e8b3e8e_1_mwpm_03200403.png"},{"uniquekey":"e88eabf12b08282f8864164e9fcbfc86","title":"慈禧出殡时的诡异现象","date":"2017-09-18 11:56","category":"头条","author_name":"大熊闻三方","url":"http://mini.eastday.com/mobile/170918115629812.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918_ddfc60950f8986508a251770014fbbc4_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170918/20170918_29334409683d980feef04737550f89bb_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170918/20170918_6bdc0fb87916d983a72e1b2d58b1844d_cover_mwpm_03200403.jpg"},{"uniquekey":"daaa0a93caee5d37de8d35b130c173fc","title":"万万没想到，郑州市最凶的区和最富的区竟然是\u2026\u2026你在哪个区？","date":"2017-09-18 11:45","category":"头条","author_name":"百姓观察者","url":"http://mini.eastday.com/mobile/170918114544733.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170918/20170918_4ea5ce079a4951f56eb986e3996f3f34_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170918/20170918_643886c678d051886baf850df9c9e460_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170918/20170918_a6d5f957793186594ce4148c33fa8030_cover_mwpm_03200403.jpg"},{"uniquekey":"cd7aac50b9e3ec7a64983a9c66a8c0c5","title":"石墨烯第一龙头卷土重来，周末再迎一利好，有望赶超建科院","date":"2017-09-18 11:44","category":"头条","author_name":"大斑马科技","url":"http://mini.eastday.com/mobile/170918114423537.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170918/20170918_4c9a9efca16267cf041ea543a93f2194_cover_mwpm_03200403.jpg"},{"uniquekey":"9c8393a9a61b97cbdd12fb5378f64cd1","title":"河北省海兴县：漳卫新河入海口段河道污染禁而不止","date":"2017-09-18 11:40","category":"头条","author_name":"百姓观察者","url":"http://mini.eastday.com/mobile/170918114039250.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918_fb8e7f6ba64189cf2489d4f5024eb253_cover_mwpm_03200403.jpg"},{"uniquekey":"a36e850cbe3f6730fedad013ac9f2d7b","title":"女子因网上订餐给了商家差评，没想到给家里带来这么大的灾祸","date":"2017-09-18 11:36","category":"头条","author_name":"熠书","url":"http://mini.eastday.com/mobile/170918113612802.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_33ea543ec175a073bdf1996c4a14c27b_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_989110d07cb4dce8e4404ab98d373a7a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_894bf662cf29ab5b4a95566febb1d1d2_cover_mwpm_03200403.jpg"},{"uniquekey":"1f2b040480852ab07bd3daac98d91ebd","title":"《学习文选》：金砖会晤携手打造世界经济新亮点","date":"2017-09-18 11:35","category":"头条","author_name":"人民网-理论频道","url":"http://mini.eastday.com/mobile/170918113522996.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918113522_d3b3b16d9edea5510e32a92592eeedd7_1_mwpm_03200403.jpg"},{"uniquekey":"c6d8a6e1ceda7bb71f956325f2ed248e","title":"实拍越南街头小商贩，有一种商品中国男人打死都不会买","date":"2017-09-18 11:24","category":"头条","author_name":"镜观世界","url":"http://mini.eastday.com/mobile/170918112424207.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170918/20170918_a2eb3d433b8247298b511238c18a9316_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170918/20170918_5f9ab4ab3657aade4b78c687e92afbeb_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170918/20170918_be5ffaa0f003e2cc1a986edb972e7554_cover_mwpm_03200403.jpg"},{"uniquekey":"214efb2f4b1daf5cd5dcac8fcd3e2ad3","title":"韩国防部：美将出动航母战斗群参加10月韩美联演","date":"2017-09-18 11:17","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918111749531.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170918/20170918111749_045b29d0e6403588a99eea4532c822c3_1_mwpm_03200403.jpg"},{"uniquekey":"fb20b509aa0782d71c83240b9355b947","title":"武汉市水上运动协会帆船帆板东湖训练基地落成","date":"2017-09-18 11:17","category":"头条","author_name":"湖北日报数字传媒","url":"http://mini.eastday.com/mobile/170918111721877.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918_ce56ca728cfee799198cc42d04e8394f_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170918/20170918_1524748250c19dc93916ca7608075c78_mwpm_03200403.jpg"},{"uniquekey":"50e5b2eb41873a3409184d7b055ffefb","title":"女性坚持健身锻炼，能给身体带来哪些好处？","date":"2017-09-18 11:16","category":"头条","author_name":" 运动发骚客","url":"http://mini.eastday.com/mobile/170918111640339.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918_7e2db1605658945ea97b62145cfb3186_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170918_865869302905c07f339e4b3364d13774_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170918_3475549ace96537eb21918756dc89e64_cover_mwpm_03200403.jpg"},{"uniquekey":"c0c19603eb2158a134a2860bac1cc1b3","title":"阿里巴巴王坚登上《我是未来》预言未来","date":"2017-09-18 11:12","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170918111218606.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918111218_74782d4f27f9585f48bdccdf4a2cf00d_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170918/20170918111218_74782d4f27f9585f48bdccdf4a2cf00d_1_mwpm_03200403.jpg"},{"uniquekey":"7b84d3ea754c08fe93c4869505d9c8ff","title":"农民在山里放养它，省事省力好赚钱，一年纯赚二十万","date":"2017-09-18 11:08","category":"头条","author_name":"华俊竹","url":"http://mini.eastday.com/mobile/170918110855739.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918_3462e87b37bae4ae00cbe7b743186660_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170918_994738192aa90de52ea5956e2a8015cd_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170918_e4c7f25b4571ef9570c2bc7bac37111b_cover_mwpm_03200403.jpg"},{"uniquekey":"f43c2e17da0fc429cc9e0a8f70d426e5","title":"点一根烟全身皮肤被烧光 他犯的错误很多人也在犯","date":"2017-09-18 11:33","category":"头条","author_name":"东方网东方头条傅文婧","url":"http://mini.eastday.com/mobile/170918110229806.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170918/20170918_ebee1dc481165b92ff72d7ccf1850530_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170918/20170918_1df3add21c46e690e09acb90fd24137c_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170918/20170918_64aa47458deef3cfb8b99772906a519a_mwpm_03200403.jpg"},{"uniquekey":"c8833fab4134471857ba1e1c134e7ce4","title":"韩-新加坡将办国际水资源研讨会 谋求水资源产业合作","date":"2017-09-18 10:57","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918105719877.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918105719_dda57aea2777eddf19beed25838cb447_1_mwpm_03200403.jpg"},{"uniquekey":"3c1a1ed726a978e56a2f5ede2df24522","title":"澳门第六届立法会选举顺利完成，驻澳联络办发表谈话","date":"2017-09-18 10:54","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170918105454182.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170918/20170918105454_f9b12a3a21b334ffc31878499206ba4f_1_mwpm_03200403.jpg"},{"uniquekey":"6c87b1a92806ec9195ded24e9a3ac32f","title":"韩整形医院宣传照造假 美瞳彩妆一样都不少","date":"2017-09-18 10:47","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170918104709875.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918104709_b276505c1abeb7484a3936ca335208d2_1_mwpm_03200403.jpg"},{"uniquekey":"e997671ce7e5790946135b18dc935093","title":"美军后悔花了六百亿仍然没用，在这武器上面中国已达到怪物级别","date":"2017-09-18 10:39","category":"头条","author_name":"军事武器新视野","url":"http://mini.eastday.com/mobile/170918103909253.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_cee7d623ba7659935d03e9c2d6f89611_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_a40fac5b0425c93060efe8ac49765e09_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_d9820ccf584db859ce55b454f3eb37ca_cover_mwpm_03200403.jpg"},{"uniquekey":"3565b9d4f61034b1539b35742e4a523e","title":"泰国住宅闯入5米巨蟒, 蟒蛇吐出未消化物后女主人当场崩溃","date":"2017-09-18 10:36","category":"头条","author_name":"图看世界","url":"http://mini.eastday.com/mobile/170918103641987.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918_fb215bcd3af8facadc5bb716d27cd4c9_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170918_3ba210c5bd13c182af6e245cd6bfed9e_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170918_baf4242ce7f2dc9fab1f8f2321d55855_cover_mwpm_03200403.jpg"},{"uniquekey":"63d06a7a4e7babaca3ed72fd2963cf64","title":"战机升空即消失令美恐慌，这是中国东海舰队的新杀手锏","date":"2017-09-18 10:34","category":"头条","author_name":"军事武器新视野","url":"http://mini.eastday.com/mobile/170918103433218.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918_4a2cd936c111303450e4c91be4a1e189_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170918/20170918_b891712f2daea844376c1ab0edc3d68a_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170918/20170918_17c50f0711395d35dd7f9d50ccc55173_cover_mwpm_03200403.jpg"},{"uniquekey":"e15ea974e34a50527ab455ac96c01718","title":"你们家还在用这种碗盛饭菜吗？赶紧扔掉！","date":"2017-09-18 10:32","category":"头条","author_name":"茄子营养师","url":"http://mini.eastday.com/mobile/170918103257757.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170918/20170918_db3732fac585519a0a93cc0c11051632_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170918/20170918_096f4c6a2f73de818818db7c0ead6e2a_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170918/20170918_7cb5cd870763dc4dce8a14888a339094_mwpm_03200403.jpg"},{"uniquekey":"fa71fc3902cca96782592495ddd3a98f","title":"量子通信第一龙头从152跌至2元，中报预增600%，有望暴涨","date":"2017-09-18 10:29","category":"头条","author_name":"娘娘说","url":"http://mini.eastday.com/mobile/170918102942745.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_8ac64891001de2c9533180ab9b57d495_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_8c5d81f2ce7a6f8f0a9957bf3556294c_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_cb36e4ae1f36b0b5b57f53313d7724ad_cover_mwpm_03200403.jpg"},{"uniquekey":"69c3c4ac043b1fc0c20d4bda4ed03d8b","title":"南昌启用三类新型电警 首日抓拍违法行为125起","date":"2017-09-18 10:24","category":"头条","author_name":"南昌头条","url":"http://mini.eastday.com/mobile/170918102444965.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170918/20170918_e756bebe90ae2feb5046a9e2e8d19fe4_mwpm_03200403.jpg"},{"uniquekey":"0f48becf042edc4f8965205e3b8fa74b","title":"李尚福任中央军委装备发展部部长","date":"2017-09-18 10:13","category":"头条","author_name":"军报记者","url":"http://mini.eastday.com/mobile/170918101348182.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170918/20170918101348_38c0bed82cc0a6a28ab6b43321f3d420_1_mwpm_03200403.jpg"},{"uniquekey":"8db3b6fd88411660f74ce7f599a0abe5","title":"偏财超旺的三个生肖10月份接财接福","date":"2017-09-18 10:11","category":"头条","author_name":"小诸葛风水命理","url":"http://mini.eastday.com/mobile/170918101144601.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170918/20170918_f46fc4184d8192fec2ae5df8686e224a_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170918/20170918_b855c2f3974916a3e67c2ac165b7bca0_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170918/20170918_dd379807235d38e8e7f9881ec38a8a17_cover_mwpm_03200403.jpg"},{"uniquekey":"b3f1b8875dbf54eb20c5627314863f75","title":"一对情侣在地铁上突然同时晕倒吓傻乘客，知道实情后乘客纷纷大骂","date":"2017-09-18 10:09","category":"头条","author_name":"爱生活爱探秘","url":"http://mini.eastday.com/mobile/170918100934924.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170918/20170918_0b4868b60c9f6a48175620be11d52527_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170918/20170918_5f38b625fd0ca7f0617640da6d24b8ac_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170918/20170918_cfccb05fcd396f7812d30f3b94d126aa_cover_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : adf4825f810457e706a126749f0defd5
             * title : 下周七天之内，必有喜事登门的生肖
             * date : 2017-09-18 12:45
             * category : 头条
             * author_name : 缘光风水
             * url : http://mini.eastday.com/mobile/170918124516994.html
             * thumbnail_pic_s : http://02.imgmini.eastday.com/mobile/20170918/20170917_cd76b36770fff3a98e69f33456d9090b_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://02.imgmini.eastday.com/mobile/20170918/20170917_9b22919f577ff19f905b44e88e703a75_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://02.imgmini.eastday.com/mobile/20170918/20170917_d3ba447ad96168c80d889494b980a853_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}

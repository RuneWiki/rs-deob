package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;

public final class client extends class32 implements class367, OAuthApi {

    @ObfuscatedName("client.w")
    public static class192[] field562;

    @ObfuscatedName("client.au")
    public static boolean field588 = true;

    @ObfuscatedName("client.bg")
    public static int field493 = 1;

    @ObfuscatedName("client.bw")
    public static int field494 = 0;

    @ObfuscatedName("client.bv")
    public static int field495 = 0;

    @ObfuscatedName("client.by")
    public static boolean field685 = false;

    @ObfuscatedName("client.bz")
    public static boolean field497 = false;

    @ObfuscatedName("client.bl")
    public static int field498 = -1;

    @ObfuscatedName("client.bk")
    public static int field693 = -1;

    @ObfuscatedName("client.bh")
    public static int field572 = -1;

    @ObfuscatedName("client.bx")
    public static boolean field501 = false;

    @ObfuscatedName("client.cv")
    public static int field612 = 0;

    @ObfuscatedName("client.cm")
    public static boolean field503 = true;

    @ObfuscatedName("client.db")
    public static int field504 = 0;

    @ObfuscatedName("client.df")
    public static long field505 = 1L;

    @ObfuscatedName("client.da")
    public static int field506 = -1;

    @ObfuscatedName("client.dp")
    public static int field507 = -1;

    @ObfuscatedName("client.dr")
    public static long field508 = -1L;

    @ObfuscatedName("client.dq")
    public static boolean field752 = true;

    @ObfuscatedName("client.dl")
    public static int field602 = 0;

    @ObfuscatedName("client.do")
    public static int field511 = 0;

    @ObfuscatedName("client.dg")
    public static int field512 = 0;

    @ObfuscatedName("client.dz")
    public static int field513 = 0;

    @ObfuscatedName("client.dx")
    public static int field542 = 0;

    @ObfuscatedName("client.dj")
    public static int field515 = 0;

    @ObfuscatedName("client.dk")
    public static int field671 = 0;

    @ObfuscatedName("client.di")
    public static int field517 = 0;

    @ObfuscatedName("client.dv")
    public static int field518 = 0;

    @ObfuscatedName("client.dw")
    public static class95 field519 = class95.field1282;

    @ObfuscatedName("client.dn")
    public static class95 field520 = class95.field1282;

    @ObfuscatedName("client.dd")
    public static int field708 = 0;

    @ObfuscatedName("client.ee")
    public static int field522 = 0;

    @ObfuscatedName("client.ea")
    public static int field523 = 0;

    @ObfuscatedName("client.el")
    public static int field751 = 0;

    @ObfuscatedName("client.fc")
    public static int field525 = 0;

    @ObfuscatedName("client.fr")
    public static int field526 = 0;

    @ObfuscatedName("client.fg")
    public static int field527 = 0;

    @ObfuscatedName("client.fv")
    public static int field528 = 0;

    @ObfuscatedName("client.fm")
    public static class126 field529 = class126.field1537;

    @ObfuscatedName("client.fl")
    public static class449 field640 = class449.field4785;

    @ObfuscatedName("client.fb")
    public String field531;

    @ObfuscatedName("client.fa")
    public class15 field532;

    @ObfuscatedName("client.fd")
    public class20 field577;

    @ObfuscatedName("client.fu")
    public OtlTokenRequester field534;

    @ObfuscatedName("client.fe")
    public Future field516;

    @ObfuscatedName("client.fy")
    public boolean field536 = false;

    @ObfuscatedName("client.fs")
    public class20 field537;

    @ObfuscatedName("client.fw")
    public RefreshAccessTokenRequester field720;

    @ObfuscatedName("client.ft")
    public Future field539;

    @ObfuscatedName("client.fz")
    public static final String field662;

    @ObfuscatedName("client.gk")
    public static boolean field541;

    @ObfuscatedName("client.gw")
    public static class71 field712;

    @ObfuscatedName("client.gb")
    public class445 field543;

    @ObfuscatedName("client.ga")
    public class8 field722;

    @ObfuscatedName("client.gn")
    public long field711 = -1L;

    @ObfuscatedName("client.gc")
    public static byte[] field546;

    @ObfuscatedName("client.gs")
    public static class92[] field547;

    @ObfuscatedName("client.gf")
    public static int field690;

    @ObfuscatedName("client.go")
    public static int[] field514;

    @ObfuscatedName("client.ge")
    public static int field550;

    @ObfuscatedName("client.gm")
    public static int[] field551;

    @ObfuscatedName("client.gh")
    public static final class101 field552;

    @ObfuscatedName("client.hi")
    public static int field553;

    @ObfuscatedName("client.he")
    public static boolean field554;

    @ObfuscatedName("client.hm")
    public static class357 field555;

    @ObfuscatedName("client.hc")
    public static HashMap field623;

    @ObfuscatedName("client.hq")
    public static int field524;

    @ObfuscatedName("client.hf")
    public static int field586;

    @ObfuscatedName("client.ht")
    public static int field559;

    @ObfuscatedName("client.hy")
    public static int field560;

    @ObfuscatedName("client.hx")
    public static int field775;

    @ObfuscatedName("client.il")
    public static boolean field563;

    @ObfuscatedName("client.ie")
    public static int[][][] field564;

    @ObfuscatedName("client.ir")
    public static final int[] field565;

    @ObfuscatedName("client.ii")
    public static int field744;

    @ObfuscatedName("client.iu")
    public static int field509;

    @ObfuscatedName("client.it")
    public static String field660;

    @ObfuscatedName("client.io")
    public static int field717;

    @ObfuscatedName("client.if")
    public static int field569;

    @ObfuscatedName("client.im")
    public static int field728;

    @ObfuscatedName("client.id")
    public static boolean field571;

    @ObfuscatedName("client.jp")
    public static int field589;

    @ObfuscatedName("client.js")
    public static int field573;

    @ObfuscatedName("client.jt")
    public static int field574;

    @ObfuscatedName("client.ja")
    public static int field575;

    @ObfuscatedName("client.jy")
    public static int field615;

    @ObfuscatedName("client.ju")
    public static int field767;

    @ObfuscatedName("client.jc")
    public static int field578;

    @ObfuscatedName("client.jg")
    public static int field579;

    @ObfuscatedName("client.jj")
    public static int field580;

    @ObfuscatedName("client.jd")
    public static int field581;

    @ObfuscatedName("client.jb")
    public static int field582;

    @ObfuscatedName("client.ji")
    public static int field583;

    @ObfuscatedName("client.jk")
    public static int field584;

    @ObfuscatedName("client.jv")
    public static int field585;

    @ObfuscatedName("client.je")
    public static int field755;

    @ObfuscatedName("client.kv")
    public static boolean field587;

    @ObfuscatedName("client.kx")
    public static int field631;

    @ObfuscatedName("client.ko")
    public static boolean field544;

    @ObfuscatedName("client.kb")
    public static int field590;

    @ObfuscatedName("client.kz")
    public static int field570;

    @ObfuscatedName("client.ki")
    public static int field592;

    @ObfuscatedName("client.kk")
    public static int[] field593;

    @ObfuscatedName("client.ke")
    public static int[] field782;

    @ObfuscatedName("client.kd")
    public static int[] field556;

    @ObfuscatedName("client.kw")
    public static int[] field596;

    @ObfuscatedName("client.km")
    public static int[] field733;

    @ObfuscatedName("client.kh")
    public static int[] field598;

    @ObfuscatedName("client.kc")
    public static int[] field599;

    @ObfuscatedName("client.kr")
    public static String[] field600;

    @ObfuscatedName("client.kq")
    public static int[][] field709;

    @ObfuscatedName("client.ka")
    public static int field762;

    @ObfuscatedName("client.kp")
    public static int field603;

    @ObfuscatedName("client.ku")
    public static int field604;

    @ObfuscatedName("client.kg")
    public static int field605;

    @ObfuscatedName("client.kl")
    public static int field606;

    @ObfuscatedName("client.kn")
    public static int field607;

    @ObfuscatedName("client.kt")
    public static int field608;

    @ObfuscatedName("client.kf")
    public static boolean field609;

    @ObfuscatedName("client.ky")
    public static int field610;

    @ObfuscatedName("client.kj")
    public static int field636;

    @ObfuscatedName("client.lb")
    public static int field597;

    @ObfuscatedName("client.lx")
    public static int field613;

    @ObfuscatedName("client.lv")
    public static int field704;

    @ObfuscatedName("client.lh")
    public static int field727;

    @ObfuscatedName("client.lg")
    public static boolean field764;

    @ObfuscatedName("client.lo")
    public static int field617;

    @ObfuscatedName("client.lf")
    public static int field618;

    @ObfuscatedName("client.li")
    public static boolean field533;

    @ObfuscatedName("client.la")
    public static class85[] field620;

    @ObfuscatedName("client.lt")
    public static int field621;

    @ObfuscatedName("client.lm")
    public static int field622;

    @ObfuscatedName("client.le")
    public static long field499;

    @ObfuscatedName("client.lk")
    public static boolean field624;

    @ObfuscatedName("client.lc")
    public static int field625;

    @ObfuscatedName("client.lp")
    public static int field626;

    @ObfuscatedName("client.lz")
    public static int[] field776;

    @ObfuscatedName("client.md")
    public static final int[] field663;

    @ObfuscatedName("client.mt")
    public static String[] field629;

    @ObfuscatedName("client.ml")
    public static boolean[] field630;

    @ObfuscatedName("client.mz")
    public static int[] field648;

    @ObfuscatedName("client.mo")
    public static int field632;

    @ObfuscatedName("client.mi")
    public static class336[][][] field680;

    @ObfuscatedName("client.ma")
    public static class336 field634;

    @ObfuscatedName("client.my")
    public static class336 field635;

    @ObfuscatedName("client.mp")
    public static class336 field633;

    @ObfuscatedName("client.mr")
    public static int[] field637;

    @ObfuscatedName("client.mh")
    public static int[] field638;

    @ObfuscatedName("client.mv")
    public static int[] field500;

    @ObfuscatedName("client.mf")
    public static boolean field521;

    @ObfuscatedName("client.mc")
    public static boolean field641;

    @ObfuscatedName("client.mb")
    public static int field642;

    @ObfuscatedName("client.me")
    public static int[] field643;

    @ObfuscatedName("client.mw")
    public static int[] field735;

    @ObfuscatedName("client.mq")
    public static int[] field645;

    @ObfuscatedName("client.mn")
    public static int[] field646;

    @ObfuscatedName("client.mk")
    public static int[] field616;

    @ObfuscatedName("client.ns")
    public static String[] field731;

    @ObfuscatedName("client.nu")
    public static String[] field502;

    @ObfuscatedName("client.np")
    public static boolean[] field768;

    @ObfuscatedName("client.na")
    public static boolean field651;

    @ObfuscatedName("client.ne")
    public static boolean field668;

    @ObfuscatedName("client.ni")
    public static boolean field653;

    @ObfuscatedName("client.nh")
    public static boolean field726;

    @ObfuscatedName("client.nc")
    public static int field655;

    @ObfuscatedName("client.nx")
    public static int field656;

    @ObfuscatedName("client.nt")
    public static int field561;

    @ObfuscatedName("client.nl")
    public static int field658;

    @ObfuscatedName("client.no")
    public static int field659;

    @ObfuscatedName("client.nb")
    public static boolean field661;

    @ObfuscatedName("client.nv")
    public static int field766;

    @ObfuscatedName("client.nd")
    public static int field650;

    @ObfuscatedName("client.nz")
    public static String field664;

    @ObfuscatedName("client.ny")
    public static String field665;

    @ObfuscatedName("client.nn")
    public static int field666;

    @ObfuscatedName("client.nw")
    public static class422 field667;

    @ObfuscatedName("client.op")
    public static int field594;

    @ObfuscatedName("client.ol")
    public static int field669;

    @ObfuscatedName("client.of")
    public static int field670;

    @ObfuscatedName("client.oq")
    public static int field566;

    @ObfuscatedName("client.ok")
    public static class296 field628;

    @ObfuscatedName("client.ou")
    public static int field673;

    @ObfuscatedName("client.oc")
    public static int field674;

    @ObfuscatedName("client.om")
    public static int field675;

    @ObfuscatedName("client.oo")
    public static int field676;

    @ObfuscatedName("client.oj")
    public static boolean field677;

    @ObfuscatedName("client.oh")
    public static class296 field740;

    @ObfuscatedName("client.oy")
    public static class296 field601;

    @ObfuscatedName("client.oa")
    public static class296 field777;

    @ObfuscatedName("client.oe")
    public static int field510;

    @ObfuscatedName("client.oz")
    public static int field682;

    @ObfuscatedName("client.ox")
    public static class296 field683;

    @ObfuscatedName("client.or")
    public static boolean field684;

    @ObfuscatedName("client.ov")
    public static int field784;

    @ObfuscatedName("client.ob")
    public static int field745;

    @ObfuscatedName("client.os")
    public static boolean field687;

    @ObfuscatedName("client.ot")
    public static int field688;

    @ObfuscatedName("client.ow")
    public static int field689;

    @ObfuscatedName("client.pi")
    public static boolean field770;

    @ObfuscatedName("client.pm")
    public static int field691;

    @ObfuscatedName("client.pn")
    public static int[] field692;

    @ObfuscatedName("client.pj")
    public static int field558;

    @ObfuscatedName("client.pk")
    public static int[] field694;

    @ObfuscatedName("client.pr")
    public static int field695;

    @ObfuscatedName("client.pv")
    public static int[] field696;

    @ObfuscatedName("client.pf")
    public static int field697;

    @ObfuscatedName("client.po")
    public static int[] field591;

    @ObfuscatedName("client.pa")
    public static int field699;

    @ObfuscatedName("client.px")
    public static int field700;

    @ObfuscatedName("client.pz")
    public static int field701;

    @ObfuscatedName("client.ps")
    public static int field702;

    @ObfuscatedName("client.py")
    public static int field703;

    @ObfuscatedName("client.pg")
    public static int field746;

    @ObfuscatedName("client.pt")
    public static int field705;

    @ObfuscatedName("client.pb")
    public static int field706;

    @ObfuscatedName("client.pl")
    public static int field707;

    @ObfuscatedName("client.qx")
    public static int field686;

    @ObfuscatedName("client.qz")
    public static class336 field678;

    @ObfuscatedName("client.qa")
    public static class336 field710;

    @ObfuscatedName("client.qs")
    public static class336 field627;

    @ObfuscatedName("client.qn")
    public static class422 field724;

    @ObfuscatedName("client.qg")
    public static int field713;

    @ObfuscatedName("client.ql")
    public static int field714;

    @ObfuscatedName("client.qk")
    public static boolean[] field715;

    @ObfuscatedName("client.qd")
    public static boolean[] field557;

    @ObfuscatedName("client.qt")
    public static boolean[] field672;

    @ObfuscatedName("client.qu")
    public static int[] field718;

    @ObfuscatedName("client.qi")
    public static int[] field719;

    @ObfuscatedName("client.qe")
    public static int[] field492;

    @ObfuscatedName("client.qp")
    public static int[] field721;

    @ObfuscatedName("client.qv")
    public static int field654;

    @ObfuscatedName("client.qr")
    public static long field679;

    @ObfuscatedName("client.qm")
    public static boolean field736;

    @ObfuscatedName("client.rh")
    public static int[] field725;

    @ObfuscatedName("client.rt")
    public static int field698;

    @ObfuscatedName("client.ri")
    public static int field644;

    @ObfuscatedName("client.rn")
    public static String field753;

    @ObfuscatedName("client.rl")
    public static long[] field786;

    @ObfuscatedName("client.rq")
    public static int field730;

    @ObfuscatedName("client.ru")
    public static int field530;

    @ObfuscatedName("client.rf")
    public static int[] field732;

    @ObfuscatedName("client.rs")
    public static int[] field750;

    @ObfuscatedName("client.rg")
    public static long field734;

    @ObfuscatedName("client.rj")
    public static class141[] field548;

    @ObfuscatedName("client.rm")
    public static class150[] field769;

    @ObfuscatedName("client.rb")
    public static int field737;

    @ObfuscatedName("client.rz")
    public static int field738;

    @ObfuscatedName("client.rx")
    public static int[] field739;

    @ObfuscatedName("client.ry")
    public static int[] field779;

    @ObfuscatedName("client.ra")
    public static class458[] field741;

    @ObfuscatedName("client.sn")
    public static int field742;

    @ObfuscatedName("client.sh")
    public static int field743;

    @ObfuscatedName("client.sk")
    public static int field723;

    @ObfuscatedName("client.sj")
    public static int field681;

    @ObfuscatedName("client.sz")
    public static boolean field652;

    @ObfuscatedName("client.sq")
    public static int field748;

    @ObfuscatedName("client.sy")
    public static int[] field749;

    @ObfuscatedName("client.sr")
    public static int[] field549;

    @ObfuscatedName("client.si")
    public static int[] field611;

    @ObfuscatedName("client.sb")
    public static int[] field781;

    @ObfuscatedName("client.so")
    public static class37[] field729;

    @ObfuscatedName("client.sl")
    public static boolean field754;

    @ObfuscatedName("client.tl")
    public static boolean field545;

    @ObfuscatedName("client.tc")
    public static boolean[] field756;

    @ObfuscatedName("client.tz")
    public static int[] field576;

    @ObfuscatedName("client.td")
    public static int[] field758;

    @ObfuscatedName("client.tb")
    public static int[] field759;

    @ObfuscatedName("client.ta")
    public static int[] field760;

    @ObfuscatedName("client.th")
    public static short field761;

    @ObfuscatedName("client.tw")
    public static short field763;

    @ObfuscatedName("client.tx")
    public static short field649;

    @ObfuscatedName("client.tn")
    public static short field595;

    @ObfuscatedName("client.tt")
    public static short field765;

    @ObfuscatedName("client.ur")
    public static short field757;

    @ObfuscatedName("client.uu")
    public static short field538;

    @ObfuscatedName("client.uq")
    public static short field639;

    @ObfuscatedName("client.ux")
    public static int field535;

    @ObfuscatedName("client.uk")
    public static int field657;

    @ObfuscatedName("client.ua")
    public static int field771;

    @ObfuscatedName("client.um")
    public static int field772;

    @ObfuscatedName("client.ui")
    public static int field773;

    @ObfuscatedName("client.uw")
    public static class294 field774;

    @ObfuscatedName("client.us")
    public static int field567;

    @ObfuscatedName("client.ut")
    public static int field716;

    @ObfuscatedName("client.uy")
    public static class415 field647;

    @ObfuscatedName("client.uj")
    public static class326[] field778;

    @ObfuscatedName("client.ue")
    public static class60 field496;

    @ObfuscatedName("client.uf")
    public static class257 field540;

    @ObfuscatedName("client.ud")
    public static class257 field780;

    @ObfuscatedName("client.ug")
    public static int field619;

    @ObfuscatedName("client.va")
    public static int field783;

    @ObfuscatedName("client.vc")
    public static ArrayList field568;

    @ObfuscatedName("client.vw")
    public static int field785;

    @ObfuscatedName("client.vd")
    public static int field614;

    @ObfuscatedName("client.vy")
    public static final class59 field787;

    @ObfuscatedName("client.vt")
    public static int[] field788;

    @ObfuscatedName("client.vo")
    public static int[] field789;

    static {
        int var0 = "com_jagex_auth_desktop_osrs:public".length();
        byte[] var1 = new byte[var0];
        for (int var2 = 0; var2 < var0; var2++) {
            char var3 = "com_jagex_auth_desktop_osrs:public".charAt(var2);
            if (var3 > 127) {
                var1[var2] = 63;
            } else {
                var1[var2] = (byte) var3;
            }
        }
        field662 = class344.method3668(var1);
        field541 = false;
        field712 = new class71();
        field546 = null;
        field547 = new class92[32768];
        field690 = 0;
        field514 = new int[32768];
        field550 = 0;
        field551 = new int[250];
        field552 = new class101();
        field553 = 0;
        field554 = false;
        field555 = new class357();
        field623 = new HashMap();
        field524 = 0;
        field586 = 1;
        field559 = 0;
        field560 = 1;
        field775 = 0;
        field562 = new class192[4];
        field563 = false;
        field564 = new int[4][13][13];
        field565 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field744 = 0;
        field509 = 2301979;
        field717 = 5063219;
        field569 = 3353893;
        field728 = 7759444;
        field571 = false;
        field589 = 0;
        field573 = 128;
        field574 = 0;
        field575 = 0;
        field615 = 0;
        field767 = 0;
        field578 = 0;
        field579 = 0;
        field580 = 50;
        field581 = 0;
        field582 = 0;
        field583 = 0;
        field584 = 12;
        field585 = 6;
        field755 = 0;
        field587 = false;
        field631 = 0;
        field544 = false;
        field590 = 0;
        field570 = 0;
        field592 = 50;
        field593 = new int[field592];
        field782 = new int[field592];
        field556 = new int[field592];
        field596 = new int[field592];
        field733 = new int[field592];
        field598 = new int[field592];
        field599 = new int[field592];
        field600 = new String[field592];
        field709 = new int[104][104];
        field762 = 0;
        field603 = -1;
        field604 = -1;
        field605 = 0;
        field606 = 0;
        field607 = 0;
        field608 = 0;
        field609 = true;
        field610 = 0;
        field636 = 0;
        field597 = 0;
        field613 = 0;
        field704 = 0;
        field727 = 0;
        field764 = false;
        field617 = 0;
        field618 = 0;
        field533 = true;
        field620 = new class85[2048];
        field621 = -1;
        field622 = 0;
        field499 = -1L;
        field624 = true;
        field625 = 0;
        field626 = 0;
        field776 = new int[1000];
        field663 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field629 = new String[8];
        field630 = new boolean[8];
        field648 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field632 = -1;
        field680 = new class336[4][104][104];
        field634 = new class336();
        field635 = new class336();
        field633 = new class336();
        field637 = new int[25];
        field638 = new int[25];
        field500 = new int[25];
        field521 = false;
        field641 = false;
        field642 = 0;
        field643 = new int[500];
        field735 = new int[500];
        field645 = new int[500];
        field646 = new int[500];
        field616 = new int[500];
        field731 = new String[500];
        field502 = new String[500];
        field768 = new boolean[500];
        field651 = false;
        field668 = false;
        field653 = false;
        field726 = true;
        field655 = -1;
        field656 = -1;
        field561 = 0;
        field658 = 50;
        field659 = 0;
        field660 = null;
        field661 = false;
        field766 = -1;
        field650 = -1;
        field664 = null;
        field665 = null;
        field666 = -1;
        field667 = new class422(8);
        field594 = 0;
        field669 = -1;
        field670 = 0;
        field566 = 0;
        field628 = null;
        field673 = 0;
        field674 = 0;
        field675 = 0;
        field676 = -1;
        field677 = false;
        field740 = null;
        field601 = null;
        field777 = null;
        field510 = 0;
        field682 = 0;
        field683 = null;
        field684 = false;
        field784 = -1;
        field745 = -1;
        field687 = false;
        field688 = -1;
        field689 = -1;
        field770 = false;
        field691 = 1;
        field692 = new int[32];
        field558 = 0;
        field694 = new int[32];
        field695 = 0;
        field696 = new int[32];
        field697 = 0;
        field591 = new int[32];
        field699 = 0;
        field700 = 0;
        field701 = 0;
        field702 = 0;
        field703 = 0;
        field746 = 0;
        field705 = 0;
        field706 = 0;
        field707 = 0;
        field686 = 0;
        field678 = new class336();
        field710 = new class336();
        field627 = new class336();
        field724 = new class422(512);
        field713 = 0;
        field714 = -2;
        field715 = new boolean[100];
        field557 = new boolean[100];
        field672 = new boolean[100];
        field718 = new int[100];
        field719 = new int[100];
        field492 = new int[100];
        field721 = new int[100];
        field654 = 0;
        field679 = 0L;
        field736 = true;
        field725 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field698 = 0;
        field644 = 0;
        field753 = "";
        field786 = new long[100];
        field730 = 0;
        field530 = 0;
        field732 = new int[128];
        field750 = new int[128];
        field734 = -1L;
        field548 = new class141[4];
        field769 = new class150[4];
        field737 = -1;
        field738 = 0;
        field739 = new int[1000];
        field779 = new int[1000];
        field741 = new class458[1000];
        field742 = 0;
        field743 = 0;
        field723 = 0;
        field681 = -1;
        field652 = false;
        field748 = 0;
        field749 = new int[50];
        field549 = new int[50];
        field611 = new int[50];
        field781 = new int[50];
        field729 = new class37[50];
        field754 = false;
        field545 = false;
        field756 = new boolean[5];
        field576 = new int[5];
        field758 = new int[5];
        field759 = new int[5];
        field760 = new int[5];
        field761 = 256;
        field763 = 205;
        field649 = 256;
        field595 = 320;
        field765 = 1;
        field757 = 32767;
        field538 = 1;
        field639 = 32767;
        field535 = 0;
        field657 = 0;
        field771 = 0;
        field772 = 0;
        field773 = 0;
        field774 = new class294();
        field567 = -1;
        field716 = -1;
        field647 = new class413();
        field778 = new class326[8];
        field496 = new class60();
        field540 = new class257(64);
        field780 = new class257(64);
        field619 = -1;
        field783 = -1;
        field568 = new ArrayList(10);
        field785 = 0;
        field614 = 0;
        field787 = new class59();
        field788 = new int[50];
        field789 = new int[50];
    }

    @ObfuscatedName("dq.el(I)Lpi;")
    public static class417 method2659() {
        return Statics.field422;
    }

    @ObfuscatedName("client.am(B)V")
    public final void method462() {
    }

    public final void init() {
        if (!this.method466()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class93.field1258)) {
                            field685 = true;
                        } else {
                            field685 = false;
                        }
                        break;
                    case 4:
                        if (field693 == -1) {
                            field693 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field494 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var4 = Integer.parseInt(var2);
                        class332 var5;
                        if (var4 >= 0 && var4 < class332.field4144.length) {
                            var5 = class332.field4144[var4];
                        } else {
                            var5 = null;
                        }
                        Statics.field3203 = var5;
                        break;
                    case 7:
                        int var6 = Integer.parseInt(var2);
                        class305[] var7 = class305.method56();
                        int var8 = 0;
                        class305 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class305 var9 = var7[var8];
                            if (var9.field3632 == var6) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field2826 = var10;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class93.field1258)) {
                        }
                        break;
                    case 9:
                        Statics.field1280 = var2;
                        break;
                    case 10:
                        Statics.field1730 = (class306) class331.method5118(class306.method3162(), Integer.parseInt(var2));
                        if (Statics.field1730 == class306.field3638) {
                            Statics.field1304 = class425.field4649;
                        } else {
                            Statics.field1304 = class425.field4651;
                        }
                        break;
                    case 11:
                        Statics.field1165 = var2;
                        break;
                    case 12:
                        field493 = Integer.parseInt(var2);
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                    case 24:
                    default:
                        break;
                    case 14:
                        Statics.field1394 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field495 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2880 = var2;
                        break;
                    case 21:
                        field498 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            Integer.parseInt(var2);
                        } else {
                            Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        method2464();
        Statics.field2701 = this.getCodeBase().getHost();
        String var11 = Statics.field2826.field3629;
        byte var12 = 0;
        try {
            class159.method635("oldschool", var11, var12, 22);
        } catch (Exception var14) {
            Statics.method3146((String) null, var14);
        }
        Statics.field4326 = this;
        Statics.field1568 = field693;
        if (field572 == -1) {
            field572 = 0;
        }
        Statics.field4663 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field2774 = System.getenv("JX_REFRESH_TOKEN");
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field536 = true;
        }
        this.method447(765, 503, 208, 1);
    }

    @ObfuscatedName("ci.fc(B)V")
    public static final void method2464() {
        class205.field2470 = false;
        field497 = false;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field534 = arg0;
            class69.method2876(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field720 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field612 == 10;
    }

    public long getAccountHash() {
        return this.field711;
    }

    @ObfuscatedName("client.fr(B)Z")
    public boolean method1123() {
        return Statics.field4663 != null && !Statics.field4663.trim().isEmpty() && Statics.field2774 != null && !Statics.field2774.trim().isEmpty();
    }

    @ObfuscatedName("client.fg(I)Z")
    public boolean method1124() {
        return this.field534 != null;
    }

    @ObfuscatedName("client.fv(Ljava/lang/String;I)V")
    public void method1500(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field1165 + "shield/oauth/token" + (new class403(var2)).method6639());
        HashMap var4 = new HashMap();
        var4.put("Authorization", "Basic " + field662);
        var4.put("Host", (new URL(Statics.field1165)).getHost());
        var4.put("Accept", class400.field4471.method6621());
        class10 var5 = class10.field35;
        RefreshAccessTokenRequester var6 = this.field720;
        if (var6 != null) {
            this.field539 = var6.request(var5.method72(), var3, var4, "");
            return;
        }
        class11 var7 = new class11(var3, var5, this.field536);
        Iterator var8 = var4.entrySet().iterator();
        while (var8.hasNext()) {
            Entry var9 = (Entry) var8.next();
            var7.method86((String) var9.getKey(), (String) var9.getValue());
        }
        this.field537 = this.field532.method182(var7);
    }

    @ObfuscatedName("client.fm(Ljava/lang/String;I)V")
    public void method1126(String arg0) throws MalformedURLException, IOException {
        URL var2 = new URL(Statics.field1165 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        HashMap var3 = new HashMap();
        var3.put("Authorization", "Bearer " + arg0);
        class10 var4 = class10.field33;
        OtlTokenRequester var5 = this.field534;
        if (var5 != null) {
            this.field516 = var5.request(var4.method72(), var2, var3, "");
            return;
        }
        class11 var6 = new class11(var2, var4, this.field536);
        Iterator var7 = var3.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            var6.method86((String) var8.getKey(), (String) var8.getValue());
        }
        this.field577 = this.field532.method182(var6);
    }

    @ObfuscatedName("client.z(I)V")
    public final void method581() {
        class355.method5342(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field1256 = field495 == 0 ? 43594 : field493 + 40000;
        Statics.field1754 = field495 == 0 ? 443 : field493 + 50000;
        Statics.field1395 = Statics.field1256;
        Statics.field1590 = class295.field3371;
        Statics.field4280 = class295.field3372;
        Statics.field2866 = class295.field3373;
        Statics.field3289 = class295.field3374;
        Statics.field1337 = new class103(this.field536, 208);
        this.method441();
        this.method442();
        Statics.field1612 = this.method456();
        Statics.field993 = new class383(255, class159.field1767, class159.field1768, 500000);
        Statics.field1108 = class90.method1035();
        this.method439();
        class30.method113(this, Statics.field4195);
        method4272(Statics.field1108.method2303());
        Statics.field3345 = new class62(Statics.field1304);
        this.field532 = new class15("tokenRequest", 1, 1);
    }

    @ObfuscatedName("client.o(I)V")
    public final void method458() {
        field504++;
        this.method1127();
        class314.method2994();
        try {
            if (class275.field3228 == 1) {
                int var1 = Statics.field1623.method4915();
                if (var1 > 0 && Statics.field1623.method4877()) {
                    int var2 = var1 - Statics.field1871;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field1623.method4870(var2);
                } else {
                    Statics.field1623.method4876();
                    Statics.field1623.method4874();
                    if (Statics.field3225 == null) {
                        class275.field3228 = 0;
                    } else {
                        class275.field3228 = 2;
                    }
                    Statics.field3229 = null;
                    Statics.field175 = null;
                }
            }
        } catch (Exception var13) {
            var13.printStackTrace();
            Statics.field1623.method4876();
            class275.field3228 = 0;
            Statics.field3229 = null;
            Statics.field175 = null;
            Statics.field3225 = null;
        }
        method183();
        class24 var4 = class24.field133;
        synchronized (class24.field133) {
            class24.field148++;
            class24.field145 = class24.field147;
            class24.field142 = 0;
            class24.field124 = 0;
            Arrays.fill(class24.field134, false);
            Arrays.fill(class24.field135, false);
            if (class24.field132 < 0) {
                Arrays.fill(class24.field123, false);
                class24.field132 = class24.field137;
            } else {
                while (class24.field137 != class24.field132) {
                    int var5 = class24.field136[class24.field137];
                    class24.field137 = class24.field137 + 1 & 0x7F;
                    if (var5 < 0) {
                        int var6 = ~var5;
                        if (class24.field123[var6]) {
                            class24.field123[var6] = false;
                            class24.field135[var6] = true;
                            class24.field144[class24.field124] = var6;
                            class24.field124++;
                        }
                    } else {
                        if (!class24.field123[var5] && class24.field142 < class24.field141.length - 1) {
                            class24.field134[var5] = true;
                            class24.field141[++class24.field142 - 1] = var5;
                        }
                        class24.field123[var5] = true;
                    }
                }
            }
            if (class24.field142 > 0) {
                class24.field148 = 0;
            }
            class24.field147 = class24.field146;
        }
        class33 var8 = class33.field223;
        synchronized (class33.field223) {
            class33.field229 = class33.field225;
            class33.field232 = class33.field226;
            class33.field231 = class33.field227;
            class33.field224 = class33.field234;
            class33.field237 = class33.field233;
            class33.field238 = class33.field228;
            class33.field239 = class33.field220;
            class33.field240 = class33.field221;
            class33.field233 = 0;
        }
        if (Statics.field1612 != null) {
            int var10 = Statics.field1612.method322();
            field686 = var10;
        }
        if (field612 == 0) {
            method3862();
            class32.method276();
        } else if (field612 == 5) {
            class69.method6080(this, Statics.field6);
            method3862();
            class32.method276();
        } else if (field612 == 10 || field612 == 11) {
            class69.method6080(this, Statics.field6);
        } else if (field612 == 20) {
            class69.method6080(this, Statics.field6);
            this.method1131();
        } else if (field612 == 50) {
            class69.method6080(this, Statics.field6);
            this.method1131();
        } else if (field612 == 25) {
            method4825();
        }
        if (field612 == 30) {
            this.method1132();
        } else if (field612 == 40 || field612 == 45) {
            this.method1131();
        }
    }

    @ObfuscatedName("client.as(ZS)V")
    public final void method473(boolean arg0) {
        boolean var2 = class275.method1938();
        if (var2 && field652 && Statics.field2878 != null) {
            Statics.field2878.method750();
        }
        if ((field612 == 10 || field612 == 20 || field612 == 30) && field679 != 0L && class271.method5624() > field679) {
            method4272(method4268());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field715[var3] = true;
            }
        }
        if (field612 == 0) {
            this.method461(class69.field906, class69.field900, arg0);
        } else if (field612 == 5) {
            class69.method4290(Statics.field181, Statics.field1752, Statics.field6);
        } else if (field612 == 10 || field612 == 11) {
            class69.method4290(Statics.field181, Statics.field1752, Statics.field6);
        } else if (field612 == 20) {
            class69.method4290(Statics.field181, Statics.field1752, Statics.field6);
        } else if (field612 == 50) {
            class69.method4290(Statics.field181, Statics.field1752, Statics.field6);
        } else if (field612 == 25) {
            if (field775 == 1) {
                if (field524 > field586) {
                    field586 = field524;
                }
                int var4 = (field586 * 50 - field524 * 50) / field586;
                method2959(class310.field3666 + class93.field1264 + class93.field1261 + var4 + "%" + class93.field1262, false);
            } else if (field775 == 2) {
                if (field559 > field560) {
                    field560 = field559;
                }
                int var5 = (field560 * 50 - field559 * 50) / field560 + 50;
                method2959(class310.field3666 + class93.field1264 + class93.field1261 + var5 + "%" + class93.field1262, false);
            } else {
                method2959(class310.field3666, false);
            }
        } else if (field612 == 30) {
            this.method1134();
        } else if (field612 == 40) {
            method2959(class310.field3763 + class93.field1264 + class310.field3706, false);
        } else if (field612 == 45) {
            method2959(class310.field3826, false);
        }
        if (field612 == 30 && field654 == 0 && !arg0 && !field736) {
            for (int var6 = 0; var6 < field713; var6++) {
                if (field557[var6]) {
                    Statics.field114.method422(field718[var6], field719[var6], field492[var6], field721[var6]);
                    field557[var6] = false;
                }
            }
        } else if (field612 > 0) {
            Statics.field114.method421(0, 0);
            for (int var7 = 0; var7 < field713; var7++) {
                field557[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.ac(I)V")
    public final void method583() {
        if (Statics.field4652.method2478()) {
            Statics.field4652.method2475();
        }
        if (Statics.field3189 != null) {
            Statics.field3189.field1058 = false;
        }
        Statics.field3189 = null;
        field552.method2536();
        if (class24.field133 != null) {
            class24 var1 = class24.field133;
            synchronized (class24.field133) {
                class24.field133 = null;
            }
        }
        class33.method3659();
        Statics.field1612 = null;
        if (Statics.field2878 != null) {
            Statics.field2878.method729();
        }
        if (Statics.field747 != null) {
            Statics.field747.method729();
        }
        class318.method190();
        class314.method2877();
        if (Statics.field1337 != null) {
            Statics.field1337.method2574();
            Statics.field1337 = null;
        }
        try {
            class159.field1767.method6995();
            for (int var3 = 0; var3 < Statics.field1763; var3++) {
                Statics.field1761[var3].method6995();
            }
            class159.field1768.method6995();
            class159.field1764.method6995();
        } catch (Exception var6) {
        }
        this.field532.method186();
    }

    @ObfuscatedName("kz.fl(II)V")
    public static void method5138(int arg0) {
        if (field612 == arg0) {
            return;
        }
        if (field612 == 0) {
            Statics.field4326.method487();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method2946(0);
            field526 = 0;
            field527 = 0;
            field555.method6086(arg0);
            if (arg0 != 20) {
                method2552(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2238 != null) {
            Statics.field2238.method6345();
            Statics.field2238 = null;
        }
        if (field612 == 25) {
            field775 = 0;
            field524 = 0;
            field586 = 1;
            field559 = 0;
            field560 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = method5880() ? 0 : 12;
            class69.method2267(Statics.field1800, Statics.field990, true, var2);
        } else if (arg0 == 20) {
            int var1 = field612 == 11 ? 4 : 0;
            class69.method2267(Statics.field1800, Statics.field990, false, var1);
        } else if (arg0 == 11) {
            class69.method2267(Statics.field1800, Statics.field990, false, 4);
        } else if (arg0 == 50) {
            class69.method2109("", "Updating date of birth...", "");
            class69.method2267(Statics.field1800, Statics.field990, false, 7);
        } else {
            class69.method1747();
        }
        field612 = arg0;
    }

    @ObfuscatedName("client.fn(B)V")
    public void method1127() {
        if (field612 == 1000) {
            return;
        }
        long var1 = class271.method5624();
        int var3 = (int) (var1 - Statics.field4059);
        Statics.field4059 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class318.field4058 += var3;
        boolean var4;
        if (class318.field4070 == 0 && class318.field4063 == 0 && class318.field4066 == 0 && class318.field4061 == 0) {
            var4 = true;
        } else if (Statics.field4075 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class318.field4058 > 30000) {
                        throw new IOException();
                    }
                    while (class318.field4063 < 200 && class318.field4061 > 0) {
                        class316 var5 = (class316) class318.field4060.method6943();
                        class445 var6 = new class445(4);
                        var6.method7179(1);
                        var6.method7258((int) var5.field4504);
                        Statics.field4075.method6356(var6.field4733, 0, 4);
                        class318.field4062.method6948(var5, var5.field4504);
                        class318.field4061--;
                        class318.field4063++;
                    }
                    while (class318.field4070 < 200 && class318.field4066 > 0) {
                        class316 var7 = (class316) class318.field4064.method5631();
                        class445 var8 = new class445(4);
                        var8.method7179(0);
                        var8.method7258((int) var7.field4504);
                        Statics.field4075.method6356(var8.field4733, 0, 4);
                        var7.method6653();
                        class318.field4067.method6948(var7, var7.field4504);
                        class318.field4066--;
                        class318.field4070++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field4075.method6341();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class318.field4058 = 0;
                        byte var11 = 0;
                        if (Statics.field1606 == null) {
                            var11 = 8;
                        } else if (class318.field4076 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class318.field4057.field4735;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field4075.method6343(class318.field4057.field4733, class318.field4057.field4735, var12);
                            if (class318.field4069 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class318.field4057.field4733[class318.field4057.field4735 + var13] ^= class318.field4069;
                                }
                            }
                            class318.field4057.field4735 += var12;
                            if (class318.field4057.field4735 < var11) {
                                break;
                            }
                            if (Statics.field1606 == null) {
                                class318.field4057.field4735 = 0;
                                int var14 = class318.field4057.method7196();
                                int var15 = class318.field4057.method7198();
                                int var16 = class318.field4057.method7196();
                                int var17 = class318.field4057.method7201();
                                long var18 = (long) ((var14 << 16) + var15);
                                class316 var20 = (class316) class318.field4062.method6941(var18);
                                Statics.field2887 = true;
                                if (var20 == null) {
                                    var20 = (class316) class318.field4067.method6941(var18);
                                    Statics.field2887 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1606 = var20;
                                Statics.field117 = new class445(var17 + var21 + Statics.field1606.field4037);
                                Statics.field117.method7179(var16);
                                Statics.field117.method7364(var17);
                                class318.field4076 = 8;
                                class318.field4057.field4735 = 0;
                            } else if (class318.field4076 == 0) {
                                if (class318.field4057.field4733[0] == -1) {
                                    class318.field4076 = 1;
                                    class318.field4057.field4735 = 0;
                                } else {
                                    Statics.field1606 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field117.field4733.length - Statics.field1606.field4037;
                            int var23 = 512 - class318.field4076;
                            if (var23 > var22 - Statics.field117.field4735) {
                                var23 = var22 - Statics.field117.field4735;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field4075.method6343(Statics.field117.field4733, Statics.field117.field4735, var23);
                            if (class318.field4069 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field117.field4733[Statics.field117.field4735 + var24] ^= class318.field4069;
                                }
                            }
                            Statics.field117.field4735 += var23;
                            class318.field4076 += var23;
                            if (Statics.field117.field4735 == var22) {
                                if (Statics.field1606.field4504 == 16711935L) {
                                    Statics.field1811 = Statics.field117;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class315 var26 = class318.field4072[var25];
                                        if (var26 != null) {
                                            class318.method4660(var26, var25);
                                        }
                                    }
                                } else {
                                    class318.field4071.reset();
                                    class318.field4071.update(Statics.field117.field4733, 0, var22);
                                    int var27 = (int) class318.field4071.getValue();
                                    if (Statics.field1606.field4036 != var27) {
                                        try {
                                            Statics.field4075.method6345();
                                        } catch (Exception var33) {
                                        }
                                        class318.field4065++;
                                        Statics.field4075 = null;
                                        class318.field4069 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class318.field4065 = 0;
                                    class318.field4077 = 0;
                                    Statics.field1606.field4035.method5384((int) (Statics.field1606.field4504 & 0xFFFFL), Statics.field117.field4733, (Statics.field1606.field4504 & 0xFF0000L) == 16711680L, Statics.field2887);
                                }
                                Statics.field1606.method6657();
                                if (Statics.field2887) {
                                    class318.field4063--;
                                } else {
                                    class318.field4070--;
                                }
                                class318.field4076 = 0;
                                Statics.field1606 = null;
                                Statics.field117 = null;
                            } else {
                                if (class318.field4076 != 512) {
                                    break;
                                }
                                class318.field4076 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var34) {
                try {
                    Statics.field4075.method6345();
                } catch (Exception var32) {
                }
                class318.field4077++;
                Statics.field4075 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1129();
        }
    }

    @ObfuscatedName("client.fp(B)V")
    public void method1129() {
        if (class318.field4065 >= 4) {
            this.method463("js5crc");
            method5138(1000);
            return;
        }
        if (class318.field4077 >= 4) {
            if (field612 <= 5) {
                this.method463("js5io");
                method5138(1000);
                return;
            }
            field523 = 3000;
            class318.field4077 = 3;
        }
        if (--field523 + 1 > 0) {
            return;
        }
        try {
            if (field522 == 0) {
                Statics.field1904 = Statics.field58.method3092(Statics.field2701, Statics.field1395);
                field522++;
            }
            if (field522 == 1) {
                if (Statics.field1904.field1815 == 2) {
                    this.method1130(-1);
                    return;
                }
                if (Statics.field1904.field1815 == 1) {
                    field522++;
                }
            }
            if (field522 == 2) {
                Socket var1 = (Socket) Statics.field1904.field1816;
                class380 var2 = new class380(var1, 40000, 5000);
                Statics.field2703 = var2;
                class445 var3 = new class445(5);
                var3.method7179(15);
                var3.method7364(208);
                Statics.field2703.method6356(var3.field4733, 0, 5);
                field522++;
                Statics.field950 = class271.method5624();
            }
            if (field522 == 3) {
                if (Statics.field2703.method6341() > 0) {
                    int var4 = Statics.field2703.method6342();
                    if (var4 != 0) {
                        this.method1130(var4);
                        return;
                    }
                    field522++;
                } else if (class271.method5624() - Statics.field950 > 30000L) {
                    this.method1130(-2);
                    return;
                }
            }
            if (field522 == 4) {
                class318.method3336(Statics.field2703, field612 > 20);
                Statics.field1904 = null;
                Statics.field2703 = null;
                field522 = 0;
                field751 = 0;
            }
        } catch (IOException var6) {
            this.method1130(-3);
        }
    }

    @ObfuscatedName("client.fj(II)V")
    public void method1130(int arg0) {
        Statics.field1904 = null;
        Statics.field2703 = null;
        field522 = 0;
        if (Statics.field1395 == Statics.field1256) {
            Statics.field1395 = Statics.field1754;
        } else {
            Statics.field1395 = Statics.field1256;
        }
        field751++;
        if (field751 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field612 <= 5) {
                this.method463("js5connect_full");
                method5138(1000);
            } else {
                field523 = 3000;
            }
        } else if (field751 >= 2 && arg0 == 6) {
            this.method463("js5connect_outofdate");
            method5138(1000);
        } else if (field751 >= 4) {
            if (field612 <= 5) {
                this.method463("js5connect");
                method5138(1000);
            } else {
                field523 = 3000;
            }
        }
    }

    @ObfuscatedName("de.ff(I)I")
    public static int method2846() {
        if (field568 == null || field785 >= field568.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field785; var1++) {
            var0 += ((class77) field568.get(var1)).field1018;
        }
        return var0 * 10000 / field614;
    }

    @ObfuscatedName("jc.fx(II)I")
    public static int method4861(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("o.fi(III)V")
    public static void method370(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method4861(var4);
            int var6 = class202.field2396[var4];
            int var7 = method5076(var5, arg1);
            var2[var3] = var6 * var7 >> 16;
        }
        class205.method3903(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ge.fq(I)V")
    public static void method3862() {
        if (field708 == 0) {
            Statics.field3318 = new class205(4, 104, 104, class75.field998);
            for (int var0 = 0; var0 < 4; var0++) {
                field562[var0] = new class192(104, 104);
            }
            Statics.field61 = new class458(512, 512);
            class69.field900 = class310.field3669;
            class69.field906 = 5;
            field708 = 20;
        } else if (field708 == 20) {
            class69.field900 = class310.field3852;
            class69.field906 = 10;
            field708 = 30;
        } else if (field708 == 30) {
            Statics.field152 = method7121(0, false, true, true, false);
            Statics.field1927 = method7121(1, false, true, true, false);
            Statics.field1483 = method7121(2, true, false, true, false);
            Statics.field3615 = method7121(3, false, true, true, false);
            Statics.field1393 = method7121(4, false, true, true, false);
            Statics.field4699 = method7121(5, true, true, true, false);
            Statics.field77 = method7121(6, true, true, true, false);
            Statics.field2484 = method7121(7, false, true, true, false);
            Statics.field990 = method7121(8, false, true, true, false);
            Statics.field1082 = method7121(9, false, true, true, false);
            Statics.field1800 = method7121(10, false, true, true, false);
            Statics.field3326 = method7121(11, false, true, true, false);
            Statics.field1357 = method7121(12, false, true, true, false);
            Statics.field4356 = method7121(13, true, false, true, false);
            Statics.field85 = method7121(14, false, true, true, false);
            Statics.field110 = method7121(15, false, true, true, false);
            Statics.field1253 = method7121(17, true, true, true, false);
            Statics.field887 = method7121(18, false, true, true, false);
            Statics.field1390 = method7121(19, false, true, true, false);
            Statics.field3319 = method7121(20, false, true, true, false);
            Statics.field309 = method7121(21, false, true, true, true);
            class69.field900 = class310.field3671;
            class69.field906 = 20;
            field708 = 40;
        } else if (field708 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field152.method5382() * 4 / 100;
            int var3 = var2 + Statics.field1927.method5382() * 4 / 100;
            int var4 = var3 + Statics.field1483.method5382() * 2 / 100;
            int var5 = var4 + Statics.field3615.method5382() * 2 / 100;
            int var6 = var5 + Statics.field1393.method5382() * 6 / 100;
            int var7 = var6 + Statics.field4699.method5382() * 4 / 100;
            int var8 = var7 + Statics.field77.method5382() * 2 / 100;
            int var9 = var8 + Statics.field2484.method5382() * 55 / 100;
            int var10 = var9 + Statics.field990.method5382() * 2 / 100;
            int var11 = var10 + Statics.field1082.method5382() * 2 / 100;
            int var12 = var11 + Statics.field1800.method5382() * 2 / 100;
            int var13 = var12 + Statics.field3326.method5382() * 2 / 100;
            int var14 = var13 + Statics.field1357.method5382() * 2 / 100;
            int var15 = var14 + Statics.field4356.method5382() * 2 / 100;
            int var16 = var15 + Statics.field85.method5382() * 2 / 100;
            int var17 = var16 + Statics.field110.method5382() * 2 / 100;
            int var18 = var17 + Statics.field1390.method5382() / 100;
            int var19 = var18 + Statics.field887.method5382() / 100;
            int var20 = var19 + Statics.field3319.method5382() / 100;
            int var21 = var20 + Statics.field309.method5382() / 100;
            int var22 = var21 + (Statics.field1253.method5369() && Statics.field1253.method5419() ? 1 : 0);
            if (var22 == 100) {
                Statics.method2793(Statics.field152, "Animations");
                Statics.method2793(Statics.field1927, "Skeletons");
                Statics.method2793(Statics.field1393, "Sound FX");
                Statics.method2793(Statics.field4699, "Maps");
                Statics.method2793(Statics.field77, "Music Tracks");
                Statics.method2793(Statics.field2484, "Models");
                Statics.method2793(Statics.field990, "Sprites");
                Statics.method2793(Statics.field3326, "Music Jingles");
                Statics.method2793(Statics.field85, "Music Samples");
                Statics.method2793(Statics.field110, "Music Patches");
                Statics.method2793(Statics.field1390, "World Map");
                Statics.method2793(Statics.field887, "World Map Geography");
                Statics.method2793(Statics.field3319, "World Map Ground");
                Statics.field3204 = new class385();
                Statics.field3204.method6416(Statics.field1253);
                class69.field900 = class310.field3673;
                class69.field906 = 30;
                field708 = 45;
            } else {
                if (var22 != 0) {
                    class69.field900 = class310.field3672 + var22 + "%";
                }
                class69.field906 = 30;
            }
        } else if (field708 == 45) {
            class40.method3140(22050, !field497, 2);
            class276 var23 = new class276();
            var23.method4942(9, 128);
            Statics.field2878 = class40.method4612(Statics.field58, 0, 22050);
            Statics.field2878.method726(var23);
            class315 var24 = Statics.field110;
            class315 var25 = Statics.field85;
            class315 var26 = Statics.field1393;
            Statics.field3230 = var24;
            Statics.field3226 = var25;
            Statics.field3227 = var26;
            Statics.field1623 = var23;
            Statics.field747 = class40.method4612(Statics.field58, 1, 2048);
            Statics.field89 = new class36();
            Statics.field747.method726(Statics.field89);
            Statics.field4120 = new class53(22050, Statics.field308);
            class69.field900 = class310.field3674;
            class69.field906 = 35;
            field708 = 50;
            Statics.field2191 = new class418(Statics.field990, Statics.field4356);
        } else if (field708 == 50) {
            class419[] var27 = new class419[] { class419.field4620, class419.field4617, class419.field4618, class419.field4624, class419.field4621, class419.field4616 };
            int var28 = var27.length;
            class418 var29 = Statics.field2191;
            class419[] var30 = new class419[] { class419.field4620, class419.field4617, class419.field4618, class419.field4624, class419.field4621, class419.field4616 };
            field623 = var29.method6901(var30);
            if (field623.size() < var28) {
                class69.field900 = class310.field3943 + field623.size() * 100 / var28 + "%";
                class69.field906 = 40;
            } else {
                Statics.field1752 = (class351) field623.get(class419.field4618);
                Statics.field6 = (class351) field623.get(class419.field4617);
                Statics.field181 = (class351) field623.get(class419.field4620);
                Statics.field42 = field647.method6670();
                class69.field900 = class310.field3676;
                class69.field906 = 40;
                field708 = 60;
            }
        } else if (field708 == 60) {
            int var31 = class69.method636(Statics.field1800, Statics.field990);
            int var32 = class69.field928.length + class69.field897.length;
            if (var31 < var32) {
                class69.field900 = class310.field3677 + var31 * 100 / var32 + "%";
                class69.field906 = 50;
            } else {
                class69.field900 = class310.field3678;
                class69.field906 = 50;
                method5138(5);
                field708 = 70;
            }
        } else if (field708 == 70) {
            if (!Statics.field1483.method5419()) {
                class69.field900 = class310.field3914 + Statics.field1483.method5380() + "%";
                class69.field906 = 60;
            } else if (Statics.field309.method5419()) {
                class190.method172(Statics.field1483);
                class315 var34 = Statics.field1483;
                Statics.field2012 = var34;
                class315 var35 = Statics.field1483;
                class315 var36 = Statics.field2484;
                Statics.field1882 = var35;
                Statics.field4684 = var36;
                Statics.field1878 = Statics.field1882.method5425(3);
                class188.method3105(Statics.field1483, Statics.field2484, field497);
                class315 var37 = Statics.field1483;
                class315 var38 = Statics.field2484;
                Statics.field1949 = var37;
                Statics.field1930 = var38;
                class186.method2829(Statics.field1483);
                class189.method3333(Statics.field1483, Statics.field2484, field685, Statics.field1752);
                class315 var39 = Statics.field1483;
                class315 var40 = Statics.field152;
                class315 var41 = Statics.field1927;
                Statics.field2215 = var39;
                Statics.field1773 = var40;
                Statics.field2197 = var41;
                class181.method409(Statics.field1483, Statics.field2484);
                class315 var42 = Statics.field1483;
                Statics.field2026 = var42;
                class315 var43 = Statics.field1483;
                Statics.field1844 = var43;
                Statics.field1842 = Statics.field1844.method5425(16);
                class315 var44 = Statics.field3615;
                class315 var45 = Statics.field2484;
                class315 var46 = Statics.field990;
                class315 var47 = Statics.field4356;
                Statics.field243 = var44;
                Statics.field2729 = var45;
                Statics.field3386 = var46;
                Statics.field1786 = var47;
                Statics.field3331 = new class296[Statics.field243.method5426()][];
                Statics.field1084 = new boolean[Statics.field243.method5426()];
                class170.method3335(Statics.field1483);
                class177.method66(Statics.field1483);
                class173.method2512(Statics.field1483);
                class315 var48 = Statics.field1483;
                class315 var49 = Statics.field1483;
                Statics.field2035 = var49;
                class438.method6624(Statics.field1483);
                class440.method114(Statics.field1483);
                Statics.field1555 = new class430(Statics.field1730, 54, Statics.field3203, Statics.field1483);
                Statics.field1716 = new class430(Statics.field1730, 47, Statics.field3203, Statics.field1483);
                Statics.field4652 = new class99();
                class315 var50 = Statics.field1483;
                class315 var51 = Statics.field990;
                class315 var52 = Statics.field4356;
                Statics.field2062 = var50;
                Statics.field2050 = var51;
                Statics.field4863 = var52;
                class175.method2116(Statics.field1483, Statics.field990);
                class315 var53 = Statics.field1483;
                class315 var54 = Statics.field990;
                Statics.field1863 = var54;
                if (var53.method5419()) {
                    Statics.field1848 = var53.method5425(35);
                    Statics.field1853 = new class172[Statics.field1848];
                    for (int var55 = 0; var55 < Statics.field1848; var55++) {
                        byte[] var56 = var53.method5499(35, var55);
                        Statics.field1853[var55] = new class172(var55);
                        if (var56 != null) {
                            Statics.field1853[var55].method3176(new class445(var56));
                            Statics.field1853[var55].method3177();
                        }
                    }
                }
                class69.field900 = class310.field3680;
                class69.field906 = 60;
                field708 = 80;
            } else {
                class69.field900 = class310.field3914 + (80 + Statics.field1357.method5380() / 6) + "%";
                class69.field906 = 60;
            }
        } else if (field708 == 80) {
            int var57 = 0;
            if (Statics.field81 == null) {
                Statics.field81 = class459.method2680(Statics.field990, Statics.field3204.field4413, 0);
            } else {
                var57++;
            }
            if (Statics.field859 == null) {
                Statics.field859 = class459.method2680(Statics.field990, Statics.field3204.field4409, 0);
            } else {
                var57++;
            }
            if (Statics.field2744 == null) {
                Statics.field2744 = class459.method6582(Statics.field990, Statics.field3204.field4410, 0);
            } else {
                var57++;
            }
            if (Statics.field19 == null) {
                Statics.field19 = class459.method7564(Statics.field990, Statics.field3204.field4411, 0);
            } else {
                var57++;
            }
            if (Statics.field169 == null) {
                Statics.field169 = class459.method7564(Statics.field990, Statics.field3204.field4412, 0);
            } else {
                var57++;
            }
            if (Statics.field1603 == null) {
                Statics.field1603 = class459.method7564(Statics.field990, Statics.field3204.field4418, 0);
            } else {
                var57++;
            }
            if (Statics.field1322 == null) {
                Statics.field1322 = class459.method7564(Statics.field990, Statics.field3204.field4408, 0);
            } else {
                var57++;
            }
            if (Statics.field1990 == null) {
                Statics.field1990 = class459.method7564(Statics.field990, Statics.field3204.field4414, 0);
            } else {
                var57++;
            }
            if (Statics.field3551 == null) {
                Statics.field3551 = class459.method7564(Statics.field990, Statics.field3204.field4415, 0);
            } else {
                var57++;
            }
            if (Statics.field991 == null) {
                Statics.field991 = class459.method6582(Statics.field990, Statics.field3204.field4417, 0);
            } else {
                var57++;
            }
            if (Statics.field870 == null) {
                Statics.field870 = class459.method6582(Statics.field990, Statics.field3204.field4416, 0);
            } else {
                var57++;
            }
            if (var57 < 11) {
                class69.field900 = class310.field3699 + var57 * 100 / 12 + "%";
                class69.field906 = 70;
            } else {
                Statics.field4227 = Statics.field870;
                Statics.field859.method7596();
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 21.0D) - 10;
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2744[0].method7572(var58 + var61, var59 + var61, var60 + var61);
                class69.field900 = class310.field3682;
                class69.field906 = 70;
                field708 = 90;
            }
        } else if (field708 == 90) {
            if (Statics.field1082.method5419()) {
                Statics.field1564 = new class210(Statics.field1082, Statics.field990, 20, Statics.field1108.method2279(), field497 ? 64 : 128);
                class202.method3763(Statics.field1564);
                class202.method3764(Statics.field1108.method2279());
                field708 = 100;
            } else {
                class69.field900 = class310.field3683 + "0%";
                class69.field906 = 90;
            }
        } else if (field708 == 100) {
            int var62 = Statics.field1564.method4101();
            if (var62 < 100) {
                class69.field900 = class310.field3683 + var62 + "%";
                class69.field906 = 90;
            } else {
                class69.field900 = class310.field3684;
                class69.field906 = 90;
                field708 = 110;
            }
        } else if (field708 == 110) {
            Statics.field3189 = new class82();
            Statics.field58.method3093(Statics.field3189, 10);
            class69.field900 = class310.field3762;
            class69.field906 = 92;
            field708 = 120;
        } else if (field708 == 120) {
            if (Statics.field1800.method5431("huffman", "")) {
                class283 var63 = new class283(Statics.field1800.method5501("huffman", ""));
                Statics.field3324 = var63;
                class69.field900 = class310.field3687;
                class69.field906 = 94;
                field708 = 130;
            } else {
                class69.field900 = class310.field3686 + "%";
                class69.field906 = 94;
            }
        } else if (field708 == 130) {
            if (!Statics.field3615.method5419()) {
                class69.field900 = class310.field3688 + Statics.field3615.method5380() * 4 / 5 + "%";
                class69.field906 = 96;
            } else if (!Statics.field1357.method5419()) {
                class69.field900 = class310.field3688 + (80 + Statics.field1357.method5380() / 6) + "%";
                class69.field906 = 96;
            } else if (Statics.field4356.method5419()) {
                class69.field900 = class310.field3689;
                class69.field906 = 98;
                field708 = 140;
            } else {
                class69.field900 = class310.field3688 + (96 + Statics.field4356.method5380() / 50) + "%";
                class69.field906 = 96;
            }
        } else if (field708 == 140) {
            class69.field906 = 100;
            if (Statics.field1390.method5436(class245.field2897.field2898)) {
                if (Statics.field422 == null) {
                    Statics.field422 = new class417();
                    Statics.field422.method6870(Statics.field1390, Statics.field887, Statics.field3319, Statics.field181, field623, Statics.field2744);
                }
                class69.field900 = class310.field3691;
                field708 = 150;
            } else {
                class69.field900 = class310.field3810 + Statics.field1390.method5438(class245.field2897.field2898) / 10 + "%";
            }
        } else if (field708 == 150) {
            method5138(10);
        }
    }

    @ObfuscatedName("pp.fo(IZZZZI)Llb;")
    public static class315 method7121(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class383 var5 = null;
        if (class159.field1767 != null) {
            var5 = new class383(arg0, class159.field1767, Statics.field1761[arg0], 1000000);
        }
        return new class315(var5, Statics.field993, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.fh(I)V")
    public final void method1131() {
        class379 var1 = field552.method2549();
        class444 var2 = field552.field1343;
        try {
            if (field525 == 0) {
                if (Statics.field172 == null && (field712.method2009() || field526 > 250)) {
                    Statics.field172 = field712.method2008();
                    field712.method2018();
                    field712 = null;
                }
                if (Statics.field172 != null) {
                    if (var1 != null) {
                        var1.method6345();
                        var1 = null;
                    }
                    Statics.field1831 = null;
                    field554 = false;
                    field526 = 0;
                    if (field640.method7456()) {
                        try {
                            this.method1500(Statics.field2774);
                            method2946(21);
                        } catch (Throwable var73) {
                            Statics.method3146((String) null, var73);
                            method171(65);
                            return;
                        }
                    } else {
                        method2946(1);
                    }
                }
            }
            if (field525 == 21) {
                if (this.field539 == null) {
                    if (this.field537 == null) {
                        method171(65);
                        return;
                    }
                    if (!this.field537.method285()) {
                        return;
                    }
                    if (this.field537.method283()) {
                        Statics.method3146(this.field537.method282(), (Throwable) null);
                        method171(65);
                        this.field537 = null;
                        return;
                    }
                    class22 var6 = this.field537.method280();
                    if (var6.method300() != 200) {
                        method171(65);
                        this.field537 = null;
                        return;
                    }
                    field526 = 0;
                    class402 var7 = new class402(var6.method301());
                    try {
                        Statics.field4663 = var7.method6629().getString("access_token");
                        Statics.field2774 = var7.method6629().getString("refresh_token");
                    } catch (Exception var71) {
                        Statics.method3146("Error parsing tokens", var71);
                        method171(65);
                        this.field537 = null;
                        return;
                    }
                } else if (this.field539.isDone()) {
                    if (this.field539.isCancelled()) {
                        method171(65);
                        this.field539 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var4 = (RefreshAccessTokenResponse) this.field539.get();
                        if (!var4.isSuccess()) {
                            method171(65);
                            this.field539 = null;
                            return;
                        }
                        Statics.field4663 = var4.getAccessToken();
                        Statics.field2774 = var4.getRefreshToken();
                        this.field539 = null;
                    } catch (Exception var72) {
                        Statics.method3146((String) null, var72);
                        method171(65);
                        this.field539 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1126(Statics.field4663);
                method2946(20);
            }
            if (field525 == 20) {
                if (this.field516 == null) {
                    if (this.field577 == null) {
                        method171(65);
                        return;
                    }
                    if (!this.field577.method285()) {
                        return;
                    }
                    if (this.field577.method283()) {
                        Statics.method3146(this.field577.method282(), (Throwable) null);
                        method171(65);
                        this.field577 = null;
                        return;
                    }
                    class22 var11 = this.field577.method280();
                    if (var11.method300() != 200) {
                        Statics.method3146("Response code: " + var11.method300() + "Response body: " + var11.method301(), (Throwable) null);
                        method171(65);
                        this.field577 = null;
                        return;
                    }
                    this.field531 = var11.method301();
                    this.field577 = null;
                } else if (this.field516.isDone()) {
                    if (this.field516.isCancelled()) {
                        method171(65);
                        this.field516 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var9 = (OtlTokenResponse) this.field516.get();
                        if (!var9.isSuccess()) {
                            method171(65);
                            this.field516 = null;
                            return;
                        }
                        this.field531 = var9.getToken();
                        this.field516 = null;
                    } catch (Exception var70) {
                        Statics.method3146((String) null, var70);
                        method171(65);
                        this.field516 = null;
                        return;
                    }
                } else {
                    return;
                }
                field526 = 0;
                method2946(1);
            }
            if (field525 == 1) {
                if (Statics.field1831 == null) {
                    Statics.field1831 = Statics.field58.method3092(Statics.field2701, Statics.field1395);
                }
                if (Statics.field1831.field1815 == 2) {
                    throw new IOException();
                }
                if (Statics.field1831.field1815 == 1) {
                    Socket var12 = (Socket) Statics.field1831.field1816;
                    class380 var13 = new class380(var12, 40000, 5000);
                    var1 = var13;
                    field552.method2535(var13);
                    Statics.field1831 = null;
                    method2946(2);
                }
            }
            if (field525 == 2) {
                field552.method2532();
                class266 var14 = class266.method768();
                var14.field3070 = null;
                var14.field3062 = 0;
                var14.field3064 = new class444(5000);
                var14.field3064.method7179(class268.field3183.field3186);
                field552.method2534(var14);
                field552.method2544();
                var2.field4735 = 0;
                method2946(3);
            }
            if (field525 == 3) {
                if (Statics.field2878 != null) {
                    Statics.field2878.method751();
                }
                if (Statics.field747 != null) {
                    Statics.field747.method751();
                }
                if (var1.method6340(1)) {
                    int var17 = var1.method6342();
                    if (Statics.field2878 != null) {
                        Statics.field2878.method751();
                    }
                    if (Statics.field747 != null) {
                        Statics.field747.method751();
                    }
                    if (var17 != 0) {
                        method171(var17);
                        return;
                    }
                    var2.field4735 = 0;
                    method2946(4);
                }
            }
            if (field525 == 4) {
                if (var2.field4735 < 8) {
                    int var18 = var1.method6341();
                    if (var18 > 8 - var2.field4735) {
                        var18 = 8 - var2.field4735;
                    }
                    if (var18 > 0) {
                        var1.method6343(var2.field4733, var2.field4735, var18);
                        var2.field4735 += var18;
                    }
                }
                if (var2.field4735 == 8) {
                    var2.field4735 = 0;
                    Statics.field17 = var2.method7319();
                    method2946(5);
                }
            }
            if (field525 == 5) {
                field552.field1343.field4735 = 0;
                field552.method2532();
                class444 var19 = new class444(500);
                int[] var20 = new int[] { Statics.field172.nextInt(), Statics.field172.nextInt(), Statics.field172.nextInt(), Statics.field172.nextInt() };
                var19.field4735 = 0;
                var19.method7179(1);
                var19.method7364(var20[0]);
                var19.method7364(var20[1]);
                var19.method7364(var20[2]);
                var19.method7364(var20[3]);
                var19.method7184(Statics.field17);
                if (field612 == 40) {
                    var19.method7364(Statics.field177[0]);
                    var19.method7364(Statics.field177[1]);
                    var19.method7364(Statics.field177[2]);
                    var19.method7364(Statics.field177[3]);
                } else {
                    if (field612 == 50) {
                        var19.method7179(class126.field1541.method42());
                        var19.method7364(Statics.field3224);
                    } else {
                        var19.method7179(field529.method42());
                        switch(field529.field1545) {
                            case 0:
                            case 3:
                                var19.method7258(Statics.field4202);
                                var19.field4735++;
                                break;
                            case 1:
                                LinkedHashMap var22 = Statics.field1108.field1247;
                                String var23 = class69.field910;
                                int var24 = var23.length();
                                int var25 = 0;
                                for (int var26 = 0; var26 < var24; var26++) {
                                    var25 = (var25 << 5) - var25 + var23.charAt(var26);
                                }
                                var19.method7364((Integer) var22.get(var25));
                            case 2:
                            default:
                                break;
                            case 4:
                                var19.field4735 += 4;
                        }
                    }
                    if (field640.method7456()) {
                        var19.method7179(class449.field4786.method42());
                        var19.method7186(this.field531);
                    } else {
                        var19.method7179(class449.field4785.method42());
                        var19.method7186(class69.field912);
                    }
                }
                var19.method7190(class68.field885, class68.field886);
                Statics.field177 = var20;
                class266 var28 = class266.method768();
                var28.field3070 = null;
                var28.field3062 = 0;
                var28.field3064 = new class444(5000);
                var28.field3064.field4735 = 0;
                if (field612 == 40) {
                    var28.field3064.method7179(class268.field3180.field3186);
                } else {
                    var28.field3064.method7179(class268.field3188.field3186);
                }
                var28.field3064.method7286(0);
                int var31 = var28.field3064.field4735;
                var28.field3064.method7364(208);
                var28.field3064.method7364(1);
                var28.field3064.method7179(field693);
                var28.field3064.method7179(field572);
                byte var32 = 0;
                var28.field3064.method7179(var32);
                var28.field3064.method7326(var19.field4733, 0, var19.field4735);
                int var33 = var28.field3064.field4735;
                var28.field3064.method7186(class69.field910);
                var28.field3064.method7179((field736 ? 1 : 0) << 1 | (field497 ? 1 : 0));
                var28.field3064.method7286(Statics.field1514);
                var28.field3064.method7286(Statics.field1825);
                class444 var34 = var28.field3064;
                if (field546 == null) {
                    byte[] var35 = new byte[24];
                    try {
                        class159.field1764.method6996(0L);
                        class159.field1764.method6998(var35);
                        int var36;
                        for (var36 = 0; var36 < 24 && var35[var36] == 0; var36++) {
                        }
                        if (var36 >= 24) {
                            throw new IOException();
                        }
                    } catch (Exception var74) {
                        for (int var38 = 0; var38 < 24; var38++) {
                            var35[var38] = -1;
                        }
                    }
                    var34.method7326(var35, 0, var35.length);
                } else {
                    var34.method7326(field546, 0, field546.length);
                }
                var28.field3064.method7186(Statics.field1280);
                var28.field3064.method7364(Statics.field1394);
                class445 var41 = new class445(Statics.field42.method6677());
                Statics.field42.method6676(var41);
                var28.field3064.method7326(var41.field4733, 0, var41.field4733.length);
                var28.field3064.method7179(field693);
                var28.field3064.method7364(0);
                var28.field3064.method7189(Statics.field1253.field4041);
                var28.field3064.method7245(Statics.field1393.field4041);
                var28.field3064.method7244(Statics.field4356.field4041);
                var28.field3064.method7364(Statics.field3326.field4041);
                var28.field3064.method7244(0);
                var28.field3064.method7244(Statics.field1390.field4041);
                var28.field3064.method7364(Statics.field152.field4041);
                var28.field3064.method7364(Statics.field1800.field4041);
                var28.field3064.method7244(Statics.field1483.field4041);
                var28.field3064.method7245(Statics.field990.field4041);
                var28.field3064.method7189(Statics.field3615.field4041);
                var28.field3064.method7189(Statics.field3319.field4041);
                var28.field3064.method7364(Statics.field1927.field4041);
                var28.field3064.method7364(Statics.field1082.field4041);
                var28.field3064.method7245(Statics.field77.field4041);
                var28.field3064.method7364(Statics.field85.field4041);
                var28.field3064.method7244(Statics.field4699.field4041);
                var28.field3064.method7364(Statics.field2484.field4041);
                var28.field3064.method7244(Statics.field110.field4041);
                var28.field3064.method7189(Statics.field1357.field4041);
                var28.field3064.method7245(Statics.field887.field4041);
                var28.field3064.method7220(var20, var33, var28.field3064.field4735);
                var28.field3064.method7194(var28.field3064.field4735 - var31);
                field552.method2534(var28);
                field552.method2544();
                field552.field1342 = new class461(var20);
                int[] var42 = new int[4];
                for (int var43 = 0; var43 < 4; var43++) {
                    var42[var43] = var20[var43] + 50;
                }
                var2.method7151(var42);
                method2946(6);
            }
            if (field525 == 6 && var1.method6341() > 0) {
                int var44 = var1.method6342();
                if (var44 == 61) {
                    int var45 = var1.method6341();
                    Statics.field1388 = var45 == 1 && var1.method6342() == 1;
                    method2946(5);
                }
                if (var44 == 21 && field612 == 20) {
                    method2946(12);
                } else if (var44 == 2) {
                    method2946(14);
                } else if (var44 == 15 && field612 == 40) {
                    field552.field1345 = -1;
                    method2946(19);
                } else if (var44 == 64) {
                    method2946(10);
                } else if (var44 == 23 && field527 < 1) {
                    field527++;
                    method2946(0);
                } else if (var44 == 29) {
                    method2946(17);
                } else if (var44 == 69) {
                    method2946(7);
                } else {
                    method171(var44);
                    return;
                }
            }
            if (field525 == 7 && var1.method6341() >= 2) {
                var1.method6343(var2.field4733, 0, 2);
                var2.field4735 = 0;
                Statics.field4810 = var2.method7198();
                method2946(8);
            }
            if (field525 == 8 && var1.method6341() >= Statics.field4810) {
                var2.field4735 = 0;
                var1.method6343(var2.field4733, var2.field4735, Statics.field4810);
                class7 var46 = class7.method2736()[var2.method7196()];
                try {
                    class4 var47 = class5.method1634(var46);
                    this.field722 = new class8(var2, var47);
                    method2946(9);
                } catch (Exception var69) {
                    method171(22);
                    return;
                }
            }
            if (field525 == 9 && this.field722.method48()) {
                this.field543 = this.field722.method52();
                this.field722.method49();
                this.field722 = null;
                if (this.field543 == null) {
                    method171(22);
                    return;
                }
                field552.method2532();
                class266 var49 = class266.method768();
                var49.field3070 = null;
                var49.field3062 = 0;
                var49.field3064 = new class444(5000);
                var49.field3064.method7179(class268.field3184.field3186);
                var49.field3064.method7286(this.field543.field4735);
                var49.field3064.method7389(this.field543);
                field552.method2534(var49);
                field552.method2544();
                this.field543 = null;
                method2946(6);
            }
            if (field525 == 10 && var1.method6341() > 0) {
                Statics.field465 = var1.method6342();
                method2946(11);
            }
            if (field525 == 11 && var1.method6341() >= Statics.field465) {
                var1.method6343(var2.field4733, 0, Statics.field465);
                var2.field4735 = 0;
                method2946(6);
            }
            if (field525 == 12 && var1.method6341() > 0) {
                field528 = (var1.method6342() + 3) * 60;
                method2946(13);
            }
            if (field525 == 13) {
                field526 = 0;
                class69.method2109(class310.field3697, class310.field3950, field528 / 60 + class310.field3739);
                if (--field528 <= 0) {
                    method2946(0);
                }
            } else {
                if (field525 == 14 && var1.method6341() >= 1) {
                    Statics.field32 = var1.method6342();
                    method2946(15);
                }
                if (field525 == 15 && var1.method6341() >= Statics.field32) {
                    boolean var52 = var1.method6342() == 1;
                    var1.method6343(var2.field4733, 0, 4);
                    var2.field4735 = 0;
                    boolean var53 = false;
                    if (var52) {
                        int var54 = var2.method7141() << 24;
                        int var55 = var54 | var2.method7141() << 16;
                        int var56 = var55 | var2.method7141() << 8;
                        int var57 = var56 | var2.method7141();
                        int var58 = class345.method3883(class69.field910);
                        if (Statics.field1108.field1247.size() >= 10 && !Statics.field1108.field1247.containsKey(var58)) {
                            Iterator var59 = Statics.field1108.field1247.entrySet().iterator();
                            var59.next();
                            var59.remove();
                        }
                        Statics.field1108.field1247.put(var58, var57);
                    }
                    if (field541) {
                        Statics.field1108.method2298(class69.field910);
                    } else {
                        Statics.field1108.method2298((String) null);
                    }
                    class90.method5552();
                    field675 = var1.method6342();
                    field677 = var1.method6342() == 1;
                    field621 = var1.method6342();
                    field621 <<= 0x8;
                    field621 += var1.method6342();
                    field622 = var1.method6342();
                    var1.method6343(var2.field4733, 0, 8);
                    var2.field4735 = 0;
                    this.field711 = var2.method7319();
                    if (Statics.field32 >= 29) {
                        var1.method6343(var2.field4733, 0, 8);
                        var2.field4735 = 0;
                        field499 = var2.method7319();
                    }
                    var1.method6343(var2.field4733, 0, 1);
                    var2.field4735 = 0;
                    class267[] var60 = class267.method4738();
                    int var61 = var2.method7174();
                    if (var61 < 0 || var61 >= var60.length) {
                        throw new IOException(var61 + " " + var2.field4735);
                    }
                    field552.field1344 = var60[var61];
                    field552.field1345 = field552.field1344.field3179;
                    var1.method6343(var2.field4733, 0, 2);
                    var2.field4735 = 0;
                    field552.field1345 = var2.method7198();
                    try {
                        Statics.method398(Statics.field4326, "zap");
                    } catch (Throwable var68) {
                    }
                    method2946(16);
                }
                if (field525 != 16) {
                    if (field525 == 17 && var1.method6341() >= 2) {
                        var2.field4735 = 0;
                        var1.method6343(var2.field4733, 0, 2);
                        var2.field4735 = 0;
                        Statics.field1321 = var2.method7198();
                        method2946(18);
                    }
                    if (field525 == 18 && var1.method6341() >= Statics.field1321) {
                        var2.field4735 = 0;
                        var1.method6343(var2.field4733, 0, Statics.field1321);
                        var2.field4735 = 0;
                        String var63 = var2.method7206();
                        String var64 = var2.method7206();
                        String var65 = var2.method7206();
                        class69.method2109(var63, var64, var65);
                        method5138(10);
                        if (field640.method7456()) {
                            class69.method2876(9);
                        }
                    }
                    if (field525 == 19) {
                        if (field552.field1345 == -1) {
                            if (var1.method6341() < 2) {
                                return;
                            }
                            var1.method6343(var2.field4733, 0, 2);
                            var2.field4735 = 0;
                            field552.field1345 = var2.method7198();
                        }
                        if (var1.method6341() >= field552.field1345) {
                            var1.method6343(var2.field4733, 0, field552.field1345);
                            var2.field4735 = 0;
                            int var66 = field552.field1345;
                            field555.method6107();
                            method5832();
                            class97.method3657(var2);
                            if (var2.field4735 != var66) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field526++;
                        if (field526 > 2000) {
                            if (field527 < 1) {
                                if (Statics.field1395 == Statics.field1256) {
                                    Statics.field1395 = Statics.field1754;
                                } else {
                                    Statics.field1395 = Statics.field1256;
                                }
                                field527++;
                                method2946(0);
                            } else {
                                method171(-3);
                            }
                        }
                    }
                } else if (var1.method6341() >= field552.field1345) {
                    var2.field4735 = 0;
                    var1.method6343(var2.field4733, 0, field552.field1345);
                    field555.method6083();
                    method107();
                    class97.method3657(var2);
                    Statics.field18 = -1;
                    method2677(false, var2);
                    field552.field1344 = null;
                }
            }
        } catch (IOException var75) {
            if (field527 < 1) {
                if (Statics.field1395 == Statics.field1256) {
                    Statics.field1395 = Statics.field1754;
                } else {
                    Statics.field1395 = Statics.field1256;
                }
                field527++;
                method2946(0);
            } else {
                method171(-2);
            }
        }
    }

    @ObfuscatedName("v.fb(I)V")
    public static void method107() {
        field505 = 1L;
        Statics.field3189.field1054 = 0;
        Statics.field1268 = true;
        field752 = true;
        field734 = -1L;
        class34.field245 = new class338();
        field552.method2532();
        field552.field1343.field4735 = 0;
        field552.field1344 = null;
        field552.field1349 = null;
        field552.field1351 = null;
        field552.field1346 = null;
        field552.field1345 = 0;
        field552.field1350 = 0;
        field602 = 0;
        field553 = 0;
        field511 = 0;
        method4686();
        class33.method6418(0);
        class100.field1334.clear();
        class100.field1333.method6928();
        class100.field1335.method5788();
        class100.field1336 = 0;
        field659 = 0;
        field661 = false;
        field748 = 0;
        field574 = 0;
        field579 = 0;
        Statics.field1324 = null;
        field723 = 0;
        field737 = -1;
        field742 = 0;
        field743 = 0;
        field519 = class95.field1282;
        field520 = class95.field1282;
        field690 = 0;
        class97.method4091();
        for (int var0 = 0; var0 < 2048; var0++) {
            field620[var0] = null;
        }
        for (int var1 = 0; var1 < 32768; var1++) {
            field547[var1] = null;
        }
        field632 = -1;
        field635.method5641();
        field633.method5641();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field680[var2][var3][var4] = null;
                }
            }
        }
        field634 = new class336();
        Statics.field3345.method1699();
        for (int var5 = 0; var5 < Statics.field1842; var5++) {
            class171 var6 = class171.method2780(var5);
            if (var6 != null) {
                class290.field3347[var5] = 0;
                class290.field3346[var5] = 0;
            }
        }
        Statics.field4652.method2473();
        field676 = -1;
        if (field666 != -1) {
            class296.method4336(field666);
        }
        for (class80 var7 = (class80) field667.method6943(); var7 != null; var7 = (class80) field667.method6944()) {
            method2789(var7, true);
        }
        field666 = -1;
        field667 = new class422(8);
        field628 = null;
        method4686();
        field774.method5149((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field629[var8] = null;
            field630[var8] = false;
        }
        class78.method634();
        field503 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field715[var9] = true;
        }
        class266 var10 = Statics.method2786(class264.field2957, field552.field1342);
        var10.field3064.method7179(method4268());
        var10.field3064.method7286(Statics.field1514);
        var10.field3064.method7286(Statics.field1825);
        field552.method2534(var10);
        Statics.field1679 = null;
        Statics.field1083 = null;
        Arrays.fill(field548, (Object) null);
        Statics.field3287 = null;
        Arrays.fill(field769, (Object) null);
        for (int var11 = 0; var11 < 8; var11++) {
            field778[var11] = new class326();
        }
        Statics.field1919 = null;
    }

    @ObfuscatedName("mo.fa(I)V")
    public static void method5832() {
        field552.method2532();
        field552.field1343.field4735 = 0;
        field552.field1344 = null;
        field552.field1349 = null;
        field552.field1351 = null;
        field552.field1346 = null;
        field552.field1345 = 0;
        field552.field1350 = 0;
        field602 = 0;
        method4686();
        field723 = 0;
        field742 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field620[var0] = null;
        }
        Statics.field890 = null;
        for (int var1 = 0; var1 < field547.length; var1++) {
            class92 var2 = field547[var1];
            if (var2 != null) {
                var2.field1179 = -1;
                var2.field1163 = false;
            }
        }
        class78.method634();
        method5138(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field715[var3] = true;
        }
        class266 var4 = Statics.method2786(class264.field2957, field552.field1342);
        var4.field3064.method7179(method4268());
        var4.field3064.method7286(Statics.field1514);
        var4.field3064.method7286(Statics.field1825);
        field552.method2534(var4);
    }

    @ObfuscatedName("h.fd(II)V")
    public static void method171(int arg0) {
        int var1 = class69.method4608();
        if (arg0 == -3) {
            class69.method2109(class310.field3700, class310.field3813, class310.field3702);
        } else if (arg0 == -2) {
            class69.method2109(class310.field3883, class310.field3704, class310.field3705);
        } else if (arg0 == -1) {
            class69.method2109(class310.field3869, class310.field3707, class310.field3822);
        } else if (arg0 == 3) {
            class69.method2876(3);
            class69.field904 = 1;
        } else if (arg0 == 4) {
            class69.method2876(14);
            class69.field903 = 0;
        } else if (arg0 == 5) {
            class69.field904 = 2;
            class69.method2109(class310.field3685, class310.field3820, class310.field3714);
        } else if (arg0 == 68 || !(field501 || arg0 != 6)) {
            class69.method2109(class310.field3715, class310.field3945, class310.field3951);
        } else if (arg0 == 7) {
            class69.method2109(class310.field3718, class310.field3719, class310.field3720);
        } else if (arg0 == 8) {
            class69.method2109(class310.field3721, class310.field3855, class310.field3723);
        } else if (arg0 == 9) {
            class69.method2109(class310.field3767, class310.field3978, class310.field3726);
        } else if (arg0 == 10) {
            class69.method2109(class310.field3948, class310.field3728, class310.field3729);
        } else if (arg0 == 11) {
            class69.method2109(class310.field3730, class310.field3879, class310.field3668);
        } else if (arg0 == 12) {
            class69.method2109(class310.field3733, class310.field3698, class310.field3735);
        } else if (arg0 == 13) {
            class69.method2109(class310.field3814, class310.field3737, class310.field3738);
        } else if (arg0 == 14) {
            class69.method2109(class310.field3910, class310.field3828, class310.field3741);
        } else if (arg0 == 16) {
            class69.method2109(class310.field3742, class310.field3743, class310.field3744);
        } else if (arg0 == 17) {
            class69.method2109(class310.field3745, class310.field3781, class310.field3747);
        } else if (arg0 == 18) {
            class69.method2876(14);
            class69.field903 = 1;
        } else if (arg0 == 19) {
            class69.method2109(class310.field3751, class310.field3752, class310.field3774);
        } else if (arg0 == 20) {
            class69.method2109(class310.field3754, class310.field3904, class310.field3756);
        } else if (arg0 == 22) {
            class69.method2109(class310.field3740, class310.field3758, class310.field3759);
        } else if (arg0 == 23) {
            class69.method2109(class310.field3760, class310.field3963, class310.field3786);
        } else if (arg0 == 24) {
            class69.method2109(class310.field3872, class310.field3764, class310.field3755);
        } else if (arg0 == 25) {
            class69.method2109(class310.field3766, class310.field3660, class310.field3734);
        } else if (arg0 == 26) {
            class69.method2109(class310.field3929, class310.field3770, class310.field3771);
        } else if (arg0 == 27) {
            class69.method2109(class310.field3731, class310.field3773, class310.field3902);
        } else if (arg0 == 31) {
            class69.method2109(class310.field3661, class310.field3782, class310.field3783);
        } else if (arg0 == 32) {
            class69.method2876(14);
            class69.field903 = 2;
        } else if (arg0 == 37) {
            class69.method2109(class310.field3787, class310.field3788, class310.field3789);
        } else if (arg0 == 38) {
            class69.method2109(class310.field3790, class310.field3736, class310.field3792);
        } else if (arg0 == 55) {
            class69.method2876(8);
        } else if (arg0 == 56) {
            class69.method2109(class310.field3797, class310.field3798, class310.field3663);
            method5138(11);
            return;
        } else if (arg0 == 57) {
            class69.method2109(class310.field3800, class310.field3977, class310.field3802);
            method5138(11);
            return;
        } else if (arg0 == 61) {
            class69.method2109("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class69.method2876(7);
        } else if (arg0 == 62) {
            method5138(10);
            class69.method2876(9);
            class69.method2109(class310.field3809, class310.field3889, class310.field3717);
            return;
        } else if (arg0 == 63) {
            method5138(10);
            class69.method2876(9);
            class69.method2109(class310.field3806, class310.field3807, class310.field3851);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method5138(10);
            class69.method2876(9);
            class69.method2109(class310.field3667, class310.field3701, class310.field3811);
            return;
        } else if (arg0 == 71) {
            method5138(10);
            class69.method2876(7);
            class69.method2109("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method5138(10);
            class69.method2876(6);
            class69.method2109(class310.field3957, class310.field3958, class310.field3959);
        } else if (arg0 == 72) {
            method5138(10);
            class69.method2876(26);
        } else {
            class69.method2109(class310.field3812, class310.field3761, class310.field3931);
        }
        method5138(10);
        boolean var2 = var1 != class69.method4608();
        if (!var2 && field640.method7456()) {
            class69.method2876(9);
        }
    }

    @ObfuscatedName("by.fu(I)V")
    public static final void method1104() {
        field552.method2536();
        class190.field2187.method4782();
        class182.field2011.method4782();
        class174.field1879.method4782();
        class188.method5051();
        class179.field1931.method4782();
        class179.field1932.method4782();
        class189.field2128.method4782();
        class189.field2154.method4782();
        class189.field2127.method4782();
        class191.method2618();
        class181.method2463();
        class184.field2021.method4782();
        class171.field1841.method4782();
        Statics.field1555.method7028();
        Statics.field1716.method7028();
        class187.method2466();
        class175.field1894.method4782();
        class175.field1893.method4782();
        class186.method2441();
        class185.field2029.method4782();
        class172.method5108();
        class438.method6322();
        class440.field4715.method4782();
        field540.method4782();
        field780.method4782();
        class294.field3369.method4782();
        class296.method5145();
        ((class210) Statics.field2393).method4111();
        class72.field970.method4782();
        Statics.field152.method5429();
        Statics.field1927.method5429();
        Statics.field3615.method5429();
        Statics.field1393.method5429();
        Statics.field4699.method5429();
        Statics.field77.method5429();
        Statics.field2484.method5429();
        Statics.field990.method5429();
        Statics.field1082.method5429();
        Statics.field1800.method5429();
        Statics.field3326.method5429();
        Statics.field1357.method5429();
        Statics.field309.method5429();
        Statics.field3318.method3900();
        for (int var0 = 0; var0 < 4; var0++) {
            field562[var0].method3622();
        }
        System.gc();
        class275.method3111(2);
        field681 = -1;
        field652 = false;
        class63.method5333();
        method5138(10);
    }

    @ObfuscatedName("z.fe(IS)V")
    public static final void method368(int arg0) {
        method1104();
        switch(arg0) {
            case 1:
                class69.method65();
                break;
            case 2:
                class69.method2876(24);
                class69.method2109(class310.field3900, class310.field3791, class310.field3765);
        }
    }

    @ObfuscatedName("y.fy(I)J")
    public static long method307() {
        return field499;
    }

    @ObfuscatedName("bx.fs(B)V")
    public static final void method1944() {
        if (field553 > 0) {
            method1104();
        } else {
            field555.method6089();
            method5138(40);
            Statics.field2238 = field552.method2549();
            field552.method2543();
        }
    }

    @ObfuscatedName("cs.fw(ZI)V")
    public static final void method2552(boolean arg0) {
        if (arg0) {
            field529 = class69.field917 ? class126.field1542 : class126.field1540;
        } else {
            field529 = Statics.field1108.field1247.containsKey(class345.method3883(class69.field910)) ? class126.field1543 : class126.field1537;
        }
    }

    @ObfuscatedName("client.ft(I)V")
    public final void method1132() {
        if (field602 > 1) {
            field602--;
        }
        if (field553 > 0) {
            field553--;
        }
        if (field554) {
            field554 = false;
            method1944();
            return;
        }
        if (!field641) {
            method3566();
        }
        for (int var1 = 0; var1 < 100 && this.method1362(field552); var1++) {
        }
        if (field612 != 30) {
            return;
        }
        while (class34.method2997()) {
            class266 var2 = Statics.method2786(class264.field2961, field552.field1342);
            var2.field3064.method7179(0);
            int var3 = var2.field3064.field4735;
            class34.method2849(var2.field3064);
            var2.field3064.method7193(var2.field3064.field4735 - var3);
            field552.method2534(var2);
        }
        if (field555.field4266) {
            class266 var4 = Statics.method2786(class264.field3022, field552.field1342);
            var4.field3064.method7179(0);
            int var5 = var4.field3064.field4735;
            field555.method6090(var4.field3064);
            var4.field3064.method7193(var4.field3064.field4735 - var5);
            field552.method2534(var4);
            field555.method6106();
        }
        Object var6 = Statics.field3189.field1056;
        synchronized (Statics.field3189.field1056) {
            if (!field588) {
                Statics.field3189.field1054 = 0;
            } else if (class33.field237 != 0 || Statics.field3189.field1054 >= 40) {
                class266 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field3189.field1054 && (var7 == null || var7.field3064.field4735 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field3189.field1057[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field3189.field1055[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field506 != var14 || field507 != var13) {
                        if (var7 == null) {
                            var7 = Statics.method2786(class264.field2953, field552.field1342);
                            var7.field3064.method7179(0);
                            var8 = var7.field3064.field4735;
                            var7.field3064.field4735 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field508 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field506;
                            var16 = var13 - field507;
                            var17 = (int) ((Statics.field3189.field1059[var12] - field508) / 20L);
                            var10 = (int) ((Statics.field3189.field1059[var12] - field508) % 20L + (long) var10);
                        }
                        field506 = var14;
                        field507 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field3064.method7286((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field3064.method7179(var17 + 128);
                            var7.field3064.method7286((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field3064.method7179(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3064.method7364(Integer.MIN_VALUE);
                            } else {
                                var7.field3064.method7364(var14 | var13 << 16);
                            }
                        } else {
                            var7.field3064.method7286((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3064.method7364(Integer.MIN_VALUE);
                            } else {
                                var7.field3064.method7364(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field508 = Statics.field3189.field1059[var12];
                    }
                }
                if (var7 != null) {
                    var7.field3064.method7193(var7.field3064.field4735 - var8);
                    int var18 = var7.field3064.field4735;
                    var7.field3064.field4735 = var8;
                    var7.field3064.method7179(var10 / var11);
                    var7.field3064.method7179(var10 % var11);
                    var7.field3064.field4735 = var18;
                    field552.method2534(var7);
                }
                if (var9 >= Statics.field3189.field1054) {
                    Statics.field3189.field1054 = 0;
                } else {
                    Statics.field3189.field1054 -= var9;
                    System.arraycopy(Statics.field3189.field1055, var9, Statics.field3189.field1055, 0, Statics.field3189.field1054);
                    System.arraycopy(Statics.field3189.field1057, var9, Statics.field3189.field1057, 0, Statics.field3189.field1054);
                    System.arraycopy(Statics.field3189.field1059, var9, Statics.field3189.field1059, 0, Statics.field3189.field1054);
                }
            }
        }
        if (class33.field237 == 1 || !Statics.field2478 && class33.field237 == 4 || class33.field237 == 2) {
            long var20 = class33.field240 - field505 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field505 = class33.field240 * -1L;
            int var22 = class33.field239;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field1825) {
                var22 = Statics.field1825;
            }
            int var23 = class33.field238;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field1514) {
                var23 = Statics.field1514;
            }
            int var24 = (int) var20;
            class266 var25 = Statics.method2786(class264.field3040, field552.field1342);
            var25.field3064.method7286((class33.field237 == 2 ? 1 : 0) + (var24 << 1));
            var25.field3064.method7286(var23);
            var25.field3064.method7286(var22);
            field552.method2534(var25);
        }
        if (class24.field142 > 0) {
            class266 var26 = Statics.method2786(class264.field3024, field552.field1342);
            var26.field3064.method7286(0);
            int var27 = var26.field3064.field4735;
            long var28 = class271.method5624();
            for (int var30 = 0; var30 < class24.field142; var30++) {
                long var31 = var28 - field734;
                if (var31 > 16777215L) {
                    var31 = 16777215L;
                }
                field734 = var28;
                var26.field3064.method7256((int) var31);
                var26.field3064.method7409(class24.field141[var30]);
            }
            var26.field3064.method7194(var26.field3064.field4735 - var27);
            field552.method2534(var26);
        }
        if (field631 > 0) {
            field631--;
        }
        if (class24.field123[96] || class24.field123[97] || class24.field123[98] || class24.field123[99]) {
            field544 = true;
        }
        if (field544 && field631 <= 0) {
            field631 = 20;
            field544 = false;
            class266 var33 = Statics.method2786(class264.field2941, field552.field1342);
            var33.field3064.method7286(field573);
            var33.field3064.method7348(field574);
            field552.method2534(var33);
        }
        if (Statics.field1268 && !field752) {
            field752 = true;
            class266 var34 = Statics.method2786(class264.field3006, field552.field1342);
            var34.field3064.method7179(1);
            field552.method2534(var34);
        }
        if (!Statics.field1268 && field752) {
            field752 = false;
            class266 var35 = Statics.method2786(class264.field3006, field552.field1342);
            var35.field3064.method7179(0);
            field552.method2534(var35);
        }
        if (Statics.field422 != null) {
            Statics.field422.method6708();
        }
        method3106();
        if (Statics.field965) {
            method4607();
            Statics.field965 = false;
        }
        method3254();
        if (field612 != 30) {
            return;
        }
        for (class86 var36 = (class86) field634.method5647(); var36 != null; var36 = (class86) field634.method5649()) {
            if (var36.field1116 > 0) {
                var36.field1116--;
            }
            if (var36.field1116 != 0) {
                if (var36.field1125 > 0) {
                    var36.field1125--;
                }
                if (var36.field1125 == 0 && var36.field1117 >= 1 && var36.field1126 >= 1 && var36.field1117 <= 102 && var36.field1126 <= 102 && (var36.field1119 < 0 || Statics.method2652(var36.field1119, var36.field1124))) {
                    method3094(var36.field1118, var36.field1115, var36.field1117, var36.field1126, var36.field1119, var36.field1123, var36.field1124);
                    var36.field1125 = -1;
                    if (var36.field1121 == var36.field1119 && var36.field1121 == -1) {
                        var36.method6657();
                    } else if (var36.field1121 == var36.field1119 && var36.field1123 == var36.field1120 && var36.field1124 == var36.field1122) {
                        var36.method6657();
                    }
                }
            } else if (var36.field1121 < 0 || Statics.method2652(var36.field1121, var36.field1122)) {
                method3094(var36.field1118, var36.field1115, var36.field1117, var36.field1126, var36.field1121, var36.field1120, var36.field1122);
                var36.method6657();
            }
        }
        method6581();
        field552.field1350++;
        if (field552.field1350 > 750) {
            method1944();
            return;
        }
        method3325();
        method6116();
        int[] var37 = class97.field1290;
        for (int var38 = 0; var38 < class97.field1305; var38++) {
            class85 var39 = field620[var37[var38]];
            if (var39 != null && var39.field1152 > 0) {
                var39.field1152--;
                if (var39.field1152 == 0) {
                    var39.field1149 = null;
                }
            }
        }
        for (int var40 = 0; var40 < field690; var40++) {
            int var41 = field514[var40];
            class92 var42 = field547[var41];
            if (var42 != null && var42.field1152 > 0) {
                var42.field1152--;
                if (var42.field1152 == 0) {
                    var42.field1149 = null;
                }
            }
        }
        field744++;
        if (field608 != 0) {
            field607 += 20;
            if (field607 >= 400) {
                field608 = 0;
            }
        }
        if (Statics.field154 != null) {
            field610++;
            if (field610 >= 15) {
                method6648(Statics.field154);
                Statics.field154 = null;
            }
        }
        class296 var43 = Statics.field1700;
        class296 var44 = Statics.field4106;
        Statics.field1700 = null;
        Statics.field4106 = null;
        field683 = null;
        field687 = false;
        field684 = false;
        field530 = 0;
        while (class24.method402() && field530 < 128) {
            if (field675 >= 2 && class24.field123[82] && Statics.field1666 == 66) {
                String var45 = Statics.method4248();
                Statics.field4326.method440(var45);
            } else if (field579 != 1 || Statics.field2795 <= 0) {
                field750[field530] = Statics.field1666;
                field732[field530] = Statics.field2795;
                field530++;
            }
        }
        if (method1024() && class24.field123[82] && class24.field123[81] && field686 != 0) {
            int var46 = Statics.field890.field1106 - field686;
            if (var46 < 0) {
                var46 = 0;
            } else if (var46 > 3) {
                var46 = 3;
            }
            if (Statics.field890.field1106 != var46) {
                int var47 = Statics.field1560 + Statics.field890.field1199[0];
                int var48 = Statics.field2784 + Statics.field890.field1201[0];
                class266 var49 = Statics.method2786(class264.field3009, field552.field1342);
                var49.field3064.method7225(var46);
                var49.field3064.method7286(var48);
                var49.field3064.method7244(0);
                var49.field3064.method7234(var47);
                field552.method2534(var49);
            }
            field686 = 0;
        }
        if (field666 != -1) {
            method4795(field666, 0, 0, Statics.field1514, Statics.field1825, 0, 0);
        }
        field691++;
        while (true) {
            class81 var50;
            class296 var51;
            class296 var52;
            do {
                var50 = (class81) field710.method5645();
                if (var50 == null) {
                    while (true) {
                        class81 var53;
                        class296 var54;
                        class296 var55;
                        do {
                            var53 = (class81) field627.method5645();
                            if (var53 == null) {
                                while (true) {
                                    class81 var56;
                                    class296 var57;
                                    class296 var58;
                                    do {
                                        var56 = (class81) field678.method5645();
                                        if (var56 == null) {
                                            this.method1138();
                                            method2271();
                                            if (field601 != null) {
                                                this.method1137();
                                            }
                                            if (Statics.field4353 != null) {
                                                method6648(Statics.field4353);
                                                field617++;
                                                if (class33.field229 == 0) {
                                                    if (field764) {
                                                        if (Statics.field4353 == Statics.field2641 && field727 != field597) {
                                                            class296 var59 = Statics.field4353;
                                                            byte var60 = 0;
                                                            if (field566 == 1 && var59.field3399 == 206) {
                                                                var60 = 1;
                                                            }
                                                            if (var59.field3408[field727] <= 0) {
                                                                var60 = 0;
                                                            }
                                                            int var61 = method2462(var59);
                                                            boolean var62 = (var61 >> 29 & 0x1) != 0;
                                                            if (var62) {
                                                                int var63 = field597;
                                                                int var64 = field727;
                                                                var59.field3408[var64] = var59.field3408[var63];
                                                                var59.field3471[var64] = var59.field3471[var63];
                                                                var59.field3408[var63] = -1;
                                                                var59.field3471[var63] = 0;
                                                            } else if (var60 == 1) {
                                                                int var65 = field597;
                                                                int var66 = field727;
                                                                while (var65 != var66) {
                                                                    if (var65 > var66) {
                                                                        var59.method5218(var65 - 1, var65);
                                                                        var65--;
                                                                    } else if (var65 < var66) {
                                                                        var59.method5218(var65 + 1, var65);
                                                                        var65++;
                                                                    }
                                                                }
                                                            } else {
                                                                var59.method5218(field727, field597);
                                                            }
                                                            class266 var67 = Statics.method2786(class264.field2948, field552.field1342);
                                                            var67.field3064.method7277(var60);
                                                            var67.field3064.method7348(field597);
                                                            var67.field3064.method7189(Statics.field4353.field3395);
                                                            var67.field3064.method7234(field727);
                                                            field552.method2534(var67);
                                                        }
                                                    } else if (this.method1263()) {
                                                        this.method1582(field613, field704);
                                                    } else if (field642 > 0) {
                                                        method3299(field613, field704);
                                                    }
                                                    field610 = 10;
                                                    class33.field237 = 0;
                                                    Statics.field4353 = null;
                                                } else if (field617 >= 5 && (class33.field232 > field613 + 5 || class33.field232 < field613 - 5 || class33.field231 > field704 + 5 || class33.field231 < field704 - 5)) {
                                                    field764 = true;
                                                }
                                            }
                                            if (class205.method3959()) {
                                                int var68 = class205.field2446;
                                                int var69 = class205.field2426;
                                                class266 var70 = Statics.method2786(class264.field3034, field552.field1342);
                                                var70.field3064.method7179(5);
                                                var70.field3064.method7235(Statics.field1560 + var68);
                                                var70.field3064.method7286(Statics.field2784 + var69);
                                                var70.field3064.method7225(class24.field123[82] ? (class24.field123[81] ? 2 : 1) : 0);
                                                field552.method2534(var70);
                                                class205.method4023();
                                                field605 = class33.field238;
                                                field606 = class33.field239;
                                                field608 = 1;
                                                field607 = 0;
                                                field742 = var68;
                                                field743 = var69;
                                            }
                                            if (Statics.field1700 != var43) {
                                                if (var43 != null) {
                                                    method6648(var43);
                                                }
                                                if (Statics.field1700 != null) {
                                                    method6648(Statics.field1700);
                                                }
                                            }
                                            if (Statics.field4106 != var44 && field658 == field561) {
                                                if (var44 != null) {
                                                    method6648(var44);
                                                }
                                                if (Statics.field4106 != null) {
                                                    method6648(Statics.field4106);
                                                }
                                            }
                                            if (Statics.field4106 == null) {
                                                if (field561 > 0) {
                                                    field561--;
                                                }
                                            } else if (field561 < field658) {
                                                field561++;
                                                if (field658 == field561) {
                                                    method6648(Statics.field4106);
                                                }
                                            }
                                            method6907();
                                            if (field545) {
                                                Statics.method3756(Statics.field4480, Statics.field1725, Statics.field4011);
                                                method64(Statics.field121, Statics.field790);
                                                if (Statics.field4480 == Statics.field1759 && Statics.field963 == Statics.field1725 && Statics.field483 == Statics.field4011 && Statics.field1799 == Statics.field121 && Statics.field790 == Statics.field55) {
                                                    field545 = false;
                                                    field754 = false;
                                                    Statics.field1480 = 0;
                                                    Statics.field3302 = 0;
                                                    Statics.field1521 = 0;
                                                    Statics.field328 = 0;
                                                    Statics.field1271 = 0;
                                                    Statics.field1399 = 0;
                                                    Statics.field833 = 0;
                                                    Statics.field2639 = 0;
                                                    Statics.field1356 = 0;
                                                    Statics.field3979 = 0;
                                                }
                                            } else if (field754) {
                                                method2779();
                                            }
                                            for (int var71 = 0; var71 < 5; var71++) {
                                                int var10002 = field760[var71]++;
                                            }
                                            Statics.field4652.method2470();
                                            int var72 = ++class33.field236 - 1;
                                            int var74 = class24.method2991();
                                            if (var72 > 15000 && var74 > 15000) {
                                                field553 = 250;
                                                class33.method6418(14500);
                                                class266 var75 = Statics.method2786(class264.field2958, field552.field1342);
                                                field552.method2534(var75);
                                            }
                                            Statics.field3345.method1701();
                                            field552.field1348++;
                                            if (field552.field1348 > 50) {
                                                class266 var76 = Statics.method2786(class264.field2987, field552.field1342);
                                                field552.method2534(var76);
                                            }
                                            try {
                                                field552.method2544();
                                            } catch (IOException var78) {
                                                method1944();
                                            }
                                            return;
                                        }
                                        var57 = var56.field1044;
                                        if (var57.field3415 < 0) {
                                            break;
                                        }
                                        var58 = class296.method3318(var57.field3441);
                                    } while (var58 == null || var58.field3503 == null || var57.field3415 >= var58.field3503.length || var58.field3503[var57.field3415] != var57);
                                    class64.method5903(var56);
                                }
                            }
                            var54 = var53.field1044;
                            if (var54.field3415 < 0) {
                                break;
                            }
                            var55 = class296.method3318(var54.field3441);
                        } while (var55 == null || var55.field3503 == null || var54.field3415 >= var55.field3503.length || var55.field3503[var54.field3415] != var54);
                        class64.method5903(var53);
                    }
                }
                var51 = var50.field1044;
                if (var51.field3415 < 0) {
                    break;
                }
                var52 = class296.method3318(var51.field3441);
            } while (var52 == null || var52.field3503 == null || var51.field3415 >= var52.field3503.length || var52.field3503[var51.field3415] != var51);
            class64.method5903(var50);
        }
    }

    @ObfuscatedName("u.fz(I)V")
    public static final void method183() {
        if (Statics.field747 != null) {
            Statics.field747.method727();
        }
        if (Statics.field2878 != null) {
            Statics.field2878.method727();
        }
    }

    @ObfuscatedName("od.gq(B)V")
    public static final void method6581() {
        for (int var0 = 0; var0 < field748; var0++) {
            int var10002 = field611[var0]--;
            if (field611[var0] >= -10) {
                class37 var2 = field729[var0];
                if (var2 == null) {
                    class37 var10000 = (class37) null;
                    var2 = class37.method685(Statics.field1393, field749[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field611[var0] += var2.method684();
                    field729[var0] = var2;
                }
                if (field611[var0] < 0) {
                    int var9;
                    if (field781[var0] == 0) {
                        var9 = Statics.field1108.method2277();
                    } else {
                        int var3 = (field781[var0] & 0xFF) * 128;
                        int var4 = field781[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field890.field1185;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field781[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field890.field1129;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field611[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * Statics.field1108.method2366() / var3;
                    }
                    if (var9 > 0) {
                        class38 var10 = var2.method686().method701(Statics.field4120);
                        class45 var11 = class45.method887(var10, 100, var9);
                        var11.method826(field549[var0] - 1);
                        Statics.field89.method645(var11);
                    }
                    field611[var0] = -100;
                }
            } else {
                field748--;
                for (int var1 = var0; var1 < field748; var1++) {
                    field749[var1] = field749[var1 + 1];
                    field729[var1] = field729[var1 + 1];
                    field549[var1] = field549[var1 + 1];
                    field611[var1] = field611[var1 + 1];
                    field781[var1] = field781[var1 + 1];
                }
                var0--;
            }
        }
        if (!field652) {
            return;
        }
        boolean var12;
        if (class275.field3228 == 0) {
            var12 = Statics.field1623.method4877();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (Statics.field1108.method2294() != 0 && field681 != -1) {
                class275.method1097(Statics.field77, field681, 0, Statics.field1108.method2294(), false);
            }
            field652 = false;
        }
    }

    @ObfuscatedName("hz.gv(Lgd;IIII)V")
    public static void method4291(class191 arg0, int arg1, int arg2, int arg3) {
        if (field748 >= 50 || Statics.field1108.method2366() == 0 || arg0.field2208 == null || arg1 >= arg0.field2208.length) {
            return;
        }
        int var4 = arg0.field2208[arg1];
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field749[field748] = var7;
        field549[field748] = var8;
        field611[field748] = 0;
        field729[field748] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field781[field748] = (var10 << 16) + (var11 << 8) + var9;
        field748++;
    }

    @ObfuscatedName("ce.gr(Lgd;IIII)V")
    public static void method2240(class191 arg0, int arg1, int arg2, int arg3) {
        if (field748 >= 50 || Statics.field1108.method2366() == 0 || arg0.field2202 == null || !arg0.field2202.containsKey(arg1)) {
            return;
        }
        int var4 = (Integer) arg0.field2202.get(arg1);
        if (var4 == 0) {
            return;
        }
        int var7 = var4 >> 8;
        int var8 = var4 >> 4 & 0x7;
        int var9 = var4 & 0xF;
        field749[field748] = var7;
        field549[field748] = var8;
        field611[field748] = 0;
        field729[field748] = null;
        int var10 = (arg2 - 64) / 128;
        int var11 = (arg3 - 64) / 128;
        field781[field748] = (var10 << 16) + (var11 << 8) + var9;
        field748++;
    }

    @ObfuscatedName("bx.gl(IIIB)V")
    public static void method1943(int arg0, int arg1, int arg2) {
        if (Statics.field1108.method2277() == 0 || arg1 == 0 || field748 >= 50) {
            return;
        }
        field749[field748] = arg0;
        field549[field748] = arg1;
        field611[field748] = arg2;
        field729[field748] = null;
        field781[field748] = 0;
        field748++;
    }

    @ObfuscatedName("x.gx(IS)V")
    public static void method82(int arg0) {
        if (arg0 == -1 && !field652) {
            class275.method261();
        } else if (arg0 != -1 && field681 != arg0 && Statics.field1108.method2294() != 0 && !field652) {
            class315 var1 = Statics.field77;
            int var2 = Statics.field1108.method2294();
            class275.field3228 = 1;
            Statics.field3225 = var1;
            Statics.field3231 = arg0;
            Statics.field2042 = 0;
            Statics.field3197 = var2;
            Statics.field4372 = false;
            Statics.field1871 = 2;
        }
        field681 = arg0;
    }

    @ObfuscatedName("fl.gz(IIB)V")
    public static void method3132(int arg0, int arg1) {
        if (Statics.field1108.method2294() != 0 && arg0 != -1) {
            class275.method1097(Statics.field3326, arg0, 0, Statics.field1108.method2294(), false);
            field652 = true;
        }
    }

    @ObfuscatedName("fr.gk(S)V")
    public static final void method3106() {
        if (!Statics.field1662) {
            return;
        }
        if (Statics.field1679 != null) {
            Statics.field1679.method6268();
        }
        for (int var0 = 0; var0 < class97.field1305; var0++) {
            class85 var1 = field620[class97.field1290[var0]];
            var1.method2173();
        }
        Statics.field1662 = false;
    }

    @ObfuscatedName("fu.gw(B)V")
    public static final void method3254() {
        if (Statics.field1013 != field737) {
            field737 = Statics.field1013;
            method103(Statics.field1013);
        }
    }

    @ObfuscatedName("nm.gd(Lkw;III)V")
    public static final void method6380(class296 arg0, int arg1, int arg2) {
        if (field723 != 0 && field723 != 3 || field641 || !(class33.field237 == 1 || !Statics.field2478 && class33.field237 == 4)) {
            return;
        }
        class289 var3 = arg0.method5203(true);
        if (var3 == null) {
            return;
        }
        int var4 = class33.field238 - arg1;
        int var5 = class33.field239 - arg2;
        if (!var3.method5111(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3340 / 2;
        int var7 = var5 - var3.field3341 / 2;
        int var8 = field574 & 0x7FF;
        int var9 = class202.field2396[var8];
        int var10 = class202.field2381[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field890.field1185 + var11 >> 7;
        int var14 = Statics.field890.field1129 - var12 >> 7;
        class266 var15 = Statics.method2786(class264.field2978, field552.field1342);
        var15.field3064.method7179(18);
        var15.field3064.method7235(Statics.field1560 + var13);
        var15.field3064.method7286(Statics.field2784 + var14);
        var15.field3064.method7225(class24.field123[82] ? (class24.field123[81] ? 2 : 1) : 0);
        var15.field3064.method7179(var6);
        var15.field3064.method7179(var7);
        var15.field3064.method7286(field574);
        var15.field3064.method7179(57);
        var15.field3064.method7179(0);
        var15.field3064.method7179(0);
        var15.field3064.method7179(89);
        var15.field3064.method7286(Statics.field890.field1185);
        var15.field3064.method7286(Statics.field890.field1129);
        var15.field3064.method7179(63);
        field552.method2534(var15);
        field742 = var13;
        field743 = var14;
    }

    @ObfuscatedName("p.gj(Ljava/lang/String;I)V")
    public static final void method12(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1108.method2304(!Statics.field1108.method2344());
            if (Statics.field1108.method2344()) {
                class100.method1932(99, "", "Roofs are now all hidden");
            } else {
                class100.method1932(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field1108.method2287();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field624 = !field624;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field726 = !field726;
        }
        if (field675 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field422.field4607 = !Statics.field422.field4607;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field1108.method2286(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field1108.method2286(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1944();
            }
        }
        class266 var1 = Statics.method2786(class264.field3032, field552.field1342);
        var1.field3064.method7179(arg0.length() + 1);
        var1.field3064.method7186(arg0);
        field552.method2534(var1);
    }

    @ObfuscatedName("q.ga(III)V")
    public static final void method64(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        }
        if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1799 < arg0) {
            Statics.field1799 += Statics.field1271 * (arg0 - Statics.field1799) / 1000 + Statics.field328;
            if (Statics.field1799 > arg0) {
                Statics.field1799 = arg0;
            }
        }
        if (Statics.field1799 > arg0) {
            Statics.field1799 -= Statics.field1271 * (Statics.field1799 - arg0) / 1000 + Statics.field328;
            if (Statics.field1799 < arg0) {
                Statics.field1799 = arg0;
            }
        }
        int var2 = arg1 - Statics.field55;
        if (var2 > 1024) {
            var2 -= 2048;
        }
        if (var2 < -1024) {
            var2 += 2048;
        }
        if (var2 > 0) {
            Statics.field55 += Statics.field1271 * var2 / 1000 + Statics.field328;
            Statics.field55 &= 0x7FF;
        }
        if (var2 < 0) {
            Statics.field55 -= Statics.field1271 * -var2 / 1000 + Statics.field328;
            Statics.field55 &= 0x7FF;
        }
        int var3 = arg1 - Statics.field55;
        if (var3 > 1024) {
            var3 -= 2048;
        }
        if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
            Statics.field55 = arg1;
        }
    }

    @ObfuscatedName("dv.gn(I)V")
    public static final void method2779() {
        int var0 = Statics.field2639 * 128 + 64;
        int var1 = Statics.field1356 * 128 + 64;
        int var2 = method2784(var0, var1, Statics.field1013) - Statics.field3979;
        Statics.method3756(var0, var2, var1);
        int var3 = Statics.field1480 * 128 + 64;
        int var4 = Statics.field3302 * 128 + 64;
        int var5 = method2784(var3, var4, Statics.field1013) - Statics.field1521;
        int var6 = var3 - Statics.field1759;
        int var7 = var5 - Statics.field963;
        int var8 = var4 - Statics.field483;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method64(var10, var11);
    }

    @ObfuscatedName("pc.gc(I)V")
    public static final void method6907() {
        if (field579 == 0) {
            int var0 = Statics.field890.field1185;
            int var1 = Statics.field890.field1129;
            if (Statics.field1695 - var0 < -500 || Statics.field1695 - var0 > 500 || Statics.field4146 - var1 < -500 || Statics.field4146 - var1 > 500) {
                Statics.field1695 = var0;
                Statics.field4146 = var1;
            }
            if (Statics.field1695 != var0) {
                Statics.field1695 += (var0 - Statics.field1695) / 16;
            }
            if (Statics.field4146 != var1) {
                Statics.field4146 += (var1 - Statics.field4146) / 16;
            }
            int var2 = Statics.field1695 >> 7;
            int var3 = Statics.field4146 >> 7;
            int var4 = method2784(Statics.field1695, Statics.field4146, Statics.field1013);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field1013;
                        if (var8 < 3 && (class75.field999[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class75.field998[var8][var6][var7];
                        if (var9 > var5) {
                            var5 = var9;
                        }
                    }
                }
            }
            int var10 = var5 * 192;
            if (var10 > 98048) {
                var10 = 98048;
            }
            if (var10 < 32768) {
                var10 = 32768;
            }
            if (var10 > field590) {
                field590 += (var10 - field590) / 24;
            } else if (var10 < field590) {
                field590 += (var10 - field590) / 80;
            }
            Statics.field1506 = method2784(Statics.field890.field1185, Statics.field890.field1129, Statics.field1013) - field580;
        } else if (field579 == 1) {
            if (field587 && Statics.field890 != null) {
                int var11 = Statics.field890.field1199[0];
                int var12 = Statics.field890.field1201[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field1695 = Statics.field890.field1185;
                    int var13 = method2784(Statics.field890.field1185, Statics.field890.field1129, Statics.field1013) - field580;
                    if (var13 < Statics.field1506) {
                        Statics.field1506 = var13;
                    }
                    Statics.field4146 = Statics.field890.field1129;
                    field587 = false;
                }
            }
            short var14 = -1;
            if (class24.field123[33]) {
                var14 = 0;
            } else if (class24.field123[49]) {
                var14 = 1024;
            }
            if (class24.field123[48]) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (class24.field123[50]) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (class24.field123[35]) {
                var15 = -1;
            } else if (class24.field123[51]) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = class24.field123[81] ? field585 : field584;
                var16 = var17 * 16;
                field582 = var14;
                field583 = var15;
            }
            if (field581 < var16) {
                field581 += var16 / 8;
                if (field581 > var16) {
                    field581 = var16;
                }
            } else if (field581 > var16) {
                field581 = field581 * 9 / 10;
            }
            if (field581 > 0) {
                int var18 = field581 / 16;
                if (field582 >= 0) {
                    int var19 = field582 - Statics.field55 & 0x7FF;
                    int var20 = class202.field2396[var19];
                    int var21 = class202.field2381[var19];
                    Statics.field1695 += var18 * var20 / 65536;
                    Statics.field4146 += var18 * var21 / 65536;
                }
                if (field583 != 0) {
                    Statics.field1506 += field583 * var18;
                    if (Statics.field1506 > 0) {
                        Statics.field1506 = 0;
                    }
                }
            } else {
                field582 = -1;
                field583 = -1;
            }
            if (class24.field123[13]) {
                method6906();
            }
        }
        if (class33.field229 == 4 && Statics.field2478) {
            int var22 = class33.field231 - field578;
            field615 = var22 * 2;
            field578 = var22 == -1 || var22 == 1 ? class33.field231 : (field578 + class33.field231) / 2;
            int var23 = field767 - class33.field232;
            field575 = var23 * 2;
            field767 = var23 == -1 || var23 == 1 ? class33.field232 : (field767 + class33.field232) / 2;
        } else {
            if (class24.field123[96]) {
                field575 += (-24 - field575) / 2;
            } else if (class24.field123[97]) {
                field575 += (24 - field575) / 2;
            } else {
                field575 /= 2;
            }
            if (class24.field123[98]) {
                field615 += (12 - field615) / 2;
            } else if (class24.field123[99]) {
                field615 += (-12 - field615) / 2;
            } else {
                field615 /= 2;
            }
            field578 = class33.field231;
            field767 = class33.field232;
        }
        field574 = field575 / 2 + field574 & 0x7FF;
        field573 += field615 / 2;
        if (field573 < 128) {
            field573 = 128;
        }
        if (field573 > 383) {
            field573 = 383;
        }
    }

    @ObfuscatedName("fz.gu(I)V")
    public static final void method3325() {
        int var0 = class97.field1305;
        int[] var1 = class97.field1290;
        for (int var2 = 0; var2 < var0; var2++) {
            class85 var3 = field620[var1[var2]];
            if (var3 != null) {
                method2382(var3, 1);
            }
        }
    }

    @ObfuscatedName("mw.gi(I)V")
    public static final void method6116() {
        for (int var0 = 0; var0 < field690; var0++) {
            int var1 = field514[var0];
            class92 var2 = field547[var1];
            if (var2 != null) {
                method2382(var2, var2.field1254.field1973);
            }
        }
    }

    @ObfuscatedName("cz.gy(Lce;II)V")
    public static final void method2382(class87 arg0, int arg1) {
        if (arg0.field1184 >= field504) {
            Statics.method2832(arg0);
        } else if (arg0.field1137 >= field504) {
            method102(arg0);
        } else {
            arg0.field1166 = arg0.field1134;
            if (arg0.field1198 == 0) {
                arg0.field1202 = 0;
            } else {
                label574: {
                    if (arg0.field1147 != -1 && arg0.field1173 == 0) {
                        class191 var2 = class191.method22(arg0.field1147);
                        if (arg0.field1203 > 0 && var2.field2218 == 0) {
                            arg0.field1202++;
                            break label574;
                        }
                        if (arg0.field1203 <= 0 && var2.field2219 == 0) {
                            arg0.field1202++;
                            break label574;
                        }
                    }
                    int var3 = arg0.field1185;
                    int var4 = arg0.field1129;
                    int var5 = arg0.field1199[arg0.field1198 - 1] * 128 + arg0.field1132 * 64;
                    int var6 = arg0.field1201[arg0.field1198 - 1] * 128 + arg0.field1132 * 64;
                    if (var3 < var5) {
                        if (var4 < var6) {
                            arg0.field1157 = 1280;
                        } else if (var4 > var6) {
                            arg0.field1157 = 1792;
                        } else {
                            arg0.field1157 = 1536;
                        }
                    } else if (var3 > var5) {
                        if (var4 < var6) {
                            arg0.field1157 = 768;
                        } else if (var4 > var6) {
                            arg0.field1157 = 256;
                        } else {
                            arg0.field1157 = 512;
                        }
                    } else if (var4 < var6) {
                        arg0.field1157 = 1024;
                    } else if (var4 > var6) {
                        arg0.field1157 = 0;
                    }
                    class194 var7 = arg0.field1143[arg0.field1198 - 1];
                    if (var5 - var3 <= 256 && var5 - var3 >= -256 && var6 - var4 <= 256 && var6 - var4 >= -256) {
                        int var8 = arg0.field1157 - arg0.field1130 & 0x7FF;
                        if (var8 > 1024) {
                            var8 -= 2048;
                        }
                        int var9 = arg0.field1205;
                        if (var8 >= -256 && var8 <= 256) {
                            var9 = arg0.field1176;
                        } else if (var8 >= 256 && var8 < 768) {
                            var9 = arg0.field1140;
                        } else if (var8 >= -768 && var8 <= -256) {
                            var9 = arg0.field1168;
                        }
                        if (var9 == -1) {
                            var9 = arg0.field1176;
                        }
                        arg0.field1166 = var9;
                        int var10 = 4;
                        boolean var11 = true;
                        if (arg0 instanceof class92) {
                            var11 = ((class92) arg0).field1254.field1956;
                        }
                        if (var11) {
                            if (arg0.field1157 != arg0.field1130 && arg0.field1179 == -1 && arg0.field1197 != 0) {
                                var10 = 2;
                            }
                            if (arg0.field1198 > 2) {
                                var10 = 6;
                            }
                            if (arg0.field1198 > 3) {
                                var10 = 8;
                            }
                            if (arg0.field1202 > 0 && arg0.field1198 > 1) {
                                var10 = 8;
                                arg0.field1202--;
                            }
                        } else {
                            if (arg0.field1198 > 1) {
                                var10 = 6;
                            }
                            if (arg0.field1198 > 2) {
                                var10 = 8;
                            }
                            if (arg0.field1202 > 0 && arg0.field1198 > 1) {
                                var10 = 8;
                                arg0.field1202--;
                            }
                        }
                        if (class194.field2248 == var7) {
                            var10 <<= 0x1;
                        } else if (class194.field2245 == var7) {
                            var10 >>= 0x1;
                        }
                        if (var10 >= 8) {
                            if (arg0.field1176 == arg0.field1166 && arg0.field1128 != -1) {
                                arg0.field1166 = arg0.field1128;
                            } else if (arg0.field1205 == arg0.field1166 && arg0.field1190 != -1) {
                                arg0.field1166 = arg0.field1190;
                            } else if (arg0.field1168 == arg0.field1166 && arg0.field1194 != -1) {
                                arg0.field1166 = arg0.field1194;
                            } else if (arg0.field1166 == arg0.field1140 && arg0.field1144 != -1) {
                                arg0.field1166 = arg0.field1144;
                            }
                        } else if (var10 <= 1) {
                            if (arg0.field1176 == arg0.field1166 && arg0.field1145 != -1) {
                                arg0.field1166 = arg0.field1145;
                            } else if (arg0.field1205 == arg0.field1166 && arg0.field1180 != -1) {
                                arg0.field1166 = arg0.field1180;
                            } else if (arg0.field1168 == arg0.field1166 && arg0.field1183 != -1) {
                                arg0.field1166 = arg0.field1183;
                            } else if (arg0.field1166 == arg0.field1140 && arg0.field1172 != -1) {
                                arg0.field1166 = arg0.field1172;
                            }
                        }
                        if (var3 != var5 || var4 != var6) {
                            if (var3 < var5) {
                                arg0.field1185 += var10;
                                if (arg0.field1185 > var5) {
                                    arg0.field1185 = var5;
                                }
                            } else if (var3 > var5) {
                                arg0.field1185 -= var10;
                                if (arg0.field1185 < var5) {
                                    arg0.field1185 = var5;
                                }
                            }
                            if (var4 < var6) {
                                arg0.field1129 += var10;
                                if (arg0.field1129 > var6) {
                                    arg0.field1129 = var6;
                                }
                            } else if (var4 > var6) {
                                arg0.field1129 -= var10;
                                if (arg0.field1129 < var6) {
                                    arg0.field1129 = var6;
                                }
                            }
                        }
                        if (arg0.field1185 == var5 && arg0.field1129 == var6) {
                            arg0.field1198--;
                            if (arg0.field1203 > 0) {
                                arg0.field1203--;
                            }
                        }
                    } else {
                        arg0.field1185 = var5;
                        arg0.field1129 = var6;
                        arg0.field1198--;
                        if (arg0.field1203 > 0) {
                            arg0.field1203--;
                        }
                    }
                }
            }
        }
        if (arg0.field1185 < 128 || arg0.field1129 < 128 || arg0.field1185 >= 13184 || arg0.field1129 >= 13184) {
            arg0.field1147 = -1;
            arg0.field1175 = -1;
            arg0.field1184 = 0;
            arg0.field1137 = 0;
            arg0.field1185 = arg0.field1199[0] * 128 + arg0.field1132 * 64;
            arg0.field1129 = arg0.field1201[0] * 128 + arg0.field1132 * 64;
            arg0.method2227();
        }
        if (Statics.field890 == arg0 && (arg0.field1185 < 1536 || arg0.field1129 < 1536 || arg0.field1185 >= 11776 || arg0.field1129 >= 11776)) {
            arg0.field1147 = -1;
            arg0.field1175 = -1;
            arg0.field1184 = 0;
            arg0.field1137 = 0;
            arg0.field1185 = arg0.field1199[0] * 128 + arg0.field1132 * 64;
            arg0.field1129 = arg0.field1201[0] * 128 + arg0.field1132 * 64;
            arg0.method2227();
        }
        if (arg0.field1197 != 0) {
            if (arg0.field1179 != -1) {
                class87 var12 = null;
                if (arg0.field1179 < 32768) {
                    var12 = field547[arg0.field1179];
                } else if (arg0.field1179 >= 32768) {
                    var12 = field620[arg0.field1179 - 32768];
                }
                if (var12 != null) {
                    int var13 = arg0.field1185 - var12.field1185;
                    int var14 = arg0.field1129 - var12.field1129;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field1157 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field1163) {
                    arg0.field1179 = -1;
                    arg0.field1163 = false;
                }
            }
            if (arg0.field1164 != -1 && (arg0.field1198 == 0 || arg0.field1202 > 0)) {
                arg0.field1157 = arg0.field1164;
                arg0.field1164 = -1;
            }
            int var15 = arg0.field1157 - arg0.field1130 & 0x7FF;
            if (var15 == 0 && arg0.field1163) {
                arg0.field1179 = -1;
                arg0.field1163 = false;
            }
            if (var15 == 0) {
                arg0.field1196 = 0;
            } else {
                arg0.field1196++;
                if (var15 > 1024) {
                    arg0.field1130 -= arg0.field1142 ? var15 : arg0.field1197;
                    boolean var16 = true;
                    if (var15 < arg0.field1197 || var15 > 2048 - arg0.field1197) {
                        arg0.field1130 = arg0.field1157;
                        var16 = false;
                    }
                    if (!arg0.field1142 && arg0.field1166 == arg0.field1134 && (arg0.field1196 > 25 || var16)) {
                        if (arg0.field1135 == -1) {
                            arg0.field1166 = arg0.field1176;
                        } else {
                            arg0.field1166 = arg0.field1135;
                        }
                    }
                } else {
                    arg0.field1130 += arg0.field1142 ? var15 : arg0.field1197;
                    boolean var17 = true;
                    if (var15 < arg0.field1197 || var15 > 2048 - arg0.field1197) {
                        arg0.field1130 = arg0.field1157;
                        var17 = false;
                    }
                    if (!arg0.field1142 && arg0.field1166 == arg0.field1134 && (arg0.field1196 > 25 || var17)) {
                        if (arg0.field1136 == -1) {
                            arg0.field1166 = arg0.field1176;
                        } else {
                            arg0.field1166 = arg0.field1136;
                        }
                    }
                }
                arg0.field1130 &= 0x7FF;
                arg0.field1142 = false;
            }
        }
        arg0.field1131 = false;
        if (arg0.field1166 != -1) {
            class191 var19 = class191.method22(arg0.field1166);
            if (var19 == null) {
                arg0.field1166 = -1;
            } else if (!var19.method3578() && var19.field2205 != null) {
                arg0.field1200++;
                if (arg0.field1167 < var19.field2205.length && arg0.field1200 > var19.field2221[arg0.field1167]) {
                    arg0.field1200 = 1;
                    arg0.field1167++;
                    method4291(var19, arg0.field1167, arg0.field1185, arg0.field1129);
                }
                if (arg0.field1167 >= var19.field2205.length) {
                    if (var19.field2209 > 0) {
                        arg0.field1167 -= var19.field2209;
                        if (var19.field2195) {
                            arg0.field1169++;
                        }
                        if (arg0.field1167 < 0 || arg0.field1167 >= var19.field2205.length || var19.field2195 && arg0.field1169 >= var19.field2216) {
                            arg0.field1200 = 0;
                            arg0.field1167 = 0;
                            arg0.field1169 = 0;
                        }
                    } else {
                        arg0.field1200 = 0;
                        arg0.field1167 = 0;
                    }
                    method4291(var19, arg0.field1167, arg0.field1185, arg0.field1129);
                }
            } else if (var19.method3578()) {
                arg0.field1167++;
                int var20 = var19.method3583();
                if (arg0.field1167 < var20) {
                    method2240(var19, arg0.field1167, arg0.field1185, arg0.field1129);
                } else {
                    if (var19.field2209 > 0) {
                        arg0.field1167 -= var19.field2209;
                        if (var19.field2195) {
                            arg0.field1169++;
                        }
                        if (arg0.field1167 < 0 || arg0.field1167 >= var20 || var19.field2195 && arg0.field1169 >= var19.field2216) {
                            arg0.field1167 = 0;
                            arg0.field1200 = 0;
                            arg0.field1169 = 0;
                        }
                    } else {
                        arg0.field1200 = 0;
                        arg0.field1167 = 0;
                    }
                    method2240(var19, arg0.field1167, arg0.field1185, arg0.field1129);
                }
            } else {
                arg0.field1166 = -1;
            }
        }
        if (arg0.field1175 != -1 && field504 >= arg0.field1148) {
            if (arg0.field1139 < 0) {
                arg0.field1139 = 0;
            }
            int var21 = class181.method5344(arg0.field1175).field1993;
            if (var21 == -1) {
                arg0.field1175 = -1;
            } else {
                class191 var22 = class191.method22(var21);
                if (var22 != null && var22.field2205 != null && !var22.method3578()) {
                    arg0.field1177++;
                    if (arg0.field1139 < var22.field2205.length && arg0.field1177 > var22.field2221[arg0.field1139]) {
                        arg0.field1177 = 1;
                        arg0.field1139++;
                        method4291(var22, arg0.field1139, arg0.field1185, arg0.field1129);
                    }
                    if (arg0.field1139 >= var22.field2205.length && (arg0.field1139 < 0 || arg0.field1139 >= var22.field2205.length)) {
                        arg0.field1175 = -1;
                    }
                } else if (var22.method3578()) {
                    arg0.field1139++;
                    int var23 = var22.method3583();
                    if (arg0.field1139 < var23) {
                        method2240(var22, arg0.field1139, arg0.field1185, arg0.field1129);
                    } else if (arg0.field1139 < 0 || arg0.field1139 >= var23) {
                        arg0.field1175 = -1;
                    }
                } else {
                    arg0.field1175 = -1;
                }
            }
        }
        if (arg0.field1147 != -1 && arg0.field1173 <= 1) {
            class191 var24 = class191.method22(arg0.field1147);
            if (var24.field2218 == 1 && arg0.field1203 > 0 && arg0.field1184 <= field504 && arg0.field1137 < field504) {
                arg0.field1173 = 1;
                return;
            }
        }
        if (arg0.field1147 != -1 && arg0.field1173 == 0) {
            class191 var25 = class191.method22(arg0.field1147);
            if (var25 == null) {
                arg0.field1147 = -1;
            } else if (!var25.method3578() && var25.field2205 != null) {
                arg0.field1138++;
                if (arg0.field1171 < var25.field2205.length && arg0.field1138 > var25.field2221[arg0.field1171]) {
                    arg0.field1138 = 1;
                    arg0.field1171++;
                    method4291(var25, arg0.field1171, arg0.field1185, arg0.field1129);
                }
                if (arg0.field1171 >= var25.field2205.length) {
                    arg0.field1171 -= var25.field2209;
                    arg0.field1174++;
                    if (arg0.field1174 >= var25.field2216) {
                        arg0.field1147 = -1;
                    } else if (arg0.field1171 >= 0 && arg0.field1171 < var25.field2205.length) {
                        method4291(var25, arg0.field1171, arg0.field1185, arg0.field1129);
                    } else {
                        arg0.field1147 = -1;
                    }
                }
                arg0.field1131 = var25.field2212;
            } else if (var25.method3578()) {
                arg0.field1171++;
                int var26 = var25.method3583();
                if (arg0.field1171 < var26) {
                    method2240(var25, arg0.field1171, arg0.field1185, arg0.field1129);
                } else {
                    arg0.field1171 -= var25.field2209;
                    arg0.field1174++;
                    if (arg0.field1174 >= var25.field2216) {
                        arg0.field1147 = -1;
                    } else if (arg0.field1171 >= 0 && arg0.field1171 < var26) {
                        method2240(var25, arg0.field1171, arg0.field1185, arg0.field1129);
                    } else {
                        arg0.field1147 = -1;
                    }
                }
            } else {
                arg0.field1147 = -1;
            }
        }
        if (arg0.field1173 > 0) {
            arg0.field1173--;
        }
    }

    @ObfuscatedName("j.gf(Lce;B)V")
    public static final void method102(class87 arg0) {
        boolean var1 = field504 == arg0.field1137 || arg0.field1147 == -1 || arg0.field1173 != 0;
        if (!var1) {
            class191 var2 = class191.method22(arg0.field1147);
            if (var2 == null || var2.method3578()) {
                var1 = true;
            } else {
                var1 = arg0.field1138 + 1 > var2.field2221[arg0.field1171];
            }
        }
        if (var1) {
            int var3 = arg0.field1137 - arg0.field1184;
            int var4 = field504 - arg0.field1184;
            int var5 = arg0.field1193 * 128 + arg0.field1132 * 64;
            int var6 = arg0.field1182 * 128 + arg0.field1132 * 64;
            int var7 = arg0.field1181 * 128 + arg0.field1132 * 64;
            int var8 = arg0.field1141 * 128 + arg0.field1132 * 64;
            arg0.field1185 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1129 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1202 = 0;
        arg0.field1157 = arg0.field1186;
        arg0.field1130 = arg0.field1157;
    }

    @ObfuscatedName("cu.go(I)V")
    public static void method2271() {
        if (Statics.field422 != null) {
            Statics.field422.method6819(Statics.field1013, (Statics.field890.field1185 >> 7) + Statics.field1560, (Statics.field890.field1129 >> 7) + Statics.field2784, false);
            Statics.field422.method6726();
        }
    }

    @ObfuscatedName("dt.ge(Lcl;III)V")
    public static void method2785(class85 arg0, int arg1, int arg2) {
        if (arg0.field1147 == arg1 && arg1 != -1) {
            int var3 = class191.method22(arg1).field2220;
            if (var3 == 1) {
                arg0.field1171 = 0;
                arg0.field1138 = 0;
                arg0.field1173 = arg2;
                arg0.field1174 = 0;
            }
            if (var3 == 2) {
                arg0.field1174 = 0;
            }
        } else if (arg1 == -1 || arg0.field1147 == -1 || class191.method22(arg1).field2213 >= class191.method22(arg0.field1147).field2213) {
            arg0.field1147 = arg1;
            arg0.field1171 = 0;
            arg0.field1138 = 0;
            arg0.field1173 = arg2;
            arg0.field1174 = 0;
            arg0.field1203 = arg0.field1198;
        }
    }

    @ObfuscatedName("hj.gm(I)I")
    public static int method4268() {
        return field736 ? 2 : 1;
    }

    @ObfuscatedName("hu.gp(II)V")
    public static void method4272(int arg0) {
        field679 = 0L;
        if (arg0 >= 2) {
            field736 = true;
        } else {
            field736 = false;
        }
        if (method4268() == 1) {
            Statics.field4326.method534(765, 503);
        } else {
            Statics.field4326.method534(7680, 2160);
        }
        if (field612 < 25) {
            return;
        }
        class266 var1 = Statics.method2786(class264.field2957, field552.field1342);
        var1.field3064.method7179(method4268());
        var1.field3064.method7286(Statics.field1514);
        var1.field3064.method7286(Statics.field1825);
        field552.method2534(var1);
    }

    @ObfuscatedName("client.h(B)V")
    public final void method444() {
        field679 = class271.method5624() + 500L;
        this.method1294();
        if (field666 != -1) {
            this.method1141(true);
        }
    }

    @ObfuscatedName("client.gg(S)V")
    public void method1294() {
        int var1 = Statics.field1514;
        int var2 = Statics.field1825;
        if (this.field209 < var1) {
            int var3 = this.field209;
        }
        if (this.field199 < var2) {
            int var4 = this.field199;
        }
        if (Statics.field1108 != null) {
            try {
                class28.method399(Statics.field4326, "resize", new Object[] { method4268() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gh(I)V")
    public final void method1134() {
        if (field666 != -1) {
            method4799(field666);
        }
        for (int var1 = 0; var1 < field713; var1++) {
            if (field715[var1]) {
                field557[var1] = true;
            }
            field672[var1] = field715[var1];
            field715[var1] = false;
        }
        field714 = field504;
        field655 = -1;
        field656 = -1;
        Statics.field2641 = null;
        if (field666 != -1) {
            field713 = 0;
            method3661(field666, 0, 0, Statics.field1514, Statics.field1825, 0, 0, -1);
        }
        class454.method7509();
        if (field609) {
            if (field608 == 1) {
                Statics.field1990[field607 / 100].method7604(field605 - 8, field606 - 8);
            }
            if (field608 == 2) {
                Statics.field1990[field607 / 100 + 4].method7604(field605 - 8, field606 - 8);
            }
        }
        if (field641) {
            method2244();
        } else if (field655 != -1) {
            method1098(field655, field656);
        }
        if (field654 == 3) {
            for (int var2 = 0; var2 < field713; var2++) {
                if (field672[var2]) {
                    class454.method7494(field718[var2], field719[var2], field492[var2], field721[var2], 16711935, 128);
                } else if (field557[var2]) {
                    class454.method7494(field718[var2], field719[var2], field492[var2], field721[var2], 16711680, 128);
                }
            }
        }
        class63.method3143(Statics.field1013, Statics.field890.field1185, Statics.field890.field1129, field744);
        field744 = 0;
    }

    @ObfuscatedName("em.gt(Ljava/lang/String;ZI)V")
    public static final void method2959(String arg0, boolean arg1) {
        if (!field533) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field6.method5965(arg0, 250);
        int var6 = Statics.field6.method5950(arg0, 250) * 13;
        class454.method7518(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class454.method7499(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field6.method5974(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method83(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field114.method421(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field713; var11++) {
            if (field718[var11] + field492[var11] > var7 && field718[var11] < var7 + var9 && field721[var11] + field719[var11] > var8 && field719[var11] < var8 + var10) {
                field557[var11] = true;
            }
        }
    }

    @ObfuscatedName("cz.hi(IIIIB)V")
    public static final void method2313(int arg0, int arg1, int arg2, int arg3) {
        field762++;
        method2117();
        if (field624) {
            method1942(Statics.field890, false);
        }
        if (field632 >= 0 && field620[field632] != null) {
            method1942(field620[field632], false);
        }
        method2444(true);
        method1637();
        method2444(false);
        for (class70 var4 = (class70) field635.method5647(); var4 != null; var4 = (class70) field635.method5649()) {
            if (Statics.field1013 != var4.field948 || field504 > var4.field938) {
                var4.method6657();
            } else if (field504 >= var4.field937) {
                if (var4.field941 > 0) {
                    class92 var5 = field547[var4.field941 - 1];
                    if (var5 != null && var5.field1185 >= 0 && var5.field1185 < 13312 && var5.field1129 >= 0 && var5.field1129 < 13312) {
                        var4.method1998(var5.field1185, var5.field1129, method2784(var5.field1185, var5.field1129, var4.field948) - var4.field936, field504);
                    }
                }
                if (var4.field941 < 0) {
                    int var6 = -var4.field941 - 1;
                    class85 var7;
                    if (field621 == var6) {
                        var7 = Statics.field890;
                    } else {
                        var7 = field620[var6];
                    }
                    if (var7 != null && var7.field1185 >= 0 && var7.field1185 < 13312 && var7.field1129 >= 0 && var7.field1129 < 13312) {
                        var4.method1998(var7.field1185, var7.field1129, method2784(var7.field1185, var7.field1129, var4.field948) - var4.field936, field504);
                    }
                }
                var4.method2004(field744);
                Statics.field3318.method3898(Statics.field1013, (int) var4.field943, (int) var4.field946, (int) var4.field942, 60, var4, var4.field951, -1L, false);
            }
        }
        method2961();
        method5888(arg0, arg1, arg2, arg3, true);
        int var8 = field535;
        int var9 = field657;
        int var10 = field771;
        int var11 = field772;
        class454.method7487(var8, var9, var8 + var10, var9 + var11);
        class202.method3759();
        int var12 = field573;
        if (field590 / 256 > var12) {
            var12 = field590 / 256;
        }
        if (field756[4] && field758[4] + 128 > var12) {
            var12 = field758[4] + 128;
        }
        int var13 = field574 & 0x7FF;
        method5341(Statics.field1695, Statics.field1506, Statics.field4146, var12, var13, method4861(var12), var11);
        int var14;
        if (field754) {
            var14 = method3071();
        } else {
            var14 = method2138();
        }
        int var15 = Statics.field1759;
        int var16 = Statics.field963;
        int var17 = Statics.field483;
        int var18 = Statics.field1799;
        int var19 = Statics.field55;
        for (int var20 = 0; var20 < 5; var20++) {
            if (field756[var20]) {
                int var21 = (int) (Math.random() * (double) (field576[var20] * 2 + 1) - (double) field576[var20] + Math.sin((double) field759[var20] / 100.0D * (double) field760[var20]) * (double) field758[var20]);
                if (var20 == 0) {
                    Statics.field1759 += var21;
                }
                if (var20 == 1) {
                    Statics.field963 += var21;
                }
                if (var20 == 2) {
                    Statics.field483 += var21;
                }
                if (var20 == 3) {
                    Statics.field55 = Statics.field55 + var21 & 0x7FF;
                }
                if (var20 == 4) {
                    Statics.field1799 += var21;
                    if (Statics.field1799 < 128) {
                        Statics.field1799 = 128;
                    }
                    if (Statics.field1799 > 383) {
                        Statics.field1799 = 383;
                    }
                }
            }
        }
        int var22 = class33.field232;
        int var23 = class33.field231;
        if (class33.field237 != 0) {
            var22 = class33.field238;
            var23 = class33.field239;
        }
        if (var22 >= var8 && var22 < var8 + var10 && var23 >= var9 && var23 < var9 + var11) {
            class213.method373(var22 - var8, var23 - var9);
        } else {
            Statics.method3139();
        }
        method183();
        class454.method7518(var8, var9, var10, var11, 0);
        method183();
        int var24 = class202.field2382;
        class202.field2382 = field773;
        Statics.field3318.method4005(Statics.field1759, Statics.field963, Statics.field483, Statics.field1799, Statics.field55, var14);
        class202.field2382 = var24;
        method183();
        Statics.field3318.method4071();
        field570 = 0;
        boolean var25 = false;
        int var26 = -1;
        int var27 = -1;
        int var28 = class97.field1305;
        int[] var29 = class97.field1290;
        for (int var30 = 0; var30 < field690 + var28; var30++) {
            class87 var31;
            if (var30 < var28) {
                var31 = field620[var29[var30]];
                if (field632 == var29[var30]) {
                    var25 = true;
                    var26 = var30;
                    continue;
                }
                if (Statics.field890 == var31) {
                    var27 = var30;
                    continue;
                }
            } else {
                var31 = field547[field514[var30 - var28]];
            }
            method295(var31, var30, var8, var9, var10, var11);
        }
        if (field624 && var27 != -1) {
            method295(Statics.field890, var27, var8, var9, var10, var11);
        }
        if (var25) {
            method295(field620[field632], var26, var8, var9, var10, var11);
        }
        for (int var32 = 0; var32 < field570; var32++) {
            int var33 = field593[var32];
            int var34 = field782[var32];
            int var35 = field596[var32];
            int var36 = field556[var32];
            boolean var37 = true;
            while (var37) {
                var37 = false;
                for (int var38 = 0; var38 < var32; var38++) {
                    if (var34 + 2 > field782[var38] - field556[var38] && var34 - var36 < field782[var38] + 2 && var33 - var35 < field596[var38] + field593[var38] && var33 + var35 > field593[var38] - field596[var38] && field782[var38] - field556[var38] < var34) {
                        var34 = field782[var38] - field556[var38];
                        var37 = true;
                    }
                }
            }
            field603 = field593[var32];
            field604 = field782[var32] = var34;
            String var39 = field600[var32];
            if (field670 == 0) {
                int var40 = 16776960;
                if (field733[var32] < 6) {
                    var40 = field725[field733[var32]];
                }
                if (field733[var32] == 6) {
                    var40 = field762 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field733[var32] == 7) {
                    var40 = field762 % 20 < 10 ? 255 : 65535;
                }
                if (field733[var32] == 8) {
                    var40 = field762 % 20 < 10 ? 45056 : 8454016;
                }
                if (field733[var32] == 9) {
                    int var41 = 150 - field599[var32];
                    if (var41 < 50) {
                        var40 = var41 * 1280 + 16711680;
                    } else if (var41 < 100) {
                        var40 = 16776960 - (var41 - 50) * 327680;
                    } else if (var41 < 150) {
                        var40 = (var41 - 100) * 5 + 65280;
                    }
                }
                if (field733[var32] == 10) {
                    int var42 = 150 - field599[var32];
                    if (var42 < 50) {
                        var40 = var42 * 5 + 16711680;
                    } else if (var42 < 100) {
                        var40 = 16711935 - (var42 - 50) * 327680;
                    } else if (var42 < 150) {
                        var40 = (var42 - 100) * 327680 + 255 - (var42 - 100) * 5;
                    }
                }
                if (field733[var32] == 11) {
                    int var43 = 150 - field599[var32];
                    if (var43 < 50) {
                        var40 = 16777215 - var43 * 327685;
                    } else if (var43 < 100) {
                        var40 = (var43 - 50) * 327685 + 65280;
                    } else if (var43 < 150) {
                        var40 = 16777215 - (var43 - 100) * 327680;
                    }
                }
                if (field598[var32] == 0) {
                    Statics.field181.method5955(var39, field603 + var8, field604 + var9, var40, 0);
                }
                if (field598[var32] == 1) {
                    Statics.field181.method5957(var39, field603 + var8, field604 + var9, var40, 0, field762);
                }
                if (field598[var32] == 2) {
                    Statics.field181.method6011(var39, field603 + var8, field604 + var9, var40, 0, field762);
                }
                if (field598[var32] == 3) {
                    Statics.field181.method5958(var39, field603 + var8, field604 + var9, var40, 0, field762, 150 - field599[var32]);
                }
                if (field598[var32] == 4) {
                    int var44 = (150 - field599[var32]) * (Statics.field181.method5952(var39) + 100) / 150;
                    class454.method7488(field603 + var8 - 50, var9, field603 + var8 + 50, var9 + var11);
                    Statics.field181.method5953(var39, field603 + var8 + 50 - var44, field604 + var9, var40, 0);
                    class454.method7487(var8, var9, var8 + var10, var9 + var11);
                }
                if (field598[var32] == 5) {
                    int var45 = 150 - field599[var32];
                    int var46 = 0;
                    if (var45 < 25) {
                        var46 = var45 - 25;
                    } else if (var45 > 125) {
                        var46 = var45 - 125;
                    }
                    class454.method7488(var8, field604 + var9 - Statics.field181.field4224 - 1, var8 + var10, field604 + var9 + 5);
                    Statics.field181.method5955(var39, field603 + var8, field604 + var9 + var46, var40, 0);
                    class454.method7487(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field181.method5955(var39, field603 + var8, field604 + var9, 16776960, 0);
            }
        }
        if (field511 == 2) {
            method2159((field542 - Statics.field1560 << 7) + field517, (field515 - Statics.field2784 << 7) + field518, field671 * 2);
            if (field603 > -1 && field504 % 20 < 10) {
                Statics.field1603[0].method7604(field603 + var8 - 12, field604 + var9 - 28);
            }
        }
        ((class210) Statics.field2393).method4108(field744);
        field618 = 0;
        int var47 = (Statics.field890.field1185 >> 7) + Statics.field1560;
        int var48 = (Statics.field890.field1129 >> 7) + Statics.field2784;
        if (var47 >= 3053 && var47 <= 3156 && var48 >= 3056 && var48 <= 3136) {
            field618 = 1;
        }
        if (var47 >= 3072 && var47 <= 3118 && var48 >= 9492 && var48 <= 9535) {
            field618 = 1;
        }
        if (field618 == 1 && var47 >= 3139 && var47 <= 3199 && var48 >= 3008 && var48 <= 3062) {
            field618 = 0;
        }
        Statics.field1759 = var15;
        Statics.field963 = var16;
        Statics.field483 = var17;
        Statics.field1799 = var18;
        Statics.field55 = var19;
        if (field503 && class318.method3109(true, false) == 0) {
            field503 = false;
        }
        if (field503) {
            class454.method7518(var8, var9, var10, var11, 0);
            method2959(class310.field3666, false);
        }
    }

    @ObfuscatedName("my.he(IIIIZI)V")
    public static final void method5888(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field761;
        } else if (var5 >= 100) {
            var6 = field763;
        } else {
            var6 = (field763 - field761) * var5 / 100 + field761;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field538) {
            short var8 = field538;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field757) {
                var6 = field757;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class454.method7509();
                    class454.method7518(arg0, arg1, var10, arg3, -16777216);
                    class454.method7518(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field639) {
            short var11 = field639;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field765) {
                var6 = field765;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class454.method7509();
                    class454.method7518(arg0, arg1, arg2, var13, -16777216);
                    class454.method7518(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field773 = arg3 * var6 / 334;
        if (field771 != arg2 || field772 != arg3) {
            method370(arg2, arg3);
        }
        field535 = arg0;
        field657 = arg1;
        field771 = arg2;
        field772 = arg3;
    }

    @ObfuscatedName("bu.hm(I)V")
    public static void method2117() {
        if (Statics.field890.field1185 >> 7 == field742 && Statics.field890.field1129 >> 7 == field743) {
            field742 = 0;
        }
    }

    @ObfuscatedName("client.ha(I)V")
    public static void method1637() {
        int var0 = class97.field1305;
        int[] var1 = class97.field1290;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field632 != var1[var2] && field621 != var1[var2]) {
                method1942(field620[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("bx.hn(Lcl;ZB)V")
    public static void method1942(class85 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2182() || arg0.field1105) {
            return;
        }
        arg0.field1103 = false;
        if ((field497 && class97.field1305 > 50 || class97.field1305 > 200) && arg1 && arg0.field1166 == arg0.field1134) {
            arg0.field1103 = true;
        }
        int var2 = arg0.field1185 >> 7;
        int var3 = arg0.field1129 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class213.method4796(0, 0, 0, false, arg0.field1100);
        if (arg0.field1098 != null && field504 >= arg0.field1111 && field504 < arg0.field1094) {
            arg0.field1103 = false;
            arg0.field1092 = method2784(arg0.field1185, arg0.field1129, Statics.field1013);
            arg0.field1162 = field504;
            Statics.field3318.method3899(Statics.field1013, arg0.field1185, arg0.field1129, arg0.field1092, 60, arg0, arg0.field1130, var4, arg0.field1099, arg0.field1102, arg0.field1101, arg0.field1095);
            return;
        }
        if ((arg0.field1185 & 0x7F) == 64 && (arg0.field1129 & 0x7F) == 64) {
            if (field762 == field709[var2][var3]) {
                return;
            }
            field709[var2][var3] = field762;
        }
        arg0.field1092 = method2784(arg0.field1185, arg0.field1129, Statics.field1013);
        arg0.field1162 = field504;
        Statics.field3318.method3898(Statics.field1013, arg0.field1185, arg0.field1129, arg0.field1092, 60, arg0, arg0.field1130, var4, arg0.field1131);
    }

    @ObfuscatedName("cq.hw(ZI)V")
    public static final void method2444(boolean arg0) {
        for (int var1 = 0; var1 < field690; var1++) {
            class92 var2 = field547[field514[var1]];
            if (var2 != null && var2.method2182() && var2.field1254.field1962 == arg0 && var2.field1254.method3276()) {
                int var3 = var2.field1185 >> 7;
                int var4 = var2.field1129 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1132 == 1 && (var2.field1185 & 0x7F) == 64 && (var2.field1129 & 0x7F) == 64) {
                        if (field762 == field709[var3][var4]) {
                            continue;
                        }
                        field709[var3][var4] = field762;
                    }
                    long var5 = class213.method4796(0, 0, 1, !var2.field1254.field1937, field514[var1]);
                    var2.field1162 = field504;
                    Statics.field3318.method3898(Statics.field1013, var2.field1185, var2.field1129, method2784(var2.field1185 + (var2.field1132 * 64 - 64), var2.field1129 + (var2.field1132 * 64 - 64), Statics.field1013), var2.field1132 * 64 - 64 + 60, var2, var2.field1130, var5, var2.field1131);
                }
            }
        }
    }

    @ObfuscatedName("em.hj(I)V")
    public static final void method2961() {
        for (class65 var0 = (class65) field633.method5647(); var0 != null; var0 = (class65) field633.method5649()) {
            if (Statics.field1013 != var0.field854 || var0.field861) {
                var0.method6657();
            } else if (field504 >= var0.field853) {
                var0.method1924(field744);
                if (var0.field861) {
                    var0.method6657();
                } else {
                    Statics.field3318.method3898(var0.field854, var0.field855, var0.field852, var0.field857, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("bs.hv(I)I")
    public static final int method2138() {
        if (Statics.field1108.method2344()) {
            return Statics.field1013;
        }
        int var0 = 3;
        if (Statics.field1799 < 310) {
            int var1;
            int var2;
            if (field579 == 1) {
                var1 = Statics.field1695 >> 7;
                var2 = Statics.field4146 >> 7;
            } else {
                var1 = Statics.field890.field1185 >> 7;
                var2 = Statics.field890.field1129 >> 7;
            }
            int var3 = Statics.field1759 >> 7;
            int var4 = Statics.field483 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field1013;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1013;
            }
            if ((class75.field999[Statics.field1013][var3][var4] & 0x4) != 0) {
                var0 = Statics.field1013;
            }
            int var5;
            if (var1 > var3) {
                var5 = var1 - var3;
            } else {
                var5 = var3 - var1;
            }
            int var6;
            if (var2 > var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var3 < var1) {
                        var3++;
                    } else if (var3 > var1) {
                        var3--;
                    }
                    if ((class75.field999[Statics.field1013][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1013;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class75.field999[Statics.field1013][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1013;
                        }
                    }
                }
            } else if (var6 > 0) {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var4 < var2) {
                        var4++;
                    } else if (var4 > var2) {
                        var4--;
                    }
                    if ((class75.field999[Statics.field1013][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1013;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class75.field999[Statics.field1013][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1013;
                        }
                    }
                }
            }
        }
        if (Statics.field890.field1185 >= 0 && Statics.field890.field1129 >= 0 && Statics.field890.field1185 < 13312 && Statics.field890.field1129 < 13312) {
            if ((class75.field999[Statics.field1013][Statics.field890.field1185 >> 7][Statics.field890.field1129 >> 7] & 0x4) != 0) {
                var0 = Statics.field1013;
            }
            return var0;
        } else {
            return Statics.field1013;
        }
    }

    @ObfuscatedName("fc.hc(I)I")
    public static final int method3071() {
        if (Statics.field1108.method2344()) {
            return Statics.field1013;
        } else {
            int var0 = method2784(Statics.field1759, Statics.field483, Statics.field1013);
            return var0 - Statics.field963 >= 800 || (class75.field999[Statics.field1013][Statics.field1759 >> 7][Statics.field483 >> 7] & 0x4) == 0 ? 3 : Statics.field1013;
        }
    }

    @ObfuscatedName("db.hp(I)Z")
    public static boolean method2606() {
        return (field625 & 0x4) != 0;
    }

    @ObfuscatedName("ez.hu(I)Z")
    public static boolean method2874() {
        return (field625 & 0x1) != 0;
    }

    @ObfuscatedName("e.hr(Lce;IIIIII)V")
    public static final void method295(class87 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2182()) {
            return;
        }
        if (arg0 instanceof class92) {
            class179 var6 = ((class92) arg0).field1254;
            if (var6.field1967 != null) {
                var6 = var6.method3298();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class97.field1305;
        int[] var8 = class97.field1290;
        byte var9 = 0;
        if (arg1 < var7 && field504 == arg0.field1162 && Statics.method4736((class85) arg0)) {
            class85 var10 = (class85) arg0;
            if (arg1 < var7) {
                method2823(arg0, arg0.field1188 + 15);
                class352 var11 = (class352) field623.get(class419.field4617);
                byte var12 = 9;
                var11.method5955(var10.field1109.method7774(), field603 + arg2, field604 + arg3 - var12, 16777215, 0);
                var9 = 18;
            }
        }
        int var13 = -2;
        if (!arg0.field1161.method5697()) {
            method2823(arg0, arg0.field1188 + 15);
            for (class91 var14 = (class91) arg0.field1161.method5708(); var14 != null; var14 = (class91) arg0.field1161.method5695()) {
                class88 var15 = var14.method2385(field504);
                if (var15 != null) {
                    class175 var16 = var14.field1252;
                    class458 var17 = var16.method3232();
                    class458 var18 = var16.method3231();
                    int var19 = 0;
                    int var20;
                    if (var17 == null || var18 == null) {
                        var20 = var16.field1902;
                    } else {
                        if (var16.field1892 * 2 < var18.field4825) {
                            var19 = var16.field1892;
                        }
                        var20 = var18.field4825 - var19 * 2;
                    }
                    int var21 = 255;
                    boolean var22 = true;
                    int var23 = field504 - var15.field1210;
                    int var24 = var15.field1208 * var20 / var16.field1902;
                    int var27;
                    if (var15.field1206 > var23) {
                        int var25 = var16.field1898 == 0 ? 0 : var23 / var16.field1898 * var16.field1898;
                        int var26 = var15.field1207 * var20 / var16.field1902;
                        var27 = (var24 - var26) * var25 / var15.field1206 + var26;
                    } else {
                        var27 = var24;
                        int var28 = var15.field1206 + var16.field1891 - var23;
                        if (var16.field1903 >= 0) {
                            var21 = (var28 << 8) / (var16.field1891 - var16.field1903);
                        }
                    }
                    if (var15.field1208 > 0 && var27 < 1) {
                        var27 = 1;
                    }
                    if (var17 == null || var18 == null) {
                        var13 += 5;
                        if (field603 > -1) {
                            int var34 = field603 + arg2 - (var20 >> 1);
                            int var35 = field604 + arg3 - var13;
                            class454.method7518(var34, var35, var27, 5, 65280);
                            class454.method7518(var27 + var34, var35, var20 - var27, 5, 16711680);
                        }
                        var13 += 2;
                    } else {
                        int var29;
                        if (var20 == var27) {
                            var29 = var19 * 2 + var27;
                        } else {
                            var29 = var19 + var27;
                        }
                        int var30 = var17.field4829;
                        var13 += var30;
                        int var31 = field603 + arg2 - (var20 >> 1);
                        int var32 = field604 + arg3 - var13;
                        int var33 = var31 - var19;
                        if (var21 >= 0 && var21 < 255) {
                            var17.method7610(var33, var32, var21);
                            class454.method7488(var33, var32, var29 + var33, var30 + var32);
                            var18.method7610(var33, var32, var21);
                        } else {
                            var17.method7604(var33, var32);
                            class454.method7488(var33, var32, var29 + var33, var30 + var32);
                            var18.method7604(var33, var32);
                        }
                        class454.method7487(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var13 += 2;
                    }
                } else if (var14.method2394()) {
                    var14.method6657();
                }
            }
        }
        if (var13 == -2) {
            var13 += 7;
        }
        int var36 = var9 + var13;
        if (arg1 < var7) {
            class85 var37 = (class85) arg0;
            if (var37.field1105) {
                return;
            }
            if (var37.field1087 != -1 || var37.field1088 != -1) {
                method2823(arg0, arg0.field1188 + 15);
                if (field603 > -1) {
                    if (var37.field1087 != -1) {
                        var36 += 25;
                        Statics.field19[var37.field1087].method7604(field603 + arg2 - 12, field604 + arg3 - var36);
                    }
                    if (var37.field1088 != -1) {
                        var36 += 25;
                        Statics.field169[var37.field1088].method7604(field603 + arg2 - 12, field604 + arg3 - var36);
                    }
                }
            }
            if (arg1 >= 0 && field511 == 10 && field513 == var8[arg1]) {
                method2823(arg0, arg0.field1188 + 15);
                if (field603 > -1) {
                    int var38 = Statics.field1603[1].field4829 + var36;
                    Statics.field1603[1].method7604(field603 + arg2 - 12, field604 + arg3 - var38);
                }
            }
        } else {
            class179 var39 = ((class92) arg0).field1254;
            if (var39.field1967 != null) {
                var39 = var39.method3298();
            }
            if (var39.field1965 >= 0 && var39.field1965 < Statics.field169.length) {
                method2823(arg0, arg0.field1188 + 15);
                if (field603 > -1) {
                    Statics.field169[var39.field1965].method7604(field603 + arg2 - 12, field604 + arg3 - 30);
                }
            }
            if (field511 == 1 && field512 == field514[arg1 - var7] && field504 % 20 < 10) {
                method2823(arg0, arg0.field1188 + 15);
                if (field603 > -1) {
                    Statics.field1603[0].method7604(field603 + arg2 - 12, field604 + arg3 - 28);
                }
            }
        }
        if (arg0.field1149 != null && (arg1 >= var7 || !arg0.field1151 && (field698 == 4 || !arg0.field1150 && (field698 == 0 || field698 == 3 || field698 == 1 && ((class85) arg0).method2204())))) {
            method2823(arg0, arg0.field1188);
            if (field603 > -1 && field570 < field592) {
                field596[field570] = Statics.field181.method5952(arg0.field1149) / 2;
                field556[field570] = Statics.field181.field4224;
                field593[field570] = field603;
                field782[field570] = field604;
                field733[field570] = arg0.field1153;
                field598[field570] = arg0.field1154;
                field599[field570] = arg0.field1152;
                field600[field570] = arg0.field1149;
                field570++;
            }
        }
        for (int var40 = 0; var40 < 4; var40++) {
            int var41 = arg0.field1158[var40];
            int var42 = arg0.field1156[var40];
            class187 var43 = null;
            int var44 = 0;
            if (var42 >= 0) {
                if (var41 <= field504) {
                    continue;
                }
                var43 = class187.method2834(arg0.field1156[var40]);
                var44 = var43.field2052;
                if (var43 != null && var43.field2059 != null) {
                    var43 = var43.method3385();
                    if (var43 == null) {
                        arg0.field1158[var40] = -1;
                        continue;
                    }
                }
            } else if (var41 < 0) {
                continue;
            }
            int var45 = arg0.field1133[var40];
            class187 var46 = null;
            if (var45 >= 0) {
                var46 = class187.method2834(var45);
                if (var46 != null && var46.field2059 != null) {
                    var46 = var46.method3385();
                }
            }
            if (var41 - var44 <= field504) {
                if (var43 == null) {
                    arg0.field1158[var40] = -1;
                } else {
                    method2823(arg0, arg0.field1188 / 2);
                    if (field603 > -1) {
                        boolean var47 = true;
                        if (var40 == 1) {
                            field604 -= 20;
                        }
                        if (var40 == 2) {
                            field603 -= 15;
                            field604 -= 10;
                        }
                        if (var40 == 3) {
                            field603 += 15;
                            field604 -= 10;
                        }
                        Object var48 = null;
                        Object var49 = null;
                        Object var50 = null;
                        Object var51 = null;
                        int var52 = 0;
                        int var53 = 0;
                        int var54 = 0;
                        int var55 = 0;
                        int var56 = 0;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        class458 var60 = null;
                        class458 var61 = null;
                        class458 var62 = null;
                        class458 var63 = null;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        class458 var73 = var43.method3387();
                        if (var73 != null) {
                            var52 = var73.field4825;
                            int var74 = var73.field4829;
                            if (var74 > var72) {
                                var72 = var74;
                            }
                            var56 = var73.field4827;
                        }
                        class458 var75 = var43.method3388();
                        if (var75 != null) {
                            var53 = var75.field4825;
                            int var76 = var75.field4829;
                            if (var76 > var72) {
                                var72 = var76;
                            }
                            var57 = var75.field4827;
                        }
                        class458 var77 = var43.method3389();
                        if (var77 != null) {
                            var54 = var77.field4825;
                            int var78 = var77.field4829;
                            if (var78 > var72) {
                                var72 = var78;
                            }
                            var58 = var77.field4827;
                        }
                        class458 var79 = var43.method3390();
                        if (var79 != null) {
                            var55 = var79.field4825;
                            int var80 = var79.field4829;
                            if (var80 > var72) {
                                var72 = var80;
                            }
                            var59 = var79.field4827;
                        }
                        if (var46 != null) {
                            var60 = var46.method3387();
                            if (var60 != null) {
                                var64 = var60.field4825;
                                int var81 = var60.field4829;
                                if (var81 > var72) {
                                    var72 = var81;
                                }
                                var68 = var60.field4827;
                            }
                            var61 = var46.method3388();
                            if (var61 != null) {
                                var65 = var61.field4825;
                                int var82 = var61.field4829;
                                if (var82 > var72) {
                                    var72 = var82;
                                }
                                var69 = var61.field4827;
                            }
                            var62 = var46.method3389();
                            if (var62 != null) {
                                var66 = var62.field4825;
                                int var83 = var62.field4829;
                                if (var83 > var72) {
                                    var72 = var83;
                                }
                                var70 = var62.field4827;
                            }
                            var63 = var46.method3390();
                            if (var63 != null) {
                                var67 = var63.field4825;
                                int var84 = var63.field4829;
                                if (var84 > var72) {
                                    var72 = var84;
                                }
                                var71 = var63.field4827;
                            }
                        }
                        class351 var85 = var43.method3391();
                        if (var85 == null) {
                            var85 = Statics.field1752;
                        }
                        class351 var86;
                        if (var46 == null) {
                            var86 = Statics.field1752;
                        } else {
                            var86 = var46.method3391();
                            if (var86 == null) {
                                var86 = Statics.field1752;
                            }
                        }
                        Object var87 = null;
                        String var88 = null;
                        boolean var89 = false;
                        int var90 = 0;
                        String var91 = var43.method3396(arg0.field1178[var40]);
                        int var92 = var85.method5952(var91);
                        if (var46 != null) {
                            var88 = var46.method3396(arg0.field1160[var40]);
                            var90 = var86.method5952(var88);
                        }
                        int var93 = 0;
                        int var94 = 0;
                        if (var53 > 0) {
                            if (var77 == null && var79 == null) {
                                var93 = 1;
                            } else {
                                var93 = var92 / var53 + 1;
                            }
                        }
                        if (var46 != null && var65 > 0) {
                            if (var62 == null && var63 == null) {
                                var94 = 1;
                            } else {
                                var94 = var90 / var65 + 1;
                            }
                        }
                        int var95 = 0;
                        int var96 = var95;
                        if (var52 > 0) {
                            var95 += var52;
                        }
                        var95 += 2;
                        int var97 = var95;
                        if (var54 > 0) {
                            var95 += var54;
                        }
                        int var98 = var95;
                        int var99 = var95;
                        int var101;
                        if (var53 > 0) {
                            int var100 = var53 * var93;
                            var101 = var95 + var100;
                            var99 = (var100 - var92) / 2 + var95;
                        } else {
                            var101 = var92 + var95;
                        }
                        int var102 = var101;
                        if (var55 > 0) {
                            var101 += var55;
                        }
                        int var103 = 0;
                        int var104 = 0;
                        int var105 = 0;
                        int var106 = 0;
                        int var107 = 0;
                        if (var46 != null) {
                            var101 += 2;
                            var103 = var101;
                            if (var64 > 0) {
                                var101 += var64;
                            }
                            var101 += 2;
                            var104 = var101;
                            if (var66 > 0) {
                                var101 += var66;
                            }
                            var105 = var101;
                            var107 = var101;
                            if (var65 > 0) {
                                int var108 = var65 * var94;
                                var101 += var108;
                                var107 += (var108 - var90) / 2;
                            } else {
                                var101 += var90;
                            }
                            var106 = var101;
                            if (var67 > 0) {
                                var101 += var67;
                            }
                        }
                        int var109 = arg0.field1158[var40] - field504;
                        int var110 = var43.field2057 - var43.field2057 * var109 / var43.field2052;
                        int var111 = var43.field2058 * var109 / var43.field2052 + -var43.field2058;
                        int var112 = field603 + arg2 - (var101 >> 1) + var110;
                        int var113 = field604 + arg3 - 12 + var111;
                        int var114 = var113;
                        int var115 = var72 + var113;
                        int var116 = var43.field2054 + var113 + 15;
                        int var117 = var116 - var85.field4225;
                        int var118 = var85.field4226 + var116;
                        if (var117 < var113) {
                            var114 = var117;
                        }
                        if (var118 > var115) {
                            var115 = var118;
                        }
                        int var119 = 0;
                        if (var46 != null) {
                            var119 = var46.field2054 + var113 + 15;
                            int var120 = var119 - var86.field4225;
                            int var121 = var86.field4226 + var119;
                            if (var120 < var114) {
                                ;
                            }
                            if (var121 > var115) {
                                ;
                            }
                        }
                        int var124 = 255;
                        if (var43.field2065 >= 0) {
                            var124 = (var109 << 8) / (var43.field2052 - var43.field2065);
                        }
                        if (var124 >= 0 && var124 < 255) {
                            if (var73 != null) {
                                var73.method7610(var96 + var112 - var56, var113, var124);
                            }
                            if (var77 != null) {
                                var77.method7610(var97 + var112 - var58, var113, var124);
                            }
                            if (var75 != null) {
                                for (int var125 = 0; var125 < var93; var125++) {
                                    var75.method7610(var53 * var125 + (var98 + var112 - var57), var113, var124);
                                }
                            }
                            if (var79 != null) {
                                var79.method7610(var102 + var112 - var59, var113, var124);
                            }
                            var85.method6018(var91, var99 + var112, var116, var43.field2051, 0, var124);
                            if (var46 != null) {
                                if (var60 != null) {
                                    var60.method7610(var103 + var112 - var68, var113, var124);
                                }
                                if (var62 != null) {
                                    var62.method7610(var104 + var112 - var70, var113, var124);
                                }
                                if (var61 != null) {
                                    for (int var126 = 0; var126 < var94; var126++) {
                                        var61.method7610(var65 * var126 + (var105 + var112 - var69), var113, var124);
                                    }
                                }
                                if (var63 != null) {
                                    var63.method7610(var106 + var112 - var71, var113, var124);
                                }
                                var86.method6018(var88, var107 + var112, var119, var46.field2051, 0, var124);
                            }
                        } else {
                            if (var73 != null) {
                                var73.method7604(var96 + var112 - var56, var113);
                            }
                            if (var77 != null) {
                                var77.method7604(var97 + var112 - var58, var113);
                            }
                            if (var75 != null) {
                                for (int var127 = 0; var127 < var93; var127++) {
                                    var75.method7604(var53 * var127 + (var98 + var112 - var57), var113);
                                }
                            }
                            if (var79 != null) {
                                var79.method7604(var102 + var112 - var59, var113);
                            }
                            var85.method5953(var91, var99 + var112, var116, var43.field2051 | 0xFF000000, 0);
                            if (var46 != null) {
                                if (var60 != null) {
                                    var60.method7604(var103 + var112 - var68, var113);
                                }
                                if (var62 != null) {
                                    var62.method7604(var104 + var112 - var70, var113);
                                }
                                if (var61 != null) {
                                    for (int var128 = 0; var128 < var94; var128++) {
                                        var61.method7604(var65 * var128 + (var105 + var112 - var69), var113);
                                    }
                                }
                                if (var63 != null) {
                                    var63.method7604(var106 + var112 - var71, var113);
                                }
                                var86.method5953(var88, var107 + var112, var119, var46.field2051 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dc.hk(Lce;II)V")
    public static final void method2823(class87 arg0, int arg1) {
        method2159(arg0.field1185, arg0.field1129, arg1);
    }

    @ObfuscatedName("ct.hz(IIIB)V")
    public static final void method2159(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field603 = -1;
            field604 = -1;
            return;
        }
        int var3 = method2784(arg0, arg1, Statics.field1013) - arg2;
        int var4 = arg0 - Statics.field1759;
        int var5 = var3 - Statics.field963;
        int var6 = arg1 - Statics.field483;
        int var7 = class202.field2396[Statics.field1799];
        int var8 = class202.field2381[Statics.field1799];
        int var9 = class202.field2396[Statics.field55];
        int var10 = class202.field2381[Statics.field55];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field603 = field773 * var11 / var15 + field771 / 2;
            field604 = field773 * var14 / var15 + field772 / 2;
        } else {
            field603 = -1;
            field604 = -1;
        }
    }

    @ObfuscatedName("dt.hq(IIII)I")
    public static final int method2784(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class75.field999[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class75.field998[var5][var3][var4] + class75.field998[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class75.field998[var5][var3][var4 + 1] + class75.field998[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("jn.hf(IIB)I")
    public static int method5076(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field595 - field649) * var2 / 100 + field649;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("kt.ht(IIIIIIII)V")
    public static final void method5341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method5076(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class202.field2396[var8];
            int var14 = class202.field2381[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class202.field2396[var9];
            int var17 = class202.field2381[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        if (field754) {
            Statics.field4480 = arg0 - var10;
            Statics.field1725 = arg1 - var11;
            Statics.field4011 = arg2 - var12;
            Statics.field121 = arg3;
            Statics.field790 = arg4;
        } else {
            Statics.field1759 = arg0 - var10;
            Statics.field963 = arg1 - var11;
            Statics.field483 = arg2 - var12;
            Statics.field1799 = arg3;
            Statics.field55 = arg4;
        }
        if (field579 != 1 || field675 < 2 || field504 % 50 != 0 || !(Statics.field1695 >> 7 != Statics.field890.field1185 >> 7 || Statics.field4146 >> 7 != Statics.field890.field1129 >> 7)) {
            return;
        }
        int var19 = Statics.field890.field1106;
        int var20 = (Statics.field1695 >> 7) + Statics.field1560;
        int var21 = (Statics.field4146 >> 7) + Statics.field2784;
        class266 var22 = Statics.method2786(class264.field3009, field552.field1342);
        var22.field3064.method7225(var19);
        var22.field3064.method7286(var21);
        var22.field3064.method7244(field755);
        var22.field3064.method7234(var20);
        field552.method2534(var22);
    }

    @ObfuscatedName("dz.hy(ZLqf;B)V")
    public static final void method2677(boolean arg0, class444 arg1) {
        field563 = arg0;
        if (!field563) {
            int var2 = arg1.method7237();
            int var3 = arg1.method7237();
            int var4 = arg1.method7198();
            Statics.field2401 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2401[var5][var6] = arg1.method7201();
                }
            }
            Statics.field3195 = new int[var4];
            Statics.field1536 = new int[var4];
            Statics.field2066 = new int[var4];
            Statics.field3198 = new byte[var4][];
            Statics.field246 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field3195[var7] = var10;
                    Statics.field1536[var7] = Statics.field4699.method5482("m" + var8 + "_" + var9);
                    Statics.field2066[var7] = Statics.field4699.method5482("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method4618(var3, var2, true);
            return;
        }
        boolean var11 = arg1.method7296() == 1;
        int var12 = arg1.method7416();
        int var13 = arg1.method7238();
        int var14 = arg1.method7198();
        arg1.method7145();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method7146(1);
                    if (var18 == 1) {
                        field564[var15][var16][var17] = arg1.method7146(26);
                    } else {
                        field564[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method7147();
        Statics.field2401 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field2401[var19][var20] = arg1.method7201();
            }
        }
        Statics.field3195 = new int[var14];
        Statics.field1536 = new int[var14];
        Statics.field2066 = new int[var14];
        Statics.field3198 = new byte[var14][];
        Statics.field246 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field564[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field3195[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field3195[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field1536[var21] = Statics.field4699.method5482("m" + var30 + "_" + var31);
                            Statics.field2066[var21] = Statics.field4699.method5482("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method4618(var12, var13, !var11);
    }

    @ObfuscatedName("ho.hx(IIZI)V")
    public static final void method4618(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field18 == arg0 && Statics.field1685 == arg1) {
            return;
        }
        Statics.field18 = arg0;
        Statics.field1685 = arg1;
        method5138(25);
        method2959(class310.field3666, true);
        int var3 = Statics.field1560;
        int var4 = Statics.field2784;
        Statics.field1560 = (arg0 - 6) * 8;
        Statics.field2784 = (arg1 - 6) * 8;
        int var5 = Statics.field1560 - var3;
        int var6 = Statics.field2784 - var4;
        int var7 = Statics.field1560;
        int var8 = Statics.field2784;
        for (int var9 = 0; var9 < 32768; var9++) {
            class92 var10 = field547[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1199[var11] -= var5;
                    var10.field1201[var11] -= var6;
                }
                var10.field1185 -= var5 * 128;
                var10.field1129 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class85 var13 = field620[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1199[var14] -= var5;
                    var13.field1201[var14] -= var6;
                }
                var13.field1185 -= var5 * 128;
                var13.field1129 -= var6 * 128;
            }
        }
        byte var15 = 0;
        byte var16 = 104;
        byte var17 = 1;
        if (var5 < 0) {
            var15 = 103;
            var16 = -1;
            var17 = -1;
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var6 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        for (int var21 = var15; var21 != var16; var21 += var17) {
            for (int var22 = var18; var22 != var19; var22 += var20) {
                int var23 = var5 + var21;
                int var24 = var6 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        field680[var25][var21][var22] = field680[var25][var23][var24];
                    } else {
                        field680[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class86 var26 = (class86) field634.method5647(); var26 != null; var26 = (class86) field634.method5649()) {
            var26.field1117 -= var5;
            var26.field1126 -= var6;
            if (var26.field1117 < 0 || var26.field1126 < 0 || var26.field1117 >= 104 || var26.field1126 >= 104) {
                var26.method6657();
            }
        }
        if (field742 != 0) {
            field742 -= var5;
            field743 -= var6;
        }
        field748 = 0;
        field754 = false;
        Statics.field1759 -= var5 << 7;
        Statics.field483 -= var6 << 7;
        Statics.field1695 -= var5 << 7;
        Statics.field4146 -= var6 << 7;
        field737 = -1;
        field633.method5641();
        field635.method5641();
        for (int var27 = 0; var27 < 4; var27++) {
            field562[var27].method3622();
        }
    }

    @ObfuscatedName("ck.hg(ZI)V")
    public static final void method2460(boolean arg0) {
        method183();
        field552.field1348++;
        if (field552.field1348 < 50 && !arg0) {
            return;
        }
        field552.field1348 = 0;
        if (field554 || field552.method2549() == null) {
            return;
        }
        class266 var1 = Statics.method2786(class264.field2987, field552.field1342);
        field552.method2534(var1);
        try {
            field552.method2544();
        } catch (IOException var3) {
            field554 = true;
        }
    }

    @ObfuscatedName("jt.hh(I)V")
    public static final void method4825() {
        method2460(false);
        field524 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field3198.length; var1++) {
            if (Statics.field1536[var1] != -1 && Statics.field3198[var1] == null) {
                Statics.field3198[var1] = Statics.field4699.method5499(Statics.field1536[var1], 0);
                if (Statics.field3198[var1] == null) {
                    var0 = false;
                    field524++;
                }
            }
            if (Statics.field2066[var1] != -1 && Statics.field246[var1] == null) {
                Statics.field246[var1] = Statics.field4699.method5478(Statics.field2066[var1], 0, Statics.field2401[var1]);
                if (Statics.field246[var1] == null) {
                    var0 = false;
                    field524++;
                }
            }
        }
        if (!var0) {
            field775 = 1;
            return;
        }
        field559 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field3198.length; var3++) {
            byte[] var4 = Statics.field246[var3];
            if (var4 != null) {
                int var5 = (Statics.field3195[var3] >> 8) * 64 - Statics.field1560;
                int var6 = (Statics.field3195[var3] & 0xFF) * 64 - Statics.field2784;
                if (field563) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= Statics.method6338(var4, var5, var6);
            }
        }
        if (!var2) {
            field775 = 2;
            return;
        }
        if (field775 != 0) {
            method2959(class310.field3666 + class93.field1264 + class93.field1261 + 100 + "%" + class93.field1262, true);
        }
        method183();
        Statics.field3318.method3900();
        for (int var7 = 0; var7 < 4; var7++) {
            field562[var7].method3622();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class75.field999[var8][var9][var10] = 0;
                }
            }
        }
        method183();
        class75.method2964();
        int var11 = Statics.field3198.length;
        class63.method5333();
        method2460(true);
        if (!field563) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field3195[var12] >> 8) * 64 - Statics.field1560;
                int var14 = (Statics.field3195[var12] & 0xFF) * 64 - Statics.field2784;
                byte[] var15 = Statics.field3198[var12];
                if (var15 != null) {
                    method183();
                    class75.method4815(var15, var13, var14, Statics.field18 * 8 - 48, Statics.field1685 * 8 - 48, field562);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field3195[var16] >> 8) * 64 - Statics.field1560;
                int var18 = (Statics.field3195[var16] & 0xFF) * 64 - Statics.field2784;
                byte[] var19 = Statics.field3198[var16];
                if (var19 == null && Statics.field1685 < 800) {
                    method183();
                    class75.method1037(var17, var18, 64, 64);
                }
            }
            method2460(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field246[var20];
                if (var21 != null) {
                    int var22 = (Statics.field3195[var20] >> 8) * 64 - Statics.field1560;
                    int var23 = (Statics.field3195[var20] & 0xFF) * 64 - Statics.field2784;
                    method183();
                    class75.method5623(var21, var22, var23, Statics.field3318, field562);
                }
            }
        }
        if (field563) {
            for (int var24 = 0; var24 < 4; var24++) {
                method183();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field564[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field3195.length; var34++) {
                                if (Statics.field3195[var34] == var33 && Statics.field3198[var34] != null) {
                                    class75.method309(Statics.field3198[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, field562);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class75.method6153(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = field564[0][var35][var36];
                    if (var37 == -1) {
                        class75.method1037(var35 * 8, var36 * 8, 8, 8);
                    }
                }
            }
            method2460(true);
            for (int var38 = 0; var38 < 4; var38++) {
                method183();
                for (int var39 = 0; var39 < 13; var39++) {
                    for (int var40 = 0; var40 < 13; var40++) {
                        int var41 = field564[var38][var39][var40];
                        if (var41 != -1) {
                            int var42 = var41 >> 24 & 0x3;
                            int var43 = var41 >> 1 & 0x3;
                            int var44 = var41 >> 14 & 0x3FF;
                            int var45 = var41 >> 3 & 0x7FF;
                            int var46 = (var44 / 8 << 8) + var45 / 8;
                            for (int var47 = 0; var47 < Statics.field3195.length; var47++) {
                                if (Statics.field3195[var47] == var46 && Statics.field246[var47] != null) {
                                    class75.method2053(Statics.field246[var47], var38, var39 * 8, var40 * 8, var42, (var44 & 0x7) * 8, (var45 & 0x7) * 8, var43, Statics.field3318, field562);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2460(true);
        method183();
        class75.method4415(Statics.field3318, field562);
        method2460(true);
        int var48 = class75.field1000;
        if (var48 > Statics.field1013) {
            var48 = Statics.field1013;
        }
        if (var48 < Statics.field1013 - 1) {
            int var49 = Statics.field1013 - 1;
        }
        if (field497) {
            Statics.field3318.method3888(class75.field1000);
        } else {
            Statics.field3318.method3888(0);
        }
        for (int var50 = 0; var50 < 104; var50++) {
            for (int var51 = 0; var51 < 104; var51++) {
                method6192(var50, var51);
            }
        }
        method183();
        method1066();
        class188.field2075.method4782();
        if (Statics.field4326.method454()) {
            class266 var52 = Statics.method2786(class264.field2996, field552.field1342);
            var52.field3064.method7364(1057001181);
            field552.method2534(var52);
        }
        if (!field563) {
            int var53 = (Statics.field18 - 6) / 8;
            int var54 = (Statics.field18 + 6) / 8;
            int var55 = (Statics.field1685 - 6) / 8;
            int var56 = (Statics.field1685 + 6) / 8;
            for (int var57 = var53 - 1; var57 <= var54 + 1; var57++) {
                for (int var58 = var55 - 1; var58 <= var56 + 1; var58++) {
                    if (var57 < var53 || var57 > var54 || var58 < var55 || var58 > var56) {
                        Statics.field4699.method5437("m" + var57 + "_" + var58);
                        Statics.field4699.method5437("l" + var57 + "_" + var58);
                    }
                }
            }
        }
        method5138(30);
        method183();
        class75.method170();
        class266 var59 = Statics.method2786(class264.field2977, field552.field1342);
        field552.method2534(var59);
        class32.method276();
    }

    @ObfuscatedName("j.hl(IB)V")
    public static final void method103(int arg0) {
        int[] var1 = Statics.field61.field4826;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class75.field999[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field3318.method3921(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class75.field999[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field3318.method3921(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field61.method7675();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class75.field999[arg0][var10][var9] & 0x18) == 0) {
                    method2963(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class75.field999[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2963(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field738 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field3318.method3916(Statics.field1013, var11, var12);
                if (var13 != 0L) {
                    int var15 = class213.method3085(var13);
                    int var16 = Statics.method5147(var15).field2105;
                    if (var16 >= 0 && class172.method2879(var16).field1857) {
                        field741[field738] = class172.method2879(var16).method3188(false);
                        field739[field738] = var11;
                        field779[field738] = var12;
                        field738++;
                    }
                }
            }
        }
        Statics.field114.method7567();
    }

    @ObfuscatedName("et.hs(IIIIII)V")
    public static final void method2963(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field3318.method3913(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field3318.method3917(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L;
            if (var11) {
                boolean var12 = (int) (var5 >>> 16 & 0x1L) == 1;
                var11 = !var12;
            }
            if (var11) {
                var10 = arg4;
            }
            int[] var14 = Statics.field61.field4826;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class213.method3085(var5);
            class188 var17 = Statics.method5147(var16);
            if (var17.field2114 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var14[var15] = var10;
                        var14[var15 + 512] = var10;
                        var14[var15 + 1024] = var10;
                        var14[var15 + 1536] = var10;
                    } else if (var8 == 1) {
                        var14[var15] = var10;
                        var14[var15 + 1] = var10;
                        var14[var15 + 2] = var10;
                        var14[var15 + 3] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 3] = var10;
                        var14[var15 + 3 + 512] = var10;
                        var14[var15 + 3 + 1024] = var10;
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var14[var15 + 1536] = var10;
                        var14[var15 + 1536 + 1] = var10;
                        var14[var15 + 1536 + 2] = var10;
                        var14[var15 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var14[var15] = var10;
                    } else if (var8 == 1) {
                        var14[var15 + 3] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var14[var15 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var14[var15] = var10;
                        var14[var15 + 512] = var10;
                        var14[var15 + 1024] = var10;
                        var14[var15 + 1536] = var10;
                    } else if (var8 == 0) {
                        var14[var15] = var10;
                        var14[var15 + 1] = var10;
                        var14[var15 + 2] = var10;
                        var14[var15 + 3] = var10;
                    } else if (var8 == 1) {
                        var14[var15 + 3] = var10;
                        var14[var15 + 3 + 512] = var10;
                        var14[var15 + 3 + 1024] = var10;
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 1536] = var10;
                        var14[var15 + 1536 + 1] = var10;
                        var14[var15 + 1536 + 2] = var10;
                        var14[var15 + 1536 + 3] = var10;
                    }
                }
            } else {
                class457 var18 = Statics.field2744[var17.field2114];
                if (var18 != null) {
                    int var19 = (var17.field2073 * 4 - var18.field4818) / 2;
                    int var20 = (var17.field2086 * 4 - var18.field4819) / 2;
                    var18.method7573(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field2086) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field3318.method3915(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field3318.method3917(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class213.method3085(var21);
            class188 var27 = Statics.method5147(var26);
            if (var27.field2114 != -1) {
                class457 var28 = Statics.field2744[var27.field2114];
                if (var28 != null) {
                    int var29 = (var27.field2073 * 4 - var28.field4818) / 2;
                    int var30 = (var27.field2086 * 4 - var28.field4819) / 2;
                    var28.method7573(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field2086) * 4 + 48 + var30);
                }
            } else if (var25 == 9) {
                int var31 = 15658734;
                boolean var32 = var21 != 0L;
                if (var32) {
                    boolean var33 = (int) (var21 >>> 16 & 0x1L) == 1;
                    var32 = !var33;
                }
                if (var32) {
                    var31 = 15597568;
                }
                int[] var35 = Statics.field61.field4826;
                int var36 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var24 == 0 || var24 == 2) {
                    var35[var36 + 1536] = var31;
                    var35[var36 + 1024 + 1] = var31;
                    var35[var36 + 512 + 2] = var31;
                    var35[var36 + 3] = var31;
                } else {
                    var35[var36] = var31;
                    var35[var36 + 512 + 1] = var31;
                    var35[var36 + 1024 + 2] = var31;
                    var35[var36 + 1536 + 3] = var31;
                }
            }
        }
        long var37 = Statics.field3318.method3916(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class213.method3085(var37);
        class188 var40 = Statics.method5147(var39);
        if (var40.field2114 == -1) {
            return;
        }
        class457 var41 = Statics.field2744[var40.field2114];
        if (var41 != null) {
            int var42 = (var40.field2073 * 4 - var41.field4818) / 2;
            int var43 = (var40.field2086 * 4 - var41.field4819) / 2;
            var41.method7573(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field2086) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.hb(Lcs;II)Z")
    public boolean method1135(class101 arg0, int arg1) {
        if (arg0.field1345 == 0) {
            Statics.field1679 = null;
        } else {
            if (Statics.field1679 == null) {
                Statics.field1679 = new class369(Statics.field1304, Statics.field4326);
            }
            Statics.field1679.method6189(arg0.field1343, arg1);
        }
        method6081();
        arg0.field1344 = null;
        return true;
    }

    @ObfuscatedName("client.ho(Lcs;S)Z")
    public boolean method1136(class101 arg0) {
        if (Statics.field1679 != null) {
            Statics.field1679.method6177(arg0.field1343);
        }
        method6081();
        arg0.field1344 = null;
        return true;
    }

    @ObfuscatedName("client.ig(Lcs;B)Z")
    public final boolean method1362(class101 arg0) {
        class379 var2 = arg0.method2549();
        class444 var3 = arg0.field1343;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1344 == null) {
                if (arg0.field1341) {
                    if (!var2.method6340(1)) {
                        return false;
                    }
                    var2.method6343(arg0.field1343.field4733, 0, 1);
                    arg0.field1350 = 0;
                    arg0.field1341 = false;
                }
                var3.field4735 = 0;
                if (var3.method7142()) {
                    if (!var2.method6340(1)) {
                        return false;
                    }
                    var2.method6343(arg0.field1343.field4733, 1, 1);
                    arg0.field1350 = 0;
                }
                arg0.field1341 = true;
                class267[] var4 = class267.method4738();
                int var5 = var3.method7174();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4735);
                }
                arg0.field1344 = var4[var5];
                arg0.field1345 = arg0.field1344.field3179;
            }
            if (arg0.field1345 == -1) {
                if (!var2.method6340(1)) {
                    return false;
                }
                arg0.method2549().method6343(var3.field4733, 0, 1);
                arg0.field1345 = var3.field4733[0] & 0xFF;
            }
            if (arg0.field1345 == -2) {
                if (!var2.method6340(2)) {
                    return false;
                }
                arg0.method2549().method6343(var3.field4733, 0, 2);
                var3.field4735 = 0;
                arg0.field1345 = var3.method7198();
            }
            if (!var2.method6340(arg0.field1345)) {
                return false;
            }
            var3.field4735 = 0;
            var2.method6343(var3.field4733, 0, arg0.field1345);
            arg0.field1350 = 0;
            field555.method6084();
            arg0.field1346 = arg0.field1351;
            arg0.field1351 = arg0.field1349;
            arg0.field1349 = arg0.field1344;
            if (class267.field3171 == arg0.field1344) {
                int var6 = var3.method7201();
                int var7 = var3.method7198();
                if (var6 < -70000) {
                    var7 += 32768;
                }
                class296 var8;
                if (var6 >= 0) {
                    var8 = class296.method3318(var6);
                } else {
                    var8 = null;
                }
                if (var8 != null) {
                    for (int var9 = 0; var9 < var8.field3408.length; var9++) {
                        var8.field3408[var9] = 0;
                        var8.field3471[var9] = 0;
                    }
                }
                class78.method3172(var7);
                int var10 = var3.method7198();
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = var3.method7228();
                    if (var12 == 255) {
                        var12 = var3.method7246();
                    }
                    int var13 = var3.method7237();
                    if (var8 != null && var11 < var8.field3408.length) {
                        var8.field3408[var11] = var13;
                        var8.field3471[var11] = var12;
                    }
                    class78.method403(var7, var11, var13 - 1, var12);
                }
                if (var8 != null) {
                    method6648(var8);
                }
                method641();
                field694[++field695 - 1 & 0x1F] = var7 & 0x7FFF;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3078 == arg0.field1344) {
                method786(class265.field3053);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3175 == arg0.field1344) {
                method2677(false, arg0.field1343);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3116 == arg0.field1344) {
                return this.method1135(arg0, 2);
            }
            if (class267.field3121 == arg0.field1344) {
                method786(class265.field3047);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3137 == arg0.field1344) {
                Statics.field2827 = true;
                Statics.method6458(false, var3);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3120 == arg0.field1344) {
                int var14 = var3.method7237();
                int var15 = var3.method7408();
                class290.field3347[var14] = var15;
                if (class290.field3346[var14] != var15) {
                    class290.field3346[var14] = var15;
                }
                method4827(var14);
                field692[++field558 - 1 & 0x1F] = var14;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3167 == arg0.field1344) {
                byte var16 = var3.method7243();
                int var17 = var3.method7228();
                int var18 = var3.method7238();
                int var19 = var3.method7199();
                int var20 = var3.method7374();
                int var21 = var20 >> 16;
                int var22 = var20 >> 8 & 0xFF;
                int var23 = (var20 >> 4 & 0x7) + var21;
                int var24 = (var20 & 0x7) + var22;
                byte var25 = var3.method7197();
                int var26 = var3.method7237();
                int var27 = var3.method7296() * 4;
                int var28 = var3.method7196() * 4;
                int var29 = var3.method7228();
                int var30 = var3.method7238();
                int var31 = var16 + var23;
                int var32 = var24 + var25;
                if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var18 != 65535) {
                    int var33 = var23 * 128 + 64;
                    int var34 = var24 * 128 + 64;
                    int var35 = var31 * 128 + 64;
                    int var36 = var32 * 128 + 64;
                    class70 var37 = new class70(var18, Statics.field1013, var33, var34, method2784(var33, var34, Statics.field1013) - var27, field504 + var26, field504 + var30, var29, var17, var19, var28);
                    var37.method1998(var35, var36, method2784(var35, var36, Statics.field1013) - var28, field504 + var26);
                    field635.method5660(var37);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3131 == arg0.field1344) {
                String var38 = var3.method7206();
                String var39 = class352.method5951(class345.method2821(class284.method4099(var3)));
                class100.method1932(6, var38, var39);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3133 == arg0.field1344) {
                String var40 = var3.method7206();
                long var41 = var3.method7319();
                long var43 = (long) var3.method7198();
                long var45 = (long) var3.method7340();
                class312 var47 = (class312) class331.method5118(class312.method7090(), var3.method7196());
                long var48 = (var43 << 32) + var45;
                boolean var50 = false;
                for (int var51 = 0; var51 < 100; var51++) {
                    if (field786[var51] == var48) {
                        var50 = true;
                        break;
                    }
                }
                if (var47.field3998 && Statics.field3345.method1711(new class466(var40, Statics.field1304))) {
                    var50 = true;
                }
                if (!var50 && field618 == 0) {
                    field786[field730] = var48;
                    field730 = (field730 + 1) % 100;
                    String var52 = class352.method5951(class345.method2821(class284.method4099(var3)));
                    if (var47.field4002 == -1) {
                        class100.method2791(9, var40, var52, class347.method4666(var41));
                    } else {
                        class100.method2791(9, class93.method2016(var47.field4002) + var40, var52, class347.method4666(var41));
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3090 == arg0.field1344) {
                Statics.field3345.method1697(var3, arg0.field1345);
                field701 = field691;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3108 == arg0.field1344) {
                int var53 = var3.method7237();
                int var54 = var3.method7247();
                int var55 = var3.method7237();
                int var56 = var3.method7416();
                class296 var57 = class296.method3318(var54);
                if (var57.field3513 != var56 || var57.field3516 != var53 || var57.field3450 != var55) {
                    var57.field3513 = var56;
                    var57.field3516 = var53;
                    var57.field3450 = var55;
                    method6648(var57);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3140 == arg0.field1344) {
                method4661(var3.method7206());
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3150 == arg0.field1344) {
                byte[] var58 = new byte[arg0.field1345];
                var3.method7144(var58, 0, var58.length);
                class445 var59 = new class445(var58);
                String var60 = var59.method7206();
                class30.method3656(var60, true, false);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3164 == arg0.field1344) {
                field644 = var3.method7296();
                field698 = var3.method7296();
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3151 == arg0.field1344) {
                field511 = var3.method7196();
                if (field511 == 1) {
                    field512 = var3.method7198();
                }
                if (field511 >= 2 && field511 <= 6) {
                    if (field511 == 2) {
                        field517 = 64;
                        field518 = 64;
                    }
                    if (field511 == 3) {
                        field517 = 0;
                        field518 = 64;
                    }
                    if (field511 == 4) {
                        field517 = 128;
                        field518 = 64;
                    }
                    if (field511 == 5) {
                        field517 = 64;
                        field518 = 0;
                    }
                    if (field511 == 6) {
                        field517 = 64;
                        field518 = 128;
                    }
                    field511 = 2;
                    field542 = var3.method7198();
                    field515 = var3.method7198();
                    field671 = var3.method7196();
                }
                if (field511 == 10) {
                    field513 = var3.method7198();
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3091 == arg0.field1344) {
                method786(class265.field3055);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3176 == arg0.field1344) {
                int var61 = var3.method7416();
                field666 = var61;
                this.method1141(false);
                method622(var61);
                class64.method112(field666);
                for (int var62 = 0; var62 < 100; var62++) {
                    field715[var62] = true;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3088 == arg0.field1344) {
                Statics.field4457 = var3.method7227();
                Statics.field2164 = var3.method7228();
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3134 == arg0.field1344) {
                for (int var63 = 0; var63 < class290.field3346.length; var63++) {
                    if (class290.field3347[var63] != class290.field3346[var63]) {
                        class290.field3346[var63] = class290.field3347[var63];
                        method4827(var63);
                        field692[++field558 - 1 & 0x1F] = var63;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3132 == arg0.field1344) {
                byte var64 = var3.method7197();
                String var65 = var3.method7206();
                long var66 = (long) var3.method7198();
                long var68 = (long) var3.method7340();
                class312 var70 = (class312) class331.method5118(class312.method7090(), var3.method7196());
                long var71 = (var66 << 32) + var68;
                boolean var73 = false;
                Object var74 = null;
                class150 var75 = var64 >= 0 ? field769[var64] : Statics.field3287;
                if (var75 == null) {
                    var73 = true;
                } else {
                    int var76 = 0;
                    while (true) {
                        if (var76 >= 100) {
                            if (var70.field3998 && Statics.field3345.method1711(new class466(var65, Statics.field1304))) {
                                var73 = true;
                            }
                            break;
                        }
                        if (field786[var76] == var71) {
                            var73 = true;
                            break;
                        }
                        var76++;
                    }
                }
                if (!var73) {
                    field786[field730] = var71;
                    field730 = (field730 + 1) % 100;
                    String var77 = class352.method5951(class284.method4099(var3));
                    int var78 = var64 >= 0 ? 41 : 44;
                    if (var70.field4002 == -1) {
                        class100.method2791(var78, var65, var77, var75.field1706);
                    } else {
                        class100.method2791(var78, class93.method2016(var70.field4002) + var65, var77, var75.field1706);
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3162 == arg0.field1344) {
                Statics.field2164 = var3.method7227();
                Statics.field4457 = var3.method7196();
                while (var3.field4735 < arg0.field1345) {
                    int var79 = var3.method7196();
                    class265 var80 = class265.method3544()[var79];
                    method786(var80);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3111 == arg0.field1344) {
                int var81 = var3.method7408();
                class296 var82 = class296.method3318(var81);
                for (int var83 = 0; var83 < var82.field3408.length; var83++) {
                    var82.field3408[var83] = -1;
                    var82.field3408[var83] = 0;
                }
                method6648(var82);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3122 == arg0.field1344) {
                int var84 = var3.method7211();
                boolean var85 = var3.method7196() == 1;
                String var86 = "";
                boolean var87 = false;
                if (var85) {
                    var86 = var3.method7206();
                    if (Statics.field3345.method1711(new class466(var86, Statics.field1304))) {
                        var87 = true;
                    }
                }
                String var88 = var3.method7206();
                if (!var87) {
                    class100.method1932(var84, var86, var88);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3168 == arg0.field1344) {
                int var89 = var3.method7199();
                int var90 = var3.method7201();
                class296 var91 = class296.method3318(var90);
                if (var91.field3443 != var89 || var89 == -1) {
                    var91.field3443 = var89;
                    var91.field3497 = 0;
                    var91.field3535 = 0;
                    method6648(var91);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3105 == arg0.field1344) {
                method2677(true, arg0.field1343);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3089 == arg0.field1344) {
                int var92 = var3.method7416();
                if (var92 == 65535) {
                    var92 = -1;
                }
                method82(var92);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3113 == arg0.field1344) {
                int var93 = var3.method7238();
                if (var93 == 65535) {
                    var93 = -1;
                }
                int var94 = var3.method7374();
                method3132(var93, var94);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3126 == arg0.field1344) {
                Statics.field1663 = class462.method2051(var3.method7196());
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3166 == arg0.field1344) {
                Statics.method6458(false, var3);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3109 == arg0.field1344) {
                int var95 = var3.method7198();
                if (var95 == 65535) {
                    var95 = -1;
                }
                int var96 = var3.method7246();
                int var97 = var3.method7408();
                class296 var98 = class296.method3318(var96);
                if (var98.field3488) {
                    var98.field3454 = var95;
                    var98.field3424 = var97;
                    class189 var100 = class189.method2643(var95);
                    var98.field3513 = var100.field2150;
                    var98.field3516 = var100.field2140;
                    var98.field3449 = var100.field2141;
                    var98.field3389 = var100.field2142;
                    var98.field3446 = var100.field2143;
                    var98.field3450 = var100.field2138;
                    if (var100.field2133 == 1) {
                        var98.field3455 = 1;
                    } else {
                        var98.field3455 = 2;
                    }
                    if (var98.field3447 > 0) {
                        var98.field3450 = var98.field3450 * 32 / var98.field3447;
                    } else if (var98.field3436 > 0) {
                        var98.field3450 = var98.field3450 * 32 / var98.field3436;
                    }
                    method6648(var98);
                } else if (var95 == -1) {
                    var98.field3439 = 0;
                    arg0.field1344 = null;
                    return true;
                } else {
                    class189 var99 = class189.method2643(var95);
                    var98.field3439 = 4;
                    var98.field3440 = var95;
                    var98.field3513 = var99.field2150;
                    var98.field3516 = var99.field2140;
                    var98.field3450 = var99.field2138 * 100 / var97;
                    method6648(var98);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3083 == arg0.field1344) {
                class97.method2017(var3, arg0.field1345);
                Statics.method5109();
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3076 == arg0.field1344) {
                Statics.field3345.method1696();
                field701 = field691;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3159 == arg0.field1344) {
                int var101 = var3.method7201();
                int var102 = var3.method7198();
                if (var101 < -70000) {
                    var102 += 32768;
                }
                class296 var103;
                if (var101 >= 0) {
                    var103 = class296.method3318(var101);
                } else {
                    var103 = null;
                }
                while (var3.field4735 < arg0.field1345) {
                    int var104 = var3.method7211();
                    int var105 = var3.method7198();
                    int var106 = 0;
                    if (var105 != 0) {
                        var106 = var3.method7196();
                        if (var106 == 255) {
                            var106 = var3.method7201();
                        }
                    }
                    if (var103 != null && var104 >= 0 && var104 < var103.field3408.length) {
                        var103.field3408[var104] = var105;
                        var103.field3471[var104] = var106;
                    }
                    class78.method403(var102, var104, var105 - 1, var106);
                }
                if (var103 != null) {
                    method6648(var103);
                }
                method641();
                field694[++field695 - 1 & 0x1F] = var102 & 0x7FFF;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3129 == arg0.field1344) {
                field754 = false;
                for (int var107 = 0; var107 < 5; var107++) {
                    field756[var107] = false;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3092 == arg0.field1344) {
                if (Statics.field183 == null) {
                    Statics.field183 = new class394(Statics.field1716);
                }
                class453 var108 = Statics.field1716.method6597(var3);
                Statics.field183.field4465.method6955(var108.field4797, var108.field4798);
                field591[++field699 - 1 & 0x1F] = var108.field4797;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3141 == arg0.field1344) {
                int var109 = var3.method7196();
                int var110 = var3.method7196();
                int var111 = var3.method7196();
                int var112 = var3.method7196();
                field756[var109] = true;
                field576[var109] = var110;
                field758[var109] = var111;
                field759[var109] = var112;
                field760[var109] = 0;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3157 == arg0.field1344) {
                boolean var113 = var3.method7196() == 1;
                if (var113) {
                    Statics.field2650 = class271.method5624() - var3.method7319();
                    Statics.field1919 = new class319(var3, true);
                } else {
                    Statics.field1919 = null;
                }
                field706 = field691;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3119 == arg0.field1344) {
                field746 = field691;
                byte var114 = var3.method7197();
                class147 var115 = new class147(var3);
                class150 var116;
                if (var114 >= 0) {
                    var116 = field769[var114];
                } else {
                    var116 = Statics.field3287;
                }
                var115.method2952(var116);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3138 == arg0.field1344) {
                int var117 = var3.method7238();
                class85 var118;
                if (field621 == var117) {
                    var118 = Statics.field890;
                } else {
                    var118 = field620[var117];
                }
                int var119 = var3.method7247();
                int var120 = var3.method7198();
                if (var118 != null) {
                    var118.field1175 = var120;
                    var118.field1146 = var119 >> 16;
                    var118.field1148 = (var119 & 0xFFFF) + field504;
                    var118.field1139 = 0;
                    var118.field1177 = 0;
                    if (var118.field1148 > field504) {
                        var118.field1139 = -1;
                    }
                    if (var118.field1175 == 65535) {
                        var118.field1175 = -1;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3114 == arg0.field1344) {
                int var121 = var3.method7198();
                if (var121 == 65535) {
                    var121 = -1;
                }
                int var122 = var3.method7238();
                if (var122 == 65535) {
                    var122 = -1;
                }
                int var123 = var3.method7246();
                int var124 = var3.method7246();
                for (int var125 = var122; var125 <= var121; var125++) {
                    long var126 = ((long) var123 << 32) + (long) var125;
                    class412 var128 = field724.method6941(var126);
                    if (var128 != null) {
                        var128.method6657();
                    }
                    field724.method6948(new class411(var124), var126);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3155 == arg0.field1344) {
                method2642();
                byte var129 = var3.method7197();
                if (arg0.field1345 == 1) {
                    if (var129 >= 0) {
                        field548[var129] = null;
                    } else {
                        Statics.field1083 = null;
                    }
                    arg0.field1344 = null;
                    return true;
                }
                if (var129 >= 0) {
                    field548[var129] = new class141(var3);
                } else {
                    Statics.field1083 = new class141(var3);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3139 == arg0.field1344) {
                method786(class265.field3057);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3117 == arg0.field1344) {
                field754 = true;
                field545 = false;
                Statics.field1480 = var3.method7196();
                Statics.field3302 = var3.method7196();
                Statics.field1521 = var3.method7198();
                Statics.field328 = var3.method7196();
                Statics.field1271 = var3.method7196();
                if (Statics.field1271 >= 100) {
                    int var130 = Statics.field1480 * 128 + 64;
                    int var131 = Statics.field3302 * 128 + 64;
                    int var132 = method2784(var130, var131, Statics.field1013) - Statics.field1521;
                    int var133 = var130 - Statics.field1759;
                    int var134 = var132 - Statics.field963;
                    int var135 = var131 - Statics.field483;
                    int var136 = (int) Math.sqrt((double) (var133 * var133 + var135 * var135));
                    Statics.field1799 = (int) (Math.atan2((double) var134, (double) var136) * 325.9490051269531D) & 0x7FF;
                    Statics.field55 = (int) (Math.atan2((double) var133, (double) var135) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1799 < 128) {
                        Statics.field1799 = 128;
                    }
                    if (Statics.field1799 > 383) {
                        Statics.field1799 = 383;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3095 == arg0.field1344) {
                method786(class265.field3058);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3082 == arg0.field1344) {
                int var137 = var3.method7201();
                if (field755 != var137) {
                    field755 = var137;
                    Statics.method7072();
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3161 == arg0.field1344) {
                Statics.field2827 = true;
                Statics.method6458(true, var3);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3145 == arg0.field1344) {
                method786(class265.field3048);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3130 == arg0.field1344) {
                int var138 = var3.method7196();
                if (var3.method7196() == 0) {
                    field778[var138] = new class326();
                    var3.field4735 += 18;
                } else {
                    var3.field4735--;
                    field778[var138] = new class326(var3, false);
                }
                field705 = field691;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3085 == arg0.field1344) {
                method1104();
                arg0.field1344 = null;
                return false;
            }
            if (class267.field3125 == arg0.field1344) {
                Statics.field2164 = var3.method7196();
                Statics.field4457 = var3.method7228();
                for (int var139 = Statics.field4457; var139 < Statics.field4457 + 8; var139++) {
                    for (int var140 = Statics.field2164; var140 < Statics.field2164 + 8; var140++) {
                        if (field680[Statics.field1013][var139][var140] != null) {
                            field680[Statics.field1013][var139][var140] = null;
                            method6192(var139, var140);
                        }
                    }
                }
                for (class86 var141 = (class86) field634.method5647(); var141 != null; var141 = (class86) field634.method5649()) {
                    if (var141.field1117 >= Statics.field4457 && var141.field1117 < Statics.field4457 + 8 && var141.field1126 >= Statics.field2164 && var141.field1126 < Statics.field2164 + 8 && Statics.field1013 == var141.field1118) {
                        var141.field1116 = 0;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3178 == arg0.field1344) {
                int var142 = var3.method7201();
                int var143 = var3.method7416();
                int var144 = var143 >> 10 & 0x1F;
                int var145 = var143 >> 5 & 0x1F;
                int var146 = var143 & 0x1F;
                int var147 = (var146 << 3) + (var144 << 19) + (var145 << 11);
                class296 var148 = class296.method3318(var142);
                if (var148.field3420 != var147) {
                    var148.field3420 = var147;
                    method6648(var148);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3115 == arg0.field1344) {
                field746 = field691;
                byte var149 = var3.method7197();
                if (arg0.field1345 == 1) {
                    if (var149 >= 0) {
                        field769[var149] = null;
                    } else {
                        Statics.field3287 = null;
                    }
                    arg0.field1344 = null;
                    return true;
                }
                if (var149 >= 0) {
                    field769[var149] = new class150(var3);
                } else {
                    Statics.field3287 = new class150(var3);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3173 == arg0.field1344) {
                int var150 = var3.method7201();
                int var151 = var3.method7198();
                int var152 = var3.method7198();
                class296 var153 = class296.method3318(var150);
                var153.field3452 = (var152 << 16) + var151;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3103 == arg0.field1344) {
                int var154 = var3.method7240();
                int var155 = var3.method7201();
                int var156 = var3.method7240();
                class296 var157 = class296.method3318(var155);
                if (var157.field3404 != var156 || var157.field3405 != var154 || var157.field3536 != 0 || var157.field3534 != 0) {
                    var157.field3404 = var156;
                    var157.field3405 = var154;
                    var157.field3536 = 0;
                    var157.field3534 = 0;
                    method6648(var157);
                    this.method1142(var157);
                    if (var157.field3397 == 0) {
                        method3379(Statics.field3331[var155 >> 16], var157, false);
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3097 == arg0.field1344) {
                String var158 = var3.method7206();
                int var159 = var3.method7196();
                int var160 = var3.method7196();
                if (var159 >= 1 && var159 <= 8) {
                    if (var158.equalsIgnoreCase(class310.field3924)) {
                        var158 = null;
                    }
                    field629[var159 - 1] = var158;
                    field630[var159 - 1] = var160 == 0;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3101 == arg0.field1344) {
                var3.field4735 += 28;
                if (var3.method7224()) {
                    method4585(var3, var3.field4735 - 28);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3099 == arg0.field1344) {
                for (int var161 = 0; var161 < field620.length; var161++) {
                    if (field620[var161] != null) {
                        field620[var161].field1147 = -1;
                    }
                }
                for (int var162 = 0; var162 < field547.length; var162++) {
                    if (field547[var162] != null) {
                        field547[var162].field1147 = -1;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3147 == arg0.field1344) {
                int var163 = arg0.field1345 + var3.field4735;
                int var164 = var3.method7198();
                int var165 = var3.method7198();
                if (field666 != var164) {
                    field666 = var164;
                    this.method1141(false);
                    method622(field666);
                    class64.method112(field666);
                    for (int var166 = 0; var166 < 100; var166++) {
                        field715[var166] = true;
                    }
                }
                while (var165-- > 0) {
                    int var167 = var3.method7201();
                    int var168 = var3.method7198();
                    int var169 = var3.method7196();
                    class80 var170 = (class80) field667.method6941((long) var167);
                    if (var170 != null && var170.field1038 != var168) {
                        method2789(var170, true);
                        var170 = null;
                    }
                    if (var170 == null) {
                        var170 = method2860(var167, var168, var169);
                    }
                    var170.field1037 = true;
                }
                for (class80 var171 = (class80) field667.method6943(); var171 != null; var171 = (class80) field667.method6944()) {
                    if (var171.field1037) {
                        var171.field1037 = false;
                    } else {
                        method2789(var171, true);
                    }
                }
                field724 = new class422(512);
                while (var3.field4735 < var163) {
                    int var172 = var3.method7201();
                    int var173 = var3.method7198();
                    int var174 = var3.method7198();
                    int var175 = var3.method7201();
                    for (int var176 = var173; var176 <= var174; var176++) {
                        long var177 = ((long) var172 << 32) + (long) var176;
                        field724.method6948(new class411(var175), var177);
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3084 == arg0.field1344) {
                int var179 = var3.method7196();
                method2005(var179);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3110 == arg0.field1344) {
                int var180 = var3.method7408();
                int var181 = var3.method7237();
                class296 var182 = class296.method3318(var180);
                if (var182.field3439 != 2 || var182.field3440 != var181) {
                    var182.field3439 = 2;
                    var182.field3440 = var181;
                    method6648(var182);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3135 == arg0.field1344) {
                if (field666 != -1) {
                    method269(field666, 0);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3160 == arg0.field1344) {
                for (int var183 = 0; var183 < Statics.field1842; var183++) {
                    class171 var184 = class171.method2780(var183);
                    if (var184 != null) {
                        class290.field3347[var183] = 0;
                        class290.field3346[var183] = 0;
                    }
                }
                method641();
                field558 += 32;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3177 == arg0.field1344) {
                method786(class265.field3051);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3165 == arg0.field1344) {
                String var185 = var3.method7206();
                long var186 = (long) var3.method7198();
                long var188 = (long) var3.method7340();
                class312 var190 = (class312) class331.method5118(class312.method7090(), var3.method7196());
                long var191 = (var186 << 32) + var188;
                boolean var193 = false;
                for (int var194 = 0; var194 < 100; var194++) {
                    if (field786[var194] == var191) {
                        var193 = true;
                        break;
                    }
                }
                if (Statics.field3345.method1711(new class466(var185, Statics.field1304))) {
                    var193 = true;
                }
                if (!var193 && field618 == 0) {
                    field786[field730] = var191;
                    field730 = (field730 + 1) % 100;
                    String var195 = class352.method5951(class345.method2821(class284.method4099(var3)));
                    byte var196;
                    if (var190.field4003) {
                        var196 = 7;
                    } else {
                        var196 = 3;
                    }
                    if (var190.field4002 == -1) {
                        class100.method1932(var196, var185, var195);
                    } else {
                        class100.method1932(var196, class93.method2016(var190.field4002) + var185, var195);
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3080 == arg0.field1344) {
                class61 var197 = new class61();
                var197.field803 = var3.method7206();
                var197.field794 = var3.method7198();
                int var198 = var3.method7201();
                var197.field801 = var198;
                method5138(45);
                var2.method6345();
                Object var199 = null;
                class69.method4287(var197);
                arg0.field1344 = null;
                return false;
            }
            if (class267.field3100 == arg0.field1344) {
                int var200 = var3.method7196();
                method368(var200);
                arg0.field1344 = null;
                return false;
            }
            if (class267.field3146 == arg0.field1344) {
                method786(class265.field3054);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3170 == arg0.field1344) {
                int var201 = var3.method7238();
                int var202 = var3.method7296();
                int var203 = var3.method7238();
                if (var201 == 65535) {
                    var201 = -1;
                }
                class92 var204 = field547[var203];
                if (var204 != null) {
                    if (var204.field1147 == var201 && var201 != -1) {
                        int var205 = class191.method22(var201).field2220;
                        if (var205 == 1) {
                            var204.field1171 = 0;
                            var204.field1138 = 0;
                            var204.field1173 = var202;
                            var204.field1174 = 0;
                        } else if (var205 == 2) {
                            var204.field1174 = 0;
                        }
                    } else if (var201 == -1 || var204.field1147 == -1 || class191.method22(var201).field2213 >= class191.method22(var204.field1147).field2213) {
                        var204.field1147 = var201;
                        var204.field1171 = 0;
                        var204.field1138 = 0;
                        var204.field1173 = var202;
                        var204.field1174 = 0;
                        var204.field1203 = var204.field1198;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3073 == arg0.field1344) {
                method2642();
                byte var206 = var3.method7197();
                class133 var207 = new class133(var3);
                class141 var208;
                if (var206 >= 0) {
                    var208 = field548[var206];
                } else {
                    var208 = Statics.field1083;
                }
                var207.method2853(var208);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3153 == arg0.field1344) {
                byte var209 = var3.method7197();
                long var210 = (long) var3.method7198();
                long var212 = (long) var3.method7340();
                long var214 = (var210 << 32) + var212;
                boolean var216 = false;
                class150 var217 = var209 >= 0 ? field769[var209] : Statics.field3287;
                if (var217 == null) {
                    var216 = true;
                } else {
                    for (int var218 = 0; var218 < 100; var218++) {
                        if (field786[var218] == var214) {
                            var216 = true;
                            break;
                        }
                    }
                }
                if (!var216) {
                    field786[field730] = var214;
                    field730 = (field730 + 1) % 100;
                    String var219 = class284.method4099(var3);
                    int var220 = var209 >= 0 ? 43 : 46;
                    class100.method2791(var220, "", var219, var217.field1706);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3144 == arg0.field1344) {
                Statics.field3345.field811.method6157(var3, arg0.field1345);
                method6152();
                field701 = field691;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3156 == arg0.field1344) {
                Statics.field183 = null;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3094 == arg0.field1344) {
                return this.method1135(arg0, 1);
            }
            if (class267.field3163 == arg0.field1344) {
                field742 = var3.method7196();
                if (field742 == 255) {
                    field742 = 0;
                }
                field743 = var3.method7196();
                if (field743 == 255) {
                    field743 = 0;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3118 == arg0.field1344) {
                String var221 = var3.method7206();
                Object[] var222 = new Object[var221.length() + 1];
                for (int var223 = var221.length() - 1; var223 >= 0; var223--) {
                    if (var221.charAt(var223) == 's') {
                        var222[var223 + 1] = var3.method7206();
                    } else {
                        var222[var223 + 1] = Integer.valueOf(var3.method7201());
                    }
                }
                var222[0] = Integer.valueOf(var3.method7201());
                class81 var224 = new class81();
                var224.field1046 = var222;
                class64.method5903(var224);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3086 == arg0.field1344) {
                int var225 = var3.method7416();
                int var226 = var3.method7246();
                int var227 = var3.method7228();
                class80 var228 = (class80) field667.method6941((long) var226);
                if (var228 != null) {
                    method2789(var228, var228.field1038 != var225);
                }
                method2860(var226, var225, var227);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3104 == arg0.field1344) {
                method641();
                int var229 = var3.method7408();
                int var230 = var3.method7228();
                int var231 = var3.method7228();
                field500[var230] = var229;
                field637[var230] = var231;
                field638[var230] = 1;
                for (int var232 = 0; var232 < 98; var232++) {
                    if (var229 >= class300.field3588[var232]) {
                        field638[var230] = var232 + 2;
                    }
                }
                field696[++field697 - 1 & 0x1F] = var230;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3079 == arg0.field1344) {
                field754 = true;
                field545 = false;
                Statics.field2639 = var3.method7196();
                Statics.field1356 = var3.method7196();
                Statics.field3979 = var3.method7198();
                Statics.field833 = var3.method7196();
                Statics.field1399 = var3.method7196();
                if (Statics.field1399 >= 100) {
                    Statics.field1759 = Statics.field2639 * 128 + 64;
                    Statics.field483 = Statics.field1356 * 128 + 64;
                    Statics.field963 = method2784(Statics.field1759, Statics.field483, Statics.field1013) - Statics.field3979;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3124 == arg0.field1344) {
                return this.method1136(arg0);
            }
            if (class267.field3152 == arg0.field1344) {
                Statics.method6458(true, var3);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3169 == arg0.field1344) {
                method641();
                field673 = var3.method7196();
                field707 = field691;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3127 == arg0.field1344) {
                int var233 = var3.method7198();
                int var234 = var3.method7196();
                int var235 = var3.method7198();
                method1943(var233, var234, var235);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3096 == arg0.field1344) {
                int var236 = var3.method7201();
                class296 var237 = class296.method3318(var236);
                var237.field3439 = 3;
                var237.field3440 = Statics.field890.field1086.method5157();
                method6648(var237);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3174 == arg0.field1344) {
                method786(class265.field3050);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3128 == arg0.field1344 && field754) {
                field545 = true;
                Statics.field833 = var3.method7196();
                Statics.field1399 = var3.method7196();
                Statics.field328 = var3.method7196();
                Statics.field1271 = var3.method7196();
                for (int var238 = 0; var238 < 5; var238++) {
                    field756[var238] = false;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3075 == arg0.field1344) {
                field602 = var3.method7198() * 30;
                field707 = field691;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3136 == arg0.field1344) {
                int var239 = var3.method7237();
                int var240 = var3.method7238();
                class92 var241 = field547[var240];
                int var242 = var3.method7246();
                if (var241 != null) {
                    var241.field1175 = var239;
                    var241.field1146 = var242 >> 16;
                    var241.field1148 = (var242 & 0xFFFF) + field504;
                    var241.field1139 = 0;
                    var241.field1177 = 0;
                    if (var241.field1148 > field504) {
                        var241.field1139 = -1;
                    }
                    if (var241.field1175 == 65535) {
                        var241.field1175 = -1;
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3143 == arg0.field1344) {
                int var243 = var3.method7237();
                class78.method633(var243);
                field694[++field695 - 1 & 0x1F] = var243 & 0x7FFF;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3093 == arg0.field1344) {
                boolean var244 = var3.method7176();
                if (!var244) {
                    Statics.field1324 = null;
                } else if (Statics.field1324 == null) {
                    Statics.field1324 = new class328();
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3107 == arg0.field1344) {
                int var245 = var3.method7198();
                int var246 = var3.method7237();
                int var247 = var3.method7374();
                int var248 = var247 >> 16;
                int var249 = var247 >> 8 & 0xFF;
                int var250 = (var247 >> 4 & 0x7) + var248;
                int var251 = (var247 & 0x7) + var249;
                int var252 = var3.method7296();
                if (var250 >= 0 && var251 >= 0 && var250 < 104 && var251 < 104) {
                    int var253 = var250 * 128 + 64;
                    int var254 = var251 * 128 + 64;
                    class65 var255 = new class65(var246, Statics.field1013, var253, var254, method2784(var253, var254, Statics.field1013) - var252, var245, field504);
                    field633.method5660(var255);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3087 == arg0.field1344) {
                int var256 = var3.method7246();
                int var257 = var3.method7416();
                class296 var258 = class296.method3318(var256);
                if (var258.field3439 != 1 || var258.field3440 != var257) {
                    var258.field3439 = 1;
                    var258.field3440 = var257;
                    method6648(var258);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3102 == arg0.field1344) {
                method786(class265.field3056);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3112 == arg0.field1344) {
                method641();
                field674 = var3.method7199();
                field707 = field691;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3142 == arg0.field1344) {
                method786(class265.field3052);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3106 == arg0.field1344) {
                field723 = var3.method7196();
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3077 == arg0.field1344) {
                class34.method4819(var3, arg0.field1345);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3172 == arg0.field1344) {
                int var259 = var3.method7374();
                int var260 = var259 >> 16;
                int var261 = var259 >> 8 & 0xFF;
                int var262 = (var259 >> 4 & 0x7) + var260;
                int var263 = (var259 & 0x7) + var261;
                int var264 = var3.method7416();
                int var265 = var3.method7296();
                int var266 = var265 >> 2;
                int var267 = var265 & 0x3;
                int var268 = field565[var266];
                if (var262 >= 0 && var263 >= 0 && var262 < 103 && var263 < 103) {
                    if (var268 == 0) {
                        class217 var269 = Statics.field3318.method3909(Statics.field1013, var262, var263);
                        if (var269 != null) {
                            int var270 = class213.method3085(var269.field2654);
                            if (var266 == 2) {
                                var269.field2655 = new class73(var270, 2, var267 + 4, Statics.field1013, var262, var263, var264, false, var269.field2655);
                                var269.field2660 = new class73(var270, 2, var267 + 1 & 0x3, Statics.field1013, var262, var263, var264, false, var269.field2660);
                            } else {
                                var269.field2655 = new class73(var270, var266, var267, Statics.field1013, var262, var263, var264, false, var269.field2655);
                            }
                        }
                    } else if (var268 == 1) {
                        class219 var271 = Statics.field3318.method3910(Statics.field1013, var262, var263);
                        if (var271 != null) {
                            int var272 = class213.method3085(var271.field2674);
                            if (var266 == 4 || var266 == 5) {
                                var271.field2665 = new class73(var272, 4, var267, Statics.field1013, var262, var263, var264, false, var271.field2665);
                            } else if (var266 == 6) {
                                var271.field2665 = new class73(var272, 4, var267 + 4, Statics.field1013, var262, var263, var264, false, var271.field2665);
                            } else if (var266 == 7) {
                                var271.field2665 = new class73(var272, 4, (var267 + 2 & 0x3) + 4, Statics.field1013, var262, var263, var264, false, var271.field2665);
                            } else if (var266 == 8) {
                                var271.field2665 = new class73(var272, 4, var267 + 4, Statics.field1013, var262, var263, var264, false, var271.field2665);
                                var271.field2672 = new class73(var272, 4, (var267 + 2 & 0x3) + 4, Statics.field1013, var262, var263, var264, false, var271.field2672);
                            }
                        }
                    } else if (var268 == 2) {
                        class220 var273 = Statics.field3318.method3937(Statics.field1013, var262, var263);
                        if (var266 == 11) {
                            var266 = 10;
                        }
                        if (var273 != null) {
                            var273.field2677 = new class73(class213.method3085(var273.field2689), var266, var267, Statics.field1013, var262, var263, var264, false, var273.field2677);
                        }
                    } else if (var268 == 3) {
                        class198 var274 = Statics.field3318.method4019(Statics.field1013, var262, var263);
                        if (var274 != null) {
                            var274.field2315 = new class73(class213.method3085(var274.field2318), 22, var267, Statics.field1013, var262, var263, var264, false, var274.field2315);
                        }
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3123 == arg0.field1344) {
                int var275 = var3.method7237();
                byte var276 = var3.method7248();
                class290.field3347[var275] = var276;
                if (class290.field3346[var275] != var276) {
                    class290.field3346[var275] = var276;
                }
                method4827(var275);
                field692[++field558 - 1 & 0x1F] = var275;
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3098 == arg0.field1344) {
                int var277 = var3.method7201();
                class80 var278 = (class80) field667.method6941((long) var277);
                if (var278 != null) {
                    method2789(var278, true);
                }
                if (field628 != null) {
                    method6648(field628);
                    field628 = null;
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3154 == arg0.field1344) {
                Statics.field183 = new class394(Statics.field1716);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3072 == arg0.field1344) {
                int var279 = var3.method7246();
                int var280 = var3.method7408();
                class80 var281 = (class80) field667.method6941((long) var279);
                class80 var282 = (class80) field667.method6941((long) var280);
                if (var282 != null) {
                    method2789(var282, var281 == null || var281.field1038 != var282.field1038);
                }
                if (var281 != null) {
                    var281.method6657();
                    field667.method6948(var281, (long) var280);
                }
                class296 var283 = class296.method3318(var279);
                if (var283 != null) {
                    method6648(var283);
                }
                class296 var284 = class296.method3318(var280);
                if (var284 != null) {
                    method6648(var284);
                    method3379(Statics.field3331[var284.field3395 >>> 16], var284, true);
                }
                if (field666 != -1) {
                    method269(field666, 1);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3081 == arg0.field1344) {
                int var285 = var3.method7237();
                int var286 = var3.method7408();
                class296 var287 = class296.method3318(var286);
                if (var287 != null && var287.field3397 == 0) {
                    if (var285 > var287.field3419 - var287.field3411) {
                        var285 = var287.field3419 - var287.field3411;
                    }
                    if (var285 < 0) {
                        var285 = 0;
                    }
                    if (var287.field3417 != var285) {
                        var287.field3417 = var285;
                        method6648(var287);
                    }
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3158 == arg0.field1344) {
                int var288 = var3.method7201();
                boolean var289 = var3.method7196() == 1;
                class296 var290 = class296.method3318(var288);
                if (var290.field3382 != var289) {
                    var290.field3382 = var289;
                    method6648(var290);
                }
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3148 == arg0.field1344) {
                int var291 = var3.method7201();
                int var292 = var3.method7201();
                int var293 = class32.method2039();
                class266 var294 = Statics.method2786(class264.field3023, field552.field1342);
                var294.field3064.method7364(var291);
                var294.field3064.method7364(var292);
                var294.field3064.method7179(field194);
                var294.field3064.method7277(var293);
                field552.method2534(var294);
                arg0.field1344 = null;
                return true;
            }
            if (class267.field3074 == arg0.field1344) {
                int var295 = var3.method7201();
                String var296 = var3.method7206();
                class296 var297 = class296.method3318(var295);
                if (!var296.equals(var297.field3457)) {
                    var297.field3457 = var296;
                    method6648(var297);
                }
                arg0.field1344 = null;
                return true;
            }
            Statics.method3146("" + (arg0.field1344 == null ? -1 : arg0.field1344.field3149) + class93.field1259 + (arg0.field1351 == null ? -1 : arg0.field1351.field3149) + class93.field1259 + (arg0.field1346 == null ? -1 : arg0.field1346.field3149) + class93.field1259 + arg0.field1345, (Throwable) null);
            method1104();
        } catch (IOException var302) {
            method1944();
        } catch (Exception var303) {
            String var300 = "" + (arg0.field1344 == null ? -1 : arg0.field1344.field3149) + class93.field1259 + (arg0.field1351 == null ? -1 : arg0.field1351.field3149) + class93.field1259 + (arg0.field1346 == null ? -1 : arg0.field1346.field3149) + class93.field1259 + arg0.field1345 + class93.field1259 + (Statics.field1560 + Statics.field890.field1199[0]) + class93.field1259 + (Statics.field2784 + Statics.field890.field1201[0]) + class93.field1259;
            for (int var301 = 0; var301 < arg0.field1345 && var301 < 50; var301++) {
                var300 = var300 + var3.field4733[var301] + class93.field1259;
            }
            Statics.method3146(var300, var303);
            method1104();
        }
        return true;
    }

    @ObfuscatedName("aj.il(Ljw;S)V")
    public static final void method786(class265 arg0) {
        class444 var1 = field552.field1343;
        if (class265.field3047 == arg0) {
            int var2 = var1.method7198();
            int var3 = var1.method7227() * 4;
            byte var4 = var1.method7233();
            int var5 = var1.method7227();
            int var6 = var1.method7227();
            int var7 = (var6 >> 4 & 0x7) + Statics.field4457;
            int var8 = (var6 & 0x7) + Statics.field2164;
            int var9 = var1.method7296();
            byte var10 = var1.method7197();
            int var11 = var1.method7238();
            int var12 = var1.method7198();
            int var13 = var1.method7199();
            int var14 = var1.method7228() * 4;
            int var15 = var4 + var7;
            int var16 = var8 + var10;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104 && var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var2 != 65535) {
                int var17 = var7 * 128 + 64;
                int var18 = var8 * 128 + 64;
                int var19 = var15 * 128 + 64;
                int var20 = var16 * 128 + 64;
                class70 var21 = new class70(var2, Statics.field1013, var17, var18, method2784(var17, var18, Statics.field1013) - var14, field504 + var11, field504 + var12, var9, var5, var13, var3);
                var21.method1998(var19, var20, method2784(var19, var20, Statics.field1013) - var3, field504 + var11);
                field635.method5660(var21);
            }
            return;
        }
        if (class265.field3055 == arg0) {
            int var22 = var1.method7198();
            int var23 = var1.method7238();
            byte var24 = var1.method7233();
            int var25 = var1.method7296();
            int var26 = (var25 >> 4 & 0x7) + Statics.field4457;
            int var27 = (var25 & 0x7) + Statics.field2164;
            byte var28 = var1.method7233();
            byte var29 = var1.method7248();
            int var30 = var1.method7228();
            int var31 = var30 >> 2;
            int var32 = var30 & 0x3;
            int var33 = field565[var31];
            int var34 = var1.method7237();
            byte var35 = var1.method7243();
            int var36 = var1.method7237();
            class85 var37;
            if (field621 == var36) {
                var37 = Statics.field890;
            } else {
                var37 = field620[var36];
            }
            if (var37 != null) {
                class188 var38 = Statics.method5147(var22);
                int var39;
                int var40;
                if (var32 == 1 || var32 == 3) {
                    var39 = var38.field2086;
                    var40 = var38.field2073;
                } else {
                    var39 = var38.field2073;
                    var40 = var38.field2086;
                }
                int var41 = (var39 >> 1) + var26;
                int var42 = (var39 + 1 >> 1) + var26;
                int var43 = (var40 >> 1) + var27;
                int var44 = (var40 + 1 >> 1) + var27;
                int[][] var45 = class75.field998[Statics.field1013];
                int var46 = var45[var41][var43] + var45[var42][var43] + var45[var41][var44] + var45[var42][var44] >> 2;
                int var47 = (var26 << 7) + (var39 << 6);
                int var48 = (var27 << 7) + (var40 << 6);
                class212 var49 = var38.method3422(var31, var32, var45, var47, var46, var48);
                if (var49 != null) {
                    method3136(Statics.field1013, var26, var27, var33, -1, 0, 0, var34 + 1, var23 + 1);
                    var37.field1111 = field504 + var34;
                    var37.field1094 = field504 + var23;
                    var37.field1098 = var49;
                    var37.field1107 = var26 * 128 + var39 * 64;
                    var37.field1097 = var27 * 128 + var40 * 64;
                    var37.field1096 = var46;
                    if (var29 > var28) {
                        byte var50 = var29;
                        var29 = var28;
                        var28 = var50;
                    }
                    if (var24 > var35) {
                        byte var51 = var24;
                        var24 = var35;
                        var35 = var51;
                    }
                    var37.field1099 = var26 + var29;
                    var37.field1101 = var26 + var28;
                    var37.field1102 = var24 + var27;
                    var37.field1095 = var27 + var35;
                }
            }
        }
        if (class265.field3050 == arg0) {
            int var52 = var1.method7238();
            int var53 = var1.method7296();
            int var54 = (var53 >> 4 & 0x7) + Statics.field4457;
            int var55 = (var53 & 0x7) + Statics.field2164;
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                class336 var56 = field680[Statics.field1013][var54][var55];
                if (var56 != null) {
                    for (class96 var57 = (class96) var56.method5647(); var57 != null; var57 = (class96) var56.method5649()) {
                        if ((var52 & 0x7FFF) == var57.field1289) {
                            var57.method6657();
                            break;
                        }
                    }
                    if (var56.method5647() == null) {
                        field680[Statics.field1013][var54][var55] = null;
                    }
                    method6192(var54, var55);
                }
            }
        } else if (class265.field3053 == arg0) {
            int var58 = var1.method7416();
            int var59 = var1.method7196();
            int var60 = (var59 >> 4 & 0x7) + Statics.field4457;
            int var61 = (var59 & 0x7) + Statics.field2164;
            int var62 = var1.method7198();
            int var63 = var1.method7198();
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                class336 var64 = field680[Statics.field1013][var60][var61];
                if (var64 != null) {
                    for (class96 var65 = (class96) var64.method5647(); var65 != null; var65 = (class96) var64.method5649()) {
                        if ((var58 & 0x7FFF) == var65.field1289 && var65.field1285 == var63) {
                            var65.field1285 = var62;
                            break;
                        }
                    }
                    method6192(var60, var61);
                }
            }
        } else if (class265.field3056 == arg0) {
            int var66 = var1.method7196();
            int var67 = var66 >> 2;
            int var68 = var66 & 0x3;
            int var69 = field565[var67];
            int var70 = var1.method7238();
            int var71 = var1.method7228();
            int var72 = (var71 >> 4 & 0x7) + Statics.field4457;
            int var73 = (var71 & 0x7) + Statics.field2164;
            if (var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104) {
                method3136(Statics.field1013, var72, var73, var69, var70, var67, var68, 0, -1);
            }
        } else {
            if (class265.field3057 == arg0) {
                int var74 = var1.method7196();
                int var75 = var1.method7296();
                int var76 = (var75 >> 4 & 0x7) + Statics.field4457;
                int var77 = (var75 & 0x7) + Statics.field2164;
                int var78 = var1.method7228();
                int var79 = var78 >> 4 & 0xF;
                int var80 = var78 & 0x7;
                int var81 = var1.method7416();
                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                    int var82 = var79 + 1;
                    if (Statics.field890.field1199[0] >= var76 - var82 && Statics.field890.field1199[0] <= var76 + var82 && Statics.field890.field1201[0] >= var77 - var82 && Statics.field890.field1201[0] <= var77 + var82 && Statics.field1108.method2366() != 0 && var80 > 0 && field748 < 50) {
                        field749[field748] = var81;
                        field549[field748] = var80;
                        field611[field748] = var74;
                        field729[field748] = null;
                        field781[field748] = (var76 << 16) + (var77 << 8) + var79;
                        field748++;
                    }
                }
            }
            if (class265.field3052 == arg0) {
                int var83 = var1.method7227();
                int var84 = var83 >> 2;
                int var85 = var83 & 0x3;
                int var86 = field565[var84];
                int var87 = var1.method7228();
                int var88 = (var87 >> 4 & 0x7) + Statics.field4457;
                int var89 = (var87 & 0x7) + Statics.field2164;
                int var90 = var1.method7237();
                if (var88 >= 0 && var89 >= 0 && var88 < 103 && var89 < 103) {
                    if (var86 == 0) {
                        class217 var91 = Statics.field3318.method3909(Statics.field1013, var88, var89);
                        if (var91 != null) {
                            int var92 = class213.method3085(var91.field2654);
                            if (var84 == 2) {
                                var91.field2655 = new class73(var92, 2, var85 + 4, Statics.field1013, var88, var89, var90, false, var91.field2655);
                                var91.field2660 = new class73(var92, 2, var85 + 1 & 0x3, Statics.field1013, var88, var89, var90, false, var91.field2660);
                            } else {
                                var91.field2655 = new class73(var92, var84, var85, Statics.field1013, var88, var89, var90, false, var91.field2655);
                            }
                        }
                    }
                    if (var86 == 1) {
                        class219 var93 = Statics.field3318.method3910(Statics.field1013, var88, var89);
                        if (var93 != null) {
                            int var94 = class213.method3085(var93.field2674);
                            if (var84 == 4 || var84 == 5) {
                                var93.field2665 = new class73(var94, 4, var85, Statics.field1013, var88, var89, var90, false, var93.field2665);
                            } else if (var84 == 6) {
                                var93.field2665 = new class73(var94, 4, var85 + 4, Statics.field1013, var88, var89, var90, false, var93.field2665);
                            } else if (var84 == 7) {
                                var93.field2665 = new class73(var94, 4, (var85 + 2 & 0x3) + 4, Statics.field1013, var88, var89, var90, false, var93.field2665);
                            } else if (var84 == 8) {
                                var93.field2665 = new class73(var94, 4, var85 + 4, Statics.field1013, var88, var89, var90, false, var93.field2665);
                                var93.field2672 = new class73(var94, 4, (var85 + 2 & 0x3) + 4, Statics.field1013, var88, var89, var90, false, var93.field2672);
                            }
                        }
                    }
                    if (var86 == 2) {
                        class220 var95 = Statics.field3318.method3937(Statics.field1013, var88, var89);
                        if (var84 == 11) {
                            var84 = 10;
                        }
                        if (var95 != null) {
                            var95.field2677 = new class73(class213.method3085(var95.field2689), var84, var85, Statics.field1013, var88, var89, var90, false, var95.field2677);
                        }
                    }
                    if (var86 == 3) {
                        class198 var96 = Statics.field3318.method4019(Statics.field1013, var88, var89);
                        if (var96 != null) {
                            var96.field2315 = new class73(class213.method3085(var96.field2318), 22, var85, Statics.field1013, var88, var89, var90, false, var96.field2315);
                        }
                    }
                }
            } else if (class265.field3058 == arg0) {
                int var97 = var1.method7227();
                int var98 = (var97 >> 4 & 0x7) + Statics.field4457;
                int var99 = (var97 & 0x7) + Statics.field2164;
                int var100 = var1.method7416();
                int var101 = var1.method7238();
                int var102 = var1.method7228();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                    int var103 = var98 * 128 + 64;
                    int var104 = var99 * 128 + 64;
                    class65 var105 = new class65(var100, Statics.field1013, var103, var104, method2784(var103, var104, Statics.field1013) - var102, var101, field504);
                    field633.method5660(var105);
                }
            } else if (class265.field3051 == arg0) {
                int var106 = var1.method7237();
                int var107 = var1.method7227();
                int var108 = (var107 >> 4 & 0x7) + Statics.field4457;
                int var109 = (var107 & 0x7) + Statics.field2164;
                int var110 = var1.method7416();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class336 var111 = field680[Statics.field1013][var108][var109];
                    if (var111 != null) {
                        for (class96 var112 = (class96) var111.method5647(); var112 != null; var112 = (class96) var111.method5649()) {
                            if ((var106 & 0x7FFF) == var112.field1289 && var112.field1285 == var110) {
                                var112.method6657();
                                break;
                            }
                        }
                        if (var111.method5647() == null) {
                            field680[Statics.field1013][var108][var109] = null;
                        }
                        method6192(var108, var109);
                    }
                }
            } else if (class265.field3048 == arg0) {
                int var113 = var1.method7237();
                int var114 = var1.method7198();
                int var115 = var1.method7228();
                int var116 = (var115 >> 4 & 0x7) + Statics.field4457;
                int var117 = (var115 & 0x7) + Statics.field2164;
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    class96 var118 = new class96();
                    var118.field1289 = var113;
                    var118.field1285 = var114;
                    if (field680[Statics.field1013][var116][var117] == null) {
                        field680[Statics.field1013][var116][var117] = new class336();
                    }
                    field680[Statics.field1013][var116][var117].method5660(var118);
                    method6192(var116, var117);
                }
            } else if (class265.field3054 == arg0) {
                int var119 = var1.method7296();
                int var120 = var119 >> 2;
                int var121 = var119 & 0x3;
                int var122 = field565[var120];
                int var123 = var1.method7296();
                int var124 = (var123 >> 4 & 0x7) + Statics.field4457;
                int var125 = (var123 & 0x7) + Statics.field2164;
                if (var124 >= 0 && var125 >= 0 && var124 < 104 && var125 < 104) {
                    method3136(Statics.field1013, var124, var125, var122, -1, var120, var121, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("fj.ie(IIIIIIIIIB)V")
    public static final void method3136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class86 var9 = null;
        for (class86 var10 = (class86) field634.method5647(); var10 != null; var10 = (class86) field634.method5649()) {
            if (var10.field1118 == arg0 && var10.field1117 == arg1 && var10.field1126 == arg2 && var10.field1115 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class86();
            var9.field1118 = arg0;
            var9.field1115 = arg3;
            var9.field1117 = arg1;
            var9.field1126 = arg2;
            method296(var9);
            field634.method5660(var9);
        }
        var9.field1119 = arg4;
        var9.field1124 = arg5;
        var9.field1123 = arg6;
        var9.field1125 = arg7;
        var9.field1116 = arg8;
    }

    @ObfuscatedName("bi.ir(I)V")
    public static final void method1066() {
        for (class86 var0 = (class86) field634.method5647(); var0 != null; var0 = (class86) field634.method5649()) {
            if (var0.field1116 == -1) {
                var0.field1125 = 0;
                method296(var0);
            } else {
                var0.method6657();
            }
        }
    }

    @ObfuscatedName("g.ik(Lcw;B)V")
    public static final void method296(class86 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1115 == 0) {
            var1 = Statics.field3318.method3913(arg0.field1118, arg0.field1117, arg0.field1126);
        }
        if (arg0.field1115 == 1) {
            var1 = Statics.field3318.method3914(arg0.field1118, arg0.field1117, arg0.field1126);
        }
        if (arg0.field1115 == 2) {
            var1 = Statics.field3318.method3915(arg0.field1118, arg0.field1117, arg0.field1126);
        }
        if (arg0.field1115 == 3) {
            var1 = Statics.field3318.method3916(arg0.field1118, arg0.field1117, arg0.field1126);
        }
        if (var1 != 0L) {
            int var6 = Statics.field3318.method3917(arg0.field1118, arg0.field1117, arg0.field1126, var1);
            var3 = class213.method3085(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1121 = var3;
        arg0.field1122 = var4;
        arg0.field1120 = var5;
    }

    @ObfuscatedName("fr.ip(IIIIIIII)V")
    public static final void method3094(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field497 && Statics.field1013 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field3318.method3913(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field3318.method3914(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field3318.method3915(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field3318.method3916(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field3318.method3917(arg0, arg2, arg3, var7);
            int var13 = class213.method3085(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field3318.method4032(arg0, arg2, arg3);
                class188 var16 = Statics.method5147(var13);
                if (var16.field2087 != 0) {
                    field562[arg0].method3628(arg2, arg3, var14, var15, var16.field2088);
                }
            }
            if (arg1 == 1) {
                Statics.field3318.method3905(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field3318.method3906(arg0, arg2, arg3);
                class188 var17 = Statics.method5147(var13);
                if (var17.field2073 + arg2 > 103 || var17.field2073 + arg3 > 103 || var17.field2086 + arg2 > 103 || var17.field2086 + arg3 > 103) {
                    return;
                }
                if (var17.field2087 != 0) {
                    field562[arg0].method3629(arg2, arg3, var17.field2073, var17.field2086, var15, var17.field2088);
                }
            }
            if (arg1 == 3) {
                Statics.field3318.method3907(arg0, arg2, arg3);
                class188 var18 = Statics.method5147(var13);
                if (var18.field2087 == 1) {
                    field562[arg0].method3644(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class75.field999[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class75.method4798(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field3318, field562[arg0]);
    }

    @ObfuscatedName("ne.ii(III)V")
    public static final void method6192(int arg0, int arg1) {
        class336 var2 = field680[Statics.field1013][arg0][arg1];
        if (var2 == null) {
            Statics.field3318.method4068(Statics.field1013, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class96 var5 = null;
        for (class96 var6 = (class96) var2.method5647(); var6 != null; var6 = (class96) var2.method5649()) {
            class189 var7 = class189.method2643(var6.field1289);
            long var8 = (long) var7.field2145;
            if (var7.field2133 == 1) {
                var8 = (long) (var6.field1285 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field3318.method4068(Statics.field1013, arg0, arg1);
            return;
        }
        var2.method5640(var5);
        class96 var10 = null;
        class96 var11 = null;
        for (class96 var12 = (class96) var2.method5647(); var12 != null; var12 = (class96) var2.method5649()) {
            if (var5.field1289 != var12.field1289) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1289 != var12.field1289 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class213.method4796(arg0, arg1, 3, false, 0);
        Statics.field3318.method4029(Statics.field1013, arg0, arg1, method2784(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1013), var5, var13, var10, var11);
    }

    @ObfuscatedName("ju.ib(ZLqf;I)V")
    public static final void method4859(boolean arg0, class444 arg1) {
        while (true) {
            if (arg1.method7148(field552.field1345) >= 27) {
                int var2 = arg1.method7146(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field547[var2] == null) {
                        field547[var2] = new class92();
                        var3 = true;
                    }
                    class92 var4 = field547[var2];
                    field514[++field690 - 1] = var2;
                    var4.field1187 = field504;
                    int var5;
                    int var8;
                    int var9;
                    if (Statics.field2827) {
                        var5 = arg1.method7146(1);
                        var4.field1254 = class179.method3662(arg1.method7146(14));
                        int var6 = arg1.method7146(1);
                        if (var6 == 1) {
                            field551[++field550 - 1] = var2;
                        }
                        int var7 = field648[arg1.method7146(3)];
                        if (var3) {
                            var4.field1157 = var4.field1130 = var7;
                        }
                        if (arg0) {
                            var8 = arg1.method7146(8);
                            if (var8 > 127) {
                                var8 -= 256;
                            }
                        } else {
                            var8 = arg1.method7146(5);
                            if (var8 > 15) {
                                var8 -= 32;
                            }
                        }
                        if (arg0) {
                            var9 = arg1.method7146(8);
                            if (var9 > 127) {
                                var9 -= 256;
                            }
                        } else {
                            var9 = arg1.method7146(5);
                            if (var9 > 15) {
                                var9 -= 32;
                            }
                        }
                        boolean var10 = arg1.method7146(1) == 1;
                        if (var10) {
                            arg1.method7146(32);
                        }
                    } else {
                        int var11 = arg1.method7146(1);
                        if (var11 == 1) {
                            field551[++field550 - 1] = var2;
                        }
                        int var12 = field648[arg1.method7146(3)];
                        if (var3) {
                            var4.field1157 = var4.field1130 = var12;
                        }
                        boolean var13 = arg1.method7146(1) == 1;
                        if (var13) {
                            arg1.method7146(32);
                        }
                        if (arg0) {
                            var9 = arg1.method7146(8);
                            if (var9 > 127) {
                                var9 -= 256;
                            }
                        } else {
                            var9 = arg1.method7146(5);
                            if (var9 > 15) {
                                var9 -= 32;
                            }
                        }
                        var5 = arg1.method7146(1);
                        if (arg0) {
                            var8 = arg1.method7146(8);
                            if (var8 > 127) {
                                var8 -= 256;
                            }
                        } else {
                            var8 = arg1.method7146(5);
                            if (var8 > 15) {
                                var8 -= 32;
                            }
                        }
                        var4.field1254 = class179.method3662(arg1.method7146(14));
                    }
                    var4.field1132 = var4.field1254.field1973;
                    var4.field1197 = var4.field1254.field1963;
                    if (var4.field1197 == 0) {
                        var4.field1130 = 0;
                    }
                    var4.field1176 = var4.field1254.field1941;
                    var4.field1205 = var4.field1254.field1944;
                    var4.field1168 = var4.field1254.field1970;
                    var4.field1140 = var4.field1254.field1929;
                    var4.field1134 = var4.field1254.field1938;
                    var4.field1135 = var4.field1254.field1939;
                    var4.field1136 = var4.field1254.field1940;
                    var4.field1128 = var4.field1254.field1945;
                    var4.field1190 = var4.field1254.field1946;
                    var4.field1194 = var4.field1254.field1957;
                    var4.field1144 = var4.field1254.field1948;
                    var4.field1145 = var4.field1254.field1972;
                    var4.field1180 = var4.field1254.field1950;
                    var4.field1183 = var4.field1254.field1951;
                    var4.field1172 = var4.field1254.field1942;
                    var4.method2399(Statics.field890.field1199[0] + var8, Statics.field890.field1201[0] + var9, var5 == 1);
                    continue;
                }
            }
            arg1.method7147();
            return;
        }
    }

    @ObfuscatedName("ik.ia(Lqf;B)V")
    public static final void method4657(class444 arg0) {
        for (int var1 = 0; var1 < field550; var1++) {
            int var2 = field551[var1];
            class92 var3 = field547[var2];
            int var4 = arg0.method7196();
            if (Statics.field2827 && (var4 & 0x1) != 0) {
                int var5 = arg0.method7196();
                var4 += var5 << 8;
            }
            if ((var4 & 0x40) != 0) {
                var3.field1149 = arg0.method7206();
                var3.field1152 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field1204 = arg0.method7247();
            }
            if ((var4 & 0x4) != 0) {
                var3.field1175 = arg0.method7416();
                int var6 = arg0.method7247();
                var3.field1146 = var6 >> 16;
                var3.field1148 = (var6 & 0xFFFF) + field504;
                var3.field1139 = 0;
                var3.field1177 = 0;
                if (var3.field1148 > field504) {
                    var3.field1139 = -1;
                }
                if (var3.field1175 == 65535) {
                    var3.field1175 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var7 = arg0.method7228();
                if (var7 > 0) {
                    for (int var8 = 0; var8 < var7; var8++) {
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = arg0.method7211();
                        if (var12 == 32767) {
                            var12 = arg0.method7211();
                            var10 = arg0.method7211();
                            var9 = arg0.method7211();
                            var11 = arg0.method7211();
                        } else if (var12 == 32766) {
                            var12 = -1;
                        } else {
                            var10 = arg0.method7211();
                        }
                        int var13 = arg0.method7211();
                        var3.method2230(var12, var10, var9, var11, field504, var13);
                    }
                }
                int var14 = arg0.method7296();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = arg0.method7211();
                        int var17 = arg0.method7211();
                        if (var17 == 32767) {
                            var3.method2229(var16);
                        } else {
                            int var18 = arg0.method7211();
                            int var19 = arg0.method7296();
                            int var20 = var17 > 0 ? arg0.method7196() : var19;
                            var3.method2228(var16, field504, var17, var18, var19, var20);
                        }
                    }
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1254 = class179.method3662(arg0.method7237());
                var3.field1132 = var3.field1254.field1973;
                var3.field1197 = var3.field1254.field1963;
                var3.field1176 = var3.field1254.field1941;
                var3.field1205 = var3.field1254.field1944;
                var3.field1168 = var3.field1254.field1970;
                var3.field1140 = var3.field1254.field1929;
                var3.field1134 = var3.field1254.field1938;
                var3.field1135 = var3.field1254.field1939;
                var3.field1136 = var3.field1254.field1940;
            }
            if ((var4 & 0x100) != 0) {
                var3.field1189 = field504 + arg0.method7416();
                var3.field1159 = field504 + arg0.method7416();
                var3.field1191 = arg0.method7197();
                var3.field1192 = arg0.method7248();
                var3.field1170 = arg0.method7243();
                var3.field1195 = (byte) arg0.method7196();
            }
            if (Statics.field2827 && (var4 & 0x800) != 0 || !Statics.field2827 && (var4 & 0x1) != 0) {
                var3.field1193 = arg0.method7197();
                var3.field1182 = arg0.method7248();
                var3.field1181 = arg0.method7233();
                var3.field1141 = arg0.method7233();
                var3.field1184 = arg0.method7198() + field504;
                var3.field1137 = arg0.method7198() + field504;
                var3.field1186 = arg0.method7416();
                var3.field1198 = 1;
                var3.field1203 = 0;
                var3.field1193 += var3.field1199[0];
                var3.field1182 += var3.field1201[0];
                var3.field1181 += var3.field1199[0];
                var3.field1141 += var3.field1201[0];
            }
            if ((var4 & 0x20) != 0) {
                int var21 = arg0.method7198();
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var22 = arg0.method7227();
                if (var3.field1147 == var21 && var21 != -1) {
                    int var23 = class191.method22(var21).field2220;
                    if (var23 == 1) {
                        var3.field1171 = 0;
                        var3.field1138 = 0;
                        var3.field1173 = var22;
                        var3.field1174 = 0;
                    }
                    if (var23 == 2) {
                        var3.field1174 = 0;
                    }
                } else if (var21 == -1 || var3.field1147 == -1 || class191.method22(var21).field2213 >= class191.method22(var3.field1147).field2213) {
                    var3.field1147 = var21;
                    var3.field1171 = 0;
                    var3.field1138 = 0;
                    var3.field1173 = var22;
                    var3.field1174 = 0;
                    var3.field1203 = var3.field1198;
                }
            }
            if ((var4 & 0x400) != 0) {
                var3.method2403(arg0.method7206());
            }
            if ((var4 & 0x8) != 0) {
                int var24 = arg0.method7237();
                int var25 = arg0.method7416();
                if (Statics.field2827) {
                    var3.field1142 = arg0.method7296() == 1;
                }
                int var26 = var3.field1185 - (var24 - Statics.field1560 - Statics.field1560) * 64;
                int var27 = var3.field1129 - (var25 - Statics.field2784 - Statics.field2784) * 64;
                if (var26 != 0 || var27 != 0) {
                    var3.field1164 = (int) (Math.atan2((double) var26, (double) var27) * 325.949D) & 0x7FF;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1179 = arg0.method7237();
                if (var3.field1179 == 65535) {
                    var3.field1179 = -1;
                }
            }
        }
    }

    @ObfuscatedName("client.is(IIB)Lgb;")
    public static class193 method1635(int arg0, int arg1) {
        field787.field2243 = arg0;
        field787.field2239 = arg1;
        field787.field2240 = 1;
        field787.field2241 = 1;
        return field787;
    }

    @ObfuscatedName("ib.iy(B)V")
    public static void method4686() {
        field642 = 0;
        field641 = false;
    }

    @ObfuscatedName("gw.iw(I)V")
    public static void method3566() {
        method4686();
        field731[0] = class310.field3913;
        field502[0] = "";
        field645[0] = 1006;
        field768[0] = false;
        field642 = 1;
    }

    @ObfuscatedName("bj.in(III)V")
    public static final void method1098(int arg0, int arg1) {
        if (field642 < 2 && field659 == 0 && !field661 || !field726) {
            return;
        }
        int var2 = method3087();
        String var3;
        if (field659 == 1 && field642 < 2) {
            var3 = class310.field3947 + class310.field3860 + field660 + " " + class93.field1263;
        } else if (field661 && field642 < 2) {
            var3 = field664 + class310.field3860 + field665 + " " + class93.field1263;
        } else {
            var3 = method2040(var2);
        }
        if (field642 > 2) {
            var3 = var3 + class93.method814(16777215) + " " + '/' + " " + (field642 - 2) + class310.field3815;
        }
        Statics.field181.method5959(var3, arg0 + 4, arg1 + 15, 16777215, 0, field504 / 1000);
    }

    @ObfuscatedName("cg.ic(I)V")
    public static final void method2244() {
        int var0 = Statics.field4388;
        int var1 = Statics.field1428;
        int var2 = Statics.field3317;
        int var3 = Statics.field4084;
        int var4 = 6116423;
        class454.method7518(var0, var1, var2, var3, var4);
        class454.method7518(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class454.method7499(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field181.method5953(class310.field3821, var0 + 3, var1 + 14, var4, -1);
        int var5 = class33.field232;
        int var6 = class33.field231;
        for (int var7 = 0; var7 < field642; var7++) {
            int var8 = (field642 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field181.method5953(method2040(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field4388;
        int var11 = Statics.field1428;
        int var12 = Statics.field3317;
        int var13 = Statics.field4084;
        for (int var14 = 0; var14 < field713; var14++) {
            if (field718[var14] + field492[var14] > var10 && field718[var14] < var10 + var12 && field721[var14] + field719[var14] > var11 && field719[var14] < var11 + var13) {
                field557[var14] = true;
            }
        }
    }

    @ObfuscatedName("kw.iv(I)Z")
    public static final boolean method5303() {
        return field641;
    }

    @ObfuscatedName("x.ih(IIIII)V")
    public static final void method83(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field713; var4++) {
            if (field718[var4] + field492[var4] > arg0 && field718[var4] < arg0 + arg2 && field721[var4] + field719[var4] > arg1 && field719[var4] < arg1 + arg3) {
                field715[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.iu(I)V")
    public final void method1138() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field642 - 1; var2++) {
                if (field645[var2] < 1000 && field645[var2 + 1] > 1000) {
                    String var3 = field502[var2];
                    field502[var2] = field502[var2 + 1];
                    field502[var2 + 1] = var3;
                    String var4 = field731[var2];
                    field731[var2] = field731[var2 + 1];
                    field731[var2 + 1] = var4;
                    int var5 = field645[var2];
                    field645[var2] = field645[var2 + 1];
                    field645[var2 + 1] = var5;
                    int var6 = field643[var2];
                    field643[var2] = field643[var2 + 1];
                    field643[var2 + 1] = var6;
                    int var7 = field735[var2];
                    field735[var2] = field735[var2 + 1];
                    field735[var2 + 1] = var7;
                    int var8 = field646[var2];
                    field646[var2] = field646[var2 + 1];
                    field646[var2 + 1] = var8;
                    int var9 = field616[var2];
                    field616[var2] = field616[var2 + 1];
                    field616[var2 + 1] = var9;
                    boolean var10 = field768[var2];
                    field768[var2] = field768[var2 + 1];
                    field768[var2 + 1] = var10;
                    var1 = false;
                }
            }
        }
        if (Statics.field4353 != null || field601 != null) {
            return;
        }
        int var29;
        int var31;
        int var32;
        label213: {
            int var11 = class33.field237;
            if (field641) {
                if (var11 != 1 && (Statics.field2478 || var11 != 4)) {
                    int var12 = class33.field232;
                    int var13 = class33.field231;
                    if (var12 < Statics.field4388 - 10 || var12 > Statics.field4388 + Statics.field3317 + 10 || var13 < Statics.field1428 - 10 || var13 > Statics.field4084 + Statics.field1428 + 10) {
                        field641 = false;
                        method83(Statics.field4388, Statics.field1428, Statics.field3317, Statics.field4084);
                    }
                }
                if (var11 == 1 || !Statics.field2478 && var11 == 4) {
                    int var14 = Statics.field4388;
                    int var15 = Statics.field1428;
                    int var16 = Statics.field3317;
                    int var17 = class33.field238;
                    int var18 = class33.field239;
                    int var19 = -1;
                    for (int var20 = 0; var20 < field642; var20++) {
                        int var21 = (field642 - 1 - var20) * 15 + var15 + 31;
                        if (var17 > var14 && var17 < var14 + var16 && var18 > var21 - 13 && var18 < var21 + 3) {
                            var19 = var20;
                        }
                    }
                    if (var19 != -1 && var19 >= 0) {
                        int var22 = field643[var19];
                        int var23 = field735[var19];
                        int var24 = field645[var19];
                        int var25 = field646[var19];
                        int var26 = field616[var19];
                        String var27 = field731[var19];
                        String var28 = field502[var19];
                        method267(var22, var23, var24, var25, var26, var27, var28, class33.field238, class33.field239);
                    }
                    field641 = false;
                    method83(Statics.field4388, Statics.field1428, Statics.field3317, Statics.field4084);
                }
            } else {
                var29 = method3087();
                if ((var11 == 1 || !Statics.field2478 && var11 == 4) && var29 >= 0) {
                    int var30 = field645[var29];
                    if (var30 == 39 || var30 == 40 || var30 == 41 || var30 == 42 || var30 == 43 || var30 == 33 || var30 == 34 || var30 == 35 || var30 == 36 || var30 == 37 || var30 == 38 || var30 == 1005) {
                        var31 = field643[var29];
                        var32 = field735[var29];
                        class296 var33 = class296.method3318(var32);
                        if (class297.method5617(method2462(var33))) {
                            break label213;
                        }
                        int var34 = method2462(var33);
                        boolean var35 = (var34 >> 29 & 0x1) != 0;
                        if (var35) {
                            break label213;
                        }
                    }
                }
                if ((var11 == 1 || !Statics.field2478 && var11 == 4) && this.method1263()) {
                    var11 = 2;
                }
                if ((var11 == 1 || !Statics.field2478 && var11 == 4) && field642 > 0 && var29 >= 0) {
                    int var36 = field643[var29];
                    int var37 = field735[var29];
                    int var38 = field645[var29];
                    int var39 = field646[var29];
                    int var40 = field616[var29];
                    String var41 = field731[var29];
                    String var42 = field502[var29];
                    method267(var36, var37, var38, var39, var40, var41, var42, class33.field238, class33.field239);
                }
                if (var11 == 2 && field642 > 0) {
                    this.method1582(class33.field238, class33.field239);
                }
            }
            return;
        }
        if (Statics.field4353 != null && !field764 && field642 > 0 && !this.method1263()) {
            method3299(field613, field704);
        }
        field764 = false;
        field617 = 0;
        if (Statics.field4353 != null) {
            method6648(Statics.field4353);
        }
        Statics.field4353 = class296.method3318(var32);
        field597 = var31;
        field613 = class33.field238;
        field704 = class33.field239;
        if (var29 >= 0) {
            Statics.field1689 = new class67();
            Statics.field1689.field878 = field643[var29];
            Statics.field1689.field876 = field735[var29];
            Statics.field1689.field879 = field645[var29];
            Statics.field1689.field877 = field646[var29];
            Statics.field1689.field881 = field616[var29];
            Statics.field1689.field880 = field731[var29];
            Statics.field1689.field884 = field502[var29];
        }
        method6648(Statics.field4353);
    }

    @ObfuscatedName("client.ix(I)Z")
    public final boolean method1263() {
        int var1 = method3087();
        return (field521 && field642 > 2 || method16(var1)) && !field768[var1];
    }

    @ObfuscatedName("client.it(III)V")
    public final void method1582(int arg0, int arg1) {
        int var3 = Statics.field181.method5952(class310.field3821);
        for (int var4 = 0; var4 < field642; var4++) {
            int var5 = Statics.field181.method5952(method2040(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field642 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field1514) {
            var7 = Statics.field1514 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field1825) {
            var8 = Statics.field1825 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field4388 = var7;
        Statics.field1428 = var8;
        Statics.field3317 = var3;
        Statics.field4084 = field642 * 15 + 22;
        int var9 = arg0 - field535;
        int var10 = arg1 - field657;
        Statics.field3318.method4077(Statics.field1013, var9, var10, false);
        field641 = true;
    }

    @ObfuscatedName("p.io(II)Z")
    public static final boolean method16(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field645[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bo.if(Lbh;IIS)V")
    public static final void method1693(class67 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method267(arg0.field878, arg0.field876, arg0.field879, arg0.field877, arg0.field881, arg0.field880, arg0.field884, arg1, arg2);
        }
    }

    @ObfuscatedName("a.im(IIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method267(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 25) {
            class296 var9 = class296.method3126(arg1, arg0);
            if (var9 != null) {
                method3660();
                method2845(arg1, arg0, class297.method813(method2462(var9)), arg4);
                field659 = 0;
                field664 = method1945(var9);
                if (field664 == null) {
                    field664 = class310.field3924;
                }
                if (var9.field3488) {
                    field665 = var9.field3491 + class93.method814(16777215);
                } else {
                    field665 = class93.method814(65280) + var9.field3528 + class93.method814(16777215);
                }
            }
            return;
        }
        if (arg2 == 17) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var10 = Statics.method2786(class264.field3007, field552.field1342);
            var10.field3064.method7348(field650);
            var10.field3064.method7286(arg3);
            var10.field3064.method7348(Statics.field2784 + arg1);
            var10.field3064.method7225(class24.field123[82] ? 1 : 0);
            var10.field3064.method7364(Statics.field1651);
            var10.field3064.method7348(Statics.field1560 + arg0);
            var10.field3064.method7348(field766);
            field552.method2534(var10);
        }
        if (arg2 == 5) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var11 = Statics.method2786(class264.field3042, field552.field1342);
            var11.field3064.method7409(class24.field123[82] ? 1 : 0);
            var11.field3064.method7235(Statics.field1560 + arg0);
            var11.field3064.method7235(Statics.field2784 + arg1);
            var11.field3064.method7286(arg3);
            field552.method2534(var11);
        }
        if (arg2 == 12) {
            class92 var12 = field547[arg3];
            if (var12 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var13 = Statics.method2786(class264.field3045, field552.field1342);
                var13.field3064.method7179(class24.field123[82] ? 1 : 0);
                var13.field3064.method7348(arg3);
                field552.method2534(var13);
            }
        }
        if (arg2 == 58) {
            class296 var14 = class296.method3126(arg1, arg0);
            if (var14 != null) {
                if (var14.field3507 != null) {
                    class81 var15 = new class81();
                    var15.field1044 = var14;
                    var15.field1047 = arg3;
                    var15.field1052 = arg6;
                    var15.field1046 = var14.field3507;
                    class64.method5903(var15);
                }
                class266 var16 = Statics.method2786(class264.field2988, field552.field1342);
                var16.field3064.method7286(arg0);
                var16.field3064.method7189(Statics.field1651);
                var16.field3064.method7234(field766);
                var16.field3064.method7244(arg1);
                var16.field3064.method7286(field650);
                var16.field3064.method7234(arg4);
                field552.method2534(var16);
            }
        }
        if (arg2 == 51) {
            class85 var17 = field620[arg3];
            if (var17 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var18 = Statics.method2786(class264.field2989, field552.field1342);
                var18.field3064.method7225(class24.field123[82] ? 1 : 0);
                var18.field3064.method7348(arg3);
                field552.method2534(var18);
            }
        }
        if (arg2 == 15) {
            class85 var19 = field620[arg3];
            if (var19 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var20 = Statics.method2786(class264.field2986, field552.field1342);
                var20.field3064.method7235(arg3);
                var20.field3064.method7286(field766);
                var20.field3064.method7225(class24.field123[82] ? 1 : 0);
                var20.field3064.method7244(Statics.field1651);
                var20.field3064.method7348(field650);
                field552.method2534(var20);
            }
        }
        if (arg2 == 1) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var21 = Statics.method2786(class264.field2952, field552.field1342);
            var21.field3064.method7286(Statics.field161);
            var21.field3064.method7348(Statics.field2784 + arg1);
            var21.field3064.method7364(Statics.field2692);
            var21.field3064.method7348(arg3);
            var21.field3064.method7179(class24.field123[82] ? 1 : 0);
            var21.field3064.method7286(Statics.field1560 + arg0);
            var21.field3064.method7286(Statics.field481);
            field552.method2534(var21);
        }
        if (arg2 == 50) {
            class85 var22 = field620[arg3];
            if (var22 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var23 = Statics.method2786(class264.field2998, field552.field1342);
                var23.field3064.method7179(class24.field123[82] ? 1 : 0);
                var23.field3064.method7348(arg3);
                field552.method2534(var23);
            }
        }
        if (arg2 == 24) {
            class296 var24 = class296.method3318(arg1);
            if (var24 != null) {
                boolean var25 = true;
                if (var24.field3399 > 0) {
                    var25 = method790(var24);
                }
                if (var25) {
                    class266 var26 = Statics.method2786(class264.field2940, field552.field1342);
                    var26.field3064.method7364(arg1);
                    field552.method2534(var26);
                }
            }
        }
        if (arg2 == 34) {
            class266 var27 = Statics.method2786(class264.field2971, field552.field1342);
            var27.field3064.method7244(arg1);
            var27.field3064.method7234(arg0);
            var27.field3064.method7235(arg4);
            field552.method2534(var27);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 16) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var28 = Statics.method2786(class264.field3008, field552.field1342);
            var28.field3064.method7348(Statics.field161);
            var28.field3064.method7277(class24.field123[82] ? 1 : 0);
            var28.field3064.method7234(Statics.field481);
            var28.field3064.method7286(Statics.field2784 + arg1);
            var28.field3064.method7234(Statics.field1560 + arg0);
            var28.field3064.method7348(arg3);
            var28.field3064.method7364(Statics.field2692);
            field552.method2534(var28);
        }
        if (arg2 == 29) {
            class266 var29 = Statics.method2786(class264.field2940, field552.field1342);
            var29.field3064.method7364(arg1);
            field552.method2534(var29);
            class296 var30 = class296.method3318(arg1);
            if (var30 != null && var30.field3482 != null && var30.field3482[0][0] == 5) {
                int var31 = var30.field3482[0][1];
                if (class290.field3346[var31] != var30.field3526[0]) {
                    class290.field3346[var31] = var30.field3526[0];
                    method4827(var31);
                }
            }
        }
        if (arg2 == 44) {
            class85 var32 = field620[arg3];
            if (var32 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var33 = Statics.method2786(class264.field3012, field552.field1342);
                var33.field3064.method7286(arg3);
                var33.field3064.method7225(class24.field123[82] ? 1 : 0);
                field552.method2534(var33);
            }
        }
        if (arg2 == 18) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var34 = Statics.method2786(class264.field3030, field552.field1342);
            var34.field3064.method7225(class24.field123[82] ? 1 : 0);
            var34.field3064.method7234(Statics.field2784 + arg1);
            var34.field3064.method7286(Statics.field1560 + arg0);
            var34.field3064.method7286(arg3);
            field552.method2534(var34);
        }
        if (arg2 == 46) {
            class85 var35 = field620[arg3];
            if (var35 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var36 = Statics.method2786(class264.field2964, field552.field1342);
                var36.field3064.method7409(class24.field123[82] ? 1 : 0);
                var36.field3064.method7235(arg3);
                field552.method2534(var36);
            }
        }
        if (arg2 == 14) {
            class85 var37 = field620[arg3];
            if (var37 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var38 = Statics.method2786(class264.field3019, field552.field1342);
                var38.field3064.method7225(class24.field123[82] ? 1 : 0);
                var38.field3064.method7286(Statics.field481);
                var38.field3064.method7235(arg3);
                var38.field3064.method7189(Statics.field2692);
                var38.field3064.method7348(Statics.field161);
                field552.method2534(var38);
            }
        }
        if (arg2 == 42) {
            class266 var39 = Statics.method2786(class264.field3000, field552.field1342);
            var39.field3064.method7364(arg1);
            var39.field3064.method7286(arg0);
            var39.field3064.method7348(arg4);
            field552.method2534(var39);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 32) {
            class266 var40 = Statics.method2786(class264.field3039, field552.field1342);
            var40.field3064.method7364(Statics.field1651);
            var40.field3064.method7348(arg0);
            var40.field3064.method7286(field766);
            var40.field3064.method7244(arg1);
            var40.field3064.method7348(arg4);
            field552.method2534(var40);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 13) {
            class92 var41 = field547[arg3];
            if (var41 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var42 = Statics.method2786(class264.field2942, field552.field1342);
                var42.field3064.method7286(arg3);
                var42.field3064.method7179(class24.field123[82] ? 1 : 0);
                field552.method2534(var42);
            }
        }
        if (arg2 == 19) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var43 = Statics.method2786(class264.field2946, field552.field1342);
            var43.field3064.method7286(arg3);
            var43.field3064.method7409(class24.field123[82] ? 1 : 0);
            var43.field3064.method7234(Statics.field1560 + arg0);
            var43.field3064.method7286(Statics.field2784 + arg1);
            field552.method2534(var43);
        }
        if (arg2 == 11) {
            class92 var44 = field547[arg3];
            if (var44 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var45 = Statics.method2786(class264.field3035, field552.field1342);
                var45.field3064.method7348(arg3);
                var45.field3064.method7179(class24.field123[82] ? 1 : 0);
                field552.method2534(var45);
            }
        }
        if (arg2 == 10) {
            class92 var46 = field547[arg3];
            if (var46 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var47 = Statics.method2786(class264.field2962, field552.field1342);
                var47.field3064.method7234(arg3);
                var47.field3064.method7179(class24.field123[82] ? 1 : 0);
                field552.method2534(var47);
            }
        }
        if (arg2 == 48) {
            class85 var48 = field620[arg3];
            if (var48 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var49 = Statics.method2786(class264.field2985, field552.field1342);
                var49.field3064.method7348(arg3);
                var49.field3064.method7179(class24.field123[82] ? 1 : 0);
                field552.method2534(var49);
            }
        }
        if (arg2 == 49) {
            class85 var50 = field620[arg3];
            if (var50 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var51 = Statics.method2786(class264.field2974, field552.field1342);
                var51.field3064.method7277(class24.field123[82] ? 1 : 0);
                var51.field3064.method7235(arg3);
                field552.method2534(var51);
            }
        }
        if (arg2 == 2) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var52 = Statics.method2786(class264.field2969, field552.field1342);
            var52.field3064.method7348(field650);
            var52.field3064.method7179(class24.field123[82] ? 1 : 0);
            var52.field3064.method7348(Statics.field2784 + arg1);
            var52.field3064.method7348(Statics.field1560 + arg0);
            var52.field3064.method7234(field766);
            var52.field3064.method7245(Statics.field1651);
            var52.field3064.method7348(arg3);
            field552.method2534(var52);
        }
        if (arg2 == 23) {
            if (field641) {
                Statics.field3318.method4008();
            } else {
                Statics.field3318.method4077(Statics.field1013, arg0, arg1, true);
            }
        }
        if (arg2 == 22) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var53 = Statics.method2786(class264.field3046, field552.field1342);
            var53.field3064.method7348(Statics.field2784 + arg1);
            var53.field3064.method7235(arg3);
            var53.field3064.method7409(class24.field123[82] ? 1 : 0);
            var53.field3064.method7348(Statics.field1560 + arg0);
            field552.method2534(var53);
        }
        if (arg2 == 1004) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            class266 var54 = Statics.method2786(class264.field2938, field552.field1342);
            var54.field3064.method7286(arg3);
            var54.field3064.method7286(Statics.field1560 + arg0);
            var54.field3064.method7348(Statics.field2784 + arg1);
            field552.method2534(var54);
        }
        if (arg2 == 8) {
            class92 var55 = field547[arg3];
            if (var55 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var56 = Statics.method2786(class264.field2950, field552.field1342);
                var56.field3064.method7234(field766);
                var56.field3064.method7179(class24.field123[82] ? 1 : 0);
                var56.field3064.method7245(Statics.field1651);
                var56.field3064.method7234(arg3);
                var56.field3064.method7235(field650);
                field552.method2534(var56);
            }
        }
        if (arg2 == 3) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var57 = Statics.method2786(class264.field3043, field552.field1342);
            var57.field3064.method7234(Statics.field2784 + arg1);
            var57.field3064.method7234(Statics.field1560 + arg0);
            var57.field3064.method7286(arg3);
            var57.field3064.method7225(class24.field123[82] ? 1 : 0);
            field552.method2534(var57);
        }
        if (arg2 == 1002) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            class266 var58 = Statics.method2786(class264.field2997, field552.field1342);
            var58.field3064.method7286(arg3);
            field552.method2534(var58);
        }
        if (arg2 == 9) {
            class92 var59 = field547[arg3];
            if (var59 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var60 = Statics.method2786(class264.field2970, field552.field1342);
                var60.field3064.method7235(arg3);
                var60.field3064.method7225(class24.field123[82] ? 1 : 0);
                field552.method2534(var60);
            }
        }
        if (arg2 == 7) {
            class92 var61 = field547[arg3];
            if (var61 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var62 = Statics.method2786(class264.field2959, field552.field1342);
                var62.field3064.method7364(Statics.field2692);
                var62.field3064.method7286(Statics.field481);
                var62.field3064.method7286(arg3);
                var62.field3064.method7286(Statics.field161);
                var62.field3064.method7225(class24.field123[82] ? 1 : 0);
                field552.method2534(var62);
            }
        }
        if (arg2 == 30 && field628 == null) {
            method6966(arg1, arg0);
            field628 = class296.method3126(arg1, arg0);
            method6648(field628);
        }
        if (arg2 == 45) {
            class85 var63 = field620[arg3];
            if (var63 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var64 = Statics.method2786(class264.field2982, field552.field1342);
                var64.field3064.method7225(class24.field123[82] ? 1 : 0);
                var64.field3064.method7348(arg3);
                field552.method2534(var64);
            }
        }
        if (arg2 == 36) {
            class266 var65 = Statics.method2786(class264.field2993, field552.field1342);
            var65.field3064.method7286(arg0);
            var65.field3064.method7235(arg4);
            var65.field3064.method7189(arg1);
            field552.method2534(var65);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 1003) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            class92 var66 = field547[arg3];
            if (var66 != null) {
                class179 var67 = var66.field1254;
                if (var67.field1967 != null) {
                    var67 = var67.method3298();
                }
                if (var67 != null) {
                    class266 var68 = Statics.method2786(class264.field3036, field552.field1342);
                    var68.field3064.method7235(var67.field1933);
                    field552.method2534(var68);
                }
            }
        }
        if (arg2 == 1001) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var69 = Statics.method2786(class264.field2972, field552.field1342);
            var69.field3064.method7235(arg3);
            var69.field3064.method7348(Statics.field2784 + arg1);
            var69.field3064.method7234(Statics.field1560 + arg0);
            var69.field3064.method7225(class24.field123[82] ? 1 : 0);
            field552.method2534(var69);
        }
        if (arg2 == 37) {
            class266 var70 = Statics.method2786(class264.field3044, field552.field1342);
            var70.field3064.method7234(arg0);
            var70.field3064.method7245(arg1);
            var70.field3064.method7234(arg4);
            field552.method2534(var70);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class296 var71 = class296.method3126(arg1, arg0);
            if (var71 != null) {
                method1101(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 26) {
            method312();
        }
        if (arg2 == 43) {
            class266 var72 = Statics.method2786(class264.field3033, field552.field1342);
            var72.field3064.method7235(arg0);
            var72.field3064.method7234(arg4);
            var72.field3064.method7244(arg1);
            field552.method2534(var72);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 33) {
            class266 var73 = Statics.method2786(class264.field3002, field552.field1342);
            var73.field3064.method7348(arg4);
            var73.field3064.method7245(arg1);
            var73.field3064.method7286(arg0);
            field552.method2534(var73);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 21) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var74 = Statics.method2786(class264.field2955, field552.field1342);
            var74.field3064.method7234(arg3);
            var74.field3064.method7234(Statics.field2784 + arg1);
            var74.field3064.method7348(Statics.field1560 + arg0);
            var74.field3064.method7277(class24.field123[82] ? 1 : 0);
            field552.method2534(var74);
        }
        if (arg2 == 6) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var75 = Statics.method2786(class264.field2947, field552.field1342);
            var75.field3064.method7348(Statics.field1560 + arg0);
            var75.field3064.method7179(class24.field123[82] ? 1 : 0);
            var75.field3064.method7235(arg3);
            var75.field3064.method7348(Statics.field2784 + arg1);
            field552.method2534(var75);
        }
        if (arg2 == 47) {
            class85 var76 = field620[arg3];
            if (var76 != null) {
                field605 = arg7;
                field606 = arg8;
                field608 = 2;
                field607 = 0;
                field742 = arg0;
                field743 = arg1;
                class266 var77 = Statics.method2786(class264.field2976, field552.field1342);
                var77.field3064.method7234(arg3);
                var77.field3064.method7277(class24.field123[82] ? 1 : 0);
                field552.method2534(var77);
            }
        }
        if (arg2 == 20) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var78 = Statics.method2786(class264.field3027, field552.field1342);
            var78.field3064.method7225(class24.field123[82] ? 1 : 0);
            var78.field3064.method7234(Statics.field1560 + arg0);
            var78.field3064.method7235(Statics.field2784 + arg1);
            var78.field3064.method7348(arg3);
            field552.method2534(var78);
        }
        if (arg2 == 41) {
            class266 var79 = Statics.method2786(class264.field3041, field552.field1342);
            var79.field3064.method7364(arg1);
            var79.field3064.method7348(arg0);
            var79.field3064.method7348(arg4);
            field552.method2534(var79);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 31) {
            class266 var80 = Statics.method2786(class264.field2981, field552.field1342);
            var80.field3064.method7364(arg1);
            var80.field3064.method7286(Statics.field481);
            var80.field3064.method7234(Statics.field161);
            var80.field3064.method7244(Statics.field2692);
            var80.field3064.method7348(arg0);
            var80.field3064.method7286(arg4);
            field552.method2534(var80);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 1005) {
            class296 var81 = class296.method3318(arg1);
            if (var81 == null || var81.field3471[arg0] < 100000) {
                class266 var82 = Statics.method2786(class264.field2980, field552.field1342);
                var82.field3064.method7235(arg4);
                field552.method2534(var82);
            } else {
                class100.method1932(27, "", var81.field3471[arg0] + " x " + class189.method2643(arg4).field2139);
            }
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field422.method6755(arg2, arg3, new class291(arg0), new class291(arg1));
        }
        if (arg2 == 38) {
            method3660();
            class296 var83 = class296.method3318(arg1);
            field659 = 1;
            Statics.field481 = arg0;
            Statics.field2692 = arg1;
            Statics.field161 = arg4;
            method6648(var83);
            field660 = class93.method814(16748608) + class189.method2643(arg4).field2139 + class93.method814(16777215);
            if (field660 == null) {
                field660 = class310.field3924;
            }
            return;
        }
        if (arg2 == 35) {
            class266 var84 = Statics.method2786(class264.field2994, field552.field1342);
            var84.field3064.method7234(arg4);
            var84.field3064.method7245(arg1);
            var84.field3064.method7235(arg0);
            field552.method2534(var84);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 39) {
            class266 var85 = Statics.method2786(class264.field3029, field552.field1342);
            var85.field3064.method7234(arg4);
            var85.field3064.method7235(arg0);
            var85.field3064.method7364(arg1);
            field552.method2534(var85);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 28) {
            class266 var86 = Statics.method2786(class264.field2940, field552.field1342);
            var86.field3064.method7364(arg1);
            field552.method2534(var86);
            class296 var87 = class296.method3318(arg1);
            if (var87 != null && var87.field3482 != null && var87.field3482[0][0] == 5) {
                int var88 = var87.field3482[0][1];
                class290.field3346[var88] = 1 - class290.field3346[var88];
                method4827(var88);
            }
        }
        if (arg2 == 40) {
            class266 var89 = Statics.method2786(class264.field3020, field552.field1342);
            var89.field3064.method7364(arg1);
            var89.field3064.method7235(arg0);
            var89.field3064.method7235(arg4);
            field552.method2534(var89);
            field610 = 0;
            Statics.field154 = class296.method3318(arg1);
            field636 = arg0;
        }
        if (arg2 == 4) {
            field605 = arg7;
            field606 = arg8;
            field608 = 2;
            field607 = 0;
            field742 = arg0;
            field743 = arg1;
            class266 var90 = Statics.method2786(class264.field2966, field552.field1342);
            var90.field3064.method7234(arg3);
            var90.field3064.method7286(Statics.field2784 + arg1);
            var90.field3064.method7277(class24.field123[82] ? 1 : 0);
            var90.field3064.method7286(Statics.field1560 + arg0);
            field552.method2534(var90);
        }
        if (field659 != 0) {
            field659 = 0;
            method6648(class296.method3318(Statics.field2692));
        }
        if (field661) {
            method3660();
        }
        if (Statics.field154 != null && field610 == 0) {
            method6648(Statics.field154);
        }
    }

    @ObfuscatedName("cs.iz(ILjava/lang/String;B)V")
    public static void method2553(int arg0, String arg1) {
        int var2 = class97.field1305;
        int[] var3 = class97.field1290;
        boolean var4 = false;
        class466 var5 = new class466(arg1, Statics.field1304);
        for (int var6 = 0; var6 < var2; var6++) {
            class85 var7 = field620[var3[var6]];
            if (var7 != null && Statics.field890 != var7 && var7.field1109 != null && var7.field1109.equals(var5)) {
                if (arg0 == 1) {
                    class266 var8 = Statics.method2786(class264.field3012, field552.field1342);
                    var8.field3064.method7286(var3[var6]);
                    var8.field3064.method7225(0);
                    field552.method2534(var8);
                } else if (arg0 == 4) {
                    class266 var9 = Statics.method2786(class264.field2976, field552.field1342);
                    var9.field3064.method7234(var3[var6]);
                    var9.field3064.method7277(0);
                    field552.method2534(var9);
                } else if (arg0 == 6) {
                    class266 var10 = Statics.method2786(class264.field2974, field552.field1342);
                    var10.field3064.method7277(0);
                    var10.field3064.method7235(var3[var6]);
                    field552.method2534(var10);
                } else if (arg0 == 7) {
                    class266 var11 = Statics.method2786(class264.field2998, field552.field1342);
                    var11.field3064.method7179(0);
                    var11.field3064.method7348(var3[var6]);
                    field552.method2534(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class100.method1932(4, "", class310.field3817 + arg1);
        }
    }

    @ObfuscatedName("de.id(IIIII)V")
    public static void method2845(int arg0, int arg1, int arg2, int arg3) {
        class296 var4 = class296.method3126(arg0, arg1);
        if (var4 != null && var4.field3400 != null) {
            class81 var5 = new class81();
            var5.field1044 = var4;
            var5.field1046 = var4.field3400;
            class64.method5903(var5);
        }
        field650 = arg3;
        field661 = true;
        Statics.field1651 = arg0;
        field766 = arg1;
        Statics.field1366 = arg2;
        method6648(var4);
    }

    @ObfuscatedName("ga.jp(B)V")
    public static void method3660() {
        if (!field661) {
            return;
        }
        class296 var0 = class296.method3126(Statics.field1651, field766);
        if (var0 != null && var0.field3498 != null) {
            class81 var1 = new class81();
            var1.field1044 = var0;
            var1.field1046 = var0.field3498;
            class64.method5903(var1);
        }
        field650 = -1;
        field661 = false;
        method6648(var0);
    }

    @ObfuscatedName("pj.jr(III)V")
    public static void method6966(int arg0, int arg1) {
        class266 var2 = Statics.method2786(class264.field3021, field552.field1342);
        var2.field3064.method7348(arg1);
        var2.field3064.method7245(arg0);
        field552.method2534(var2);
    }

    @ObfuscatedName("by.jq(IIIILjava/lang/String;I)V")
    public static void method1101(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class296 var5 = class296.method3126(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3494 != null) {
            class81 var6 = new class81();
            var6.field1044 = var5;
            var6.field1047 = arg0;
            var6.field1052 = arg4;
            var6.field1046 = var5.field3494;
            class64.method5903(var6);
        }
        boolean var7 = true;
        if (var5.field3399 > 0) {
            var7 = method790(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2462(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class266 var11 = Statics.method2786(class264.field2965, field552.field1342);
            var11.field3064.method7364(arg1);
            var11.field3064.method7286(arg2);
            var11.field3064.method7286(arg3);
            field552.method2534(var11);
        }
        if (arg0 == 2) {
            class266 var12 = Statics.method2786(class264.field2984, field552.field1342);
            var12.field3064.method7364(arg1);
            var12.field3064.method7286(arg2);
            var12.field3064.method7286(arg3);
            field552.method2534(var12);
        }
        if (arg0 == 3) {
            class266 var13 = Statics.method2786(class264.field3013, field552.field1342);
            var13.field3064.method7364(arg1);
            var13.field3064.method7286(arg2);
            var13.field3064.method7286(arg3);
            field552.method2534(var13);
        }
        if (arg0 == 4) {
            class266 var14 = Statics.method2786(class264.field2937, field552.field1342);
            var14.field3064.method7364(arg1);
            var14.field3064.method7286(arg2);
            var14.field3064.method7286(arg3);
            field552.method2534(var14);
        }
        if (arg0 == 5) {
            class266 var15 = Statics.method2786(class264.field3028, field552.field1342);
            var15.field3064.method7364(arg1);
            var15.field3064.method7286(arg2);
            var15.field3064.method7286(arg3);
            field552.method2534(var15);
        }
        if (arg0 == 6) {
            class266 var16 = Statics.method2786(class264.field3015, field552.field1342);
            var16.field3064.method7364(arg1);
            var16.field3064.method7286(arg2);
            var16.field3064.method7286(arg3);
            field552.method2534(var16);
        }
        if (arg0 == 7) {
            class266 var17 = Statics.method2786(class264.field3018, field552.field1342);
            var17.field3064.method7364(arg1);
            var17.field3064.method7286(arg2);
            var17.field3064.method7286(arg3);
            field552.method2534(var17);
        }
        if (arg0 == 8) {
            class266 var18 = Statics.method2786(class264.field2960, field552.field1342);
            var18.field3064.method7364(arg1);
            var18.field3064.method7286(arg2);
            var18.field3064.method7286(arg3);
            field552.method2534(var18);
        }
        if (arg0 == 9) {
            class266 var19 = Statics.method2786(class264.field2975, field552.field1342);
            var19.field3064.method7364(arg1);
            var19.field3064.method7286(arg2);
            var19.field3064.method7286(arg3);
            field552.method2534(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class266 var20 = Statics.method2786(class264.field3011, field552.field1342);
        var20.field3064.method7364(arg1);
        var20.field3064.method7286(arg2);
        var20.field3064.method7286(arg3);
        field552.method2534(var20);
    }

    @ObfuscatedName("es.jf(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2869(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method6620(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("ol.jw(Ljava/lang/String;Ljava/lang/String;IIIIII)V")
    public static final void method6609(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method6620(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("ou.jm(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method6620(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field641 || field642 >= 500) {
            return;
        }
        field731[field642] = arg0;
        field502[field642] = arg1;
        field645[field642] = arg2;
        field646[field642] = arg3;
        field643[field642] = arg4;
        field735[field642] = arg5;
        field616[field642] = arg6;
        field768[field642] = arg7;
        field642++;
    }

    @ObfuscatedName("fc.jl(I)I")
    public static final int method3087() {
        return field642 - 1;
    }

    @ObfuscatedName("bb.jz(IB)Ljava/lang/String;")
    public static String method2040(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field502[arg0].length() > 0) {
            return field731[arg0] + class310.field3860 + field502[arg0];
        } else {
            return field731[arg0];
        }
    }

    @ObfuscatedName("do.js(IIIIB)V")
    public static final void method2671(int arg0, int arg1, int arg2, int arg3) {
        if (field659 == 0 && !field661) {
            method2869(class310.field3681, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class213.field2627;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = class213.method3137(var4);
                    class85 var14 = field620[field632];
                    method3018(var14, field632, var11, var13);
                }
                return;
            }
            long var15 = class213.field2628[var8];
            if (var6 != var15) {
                label277: {
                    var6 = var15;
                    int var19 = class213.method2948(var8);
                    int var20 = class213.method3137(class213.field2628[var8]);
                    int var21 = var20;
                    int var22 = class213.method265(class213.field2628[var8]);
                    int var24 = class213.method3266(var8);
                    if (var22 == 2 && Statics.field3318.method3917(Statics.field1013, var19, var20, var15) >= 0) {
                        class188 var25 = Statics.method5147(var24);
                        if (var25.field2111 != null) {
                            var25 = var25.method3424();
                        }
                        if (var25 == null) {
                            break label277;
                        }
                        if (field659 == 1) {
                            method2869(class310.field3947, field660 + " " + class93.field1263 + " " + class93.method814(65535) + var25.field2074, 1, var24, var19, var20);
                        } else if (!field661) {
                            String[] var26 = var25.field2097;
                            if (var26 != null) {
                                for (int var27 = 4; var27 >= 0; var27--) {
                                    if (var26[var27] != null) {
                                        short var28 = 0;
                                        if (var27 == 0) {
                                            var28 = 3;
                                        }
                                        if (var27 == 1) {
                                            var28 = 4;
                                        }
                                        if (var27 == 2) {
                                            var28 = 5;
                                        }
                                        if (var27 == 3) {
                                            var28 = 6;
                                        }
                                        if (var27 == 4) {
                                            var28 = 1001;
                                        }
                                        method2869(var26[var27], class93.method814(65535) + var25.field2074, var28, var24, var19, var21);
                                    }
                                }
                            }
                            method2869(class310.field3670, class93.method814(65535) + var25.field2074, 1002, var25.field2077, var19, var21);
                        } else if ((Statics.field1366 & 0x4) == 4) {
                            method2869(field664, field665 + " " + class93.field1263 + " " + class93.method814(65535) + var25.field2074, 2, var24, var19, var20);
                        }
                    }
                    if (var22 == 1) {
                        class92 var29 = field547[var24];
                        if (var29 == null) {
                            break label277;
                        }
                        if (var29.field1254.field1973 == 1 && (var29.field1185 & 0x7F) == 64 && (var29.field1129 & 0x7F) == 64) {
                            for (int var30 = 0; var30 < field690; var30++) {
                                class92 var31 = field547[field514[var30]];
                                if (var31 != null && var29 != var31 && var31.field1254.field1973 == 1 && var29.field1185 == var31.field1185 && var29.field1129 == var31.field1129) {
                                    method2778(var31, field514[var30], var19, var21);
                                }
                            }
                            int var32 = class97.field1305;
                            int[] var33 = class97.field1290;
                            for (int var34 = 0; var34 < var32; var34++) {
                                class85 var35 = field620[var33[var34]];
                                if (var35 != null && var29.field1185 == var35.field1185 && var29.field1129 == var35.field1129) {
                                    method3018(var35, var33[var34], var19, var21);
                                }
                            }
                        }
                        method2778(var29, var24, var19, var21);
                    }
                    if (var22 == 0) {
                        class85 var36 = field620[var24];
                        if (var36 == null) {
                            break label277;
                        }
                        if ((var36.field1185 & 0x7F) == 64 && (var36.field1129 & 0x7F) == 64) {
                            for (int var37 = 0; var37 < field690; var37++) {
                                class92 var38 = field547[field514[var37]];
                                if (var38 != null && var38.field1254.field1973 == 1 && var36.field1185 == var38.field1185 && var36.field1129 == var38.field1129) {
                                    method2778(var38, field514[var37], var19, var21);
                                }
                            }
                            int var39 = class97.field1305;
                            int[] var40 = class97.field1290;
                            for (int var41 = 0; var41 < var39; var41++) {
                                class85 var42 = field620[var40[var41]];
                                if (var42 != null && var36 != var42 && var36.field1185 == var42.field1185 && var36.field1129 == var42.field1129) {
                                    method3018(var42, var40[var41], var19, var21);
                                }
                            }
                        }
                        if (field632 == var24) {
                            var4 = var15;
                        } else {
                            method3018(var36, var24, var19, var21);
                        }
                    }
                    if (var22 == 3) {
                        class336 var43 = field680[Statics.field1013][var19][var21];
                        if (var43 != null) {
                            for (class96 var44 = (class96) var43.method5642(); var44 != null; var44 = (class96) var43.method5650()) {
                                class189 var45 = class189.method2643(var44.field1289);
                                if (field659 == 1) {
                                    method2869(class310.field3947, field660 + " " + class93.field1263 + " " + class93.method814(16748608) + var45.field2139, 16, var44.field1289, var19, var21);
                                } else if (!field661) {
                                    String[] var46 = var45.field2147;
                                    for (int var47 = 4; var47 >= 0; var47--) {
                                        if (var46 != null && var46[var47] != null) {
                                            byte var48 = 0;
                                            if (var47 == 0) {
                                                var48 = 18;
                                            }
                                            if (var47 == 1) {
                                                var48 = 19;
                                            }
                                            if (var47 == 2) {
                                                var48 = 20;
                                            }
                                            if (var47 == 3) {
                                                var48 = 21;
                                            }
                                            if (var47 == 4) {
                                                var48 = 22;
                                            }
                                            method2869(var46[var47], class93.method814(16748608) + var45.field2139, var48, var44.field1289, var19, var21);
                                        } else if (var47 == 2) {
                                            method2869(class310.field3656, class93.method814(16748608) + var45.field2139, 20, var44.field1289, var19, var21);
                                        }
                                    }
                                    method2869(class310.field3670, class93.method814(16748608) + var45.field2139, 1004, var44.field1289, var19, var21);
                                } else if ((Statics.field1366 & 0x1) == 1) {
                                    method2869(field664, field665 + " " + class93.field1263 + " " + class93.method814(16748608) + var45.field2139, 17, var44.field1289, var19, var21);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("dv.jt(Lco;IIII)V")
    public static final void method2778(class92 arg0, int arg1, int arg2, int arg3) {
        class179 var4 = arg0.field1254;
        if (field642 >= 400) {
            return;
        }
        if (var4.field1967 != null) {
            var4 = var4.method3298();
        }
        if (var4 == null || !var4.field1937 || var4.field1968 && field676 != arg1) {
            return;
        }
        String var5 = arg0.method2397();
        if (var4.field1959 != 0 && arg0.field1204 != 0) {
            int var6 = arg0.field1204 == -1 ? var4.field1959 : arg0.field1204;
            int var8 = Statics.field890.field1090;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class93.method814(16711680);
            } else if (var9 < -6) {
                var10 = class93.method814(16723968);
            } else if (var9 < -3) {
                var10 = class93.method814(16740352);
            } else if (var9 < 0) {
                var10 = class93.method814(16756736);
            } else if (var9 > 9) {
                var10 = class93.method814(65280);
            } else if (var9 > 6) {
                var10 = class93.method814(4259584);
            } else if (var9 > 3) {
                var10 = class93.method814(8453888);
            } else if (var9 > 0) {
                var10 = class93.method814(12648192);
            } else {
                var10 = class93.method814(16776960);
            }
            var5 = var5 + var10 + " " + class93.field1261 + class310.field3716 + var6 + class93.field1262;
        }
        if (var4.field1968 && field651) {
            method2869(class310.field3670, class93.method814(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field659 == 1) {
            method2869(class310.field3947, field660 + " " + class93.field1263 + " " + class93.method814(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field661) {
            int var11 = var4.field1968 && field651 ? 2000 : 0;
            String[] var12 = var4.field1966;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var12[var13] != null && !var12[var13].equalsIgnoreCase(class310.field3713)) {
                        int var14 = 0;
                        if (var13 == 0) {
                            var14 = var11 + 9;
                        }
                        if (var13 == 1) {
                            var14 = var11 + 10;
                        }
                        if (var13 == 2) {
                            var14 = var11 + 11;
                        }
                        if (var13 == 3) {
                            var14 = var11 + 12;
                        }
                        if (var13 == 4) {
                            var14 = var11 + 13;
                        }
                        method2869(var12[var13], class93.method814(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (var12[var15] != null && var12[var15].equalsIgnoreCase(class310.field3713)) {
                        short var16 = 0;
                        if (field520 != class95.field1282) {
                            if (field520 == class95.field1277 || field520 == class95.field1278 && var4.field1959 > Statics.field890.field1090) {
                                var16 = 2000;
                            }
                            int var17 = 0;
                            if (var15 == 0) {
                                var17 = var16 + 9;
                            }
                            if (var15 == 1) {
                                var17 = var16 + 10;
                            }
                            if (var15 == 2) {
                                var17 = var16 + 11;
                            }
                            if (var15 == 3) {
                                var17 = var16 + 12;
                            }
                            if (var15 == 4) {
                                var17 = var16 + 13;
                            }
                            method2869(var12[var15], class93.method814(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1968 || !field651) {
                method2869(class310.field3670, class93.method814(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1366 & 0x2) == 2) {
            method2869(field664, field665 + " " + class93.field1263 + " " + class93.method814(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("eh.ja(Lcl;IIII)V")
    public static final void method3018(class85 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field890 == arg0 || field642 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1114 == 0) {
            String var4 = arg0.field1089[0] + arg0.field1109 + arg0.field1089[1];
            int var5 = arg0.field1090;
            int var6 = Statics.field890.field1090;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class93.method814(16711680);
            } else if (var7 < -6) {
                var8 = class93.method814(16723968);
            } else if (var7 < -3) {
                var8 = class93.method814(16740352);
            } else if (var7 < 0) {
                var8 = class93.method814(16756736);
            } else if (var7 > 9) {
                var8 = class93.method814(65280);
            } else if (var7 > 6) {
                var8 = class93.method814(4259584);
            } else if (var7 > 3) {
                var8 = class93.method814(8453888);
            } else if (var7 > 0) {
                var8 = class93.method814(12648192);
            } else {
                var8 = class93.method814(16776960);
            }
            var9 = var4 + var8 + " " + class93.field1261 + class310.field3716 + arg0.field1090 + class93.field1262 + arg0.field1089[2];
        } else {
            var9 = arg0.field1089[0] + arg0.field1109 + arg0.field1089[1] + " " + class93.field1261 + class310.field3818 + arg0.field1114 + class93.field1262 + arg0.field1089[2];
        }
        if (field659 == 1) {
            method2869(class310.field3947, field660 + " " + class93.field1263 + " " + class93.method814(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field661) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field629[var10] != null) {
                    short var11 = 0;
                    if (field629[var10].equalsIgnoreCase(class310.field3713)) {
                        if (field519 == class95.field1282) {
                            continue;
                        }
                        if (field519 == class95.field1277 || field519 == class95.field1278 && arg0.field1090 > Statics.field890.field1090) {
                            var11 = 2000;
                        }
                        if (Statics.field890.field1093 == 0 || arg0.field1093 == 0) {
                            if (field519 == class95.field1276 && arg0.method2177()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field890.field1093 == arg0.field1093) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field630[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field663[var10] + var11;
                    method2869(field629[var10], class93.method814(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1366 & 0x8) == 8) {
            method2869(field664, field665 + " " + class93.field1263 + " " + class93.method814(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field642; var14++) {
            if (field645[var14] == 23) {
                field502[var14] = class93.method814(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("ga.jy(IIIIIIIII)V")
    public static final void method3661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class296.method3567(arg0)) {
            Statics.field2664 = null;
            method1928(Statics.field3331[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2664 != null) {
                method1928(Statics.field2664, -1412584499, arg1, arg2, arg3, arg4, Statics.field241, Statics.field2345, arg7);
                Statics.field2664 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field715[var8] = true;
            }
        } else {
            field715[arg7] = true;
        }
    }

    @ObfuscatedName("bl.ju([Lkw;IIIIIIIII)V")
    public static final void method1928(class296[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class454.method7487(arg2, arg3, arg4, arg5);
        class202.method3759();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class296 var10 = arg0[var9];
            if (var10 != null && (var10.field3441 == arg1 || arg1 == -1412584499 && field601 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field718[field713] = var10.field3448 + arg6;
                    field719[field713] = var10.field3409 + arg7;
                    field492[field713] = var10.field3410;
                    field721[field713] = var10.field3411;
                    var11 = ++field713 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3474 = var11;
                var10.field3544 = field504;
                if (!var10.field3488 || !method111(var10)) {
                    if (var10.field3399 > 0) {
                        method1067(var10);
                    }
                    int var12 = var10.field3448 + arg6;
                    int var13 = var10.field3409 + arg7;
                    int var14 = var10.field3426;
                    if (field601 == var10) {
                        if (arg1 != -1412584499 && !var10.field3484) {
                            Statics.field2664 = arg0;
                            Statics.field241 = arg6;
                            Statics.field2345 = arg7;
                            continue;
                        }
                        if (field770 && field684) {
                            int var15 = class33.field232;
                            int var16 = class33.field231;
                            int var17 = var15 - field510;
                            int var18 = var16 - field682;
                            if (var17 < field784) {
                                var17 = field784;
                            }
                            if (var10.field3410 + var17 > field784 + field777.field3410) {
                                var17 = field784 + field777.field3410 - var10.field3410;
                            }
                            if (var18 < field745) {
                                var18 = field745;
                            }
                            if (var10.field3411 + var18 > field745 + field777.field3411) {
                                var18 = field745 + field777.field3411 - var10.field3411;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3484) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field3397 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field3397 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field3410 + var12;
                        int var26 = var10.field3411 + var13;
                        if (var25 < var12) {
                            var23 = var25;
                            var25 = var12;
                        }
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        var25++;
                        var26++;
                        var19 = var23 > arg2 ? var23 : arg2;
                        var20 = var24 > arg3 ? var24 : arg3;
                        var21 = var25 < arg4 ? var25 : arg4;
                        var22 = var26 < arg5 ? var26 : arg5;
                    } else {
                        int var29 = var10.field3410 + var12;
                        int var30 = var10.field3411 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3488 || var19 < var21 && var20 < var22) {
                        if (var10.field3399 != 0) {
                            if (var10.field3399 == 1336) {
                                if (Statics.field1108.method2288()) {
                                    var13 += 15;
                                    Statics.field6.method5954("Fps:" + field194, var10.field3410 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field497) {
                                        var33 = 16711680;
                                    }
                                    Statics.field6.method5954("Mem:" + var32 + "k", var10.field3410 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3399 == 1337) {
                                field655 = var12;
                                field656 = var13;
                                method2313(var12, var13, var10.field3410, var10.field3411);
                                field715[var10.field3474] = true;
                                class454.method7487(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3399 == 1338) {
                                method303(var10, var12, var13, var11);
                                class454.method7487(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3399 == 1339) {
                                method305(var10, var12, var13, var11);
                                class454.method7487(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3399 == 1400) {
                                Statics.field422.method6718(var12, var13, var10.field3410, var10.field3411, field504);
                            }
                            if (var10.field3399 == 1401) {
                                Statics.field422.method6721(var12, var13, var10.field3410, var10.field3411);
                            }
                            if (var10.field3399 == 1402) {
                                Statics.field2638.method2246(var12, field504);
                            }
                        }
                        if (var10.field3397 == 0) {
                            if (!var10.field3488 && method111(var10) && Statics.field1700 != var10) {
                                continue;
                            }
                            if (!var10.field3488) {
                                if (var10.field3417 > var10.field3419 - var10.field3411) {
                                    var10.field3417 = var10.field3419 - var10.field3411;
                                }
                                if (var10.field3417 < 0) {
                                    var10.field3417 = 0;
                                }
                            }
                            method1928(arg0, var10.field3395, var19, var20, var21, var22, var12 - var10.field3378, var13 - var10.field3417, var11);
                            if (var10.field3503 != null) {
                                method1928(var10.field3503, var10.field3395, var19, var20, var21, var22, var12 - var10.field3378, var13 - var10.field3417, var11);
                            }
                            class80 var34 = (class80) field667.method6941((long) var10.field3395);
                            if (var34 != null) {
                                method3661(var34.field1038, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class454.method7487(arg2, arg3, arg4, arg5);
                            class202.method3759();
                        } else if (var10.field3397 == 11) {
                            if (method111(var10) && Statics.field1700 != var10) {
                                continue;
                            }
                            if (var10.field3503 != null) {
                                method1928(var10.field3503, var10.field3395, var19, var20, var21, var22, var12 - var10.field3378, var13 - var10.field3417, var11);
                            }
                            class454.method7487(arg2, arg3, arg4, arg5);
                            class202.method3759();
                        }
                        if (field736 || field672[var11] || field654 > 1) {
                            if (var10.field3397 == 0 && !var10.field3488 && var10.field3419 > var10.field3411) {
                                method4845(var10.field3410 + var12, var13, var10.field3417, var10.field3411, var10.field3419);
                            }
                            if (var10.field3397 != 1) {
                                if (var10.field3397 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field3518; var36++) {
                                        for (int var37 = 0; var37 < var10.field3436; var37++) {
                                            int var38 = (var10.field3463 + 32) * var37 + var12;
                                            int var39 = (var10.field3464 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field3416[var35];
                                                var39 += var10.field3466[var35];
                                            }
                                            if (var10.field3408[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3408[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field4353 == var10 && field597 == var35) {
                                                    class458 var43;
                                                    if (field659 == 1 && Statics.field481 == var35 && Statics.field2692 == var10.field3395) {
                                                        var43 = class189.method407(var42, var10.field3471[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class189.method407(var42, var10.field3471[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method6648(var10);
                                                    } else if (Statics.field4353 == var10 && field597 == var35) {
                                                        int var44 = class33.field232 - field613;
                                                        int var45 = class33.field231 - field704;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field617 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method7610(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class296 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class454.field4802 && var46.field3417 > 0) {
                                                                int var47 = field744 * (class454.field4802 - var39 - var45) / 3;
                                                                if (var47 > field744 * 10) {
                                                                    var47 = field744 * 10;
                                                                }
                                                                if (var47 > var46.field3417) {
                                                                    var47 = var46.field3417;
                                                                }
                                                                var46.field3417 -= var47;
                                                                field704 += var47;
                                                                method6648(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class454.field4803 && var46.field3417 < var46.field3419 - var46.field3411) {
                                                                int var48 = field744 * (var39 + var45 + 32 - class454.field4803) / 3;
                                                                if (var48 > field744 * 10) {
                                                                    var48 = field744 * 10;
                                                                }
                                                                if (var48 > var46.field3419 - var46.field3411 - var46.field3417) {
                                                                    var48 = var46.field3419 - var46.field3411 - var46.field3417;
                                                                }
                                                                var46.field3417 += var48;
                                                                field704 -= var48;
                                                                method6648(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field154 == var10 && field636 == var35) {
                                                        var43.method7610(var38, var39, 128);
                                                    } else {
                                                        var43.method7604(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3467 != null && var35 < 20) {
                                                class458 var49 = var10.method5201(var35);
                                                if (var49 != null) {
                                                    var49.method7604(var38, var39);
                                                } else if (class296.field3393) {
                                                    method6648(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field3397 == 3) {
                                    int var50;
                                    if (method4802(var10)) {
                                        var50 = var10.field3421;
                                        if (Statics.field1700 == var10 && var10.field3531 != 0) {
                                            var50 = var10.field3531;
                                        }
                                    } else {
                                        var50 = var10.field3420;
                                        if (Statics.field1700 == var10 && var10.field3422 != 0) {
                                            var50 = var10.field3422;
                                        }
                                    }
                                    if (var10.field3505) {
                                        switch(var10.field3425.field4813) {
                                            case 1:
                                                class454.method7496(var12, var13, var10.field3410, var10.field3411, var10.field3420, var10.field3421);
                                                break;
                                            case 2:
                                                class454.method7495(var12, var13, var10.field3410, var10.field3411, var10.field3420, var10.field3421, 255 - (var10.field3426 & 0xFF), 255 - (var10.field3427 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class454.method7518(var12, var13, var10.field3410, var10.field3411, var50);
                                                } else {
                                                    class454.method7494(var12, var13, var10.field3410, var10.field3411, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class454.method7499(var12, var13, var10.field3410, var10.field3411, var50);
                                    } else {
                                        class454.method7536(var12, var13, var10.field3410, var10.field3411, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3397 == 4) {
                                    class351 var51 = var10.method5198();
                                    if (var51 != null) {
                                        String var52 = var10.field3457;
                                        int var53;
                                        if (method4802(var10)) {
                                            var53 = var10.field3421;
                                            if (Statics.field1700 == var10 && var10.field3531 != 0) {
                                                var53 = var10.field3531;
                                            }
                                            if (var10.field3458.length() > 0) {
                                                var52 = var10.field3458;
                                            }
                                        } else {
                                            var53 = var10.field3420;
                                            if (Statics.field1700 == var10 && var10.field3422 != 0) {
                                                var53 = var10.field3422;
                                            }
                                        }
                                        if (var10.field3488 && var10.field3454 != -1) {
                                            class189 var54 = class189.method2643(var10.field3454);
                                            var52 = var54.field2139;
                                            if (var52 == null) {
                                                var52 = class310.field3924;
                                            }
                                            if ((var54.field2133 == 1 || var10.field3424 != 1) && var10.field3424 != -1) {
                                                var52 = class93.method814(16748608) + var52 + class93.field1265 + " " + 'x' + method5356(var10.field3424);
                                            }
                                        }
                                        if (field628 == var10) {
                                            var52 = class310.field3826;
                                            var53 = var10.field3420;
                                        }
                                        if (!var10.field3488) {
                                            var52 = method106(var52, var10);
                                        }
                                        var51.method5974(var52, var12, var13, var10.field3410, var10.field3411, var53, var10.field3462 ? 0 : -1, var10.field3445, var10.field3433, var10.field3459);
                                    } else if (class296.field3393) {
                                        method6648(var10);
                                    }
                                } else if (var10.field3397 == 5) {
                                    if (var10.field3488) {
                                        class458 var56;
                                        if (var10.field3454 == -1) {
                                            var56 = var10.method5204(false, Statics.field1337);
                                        } else {
                                            var56 = class189.method407(var10.field3454, var10.field3424, var10.field3428, var10.field3394, var10.field3455, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4824;
                                            int var58 = var56.field4830;
                                            if (var10.field3434) {
                                                class454.method7488(var12, var13, var10.field3410 + var12, var10.field3411 + var13);
                                                int var59 = (var10.field3410 + (var57 - 1)) / var57;
                                                int var60 = (var10.field3411 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3423 != 0) {
                                                            var56.method7709(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3423, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method7604(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method7610(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class454.method7487(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field3410 * 4096 / var57;
                                                if (var10.field3423 != 0) {
                                                    var56.method7709(var10.field3410 / 2 + var12, var10.field3411 / 2 + var13, var10.field3423, var63);
                                                } else if (var14 != 0) {
                                                    var56.method7597(var12, var13, var10.field3410, var10.field3411, 256 - (var14 & 0xFF));
                                                } else if (var10.field3410 == var57 && var10.field3411 == var58) {
                                                    var56.method7604(var12, var13);
                                                } else {
                                                    var56.method7606(var12, var13, var10.field3410, var10.field3411);
                                                }
                                            }
                                        } else if (class296.field3393) {
                                            method6648(var10);
                                        }
                                    } else {
                                        class458 var55 = var10.method5204(method4802(var10), Statics.field1337);
                                        if (var55 != null) {
                                            var55.method7604(var12, var13);
                                        } else if (class296.field3393) {
                                            method6648(var10);
                                        }
                                    }
                                } else if (var10.field3397 == 6) {
                                    boolean var64 = method4802(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3533;
                                    } else {
                                        var65 = var10.field3443;
                                    }
                                    class212 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3454 != -1) {
                                        class189 var68 = class189.method2643(var10.field3454);
                                        if (var68 != null) {
                                            class189 var69 = var68.method3479(var10.field3424);
                                            var66 = var69.method3498(1);
                                            if (var66 == null) {
                                                method6648(var10);
                                            } else {
                                                var66.method4136();
                                                var67 = var66.field2479 / 2;
                                            }
                                        }
                                    } else if (var10.field3439 == 5) {
                                        if (var10.field3440 == 0) {
                                            var66 = field774.method5155((class191) null, -1, (class191) null, -1);
                                        } else {
                                            var66 = Statics.field890.method1926();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method5202((class191) null, -1, var64, Statics.field890.field1086);
                                        if (var66 == null && class296.field3393) {
                                            method6648(var10);
                                        }
                                    } else {
                                        class191 var70 = class191.method22(var65);
                                        var66 = var10.method5202(var70, var10.field3497, var64, Statics.field890.field1086);
                                        if (var66 == null && class296.field3393) {
                                            method6648(var10);
                                        }
                                    }
                                    class202.method3826(var10.field3410 / 2 + var12, var10.field3411 / 2 + var13);
                                    int var71 = var10.field3450 * class202.field2396[var10.field3513] >> 16;
                                    int var72 = var10.field3450 * class202.field2381[var10.field3513] >> 16;
                                    if (var66 != null) {
                                        if (var10.field3488) {
                                            var66.method4136();
                                            if (var10.field3414) {
                                                var66.method4222(0, var10.field3516, var10.field3449, var10.field3513, var10.field3389, var10.field3446 + var67 + var71, var10.field3446 + var72, var10.field3450);
                                            } else {
                                                var66.method4154(0, var10.field3516, var10.field3449, var10.field3513, var10.field3389, var10.field3446 + var67 + var71, var10.field3446 + var72);
                                            }
                                        } else {
                                            var66.method4154(0, var10.field3516, 0, var10.field3513, 0, var71, var72);
                                        }
                                    }
                                    class202.method3813();
                                } else {
                                    if (var10.field3397 == 7) {
                                        class351 var73 = var10.method5198();
                                        if (var73 == null) {
                                            if (class296.field3393) {
                                                method6648(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field3518; var75++) {
                                            for (int var76 = 0; var76 < var10.field3436; var76++) {
                                                if (var10.field3408[var74] > 0) {
                                                    class189 var77 = class189.method2643(var10.field3408[var74] - 1);
                                                    String var78;
                                                    if (var77.field2133 != 1 && var10.field3471[var74] == 1) {
                                                        var78 = class93.method814(16748608) + var77.field2139 + class93.field1265;
                                                    } else {
                                                        var78 = class93.method814(16748608) + var77.field2139 + class93.field1265 + " " + 'x' + method5356(var10.field3471[var74]);
                                                    }
                                                    int var79 = (var10.field3463 + 115) * var76 + var12;
                                                    int var80 = (var10.field3464 + 12) * var75 + var13;
                                                    if (var10.field3445 == 0) {
                                                        var73.method5953(var78, var79, var80, var10.field3420, var10.field3462 ? 0 : -1);
                                                    } else if (var10.field3445 == 1) {
                                                        var73.method5955(var78, var10.field3410 / 2 + var79, var80, var10.field3420, var10.field3462 ? 0 : -1);
                                                    } else {
                                                        var73.method5954(var78, var10.field3410 + var79 - 1, var80, var10.field3420, var10.field3462 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field3397 == 8 && Statics.field4106 == var10 && field658 == field561) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class351 var83 = Statics.field6;
                                        String var84 = var10.field3457;
                                        String var85 = method106(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class93.field1264);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method5952(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field4224 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field3410 + var12 - 5 - var81;
                                        int var90 = var10.field3411 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class454.method7518(var89, var90, var81, var82, 16777120);
                                        class454.method7499(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3457;
                                        int var92 = var83.field4224 + var90 + 2;
                                        String var93 = method106(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class93.field1264);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method5953(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field4224 + 1;
                                        }
                                    }
                                    if (var10.field3397 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field3435) {
                                            var96 = var12;
                                            var97 = var10.field3411 + var13;
                                            var98 = var10.field3410 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field3410 + var12;
                                            var99 = var10.field3411 + var13;
                                        }
                                        if (var10.field3506 == 1) {
                                            class454.method7505(var96, var97, var98, var99, var10.field3420);
                                        } else {
                                            method315(var96, var97, var98, var99, var10.field3420, var10.field3506);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.jc(IIIIIII)V")
    public static final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class454.field4799;
        int var18 = arg1 - class454.field4802;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class202.method3767(var19, var20, var21);
        class202.method3801(var23, var24, var25, var19, var20, var21, arg4);
        class202.method3767(var19, var21, var22);
        class202.method3801(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("v.jg(Ljava/lang/String;Lkw;I)Ljava/lang/String;")
    public static String method106(String arg0, class296 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method642(arg1, var2 - 1);
                    String var6;
                    if (var5 < 999999999) {
                        var6 = Integer.toString(var5);
                    } else {
                        var6 = "*";
                    }
                    arg0 = var4 + var6 + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ln.jj(IB)Ljava/lang/String;")
    public static final String method5356(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class93.field1259 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class93.method814(65408) + var1.substring(0, var1.length() - 8) + class310.field3829 + " " + class93.field1261 + var1 + class93.field1262 + class93.field1265;
        } else if (var1.length() > 6) {
            return " " + class93.method814(16777215) + var1.substring(0, var1.length() - 4) + class310.field3831 + " " + class93.field1261 + var1 + class93.field1262 + class93.field1265;
        } else {
            return " " + class93.method814(16776960) + var1 + class93.field1265;
        }
    }

    @ObfuscatedName("client.jo(ZI)V")
    public final void method1141(boolean arg0) {
        int var2 = field666;
        int var3 = Statics.field1514;
        int var4 = Statics.field1825;
        if (class296.method3567(var2)) {
            method3377(Statics.field3331[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.jx(Lkw;I)V")
    public void method1142(class296 arg0) {
        class296 var2 = arg0.field3441 == -1 ? null : class296.method3318(arg0.field3441);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1514;
            var4 = Statics.field1825;
        } else {
            var3 = var2.field3410;
            var4 = var2.field3411;
        }
        method2425(arg0, var3, var4, false);
        method3240(arg0, var3, var4);
    }

    @ObfuscatedName("gl.jh([Lkw;Lkw;ZI)V")
    public static void method3379(class296[] arg0, class296 arg1, boolean arg2) {
        int var3 = arg1.field3479 == 0 ? arg1.field3410 : arg1.field3479;
        int var4 = arg1.field3419 == 0 ? arg1.field3411 : arg1.field3419;
        method3377(arg0, arg1.field3395, var3, var4, arg2);
        if (arg1.field3503 != null) {
            method3377(arg1.field3503, arg1.field3395, var3, var4, arg2);
        }
        class80 var5 = (class80) field667.method6941((long) arg1.field3395);
        if (var5 != null) {
            int var6 = var5.field1038;
            if (class296.method3567(var6)) {
                method3377(Statics.field3331[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3399 == 1337) {
        }
    }

    @ObfuscatedName("gl.jd([Lkw;IIIZI)V")
    public static void method3377(class296[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class296 var6 = arg0[var5];
            if (var6 != null && var6.field3441 == arg1) {
                method2425(var6, arg2, arg3, arg4);
                method3240(var6, arg2, arg3);
                if (var6.field3378 > var6.field3479 - var6.field3410) {
                    var6.field3378 = var6.field3479 - var6.field3410;
                }
                if (var6.field3378 < 0) {
                    var6.field3378 = 0;
                }
                if (var6.field3417 > var6.field3419 - var6.field3411) {
                    var6.field3417 = var6.field3419 - var6.field3411;
                }
                if (var6.field3417 < 0) {
                    var6.field3417 = 0;
                }
                if (var6.field3397 == 0) {
                    method3379(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cx.jb(Lkw;IIZI)V")
    public static void method2425(class296 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3410;
        int var5 = arg0.field3411;
        if (arg0.field3402 == 0) {
            arg0.field3410 = arg0.field3436;
        } else if (arg0.field3402 == 1) {
            arg0.field3410 = arg1 - arg0.field3436;
        } else if (arg0.field3402 == 2) {
            arg0.field3410 = arg0.field3436 * arg1 >> 14;
        }
        if (arg0.field3460 == 0) {
            arg0.field3411 = arg0.field3518;
        } else if (arg0.field3460 == 1) {
            arg0.field3411 = arg2 - arg0.field3518;
        } else if (arg0.field3460 == 2) {
            arg0.field3411 = arg0.field3518 * arg2 >> 14;
        }
        if (arg0.field3402 == 4) {
            arg0.field3410 = arg0.field3412 * arg0.field3411 / arg0.field3413;
        }
        if (arg0.field3460 == 4) {
            arg0.field3411 = arg0.field3413 * arg0.field3410 / arg0.field3412;
        }
        if (arg0.field3399 == 1337) {
            field740 = arg0;
        }
        if (arg3 && arg0.field3520 != null && (arg0.field3410 != var4 || arg0.field3411 != var5)) {
            class81 var6 = new class81();
            var6.field1044 = arg0;
            var6.field1046 = arg0.field3520;
            field678.method5660(var6);
        }
    }

    @ObfuscatedName("fd.ji(Lkw;III)V")
    public static void method3240(class296 arg0, int arg1, int arg2) {
        if (arg0.field3536 == 0) {
            arg0.field3448 = arg0.field3404;
        } else if (arg0.field3536 == 1) {
            arg0.field3448 = (arg1 - arg0.field3410) / 2 + arg0.field3404;
        } else if (arg0.field3536 == 2) {
            arg0.field3448 = arg1 - arg0.field3410 - arg0.field3404;
        } else if (arg0.field3536 == 3) {
            arg0.field3448 = arg0.field3404 * arg1 >> 14;
        } else if (arg0.field3536 == 4) {
            arg0.field3448 = (arg0.field3404 * arg1 >> 14) + (arg1 - arg0.field3410) / 2;
        } else {
            arg0.field3448 = arg1 - arg0.field3410 - (arg0.field3404 * arg1 >> 14);
        }
        if (arg0.field3534 == 0) {
            arg0.field3409 = arg0.field3405;
        } else if (arg0.field3534 == 1) {
            arg0.field3409 = (arg2 - arg0.field3411) / 2 + arg0.field3405;
        } else if (arg0.field3534 == 2) {
            arg0.field3409 = arg2 - arg0.field3411 - arg0.field3405;
        } else if (arg0.field3534 == 3) {
            arg0.field3409 = arg0.field3405 * arg2 >> 14;
        } else if (arg0.field3534 == 4) {
            arg0.field3409 = (arg0.field3405 * arg2 >> 14) + (arg2 - arg0.field3411) / 2;
        } else {
            arg0.field3409 = arg2 - arg0.field3411 - (arg0.field3405 * arg2 >> 14);
        }
    }

    @ObfuscatedName("j.jn(Lkw;IIIIIII)V")
    public static final void method104(class296 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field571) {
            field589 = 32;
        } else {
            field589 = 0;
        }
        field571 = false;
        if (class33.field229 == 1 || !Statics.field2478 && class33.field229 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3417 -= 4;
                method6648(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3417 += 4;
                method6648(arg0);
            } else if (arg5 >= arg1 - field589 && arg5 < field589 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3417 = (arg4 - arg3) * var8 / var9;
                method6648(arg0);
                field571 = true;
            }
        }
        if (field686 == 0) {
            return;
        }
        int var10 = arg0.field3410;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3417 += field686 * 45;
            method6648(arg0);
        }
    }

    @ObfuscatedName("ju.jk(IIIIIB)V")
    public static final void method4845(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field991[0].method7573(arg0, arg1);
        Statics.field991[1].method7573(arg0, arg1 + arg3 - 16);
        class454.method7518(arg0, arg1 + 16, 16, arg3 - 32, field509);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class454.method7518(arg0, arg1 + 16 + var6, 16, var5, field717);
        class454.method7503(arg0, arg1 + 16 + var6, var5, field728);
        class454.method7503(arg0 + 1, arg1 + 16 + var6, var5, field728);
        class454.method7501(arg0, arg1 + 16 + var6, 16, field728);
        class454.method7501(arg0, arg1 + 17 + var6, 16, field728);
        class454.method7503(arg0 + 15, arg1 + 16 + var6, var5, field569);
        class454.method7503(arg0 + 14, arg1 + 17 + var6, var5 - 1, field569);
        class454.method7501(arg0, arg1 + 15 + var6 + var5, 16, field569);
        class454.method7501(arg0 + 1, arg1 + 14 + var6 + var5, 15, field569);
    }

    @ObfuscatedName("jw.jv(Lkw;I)Z")
    public static final boolean method4802(class296 arg0) {
        if (arg0.field3525 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3525.length; var1++) {
            int var2 = method642(arg0, var1);
            int var3 = arg0.field3526[var1];
            if (arg0.field3525[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3525[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3525[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ak.je(Lkw;IB)I")
    public static final int method642(class296 arg0, int arg1) {
        if (arg0.field3482 == null || arg1 >= arg0.field3482.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3482[arg1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;
            while (true) {
                int var6 = var2[var4++];
                int var7 = 0;
                byte var8 = 0;
                if (var6 == 0) {
                    return var3;
                }
                if (var6 == 1) {
                    var7 = field637[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field638[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field500[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class296 var11 = class296.method3318(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class189.method2643(var12).field2146 || field685)) {
                        for (int var13 = 0; var13 < var11.field3408.length; var13++) {
                            if (var12 + 1 == var11.field3408[var13]) {
                                var7 += var11.field3471[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class290.field3346[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class300.field3588[field638[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class290.field3346[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field890.field1090;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class300.field3587[var14]) {
                            var7 += field638[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class296 var17 = class296.method3318(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class189.method2643(var18).field2146 || field685)) {
                        for (int var19 = 0; var19 < var17.field3408.length; var19++) {
                            if (var18 + 1 == var17.field3408[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field673;
                }
                if (var6 == 12) {
                    var7 = field674;
                }
                if (var6 == 13) {
                    int var20 = class290.field3346[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class290.method2609(var22);
                }
                if (var6 == 15) {
                    var8 = 1;
                }
                if (var6 == 16) {
                    var8 = 2;
                }
                if (var6 == 17) {
                    var8 = 3;
                }
                if (var6 == 18) {
                    var7 = (Statics.field890.field1185 >> 7) + Statics.field1560;
                }
                if (var6 == 19) {
                    var7 = (Statics.field890.field1129 >> 7) + Statics.field2784;
                }
                if (var6 == 20) {
                    var7 = var2[var4++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var3 += var7;
                    }
                    if (var5 == 1) {
                        var3 -= var7;
                    }
                    if (var5 == 2 && var7 != 0) {
                        var3 /= var7;
                    }
                    if (var5 == 3) {
                        var3 *= var7;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @ObfuscatedName("o.ko(ZB)V")
    public static void method374(boolean arg0) {
        field653 = arg0;
    }

    @ObfuscatedName("jy.kb(I)Z")
    public static boolean method4834() {
        return field653;
    }

    @ObfuscatedName("jj.kz(I)Z")
    public static boolean method4978() {
        return field653 || class24.field123[81];
    }

    @ObfuscatedName("id.ki(IIIIIIII)V")
    public static final void method4795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class296.method3567(arg0)) {
            method264(Statics.field3331[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("a.kk([Lkw;IIIIIIIB)V")
    public static final void method264(class296[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class296 var9 = arg0[var8];
            if (var9 != null && var9.field3441 == arg1 && (var9.method5205() || method2462(var9) != 0 || field777 == var9)) {
                if (var9.field3488) {
                    if (method111(var9)) {
                        continue;
                    }
                } else if (var9.field3397 == 0 && Statics.field1700 != var9 && method111(var9)) {
                    continue;
                }
                if (var9.field3397 == 11 && var9.method5248(Statics.field1337)) {
                    if (var9.method5211()) {
                        method6648(var9);
                        method3379(var9.field3503, var9, true);
                    }
                    if (var9.field3523 != null) {
                        class81 var10 = new class81();
                        var10.field1044 = var9;
                        var10.field1046 = var9.field3523;
                        field678.method5660(var10);
                    }
                }
                int var11 = var9.field3448 + arg6;
                int var12 = var9.field3409 + arg7;
                int var13;
                int var14;
                int var15;
                int var16;
                if (var9.field3397 == 2) {
                    var13 = arg2;
                    var14 = arg3;
                    var15 = arg4;
                    var16 = arg5;
                } else if (var9.field3397 == 9) {
                    int var17 = var11;
                    int var18 = var12;
                    int var19 = var9.field3410 + var11;
                    int var20 = var9.field3411 + var12;
                    if (var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                    }
                    if (var20 < var12) {
                        var18 = var20;
                        var20 = var12;
                    }
                    var19++;
                    var20++;
                    var13 = var17 > arg2 ? var17 : arg2;
                    var14 = var18 > arg3 ? var18 : arg3;
                    var15 = var19 < arg4 ? var19 : arg4;
                    var16 = var20 < arg5 ? var20 : arg5;
                } else {
                    int var23 = var9.field3410 + var11;
                    int var24 = var9.field3411 + var12;
                    var13 = var11 > arg2 ? var11 : arg2;
                    var14 = var12 > arg3 ? var12 : arg3;
                    var15 = var23 < arg4 ? var23 : arg4;
                    var16 = var24 < arg5 ? var24 : arg5;
                }
                if (field601 == var9) {
                    field687 = true;
                    field688 = var11;
                    field689 = var12;
                }
                boolean var25 = false;
                if (var9.field3396) {
                    switch(field594) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3395 >>> 16 == field669) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field669 == var9.field3395) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3488 || var13 < var15 && var14 < var16) {
                    if (var9.field3488) {
                        if (var9.field3407) {
                            if (class33.field232 >= var13 && class33.field231 >= var14 && class33.field232 < var15 && class33.field231 < var16) {
                                for (class81 var26 = (class81) field678.method5647(); var26 != null; var26 = (class81) field678.method5649()) {
                                    if (var26.field1043) {
                                        var26.method6657();
                                        var26.field1044.field3537 = false;
                                    }
                                }
                                if (Statics.field2929 == 0) {
                                    field601 = null;
                                    field777 = null;
                                }
                                if (!field641) {
                                    method3566();
                                }
                            }
                        } else if (var9.field3547 && class33.field232 >= var13 && class33.field231 >= var14 && class33.field232 < var15 && class33.field231 < var16) {
                            for (class81 var27 = (class81) field678.method5647(); var27 != null; var27 = (class81) field678.method5649()) {
                                if (var27.field1043 && var27.field1044.field3508 == var27.field1046) {
                                    var27.method6657();
                                }
                            }
                        }
                    }
                    int var28 = class33.field232;
                    int var29 = class33.field231;
                    if (class33.field237 != 0) {
                        var28 = class33.field238;
                        var29 = class33.field239;
                    }
                    boolean var30 = var28 >= var13 && var29 >= var14 && var28 < var15 && var29 < var16;
                    if (var9.field3399 == 1337) {
                        if (!field503 && !field641 && var30) {
                            method2671(var28, var29, var13, var14);
                        }
                    } else if (var9.field3399 == 1338) {
                        method6380(var9, var11, var12);
                    } else {
                        if (var9.field3399 == 1400) {
                            Statics.field422.method6701(class33.field232, class33.field231, var30, var11, var12, var9.field3410, var9.field3411);
                        }
                        if (!field641 && var30) {
                            if (var9.field3399 == 1400) {
                                Statics.field422.method6753(var11, var12, var9.field3410, var9.field3411, var28, var29);
                            } else {
                                Statics.method3108(var9, var28 - var11, var29 - var12);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3465.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3465[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3465[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3545 != null) {
                                            var35 = class24.field123[var9.field3465[var31][var34]];
                                        }
                                        if (method2676(var9.field3465[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3545 != null && var9.field3545[var31] > field504) {
                                                break;
                                            }
                                            byte var36 = var9.field3476[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !class24.field123[86] && !class24.field123[82] && !class24.field123[81]) && ((var36 & 0x2) == 0 || class24.field123[86]) && ((var36 & 0x1) == 0 || class24.field123[82]) && ((var36 & 0x4) == 0 || class24.field123[81])) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method1101(var31 + 1, var9.field3395, var9.field3415, var9.field3454, "");
                                    } else if (var31 == 10) {
                                        method3660();
                                        method2845(var9.field3395, var9.field3415, class297.method813(method2462(var9)), var9.field3454);
                                        field664 = method1945(var9);
                                        if (field664 == null) {
                                            field664 = class310.field3924;
                                        }
                                        field665 = var9.field3491 + class93.method814(16777215);
                                    }
                                    int var37 = var9.field3418[var31];
                                    if (var9.field3545 == null) {
                                        var9.field3545 = new int[var9.field3465.length];
                                    }
                                    if (var9.field3478 == null) {
                                        var9.field3478 = new int[var9.field3465.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3545[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3545[var31] == 0) {
                                        var9.field3545[var31] = field504 + var37 + var9.field3478[var31];
                                    } else {
                                        var9.field3545[var31] = field504 + var37;
                                    }
                                }
                                if (!var32 && var9.field3545 != null) {
                                    var9.field3545[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3488) {
                            boolean var38;
                            if (class33.field232 >= var13 && class33.field231 >= var14 && class33.field232 < var15 && class33.field231 < var16) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class33.field229 == 1 || !Statics.field2478 && class33.field229 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class33.field237 == 1 || !Statics.field2478 && class33.field237 == 4) && class33.field238 >= var13 && class33.field239 >= var14 && class33.field238 < var15 && class33.field239 < var16) {
                                var40 = true;
                            }
                            if (var40) {
                                method5089(var9, class33.field238 - var11, class33.field239 - var12);
                                if (var9.field3397 == 11 && var9.method5210(class33.field238, class33.field239, arg6, arg7)) {
                                    switch(var9.method5238()) {
                                        case 0:
                                            class30.method3656(var9.method5236(), true, false);
                                            break;
                                        case 1:
                                            if (class297.method3542(method2462(var9))) {
                                                int[] var41 = var9.method5256();
                                                if (var41 != null) {
                                                    class266 var42 = Statics.method2786(class264.field2995, field552.field1342);
                                                    var42.field3064.method7189(var41[0]);
                                                    var42.field3064.method7244(var9.field3395);
                                                    var42.field3064.method7189(var41[1]);
                                                    var42.field3064.method7286(var9.field3415);
                                                    var42.field3064.method7189(var41[2]);
                                                    var42.field3064.method7189(var9.method5260());
                                                    field552.method2534(var42);
                                                }
                                            }
                                    }
                                }
                            }
                            if (var9.field3399 == 1400) {
                                Statics.field422.method6702(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field601 != null && field601 != var9 && var38 && class297.method3245(method2462(var9))) {
                                field683 = var9;
                            }
                            if (field777 == var9) {
                                field684 = true;
                                field784 = var11;
                                field745 = var12;
                            }
                            if (var9.field3486) {
                                if (var38 && field686 != 0 && var9.field3508 != null) {
                                    class81 var43 = new class81();
                                    var43.field1043 = true;
                                    var43.field1044 = var9;
                                    var43.field1048 = field686;
                                    var43.field1046 = var9.field3508;
                                    field678.method5660(var43);
                                }
                                if (field601 != null || Statics.field4353 != null || field641) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3538 && var40) {
                                    var9.field3538 = true;
                                    if (var9.field3406 != null) {
                                        class81 var44 = new class81();
                                        var44.field1043 = true;
                                        var44.field1044 = var9;
                                        var44.field1045 = class33.field238 - var11;
                                        var44.field1048 = class33.field239 - var12;
                                        var44.field1046 = var9.field3406;
                                        field678.method5660(var44);
                                    }
                                }
                                if (var9.field3538 && var39 && var9.field3489 != null) {
                                    class81 var45 = new class81();
                                    var45.field1043 = true;
                                    var45.field1044 = var9;
                                    var45.field1045 = class33.field232 - var11;
                                    var45.field1048 = class33.field231 - var12;
                                    var45.field1046 = var9.field3489;
                                    field678.method5660(var45);
                                }
                                if (var9.field3538 && !var39) {
                                    var9.field3538 = false;
                                    if (var9.field3490 != null) {
                                        class81 var46 = new class81();
                                        var46.field1043 = true;
                                        var46.field1044 = var9;
                                        var46.field1045 = class33.field232 - var11;
                                        var46.field1048 = class33.field231 - var12;
                                        var46.field1046 = var9.field3490;
                                        field627.method5660(var46);
                                    }
                                }
                                if (var39 && var9.field3477 != null) {
                                    class81 var47 = new class81();
                                    var47.field1043 = true;
                                    var47.field1044 = var9;
                                    var47.field1045 = class33.field232 - var11;
                                    var47.field1048 = class33.field231 - var12;
                                    var47.field1046 = var9.field3477;
                                    field678.method5660(var47);
                                }
                                if (!var9.field3537 && var38) {
                                    var9.field3537 = true;
                                    if (var9.field3492 != null) {
                                        class81 var48 = new class81();
                                        var48.field1043 = true;
                                        var48.field1044 = var9;
                                        var48.field1045 = class33.field232 - var11;
                                        var48.field1048 = class33.field231 - var12;
                                        var48.field1046 = var9.field3492;
                                        field678.method5660(var48);
                                    }
                                }
                                if (var9.field3537 && var38 && var9.field3493 != null) {
                                    class81 var49 = new class81();
                                    var49.field1043 = true;
                                    var49.field1044 = var9;
                                    var49.field1045 = class33.field232 - var11;
                                    var49.field1048 = class33.field231 - var12;
                                    var49.field1046 = var9.field3493;
                                    field678.method5660(var49);
                                }
                                if (var9.field3537 && !var38) {
                                    var9.field3537 = false;
                                    if (var9.field3517 != null) {
                                        class81 var50 = new class81();
                                        var50.field1043 = true;
                                        var50.field1044 = var9;
                                        var50.field1045 = class33.field232 - var11;
                                        var50.field1048 = class33.field231 - var12;
                                        var50.field1046 = var9.field3517;
                                        field627.method5660(var50);
                                    }
                                }
                                if (var9.field3377 != null) {
                                    class81 var51 = new class81();
                                    var51.field1044 = var9;
                                    var51.field1046 = var9.field3377;
                                    field710.method5660(var51);
                                }
                                if (var9.field3499 != null && field558 > var9.field3540) {
                                    if (var9.field3500 == null || field558 - var9.field3540 > 32) {
                                        class81 var56 = new class81();
                                        var56.field1044 = var9;
                                        var56.field1046 = var9.field3499;
                                        field678.method5660(var56);
                                    } else {
                                        label650: for (int var52 = var9.field3540; var52 < field558; var52++) {
                                            int var53 = field692[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field3500.length; var54++) {
                                                if (var9.field3500[var54] == var53) {
                                                    class81 var55 = new class81();
                                                    var55.field1044 = var9;
                                                    var55.field1046 = var9.field3499;
                                                    field678.method5660(var55);
                                                    break label650;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3540 = field558;
                                }
                                if (var9.field3501 != null && field695 > var9.field3541) {
                                    if (var9.field3530 == null || field695 - var9.field3541 > 32) {
                                        class81 var61 = new class81();
                                        var61.field1044 = var9;
                                        var61.field1046 = var9.field3501;
                                        field678.method5660(var61);
                                    } else {
                                        label626: for (int var57 = var9.field3541; var57 < field695; var57++) {
                                            int var58 = field694[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field3530.length; var59++) {
                                                if (var9.field3530[var59] == var58) {
                                                    class81 var60 = new class81();
                                                    var60.field1044 = var9;
                                                    var60.field1046 = var9.field3501;
                                                    field678.method5660(var60);
                                                    break label626;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3541 = field695;
                                }
                                if (var9.field3444 != null && field697 > var9.field3542) {
                                    if (var9.field3504 == null || field697 - var9.field3542 > 32) {
                                        class81 var66 = new class81();
                                        var66.field1044 = var9;
                                        var66.field1046 = var9.field3444;
                                        field678.method5660(var66);
                                    } else {
                                        label602: for (int var62 = var9.field3542; var62 < field697; var62++) {
                                            int var63 = field696[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field3504.length; var64++) {
                                                if (var9.field3504[var64] == var63) {
                                                    class81 var65 = new class81();
                                                    var65.field1044 = var9;
                                                    var65.field1046 = var9.field3444;
                                                    field678.method5660(var65);
                                                    break label602;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3542 = field697;
                                }
                                if (field700 > var9.field3539 && var9.field3509 != null) {
                                    class81 var67 = new class81();
                                    var67.field1044 = var9;
                                    var67.field1046 = var9.field3509;
                                    field678.method5660(var67);
                                }
                                if (field701 > var9.field3539 && var9.field3515 != null) {
                                    class81 var68 = new class81();
                                    var68.field1044 = var9;
                                    var68.field1046 = var9.field3515;
                                    field678.method5660(var68);
                                }
                                if (field702 > var9.field3539 && var9.field3514 != null) {
                                    class81 var69 = new class81();
                                    var69.field1044 = var9;
                                    var69.field1046 = var9.field3514;
                                    field678.method5660(var69);
                                }
                                if (field703 > var9.field3539 && var9.field3527 != null) {
                                    class81 var70 = new class81();
                                    var70.field1044 = var9;
                                    var70.field1046 = var9.field3527;
                                    field678.method5660(var70);
                                }
                                if (field746 > var9.field3539 && var9.field3432 != null) {
                                    class81 var71 = new class81();
                                    var71.field1044 = var9;
                                    var71.field1046 = var9.field3432;
                                    field678.method5660(var71);
                                }
                                if (field705 > var9.field3539 && var9.field3521 != null) {
                                    class81 var72 = new class81();
                                    var72.field1044 = var9;
                                    var72.field1046 = var9.field3521;
                                    field678.method5660(var72);
                                }
                                if (field706 > var9.field3539 && var9.field3453 != null) {
                                    class81 var73 = new class81();
                                    var73.field1044 = var9;
                                    var73.field1046 = var9.field3453;
                                    field678.method5660(var73);
                                }
                                if (field707 > var9.field3539 && var9.field3431 != null) {
                                    class81 var74 = new class81();
                                    var74.field1044 = var9;
                                    var74.field1046 = var9.field3431;
                                    field678.method5660(var74);
                                }
                                var9.field3539 = field691;
                                if (var9.field3510 != null) {
                                    for (int var75 = 0; var75 < field530; var75++) {
                                        class81 var76 = new class81();
                                        var76.field1044 = var9;
                                        var76.field1049 = field750[var75];
                                        var76.field1050 = field732[var75];
                                        var76.field1046 = var9.field3510;
                                        field678.method5660(var76);
                                    }
                                }
                                if (var9.field3529 != null) {
                                    int[] var77 = class24.method3300();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class81 var79 = new class81();
                                        var79.field1044 = var9;
                                        var79.field1049 = var77[var78];
                                        var79.field1046 = var9.field3529;
                                        field678.method5660(var79);
                                    }
                                }
                                if (var9.field3512 != null) {
                                    int[] var80 = class24.method4801();
                                    for (int var81 = 0; var81 < var80.length; var81++) {
                                        class81 var82 = new class81();
                                        var82.field1044 = var9;
                                        var82.field1049 = var80[var81];
                                        var82.field1046 = var9.field3512;
                                        field678.method5660(var82);
                                    }
                                }
                            }
                        }
                        if (!var9.field3488) {
                            if (field601 != null || Statics.field4353 != null || field641) {
                                continue;
                            }
                            if ((var9.field3401 >= 0 || var9.field3422 != 0) && class33.field232 >= var13 && class33.field231 >= var14 && class33.field232 < var15 && class33.field231 < var16) {
                                if (var9.field3401 >= 0) {
                                    Statics.field1700 = arg0[var9.field3401];
                                } else {
                                    Statics.field1700 = var9;
                                }
                            }
                            if (var9.field3397 == 8 && class33.field232 >= var13 && class33.field231 >= var14 && class33.field232 < var15 && class33.field231 < var16) {
                                Statics.field4106 = var9;
                            }
                            if (var9.field3419 > var9.field3411) {
                                method104(var9, var9.field3410 + var11, var12, var9.field3411, var9.field3419, class33.field232, class33.field231);
                            }
                        }
                        if (var9.field3397 == 0) {
                            method264(arg0, var9.field3395, var13, var14, var15, var16, var11 - var9.field3378, var12 - var9.field3417);
                            if (var9.field3503 != null) {
                                method264(var9.field3503, var9.field3395, var13, var14, var15, var16, var11 - var9.field3378, var12 - var9.field3417);
                            }
                            class80 var83 = (class80) field667.method6941((long) var9.field3395);
                            if (var83 != null) {
                                if (var83.field1036 == 0 && class33.field232 >= var13 && class33.field231 >= var14 && class33.field232 < var15 && class33.field231 < var16 && !field641) {
                                    for (class81 var84 = (class81) field678.method5647(); var84 != null; var84 = (class81) field678.method5649()) {
                                        if (var84.field1043) {
                                            var84.method6657();
                                            var84.field1044.field3537 = false;
                                        }
                                    }
                                    if (Statics.field2929 == 0) {
                                        field601 = null;
                                        field777 = null;
                                    }
                                    if (!field641) {
                                        method3566();
                                    }
                                }
                                method4795(var83.field1038, var13, var14, var15, var16, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("do.ke(II)Z")
    public static boolean method2676(int arg0) {
        for (int var1 = 0; var1 < field530; var1++) {
            if (field750[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("l.kd(III)V")
    public static final void method269(int arg0, int arg1) {
        if (class296.method3567(arg0)) {
            method5334(Statics.field3331[arg0], arg1);
        }
    }

    @ObfuscatedName("kg.kw([Lkw;II)V")
    public static final void method5334(class296[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class296 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3397 == 0) {
                    if (var3.field3503 != null) {
                        method5334(var3.field3503, arg1);
                    }
                    class80 var4 = (class80) field667.method6941((long) var3.field3395);
                    if (var4 != null) {
                        method269(var4.field1038, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3519 != null) {
                    class81 var5 = new class81();
                    var5.field1044 = var3;
                    var5.field1046 = var3.field3519;
                    class64.method5903(var5);
                }
                if (arg1 == 1 && var3.field3451 != null) {
                    if (var3.field3415 >= 0) {
                        class296 var6 = class296.method3318(var3.field3395);
                        if (var6 == null || var6.field3503 == null || var3.field3415 >= var6.field3503.length || var6.field3503[var3.field3415] != var3) {
                            continue;
                        }
                    }
                    class81 var7 = new class81();
                    var7.field1044 = var3;
                    var7.field1046 = var3.field3451;
                    class64.method5903(var7);
                }
            }
        }
    }

    @ObfuscatedName("jv.km(Lkw;IIB)V")
    public static final void method5089(class296 arg0, int arg1, int arg2) {
        if (field601 != null || field641 || arg0 == null) {
            return;
        }
        class296 var3 = method3415(arg0);
        if (var3 == null) {
            var3 = arg0.field3481;
        }
        if (var3 == null) {
            return;
        }
        field601 = arg0;
        class296 var5 = method3415(arg0);
        if (var5 == null) {
            var5 = arg0.field3481;
        }
        field777 = var5;
        field510 = arg1;
        field682 = arg2;
        Statics.field2929 = 0;
        field770 = false;
        int var7 = method3087();
        if (var7 != -1) {
            Statics.field1689 = new class67();
            Statics.field1689.field878 = field643[var7];
            Statics.field1689.field876 = field735[var7];
            Statics.field1689.field879 = field645[var7];
            Statics.field1689.field877 = field646[var7];
            Statics.field1689.field881 = field616[var7];
            Statics.field1689.field880 = field731[var7];
            Statics.field1689.field884 = field502[var7];
        }
        return;
    }

    @ObfuscatedName("client.kh(B)V")
    public final void method1137() {
        method6648(field601);
        Statics.field2929++;
        if (field687 && field684) {
            int var1 = class33.field232;
            int var2 = class33.field231;
            int var3 = var1 - field510;
            int var4 = var2 - field682;
            if (var3 < field784) {
                var3 = field784;
            }
            if (field601.field3410 + var3 > field784 + field777.field3410) {
                var3 = field784 + field777.field3410 - field601.field3410;
            }
            if (var4 < field745) {
                var4 = field745;
            }
            if (field601.field3411 + var4 > field745 + field777.field3411) {
                var4 = field745 + field777.field3411 - field601.field3411;
            }
            int var5 = var3 - field688;
            int var6 = var4 - field689;
            int var7 = field601.field3532;
            if (Statics.field2929 > field601.field3483 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field770 = true;
            }
            int var8 = field777.field3378 + (var3 - field784);
            int var9 = field777.field3417 + (var4 - field745);
            if (field601.field3495 != null && field770) {
                class81 var10 = new class81();
                var10.field1044 = field601;
                var10.field1045 = var8;
                var10.field1048 = var9;
                var10.field1046 = field601.field3495;
                class64.method5903(var10);
            }
            if (class33.field229 == 0) {
                if (field770) {
                    if (field601.field3496 != null) {
                        class81 var11 = new class81();
                        var11.field1044 = field601;
                        var11.field1045 = var8;
                        var11.field1048 = var9;
                        var11.field1051 = field683;
                        var11.field1046 = field601.field3496;
                        class64.method5903(var11);
                    }
                    if (field683 != null && method3415(field601) != null) {
                        class266 var12 = Statics.method2786(class264.field2951, field552.field1342);
                        var12.field3064.method7348(field601.field3415);
                        var12.field3064.method7234(field683.field3454);
                        var12.field3064.method7348(field601.field3454);
                        var12.field3064.method7244(field683.field3395);
                        var12.field3064.method7234(field683.field3415);
                        var12.field3064.method7244(field601.field3395);
                        field552.method2534(var12);
                    }
                } else if (this.method1263()) {
                    this.method1582(field688 + field510, field689 + field682);
                } else if (field642 > 0) {
                    method3299(field688 + field510, field689 + field682);
                }
                field601 = null;
            }
        } else if (Statics.field2929 > 1) {
            if (!field770 && field642 > 0) {
                method3299(field688 + field510, field689 + field682);
            }
            field601 = null;
        }
    }

    @ObfuscatedName("fs.kc(IIB)V")
    public static void method3299(int arg0, int arg1) {
        method1693(Statics.field1689, arg0, arg1);
        Statics.field1689 = null;
    }

    @ObfuscatedName("oj.kr(Lkw;I)V")
    public static void method6648(class296 arg0) {
        if (arg0 != null && field714 == arg0.field3544) {
            field715[arg0.field3474] = true;
        }
    }

    @ObfuscatedName("aa.kq(B)V")
    public static void method641() {
        for (class80 var0 = (class80) field667.method6943(); var0 != null; var0 = (class80) field667.method6944()) {
            int var1 = var0.field1038;
            if (class296.method3567(var1)) {
                boolean var2 = true;
                class296[] var3 = Statics.field3331[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3488;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4504;
                    class296 var6 = class296.method3318(var5);
                    if (var6 != null) {
                        method6648(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("an.ka(II)V")
    public static final void method622(int arg0) {
        if (!class296.method3567(arg0)) {
            return;
        }
        class296[] var1 = Statics.field3331[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class296 var3 = var1[var2];
            if (var3 != null) {
                var3.field3497 = 0;
                var3.field3535 = 0;
            }
        }
    }

    @ObfuscatedName("jp.kp(IB)V")
    public static final void method4799(int arg0) {
        if (class296.method3567(arg0)) {
            method3757(Statics.field3331[arg0], -1);
        }
    }

    @ObfuscatedName("gf.ku([Lkw;II)V")
    public static final void method3757(class296[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class296 var3 = arg0[var2];
            if (var3 != null && var3.field3441 == arg1 && (!var3.field3488 || !method111(var3))) {
                if (var3.field3397 == 0) {
                    if (!var3.field3488 && method111(var3) && Statics.field1700 != var3) {
                        continue;
                    }
                    method3757(arg0, var3.field3395);
                    if (var3.field3503 != null) {
                        method3757(var3.field3503, var3.field3395);
                    }
                    class80 var4 = (class80) field667.method6941((long) var3.field3395);
                    if (var4 != null) {
                        method4799(var4.field1038);
                    }
                }
                if (var3.field3397 == 6) {
                    if (var3.field3443 != -1 || var3.field3533 != -1) {
                        boolean var5 = method4802(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3533;
                        } else {
                            var6 = var3.field3443;
                        }
                        if (var6 != -1) {
                            class191 var7 = class191.method22(var6);
                            if (var7.method3578()) {
                                var3.field3497 += field744;
                                int var8 = var7.method3583();
                                if (var3.field3497 >= var8) {
                                    var3.field3497 -= var7.field2209;
                                    if (var3.field3497 < 0 || var3.field3497 >= var8) {
                                        var3.field3497 = 0;
                                    }
                                }
                                method6648(var3);
                            } else {
                                var3.field3535 += field744;
                                while (var3.field3535 > var7.field2221[var3.field3497]) {
                                    var3.field3535 -= var7.field2221[var3.field3497];
                                    var3.field3497++;
                                    if (var3.field3497 >= var7.field2205.length) {
                                        var3.field3497 -= var7.field2209;
                                        if (var3.field3497 < 0 || var3.field3497 >= var7.field2205.length) {
                                            var3.field3497 = 0;
                                        }
                                    }
                                    method6648(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3452 != 0 && !var3.field3488) {
                        int var9 = var3.field3452 >> 16;
                        int var10 = var3.field3452 << 16 >> 16;
                        int var11 = field744 * var9;
                        int var12 = field744 * var10;
                        var3.field3513 = var3.field3513 + var11 & 0x7FF;
                        var3.field3516 = var3.field3516 + var12 & 0x7FF;
                        method6648(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bz.kg(IB)V")
    public static final void method1107(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method2830((double) var3);
    }

    @ObfuscatedName("da.kl(I)I")
    public static final int method2627() {
        float var0 = 200.0F * ((float) Statics.field1108.method2279() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("dc.kn(D)V")
    public static final void method2830(double arg0) {
        class202.method3764(arg0);
        ((class210) Statics.field2393).method4102(arg0);
        class189.method2152();
        Statics.field1108.method2291(arg0);
    }

    @ObfuscatedName("co.kt(II)V")
    public static final void method2402(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field1108.method2294()) {
            return;
        }
        if (Statics.field1108.method2294() == 0 && field681 != -1) {
            class275.method1097(Statics.field77, field681, 0, var1, false);
            field652 = false;
        } else if (var1 == 0) {
            class275.method261();
            field652 = false;
        } else if (class275.field3228 == 0) {
            Statics.field1623.method4870(var1);
        } else {
            Statics.field3197 = var1;
        }
        Statics.field1108.method2341(var1);
    }

    @ObfuscatedName("eq.kf(II)V")
    public static final void method2990(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1108.method2295(var1);
    }

    @ObfuscatedName("jw.ks(II)V")
    public static final void method4805(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1108.method2297(var1);
    }

    @ObfuscatedName("jt.ky(II)V")
    public static final void method4827(int arg0) {
        method641();
        class63.method2414();
        int var1 = class171.method2780(arg0).field1843;
        if (var1 == 0) {
            return;
        }
        int var2 = class290.field3346[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method2830(0.9D);
            }
            if (var2 == 2) {
                method2830(0.8D);
            }
            if (var2 == 3) {
                method2830(0.7D);
            }
            if (var2 == 4) {
                method2830(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method2402(255);
            }
            if (var2 == 1) {
                method2402(192);
            }
            if (var2 == 2) {
                method2402(128);
            }
            if (var2 == 3) {
                method2402(64);
            }
            if (var2 == 4) {
                method2402(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method2990(127);
            }
            if (var2 == 1) {
                method2990(96);
            }
            if (var2 == 2) {
                method2990(64);
            }
            if (var2 == 3) {
                method2990(32);
            }
            if (var2 == 4) {
                method2990(0);
            }
        }
        if (var1 == 5) {
            field521 = var2 == 1;
        }
        if (var1 == 6) {
            field670 = var2;
        }
        if (var1 == 9) {
            field566 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method4805(127);
            }
            if (var2 == 1) {
                method4805(96);
            }
            if (var2 == 2) {
                method4805(64);
            }
            if (var2 == 3) {
                method4805(32);
            }
            if (var2 == 4) {
                method4805(0);
            }
        }
        if (var1 == 17) {
            field676 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field519 = (class95) class331.method5118(class95.method6905(), var2);
            if (field519 == null) {
                field519 = class95.field1278;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field632 = -1;
            } else {
                field632 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field520 = (class95) class331.method5118(class95.method6905(), var2);
            if (field520 == null) {
                field520 = class95.field1278;
            }
        }
    }

    @ObfuscatedName("bi.kj(Lkw;B)V")
    public static final void method1067(class296 arg0) {
        int var1 = arg0.field3399;
        if (var1 == 324) {
            if (field567 == -1) {
                field567 = arg0.field3430;
                field716 = arg0.field3403;
            }
            if (field774.field3362) {
                arg0.field3430 = field567;
            } else {
                arg0.field3430 = field716;
            }
        } else if (var1 == 325) {
            if (field567 == -1) {
                field567 = arg0.field3430;
                field716 = arg0.field3403;
            }
            if (field774.field3362) {
                arg0.field3430 = field716;
            } else {
                arg0.field3430 = field567;
            }
        } else if (var1 == 327) {
            arg0.field3513 = 150;
            arg0.field3516 = (int) (Math.sin((double) field504 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3439 = 5;
            arg0.field3440 = 0;
        } else if (var1 == 328) {
            arg0.field3513 = 150;
            arg0.field3516 = (int) (Math.sin((double) field504 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3439 = 5;
            arg0.field3440 = 1;
        }
    }

    @ObfuscatedName("y.ln(B)V")
    public static final void method312() {
        class266 var0 = Statics.method2786(class264.field2954, field552.field1342);
        field552.method2534(var0);
        class64.field834 = true;
        for (class80 var1 = (class80) field667.method6943(); var1 != null; var1 = (class80) field667.method6944()) {
            if (var1.field1036 == 0 || var1.field1036 == 3) {
                method2789(var1, true);
            }
        }
        if (field628 != null) {
            method6648(field628);
            field628 = null;
        }
        class64.field834 = false;
    }

    @ObfuscatedName("ek.ll(IIIB)Lcv;")
    public static final class80 method2860(int arg0, int arg1, int arg2) {
        class80 var3 = new class80();
        var3.field1038 = arg1;
        var3.field1036 = arg2;
        field667.method6948(var3, (long) arg0);
        method622(arg1);
        class296 var4 = class296.method3318(arg0);
        method6648(var4);
        if (field628 != null) {
            method6648(field628);
            field628 = null;
        }
        method3379(Statics.field3331[arg0 >> 16], var4, false);
        class64.method112(arg1);
        if (field666 != -1) {
            method269(field666, 1);
        }
        return var3;
    }

    @ObfuscatedName("dt.lb(Lcv;ZB)V")
    public static final void method2789(class80 arg0, boolean arg1) {
        int var2 = arg0.field1038;
        int var3 = (int) arg0.field4504;
        arg0.method6657();
        if (arg1) {
            class296.method4336(var2);
        }
        method1761(var2);
        class296 var4 = class296.method3318(var3);
        if (var4 != null) {
            method6648(var4);
        }
        if (field666 != -1) {
            method269(field666, 1);
        }
    }

    @ObfuscatedName("aj.lx(Lkw;B)Z")
    public static final boolean method790(class296 arg0) {
        int var1 = arg0.field3399;
        if (var1 == 205) {
            field553 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field774.method5150(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field774.method5151(var4, var5 == 1);
        }
        if (var1 == 324) {
            field774.method5172(false);
        }
        if (var1 == 325) {
            field774.method5172(true);
        }
        if (var1 == 326) {
            class266 var6 = Statics.method2786(class264.field3025, field552.field1342);
            field774.method5154(var6.field3064);
            field552.method2534(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.lv(Lkw;IIII)V")
    public static final void method303(class296 arg0, int arg1, int arg2, int arg3) {
        method183();
        class289 var4 = arg0.method5203(false);
        if (var4 == null) {
            return;
        }
        class454.method7487(arg1, arg2, var4.field3340 + arg1, var4.field3341 + arg2);
        if (field723 == 2 || field723 == 5) {
            class454.method7507(arg1, arg2, 0, var4.field3343, var4.field3342);
        } else {
            int var5 = field574 & 0x7FF;
            int var6 = Statics.field890.field1185 / 32 + 48;
            int var7 = 464 - Statics.field890.field1129 / 32;
            Statics.field61.method7621(arg1, arg2, var4.field3340, var4.field3341, var6, var7, var5, 256, var4.field3343, var4.field3342);
            for (int var8 = 0; var8 < field738; var8++) {
                int var9 = field739[var8] * 4 + 2 - Statics.field890.field1185 / 32;
                int var10 = field779[var8] * 4 + 2 - Statics.field890.field1129 / 32;
                method2955(arg1, arg2, var9, var10, field741[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class336 var13 = field680[Statics.field1013][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field890.field1185 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field890.field1129 / 32;
                        method2955(arg1, arg2, var14, var15, Statics.field3551[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field690; var16++) {
                class92 var17 = field547[field514[var16]];
                if (var17 != null && var17.method2182()) {
                    class179 var18 = var17.field1254;
                    if (var18 != null && var18.field1967 != null) {
                        var18 = var18.method3298();
                    }
                    if (var18 != null && var18.field1958 && var18.field1937) {
                        int var19 = var17.field1185 / 32 - Statics.field890.field1185 / 32;
                        int var20 = var17.field1129 / 32 - Statics.field890.field1129 / 32;
                        method2955(arg1, arg2, var19, var20, Statics.field3551[1], var4);
                    }
                }
            }
            int var21 = class97.field1305;
            int[] var22 = class97.field1290;
            for (int var23 = 0; var23 < var21; var23++) {
                class85 var24 = field620[var22[var23]];
                if (var24 != null && var24.method2182() && !var24.field1105 && Statics.field890 != var24) {
                    int var25 = var24.field1185 / 32 - Statics.field890.field1185 / 32;
                    int var26 = var24.field1129 / 32 - Statics.field890.field1129 / 32;
                    if (var24.method2204()) {
                        method2955(arg1, arg2, var25, var26, Statics.field3551[3], var4);
                    } else if (Statics.field890.field1093 != 0 && var24.field1093 != 0 && Statics.field890.field1093 == var24.field1093) {
                        method2955(arg1, arg2, var25, var26, Statics.field3551[4], var4);
                    } else if (var24.method2195()) {
                        method2955(arg1, arg2, var25, var26, Statics.field3551[5], var4);
                    } else if (var24.method2177()) {
                        method2955(arg1, arg2, var25, var26, Statics.field3551[6], var4);
                    } else {
                        method2955(arg1, arg2, var25, var26, Statics.field3551[2], var4);
                    }
                }
            }
            if (field511 != 0 && field504 % 20 < 10) {
                if (field511 == 1 && field512 >= 0 && field512 < field547.length) {
                    class92 var27 = field547[field512];
                    if (var27 != null) {
                        int var28 = var27.field1185 / 32 - Statics.field890.field1185 / 32;
                        int var29 = var27.field1129 / 32 - Statics.field890.field1129 / 32;
                        method2593(arg1, arg2, var28, var29, Statics.field1322[1], var4);
                    }
                }
                if (field511 == 2) {
                    int var30 = field542 * 4 - Statics.field1560 * 4 + 2 - Statics.field890.field1185 / 32;
                    int var31 = field515 * 4 - Statics.field2784 * 4 + 2 - Statics.field890.field1129 / 32;
                    method2593(arg1, arg2, var30, var31, Statics.field1322[1], var4);
                }
                if (field511 == 10 && field513 >= 0 && field513 < field620.length) {
                    class85 var32 = field620[field513];
                    if (var32 != null) {
                        int var33 = var32.field1185 / 32 - Statics.field890.field1185 / 32;
                        int var34 = var32.field1129 / 32 - Statics.field890.field1129 / 32;
                        method2593(arg1, arg2, var33, var34, Statics.field1322[1], var4);
                    }
                }
            }
            if (field742 != 0) {
                int var35 = field742 * 4 + 2 - Statics.field890.field1185 / 32;
                int var36 = field743 * 4 + 2 - Statics.field890.field1129 / 32;
                method2955(arg1, arg2, var35, var36, Statics.field1322[0], var4);
            }
            if (!Statics.field890.field1105) {
                class454.method7518(var4.field3340 / 2 + arg1 - 1, var4.field3341 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field557[arg3] = true;
    }

    @ObfuscatedName("y.lh(Lkw;IIIB)V")
    public static final void method305(class296 arg0, int arg1, int arg2, int arg3) {
        class289 var4 = arg0.method5203(false);
        if (var4 == null) {
            return;
        }
        if (field723 < 3) {
            Statics.field81.method7621(arg1, arg2, var4.field3340, var4.field3341, 25, 25, field574, 256, var4.field3343, var4.field3342);
        } else {
            class454.method7507(arg1, arg2, 0, var4.field3343, var4.field3342);
        }
    }

    @ObfuscatedName("cm.lg(IIIILqi;Lko;I)V")
    public static final void method2593(int arg0, int arg1, int arg2, int arg3, class458 arg4, class289 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2955(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field574 & 0x7FF;
        int var8 = class202.field2396[var7];
        int var9 = class202.field2381[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3340 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field859.method7622(arg5.field3340 / 2 + arg0 - var17 / 2 + var15, arg5.field3341 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("em.lo(IIIILqi;Lko;I)V")
    public static final void method2955(int arg0, int arg1, int arg2, int arg3, class458 arg4, class289 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field574 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class202.field2396[var6];
        int var9 = class202.field2381[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method7620(arg5.field3340 / 2 + var10 - arg4.field4824 / 2, arg5.field3341 / 2 - var11 - arg4.field4830 / 2, arg0, arg1, arg5.field3340, arg5.field3341, arg5.field3343, arg5.field3342);
        } else {
            arg4.method7604(arg5.field3340 / 2 + arg0 + var10 - arg4.field4824 / 2, arg5.field3341 / 2 + arg1 - var11 - arg4.field4830 / 2);
        }
    }

    @ObfuscatedName("bd.lf(S)V")
    public static final void method1922() {
        for (int var0 = 0; var0 < class97.field1305; var0++) {
            class85 var1 = field620[class97.field1290[var0]];
            var1.method2170();
        }
        Iterator var2 = class100.field1333.iterator();
        while (var2.hasNext()) {
            class58 var3 = (class58) var2.next();
            var3.method1074();
        }
        if (Statics.field1679 != null) {
            Statics.field1679.method6173();
        }
    }

    @ObfuscatedName("ns.ls(B)V")
    public static final void method6152() {
        class100.method2379();
        if (Statics.field1679 != null) {
            Statics.field1679.method6180();
        }
    }

    @ObfuscatedName("hl.li(I)V")
    public static final void method4607() {
        for (int var0 = 0; var0 < class97.field1305; var0++) {
            class85 var1 = field620[class97.field1290[var0]];
            var1.method2176();
        }
    }

    @ObfuscatedName("ik.lw(I)V")
    public static final void method4656() {
        field701 = field691;
    }

    @ObfuscatedName("mj.la(B)V")
    public static final void method6081() {
        field702 = field691;
        Statics.field1662 = true;
    }

    @ObfuscatedName("dp.lr(S)V")
    public static final void method2642() {
        field703 = field691;
        Statics.field965 = true;
    }

    @ObfuscatedName("x.lt(Ljava/lang/String;B)V")
    public static final void method84(String arg0) {
        if (Statics.field1679 != null) {
            class266 var1 = Statics.method2786(class264.field3003, field552.field1342);
            var1.field3064.method7179(class445.method6110(arg0));
            var1.field3064.method7186(arg0);
            field552.method2534(var1);
        }
    }

    @ObfuscatedName("kf.lm(Ljava/lang/String;I)V")
    public static final void method5345(String arg0) {
        if (!arg0.equals("")) {
            class266 var1 = Statics.method2786(class264.field2949, field552.field1342);
            var1.field3064.method7179(class445.method6110(arg0));
            var1.field3064.method7186(arg0);
            field552.method2534(var1);
        }
    }

    @ObfuscatedName("et.le(I)V")
    public static final void method2965() {
        class266 var0 = Statics.method2786(class264.field2949, field552.field1342);
        var0.field3064.method7179(0);
        field552.method2534(var0);
    }

    @ObfuscatedName("g.lk(III)V")
    public static final void method297(int arg0, int arg1) {
        if (field769[arg0] == null || arg1 < 0 || arg1 >= field769[arg0].method2969()) {
            return;
        }
        class132 var2 = (class132) field769[arg0].field1704.get(arg1);
        if (var2.field1575 != -1) {
            return;
        }
        class266 var3 = Statics.method2786(class264.field2956, field552.field1342);
        var3.field3064.method7179(3 + class445.method6110(var2.field1572.method7774()));
        var3.field3064.method7179(arg0);
        var3.field3064.method7286(arg1);
        var3.field3064.method7186(var2.field1572.method7774());
        field552.method2534(var3);
    }

    @ObfuscatedName("hw.lj(IIZI)V")
    public static final void method4266(int arg0, int arg1, boolean arg2) {
        if (field769[arg0] == null || arg1 < 0 || arg1 >= field769[arg0].method2969()) {
            return;
        }
        class132 var3 = (class132) field769[arg0].field1704.get(arg1);
        class266 var4 = Statics.method2786(class264.field3016, field552.field1342);
        var4.field3064.method7179(4 + class445.method6110(var3.field1572.method7774()));
        var4.field3064.method7179(arg0);
        var4.field3064.method7286(arg1);
        var4.field3064.method7178(arg2);
        var4.field3064.method7186(var3.field1572.method7774());
        field552.method2534(var4);
    }

    @ObfuscatedName("bp.lu(II)V")
    public static void method1761(int arg0) {
        for (class411 var1 = (class411) field724.method6943(); var1 != null; var1 = (class411) field724.method6944()) {
            if ((var1.field4504 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method6657();
            }
        }
    }

    @ObfuscatedName("ci.ld(Lkw;I)I")
    public static int method2462(class296 arg0) {
        class411 var1 = (class411) field724.method6941(((long) arg0.field3395 << 32) + (long) arg0.field3415);
        return var1 == null ? arg0.field3473 : var1.field4503;
    }

    @ObfuscatedName("gx.ly(Lkw;B)Lkw;")
    public static class296 method3415(class296 arg0) {
        int var1 = class297.method4617(method2462(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class296.method3318(arg0.field3441);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("v.lc(Lkw;I)Z")
    public static boolean method111(class296 arg0) {
        return arg0.field3382;
    }

    @ObfuscatedName("bx.lp(Lkw;B)Ljava/lang/String;")
    public static String method1945(class296 arg0) {
        if (class297.method813(method2462(arg0)) == 0) {
            return null;
        } else if (arg0.field3485 == null || arg0.field3485.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3485;
        }
    }

    @ObfuscatedName("bq.lz(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2110(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field495 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field495 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field495 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field495 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field495 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1280 != null) {
            var3 = "/p=" + Statics.field1280;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3203 + "/a=" + Statics.field1394 + var3 + "/";
    }

    @ObfuscatedName("ii.mx(Ljava/lang/String;I)V")
    public static void method4661(String arg0) {
        Statics.field1280 = arg0;
        try {
            String var1 = Statics.field4326.getParameter(Integer.toString(18));
            String var2 = Statics.field4326.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class286.method6163(class271.method5624() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field4326;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("kg.md(Ljava/lang/String;ZI)V")
    public static void method5337(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2174; var5++) {
            class189 var6 = class189.method2643(var5);
            if ((!arg1 || var6.field2162) && var6.field2166 == -1 && var6.field2139.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1372 = -1;
                    Statics.field3325 = null;
                    return;
                }
                if (var4 >= var3.length) {
                    short[] var7 = new short[var3.length * 2];
                    for (int var8 = 0; var8 < var4; var8++) {
                        var7[var8] = var3[var8];
                    }
                    var3 = var7;
                }
                var3[var4++] = (short) var5;
            }
        }
        Statics.field3325 = var3;
        Statics.field219 = 0;
        Statics.field1372 = var4;
        String[] var9 = new String[Statics.field1372];
        for (int var10 = 0; var10 < Statics.field1372; var10++) {
            var9[var10] = class189.method2643(var3[var10]).field2139;
        }
        class442.method4601(var9, Statics.field3325);
    }

    @ObfuscatedName("hg.mt(Lqq;II)V")
    public static void method4585(class445 arg0, int arg1) {
        byte[] var2 = arg0.field4733;
        if (field546 == null) {
            field546 = new byte[24];
        }
        class353.method6032(var2, arg1, field546, 0, 24);
        class159.method1103(arg0, arg1);
    }

    @ObfuscatedName("client.ml(B)Lqo;")
    public class466 method1538() {
        return Statics.field890 == null ? null : Statics.field890.field1109;
    }

    @ObfuscatedName("ig.mz(IIIZI)V")
    public static void method4644(int arg0, int arg1, int arg2, boolean arg3) {
        class266 var4 = Statics.method2786(class264.field3009, field552.field1342);
        var4.field3064.method7225(arg2);
        var4.field3064.method7286(arg1);
        var4.field3064.method7244(arg3 ? field755 : 0);
        var4.field3064.method7234(arg0);
        field552.method2534(var4);
    }

    @ObfuscatedName("bg.mo(I)Z")
    public static boolean method1024() {
        return field675 >= 2;
    }

    @ObfuscatedName("bf.mi(II)V")
    public static void method2005(int arg0) {
        field579 = arg0;
    }

    @ObfuscatedName("pc.ma(B)V")
    public static void method6906() {
        field552.method2534(Statics.method2786(class264.field2944, field552.field1342));
        field579 = 0;
    }

    @ObfuscatedName("u.mp(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method189(String arg0) {
        class312[] var1 = class312.method7090();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class312 var3 = var1[var2];
            if (var3.field4002 != -1 && arg0.startsWith(class93.method2016(var3.field4002))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4002).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("mi.mh(B)Z")
    public static boolean method5880() {
        return Statics.field1108.method2301() >= field498;
    }

    @ObfuscatedName("eu.mv(II)V")
    public static void method2946(int arg0) {
        if (field525 != arg0) {
            field525 = arg0;
        }
    }

    @ObfuscatedName("gz.mf(I)Z")
    public static boolean method3445() {
        return field601 != null;
    }

    @ObfuscatedName("h.mc(ZI)V")
    public static void method158(boolean arg0) {
        field521 = arg0;
    }

    @ObfuscatedName("fo.mm(II)Lpb;")
    public static class439 method3166(int arg0) {
        class439 var1 = (class439) field540.method4789((long) arg0);
        if (var1 == null) {
            var1 = new class439(Statics.field309, class441.method6969(arg0), class441.method3090(arg0));
            field540.method4781(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("bg.mj(IB)Lpb;")
    public static class439 method1036(int arg0) {
        class439 var1 = (class439) field780.method4789((long) arg0);
        if (var1 == null) {
            var1 = new class439(Statics.field309, arg0);
        }
        return var1;
    }
}

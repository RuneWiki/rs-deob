package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class443, OAuthApi, class326 {

    @ObfuscatedName("client.bz")
    public static boolean field765 = true;

    @ObfuscatedName("client.bo")
    public static int field499 = 1;

    @ObfuscatedName("client.cg")
    public static int field500 = 0;

    @ObfuscatedName("client.ci")
    public static int field638 = 0;

    @ObfuscatedName("client.cp")
    public static boolean field680 = false;

    @ObfuscatedName("client.cq")
    public static boolean field503 = false;

    @ObfuscatedName("client.cu")
    public static int field504 = -1;

    @ObfuscatedName("client.co")
    public static int field536 = -1;

    @ObfuscatedName("client.cy")
    public static int field668 = -1;

    @ObfuscatedName("client.cn")
    public static boolean field507 = false;

    @ObfuscatedName("client.dd")
    public static int field508 = 0;

    @ObfuscatedName("client.dc")
    public static boolean field545 = false;

    @ObfuscatedName("client.el")
    public static boolean field691 = true;

    @ObfuscatedName("client.et")
    public static int field677 = 0;

    @ObfuscatedName("client.eo")
    public static long field512 = -1L;

    @ObfuscatedName("client.en")
    public static int field513 = -1;

    @ObfuscatedName("client.ev")
    public static int field784 = -1;

    @ObfuscatedName("client.ew")
    public static long field515 = -1L;

    @ObfuscatedName("client.ed")
    public static boolean field516 = true;

    @ObfuscatedName("client.eg")
    public static int field590 = 0;

    @ObfuscatedName("client.em")
    public static int field514 = 0;

    @ObfuscatedName("client.ee")
    public static int field509 = 0;

    @ObfuscatedName("client.er")
    public static int field520 = 0;

    @ObfuscatedName("client.ej")
    public static int field526 = 0;

    @ObfuscatedName("client.ey")
    public static int field614 = 0;

    @ObfuscatedName("client.eh")
    public static int field523 = 0;

    @ObfuscatedName("client.ep")
    public static int field524 = 0;

    @ObfuscatedName("client.eb")
    public static int field525 = 0;

    @ObfuscatedName("client.es")
    public static class104 field798 = class104.field1331;

    @ObfuscatedName("client.eq")
    public static class104 field527 = class104.field1331;

    @ObfuscatedName("client.ex")
    public static boolean field528 = false;

    @ObfuscatedName("client.fb")
    public static class93 field529 = class93.field1140;

    @ObfuscatedName("client.fh")
    public static int field502 = 0;

    @ObfuscatedName("client.fu")
    public static int field531 = 0;

    @ObfuscatedName("client.gl")
    public static int field532 = 0;

    @ObfuscatedName("client.go")
    public static int field533 = 0;

    @ObfuscatedName("client.gv")
    public static int field534 = 0;

    @ObfuscatedName("client.gj")
    public static int field535 = 0;

    @ObfuscatedName("client.gx")
    public static int field746 = 0;

    @ObfuscatedName("client.gb")
    public static class125 field576 = class125.field1472;

    @ObfuscatedName("client.gs")
    public static class536 field627 = class536.field5236;

    @ObfuscatedName("client.hw")
    public String field539;

    @ObfuscatedName("client.hu")
    public class15 field654;

    @ObfuscatedName("client.hd")
    public class19 field541;

    @ObfuscatedName("client.hr")
    public OtlTokenRequester field757;

    @ObfuscatedName("client.hn")
    public Future field543;

    @ObfuscatedName("client.hb")
    public boolean field540 = false;

    @ObfuscatedName("client.ho")
    public int field562 = 0;

    @ObfuscatedName("client.ht")
    public class19 field727;

    @ObfuscatedName("client.he")
    public RefreshAccessTokenRequester field547;

    @ObfuscatedName("client.hv")
    public Future field548;

    @ObfuscatedName("client.hh")
    public static final String field772;

    @ObfuscatedName("client.hq")
    public static final String field506;

    @ObfuscatedName("client.ha")
    public static boolean field551;

    @ObfuscatedName("client.im")
    public static class78 field613;

    @ObfuscatedName("client.iq")
    public class531 field553;

    @ObfuscatedName("client.ic")
    public class8 field696;

    @ObfuscatedName("client.ip")
    public long field592 = -1L;

    @ObfuscatedName("client.io")
    public static byte[] field700;

    @ObfuscatedName("client.il")
    public static class101[] field557;

    @ObfuscatedName("client.ih")
    public static int field558;

    @ObfuscatedName("client.ik")
    public static int[] field559;

    @ObfuscatedName("client.iw")
    public static int field550;

    @ObfuscatedName("client.it")
    public static String field665;

    @ObfuscatedName("client.iu")
    public static int[] field604;

    @ObfuscatedName("client.iv")
    public static final class112 field561;

    @ObfuscatedName("client.in")
    public static int field563;

    @ObfuscatedName("client.ir")
    public static boolean field564;

    @ObfuscatedName("client.if")
    public static class430 field538;

    @ObfuscatedName("client.jc")
    public static HashMap field566;

    @ObfuscatedName("client.jy")
    public static int field567;

    @ObfuscatedName("client.jf")
    public static int field568;

    @ObfuscatedName("client.jx")
    public static int field556;

    @ObfuscatedName("client.jw")
    public static int field570;

    @ObfuscatedName("client.je")
    public static int field569;

    @ObfuscatedName("client.jq")
    public static class228[] field572;

    @ObfuscatedName("client.jk")
    public static boolean field573;

    @ObfuscatedName("client.jd")
    public static int[][][] field574;

    @ObfuscatedName("client.kv")
    public static final int[] field575;

    @ObfuscatedName("client.kz")
    public static int field653;

    @ObfuscatedName("client.km")
    public static int field577;

    @ObfuscatedName("client.kl")
    public static int field578;

    @ObfuscatedName("client.ky")
    public static int field579;

    @ObfuscatedName("client.kt")
    public static int field542;

    @ObfuscatedName("client.kj")
    public static int field581;

    @ObfuscatedName("client.kc")
    public static boolean field582;

    @ObfuscatedName("client.kw")
    public static int field583;

    @ObfuscatedName("client.ln")
    public static int field584;

    @ObfuscatedName("client.lv")
    public static int field580;

    @ObfuscatedName("client.lg")
    public static int field586;

    @ObfuscatedName("client.lu")
    public static int field699;

    @ObfuscatedName("client.ll")
    public static int field588;

    @ObfuscatedName("client.lw")
    public static int field589;

    @ObfuscatedName("client.lj")
    public static int field630;

    @ObfuscatedName("client.lh")
    public static int field641;

    @ObfuscatedName("client.la")
    public static int field624;

    @ObfuscatedName("client.lq")
    public static int field511;

    @ObfuscatedName("client.li")
    public static int field594;

    @ObfuscatedName("client.ls")
    public static int field595;

    @ObfuscatedName("client.lx")
    public static int field596;

    @ObfuscatedName("client.ly")
    public static int field801;

    @ObfuscatedName("client.lc")
    public static boolean field598;

    @ObfuscatedName("client.lo")
    public static int field599;

    @ObfuscatedName("client.lz")
    public static boolean field600;

    @ObfuscatedName("client.lr")
    public static int field601;

    @ObfuscatedName("client.lf")
    public static int field602;

    @ObfuscatedName("client.mh")
    public static int field603;

    @ObfuscatedName("client.mt")
    public static int[] field711;

    @ObfuscatedName("client.md")
    public static int[] field605;

    @ObfuscatedName("client.mi")
    public static int[] field606;

    @ObfuscatedName("client.mo")
    public static int[] field607;

    @ObfuscatedName("client.mg")
    public static int[] field796;

    @ObfuscatedName("client.mx")
    public static int[] field753;

    @ObfuscatedName("client.mw")
    public static int[][] field610;

    @ObfuscatedName("client.mk")
    public static int[] field611;

    @ObfuscatedName("client.my")
    public static String[] field612;

    @ObfuscatedName("client.ms")
    public static int[][] field797;

    @ObfuscatedName("client.mj")
    public static int field681;

    @ObfuscatedName("client.mc")
    public static int field615;

    @ObfuscatedName("client.mb")
    public static int field616;

    @ObfuscatedName("client.mp")
    public static int field617;

    @ObfuscatedName("client.ml")
    public static int field701;

    @ObfuscatedName("client.mr")
    public static int field619;

    @ObfuscatedName("client.mv")
    public static int field620;

    @ObfuscatedName("client.mf")
    public static boolean field544;

    @ObfuscatedName("client.ma")
    public static int field622;

    @ObfuscatedName("client.mz")
    public static boolean field623;

    @ObfuscatedName("client.mm")
    public static class92[] field738;

    @ObfuscatedName("client.mn")
    public static int field625;

    @ObfuscatedName("client.np")
    public static int field519;

    @ObfuscatedName("client.nr")
    public static long field510;

    @ObfuscatedName("client.nh")
    public static long field628;

    @ObfuscatedName("client.nm")
    public static boolean field629;

    @ObfuscatedName("client.nu")
    public static int field537;

    @ObfuscatedName("client.na")
    public static int field709;

    @ObfuscatedName("client.nq")
    public static int[] field626;

    @ObfuscatedName("client.nv")
    public static final int[] field633;

    @ObfuscatedName("client.nc")
    public static String[] field634;

    @ObfuscatedName("client.ne")
    public static boolean[] field635;

    @ObfuscatedName("client.ng")
    public static int[] field636;

    @ObfuscatedName("client.nx")
    public static int field637;

    @ObfuscatedName("client.ny")
    public static class394[][][] field644;

    @ObfuscatedName("client.ni")
    public static class394 field639;

    @ObfuscatedName("client.nf")
    public static class394 field587;

    @ObfuscatedName("client.no")
    public static class394 field782;

    @ObfuscatedName("client.nk")
    public static int[] field642;

    @ObfuscatedName("client.nb")
    public static int[] field518;

    @ObfuscatedName("client.nd")
    public static int[] field745;

    @ObfuscatedName("client.nw")
    public static int[] field645;

    @ObfuscatedName("client.og")
    public static boolean field646;

    @ObfuscatedName("client.ox")
    public static boolean field647;

    @ObfuscatedName("client.ot")
    public static int field648;

    @ObfuscatedName("client.oz")
    public static int[] field649;

    @ObfuscatedName("client.oi")
    public static int[] field650;

    @ObfuscatedName("client.ow")
    public static int[] field651;

    @ObfuscatedName("client.or")
    public static int[] field652;

    @ObfuscatedName("client.on")
    public static int[] field688;

    @ObfuscatedName("client.ou")
    public static String[] field771;

    @ObfuscatedName("client.op")
    public static String[] field795;

    @ObfuscatedName("client.oa")
    public static boolean[] field656;

    @ObfuscatedName("client.oe")
    public static boolean field521;

    @ObfuscatedName("client.oo")
    public static boolean field658;

    @ObfuscatedName("client.ob")
    public static boolean field659;

    @ObfuscatedName("client.od")
    public static int field673;

    @ObfuscatedName("client.oj")
    public static int field661;

    @ObfuscatedName("client.ol")
    public static int field751;

    @ObfuscatedName("client.pr")
    public static int field663;

    @ObfuscatedName("client.pg")
    public static int field741;

    @ObfuscatedName("client.pu")
    public static boolean field722;

    @ObfuscatedName("client.ph")
    public static int field667;

    @ObfuscatedName("client.pj")
    public static int field555;

    @ObfuscatedName("client.pm")
    public static String field669;

    @ObfuscatedName("client.pk")
    public static String field670;

    @ObfuscatedName("client.pd")
    public static int field671;

    @ObfuscatedName("client.pf")
    public static class505 field655;

    @ObfuscatedName("client.pp")
    public static int field799;

    @ObfuscatedName("client.pe")
    public static int field674;

    @ObfuscatedName("client.pn")
    public static int field675;

    @ObfuscatedName("client.pv")
    public static class347 field522;

    @ObfuscatedName("client.px")
    public static int field672;

    @ObfuscatedName("client.pi")
    public static int field678;

    @ObfuscatedName("client.pc")
    public static int field679;

    @ObfuscatedName("client.pw")
    public static int field554;

    @ObfuscatedName("client.po")
    public static boolean field517;

    @ObfuscatedName("client.pb")
    public static class347 field682;

    @ObfuscatedName("client.qr")
    public static class347 field683;

    @ObfuscatedName("client.qz")
    public static class347 field684;

    @ObfuscatedName("client.qe")
    public static int field685;

    @ObfuscatedName("client.qx")
    public static int field686;

    @ObfuscatedName("client.qa")
    public static class347 field687;

    @ObfuscatedName("client.qt")
    public static boolean field740;

    @ObfuscatedName("client.qd")
    public static int field689;

    @ObfuscatedName("client.qy")
    public static int field690;

    @ObfuscatedName("client.qk")
    public static boolean field715;

    @ObfuscatedName("client.qg")
    public static int field720;

    @ObfuscatedName("client.qi")
    public static int field693;

    @ObfuscatedName("client.qh")
    public static boolean field694;

    @ObfuscatedName("client.qf")
    public static int field695;

    @ObfuscatedName("client.qp")
    public static int[] field498;

    @ObfuscatedName("client.qv")
    public static int field697;

    @ObfuscatedName("client.qu")
    public static int[] field698;

    @ObfuscatedName("client.qn")
    public static int field778;

    @ObfuscatedName("client.qj")
    public static int[] field552;

    @ObfuscatedName("client.qm")
    public static int field666;

    @ObfuscatedName("client.qb")
    public static int[] field702;

    @ObfuscatedName("client.re")
    public static int field703;

    @ObfuscatedName("client.rs")
    public static int field704;

    @ObfuscatedName("client.rp")
    public static int field705;

    @ObfuscatedName("client.rm")
    public static int field706;

    @ObfuscatedName("client.rn")
    public static int field707;

    @ObfuscatedName("client.rx")
    public static int field708;

    @ObfuscatedName("client.rq")
    public static int field591;

    @ObfuscatedName("client.rd")
    public static int field710;

    @ObfuscatedName("client.rw")
    public static int field593;

    @ObfuscatedName("client.rt")
    public static int field712;

    @ObfuscatedName("client.rf")
    public static class549 field713;

    @ObfuscatedName("client.rl")
    public static class394 field714;

    @ObfuscatedName("client.ra")
    public static class394 field632;

    @ObfuscatedName("client.rk")
    public static class394 field716;

    @ObfuscatedName("client.ry")
    public static class394 field717;

    @ObfuscatedName("client.rr")
    public static class505 field718;

    @ObfuscatedName("client.rc")
    public static int field719;

    @ObfuscatedName("client.ro")
    public static int field608;

    @ObfuscatedName("client.rh")
    public static boolean[] field721;

    @ObfuscatedName("client.rg")
    public static boolean[] field664;

    @ObfuscatedName("client.si")
    public static boolean[] field730;

    @ObfuscatedName("client.su")
    public static int[] field724;

    @ObfuscatedName("client.ss")
    public static int[] field725;

    @ObfuscatedName("client.sn")
    public static int[] field726;

    @ObfuscatedName("client.sr")
    public static int[] field769;

    @ObfuscatedName("client.sf")
    public static int field728;

    @ObfuscatedName("client.sp")
    public static long field729;

    @ObfuscatedName("client.sw")
    public static boolean field660;

    @ObfuscatedName("client.sx")
    public static int[] field657;

    @ObfuscatedName("client.sv")
    public static int field732;

    @ObfuscatedName("client.sj")
    public static int field585;

    @ObfuscatedName("client.st")
    public static String field734;

    @ObfuscatedName("client.se")
    public static long[] field735;

    @ObfuscatedName("client.sm")
    public static int field736;

    @ObfuscatedName("client.sa")
    public static class227 field662;

    @ObfuscatedName("client.sb")
    public static class225 field609;

    @ObfuscatedName("client.sg")
    public static int field739;

    @ObfuscatedName("client.tn")
    public static int[] field618;

    @ObfuscatedName("client.tp")
    public static int[] field560;

    @ObfuscatedName("client.tf")
    public static long field742;

    @ObfuscatedName("client.ti")
    public static class155[] field743;

    @ObfuscatedName("client.tj")
    public static class164[] field744;

    @ObfuscatedName("client.ts")
    public static int field733;

    @ObfuscatedName("client.tk")
    public static int field640;

    @ObfuscatedName("client.ty")
    public static int[] field800;

    @ObfuscatedName("client.ta")
    public static int[] field748;

    @ObfuscatedName("client.th")
    public static class545[] field749;

    @ObfuscatedName("client.tz")
    public static int field750;

    @ObfuscatedName("client.tt")
    public static int field571;

    @ObfuscatedName("client.tv")
    public static int field752;

    @ObfuscatedName("client.tq")
    public static boolean field676;

    @ObfuscatedName("client.uh")
    public static int field754;

    @ObfuscatedName("client.uy")
    public static int[] field755;

    @ObfuscatedName("client.ub")
    public static int[] field756;

    @ObfuscatedName("client.ul")
    public static int[] field549;

    @ObfuscatedName("client.um")
    public static int[] field758;

    @ObfuscatedName("client.ux")
    public static class40[] field631;

    @ObfuscatedName("client.uk")
    public static boolean field760;

    @ObfuscatedName("client.up")
    public static boolean field761;

    @ObfuscatedName("client.uw")
    public static boolean field762;

    @ObfuscatedName("client.us")
    public static boolean field763;

    @ObfuscatedName("client.uc")
    public static class496 field764;

    @ObfuscatedName("client.uf")
    public static class495 field501;

    @ObfuscatedName("client.vg")
    public static class495 field766;

    @ObfuscatedName("client.vd")
    public static boolean field767;

    @ObfuscatedName("client.vr")
    public static boolean[] field768;

    @ObfuscatedName("client.vp")
    public static int[] field723;

    @ObfuscatedName("client.vw")
    public static int[] field770;

    @ObfuscatedName("client.vk")
    public static int[] field789;

    @ObfuscatedName("client.vi")
    public static int[] field776;

    @ObfuscatedName("client.vz")
    public static short field773;

    @ObfuscatedName("client.vb")
    public static short field774;

    @ObfuscatedName("client.vj")
    public static short field775;

    @ObfuscatedName("client.vu")
    public static short field643;

    @ObfuscatedName("client.vh")
    public static short field777;

    @ObfuscatedName("client.vm")
    public static short field597;

    @ObfuscatedName("client.vc")
    public static short field779;

    @ObfuscatedName("client.vx")
    public static short field780;

    @ObfuscatedName("client.vf")
    public static int field781;

    @ObfuscatedName("client.vo")
    public static int field747;

    @ObfuscatedName("client.vt")
    public static int field783;

    @ObfuscatedName("client.va")
    public static int field505;

    @ObfuscatedName("client.wv")
    public static int field785;

    @ObfuscatedName("client.wz")
    public static class344 field621;

    @ObfuscatedName("client.wa")
    public static int field737;

    @ObfuscatedName("client.wj")
    public static int field788;

    @ObfuscatedName("client.wx")
    public static class492 field530;

    @ObfuscatedName("client.we")
    public static class384[] field790;

    @ObfuscatedName("client.wr")
    public static class67 field791;

    @ObfuscatedName("client.wo")
    public static class440 field792;

    @ObfuscatedName("client.wl")
    public static class302 field793;

    @ObfuscatedName("client.wb")
    public static class302 field794;

    @ObfuscatedName("client.wt")
    public static int field731;

    @ObfuscatedName("client.wm")
    public static int field759;

    @ObfuscatedName("client.xx")
    public static List field787;

    @ObfuscatedName("client.xa")
    public static final class233 field692;

    @ObfuscatedName("client.xi")
    public static ArrayList field546;

    @ObfuscatedName("client.xr")
    public static int field565;

    @ObfuscatedName("client.xy")
    public static int field786;

    @ObfuscatedName("client.xb")
    public static final class66 field802;

    @ObfuscatedName("client.xu")
    public static int[] field803;

    @ObfuscatedName("client.xl")
    public static int[] field804;

    static {
        byte[] var0 = class400.method5707("com_jagex_auth_desktop_osrs:public");
        String var1 = class402.method3731(var0, 0, var0.length);
        field772 = var1;
        byte[] var2 = class400.method5707("com_jagex_auth_desktop_runelite:public");
        String var3 = class402.method3731(var2, 0, var2.length);
        field506 = var3;
        field551 = false;
        field613 = new class78();
        field700 = null;
        field557 = new class101[65536];
        field558 = 0;
        field559 = new int[65536];
        field550 = 0;
        field604 = new int[250];
        field561 = new class112();
        field563 = 0;
        field564 = false;
        field538 = new class430();
        field566 = new HashMap();
        field567 = 0;
        field568 = 1;
        field556 = 0;
        field570 = 1;
        field569 = 0;
        field572 = new class228[4];
        field573 = false;
        field574 = new int[4][13][13];
        field575 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field653 = -1;
        field577 = 0;
        field578 = 2301979;
        field579 = 5063219;
        field542 = 3353893;
        field581 = 7759444;
        field582 = false;
        field583 = 0;
        field584 = 128;
        field580 = 0;
        field586 = 0;
        field699 = 0;
        field588 = 0;
        field589 = 0;
        field630 = 0;
        field641 = 50;
        field624 = 0;
        field511 = 0;
        field594 = 0;
        field595 = 12;
        field596 = 6;
        field801 = 0;
        field598 = false;
        field599 = 0;
        field600 = false;
        field601 = 0;
        field602 = 0;
        field603 = 50;
        field711 = new int[field603];
        field605 = new int[field603];
        field606 = new int[field603];
        field607 = new int[field603];
        field796 = new int[field603];
        field753 = new int[field603];
        field610 = new int[field603][];
        field611 = new int[field603];
        field612 = new String[field603];
        field797 = new int[104][104];
        field681 = 0;
        field615 = -1;
        field616 = -1;
        field617 = 0;
        field701 = 0;
        field619 = 0;
        field620 = 0;
        field544 = true;
        field622 = 0;
        field623 = true;
        field738 = new class92[2048];
        field625 = -1;
        field519 = 0;
        field510 = -1L;
        field628 = -1L;
        field629 = true;
        field537 = 0;
        field709 = 0;
        field626 = new int[1000];
        field633 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field634 = new String[8];
        field635 = new boolean[8];
        field636 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field637 = -1;
        field644 = new class394[4][104][104];
        field639 = new class394();
        field587 = new class394();
        field782 = new class394();
        field642 = new int[25];
        field518 = new int[25];
        field745 = new int[25];
        field645 = new int[25];
        field646 = false;
        field647 = false;
        field648 = 0;
        field649 = new int[500];
        field650 = new int[500];
        field651 = new int[500];
        field652 = new int[500];
        field688 = new int[500];
        field771 = new String[500];
        field795 = new String[500];
        field656 = new boolean[500];
        field521 = false;
        field658 = false;
        field659 = true;
        field673 = -1;
        field661 = -1;
        field751 = 0;
        field663 = 50;
        field741 = 0;
        field665 = null;
        field722 = false;
        field667 = -1;
        field555 = -1;
        field669 = null;
        field670 = null;
        field671 = -1;
        field655 = new class505(8);
        field799 = 0;
        field674 = -1;
        field675 = 0;
        field522 = null;
        field672 = 0;
        field678 = 0;
        field679 = 0;
        field554 = -1;
        field517 = false;
        field682 = null;
        field683 = null;
        field684 = null;
        field685 = 0;
        field686 = 0;
        field687 = null;
        field740 = false;
        field689 = -1;
        field690 = -1;
        field715 = false;
        field720 = -1;
        field693 = -1;
        field694 = false;
        field695 = 1;
        field498 = new int[32];
        field697 = 0;
        field698 = new int[32];
        field778 = 0;
        field552 = new int[32];
        field666 = 0;
        field702 = new int[32];
        field703 = 0;
        field704 = 0;
        field705 = 0;
        field706 = 0;
        field707 = 0;
        field708 = 0;
        field591 = 0;
        field710 = 0;
        field593 = 0;
        field712 = 0;
        field713 = new class549();
        field714 = new class394();
        field632 = new class394();
        field716 = new class394();
        field717 = new class394();
        field718 = new class505(512);
        field719 = 0;
        field608 = -2;
        field721 = new boolean[100];
        field664 = new boolean[100];
        field730 = new boolean[100];
        field724 = new int[100];
        field725 = new int[100];
        field726 = new int[100];
        field769 = new int[100];
        field728 = 0;
        field729 = 0L;
        field660 = true;
        field657 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field732 = 0;
        field585 = 0;
        field734 = "";
        field735 = new long[100];
        field736 = 0;
        field662 = new class227();
        field609 = new class225();
        field739 = 0;
        field618 = new int[128];
        field560 = new int[128];
        field742 = -1L;
        field743 = new class155[4];
        field744 = new class164[4];
        field733 = -1;
        field640 = 0;
        field800 = new int[1000];
        field748 = new int[1000];
        field749 = new class545[1000];
        field750 = 0;
        field571 = 0;
        field752 = 0;
        field676 = false;
        field754 = 0;
        field755 = new int[50];
        field756 = new int[50];
        field549 = new int[50];
        field758 = new int[50];
        field631 = new class40[50];
        field760 = false;
        field761 = false;
        field762 = false;
        field763 = false;
        field764 = null;
        field501 = null;
        field766 = null;
        field767 = false;
        field768 = new boolean[5];
        field723 = new int[5];
        field770 = new int[5];
        field789 = new int[5];
        field776 = new int[5];
        field773 = 256;
        field774 = 205;
        field775 = 256;
        field643 = 320;
        field777 = 1;
        field597 = 32767;
        field779 = 1;
        field780 = 32767;
        field781 = 0;
        field747 = 0;
        field783 = 0;
        field505 = 0;
        field785 = 0;
        field621 = new class344();
        field737 = -1;
        field788 = -1;
        field530 = new class490();
        field790 = new class384[8];
        field791 = new class67();
        field792 = new class440(8, class438.field4678);
        field793 = new class302(64);
        field794 = new class302(64);
        field731 = -1;
        field759 = -1;
        field787 = new ArrayList();
        field692 = new class233();
        field546 = new ArrayList(10);
        field565 = 0;
        field786 = 0;
        field802 = new class66();
        field803 = new int[50];
        field804 = new int[50];
    }

    @ObfuscatedName("cm.ho(I)Lsa;")
    public static class491 method2062() {
        return Statics.field824;
    }

    @ObfuscatedName("ff.ht(B)Ltc;")
    public static class499 method2995() {
        return Statics.field4432;
    }

    @ObfuscatedName("client.bi(I)V")
    public final void method528() {
    }

    public final void init() {
        if (!this.method509()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class102.field1317)) {
                            field680 = true;
                        } else {
                            field680 = false;
                        }
                        break;
                    case 4:
                        if (field536 == -1) {
                            field536 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field500 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var4 = Integer.parseInt(var2);
                        class390 var5;
                        if (var4 >= 0 && var4 < class390.field4455.length) {
                            var5 = class390.field4455[var4];
                        } else {
                            var5 = null;
                        }
                        Statics.field1147 = var5;
                        break;
                    case 7:
                        int var6 = Integer.parseInt(var2);
                        class362[] var7 = new class362[] { class362.field3944, class362.field3946, class362.field3943, class362.field3945 };
                        class362[] var8 = var7;
                        int var9 = 0;
                        class362 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class362 var10 = var8[var9];
                            if (var10.field3947 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field154 = var11;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class102.field1317)) {
                        }
                        break;
                    case 9:
                        Statics.field4609 = var2;
                        break;
                    case 10:
                        Statics.field4 = (class363) class389.method6514(class363.method2138(), Integer.parseInt(var2));
                        if (Statics.field4 == class363.field3955) {
                            Statics.field1465 = class509.field5065;
                        } else {
                            Statics.field1465 = class509.field5071;
                        }
                        break;
                    case 11:
                        Statics.field4606 = var2;
                        break;
                    case 12:
                        field499 = Integer.parseInt(var2);
                    case 13:
                    case 16:
                    case 18:
                    case 19:
                    case 20:
                    case 23:
                    case 24:
                    default:
                        break;
                    case 14:
                        Statics.field2468 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field638 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1413 = var2;
                        break;
                    case 21:
                        field504 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field1666 = var2;
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
        class274.field2876 = false;
        field503 = false;
        Statics.field1807 = this.getCodeBase().getHost();
        Statics.field1419 = new class376();
        String var12 = Statics.field154.field3948;
        byte var13 = 0;
        if ((field500 & class527.field5161.method34()) != 0) {
            Statics.field2677 = "beta";
        }
        try {
            class213.method2394("oldschool", Statics.field2677, var12, var13, 23);
        } catch (Exception var15) {
            class557.method6332((String) null, var15);
        }
        Statics.field3067 = this;
        Statics.field3443 = field536;
        method484();
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field540 = true;
        }
        if (field668 == -1) {
            if (this.method1711() || this.method1197()) {
                field668 = 5;
            } else {
                field668 = 0;
            }
        }
        this.method506(765, 503, 219, 1);
    }

    public void finalize() throws Throwable {
        class320.field3464.remove(this);
        super.finalize();
    }

    @ObfuscatedName("bn.hv(I)V")
    public static void method484() {
        Statics.field38 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field5 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field1766 = System.getenv("JX_SESSION_ID");
        Statics.field438 = System.getenv("JX_CHARACTER_ID");
        String var0 = System.getenv("JX_DISPLAY_NAME");
        class76.field927 = class510.method5595(var0);
    }

    @ObfuscatedName("client.hh(S)Z")
    public boolean method1193() {
        return this.field562 == 1;
    }

    public void setClient(int arg0) {
        this.field562 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field757 = arg0;
            class76.method2388(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field547 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field508 == 10;
    }

    public long getAccountHash() {
        return this.field592;
    }

    @ObfuscatedName("client.hq(I)Z")
    public boolean method1711() {
        return Statics.field38 != null && !Statics.field38.trim().isEmpty() && Statics.field5 != null && !Statics.field5.trim().isEmpty();
    }

    @ObfuscatedName("client.hz(I)Z")
    public boolean method1197() {
        return Statics.field1766 != null && !Statics.field1766.trim().isEmpty() && Statics.field438 != null && !Statics.field438.trim().isEmpty();
    }

    @ObfuscatedName("client.hf(I)Z")
    public boolean method1292() {
        return this.field757 != null;
    }

    @ObfuscatedName("client.hm(Ljava/lang/String;I)V")
    public void method1597(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field4606 + "shield/oauth/token" + (new class480(var2)).method7954());
        class436 var4 = new class436();
        if (this.method1193()) {
            var4.method7379(field506);
        } else {
            var4.method7379(field772);
        }
        var4.method7376("Host", (new URL(Statics.field4606)).getHost());
        var4.method7383(class477.field4848);
        class10 var5 = class10.field22;
        RefreshAccessTokenRequester var6 = this.field547;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field540);
            this.field727 = this.field654.method175(var7);
        } else {
            this.field548 = var6.request(var5.method63(), var3, var4.method7375(), "");
        }
    }

    @ObfuscatedName("client.hk(Ljava/lang/String;S)V")
    public void method1445(String arg0) throws IOException {
        URL var2 = new URL(Statics.field4606 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class436 var3 = new class436();
        var3.method7382(arg0);
        class10 var4 = class10.field20;
        OtlTokenRequester var5 = this.field757;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field540);
            this.field541 = this.field654.method175(var6);
        } else {
            this.field543 = var5.request(var4.method63(), var2, var3.method7375(), "");
        }
    }

    @ObfuscatedName("client.hc(Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1208(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field1666 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field22, this.field540);
        var4.method83().method7382(arg0);
        var4.method83().method7383(class477.field4848);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method77(new class479(var5));
        this.field541 = this.field654.method175(var4);
    }

    @ObfuscatedName("client.by(I)V")
    public final void method520() {
        class428.method2868(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field1029 = field638 == 0 ? 43594 : field499 + 40000;
        Statics.field60 = field638 == 0 ? 443 : field499 + 50000;
        Statics.field491 = Statics.field1029;
        Statics.field5246 = class346.field3686;
        Statics.field3647 = class346.field3685;
        Statics.field3649 = class346.field3687;
        Statics.field114 = class346.field3684;
        Statics.field1431 = new class114(this.field540, 219);
        this.method526();
        this.method601();
        Statics.field1800 = this.method494();
        this.method627(field609, 0);
        this.method627(field662, 1);
        this.method495();
        Statics.field3923 = new class459(255, class213.field2308, class213.field2309, 500000);
        class511 var1 = null;
        class99 var2 = new class99();
        try {
            var1 = class213.method6289("", Statics.field4.field3950, false);
            byte[] var3 = new byte[(int) var1.method8350()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method8351(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class99(new class531(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method8352();
            }
        } catch (Exception var11) {
        }
        Statics.field1155 = var2;
        String var10 = Statics.field121;
        class32.field164 = this;
        if (var10 != null) {
            class32.field162 = var10;
        }
        method3185(Statics.field1155.method2451());
        Statics.field3588 = new class69(Statics.field1465);
        this.field654 = new class15("tokenRequest", 1, 1);
        class320.method2667(this);
        field692.method4174();
    }

    @ObfuscatedName("bw.hi(S)Liz;")
    public static class227 method853() {
        return field662;
    }

    @ObfuscatedName("client.bc(B)V")
    public final void method521() {
        field677++;
        this.method1200();
        class372.method7359();
        boolean var1 = false;
        boolean var2 = false;
        if (!class320.field3463.isEmpty()) {
            class423 var3 = (class423) class320.field3463.get(0);
            if (var3 == null) {
                class320.field3463.remove(0);
            } else if (var3.method7259()) {
                if (var3.method7264()) {
                    System.out.println("Error in midimanager.service: " + var3.method7266());
                    var1 = true;
                } else {
                    if (var3.method7267() != null) {
                        class320.field3463.add(1, var3.method7267());
                    }
                    var2 = var3.method7274();
                }
                class320.field3463.remove(0);
            } else {
                var2 = var3.method7274();
            }
        }
        if (var1) {
            class320.field3463.clear();
            class320.method3105();
        }
        if (var2 && field676 && Statics.field5025 != null) {
            Statics.field5025.method814();
        }
        method4569();
        field662.method4050();
        this.method499();
        class36.method3883();
        if (Statics.field1800 != null) {
            int var6 = Statics.field1800.method318();
            field712 = var6;
        }
        if (field508 == 0) {
            method2628();
            class35.method4223();
        } else if (field508 == 5) {
            class76.method3353(this, Statics.field1454, Statics.field3619);
            method2628();
            class35.method4223();
        } else if (field508 == 10 || field508 == 11) {
            class76.method3353(this, Statics.field1454, Statics.field3619);
        } else if (field508 == 20) {
            class76.method3353(this, Statics.field1454, Statics.field3619);
            this.method1203();
        } else if (field508 == 50) {
            class76.method3353(this, Statics.field1454, Statics.field3619);
            this.method1203();
        } else if (field508 == 25) {
            method7870();
        }
        if (field508 == 30) {
            this.method1320();
        } else if (field508 == 40 || field508 == 45) {
            this.method1203();
        }
    }

    @ObfuscatedName("client.bx(ZI)V")
    public final void method522(boolean arg0) {
        if ((field508 == 10 || field508 == 20 || field508 == 30) && field729 != 0L && Statics.method2852() > field729) {
            method3185(method3078());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field721[var2] = true;
            }
        }
        if (field508 == 0) {
            this.method524(class76.field912, class76.field913, arg0);
        } else if (field508 == 5) {
            class76.method3818(Statics.field1089, Statics.field1454, Statics.field3619);
        } else if (field508 == 10 || field508 == 11) {
            class76.method3818(Statics.field1089, Statics.field1454, Statics.field3619);
        } else if (field508 == 20) {
            class76.method3818(Statics.field1089, Statics.field1454, Statics.field3619);
        } else if (field508 == 50) {
            class76.method3818(Statics.field1089, Statics.field1454, Statics.field3619);
        } else if (field508 == 25) {
            if (field569 == 1) {
                if (field567 > field568) {
                    field568 = field567;
                }
                int var3 = (field568 * 50 - field567 * 50) / field568;
                method3574(class367.field3987 + class102.field1315 + class102.field1312 + var3 + "%" + class102.field1314, false);
            } else if (field569 == 2) {
                if (field556 > field570) {
                    field570 = field556;
                }
                int var4 = (field570 * 50 - field556 * 50) / field570 + 50;
                method3574(class367.field3987 + class102.field1315 + class102.field1312 + var4 + "%" + class102.field1314, false);
            } else {
                method3574(class367.field3987, false);
            }
        } else if (field508 == 30) {
            this.method1585();
        } else if (field508 == 40) {
            method3574(class367.field3988 + class102.field1315 + class367.field3989, false);
        } else if (field508 == 45) {
            method3574(class367.field4151, false);
        }
        if (field508 == 30 && field728 == 0 && !arg0 && !field660) {
            for (int var5 = 0; var5 < field719; var5++) {
                if (field664[var5]) {
                    Statics.field2556.method467(field724[var5], field725[var5], field726[var5], field769[var5]);
                    field664[var5] = false;
                }
            }
        } else if (field508 > 0) {
            Statics.field2556.method466(0, 0);
            for (int var6 = 0; var6 < field719; var6++) {
                field664[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.bf(I)V")
    public final void method523() {
        if (Statics.field1293.method2680()) {
            Statics.field1293.method2677();
        }
        if (Statics.field118 != null) {
            Statics.field118.field1073 = false;
        }
        Statics.field118 = null;
        field561.method2738();
        if (class36.field224 != null) {
            class36 var1 = class36.field224;
            synchronized (class36.field224) {
                class36.field224 = null;
            }
        }
        Statics.field1800 = null;
        if (Statics.field5025 != null) {
            Statics.field5025.method805();
        }
        Statics.field1419.method6490();
        class372.method4878();
        if (Statics.field1431 != null) {
            Statics.field1431.method2769();
            Statics.field1431 = null;
        }
        class213.method2655();
        this.field654.method176();
    }

    @ObfuscatedName("kw.hy(I)V")
    public static void method5115() {
        if (Statics.field1293.method2680()) {
            Statics.field1293.method2677();
        }
        method3311();
        if (Statics.field118 != null) {
            Statics.field118.field1073 = false;
        }
        Statics.field118 = null;
        field561.method2738();
        if (Statics.field198 != null) {
            try {
                Statics.field198.method3887();
            } catch (Exception var4) {
            }
        }
        Statics.field198 = null;
        method5430();
        method2338();
        Statics.field493.method4880();
        for (int var1 = 0; var1 < 4; var1++) {
            field572[var1].method4083();
        }
        Statics.field4432 = null;
        class320.method2387(0, 0);
        class320.method8258();
        field676 = false;
        class70.method4589();
        if (Statics.field5025 != null) {
            Statics.field5025.method805();
        }
        Statics.field1419.method6490();
        class372.method4878();
        if (Statics.field1431 != null) {
            Statics.field1431.method2769();
        }
        class213.method2655();
        class213.field2308 = null;
        class213.field2309 = null;
        Statics.field2310 = null;
        class215.method4216();
        Statics.field3923 = null;
        field546.clear();
        field786 = 0;
        Statics.field1419 = new class376();
        Statics.field1431 = new class114(Statics.field3067.field540, 219);
        try {
            class213.method2394("oldschool", Statics.field2677, Statics.field154.field3948, 0, 23);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
        Statics.field3923 = new class459(255, class213.field2308, class213.field2309, 500000);
        Statics.field198 = new class211();
        Statics.field3067.method511();
        field529 = class93.field1140;
        Statics.method2960(0);
    }

    @ObfuscatedName("dn.hg(I)V")
    public static void method2338() {
        Statics.field3122 = null;
        Statics.field1667 = null;
        Statics.field2487 = null;
        Statics.field1249 = null;
        Statics.field53 = null;
        Statics.field496 = null;
        Statics.field3974 = null;
        Statics.field1347 = null;
        Statics.field1635 = null;
        Statics.field3933 = null;
        Statics.field105 = null;
    }

    @ObfuscatedName("client.hj(B)V")
    public void method1200() {
        if (field508 != 1000) {
            boolean var1 = Statics.field1419.method6495();
            if (!var1) {
                this.method1492();
            }
        }
    }

    @ObfuscatedName("client.hl(I)V")
    public void method1492() {
        if (Statics.field1419.field4378 >= 4) {
            this.method525("js5crc");
            Statics.method2960(1000);
            return;
        }
        if (Statics.field1419.field4399 >= 4) {
            if (field508 <= 5) {
                this.method525("js5io");
                Statics.method2960(1000);
                return;
            }
            field531 = 3000;
            Statics.field1419.field4399 = 3;
        }
        if (--field531 + 1 > 0) {
            return;
        }
        try {
            if (field502 == 0) {
                Statics.field4793 = Statics.field198.method3889(Statics.field1807, Statics.field491);
                field502++;
            }
            if (field502 == 1) {
                if (Statics.field4793.field2344 == 2) {
                    this.method1560(-1);
                    return;
                }
                if (Statics.field4793.field2344 == 1) {
                    field502++;
                }
            }
            if (field502 == 2) {
                Statics.field4727 = class455.method4492((Socket) Statics.field4793.field2350, 40000, 5000);
                class531 var1 = new class531(5);
                var1.method8699(15);
                var1.method8547(219);
                Statics.field4727.method7661(var1.field5178, 0, 5);
                field502++;
                Statics.field84 = Statics.method2852();
            }
            if (field502 == 3) {
                if (Statics.field4727.method7659() > 0) {
                    int var2 = Statics.field4727.method7671();
                    if (var2 != 0) {
                        this.method1560(var2);
                        return;
                    }
                    field502++;
                } else if (Statics.method2852() - Statics.field84 > 30000L) {
                    this.method1560(-2);
                    return;
                }
            }
            if (field502 == 4) {
                Statics.field1419.method6483(Statics.field4727, field508 > 20);
                Statics.field4793 = null;
                Statics.field4727 = null;
                field502 = 0;
                field532 = 0;
            }
        } catch (IOException var4) {
            this.method1560(-3);
        }
    }

    @ObfuscatedName("client.hs(II)V")
    public void method1560(int arg0) {
        Statics.field4793 = null;
        Statics.field4727 = null;
        field502 = 0;
        if (Statics.field491 == Statics.field1029) {
            Statics.field491 = Statics.field60;
        } else {
            Statics.field491 = Statics.field1029;
        }
        field532++;
        if (field532 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field508 <= 5) {
                this.method525("js5connect_full");
                Statics.method2960(1000);
            } else {
                field531 = 3000;
            }
        } else if (field532 >= 2 && arg0 == 6) {
            this.method525("js5connect_outofdate");
            Statics.method2960(1000);
        } else if (field532 >= 4) {
            if (field508 <= 5) {
                this.method525("js5connect");
                Statics.method2960(1000);
            } else {
                field531 = 3000;
            }
        }
    }

    @ObfuscatedName("do.hx(Loz;Ljava/lang/String;B)V")
    public static void method2390(class373 arg0, String arg1) {
        class84 var2 = new class84(arg0, arg1);
        field546.add(var2);
        field786 += var2.field1033;
    }

    @ObfuscatedName("au.ha(I)Z")
    public static boolean method94() {
        if (field546 == null || field565 >= field546.size()) {
            return true;
        }
        while (field565 < field546.size()) {
            class84 var0 = (class84) field546.get(field565);
            if (!var0.method2237()) {
                return false;
            }
            field565++;
        }
        return true;
    }

    @ObfuscatedName("nn.im(I)I")
    public static int method6217() {
        if (field546 == null || field565 >= field546.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field565; var1++) {
            var0 += ((class84) field546.get(var1)).field1035;
        }
        return var0 * 10000 / field786;
    }

    @ObfuscatedName("dy.iy(I)V")
    public static void method2628() {
        if (field529 == class93.field1140) {
            Statics.field493 = new class274(4, 104, 104, class82.field1020);
            for (int var0 = 0; var0 < 4; var0++) {
                field572[var0] = new class228(104, 104);
            }
            Statics.field4876 = new class545(512, 512);
            class76.field913 = class367.field4225;
            class76.field912 = 5;
            field529 = class93.field1130;
        } else if (field529 == class93.field1130) {
            class76.field913 = class367.field3991;
            class76.field912 = 10;
            field529 = class93.field1131;
        } else if (field529 == class93.field1131) {
            Statics.field3863 = method2182(0, false, true, true, false);
            Statics.field2908 = method2182(1, false, true, true, false);
            Statics.field243 = method2182(2, true, false, true, false);
            Statics.field1821 = method2182(3, false, true, true, false);
            Statics.field4845 = method2182(4, false, true, true, false);
            Statics.field160 = method2182(5, true, true, true, false);
            Statics.field2588 = method2182(6, true, true, true, false);
            Statics.field3549 = method2182(7, false, true, true, false);
            Statics.field95 = method2182(8, false, true, true, false);
            Statics.field1490 = method2182(9, false, true, true, false);
            Statics.field1996 = method2182(10, false, true, true, false);
            Statics.field2628 = method2182(11, false, true, true, false);
            Statics.field3891 = method2182(12, false, true, true, false);
            Statics.field2091 = method2182(13, true, false, true, false);
            Statics.field3429 = method2182(14, false, true, true, false);
            Statics.field995 = method2182(15, false, true, true, false);
            Statics.field2000 = method2182(17, true, true, true, false);
            Statics.field1522 = method2182(18, false, true, true, false);
            Statics.field3285 = method2182(19, false, true, true, false);
            Statics.field1633 = method2182(20, false, true, true, false);
            Statics.field81 = method2182(21, false, true, true, false);
            class459 var1 = null;
            if (class213.field2308 != null) {
                var1 = new class459(22, class213.field2308, Statics.field2310[22], 1000000);
            }
            class373 var2 = new class373(var1, Statics.field3923, Statics.field1419, 22, false, true, true, true, true);
            Statics.field2282 = var2;
            class76.field913 = class367.field3992;
            class76.field912 = 20;
            field529 = class93.field1145;
        } else if (field529 == class93.field1145) {
            byte var3 = 0;
            int var4 = var3 + Statics.field3863.method6351() * 4 / 100;
            int var5 = var4 + Statics.field2908.method6351() * 4 / 100;
            int var6 = var5 + Statics.field243.method6351() * 2 / 100;
            int var7 = var6 + Statics.field1821.method6351() * 2 / 100;
            int var8 = var7 + Statics.field4845.method6351() * 6 / 100;
            int var9 = var8 + Statics.field160.method6351() * 4 / 100;
            int var10 = var9 + Statics.field2588.method6351() * 2 / 100;
            int var11 = var10 + Statics.field3549.method6351() * 54 / 100;
            int var12 = var11 + Statics.field95.method6351() * 2 / 100;
            int var13 = var12 + Statics.field1490.method6351() * 2 / 100;
            int var14 = var13 + Statics.field1996.method6351() * 2 / 100;
            int var15 = var14 + Statics.field2628.method6351() * 2 / 100;
            int var16 = var15 + Statics.field3891.method6351() * 2 / 100;
            int var17 = var16 + Statics.field2091.method6351() * 2 / 100;
            int var18 = var17 + Statics.field3429.method6351() * 2 / 100;
            int var19 = var18 + Statics.field995.method6351() * 2 / 100;
            int var20 = var19 + Statics.field3285.method6351() / 100;
            int var21 = var20 + Statics.field1522.method6351() / 100;
            int var22 = var21 + Statics.field1633.method6351() / 100;
            int var23 = var22 + Statics.field81.method6351() / 100;
            int var24 = var23 + Statics.field2282.method6351() / 100;
            int var25 = var24 + (Statics.field2000.method6350() && Statics.field2000.method6439() ? 1 : 0);
            if (var25 == 100) {
                method2390(Statics.field3863, "Animations");
                method2390(Statics.field2908, "Skeletons");
                method2390(Statics.field4845, "Sound FX");
                method2390(Statics.field160, "Maps");
                method2390(Statics.field2588, "Music Tracks");
                method2390(Statics.field3549, "Models");
                method2390(Statics.field95, "Sprites");
                method2390(Statics.field2628, "Music Jingles");
                method2390(Statics.field3429, "Music Samples");
                method2390(Statics.field995, "Music Patches");
                method2390(Statics.field3285, "World Map");
                method2390(Statics.field1522, "World Map Geography");
                method2390(Statics.field1633, "World Map Ground");
                Statics.field3518 = new class461();
                Statics.field3518.method7734(Statics.field2000);
                class76.field913 = class367.field4026;
                class76.field912 = 30;
                field529 = class93.field1133;
            } else {
                if (var25 != 0) {
                    class76.field913 = class367.field3993 + var25 + "%";
                }
                class76.field912 = 30;
            }
        } else if (field529 == class93.field1133) {
            boolean var26 = !field503;
            Statics.field1994 = 22050;
            Statics.field4794 = var26;
            Statics.field100 = 2;
            ArrayList var27 = new ArrayList(3);
            class211 var28 = Statics.field198;
            short var29 = 2048;
            if (Statics.field1994 == 0) {
                throw new IllegalStateException();
            }
            if (var29 < 256) {
                var29 = 256;
            }
            class43 var31;
            try {
                class43 var30 = Statics.field3109.method320();
                var30.field298 = new int[256 * (Statics.field4794 ? 2 : 1)];
                var30.field289 = var29;
                var30.method331();
                var30.field288 = (var29 & 0xFFFFFC00) + 1024;
                if (var30.field288 > 16384) {
                    var30.field288 = 16384;
                }
                var30.method338(var30.field288);
                if (Statics.field100 > 0 && Statics.field283 == null) {
                    Statics.field283 = new class45();
                    Statics.field297 = Executors.newScheduledThreadPool(1);
                    Statics.field297.scheduleAtFixedRate(Statics.field283, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field283 != null) {
                    if (Statics.field283.field314[0] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field283.field314[0] = var30;
                }
                var31 = var30;
            } catch (Throwable var88) {
                var31 = new class43();
            }
            Statics.field5025 = var31;
            Statics.field1710 = new class39();
            class39 var33 = new class39();
            var33.method732(Statics.field1710);
            for (int var34 = 0; var34 < 3; var34++) {
                class321 var35 = new class321();
                var35.method5513(9, 128);
                var33.method732(var35);
                var27.add(var35);
            }
            Statics.field5025.method803(var33);
            class373 var36 = Statics.field995;
            class373 var37 = Statics.field3429;
            class373 var38 = Statics.field4845;
            Statics.field3459 = var36;
            Statics.field3456 = var37;
            Statics.field3457 = var38;
            class320.field3458 = var27;
            Statics.field1434 = new class58(22050, Statics.field1994);
            class76.field913 = class367.field4273;
            class76.field912 = 35;
            field529 = class93.field1137;
            Statics.field2558 = new class500(Statics.field95, Statics.field2091);
        } else if (field529 == class93.field1137) {
            class501[] var39 = new class501[] { class501.field5033, class501.field5031, class501.field5030, class501.field5038, class501.field5039, class501.field5032 };
            int var40 = var39.length;
            class500 var41 = Statics.field2558;
            class501[] var42 = new class501[] { class501.field5033, class501.field5031, class501.field5030, class501.field5038, class501.field5039, class501.field5032 };
            field566 = var41.method8256(var42);
            if (field566.size() < var40) {
                class76.field913 = class367.field3996 + field566.size() * 100 / var40 + "%";
                class76.field912 = 40;
            } else {
                Statics.field1454 = (class410) field566.get(class501.field5038);
                Statics.field3619 = (class410) field566.get(class501.field5031);
                Statics.field1089 = (class410) field566.get(class501.field5032);
                Statics.field824 = field530.method8004();
                class76.field913 = class367.field3997;
                class76.field912 = 40;
                field529 = class93.field1134;
            }
        } else if (field529 == class93.field1134) {
            class373 var43 = Statics.field1996;
            class373 var44 = Statics.field95;
            int var45 = 0;
            String[] var46 = class76.field942;
            for (int var47 = 0; var47 < var46.length; var47++) {
                String var48 = var46[var47];
                if (var43.method6416(var48, "")) {
                    var45++;
                }
            }
            String[] var49 = class76.field943;
            for (int var50 = 0; var50 < var49.length; var50++) {
                String var51 = var49[var50];
                if (var44.method6416(var51, "")) {
                    var45++;
                }
            }
            String[] var52 = class76.field944;
            for (int var53 = 0; var53 < var52.length; var53++) {
                String var54 = var52[var53];
                if (var44.method6412(var54) != -1 && var44.method6416(var54, "")) {
                    var45++;
                }
            }
            int var57 = class76.method6393(Statics.field95);
            if (var45 < var57) {
                class76.field913 = class367.field3998 + var45 * 100 / var57 + "%";
                class76.field912 = 50;
            } else {
                class76.field913 = class367.field3999;
                class76.field912 = 50;
                Statics.method2960(5);
                field529 = class93.field1136;
            }
        } else if (field529 == class93.field1136) {
            if (!Statics.field243.method6439()) {
                class76.field913 = class367.field4153 + Statics.field243.method6362() + "%";
                class76.field912 = 60;
            } else if (Statics.field81.method6439()) {
                class204.method2238(Statics.field243);
                class195.method3579(Statics.field243);
                class373 var58 = Statics.field243;
                class373 var59 = Statics.field3549;
                Statics.field1871 = var58;
                Statics.field1878 = var59;
                Statics.field1872 = Statics.field1871.method6406(3);
                class373 var60 = Statics.field243;
                class373 var61 = Statics.field3549;
                boolean var62 = field503;
                Statics.field2095 = var60;
                Statics.field2103 = var61;
                class202.field2140 = var62;
                class189.method166(Statics.field243, Statics.field3549);
                class373 var63 = Statics.field243;
                Statics.field2065 = var63;
                class373 var64 = Statics.field243;
                class373 var65 = Statics.field3549;
                boolean var66 = field680;
                class410 var67 = Statics.field1454;
                Statics.field2156 = var64;
                Statics.field1782 = var65;
                Statics.field5062 = var66;
                Statics.field3063 = Statics.field2156.method6406(10);
                Statics.field2159 = var67;
                class205.method3396(Statics.field243, Statics.field3863, Statics.field2908);
                class194.method2903(Statics.field243, Statics.field3549);
                class197.method1189(Statics.field243);
                class176.method2167(Statics.field243);
                Statics.field4415 = new class339(Statics.field1821, Statics.field3549, Statics.field95, Statics.field2091, Statics.field2282);
                class171.method7677(Statics.field243);
                class373 var68 = Statics.field243;
                Statics.field1915 = var68;
                class373 var69 = Statics.field243;
                Statics.field1865 = var69;
                class196.method5473(Statics.field243);
                class199.method5417(Statics.field243);
                class373 var70 = Statics.field243;
                Statics.field5119 = var70;
                class524.method7421(Statics.field243);
                Statics.field4451 = new class514(Statics.field4, 54, Statics.field1147, Statics.field243);
                Statics.field1838 = new class514(Statics.field4, 47, Statics.field1147, Statics.field243);
                Statics.field1293 = new class110();
                class373 var71 = Statics.field243;
                class373 var72 = Statics.field95;
                class373 var73 = Statics.field2091;
                Statics.field2093 = var71;
                Statics.field4418 = var72;
                Statics.field2089 = var73;
                class373 var74 = Statics.field243;
                class373 var75 = Statics.field95;
                Statics.field1903 = var74;
                Statics.field1885 = var75;
                class373 var76 = Statics.field243;
                class373 var77 = Statics.field95;
                Statics.field1847 = var77;
                if (var76.method6439()) {
                    Statics.field1688 = var76.method6406(35);
                    Statics.field1851 = new class178[Statics.field1688];
                    for (int var78 = 0; var78 < Statics.field1688; var78++) {
                        byte[] var79 = var76.method6396(35, var78);
                        Statics.field1851[var78] = new class178(var78);
                        if (var79 != null) {
                            Statics.field1851[var78].method3303(new class531(var79));
                            Statics.field1851[var78].method3278();
                        }
                    }
                }
                class76.field913 = class367.field4001;
                class76.field912 = 60;
                field529 = class93.field1141;
            } else {
                class76.field913 = class367.field4153 + (80 + Statics.field3891.method6362() / 6) + "%";
                class76.field912 = 60;
            }
        } else if (field529 == class93.field1141) {
            int var80 = 0;
            if (Statics.field3122 == null) {
                Statics.field3122 = class546.method3015(Statics.field95, Statics.field3518.field4780, 0);
            } else {
                var80++;
            }
            if (Statics.field1667 == null) {
                Statics.field1667 = class546.method3015(Statics.field95, Statics.field3518.field4778, 0);
            } else {
                var80++;
            }
            if (Statics.field2487 == null) {
                Statics.field2487 = class546.method3531(Statics.field95, Statics.field3518.field4779, 0);
            } else {
                var80++;
            }
            if (Statics.field1249 == null) {
                Statics.field1249 = class546.method3951(Statics.field95, Statics.field3518.field4781, 0);
            } else {
                var80++;
            }
            if (Statics.field53 == null) {
                Statics.field53 = class546.method3951(Statics.field95, Statics.field3518.field4782, 0);
            } else {
                var80++;
            }
            if (Statics.field496 == null) {
                Statics.field496 = class546.method3951(Statics.field95, Statics.field3518.field4783, 0);
            } else {
                var80++;
            }
            if (Statics.field3974 == null) {
                Statics.field3974 = class546.method3951(Statics.field95, Statics.field3518.field4784, 0);
            } else {
                var80++;
            }
            if (Statics.field1347 == null) {
                Statics.field1347 = class546.method3951(Statics.field95, Statics.field3518.field4785, 0);
            } else {
                var80++;
            }
            if (Statics.field1635 == null) {
                Statics.field1635 = class546.method3951(Statics.field95, Statics.field3518.field4786, 0);
            } else {
                var80++;
            }
            if (Statics.field3933 == null) {
                Statics.field3933 = class546.method3531(Statics.field95, Statics.field3518.field4787, 0);
            } else {
                var80++;
            }
            if (Statics.field105 == null) {
                Statics.field105 = class546.method3531(Statics.field95, Statics.field3518.field4788, 0);
            } else {
                var80++;
            }
            if (var80 < 11) {
                class76.field913 = class367.field4002 + var80 * 100 / 12 + "%";
                class76.field912 = 70;
            } else {
                Statics.field4559 = Statics.field105;
                Statics.field1667.method8988();
                int var81 = (int) (Math.random() * 21.0D) - 10;
                int var82 = (int) (Math.random() * 21.0D) - 10;
                int var83 = (int) (Math.random() * 21.0D) - 10;
                int var84 = (int) (Math.random() * 41.0D) - 20;
                Statics.field2487[0].method8964(var81 + var84, var82 + var84, var83 + var84);
                class76.field913 = class367.field4003;
                class76.field912 = 70;
                field529 = class93.field1132;
            }
        } else if (field529 == class93.field1132) {
            if (Statics.field1490.method6439()) {
                Statics.field1037 = new class280(Statics.field1490, Statics.field95, 20, Statics.field1155.method2447(), field503 ? 64 : 128);
                class270.method4746(Statics.field1037);
                class270.method4794(Statics.field1155.method2447());
                field529 = class93.field1138;
            } else {
                class76.field913 = class367.field4004 + "0%";
                class76.field912 = 90;
            }
        } else if (field529 == class93.field1138) {
            int var85 = Statics.field1037.method5086();
            if (var85 < 100) {
                class76.field913 = class367.field4004 + var85 + "%";
                class76.field912 = 90;
            } else {
                class76.field913 = class367.field4005;
                class76.field912 = 90;
                field529 = class93.field1142;
            }
        } else if (field529 == class93.field1142) {
            Statics.field118 = new class89();
            Statics.field198.method3903(Statics.field118, 10);
            class76.field913 = class367.field4006;
            class76.field912 = 92;
            field529 = class93.field1129;
        } else if (field529 == class93.field1129) {
            if (Statics.field1996.method6416("huffman", "")) {
                class353 var86 = new class353(Statics.field1996.method6415("huffman", ""));
                class354.method3906(var86);
                class76.field913 = class367.field4008;
                class76.field912 = 94;
                field529 = class93.field1139;
            } else {
                class76.field913 = class367.field4142 + "%";
                class76.field912 = 94;
            }
        } else if (field529 == class93.field1139) {
            if (!Statics.field1821.method6439()) {
                class76.field913 = class367.field4009 + Statics.field1821.method6362() * 4 / 5 + "%";
                class76.field912 = 96;
            } else if (!Statics.field2282.method6439()) {
                class76.field913 = class367.field4009 + Statics.field2282.method6362() * 4 / 5 + "%";
                class76.field912 = 96;
            } else if (!Statics.field3891.method6439()) {
                class76.field913 = class367.field4009 + (80 + Statics.field3891.method6362() / 6) + "%";
                class76.field912 = 96;
            } else if (Statics.field2091.method6439()) {
                class76.field913 = class367.field4010;
                class76.field912 = 98;
                if (Statics.field3891.method6414("version.dat", "")) {
                    class531 var87 = new class531(Statics.field3891.method6415("version.dat", ""));
                    var87.method8775();
                }
                field529 = class93.field1143;
            } else {
                class76.field913 = class367.field4009 + (96 + Statics.field2091.method6362() / 50) + "%";
                class76.field912 = 96;
            }
        } else if (field529 == class93.field1143) {
            class76.field912 = 100;
            if (Statics.field3285.method6398() <= 0 || Statics.field3285.method6417(class259.field2670.field2676)) {
                if (Statics.field4432 == null) {
                    Statics.field4432 = new class499();
                    Statics.field4432.method8060(Statics.field3285, Statics.field1522, Statics.field1633, Statics.field1089, field566, Statics.field2487);
                }
                class76.field913 = class367.field4012;
                field529 = class93.field1144;
            } else {
                class76.field913 = class367.field4234 + Statics.field3285.method6427(class259.field2670.field2676) / 10 + "%";
            }
        } else if (field529 == class93.field1144) {
            Statics.method2960(10);
        }
    }

    @ObfuscatedName("dg.ij(IZZZZB)Loz;")
    public static class373 method2182(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class459 var5 = null;
        if (class213.field2308 != null) {
            var5 = new class459(arg0, class213.field2308, Statics.field2310[arg0], 1000000);
        }
        return new class373(var5, Statics.field3923, Statics.field1419, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("client.iq(I)V")
    public final void method1203() {
        class455 var1 = field561.method2751();
        class530 var2 = field561.field1405;
        try {
            if (field533 == 0) {
                if (Statics.field1754 == null && (field613.method2141() || field534 > 250)) {
                    Statics.field1754 = field613.method2142();
                    field613.method2139();
                    field613 = null;
                }
                if (Statics.field1754 != null) {
                    if (var1 != null) {
                        var1.method7662();
                        var1 = null;
                    }
                    Statics.field1564 = null;
                    field564 = false;
                    field534 = 0;
                    if (!field627.method8843()) {
                        Statics.method2809(1);
                    } else if (this.method1711()) {
                        try {
                            this.method1597(Statics.field5);
                            Statics.method2809(21);
                        } catch (Throwable var63) {
                            class557.method6332((String) null, var63);
                            method2542(65);
                            return;
                        }
                    } else if (this.method1197()) {
                        try {
                            this.method1208(Statics.field1766, Statics.field438);
                            Statics.method2809(20);
                        } catch (Exception var62) {
                            class557.method6332((String) null, var62);
                            method2542(65);
                            return;
                        }
                    } else {
                        method2542(65);
                        return;
                    }
                }
            }
            if (field533 == 21) {
                if (this.field548 == null) {
                    if (this.field727 == null) {
                        method2542(65);
                        return;
                    }
                    if (!this.field727.method272()) {
                        return;
                    }
                    if (this.field727.method271()) {
                        class557.method6332(this.field727.method273(), (Throwable) null);
                        method2542(65);
                        this.field727 = null;
                        return;
                    }
                    class21 var7 = this.field727.method283();
                    if (var7.method297() != 200) {
                        method2542(65);
                        this.field727 = null;
                        return;
                    }
                    field534 = 0;
                    class479 var8 = new class479(var7.method299());
                    try {
                        Statics.field38 = var8.method7943().getString("access_token");
                        Statics.field5 = var8.method7943().getString("refresh_token");
                    } catch (Exception var60) {
                        class557.method6332("Error parsing tokens", var60);
                        method2542(65);
                        this.field727 = null;
                        return;
                    }
                } else if (this.field548.isDone()) {
                    if (this.field548.isCancelled()) {
                        method2542(65);
                        this.field548 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field548.get();
                        if (!var5.isSuccess()) {
                            method2542(65);
                            this.field548 = null;
                            return;
                        }
                        Statics.field38 = var5.getAccessToken();
                        Statics.field5 = var5.getRefreshToken();
                        this.field548 = null;
                    } catch (Exception var61) {
                        class557.method6332((String) null, var61);
                        method2542(65);
                        this.field548 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1445(Statics.field38);
                Statics.method2809(20);
            }
            if (field533 == 20) {
                if (this.field543 == null) {
                    if (this.field541 == null) {
                        method2542(65);
                        return;
                    }
                    if (!this.field541.method272()) {
                        return;
                    }
                    if (this.field541.method271()) {
                        class557.method6332(this.field541.method273(), (Throwable) null);
                        method2542(65);
                        this.field541 = null;
                        return;
                    }
                    class21 var12 = this.field541.method283();
                    if (var12.method297() != 200) {
                        class557.method6332("Response code: " + var12.method297() + "Response body: " + var12.method299(), (Throwable) null);
                        method2542(65);
                        this.field541 = null;
                        return;
                    }
                    List var13 = (List) var12.method295().get("Content-Type");
                    if (var13 != null && var13.contains(class477.field4848.method7932())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method299());
                            this.field539 = var14.getString("token");
                        } catch (JSONException var58) {
                            class557.method6332((String) null, var58);
                            method2542(65);
                            this.field541 = null;
                            return;
                        }
                    } else {
                        this.field539 = var12.method299();
                    }
                    this.field541 = null;
                } else if (this.field543.isDone()) {
                    if (this.field543.isCancelled()) {
                        method2542(65);
                        this.field543 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field543.get();
                        if (!var10.isSuccess()) {
                            method2542(65);
                            this.field543 = null;
                            return;
                        }
                        this.field539 = var10.getToken();
                        this.field543 = null;
                    } catch (Exception var59) {
                        class557.method6332((String) null, var59);
                        method2542(65);
                        this.field543 = null;
                        return;
                    }
                } else {
                    return;
                }
                field534 = 0;
                Statics.method2809(1);
            }
            if (field533 == 1) {
                if (Statics.field1564 == null) {
                    Statics.field1564 = Statics.field198.method3889(Statics.field1807, Statics.field491);
                }
                if (Statics.field1564.field2344 == 2) {
                    throw new IOException();
                }
                if (Statics.field1564.field2344 == 1) {
                    var1 = class455.method4492((Socket) Statics.field1564.field2350, 40000, 5000);
                    field561.method2741(var1);
                    Statics.field1564 = null;
                    Statics.method2809(2);
                }
            }
            if (field533 == 2) {
                field561.method2752();
                class311 var16 = Statics.method2150();
                var16.field3281 = null;
                var16.field3278 = 0;
                var16.field3279 = new class530(5000);
                var16.field3279.method8699(class313.field3422.field3421);
                field561.method2736(var16);
                field561.method2735();
                var2.field5181 = 0;
                Statics.method2809(3);
            }
            if (field533 == 3) {
                if (Statics.field5025 != null) {
                    Statics.field5025.method821();
                }
                if (var1.method7658(1)) {
                    int var19 = var1.method7671();
                    if (Statics.field5025 != null) {
                        Statics.field5025.method821();
                    }
                    if (var19 != 0) {
                        method2542(var19);
                        return;
                    }
                    var2.field5181 = 0;
                    Statics.method2809(4);
                }
            }
            if (field533 == 4) {
                if (var2.field5181 < 8) {
                    int var20 = var1.method7659();
                    if (var20 > 8 - var2.field5181) {
                        var20 = 8 - var2.field5181;
                    }
                    if (var20 > 0) {
                        var1.method7666(var2.field5178, var2.field5181, var20);
                        var2.field5181 += var20;
                    }
                }
                if (var2.field5181 == 8) {
                    var2.field5181 = 0;
                    Statics.field1595 = var2.method8567();
                    Statics.method2809(5);
                }
            }
            if (field533 == 5) {
                field561.field1405.field5181 = 0;
                field561.method2752();
                class530 var21 = new class530(500);
                int[] var22 = new int[] { Statics.field1754.nextInt(), Statics.field1754.nextInt(), Statics.field1754.nextInt(), Statics.field1754.nextInt() };
                var21.field5181 = 0;
                var21.method8699(1);
                var21.method8547(var22[0]);
                var21.method8547(var22[1]);
                var21.method8547(var22[2]);
                var21.method8547(var22[3]);
                var21.method8651(Statics.field1595);
                if (field508 == 40) {
                    var21.method8547(Statics.field76[0]);
                    var21.method8547(Statics.field76[1]);
                    var21.method8547(Statics.field76[2]);
                    var21.method8547(Statics.field76[3]);
                } else {
                    if (field508 == 50) {
                        var21.method8699(class125.field1474.method34());
                        var21.method8547(Statics.field1341);
                    } else {
                        var21.method8699(field576.method34());
                        switch(field576.field1476) {
                            case 0:
                            case 4:
                                var21.method8778(Statics.field1526);
                                var21.field5181++;
                                break;
                            case 1:
                                var21.method8547(Statics.field1155.method2459(class76.field904));
                            case 2:
                            default:
                                break;
                            case 3:
                                var21.field5181 += 4;
                        }
                    }
                    if (field627.method8843()) {
                        var21.method8699(class536.field5234.method34());
                        var21.method8551(this.field539);
                    } else {
                        var21.method8699(class536.field5236.method34());
                        var21.method8551(class76.field924);
                    }
                }
                var21.method8587(class75.field899, class75.field903);
                Statics.field76 = var22;
                class311 var23 = Statics.method2150();
                var23.field3281 = null;
                var23.field3278 = 0;
                var23.field3279 = new class530(5000);
                var23.field3279.field5181 = 0;
                if (field508 == 40) {
                    var23.field3279.method8699(class313.field3416.field3421);
                } else {
                    var23.field3279.method8699(class313.field3417.field3421);
                }
                var23.field3279.method8737(0);
                int var26 = var23.field3279.field5181;
                var23.field3279.method8547(219);
                var23.field3279.method8547(1);
                var23.field3279.method8699(field536);
                var23.field3279.method8699(field668);
                byte var27 = 0;
                var23.field3279.method8699(var27);
                var23.field3279.method8554(var21.field5178, 0, var21.field5181);
                int var28 = var23.field3279.field5181;
                var23.field3279.method8551(class76.field904);
                var23.field3279.method8699((field660 ? 1 : 0) << 1 | (field503 ? 1 : 0));
                var23.field3279.method8737(Statics.field5134);
                var23.field3279.method8737(Statics.field199);
                method165(var23.field3279);
                var23.field3279.method8551(Statics.field4609);
                var23.field3279.method8547(Statics.field2468);
                var23.field3279.method8699(0);
                class531 var29 = new class531(Statics.field824.method8011());
                Statics.field824.method8012(var29);
                var23.field3279.method8554(var29.field5178, 0, var29.field5178.length);
                var23.field3279.method8699(field536);
                var23.field3279.method8547(0);
                var23.field3279.method8668(Statics.field1633.field4370);
                var23.field3279.method8668(Statics.field995.field4370);
                var23.field3279.method8613(Statics.field95.field4370);
                var23.field3279.method8611(Statics.field1490.field4370);
                var23.field3279.method8613(Statics.field3891.field4370);
                var23.field3279.method8611(Statics.field4845.field4370);
                var23.field3279.method8668(Statics.field2628.field4370);
                var23.field3279.method8613(Statics.field3429.field4370);
                var23.field3279.method8547(Statics.field160.field4370);
                var23.field3279.method8613(0);
                var23.field3279.method8547(Statics.field3549.field4370);
                var23.field3279.method8611(Statics.field2091.field4370);
                var23.field3279.method8668(Statics.field1996.field4370);
                var23.field3279.method8668(Statics.field1522.field4370);
                var23.field3279.method8668(Statics.field2588.field4370);
                var23.field3279.method8611(Statics.field3285.field4370);
                var23.field3279.method8613(Statics.field2908.field4370);
                var23.field3279.method8611(Statics.field243.field4370);
                var23.field3279.method8611(Statics.field2000.field4370);
                var23.field3279.method8613(Statics.field3863.field4370);
                var23.field3279.method8613(Statics.field1821.field4370);
                var23.field3279.method8585(var22, var28, var23.field3279.field5181);
                var23.field3279.method8557(var23.field3279.field5181 - var26);
                field561.method2736(var23);
                field561.method2735();
                field561.field1404 = new class548(var22);
                int[] var30 = new int[4];
                for (int var31 = 0; var31 < 4; var31++) {
                    var30[var31] = var22[var31] + 50;
                }
                var2.method8522(var30);
                Statics.method2809(6);
            }
            if (field533 == 6 && var1.method7659() > 0) {
                int var32 = var1.method7671();
                if (var32 == 61) {
                    int var33 = var1.method7659();
                    Statics.field4356 = var33 == 1 && var1.method7671() == 1;
                    Statics.method2809(5);
                }
                if (var32 == 21 && field508 == 20) {
                    Statics.method2809(12);
                } else if (var32 == 2) {
                    Statics.method2809(14);
                } else if (var32 == 15 && field508 == 40) {
                    field561.field1407 = -1;
                    Statics.method2809(19);
                } else if (var32 == 64) {
                    Statics.method2809(10);
                } else if (var32 == 23 && field535 < 1) {
                    field535++;
                    Statics.method2809(0);
                } else if (var32 == 29) {
                    Statics.method2809(17);
                } else if (var32 == 69) {
                    Statics.method2809(7);
                } else {
                    method2542(var32);
                    return;
                }
            }
            if (field533 == 7 && var1.method7659() >= 2) {
                var1.method7666(var2.field5178, 0, 2);
                var2.field5181 = 0;
                Statics.field3533 = var2.method8775();
                Statics.method2809(8);
            }
            if (field533 == 8 && var1.method7659() >= Statics.field3533) {
                var2.field5181 = 0;
                var1.method7666(var2.field5178, var2.field5181, Statics.field3533);
                class7 var34 = class7.method462()[var2.method8561()];
                try {
                    switch(var34.field10) {
                        case 0:
                            class1 var35 = new class1();
                            this.field696 = new class8(var2, var35);
                            Statics.method2809(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var57) {
                    method2542(22);
                    return;
                }
            }
            if (field533 == 9 && this.field696.method42()) {
                this.field553 = this.field696.method44();
                this.field696.method43();
                this.field696 = null;
                if (this.field553 == null) {
                    method2542(22);
                    return;
                }
                field561.method2752();
                class311 var38 = Statics.method2150();
                var38.field3281 = null;
                var38.field3278 = 0;
                var38.field3279 = new class530(5000);
                var38.field3279.method8699(class313.field3415.field3421);
                var38.field3279.method8737(this.field553.field5181);
                var38.field3279.method8634(this.field553);
                field561.method2736(var38);
                field561.method2735();
                this.field553 = null;
                Statics.method2809(6);
            }
            if (field533 == 10 && var1.method7659() > 0) {
                Statics.field3865 = var1.method7671();
                Statics.method2809(11);
            }
            if (field533 == 11 && var1.method7659() >= Statics.field3865) {
                var1.method7666(var2.field5178, 0, Statics.field3865);
                var2.field5181 = 0;
                Statics.method2809(6);
            }
            if (field533 == 12 && var1.method7659() > 0) {
                field746 = (var1.method7671() + 3) * 60;
                Statics.method2809(13);
            }
            if (field533 == 13) {
                field534 = 0;
                class76.method3074(class367.field4019, class367.field4020, field746 / 60 + class367.field4117);
                if (--field746 <= 0) {
                    Statics.method2809(0);
                }
            } else {
                if (field533 == 14 && var1.method7659() >= 1) {
                    Statics.field370 = var1.method7671();
                    Statics.method2809(15);
                }
                if (field533 == 15 && var1.method7659() >= Statics.field370) {
                    boolean var41 = var1.method7671() == 1;
                    var1.method7666(var2.field5178, 0, 4);
                    var2.field5181 = 0;
                    boolean var42 = false;
                    if (var41) {
                        int var43 = var2.method8499() << 24;
                        int var44 = var43 | var2.method8499() << 16;
                        int var45 = var44 | var2.method8499() << 8;
                        int var46 = var45 | var2.method8499();
                        Statics.field1155.method2457(class76.field904, var46);
                    }
                    if (field551) {
                        Statics.field1155.method2503(class76.field904);
                    } else {
                        Statics.field1155.method2503((String) null);
                    }
                    class99.method6940();
                    field679 = var1.method7671();
                    field517 = var1.method7671() == 1;
                    field625 = var1.method7671();
                    field625 <<= 0x8;
                    field625 += var1.method7671();
                    field519 = var1.method7671();
                    var1.method7666(var2.field5178, 0, 8);
                    var2.field5181 = 0;
                    this.field592 = var2.method8567();
                    var1.method7666(var2.field5178, 0, 8);
                    var2.field5181 = 0;
                    field510 = var2.method8567();
                    var1.method7666(var2.field5178, 0, 8);
                    var2.field5181 = 0;
                    field628 = var2.method8567();
                    class218.method3348().method3943();
                    Statics.method2809(22);
                }
                if (field533 == 22 && var1.method7659() >= field561.field1407) {
                    var1.method7666(var2.field5178, 0, 1);
                    var2.field5181 = 0;
                    if (var2.method8500()) {
                        var1.method7666(var2.field5178, 1, 1);
                        var2.field5181 = 0;
                    }
                    class312[] var47 = class312.method3076();
                    int var48 = var2.method8501();
                    if (var48 < 0 || var48 >= var47.length) {
                        throw new IOException("Invalid ServerProt: " + var48 + " at " + var2.field5181);
                    }
                    field561.field1414 = var47[var48];
                    field561.field1407 = field561.field1414.field3374;
                    var1.method7666(var2.field5178, 0, 2);
                    var2.field5181 = 0;
                    field561.field1407 = var2.method8775();
                    try {
                        client var49 = Statics.field3067;
                        JSObject.getWindow(var49).call("zap", (Object[]) null);
                    } catch (Throwable var56) {
                    }
                    Statics.method2809(16);
                }
                if (field533 != 16) {
                    if (field533 == 17 && var1.method7659() >= 2) {
                        var2.field5181 = 0;
                        var1.method7666(var2.field5178, 0, 2);
                        var2.field5181 = 0;
                        Statics.field2447 = var2.method8775();
                        Statics.method2809(18);
                    }
                    if (field533 == 18 && var1.method7659() >= Statics.field2447) {
                        var2.field5181 = 0;
                        var1.method7666(var2.field5178, 0, Statics.field2447);
                        var2.field5181 = 0;
                        String var51 = var2.method8641();
                        String var52 = var2.method8641();
                        String var53 = var2.method8641();
                        class76.method3074(var51, var52, var53);
                        Statics.method2960(10);
                        if (field627.method8843()) {
                            class76.method2388(9);
                        }
                    }
                    if (field533 == 19) {
                        if (field561.field1407 == -1) {
                            if (var1.method7659() < 2) {
                                return;
                            }
                            var1.method7666(var2.field5178, 0, 2);
                            var2.field5181 = 0;
                            field561.field1407 = var2.method8775();
                        }
                        if (var1.method7659() >= field561.field1407) {
                            var1.method7666(var2.field5178, 0, field561.field1407);
                            var2.field5181 = 0;
                            int var54 = field561.field1407;
                            field538.method7341();
                            method711();
                            class108.method5414(var2);
                            if (var2.field5181 != var54) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field534++;
                        if (field534 > 2000) {
                            if (field535 < 1) {
                                if (Statics.field491 == Statics.field1029) {
                                    Statics.field491 = Statics.field60;
                                } else {
                                    Statics.field491 = Statics.field1029;
                                }
                                field535++;
                                Statics.method2809(0);
                            } else {
                                method2542(-3);
                            }
                        }
                    }
                } else if (var1.method7659() >= field561.field1407) {
                    var2.field5181 = 0;
                    var1.method7666(var2.field5178, 0, field561.field1407);
                    field538.method7345();
                    method3311();
                    class108.method5414(var2);
                    Statics.field135 = -1;
                    method7892(false, var2);
                    field561.field1414 = null;
                }
            }
        } catch (IOException var64) {
            if (field535 < 1) {
                if (Statics.field491 == Statics.field1029) {
                    Statics.field491 = Statics.field60;
                } else {
                    Statics.field491 = Statics.field1029;
                }
                field535++;
                Statics.method2809(0);
            } else {
                method2542(-2);
            }
        }
    }

    @ObfuscatedName("gw.ic(B)V")
    public static void method3311() {
        field512 = -1L;
        Statics.field118.field1072 = 0;
        Statics.field161 = true;
        field516 = true;
        field742 = -1L;
        class37.method7898();
        field561.method2752();
        field561.field1405.field5181 = 0;
        field561.field1414 = null;
        field561.field1403 = null;
        field561.field1412 = null;
        field561.field1408 = null;
        field561.field1407 = 0;
        field561.field1400 = 0;
        field590 = 0;
        field563 = 0;
        field514 = 0;
        method214();
        class36.field221 = 0;
        Statics.method3395();
        field741 = 0;
        field722 = false;
        field754 = 0;
        field580 = 0;
        field630 = 0;
        Statics.field3600 = null;
        field752 = 0;
        field733 = -1;
        field750 = 0;
        field571 = 0;
        field798 = class104.field1331;
        field527 = class104.field1331;
        field558 = 0;
        class108.field1351 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class108.field1348[var0] = null;
            class108.field1349[var0] = class232.field2459;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field738[var1] = null;
        }
        for (int var2 = 0; var2 < 65536; var2++) {
            field557[var2] = null;
        }
        field637 = -1;
        field587.method6664();
        field782.method6664();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field644[var3][var4][var5] = null;
                }
            }
        }
        field639 = new class394();
        Statics.field3588.method1824();
        if (Statics.field3857 > 5000) {
        }
        for (int var6 = 0; var6 < Statics.field3857; var6++) {
            class176 var7 = class176.method2945(var6);
            if (var7 != null) {
                class336.field3597[var6] = 0;
                class336.field3598[var6] = 0;
            }
        }
        Statics.field1293.method2709();
        field554 = -1;
        if (field671 != -1) {
            Statics.field4415.method5740(field671);
        }
        for (class87 var8 = (class87) field655.method8304(); var8 != null; var8 = (class87) field655.method8302()) {
            method6317(var8, true);
        }
        field671 = -1;
        field655 = new class505(8);
        field522 = null;
        method214();
        field621.method5767((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field634[var9] = null;
            field635[var9] = false;
        }
        class85.method84();
        field691 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field721[var10] = true;
        }
        Statics.method6275();
        Statics.field1292 = null;
        Statics.field1427 = null;
        Arrays.fill(field743, (Object) null);
        Statics.field1443 = null;
        Arrays.fill(field744, (Object) null);
        for (int var11 = 0; var11 < 8; var11++) {
            field790[var11] = new class384();
        }
        Statics.field4412 = null;
        field545 = false;
    }

    @ObfuscatedName("bc.ip(I)V")
    public static void method711() {
        field561.method2752();
        field561.field1405.field5181 = 0;
        field561.field1414 = null;
        field561.field1403 = null;
        field561.field1412 = null;
        field561.field1408 = null;
        field561.field1407 = 0;
        field561.field1400 = 0;
        field590 = 0;
        method214();
        field752 = 0;
        field750 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field738[var0] = null;
        }
        Statics.field133 = null;
        for (int var1 = 0; var1 < field557.length; var1++) {
            class101 var2 = field557[var1];
            if (var2 != null) {
                var2.field1207 = -1;
                var2.field1208 = false;
            }
        }
        class85.method84();
        Statics.method2960(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field721[var3] = true;
        }
        Statics.method6275();
    }

    @ObfuscatedName("dq.io(II)V")
    public static void method2542(int arg0) {
        int var1 = class76.field918;
        if (arg0 == -3) {
            class76.method3074(class367.field4184, class367.field4230, class367.field4024);
        } else if (arg0 == -2) {
            class76.method3074(class367.field4025, class367.field4203, class367.field4124);
        } else if (arg0 == -1) {
            class76.method3074(class367.field4028, class367.field4029, class367.field4030);
        } else if (arg0 == 3) {
            class76.method2388(3);
            class76.field917 = 1;
        } else if (arg0 == 4) {
            class76.method2388(14);
            class76.field920 = 0;
        } else if (arg0 == 5) {
            class76.field917 = 2;
            class76.method3074(class367.field4034, class367.field4035, class367.field4036);
        } else if (arg0 == 68) {
            if (!field545) {
                field545 = true;
                method5115();
                return;
            }
            class76.method3074(class367.field4037, class367.field4201, class367.field4039);
        } else if (!field507 && arg0 == 6) {
            class76.method3074(class367.field4037, class367.field4201, class367.field4039);
        } else if (arg0 == 7) {
            class76.method3074(class367.field4040, class367.field4041, class367.field4233);
        } else if (arg0 == 8) {
            class76.method3074(class367.field4283, class367.field4044, class367.field4193);
        } else if (arg0 == 9) {
            class76.method3074(class367.field4046, class367.field4047, class367.field4048);
        } else if (arg0 == 10) {
            class76.method3074(class367.field4049, class367.field4125, class367.field4264);
        } else if (arg0 == 11) {
            class76.method3074(class367.field4052, class367.field4053, class367.field4054);
        } else if (arg0 == 12) {
            class76.method3074(class367.field4055, class367.field4114, class367.field4224);
        } else if (arg0 == 13) {
            class76.method3074(class367.field4013, class367.field4163, class367.field4060);
        } else if (arg0 == 14) {
            class76.method3074(class367.field3995, class367.field4062, class367.field4063);
        } else if (arg0 == 16) {
            class76.method3074(class367.field4064, class367.field4065, class367.field4043);
            class76.method2388(33);
        } else if (arg0 == 17) {
            class76.method3074(class367.field3990, class367.field4068, class367.field4175);
        } else if (arg0 == 18) {
            class76.method2388(14);
            class76.field920 = 1;
        } else if (arg0 == 19) {
            class76.method3074(class367.field4171, class367.field4074, class367.field4086);
        } else if (arg0 == 20) {
            class76.method3074(class367.field4076, class367.field4077, class367.field4078);
        } else if (arg0 == 22) {
            class76.method3074(class367.field4165, class367.field4080, class367.field4154);
        } else if (arg0 == 23) {
            class76.method3074(class367.field4045, class367.field4206, class367.field4084);
        } else if (arg0 == 24) {
            class76.method3074(class367.field4085, class367.field4150, class367.field4087);
        } else if (arg0 == 25) {
            class76.method3074(class367.field4088, class367.field4089, class367.field4090);
        } else if (arg0 == 26) {
            class76.method3074(class367.field4100, class367.field4092, class367.field4093);
        } else if (arg0 == 27) {
            class76.method3074(class367.field4094, class367.field4158, class367.field4231);
        } else if (arg0 == 31) {
            class76.method3074(class367.field4067, class367.field4122, class367.field4105);
        } else if (arg0 == 32) {
            class76.method2388(14);
            class76.field920 = 2;
        } else if (arg0 == 37) {
            class76.method3074(class367.field4109, class367.field4110, class367.field4111);
        } else if (arg0 == 38) {
            class76.method3074(class367.field4223, class367.field4183, class367.field4137);
        } else if (arg0 == 55) {
            class76.method2388(8);
        } else if (arg0 == 56) {
            class76.method3074(class367.field4119, class367.field4069, class367.field4121);
            Statics.method2960(11);
            return;
        } else if (arg0 == 57) {
            class76.method3074(class367.field4244, class367.field4123, class367.field4023);
            Statics.method2960(11);
            return;
        } else if (arg0 == 61) {
            class76.method3074("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class76.method2388(7);
        } else if (arg0 == 62) {
            Statics.method2960(10);
            class76.method2388(9);
            class76.method3074(class367.field4187, class367.field4126, class367.field4127);
            return;
        } else if (arg0 == 63) {
            Statics.method2960(10);
            class76.method2388(9);
            class76.method3074(class367.field4128, class367.field4129, class367.field4073);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            Statics.method2960(10);
            class76.method2388(9);
            class76.method3074(class367.field4131, class367.field4132, class367.field4133);
            return;
        } else if (arg0 == 71) {
            Statics.method2960(10);
            class76.method2388(7);
            class76.method3074("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            Statics.method2960(10);
            class76.method2388(6);
            class76.method3074(class367.field4262, class367.field4263, class367.field4079);
        } else if (arg0 == 72) {
            Statics.method2960(10);
            class76.method2388(32);
        } else {
            class76.method3074(class367.field4134, class367.field4135, class367.field4136);
        }
        Statics.method2960(10);
        int var4 = class76.field918;
        boolean var5 = var1 != var4;
        if (!var5 && field627.method8843()) {
            class76.method2388(9);
        }
    }

    @ObfuscatedName("ch.ie(II)V")
    public static final void method1817(int arg0) {
        Statics.method3461();
        switch(arg0) {
            case 1:
                class76.method4585();
                break;
            case 2:
                class76.method429();
        }
    }

    @ObfuscatedName("iz.il(B)J")
    public static long method4080() {
        return field628;
    }

    @ObfuscatedName("mh.ih(I)V")
    public static final void method5430() {
        class183.field1906.method5403();
        class185.field1928.method5403();
        class174.field1819.method5403();
        class524.field5124.method5403();
        class522.field5117.method5403();
        class184.method2087();
        class204.field2206.method5403();
        class195.method141();
        class181.field1884.method5403();
        class181.field1887.method5403();
        class201.field2083.method5403();
        class201.field2079.method5403();
        class201.field2077.method5403();
        class173.field1816.method5403();
        class180.method2782();
        class171.method490();
        class202.method3072();
        class178.method4570();
        class186.field1931.method5403();
        class189.method715();
        class203.field2149.method5403();
        class203.field2205.method5403();
        class203.field2151.method5403();
        class199.field2059.method5403();
        class205.method5808();
        class194.field2019.method5403();
        class194.field2022.method5403();
        class200.method3130();
        class197.method7518();
        Statics.field4451.method8403();
        Statics.field1838.method8403();
        class190.field1999.method5403();
        class192.method3183();
        class179.field1866.method5403();
        class177.field1836.method5403();
        class172.field1814.method5403();
        class175.method6077();
        class198.method448();
        class176.method3102();
        class196.field2044.method5403();
        field793.method5403();
        field794.method5403();
        class344.method2428();
        Statics.field4415.method5743();
        ((class280) class270.field2810.field3095).method5092();
        class79.field981.method5403();
        field792.method7446();
        Statics.field3863.method6410();
        Statics.field2908.method6410();
        Statics.field1996.method6410();
        Statics.field3891.method6410();
        Statics.field243.method6410();
        Statics.field81.method6410();
        Statics.field2000.method6410();
        Statics.field2091.method6410();
        Statics.field1821.method6410();
        Statics.field2282.method6410();
        Statics.field4845.method6410();
        Statics.field2628.method6410();
        Statics.field160.method6410();
        Statics.field2588.method6410();
        Statics.field3549.method6410();
        Statics.field995.method6410();
        Statics.field95.method6410();
        Statics.field1490.method6410();
        Statics.field3429.method6410();
        Statics.field1633.method6410();
        Statics.field1522.method6410();
        Statics.field3285.method6410();
    }

    @ObfuscatedName("ew.ik(I)V")
    public static final void method2730() {
        if (field563 > 0) {
            Statics.method3461();
        } else {
            field538.method7343();
            Statics.method2960(40);
            Statics.field4299 = field561.method2751();
            field561.method2739();
        }
    }

    @ObfuscatedName("client.iw(I)V")
    public final void method1320() {
        if (field590 > 1) {
            field590--;
        }
        if (field563 > 0) {
            field563--;
        }
        if (field564) {
            field564 = false;
            method2730();
            return;
        }
        if (!field647) {
            method6322();
        }
        for (int var1 = 0; var1 < 100 && this.method1211(field561); var1++) {
        }
        if (field508 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field245.method6738();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field538.field4634) {
                    class311 var6 = class311.method7979(class309.field3183, field561.field1404);
                    var6.field3279.method8699(0);
                    int var7 = var6.field3279.field5181;
                    field538.method7342(var6.field3279);
                    var6.field3279.method8558(var6.field3279.field5181 - var7);
                    field561.method2736(var6);
                    field538.method7346();
                }
                Object var8 = Statics.field118.field1071;
                synchronized (Statics.field118.field1071) {
                    if (!field765) {
                        Statics.field118.field1072 = 0;
                    } else if (class36.field238 != 0 || Statics.field118.field1072 >= 40) {
                        class311 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field118.field1072 && (var9 == null || var9.field3279.field5181 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field118.field1074[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field118.field1076[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field513 != var16 || field784 != var15) {
                                if (var9 == null) {
                                    var9 = class311.method7979(class309.field3167, field561.field1404);
                                    var9.field3279.method8699(0);
                                    var10 = var9.field3279.field5181;
                                    var9.field3279.field5181 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field515 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field513;
                                    var18 = var15 - field784;
                                    var19 = (int) ((Statics.field118.field1075[var14] - field515) / 20L);
                                    var12 = (int) ((Statics.field118.field1075[var14] - field515) % 20L + (long) var12);
                                }
                                field513 = var16;
                                field784 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3279.method8737((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3279.method8699(var19 + 128);
                                    var9.field3279.method8737((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3279.method8699(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3279.method8547(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3279.method8547(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3279.method8737((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3279.method8547(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3279.method8547(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field515 = Statics.field118.field1075[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3279.method8558(var9.field3279.field5181 - var10);
                            int var20 = var9.field3279.field5181;
                            var9.field3279.field5181 = var10;
                            var9.field3279.method8699(var12 / var13);
                            var9.field3279.method8699(var12 % var13);
                            var9.field3279.field5181 = var20;
                            field561.method2736(var9);
                        }
                        if (var11 >= Statics.field118.field1072) {
                            Statics.field118.field1072 = 0;
                        } else {
                            Statics.field118.field1072 -= var11;
                            System.arraycopy(Statics.field118.field1076, var11, Statics.field118.field1076, 0, Statics.field118.field1072);
                            System.arraycopy(Statics.field118.field1074, var11, Statics.field118.field1074, 0, Statics.field118.field1072);
                            System.arraycopy(Statics.field118.field1075, var11, Statics.field118.field1075, 0, Statics.field118.field1072);
                        }
                    }
                }
                if (class36.field238 == 1 || !Statics.field320 && class36.field238 == 4 || class36.field238 == 2) {
                    long var22 = class36.field241 - field512;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field512 = class36.field241;
                    int var24 = class36.field242;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field199) {
                        var24 = Statics.field199;
                    }
                    int var25 = class36.field232;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field5134) {
                        var25 = Statics.field5134;
                    }
                    int var26 = (int) var22;
                    class311 var27 = class311.method7979(class309.field3256, field561.field1404);
                    var27.field3279.method8737((class36.field238 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field3279.method8737(var25);
                    var27.field3279.method8737(var24);
                    field561.method2736(var27);
                }
                if (field712 != 0) {
                    class311 var28 = class311.method7979(class309.field3259, field561.field1404);
                    var28.field3279.method8737(field712);
                    field561.method2736(var28);
                }
                if (field662.field2399 > 0) {
                    class311 var29 = class311.method7979(class309.field3217, field561.field1404);
                    var29.field3279.method8737(0);
                    int var30 = var29.field3279.field5181;
                    long var31 = Statics.method2852();
                    for (int var33 = 0; var33 < field662.field2399; var33++) {
                        long var34 = var31 - field742;
                        if (var34 > 16777215L) {
                            var34 = 16777215L;
                        }
                        field742 = var31;
                        var29.field3279.method8657(field662.field2396[var33]);
                        var29.field3279.method8607((int) var34);
                    }
                    var29.field3279.method8557(var29.field3279.field5181 - var30);
                    field561.method2736(var29);
                }
                if (field599 > 0) {
                    field599--;
                }
                if (field662.method4053(96) || field662.method4053(97) || field662.method4053(98) || field662.method4053(99)) {
                    field600 = true;
                }
                if (field600 && field599 <= 0) {
                    field599 = 20;
                    field600 = false;
                    class311 var36 = class311.method7979(class309.field3260, field561.field1404);
                    var36.field3279.method8731(field584);
                    var36.field3279.method8601(field580);
                    field561.method2736(var36);
                }
                if (Statics.field161 && !field516) {
                    field516 = true;
                    class311 var37 = class311.method7979(class309.field3223, field561.field1404);
                    var37.field3279.method8699(1);
                    field561.method2736(var37);
                }
                if (!Statics.field161 && field516) {
                    field516 = false;
                    class311 var38 = class311.method7979(class309.field3223, field561.field1404);
                    var38.field3279.method8699(0);
                    field561.method2736(var38);
                }
                if (Statics.field4432 != null) {
                    Statics.field4432.method8061();
                }
                if (Statics.field1834) {
                    if (Statics.field1292 != null) {
                        Statics.field1292.method7607();
                    }
                    for (int var39 = 0; var39 < class108.field1351; var39++) {
                        class92 var40 = field738[class108.field1357[var39]];
                        var40.method2298();
                    }
                    Statics.field1834 = false;
                }
                if (Statics.field1833) {
                    for (int var41 = 0; var41 < class108.field1351; var41++) {
                        class92 var42 = field738[class108.field1357[var41]];
                        var42.method2301();
                    }
                    Statics.field1833 = false;
                }
                method74();
                if (field508 != 30) {
                    return;
                }
                for (class95 var43 = (class95) field639.method6670(); var43 != null; var43 = (class95) field639.method6665()) {
                    if (var43.field1171 > 0) {
                        var43.field1171--;
                    }
                    if (var43.field1171 != 0) {
                        if (var43.field1166 > 0) {
                            var43.field1166--;
                        }
                        if (var43.field1166 == 0 && var43.field1160 >= 1 && var43.field1161 >= 1 && var43.field1160 <= 102 && var43.field1161 <= 102 && (var43.field1165 < 0 || class82.method7718(var43.field1165, var43.field1167))) {
                            method3006(var43.field1169, var43.field1159, var43.field1160, var43.field1161, var43.field1165, var43.field1158, var43.field1167, var43.field1168);
                            var43.field1166 = -1;
                            if (var43.field1165 == var43.field1162 && var43.field1162 == -1) {
                                var43.method7988();
                            } else if (var43.field1165 == var43.field1162 && var43.field1163 == var43.field1158 && var43.field1167 == var43.field1164) {
                                var43.method7988();
                            }
                        }
                    } else if (var43.field1162 < 0 || class82.method7718(var43.field1162, var43.field1164)) {
                        method3006(var43.field1169, var43.field1159, var43.field1160, var43.field1161, var43.field1162, var43.field1163, var43.field1164, var43.field1168);
                        var43.method7988();
                    }
                }
                Statics.method5468();
                field561.field1400++;
                if (field561.field1400 > 750) {
                    method2730();
                    return;
                }
                int var44 = class108.field1351;
                int[] var45 = class108.field1357;
                for (int var46 = 0; var46 < var44; var46++) {
                    class92 var47 = field738[var45[var46]];
                    if (var47 != null) {
                        method3533(var47, 1);
                    }
                }
                for (int var48 = 0; var48 < field558; var48++) {
                    int var49 = field559[var48];
                    class101 var50 = field557[var49];
                    if (var50 != null) {
                        method3533(var50, var50.field1300.field1980);
                    }
                }
                int[] var51 = class108.field1357;
                for (int var52 = 0; var52 < class108.field1351; var52++) {
                    class92 var53 = field738[var51[var52]];
                    if (var53 != null && var53.field1213 > 0) {
                        var53.field1213--;
                        if (var53.field1213 == 0) {
                            var53.field1196 = null;
                        }
                    }
                }
                for (int var54 = 0; var54 < field558; var54++) {
                    int var55 = field559[var54];
                    class101 var56 = field557[var55];
                    if (var56 != null && var56.field1213 > 0) {
                        var56.field1213--;
                        if (var56.field1213 == 0) {
                            var56.field1196 = null;
                        }
                    }
                }
                field577++;
                if (field620 != 0) {
                    field619 += 20;
                    if (field619 >= 400) {
                        field620 = 0;
                    }
                }
                class347 var57 = Statics.field4657;
                class347 var58 = Statics.field2288;
                Statics.field4657 = null;
                Statics.field2288 = null;
                field687 = null;
                field715 = false;
                field740 = false;
                field739 = 0;
                while (field662.method4051() && field739 < 128) {
                    if (field679 >= 2 && field662.method4053(82) && field662.field2394 == 66) {
                        StringBuilder var59 = new StringBuilder();
                        Iterator var60 = class111.field1394.iterator();
                        while (var60.hasNext()) {
                            class65 var61 = (class65) var60.next();
                            if (var61.field476 != null && !var61.field476.isEmpty()) {
                                var59.append(var61.field476).append(':');
                            }
                            var59.append(var61.field482).append('\n');
                        }
                        String var62 = var59.toString();
                        Statics.field3067.method614(var62);
                    } else if (field630 != 1 || field662.field2403 <= 0) {
                        field560[field739] = field662.field2394;
                        field618[field739] = field662.field2403;
                        field739++;
                    }
                }
                if (method728() && field662.method4053(82) && field662.method4053(81) && field712 != 0) {
                    int var64 = Statics.field133.field1111 - field712;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 3) {
                        var64 = 3;
                    }
                    if (Statics.field133.field1111 != var64) {
                        method15(Statics.field1900 + Statics.field133.field1243[0], Statics.field2683 + Statics.field133.field1244[0], var64, false);
                    }
                    field712 = 0;
                }
                if (field671 != -1) {
                    method424(field671, 0, 0, Statics.field5134, Statics.field199, 0, 0);
                }
                field695++;
                while (true) {
                    class88 var65;
                    class347 var66;
                    class347 var67;
                    do {
                        var65 = (class88) field632.method6668();
                        if (var65 == null) {
                            while (true) {
                                class88 var68;
                                class347 var69;
                                class347 var70;
                                do {
                                    var68 = (class88) field716.method6668();
                                    if (var68 == null) {
                                        while (true) {
                                            class88 var71;
                                            class347 var72;
                                            class347 var73;
                                            do {
                                                var71 = (class88) field714.method6668();
                                                if (var71 == null) {
                                                    boolean var74 = false;
                                                    while (true) {
                                                        class226 var75 = (class226) field717.method6668();
                                                        if (var75 == null) {
                                                            if (!var74 && class36.field238 == 1) {
                                                                field609.method4040();
                                                            }
                                                            this.method1353();
                                                            if (Statics.field4432 != null) {
                                                                Statics.field4432.method8226(Statics.field1428, (Statics.field133.field1232 >> 7) + Statics.field1900, (Statics.field133.field1173 >> 7) + Statics.field2683, false);
                                                                Statics.field4432.method8086();
                                                            }
                                                            if (field683 != null) {
                                                                this.method1217();
                                                            }
                                                            if (class274.method4921()) {
                                                                int var80 = class274.field2885;
                                                                int var81 = class274.field2897;
                                                                class311 var82 = class311.method7979(class309.field3257, field561.field1404);
                                                                var82.field3279.method8699(5);
                                                                var82.field3279.method8600(Statics.field1900 + var80);
                                                                var82.field3279.method8601(Statics.field2683 + var81);
                                                                var82.field3279.method8559(field662.method4053(82) ? (field662.method4053(81) ? 2 : 1) : 0);
                                                                field561.method2736(var82);
                                                                class274.method4882();
                                                                field617 = class36.field232;
                                                                field701 = class36.field242;
                                                                field620 = 1;
                                                                field619 = 0;
                                                                field750 = var80;
                                                                field571 = var81;
                                                            }
                                                            if (Statics.field4657 != var57) {
                                                                if (var57 != null) {
                                                                    Statics.method5074(var57);
                                                                }
                                                                if (Statics.field4657 != null) {
                                                                    Statics.method5074(Statics.field4657);
                                                                }
                                                            }
                                                            if (Statics.field2288 != var58 && field751 == field663) {
                                                                if (var58 != null) {
                                                                    Statics.method5074(var58);
                                                                }
                                                                if (Statics.field2288 != null) {
                                                                    Statics.method5074(Statics.field2288);
                                                                }
                                                            }
                                                            if (Statics.field2288 == null) {
                                                                if (field751 > 0) {
                                                                    field751--;
                                                                }
                                                            } else if (field751 < field663) {
                                                                field751++;
                                                                if (field751 == field663) {
                                                                    Statics.method5074(Statics.field2288);
                                                                }
                                                            }
                                                            if (field630 == 0) {
                                                                int var83 = Statics.field133.field1232;
                                                                int var84 = Statics.field133.field1173;
                                                                if (Statics.field4291 - var83 < -500 || Statics.field4291 - var83 > 500 || Statics.field2669 - var84 < -500 || Statics.field2669 - var84 > 500) {
                                                                    Statics.field4291 = var83;
                                                                    Statics.field2669 = var84;
                                                                }
                                                                if (Statics.field4291 != var83) {
                                                                    Statics.field4291 += (var83 - Statics.field4291) / 16;
                                                                }
                                                                if (Statics.field2669 != var84) {
                                                                    Statics.field2669 += (var84 - Statics.field2669) / 16;
                                                                }
                                                                int var85 = Statics.field4291 >> 7;
                                                                int var86 = Statics.field2669 >> 7;
                                                                int var87 = method293(Statics.field4291, Statics.field2669, Statics.field1428);
                                                                int var88 = 0;
                                                                if (var85 > 3 && var86 > 3 && var85 < 100 && var86 < 100) {
                                                                    for (int var89 = var85 - 4; var89 <= var85 + 4; var89++) {
                                                                        for (int var90 = var86 - 4; var90 <= var86 + 4; var90++) {
                                                                            int var91 = Statics.field1428;
                                                                            if (var91 < 3 && (class82.field1009[1][var89][var90] & 0x2) == 2) {
                                                                                var91++;
                                                                            }
                                                                            int var92 = var87 - class82.field1020[var91][var89][var90];
                                                                            if (var92 > var88) {
                                                                                var88 = var92;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int var93 = var88 * 192;
                                                                if (var93 > 98048) {
                                                                    var93 = 98048;
                                                                }
                                                                if (var93 < 32768) {
                                                                    var93 = 32768;
                                                                }
                                                                if (var93 > field601) {
                                                                    field601 += (var93 - field601) / 24;
                                                                } else if (var93 < field601) {
                                                                    field601 += (var93 - field601) / 80;
                                                                }
                                                                Statics.field2517 = method293(Statics.field133.field1232, Statics.field133.field1173, Statics.field1428) - field641;
                                                            } else if (field630 == 1) {
                                                                method1818();
                                                                short var94 = -1;
                                                                if (field662.method4053(33)) {
                                                                    var94 = 0;
                                                                } else if (field662.method4053(49)) {
                                                                    var94 = 1024;
                                                                }
                                                                if (field662.method4053(48)) {
                                                                    if (var94 == 0) {
                                                                        var94 = 1792;
                                                                    } else if (var94 == 1024) {
                                                                        var94 = 1280;
                                                                    } else {
                                                                        var94 = 1536;
                                                                    }
                                                                } else if (field662.method4053(50)) {
                                                                    if (var94 == 0) {
                                                                        var94 = 256;
                                                                    } else if (var94 == 1024) {
                                                                        var94 = 768;
                                                                    } else {
                                                                        var94 = 512;
                                                                    }
                                                                }
                                                                byte var95 = 0;
                                                                if (field662.method4053(35)) {
                                                                    var95 = -1;
                                                                } else if (field662.method4053(51)) {
                                                                    var95 = 1;
                                                                }
                                                                int var96 = 0;
                                                                if (var94 >= 0 || var95 != 0) {
                                                                    int var97 = field662.method4053(81) ? field596 : field595;
                                                                    var96 = var97 * 16;
                                                                    field511 = var94;
                                                                    field594 = var95;
                                                                }
                                                                if (field624 < var96) {
                                                                    field624 += var96 / 8;
                                                                    if (field624 > var96) {
                                                                        field624 = var96;
                                                                    }
                                                                } else if (field624 > var96) {
                                                                    field624 = field624 * 9 / 10;
                                                                }
                                                                if (field624 > 0) {
                                                                    int var98 = field624 / 16;
                                                                    if (field511 >= 0) {
                                                                        int var99 = field511 - Statics.field1254 & 0x7FF;
                                                                        int var100 = class270.field2803[var99];
                                                                        int var101 = class270.field2808[var99];
                                                                        Statics.field4291 += var98 * var100 / 65536;
                                                                        Statics.field2669 += var98 * var101 / 65536;
                                                                    }
                                                                    if (field594 != 0) {
                                                                        Statics.field2517 += field594 * var98;
                                                                        if (Statics.field2517 > 0) {
                                                                            Statics.field2517 = 0;
                                                                        }
                                                                    }
                                                                } else {
                                                                    field511 = -1;
                                                                    field594 = -1;
                                                                }
                                                                if (field662.method4053(13)) {
                                                                    method2842();
                                                                }
                                                            }
                                                            if (class36.field230 == 4 && Statics.field320) {
                                                                int var102 = class36.field239 - field589;
                                                                field699 = var102 * 2;
                                                                field589 = var102 == -1 || var102 == 1 ? class36.field239 : (field589 + class36.field239) / 2;
                                                                int var103 = field588 - class36.field231;
                                                                field586 = var103 * 2;
                                                                field588 = var103 == -1 || var103 == 1 ? class36.field231 : (field588 + class36.field231) / 2;
                                                            } else {
                                                                if (field662.method4053(96)) {
                                                                    field586 += (-24 - field586) / 2;
                                                                } else if (field662.method4053(97)) {
                                                                    field586 += (24 - field586) / 2;
                                                                } else {
                                                                    field586 /= 2;
                                                                }
                                                                if (field662.method4053(98)) {
                                                                    field699 += (12 - field699) / 2;
                                                                } else if (field662.method4053(99)) {
                                                                    field699 += (-12 - field699) / 2;
                                                                } else {
                                                                    field699 /= 2;
                                                                }
                                                                field589 = class36.field239;
                                                                field588 = class36.field231;
                                                            }
                                                            field580 = field586 / 2 + field580 & 0x7FF;
                                                            field584 += field699 / 2;
                                                            if (field584 < 128) {
                                                                field584 = 128;
                                                            }
                                                            if (field584 > 383) {
                                                                field584 = 383;
                                                            }
                                                            if (field767) {
                                                                method5354(Statics.field5106, Statics.field3871, Statics.field368);
                                                                method6851(Statics.field1028, Statics.field2488);
                                                                if (Statics.field5106 == Statics.field219 && Statics.field3871 == Statics.field158 && Statics.field4408 == Statics.field368 && Statics.field1456 == Statics.field1028 && Statics.field2488 == Statics.field1254) {
                                                                    field767 = false;
                                                                    field760 = false;
                                                                    field761 = false;
                                                                    field762 = false;
                                                                    Statics.field315 = 0;
                                                                    Statics.field4335 = 0;
                                                                    Statics.field1767 = 0;
                                                                    Statics.field2046 = 0;
                                                                    Statics.field4691 = 0;
                                                                    Statics.field4417 = 0;
                                                                    Statics.field1891 = 0;
                                                                    Statics.field30 = 0;
                                                                    Statics.field1818 = 0;
                                                                    Statics.field1297 = 0;
                                                                    field764 = null;
                                                                    field766 = null;
                                                                    field501 = null;
                                                                }
                                                            } else if (field760) {
                                                                method7096();
                                                            }
                                                            for (int var104 = 0; var104 < 5; var104++) {
                                                                int var10002 = field776[var104]++;
                                                            }
                                                            Statics.field1293.method2686();
                                                            int var105 = class36.method3555();
                                                            int var106 = class35.method3253();
                                                            if (var105 > 15000 && var106 > 15000) {
                                                                field563 = 250;
                                                                class36.field221 = 14500;
                                                                class311 var107 = class311.method7979(class309.field3193, field561.field1404);
                                                                field561.method2736(var107);
                                                            }
                                                            Statics.field3588.method1823();
                                                            for (int var108 = 0; var108 < field787.size(); var108++) {
                                                                if (class205.method4124((Integer) field787.get(var108)) != 2) {
                                                                    field787.remove(var108);
                                                                    var108--;
                                                                }
                                                            }
                                                            field561.field1410++;
                                                            if (field561.field1410 > 50) {
                                                                class311 var109 = class311.method7979(class309.field3207, field561.field1404);
                                                                field561.method2736(var109);
                                                            }
                                                            try {
                                                                field561.method2735();
                                                            } catch (IOException var111) {
                                                                method2730();
                                                            }
                                                            class218.method3348().method3948();
                                                            return;
                                                        }
                                                        if (var75.field2392.field3799 == 12) {
                                                            var74 = true;
                                                        }
                                                        if (var75 != null && var75.field2392 != null) {
                                                            if (var75.field2392.field3721 >= 0) {
                                                                class347 var76 = Statics.field4415.method5742(var75.field2392.field3812);
                                                                if (var76 == null || var76.field3839 == null || var76.field3839.length == 0 || var75.field2392.field3721 >= var76.field3839.length || var76.field3839[var75.field2392.field3721] != var75.field2392) {
                                                                    continue;
                                                                }
                                                            }
                                                            if (var75.field2392.field3799 == 11 && var75.field2389 == 0) {
                                                                if (var75.field2392.method6218(var75.field2390, var75.field2391, 0, 0)) {
                                                                    var75.field2392.method6112().method3820().method3942(1, var75.field2392.method6112().method3832());
                                                                    switch(var75.field2392.method6108()) {
                                                                        case 0:
                                                                            class32.method3975(var75.field2392.method6082(), true, false);
                                                                            break;
                                                                        case 1:
                                                                            if (class348.method6645(Statics.method6900(var75.field2392))) {
                                                                                int[] var77 = var75.field2392.method6111();
                                                                                if (var77 != null) {
                                                                                    class311 var78 = class311.method7979(class309.field3168, field561.field1404);
                                                                                    var78.field3279.method8613(var75.field2392.field3701);
                                                                                    var78.field3279.method8668(var77[1]);
                                                                                    var78.field3279.method8613(var75.field2392.method6109());
                                                                                    var78.field3279.method8668(var77[2]);
                                                                                    var78.field3279.method8601(var75.field2392.field3721);
                                                                                    var78.field3279.method8547(var77[0]);
                                                                                    field561.method2736(var78);
                                                                                }
                                                                            }
                                                                    }
                                                                }
                                                            } else if (var75.field2392.field3799 == 12) {
                                                                class345 var79 = var75.field2392.method6094();
                                                                if (var79 != null && var79.method6066()) {
                                                                    switch(var75.field2389) {
                                                                        case 0:
                                                                            field609.method4035(var75.field2392);
                                                                            var79.method5869(true);
                                                                            var79.method5859(var75.field2390, var75.field2391, field662.method4053(82), field662.method4053(81));
                                                                            break;
                                                                        case 1:
                                                                            var79.method5912(var75.field2390, var75.field2391);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var72 = var71.field1058;
                                                if (var72.field3721 < 0) {
                                                    break;
                                                }
                                                var73 = Statics.field4415.method5742(var72.field3812);
                                            } while (var73 == null || var73.field3839 == null || var72.field3721 >= var73.field3839.length || var73.field3839[var72.field3721] != var72);
                                            class71.method4538(var71);
                                        }
                                    }
                                    var69 = var68.field1058;
                                    if (var69.field3721 < 0) {
                                        break;
                                    }
                                    var70 = Statics.field4415.method5742(var69.field3812);
                                } while (var70 == null || var70.field3839 == null || var69.field3721 >= var70.field3839.length || var70.field3839[var69.field3721] != var69);
                                class71.method4538(var68);
                            }
                        }
                        var66 = var65.field1058;
                        if (var66.field3721 < 0) {
                            break;
                        }
                        var67 = Statics.field4415.method5742(var66.field3812);
                    } while (var67 == null || var67.field3839 == null || var66.field3721 >= var67.field3839.length || var67.field3839[var66.field3721] != var66);
                    class71.method4538(var65);
                }
            }
            class311 var4 = class311.method7979(class309.field3222, field561.field1404);
            var4.field3279.method8699(0);
            int var5 = var4.field3279.field5181;
            class37.method5685(var4.field3279);
            var4.field3279.method8558(var4.field3279.field5181 - var5);
            field561.method2736(var4);
        }
    }

    @ObfuscatedName("je.it(I)V")
    public static final void method4569() {
        if (Statics.field5025 != null) {
            Statics.field5025.method804();
        }
    }

    @ObfuscatedName("ej.id(Lhl;IIILdf;I)V")
    public static void method2817(class205 arg0, int arg1, int arg2, int arg3, class96 arg4) {
        if (field754 < 50 && arg0.field2240 != null && arg1 < arg0.field2240.length) {
            int var5 = arg0.field2240[arg1] & 0xF;
            if ((var5 <= 0 || Statics.field1155.method2450() != 0) && (var5 != 0 || Statics.field1155.method2448() != 0)) {
                method3108(arg0.field2240[arg1], arg2, arg3, Statics.field133 == arg4);
            }
        }
    }

    @ObfuscatedName("pr.iz(Lhl;IIILdf;B)V")
    public static void method6651(class205 arg0, int arg1, int arg2, int arg3, class96 arg4) {
        if (field754 < 50 && arg0.field2229 != null && arg0.field2229.containsKey(arg1)) {
            int var5 = (Integer) arg0.field2229.get(arg1) & 0xF;
            if ((var5 <= 0 || Statics.field1155.method2450() != 0) && (var5 != 0 || Statics.field1155.method2448() != 0)) {
                method3108((Integer) arg0.field2229.get(arg1), arg2, arg3, Statics.field133 == arg4);
            }
        }
    }

    @ObfuscatedName("fa.ii(IIIZI)V")
    public static void method3108(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 == 0) {
            return;
        }
        int var4 = arg0 & 0xF;
        if (var4 == 0) {
            if (!arg3) {
                return;
            }
            field758[field754] = 0;
        } else {
            int var5 = (arg1 - 64) / 128;
            int var6 = (arg2 - 64) / 128;
            field758[field754] = (var5 << 16) + (var6 << 8) + var4;
        }
        int var7 = arg0 >> 8;
        int var8 = arg0 >> 4 & 0x7;
        field755[field754] = var7;
        field756[field754] = var8;
        field549[field754] = 0;
        field631[field754] = null;
        field754++;
    }

    @ObfuscatedName("mu.ig(II)V")
    public static void method5736(int arg0) {
        if (arg0 == -1 && !field676) {
            class320.method2387(0, 0);
        } else if (arg0 != -1) {
            boolean var2;
            if (class320.field3467.isEmpty()) {
                var2 = false;
            } else {
                class332 var1 = (class332) class320.field3467.get(0);
                var2 = var1 != null && var1.field3574 == arg0;
            }
            if (!var2 && Statics.field1155.method2496() != 0) {
                ArrayList var3 = new ArrayList();
                var3.add(new class332(Statics.field2588, arg0, 0, Statics.field1155.method2496(), false));
                if (field676) {
                    class320.field3467.clear();
                    class320.field3467.addAll(var3);
                    class320.method4568(0, 100, 100, 0);
                } else {
                    class320.method2427(var3, 0, 100, 100, 0, false);
                }
            }
        }
    }

    @ObfuscatedName("ny.in(Ljava/util/ArrayList;IIIII)V")
    public static void method6307(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field676) {
            class320.method2387(0, 0);
        } else if (var5 != -1) {
            boolean var7;
            if (class320.field3467.isEmpty()) {
                var7 = false;
            } else {
                class332 var6 = (class332) class320.field3467.get(0);
                var7 = var6 != null && var6.field3574 == var5;
            }
            if (!var7 && Statics.field1155.method2496() != 0) {
                ArrayList var8 = new ArrayList();
                for (int var9 = 0; var9 < arg0.size(); var9++) {
                    var8.add(new class332(Statics.field2588, (Integer) arg0.get(var9), 0, Statics.field1155.method2496(), false));
                }
                if (field676) {
                    class320.field3467.clear();
                    class320.field3467.addAll(var8);
                    class320.method4568(arg1, arg2, arg3, arg4);
                } else {
                    class320.method2427(var8, arg1, arg2, arg3, arg4, false);
                }
            }
        }
    }

    @ObfuscatedName("client.if(IIS)V")
    public void method1251(int arg0, int arg1) {
        if (field561 != null && field561.field1404 != null && arg0 > -1 && Statics.field1155.method2496() > 0 && !field676) {
            class311 var3 = class311.method7979(class309.field3253, field561.field1404);
            var3.field3279.method8547(arg0);
            field561.method2736(var3);
        }
    }

    @ObfuscatedName("aa.ib(I)V")
    public static final void method74() {
        if (Statics.field1428 != field733) {
            field733 = Statics.field1428;
            method2630(Statics.field1428);
        }
    }

    @ObfuscatedName("ir.jh(Lnn;III)V")
    public static final void method4165(class347 arg0, int arg1, int arg2) {
        if (field752 != 0 && field752 != 3 || field647 || !(class36.field238 == 1 || !Statics.field320 && class36.field238 == 4)) {
            return;
        }
        class335 var3 = arg0.method6139(Statics.field4415, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field232 - arg1;
        int var5 = class36.field242 - arg2;
        if (!var3.method5709(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3594 / 2;
        int var7 = var5 - var3.field3593 / 2;
        int var8 = field580 & 0x7FF;
        int var9 = class270.field2803[var8];
        int var10 = class270.field2808[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field133.field1232 + var11 >> 7;
        int var14 = Statics.field133.field1173 - var12 >> 7;
        class311 var15 = class311.method7979(class309.field3204, field561.field1404);
        var15.field3279.method8699(18);
        var15.field3279.method8600(Statics.field1900 + var13);
        var15.field3279.method8601(Statics.field2683 + var14);
        var15.field3279.method8559(field662.method4053(82) ? (field662.method4053(81) ? 2 : 1) : 0);
        var15.field3279.method8699(var6);
        var15.field3279.method8699(var7);
        var15.field3279.method8737(field580);
        var15.field3279.method8699(57);
        var15.field3279.method8699(0);
        var15.field3279.method8699(0);
        var15.field3279.method8699(89);
        var15.field3279.method8737(Statics.field133.field1232);
        var15.field3279.method8737(Statics.field133.field1173);
        var15.field3279.method8699(63);
        field561.method2736(var15);
        field750 = var13;
        field571 = var14;
    }

    @ObfuscatedName("in.jl(Ljava/lang/String;I)V")
    public static final void method4163(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1155.method2476(!Statics.field1155.method2434());
            if (Statics.field1155.method2434()) {
                class111.method6511(99, "", "Roofs are now all hidden");
            } else {
                class111.method6511(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class403.method2543(arg0.substring(5).trim()) == 1;
            Statics.field3067.method508(var1);
            class270.method4745(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field528 = !field528;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field1155.method2454();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field629 = !field629;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field659 = !field659;
        }
        if (field679 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field4432.field4991 = !Statics.field4432.field4991;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field1155.method2467(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field1155.method2467(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2730();
            }
        }
        class311 var2 = class311.method7979(class309.field3244, field561.field1404);
        var2.field3279.method8699(arg0.length() + 1);
        var2.field3279.method8551(arg0);
        field561.method2736(var2);
    }

    @ObfuscatedName("tq.jm(II)I")
    public static final int method8437(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("bx.ju(II)I")
    public static final int method724(int arg0) {
        return Math.abs(arg0 - Statics.field1254) > 1024 ? arg0 + 2048 * (arg0 < Statics.field1254 ? 1 : -1) : arg0;
    }

    @ObfuscatedName("ll.jc(IIIB)V")
    public static final void method5354(int arg0, int arg1, int arg2) {
        if (Statics.field219 < arg0) {
            Statics.field219 += Statics.field4417 * (arg0 - Statics.field219) / 1000 + Statics.field1891;
            if (Statics.field219 > arg0) {
                Statics.field219 = arg0;
            }
        }
        if (Statics.field219 > arg0) {
            Statics.field219 -= Statics.field4417 * (Statics.field219 - arg0) / 1000 + Statics.field1891;
            if (Statics.field219 < arg0) {
                Statics.field219 = arg0;
            }
        }
        if (Statics.field158 < arg1) {
            Statics.field158 += Statics.field4417 * (arg1 - Statics.field158) / 1000 + Statics.field1891;
            if (Statics.field158 > arg1) {
                Statics.field158 = arg1;
            }
        }
        if (Statics.field158 > arg1) {
            Statics.field158 -= Statics.field4417 * (Statics.field158 - arg1) / 1000 + Statics.field1891;
            if (Statics.field158 < arg1) {
                Statics.field158 = arg1;
            }
        }
        if (Statics.field4408 < arg2) {
            Statics.field4408 += Statics.field4417 * (arg2 - Statics.field4408) / 1000 + Statics.field1891;
            if (Statics.field4408 > arg2) {
                Statics.field4408 = arg2;
            }
        }
        if (Statics.field4408 > arg2) {
            Statics.field4408 -= Statics.field4417 * (Statics.field4408 - arg2) / 1000 + Statics.field1891;
            if (Statics.field4408 < arg2) {
                Statics.field4408 = arg2;
            }
        }
    }

    @ObfuscatedName("pf.jr(IIB)V")
    public static final void method6851(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1456 < arg0) {
            Statics.field1456 += Statics.field4691 * (arg0 - Statics.field1456) / 1000 + Statics.field2046;
            if (Statics.field1456 > arg0) {
                Statics.field1456 = arg0;
            }
        } else if (Statics.field1456 > arg0) {
            Statics.field1456 -= Statics.field4691 * (Statics.field1456 - arg0) / 1000 + Statics.field2046;
            if (Statics.field1456 < arg0) {
                Statics.field1456 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field1254;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field1254 += Statics.field4691 * var3 / 1000 + Statics.field2046;
            Statics.field1254 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field1254 -= Statics.field4691 * -var3 / 1000 + Statics.field2046;
            Statics.field1254 &= 0x7FF;
        }
        int var4 = var2 - Statics.field1254;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field1254 = var2;
        }
    }

    @ObfuscatedName("pc.jt(B)V")
    public static final void method7096() {
        if (!field761) {
            int var0 = Statics.field30 * 128 + 64;
            int var1 = Statics.field1818 * 128 + 64;
            int var2 = method293(var0, var1, Statics.field1428) - Statics.field1297;
            method5354(var0, var2, var1);
        } else if (field764 != null) {
            Statics.field219 = field764.method8022();
            Statics.field4408 = field764.method8021();
            if (field763) {
                Statics.field158 = field764.method8023();
            } else {
                Statics.field158 = method293(Statics.field219, Statics.field4408, Statics.field1428) - field764.method8023();
            }
            field764.method8040();
        }
        if (field762) {
            if (field766 != null) {
                Statics.field1456 = field766.method8034();
                Statics.field1456 = Math.min(Math.max(Statics.field1456, 128), 383);
                field766.method8040();
            }
            if (field501 != null) {
                Statics.field1254 = field501.method8034() & 0x7FF;
                field501.method8040();
            }
            return;
        }
        int var3 = Statics.field315 * 128 + 64;
        int var4 = Statics.field4335 * 128 + 64;
        int var5 = method293(var3, var4, Statics.field1428) - Statics.field1767;
        int var6 = var3 - Statics.field219;
        int var7 = var5 - Statics.field158;
        int var8 = var4 - Statics.field4408;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method6851(var10, var11);
    }

    @ObfuscatedName("hc.jj(Ldf;II)V")
    public static final void method3533(class96 arg0, int arg1) {
        if (arg0.field1228 >= field677) {
            int var2 = Math.max(1, arg0.field1228 - field677);
            int var3 = arg0.field1224 * 128 + arg0.field1176 * 64;
            int var4 = arg0.field1226 * 128 + arg0.field1176 * 64;
            arg0.field1232 += (var3 - arg0.field1232) / var2;
            arg0.field1173 += (var4 - arg0.field1173) / var2;
            arg0.field1246 = 0;
            arg0.field1239 = arg0.field1174;
        } else if (arg0.field1229 >= field677) {
            boolean var5 = field677 == arg0.field1229 || arg0.field1236 == -1 || arg0.field1230 != 0;
            if (!var5) {
                class205 var6 = class205.method73(arg0.field1236);
                if (var6 == null || var6.method3760()) {
                    var5 = true;
                } else {
                    var5 = arg0.field1223 + 1 > var6.field2234[arg0.field1218];
                }
            }
            if (var5) {
                int var7 = arg0.field1229 - arg0.field1228;
                int var8 = field677 - arg0.field1228;
                int var9 = arg0.field1224 * 128 + arg0.field1176 * 64;
                int var10 = arg0.field1226 * 128 + arg0.field1176 * 64;
                int var11 = arg0.field1225 * 128 + arg0.field1176 * 64;
                int var12 = arg0.field1227 * 128 + arg0.field1176 * 64;
                arg0.field1232 = ((var7 - var8) * var9 + var8 * var11) / var7;
                arg0.field1173 = ((var7 - var8) * var10 + var8 * var12) / var7;
            }
            arg0.field1246 = 0;
            arg0.field1239 = arg0.field1174;
            arg0.field1184 = arg0.field1239;
        } else {
            method2061(arg0);
        }
        if (arg0.field1232 < 128 || arg0.field1173 < 128 || arg0.field1232 >= 13184 || arg0.field1173 >= 13184) {
            arg0.field1236 = -1;
            arg0.field1228 = 0;
            arg0.field1229 = 0;
            arg0.method2358();
            arg0.field1232 = arg0.field1243[0] * 128 + arg0.field1176 * 64;
            arg0.field1173 = arg0.field1244[0] * 128 + arg0.field1176 * 64;
            arg0.method2367();
        }
        if (Statics.field133 == arg0 && (arg0.field1232 < 1536 || arg0.field1173 < 1536 || arg0.field1232 >= 11776 || arg0.field1173 >= 11776)) {
            arg0.field1236 = -1;
            arg0.field1228 = 0;
            arg0.field1229 = 0;
            arg0.method2358();
            arg0.field1232 = arg0.field1243[0] * 128 + arg0.field1176 * 64;
            arg0.field1173 = arg0.field1244[0] * 128 + arg0.field1176 * 64;
            arg0.method2367();
        }
        method2351(arg0);
        arg0.field1175 = false;
        if (arg0.field1210 != -1) {
            class205 var13 = class205.method73(arg0.field1210);
            if (var13 == null) {
                arg0.field1210 = -1;
            } else if (!var13.method3760() && var13.field2222 != null) {
                arg0.field1215++;
                if (arg0.field1183 < var13.field2222.length && arg0.field1215 > var13.field2234[arg0.field1183]) {
                    arg0.field1215 = 1;
                    arg0.field1183++;
                    method2817(var13, arg0.field1183, arg0.field1232, arg0.field1173, arg0);
                }
                if (arg0.field1183 >= var13.field2222.length) {
                    if (var13.field2238 > 0) {
                        arg0.field1183 -= var13.field2238;
                        if (var13.field2236) {
                            arg0.field1197++;
                        }
                        if (arg0.field1183 < 0 || arg0.field1183 >= var13.field2222.length || var13.field2236 && arg0.field1197 >= var13.field2243) {
                            arg0.field1215 = 0;
                            arg0.field1183 = 0;
                            arg0.field1197 = 0;
                        }
                    } else {
                        arg0.field1215 = 0;
                        arg0.field1183 = 0;
                    }
                    method2817(var13, arg0.field1183, arg0.field1232, arg0.field1173, arg0);
                }
            } else if (var13.method3760()) {
                arg0.field1183++;
                int var14 = var13.method3784();
                if (arg0.field1183 < var14) {
                    method6651(var13, arg0.field1183, arg0.field1232, arg0.field1173, arg0);
                } else {
                    if (var13.field2238 > 0) {
                        arg0.field1183 -= var13.field2238;
                        if (var13.field2236) {
                            arg0.field1197++;
                        }
                        if (arg0.field1183 < 0 || arg0.field1183 >= var14 || var13.field2236 && arg0.field1197 >= var13.field2243) {
                            arg0.field1183 = 0;
                            arg0.field1215 = 0;
                            arg0.field1197 = 0;
                        }
                    } else {
                        arg0.field1215 = 0;
                        arg0.field1183 = 0;
                    }
                    method6651(var13, arg0.field1183, arg0.field1232, arg0.field1173, arg0);
                }
            } else {
                arg0.field1210 = -1;
            }
        }
        class503 var15 = new class503(arg0.method2356());
        for (class553 var16 = (class553) var15.method8271(); var16 != null; var16 = (class553) var15.next()) {
            if (var16.field5326 != -1 && field677 >= var16.field5323) {
                int var17 = class194.method3107(var16.field5326).field2023;
                if (var17 == -1) {
                    var16.method7988();
                    arg0.field1248--;
                } else {
                    var16.field5324 = Math.max(var16.field5324, 0);
                    class205 var18 = class205.method73(var17);
                    if (var18.field2222 != null && !var18.method3760()) {
                        var16.field5325++;
                        if (var16.field5324 < var18.field2222.length && var16.field5325 > var18.field2234[var16.field5324]) {
                            var16.field5325 = 1;
                            var16.field5324++;
                            method2817(var18, var16.field5324, arg0.field1232, arg0.field1173, arg0);
                        }
                        if (var16.field5324 >= var18.field2222.length) {
                            var16.method7988();
                            arg0.field1248--;
                        }
                    } else if (var18.method3760()) {
                        var16.field5324++;
                        int var19 = var18.method3784();
                        if (var16.field5324 < var19) {
                            method6651(var18, var16.field5324, arg0.field1232, arg0.field1173, arg0);
                        } else {
                            var16.method7988();
                            arg0.field1248--;
                        }
                    } else {
                        var16.method7988();
                        arg0.field1248--;
                    }
                }
            }
        }
        if (arg0.field1236 != -1 && arg0.field1230 <= 1) {
            class205 var20 = class205.method73(arg0.field1236);
            if (var20.field2245 == 1 && arg0.field1216 > 0 && arg0.field1228 <= field677 && arg0.field1229 < field677) {
                arg0.field1230 = 1;
                return;
            }
        }
        if (arg0.field1236 != -1 && arg0.field1230 == 0) {
            class205 var21 = class205.method73(arg0.field1236);
            if (var21 == null) {
                arg0.field1236 = -1;
            } else if (!var21.method3760() && var21.field2222 != null) {
                arg0.field1223++;
                if (arg0.field1218 < var21.field2222.length && arg0.field1223 > var21.field2234[arg0.field1218]) {
                    arg0.field1223 = 1;
                    arg0.field1218++;
                    method2817(var21, arg0.field1218, arg0.field1232, arg0.field1173, arg0);
                }
                if (arg0.field1218 >= var21.field2222.length) {
                    arg0.field1218 -= var21.field2238;
                    arg0.field1221++;
                    if (arg0.field1221 >= var21.field2243) {
                        arg0.field1236 = -1;
                    } else if (arg0.field1218 >= 0 && arg0.field1218 < var21.field2222.length) {
                        method2817(var21, arg0.field1218, arg0.field1232, arg0.field1173, arg0);
                    } else {
                        arg0.field1236 = -1;
                    }
                }
                arg0.field1175 = var21.field2239;
            } else if (var21.method3760()) {
                arg0.field1218++;
                int var22 = var21.method3784();
                if (arg0.field1218 < var22) {
                    method6651(var21, arg0.field1218, arg0.field1232, arg0.field1173, arg0);
                } else {
                    arg0.field1218 -= var21.field2238;
                    arg0.field1221++;
                    if (arg0.field1221 >= var21.field2243) {
                        arg0.field1236 = -1;
                    } else if (arg0.field1218 >= 0 && arg0.field1218 < var22) {
                        method6651(var21, arg0.field1218, arg0.field1232, arg0.field1173, arg0);
                    } else {
                        arg0.field1236 = -1;
                    }
                }
            } else {
                arg0.field1236 = -1;
            }
        }
        if (arg0.field1230 > 0) {
            arg0.field1230--;
        }
    }

    @ObfuscatedName("ck.ji(Ldf;I)V")
    public static final void method2061(class96 arg0) {
        arg0.field1210 = arg0.field1178;
        if (arg0.field1242 == 0) {
            arg0.field1246 = 0;
            return;
        }
        if (arg0.field1236 != -1 && arg0.field1230 == 0) {
            class205 var1 = class205.method73(arg0.field1236);
            if (arg0.field1216 > 0 && var1.field2245 == 0) {
                arg0.field1246++;
                return;
            }
            if (arg0.field1216 <= 0 && var1.field2227 == 0) {
                arg0.field1246++;
                return;
            }
        }
        int var2 = arg0.field1232;
        int var3 = arg0.field1173;
        int var4 = arg0.field1243[arg0.field1242 - 1] * 128 + arg0.field1176 * 64;
        int var5 = arg0.field1244[arg0.field1242 - 1] * 128 + arg0.field1176 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1239 = 1280;
            } else if (var3 > var5) {
                arg0.field1239 = 1792;
            } else {
                arg0.field1239 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1239 = 768;
            } else if (var3 > var5) {
                arg0.field1239 = 256;
            } else {
                arg0.field1239 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1239 = 1024;
        } else if (var3 > var5) {
            arg0.field1239 = 0;
        }
        class232 var6 = arg0.field1220[arg0.field1242 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1232 = var4;
            arg0.field1173 = var5;
            arg0.field1242--;
            if (arg0.field1216 > 0) {
                arg0.field1216--;
            }
            return;
        }
        int var7 = arg0.field1239 - arg0.field1184 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1182;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1247;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1233;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1245;
        }
        if (var8 == -1) {
            var8 = arg0.field1247;
        }
        arg0.field1210 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class101) {
            var10 = ((class101) arg0).field1300.field1988;
        }
        if (var10) {
            if (arg0.field1239 != arg0.field1184 && arg0.field1207 == -1 && arg0.field1241 != 0) {
                var9 = 2;
            }
            if (arg0.field1242 > 2) {
                var9 = 6;
            }
            if (arg0.field1242 > 3) {
                var9 = 8;
            }
            if (arg0.field1246 > 0 && arg0.field1242 > 1) {
                var9 = 8;
                arg0.field1246--;
            }
        } else {
            if (arg0.field1242 > 1) {
                var9 = 6;
            }
            if (arg0.field1242 > 2) {
                var9 = 8;
            }
            if (arg0.field1246 > 0 && arg0.field1242 > 1) {
                var9 = 8;
                arg0.field1246--;
            }
        }
        if (class232.field2460 == var6) {
            var9 <<= 0x1;
        } else if (class232.field2457 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8) {
            if (arg0.field1247 == arg0.field1210 && arg0.field1185 != -1) {
                arg0.field1210 = arg0.field1185;
            } else if (arg0.field1210 == arg0.field1182 && arg0.field1188 != -1) {
                arg0.field1210 = arg0.field1188;
            } else if (arg0.field1245 == arg0.field1210 && arg0.field1187 != -1) {
                arg0.field1210 = arg0.field1187;
            } else if (arg0.field1233 == arg0.field1210 && arg0.field1219 != -1) {
                arg0.field1210 = arg0.field1219;
            }
        } else if (var9 <= 2) {
            if (arg0.field1247 == arg0.field1210 && arg0.field1189 != -1) {
                arg0.field1210 = arg0.field1189;
            } else if (arg0.field1210 == arg0.field1182 && arg0.field1179 != -1) {
                arg0.field1210 = arg0.field1179;
            } else if (arg0.field1245 == arg0.field1210 && arg0.field1191 != -1) {
                arg0.field1210 = arg0.field1191;
            } else if (arg0.field1233 == arg0.field1210 && arg0.field1192 != -1) {
                arg0.field1210 = arg0.field1192;
            }
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1232 += var9;
                if (arg0.field1232 > var4) {
                    arg0.field1232 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1232 -= var9;
                if (arg0.field1232 < var4) {
                    arg0.field1232 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1173 += var9;
                if (arg0.field1173 > var5) {
                    arg0.field1173 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1173 -= var9;
                if (arg0.field1173 < var5) {
                    arg0.field1173 = var5;
                }
            }
        }
        if (arg0.field1232 == var4 && arg0.field1173 == var5) {
            arg0.field1242--;
            if (arg0.field1216 > 0) {
                arg0.field1216--;
            }
        }
    }

    @ObfuscatedName("dk.jv(Ldf;I)V")
    public static final void method2351(class96 arg0) {
        if (arg0.field1207 != -1) {
            Object var1 = null;
            int var2 = 65536;
            class96 var3;
            if (arg0.field1207 < var2) {
                var3 = field557[arg0.field1207];
            } else {
                var3 = field738[arg0.field1207 - var2];
            }
            if (var3 != null) {
                int var4 = arg0.field1232 - var3.field1232;
                int var5 = arg0.field1173 - var3.field1173;
                if (var4 != 0 || var5 != 0) {
                    int var7 = (int) (Math.atan2((double) var4, (double) var5) * 325.94932345220167D) & 0x7FF;
                    arg0.field1239 = var7;
                }
            } else if (arg0.field1208) {
                arg0.field1207 = -1;
                arg0.field1208 = false;
            }
        }
        if (arg0.field1242 == 0 || arg0.field1246 > 0) {
            int var8 = -1;
            if (arg0.field1214 != -1 && arg0.field1211 != -1) {
                int var9 = arg0.field1214 * 128 - Statics.field1900 * 128 + 64;
                int var10 = arg0.field1211 * 128 - Statics.field2683 * 128 + 64;
                int var11 = arg0.field1232 - var9;
                int var12 = arg0.field1173 - var10;
                if (var11 != 0 || var12 != 0) {
                    var8 = class464.method3463(var11, var12);
                }
            } else if (arg0.field1209 != -1) {
                var8 = arg0.field1209;
            }
            if (var8 != -1) {
                arg0.field1239 = var8;
                if (arg0.field1212) {
                    arg0.field1184 = arg0.field1239;
                }
            }
            arg0.method2360();
        }
        int var13 = arg0.field1239 - arg0.field1184 & 0x7FF;
        if (var13 == 0) {
            if (arg0.field1208) {
                arg0.field1207 = -1;
                arg0.field1208 = false;
            }
            arg0.field1240 = 0;
            return;
        }
        boolean var14 = true;
        boolean var15 = true;
        arg0.field1240++;
        int var16 = var13 > 1024 ? -1 : 1;
        arg0.field1184 += arg0.field1241 * var16;
        boolean var17 = true;
        if (var13 < arg0.field1241 || var13 > 2048 - arg0.field1241) {
            arg0.field1184 = arg0.field1239;
            var17 = false;
        }
        if (arg0.field1241 > 0 && arg0.field1210 == arg0.field1178 && (arg0.field1240 > 25 || var17)) {
            if (var16 == -1 && arg0.field1237 != -1) {
                arg0.field1210 = arg0.field1237;
            } else if (var16 == 1 && arg0.field1180 != -1) {
                arg0.field1210 = arg0.field1180;
            } else {
                arg0.field1210 = arg0.field1247;
            }
        }
        arg0.field1184 &= 0x7FF;
    }

    @ObfuscatedName("nf.jp(Ldn;III)V")
    public static void method6310(class92 arg0, int arg1, int arg2) {
        if (arg0.field1236 == arg1 && arg1 != -1) {
            int var3 = class205.method73(arg1).field2247;
            if (var3 == 1) {
                arg0.field1218 = 0;
                arg0.field1223 = 0;
                arg0.field1230 = arg2;
                arg0.field1221 = 0;
            }
            if (var3 == 2) {
                arg0.field1221 = 0;
            }
        } else if (arg1 == -1 || arg0.field1236 == -1 || class205.method73(arg1).field2221 >= class205.method73(arg0.field1236).field2221) {
            arg0.field1236 = arg1;
            arg0.field1218 = 0;
            arg0.field1223 = 0;
            arg0.field1230 = arg2;
            arg0.field1221 = 0;
            arg0.field1216 = arg0.field1242;
        }
    }

    @ObfuscatedName("fk.jy(I)I")
    public static int method3078() {
        return field660 ? 2 : 1;
    }

    @ObfuscatedName("fn.jf(IB)V")
    public static void method3185(int arg0) {
        field729 = 0L;
        if (arg0 >= 2) {
            field660 = true;
        } else {
            field660 = false;
        }
        if (method3078() == 1) {
            Statics.field3067.method492(765, 503);
        } else {
            Statics.field3067.method492(7680, 2160);
        }
        if (field508 >= 25) {
            Statics.method6275();
        }
    }

    @ObfuscatedName("client.av(B)V")
    public final void method558() {
        field729 = Statics.method2852() + 500L;
        this.method1207();
        if (field671 != -1) {
            this.method1215(true);
        }
    }

    @ObfuscatedName("client.jw(I)V")
    public void method1207() {
        int var1 = Statics.field5134;
        int var2 = Statics.field199;
        if (this.field195 < var1) {
            int var3 = this.field195;
        }
        if (this.field196 < var2) {
            int var4 = this.field196;
        }
        if (Statics.field1155 == null) {
            return;
        }
        try {
            client var5 = Statics.field3067;
            Object[] var6 = new Object[] { method3078() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.je(B)V")
    public final void method1585() {
        if (field671 != -1) {
            method6852(field671);
        }
        for (int var1 = 0; var1 < field719; var1++) {
            if (field721[var1]) {
                field664[var1] = true;
            }
            field730[var1] = field721[var1];
            field721[var1] = false;
        }
        field608 = field677;
        field673 = -1;
        field661 = -1;
        if (field671 != -1) {
            field719 = 0;
            method5085(field671, 0, 0, Statics.field5134, Statics.field199, 0, 0, -1);
        }
        class541.method8875();
        if (field544) {
            if (field620 == 1) {
                Statics.field1347[field619 / 100].method8995(field617 - 8, field701 - 8);
            }
            if (field620 == 2) {
                Statics.field1347[field619 / 100 + 4].method8995(field617 - 8, field701 - 8);
            }
        }
        if (field647) {
            int var2 = Statics.field2287;
            int var3 = Statics.field1070;
            int var4 = Statics.field3541;
            int var5 = Statics.field439;
            int var6 = 6116423;
            class541.method8884(var2, var3, var4, var5, var6);
            class541.method8884(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class541.method8874(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field1089.method7109(class367.field4143, var2 + 3, var3 + 14, var6, -1);
            int var7 = class36.field231;
            int var8 = class36.field239;
            for (int var9 = 0; var9 < field648; var9++) {
                int var10 = (field648 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                class410 var12 = Statics.field1089;
                String var13;
                if (var9 < 0) {
                    var13 = "";
                } else if (field795[var9].length() > 0) {
                    var13 = field771[var9] + class367.field4130 + field795[var9];
                } else {
                    var13 = field771[var9];
                }
                var12.method7109(var13, var2 + 3, var10, var11, 0);
            }
            method4601(Statics.field2287, Statics.field1070, Statics.field3541, Statics.field439);
        } else if (field673 != -1) {
            method3101(field673, field661);
        }
        if (field728 == 3) {
            for (int var14 = 0; var14 < field719; var14++) {
                if (field730[var14]) {
                    class541.method8936(field724[var14], field725[var14], field726[var14], field769[var14], 16711935, 128);
                } else if (field664[var14]) {
                    class541.method8936(field724[var14], field725[var14], field726[var14], field769[var14], 16711680, 128);
                }
            }
        }
        class70.method3352(Statics.field1428, Statics.field133.field1232, Statics.field133.field1173, field577);
        field577 = 0;
    }

    @ObfuscatedName("hi.jn(Ljava/lang/String;ZB)V")
    public static final void method3574(String arg0, boolean arg1) {
        if (!field623) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3619.method7105(arg0, 250);
        int var6 = Statics.field3619.method7106(arg0, 250) * 13;
        class541.method8884(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class541.method8874(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3619.method7113(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field719; var11++) {
            if (field726[var11] + field724[var11] > var7 && field724[var11] < var7 + var9 && field769[var11] + field725[var11] > var8 && field725[var11] < var8 + var10) {
                field721[var11] = true;
            }
        }
        if (arg1) {
            Statics.field2556.method466(0, 0);
        } else {
            method4601(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("by.jo(IIIIB)V")
    public static final void method672(int arg0, int arg1, int arg2, int arg3) {
        field681++;
        method2649();
        if (field629) {
            method3068(Statics.field133, false);
        }
        method5718();
        method3554(true);
        int var4 = class108.field1351;
        int[] var5 = class108.field1357;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field637 != var5[var6] && field625 != var5[var6]) {
                method3068(field738[var5[var6]], true);
            }
        }
        method3554(false);
        method6537();
        for (class72 var7 = (class72) field782.method6670(); var7 != null; var7 = (class72) field782.method6665()) {
            if (Statics.field1428 != var7.field867 || var7.field865) {
                var7.method7988();
            } else if (field677 >= var7.field866) {
                var7.method2055(field577);
                if (var7.field865) {
                    var7.method7988();
                } else {
                    Statics.field493.method4891(var7.field867, var7.field868, var7.field872, var7.field874, 60, var7, 0, -1L, false);
                }
            }
        }
        method3518(arg0, arg1, arg2, arg3, true);
        int var8 = field781;
        int var9 = field747;
        int var10 = field783;
        int var11 = field505;
        class541.method8876(var8, var9, var8 + var10, var9 + var11);
        class270.method4798();
        class541.method8917();
        int var12 = field584;
        if (field601 / 256 > var12) {
            var12 = field601 / 256;
        }
        if (field768[4] && field770[4] + 128 > var12) {
            var12 = field770[4] + 128;
        }
        int var13 = field580 & 0x7FF;
        int var14 = Statics.field4291;
        int var15 = Statics.field2517;
        int var16 = Statics.field2669;
        int var17 = var12 * 3 + 600;
        int var19 = Statics.method3190(var17, var11);
        int var20 = 2048 - var12 & 0x7FF;
        int var21 = 2048 - var13 & 0x7FF;
        int var22 = 0;
        int var23 = 0;
        int var24 = var19;
        if (var20 != 0) {
            int var25 = class270.field2803[var20];
            int var26 = class270.field2808[var20];
            int var27 = var23 * var26 - var19 * var25 >> 16;
            var24 = var23 * var25 + var19 * var26 >> 16;
            var23 = var27;
        }
        if (var21 != 0) {
            int var28 = class270.field2803[var21];
            int var29 = class270.field2808[var21];
            int var30 = var22 * var29 + var24 * var28 >> 16;
            var24 = var24 * var29 - var22 * var28 >> 16;
            var22 = var30;
        }
        if (field760) {
            Statics.field5106 = var14 - var22;
            Statics.field3871 = var15 - var23;
            Statics.field368 = var16 - var24;
            Statics.field1028 = var12;
            Statics.field2488 = var13;
        } else {
            Statics.field219 = var14 - var22;
            Statics.field158 = var15 - var23;
            Statics.field4408 = var16 - var24;
            Statics.field1456 = var12;
            Statics.field1254 = var13;
        }
        if (field630 == 1 && field679 >= 2 && field677 % 50 == 0 && (Statics.field4291 >> 7 != Statics.field133.field1232 >> 7 || Statics.field2669 >> 7 != Statics.field133.field1173 >> 7)) {
            int var31 = Statics.field133.field1111;
            int var32 = (Statics.field4291 >> 7) + Statics.field1900;
            int var33 = (Statics.field2669 >> 7) + Statics.field2683;
            method15(var32, var33, var31, true);
        }
        int var34;
        if (field760) {
            var34 = method4201();
        } else {
            var34 = method5127();
        }
        int var35 = Statics.field219;
        int var36 = Statics.field158;
        int var37 = Statics.field4408;
        int var38 = Statics.field1456;
        int var39 = Statics.field1254;
        for (int var40 = 0; var40 < 5; var40++) {
            if (field768[var40]) {
                int var41 = (int) (Math.random() * (double) (field723[var40] * 2 + 1) - (double) field723[var40] + Math.sin((double) field789[var40] / 100.0D * (double) field776[var40]) * (double) field770[var40]);
                if (var40 == 0) {
                    Statics.field219 += var41;
                }
                if (var40 == 1) {
                    Statics.field158 += var41;
                }
                if (var40 == 2) {
                    Statics.field4408 += var41;
                }
                if (var40 == 3) {
                    Statics.field1254 = Statics.field1254 + var41 & 0x7FF;
                }
                if (var40 == 4) {
                    Statics.field1456 += var41;
                    if (Statics.field1456 < 128) {
                        Statics.field1456 = 128;
                    }
                    if (Statics.field1456 > 383) {
                        Statics.field1456 = 383;
                    }
                }
            }
        }
        int var42 = class36.field231;
        int var43 = class36.field239;
        if (class36.field238 != 0) {
            var42 = class36.field232;
            var43 = class36.field242;
        }
        if (var42 >= var8 && var42 < var8 + var10 && var43 >= var9 && var43 < var9 + var11) {
            class284.method2129(var42 - var8, var43 - var9);
        } else {
            class284.field3054 = false;
            class284.field3057 = 0;
        }
        method4569();
        class541.method8884(var8, var9, var10, var11, 0);
        method4569();
        int var44 = class270.method4818();
        class270.method4745(Statics.field3067.field204);
        class270.field2810.field3093 = field785;
        Statics.field493.method4912(Statics.field219, Statics.field158, Statics.field4408, Statics.field1456, Statics.field1254, var34);
        class270.method4745(false);
        if (field528) {
            class541.method8898();
        }
        class270.field2810.field3093 = var44;
        method4569();
        Statics.field493.method4894();
        method2624(var8, var9, var10, var11);
        method2278(var8, var9);
        ((class280) class270.field2810.field3095).method5095(field577);
        method3218(var8, var9, var10, var11);
        Statics.field219 = var35;
        Statics.field158 = var36;
        Statics.field4408 = var37;
        Statics.field1456 = var38;
        Statics.field1254 = var39;
        if (field691 && Statics.field1419.method6502(true, false) == 0) {
            field691 = false;
        }
        if (field691) {
            class541.method8884(var8, var9, var10, var11, 0);
            method3574(class367.field3987, false);
        }
    }

    @ObfuscatedName("hm.jz(IIIIZI)V")
    public static final void method3518(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field773;
        } else if (var5 >= 100) {
            var6 = field774;
        } else {
            var6 = (field774 - field773) * var5 / 100 + field773;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field779) {
            short var8 = field779;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field597) {
                var6 = field597;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class541.method8875();
                    class541.method8884(arg0, arg1, var10, arg3, -16777216);
                    class541.method8884(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field780) {
            short var11 = field780;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field777) {
                var6 = field777;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class541.method8875();
                    class541.method8884(arg0, arg1, arg2, var13, -16777216);
                    class541.method8884(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field785 = arg3 * var6 / 334;
        if (field783 != arg2 || field505 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class270.field2803[var16];
                int var20 = Statics.method3190(var17, arg3);
                var14[var15] = var19 * var20 >> 16;
            }
            class274.method4917(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field781 = arg0;
        field747 = arg1;
        field783 = arg2;
        field505 = arg3;
    }

    @ObfuscatedName("el.jb(B)V")
    public static void method2649() {
        if (Statics.field133.field1232 >> 7 == field750 && Statics.field133.field1173 >> 7 == field571) {
            field750 = 0;
        }
    }

    @ObfuscatedName("mm.js(I)V")
    public static void method5718() {
        if (field637 >= 0 && field738[field637] != null) {
            method3068(field738[field637], false);
        }
    }

    @ObfuscatedName("fl.ja(Ldn;ZI)V")
    public static void method3068(class92 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2307() || arg0.field1119) {
            return;
        }
        arg0.field1126 = false;
        if ((field503 && class108.field1351 > 50 || class108.field1351 > 200) && arg1 && arg0.field1210 == arg0.field1178) {
            arg0.field1126 = true;
        }
        int var2 = arg0.field1232 >> 7;
        int var3 = arg0.field1173 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class284.method2168(0, 0, 0, false, arg0.field1120);
        if (arg0.field1112 != null && field677 >= arg0.field1098 && field677 < arg0.field1108) {
            arg0.field1126 = false;
            arg0.field1106 = method293(arg0.field1232, arg0.field1173, Statics.field1428);
            arg0.field1177 = field677;
            Statics.field493.method4970(Statics.field1428, arg0.field1232, arg0.field1173, arg0.field1106, 60, arg0, arg0.field1184, var4, arg0.field1113, arg0.field1105, arg0.field1115, arg0.field1116);
            return;
        }
        if ((arg0.field1232 & 0x7F) == 64 && (arg0.field1173 & 0x7F) == 64) {
            if (field681 == field797[var2][var3]) {
                return;
            }
            field797[var2][var3] = field681;
        }
        arg0.field1106 = method293(arg0.field1232, arg0.field1173, Statics.field1428);
        arg0.field1177 = field677;
        Statics.field493.method4891(Statics.field1428, arg0.field1232, arg0.field1173, arg0.field1106, 60, arg0, arg0.field1184, var4, arg0.field1175);
    }

    @ObfuscatedName("hc.jg(ZI)V")
    public static final void method3554(boolean arg0) {
        for (int var1 = 0; var1 < field558; var1++) {
            class101 var2 = field557[field559[var1]];
            if (var2 != null && var2.method2307() && var2.field1300.field1949 == arg0 && var2.field1300.method3404()) {
                int var3 = var2.field1232 >> 7;
                int var4 = var2.field1173 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1176 == 1 && (var2.field1232 & 0x7F) == 64 && (var2.field1173 & 0x7F) == 64) {
                        if (field681 == field797[var3][var4]) {
                            continue;
                        }
                        field797[var3][var4] = field681;
                    }
                    long var5 = class284.method2168(0, 0, 1, !var2.field1300.field1987, field559[var1]);
                    var2.field1177 = field677;
                    Statics.field493.method4891(Statics.field1428, var2.field1232, var2.field1173, method293(var2.field1232 + (var2.field1176 * 64 - 64), var2.field1173 + (var2.field1176 * 64 - 64), Statics.field1428), var2.field1176 * 64 - 64 + 60, var2, var2.field1184, var5, var2.field1175);
                }
            }
        }
    }

    @ObfuscatedName("op.jq(B)V")
    public static final void method6537() {
        for (class77 var0 = (class77) field587.method6670(); var0 != null; var0 = (class77) field587.method6665()) {
            if (Statics.field1428 != var0.field948 || field677 > var0.field957) {
                var0.method7988();
            } else if (field677 >= var0.field956) {
                if (!var0.field962 && var0.field960 != 0) {
                    if (var0.field960 > 0) {
                        class101 var1 = field557[var0.field960 - 1];
                        if (var1 != null && var1.field1232 >= 0 && var1.field1232 < 13312 && var1.field1173 >= 0 && var1.field1173 < 13312) {
                            var0.field949 = var1.field1232;
                            var0.field953 = var1.field1173;
                            var0.method2131(var0.field961, var0.field954, var0.field955, field677);
                        }
                    } else {
                        int var2 = -var0.field960 - 1;
                        class92 var3;
                        if (field625 == var2) {
                            var3 = Statics.field133;
                        } else {
                            var3 = field738[var2];
                        }
                        if (var3 != null && var3.field1232 >= 0 && var3.field1232 < 13312 && var3.field1173 >= 0 && var3.field1173 < 13312) {
                            var0.field949 = var3.field1232;
                            var0.field953 = var3.field1173;
                            var0.method2131(var0.field961, var0.field954, var0.field955, field677);
                        }
                    }
                }
                if (var0.field968 > 0) {
                    class101 var4 = field557[var0.field968 - 1];
                    if (var4 != null && var4.field1232 >= 0 && var4.field1232 < 13312 && var4.field1173 >= 0 && var4.field1173 < 13312) {
                        var0.method2131(var4.field1232, var4.field1173, method293(var4.field1232, var4.field1173, var0.field948) - var0.field975, field677);
                    }
                }
                if (var0.field968 < 0) {
                    int var5 = -var0.field968 - 1;
                    class92 var6;
                    if (field625 == var5) {
                        var6 = Statics.field133;
                    } else {
                        var6 = field738[var5];
                    }
                    if (var6 != null && var6.field1232 >= 0 && var6.field1232 < 13312 && var6.field1173 >= 0 && var6.field1173 < 13312) {
                        var0.method2131(var6.field1232, var6.field1173, method293(var6.field1232, var6.field1173, var0.field948) - var0.field975, field677);
                    }
                }
                var0.method2132(field577);
                Statics.field493.method4891(Statics.field1428, (int) var0.field963, (int) var0.field952, (int) var0.field965, 60, var0, var0.field964, -1L, false);
            }
        }
    }

    @ObfuscatedName("kw.jk(I)I")
    public static final int method5127() {
        if (Statics.field1155.method2434()) {
            return Statics.field1428;
        }
        int var0 = 3;
        if (Statics.field1456 < 310) {
            int var1;
            int var2;
            if (field630 == 1) {
                var1 = Statics.field4291 >> 7;
                var2 = Statics.field2669 >> 7;
            } else {
                var1 = Statics.field133.field1232 >> 7;
                var2 = Statics.field133.field1173 >> 7;
            }
            int var3 = Statics.field219 >> 7;
            int var4 = Statics.field4408 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field1428;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1428;
            }
            if ((class82.field1009[Statics.field1428][var3][var4] & 0x4) != 0) {
                var0 = Statics.field1428;
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
                    if ((class82.field1009[Statics.field1428][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1428;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class82.field1009[Statics.field1428][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1428;
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
                    if ((class82.field1009[Statics.field1428][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1428;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class82.field1009[Statics.field1428][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1428;
                        }
                    }
                }
            }
        }
        if (Statics.field133.field1232 >= 0 && Statics.field133.field1173 >= 0 && Statics.field133.field1232 < 13312 && Statics.field133.field1173 < 13312) {
            if ((class82.field1009[Statics.field1428][Statics.field133.field1232 >> 7][Statics.field133.field1173 >> 7] & 0x4) != 0) {
                var0 = Statics.field1428;
            }
            return var0;
        } else {
            return Statics.field1428;
        }
    }

    @ObfuscatedName("ib.jd(I)I")
    public static final int method4201() {
        if (Statics.field1155.method2434()) {
            return Statics.field1428;
        } else {
            int var0 = method293(Statics.field219, Statics.field4408, Statics.field1428);
            return var0 - Statics.field158 >= 800 || (class82.field1009[Statics.field1428][Statics.field219 >> 7][Statics.field4408 >> 7] & 0x4) == 0 ? 3 : Statics.field1428;
        }
    }

    @ObfuscatedName("dr.kv(IIB)V")
    public static final void method2278(int arg0, int arg1) {
        if (field514 == 2) {
            method1822((field526 - Statics.field1900 << 7) + field524, (field614 - Statics.field2683 << 7) + field525, field523 * 2);
            if (field615 > -1 && field677 % 20 < 10) {
                Statics.field496[0].method8995(field615 + arg0 - 12, field616 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ad.kq(I)V")
    public static void method163() {
        for (class226 var0 = (class226) field717.method6670(); var0 != null; var0 = (class226) field717.method6665()) {
            var0.method7988();
        }
    }

    @ObfuscatedName("hk.kz(B)Z")
    public static boolean method3532() {
        return (field537 & 0x4) != 0;
    }

    @ObfuscatedName("em.km(I)Z")
    public static boolean method2794() {
        return (field537 & 0x1) != 0;
    }

    @ObfuscatedName("av.ku(I)Z")
    public static boolean method215() {
        return (field537 & 0x2) != 0;
    }

    @ObfuscatedName("of.ka(Ldf;IIIIIB)V")
    public static final void method6630(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2307()) {
            return;
        }
        if (arg0 instanceof class101) {
            class189 var6 = ((class101) arg0).field1300;
            if (var6.field1984 != null) {
                var6 = var6.method3459();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class108.field1351;
        int[] var8 = class108.field1357;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1196 != null && (!var9 || !arg0.field1195 && (field732 == 4 || !arg0.field1203 && (field732 == 0 || field732 == 3 || field732 == 1 && ((class92) arg0).method2294())))) {
            method3219(arg0, arg0.field1190);
            if (field615 > -1 && field602 < field603) {
                field607[field602] = Statics.field1089.method7103(arg0.field1196) / 2;
                field606[field602] = Statics.field1089.field4556;
                field711[field602] = field615;
                field605[field602] = field616 - var10;
                field796[field602] = arg0.field1186;
                field753[field602] = arg0.field1198;
                field611[field602] = arg0.field1213;
                field610[field602] = arg0.field1199;
                field612[field602] = arg0.field1196;
                field602++;
                var10 += 12;
            }
        }
        if (!arg0.field1206.method6711()) {
            method3219(arg0, arg0.field1190 + 15);
            for (class100 var11 = (class100) arg0.field1206.method6738(); var11 != null; var11 = (class100) arg0.field1206.method6724()) {
                class97 var12 = var11.method2544(field677);
                if (var12 != null) {
                    class181 var13 = var11.field1296;
                    class545 var14 = var13.method3357();
                    class545 var15 = var13.method3355();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field1896;
                    } else {
                        if (var13.field1899 * 2 < var15.field5276) {
                            var16 = var13.field1899;
                        }
                        var17 = var15.field5276 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field677 - var12.field1253;
                    int var21 = var12.field1252 * var17 / var13.field1896;
                    int var24;
                    if (var12.field1255 > var20) {
                        int var22 = var13.field1886 == 0 ? 0 : var20 / var13.field1886 * var13.field1886;
                        int var23 = var12.field1251 * var17 / var13.field1896;
                        var24 = (var21 - var23) * var22 / var12.field1255 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1255 + var13.field1895 - var20;
                        if (var13.field1893 >= 0) {
                            var18 = (var25 << 8) / (var13.field1895 - var13.field1893);
                        }
                    }
                    if (var12.field1252 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field615 > -1) {
                            int var31 = field615 + arg2 - (var17 >> 1);
                            int var32 = field616 + arg3 - var10;
                            class541.method8884(var31, var32, var24, 5, 65280);
                            class541.method8884(var24 + var31, var32, var17 - var24, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var26;
                        if (var17 == var24) {
                            var26 = var16 * 2 + var24;
                        } else {
                            var26 = var16 + var24;
                        }
                        int var27 = var14.field5277;
                        var10 += var27;
                        int var28 = field615 + arg2 - (var17 >> 1);
                        int var29 = field616 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method9001(var30, var29, var18);
                            class541.method8877(var30, var29, var26 + var30, var27 + var29);
                            var15.method9001(var30, var29, var18);
                        } else {
                            var14.method8995(var30, var29);
                            class541.method8877(var30, var29, var26 + var30, var27 + var29);
                            var15.method8995(var30, var29);
                        }
                        class541.method8876(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2545()) {
                    var11.method7988();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field677 == arg0.field1177) {
            class92 var33 = (class92) arg0;
            boolean var34;
            if (field537 == 0) {
                var34 = false;
            } else if (Statics.field133 == var33) {
                boolean var35 = (field537 & 0x8) != 0;
                var34 = var35;
            } else {
                var34 = method3532() || method2794() && var33.method2294() || method215() && var33.method2297();
            }
            if (var34) {
                class92 var36 = (class92) arg0;
                if (var9) {
                    method3219(arg0, arg0.field1190 + 15);
                    class414 var37 = (class414) field566.get(class501.field5031);
                    var10 += 4;
                    var37.method7112(var36.field1117.method9164(), field615 + arg2, field616 + arg3 - var10, 16777215, 0);
                    var10 += 18;
                }
            }
        }
        if (var9) {
            class92 var38 = (class92) arg0;
            if (var38.field1119) {
                return;
            }
            if (var38.field1100 != -1 || var38.field1101 != -1) {
                method3219(arg0, arg0.field1190 + 15);
                if (field615 > -1) {
                    if (var38.field1100 != -1) {
                        var10 += 25;
                        Statics.field1249[var38.field1100].method8995(field615 + arg2 - 12, field616 + arg3 - var10);
                    }
                    if (var38.field1101 != -1) {
                        var10 += 25;
                        Statics.field53[var38.field1101].method8995(field615 + arg2 - 12, field616 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field514 == 10 && field520 == var8[arg1]) {
                method3219(arg0, arg0.field1190 + 15);
                if (field615 > -1) {
                    int var39 = Statics.field496[1].field5277 + var10;
                    Statics.field496[1].method8995(field615 + arg2 - 12, field616 + arg3 - var39);
                }
            }
        } else {
            class101 var40 = (class101) arg0;
            int[] var41 = var40.method2563();
            short[] var42 = var40.method2579();
            if (var42 != null && var41 != null) {
                for (int var43 = 0; var43 < var42.length; var43++) {
                    if (var42[var43] >= 0 && var41[var43] >= 0) {
                        long var44 = (long) var41[var43] << 8 | (long) var42[var43];
                        class545 var46 = (class545) field792.method7442(var44);
                        if (var46 == null) {
                            class545[] var47 = class546.method3951(Statics.field95, var41[var43], 0);
                            if (var47 != null && var42[var43] < var47.length) {
                                var46 = var47[var42[var43]];
                                field792.method7449(var44, var46);
                            }
                        }
                        if (var46 != null) {
                            method3219(arg0, arg0.field1190 + 15);
                            if (field615 > -1) {
                                var46.method8995(field615 + arg2 - (var46.field5276 >> 1), field616 + (arg3 - var46.field5277) - 4);
                            }
                        }
                    }
                }
            }
            if (field514 == 1 && field509 == field559[arg1 - var7] && field677 % 20 < 10) {
                method3219(arg0, arg0.field1190 + 15);
                if (field615 > -1) {
                    Statics.field496[0].method8995(field615 + arg2 - 12, field616 + arg3 - 28);
                }
            }
        }
        for (int var48 = 0; var48 < 4; var48++) {
            int var49 = arg0.field1172[var48];
            int var50 = arg0.field1201[var48];
            class201 var51 = null;
            int var52 = 0;
            if (var50 >= 0) {
                if (var49 <= field677) {
                    continue;
                }
                var51 = class201.method3468(arg0.field1201[var48]);
                var52 = var51.field2070;
                if (var51 != null && var51.field2088 != null) {
                    var51 = var51.method3606();
                    if (var51 == null) {
                        arg0.field1172[var48] = -1;
                        continue;
                    }
                }
            } else if (var49 < 0) {
                continue;
            }
            int var53 = arg0.field1204[var48];
            class201 var54 = null;
            if (var53 >= 0) {
                var54 = class201.method3468(var53);
                if (var54 != null && var54.field2088 != null) {
                    var54 = var54.method3606();
                }
            }
            if (var49 - var52 <= field677) {
                if (var51 == null) {
                    arg0.field1172[var48] = -1;
                } else {
                    method3219(arg0, arg0.field1190 / 2);
                    if (field615 > -1) {
                        boolean var55 = true;
                        if (var48 == 1) {
                            field616 -= 20;
                        }
                        if (var48 == 2) {
                            field615 -= 15;
                            field616 -= 10;
                        }
                        if (var48 == 3) {
                            field615 += 15;
                            field616 -= 10;
                        }
                        Object var56 = null;
                        Object var57 = null;
                        Object var58 = null;
                        Object var59 = null;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        class545 var68 = null;
                        class545 var69 = null;
                        class545 var70 = null;
                        class545 var71 = null;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        class545 var81 = var51.method3605();
                        if (var81 != null) {
                            var60 = var81.field5276;
                            int var82 = var81.field5277;
                            if (var82 > var80) {
                                var80 = var82;
                            }
                            var64 = var81.field5278;
                        }
                        class545 var83 = var51.method3580();
                        if (var83 != null) {
                            var61 = var83.field5276;
                            int var84 = var83.field5277;
                            if (var84 > var80) {
                                var80 = var84;
                            }
                            var65 = var83.field5278;
                        }
                        class545 var85 = var51.method3581();
                        if (var85 != null) {
                            var62 = var85.field5276;
                            int var86 = var85.field5277;
                            if (var86 > var80) {
                                var80 = var86;
                            }
                            var66 = var85.field5278;
                        }
                        class545 var87 = var51.method3582();
                        if (var87 != null) {
                            var63 = var87.field5276;
                            int var88 = var87.field5277;
                            if (var88 > var80) {
                                var80 = var88;
                            }
                            var67 = var87.field5278;
                        }
                        if (var54 != null) {
                            var68 = var54.method3605();
                            if (var68 != null) {
                                var72 = var68.field5276;
                                int var89 = var68.field5277;
                                if (var89 > var80) {
                                    var80 = var89;
                                }
                                var76 = var68.field5278;
                            }
                            var69 = var54.method3580();
                            if (var69 != null) {
                                var73 = var69.field5276;
                                int var90 = var69.field5277;
                                if (var90 > var80) {
                                    var80 = var90;
                                }
                                var77 = var69.field5278;
                            }
                            var70 = var54.method3581();
                            if (var70 != null) {
                                var74 = var70.field5276;
                                int var91 = var70.field5277;
                                if (var91 > var80) {
                                    var80 = var91;
                                }
                                var78 = var70.field5278;
                            }
                            var71 = var54.method3582();
                            if (var71 != null) {
                                var75 = var71.field5276;
                                int var92 = var71.field5277;
                                if (var92 > var80) {
                                    var80 = var92;
                                }
                                var79 = var71.field5278;
                            }
                        }
                        class410 var93 = var51.method3597();
                        if (var93 == null) {
                            var93 = Statics.field1454;
                        }
                        class410 var94;
                        if (var54 == null) {
                            var94 = Statics.field1454;
                        } else {
                            var94 = var54.method3597();
                            if (var94 == null) {
                                var94 = Statics.field1454;
                            }
                        }
                        Object var95 = null;
                        String var96 = null;
                        boolean var97 = false;
                        int var98 = 0;
                        String var99 = var51.method3578(arg0.field1202[var48]);
                        int var100 = var93.method7103(var99);
                        if (var54 != null) {
                            var96 = var54.method3578(arg0.field1217[var48]);
                            var98 = var94.method7103(var96);
                        }
                        int var101 = 0;
                        int var102 = 0;
                        if (var61 > 0) {
                            if (var85 == null && var87 == null) {
                                var101 = 1;
                            } else {
                                var101 = var100 / var61 + 1;
                            }
                        }
                        if (var54 != null && var73 > 0) {
                            if (var70 == null && var71 == null) {
                                var102 = 1;
                            } else {
                                var102 = var98 / var73 + 1;
                            }
                        }
                        int var103 = 0;
                        int var104 = var103;
                        if (var60 > 0) {
                            var103 += var60;
                        }
                        var103 += 2;
                        int var105 = var103;
                        if (var62 > 0) {
                            var103 += var62;
                        }
                        int var106 = var103;
                        int var107 = var103;
                        int var109;
                        if (var61 > 0) {
                            int var108 = var61 * var101;
                            var109 = var103 + var108;
                            var107 = (var108 - var100) / 2 + var103;
                        } else {
                            var109 = var100 + var103;
                        }
                        int var110 = var109;
                        if (var63 > 0) {
                            var109 += var63;
                        }
                        int var111 = 0;
                        int var112 = 0;
                        int var113 = 0;
                        int var114 = 0;
                        int var115 = 0;
                        if (var54 != null) {
                            var109 += 2;
                            var111 = var109;
                            if (var72 > 0) {
                                var109 += var72;
                            }
                            var109 += 2;
                            var112 = var109;
                            if (var74 > 0) {
                                var109 += var74;
                            }
                            var113 = var109;
                            var115 = var109;
                            if (var73 > 0) {
                                int var116 = var73 * var102;
                                var109 += var116;
                                var115 += (var116 - var98) / 2;
                            } else {
                                var109 += var98;
                            }
                            var114 = var109;
                            if (var75 > 0) {
                                var109 += var75;
                            }
                        }
                        int var117 = arg0.field1172[var48] - field677;
                        int var118 = var51.field2082 - var51.field2082 * var117 / var51.field2070;
                        int var119 = var51.field2090 * var117 / var51.field2070 + -var51.field2090;
                        int var120 = field615 + arg2 - (var109 >> 1) + var118;
                        int var121 = field616 + arg3 - 12 + var119;
                        int var122 = var121;
                        int var123 = var80 + var121;
                        int var124 = var51.field2087 + var121 + 15;
                        int var125 = var124 - var93.field4557;
                        int var126 = var93.field4558 + var124;
                        if (var125 < var121) {
                            var122 = var125;
                        }
                        if (var126 > var123) {
                            var123 = var126;
                        }
                        int var127 = 0;
                        if (var54 != null) {
                            var127 = var54.field2087 + var121 + 15;
                            int var128 = var127 - var94.field4557;
                            int var129 = var94.field4558 + var127;
                            if (var128 < var122) {
                                ;
                            }
                            if (var129 > var123) {
                                ;
                            }
                        }
                        int var132 = 255;
                        if (var51.field2084 >= 0) {
                            var132 = (var117 << 8) / (var51.field2070 - var51.field2084);
                        }
                        if (var132 >= 0 && var132 < 255) {
                            if (var81 != null) {
                                var81.method9001(var104 + var120 - var64, var121, var132);
                            }
                            if (var85 != null) {
                                var85.method9001(var105 + var120 - var66, var121, var132);
                            }
                            if (var83 != null) {
                                for (int var133 = 0; var133 < var101; var133++) {
                                    var83.method9001(var61 * var133 + (var106 + var120 - var65), var121, var132);
                                }
                            }
                            if (var87 != null) {
                                var87.method9001(var110 + var120 - var67, var121, var132);
                            }
                            var93.method7110(var99, var107 + var120, var124, var51.field2076, 0, var132);
                            if (var54 != null) {
                                if (var68 != null) {
                                    var68.method9001(var111 + var120 - var76, var121, var132);
                                }
                                if (var70 != null) {
                                    var70.method9001(var112 + var120 - var78, var121, var132);
                                }
                                if (var69 != null) {
                                    for (int var134 = 0; var134 < var102; var134++) {
                                        var69.method9001(var73 * var134 + (var113 + var120 - var77), var121, var132);
                                    }
                                }
                                if (var71 != null) {
                                    var71.method9001(var114 + var120 - var79, var121, var132);
                                }
                                var94.method7110(var96, var115 + var120, var127, var54.field2076, 0, var132);
                            }
                        } else {
                            if (var81 != null) {
                                var81.method8995(var104 + var120 - var64, var121);
                            }
                            if (var85 != null) {
                                var85.method8995(var105 + var120 - var66, var121);
                            }
                            if (var83 != null) {
                                for (int var135 = 0; var135 < var101; var135++) {
                                    var83.method8995(var61 * var135 + (var106 + var120 - var65), var121);
                                }
                            }
                            if (var87 != null) {
                                var87.method8995(var110 + var120 - var67, var121);
                            }
                            var93.method7109(var99, var107 + var120, var124, var51.field2076 | 0xFF000000, 0);
                            if (var54 != null) {
                                if (var68 != null) {
                                    var68.method8995(var111 + var120 - var76, var121);
                                }
                                if (var70 != null) {
                                    var70.method8995(var112 + var120 - var78, var121);
                                }
                                if (var69 != null) {
                                    for (int var136 = 0; var136 < var102; var136++) {
                                        var69.method8995(var73 * var136 + (var113 + var120 - var77), var121);
                                    }
                                }
                                if (var71 != null) {
                                    var71.method8995(var114 + var120 - var79, var121);
                                }
                                var94.method7109(var96, var115 + var120, var127, var54.field2076 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.kg(IIIII)V")
    public static final void method2624(int arg0, int arg1, int arg2, int arg3) {
        field602 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class108.field1351;
        int[] var8 = class108.field1357;
        for (int var9 = 0; var9 < field558 + var7; var9++) {
            class96 var10;
            if (var9 < var7) {
                var10 = field738[var8[var9]];
                if (field637 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field133 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field557[field559[var9 - var7]];
            }
            method6630(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field629 && var6 != -1) {
            method6630(Statics.field133, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method6630(field738[field637], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field602; var11++) {
            int var12 = field711[var11];
            int var13 = field605[var11];
            int var14 = field607[var11];
            int var15 = field606[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field605[var17] - field606[var17] && var13 - var15 < field605[var17] + 2 && var12 - var14 < field711[var17] + field607[var17] && var12 + var14 > field711[var17] - field607[var17] && field605[var17] - field606[var17] < var13) {
                        var13 = field605[var17] - field606[var17];
                        var16 = true;
                    }
                }
            }
            field615 = field711[var11];
            field616 = field605[var11] = var13;
            String var18 = field612[var11];
            if (field675 == 0) {
                int var19 = 16776960;
                if (field796[var11] < 6) {
                    var19 = field657[field796[var11]];
                }
                if (field796[var11] == 6) {
                    var19 = field681 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field796[var11] == 7) {
                    var19 = field681 % 20 < 10 ? 255 : 65535;
                }
                if (field796[var11] == 8) {
                    var19 = field681 % 20 < 10 ? 45056 : 8454016;
                }
                if (field796[var11] == 9) {
                    int var20 = 150 - field611[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field796[var11] == 10) {
                    int var21 = 150 - field611[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field796[var11] == 11) {
                    int var22 = 150 - field611[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field796[var11] == 12 && field610[var11] == null) {
                    int var23 = var18.length();
                    field610[var11] = new int[var23];
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = (int) ((float) var24 / (float) var23 * 64.0F);
                        int var26 = var25 << 10 | 0x380 | 0x40;
                        field610[var11][var24] = class483.field4872[var26];
                    }
                }
                if (field753[var11] == 0) {
                    Statics.field1089.method7193(var18, field615 + arg0, field616 + arg1, var19, 0, field610[var11]);
                }
                if (field753[var11] == 1) {
                    Statics.field1089.method7115(var18, field615 + arg0, field616 + arg1, var19, 0, field681, field610[var11]);
                }
                if (field753[var11] == 2) {
                    Statics.field1089.method7116(var18, field615 + arg0, field616 + arg1, var19, 0, field681, field610[var11]);
                }
                if (field753[var11] == 3) {
                    Statics.field1089.method7117(var18, field615 + arg0, field616 + arg1, var19, 0, field681, 150 - field611[var11], field610[var11]);
                }
                if (field753[var11] == 4) {
                    int var27 = (150 - field611[var11]) * (Statics.field1089.method7103(var18) + 100) / 150;
                    class541.method8877(field615 + arg0 - 50, arg1, field615 + arg0 + 50, arg1 + arg3);
                    Statics.field1089.method7119(var18, field615 + arg0 + 50 - var27, field616 + arg1, var19, 0, field610[var11]);
                    class541.method8876(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field753[var11] == 5) {
                    int var28 = 150 - field611[var11];
                    int var29 = 0;
                    if (var28 < 25) {
                        var29 = var28 - 25;
                    } else if (var28 > 125) {
                        var29 = var28 - 125;
                    }
                    class541.method8877(arg0, field616 + arg1 - Statics.field1089.field4556 - 1, arg0 + arg2, field616 + arg1 + 5);
                    Statics.field1089.method7193(var18, field615 + arg0, field616 + arg1 + var29, var19, 0, field610[var11]);
                    class541.method8876(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1089.method7112(var18, field615 + arg0, field616 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("px.kd(B)V")
    public static final void method7089() {
        field622 = 0;
        int var0 = (Statics.field133.field1232 >> 7) + Statics.field1900;
        int var1 = (Statics.field133.field1173 >> 7) + Statics.field2683;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field622 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field622 = 1;
        }
        if (field622 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field622 = 0;
        }
    }

    @ObfuscatedName("gv.kf(IIIIB)V")
    public static final void method3218(int arg0, int arg1, int arg2, int arg3) {
        method7089();
    }

    @ObfuscatedName("gv.kx(Ldf;II)V")
    public static final void method3219(class96 arg0, int arg1) {
        method1822(arg0.field1232, arg0.field1173, arg1);
    }

    @ObfuscatedName("cr.ke(IIII)V")
    public static final void method1822(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field615 = -1;
            field616 = -1;
            return;
        }
        int var3 = method293(arg0, arg1, Statics.field1428) - arg2;
        int var4 = arg0 - Statics.field219;
        int var5 = var3 - Statics.field158;
        int var6 = arg1 - Statics.field4408;
        int var7 = class270.field2803[Statics.field1456];
        int var8 = class270.field2808[Statics.field1456];
        int var9 = class270.field2803[Statics.field1254];
        int var10 = class270.field2808[Statics.field1254];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field615 = field785 * var11 / var15 + field783 / 2;
            field616 = field785 * var14 / var15 + field505 / 2;
        } else {
            field615 = -1;
            field616 = -1;
        }
    }

    @ObfuscatedName("as.kr(IIIB)I")
    public static final int method293(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class82.field1009[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class82.field1020[var5][var3][var4] + class82.field1020[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class82.field1020[var5][var3][var4 + 1] + class82.field1020[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("rg.kb(ZLuo;B)V")
    public static final void method7892(boolean arg0, class530 arg1) {
        field573 = arg0;
        if (!field573) {
            arg1.method8605();
            int var2 = arg1.method8572();
            int var3 = arg1.method8604();
            int var4 = arg1.method8775();
            Statics.field1787 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1787[var5][var6] = arg1.method8566();
                }
            }
            Statics.field181 = new int[var4];
            Statics.field2471 = new int[var4];
            Statics.field3967 = new int[var4];
            Statics.field3468 = new byte[var4][];
            Statics.field3629 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field181[var7] = var10;
                    Statics.field2471[var7] = Statics.field160.method6412("m" + var8 + "_" + var9);
                    Statics.field3967[var7] = Statics.field160.method6412("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method1111(var3, var2, true);
            return;
        }
        int var11 = arg1.method8712();
        boolean var12 = arg1.method8594() == 1;
        int var13 = arg1.method8604();
        int var14 = arg1.method8775();
        arg1.method8525();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8509(1);
                    if (var18 == 1) {
                        field574[var15][var16][var17] = arg1.method8509(26);
                    } else {
                        field574[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8505();
        Statics.field1787 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1787[var19][var20] = arg1.method8566();
            }
        }
        Statics.field181 = new int[var14];
        Statics.field2471 = new int[var14];
        Statics.field3967 = new int[var14];
        Statics.field3468 = new byte[var14][];
        Statics.field3629 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field574[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field181[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field181[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field2471[var21] = Statics.field160.method6412("m" + var30 + "_" + var31);
                            Statics.field3967[var21] = Statics.field160.method6412("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method1111(var11, var13, !var12);
    }

    @ObfuscatedName("cl.kp(IIZB)V")
    public static final void method1111(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field135 == arg0 && Statics.field1926 == arg1) {
            return;
        }
        Statics.field135 = arg0;
        Statics.field1926 = arg1;
        Statics.method2960(25);
        method3574(class367.field3987, true);
        int var3 = Statics.field1900;
        int var4 = Statics.field2683;
        Statics.field1900 = (arg0 - 6) * 8;
        Statics.field2683 = (arg1 - 6) * 8;
        int var5 = Statics.field1900 - var3;
        int var6 = Statics.field2683 - var4;
        int var7 = Statics.field1900;
        int var8 = Statics.field2683;
        for (int var9 = 0; var9 < 65536; var9++) {
            class101 var10 = field557[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1243[var11] -= var5;
                    var10.field1244[var11] -= var6;
                }
                var10.field1232 -= var5 * 128;
                var10.field1173 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class92 var13 = field738[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1243[var14] -= var5;
                    var13.field1244[var14] -= var6;
                }
                var13.field1232 -= var5 * 128;
                var13.field1173 -= var6 * 128;
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
                        field644[var25][var21][var22] = field644[var25][var23][var24];
                    } else {
                        field644[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class95 var26 = (class95) field639.method6670(); var26 != null; var26 = (class95) field639.method6665()) {
            var26.field1160 -= var5;
            var26.field1161 -= var6;
            if (var26.field1160 < 0 || var26.field1161 < 0 || var26.field1160 >= 104 || var26.field1161 >= 104) {
                var26.method7988();
            }
        }
        if (field750 != 0) {
            field750 -= var5;
            field571 -= var6;
        }
        field754 = 0;
        field760 = false;
        Statics.field219 -= var5 << 7;
        Statics.field4408 -= var6 << 7;
        Statics.field4291 -= var5 << 7;
        Statics.field2669 -= var6 << 7;
        field733 = -1;
        field782.method6664();
        field587.method6664();
        for (int var27 = 0; var27 < 4; var27++) {
            field572[var27].method4083();
        }
    }

    @ObfuscatedName("ch.kl(ZI)V")
    public static final void method1816(boolean arg0) {
        method4569();
        field561.field1410++;
        if (field561.field1410 < 50 && !arg0) {
            return;
        }
        field561.field1410 = 0;
        if (field564 || field561.method2751() == null) {
            return;
        }
        class311 var1 = class311.method7979(class309.field3207, field561.field1404);
        field561.method2736(var1);
        try {
            field561.method2735();
        } catch (IOException var3) {
            field564 = true;
        }
    }

    @ObfuscatedName("rh.ky(I)V")
    public static final void method7870() {
        method1816(false);
        field567 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field3468.length; var1++) {
            if (Statics.field2471[var1] != -1 && Statics.field3468[var1] == null) {
                Statics.field3468[var1] = Statics.field160.method6396(Statics.field2471[var1], 0);
                if (Statics.field3468[var1] == null) {
                    var0 = false;
                    field567++;
                }
            }
            if (Statics.field3967[var1] != -1 && Statics.field3629[var1] == null) {
                Statics.field3629[var1] = Statics.field160.method6397(Statics.field3967[var1], 0, Statics.field1787[var1]);
                if (Statics.field3629[var1] == null) {
                    var0 = false;
                    field567++;
                }
            }
        }
        if (!var0) {
            field569 = 1;
            return;
        }
        field556 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field3468.length; var3++) {
            byte[] var4 = Statics.field3629[var3];
            if (var4 != null) {
                int var5 = (Statics.field181[var3] >> 8) * 64 - Statics.field1900;
                int var6 = (Statics.field181[var3] & 0xFF) * 64 - Statics.field2683;
                if (field573) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class82.method5764(var4, var5, var6);
            }
        }
        if (!var2) {
            field569 = 2;
            return;
        }
        if (field569 != 0) {
            method3574(class367.field3987 + class102.field1315 + class102.field1312 + 100 + "%" + class102.field1314, true);
        }
        method4569();
        Statics.field493.method4880();
        for (int var7 = 0; var7 < 4; var7++) {
            field572[var7].method4083();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class82.field1009[var8][var9][var10] = 0;
                }
            }
        }
        method4569();
        class82.method7981();
        int var11 = Statics.field3468.length;
        class70.method4589();
        method1816(true);
        if (!field573) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field181[var12] >> 8) * 64 - Statics.field1900;
                int var14 = (Statics.field181[var12] & 0xFF) * 64 - Statics.field2683;
                byte[] var15 = Statics.field3468[var12];
                if (var15 != null) {
                    method4569();
                    class82.method451(var15, var13, var14, Statics.field135 * 8 - 48, Statics.field1926 * 8 - 48, field572);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field181[var16] >> 8) * 64 - Statics.field1900;
                int var18 = (Statics.field181[var16] & 0xFF) * 64 - Statics.field2683;
                byte[] var19 = Statics.field3468[var16];
                if (var19 == null && Statics.field1926 < 800) {
                    method4569();
                    class82.method1186(var17, var18, 64, 64);
                }
            }
            method1816(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field3629[var20];
                if (var21 != null) {
                    int var22 = (Statics.field181[var20] >> 8) * 64 - Statics.field1900;
                    int var23 = (Statics.field181[var20] & 0xFF) * 64 - Statics.field2683;
                    method4569();
                    class82.method3925(var21, var22, var23, Statics.field493, field572);
                }
            }
        }
        if (field573) {
            for (int var24 = 0; var24 < 4; var24++) {
                method4569();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field574[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field181.length; var34++) {
                                if (Statics.field181[var34] == var33 && Statics.field3468[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class82.method3073(Statics.field3468[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field572);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class82.method1108(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field574[0][var37][var38];
                    if (var39 == -1) {
                        class82.method1186(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method1816(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method4569();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field574[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field181.length; var49++) {
                                if (Statics.field181[var49] == var48 && Statics.field3629[var49] != null) {
                                    class82.method2186(Statics.field3629[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field493, field572);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method1816(true);
        method4569();
        class82.method2858(Statics.field493, field572);
        method1816(true);
        int var50 = class82.field1017;
        if (var50 > Statics.field1428) {
            var50 = Statics.field1428;
        }
        if (var50 < Statics.field1428 - 1) {
            int var51 = Statics.field1428 - 1;
        }
        if (field503) {
            Statics.field493.method5064(class82.field1017);
        } else {
            Statics.field493.method5064(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method3008(Statics.field1428, var52, var53);
            }
        }
        method4569();
        method2869();
        class202.field2137.method5403();
        if (Statics.field3067.method527()) {
            class311 var54 = class311.method7979(class309.field3235, field561.field1404);
            var54.field3279.method8547(1057001181);
            field561.method2736(var54);
        }
        if (!field573) {
            int var55 = (Statics.field135 - 6) / 8;
            int var56 = (Statics.field135 + 6) / 8;
            int var57 = (Statics.field1926 - 6) / 8;
            int var58 = (Statics.field1926 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field160.method6418("m" + var59 + "_" + var60);
                        Statics.field160.method6418("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        Statics.method2960(30);
        method4569();
        class82.method3089();
        class311 var61 = class311.method7979(class309.field3231, field561.field1404);
        field561.method2736(var61);
        class35.method4223();
    }

    @ObfuscatedName("dy.kt(II)V")
    public static final void method2630(int arg0) {
        int[] var1 = Statics.field4876.field5281;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class82.field1009[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field493.method4962(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class82.field1009[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field493.method4962(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field4876.method8987();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class82.field1009[arg0][var10][var9] & 0x18) == 0) {
                    method2629(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class82.field1009[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2629(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field640 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field493.method4909(Statics.field1428, var11, var12);
                if (var13 != 0L) {
                    int var15 = class284.method3222(var13);
                    int var16 = class202.method3023(var15).field2123;
                    if (var16 >= 0 && class178.method7281(var16).field1850) {
                        field749[field640] = class178.method7281(var16).method3275(false);
                        field800[field640] = var11;
                        field748[field640] = var12;
                        field640++;
                    }
                }
            }
        }
        Statics.field2556.method8954();
    }

    @ObfuscatedName("dy.kj(IIIIII)V")
    public static final void method2629(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field493.method4906(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field493.method5039(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (Statics.method7336(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field4876.field5281;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class284.method3222(var5);
            class202 var14 = class202.method3023(var13);
            if (var14.field2127 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 3 + 512] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 1536 + 2] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class544 var15 = Statics.field2487[var14.field2127];
                if (var15 != null) {
                    int var16 = (var14.field2120 * 4 - var15.field5269) / 2;
                    int var17 = (var14.field2096 * 4 - var15.field5270) / 2;
                    var15.method8966(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field2096) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field493.method4908(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field493.method5039(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class284.method3222(var18);
            class202 var24 = class202.method3023(var23);
            if (var24.field2127 != -1) {
                class544 var25 = Statics.field2487[var24.field2127];
                if (var25 != null) {
                    int var26 = (var24.field2120 * 4 - var25.field5269) / 2;
                    int var27 = (var24.field2096 * 4 - var25.field5270) / 2;
                    var25.method8966(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field2096) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (Statics.method7336(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field4876.field5281;
                int var30 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var29[var30 + 1536] = var28;
                    var29[var30 + 1024 + 1] = var28;
                    var29[var30 + 512 + 2] = var28;
                    var29[var30 + 3] = var28;
                } else {
                    var29[var30] = var28;
                    var29[var30 + 512 + 1] = var28;
                    var29[var30 + 1024 + 2] = var28;
                    var29[var30 + 1536 + 3] = var28;
                }
            }
        }
        long var31 = Statics.field493.method4909(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class284.method3222(var31);
        class202 var34 = class202.method3023(var33);
        if (var34.field2127 == -1) {
            return;
        }
        class544 var35 = Statics.field2487[var34.field2127];
        if (var35 != null) {
            int var36 = (var34.field2120 * 4 - var35.field5269) / 2;
            int var37 = (var34.field2096 * 4 - var35.field5270) / 2;
            var35.method8966(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field2096) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.kc(Led;IB)Z")
    public boolean method1531(class112 arg0, int arg1) {
        if (arg0.field1407 == 0) {
            Statics.field1292 = null;
        } else {
            if (Statics.field1292 == null) {
                Statics.field1292 = new class445(Statics.field1465, Statics.field3067);
            }
            Statics.field1292.method7487(arg0.field1405, arg1);
        }
        field706 = field695;
        Statics.field1834 = true;
        arg0.field1414 = null;
        return true;
    }

    @ObfuscatedName("client.kw(Led;I)Z")
    public boolean method1699(class112 arg0) {
        if (Statics.field1292 != null) {
            Statics.field1292.method7488(arg0.field1405);
        }
        field706 = field695;
        Statics.field1834 = true;
        arg0.field1414 = null;
        return true;
    }

    @ObfuscatedName("client.ko(Led;I)Z")
    public final boolean method1211(class112 arg0) {
        class455 var2 = arg0.method2751();
        class530 var3 = arg0.field1405;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1414 == null) {
                if (arg0.field1409) {
                    if (!var2.method7658(1)) {
                        return false;
                    }
                    var2.method7666(arg0.field1405.field5178, 0, 1);
                    arg0.field1400 = 0;
                    arg0.field1409 = false;
                }
                var3.field5181 = 0;
                if (var3.method8500()) {
                    if (!var2.method7658(1)) {
                        return false;
                    }
                    var2.method7666(arg0.field1405.field5178, 1, 1);
                    arg0.field1400 = 0;
                }
                arg0.field1409 = true;
                class312[] var4 = class312.method3076();
                int var5 = var3.method8501();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5181);
                }
                arg0.field1414 = var4[var5];
                arg0.field1407 = arg0.field1414.field3374;
            }
            if (arg0.field1407 == -1) {
                if (!var2.method7658(1)) {
                    return false;
                }
                arg0.method2751().method7666(var3.field5178, 0, 1);
                arg0.field1407 = var3.field5178[0] & 0xFF;
            }
            if (arg0.field1407 == -2) {
                if (!var2.method7658(2)) {
                    return false;
                }
                arg0.method2751().method7666(var3.field5178, 0, 2);
                var3.field5181 = 0;
                arg0.field1407 = var3.method8775();
            }
            if (!var2.method7658(arg0.field1407)) {
                return false;
            }
            var3.field5181 = 0;
            var2.method7666(var3.field5178, 0, arg0.field1407);
            arg0.field1400 = 0;
            field538.method7347();
            arg0.field1408 = arg0.field1412;
            arg0.field1412 = arg0.field1403;
            arg0.field1403 = arg0.field1414;
            if (class312.field3362 == arg0.field1414) {
                int var6 = var3.method8572();
                int var7 = var3.method8566();
                int var8 = var3.method8775();
                int var9 = var3.method8604();
                class347 var10 = Statics.field4415.method5742(var7);
                if (var10.field3754 != var8 || var10.field3755 != var9 || var10.field3757 != var6) {
                    var10.field3754 = var8;
                    var10.field3755 = var9;
                    var10.field3757 = var6;
                    Statics.method5074(var10);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3323 == arg0.field1414) {
                int var11 = var3.method8593();
                int var12 = var3.method8712();
                class92 var13;
                if (field625 == var12) {
                    var13 = Statics.field133;
                } else {
                    var13 = field738[var12];
                }
                int var14 = var3.method8604();
                int var15 = var3.method8616();
                if (var13 != null) {
                    var13.method2368(var11, var14, var15 >> 16, var15 & 0xFFFF);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3369 == arg0.field1414) {
                int var16 = var3.method8561();
                if (var3.method8561() == 0) {
                    field790[var16] = new class384();
                    var3.field5181 += 18;
                } else {
                    var3.field5181--;
                    field790[var16] = new class384(var3, false);
                }
                field591 = field695;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3299 == arg0.field1414) {
                Statics.field2479 = var3.method8561();
                Statics.field1945 = var3.method8593();
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3306 == arg0.field1414) {
                int var17 = var3.method8604();
                class85.method2069(var17);
                field698[++field778 - 1 & 0x1F] = var17 & 0x7FFF;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3330 == arg0.field1414) {
                byte[] var18 = new byte[arg0.field1407];
                var3.method8531(var18, 0, var18.length);
                class531 var19 = new class531(var18);
                String var20 = var19.method8641();
                class32.method3975(var20, true, false);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3410 == arg0.field1414) {
                int var21 = var3.method8561();
                int var22 = var3.method8561();
                int var23 = var3.method8561();
                int var24 = var3.method8561();
                field768[var21] = true;
                field723[var21] = var22;
                field770[var21] = var23;
                field789[var21] = var24;
                field776[var21] = 0;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3290 == arg0.field1414) {
                int var25 = var3.method8616();
                int var26 = var3.method8566();
                class347 var27 = Statics.field4415.method5742(var25);
                class347.method2350(var27, var26);
                Statics.method5074(var27);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3337 == arg0.field1414) {
                int var28 = var3.method8608();
                int var29 = var28 >> 16;
                int var30 = var28 >> 8 & 0xFF;
                int var31 = (var28 >> 4 & 0x7) + var29;
                int var32 = (var28 & 0x7) + var30;
                int var33 = var3.method8572();
                int var34 = var3.method8700();
                int var35 = var3.method8775();
                if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                    int var36 = var31 * 128 + 64;
                    int var37 = var32 * 128 + 64;
                    class72 var38 = new class72(var35, Statics.field1428, var36, var37, method293(var36, var37, Statics.field1428) - var34, var33, field677);
                    field782.method6666(var38);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3373 == arg0.field1414) {
                method7892(false, arg0.field1405);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3394 == arg0.field1414) {
                int var39 = var3.method8561();
                method1817(var39);
                arg0.field1414 = null;
                return false;
            }
            if (class312.field3310 == arg0.field1414) {
                field760 = true;
                field767 = false;
                field762 = true;
                int var40 = var3.method8564();
                int var41 = var3.method8564();
                int var42 = method8437(Statics.field1456 + var41 & 0x7EB);
                int var43 = Statics.field1254 + var40;
                int var44 = var3.method8775();
                int var45 = var3.method8561();
                field766 = new class495(Statics.field1456, var42, var44, var45);
                field501 = new class495(Statics.field1254, var43, var44, var45);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3400 == arg0.field1414) {
                method5413();
                int var46 = var3.method8593();
                int var47 = var3.method8561();
                int var48 = var3.method8594();
                int var49 = var3.method8615();
                field745[var47] = var49;
                field642[var47] = var46;
                field518[var47] = 1;
                field645[var47] = var48;
                for (int var50 = 0; var50 < 98; var50++) {
                    if (var49 >= class357.field3914[var50]) {
                        field518[var47] = var50 + 2;
                    }
                }
                field552[++field666 - 1 & 0x1F] = var47;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3336 == arg0.field1414) {
                field708 = field695;
                byte var51 = var3.method8562();
                class161 var52 = new class161(var3);
                class164 var53;
                if (var51 >= 0) {
                    var53 = field744[var51];
                } else {
                    var53 = Statics.field1443;
                }
                if (var53 == null) {
                    this.method1219(var51);
                    arg0.field1414 = null;
                    return true;
                }
                if (var52.field1745 > var53.field1765) {
                    this.method1219(var51);
                    arg0.field1414 = null;
                    return true;
                }
                if (var52.field1745 < var53.field1765) {
                    arg0.field1414 = null;
                    return true;
                }
                var52.method3194(var53);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3314 == arg0.field1414) {
                int var54 = var3.method8566();
                class87 var55 = (class87) field655.method8301((long) var54);
                if (var55 != null) {
                    method6317(var55, true);
                }
                if (field522 != null) {
                    Statics.method5074(field522);
                    field522 = null;
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3381 == arg0.field1414) {
                field708 = field695;
                byte var56 = var3.method8562();
                if (arg0.field1407 == 1) {
                    if (var56 >= 0) {
                        field744[var56] = null;
                    } else {
                        Statics.field1443 = null;
                    }
                    arg0.field1414 = null;
                    return true;
                }
                if (var56 >= 0) {
                    field744[var56] = new class164(var3);
                } else {
                    Statics.field1443 = new class164(var3);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3344 == arg0.field1414) {
                field760 = true;
                field767 = false;
                field761 = true;
                Statics.field30 = var3.method8561();
                Statics.field1818 = var3.method8561();
                int var57 = var3.method8775();
                int var58 = var3.method8775();
                field763 = var3.method8795();
                int var59 = var3.method8561();
                int var60 = Statics.field30 * 128 + 64;
                int var61 = Statics.field1818 * 128 + 64;
                boolean var62 = false;
                boolean var63 = false;
                int var64;
                int var65;
                if (field763) {
                    var64 = Statics.field158;
                    var65 = method293(var60, var61, Statics.field1428) - var57;
                } else {
                    var64 = method293(Statics.field219, Statics.field4408, Statics.field1428) - Statics.field158;
                    var65 = var57;
                }
                field764 = new class494(Statics.field219, Statics.field4408, var64, var60, var61, var65, var58, var59);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3286 == arg0.field1414) {
                int var66 = var3.method8615();
                int var67 = var3.method8712();
                int var68 = var3.method8775();
                class347 var69 = Statics.field4415.method5742(var66);
                var69.field3759 = (var68 << 16) + var67;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3406 == arg0.field1414) {
                int var70 = var3.method8616();
                int var71 = var3.method8775();
                class347 var72 = Statics.field4415.method5742(var70);
                if (var72.field3746 != 2 || var72.field3747 != var71) {
                    var72.field3746 = 2;
                    var72.field3747 = var71;
                    Statics.method5074(var72);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3289 == arg0.field1414) {
                int var73 = var3.method8604();
                byte var74 = var3.method8620();
                class336.field3597[var73] = var74;
                if (class336.field3598[var73] != var74) {
                    class336.field3598[var73] = var74;
                }
                method3017(var73);
                field498[++field697 - 1 & 0x1F] = var73;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3301 == arg0.field1414) {
                field767 = false;
                field760 = false;
                field761 = false;
                field762 = false;
                Statics.field315 = 0;
                Statics.field4335 = 0;
                Statics.field1767 = 0;
                field763 = false;
                Statics.field2046 = 0;
                Statics.field4691 = 0;
                Statics.field4417 = 0;
                Statics.field1891 = 0;
                Statics.field30 = 0;
                Statics.field1818 = 0;
                Statics.field1297 = 0;
                field764 = null;
                field766 = null;
                field501 = null;
                for (int var75 = 0; var75 < 5; var75++) {
                    field768[var75] = false;
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3357 == arg0.field1414) {
                Statics.field4518 = new class471(Statics.field1838);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3365 == arg0.field1414) {
                int var76 = var3.method8594() * 4;
                byte var77 = var3.method8620();
                int var78 = var3.method8593() * 4;
                int var79 = var3.method8608();
                int var80 = var79 >> 16;
                int var81 = var79 >> 8 & 0xFF;
                int var82 = (var79 >> 4 & 0x7) + var80;
                int var83 = (var79 & 0x7) + var81;
                int var84 = var3.method8572();
                int var85 = var3.method8712();
                int var86 = var3.method8594();
                int var87 = var3.method8561();
                byte var88 = var3.method8597();
                int var89 = var3.method8609();
                int var90 = var3.method8775();
                int var91 = var77 + var82;
                int var92 = var83 + var88;
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104 && var85 != 65535) {
                    int var93 = var82 * 128 + 64;
                    int var94 = var83 * 128 + 64;
                    int var95 = var91 * 128 + 64;
                    int var96 = var92 * 128 + 64;
                    class77 var97 = new class77(var85, Statics.field1428, var93, var94, method293(var93, var94, Statics.field1428) - var78, field677 + var84, field677 + var90, var86, var87, var89, var76);
                    var97.method2131(var95, var96, method293(var95, var96, Statics.field1428) - var76, field677 + var84);
                    field587.method6666(var97);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3366 == arg0.field1414) {
                method2731();
                byte var98 = var3.method8562();
                class147 var99 = new class147(var3);
                class155 var100;
                if (var98 >= 0) {
                    var100 = field743[var98];
                } else {
                    var100 = Statics.field1427;
                }
                if (var100 == null) {
                    this.method1220(var98);
                    arg0.field1414 = null;
                    return true;
                }
                if (var99.field1646 > var100.field1717) {
                    this.method1220(var98);
                    arg0.field1414 = null;
                    return true;
                }
                if (var99.field1646 < var100.field1717) {
                    arg0.field1414 = null;
                    return true;
                }
                var99.method3081(var100);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3367 == arg0.field1414) {
                int var101 = var3.method8608();
                int var102 = var101 >> 16;
                int var103 = var101 >> 8 & 0xFF;
                int var104 = (var101 >> 4 & 0x7) + var102;
                int var105 = (var101 & 0x7) + var103;
                int var106 = var3.method8561();
                int var107 = var106 >> 2;
                int var108 = var106 & 0x3;
                int var109 = field575[var107];
                int var110 = var3.method8572();
                if (var104 >= 0 && var105 >= 0 && var104 < 103 && var105 < 103) {
                    method3223(Statics.field1428, var104, var105, var107, var108, var109, var110);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3377 == arg0.field1414) {
                int var111 = var3.method8566();
                int var112 = var3.method8775();
                if (var111 < -70000) {
                    var112 += 32768;
                }
                class347 var113;
                if (var111 >= 0) {
                    var113 = Statics.field4415.method5742(var111);
                } else {
                    var113 = null;
                }
                while (var3.field5181 < arg0.field1407) {
                    int var114 = var3.method8576();
                    int var115 = var3.method8775();
                    int var116 = 0;
                    if (var115 != 0) {
                        var116 = var3.method8561();
                        if (var116 == 255) {
                            var116 = var3.method8566();
                        }
                    }
                    if (var113 != null && var114 >= 0 && var114 < var113.field3835.length) {
                        var113.field3835[var114] = var115;
                        var113.field3834[var114] = var116;
                    }
                    class85.method5126(var112, var114, var115 - 1, var116);
                }
                if (var113 != null) {
                    Statics.method5074(var113);
                }
                method5413();
                field698[++field778 - 1 & 0x1F] = var112 & 0x7FFF;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3332 == arg0.field1414) {
                int var117 = var3.method8603();
                int var118 = var3.method8775();
                class347 var119 = Statics.field4415.method5742(var117);
                if (var119.field3746 != 6 || var119.field3747 != var118) {
                    var119.field3746 = 6;
                    var119.field3747 = var118;
                    Statics.method5074(var119);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3295 == arg0.field1414) {
                Statics.field2479 = var3.method8593();
                Statics.field1945 = var3.method8594();
                while (var3.field5181 < arg0.field1407) {
                    int var120 = var3.method8561();
                    class310 var121 = class310.method7733()[var120];
                    method5353(var121);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3384 == arg0.field1414) {
                byte var122 = var3.method8562();
                long var123 = (long) var3.method8775();
                long var125 = (long) var3.method8688();
                long var127 = (var123 << 32) + var125;
                boolean var129 = false;
                class164 var130 = var122 >= 0 ? field744[var122] : Statics.field1443;
                if (var130 == null) {
                    var129 = true;
                } else {
                    for (int var131 = 0; var131 < 100; var131++) {
                        if (field735[var131] == var127) {
                            var129 = true;
                            break;
                        }
                    }
                }
                if (!var129) {
                    field735[field736] = var127;
                    field736 = (field736 + 1) % 100;
                    String var132 = class354.method6284(var3);
                    int var133 = var122 >= 0 ? 43 : 46;
                    class111.method2260(var133, "", var132, var130.field1764);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3318 == arg0.field1414) {
                method5413();
                int var134 = var3.method8700();
                int var135 = var3.method8566();
                int var136 = var3.method8700();
                field745[var136] = var135;
                field642[var136] = var134;
                field518[var136] = 1;
                field645[var136] = var134;
                for (int var137 = 0; var137 < 98; var137++) {
                    if (var135 >= class357.field3914[var137]) {
                        field518[var136] = var137 + 2;
                    }
                }
                field552[++field666 - 1 & 0x1F] = var136;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3404 == arg0.field1414) {
                Statics.field4498 = class550.method6540(var3.method8561());
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3342 == arg0.field1414) {
                method5353(class310.field3269);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3356 == arg0.field1414) {
                int var138 = var3.method8616();
                int var139 = var3.method8775();
                int var140 = var139 >> 10 & 0x1F;
                int var141 = var139 >> 5 & 0x1F;
                int var142 = var139 & 0x1F;
                int var143 = (var142 << 3) + (var140 << 19) + (var141 << 11);
                class347 var144 = Statics.field4415.method5742(var138);
                if (var144.field3842 != var143) {
                    var144.field3842 = var143;
                    Statics.method5074(var144);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3296 == arg0.field1414) {
                Statics.field2479 = var3.method8593();
                field653 = var3.method8561();
                Statics.field1945 = var3.method8594();
                while (var3.field5181 < arg0.field1407) {
                    int var145 = var3.method8561();
                    class310 var146 = class310.method7733()[var145];
                    method5353(var146);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3288 == arg0.field1414) {
                for (int var147 = 0; var147 < class336.field3598.length; var147++) {
                    if (class336.field3598[var147] != class336.field3597[var147]) {
                        class336.field3598[var147] = class336.field3597[var147];
                        method3017(var147);
                        field498[++field697 - 1 & 0x1F] = var147;
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3328 == arg0.field1414) {
                return this.method1531(arg0, 1);
            }
            if (class312.field3407 == arg0.field1414) {
                field732 = var3.method8561();
                field585 = var3.method8700();
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3319 == arg0.field1414) {
                boolean var148 = var3.method8593() == 1;
                int var149 = var3.method8566();
                class347 var150 = Statics.field4415.method5742(var149);
                class347.method2609(var150, Statics.field133.field1099, var148);
                Statics.method5074(var150);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3347 == arg0.field1414) {
                byte var151 = var3.method8562();
                String var152 = var3.method8641();
                long var153 = (long) var3.method8775();
                long var155 = (long) var3.method8688();
                class370 var157 = (class370) class389.method6514(class370.method3391(), var3.method8561());
                long var158 = (var153 << 32) + var155;
                boolean var160 = false;
                Object var161 = null;
                class164 var162 = var151 >= 0 ? field744[var151] : Statics.field1443;
                if (var162 == null) {
                    var160 = true;
                } else {
                    int var163 = 0;
                    while (true) {
                        if (var163 >= 100) {
                            if (var157.field4315 && Statics.field3588.method1866(new class554(var152, Statics.field1465))) {
                                var160 = true;
                            }
                            break;
                        }
                        if (field735[var163] == var158) {
                            var160 = true;
                            break;
                        }
                        var163++;
                    }
                }
                if (!var160) {
                    field735[field736] = var158;
                    field736 = (field736 + 1) % 100;
                    String var164 = class414.method7167(class354.method6284(var3));
                    int var165 = var151 >= 0 ? 41 : 44;
                    if (var157.field4317 == -1) {
                        class111.method2260(var165, var152, var164, var162.field1764);
                    } else {
                        class111.method2260(var165, class102.method4121(var157.field4317) + var152, var164, var162.field1764);
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3305 == arg0.field1414) {
                method5353(class310.field3268);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3355 == arg0.field1414) {
                String var166 = var3.method8641();
                int var167 = var3.method8566();
                class347 var168 = Statics.field4415.method5742(var167);
                if (!var166.equals(var168.field3765)) {
                    var168.field3765 = var166;
                    Statics.method5074(var168);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3414 == arg0.field1414) {
                int var169 = var3.method8572();
                int var170 = var3.method8603();
                class347 var171 = Statics.field4415.method5742(var170);
                if (var171.field3746 != 1 || var171.field3747 != var169) {
                    var171.field3746 = 1;
                    var171.field3747 = var169;
                    Statics.method5074(var171);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3370 == arg0.field1414) {
                String var172 = var3.method8641();
                String var173 = class414.method7167(class403.method3221(class354.method6284(var3)));
                class111.method6511(6, var172, var173);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3339 == arg0.field1414) {
                int var174 = var3.method8561();
                method4122(var174);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3294 == arg0.field1414) {
                String var175 = var3.method8641();
                long var176 = (long) var3.method8775();
                long var178 = (long) var3.method8688();
                class370 var180 = (class370) class389.method6514(class370.method3391(), var3.method8561());
                long var181 = (var176 << 32) + var178;
                boolean var183 = false;
                for (int var184 = 0; var184 < 100; var184++) {
                    if (field735[var184] == var181) {
                        var183 = true;
                        break;
                    }
                }
                if (Statics.field3588.method1866(new class554(var175, Statics.field1465))) {
                    var183 = true;
                }
                if (!var183 && field622 == 0) {
                    field735[field736] = var181;
                    field736 = (field736 + 1) % 100;
                    String var185 = class414.method7167(class403.method3221(class354.method6284(var3)));
                    byte var186;
                    if (var180.field4318) {
                        var186 = 7;
                    } else {
                        var186 = 3;
                    }
                    if (var180.field4317 == -1) {
                        class111.method6511(var186, var175, var185);
                    } else {
                        class111.method6511(var186, class102.method4121(var180.field4317) + var175, var185);
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3331 == arg0.field1414) {
                int var187 = var3.method8564();
                int var188 = var3.method8616();
                int var189 = var3.method8606();
                class347 var190 = Statics.field4415.method5742(var188);
                if (var190.field3817 != var189 || var190.field3712 != var187 || var190.field3738 != 0 || var190.field3821 != 0) {
                    var190.field3817 = var189;
                    var190.field3712 = var187;
                    var190.field3738 = 0;
                    var190.field3821 = 0;
                    Statics.method5074(var190);
                    this.method1216(var190);
                    if (var190.field3799 == 0) {
                        method213(Statics.field4415.field3611[var188 >> 16], var190, false);
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3327 == arg0.field1414) {
                int var191 = var3.method8775();
                int var192 = var3.method8561();
                int var193 = var3.method8775();
                Statics.method6326(var191, var192, var193);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3293 == arg0.field1414) {
                int var194 = var3.method8775();
                if (var194 == 65535) {
                    var194 = -1;
                }
                method5736(var194);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3372 == arg0.field1414) {
                int var195 = var3.method8775();
                if (var195 == 65535) {
                    var195 = -1;
                }
                int var196 = var3.method8608();
                Statics.method6899(var195, var196);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3378 == arg0.field1414 && field760) {
                field767 = true;
                field762 = false;
                field761 = false;
                for (int var197 = 0; var197 < 5; var197++) {
                    field768[var197] = false;
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3399 == arg0.field1414) {
                field514 = var3.method8561();
                if (field514 == 1) {
                    field509 = var3.method8775();
                }
                if (field514 >= 2 && field514 <= 6) {
                    if (field514 == 2) {
                        field524 = 64;
                        field525 = 64;
                    }
                    if (field514 == 3) {
                        field524 = 0;
                        field525 = 64;
                    }
                    if (field514 == 4) {
                        field524 = 128;
                        field525 = 64;
                    }
                    if (field514 == 5) {
                        field524 = 64;
                        field525 = 0;
                    }
                    if (field514 == 6) {
                        field524 = 64;
                        field525 = 128;
                    }
                    field514 = 2;
                    field526 = var3.method8775();
                    field614 = var3.method8775();
                    field523 = var3.method8561();
                }
                if (field514 == 10) {
                    field520 = var3.method8775();
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3411 == arg0.field1414) {
                field750 = var3.method8561();
                if (field750 == 255) {
                    field750 = 0;
                }
                field571 = var3.method8561();
                if (field571 == 255) {
                    field571 = 0;
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3346 == arg0.field1414) {
                int var198 = var3.method8594();
                int var199 = var3.method8700();
                int var200 = var3.method8615();
                class347 var201 = Statics.field4415.method5742(var200);
                class347.method2946(var201, var199, var198);
                Statics.method5074(var201);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3287 == arg0.field1414) {
                Statics.field3588.method1849(var3, arg0.field1407);
                field705 = field695;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3326 == arg0.field1414) {
                var3.field5181 += 28;
                if (var3.method8761()) {
                    method2707(var3, var3.field5181 - 28);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3392 == arg0.field1414) {
                int var202 = var3.method8566();
                int var203 = var3.method8572();
                class101 var204 = field557[var203];
                int var205 = var3.method8604();
                int var206 = var3.method8561();
                if (var204 != null) {
                    var204.method2368(var206, var205, var202 >> 16, var202 & 0xFFFF);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3311 == arg0.field1414) {
                method5353(class310.field3275);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3302 == arg0.field1414) {
                field760 = true;
                field767 = false;
                field762 = false;
                Statics.field315 = var3.method8561();
                Statics.field4335 = var3.method8561();
                Statics.field1767 = var3.method8775();
                Statics.field2046 = var3.method8561();
                Statics.field4691 = var3.method8561();
                if (Statics.field4691 >= 100) {
                    int var207 = Statics.field315 * 128 + 64;
                    int var208 = Statics.field4335 * 128 + 64;
                    int var209 = method293(var207, var208, Statics.field1428) - Statics.field1767;
                    int var210 = var207 - Statics.field219;
                    int var211 = var209 - Statics.field158;
                    int var212 = var208 - Statics.field4408;
                    int var213 = (int) Math.sqrt((double) (var210 * var210 + var212 * var212));
                    Statics.field1456 = (int) (Math.atan2((double) var211, (double) var213) * 325.9490051269531D) & 0x7FF;
                    Statics.field1254 = (int) (Math.atan2((double) var210, (double) var212) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1456 < 128) {
                        Statics.field1456 = 128;
                    }
                    if (Statics.field1456 > 383) {
                        Statics.field1456 = 383;
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3403 == arg0.field1414) {
                method5353(class310.field3271);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3320 == arg0.field1414) {
                method5413();
                field672 = var3.method8775();
                field593 = field695;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3322 == arg0.field1414) {
                int var214 = var3.method8604();
                int var215 = var3.method8594();
                if (var214 == 65535) {
                    var214 = -1;
                }
                method6310(Statics.field133, var214, var215);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3300 == arg0.field1414) {
                return this.method1699(arg0);
            }
            if (class312.field3317 == arg0.field1414) {
                method5737(var3.method8641());
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3308 == arg0.field1414) {
                Statics.method3461();
                arg0.field1414 = null;
                return false;
            }
            if (class312.field3335 == arg0.field1414) {
                method5353(class310.field3267);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3401 == arg0.field1414) {
                String var216 = var3.method8641();
                long var217 = var3.method8567();
                long var219 = (long) var3.method8775();
                long var221 = (long) var3.method8688();
                class370 var223 = (class370) class389.method6514(class370.method3391(), var3.method8561());
                long var224 = (var219 << 32) + var221;
                boolean var226 = false;
                for (int var227 = 0; var227 < 100; var227++) {
                    if (field735[var227] == var224) {
                        var226 = true;
                        break;
                    }
                }
                if (var223.field4315 && Statics.field3588.method1866(new class554(var216, Statics.field1465))) {
                    var226 = true;
                }
                if (!var226 && field622 == 0) {
                    field735[field736] = var224;
                    field736 = (field736 + 1) % 100;
                    String var228 = class414.method7167(class403.method3221(class354.method6284(var3)));
                    if (var223.field4317 == -1) {
                        class111.method2260(9, var216, var228, class405.method294(var217));
                    } else {
                        class111.method2260(9, class102.method4121(var223.field4317) + var216, var228, class405.method294(var217));
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3349 == arg0.field1414) {
                method5353(class310.field3265);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3397 == arg0.field1414) {
                int var229 = var3.method8712();
                if (var229 == 65535) {
                    var229 = -1;
                }
                int var230 = var3.method8712();
                int var231 = var3.method8572();
                int var232 = var3.method8604();
                int var233 = var3.method8712();
                int var234 = var3.method8712();
                if (var234 == 65535) {
                    var234 = -1;
                }
                ArrayList var235 = new ArrayList();
                var235.add(var234);
                var235.add(var229);
                method6307(var235, var230, var233, var232, var231);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3376 == arg0.field1414) {
                field760 = true;
                field767 = false;
                field762 = true;
                int var236 = method724(var3.method8564() & 0x7EB);
                int var237 = method8437(var3.method8564() & 0x7EB);
                int var238 = var3.method8775();
                int var239 = var3.method8561();
                field766 = new class495(Statics.field1456, var237, var238, var239);
                field501 = new class495(Statics.field1254, var236, var238, var239);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3304 == arg0.field1414) {
                int var240 = var3.method8572();
                int var241 = var3.method8604();
                int var242 = var3.method8604();
                int var243 = var3.method8775();
                class320.method1847(var242, var241, var243, var240);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3350 == arg0.field1414) {
                method6293(true, var3);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3324 == arg0.field1414) {
                int var244 = var3.method8712();
                short var245 = (short) var3.method8564();
                int var246 = var3.method8700();
                int var247 = var3.method8566();
                class101 var248 = field557[var244];
                if (var248 != null) {
                    var248.method2584(var246, var247, var245);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3363 == arg0.field1414) {
                class37.method3516(var3, arg0.field1407);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3345 == arg0.field1414) {
                Statics.field4518 = null;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3315 == arg0.field1414) {
                int var249 = var3.method8616();
                int var250 = var3.method8712();
                class336.field3597[var250] = var249;
                if (class336.field3598[var250] != var249) {
                    class336.field3598[var250] = var249;
                }
                method3017(var250);
                field498[++field697 - 1 & 0x1F] = var250;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3325 == arg0.field1414) {
                int var251 = var3.method8566();
                class347 var252 = Statics.field4415.method5742(var251);
                for (int var253 = 0; var253 < var252.field3835.length; var253++) {
                    var252.field3835[var253] = -1;
                    var252.field3835[var253] = 0;
                }
                Statics.method5074(var252);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3364 == arg0.field1414) {
                int var254 = var3.method8700();
                int var255 = var3.method8603();
                class347 var256 = Statics.field4415.method5742(var255);
                class347.method5556(var256, Statics.field133.field1099.field3641, var254);
                Statics.method5074(var256);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3382 == arg0.field1414) {
                method5353(class310.field3272);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3395 == arg0.field1414) {
                field760 = true;
                field767 = false;
                field761 = true;
                Statics.field30 = var3.method8561();
                Statics.field1818 = var3.method8561();
                int var257 = var3.method8775();
                int var258 = var3.method8561() * 128 + 64;
                int var259 = var3.method8561() * 128 + 64;
                int var260 = var3.method8775();
                field763 = var3.method8795();
                int var261 = var3.method8561();
                int var262 = Statics.field30 * 128 + 64;
                int var263 = Statics.field1818 * 128 + 64;
                boolean var264 = false;
                boolean var265 = false;
                int var266;
                int var267;
                if (field763) {
                    var266 = Statics.field158;
                    var267 = method293(var262, var263, Statics.field1428) - var257;
                } else {
                    var266 = method293(Statics.field219, Statics.field4408, Statics.field1428) - Statics.field158;
                    var267 = var257;
                }
                field764 = new class493(Statics.field219, Statics.field4408, var266, var262, var263, var267, var258, var259, var260, var261);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3412 == arg0.field1414) {
                field760 = true;
                field767 = false;
                field762 = true;
                Statics.field315 = var3.method8561();
                Statics.field4335 = var3.method8561();
                Statics.field1767 = var3.method8775();
                int var268 = var3.method8775();
                int var269 = var3.method8561();
                int var270 = Statics.field315 * 128 + 64;
                int var271 = Statics.field4335 * 128 + 64;
                int var272 = method293(var270, var271, Statics.field1428) - Statics.field1767;
                int var273 = var270 - Statics.field219;
                int var274 = var272 - Statics.field158;
                int var275 = var271 - Statics.field4408;
                double var276 = Math.sqrt((double) (var273 * var273 + var275 * var275));
                int var278 = method8437((int) (Math.atan2((double) var274, var276) * 325.9490051269531D) & 0x7FF);
                int var279 = method724((int) (Math.atan2((double) var273, (double) var275) * -325.9490051269531D) & 0x7FF);
                field766 = new class495(Statics.field1456, var278, var268, var269);
                field501 = new class495(Statics.field1254, var279, var268, var269);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3353 == arg0.field1414) {
                boolean var280 = var3.method8561() == 1;
                int var281 = var3.method8603();
                class347 var282 = Statics.field4415.method5742(var281);
                if (var282.field3722 != var280) {
                    var282.field3722 = var280;
                    Statics.method5074(var282);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3398 == arg0.field1414) {
                method2731();
                byte var283 = var3.method8562();
                if (arg0.field1407 == 1) {
                    if (var283 >= 0) {
                        field743[var283] = null;
                    } else {
                        Statics.field1427 = null;
                    }
                    arg0.field1414 = null;
                    return true;
                }
                if (var283 >= 0) {
                    field743[var283] = new class155(var3);
                } else {
                    Statics.field1427 = new class155(var3);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3402 == arg0.field1414) {
                int var284 = var3.method8604();
                int var285 = var3.method8616();
                class347 var286 = Statics.field4415.method5742(var285);
                if (var286 != null && var286.field3799 == 0) {
                    if (var284 > var286.field3709 - var286.field3718) {
                        var284 = var286.field3709 - var286.field3718;
                    }
                    if (var284 < 0) {
                        var284 = 0;
                    }
                    if (var286.field3724 != var284) {
                        var286.field3724 = var284;
                        Statics.method5074(var286);
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3371 == arg0.field1414) {
                int var287 = var3.method8564();
                int var288 = var3.method8566();
                class347 var289 = Statics.field4415.method5742(var288);
                if (var289.field3783 != var287 || var287 == -1) {
                    var289.field3783 = var287;
                    var289.field3745 = 0;
                    var289.field3838 = 0;
                    Statics.method5074(var289);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3380 == arg0.field1414) {
                int var290 = var3.method8576();
                boolean var291 = var3.method8561() == 1;
                String var292 = "";
                boolean var293 = false;
                if (var291) {
                    var292 = var3.method8641();
                    if (Statics.field3588.method1866(new class554(var292, Statics.field1465))) {
                        var293 = true;
                    }
                }
                String var294 = var3.method8641();
                if (!var293) {
                    class111.method6511(var290, var292, var294);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3297 == arg0.field1414) {
                Statics.field1945 = var3.method8593();
                Statics.field2479 = var3.method8593();
                for (int var295 = Statics.field1945; var295 < Statics.field1945 + 8; var295++) {
                    for (int var296 = Statics.field2479; var296 < Statics.field2479 + 8; var296++) {
                        if (field644[Statics.field1428][var295][var296] != null) {
                            field644[Statics.field1428][var295][var296] = null;
                            method3008(Statics.field1428, var295, var296);
                        }
                    }
                }
                for (class95 var297 = (class95) field639.method6670(); var297 != null; var297 = (class95) field639.method6665()) {
                    if (var297.field1160 >= Statics.field1945 && var297.field1160 < Statics.field1945 + 8 && var297.field1161 >= Statics.field2479 && var297.field1161 < Statics.field2479 + 8 && Statics.field1428 == var297.field1169) {
                        var297.field1171 = 0;
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3359 == arg0.field1414) {
                class108.method6632(var3, arg0.field1407);
                method5277();
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3386 == arg0.field1414) {
                for (int var298 = 0; var298 < field738.length; var298++) {
                    if (field738[var298] != null) {
                        field738[var298].field1236 = -1;
                    }
                }
                for (int var299 = 0; var299 < field557.length; var299++) {
                    if (field557[var299] != null) {
                        field557[var299].field1236 = -1;
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3358 == arg0.field1414) {
                int var300 = var3.method8604();
                int var301 = var3.method8775();
                class320.method2387(var300, var301);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3388 == arg0.field1414) {
                method5353(class310.field3270);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3368 == arg0.field1414) {
                if (Statics.field4518 == null) {
                    Statics.field4518 = new class471(Statics.field1838);
                }
                class540 var302 = Statics.field1838.method7913(var3);
                Statics.field4518.field4836.method8318(var302.field5247, var302.field5245);
                field702[++field703 - 1 & 0x1F] = var302.field5247;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3298 == arg0.field1414) {
                int var303 = var3.method8712();
                if (var303 == 65535) {
                    var303 = -1;
                }
                int var304 = var3.method8616();
                int var305 = var3.method8603();
                int var306 = var3.method8775();
                if (var306 == 65535) {
                    var306 = -1;
                }
                for (int var307 = var306; var307 <= var303; var307++) {
                    long var308 = ((long) var304 << 32) + (long) var307;
                    class489 var310 = field718.method8301(var308);
                    if (var310 != null) {
                        var310.method7988();
                    }
                    field718.method8307(new class488(var305), var308);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3303 == arg0.field1414) {
                field653 = var3.method8593();
                Statics.field1945 = var3.method8593();
                Statics.field2479 = var3.method8700();
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3321 == arg0.field1414) {
                field752 = var3.method8561();
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3396 == arg0.field1414) {
                int var311 = var3.method8615();
                int var312 = var3.method8603();
                int var313 = var3.method8775();
                if (var313 == 65535) {
                    var313 = -1;
                }
                class347 var314 = Statics.field4415.method5742(var311);
                if (var314.field3700) {
                    var314.field3822 = var313;
                    var314.field3836 = var312;
                    class203 var316 = class203.method5762(var313).method3671(var312);
                    var314.field3754 = var316.field2161;
                    var314.field3755 = var316.field2162;
                    var314.field3756 = var316.field2163;
                    var314.field3752 = var316.field2164;
                    var314.field3717 = var316.field2165;
                    var314.field3757 = var316.field2160;
                    if (var316.field2166 == 1) {
                        var314.field3833 = 1;
                    } else {
                        var314.field3833 = 2;
                    }
                    if (var314.field3786 > 0) {
                        var314.field3757 = var314.field3757 * 32 / var314.field3786;
                    } else if (var314.field3713 > 0) {
                        var314.field3757 = var314.field3757 * 32 / var314.field3713;
                    }
                    Statics.method5074(var314);
                } else if (var313 == -1) {
                    var314.field3746 = 0;
                    arg0.field1414 = null;
                    return true;
                } else {
                    class203 var315 = class203.method5762(var313).method3671(var312);
                    var314.field3746 = 4;
                    var314.field3747 = var313;
                    var314.field3754 = var315.field2161;
                    var314.field3755 = var315.field2162;
                    var314.field3757 = var315.field2160 * 100 / var312;
                    Statics.method5074(var314);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3340 == arg0.field1414) {
                int var317 = var3.method8604();
                if (var317 == 65535) {
                    var317 = -1;
                }
                field671 = var317;
                this.method1215(false);
                method7707(var317);
                class71.method3513(field671);
                for (int var318 = 0; var318 < 100; var318++) {
                    field721[var318] = true;
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3343 == arg0.field1414) {
                int var319 = var3.method8712();
                int var320 = var3.method8594();
                int var321 = var3.method8616();
                class87 var322 = (class87) field655.method8301((long) var321);
                if (var322 != null) {
                    method6317(var322, var322.field1052 != var319);
                }
                method3186(var321, var319, var320);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3387 == arg0.field1414) {
                for (int var323 = 0; var323 < Statics.field3857; var323++) {
                    class176 var324 = class176.method2945(var323);
                    if (var324 != null) {
                        class336.field3597[var323] = 0;
                        class336.field3598[var323] = 0;
                    }
                }
                method5413();
                field697 += 32;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3312 == arg0.field1414) {
                field760 = true;
                field767 = false;
                field761 = false;
                Statics.field30 = var3.method8561();
                Statics.field1818 = var3.method8561();
                Statics.field1297 = var3.method8775();
                Statics.field1891 = var3.method8561();
                Statics.field4417 = var3.method8561();
                if (Statics.field4417 >= 100) {
                    Statics.field219 = Statics.field30 * 128 + 64;
                    Statics.field4408 = Statics.field1818 * 128 + 64;
                    Statics.field158 = method293(Statics.field219, Statics.field4408, Statics.field1428) - Statics.field1297;
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3393 == arg0.field1414) {
                method5413();
                field678 = var3.method8564();
                field593 = field695;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3391 == arg0.field1414) {
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3313 == arg0.field1414) {
                int var325 = var3.method8688();
                int var326 = var325 >> 16;
                int var327 = var325 >> 8 & 0xFF;
                int var328 = (var325 >> 4 & 0x7) + var326;
                int var329 = (var325 & 0x7) + var327;
                int var330 = var3.method8712();
                int var331 = var3.method8609();
                byte var332 = var3.method8597();
                int var333 = var3.method8712();
                int var334 = var3.method8594() * 4;
                int var335 = var3.method8775();
                int var336 = var3.method8594();
                byte var337 = var3.method8596();
                int var338 = var3.method8775();
                int var339 = var3.method8700() * 4;
                int var340 = var328 + var337;
                int var341 = var329 + var332;
                if (var328 >= 0 && var329 >= 0 && var328 < 104 && var329 < 104 && var340 >= 0 && var341 >= 0 && var340 < 104 && var341 < 104 && var335 != 65535) {
                    int var342 = var328 * 128 + 64;
                    int var343 = var329 * 128 + 64;
                    int var344 = var340 * 128 + 64;
                    int var345 = var341 * 128 + 64;
                    class77 var346 = new class77(var335, Statics.field1428, var342, var343, method293(var342, var343, Statics.field1428) - var339, field677 + var333, field677 + var338, var336, var330, var331, var334);
                    var346.method2131(var344, var345, method293(var344, var345, Statics.field1428) - var334, field677 + var333);
                    field587.method6666(var346);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3405 == arg0.field1414) {
                int var347 = var3.method8566();
                if (field801 != var347) {
                    field801 = var347;
                    method7678();
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3383 == arg0.field1414) {
                int var348 = arg0.field1407 + var3.field5181;
                int var349 = var3.method8775();
                if (var349 == 65535) {
                    var349 = -1;
                }
                int var350 = var3.method8775();
                if (field671 != var349) {
                    field671 = var349;
                    this.method1215(false);
                    method7707(field671);
                    class71.method3513(field671);
                    for (int var351 = 0; var351 < 100; var351++) {
                        field721[var351] = true;
                    }
                }
                while (var350-- > 0) {
                    int var352 = var3.method8566();
                    int var353 = var3.method8775();
                    int var354 = var3.method8561();
                    class87 var355 = (class87) field655.method8301((long) var352);
                    if (var355 != null && var355.field1052 != var353) {
                        method6317(var355, true);
                        var355 = null;
                    }
                    if (var355 == null) {
                        var355 = method3186(var352, var353, var354);
                    }
                    var355.field1054 = true;
                }
                for (class87 var356 = (class87) field655.method8304(); var356 != null; var356 = (class87) field655.method8302()) {
                    if (var356.field1054) {
                        var356.field1054 = false;
                    } else {
                        method6317(var356, true);
                    }
                }
                field718 = new class505(512);
                while (var3.field5181 < var348) {
                    int var357 = var3.method8566();
                    int var358 = var3.method8775();
                    int var359 = var3.method8775();
                    int var360 = var3.method8566();
                    for (int var361 = var358; var361 <= var359; var361++) {
                        long var362 = ((long) var357 << 32) + (long) var361;
                        field718.method8307(new class488(var360), var362);
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3316 == arg0.field1414) {
                int var364 = var3.method8603();
                class347 var365 = Statics.field4415.method5742(var364);
                var365.field3746 = 3;
                var365.field3747 = Statics.field133.field1099.method5794();
                Statics.method5074(var365);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3333 == arg0.field1414) {
                return this.method1531(arg0, 2);
            }
            if (class312.field3360 == arg0.field1414) {
                int var366 = var3.method8616();
                int var367 = var3.method8603();
                class87 var368 = (class87) field655.method8301((long) var366);
                class87 var369 = (class87) field655.method8301((long) var367);
                if (var369 != null) {
                    method6317(var369, var368 == null || var368.field1052 != var369.field1052);
                }
                if (var368 != null) {
                    var368.method7988();
                    field655.method8307(var368, (long) var367);
                }
                class347 var370 = Statics.field4415.method5742(var366);
                if (var370 != null) {
                    Statics.method5074(var370);
                }
                class347 var371 = Statics.field4415.method5742(var367);
                if (var371 != null) {
                    Statics.method5074(var371);
                    method213(Statics.field4415.field3611[var371.field3701 >>> 16], var371, true);
                }
                if (field671 != -1) {
                    method4647(field671, 1);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3351 == arg0.field1414) {
                field590 = var3.method8604() * 30;
                field593 = field695;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3348 == arg0.field1414) {
                boolean var372 = var3.method8561() == 1;
                if (var372) {
                    Statics.field75 = Statics.method2852() - var3.method8567();
                    Statics.field4412 = new class377(var3, true);
                } else {
                    Statics.field4412 = null;
                }
                field710 = field695;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3385 == arg0.field1414) {
                int var373 = var3.method8700();
                String var374 = var3.method8641();
                int var375 = var3.method8561();
                if (var375 >= 1 && var375 <= 8) {
                    if (var374.equalsIgnoreCase(class367.field4120)) {
                        var374 = null;
                    }
                    field634[var375 - 1] = var374;
                    field635[var375 - 1] = var373 == 0;
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3338 == arg0.field1414) {
                Statics.field2479 = var3.method8594();
                field653 = var3.method8561();
                Statics.field1945 = var3.method8700();
                for (int var376 = Statics.field1945; var376 < Statics.field1945 + 8; var376++) {
                    for (int var377 = Statics.field2479; var377 < Statics.field2479 + 8; var377++) {
                        if (field644[field653][var376][var377] != null) {
                            field644[field653][var376][var377] = null;
                            method3008(field653, var376, var377);
                        }
                    }
                }
                for (class95 var378 = (class95) field639.method6670(); var378 != null; var378 = (class95) field639.method6665()) {
                    if (var378.field1160 >= Statics.field1945 && var378.field1160 < Statics.field1945 + 8 && var378.field1161 >= Statics.field2479 && var378.field1161 < Statics.field2479 + 8 && field653 == var378.field1169) {
                        var378.field1171 = 0;
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3390 == arg0.field1414) {
                int var379 = var3.method8712();
                int var380 = var3.method8604();
                int var381 = var3.method8604();
                int var382 = var3.method8604();
                int var383 = var3.method8712();
                if (var383 == 65535) {
                    var383 = -1;
                }
                ArrayList var384 = new ArrayList();
                var384.add(var383);
                method6307(var384, var382, var380, var381, var379);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3413 == arg0.field1414) {
                class68 var385 = new class68();
                var385.field818 = var3.method8641();
                var385.field807 = var3.method8775();
                int var386 = var3.method8566();
                var385.field816 = var386;
                if (var385.method1786()) {
                    var385.field822 = "beta";
                }
                Statics.method2960(45);
                var2.method7662();
                Object var387 = null;
                class76.method7781(var385);
                arg0.field1414 = null;
                return false;
            }
            if (class312.field3291 == arg0.field1414) {
                int var388 = var3.method8566();
                int var389 = var3.method8775();
                if (var388 < -70000) {
                    var389 += 32768;
                }
                class347 var390;
                if (var388 >= 0) {
                    var390 = Statics.field4415.method5742(var388);
                } else {
                    var390 = null;
                }
                if (var390 != null) {
                    for (int var391 = 0; var391 < var390.field3835.length; var391++) {
                        var390.field3835[var391] = 0;
                        var390.field3834[var391] = 0;
                    }
                }
                class85.method2905(var389);
                int var392 = var3.method8775();
                for (int var393 = 0; var393 < var392; var393++) {
                    int var394 = var3.method8593();
                    if (var394 == 255) {
                        var394 = var3.method8603();
                    }
                    int var395 = var3.method8572();
                    if (var390 != null && var393 < var390.field3835.length) {
                        var390.field3835[var393] = var395;
                        var390.field3834[var393] = var394;
                    }
                    class85.method5126(var389, var393, var395 - 1, var394);
                }
                if (var390 != null) {
                    Statics.method5074(var390);
                }
                method5413();
                field698[++field778 - 1 & 0x1F] = var389 & 0x7FFF;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3329 == arg0.field1414) {
                Statics.field3588.method1821();
                field705 = field695;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3389 == arg0.field1414) {
                method6293(false, var3);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3341 == arg0.field1414) {
                method5353(class310.field3274);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3309 == arg0.field1414) {
                boolean var396 = var3.method8795();
                if (!var396) {
                    Statics.field3600 = null;
                } else if (Statics.field3600 == null) {
                    Statics.field3600 = new class386();
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3361 == arg0.field1414) {
                if (field671 != -1) {
                    method4647(field671, 0);
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3408 == arg0.field1414) {
                method7892(true, arg0.field1405);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3409 == arg0.field1414) {
                Statics.field3588.field830.method7471(var3, arg0.field1407);
                method5717();
                field705 = field695;
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3292 == arg0.field1414) {
                method5353(class310.field3264);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3354 == arg0.field1414) {
                int var397 = var3.method8566();
                int var398 = var3.method8566();
                int var399 = class35.method3345();
                class311 var400 = class311.method7979(class309.field3187, field561.field1404);
                var400.field3279.method8657(field211);
                var400.field3279.method8657(var399);
                var400.field3279.method8613(var397);
                var400.field3279.method8611(var398);
                field561.method2736(var400);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3379 == arg0.field1414) {
                String var401 = var3.method8641();
                Object[] var402 = new Object[var401.length() + 1];
                for (int var403 = var401.length() - 1; var403 >= 0; var403--) {
                    if (var401.charAt(var403) == 's') {
                        var402[var403 + 1] = var3.method8641();
                    } else {
                        var402[var403 + 1] = Integer.valueOf(var3.method8566());
                    }
                }
                var402[0] = Integer.valueOf(var3.method8566());
                class88 var404 = new class88();
                var404.field1067 = var402;
                class71.method4538(var404);
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3307 == arg0.field1414) {
                int var405 = var3.method8593();
                int var406 = var3.method8604();
                int var407 = var3.method8572();
                if (var406 == 65535) {
                    var406 = -1;
                }
                class101 var408 = field557[var407];
                if (var408 != null) {
                    if (var408.field1236 == var406 && var406 != -1) {
                        int var409 = class205.method73(var406).field2247;
                        if (var409 == 1) {
                            var408.field1218 = 0;
                            var408.field1223 = 0;
                            var408.field1230 = var405;
                            var408.field1221 = 0;
                        } else if (var409 == 2) {
                            var408.field1221 = 0;
                        }
                    } else if (var406 == -1 || var408.field1236 == -1 || class205.method73(var406).field2221 >= class205.method73(var408.field1236).field2221) {
                        var408.field1236 = var406;
                        var408.field1218 = 0;
                        var408.field1223 = 0;
                        var408.field1230 = var405;
                        var408.field1221 = 0;
                        var408.field1216 = var408.field1242;
                    }
                }
                arg0.field1414 = null;
                return true;
            }
            if (class312.field3375 == arg0.field1414) {
                method5353(class310.field3266);
                arg0.field1414 = null;
                return true;
            }
            class557.method6332("" + (arg0.field1414 == null ? -1 : arg0.field1414.field3334) + class102.field1309 + (arg0.field1412 == null ? -1 : arg0.field1412.field3334) + class102.field1309 + (arg0.field1408 == null ? -1 : arg0.field1408.field3334) + class102.field1309 + arg0.field1407, (Throwable) null);
            Statics.method3461();
        } catch (IOException var414) {
            method2730();
        } catch (Exception var415) {
            String var412 = "" + (arg0.field1414 == null ? -1 : arg0.field1414.field3334) + class102.field1309 + (arg0.field1412 == null ? -1 : arg0.field1412.field3334) + class102.field1309 + (arg0.field1408 == null ? -1 : arg0.field1408.field3334) + class102.field1309 + arg0.field1407 + class102.field1309 + (Statics.field1900 + Statics.field133.field1243[0]) + class102.field1309 + (Statics.field2683 + Statics.field133.field1244[0]) + class102.field1309;
            for (int var413 = 0; var413 < arg0.field1407 && var413 < 50; var413++) {
                var412 = var412 + var3.field5178[var413] + class102.field1309;
            }
            class557.method6332(var412, var415);
            Statics.method3461();
        }
        return true;
    }

    @ObfuscatedName("lv.ks(Llz;I)V")
    public static final void method5353(class310 arg0) {
        class530 var1 = field561.field1405;
        if (class310.field3274 == arg0) {
            int var2 = var1.method8561();
            int var3 = var1.method8593();
            int var4 = var3 >> 2;
            int var5 = var3 & 0x3;
            int var6 = field575[var4];
            int var7 = var1.method8700();
            int var8 = (var7 >> 4 & 0x7) + Statics.field1945;
            int var9 = (var7 & 0x7) + Statics.field2479;
            int var10 = var1.method8604();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                int var11 = field653 == -1 ? Statics.field1428 : field653;
                method7974(var11, var8, var9, var6, var10, var4, var5, var2, 0, -1);
            }
        } else if (class310.field3275 == arg0) {
            int var12 = var1.method8572();
            int var13 = var1.method8700();
            int var14 = (var13 >> 4 & 0x7) + Statics.field1945;
            int var15 = (var13 & 0x7) + Statics.field2479;
            int var16 = var1.method8700();
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = field575[var17];
            if (var14 >= 0 && var15 >= 0 && var14 < 103 && var15 < 103) {
                int var20 = field653 == -1 ? Statics.field1428 : field653;
                boolean var21 = method3223(var20, var14, var15, var17, var18, var19, var12);
                if (var21) {
                    return;
                }
                method5572(var20, var14, var15, var19, var12);
            }
        } else if (class310.field3265 == arg0) {
            int var22 = var1.method8700();
            int var23 = (var22 >> 4 & 0x7) + Statics.field1945;
            int var24 = (var22 & 0x7) + Statics.field2479;
            int var25 = var1.method8616();
            int var26 = var1.method8616();
            int var27 = var1.method8572();
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                int var28 = field653 == -1 ? Statics.field1428 : field653;
                Statics.method14(var28, var23, var24, var27, var25, var26);
            }
        } else if (class310.field3267 == arg0) {
            int var29 = var1.method8700();
            boolean var30 = var1.method8593() == 1;
            int var31 = var1.method8775();
            int var32 = var1.method8615();
            int var33 = var1.method8700();
            int var34 = var1.method8712();
            int var35 = var1.method8700();
            int var36 = (var35 >> 4 & 0x7) + Statics.field1945;
            int var37 = (var35 & 0x7) + Statics.field2479;
            int var38 = var1.method8712();
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                int var39 = field653 == -1 ? Statics.field1428 : field653;
                method833(var39, var36, var37, var34, var32, var33, var31, var38, var29, var30);
            }
        } else if (class310.field3264 == arg0) {
            int var40 = var1.method8610();
            int var41 = var1.method8712();
            int var42 = var1.method8700();
            byte var43 = var1.method8562();
            int var44 = var1.method8604();
            int var45 = var1.method8604();
            int var46 = var1.method8572();
            byte var47 = var1.method8562();
            int var48 = var1.method8594() * 4;
            int var49 = var1.method8700() * 4;
            int var50 = var1.method8610();
            int var51 = var1.method8700();
            int var52 = (var51 >> 4 & 0x7) + Statics.field1945;
            int var53 = (var51 & 0x7) + Statics.field2479;
            int var54 = var43 + var52;
            int var55 = var47 + var53;
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var41 != 65535) {
                int var56 = field653 == -1 ? Statics.field1428 : field653;
                method8382(var56, var52, var53, var54, var55, var40, var41, var49, var48, var45, var44, var42, var46, var50);
            }
        } else if (class310.field3270 == arg0) {
            int var57 = var1.method8593();
            int var58 = (var57 >> 4 & 0x7) + Statics.field1945;
            int var59 = (var57 & 0x7) + Statics.field2479;
            int var60 = var1.method8594();
            int var61 = var60 >> 2;
            int var62 = var60 & 0x3;
            int var63 = field575[var61];
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                int var64 = field653 == -1 ? Statics.field1428 : field653;
                method7974(var64, var58, var59, var63, -1, var61, var62, 31, 0, -1);
            }
        } else if (class310.field3269 == arg0) {
            int var65 = var1.method8604();
            int var66 = var1.method8700();
            int var67 = (var66 >> 4 & 0x7) + Statics.field1945;
            int var68 = (var66 & 0x7) + Statics.field2479;
            int var69 = var1.method8566();
            if (var67 >= 0 && var68 >= 0 && var67 < 104 && var68 < 104) {
                int var70 = field653 == -1 ? Statics.field1428 : field653;
                method4576(var70, var67, var68, var65, var69);
            }
        } else {
            if (class310.field3272 == arg0) {
                int var71 = var1.method8594();
                int var72 = var1.method8593();
                int var73 = (var72 >> 4 & 0x7) + Statics.field1945;
                int var74 = (var72 & 0x7) + Statics.field2479;
                int var75 = var1.method8593();
                int var76 = var75 >> 4 & 0xF;
                int var77 = var75 & 0x7;
                int var78 = var1.method8572();
                if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                    int var79 = var76 + 1;
                    if (Statics.field133.field1243[0] >= var73 - var79 && Statics.field133.field1243[0] <= var73 + var79 && Statics.field133.field1244[0] >= var74 - var79 && Statics.field133.field1244[0] <= var74 + var79 && Statics.field1155.method2450() != 0 && var77 > 0 && field754 < 50) {
                        field755[field754] = var78;
                        field756[field754] = var77;
                        field549[field754] = var71;
                        field631[field754] = null;
                        field758[field754] = (var73 << 16) + (var74 << 8) + var76;
                        field754++;
                    }
                }
            }
            if (class310.field3266 == arg0) {
                int var80 = var1.method8712();
                int var81 = var1.method8594();
                int var82 = var1.method8700();
                int var83 = (var82 >> 4 & 0x7) + Statics.field1945;
                int var84 = (var82 & 0x7) + Statics.field2479;
                int var85 = var1.method8775();
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var86 = var83 * 128 + 64;
                    int var87 = var84 * 128 + 64;
                    int var88 = field653 == -1 ? Statics.field1428 : field653;
                    class72 var89 = new class72(var80, var88, var86, var87, method293(var86, var87, var88) - var81, var85, field677);
                    field782.method6666(var89);
                }
            } else if (class310.field3268 == arg0) {
                int var90 = var1.method8593();
                int var91 = (var90 >> 4 & 0x7) + Statics.field1945;
                int var92 = (var90 & 0x7) + Statics.field2479;
                int var93 = var1.method8594();
                int var94 = var1.method8604();
                if (var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104) {
                    int var95 = field653 == -1 ? Statics.field1428 : field653;
                    method1145(var95, var91, var92, var94, var93);
                }
            } else if (class310.field3271 == arg0) {
                int var96 = var1.method8712();
                int var97 = var1.method8775();
                int var98 = var1.method8712();
                int var99 = var1.method8561();
                int var100 = (var99 >> 4 & 0x7) + Statics.field1945;
                int var101 = (var99 & 0x7) + Statics.field2479;
                byte var102 = var1.method8597();
                byte var103 = var1.method8597();
                byte var104 = var1.method8596();
                int var105 = var1.method8561();
                int var106 = var105 >> 2;
                int var107 = var105 & 0x3;
                int var108 = field575[var106];
                int var109 = var1.method8775();
                byte var110 = var1.method8620();
                class92 var111;
                if (field625 == var98) {
                    var111 = Statics.field133;
                } else {
                    var111 = field738[var98];
                }
                if (var111 != null) {
                    int var112 = field653 == -1 ? Statics.field1428 : field653;
                    method461(var112, var100, var101, var106, var107, var108, var97, var96, var109, var103, var102, var104, var110, var111);
                }
            }
        }
    }

    @ObfuscatedName("cu.kk(IIIIIB)V")
    public static void method1145(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class394 var5 = field644[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class105 var6 = (class105) var5.method6670(); var6 != null; var6 = (class105) var5.method6665()) {
            if ((arg3 & 0x7FFF) == var6.field1338) {
                var6.method2639(arg4);
                break;
            }
        }
    }

    @ObfuscatedName("ba.lk(IIIIIIIIIIIIILdn;I)V")
    public static void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class92 arg13) {
        class202 var14 = class202.method3023(arg6);
        int var15;
        int var16;
        if (arg4 == 1 || arg4 == 3) {
            var15 = var14.field2096;
            var16 = var14.field2120;
        } else {
            var15 = var14.field2120;
            var16 = var14.field2096;
        }
        int var17 = (var15 >> 1) + arg1;
        int var18 = (var15 + 1 >> 1) + arg1;
        int var19 = (var16 >> 1) + arg2;
        int var20 = (var16 + 1 >> 1) + arg2;
        int[][] var21 = class82.field1020[arg0];
        int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
        int var23 = (arg1 << 7) + (var15 << 6);
        int var24 = (arg2 << 7) + (var16 << 6);
        class283 var25 = var14.method3613(arg3, arg4, var21, var23, var22, var24);
        if (var25 == null) {
            return;
        }
        method7974(arg0, arg1, arg2, arg5, -1, 0, 0, 31, arg7 + 1, arg8 + 1);
        arg13.field1098 = field677 + arg7;
        arg13.field1108 = field677 + arg8;
        arg13.field1112 = var25;
        arg13.field1109 = arg1 * 128 + var15 * 64;
        arg13.field1121 = arg2 * 128 + var16 * 64;
        arg13.field1110 = var22;
        if (arg9 > arg11) {
            int var26 = arg9;
            arg9 = arg11;
            arg11 = var26;
        }
        if (arg10 > arg12) {
            int var27 = arg10;
            arg10 = arg12;
            arg12 = var27;
        }
        arg13.field1113 = arg1 + arg9;
        arg13.field1115 = arg1 + arg11;
        arg13.field1105 = arg2 + arg10;
        arg13.field1116 = arg2 + arg12;
    }

    @ObfuscatedName("te.lp(IIIIIIIIIIIIIIB)V")
    public static void method8382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg1 * 128 + 64;
        int var15 = arg2 * 128 + 64;
        int var16 = arg3 * 128 + 64;
        int var17 = arg4 * 128 + 64;
        class77 var18 = new class77(arg6, arg0, var14, var15, method293(var14, var15, arg0) - arg7, field677 + arg9, field677 + arg10, arg11, arg12, arg13, arg5, arg8);
        var18.method2131(var16, var17, method293(var16, var17, arg0) - arg8, field677 + arg9);
        field587.method6666(var18);
    }

    @ObfuscatedName("jo.lb(IIIIIB)V")
    public static void method4576(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class394 var5 = field644[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class105 var6 = (class105) var5.method6670(); var6 != null; var6 = (class105) var5.method6665()) {
            if ((arg3 & 0x7FFF) == var6.field1338 && var6.field1335 == arg4) {
                var6.method7988();
                break;
            }
        }
        if (var5.method6670() == null) {
            field644[arg0][arg1][arg2] = null;
        }
        method3008(arg0, arg1, arg2);
    }

    @ObfuscatedName("bb.ln(IIIIIIIIIZI)V")
    public static void method833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        class105 var10 = new class105();
        var10.field1338 = arg3;
        var10.field1335 = arg4;
        var10.method2639(arg5);
        if (field644[arg0][arg1][arg2] == null) {
            field644[arg0][arg1][arg2] = new class394();
        }
        field644[arg0][arg1][arg2].method6666(var10);
        method3008(arg0, arg1, arg2);
    }

    @ObfuscatedName("gx.lv(IIIIIIII)Z")
    public static boolean method3223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class369.field4293.field4297 == arg5) {
            class291 var7 = Statics.field493.method4902(arg0, arg1, arg2);
            if (var7 != null) {
                int var8 = class284.method3222(var7.field3111);
                if (class356.field3887.field3889 == arg3) {
                    var7.field3108 = new class80(var8, 2, arg4 + 4, arg0, arg1, arg2, arg6, false, var7.field3108);
                    var7.field3103 = new class80(var8, 2, arg4 + 1 & 0x3, arg0, arg1, arg2, arg6, false, var7.field3103);
                } else {
                    var7.field3108 = new class80(var8, arg3, arg4, arg0, arg1, arg2, arg6, false, var7.field3108);
                }
                return true;
            }
        } else if (class369.field4294.field4297 == arg5) {
            class293 var9 = Statics.field493.method4967(arg0, arg1, arg2);
            if (var9 != null) {
                int var10 = class284.method3222(var9.field3113);
                if (class356.field3890.field3889 == arg3 || class356.field3901.field3889 == arg3) {
                    var9.field3120 = new class80(var10, 4, arg4, arg0, arg1, arg2, arg6, false, var9.field3120);
                } else if (class356.field3892.field3889 == arg3) {
                    var9.field3120 = new class80(var10, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var9.field3120);
                } else if (class356.field3893.field3889 == arg3) {
                    var9.field3120 = new class80(var10, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var9.field3120);
                } else if (class356.field3899.field3889 == arg3) {
                    var9.field3120 = new class80(var10, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var9.field3120);
                    var9.field3121 = new class80(var10, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var9.field3121);
                }
                return true;
            }
        } else if (class369.field4295.field4297 == arg5) {
            class294 var11 = Statics.field493.method4904(arg0, arg1, arg2);
            if (class356.field3906.field3889 == arg3) {
                arg3 = class356.field3905.field3889;
            }
            if (var11 != null) {
                var11.field3133 = new class80(class284.method3222(var11.field3137), arg3, arg4, arg0, arg1, arg2, arg6, false, var11.field3133);
                return true;
            }
        } else if (class369.field4296.field4297 == arg5) {
            class266 var12 = Statics.field493.method5001(arg0, arg1, arg2);
            if (var12 != null) {
                var12.field2750 = new class80(class284.method3222(var12.field2749), 22, arg4, arg0, arg1, arg2, arg6, false, var12.field2750);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("sx.lg(IIIIIIIIIII)V")
    public static final void method7974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class95 var10 = null;
        for (class95 var11 = (class95) field639.method6670(); var11 != null; var11 = (class95) field639.method6665()) {
            if (var11.field1169 == arg0 && var11.field1160 == arg1 && var11.field1161 == arg2 && var11.field1159 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class95();
            var10.field1169 = arg0;
            var10.field1159 = arg3;
            var10.field1160 = arg1;
            var10.field1161 = arg2;
            var10.field1168 = -1;
            method13(var10);
            field639.method6666(var10);
        }
        var10.field1165 = arg4;
        var10.field1167 = arg5;
        var10.field1158 = arg6;
        var10.field1166 = arg8;
        var10.field1171 = arg9;
        var10.method2345(arg7);
    }

    @ObfuscatedName("mk.lu(IIIIIB)Z")
    public static final boolean method5572(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class95 var5 = null;
        for (class95 var6 = (class95) field639.method6670(); var6 != null; var6 = (class95) field639.method6665()) {
            if (var6.field1169 == arg0 && var6.field1160 == arg1 && var6.field1161 == arg2 && var6.field1159 == arg3) {
                var5 = var6;
                break;
            }
        }
        if (var5 == null) {
            return false;
        } else {
            var5.field1168 = arg4;
            return true;
        }
    }

    @ObfuscatedName("es.ll(B)V")
    public static final void method2869() {
        for (class95 var0 = (class95) field639.method6670(); var0 != null; var0 = (class95) field639.method6665()) {
            if (var0.field1171 == -1) {
                var0.field1166 = 0;
                method13(var0);
            } else {
                var0.method7988();
            }
        }
    }

    @ObfuscatedName("ap.lw(Ldk;B)V")
    public static final void method13(class95 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1159 == 0) {
            var1 = Statics.field493.method4906(arg0.field1169, arg0.field1160, arg0.field1161);
        }
        if (arg0.field1159 == 1) {
            var1 = Statics.field493.method4907(arg0.field1169, arg0.field1160, arg0.field1161);
        }
        if (arg0.field1159 == 2) {
            var1 = Statics.field493.method4908(arg0.field1169, arg0.field1160, arg0.field1161);
        }
        if (arg0.field1159 == 3) {
            var1 = Statics.field493.method4909(arg0.field1169, arg0.field1160, arg0.field1161);
        }
        if (var1 != 0L) {
            int var6 = Statics.field493.method5039(arg0.field1169, arg0.field1160, arg0.field1161, var1);
            var3 = class284.method3222(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1162 = var3;
        arg0.field1164 = var4;
        arg0.field1163 = var5;
    }

    @ObfuscatedName("fv.lj(IIIIIIIII)V")
    public static final void method3006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field503 && Statics.field1428 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field493.method4906(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field493.method4907(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field493.method4908(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field493.method4909(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field493.method5039(arg0, arg2, arg3, var8);
            int var14 = class284.method3222(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            class202 var17 = class202.method3023(var14);
            Statics.method6276(arg0, arg2, arg3, var17, var16);
            if (arg1 == 0) {
                Statics.field493.method4897(arg0, arg2, arg3);
                if (var17.field2112 != 0) {
                    field572[arg0].method4082(arg2, arg3, var15, var16, var17.field2098);
                }
            }
            if (arg1 == 1) {
                Statics.field493.method4898(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field493.method4899(arg0, arg2, arg3);
                if (var17.field2120 + arg2 > 103 || var17.field2120 + arg3 > 103 || var17.field2096 + arg2 > 103 || var17.field2096 + arg3 > 103) {
                    return;
                }
                if (var17.field2112 != 0) {
                    field572[arg0].method4101(arg2, arg3, var17.field2120, var17.field2096, var16, var17.field2098);
                }
            }
            if (arg1 == 3) {
                Statics.field493.method4900(arg0, arg2, arg3);
                if (var17.field2112 == 1) {
                    field572[arg0].method4091(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class82.field1009[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class82.method327(arg0, var18, arg2, arg3, arg4, arg5, arg6, arg7, Statics.field493, field572[arg0]);
        class202 var19 = class202.method3023(arg4);
        if (var19 != null && var19.method3649()) {
            class70.method45(var18, arg2, arg3, var19, arg5);
        }
    }

    @ObfuscatedName("fb.lh(IIIB)V")
    public static void method3008(int arg0, int arg1, int arg2) {
        class394 var3 = field644[arg0][arg1][arg2];
        if (var3 == null) {
            Statics.field493.method4901(arg0, arg1, arg2);
            return;
        }
        long var4 = -99999999L;
        class105 var6 = null;
        for (class105 var7 = (class105) var3.method6670(); var7 != null; var7 = (class105) var3.method6665()) {
            class203 var8 = class203.method5762(var7.field1338);
            long var9 = (long) var8.field2167;
            if (var8.field2166 == 1) {
                var9 *= var7.field1335 < Integer.MAX_VALUE ? (long) (var7.field1335 + 1) : (long) var7.field1335;
            }
            if (var9 > var4) {
                var4 = var9;
                var6 = var7;
            }
        }
        if (var6 == null) {
            Statics.field493.method4901(arg0, arg1, arg2);
            return;
        }
        var3.method6672(var6);
        class105 var11 = null;
        class105 var12 = null;
        for (class105 var13 = (class105) var3.method6670(); var13 != null; var13 = (class105) var3.method6665()) {
            if (var6.field1338 != var13.field1338) {
                if (var11 == null) {
                    var11 = var13;
                }
                if (var11.field1338 != var13.field1338 && var12 == null) {
                    var12 = var13;
                }
            }
        }
        long var14 = class284.method2168(arg1, arg2, 3, false, 0);
        Statics.field493.method4930(arg0, arg1, arg2, method293(arg1 * 128 + 64, arg2 * 128 + 64, arg0), var6, var14, var11, var12);
    }

    @ObfuscatedName("ne.ld(ZLuo;I)V")
    public static final void method6293(boolean arg0, class530 arg1) {
        field709 = 0;
        field550 = 0;
        method822(arg1);
        while (true) {
            byte var2 = 16;
            int var3 = 0x1 << var2;
            if (arg1.method8506(field561.field1407) < var2 + 12) {
                break;
            }
            int var4 = arg1.method8509(var2);
            if (var3 - 1 == var4) {
                break;
            }
            boolean var8 = false;
            if (field557[var4] == null) {
                field557[var4] = new class101();
                var8 = true;
            }
            class101 var9 = field557[var4];
            field559[++field558 - 1] = var4;
            var9.field1231 = field677;
            int var10 = arg1.method8509(1);
            if (var10 == 1) {
                field604[++field550 - 1] = var4;
            }
            boolean var11 = arg1.method8509(1) == 1;
            if (var11) {
                arg1.method8509(32);
            }
            int var12 = arg1.method8509(1);
            int var13;
            if (arg0) {
                var13 = arg1.method8509(8);
                if (var13 > 127) {
                    var13 -= 256;
                }
            } else {
                var13 = arg1.method8509(5);
                if (var13 > 15) {
                    var13 -= 32;
                }
            }
            int var14;
            if (arg0) {
                var14 = arg1.method8509(8);
                if (var14 > 127) {
                    var14 -= 256;
                }
            } else {
                var14 = arg1.method8509(5);
                if (var14 > 15) {
                    var14 -= 32;
                }
            }
            int var15 = field636[arg1.method8509(3)];
            if (var8) {
                var9.field1239 = var9.field1184 = var15;
            }
            var9.field1300 = class189.method2165(arg1.method8509(14));
            method3075(var9);
            if (var9.field1241 == 0) {
                var9.field1184 = 0;
            }
            var9.method2557(Statics.field133.field1243[0] + var14, Statics.field133.field1244[0] + var13, var12 == 1);
        }
        arg1.method8505();
        method2784(arg1);
        for (int var5 = 0; var5 < field709; var5++) {
            int var6 = field626[var5];
            if (field677 != field557[var6].field1231) {
                field557[var6].field1300 = null;
                field557[var6] = null;
            }
        }
        if (field561.field1407 != arg1.field5181) {
            throw new RuntimeException(arg1.field5181 + class102.field1309 + field561.field1407);
        }
        for (int var7 = 0; var7 < field558; var7++) {
            if (field557[field559[var7]] == null) {
                throw new RuntimeException(var7 + class102.field1309 + field558);
            }
        }
    }

    @ObfuscatedName("bb.le(Luo;B)V")
    public static final void method822(class530 arg0) {
        arg0.method8525();
        int var1 = arg0.method8509(8);
        if (var1 < field558) {
            for (int var2 = var1; var2 < field558; var2++) {
                field626[++field709 - 1] = field559[var2];
            }
        }
        if (var1 > field558) {
            throw new RuntimeException("");
        }
        field558 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field559[var3];
            class101 var5 = field557[var4];
            int var6 = arg0.method8509(1);
            if (var6 == 0) {
                field559[++field558 - 1] = var4;
                var5.field1231 = field677;
            } else {
                int var7 = arg0.method8509(2);
                if (var7 == 0) {
                    field559[++field558 - 1] = var4;
                    var5.field1231 = field677;
                    field604[++field550 - 1] = var4;
                } else if (var7 == 1) {
                    field559[++field558 - 1] = var4;
                    var5.field1231 = field677;
                    int var8 = arg0.method8509(3);
                    var5.method2560(var8, class232.field2459);
                    int var9 = arg0.method8509(1);
                    if (var9 == 1) {
                        field604[++field550 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field559[++field558 - 1] = var4;
                    var5.field1231 = field677;
                    if (arg0.method8509(1) == 1) {
                        int var10 = arg0.method8509(3);
                        var5.method2560(var10, class232.field2460);
                        int var11 = arg0.method8509(3);
                        var5.method2560(var11, class232.field2460);
                    } else {
                        int var12 = arg0.method8509(3);
                        var5.method2560(var12, class232.field2457);
                    }
                    int var13 = arg0.method8509(1);
                    if (var13 == 1) {
                        field604[++field550 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field626[++field709 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("eg.lm(Luo;B)V")
    public static final void method2784(class530 arg0) {
        for (int var1 = 0; var1 < field550; var1++) {
            int var2 = field604[var1];
            class101 var3 = field557[var2];
            int var4 = arg0.method8561();
            if ((var4 & 0x80) != 0) {
                int var5 = arg0.method8561();
                var4 += var5 << 8;
            }
            if ((var4 & 0x4000) != 0) {
                int var6 = arg0.method8561();
                var4 += var6 << 16;
            }
            if ((var4 & 0x100) != 0) {
                var3.method2556(arg0.method8641());
            }
            if ((var4 & 0x1) != 0) {
                int var7 = arg0.method8712();
                int var8 = arg0.method8775();
                var3.field1212 = arg0.method8594() == 1;
                var3.field1214 = var7;
                var3.field1211 = var8;
            }
            if ((var4 & 0x800) != 0) {
                var3.field1193 = arg0.method8603();
            }
            if ((var4 & 0x200) != 0) {
                var3.field1181 = field677 + arg0.method8775();
                var3.field1234 = field677 + arg0.method8712();
                var3.field1235 = arg0.method8620();
                var3.field1194 = arg0.method8596();
                var3.field1205 = arg0.method8562();
                var3.field1238 = (byte) arg0.method8561();
            }
            if ((var4 & 0x400) != 0) {
                var3.method2602(arg0.method8700());
            }
            if ((var4 & 0x40000) != 0) {
                int var9 = arg0.method8594();
                int[] var10 = new int[8];
                short[] var11 = new short[8];
                for (int var12 = 0; var12 < 8; var12++) {
                    if ((var9 & 0x1 << var12) == 0) {
                        var10[var12] = -1;
                        var11[var12] = -1;
                    } else {
                        var10[var12] = arg0.method8721();
                        var11[var12] = (short) arg0.method8563();
                    }
                }
                var3.method2566(var10, var11);
            }
            if ((var4 & 0x4) != 0) {
                var3.field1196 = arg0.method8641();
                var3.field1213 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field1207 = arg0.method8604();
                var3.field1207 += arg0.method8593() << 16;
                int var13 = 16777215;
                if (var3.field1207 == var13) {
                    var3.field1207 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var14 = arg0.method8700();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = -1;
                        int var17 = -1;
                        int var18 = -1;
                        int var19 = arg0.method8576();
                        if (var19 == 32767) {
                            var19 = arg0.method8576();
                            var17 = arg0.method8576();
                            var16 = arg0.method8576();
                            var18 = arg0.method8576();
                        } else if (var19 == 32766) {
                            var19 = -1;
                        } else {
                            var17 = arg0.method8576();
                        }
                        int var20 = arg0.method8576();
                        var3.method2386(var19, var17, var16, var18, field677, var20);
                    }
                }
                int var21 = arg0.method8700();
                if (var21 > 0) {
                    for (int var22 = 0; var22 < var21; var22++) {
                        int var23 = arg0.method8576();
                        int var24 = arg0.method8576();
                        if (var24 == 32767) {
                            var3.method2375(var23);
                        } else {
                            int var25 = arg0.method8576();
                            int var26 = arg0.method8594();
                            int var27 = var24 > 0 ? arg0.method8594() : var26;
                            var3.method2355(var23, field677, var24, var25, var26, var27);
                        }
                    }
                }
            }
            if ((var4 & 0x2) != 0) {
                arg0.method8712();
                arg0.method8603();
            }
            if ((var4 & 0x1000) != 0) {
                var3.field1224 = arg0.method8596();
                var3.field1226 = arg0.method8562();
                var3.field1225 = arg0.method8562();
                var3.field1227 = arg0.method8596();
                var3.field1228 = arg0.method8572() + field677;
                var3.field1229 = arg0.method8775() + field677;
                var3.field1174 = arg0.method8712();
                var3.field1242 = 1;
                var3.field1216 = 0;
                var3.field1224 += var3.field1243[0];
                var3.field1226 += var3.field1244[0];
                var3.field1225 += var3.field1243[0];
                var3.field1227 += var3.field1244[0];
            }
            if ((var4 & 0x20000) != 0) {
                int var28 = arg0.method8561();
                for (int var29 = 0; var29 < var28; var29++) {
                    int var30 = arg0.method8593();
                    int var31 = arg0.method8712();
                    int var32 = arg0.method8616();
                    var3.method2368(var30, var31, var32 >> 16, var32 & 0xFFFF);
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1300 = class189.method2165(arg0.method8604());
                method3075(var3);
                var3.method2567();
            }
            if ((var4 & 0x10) != 0) {
                int var33 = arg0.method8775();
                if (var33 == 65535) {
                    var33 = -1;
                }
                int var34 = arg0.method8561();
                if (var3.field1236 == var33 && var33 != -1) {
                    int var35 = class205.method73(var33).field2247;
                    if (var35 == 1) {
                        var3.field1218 = 0;
                        var3.field1223 = 0;
                        var3.field1230 = var34;
                        var3.field1221 = 0;
                    }
                    if (var35 == 2) {
                        var3.field1221 = 0;
                    }
                } else if (var33 == -1 || var3.field1236 == -1 || class205.method73(var33).field2221 >= class205.method73(var3.field1236).field2221) {
                    var3.field1236 = var33;
                    var3.field1218 = 0;
                    var3.field1223 = 0;
                    var3.field1230 = var34;
                    var3.field1221 = 0;
                    var3.field1216 = var3.field1242;
                }
            }
            if ((var4 & 0x2000) != 0) {
                int var36 = arg0.method8594();
                if ((var36 & 0x1) == 1) {
                    var3.method2572();
                } else {
                    int[] var37 = null;
                    if ((var36 & 0x2) == 2) {
                        int var38 = arg0.method8593();
                        var37 = new int[var38];
                        for (int var39 = 0; var39 < var38; var39++) {
                            int var40 = arg0.method8775();
                            int var41 = var40 == 65535 ? -1 : var40;
                            var37[var39] = var41;
                        }
                    }
                    short[] var42 = null;
                    if ((var36 & 0x4) == 4) {
                        int var43 = 0;
                        if (var3.field1300.field1972 != null) {
                            var43 = var3.field1300.field1972.length;
                        }
                        var42 = new short[var43];
                        for (int var44 = 0; var44 < var43; var44++) {
                            var42[var44] = (short) arg0.method8604();
                        }
                    }
                    short[] var45 = null;
                    if ((var36 & 0x8) == 8) {
                        int var46 = 0;
                        if (var3.field1300.field1974 != null) {
                            var46 = var3.field1300.field1974.length;
                        }
                        var45 = new short[var46];
                        for (int var47 = 0; var47 < var46; var47++) {
                            var45[var47] = (short) arg0.method8775();
                        }
                    }
                    boolean var48 = false;
                    if ((var36 & 0x10) != 0) {
                        var48 = arg0.method8561() == 1;
                    }
                    long var49 = (long) (++class101.field1307 - 1);
                    var3.method2562(new class188(var49, var37, var42, var45, var48));
                }
            }
            if ((var4 & 0x10000) != 0) {
                int var51 = arg0.method8566();
                var3.field1237 = (var51 & 0x1) == 0 ? var3.field1300.field1957 : arg0.method8572();
                var3.field1180 = (var51 & 0x2) == 0 ? var3.field1300.field1981 : arg0.method8775();
                var3.field1247 = (var51 & 0x4) == 0 ? var3.field1300.field1959 : arg0.method8712();
                var3.field1182 = (var51 & 0x8) == 0 ? var3.field1300.field1960 : arg0.method8604();
                var3.field1245 = (var51 & 0x10) == 0 ? var3.field1300.field1951 : arg0.method8604();
                var3.field1233 = (var51 & 0x20) == 0 ? var3.field1300.field1953 : arg0.method8572();
                var3.field1185 = (var51 & 0x40) == 0 ? var3.field1300.field1963 : arg0.method8712();
                var3.field1188 = (var51 & 0x80) == 0 ? var3.field1300.field1964 : arg0.method8572();
                var3.field1187 = (var51 & 0x100) == 0 ? var3.field1300.field1965 : arg0.method8712();
                var3.field1219 = (var51 & 0x200) == 0 ? var3.field1300.field1966 : arg0.method8604();
                var3.field1189 = (var51 & 0x400) == 0 ? var3.field1300.field1975 : arg0.method8572();
                var3.field1179 = (var51 & 0x800) == 0 ? var3.field1300.field1968 : arg0.method8604();
                var3.field1191 = (var51 & 0x1000) == 0 ? var3.field1300.field1969 : arg0.method8712();
                var3.field1192 = (var51 & 0x2000) == 0 ? var3.field1300.field1970 : arg0.method8712();
                var3.field1178 = (var51 & 0x4000) == 0 ? var3.field1300.field1956 : arg0.method8604();
            }
            if ((var4 & 0x8000) != 0) {
                int var52 = arg0.method8700();
                if ((var52 & 0x1) == 1) {
                    var3.method2571();
                } else {
                    int[] var53 = null;
                    if ((var52 & 0x2) == 2) {
                        int var54 = arg0.method8593();
                        var53 = new int[var54];
                        for (int var55 = 0; var55 < var54; var55++) {
                            int var56 = arg0.method8572();
                            int var57 = var56 == 65535 ? -1 : var56;
                            var53[var55] = var57;
                        }
                    }
                    short[] var58 = null;
                    if ((var52 & 0x4) == 4) {
                        int var59 = 0;
                        if (var3.field1300.field1972 != null) {
                            var59 = var3.field1300.field1972.length;
                        }
                        var58 = new short[var59];
                        for (int var60 = 0; var60 < var59; var60++) {
                            var58[var60] = (short) arg0.method8604();
                        }
                    }
                    short[] var61 = null;
                    if ((var52 & 0x8) == 8) {
                        int var62 = 0;
                        if (var3.field1300.field1974 != null) {
                            var62 = var3.field1300.field1974.length;
                        }
                        var61 = new short[var62];
                        for (int var63 = 0; var63 < var62; var63++) {
                            var61[var63] = (short) arg0.method8572();
                        }
                    }
                    boolean var64 = false;
                    if ((var52 & 0x10) != 0) {
                        var64 = arg0.method8594() == 1;
                    }
                    long var65 = (long) (++class101.field1303 - 1);
                    var3.method2568(new class188(var65, var53, var58, var61, var64));
                }
            }
        }
    }

    @ObfuscatedName("fo.la(Lds;I)V")
    public static void method3075(class101 arg0) {
        arg0.field1176 = arg0.field1300.field1980;
        arg0.field1241 = arg0.field1300.field1983;
        arg0.field1247 = arg0.field1300.field1959;
        arg0.field1182 = arg0.field1300.field1960;
        arg0.field1245 = arg0.field1300.field1951;
        arg0.field1233 = arg0.field1300.field1953;
        arg0.field1178 = arg0.field1300.field1956;
        arg0.field1237 = arg0.field1300.field1957;
        arg0.field1180 = arg0.field1300.field1981;
        arg0.field1185 = arg0.field1300.field1963;
        arg0.field1188 = arg0.field1300.field1964;
        arg0.field1187 = arg0.field1300.field1965;
        arg0.field1219 = arg0.field1300.field1966;
        arg0.field1189 = arg0.field1300.field1975;
        arg0.field1179 = arg0.field1300.field1968;
        arg0.field1191 = arg0.field1300.field1969;
        arg0.field1192 = arg0.field1300.field1970;
    }

    @ObfuscatedName("ck.lq(Ldn;IILir;I)V")
    public static final void method2052(class92 arg0, int arg1, int arg2, class232 arg3) {
        int var4 = arg0.field1243[0];
        int var5 = arg0.field1244[0];
        int var6 = arg0.method2303();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        class233 var7 = field692;
        int var10 = arg0.method2303();
        field802.field2440 = arg1;
        field802.field2441 = arg2;
        field802.field2443 = 1;
        field802.field2442 = 1;
        class66 var11 = field802;
        int var12 = var7.method4169(var4, var5, var10, var11, field572[arg0.field1111], true, field803, field804);
        if (var12 >= 1) {
            for (int var13 = 0; var13 < var12 - 1; var13++) {
                arg0.method2318(field803[var13], field804[var13], arg3);
            }
        }
    }

    @ObfuscatedName("av.li(B)V")
    public static void method214() {
        field648 = 0;
        field647 = false;
    }

    @ObfuscatedName("ox.lt(B)V")
    public static void method6322() {
        method214();
        field771[0] = class367.field4219;
        field795[0] = "";
        field651[0] = 1006;
        field656[0] = false;
        field648 = 1;
    }

    @ObfuscatedName("fq.ls(III)V")
    public static final void method3101(int arg0, int arg1) {
        if (field648 < 2 && field741 == 0 && !field722 || !field659) {
            return;
        }
        int var2 = field648 - 1;
        String var4;
        if (field741 == 1 && field648 < 2) {
            var4 = class367.field4140 + class367.field4130 + field665 + " " + class102.field1310;
        } else if (field722 && field648 < 2) {
            var4 = field669 + class367.field4130 + field670 + " " + class102.field1310;
        } else {
            String var5;
            if (var2 < 0) {
                var5 = "";
            } else if (field795[var2].length() > 0) {
                var5 = field771[var2] + class367.field4130 + field795[var2];
            } else {
                var5 = field771[var2];
            }
            var4 = var5;
        }
        if (field648 > 2) {
            var4 = var4 + class102.method3860(16777215) + " " + '/' + " " + (field648 - 2) + class367.field4021;
        }
        Statics.field1089.method7104(var4, arg0 + 4, arg1 + 15, 16777215, 0, field677 / 1000);
    }

    @ObfuscatedName("jv.lx(B)Z")
    public static final boolean method4527() {
        return field647;
    }

    @ObfuscatedName("jq.ly(IIIII)V")
    public static final void method4601(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field719; var4++) {
            if (field726[var4] + field724[var4] > arg0 && field724[var4] < arg0 + arg2 && field769[var4] + field725[var4] > arg1 && field725[var4] < arg1 + arg3) {
                field664[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.lc(I)V")
    public final void method1353() {
        Statics.method2986();
        if (field683 != null) {
            return;
        }
        int var1 = class36.field238;
        if (!field647) {
            int var22 = field648 - 1;
            if ((var1 == 1 || !Statics.field320 && var1 == 4) && this.method1667()) {
                var1 = 2;
            }
            if ((var1 == 1 || !Statics.field320 && var1 == 4) && field648 > 0) {
                method3400(var22);
            }
            if (var1 == 2 && field648 > 0) {
                this.method1214(class36.field232, class36.field242);
            }
            return;
        }
        if (var1 != 1 && (Statics.field320 || var1 != 4)) {
            int var2 = class36.field231;
            int var3 = class36.field239;
            if (var2 < Statics.field2287 - 10 || var2 > Statics.field3541 + Statics.field2287 + 10 || var3 < Statics.field1070 - 10 || var3 > Statics.field439 + Statics.field1070 + 10) {
                field647 = false;
                int var4 = Statics.field2287;
                int var5 = Statics.field1070;
                int var6 = Statics.field3541;
                int var7 = Statics.field439;
                for (int var8 = 0; var8 < field719; var8++) {
                    if (field726[var8] + field724[var8] > var4 && field724[var8] < var4 + var6 && field769[var8] + field725[var8] > var5 && field725[var8] < var5 + var7) {
                        field721[var8] = true;
                    }
                }
            }
        }
        if (var1 != 1 && Statics.field320 || var1 != 4) {
            return;
        }
        int var9 = Statics.field2287;
        int var10 = Statics.field1070;
        int var11 = Statics.field3541;
        int var12 = class36.field232;
        int var13 = class36.field242;
        int var14 = -1;
        for (int var15 = 0; var15 < field648; var15++) {
            int var16 = (field648 - 1 - var15) * 15 + var10 + 31;
            if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                var14 = var15;
            }
        }
        if (var14 != -1) {
            method3400(var14);
        }
        field647 = false;
        int var17 = Statics.field2287;
        int var18 = Statics.field1070;
        int var19 = Statics.field3541;
        int var20 = Statics.field439;
        for (int var21 = 0; var21 < field719; var21++) {
            if (field726[var21] + field724[var21] > var17 && field724[var21] < var17 + var19 && field769[var21] + field725[var21] > var18 && field725[var21] < var18 + var20) {
                field721[var21] = true;
            }
        }
    }

    @ObfuscatedName("client.lo(I)Z")
    public final boolean method1667() {
        int var1 = field648 - 1;
        boolean var3 = field646 && field648 > 2;
        if (!var3) {
            boolean var4;
            if (var1 < 0) {
                var4 = false;
            } else {
                int var5 = field651[var1];
                if (var5 >= 2000) {
                    var5 -= 2000;
                }
                if (var5 == 1007) {
                    var4 = true;
                } else {
                    var4 = false;
                }
            }
            var3 = var4;
        }
        return var3 && !field656[var1];
    }

    @ObfuscatedName("client.lz(IIB)V")
    public final void method1214(int arg0, int arg1) {
        int var3 = Statics.field1089.method7103(class367.field4143);
        for (int var4 = 0; var4 < field648; var4++) {
            int var5 = Statics.field1089.method7103(Statics.method3514(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field648 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field5134) {
            var7 = Statics.field5134 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field199) {
            var8 = Statics.field199 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field2287 = var7;
        Statics.field1070 = var8;
        Statics.field3541 = var3;
        Statics.field439 = field648 * 15 + 22;
        int var9 = arg0 - field781;
        int var10 = arg1 - field747;
        Statics.field493.method4919(Statics.field1428, var9, var10, false);
        field647 = true;
    }

    @ObfuscatedName("ho.lr(II)V")
    public static final void method3400(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field649[arg0];
        int var2 = field650[arg0];
        int var3 = field651[arg0];
        int var4 = field652[arg0];
        int var5 = field688[arg0];
        String var6 = field771[arg0];
        String var7 = field795[arg0];
        method456(var1, var2, var3, var4, var5, var6, var7, class36.field232, class36.field242);
    }

    @ObfuscatedName("ba.lf(IIIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method456(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 25) {
            class347 var9 = Statics.field4415.method5741(arg1, arg0);
            if (var9 != null) {
                method6348();
                method7366(arg1, arg0, class348.method3187(Statics.method6900(var9)), arg4);
                field741 = 0;
                field669 = method8259(var9);
                if (field669 == null) {
                    field669 = class367.field4120;
                }
                if (var9.field3700) {
                    field670 = var9.field3782 + class102.method3860(16777215);
                } else {
                    field670 = class102.method3860(65280) + var9.field3831 + class102.method3860(16777215);
                }
            }
            return;
        }
        if (arg2 == 47) {
            class92 var10 = field738[arg3];
            if (var10 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var11 = class311.method7979(class309.field3237, field561.field1404);
                var11.field3279.method8699(field662.method4053(82) ? 1 : 0);
                var11.field3279.method8601(arg3);
                field561.method2736(var11);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field4432.method8115(arg2, arg3, new class337(arg0), new class337(arg1));
        }
        if (arg2 == 3) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var12 = class311.method7979(class309.field3180, field561.field1404);
            var12.field3279.method8600(Statics.field2683 + arg1);
            var12.field3279.method8657(field662.method4053(82) ? 1 : 0);
            var12.field3279.method8600(Statics.field1900 + arg0);
            var12.field3279.method8601(arg3);
            field561.method2736(var12);
        }
        if (arg2 == 14) {
            class92 var13 = field738[arg3];
            if (var13 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var14 = class311.method7979(class309.field3229, field561.field1404);
                var14.field3279.method8600(arg3);
                var14.field3279.method8600(Statics.field405);
                var14.field3279.method8601(Statics.field4321);
                var14.field3279.method8547(Statics.field132);
                var14.field3279.method8590(field662.method4053(82) ? 1 : 0);
                field561.method2736(var14);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class347 var15 = Statics.field4415.method5741(arg1, arg0);
            if (var15 != null) {
                method1115(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 1001) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var16 = class311.method7979(class309.field3215, field561.field1404);
            var16.field3279.method8590(field662.method4053(82) ? 1 : 0);
            var16.field3279.method8731(Statics.field1900 + arg0);
            var16.field3279.method8737(Statics.field2683 + arg1);
            var16.field3279.method8731(arg3);
            field561.method2736(var16);
        }
        if (arg2 == 58) {
            class347 var17 = Statics.field4415.method5741(arg1, arg0);
            if (var17 != null) {
                if (var17.field3810 != null) {
                    class88 var18 = new class88();
                    var18.field1058 = var17;
                    var18.field1061 = arg3;
                    var18.field1065 = arg6;
                    var18.field1067 = var17.field3810;
                    class71.method4538(var18);
                }
                class311 var19 = class311.method7979(class309.field3254, field561.field1404);
                var19.field3279.method8613(arg1);
                var19.field3279.method8600(arg0);
                var19.field3279.method8611(Statics.field3102);
                var19.field3279.method8731(field667);
                var19.field3279.method8737(field555);
                var19.field3279.method8600(arg4);
                field561.method2736(var19);
            }
        }
        if (arg2 == 29) {
            class311 var20 = class311.method7979(class309.field3200, field561.field1404);
            var20.field3279.method8547(arg1);
            field561.method2736(var20);
            class347 var21 = Statics.field4415.method5742(arg1);
            if (var21 != null && var21.field3827 != null && var21.field3827[0][0] == 5) {
                int var22 = var21.field3827[0][1];
                if (class336.field3598[var22] != var21.field3743[0]) {
                    class336.field3598[var22] = var21.field3743[0];
                    method3017(var22);
                }
            }
        }
        if (arg2 == 16) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var23 = class311.method7979(class309.field3243, field561.field1404);
            var23.field3279.method8600(arg3);
            var23.field3279.method8601(Statics.field2683 + arg1);
            var23.field3279.method8668(Statics.field132);
            var23.field3279.method8601(Statics.field1900 + arg0);
            var23.field3279.method8600(Statics.field4321);
            var23.field3279.method8559(field662.method4053(82) ? 1 : 0);
            var23.field3279.method8731(Statics.field405);
            field561.method2736(var23);
        }
        if (arg2 == 46) {
            class92 var24 = field738[arg3];
            if (var24 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var25 = class311.method7979(class309.field3210, field561.field1404);
                var25.field3279.method8699(field662.method4053(82) ? 1 : 0);
                var25.field3279.method8601(arg3);
                field561.method2736(var25);
            }
        }
        if (arg2 == 49) {
            class92 var26 = field738[arg3];
            if (var26 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var27 = class311.method7979(class309.field3170, field561.field1404);
                var27.field3279.method8737(arg3);
                var27.field3279.method8699(field662.method4053(82) ? 1 : 0);
                field561.method2736(var27);
            }
        }
        if (arg2 == 30 && field522 == null) {
            method5081(arg1, arg0);
            field522 = Statics.field4415.method5741(arg1, arg0);
            Statics.method5074(field522);
        }
        if (arg2 == 5) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var28 = class311.method7979(class309.field3192, field561.field1404);
            var28.field3279.method8657(field662.method4053(82) ? 1 : 0);
            var28.field3279.method8600(Statics.field2683 + arg1);
            var28.field3279.method8600(arg3);
            var28.field3279.method8731(Statics.field1900 + arg0);
            field561.method2736(var28);
        }
        if (arg2 == 17) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var29 = class311.method7979(class309.field3258, field561.field1404);
            var29.field3279.method8611(Statics.field3102);
            var29.field3279.method8601(field667);
            var29.field3279.method8601(arg3);
            var29.field3279.method8600(Statics.field1900 + arg0);
            var29.field3279.method8737(Statics.field2683 + arg1);
            var29.field3279.method8699(field662.method4053(82) ? 1 : 0);
            var29.field3279.method8600(field555);
            field561.method2736(var29);
        }
        if (arg2 == 48) {
            class92 var30 = field738[arg3];
            if (var30 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var31 = class311.method7979(class309.field3208, field561.field1404);
                var31.field3279.method8737(arg3);
                var31.field3279.method8559(field662.method4053(82) ? 1 : 0);
                field561.method2736(var31);
            }
        }
        if (arg2 == 13) {
            class101 var32 = field557[arg3];
            if (var32 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var33 = class311.method7979(class309.field3221, field561.field1404);
                var33.field3279.method8590(field662.method4053(82) ? 1 : 0);
                var33.field3279.method8731(arg3);
                field561.method2736(var33);
            }
        }
        if (arg2 == 18) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var34 = class311.method7979(class309.field3245, field561.field1404);
            var34.field3279.method8559(field662.method4053(82) ? 1 : 0);
            var34.field3279.method8731(Statics.field2683 + arg1);
            var34.field3279.method8601(arg3);
            var34.field3279.method8601(Statics.field1900 + arg0);
            field561.method2736(var34);
        }
        if (arg2 == 15) {
            class92 var35 = field738[arg3];
            if (var35 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var36 = class311.method7979(class309.field3196, field561.field1404);
                var36.field3279.method8657(field662.method4053(82) ? 1 : 0);
                var36.field3279.method8731(field555);
                var36.field3279.method8731(field667);
                var36.field3279.method8613(Statics.field3102);
                var36.field3279.method8731(arg3);
                field561.method2736(var36);
            }
        }
        if (arg2 == 22) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var37 = class311.method7979(class309.field3228, field561.field1404);
            var37.field3279.method8601(arg3);
            var37.field3279.method8731(Statics.field1900 + arg0);
            var37.field3279.method8731(Statics.field2683 + arg1);
            var37.field3279.method8559(field662.method4053(82) ? 1 : 0);
            field561.method2736(var37);
        }
        if (arg2 == 1002) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            class311 var38 = class311.method7979(class309.field3249, field561.field1404);
            var38.field3279.method8731(arg3);
            field561.method2736(var38);
        }
        if (arg2 == 10) {
            class101 var39 = field557[arg3];
            if (var39 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var40 = class311.method7979(class309.field3176, field561.field1404);
                var40.field3279.method8600(arg3);
                var40.field3279.method8699(field662.method4053(82) ? 1 : 0);
                field561.method2736(var40);
            }
        }
        if (arg2 == 6) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var41 = class311.method7979(class309.field3230, field561.field1404);
            var41.field3279.method8731(arg3);
            var41.field3279.method8699(field662.method4053(82) ? 1 : 0);
            var41.field3279.method8600(Statics.field2683 + arg1);
            var41.field3279.method8601(Statics.field1900 + arg0);
            field561.method2736(var41);
        }
        if (arg2 == 2) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var42 = class311.method7979(class309.field3166, field561.field1404);
            var42.field3279.method8600(Statics.field2683 + arg1);
            var42.field3279.method8601(arg3);
            var42.field3279.method8601(field667);
            var42.field3279.method8611(Statics.field3102);
            var42.field3279.method8737(Statics.field1900 + arg0);
            var42.field3279.method8731(field555);
            var42.field3279.method8657(field662.method4053(82) ? 1 : 0);
            field561.method2736(var42);
        }
        if (arg2 == 8) {
            class101 var43 = field557[arg3];
            if (var43 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var44 = class311.method7979(class309.field3239, field561.field1404);
                var44.field3279.method8737(arg3);
                var44.field3279.method8611(Statics.field3102);
                var44.field3279.method8737(field667);
                var44.field3279.method8601(field555);
                var44.field3279.method8590(field662.method4053(82) ? 1 : 0);
                field561.method2736(var44);
            }
        }
        if (arg2 == 20) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var45 = class311.method7979(class309.field3212, field561.field1404);
            var45.field3279.method8731(arg3);
            var45.field3279.method8601(Statics.field1900 + arg0);
            var45.field3279.method8600(Statics.field2683 + arg1);
            var45.field3279.method8559(field662.method4053(82) ? 1 : 0);
            field561.method2736(var45);
        }
        if (arg2 == 11) {
            class101 var46 = field557[arg3];
            if (var46 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var47 = class311.method7979(class309.field3198, field561.field1404);
                var47.field3279.method8601(arg3);
                var47.field3279.method8657(field662.method4053(82) ? 1 : 0);
                field561.method2736(var47);
            }
        }
        if (arg2 == 28) {
            class311 var48 = class311.method7979(class309.field3200, field561.field1404);
            var48.field3279.method8547(arg1);
            field561.method2736(var48);
            class347 var49 = Statics.field4415.method5742(arg1);
            if (var49 != null && var49.field3827 != null && var49.field3827[0][0] == 5) {
                int var50 = var49.field3827[0][1];
                class336.field3598[var50] = 1 - class336.field3598[var50];
                method3017(var50);
            }
        }
        if (arg2 == 19) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var51 = class311.method7979(class309.field3164, field561.field1404);
            var51.field3279.method8601(Statics.field1900 + arg0);
            var51.field3279.method8731(Statics.field2683 + arg1);
            var51.field3279.method8737(arg3);
            var51.field3279.method8699(field662.method4053(82) ? 1 : 0);
            field561.method2736(var51);
        }
        if (arg2 == 23) {
            if (field647) {
                Statics.field493.method5037();
            } else {
                Statics.field493.method4919(Statics.field1428, arg0, arg1, true);
            }
        }
        if (arg2 == 1003) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            class101 var52 = field557[arg3];
            if (var52 != null) {
                class189 var53 = var52.field1300;
                if (var53.field1984 != null) {
                    var53 = var53.method3459();
                }
                if (var53 != null) {
                    class311 var54 = class311.method7979(class309.field3263, field561.field1404);
                    var54.field3279.method8600(var53.field1947);
                    field561.method2736(var54);
                }
            }
        }
        if (arg2 == 7) {
            class101 var55 = field557[arg3];
            if (var55 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var56 = class311.method7979(class309.field3213, field561.field1404);
                var56.field3279.method8600(Statics.field4321);
                var56.field3279.method8699(field662.method4053(82) ? 1 : 0);
                var56.field3279.method8668(Statics.field132);
                var56.field3279.method8731(Statics.field405);
                var56.field3279.method8600(arg3);
                field561.method2736(var56);
            }
        }
        if (arg2 == 26) {
            method884();
        }
        if (arg2 == 1004) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            class311 var57 = class311.method7979(class309.field3225, field561.field1404);
            var57.field3279.method8601(arg3);
            var57.field3279.method8601(Statics.field2683 + arg1);
            var57.field3279.method8600(Statics.field1900 + arg0);
            field561.method2736(var57);
        }
        if (arg2 == 12) {
            class101 var58 = field557[arg3];
            if (var58 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var59 = class311.method7979(class309.field3234, field561.field1404);
                var59.field3279.method8657(field662.method4053(82) ? 1 : 0);
                var59.field3279.method8731(arg3);
                field561.method2736(var59);
            }
        }
        if (arg2 == 51) {
            class92 var60 = field738[arg3];
            if (var60 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var61 = class311.method7979(class309.field3174, field561.field1404);
                var61.field3279.method8731(arg3);
                var61.field3279.method8559(field662.method4053(82) ? 1 : 0);
                field561.method2736(var61);
            }
        }
        if (arg2 == 44) {
            class92 var62 = field738[arg3];
            if (var62 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var63 = class311.method7979(class309.field3173, field561.field1404);
                var63.field3279.method8600(arg3);
                var63.field3279.method8657(field662.method4053(82) ? 1 : 0);
                field561.method2736(var63);
            }
        }
        if (arg2 == 9) {
            class101 var64 = field557[arg3];
            if (var64 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var65 = class311.method7979(class309.field3209, field561.field1404);
                var65.field3279.method8699(field662.method4053(82) ? 1 : 0);
                var65.field3279.method8600(arg3);
                field561.method2736(var65);
            }
        }
        if (arg2 == 24) {
            class347 var66 = Statics.field4415.method5742(arg1);
            if (var66 != null) {
                boolean var67 = true;
                if (var66.field3706 > 0) {
                    var67 = method5732(var66);
                }
                if (var67) {
                    class311 var68 = class311.method7979(class309.field3200, field561.field1404);
                    var68.field3279.method8547(arg1);
                    field561.method2736(var68);
                }
            }
        }
        if (arg2 == 45) {
            class92 var69 = field738[arg3];
            if (var69 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var70 = class311.method7979(class309.field3179, field561.field1404);
                var70.field3279.method8559(field662.method4053(82) ? 1 : 0);
                var70.field3279.method8600(arg3);
                field561.method2736(var70);
            }
        }
        if (arg2 == 50) {
            class92 var71 = field738[arg3];
            if (var71 != null) {
                field617 = arg7;
                field701 = arg8;
                field620 = 2;
                field619 = 0;
                field750 = arg0;
                field571 = arg1;
                class311 var72 = class311.method7979(class309.field3185, field561.field1404);
                var72.field3279.method8737(arg3);
                var72.field3279.method8699(field662.method4053(82) ? 1 : 0);
                field561.method2736(var72);
            }
        }
        if (arg2 == 1) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var73 = class311.method7979(class309.field3182, field561.field1404);
            var73.field3279.method8600(Statics.field4321);
            var73.field3279.method8601(arg3);
            var73.field3279.method8611(Statics.field132);
            var73.field3279.method8559(field662.method4053(82) ? 1 : 0);
            var73.field3279.method8731(Statics.field1900 + arg0);
            var73.field3279.method8737(Statics.field2683 + arg1);
            var73.field3279.method8600(Statics.field405);
            field561.method2736(var73);
        }
        if (arg2 == 4) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var74 = class311.method7979(class309.field3203, field561.field1404);
            var74.field3279.method8731(arg3);
            var74.field3279.method8600(Statics.field2683 + arg1);
            var74.field3279.method8600(Statics.field1900 + arg0);
            var74.field3279.method8590(field662.method4053(82) ? 1 : 0);
            field561.method2736(var74);
        }
        if (arg2 == 21) {
            field617 = arg7;
            field701 = arg8;
            field620 = 2;
            field619 = 0;
            field750 = arg0;
            field571 = arg1;
            class311 var75 = class311.method7979(class309.field3246, field561.field1404);
            var75.field3279.method8600(arg3);
            var75.field3279.method8600(Statics.field2683 + arg1);
            var75.field3279.method8657(field662.method4053(82) ? 1 : 0);
            var75.field3279.method8601(Statics.field1900 + arg0);
            field561.method2736(var75);
        }
        if (field741 != 0) {
            field741 = 0;
            Statics.method5074(Statics.field4415.method5742(Statics.field132));
        }
        if (field722) {
            method6348();
        }
    }

    @ObfuscatedName("sx.mh(ILjava/lang/String;I)V")
    public static void method7982(int arg0, String arg1) {
        int var2 = class108.field1351;
        int[] var3 = class108.field1357;
        boolean var4 = false;
        class554 var5 = new class554(arg1, Statics.field1465);
        for (int var6 = 0; var6 < var2; var6++) {
            class92 var7 = field738[var3[var6]];
            if (var7 != null && Statics.field133 != var7 && var7.field1117 != null && var7.field1117.equals(var5)) {
                if (arg0 == 1) {
                    class311 var8 = class311.method7979(class309.field3173, field561.field1404);
                    var8.field3279.method8600(var3[var6]);
                    var8.field3279.method8657(0);
                    field561.method2736(var8);
                } else if (arg0 == 4) {
                    class311 var9 = class311.method7979(class309.field3237, field561.field1404);
                    var9.field3279.method8699(0);
                    var9.field3279.method8601(var3[var6]);
                    field561.method2736(var9);
                } else if (arg0 == 6) {
                    class311 var10 = class311.method7979(class309.field3170, field561.field1404);
                    var10.field3279.method8737(var3[var6]);
                    var10.field3279.method8699(0);
                    field561.method2736(var10);
                } else if (arg0 == 7) {
                    class311 var11 = class311.method7979(class309.field3185, field561.field1404);
                    var11.field3279.method8737(var3[var6]);
                    var11.field3279.method8699(0);
                    field561.method2736(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class111.method6511(4, "", class367.field4269 + arg1);
        }
    }

    @ObfuscatedName("ql.mt(IIIII)V")
    public static void method7366(int arg0, int arg1, int arg2, int arg3) {
        class347 var4 = Statics.field4415.method5741(arg0, arg1);
        if (var4 != null && var4.field3800 != null) {
            class88 var5 = new class88();
            var5.field1058 = var4;
            var5.field1067 = var4.field3800;
            class71.method4538(var5);
        }
        field555 = arg3;
        field722 = true;
        Statics.field3102 = arg0;
        field667 = arg1;
        Statics.field432 = arg2;
        Statics.method5074(var4);
    }

    @ObfuscatedName("ot.md(I)V")
    public static void method6348() {
        if (!field722) {
            return;
        }
        class347 var0 = Statics.field4415.method5741(Statics.field3102, field667);
        if (var0 != null && var0.field3801 != null) {
            class88 var1 = new class88();
            var1.field1058 = var0;
            var1.field1067 = var0.field3801;
            class71.method4538(var1);
        }
        field555 = -1;
        field722 = false;
        Statics.method5074(var0);
    }

    @ObfuscatedName("kt.mi(III)V")
    public static void method5081(int arg0, int arg1) {
        class311 var2 = class311.method7979(class309.field3226, field561.field1404);
        var2.field3279.method8600(arg1);
        var2.field3279.method8547(arg0);
        field561.method2736(var2);
    }

    @ObfuscatedName("cl.mo(IIIILjava/lang/String;B)V")
    public static void method1115(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class347 var5 = Statics.field4415.method5741(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3811 != null) {
            class88 var6 = new class88();
            var6.field1058 = var5;
            var6.field1061 = arg0;
            var6.field1065 = arg4;
            var6.field1067 = var5.field3811;
            class71.method4538(var6);
        }
        boolean var7 = true;
        if (var5.field3706 > 0) {
            var7 = method5732(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = Statics.method6900(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class311 var11 = class311.method7979(class309.field3189, field561.field1404);
            var11.field3279.method8547(arg1);
            var11.field3279.method8737(arg2);
            var11.field3279.method8737(arg3);
            field561.method2736(var11);
        }
        if (arg0 == 2) {
            class311 var12 = class311.method7979(class309.field3172, field561.field1404);
            var12.field3279.method8547(arg1);
            var12.field3279.method8737(arg2);
            var12.field3279.method8737(arg3);
            field561.method2736(var12);
        }
        if (arg0 == 3) {
            class311 var13 = class311.method7979(class309.field3233, field561.field1404);
            var13.field3279.method8547(arg1);
            var13.field3279.method8737(arg2);
            var13.field3279.method8737(arg3);
            field561.method2736(var13);
        }
        if (arg0 == 4) {
            class311 var14 = class311.method7979(class309.field3175, field561.field1404);
            var14.field3279.method8547(arg1);
            var14.field3279.method8737(arg2);
            var14.field3279.method8737(arg3);
            field561.method2736(var14);
        }
        if (arg0 == 5) {
            class311 var15 = class311.method7979(class309.field3184, field561.field1404);
            var15.field3279.method8547(arg1);
            var15.field3279.method8737(arg2);
            var15.field3279.method8737(arg3);
            field561.method2736(var15);
        }
        if (arg0 == 6) {
            class311 var16 = class311.method7979(class309.field3248, field561.field1404);
            var16.field3279.method8547(arg1);
            var16.field3279.method8737(arg2);
            var16.field3279.method8737(arg3);
            field561.method2736(var16);
        }
        if (arg0 == 7) {
            class311 var17 = class311.method7979(class309.field3178, field561.field1404);
            var17.field3279.method8547(arg1);
            var17.field3279.method8737(arg2);
            var17.field3279.method8737(arg3);
            field561.method2736(var17);
        }
        if (arg0 == 8) {
            class311 var18 = class311.method7979(class309.field3171, field561.field1404);
            var18.field3279.method8547(arg1);
            var18.field3279.method8737(arg2);
            var18.field3279.method8737(arg3);
            field561.method2736(var18);
        }
        if (arg0 == 9) {
            class311 var19 = class311.method7979(class309.field3195, field561.field1404);
            var19.field3279.method8547(arg1);
            var19.field3279.method8737(arg2);
            var19.field3279.method8737(arg3);
            field561.method2736(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class311 var20 = class311.method7979(class309.field3227, field561.field1404);
        var20.field3279.method8547(arg1);
        var20.field3279.method8737(arg2);
        var20.field3279.method8737(arg3);
        field561.method2736(var20);
    }

    @ObfuscatedName("ce.mw(Ljava/lang/String;Ljava/lang/String;IIIIII)V")
    public static final void method1903(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method6278(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("nc.mk(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method6278(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field647 || field648 >= 500) {
            return;
        }
        field771[field648] = arg0;
        field795[field648] = arg1;
        field651[field648] = arg2;
        field652[field648] = arg3;
        field649[field648] = arg4;
        field650[field648] = arg5;
        field688[field648] = arg6;
        field656[field648] = arg7;
        field648++;
    }

    @ObfuscatedName("po.ms(IIIIS)V")
    public static final void method7246(int arg0, int arg1, int arg2, int arg3) {
        if (field741 == 0 && !field722) {
            Statics.method6628(class367.field4145, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class284.method6905(); var8++) {
            long var9 = class284.field3050[var8];
            if (var6 != var9) {
                var6 = var9;
                long var13 = class284.field3050[var8];
                int var15 = (int) (var13 >>> 0 & 0x7FL);
                int var17 = var15;
                int var18 = class284.method2341(var8);
                int var19 = class284.method3801(class284.field3050[var8]);
                int var21 = class284.method3189(var8);
                if (var19 == 2 && Statics.field493.method5039(Statics.field1428, var15, var18, var9) >= 0) {
                    class202 var22 = class202.method3023(var21);
                    if (var22.field2097 != null) {
                        var22 = var22.method3608();
                    }
                    if (var22 == null) {
                        continue;
                    }
                    class95 var23 = null;
                    for (class95 var24 = (class95) field639.method6670(); var24 != null; var24 = (class95) field639.method6665()) {
                        if (Statics.field1428 == var24.field1169 && var24.field1160 == var17 && var24.field1161 == var18 && var24.field1165 == var21) {
                            var23 = var24;
                            break;
                        }
                    }
                    if (field741 == 1) {
                        Statics.method6628(class367.field4140, field665 + " " + class102.field1310 + " " + class102.method3860(65535) + var22.field2101, 1, var21, var17, var18);
                    } else if (!field722) {
                        String[] var25 = var22.field2141;
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if ((var23 == null || var23.method2344(var26)) && var25[var26] != null) {
                                    short var27 = 0;
                                    if (var26 == 0) {
                                        var27 = 3;
                                    }
                                    if (var26 == 1) {
                                        var27 = 4;
                                    }
                                    if (var26 == 2) {
                                        var27 = 5;
                                    }
                                    if (var26 == 3) {
                                        var27 = 6;
                                    }
                                    if (var26 == 4) {
                                        var27 = 1001;
                                    }
                                    Statics.method6628(var25[var26], class102.method3860(65535) + var22.field2101, var27, var21, var17, var18);
                                }
                            }
                        }
                        Statics.method6628(class367.field4141, class102.method3860(65535) + var22.field2101, 1002, var22.field2108, var17, var18);
                    } else if ((Statics.field432 & 0x4) == 4) {
                        Statics.method6628(field669, field670 + " " + class102.field1310 + " " + class102.method3860(65535) + var22.field2101, 2, var21, var17, var18);
                    }
                }
                if (var19 == 1) {
                    class101 var28 = field557[var21];
                    if (var28 == null) {
                        continue;
                    }
                    if (var28.field1300.field1980 == 1 && (var28.field1232 & 0x7F) == 64 && (var28.field1173 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < field558; var29++) {
                            class101 var30 = field557[field559[var29]];
                            if (var30 != null && var28 != var30 && var30.field1300.field1980 == 1 && var28.field1232 == var30.field1232 && var28.field1173 == var30.field1173) {
                                method2997(var30, field559[var29], var17, var18);
                            }
                        }
                        int var31 = class108.field1351;
                        int[] var32 = class108.field1357;
                        for (int var33 = 0; var33 < var31; var33++) {
                            class92 var34 = field738[var32[var33]];
                            if (var34 != null && var28.field1232 == var34.field1232 && var28.field1173 == var34.field1173) {
                                Statics.method7417(var34, var32[var33], var17, var18);
                            }
                        }
                    }
                    method2997(var28, var21, var17, var18);
                }
                if (var19 == 0) {
                    class92 var35 = field738[var21];
                    if (var35 == null) {
                        continue;
                    }
                    if ((var35.field1232 & 0x7F) == 64 && (var35.field1173 & 0x7F) == 64) {
                        for (int var36 = 0; var36 < field558; var36++) {
                            class101 var37 = field557[field559[var36]];
                            if (var37 != null && var37.field1300.field1980 == 1 && var35.field1232 == var37.field1232 && var35.field1173 == var37.field1173) {
                                method2997(var37, field559[var36], var17, var18);
                            }
                        }
                        int var38 = class108.field1351;
                        int[] var39 = class108.field1357;
                        for (int var40 = 0; var40 < var38; var40++) {
                            class92 var41 = field738[var39[var40]];
                            if (var41 != null && var35 != var41 && var35.field1232 == var41.field1232 && var35.field1173 == var41.field1173) {
                                Statics.method7417(var41, var39[var40], var17, var18);
                            }
                        }
                    }
                    if (field637 == var21) {
                        var4 = var9;
                    } else {
                        Statics.method7417(var35, var21, var17, var18);
                    }
                }
                if (var19 == 3) {
                    class394 var42 = field644[Statics.field1428][var17][var18];
                    if (var42 != null) {
                        for (class105 var43 = (class105) var42.method6671(); var43 != null; var43 = (class105) var42.method6674()) {
                            class203 var44 = class203.method5762(var43.field1338);
                            if (field741 == 1) {
                                Statics.method6628(class367.field4140, field665 + " " + class102.field1310 + " " + class102.method3860(16748608) + var44.field2155, 16, var43.field1338, var17, var18);
                            } else if (!field722) {
                                String[] var45 = var44.field2172;
                                for (int var46 = 4; var46 >= 0; var46--) {
                                    if (var43.method2640(var46)) {
                                        if (var45 != null && var45[var46] != null) {
                                            byte var47 = 0;
                                            if (var46 == 0) {
                                                var47 = 18;
                                            }
                                            if (var46 == 1) {
                                                var47 = 19;
                                            }
                                            if (var46 == 2) {
                                                var47 = 20;
                                            }
                                            if (var46 == 3) {
                                                var47 = 21;
                                            }
                                            if (var46 == 4) {
                                                var47 = 22;
                                            }
                                            Statics.method6628(var45[var46], class102.method3860(16748608) + var44.field2155, var47, var43.field1338, var17, var18);
                                        } else if (var46 == 2) {
                                            Statics.method6628(class367.field3977, class102.method3860(16748608) + var44.field2155, 20, var43.field1338, var17, var18);
                                        }
                                    }
                                }
                                Statics.method6628(class367.field4141, class102.method3860(16748608) + var44.field2155, 1004, var43.field1338, var17, var18);
                            } else if ((Statics.field432 & 0x1) == 1) {
                                Statics.method6628(field669, field670 + " " + class102.field1310 + " " + class102.method3860(16748608) + var44.field2155, 17, var43.field1338, var17, var18);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var48 = (int) (var4 >>> 0 & 0x7FL);
            int var50 = class284.method3016(var4);
            class92 var51 = field738[field637];
            Statics.method7417(var51, field637, var48, var50);
        }
    }

    @ObfuscatedName("fv.mj(Lds;IIII)V")
    public static final void method2997(class101 arg0, int arg1, int arg2, int arg3) {
        class189 var4 = arg0.field1300;
        if (field648 >= 400) {
            return;
        }
        if (var4.field1984 != null) {
            var4 = var4.method3459();
        }
        if (var4 == null || !var4.field1987 || var4.field1989 && field554 != arg1) {
            return;
        }
        String var5 = arg0.method2580();
        if (var4.field1977 != 0 && arg0.field1193 != 0) {
            int var6 = arg0.field1193 == -1 ? var4.field1977 : arg0.field1193;
            var5 = var5 + method5471(var6, Statics.field133.field1104) + " " + class102.field1312 + class367.field4146 + var6 + class102.field1314;
        }
        if (var4.field1989 && field521) {
            Statics.method6628(class367.field4141, class102.method3860(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field741 == 1) {
            Statics.method6628(class367.field4140, field665 + " " + class102.field1310 + " " + class102.method3860(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field722) {
            int var7 = var4.field1989 && field521 ? 2000 : 0;
            String[] var8 = var4.field1978;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (arg0.method2558(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase(class367.field4058)) {
                        int var10 = 0;
                        if (var9 == 0) {
                            var10 = var7 + 9;
                        }
                        if (var9 == 1) {
                            var10 = var7 + 10;
                        }
                        if (var9 == 2) {
                            var10 = var7 + 11;
                        }
                        if (var9 == 3) {
                            var10 = var7 + 12;
                        }
                        if (var9 == 4) {
                            var10 = var7 + 13;
                        }
                        Statics.method6628(var8[var9], class102.method3860(16776960) + var5, var10, arg1, arg2, arg3);
                    }
                }
            }
            if (var8 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (arg0.method2558(var11) && var8[var11] != null && var8[var11].equalsIgnoreCase(class367.field4058)) {
                        short var12 = 0;
                        if (field527 != class104.field1331) {
                            if (field527 == class104.field1329 || field527 == class104.field1328 && var4.field1977 > Statics.field133.field1104) {
                                var12 = 2000;
                            }
                            int var13 = 0;
                            if (var11 == 0) {
                                var13 = var12 + 9;
                            }
                            if (var11 == 1) {
                                var13 = var12 + 10;
                            }
                            if (var11 == 2) {
                                var13 = var12 + 11;
                            }
                            if (var11 == 3) {
                                var13 = var12 + 12;
                            }
                            if (var11 == 4) {
                                var13 = var12 + 13;
                            }
                            Statics.method6628(var8[var11], class102.method3860(16776960) + var5, var13, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1989 || !field521) {
                Statics.method6628(class367.field4141, class102.method3860(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field432 & 0x2) == 2) {
            Statics.method6628(field669, field670 + " " + class102.field1310 + " " + class102.method3860(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("mx.mb(III)Ljava/lang/String;")
    public static final String method5471(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class102.method3860(16711680);
        } else if (var2 < -6) {
            return class102.method3860(16723968);
        } else if (var2 < -3) {
            return class102.method3860(16740352);
        } else if (var2 < 0) {
            return class102.method3860(16756736);
        } else if (var2 > 9) {
            return class102.method3860(65280);
        } else if (var2 > 6) {
            return class102.method3860(4259584);
        } else if (var2 > 3) {
            return class102.method3860(8453888);
        } else if (var2 > 0) {
            return class102.method3860(12648192);
        } else {
            return class102.method3860(16776960);
        }
    }

    @ObfuscatedName("kj.mp(IIIIIIIII)V")
    public static final void method5085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field4415.method5751(arg0)) {
            Statics.field79 = null;
            method2840(Statics.field4415.field3611[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field79 != null) {
                method2840(Statics.field79, -1412584499, arg1, arg2, arg3, arg4, Statics.field136, Statics.field1343, arg7);
                Statics.field79 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field721[var8] = true;
            }
        } else {
            field721[arg7] = true;
        }
    }

    @ObfuscatedName("eh.ml([Lnn;IIIIIIIII)V")
    public static final void method2840(class347[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class541.method8876(arg2, arg3, arg4, arg5);
        class270.method4798();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class347 var10 = arg0[var9];
            if (var10 != null && (var10.field3812 == arg1 || arg1 == -1412584499 && field683 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field724[field719] = var10.field3715 + arg6;
                    field725[field719] = var10.field3716 + arg7;
                    field726[field719] = var10.field3778;
                    field769[field719] = var10.field3718;
                    var11 = ++field719 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3846 = var11;
                var10.field3847 = field677;
                if (!var10.field3700 || !Statics.method1126(var10)) {
                    if (var10.field3706 > 0) {
                        method5673(var10);
                    }
                    int var12 = var10.field3715 + arg6;
                    int var13 = var10.field3716 + arg7;
                    int var14 = var10.field3733;
                    if (field683 == var10) {
                        if (arg1 != -1412584499 && !var10.field3787) {
                            Statics.field79 = arg0;
                            Statics.field136 = arg6;
                            Statics.field1343 = arg7;
                            continue;
                        }
                        if (field694 && field740) {
                            int var15 = class36.field231;
                            int var16 = class36.field239;
                            int var17 = var15 - field685;
                            int var18 = var16 - field686;
                            if (var17 < field689) {
                                var17 = field689;
                            }
                            if (var10.field3778 + var17 > field689 + field684.field3778) {
                                var17 = field689 + field684.field3778 - var10.field3778;
                            }
                            if (var18 < field690) {
                                var18 = field690;
                            }
                            if (var10.field3718 + var18 > field690 + field684.field3718) {
                                var18 = field690 + field684.field3718 - var10.field3718;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3787) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3799 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3778 + var12;
                        int var22 = var10.field3718 + var13;
                        if (var21 < var12) {
                            var19 = var21;
                            var21 = var12;
                        }
                        if (var22 < var13) {
                            var20 = var22;
                            var22 = var13;
                        }
                        var21++;
                        var22++;
                        var25 = var19 > arg2 ? var19 : arg2;
                        var26 = var20 > arg3 ? var20 : arg3;
                        var27 = var21 < arg4 ? var21 : arg4;
                        var28 = var22 < arg5 ? var22 : arg5;
                    } else {
                        int var29 = var10.field3778 + var12;
                        int var30 = var10.field3718 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3700 || var25 < var27 && var26 < var28) {
                        if (var10.field3706 != 0) {
                            if (var10.field3706 == 1336) {
                                if (Statics.field1155.method2440()) {
                                    var13 += 15;
                                    Statics.field3619.method7111("Fps:" + field211, var10.field3778 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field503) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3619.method7111("Mem:" + var32 + "k", var10.field3778 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3706 == 1337) {
                                field673 = var12;
                                field661 = var13;
                                method672(var12, var13, var10.field3778, var10.field3718);
                                field721[var10.field3846] = true;
                                class541.method8876(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3706 == 1338) {
                                method2788(var10, var12, var13, var11);
                                class541.method8876(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3706 == 1339) {
                                Statics.method8442(var10, var12, var13, var11);
                                class541.method8876(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3706 == 1400) {
                                Statics.field4432.method8078(var12, var13, var10.field3778, var10.field3718, field677);
                            }
                            if (var10.field3706 == 1401) {
                                Statics.field4432.method8230(var12, var13, var10.field3778, var10.field3718);
                            }
                            if (var10.field3706 == 1402) {
                                Statics.field3596.method2407(var12, field677);
                            }
                        }
                        if (var10.field3799 == 0) {
                            if (!var10.field3700 && Statics.method1126(var10) && Statics.field4657 != var10) {
                                continue;
                            }
                            if (!var10.field3700) {
                                if (var10.field3724 > var10.field3709 - var10.field3718) {
                                    var10.field3724 = var10.field3709 - var10.field3718;
                                }
                                if (var10.field3724 < 0) {
                                    var10.field3724 = 0;
                                }
                            }
                            method2840(arg0, var10.field3701, var25, var26, var27, var28, var12 - var10.field3795, var13 - var10.field3724, var11);
                            if (var10.field3839 != null) {
                                method2840(var10.field3839, var10.field3701, var25, var26, var27, var28, var12 - var10.field3795, var13 - var10.field3724, var11);
                            }
                            class87 var34 = (class87) field655.method8301((long) var10.field3701);
                            if (var34 != null) {
                                method5085(var34.field1052, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class541.method8876(arg2, arg3, arg4, arg5);
                            class270.method4798();
                        } else if (var10.field3799 == 11) {
                            if (Statics.method1126(var10) && Statics.field4657 != var10) {
                                continue;
                            }
                            if (var10.field3839 != null) {
                                method2840(var10.field3839, var10.field3701, var25, var26, var27, var28, var12 - var10.field3795, var13 - var10.field3724, var11);
                            }
                            class541.method8876(arg2, arg3, arg4, arg5);
                            class270.method4798();
                        }
                        if (field660 || field730[var11] || field728 > 1) {
                            if (var10.field3799 == 0 && !var10.field3700 && var10.field3709 > var10.field3718) {
                                method2859(var10.field3778 + var12, var13, var10.field3724, var10.field3718, var10.field3709);
                            }
                            if (var10.field3799 != 1) {
                                if (var10.field3799 == 3) {
                                    int var35;
                                    if (method6080(var10)) {
                                        var35 = var10.field3728;
                                        if (Statics.field4657 == var10 && var10.field3730 != 0) {
                                            var35 = var10.field3730;
                                        }
                                    } else {
                                        var35 = var10.field3842;
                                        if (Statics.field4657 == var10 && var10.field3779 != 0) {
                                            var35 = var10.field3779;
                                        }
                                    }
                                    if (var10.field3689) {
                                        switch(var10.field3732.field5265) {
                                            case 1:
                                                class541.method8888(var12, var13, var10.field3778, var10.field3718, var10.field3842, var10.field3728);
                                                break;
                                            case 2:
                                                class541.method8887(var12, var13, var10.field3778, var10.field3718, var10.field3842, var10.field3728, 255 - (var10.field3733 & 0xFF), 255 - (var10.field3734 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class541.method8884(var12, var13, var10.field3778, var10.field3718, var35);
                                                } else {
                                                    class541.method8936(var12, var13, var10.field3778, var10.field3718, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class541.method8874(var12, var13, var10.field3778, var10.field3718, var35);
                                    } else {
                                        class541.method8889(var12, var13, var10.field3778, var10.field3718, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3799 == 4) {
                                    class410 var36 = var10.method6092(Statics.field4415);
                                    if (var36 != null) {
                                        String var37 = var10.field3765;
                                        int var38;
                                        if (method6080(var10)) {
                                            var38 = var10.field3728;
                                            if (Statics.field4657 == var10 && var10.field3730 != 0) {
                                                var38 = var10.field3730;
                                            }
                                            if (var10.field3753.length() > 0) {
                                                var37 = var10.field3753;
                                            }
                                        } else {
                                            var38 = var10.field3842;
                                            if (Statics.field4657 == var10 && var10.field3779 != 0) {
                                                var38 = var10.field3779;
                                            }
                                        }
                                        if (var10.field3700 && var10.field3822 != -1) {
                                            class203 var39 = class203.method5762(var10.field3822);
                                            var37 = var39.field2155;
                                            if (var37 == null) {
                                                var37 = class367.field4120;
                                            }
                                            if ((var39.field2166 == 1 || var10.field3836 != 1) && var10.field3836 != -1) {
                                                var37 = class102.method3860(16748608) + var37 + class102.field1316 + " " + 'x' + method3040(var10.field3836);
                                            }
                                        }
                                        if (field522 == var10) {
                                            var37 = class367.field4151;
                                            var38 = var10.field3842;
                                        }
                                        if (!var10.field3700) {
                                            var37 = method886(var37, var10);
                                        }
                                        var36.method7198(var37, var12, var13, var10.field3778, var10.field3718, var38, var10.field3770 ? 0 : -1, class483.method7972(var10.field3733), var10.field3768, var10.field3769, var10.field3767);
                                    } else if (class347.field3699) {
                                        Statics.method5074(var10);
                                    }
                                } else if (var10.field3799 == 5) {
                                    if (var10.field3700) {
                                        class545 var41;
                                        if (var10.field3822 == -1) {
                                            var41 = var10.method6087(Statics.field4415, false, Statics.field1431);
                                        } else {
                                            var41 = class203.method2830(var10.field3822, var10.field3836, var10.field3742, var10.field3705, var10.field3833, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5275;
                                            int var43 = var41.field5279;
                                            if (var10.field3741) {
                                                class541.method8877(var12, var13, var10.field3778 + var12, var10.field3718 + var13);
                                                int var44 = (var10.field3778 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3718 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3740 != 0) {
                                                            var41.method9014(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3740, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method8995(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method9001(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class541.method8876(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3778 * 4096 / var42;
                                                if (var10.field3740 != 0) {
                                                    var41.method9014(var10.field3778 / 2 + var12, var10.field3718 / 2 + var13, var10.field3740, var48);
                                                } else if (var14 != 0) {
                                                    var41.method9003(var12, var13, var10.field3778, var10.field3718, 256 - (var14 & 0xFF));
                                                } else if (var10.field3778 == var42 && var10.field3718 == var43) {
                                                    var41.method8995(var12, var13);
                                                } else {
                                                    var41.method9071(var12, var13, var10.field3778, var10.field3718);
                                                }
                                            }
                                        } else if (class347.field3699) {
                                            Statics.method5074(var10);
                                        }
                                    } else {
                                        class545 var40 = var10.method6087(Statics.field4415, method6080(var10), Statics.field1431);
                                        if (var40 != null) {
                                            var40.method8995(var12, var13);
                                        } else if (class347.field3699) {
                                            Statics.method5074(var10);
                                        }
                                    }
                                } else if (var10.field3799 == 6) {
                                    boolean var49 = method6080(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3704;
                                    } else {
                                        var50 = var10.field3783;
                                    }
                                    class283 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3822 != -1) {
                                        class203 var53 = class203.method5762(var10.field3822);
                                        if (var53 != null) {
                                            class203 var54 = var53.method3671(var10.field3836);
                                            var51 = var54.method3670(1);
                                            if (var51 == null) {
                                                Statics.method5074(var10);
                                            } else {
                                                var51.method5136();
                                                var52 = var51.field2910 / 2;
                                            }
                                        }
                                    } else if (var10.field3746 == 5) {
                                        if (var10.field3747 == 0) {
                                            var51 = field621.method5776((class205) null, -1, (class205) null, -1);
                                        } else {
                                            var51 = Statics.field133.method2053();
                                        }
                                    } else if (var10.field3746 == 7) {
                                        var51 = var10.field3760.method5776((class205) null, -1, class205.method73(Statics.field133.field1178), Statics.field133.field1183);
                                    } else {
                                        class189 var55 = null;
                                        class188 var56 = null;
                                        if (var10.field3746 == 6) {
                                            int var57 = var10.field3747;
                                            if (var57 >= 0 && var57 < field557.length) {
                                                class101 var58 = field557[var57];
                                                if (var58 != null) {
                                                    var55 = var58.field1300;
                                                    var56 = var58.method2569();
                                                }
                                            }
                                        }
                                        class205 var59 = null;
                                        int var60 = -1;
                                        if (var50 != -1) {
                                            var59 = class205.method73(var50);
                                            var60 = var10.field3745;
                                        }
                                        var51 = var10.method6093(Statics.field4415, var59, var60, var49, Statics.field133.field1099, var55, var56);
                                        if (var51 == null && class347.field3699) {
                                            Statics.method5074(var10);
                                        }
                                    }
                                    class270.method4762(var10.field3778 / 2 + var12, var10.field3718 / 2 + var13);
                                    int var61 = var10.field3757 * class270.field2803[var10.field3754] >> 16;
                                    int var62 = var10.field3757 * class270.field2808[var10.field3754] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3700) {
                                            var51.method5136();
                                            if (var10.field3761) {
                                                var51.method5155(0, var10.field3755, var10.field3756, var10.field3754, var10.field3752, var10.field3717 + var52 + var61, var10.field3717 + var62, var10.field3757);
                                            } else {
                                                var51.method5154(0, var10.field3755, var10.field3756, var10.field3754, var10.field3752, var10.field3717 + var52 + var61, var10.field3717 + var62);
                                            }
                                        } else {
                                            var51.method5154(0, var10.field3755, 0, var10.field3754, 0, var61, var62);
                                        }
                                    }
                                    class270.method4761();
                                } else {
                                    if (var10.field3799 == 8 && Statics.field2288 == var10 && field751 == field663) {
                                        int var63 = 0;
                                        int var64 = 0;
                                        class410 var65 = Statics.field3619;
                                        String var66 = var10.field3765;
                                        String var67 = method886(var66, var10);
                                        while (var67.length() > 0) {
                                            int var68 = var67.indexOf(class102.field1315);
                                            String var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = "";
                                            } else {
                                                var69 = var67.substring(0, var68);
                                                var67 = var67.substring(var68 + 4);
                                            }
                                            int var70 = var65.method7103(var69);
                                            if (var70 > var63) {
                                                var63 = var70;
                                            }
                                            var64 += var65.field4556 + 1;
                                        }
                                        var63 += 6;
                                        var64 += 7;
                                        int var71 = var10.field3778 + var12 - 5 - var63;
                                        int var72 = var10.field3718 + var13 + 5;
                                        if (var71 < var12 + 5) {
                                            var71 = var12 + 5;
                                        }
                                        if (var63 + var71 > arg4) {
                                            var71 = arg4 - var63;
                                        }
                                        if (var64 + var72 > arg5) {
                                            var72 = arg5 - var64;
                                        }
                                        class541.method8884(var71, var72, var63, var64, 16777120);
                                        class541.method8874(var71, var72, var63, var64, 0);
                                        String var73 = var10.field3765;
                                        int var74 = var65.field4556 + var72 + 2;
                                        String var75 = method886(var73, var10);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf(class102.field1315);
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            var65.method7109(var77, var71 + 3, var74, 0, -1);
                                            var74 += var65.field4556 + 1;
                                        }
                                    }
                                    if (var10.field3799 == 9) {
                                        int var78;
                                        int var79;
                                        int var80;
                                        int var81;
                                        if (var10.field3736) {
                                            var78 = var12;
                                            var79 = var10.field3718 + var13;
                                            var80 = var10.field3778 + var12;
                                            var81 = var13;
                                        } else {
                                            var78 = var12;
                                            var79 = var13;
                                            var80 = var10.field3778 + var12;
                                            var81 = var10.field3718 + var13;
                                        }
                                        if (var10.field3735 == 1) {
                                            class541.method8894(var78, var79, var80, var81, var10.field3842);
                                        } else {
                                            method4536(var78, var79, var80, var81, var10.field3842, var10.field3735);
                                        }
                                    } else if (var10.field3799 == 12) {
                                        class345 var82 = var10.method6094();
                                        class340 var83 = var10.method6123();
                                        if (var82 != null && var83 != null && var82.method5866()) {
                                            class410 var84 = var10.method6092(Statics.field4415);
                                            if (var84 != null) {
                                                field713.method9136(var12, var13, var10.field3778, var10.field3718, var82.method5898(), var82.method5868(), var82.method5865(), var82.method5925(), var82.method5942());
                                                int var85 = var10.field3770 ? var10.field3705 : -1;
                                                if (!var82.method5862() && var82.method5836().method6952()) {
                                                    field713.method9135(var83.field3621, var85, var83.field3624, var83.field3620);
                                                    field713.method9138(var82.method5958(), var84);
                                                } else {
                                                    field713.method9135(var10.field3842, var85, var83.field3624, var83.field3620);
                                                    field713.method9138(var82.method5836(), var84);
                                                }
                                                class541.method8876(arg2, arg3, arg4, arg5);
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
    }

    @ObfuscatedName("jf.mr(IIIIIII)V")
    public static final void method4536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class541.field5251;
        int var18 = arg1 - class541.field5253;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class270.method4763(var19, var20, var21);
        class270.method4807(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class270.method4763(var19, var21, var22);
        class270.method4807(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("be.mv(Ljava/lang/String;Lnn;S)Ljava/lang/String;")
    public static String method886(String arg0, class347 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2230(arg1, var2 - 1);
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

    @ObfuscatedName("fu.mf(IB)Ljava/lang/String;")
    public static final String method3040(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class102.field1309 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class102.method3860(65408) + var1.substring(0, var1.length() - 8) + class367.field4208 + " " + class102.field1312 + var1 + class102.field1314 + class102.field1316;
        } else if (var1.length() > 6) {
            return " " + class102.method3860(16777215) + var1.substring(0, var1.length() - 4) + class367.field4022 + " " + class102.field1312 + var1 + class102.field1314 + class102.field1316;
        } else {
            return " " + class102.method3860(16776960) + var1 + class102.field1316;
        }
    }

    @ObfuscatedName("client.ma(ZI)V")
    public final void method1215(boolean arg0) {
        int var2 = field671;
        int var3 = Statics.field5134;
        int var4 = Statics.field199;
        if (Statics.field4415.method5751(var2)) {
            method7340(Statics.field4415.field3611[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.me(Lnn;B)V")
    public void method1216(class347 arg0) {
        class347 var2 = arg0.field3812 == -1 ? null : Statics.field4415.method5742(arg0.field3812);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field5134;
            var4 = Statics.field199;
        } else {
            var3 = var2.field3778;
            var4 = var2.field3718;
        }
        method7262(arg0, var3, var4, false);
        method4577(arg0, var3, var4);
    }

    @ObfuscatedName("av.mz([Lnn;Lnn;ZI)V")
    public static void method213(class347[] arg0, class347 arg1, boolean arg2) {
        int var3 = arg1.field3725 == 0 ? arg1.field3778 : arg1.field3725;
        int var4 = arg1.field3709 == 0 ? arg1.field3718 : arg1.field3709;
        method7340(arg0, arg1.field3701, var3, var4, arg2);
        if (arg1.field3839 != null) {
            method7340(arg1.field3839, arg1.field3701, var3, var4, arg2);
        }
        class87 var5 = (class87) field655.method8301((long) arg1.field3701);
        if (var5 != null) {
            int var6 = var5.field1052;
            if (Statics.field4415.method5751(var6)) {
                method7340(Statics.field4415.field3611[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3706 == 1337) {
        }
    }

    @ObfuscatedName("qs.mq([Lnn;IIIZI)V")
    public static void method7340(class347[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class347 var6 = arg0[var5];
            if (var6 != null && var6.field3812 == arg1) {
                method7262(var6, arg2, arg3, arg4);
                method4577(var6, arg2, arg3);
                if (var6.field3795 > var6.field3725 - var6.field3778) {
                    var6.field3795 = var6.field3725 - var6.field3778;
                }
                if (var6.field3795 < 0) {
                    var6.field3795 = 0;
                }
                if (var6.field3724 > var6.field3709 - var6.field3718) {
                    var6.field3724 = var6.field3709 - var6.field3718;
                }
                if (var6.field3724 < 0) {
                    var6.field3724 = 0;
                }
                if (var6.field3799 == 0) {
                    method213(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("qe.mm(Lnn;IIZI)V")
    public static void method7262(class347 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3778;
        int var5 = arg0.field3718;
        if (arg0.field3692 == 0) {
            arg0.field3778 = arg0.field3713;
        } else if (arg0.field3692 == 1) {
            arg0.field3778 = arg1 - arg0.field3713;
        } else if (arg0.field3692 == 2) {
            arg0.field3778 = arg0.field3713 * arg1 >> 14;
        }
        if (arg0.field3710 == 0) {
            arg0.field3718 = arg0.field3714;
        } else if (arg0.field3710 == 1) {
            arg0.field3718 = arg2 - arg0.field3714;
        } else if (arg0.field3710 == 2) {
            arg0.field3718 = arg0.field3714 * arg2 >> 14;
        }
        if (arg0.field3692 == 4) {
            arg0.field3778 = arg0.field3719 * arg0.field3718 / arg0.field3711;
        }
        if (arg0.field3710 == 4) {
            arg0.field3718 = arg0.field3778 * arg0.field3711 / arg0.field3719;
        }
        if (arg0.field3706 == 1337) {
            field682 = arg0;
        }
        if (arg0.field3799 == 12) {
            arg0.method6094().method5816(arg0.field3778, arg0.field3718);
        }
        if (arg3 && arg0.field3774 != null && (arg0.field3778 != var4 || arg0.field3718 != var5)) {
            class88 var6 = new class88();
            var6.field1058 = arg0;
            var6.field1067 = arg0.field3774;
            field714.method6666(var6);
        }
    }

    @ObfuscatedName("js.mu(Lnn;III)V")
    public static void method4577(class347 arg0, int arg1, int arg2) {
        if (arg0.field3738 == 0) {
            arg0.field3715 = arg0.field3817;
        } else if (arg0.field3738 == 1) {
            arg0.field3715 = (arg1 - arg0.field3778) / 2 + arg0.field3817;
        } else if (arg0.field3738 == 2) {
            arg0.field3715 = arg1 - arg0.field3778 - arg0.field3817;
        } else if (arg0.field3738 == 3) {
            arg0.field3715 = arg0.field3817 * arg1 >> 14;
        } else if (arg0.field3738 == 4) {
            arg0.field3715 = (arg0.field3817 * arg1 >> 14) + (arg1 - arg0.field3778) / 2;
        } else {
            arg0.field3715 = arg1 - arg0.field3778 - (arg0.field3817 * arg1 >> 14);
        }
        if (arg0.field3821 == 0) {
            arg0.field3716 = arg0.field3712;
        } else if (arg0.field3821 == 1) {
            arg0.field3716 = (arg2 - arg0.field3718) / 2 + arg0.field3712;
        } else if (arg0.field3821 == 2) {
            arg0.field3716 = arg2 - arg0.field3718 - arg0.field3712;
        } else if (arg0.field3821 == 3) {
            arg0.field3716 = arg0.field3712 * arg2 >> 14;
        } else if (arg0.field3821 == 4) {
            arg0.field3716 = (arg0.field3712 * arg2 >> 14) + (arg2 - arg0.field3718) / 2;
        } else {
            arg0.field3716 = arg2 - arg0.field3718 - (arg0.field3712 * arg2 >> 14);
        }
    }

    @ObfuscatedName("eb.np(IIIIII)V")
    public static final void method2859(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field3933[0].method8966(arg0, arg1);
        Statics.field3933[1].method8966(arg0, arg1 + arg3 - 16);
        class541.method8884(arg0, arg1 + 16, 16, arg3 - 32, field578);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class541.method8884(arg0, arg1 + 16 + var6, 16, var5, field579);
        class541.method8903(arg0, arg1 + 16 + var6, var5, field581);
        class541.method8903(arg0 + 1, arg1 + 16 + var6, var5, field581);
        class541.method8916(arg0, arg1 + 16 + var6, 16, field581);
        class541.method8916(arg0, arg1 + 17 + var6, 16, field581);
        class541.method8903(arg0 + 15, arg1 + 16 + var6, var5, field542);
        class541.method8903(arg0 + 14, arg1 + 17 + var6, var5 - 1, field542);
        class541.method8916(arg0, arg1 + 15 + var6 + var5, 16, field542);
        class541.method8916(arg0 + 1, arg1 + 14 + var6 + var5, 15, field542);
    }

    @ObfuscatedName("nj.nr(Lnn;B)Z")
    public static final boolean method6080(class347 arg0) {
        if (arg0.field3828 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3828.length; var1++) {
            int var2 = method2230(arg0, var1);
            int var3 = arg0.field3743[var1];
            if (arg0.field3828[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3828[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3828[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("dt.nh(Lnn;IS)I")
    public static final int method2230(class347 arg0, int arg1) {
        if (arg0.field3827 == null || arg1 >= arg0.field3827.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3827[arg1];
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
                    var7 = field642[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field518[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field745[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class347 var11 = Statics.field4415.method5742(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class203.method5762(var12).field2203 || field680)) {
                        for (int var13 = 0; var13 < var11.field3835.length; var13++) {
                            if (var12 + 1 == var11.field3835[var13]) {
                                var7 += var11.field3834[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class336.field3598[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class357.field3914[field518[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class336.field3598[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field133.field1104;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class357.field3911[var14]) {
                            var7 += field518[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class347 var17 = Statics.field4415.method5742(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class203.method5762(var18).field2203 || field680)) {
                        for (int var19 = 0; var19 < var17.field3835.length; var19++) {
                            if (var18 + 1 == var17.field3835[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field672;
                }
                if (var6 == 12) {
                    var7 = field678;
                }
                if (var6 == 13) {
                    int var20 = class336.field3598[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class336.method1124(var22);
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
                    var7 = (Statics.field133.field1232 >> 7) + Statics.field1900;
                }
                if (var6 == 19) {
                    var7 = (Statics.field133.field1173 >> 7) + Statics.field2683;
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

    @ObfuscatedName("jo.ns(Lnn;I)V")
    public static final void method4575(class347 arg0) {
        if (arg0.field3702 == 1) {
            method1903(arg0.field3832, "", 24, 0, 0, arg0.field3701, arg0.field3822);
        }
        if (arg0.field3702 == 2 && !field722) {
            String var1 = method8259(arg0);
            if (var1 != null) {
                method1903(var1, class102.method3860(65280) + arg0.field3831, 25, 0, -1, arg0.field3701, arg0.field3822);
            }
        }
        if (arg0.field3702 == 3) {
            Statics.method6628(class367.field4007, "", 26, 0, 0, arg0.field3701);
        }
        if (arg0.field3702 == 4) {
            Statics.method6628(arg0.field3832, "", 28, 0, 0, arg0.field3701);
        }
        if (arg0.field3702 == 5) {
            Statics.method6628(arg0.field3832, "", 29, 0, 0, arg0.field3701);
        }
        if (arg0.field3702 == 6 && field522 == null) {
            Statics.method6628(arg0.field3832, "", 30, 0, -1, arg0.field3701);
        }
        if (!arg0.field3700) {
            return;
        }
        if (field722) {
            int var2 = Statics.method6900(arg0);
            boolean var3 = (var2 >> 21 & 0x1) != 0;
            if (var3 && (Statics.field432 & 0x20) == 32) {
                method1903(field669, field670 + " " + class102.field1310 + " " + arg0.field3782, 58, 0, arg0.field3721, arg0.field3701, arg0.field3822);
            }
            return;
        }
        for (int var4 = 9; var4 >= 5; var4--) {
            String var5 = method2395(arg0, var4);
            if (var5 != null) {
                method1903(var5, arg0.field3782, 1007, var4 + 1, arg0.field3721, arg0.field3701, arg0.field3822);
            }
        }
        String var6 = method8259(arg0);
        if (var6 != null) {
            method1903(var6, arg0.field3782, 25, 0, arg0.field3721, arg0.field3701, arg0.field3822);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = method2395(arg0, var7);
            if (var8 != null) {
                method6278(var8, arg0.field3782, 57, var7 + 1, arg0.field3721, arg0.field3701, arg0.field3822, arg0.field3851);
            }
        }
        if (class348.method5411(Statics.method6900(arg0))) {
            Statics.method6628(class367.field3982, "", 30, 0, arg0.field3721, arg0.field3701);
        }
    }

    @ObfuscatedName("jx.nm(ZI)V")
    public static void method4540(boolean arg0) {
        field658 = arg0;
    }

    @ObfuscatedName("ei.nz(B)Z")
    public static boolean method2884() {
        return field658;
    }

    @ObfuscatedName("bg.nl(IIIIIIII)V")
    public static final void method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field4415.method5751(arg0)) {
            method4464(Statics.field4415.field3611[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("jt.nj([Lnn;IIIIIIII)V")
    public static final void method4464(class347[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class347 var9 = arg0[var8];
            if (var9 != null && var9.field3812 == arg1 && (var9.method6096() || Statics.method6900(var9) != 0 || field684 == var9)) {
                if (var9.field3700) {
                    if (Statics.method1126(var9)) {
                        continue;
                    }
                } else if (var9.field3799 == 0 && Statics.field4657 != var9 && Statics.method1126(var9)) {
                    continue;
                }
                if (var9.field3799 == 11) {
                    if (var9.method6113(Statics.field4415, Statics.field1431)) {
                        if (var9.method6156()) {
                            Statics.method5074(var9);
                            method213(var9.field3839, var9, true);
                            var9.method6112().method3820().method3942(3, var9.method6112().method3832());
                        }
                        if (var9.field3826 != null) {
                            class88 var10 = new class88();
                            var10.field1058 = var9;
                            var10.field1067 = var9.field3826;
                            field714.method6666(var10);
                        }
                    }
                } else if (var9.field3799 == 12 && var9.method6121(Statics.field4415)) {
                    Statics.method5074(var9);
                }
                int var11 = var9.field3715 + arg6;
                int var12 = var9.field3716 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3799 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3778 + var11;
                    int var16 = var9.field3718 + var12;
                    if (var15 < var11) {
                        var13 = var15;
                        var15 = var11;
                    }
                    if (var16 < var12) {
                        var14 = var16;
                        var16 = var12;
                    }
                    var15++;
                    var16++;
                    var19 = var13 > arg2 ? var13 : arg2;
                    var20 = var14 > arg3 ? var14 : arg3;
                    var21 = var15 < arg4 ? var15 : arg4;
                    var22 = var16 < arg5 ? var16 : arg5;
                } else {
                    int var23 = var9.field3778 + var11;
                    int var24 = var9.field3718 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field683 == var9) {
                    field715 = true;
                    field720 = var11;
                    field693 = var12;
                }
                boolean var25 = false;
                if (var9.field3777) {
                    switch(field799) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3701 >>> 16 == field674) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field674 == var9.field3701) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3700 || var19 < var21 && var20 < var22) {
                    if (var9.field3700) {
                        if (var9.field3849) {
                            if (class36.field231 >= var19 && class36.field239 >= var20 && class36.field231 < var21 && class36.field239 < var22) {
                                for (class88 var26 = (class88) field714.method6670(); var26 != null; var26 = (class88) field714.method6665()) {
                                    if (var26.field1057) {
                                        var26.method7988();
                                        var26.field1058.field3723 = false;
                                    }
                                }
                                method163();
                                if (Statics.field39 == 0) {
                                    field683 = null;
                                    field684 = null;
                                }
                                if (!field647) {
                                    method6322();
                                }
                            }
                        } else if (var9.field3850 && class36.field231 >= var19 && class36.field239 >= var20 && class36.field231 < var21 && class36.field239 < var22) {
                            for (class88 var27 = (class88) field714.method6670(); var27 != null; var27 = (class88) field714.method6665()) {
                                if (var27.field1057 && var27.field1058.field3772 == var27.field1067) {
                                    var27.method7988();
                                }
                            }
                        }
                    }
                    int var28 = class36.field231;
                    int var29 = class36.field239;
                    if (class36.field238 != 0) {
                        var28 = class36.field232;
                        var29 = class36.field242;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3706 == 1337) {
                        if (!field691 && !field647 && var30) {
                            method7246(var28, var29, var19, var20);
                        }
                    } else if (var9.field3706 == 1338) {
                        method4165(var9, var11, var12);
                    } else {
                        if (var9.field3706 == 1400) {
                            Statics.field4432.method8064(class36.field231, class36.field239, var30, var11, var12, var9.field3778, var9.field3718);
                        }
                        if (!field647 && var30) {
                            if (var9.field3706 == 1400) {
                                Statics.field4432.method8113(var11, var12, var9.field3778, var9.field3718, var28, var29);
                            } else {
                                method4575(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3776.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3776[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3776[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3848 != null) {
                                            var35 = field662.method4053(var9.field3776[var31][var34]);
                                        }
                                        if (method2837(var9.field3776[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3848 != null && var9.field3848[var31] > field677) {
                                                break;
                                            }
                                            byte var36 = var9.field3797[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field662.method4053(86) && !field662.method4053(82) && !field662.method4053(81)) && ((var36 & 0x2) == 0 || field662.method4053(86)) && ((var36 & 0x1) == 0 || field662.method4053(82)) && ((var36 & 0x4) == 0 || field662.method4053(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method1115(var31 + 1, var9.field3701, var9.field3721, var9.field3822, "");
                                    } else if (var31 == 10) {
                                        method6348();
                                        method7366(var9.field3701, var9.field3721, class348.method3187(Statics.method6900(var9)), var9.field3822);
                                        field669 = method8259(var9);
                                        if (field669 == null) {
                                            field669 = class367.field4120;
                                        }
                                        field670 = var9.field3782 + class102.method3860(16777215);
                                    }
                                    int var37 = var9.field3780[var31];
                                    if (var9.field3848 == null) {
                                        var9.field3848 = new int[var9.field3776.length];
                                    }
                                    if (var9.field3788 == null) {
                                        var9.field3788 = new int[var9.field3776.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3848[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3848[var31] == 0) {
                                        var9.field3848[var31] = field677 + var37 + var9.field3788[var31];
                                    } else {
                                        var9.field3848[var31] = field677 + var37;
                                    }
                                }
                                if (!var32 && var9.field3848 != null) {
                                    var9.field3848[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3700) {
                            boolean var38;
                            if (class36.field231 >= var19 && class36.field239 >= var20 && class36.field231 < var21 && class36.field239 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field230 == 1 || !Statics.field320 && class36.field230 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field238 == 1 || !Statics.field320 && class36.field238 == 4) && class36.field232 >= var19 && class36.field242 >= var20 && class36.field232 < var21 && class36.field242 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method4011(var9, class36.field232 - var11, class36.field242 - var12);
                            }
                            if (var9.method6097()) {
                                if (var40) {
                                    field717.method6666(new class226(0, class36.field231 - var11, class36.field239 - var12, var9));
                                }
                                if (var39) {
                                    field717.method6666(new class226(1, class36.field231 - var11, class36.field239 - var12, var9));
                                }
                            }
                            if (var9.field3706 == 1400) {
                                Statics.field4432.method8063(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field683 != null && field683 != var9 && var38 && class348.method4876(Statics.method6900(var9))) {
                                field687 = var9;
                            }
                            if (field684 == var9) {
                                field740 = true;
                                field689 = var11;
                                field690 = var12;
                            }
                            if (var9.field3809) {
                                if (var38 && field712 != 0 && var9.field3772 != null) {
                                    class88 var41 = new class88();
                                    var41.field1057 = true;
                                    var41.field1058 = var9;
                                    var41.field1059 = field712;
                                    var41.field1067 = var9.field3772;
                                    field714.method6666(var41);
                                }
                                if (field683 != null || field647) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3841 && var40) {
                                    var9.field3841 = true;
                                    if (var9.field3791 != null) {
                                        class88 var42 = new class88();
                                        var42.field1057 = true;
                                        var42.field1058 = var9;
                                        var42.field1056 = class36.field232 - var11;
                                        var42.field1059 = class36.field242 - var12;
                                        var42.field1067 = var9.field3791;
                                        field714.method6666(var42);
                                    }
                                }
                                if (var9.field3841 && var39 && var9.field3792 != null) {
                                    class88 var43 = new class88();
                                    var43.field1057 = true;
                                    var43.field1058 = var9;
                                    var43.field1056 = class36.field231 - var11;
                                    var43.field1059 = class36.field239 - var12;
                                    var43.field1067 = var9.field3792;
                                    field714.method6666(var43);
                                }
                                if (var9.field3841 && !var39) {
                                    var9.field3841 = false;
                                    if (var9.field3793 != null) {
                                        class88 var44 = new class88();
                                        var44.field1057 = true;
                                        var44.field1058 = var9;
                                        var44.field1056 = class36.field231 - var11;
                                        var44.field1059 = class36.field239 - var12;
                                        var44.field1067 = var9.field3793;
                                        field716.method6666(var44);
                                    }
                                }
                                if (var39 && var9.field3794 != null) {
                                    class88 var45 = new class88();
                                    var45.field1057 = true;
                                    var45.field1058 = var9;
                                    var45.field1056 = class36.field231 - var11;
                                    var45.field1059 = class36.field239 - var12;
                                    var45.field1067 = var9.field3794;
                                    field714.method6666(var45);
                                }
                                if (!var9.field3723 && var38) {
                                    var9.field3723 = true;
                                    if (var9.field3737 != null) {
                                        class88 var46 = new class88();
                                        var46.field1057 = true;
                                        var46.field1058 = var9;
                                        var46.field1056 = class36.field231 - var11;
                                        var46.field1059 = class36.field239 - var12;
                                        var46.field1067 = var9.field3737;
                                        field714.method6666(var46);
                                    }
                                }
                                if (var9.field3723 && var38 && var9.field3796 != null) {
                                    class88 var47 = new class88();
                                    var47.field1057 = true;
                                    var47.field1058 = var9;
                                    var47.field1056 = class36.field231 - var11;
                                    var47.field1059 = class36.field239 - var12;
                                    var47.field1067 = var9.field3796;
                                    field714.method6666(var47);
                                }
                                if (var9.field3723 && !var38) {
                                    var9.field3723 = false;
                                    if (var9.field3750 != null) {
                                        class88 var48 = new class88();
                                        var48.field1057 = true;
                                        var48.field1058 = var9;
                                        var48.field1056 = class36.field231 - var11;
                                        var48.field1059 = class36.field239 - var12;
                                        var48.field1067 = var9.field3750;
                                        field716.method6666(var48);
                                    }
                                }
                                if (var9.field3808 != null) {
                                    class88 var49 = new class88();
                                    var49.field1058 = var9;
                                    var49.field1067 = var9.field3808;
                                    field632.method6666(var49);
                                }
                                if (var9.field3789 != null && field697 > var9.field3843) {
                                    if (var9.field3823 == null || field697 - var9.field3843 > 32) {
                                        class88 var54 = new class88();
                                        var54.field1058 = var9;
                                        var54.field1067 = var9.field3789;
                                        field714.method6666(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3843; var50 < field697; var50++) {
                                            int var51 = field498[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3823.length; var52++) {
                                                if (var9.field3823[var52] == var51) {
                                                    class88 var53 = new class88();
                                                    var53.field1058 = var9;
                                                    var53.field1067 = var9.field3789;
                                                    field714.method6666(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3843 = field697;
                                }
                                if (var9.field3804 != null && field778 > var9.field3844) {
                                    if (var9.field3805 == null || field778 - var9.field3844 > 32) {
                                        class88 var59 = new class88();
                                        var59.field1058 = var9;
                                        var59.field1067 = var9.field3804;
                                        field714.method6666(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3844; var55 < field778; var55++) {
                                            int var56 = field698[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3805.length; var57++) {
                                                if (var9.field3805[var57] == var56) {
                                                    class88 var58 = new class88();
                                                    var58.field1058 = var9;
                                                    var58.field1067 = var9.field3804;
                                                    field714.method6666(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3844 = field778;
                                }
                                if (var9.field3806 != null && field666 > var9.field3845) {
                                    if (var9.field3807 == null || field666 - var9.field3845 > 32) {
                                        class88 var64 = new class88();
                                        var64.field1058 = var9;
                                        var64.field1067 = var9.field3806;
                                        field714.method6666(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3845; var60 < field666; var60++) {
                                            int var61 = field552[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3807.length; var62++) {
                                                if (var9.field3807[var62] == var61) {
                                                    class88 var63 = new class88();
                                                    var63.field1058 = var9;
                                                    var63.field1067 = var9.field3806;
                                                    field714.method6666(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3845 = field666;
                                }
                                if (field704 > var9.field3837 && var9.field3708 != null) {
                                    class88 var65 = new class88();
                                    var65.field1058 = var9;
                                    var65.field1067 = var9.field3708;
                                    field714.method6666(var65);
                                }
                                if (field705 > var9.field3837 && var9.field3816 != null) {
                                    class88 var66 = new class88();
                                    var66.field1058 = var9;
                                    var66.field1067 = var9.field3816;
                                    field714.method6666(var66);
                                }
                                if (field706 > var9.field3837 && var9.field3790 != null) {
                                    class88 var67 = new class88();
                                    var67.field1058 = var9;
                                    var67.field1067 = var9.field3790;
                                    field714.method6666(var67);
                                }
                                if (field707 > var9.field3837 && var9.field3818 != null) {
                                    class88 var68 = new class88();
                                    var68.field1058 = var9;
                                    var68.field1067 = var9.field3818;
                                    field714.method6666(var68);
                                }
                                if (field708 > var9.field3837 && var9.field3819 != null) {
                                    class88 var69 = new class88();
                                    var69.field1058 = var9;
                                    var69.field1067 = var9.field3819;
                                    field714.method6666(var69);
                                }
                                if (field591 > var9.field3837 && var9.field3824 != null) {
                                    class88 var70 = new class88();
                                    var70.field1058 = var9;
                                    var70.field1067 = var9.field3824;
                                    field714.method6666(var70);
                                }
                                if (field710 > var9.field3837 && var9.field3825 != null) {
                                    class88 var71 = new class88();
                                    var71.field1058 = var9;
                                    var71.field1067 = var9.field3825;
                                    field714.method6666(var71);
                                }
                                if (field593 > var9.field3837 && var9.field3820 != null) {
                                    class88 var72 = new class88();
                                    var72.field1058 = var9;
                                    var72.field1067 = var9.field3820;
                                    field714.method6666(var72);
                                }
                                var9.field3837 = field695;
                                if (var9.field3758 != null) {
                                    for (int var73 = 0; var73 < field739; var73++) {
                                        class88 var74 = new class88();
                                        var74.field1058 = var9;
                                        var74.field1060 = field560[var73];
                                        var74.field1064 = field618[var73];
                                        var74.field1067 = var9.field3758;
                                        field714.method6666(var74);
                                    }
                                }
                                if (var9.field3814 != null) {
                                    int[] var75 = field662.method4055();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class88 var77 = new class88();
                                        var77.field1058 = var9;
                                        var77.field1060 = var75[var76];
                                        var77.field1067 = var9.field3814;
                                        field714.method6666(var77);
                                    }
                                }
                                if (var9.field3815 != null) {
                                    int[] var78 = field662.method4056();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class88 var80 = new class88();
                                        var80.field1058 = var9;
                                        var80.field1060 = var78[var79];
                                        var80.field1067 = var9.field3815;
                                        field714.method6666(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3700) {
                            if (field683 != null || field647) {
                                continue;
                            }
                            if ((var9.field3830 >= 0 || var9.field3779 != 0) && class36.field231 >= var19 && class36.field239 >= var20 && class36.field231 < var21 && class36.field239 < var22) {
                                if (var9.field3830 >= 0) {
                                    Statics.field4657 = arg0[var9.field3830];
                                } else {
                                    Statics.field4657 = var9;
                                }
                            }
                            if (var9.field3799 == 8 && class36.field231 >= var19 && class36.field239 >= var20 && class36.field231 < var21 && class36.field239 < var22) {
                                Statics.field2288 = var9;
                            }
                            if (var9.field3709 > var9.field3718) {
                                Statics.method7428(var9, var9.field3778 + var11, var12, var9.field3718, var9.field3709, class36.field231, class36.field239);
                            }
                        }
                        if (var9.field3799 == 0) {
                            method4464(arg0, var9.field3701, var19, var20, var21, var22, var11 - var9.field3795, var12 - var9.field3724);
                            if (var9.field3839 != null) {
                                method4464(var9.field3839, var9.field3701, var19, var20, var21, var22, var11 - var9.field3795, var12 - var9.field3724);
                            }
                            class87 var81 = (class87) field655.method8301((long) var9.field3701);
                            if (var81 != null) {
                                if (var81.field1050 == 0 && class36.field231 >= var19 && class36.field239 >= var20 && class36.field231 < var21 && class36.field239 < var22 && !field647) {
                                    for (class88 var82 = (class88) field714.method6670(); var82 != null; var82 = (class88) field714.method6665()) {
                                        if (var82.field1057) {
                                            var82.method7988();
                                            var82.field1058.field3723 = false;
                                        }
                                    }
                                    if (Statics.field39 == 0) {
                                        field683 = null;
                                        field684 = null;
                                    }
                                    if (!field647) {
                                        method6322();
                                    }
                                }
                                method424(var81.field1052, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eh.nn(II)Z")
    public static boolean method2837(int arg0) {
        for (int var1 = 0; var1 < field739; var1++) {
            if (field560[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ki.nu(IIB)V")
    public static final void method4647(int arg0, int arg1) {
        if (Statics.field4415.method5751(arg0)) {
            method4167(Statics.field4415.field3611[arg0], arg1);
        }
    }

    @ObfuscatedName("ir.na([Lnn;IS)V")
    public static final void method4167(class347[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class347 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3799 == 0) {
                    if (var3.field3839 != null) {
                        method4167(var3.field3839, arg1);
                    }
                    class87 var4 = (class87) field655.method8301((long) var3.field3701);
                    if (var4 != null) {
                        method4647(var4.field1052, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3766 != null) {
                    class88 var5 = new class88();
                    var5.field1058 = var3;
                    var5.field1067 = var3.field3766;
                    class71.method4538(var5);
                }
                if (arg1 == 1 && var3.field3739 != null) {
                    if (var3.field3721 >= 0) {
                        class347 var6 = Statics.field4415.method5742(var3.field3701);
                        if (var6 == null || var6.field3839 == null || var3.field3721 >= var6.field3839.length || var6.field3839[var3.field3721] != var3) {
                            continue;
                        }
                    }
                    class88 var7 = new class88();
                    var7.field1058 = var3;
                    var7.field1067 = var3.field3739;
                    class71.method4538(var7);
                }
            }
        }
    }

    @ObfuscatedName("ik.nq(Lnn;III)V")
    public static final void method4011(class347 arg0, int arg1, int arg2) {
        if (field683 != null || field647 || arg0 == null) {
            return;
        }
        class347 var3 = method7971(arg0);
        if (var3 == null) {
            var3 = arg0.field3726;
        }
        if (var3 == null) {
            return;
        }
        field683 = arg0;
        class347 var5 = method7971(arg0);
        if (var5 == null) {
            var5 = arg0.field3726;
        }
        field684 = var5;
        field685 = arg1;
        field686 = arg2;
        Statics.field39 = 0;
        field694 = false;
        int var7 = field648 - 1;
        if (var7 != -1) {
            method850(var7);
        }
        return;
    }

    @ObfuscatedName("client.nt(B)V")
    public final void method1217() {
        Statics.method5074(field683);
        Statics.field39++;
        if (field715 && field740) {
            int var1 = class36.field231;
            int var2 = class36.field239;
            int var3 = var1 - field685;
            int var4 = var2 - field686;
            if (var3 < field689) {
                var3 = field689;
            }
            if (field683.field3778 + var3 > field689 + field684.field3778) {
                var3 = field689 + field684.field3778 - field683.field3778;
            }
            if (var4 < field690) {
                var4 = field690;
            }
            if (field683.field3718 + var4 > field690 + field684.field3718) {
                var4 = field690 + field684.field3718 - field683.field3718;
            }
            int var5 = var3 - field720;
            int var6 = var4 - field693;
            int var7 = field683.field3785;
            if (Statics.field39 > field683.field3749 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field694 = true;
            }
            int var8 = field684.field3795 + (var3 - field689);
            int var9 = field684.field3724 + (var4 - field690);
            if (field683.field3798 != null && field694) {
                class88 var10 = new class88();
                var10.field1058 = field683;
                var10.field1056 = var8;
                var10.field1059 = var9;
                var10.field1067 = field683.field3798;
                class71.method4538(var10);
            }
            if (class36.field230 == 0) {
                if (field694) {
                    if (field683.field3781 != null) {
                        class88 var11 = new class88();
                        var11.field1058 = field683;
                        var11.field1056 = var8;
                        var11.field1059 = var9;
                        var11.field1062 = field687;
                        var11.field1067 = field683.field3781;
                        class71.method4538(var11);
                    }
                    if (field687 != null && method7971(field683) != null) {
                        class311 var12 = class311.method7979(class309.field3251, field561.field1404);
                        var12.field3279.method8611(field687.field3701);
                        var12.field3279.method8601(field683.field3822);
                        var12.field3279.method8737(field687.field3721);
                        var12.field3279.method8547(field683.field3701);
                        var12.field3279.method8601(field687.field3822);
                        var12.field3279.method8601(field683.field3721);
                        field561.method2736(var12);
                    }
                } else if (this.method1667()) {
                    this.method1214(field720 + field685, field693 + field686);
                } else if (field648 > 0) {
                    int var13 = field720 + field685;
                    int var14 = field693 + field686;
                    class74 var15 = Statics.field901;
                    if (var15 != null) {
                        method456(var15.field889, var15.field894, var15.field888, var15.field890, var15.field887, var15.field891, var15.field892, var13, var14);
                    }
                    Statics.field901 = null;
                }
                field683 = null;
            }
        } else if (Statics.field39 > 1) {
            if (!field694 && field648 > 0) {
                int var16 = field720 + field685;
                int var17 = field693 + field686;
                class74 var18 = Statics.field901;
                if (var18 != null) {
                    method456(var18.field889, var18.field894, var18.field888, var18.field890, var18.field887, var18.field891, var18.field892, var16, var17);
                }
                Statics.field901 = null;
            }
            field683 = null;
        }
    }

    @ObfuscatedName("bw.nv(II)V")
    public static void method850(int arg0) {
        Statics.field901 = new class74();
        Statics.field901.field889 = field649[arg0];
        Statics.field901.field894 = field650[arg0];
        Statics.field901.field888 = field651[arg0];
        Statics.field901.field890 = field652[arg0];
        Statics.field901.field887 = field688[arg0];
        Statics.field901.field891 = field771[arg0];
        Statics.field901.field892 = field795[arg0];
    }

    @ObfuscatedName("lo.ne(I)V")
    public static void method5413() {
        for (class87 var0 = (class87) field655.method8304(); var0 != null; var0 = (class87) field655.method8302()) {
            int var1 = var0.field1052;
            if (Statics.field4415.method5751(var1)) {
                boolean var2 = true;
                class347[] var3 = Statics.field4415.field3611[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3700;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4889;
                    class347 var6 = Statics.field4415.method5742(var5);
                    if (var6 != null) {
                        Statics.method5074(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("rf.ng(II)V")
    public static final void method7707(int arg0) {
        if (!Statics.field4415.method5751(arg0)) {
            return;
        }
        class347[] var1 = Statics.field4415.field3611[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class347 var3 = var1[var2];
            if (var3 != null) {
                var3.field3745 = 0;
                var3.field3838 = 0;
            }
        }
    }

    @ObfuscatedName("pf.nx(IB)V")
    public static final void method6852(int arg0) {
        if (Statics.field4415.method5751(arg0)) {
            method3224(Statics.field4415.field3611[arg0], -1);
        }
    }

    @ObfuscatedName("gb.ny([Lnn;IB)V")
    public static final void method3224(class347[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class347 var3 = arg0[var2];
            if (var3 != null && var3.field3812 == arg1 && (!var3.field3700 || !Statics.method1126(var3))) {
                if (var3.field3799 == 0) {
                    if (!var3.field3700 && Statics.method1126(var3) && Statics.field4657 != var3) {
                        continue;
                    }
                    method3224(arg0, var3.field3701);
                    if (var3.field3839 != null) {
                        method3224(var3.field3839, var3.field3701);
                    }
                    class87 var4 = (class87) field655.method8301((long) var3.field3701);
                    if (var4 != null) {
                        method6852(var4.field1052);
                    }
                }
                if (var3.field3799 == 6) {
                    if (var3.field3783 != -1 || var3.field3704 != -1) {
                        boolean var5 = method6080(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3704;
                        } else {
                            var6 = var3.field3783;
                        }
                        if (var6 != -1) {
                            class205 var7 = class205.method73(var6);
                            if (var7.method3760()) {
                                var3.field3745 += field577;
                                int var8 = var7.method3784();
                                if (var3.field3745 >= var8) {
                                    var3.field3745 -= var7.field2238;
                                    if (var3.field3745 < 0 || var3.field3745 >= var8) {
                                        var3.field3745 = 0;
                                    }
                                }
                                Statics.method5074(var3);
                            } else {
                                var3.field3838 += field577;
                                while (var3.field3838 > var7.field2234[var3.field3745]) {
                                    var3.field3838 -= var7.field2234[var3.field3745];
                                    var3.field3745++;
                                    if (var3.field3745 >= var7.field2222.length) {
                                        var3.field3745 -= var7.field2238;
                                        if (var3.field3745 < 0 || var3.field3745 >= var7.field2222.length) {
                                            var3.field3745 = 0;
                                        }
                                    }
                                    Statics.method5074(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3759 != 0 && !var3.field3700) {
                        int var9 = var3.field3759 >> 16;
                        int var10 = var3.field3759 << 16 >> 16;
                        int var11 = field577 * var9;
                        int var12 = field577 * var10;
                        var3.field3754 = var3.field3754 + var11 & 0x7FF;
                        var3.field3755 = var3.field3755 + var12 & 0x7FF;
                        Statics.method5074(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("nc.ni(II)V")
    public static final void method6286(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method5609((double) var3);
    }

    @ObfuscatedName("dw.nf(I)I")
    public static final int method2287() {
        float var0 = 200.0F * ((float) Statics.field1155.method2447() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("mk.no(D)V")
    public static final void method5609(double arg0) {
        class270.method4794(arg0);
        ((class280) class270.field2810.field3095).method5087(arg0);
        class203.field2151.method5403();
        Statics.field1155.method2443(arg0);
    }

    @ObfuscatedName("pf.nk(IB)V")
    public static final void method6847(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field1155.method2496()) {
            return;
        }
        label50: {
            if (Statics.field1155.method2496() == 0) {
                boolean var2 = !class320.field3467.isEmpty();
                if (var2) {
                    class320.method4026(Statics.field2588, var1);
                    field676 = false;
                    break label50;
                }
            }
            if (var1 == 0) {
                class320.method2387(0, 0);
                field676 = false;
            } else if (!class320.field3460.isEmpty()) {
                Iterator var3 = class320.field3460.iterator();
                while (var3.hasNext()) {
                    class332 var4 = (class332) var3.next();
                    if (var4 != null) {
                        var4.field3578 = var1;
                    }
                }
                class332 var5 = (class332) class320.field3460.get(0);
                if (var5 != null && var5.field3583 != null && var5.field3583.method5511() && !var5.field3581) {
                    var5.field3583.method5503(var1);
                    var5.field3577 = (float) var1;
                }
            }
        }
        Statics.field1155.method2527(var1);
    }

    @ObfuscatedName("ac.nb(II)V")
    public static final void method322(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1155.method2446(var1);
    }

    @ObfuscatedName("gv.nd(II)V")
    public static final void method3217(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1155.method2438(var1);
    }

    @ObfuscatedName("fi.nw(II)V")
    public static final void method3017(int arg0) {
        method5413();
        class70.method3198();
        int var1 = class176.method2945(arg0).field1830;
        if (var1 == 0) {
            return;
        }
        int var2 = class336.field3598[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method5609(0.9D);
            }
            if (var2 == 2) {
                method5609(0.8D);
            }
            if (var2 == 3) {
                method5609(0.7D);
            }
            if (var2 == 4) {
                method5609(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method6847(255);
            }
            if (var2 == 1) {
                method6847(192);
            }
            if (var2 == 2) {
                method6847(128);
            }
            if (var2 == 3) {
                method6847(64);
            }
            if (var2 == 4) {
                method6847(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method322(127);
            }
            if (var2 == 1) {
                method322(96);
            }
            if (var2 == 2) {
                method322(64);
            }
            if (var2 == 3) {
                method322(32);
            }
            if (var2 == 4) {
                method322(0);
            }
        }
        if (var1 == 5) {
            field646 = var2 == 1;
        }
        if (var1 == 6) {
            field675 = var2;
        }
        if (var1 == 9) {
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method3217(127);
            }
            if (var2 == 1) {
                method3217(96);
            }
            if (var2 == 2) {
                method3217(64);
            }
            if (var2 == 3) {
                method3217(32);
            }
            if (var2 == 4) {
                method3217(0);
            }
        }
        if (var1 == 17) {
            field554 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field798 = (class104) class389.method6514(class104.method3104(), var2);
            if (field798 == null) {
                field798 = class104.field1328;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field637 = -1;
            } else {
                field637 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field527 = (class104) class389.method6514(class104.method3104(), var2);
            if (field527 == null) {
                field527 = class104.field1328;
            }
        }
    }

    @ObfuscatedName("mp.og(Lnn;I)V")
    public static final void method5673(class347 arg0) {
        int var1 = arg0.field3706;
        if (var1 == 324) {
            if (field737 == -1) {
                field737 = arg0.field3727;
                field788 = arg0.field3803;
            }
            if (field621.field3641 == 1) {
                arg0.field3727 = field737;
            } else {
                arg0.field3727 = field788;
            }
        } else if (var1 == 325) {
            if (field737 == -1) {
                field737 = arg0.field3727;
                field788 = arg0.field3803;
            }
            if (field621.field3641 == 1) {
                arg0.field3727 = field788;
            } else {
                arg0.field3727 = field737;
            }
        } else if (var1 == 327) {
            arg0.field3754 = 150;
            arg0.field3755 = (int) (Math.sin((double) field677 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3746 = 5;
            arg0.field3747 = 0;
        } else if (var1 == 328) {
            arg0.field3754 = 150;
            arg0.field3755 = (int) (Math.sin((double) field677 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3746 = 5;
            arg0.field3747 = 1;
        }
    }

    @ObfuscatedName("be.ox(I)V")
    public static final void method884() {
        class311 var0 = class311.method7979(class309.field3219, field561.field1404);
        field561.method2736(var0);
        class71.field859 = true;
        for (class87 var1 = (class87) field655.method8304(); var1 != null; var1 = (class87) field655.method8302()) {
            if (var1.field1050 == 0 || var1.field1050 == 3) {
                method6317(var1, true);
            }
        }
        if (field522 != null) {
            Statics.method5074(field522);
            field522 = null;
        }
        class71.field859 = false;
    }

    @ObfuscatedName("fp.oy(IIIB)Ldj;")
    public static final class87 method3186(int arg0, int arg1, int arg2) {
        class87 var3 = new class87();
        var3.field1052 = arg1;
        var3.field1050 = arg2;
        field655.method8307(var3, (long) arg0);
        method7707(arg1);
        class347 var4 = Statics.field4415.method5742(arg0);
        Statics.method5074(var4);
        if (field522 != null) {
            Statics.method5074(field522);
            field522 = null;
        }
        method213(Statics.field4415.field3611[arg0 >> 16], var4, false);
        class71.method3513(arg1);
        if (field671 != -1) {
            method4647(field671, 1);
        }
        return var3;
    }

    @ObfuscatedName("nw.oc(Ldj;ZI)V")
    public static final void method6317(class87 arg0, boolean arg1) {
        int var2 = arg0.field1052;
        int var3 = (int) arg0.field4889;
        arg0.method7988();
        if (arg1) {
            Statics.field4415.method5740(var2);
        }
        method885(var2);
        class347 var4 = Statics.field4415.method5742(var3);
        if (var4 != null) {
            Statics.method5074(var4);
        }
        if (field671 != -1) {
            method4647(field671, 1);
        }
    }

    @ObfuscatedName("mu.os(Lnn;I)Z")
    public static final boolean method5732(class347 arg0) {
        int var1 = arg0.field3706;
        if (var1 == 205) {
            field563 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field621.method5774(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field621.method5782(var4, var5 == 1);
        }
        if (var1 == 324) {
            field621.method5780(0);
        }
        if (var1 == 325) {
            field621.method5780(1);
        }
        if (var1 == 326) {
            class311 var6 = class311.method7979(class309.field3201, field561.field1404);
            field621.method5772(var6.field3279);
            field561.method2736(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("em.ok(Lnn;IIII)V")
    public static final void method2788(class347 arg0, int arg1, int arg2, int arg3) {
        method4569();
        class335 var4 = arg0.method6139(Statics.field4415, false);
        if (var4 == null) {
            return;
        }
        class541.method8876(arg1, arg2, var4.field3594 + arg1, var4.field3593 + arg2);
        if (field752 == 2 || field752 == 5) {
            class541.method8896(arg1, arg2, 0, var4.field3595, var4.field3592);
        } else {
            int var5 = field580 & 0x7FF;
            int var6 = Statics.field133.field1232 / 32 + 48;
            int var7 = 464 - Statics.field133.field1173 / 32;
            Statics.field4876.method9015(arg1, arg2, var4.field3594, var4.field3593, var6, var7, var5, 256, var4.field3595, var4.field3592);
            for (int var8 = 0; var8 < field640; var8++) {
                int var9 = field800[var8] * 4 + 2 - Statics.field133.field1232 / 32;
                int var10 = field748[var8] * 4 + 2 - Statics.field133.field1173 / 32;
                method2641(arg1, arg2, var9, var10, field749[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class394 var13 = field644[Statics.field1428][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field133.field1232 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field133.field1173 / 32;
                        method2641(arg1, arg2, var14, var15, Statics.field1635[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field558; var16++) {
                class101 var17 = field557[field559[var16]];
                if (var17 != null && var17.method2307()) {
                    class189 var18 = var17.field1300;
                    if (var18 != null && var18.field1984 != null) {
                        var18 = var18.method3459();
                    }
                    if (var18 != null && var18.field1946 && var18.field1987) {
                        int var19 = var17.field1232 / 32 - Statics.field133.field1232 / 32;
                        int var20 = var17.field1173 / 32 - Statics.field133.field1173 / 32;
                        method2641(arg1, arg2, var19, var20, Statics.field1635[1], var4);
                    }
                }
            }
            int var21 = class108.field1351;
            int[] var22 = class108.field1357;
            for (int var23 = 0; var23 < var21; var23++) {
                class92 var24 = field738[var22[var23]];
                if (var24 != null && var24.method2307() && !var24.field1119 && Statics.field133 != var24) {
                    int var25 = var24.field1232 / 32 - Statics.field133.field1232 / 32;
                    int var26 = var24.field1173 / 32 - Statics.field133.field1173 / 32;
                    if (var24.method2294()) {
                        method2641(arg1, arg2, var25, var26, Statics.field1635[3], var4);
                    } else if (Statics.field133.field1118 != 0 && var24.field1118 != 0 && Statics.field133.field1118 == var24.field1118) {
                        method2641(arg1, arg2, var25, var26, Statics.field1635[4], var4);
                    } else if (var24.method2297()) {
                        method2641(arg1, arg2, var25, var26, Statics.field1635[5], var4);
                    } else if (var24.method2331()) {
                        method2641(arg1, arg2, var25, var26, Statics.field1635[6], var4);
                    } else {
                        method2641(arg1, arg2, var25, var26, Statics.field1635[2], var4);
                    }
                }
            }
            if (field514 != 0 && field677 % 20 < 10) {
                if (field514 == 1 && field509 >= 0 && field509 < field557.length) {
                    class101 var27 = field557[field509];
                    if (var27 != null) {
                        int var28 = var27.field1232 / 32 - Statics.field133.field1232 / 32;
                        int var29 = var27.field1173 / 32 - Statics.field133.field1173 / 32;
                        method5759(arg1, arg2, var28, var29, Statics.field3974[1], var4);
                    }
                }
                if (field514 == 2) {
                    int var30 = field526 * 4 - Statics.field1900 * 4 + 2 - Statics.field133.field1232 / 32;
                    int var31 = field614 * 4 - Statics.field2683 * 4 + 2 - Statics.field133.field1173 / 32;
                    method5759(arg1, arg2, var30, var31, Statics.field3974[1], var4);
                }
                if (field514 == 10 && field520 >= 0 && field520 < field738.length) {
                    class92 var32 = field738[field520];
                    if (var32 != null) {
                        int var33 = var32.field1232 / 32 - Statics.field133.field1232 / 32;
                        int var34 = var32.field1173 / 32 - Statics.field133.field1173 / 32;
                        method5759(arg1, arg2, var33, var34, Statics.field3974[1], var4);
                    }
                }
            }
            if (field750 != 0) {
                int var35 = field750 * 4 + 2 - Statics.field133.field1232 / 32;
                int var36 = field571 * 4 + 2 - Statics.field133.field1173 / 32;
                method2641(arg1, arg2, var35, var36, Statics.field3974[0], var4);
            }
            if (!Statics.field133.field1119) {
                class541.method8884(var4.field3594 / 2 + arg1 - 1, var4.field3593 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field664[arg3] = true;
    }

    @ObfuscatedName("ns.ot(IIIILuc;Lmq;I)V")
    public static final void method5759(int arg0, int arg1, int arg2, int arg3, class545 arg4, class335 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2641(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field580 & 0x7FF;
        int var8 = class270.field2803[var7];
        int var9 = class270.field2808[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3594 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1667.method9013(arg5.field3594 / 2 + arg0 - var17 / 2 + var15, arg5.field3593 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("el.oz(IIIILuc;Lmq;B)V")
    public static final void method2641(int arg0, int arg1, int arg2, int arg3, class545 arg4, class335 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field580 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class270.field2803[var6];
        int var9 = class270.field2808[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method9068(arg5.field3594 / 2 + var10 - arg4.field5275 / 2, arg5.field3593 / 2 - var11 - arg4.field5279 / 2, arg0, arg1, arg5.field3594, arg5.field3593, arg5.field3595, arg5.field3592);
        } else {
            arg4.method8995(arg5.field3594 / 2 + arg0 + var10 - arg4.field5275 / 2, arg5.field3593 / 2 + arg1 - var11 - arg4.field5279 / 2);
        }
    }

    @ObfuscatedName("kt.oi(I)V")
    public static final void method5083() {
        for (int var0 = 0; var0 < class108.field1351; var0++) {
            class92 var1 = field738[class108.field1357[var0]];
            var1.method2293();
        }
        class111.method2795();
        if (Statics.field1292 != null) {
            Statics.field1292.method7489();
        }
    }

    @ObfuscatedName("mm.ow(I)V")
    public static final void method5717() {
        class111.method5428();
        if (Statics.field1292 != null) {
            Statics.field1292.method7490();
        }
    }

    @ObfuscatedName("ax.or(I)V")
    public static final void method171() {
        field705 = field695;
    }

    @ObfuscatedName("ew.on(B)V")
    public static final void method2731() {
        field707 = field695;
        Statics.field1833 = true;
    }

    @ObfuscatedName("gv.ou(Ljava/lang/String;I)V")
    public static final void method3216(String arg0) {
        if (Statics.field1292 != null) {
            class311 var1 = class311.method7979(class309.field3220, field561.field1404);
            var1.field3279.method8699(class531.method4114(arg0));
            var1.field3279.method8551(arg0);
            field561.method2736(var1);
        }
    }

    @ObfuscatedName("aa.op(Ljava/lang/String;I)V")
    public static final void method66(String arg0) {
        if (!arg0.equals("")) {
            class311 var1 = class311.method7979(class309.field3218, field561.field1404);
            var1.field3279.method8699(class531.method4114(arg0));
            var1.field3279.method8551(arg0);
            field561.method2736(var1);
        }
    }

    @ObfuscatedName("client.oa(B)V")
    public static final void method1757() {
        class311 var0 = class311.method7979(class309.field3218, field561.field1404);
        var0.field3279.method8699(0);
        field561.method2736(var0);
    }

    @ObfuscatedName("is.oe(III)V")
    public static final void method3936(int arg0, int arg1) {
        class164 var2 = arg0 >= 0 ? field744[arg0] : Statics.field1443;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3203()) {
            return;
        }
        class146 var3 = (class146) var2.field1761.get(arg1);
        if (var3.field1642 != -1) {
            return;
        }
        String var4 = var3.field1644.method9164();
        class311 var5 = class311.method7979(class309.field3190, field561.field1404);
        var5.field3279.method8699(3 + class531.method4114(var4));
        var5.field3279.method8699(arg0);
        var5.field3279.method8737(arg1);
        var5.field3279.method8551(var4);
        field561.method2736(var5);
    }

    @ObfuscatedName("tq.om(III)V")
    public static final void method8438(int arg0, int arg1) {
        if (field744[arg0] == null || arg1 < 0 || arg1 >= field744[arg0].method3203()) {
            return;
        }
        class146 var2 = (class146) field744[arg0].field1761.get(arg1);
        if (var2.field1642 != -1) {
            return;
        }
        class311 var3 = class311.method7979(class309.field3224, field561.field1404);
        var3.field3279.method8699(3 + class531.method4114(var2.field1644.method9164()));
        var3.field3279.method8699(arg0);
        var3.field3279.method8737(arg1);
        var3.field3279.method8551(var2.field1644.method9164());
        field561.method2736(var3);
    }

    @ObfuscatedName("aa.oo(IIZI)V")
    public static final void method65(int arg0, int arg1, boolean arg2) {
        if (field744[arg0] == null || arg1 < 0 || arg1 >= field744[arg0].method3203()) {
            return;
        }
        class146 var3 = (class146) field744[arg0].field1761.get(arg1);
        class311 var4 = class311.method7979(class309.field3232, field561.field1404);
        var4.field3279.method8699(4 + class531.method4114(var3.field1644.method9164()));
        var4.field3279.method8699(arg0);
        var4.field3279.method8737(arg1);
        var4.field3279.method8565(arg2);
        var4.field3279.method8551(var3.field1644.method9164());
        field561.method2736(var4);
    }

    @ObfuscatedName("be.ob(II)V")
    public static void method885(int arg0) {
        for (class488 var1 = (class488) field718.method8304(); var1 != null; var1 = (class488) field718.method8302()) {
            if ((var1.field4889 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method7988();
            }
        }
    }

    @ObfuscatedName("sx.oj(Lnn;B)Lnn;")
    public static class347 method7971(class347 arg0) {
        int var1 = class348.method731(Statics.method6900(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = Statics.field4415.method5742(arg0.field3812);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("do.oh(Lnn;IB)Ljava/lang/String;")
    public static String method2395(class347 arg0, int arg1) {
        int var2 = Statics.method6900(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3811 == null) {
            return null;
        } else if (arg0.field3751 == null || arg0.field3751.length <= arg1 || arg0.field3751[arg1] == null || arg0.field3751[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3751[arg1];
        }
    }

    @ObfuscatedName("ti.ov(Lnn;I)Ljava/lang/String;")
    public static String method8259(class347 arg0) {
        if (class348.method3187(Statics.method6900(arg0)) == 0) {
            return null;
        } else if (arg0.field3744 == null || arg0.field3744.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3744;
        }
    }

    @ObfuscatedName("db.ol(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2283(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field638 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field638 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field638 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field638 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field638 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4609 != null) {
            var3 = "/p=" + Statics.field4609;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1147 + "/a=" + Statics.field2468 + var3 + "/";
    }

    @ObfuscatedName("mu.pr(Ljava/lang/String;B)V")
    public static void method5737(String arg0) {
        Statics.field4609 = arg0;
        try {
            String var1 = Statics.field3067.getParameter(Integer.toString(18));
            String var2 = Statics.field3067.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class350.method3338(Statics.method2852() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class27.method385(Statics.field3067, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("dy.pg(Ljava/lang/String;ZB)V")
    public static void method2626(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3063; var5++) {
            class203 var6 = class203.method5762(var5);
            if ((!arg1 || var6.field2192) && var6.field2170 == -1 && var6.field2155.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field167 = -1;
                    Statics.field3445 = null;
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
        Statics.field3445 = var3;
        Statics.field80 = 0;
        Statics.field167 = var4;
        String[] var9 = new String[Statics.field167];
        for (int var10 = 0; var10 < Statics.field167; var10++) {
            var9[var10] = class203.method5762(var3[var10]).field2155;
        }
        short[] var11 = Statics.field3445;
        class526.method3070(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("ev.py(Luk;II)V")
    public static void method2707(class531 arg0, int arg1) {
        byte[] var2 = arg0.field5178;
        if (field700 == null) {
            field700 = new byte[24];
        }
        class426.method7283(var2, arg1, field700, 0, 24);
        if (class213.field2313 == null) {
            return;
        }
        try {
            class213.field2313.method8376(0L);
            class213.field2313.method8381(arg0.field5178, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("ad.pu(Luk;I)V")
    public static void method165(class531 arg0) {
        if (field700 == null) {
            byte[] var1 = class213.method3014();
            arg0.method8554(var1, 0, var1.length);
        } else {
            arg0.method8554(field700, 0, field700.length);
        }
    }

    @ObfuscatedName("client.pa(I)Lvs;")
    public class554 method1591() {
        return Statics.field133 == null ? null : Statics.field133.field1117;
    }

    @ObfuscatedName("aq.ph(IIIZI)V")
    public static void method15(int arg0, int arg1, int arg2, boolean arg3) {
        class311 var4 = class311.method7979(class309.field3214, field561.field1404);
        var4.field3279.method8613(arg3 ? field801 : 0);
        var4.field3279.method8731(arg0);
        var4.field3279.method8699(arg2);
        var4.field3279.method8737(arg1);
        field561.method2736(var4);
    }

    @ObfuscatedName("bx.pj(B)Z")
    public static boolean method728() {
        return field679 >= 2;
    }

    @ObfuscatedName("ig.pq(II)V")
    public static void method4122(int arg0) {
        field630 = arg0;
    }

    @ObfuscatedName("eh.pm(I)V")
    public static void method2842() {
        field561.method2736(class311.method7979(class309.field3247, field561.field1404));
        field630 = 0;
    }

    @ObfuscatedName("ri.pk(B)V")
    public static void method7678() {
        if (field630 == 1) {
            field598 = true;
        }
    }

    @ObfuscatedName("ch.pd(B)V")
    public static void method1818() {
        if (!field598 || Statics.field133 == null) {
            return;
        }
        int var0 = Statics.field133.field1243[0];
        int var1 = Statics.field133.field1244[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field4291 = Statics.field133.field1232;
        int var2 = method293(Statics.field133.field1232, Statics.field133.field1173, Statics.field1428) - field641;
        if (var2 < Statics.field2517) {
            Statics.field2517 = var2;
        }
        Statics.field2669 = Statics.field133.field1173;
        field598 = false;
    }

    @ObfuscatedName("me.pf(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method5708(String arg0) {
        class370[] var1 = class370.method3391();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class370 var3 = var1[var2];
            if (var3.field4317 != -1 && arg0.startsWith(class102.method4121(var3.field4317))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4317).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("kh.pz(S)V")
    public static void method5277() {
        if (Statics.field3600 == null) {
            return;
        }
        field759 = field677;
        Statics.field3600.method6620();
        for (int var0 = 0; var0 < field738.length; var0++) {
            if (field738[var0] != null) {
                Statics.field3600.method6608((field738[var0].field1232 >> 7) + Statics.field1900, (field738[var0].field1173 >> 7) + Statics.field2683);
            }
        }
    }

    @ObfuscatedName("od.pt(I)Z")
    public static boolean method6597() {
        return Statics.field1155.method2504() >= field504;
    }

    @ObfuscatedName("jw.pl(I)V")
    public static void method4565() {
        Statics.field1155.method2498(field504);
    }

    @ObfuscatedName("cm.pp(B)Z")
    public static boolean method2068() {
        return field683 != null;
    }

    @ObfuscatedName("pb.pe(ZB)V")
    public static void method7261(boolean arg0) {
        field646 = arg0;
    }

    @ObfuscatedName("gq.pn(IB)Luq;")
    public static class523 method3196(int arg0) {
        class523 var1 = (class523) field793.method5400((long) arg0);
        if (var1 == null) {
            var1 = new class523(Statics.field81, class525.method4125(arg0), class525.method3927(arg0));
            field793.method5402(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("ic.pv(II)Luq;")
    public static class523 method3926(int arg0) {
        class523 var1 = (class523) field794.method5400((long) arg0);
        if (var1 == null) {
            var1 = new class523(Statics.field81, arg0);
        }
        return var1;
    }

    @ObfuscatedName("jw.px(II)V")
    public static void method4542(int arg0) {
        class205 var1 = class205.method73(arg0);
        if (var1.method3760() && class205.method4124(var1.field2228) == 2) {
            field787.add(var1.field2228);
        }
    }

    @ObfuscatedName("ik.pi(I)Lor;")
    public static class376 method4010() {
        return Statics.field1419;
    }

    @ObfuscatedName("client.pc(II)V")
    public void method1219(int arg0) {
        class311 var2 = class311.method7979(class309.field3216, field561.field1404);
        var2.field3279.method8699(arg0);
        field561.method2736(var2);
    }

    @ObfuscatedName("client.pw(II)V")
    public void method1220(int arg0) {
        class311 var2 = class311.method7979(class309.field3261, field561.field1404);
        var2.field3279.method8699(arg0);
        field561.method2736(var2);
    }
}

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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class439, OAuthApi, class323 {

    @ObfuscatedName("client.br")
    public static boolean field730 = true;

    @ObfuscatedName("client.bq")
    public static int field591 = 1;

    @ObfuscatedName("client.cf")
    public static int field485 = 0;

    @ObfuscatedName("client.cv")
    public static int field652 = 0;

    @ObfuscatedName("client.ce")
    public static boolean field487 = false;

    @ObfuscatedName("client.ci")
    public static boolean field488 = false;

    @ObfuscatedName("client.cs")
    public static int field489 = -1;

    @ObfuscatedName("client.co")
    public static int field490 = -1;

    @ObfuscatedName("client.cm")
    public static int field491 = -1;

    @ObfuscatedName("client.cn")
    public static boolean field492 = false;

    @ObfuscatedName("client.cr")
    public static int field493 = 218;

    @ObfuscatedName("client.di")
    public static int field525 = 0;

    @ObfuscatedName("client.dk")
    public static boolean field495 = false;

    @ObfuscatedName("client.ec")
    public static boolean field499 = true;

    @ObfuscatedName("client.ew")
    public static int field500 = 0;

    @ObfuscatedName("client.ex")
    public static long field486 = -1L;

    @ObfuscatedName("client.ek")
    public static int field502 = -1;

    @ObfuscatedName("client.em")
    public static int field503 = -1;

    @ObfuscatedName("client.eo")
    public static long field504 = -1L;

    @ObfuscatedName("client.ef")
    public static boolean field788 = true;

    @ObfuscatedName("client.el")
    public static int field506 = 0;

    @ObfuscatedName("client.es")
    public static int field507 = 0;

    @ObfuscatedName("client.ea")
    public static int field508 = 0;

    @ObfuscatedName("client.en")
    public static int field509 = 0;

    @ObfuscatedName("client.eh")
    public static int field510 = 0;

    @ObfuscatedName("client.ei")
    public static int field511 = 0;

    @ObfuscatedName("client.et")
    public static int field512 = 0;

    @ObfuscatedName("client.er")
    public static int field513 = 0;

    @ObfuscatedName("client.ez")
    public static int field514 = 0;

    @ObfuscatedName("client.eg")
    public static class104 field515 = class104.field1337;

    @ObfuscatedName("client.ey")
    public static class104 field653 = class104.field1337;

    @ObfuscatedName("client.ed")
    public static boolean field785 = false;

    @ObfuscatedName("client.fe")
    public static class93 field518 = class93.field1137;

    @ObfuscatedName("client.fr")
    public static int field758 = 0;

    @ObfuscatedName("client.fi")
    public static int field792 = 0;

    @ObfuscatedName("client.gp")
    public static int field521 = 0;

    @ObfuscatedName("client.gn")
    public static int field666 = 0;

    @ObfuscatedName("client.gb")
    public static int field523 = 0;

    @ObfuscatedName("client.gu")
    public static int field615 = 0;

    @ObfuscatedName("client.ga")
    public static int field676 = 0;

    @ObfuscatedName("client.gf")
    public static class125 field526 = class125.field1471;

    @ObfuscatedName("client.gx")
    public static class532 field527 = class532.field5198;

    @ObfuscatedName("client.hb")
    public String field528;

    @ObfuscatedName("client.hp")
    public class15 field529;

    @ObfuscatedName("client.hl")
    public class19 field658;

    @ObfuscatedName("client.hi")
    public OtlTokenRequester field531;

    @ObfuscatedName("client.hq")
    public Future field606;

    @ObfuscatedName("client.hf")
    public boolean field533 = false;

    @ObfuscatedName("client.hw")
    public int field546 = 0;

    @ObfuscatedName("client.hj")
    public class19 field612;

    @ObfuscatedName("client.hg")
    public RefreshAccessTokenRequester field536;

    @ObfuscatedName("client.hk")
    public Future field537;

    @ObfuscatedName("client.hc")
    public static final String field538;

    @ObfuscatedName("client.ha")
    public static final String field539;

    @ObfuscatedName("client.hn")
    public static boolean field540;

    @ObfuscatedName("client.ic")
    public static class78 field545;

    @ObfuscatedName("client.if")
    public class527 field703;

    @ObfuscatedName("client.is")
    public class8 field543;

    @ObfuscatedName("client.im")
    public long field544 = -1L;

    @ObfuscatedName("client.ib")
    public static byte[] field613;

    @ObfuscatedName("client.iq")
    public static class101[] field776;

    @ObfuscatedName("client.ia")
    public static int field547;

    @ObfuscatedName("client.iu")
    public static int[] field496;

    @ObfuscatedName("client.ij")
    public static int field638;

    @ObfuscatedName("client.il")
    public static int[] field550;

    @ObfuscatedName("client.it")
    public static String field768;

    @ObfuscatedName("client.ig")
    public static final class112 field590;

    @ObfuscatedName("client.ip")
    public static int field772;

    @ObfuscatedName("client.ii")
    public static boolean field553;

    @ObfuscatedName("client.ik")
    public static class426 field554;

    @ObfuscatedName("client.jf")
    public static HashMap field634;

    @ObfuscatedName("client.jm")
    public static int field556;

    @ObfuscatedName("client.jy")
    public static int field679;

    @ObfuscatedName("client.js")
    public static int field522;

    @ObfuscatedName("client.ju")
    public static int field559;

    @ObfuscatedName("client.jk")
    public static int field560;

    @ObfuscatedName("client.jx")
    public static class225[] field561;

    @ObfuscatedName("client.ja")
    public static boolean field596;

    @ObfuscatedName("client.jt")
    public static int[][][] field563;

    @ObfuscatedName("client.kj")
    public static final int[] field564;

    @ObfuscatedName("client.ks")
    public static int field565;

    @ObfuscatedName("client.kw")
    public static int field566;

    @ObfuscatedName("client.kg")
    public static int field671;

    @ObfuscatedName("client.kl")
    public static int field568;

    @ObfuscatedName("client.kc")
    public static int field569;

    @ObfuscatedName("client.ka")
    public static boolean field570;

    @ObfuscatedName("client.kb")
    public static int field571;

    @ObfuscatedName("client.lw")
    public static int field572;

    @ObfuscatedName("client.lj")
    public static int field573;

    @ObfuscatedName("client.le")
    public static int field654;

    @ObfuscatedName("client.lm")
    public static int field575;

    @ObfuscatedName("client.lz")
    public static int field549;

    @ObfuscatedName("client.lc")
    public static int field577;

    @ObfuscatedName("client.lb")
    public static int field578;

    @ObfuscatedName("client.lr")
    public static int field579;

    @ObfuscatedName("client.ll")
    public static int field580;

    @ObfuscatedName("client.la")
    public static int field530;

    @ObfuscatedName("client.lx")
    public static int field764;

    @ObfuscatedName("client.lh")
    public static int field583;

    @ObfuscatedName("client.li")
    public static int field584;

    @ObfuscatedName("client.lq")
    public static int field585;

    @ObfuscatedName("client.ly")
    public static boolean field586;

    @ObfuscatedName("client.ld")
    public static int field524;

    @ObfuscatedName("client.lu")
    public static boolean field588;

    @ObfuscatedName("client.lo")
    public static int field760;

    @ObfuscatedName("client.lg")
    public static int field781;

    @ObfuscatedName("client.lt")
    public static int field747;

    @ObfuscatedName("client.mb")
    public static int[] field592;

    @ObfuscatedName("client.md")
    public static int[] field593;

    @ObfuscatedName("client.my")
    public static int[] field735;

    @ObfuscatedName("client.mk")
    public static int[] field595;

    @ObfuscatedName("client.mi")
    public static int[] field722;

    @ObfuscatedName("client.mn")
    public static int[] field597;

    @ObfuscatedName("client.mx")
    public static int[][] field598;

    @ObfuscatedName("client.mv")
    public static int[] field599;

    @ObfuscatedName("client.mm")
    public static String[] field600;

    @ObfuscatedName("client.mq")
    public static int[][] field601;

    @ObfuscatedName("client.mf")
    public static int field670;

    @ObfuscatedName("client.mo")
    public static int field701;

    @ObfuscatedName("client.mj")
    public static int field696;

    @ObfuscatedName("client.ms")
    public static int field605;

    @ObfuscatedName("client.mw")
    public static int field520;

    @ObfuscatedName("client.mu")
    public static int field691;

    @ObfuscatedName("client.mt")
    public static int field608;

    @ObfuscatedName("client.ml")
    public static boolean field609;

    @ObfuscatedName("client.ma")
    public static int field737;

    @ObfuscatedName("client.mg")
    public static boolean field611;

    @ObfuscatedName("client.mc")
    public static class92[] field651;

    @ObfuscatedName("client.mp")
    public static int field790;

    @ObfuscatedName("client.mz")
    public static int field755;

    @ObfuscatedName("client.nd")
    public static long field699;

    @ObfuscatedName("client.nb")
    public static boolean field616;

    @ObfuscatedName("client.np")
    public static int field617;

    @ObfuscatedName("client.nc")
    public static int field618;

    @ObfuscatedName("client.na")
    public static int[] field619;

    @ObfuscatedName("client.nh")
    public static final int[] field620;

    @ObfuscatedName("client.ny")
    public static String[] field621;

    @ObfuscatedName("client.nu")
    public static boolean[] field622;

    @ObfuscatedName("client.nx")
    public static int[] field623;

    @ObfuscatedName("client.nj")
    public static int field624;

    @ObfuscatedName("client.nf")
    public static class390[][][] field697;

    @ObfuscatedName("client.nk")
    public static class390 field626;

    @ObfuscatedName("client.ns")
    public static class390 field627;

    @ObfuscatedName("client.nm")
    public static class390 field628;

    @ObfuscatedName("client.nv")
    public static int[] field629;

    @ObfuscatedName("client.nt")
    public static int[] field630;

    @ObfuscatedName("client.ne")
    public static int[] field631;

    @ObfuscatedName("client.nz")
    public static int[] field541;

    @ObfuscatedName("client.nl")
    public static boolean field633;

    @ObfuscatedName("client.nr")
    public static boolean field557;

    @ObfuscatedName("client.oy")
    public static int field635;

    @ObfuscatedName("client.ol")
    public static int[] field636;

    @ObfuscatedName("client.oz")
    public static int[] field562;

    @ObfuscatedName("client.ov")
    public static int[] field736;

    @ObfuscatedName("client.oq")
    public static int[] field708;

    @ObfuscatedName("client.oo")
    public static int[] field640;

    @ObfuscatedName("client.oa")
    public static String[] field641;

    @ObfuscatedName("client.ou")
    public static String[] field642;

    @ObfuscatedName("client.om")
    public static boolean[] field643;

    @ObfuscatedName("client.og")
    public static boolean field644;

    @ObfuscatedName("client.ob")
    public static boolean field645;

    @ObfuscatedName("client.os")
    public static boolean field685;

    @ObfuscatedName("client.ot")
    public static int field647;

    @ObfuscatedName("client.oj")
    public static int field648;

    @ObfuscatedName("client.oe")
    public static int field649;

    @ObfuscatedName("client.od")
    public static int field769;

    @ObfuscatedName("client.on")
    public static int field728;

    @ObfuscatedName("client.pm")
    public static boolean field632;

    @ObfuscatedName("client.ph")
    public static int field535;

    @ObfuscatedName("client.po")
    public static int field655;

    @ObfuscatedName("client.pp")
    public static String field656;

    @ObfuscatedName("client.pb")
    public static String field657;

    @ObfuscatedName("client.pl")
    public static int field505;

    @ObfuscatedName("client.pz")
    public static class501 field659;

    @ObfuscatedName("client.ps")
    public static int field660;

    @ObfuscatedName("client.pf")
    public static int field661;

    @ObfuscatedName("client.pv")
    public static int field494;

    @ObfuscatedName("client.px")
    public static class344 field663;

    @ObfuscatedName("client.pn")
    public static int field664;

    @ObfuscatedName("client.pa")
    public static int field665;

    @ObfuscatedName("client.pd")
    public static int field567;

    @ObfuscatedName("client.pj")
    public static int field667;

    @ObfuscatedName("client.pi")
    public static boolean field668;

    @ObfuscatedName("client.pq")
    public static class344 field669;

    @ObfuscatedName("client.pt")
    public static class344 field650;

    @ObfuscatedName("client.py")
    public static class344 field581;

    @ObfuscatedName("client.qb")
    public static int field672;

    @ObfuscatedName("client.qt")
    public static int field548;

    @ObfuscatedName("client.ql")
    public static class344 field594;

    @ObfuscatedName("client.qu")
    public static boolean field675;

    @ObfuscatedName("client.qo")
    public static int field555;

    @ObfuscatedName("client.qp")
    public static int field677;

    @ObfuscatedName("client.qy")
    public static boolean field517;

    @ObfuscatedName("client.qq")
    public static int field534;

    @ObfuscatedName("client.qd")
    public static int field680;

    @ObfuscatedName("client.qn")
    public static boolean field681;

    @ObfuscatedName("client.qr")
    public static int field682;

    @ObfuscatedName("client.qm")
    public static int[] field713;

    @ObfuscatedName("client.qv")
    public static int field684;

    @ObfuscatedName("client.qc")
    public static int[] field542;

    @ObfuscatedName("client.qe")
    public static int field686;

    @ObfuscatedName("client.qs")
    public static int[] field687;

    @ObfuscatedName("client.qz")
    public static int field688;

    @ObfuscatedName("client.qh")
    public static int[] field689;

    @ObfuscatedName("client.qi")
    public static int field690;

    @ObfuscatedName("client.qk")
    public static int field742;

    @ObfuscatedName("client.rm")
    public static int field748;

    @ObfuscatedName("client.rp")
    public static int field693;

    @ObfuscatedName("client.rf")
    public static int field694;

    @ObfuscatedName("client.rn")
    public static int field589;

    @ObfuscatedName("client.rc")
    public static int field552;

    @ObfuscatedName("client.rr")
    public static int field783;

    @ObfuscatedName("client.rh")
    public static int field698;

    @ObfuscatedName("client.rg")
    public static int field700;

    @ObfuscatedName("client.rk")
    public static class545 field574;

    @ObfuscatedName("client.rl")
    public static class390 field702;

    @ObfuscatedName("client.rv")
    public static class390 field794;

    @ObfuscatedName("client.ry")
    public static class390 field704;

    @ObfuscatedName("client.rd")
    public static class390 field683;

    @ObfuscatedName("client.rb")
    public static class501 field706;

    @ObfuscatedName("client.rz")
    public static int field707;

    @ObfuscatedName("client.rj")
    public static int field558;

    @ObfuscatedName("client.ri")
    public static boolean[] field709;

    @ObfuscatedName("client.ru")
    public static boolean[] field786;

    @ObfuscatedName("client.rx")
    public static boolean[] field516;

    @ObfuscatedName("client.rt")
    public static int[] field712;

    @ObfuscatedName("client.sg")
    public static int[] field733;

    @ObfuscatedName("client.sj")
    public static int[] field692;

    @ObfuscatedName("client.sr")
    public static int[] field715;

    @ObfuscatedName("client.sa")
    public static int field716;

    @ObfuscatedName("client.si")
    public static long field717;

    @ObfuscatedName("client.sd")
    public static boolean field718;

    @ObfuscatedName("client.sn")
    public static int[] field484;

    @ObfuscatedName("client.sw")
    public static int field720;

    @ObfuscatedName("client.sy")
    public static int field604;

    @ObfuscatedName("client.sh")
    public static String field695;

    @ObfuscatedName("client.sb")
    public static long[] field576;

    @ObfuscatedName("client.sz")
    public static int field724;

    @ObfuscatedName("client.sp")
    public static class224 field725;

    @ObfuscatedName("client.sf")
    public static class222 field726;

    @ObfuscatedName("client.sq")
    public static int field727;

    @ObfuscatedName("client.so")
    public static int[] field587;

    @ObfuscatedName("client.sl")
    public static int[] field519;

    @ObfuscatedName("client.tn")
    public static long field639;

    @ObfuscatedName("client.tp")
    public static class156[] field731;

    @ObfuscatedName("client.tw")
    public static class165[] field732;

    @ObfuscatedName("client.tq")
    public static int field602;

    @ObfuscatedName("client.ts")
    public static int field734;

    @ObfuscatedName("client.tt")
    public static int[] field551;

    @ObfuscatedName("client.tg")
    public static int[] field625;

    @ObfuscatedName("client.to")
    public static class541[] field711;

    @ObfuscatedName("client.tr")
    public static int field738;

    @ObfuscatedName("client.tx")
    public static int field739;

    @ObfuscatedName("client.ta")
    public static int field740;

    @ObfuscatedName("client.tj")
    public static boolean field741;

    @ObfuscatedName("client.ue")
    public static int field754;

    @ObfuscatedName("client.ug")
    public static int[] field743;

    @ObfuscatedName("client.ui")
    public static int[] field744;

    @ObfuscatedName("client.uv")
    public static int[] field745;

    @ObfuscatedName("client.uo")
    public static int[] field746;

    @ObfuscatedName("client.uj")
    public static class40[] field603;

    @ObfuscatedName("client.uq")
    public static boolean field789;

    @ObfuscatedName("client.ur")
    public static boolean field749;

    @ObfuscatedName("client.ux")
    public static boolean field750;

    @ObfuscatedName("client.uw")
    public static boolean field662;

    @ObfuscatedName("client.ub")
    public static class492 field752;

    @ObfuscatedName("client.uy")
    public static class491 field753;

    @ObfuscatedName("client.ut")
    public static class491 field673;

    @ObfuscatedName("client.un")
    public static boolean field483;

    @ObfuscatedName("client.vi")
    public static boolean[] field756;

    @ObfuscatedName("client.vo")
    public static int[] field757;

    @ObfuscatedName("client.va")
    public static int[] field705;

    @ObfuscatedName("client.vy")
    public static int[] field759;

    @ObfuscatedName("client.vw")
    public static int[] field729;

    @ObfuscatedName("client.vt")
    public static short field761;

    @ObfuscatedName("client.vd")
    public static short field762;

    @ObfuscatedName("client.vc")
    public static short field763;

    @ObfuscatedName("client.vx")
    public static short field710;

    @ObfuscatedName("client.vs")
    public static short field765;

    @ObfuscatedName("client.vk")
    public static short field766;

    @ObfuscatedName("client.vp")
    public static short field532;

    @ObfuscatedName("client.vb")
    public static short field723;

    @ObfuscatedName("client.vg")
    public static int field714;

    @ObfuscatedName("client.vr")
    public static int field770;

    @ObfuscatedName("client.vu")
    public static int field771;

    @ObfuscatedName("client.vm")
    public static int field607;

    @ObfuscatedName("client.vn")
    public static int field773;

    @ObfuscatedName("client.wq")
    public static class341 field774;

    @ObfuscatedName("client.wl")
    public static int field775;

    @ObfuscatedName("client.ww")
    public static int field721;

    @ObfuscatedName("client.wr")
    public static class488 field777;

    @ObfuscatedName("client.wk")
    public static class380[] field778;

    @ObfuscatedName("client.wc")
    public static class67 field779;

    @ObfuscatedName("client.wo")
    public static class436 field780;

    @ObfuscatedName("client.wm")
    public static class299 field610;

    @ObfuscatedName("client.wb")
    public static class299 field782;

    @ObfuscatedName("client.wh")
    public static int field637;

    @ObfuscatedName("client.wi")
    public static int field784;

    @ObfuscatedName("client.wf")
    public static List field501;

    @ObfuscatedName("client.wv")
    public static final class230 field674;

    @ObfuscatedName("client.xe")
    public static ArrayList field787;

    @ObfuscatedName("client.xd")
    public static int field767;

    @ObfuscatedName("client.xi")
    public static int field646;

    @ObfuscatedName("client.xl")
    public static final class66 field751;

    @ObfuscatedName("client.xn")
    public static int[] field791;

    @ObfuscatedName("client.xf")
    public static int[] field719;

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
        field538 = class398.method7123(var1);
        int var5 = "com_jagex_auth_desktop_runelite:public".length();
        byte[] var6 = new byte[var5];
        for (int var7 = 0; var7 < var5; var7++) {
            char var8 = "com_jagex_auth_desktop_runelite:public".charAt(var7);
            if (var8 > 127) {
                var6[var7] = 63;
            } else {
                var6[var7] = (byte) var8;
            }
        }
        field539 = class398.method7123(var6);
        field540 = false;
        field545 = new class78();
        field613 = null;
        field776 = new class101[65536];
        field547 = 0;
        field496 = new int[65536];
        field638 = 0;
        field550 = new int[250];
        field590 = new class112();
        field772 = 0;
        field553 = false;
        field554 = new class426();
        field634 = new HashMap();
        field556 = 0;
        field679 = 1;
        field522 = 0;
        field559 = 1;
        field560 = 0;
        field561 = new class225[4];
        field596 = false;
        field563 = new int[4][13][13];
        field564 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field565 = 0;
        field566 = 2301979;
        field671 = 5063219;
        field568 = 3353893;
        field569 = 7759444;
        field570 = false;
        field571 = 0;
        field572 = 128;
        field573 = 0;
        field654 = 0;
        field575 = 0;
        field549 = 0;
        field577 = 0;
        field578 = 0;
        field579 = 50;
        field580 = 0;
        field530 = 0;
        field764 = 0;
        field583 = 12;
        field584 = 6;
        field585 = 0;
        field586 = false;
        field524 = 0;
        field588 = false;
        field760 = 0;
        field781 = 0;
        field747 = 50;
        field592 = new int[field747];
        field593 = new int[field747];
        field735 = new int[field747];
        field595 = new int[field747];
        field722 = new int[field747];
        field597 = new int[field747];
        field598 = new int[field747][];
        field599 = new int[field747];
        field600 = new String[field747];
        field601 = new int[104][104];
        field670 = 0;
        field701 = -1;
        field696 = -1;
        field605 = 0;
        field520 = 0;
        field691 = 0;
        field608 = 0;
        field609 = true;
        field737 = 0;
        field611 = true;
        field651 = new class92[2048];
        field790 = -1;
        field755 = 0;
        field699 = -1L;
        field616 = true;
        field617 = 0;
        field618 = 0;
        field619 = new int[1000];
        field620 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field621 = new String[8];
        field622 = new boolean[8];
        field623 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field624 = -1;
        field697 = new class390[4][104][104];
        field626 = new class390();
        field627 = new class390();
        field628 = new class390();
        field629 = new int[25];
        field630 = new int[25];
        field631 = new int[25];
        field541 = new int[25];
        field633 = false;
        field557 = false;
        field635 = 0;
        field636 = new int[500];
        field562 = new int[500];
        field736 = new int[500];
        field708 = new int[500];
        field640 = new int[500];
        field641 = new String[500];
        field642 = new String[500];
        field643 = new boolean[500];
        field644 = false;
        field645 = false;
        field685 = true;
        field647 = -1;
        field648 = -1;
        field649 = 0;
        field769 = 50;
        field728 = 0;
        field768 = null;
        field632 = false;
        field535 = -1;
        field655 = -1;
        field656 = null;
        field657 = null;
        field505 = -1;
        field659 = new class501(8);
        field660 = 0;
        field661 = -1;
        field494 = 0;
        field663 = null;
        field664 = 0;
        field665 = 0;
        field567 = 0;
        field667 = -1;
        field668 = false;
        field669 = null;
        field650 = null;
        field581 = null;
        field672 = 0;
        field548 = 0;
        field594 = null;
        field675 = false;
        field555 = -1;
        field677 = -1;
        field517 = false;
        field534 = -1;
        field680 = -1;
        field681 = false;
        field682 = 1;
        field713 = new int[32];
        field684 = 0;
        field542 = new int[32];
        field686 = 0;
        field687 = new int[32];
        field688 = 0;
        field689 = new int[32];
        field690 = 0;
        field742 = 0;
        field748 = 0;
        field693 = 0;
        field694 = 0;
        field589 = 0;
        field552 = 0;
        field783 = 0;
        field698 = 0;
        field700 = 0;
        field574 = new class545();
        field702 = new class390();
        field794 = new class390();
        field704 = new class390();
        field683 = new class390();
        field706 = new class501(512);
        field707 = 0;
        field558 = -2;
        field709 = new boolean[100];
        field786 = new boolean[100];
        field516 = new boolean[100];
        field712 = new int[100];
        field733 = new int[100];
        field692 = new int[100];
        field715 = new int[100];
        field716 = 0;
        field717 = 0L;
        field718 = true;
        field484 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field720 = 0;
        field604 = 0;
        field695 = "";
        field576 = new long[100];
        field724 = 0;
        field725 = new class224();
        field726 = new class222();
        field727 = 0;
        field587 = new int[128];
        field519 = new int[128];
        field639 = -1L;
        field731 = new class156[4];
        field732 = new class165[4];
        field602 = -1;
        field734 = 0;
        field551 = new int[1000];
        field625 = new int[1000];
        field711 = new class541[1000];
        field738 = 0;
        field739 = 0;
        field740 = 0;
        field741 = false;
        field754 = 0;
        field743 = new int[50];
        field744 = new int[50];
        field745 = new int[50];
        field746 = new int[50];
        field603 = new class40[50];
        field789 = false;
        field749 = false;
        field750 = false;
        field662 = false;
        field752 = null;
        field753 = null;
        field673 = null;
        field483 = false;
        field756 = new boolean[5];
        field757 = new int[5];
        field705 = new int[5];
        field759 = new int[5];
        field729 = new int[5];
        field761 = 256;
        field762 = 205;
        field763 = 256;
        field710 = 320;
        field765 = 1;
        field766 = 32767;
        field532 = 1;
        field723 = 32767;
        field714 = 0;
        field770 = 0;
        field771 = 0;
        field607 = 0;
        field773 = 0;
        field774 = new class341();
        field775 = -1;
        field721 = -1;
        field777 = new class486();
        field778 = new class380[8];
        field779 = new class67();
        field780 = new class436(8, class434.field4646);
        field610 = new class299(64);
        field782 = new class299(64);
        field637 = -1;
        field784 = -1;
        field501 = new ArrayList();
        field674 = new class230();
        field787 = new ArrayList(10);
        field767 = 0;
        field646 = 0;
        field751 = new class66();
        field791 = new int[50];
        field719 = new int[50];
    }

    @ObfuscatedName("sl.gj(I)Ltn;")
    public static class495 method7893() {
        return Statics.field1919;
    }

    @ObfuscatedName("client.bc(B)V")
    public final void method529() {
    }

    public final void init() {
        if (!this.method508()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class102.field1320)) {
                            field487 = true;
                        } else {
                            field487 = false;
                        }
                        break;
                    case 4:
                        if (field490 == -1) {
                            field490 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field485 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field1043 = class386.method6510(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var4 = Integer.parseInt(var2);
                        class359[] var5 = class359.method167();
                        int var6 = 0;
                        class359 var8;
                        while (true) {
                            if (var6 >= var5.length) {
                                var8 = null;
                                break;
                            }
                            class359 var7 = var5[var6];
                            if (var7.field3899 == var4) {
                                var8 = var7;
                                break;
                            }
                            var6++;
                        }
                        Statics.field1979 = var8;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class102.field1320)) {
                        }
                        break;
                    case 9:
                        Statics.field879 = var2;
                        break;
                    case 10:
                        Statics.field1402 = (class360) class385.method164(class360.method3440(), Integer.parseInt(var2));
                        if (Statics.field1402 == class360.field3910) {
                            Statics.field1079 = class505.field5029;
                        } else {
                            Statics.field1079 = class505.field5028;
                        }
                        break;
                    case 11:
                        Statics.field3402 = var2;
                        break;
                    case 12:
                        field591 = Integer.parseInt(var2);
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
                        Statics.field112 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field652 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2416 = var2;
                        break;
                    case 21:
                        field489 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field4678 = var2;
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field493 = Integer.parseInt(var2);
                        } else {
                            field493 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        class271.field2824 = false;
        field488 = false;
        Statics.field4681 = this.getCodeBase().getHost();
        Statics.field2557 = new class372();
        String var9 = Statics.field1979.field3903;
        byte var10 = 0;
        if ((field485 & class523.field5110.method41()) != 0) {
            Statics.field2656 = "beta";
        }
        try {
            class212.method5661("oldschool", Statics.field2656, var9, var10, 23);
        } catch (Exception var14) {
            class553.method6436((String) null, var14);
        }
        Statics.field3544 = this;
        Statics.field5300 = field490;
        Statics.field1403 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field2127 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field4300 = System.getenv("JX_SESSION_ID");
        Statics.field1047 = System.getenv("JX_CHARACTER_ID");
        String var12 = System.getenv("JX_DISPLAY_NAME");
        String var13;
        if (var12 == null || var12.isEmpty() || var12.charAt(0) == '#') {
            var13 = "";
        } else {
            var13 = var12;
        }
        class76.field918 = var13;
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field533 = true;
        }
        if (field491 == -1) {
            if (this.method1257() || this.method1186()) {
                field491 = 5;
            } else {
                field491 = 0;
            }
        }
        this.method505(765, 503, 218, 1);
    }

    public void finalize() throws Throwable {
        class317.method2237(this);
        super.finalize();
    }

    @ObfuscatedName("client.gv(I)Z")
    public boolean method1182() {
        return this.field546 == 1;
    }

    public void setClient(int arg0) {
        this.field546 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field531 = arg0;
            class76.method2815(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field536 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field525 == 10;
    }

    public long getAccountHash() {
        return this.field544;
    }

    @ObfuscatedName("client.gc(S)Z")
    public boolean method1257() {
        return Statics.field1403 != null && !Statics.field1403.trim().isEmpty() && Statics.field2127 != null && !Statics.field2127.trim().isEmpty();
    }

    @ObfuscatedName("client.gr(B)Z")
    public boolean method1186() {
        return Statics.field4300 != null && !Statics.field4300.trim().isEmpty() && Statics.field1047 != null && !Statics.field1047.trim().isEmpty();
    }

    @ObfuscatedName("client.gk(I)Z")
    public boolean method1253() {
        return this.field531 != null;
    }

    @ObfuscatedName("client.go(Ljava/lang/String;I)V")
    public void method1187(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field3402 + "shield/oauth/token" + (new class476(var2)).method7803());
        class432 var4 = new class432();
        if (this.method1182()) {
            var4.method7242(field539);
        } else {
            var4.method7242(field538);
        }
        var4.method7239("Host", (new URL(Statics.field3402)).getHost());
        var4.method7246(class473.field4811);
        class10 var5 = class10.field34;
        RefreshAccessTokenRequester var6 = this.field536;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field533);
            this.field612 = this.field529.method175(var7);
        } else {
            this.field537 = var6.request(var5.method71(), var3, var4.method7238(), "");
        }
    }

    @ObfuscatedName("client.gh(Ljava/lang/String;B)V")
    public void method1289(String arg0) throws IOException {
        URL var2 = new URL(Statics.field3402 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class432 var3 = new class432();
        var3.method7262(arg0);
        class10 var4 = class10.field32;
        OtlTokenRequester var5 = this.field531;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field533);
            this.field658 = this.field529.method175(var6);
        } else {
            this.field606 = var5.request(var4.method71(), var2, var3.method7238(), "");
        }
    }

    @ObfuscatedName("client.gd(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1189(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field4678 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field34, this.field533);
        var4.method89().method7262(arg0);
        var4.method89().method7246(class473.field4811);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method86(new class475(var5));
        this.field658 = this.field529.method175(var4);
    }

    @ObfuscatedName("client.bm(I)V")
    public final void method520() {
        class424.method16(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field2633 = field652 == 0 ? 43594 : field591 + 40000;
        Statics.field4708 = field652 == 0 ? 443 : field591 + 50000;
        Statics.field2613 = Statics.field2633;
        Statics.field2441 = class343.field3643;
        Statics.field1095 = class343.field3642;
        Statics.field5016 = class343.field3644;
        Statics.field3607 = class343.field3641;
        Statics.field423 = new class114(this.field533, 218);
        this.method535();
        this.method500();
        Statics.field4455 = this.method493();
        this.method499(field726, 0);
        this.method499(field725, 1);
        this.method555();
        Statics.field3119 = new class455(255, class212.field2291, class212.field2283, 500000);
        class507 var1 = null;
        class99 var2 = new class99();
        try {
            var1 = class212.method2944("", Statics.field1402.field3905, false);
            byte[] var3 = new byte[(int) var1.method8214()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method8198(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class99(new class527(var3));
        } catch (Exception var11) {
        }
        try {
            if (var1 != null) {
                var1.method8195();
            }
        } catch (Exception var10) {
        }
        Statics.field2450 = var2;
        Statics.method439(this, Statics.field68);
        method69(Statics.field2450.method2436());
        Statics.field52 = new class69(Statics.field1079);
        this.field529 = new class15("tokenRequest", 1, 1);
        if (!class317.field3421.contains(this)) {
            class317.field3421.add(this);
        }
        field674.method4063();
    }

    @ObfuscatedName("client.bp(I)V")
    public final void method595() {
        field500++;
        this.method1190();
        while (true) {
            class390 var1 = class368.field4274;
            class367 var2;
            synchronized (class368.field4274) {
                var2 = (class367) class368.field4269.method6545();
            }
            if (var2 == null) {
                boolean var4 = class317.method8297();
                if (var4 && field741 && Statics.field3495 != null) {
                    Statics.field3495.method790();
                }
                method2592();
                field725.method3949();
                this.method561();
                class36 var5 = class36.field225;
                synchronized (class36.field225) {
                    class36.field208 = class36.field212;
                    class36.field217 = class36.field216;
                    class36.field218 = class36.field213;
                    class36.field219 = class36.field215;
                    class36.field229 = class36.field220;
                    class36.field214 = class36.field221;
                    class36.field210 = class36.field222;
                    class36.field211 = class36.field223;
                    class36.field220 = 0;
                }
                if (Statics.field4455 != null) {
                    int var7 = Statics.field4455.method298();
                    field700 = var7;
                }
                if (field525 == 0) {
                    method4503();
                    class35.method4369();
                } else if (field525 == 5) {
                    class76.method2368(this, Statics.field4301, Statics.field2650);
                    method4503();
                    class35.method4369();
                } else if (field525 == 10 || field525 == 11) {
                    class76.method2368(this, Statics.field4301, Statics.field2650);
                } else if (field525 == 20) {
                    class76.method2368(this, Statics.field4301, Statics.field2650);
                    this.method1193();
                } else if (field525 == 50) {
                    class76.method2368(this, Statics.field4301, Statics.field2650);
                    this.method1193();
                } else if (field525 == 25) {
                    method6522();
                }
                if (field525 == 30) {
                    this.method1194();
                } else if (field525 == 40 || field525 == 45) {
                    this.method1193();
                }
                return;
            }
            var2.field4267.method6239(var2.field4266, (int) var2.field4849, var2.field4268, false);
        }
    }

    @ObfuscatedName("client.bw(ZI)V")
    public final void method497(boolean arg0) {
        if ((field525 == 10 || field525 == 20 || field525 == 30) && field717 != 0L && class313.method3460() > field717) {
            method69(method1169());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field709[var2] = true;
            }
        }
        if (field525 == 0) {
            this.method524(class76.field905, class76.field906, arg0);
        } else if (field525 == 5) {
            class76.method2769(Statics.field4352, Statics.field4301, Statics.field2650);
        } else if (field525 == 10 || field525 == 11) {
            class76.method2769(Statics.field4352, Statics.field4301, Statics.field2650);
        } else if (field525 == 20) {
            class76.method2769(Statics.field4352, Statics.field4301, Statics.field2650);
        } else if (field525 == 50) {
            class76.method2769(Statics.field4352, Statics.field4301, Statics.field2650);
        } else if (field525 == 25) {
            if (field560 == 1) {
                if (field556 > field679) {
                    field679 = field556;
                }
                int var3 = (field679 * 50 - field556 * 50) / field679;
                method5337(class364.field4228 + class102.field1317 + class102.field1319 + var3 + "%" + class102.field1321, false);
            } else if (field560 == 2) {
                if (field522 > field559) {
                    field559 = field522;
                }
                int var4 = (field559 * 50 - field522 * 50) / field559 + 50;
                method5337(class364.field4228 + class102.field1317 + class102.field1319 + var4 + "%" + class102.field1321, false);
            } else {
                method5337(class364.field4228, false);
            }
        } else if (field525 == 30) {
            this.method1198();
        } else if (field525 == 40) {
            method5337(class364.field3982 + class102.field1317 + class364.field3939, false);
        } else if (field525 == 45) {
            method5337(class364.field4129, false);
        }
        if (field525 == 30 && field716 == 0 && !arg0 && !field718) {
            for (int var5 = 0; var5 < field707; var5++) {
                if (field786[var5]) {
                    Statics.field3588.method470(field712[var5], field733[var5], field692[var5], field715[var5]);
                    field786[var5] = false;
                }
            }
        } else if (field525 > 0) {
            Statics.field3588.method469(0, 0);
            for (int var6 = 0; var6 < field707; var6++) {
                field786[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.bj(I)V")
    public final void method603() {
        if (Statics.field1821.method2661()) {
            Statics.field1821.method2662();
        }
        if (Statics.field474 != null) {
            Statics.field474.field1067 = false;
        }
        Statics.field474 = null;
        field590.method2718();
        if (class36.field225 != null) {
            class36 var1 = class36.field225;
            synchronized (class36.field225) {
                class36.field225 = null;
            }
        }
        Statics.field4455 = null;
        if (Statics.field3495 != null) {
            Statics.field3495.method794();
        }
        Statics.field2557.method6371();
        class368.method4031();
        if (Statics.field423 != null) {
            Statics.field423.method2761();
            Statics.field423 = null;
        }
        class212.method3343();
        this.field529.method173();
    }

    @ObfuscatedName("qq.hb(I)V")
    public static void method7205() {
        if (Statics.field1821.method2661()) {
            Statics.field1821.method2662();
        }
        method1029();
        if (Statics.field474 != null) {
            Statics.field474.field1067 = false;
        }
        Statics.field474 = null;
        field590.method2718();
        if (Statics.field195 != null) {
            try {
                Statics.field195.method3871();
            } catch (Exception var4) {
            }
        }
        Statics.field195 = null;
        method1874();
        method3353();
        Statics.field231.method4919();
        for (int var1 = 0; var1 < 4; var1++) {
            field561[var1].method3987();
        }
        Statics.field1919 = null;
        class317.method4392(0, 0);
        class317.method7786();
        field741 = false;
        class70.method4434();
        if (Statics.field3495 != null) {
            Statics.field3495.method794();
        }
        Statics.field2557.method6371();
        class368.method4031();
        if (Statics.field423 != null) {
            Statics.field423.method2761();
        }
        class212.method3343();
        class212.field2291 = null;
        class212.field2283 = null;
        Statics.field127 = null;
        class214.method3207();
        Statics.field3119 = null;
        field787.clear();
        field646 = 0;
        Statics.field2557 = new class372();
        Statics.field423 = new class114(Statics.field3544.field533, 218);
        try {
            class212.method5661("oldschool", Statics.field2656, Statics.field1979.field3903, 0, 23);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
        Statics.field3119 = new class455(255, class212.field2291, class212.field2283, 500000);
        Statics.field195 = new class210();
        Statics.field3544.method511();
        field518 = class93.field1137;
        method4139(0);
    }

    @ObfuscatedName("hb.hp(B)V")
    public static void method3353() {
        Statics.field2659 = null;
        Statics.field51 = null;
        Statics.field1815 = null;
        Statics.field1435 = null;
        Statics.field3817 = null;
        Statics.field421 = null;
        Statics.field54 = null;
        Statics.field1817 = null;
        Statics.field1909 = null;
        Statics.field156 = null;
        Statics.field1583 = null;
    }

    @ObfuscatedName("jg.hl(II)V")
    public static void method4139(int arg0) {
        if (field525 == arg0) {
            return;
        }
        if (field525 == 30) {
            field726.method3929();
        }
        if (field525 == 0) {
            Statics.field3544.method509();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method289(0);
            field523 = 0;
            field615 = 0;
            field554.method7216(arg0);
            if (arg0 != 20) {
                method3439(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field5 != null) {
            Statics.field5.method7538();
            Statics.field5 = null;
        }
        if (field525 == 25) {
            field560 = 0;
            field556 = 0;
            field679 = 1;
            field522 = 0;
            field559 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            int var2 = method17() ? 0 : 12;
            class76.method40(Statics.field3868, Statics.field482, true, var2);
        } else if (arg0 == 20) {
            int var1 = field525 == 11 ? 4 : 0;
            class76.method40(Statics.field3868, Statics.field482, false, var1);
        } else if (arg0 == 11) {
            class76.method40(Statics.field3868, Statics.field482, false, 4);
        } else if (arg0 == 50) {
            class76.method3022("", "Updating date of birth...", "");
            class76.method40(Statics.field3868, Statics.field482, false, 7);
        } else {
            class76.method183();
        }
        field525 = arg0;
    }

    @ObfuscatedName("client.hi(I)V")
    public void method1190() {
        if (field525 != 1000) {
            boolean var1 = Statics.field2557.method6366();
            if (!var1) {
                this.method1191();
            }
        }
    }

    @ObfuscatedName("client.hq(I)V")
    public void method1191() {
        if (Statics.field2557.field4344 >= 4) {
            this.method526("js5crc");
            method4139(1000);
            return;
        }
        if (Statics.field2557.field4328 >= 4) {
            if (field525 <= 5) {
                this.method526("js5io");
                method4139(1000);
                return;
            }
            field792 = 3000;
            Statics.field2557.field4328 = 3;
        }
        if (--field792 + 1 > 0) {
            return;
        }
        try {
            if (field758 == 0) {
                Statics.field1325 = Statics.field195.method3870(Statics.field4681, Statics.field2613);
                field758++;
            }
            if (field758 == 1) {
                if (Statics.field1325.field2326 == 2) {
                    this.method1192(-1);
                    return;
                }
                if (Statics.field1325.field2326 == 1) {
                    field758++;
                }
            }
            if (field758 == 2) {
                Statics.field1785 = class451.method4090((Socket) Statics.field1325.field2325, 40000, 5000);
                class527 var1 = new class527(5);
                var1.method8393(15);
                var1.method8396(218);
                Statics.field1785.method7532(var1.field5140, 0, 5);
                field758++;
                Statics.field3389 = class313.method3460();
            }
            if (field758 == 3) {
                if (Statics.field1785.method7544() > 0) {
                    int var2 = Statics.field1785.method7530();
                    if (var2 != 0) {
                        this.method1192(var2);
                        return;
                    }
                    field758++;
                } else if (class313.method3460() - Statics.field3389 > 30000L) {
                    this.method1192(-2);
                    return;
                }
            }
            if (field758 == 4) {
                Statics.field2557.method6368(Statics.field1785, field525 > 20);
                Statics.field1325 = null;
                Statics.field1785 = null;
                field758 = 0;
                field521 = 0;
            }
        } catch (IOException var4) {
            this.method1192(-3);
        }
    }

    @ObfuscatedName("client.hf(II)V")
    public void method1192(int arg0) {
        Statics.field1325 = null;
        Statics.field1785 = null;
        field758 = 0;
        if (Statics.field2633 == Statics.field2613) {
            Statics.field2613 = Statics.field4708;
        } else {
            Statics.field2613 = Statics.field2633;
        }
        field521++;
        if (field521 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field525 <= 5) {
                this.method526("js5connect_full");
                method4139(1000);
            } else {
                field792 = 3000;
            }
        } else if (field521 >= 2 && arg0 == 6) {
            this.method526("js5connect_outofdate");
            method4139(1000);
        } else if (field521 >= 4) {
            if (field525 <= 5) {
                this.method526("js5connect");
                method4139(1000);
            } else {
                field792 = 3000;
            }
        }
    }

    @ObfuscatedName("nm.hw(Loh;Ljava/lang/String;I)V")
    public static void method6202(class369 arg0, String arg1) {
        class84 var2 = new class84(arg0, arg1);
        field787.add(var2);
        field646 += var2.field1018;
    }

    @ObfuscatedName("jo.hj(B)I")
    public static int method4415() {
        if (field787 == null || field767 >= field787.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field767; var1++) {
            var0 += ((class84) field787.get(var1)).field1016;
        }
        return var0 * 10000 / field646;
    }

    @ObfuscatedName("gl.hg(II)I")
    public static int method3155(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("dj.hk(III)V")
    public static void method2607(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method3155(var4);
            int var6 = class267.field2771[var4];
            int var7 = method6717(var5, arg1);
            var2[var3] = var6 * var7 >> 16;
        }
        class271.method4831(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("jz.hc(I)V")
    public static void method4503() {
        if (field518 == class93.field1137) {
            Statics.field231 = new class271(4, 104, 104, class82.field1014);
            for (int var0 = 0; var0 < 4; var0++) {
                field561[var0] = new class225(104, 104);
            }
            Statics.field1331 = new class541(512, 512);
            class76.field906 = class364.field3940;
            class76.field905 = 5;
            field518 = class93.field1134;
        } else if (field518 == class93.field1134) {
            class76.field906 = class364.field4216;
            class76.field905 = 10;
            field518 = class93.field1132;
        } else if (field518 == class93.field1132) {
            Statics.field1442 = method4786(0, false, true, true, false);
            Statics.field1644 = method4786(1, false, true, true, false);
            Statics.field3812 = method4786(2, true, false, true, false);
            Statics.field3399 = method4786(3, false, true, true, false);
            Statics.field4413 = method4786(4, false, true, true, false);
            Statics.field2533 = method4786(5, true, true, true, false);
            Statics.field5060 = method4786(6, true, true, true, false);
            Statics.field93 = method4786(7, false, true, true, false);
            Statics.field482 = method4786(8, false, true, true, false);
            Statics.field115 = method4786(9, false, true, true, false);
            Statics.field3868 = method4786(10, false, true, true, false);
            Statics.field282 = method4786(11, false, true, true, false);
            Statics.field319 = method4786(12, false, true, true, false);
            Statics.field2024 = method4786(13, true, false, true, false);
            Statics.field2042 = method4786(14, false, true, true, false);
            Statics.field26 = method4786(15, false, true, true, false);
            Statics.field299 = method4786(17, true, true, true, false);
            Statics.field1461 = method4786(18, false, true, true, false);
            Statics.field2008 = method4786(19, false, true, true, false);
            Statics.field2427 = method4786(20, false, true, true, false);
            Statics.field2779 = method4786(21, false, true, true, false);
            Statics.field2642 = method3778(22, false, true, true, true, true);
            class76.field906 = class364.field3942;
            class76.field905 = 20;
            field518 = class93.field1131;
        } else if (field518 == class93.field1131) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1442.method6233() * 4 / 100;
            int var3 = var2 + Statics.field1644.method6233() * 4 / 100;
            int var4 = var3 + Statics.field3812.method6233() * 2 / 100;
            int var5 = var4 + Statics.field3399.method6233() * 2 / 100;
            int var6 = var5 + Statics.field4413.method6233() * 6 / 100;
            int var7 = var6 + Statics.field2533.method6233() * 4 / 100;
            int var8 = var7 + Statics.field5060.method6233() * 2 / 100;
            int var9 = var8 + Statics.field93.method6233() * 54 / 100;
            int var10 = var9 + Statics.field482.method6233() * 2 / 100;
            int var11 = var10 + Statics.field115.method6233() * 2 / 100;
            int var12 = var11 + Statics.field3868.method6233() * 2 / 100;
            int var13 = var12 + Statics.field282.method6233() * 2 / 100;
            int var14 = var13 + Statics.field319.method6233() * 2 / 100;
            int var15 = var14 + Statics.field2024.method6233() * 2 / 100;
            int var16 = var15 + Statics.field2042.method6233() * 2 / 100;
            int var17 = var16 + Statics.field26.method6233() * 2 / 100;
            int var18 = var17 + Statics.field2008.method6233() / 100;
            int var19 = var18 + Statics.field1461.method6233() / 100;
            int var20 = var19 + Statics.field2427.method6233() / 100;
            int var21 = var20 + Statics.field2779.method6233() / 100;
            int var22 = var21 + Statics.field2642.method6233() / 100;
            int var23 = var22 + (Statics.field299.method6232() && Statics.field299.method6289() ? 1 : 0);
            if (var23 == 100) {
                method6202(Statics.field1442, "Animations");
                method6202(Statics.field1644, "Skeletons");
                method6202(Statics.field4413, "Sound FX");
                method6202(Statics.field2533, "Maps");
                method6202(Statics.field5060, "Music Tracks");
                method6202(Statics.field93, "Models");
                method6202(Statics.field482, "Sprites");
                method6202(Statics.field282, "Music Jingles");
                method6202(Statics.field2042, "Music Samples");
                method6202(Statics.field26, "Music Patches");
                method6202(Statics.field2008, "World Map");
                method6202(Statics.field1461, "World Map Geography");
                method6202(Statics.field2427, "World Map Ground");
                Statics.field4359 = new class457();
                Statics.field4359.method7596(Statics.field299);
                class76.field906 = class364.field3944;
                class76.field905 = 30;
                field518 = class93.field1138;
            } else {
                if (var23 != 0) {
                    class76.field906 = class364.field3943 + var23 + "%";
                }
                class76.field905 = 30;
            }
        } else if (field518 == class93.field1138) {
            boolean var24 = !field488;
            Statics.field276 = 22050;
            Statics.field2581 = var24;
            Statics.field267 = 2;
            ArrayList var25 = new ArrayList(3);
            class210 var26 = Statics.field195;
            short var27 = 2048;
            if (Statics.field276 == 0) {
                throw new IllegalStateException();
            }
            if (var27 < 256) {
                var27 = 256;
            }
            class43 var29;
            try {
                class43 var28 = Statics.field269.method311();
                var28.field278 = new int[256 * (Statics.field2581 ? 2 : 1)];
                var28.field273 = var27;
                var28.method330();
                var28.field274 = (var27 & 0xFFFFFC00) + 1024;
                if (var28.field274 > 16384) {
                    var28.field274 = 16384;
                }
                var28.method331(var28.field274);
                if (Statics.field267 > 0 && Statics.field4546 == null) {
                    Statics.field4546 = new class45();
                    Statics.field3645 = Executors.newScheduledThreadPool(1);
                    Statics.field3645.scheduleAtFixedRate(Statics.field4546, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field4546 != null) {
                    if (Statics.field4546.field301[0] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field4546.field301[0] = var28;
                }
                var29 = var28;
            } catch (Throwable var88) {
                var29 = new class43();
            }
            Statics.field3495 = var29;
            Statics.field1266 = new class39();
            class39 var31 = new class39();
            var31.method707(Statics.field1266);
            for (int var32 = 0; var32 < 3; var32++) {
                class318 var33 = new class318();
                var33.method5416(9, 128);
                var31.method707(var33);
                var25.add(var33);
            }
            Statics.field3495.method791(var31);
            class369 var34 = Statics.field26;
            class369 var35 = Statics.field2042;
            class369 var36 = Statics.field4413;
            Statics.field3424 = var34;
            Statics.field3415 = var35;
            Statics.field1790 = var36;
            class317.field3416 = var25;
            Statics.field5093 = new class58(22050, Statics.field276);
            class76.field906 = class364.field3945;
            class76.field905 = 35;
            field518 = class93.field1133;
            Statics.field1610 = new class496(Statics.field482, Statics.field2024);
        } else if (field518 == class93.field1133) {
            int var37 = class497.method8111().length;
            field634 = Statics.field1610.method8107(class497.method8111());
            if (field634.size() < var37) {
                class76.field906 = class364.field4049 + field634.size() * 100 / var37 + "%";
                class76.field905 = 40;
            } else {
                Statics.field4301 = (class406) field634.get(class497.field4990);
                Statics.field2650 = (class406) field634.get(class497.field4989);
                Statics.field4352 = (class406) field634.get(class497.field4995);
                Statics.field420 = field777.method7840();
                class76.field906 = class364.field3947;
                class76.field905 = 40;
                field518 = class93.field1129;
            }
        } else if (field518 == class93.field1129) {
            int var38 = class76.method7425(Statics.field3868, Statics.field482);
            int var39 = class76.method3436(Statics.field482);
            if (var38 < var39) {
                class76.field906 = class364.field3948 + var38 * 100 / var39 + "%";
                class76.field905 = 50;
            } else {
                class76.field906 = class364.field3949;
                class76.field905 = 50;
                method4139(5);
                field518 = class93.field1135;
            }
        } else if (field518 == class93.field1135) {
            if (!Statics.field3812.method6289()) {
                class76.field906 = class364.field4224 + Statics.field3812.method6256() + "%";
                class76.field905 = 60;
            } else if (Statics.field2779.method6289()) {
                class369 var40 = Statics.field3812;
                Statics.field2197 = var40;
                class369 var41 = Statics.field3812;
                Statics.field2016 = var41;
                class180.method3220(Statics.field3812, Statics.field93);
                class202.method6968(Statics.field3812, Statics.field93, field488);
                class189.method2382(Statics.field3812, Statics.field93);
                class200.method282(Statics.field3812);
                class369 var42 = Statics.field3812;
                class369 var43 = Statics.field93;
                boolean var44 = field487;
                class406 var45 = Statics.field4301;
                Statics.field5081 = var42;
                Statics.field2132 = var43;
                Statics.field1518 = var44;
                Statics.field2133 = Statics.field5081.method6294(10);
                Statics.field2278 = var45;
                class369 var46 = Statics.field3812;
                class369 var47 = Statics.field1442;
                class369 var48 = Statics.field1644;
                Statics.field4294 = var46;
                Statics.field2227 = var47;
                Statics.field2208 = var48;
                class194.method2797(Statics.field3812, Statics.field93);
                class369 var49 = Statics.field3812;
                Statics.field2026 = var49;
                class176.method5160(Statics.field3812);
                Statics.field1878 = new class336(Statics.field3399, Statics.field93, Statics.field482, Statics.field2024, Statics.field2642);
                class369 var50 = Statics.field3812;
                Statics.field1801 = var50;
                class369 var51 = Statics.field3812;
                Statics.field1898 = var51;
                class369 var52 = Statics.field3812;
                Statics.field153 = var52;
                class369 var53 = Statics.field3812;
                class199.method5164(Statics.field3812);
                class369 var54 = Statics.field3812;
                Statics.field5075 = var54;
                class369 var55 = Statics.field3812;
                Statics.field5086 = var55;
                Statics.field4463 = new class510(Statics.field1402, 54, Statics.field1043, Statics.field3812);
                Statics.field1356 = new class510(Statics.field1402, 47, Statics.field1043, Statics.field3812);
                Statics.field1821 = new class110();
                class369 var56 = Statics.field3812;
                class369 var57 = Statics.field482;
                class369 var58 = Statics.field2024;
                Statics.field2058 = var56;
                Statics.field2051 = var57;
                Statics.field2064 = var58;
                class369 var59 = Statics.field3812;
                class369 var60 = Statics.field482;
                Statics.field1880 = var59;
                Statics.field1015 = var60;
                class369 var61 = Statics.field3812;
                class369 var62 = Statics.field482;
                Statics.field4643 = var62;
                if (var61.method6289()) {
                    Statics.field1591 = var61.method6294(35);
                    Statics.field1829 = new class178[Statics.field1591];
                    for (int var63 = 0; var63 < Statics.field1591; var63++) {
                        byte[] var64 = var61.method6284(35, var63);
                        Statics.field1829[var63] = new class178(var63);
                        if (var64 != null) {
                            Statics.field1829[var63].method3251(new class527(var64));
                            Statics.field1829[var63].method3269();
                        }
                    }
                }
                class76.field906 = class364.field3951;
                class76.field905 = 60;
                field518 = class93.field1136;
            } else {
                class76.field906 = class364.field4224 + (80 + Statics.field319.method6256() / 6) + "%";
                class76.field905 = 60;
            }
        } else if (field518 == class93.field1136) {
            int var65 = 0;
            if (Statics.field2659 == null) {
                Statics.field2659 = class542.method7349(Statics.field482, Statics.field4359.field4751, 0);
            } else {
                var65++;
            }
            if (Statics.field51 == null) {
                Statics.field51 = class542.method7349(Statics.field482, Statics.field4359.field4743, 0);
            } else {
                var65++;
            }
            if (Statics.field1815 == null) {
                class369 var66 = Statics.field482;
                int var67 = Statics.field4359.field4744;
                byte[] var68 = var66.method6284(var67, 0);
                boolean var69;
                if (var68 == null) {
                    var69 = false;
                } else {
                    class542.method3171(var68);
                    var69 = true;
                }
                class540[] var70;
                if (var69) {
                    var70 = class542.method8311();
                } else {
                    var70 = null;
                }
                Statics.field1815 = var70;
            } else {
                var65++;
            }
            if (Statics.field1435 == null) {
                Statics.field1435 = class542.method5165(Statics.field482, Statics.field4359.field4747, 0);
            } else {
                var65++;
            }
            if (Statics.field3817 == null) {
                Statics.field3817 = class542.method5165(Statics.field482, Statics.field4359.field4742, 0);
            } else {
                var65++;
            }
            if (Statics.field421 == null) {
                Statics.field421 = class542.method5165(Statics.field482, Statics.field4359.field4746, 0);
            } else {
                var65++;
            }
            if (Statics.field54 == null) {
                Statics.field54 = class542.method5165(Statics.field482, Statics.field4359.field4748, 0);
            } else {
                var65++;
            }
            if (Statics.field1817 == null) {
                Statics.field1817 = class542.method5165(Statics.field482, Statics.field4359.field4749, 0);
            } else {
                var65++;
            }
            if (Statics.field1909 == null) {
                Statics.field1909 = class542.method5165(Statics.field482, Statics.field4359.field4750, 0);
            } else {
                var65++;
            }
            if (Statics.field156 == null) {
                class369 var71 = Statics.field482;
                int var72 = Statics.field4359.field4745;
                byte[] var73 = var71.method6284(var72, 0);
                boolean var74;
                if (var73 == null) {
                    var74 = false;
                } else {
                    class542.method3171(var73);
                    var74 = true;
                }
                class540[] var75;
                if (var74) {
                    var75 = class542.method8311();
                } else {
                    var75 = null;
                }
                Statics.field156 = var75;
            } else {
                var65++;
            }
            if (Statics.field1583 == null) {
                class369 var76 = Statics.field482;
                int var77 = Statics.field4359.field4752;
                byte[] var78 = var76.method6284(var77, 0);
                boolean var79;
                if (var78 == null) {
                    var79 = false;
                } else {
                    class542.method3171(var78);
                    var79 = true;
                }
                class540[] var80;
                if (var79) {
                    var80 = class542.method8311();
                } else {
                    var80 = null;
                }
                Statics.field1583 = var80;
            } else {
                var65++;
            }
            if (var65 < 11) {
                class76.field906 = class364.field3952 + var65 * 100 / 12 + "%";
                class76.field905 = 70;
            } else {
                Statics.field4514 = Statics.field1583;
                Statics.field51.method8877();
                int var81 = (int) (Math.random() * 21.0D) - 10;
                int var82 = (int) (Math.random() * 21.0D) - 10;
                int var83 = (int) (Math.random() * 21.0D) - 10;
                int var84 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1815[0].method8852(var81 + var84, var82 + var84, var83 + var84);
                class76.field906 = class364.field3953;
                class76.field905 = 70;
                field518 = class93.field1130;
            }
        } else if (field518 == class93.field1130) {
            if (Statics.field115.method6289()) {
                Statics.field3102 = new class277(Statics.field115, Statics.field482, 20, Statics.field2450.method2420(), field488 ? 64 : 128);
                class267.method4675(Statics.field3102);
                class267.method4662(Statics.field2450.method2420());
                field518 = class93.field1144;
            } else {
                class76.field906 = class364.field4221 + "0%";
                class76.field905 = 90;
            }
        } else if (field518 == class93.field1144) {
            int var85 = Statics.field3102.method5007();
            if (var85 < 100) {
                class76.field906 = class364.field4221 + var85 + "%";
                class76.field905 = 90;
            } else {
                class76.field906 = class364.field3955;
                class76.field905 = 90;
                field518 = class93.field1139;
            }
        } else if (field518 == class93.field1139) {
            Statics.field474 = new class89();
            Statics.field195.method3875(Statics.field474, 10);
            class76.field906 = class364.field3956;
            class76.field905 = 92;
            field518 = class93.field1140;
        } else if (field518 == class93.field1140) {
            if (Statics.field3868.method6304("huffman", "")) {
                class350 var86 = new class350(Statics.field3868.method6303("huffman", ""));
                class351.method438(var86);
                class76.field906 = class364.field4188;
                class76.field905 = 94;
                field518 = class93.field1141;
            } else {
                class76.field906 = class364.field3957 + "%";
                class76.field905 = 94;
            }
        } else if (field518 == class93.field1141) {
            if (!Statics.field3399.method6289()) {
                class76.field906 = class364.field3959 + Statics.field3399.method6256() * 4 / 5 + "%";
                class76.field905 = 96;
            } else if (!Statics.field2642.method6289()) {
                class76.field906 = class364.field3959 + Statics.field2642.method6256() * 4 / 5 + "%";
                class76.field905 = 96;
            } else if (!Statics.field319.method6289()) {
                class76.field906 = class364.field3959 + (80 + Statics.field319.method6256() / 6) + "%";
                class76.field905 = 96;
            } else if (Statics.field2024.method6289()) {
                class76.field906 = class364.field3960;
                class76.field905 = 98;
                if (Statics.field319.method6302("version.dat", "")) {
                    class527 var87 = new class527(Statics.field319.method6303("version.dat", ""));
                    var87.method8412();
                }
                field518 = class93.field1142;
            } else {
                class76.field906 = class364.field3959 + (96 + Statics.field2024.method6256() / 50) + "%";
                class76.field905 = 96;
            }
        } else if (field518 == class93.field1142) {
            class76.field905 = 100;
            if (Statics.field2008.method6351() <= 0 || Statics.field2008.method6333(class256.field2634.field2628)) {
                if (Statics.field1919 == null) {
                    Statics.field1919 = new class495();
                    Statics.field1919.method7896(Statics.field2008, Statics.field1461, Statics.field2427, Statics.field4352, field634, Statics.field1815);
                }
                class76.field906 = class364.field3962;
                field518 = class93.field1143;
            } else {
                class76.field906 = class364.field4083 + Statics.field2008.method6307(class256.field2634.field2628) / 10 + "%";
            }
        } else if (field518 == class93.field1143) {
            method4139(10);
        }
    }

    @ObfuscatedName("kd.ha(IZZZZI)Loh;")
    public static class369 method4786(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class455 var5 = null;
        if (class212.field2291 != null) {
            var5 = new class455(arg0, class212.field2291, Statics.field127[arg0], 1000000);
        }
        return new class369(var5, Statics.field3119, Statics.field2557, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("hx.hu(IZZZZZI)Loh;")
    public static class369 method3778(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
        class455 var6 = null;
        if (class212.field2291 != null) {
            var6 = new class455(arg0, class212.field2291, Statics.field127[arg0], 1000000);
        }
        return new class369(var6, Statics.field3119, Statics.field2557, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("client.hh(I)V")
    public final void method1193() {
        class451 var1 = field590.method2737();
        class526 var2 = field590.field1409;
        try {
            if (field666 == 0) {
                if (Statics.field1897 == null && (field545.method2102() || field523 > 250)) {
                    Statics.field1897 = field545.method2105();
                    field545.method2103();
                    field545 = null;
                }
                if (Statics.field1897 != null) {
                    if (var1 != null) {
                        var1.method7538();
                        var1 = null;
                    }
                    Statics.field1126 = null;
                    field553 = false;
                    field523 = 0;
                    if (!field527.method8725()) {
                        method289(1);
                    } else if (this.method1257()) {
                        try {
                            this.method1187(Statics.field2127);
                            method289(21);
                        } catch (Throwable var55) {
                            class553.method6436((String) null, var55);
                            method3067(65);
                            return;
                        }
                    } else if (this.method1186()) {
                        try {
                            this.method1189(Statics.field4300, Statics.field1047);
                            method289(20);
                        } catch (Exception var54) {
                            class553.method6436((String) null, var54);
                            method3067(65);
                            return;
                        }
                    } else {
                        method3067(65);
                        return;
                    }
                }
            }
            if (field666 == 21) {
                if (this.field537 == null) {
                    if (this.field612 == null) {
                        method3067(65);
                        return;
                    }
                    if (!this.field612.method277()) {
                        return;
                    }
                    if (this.field612.method261()) {
                        class553.method6436(this.field612.method258(), (Throwable) null);
                        method3067(65);
                        this.field612 = null;
                        return;
                    }
                    class21 var7 = this.field612.method263();
                    if (var7.method291() != 200) {
                        method3067(65);
                        this.field612 = null;
                        return;
                    }
                    field523 = 0;
                    class475 var8 = new class475(var7.method293());
                    try {
                        Statics.field1403 = var8.method7794().getString("access_token");
                        Statics.field2127 = var8.method7794().getString("refresh_token");
                    } catch (Exception var52) {
                        class553.method6436("Error parsing tokens", var52);
                        method3067(65);
                        this.field612 = null;
                        return;
                    }
                } else if (this.field537.isDone()) {
                    if (this.field537.isCancelled()) {
                        method3067(65);
                        this.field537 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field537.get();
                        if (!var5.isSuccess()) {
                            method3067(65);
                            this.field537 = null;
                            return;
                        }
                        Statics.field1403 = var5.getAccessToken();
                        Statics.field2127 = var5.getRefreshToken();
                        this.field537 = null;
                    } catch (Exception var53) {
                        class553.method6436((String) null, var53);
                        method3067(65);
                        this.field537 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1289(Statics.field1403);
                method289(20);
            }
            if (field666 == 20) {
                if (this.field606 == null) {
                    if (this.field658 == null) {
                        method3067(65);
                        return;
                    }
                    if (!this.field658.method277()) {
                        return;
                    }
                    if (this.field658.method261()) {
                        class553.method6436(this.field658.method258(), (Throwable) null);
                        method3067(65);
                        this.field658 = null;
                        return;
                    }
                    class21 var12 = this.field658.method263();
                    if (var12.method291() != 200) {
                        class553.method6436("Response code: " + var12.method291() + "Response body: " + var12.method293(), (Throwable) null);
                        method3067(65);
                        this.field658 = null;
                        return;
                    }
                    List var13 = (List) var12.method295().get("Content-Type");
                    if (var13 != null && var13.contains(class473.field4811.method7785())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method293());
                            this.field528 = var14.getString("token");
                        } catch (JSONException var50) {
                            class553.method6436((String) null, var50);
                            method3067(65);
                            this.field658 = null;
                            return;
                        }
                    } else {
                        this.field528 = var12.method293();
                    }
                    this.field658 = null;
                } else if (this.field606.isDone()) {
                    if (this.field606.isCancelled()) {
                        method3067(65);
                        this.field606 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field606.get();
                        if (!var10.isSuccess()) {
                            method3067(65);
                            this.field606 = null;
                            return;
                        }
                        this.field528 = var10.getToken();
                        this.field606 = null;
                    } catch (Exception var51) {
                        class553.method6436((String) null, var51);
                        method3067(65);
                        this.field606 = null;
                        return;
                    }
                } else {
                    return;
                }
                field523 = 0;
                method289(1);
            }
            if (field666 == 1) {
                if (Statics.field1126 == null) {
                    Statics.field1126 = Statics.field195.method3870(Statics.field4681, Statics.field2613);
                }
                if (Statics.field1126.field2326 == 2) {
                    throw new IOException();
                }
                if (Statics.field1126.field2326 == 1) {
                    var1 = class451.method4090((Socket) Statics.field1126.field2325, 40000, 5000);
                    field590.method2720(var1);
                    Statics.field1126 = null;
                    method289(2);
                }
            }
            if (field666 == 2) {
                field590.method2717();
                class308 var16 = class308.method3373();
                var16.field3243.method8393(class310.field3378.field3382);
                field590.method2719(var16);
                field590.method2723();
                var2.field5137 = 0;
                method289(3);
            }
            if (field666 == 3) {
                if (Statics.field3495 != null) {
                    Statics.field3495.method789();
                }
                if (var1.method7528(1)) {
                    int var17 = var1.method7530();
                    if (Statics.field3495 != null) {
                        Statics.field3495.method789();
                    }
                    if (var17 != 0) {
                        method3067(var17);
                        return;
                    }
                    var2.field5137 = 0;
                    method289(4);
                }
            }
            if (field666 == 4) {
                if (var2.field5137 < 8) {
                    int var18 = var1.method7544();
                    if (var18 > 8 - var2.field5137) {
                        var18 = 8 - var2.field5137;
                    }
                    if (var18 > 0) {
                        var1.method7531(var2.field5140, var2.field5137, var18);
                        var2.field5137 += var18;
                    }
                }
                if (var2.field5137 == 8) {
                    var2.field5137 = 0;
                    Statics.field2338 = var2.method8417();
                    method289(5);
                }
            }
            if (field666 == 5) {
                field590.field1409.field5137 = 0;
                field590.method2717();
                class526 var19 = new class526(500);
                int[] var20 = new int[] { Statics.field1897.nextInt(), Statics.field1897.nextInt(), Statics.field1897.nextInt(), Statics.field1897.nextInt() };
                var19.field5137 = 0;
                var19.method8393(1);
                var19.method8396(var20[0]);
                var19.method8396(var20[1]);
                var19.method8396(var20[2]);
                var19.method8396(var20[3]);
                var19.method8398(Statics.field2338);
                if (field525 == 40) {
                    var19.method8396(Statics.field2306[0]);
                    var19.method8396(Statics.field2306[1]);
                    var19.method8396(Statics.field2306[2]);
                    var19.method8396(Statics.field2306[3]);
                } else {
                    if (field525 == 50) {
                        var19.method8393(class125.field1473.method41());
                        var19.method8396(Statics.field1749);
                    } else {
                        var19.method8393(field526.method41());
                        switch(field526.field1469) {
                            case 0:
                            case 1:
                                var19.method8390(Statics.field351);
                                var19.field5137++;
                                break;
                            case 2:
                                var19.field5137 += 4;
                                break;
                            case 3:
                                var19.method8396(Statics.field2450.method2439(class76.field914));
                        }
                    }
                    if (field527.method8725()) {
                        var19.method8393(class532.field5193.method41());
                        var19.method8400(this.field528);
                    } else {
                        var19.method8393(class532.field5198.method41());
                        var19.method8400(class76.field915);
                    }
                }
                var19.method8567(class75.field890, class75.field891);
                Statics.field2306 = var20;
                class308 var21 = class308.method3373();
                var21.field3243.field5137 = 0;
                if (field525 == 40) {
                    var21.field3243.method8393(class310.field3381.field3382);
                } else {
                    var21.field3243.method8393(class310.field3384.field3382);
                }
                var21.field3243.method8394(0);
                int var22 = var21.field3243.field5137;
                var21.field3243.method8396(218);
                var21.field3243.method8396(1);
                var21.field3243.method8393(field490);
                var21.field3243.method8393(field491);
                byte var23 = 0;
                var21.field3243.method8393(var23);
                var21.field3243.method8575(var19.field5140, 0, var19.field5137);
                int var24 = var21.field3243.field5137;
                var21.field3243.method8400(class76.field914);
                var21.field3243.method8393((field718 ? 1 : 0) << 1 | (field488 ? 1 : 0));
                var21.field3243.method8394(Statics.field4410);
                var21.field3243.method8394(Statics.field321);
                method6198(var21.field3243);
                var21.field3243.method8400(Statics.field879);
                var21.field3243.method8396(Statics.field112);
                if (field493 > 213) {
                    var21.field3243.method8393(0);
                }
                class527 var25 = new class527(Statics.field420.method7845());
                Statics.field420.method7844(var25);
                var21.field3243.method8575(var25.field5140, 0, var25.field5140.length);
                var21.field3243.method8393(field490);
                var21.field3243.method8396(0);
                var21.field3243.method8461(Statics.field282.field4314);
                var21.field3243.method8466(Statics.field299.field4314);
                var21.field3243.method8465(Statics.field1644.field4314);
                var21.field3243.method8466(Statics.field26.field4314);
                var21.field3243.method8465(Statics.field5060.field4314);
                var21.field3243.method8465(Statics.field2042.field4314);
                var21.field3243.method8466(Statics.field3399.field4314);
                var21.field3243.method8461(Statics.field1442.field4314);
                var21.field3243.method8465(Statics.field3868.field4314);
                var21.field3243.method8461(Statics.field2008.field4314);
                var21.field3243.method8466(Statics.field115.field4314);
                var21.field3243.method8461(Statics.field2024.field4314);
                var21.field3243.method8396(Statics.field2427.field4314);
                var21.field3243.method8466(0);
                var21.field3243.method8465(Statics.field319.field4314);
                var21.field3243.method8465(Statics.field482.field4314);
                var21.field3243.method8465(Statics.field4413.field4314);
                var21.field3243.method8396(Statics.field2533.field4314);
                var21.field3243.method8465(Statics.field93.field4314);
                var21.field3243.method8461(Statics.field3812.field4314);
                var21.field3243.method8461(Statics.field1461.field4314);
                var21.field3243.method8435(var20, var24, var21.field3243.field5137);
                var21.field3243.method8406(var21.field3243.field5137 - var22);
                field590.method2719(var21);
                field590.method2723();
                field590.field1405 = new class544(var20);
                int[] var26 = new int[4];
                for (int var27 = 0; var27 < 4; var27++) {
                    var26[var27] = var20[var27] + 50;
                }
                var2.method8352(var26);
                method289(6);
            }
            if (field666 == 6 && var1.method7544() > 0) {
                int var28 = var1.method7530();
                if (var28 == 61) {
                    int var29 = var1.method7544();
                    Statics.field1170 = var29 == 1 && var1.method7530() == 1;
                    method289(5);
                }
                if (var28 == 21 && field525 == 20) {
                    method289(12);
                } else if (var28 == 2) {
                    method289(14);
                } else if (var28 == 15 && field525 == 40) {
                    field590.field1411 = -1;
                    method289(19);
                } else if (var28 == 64) {
                    method289(10);
                } else if (var28 == 23 && field615 < 1) {
                    field615++;
                    method289(0);
                } else if (var28 == 29) {
                    method289(17);
                } else if (var28 == 69) {
                    method289(7);
                } else {
                    method3067(var28);
                    return;
                }
            }
            if (field666 == 7 && var1.method7544() >= 2) {
                var1.method7531(var2.field5140, 0, 2);
                var2.field5137 = 0;
                Statics.field4411 = var2.method8412();
                method289(8);
            }
            if (field666 == 8 && var1.method7544() >= Statics.field4411) {
                var2.field5137 = 0;
                var1.method7531(var2.field5140, var2.field5137, Statics.field4411);
                class7 var30 = class7.method3944()[var2.method8410()];
                try {
                    class4 var31 = class5.method3279(var30);
                    this.field543 = new class8(var2, var31);
                    method289(9);
                } catch (Exception var49) {
                    method3067(22);
                    return;
                }
            }
            if (field666 == 9 && this.field543.method47()) {
                this.field703 = this.field543.method48();
                this.field543.method58();
                this.field543 = null;
                if (this.field703 == null) {
                    method3067(22);
                    return;
                }
                field590.method2717();
                class308 var33 = class308.method3373();
                var33.field3243.method8393(class310.field3380.field3382);
                var33.field3243.method8394(this.field703.field5137);
                var33.field3243.method8517(this.field703);
                field590.method2719(var33);
                field590.method2723();
                this.field703 = null;
                method289(6);
            }
            if (field666 == 10 && var1.method7544() > 0) {
                Statics.field2352 = var1.method7530();
                method289(11);
            }
            if (field666 == 11 && var1.method7544() >= Statics.field2352) {
                var1.method7531(var2.field5140, 0, Statics.field2352);
                var2.field5137 = 0;
                method289(6);
            }
            if (field666 == 12 && var1.method7544() > 0) {
                field676 = (var1.method7530() + 3) * 60;
                method289(13);
            }
            if (field666 == 13) {
                field523 = 0;
                class76.method3022(class364.field3969, class364.field3970, field676 / 60 + class364.field4003);
                if (--field676 <= 0) {
                    method289(0);
                }
            } else {
                if (field666 == 14 && var1.method7544() >= 1) {
                    Statics.field304 = var1.method7530();
                    method289(15);
                }
                if (field666 == 15 && var1.method7544() >= Statics.field304) {
                    boolean var34 = var1.method7530() == 1;
                    var1.method7531(var2.field5140, 0, 4);
                    var2.field5137 = 0;
                    boolean var35 = false;
                    if (var34) {
                        int var36 = var2.method8355() << 24;
                        int var37 = var36 | var2.method8355() << 16;
                        int var38 = var37 | var2.method8355() << 8;
                        int var39 = var38 | var2.method8355();
                        Statics.field2450.method2437(class76.field914, var39);
                    }
                    if (field540) {
                        Statics.field2450.method2458(class76.field914);
                    } else {
                        Statics.field2450.method2458((String) null);
                    }
                    class99.method5008();
                    field567 = var1.method7530();
                    field668 = var1.method7530() == 1;
                    field790 = var1.method7530();
                    field790 <<= 0x8;
                    field790 += var1.method7530();
                    field755 = var1.method7530();
                    var1.method7531(var2.field5140, 0, 8);
                    var2.field5137 = 0;
                    this.field544 = var2.method8417();
                    var1.method7531(var2.field5140, 0, 8);
                    var2.field5137 = 0;
                    field699 = var2.method8417();
                    if (field493 >= 214) {
                        var1.method7531(var2.field5140, 0, 8);
                        var2.field5137 = 0;
                        var2.method8417();
                    }
                    var1.method7531(var2.field5140, 0, 1);
                    var2.field5137 = 0;
                    class309[] var40 = class309.method162();
                    int var41 = var2.method8357();
                    if (var41 < 0 || var41 >= var40.length) {
                        throw new IOException(var41 + " " + var2.field5137);
                    }
                    field590.field1418 = var40[var41];
                    field590.field1411 = field590.field1418.field3377;
                    var1.method7531(var2.field5140, 0, 2);
                    var2.field5137 = 0;
                    field590.field1411 = var2.method8412();
                    try {
                        class27.method388(Statics.field3544, "zap");
                    } catch (Throwable var48) {
                    }
                    method289(16);
                }
                if (field666 != 16) {
                    if (field666 == 17 && var1.method7544() >= 2) {
                        var2.field5137 = 0;
                        var1.method7531(var2.field5140, 0, 2);
                        var2.field5137 = 0;
                        Statics.field479 = var2.method8412();
                        method289(18);
                    }
                    if (field666 == 18 && var1.method7544() >= Statics.field479) {
                        var2.field5137 = 0;
                        var1.method7531(var2.field5140, 0, Statics.field479);
                        var2.field5137 = 0;
                        String var43 = var2.method8535();
                        String var44 = var2.method8535();
                        String var45 = var2.method8535();
                        class76.method3022(var43, var44, var45);
                        method4139(10);
                        if (field527.method8725()) {
                            class76.method2815(9);
                        }
                    }
                    if (field666 == 19) {
                        if (field590.field1411 == -1) {
                            if (var1.method7544() < 2) {
                                return;
                            }
                            var1.method7531(var2.field5140, 0, 2);
                            var2.field5137 = 0;
                            field590.field1411 = var2.method8412();
                        }
                        if (var1.method7544() >= field590.field1411) {
                            var1.method7531(var2.field5140, 0, field590.field1411);
                            var2.field5137 = 0;
                            int var46 = field590.field1411;
                            field554.method7213();
                            method257();
                            class108.method2637(var2);
                            if (var2.field5137 != var46) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field523++;
                        if (field523 > 2000) {
                            if (field615 < 1) {
                                if (Statics.field2633 == Statics.field2613) {
                                    Statics.field2613 = Statics.field4708;
                                } else {
                                    Statics.field2613 = Statics.field2633;
                                }
                                field615++;
                                method289(0);
                            } else {
                                method3067(-3);
                            }
                        }
                    }
                } else if (var1.method7544() >= field590.field1411) {
                    var2.field5137 = 0;
                    var1.method7531(var2.field5140, 0, field590.field1411);
                    field554.method7211();
                    method1029();
                    class108.method2637(var2);
                    Statics.field4741 = -1;
                    method6468(false, var2, field493 >= 218);
                    field590.field1418 = null;
                }
            }
        } catch (IOException var56) {
            if (field615 < 1) {
                if (Statics.field2633 == Statics.field2613) {
                    Statics.field2613 = Statics.field4708;
                } else {
                    Statics.field2613 = Statics.field2633;
                }
                field615++;
                method289(0);
            } else {
                method3067(-2);
            }
        }
    }

    @ObfuscatedName("cg.ht(I)V")
    public static void method1029() {
        field486 = -1L;
        Statics.field474.field1066 = 0;
        Statics.field3897 = true;
        field788 = true;
        field639 = -1L;
        class37.field233 = new class392();
        field590.method2717();
        field590.field1409.field5137 = 0;
        field590.field1418 = null;
        field590.field1415 = null;
        field590.field1410 = null;
        field590.field1417 = null;
        field590.field1411 = 0;
        field590.field1413 = 0;
        field506 = 0;
        field772 = 0;
        field507 = 0;
        method3161();
        class36.method4568(0);
        class111.method2403();
        field728 = 0;
        field632 = false;
        field754 = 0;
        field573 = 0;
        field578 = 0;
        Statics.field3457 = null;
        field740 = 0;
        field602 = -1;
        field738 = 0;
        field739 = 0;
        field515 = class104.field1337;
        field653 = class104.field1337;
        field547 = 0;
        class108.field1362 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class108.field1358[var0] = null;
            class108.field1357[var0] = class229.field2410;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field651[var1] = null;
        }
        for (int var2 = 0; var2 < 65536; var2++) {
            field776[var2] = null;
        }
        field624 = -1;
        field627.method6576();
        field628.method6576();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field697[var3][var4][var5] = null;
                }
            }
        }
        field626 = new class390();
        Statics.field52.method1801();
        if (Statics.field1816 > 5000) {
        }
        for (int var6 = 0; var6 < Statics.field1816; var6++) {
            class176 var7 = class176.method3722(var6);
            if (var7 != null) {
                class333.field3551[var6] = 0;
                class333.field3554[var6] = 0;
            }
        }
        Statics.field1821.method2656();
        field667 = -1;
        if (field505 != -1) {
            Statics.field1878.method5634(field505);
        }
        for (class87 var8 = (class87) field659.method8157(); var8 != null; var8 = (class87) field659.method8158()) {
            method5307(var8, true);
        }
        field505 = -1;
        field659 = new class501(8);
        field663 = null;
        method3161();
        field774.method5665((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field621[var9] = null;
            field622[var9] = false;
        }
        class85.method1104();
        field499 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field709[var10] = true;
        }
        if (field590 != null && field590.field1405 != null) {
            class308 var11 = class308.method2768(class306.field3210, field590.field1405);
            var11.field3243.method8393(method1169());
            var11.field3243.method8394(Statics.field4410);
            var11.field3243.method8394(Statics.field321);
            field590.method2719(var11);
        }
        Statics.field106 = null;
        Statics.field4839 = null;
        Arrays.fill(field731, (Object) null);
        Statics.field1024 = null;
        Arrays.fill(field732, (Object) null);
        for (int var12 = 0; var12 < 8; var12++) {
            field778[var12] = new class380();
        }
        Statics.field16 = null;
        field495 = false;
    }

    @ObfuscatedName("am.ho(I)V")
    public static void method257() {
        field590.method2717();
        field590.field1409.field5137 = 0;
        field590.field1418 = null;
        field590.field1415 = null;
        field590.field1410 = null;
        field590.field1417 = null;
        field590.field1411 = 0;
        field590.field1413 = 0;
        field506 = 0;
        method3161();
        field740 = 0;
        field738 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field651[var0] = null;
        }
        Statics.field2420 = null;
        for (int var1 = 0; var1 < field776.length; var1++) {
            class101 var2 = field776[var1];
            if (var2 != null) {
                var2.field1223 = -1;
                var2.field1184 = false;
            }
        }
        class85.method1104();
        method4139(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field709[var3] = true;
        }
        if (field590 == null || field590.field1405 == null) {
            return;
        }
        class308 var4 = class308.method2768(class306.field3210, field590.field1405);
        var4.field3243.method8393(method1169());
        var4.field3243.method8394(Statics.field4410);
        var4.field3243.method8394(Statics.field321);
        field590.method2719(var4);
    }

    @ObfuscatedName("fk.hr(II)V")
    public static void method3067(int arg0) {
        int var1 = class76.field937;
        if (arg0 == -3) {
            class76.method3022(class364.field3972, class364.field3973, class364.field4169);
        } else if (arg0 == -2) {
            class76.method3022(class364.field3975, class364.field3976, class364.field3977);
        } else if (arg0 == -1) {
            class76.method3022(class364.field3978, class364.field4140, class364.field4091);
        } else if (arg0 == 3) {
            class76.method2815(3);
            class76.field932 = 1;
        } else if (arg0 == 4) {
            class76.method2932(0);
        } else if (arg0 == 5) {
            class76.field932 = 2;
            class76.method3022(class364.field3984, class364.field3985, class364.field4139);
        } else if (arg0 == 68) {
            if (!field495) {
                field495 = true;
                method7205();
                return;
            }
            class76.method3022(class364.field4001, class364.field3988, class364.field3989);
        } else if (!field492 && arg0 == 6) {
            class76.method3022(class364.field4001, class364.field3988, class364.field3989);
        } else if (arg0 == 7) {
            class76.method3022(class364.field3971, class364.field3991, class364.field4098);
        } else if (arg0 == 8) {
            class76.method3022(class364.field4132, class364.field3994, class364.field3995);
        } else if (arg0 == 9) {
            class76.method3022(class364.field4162, class364.field3997, class364.field3979);
        } else if (arg0 == 10) {
            class76.method3022(class364.field3999, class364.field4168, class364.field4220);
        } else if (arg0 == 11) {
            class76.method3022(class364.field4002, class364.field4021, class364.field4050);
        } else if (arg0 == 12) {
            class76.method3022(class364.field4005, class364.field4141, class364.field4007);
        } else if (arg0 == 13) {
            class76.method3022(class364.field4008, class364.field4009, class364.field4000);
        } else if (arg0 == 14) {
            class76.method3022(class364.field4011, class364.field4225, class364.field4017);
        } else if (arg0 == 16) {
            class76.method3022(class364.field4014, class364.field4015, class364.field4064);
            class76.method2815(33);
        } else if (arg0 == 17) {
            class76.method3022(class364.field4061, class364.field4012, class364.field4019);
        } else if (arg0 == 18) {
            class76.method2932(1);
        } else if (arg0 == 19) {
            class76.method3022(class364.field4073, class364.field4205, class364.field4025);
        } else if (arg0 == 20) {
            class76.method3022(class364.field4090, class364.field4027, class364.field4028);
        } else if (arg0 == 22) {
            class76.method3022(class364.field4029, class364.field4030, class364.field4031);
        } else if (arg0 == 23) {
            class76.method3022(class364.field4032, class364.field4033, class364.field4034);
        } else if (arg0 == 24) {
            class76.method3022(class364.field3998, class364.field4036, class364.field4037);
        } else if (arg0 == 25) {
            class76.method3022(class364.field4038, class364.field4039, class364.field4040);
        } else if (arg0 == 26) {
            class76.method3022(class364.field4041, class364.field4042, class364.field4043);
        } else if (arg0 == 27) {
            class76.method3022(class364.field4044, class364.field3961, class364.field4046);
        } else if (arg0 == 31) {
            class76.method3022(class364.field4053, class364.field4054, class364.field4055);
        } else if (arg0 == 32) {
            class76.method2932(2);
        } else if (arg0 == 37) {
            class76.method3022(class364.field3946, class364.field3950, class364.field3929);
        } else if (arg0 == 38) {
            class76.method3022(class364.field4062, class364.field4063, class364.field3967);
        } else if (arg0 == 55) {
            class76.method2815(8);
        } else if (arg0 == 56) {
            class76.method3022(class364.field4069, class364.field4070, class364.field4071);
            method4139(11);
            return;
        } else if (arg0 == 57) {
            class76.method3022(class364.field3937, class364.field4229, class364.field4059);
            method4139(11);
            return;
        } else if (arg0 == 61) {
            class76.method3022("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class76.method2815(7);
        } else if (arg0 == 62) {
            method4139(10);
            class76.method2815(9);
            class76.method3022(class364.field4045, class364.field4076, class364.field3980);
            return;
        } else if (arg0 == 63) {
            method4139(10);
            class76.method2815(9);
            class76.method3022(class364.field4078, class364.field3993, class364.field4080);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method4139(10);
            class76.method2815(9);
            class76.method3022(class364.field4081, class364.field4082, class364.field4157);
            return;
        } else if (arg0 == 71) {
            method4139(10);
            class76.method2815(7);
            class76.method3022("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method4139(10);
            class76.method2815(6);
            class76.method3022(class364.field4212, class364.field4016, class364.field4214);
        } else if (arg0 == 72) {
            method4139(10);
            class76.method2815(32);
        } else {
            class76.method3022(class364.field4159, class364.field4085, class364.field4182);
        }
        method4139(10);
        int var4 = class76.field937;
        boolean var5 = var1 != var4;
        if (!var5 && field527.method8725()) {
            class76.method2815(9);
        }
    }

    @ObfuscatedName("as.hy(B)V")
    public static final void method171() {
        field590.method2718();
        method1874();
        Statics.field231.method4919();
        for (int var0 = 0; var0 < 4; var0++) {
            field561[var0].method3987();
        }
        field726.method3929();
        System.gc();
        class317.method4392(0, 0);
        class317.method7786();
        field741 = false;
        class70.method4434();
        method4139(10);
    }

    @ObfuscatedName("ef.hz(II)V")
    public static final void method2735(int arg0) {
        method171();
        switch(arg0) {
            case 1:
                class76.method2815(24);
                class76.method3022(class364.field4124, class364.field4160, class364.field4161);
                break;
            case 2:
                class76.method3982();
        }
    }

    @ObfuscatedName("lf.hs(I)J")
    public static long method5246() {
        return field699;
    }

    @ObfuscatedName("ca.hv(S)V")
    public static final void method1874() {
        class183.method2030();
        class185.field1900.method5292();
        Statics.method3219();
        class520.method3320();
        class518.field5073.method5292();
        class184.field1889.method5292();
        class204.method2999();
        class195.method3223();
        class181.method2613();
        class201.method1743();
        class173.method3054();
        class180.method3543();
        class171.field1798.method5292();
        class202.method4746();
        class178.field1842.method5292();
        class186.field1902.method5292();
        class189.method2236();
        class203.field2169.method5292();
        class203.field2161.method5292();
        class203.field2136.method5292();
        class199.method6527();
        class205.field2209.method5292();
        class205.field2210.method5292();
        class205.field2223.method5292();
        class194.field1994.method5292();
        class194.field1995.method5292();
        Statics.method3278();
        class197.method4485();
        Statics.field4463.method8251();
        Statics.field1356.method8251();
        class190.field1969.method5292();
        class192.field1980.method5292();
        class179.field1853.method5292();
        class177.method3290();
        class172.field1803.method5292();
        class175.method3837();
        class198.field2033.method5292();
        class176.method5336();
        class196.field2023.method5292();
        field610.method5292();
        field782.method5292();
        class341.method4017();
        Statics.field1878.method5639();
        ((class277) class267.field2773.field3043).method4991();
        class79.method323();
        field780.method7309();
        Statics.field1442.method6349();
        Statics.field1644.method6349();
        Statics.field3868.method6349();
        Statics.field319.method6349();
        Statics.field3812.method6349();
        Statics.field2779.method6349();
        Statics.field299.method6349();
        Statics.field2024.method6349();
        Statics.field3399.method6349();
        Statics.field2642.method6349();
        Statics.field4413.method6349();
        Statics.field282.method6349();
        Statics.field2533.method6349();
        Statics.field5060.method6349();
        Statics.field93.method6349();
        Statics.field26.method6349();
        Statics.field482.method6349();
        Statics.field115.method6349();
        Statics.field2042.method6349();
        Statics.field2427.method6349();
        Statics.field1461.method6349();
        Statics.field2008.method6349();
    }

    @ObfuscatedName("az.hd(I)V")
    public static final void method79() {
        if (field772 > 0) {
            method171();
        } else {
            field554.method7209();
            method4139(40);
            Statics.field5 = field590.method2737();
            field590.method2722();
        }
    }

    @ObfuscatedName("hg.hx(ZB)V")
    public static final void method3439(boolean arg0) {
        if (arg0) {
            field526 = class76.field921 ? class125.field1470 : class125.field1472;
        } else {
            field526 = Statics.field2450.method2438(class76.field914) ? class125.field1475 : class125.field1471;
        }
    }

    @ObfuscatedName("client.hm(I)V")
    public final void method1194() {
        if (field506 > 1) {
            field506--;
        }
        if (field772 > 0) {
            field772--;
        }
        if (field553) {
            field553 = false;
            method79();
            return;
        }
        if (!field557) {
            Statics.method2852();
        }
        for (int var1 = 0; var1 < 100 && this.method1725(field590); var1++) {
        }
        if (field525 != 30) {
            return;
        }
        while (class37.method3916()) {
            class308 var2 = class308.method2768(class306.field3193, field590.field1405);
            var2.field3243.method8393(0);
            int var3 = var2.field3243.field5137;
            class37.method7124(var2.field3243);
            var2.field3243.method8407(var2.field3243.field5137 - var3);
            field590.method2719(var2);
        }
        if (field554.field4597) {
            class308 var4 = class308.method2768(class306.field3170, field590.field1405);
            var4.field3243.method8393(0);
            int var5 = var4.field3243.field5137;
            field554.method7214(var4.field3243);
            var4.field3243.method8407(var4.field3243.field5137 - var5);
            field590.method2719(var4);
            field554.method7212();
        }
        Object var6 = Statics.field474.field1070;
        synchronized (Statics.field474.field1070) {
            if (!field730) {
                Statics.field474.field1066 = 0;
            } else if (class36.field229 != 0 || Statics.field474.field1066 >= 40) {
                class308 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field474.field1066 && (var7 == null || var7.field3243.field5137 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field474.field1068[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field474.field1069[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field502 != var14 || field503 != var13) {
                        if (var7 == null) {
                            var7 = class308.method2768(class306.field3198, field590.field1405);
                            var7.field3243.method8393(0);
                            var8 = var7.field3243.field5137;
                            var7.field3243.field5137 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field504 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field502;
                            var16 = var13 - field503;
                            var17 = (int) ((Statics.field474.field1071[var12] - field504) / 20L);
                            var10 = (int) ((Statics.field474.field1071[var12] - field504) % 20L + (long) var10);
                        }
                        field502 = var14;
                        field503 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field3243.method8394((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field3243.method8393(var17 + 128);
                            var7.field3243.method8394((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field3243.method8393(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3243.method8396(Integer.MIN_VALUE);
                            } else {
                                var7.field3243.method8396(var14 | var13 << 16);
                            }
                        } else {
                            var7.field3243.method8394((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3243.method8396(Integer.MIN_VALUE);
                            } else {
                                var7.field3243.method8396(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field504 = Statics.field474.field1071[var12];
                    }
                }
                if (var7 != null) {
                    var7.field3243.method8407(var7.field3243.field5137 - var8);
                    int var18 = var7.field3243.field5137;
                    var7.field3243.field5137 = var8;
                    var7.field3243.method8393(var10 / var11);
                    var7.field3243.method8393(var10 % var11);
                    var7.field3243.field5137 = var18;
                    field590.method2719(var7);
                }
                if (var9 >= Statics.field474.field1066) {
                    Statics.field474.field1066 = 0;
                } else {
                    Statics.field474.field1066 -= var9;
                    System.arraycopy(Statics.field474.field1069, var9, Statics.field474.field1069, 0, Statics.field474.field1066);
                    System.arraycopy(Statics.field474.field1068, var9, Statics.field474.field1068, 0, Statics.field474.field1066);
                    System.arraycopy(Statics.field474.field1071, var9, Statics.field474.field1071, 0, Statics.field474.field1066);
                }
            }
        }
        if (class36.field229 == 1 || !Statics.field96 && class36.field229 == 4 || class36.field229 == 2) {
            long var20 = class36.field211 - field486;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field486 = class36.field211;
            int var22 = class36.field210;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field321) {
                var22 = Statics.field321;
            }
            int var23 = class36.field214;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field4410) {
                var23 = Statics.field4410;
            }
            int var24 = (int) var20;
            class308 var25 = class308.method2768(class306.field3165, field590.field1405);
            var25.field3243.method8394((var24 << 1) + (class36.field229 == 2 ? 1 : 0));
            var25.field3243.method8394(var23);
            var25.field3243.method8394(var22);
            field590.method2719(var25);
        }
        if (field700 != 0) {
            class308 var26 = class308.method2768(class306.field3172, field590.field1405);
            var26.field3243.method8394(field700);
            field590.method2719(var26);
        }
        if (field725.field2355 > 0) {
            class308 var27 = class308.method2768(class306.field3214, field590.field1405);
            var27.field3243.method8394(0);
            int var28 = var27.field3243.field5137;
            long var29 = class313.method3460();
            for (int var31 = 0; var31 < field725.field2355; var31++) {
                long var32 = var29 - field639;
                if (var32 > 16777215L) {
                    var32 = 16777215L;
                }
                field639 = var29;
                var27.field3243.method8464((int) var32);
                var27.field3243.method8441(field725.field2354[var31]);
            }
            var27.field3243.method8406(var27.field3243.field5137 - var28);
            field590.method2719(var27);
        }
        if (field524 > 0) {
            field524--;
        }
        if (field725.method3952(96) || field725.method3952(97) || field725.method3952(98) || field725.method3952(99)) {
            field588 = true;
        }
        if (field588 && field524 <= 0) {
            field524 = 20;
            field588 = false;
            class308 var34 = class308.method2768(class306.field3217, field590.field1405);
            var34.field3243.method8449(field572);
            var34.field3243.method8449(field573);
            field590.method2719(var34);
        }
        if (Statics.field3897 && !field788) {
            field788 = true;
            class308 var35 = class308.method2768(class306.field3197, field590.field1405);
            var35.field3243.method8393(1);
            field590.method2719(var35);
        }
        if (!Statics.field3897 && field788) {
            field788 = false;
            class308 var36 = class308.method2768(class306.field3197, field590.field1405);
            var36.field3243.method8393(0);
            field590.method2719(var36);
        }
        if (Statics.field1919 != null) {
            Statics.field1919.method7897();
        }
        if (Statics.field3816) {
            if (Statics.field106 != null) {
                Statics.field106.method7449();
            }
            for (int var37 = 0; var37 < class108.field1362; var37++) {
                class92 var38 = field651[class108.field1370[var37]];
                var38.method2298();
            }
            Statics.field3816 = false;
        }
        method3080();
        method7310();
        if (field525 != 30) {
            return;
        }
        for (class95 var39 = (class95) field626.method6579(); var39 != null; var39 = (class95) field626.method6549()) {
            if (var39.field1166 > 0) {
                var39.field1166--;
            }
            if (var39.field1166 == 0) {
                if (var39.field1157 >= 0) {
                    int var40 = var39.field1157;
                    int var41 = var39.field1159;
                    class202 var42 = Statics.method4138(var40);
                    if (var41 == 11) {
                        var41 = 10;
                    }
                    if (var41 >= 5 && var41 <= 8) {
                        var41 = 4;
                    }
                    boolean var43 = var42.method3577(var41);
                    if (!var43) {
                        continue;
                    }
                }
                method4516(var39.field1165, var39.field1154, var39.field1155, var39.field1156, var39.field1157, var39.field1158, var39.field1159, var39.field1153);
                var39.method7828();
            } else {
                if (var39.field1164 > 0) {
                    var39.field1164--;
                }
                if (var39.field1164 == 0 && var39.field1155 >= 1 && var39.field1156 >= 1 && var39.field1155 <= 102 && var39.field1156 <= 102 && (var39.field1163 < 0 || class82.method3050(var39.field1163, var39.field1162))) {
                    method4516(var39.field1165, var39.field1154, var39.field1155, var39.field1156, var39.field1163, var39.field1161, var39.field1162, var39.field1153);
                    var39.field1164 = -1;
                    if (var39.field1163 == var39.field1157 && var39.field1157 == -1) {
                        var39.method7828();
                    } else if (var39.field1163 == var39.field1157 && var39.field1161 == var39.field1158 && var39.field1162 == var39.field1159) {
                        var39.method7828();
                    }
                }
            }
        }
        int var10002;
        for (int var44 = 0; var44 < field754; var44++) {
            var10002 = field745[var44]--;
            if (field745[var44] >= -10) {
                class40 var46 = field603[var44];
                if (var46 == null) {
                    class40 var10000 = (class40) null;
                    var46 = class40.method755(Statics.field4413, field743[var44], 0);
                    if (var46 == null) {
                        continue;
                    }
                    field745[var44] += var46.method756();
                    field603[var44] = var46;
                }
                if (field745[var44] < 0) {
                    int var53;
                    if (field746[var44] == 0) {
                        var53 = Statics.field2450.method2428();
                    } else {
                        int var47 = (field746[var44] & 0xFF) * 128;
                        int var48 = field746[var44] >> 16 & 0xFF;
                        int var49 = var48 * 128 + 64 - Statics.field2420.field1247;
                        if (var49 < 0) {
                            var49 = -var49;
                        }
                        int var50 = field746[var44] >> 8 & 0xFF;
                        int var51 = var50 * 128 + 64 - Statics.field2420.field1173;
                        if (var51 < 0) {
                            var51 = -var51;
                        }
                        int var52 = var49 + var51 - 128;
                        if (var52 > var47) {
                            field745[var44] = -100;
                            continue;
                        }
                        if (var52 < 0) {
                            var52 = 0;
                        }
                        var53 = (var47 - var52) * Statics.field2450.method2477() / var47;
                    }
                    if (var53 > 0) {
                        class41 var54 = var46.method761().method766(Statics.field5093);
                        class49 var55 = class49.method907(var54, 100, var53);
                        var55.method925(field744[var44] - 1);
                        Statics.field1266.method707(var55);
                    }
                    field745[var44] = -100;
                }
            } else {
                field754--;
                for (int var45 = var44; var45 < field754; var45++) {
                    field743[var45] = field743[var45 + 1];
                    field603[var45] = field603[var45 + 1];
                    field744[var45] = field744[var45 + 1];
                    field745[var45] = field745[var45 + 1];
                    field746[var45] = field746[var45 + 1];
                }
                var44--;
            }
        }
        if (field741 && !class317.method2855()) {
            if (Statics.field2450.method2426() != 0) {
                boolean var56 = !class317.field3425.isEmpty();
                if (var56) {
                    class317.method2031(Statics.field5060, Statics.field2450.method2426());
                }
            }
            field741 = false;
        }
        field590.field1413++;
        if (field590.field1413 > 750) {
            method79();
            return;
        }
        int var57 = class108.field1362;
        int[] var58 = class108.field1370;
        for (int var59 = 0; var59 < var57; var59++) {
            class92 var60 = field651[var58[var59]];
            if (var60 != null) {
                method4060(var60, 1);
            }
        }
        for (int var61 = 0; var61 < field547; var61++) {
            int var62 = field496[var61];
            class101 var63 = field776[var62];
            if (var63 != null) {
                method4060(var63, var63.field1311.field1927);
            }
        }
        int[] var64 = class108.field1370;
        for (int var65 = 0; var65 < class108.field1362; var65++) {
            class92 var66 = field651[var64[var65]];
            if (var66 != null && var66.field1196 > 0) {
                var66.field1196--;
                if (var66.field1196 == 0) {
                    var66.field1226 = null;
                }
            }
        }
        for (int var67 = 0; var67 < field547; var67++) {
            int var68 = field496[var67];
            class101 var69 = field776[var68];
            if (var69 != null && var69.field1196 > 0) {
                var69.field1196--;
                if (var69.field1196 == 0) {
                    var69.field1226 = null;
                }
            }
        }
        field565++;
        if (field608 != 0) {
            field691 += 20;
            if (field691 >= 400) {
                field608 = 0;
            }
        }
        class344 var70 = Statics.field856;
        class344 var71 = Statics.field4540;
        Statics.field856 = null;
        Statics.field4540 = null;
        field594 = null;
        field517 = false;
        field675 = false;
        field727 = 0;
        while (field725.method3956() && field727 < 128) {
            if (field567 >= 2 && field725.method3952(82) && field725.field2361 == 66) {
                String var72 = class111.method4476();
                Statics.field3544.method495(var72);
            } else if (field578 != 1 || field725.field2364 <= 0) {
                field519[field727] = field725.field2361;
                field587[field727] = field725.field2364;
                field727++;
            }
        }
        boolean var73 = field567 >= 2;
        if (var73 && field725.method3952(82) && field725.method3952(81) && field700 != 0) {
            int var74 = Statics.field2420.field1118 - field700;
            if (var74 < 0) {
                var74 = 0;
            } else if (var74 > 3) {
                var74 = 3;
            }
            if (Statics.field2420.field1118 != var74) {
                int var75 = Statics.field1917 + Statics.field2420.field1243[0];
                int var76 = Statics.field1322 + Statics.field2420.field1244[0];
                class308 var77 = class308.method2768(class306.field3224, field590.field1405);
                var77.field3243.method8396(0);
                var77.field3243.method8450(var75);
                var77.field3243.method8450(var76);
                var77.field3243.method8393(var74);
                field590.method2719(var77);
            }
            field700 = 0;
        }
        if (field505 != -1) {
            method6900(field505, 0, 0, Statics.field4410, Statics.field321, 0, 0);
        }
        field682++;
        while (true) {
            class88 var78;
            class344 var79;
            class344 var80;
            do {
                var78 = (class88) field794.method6545();
                if (var78 == null) {
                    while (true) {
                        class88 var81;
                        class344 var82;
                        class344 var83;
                        do {
                            var81 = (class88) field704.method6545();
                            if (var81 == null) {
                                while (true) {
                                    class88 var84;
                                    class344 var85;
                                    class344 var86;
                                    do {
                                        var84 = (class88) field702.method6545();
                                        if (var84 == null) {
                                            boolean var87 = false;
                                            while (true) {
                                                class223 var88 = (class223) field683.method6545();
                                                if (var88 == null) {
                                                    if (!var87 && class36.field229 == 1) {
                                                        field726.method3929();
                                                    }
                                                    this.method1202();
                                                    method2885();
                                                    if (field650 != null) {
                                                        this.method1623();
                                                    }
                                                    if (class271.method4835()) {
                                                        int var93 = class271.field2835;
                                                        int var94 = class271.field2858;
                                                        class308 var95 = class308.method2768(class306.field3136, field590.field1405);
                                                        var95.field3243.method8393(5);
                                                        var95.field3243.method8394(Statics.field1917 + var93);
                                                        var95.field3243.method8449(Statics.field1322 + var94);
                                                        var95.field3243.method8442(field725.method3952(82) ? (field725.method3952(81) ? 2 : 1) : 0);
                                                        field590.method2719(var95);
                                                        class271.method4836();
                                                        field605 = class36.field214;
                                                        field520 = class36.field210;
                                                        field608 = 1;
                                                        field691 = 0;
                                                        field738 = var93;
                                                        field739 = var94;
                                                    }
                                                    if (Statics.field856 != var70) {
                                                        if (var70 != null) {
                                                            method3158(var70);
                                                        }
                                                        if (Statics.field856 != null) {
                                                            method3158(Statics.field856);
                                                        }
                                                    }
                                                    if (Statics.field4540 != var71 && field769 == field649) {
                                                        if (var71 != null) {
                                                            method3158(var71);
                                                        }
                                                        if (Statics.field4540 != null) {
                                                            method3158(Statics.field4540);
                                                        }
                                                    }
                                                    if (Statics.field4540 == null) {
                                                        if (field649 > 0) {
                                                            field649--;
                                                        }
                                                    } else if (field649 < field769) {
                                                        field649++;
                                                        if (field769 == field649) {
                                                            method3158(Statics.field4540);
                                                        }
                                                    }
                                                    method5653();
                                                    if (field483) {
                                                        method4999();
                                                    } else if (field789) {
                                                        if (!field749) {
                                                            int var96 = Statics.field457 * 128 + 64;
                                                            int var97 = Statics.field2315 * 128 + 64;
                                                            int var98 = method6196(var96, var97, Statics.field2658) - Statics.field1489;
                                                            method5353(var96, var98, var97);
                                                        } else if (field752 != null) {
                                                            Statics.field3016 = field752.method7851();
                                                            Statics.field234 = field752.method7860();
                                                            if (field662) {
                                                                Statics.field971 = field752.method7853();
                                                            } else {
                                                                Statics.field971 = method6196(Statics.field3016, Statics.field234, Statics.field2658) - field752.method7853();
                                                            }
                                                            field752.method7868();
                                                        }
                                                        if (field750) {
                                                            if (field673 != null) {
                                                                Statics.field1390 = field673.method7863();
                                                                Statics.field1390 = Math.min(Math.max(Statics.field1390, 128), 383);
                                                                field673.method7868();
                                                            }
                                                            if (field753 != null) {
                                                                Statics.field1982 = field753.method7863() & 0x7FF;
                                                                field753.method7868();
                                                            }
                                                        } else {
                                                            int var99 = Statics.field1401 * 128 + 64;
                                                            int var100 = Statics.field2576 * 128 + 64;
                                                            int var101 = method6196(var99, var100, Statics.field2658) - Statics.field3120;
                                                            int var102 = var99 - Statics.field3016;
                                                            int var103 = var101 - Statics.field971;
                                                            int var104 = var100 - Statics.field234;
                                                            int var105 = (int) Math.sqrt((double) (var102 * var102 + var104 * var104));
                                                            int var106 = (int) (Math.atan2((double) var103, (double) var105) * 325.9490051269531D) & 0x7FF;
                                                            int var107 = (int) (Math.atan2((double) var102, (double) var104) * -325.9490051269531D) & 0x7FF;
                                                            method5308(var106, var107);
                                                        }
                                                    }
                                                    for (int var108 = 0; var108 < 5; var108++) {
                                                        var10002 = field729[var108]++;
                                                    }
                                                    Statics.field1821.method2677();
                                                    int var109 = class36.method2235();
                                                    int var110 = class35.method3345();
                                                    if (var109 > 15000 && var110 > 15000) {
                                                        field772 = 250;
                                                        class36.method4568(14500);
                                                        class308 var111 = class308.method2768(class306.field3133, field590.field1405);
                                                        field590.method2719(var111);
                                                    }
                                                    Statics.field52.method1799();
                                                    for (int var112 = 0; var112 < field501.size(); var112++) {
                                                        if (class205.method2256((Integer) field501.get(var112)) != 2) {
                                                            field501.remove(var112);
                                                            var112--;
                                                        }
                                                    }
                                                    field590.field1414++;
                                                    if (field590.field1414 > 50) {
                                                        class308 var113 = class308.method2768(class306.field3154, field590.field1405);
                                                        field590.method2719(var113);
                                                    }
                                                    try {
                                                        field590.method2723();
                                                    } catch (IOException var115) {
                                                        method79();
                                                    }
                                                    return;
                                                }
                                                if (var88.field2350.field3714 == 12) {
                                                    var87 = true;
                                                }
                                                if (var88 != null && var88.field2350 != null) {
                                                    if (var88.field2350.field3660 >= 0) {
                                                        class344 var89 = Statics.field1878.method5636(var88.field2350.field3725);
                                                        if (var89 == null || var89.field3797 == null || var89.field3797.length == 0 || var88.field2350.field3660 >= var89.field3797.length || var89.field3797[var88.field2350.field3660] != var88.field2350) {
                                                            continue;
                                                        }
                                                    }
                                                    if (var88.field2350.field3714 == 11 && var88.field2345 == 0) {
                                                        if (var88.field2350.method6074(var88.field2347, var88.field2348, 0, 0)) {
                                                            switch(var88.field2350.method6032()) {
                                                                case 0:
                                                                    class32.method2529(var88.field2350.method6034(), true, false);
                                                                    break;
                                                                case 1:
                                                                    if (class345.method3194(method6207(var88.field2350))) {
                                                                        int[] var90 = var88.field2350.method6035();
                                                                        if (var90 != null) {
                                                                            class308 var91 = class308.method2768(class306.field3168, field590.field1405);
                                                                            var91.field3243.method8461(var90[1]);
                                                                            var91.field3243.method8396(var90[0]);
                                                                            var91.field3243.method8640(var88.field2350.field3660);
                                                                            var91.field3243.method8396(var90[2]);
                                                                            var91.field3243.method8461(var88.field2350.field3659);
                                                                            var91.field3243.method8465(var88.field2350.method6040());
                                                                            field590.method2719(var91);
                                                                        }
                                                                    }
                                                            }
                                                        }
                                                    } else if (var88.field2350.field3714 == 12) {
                                                        class342 var92 = var88.field2350.method6039();
                                                        if (var92 != null && var92.method5760()) {
                                                            switch(var88.field2345) {
                                                                case 0:
                                                                    field726.method3928(var88.field2350);
                                                                    var92.method5712(true);
                                                                    var92.method5751(var88.field2347, var88.field2348, field725.method3952(82), field725.method3952(81));
                                                                    break;
                                                                case 1:
                                                                    var92.method5752(var88.field2347, var88.field2348);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        var85 = var84.field1056;
                                        if (var85.field3660 < 0) {
                                            break;
                                        }
                                        var86 = Statics.field1878.method5636(var85.field3725);
                                    } while (var86 == null || var86.field3797 == null || var85.field3660 >= var86.field3797.length || var86.field3797[var85.field3660] != var85);
                                    class71.method3152(var84);
                                }
                            }
                            var82 = var81.field1056;
                            if (var82.field3660 < 0) {
                                break;
                            }
                            var83 = Statics.field1878.method5636(var82.field3725);
                        } while (var83 == null || var83.field3797 == null || var82.field3660 >= var83.field3797.length || var83.field3797[var82.field3660] != var82);
                        class71.method3152(var81);
                    }
                }
                var79 = var78.field1056;
                if (var79.field3660 < 0) {
                    break;
                }
                var80 = Statics.field1878.method5636(var79.field3725);
            } while (var80 == null || var80.field3797 == null || var79.field3660 >= var80.field3797.length || var80.field3797[var79.field3660] != var79);
            class71.method3152(var78);
        }
    }

    @ObfuscatedName("dj.he(I)V")
    public static final void method2592() {
        if (Statics.field3495 != null) {
            Statics.field3495.method806();
        }
    }

    @ObfuscatedName("di.hn(Lhx;IIILdf;I)V")
    public static void method2128(class205 arg0, int arg1, int arg2, int arg3, class96 arg4) {
        if (field754 >= 50 || arg0.field2204 == null || arg1 >= arg0.field2204.length) {
            return;
        }
        int var5 = arg0.field2204[arg1] & 0xF;
        if (!(var5 <= 0 || Statics.field2450.method2477() != 0) || !(var5 != 0 || Statics.field2450.method2428() != 0)) {
            return;
        }
        int var6 = arg0.field2204[arg1];
        boolean var9 = Statics.field2420 == arg4;
        if (var6 == 0) {
            return;
        }
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (!var9) {
                return;
            }
            field746[field754] = 0;
        } else {
            int var11 = (arg2 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            field746[field754] = (var11 << 16) + (var12 << 8) + var10;
        }
        int var13 = var6 >> 8;
        int var14 = var6 >> 4 & 0x7;
        field743[field754] = var13;
        field744[field754] = var14;
        field745[field754] = 0;
        field603[field754] = null;
        field754++;
    }

    @ObfuscatedName("rb.ih(IIII)V")
    public static void method7634(int arg0, int arg1, int arg2) {
        if (Statics.field2450.method2428() == 0 || arg1 == 0 || field754 >= 50) {
            return;
        }
        field743[field754] = arg0;
        field744[field754] = arg1;
        field745[field754] = arg2;
        field603[field754] = null;
        field746[field754] = 0;
        field754++;
    }

    @ObfuscatedName("ff.if(Ljava/util/ArrayList;IIIIB)V")
    public static void method2993(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field741) {
            class317.method4392(0, 0);
        } else if (var5 != -1) {
            boolean var7;
            if (class317.field3425.isEmpty()) {
                var7 = false;
            } else {
                class329 var6 = (class329) class317.field3425.get(0);
                var7 = var6 != null && var6.field3524 == var5;
            }
            if (!var7 && Statics.field2450.method2426() != 0) {
                ArrayList var8 = new ArrayList();
                for (int var9 = 0; var9 < arg0.size(); var9++) {
                    var8.add(new class329(Statics.field5060, (Integer) arg0.get(var9), 0, Statics.field2450.method2426(), false));
                }
                if (field741) {
                    class317.field3425.clear();
                    class317.field3425.addAll(var8);
                    class317.method3367(arg1, arg2, arg3, arg4);
                } else {
                    class317.method2334(var8, arg1, arg2, arg3, arg4, false);
                }
            }
        }
    }

    @ObfuscatedName("im.is(IIB)V")
    public static void method3905(int arg0, int arg1) {
        if (Statics.field2450.method2426() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class329(Statics.field282, arg0, 0, Statics.field2450.method2426(), false));
            class317.method2334(var2, 0, 0, 0, 0, true);
            field741 = true;
        }
    }

    @ObfuscatedName("client.im(III)V")
    public void method1322(int arg0, int arg1) {
        if (field590 != null && field590.field1405 != null && arg0 > -1 && Statics.field2450.method2426() > 0 && !field741) {
            class308 var3 = class308.method2768(class306.field3186, field590.field1405);
            var3.field3243.method8396(arg0);
            field590.method2719(var3);
        }
    }

    @ObfuscatedName("fy.ib(I)V")
    public static final void method3080() {
        if (Statics.field1053) {
            method2837();
            Statics.field1053 = false;
        }
    }

    @ObfuscatedName("qc.in(B)V")
    public static final void method7310() {
        if (Statics.field2658 != field602) {
            field602 = Statics.field2658;
            method4470(Statics.field2658);
        }
    }

    @ObfuscatedName("aq.id(Lnn;III)V")
    public static final void method285(class344 arg0, int arg1, int arg2) {
        if (field740 != 0 && field740 != 3 || field557 || !(class36.field229 == 1 || !Statics.field96 && class36.field229 == 4)) {
            return;
        }
        class332 var3 = arg0.method6019(Statics.field1878, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field214 - arg1;
        int var5 = class36.field210 - arg2;
        if (!var3.method5609(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3545 / 2;
        int var7 = var5 - var3.field3547 / 2;
        int var8 = field573 & 0x7FF;
        int var9 = class267.field2771[var8];
        int var10 = class267.field2769[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2420.field1247 + var11 >> 7;
        int var14 = Statics.field2420.field1173 - var12 >> 7;
        class308 var15 = class308.method2768(class306.field3178, field590.field1405);
        var15.field3243.method8393(18);
        var15.field3243.method8394(Statics.field1917 + var13);
        var15.field3243.method8449(Statics.field1322 + var14);
        var15.field3243.method8442(field725.method3952(82) ? (field725.method3952(81) ? 2 : 1) : 0);
        var15.field3243.method8393(var6);
        var15.field3243.method8393(var7);
        var15.field3243.method8394(field573);
        var15.field3243.method8393(57);
        var15.field3243.method8393(0);
        var15.field3243.method8393(0);
        var15.field3243.method8393(89);
        var15.field3243.method8394(Statics.field2420.field1247);
        var15.field3243.method8394(Statics.field2420.field1173);
        var15.field3243.method8393(63);
        field590.method2719(var15);
        field738 = var13;
        field739 = var14;
    }

    @ObfuscatedName("az.ie(Ljava/lang/String;I)V")
    public static final void method81(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2450.method2412(!Statics.field2450.method2413());
            if (Statics.field2450.method2413()) {
                class111.method6477(99, "", "Roofs are now all hidden");
            } else {
                class111.method6477(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class399.method6184(arg0.substring(5).trim()) == 1;
            Statics.field3544.method507(var1);
            class267.method4660(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field785 = !field785;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field2450.method2419();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field616 = !field616;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field685 = !field685;
        }
        if (field567 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1919.field4979 = !Statics.field1919.field4979;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field2450.method2418(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field2450.method2418(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method79();
            }
        }
        class308 var2 = class308.method2768(class306.field3184, field590.field1405);
        var2.field3243.method8393(arg0.length() + 1);
        var2.field3243.method8400(arg0);
        field590.method2719(var2);
    }

    @ObfuscatedName("jb.iq(II)I")
    public static final int method4420(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("mv.ia(IB)I")
    public static final int method5565(int arg0) {
        return Math.abs(arg0 - Statics.field1982) > 1024 ? (arg0 < Statics.field1982 ? 1 : -1) * 2048 + arg0 : arg0;
    }

    @ObfuscatedName("kg.iu(B)V")
    public static final void method4999() {
        method5353(Statics.field2195, Statics.field3491, Statics.field938);
        method5308(Statics.field1495, Statics.field2371);
        if (Statics.field3016 != Statics.field2195 || Statics.field971 != Statics.field3491 || Statics.field938 != Statics.field234 || Statics.field1495 != Statics.field1390 || Statics.field2371 != Statics.field1982) {
            return;
        }
        field483 = false;
        field789 = false;
        field749 = false;
        field750 = false;
        Statics.field1401 = 0;
        Statics.field2576 = 0;
        Statics.field3120 = 0;
        Statics.field422 = 0;
        Statics.field1582 = 0;
        Statics.field3 = 0;
        Statics.field2530 = 0;
        Statics.field457 = 0;
        Statics.field2315 = 0;
        Statics.field1489 = 0;
        field752 = null;
        field673 = null;
        field753 = null;
    }

    @ObfuscatedName("my.ij(IIIB)V")
    public static final void method5353(int arg0, int arg1, int arg2) {
        if (Statics.field3016 < arg0) {
            Statics.field3016 += Statics.field3 * (arg0 - Statics.field3016) / 1000 + Statics.field2530;
            if (Statics.field3016 > arg0) {
                Statics.field3016 = arg0;
            }
        }
        if (Statics.field3016 > arg0) {
            Statics.field3016 -= Statics.field3 * (Statics.field3016 - arg0) / 1000 + Statics.field2530;
            if (Statics.field3016 < arg0) {
                Statics.field3016 = arg0;
            }
        }
        if (Statics.field971 < arg1) {
            Statics.field971 += Statics.field3 * (arg1 - Statics.field971) / 1000 + Statics.field2530;
            if (Statics.field971 > arg1) {
                Statics.field971 = arg1;
            }
        }
        if (Statics.field971 > arg1) {
            Statics.field971 -= Statics.field3 * (Statics.field971 - arg1) / 1000 + Statics.field2530;
            if (Statics.field971 < arg1) {
                Statics.field971 = arg1;
            }
        }
        if (Statics.field234 < arg2) {
            Statics.field234 += Statics.field3 * (arg2 - Statics.field234) / 1000 + Statics.field2530;
            if (Statics.field234 > arg2) {
                Statics.field234 = arg2;
            }
        }
        if (Statics.field234 > arg2) {
            Statics.field234 -= Statics.field3 * (Statics.field234 - arg2) / 1000 + Statics.field2530;
            if (Statics.field234 < arg2) {
                Statics.field234 = arg2;
            }
        }
    }

    @ObfuscatedName("lh.ix(IIB)V")
    public static final void method5308(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1390 < arg0) {
            Statics.field1390 += Statics.field1582 * (arg0 - Statics.field1390) / 1000 + Statics.field422;
            if (Statics.field1390 > arg0) {
                Statics.field1390 = arg0;
            }
        } else if (Statics.field1390 > arg0) {
            Statics.field1390 -= Statics.field1582 * (Statics.field1390 - arg0) / 1000 + Statics.field422;
            if (Statics.field1390 < arg0) {
                Statics.field1390 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field1982;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field1982 += Statics.field1582 * var3 / 1000 + Statics.field422;
            Statics.field1982 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field1982 -= Statics.field1582 * -var3 / 1000 + Statics.field422;
            Statics.field1982 &= 0x7FF;
        }
        int var4 = var2 - Statics.field1982;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field1982 = var2;
        }
    }

    @ObfuscatedName("mp.il(I)V")
    public static final void method5653() {
        if (field578 == 0) {
            int var0 = Statics.field2420.field1247;
            int var1 = Statics.field2420.field1173;
            if (Statics.field1279 - var0 < -500 || Statics.field1279 - var0 > 500 || Statics.field460 - var1 < -500 || Statics.field460 - var1 > 500) {
                Statics.field1279 = var0;
                Statics.field460 = var1;
            }
            if (Statics.field1279 != var0) {
                Statics.field1279 += (var0 - Statics.field1279) / 16;
            }
            if (Statics.field460 != var1) {
                Statics.field460 += (var1 - Statics.field460) / 16;
            }
            int var2 = Statics.field1279 >> 7;
            int var3 = Statics.field460 >> 7;
            int var4 = method6196(Statics.field1279, Statics.field460, Statics.field2658);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field2658;
                        if (var8 < 3 && (class82.field1001[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class82.field1014[var8][var6][var7];
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
            if (var10 > field760) {
                field760 += (var10 - field760) / 24;
            } else if (var10 < field760) {
                field760 += (var10 - field760) / 80;
            }
            Statics.field57 = method6196(Statics.field2420.field1247, Statics.field2420.field1173, Statics.field2658) - field579;
        } else if (field578 == 1) {
            method4505();
            short var11 = -1;
            if (field725.method3952(33)) {
                var11 = 0;
            } else if (field725.method3952(49)) {
                var11 = 1024;
            }
            if (field725.method3952(48)) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (field725.method3952(50)) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (field725.method3952(35)) {
                var12 = -1;
            } else if (field725.method3952(51)) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = field725.method3952(81) ? field584 : field583;
                var13 = var14 * 16;
                field530 = var11;
                field764 = var12;
            }
            if (field580 < var13) {
                field580 += var13 / 8;
                if (field580 > var13) {
                    field580 = var13;
                }
            } else if (field580 > var13) {
                field580 = field580 * 9 / 10;
            }
            if (field580 > 0) {
                int var15 = field580 / 16;
                if (field530 >= 0) {
                    int var16 = field530 - Statics.field1982 & 0x7FF;
                    int var17 = class267.field2771[var16];
                    int var18 = class267.field2769[var16];
                    Statics.field1279 += var15 * var17 / 65536;
                    Statics.field460 += var15 * var18 / 65536;
                }
                if (field764 != 0) {
                    Statics.field57 += field764 * var15;
                    if (Statics.field57 > 0) {
                        Statics.field57 = 0;
                    }
                }
            } else {
                field530 = -1;
                field764 = -1;
            }
            if (field725.method3952(13)) {
                field590.method2719(class308.method2768(class306.field3209, field590.field1405));
                field578 = 0;
            }
        }
        if (class36.field208 == 4 && Statics.field96) {
            int var19 = class36.field218 - field577;
            field575 = var19 * 2;
            field577 = var19 == -1 || var19 == 1 ? class36.field218 : (field577 + class36.field218) / 2;
            int var20 = field549 - class36.field217;
            field654 = var20 * 2;
            field549 = var20 == -1 || var20 == 1 ? class36.field217 : (field549 + class36.field217) / 2;
        } else {
            if (field725.method3952(96)) {
                field654 += (-24 - field654) / 2;
            } else if (field725.method3952(97)) {
                field654 += (24 - field654) / 2;
            } else {
                field654 /= 2;
            }
            if (field725.method3952(98)) {
                field575 += (12 - field575) / 2;
            } else if (field725.method3952(99)) {
                field575 += (-12 - field575) / 2;
            } else {
                field575 /= 2;
            }
            field577 = class36.field218;
            field549 = class36.field217;
        }
        field573 = field654 / 2 + field573 & 0x7FF;
        field572 += field575 / 2;
        if (field572 < 128) {
            field572 = 128;
        }
        if (field572 > 383) {
            field572 = 383;
        }
    }

    @ObfuscatedName("iz.iw(Ldf;II)V")
    public static final void method4060(class96 arg0, int arg1) {
        if (arg0.field1228 >= field500) {
            int var2 = Math.max(1, arg0.field1228 - field500);
            int var3 = arg0.field1210 * 128 + arg0.field1199 * 64;
            int var4 = arg0.field1199 * 64 + arg0.field1195 * 128;
            arg0.field1247 += (var3 - arg0.field1247) / var2;
            arg0.field1173 += (var4 - arg0.field1173) / var2;
            arg0.field1246 = 0;
            arg0.field1239 = arg0.field1230;
        } else if (arg0.field1188 >= field500) {
            boolean var5 = field500 == arg0.field1188 || arg0.field1229 == -1 || arg0.field1220 != 0;
            if (!var5) {
                class205 var6 = class205.method2129(arg0.field1229);
                if (var6 == null || var6.method3733()) {
                    var5 = true;
                } else {
                    var5 = arg0.field1219 + 1 > var6.field2218[arg0.field1218];
                }
            }
            if (var5) {
                int var7 = arg0.field1188 - arg0.field1228;
                int var8 = field500 - arg0.field1228;
                int var9 = arg0.field1210 * 128 + arg0.field1199 * 64;
                int var10 = arg0.field1199 * 64 + arg0.field1195 * 128;
                int var11 = arg0.field1225 * 128 + arg0.field1199 * 64;
                int var12 = arg0.field1204 * 128 + arg0.field1199 * 64;
                arg0.field1247 = ((var7 - var8) * var9 + var8 * var11) / var7;
                arg0.field1173 = ((var7 - var8) * var10 + var8 * var12) / var7;
            }
            arg0.field1246 = 0;
            arg0.field1239 = arg0.field1230;
            arg0.field1180 = arg0.field1239;
        } else {
            method316(arg0);
        }
        if (arg0.field1247 < 128 || arg0.field1173 < 128 || arg0.field1247 >= 13184 || arg0.field1173 >= 13184) {
            arg0.field1229 = -1;
            arg0.field1228 = 0;
            arg0.field1188 = 0;
            arg0.method2363();
            arg0.field1247 = arg0.field1243[0] * 128 + arg0.field1199 * 64;
            arg0.field1173 = arg0.field1244[0] * 128 + arg0.field1199 * 64;
            arg0.method2336();
        }
        if (Statics.field2420 == arg0 && (arg0.field1247 < 1536 || arg0.field1173 < 1536 || arg0.field1247 >= 11776 || arg0.field1173 >= 11776)) {
            arg0.field1229 = -1;
            arg0.field1228 = 0;
            arg0.field1188 = 0;
            arg0.method2363();
            arg0.field1247 = arg0.field1243[0] * 128 + arg0.field1199 * 64;
            arg0.field1173 = arg0.field1244[0] * 128 + arg0.field1199 * 64;
            arg0.method2336();
        }
        method8106(arg0);
        arg0.field1174 = false;
        if (arg0.field1213 != -1) {
            class205 var13 = class205.method2129(arg0.field1213);
            if (var13 == null) {
                arg0.field1213 = -1;
            } else if (!var13.method3733() && var13.field2216 != null) {
                arg0.field1215++;
                if (arg0.field1214 < var13.field2216.length && arg0.field1215 > var13.field2218[arg0.field1214]) {
                    arg0.field1215 = 1;
                    arg0.field1214++;
                    method2128(var13, arg0.field1214, arg0.field1247, arg0.field1173, arg0);
                }
                if (arg0.field1214 >= var13.field2216.length) {
                    if (var13.field2228 > 0) {
                        arg0.field1214 -= var13.field2228;
                        if (var13.field2211) {
                            arg0.field1249++;
                        }
                        if (arg0.field1214 < 0 || arg0.field1214 >= var13.field2216.length || var13.field2211 && arg0.field1249 >= var13.field2212) {
                            arg0.field1215 = 0;
                            arg0.field1214 = 0;
                            arg0.field1249 = 0;
                        }
                    } else {
                        arg0.field1215 = 0;
                        arg0.field1214 = 0;
                    }
                    method2128(var13, arg0.field1214, arg0.field1247, arg0.field1173, arg0);
                }
            } else if (var13.method3733()) {
                arg0.field1214++;
                int var14 = var13.method3749();
                if (arg0.field1214 < var14) {
                    Statics.method7393(var13, arg0.field1214, arg0.field1247, arg0.field1173, arg0);
                } else {
                    if (var13.field2228 > 0) {
                        arg0.field1214 -= var13.field2228;
                        if (var13.field2211) {
                            arg0.field1249++;
                        }
                        if (arg0.field1214 < 0 || arg0.field1214 >= var14 || var13.field2211 && arg0.field1249 >= var13.field2212) {
                            arg0.field1214 = 0;
                            arg0.field1215 = 0;
                            arg0.field1249 = 0;
                        }
                    } else {
                        arg0.field1215 = 0;
                        arg0.field1214 = 0;
                    }
                    Statics.method7393(var13, arg0.field1214, arg0.field1247, arg0.field1173, arg0);
                }
            } else {
                arg0.field1213 = -1;
            }
        }
        class499 var15 = new class499(arg0.method2341());
        for (class549 var16 = (class549) var15.method8121(); var16 != null; var16 = (class549) var15.next()) {
            if (var16.field5288 != -1 && field500 >= var16.field5286) {
                int var17 = class194.method318(var16.field5288).field2009;
                if (var17 == -1) {
                    var16.method7828();
                    arg0.field1217--;
                } else {
                    var16.field5290 = Math.max(var16.field5290, 0);
                    class205 var18 = class205.method2129(var17);
                    if (var18.field2216 != null && !var18.method3733()) {
                        var16.field5287++;
                        if (var16.field5290 < var18.field2216.length && var16.field5287 > var18.field2218[var16.field5290]) {
                            var16.field5287 = 1;
                            var16.field5290++;
                            method2128(var18, var16.field5290, arg0.field1247, arg0.field1173, arg0);
                        }
                        if (var16.field5290 >= var18.field2216.length) {
                            var16.method7828();
                            arg0.field1217--;
                        }
                    } else if (var18.method3733()) {
                        var16.field5290++;
                        int var19 = var18.method3749();
                        if (var16.field5290 < var19) {
                            Statics.method7393(var18, var16.field5290, arg0.field1247, arg0.field1173, arg0);
                        } else {
                            var16.method7828();
                            arg0.field1217--;
                        }
                    } else {
                        var16.method7828();
                        arg0.field1217--;
                    }
                }
            }
        }
        if (arg0.field1229 != -1 && arg0.field1220 <= 1) {
            class205 var20 = class205.method2129(arg0.field1229);
            if (var20.field2219 == 1 && arg0.field1221 > 0 && arg0.field1228 <= field500 && arg0.field1188 < field500) {
                arg0.field1220 = 1;
                return;
            }
        }
        if (arg0.field1229 != -1 && arg0.field1220 == 0) {
            class205 var21 = class205.method2129(arg0.field1229);
            if (var21 == null) {
                arg0.field1229 = -1;
            } else if (!var21.method3733() && var21.field2216 != null) {
                arg0.field1219++;
                if (arg0.field1218 < var21.field2216.length && arg0.field1219 > var21.field2218[arg0.field1218]) {
                    arg0.field1219 = 1;
                    arg0.field1218++;
                    method2128(var21, arg0.field1218, arg0.field1247, arg0.field1173, arg0);
                }
                if (arg0.field1218 >= var21.field2216.length) {
                    arg0.field1218 -= var21.field2228;
                    arg0.field1200++;
                    if (arg0.field1200 >= var21.field2212) {
                        arg0.field1229 = -1;
                    } else if (arg0.field1218 >= 0 && arg0.field1218 < var21.field2216.length) {
                        method2128(var21, arg0.field1218, arg0.field1247, arg0.field1173, arg0);
                    } else {
                        arg0.field1229 = -1;
                    }
                }
                arg0.field1174 = var21.field2225;
            } else if (var21.method3733()) {
                arg0.field1218++;
                int var22 = var21.method3749();
                if (arg0.field1218 < var22) {
                    Statics.method7393(var21, arg0.field1218, arg0.field1247, arg0.field1173, arg0);
                } else {
                    arg0.field1218 -= var21.field2228;
                    arg0.field1200++;
                    if (arg0.field1200 >= var21.field2212) {
                        arg0.field1229 = -1;
                    } else if (arg0.field1218 >= 0 && arg0.field1218 < var22) {
                        Statics.method7393(var21, arg0.field1218, arg0.field1247, arg0.field1173, arg0);
                    } else {
                        arg0.field1229 = -1;
                    }
                }
            } else {
                arg0.field1229 = -1;
            }
        }
        if (arg0.field1220 > 0) {
            arg0.field1220--;
        }
    }

    @ObfuscatedName("an.ir(Ldf;I)V")
    public static final void method316(class96 arg0) {
        arg0.field1213 = arg0.field1178;
        if (arg0.field1242 == 0) {
            arg0.field1246 = 0;
            return;
        }
        if (arg0.field1229 != -1 && arg0.field1220 == 0) {
            class205 var1 = class205.method2129(arg0.field1229);
            if (arg0.field1221 > 0 && var1.field2219 == 0) {
                arg0.field1246++;
                return;
            }
            if (arg0.field1221 <= 0 && var1.field2206 == 0) {
                arg0.field1246++;
                return;
            }
        }
        int var2 = arg0.field1247;
        int var3 = arg0.field1173;
        int var4 = arg0.field1243[arg0.field1242 - 1] * 128 + arg0.field1199 * 64;
        int var5 = arg0.field1244[arg0.field1242 - 1] * 128 + arg0.field1199 * 64;
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
        class229 var6 = arg0.field1245[arg0.field1242 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1247 = var4;
            arg0.field1173 = var5;
            arg0.field1242--;
            if (arg0.field1221 > 0) {
                arg0.field1221--;
            }
            return;
        }
        int var7 = arg0.field1239 - arg0.field1180 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1182;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1181;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1227;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1183;
        }
        if (var8 == -1) {
            var8 = arg0.field1181;
        }
        arg0.field1213 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class101) {
            var10 = ((class101) arg0).field1311.field1947;
        }
        if (var10) {
            if (arg0.field1239 != arg0.field1180 && arg0.field1223 == -1 && arg0.field1241 != 0) {
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
        if (class229.field2411 == var6) {
            var9 <<= 0x1;
        } else if (class229.field2409 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8) {
            if (arg0.field1213 == arg0.field1181 && arg0.field1185 != -1) {
                arg0.field1213 = arg0.field1185;
            } else if (arg0.field1213 == arg0.field1182 && arg0.field1186 != -1) {
                arg0.field1213 = arg0.field1186;
            } else if (arg0.field1213 == arg0.field1183 && arg0.field1187 != -1) {
                arg0.field1213 = arg0.field1187;
            } else if (arg0.field1227 == arg0.field1213 && arg0.field1234 != -1) {
                arg0.field1213 = arg0.field1234;
            }
        } else if (var9 <= 2) {
            if (arg0.field1213 == arg0.field1181 && arg0.field1189 != -1) {
                arg0.field1213 = arg0.field1189;
            } else if (arg0.field1213 == arg0.field1182 && arg0.field1190 != -1) {
                arg0.field1213 = arg0.field1190;
            } else if (arg0.field1213 == arg0.field1183 && arg0.field1191 != -1) {
                arg0.field1213 = arg0.field1191;
            } else if (arg0.field1227 == arg0.field1213 && arg0.field1240 != -1) {
                arg0.field1213 = arg0.field1240;
            }
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1247 += var9;
                if (arg0.field1247 > var4) {
                    arg0.field1247 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1247 -= var9;
                if (arg0.field1247 < var4) {
                    arg0.field1247 = var4;
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
        if (arg0.field1247 == var4 && arg0.field1173 == var5) {
            arg0.field1242--;
            if (arg0.field1221 > 0) {
                arg0.field1221--;
            }
        }
    }

    @ObfuscatedName("tn.it(Ldf;I)V")
    public static final void method8106(class96 arg0) {
        if (arg0.field1223 != -1) {
            Object var1 = null;
            int var2 = 65536;
            class96 var3;
            if (arg0.field1223 < var2) {
                var3 = field776[arg0.field1223];
            } else {
                var3 = field651[arg0.field1223 - var2];
            }
            if (var3 != null) {
                int var4 = arg0.field1247 - var3.field1247;
                int var5 = arg0.field1173 - var3.field1173;
                if (var4 != 0 || var5 != 0) {
                    arg0.field1239 = Statics.method3779(var4, var5);
                }
            } else if (arg0.field1184) {
                arg0.field1223 = -1;
                arg0.field1184 = false;
            }
        }
        if (arg0.field1242 == 0 || arg0.field1246 > 0) {
            int var6 = -1;
            if (arg0.field1179 != -1 && arg0.field1211 != -1) {
                int var7 = arg0.field1179 * 128 - Statics.field1917 * 128 + 64;
                int var8 = arg0.field1211 * 128 - Statics.field1322 * 128 + 64;
                int var9 = arg0.field1247 - var7;
                int var10 = arg0.field1173 - var8;
                if (var9 != 0 || var10 != 0) {
                    var6 = Statics.method3779(var9, var10);
                }
            } else if (arg0.field1209 != -1) {
                var6 = arg0.field1209;
            }
            if (var6 != -1) {
                arg0.field1239 = var6;
                if (arg0.field1212) {
                    arg0.field1180 = arg0.field1239;
                }
            }
            arg0.method2352();
        }
        int var11 = arg0.field1239 - arg0.field1180 & 0x7FF;
        if (var11 == 0) {
            if (arg0.field1184) {
                arg0.field1223 = -1;
                arg0.field1184 = false;
            }
            arg0.field1193 = 0;
            return;
        }
        boolean var12 = true;
        boolean var13 = true;
        arg0.field1193++;
        int var14 = var11 > 1024 ? -1 : 1;
        arg0.field1180 += arg0.field1241 * var14;
        boolean var15 = true;
        if (var11 < arg0.field1241 || var11 > 2048 - arg0.field1241) {
            arg0.field1180 = arg0.field1239;
            var15 = false;
        }
        if (arg0.field1241 > 0 && arg0.field1213 == arg0.field1178 && (arg0.field1193 > 25 || var15)) {
            if (var14 == -1 && arg0.field1192 != -1) {
                arg0.field1213 = arg0.field1192;
            } else if (var14 == 1 && arg0.field1208 != -1) {
                arg0.field1213 = arg0.field1208;
            } else {
                arg0.field1213 = arg0.field1181;
            }
        }
        arg0.field1180 &= 0x7FF;
    }

    @ObfuscatedName("ee.ig(I)V")
    public static void method2885() {
        if (Statics.field1919 != null) {
            Statics.field1919.method7907(Statics.field2658, (Statics.field2420.field1247 >> 7) + Statics.field1917, (Statics.field2420.field1173 >> 7) + Statics.field1322, false);
            Statics.field1919.method7923();
        }
    }

    @ObfuscatedName("io.iz(Lds;III)V")
    public static void method4116(class92 arg0, int arg1, int arg2) {
        if (arg0.field1229 == arg1 && arg1 != -1) {
            int var3 = class205.method2129(arg1).field2231;
            if (var3 == 1) {
                arg0.field1218 = 0;
                arg0.field1219 = 0;
                arg0.field1220 = arg2;
                arg0.field1200 = 0;
            }
            if (var3 == 2) {
                arg0.field1200 = 0;
            }
        } else if (arg1 == -1 || arg0.field1229 == -1 || class205.method2129(arg1).field2224 >= class205.method2129(arg0.field1229).field2224) {
            arg0.field1229 = arg1;
            arg0.field1218 = 0;
            arg0.field1219 = 0;
            arg0.field1220 = arg2;
            arg0.field1200 = 0;
            arg0.field1221 = arg0.field1242;
        }
    }

    @ObfuscatedName("cm.iy(I)I")
    public static int method1169() {
        return field718 ? 2 : 1;
    }

    @ObfuscatedName("az.ip(II)V")
    public static void method69(int arg0) {
        field717 = 0L;
        if (arg0 >= 2) {
            field718 = true;
        } else {
            field718 = false;
        }
        if (method1169() == 1) {
            Statics.field3544.method491(765, 503);
        } else {
            Statics.field3544.method491(7680, 2160);
        }
        if (field525 < 25 || field590 == null || field590.field1405 == null) {
            return;
        }
        class308 var1 = class308.method2768(class306.field3210, field590.field1405);
        var1.field3243.method8393(method1169());
        var1.field3243.method8394(Statics.field4410);
        var1.field3243.method8394(Statics.field321);
        field590.method2719(var1);
    }

    @ObfuscatedName("client.ak(B)V")
    public final void method502() {
        field717 = class313.method3460() + 500L;
        this.method1197();
        if (field505 != -1) {
            this.method1205(true);
        }
    }

    @ObfuscatedName("client.ii(B)V")
    public void method1197() {
        int var1 = Statics.field4410;
        int var2 = Statics.field321;
        if (this.field184 < var1) {
            int var3 = this.field184;
        }
        if (this.field185 < var2) {
            int var4 = this.field185;
        }
        if (Statics.field2450 != null) {
            try {
                class27.method390(Statics.field3544, "resize", new Object[] { method1169() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.ik(B)V")
    public final void method1198() {
        if (field505 != -1) {
            method3182(field505);
        }
        for (int var1 = 0; var1 < field707; var1++) {
            if (field709[var1]) {
                field786[var1] = true;
            }
            field516[var1] = field709[var1];
            field709[var1] = false;
        }
        field558 = field500;
        field647 = -1;
        field648 = -1;
        if (field505 != -1) {
            field707 = 0;
            method321(field505, 0, 0, Statics.field4410, Statics.field321, 0, 0, -1);
        }
        class537.method8787();
        if (field609) {
            if (field608 == 1) {
                Statics.field1817[field691 / 100].method8885(field605 - 8, field520 - 8);
            }
            if (field608 == 2) {
                Statics.field1817[field691 / 100 + 4].method8885(field605 - 8, field520 - 8);
            }
        }
        if (field557) {
            method3094();
        } else if (field647 != -1) {
            method7818(field647, field648);
        }
        if (field716 == 3) {
            for (int var2 = 0; var2 < field707; var2++) {
                if (field516[var2]) {
                    class537.method8762(field712[var2], field733[var2], field692[var2], field715[var2], 16711935, 128);
                } else if (field786[var2]) {
                    class537.method8762(field712[var2], field733[var2], field692[var2], field715[var2], 16711680, 128);
                }
            }
        }
        class70.method7346(Statics.field2658, Statics.field2420.field1247, Statics.field2420.field1173, field565);
        field565 = 0;
    }

    @ObfuscatedName("lo.io(Ljava/lang/String;ZB)V")
    public static final void method5337(String arg0, boolean arg1) {
        if (!field611) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2650.method7007(arg0, 250);
        int var6 = Statics.field2650.method6982(arg0, 250) * 13;
        class537.method8837(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class537.method8767(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2650.method7060(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field707; var11++) {
            if (field712[var11] + field692[var11] > var7 && field712[var11] < var7 + var9 && field733[var11] + field715[var11] > var8 && field733[var11] < var8 + var10) {
                field709[var11] = true;
            }
        }
        if (arg1) {
            Statics.field3588.method469(0, 0);
        } else {
            method838(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("nb.jp(IIIIB)V")
    public static final void method5698(int arg0, int arg1, int arg2, int arg3) {
        field670++;
        method2322();
        method5567();
        if (field624 >= 0 && field651[field624] != null) {
            method8215(field651[field624], false);
        }
        method271(true);
        int var4 = class108.field1362;
        int[] var5 = class108.field1370;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field624 != var5[var6] && field790 != var5[var6]) {
                method8215(field651[var5[var6]], true);
            }
        }
        method271(false);
        method5603();
        for (class72 var7 = (class72) field628.method6579(); var7 != null; var7 = (class72) field628.method6549()) {
            if (Statics.field2658 != var7.field859 || var7.field862) {
                var7.method7828();
            } else if (field500 >= var7.field858) {
                var7.method2020(field565);
                if (var7.field862) {
                    var7.method7828();
                } else {
                    Statics.field231.method4915(var7.field859, var7.field866, var7.field857, var7.field861, 60, var7, 0, -1L, false);
                }
            }
        }
        method6176(arg0, arg1, arg2, arg3, true);
        int var8 = field714;
        int var9 = field770;
        int var10 = field771;
        int var11 = field607;
        class537.method8755(var8, var9, var8 + var10, var9 + var11);
        class267.method4674();
        class537.method8776();
        int var12 = field572;
        if (field760 / 256 > var12) {
            var12 = field760 / 256;
        }
        if (field756[4] && field705[4] + 128 > var12) {
            var12 = field705[4] + 128;
        }
        int var13 = field573 & 0x7FF;
        int var14 = Statics.field1279;
        int var15 = Statics.field57;
        int var16 = Statics.field460;
        int var17 = method3155(var12);
        int var18 = method6717(var17, var11);
        int var19 = 2048 - var12 & 0x7FF;
        int var20 = 2048 - var13 & 0x7FF;
        int var21 = 0;
        int var22 = 0;
        int var23 = var18;
        if (var19 != 0) {
            int var24 = class267.field2771[var19];
            int var25 = class267.field2769[var19];
            int var26 = var22 * var25 - var18 * var24 >> 16;
            var23 = var22 * var24 + var18 * var25 >> 16;
            var22 = var26;
        }
        if (var20 != 0) {
            int var27 = class267.field2771[var20];
            int var28 = class267.field2769[var20];
            int var29 = var21 * var28 + var23 * var27 >> 16;
            var23 = var23 * var28 - var21 * var27 >> 16;
            var21 = var29;
        }
        if (field789) {
            Statics.field2195 = var14 - var21;
            Statics.field3491 = var15 - var22;
            Statics.field938 = var16 - var23;
            Statics.field1495 = var12;
            Statics.field2371 = var13;
        } else {
            Statics.field3016 = var14 - var21;
            Statics.field971 = var15 - var22;
            Statics.field234 = var16 - var23;
            Statics.field1390 = var12;
            Statics.field1982 = var13;
        }
        if (field578 == 1 && field567 >= 2 && field500 % 50 == 0 && (Statics.field1279 >> 7 != Statics.field2420.field1247 >> 7 || Statics.field460 >> 7 != Statics.field2420.field1173 >> 7)) {
            int var30 = Statics.field2420.field1118;
            int var31 = (Statics.field1279 >> 7) + Statics.field1917;
            int var32 = (Statics.field460 >> 7) + Statics.field1322;
            class308 var33 = class308.method2768(class306.field3224, field590.field1405);
            var33.field3243.method8396(field585);
            var33.field3243.method8450(var31);
            var33.field3243.method8450(var32);
            var33.field3243.method8393(var30);
            field590.method2719(var33);
        }
        int var34;
        if (field789) {
            int var35;
            if (Statics.field2450.method2413()) {
                var35 = Statics.field2658;
            } else {
                int var36 = method6196(Statics.field3016, Statics.field234, Statics.field2658);
                if (var36 - Statics.field971 >= 800 || (class82.field1001[Statics.field2658][Statics.field3016 >> 7][Statics.field234 >> 7] & 0x4) == 0) {
                    var35 = 3;
                } else {
                    var35 = Statics.field2658;
                }
            }
            var34 = var35;
        } else {
            var34 = method5313();
        }
        int var37 = Statics.field3016;
        int var38 = Statics.field971;
        int var39 = Statics.field234;
        int var40 = Statics.field1390;
        int var41 = Statics.field1982;
        for (int var42 = 0; var42 < 5; var42++) {
            if (field756[var42]) {
                int var43 = (int) (Math.random() * (double) (field757[var42] * 2 + 1) - (double) field757[var42] + Math.sin((double) field759[var42] / 100.0D * (double) field729[var42]) * (double) field705[var42]);
                if (var42 == 0) {
                    Statics.field3016 += var43;
                }
                if (var42 == 1) {
                    Statics.field971 += var43;
                }
                if (var42 == 2) {
                    Statics.field234 += var43;
                }
                if (var42 == 3) {
                    Statics.field1982 = Statics.field1982 + var43 & 0x7FF;
                }
                if (var42 == 4) {
                    Statics.field1390 += var43;
                    if (Statics.field1390 < 128) {
                        Statics.field1390 = 128;
                    }
                    if (Statics.field1390 > 383) {
                        Statics.field1390 = 383;
                    }
                }
            }
        }
        int var44 = class36.field217;
        int var45 = class36.field218;
        if (class36.field229 != 0) {
            var44 = class36.field214;
            var45 = class36.field210;
        }
        if (var44 >= var8 && var44 < var8 + var10 && var45 >= var9 && var45 < var9 + var11) {
            class281.method5305(var44 - var8, var45 - var9);
        } else {
            class281.method7114();
        }
        method2592();
        class537.method8837(var8, var9, var10, var11, 0);
        method2592();
        int var46 = class267.method4671();
        class267.method4660(Statics.field3544.field171);
        class267.field2773.field3042 = field773;
        Statics.field231.method4837(Statics.field3016, Statics.field971, Statics.field234, Statics.field1390, Statics.field1982, var34);
        class267.method4660(false);
        if (field785) {
            class537.method8810();
        }
        class267.field2773.field3042 = var46;
        method2592();
        Statics.field231.method4809();
        field781 = 0;
        boolean var47 = false;
        int var48 = -1;
        int var49 = -1;
        int var50 = class108.field1362;
        int[] var51 = class108.field1370;
        for (int var52 = 0; var52 < field547 + var50; var52++) {
            class96 var53;
            if (var52 < var50) {
                var53 = field651[var51[var52]];
                if (field624 == var51[var52]) {
                    var47 = true;
                    var48 = var52;
                    continue;
                }
                if (Statics.field2420 == var53) {
                    var49 = var52;
                    continue;
                }
            } else {
                var53 = field776[field496[var52 - var50]];
            }
            method3222(var53, var52, var8, var9, var10, var11);
        }
        if (field616 && var49 != -1) {
            method3222(Statics.field2420, var49, var8, var9, var10, var11);
        }
        if (var47) {
            method3222(field651[field624], var48, var8, var9, var10, var11);
        }
        for (int var54 = 0; var54 < field781; var54++) {
            int var55 = field592[var54];
            int var56 = field593[var54];
            int var57 = field595[var54];
            int var58 = field735[var54];
            boolean var59 = true;
            while (var59) {
                var59 = false;
                for (int var60 = 0; var60 < var54; var60++) {
                    if (var56 + 2 > field593[var60] - field735[var60] && var56 - var58 < field593[var60] + 2 && var55 - var57 < field595[var60] + field592[var60] && var55 + var57 > field592[var60] - field595[var60] && field593[var60] - field735[var60] < var56) {
                        var56 = field593[var60] - field735[var60];
                        var59 = true;
                    }
                }
            }
            field701 = field592[var54];
            field696 = field593[var54] = var56;
            String var61 = field600[var54];
            if (field494 == 0) {
                int var62 = 16776960;
                if (field722[var54] < 6) {
                    var62 = field484[field722[var54]];
                }
                if (field722[var54] == 6) {
                    var62 = field670 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field722[var54] == 7) {
                    var62 = field670 % 20 < 10 ? 255 : 65535;
                }
                if (field722[var54] == 8) {
                    var62 = field670 % 20 < 10 ? 45056 : 8454016;
                }
                if (field722[var54] == 9) {
                    int var63 = 150 - field599[var54];
                    if (var63 < 50) {
                        var62 = var63 * 1280 + 16711680;
                    } else if (var63 < 100) {
                        var62 = 16776960 - (var63 - 50) * 327680;
                    } else if (var63 < 150) {
                        var62 = (var63 - 100) * 5 + 65280;
                    }
                }
                if (field722[var54] == 10) {
                    int var64 = 150 - field599[var54];
                    if (var64 < 50) {
                        var62 = var64 * 5 + 16711680;
                    } else if (var64 < 100) {
                        var62 = 16711935 - (var64 - 50) * 327680;
                    } else if (var64 < 150) {
                        var62 = (var64 - 100) * 327680 + 255 - (var64 - 100) * 5;
                    }
                }
                if (field722[var54] == 11) {
                    int var65 = 150 - field599[var54];
                    if (var65 < 50) {
                        var62 = 16777215 - var65 * 327685;
                    } else if (var65 < 100) {
                        var62 = (var65 - 50) * 327685 + 65280;
                    } else if (var65 < 150) {
                        var62 = 16777215 - (var65 - 100) * 327680;
                    }
                }
                if (field722[var54] == 12 && field598[var54] == null) {
                    int var66 = var61.length();
                    field598[var54] = new int[var66];
                    for (int var67 = 0; var67 < var66; var67++) {
                        int var68 = (int) ((float) var67 / (float) var66 * 64.0F);
                        int var69 = var68 << 10 | 0x380 | 0x40;
                        field598[var54][var67] = class479.field4837[var69];
                    }
                }
                if (field597[var54] == 0) {
                    Statics.field4352.method6993(var61, field701 + var8, field696 + var9, var62, 0, field598[var54]);
                }
                if (field597[var54] == 1) {
                    Statics.field4352.method7022(var61, field701 + var8, field696 + var9, var62, 0, field670, field598[var54]);
                }
                if (field597[var54] == 2) {
                    Statics.field4352.method6991(var61, field701 + var8, field696 + var9, var62, 0, field670, field598[var54]);
                }
                if (field597[var54] == 3) {
                    Statics.field4352.method6992(var61, field701 + var8, field696 + var9, var62, 0, field670, 150 - field599[var54], field598[var54]);
                }
                if (field597[var54] == 4) {
                    int var70 = (150 - field599[var54]) * (Statics.field4352.method7018(var61) + 100) / 150;
                    class537.method8756(field701 + var8 - 50, var9, field701 + var8 + 50, var9 + var11);
                    Statics.field4352.method6994(var61, field701 + var8 + 50 - var70, field696 + var9, var62, 0, field598[var54]);
                    class537.method8755(var8, var9, var8 + var10, var9 + var11);
                }
                if (field597[var54] == 5) {
                    int var71 = 150 - field599[var54];
                    int var72 = 0;
                    if (var71 < 25) {
                        var72 = var71 - 25;
                    } else if (var71 > 125) {
                        var72 = var71 - 125;
                    }
                    class537.method8756(var8, field696 + var9 - Statics.field4352.field4520 - 1, var8 + var10, field696 + var9 + 5);
                    Statics.field4352.method6993(var61, field701 + var8, field696 + var9 + var72, var62, 0, field598[var54]);
                    class537.method8755(var8, var9, var8 + var10, var9 + var11);
                }
            } else {
                Statics.field4352.method6987(var61, field701 + var8, field696 + var9, 16776960, 0);
            }
        }
        if (field507 == 2) {
            method8290((field510 - Statics.field1917 << 7) + field513, (field511 - Statics.field1322 << 7) + field514, field512 * 2);
            if (field701 > -1 && field500 % 20 < 10) {
                Statics.field421[0].method8885(field701 + var8 - 12, field696 + var9 - 28);
            }
        }
        ((class277) class267.field2773.field3043).method4992(field565);
        field737 = 0;
        int var73 = (Statics.field2420.field1247 >> 7) + Statics.field1917;
        int var74 = (Statics.field2420.field1173 >> 7) + Statics.field1322;
        if (var73 >= 3053 && var73 <= 3156 && var74 >= 3056 && var74 <= 3136) {
            field737 = 1;
        }
        if (var73 >= 3072 && var73 <= 3118 && var74 >= 9492 && var74 <= 9535) {
            field737 = 1;
        }
        if (field737 == 1 && var73 >= 3139 && var73 <= 3199 && var74 >= 3008 && var74 <= 3062) {
            field737 = 0;
        }
        Statics.field3016 = var37;
        Statics.field971 = var38;
        Statics.field234 = var39;
        Statics.field1390 = var40;
        Statics.field1982 = var41;
        if (field499 && Statics.field2557.method6374(true, false) == 0) {
            field499 = false;
        }
        if (field499) {
            class537.method8837(var8, var9, var10, var11, 0);
            method5337(class364.field4228, false);
        }
    }

    @ObfuscatedName("nw.jg(IIIIZB)V")
    public static final void method6176(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
            var6 = field762;
        } else {
            var6 = (field762 - field761) * var5 / 100 + field761;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field532) {
            short var8 = field532;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field766) {
                var6 = field766;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class537.method8787();
                    class537.method8837(arg0, arg1, var10, arg3, -16777216);
                    class537.method8837(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field723) {
            short var11 = field723;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field765) {
                var6 = field765;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class537.method8787();
                    class537.method8837(arg0, arg1, arg2, var13, -16777216);
                    class537.method8837(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field773 = arg3 * var6 / 334;
        if (field771 != arg2 || field607 != arg3) {
            method2607(arg2, arg3);
        }
        field714 = arg0;
        field770 = arg1;
        field771 = arg2;
        field607 = arg3;
    }

    @ObfuscatedName("da.jv(B)V")
    public static void method2322() {
        if (Statics.field2420.field1247 >> 7 == field738 && Statics.field2420.field1173 >> 7 == field739) {
            field738 = 0;
        }
    }

    @ObfuscatedName("mm.jl(I)V")
    public static void method5567() {
        if (field616) {
            method8215(Statics.field2420, false);
        }
    }

    @ObfuscatedName("to.jf(Lds;ZB)V")
    public static void method8215(class92 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2280() || arg0.field1098) {
            return;
        }
        arg0.field1115 = false;
        if ((field488 && class108.field1362 > 50 || class108.field1362 > 200) && arg1 && arg0.field1213 == arg0.field1178) {
            arg0.field1115 = true;
        }
        int var2 = arg0.field1247 >> 7;
        int var3 = arg0.field1173 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class281.method2317(0, 0, 0, false, arg0.field1108);
        if (arg0.field1110 != null && field500 >= arg0.field1105 && field500 < arg0.field1106) {
            arg0.field1115 = false;
            arg0.field1104 = method6196(arg0.field1247, arg0.field1173, Statics.field2658);
            arg0.field1177 = field500;
            Statics.field231.method4844(Statics.field2658, arg0.field1247, arg0.field1173, arg0.field1104, 60, arg0, arg0.field1180, var4, arg0.field1120, arg0.field1112, arg0.field1113, arg0.field1114);
            return;
        }
        if ((arg0.field1247 & 0x7F) == 64 && (arg0.field1173 & 0x7F) == 64) {
            if (field670 == field601[var2][var3]) {
                return;
            }
            field601[var2][var3] = field670;
        }
        arg0.field1104 = method6196(arg0.field1247, arg0.field1173, Statics.field2658);
        arg0.field1177 = field500;
        Statics.field231.method4915(Statics.field2658, arg0.field1247, arg0.field1173, arg0.field1104, 60, arg0, arg0.field1180, var4, arg0.field1174);
    }

    @ObfuscatedName("aq.jo(ZI)V")
    public static final void method271(boolean arg0) {
        for (int var1 = 0; var1 < field547; var1++) {
            class101 var2 = field776[field496[var1]];
            if (var2 != null && var2.method2280() && var2.field1311.field1965 == arg0 && var2.field1311.method3386()) {
                int var3 = var2.field1247 >> 7;
                int var4 = var2.field1173 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1199 == 1 && (var2.field1247 & 0x7F) == 64 && (var2.field1173 & 0x7F) == 64) {
                        if (field670 == field601[var3][var4]) {
                            continue;
                        }
                        field601[var3][var4] = field670;
                    }
                    long var5 = class281.method2317(0, 0, 1, !var2.field1311.field1961, field496[var1]);
                    var2.field1177 = field500;
                    Statics.field231.method4915(Statics.field2658, var2.field1247, var2.field1173, method6196(var2.field1247 + (var2.field1199 * 64 - 64), var2.field1173 + (var2.field1199 * 64 - 64), Statics.field2658), var2.field1199 * 64 - 64 + 60, var2, var2.field1180, var5, var2.field1174);
                }
            }
        }
    }

    @ObfuscatedName("mu.jb(B)V")
    public static final void method5603() {
        for (class77 var0 = (class77) field627.method6579(); var0 != null; var0 = (class77) field627.method6549()) {
            if (Statics.field2658 != var0.field963 || field500 > var0.field967) {
                var0.method7828();
            } else if (field500 >= var0.field948) {
                if (!var0.field953 && var0.field951 != 0) {
                    if (var0.field951 > 0) {
                        class101 var1 = field776[var0.field951 - 1];
                        if (var1 != null && var1.field1247 >= 0 && var1.field1247 < 13312 && var1.field1173 >= 0 && var1.field1173 < 13312) {
                            var0.field940 = var1.field1247;
                            var0.field962 = var1.field1173;
                            var0.method2097(var0.field961, var0.field939, var0.field946, field500);
                        }
                    } else {
                        int var2 = -var0.field951 - 1;
                        class92 var3;
                        if (field790 == var2) {
                            var3 = Statics.field2420;
                        } else {
                            var3 = field651[var2];
                        }
                        if (var3 != null && var3.field1247 >= 0 && var3.field1247 < 13312 && var3.field1173 >= 0 && var3.field1173 < 13312) {
                            var0.field940 = var3.field1247;
                            var0.field962 = var3.field1173;
                            var0.method2097(var0.field961, var0.field939, var0.field946, field500);
                        }
                    }
                }
                if (var0.field952 > 0) {
                    class101 var4 = field776[var0.field952 - 1];
                    if (var4 != null && var4.field1247 >= 0 && var4.field1247 < 13312 && var4.field1173 >= 0 && var4.field1173 < 13312) {
                        var0.method2097(var4.field1247, var4.field1173, method6196(var4.field1247, var4.field1173, var0.field963) - var0.field943, field500);
                    }
                }
                if (var0.field952 < 0) {
                    int var5 = -var0.field952 - 1;
                    class92 var6;
                    if (field790 == var5) {
                        var6 = Statics.field2420;
                    } else {
                        var6 = field651[var5];
                    }
                    if (var6 != null && var6.field1247 >= 0 && var6.field1247 < 13312 && var6.field1173 >= 0 && var6.field1173 < 13312) {
                        var0.method2097(var6.field1247, var6.field1173, method6196(var6.field1247, var6.field1173, var0.field963) - var0.field943, field500);
                    }
                }
                var0.method2093(field565);
                Statics.field231.method4915(Statics.field2658, (int) var0.field954, (int) var0.field955, (int) var0.field956, 60, var0, var0.field941, -1L, false);
            }
        }
    }

    @ObfuscatedName("ly.jr(I)I")
    public static final int method5313() {
        if (Statics.field2450.method2413()) {
            return Statics.field2658;
        }
        int var0 = 3;
        if (Statics.field1390 < 310) {
            int var1;
            int var2;
            if (field578 == 1) {
                var1 = Statics.field1279 >> 7;
                var2 = Statics.field460 >> 7;
            } else {
                var1 = Statics.field2420.field1247 >> 7;
                var2 = Statics.field2420.field1173 >> 7;
            }
            int var3 = Statics.field3016 >> 7;
            int var4 = Statics.field234 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field2658;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field2658;
            }
            if ((class82.field1001[Statics.field2658][var3][var4] & 0x4) != 0) {
                var0 = Statics.field2658;
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
                    if ((class82.field1001[Statics.field2658][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2658;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class82.field1001[Statics.field2658][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2658;
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
                    if ((class82.field1001[Statics.field2658][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field2658;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class82.field1001[Statics.field2658][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field2658;
                        }
                    }
                }
            }
        }
        if (Statics.field2420.field1247 >= 0 && Statics.field2420.field1173 >= 0 && Statics.field2420.field1247 < 13312 && Statics.field2420.field1173 < 13312) {
            if ((class82.field1001[Statics.field2658][Statics.field2420.field1247 >> 7][Statics.field2420.field1173 >> 7] & 0x4) != 0) {
                var0 = Statics.field2658;
            }
            return var0;
        } else {
            return Statics.field2658;
        }
    }

    @ObfuscatedName("im.jq(I)Lon;")
    public static class390 method3906() {
        return field702;
    }

    @ObfuscatedName("kv.jh(I)V")
    public static void method4658() {
        for (class223 var0 = (class223) field683.method6579(); var0 != null; var0 = (class223) field683.method6549()) {
            var0.method7828();
        }
    }

    @ObfuscatedName("np.jn(I)Z")
    public static boolean method6173() {
        return (field617 & 0x1) != 0;
    }

    @ObfuscatedName("ck.jm(I)Z")
    public static boolean method2098() {
        return (field617 & 0x8) != 0;
    }

    @ObfuscatedName("gt.jy(Ldf;IIIIIS)V")
    public static final void method3222(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2280()) {
            return;
        }
        if (arg0 instanceof class101) {
            class189 var6 = ((class101) arg0).field1311;
            if (var6.field1958 != null) {
                var6 = var6.method3385();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class108.field1362;
        int[] var8 = class108.field1370;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1226 != null && (!var9 || !arg0.field1175 && (field720 == 4 || !arg0.field1207 && (field720 == 0 || field720 == 3 || field720 == 1 && ((class92) arg0).method2268())))) {
            method325(arg0, arg0.field1232);
            if (field701 > -1 && field781 < field747) {
                field595[field781] = Statics.field4352.method7018(arg0.field1226) / 2;
                field735[field781] = Statics.field4352.field4520;
                field592[field781] = field701;
                field593[field781] = field696 - var10;
                field722[field781] = arg0.field1197;
                field597[field781] = arg0.field1198;
                field599[field781] = arg0.field1196;
                field598[field781] = arg0.field1237;
                field600[field781] = arg0.field1226;
                field781++;
                var10 += 12;
            }
        }
        if (!arg0.field1206.method6666()) {
            method325(arg0, arg0.field1232 + 15);
            for (class100 var11 = (class100) arg0.field1206.method6604(); var11 != null; var11 = (class100) arg0.field1206.method6606()) {
                class97 var12 = var11.method2520(field500);
                if (var12 != null) {
                    class181 var13 = var11.field1304;
                    class541 var14 = var13.method3324();
                    class541 var15 = var13.method3323();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field1879;
                    } else {
                        if (var13.field1869 * 2 < var15.field5236) {
                            var16 = var13.field1869;
                        }
                        var17 = var15.field5236 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field500 - var12.field1250;
                    int var21 = var12.field1252 * var17 / var13.field1879;
                    int var24;
                    if (var12.field1253 > var20) {
                        int var22 = var13.field1875 == 0 ? 0 : var20 / var13.field1875 * var13.field1875;
                        int var23 = var12.field1251 * var17 / var13.field1879;
                        var24 = (var21 - var23) * var22 / var12.field1253 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1253 + var13.field1876 - var20;
                        if (var13.field1872 >= 0) {
                            var18 = (var25 << 8) / (var13.field1876 - var13.field1872);
                        }
                    }
                    if (var12.field1252 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field701 > -1) {
                            int var31 = field701 + arg2 - (var17 >> 1);
                            int var32 = field696 + arg3 - var10;
                            class537.method8837(var31, var32, var24, 5, 65280);
                            class537.method8837(var24 + var31, var32, var17 - var24, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var26;
                        if (var17 == var24) {
                            var26 = var16 * 2 + var24;
                        } else {
                            var26 = var16 + var24;
                        }
                        int var27 = var14.field5239;
                        var10 += var27;
                        int var28 = field701 + arg2 - (var17 >> 1);
                        int var29 = field696 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method8891(var30, var29, var18);
                            class537.method8756(var30, var29, var26 + var30, var27 + var29);
                            var15.method8891(var30, var29, var18);
                        } else {
                            var14.method8885(var30, var29);
                            class537.method8756(var30, var29, var26 + var30, var27 + var29);
                            var15.method8885(var30, var29);
                        }
                        class537.method8755(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2524()) {
                    var11.method7828();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field500 == arg0.field1177) {
            class92 var33 = (class92) arg0;
            boolean var34;
            if (field617 == 0) {
                var34 = false;
            } else if (Statics.field2420 == var33) {
                var34 = method2098();
            } else {
                boolean var35 = (field617 & 0x4) != 0;
                boolean var36 = var35 || method6173() && var33.method2268();
                if (!var36) {
                    boolean var37 = (field617 & 0x2) != 0;
                    var36 = var37 && var33.method2271();
                }
                var34 = var36;
            }
            if (var34) {
                class92 var38 = (class92) arg0;
                if (var9) {
                    method325(arg0, arg0.field1232 + 15);
                    class410 var39 = (class410) field634.get(class497.field4989);
                    var10 += 4;
                    var39.method6987(var38.field1103.method9073(), field701 + arg2, field696 + arg3 - var10, 16777215, 0);
                    var10 += 18;
                }
            }
        }
        if (var9) {
            class92 var40 = (class92) arg0;
            if (var40.field1098) {
                return;
            }
            if (var40.field1096 != -1 || var40.field1097 != -1) {
                method325(arg0, arg0.field1232 + 15);
                if (field701 > -1) {
                    if (var40.field1096 != -1) {
                        var10 += 25;
                        Statics.field1435[var40.field1096].method8885(field701 + arg2 - 12, field696 + arg3 - var10);
                    }
                    if (var40.field1097 != -1) {
                        var10 += 25;
                        Statics.field3817[var40.field1097].method8885(field701 + arg2 - 12, field696 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field507 == 10 && field509 == var8[arg1]) {
                method325(arg0, arg0.field1232 + 15);
                if (field701 > -1) {
                    int var41 = Statics.field421[1].field5239 + var10;
                    Statics.field421[1].method8885(field701 + arg2 - 12, field696 + arg3 - var41);
                }
            }
        } else {
            class101 var42 = (class101) arg0;
            int[] var43 = var42.method2565();
            short[] var44 = var42.method2537();
            if (var44 != null && var43 != null) {
                for (int var45 = 0; var45 < var44.length; var45++) {
                    if (var44[var45] >= 0 && var43[var45] >= 0) {
                        long var46 = (long) var43[var45] << 8 | (long) var44[var45];
                        class541 var48 = (class541) field780.method7307(var46);
                        if (var48 == null) {
                            class541[] var49 = class542.method5165(Statics.field482, var43[var45], 0);
                            if (var49 != null && var44[var45] < var49.length) {
                                var48 = var49[var44[var45]];
                                field780.method7322(var46, var48);
                            }
                        }
                        if (var48 != null) {
                            method325(arg0, arg0.field1232 + 15);
                            if (field701 > -1) {
                                var48.method8885(field701 + arg2 - (var48.field5236 >> 1), field696 + (arg3 - var48.field5239) - 4);
                            }
                        }
                    }
                }
            }
            if (field507 == 1 && field508 == field496[arg1 - var7] && field500 % 20 < 10) {
                method325(arg0, arg0.field1232 + 15);
                if (field701 > -1) {
                    Statics.field421[0].method8885(field701 + arg2 - 12, field696 + arg3 - 28);
                }
            }
        }
        for (int var50 = 0; var50 < 4; var50++) {
            int var51 = arg0.field1203[var50];
            int var52 = arg0.field1201[var50];
            class201 var53 = null;
            int var54 = 0;
            if (var52 >= 0) {
                if (var51 <= field500) {
                    continue;
                }
                var53 = class201.method3066(arg0.field1201[var50]);
                var54 = var53.field2061;
                if (var53 != null && var53.field2072 != null) {
                    var53 = var53.method3539();
                    if (var53 == null) {
                        arg0.field1203[var50] = -1;
                        continue;
                    }
                }
            } else if (var51 < 0) {
                continue;
            }
            int var55 = arg0.field1224[var50];
            class201 var56 = null;
            if (var55 >= 0) {
                var56 = class201.method3066(var55);
                if (var56 != null && var56.field2072 != null) {
                    var56 = var56.method3539();
                }
            }
            if (var51 - var54 <= field500) {
                if (var53 == null) {
                    arg0.field1203[var50] = -1;
                } else {
                    method325(arg0, arg0.field1232 / 2);
                    if (field701 > -1) {
                        boolean var57 = true;
                        if (var50 == 1) {
                            field696 -= 20;
                        }
                        if (var50 == 2) {
                            field701 -= 15;
                            field696 -= 10;
                        }
                        if (var50 == 3) {
                            field701 += 15;
                            field696 -= 10;
                        }
                        Object var58 = null;
                        Object var59 = null;
                        Object var60 = null;
                        Object var61 = null;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        class541 var70 = null;
                        class541 var71 = null;
                        class541 var72 = null;
                        class541 var73 = null;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        class541 var83 = var53.method3545();
                        if (var83 != null) {
                            var62 = var83.field5236;
                            int var84 = var83.field5239;
                            if (var84 > var82) {
                                var82 = var84;
                            }
                            var66 = var83.field5238;
                        }
                        class541 var85 = var53.method3541();
                        if (var85 != null) {
                            var63 = var85.field5236;
                            int var86 = var85.field5239;
                            if (var86 > var82) {
                                var82 = var86;
                            }
                            var67 = var85.field5238;
                        }
                        class541 var87 = var53.method3542();
                        if (var87 != null) {
                            var64 = var87.field5236;
                            int var88 = var87.field5239;
                            if (var88 > var82) {
                                var82 = var88;
                            }
                            var68 = var87.field5238;
                        }
                        class541 var89 = var53.method3550();
                        if (var89 != null) {
                            var65 = var89.field5236;
                            int var90 = var89.field5239;
                            if (var90 > var82) {
                                var82 = var90;
                            }
                            var69 = var89.field5238;
                        }
                        if (var56 != null) {
                            var70 = var56.method3545();
                            if (var70 != null) {
                                var74 = var70.field5236;
                                int var91 = var70.field5239;
                                if (var91 > var82) {
                                    var82 = var91;
                                }
                                var78 = var70.field5238;
                            }
                            var71 = var56.method3541();
                            if (var71 != null) {
                                var75 = var71.field5236;
                                int var92 = var71.field5239;
                                if (var92 > var82) {
                                    var82 = var92;
                                }
                                var79 = var71.field5238;
                            }
                            var72 = var56.method3542();
                            if (var72 != null) {
                                var76 = var72.field5236;
                                int var93 = var72.field5239;
                                if (var93 > var82) {
                                    var82 = var93;
                                }
                                var80 = var72.field5238;
                            }
                            var73 = var56.method3550();
                            if (var73 != null) {
                                var77 = var73.field5236;
                                int var94 = var73.field5239;
                                if (var94 > var82) {
                                    var82 = var94;
                                }
                                var81 = var73.field5238;
                            }
                        }
                        class406 var95 = var53.method3544();
                        if (var95 == null) {
                            var95 = Statics.field4301;
                        }
                        class406 var96;
                        if (var56 == null) {
                            var96 = Statics.field4301;
                        } else {
                            var96 = var56.method3544();
                            if (var96 == null) {
                                var96 = Statics.field4301;
                            }
                        }
                        Object var97 = null;
                        String var98 = null;
                        boolean var99 = false;
                        int var100 = 0;
                        String var101 = var53.method3540(arg0.field1202[var50]);
                        int var102 = var95.method7018(var101);
                        if (var56 != null) {
                            var98 = var56.method3540(arg0.field1205[var50]);
                            var100 = var96.method7018(var98);
                        }
                        int var103 = 0;
                        int var104 = 0;
                        if (var63 > 0) {
                            if (var87 == null && var89 == null) {
                                var103 = 1;
                            } else {
                                var103 = var102 / var63 + 1;
                            }
                        }
                        if (var56 != null && var75 > 0) {
                            if (var72 == null && var73 == null) {
                                var104 = 1;
                            } else {
                                var104 = var100 / var75 + 1;
                            }
                        }
                        int var105 = 0;
                        int var106 = var105;
                        if (var62 > 0) {
                            var105 += var62;
                        }
                        var105 += 2;
                        int var107 = var105;
                        if (var64 > 0) {
                            var105 += var64;
                        }
                        int var108 = var105;
                        int var109 = var105;
                        int var111;
                        if (var63 > 0) {
                            int var110 = var63 * var103;
                            var111 = var105 + var110;
                            var109 = (var110 - var102) / 2 + var105;
                        } else {
                            var111 = var102 + var105;
                        }
                        int var112 = var111;
                        if (var65 > 0) {
                            var111 += var65;
                        }
                        int var113 = 0;
                        int var114 = 0;
                        int var115 = 0;
                        int var116 = 0;
                        int var117 = 0;
                        if (var56 != null) {
                            var111 += 2;
                            var113 = var111;
                            if (var74 > 0) {
                                var111 += var74;
                            }
                            var111 += 2;
                            var114 = var111;
                            if (var76 > 0) {
                                var111 += var76;
                            }
                            var115 = var111;
                            var117 = var111;
                            if (var75 > 0) {
                                int var118 = var75 * var104;
                                var111 += var118;
                                var117 += (var118 - var100) / 2;
                            } else {
                                var111 += var100;
                            }
                            var116 = var111;
                            if (var77 > 0) {
                                var111 += var77;
                            }
                        }
                        int var119 = arg0.field1203[var50] - field500;
                        int var120 = var53.field2066 - var53.field2066 * var119 / var53.field2061;
                        int var121 = var53.field2067 * var119 / var53.field2061 + -var53.field2067;
                        int var122 = field701 + arg2 - (var111 >> 1) + var120;
                        int var123 = field696 + arg3 - 12 + var121;
                        int var124 = var123;
                        int var125 = var82 + var123;
                        int var126 = var53.field2060 + var123 + 15;
                        int var127 = var126 - var95.field4521;
                        int var128 = var95.field4522 + var126;
                        if (var127 < var123) {
                            var124 = var127;
                        }
                        if (var128 > var125) {
                            var125 = var128;
                        }
                        int var129 = 0;
                        if (var56 != null) {
                            var129 = var56.field2060 + var123 + 15;
                            int var130 = var129 - var96.field4521;
                            int var131 = var96.field4522 + var129;
                            if (var130 < var124) {
                                ;
                            }
                            if (var131 > var125) {
                                ;
                            }
                        }
                        int var134 = 255;
                        if (var53.field2068 >= 0) {
                            var134 = (var119 << 8) / (var53.field2061 - var53.field2068);
                        }
                        if (var134 >= 0 && var134 < 255) {
                            if (var83 != null) {
                                var83.method8891(var106 + var122 - var66, var123, var134);
                            }
                            if (var87 != null) {
                                var87.method8891(var107 + var122 - var68, var123, var134);
                            }
                            if (var85 != null) {
                                for (int var135 = 0; var135 < var103; var135++) {
                                    var85.method8891(var63 * var135 + (var108 + var122 - var67), var123, var134);
                                }
                            }
                            if (var89 != null) {
                                var89.method8891(var112 + var122 - var69, var123, var134);
                            }
                            var95.method6986(var101, var109 + var122, var126, var53.field2062, 0, var134);
                            if (var56 != null) {
                                if (var70 != null) {
                                    var70.method8891(var113 + var122 - var78, var123, var134);
                                }
                                if (var72 != null) {
                                    var72.method8891(var114 + var122 - var80, var123, var134);
                                }
                                if (var71 != null) {
                                    for (int var136 = 0; var136 < var104; var136++) {
                                        var71.method8891(var75 * var136 + (var115 + var122 - var79), var123, var134);
                                    }
                                }
                                if (var73 != null) {
                                    var73.method8891(var116 + var122 - var81, var123, var134);
                                }
                                var96.method6986(var98, var117 + var122, var129, var56.field2062, 0, var134);
                            }
                        } else {
                            if (var83 != null) {
                                var83.method8885(var106 + var122 - var66, var123);
                            }
                            if (var87 != null) {
                                var87.method8885(var107 + var122 - var68, var123);
                            }
                            if (var85 != null) {
                                for (int var137 = 0; var137 < var103; var137++) {
                                    var85.method8885(var63 * var137 + (var108 + var122 - var67), var123);
                                }
                            }
                            if (var89 != null) {
                                var89.method8885(var112 + var122 - var69, var123);
                            }
                            var95.method6981(var101, var109 + var122, var126, var53.field2062 | 0xFF000000, 0);
                            if (var56 != null) {
                                if (var70 != null) {
                                    var70.method8885(var113 + var122 - var78, var123);
                                }
                                if (var72 != null) {
                                    var72.method8885(var114 + var122 - var80, var123);
                                }
                                if (var71 != null) {
                                    for (int var138 = 0; var138 < var104; var138++) {
                                        var71.method8885(var75 * var138 + (var115 + var122 - var79), var123);
                                    }
                                }
                                if (var73 != null) {
                                    var73.method8885(var116 + var122 - var81, var123);
                                }
                                var96.method6981(var98, var117 + var122, var129, var56.field2062 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.js(Ldf;II)V")
    public static final void method325(class96 arg0, int arg1) {
        method8290(arg0.field1247, arg0.field1173, arg1);
    }

    @ObfuscatedName("tu.ju(IIIS)V")
    public static final void method8290(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field701 = -1;
            field696 = -1;
            return;
        }
        int var3 = method6196(arg0, arg1, Statics.field2658) - arg2;
        int var4 = arg0 - Statics.field3016;
        int var5 = var3 - Statics.field971;
        int var6 = arg1 - Statics.field234;
        int var7 = class267.field2771[Statics.field1390];
        int var8 = class267.field2769[Statics.field1390];
        int var9 = class267.field2771[Statics.field1982];
        int var10 = class267.field2769[Statics.field1982];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field701 = field773 * var11 / var15 + field771 / 2;
            field696 = field773 * var14 / var15 + field607 / 2;
        } else {
            field701 = -1;
            field696 = -1;
        }
    }

    @ObfuscatedName("nx.jk(IIII)I")
    public static final int method6196(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class82.field1001[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class82.field1014[var5][var3][var4] + class82.field1014[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class82.field1014[var5][var3][var4 + 1] + class82.field1014[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("pr.je(III)I")
    public static int method6717(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field710 - field763) * var2 / 100 + field763;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("ob.jd(ZLuo;ZI)V")
    public static final void method6468(boolean arg0, class526 arg1, boolean arg2) {
        field596 = arg0;
        if (!field596) {
            int var3;
            int var4;
            int var5;
            if (arg2) {
                arg1.method8456();
                var3 = arg1.method8412();
                var4 = arg1.method8412();
                var5 = arg1.method8412();
            } else {
                var3 = arg1.method8412();
                var4 = arg1.method8453();
                var5 = arg1.method8412();
            }
            Statics.field1395 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field1395[var6][var7] = arg1.method8416();
                }
            }
            Statics.field1865 = new int[var5];
            Statics.field1445 = new int[var5];
            Statics.field1449 = new int[var5];
            Statics.field2512 = new byte[var5][];
            Statics.field4370 = new byte[var5][];
            int var8 = 0;
            for (int var9 = (var4 - 6) / 8; var9 <= (var4 + 6) / 8; var9++) {
                for (int var10 = (var3 - 6) / 8; var10 <= (var3 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    Statics.field1865[var8] = var11;
                    Statics.field1445[var8] = Statics.field2533.method6300("m" + var9 + "_" + var10);
                    Statics.field1449[var8] = Statics.field2533.method6300("l" + var9 + "_" + var10);
                    var8++;
                }
            }
            method5250(var4, var3, true);
            return;
        }
        int var12 = arg1.method8453();
        boolean var13 = arg1.method8410() == 1;
        int var14 = arg1.method8412();
        int var15 = arg1.method8412();
        arg1.method8359();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method8360(1);
                    if (var19 == 1) {
                        field563[var16][var17][var18] = arg1.method8360(26);
                    } else {
                        field563[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method8351();
        Statics.field1395 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field1395[var20][var21] = arg1.method8416();
            }
        }
        Statics.field1865 = new int[var15];
        Statics.field1445 = new int[var15];
        Statics.field1449 = new int[var15];
        Statics.field2512 = new byte[var15][];
        Statics.field4370 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field563[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field1865[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field1865[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field1445[var22] = Statics.field2533.method6300("m" + var31 + "_" + var32);
                            Statics.field1449[var22] = Statics.field2533.method6300("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method5250(var14, var12, !var13);
    }

    @ObfuscatedName("lz.ji(IIZI)V")
    public static final void method5250(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field4741 == arg0 && Statics.field2368 == arg1) {
            return;
        }
        Statics.field4741 = arg0;
        Statics.field2368 = arg1;
        method4139(25);
        method5337(class364.field4228, true);
        int var3 = Statics.field1917;
        int var4 = Statics.field1322;
        Statics.field1917 = (arg0 - 6) * 8;
        Statics.field1322 = (arg1 - 6) * 8;
        int var5 = Statics.field1917 - var3;
        int var6 = Statics.field1322 - var4;
        int var7 = Statics.field1917;
        int var8 = Statics.field1322;
        for (int var9 = 0; var9 < 65536; var9++) {
            class101 var10 = field776[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1243[var11] -= var5;
                    var10.field1244[var11] -= var6;
                }
                var10.field1247 -= var5 * 128;
                var10.field1173 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class92 var13 = field651[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1243[var14] -= var5;
                    var13.field1244[var14] -= var6;
                }
                var13.field1247 -= var5 * 128;
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
                        field697[var25][var21][var22] = field697[var25][var23][var24];
                    } else {
                        field697[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class95 var26 = (class95) field626.method6579(); var26 != null; var26 = (class95) field626.method6549()) {
            var26.field1155 -= var5;
            var26.field1156 -= var6;
            if (var26.field1155 < 0 || var26.field1156 < 0 || var26.field1155 >= 104 || var26.field1156 >= 104) {
                var26.method7828();
            }
        }
        if (field738 != 0) {
            field738 -= var5;
            field739 -= var6;
        }
        field754 = 0;
        field789 = false;
        Statics.field3016 -= var5 << 7;
        Statics.field234 -= var6 << 7;
        Statics.field1279 -= var5 << 7;
        Statics.field460 -= var6 << 7;
        field602 = -1;
        field628.method6576();
        field627.method6576();
        for (int var27 = 0; var27 < 4; var27++) {
            field561[var27].method3987();
        }
    }

    @ObfuscatedName("dz.jw(ZB)V")
    public static final void method2385(boolean arg0) {
        method2592();
        field590.field1414++;
        if (field590.field1414 < 50 && !arg0) {
            return;
        }
        field590.field1414 = 0;
        if (field553 || field590.method2737() == null) {
            return;
        }
        class308 var1 = class308.method2768(class306.field3154, field590.field1405);
        field590.method2719(var1);
        try {
            field590.method2723();
        } catch (IOException var3) {
            field553 = true;
        }
    }

    @ObfuscatedName("ok.jc(B)V")
    public static final void method6522() {
        method2385(false);
        field556 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2512.length; var1++) {
            if (Statics.field1445[var1] != -1 && Statics.field2512[var1] == null) {
                Statics.field2512[var1] = Statics.field2533.method6284(Statics.field1445[var1], 0);
                if (Statics.field2512[var1] == null) {
                    var0 = false;
                    field556++;
                }
            }
            if (Statics.field1449[var1] != -1 && Statics.field4370[var1] == null) {
                Statics.field4370[var1] = Statics.field2533.method6285(Statics.field1449[var1], 0, Statics.field1395[var1]);
                if (Statics.field4370[var1] == null) {
                    var0 = false;
                    field556++;
                }
            }
        }
        if (!var0) {
            field560 = 1;
            return;
        }
        field522 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2512.length; var3++) {
            byte[] var4 = Statics.field4370[var3];
            if (var4 != null) {
                int var5 = (Statics.field1865[var3] >> 8) * 64 - Statics.field1917;
                int var6 = (Statics.field1865[var3] & 0xFF) * 64 - Statics.field1322;
                if (field596) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class82.method3074(var4, var5, var6);
            }
        }
        if (!var2) {
            field560 = 2;
            return;
        }
        if (field560 != 0) {
            method5337(class364.field4228 + class102.field1317 + class102.field1319 + 100 + "%" + class102.field1321, true);
        }
        method2592();
        Statics.field231.method4919();
        for (int var7 = 0; var7 < 4; var7++) {
            field561[var7].method3987();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class82.field1001[var8][var9][var10] = 0;
                }
            }
        }
        method2592();
        class82.method5512();
        int var11 = Statics.field2512.length;
        class70.method4434();
        method2385(true);
        if (!field596) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field1865[var12] >> 8) * 64 - Statics.field1917;
                int var14 = (Statics.field1865[var12] & 0xFF) * 64 - Statics.field1322;
                byte[] var15 = Statics.field2512[var12];
                if (var15 != null) {
                    method2592();
                    class82.method7232(var15, var13, var14, Statics.field4741 * 8 - 48, Statics.field2368 * 8 - 48, field561);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field1865[var16] >> 8) * 64 - Statics.field1917;
                int var18 = (Statics.field1865[var16] & 0xFF) * 64 - Statics.field1322;
                byte[] var19 = Statics.field2512[var16];
                if (var19 == null && Statics.field2368 < 800) {
                    method2592();
                    class82.method664(var17, var18, 64, 64);
                }
            }
            method2385(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field4370[var20];
                if (var21 != null) {
                    int var22 = (Statics.field1865[var20] >> 8) * 64 - Statics.field1917;
                    int var23 = (Statics.field1865[var20] & 0xFF) * 64 - Statics.field1322;
                    method2592();
                    class82.method4475(var21, var22, var23, Statics.field231, field561);
                }
            }
        }
        if (field596) {
            for (int var24 = 0; var24 < 4; var24++) {
                method2592();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field563[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field1865.length; var34++) {
                                if (Statics.field1865[var34] == var33 && Statics.field2512[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class82.method538(Statics.field2512[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field561);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class82.method4081(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field563[0][var37][var38];
                    if (var39 == -1) {
                        class82.method664(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method2385(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method2592();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field563[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field1865.length; var49++) {
                                if (Statics.field1865[var49] == var48 && Statics.field4370[var49] != null) {
                                    class82.method2178(Statics.field4370[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field231, field561);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2385(true);
        method2592();
        class82.method3150(Statics.field231, field561);
        method2385(true);
        int var50 = class82.field1002;
        if (var50 > Statics.field2658) {
            var50 = Statics.field2658;
        }
        if (var50 < Statics.field2658 - 1) {
            int var51 = Statics.field2658 - 1;
        }
        if (field488) {
            Statics.field231.method4796(class82.field1002);
        } else {
            Statics.field231.method4796(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method3147(var52, var53);
            }
        }
        method2592();
        Statics.method2264();
        class202.field2080.method5292();
        if (Statics.field3544.method528()) {
            class308 var54 = class308.method2768(class306.field3135, field590.field1405);
            var54.field3243.method8396(1057001181);
            field590.method2719(var54);
        }
        if (!field596) {
            int var55 = (Statics.field4741 - 6) / 8;
            int var56 = (Statics.field4741 + 6) / 8;
            int var57 = (Statics.field2368 - 6) / 8;
            int var58 = (Statics.field2368 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field2533.method6335("m" + var59 + "_" + var60);
                        Statics.field2533.method6335("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method4139(30);
        method2592();
        class82.method5566();
        class308 var61 = class308.method2768(class306.field3199, field590.field1405);
        field590.method2719(var61);
        class35.method4369();
    }

    @ObfuscatedName("js.jz(II)V")
    public static final void method4470(int arg0) {
        int[] var1 = Statics.field1331.field5244;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class82.field1001[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field231.method4830(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class82.field1001[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field231.method4830(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1331.method8896();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class82.field1001[arg0][var10][var9] & 0x18) == 0) {
                    method8267(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class82.field1001[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method8267(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field734 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field231.method4824(Statics.field2658, var11, var12);
                if (var13 != 0L) {
                    int var15 = Statics.method4107(var13);
                    int var16 = Statics.method4138(var15).field2104;
                    if (var16 >= 0 && class178.method3048(var16).field1825) {
                        field711[field734] = class178.method3048(var16).method3253(false);
                        field551[field734] = var11;
                        field625[field734] = var12;
                        field734++;
                    }
                }
            }
        }
        Statics.field3588.method8844();
    }

    @ObfuscatedName("tv.jj(IIIIIB)V")
    public static final void method8267(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field231.method4821(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field231.method4825(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class281.method3798(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field1331.field5244;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = Statics.method4107(var5);
            class202 var14 = Statics.method4138(var13);
            if (var14.field2105 == -1) {
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
                class540 var15 = Statics.field1815[var14.field2105];
                if (var15 != null) {
                    int var16 = (var14.field2091 * 4 - var15.field5229) / 2;
                    int var17 = (var14.field2100 * 4 - var15.field5230) / 2;
                    var15.method8853(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field2100) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field231.method4813(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field231.method4825(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = Statics.method4107(var18);
            class202 var24 = Statics.method4138(var23);
            if (var24.field2105 != -1) {
                class540 var25 = Statics.field1815[var24.field2105];
                if (var25 != null) {
                    int var26 = (var24.field2091 * 4 - var25.field5229) / 2;
                    int var27 = (var24.field2100 * 4 - var25.field5230) / 2;
                    var25.method8853(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field2100) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class281.method3798(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field1331.field5244;
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
        long var31 = Statics.field231.method4824(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = Statics.method4107(var31);
        class202 var34 = Statics.method4138(var33);
        if (var34.field2105 == -1) {
            return;
        }
        class540 var35 = Statics.field1815[var34.field2105];
        if (var35 != null) {
            int var36 = (var34.field2091 * 4 - var35.field5229) / 2;
            int var37 = (var34.field2100 * 4 - var35.field5230) / 2;
            var35.method8853(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field2100) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.jx(Lef;II)Z")
    public boolean method1199(class112 arg0, int arg1) {
        if (arg0.field1411 == 0) {
            Statics.field106 = null;
        } else {
            if (Statics.field106 == null) {
                Statics.field106 = new class441(Statics.field1079, Statics.field3544);
            }
            Statics.field106.method7358(arg0.field1409, arg1);
        }
        field693 = field682;
        Statics.field3816 = true;
        arg0.field1418 = null;
        return true;
    }

    @ObfuscatedName("client.ja(Lef;B)Z")
    public boolean method1473(class112 arg0) {
        if (Statics.field106 != null) {
            Statics.field106.method7359(arg0.field1409);
        }
        field693 = field682;
        Statics.field3816 = true;
        arg0.field1418 = null;
        return true;
    }

    @ObfuscatedName("client.jt(Lef;B)Z")
    public final boolean method1725(class112 arg0) {
        class451 var2 = arg0.method2737();
        class526 var3 = arg0.field1409;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1418 == null) {
                if (arg0.field1412) {
                    if (!var2.method7528(1)) {
                        return false;
                    }
                    var2.method7531(arg0.field1409.field5140, 0, 1);
                    arg0.field1413 = 0;
                    arg0.field1412 = false;
                }
                var3.field5137 = 0;
                if (var3.method8356()) {
                    if (!var2.method7528(1)) {
                        return false;
                    }
                    var2.method7531(arg0.field1409.field5140, 1, 1);
                    arg0.field1413 = 0;
                }
                arg0.field1412 = true;
                class309[] var4 = class309.method162();
                int var5 = var3.method8357();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5137);
                }
                arg0.field1418 = var4[var5];
                arg0.field1411 = arg0.field1418.field3377;
            }
            if (arg0.field1411 == -1) {
                if (!var2.method7528(1)) {
                    return false;
                }
                arg0.method2737().method7531(var3.field5140, 0, 1);
                arg0.field1411 = var3.field5140[0] & 0xFF;
            }
            if (arg0.field1411 == -2) {
                if (!var2.method7528(2)) {
                    return false;
                }
                arg0.method2737().method7531(var3.field5140, 0, 2);
                var3.field5137 = 0;
                arg0.field1411 = var3.method8412();
            }
            if (!var2.method7528(arg0.field1411)) {
                return false;
            }
            var3.field5137 = 0;
            var2.method7531(var3.field5140, 0, arg0.field1411);
            arg0.field1413 = 0;
            field554.method7208();
            arg0.field1417 = arg0.field1410;
            arg0.field1410 = arg0.field1415;
            arg0.field1415 = arg0.field1418;
            if (class309.field3273 == arg0.field1418) {
                String var6 = var3.method8535();
                String var7 = class410.method7025(class399.method297(class351.method2923(var3)));
                class111.method6477(6, var6, var7);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3292 == arg0.field1418) {
                method2629(class307.field3228);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3314 == arg0.field1418) {
                method5382();
                byte var8 = var3.method8616();
                if (arg0.field1411 == 1) {
                    if (var8 >= 0) {
                        field731[var8] = null;
                    } else {
                        Statics.field4839 = null;
                    }
                    arg0.field1418 = null;
                    return true;
                }
                if (var8 >= 0) {
                    field731[var8] = new class156(var3);
                } else {
                    Statics.field4839 = new class156(var3);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3275 == arg0.field1418) {
                int var9 = arg0.field1411 + var3.field5137;
                int var10 = var3.method8412();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = var3.method8412();
                if (field505 != var10) {
                    field505 = var10;
                    this.method1205(false);
                    method2940(field505);
                    class71.method2630(field505);
                    for (int var12 = 0; var12 < 100; var12++) {
                        field709[var12] = true;
                    }
                }
                while (var11-- > 0) {
                    int var13 = var3.method8416();
                    int var14 = var3.method8412();
                    int var15 = var3.method8410();
                    class87 var16 = (class87) field659.method8154((long) var13);
                    if (var16 != null && var16.field1052 != var14) {
                        method5307(var16, true);
                        var16 = null;
                    }
                    if (var16 == null) {
                        var16 = method2803(var13, var14, var15);
                    }
                    var16.field1048 = true;
                }
                for (class87 var17 = (class87) field659.method8157(); var17 != null; var17 = (class87) field659.method8158()) {
                    if (var17.field1048) {
                        var17.field1048 = false;
                    } else {
                        method5307(var17, true);
                    }
                }
                field706 = new class501(512);
                while (var3.field5137 < var9) {
                    int var18 = var3.method8416();
                    int var19 = var3.method8412();
                    int var20 = var3.method8412();
                    int var21 = var3.method8416();
                    for (int var22 = var19; var22 <= var20; var22++) {
                        long var23 = ((long) var18 << 32) + (long) var22;
                        field706.method8156(new class484(var21), var23);
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3272 == arg0.field1418) {
                int var25 = var3.method8412();
                int var26 = var3.method8410();
                int var27 = var3.method8412();
                method7634(var25, var26, var27);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3358 == arg0.field1418) {
                field789 = true;
                field483 = false;
                field749 = true;
                Statics.field457 = var3.method8410();
                Statics.field2315 = var3.method8410();
                int var28 = var3.method8412();
                int var29 = var3.method8410() * 128 + 64;
                int var30 = var3.method8410() * 128 + 64;
                int var31 = var3.method8412();
                field662 = var3.method8572();
                int var32 = var3.method8410();
                int var33 = Statics.field457 * 128 + 64;
                int var34 = Statics.field2315 * 128 + 64;
                boolean var35 = false;
                boolean var36 = false;
                int var37;
                int var38;
                if (field662) {
                    var37 = Statics.field971;
                    var38 = method6196(var33, var34, Statics.field2658) - var28;
                } else {
                    var37 = method6196(Statics.field3016, Statics.field234, Statics.field2658) - Statics.field971;
                    var38 = var28;
                }
                field752 = new class489(Statics.field3016, Statics.field234, var37, var33, var34, var38, var29, var30, var31, var32);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3267 == arg0.field1418) {
                field720 = var3.method8445();
                field604 = var3.method8646();
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3256 == arg0.field1418) {
                int var39 = var3.method8453();
                int var40 = var3.method8469();
                class344 var41 = Statics.field1878.method5636(var40);
                if (var41 != null && var41.field3714 == 0) {
                    if (var39 > var41.field3652 - var41.field3676) {
                        var39 = var41.field3652 - var41.field3676;
                    }
                    if (var39 < 0) {
                        var39 = 0;
                    }
                    if (var41.field3738 != var39) {
                        var41.field3738 = var39;
                        method3158(var41);
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3355 == arg0.field1418) {
                method2263(true, var3);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3365 == arg0.field1418) {
                Statics.field678 = null;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3290 == arg0.field1418) {
                boolean var42 = var3.method8572();
                if (!var42) {
                    Statics.field3457 = null;
                } else if (Statics.field3457 == null) {
                    Statics.field3457 = new class382();
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3299 == arg0.field1418) {
                int var43 = var3.method8412();
                int var44 = var3.method8469();
                class344 var45 = Statics.field1878.method5636(var44);
                if (var45.field3712 != 6 || var45.field3689 != var43) {
                    var45.field3712 = 6;
                    var45.field3689 = var43;
                    method3158(var45);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3329 == arg0.field1418) {
                return this.method1199(arg0, 1);
            }
            if (class309.field3375 == arg0.field1418) {
                class37.method3079(var3, arg0.field1411);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3280 == arg0.field1418) {
                int var46 = var3.method8410();
                if (var3.method8410() == 0) {
                    field778[var46] = new class380();
                    var3.field5137 += 18;
                } else {
                    var3.field5137--;
                    field778[var46] = new class380(var3, false);
                }
                field552 = field682;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3326 == arg0.field1418) {
                method2629(class307.field3236);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3291 == arg0.field1418) {
                field740 = var3.method8410();
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3332 == arg0.field1418) {
                class108.method1903(var3, arg0.field1411);
                method4435();
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3308 == arg0.field1418) {
                for (int var47 = 0; var47 < class333.field3554.length; var47++) {
                    if (class333.field3554[var47] != class333.field3551[var47]) {
                        class333.field3554[var47] = class333.field3551[var47];
                        Statics.method2100(var47);
                        field713[++field684 - 1 & 0x1F] = var47;
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3283 == arg0.field1418) {
                int var48 = var3.method8416();
                class87 var49 = (class87) field659.method8154((long) var48);
                if (var49 != null) {
                    method5307(var49, true);
                }
                if (field663 != null) {
                    method3158(field663);
                    field663 = null;
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3252 == arg0.field1418) {
                method5382();
                byte var50 = var3.method8616();
                class148 var51 = new class148(var3);
                class156 var52;
                if (var50 >= 0) {
                    var52 = field731[var50];
                } else {
                    var52 = Statics.field4839;
                }
                if (var52 == null) {
                    this.method1210(var50);
                    arg0.field1418 = null;
                    return true;
                }
                if (var51.field1656 > var52.field1702) {
                    this.method1210(var50);
                    arg0.field1418 = null;
                    return true;
                }
                if (var51.field1656 < var52.field1702) {
                    arg0.field1418 = null;
                    return true;
                }
                var51.method3059(var52);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3293 == arg0.field1418) {
                int var53 = var3.method8444();
                int var54 = var53 >> 2;
                int var55 = var53 & 0x3;
                int var56 = field564[var54];
                int var57 = var3.method8412();
                int var58 = var3.method8414();
                int var59 = var58 >> 16;
                int var60 = var58 >> 8 & 0xFF;
                int var61 = (var58 >> 4 & 0x7) + var59;
                int var62 = (var58 & 0x7) + var60;
                if (var61 >= 0 && var62 >= 0 && var61 < 103 && var62 < 103) {
                    if (var56 == 0) {
                        class288 var63 = Statics.field231.method4817(Statics.field2658, var61, var62);
                        if (var63 != null) {
                            int var64 = Statics.method4107(var63.field3068);
                            if (var54 == 2) {
                                var63.field3066 = new class80(var64, 2, var55 + 4, Statics.field2658, var61, var62, var57, false, var63.field3066);
                                var63.field3067 = new class80(var64, 2, var55 + 1 & 0x3, Statics.field2658, var61, var62, var57, false, var63.field3067);
                            } else {
                                var63.field3066 = new class80(var64, var54, var55, Statics.field2658, var61, var62, var57, false, var63.field3066);
                            }
                        }
                    } else if (var56 == 1) {
                        class290 var65 = Statics.field231.method4818(Statics.field2658, var61, var62);
                        if (var65 != null) {
                            int var66 = Statics.method4107(var65.field3076);
                            if (var54 == 4 || var54 == 5) {
                                var65.field3080 = new class80(var66, 4, var55, Statics.field2658, var61, var62, var57, false, var65.field3080);
                            } else if (var54 == 6) {
                                var65.field3080 = new class80(var66, 4, var55 + 4, Statics.field2658, var61, var62, var57, false, var65.field3080);
                            } else if (var54 == 7) {
                                var65.field3080 = new class80(var66, 4, (var55 + 2 & 0x3) + 4, Statics.field2658, var61, var62, var57, false, var65.field3080);
                            } else if (var54 == 8) {
                                var65.field3080 = new class80(var66, 4, var55 + 4, Statics.field2658, var61, var62, var57, false, var65.field3080);
                                var65.field3077 = new class80(var66, 4, (var55 + 2 & 0x3) + 4, Statics.field2658, var61, var62, var57, false, var65.field3077);
                            }
                        }
                    } else if (var56 == 2) {
                        class291 var67 = Statics.field231.method4819(Statics.field2658, var61, var62);
                        if (var54 == 11) {
                            var54 = 10;
                        }
                        if (var67 != null) {
                            var67.field3086 = new class80(Statics.method4107(var67.field3096), var54, var55, Statics.field2658, var61, var62, var57, false, var67.field3086);
                        }
                    } else if (var56 == 3) {
                        class263 var68 = Statics.field231.method4929(Statics.field2658, var61, var62);
                        if (var68 != null) {
                            var68.field2711 = new class80(Statics.method4107(var68.field2712), 22, var55, Statics.field2658, var61, var62, var57, false, var68.field2711);
                        }
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3271 == arg0.field1418) {
                int var69 = var3.method8412();
                int var70 = var3.method8410();
                int var71 = var3.method8414();
                int var72 = var71 >> 16;
                int var73 = var71 >> 8 & 0xFF;
                int var74 = (var71 >> 4 & 0x7) + var72;
                int var75 = (var71 & 0x7) + var73;
                byte var76 = var3.method8616();
                int var77 = var3.method8454();
                int var78 = var3.method8412();
                int var79 = var3.method8463();
                int var80 = var3.method8646() * 4;
                int var81 = var3.method8410() * 4;
                int var82 = var3.method8453();
                byte var83 = var3.method8446();
                int var84 = var74 + var76;
                int var85 = var75 + var83;
                if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104 && var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var78 != 65535) {
                    int var86 = var74 * 128 + 64;
                    int var87 = var75 * 128 + 64;
                    int var88 = var84 * 128 + 64;
                    int var89 = var85 * 128 + 64;
                    class77 var90 = new class77(var78, Statics.field2658, var86, var87, method6196(var86, var87, Statics.field2658) - var81, field500 + var69, field500 + var77, var70, var82, var79, var80);
                    var90.method2097(var88, var89, method6196(var88, var89, Statics.field2658) - var80, field500 + var69);
                    field627.method6547(var90);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3343 == arg0.field1418) {
                method2629(class307.field3237);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3345 == arg0.field1418) {
                int var91 = var3.method8410();
                int var92 = var3.method8646();
                int var93 = var3.method8416();
                class344 var94 = Statics.field1878.method5636(var93);
                Statics.method5315(var94, var91, var92);
                method3158(var94);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3296 == arg0.field1418) {
                int var95 = var3.method8452();
                int var96 = var3.method8468();
                int var97 = var3.method8646();
                class87 var98 = (class87) field659.method8154((long) var96);
                if (var98 != null) {
                    method5307(var98, var98.field1052 != var95);
                }
                method2803(var96, var95, var97);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3334 == arg0.field1418) {
                int var99 = var3.method8416();
                int var100 = var3.method8412();
                if (var99 < -70000) {
                    var100 += 32768;
                }
                class344 var101;
                if (var99 >= 0) {
                    var101 = Statics.field1878.method5636(var99);
                } else {
                    var101 = null;
                }
                if (var101 != null) {
                    for (int var102 = 0; var102 < var101.field3791.length; var102++) {
                        var101.field3791[var102] = 0;
                        var101.field3792[var102] = 0;
                    }
                }
                class85.method441(var100);
                int var103 = var3.method8412();
                for (int var104 = 0; var104 < var103; var104++) {
                    int var105 = var3.method8453();
                    int var106 = var3.method8646();
                    if (var106 == 255) {
                        var106 = var3.method8416();
                    }
                    if (var101 != null && var104 < var101.field3791.length) {
                        var101.field3791[var104] = var105;
                        var101.field3792[var104] = var106;
                    }
                    class85.method3371(var100, var104, var105 - 1, var106);
                }
                if (var101 != null) {
                    method3158(var101);
                }
                method6719();
                field542[++field686 - 1 & 0x1F] = var100 & 0x7FFF;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3370 == arg0.field1418) {
                int var107 = var3.method8468();
                class344 var108 = Statics.field1878.method5636(var107);
                for (int var109 = 0; var109 < var108.field3791.length; var109++) {
                    var108.field3791[var109] = -1;
                    var108.field3791[var109] = 0;
                }
                method3158(var108);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3321 == arg0.field1418) {
                String var110 = var3.method8535();
                long var111 = (long) var3.method8412();
                long var113 = (long) var3.method8414();
                class366 var115 = (class366) class385.method164(class366.method5568(), var3.method8410());
                long var116 = (var111 << 32) + var113;
                boolean var118 = false;
                for (int var119 = 0; var119 < 100; var119++) {
                    if (field576[var119] == var116) {
                        var118 = true;
                        break;
                    }
                }
                if (Statics.field52.method1802(new class550(var110, Statics.field1079))) {
                    var118 = true;
                }
                if (!var118 && field737 == 0) {
                    field576[field724] = var116;
                    field724 = (field724 + 1) % 100;
                    String var120 = class410.method7025(class399.method297(class351.method2923(var3)));
                    byte var121;
                    if (var115.field4261) {
                        var121 = 7;
                    } else {
                        var121 = 3;
                    }
                    if (var115.field4260 == -1) {
                        class111.method6477(var121, var110, var120);
                    } else {
                        class111.method6477(var121, class102.method3484(var115.field4260) + var110, var120);
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3279 == arg0.field1418) {
                Statics.field1797 = class546.method4203(var3.method8410());
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3251 == arg0.field1418) {
                field789 = true;
                field483 = false;
                field750 = true;
                int var122 = method5565(var3.method8508() & 0x7EB);
                int var123 = method4420(var3.method8508() & 0x7EB);
                int var124 = var3.method8412();
                int var125 = var3.method8410();
                field673 = new class491(Statics.field1390, var123, var124, var125);
                field753 = new class491(Statics.field1982, var122, var124, var125);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3263 == arg0.field1418) {
                field506 = var3.method8412() * 30;
                field698 = field682;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3268 == arg0.field1418) {
                int var126 = var3.method8416();
                class344 var127 = Statics.field1878.method5636(var126);
                var127.field3712 = 3;
                var127.field3689 = Statics.field2420.field1100.method5689();
                method3158(var127);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3309 == arg0.field1418) {
                int var128 = var3.method8455();
                int var129 = var3.method8416();
                class344 var130 = Statics.field1878.method5636(var129);
                if (var130.field3708 != var128 || var128 == -1) {
                    var130.field3708 = var128;
                    var130.field3692 = 0;
                    var130.field3729 = 0;
                    method3158(var130);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3367 == arg0.field1418) {
                method6719();
                field664 = var3.method8412();
                field698 = field682;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3276 == arg0.field1418) {
                byte var131 = var3.method8447();
                int var132 = var3.method8412();
                class333.field3551[var132] = var131;
                if (class333.field3554[var132] != var131) {
                    class333.field3554[var132] = var131;
                }
                Statics.method2100(var132);
                field713[++field684 - 1 & 0x1F] = var132;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3372 == arg0.field1418) {
                return this.method1199(arg0, 2);
            }
            if (class309.field3359 == arg0.field1418) {
                method2629(class307.field3235);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3278 == arg0.field1418) {
                field507 = var3.method8410();
                if (field507 == 1) {
                    field508 = var3.method8412();
                }
                if (field507 >= 2 && field507 <= 6) {
                    if (field507 == 2) {
                        field513 = 64;
                        field514 = 64;
                    }
                    if (field507 == 3) {
                        field513 = 0;
                        field514 = 64;
                    }
                    if (field507 == 4) {
                        field513 = 128;
                        field514 = 64;
                    }
                    if (field507 == 5) {
                        field513 = 64;
                        field514 = 0;
                    }
                    if (field507 == 6) {
                        field513 = 64;
                        field514 = 128;
                    }
                    field507 = 2;
                    field510 = var3.method8412();
                    field511 = var3.method8412();
                    field512 = var3.method8410();
                }
                if (field507 == 10) {
                    field509 = var3.method8412();
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3320 == arg0.field1418) {
                if (Statics.field678 == null) {
                    Statics.field678 = new class467(Statics.field1356);
                }
                class536 var133 = Statics.field1356.method7761(var3);
                Statics.field678.field4800.method8176(var133.field5205, var133.field5206);
                field689[++field690 - 1 & 0x1F] = var133.field5205;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3369 == arg0.field1418) {
                int var134 = var3.method8412();
                int var135 = var3.method8467();
                class344 var136 = Statics.field1878.method5636(var135);
                if (var136.field3712 != 1 || var136.field3689 != var134) {
                    var136.field3712 = 1;
                    var136.field3689 = var134;
                    method3158(var136);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3255 == arg0.field1418) {
                int var137 = var3.method8452();
                int var138 = var3.method8646();
                int var139 = var3.method8469();
                int var140 = var3.method8453();
                class92 var141;
                if (field790 == var140) {
                    var141 = Statics.field2420;
                } else {
                    var141 = field651[var140];
                }
                if (var141 != null) {
                    var141.method2340(var138, var137, var139 >> 16, var139 & 0xFFFF);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3346 == arg0.field1418) {
                int var142 = var3.method8453();
                class85.method4570(var142);
                field542[++field686 - 1 & 0x1F] = var142 & 0x7FFF;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3313 == arg0.field1418) {
                int var143 = var3.method8416();
                int var144 = var3.method8416();
                int var145 = Statics.method3199();
                class308 var146 = class308.method2768(class306.field3129, field590.field1405);
                var146.field3243.method8466(var143);
                var146.field3243.method8465(var144);
                var146.field3243.method8441(var145);
                var146.field3243.method8393(field201);
                field590.method2719(var146);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3353 == arg0.field1418) {
                int var147 = var3.method8410();
                int var148 = var3.method8445();
                String var149 = var3.method8535();
                if (var147 >= 1 && var147 <= 8) {
                    if (var149.equalsIgnoreCase(class364.field4153)) {
                        var149 = null;
                    }
                    field621[var147 - 1] = var149;
                    field622[var147 - 1] = var148 == 0;
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3340 == arg0.field1418) {
                Statics.field52.method1823();
                field748 = field682;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3337 == arg0.field1418) {
                Statics.field678 = new class467(Statics.field1356);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3281 == arg0.field1418) {
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3322 == arg0.field1418) {
                int var150 = var3.method8410();
                int var151 = var3.method8410();
                int var152 = var3.method8410();
                int var153 = var3.method8410();
                field756[var150] = true;
                field757[var150] = var151;
                field705[var150] = var152;
                field759[var150] = var153;
                field729[var150] = 0;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3274 == arg0.field1418) {
                int var154 = var3.method8453();
                int var155 = var3.method8416();
                int var156 = var3.method8452();
                int var157 = var3.method8454();
                class344 var158 = Statics.field1878.method5636(var155);
                if (var158.field3651 != var154 || var158.field3713 != var156 || var158.field3742 != var157) {
                    var158.field3651 = var154;
                    var158.field3713 = var156;
                    var158.field3742 = var157;
                    method3158(var158);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3371 == arg0.field1418) {
                method2629(class307.field3229);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3344 == arg0.field1418) {
                int var159 = var3.method8416();
                if (field585 != var159) {
                    field585 = var159;
                    method3441();
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3312 == arg0.field1418) {
                Statics.field52.method1798(var3, arg0.field1411);
                field748 = field682;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3333 == arg0.field1418) {
                boolean var160 = var3.method8410() == 1;
                if (var160) {
                    Statics.field4906 = class313.method3460() - var3.method8417();
                    Statics.field16 = new class373(var3, true);
                } else {
                    Statics.field16 = null;
                }
                field783 = field682;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3249 == arg0.field1418) {
                int var161 = var3.method8412();
                if (var161 == 65535) {
                    var161 = -1;
                }
                field505 = var161;
                this.method1205(false);
                method2940(var161);
                class71.method2630(field505);
                for (int var162 = 0; var162 < 100; var162++) {
                    field709[var162] = true;
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3338 == arg0.field1418) {
                int var163 = var3.method8454();
                int var164 = var3.method8445();
                int var165 = var3.method8452();
                if (var165 == 65535) {
                    var165 = -1;
                }
                class101 var166 = field776[var163];
                if (var166 != null) {
                    if (var166.field1229 == var165 && var165 != -1) {
                        int var167 = class205.method2129(var165).field2231;
                        if (var167 == 1) {
                            var166.field1218 = 0;
                            var166.field1219 = 0;
                            var166.field1220 = var164;
                            var166.field1200 = 0;
                        } else if (var167 == 2) {
                            var166.field1200 = 0;
                        }
                    } else if (var165 == -1 || var166.field1229 == -1 || class205.method2129(var165).field2224 >= class205.method2129(var166.field1229).field2224) {
                        var166.field1229 = var165;
                        var166.field1218 = 0;
                        var166.field1219 = 0;
                        var166.field1220 = var164;
                        var166.field1200 = 0;
                        var166.field1221 = var166.field1242;
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3305 == arg0.field1418) {
                for (int var168 = 0; var168 < field651.length; var168++) {
                    if (field651[var168] != null) {
                        field651[var168].field1229 = -1;
                    }
                }
                for (int var169 = 0; var169 < field776.length; var169++) {
                    if (field776[var169] != null) {
                        field776[var169].field1229 = -1;
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3356 == arg0.field1418) {
                method2263(false, var3);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3348 == arg0.field1418) {
                method171();
                arg0.field1418 = null;
                return false;
            }
            if (class309.field3368 == arg0.field1418) {
                method6719();
                field665 = var3.method8508();
                field698 = field682;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3374 == arg0.field1418) {
                method2629(class307.field3232);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3319 == arg0.field1418) {
                field789 = true;
                field483 = false;
                field749 = false;
                Statics.field457 = var3.method8410();
                Statics.field2315 = var3.method8410();
                Statics.field1489 = var3.method8412();
                Statics.field2530 = var3.method8410();
                Statics.field3 = var3.method8410();
                if (Statics.field3 >= 100) {
                    Statics.field3016 = Statics.field457 * 128 + 64;
                    Statics.field234 = Statics.field2315 * 128 + 64;
                    Statics.field971 = method6196(Statics.field3016, Statics.field234, Statics.field2658) - Statics.field1489;
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3354 == arg0.field1418) {
                return this.method1473(arg0);
            }
            if (class309.field3373 == arg0.field1418) {
                field738 = var3.method8410();
                if (field738 == 255) {
                    field738 = 0;
                }
                field739 = var3.method8410();
                if (field739 == 255) {
                    field739 = 0;
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3325 == arg0.field1418) {
                var3.field5137 += 28;
                if (var3.method8439()) {
                    method5654(var3, var3.field5137 - 28);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3284 == arg0.field1418) {
                byte var170 = var3.method8616();
                long var171 = (long) var3.method8412();
                long var173 = (long) var3.method8414();
                long var175 = (var171 << 32) + var173;
                boolean var177 = false;
                class165 var178 = var170 >= 0 ? field732[var170] : Statics.field1024;
                if (var178 == null) {
                    var177 = true;
                } else {
                    for (int var179 = 0; var179 < 100; var179++) {
                        if (field576[var179] == var175) {
                            var177 = true;
                            break;
                        }
                    }
                }
                if (!var177) {
                    field576[field724] = var175;
                    field724 = (field724 + 1) % 100;
                    String var180 = class351.method2923(var3);
                    int var181 = var170 >= 0 ? 43 : 46;
                    class111.method2214(var181, "", var180, var178.field1770);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3298 == arg0.field1418) {
                int var182 = var3.method8454();
                int var183 = var3.method8452();
                int var184 = var3.method8453();
                int var185 = var3.method8452();
                int var186 = var3.method8454();
                if (var186 == 65535) {
                    var186 = -1;
                }
                ArrayList var187 = new ArrayList();
                var187.add(var186);
                method2993(var187, var183, var185, var184, var182);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3259 == arg0.field1418) {
                int var188 = var3.method8468();
                String var189 = var3.method8535();
                class344 var190 = Statics.field1878.method5636(var188);
                if (!var189.equals(var190.field3723)) {
                    var190.field3723 = var189;
                    method3158(var190);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3307 == arg0.field1418) {
                int var191 = var3.method8412();
                int var192 = var3.method8453();
                int var193 = var3.method8452();
                int var194 = var3.method8454();
                class317.method3443(var193, var191, var194, var192);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3364 == arg0.field1418) {
                Statics.field52.field816.method7339(var3, arg0.field1411);
                method7122();
                field748 = field682;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3301 == arg0.field1418) {
                method2629(class307.field3231);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3266 == arg0.field1418) {
                String var195 = var3.method8535();
                long var196 = var3.method8417();
                long var198 = (long) var3.method8412();
                long var200 = (long) var3.method8414();
                class366 var202 = (class366) class385.method164(class366.method5568(), var3.method8410());
                long var203 = (var198 << 32) + var200;
                boolean var205 = false;
                for (int var206 = 0; var206 < 100; var206++) {
                    if (field576[var206] == var203) {
                        var205 = true;
                        break;
                    }
                }
                if (var202.field4262 && Statics.field52.method1802(new class550(var195, Statics.field1079))) {
                    var205 = true;
                }
                if (!var205 && field737 == 0) {
                    field576[field724] = var203;
                    field724 = (field724 + 1) % 100;
                    String var207 = class410.method7025(class399.method297(class351.method2923(var3)));
                    if (var202.field4260 == -1) {
                        class111.method2214(9, var195, var207, class401.method3563(var196));
                    } else {
                        class111.method2214(9, class102.method3484(var202.field4260) + var195, var207, class401.method3563(var196));
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3316 == arg0.field1418) {
                String var208 = var3.method8535();
                Object[] var209 = new Object[var208.length() + 1];
                for (int var210 = var208.length() - 1; var210 >= 0; var210--) {
                    if (var208.charAt(var210) == 's') {
                        var209[var210 + 1] = var3.method8535();
                    } else {
                        var209[var210 + 1] = Integer.valueOf(var3.method8416());
                    }
                }
                var209[0] = Integer.valueOf(var3.method8416());
                class88 var211 = new class88();
                var211.field1058 = var209;
                class71.method3152(var211);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3297 == arg0.field1418) {
                int var212 = var3.method8410();
                method4137(var212);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3258 == arg0.field1418) {
                if (field505 != -1) {
                    method8289(field505, 0);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3257 == arg0.field1418 && field789) {
                field483 = true;
                field750 = false;
                field749 = false;
                for (int var213 = 0; var213 < 5; var213++) {
                    field756[var213] = false;
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3339 == arg0.field1418) {
                int var214 = var3.method8452();
                int var215 = var3.method8416();
                int var216 = var214 >> 10 & 0x1F;
                int var217 = var214 >> 5 & 0x1F;
                int var218 = var214 & 0x1F;
                int var219 = (var218 << 3) + (var216 << 19) + (var217 << 11);
                class344 var220 = Statics.field1878.method5636(var215);
                if (var220.field3811 != var219) {
                    var220.field3811 = var219;
                    method3158(var220);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3323 == arg0.field1418) {
                int var221 = var3.method8454();
                class101 var222 = field776[var221];
                int var223 = var3.method8454();
                int var224 = var3.method8468();
                int var225 = var3.method8646();
                if (var222 != null) {
                    var222.method2340(var225, var223, var224 >> 16, var224 & 0xFFFF);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3306 == arg0.field1418) {
                field589 = field682;
                byte var226 = var3.method8616();
                if (arg0.field1411 == 1) {
                    if (var226 >= 0) {
                        field732[var226] = null;
                    } else {
                        Statics.field1024 = null;
                    }
                    arg0.field1418 = null;
                    return true;
                }
                if (var226 >= 0) {
                    field732[var226] = new class165(var3);
                } else {
                    Statics.field1024 = new class165(var3);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3260 == arg0.field1418) {
                int var227 = var3.method8469();
                int var228 = var3.method8452();
                short var229 = (short) var3.method8508();
                int var230 = var3.method8646();
                class101 var231 = field776[var228];
                if (var231 != null) {
                    var231.method2536(var230, var227, var229);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3335 == arg0.field1418) {
                Statics.field86 = var3.method8445();
                Statics.field15 = var3.method8444();
                while (var3.field5137 < arg0.field1411) {
                    int var232 = var3.method8410();
                    class307 var233 = class307.method8341()[var232];
                    method2629(var233);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3294 == arg0.field1418) {
                field589 = field682;
                byte var234 = var3.method8616();
                class162 var235 = new class162(var3);
                class165 var236;
                if (var234 >= 0) {
                    var236 = field732[var234];
                } else {
                    var236 = Statics.field1024;
                }
                if (var236 == null) {
                    this.method1209(var234);
                    arg0.field1418 = null;
                    return true;
                }
                if (var235.field1753 > var236.field1773) {
                    this.method1209(var234);
                    arg0.field1418 = null;
                    return true;
                }
                if (var235.field1753 < var236.field1773) {
                    arg0.field1418 = null;
                    return true;
                }
                var235.method3164(var236);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3341 == arg0.field1418) {
                method2629(class307.field3226);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3295 == arg0.field1418) {
                method2629(class307.field3227);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3349 == arg0.field1418) {
                method6719();
                int var237 = var3.method8444();
                int var238 = var3.method8467();
                int var239 = var3.method8410();
                field631[var237] = var238;
                field629[var237] = var239;
                field630[var237] = 1;
                field541[var237] = var239;
                for (int var240 = 0; var240 < 98; var240++) {
                    if (var238 >= class354.field3871[var240]) {
                        field630[var237] = var240 + 2;
                    }
                }
                field687[++field688 - 1 & 0x1F] = var237;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3286 == arg0.field1418) {
                method2629(class307.field3230);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3315 == arg0.field1418) {
                method7113(var3.method8535());
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3362 == arg0.field1418) {
                int var241 = var3.method8467();
                boolean var242 = var3.method8410() == 1;
                class344 var243 = Statics.field1878.method5636(var241);
                if (var243.field3788 != var242) {
                    var243.field3788 = var242;
                    method3158(var243);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3261 == arg0.field1418) {
                method2629(class307.field3238);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3336 == arg0.field1418) {
                Statics.field86 = var3.method8646();
                Statics.field15 = var3.method8444();
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3264 == arg0.field1418) {
                for (int var244 = 0; var244 < Statics.field1816; var244++) {
                    class176 var245 = class176.method3722(var244);
                    if (var245 != null) {
                        class333.field3551[var244] = 0;
                        class333.field3554[var244] = 0;
                    }
                }
                method6719();
                field684 += 32;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3302 == arg0.field1418) {
                method2629(class307.field3234);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3287 == arg0.field1418) {
                int var246 = var3.method8416();
                int var247 = var3.method8412();
                if (var246 < -70000) {
                    var247 += 32768;
                }
                class344 var248;
                if (var246 >= 0) {
                    var248 = Statics.field1878.method5636(var246);
                } else {
                    var248 = null;
                }
                while (var3.field5137 < arg0.field1411) {
                    int var249 = var3.method8426();
                    int var250 = var3.method8412();
                    int var251 = 0;
                    if (var250 != 0) {
                        var251 = var3.method8410();
                        if (var251 == 255) {
                            var251 = var3.method8416();
                        }
                    }
                    if (var248 != null && var249 >= 0 && var249 < var248.field3791.length) {
                        var248.field3791[var249] = var250;
                        var248.field3792[var249] = var251;
                    }
                    class85.method3371(var247, var249, var250 - 1, var251);
                }
                if (var248 != null) {
                    method3158(var248);
                }
                method6719();
                field542[++field686 - 1 & 0x1F] = var247 & 0x7FFF;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3347 == arg0.field1418) {
                class68 var252 = new class68();
                var252.field805 = var3.method8535();
                var252.field802 = var3.method8412();
                int var253 = var3.method8416();
                var252.field810 = var253;
                if (var252.method1746()) {
                    var252.field809 = "beta";
                }
                method4139(45);
                var2.method7538();
                Object var254 = null;
                class76.method443(var252);
                arg0.field1418 = null;
                return false;
            }
            if (class309.field3254 == arg0.field1418) {
                int var255 = var3.method8469();
                int var256 = var3.method8468();
                class87 var257 = (class87) field659.method8154((long) var256);
                class87 var258 = (class87) field659.method8154((long) var255);
                if (var258 != null) {
                    method5307(var258, var257 == null || var257.field1052 != var258.field1052);
                }
                if (var257 != null) {
                    var257.method7828();
                    field659.method8156(var257, (long) var255);
                }
                class344 var259 = Statics.field1878.method5636(var256);
                if (var259 != null) {
                    method3158(var259);
                }
                class344 var260 = Statics.field1878.method5636(var255);
                if (var260 != null) {
                    method3158(var260);
                    method2981(Statics.field1878.field3569[var260.field3659 >>> 16], var260, true);
                }
                if (field505 != -1) {
                    method8289(field505, 1);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3262 == arg0.field1418) {
                field789 = true;
                field483 = false;
                field749 = true;
                Statics.field457 = var3.method8410();
                Statics.field2315 = var3.method8410();
                int var261 = var3.method8412();
                int var262 = var3.method8412();
                field662 = var3.method8572();
                int var263 = var3.method8410();
                int var264 = Statics.field457 * 128 + 64;
                int var265 = Statics.field2315 * 128 + 64;
                boolean var266 = false;
                boolean var267 = false;
                int var268;
                int var269;
                if (field662) {
                    var268 = Statics.field971;
                    var269 = method6196(var264, var265, Statics.field2658) - var261;
                } else {
                    var268 = method6196(Statics.field3016, Statics.field234, Statics.field2658) - Statics.field971;
                    var269 = var261;
                }
                field752 = new class490(Statics.field3016, Statics.field234, var268, var264, var265, var269, var262, var263);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3288 == arg0.field1418) {
                int var270 = var3.method8452();
                int var271 = var3.method8454();
                int var272 = var3.method8454();
                if (var272 == 65535) {
                    var272 = -1;
                }
                int var273 = var3.method8452();
                int var274 = var3.method8452();
                int var275 = var3.method8452();
                if (var275 == 65535) {
                    var275 = -1;
                }
                ArrayList var276 = new ArrayList();
                var276.add(var272);
                var276.add(var275);
                method2993(var276, var274, var273, var271, var270);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3330 == arg0.field1418) {
                method6468(true, arg0.field1409, false);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3352 == arg0.field1418) {
                int var277 = var3.method8463();
                int var278 = var3.method8445() * 4;
                int var279 = var3.method8454();
                int var280 = var3.method8568();
                int var281 = var280 >> 16;
                int var282 = var280 >> 8 & 0xFF;
                int var283 = (var280 >> 4 & 0x7) + var281;
                int var284 = (var280 & 0x7) + var282;
                int var285 = var3.method8452();
                byte var286 = var3.method8616();
                int var287 = var3.method8444();
                int var288 = var3.method8453();
                int var289 = var3.method8646();
                byte var290 = var3.method8446();
                int var291 = var3.method8410() * 4;
                int var292 = var283 + var286;
                int var293 = var284 + var290;
                if (var283 >= 0 && var284 >= 0 && var283 < 104 && var284 < 104 && var292 >= 0 && var293 >= 0 && var292 < 104 && var293 < 104 && var279 != 65535) {
                    int var294 = var283 * 128 + 64;
                    int var295 = var284 * 128 + 64;
                    int var296 = var292 * 128 + 64;
                    int var297 = var293 * 128 + 64;
                    class77 var298 = new class77(var279, Statics.field2658, var294, var295, method6196(var294, var295, Statics.field2658) - var291, field500 + var285, field500 + var288, var289, var287, var277, var278);
                    var298.method2097(var296, var297, method6196(var296, var297, Statics.field2658) - var278, field500 + var285);
                    field627.method6547(var298);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3366 == arg0.field1418) {
                method6468(false, arg0.field1409, false);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3342 == arg0.field1418) {
                method6468(false, arg0.field1409, true);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3324 == arg0.field1418) {
                int var299 = var3.method8454();
                int var300 = var3.method8452();
                class317.method4392(var300, var299);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3265 == arg0.field1418) {
                int var301 = var3.method8455();
                int var302 = var3.method8457();
                int var303 = var3.method8468();
                class344 var304 = Statics.field1878.method5636(var303);
                if (var304.field3803 != var302 || var304.field3670 != var301 || var304.field3665 != 0 || var304.field3666 != 0) {
                    var304.field3803 = var302;
                    var304.field3670 = var301;
                    var304.field3665 = 0;
                    var304.field3666 = 0;
                    method3158(var304);
                    this.method1434(var304);
                    if (var304.field3714 == 0) {
                        method2981(Statics.field1878.field3569[var303 >> 16], var304, false);
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3328 == arg0.field1418) {
                int var305 = var3.method8412();
                if (var305 == 65535) {
                    var305 = -1;
                }
                Statics.method2609(var305);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3285 == arg0.field1418) {
                int var306 = var3.method8460();
                int var307 = var3.method8453();
                if (var307 == 65535) {
                    var307 = -1;
                }
                method3905(var307, var306);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3304 == arg0.field1418) {
                field789 = true;
                field483 = false;
                field750 = true;
                int var308 = var3.method8508();
                int var309 = var3.method8508();
                int var310 = method4420(Statics.field1390 + var309 & 0x7EB);
                int var311 = Statics.field1982 + var308;
                int var312 = var3.method8412();
                int var313 = var3.method8410();
                field673 = new class491(Statics.field1390, var310, var312, var313);
                field753 = new class491(Statics.field1982, var311, var312, var313);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3317 == arg0.field1418) {
                int var314 = var3.method8452();
                int var315 = var3.method8452();
                int var316 = var3.method8468();
                class344 var317 = Statics.field1878.method5636(var316);
                var317.field3717 = (var314 << 16) + var315;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3327 == arg0.field1418) {
                Statics.field86 = var3.method8646();
                Statics.field15 = var3.method8646();
                for (int var318 = Statics.field86; var318 < Statics.field86 + 8; var318++) {
                    for (int var319 = Statics.field15; var319 < Statics.field15 + 8; var319++) {
                        if (field697[Statics.field2658][var318][var319] != null) {
                            field697[Statics.field2658][var318][var319] = null;
                            method3147(var318, var319);
                        }
                    }
                }
                for (class95 var320 = (class95) field626.method6579(); var320 != null; var320 = (class95) field626.method6549()) {
                    if (var320.field1155 >= Statics.field86 && var320.field1155 < Statics.field86 + 8 && var320.field1156 >= Statics.field15 && var320.field1156 < Statics.field15 + 8 && Statics.field2658 == var320.field1165) {
                        var320.field1166 = 0;
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3318 == arg0.field1418) {
                field789 = true;
                field483 = false;
                field750 = true;
                Statics.field1401 = var3.method8410();
                Statics.field2576 = var3.method8410();
                Statics.field3120 = var3.method8412();
                int var321 = var3.method8412();
                int var322 = var3.method8410();
                int var323 = Statics.field1401 * 128 + 64;
                int var324 = Statics.field2576 * 128 + 64;
                int var325 = method6196(var323, var324, Statics.field2658) - Statics.field3120;
                int var326 = var323 - Statics.field3016;
                int var327 = var325 - Statics.field971;
                int var328 = var324 - Statics.field234;
                double var329 = Math.sqrt((double) (var326 * var326 + var328 * var328));
                int var331 = method4420((int) (Math.atan2((double) var327, var329) * 325.9490051269531D) & 0x7FF);
                int var332 = method5565((int) (Math.atan2((double) var326, (double) var328) * -325.9490051269531D) & 0x7FF);
                field673 = new class491(Statics.field1390, var331, var321, var322);
                field753 = new class491(Statics.field1982, var332, var321, var322);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3350 == arg0.field1418) {
                int var333 = var3.method8467();
                boolean var334 = var3.method8445() == 1;
                class344 var335 = Statics.field1878.method5636(var333);
                class344.method284(var335, Statics.field2420.field1100, var334);
                method3158(var335);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3331 == arg0.field1418) {
                int var336 = var3.method8410();
                int var337 = var3.method8416();
                class344 var338 = Statics.field1878.method5636(var337);
                class344.method5306(var338, Statics.field2420.field1100.field3601, var336);
                method3158(var338);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3282 == arg0.field1418) {
                int var339 = var3.method8426();
                boolean var340 = var3.method8410() == 1;
                String var341 = "";
                boolean var342 = false;
                if (var340) {
                    var341 = var3.method8535();
                    if (Statics.field52.method1802(new class550(var341, Statics.field1079))) {
                        var342 = true;
                    }
                }
                String var343 = var3.method8535();
                if (!var342) {
                    class111.method6477(var339, var341, var343);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3351 == arg0.field1418) {
                int var344 = var3.method8454();
                int var345 = var3.method8646();
                int var346 = var3.method8414();
                int var347 = var346 >> 16;
                int var348 = var346 >> 8 & 0xFF;
                int var349 = (var346 >> 4 & 0x7) + var347;
                int var350 = (var346 & 0x7) + var348;
                int var351 = var3.method8452();
                if (var349 >= 0 && var350 >= 0 && var349 < 104 && var350 < 104) {
                    int var352 = var349 * 128 + 64;
                    int var353 = var350 * 128 + 64;
                    class72 var354 = new class72(var344, Statics.field2658, var352, var353, method6196(var352, var353, Statics.field2658) - var345, var351, field500);
                    field628.method6547(var354);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3269 == arg0.field1418) {
                int var355 = var3.method8469();
                int var356 = var3.method8467();
                class344 var357 = Statics.field1878.method5636(var356);
                class344.method4444(var357, var355);
                method3158(var357);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3363 == arg0.field1418) {
                int var358 = var3.method8469();
                int var359 = var3.method8453();
                if (var359 == 65535) {
                    var359 = -1;
                }
                int var360 = var3.method8467();
                class344 var361 = Statics.field1878.method5636(var360);
                if (var361.field3749) {
                    var361.field3793 = var359;
                    var361.field3794 = var358;
                    class203 var363 = class203.method3907(var359).method3642(var358);
                    var361.field3651 = var363.field2179;
                    var361.field3713 = var363.field2129;
                    var361.field3739 = var363.field2147;
                    var361.field3719 = var363.field2145;
                    var361.field3711 = var363.field2149;
                    var361.field3742 = var363.field2144;
                    if (var363.field2151 == 1) {
                        var361.field3721 = 1;
                    } else {
                        var361.field3721 = 2;
                    }
                    if (var361.field3685 > 0) {
                        var361.field3742 = var361.field3742 * 32 / var361.field3685;
                    } else if (var361.field3671 > 0) {
                        var361.field3742 = var361.field3742 * 32 / var361.field3671;
                    }
                    method3158(var361);
                } else if (var359 == -1) {
                    var361.field3712 = 0;
                    arg0.field1418 = null;
                    return true;
                } else {
                    class203 var362 = class203.method3907(var359).method3642(var358);
                    var361.field3712 = 4;
                    var361.field3689 = var359;
                    var361.field3651 = var362.field2179;
                    var361.field3713 = var362.field2129;
                    var361.field3742 = var362.field2144 * 100 / var358;
                    method3158(var361);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3310 == arg0.field1418) {
                field483 = false;
                field789 = false;
                field749 = false;
                field750 = false;
                Statics.field1401 = 0;
                Statics.field2576 = 0;
                Statics.field3120 = 0;
                field662 = false;
                Statics.field422 = 0;
                Statics.field1582 = 0;
                Statics.field3 = 0;
                Statics.field2530 = 0;
                Statics.field457 = 0;
                Statics.field2315 = 0;
                Statics.field1489 = 0;
                field752 = null;
                field673 = null;
                field753 = null;
                for (int var364 = 0; var364 < 5; var364++) {
                    field756[var364] = false;
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3361 == arg0.field1418) {
                byte[] var365 = new byte[arg0.field1411];
                var3.method8358(var365, 0, var365.length);
                class527 var366 = new class527(var365);
                String var367 = var366.method8535();
                class32.method2529(var367, true, false);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3250 == arg0.field1418) {
                field789 = true;
                field483 = false;
                field750 = false;
                Statics.field1401 = var3.method8410();
                Statics.field2576 = var3.method8410();
                Statics.field3120 = var3.method8412();
                Statics.field422 = var3.method8410();
                Statics.field1582 = var3.method8410();
                if (Statics.field1582 >= 100) {
                    int var368 = Statics.field1401 * 128 + 64;
                    int var369 = Statics.field2576 * 128 + 64;
                    int var370 = method6196(var368, var369, Statics.field2658) - Statics.field3120;
                    int var371 = var368 - Statics.field3016;
                    int var372 = var370 - Statics.field971;
                    int var373 = var369 - Statics.field234;
                    int var374 = (int) Math.sqrt((double) (var371 * var371 + var373 * var373));
                    Statics.field1390 = (int) (Math.atan2((double) var372, (double) var374) * 325.9490051269531D) & 0x7FF;
                    Statics.field1982 = (int) (Math.atan2((double) var371, (double) var373) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1390 < 128) {
                        Statics.field1390 = 128;
                    }
                    if (Statics.field1390 > 383) {
                        Statics.field1390 = 383;
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3277 == arg0.field1418) {
                method6719();
                int var375 = var3.method8445();
                int var376 = var3.method8468();
                int var377 = var3.method8410();
                int var378 = var3.method8444();
                field631[var377] = var376;
                field629[var377] = var378;
                field630[var377] = 1;
                field541[var377] = var375;
                for (int var379 = 0; var379 < 98; var379++) {
                    if (var376 >= class354.field3871[var379]) {
                        field630[var377] = var379 + 2;
                    }
                }
                field687[++field688 - 1 & 0x1F] = var377;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3253 == arg0.field1418) {
                int var380 = var3.method8412();
                int var381 = var3.method8416();
                class333.field3551[var380] = var381;
                if (class333.field3554[var380] != var381) {
                    class333.field3554[var380] = var381;
                }
                Statics.method2100(var380);
                field713[++field684 - 1 & 0x1F] = var380;
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3289 == arg0.field1418) {
                method2629(class307.field3233);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3300 == arg0.field1418) {
                byte var382 = var3.method8616();
                String var383 = var3.method8535();
                long var384 = (long) var3.method8412();
                long var386 = (long) var3.method8414();
                class366 var388 = (class366) class385.method164(class366.method5568(), var3.method8410());
                long var389 = (var384 << 32) + var386;
                boolean var391 = false;
                Object var392 = null;
                class165 var393 = var382 >= 0 ? field732[var382] : Statics.field1024;
                if (var393 == null) {
                    var391 = true;
                } else {
                    int var394 = 0;
                    while (true) {
                        if (var394 >= 100) {
                            if (var388.field4262 && Statics.field52.method1802(new class550(var383, Statics.field1079))) {
                                var391 = true;
                            }
                            break;
                        }
                        if (field576[var394] == var389) {
                            var391 = true;
                            break;
                        }
                        var394++;
                    }
                }
                if (!var391) {
                    field576[field724] = var389;
                    field724 = (field724 + 1) % 100;
                    String var395 = class410.method7025(class351.method2923(var3));
                    int var396 = var382 >= 0 ? 41 : 44;
                    if (var388.field4260 == -1) {
                        class111.method2214(var396, var383, var395, var393.field1770);
                    } else {
                        class111.method2214(var396, class102.method3484(var388.field4260) + var383, var395, var393.field1770);
                    }
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3360 == arg0.field1418) {
                int var397 = var3.method8469();
                int var398 = var3.method8452();
                if (var398 == 65535) {
                    var398 = -1;
                }
                int var399 = var3.method8468();
                int var400 = var3.method8412();
                if (var400 == 65535) {
                    var400 = -1;
                }
                for (int var401 = var400; var401 <= var398; var401++) {
                    long var402 = ((long) var399 << 32) + (long) var401;
                    class485 var404 = field706.method8154(var402);
                    if (var404 != null) {
                        var404.method7828();
                    }
                    field706.method8156(new class484(var397), var402);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3270 == arg0.field1418) {
                int var405 = var3.method8454();
                int var406 = var3.method8445();
                if (var405 == 65535) {
                    var405 = -1;
                }
                method4116(Statics.field2420, var405, var406);
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3357 == arg0.field1418) {
                int var407 = var3.method8468();
                int var408 = var3.method8452();
                class344 var409 = Statics.field1878.method5636(var407);
                if (var409.field3712 != 2 || var409.field3689 != var408) {
                    var409.field3712 = 2;
                    var409.field3689 = var408;
                    method3158(var409);
                }
                arg0.field1418 = null;
                return true;
            }
            if (class309.field3311 == arg0.field1418) {
                int var410 = var3.method8410();
                method2735(var410);
                arg0.field1418 = null;
                return false;
            }
            class553.method6436("" + (arg0.field1418 == null ? -1 : arg0.field1418.field3376) + class102.field1324 + (arg0.field1410 == null ? -1 : arg0.field1410.field3376) + class102.field1324 + (arg0.field1417 == null ? -1 : arg0.field1417.field3376) + class102.field1324 + arg0.field1411, (Throwable) null);
            method171();
        } catch (IOException var415) {
            method79();
        } catch (Exception var416) {
            String var413 = "" + (arg0.field1418 == null ? -1 : arg0.field1418.field3376) + class102.field1324 + (arg0.field1410 == null ? -1 : arg0.field1410.field3376) + class102.field1324 + (arg0.field1417 == null ? -1 : arg0.field1417.field3376) + class102.field1324 + arg0.field1411 + class102.field1324 + (Statics.field1917 + Statics.field2420.field1243[0]) + class102.field1324 + (Statics.field1322 + Statics.field2420.field1244[0]) + class102.field1324;
            for (int var414 = 0; var414 < arg0.field1411 && var414 < 50; var414++) {
                var413 = var413 + var3.field5140[var414] + class102.field1324;
            }
            class553.method6436(var413, var416);
            method171();
        }
        return true;
    }

    @ObfuscatedName("ex.kj(Lly;B)V")
    public static final void method2629(class307 arg0) {
        class526 var1 = field590.field1409;
        if (class307.field3234 == arg0) {
            int var2 = var1.method8452();
            int var3 = var1.method8444();
            int var4 = (var3 >> 4 & 0x7) + Statics.field86;
            int var5 = (var3 & 0x7) + Statics.field15;
            int var6 = var1.method8444();
            int var7 = var1.method8444();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field564[var8];
            if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                method2623(Statics.field2658, var4, var5, var10, var2, var8, var9, var6, 0, -1);
            }
        } else if (class307.field3232 == arg0) {
            int var11 = var1.method8410();
            int var12 = (var11 >> 4 & 0x7) + Statics.field86;
            int var13 = (var11 & 0x7) + Statics.field15;
            int var14 = var1.method8646();
            int var15 = var1.method8454();
            var1.method8453();
            var1.method8445();
            int var16 = var1.method8416();
            var1.method8444();
            var1.method8453();
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class105 var17 = new class105();
                var17.field1344 = var15;
                var17.field1342 = var16;
                var17.method2615(var14);
                if (field697[Statics.field2658][var12][var13] == null) {
                    field697[Statics.field2658][var12][var13] = new class390();
                }
                field697[Statics.field2658][var12][var13].method6547(var17);
                method3147(var12, var13);
            }
        } else {
            if (class307.field3227 == arg0) {
                int var18 = var1.method8410();
                int var19 = var18 >> 4 & 0xF;
                int var20 = var18 & 0x7;
                int var21 = var1.method8444();
                int var22 = var1.method8453();
                int var23 = var1.method8444();
                int var24 = (var23 >> 4 & 0x7) + Statics.field86;
                int var25 = (var23 & 0x7) + Statics.field15;
                if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                    int var26 = var19 + 1;
                    if (Statics.field2420.field1243[0] >= var24 - var26 && Statics.field2420.field1243[0] <= var24 + var26 && Statics.field2420.field1244[0] >= var25 - var26 && Statics.field2420.field1244[0] <= var25 + var26 && Statics.field2450.method2477() != 0 && var20 > 0 && field754 < 50) {
                        field743[field754] = var22;
                        field744[field754] = var20;
                        field745[field754] = var21;
                        field603[field754] = null;
                        field746[field754] = (var24 << 16) + (var25 << 8) + var19;
                        field754++;
                    }
                }
            }
            if (class307.field3237 == arg0) {
                int var27 = var1.method8452();
                int var28 = var1.method8467();
                int var29 = var1.method8444();
                int var30 = (var29 >> 4 & 0x7) + Statics.field86;
                int var31 = (var29 & 0x7) + Statics.field15;
                int var32 = var1.method8416();
                if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                    class390 var33 = field697[Statics.field2658][var30][var31];
                    if (var33 != null) {
                        for (class105 var34 = (class105) var33.method6579(); var34 != null; var34 = (class105) var33.method6549()) {
                            if ((var27 & 0x7FFF) == var34.field1344 && var34.field1342 == var28) {
                                var34.field1342 = var32;
                                break;
                            }
                        }
                        method3147(var30, var31);
                    }
                }
            } else if (class307.field3236 == arg0) {
                int var35 = var1.method8445();
                byte var36 = var1.method8446();
                int var37 = var1.method8453();
                int var38 = var1.method8444();
                int var39 = var1.method8444() * 4;
                int var40 = var1.method8410();
                int var41 = (var40 >> 4 & 0x7) + Statics.field86;
                int var42 = (var40 & 0x7) + Statics.field15;
                int var43 = var1.method8452();
                int var44 = var1.method8639();
                int var45 = var1.method8399();
                byte var46 = var1.method8447();
                int var47 = var1.method8444() * 4;
                int var48 = var1.method8452();
                int var49 = var41 + var46;
                int var50 = var36 + var42;
                if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104 && var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104 && var43 != 65535) {
                    int var51 = var41 * 128 + 64;
                    int var52 = var42 * 128 + 64;
                    int var53 = var49 * 128 + 64;
                    int var54 = var50 * 128 + 64;
                    class77 var55 = new class77(var43, Statics.field2658, var51, var52, method6196(var51, var52, Statics.field2658) - var47, field500 + var48, field500 + var37, var35, var38, var44, var45, var39);
                    var55.method2097(var53, var54, method6196(var53, var54, Statics.field2658) - var39, field500 + var48);
                    field627.method6547(var55);
                }
            } else if (class307.field3233 == arg0) {
                int var56 = var1.method8646();
                int var57 = (var56 >> 4 & 0x7) + Statics.field86;
                int var58 = (var56 & 0x7) + Statics.field15;
                int var59 = var1.method8452();
                int var60 = var1.method8646();
                if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                    class390 var61 = field697[Statics.field2658][var57][var58];
                    if (var61 != null) {
                        for (class105 var62 = (class105) var61.method6579(); var62 != null; var62 = (class105) var61.method6549()) {
                            if ((var59 & 0x7FFF) == var62.field1344) {
                                var62.method2615(var60);
                                break;
                            }
                        }
                    }
                }
            } else {
                if (class307.field3228 == arg0) {
                    byte var63 = var1.method8446();
                    byte var64 = var1.method8446();
                    byte var65 = var1.method8447();
                    int var66 = var1.method8454();
                    byte var67 = var1.method8616();
                    int var68 = var1.method8445();
                    int var69 = (var68 >> 4 & 0x7) + Statics.field86;
                    int var70 = (var68 & 0x7) + Statics.field15;
                    int var71 = var1.method8453();
                    int var72 = var1.method8454();
                    int var73 = var1.method8646();
                    int var74 = var73 >> 2;
                    int var75 = var73 & 0x3;
                    int var76 = field564[var74];
                    int var77 = var1.method8454();
                    class92 var78;
                    if (field790 == var77) {
                        var78 = Statics.field2420;
                    } else {
                        var78 = field651[var77];
                    }
                    if (var78 != null) {
                        class202 var79 = Statics.method4138(var71);
                        int var80;
                        int var81;
                        if (var75 == 1 || var75 == 3) {
                            var80 = var79.field2100;
                            var81 = var79.field2091;
                        } else {
                            var80 = var79.field2091;
                            var81 = var79.field2100;
                        }
                        int var82 = (var80 >> 1) + var69;
                        int var83 = (var80 + 1 >> 1) + var69;
                        int var84 = (var81 >> 1) + var70;
                        int var85 = (var81 + 1 >> 1) + var70;
                        int[][] var86 = class82.field1014[Statics.field2658];
                        int var87 = var86[var82][var84] + var86[var83][var84] + var86[var82][var85] + var86[var83][var85] >> 2;
                        int var88 = (var69 << 7) + (var80 << 6);
                        int var89 = (var70 << 7) + (var81 << 6);
                        class280 var90 = var79.method3580(var74, var75, var86, var88, var87, var89);
                        if (var90 != null) {
                            method2623(Statics.field2658, var69, var70, var76, -1, 0, 0, 31, var72 + 1, var66 + 1);
                            var78.field1105 = field500 + var72;
                            var78.field1106 = field500 + var66;
                            var78.field1110 = var90;
                            var78.field1107 = var69 * 128 + var80 * 64;
                            var78.field1109 = var70 * 128 + var81 * 64;
                            var78.field1119 = var87;
                            if (var65 > var63) {
                                byte var91 = var65;
                                var65 = var63;
                                var63 = var91;
                            }
                            if (var67 > var64) {
                                byte var92 = var67;
                                var67 = var64;
                                var64 = var92;
                            }
                            var78.field1120 = var65 + var69;
                            var78.field1113 = var63 + var69;
                            var78.field1112 = var67 + var70;
                            var78.field1114 = var64 + var70;
                        }
                    }
                }
                if (class307.field3238 == arg0) {
                    int var93 = var1.method8646();
                    int var94 = (var93 >> 4 & 0x7) + Statics.field86;
                    int var95 = (var93 & 0x7) + Statics.field15;
                    int var96 = var1.method8646();
                    int var97 = var96 >> 2;
                    int var98 = var96 & 0x3;
                    int var99 = field564[var97];
                    if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104) {
                        method2623(Statics.field2658, var94, var95, var99, -1, var97, var98, 31, 0, -1);
                    }
                } else if (class307.field3229 == arg0) {
                    int var100 = var1.method8452();
                    int var101 = var1.method8410();
                    int var102 = (var101 >> 4 & 0x7) + Statics.field86;
                    int var103 = (var101 & 0x7) + Statics.field15;
                    int var104 = var1.method8412();
                    int var105 = var1.method8646() * 4;
                    byte var106 = var1.method8448();
                    int var107 = var1.method8445();
                    int var108 = var1.method8445() * 4;
                    int var109 = var1.method8454();
                    int var110 = var1.method8639();
                    int var111 = var1.method8452();
                    int var112 = var1.method8401();
                    byte var113 = var1.method8446();
                    int var114 = var102 + var113;
                    int var115 = var103 + var106;
                    if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104 && var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104 && var109 != 65535) {
                        int var116 = var102 * 128 + 64;
                        int var117 = var103 * 128 + 64;
                        int var118 = var114 * 128 + 64;
                        int var119 = var115 * 128 + 64;
                        class77 var120 = new class77(var109, Statics.field2658, var116, var117, method6196(var116, var117, Statics.field2658) - var105, field500 + var111, field500 + var100, var107, var104, var110, var112, var108);
                        var120.method2097(var118, var119, method6196(var118, var119, Statics.field2658) - var108, field500 + var111);
                        field627.method6547(var120);
                    }
                } else if (class307.field3226 == arg0) {
                    int var121 = var1.method8639();
                    int var122 = var1.method8454();
                    int var123 = var1.method8410();
                    int var124 = var1.method8646();
                    int var125 = (var124 >> 4 & 0x7) + Statics.field86;
                    int var126 = (var124 & 0x7) + Statics.field15;
                    int var127 = var1.method8410() * 4;
                    int var128 = var1.method8412();
                    int var129 = var1.method8452();
                    byte var130 = var1.method8446();
                    byte var131 = var1.method8447();
                    int var132 = var1.method8444();
                    int var133 = var1.method8646() * 4;
                    int var134 = var125 + var130;
                    int var135 = var126 + var131;
                    if (var125 >= 0 && var126 >= 0 && var125 < 104 && var126 < 104 && var134 >= 0 && var135 >= 0 && var134 < 104 && var135 < 104 && var129 != 65535) {
                        int var136 = var125 * 128 + 64;
                        int var137 = var126 * 128 + 64;
                        int var138 = var134 * 128 + 64;
                        int var139 = var135 * 128 + 64;
                        class77 var140 = new class77(var129, Statics.field2658, var136, var137, method6196(var136, var137, Statics.field2658) - var127, field500 + var128, field500 + var122, var132, var123, var121, var133);
                        var140.method2097(var138, var139, method6196(var138, var139, Statics.field2658) - var133, field500 + var128);
                        field627.method6547(var140);
                    }
                } else if (class307.field3231 == arg0) {
                    int var141 = var1.method8410();
                    int var142 = var141 >> 2;
                    int var143 = var141 & 0x3;
                    int var144 = field564[var142];
                    int var145 = var1.method8453();
                    int var146 = var1.method8444();
                    int var147 = (var146 >> 4 & 0x7) + Statics.field86;
                    int var148 = (var146 & 0x7) + Statics.field15;
                    if (var147 >= 0 && var148 >= 0 && var147 < 103 && var148 < 103) {
                        if (var144 == 0) {
                            class288 var149 = Statics.field231.method4817(Statics.field2658, var147, var148);
                            if (var149 != null) {
                                int var150 = Statics.method4107(var149.field3068);
                                if (var142 == 2) {
                                    var149.field3066 = new class80(var150, 2, var143 + 4, Statics.field2658, var147, var148, var145, false, var149.field3066);
                                    var149.field3067 = new class80(var150, 2, var143 + 1 & 0x3, Statics.field2658, var147, var148, var145, false, var149.field3067);
                                } else {
                                    var149.field3066 = new class80(var150, var142, var143, Statics.field2658, var147, var148, var145, false, var149.field3066);
                                }
                                return;
                            }
                        }
                        if (var144 == 1) {
                            class290 var151 = Statics.field231.method4818(Statics.field2658, var147, var148);
                            if (var151 != null) {
                                int var152 = Statics.method4107(var151.field3076);
                                if (var142 == 4 || var142 == 5) {
                                    var151.field3080 = new class80(var152, 4, var143, Statics.field2658, var147, var148, var145, false, var151.field3080);
                                } else if (var142 == 6) {
                                    var151.field3080 = new class80(var152, 4, var143 + 4, Statics.field2658, var147, var148, var145, false, var151.field3080);
                                } else if (var142 == 7) {
                                    var151.field3080 = new class80(var152, 4, (var143 + 2 & 0x3) + 4, Statics.field2658, var147, var148, var145, false, var151.field3080);
                                } else if (var142 == 8) {
                                    var151.field3080 = new class80(var152, 4, var143 + 4, Statics.field2658, var147, var148, var145, false, var151.field3080);
                                    var151.field3077 = new class80(var152, 4, (var143 + 2 & 0x3) + 4, Statics.field2658, var147, var148, var145, false, var151.field3077);
                                }
                                return;
                            }
                        }
                        if (var144 == 2) {
                            class291 var153 = Statics.field231.method4819(Statics.field2658, var147, var148);
                            if (var142 == 11) {
                                var142 = 10;
                            }
                            if (var153 != null) {
                                var153.field3086 = new class80(Statics.method4107(var153.field3096), var142, var143, Statics.field2658, var147, var148, var145, false, var153.field3086);
                                return;
                            }
                        }
                        if (var144 == 3) {
                            class263 var154 = Statics.field231.method4929(Statics.field2658, var147, var148);
                            if (var154 != null) {
                                var154.field2711 = new class80(Statics.method4107(var154.field2712), 22, var143, Statics.field2658, var147, var148, var145, false, var154.field2711);
                                return;
                            }
                        }
                        method3886(Statics.field2658, var147, var148, var144, var145);
                    }
                } else if (class307.field3235 == arg0) {
                    int var155 = var1.method8412();
                    int var156 = var1.method8444();
                    int var157 = var1.method8453();
                    int var158 = var1.method8444();
                    int var159 = (var158 >> 4 & 0x7) + Statics.field86;
                    int var160 = (var158 & 0x7) + Statics.field15;
                    if (var159 >= 0 && var160 >= 0 && var159 < 104 && var160 < 104) {
                        int var161 = var159 * 128 + 64;
                        int var162 = var160 * 128 + 64;
                        class72 var163 = new class72(var157, Statics.field2658, var161, var162, method6196(var161, var162, Statics.field2658) - var156, var155, field500);
                        field628.method6547(var163);
                    }
                } else if (class307.field3230 == arg0) {
                    int var164 = var1.method8468();
                    int var165 = var1.method8410();
                    int var166 = (var165 >> 4 & 0x7) + Statics.field86;
                    int var167 = (var165 & 0x7) + Statics.field15;
                    int var168 = var1.method8452();
                    if (var166 >= 0 && var167 >= 0 && var166 < 104 && var167 < 104) {
                        class390 var169 = field697[Statics.field2658][var166][var167];
                        if (var169 != null) {
                            for (class105 var170 = (class105) var169.method6579(); var170 != null; var170 = (class105) var169.method6549()) {
                                if ((var168 & 0x7FFF) == var170.field1344 && var170.field1342 == var164) {
                                    var170.method7828();
                                    break;
                                }
                            }
                            if (var169.method6579() == null) {
                                field697[Statics.field2658][var166][var167] = null;
                            }
                            method3147(var166, var167);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ec.kq(IIIIIIIIIII)V")
    public static final void method2623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class95 var10 = null;
        for (class95 var11 = (class95) field626.method6579(); var11 != null; var11 = (class95) field626.method6549()) {
            if (var11.field1165 == arg0 && var11.field1155 == arg1 && var11.field1156 == arg2 && var11.field1154 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class95();
            var10.field1165 = arg0;
            var10.field1154 = arg3;
            var10.field1155 = arg1;
            var10.field1156 = arg2;
            var10.field1153 = -1;
            method1131(var10);
            field626.method6547(var10);
        }
        var10.field1163 = arg4;
        var10.field1162 = arg5;
        var10.field1161 = arg6;
        var10.field1164 = arg8;
        var10.field1166 = arg9;
        var10.method2328(arg7);
    }

    @ObfuscatedName("ih.km(IIIIII)Z")
    public static final boolean method3886(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class95 var5 = null;
        for (class95 var6 = (class95) field626.method6579(); var6 != null; var6 = (class95) field626.method6549()) {
            if (var6.field1165 == arg0 && var6.field1155 == arg1 && var6.field1156 == arg2 && var6.field1154 == arg3) {
                var5 = var6;
                break;
            }
        }
        if (var5 == null) {
            return false;
        } else {
            var5.field1153 = arg4;
            return true;
        }
    }

    @ObfuscatedName("cs.kr(Ldp;I)V")
    public static final void method1131(class95 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1154 == 0) {
            var1 = Statics.field231.method4821(arg0.field1165, arg0.field1155, arg0.field1156);
        }
        if (arg0.field1154 == 1) {
            var1 = Statics.field231.method4822(arg0.field1165, arg0.field1155, arg0.field1156);
        }
        if (arg0.field1154 == 2) {
            var1 = Statics.field231.method4813(arg0.field1165, arg0.field1155, arg0.field1156);
        }
        if (arg0.field1154 == 3) {
            var1 = Statics.field231.method4824(arg0.field1165, arg0.field1155, arg0.field1156);
        }
        if (var1 != 0L) {
            int var6 = Statics.field231.method4825(arg0.field1165, arg0.field1155, arg0.field1156, var1);
            var3 = Statics.method4107(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1157 = var3;
        arg0.field1159 = var4;
        arg0.field1158 = var5;
    }

    @ObfuscatedName("jx.kv(IIIIIIIIB)V")
    public static final void method4516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field488 && Statics.field2658 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field231.method4821(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field231.method4822(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field231.method4813(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field231.method4824(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field231.method4825(arg0, arg2, arg3, var8);
            int var14 = Statics.method4107(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            class202 var17 = Statics.method4138(var14);
            if (var17 != null && var17.method3586()) {
                int var20 = var17.field2091;
                int var21 = var17.field2100;
                if (var16 == 1 || var16 == 3) {
                    var20 = var17.field2100;
                    var21 = var17.field2091;
                }
                int var22 = (arg2 + var20) * 128;
                int var23 = (arg3 + var21) * 128;
                int var24 = arg2 * 128;
                int var25 = arg3 * 128;
                int var26 = var17.field2120;
                int var27 = var17.field2121 * 128;
                if (var17.field2114 != null) {
                    class202 var28 = var17.method3592();
                    if (var28 != null) {
                        var26 = var28.field2120;
                        var27 = var28.field2121 * 128;
                    }
                }
                class70 var10000 = (class70) null;
                for (class70 var29 = (class70) class70.field832.method6579(); var29 != null; var29 = (class70) class70.field832.method6549()) {
                    if (var29.field820 == arg0 && var29.field821 == var24 && var29.field827 == var25 && var29.field831 == var22 && var29.field824 == var23 && var29.field826 == var26 && var29.field825 == var27) {
                        if (var29.field822 != null) {
                            Statics.field1266.method739(var29.field822);
                            var29.field822 = null;
                        }
                        if (var29.field819 != null) {
                            Statics.field1266.method739(var29.field819);
                            var29.field819 = null;
                        }
                        var29.method7828();
                        break;
                    }
                    var10000 = (class70) null;
                }
            }
            if (arg1 == 0) {
                Statics.field231.method4812(arg0, arg2, arg3);
                if (var17.field2092 != 0) {
                    field561[arg0].method4010(arg2, arg3, var15, var16, var17.field2094);
                }
            }
            if (arg1 == 1) {
                Statics.field231.method4890(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field231.method4814(arg0, arg2, arg3);
                if (var17.field2091 + arg2 > 103 || var17.field2091 + arg3 > 103 || var17.field2100 + arg2 > 103 || var17.field2100 + arg3 > 103) {
                    return;
                }
                if (var17.field2092 != 0) {
                    field561[arg0].method3983(arg2, arg3, var17.field2091, var17.field2100, var16, var17.field2094);
                }
            }
            if (arg1 == 3) {
                Statics.field231.method4859(arg0, arg2, arg3);
                if (var17.field2092 == 1) {
                    field561[arg0].method3990(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var30 = arg0;
        if (arg0 < 3 && (class82.field1001[1][arg2][arg3] & 0x2) == 2) {
            var30 = arg0 + 1;
        }
        class271 var31 = Statics.field231;
        class225 var32 = field561[arg0];
        class202 var33 = Statics.method4138(arg4);
        int var34 = arg7 >= 0 ? arg7 : var33.field2083;
        int var35;
        int var36;
        if (arg5 == 1 || arg5 == 3) {
            var35 = var33.field2100;
            var36 = var33.field2091;
        } else {
            var35 = var33.field2091;
            var36 = var33.field2100;
        }
        int var37;
        int var38;
        if (arg2 + var35 <= 104) {
            var37 = (var35 >> 1) + arg2;
            var38 = (var35 + 1 >> 1) + arg2;
        } else {
            var37 = arg2;
            var38 = arg2 + 1;
        }
        int var39;
        int var40;
        if (arg3 + var36 <= 104) {
            var39 = (var36 >> 1) + arg3;
            var40 = (var36 + 1 >> 1) + arg3;
        } else {
            var39 = arg3;
            var40 = arg3 + 1;
        }
        int[][] var41 = class82.field1014[var30];
        int var42 = var41[var37][var39] + var41[var38][var39] + var41[var37][var40] + var41[var38][var40] >> 2;
        int var43 = (arg2 << 7) + (var35 << 6);
        int var44 = (arg3 << 7) + (var36 << 6);
        long var45 = class281.method2317(arg2, arg3, 2, var33.field2095 == 0, arg4);
        int var47 = (arg5 << 6) + arg6;
        if (var33.field2076 == 1) {
            var47 += 256;
        }
        if (arg6 == 22) {
            class273 var48;
            if (var34 == -1 && var33.field2114 == null) {
                var48 = var33.method3580(22, arg5, var41, var43, var42, var44);
            } else {
                var48 = new class80(arg4, 22, arg5, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4801(arg0, arg2, arg3, var42, var48, var45, var47);
            if (var33.field2092 == 1) {
                var32.method3975(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class273 var74;
            if (var34 == -1 && var33.field2114 == null) {
                var74 = var33.method3580(10, arg5, var41, var43, var42, var44);
            } else {
                var74 = new class80(arg4, 10, arg5, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            if (var74 != null) {
                var31.method4805(arg0, arg2, arg3, var42, var35, var36, var74, arg6 == 11 ? 256 : 0, var45, var47);
            }
            if (var33.field2092 != 0) {
                var32.method3978(arg2, arg3, var35, var36, var33.field2094);
            }
        } else if (arg6 >= 12) {
            class273 var49;
            if (var34 == -1 && var33.field2114 == null) {
                var49 = var33.method3580(arg6, arg5, var41, var43, var42, var44);
            } else {
                var49 = new class80(arg4, arg6, arg5, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4805(arg0, arg2, arg3, var42, 1, 1, var49, 0, var45, var47);
            if (var33.field2092 != 0) {
                var32.method3978(arg2, arg3, var35, var36, var33.field2094);
            }
        } else if (arg6 == 0) {
            class273 var50;
            if (var34 == -1 && var33.field2114 == null) {
                var50 = var33.method3580(0, arg5, var41, var43, var42, var44);
            } else {
                var50 = new class80(arg4, 0, arg5, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4803(arg0, arg2, arg3, var42, var50, (class273) null, class82.field1007[arg5], 0, var45, var47);
            if (var33.field2092 != 0) {
                var32.method3977(arg2, arg3, arg6, arg5, var33.field2094);
            }
        } else if (arg6 == 1) {
            class273 var51;
            if (var34 == -1 && var33.field2114 == null) {
                var51 = var33.method3580(1, arg5, var41, var43, var42, var44);
            } else {
                var51 = new class80(arg4, 1, arg5, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4803(arg0, arg2, arg3, var42, var51, (class273) null, class82.field1006[arg5], 0, var45, var47);
            if (var33.field2092 != 0) {
                var32.method3977(arg2, arg3, arg6, arg5, var33.field2094);
            }
        } else if (arg6 == 2) {
            int var52 = arg5 + 1 & 0x3;
            class273 var53;
            class273 var54;
            if (var34 == -1 && var33.field2114 == null) {
                var53 = var33.method3580(2, arg5 + 4, var41, var43, var42, var44);
                var54 = var33.method3580(2, var52, var41, var43, var42, var44);
            } else {
                var53 = new class80(arg4, 2, arg5 + 4, var30, arg2, arg3, var34, var33.field2125, (class273) null);
                var54 = new class80(arg4, 2, var52, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4803(arg0, arg2, arg3, var42, var53, var54, class82.field1007[arg5], class82.field1007[var52], var45, var47);
            if (var33.field2092 != 0) {
                var32.method3977(arg2, arg3, arg6, arg5, var33.field2094);
            }
        } else if (arg6 == 3) {
            class273 var55;
            if (var34 == -1 && var33.field2114 == null) {
                var55 = var33.method3580(3, arg5, var41, var43, var42, var44);
            } else {
                var55 = new class80(arg4, 3, arg5, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4803(arg0, arg2, arg3, var42, var55, (class273) null, class82.field1006[arg5], 0, var45, var47);
            if (var33.field2092 != 0) {
                var32.method3977(arg2, arg3, arg6, arg5, var33.field2094);
            }
        } else if (arg6 == 9) {
            class273 var56;
            if (var34 == -1 && var33.field2114 == null) {
                var56 = var33.method3580(arg6, arg5, var41, var43, var42, var44);
            } else {
                var56 = new class80(arg4, arg6, arg5, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4805(arg0, arg2, arg3, var42, 1, 1, var56, 0, var45, var47);
            if (var33.field2092 != 0) {
                var32.method3978(arg2, arg3, var35, var36, var33.field2094);
            }
        } else if (arg6 == 4) {
            class273 var57;
            if (var34 == -1 && var33.field2114 == null) {
                var57 = var33.method3580(4, arg5, var41, var43, var42, var44);
            } else {
                var57 = new class80(arg4, 4, arg5, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4804(arg0, arg2, arg3, var42, var57, (class273) null, class82.field1007[arg5], 0, 0, 0, var45, var47);
        } else if (arg6 == 5) {
            int var58 = 16;
            long var59 = var31.method4821(arg0, arg2, arg3);
            if (var59 != 0L) {
                var58 = Statics.method4138(Statics.method4107(var59)).field2093;
            }
            class273 var61;
            if (var34 == -1 && var33.field2114 == null) {
                var61 = var33.method3580(4, arg5, var41, var43, var42, var44);
            } else {
                var61 = new class80(arg4, 4, arg5, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4804(arg0, arg2, arg3, var42, var61, (class273) null, class82.field1007[arg5], 0, class82.field1011[arg5] * var58, class82.field1008[arg5] * var58, var45, var47);
        } else if (arg6 == 6) {
            int var62 = 8;
            long var63 = var31.method4821(arg0, arg2, arg3);
            if (var63 != 0L) {
                var62 = Statics.method4138(Statics.method4107(var63)).field2093 / 2;
            }
            class273 var65;
            if (var34 == -1 && var33.field2114 == null) {
                var65 = var33.method3580(4, arg5 + 4, var41, var43, var42, var44);
            } else {
                var65 = new class80(arg4, 4, arg5 + 4, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4804(arg0, arg2, arg3, var42, var65, (class273) null, 256, arg5, class82.field1009[arg5] * var62, class82.field1010[arg5] * var62, var45, var47);
        } else if (arg6 == 7) {
            int var66 = arg5 + 2 & 0x3;
            class273 var67;
            if (var34 == -1 && var33.field2114 == null) {
                var67 = var33.method3580(4, var66 + 4, var41, var43, var42, var44);
            } else {
                var67 = new class80(arg4, 4, var66 + 4, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4804(arg0, arg2, arg3, var42, var67, (class273) null, 256, var66, 0, 0, var45, var47);
        } else if (arg6 == 8) {
            int var68 = 8;
            long var69 = var31.method4821(arg0, arg2, arg3);
            if (var69 != 0L) {
                var68 = Statics.method4138(Statics.method4107(var69)).field2093 / 2;
            }
            int var71 = arg5 + 2 & 0x3;
            class273 var72;
            class273 var73;
            if (var34 == -1 && var33.field2114 == null) {
                var72 = var33.method3580(4, arg5 + 4, var41, var43, var42, var44);
                var73 = var33.method3580(4, var71 + 4, var41, var43, var42, var44);
            } else {
                var72 = new class80(arg4, 4, arg5 + 4, var30, arg2, arg3, var34, var33.field2125, (class273) null);
                var73 = new class80(arg4, 4, var71 + 4, var30, arg2, arg3, var34, var33.field2125, (class273) null);
            }
            var31.method4804(arg0, arg2, arg3, var42, var72, var73, 256, arg5, class82.field1009[arg5] * var68, class82.field1010[arg5] * var68, var45, var47);
        }
        class202 var75 = Statics.method4138(arg4);
        if (var75 != null && var75.method3586()) {
            class70.method2752(var30, arg2, arg3, var75, arg5);
        }
    }

    @ObfuscatedName("fc.ki(IIS)V")
    public static final void method3147(int arg0, int arg1) {
        class390 var2 = field697[Statics.field2658][arg0][arg1];
        if (var2 == null) {
            Statics.field231.method4928(Statics.field2658, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class105 var5 = null;
        for (class105 var6 = (class105) var2.method6579(); var6 != null; var6 = (class105) var2.method6549()) {
            class203 var7 = class203.method3907(var6.field1344);
            long var8 = (long) var7.field2152;
            if (var7.field2151 == 1) {
                var8 *= var6.field1342 < Integer.MAX_VALUE ? (long) (var6.field1342 + 1) : (long) var6.field1342;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field231.method4928(Statics.field2658, arg0, arg1);
            return;
        }
        var2.method6575(var5);
        class105 var10 = null;
        class105 var11 = null;
        for (class105 var12 = (class105) var2.method6579(); var12 != null; var12 = (class105) var2.method6549()) {
            if (var5.field1344 != var12.field1344) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1344 != var12.field1344 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class281.method2317(arg0, arg1, 3, false, 0);
        Statics.field231.method4802(Statics.field2658, arg0, arg1, method6196(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2658), var5, var13, var10, var11);
    }

    @ObfuscatedName("dr.kz(ZLuo;I)V")
    public static final void method2263(boolean arg0, class526 arg1) {
        field618 = 0;
        field638 = 0;
        method7787(arg1);
        while (true) {
            byte var2 = 16;
            int var3 = 0x1 << var2;
            if (arg1.method8385(field590.field1411) < var2 + 12) {
                break;
            }
            int var4 = arg1.method8360(var2);
            if (var3 - 1 == var4) {
                break;
            }
            boolean var76 = false;
            if (field776[var4] == null) {
                field776[var4] = new class101();
                var76 = true;
            }
            class101 var77 = field776[var4];
            field496[++field547 - 1] = var4;
            var77.field1231 = field500;
            int var78 = arg1.method8360(1);
            int var79 = field623[arg1.method8360(3)];
            if (var76) {
                var77.field1239 = var77.field1180 = var79;
            }
            int var80;
            if (arg0) {
                var80 = arg1.method8360(8);
                if (var80 > 127) {
                    var80 -= 256;
                }
            } else {
                var80 = arg1.method8360(5);
                if (var80 > 15) {
                    var80 -= 32;
                }
            }
            boolean var81 = arg1.method8360(1) == 1;
            if (var81) {
                arg1.method8360(32);
            }
            int var82 = arg1.method8360(1);
            if (var82 == 1) {
                field550[++field638 - 1] = var4;
            }
            int var83;
            if (arg0) {
                var83 = arg1.method8360(8);
                if (var83 > 127) {
                    var83 -= 256;
                }
            } else {
                var83 = arg1.method8360(5);
                if (var83 > 15) {
                    var83 -= 32;
                }
            }
            var77.field1311 = class189.method3442(arg1.method8360(14));
            method489(var77);
            if (var77.field1241 == 0) {
                var77.field1180 = 0;
            }
            var77.method2566(Statics.field2420.field1243[0] + var80, Statics.field2420.field1244[0] + var83, var78 == 1);
        }
        arg1.method8351();
        for (int var5 = 0; var5 < field638; var5++) {
            int var6 = field550[var5];
            class101 var7 = field776[var6];
            int var8 = arg1.method8410();
            if ((var8 & 0x10) != 0) {
                int var9 = arg1.method8410();
                var8 += var9 << 8;
            }
            if ((var8 & 0x100) != 0) {
                int var10 = arg1.method8410();
                var8 += var10 << 16;
            }
            if ((var8 & 0x1000) != 0) {
                int var11 = arg1.method8646();
                if ((var11 & 0x1) == 1) {
                    var7.method2545();
                } else {
                    int[] var12 = null;
                    if ((var11 & 0x2) == 2) {
                        int var13 = arg1.method8444();
                        var12 = new int[var13];
                        for (int var14 = 0; var14 < var13; var14++) {
                            int var15 = arg1.method8452();
                            int var16 = var15 == 65535 ? -1 : var15;
                            var12[var14] = var16;
                        }
                    }
                    short[] var17 = null;
                    if ((var11 & 0x4) == 4) {
                        int var18 = 0;
                        if (var7.field1311.field1939 != null) {
                            var18 = var7.field1311.field1939.length;
                        }
                        var17 = new short[var18];
                        for (int var19 = 0; var19 < var18; var19++) {
                            var17[var19] = (short) arg1.method8452();
                        }
                    }
                    short[] var20 = null;
                    if ((var11 & 0x8) == 8) {
                        int var21 = 0;
                        if (var7.field1311.field1937 != null) {
                            var21 = var7.field1311.field1937.length;
                        }
                        var20 = new short[var21];
                        for (int var22 = 0; var22 < var21; var22++) {
                            var20[var22] = (short) arg1.method8453();
                        }
                    }
                    boolean var23 = false;
                    if ((var11 & 0x10) != 0) {
                        var23 = arg1.method8646() == 1;
                    }
                    long var24 = (long) (++class101.field1312 - 1);
                    var7.method2543(new class188(var24, var12, var17, var20, var23));
                }
            }
            if ((var8 & 0x10000) != 0) {
                int var26 = arg1.method8410();
                int[] var27 = new int[8];
                short[] var28 = new short[8];
                for (int var29 = 0; var29 < 8; var29++) {
                    if ((var26 & 0x1 << var29) == 0) {
                        var27[var29] = -1;
                        var28[var29] = -1;
                    } else {
                        var27[var29] = arg1.method8430();
                        var28[var29] = (short) arg1.method8427();
                    }
                }
                var7.method2539(var27, var28);
            }
            if ((var8 & 0x40000) != 0) {
                int var30 = arg1.method8469();
                var7.field1192 = (var30 & 0x1) == 0 ? var7.field1311.field1931 : arg1.method8412();
                var7.field1208 = (var30 & 0x2) == 0 ? var7.field1311.field1940 : arg1.method8453();
                var7.field1181 = (var30 & 0x4) == 0 ? var7.field1311.field1933 : arg1.method8454();
                var7.field1182 = (var30 & 0x8) == 0 ? var7.field1311.field1925 : arg1.method8453();
                var7.field1183 = (var30 & 0x10) == 0 ? var7.field1311.field1935 : arg1.method8454();
                var7.field1227 = (var30 & 0x20) == 0 ? var7.field1311.field1936 : arg1.method8453();
                var7.field1185 = (var30 & 0x40) == 0 ? var7.field1311.field1932 : arg1.method8452();
                var7.field1186 = (var30 & 0x80) == 0 ? var7.field1311.field1938 : arg1.method8454();
                var7.field1187 = (var30 & 0x100) == 0 ? var7.field1311.field1955 : arg1.method8453();
                var7.field1234 = (var30 & 0x200) == 0 ? var7.field1311.field1963 : arg1.method8412();
                var7.field1189 = (var30 & 0x400) == 0 ? var7.field1311.field1962 : arg1.method8453();
                var7.field1190 = (var30 & 0x800) == 0 ? var7.field1311.field1942 : arg1.method8412();
                var7.field1191 = (var30 & 0x1000) == 0 ? var7.field1311.field1959 : arg1.method8453();
                var7.field1240 = (var30 & 0x2000) == 0 ? var7.field1311.field1946 : arg1.method8453();
                var7.field1178 = (var30 & 0x4000) == 0 ? var7.field1311.field1930 : arg1.method8454();
            }
            if ((var8 & 0x1) != 0) {
                int var31 = arg1.method8452();
                if (var31 == 65535) {
                    var31 = -1;
                }
                int var32 = arg1.method8410();
                if (var7.field1229 == var31 && var31 != -1) {
                    int var33 = class205.method2129(var31).field2231;
                    if (var33 == 1) {
                        var7.field1218 = 0;
                        var7.field1219 = 0;
                        var7.field1220 = var32;
                        var7.field1200 = 0;
                    }
                    if (var33 == 2) {
                        var7.field1200 = 0;
                    }
                } else if (var31 == -1 || var7.field1229 == -1 || class205.method2129(var31).field2224 >= class205.method2129(var7.field1229).field2224) {
                    var7.field1229 = var31;
                    var7.field1218 = 0;
                    var7.field1219 = 0;
                    var7.field1220 = var32;
                    var7.field1200 = 0;
                    var7.field1221 = var7.field1242;
                }
            }
            if ((var8 & 0x400) != 0) {
                var7.field1210 = arg1.method8446();
                var7.field1195 = arg1.method8447();
                var7.field1225 = arg1.method8446();
                var7.field1204 = arg1.method8447();
                var7.field1228 = arg1.method8454() + field500;
                var7.field1188 = arg1.method8454() + field500;
                var7.field1230 = arg1.method8454();
                var7.field1242 = 1;
                var7.field1221 = 0;
                var7.field1210 += var7.field1243[0];
                var7.field1195 += var7.field1244[0];
                var7.field1225 += var7.field1243[0];
                var7.field1204 += var7.field1244[0];
            }
            if ((var8 & 0x2000) != 0) {
                var7.field1248 = arg1.method8468();
            }
            if ((var8 & 0x20) != 0) {
                int var34 = arg1.method8412();
                int var35 = arg1.method8452();
                var7.field1212 = arg1.method8444() == 1;
                if (field493 >= 212) {
                    var7.field1179 = var34;
                    var7.field1211 = var35;
                } else {
                    int var36 = var7.field1247 - (var34 - Statics.field1917 - Statics.field1917) * 64;
                    int var37 = var7.field1173 - (var35 - Statics.field1322 - Statics.field1322) * 64;
                    if (var36 != 0 || var37 != 0) {
                        var7.field1209 = Statics.method3779(var36, var37);
                    }
                }
            }
            if ((var8 & 0x80) != 0) {
                var7.field1223 = arg1.method8412();
                var7.field1223 += arg1.method8444() << 16;
                int var38 = 16777215;
                if (var7.field1223 == var38) {
                    var7.field1223 = -1;
                }
            }
            if ((var8 & 0x2) != 0) {
                int var39 = arg1.method8646();
                if (var39 > 0) {
                    for (int var40 = 0; var40 < var39; var40++) {
                        int var41 = -1;
                        int var42 = -1;
                        int var43 = -1;
                        int var44 = arg1.method8426();
                        if (var44 == 32767) {
                            var44 = arg1.method8426();
                            var42 = arg1.method8426();
                            var41 = arg1.method8426();
                            var43 = arg1.method8426();
                        } else if (var44 == 32766) {
                            var44 = -1;
                        } else {
                            var42 = arg1.method8426();
                        }
                        int var45 = arg1.method8426();
                        var7.method2337(var44, var42, var41, var43, field500, var45);
                    }
                }
                int var46 = arg1.method8445();
                if (var46 > 0) {
                    for (int var47 = 0; var47 < var46; var47++) {
                        int var48 = arg1.method8426();
                        int var49 = arg1.method8426();
                        if (var49 == 32767) {
                            var7.method2339(var48);
                        } else {
                            int var50 = arg1.method8426();
                            int var51 = arg1.method8410();
                            int var52 = var49 > 0 ? arg1.method8410() : var51;
                            var7.method2347(var48, field500, var49, var50, var51, var52);
                        }
                    }
                }
            }
            if ((var8 & 0x4000) != 0) {
                var7.method2577(arg1.method8535());
            }
            if ((var8 & 0x8000) != 0) {
                var7.method2531(arg1.method8444());
            }
            if ((var8 & 0x20000) != 0) {
                int var53 = arg1.method8410();
                for (int var54 = 0; var54 < var53; var54++) {
                    int var55 = arg1.method8410();
                    int var56 = arg1.method8412();
                    int var57 = arg1.method8468();
                    var7.method2340(var55, var56, var57 >> 16, var57 & 0xFFFF);
                }
            }
            if ((var8 & 0x800) != 0) {
                var7.field1233 = field500 + arg1.method8452();
                var7.field1216 = field500 + arg1.method8454();
                var7.field1235 = arg1.method8446();
                var7.field1236 = arg1.method8447();
                var7.field1172 = arg1.method8446();
                var7.field1238 = (byte) arg1.method8445();
            }
            if ((var8 & 0x200) != 0) {
                int var58 = arg1.method8444();
                if ((var58 & 0x1) == 1) {
                    var7.method2544();
                } else {
                    int[] var59 = null;
                    if ((var58 & 0x2) == 2) {
                        int var60 = arg1.method8444();
                        var59 = new int[var60];
                        for (int var61 = 0; var61 < var60; var61++) {
                            int var62 = arg1.method8412();
                            int var63 = var62 == 65535 ? -1 : var62;
                            var59[var61] = var63;
                        }
                    }
                    short[] var64 = null;
                    if ((var58 & 0x4) == 4) {
                        int var65 = 0;
                        if (var7.field1311.field1939 != null) {
                            var65 = var7.field1311.field1939.length;
                        }
                        var64 = new short[var65];
                        for (int var66 = 0; var66 < var65; var66++) {
                            var64[var66] = (short) arg1.method8412();
                        }
                    }
                    short[] var67 = null;
                    if ((var58 & 0x8) == 8) {
                        int var68 = 0;
                        if (var7.field1311.field1937 != null) {
                            var68 = var7.field1311.field1937.length;
                        }
                        var67 = new short[var68];
                        for (int var69 = 0; var69 < var68; var69++) {
                            var67[var69] = (short) arg1.method8453();
                        }
                    }
                    boolean var70 = false;
                    if ((var58 & 0x10) != 0) {
                        var70 = arg1.method8646() == 1;
                    }
                    long var71 = (long) (++class101.field1306 - 1);
                    var7.method2541(new class188(var71, var59, var64, var67, var70));
                }
            }
            if ((var8 & 0x8) != 0) {
                var7.field1311 = class189.method3442(arg1.method8452());
                method489(var7);
                var7.method2540();
            }
            if ((var8 & 0x4) != 0) {
                var7.field1226 = arg1.method8535();
                var7.field1196 = 100;
            }
            if ((var8 & 0x40) != 0) {
                arg1.method8453();
                arg1.method8469();
            }
        }
        for (int var73 = 0; var73 < field618; var73++) {
            int var74 = field619[var73];
            if (field500 != field776[var74].field1231) {
                field776[var74].field1311 = null;
                field776[var74] = null;
            }
        }
        if (field590.field1411 != arg1.field5137) {
            throw new RuntimeException(arg1.field5137 + class102.field1324 + field590.field1411);
        }
        for (int var75 = 0; var75 < field547; var75++) {
            if (field776[field496[var75]] == null) {
                throw new RuntimeException(var75 + class102.field1324 + field547);
            }
        }
    }

    @ObfuscatedName("si.kn(Luo;B)V")
    public static final void method7787(class526 arg0) {
        arg0.method8359();
        int var1 = arg0.method8360(8);
        if (var1 < field547) {
            for (int var2 = var1; var2 < field547; var2++) {
                field619[++field618 - 1] = field496[var2];
            }
        }
        if (var1 > field547) {
            throw new RuntimeException("");
        }
        field547 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field496[var3];
            class101 var5 = field776[var4];
            int var6 = arg0.method8360(1);
            if (var6 == 0) {
                field496[++field547 - 1] = var4;
                var5.field1231 = field500;
            } else {
                int var7 = arg0.method8360(2);
                if (var7 == 0) {
                    field496[++field547 - 1] = var4;
                    var5.field1231 = field500;
                    field550[++field638 - 1] = var4;
                } else if (var7 == 1) {
                    field496[++field547 - 1] = var4;
                    var5.field1231 = field500;
                    int var8 = arg0.method8360(3);
                    var5.method2535(var8, class229.field2410);
                    int var9 = arg0.method8360(1);
                    if (var9 == 1) {
                        field550[++field638 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field496[++field547 - 1] = var4;
                    var5.field1231 = field500;
                    if (arg0.method8360(1) == 1) {
                        int var10 = arg0.method8360(3);
                        var5.method2535(var10, class229.field2411);
                        int var11 = arg0.method8360(3);
                        var5.method2535(var11, class229.field2411);
                    } else {
                        int var12 = arg0.method8360(3);
                        var5.method2535(var12, class229.field2409);
                    }
                    int var13 = arg0.method8360(1);
                    if (var13 == 1) {
                        field550[++field638 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field619[++field618 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("ba.kd(Ldn;I)V")
    public static void method489(class101 arg0) {
        arg0.field1199 = arg0.field1311.field1927;
        arg0.field1241 = arg0.field1311.field1957;
        arg0.field1181 = arg0.field1311.field1933;
        arg0.field1182 = arg0.field1311.field1925;
        arg0.field1183 = arg0.field1311.field1935;
        arg0.field1227 = arg0.field1311.field1936;
        arg0.field1178 = arg0.field1311.field1930;
        arg0.field1192 = arg0.field1311.field1931;
        arg0.field1208 = arg0.field1311.field1940;
        arg0.field1185 = arg0.field1311.field1932;
        arg0.field1186 = arg0.field1311.field1938;
        arg0.field1187 = arg0.field1311.field1955;
        arg0.field1234 = arg0.field1311.field1963;
        arg0.field1189 = arg0.field1311.field1962;
        arg0.field1190 = arg0.field1311.field1942;
        arg0.field1191 = arg0.field1311.field1959;
        arg0.field1240 = arg0.field1311.field1946;
    }

    @ObfuscatedName("jz.kf(Lds;IILiz;I)V")
    public static final void method4504(class92 arg0, int arg1, int arg2, class229 arg3) {
        int var4 = arg0.field1243[0];
        int var5 = arg0.field1244[0];
        int var6 = arg0.method2269();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        class230 var7 = field674;
        int var10 = arg0.method2269();
        field751.field2397 = arg1;
        field751.field2394 = arg2;
        field751.field2396 = 1;
        field751.field2395 = 1;
        class66 var11 = field751;
        int var12 = var7.method4064(var4, var5, var10, var11, field561[arg0.field1118], true, field791, field719);
        if (var12 >= 1) {
            for (int var13 = 0; var13 < var12 - 1; var13++) {
                arg0.method2279(field791[var13], field719[var13], arg3);
            }
        }
    }

    @ObfuscatedName("gs.ku(I)V")
    public static void method3161() {
        field635 = 0;
        field557 = false;
    }

    @ObfuscatedName("ss.kp(III)V")
    public static final void method7818(int arg0, int arg1) {
        if (field635 < 2 && field728 == 0 && !field632 || !field685) {
            return;
        }
        int var2 = field635 - 1;
        String var4;
        if (field728 == 1 && field635 < 2) {
            var4 = class364.field4148 + class364.field4100 + field768 + " " + class102.field1316;
        } else if (field632 && field635 < 2) {
            var4 = field656 + class364.field4100 + field657 + " " + class102.field1316;
        } else {
            var4 = method705(var2);
        }
        if (field635 > 2) {
            var4 = var4 + class102.method3201(16777215) + " " + '/' + " " + (field635 - 2) + class364.field4102;
        }
        Statics.field4352.method7038(var4, arg0 + 4, arg1 + 15, 16777215, 0, field500 / 1000);
    }

    @ObfuscatedName("fc.ko(B)V")
    public static final void method3094() {
        int var0 = Statics.field818;
        int var1 = Statics.field424;
        int var2 = Statics.field4623;
        int var3 = Statics.field5069;
        int var4 = 6116423;
        class537.method8837(var0, var1, var2, var3, var4);
        class537.method8837(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class537.method8767(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field4352.method6981(class364.field4093, var0 + 3, var1 + 14, var4, -1);
        int var5 = class36.field217;
        int var6 = class36.field218;
        for (int var7 = 0; var7 < field635; var7++) {
            int var8 = (field635 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class406 var10 = Statics.field4352;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field642[var7].length() > 0) {
                var11 = field641[var7] + class364.field4100 + field642[var7];
            } else {
                var11 = field641[var7];
            }
            var10.method6981(var11, var0 + 3, var8, var9, 0);
        }
        method838(Statics.field818, Statics.field424, Statics.field4623, Statics.field5069);
    }

    @ObfuscatedName("cw.kw(B)Z")
    public static final boolean method1105() {
        return field557;
    }

    @ObfuscatedName("bz.kg(IIIII)V")
    public static final void method838(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field707; var4++) {
            if (field712[var4] + field692[var4] > arg0 && field712[var4] < arg0 + arg2 && field733[var4] + field715[var4] > arg1 && field733[var4] < arg1 + arg3) {
                field786[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.kl(I)V")
    public final void method1202() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field635 - 1; var2++) {
                if (field736[var2] < 1000 && field736[var2 + 1] > 1000) {
                    String var3 = field642[var2];
                    field642[var2] = field642[var2 + 1];
                    field642[var2 + 1] = var3;
                    String var4 = field641[var2];
                    field641[var2] = field641[var2 + 1];
                    field641[var2 + 1] = var4;
                    int var5 = field736[var2];
                    field736[var2] = field736[var2 + 1];
                    field736[var2 + 1] = var5;
                    int var6 = field636[var2];
                    field636[var2] = field636[var2 + 1];
                    field636[var2 + 1] = var6;
                    int var7 = field562[var2];
                    field562[var2] = field562[var2 + 1];
                    field562[var2 + 1] = var7;
                    int var8 = field708[var2];
                    field708[var2] = field708[var2 + 1];
                    field708[var2 + 1] = var8;
                    int var9 = field640[var2];
                    field640[var2] = field640[var2 + 1];
                    field640[var2 + 1] = var9;
                    boolean var10 = field643[var2];
                    field643[var2] = field643[var2 + 1];
                    field643[var2 + 1] = var10;
                    var1 = false;
                }
            }
        }
        if (field650 != null) {
            return;
        }
        int var11 = class36.field229;
        if (!field557) {
            int var39 = field635 - 1;
            if ((var11 == 1 || !Statics.field96 && var11 == 4) && this.method1325()) {
                var11 = 2;
            }
            if ((var11 == 1 || !Statics.field96 && var11 == 4) && field635 > 0 && var39 >= 0) {
                int var41 = field636[var39];
                int var42 = field562[var39];
                int var43 = field736[var39];
                int var44 = field708[var39];
                int var45 = field640[var39];
                String var46 = field641[var39];
                String var47 = field642[var39];
                method6972(var41, var42, var43, var44, var45, var46, var47, class36.field214, class36.field210);
            }
            if (var11 == 2 && field635 > 0) {
                this.method1352(class36.field214, class36.field210);
            }
            return;
        }
        if (var11 != 1 && (Statics.field96 || var11 != 4)) {
            int var12 = class36.field217;
            int var13 = class36.field218;
            if (var12 < Statics.field818 - 10 || var12 > Statics.field818 + Statics.field4623 + 10 || var13 < Statics.field424 - 10 || var13 > Statics.field5069 + Statics.field424 + 10) {
                field557 = false;
                int var14 = Statics.field818;
                int var15 = Statics.field424;
                int var16 = Statics.field4623;
                int var17 = Statics.field5069;
                for (int var18 = 0; var18 < field707; var18++) {
                    if (field712[var18] + field692[var18] > var14 && field712[var18] < var14 + var16 && field733[var18] + field715[var18] > var15 && field733[var18] < var15 + var17) {
                        field709[var18] = true;
                    }
                }
            }
        }
        if (var11 != 1 && Statics.field96 || var11 != 4) {
            return;
        }
        int var19 = Statics.field818;
        int var20 = Statics.field424;
        int var21 = Statics.field4623;
        int var22 = class36.field214;
        int var23 = class36.field210;
        int var24 = -1;
        for (int var25 = 0; var25 < field635; var25++) {
            int var26 = (field635 - 1 - var25) * 15 + var20 + 31;
            if (var22 > var19 && var22 < var19 + var21 && var23 > var26 - 13 && var23 < var26 + 3) {
                var24 = var25;
            }
        }
        if (var24 != -1 && var24 >= 0) {
            int var27 = field636[var24];
            int var28 = field562[var24];
            int var29 = field736[var24];
            int var30 = field708[var24];
            int var31 = field640[var24];
            String var32 = field641[var24];
            String var33 = field642[var24];
            method6972(var27, var28, var29, var30, var31, var32, var33, class36.field214, class36.field210);
        }
        field557 = false;
        int var34 = Statics.field818;
        int var35 = Statics.field424;
        int var36 = Statics.field4623;
        int var37 = Statics.field5069;
        for (int var38 = 0; var38 < field707; var38++) {
            if (field712[var38] + field692[var38] > var34 && field712[var38] < var34 + var36 && field733[var38] + field715[var38] > var35 && field733[var38] < var35 + var37) {
                field709[var38] = true;
            }
        }
    }

    @ObfuscatedName("client.kc(I)Z")
    public final boolean method1325() {
        int var1 = field635 - 1;
        return (field633 && field635 > 2 || method8279(var1)) && !field643[var1];
    }

    @ObfuscatedName("client.ka(IIB)V")
    public final void method1352(int arg0, int arg1) {
        method1070(arg0, arg1);
        int var3 = arg0 - field714;
        int var4 = arg1 - field770;
        Statics.field231.method4833(Statics.field2658, var3, var4, false);
        field557 = true;
    }

    @ObfuscatedName("ce.kb(IIB)V")
    public static void method1070(int arg0, int arg1) {
        int var2 = Statics.field4352.method7018(class364.field4093);
        for (int var3 = 0; var3 < field635; var3++) {
            class406 var4 = Statics.field4352;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field642[var3].length() > 0) {
                var5 = field641[var3] + class364.field4100 + field642[var3];
            } else {
                var5 = field641[var3];
            }
            int var6 = var4.method7018(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field635 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field4410) {
            var8 = Statics.field4410 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field321) {
            var9 = Statics.field321 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field818 = var8;
        Statics.field424 = var9;
        Statics.field4623 = var2;
        Statics.field5069 = field635 * 15 + 22;
    }

    @ObfuscatedName("tu.ky(IB)Z")
    public static final boolean method8279(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field736[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ct.ke(Lcb;III)V")
    public static final void method1096(class74 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method6972(arg0.field886, arg0.field885, arg0.field881, arg0.field889, arg0.field883, arg0.field884, arg0.field882, arg1, arg2);
        }
    }

    @ObfuscatedName("px.kx(IIIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method6972(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1004) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            class308 var9 = class308.method2768(class306.field3195, field590.field1405);
            var9.field3243.method8449(arg3);
            var9.field3243.method8394(Statics.field1322 + arg1);
            var9.field3243.method8394(Statics.field1917 + arg0);
            field590.method2719(var9);
        }
        if (arg2 == 26) {
            method8342();
        }
        if (arg2 == 22) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var10 = class308.method2768(class306.field3223, field590.field1405);
            var10.field3243.method8450(Statics.field1322 + arg1);
            var10.field3243.method8450(arg3);
            var10.field3243.method8450(Statics.field1917 + arg0);
            var10.field3243.method8442(field725.method3952(82) ? 1 : 0);
            field590.method2719(var10);
        }
        if (arg2 == 25) {
            class344 var11 = Statics.field1878.method5630(arg1, arg0);
            if (var11 != null) {
                method1030();
                method7127(arg1, arg0, class345.method4103(method6207(var11)), arg4);
                field728 = 0;
                field656 = method2259(var11);
                if (field656 == null) {
                    field656 = class364.field4153;
                }
                if (var11.field3749) {
                    field657 = var11.field3740 + class102.method3201(16777215);
                } else {
                    field657 = class102.method3201(65280) + var11.field3789 + class102.method3201(16777215);
                }
            }
            return;
        }
        if (arg2 == 6) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var12 = class308.method2768(class306.field3220, field590.field1405);
            var12.field3243.method8440(field725.method3952(82) ? 1 : 0);
            var12.field3243.method8450(Statics.field1322 + arg1);
            var12.field3243.method8394(arg3);
            var12.field3243.method8449(Statics.field1917 + arg0);
            field590.method2719(var12);
        }
        if (arg2 == 11) {
            class101 var13 = field776[arg3];
            if (var13 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var14 = class308.method2768(class306.field3128, field590.field1405);
                var14.field3243.method8450(arg3);
                var14.field3243.method8442(field725.method3952(82) ? 1 : 0);
                field590.method2719(var14);
            }
        }
        if (arg2 == 12) {
            class101 var15 = field776[arg3];
            if (var15 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var16 = class308.method2768(class306.field3182, field590.field1405);
                var16.field3243.method8441(field725.method3952(82) ? 1 : 0);
                var16.field3243.method8394(arg3);
                field590.method2719(var16);
            }
        }
        if (arg2 == 48) {
            class92 var17 = field651[arg3];
            if (var17 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var18 = class308.method2768(class306.field3225, field590.field1405);
                var18.field3243.method8450(arg3);
                var18.field3243.method8440(field725.method3952(82) ? 1 : 0);
                field590.method2719(var18);
            }
        }
        if (arg2 == 3) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var19 = class308.method2768(class306.field3188, field590.field1405);
            var19.field3243.method8393(field725.method3952(82) ? 1 : 0);
            var19.field3243.method8640(Statics.field1322 + arg1);
            var19.field3243.method8394(Statics.field1917 + arg0);
            var19.field3243.method8449(arg3);
            field590.method2719(var19);
        }
        if (arg2 == 17) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var20 = class308.method2768(class306.field3164, field590.field1405);
            var20.field3243.method8640(Statics.field1917 + arg0);
            var20.field3243.method8440(field725.method3952(82) ? 1 : 0);
            var20.field3243.method8449(Statics.field1322 + arg1);
            var20.field3243.method8465(Statics.field3827);
            var20.field3243.method8394(field535);
            var20.field3243.method8394(field655);
            var20.field3243.method8449(arg3);
            field590.method2719(var20);
        }
        if (arg2 == 20) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var21 = class308.method2768(class306.field3156, field590.field1405);
            var21.field3243.method8449(Statics.field1917 + arg0);
            var21.field3243.method8394(Statics.field1322 + arg1);
            var21.field3243.method8440(field725.method3952(82) ? 1 : 0);
            var21.field3243.method8394(arg3);
            field590.method2719(var21);
        }
        if (arg2 == 51) {
            class92 var22 = field651[arg3];
            if (var22 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var23 = class308.method2768(class306.field3221, field590.field1405);
                var23.field3243.method8393(field725.method3952(82) ? 1 : 0);
                var23.field3243.method8640(arg3);
                field590.method2719(var23);
            }
        }
        if (arg2 == 30 && field663 == null) {
            method100(arg1, arg0);
            field663 = Statics.field1878.method5630(arg1, arg0);
            method3158(field663);
        }
        if (arg2 == 21) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var24 = class308.method2768(class306.field3163, field590.field1405);
            var24.field3243.method8450(Statics.field1322 + arg1);
            var24.field3243.method8394(arg3);
            var24.field3243.method8440(field725.method3952(82) ? 1 : 0);
            var24.field3243.method8450(Statics.field1917 + arg0);
            field590.method2719(var24);
        }
        if (arg2 == 50) {
            class92 var25 = field651[arg3];
            if (var25 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var26 = class308.method2768(class306.field3150, field590.field1405);
                var26.field3243.method8640(arg3);
                var26.field3243.method8442(field725.method3952(82) ? 1 : 0);
                field590.method2719(var26);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class344 var27 = Statics.field1878.method5630(arg1, arg0);
            if (var27 != null) {
                method3721(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 28) {
            class308 var28 = class308.method2768(class306.field3179, field590.field1405);
            var28.field3243.method8396(arg1);
            field590.method2719(var28);
            class344 var29 = Statics.field1878.method5636(arg1);
            if (var29 != null && var29.field3648 != null && var29.field3648[0][0] == 5) {
                int var30 = var29.field3648[0][1];
                class333.field3554[var30] = 1 - class333.field3554[var30];
                Statics.method2100(var30);
            }
        }
        if (arg2 == 24) {
            class344 var31 = Statics.field1878.method5636(arg1);
            if (var31 != null) {
                boolean var32 = true;
                if (var31.field3664 > 0) {
                    var32 = method2588(var31);
                }
                if (var32) {
                    class308 var33 = class308.method2768(class306.field3179, field590.field1405);
                    var33.field3243.method8396(arg1);
                    field590.method2719(var33);
                }
            }
        }
        if (arg2 == 47) {
            class92 var34 = field651[arg3];
            if (var34 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var35 = class308.method2768(class306.field3218, field590.field1405);
                var35.field3243.method8442(field725.method3952(82) ? 1 : 0);
                var35.field3243.method8450(arg3);
                field590.method2719(var35);
            }
        }
        if (arg2 == 2) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var36 = class308.method2768(class306.field3187, field590.field1405);
            var36.field3243.method8449(arg3);
            var36.field3243.method8450(field655);
            var36.field3243.method8394(field535);
            var36.field3243.method8640(Statics.field1322 + arg1);
            var36.field3243.method8449(Statics.field1917 + arg0);
            var36.field3243.method8461(Statics.field3827);
            var36.field3243.method8393(field725.method3952(82) ? 1 : 0);
            field590.method2719(var36);
        }
        if (arg2 == 1002) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            class308 var37 = class308.method2768(class306.field3216, field590.field1405);
            var37.field3243.method8450(arg3);
            field590.method2719(var37);
        }
        if (arg2 == 8) {
            class101 var38 = field776[arg3];
            if (var38 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var39 = class308.method2768(class306.field3142, field590.field1405);
                var39.field3243.method8396(Statics.field3827);
                var39.field3243.method8640(arg3);
                var39.field3243.method8441(field725.method3952(82) ? 1 : 0);
                var39.field3243.method8394(field535);
                var39.field3243.method8449(field655);
                field590.method2719(var39);
            }
        }
        if (arg2 == 58) {
            class344 var40 = Statics.field1878.method5630(arg1, arg0);
            if (var40 != null) {
                if (var40.field3649 != null) {
                    class88 var41 = new class88();
                    var41.field1056 = var40;
                    var41.field1059 = arg3;
                    var41.field1063 = arg6;
                    var41.field1058 = var40.field3649;
                    class71.method3152(var41);
                }
                class308 var42 = class308.method2768(class306.field3140, field590.field1405);
                var42.field3243.method8466(Statics.field3827);
                var42.field3243.method8449(arg0);
                var42.field3243.method8449(field535);
                var42.field3243.method8465(arg1);
                var42.field3243.method8449(arg4);
                var42.field3243.method8450(field655);
                field590.method2719(var42);
            }
        }
        if (arg2 == 16) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var43 = class308.method2768(class306.field3171, field590.field1405);
            var43.field3243.method8449(Statics.field1917 + arg0);
            var43.field3243.method8393(field725.method3952(82) ? 1 : 0);
            var43.field3243.method8449(Statics.field415);
            var43.field3243.method8450(arg3);
            var43.field3243.method8450(Statics.field2344);
            var43.field3243.method8394(Statics.field1322 + arg1);
            var43.field3243.method8396(Statics.field2022);
            field590.method2719(var43);
        }
        if (arg2 == 1001) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var44 = class308.method2768(class306.field3149, field590.field1405);
            var44.field3243.method8449(Statics.field1917 + arg0);
            var44.field3243.method8449(Statics.field1322 + arg1);
            var44.field3243.method8440(field725.method3952(82) ? 1 : 0);
            var44.field3243.method8449(arg3);
            field590.method2719(var44);
        }
        if (arg2 == 10) {
            class101 var45 = field776[arg3];
            if (var45 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var46 = class308.method2768(class306.field3127, field590.field1405);
                var46.field3243.method8440(field725.method3952(82) ? 1 : 0);
                var46.field3243.method8640(arg3);
                field590.method2719(var46);
            }
        }
        if (arg2 == 9) {
            class101 var47 = field776[arg3];
            if (var47 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var48 = class308.method2768(class306.field3196, field590.field1405);
                var48.field3243.method8394(arg3);
                var48.field3243.method8441(field725.method3952(82) ? 1 : 0);
                field590.method2719(var48);
            }
        }
        if (arg2 == 15) {
            class92 var49 = field651[arg3];
            if (var49 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var50 = class308.method2768(class306.field3143, field590.field1405);
                var50.field3243.method8441(field725.method3952(82) ? 1 : 0);
                var50.field3243.method8450(field655);
                var50.field3243.method8640(arg3);
                var50.field3243.method8449(field535);
                var50.field3243.method8465(Statics.field3827);
                field590.method2719(var50);
            }
        }
        if (arg2 == 1) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var51 = class308.method2768(class306.field3173, field590.field1405);
            var51.field3243.method8465(Statics.field2022);
            var51.field3243.method8440(field725.method3952(82) ? 1 : 0);
            var51.field3243.method8449(Statics.field1917 + arg0);
            var51.field3243.method8640(Statics.field2344);
            var51.field3243.method8449(arg3);
            var51.field3243.method8640(Statics.field415);
            var51.field3243.method8449(Statics.field1322 + arg1);
            field590.method2719(var51);
        }
        if (arg2 == 1003) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            class101 var52 = field776[arg3];
            if (var52 != null) {
                class189 var53 = var52.field1311;
                if (var53.field1958 != null) {
                    var53 = var53.method3385();
                }
                if (var53 != null) {
                    class308 var54 = class308.method2768(class306.field3181, field590.field1405);
                    var54.field3243.method8450(var53.field1941);
                    field590.method2719(var54);
                }
            }
        }
        if (arg2 == 4) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var55 = class308.method2768(class306.field3206, field590.field1405);
            var55.field3243.method8394(Statics.field1322 + arg1);
            var55.field3243.method8449(Statics.field1917 + arg0);
            var55.field3243.method8442(field725.method3952(82) ? 1 : 0);
            var55.field3243.method8394(arg3);
            field590.method2719(var55);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1919.method7951(arg2, arg3, new class334(arg0), new class334(arg1));
        }
        if (arg2 == 49) {
            class92 var56 = field651[arg3];
            if (var56 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var57 = class308.method2768(class306.field3190, field590.field1405);
                var57.field3243.method8442(field725.method3952(82) ? 1 : 0);
                var57.field3243.method8394(arg3);
                field590.method2719(var57);
            }
        }
        if (arg2 == 23) {
            if (field557) {
                Statics.field231.method4834();
            } else {
                Statics.field231.method4833(Statics.field2658, arg0, arg1, true);
            }
        }
        if (arg2 == 44) {
            class92 var58 = field651[arg3];
            if (var58 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var59 = class308.method2768(class306.field3162, field590.field1405);
                var59.field3243.method8394(arg3);
                var59.field3243.method8441(field725.method3952(82) ? 1 : 0);
                field590.method2719(var59);
            }
        }
        if (arg2 == 45) {
            class92 var60 = field651[arg3];
            if (var60 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var61 = class308.method2768(class306.field3137, field590.field1405);
                var61.field3243.method8441(field725.method3952(82) ? 1 : 0);
                var61.field3243.method8449(arg3);
                field590.method2719(var61);
            }
        }
        if (arg2 == 7) {
            class101 var62 = field776[arg3];
            if (var62 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var63 = class308.method2768(class306.field3145, field590.field1405);
                var63.field3243.method8450(arg3);
                var63.field3243.method8394(Statics.field415);
                var63.field3243.method8393(field725.method3952(82) ? 1 : 0);
                var63.field3243.method8461(Statics.field2022);
                var63.field3243.method8394(Statics.field2344);
                field590.method2719(var63);
            }
        }
        if (arg2 == 29) {
            class308 var64 = class308.method2768(class306.field3179, field590.field1405);
            var64.field3243.method8396(arg1);
            field590.method2719(var64);
            class344 var65 = Statics.field1878.method5636(arg1);
            if (var65 != null && var65.field3648 != null && var65.field3648[0][0] == 5) {
                int var66 = var65.field3648[0][1];
                if (class333.field3554[var66] != var65.field3809[0]) {
                    class333.field3554[var66] = var65.field3809[0];
                    Statics.method2100(var66);
                }
            }
        }
        if (arg2 == 13) {
            class101 var67 = field776[arg3];
            if (var67 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var68 = class308.method2768(class306.field3175, field590.field1405);
                var68.field3243.method8442(field725.method3952(82) ? 1 : 0);
                var68.field3243.method8394(arg3);
                field590.method2719(var68);
            }
        }
        if (arg2 == 19) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var69 = class308.method2768(class306.field3148, field590.field1405);
            var69.field3243.method8393(field725.method3952(82) ? 1 : 0);
            var69.field3243.method8449(Statics.field1917 + arg0);
            var69.field3243.method8450(Statics.field1322 + arg1);
            var69.field3243.method8640(arg3);
            field590.method2719(var69);
        }
        if (arg2 == 14) {
            class92 var70 = field651[arg3];
            if (var70 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var71 = class308.method2768(class306.field3138, field590.field1405);
                var71.field3243.method8394(Statics.field2344);
                var71.field3243.method8440(field725.method3952(82) ? 1 : 0);
                var71.field3243.method8640(Statics.field415);
                var71.field3243.method8640(arg3);
                var71.field3243.method8396(Statics.field2022);
                field590.method2719(var71);
            }
        }
        if (arg2 == 5) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var72 = class308.method2768(class306.field3166, field590.field1405);
            var72.field3243.method8441(field725.method3952(82) ? 1 : 0);
            var72.field3243.method8450(Statics.field1322 + arg1);
            var72.field3243.method8449(Statics.field1917 + arg0);
            var72.field3243.method8449(arg3);
            field590.method2719(var72);
        }
        if (arg2 == 18) {
            field605 = arg7;
            field520 = arg8;
            field608 = 2;
            field691 = 0;
            field738 = arg0;
            field739 = arg1;
            class308 var73 = class308.method2768(class306.field3176, field590.field1405);
            var73.field3243.method8394(Statics.field1322 + arg1);
            var73.field3243.method8394(Statics.field1917 + arg0);
            var73.field3243.method8640(arg3);
            var73.field3243.method8440(field725.method3952(82) ? 1 : 0);
            field590.method2719(var73);
        }
        if (arg2 == 46) {
            class92 var74 = field651[arg3];
            if (var74 != null) {
                field605 = arg7;
                field520 = arg8;
                field608 = 2;
                field691 = 0;
                field738 = arg0;
                field739 = arg1;
                class308 var75 = class308.method2768(class306.field3192, field590.field1405);
                var75.field3243.method8393(field725.method3952(82) ? 1 : 0);
                var75.field3243.method8394(arg3);
                field590.method2719(var75);
            }
        }
        if (field728 != 0) {
            field728 = 0;
            method3158(Statics.field1878.method5636(Statics.field2022));
        }
        if (field632) {
            method1030();
        }
    }

    @ObfuscatedName("pw.kh(ILjava/lang/String;B)V")
    public static void method6788(int arg0, String arg1) {
        int var2 = class108.field1362;
        int[] var3 = class108.field1370;
        boolean var4 = false;
        class550 var5 = new class550(arg1, Statics.field1079);
        for (int var6 = 0; var6 < var2; var6++) {
            class92 var7 = field651[var3[var6]];
            if (var7 != null && Statics.field2420 != var7 && var7.field1103 != null && var7.field1103.equals(var5)) {
                if (arg0 == 1) {
                    class308 var8 = class308.method2768(class306.field3162, field590.field1405);
                    var8.field3243.method8394(var3[var6]);
                    var8.field3243.method8441(0);
                    field590.method2719(var8);
                } else if (arg0 == 4) {
                    class308 var9 = class308.method2768(class306.field3218, field590.field1405);
                    var9.field3243.method8442(0);
                    var9.field3243.method8450(var3[var6]);
                    field590.method2719(var9);
                } else if (arg0 == 6) {
                    class308 var10 = class308.method2768(class306.field3190, field590.field1405);
                    var10.field3243.method8442(0);
                    var10.field3243.method8394(var3[var6]);
                    field590.method2719(var10);
                } else if (arg0 == 7) {
                    class308 var11 = class308.method2768(class306.field3150, field590.field1405);
                    var11.field3243.method8640(var3[var6]);
                    var11.field3243.method8442(0);
                    field590.method2719(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class111.method6477(4, "", class364.field4089 + arg1);
        }
    }

    @ObfuscatedName("qb.kk(IIIII)V")
    public static void method7127(int arg0, int arg1, int arg2, int arg3) {
        class344 var4 = Statics.field1878.method5630(arg0, arg1);
        if (var4 != null && var4.field3758 != null) {
            class88 var5 = new class88();
            var5.field1056 = var4;
            var5.field1058 = var4.field3758;
            class71.method3152(var5);
        }
        field655 = arg3;
        field632 = true;
        Statics.field3827 = arg0;
        field535 = arg1;
        Statics.field1431 = arg2;
        method3158(var4);
    }

    @ObfuscatedName("cg.lf(I)V")
    public static void method1030() {
        if (!field632) {
            return;
        }
        class344 var0 = Statics.field1878.method5630(Statics.field3827, field535);
        if (var0 != null && var0.field3759 != null) {
            class88 var1 = new class88();
            var1.field1056 = var0;
            var1.field1058 = var0.field3759;
            class71.method3152(var1);
        }
        field655 = -1;
        field632 = false;
        method3158(var0);
    }

    @ObfuscatedName("ap.lv(IIB)V")
    public static void method100(int arg0, int arg1) {
        class308 var2 = class308.method2768(class306.field3204, field590.field1405);
        var2.field3243.method8465(arg0);
        var2.field3243.method8450(arg1);
        field590.method2719(var2);
    }

    @ObfuscatedName("hd.lw(IIIILjava/lang/String;B)V")
    public static void method3721(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class344 var5 = Statics.field1878.method5630(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3767 != null) {
            class88 var6 = new class88();
            var6.field1056 = var5;
            var6.field1059 = arg0;
            var6.field1063 = arg4;
            var6.field1058 = var5.field3767;
            class71.method3152(var6);
        }
        boolean var7 = true;
        if (var5.field3664 > 0) {
            var7 = method2588(var5);
        }
        if (!var7 || !class345.method2022(method6207(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class308 var8 = class308.method2768(class306.field3202, field590.field1405);
            var8.field3243.method8396(arg1);
            var8.field3243.method8394(arg2);
            var8.field3243.method8394(arg3);
            field590.method2719(var8);
        }
        if (arg0 == 2) {
            class308 var9 = class308.method2768(class306.field3151, field590.field1405);
            var9.field3243.method8396(arg1);
            var9.field3243.method8394(arg2);
            var9.field3243.method8394(arg3);
            field590.method2719(var9);
        }
        if (arg0 == 3) {
            class308 var10 = class308.method2768(class306.field3208, field590.field1405);
            var10.field3243.method8396(arg1);
            var10.field3243.method8394(arg2);
            var10.field3243.method8394(arg3);
            field590.method2719(var10);
        }
        if (arg0 == 4) {
            class308 var11 = class308.method2768(class306.field3157, field590.field1405);
            var11.field3243.method8396(arg1);
            var11.field3243.method8394(arg2);
            var11.field3243.method8394(arg3);
            field590.method2719(var11);
        }
        if (arg0 == 5) {
            class308 var12 = class308.method2768(class306.field3146, field590.field1405);
            var12.field3243.method8396(arg1);
            var12.field3243.method8394(arg2);
            var12.field3243.method8394(arg3);
            field590.method2719(var12);
        }
        if (arg0 == 6) {
            class308 var13 = class308.method2768(class306.field3126, field590.field1405);
            var13.field3243.method8396(arg1);
            var13.field3243.method8394(arg2);
            var13.field3243.method8394(arg3);
            field590.method2719(var13);
        }
        if (arg0 == 7) {
            class308 var14 = class308.method2768(class306.field3141, field590.field1405);
            var14.field3243.method8396(arg1);
            var14.field3243.method8394(arg2);
            var14.field3243.method8394(arg3);
            field590.method2719(var14);
        }
        if (arg0 == 8) {
            class308 var15 = class308.method2768(class306.field3153, field590.field1405);
            var15.field3243.method8396(arg1);
            var15.field3243.method8394(arg2);
            var15.field3243.method8394(arg3);
            field590.method2719(var15);
        }
        if (arg0 == 9) {
            class308 var16 = class308.method2768(class306.field3160, field590.field1405);
            var16.field3243.method8396(arg1);
            var16.field3243.method8394(arg2);
            var16.field3243.method8394(arg3);
            field590.method2719(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class308 var17 = class308.method2768(class306.field3131, field590.field1405);
        var17.field3243.method8396(arg1);
        var17.field3243.method8394(arg2);
        var17.field3243.method8394(arg3);
        field590.method2719(var17);
    }

    @ObfuscatedName("jn.lj(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method4431(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method6413(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("af.le(Ljava/lang/String;Ljava/lang/String;IIIIII)V")
    public static final void method385(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method6413(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("oq.lm(Ljava/lang/String;Ljava/lang/String;IIIIIZS)V")
    public static final void method6413(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field557 || field635 >= 500) {
            return;
        }
        field641[field635] = arg0;
        field642[field635] = arg1;
        field736[field635] = arg2;
        field708[field635] = arg3;
        field636[field635] = arg4;
        field562[field635] = arg5;
        field640[field635] = arg6;
        field643[field635] = arg7;
        field635++;
    }

    @ObfuscatedName("bj.lz(II)Ljava/lang/String;")
    public static String method705(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field642[arg0].length() > 0) {
            return field641[arg0] + class364.field4100 + field642[arg0];
        } else {
            return field641[arg0];
        }
    }

    @ObfuscatedName("ld.lc(IIIIS)V")
    public static final void method5330(int arg0, int arg1, int arg2, int arg3) {
        if (field728 == 0 && !field632) {
            method4431(class364.field4210, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class281.method2325(); var8++) {
            long var9 = class281.field3008[var8];
            if (var6 != var9) {
                var6 = var9;
                long var13 = class281.field3008[var8];
                int var15 = (int) (var13 >>> 0 & 0x7FL);
                int var17 = var15;
                int var18 = class281.method6435(var8);
                int var19 = class281.method2928(var8);
                int var20 = Statics.method4107(class281.field3008[var8]);
                int var21 = var20;
                if (var19 == 2 && Statics.field231.method4825(Statics.field2658, var15, var18, var9) >= 0) {
                    class202 var22 = Statics.method4138(var20);
                    if (var22.field2114 != null) {
                        var22 = var22.method3592();
                    }
                    if (var22 == null) {
                        continue;
                    }
                    class95 var23 = null;
                    for (class95 var24 = (class95) field626.method6579(); var24 != null; var24 = (class95) field626.method6549()) {
                        if (Statics.field2658 == var24.field1165 && var24.field1155 == var17 && var24.field1156 == var18 && var24.field1163 == var21) {
                            var23 = var24;
                            break;
                        }
                    }
                    if (field728 == 1) {
                        method4431(class364.field4148, field768 + " " + class102.field1316 + " " + class102.method3201(65535) + var22.field2086, 1, var21, var17, var18);
                    } else if (!field632) {
                        String[] var25 = var22.field2103;
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if ((var23 == null || var23.method2330(var26)) && var25[var26] != null) {
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
                                    method4431(var25[var26], class102.method3201(65535) + var22.field2086, var27, var21, var17, var18);
                                }
                            }
                        }
                        method4431(class364.field3992, class102.method3201(65535) + var22.field2086, 1002, var22.field2088, var17, var18);
                    } else if ((Statics.field1431 & 0x4) == 4) {
                        method4431(field656, field657 + " " + class102.field1316 + " " + class102.method3201(65535) + var22.field2086, 2, var21, var17, var18);
                    }
                }
                if (var19 == 1) {
                    class101 var28 = field776[var21];
                    if (var28 == null) {
                        continue;
                    }
                    if (var28.field1311.field1927 == 1 && (var28.field1247 & 0x7F) == 64 && (var28.field1173 & 0x7F) == 64) {
                        for (int var29 = 0; var29 < field547; var29++) {
                            class101 var30 = field776[field496[var29]];
                            if (var30 != null && var28 != var30 && var30.field1311.field1927 == 1 && var28.field1247 == var30.field1247 && var28.field1173 == var30.field1173) {
                                method4108(var30, field496[var29], var17, var18);
                            }
                        }
                        int var31 = class108.field1362;
                        int[] var32 = class108.field1370;
                        for (int var33 = 0; var33 < var31; var33++) {
                            class92 var34 = field651[var32[var33]];
                            if (var34 != null && var28.field1247 == var34.field1247 && var28.field1173 == var34.field1173) {
                                method6220(var34, var32[var33], var17, var18);
                            }
                        }
                    }
                    method4108(var28, var21, var17, var18);
                }
                if (var19 == 0) {
                    class92 var35 = field651[var21];
                    if (var35 == null) {
                        continue;
                    }
                    if ((var35.field1247 & 0x7F) == 64 && (var35.field1173 & 0x7F) == 64) {
                        for (int var36 = 0; var36 < field547; var36++) {
                            class101 var37 = field776[field496[var36]];
                            if (var37 != null && var37.field1311.field1927 == 1 && var35.field1247 == var37.field1247 && var35.field1173 == var37.field1173) {
                                method4108(var37, field496[var36], var17, var18);
                            }
                        }
                        int var38 = class108.field1362;
                        int[] var39 = class108.field1370;
                        for (int var40 = 0; var40 < var38; var40++) {
                            class92 var41 = field651[var39[var40]];
                            if (var41 != null && var35 != var41 && var35.field1247 == var41.field1247 && var35.field1173 == var41.field1173) {
                                method6220(var41, var39[var40], var17, var18);
                            }
                        }
                    }
                    if (field624 == var21) {
                        var4 = var9;
                    } else {
                        method6220(var35, var21, var17, var18);
                    }
                }
                if (var19 == 3) {
                    class390 var42 = field697[Statics.field2658][var17][var18];
                    if (var42 != null) {
                        for (class105 var43 = (class105) var42.method6572(); var43 != null; var43 = (class105) var42.method6550()) {
                            class203 var44 = class203.method3907(var43.field1344);
                            if (field728 == 1) {
                                method4431(class364.field4148, field768 + " " + class102.field1316 + " " + class102.method3201(16748608) + var44.field2166, 16, var43.field1344, var17, var18);
                            } else if (!field632) {
                                String[] var45 = var44.field2157;
                                for (int var46 = 4; var46 >= 0; var46--) {
                                    if (var43.method2616(var46)) {
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
                                            method4431(var45[var46], class102.method3201(16748608) + var44.field2166, var47, var43.field1344, var17, var18);
                                        } else if (var46 == 2) {
                                            method4431(class364.field3927, class102.method3201(16748608) + var44.field2166, 20, var43.field1344, var17, var18);
                                        }
                                    }
                                }
                                method4431(class364.field3992, class102.method3201(16748608) + var44.field2166, 1004, var43.field1344, var17, var18);
                            } else if ((Statics.field1431 & 0x1) == 1) {
                                method4431(field656, field657 + " " + class102.field1316 + " " + class102.method3201(16748608) + var44.field2166, 17, var43.field1344, var17, var18);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var48 = (int) (var4 >>> 0 & 0x7FL);
            int var50 = (int) (var4 >>> 7 & 0x7FL);
            class92 var52 = field651[field624];
            method6220(var52, field624, var48, var50);
        }
    }

    @ObfuscatedName("io.lb(Ldn;IIII)V")
    public static final void method4108(class101 arg0, int arg1, int arg2, int arg3) {
        class189 var4 = arg0.field1311;
        if (field635 >= 400) {
            return;
        }
        if (var4.field1958 != null) {
            var4 = var4.method3385();
        }
        if (var4 == null || !var4.field1961 || var4.field1943 && field667 != arg1) {
            return;
        }
        String var5 = arg0.method2533();
        if (var4.field1951 != 0 && arg0.field1248 != 0) {
            int var6 = arg0.field1248 == -1 ? var4.field1951 : arg0.field1248;
            var5 = var5 + method444(var6, Statics.field2420.field1117) + " " + class102.field1319 + class364.field4096 + var6 + class102.field1321;
        }
        if (var4.field1943 && field644) {
            method4431(class364.field3992, class102.method3201(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field728 == 1) {
            method4431(class364.field4148, field768 + " " + class102.field1316 + " " + class102.method3201(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field632) {
            int var7 = var4.field1943 && field644 ? 2000 : 0;
            String[] var8 = var4.field1949;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (arg0.method2532(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase(class364.field4092)) {
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
                        method4431(var8[var9], class102.method3201(16776960) + var5, var10, arg1, arg2, arg3);
                    }
                }
            }
            if (var8 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (arg0.method2532(var11) && var8[var11] != null && var8[var11].equalsIgnoreCase(class364.field4092)) {
                        short var12 = 0;
                        if (field653 != class104.field1337) {
                            if (field653 == class104.field1334 || field653 == class104.field1336 && var4.field1951 > Statics.field2420.field1117) {
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
                            method4431(var8[var11], class102.method3201(16776960) + var5, var13, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field1943 || !field644) {
                method4431(class364.field3992, class102.method3201(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1431 & 0x2) == 2) {
            method4431(field656, field657 + " " + class102.field1316 + " " + class102.method3201(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("or.lr(Lds;IIIB)V")
    public static final void method6220(class92 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2420 == arg0 || field635 >= 400) {
            return;
        }
        String var4;
        if (arg0.field1102 == 0) {
            var4 = arg0.field1101[0] + arg0.field1103 + arg0.field1101[1] + method444(arg0.field1117, Statics.field2420.field1117) + " " + class102.field1319 + class364.field4096 + arg0.field1117 + class102.field1321 + arg0.field1101[2];
        } else {
            var4 = arg0.field1101[0] + arg0.field1103 + arg0.field1101[1] + " " + class102.field1319 + class364.field4097 + arg0.field1102 + class102.field1321 + arg0.field1101[2];
        }
        if (field728 == 1) {
            method4431(class364.field4148, field768 + " " + class102.field1316 + " " + class102.method3201(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field632) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field621[var5] != null) {
                    short var6 = 0;
                    if (field621[var5].equalsIgnoreCase(class364.field4092)) {
                        if (field515 == class104.field1337) {
                            continue;
                        }
                        if (field515 == class104.field1334 || field515 == class104.field1336 && arg0.field1117 > Statics.field2420.field1117) {
                            var6 = 2000;
                        }
                        if (Statics.field2420.field1116 == 0 || arg0.field1116 == 0) {
                            if (field515 == class104.field1335 && arg0.method2275()) {
                                var6 = 2000;
                            }
                        } else if (Statics.field2420.field1116 == arg0.field1116) {
                            var6 = 2000;
                        } else {
                            var6 = 0;
                        }
                    } else if (field622[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field620[var5] + var6;
                    method4431(field621[var5], class102.method3201(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1431 & 0x8) == 8) {
            method4431(field656, field657 + " " + class102.field1316 + " " + class102.method3201(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field635; var9++) {
            if (field736[var9] == 23) {
                field642[var9] = class102.method3201(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bl.ls(III)Ljava/lang/String;")
    public static final String method444(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class102.method3201(16711680);
        } else if (var2 < -6) {
            return class102.method3201(16723968);
        } else if (var2 < -3) {
            return class102.method3201(16740352);
        } else if (var2 < 0) {
            return class102.method3201(16756736);
        } else if (var2 > 9) {
            return class102.method3201(65280);
        } else if (var2 > 6) {
            return class102.method3201(4259584);
        } else if (var2 > 3) {
            return class102.method3201(8453888);
        } else if (var2 > 0) {
            return class102.method3201(12648192);
        } else {
            return class102.method3201(16776960);
        }
    }

    @ObfuscatedName("ag.ln(IIIIIIIII)V")
    public static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field1878.method5633(arg0)) {
            Statics.field1454 = null;
            method837(Statics.field1878.field3569[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1454 != null) {
                method837(Statics.field1454, -1412584499, arg1, arg2, arg3, arg4, Statics.field2041, Statics.field1168, arg7);
                Statics.field1454 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field709[var8] = true;
            }
        } else {
            field709[arg7] = true;
        }
    }

    @ObfuscatedName("bz.lk([Lnn;IIIIIIIII)V")
    public static final void method837(class344[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class537.method8755(arg2, arg3, arg4, arg5);
        class267.method4674();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class344 var10 = arg0[var9];
            if (var10 != null && (var10.field3725 == arg1 || arg1 == -1412584499 && field650 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field712[field707] = var10.field3761 + arg6;
                    field733[field707] = var10.field3674 + arg7;
                    field692[field707] = var10.field3675;
                    field715[field707] = var10.field3676;
                    var11 = ++field707 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3804 = var11;
                var10.field3805 = field500;
                if (!var10.field3749 || !method108(var10)) {
                    if (var10.field3664 > 0) {
                        method6175(var10);
                    }
                    int var12 = var10.field3761 + arg6;
                    int var13 = var10.field3674 + arg7;
                    int var14 = var10.field3691;
                    if (field650 == var10) {
                        if (arg1 != -1412584499 && !var10.field3745) {
                            Statics.field1454 = arg0;
                            Statics.field2041 = arg6;
                            Statics.field1168 = arg7;
                            continue;
                        }
                        if (field681 && field675) {
                            int var15 = class36.field217;
                            int var16 = class36.field218;
                            int var17 = var15 - field672;
                            int var18 = var16 - field548;
                            if (var17 < field555) {
                                var17 = field555;
                            }
                            if (var10.field3675 + var17 > field555 + field581.field3675) {
                                var17 = field555 + field581.field3675 - var10.field3675;
                            }
                            if (var18 < field677) {
                                var18 = field677;
                            }
                            if (var10.field3676 + var18 > field677 + field581.field3676) {
                                var18 = field677 + field581.field3676 - var10.field3676;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3745) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3714 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3675 + var12;
                        int var22 = var10.field3676 + var13;
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
                        int var29 = var10.field3675 + var12;
                        int var30 = var10.field3676 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3749 || var25 < var27 && var26 < var28) {
                        if (var10.field3664 != 0) {
                            if (var10.field3664 == 1336) {
                                if (Statics.field2450.method2480()) {
                                    var13 += 15;
                                    Statics.field2650.method7013("Fps:" + field201, var10.field3675 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field488) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2650.method7013("Mem:" + var32 + "k", var10.field3675 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3664 == 1337) {
                                field647 = var12;
                                field648 = var13;
                                method5698(var12, var13, var10.field3675, var10.field3676);
                                field709[var10.field3804] = true;
                                class537.method8755(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3664 == 1338) {
                                method700(var10, var12, var13, var11);
                                class537.method8755(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3664 == 1339) {
                                method3918(var10, var12, var13, var11);
                                class537.method8755(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3664 == 1400) {
                                Statics.field1919.method8007(var12, var13, var10.field3675, var10.field3676, field500);
                            }
                            if (var10.field3664 == 1401) {
                                Statics.field1919.method7918(var12, var13, var10.field3675, var10.field3676);
                            }
                            if (var10.field3664 == 1402) {
                                Statics.field1894.method2377(var12, field500);
                            }
                        }
                        if (var10.field3714 == 0) {
                            if (!var10.field3749 && method108(var10) && Statics.field856 != var10) {
                                continue;
                            }
                            if (!var10.field3749) {
                                if (var10.field3738 > var10.field3652 - var10.field3676) {
                                    var10.field3738 = var10.field3652 - var10.field3676;
                                }
                                if (var10.field3738 < 0) {
                                    var10.field3738 = 0;
                                }
                            }
                            method837(arg0, var10.field3659, var25, var26, var27, var28, var12 - var10.field3681, var13 - var10.field3738, var11);
                            if (var10.field3797 != null) {
                                method837(var10.field3797, var10.field3659, var25, var26, var27, var28, var12 - var10.field3681, var13 - var10.field3738, var11);
                            }
                            class87 var34 = (class87) field659.method8154((long) var10.field3659);
                            if (var34 != null) {
                                method321(var34.field1052, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class537.method8755(arg2, arg3, arg4, arg5);
                            class267.method4674();
                        } else if (var10.field3714 == 11) {
                            if (method108(var10) && Statics.field856 != var10) {
                                continue;
                            }
                            if (var10.field3797 != null) {
                                method837(var10.field3797, var10.field3659, var25, var26, var27, var28, var12 - var10.field3681, var13 - var10.field3738, var11);
                            }
                            class537.method8755(arg2, arg3, arg4, arg5);
                            class267.method4674();
                        }
                        if (field718 || field516[var11] || field716 > 1) {
                            if (var10.field3714 == 0 && !var10.field3749 && var10.field3652 > var10.field3676) {
                                method2691(var10.field3675 + var12, var13, var10.field3738, var10.field3676, var10.field3652);
                            }
                            if (var10.field3714 != 1) {
                                if (var10.field3714 == 3) {
                                    int var35;
                                    if (method5635(var10)) {
                                        var35 = var10.field3686;
                                        if (Statics.field856 == var10 && var10.field3688 != 0) {
                                            var35 = var10.field3688;
                                        }
                                    } else {
                                        var35 = var10.field3811;
                                        if (Statics.field856 == var10 && var10.field3687 != 0) {
                                            var35 = var10.field3687;
                                        }
                                    }
                                    if (var10.field3710) {
                                        switch(var10.field3690.field5222) {
                                            case 1:
                                                class537.method8764(var12, var13, var10.field3675, var10.field3676, var10.field3811, var10.field3686);
                                                break;
                                            case 2:
                                                class537.method8765(var12, var13, var10.field3675, var10.field3676, var10.field3811, var10.field3686, 255 - (var10.field3691 & 0xFF), 255 - (var10.field3704 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class537.method8837(var12, var13, var10.field3675, var10.field3676, var35);
                                                } else {
                                                    class537.method8762(var12, var13, var10.field3675, var10.field3676, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class537.method8767(var12, var13, var10.field3675, var10.field3676, var35);
                                    } else {
                                        class537.method8763(var12, var13, var10.field3675, var10.field3676, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3714 == 4) {
                                    class406 var36 = var10.method6017(Statics.field1878);
                                    if (var36 != null) {
                                        String var37 = var10.field3723;
                                        int var38;
                                        if (method5635(var10)) {
                                            var38 = var10.field3686;
                                            if (Statics.field856 == var10 && var10.field3688 != 0) {
                                                var38 = var10.field3688;
                                            }
                                            if (var10.field3724.length() > 0) {
                                                var37 = var10.field3724;
                                            }
                                        } else {
                                            var38 = var10.field3811;
                                            if (Statics.field856 == var10 && var10.field3687 != 0) {
                                                var38 = var10.field3687;
                                            }
                                        }
                                        if (var10.field3749 && var10.field3793 != -1) {
                                            class203 var39 = class203.method3907(var10.field3793);
                                            var37 = var39.field2166;
                                            if (var37 == null) {
                                                var37 = class364.field4153;
                                            }
                                            if ((var39.field2151 == 1 || var10.field3794 != 1) && var10.field3794 != -1) {
                                                var37 = class102.method3201(16748608) + var37 + class102.field1323 + " " + 'x' + method6200(var10.field3794);
                                            }
                                        }
                                        if (field663 == var10) {
                                            var37 = class364.field4129;
                                            var38 = var10.field3811;
                                        }
                                        if (!var10.field3749) {
                                            var37 = method3549(var37, var10);
                                        }
                                        var36.method6988(var37, var12, var13, var10.field3675, var10.field3676, var38, var10.field3782 ? 0 : -1, class479.method7812(var10.field3691), var10.field3726, var10.field3727, var10.field3796);
                                    } else if (class344.field3657) {
                                        method3158(var10);
                                    }
                                } else if (var10.field3714 == 5) {
                                    if (var10.field3749) {
                                        class541 var41;
                                        if (var10.field3793 == -1) {
                                            var41 = var10.method6012(Statics.field1878, false, Statics.field423);
                                        } else {
                                            var41 = class203.method45(var10.field3793, var10.field3794, var10.field3700, var10.field3701, var10.field3721, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5240;
                                            int var43 = var41.field5241;
                                            if (var10.field3699) {
                                                class537.method8756(var12, var13, var10.field3675 + var12, var10.field3676 + var13);
                                                int var44 = (var10.field3675 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3676 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3698 != 0) {
                                                            var41.method8904(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3698, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method8885(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method8891(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class537.method8755(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3675 * 4096 / var42;
                                                if (var10.field3698 != 0) {
                                                    var41.method8904(var10.field3675 / 2 + var12, var10.field3676 / 2 + var13, var10.field3698, var48);
                                                } else if (var14 != 0) {
                                                    var41.method8893(var12, var13, var10.field3675, var10.field3676, 256 - (var14 & 0xFF));
                                                } else if (var10.field3675 == var42 && var10.field3676 == var43) {
                                                    var41.method8885(var12, var13);
                                                } else {
                                                    var41.method8887(var12, var13, var10.field3675, var10.field3676);
                                                }
                                            }
                                        } else if (class344.field3657) {
                                            method3158(var10);
                                        }
                                    } else {
                                        class541 var40 = var10.method6012(Statics.field1878, method5635(var10), Statics.field423);
                                        if (var40 != null) {
                                            var40.method8885(var12, var13);
                                        } else if (class344.field3657) {
                                            method3158(var10);
                                        }
                                    }
                                } else if (var10.field3714 == 6) {
                                    boolean var49 = method5635(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3709;
                                    } else {
                                        var50 = var10.field3708;
                                    }
                                    class280 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3793 != -1) {
                                        class203 var53 = class203.method3907(var10.field3793);
                                        if (var53 != null) {
                                            class203 var54 = var53.method3642(var10.field3794);
                                            var51 = var54.method3641(1);
                                            if (var51 == null) {
                                                method3158(var10);
                                            } else {
                                                var51.method5033();
                                                var52 = var51.field2874 / 2;
                                            }
                                        }
                                    } else if (var10.field3712 == 5) {
                                        if (var10.field3689 == 0) {
                                            var51 = field774.method5671((class205) null, -1, (class205) null, -1);
                                        } else {
                                            var51 = Statics.field2420.method2019();
                                        }
                                    } else if (var10.field3712 == 7) {
                                        var51 = var10.field3718.method5671((class205) null, -1, class205.method2129(Statics.field2420.field1178), Statics.field2420.field1214);
                                    } else {
                                        class189 var55 = null;
                                        class188 var56 = null;
                                        if (var10.field3712 == 6) {
                                            int var57 = var10.field3689;
                                            if (var57 >= 0 && var57 < field776.length) {
                                                class101 var58 = field776[var57];
                                                if (var58 != null) {
                                                    var55 = var58.field1311;
                                                    var56 = var58.method2542();
                                                }
                                            }
                                        }
                                        class205 var59 = null;
                                        int var60 = -1;
                                        if (var50 != -1) {
                                            var59 = class205.method2129(var50);
                                            var60 = var10.field3692;
                                        }
                                        var51 = var10.method6018(Statics.field1878, var59, var60, var49, Statics.field2420.field1100, var55, var56);
                                        if (var51 == null && class344.field3657) {
                                            method3158(var10);
                                        }
                                    }
                                    class267.method4677(var10.field3675 / 2 + var12, var10.field3676 / 2 + var13);
                                    int var61 = var10.field3742 * class267.field2771[var10.field3651] >> 16;
                                    int var62 = var10.field3742 * class267.field2769[var10.field3651] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3749) {
                                            var51.method5033();
                                            if (var10.field3684) {
                                                var51.method5052(0, var10.field3713, var10.field3739, var10.field3651, var10.field3719, var10.field3711 + var52 + var61, var10.field3711 + var62, var10.field3742);
                                            } else {
                                                var51.method5024(0, var10.field3713, var10.field3739, var10.field3651, var10.field3719, var10.field3711 + var52 + var61, var10.field3711 + var62);
                                            }
                                        } else {
                                            var51.method5024(0, var10.field3713, 0, var10.field3651, 0, var61, var62);
                                        }
                                    }
                                    class267.method4676();
                                } else {
                                    if (var10.field3714 == 8 && Statics.field4540 == var10 && field769 == field649) {
                                        int var63 = 0;
                                        int var64 = 0;
                                        class406 var65 = Statics.field2650;
                                        String var66 = var10.field3723;
                                        String var67 = method3549(var66, var10);
                                        while (var67.length() > 0) {
                                            int var68 = var67.indexOf(class102.field1317);
                                            String var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = "";
                                            } else {
                                                var69 = var67.substring(0, var68);
                                                var67 = var67.substring(var68 + 4);
                                            }
                                            int var70 = var65.method7018(var69);
                                            if (var70 > var63) {
                                                var63 = var70;
                                            }
                                            var64 += var65.field4520 + 1;
                                        }
                                        var63 += 6;
                                        var64 += 7;
                                        int var71 = var10.field3675 + var12 - 5 - var63;
                                        int var72 = var10.field3676 + var13 + 5;
                                        if (var71 < var12 + 5) {
                                            var71 = var12 + 5;
                                        }
                                        if (var63 + var71 > arg4) {
                                            var71 = arg4 - var63;
                                        }
                                        if (var64 + var72 > arg5) {
                                            var72 = arg5 - var64;
                                        }
                                        class537.method8837(var71, var72, var63, var64, 16777120);
                                        class537.method8767(var71, var72, var63, var64, 0);
                                        String var73 = var10.field3723;
                                        int var74 = var65.field4520 + var72 + 2;
                                        String var75 = method3549(var73, var10);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf(class102.field1317);
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            var65.method6981(var77, var71 + 3, var74, 0, -1);
                                            var74 += var65.field4520 + 1;
                                        }
                                    }
                                    if (var10.field3714 == 9) {
                                        int var78;
                                        int var79;
                                        int var80;
                                        int var81;
                                        if (var10.field3694) {
                                            var78 = var12;
                                            var79 = var10.field3676 + var13;
                                            var80 = var10.field3675 + var12;
                                            var81 = var13;
                                        } else {
                                            var78 = var12;
                                            var79 = var13;
                                            var80 = var10.field3675 + var12;
                                            var81 = var10.field3676 + var13;
                                        }
                                        if (var10.field3693 == 1) {
                                            class537.method8793(var78, var79, var80, var81, var10.field3811);
                                        } else {
                                            method2771(var78, var79, var80, var81, var10.field3811, var10.field3693);
                                        }
                                    } else if (var10.field3714 == 12) {
                                        class342 var82 = var10.method6039();
                                        class337 var83 = var10.method6075();
                                        if (var82 != null && var83 != null && var82.method5745()) {
                                            class406 var84 = var10.method6017(Statics.field1878);
                                            if (var84 != null) {
                                                field574.method9059(var12, var13, var10.field3675, var10.field3676, var82.method5769(), var82.method5770(), var82.method5766(), var82.method5767(), var82.method5765());
                                                int var85 = var10.field3782 ? var10.field3701 : -1;
                                                if (!var82.method5991() && var82.method5967().method6836()) {
                                                    field574.method9049(var83.field3580, var85, var83.field3581, var83.field3579);
                                                    field574.method9050(var82.method5995(), var84);
                                                } else {
                                                    field574.method9049(var10.field3811, var85, var83.field3581, var83.field3579);
                                                    field574.method9050(var82.method5967(), var84);
                                                }
                                                class537.method8755(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("ea.ll(IIIIIIB)V")
    public static final void method2771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class537.field5214;
        int var18 = arg1 - class537.field5212;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class267.method4678(var19, var20, var21);
        class267.method4680(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class267.method4678(var19, var21, var22);
        class267.method4680(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("hz.la(Ljava/lang/String;Lnn;I)Ljava/lang/String;")
    public static String method3549(String arg0, class344 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2791(arg1, var2 - 1);
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

    @ObfuscatedName("nk.lx(II)Ljava/lang/String;")
    public static final String method6200(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class102.field1324 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class102.method3201(65408) + var1.substring(0, var1.length() - 8) + class364.field4048 + " " + class102.field1319 + var1 + class102.field1321 + class102.field1323;
        } else if (var1.length() > 6) {
            return " " + class102.method3201(16777215) + var1.substring(0, var1.length() - 4) + class364.field4103 + " " + class102.field1319 + var1 + class102.field1321 + class102.field1323;
        } else {
            return " " + class102.method3201(16776960) + var1 + class102.field1323;
        }
    }

    @ObfuscatedName("client.lp(ZI)V")
    public final void method1205(boolean arg0) {
        method3435(field505, Statics.field4410, Statics.field321, arg0);
    }

    @ObfuscatedName("client.lh(Lnn;I)V")
    public void method1434(class344 arg0) {
        class344 var2 = arg0.field3725 == -1 ? null : Statics.field1878.method5636(arg0.field3725);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field4410;
            var4 = Statics.field321;
        } else {
            var3 = var2.field3675;
            var4 = var2.field3676;
        }
        method4977(arg0, var3, var4, false);
        method3898(arg0, var3, var4);
    }

    @ObfuscatedName("fa.li([Lnn;Lnn;ZI)V")
    public static void method2981(class344[] arg0, class344 arg1, boolean arg2) {
        int var3 = arg1.field3683 == 0 ? arg1.field3675 : arg1.field3683;
        int var4 = arg1.field3652 == 0 ? arg1.field3676 : arg1.field3652;
        method2772(arg0, arg1.field3659, var3, var4, arg2);
        if (arg1.field3797 != null) {
            method2772(arg1.field3797, arg1.field3659, var3, var4, arg2);
        }
        class87 var5 = (class87) field659.method8154((long) arg1.field3659);
        if (var5 != null) {
            method3435(var5.field1052, var3, var4, arg2);
        }
        if (arg1.field3664 == 1337) {
        }
    }

    @ObfuscatedName("hw.lq(IIIZB)V")
    public static final void method3435(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.field1878.method5633(arg0)) {
            method2772(Statics.field1878.field3569[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ea.ly([Lnn;IIIZB)V")
    public static void method2772(class344[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class344 var6 = arg0[var5];
            if (var6 != null && var6.field3725 == arg1) {
                method4977(var6, arg2, arg3, arg4);
                method3898(var6, arg2, arg3);
                if (var6.field3681 > var6.field3683 - var6.field3675) {
                    var6.field3681 = var6.field3683 - var6.field3675;
                }
                if (var6.field3681 < 0) {
                    var6.field3681 = 0;
                }
                if (var6.field3738 > var6.field3652 - var6.field3676) {
                    var6.field3738 = var6.field3652 - var6.field3676;
                }
                if (var6.field3738 < 0) {
                    var6.field3738 = 0;
                }
                if (var6.field3714 == 0) {
                    method2981(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("kt.ld(Lnn;IIZB)V")
    public static void method4977(class344 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3675;
        int var5 = arg0.field3676;
        if (arg0.field3667 == 0) {
            arg0.field3675 = arg0.field3671;
        } else if (arg0.field3667 == 1) {
            arg0.field3675 = arg1 - arg0.field3671;
        } else if (arg0.field3667 == 2) {
            arg0.field3675 = arg0.field3671 * arg1 >> 14;
        }
        if (arg0.field3668 == 0) {
            arg0.field3676 = arg0.field3672;
        } else if (arg0.field3668 == 1) {
            arg0.field3676 = arg2 - arg0.field3672;
        } else if (arg0.field3668 == 2) {
            arg0.field3676 = arg0.field3672 * arg2 >> 14;
        }
        if (arg0.field3667 == 4) {
            arg0.field3675 = arg0.field3771 * arg0.field3676 / arg0.field3678;
        }
        if (arg0.field3668 == 4) {
            arg0.field3676 = arg0.field3678 * arg0.field3675 / arg0.field3771;
        }
        if (arg0.field3664 == 1337) {
            field669 = arg0;
        }
        if (arg0.field3714 == 12) {
            arg0.method6039().method5717(arg0.field3675, arg0.field3676);
        }
        if (arg3 && arg0.field3707 != null && (arg0.field3675 != var4 || arg0.field3676 != var5)) {
            class88 var6 = new class88();
            var6.field1056 = arg0;
            var6.field1058 = arg0.field3707;
            field702.method6547(var6);
        }
    }

    @ObfuscatedName("if.lu(Lnn;IIB)V")
    public static void method3898(class344 arg0, int arg1, int arg2) {
        if (arg0.field3665 == 0) {
            arg0.field3761 = arg0.field3803;
        } else if (arg0.field3665 == 1) {
            arg0.field3761 = (arg1 - arg0.field3675) / 2 + arg0.field3803;
        } else if (arg0.field3665 == 2) {
            arg0.field3761 = arg1 - arg0.field3675 - arg0.field3803;
        } else if (arg0.field3665 == 3) {
            arg0.field3761 = arg0.field3803 * arg1 >> 14;
        } else if (arg0.field3665 == 4) {
            arg0.field3761 = (arg0.field3803 * arg1 >> 14) + (arg1 - arg0.field3675) / 2;
        } else {
            arg0.field3761 = arg1 - arg0.field3675 - (arg0.field3803 * arg1 >> 14);
        }
        if (arg0.field3666 == 0) {
            arg0.field3674 = arg0.field3670;
        } else if (arg0.field3666 == 1) {
            arg0.field3674 = (arg2 - arg0.field3676) / 2 + arg0.field3670;
        } else if (arg0.field3666 == 2) {
            arg0.field3674 = arg2 - arg0.field3676 - arg0.field3670;
        } else if (arg0.field3666 == 3) {
            arg0.field3674 = arg0.field3670 * arg2 >> 14;
        } else if (arg0.field3666 == 4) {
            arg0.field3674 = (arg0.field3670 * arg2 >> 14) + (arg2 - arg0.field3676) / 2;
        } else {
            arg0.field3674 = arg2 - arg0.field3676 - (arg0.field3670 * arg2 >> 14);
        }
    }

    @ObfuscatedName("em.lg(IIIIII)V")
    public static final void method2691(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field156[0].method8853(arg0, arg1);
        Statics.field156[1].method8853(arg0, arg1 + arg3 - 16);
        class537.method8837(arg0, arg1 + 16, 16, arg3 - 32, field566);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class537.method8837(arg0, arg1 + 16 + var6, 16, var5, field671);
        class537.method8839(arg0, arg1 + 16 + var6, var5, field569);
        class537.method8839(arg0 + 1, arg1 + 16 + var6, var5, field569);
        class537.method8769(arg0, arg1 + 16 + var6, 16, field569);
        class537.method8769(arg0, arg1 + 17 + var6, 16, field569);
        class537.method8839(arg0 + 15, arg1 + 16 + var6, var5, field568);
        class537.method8839(arg0 + 14, arg1 + 17 + var6, var5 - 1, field568);
        class537.method8769(arg0, arg1 + 15 + var6 + var5, 16, field568);
        class537.method8769(arg0 + 1, arg1 + 14 + var6 + var5, 15, field568);
    }

    @ObfuscatedName("mr.lt(Lnn;B)Z")
    public static final boolean method5635(class344 arg0) {
        if (arg0.field3722 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3722.length; var1++) {
            int var2 = method2791(arg0, var1);
            int var3 = arg0.field3809[var1];
            if (arg0.field3722[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3722[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3722[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("en.mb(Lnn;II)I")
    public static final int method2791(class344 arg0, int arg1) {
        if (arg0.field3648 == null || arg1 >= arg0.field3648.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3648[arg1];
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
                    var7 = field629[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field630[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field631[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class344 var11 = Statics.field1878.method5636(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class203.method3907(var12).field2160 || field487)) {
                        for (int var13 = 0; var13 < var11.field3791.length; var13++) {
                            if (var12 + 1 == var11.field3791[var13]) {
                                var7 += var11.field3792[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class333.field3554[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class354.field3871[field630[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class333.field3554[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2420.field1117;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class354.field3870[var14]) {
                            var7 += field630[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class344 var17 = Statics.field1878.method5636(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class203.method3907(var18).field2160 || field487)) {
                        for (int var19 = 0; var19 < var17.field3791.length; var19++) {
                            if (var18 + 1 == var17.field3791[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field664;
                }
                if (var6 == 12) {
                    var7 = field665;
                }
                if (var6 == 13) {
                    int var20 = class333.field3554[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class333.method2521(var22);
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
                    var7 = (Statics.field2420.field1247 >> 7) + Statics.field1917;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2420.field1173 >> 7) + Statics.field1322;
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

    @ObfuscatedName("dw.md(Lnn;I)V")
    public static final void method2327(class344 arg0) {
        if (arg0.field3663 == 1) {
            String var1 = arg0.field3790;
            int var2 = arg0.field3659;
            int var3 = arg0.field3793;
            method6413(var1, "", 24, 0, 0, var2, var3, false);
        }
        if (arg0.field3663 == 2 && !field632) {
            String var4 = method2259(arg0);
            if (var4 != null) {
                method385(var4, class102.method3201(65280) + arg0.field3789, 25, 0, -1, arg0.field3659, arg0.field3793);
            }
        }
        if (arg0.field3663 == 3) {
            method4431(class364.field4201, "", 26, 0, 0, arg0.field3659);
        }
        if (arg0.field3663 == 4) {
            method4431(arg0.field3790, "", 28, 0, 0, arg0.field3659);
        }
        if (arg0.field3663 == 5) {
            method4431(arg0.field3790, "", 29, 0, 0, arg0.field3659);
        }
        if (arg0.field3663 == 6 && field663 == null) {
            method4431(arg0.field3790, "", 30, 0, -1, arg0.field3659);
        }
        if (!arg0.field3749) {
            return;
        }
        if (field632) {
            int var5 = method6207(arg0);
            boolean var6 = (var5 >> 21 & 0x1) != 0;
            if (var6 && (Statics.field1431 & 0x20) == 32) {
                String var7 = field656;
                String var8 = field657 + " " + class102.field1316 + " " + arg0.field3740;
                int var9 = arg0.field3660;
                int var10 = arg0.field3659;
                int var11 = arg0.field3793;
                method6413(var7, var8, 58, 0, var9, var10, var11, false);
            }
            return;
        }
        for (int var12 = 9; var12 >= 5; var12--) {
            String var13;
            if (!class345.method2022(method6207(arg0), var12) && arg0.field3767 == null) {
                var13 = null;
            } else if (arg0.field3741 == null || arg0.field3741.length <= var12 || arg0.field3741[var12] == null || arg0.field3741[var12].trim().length() == 0) {
                var13 = null;
            } else {
                var13 = arg0.field3741[var12];
            }
            if (var13 != null) {
                method385(var13, arg0.field3740, 1007, var12 + 1, arg0.field3660, arg0.field3659, arg0.field3793);
            }
        }
        String var15 = method2259(arg0);
        if (var15 != null) {
            String var16 = arg0.field3740;
            int var17 = arg0.field3660;
            int var18 = arg0.field3659;
            int var19 = arg0.field3793;
            method6413(var15, var16, 25, 0, var17, var18, var19, false);
        }
        for (int var20 = 4; var20 >= 0; var20--) {
            String var21;
            if (!class345.method2022(method6207(arg0), var20) && arg0.field3767 == null) {
                var21 = null;
            } else if (arg0.field3741 == null || arg0.field3741.length <= var20 || arg0.field3741[var20] == null || arg0.field3741[var20].trim().length() == 0) {
                var21 = null;
            } else {
                var21 = arg0.field3741[var20];
            }
            if (var21 != null) {
                method6413(var21, arg0.field3740, 57, var20 + 1, arg0.field3660, arg0.field3659, arg0.field3793, arg0.field3775);
            }
        }
        int var23 = method6207(arg0);
        boolean var24 = (var23 & 0x1) != 0;
        if (var24) {
            method4431(class364.field3932, "", 30, 0, arg0.field3660, arg0.field3659);
        }
    }

    @ObfuscatedName("qs.my(ZB)V")
    public static void method7348(boolean arg0) {
        field645 = arg0;
    }

    @ObfuscatedName("nr.mk(B)Z")
    public static boolean method6212() {
        return field645;
    }

    @ObfuscatedName("pv.mi(IIIIIIIB)V")
    public static final void method6900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field1878.method5633(arg0)) {
            method4452(Statics.field1878.field3569[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("jm.mn([Lnn;IIIIIIIB)V")
    public static final void method4452(class344[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class344 var9 = arg0[var8];
            if (var9 != null && var9.field3725 == arg1 && (var9.method6059() || method6207(var9) != 0 || field581 == var9)) {
                if (var9.field3749) {
                    if (method108(var9)) {
                        continue;
                    }
                } else if (var9.field3714 == 0 && Statics.field856 != var9 && method108(var9)) {
                    continue;
                }
                if (var9.field3714 == 11) {
                    if (var9.method6026(Statics.field1878, Statics.field423)) {
                        if (var9.method6033()) {
                            method3158(var9);
                            method2981(var9.field3797, var9, true);
                        }
                        if (var9.field3784 != null) {
                            class88 var10 = new class88();
                            var10.field1056 = var9;
                            var10.field1058 = var9.field3784;
                            field702.method6547(var10);
                        }
                    }
                } else if (var9.field3714 == 12 && var9.method6044(Statics.field1878)) {
                    method3158(var9);
                }
                int var11 = var9.field3761 + arg6;
                int var12 = var9.field3674 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3714 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3675 + var11;
                    int var16 = var9.field3676 + var12;
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
                    int var23 = var9.field3675 + var11;
                    int var24 = var9.field3676 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field650 == var9) {
                    field517 = true;
                    field534 = var11;
                    field680 = var12;
                }
                boolean var25 = false;
                if (var9.field3735) {
                    switch(field660) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3659 >>> 16 == field661) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field661 == var9.field3659) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3749 || var19 < var21 && var20 < var22) {
                    if (var9.field3749) {
                        if (var9.field3807) {
                            if (class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                                for (class88 var26 = (class88) field702.method6579(); var26 != null; var26 = (class88) field702.method6549()) {
                                    if (var26.field1055) {
                                        var26.method7828();
                                        var26.field1056.field3798 = false;
                                    }
                                }
                                method4658();
                                if (Statics.field1662 == 0) {
                                    field650 = null;
                                    field581 = null;
                                }
                                if (!field557) {
                                    Statics.method2852();
                                }
                            }
                        } else if (var9.field3808 && class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                            for (class88 var27 = (class88) field702.method6579(); var27 != null; var27 = (class88) field702.method6549()) {
                                if (var27.field1055 && var27.field1056.field3769 == var27.field1058) {
                                    var27.method7828();
                                }
                            }
                        }
                    }
                    int var28 = class36.field217;
                    int var29 = class36.field218;
                    if (class36.field229 != 0) {
                        var28 = class36.field214;
                        var29 = class36.field210;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3664 == 1337) {
                        if (!field499 && !field557 && var30) {
                            method5330(var28, var29, var19, var20);
                        }
                    } else if (var9.field3664 == 1338) {
                        method285(var9, var11, var12);
                    } else {
                        if (var9.field3664 == 1400) {
                            Statics.field1919.method8011(class36.field217, class36.field218, var30, var11, var12, var9.field3675, var9.field3676);
                        }
                        if (!field557 && var30) {
                            if (var9.field3664 == 1400) {
                                Statics.field1919.method7949(var11, var12, var9.field3675, var9.field3676, var28, var29);
                            } else {
                                method2327(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3736.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3736[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3736[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3806 != null) {
                                            var35 = field725.method3952(var9.field3736[var31][var34]);
                                        }
                                        if (method3173(var9.field3736[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3806 != null && var9.field3806[var31] > field500) {
                                                break;
                                            }
                                            byte var36 = var9.field3705[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field725.method3952(86) && !field725.method3952(82) && !field725.method3952(81)) && ((var36 & 0x2) == 0 || field725.method3952(86)) && ((var36 & 0x1) == 0 || field725.method3952(82)) && ((var36 & 0x4) == 0 || field725.method3952(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method3721(var31 + 1, var9.field3659, var9.field3660, var9.field3793, "");
                                    } else if (var31 == 10) {
                                        method1030();
                                        method7127(var9.field3659, var9.field3660, class345.method4103(method6207(var9)), var9.field3793);
                                        field656 = method2259(var9);
                                        if (field656 == null) {
                                            field656 = class364.field4153;
                                        }
                                        field657 = var9.field3740 + class102.method3201(16777215);
                                    }
                                    int var37 = var9.field3673[var31];
                                    if (var9.field3806 == null) {
                                        var9.field3806 = new int[var9.field3736.length];
                                    }
                                    if (var9.field3757 == null) {
                                        var9.field3757 = new int[var9.field3736.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3806[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3806[var31] == 0) {
                                        var9.field3806[var31] = field500 + var37 + var9.field3757[var31];
                                    } else {
                                        var9.field3806[var31] = field500 + var37;
                                    }
                                }
                                if (!var32 && var9.field3806 != null) {
                                    var9.field3806[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3749) {
                            boolean var38;
                            if (class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field208 == 1 || !Statics.field96 && class36.field208 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field229 == 1 || !Statics.field96 && class36.field229 == 4) && class36.field214 >= var19 && class36.field210 >= var20 && class36.field214 < var21 && class36.field210 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method3372(var9, class36.field214 - var11, class36.field210 - var12);
                            }
                            if (var9.method6122()) {
                                if (var40) {
                                    field683.method6547(new class223(0, class36.field217 - var11, class36.field218 - var12, var9));
                                }
                                if (var39) {
                                    field683.method6547(new class223(1, class36.field217 - var11, class36.field218 - var12, var9));
                                }
                            }
                            if (var9.field3664 == 1400) {
                                Statics.field1919.method7899(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field650 != null && field650 != var9 && var38 && class345.method163(method6207(var9))) {
                                field594 = var9;
                            }
                            if (field581 == var9) {
                                field675 = true;
                                field555 = var11;
                                field677 = var12;
                            }
                            if (var9.field3747) {
                                if (var38 && field700 != 0 && var9.field3769 != null) {
                                    class88 var41 = new class88();
                                    var41.field1055 = true;
                                    var41.field1056 = var9;
                                    var41.field1062 = field700;
                                    var41.field1058 = var9.field3769;
                                    field702.method6547(var41);
                                }
                                if (field650 != null || field557) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3799 && var40) {
                                    var9.field3799 = true;
                                    if (var9.field3781 != null) {
                                        class88 var42 = new class88();
                                        var42.field1055 = true;
                                        var42.field1056 = var9;
                                        var42.field1057 = class36.field214 - var11;
                                        var42.field1062 = class36.field210 - var12;
                                        var42.field1058 = var9.field3781;
                                        field702.method6547(var42);
                                    }
                                }
                                if (var9.field3799 && var39 && var9.field3750 != null) {
                                    class88 var43 = new class88();
                                    var43.field1055 = true;
                                    var43.field1056 = var9;
                                    var43.field1057 = class36.field217 - var11;
                                    var43.field1062 = class36.field218 - var12;
                                    var43.field1058 = var9.field3750;
                                    field702.method6547(var43);
                                }
                                if (var9.field3799 && !var39) {
                                    var9.field3799 = false;
                                    if (var9.field3751 != null) {
                                        class88 var44 = new class88();
                                        var44.field1055 = true;
                                        var44.field1056 = var9;
                                        var44.field1057 = class36.field217 - var11;
                                        var44.field1062 = class36.field218 - var12;
                                        var44.field1058 = var9.field3751;
                                        field704.method6547(var44);
                                    }
                                }
                                if (var39 && var9.field3752 != null) {
                                    class88 var45 = new class88();
                                    var45.field1055 = true;
                                    var45.field1056 = var9;
                                    var45.field1057 = class36.field217 - var11;
                                    var45.field1062 = class36.field218 - var12;
                                    var45.field1058 = var9.field3752;
                                    field702.method6547(var45);
                                }
                                if (!var9.field3798 && var38) {
                                    var9.field3798 = true;
                                    if (var9.field3753 != null) {
                                        class88 var46 = new class88();
                                        var46.field1055 = true;
                                        var46.field1056 = var9;
                                        var46.field1057 = class36.field217 - var11;
                                        var46.field1062 = class36.field218 - var12;
                                        var46.field1058 = var9.field3753;
                                        field702.method6547(var46);
                                    }
                                }
                                if (var9.field3798 && var38 && var9.field3754 != null) {
                                    class88 var47 = new class88();
                                    var47.field1055 = true;
                                    var47.field1056 = var9;
                                    var47.field1057 = class36.field217 - var11;
                                    var47.field1062 = class36.field218 - var12;
                                    var47.field1058 = var9.field3754;
                                    field702.method6547(var47);
                                }
                                if (var9.field3798 && !var38) {
                                    var9.field3798 = false;
                                    if (var9.field3755 != null) {
                                        class88 var48 = new class88();
                                        var48.field1055 = true;
                                        var48.field1056 = var9;
                                        var48.field1057 = class36.field217 - var11;
                                        var48.field1062 = class36.field218 - var12;
                                        var48.field1058 = var9.field3755;
                                        field704.method6547(var48);
                                    }
                                }
                                if (var9.field3766 != null) {
                                    class88 var49 = new class88();
                                    var49.field1056 = var9;
                                    var49.field1058 = var9.field3766;
                                    field794.method6547(var49);
                                }
                                if (var9.field3760 != null && field684 > var9.field3801) {
                                    if (var9.field3654 == null || field684 - var9.field3801 > 32) {
                                        class88 var54 = new class88();
                                        var54.field1056 = var9;
                                        var54.field1058 = var9.field3760;
                                        field702.method6547(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3801; var50 < field684; var50++) {
                                            int var51 = field713[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3654.length; var52++) {
                                                if (var9.field3654[var52] == var51) {
                                                    class88 var53 = new class88();
                                                    var53.field1056 = var9;
                                                    var53.field1058 = var9.field3760;
                                                    field702.method6547(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3801 = field684;
                                }
                                if (var9.field3762 != null && field686 > var9.field3802) {
                                    if (var9.field3763 == null || field686 - var9.field3802 > 32) {
                                        class88 var59 = new class88();
                                        var59.field1056 = var9;
                                        var59.field1058 = var9.field3762;
                                        field702.method6547(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3802; var55 < field686; var55++) {
                                            int var56 = field542[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3763.length; var57++) {
                                                if (var9.field3763[var57] == var56) {
                                                    class88 var58 = new class88();
                                                    var58.field1056 = var9;
                                                    var58.field1058 = var9.field3762;
                                                    field702.method6547(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3802 = field686;
                                }
                                if (var9.field3743 != null && field688 > var9.field3764) {
                                    if (var9.field3765 == null || field688 - var9.field3764 > 32) {
                                        class88 var64 = new class88();
                                        var64.field1056 = var9;
                                        var64.field1058 = var9.field3743;
                                        field702.method6547(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3764; var60 < field688; var60++) {
                                            int var61 = field687[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3765.length; var62++) {
                                                if (var9.field3765[var62] == var61) {
                                                    class88 var63 = new class88();
                                                    var63.field1056 = var9;
                                                    var63.field1058 = var9.field3743;
                                                    field702.method6547(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3764 = field688;
                                }
                                if (field742 > var9.field3800 && var9.field3770 != null) {
                                    class88 var65 = new class88();
                                    var65.field1056 = var9;
                                    var65.field1058 = var9.field3770;
                                    field702.method6547(var65);
                                }
                                if (field748 > var9.field3800 && var9.field3774 != null) {
                                    class88 var66 = new class88();
                                    var66.field1056 = var9;
                                    var66.field1058 = var9.field3774;
                                    field702.method6547(var66);
                                }
                                if (field693 > var9.field3800 && var9.field3682 != null) {
                                    class88 var67 = new class88();
                                    var67.field1056 = var9;
                                    var67.field1058 = var9.field3682;
                                    field702.method6547(var67);
                                }
                                if (field694 > var9.field3800 && var9.field3677 != null) {
                                    class88 var68 = new class88();
                                    var68.field1056 = var9;
                                    var68.field1058 = var9.field3677;
                                    field702.method6547(var68);
                                }
                                if (field589 > var9.field3800 && var9.field3777 != null) {
                                    class88 var69 = new class88();
                                    var69.field1056 = var9;
                                    var69.field1058 = var9.field3777;
                                    field702.method6547(var69);
                                }
                                if (field552 > var9.field3800 && var9.field3795 != null) {
                                    class88 var70 = new class88();
                                    var70.field1056 = var9;
                                    var70.field1058 = var9.field3795;
                                    field702.method6547(var70);
                                }
                                if (field783 > var9.field3800 && var9.field3783 != null) {
                                    class88 var71 = new class88();
                                    var71.field1056 = var9;
                                    var71.field1058 = var9.field3783;
                                    field702.method6547(var71);
                                }
                                if (field698 > var9.field3800 && var9.field3778 != null) {
                                    class88 var72 = new class88();
                                    var72.field1056 = var9;
                                    var72.field1058 = var9.field3778;
                                    field702.method6547(var72);
                                }
                                var9.field3800 = field682;
                                if (var9.field3669 != null) {
                                    for (int var73 = 0; var73 < field727; var73++) {
                                        class88 var74 = new class88();
                                        var74.field1056 = var9;
                                        var74.field1061 = field519[var73];
                                        var74.field1065 = field587[var73];
                                        var74.field1058 = var9.field3669;
                                        field702.method6547(var74);
                                    }
                                }
                                if (var9.field3772 != null) {
                                    int[] var75 = field725.method3954();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class88 var77 = new class88();
                                        var77.field1056 = var9;
                                        var77.field1061 = var75[var76];
                                        var77.field1058 = var9.field3772;
                                        field702.method6547(var77);
                                    }
                                }
                                if (var9.field3773 != null) {
                                    int[] var78 = field725.method3955();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class88 var80 = new class88();
                                        var80.field1056 = var9;
                                        var80.field1061 = var78[var79];
                                        var80.field1058 = var9.field3773;
                                        field702.method6547(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3749) {
                            if (field650 != null || field557) {
                                continue;
                            }
                            if ((var9.field3787 >= 0 || var9.field3687 != 0) && class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                                if (var9.field3787 >= 0) {
                                    Statics.field856 = arg0[var9.field3787];
                                } else {
                                    Statics.field856 = var9;
                                }
                            }
                            if (var9.field3714 == 8 && class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22) {
                                Statics.field4540 = var9;
                            }
                            if (var9.field3652 > var9.field3676) {
                                Statics.method239(var9, var9.field3675 + var11, var12, var9.field3676, var9.field3652, class36.field217, class36.field218);
                            }
                        }
                        if (var9.field3714 == 0) {
                            method4452(arg0, var9.field3659, var19, var20, var21, var22, var11 - var9.field3681, var12 - var9.field3738);
                            if (var9.field3797 != null) {
                                method4452(var9.field3797, var9.field3659, var19, var20, var21, var22, var11 - var9.field3681, var12 - var9.field3738);
                            }
                            class87 var81 = (class87) field659.method8154((long) var9.field3659);
                            if (var81 != null) {
                                if (var81.field1046 == 0 && class36.field217 >= var19 && class36.field218 >= var20 && class36.field217 < var21 && class36.field218 < var22 && !field557) {
                                    for (class88 var82 = (class88) field702.method6579(); var82 != null; var82 = (class88) field702.method6549()) {
                                        if (var82.field1055) {
                                            var82.method7828();
                                            var82.field1056.field3798 = false;
                                        }
                                    }
                                    if (Statics.field1662 == 0) {
                                        field650 = null;
                                        field581 = null;
                                    }
                                    if (!field557) {
                                        Statics.method2852();
                                    }
                                }
                                method6900(var81.field1052, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("gq.mx(II)Z")
    public static boolean method3173(int arg0) {
        for (int var1 = 0; var1 < field727; var1++) {
            if (field519[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("tu.mv(III)V")
    public static final void method8289(int arg0, int arg1) {
        if (Statics.field1878.method5633(arg0)) {
            method2820(Statics.field1878.field3569[arg0], arg1);
        }
    }

    @ObfuscatedName("et.mm([Lnn;IB)V")
    public static final void method2820(class344[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class344 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3714 == 0) {
                    if (var3.field3797 != null) {
                        method2820(var3.field3797, arg1);
                    }
                    class87 var4 = (class87) field659.method8154((long) var3.field3659);
                    if (var4 != null) {
                        method8289(var4.field1052, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3779 != null) {
                    class88 var5 = new class88();
                    var5.field1056 = var3;
                    var5.field1058 = var3.field3779;
                    class71.method3152(var5);
                }
                if (arg1 == 1 && var3.field3780 != null) {
                    if (var3.field3660 >= 0) {
                        class344 var6 = Statics.field1878.method5636(var3.field3659);
                        if (var6 == null || var6.field3797 == null || var3.field3660 >= var6.field3797.length || var6.field3797[var3.field3660] != var3) {
                            continue;
                        }
                    }
                    class88 var7 = new class88();
                    var7.field1056 = var3;
                    var7.field1058 = var3.field3780;
                    class71.method3152(var7);
                }
            }
        }
    }

    @ObfuscatedName("hq.mq(Lnn;III)V")
    public static final void method3372(class344 arg0, int arg1, int arg2) {
        if (field650 != null || field557 || arg0 == null || method6219(arg0) == null) {
            return;
        }
        field650 = arg0;
        field581 = method6219(arg0);
        field672 = arg1;
        field548 = arg2;
        Statics.field1662 = 0;
        field681 = false;
        int var3 = field635 - 1;
        if (var3 != -1) {
            method817(var3);
        }
    }

    @ObfuscatedName("client.mf(B)V")
    public final void method1623() {
        method3158(field650);
        Statics.field1662++;
        if (field517 && field675) {
            int var1 = class36.field217;
            int var2 = class36.field218;
            int var3 = var1 - field672;
            int var4 = var2 - field548;
            if (var3 < field555) {
                var3 = field555;
            }
            if (field650.field3675 + var3 > field555 + field581.field3675) {
                var3 = field555 + field581.field3675 - field650.field3675;
            }
            if (var4 < field677) {
                var4 = field677;
            }
            if (field650.field3676 + var4 > field677 + field581.field3676) {
                var4 = field677 + field581.field3676 - field650.field3676;
            }
            int var5 = var3 - field534;
            int var6 = var4 - field680;
            int var7 = field650.field3716;
            if (Statics.field1662 > field650.field3744 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field681 = true;
            }
            int var8 = field581.field3681 + (var3 - field555);
            int var9 = field581.field3738 + (var4 - field677);
            if (field650.field3756 != null && field681) {
                class88 var10 = new class88();
                var10.field1056 = field650;
                var10.field1057 = var8;
                var10.field1062 = var9;
                var10.field1058 = field650.field3756;
                class71.method3152(var10);
            }
            if (class36.field208 == 0) {
                if (field681) {
                    if (field650.field3647 != null) {
                        class88 var11 = new class88();
                        var11.field1056 = field650;
                        var11.field1057 = var8;
                        var11.field1062 = var9;
                        var11.field1060 = field594;
                        var11.field1058 = field650.field3647;
                        class71.method3152(var11);
                    }
                    if (field594 != null && method4059(field650) != null) {
                        class308 var12 = class308.method2768(class306.field3147, field590.field1405);
                        var12.field3243.method8449(field650.field3793);
                        var12.field3243.method8450(field594.field3660);
                        var12.field3243.method8465(field650.field3659);
                        var12.field3243.method8396(field594.field3659);
                        var12.field3243.method8449(field650.field3660);
                        var12.field3243.method8450(field594.field3793);
                        field590.method2719(var12);
                    }
                } else if (this.method1325()) {
                    this.method1352(field672 + field534, field680 + field548);
                } else if (field635 > 0) {
                    method1742(field672 + field534, field680 + field548);
                }
                field650 = null;
            }
        } else if (Statics.field1662 > 1) {
            if (!field681 && field635 > 0) {
                method1742(field672 + field534, field680 + field548);
            }
            field650 = null;
        }
    }

    @ObfuscatedName("by.mo(IB)V")
    public static void method817(int arg0) {
        Statics.field1813 = new class74();
        Statics.field1813.field886 = field636[arg0];
        Statics.field1813.field885 = field562[arg0];
        Statics.field1813.field881 = field736[arg0];
        Statics.field1813.field889 = field708[arg0];
        Statics.field1813.field883 = field640[arg0];
        Statics.field1813.field884 = field641[arg0];
        Statics.field1813.field882 = field642[arg0];
    }

    @ObfuscatedName("client.mj(III)V")
    public static void method1742(int arg0, int arg1) {
        method1096(Statics.field1813, arg0, arg1);
        Statics.field1813 = null;
    }

    @ObfuscatedName("ge.ms(Lnn;I)V")
    public static void method3158(class344 arg0) {
        if (arg0 != null && field558 == arg0.field3805) {
            field709[arg0.field3804] = true;
        }
    }

    @ObfuscatedName("pp.mw(I)V")
    public static void method6719() {
        for (class87 var0 = (class87) field659.method8157(); var0 != null; var0 = (class87) field659.method8158()) {
            int var1 = var0.field1052;
            if (Statics.field1878.method5633(var1)) {
                boolean var2 = true;
                class344[] var3 = Statics.field1878.field3569[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3749;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4849;
                    class344 var6 = Statics.field1878.method5636(var5);
                    if (var6 != null) {
                        method3158(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("or.mu(Lnn;I)Lnn;")
    public static class344 method6219(class344 arg0) {
        class344 var1 = method4059(arg0);
        if (var1 == null) {
            var1 = arg0.field3715;
        }
        return var1;
    }

    @ObfuscatedName("fd.mt(II)V")
    public static final void method2940(int arg0) {
        if (!Statics.field1878.method5633(arg0)) {
            return;
        }
        class344[] var1 = Statics.field1878.field3569[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class344 var3 = var1[var2];
            if (var3 != null) {
                var3.field3692 = 0;
                var3.field3729 = 0;
            }
        }
    }

    @ObfuscatedName("gn.ml(II)V")
    public static final void method3182(int arg0) {
        if (Statics.field1878.method5633(arg0)) {
            method864(Statics.field1878.field3569[arg0], -1);
        }
    }

    @ObfuscatedName("bc.ma([Lnn;II)V")
    public static final void method864(class344[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class344 var3 = arg0[var2];
            if (var3 != null && var3.field3725 == arg1 && (!var3.field3749 || !method108(var3))) {
                if (var3.field3714 == 0) {
                    if (!var3.field3749 && method108(var3) && Statics.field856 != var3) {
                        continue;
                    }
                    method864(arg0, var3.field3659);
                    if (var3.field3797 != null) {
                        method864(var3.field3797, var3.field3659);
                    }
                    class87 var4 = (class87) field659.method8154((long) var3.field3659);
                    if (var4 != null) {
                        method3182(var4.field1052);
                    }
                }
                if (var3.field3714 == 6) {
                    if (var3.field3708 != -1 || var3.field3709 != -1) {
                        boolean var5 = method5635(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3709;
                        } else {
                            var6 = var3.field3708;
                        }
                        if (var6 != -1) {
                            class205 var7 = class205.method2129(var6);
                            if (var7.method3733()) {
                                var3.field3692 += field565;
                                int var8 = var7.method3749();
                                if (var3.field3692 >= var8) {
                                    var3.field3692 -= var7.field2228;
                                    if (var3.field3692 < 0 || var3.field3692 >= var8) {
                                        var3.field3692 = 0;
                                    }
                                }
                                method3158(var3);
                            } else {
                                var3.field3729 += field565;
                                while (var3.field3729 > var7.field2218[var3.field3692]) {
                                    var3.field3729 -= var7.field2218[var3.field3692];
                                    var3.field3692++;
                                    if (var3.field3692 >= var7.field2216.length) {
                                        var3.field3692 -= var7.field2228;
                                        if (var3.field3692 < 0 || var3.field3692 >= var7.field2216.length) {
                                            var3.field3692 = 0;
                                        }
                                    }
                                    method3158(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3717 != 0 && !var3.field3749) {
                        int var9 = var3.field3717 >> 16;
                        int var10 = var3.field3717 << 16 >> 16;
                        int var11 = field565 * var9;
                        int var12 = field565 * var10;
                        var3.field3651 = var3.field3651 + var11 & 0x7FF;
                        var3.field3713 = var3.field3713 + var12 & 0x7FF;
                        method3158(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("lt.me(II)V")
    public static final void method5340(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        class267.method4662((double) var3);
        ((class277) class267.field2773.field3043).method4987((double) var3);
        class203.method3198();
        Statics.field2450.method2423((double) var3);
    }

    @ObfuscatedName("id.mg(I)I")
    public static final int method3913() {
        float var0 = 200.0F * ((float) Statics.field2450.method2420() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("ce.mh(IS)V")
    public static final void method1072(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field2450.method2426()) {
            return;
        }
        label22: {
            if (Statics.field2450.method2426() == 0) {
                boolean var2 = !class317.field3425.isEmpty();
                if (var2) {
                    class317.method2031(Statics.field5060, var1);
                    field741 = false;
                    break label22;
                }
            }
            if (var1 == 0) {
                class317.method4392(0, 0);
                field741 = false;
            } else {
                class317.method4478(var1);
            }
        }
        Statics.field2450.method2425(var1);
    }

    @ObfuscatedName("bz.mc(IS)V")
    public static final void method839(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field2450.method2427(var1);
    }

    @ObfuscatedName("cy.mr(IB)V")
    public static final void method2092(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field2450.method2431(var1);
    }

    @ObfuscatedName("nw.mz(Lnn;I)V")
    public static final void method6175(class344 arg0) {
        int var1 = arg0.field3664;
        if (var1 == 324) {
            if (field775 == -1) {
                field775 = arg0.field3695;
                field721 = arg0.field3696;
            }
            if (field774.field3601 == 1) {
                arg0.field3695 = field775;
            } else {
                arg0.field3695 = field721;
            }
        } else if (var1 == 325) {
            if (field775 == -1) {
                field775 = arg0.field3695;
                field721 = arg0.field3696;
            }
            if (field774.field3601 == 1) {
                arg0.field3695 = field721;
            } else {
                arg0.field3695 = field775;
            }
        } else if (var1 == 327) {
            arg0.field3651 = 150;
            arg0.field3713 = (int) (Math.sin((double) field500 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3712 = 5;
            arg0.field3689 = 0;
        } else if (var1 == 328) {
            arg0.field3651 = 150;
            arg0.field3713 = (int) (Math.sin((double) field500 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3712 = 5;
            arg0.field3689 = 1;
        }
    }

    @ObfuscatedName("uf.nd(I)V")
    public static final void method8342() {
        class308 var0 = class308.method2768(class306.field3215, field590.field1405);
        field590.method2719(var0);
        class71.field843 = true;
        for (class87 var1 = (class87) field659.method8157(); var1 != null; var1 = (class87) field659.method8158()) {
            if (var1.field1046 == 0 || var1.field1046 == 3) {
                method5307(var1, true);
            }
        }
        if (field663 != null) {
            method3158(field663);
            field663 = null;
        }
        class71.field843 = false;
    }

    @ObfuscatedName("eh.nq(IIII)Ldc;")
    public static final class87 method2803(int arg0, int arg1, int arg2) {
        class87 var3 = new class87();
        var3.field1052 = arg1;
        var3.field1046 = arg2;
        field659.method8156(var3, (long) arg0);
        method2940(arg1);
        class344 var4 = Statics.field1878.method5636(arg0);
        method3158(var4);
        if (field663 != null) {
            method3158(field663);
            field663 = null;
        }
        method2981(Statics.field1878.field3569[arg0 >> 16], var4, false);
        class71.method2630(arg1);
        if (field505 != -1) {
            method8289(field505, 1);
        }
        return var3;
    }

    @ObfuscatedName("lp.nb(Ldc;ZB)V")
    public static final void method5307(class87 arg0, boolean arg1) {
        int var2 = arg0.field1052;
        int var3 = (int) arg0.field4849;
        arg0.method7828();
        if (arg1) {
            Statics.field1878.method5634(var2);
        }
        for (class484 var4 = (class484) field706.method8157(); var4 != null; var4 = (class484) field706.method8158()) {
            if ((var4.field4849 >> 48 & 0xFFFFL) == (long) var2) {
                var4.method7828();
            }
        }
        class344 var5 = Statics.field1878.method5636(var3);
        if (var5 != null) {
            method3158(var5);
        }
        if (field505 != -1) {
            method8289(field505, 1);
        }
    }

    @ObfuscatedName("dq.ni(Lnn;I)Z")
    public static final boolean method2588(class344 arg0) {
        int var1 = arg0.field3664;
        if (var1 == 205) {
            field772 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field774.method5667(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field774.method5668(var4, var5 == 1);
        }
        if (var1 == 324) {
            field774.method5673(0);
        }
        if (var1 == 325) {
            field774.method5673(1);
        }
        if (var1 == 326) {
            class308 var6 = class308.method2768(class306.field3201, field590.field1405);
            field774.method5666(var6.field3243);
            field590.method2719(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("bw.no(Lnn;IIII)V")
    public static final void method700(class344 arg0, int arg1, int arg2, int arg3) {
        method2592();
        class332 var4 = arg0.method6019(Statics.field1878, false);
        if (var4 == null) {
            return;
        }
        class537.method8755(arg1, arg2, var4.field3545 + arg1, var4.field3547 + arg2);
        if (field740 == 2 || field740 == 5) {
            class537.method8771(arg1, arg2, 0, var4.field3546, var4.field3549);
        } else {
            int var5 = field573 & 0x7FF;
            int var6 = Statics.field2420.field1247 / 32 + 48;
            int var7 = 464 - Statics.field2420.field1173 / 32;
            Statics.field1331.method8902(arg1, arg2, var4.field3545, var4.field3547, var6, var7, var5, 256, var4.field3546, var4.field3549);
            for (int var8 = 0; var8 < field734; var8++) {
                int var9 = field551[var8] * 4 + 2 - Statics.field2420.field1247 / 32;
                int var10 = field625[var8] * 4 + 2 - Statics.field2420.field1173 / 32;
                method3056(arg1, arg2, var9, var10, field711[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class390 var13 = field697[Statics.field2658][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2420.field1247 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2420.field1173 / 32;
                        method3056(arg1, arg2, var14, var15, Statics.field1909[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field547; var16++) {
                class101 var17 = field776[field496[var16]];
                if (var17 != null && var17.method2280()) {
                    class189 var18 = var17.field1311;
                    if (var18 != null && var18.field1958 != null) {
                        var18 = var18.method3385();
                    }
                    if (var18 != null && var18.field1950 && var18.field1961) {
                        int var19 = var17.field1247 / 32 - Statics.field2420.field1247 / 32;
                        int var20 = var17.field1173 / 32 - Statics.field2420.field1173 / 32;
                        method3056(arg1, arg2, var19, var20, Statics.field1909[1], var4);
                    }
                }
            }
            int var21 = class108.field1362;
            int[] var22 = class108.field1370;
            for (int var23 = 0; var23 < var21; var23++) {
                class92 var24 = field651[var22[var23]];
                if (var24 != null && var24.method2280() && !var24.field1098 && Statics.field2420 != var24) {
                    int var25 = var24.field1247 / 32 - Statics.field2420.field1247 / 32;
                    int var26 = var24.field1173 / 32 - Statics.field2420.field1173 / 32;
                    if (var24.method2268()) {
                        method3056(arg1, arg2, var25, var26, Statics.field1909[3], var4);
                    } else if (Statics.field2420.field1116 != 0 && var24.field1116 != 0 && Statics.field2420.field1116 == var24.field1116) {
                        method3056(arg1, arg2, var25, var26, Statics.field1909[4], var4);
                    } else if (var24.method2271()) {
                        method3056(arg1, arg2, var25, var26, Statics.field1909[5], var4);
                    } else if (var24.method2275()) {
                        method3056(arg1, arg2, var25, var26, Statics.field1909[6], var4);
                    } else {
                        method3056(arg1, arg2, var25, var26, Statics.field1909[2], var4);
                    }
                }
            }
            if (field507 != 0 && field500 % 20 < 10) {
                if (field507 == 1 && field508 >= 0 && field508 < field776.length) {
                    class101 var27 = field776[field508];
                    if (var27 != null) {
                        int var28 = var27.field1247 / 32 - Statics.field2420.field1247 / 32;
                        int var29 = var27.field1173 / 32 - Statics.field2420.field1173 / 32;
                        method3078(arg1, arg2, var28, var29, Statics.field54[1], var4);
                    }
                }
                if (field507 == 2) {
                    int var30 = field510 * 4 - Statics.field1917 * 4 + 2 - Statics.field2420.field1247 / 32;
                    int var31 = field511 * 4 - Statics.field1322 * 4 + 2 - Statics.field2420.field1173 / 32;
                    method3078(arg1, arg2, var30, var31, Statics.field54[1], var4);
                }
                if (field507 == 10 && field509 >= 0 && field509 < field651.length) {
                    class92 var32 = field651[field509];
                    if (var32 != null) {
                        int var33 = var32.field1247 / 32 - Statics.field2420.field1247 / 32;
                        int var34 = var32.field1173 / 32 - Statics.field2420.field1173 / 32;
                        method3078(arg1, arg2, var33, var34, Statics.field54[1], var4);
                    }
                }
            }
            if (field738 != 0) {
                int var35 = field738 * 4 + 2 - Statics.field2420.field1247 / 32;
                int var36 = field739 * 4 + 2 - Statics.field2420.field1173 / 32;
                method3056(arg1, arg2, var35, var36, Statics.field54[0], var4);
            }
            if (!Statics.field2420.field1098) {
                class537.method8837(var4.field3545 / 2 + arg1 - 1, var4.field3547 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field786[arg3] = true;
    }

    @ObfuscatedName("ie.nn(Lnn;IIIB)V")
    public static final void method3918(class344 arg0, int arg1, int arg2, int arg3) {
        class332 var4 = arg0.method6019(Statics.field1878, false);
        if (var4 == null) {
            return;
        }
        if (field740 < 3) {
            Statics.field2659.method8902(arg1, arg2, var4.field3545, var4.field3547, 25, 25, field573, 256, var4.field3546, var4.field3549);
        } else {
            class537.method8771(arg1, arg2, 0, var4.field3546, var4.field3549);
        }
    }

    @ObfuscatedName("fy.ng(IIIILuz;Lme;B)V")
    public static final void method3078(int arg0, int arg1, int arg2, int arg3, class541 arg4, class332 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3056(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field573 & 0x7FF;
        int var8 = class267.field2771[var7];
        int var9 = class267.field2769[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3545 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field51.method8960(arg5.field3545 / 2 + arg0 - var17 / 2 + var15, arg5.field3547 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("fv.np(IIIILuz;Lme;I)V")
    public static final void method3056(int arg0, int arg1, int arg2, int arg3, class541 arg4, class332 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field573 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class267.field2771[var6];
        int var9 = class267.field2769[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8901(arg5.field3545 / 2 + var10 - arg4.field5240 / 2, arg5.field3547 / 2 - var11 - arg4.field5241 / 2, arg0, arg1, arg5.field3545, arg5.field3547, arg5.field3546, arg5.field3549);
        } else {
            arg4.method8885(arg5.field3545 / 2 + arg0 + var10 - arg4.field5240 / 2, arg5.field3547 / 2 + arg1 - var11 - arg4.field5241 / 2);
        }
    }

    @ObfuscatedName("pt.nc(B)V")
    public static final void method7122() {
        class111.method326();
        if (Statics.field106 != null) {
            Statics.field106.method7363();
        }
    }

    @ObfuscatedName("ez.na(B)V")
    public static final void method2837() {
        for (int var0 = 0; var0 < class108.field1362; var0++) {
            class92 var1 = field651[class108.field1370[var0]];
            var1.method2274();
        }
    }

    @ObfuscatedName("if.nw(I)V")
    public static final void method3899() {
        field748 = field682;
    }

    @ObfuscatedName("mi.nh(I)V")
    public static final void method5382() {
        field694 = field682;
        Statics.field1053 = true;
    }

    @ObfuscatedName("gz.ny(Ljava/lang/String;B)V")
    public static final void method3221(String arg0) {
        if (Statics.field106 != null) {
            class308 var1 = class308.method2768(class306.field3174, field590.field1405);
            var1.field3243.method8393(class527.method3196(arg0));
            var1.field3243.method8400(arg0);
            field590.method2719(var1);
        }
    }

    @ObfuscatedName("fi.nu(Ljava/lang/String;I)V")
    public static final void method3003(String arg0) {
        if (!arg0.equals("")) {
            class308 var1 = class308.method2768(class306.field3189, field590.field1405);
            var1.field3243.method8393(class527.method3196(arg0));
            var1.field3243.method8400(arg0);
            field590.method2719(var1);
        }
    }

    @ObfuscatedName("jn.nx(I)V")
    public static final void method4436() {
        class308 var0 = class308.method2768(class306.field3189, field590.field1405);
        var0.field3243.method8393(0);
        field590.method2719(var0);
    }

    @ObfuscatedName("bv.nj(III)V")
    public static final void method459(int arg0, int arg1) {
        class165 var2 = arg0 >= 0 ? field732[arg0] : Statics.field1024;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3190()) {
            return;
        }
        class147 var3 = (class147) var2.field1769.get(arg1);
        if (var3.field1649 != -1) {
            return;
        }
        String var4 = var3.field1648.method9073();
        class308 var5 = class308.method2768(class306.field3211, field590.field1405);
        var5.field3243.method8393(3 + class527.method3196(var4));
        var5.field3243.method8393(arg0);
        var5.field3243.method8394(arg1);
        var5.field3243.method8400(var4);
        field590.method2719(var5);
    }

    @ObfuscatedName("en.nf(IIB)V")
    public static final void method2785(int arg0, int arg1) {
        if (field732[arg0] == null || arg1 < 0 || arg1 >= field732[arg0].method3190()) {
            return;
        }
        class147 var2 = (class147) field732[arg0].field1769.get(arg1);
        if (var2.field1649 != -1) {
            return;
        }
        class308 var3 = class308.method2768(class306.field3213, field590.field1405);
        var3.field3243.method8393(3 + class527.method3196(var2.field1648.method9073()));
        var3.field3243.method8393(arg0);
        var3.field3243.method8394(arg1);
        var3.field3243.method8400(var2.field1648.method9073());
        field590.method2719(var3);
    }

    @ObfuscatedName("ab.nk(IIZB)V")
    public static final void method15(int arg0, int arg1, boolean arg2) {
        if (field732[arg0] == null || arg1 < 0 || arg1 >= field732[arg0].method3190()) {
            return;
        }
        class147 var3 = (class147) field732[arg0].field1769.get(arg1);
        class308 var4 = class308.method2768(class306.field3130, field590.field1405);
        var4.field3243.method8393(4 + class527.method3196(var3.field1648.method9073()));
        var4.field3243.method8393(arg0);
        var4.field3243.method8394(arg1);
        var4.field3243.method8608(arg2);
        var4.field3243.method8400(var3.field1648.method9073());
        field590.method2719(var4);
    }

    @ObfuscatedName("nz.ns(Lnn;I)I")
    public static int method6207(class344 arg0) {
        class484 var1 = (class484) field706.method8154(((long) arg0.field3659 << 32) + (long) arg0.field3660);
        return var1 == null ? arg0.field3734 : var1.field4847;
    }

    @ObfuscatedName("ig.nm(Lnn;I)Lnn;")
    public static class344 method4059(class344 arg0) {
        int var1 = method6207(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = Statics.field1878.method5636(arg0.field3725);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("av.nv(Lnn;B)Z")
    public static boolean method108(class344 arg0) {
        return arg0.field3788;
    }

    @ObfuscatedName("dm.nt(Lnn;B)Ljava/lang/String;")
    public static String method2259(class344 arg0) {
        if (class345.method4103(method6207(arg0)) == 0) {
            return null;
        } else if (arg0.field3746 == null || arg0.field3746.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3746;
        }
    }

    @ObfuscatedName("jd.ne(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method4479(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field652 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field652 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field652 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field652 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field652 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field879 != null) {
            var3 = "/p=" + Statics.field879;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1043 + "/a=" + Statics.field112 + var3 + "/";
    }

    @ObfuscatedName("pd.nz(Ljava/lang/String;I)V")
    public static void method7113(String arg0) {
        Statics.field879 = arg0;
        try {
            String var1 = Statics.field3544.getParameter(Integer.toString(18));
            String var2 = Statics.field3544.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class313.method3460() + 94608000000L;
                class347.field3818.setTime(new Date(var6));
                int var8 = class347.field3818.get(7);
                int var9 = class347.field3818.get(5);
                int var10 = class347.field3818.get(2);
                int var11 = class347.field3818.get(1);
                int var12 = class347.field3818.get(11);
                int var13 = class347.field3818.get(12);
                int var14 = class347.field3818.get(13);
                String var15 = class347.field3819[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class347.field3820[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class27.method396(Statics.field3544, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("ea.nl(Ljava/lang/String;ZB)V")
    public static void method2779(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2133; var5++) {
            class203 var6 = class203.method3907(var5);
            if ((!arg1 || var6.field2184) && var6.field2187 == -1 && var6.field2166.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1464 = -1;
                    Statics.field3522 = null;
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
        Statics.field3522 = var3;
        Statics.field475 = 0;
        Statics.field1464 = var4;
        String[] var9 = new String[Statics.field1464];
        for (int var10 = 0; var10 < Statics.field1464; var10++) {
            var9[var10] = class203.method3907(var3[var10]).field2166;
        }
        class522.method3910(var9, Statics.field3522);
    }

    @ObfuscatedName("hf.nr([BII)V")
    public static void method3375(byte[] arg0, int arg1) {
        if (field613 == null) {
            field613 = new byte[24];
        }
        class422.method7189(arg0, arg1, field613, 0, 24);
    }

    @ObfuscatedName("mp.oi(Luj;IS)V")
    public static void method5654(class527 arg0, int arg1) {
        method3375(arg0.field5140, arg1);
        if (class212.field2290 == null) {
            return;
        }
        try {
            class212.field2290.method8218(0L);
            class212.field2290.method8223(arg0.field5140, arg1, 24);
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("nf.oc(Luj;I)V")
    public static void method6198(class527 arg0) {
        if (field613 == null) {
            byte[] var1 = class212.method3034();
            arg0.method8575(var1, 0, var1.length);
        } else {
            arg0.method8575(field613, 0, field613.length);
        }
    }

    @ObfuscatedName("client.or(I)Lvj;")
    public class550 method1208() {
        return Statics.field2420 == null ? null : Statics.field2420.field1103;
    }

    @ObfuscatedName("jp.ox(IB)V")
    public static void method4137(int arg0) {
        field578 = arg0;
    }

    @ObfuscatedName("hg.oh(B)V")
    public static void method3441() {
        if (field578 == 1) {
            field586 = true;
        }
    }

    @ObfuscatedName("jz.oy(I)V")
    public static void method4505() {
        if (!field586 || Statics.field2420 == null) {
            return;
        }
        int var0 = Statics.field2420.field1243[0];
        int var1 = Statics.field2420.field1244[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field1279 = Statics.field2420.field1247;
        int var2 = method6196(Statics.field2420.field1247, Statics.field2420.field1173, Statics.field2658) - field579;
        if (var2 < Statics.field57) {
            Statics.field57 = var2;
        }
        Statics.field460 = Statics.field2420.field1173;
        field586 = false;
    }

    @ObfuscatedName("ei.ol(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2808(String arg0) {
        class366[] var1 = class366.method5568();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class366 var3 = var1[var2];
            if (var3.field4260 != -1 && arg0.startsWith(class102.method3484(var3.field4260))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4260).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("jn.oz(B)V")
    public static void method4435() {
        if (Statics.field3457 == null) {
            return;
        }
        field784 = field500;
        Statics.field3457.method6485();
        for (int var0 = 0; var0 < field651.length; var0++) {
            if (field651[var0] != null) {
                Statics.field3457.method6481((field651[var0].field1247 >> 7) + Statics.field1917, (field651[var0].field1173 >> 7) + Statics.field1322);
            }
        }
    }

    @ObfuscatedName("ab.ov(S)Z")
    public static boolean method17() {
        return Statics.field2450.method2434() >= field489;
    }

    @ObfuscatedName("ai.oq(II)V")
    public static void method289(int arg0) {
        if (field666 != arg0) {
            field666 = arg0;
        }
    }

    @ObfuscatedName("ld.oo(I)Z")
    public static boolean method5325() {
        return field650 != null;
    }

    @ObfuscatedName("gb.oa(ZI)V")
    public static void method3197(boolean arg0) {
        field633 = arg0;
    }

    @ObfuscatedName("gf.ou(II)Lte;")
    public static class519 method3202(int arg0) {
        class519 var1 = (class519) field610.method5289((long) arg0);
        if (var1 == null) {
            var1 = new class519(Statics.field2779, class521.method3777(arg0), class521.method5316(arg0));
            field610.method5303(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("en.om(II)Lte;")
    public static class519 method2786(int arg0) {
        class519 var1 = (class519) field782.method5289((long) arg0);
        if (var1 == null) {
            var1 = new class519(Statics.field2779, arg0);
        }
        return var1;
    }

    @ObfuscatedName("jb.og(IB)V")
    public static void method4417(int arg0) {
        class205 var1 = class205.method2129(arg0);
        if (var1.method3733() && class205.method2256(var1.field2230) == 2) {
            field501.add(var1.field2230);
        }
    }

    @ObfuscatedName("gw.ow(B)Loz;")
    public static class372 method3151() {
        return Statics.field2557;
    }

    @ObfuscatedName("client.ob(II)V")
    public void method1209(int arg0) {
        if (field493 >= 216) {
            class308 var2 = class308.method2768(class306.field3191, field590.field1405);
            var2.field3243.method8393(arg0);
            field590.method2719(var2);
        }
    }

    @ObfuscatedName("client.os(II)V")
    public void method1210(int arg0) {
        if (field493 >= 216) {
            class308 var2 = class308.method2768(class306.field3152, field590.field1405);
            var2.field3243.method8393(arg0);
            field590.method2719(var2);
        }
    }
}

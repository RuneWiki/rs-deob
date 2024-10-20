package deob;

import com.jagex.oldscape.pub.OAuthApi;
import com.jagex.oldscape.pub.OtlTokenRequester;
import com.jagex.oldscape.pub.OtlTokenResponse;
import com.jagex.oldscape.pub.RefreshAccessTokenRequester;
import com.jagex.oldscape.pub.RefreshAccessTokenResponse;
import java.awt.datatransfer.Clipboard;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class415, OAuthApi, class313 {

    @ObfuscatedName("client.bt")
    public static boolean field523 = true;

    @ObfuscatedName("client.bl")
    public static int field504 = 1;

    @ObfuscatedName("client.cs")
    public static int field505 = 0;

    @ObfuscatedName("client.ca")
    public static int field566 = 0;

    @ObfuscatedName("client.ch")
    public static boolean field507 = false;

    @ObfuscatedName("client.cp")
    public static boolean field508 = false;

    @ObfuscatedName("client.cm")
    public static int field509 = -1;

    @ObfuscatedName("client.cg")
    public static int field510 = -1;

    @ObfuscatedName("client.ci")
    public static int field511 = -1;

    @ObfuscatedName("client.cb")
    public static boolean field804 = false;

    @ObfuscatedName("client.cc")
    public static int field513 = 214;

    @ObfuscatedName("client.dl")
    public static int field514 = 0;

    @ObfuscatedName("client.dr")
    public static boolean field517 = true;

    @ObfuscatedName("client.ee")
    public static int field506 = 0;

    @ObfuscatedName("client.er")
    public static long field519 = 1L;

    @ObfuscatedName("client.eu")
    public static int field520 = -1;

    @ObfuscatedName("client.ef")
    public static int field521 = -1;

    @ObfuscatedName("client.ez")
    public static long field572 = -1L;

    @ObfuscatedName("client.em")
    public static boolean field608 = true;

    @ObfuscatedName("client.ea")
    public static int field524 = 0;

    @ObfuscatedName("client.en")
    public static int field525 = 0;

    @ObfuscatedName("client.et")
    public static int field526 = 0;

    @ObfuscatedName("client.ek")
    public static int field798 = 0;

    @ObfuscatedName("client.ec")
    public static int field528 = 0;

    @ObfuscatedName("client.el")
    public static int field698 = 0;

    @ObfuscatedName("client.ed")
    public static int field530 = 0;

    @ObfuscatedName("client.ep")
    public static int field531 = 0;

    @ObfuscatedName("client.ew")
    public static int field532 = 0;

    @ObfuscatedName("client.eo")
    public static class103 field533 = class103.field1311;

    @ObfuscatedName("client.es")
    public static class103 field797 = class103.field1311;

    @ObfuscatedName("client.ei")
    public static boolean field618 = false;

    @ObfuscatedName("client.fm")
    public static int field536 = 0;

    @ObfuscatedName("client.fe")
    public static int field629 = 0;

    @ObfuscatedName("client.fz")
    public static int field762 = 0;

    @ObfuscatedName("client.gh")
    public static int field539 = 0;

    @ObfuscatedName("client.gb")
    public static int field545 = 0;

    @ObfuscatedName("client.gv")
    public static int field559 = 0;

    @ObfuscatedName("client.ga")
    public static int field783 = 0;

    @ObfuscatedName("client.gk")
    public static int field543 = 0;

    @ObfuscatedName("client.gt")
    public static class139 field678 = class139.field1609;

    @ObfuscatedName("client.gz")
    public static class506 field634 = class506.field5075;

    @ObfuscatedName("client.gu")
    public String field709;

    @ObfuscatedName("client.gq")
    public class15 field547;

    @ObfuscatedName("client.gs")
    public class19 field645;

    @ObfuscatedName("client.he")
    public OtlTokenRequester field549;

    @ObfuscatedName("client.ha")
    public Future field550;

    @ObfuscatedName("client.hk")
    public boolean field551 = false;

    @ObfuscatedName("client.hn")
    public class19 field552;

    @ObfuscatedName("client.ht")
    public RefreshAccessTokenRequester field553;

    @ObfuscatedName("client.hi")
    public Future field554;

    @ObfuscatedName("client.hv")
    public static final String field503;

    @ObfuscatedName("client.hu")
    public static boolean field557;

    @ObfuscatedName("client.hm")
    public static class78 field564;

    @ObfuscatedName("client.hl")
    public class501 field747;

    @ObfuscatedName("client.hx")
    public class8 field653;

    @ObfuscatedName("client.hz")
    public long field561 = -1L;

    @ObfuscatedName("client.hg")
    public static byte[] field562;

    @ObfuscatedName("client.ij")
    public static class100[] field563;

    @ObfuscatedName("client.il")
    public static int field542;

    @ObfuscatedName("client.ic")
    public static int[] field540;

    @ObfuscatedName("client.ik")
    public static int field580;

    @ObfuscatedName("client.ig")
    public static int[] field567;

    @ObfuscatedName("client.iy")
    public static final class111 field568;

    @ObfuscatedName("client.io")
    public static int field569;

    @ObfuscatedName("client.it")
    public static String field668;

    @ObfuscatedName("client.ia")
    public static boolean field570;

    @ObfuscatedName("client.iq")
    public static class402 field512;

    @ObfuscatedName("client.ib")
    public static HashMap field527;

    @ObfuscatedName("client.jh")
    public static int field573;

    @ObfuscatedName("client.jd")
    public static int field574;

    @ObfuscatedName("client.jz")
    public static int field575;

    @ObfuscatedName("client.jx")
    public static int field581;

    @ObfuscatedName("client.jn")
    public static int field577;

    @ObfuscatedName("client.jj")
    public static class213[] field776;

    @ObfuscatedName("client.ja")
    public static boolean field579;

    @ObfuscatedName("client.jv")
    public static int[][][] field555;

    @ObfuscatedName("client.jt")
    public static final int[] field571;

    @ObfuscatedName("client.ji")
    public static int field734;

    @ObfuscatedName("client.kv")
    public static int field583;

    @ObfuscatedName("client.ks")
    public static int field584;

    @ObfuscatedName("client.kw")
    public static int field585;

    @ObfuscatedName("client.kh")
    public static int field800;

    @ObfuscatedName("client.km")
    public static boolean field586;

    @ObfuscatedName("client.kr")
    public static int field588;

    @ObfuscatedName("client.ke")
    public static int field589;

    @ObfuscatedName("client.kp")
    public static int field590;

    @ObfuscatedName("client.kk")
    public static int field591;

    @ObfuscatedName("client.kl")
    public static int field560;

    @ObfuscatedName("client.kd")
    public static int field728;

    @ObfuscatedName("client.kz")
    public static int field594;

    @ObfuscatedName("client.lf")
    public static int field595;

    @ObfuscatedName("client.lt")
    public static int field648;

    @ObfuscatedName("client.ln")
    public static int field597;

    @ObfuscatedName("client.lh")
    public static int field598;

    @ObfuscatedName("client.li")
    public static int field599;

    @ObfuscatedName("client.lm")
    public static int field600;

    @ObfuscatedName("client.ll")
    public static int field601;

    @ObfuscatedName("client.lp")
    public static int field602;

    @ObfuscatedName("client.lq")
    public static boolean field603;

    @ObfuscatedName("client.ls")
    public static int field638;

    @ObfuscatedName("client.lw")
    public static boolean field605;

    @ObfuscatedName("client.lo")
    public static int field606;

    @ObfuscatedName("client.lg")
    public static int field756;

    @ObfuscatedName("client.lu")
    public static int field534;

    @ObfuscatedName("client.ly")
    public static int[] field609;

    @ObfuscatedName("client.lv")
    public static int[] field610;

    @ObfuscatedName("client.lk")
    public static int[] field611;

    @ObfuscatedName("client.lb")
    public static int[] field612;

    @ObfuscatedName("client.lr")
    public static int[] field697;

    @ObfuscatedName("client.le")
    public static int[] field544;

    @ObfuscatedName("client.lc")
    public static int[][] field615;

    @ObfuscatedName("client.lz")
    public static int[] field529;

    @ObfuscatedName("client.mr")
    public static String[] field617;

    @ObfuscatedName("client.mi")
    public static int[][] field633;

    @ObfuscatedName("client.mv")
    public static int field619;

    @ObfuscatedName("client.ma")
    public static int field620;

    @ObfuscatedName("client.mu")
    public static int field674;

    @ObfuscatedName("client.mn")
    public static int field622;

    @ObfuscatedName("client.mc")
    public static int field623;

    @ObfuscatedName("client.mq")
    public static int field576;

    @ObfuscatedName("client.mg")
    public static int field625;

    @ObfuscatedName("client.mo")
    public static boolean field626;

    @ObfuscatedName("client.mx")
    public static int field627;

    @ObfuscatedName("client.ml")
    public static boolean field628;

    @ObfuscatedName("client.mk")
    public static class92[] field613;

    @ObfuscatedName("client.mj")
    public static int field630;

    @ObfuscatedName("client.mb")
    public static int field631;

    @ObfuscatedName("client.mp")
    public static long field632;

    @ObfuscatedName("client.mz")
    public static boolean field752;

    @ObfuscatedName("client.me")
    public static int field637;

    @ObfuscatedName("client.nf")
    public static int field635;

    @ObfuscatedName("client.nm")
    public static int[] field636;

    @ObfuscatedName("client.nc")
    public static final int[] field676;

    @ObfuscatedName("client.na")
    public static String[] field721;

    @ObfuscatedName("client.nn")
    public static boolean[] field639;

    @ObfuscatedName("client.nt")
    public static int[] field779;

    @ObfuscatedName("client.ng")
    public static int field641;

    @ObfuscatedName("client.np")
    public static class376[][][] field642;

    @ObfuscatedName("client.ne")
    public static class376 field643;

    @ObfuscatedName("client.ni")
    public static class376 field644;

    @ObfuscatedName("client.nu")
    public static class376 field685;

    @ObfuscatedName("client.nb")
    public static int[] field646;

    @ObfuscatedName("client.nw")
    public static int[] field647;

    @ObfuscatedName("client.nd")
    public static int[] field719;

    @ObfuscatedName("client.nz")
    public static boolean field649;

    @ObfuscatedName("client.ny")
    public static boolean field650;

    @ObfuscatedName("client.ns")
    public static int field651;

    @ObfuscatedName("client.nh")
    public static int[] field652;

    @ObfuscatedName("client.nj")
    public static int[] field730;

    @ObfuscatedName("client.nk")
    public static int[] field714;

    @ObfuscatedName("client.od")
    public static int[] field655;

    @ObfuscatedName("client.oe")
    public static int[] field656;

    @ObfuscatedName("client.ow")
    public static String[] field657;

    @ObfuscatedName("client.oc")
    public static String[] field658;

    @ObfuscatedName("client.og")
    public static boolean[] field659;

    @ObfuscatedName("client.ob")
    public static boolean field660;

    @ObfuscatedName("client.oj")
    public static boolean field661;

    @ObfuscatedName("client.oo")
    public static boolean field662;

    @ObfuscatedName("client.ol")
    public static int field663;

    @ObfuscatedName("client.oi")
    public static int field664;

    @ObfuscatedName("client.or")
    public static int field665;

    @ObfuscatedName("client.ox")
    public static int field666;

    @ObfuscatedName("client.os")
    public static int field667;

    @ObfuscatedName("client.ok")
    public static boolean field669;

    @ObfuscatedName("client.ov")
    public static int field670;

    @ObfuscatedName("client.oh")
    public static int field671;

    @ObfuscatedName("client.on")
    public static String field672;

    @ObfuscatedName("client.ou")
    public static String field717;

    @ObfuscatedName("client.of")
    public static int field799;

    @ObfuscatedName("client.pu")
    public static class477 field675;

    @ObfuscatedName("client.pn")
    public static int field518;

    @ObfuscatedName("client.pw")
    public static int field614;

    @ObfuscatedName("client.py")
    public static int field796;

    @ObfuscatedName("client.pe")
    public static class330 field679;

    @ObfuscatedName("client.pv")
    public static int field680;

    @ObfuscatedName("client.ps")
    public static int field681;

    @ObfuscatedName("client.px")
    public static int field682;

    @ObfuscatedName("client.pc")
    public static int field683;

    @ObfuscatedName("client.pq")
    public static boolean field766;

    @ObfuscatedName("client.pz")
    public static class330 field604;

    @ObfuscatedName("client.pp")
    public static class330 field771;

    @ObfuscatedName("client.pt")
    public static class330 field687;

    @ObfuscatedName("client.pj")
    public static int field688;

    @ObfuscatedName("client.pm")
    public static int field689;

    @ObfuscatedName("client.po")
    public static class330 field690;

    @ObfuscatedName("client.pi")
    public static boolean field640;

    @ObfuscatedName("client.pa")
    public static int field535;

    @ObfuscatedName("client.pl")
    public static int field693;

    @ObfuscatedName("client.pg")
    public static boolean field694;

    @ObfuscatedName("client.pf")
    public static int field695;

    @ObfuscatedName("client.pr")
    public static int field736;

    @ObfuscatedName("client.qy")
    public static boolean field596;

    @ObfuscatedName("client.qi")
    public static int field587;

    @ObfuscatedName("client.qg")
    public static int[] field654;

    @ObfuscatedName("client.qh")
    public static int field700;

    @ObfuscatedName("client.qz")
    public static int[] field701;

    @ObfuscatedName("client.qw")
    public static int field702;

    @ObfuscatedName("client.qa")
    public static int[] field673;

    @ObfuscatedName("client.qn")
    public static int field704;

    @ObfuscatedName("client.qc")
    public static int[] field705;

    @ObfuscatedName("client.qd")
    public static int field706;

    @ObfuscatedName("client.qr")
    public static int field707;

    @ObfuscatedName("client.qs")
    public static int field708;

    @ObfuscatedName("client.ql")
    public static int field767;

    @ObfuscatedName("client.qk")
    public static int field710;

    @ObfuscatedName("client.qv")
    public static int field691;

    @ObfuscatedName("client.qj")
    public static int field735;

    @ObfuscatedName("client.qp")
    public static int field713;

    @ObfuscatedName("client.qu")
    public static int field712;

    @ObfuscatedName("client.rg")
    public static int field715;

    @ObfuscatedName("client.ra")
    public static class519 field716;

    @ObfuscatedName("client.rj")
    public static class376 field746;

    @ObfuscatedName("client.ro")
    public static class376 field718;

    @ObfuscatedName("client.rp")
    public static class376 field711;

    @ObfuscatedName("client.rr")
    public static class376 field743;

    @ObfuscatedName("client.rb")
    public static class477 field537;

    @ObfuscatedName("client.rt")
    public static int field722;

    @ObfuscatedName("client.ry")
    public static int field723;

    @ObfuscatedName("client.rf")
    public static boolean[] field724;

    @ObfuscatedName("client.rh")
    public static boolean[] field725;

    @ObfuscatedName("client.ru")
    public static boolean[] field744;

    @ObfuscatedName("client.rl")
    public static int[] field727;

    @ObfuscatedName("client.rd")
    public static int[] field793;

    @ObfuscatedName("client.rz")
    public static int[] field729;

    @ObfuscatedName("client.rc")
    public static int[] field538;

    @ObfuscatedName("client.rk")
    public static int field565;

    @ObfuscatedName("client.rq")
    public static long field732;

    @ObfuscatedName("client.ri")
    public static boolean field733;

    @ObfuscatedName("client.sr")
    public static int[] field578;

    @ObfuscatedName("client.sb")
    public static int field558;

    @ObfuscatedName("client.sc")
    public static int field731;

    @ObfuscatedName("client.sv")
    public static String field737;

    @ObfuscatedName("client.sn")
    public static long[] field738;

    @ObfuscatedName("client.sy")
    public static int field778;

    @ObfuscatedName("client.sz")
    public static class212 field740;

    @ObfuscatedName("client.sj")
    public static class210 field741;

    @ObfuscatedName("client.su")
    public static int field742;

    @ObfuscatedName("client.sq")
    public static int[] field677;

    @ObfuscatedName("client.ss")
    public static int[] field546;

    @ObfuscatedName("client.sp")
    public static long field745;

    @ObfuscatedName("client.sk")
    public static class154[] field593;

    @ObfuscatedName("client.sd")
    public static class163[] field720;

    @ObfuscatedName("client.sl")
    public static int field748;

    @ObfuscatedName("client.tb")
    public static int field749;

    @ObfuscatedName("client.tp")
    public static int[] field750;

    @ObfuscatedName("client.th")
    public static int[] field758;

    @ObfuscatedName("client.tc")
    public static class515[] field774;

    @ObfuscatedName("client.tg")
    public static int field753;

    @ObfuscatedName("client.tl")
    public static int field754;

    @ObfuscatedName("client.tf")
    public static int field755;

    @ObfuscatedName("client.ty")
    public static int field763;

    @ObfuscatedName("client.tn")
    public static boolean field757;

    @ObfuscatedName("client.tm")
    public static int field684;

    @ObfuscatedName("client.tt")
    public static int[] field759;

    @ObfuscatedName("client.td")
    public static int[] field686;

    @ObfuscatedName("client.tq")
    public static int[] field761;

    @ObfuscatedName("client.tw")
    public static int[] field522;

    @ObfuscatedName("client.tx")
    public static class40[] field703;

    @ObfuscatedName("client.uf")
    public static boolean field751;

    @ObfuscatedName("client.ud")
    public static boolean field765;

    @ObfuscatedName("client.uz")
    public static boolean field726;

    @ObfuscatedName("client.uu")
    public static boolean field582;

    @ObfuscatedName("client.um")
    public static class468 field541;

    @ObfuscatedName("client.ut")
    public static class467 field769;

    @ObfuscatedName("client.uj")
    public static class467 field770;

    @ObfuscatedName("client.uq")
    public static boolean field692;

    @ObfuscatedName("client.va")
    public static boolean[] field772;

    @ObfuscatedName("client.vi")
    public static int[] field773;

    @ObfuscatedName("client.vt")
    public static int[] field696;

    @ObfuscatedName("client.vj")
    public static int[] field775;

    @ObfuscatedName("client.vb")
    public static int[] field764;

    @ObfuscatedName("client.ve")
    public static short field777;

    @ObfuscatedName("client.vs")
    public static short field621;

    @ObfuscatedName("client.vy")
    public static short field624;

    @ObfuscatedName("client.vk")
    public static short field780;

    @ObfuscatedName("client.vr")
    public static short field781;

    @ObfuscatedName("client.vo")
    public static short field782;

    @ObfuscatedName("client.vz")
    public static short field592;

    @ObfuscatedName("client.vd")
    public static short field784;

    @ObfuscatedName("client.vm")
    public static int field785;

    @ObfuscatedName("client.vw")
    public static int field760;

    @ObfuscatedName("client.vq")
    public static int field787;

    @ObfuscatedName("client.vg")
    public static int field788;

    @ObfuscatedName("client.vx")
    public static int field789;

    @ObfuscatedName("client.vf")
    public static class327 field790;

    @ObfuscatedName("client.vl")
    public static int field791;

    @ObfuscatedName("client.vu")
    public static int field792;

    @ObfuscatedName("client.vp")
    public static class464 field739;

    @ObfuscatedName("client.vv")
    public static class366[] field794;

    @ObfuscatedName("client.wa")
    public static class67 field795;

    @ObfuscatedName("client.wk")
    public static class412 field616;

    @ObfuscatedName("client.wv")
    public static class287 field786;

    @ObfuscatedName("client.we")
    public static class287 field548;

    @ObfuscatedName("client.wh")
    public static int field607;

    @ObfuscatedName("client.wd")
    public static int field699;

    @ObfuscatedName("client.wc")
    public static List field801;

    @ObfuscatedName("client.wx")
    public static ArrayList field802;

    @ObfuscatedName("client.wm")
    public static int field803;

    @ObfuscatedName("client.wy")
    public static int field768;

    @ObfuscatedName("client.xj")
    public static final class66 field805;

    @ObfuscatedName("client.xg")
    public static int[] field806;

    @ObfuscatedName("client.xs")
    public static int[] field807;

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
        String var5 = class384.method6075(var1, 0, var1.length);
        field503 = var5;
        field557 = false;
        field564 = new class78();
        field562 = null;
        field563 = new class100[65536];
        field542 = 0;
        field540 = new int[65536];
        field580 = 0;
        field567 = new int[250];
        field568 = new class111();
        field569 = 0;
        field570 = false;
        field512 = new class402();
        field527 = new HashMap();
        field573 = 0;
        field574 = 1;
        field575 = 0;
        field581 = 1;
        field577 = 0;
        field776 = new class213[4];
        field579 = false;
        field555 = new int[4][13][13];
        field571 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field734 = 0;
        field583 = 2301979;
        field584 = 5063219;
        field585 = 3353893;
        field800 = 7759444;
        field586 = false;
        field588 = 0;
        field589 = 128;
        field590 = 0;
        field591 = 0;
        field560 = 0;
        field728 = 0;
        field594 = 0;
        field595 = 0;
        field648 = 50;
        field597 = 0;
        field598 = 0;
        field599 = 0;
        field600 = 12;
        field601 = 6;
        field602 = 0;
        field603 = false;
        field638 = 0;
        field605 = false;
        field606 = 0;
        field756 = 0;
        field534 = 50;
        field609 = new int[field534];
        field610 = new int[field534];
        field611 = new int[field534];
        field612 = new int[field534];
        field697 = new int[field534];
        field544 = new int[field534];
        field615 = new int[field534][];
        field529 = new int[field534];
        field617 = new String[field534];
        field633 = new int[104][104];
        field619 = 0;
        field620 = -1;
        field674 = -1;
        field622 = 0;
        field623 = 0;
        field576 = 0;
        field625 = 0;
        field626 = true;
        field627 = 0;
        field628 = true;
        field613 = new class92[2048];
        field630 = -1;
        field631 = 0;
        field632 = -1L;
        field752 = true;
        field637 = 0;
        field635 = 0;
        field636 = new int[1000];
        field676 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field721 = new String[8];
        field639 = new boolean[8];
        field779 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field641 = -1;
        field642 = new class376[4][104][104];
        field643 = new class376();
        field644 = new class376();
        field685 = new class376();
        field646 = new int[25];
        field647 = new int[25];
        field719 = new int[25];
        field649 = false;
        field650 = false;
        field651 = 0;
        field652 = new int[500];
        field730 = new int[500];
        field714 = new int[500];
        field655 = new int[500];
        field656 = new int[500];
        field657 = new String[500];
        field658 = new String[500];
        field659 = new boolean[500];
        field660 = false;
        field661 = false;
        field662 = true;
        field663 = -1;
        field664 = -1;
        field665 = 0;
        field666 = 50;
        field667 = 0;
        field668 = null;
        field669 = false;
        field670 = -1;
        field671 = -1;
        field672 = null;
        field717 = null;
        field799 = -1;
        field675 = new class477(8);
        field518 = 0;
        field614 = -1;
        field796 = 0;
        field679 = null;
        field680 = 0;
        field681 = 0;
        field682 = 0;
        field683 = -1;
        field766 = false;
        field604 = null;
        field771 = null;
        field687 = null;
        field688 = 0;
        field689 = 0;
        field690 = null;
        field640 = false;
        field535 = -1;
        field693 = -1;
        field694 = false;
        field695 = -1;
        field736 = -1;
        field596 = false;
        field587 = 1;
        field654 = new int[32];
        field700 = 0;
        field701 = new int[32];
        field702 = 0;
        field673 = new int[32];
        field704 = 0;
        field705 = new int[32];
        field706 = 0;
        field707 = 0;
        field708 = 0;
        field767 = 0;
        field710 = 0;
        field691 = 0;
        field735 = 0;
        field713 = 0;
        field712 = 0;
        field715 = 0;
        field716 = new class519();
        field746 = new class376();
        field718 = new class376();
        field711 = new class376();
        field743 = new class376();
        field537 = new class477(512);
        field722 = 0;
        field723 = -2;
        field724 = new boolean[100];
        field725 = new boolean[100];
        field744 = new boolean[100];
        field727 = new int[100];
        field793 = new int[100];
        field729 = new int[100];
        field538 = new int[100];
        field565 = 0;
        field732 = 0L;
        field733 = true;
        field578 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field558 = 0;
        field731 = 0;
        field737 = "";
        field738 = new long[100];
        field778 = 0;
        field740 = new class212();
        field741 = new class210();
        field742 = 0;
        field677 = new int[128];
        field546 = new int[128];
        field745 = -1L;
        field593 = new class154[4];
        field720 = new class163[4];
        field748 = -1;
        field749 = 0;
        field750 = new int[1000];
        field758 = new int[1000];
        field774 = new class515[1000];
        field753 = 0;
        field754 = 0;
        field755 = 0;
        field763 = -1;
        field757 = false;
        field684 = 0;
        field759 = new int[50];
        field686 = new int[50];
        field761 = new int[50];
        field522 = new int[50];
        field703 = new class40[50];
        field751 = false;
        field765 = false;
        field726 = false;
        field582 = false;
        field541 = null;
        field769 = null;
        field770 = null;
        field692 = false;
        field772 = new boolean[5];
        field773 = new int[5];
        field696 = new int[5];
        field775 = new int[5];
        field764 = new int[5];
        field777 = 256;
        field621 = 205;
        field624 = 256;
        field780 = 320;
        field781 = 1;
        field782 = 32767;
        field592 = 1;
        field784 = 32767;
        field785 = 0;
        field760 = 0;
        field787 = 0;
        field788 = 0;
        field789 = 0;
        field790 = new class327();
        field791 = -1;
        field792 = -1;
        field739 = new class462();
        field794 = new class366[8];
        field795 = new class67();
        field616 = new class412(8, class410.field4550);
        field786 = new class287(64);
        field548 = new class287(64);
        field607 = -1;
        field699 = -1;
        field801 = new ArrayList();
        field802 = new ArrayList(10);
        field803 = 0;
        field768 = 0;
        field805 = new class66();
        field806 = new int[50];
        field807 = new int[50];
    }

    @ObfuscatedName("ib.go(I)Lse;")
    public static class471 method4344() {
        return Statics.field479;
    }

    @ObfuscatedName("client.bz(B)V")
    public final void method494() {
    }

    public final void init() {
        if (!this.method471()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class101.field1298)) {
                            field507 = true;
                        } else {
                            field507 = false;
                        }
                        break;
                    case 4:
                        if (field510 == -1) {
                            field510 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field505 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var5 = Integer.parseInt(var2);
                        class372 var6;
                        if (var5 >= 0 && var5 < class372.field4351.length) {
                            var6 = class372.field4351[var5];
                        } else {
                            var6 = null;
                        }
                        Statics.field4618 = var6;
                        break;
                    case 7:
                        Statics.field133 = class345.method3224(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class101.field1298)) {
                        }
                        break;
                    case 9:
                        Statics.field4711 = var2;
                        break;
                    case 10:
                        class346[] var4 = new class346[] { class346.field3848, class346.field3855, class346.field3858, class346.field3849, class346.field3853, class346.field3852 };
                        Statics.field3842 = (class346) class371.method4632(var4, Integer.parseInt(var2));
                        if (Statics.field3842 == class346.field3853) {
                            Statics.field3059 = class481.field4935;
                        } else {
                            Statics.field3059 = class481.field4925;
                        }
                        break;
                    case 11:
                        Statics.field3381 = var2;
                        break;
                    case 12:
                        field504 = Integer.parseInt(var2);
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
                        Statics.field1727 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field566 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field5099 = var2;
                        break;
                    case 21:
                        field509 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field513 = Integer.parseInt(var2);
                        } else {
                            field513 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        class230.field2585 = false;
        field508 = false;
        Statics.field87 = this.getCodeBase().getHost();
        String var7 = Statics.field133.field3845;
        byte var8 = 0;
        try {
            class173.method3677("oldschool", var7, var8, 22);
        } catch (Exception var10) {
            class528.method4947((String) null, var10);
        }
        Statics.field3874 = this;
        Statics.field4726 = field510;
        method7994();
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field551 = true;
        }
        if (field511 == -1) {
            if (this.method1132() || this.method1133()) {
                field511 = 5;
            } else {
                field511 = 0;
            }
        }
        this.method468(765, 503, 214, 1);
    }

    public void finalize() throws Throwable {
        class305.method3620(this);
        super.finalize();
    }

    @ObfuscatedName("sw.ge(I)V")
    public static void method7994() {
        Statics.field301 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field9 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field3789 = System.getenv("JX_SESSION_ID");
        Statics.field4611 = System.getenv("JX_CHARACTER_ID");
        String var0 = System.getenv("JX_DISPLAY_NAME");
        class76.field940 = class482.method10(var0);
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field549 = arg0;
            Statics.method6605(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field553 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field514 == 10;
    }

    public long getAccountHash() {
        return this.field561;
    }

    @ObfuscatedName("client.gb(B)Z")
    public boolean method1132() {
        return Statics.field301 != null && !Statics.field301.trim().isEmpty() && Statics.field9 != null && !Statics.field9.trim().isEmpty();
    }

    @ObfuscatedName("client.gv(B)Z")
    public boolean method1133() {
        return Statics.field3789 != null && !Statics.field3789.trim().isEmpty() && Statics.field4611 != null && !Statics.field4611.trim().isEmpty();
    }

    @ObfuscatedName("client.ga(I)Z")
    public boolean method1422() {
        return this.field549 != null;
    }

    @ObfuscatedName("client.gk(Ljava/lang/String;I)V")
    public void method1135(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field3381 + "shield/oauth/token" + (new class452(var2)).method7534());
        class408 var4 = new class408();
        var4.method7023(field503);
        var4.method6987("Host", (new URL(Statics.field3381)).getHost());
        var4.method6994(class449.field4718);
        class10 var5 = class10.field34;
        RefreshAccessTokenRequester var6 = this.field553;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field551);
            this.field552 = this.field547.method166(var7);
        } else {
            this.field554 = var6.request(var5.method76(), var3, var4.method6986(), "");
        }
    }

    @ObfuscatedName("client.gt(Ljava/lang/String;S)V")
    public void method1282(String arg0) throws IOException {
        URL var2 = new URL(Statics.field3381 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class408 var3 = new class408();
        var3.method6991(arg0);
        class10 var4 = class10.field37;
        OtlTokenRequester var5 = this.field549;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field551);
            this.field645 = this.field547.method166(var6);
        } else {
            this.field550 = var5.request(var4.method76(), var2, var3.method6986(), "");
        }
    }

    @ObfuscatedName("client.gz(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1137(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field3381 + "/game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field34, this.field551);
        var4.method86().method6991(arg0);
        var4.method86().method6994(class449.field4718);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method84(new class451(var5));
        this.field645 = this.field547.method166(var4);
    }

    @ObfuscatedName("client.ba(B)V")
    public final void method485() {
        class400.method3111(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field300 = field566 == 0 ? 43594 : field504 + 40000;
        Statics.field985 = field566 == 0 ? 443 : field504 + 50000;
        Statics.field1418 = Statics.field300;
        Statics.field3037 = class329.field3586;
        Statics.field66 = class329.field3581;
        Statics.field4313 = class329.field3583;
        Statics.field2327 = class329.field3584;
        Statics.field337 = new class113(this.field551, 214);
        this.method460();
        this.method522();
        Statics.field3505 = this.method455();
        this.method462(field741, 0);
        this.method462(field740, 1);
        Statics.field1634 = new class431(255, class173.field1835, class173.field1836, 500000);
        class483 var1 = null;
        class98 var2 = new class98();
        try {
            var1 = class173.method7828("", Statics.field3842.field3854, false);
            byte[] var3 = new byte[(int) var1.method7919()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method7920(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class98(new class501(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method7922();
            }
        } catch (Exception var11) {
        }
        Statics.field48 = var2;
        this.method608();
        class32.method5421(this, Statics.field1592);
        method2433(Statics.field48.method2338());
        Statics.field497 = new class69(Statics.field3059);
        this.field547 = new class15("tokenRequest", 1, 1);
        if (!class305.field3389.contains(this)) {
            class305.field3389.add(this);
        }
        Statics.field1580 = new class216[1];
        class214 var10 = class214.field2368;
        Statics.field1580[0] = new class216(var10.field2376, var10.field2370);
    }

    @ObfuscatedName("nb.gm(B)Lil;")
    public static class212 method6015() {
        return field740;
    }

    @ObfuscatedName("client.bn(B)V")
    public final void method486() {
        field506++;
        this.method1138();
        while (true) {
            class376 var1 = class354.field4227;
            class353 var2;
            synchronized (class354.field4227) {
                var2 = (class353) class354.field4226.method6307();
            }
            if (var2 == null) {
                try {
                    label94: {
                        if (class305.field3390 == 1) {
                            int var4 = Statics.field3388.method5207();
                            if (var4 > 0 && Statics.field3388.method5213()) {
                                int var5 = var4 - Statics.field1735;
                                if (var5 < 0) {
                                    var5 = 0;
                                }
                                Statics.field3388.method5206(var5);
                                break label94;
                            }
                            Statics.field3388.method5212();
                            Statics.field3388.method5232();
                            Statics.field3388.field3420.clear();
                            if (Statics.field1437 == null) {
                                class305.field3390 = 0;
                            } else {
                                class305.field3390 = 2;
                            }
                            Statics.field2683 = null;
                            Statics.field3392 = null;
                        }
                        if (class305.field3386 > -1 && !Statics.field3388.method5213()) {
                            class305.method7032(class305.field3386, class305.field3396);
                            class305.field3386 = -1;
                            class305.field3396 = -1;
                        }
                    }
                } catch (Exception var12) {
                    var12.printStackTrace();
                    Statics.field3388.method5212();
                    class305.field3390 = 0;
                    Statics.field2683 = null;
                    Statics.field3392 = null;
                    Statics.field1437 = null;
                }
                method4957();
                field740.method3799();
                this.method533();
                class36 var7 = class36.field218;
                synchronized (class36.field218) {
                    class36.field224 = class36.field220;
                    class36.field221 = class36.field235;
                    class36.field229 = class36.field222;
                    class36.field225 = class36.field223;
                    class36.field232 = class36.field228;
                    class36.field233 = class36.field217;
                    class36.field234 = class36.field230;
                    class36.field216 = class36.field231;
                    class36.field228 = 0;
                }
                if (Statics.field3505 != null) {
                    int var9 = Statics.field3505.method302();
                    field715 = var9;
                }
                if (field514 == 0) {
                    method2910();
                    class35.method2774();
                } else if (field514 == 5) {
                    class76.method7514(this, Statics.field227, Statics.field4520);
                    method2910();
                    class35.method2774();
                } else if (field514 == 10 || field514 == 11) {
                    class76.method7514(this, Statics.field227, Statics.field4520);
                } else if (field514 == 20) {
                    class76.method7514(this, Statics.field227, Statics.field4520);
                    this.method1141();
                } else if (field514 == 50) {
                    class76.method7514(this, Statics.field227, Statics.field4520);
                    this.method1141();
                } else if (field514 == 25) {
                    method647();
                }
                if (field514 == 30) {
                    this.method1142();
                } else if (field514 == 40 || field514 == 45) {
                    this.method1141();
                }
                return;
            }
            var2.field4220.method6038(var2.field4221, (int) var2.field4757, var2.field4222, false);
        }
    }

    @ObfuscatedName("client.bb(ZI)V")
    public final void method548(boolean arg0) {
        boolean var2 = class305.method4692();
        if (var2 && field757 && Statics.field1074 != null) {
            Statics.field1074.method742();
        }
        if ((field514 == 10 || field514 == 20 || field514 == 30) && field732 != 0L && class301.method4630() > field732) {
            method2433(method4406());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field724[var3] = true;
            }
        }
        if (field514 == 0) {
            this.method571(class76.field956, class76.field923, arg0);
        } else if (field514 == 5) {
            class76.method3248(Statics.field1789, Statics.field227, Statics.field4520);
        } else if (field514 == 10 || field514 == 11) {
            class76.method3248(Statics.field1789, Statics.field227, Statics.field4520);
        } else if (field514 == 20) {
            class76.method3248(Statics.field1789, Statics.field227, Statics.field4520);
        } else if (field514 == 50) {
            class76.method3248(Statics.field1789, Statics.field227, Statics.field4520);
        } else if (field514 == 25) {
            if (field577 == 1) {
                if (field573 > field574) {
                    field574 = field573;
                }
                int var4 = (field574 * 50 - field573 * 50) / field574;
                method4347(class350.field3920 + class101.field1299 + class101.field1296 + var4 + "%" + class101.field1297, false);
            } else if (field577 == 2) {
                if (field575 > field581) {
                    field581 = field575;
                }
                int var5 = (field581 * 50 - field575 * 50) / field581 + 50;
                method4347(class350.field3920 + class101.field1299 + class101.field1296 + var5 + "%" + class101.field1297, false);
            } else {
                method4347(class350.field3920, false);
            }
        } else if (field514 == 30) {
            this.method1360();
        } else if (field514 == 40) {
            method4347(class350.field3891 + class101.field1299 + class350.field3892, false);
        } else if (field514 == 45) {
            method4347(class350.field3919, false);
        }
        if (field514 == 30 && field565 == 0 && !arg0 && !field733) {
            for (int var6 = 0; var6 < field722; var6++) {
                if (field725[var6]) {
                    Statics.field2978.method435(field727[var6], field793[var6], field729[var6], field538[var6]);
                    field725[var6] = false;
                }
            }
        } else if (field514 > 0) {
            Statics.field2978.method433(0, 0);
            for (int var7 = 0; var7 < field722; var7++) {
                field725[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.bx(I)V")
    public final void method488() {
        if (Statics.field236.method2574()) {
            Statics.field236.method2564();
        }
        if (Statics.field1054 != null) {
            Statics.field1054.field1080 = false;
        }
        Statics.field1054 = null;
        field568.method2637();
        class36.method3044();
        Statics.field3505 = null;
        if (Statics.field1074 != null) {
            Statics.field1074.method748();
        }
        if (Statics.field3092 != null) {
            Statics.field3092.method748();
        }
        if (Statics.field4271 != null) {
            Statics.field4271.method7263();
        }
        class354.method3393();
        if (Statics.field337 != null) {
            Statics.field337.method2664();
            Statics.field337 = null;
        }
        try {
            class173.field1835.method7934();
            for (int var1 = 0; var1 < Statics.field1831; var1++) {
                Statics.field2966[var1].method7934();
            }
            class173.field1836.method7934();
            class173.field1834.method7934();
        } catch (Exception var3) {
        }
        this.field547.method167();
    }

    @ObfuscatedName("ec.gg(II)V")
    public static void method2711(int arg0) {
        if (field514 == arg0) {
            return;
        }
        if (field514 == 30) {
            field741.method3774();
        }
        if (field514 == 0) {
            Statics.field3874.method493();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method6010(0);
            field559 = 0;
            field783 = 0;
            field512.method6954(arg0);
            if (arg0 != 20) {
                method2970(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1038 != null) {
            Statics.field1038.method7263();
            Statics.field1038 = null;
        }
        if (field514 == 25) {
            field577 = 0;
            field573 = 0;
            field574 = 1;
            field575 = 0;
            field581 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field48.method2336() >= field509;
            int var3 = var2 ? 0 : 12;
            class76.method3364(Statics.field370, Statics.field1874, true, var3);
        } else if (arg0 == 20) {
            int var1 = field514 == 11 ? 4 : 0;
            class76.method3364(Statics.field370, Statics.field1874, false, var1);
        } else if (arg0 == 11) {
            class76.method3364(Statics.field370, Statics.field1874, false, 4);
        } else if (arg0 == 50) {
            class76.method7895("", "Updating date of birth...", "");
            class76.method3364(Statics.field370, Statics.field1874, false, 7);
        } else {
            class76.method662();
        }
        field514 = arg0;
    }

    @ObfuscatedName("client.gi(I)V")
    public void method1138() {
        if (field514 == 1000) {
            return;
        }
        long var1 = class301.method4630();
        int var3 = (int) (var1 - Statics.field101);
        Statics.field101 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class358.field4277 += var3;
        boolean var4;
        if (class358.field4284 == 0 && class358.field4272 == 0 && class358.field4275 == 0 && class358.field4270 == 0) {
            var4 = true;
        } else if (Statics.field4271 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class358.field4277 > 30000) {
                        throw new IOException();
                    }
                    while (class358.field4272 < 200 && class358.field4270 > 0) {
                        class356 var5 = (class356) class358.field4273.method7871();
                        class501 var6 = new class501(4);
                        var6.method8113(1);
                        var6.method8115((int) var5.field4757);
                        Statics.field4271.method7262(var6.field5016, 0, 4);
                        class358.field4267.method7878(var5, var5.field4757);
                        class358.field4270--;
                        class358.field4272++;
                    }
                    while (class358.field4284 < 200 && class358.field4275 > 0) {
                        class356 var7 = (class356) class358.field4281.method6288();
                        class501 var8 = new class501(4);
                        var8.method8113(0);
                        var8.method8115((int) var7.field4757);
                        Statics.field4271.method7262(var8.field5016, 0, 4);
                        var7.method7554();
                        class358.field4276.method7878(var7, var7.field4757);
                        class358.field4275--;
                        class358.field4284++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field4271.method7259();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class358.field4277 = 0;
                        byte var11 = 0;
                        if (Statics.field499 == null) {
                            var11 = 8;
                        } else if (class358.field4279 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class358.field4278.field5017;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field4271.method7261(class358.field4278.field5016, class358.field4278.field5017, var12);
                            if (class358.field4283 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class358.field4278.field5016[class358.field4278.field5017 + var13] ^= class358.field4283;
                                }
                            }
                            class358.field4278.field5017 += var12;
                            if (class358.field4278.field5017 < var11) {
                                break;
                            }
                            if (Statics.field499 == null) {
                                class358.field4278.field5017 = 0;
                                int var14 = class358.field4278.method8129();
                                int var15 = class358.field4278.method8195();
                                int var16 = class358.field4278.method8129();
                                int var17 = class358.field4278.method8134();
                                long var18 = (long) ((var14 << 16) + var15);
                                class356 var20 = (class356) class358.field4267.method7872(var18);
                                Statics.field4804 = true;
                                if (var20 == null) {
                                    var20 = (class356) class358.field4276.method7872(var18);
                                    Statics.field4804 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field499 = var20;
                                Statics.field4366 = new class501(var17 + var21 + Statics.field499.field4248);
                                Statics.field4366.method8113(var16);
                                Statics.field4366.method8270(var17);
                                class358.field4279 = 8;
                                class358.field4278.field5017 = 0;
                            } else if (class358.field4279 == 0) {
                                if (class358.field4278.field5016[0] == -1) {
                                    class358.field4279 = 1;
                                    class358.field4278.field5017 = 0;
                                } else {
                                    Statics.field499 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field4366.field5016.length - Statics.field499.field4248;
                            int var23 = 512 - class358.field4279;
                            if (var23 > var22 - Statics.field4366.field5017) {
                                var23 = var22 - Statics.field4366.field5017;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field4271.method7261(Statics.field4366.field5016, Statics.field4366.field5017, var23);
                            if (class358.field4283 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field4366.field5016[Statics.field4366.field5017 + var24] ^= class358.field4283;
                                }
                            }
                            Statics.field4366.field5017 += var23;
                            class358.field4279 += var23;
                            if (Statics.field4366.field5017 == var22) {
                                if (Statics.field499.field4757 == 16711935L) {
                                    Statics.field4562 = Statics.field4366;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class355 var26 = class358.field4274[var25];
                                        if (var26 != null) {
                                            Statics.method7827(var26, var25);
                                        }
                                    }
                                } else {
                                    class358.field4280.reset();
                                    class358.field4280.update(Statics.field4366.field5016, 0, var22);
                                    int var27 = (int) class358.field4280.getValue();
                                    if (Statics.field499.field4246 != var27) {
                                        try {
                                            Statics.field4271.method7263();
                                        } catch (Exception var33) {
                                        }
                                        class358.field4285++;
                                        Statics.field4271 = null;
                                        class358.field4283 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class358.field4285 = 0;
                                    class358.field4286 = 0;
                                    Statics.field499.field4247.method6049((int) (Statics.field499.field4757 & 0xFFFFL), Statics.field4366.field5016, (Statics.field499.field4757 & 0xFF0000L) == 16711680L, Statics.field4804);
                                }
                                Statics.field499.method7560();
                                if (Statics.field4804) {
                                    class358.field4272--;
                                } else {
                                    class358.field4284--;
                                }
                                class358.field4279 = 0;
                                Statics.field499 = null;
                                Statics.field4366 = null;
                            } else {
                                if (class358.field4279 != 512) {
                                    break;
                                }
                                class358.field4279 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var34) {
                try {
                    Statics.field4271.method7263();
                } catch (Exception var32) {
                }
                class358.field4286++;
                Statics.field4271 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1139();
        }
    }

    @ObfuscatedName("client.gr(I)V")
    public void method1139() {
        if (class358.field4285 >= 4) {
            this.method491("js5crc");
            method2711(1000);
            return;
        }
        if (class358.field4286 >= 4) {
            if (field514 <= 5) {
                this.method491("js5io");
                method2711(1000);
                return;
            }
            field762 = 3000;
            class358.field4286 = 3;
        }
        if (--field762 + 1 > 0) {
            return;
        }
        try {
            if (field629 == 0) {
                Statics.field99 = Statics.field205.method3179(Statics.field87, Statics.field1418);
                field629++;
            }
            if (field629 == 1) {
                if (Statics.field99.field1869 == 2) {
                    this.method1230(-1);
                    return;
                }
                if (Statics.field99.field1869 == 1) {
                    field629++;
                }
            }
            if (field629 == 2) {
                Statics.field2403 = class427.method3911((Socket) Statics.field99.field1866, 40000, 5000);
                class501 var1 = new class501(5);
                var1.method8113(15);
                var1.method8270(214);
                Statics.field2403.method7262(var1.field5016, 0, 5);
                field629++;
                Statics.field1894 = class301.method4630();
            }
            if (field629 == 3) {
                if (Statics.field2403.method7259() > 0) {
                    int var2 = Statics.field2403.method7260();
                    if (var2 != 0) {
                        this.method1230(var2);
                        return;
                    }
                    field629++;
                } else if (class301.method4630() - Statics.field1894 > 30000L) {
                    this.method1230(-2);
                    return;
                }
            }
            if (field629 == 4) {
                class358.method5976(Statics.field2403, field514 > 20);
                Statics.field99 = null;
                Statics.field2403 = null;
                field629 = 0;
                field539 = 0;
            }
        } catch (IOException var4) {
            this.method1230(-3);
        }
    }

    @ObfuscatedName("client.gc(II)V")
    public void method1230(int arg0) {
        Statics.field99 = null;
        Statics.field2403 = null;
        field629 = 0;
        if (Statics.field300 == Statics.field1418) {
            Statics.field1418 = Statics.field985;
        } else {
            Statics.field1418 = Statics.field300;
        }
        field539++;
        if (field539 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field514 <= 5) {
                this.method491("js5connect_full");
                method2711(1000);
            } else {
                field762 = 3000;
            }
        } else if (field539 >= 2 && arg0 == 6) {
            this.method491("js5connect_outofdate");
            method2711(1000);
        } else if (field539 >= 4) {
            if (field514 <= 5) {
                this.method491("js5connect");
                method2711(1000);
            } else {
                field762 = 3000;
            }
        }
    }

    @ObfuscatedName("fz.gn(Lny;Ljava/lang/String;I)V")
    public static void method2908(class355 arg0, String arg1) {
        class84 var2 = new class84(arg0, arg1);
        field802.add(var2);
        field768 += var2.field1033;
    }

    @ObfuscatedName("fu.gp(I)Z")
    public static boolean method2936() {
        if (field802 == null || field803 >= field802.size()) {
            return true;
        }
        while (field803 < field802.size()) {
            class84 var0 = (class84) field802.get(field803);
            if (!var0.method2122()) {
                return false;
            }
            field803++;
        }
        return true;
    }

    @ObfuscatedName("qf.gy(B)I")
    public static int method7119() {
        if (field802 == null || field803 >= field802.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field803; var1++) {
            var0 += ((class84) field802.get(var1)).field1035;
        }
        return var0 * 10000 / field768;
    }

    @ObfuscatedName("dc.gf(II)I")
    public static int method2508(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("gd.gx(III)V")
    public static void method3048(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method2508(var4);
            int var6 = class226.field2523[var4];
            int var7 = arg1 - 334;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 100) {
                var7 = 100;
            }
            int var8 = (field780 - field624) * var7 / 100 + field624;
            int var9 = var5 * var8 / 256;
            var2[var3] = var6 * var9 >> 16;
        }
        class230.method4256(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("fz.gl(I)V")
    public static void method2910() {
        if (field536 == 0) {
            Statics.field238 = new class230(4, 104, 104, class82.field1016);
            for (int var0 = 0; var0 < 4; var0++) {
                field776[var0] = new class213(104, 104);
            }
            Statics.field171 = new class515(512, 512);
            class76.field923 = class350.field3893;
            class76.field956 = 5;
            field536 = 20;
        } else if (field536 == 20) {
            class76.field923 = class350.field3894;
            class76.field956 = 10;
            field536 = 30;
        } else if (field536 == 30) {
            Statics.field4813 = method1775(0, false, true, true, false);
            Statics.field1224 = method1775(1, false, true, true, false);
            Statics.field1077 = method1775(2, true, false, true, false);
            Statics.field1449 = method1775(3, false, true, true, false);
            Statics.field1245 = method1775(4, false, true, true, false);
            Statics.field3406 = method1775(5, true, true, true, false);
            Statics.field255 = method1775(6, true, true, true, false);
            Statics.field4899 = method1775(7, false, true, true, false);
            Statics.field1874 = method1775(8, false, true, true, false);
            Statics.field4348 = method1775(9, false, true, true, false);
            Statics.field370 = method1775(10, false, true, true, false);
            Statics.field2771 = method1775(11, false, true, true, false);
            Statics.field173 = method1775(12, false, true, true, false);
            Statics.field3459 = method1775(13, true, false, true, false);
            Statics.field4320 = method1775(14, false, true, true, false);
            Statics.field86 = method1775(15, false, true, true, false);
            Statics.field4352 = method1775(17, true, true, true, false);
            Statics.field4195 = method1775(18, false, true, true, false);
            Statics.field1010 = method1775(19, false, true, true, false);
            Statics.field3098 = method1775(20, false, true, true, false);
            Statics.field1378 = method1775(21, false, true, true, true);
            class76.field923 = class350.field4146;
            class76.field956 = 20;
            field536 = 40;
        } else if (field536 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field4813.method6056() * 4 / 100;
            int var3 = var2 + Statics.field1224.method6056() * 4 / 100;
            int var4 = var3 + Statics.field1077.method6056() * 2 / 100;
            int var5 = var4 + Statics.field1449.method6056() * 2 / 100;
            int var6 = var5 + Statics.field1245.method6056() * 6 / 100;
            int var7 = var6 + Statics.field3406.method6056() * 4 / 100;
            int var8 = var7 + Statics.field255.method6056() * 2 / 100;
            int var9 = var8 + Statics.field4899.method6056() * 55 / 100;
            int var10 = var9 + Statics.field1874.method6056() * 2 / 100;
            int var11 = var10 + Statics.field4348.method6056() * 2 / 100;
            int var12 = var11 + Statics.field370.method6056() * 2 / 100;
            int var13 = var12 + Statics.field2771.method6056() * 2 / 100;
            int var14 = var13 + Statics.field173.method6056() * 2 / 100;
            int var15 = var14 + Statics.field3459.method6056() * 2 / 100;
            int var16 = var15 + Statics.field4320.method6056() * 2 / 100;
            int var17 = var16 + Statics.field86.method6056() * 2 / 100;
            int var18 = var17 + Statics.field1010.method6056() / 100;
            int var19 = var18 + Statics.field4195.method6056() / 100;
            int var20 = var19 + Statics.field3098.method6056() / 100;
            int var21 = var20 + Statics.field1378.method6056() / 100;
            int var22 = var21 + (Statics.field4352.method6032() && Statics.field4352.method6085() ? 1 : 0);
            if (var22 == 100) {
                method2908(Statics.field4813, "Animations");
                method2908(Statics.field1224, "Skeletons");
                method2908(Statics.field1245, "Sound FX");
                method2908(Statics.field3406, "Maps");
                method2908(Statics.field255, "Music Tracks");
                method2908(Statics.field4899, "Models");
                method2908(Statics.field1874, "Sprites");
                method2908(Statics.field2771, "Music Jingles");
                method2908(Statics.field4320, "Music Samples");
                method2908(Statics.field86, "Music Patches");
                method2908(Statics.field1010, "World Map");
                method2908(Statics.field4195, "World Map Geography");
                method2908(Statics.field3098, "World Map Ground");
                Statics.field4893 = new class433();
                Statics.field4893.method7326(Statics.field4352);
                class76.field923 = class350.field3897;
                class76.field956 = 30;
                field536 = 45;
            } else {
                if (var22 != 0) {
                    class76.field923 = class350.field3999 + var22 + "%";
                }
                class76.field956 = 30;
            }
        } else if (field536 == 45) {
            class43.method5079(22050, !field508, 2);
            class308 var23 = new class308();
            var23.method5233(9, 128);
            Statics.field1074 = class43.method3580(Statics.field205, 0, 22050);
            Statics.field1074.method739(var23);
            class355 var24 = Statics.field86;
            class355 var25 = Statics.field4320;
            class355 var26 = Statics.field1245;
            Statics.field3397 = var24;
            Statics.field3391 = var25;
            Statics.field3387 = var26;
            Statics.field3388 = var23;
            Statics.field3092 = class43.method3580(Statics.field205, 1, 2048);
            Statics.field1945 = new class39();
            Statics.field3092.method739(Statics.field1945);
            Statics.field2260 = new class58(22050, Statics.field292);
            class76.field923 = class350.field3916;
            class76.field956 = 35;
            field536 = 50;
            Statics.field4980 = new class472(Statics.field1874, Statics.field3459);
        } else if (field536 == 50) {
            class473[] var27 = new class473[] { class473.field4895, class473.field4894, class473.field4892, class473.field4900, class473.field4897, class473.field4896 };
            int var28 = var27.length;
            class472 var29 = Statics.field4980;
            class473[] var30 = new class473[] { class473.field4895, class473.field4894, class473.field4892, class473.field4900, class473.field4897, class473.field4896 };
            field527 = var29.method7826(var30);
            if (field527.size() < var28) {
                class76.field923 = class350.field3899 + field527.size() * 100 / var28 + "%";
                class76.field956 = 40;
            } else {
                Statics.field227 = (class392) field527.get(class473.field4896);
                Statics.field4520 = (class392) field527.get(class473.field4895);
                Statics.field1789 = (class392) field527.get(class473.field4894);
                Statics.field1013 = field739.method7567();
                class76.field923 = class350.field3948;
                class76.field956 = 40;
                field536 = 60;
            }
        } else if (field536 == 60) {
            int var31 = class76.method5082(Statics.field370, Statics.field1874);
            class355 var32 = Statics.field1874;
            int var33 = class76.field954.length + class76.field953.length;
            String[] var34 = class76.field934;
            for (int var35 = 0; var35 < var34.length; var35++) {
                String var36 = var34[var35];
                if (var32.method6097(var36) != -1) {
                    var33++;
                }
            }
            if (var31 < var33) {
                class76.field923 = class350.field4174 + var31 * 100 / var33 + "%";
                class76.field956 = 50;
            } else {
                class76.field923 = class350.field4095;
                class76.field956 = 50;
                method2711(5);
                field536 = 70;
            }
        } else if (field536 == 70) {
            if (!Statics.field1077.method6085()) {
                class76.field923 = class350.field3970 + Statics.field1077.method6043() + "%";
                class76.field956 = 60;
            } else if (Statics.field1378.method6085()) {
                class207.method3090(Statics.field1077);
                class199.method5425(Statics.field1077);
                class189.method2732(Statics.field1077, Statics.field4899);
                class205.method1080(Statics.field1077, Statics.field4899, field508);
                class195.method2703(Statics.field1077, Statics.field4899);
                Statics.method237(Statics.field1077);
                class355 var39 = Statics.field1077;
                class355 var40 = Statics.field4899;
                boolean var41 = field507;
                class392 var42 = Statics.field227;
                Statics.field2215 = var39;
                Statics.field2201 = var40;
                Statics.field2247 = var41;
                Statics.field4671 = Statics.field2215.method6135(10);
                Statics.field2936 = var42;
                class208.method7118(Statics.field1077, Statics.field4813, Statics.field1224);
                class198.method1794(Statics.field1077, Statics.field4899);
                class355 var43 = Statics.field1077;
                Statics.field2102 = var43;
                class355 var44 = Statics.field1077;
                Statics.field3401 = var44;
                Statics.field1904 = Statics.field3401.method6135(16);
                class355 var45 = Statics.field1449;
                class355 var46 = Statics.field4899;
                class355 var47 = Statics.field1874;
                class355 var48 = Statics.field3459;
                int var49 = 0;
                if (var45 != null) {
                    Statics.field3594 = var45;
                    Statics.field3454 = var46;
                    Statics.field906 = var47;
                    Statics.field69 = var48;
                    var49 = Statics.field3594.method6092();
                }
                Statics.field84 = new class330[var49][];
                Statics.field1627 = new boolean[var49];
                class185.method5015(Statics.field1077);
                class192.method2933(Statics.field1077);
                class355 var50 = Statics.field1077;
                Statics.field1934 = var50;
                class200.method2876(Statics.field1077);
                class355 var51 = Statics.field1077;
                Statics.field2110 = var51;
                class494.method6563(Statics.field1077);
                class355 var52 = Statics.field1077;
                Statics.field4998 = var52;
                Statics.field888 = new class486(Statics.field3842, 54, Statics.field4618, Statics.field1077);
                Statics.field1276 = new class486(Statics.field3842, 47, Statics.field4618, Statics.field1077);
                Statics.field236 = new class109();
                class355 var53 = Statics.field1077;
                class355 var54 = Statics.field1874;
                class355 var55 = Statics.field3459;
                Statics.field2120 = var53;
                Statics.field2119 = var54;
                Statics.field2126 = var55;
                class355 var56 = Statics.field1077;
                class355 var57 = Statics.field1874;
                Statics.field1958 = var56;
                Statics.field1953 = var57;
                Statics.method1709(Statics.field1077, Statics.field1874);
                class76.field923 = class350.field3904;
                class76.field956 = 60;
                field536 = 80;
            } else {
                class76.field923 = class350.field3970 + (80 + Statics.field173.method6043() / 6) + "%";
                class76.field956 = 60;
            }
        } else if (field536 == 80) {
            int var58 = 0;
            if (Statics.field3399 == null) {
                Statics.field3399 = class516.method2561(Statics.field1874, Statics.field4893.field4664, 0);
            } else {
                var58++;
            }
            if (Statics.field4523 == null) {
                Statics.field4523 = class516.method2561(Statics.field1874, Statics.field4893.field4655, 0);
            } else {
                var58++;
            }
            if (Statics.field335 == null) {
                class355 var59 = Statics.field1874;
                int var60 = Statics.field4893.field4654;
                byte[] var61 = var59.method6080(var60, 0);
                boolean var62;
                if (var61 == null) {
                    var62 = false;
                } else {
                    class516.method8451(var61);
                    var62 = true;
                }
                class514[] var63;
                if (var62) {
                    class514[] var64 = new class514[Statics.field5128];
                    for (int var65 = 0; var65 < Statics.field5128; var65++) {
                        class514 var66 = var64[var65] = new class514();
                        var66.field5112 = Statics.field3756;
                        var66.field5113 = Statics.field4971;
                        var66.field5106 = Statics.field5127[var65];
                        var66.field5110 = Statics.field4512[var65];
                        var66.field5108 = Statics.field5126[var65];
                        var66.field5109 = Statics.field5129[var65];
                        var66.field5107 = Statics.field5130;
                        var66.field5111 = Statics.field5131[var65];
                    }
                    class516.method4394();
                    var63 = var64;
                } else {
                    var63 = null;
                }
                Statics.field335 = var63;
            } else {
                var58++;
            }
            if (Statics.field2024 == null) {
                Statics.field2024 = class516.method5081(Statics.field1874, Statics.field4893.field4657, 0);
            } else {
                var58++;
            }
            if (Statics.field1732 == null) {
                Statics.field1732 = class516.method5081(Statics.field1874, Statics.field4893.field4658, 0);
            } else {
                var58++;
            }
            if (Statics.field253 == null) {
                Statics.field253 = class516.method5081(Statics.field1874, Statics.field4893.field4659, 0);
            } else {
                var58++;
            }
            if (Statics.field1254 == null) {
                Statics.field1254 = class516.method5081(Statics.field1874, Statics.field4893.field4656, 0);
            } else {
                var58++;
            }
            if (Statics.field58 == null) {
                Statics.field58 = class516.method5081(Statics.field1874, Statics.field4893.field4661, 0);
            } else {
                var58++;
            }
            if (Statics.field102 == null) {
                Statics.field102 = class516.method5081(Statics.field1874, Statics.field4893.field4662, 0);
            } else {
                var58++;
            }
            if (Statics.field4559 == null) {
                class355 var68 = Statics.field1874;
                int var69 = Statics.field4893.field4663;
                byte[] var70 = var68.method6080(var69, 0);
                boolean var71;
                if (var70 == null) {
                    var71 = false;
                } else {
                    class516.method8451(var70);
                    var71 = true;
                }
                class514[] var72;
                if (var71) {
                    class514[] var73 = new class514[Statics.field5128];
                    for (int var74 = 0; var74 < Statics.field5128; var74++) {
                        class514 var75 = var73[var74] = new class514();
                        var75.field5112 = Statics.field3756;
                        var75.field5113 = Statics.field4971;
                        var75.field5106 = Statics.field5127[var74];
                        var75.field5110 = Statics.field4512[var74];
                        var75.field5108 = Statics.field5126[var74];
                        var75.field5109 = Statics.field5129[var74];
                        var75.field5107 = Statics.field5130;
                        var75.field5111 = Statics.field5131[var74];
                    }
                    class516.method4394();
                    var72 = var73;
                } else {
                    var72 = null;
                }
                Statics.field4559 = var72;
            } else {
                var58++;
            }
            if (Statics.field2049 == null) {
                class355 var77 = Statics.field1874;
                int var78 = Statics.field4893.field4660;
                byte[] var79 = var77.method6080(var78, 0);
                boolean var80;
                if (var79 == null) {
                    var80 = false;
                } else {
                    class516.method8451(var79);
                    var80 = true;
                }
                class514[] var81;
                if (var80) {
                    class514[] var82 = new class514[Statics.field5128];
                    for (int var83 = 0; var83 < Statics.field5128; var83++) {
                        class514 var84 = var82[var83] = new class514();
                        var84.field5112 = Statics.field3756;
                        var84.field5113 = Statics.field4971;
                        var84.field5106 = Statics.field5127[var83];
                        var84.field5110 = Statics.field4512[var83];
                        var84.field5108 = Statics.field5126[var83];
                        var84.field5109 = Statics.field5129[var83];
                        var84.field5107 = Statics.field5130;
                        var84.field5111 = Statics.field5131[var83];
                    }
                    class516.method4394();
                    var81 = var82;
                } else {
                    var81 = null;
                }
                Statics.field2049 = var81;
            } else {
                var58++;
            }
            if (var58 < 11) {
                class76.field923 = class350.field3905 + var58 * 100 / 12 + "%";
                class76.field956 = 70;
            } else {
                Statics.field4455 = Statics.field2049;
                Statics.field4523.method8585();
                int var86 = (int) (Math.random() * 21.0D) - 10;
                int var87 = (int) (Math.random() * 21.0D) - 10;
                int var88 = (int) (Math.random() * 21.0D) - 10;
                int var89 = (int) (Math.random() * 41.0D) - 20;
                Statics.field335[0].method8563(var86 + var89, var87 + var89, var88 + var89);
                class76.field923 = class350.field4140;
                class76.field956 = 70;
                field536 = 90;
            }
        } else if (field536 == 90) {
            if (Statics.field4348.method6085()) {
                Statics.field1379 = new class236(Statics.field4348, Statics.field1874, 20, Statics.field48.method2312(), field508 ? 64 : 128);
                class226.method4011(Statics.field1379);
                class226.method4012(Statics.field48.method2312());
                field536 = 100;
            } else {
                class76.field923 = class350.field4188 + "0%";
                class76.field956 = 90;
            }
        } else if (field536 == 100) {
            int var90 = Statics.field1379.method4364();
            if (var90 < 100) {
                class76.field923 = class350.field4188 + var90 + "%";
                class76.field956 = 90;
            } else {
                class76.field923 = class350.field3927;
                class76.field956 = 90;
                field536 = 110;
            }
        } else if (field536 == 110) {
            Statics.field1054 = new class89();
            Statics.field205.method3180(Statics.field1054, 10);
            class76.field923 = class350.field3909;
            class76.field956 = 92;
            field536 = 120;
        } else if (field536 == 120) {
            if (Statics.field370.method6101("huffman", "")) {
                class332 var91 = new class332(Statics.field370.method6100("huffman", ""));
                Statics.field3764 = var91;
                class76.field923 = class350.field4010;
                class76.field956 = 94;
                field536 = 130;
            } else {
                class76.field923 = class350.field3910 + "%";
                class76.field956 = 94;
            }
        } else if (field536 == 130) {
            if (!Statics.field1449.method6085()) {
                class76.field923 = class350.field3953 + Statics.field1449.method6043() * 4 / 5 + "%";
                class76.field956 = 96;
            } else if (!Statics.field173.method6085()) {
                class76.field923 = class350.field3953 + (80 + Statics.field173.method6043() / 6) + "%";
                class76.field956 = 96;
            } else if (Statics.field3459.method6085()) {
                class76.field923 = class350.field3913;
                class76.field956 = 98;
                if (Statics.field173.method6099("version.dat", "")) {
                    class501 var92 = new class501(Statics.field173.method6100("version.dat", ""));
                    var92.method8195();
                }
                field536 = 140;
            } else {
                class76.field923 = class350.field3953 + (96 + Statics.field3459.method6043() / 50) + "%";
                class76.field956 = 96;
            }
        } else if (field536 == 140) {
            class76.field956 = 100;
            if (Statics.field1010.method6092() <= 0 || Statics.field1010.method6102(class275.field3050.field3044)) {
                if (Statics.field479 == null) {
                    Statics.field479 = new class471();
                    Statics.field479.method7646(Statics.field1010, Statics.field4195, Statics.field3098, Statics.field1789, field527, Statics.field335);
                }
                class76.field923 = class350.field3915;
                field536 = 150;
            } else {
                class76.field923 = class350.field3966 + Statics.field1010.method6104(class275.field3050.field3044) / 10 + "%";
            }
        } else if (field536 == 150) {
            method2711(10);
        }
    }

    @ObfuscatedName("ck.gj(IZZZZI)Lny;")
    public static class355 method1775(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class431 var5 = null;
        if (class173.field1835 != null) {
            var5 = new class431(arg0, class173.field1835, Statics.field2966[arg0], 1000000);
        }
        return new class355(var5, Statics.field1634, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.gu(I)V")
    public final void method1141() {
        class427 var1 = field568.method2639();
        class500 var2 = field568.field1392;
        try {
            if (field545 == 0) {
                if (Statics.field1604 == null && (field564.method2031() || field559 > 250)) {
                    Statics.field1604 = field564.method2029();
                    field564.method2028();
                    field564 = null;
                }
                if (Statics.field1604 != null) {
                    if (var1 != null) {
                        var1.method7263();
                        var1 = null;
                    }
                    Statics.field859 = null;
                    field570 = false;
                    field559 = 0;
                    if (!field634.method8431()) {
                        method6010(1);
                    } else if (this.method1132()) {
                        try {
                            this.method1135(Statics.field9);
                            method6010(21);
                        } catch (Throwable var71) {
                            class528.method4947((String) null, var71);
                            method4995(65);
                            return;
                        }
                    } else if (this.method1133()) {
                        try {
                            this.method1137(Statics.field3789, Statics.field4611);
                            method6010(20);
                        } catch (Exception var70) {
                            class528.method4947((String) null, var70);
                            method4995(65);
                            return;
                        }
                    } else {
                        method4995(65);
                        return;
                    }
                }
            }
            if (field545 == 21) {
                if (this.field554 == null) {
                    if (this.field552 == null) {
                        method4995(65);
                        return;
                    }
                    if (!this.field552.method268()) {
                        return;
                    }
                    if (this.field552.method273()) {
                        class528.method4947(this.field552.method267(), (Throwable) null);
                        method4995(65);
                        this.field552 = null;
                        return;
                    }
                    class21 var7 = this.field552.method269();
                    if (var7.method292() != 200) {
                        method4995(65);
                        this.field552 = null;
                        return;
                    }
                    field559 = 0;
                    class451 var8 = new class451(var7.method295());
                    try {
                        Statics.field301 = var8.method7529().getString("access_token");
                        Statics.field9 = var8.method7529().getString("refresh_token");
                    } catch (Exception var68) {
                        class528.method4947("Error parsing tokens", var68);
                        method4995(65);
                        this.field552 = null;
                        return;
                    }
                } else if (this.field554.isDone()) {
                    if (this.field554.isCancelled()) {
                        method4995(65);
                        this.field554 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field554.get();
                        if (!var5.isSuccess()) {
                            method4995(65);
                            this.field554 = null;
                            return;
                        }
                        Statics.field301 = var5.getAccessToken();
                        Statics.field9 = var5.getRefreshToken();
                        this.field554 = null;
                    } catch (Exception var69) {
                        class528.method4947((String) null, var69);
                        method4995(65);
                        this.field554 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1282(Statics.field301);
                method6010(20);
            }
            if (field545 == 20) {
                if (this.field550 == null) {
                    if (this.field645 == null) {
                        method4995(65);
                        return;
                    }
                    if (!this.field645.method268()) {
                        return;
                    }
                    if (this.field645.method273()) {
                        class528.method4947(this.field645.method267(), (Throwable) null);
                        method4995(65);
                        this.field645 = null;
                        return;
                    }
                    class21 var12 = this.field645.method269();
                    if (var12.method292() != 200) {
                        class528.method4947("Response code: " + var12.method292() + "Response body: " + var12.method295(), (Throwable) null);
                        method4995(65);
                        this.field645 = null;
                        return;
                    }
                    List var13 = (List) var12.method291().get("Content-Type");
                    if (var13 != null && var13.contains(class449.field4718.method7516())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method295());
                            this.field709 = var14.getString("token");
                        } catch (JSONException var66) {
                            class528.method4947((String) null, var66);
                            method4995(65);
                            this.field645 = null;
                            return;
                        }
                    } else {
                        this.field709 = var12.method295();
                    }
                    this.field645 = null;
                } else if (this.field550.isDone()) {
                    if (this.field550.isCancelled()) {
                        method4995(65);
                        this.field550 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field550.get();
                        if (!var10.isSuccess()) {
                            method4995(65);
                            this.field550 = null;
                            return;
                        }
                        this.field709 = var10.getToken();
                        this.field550 = null;
                    } catch (Exception var67) {
                        class528.method4947((String) null, var67);
                        method4995(65);
                        this.field550 = null;
                        return;
                    }
                } else {
                    return;
                }
                field559 = 0;
                method6010(1);
            }
            if (field545 == 1) {
                if (Statics.field859 == null) {
                    Statics.field859 = Statics.field205.method3179(Statics.field87, Statics.field1418);
                }
                if (Statics.field859.field1869 == 2) {
                    throw new IOException();
                }
                if (Statics.field859.field1869 == 1) {
                    var1 = class427.method3911((Socket) Statics.field859.field1866, 40000, 5000);
                    field568.method2636(var1);
                    Statics.field859 = null;
                    method6010(2);
                }
            }
            if (field545 == 2) {
                field568.method2634();
                class296 var16 = class296.method3351();
                var16.field3211.method8113(class298.field3343.field3350);
                field568.method2642(var16);
                field568.method2633();
                var2.field5017 = 0;
                method6010(3);
            }
            if (field545 == 3) {
                if (Statics.field1074 != null) {
                    Statics.field1074.method741();
                }
                if (Statics.field3092 != null) {
                    Statics.field3092.method741();
                }
                if (var1.method7274(1)) {
                    int var17 = var1.method7260();
                    if (Statics.field1074 != null) {
                        Statics.field1074.method741();
                    }
                    if (Statics.field3092 != null) {
                        Statics.field3092.method741();
                    }
                    if (var17 != 0) {
                        method4995(var17);
                        return;
                    }
                    var2.field5017 = 0;
                    method6010(4);
                }
            }
            if (field545 == 4) {
                if (var2.field5017 < 8) {
                    int var18 = var1.method7259();
                    if (var18 > 8 - var2.field5017) {
                        var18 = 8 - var2.field5017;
                    }
                    if (var18 > 0) {
                        var1.method7261(var2.field5016, var2.field5017, var18);
                        var2.field5017 += var18;
                    }
                }
                if (var2.field5017 == 8) {
                    var2.field5017 = 0;
                    Statics.field3476 = var2.method8135();
                    method6010(5);
                }
            }
            if (field545 == 5) {
                field568.field1392.field5017 = 0;
                field568.method2634();
                class500 var19 = new class500(500);
                int[] var20 = new int[] { Statics.field1604.nextInt(), Statics.field1604.nextInt(), Statics.field1604.nextInt(), Statics.field1604.nextInt() };
                var19.field5017 = 0;
                var19.method8113(1);
                var19.method8270(var20[0]);
                var19.method8270(var20[1]);
                var19.method8270(var20[2]);
                var19.method8270(var20[3]);
                var19.method8117(Statics.field3476);
                if (field514 == 40) {
                    var19.method8270(Statics.field2269[0]);
                    var19.method8270(Statics.field2269[1]);
                    var19.method8270(Statics.field2269[2]);
                    var19.method8270(Statics.field2269[3]);
                } else {
                    if (field514 == 50) {
                        var19.method8113(class139.field1611.method33());
                        var19.method8270(Statics.field2851);
                    } else {
                        var19.method8113(field678.method33());
                        switch(field678.field1612) {
                            case 0:
                            case 4:
                                var19.method8115(Statics.field3522);
                                var19.field5017++;
                                break;
                            case 1:
                                var19.method8270(Statics.field48.method2341(class76.field941));
                                break;
                            case 2:
                                var19.field5017 += 4;
                            case 3:
                        }
                    }
                    if (field634.method8431()) {
                        var19.method8113(class506.field5074.method33());
                        var19.method8119(this.field709);
                    } else {
                        var19.method8113(class506.field5075.method33());
                        var19.method8119(class76.field937);
                    }
                }
                var19.method8275(class75.field914, class75.field908);
                Statics.field2269 = var20;
                class296 var21 = class296.method3351();
                var21.field3211.field5017 = 0;
                if (field514 == 40) {
                    var21.field3211.method8113(class298.field3345.field3350);
                } else {
                    var21.field3211.method8113(class298.field3344.field3350);
                }
                var21.field3211.method8114(0);
                int var22 = var21.field3211.field5017;
                var21.field3211.method8270(214);
                var21.field3211.method8270(1);
                var21.field3211.method8113(field510);
                var21.field3211.method8113(field511);
                byte var23 = 0;
                var21.field3211.method8113(var23);
                var21.field3211.method8122(var19.field5016, 0, var19.field5017);
                int var24 = var21.field3211.field5017;
                var21.field3211.method8119(class76.field941);
                var21.field3211.method8113((field733 ? 1 : 0) << 1 | (field508 ? 1 : 0));
                var21.field3211.method8114(Statics.field4720);
                var21.field3211.method8114(Statics.field3024);
                class500 var25 = var21.field3211;
                if (field562 == null) {
                    byte[] var26 = class173.method5032();
                    var25.method8122(var26, 0, var26.length);
                } else {
                    var25.method8122(field562, 0, field562.length);
                }
                var21.field3211.method8119(Statics.field4711);
                var21.field3211.method8270(Statics.field1727);
                if (field513 > 213) {
                    var21.field3211.method8113(0);
                }
                class501 var27 = new class501(Statics.field1013.method7582());
                Statics.field1013.method7586(var27);
                var21.field3211.method8122(var27.field5016, 0, var27.field5016.length);
                var21.field3211.method8113(field510);
                var21.field3211.method8270(0);
                var21.field3211.method8270(Statics.field4352.field4259);
                var21.field3211.method8181(Statics.field1874.field4259);
                var21.field3211.method8182(0);
                var21.field3211.method8270(Statics.field2771.field4259);
                var21.field3211.method8139(Statics.field3098.field4259);
                var21.field3211.method8270(Statics.field86.field4259);
                var21.field3211.method8270(Statics.field370.field4259);
                var21.field3211.method8181(Statics.field1449.field4259);
                var21.field3211.method8182(Statics.field4348.field4259);
                var21.field3211.method8181(Statics.field4195.field4259);
                var21.field3211.method8270(Statics.field1077.field4259);
                var21.field3211.method8270(Statics.field4813.field4259);
                var21.field3211.method8139(Statics.field3459.field4259);
                var21.field3211.method8181(Statics.field1224.field4259);
                var21.field3211.method8270(Statics.field255.field4259);
                var21.field3211.method8181(Statics.field173.field4259);
                var21.field3211.method8139(Statics.field4899.field4259);
                var21.field3211.method8270(Statics.field4320.field4259);
                var21.field3211.method8181(Statics.field1010.field4259);
                var21.field3211.method8182(Statics.field1245.field4259);
                var21.field3211.method8181(Statics.field3406.field4259);
                var21.field3211.method8327(var20, var24, var21.field3211.field5017);
                var21.field3211.method8239(var21.field3211.field5017 - var22);
                field568.method2642(var21);
                field568.method2633();
                field568.field1380 = new class518(var20);
                int[] var28 = new int[4];
                for (int var29 = 0; var29 < 4; var29++) {
                    var28[var29] = var20[var29] + 50;
                }
                var2.method8079(var28);
                method6010(6);
            }
            if (field545 == 6 && var1.method7259() > 0) {
                int var30 = var1.method7260();
                if (var30 == 61) {
                    int var31 = var1.method7259();
                    Statics.field1402 = var31 == 1 && var1.method7260() == 1;
                    method6010(5);
                }
                if (var30 == 21 && field514 == 20) {
                    method6010(12);
                } else if (var30 == 2) {
                    method6010(14);
                } else if (var30 == 15 && field514 == 40) {
                    field568.field1387 = -1;
                    method6010(19);
                } else if (var30 == 64) {
                    method6010(10);
                } else if (var30 == 23 && field783 < 1) {
                    field783++;
                    method6010(0);
                } else if (var30 == 29) {
                    method6010(17);
                } else if (var30 == 69) {
                    method6010(7);
                } else {
                    method4995(var30);
                    return;
                }
            }
            if (field545 == 7 && var1.method7259() >= 2) {
                var1.method7261(var2.field5016, 0, 2);
                var2.field5017 = 0;
                Statics.field1571 = var2.method8195();
                method6010(8);
            }
            if (field545 == 8 && var1.method7259() >= Statics.field1571) {
                var2.field5017 = 0;
                var1.method7261(var2.field5016, var2.field5017, Statics.field1571);
                class7[] var32 = new class7[] { class7.field18 };
                class7 var33 = var32[var2.method8129()];
                try {
                    switch(var33.field16) {
                        case 0:
                            class1 var34 = new class1();
                            this.field653 = new class8(var2, var34);
                            method6010(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var65) {
                    method4995(22);
                    return;
                }
            }
            if (field545 == 9 && this.field653.method36()) {
                this.field747 = this.field653.method39();
                this.field653.method49();
                this.field653 = null;
                if (this.field747 == null) {
                    method4995(22);
                    return;
                }
                field568.method2634();
                class296 var37 = class296.method3351();
                var37.field3211.method8113(class298.field3346.field3350);
                var37.field3211.method8114(this.field747.field5017);
                var37.field3211.method8123(this.field747);
                field568.method2642(var37);
                field568.method2633();
                this.field747 = null;
                method6010(6);
            }
            if (field545 == 10 && var1.method7259() > 0) {
                Statics.field1367 = var1.method7260();
                method6010(11);
            }
            if (field545 == 11 && var1.method7259() >= Statics.field1367) {
                var1.method7261(var2.field5016, 0, Statics.field1367);
                var2.field5017 = 0;
                method6010(6);
            }
            if (field545 == 12 && var1.method7259() > 0) {
                field543 = (var1.method7260() + 3) * 60;
                method6010(13);
            }
            if (field545 == 13) {
                field559 = 0;
                class76.method7895(class350.field3922, class350.field3908, field543 / 60 + class350.field4099);
                if (--field543 <= 0) {
                    method6010(0);
                }
            } else {
                if (field545 == 14 && var1.method7259() >= 1) {
                    Statics.field3525 = var1.method7260();
                    method6010(15);
                }
                if (field545 == 15 && var1.method7259() >= Statics.field3525) {
                    boolean var38 = var1.method7260() == 1;
                    var1.method7261(var2.field5016, 0, 4);
                    var2.field5017 = 0;
                    boolean var39 = false;
                    if (var38) {
                        int var40 = var2.method8076() << 24;
                        int var41 = var40 | var2.method8076() << 16;
                        int var42 = var41 | var2.method8076() << 8;
                        int var43 = var42 | var2.method8076();
                        Statics.field48.method2339(class76.field941, var43);
                    }
                    if (field557) {
                        Statics.field48.method2314(class76.field941);
                    } else {
                        Statics.field48.method2314((String) null);
                    }
                    class98.method2500();
                    field682 = var1.method7260();
                    field766 = var1.method7260() == 1;
                    field630 = var1.method7260();
                    field630 <<= 0x8;
                    field630 += var1.method7260();
                    field631 = var1.method7260();
                    var1.method7261(var2.field5016, 0, 8);
                    var2.field5017 = 0;
                    this.field561 = var2.method8135();
                    var1.method7261(var2.field5016, 0, 8);
                    var2.field5017 = 0;
                    field632 = var2.method8135();
                    if (field513 >= 214) {
                        var1.method7261(var2.field5016, 0, 8);
                        var2.field5017 = 0;
                        var2.method8135();
                    }
                    var1.method7261(var2.field5016, 0, 1);
                    var2.field5017 = 0;
                    class297[] var44 = class297.method4946();
                    int var45 = var2.method8078();
                    if (var45 < 0 || var45 >= var44.length) {
                        throw new IOException(var45 + " " + var2.field5017);
                    }
                    field568.field1386 = var44[var45];
                    field568.field1387 = field568.field1386.field3340;
                    var1.method7261(var2.field5016, 0, 2);
                    var2.field5017 = 0;
                    field568.field1387 = var2.method8195();
                    try {
                        class27.method371(Statics.field3874, "zap");
                    } catch (Throwable var64) {
                    }
                    method6010(16);
                }
                if (field545 != 16) {
                    if (field545 == 17 && var1.method7259() >= 2) {
                        var2.field5017 = 0;
                        var1.method7261(var2.field5016, 0, 2);
                        var2.field5017 = 0;
                        Statics.field4444 = var2.method8195();
                        method6010(18);
                    }
                    if (field545 == 18 && var1.method7259() >= Statics.field4444) {
                        var2.field5017 = 0;
                        var1.method7261(var2.field5016, 0, Statics.field4444);
                        var2.field5017 = 0;
                        String var59 = var2.method8253();
                        String var60 = var2.method8253();
                        String var61 = var2.method8253();
                        class76.method7895(var59, var60, var61);
                        method2711(10);
                        if (field634.method8431()) {
                            Statics.method6605(9);
                        }
                    }
                    if (field545 == 19) {
                        if (field568.field1387 == -1) {
                            if (var1.method7259() < 2) {
                                return;
                            }
                            var1.method7261(var2.field5016, 0, 2);
                            var2.field5017 = 0;
                            field568.field1387 = var2.method8195();
                        }
                        if (var1.method7259() >= field568.field1387) {
                            var1.method7261(var2.field5016, 0, field568.field1387);
                            var2.field5017 = 0;
                            int var62 = field568.field1387;
                            field512.method6970();
                            method2237();
                            class107.method3021(var2);
                            if (var2.field5017 != var62) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field559++;
                        if (field559 > 2000) {
                            if (field783 < 1) {
                                if (Statics.field300 == Statics.field1418) {
                                    Statics.field1418 = Statics.field985;
                                } else {
                                    Statics.field1418 = Statics.field300;
                                }
                                field783++;
                                method6010(0);
                            } else {
                                method4995(-3);
                            }
                        }
                    }
                } else if (var1.method7259() >= field568.field1387) {
                    var2.field5017 = 0;
                    var1.method7261(var2.field5016, 0, field568.field1387);
                    field512.method6955();
                    field519 = 1L;
                    Statics.field1054.field1075 = 0;
                    Statics.field156 = true;
                    field608 = true;
                    field745 = -1L;
                    class37.method179();
                    field568.method2634();
                    field568.field1392.field5017 = 0;
                    field568.field1386 = null;
                    field568.field1391 = null;
                    field568.field1394 = null;
                    field568.field1393 = null;
                    field568.field1387 = 0;
                    field568.field1389 = 0;
                    field524 = 0;
                    field569 = 0;
                    field525 = 0;
                    method2228();
                    class36.field219 = 0;
                    class110.field1374.clear();
                    class110.field1375.method7850();
                    class110.field1376.method6449();
                    class110.field1377 = 0;
                    field667 = 0;
                    field669 = false;
                    field684 = 0;
                    field590 = 0;
                    field595 = 0;
                    Statics.field153 = null;
                    field755 = 0;
                    field748 = -1;
                    field753 = 0;
                    field754 = 0;
                    field533 = class103.field1311;
                    field797 = class103.field1311;
                    field542 = 0;
                    class107.method2163();
                    for (int var47 = 0; var47 < 2048; var47++) {
                        field613[var47] = null;
                    }
                    for (int var48 = 0; var48 < 65536; var48++) {
                        field563[var48] = null;
                    }
                    field641 = -1;
                    field644.method6314();
                    field685.method6314();
                    for (int var49 = 0; var49 < 4; var49++) {
                        for (int var50 = 0; var50 < 104; var50++) {
                            for (int var51 = 0; var51 < 104; var51++) {
                                field642[var49][var50][var51] = null;
                            }
                        }
                    }
                    field643 = new class376();
                    Statics.field497.method1718();
                    for (int var52 = 0; var52 < Statics.field1904; var52++) {
                        class186 var53 = class186.method2498(var52);
                        if (var53 != null) {
                            class320.field3513[var52] = 0;
                            class320.field3514[var52] = 0;
                        }
                    }
                    Statics.field236.method2582();
                    field683 = -1;
                    if (field799 != -1) {
                        class330.method5134(field799);
                    }
                    for (class87 var54 = (class87) field675.method7871(); var54 != null; var54 = (class87) field675.method7879()) {
                        method815(var54, true);
                    }
                    field799 = -1;
                    field675 = new class477(8);
                    field679 = null;
                    method2228();
                    field790.method5434((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
                    for (int var55 = 0; var55 < 8; var55++) {
                        field721[var55] = null;
                        field639[var55] = false;
                    }
                    class85.method35();
                    field517 = true;
                    for (int var56 = 0; var56 < 100; var56++) {
                        field724[var56] = true;
                    }
                    class296 var57 = class296.method3619(class294.field3196, field568.field1380);
                    var57.field3211.method8113(method4406());
                    var57.field3211.method8114(Statics.field4720);
                    var57.field3211.method8114(Statics.field3024);
                    field568.method2642(var57);
                    Statics.field4535 = null;
                    Statics.field4412 = null;
                    Arrays.fill(field593, (Object) null);
                    Statics.field2051 = null;
                    Arrays.fill(field720, (Object) null);
                    for (int var58 = 0; var58 < 8; var58++) {
                        field794[var58] = new class366();
                    }
                    Statics.field4323 = null;
                    class107.method3021(var2);
                    Statics.field2315 = -1;
                    method288(false, var2);
                    field568.field1386 = null;
                }
            }
        } catch (IOException var72) {
            if (field783 < 1) {
                if (Statics.field300 == Statics.field1418) {
                    Statics.field1418 = Statics.field985;
                } else {
                    Statics.field1418 = Statics.field300;
                }
                field783++;
                method6010(0);
            } else {
                method4995(-2);
            }
        }
    }

    @ObfuscatedName("dv.gq(I)V")
    public static void method2237() {
        field568.method2634();
        field568.field1392.field5017 = 0;
        field568.field1386 = null;
        field568.field1391 = null;
        field568.field1394 = null;
        field568.field1393 = null;
        field568.field1387 = 0;
        field568.field1389 = 0;
        field524 = 0;
        method2228();
        field755 = 0;
        field753 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field613[var0] = null;
        }
        Statics.field971 = null;
        for (int var1 = 0; var1 < field563.length; var1++) {
            class100 var2 = field563[var1];
            if (var2 != null) {
                var2.field1187 = -1;
                var2.field1188 = false;
            }
        }
        class85.method35();
        method2711(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field724[var3] = true;
        }
        class296 var4 = class296.method3619(class294.field3196, field568.field1380);
        var4.field3211.method8113(method4406());
        var4.field3211.method8114(Statics.field4720);
        var4.field3211.method8114(Statics.field3024);
        field568.method2642(var4);
    }

    @ObfuscatedName("kv.gs(IB)V")
    public static void method4995(int arg0) {
        int var1 = class76.method2886();
        if (arg0 == -3) {
            class76.method7895(class350.field3925, class350.field4172, class350.field3898);
        } else if (arg0 == -2) {
            class76.method7895(class350.field3928, class350.field3935, class350.field3912);
        } else if (arg0 == -1) {
            class76.method7895(class350.field4132, class350.field3932, class350.field3998);
        } else if (arg0 == 3) {
            Statics.method6605(3);
            class76.field930 = 1;
        } else if (arg0 == 4) {
            Statics.method6605(14);
            class76.field926 = 0;
        } else if (arg0 == 5) {
            class76.field930 = 2;
            class76.method7895(class350.field3937, class350.field3938, class350.field3983);
        } else if (arg0 == 68 || !(field804 || arg0 != 6)) {
            class76.method7895(class350.field3940, class350.field3941, class350.field3942);
        } else if (arg0 == 7) {
            class76.method7895(class350.field3943, class350.field3944, class350.field3945);
        } else if (arg0 == 8) {
            class76.method7895(class350.field3946, class350.field3947, class350.field4138);
        } else if (arg0 == 9) {
            class76.method7895(class350.field3949, class350.field3950, class350.field3997);
        } else if (arg0 == 10) {
            class76.method7895(class350.field3952, class350.field4176, class350.field3954);
        } else if (arg0 == 11) {
            class76.method7895(class350.field3955, class350.field3956, class350.field3957);
        } else if (arg0 == 12) {
            class76.method7895(class350.field4109, class350.field3959, class350.field3960);
        } else if (arg0 == 13) {
            class76.method7895(class350.field3961, class350.field3962, class350.field3923);
        } else if (arg0 == 14) {
            class76.method7895(class350.field3964, class350.field3965, class350.field3930);
        } else if (arg0 == 16) {
            class76.method7895(class350.field3967, class350.field4167, class350.field4027);
            Statics.method6605(33);
        } else if (arg0 == 17) {
            class76.method7895(class350.field3926, class350.field3971, class350.field3972);
        } else if (arg0 == 18) {
            Statics.method6605(14);
            class76.field926 = 1;
        } else if (arg0 == 19) {
            class76.method7895(class350.field4078, class350.field4080, class350.field4170);
        } else if (arg0 == 20) {
            class76.method7895(class350.field3979, class350.field3980, class350.field3981);
        } else if (arg0 == 22) {
            class76.method7895(class350.field4106, class350.field4118, class350.field3984);
        } else if (arg0 == 23) {
            class76.method7895(class350.field3985, class350.field3986, class350.field3951);
        } else if (arg0 == 24) {
            class76.method7895(class350.field3988, class350.field3939, class350.field3990);
        } else if (arg0 == 25) {
            class76.method7895(class350.field3906, class350.field3992, class350.field3993);
        } else if (arg0 == 26) {
            class76.method7895(class350.field3994, class350.field3995, class350.field4136);
        } else if (arg0 == 27) {
            class76.method7895(class350.field3931, class350.field4060, class350.field3969);
        } else if (arg0 == 31) {
            class76.method7895(class350.field4006, class350.field4145, class350.field4134);
        } else if (arg0 == 32) {
            Statics.method6605(14);
            class76.field926 = 2;
        } else if (arg0 == 37) {
            class76.method7895(class350.field4031, class350.field4013, class350.field4014);
        } else if (arg0 == 38) {
            class76.method7895(class350.field4015, class350.field4012, class350.field4017);
        } else if (arg0 == 55) {
            Statics.method6605(8);
        } else if (arg0 == 56) {
            class76.method7895(class350.field4022, class350.field4023, class350.field4024);
            method2711(11);
            return;
        } else if (arg0 == 57) {
            class76.method7895(class350.field4102, class350.field4041, class350.field4128);
            method2711(11);
            return;
        } else if (arg0 == 61) {
            class76.method7895("", "Please enter your date of birth (DD/MM/YYYY)", "");
            Statics.method6605(7);
        } else if (arg0 == 62) {
            method2711(10);
            Statics.method6605(9);
            class76.method7895(class350.field4119, class350.field4029, class350.field4028);
            return;
        } else if (arg0 == 63) {
            method2711(10);
            Statics.method6605(9);
            class76.method7895(class350.field4153, class350.field4032, class350.field4033);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method2711(10);
            Statics.method6605(9);
            class76.method7895(class350.field4034, class350.field4035, class350.field4036);
            return;
        } else if (arg0 == 71) {
            method2711(10);
            Statics.method6605(7);
            class76.method7895("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method2711(10);
            Statics.method6605(6);
            class76.method7895(class350.field3933, class350.field4178, class350.field4169);
        } else if (arg0 == 72) {
            method2711(10);
            Statics.method6605(32);
        } else {
            class76.method7895(class350.field4037, class350.field4038, class350.field3924);
        }
        method2711(10);
        boolean var2 = var1 != class76.method2886();
        if (!var2 && field634.method8431()) {
            Statics.method6605(9);
        }
    }

    @ObfuscatedName("ck.he(I)V")
    public static final void method1777() {
        field568.method2637();
        class207.field2258.method5124();
        class199.method7990();
        class189.field1941.method5124();
        class205.field2147.method5124();
        class205.field2154.method5124();
        class205.field2149.method5124();
        class205.field2150.method5124();
        class195.method2935();
        class206.field2207.method5124();
        class206.field2204.method5124();
        class206.field2203.method5124();
        class208.method3302();
        class198.method5025();
        class201.method2113();
        class186.method2940();
        Statics.field888.method7965();
        Statics.field1276.method7965();
        class204.method5131();
        class190.method3269();
        class203.method3109();
        class202.field2106.method5124();
        class187.field1923.method5124();
        class494.method2171();
        class496.method2118();
        field786.method5124();
        field548.method5124();
        class327.field3550.method5124();
        class330.method453();
        ((class236) class226.field2521.field2793).method4369();
        class79.field999.method5124();
        field616.method7044();
        Statics.field4813.method6095();
        Statics.field1224.method6095();
        Statics.field1449.method6095();
        Statics.field1245.method6095();
        Statics.field3406.method6095();
        Statics.field255.method6095();
        Statics.field4899.method6095();
        Statics.field1874.method6095();
        Statics.field4348.method6095();
        Statics.field370.method6095();
        Statics.field2771.method6095();
        Statics.field173.method6095();
        Statics.field1378.method6095();
        Statics.field238.method4310();
        for (int var0 = 0; var0 < 4; var0++) {
            field776[var0].method3824();
        }
        field741.method3774();
        System.gc();
        class305.field3390 = 1;
        Statics.field1437 = null;
        Statics.field2103 = -1;
        Statics.field3395 = -1;
        Statics.field3385 = 0;
        Statics.field1566 = false;
        Statics.field1735 = 2;
        field763 = -1;
        field757 = false;
        class70.method2945();
        method2711(10);
    }

    @ObfuscatedName("ju.ha(II)V")
    public static final void method4690(int arg0) {
        method1777();
        switch(arg0) {
            case 1:
                class76.method2535();
                break;
            case 2:
                class76.method820();
        }
    }

    @ObfuscatedName("bc.hk(B)J")
    public static long method399() {
        return field632;
    }

    @ObfuscatedName("ce.hn(S)V")
    public static final void method1945() {
        if (field569 > 0) {
            method1777();
        } else {
            field512.method6953();
            method2711(40);
            Statics.field1038 = field568.method2639();
            field568.method2647();
        }
    }

    @ObfuscatedName("fi.ht(ZI)V")
    public static final void method2970(boolean arg0) {
        if (arg0) {
            field678 = class76.field943 ? class139.field1607 : class139.field1610;
        } else {
            field678 = Statics.field48.method2366(class76.field941) ? class139.field1608 : class139.field1609;
        }
    }

    @ObfuscatedName("client.hi(B)V")
    public final void method1142() {
        if (field524 > 1) {
            field524--;
        }
        if (field569 > 0) {
            field569--;
        }
        if (field570) {
            field570 = false;
            method1945();
            return;
        }
        if (!field650) {
            method7488();
        }
        for (int var1 = 0; var1 < 100 && this.method1347(field568); var1++) {
        }
        if (field514 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field242.method6360();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field512.field4500) {
                    class296 var6 = class296.method3619(class294.field3118, field568.field1380);
                    var6.field3211.method8113(0);
                    int var7 = var6.field3211.field5017;
                    field512.method6951(var6.field3211);
                    var6.field3211.method8237(var6.field3211.field5017 - var7);
                    field568.method2642(var6);
                    field512.method6962();
                }
                Object var8 = Statics.field1054.field1073;
                synchronized (Statics.field1054.field1073) {
                    if (!field523) {
                        Statics.field1054.field1075 = 0;
                    } else if (class36.field232 != 0 || Statics.field1054.field1075 >= 40) {
                        class296 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field1054.field1075 && (var9 == null || var9.field3211.field5017 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field1054.field1081[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field1054.field1076[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field520 != var16 || field521 != var15) {
                                if (var9 == null) {
                                    var9 = class296.method3619(class294.field3171, field568.field1380);
                                    var9.field3211.method8113(0);
                                    var10 = var9.field3211.field5017;
                                    var9.field3211.field5017 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field572 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field520;
                                    var18 = var15 - field521;
                                    var19 = (int) ((Statics.field1054.field1078[var14] - field572) / 20L);
                                    var12 = (int) ((Statics.field1054.field1078[var14] - field572) % 20L + (long) var12);
                                }
                                field520 = var16;
                                field521 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3211.method8114((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3211.method8113(var19 + 128);
                                    var9.field3211.method8114((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3211.method8113(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3211.method8270(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3211.method8270(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3211.method8114((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3211.method8270(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3211.method8270(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field572 = Statics.field1054.field1078[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3211.method8237(var9.field3211.field5017 - var10);
                            int var20 = var9.field3211.field5017;
                            var9.field3211.field5017 = var10;
                            var9.field3211.method8113(var12 / var13);
                            var9.field3211.method8113(var12 % var13);
                            var9.field3211.field5017 = var20;
                            field568.method2642(var9);
                        }
                        if (var11 >= Statics.field1054.field1075) {
                            Statics.field1054.field1075 = 0;
                        } else {
                            Statics.field1054.field1075 -= var11;
                            System.arraycopy(Statics.field1054.field1076, var11, Statics.field1054.field1076, 0, Statics.field1054.field1075);
                            System.arraycopy(Statics.field1054.field1081, var11, Statics.field1054.field1081, 0, Statics.field1054.field1075);
                            System.arraycopy(Statics.field1054.field1078, var11, Statics.field1054.field1078, 0, Statics.field1054.field1075);
                        }
                    }
                }
                if (class36.field232 == 1 || !Statics.field3402 && class36.field232 == 4 || class36.field232 == 2) {
                    long var22 = class36.field216 - field519 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field519 = class36.field216 * -1L;
                    int var24 = class36.field234;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field3024) {
                        var24 = Statics.field3024;
                    }
                    int var25 = class36.field233;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field4720) {
                        var25 = Statics.field4720;
                    }
                    int var26 = (int) var22;
                    class296 var27 = class296.method3619(class294.field3175, field568.field1380);
                    var27.field3211.method8114((class36.field232 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field3211.method8114(var25);
                    var27.field3211.method8114(var24);
                    field568.method2642(var27);
                }
                if (field740.field2339 > 0) {
                    class296 var28 = class296.method3619(class294.field3178, field568.field1380);
                    var28.field3211.method8114(0);
                    int var29 = var28.field3211.field5017;
                    long var30 = class301.method4630();
                    for (int var32 = 0; var32 < field740.field2339; var32++) {
                        long var33 = var30 - field745;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field745 = var30;
                        var28.field3211.method8171(field740.field2340[var32]);
                        var28.field3211.method8285((int) var33);
                    }
                    var28.field3211.method8239(var28.field3211.field5017 - var29);
                    field568.method2642(var28);
                }
                if (field638 > 0) {
                    field638--;
                }
                if (field740.method3791(96) || field740.method3791(97) || field740.method3791(98) || field740.method3791(99)) {
                    field605 = true;
                }
                if (field605 && field638 <= 0) {
                    field638 = 20;
                    field605 = false;
                    class296 var35 = class296.method3619(class294.field3184, field568.field1380);
                    var35.field3211.method8169(field589);
                    var35.field3211.method8168(field590);
                    field568.method2642(var35);
                }
                if (Statics.field156 && !field608) {
                    field608 = true;
                    class296 var36 = class296.method3619(class294.field3159, field568.field1380);
                    var36.field3211.method8113(1);
                    field568.method2642(var36);
                }
                if (!Statics.field156 && field608) {
                    field608 = false;
                    class296 var37 = class296.method3619(class294.field3159, field568.field1380);
                    var37.field3211.method8113(0);
                    field568.method2642(var37);
                }
                if (Statics.field479 != null) {
                    Statics.field479.method7638();
                }
                method7520();
                if (Statics.field1723) {
                    for (int var38 = 0; var38 < class107.field1332; var38++) {
                        class92 var39 = field613[class107.field1335[var38]];
                        var39.method2181();
                    }
                    Statics.field1723 = false;
                }
                Statics.method7590();
                if (field514 != 30) {
                    return;
                }
                for (class94 var40 = (class94) field643.method6309(); var40 != null; var40 = (class94) field643.method6311()) {
                    if (var40.field1148 > 0) {
                        var40.field1148--;
                    }
                    if (var40.field1148 == 0) {
                        if (var40.field1138 >= 0) {
                            int var41 = var40.field1138;
                            int var42 = var40.field1134;
                            class205 var43 = class205.method3219(var41);
                            if (var42 == 11) {
                                var42 = 10;
                            }
                            if (var42 >= 5 && var42 <= 8) {
                                var42 = 4;
                            }
                            boolean var44 = var43.method3581(var42);
                            if (!var44) {
                                continue;
                            }
                        }
                        method4647(var40.field1139, var40.field1135, var40.field1136, var40.field1146, var40.field1138, var40.field1141, var40.field1134, var40.field1144);
                        var40.method7560();
                    } else {
                        if (var40.field1147 > 0) {
                            var40.field1147--;
                        }
                        if (var40.field1147 == 0 && var40.field1136 >= 1 && var40.field1146 >= 1 && var40.field1136 <= 102 && var40.field1146 <= 102) {
                            if (var40.field1149 >= 0) {
                                int var45 = var40.field1149;
                                int var46 = var40.field1143;
                                class205 var47 = class205.method3219(var45);
                                if (var46 == 11) {
                                    var46 = 10;
                                }
                                if (var46 >= 5 && var46 <= 8) {
                                    var46 = 4;
                                }
                                boolean var48 = var47.method3581(var46);
                                if (!var48) {
                                    continue;
                                }
                            }
                            method4647(var40.field1139, var40.field1135, var40.field1136, var40.field1146, var40.field1149, var40.field1142, var40.field1143, var40.field1144);
                            var40.field1147 = -1;
                            if (var40.field1149 == var40.field1138 && var40.field1138 == -1) {
                                var40.method7560();
                            } else if (var40.field1149 == var40.field1138 && var40.field1142 == var40.field1141 && var40.field1143 == var40.field1134) {
                                var40.method7560();
                            }
                        }
                    }
                }
                int var10002;
                for (int var49 = 0; var49 < field684; var49++) {
                    var10002 = field761[var49]--;
                    if (field761[var49] >= -10) {
                        class40 var51 = field703[var49];
                        if (var51 == null) {
                            class40 var10000 = (class40) null;
                            var51 = class40.method710(Statics.field1245, field759[var49], 0);
                            if (var51 == null) {
                                continue;
                            }
                            field761[var49] += var51.method712();
                            field703[var49] = var51;
                        }
                        if (field761[var49] < 0) {
                            int var58;
                            if (field522[var49] == 0) {
                                var58 = Statics.field48.method2327();
                            } else {
                                int var52 = (field522[var49] & 0xFF) * 128;
                                int var53 = field522[var49] >> 16 & 0xFF;
                                int var54 = var53 * 128 + 64 - Statics.field971.field1163;
                                if (var54 < 0) {
                                    var54 = -var54;
                                }
                                int var55 = field522[var49] >> 8 & 0xFF;
                                int var56 = var55 * 128 + 64 - Statics.field971.field1153;
                                if (var56 < 0) {
                                    var56 = -var56;
                                }
                                int var57 = var54 + var56 - 128;
                                if (var57 > var52) {
                                    field761[var49] = -100;
                                    continue;
                                }
                                if (var57 < 0) {
                                    var57 = 0;
                                }
                                var58 = (var52 - var57) * Statics.field48.method2332() / var52;
                            }
                            if (var58 > 0) {
                                class41 var59 = var51.method711().method721(Statics.field2260);
                                class49 var60 = class49.method858(var59, 100, var58);
                                var60.method868(field686[var49] - 1);
                                Statics.field1945.method665(var60);
                            }
                            field761[var49] = -100;
                        }
                    } else {
                        field684--;
                        for (int var50 = var49; var50 < field684; var50++) {
                            field759[var50] = field759[var50 + 1];
                            field703[var50] = field703[var50 + 1];
                            field686[var50] = field686[var50 + 1];
                            field761[var50] = field761[var50 + 1];
                            field522[var50] = field522[var50 + 1];
                        }
                        var49--;
                    }
                }
                if (field757) {
                    boolean var61;
                    if (class305.field3390 == 0) {
                        var61 = Statics.field3388.method5213();
                    } else {
                        var61 = true;
                    }
                    if (!var61) {
                        if (Statics.field48.method2370() != 0 && field763 != -1) {
                            Statics.method6266(Statics.field255, field763, 0, Statics.field48.method2370(), false);
                        }
                        field757 = false;
                    }
                }
                field568.field1389++;
                if (field568.field1389 > 750) {
                    method1945();
                    return;
                }
                int var62 = class107.field1332;
                int[] var63 = class107.field1335;
                for (int var64 = 0; var64 < var62; var64++) {
                    class92 var65 = field613[var63[var64]];
                    if (var65 != null) {
                        method5151(var65, 1);
                    }
                }
                for (int var66 = 0; var66 < field542; var66++) {
                    int var67 = field540[var66];
                    class100 var68 = field563[var67];
                    if (var68 != null) {
                        method5151(var68, var68.field1292.field2029);
                    }
                }
                Statics.method4();
                field734++;
                if (field625 != 0) {
                    field576 += 20;
                    if (field576 >= 400) {
                        field625 = 0;
                    }
                }
                class330 var69 = Statics.field1769;
                class330 var70 = Statics.field100;
                Statics.field1769 = null;
                Statics.field100 = null;
                field690 = null;
                field694 = false;
                field640 = false;
                field742 = 0;
                while (field740.method3790() && field742 < 128) {
                    if (field682 >= 2 && field740.method3791(82) && field740.field2350 == 66) {
                        StringBuilder var71 = new StringBuilder();
                        Iterator var72 = class110.field1375.iterator();
                        while (var72.hasNext()) {
                            class65 var73 = (class65) var72.next();
                            if (var73.field486 != null && !var73.field486.isEmpty()) {
                                var71.append(var73.field486).append(':');
                            }
                            var71.append(var73.field494).append('\n');
                        }
                        String var74 = var71.toString();
                        Statics.field3874.method458(var74);
                    } else if (field595 != 1 || field740.field2349 <= 0) {
                        field546[field742] = field740.field2350;
                        field677[field742] = field740.field2349;
                        field742++;
                    }
                }
                if (method3865() && field740.method3791(82) && field740.method3791(81) && field715 != 0) {
                    int var76 = Statics.field971.field1103 - field715;
                    if (var76 < 0) {
                        var76 = 0;
                    } else if (var76 > 3) {
                        var76 = 3;
                    }
                    if (Statics.field971.field1103 != var76) {
                        int var77 = Statics.field2380 + Statics.field971.field1223[0];
                        int var78 = Statics.field1302 + Statics.field971.field1193[0];
                        class296 var79 = class296.method3619(class294.field3183, field568.field1380);
                        var79.field3211.method8220(var78);
                        var79.field3211.method8113(var76);
                        var79.field3211.method8169(var77);
                        var79.field3211.method8181(0);
                        field568.method2642(var79);
                    }
                    field715 = 0;
                }
                if (class36.field232 == 1) {
                    field741.method3774();
                }
                if (field799 != -1) {
                    method3866(field799, 0, 0, Statics.field4720, Statics.field3024, 0, 0);
                }
                field587++;
                while (true) {
                    class88 var80;
                    class330 var81;
                    class330 var82;
                    do {
                        var80 = (class88) field718.method6307();
                        if (var80 == null) {
                            while (true) {
                                class88 var83;
                                class330 var84;
                                class330 var85;
                                do {
                                    var83 = (class88) field711.method6307();
                                    if (var83 == null) {
                                        while (true) {
                                            class88 var86;
                                            class330 var87;
                                            class330 var88;
                                            do {
                                                var86 = (class88) field746.method6307();
                                                if (var86 == null) {
                                                    while (true) {
                                                        while (true) {
                                                            class211 var89;
                                                            class330 var90;
                                                            do {
                                                                do {
                                                                    do {
                                                                        var89 = (class211) field743.method6307();
                                                                        if (var89 == null) {
                                                                            this.method1149();
                                                                            method2146();
                                                                            if (field771 != null) {
                                                                                this.method1421();
                                                                            }
                                                                            if (class230.method4193()) {
                                                                                int var96 = class230.field2546;
                                                                                int var97 = class230.field2561;
                                                                                class296 var98 = class296.method3619(class294.field3135, field568.field1380);
                                                                                var98.field3211.method8113(5);
                                                                                var98.field3211.method8171(field740.method3791(82) ? (field740.method3791(81) ? 2 : 1) : 0);
                                                                                var98.field3211.method8114(Statics.field2380 + var96);
                                                                                var98.field3211.method8169(Statics.field1302 + var97);
                                                                                field568.method2642(var98);
                                                                                class230.method4194();
                                                                                field622 = class36.field233;
                                                                                field623 = class36.field234;
                                                                                field625 = 1;
                                                                                field576 = 0;
                                                                                field753 = var96;
                                                                                field754 = var97;
                                                                            }
                                                                            if (Statics.field1769 != var69) {
                                                                                if (var69 != null) {
                                                                                    method2632(var69);
                                                                                }
                                                                                if (Statics.field1769 != null) {
                                                                                    method2632(Statics.field1769);
                                                                                }
                                                                            }
                                                                            if (Statics.field100 != var70 && field666 == field665) {
                                                                                if (var70 != null) {
                                                                                    method2632(var70);
                                                                                }
                                                                                if (Statics.field100 != null) {
                                                                                    method2632(Statics.field100);
                                                                                }
                                                                            }
                                                                            if (Statics.field100 == null) {
                                                                                if (field665 > 0) {
                                                                                    field665--;
                                                                                }
                                                                            } else if (field665 < field666) {
                                                                                field665++;
                                                                                if (field666 == field665) {
                                                                                    method2632(Statics.field100);
                                                                                }
                                                                            }
                                                                            method2431();
                                                                            if (field692) {
                                                                                method7031();
                                                                            } else if (field751) {
                                                                                if (!field765) {
                                                                                    int var99 = Statics.field1470 * 128 + 64;
                                                                                    int var100 = Statics.field2402 * 128 + 64;
                                                                                    int var101 = method4353(var99, var100, Statics.field1882) - Statics.field1045;
                                                                                    method1118(var99, var101, var100);
                                                                                } else if (field541 != null) {
                                                                                    Statics.field2317 = field541.method7593();
                                                                                    Statics.field4481 = field541.method7595();
                                                                                    if (field582) {
                                                                                        Statics.field1680 = field541.method7597();
                                                                                    } else {
                                                                                        Statics.field1680 = method4353(Statics.field2317, Statics.field4481, Statics.field1882) - field541.method7597();
                                                                                    }
                                                                                    field541.method7610();
                                                                                }
                                                                                if (field726) {
                                                                                    if (field770 != null) {
                                                                                        Statics.field3497 = field770.method7607();
                                                                                        Statics.field3497 = Math.min(Math.max(Statics.field3497, 128), 383);
                                                                                        field770.method7610();
                                                                                    }
                                                                                    if (field769 != null) {
                                                                                        Statics.field3093 = field769.method7607() & 0x7FF;
                                                                                        field769.method7610();
                                                                                    }
                                                                                } else {
                                                                                    int var102 = Statics.field1234 * 128 + 64;
                                                                                    int var103 = Statics.field1606 * 128 + 64;
                                                                                    int var104 = method4353(var102, var103, Statics.field1882) - Statics.field2143;
                                                                                    int var105 = var102 - Statics.field2317;
                                                                                    int var106 = var104 - Statics.field1680;
                                                                                    int var107 = var103 - Statics.field4481;
                                                                                    int var108 = (int) Math.sqrt((double) (var105 * var105 + var107 * var107));
                                                                                    int var109 = (int) (Math.atan2((double) var106, (double) var108) * 325.9490051269531D) & 0x7FF;
                                                                                    int var110 = (int) (Math.atan2((double) var105, (double) var107) * -325.9490051269531D) & 0x7FF;
                                                                                    method3246(var109, var110);
                                                                                }
                                                                            }
                                                                            for (int var111 = 0; var111 < 5; var111++) {
                                                                                var10002 = field764[var111]++;
                                                                            }
                                                                            Statics.field236.method2567();
                                                                            int var112 = class36.method1966();
                                                                            int var113 = field198.method341();
                                                                            if (var112 > 15000 && var113 > 15000) {
                                                                                field569 = 250;
                                                                                class36.field219 = 14500;
                                                                                class296 var115 = class296.method3619(class294.field3179, field568.field1380);
                                                                                field568.method2642(var115);
                                                                            }
                                                                            Statics.field497.method1716();
                                                                            method5083();
                                                                            field568.field1385++;
                                                                            if (field568.field1385 > 50) {
                                                                                class296 var116 = class296.method3619(class294.field3150, field568.field1380);
                                                                                field568.method2642(var116);
                                                                            }
                                                                            try {
                                                                                field568.method2633();
                                                                            } catch (IOException var118) {
                                                                                method1945();
                                                                            }
                                                                            return;
                                                                        }
                                                                    } while (var89 == null);
                                                                } while (var89.field2333 == null);
                                                                if (var89.field2333.field3663 < 0) {
                                                                    break;
                                                                }
                                                                var90 = class330.method1746(var89.field2333.field3622);
                                                            } while (var90 == null || var90.field3731 == null || var90.field3731.length == 0 || var89.field2333.field3663 >= var90.field3731.length || var90.field3731[var89.field2333.field3663] != var89.field2333);
                                                            if (var89.field2333.field3728 == 11 && var89.field2332 == 0) {
                                                                if (var89.field2333.method5792(var89.field2336, var89.field2331, 0, 0)) {
                                                                    switch(var89.field2333.method5796()) {
                                                                        case 0:
                                                                            class32.method400(var89.field2333.method5798(), true, false);
                                                                            break;
                                                                        case 1:
                                                                            int var91 = method6005(var89.field2333);
                                                                            boolean var92 = (var91 >> 22 & 0x1) != 0;
                                                                            if (var92) {
                                                                                int[] var93 = var89.field2333.method5808();
                                                                                if (var93 != null) {
                                                                                    class296 var94 = class296.method3619(class294.field3168, field568.field1380);
                                                                                    var94.field3211.method8182(var93[2]);
                                                                                    var94.field3211.method8182(var93[0]);
                                                                                    var94.field3211.method8181(var93[1]);
                                                                                    var94.field3211.method8270(var89.field2333.method5797());
                                                                                    var94.field3211.method8114(var89.field2333.field3663);
                                                                                    var94.field3211.method8139(var89.field2333.field3673);
                                                                                    field568.method2642(var94);
                                                                                }
                                                                            }
                                                                    }
                                                                }
                                                            } else if (var89.field2333.field3728 == 12) {
                                                                class328 var95 = var89.field2333.method5803();
                                                                if (var95 != null && var95.method5579()) {
                                                                    switch(var89.field2332) {
                                                                        case 0:
                                                                            field741.method3783(var89.field2333);
                                                                            var95.method5479(true);
                                                                            var95.method5582(var89.field2336, var89.field2331, field740.method3791(82), field740.method3791(81));
                                                                            break;
                                                                        case 1:
                                                                            var95.method5519(var89.field2336, var89.field2331);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var87 = var86.field1061;
                                                if (var87.field3663 < 0) {
                                                    break;
                                                }
                                                var88 = class330.method1746(var87.field3622);
                                            } while (var88 == null || var88.field3731 == null || var87.field3663 >= var88.field3731.length || var88.field3731[var87.field3663] != var87);
                                            class71.method3233(var86);
                                        }
                                    }
                                    var84 = var83.field1061;
                                    if (var84.field3663 < 0) {
                                        break;
                                    }
                                    var85 = class330.method1746(var84.field3622);
                                } while (var85 == null || var85.field3731 == null || var84.field3663 >= var85.field3731.length || var85.field3731[var84.field3663] != var84);
                                class71.method3233(var83);
                            }
                        }
                        var81 = var80.field1061;
                        if (var81.field3663 < 0) {
                            break;
                        }
                        var82 = class330.method1746(var81.field3622);
                    } while (var82 == null || var82.field3731 == null || var81.field3663 >= var82.field3731.length || var82.field3731[var81.field3663] != var81);
                    class71.method3233(var80);
                }
            }
            class296 var4 = class296.method3619(class294.field3167, field568.field1380);
            var4.field3211.method8113(0);
            int var5 = var4.field3211.field5017;
            class37.method1702(var4.field3211);
            var4.field3211.method8237(var4.field3211.field5017 - var5);
            field568.method2642(var4);
        }
    }

    @ObfuscatedName("ka.hv(I)V")
    public static final void method4957() {
        if (Statics.field3092 != null) {
            Statics.field3092.method740();
        }
        if (Statics.field1074 != null) {
            Statics.field1074.method740();
        }
    }

    @ObfuscatedName("if.hp(Lhy;IIII)V")
    public static void method4354(class208 arg0, int arg1, int arg2, int arg3) {
        if (field684 < 50 && Statics.field48.method2332() != 0 && arg0.field2286 != null && arg1 < arg0.field2286.length) {
            method2423(arg0.field2286[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("oo.hc(Lhy;IIII)V")
    public static void method6278(class208 arg0, int arg1, int arg2, int arg3) {
        if (field684 < 50 && Statics.field48.method2332() != 0 && arg0.field2282 != null && arg0.field2282.containsKey(arg1)) {
            method2423((Integer) arg0.field2282.get(arg1), arg2, arg3);
        }
    }

    @ObfuscatedName("dy.hh(IIII)V")
    public static void method2423(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field759[field684] = var3;
        field686[field684] = var4;
        field761[field684] = 0;
        field703[field684] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field522[field684] = (var6 << 16) + (var7 << 8) + var5;
        field684++;
    }

    @ObfuscatedName("mc.hw(IIIB)V")
    public static void method5385(int arg0, int arg1, int arg2) {
        if (Statics.field48.method2327() == 0 || arg1 == 0 || field684 >= 50) {
            return;
        }
        field759[field684] = arg0;
        field686[field684] = arg1;
        field761[field684] = arg2;
        field703[field684] = null;
        field522[field684] = 0;
        field684++;
    }

    @ObfuscatedName("lz.hs(IB)V")
    public static void method5363(int arg0) {
        if (arg0 == -1 && !field757) {
            Statics.field3388.method5212();
            class305.field3390 = 1;
            Statics.field1437 = null;
        } else if (arg0 != -1 && field763 != arg0 && Statics.field48.method2370() != 0 && !field757) {
            class355 var1 = Statics.field255;
            int var2 = Statics.field48.method2370();
            class305.field3390 = 1;
            Statics.field1437 = var1;
            Statics.field2103 = arg0;
            Statics.field3395 = 0;
            Statics.field3385 = var2;
            Statics.field1566 = false;
            Statics.field1735 = 2;
        }
        field763 = arg0;
    }

    @ObfuscatedName("dj.hd(III)V")
    public static void method2282(int arg0, int arg1) {
        if (Statics.field48.method2370() != 0 && arg0 != -1) {
            Statics.method6266(Statics.field2771, arg0, 0, Statics.field48.method2370(), false);
            field757 = true;
        }
    }

    @ObfuscatedName("client.hq(III)V")
    public void method1143(int arg0, int arg1) {
        if (arg0 > -1 && Statics.field48.method2370() > 0 && !field757) {
            class296 var3 = class296.method3619(class294.field3131, field568.field1380);
            var3.field3211.method8270(arg0);
            field568.method2642(var3);
        }
    }

    @ObfuscatedName("ro.hb(I)V")
    public static final void method7520() {
        if (!Statics.field74) {
            return;
        }
        if (Statics.field4535 != null) {
            Statics.field4535.method7185();
        }
        for (int var0 = 0; var0 < class107.field1332; var0++) {
            class92 var1 = field613[class107.field1335[var0]];
            var1.method2178();
        }
        Statics.field74 = false;
    }

    @ObfuscatedName("qx.hf(Lmb;III)V")
    public static final void method7115(class330 arg0, int arg1, int arg2) {
        if (field755 != 0 && field755 != 3 || field650 || !(class36.field232 == 1 || !Statics.field3402 && class36.field232 == 4)) {
            return;
        }
        class319 var3 = arg0.method5783(true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field233 - arg1;
        int var5 = class36.field234 - arg2;
        if (!var3.method5380(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3504 / 2;
        int var7 = var5 - var3.field3506 / 2;
        int var8 = field590 & 0x7FF;
        int var9 = class226.field2523[var8];
        int var10 = class226.field2520[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field971.field1163 + var11 >> 7;
        int var14 = Statics.field971.field1153 - var12 >> 7;
        class296 var15 = class296.method3619(class294.field3149, field568.field1380);
        var15.field3211.method8113(18);
        var15.field3211.method8171(field740.method3791(82) ? (field740.method3791(81) ? 2 : 1) : 0);
        var15.field3211.method8114(Statics.field2380 + var13);
        var15.field3211.method8169(Statics.field1302 + var14);
        var15.field3211.method8113(var6);
        var15.field3211.method8113(var7);
        var15.field3211.method8114(field590);
        var15.field3211.method8113(57);
        var15.field3211.method8113(0);
        var15.field3211.method8113(0);
        var15.field3211.method8113(89);
        var15.field3211.method8114(Statics.field971.field1163);
        var15.field3211.method8114(Statics.field971.field1153);
        var15.field3211.method8113(63);
        field568.method2642(var15);
        field753 = var13;
        field754 = var14;
    }

    @ObfuscatedName("ml.hm(Ljava/lang/String;I)V")
    public static final void method5430(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field48.method2371(!Statics.field48.method2316());
            if (Statics.field48.method2316()) {
                class110.method1047(99, "", "Roofs are now all hidden");
            } else {
                class110.method1047(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class385.method4380(arg0.substring(5).trim()) == 1;
            Statics.field3874.method505(var1);
            class226.method4056(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field618 = !field618;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field48.method2321();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field752 = !field752;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field662 = !field662;
        }
        if (field682 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field479.field4883 = !Statics.field479.field4883;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field48.method2320(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field48.method2320(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method1945();
            }
        }
        class296 var2 = class296.method3619(class294.field3181, field568.field1380);
        var2.field3211.method8113(arg0.length() + 1);
        var2.field3211.method8119(arg0);
        field568.method2642(var2);
    }

    @ObfuscatedName("mx.hj(II)I")
    public static final int method5413(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("nr.hr(II)I")
    public static final int method6186(int arg0) {
        return Math.abs(arg0 - Statics.field3093) > 1024 ? (arg0 < Statics.field3093 ? 1 : -1) * 2048 + arg0 : arg0;
    }

    @ObfuscatedName("pm.hl(B)V")
    public static final void method7031() {
        method1118(Statics.field1416, Statics.field2829, Statics.field1884);
        method3246(Statics.field1885, Statics.field369);
        if (Statics.field2317 != Statics.field1416 || Statics.field2829 != Statics.field1680 || Statics.field4481 != Statics.field1884 || Statics.field3497 != Statics.field1885 || Statics.field369 != Statics.field3093) {
            return;
        }
        field692 = false;
        field751 = false;
        field765 = false;
        field726 = false;
        Statics.field1234 = 0;
        Statics.field1606 = 0;
        Statics.field2143 = 0;
        Statics.field4637 = 0;
        Statics.field2323 = 0;
        Statics.field1256 = 0;
        Statics.field1411 = 0;
        Statics.field1470 = 0;
        Statics.field2402 = 0;
        Statics.field1045 = 0;
        field541 = null;
        field770 = null;
        field769 = null;
    }

    @ObfuscatedName("ci.hx(IIII)V")
    public static final void method1118(int arg0, int arg1, int arg2) {
        if (Statics.field2317 < arg0) {
            Statics.field2317 += Statics.field1256 * (arg0 - Statics.field2317) / 1000 + Statics.field1411;
            if (Statics.field2317 > arg0) {
                Statics.field2317 = arg0;
            }
        }
        if (Statics.field2317 > arg0) {
            Statics.field2317 -= Statics.field1256 * (Statics.field2317 - arg0) / 1000 + Statics.field1411;
            if (Statics.field2317 < arg0) {
                Statics.field2317 = arg0;
            }
        }
        if (Statics.field1680 < arg1) {
            Statics.field1680 += Statics.field1256 * (arg1 - Statics.field1680) / 1000 + Statics.field1411;
            if (Statics.field1680 > arg1) {
                Statics.field1680 = arg1;
            }
        }
        if (Statics.field1680 > arg1) {
            Statics.field1680 -= Statics.field1256 * (Statics.field1680 - arg1) / 1000 + Statics.field1411;
            if (Statics.field1680 < arg1) {
                Statics.field1680 = arg1;
            }
        }
        if (Statics.field4481 < arg2) {
            Statics.field4481 += Statics.field1256 * (arg2 - Statics.field4481) / 1000 + Statics.field1411;
            if (Statics.field4481 > arg2) {
                Statics.field4481 = arg2;
            }
        }
        if (Statics.field4481 > arg2) {
            Statics.field4481 -= Statics.field1256 * (Statics.field4481 - arg2) / 1000 + Statics.field1411;
            if (Statics.field4481 < arg2) {
                Statics.field4481 = arg2;
            }
        }
    }

    @ObfuscatedName("hk.hz(III)V")
    public static final void method3246(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field3497 < arg0) {
            Statics.field3497 += Statics.field2323 * (arg0 - Statics.field3497) / 1000 + Statics.field4637;
            if (Statics.field3497 > arg0) {
                Statics.field3497 = arg0;
            }
        } else if (Statics.field3497 > arg0) {
            Statics.field3497 -= Statics.field2323 * (Statics.field3497 - arg0) / 1000 + Statics.field4637;
            if (Statics.field3497 < arg0) {
                Statics.field3497 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field3093;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field3093 += Statics.field2323 * var3 / 1000 + Statics.field4637;
            Statics.field3093 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field3093 -= Statics.field2323 * -var3 / 1000 + Statics.field4637;
            Statics.field3093 &= 0x7FF;
        }
        int var4 = var2 - Statics.field3093;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field3093 = var2;
        }
    }

    @ObfuscatedName("dg.hg(B)V")
    public static final void method2431() {
        if (field595 == 0) {
            int var0 = Statics.field971.field1163;
            int var1 = Statics.field971.field1153;
            if (Statics.field4358 - var0 < -500 || Statics.field4358 - var0 > 500 || Statics.field4295 - var1 < -500 || Statics.field4295 - var1 > 500) {
                Statics.field4358 = var0;
                Statics.field4295 = var1;
            }
            if (Statics.field4358 != var0) {
                Statics.field4358 += (var0 - Statics.field4358) / 16;
            }
            if (Statics.field4295 != var1) {
                Statics.field4295 += (var1 - Statics.field4295) / 16;
            }
            int var2 = Statics.field4358 >> 7;
            int var3 = Statics.field4295 >> 7;
            int var4 = method4353(Statics.field4358, Statics.field4295, Statics.field1882);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field1882;
                        if (var8 < 3 && (class82.field1018[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class82.field1016[var8][var6][var7];
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
            if (var10 > field606) {
                field606 += (var10 - field606) / 24;
            } else if (var10 < field606) {
                field606 += (var10 - field606) / 80;
            }
            Statics.field918 = method4353(Statics.field971.field1163, Statics.field971.field1153, Statics.field1882) - field648;
        } else if (field595 == 1) {
            if (field603 && Statics.field971 != null) {
                int var11 = Statics.field971.field1223[0];
                int var12 = Statics.field971.field1193[0];
                if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                    Statics.field4358 = Statics.field971.field1163;
                    int var13 = method4353(Statics.field971.field1163, Statics.field971.field1153, Statics.field1882) - field648;
                    if (var13 < Statics.field918) {
                        Statics.field918 = var13;
                    }
                    Statics.field4295 = Statics.field971.field1153;
                    field603 = false;
                }
            }
            short var14 = -1;
            if (field740.method3791(33)) {
                var14 = 0;
            } else if (field740.method3791(49)) {
                var14 = 1024;
            }
            if (field740.method3791(48)) {
                if (var14 == 0) {
                    var14 = 1792;
                } else if (var14 == 1024) {
                    var14 = 1280;
                } else {
                    var14 = 1536;
                }
            } else if (field740.method3791(50)) {
                if (var14 == 0) {
                    var14 = 256;
                } else if (var14 == 1024) {
                    var14 = 768;
                } else {
                    var14 = 512;
                }
            }
            byte var15 = 0;
            if (field740.method3791(35)) {
                var15 = -1;
            } else if (field740.method3791(51)) {
                var15 = 1;
            }
            int var16 = 0;
            if (var14 >= 0 || var15 != 0) {
                int var17 = field740.method3791(81) ? field601 : field600;
                var16 = var17 * 16;
                field598 = var14;
                field599 = var15;
            }
            if (field597 < var16) {
                field597 += var16 / 8;
                if (field597 > var16) {
                    field597 = var16;
                }
            } else if (field597 > var16) {
                field597 = field597 * 9 / 10;
            }
            if (field597 > 0) {
                int var18 = field597 / 16;
                if (field598 >= 0) {
                    int var19 = field598 - Statics.field3093 & 0x7FF;
                    int var20 = class226.field2523[var19];
                    int var21 = class226.field2520[var19];
                    Statics.field4358 += var18 * var20 / 65536;
                    Statics.field4295 += var18 * var21 / 65536;
                }
                if (field599 != 0) {
                    Statics.field918 += field599 * var18;
                    if (Statics.field918 > 0) {
                        Statics.field918 = 0;
                    }
                }
            } else {
                field598 = -1;
                field599 = -1;
            }
            if (field740.method3791(13)) {
                field568.method2642(class296.method3619(class294.field3193, field568.field1380));
                field595 = 0;
            }
        }
        if (class36.field224 == 4 && Statics.field3402) {
            int var22 = class36.field229 - field594;
            field560 = var22 * 2;
            field594 = var22 == -1 || var22 == 1 ? class36.field229 : (field594 + class36.field229) / 2;
            int var23 = field728 - class36.field221;
            field591 = var23 * 2;
            field728 = var23 == -1 || var23 == 1 ? class36.field221 : (field728 + class36.field221) / 2;
        } else {
            if (field740.method3791(96)) {
                field591 += (-24 - field591) / 2;
            } else if (field740.method3791(97)) {
                field591 += (24 - field591) / 2;
            } else {
                field591 /= 2;
            }
            if (field740.method3791(98)) {
                field560 += (12 - field560) / 2;
            } else if (field740.method3791(99)) {
                field560 += (-12 - field560) / 2;
            } else {
                field560 /= 2;
            }
            field594 = class36.field229;
            field728 = class36.field221;
        }
        field590 = field591 / 2 + field590 & 0x7FF;
        field589 += field560 / 2;
        if (field589 < 128) {
            field589 = 128;
        }
        if (field589 > 383) {
            field589 = 383;
        }
    }

    @ObfuscatedName("lq.hy(Ldi;II)V")
    public static final void method5151(class95 arg0, int arg1) {
        if (arg0.field1212 >= field506) {
            int var2 = Math.max(1, arg0.field1212 - field506);
            int var3 = arg0.field1204 * 128 + arg0.field1156 * 64;
            int var4 = arg0.field1206 * 128 + arg0.field1156 * 64;
            arg0.field1163 += (var3 - arg0.field1163) / var2;
            arg0.field1153 += (var4 - arg0.field1153) / var2;
            arg0.field1226 = 0;
            arg0.field1219 = arg0.field1210;
        } else if (arg0.field1209 >= field506) {
            boolean var5 = field506 == arg0.field1209 || arg0.field1217 == -1 || arg0.field1208 != 0;
            if (!var5) {
                class208 var6 = class208.method4648(arg0.field1217);
                if (var6 == null || var6.method3754()) {
                    var5 = true;
                } else {
                    var5 = arg0.field1177 + 1 > var6.field2287[arg0.field1198];
                }
            }
            if (var5) {
                int var7 = arg0.field1209 - arg0.field1212;
                int var8 = field506 - arg0.field1212;
                int var9 = arg0.field1204 * 128 + arg0.field1156 * 64;
                int var10 = arg0.field1206 * 128 + arg0.field1156 * 64;
                int var11 = arg0.field1174 * 128 + arg0.field1156 * 64;
                int var12 = arg0.field1207 * 128 + arg0.field1156 * 64;
                arg0.field1163 = ((var7 - var8) * var9 + var8 * var11) / var7;
                arg0.field1153 = ((var7 - var8) * var10 + var8 * var12) / var7;
            }
            arg0.field1226 = 0;
            arg0.field1219 = arg0.field1210;
            arg0.field1164 = arg0.field1219;
        } else {
            method3235(arg0);
        }
        if (arg0.field1163 < 128 || arg0.field1153 < 128 || arg0.field1163 >= 13184 || arg0.field1153 >= 13184) {
            arg0.field1217 = -1;
            arg0.field1212 = 0;
            arg0.field1209 = 0;
            arg0.method2251();
            arg0.field1163 = arg0.field1223[0] * 128 + arg0.field1156 * 64;
            arg0.field1153 = arg0.field1193[0] * 128 + arg0.field1156 * 64;
            arg0.method2250();
        }
        if (Statics.field971 == arg0 && (arg0.field1163 < 1536 || arg0.field1153 < 1536 || arg0.field1163 >= 11776 || arg0.field1153 >= 11776)) {
            arg0.field1217 = -1;
            arg0.field1212 = 0;
            arg0.field1209 = 0;
            arg0.method2251();
            arg0.field1163 = arg0.field1223[0] * 128 + arg0.field1156 * 64;
            arg0.field1153 = arg0.field1193[0] * 128 + arg0.field1156 * 64;
            arg0.method2250();
        }
        method773(arg0);
        method2534(arg0);
    }

    @ObfuscatedName("gs.in(Ldi;B)V")
    public static final void method3235(class95 arg0) {
        arg0.field1152 = arg0.field1158;
        if (arg0.field1222 == 0) {
            arg0.field1226 = 0;
            return;
        }
        if (arg0.field1217 != -1 && arg0.field1208 == 0) {
            class208 var1 = class208.method4648(arg0.field1217);
            if (arg0.field1227 > 0 && var1.field2288 == 0) {
                arg0.field1226++;
                return;
            }
            if (arg0.field1227 <= 0 && var1.field2275 == 0) {
                arg0.field1226++;
                return;
            }
        }
        int var2 = arg0.field1163;
        int var3 = arg0.field1153;
        int var4 = arg0.field1223[arg0.field1222 - 1] * 128 + arg0.field1156 * 64;
        int var5 = arg0.field1193[arg0.field1222 - 1] * 128 + arg0.field1156 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1219 = 1280;
            } else if (var3 > var5) {
                arg0.field1219 = 1792;
            } else {
                arg0.field1219 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1219 = 768;
            } else if (var3 > var5) {
                arg0.field1219 = 256;
            } else {
                arg0.field1219 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1219 = 1024;
        } else if (var3 > var5) {
            arg0.field1219 = 0;
        }
        class217 var6 = arg0.field1213[arg0.field1222 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1163 = var4;
            arg0.field1153 = var5;
            arg0.field1222--;
            if (arg0.field1227 > 0) {
                arg0.field1227--;
            }
            return;
        }
        int var7 = arg0.field1219 - arg0.field1164 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1162;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1159;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1189;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1154;
        }
        if (var8 == -1) {
            var8 = arg0.field1159;
        }
        arg0.field1152 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class100) {
            var10 = ((class100) arg0).field1292.field2036;
        }
        if (var10) {
            if (arg0.field1219 != arg0.field1164 && arg0.field1187 == -1 && arg0.field1221 != 0) {
                var9 = 2;
            }
            if (arg0.field1222 > 2) {
                var9 = 6;
            }
            if (arg0.field1222 > 3) {
                var9 = 8;
            }
            if (arg0.field1226 > 0 && arg0.field1222 > 1) {
                var9 = 8;
                arg0.field1226--;
            }
        } else {
            if (arg0.field1222 > 1) {
                var9 = 6;
            }
            if (arg0.field1222 > 2) {
                var9 = 8;
            }
            if (arg0.field1226 > 0 && arg0.field1222 > 1) {
                var9 = 8;
                arg0.field1226--;
            }
        }
        if (class217.field2397 == var6) {
            var9 <<= 0x1;
        } else if (class217.field2395 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8) {
            if (arg0.field1159 == arg0.field1152 && arg0.field1203 != -1) {
                arg0.field1152 = arg0.field1203;
            } else if (arg0.field1162 == arg0.field1152 && arg0.field1192 != -1) {
                arg0.field1152 = arg0.field1192;
            } else if (arg0.field1154 == arg0.field1152 && arg0.field1199 != -1) {
                arg0.field1152 = arg0.field1199;
            } else if (arg0.field1189 == arg0.field1152 && arg0.field1168 != -1) {
                arg0.field1152 = arg0.field1168;
            }
        } else if (var9 <= 1) {
            if (arg0.field1159 == arg0.field1152 && arg0.field1169 != -1) {
                arg0.field1152 = arg0.field1169;
            } else if (arg0.field1162 == arg0.field1152 && arg0.field1170 != -1) {
                arg0.field1152 = arg0.field1170;
            } else if (arg0.field1154 == arg0.field1152 && arg0.field1184 != -1) {
                arg0.field1152 = arg0.field1184;
            } else if (arg0.field1189 == arg0.field1152 && arg0.field1172 != -1) {
                arg0.field1152 = arg0.field1172;
            }
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1163 += var9;
                if (arg0.field1163 > var4) {
                    arg0.field1163 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1163 -= var9;
                if (arg0.field1163 < var4) {
                    arg0.field1163 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1153 += var9;
                if (arg0.field1153 > var5) {
                    arg0.field1153 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1153 -= var9;
                if (arg0.field1153 < var5) {
                    arg0.field1153 = var5;
                }
            }
        }
        if (arg0.field1163 == var4 && arg0.field1153 == var5) {
            arg0.field1222--;
            if (arg0.field1227 > 0) {
                arg0.field1227--;
            }
        }
    }

    @ObfuscatedName("bi.ih(Ldi;B)V")
    public static final void method773(class95 arg0) {
        if (arg0.field1187 != -1) {
            Object var1 = null;
            int var2 = 65536;
            class95 var3;
            if (arg0.field1187 < var2) {
                var3 = field563[arg0.field1187];
            } else {
                var3 = field613[arg0.field1187 - var2];
            }
            if (var3 != null) {
                int var4 = arg0.field1163 - var3.field1163;
                int var5 = arg0.field1153 - var3.field1153;
                if (var4 != 0 || var5 != 0) {
                    arg0.field1219 = class436.method6936(var4, var5);
                }
            } else if (arg0.field1188) {
                arg0.field1187 = -1;
                arg0.field1188 = false;
            }
        }
        if (arg0.field1222 == 0 || arg0.field1226 > 0) {
            int var6 = -1;
            if (arg0.field1179 != -1 && arg0.field1191 != -1) {
                int var7 = arg0.field1179 * 128 - Statics.field2380 * 128 + 64;
                int var8 = arg0.field1191 * 128 - Statics.field1302 * 128 + 64;
                int var9 = arg0.field1163 - var7;
                int var10 = arg0.field1153 - var8;
                if (var9 != 0 || var10 != 0) {
                    var6 = class436.method6936(var9, var10);
                }
            } else if (arg0.field1229 != -1) {
                var6 = arg0.field1229;
            }
            if (var6 != -1) {
                arg0.field1219 = var6;
                if (arg0.field1185) {
                    arg0.field1164 = arg0.field1219;
                }
            }
            arg0.method2258();
        }
        int var11 = arg0.field1219 - arg0.field1164 & 0x7FF;
        if (var11 == 0) {
            if (arg0.field1188) {
                arg0.field1187 = -1;
                arg0.field1188 = false;
            }
            arg0.field1220 = 0;
            return;
        }
        boolean var12 = true;
        boolean var13 = true;
        arg0.field1220++;
        int var14 = var11 > 1024 ? -1 : 1;
        arg0.field1164 += arg0.field1221 * var14;
        boolean var15 = true;
        if (var11 < arg0.field1221 || var11 > 2048 - arg0.field1221) {
            arg0.field1164 = arg0.field1219;
            var15 = false;
        }
        if (arg0.field1221 > 0 && arg0.field1158 == arg0.field1152 && (arg0.field1220 > 25 || var15)) {
            if (var14 == -1 && arg0.field1200 != -1) {
                arg0.field1152 = arg0.field1200;
            } else if (var14 == 1 && arg0.field1160 != -1) {
                arg0.field1152 = arg0.field1160;
            } else {
                arg0.field1152 = arg0.field1159;
            }
        }
        arg0.field1164 &= 0x7FF;
    }

    @ObfuscatedName("ee.ij(Ldi;B)V")
    public static final void method2534(class95 arg0) {
        arg0.field1155 = false;
        if (arg0.field1152 != -1) {
            class208 var1 = class208.method4648(arg0.field1152);
            if (var1 == null) {
                arg0.field1152 = -1;
            } else if (!var1.method3754() && var1.field2285 != null) {
                arg0.field1195++;
                if (arg0.field1161 < var1.field2285.length && arg0.field1195 > var1.field2287[arg0.field1161]) {
                    arg0.field1195 = 1;
                    arg0.field1161++;
                    method4354(var1, arg0.field1161, arg0.field1163, arg0.field1153);
                }
                if (arg0.field1161 >= var1.field2285.length) {
                    if (var1.field2289 > 0) {
                        arg0.field1161 -= var1.field2289;
                        if (var1.field2297) {
                            arg0.field1196++;
                        }
                        if (arg0.field1161 < 0 || arg0.field1161 >= var1.field2285.length || var1.field2297 && arg0.field1196 >= var1.field2298) {
                            arg0.field1195 = 0;
                            arg0.field1161 = 0;
                            arg0.field1196 = 0;
                        }
                    } else {
                        arg0.field1195 = 0;
                        arg0.field1161 = 0;
                    }
                    method4354(var1, arg0.field1161, arg0.field1163, arg0.field1153);
                }
            } else if (var1.method3754()) {
                arg0.field1161++;
                int var2 = var1.method3757();
                if (arg0.field1161 < var2) {
                    method6278(var1, arg0.field1161, arg0.field1163, arg0.field1153);
                } else {
                    if (var1.field2289 > 0) {
                        arg0.field1161 -= var1.field2289;
                        if (var1.field2297) {
                            arg0.field1196++;
                        }
                        if (arg0.field1161 < 0 || arg0.field1161 >= var2 || var1.field2297 && arg0.field1196 >= var1.field2298) {
                            arg0.field1161 = 0;
                            arg0.field1195 = 0;
                            arg0.field1196 = 0;
                        }
                    } else {
                        arg0.field1195 = 0;
                        arg0.field1161 = 0;
                    }
                    method6278(var1, arg0.field1161, arg0.field1163, arg0.field1153);
                }
            } else {
                arg0.field1152 = -1;
            }
        }
        class475 var3 = new class475(arg0.method2274());
        for (class524 var4 = (class524) var3.method7840(); var4 != null; var4 = (class524) var3.next()) {
            if (var4.field5166 != -1 && field506 >= var4.field5171) {
                int var5 = class198.method983(var4.field5166).field2068;
                if (var5 == -1) {
                    var4.method7560();
                    arg0.field1194--;
                } else {
                    var4.field5169 = Math.max(var4.field5169, 0);
                    class208 var6 = class208.method4648(var5);
                    if (var6.field2285 != null && !var6.method3754()) {
                        var4.field5168++;
                        if (var4.field5169 < var6.field2285.length && var4.field5168 > var6.field2287[var4.field5169]) {
                            var4.field5168 = 1;
                            var4.field5169++;
                            method4354(var6, var4.field5169, arg0.field1163, arg0.field1153);
                        }
                        if (var4.field5169 >= var6.field2285.length) {
                            var4.method7560();
                            arg0.field1194--;
                        }
                    } else if (var6.method3754()) {
                        var4.field5169++;
                        int var7 = var6.method3757();
                        if (var4.field5169 < var7) {
                            method6278(var6, var4.field5169, arg0.field1163, arg0.field1153);
                        } else {
                            var4.method7560();
                            arg0.field1194--;
                        }
                    } else {
                        var4.method7560();
                        arg0.field1194--;
                    }
                }
            }
        }
        if (arg0.field1217 != -1 && arg0.field1208 <= 1) {
            class208 var8 = class208.method4648(arg0.field1217);
            if (var8.field2288 == 1 && arg0.field1227 > 0 && arg0.field1212 <= field506 && arg0.field1209 < field506) {
                arg0.field1208 = 1;
                return;
            }
        }
        if (arg0.field1217 != -1 && arg0.field1208 == 0) {
            class208 var9 = class208.method4648(arg0.field1217);
            if (var9 == null) {
                arg0.field1217 = -1;
            } else if (!var9.method3754() && var9.field2285 != null) {
                arg0.field1177++;
                if (arg0.field1198 < var9.field2285.length && arg0.field1177 > var9.field2287[arg0.field1198]) {
                    arg0.field1177 = 1;
                    arg0.field1198++;
                    method4354(var9, arg0.field1198, arg0.field1163, arg0.field1153);
                }
                if (arg0.field1198 >= var9.field2285.length) {
                    arg0.field1198 -= var9.field2289;
                    arg0.field1201++;
                    if (arg0.field1201 >= var9.field2298) {
                        arg0.field1217 = -1;
                    } else if (arg0.field1198 >= 0 && arg0.field1198 < var9.field2285.length) {
                        method4354(var9, arg0.field1198, arg0.field1163, arg0.field1153);
                    } else {
                        arg0.field1217 = -1;
                    }
                }
                arg0.field1155 = var9.field2274;
            } else if (var9.method3754()) {
                arg0.field1198++;
                int var10 = var9.method3757();
                if (arg0.field1198 < var10) {
                    method6278(var9, arg0.field1198, arg0.field1163, arg0.field1153);
                } else {
                    arg0.field1198 -= var9.field2289;
                    arg0.field1201++;
                    if (arg0.field1201 >= var9.field2298) {
                        arg0.field1217 = -1;
                    } else if (arg0.field1198 >= 0 && arg0.field1198 < var10) {
                        method6278(var9, arg0.field1198, arg0.field1163, arg0.field1153);
                    } else {
                        arg0.field1217 = -1;
                    }
                }
            } else {
                arg0.field1217 = -1;
            }
        }
        if (arg0.field1208 > 0) {
            arg0.field1208--;
        }
    }

    @ObfuscatedName("dx.il(B)V")
    public static void method2146() {
        if (Statics.field479 != null) {
            Statics.field479.method7652(Statics.field1882, (Statics.field971.field1163 >> 7) + Statics.field2380, (Statics.field971.field1153 >> 7) + Statics.field1302, false);
            Statics.field479.method7763();
        }
    }

    @ObfuscatedName("ll.ic(Ldh;IIS)V")
    public static void method5146(class92 arg0, int arg1, int arg2) {
        if (arg0.field1217 == arg1 && arg1 != -1) {
            int var3 = class208.method4648(arg1).field2300;
            if (var3 == 1) {
                arg0.field1198 = 0;
                arg0.field1177 = 0;
                arg0.field1208 = arg2;
                arg0.field1201 = 0;
            }
            if (var3 == 2) {
                arg0.field1201 = 0;
            }
        } else if (arg1 == -1 || arg0.field1217 == -1 || class208.method4648(arg1).field2279 >= class208.method4648(arg0.field1217).field2279) {
            arg0.field1217 = arg1;
            arg0.field1198 = 0;
            arg0.field1177 = 0;
            arg0.field1208 = arg2;
            arg0.field1201 = 0;
            arg0.field1227 = arg0.field1222;
        }
    }

    @ObfuscatedName("jh.ik(I)I")
    public static int method4406() {
        return field733 ? 2 : 1;
    }

    @ObfuscatedName("dg.ig(IB)V")
    public static void method2433(int arg0) {
        field732 = 0L;
        if (arg0 >= 2) {
            field733 = true;
        } else {
            field733 = false;
        }
        if (method4406() == 1) {
            Statics.field3874.method524(765, 503);
        } else {
            Statics.field3874.method524(7680, 2160);
        }
        if (field514 < 25) {
            return;
        }
        class296 var1 = class296.method3619(class294.field3196, field568.field1380);
        var1.field3211.method8113(method4406());
        var1.field3211.method8114(Statics.field4720);
        var1.field3211.method8114(Statics.field3024);
        field568.method2642(var1);
    }

    @ObfuscatedName("client.ah(B)V")
    public final void method465() {
        field732 = class301.method4630() + 500L;
        this.method1144();
        if (field799 != -1) {
            this.method1582(true);
        }
    }

    @ObfuscatedName("client.is(I)V")
    public void method1144() {
        int var1 = Statics.field4720;
        int var2 = Statics.field3024;
        if (this.field200 < var1) {
            int var3 = this.field200;
        }
        if (this.field191 < var2) {
            int var4 = this.field191;
        }
        if (Statics.field48 == null) {
            return;
        }
        try {
            client var5 = Statics.field3874;
            Object[] var6 = new Object[] { method4406() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.ie(B)V")
    public final void method1360() {
        if (field799 != -1) {
            int var1 = field799;
            if (class330.method1447(var1)) {
                method3864(Statics.field84[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field722; var2++) {
            if (field724[var2]) {
                field725[var2] = true;
            }
            field744[var2] = field724[var2];
            field724[var2] = false;
        }
        field723 = field506;
        field663 = -1;
        field664 = -1;
        if (field799 != -1) {
            field722 = 0;
            method4352(field799, 0, 0, Statics.field4720, Statics.field3024, 0, 0, -1);
        }
        class511.method8459();
        if (field626) {
            if (field625 == 1) {
                Statics.field58[field576 / 100].method8661(field622 - 8, field623 - 8);
            }
            if (field625 == 2) {
                Statics.field58[field576 / 100 + 4].method8661(field622 - 8, field623 - 8);
            }
        }
        if (field650) {
            method43();
        } else if (field663 != -1) {
            int var3 = field663;
            int var4 = field664;
            if ((field651 >= 2 || field667 != 0 || field669) && field662) {
                int var5 = method2872();
                String var6;
                if (field667 == 1 && field651 < 2) {
                    var6 = class350.field4043 + class350.field3900 + field668 + " " + class101.field1293;
                } else if (field669 && field651 < 2) {
                    var6 = field672 + class350.field3900 + field717 + " " + class101.field1293;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field658[var5].length() > 0) {
                        var7 = field657[var5] + class350.field3900 + field658[var5];
                    } else {
                        var7 = field657[var5];
                    }
                    var6 = var7;
                }
                if (field651 > 2) {
                    var6 = var6 + class101.method6013(16777215) + " " + '/' + " " + (field651 - 2) + class350.field4047;
                }
                Statics.field1789.method6783(var6, var3 + 4, var4 + 15, 16777215, 0, field506 / 1000);
            }
        }
        if (field565 == 3) {
            for (int var8 = 0; var8 < field722; var8++) {
                if (field744[var8]) {
                    class511.method8524(field727[var8], field793[var8], field729[var8], field538[var8], 16711935, 128);
                } else if (field725[var8]) {
                    class511.method8524(field727[var8], field793[var8], field729[var8], field538[var8], 16711680, 128);
                }
            }
        }
        int var9 = Statics.field1882;
        int var10 = Statics.field971.field1163;
        int var11 = Statics.field971.field1153;
        int var12 = field734;
        for (class70 var13 = (class70) class70.field850.method6309(); var13 != null; var13 = (class70) class70.field850.method6311()) {
            if (var13.field843 != -1 || var13.field841 != null) {
                int var14 = 0;
                if (var10 > var13.field848) {
                    var14 += var10 - var13.field848;
                } else if (var10 < var13.field839) {
                    var14 += var13.field839 - var10;
                }
                if (var11 > var13.field842) {
                    var14 += var11 - var13.field842;
                } else if (var11 < var13.field847) {
                    var14 += var13.field847 - var11;
                }
                if (var14 - 64 > var13.field844 || Statics.field48.method2332() == 0 || var13.field838 != var9) {
                    if (var13.field845 != null) {
                        Statics.field1945.method676(var13.field845);
                        var13.field845 = null;
                    }
                    if (var13.field840 != null) {
                        Statics.field1945.method676(var13.field840);
                        var13.field840 = null;
                    }
                } else {
                    var14 -= 64;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = (var13.field844 - var14) * Statics.field48.method2332() / var13.field844;
                    class40 var10000;
                    if (var13.field845 != null) {
                        var13.field845.method829(var15);
                    } else if (var13.field843 >= 0) {
                        var10000 = (class40) null;
                        class40 var16 = class40.method710(Statics.field1245, var13.field843, 0);
                        if (var16 != null) {
                            class41 var17 = var16.method711().method721(Statics.field2260);
                            class49 var18 = class49.method858(var17, 100, var15);
                            var18.method868(-1);
                            Statics.field1945.method665(var18);
                            var13.field845 = var18;
                        }
                    }
                    if (var13.field840 != null) {
                        var13.field840.method829(var15);
                        if (!var13.field840.method7561()) {
                            var13.field840 = null;
                        }
                    } else if (var13.field841 != null && (var13.field849 -= var12) <= 0) {
                        int var19 = (int) (Math.random() * (double) var13.field841.length);
                        var10000 = (class40) null;
                        class40 var20 = class40.method710(Statics.field1245, var13.field841[var19], 0);
                        if (var20 != null) {
                            class41 var21 = var20.method711().method721(Statics.field2260);
                            class49 var22 = class49.method858(var21, 100, var15);
                            var22.method868(0);
                            Statics.field1945.method665(var22);
                            var13.field840 = var22;
                            var13.field849 = var13.field846 + (int) (Math.random() * (double) (var13.field837 - var13.field846));
                        }
                    }
                }
            }
        }
        field734 = 0;
    }

    @ObfuscatedName("ib.iy(Ljava/lang/String;ZI)V")
    public static final void method4347(String arg0, boolean arg1) {
        if (!field628) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field4520.method6798(arg0, 250);
        int var6 = Statics.field4520.method6778(arg0, 250) * 13;
        class511.method8468(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class511.method8472(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field4520.method6785(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method298(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2978.method433(0, 0);
        } else {
            method5949(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("ir.ii(IIIII)V")
    public static final void method4150(int arg0, int arg1, int arg2, int arg3) {
        field619++;
        if (Statics.field971.field1163 >> 7 == field753 && Statics.field971.field1153 >> 7 == field754) {
            field753 = 0;
        }
        if (field752) {
            method2277(Statics.field971, false);
        }
        if (field641 >= 0 && field613[field641] != null) {
            method2277(field613[field641], false);
        }
        method7899(true);
        method5984();
        method7899(false);
        for (class77 var4 = (class77) field644.method6309(); var4 != null; var4 = (class77) field644.method6311()) {
            if (Statics.field1882 != var4.field958 || field506 > var4.field964) {
                var4.method7560();
            } else if (field506 >= var4.field980) {
                if (var4.field967 > 0) {
                    class100 var5 = field563[var4.field967 - 1];
                    if (var5 != null && var5.field1163 >= 0 && var5.field1163 < 13312 && var5.field1153 >= 0 && var5.field1153 < 13312) {
                        var4.method2023(var5.field1163, var5.field1153, method4353(var5.field1163, var5.field1153, var4.field958) - var4.field962, field506);
                    }
                }
                if (var4.field967 < 0) {
                    int var6 = -var4.field967 - 1;
                    class92 var7;
                    if (field630 == var6) {
                        var7 = Statics.field971;
                    } else {
                        var7 = field613[var6];
                    }
                    if (var7 != null && var7.field1163 >= 0 && var7.field1163 < 13312 && var7.field1153 >= 0 && var7.field1153 < 13312) {
                        var4.method2023(var7.field1163, var7.field1153, method4353(var7.field1163, var7.field1153, var4.field958) - var4.field962, field506);
                    }
                }
                var4.method2022(field734);
                Statics.field238.method4180(Statics.field1882, (int) var4.field975, (int) var4.field973, (int) var4.field970, 60, var4, var4.field977, -1L, false);
            }
        }
        for (class72 var8 = (class72) field685.method6309(); var8 != null; var8 = (class72) field685.method6311()) {
            if (Statics.field1882 != var8.field886 || var8.field877) {
                var8.method7560();
            } else if (field506 >= var8.field878) {
                var8.method1951(field734);
                if (var8.field877) {
                    var8.method7560();
                } else {
                    Statics.field238.method4180(var8.field886, var8.field883, var8.field881, var8.field882, 60, var8, 0, -1L, false);
                }
            }
        }
        method5987(arg0, arg1, arg2, arg3, true);
        int var9 = field785;
        int var10 = field760;
        int var11 = field787;
        int var12 = field788;
        class511.method8523(var9, var10, var9 + var11, var10 + var12);
        class226.method4022();
        class511.method8481();
        int var13 = field589;
        if (field606 / 256 > var13) {
            var13 = field606 / 256;
        }
        if (field772[4] && field696[4] + 128 > var13) {
            var13 = field696[4] + 128;
        }
        int var14 = field590 & 0x7FF;
        int var15 = Statics.field4358;
        int var16 = Statics.field918;
        int var17 = Statics.field4295;
        int var18 = method2508(var13);
        int var19 = var12 - 334;
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 100) {
            var19 = 100;
        }
        int var20 = (field780 - field624) * var19 / 100 + field624;
        int var21 = var18 * var20 / 256;
        int var23 = 2048 - var13 & 0x7FF;
        int var24 = 2048 - var14 & 0x7FF;
        int var25 = 0;
        int var26 = 0;
        int var27 = var21;
        if (var23 != 0) {
            int var28 = class226.field2523[var23];
            int var29 = class226.field2520[var23];
            int var30 = var26 * var29 - var21 * var28 >> 16;
            var27 = var26 * var28 + var21 * var29 >> 16;
            var26 = var30;
        }
        if (var24 != 0) {
            int var31 = class226.field2523[var24];
            int var32 = class226.field2520[var24];
            int var33 = var25 * var32 + var27 * var31 >> 16;
            var27 = var27 * var32 - var25 * var31 >> 16;
            var25 = var33;
        }
        if (field751) {
            Statics.field1416 = var15 - var25;
            Statics.field2829 = var16 - var26;
            Statics.field1884 = var17 - var27;
            Statics.field1885 = var13;
            Statics.field369 = var14;
        } else {
            Statics.field2317 = var15 - var25;
            Statics.field1680 = var16 - var26;
            Statics.field4481 = var17 - var27;
            Statics.field3497 = var13;
            Statics.field3093 = var14;
        }
        if (field595 == 1 && field682 >= 2 && field506 % 50 == 0 && (Statics.field4358 >> 7 != Statics.field971.field1163 >> 7 || Statics.field4295 >> 7 != Statics.field971.field1153 >> 7)) {
            int var34 = Statics.field971.field1103;
            int var35 = (Statics.field4358 >> 7) + Statics.field2380;
            int var36 = (Statics.field4295 >> 7) + Statics.field1302;
            class296 var37 = class296.method3619(class294.field3183, field568.field1380);
            var37.field3211.method8220(var36);
            var37.field3211.method8113(var34);
            var37.field3211.method8169(var35);
            var37.field3211.method8181(field602);
            field568.method2642(var37);
        }
        int var38;
        if (field751) {
            int var39;
            if (Statics.field48.method2316()) {
                var39 = Statics.field1882;
            } else {
                int var40 = method4353(Statics.field2317, Statics.field4481, Statics.field1882);
                if (var40 - Statics.field1680 >= 800 || (class82.field1018[Statics.field1882][Statics.field2317 >> 7][Statics.field4481 >> 7] & 0x4) == 0) {
                    var39 = 3;
                } else {
                    var39 = Statics.field1882;
                }
            }
            var38 = var39;
        } else {
            var38 = method262();
        }
        int var41 = Statics.field2317;
        int var42 = Statics.field1680;
        int var43 = Statics.field4481;
        int var44 = Statics.field3497;
        int var45 = Statics.field3093;
        for (int var46 = 0; var46 < 5; var46++) {
            if (field772[var46]) {
                int var47 = (int) (Math.random() * (double) (field773[var46] * 2 + 1) - (double) field773[var46] + Math.sin((double) field775[var46] / 100.0D * (double) field764[var46]) * (double) field696[var46]);
                if (var46 == 0) {
                    Statics.field2317 += var47;
                }
                if (var46 == 1) {
                    Statics.field1680 += var47;
                }
                if (var46 == 2) {
                    Statics.field4481 += var47;
                }
                if (var46 == 3) {
                    Statics.field3093 = Statics.field3093 + var47 & 0x7FF;
                }
                if (var46 == 4) {
                    Statics.field3497 += var47;
                    if (Statics.field3497 < 128) {
                        Statics.field3497 = 128;
                    }
                    if (Statics.field3497 > 383) {
                        Statics.field3497 = 383;
                    }
                }
            }
        }
        int var48 = class36.field221;
        int var49 = class36.field229;
        if (class36.field232 != 0) {
            var48 = class36.field233;
            var49 = class36.field234;
        }
        if (var48 >= var9 && var48 < var9 + var11 && var49 >= var10 && var49 < var10 + var12) {
            int var50 = var48 - var9;
            int var51 = var49 - var10;
            class240.field2764 = var50;
            class240.field2765 = var51;
            class240.field2769 = true;
            class240.field2770 = 0;
            class240.field2766 = false;
        } else {
            class240.field2769 = false;
            class240.field2770 = 0;
        }
        method4957();
        class511.method8468(var9, var10, var11, var12, 0);
        method4957();
        int var52 = class226.method4014();
        class226.method4056(Statics.field3874.field210);
        class226.field2521.field2797 = field789;
        Statics.field238.method4266(Statics.field2317, Statics.field1680, Statics.field4481, Statics.field3497, Statics.field3093, var38);
        class226.method4056(false);
        if (field618) {
            class511.method8482();
        }
        class226.field2521.field2797 = var52;
        method4957();
        Statics.field238.method4158();
        Statics.method2972(var9, var10, var11, var12);
        if (field525 == 2) {
            method1020((field528 - Statics.field2380 << 7) + field531, (field698 - Statics.field1302 << 7) + field532, field530 * 2);
            if (field620 > -1 && field506 % 20 < 10) {
                Statics.field253[0].method8661(field620 + var9 - 12, field674 + var10 - 28);
            }
        }
        ((class236) class226.field2521.field2793).method4370(field734);
        method2159(var9, var10, var11, var12);
        Statics.field2317 = var41;
        Statics.field1680 = var42;
        Statics.field4481 = var43;
        Statics.field3497 = var44;
        Statics.field3093 = var45;
        if (field517) {
            byte var53 = 0;
            int var54 = class358.field4272 + class358.field4270 + var53;
            if (var54 == 0) {
                field517 = false;
            }
        }
        if (field517) {
            class511.method8468(var9, var10, var11, var12, 0);
            method4347(class350.field3920, false);
        }
    }

    @ObfuscatedName("nf.io(IIIIZB)V")
    public static final void method5987(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field777;
        } else if (var5 >= 100) {
            var6 = field621;
        } else {
            var6 = (field621 - field777) * var5 / 100 + field777;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field592) {
            short var8 = field592;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field782) {
                var6 = field782;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class511.method8459();
                    class511.method8468(arg0, arg1, var10, arg3, -16777216);
                    class511.method8468(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field784) {
            short var11 = field784;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field781) {
                var6 = field781;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class511.method8459();
                    class511.method8468(arg0, arg1, arg2, var13, -16777216);
                    class511.method8468(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field789 = arg3 * var6 / 334;
        if (field787 != arg2 || field788 != arg3) {
            method3048(arg2, arg3);
        }
        field785 = arg0;
        field760 = arg1;
        field787 = arg2;
        field788 = arg3;
    }

    @ObfuscatedName("mf.it(B)V")
    public static void method5984() {
        int var0 = class107.field1332;
        int[] var1 = class107.field1335;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field641 != var1[var2] && field630 != var1[var2]) {
                method2277(field613[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("dj.ia(Ldh;ZI)V")
    public static void method2277(class92 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2192() || arg0.field1115) {
            return;
        }
        arg0.field1117 = false;
        if ((field508 && class107.field1332 > 50 || class107.field1332 > 200) && arg1 && arg0.field1158 == arg0.field1152) {
            arg0.field1117 = true;
        }
        int var2 = arg0.field1163 >> 7;
        int var3 = arg0.field1153 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class240.method6770(0, 0, 0, false, arg0.field1121);
        if (arg0.field1119 != null && field506 >= arg0.field1109 && field506 < arg0.field1111) {
            arg0.field1117 = false;
            arg0.field1106 = method4353(arg0.field1163, arg0.field1153, Statics.field1882);
            arg0.field1157 = field506;
            Statics.field238.method4164(Statics.field1882, arg0.field1163, arg0.field1153, arg0.field1106, 60, arg0, arg0.field1164, var4, arg0.field1113, arg0.field1114, arg0.field1122, arg0.field1116);
            return;
        }
        if ((arg0.field1163 & 0x7F) == 64 && (arg0.field1153 & 0x7F) == 64) {
            if (field619 == field633[var2][var3]) {
                return;
            }
            field633[var2][var3] = field619;
        }
        arg0.field1106 = method4353(arg0.field1163, arg0.field1153, Statics.field1882);
        arg0.field1157 = field506;
        Statics.field238.method4180(Statics.field1882, arg0.field1163, arg0.field1153, arg0.field1106, 60, arg0, arg0.field1164, var4, arg0.field1155);
    }

    @ObfuscatedName("sm.iq(ZS)V")
    public static final void method7899(boolean arg0) {
        for (int var1 = 0; var1 < field542; var1++) {
            class100 var2 = field563[field540[var1]];
            if (var2 != null && var2.method2192() && var2.field1292.field2028 == arg0 && var2.field1292.method3374()) {
                int var3 = var2.field1163 >> 7;
                int var4 = var2.field1153 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1156 == 1 && (var2.field1163 & 0x7F) == 64 && (var2.field1153 & 0x7F) == 64) {
                        if (field619 == field633[var3][var4]) {
                            continue;
                        }
                        field633[var3][var4] = field619;
                    }
                    long var5 = class240.method6770(0, 0, 1, !var2.field1292.field2001, field540[var1]);
                    var2.field1157 = field506;
                    Statics.field238.method4180(Statics.field1882, var2.field1163, var2.field1153, method4353(var2.field1163 + (var2.field1156 * 64 - 64), var2.field1153 + (var2.field1156 * 64 - 64), Statics.field1882), var2.field1156 * 64 - 64 + 60, var2, var2.field1164, var5, var2.field1155);
                }
            }
        }
    }

    @ObfuscatedName("ah.iw(B)I")
    public static final int method262() {
        if (Statics.field48.method2316()) {
            return Statics.field1882;
        }
        int var0 = 3;
        if (Statics.field3497 < 310) {
            int var1;
            int var2;
            if (field595 == 1) {
                var1 = Statics.field4358 >> 7;
                var2 = Statics.field4295 >> 7;
            } else {
                var1 = Statics.field971.field1163 >> 7;
                var2 = Statics.field971.field1153 >> 7;
            }
            int var3 = Statics.field2317 >> 7;
            int var4 = Statics.field4481 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field1882;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1882;
            }
            if ((class82.field1018[Statics.field1882][var3][var4] & 0x4) != 0) {
                var0 = Statics.field1882;
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
                    if ((class82.field1018[Statics.field1882][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1882;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class82.field1018[Statics.field1882][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1882;
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
                    if ((class82.field1018[Statics.field1882][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1882;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class82.field1018[Statics.field1882][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1882;
                        }
                    }
                }
            }
        }
        if (Statics.field971.field1163 >= 0 && Statics.field971.field1153 >= 0 && Statics.field971.field1163 < 13312 && Statics.field971.field1153 < 13312) {
            if ((class82.field1018[Statics.field1882][Statics.field971.field1163 >> 7][Statics.field971.field1153 >> 7] & 0x4) != 0) {
                var0 = Statics.field1882;
            }
            return var0;
        } else {
            return Statics.field1882;
        }
    }

    @ObfuscatedName("cg.ix(I)Loy;")
    public static class376 method1109() {
        return field746;
    }

    @ObfuscatedName("dm.iv(S)V")
    public static void method2062() {
        for (class211 var0 = (class211) field743.method6309(); var0 != null; var0 = (class211) field743.method6311()) {
            var0.method7560();
        }
    }

    @ObfuscatedName("tc.id(B)Z")
    public static boolean method8068() {
        return (field637 & 0x4) != 0;
    }

    @ObfuscatedName("ee.ip(I)Z")
    public static boolean method2527() {
        return (field637 & 0x8) != 0;
    }

    @ObfuscatedName("jm.ir(Ldh;I)Z")
    public static boolean method4876(class92 arg0) {
        if (field637 == 0) {
            return false;
        } else if (Statics.field971 == arg0) {
            return method2527();
        } else {
            boolean var1 = method8068();
            if (!var1) {
                boolean var2 = (field637 & 0x1) != 0;
                var1 = var2 && arg0.method2199();
            }
            boolean var3 = var1;
            if (!var1) {
                boolean var4 = (field637 & 0x2) != 0;
                var3 = var4 && arg0.method2177();
            }
            return var3;
        }
    }

    @ObfuscatedName("mx.iz(Ldi;IIIIII)V")
    public static final void method5414(class95 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2192()) {
            return;
        }
        if (arg0 instanceof class100) {
            class195 var6 = ((class100) arg0).field1292;
            if (var6.field2022 != null) {
                var6 = var6.method3404();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class107.field1332;
        int[] var8 = class107.field1335;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1173 != null && (!var9 || !arg0.field1175 && (field558 == 4 || !arg0.field1166 && (field558 == 0 || field558 == 3 || field558 == 1 && ((class92) arg0).method2199())))) {
            method7190(arg0, arg0.field1205);
            if (field620 > -1 && field756 < field534) {
                field612[field756] = Statics.field1789.method6775(arg0.field1173) / 2;
                field611[field756] = Statics.field1789.field4447;
                field609[field756] = field620;
                field610[field756] = field674 - var10;
                field697[field756] = arg0.field1190;
                field544[field756] = arg0.field1178;
                field529[field756] = arg0.field1215;
                field615[field756] = arg0.field1225;
                field617[field756] = arg0.field1173;
                field756++;
                var10 += 12;
            }
        }
        if (!arg0.field1186.method6363()) {
            method7190(arg0, arg0.field1205 + 15);
            for (class99 var11 = (class99) arg0.field1186.method6360(); var11 != null; var11 = (class99) arg0.field1186.method6362()) {
                class96 var12 = var11.method2426(field506);
                if (var12 != null) {
                    class190 var13 = var11.field1275;
                    class515 var14 = var13.method3332();
                    class515 var15 = var13.method3331();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field1962;
                    } else {
                        if (var13.field1966 * 2 < var15.field5115) {
                            var16 = var13.field1966;
                        }
                        var17 = var15.field5115 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field506 - var12.field1232;
                    int var21 = var12.field1230 * var17 / var13.field1962;
                    int var24;
                    if (var12.field1233 > var20) {
                        int var22 = var13.field1961 == 0 ? 0 : var20 / var13.field1961 * var13.field1961;
                        int var23 = var12.field1231 * var17 / var13.field1962;
                        var24 = (var21 - var23) * var22 / var12.field1233 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1233 + var13.field1965 - var20;
                        if (var13.field1960 >= 0) {
                            var18 = (var25 << 8) / (var13.field1965 - var13.field1960);
                        }
                    }
                    if (var12.field1230 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field620 > -1) {
                            int var31 = field620 + arg2 - (var17 >> 1);
                            int var32 = field674 + arg3 - var10;
                            class511.method8468(var31, var32, var24, 5, 65280);
                            class511.method8468(var24 + var31, var32, var17 - var24, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var26;
                        if (var17 == var24) {
                            var26 = var16 * 2 + var24;
                        } else {
                            var26 = var16 + var24;
                        }
                        int var27 = var14.field5120;
                        var10 += var27;
                        int var28 = field620 + arg2 - (var17 >> 1);
                        int var29 = field674 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method8599(var30, var29, var18);
                            class511.method8500(var30, var29, var26 + var30, var27 + var29);
                            var15.method8599(var30, var29, var18);
                        } else {
                            var14.method8661(var30, var29);
                            class511.method8500(var30, var29, var26 + var30, var27 + var29);
                            var15.method8661(var30, var29);
                        }
                        class511.method8523(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2427()) {
                    var11.method7560();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field506 == arg0.field1157 && method4876((class92) arg0)) {
            class92 var33 = (class92) arg0;
            if (var9) {
                method7190(arg0, arg0.field1205 + 15);
                class396 var34 = (class396) field527.get(class473.field4895);
                var10 += 4;
                var34.method6784(var33.field1112.method8756(), field620 + arg2, field674 + arg3 - var10, 16777215, 0);
                var10 += 18;
            }
        }
        if (var9) {
            class92 var35 = (class92) arg0;
            if (var35.field1115) {
                return;
            }
            if (var35.field1107 != -1 || var35.field1102 != -1) {
                method7190(arg0, arg0.field1205 + 15);
                if (field620 > -1) {
                    if (var35.field1107 != -1) {
                        var10 += 25;
                        Statics.field2024[var35.field1107].method8661(field620 + arg2 - 12, field674 + arg3 - var10);
                    }
                    if (var35.field1102 != -1) {
                        var10 += 25;
                        Statics.field1732[var35.field1102].method8661(field620 + arg2 - 12, field674 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field525 == 10 && field798 == var8[arg1]) {
                method7190(arg0, arg0.field1205 + 15);
                if (field620 > -1) {
                    int var36 = Statics.field253[1].field5120 + var10;
                    Statics.field253[1].method8661(field620 + arg2 - 12, field674 + arg3 - var36);
                }
            }
        } else {
            class100 var37 = (class100) arg0;
            int[] var38 = var37.method2442();
            short[] var39 = var37.method2443();
            if (var39 != null && var38 != null) {
                for (int var40 = 0; var40 < var39.length; var40++) {
                    if (var39[var40] >= 0 && var38[var40] >= 0) {
                        long var41 = (long) var38[var40] << 8 | (long) var39[var40];
                        class515 var43 = (class515) field616.method7059(var41);
                        if (var43 == null) {
                            class515[] var44 = class516.method5081(Statics.field1874, var38[var40], 0);
                            if (var44 != null && var39[var40] < var44.length) {
                                var43 = var44[var39[var40]];
                                field616.method7041(var41, var43);
                            }
                        }
                        if (var43 != null) {
                            method7190(arg0, arg0.field1205 + 15);
                            if (field620 > -1) {
                                var43.method8661(field620 + arg2 - (var43.field5115 >> 1), field674 + (arg3 - var43.field5120) - 4);
                            }
                        }
                    }
                }
            }
            if (field525 == 1 && field526 == field540[arg1 - var7] && field506 % 20 < 10) {
                method7190(arg0, arg0.field1205 + 15);
                if (field620 > -1) {
                    Statics.field253[0].method8661(field620 + arg2 - 12, field674 + arg3 - 28);
                }
            }
        }
        for (int var45 = 0; var45 < 4; var45++) {
            int var46 = arg0.field1183[var45];
            int var47 = arg0.field1181[var45];
            class204 var48 = null;
            int var49 = 0;
            if (var47 >= 0) {
                if (var46 <= field506) {
                    continue;
                }
                var48 = class204.method5476(arg0.field1181[var45]);
                var49 = var48.field2135;
                if (var48 != null && var48.field2124 != null) {
                    var48 = var48.method3553();
                    if (var48 == null) {
                        arg0.field1183[var45] = -1;
                        continue;
                    }
                }
            } else if (var46 < 0) {
                continue;
            }
            int var50 = arg0.field1176[var45];
            class204 var51 = null;
            if (var50 >= 0) {
                var51 = class204.method5476(var50);
                if (var51 != null && var51.field2124 != null) {
                    var51 = var51.method3553();
                }
            }
            if (var46 - var49 <= field506) {
                if (var48 == null) {
                    arg0.field1183[var45] = -1;
                } else {
                    method7190(arg0, arg0.field1205 / 2);
                    if (field620 > -1) {
                        boolean var52 = true;
                        if (var45 == 1) {
                            field674 -= 20;
                        }
                        if (var45 == 2) {
                            field620 -= 15;
                            field674 -= 10;
                        }
                        if (var45 == 3) {
                            field620 += 15;
                            field674 -= 10;
                        }
                        Object var53 = null;
                        Object var54 = null;
                        Object var55 = null;
                        Object var56 = null;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        class515 var65 = null;
                        class515 var66 = null;
                        class515 var67 = null;
                        class515 var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        class515 var78 = var48.method3535();
                        if (var78 != null) {
                            var57 = var78.field5115;
                            int var79 = var78.field5120;
                            if (var79 > var77) {
                                var77 = var79;
                            }
                            var61 = var78.field5114;
                        }
                        class515 var80 = var48.method3536();
                        if (var80 != null) {
                            var58 = var80.field5115;
                            int var81 = var80.field5120;
                            if (var81 > var77) {
                                var77 = var81;
                            }
                            var62 = var80.field5114;
                        }
                        class515 var82 = var48.method3558();
                        if (var82 != null) {
                            var59 = var82.field5115;
                            int var83 = var82.field5120;
                            if (var83 > var77) {
                                var77 = var83;
                            }
                            var63 = var82.field5114;
                        }
                        class515 var84 = var48.method3545();
                        if (var84 != null) {
                            var60 = var84.field5115;
                            int var85 = var84.field5120;
                            if (var85 > var77) {
                                var77 = var85;
                            }
                            var64 = var84.field5114;
                        }
                        if (var51 != null) {
                            var65 = var51.method3535();
                            if (var65 != null) {
                                var69 = var65.field5115;
                                int var86 = var65.field5120;
                                if (var86 > var77) {
                                    var77 = var86;
                                }
                                var73 = var65.field5114;
                            }
                            var66 = var51.method3536();
                            if (var66 != null) {
                                var70 = var66.field5115;
                                int var87 = var66.field5120;
                                if (var87 > var77) {
                                    var77 = var87;
                                }
                                var74 = var66.field5114;
                            }
                            var67 = var51.method3558();
                            if (var67 != null) {
                                var71 = var67.field5115;
                                int var88 = var67.field5120;
                                if (var88 > var77) {
                                    var77 = var88;
                                }
                                var75 = var67.field5114;
                            }
                            var68 = var51.method3545();
                            if (var68 != null) {
                                var72 = var68.field5115;
                                int var89 = var68.field5120;
                                if (var89 > var77) {
                                    var77 = var89;
                                }
                                var76 = var68.field5114;
                            }
                        }
                        class392 var90 = var48.method3539();
                        if (var90 == null) {
                            var90 = Statics.field227;
                        }
                        class392 var91;
                        if (var51 == null) {
                            var91 = Statics.field227;
                        } else {
                            var91 = var51.method3539();
                            if (var91 == null) {
                                var91 = Statics.field227;
                            }
                        }
                        Object var92 = null;
                        String var93 = null;
                        boolean var94 = false;
                        int var95 = 0;
                        String var96 = var48.method3534(arg0.field1182[var45]);
                        int var97 = var90.method6775(var96);
                        if (var51 != null) {
                            var93 = var51.method3534(arg0.field1167[var45]);
                            var95 = var91.method6775(var93);
                        }
                        int var98 = 0;
                        int var99 = 0;
                        if (var58 > 0) {
                            if (var82 == null && var84 == null) {
                                var98 = 1;
                            } else {
                                var98 = var97 / var58 + 1;
                            }
                        }
                        if (var51 != null && var70 > 0) {
                            if (var67 == null && var68 == null) {
                                var99 = 1;
                            } else {
                                var99 = var95 / var70 + 1;
                            }
                        }
                        int var100 = 0;
                        int var101 = var100;
                        if (var57 > 0) {
                            var100 += var57;
                        }
                        var100 += 2;
                        int var102 = var100;
                        if (var59 > 0) {
                            var100 += var59;
                        }
                        int var103 = var100;
                        int var104 = var100;
                        int var106;
                        if (var58 > 0) {
                            int var105 = var58 * var98;
                            var106 = var100 + var105;
                            var104 = (var105 - var97) / 2 + var100;
                        } else {
                            var106 = var97 + var100;
                        }
                        int var107 = var106;
                        if (var60 > 0) {
                            var106 += var60;
                        }
                        int var108 = 0;
                        int var109 = 0;
                        int var110 = 0;
                        int var111 = 0;
                        int var112 = 0;
                        if (var51 != null) {
                            var106 += 2;
                            var108 = var106;
                            if (var69 > 0) {
                                var106 += var69;
                            }
                            var106 += 2;
                            var109 = var106;
                            if (var71 > 0) {
                                var106 += var71;
                            }
                            var110 = var106;
                            var112 = var106;
                            if (var70 > 0) {
                                int var113 = var70 * var99;
                                var106 += var113;
                                var112 += (var113 - var95) / 2;
                            } else {
                                var106 += var95;
                            }
                            var111 = var106;
                            if (var72 > 0) {
                                var106 += var72;
                            }
                        }
                        int var114 = arg0.field1183[var45] - field506;
                        int var115 = var48.field2134 - var48.field2134 * var114 / var48.field2135;
                        int var116 = var48.field2141 * var114 / var48.field2135 + -var48.field2141;
                        int var117 = field620 + arg2 - (var106 >> 1) + var115;
                        int var118 = field674 + arg3 - 12 + var116;
                        int var119 = var118;
                        int var120 = var77 + var118;
                        int var121 = var48.field2139 + var118 + 15;
                        int var122 = var121 - var90.field4453;
                        int var123 = var90.field4454 + var121;
                        if (var122 < var118) {
                            var119 = var122;
                        }
                        if (var123 > var120) {
                            var120 = var123;
                        }
                        int var124 = 0;
                        if (var51 != null) {
                            var124 = var51.field2139 + var118 + 15;
                            int var125 = var124 - var91.field4453;
                            int var126 = var91.field4454 + var124;
                            if (var125 < var119) {
                                ;
                            }
                            if (var126 > var120) {
                                ;
                            }
                        }
                        int var129 = 255;
                        if (var48.field2138 >= 0) {
                            var129 = (var114 << 8) / (var48.field2135 - var48.field2138);
                        }
                        if (var129 >= 0 && var129 < 255) {
                            if (var78 != null) {
                                var78.method8599(var101 + var117 - var61, var118, var129);
                            }
                            if (var82 != null) {
                                var82.method8599(var102 + var117 - var63, var118, var129);
                            }
                            if (var80 != null) {
                                for (int var130 = 0; var130 < var98; var130++) {
                                    var80.method8599(var58 * var130 + (var103 + var117 - var62), var118, var129);
                                }
                            }
                            if (var84 != null) {
                                var84.method8599(var107 + var117 - var64, var118, var129);
                            }
                            var90.method6795(var96, var104 + var117, var121, var48.field2128, 0, var129);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8599(var108 + var117 - var73, var118, var129);
                                }
                                if (var67 != null) {
                                    var67.method8599(var109 + var117 - var75, var118, var129);
                                }
                                if (var66 != null) {
                                    for (int var131 = 0; var131 < var99; var131++) {
                                        var66.method8599(var70 * var131 + (var110 + var117 - var74), var118, var129);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8599(var111 + var117 - var76, var118, var129);
                                }
                                var91.method6795(var93, var112 + var117, var124, var51.field2128, 0, var129);
                            }
                        } else {
                            if (var78 != null) {
                                var78.method8661(var101 + var117 - var61, var118);
                            }
                            if (var82 != null) {
                                var82.method8661(var102 + var117 - var63, var118);
                            }
                            if (var80 != null) {
                                for (int var132 = 0; var132 < var98; var132++) {
                                    var80.method8661(var58 * var132 + (var103 + var117 - var62), var118);
                                }
                            }
                            if (var84 != null) {
                                var84.method8661(var107 + var117 - var64, var118);
                            }
                            var90.method6828(var96, var104 + var117, var121, var48.field2128 | 0xFF000000, 0);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8661(var108 + var117 - var73, var118);
                                }
                                if (var67 != null) {
                                    var67.method8661(var109 + var117 - var75, var118);
                                }
                                if (var66 != null) {
                                    for (int var133 = 0; var133 < var99; var133++) {
                                        var66.method8661(var70 * var133 + (var110 + var117 - var74), var118);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8661(var111 + var117 - var76, var118);
                                }
                                var91.method6828(var93, var112 + var117, var124, var51.field2128 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dz.im(IIIII)V")
    public static final void method2159(int arg0, int arg1, int arg2, int arg3) {
        field627 = 0;
        int var4 = (Statics.field971.field1163 >> 7) + Statics.field2380;
        int var5 = (Statics.field971.field1153 >> 7) + Statics.field1302;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field627 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field627 = 1;
        }
        if (field627 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field627 = 0;
        }
    }

    @ObfuscatedName("qo.if(Ldi;IB)V")
    public static final void method7190(class95 arg0, int arg1) {
        method1020(arg0.field1163, arg0.field1153, arg1);
    }

    @ObfuscatedName("ch.iu(IIII)V")
    public static final void method1020(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field620 = -1;
            field674 = -1;
            return;
        }
        int var3 = method4353(arg0, arg1, Statics.field1882) - arg2;
        int var4 = arg0 - Statics.field2317;
        int var5 = var3 - Statics.field1680;
        int var6 = arg1 - Statics.field4481;
        int var7 = class226.field2523[Statics.field3497];
        int var8 = class226.field2520[Statics.field3497];
        int var9 = class226.field2523[Statics.field3093];
        int var10 = class226.field2520[Statics.field3093];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field620 = field789 * var11 / var15 + field787 / 2;
            field674 = field789 * var14 / var15 + field788 / 2;
        } else {
            field620 = -1;
            field674 = -1;
        }
    }

    @ObfuscatedName("im.jw(IIIB)I")
    public static final int method4353(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class82.field1018[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class82.field1016[var5][var3][var4] + class82.field1016[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class82.field1016[var5][var3][var4 + 1] + class82.field1016[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("au.jp(ZLtl;I)V")
    public static final void method288(boolean arg0, class500 arg1) {
        field579 = arg0;
        if (!field579) {
            int var2 = arg1.method8250();
            int var3 = arg1.method8172();
            int var4 = arg1.method8195();
            Statics.field2081 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field2081[var5][var6] = arg1.method8134();
                }
            }
            Statics.field2789 = new int[var4];
            Statics.field3051 = new int[var4];
            Statics.field1529 = new int[var4];
            Statics.field2868 = new byte[var4][];
            Statics.field915 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field2789[var7] = var10;
                    Statics.field3051[var7] = Statics.field3406.method6097("m" + var8 + "_" + var9);
                    Statics.field1529[var7] = Statics.field3406.method6097("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method663(var3, var2, true);
            return;
        }
        boolean var11 = arg1.method8129() == 1;
        int var12 = arg1.method8172();
        int var13 = arg1.method8250();
        int var14 = arg1.method8195();
        arg1.method8080();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8104(1);
                    if (var18 == 1) {
                        field555[var15][var16][var17] = arg1.method8104(26);
                    } else {
                        field555[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8082();
        Statics.field2081 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field2081[var19][var20] = arg1.method8134();
            }
        }
        Statics.field2789 = new int[var14];
        Statics.field3051 = new int[var14];
        Statics.field1529 = new int[var14];
        Statics.field2868 = new byte[var14][];
        Statics.field915 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field555[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field2789[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field2789[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field3051[var21] = Statics.field3406.method6097("m" + var30 + "_" + var31);
                            Statics.field1529[var21] = Statics.field3406.method6097("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method663(var13, var12, !var11);
    }

    @ObfuscatedName("bx.jr(IIZB)V")
    public static final void method663(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2315 == arg0 && Statics.field1892 == arg1) {
            return;
        }
        Statics.field2315 = arg0;
        Statics.field1892 = arg1;
        method2711(25);
        method4347(class350.field3920, true);
        int var3 = Statics.field2380;
        int var4 = Statics.field1302;
        Statics.field2380 = (arg0 - 6) * 8;
        Statics.field1302 = (arg1 - 6) * 8;
        int var5 = Statics.field2380 - var3;
        int var6 = Statics.field1302 - var4;
        int var7 = Statics.field2380;
        int var8 = Statics.field1302;
        for (int var9 = 0; var9 < 65536; var9++) {
            class100 var10 = field563[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1223[var11] -= var5;
                    var10.field1193[var11] -= var6;
                }
                var10.field1163 -= var5 * 128;
                var10.field1153 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class92 var13 = field613[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1223[var14] -= var5;
                    var13.field1193[var14] -= var6;
                }
                var13.field1163 -= var5 * 128;
                var13.field1153 -= var6 * 128;
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
                        field642[var25][var21][var22] = field642[var25][var23][var24];
                    } else {
                        field642[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class94 var26 = (class94) field643.method6309(); var26 != null; var26 = (class94) field643.method6311()) {
            var26.field1136 -= var5;
            var26.field1146 -= var6;
            if (var26.field1136 < 0 || var26.field1146 < 0 || var26.field1136 >= 104 || var26.field1146 >= 104) {
                var26.method7560();
            }
        }
        if (field753 != 0) {
            field753 -= var5;
            field754 -= var6;
        }
        field684 = 0;
        field751 = false;
        Statics.field2317 -= var5 << 7;
        Statics.field4481 -= var6 << 7;
        Statics.field4358 -= var5 << 7;
        Statics.field4295 -= var6 << 7;
        field748 = -1;
        field685.method6314();
        field644.method6314();
        for (int var27 = 0; var27 < 4; var27++) {
            field776[var27].method3824();
        }
    }

    @ObfuscatedName("ax.jh(ZB)V")
    public static final void method13(boolean arg0) {
        method4957();
        field568.field1385++;
        if (field568.field1385 < 50 && !arg0) {
            return;
        }
        field568.field1385 = 0;
        if (field570 || field568.method2639() == null) {
            return;
        }
        class296 var1 = class296.method3619(class294.field3150, field568.field1380);
        field568.method2642(var1);
        try {
            field568.method2633();
        } catch (IOException var3) {
            field570 = true;
        }
    }

    @ObfuscatedName("bn.jd(B)V")
    public static final void method647() {
        method13(false);
        field573 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2868.length; var1++) {
            if (Statics.field3051[var1] != -1 && Statics.field2868[var1] == null) {
                Statics.field2868[var1] = Statics.field3406.method6080(Statics.field3051[var1], 0);
                if (Statics.field2868[var1] == null) {
                    var0 = false;
                    field573++;
                }
            }
            if (Statics.field1529[var1] != -1 && Statics.field915[var1] == null) {
                Statics.field915[var1] = Statics.field3406.method6081(Statics.field1529[var1], 0, Statics.field2081[var1]);
                if (Statics.field915[var1] == null) {
                    var0 = false;
                    field573++;
                }
            }
        }
        if (!var0) {
            field577 = 1;
            return;
        }
        field575 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2868.length; var3++) {
            byte[] var4 = Statics.field915[var3];
            if (var4 != null) {
                int var5 = (Statics.field2789[var3] >> 8) * 64 - Statics.field2380;
                int var6 = (Statics.field2789[var3] & 0xFF) * 64 - Statics.field1302;
                if (field579) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= Statics.method5192(var4, var5, var6);
            }
        }
        if (!var2) {
            field577 = 2;
            return;
        }
        if (field577 != 0) {
            method4347(class350.field3920 + class101.field1299 + class101.field1296 + 100 + "%" + class101.field1297, true);
        }
        method4957();
        Statics.field238.method4310();
        for (int var7 = 0; var7 < 4; var7++) {
            field776[var7].method3824();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class82.field1018[var8][var9][var10] = 0;
                }
            }
        }
        method4957();
        class82.method4996();
        int var11 = Statics.field2868.length;
        class70.method2945();
        method13(true);
        if (!field579) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2789[var12] >> 8) * 64 - Statics.field2380;
                int var14 = (Statics.field2789[var12] & 0xFF) * 64 - Statics.field1302;
                byte[] var15 = Statics.field2868[var12];
                if (var15 != null) {
                    method4957();
                    class82.method4646(var15, var13, var14, Statics.field2315 * 8 - 48, Statics.field1892 * 8 - 48, field776);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field2789[var16] >> 8) * 64 - Statics.field2380;
                int var18 = (Statics.field2789[var16] & 0xFF) * 64 - Statics.field1302;
                byte[] var19 = Statics.field2868[var16];
                if (var19 == null && Statics.field1892 < 800) {
                    method4957();
                    class82.method3227(var17, var18, 64, 64);
                }
            }
            method13(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field915[var20];
                if (var21 != null) {
                    int var22 = (Statics.field2789[var20] >> 8) * 64 - Statics.field2380;
                    int var23 = (Statics.field2789[var20] & 0xFF) * 64 - Statics.field1302;
                    method4957();
                    class82.method2751(var21, var22, var23, Statics.field238, field776);
                }
            }
        }
        if (field579) {
            for (int var24 = 0; var24 < 4; var24++) {
                method4957();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field555[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field2789.length; var34++) {
                                if (Statics.field2789[var34] == var33 && Statics.field2868[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class82.method4346(Statics.field2868[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field776);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class82.method1093(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field555[0][var37][var38];
                    if (var39 == -1) {
                        class82.method3227(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method13(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method4957();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field555[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field2789.length; var49++) {
                                if (Statics.field2789[var49] == var48 && Statics.field915[var49] != null) {
                                    class82.method2070(Statics.field915[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field238, field776);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method13(true);
        method4957();
        Statics.method3258(Statics.field238, field776);
        method13(true);
        int var50 = class82.field1017;
        if (var50 > Statics.field1882) {
            var50 = Statics.field1882;
        }
        if (var50 < Statics.field1882 - 1) {
            int var51 = Statics.field1882 - 1;
        }
        if (field508) {
            Statics.field238.method4166(class82.field1017);
        } else {
            Statics.field238.method4166(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method2819(var52, var53);
            }
        }
        method4957();
        method4552();
        class205.field2154.method5124();
        if (Statics.field3874.method497()) {
            class296 var54 = class296.method3619(class294.field3173, field568.field1380);
            var54.field3211.method8270(1057001181);
            field568.method2642(var54);
        }
        if (!field579) {
            int var55 = (Statics.field2315 - 6) / 8;
            int var56 = (Statics.field2315 + 6) / 8;
            int var57 = (Statics.field1892 - 6) / 8;
            int var58 = (Statics.field1892 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field3406.method6103("m" + var59 + "_" + var60);
                        Statics.field3406.method6103("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method2711(30);
        method4957();
        class82.method3061();
        class296 var61 = class296.method3619(class294.field3115, field568.field1380);
        field568.method2642(var61);
        class35.method2774();
    }

    @ObfuscatedName("eb.jx(IIIIIB)V")
    public static final void method2739(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field238.method4304(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field238.method4182(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class240.method556(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field171.field5123;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class240.method3900(var5);
            class205 var14 = class205.method3219(var13);
            if (var14.field2174 == -1) {
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
                class514 var15 = Statics.field335[var14.field2174];
                if (var15 != null) {
                    int var16 = (var14.field2160 * 4 - var15.field5108) / 2;
                    int var17 = (var14.field2161 * 4 - var15.field5109) / 2;
                    var15.method8564(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field2161) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field238.method4223(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field238.method4182(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class240.method3900(var18);
            class205 var24 = class205.method3219(var23);
            if (var24.field2174 != -1) {
                class514 var25 = Statics.field335[var24.field2174];
                if (var25 != null) {
                    int var26 = (var24.field2160 * 4 - var25.field5108) / 2;
                    int var27 = (var24.field2161 * 4 - var25.field5109) / 2;
                    var25.method8564(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field2161) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class240.method556(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field171.field5123;
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
        long var31 = Statics.field238.method4181(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class240.method3900(var31);
        class205 var34 = class205.method3219(var33);
        if (var34.field2174 == -1) {
            return;
        }
        class514 var35 = Statics.field335[var34.field2174];
        if (var35 != null) {
            int var36 = (var34.field2160 * 4 - var35.field5108) / 2;
            int var37 = (var34.field2161 * 4 - var35.field5109) / 2;
            var35.method8564(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field2161) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.jn(Lem;II)Z")
    public boolean method1146(class111 arg0, int arg1) {
        if (arg0.field1387 == 0) {
            Statics.field4535 = null;
        } else {
            if (Statics.field4535 == null) {
                Statics.field4535 = new class417(Statics.field3059, Statics.field3874);
            }
            Statics.field4535.method7085(arg0.field1392, arg1);
        }
        method3077();
        arg0.field1386 = null;
        return true;
    }

    @ObfuscatedName("client.jk(Lem;I)Z")
    public boolean method1524(class111 arg0) {
        if (Statics.field4535 != null) {
            Statics.field4535.method7101(arg0.field1392);
        }
        method3077();
        arg0.field1386 = null;
        return true;
    }

    @ObfuscatedName("client.jy(Lem;S)Z")
    public final boolean method1347(class111 arg0) {
        class427 var2 = arg0.method2639();
        class500 var3 = arg0.field1392;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1386 == null) {
                if (arg0.field1388) {
                    if (!var2.method7274(1)) {
                        return false;
                    }
                    var2.method7261(arg0.field1392.field5016, 0, 1);
                    arg0.field1389 = 0;
                    arg0.field1388 = false;
                }
                var3.field5017 = 0;
                if (var3.method8101()) {
                    if (!var2.method7274(1)) {
                        return false;
                    }
                    var2.method7261(arg0.field1392.field5016, 1, 1);
                    arg0.field1389 = 0;
                }
                arg0.field1388 = true;
                class297[] var4 = class297.method4946();
                int var5 = var3.method8078();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5017);
                }
                arg0.field1386 = var4[var5];
                arg0.field1387 = arg0.field1386.field3340;
            }
            if (arg0.field1387 == -1) {
                if (!var2.method7274(1)) {
                    return false;
                }
                arg0.method2639().method7261(var3.field5016, 0, 1);
                arg0.field1387 = var3.field5016[0] & 0xFF;
            }
            if (arg0.field1387 == -2) {
                if (!var2.method7274(2)) {
                    return false;
                }
                arg0.method2639().method7261(var3.field5016, 0, 2);
                var3.field5017 = 0;
                arg0.field1387 = var3.method8195();
            }
            if (!var2.method7274(arg0.field1387)) {
                return false;
            }
            var3.field5017 = 0;
            var2.method7261(var3.field5016, 0, arg0.field1387);
            arg0.field1389 = 0;
            field512.method6957();
            arg0.field1393 = arg0.field1394;
            arg0.field1394 = arg0.field1391;
            arg0.field1391 = arg0.field1386;
            if (class297.field3243 == arg0.field1386) {
                method2968(false, var3);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3275 == arg0.field1386) {
                method3476();
                byte var6 = var3.method8130();
                class146 var7 = new class146(var3);
                class154 var8;
                if (var6 >= 0) {
                    var8 = field593[var6];
                } else {
                    var8 = Statics.field4412;
                }
                var7.method2947(var8);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3306 == arg0.field1386) {
                int var9 = var3.method8129();
                if (var3.method8129() == 0) {
                    field794[var9] = new class366();
                    var3.field5017 += 18;
                } else {
                    var3.field5017--;
                    field794[var9] = new class366(var3, false);
                }
                field735 = field587;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3221 == arg0.field1386) {
                String var10 = var3.method8253();
                long var11 = (long) var3.method8195();
                long var13 = (long) var3.method8133();
                class352 var15 = (class352) class371.method4632(Statics.method3344(), var3.method8129());
                long var16 = (var11 << 32) + var13;
                boolean var18 = false;
                for (int var19 = 0; var19 < 100; var19++) {
                    if (field738[var19] == var16) {
                        var18 = true;
                        break;
                    }
                }
                if (Statics.field497.method1720(new class525(var10, Statics.field3059))) {
                    var18 = true;
                }
                if (!var18 && field627 == 0) {
                    field738[field778] = var16;
                    field778 = (field778 + 1) % 100;
                    String var20 = class396.method6779(class385.method5130(class333.method211(var3)));
                    byte var21;
                    if (var15.field4199) {
                        var21 = 7;
                    } else {
                        var21 = 3;
                    }
                    if (var15.field4215 == -1) {
                        class110.method1047(var21, var10, var20);
                    } else {
                        class110.method1047(var21, class101.method2497(var15.field4215) + var10, var20);
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3239 == arg0.field1386) {
                int var22 = var3.method8250();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = var3.method8134();
                int var24 = var3.method8183();
                int var25 = var3.method8195();
                if (var25 == 65535) {
                    var25 = -1;
                }
                for (int var26 = var25; var26 <= var22; var26++) {
                    long var27 = ((long) var24 << 32) + (long) var26;
                    class461 var29 = field537.method7872(var27);
                    if (var29 != null) {
                        var29.method7560();
                    }
                    field537.method7878(new class460(var23), var27);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3293 == arg0.field1386) {
                method3862(class295.field3204);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3241 == arg0.field1386) {
                for (int var30 = 0; var30 < class320.field3514.length; var30++) {
                    if (class320.field3514[var30] != class320.field3513[var30]) {
                        class320.field3514[var30] = class320.field3513[var30];
                        method6769(var30);
                        field654[++field700 - 1 & 0x1F] = var30;
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3249 == arg0.field1386) {
                method3862(class295.field3207);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3288 == arg0.field1386) {
                field731 = var3.method8129();
                field558 = var3.method8129();
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3234 == arg0.field1386) {
                field751 = true;
                field692 = false;
                field726 = true;
                int var31 = var3.method8268();
                int var32 = var3.method8268();
                int var33 = method5413(Statics.field3497 + var32 & 0x7EB);
                int var34 = Statics.field3093 + var31;
                int var35 = var3.method8195();
                int var36 = var3.method8129();
                field770 = new class467(Statics.field3497, var33, var35, var36);
                field769 = new class467(Statics.field3093, var34, var35, var36);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3244 == arg0.field1386) {
                int var37 = var3.method8129();
                method4690(var37);
                arg0.field1386 = null;
                return false;
            }
            if (class297.field3311 == arg0.field1386) {
                method3476();
                byte var38 = var3.method8130();
                if (arg0.field1387 == 1) {
                    if (var38 >= 0) {
                        field593[var38] = null;
                    } else {
                        Statics.field4412 = null;
                    }
                    arg0.field1386 = null;
                    return true;
                }
                if (var38 >= 0) {
                    field593[var38] = new class154(var3);
                } else {
                    Statics.field4412 = new class154(var3);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3317 == arg0.field1386) {
                method7591();
                field681 = var3.method8268();
                field712 = field587;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3322 == arg0.field1386) {
                int var39 = var3.method8134();
                int var40 = var3.method8195();
                if (var39 < -70000) {
                    var40 += 32768;
                }
                class330 var41;
                if (var39 >= 0) {
                    var41 = class330.method1746(var39);
                } else {
                    var41 = null;
                }
                if (var41 != null) {
                    for (int var42 = 0; var42 < var41.field3734.length; var42++) {
                        var41.field3734[var42] = 0;
                        var41.field3656[var42] = 0;
                    }
                }
                class85.method5133(var40);
                int var43 = var3.method8195();
                for (int var44 = 0; var44 < var43; var44++) {
                    int var45 = var3.method8163();
                    if (var45 == 255) {
                        var45 = var3.method8134();
                    }
                    int var46 = var3.method8172();
                    if (var41 != null && var44 < var41.field3734.length) {
                        var41.field3734[var44] = var46;
                        var41.field3656[var44] = var45;
                    }
                    class85.method1968(var40, var44, var46 - 1, var45);
                }
                if (var41 != null) {
                    method2632(var41);
                }
                method7591();
                field701[++field702 - 1 & 0x1F] = var40 & 0x7FFF;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3251 == arg0.field1386) {
                int var47 = var3.method8170();
                int var48 = var3.method8170();
                int var49 = var3.method8163();
                if (var47 == 65535) {
                    var47 = -1;
                }
                class100 var50 = field563[var48];
                if (var50 != null) {
                    if (var50.field1217 == var47 && var47 != -1) {
                        int var51 = class208.method4648(var47).field2300;
                        if (var51 == 1) {
                            var50.field1198 = 0;
                            var50.field1177 = 0;
                            var50.field1208 = var49;
                            var50.field1201 = 0;
                        } else if (var51 == 2) {
                            var50.field1201 = 0;
                        }
                    } else if (var47 == -1 || var50.field1217 == -1 || class208.method4648(var47).field2279 >= class208.method4648(var50.field1217).field2279) {
                        var50.field1217 = var47;
                        var50.field1198 = 0;
                        var50.field1177 = 0;
                        var50.field1208 = var49;
                        var50.field1201 = 0;
                        var50.field1227 = var50.field1222;
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3265 == arg0.field1386) {
                boolean var52 = var3.method8129() == 1;
                if (var52) {
                    Statics.field2113 = class301.method4630() - var3.method8135();
                    Statics.field4323 = new class359(var3, true);
                } else {
                    Statics.field4323 = null;
                }
                field713 = field587;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3284 == arg0.field1386) {
                int var53 = var3.method8250();
                int var54 = var3.method8184();
                class330 var55 = class330.method1746(var54);
                if (var55.field3648 != 2 || var55.field3604 != var53) {
                    var55.field3648 = 2;
                    var55.field3604 = var53;
                    method2632(var55);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3277 == arg0.field1386) {
                method6014(var3.method8253());
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3227 == arg0.field1386) {
                boolean var56 = var3.method8137();
                if (!var56) {
                    Statics.field153 = null;
                } else if (Statics.field153 == null) {
                    Statics.field153 = new class368();
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3320 == arg0.field1386) {
                int var57 = var3.method8250();
                if (var57 == 65535) {
                    var57 = -1;
                }
                method5363(var57);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3237 == arg0.field1386) {
                int var58 = var3.method8195();
                if (var58 == 65535) {
                    var58 = -1;
                }
                int var59 = var3.method8133();
                method2282(var58, var59);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3335 == arg0.field1386) {
                field525 = var3.method8129();
                if (field525 == 1) {
                    field526 = var3.method8195();
                }
                if (field525 >= 2 && field525 <= 6) {
                    if (field525 == 2) {
                        field531 = 64;
                        field532 = 64;
                    }
                    if (field525 == 3) {
                        field531 = 0;
                        field532 = 64;
                    }
                    if (field525 == 4) {
                        field531 = 128;
                        field532 = 64;
                    }
                    if (field525 == 5) {
                        field531 = 64;
                        field532 = 0;
                    }
                    if (field525 == 6) {
                        field531 = 64;
                        field532 = 128;
                    }
                    field525 = 2;
                    field528 = var3.method8195();
                    field698 = var3.method8195();
                    field530 = var3.method8129();
                }
                if (field525 == 10) {
                    field798 = var3.method8195();
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3238 == arg0.field1386) {
                class37.method2243(var3, arg0.field1387);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3272 == arg0.field1386) {
                int var60 = var3.method8129();
                int var61 = var60 >> 2;
                int var62 = var60 & 0x3;
                int var63 = field571[var61];
                int var64 = var3.method8170();
                int var65 = var3.method8326();
                int var66 = var65 >> 16;
                int var67 = var65 >> 8 & 0xFF;
                int var68 = (var65 >> 4 & 0x7) + var66;
                int var69 = (var65 & 0x7) + var67;
                if (var68 >= 0 && var69 >= 0 && var68 < 103 && var69 < 103) {
                    if (var63 == 0) {
                        class247 var70 = Statics.field238.method4174(Statics.field1882, var68, var69);
                        if (var70 != null) {
                            int var71 = class240.method3900(var70.field2821);
                            if (var61 == 2) {
                                var70.field2819 = new class80(var71, 2, var62 + 4, Statics.field1882, var68, var69, var64, false, var70.field2819);
                                var70.field2820 = new class80(var71, 2, var62 + 1 & 0x3, Statics.field1882, var68, var69, var64, false, var70.field2820);
                            } else {
                                var70.field2819 = new class80(var71, var61, var62, Statics.field1882, var68, var69, var64, false, var70.field2819);
                            }
                        }
                    } else if (var63 == 1) {
                        class249 var72 = Statics.field238.method4175(Statics.field1882, var68, var69);
                        if (var72 != null) {
                            int var73 = class240.method3900(var72.field2823);
                            if (var61 == 4 || var61 == 5) {
                                var72.field2830 = new class80(var73, 4, var62, Statics.field1882, var68, var69, var64, false, var72.field2830);
                            } else if (var61 == 6) {
                                var72.field2830 = new class80(var73, 4, var62 + 4, Statics.field1882, var68, var69, var64, false, var72.field2830);
                            } else if (var61 == 7) {
                                var72.field2830 = new class80(var73, 4, (var62 + 2 & 0x3) + 4, Statics.field1882, var68, var69, var64, false, var72.field2830);
                            } else if (var61 == 8) {
                                var72.field2830 = new class80(var73, 4, var62 + 4, Statics.field1882, var68, var69, var64, false, var72.field2830);
                                var72.field2831 = new class80(var73, 4, (var62 + 2 & 0x3) + 4, Statics.field1882, var68, var69, var64, false, var72.field2831);
                            }
                        }
                    } else if (var63 == 2) {
                        class250 var74 = Statics.field238.method4176(Statics.field1882, var68, var69);
                        if (var61 == 11) {
                            var61 = 10;
                        }
                        if (var74 != null) {
                            var74.field2840 = new class80(class240.method3900(var74.field2841), var61, var62, Statics.field1882, var68, var69, var64, false, var74.field2840);
                        }
                    } else if (var63 == 3) {
                        class222 var75 = Statics.field238.method4177(Statics.field1882, var68, var69);
                        if (var75 != null) {
                            var75.field2464 = new class80(class240.method3900(var75.field2465), 22, var62, Statics.field1882, var68, var69, var64, false, var75.field2464);
                        }
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3259 == arg0.field1386) {
                int var76 = var3.method8138();
                int var77 = var3.method8195();
                if (var77 == 65535) {
                    var77 = -1;
                }
                int var78 = var3.method8138();
                class330 var79 = class330.method1746(var76);
                if (var79.field3662) {
                    var79.field3736 = var77;
                    var79.field3737 = var78;
                    class206 var81 = class206.method5155(var77);
                    var79.field3655 = var81.field2214;
                    var79.field3645 = var81.field2221;
                    var79.field3657 = var81.field2216;
                    var79.field3653 = var81.field2217;
                    var79.field3654 = var81.field2226;
                    var79.field3658 = var81.field2248;
                    if (var81.field2213 == 1) {
                        var79.field3664 = 1;
                    } else {
                        var79.field3664 = 2;
                    }
                    if (var79.field3668 > 0) {
                        var79.field3658 = var79.field3658 * 32 / var79.field3668;
                    } else if (var79.field3614 > 0) {
                        var79.field3658 = var79.field3658 * 32 / var79.field3614;
                    }
                    method2632(var79);
                } else if (var77 == -1) {
                    var79.field3648 = 0;
                    arg0.field1386 = null;
                    return true;
                } else {
                    class206 var80 = class206.method5155(var77);
                    var79.field3648 = 4;
                    var79.field3604 = var77;
                    var79.field3655 = var80.field2214;
                    var79.field3645 = var80.field2221;
                    var79.field3658 = var80.field2248 * 100 / var78;
                    method2632(var79);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3229 == arg0.field1386) {
                int var82 = arg0.field1387 + var3.field5017;
                int var83 = var3.method8195();
                if (var83 == 65535) {
                    var83 = -1;
                }
                int var84 = var3.method8195();
                if (field799 != var83) {
                    field799 = var83;
                    this.method1582(false);
                    method2911(field799);
                    class71.method2967(field799);
                    for (int var85 = 0; var85 < 100; var85++) {
                        field724[var85] = true;
                    }
                }
                while (var84-- > 0) {
                    int var86 = var3.method8134();
                    int var87 = var3.method8195();
                    int var88 = var3.method8129();
                    class87 var89 = (class87) field675.method7872((long) var86);
                    if (var89 != null && var89.field1057 != var87) {
                        method815(var89, true);
                        var89 = null;
                    }
                    if (var89 == null) {
                        var89 = method3265(var86, var87, var88);
                    }
                    var89.field1058 = true;
                }
                for (class87 var90 = (class87) field675.method7871(); var90 != null; var90 = (class87) field675.method7879()) {
                    if (var90.field1058) {
                        var90.field1058 = false;
                    } else {
                        method815(var90, true);
                    }
                }
                field537 = new class477(512);
                while (var3.field5017 < var82) {
                    int var91 = var3.method8134();
                    int var92 = var3.method8195();
                    int var93 = var3.method8195();
                    int var94 = var3.method8134();
                    for (int var95 = var92; var95 <= var93; var95++) {
                        long var96 = ((long) var91 << 32) + (long) var95;
                        field537.method7878(new class460(var94), var96);
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3292 == arg0.field1386) {
                String var98 = var3.method8253();
                int var99 = var3.method8184();
                class330 var100 = class330.method1746(var99);
                if (!var98.equals(var100.field3666)) {
                    var100.field3666 = var98;
                    method2632(var100);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3336 == arg0.field1386) {
                byte var101 = var3.method8130();
                long var102 = (long) var3.method8195();
                long var104 = (long) var3.method8133();
                long var106 = (var102 << 32) + var104;
                boolean var108 = false;
                class163 var109 = var101 >= 0 ? field720[var101] : Statics.field2051;
                if (var109 == null) {
                    var108 = true;
                } else {
                    for (int var110 = 0; var110 < 100; var110++) {
                        if (field738[var110] == var106) {
                            var108 = true;
                            break;
                        }
                    }
                }
                if (!var108) {
                    field738[field778] = var106;
                    field778 = (field778 + 1) % 100;
                    String var111 = class333.method211(var3);
                    int var112 = var101 >= 0 ? 43 : 46;
                    class110.method1115(var112, "", var111, var109.field1762);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3267 == arg0.field1386) {
                int var113 = var3.method8195();
                if (var113 == 65535) {
                    var113 = -1;
                }
                field799 = var113;
                this.method1582(false);
                method2911(var113);
                class71.method2967(field799);
                for (int var114 = 0; var114 < 100; var114++) {
                    field724[var114] = true;
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3261 == arg0.field1386) {
                method3862(class295.field3202);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3325 == arg0.field1386) {
                field753 = var3.method8129();
                if (field753 == 255) {
                    field753 = 0;
                }
                field754 = var3.method8129();
                if (field754 == 255) {
                    field754 = 0;
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3276 == arg0.field1386) {
                int var115 = var3.method8134();
                boolean var116 = var3.method8162() == 1;
                class330 var117 = class330.method1746(var115);
                if (var117.field3608 != var116) {
                    var117.field3608 = var116;
                    method2632(var117);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3324 == arg0.field1386) {
                int var118 = var3.method8134();
                int var119 = var3.method8134();
                int var120 = class35.method2871();
                class296 var121 = class296.method3619(class294.field3124, field568.field1380);
                var121.field3211.method8160(field197);
                var121.field3211.method8160(var120);
                var121.field3211.method8181(var118);
                var121.field3211.method8139(var119);
                field568.method2642(var121);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3339 == arg0.field1386) {
                Statics.field497.field828.method7073(var3, arg0.field1387);
                method2195();
                field708 = field587;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3283 == arg0.field1386) {
                method1777();
                arg0.field1386 = null;
                return false;
            }
            if (class297.field3295 == arg0.field1386) {
                int var122 = var3.method8170();
                int var123 = var3.method8183();
                class330 var124 = class330.method1746(var123);
                if (var124.field3648 != 1 || var124.field3604 != var122) {
                    var124.field3648 = 1;
                    var124.field3604 = var122;
                    method2632(var124);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3290 == arg0.field1386) {
                Statics.field497.method1734(var3, arg0.field1387);
                field708 = field587;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3230 == arg0.field1386) {
                int var125 = var3.method8172();
                int var126 = var3.method8161();
                short var127 = (short) var3.method8173();
                int var128 = var3.method8134();
                class100 var129 = field563[var125];
                if (var129 != null) {
                    var129.method2444(var126, var128, var127);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3314 == arg0.field1386) {
                method3862(class295.field3201);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3318 == arg0.field1386) {
                Statics.field2951 = var3.method8163();
                Statics.field4232 = var3.method8162();
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3333 == arg0.field1386) {
                method2968(true, var3);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3225 == arg0.field1386) {
                field524 = var3.method8250() * 30;
                field712 = field587;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3312 == arg0.field1386) {
                int var130 = var3.method8195();
                int var131 = var3.method8129();
                int var132 = var3.method8195();
                method5385(var130, var131, var132);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3328 == arg0.field1386) {
                class107.method1969(var3, arg0.field1387);
                method2241();
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3338 == arg0.field1386) {
                int var133 = var3.method8250();
                int var134 = var3.method8161();
                if (var133 == 65535) {
                    var133 = -1;
                }
                method5146(Statics.field971, var133, var134);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3301 == arg0.field1386) {
                Statics.field4232 = var3.method8163();
                Statics.field2951 = var3.method8161();
                while (var3.field5017 < arg0.field1387) {
                    int var135 = var3.method8129();
                    class295 var136 = Statics.method2884()[var135];
                    method3862(var136);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3285 == arg0.field1386) {
                int var137 = var3.method8134();
                if (field602 != var137) {
                    field602 = var137;
                    method5764();
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3262 == arg0.field1386) {
                for (int var138 = 0; var138 < field613.length; var138++) {
                    if (field613[var138] != null) {
                        field613[var138].field1217 = -1;
                    }
                }
                for (int var139 = 0; var139 < field563.length; var139++) {
                    if (field563[var139] != null) {
                        field563[var139].field1217 = -1;
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3287 == arg0.field1386) {
                byte[] var140 = new byte[arg0.field1387];
                var3.method8096(var140, 0, var140.length);
                class501 var141 = new class501(var140);
                String var142 = var141.method8253();
                class32.method400(var142, true, false);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3302 == arg0.field1386) {
                Statics.field497.method1715();
                field708 = field587;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3264 == arg0.field1386) {
                method3862(class295.field3209);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3228 == arg0.field1386) {
                return this.method1524(arg0);
            }
            if (class297.field3291 == arg0.field1386) {
                int var143 = var3.method8183();
                class330 var144 = class330.method1746(var143);
                for (int var145 = 0; var145 < var144.field3734.length; var145++) {
                    var144.field3734[var145] = -1;
                    var144.field3734[var145] = 0;
                }
                method2632(var144);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3326 == arg0.field1386) {
                method3862(class295.field3203);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3313 == arg0.field1386) {
                return this.method1146(arg0, 2);
            }
            if (class297.field3329 == arg0.field1386) {
                field751 = true;
                field692 = false;
                field765 = true;
                Statics.field1470 = var3.method8129();
                Statics.field2402 = var3.method8129();
                int var146 = var3.method8195();
                int var147 = var3.method8195();
                field582 = var3.method8137();
                int var148 = var3.method8129();
                int var149 = Statics.field1470 * 128 + 64;
                int var150 = Statics.field2402 * 128 + 64;
                boolean var151 = false;
                boolean var152 = false;
                int var153;
                int var154;
                if (field582) {
                    var153 = Statics.field1680;
                    var154 = method4353(var149, var150, Statics.field1882) - var146;
                } else {
                    var153 = method4353(Statics.field2317, Statics.field4481, Statics.field1882) - Statics.field1680;
                    var154 = var146;
                }
                field541 = new class466(Statics.field2317, Statics.field4481, var153, var149, var150, var154, var147, var148);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3271 == arg0.field1386) {
                int var155 = var3.method8184();
                int var156 = var3.method8183();
                class87 var157 = (class87) field675.method7872((long) var155);
                class87 var158 = (class87) field675.method7872((long) var156);
                if (var158 != null) {
                    method815(var158, var157 == null || var157.field1057 != var158.field1057);
                }
                if (var157 != null) {
                    var157.method7560();
                    field675.method7878(var157, (long) var156);
                }
                class330 var159 = class330.method1746(var155);
                if (var159 != null) {
                    method2632(var159);
                }
                class330 var160 = class330.method1746(var156);
                if (var160 != null) {
                    method2632(var160);
                    method2025(Statics.field84[var160.field3673 >>> 16], var160, true);
                }
                if (field799 != -1) {
                    method7549(field799, 1);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3294 == arg0.field1386) {
                int var161 = var3.method8184();
                int var162 = var3.method8138();
                class330 var163 = class330.method1746(var161);
                class330.method3692(var163, var162);
                method2632(var163);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3250 == arg0.field1386) {
                Statics.field1496 = null;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3232 == arg0.field1386) {
                field692 = false;
                field751 = false;
                field765 = false;
                field726 = false;
                Statics.field1234 = 0;
                Statics.field1606 = 0;
                Statics.field2143 = 0;
                field582 = false;
                Statics.field4637 = 0;
                Statics.field2323 = 0;
                Statics.field1256 = 0;
                Statics.field1411 = 0;
                Statics.field1470 = 0;
                Statics.field2402 = 0;
                Statics.field1045 = 0;
                field541 = null;
                field770 = null;
                field769 = null;
                for (int var164 = 0; var164 < 5; var164++) {
                    field772[var164] = false;
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3304 == arg0.field1386) {
                field751 = true;
                field692 = false;
                field726 = false;
                Statics.field1234 = var3.method8129();
                Statics.field1606 = var3.method8129();
                Statics.field2143 = var3.method8195();
                Statics.field4637 = var3.method8129();
                Statics.field2323 = var3.method8129();
                if (Statics.field2323 >= 100) {
                    int var165 = Statics.field1234 * 128 + 64;
                    int var166 = Statics.field1606 * 128 + 64;
                    int var167 = method4353(var165, var166, Statics.field1882) - Statics.field2143;
                    int var168 = var165 - Statics.field2317;
                    int var169 = var167 - Statics.field1680;
                    int var170 = var166 - Statics.field4481;
                    int var171 = (int) Math.sqrt((double) (var168 * var168 + var170 * var170));
                    Statics.field3497 = (int) (Math.atan2((double) var169, (double) var171) * 325.9490051269531D) & 0x7FF;
                    Statics.field3093 = (int) (Math.atan2((double) var168, (double) var170) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field3497 < 128) {
                        Statics.field3497 = 128;
                    }
                    if (Statics.field3497 > 383) {
                        Statics.field3497 = 383;
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3235 == arg0.field1386) {
                class68 var172 = new class68();
                var172.field817 = var3.method8253();
                var172.field818 = var3.method8195();
                int var173 = var3.method8134();
                var172.field819 = var173;
                method2711(45);
                var2.method7263();
                Object var174 = null;
                class76.method177(var172);
                arg0.field1386 = null;
                return false;
            }
            if (class297.field3334 == arg0.field1386) {
                Statics.field4232 = var3.method8129();
                Statics.field2951 = var3.method8129();
                for (int var175 = Statics.field2951; var175 < Statics.field2951 + 8; var175++) {
                    for (int var176 = Statics.field4232; var176 < Statics.field4232 + 8; var176++) {
                        if (field642[Statics.field1882][var175][var176] != null) {
                            field642[Statics.field1882][var175][var176] = null;
                            method2819(var175, var176);
                        }
                    }
                }
                for (class94 var177 = (class94) field643.method6309(); var177 != null; var177 = (class94) field643.method6311()) {
                    if (var177.field1136 >= Statics.field2951 && var177.field1136 < Statics.field2951 + 8 && var177.field1146 >= Statics.field4232 && var177.field1146 < Statics.field4232 + 8 && Statics.field1882 == var177.field1139) {
                        var177.field1148 = 0;
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3298 == arg0.field1386) {
                field751 = true;
                field692 = false;
                field726 = true;
                int var178 = method6186(var3.method8268() & 0x7EB);
                int var179 = method5413(var3.method8268() & 0x7EB);
                int var180 = var3.method8195();
                int var181 = var3.method8129();
                field770 = new class467(Statics.field3497, var179, var180, var181);
                field769 = new class467(Statics.field3093, var178, var180, var181);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3247 == arg0.field1386) {
                byte var182 = var3.method8191();
                int var183 = var3.method8172();
                class320.field3513[var183] = var182;
                if (class320.field3514[var183] != var182) {
                    class320.field3514[var183] = var182;
                }
                method6769(var183);
                field654[++field700 - 1 & 0x1F] = var183;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3296 == arg0.field1386) {
                int var184 = var3.method8163();
                String var185 = var3.method8253();
                int var186 = var3.method8129();
                if (var186 >= 1 && var186 <= 8) {
                    if (var185.equalsIgnoreCase(class350.field3887)) {
                        var185 = null;
                    }
                    field721[var186 - 1] = var185;
                    field639[var186 - 1] = var184 == 0;
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3280 == arg0.field1386) {
                int var187 = var3.method8134();
                int var188 = var3.method8195();
                if (var187 < -70000) {
                    var188 += 32768;
                }
                class330 var189;
                if (var187 >= 0) {
                    var189 = class330.method1746(var187);
                } else {
                    var189 = null;
                }
                while (var3.field5017 < arg0.field1387) {
                    int var190 = var3.method8144();
                    int var191 = var3.method8195();
                    int var192 = 0;
                    if (var191 != 0) {
                        var192 = var3.method8129();
                        if (var192 == 255) {
                            var192 = var3.method8134();
                        }
                    }
                    if (var189 != null && var190 >= 0 && var190 < var189.field3734.length) {
                        var189.field3734[var190] = var191;
                        var189.field3656[var190] = var192;
                    }
                    class85.method1968(var188, var190, var191 - 1, var192);
                }
                if (var189 != null) {
                    method2632(var189);
                }
                method7591();
                field701[++field702 - 1 & 0x1F] = var188 & 0x7FFF;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3316 == arg0.field1386) {
                int var193 = var3.method8129();
                int var194 = var3.method8129();
                int var195 = var3.method8129();
                int var196 = var3.method8129();
                field772[var193] = true;
                field773[var193] = var194;
                field696[var193] = var195;
                field775[var193] = var196;
                field764[var193] = 0;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3281 == arg0.field1386) {
                int var197 = var3.method8173();
                int var198 = var3.method8134();
                class330 var199 = class330.method1746(var198);
                if (var199.field3651 != var197 || var197 == -1) {
                    var199.field3651 = var197;
                    var199.field3738 = 0;
                    var199.field3739 = 0;
                    method2632(var199);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3233 == arg0.field1386) {
                int var200 = var3.method8195();
                int var201 = var3.method8172();
                int var202 = var3.method8326();
                int var203 = var202 >> 16;
                int var204 = var202 >> 8 & 0xFF;
                int var205 = (var202 >> 4 & 0x7) + var203;
                int var206 = (var202 & 0x7) + var204;
                int var207 = var3.method8163();
                if (var205 >= 0 && var206 >= 0 && var205 < 104 && var206 < 104) {
                    int var208 = var205 * 128 + 64;
                    int var209 = var206 * 128 + 64;
                    class72 var210 = new class72(var200, Statics.field1882, var208, var209, method4353(var208, var209, Statics.field1882) - var207, var201, field506);
                    field685.method6303(var210);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3300 == arg0.field1386) {
                field751 = true;
                field692 = false;
                field726 = true;
                Statics.field1234 = var3.method8129();
                Statics.field1606 = var3.method8129();
                Statics.field2143 = var3.method8195();
                int var211 = var3.method8195();
                int var212 = var3.method8129();
                int var213 = Statics.field1234 * 128 + 64;
                int var214 = Statics.field1606 * 128 + 64;
                int var215 = method4353(var213, var214, Statics.field1882) - Statics.field2143;
                int var216 = var213 - Statics.field2317;
                int var217 = var215 - Statics.field1680;
                int var218 = var214 - Statics.field4481;
                double var219 = Math.sqrt((double) (var216 * var216 + var218 * var218));
                int var221 = method5413((int) (Math.atan2((double) var217, var219) * 325.9490051269531D) & 0x7FF);
                int var222 = method6186((int) (Math.atan2((double) var216, (double) var218) * -325.9490051269531D) & 0x7FF);
                field770 = new class467(Statics.field3497, var221, var211, var212);
                field769 = new class467(Statics.field3093, var222, var211, var212);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3245 == arg0.field1386) {
                int var223 = var3.method8195();
                int var224 = var3.method8170();
                int var225 = var3.method8138();
                class330 var226 = class330.method1746(var225);
                var226.field3660 = (var224 << 16) + var223;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3321 == arg0.field1386) {
                int var227 = var3.method8134();
                int var228 = var3.method8250();
                class320.field3513[var228] = var227;
                if (class320.field3514[var228] != var227) {
                    class320.field3514[var228] = var227;
                }
                method6769(var228);
                field654[++field700 - 1 & 0x1F] = var228;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3299 == arg0.field1386) {
                method3862(class295.field3208);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3231 == arg0.field1386) {
                field751 = true;
                field692 = false;
                field765 = true;
                Statics.field1470 = var3.method8129();
                Statics.field2402 = var3.method8129();
                int var229 = var3.method8195();
                int var230 = var3.method8129() * 128 + 64;
                int var231 = var3.method8129() * 128 + 64;
                int var232 = var3.method8195();
                field582 = var3.method8137();
                int var233 = var3.method8129();
                int var234 = Statics.field1470 * 128 + 64;
                int var235 = Statics.field2402 * 128 + 64;
                boolean var236 = false;
                boolean var237 = false;
                int var238;
                int var239;
                if (field582) {
                    var238 = Statics.field1680;
                    var239 = method4353(var234, var235, Statics.field1882) - var229;
                } else {
                    var238 = method4353(Statics.field2317, Statics.field4481, Statics.field1882) - Statics.field1680;
                    var239 = var229;
                }
                field541 = new class465(Statics.field2317, Statics.field4481, var238, var234, var235, var239, var230, var231, var232, var233);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3254 == arg0.field1386) {
                method7591();
                int var240 = var3.method8161();
                int var241 = var3.method8183();
                int var242 = var3.method8162();
                field719[var240] = var241;
                field646[var240] = var242;
                field647[var240] = 1;
                for (int var243 = 0; var243 < 98; var243++) {
                    if (var241 >= class340.field3811[var243]) {
                        field647[var240] = var243 + 2;
                    }
                }
                field673[++field704 - 1 & 0x1F] = var240;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3242 == arg0.field1386) {
                int var244 = var3.method8129();
                method4955(var244);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3263 == arg0.field1386) {
                int var245 = var3.method8129();
                int var246 = var3.method8250();
                int var247 = var3.method8172();
                int var248 = var3.method8163();
                byte var249 = var3.method8199();
                int var250 = var3.method8177();
                int var251 = var250 >> 16;
                int var252 = var250 >> 8 & 0xFF;
                int var253 = (var250 >> 4 & 0x7) + var251;
                int var254 = (var250 & 0x7) + var252;
                byte var255 = var3.method8191();
                int var256 = var3.method8247();
                int var257 = var3.method8172();
                int var258 = var3.method8163() * 4;
                int var259 = var3.method8161() * 4;
                int var260 = var249 + var253;
                int var261 = var254 + var255;
                if (var253 >= 0 && var254 >= 0 && var253 < 104 && var254 < 104 && var260 >= 0 && var261 >= 0 && var260 < 104 && var261 < 104 && var246 != 65535) {
                    int var262 = var253 * 128 + 64;
                    int var263 = var254 * 128 + 64;
                    int var264 = var260 * 128 + 64;
                    int var265 = var261 * 128 + 64;
                    class77 var266 = new class77(var246, Statics.field1882, var262, var263, method4353(var262, var263, Statics.field1882) - var258, field506 + var247, field506 + var257, var248, var245, var256, var259);
                    var266.method2023(var264, var265, method4353(var264, var265, Statics.field1882) - var259, field506 + var247);
                    field644.method6303(var266);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3278 == arg0.field1386) {
                int var267 = var3.method8134();
                class87 var268 = (class87) field675.method7872((long) var267);
                if (var268 != null) {
                    method815(var268, true);
                }
                if (field679 != null) {
                    method2632(field679);
                    field679 = null;
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3332 == arg0.field1386) {
                int var269 = var3.method8183();
                int var270 = var3.method8172();
                class330 var271 = class330.method1746(var269);
                if (var271.field3648 != 6 || var271.field3604 != var270) {
                    var271.field3648 = 6;
                    var271.field3604 = var270;
                    method2632(var271);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3270 == arg0.field1386) {
                int var272 = var3.method8172();
                int var273 = var3.method8172();
                int var274 = var3.method8183();
                int var275 = var3.method8170();
                class330 var276 = class330.method1746(var274);
                if (var276.field3655 != var272 || var276.field3645 != var273 || var276.field3658 != var275) {
                    var276.field3655 = var272;
                    var276.field3645 = var273;
                    var276.field3658 = var275;
                    method2632(var276);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3260 == arg0.field1386) {
                var3.field5017 += 28;
                if (var3.method8157()) {
                    method1052(var3, var3.field5017 - 28);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3286 == arg0.field1386) {
                Statics.field1496 = new class443(Statics.field1276);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3226 == arg0.field1386) {
                method288(false, arg0.field1392);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3246 == arg0.field1386) {
                if (Statics.field1496 == null) {
                    Statics.field1496 = new class443(Statics.field1276);
                }
                class510 var277 = Statics.field1276.method7493(var3);
                Statics.field1496.field4709.method7886(var277.field5085, var277.field5084);
                field705[++field706 - 1 & 0x1F] = var277.field5085;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3257 == arg0.field1386) {
                field691 = field587;
                byte var278 = var3.method8130();
                if (arg0.field1387 == 1) {
                    if (var278 >= 0) {
                        field720[var278] = null;
                    } else {
                        Statics.field2051 = null;
                    }
                    arg0.field1386 = null;
                    return true;
                }
                if (var278 >= 0) {
                    field720[var278] = new class163(var3);
                } else {
                    Statics.field2051 = new class163(var3);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3258 == arg0.field1386) {
                int var279 = var3.method8163();
                int var280 = var3.method8134();
                int var281 = var3.method8250();
                class100 var282 = field563[var281];
                int var283 = var3.method8172();
                if (var282 != null) {
                    var282.method2249(var279, var283, var280 >> 16, var280 & 0xFFFF);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3323 == arg0.field1386) {
                int var284 = var3.method8170();
                class85.method3511(var284);
                field701[++field702 - 1 & 0x1F] = var284 & 0x7FFF;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3337 == arg0.field1386) {
                for (int var285 = 0; var285 < Statics.field1904; var285++) {
                    class186 var286 = class186.method2498(var285);
                    if (var286 != null) {
                        class320.field3513[var285] = 0;
                        class320.field3514[var285] = 0;
                    }
                }
                method7591();
                field700 += 32;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3330 == arg0.field1386) {
                int var287 = var3.method8184();
                class330 var288 = class330.method1746(var287);
                var288.field3648 = 3;
                var288.field3604 = Statics.field971.field1100.method5443();
                method2632(var288);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3331 == arg0.field1386) {
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3327 == arg0.field1386) {
                method3862(class295.field3205);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3273 == arg0.field1386) {
                String var289 = var3.method8253();
                Object[] var290 = new Object[var289.length() + 1];
                for (int var291 = var289.length() - 1; var291 >= 0; var291--) {
                    if (var289.charAt(var291) == 's') {
                        var290[var291 + 1] = var3.method8253();
                    } else {
                        var290[var291 + 1] = Integer.valueOf(var3.method8134());
                    }
                }
                var290[0] = Integer.valueOf(var3.method8134());
                class88 var292 = new class88();
                var292.field1067 = var290;
                class71.method3233(var292);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3268 == arg0.field1386) {
                int var293 = var3.method8129();
                int var294 = var3.method8183();
                int var295 = var3.method8250();
                class92 var296;
                if (field630 == var295) {
                    var296 = Statics.field971;
                } else {
                    var296 = field613[var295];
                }
                int var297 = var3.method8172();
                if (var296 != null) {
                    var296.method2249(var293, var297, var294 >> 16, var294 & 0xFFFF);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3309 == arg0.field1386) {
                method3862(class295.field3200);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3224 == arg0.field1386) {
                int var298 = var3.method8195();
                int var299 = var3.method8184();
                int var300 = var298 >> 10 & 0x1F;
                int var301 = var298 >> 5 & 0x1F;
                int var302 = var298 & 0x1F;
                int var303 = (var302 << 3) + (var300 << 19) + (var301 << 11);
                class330 var304 = class330.method1746(var299);
                if (var304.field3630 != var303) {
                    var304.field3630 = var303;
                    method2632(var304);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3305 == arg0.field1386) {
                int var305 = var3.method8195();
                int var306 = var3.method8129();
                int var307 = var3.method8184();
                class87 var308 = (class87) field675.method7872((long) var307);
                if (var308 != null) {
                    method815(var308, var308.field1057 != var305);
                }
                method3265(var307, var305, var306);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3308 == arg0.field1386) {
                field751 = true;
                field692 = false;
                field765 = false;
                Statics.field1470 = var3.method8129();
                Statics.field2402 = var3.method8129();
                Statics.field1045 = var3.method8195();
                Statics.field1411 = var3.method8129();
                Statics.field1256 = var3.method8129();
                if (Statics.field1256 >= 100) {
                    Statics.field2317 = Statics.field1470 * 128 + 64;
                    Statics.field4481 = Statics.field2402 * 128 + 64;
                    Statics.field1680 = method4353(Statics.field2317, Statics.field4481, Statics.field1882) - Statics.field1045;
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3297 == arg0.field1386) {
                int var309 = var3.method8144();
                boolean var310 = var3.method8129() == 1;
                String var311 = "";
                boolean var312 = false;
                if (var310) {
                    var311 = var3.method8253();
                    if (Statics.field497.method1720(new class525(var311, Statics.field3059))) {
                        var312 = true;
                    }
                }
                String var313 = var3.method8253();
                if (!var312) {
                    class110.method1047(var309, var311, var313);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3282 == arg0.field1386) {
                field755 = var3.method8129();
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3269 == arg0.field1386) {
                method7591();
                field680 = var3.method8195();
                field712 = field587;
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3255 == arg0.field1386) {
                int var314 = var3.method8161();
                int var315 = var3.method8184();
                class330 var316 = class330.method1746(var315);
                class330.method5369(var316, Statics.field971.field1100.field3541, var314);
                method2632(var316);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3252 == arg0.field1386) {
                if (field799 != -1) {
                    method7549(field799, 0);
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3266 == arg0.field1386) {
                int var317 = var3.method8183();
                int var318 = var3.method8129();
                int var319 = var3.method8162();
                class330 var320 = class330.method1746(var317);
                class330.method3481(var320, var318, var319);
                method2632(var320);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3289 == arg0.field1386) {
                method288(true, arg0.field1392);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3315 == arg0.field1386) {
                int var321 = var3.method8183();
                int var322 = var3.method8195();
                class330 var323 = class330.method1746(var321);
                if (var323 != null && var323.field3728 == 0) {
                    if (var322 > var323.field3627 - var323.field3735) {
                        var322 = var323.field3627 - var323.field3735;
                    }
                    if (var322 < 0) {
                        var322 = 0;
                    }
                    if (var323.field3706 != var322) {
                        var323.field3706 = var322;
                        method2632(var323);
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3253 == arg0.field1386) {
                int var324 = var3.method8174();
                int var325 = var3.method8183();
                int var326 = var3.method8268();
                class330 var327 = class330.method1746(var325);
                if (var327.field3713 != var324 || var327.field3613 != var326 || var327.field3677 != 0 || var327.field3609 != 0) {
                    var327.field3713 = var324;
                    var327.field3613 = var326;
                    var327.field3677 = 0;
                    var327.field3609 = 0;
                    method2632(var327);
                    this.method1220(var327);
                    if (var327.field3728 == 0) {
                        method2025(Statics.field84[var325 >> 16], var327, false);
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3274 == arg0.field1386) {
                return this.method1146(arg0, 1);
            }
            if (class297.field3307 == arg0.field1386) {
                boolean var328 = var3.method8161() == 1;
                int var329 = var3.method8134();
                class330 var330 = class330.method1746(var329);
                class330.method1954(var330, Statics.field971.field1100, var328);
                method2632(var330);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3223 == arg0.field1386) {
                method3862(class295.field3206);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3222 == arg0.field1386) {
                String var331 = var3.method8253();
                String var332 = class396.method6779(class385.method5130(class333.method211(var3)));
                class110.method1047(6, var331, var332);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3248 == arg0.field1386) {
                String var333 = var3.method8253();
                long var334 = var3.method8135();
                long var336 = (long) var3.method8195();
                long var338 = (long) var3.method8133();
                class352 var340 = (class352) class371.method4632(Statics.method3344(), var3.method8129());
                long var341 = (var336 << 32) + var338;
                boolean var343 = false;
                for (int var344 = 0; var344 < 100; var344++) {
                    if (field738[var344] == var341) {
                        var343 = true;
                        break;
                    }
                }
                if (var340.field4217 && Statics.field497.method1720(new class525(var333, Statics.field3059))) {
                    var343 = true;
                }
                if (!var343 && field627 == 0) {
                    field738[field778] = var341;
                    field778 = (field778 + 1) % 100;
                    String var345 = class396.method6779(class385.method5130(class333.method211(var3)));
                    if (var340.field4215 == -1) {
                        class110.method1115(9, var333, var345, class387.method5371(var334));
                    } else {
                        class110.method1115(9, class101.method2497(var340.field4215) + var333, var345, class387.method5371(var334));
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3319 == arg0.field1386) {
                field691 = field587;
                byte var346 = var3.method8130();
                class160 var347 = new class160(var3);
                class163 var348;
                if (var346 >= 0) {
                    var348 = field720[var346];
                } else {
                    var348 = Statics.field2051;
                }
                var347.method3052(var348);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3240 == arg0.field1386) {
                method3862(class295.field3199);
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3303 == arg0.field1386 && field751) {
                field692 = true;
                field726 = false;
                field765 = false;
                for (int var349 = 0; var349 < 5; var349++) {
                    field772[var349] = false;
                }
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3279 == arg0.field1386) {
                Statics.field2066 = Statics.method6978(var3.method8129());
                arg0.field1386 = null;
                return true;
            }
            if (class297.field3310 == arg0.field1386) {
                byte var350 = var3.method8130();
                String var351 = var3.method8253();
                long var352 = (long) var3.method8195();
                long var354 = (long) var3.method8133();
                class352 var356 = (class352) class371.method4632(Statics.method3344(), var3.method8129());
                long var357 = (var352 << 32) + var354;
                boolean var359 = false;
                Object var360 = null;
                class163 var361 = var350 >= 0 ? field720[var350] : Statics.field2051;
                if (var361 == null) {
                    var359 = true;
                } else {
                    int var362 = 0;
                    while (true) {
                        if (var362 >= 100) {
                            if (var356.field4217 && Statics.field497.method1720(new class525(var351, Statics.field3059))) {
                                var359 = true;
                            }
                            break;
                        }
                        if (field738[var362] == var357) {
                            var359 = true;
                            break;
                        }
                        var362++;
                    }
                }
                if (!var359) {
                    field738[field778] = var357;
                    field778 = (field778 + 1) % 100;
                    String var363 = class396.method6779(class333.method211(var3));
                    int var364 = var350 >= 0 ? 41 : 44;
                    if (var356.field4215 == -1) {
                        class110.method1115(var364, var351, var363, var361.field1762);
                    } else {
                        class110.method1115(var364, class101.method2497(var356.field4215) + var351, var363, var361.field1762);
                    }
                }
                arg0.field1386 = null;
                return true;
            }
            class528.method4947("" + (arg0.field1386 == null ? -1 : arg0.field1386.field3256) + class101.field1294 + (arg0.field1394 == null ? -1 : arg0.field1394.field3256) + class101.field1294 + (arg0.field1393 == null ? -1 : arg0.field1393.field3256) + class101.field1294 + arg0.field1387, (Throwable) null);
            method1777();
        } catch (IOException var369) {
            method1945();
        } catch (Exception var370) {
            String var367 = "" + (arg0.field1386 == null ? -1 : arg0.field1386.field3256) + class101.field1294 + (arg0.field1394 == null ? -1 : arg0.field1394.field3256) + class101.field1294 + (arg0.field1393 == null ? -1 : arg0.field1393.field3256) + class101.field1294 + arg0.field1387 + class101.field1294 + (Statics.field2380 + Statics.field971.field1223[0]) + class101.field1294 + (Statics.field1302 + Statics.field971.field1193[0]) + class101.field1294;
            for (int var368 = 0; var368 < arg0.field1387 && var368 < 50; var368++) {
                var367 = var367 + var3.field5016[var368] + class101.field1294;
            }
            class528.method4947(var367, var370);
            method1777();
        }
        return true;
    }

    @ObfuscatedName("ik.jg(Llj;I)V")
    public static final void method3862(class295 arg0) {
        class500 var1 = field568.field1392;
        if (class295.field3208 == arg0) {
            int var2 = var1.method8162();
            int var3 = (var2 >> 4 & 0x7) + Statics.field2951;
            int var4 = (var2 & 0x7) + Statics.field4232;
            int var5 = var1.method8163();
            int var6 = var5 >> 4 & 0xF;
            int var7 = var5 & 0x7;
            int var8 = var1.method8170();
            int var9 = var1.method8161();
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                int var10 = var6 + 1;
                if (Statics.field971.field1223[0] >= var3 - var10 && Statics.field971.field1223[0] <= var3 + var10 && Statics.field971.field1193[0] >= var4 - var10 && Statics.field971.field1193[0] <= var4 + var10 && Statics.field48.method2332() != 0 && var7 > 0 && field684 < 50) {
                    field759[field684] = var8;
                    field686[field684] = var7;
                    field761[field684] = var9;
                    field703[field684] = null;
                    field522[field684] = (var3 << 16) + (var4 << 8) + var6;
                    field684++;
                }
            }
        }
        if (class295.field3202 == arg0) {
            int var11 = var1.method8172();
            byte var12 = var1.method8191();
            byte var13 = var1.method8130();
            byte var14 = var1.method8191();
            int var15 = var1.method8250();
            int var16 = var1.method8163();
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = field571[var17];
            int var20 = var1.method8170();
            byte var21 = var1.method8242();
            int var22 = var1.method8163();
            int var23 = (var22 >> 4 & 0x7) + Statics.field2951;
            int var24 = (var22 & 0x7) + Statics.field4232;
            int var25 = var1.method8195();
            class92 var26;
            if (field630 == var25) {
                var26 = Statics.field971;
            } else {
                var26 = field613[var25];
            }
            if (var26 != null) {
                class205 var27 = class205.method3219(var15);
                int var28;
                int var29;
                if (var18 == 1 || var18 == 3) {
                    var28 = var27.field2161;
                    var29 = var27.field2160;
                } else {
                    var28 = var27.field2160;
                    var29 = var27.field2161;
                }
                int var30 = (var28 >> 1) + var23;
                int var31 = (var28 + 1 >> 1) + var23;
                int var32 = (var29 >> 1) + var24;
                int var33 = (var29 + 1 >> 1) + var24;
                int[][] var34 = class82.field1016[Statics.field1882];
                int var35 = var34[var30][var32] + var34[var31][var32] + var34[var30][var33] + var34[var31][var33] >> 2;
                int var36 = (var23 << 7) + (var28 << 6);
                int var37 = (var24 << 7) + (var29 << 6);
                class239 var38 = var27.method3575(var17, var18, var34, var36, var35, var37);
                if (var38 != null) {
                    method4629(Statics.field1882, var23, var24, var19, -1, 0, 0, 31, var11 + 1, var20 + 1);
                    var26.field1109 = field506 + var11;
                    var26.field1111 = field506 + var20;
                    var26.field1119 = var38;
                    var26.field1108 = var23 * 128 + var28 * 64;
                    var26.field1123 = var24 * 128 + var29 * 64;
                    var26.field1110 = var35;
                    if (var14 > var12) {
                        byte var39 = var14;
                        var14 = var12;
                        var12 = var39;
                    }
                    if (var13 > var21) {
                        byte var40 = var13;
                        var13 = var21;
                        var21 = var40;
                    }
                    var26.field1113 = var14 + var23;
                    var26.field1122 = var12 + var23;
                    var26.field1114 = var13 + var24;
                    var26.field1116 = var21 + var24;
                }
            }
        }
        if (class295.field3206 == arg0) {
            int var41 = var1.method8163();
            int var42 = var1.method8129();
            int var43 = var42 >> 2;
            int var44 = var42 & 0x3;
            int var45 = field571[var43];
            int var46 = var1.method8172();
            int var47 = var1.method8129();
            int var48 = (var47 >> 4 & 0x7) + Statics.field2951;
            int var49 = (var47 & 0x7) + Statics.field4232;
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                method4629(Statics.field1882, var48, var49, var45, var46, var43, var44, var41, 0, -1);
            }
        } else if (class295.field3204 == arg0) {
            int var50 = var1.method8250();
            int var51 = var1.method8162();
            int var52 = (var51 >> 4 & 0x7) + Statics.field2951;
            int var53 = (var51 & 0x7) + Statics.field4232;
            int var54 = var1.method8161();
            int var55 = var54 >> 2;
            int var56 = var54 & 0x3;
            int var57 = field571[var55];
            if (var52 >= 0 && var53 >= 0 && var52 < 103 && var53 < 103) {
                if (var57 == 0) {
                    class247 var58 = Statics.field238.method4174(Statics.field1882, var52, var53);
                    if (var58 != null) {
                        int var59 = class240.method3900(var58.field2821);
                        if (var55 == 2) {
                            var58.field2819 = new class80(var59, 2, var56 + 4, Statics.field1882, var52, var53, var50, false, var58.field2819);
                            var58.field2820 = new class80(var59, 2, var56 + 1 & 0x3, Statics.field1882, var52, var53, var50, false, var58.field2820);
                        } else {
                            var58.field2819 = new class80(var59, var55, var56, Statics.field1882, var52, var53, var50, false, var58.field2819);
                        }
                        return;
                    }
                }
                if (var57 == 1) {
                    class249 var60 = Statics.field238.method4175(Statics.field1882, var52, var53);
                    if (var60 != null) {
                        int var61 = class240.method3900(var60.field2823);
                        if (var55 == 4 || var55 == 5) {
                            var60.field2830 = new class80(var61, 4, var56, Statics.field1882, var52, var53, var50, false, var60.field2830);
                        } else if (var55 == 6) {
                            var60.field2830 = new class80(var61, 4, var56 + 4, Statics.field1882, var52, var53, var50, false, var60.field2830);
                        } else if (var55 == 7) {
                            var60.field2830 = new class80(var61, 4, (var56 + 2 & 0x3) + 4, Statics.field1882, var52, var53, var50, false, var60.field2830);
                        } else if (var55 == 8) {
                            var60.field2830 = new class80(var61, 4, var56 + 4, Statics.field1882, var52, var53, var50, false, var60.field2830);
                            var60.field2831 = new class80(var61, 4, (var56 + 2 & 0x3) + 4, Statics.field1882, var52, var53, var50, false, var60.field2831);
                        }
                        return;
                    }
                }
                if (var57 == 2) {
                    class250 var62 = Statics.field238.method4176(Statics.field1882, var52, var53);
                    if (var55 == 11) {
                        var55 = 10;
                    }
                    if (var62 != null) {
                        var62.field2840 = new class80(class240.method3900(var62.field2841), var55, var56, Statics.field1882, var52, var53, var50, false, var62.field2840);
                        return;
                    }
                }
                if (var57 == 3) {
                    class222 var63 = Statics.field238.method4177(Statics.field1882, var52, var53);
                    if (var63 != null) {
                        var63.field2464 = new class80(class240.method3900(var63.field2465), 22, var56, Statics.field1882, var52, var53, var50, false, var63.field2464);
                        return;
                    }
                }
                method1104(Statics.field1882, var52, var53, var57, var50);
            }
        } else if (class295.field3203 == arg0) {
            int var64 = var1.method8129();
            int var65 = (var64 >> 4 & 0x7) + Statics.field2951;
            int var66 = (var64 & 0x7) + Statics.field4232;
            int var67 = var1.method8161();
            int var68 = var67 >> 2;
            int var69 = var67 & 0x3;
            int var70 = field571[var68];
            if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                method4629(Statics.field1882, var65, var66, var70, -1, var68, var69, 31, 0, -1);
            }
        } else if (class295.field3207 == arg0) {
            int var71 = var1.method8195();
            int var72 = var1.method8163();
            int var73 = var1.method8161();
            int var74 = (var73 >> 4 & 0x7) + Statics.field2951;
            int var75 = (var73 & 0x7) + Statics.field4232;
            if (var74 >= 0 && var75 >= 0 && var74 < 104 && var75 < 104) {
                class376 var76 = field642[Statics.field1882][var74][var75];
                if (var76 != null) {
                    for (class104 var77 = (class104) var76.method6309(); var77 != null; var77 = (class104) var76.method6311()) {
                        if ((var71 & 0x7FFF) == var77.field1319) {
                            var77.method2518(var72);
                            break;
                        }
                    }
                }
            }
        } else if (class295.field3209 == arg0) {
            int var78 = var1.method8134();
            int var79 = var1.method8129();
            int var80 = (var79 >> 4 & 0x7) + Statics.field2951;
            int var81 = (var79 & 0x7) + Statics.field4232;
            int var82 = var1.method8170();
            if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104) {
                class376 var83 = field642[Statics.field1882][var80][var81];
                if (var83 != null) {
                    for (class104 var84 = (class104) var83.method6309(); var84 != null; var84 = (class104) var83.method6311()) {
                        if ((var82 & 0x7FFF) == var84.field1319 && var84.field1316 == var78) {
                            var84.method7560();
                            break;
                        }
                    }
                    if (var83.method6309() == null) {
                        field642[Statics.field1882][var80][var81] = null;
                    }
                    method2819(var80, var81);
                }
            }
        } else if (class295.field3199 == arg0) {
            byte var85 = var1.method8130();
            byte var86 = var1.method8242();
            int var87 = var1.method8162();
            int var88 = var1.method8129() * 4;
            int var89 = var1.method8250();
            int var90 = var1.method8163() * 4;
            int var91 = var1.method8250();
            int var92 = var1.method8179();
            int var93 = var1.method8163();
            int var94 = (var93 >> 4 & 0x7) + Statics.field2951;
            int var95 = (var93 & 0x7) + Statics.field4232;
            int var96 = var1.method8172();
            int var97 = var1.method8163();
            int var98 = var85 + var94;
            int var99 = var86 + var95;
            if (var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var89 != 65535) {
                int var100 = var94 * 128 + 64;
                int var101 = var95 * 128 + 64;
                int var102 = var98 * 128 + 64;
                int var103 = var99 * 128 + 64;
                class77 var104 = new class77(var89, Statics.field1882, var100, var101, method4353(var100, var101, Statics.field1882) - var88, field506 + var96, field506 + var91, var97, var87, var92, var90);
                var104.method2023(var102, var103, method4353(var102, var103, Statics.field1882) - var90, field506 + var96);
                field644.method6303(var104);
            }
        } else if (class295.field3200 == arg0) {
            int var105 = var1.method8161();
            int var106 = (var105 >> 4 & 0x7) + Statics.field2951;
            int var107 = (var105 & 0x7) + Statics.field4232;
            int var108 = var1.method8184();
            int var109 = var1.method8170();
            int var110 = var1.method8134();
            if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                class376 var111 = field642[Statics.field1882][var106][var107];
                if (var111 != null) {
                    for (class104 var112 = (class104) var111.method6309(); var112 != null; var112 = (class104) var111.method6311()) {
                        if ((var109 & 0x7FFF) == var112.field1319 && var112.field1316 == var108) {
                            var112.field1316 = var110;
                            break;
                        }
                    }
                    method2819(var106, var107);
                }
            }
        } else if (class295.field3201 == arg0) {
            int var113 = var1.method8129();
            int var114 = (var113 >> 4 & 0x7) + Statics.field2951;
            int var115 = (var113 & 0x7) + Statics.field4232;
            int var116 = var1.method8170();
            int var117 = var1.method8163();
            int var118 = var1.method8195();
            if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                int var119 = var114 * 128 + 64;
                int var120 = var115 * 128 + 64;
                class72 var121 = new class72(var118, Statics.field1882, var119, var120, method4353(var119, var120, Statics.field1882) - var117, var116, field506);
                field685.method6303(var121);
            }
        } else if (class295.field3205 == arg0) {
            int var122 = var1.method8162();
            int var123 = (var122 >> 4 & 0x7) + Statics.field2951;
            int var124 = (var122 & 0x7) + Statics.field4232;
            var1.method8162();
            int var125 = var1.method8184();
            var1.method8170();
            int var126 = var1.method8172();
            var1.method8161();
            var1.method8170();
            int var127 = var1.method8129();
            if (var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104) {
                class104 var128 = new class104();
                var128.field1319 = var126;
                var128.field1316 = var125;
                var128.method2518(var127);
                if (field642[Statics.field1882][var123][var124] == null) {
                    field642[Statics.field1882][var123][var124] = new class376();
                }
                field642[Statics.field1882][var123][var124].method6303(var128);
                method2819(var123, var124);
            }
        }
    }

    @ObfuscatedName("jo.jc(IIIIIIIIIII)V")
    public static final void method4629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class94 var10 = null;
        for (class94 var11 = (class94) field643.method6309(); var11 != null; var11 = (class94) field643.method6311()) {
            if (var11.field1139 == arg0 && var11.field1136 == arg1 && var11.field1146 == arg2 && var11.field1135 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class94();
            var10.field1139 = arg0;
            var10.field1135 = arg3;
            var10.field1136 = arg1;
            var10.field1146 = arg2;
            var10.field1144 = -1;
            method5983(var10);
            field643.method6303(var10);
        }
        var10.field1149 = arg4;
        var10.field1143 = arg5;
        var10.field1142 = arg6;
        var10.field1147 = arg8;
        var10.field1148 = arg9;
        var10.method2233(arg7);
    }

    @ObfuscatedName("cg.jo(IIIIII)Z")
    public static final boolean method1104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class94 var5 = null;
        for (class94 var6 = (class94) field643.method6309(); var6 != null; var6 = (class94) field643.method6311()) {
            if (var6.field1139 == arg0 && var6.field1136 == arg1 && var6.field1146 == arg2 && var6.field1135 == arg3) {
                var5 = var6;
                break;
            }
        }
        if (var5 == null) {
            return false;
        } else {
            var5.field1144 = arg4;
            return true;
        }
    }

    @ObfuscatedName("jx.jb(I)V")
    public static final void method4552() {
        for (class94 var0 = (class94) field643.method6309(); var0 != null; var0 = (class94) field643.method6311()) {
            if (var0.field1148 == -1) {
                var0.field1147 = 0;
                method5983(var0);
            } else {
                var0.method7560();
            }
        }
    }

    @ObfuscatedName("mt.js(Ldv;B)V")
    public static final void method5983(class94 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1135 == 0) {
            var1 = Statics.field238.method4304(arg0.field1139, arg0.field1136, arg0.field1146);
        }
        if (arg0.field1135 == 1) {
            var1 = Statics.field238.method4289(arg0.field1139, arg0.field1136, arg0.field1146);
        }
        if (arg0.field1135 == 2) {
            var1 = Statics.field238.method4223(arg0.field1139, arg0.field1136, arg0.field1146);
        }
        if (arg0.field1135 == 3) {
            var1 = Statics.field238.method4181(arg0.field1139, arg0.field1136, arg0.field1146);
        }
        if (var1 != 0L) {
            int var6 = Statics.field238.method4182(arg0.field1139, arg0.field1136, arg0.field1146, var1);
            var3 = class240.method3900(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1138 = var3;
        arg0.field1134 = var4;
        arg0.field1141 = var5;
    }

    @ObfuscatedName("jv.jj(IIIIIIIII)V")
    public static final void method4647(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field508 && Statics.field1882 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field238.method4304(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field238.method4289(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field238.method4223(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field238.method4181(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field238.method4182(arg0, arg2, arg3, var8);
            int var14 = class240.method3900(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field238.method4169(arg0, arg2, arg3);
                class205 var17 = class205.method3219(var14);
                if (var17.field2162 != 0) {
                    field776[arg0].method3830(arg2, arg3, var15, var16, var17.field2192);
                }
            }
            if (arg1 == 1) {
                Statics.field238.method4214(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field238.method4171(arg0, arg2, arg3);
                class205 var18 = class205.method3219(var14);
                if (var18.field2160 + arg2 > 103 || var18.field2160 + arg3 > 103 || var18.field2161 + arg2 > 103 || var18.field2161 + arg3 > 103) {
                    return;
                }
                if (var18.field2162 != 0) {
                    field776[arg0].method3844(arg2, arg3, var18.field2160, var18.field2161, var16, var18.field2192);
                }
            }
            if (arg1 == 3) {
                Statics.field238.method4172(arg0, arg2, arg3);
                class205 var19 = class205.method3219(var14);
                if (var19.field2162 == 1) {
                    field776[arg0].method3831(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var20 = arg0;
        if (arg0 < 3 && (class82.field1018[1][arg2][arg3] & 0x2) == 2) {
            var20 = arg0 + 1;
        }
        class230 var21 = Statics.field238;
        class213 var22 = field776[arg0];
        class205 var23 = class205.method3219(arg4);
        int var24 = arg7 >= 0 ? arg7 : var23.field2181;
        int var25;
        int var26;
        if (arg5 == 1 || arg5 == 3) {
            var25 = var23.field2161;
            var26 = var23.field2160;
        } else {
            var25 = var23.field2160;
            var26 = var23.field2161;
        }
        int var27;
        int var28;
        if (arg2 + var25 <= 104) {
            var27 = (var25 >> 1) + arg2;
            var28 = (var25 + 1 >> 1) + arg2;
        } else {
            var27 = arg2;
            var28 = arg2 + 1;
        }
        int var29;
        int var30;
        if (arg3 + var26 <= 104) {
            var29 = (var26 >> 1) + arg3;
            var30 = (var26 + 1 >> 1) + arg3;
        } else {
            var29 = arg3;
            var30 = arg3 + 1;
        }
        int[][] var31 = class82.field1016[var20];
        int var32 = var31[var27][var29] + var31[var28][var29] + var31[var27][var30] + var31[var28][var30] >> 2;
        int var33 = (arg2 << 7) + (var25 << 6);
        int var34 = (arg3 << 7) + (var26 << 6);
        long var35 = class240.method6770(arg2, arg3, 2, var23.field2164 == 0, arg4);
        int var37 = (arg5 << 6) + arg6;
        if (var23.field2165 == 1) {
            var37 += 256;
        }
        if (arg6 == 22) {
            class232 var38;
            if (var24 == -1 && var23.field2152 == null) {
                var38 = var23.method3575(22, arg5, var31, var33, var32, var34);
            } else {
                var38 = new class80(arg4, 22, arg5, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4273(arg0, arg2, arg3, var32, var38, var35, var37);
            if (var23.field2162 == 1) {
                var22.method3826(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class232 var64;
            if (var24 == -1 && var23.field2152 == null) {
                var64 = var23.method3575(10, arg5, var31, var33, var32, var34);
            } else {
                var64 = new class80(arg4, 10, arg5, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            if (var64 != null) {
                var21.method4162(arg0, arg2, arg3, var32, var25, var26, var64, arg6 == 11 ? 256 : 0, var35, var37);
            }
            if (var23.field2162 != 0) {
                var22.method3833(arg2, arg3, var25, var26, var23.field2192);
            }
        } else if (arg6 >= 12) {
            class232 var39;
            if (var24 == -1 && var23.field2152 == null) {
                var39 = var23.method3575(arg6, arg5, var31, var33, var32, var34);
            } else {
                var39 = new class80(arg4, arg6, arg5, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4162(arg0, arg2, arg3, var32, 1, 1, var39, 0, var35, var37);
            if (var23.field2162 != 0) {
                var22.method3833(arg2, arg3, var25, var26, var23.field2192);
            }
        } else if (arg6 == 0) {
            class232 var40;
            if (var24 == -1 && var23.field2152 == null) {
                var40 = var23.method3575(0, arg5, var31, var33, var32, var34);
            } else {
                var40 = new class80(arg4, 0, arg5, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4197(arg0, arg2, arg3, var32, var40, (class232) null, class82.field1022[arg5], 0, var35, var37);
            if (var23.field2162 != 0) {
                var22.method3840(arg2, arg3, arg6, arg5, var23.field2192);
            }
        } else if (arg6 == 1) {
            class232 var41;
            if (var24 == -1 && var23.field2152 == null) {
                var41 = var23.method3575(1, arg5, var31, var33, var32, var34);
            } else {
                var41 = new class80(arg4, 1, arg5, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4197(arg0, arg2, arg3, var32, var41, (class232) null, class82.field1023[arg5], 0, var35, var37);
            if (var23.field2162 != 0) {
                var22.method3840(arg2, arg3, arg6, arg5, var23.field2192);
            }
        } else if (arg6 == 2) {
            int var42 = arg5 + 1 & 0x3;
            class232 var43;
            class232 var44;
            if (var24 == -1 && var23.field2152 == null) {
                var43 = var23.method3575(2, arg5 + 4, var31, var33, var32, var34);
                var44 = var23.method3575(2, var42, var31, var33, var32, var34);
            } else {
                var43 = new class80(arg4, 2, arg5 + 4, var20, arg2, arg3, var24, var23.field2173, (class232) null);
                var44 = new class80(arg4, 2, var42, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4197(arg0, arg2, arg3, var32, var43, var44, class82.field1022[arg5], class82.field1022[var42], var35, var37);
            if (var23.field2162 != 0) {
                var22.method3840(arg2, arg3, arg6, arg5, var23.field2192);
            }
        } else if (arg6 == 3) {
            class232 var45;
            if (var24 == -1 && var23.field2152 == null) {
                var45 = var23.method3575(3, arg5, var31, var33, var32, var34);
            } else {
                var45 = new class80(arg4, 3, arg5, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4197(arg0, arg2, arg3, var32, var45, (class232) null, class82.field1023[arg5], 0, var35, var37);
            if (var23.field2162 != 0) {
                var22.method3840(arg2, arg3, arg6, arg5, var23.field2192);
            }
        } else if (arg6 == 9) {
            class232 var46;
            if (var24 == -1 && var23.field2152 == null) {
                var46 = var23.method3575(arg6, arg5, var31, var33, var32, var34);
            } else {
                var46 = new class80(arg4, arg6, arg5, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4162(arg0, arg2, arg3, var32, 1, 1, var46, 0, var35, var37);
            if (var23.field2162 != 0) {
                var22.method3833(arg2, arg3, var25, var26, var23.field2192);
            }
        } else if (arg6 == 4) {
            class232 var47;
            if (var24 == -1 && var23.field2152 == null) {
                var47 = var23.method3575(4, arg5, var31, var33, var32, var34);
            } else {
                var47 = new class80(arg4, 4, arg5, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4161(arg0, arg2, arg3, var32, var47, (class232) null, class82.field1022[arg5], 0, 0, 0, var35, var37);
        } else if (arg6 == 5) {
            int var48 = 16;
            long var49 = var21.method4304(arg0, arg2, arg3);
            if (var49 != 0L) {
                var48 = class205.method3219(class240.method3900(var49)).field2169;
            }
            class232 var51;
            if (var24 == -1 && var23.field2152 == null) {
                var51 = var23.method3575(4, arg5, var31, var33, var32, var34);
            } else {
                var51 = new class80(arg4, 4, arg5, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4161(arg0, arg2, arg3, var32, var51, (class232) null, class82.field1022[arg5], 0, class82.field1015[arg5] * var48, class82.field1024[arg5] * var48, var35, var37);
        } else if (arg6 == 6) {
            int var52 = 8;
            long var53 = var21.method4304(arg0, arg2, arg3);
            if (var53 != 0L) {
                var52 = class205.method3219(class240.method3900(var53)).field2169 / 2;
            }
            class232 var55;
            if (var24 == -1 && var23.field2152 == null) {
                var55 = var23.method3575(4, arg5 + 4, var31, var33, var32, var34);
            } else {
                var55 = new class80(arg4, 4, arg5 + 4, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4161(arg0, arg2, arg3, var32, var55, (class232) null, 256, arg5, class82.field1026[arg5] * var52, class82.field1027[arg5] * var52, var35, var37);
        } else if (arg6 == 7) {
            int var56 = arg5 + 2 & 0x3;
            class232 var57;
            if (var24 == -1 && var23.field2152 == null) {
                var57 = var23.method3575(4, var56 + 4, var31, var33, var32, var34);
            } else {
                var57 = new class80(arg4, 4, var56 + 4, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4161(arg0, arg2, arg3, var32, var57, (class232) null, 256, var56, 0, 0, var35, var37);
        } else if (arg6 == 8) {
            int var58 = 8;
            long var59 = var21.method4304(arg0, arg2, arg3);
            if (var59 != 0L) {
                var58 = class205.method3219(class240.method3900(var59)).field2169 / 2;
            }
            int var61 = arg5 + 2 & 0x3;
            class232 var62;
            class232 var63;
            if (var24 == -1 && var23.field2152 == null) {
                var62 = var23.method3575(4, arg5 + 4, var31, var33, var32, var34);
                var63 = var23.method3575(4, var61 + 4, var31, var33, var32, var34);
            } else {
                var62 = new class80(arg4, 4, arg5 + 4, var20, arg2, arg3, var24, var23.field2173, (class232) null);
                var63 = new class80(arg4, 4, var61 + 4, var20, arg2, arg3, var24, var23.field2173, (class232) null);
            }
            var21.method4161(arg0, arg2, arg3, var32, var62, var63, 256, arg5, class82.field1026[arg5] * var58, class82.field1027[arg5] * var58, var35, var37);
        }
    }

    @ObfuscatedName("eg.ja(IIB)V")
    public static final void method2819(int arg0, int arg1) {
        class376 var2 = field642[Statics.field1882][arg0][arg1];
        if (var2 == null) {
            Statics.field238.method4173(Statics.field1882, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class104 var5 = null;
        for (class104 var6 = (class104) var2.method6309(); var6 != null; var6 = (class104) var2.method6311()) {
            class206 var7 = class206.method5155(var6.field1319);
            long var8 = (long) var7.field2246;
            if (var7.field2213 == 1) {
                var8 *= var6.field1316 < Integer.MAX_VALUE ? (long) (var6.field1316 + 1) : (long) var6.field1316;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field238.method4173(Statics.field1882, arg0, arg1);
            return;
        }
        var2.method6305(var5);
        class104 var10 = null;
        class104 var11 = null;
        for (class104 var12 = (class104) var2.method6309(); var12 != null; var12 = (class104) var2.method6311()) {
            if (var5.field1319 != var12.field1319) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1319 != var12.field1319 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class240.method6770(arg0, arg1, 3, false, 0);
        Statics.field238.method4276(Statics.field1882, arg0, arg1, method4353(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1882), var5, var13, var10, var11);
    }

    @ObfuscatedName("fy.jv(ZLtl;I)V")
    public static final void method2968(boolean arg0, class500 arg1) {
        field635 = 0;
        field580 = 0;
        method2231(arg1);
        while (true) {
            byte var2 = 16;
            int var3 = 0x1 << var2;
            if (arg1.method8108(field568.field1387) < var2 + 12) {
                break;
            }
            int var4 = arg1.method8104(var2);
            if (var3 - 1 == var4) {
                break;
            }
            boolean var8 = false;
            if (field563[var4] == null) {
                field563[var4] = new class100();
                var8 = true;
            }
            class100 var9 = field563[var4];
            field540[++field542 - 1] = var4;
            var9.field1211 = field506;
            var9.field1292 = class195.method7336(arg1.method8104(14));
            int var10 = arg1.method8104(1);
            int var11 = field779[arg1.method8104(3)];
            if (var8) {
                var9.field1219 = var9.field1164 = var11;
            }
            int var12;
            if (arg0) {
                var12 = arg1.method8104(8);
                if (var12 > 127) {
                    var12 -= 256;
                }
            } else {
                var12 = arg1.method8104(5);
                if (var12 > 15) {
                    var12 -= 32;
                }
            }
            boolean var13 = arg1.method8104(1) == 1;
            if (var13) {
                arg1.method8104(32);
            }
            int var14;
            if (arg0) {
                var14 = arg1.method8104(8);
                if (var14 > 127) {
                    var14 -= 256;
                }
            } else {
                var14 = arg1.method8104(5);
                if (var14 > 15) {
                    var14 -= 32;
                }
            }
            int var15 = arg1.method8104(1);
            if (var15 == 1) {
                field567[++field580 - 1] = var4;
            }
            method6478(var9);
            if (var9.field1221 == 0) {
                var9.field1164 = 0;
            }
            var9.method2438(Statics.field971.field1223[0] + var12, Statics.field971.field1193[0] + var14, var10 == 1);
        }
        arg1.method8082();
        method3096(arg1);
        for (int var5 = 0; var5 < field635; var5++) {
            int var6 = field636[var5];
            if (field506 != field563[var6].field1211) {
                field563[var6].field1292 = null;
                field563[var6] = null;
            }
        }
        if (field568.field1387 != arg1.field5017) {
            throw new RuntimeException(arg1.field5017 + class101.field1294 + field568.field1387);
        }
        for (int var7 = 0; var7 < field542; var7++) {
            if (field563[field540[var7]] == null) {
                throw new RuntimeException(var7 + class101.field1294 + field542);
            }
        }
    }

    @ObfuscatedName("dp.jt(Ltl;I)V")
    public static final void method2231(class500 arg0) {
        arg0.method8080();
        int var1 = arg0.method8104(8);
        if (var1 < field542) {
            for (int var2 = var1; var2 < field542; var2++) {
                field636[++field635 - 1] = field540[var2];
            }
        }
        if (var1 > field542) {
            throw new RuntimeException("");
        }
        field542 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field540[var3];
            class100 var5 = field563[var4];
            int var6 = arg0.method8104(1);
            if (var6 == 0) {
                field540[++field542 - 1] = var4;
                var5.field1211 = field506;
            } else {
                int var7 = arg0.method8104(2);
                if (var7 == 0) {
                    field540[++field542 - 1] = var4;
                    var5.field1211 = field506;
                    field567[++field580 - 1] = var4;
                } else if (var7 == 1) {
                    field540[++field542 - 1] = var4;
                    var5.field1211 = field506;
                    int var8 = arg0.method8104(3);
                    var5.method2440(var8, class217.field2396);
                    int var9 = arg0.method8104(1);
                    if (var9 == 1) {
                        field567[++field580 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field540[++field542 - 1] = var4;
                    var5.field1211 = field506;
                    if (arg0.method8104(1) == 1) {
                        int var10 = arg0.method8104(3);
                        var5.method2440(var10, class217.field2397);
                        int var11 = arg0.method8104(3);
                        var5.method2440(var11, class217.field2397);
                    } else {
                        int var12 = arg0.method8104(3);
                        var5.method2440(var12, class217.field2395);
                    }
                    int var13 = arg0.method8104(1);
                    if (var13 == 1) {
                        field567[++field580 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field636[++field635 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("gz.jq(Ltl;I)V")
    public static final void method3096(class500 arg0) {
        for (int var1 = 0; var1 < field580; var1++) {
            int var2 = field567[var1];
            class100 var3 = field563[var2];
            int var4 = arg0.method8129();
            if ((var4 & 0x8) != 0) {
                int var5 = arg0.method8129();
                var4 += var5 << 8;
            }
            if ((var4 & 0x800) != 0) {
                int var6 = arg0.method8129();
                var4 += var6 << 16;
            }
            if ((var4 & 0x100) != 0) {
                var3.field1171 = field506 + arg0.method8172();
                var3.field1214 = field506 + arg0.method8170();
                var3.field1165 = arg0.method8191();
                var3.field1216 = arg0.method8242();
                var3.field1197 = arg0.method8191();
                var3.field1218 = (byte) arg0.method8162();
            }
            if ((var4 & 0x400) != 0) {
                var3.field1204 = arg0.method8199();
                var3.field1206 = arg0.method8242();
                var3.field1174 = arg0.method8242();
                var3.field1207 = arg0.method8242();
                var3.field1212 = arg0.method8195() + field506;
                var3.field1209 = arg0.method8170() + field506;
                var3.field1210 = arg0.method8195();
                var3.field1222 = 1;
                var3.field1227 = 0;
                var3.field1204 += var3.field1223[0];
                var3.field1206 += var3.field1193[0];
                var3.field1174 += var3.field1223[0];
                var3.field1207 += var3.field1193[0];
            }
            if ((var4 & 0x1) != 0) {
                int var7 = arg0.method8170();
                int var8 = arg0.method8250();
                var3.field1185 = arg0.method8163() == 1;
                if (field513 >= 212) {
                    var3.field1179 = var7;
                    var3.field1191 = var8;
                } else {
                    int var9 = var3.field1163 - (var7 - Statics.field2380 - Statics.field2380) * 64;
                    int var10 = var3.field1153 - (var8 - Statics.field1302 - Statics.field1302) * 64;
                    if (var9 != 0 || var10 != 0) {
                        var3.field1229 = class436.method6936(var9, var10);
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1292 = class195.method7336(arg0.method8170());
                method6478(var3);
                var3.method2446();
            }
            if ((var4 & 0x40000) != 0) {
                int var11 = arg0.method8163();
                for (int var12 = 0; var12 < var11; var12++) {
                    int var13 = arg0.method8129();
                    int var14 = arg0.method8172();
                    int var15 = arg0.method8134();
                    var3.method2249(var13, var14, var15 >> 16, var15 & 0xFFFF);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field1173 = arg0.method8253();
                var3.field1215 = 100;
            }
            if ((var4 & 0x4000) != 0) {
                var3.field1228 = arg0.method8134();
            }
            if ((var4 & 0x2) != 0) {
                int var16 = arg0.method8162();
                if (var16 > 0) {
                    for (int var17 = 0; var17 < var16; var17++) {
                        int var18 = -1;
                        int var19 = -1;
                        int var20 = -1;
                        int var21 = arg0.method8144();
                        if (var21 == 32767) {
                            var21 = arg0.method8144();
                            var19 = arg0.method8144();
                            var18 = arg0.method8144();
                            var20 = arg0.method8144();
                        } else if (var21 == 32766) {
                            var21 = -1;
                        } else {
                            var19 = arg0.method8144();
                        }
                        int var22 = arg0.method8144();
                        var3.method2246(var21, var19, var18, var20, field506, var22);
                    }
                }
                int var23 = arg0.method8129();
                if (var23 > 0) {
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = arg0.method8144();
                        int var26 = arg0.method8144();
                        if (var26 == 32767) {
                            var3.method2248(var25);
                        } else {
                            int var27 = arg0.method8144();
                            int var28 = arg0.method8129();
                            int var29 = var26 > 0 ? arg0.method8162() : var28;
                            var3.method2269(var25, field506, var26, var27, var28, var29);
                        }
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field1187 = arg0.method8250();
                var3.field1187 += arg0.method8129() << 16;
                int var30 = 16777215;
                if (var3.field1187 == var30) {
                    var3.field1187 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                arg0.method8172();
                arg0.method8134();
            }
            if ((var4 & 0x20000) != 0) {
                int var31 = arg0.method8161();
                int[] var32 = new int[8];
                short[] var33 = new short[8];
                for (int var34 = 0; var34 < 8; var34++) {
                    if ((var31 & 0x1 << var34) == 0) {
                        var32[var34] = -1;
                        var33[var34] = -1;
                    } else {
                        var32[var34] = arg0.method8148();
                        var33[var34] = (short) arg0.method8158();
                    }
                }
                var3.method2445(var32, var33);
            }
            if ((var4 & 0x10000) != 0) {
                int var35 = arg0.method8183();
                var3.field1200 = (var35 & 0x1) == 0 ? var3.field1292.field2031 : arg0.method8170();
                var3.field1160 = (var35 & 0x2) == 0 ? var3.field1292.field2004 : arg0.method8170();
                var3.field1159 = (var35 & 0x4) == 0 ? var3.field1292.field2007 : arg0.method8250();
                var3.field1162 = (var35 & 0x8) == 0 ? var3.field1292.field2008 : arg0.method8170();
                var3.field1154 = (var35 & 0x10) == 0 ? var3.field1292.field1994 : arg0.method8170();
                var3.field1189 = (var35 & 0x20) == 0 ? var3.field1292.field2010 : arg0.method8195();
                var3.field1203 = (var35 & 0x40) == 0 ? var3.field1292.field2015 : arg0.method8250();
                var3.field1192 = (var35 & 0x80) == 0 ? var3.field1292.field2012 : arg0.method8172();
                var3.field1199 = (var35 & 0x100) == 0 ? var3.field1292.field2013 : arg0.method8250();
                var3.field1168 = (var35 & 0x200) == 0 ? var3.field1292.field2014 : arg0.method8170();
                var3.field1169 = (var35 & 0x400) == 0 ? var3.field1292.field1995 : arg0.method8172();
                var3.field1170 = (var35 & 0x800) == 0 ? var3.field1292.field2016 : arg0.method8170();
                var3.field1184 = (var35 & 0x1000) == 0 ? var3.field1292.field2017 : arg0.method8195();
                var3.field1172 = (var35 & 0x2000) == 0 ? var3.field1292.field2018 : arg0.method8170();
                var3.field1158 = (var35 & 0x4000) == 0 ? var3.field1292.field2040 : arg0.method8250();
            }
            if ((var4 & 0x4) != 0) {
                int var36 = arg0.method8250();
                if (var36 == 65535) {
                    var36 = -1;
                }
                int var37 = arg0.method8161();
                if (var3.field1217 == var36 && var36 != -1) {
                    int var38 = class208.method4648(var36).field2300;
                    if (var38 == 1) {
                        var3.field1198 = 0;
                        var3.field1177 = 0;
                        var3.field1208 = var37;
                        var3.field1201 = 0;
                    }
                    if (var38 == 2) {
                        var3.field1201 = 0;
                    }
                } else if (var36 == -1 || var3.field1217 == -1 || class208.method4648(var36).field2279 >= class208.method4648(var3.field1217).field2279) {
                    var3.field1217 = var36;
                    var3.field1198 = 0;
                    var3.field1177 = 0;
                    var3.field1208 = var37;
                    var3.field1201 = 0;
                    var3.field1227 = var3.field1222;
                }
            }
            if ((var4 & 0x1000) != 0) {
                var3.method2488(arg0.method8163());
            }
            if ((var4 & 0x200) != 0) {
                int var39 = arg0.method8162();
                if ((var39 & 0x1) == 1) {
                    var3.method2450();
                } else {
                    int[] var40 = null;
                    if ((var39 & 0x2) == 2) {
                        int var41 = arg0.method8162();
                        var40 = new int[var41];
                        for (int var42 = 0; var42 < var41; var42++) {
                            int var43 = arg0.method8250();
                            int var44 = var43 == 65535 ? -1 : var43;
                            var40[var42] = var44;
                        }
                    }
                    short[] var45 = null;
                    if ((var39 & 0x4) == 4) {
                        int var46 = 0;
                        if (var3.field1292.field2020 != null) {
                            var46 = var3.field1292.field2020.length;
                        }
                        var45 = new short[var46];
                        for (int var47 = 0; var47 < var46; var47++) {
                            var45[var47] = (short) arg0.method8170();
                        }
                    }
                    short[] var48 = null;
                    if ((var39 & 0x8) == 8) {
                        int var49 = 0;
                        if (var3.field1292.field2005 != null) {
                            var49 = var3.field1292.field2005.length;
                        }
                        var48 = new short[var49];
                        for (int var50 = 0; var50 < var49; var50++) {
                            var48[var50] = (short) arg0.method8170();
                        }
                    }
                    boolean var51 = false;
                    if ((var39 & 0x10) != 0) {
                        var51 = arg0.method8162() == 1;
                    }
                    long var52 = (long) (++class100.field1290 - 1);
                    var3.method2455(new class194(var52, var40, var45, var48, var51));
                }
            }
            if ((var4 & 0x2000) != 0) {
                int var54 = arg0.method8163();
                if ((var54 & 0x1) == 1) {
                    var3.method2451();
                } else {
                    int[] var55 = null;
                    if ((var54 & 0x2) == 2) {
                        int var56 = arg0.method8129();
                        var55 = new int[var56];
                        for (int var57 = 0; var57 < var56; var57++) {
                            int var58 = arg0.method8250();
                            int var59 = var58 == 65535 ? -1 : var58;
                            var55[var57] = var59;
                        }
                    }
                    short[] var60 = null;
                    if ((var54 & 0x4) == 4) {
                        int var61 = 0;
                        if (var3.field1292.field2020 != null) {
                            var61 = var3.field1292.field2020.length;
                        }
                        var60 = new short[var61];
                        for (int var62 = 0; var62 < var61; var62++) {
                            var60[var62] = (short) arg0.method8172();
                        }
                    }
                    short[] var63 = null;
                    if ((var54 & 0x8) == 8) {
                        int var64 = 0;
                        if (var3.field1292.field2005 != null) {
                            var64 = var3.field1292.field2005.length;
                        }
                        var63 = new short[var64];
                        for (int var65 = 0; var65 < var64; var65++) {
                            var63[var65] = (short) arg0.method8250();
                        }
                    }
                    boolean var66 = false;
                    if ((var54 & 0x10) != 0) {
                        var66 = arg0.method8129() == 1;
                    }
                    long var67 = (long) (++class100.field1282 - 1);
                    var3.method2449(new class194(var67, var55, var60, var63, var66));
                }
            }
            if ((var4 & 0x8000) != 0) {
                var3.method2436(arg0.method8253());
            }
        }
    }

    @ObfuscatedName("oa.ju(Lde;B)V")
    public static void method6478(class100 arg0) {
        arg0.field1156 = arg0.field1292.field2029;
        arg0.field1221 = arg0.field1292.field2009;
        arg0.field1159 = arg0.field1292.field2007;
        arg0.field1162 = arg0.field1292.field2008;
        arg0.field1154 = arg0.field1292.field1994;
        arg0.field1189 = arg0.field1292.field2010;
        arg0.field1158 = arg0.field1292.field2040;
        arg0.field1200 = arg0.field1292.field2031;
        arg0.field1160 = arg0.field1292.field2004;
        arg0.field1203 = arg0.field1292.field2015;
        arg0.field1192 = arg0.field1292.field2012;
        arg0.field1199 = arg0.field1292.field2013;
        arg0.field1168 = arg0.field1292.field2014;
        arg0.field1169 = arg0.field1292.field1995;
        arg0.field1170 = arg0.field1292.field2016;
        arg0.field1184 = arg0.field1292.field2017;
        arg0.field1172 = arg0.field1292.field2018;
    }

    @ObfuscatedName("mk.ji(Ldh;IILie;I)V")
    public static final void method5432(class92 arg0, int arg1, int arg2, class217 arg3) {
        int var4 = arg0.field1223[0];
        int var5 = arg0.field1193[0];
        int var6 = arg0.method2183();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method2183();
        class215 var8 = method4991(arg1, arg2);
        class213 var9 = field776[arg0.field1103];
        int[] var10 = field806;
        int[] var11 = field807;
        int var12 = class218.method5770(var4, var5, var7, var8, var9, true, var10, var11, Statics.field1580[0]);
        int var13 = var12;
        if (var12 >= 1) {
            for (int var14 = 0; var14 < var13 - 1; var14++) {
                arg0.method2186(field806[var14], field807[var14], arg3);
            }
        }
    }

    @ObfuscatedName("kj.jm(IIB)Lig;")
    public static class215 method4991(int arg0, int arg1) {
        field805.field2386 = arg0;
        field805.field2384 = arg1;
        field805.field2385 = 1;
        field805.field2383 = 1;
        return field805;
    }

    @ObfuscatedName("dh.je(I)V")
    public static void method2228() {
        field651 = 0;
        field650 = false;
    }

    @ObfuscatedName("rm.jl(B)V")
    public static void method7488() {
        method2228();
        field657[0] = class350.field4123;
        field658[0] = "";
        field714[0] = 1006;
        field659[0] = false;
        field651 = 1;
    }

    @ObfuscatedName("ak.jf(I)V")
    public static final void method43() {
        int var0 = Statics.field1878;
        int var1 = Statics.field1993;
        int var2 = Statics.field2682;
        int var3 = Statics.field445;
        int var4 = 6116423;
        class511.method8468(var0, var1, var2, var3, var4);
        class511.method8468(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class511.method8472(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1789.method6828(class350.field4046, var0 + 3, var1 + 14, var4, -1);
        int var5 = class36.field221;
        int var6 = class36.field229;
        for (int var7 = 0; var7 < field651; var7++) {
            int var8 = (field651 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class392 var10 = Statics.field1789;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field658[var7].length() > 0) {
                var11 = field657[var7] + class350.field3900 + field658[var7];
            } else {
                var11 = field657[var7];
            }
            var10.method6828(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field1878;
        int var13 = Statics.field1993;
        int var14 = Statics.field2682;
        int var15 = Statics.field445;
        for (int var16 = 0; var16 < field722; var16++) {
            if (field729[var16] + field727[var16] > var12 && field727[var16] < var12 + var14 && field793[var16] + field538[var16] > var13 && field793[var16] < var13 + var15) {
                field725[var16] = true;
            }
        }
    }

    @ObfuscatedName("ai.kq(IIIII)V")
    public static final void method298(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field722; var4++) {
            if (field729[var4] + field727[var4] > arg0 && field727[var4] < arg0 + arg2 && field793[var4] + field538[var4] > arg1 && field793[var4] < arg1 + arg3) {
                field724[var4] = true;
            }
        }
    }

    @ObfuscatedName("mp.ky(IIIIB)V")
    public static final void method5949(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field722; var4++) {
            if (field729[var4] + field727[var4] > arg0 && field727[var4] < arg0 + arg2 && field793[var4] + field538[var4] > arg1 && field793[var4] < arg1 + arg3) {
                field725[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ka(I)V")
    public final void method1149() {
        method2164();
        if (field771 != null) {
            return;
        }
        int var1 = class36.field232;
        if (!field650) {
            int var19 = method2872();
            if ((var1 == 1 || !Statics.field3402 && var1 == 4) && this.method1150()) {
                var1 = 2;
            }
            if ((var1 == 1 || !Statics.field3402 && var1 == 4) && field651 > 0 && var19 >= 0) {
                int var20 = field652[var19];
                int var21 = field730[var19];
                int var22 = field714[var19];
                int var23 = field655[var19];
                int var24 = field656[var19];
                String var25 = field657[var19];
                String var26 = field658[var19];
                method4948(var20, var21, var22, var23, var24, var25, var26, class36.field233, class36.field234);
            }
            if (var1 == 2 && field651 > 0) {
                this.method1628(class36.field233, class36.field234);
            }
            return;
        }
        if (var1 != 1 && (Statics.field3402 || var1 != 4)) {
            int var2 = class36.field221;
            int var3 = class36.field229;
            if (var2 < Statics.field1878 - 10 || var2 > Statics.field2682 + Statics.field1878 + 10 || var3 < Statics.field1993 - 10 || var3 > Statics.field445 + Statics.field1993 + 10) {
                field650 = false;
                method298(Statics.field1878, Statics.field1993, Statics.field2682, Statics.field445);
            }
        }
        if (var1 != 1 && Statics.field3402 || var1 != 4) {
            return;
        }
        int var4 = Statics.field1878;
        int var5 = Statics.field1993;
        int var6 = Statics.field2682;
        int var7 = class36.field233;
        int var8 = class36.field234;
        int var9 = -1;
        for (int var10 = 0; var10 < field651; var10++) {
            int var11 = (field651 - 1 - var10) * 15 + var5 + 31;
            if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                var9 = var10;
            }
        }
        if (var9 != -1 && var9 >= 0) {
            int var12 = field652[var9];
            int var13 = field730[var9];
            int var14 = field714[var9];
            int var15 = field655[var9];
            int var16 = field656[var9];
            String var17 = field657[var9];
            String var18 = field658[var9];
            method4948(var12, var13, var14, var15, var16, var17, var18, class36.field233, class36.field234);
        }
        field650 = false;
        method298(Statics.field1878, Statics.field1993, Statics.field2682, Statics.field445);
    }

    @ObfuscatedName("client.kc(B)Z")
    public final boolean method1150() {
        int var1 = method2872();
        boolean var2 = field649 && field651 > 2;
        if (!var2) {
            boolean var3;
            if (var1 < 0) {
                var3 = false;
            } else {
                int var4 = field714[var1];
                if (var4 >= 2000) {
                    var4 -= 2000;
                }
                if (var4 == 1007) {
                    var3 = true;
                } else {
                    var3 = false;
                }
            }
            var2 = var3;
        }
        return var2 && !field659[var1];
    }

    @ObfuscatedName("client.kx(III)V")
    public final void method1628(int arg0, int arg1) {
        int var3 = Statics.field1789.method6775(class350.field4046);
        for (int var4 = 0; var4 < field651; var4++) {
            class392 var5 = Statics.field1789;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field658[var4].length() > 0) {
                var6 = field657[var4] + class350.field3900 + field658[var4];
            } else {
                var6 = field657[var4];
            }
            int var7 = var5.method6775(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field651 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field4720) {
            var9 = Statics.field4720 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field3024) {
            var10 = Statics.field3024 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field1878 = var9;
        Statics.field1993 = var10;
        Statics.field2682 = var3;
        Statics.field445 = field651 * 15 + 22;
        int var11 = arg0 - field785;
        int var12 = arg1 - field760;
        Statics.field238.method4191(Statics.field1882, var11, var12, false);
        field650 = true;
    }

    @ObfuscatedName("kq.kj(IIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method4948(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 45) {
            class92 var9 = field613[arg3];
            if (var9 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var10 = class296.method3619(class294.field3190, field568.field1380);
                var10.field3211.method8113(field740.method3791(82) ? 1 : 0);
                var10.field3211.method8114(arg3);
                field568.method2642(var10);
            }
        }
        if (arg2 == 44) {
            class92 var11 = field613[arg3];
            if (var11 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var12 = class296.method3619(class294.field3166, field568.field1380);
                var12.field3211.method8160(field740.method3791(82) ? 1 : 0);
                var12.field3211.method8168(arg3);
                field568.method2642(var12);
            }
        }
        if (arg2 == 50) {
            class92 var13 = field613[arg3];
            if (var13 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var14 = class296.method3619(class294.field3103, field568.field1380);
                var14.field3211.method8113(field740.method3791(82) ? 1 : 0);
                var14.field3211.method8169(arg3);
                field568.method2642(var14);
            }
        }
        if (arg2 == 15) {
            class92 var15 = field613[arg3];
            if (var15 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var16 = class296.method3619(class294.field3189, field568.field1380);
                var16.field3211.method8114(arg3);
                var16.field3211.method8139(Statics.field480);
                var16.field3211.method8114(field671);
                var16.field3211.method8220(field670);
                var16.field3211.method8159(field740.method3791(82) ? 1 : 0);
                field568.method2642(var16);
            }
        }
        if (arg2 == 26) {
            method657();
        }
        if (arg2 == 49) {
            class92 var17 = field613[arg3];
            if (var17 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var18 = class296.method3619(class294.field3185, field568.field1380);
                var18.field3211.method8171(field740.method3791(82) ? 1 : 0);
                var18.field3211.method8114(arg3);
                field568.method2642(var18);
            }
        }
        if (arg2 == 29) {
            class296 var19 = class296.method3619(class294.field3127, field568.field1380);
            var19.field3211.method8270(arg1);
            field568.method2642(var19);
            class330 var20 = class330.method1746(arg1);
            if (var20 != null && var20.field3625 != null && var20.field3625[0][0] == 5) {
                int var21 = var20.field3625[0][1];
                if (class320.field3514[var21] != var20.field3746[0]) {
                    class320.field3514[var21] = var20.field3746[0];
                    method6769(var21);
                }
            }
        }
        if (arg2 == 19) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var22 = class296.method3619(class294.field3172, field568.field1380);
            var22.field3211.method8220(arg3);
            var22.field3211.method8169(Statics.field1302 + arg1);
            var22.field3211.method8169(Statics.field2380 + arg0);
            var22.field3211.method8113(field740.method3791(82) ? 1 : 0);
            field568.method2642(var22);
        }
        if (arg2 == 10) {
            class100 var23 = field563[arg3];
            if (var23 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var24 = class296.method3619(class294.field3169, field568.field1380);
                var24.field3211.method8171(field740.method3791(82) ? 1 : 0);
                var24.field3211.method8220(arg3);
                field568.method2642(var24);
            }
        }
        if (arg2 == 13) {
            class100 var25 = field563[arg3];
            if (var25 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var26 = class296.method3619(class294.field3192, field568.field1380);
                var26.field3211.method8220(arg3);
                var26.field3211.method8159(field740.method3791(82) ? 1 : 0);
                field568.method2642(var26);
            }
        }
        if (arg2 == 47) {
            class92 var27 = field613[arg3];
            if (var27 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var28 = class296.method3619(class294.field3136, field568.field1380);
                var28.field3211.method8220(arg3);
                var28.field3211.method8159(field740.method3791(82) ? 1 : 0);
                field568.method2642(var28);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field479.method7738(arg2, arg3, new class321(arg0), new class321(arg1));
        }
        if (arg2 == 16) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var29 = class296.method3619(class294.field3176, field568.field1380);
            var29.field3211.method8181(Statics.field475);
            var29.field3211.method8114(Statics.field2380 + arg0);
            var29.field3211.method8168(Statics.field1821);
            var29.field3211.method8159(field740.method3791(82) ? 1 : 0);
            var29.field3211.method8114(Statics.field1302 + arg1);
            var29.field3211.method8168(arg3);
            var29.field3211.method8169(Statics.field2620);
            field568.method2642(var29);
        }
        if (arg2 == 7) {
            class100 var30 = field563[arg3];
            if (var30 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var31 = class296.method3619(class294.field3138, field568.field1380);
                var31.field3211.method8171(field740.method3791(82) ? 1 : 0);
                var31.field3211.method8139(Statics.field475);
                var31.field3211.method8168(Statics.field1821);
                var31.field3211.method8114(Statics.field2620);
                var31.field3211.method8114(arg3);
                field568.method2642(var31);
            }
        }
        if (arg2 == 4) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var32 = class296.method3619(class294.field3187, field568.field1380);
            var32.field3211.method8168(Statics.field2380 + arg0);
            var32.field3211.method8168(Statics.field1302 + arg1);
            var32.field3211.method8171(field740.method3791(82) ? 1 : 0);
            var32.field3211.method8169(arg3);
            field568.method2642(var32);
        }
        if (arg2 == 22) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var33 = class296.method3619(class294.field3182, field568.field1380);
            var33.field3211.method8220(arg3);
            var33.field3211.method8160(field740.method3791(82) ? 1 : 0);
            var33.field3211.method8169(Statics.field1302 + arg1);
            var33.field3211.method8169(Statics.field2380 + arg0);
            field568.method2642(var33);
        }
        if (arg2 == 23) {
            if (field650) {
                Statics.field238.method4192();
            } else {
                Statics.field238.method4191(Statics.field1882, arg0, arg1, true);
            }
        }
        if (arg2 == 11) {
            class100 var34 = field563[arg3];
            if (var34 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var35 = class296.method3619(class294.field3152, field568.field1380);
                var35.field3211.method8171(field740.method3791(82) ? 1 : 0);
                var35.field3211.method8114(arg3);
                field568.method2642(var35);
            }
        }
        if (arg2 == 24) {
            class330 var36 = class330.method1746(arg1);
            if (var36 != null) {
                boolean var37 = true;
                if (var36.field3607 > 0) {
                    var37 = method3716(var36);
                }
                if (var37) {
                    class296 var38 = class296.method3619(class294.field3127, field568.field1380);
                    var38.field3211.method8270(arg1);
                    field568.method2642(var38);
                }
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class330 var39 = class330.method3049(arg1, arg0);
            if (var39 != null) {
                method3256(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 21) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var40 = class296.method3619(class294.field3101, field568.field1380);
            var40.field3211.method8169(Statics.field2380 + arg0);
            var40.field3211.method8160(field740.method3791(82) ? 1 : 0);
            var40.field3211.method8220(arg3);
            var40.field3211.method8169(Statics.field1302 + arg1);
            field568.method2642(var40);
        }
        if (arg2 == 2) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var41 = class296.method3619(class294.field3116, field568.field1380);
            var41.field3211.method8114(field670);
            var41.field3211.method8169(field671);
            var41.field3211.method8114(arg3);
            var41.field3211.method8169(Statics.field1302 + arg1);
            var41.field3211.method8159(field740.method3791(82) ? 1 : 0);
            var41.field3211.method8169(Statics.field2380 + arg0);
            var41.field3211.method8139(Statics.field480);
            field568.method2642(var41);
        }
        if (arg2 == 1002) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            class296 var42 = class296.method3619(class294.field3195, field568.field1380);
            var42.field3211.method8168(arg3);
            field568.method2642(var42);
        }
        if (arg2 == 51) {
            class92 var43 = field613[arg3];
            if (var43 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var44 = class296.method3619(class294.field3142, field568.field1380);
                var44.field3211.method8168(arg3);
                var44.field3211.method8113(field740.method3791(82) ? 1 : 0);
                field568.method2642(var44);
            }
        }
        if (arg2 == 12) {
            class100 var45 = field563[arg3];
            if (var45 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var46 = class296.method3619(class294.field3156, field568.field1380);
                var46.field3211.method8159(field740.method3791(82) ? 1 : 0);
                var46.field3211.method8220(arg3);
                field568.method2642(var46);
            }
        }
        if (arg2 == 3) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var47 = class296.method3619(class294.field3157, field568.field1380);
            var47.field3211.method8168(arg3);
            var47.field3211.method8169(Statics.field1302 + arg1);
            var47.field3211.method8160(field740.method3791(82) ? 1 : 0);
            var47.field3211.method8169(Statics.field2380 + arg0);
            field568.method2642(var47);
        }
        if (arg2 == 14) {
            class92 var48 = field613[arg3];
            if (var48 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var49 = class296.method3619(class294.field3148, field568.field1380);
                var49.field3211.method8160(field740.method3791(82) ? 1 : 0);
                var49.field3211.method8181(Statics.field475);
                var49.field3211.method8168(Statics.field2620);
                var49.field3211.method8168(Statics.field1821);
                var49.field3211.method8169(arg3);
                field568.method2642(var49);
            }
        }
        if (arg2 == 46) {
            class92 var50 = field613[arg3];
            if (var50 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var51 = class296.method3619(class294.field3186, field568.field1380);
                var51.field3211.method8168(arg3);
                var51.field3211.method8171(field740.method3791(82) ? 1 : 0);
                field568.method2642(var51);
            }
        }
        if (arg2 == 1) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var52 = class296.method3619(class294.field3133, field568.field1380);
            var52.field3211.method8182(Statics.field475);
            var52.field3211.method8169(Statics.field2620);
            var52.field3211.method8220(Statics.field1302 + arg1);
            var52.field3211.method8220(arg3);
            var52.field3211.method8168(Statics.field1821);
            var52.field3211.method8169(Statics.field2380 + arg0);
            var52.field3211.method8171(field740.method3791(82) ? 1 : 0);
            field568.method2642(var52);
        }
        if (arg2 == 18) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var53 = class296.method3619(class294.field3158, field568.field1380);
            var53.field3211.method8168(arg3);
            var53.field3211.method8169(Statics.field1302 + arg1);
            var53.field3211.method8220(Statics.field2380 + arg0);
            var53.field3211.method8113(field740.method3791(82) ? 1 : 0);
            field568.method2642(var53);
        }
        if (arg2 == 20) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var54 = class296.method3619(class294.field3110, field568.field1380);
            var54.field3211.method8169(arg3);
            var54.field3211.method8220(Statics.field1302 + arg1);
            var54.field3211.method8113(field740.method3791(82) ? 1 : 0);
            var54.field3211.method8114(Statics.field2380 + arg0);
            field568.method2642(var54);
        }
        if (arg2 == 28) {
            class296 var55 = class296.method3619(class294.field3127, field568.field1380);
            var55.field3211.method8270(arg1);
            field568.method2642(var55);
            class330 var56 = class330.method1746(arg1);
            if (var56 != null && var56.field3625 != null && var56.field3625[0][0] == 5) {
                int var57 = var56.field3625[0][1];
                class320.field3514[var57] = 1 - class320.field3514[var57];
                method6769(var57);
            }
        }
        if (arg2 == 58) {
            class330 var58 = class330.method3049(arg1, arg0);
            if (var58 != null) {
                if (var58.field3740 != null) {
                    class88 var59 = new class88();
                    var59.field1061 = var58;
                    var59.field1064 = arg3;
                    var59.field1068 = arg6;
                    var59.field1067 = var58.field3740;
                    class71.method3233(var59);
                }
                class296 var60 = class296.method3619(class294.field3160, field568.field1380);
                var60.field3211.method8220(field670);
                var60.field3211.method8169(arg0);
                var60.field3211.method8220(field671);
                var60.field3211.method8169(arg4);
                var60.field3211.method8139(arg1);
                var60.field3211.method8181(Statics.field480);
                field568.method2642(var60);
            }
        }
        if (arg2 == 6) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var61 = class296.method3619(class294.field3162, field568.field1380);
            var61.field3211.method8169(Statics.field1302 + arg1);
            var61.field3211.method8168(Statics.field2380 + arg0);
            var61.field3211.method8113(field740.method3791(82) ? 1 : 0);
            var61.field3211.method8220(arg3);
            field568.method2642(var61);
        }
        if (arg2 == 25) {
            class330 var62 = class330.method3049(arg1, arg0);
            if (var62 != null) {
                method7081();
                method7116(arg1, arg0, class331.method2309(method6005(var62)), arg4);
                field667 = 0;
                field672 = method2742(var62);
                if (field672 == null) {
                    field672 = class350.field3887;
                }
                if (var62.field3662) {
                    field717 = var62.field3590 + class101.method6013(16777215);
                } else {
                    field717 = class101.method6013(65280) + var62.field3732 + class101.method6013(16777215);
                }
            }
            return;
        }
        if (arg2 == 1003) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            class100 var63 = field563[arg3];
            if (var63 != null) {
                class195 var64 = var63.field1292;
                if (var64.field2022 != null) {
                    var64 = var64.method3404();
                }
                if (var64 != null) {
                    class296 var65 = class296.method3619(class294.field3104, field568.field1380);
                    var65.field3211.method8220(var64.field1999);
                    field568.method2642(var65);
                }
            }
        }
        if (arg2 == 1001) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var66 = class296.method3619(class294.field3146, field568.field1380);
            var66.field3211.method8159(field740.method3791(82) ? 1 : 0);
            var66.field3211.method8169(Statics.field1302 + arg1);
            var66.field3211.method8114(Statics.field2380 + arg0);
            var66.field3211.method8168(arg3);
            field568.method2642(var66);
        }
        if (arg2 == 30 && field679 == null) {
            method3996(arg1, arg0);
            field679 = class330.method3049(arg1, arg0);
            method2632(field679);
        }
        if (arg2 == 1004) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            class296 var67 = class296.method3619(class294.field3108, field568.field1380);
            var67.field3211.method8220(arg3);
            var67.field3211.method8168(Statics.field1302 + arg1);
            var67.field3211.method8169(Statics.field2380 + arg0);
            field568.method2642(var67);
        }
        if (arg2 == 17) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var68 = class296.method3619(class294.field3145, field568.field1380);
            var68.field3211.method8114(Statics.field1302 + arg1);
            var68.field3211.method8168(field670);
            var68.field3211.method8181(Statics.field480);
            var68.field3211.method8220(field671);
            var68.field3211.method8113(field740.method3791(82) ? 1 : 0);
            var68.field3211.method8220(arg3);
            var68.field3211.method8168(Statics.field2380 + arg0);
            field568.method2642(var68);
        }
        if (arg2 == 48) {
            class92 var69 = field613[arg3];
            if (var69 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var70 = class296.method3619(class294.field3109, field568.field1380);
                var70.field3211.method8169(arg3);
                var70.field3211.method8113(field740.method3791(82) ? 1 : 0);
                field568.method2642(var70);
            }
        }
        if (arg2 == 8) {
            class100 var71 = field563[arg3];
            if (var71 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var72 = class296.method3619(class294.field3114, field568.field1380);
                var72.field3211.method8220(arg3);
                var72.field3211.method8182(Statics.field480);
                var72.field3211.method8171(field740.method3791(82) ? 1 : 0);
                var72.field3211.method8168(field671);
                var72.field3211.method8220(field670);
                field568.method2642(var72);
            }
        }
        if (arg2 == 5) {
            field622 = arg7;
            field623 = arg8;
            field625 = 2;
            field576 = 0;
            field753 = arg0;
            field754 = arg1;
            class296 var73 = class296.method3619(class294.field3155, field568.field1380);
            var73.field3211.method8169(arg3);
            var73.field3211.method8169(Statics.field2380 + arg0);
            var73.field3211.method8171(field740.method3791(82) ? 1 : 0);
            var73.field3211.method8220(Statics.field1302 + arg1);
            field568.method2642(var73);
        }
        if (arg2 == 9) {
            class100 var74 = field563[arg3];
            if (var74 != null) {
                field622 = arg7;
                field623 = arg8;
                field625 = 2;
                field576 = 0;
                field753 = arg0;
                field754 = arg1;
                class296 var75 = class296.method3619(class294.field3132, field568.field1380);
                var75.field3211.method8113(field740.method3791(82) ? 1 : 0);
                var75.field3211.method8168(arg3);
                field568.method2642(var75);
            }
        }
        if (field667 != 0) {
            field667 = 0;
            method2632(class330.method1746(Statics.field475));
        }
        if (field669) {
            method7081();
        }
    }

    @ObfuscatedName("br.kv(ILjava/lang/String;I)V")
    public static void method821(int arg0, String arg1) {
        int var2 = class107.field1332;
        int[] var3 = class107.field1335;
        boolean var4 = false;
        class525 var5 = new class525(arg1, Statics.field3059);
        for (int var6 = 0; var6 < var2; var6++) {
            class92 var7 = field613[var3[var6]];
            if (var7 != null && Statics.field971 != var7 && var7.field1112 != null && var7.field1112.equals(var5)) {
                if (arg0 == 1) {
                    class296 var8 = class296.method3619(class294.field3166, field568.field1380);
                    var8.field3211.method8160(0);
                    var8.field3211.method8168(var3[var6]);
                    field568.method2642(var8);
                } else if (arg0 == 4) {
                    class296 var9 = class296.method3619(class294.field3136, field568.field1380);
                    var9.field3211.method8220(var3[var6]);
                    var9.field3211.method8159(0);
                    field568.method2642(var9);
                } else if (arg0 == 6) {
                    class296 var10 = class296.method3619(class294.field3185, field568.field1380);
                    var10.field3211.method8171(0);
                    var10.field3211.method8114(var3[var6]);
                    field568.method2642(var10);
                } else if (arg0 == 7) {
                    class296 var11 = class296.method3619(class294.field3103, field568.field1380);
                    var11.field3211.method8113(0);
                    var11.field3211.method8169(var3[var6]);
                    field568.method2642(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class110.method1047(4, "", class350.field4042 + arg1);
        }
    }

    @ObfuscatedName("qf.ks(IIIIB)V")
    public static void method7116(int arg0, int arg1, int arg2, int arg3) {
        class330 var4 = class330.method3049(arg0, arg1);
        if (var4 != null && var4.field3701 != null) {
            class88 var5 = new class88();
            var5.field1061 = var4;
            var5.field1067 = var4.field3701;
            class71.method3233(var5);
        }
        field671 = arg3;
        field669 = true;
        Statics.field480 = arg0;
        field670 = arg1;
        Statics.field1465 = arg2;
        method2632(var4);
    }

    @ObfuscatedName("pr.kw(I)V")
    public static void method7081() {
        if (!field669) {
            return;
        }
        class330 var0 = class330.method3049(Statics.field480, field670);
        if (var0 != null && var0.field3702 != null) {
            class88 var1 = new class88();
            var1.field1061 = var0;
            var1.field1067 = var0.field3702;
            class71.method3233(var1);
        }
        field671 = -1;
        field669 = false;
        method2632(var0);
    }

    @ObfuscatedName("ia.kh(IIS)V")
    public static void method3996(int arg0, int arg1) {
        class296 var2 = class296.method3619(class294.field3165, field568.field1380);
        var2.field3211.method8270(arg0);
        var2.field3211.method8168(arg1);
        field568.method2642(var2);
    }

    @ObfuscatedName("hk.km(IIIILjava/lang/String;I)V")
    public static void method3256(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class330 var5 = class330.method3049(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3637 != null) {
            class88 var6 = new class88();
            var6.field1061 = var5;
            var6.field1064 = arg0;
            var6.field1068 = arg4;
            var6.field1067 = var5.field3637;
            class71.method3233(var6);
        }
        boolean var7 = true;
        if (var5.field3607 > 0) {
            var7 = method3716(var5);
        }
        if (!var7 || !class331.method1063(method6005(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class296 var8 = class296.method3619(class294.field3191, field568.field1380);
            var8.field3211.method8270(arg1);
            var8.field3211.method8114(arg2);
            var8.field3211.method8114(arg3);
            field568.method2642(var8);
        }
        if (arg0 == 2) {
            class296 var9 = class296.method3619(class294.field3117, field568.field1380);
            var9.field3211.method8270(arg1);
            var9.field3211.method8114(arg2);
            var9.field3211.method8114(arg3);
            field568.method2642(var9);
        }
        if (arg0 == 3) {
            class296 var10 = class296.method3619(class294.field3113, field568.field1380);
            var10.field3211.method8270(arg1);
            var10.field3211.method8114(arg2);
            var10.field3211.method8114(arg3);
            field568.method2642(var10);
        }
        if (arg0 == 4) {
            class296 var11 = class296.method3619(class294.field3128, field568.field1380);
            var11.field3211.method8270(arg1);
            var11.field3211.method8114(arg2);
            var11.field3211.method8114(arg3);
            field568.method2642(var11);
        }
        if (arg0 == 5) {
            class296 var12 = class296.method3619(class294.field3123, field568.field1380);
            var12.field3211.method8270(arg1);
            var12.field3211.method8114(arg2);
            var12.field3211.method8114(arg3);
            field568.method2642(var12);
        }
        if (arg0 == 6) {
            class296 var13 = class296.method3619(class294.field3100, field568.field1380);
            var13.field3211.method8270(arg1);
            var13.field3211.method8114(arg2);
            var13.field3211.method8114(arg3);
            field568.method2642(var13);
        }
        if (arg0 == 7) {
            class296 var14 = class296.method3619(class294.field3144, field568.field1380);
            var14.field3211.method8270(arg1);
            var14.field3211.method8114(arg2);
            var14.field3211.method8114(arg3);
            field568.method2642(var14);
        }
        if (arg0 == 8) {
            class296 var15 = class296.method3619(class294.field3102, field568.field1380);
            var15.field3211.method8270(arg1);
            var15.field3211.method8114(arg2);
            var15.field3211.method8114(arg3);
            field568.method2642(var15);
        }
        if (arg0 == 9) {
            class296 var16 = class296.method3619(class294.field3130, field568.field1380);
            var16.field3211.method8270(arg1);
            var16.field3211.method8114(arg2);
            var16.field3211.method8114(arg3);
            field568.method2642(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class296 var17 = class296.method3619(class294.field3137, field568.field1380);
        var17.field3211.method8270(arg1);
        var17.field3211.method8114(arg2);
        var17.field3211.method8114(arg3);
        field568.method2642(var17);
    }

    @ObfuscatedName("do.kr(I)V")
    public static final void method2164() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field651 - 1; var1++) {
                if (field714[var1] < 1000 && field714[var1 + 1] > 1000) {
                    String var2 = field658[var1];
                    field658[var1] = field658[var1 + 1];
                    field658[var1 + 1] = var2;
                    String var3 = field657[var1];
                    field657[var1] = field657[var1 + 1];
                    field657[var1 + 1] = var3;
                    int var4 = field714[var1];
                    field714[var1] = field714[var1 + 1];
                    field714[var1 + 1] = var4;
                    int var5 = field652[var1];
                    field652[var1] = field652[var1 + 1];
                    field652[var1 + 1] = var5;
                    int var6 = field730[var1];
                    field730[var1] = field730[var1 + 1];
                    field730[var1 + 1] = var6;
                    int var7 = field655[var1];
                    field655[var1] = field655[var1 + 1];
                    field655[var1 + 1] = var7;
                    int var8 = field656[var1];
                    field656[var1] = field656[var1 + 1];
                    field656[var1 + 1] = var8;
                    boolean var9 = field659[var1];
                    field659[var1] = field659[var1 + 1];
                    field659[var1 + 1] = var9;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("fw.kb(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2926(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method4997(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("bc.ku(Ljava/lang/String;Ljava/lang/String;IIIIIB)V")
    public static final void method384(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method4997(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("kh.kg(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method4997(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field650 || field651 >= 500) {
            return;
        }
        field657[field651] = arg0;
        field658[field651] = arg1;
        field714[field651] = arg2;
        field655[field651] = arg3;
        field652[field651] = arg4;
        field730[field651] = arg5;
        field656[field651] = arg6;
        field659[field651] = arg7;
        field651++;
    }

    @ObfuscatedName("fm.kn(I)I")
    public static final int method2872() {
        return field651 - 1;
    }

    @ObfuscatedName("ga.ko(IIIIS)V")
    public static final void method3088(int arg0, int arg1, int arg2, int arg3) {
        if (field667 == 0 && !field669) {
            method2926(class350.field4048, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class240.field2770;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = class240.method3097(var4);
                    class92 var14 = field613[field641];
                    method9(var14, field641, var11, var13);
                }
                return;
            }
            long var15 = class240.field2773[var8];
            if (var6 != var15) {
                label309: {
                    var6 = var15;
                    int var19 = class240.method178(var8);
                    int var20 = class240.method3097(class240.field2773[var8]);
                    int var21 = var20;
                    int var22 = class240.method2878(var8);
                    int var23 = class240.method7324(var8);
                    if (var22 == 2 && Statics.field238.method4182(Statics.field1882, var19, var20, var15) >= 0) {
                        class205 var24 = class205.method3219(var23);
                        if (var24.field2152 != null) {
                            var24 = var24.method3578();
                        }
                        if (var24 == null) {
                            break label309;
                        }
                        class94 var25 = null;
                        for (class94 var26 = (class94) field643.method6309(); var26 != null; var26 = (class94) field643.method6311()) {
                            if (Statics.field1882 == var26.field1139 && var26.field1136 == var19 && var26.field1146 == var21 && var26.field1149 == var23) {
                                var25 = var26;
                                break;
                            }
                        }
                        if (field667 == 1) {
                            method2926(class350.field4043, field668 + " " + class101.field1293 + " " + class101.method6013(65535) + var24.field2155, 1, var23, var19, var21);
                        } else if (!field669) {
                            String[] var27 = var24.field2172;
                            if (var27 != null) {
                                for (int var28 = 4; var28 >= 0; var28--) {
                                    if ((var25 == null || var25.method2238(var28)) && var27[var28] != null) {
                                        short var29 = 0;
                                        if (var28 == 0) {
                                            var29 = 3;
                                        }
                                        if (var28 == 1) {
                                            var29 = 4;
                                        }
                                        if (var28 == 2) {
                                            var29 = 5;
                                        }
                                        if (var28 == 3) {
                                            var29 = 6;
                                        }
                                        if (var28 == 4) {
                                            var29 = 1001;
                                        }
                                        method2926(var27[var28], class101.method6013(65535) + var24.field2155, var29, var23, var19, var21);
                                    }
                                }
                            }
                            method2926(class350.field4044, class101.method6013(65535) + var24.field2155, 1002, var24.field2168, var19, var21);
                        } else if ((Statics.field1465 & 0x4) == 4) {
                            method2926(field672, field717 + " " + class101.field1293 + " " + class101.method6013(65535) + var24.field2155, 2, var23, var19, var21);
                        }
                    }
                    if (var22 == 1) {
                        class100 var30 = field563[var23];
                        if (var30 == null) {
                            break label309;
                        }
                        if (var30.field1292.field2029 == 1 && (var30.field1163 & 0x7F) == 64 && (var30.field1153 & 0x7F) == 64) {
                            for (int var31 = 0; var31 < field542; var31++) {
                                class100 var32 = field563[field540[var31]];
                                if (var32 != null && var30 != var32 && var32.field1292.field2029 == 1 && var30.field1163 == var32.field1163 && var30.field1153 == var32.field1153) {
                                    method6275(var32, field540[var31], var19, var21);
                                }
                            }
                            int var33 = class107.field1332;
                            int[] var34 = class107.field1335;
                            for (int var35 = 0; var35 < var33; var35++) {
                                class92 var36 = field613[var34[var35]];
                                if (var36 != null && var30.field1163 == var36.field1163 && var30.field1153 == var36.field1153) {
                                    method9(var36, var34[var35], var19, var21);
                                }
                            }
                        }
                        method6275(var30, var23, var19, var21);
                    }
                    if (var22 == 0) {
                        class92 var37 = field613[var23];
                        if (var37 == null) {
                            break label309;
                        }
                        if ((var37.field1163 & 0x7F) == 64 && (var37.field1153 & 0x7F) == 64) {
                            for (int var38 = 0; var38 < field542; var38++) {
                                class100 var39 = field563[field540[var38]];
                                if (var39 != null && var39.field1292.field2029 == 1 && var37.field1163 == var39.field1163 && var37.field1153 == var39.field1153) {
                                    method6275(var39, field540[var38], var19, var21);
                                }
                            }
                            int var40 = class107.field1332;
                            int[] var41 = class107.field1335;
                            for (int var42 = 0; var42 < var40; var42++) {
                                class92 var43 = field613[var41[var42]];
                                if (var43 != null && var37 != var43 && var37.field1163 == var43.field1163 && var37.field1153 == var43.field1153) {
                                    method9(var43, var41[var42], var19, var21);
                                }
                            }
                        }
                        if (field641 == var23) {
                            var4 = var15;
                        } else {
                            method9(var37, var23, var19, var21);
                        }
                    }
                    if (var22 == 3) {
                        class376 var44 = field642[Statics.field1882][var19][var21];
                        if (var44 != null) {
                            for (class104 var45 = (class104) var44.method6310(); var45 != null; var45 = (class104) var44.method6339()) {
                                class206 var46 = class206.method5155(var45.field1319);
                                if (field667 == 1) {
                                    method2926(class350.field4043, field668 + " " + class101.field1293 + " " + class101.method6013(16748608) + var46.field2208, 16, var45.field1319, var19, var21);
                                } else if (!field669) {
                                    String[] var47 = var46.field2205;
                                    for (int var48 = 4; var48 >= 0; var48--) {
                                        if (var45.method2524(var48)) {
                                            if (var47 != null && var47[var48] != null) {
                                                byte var49 = 0;
                                                if (var48 == 0) {
                                                    var49 = 18;
                                                }
                                                if (var48 == 1) {
                                                    var49 = 19;
                                                }
                                                if (var48 == 2) {
                                                    var49 = 20;
                                                }
                                                if (var48 == 3) {
                                                    var49 = 21;
                                                }
                                                if (var48 == 4) {
                                                    var49 = 22;
                                                }
                                                method2926(var47[var48], class101.method6013(16748608) + var46.field2208, var49, var45.field1319, var19, var21);
                                            } else if (var48 == 2) {
                                                method2926(class350.field3880, class101.method6013(16748608) + var46.field2208, 20, var45.field1319, var19, var21);
                                            }
                                        }
                                    }
                                    method2926(class350.field4044, class101.method6013(16748608) + var46.field2208, 1004, var45.field1319, var19, var21);
                                } else if ((Statics.field1465 & 0x1) == 1) {
                                    method2926(field672, field717 + " " + class101.field1293 + " " + class101.method6013(16748608) + var46.field2208, 17, var45.field1319, var19, var21);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("oj.kt(Lde;IIIB)V")
    public static final void method6275(class100 arg0, int arg1, int arg2, int arg3) {
        class195 var4 = arg0.field1292;
        if (field651 >= 400) {
            return;
        }
        if (var4.field2022 != null) {
            var4 = var4.method3404();
        }
        if (var4 == null || !var4.field2001 || var4.field2032 && field683 != arg1) {
            return;
        }
        String var5 = arg0.method2439();
        if (var4.field2025 != 0 && arg0.field1228 != 0) {
            int var6 = arg0.field1228 == -1 ? var4.field2025 : arg0.field1228;
            int var8 = Statics.field971.field1104;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class101.method6013(16711680);
            } else if (var9 < -6) {
                var10 = class101.method6013(16723968);
            } else if (var9 < -3) {
                var10 = class101.method6013(16740352);
            } else if (var9 < 0) {
                var10 = class101.method6013(16756736);
            } else if (var9 > 9) {
                var10 = class101.method6013(65280);
            } else if (var9 > 6) {
                var10 = class101.method6013(4259584);
            } else if (var9 > 3) {
                var10 = class101.method6013(8453888);
            } else if (var9 > 0) {
                var10 = class101.method6013(12648192);
            } else {
                var10 = class101.method6013(16776960);
            }
            var5 = var5 + var10 + " " + class101.field1296 + class350.field4049 + var6 + class101.field1297;
        }
        if (var4.field2032 && field660) {
            method2926(class350.field4044, class101.method6013(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field667 == 1) {
            method2926(class350.field4043, field668 + " " + class101.field1293 + " " + class101.method6013(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field669) {
            int var11 = var4.field2032 && field660 ? 2000 : 0;
            String[] var12 = var4.field2023;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (arg0.method2454(var13) && var12[var13] != null && !var12[var13].equalsIgnoreCase(class350.field4045)) {
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
                        method2926(var12[var13], class101.method6013(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (arg0.method2454(var15) && var12[var15] != null && var12[var15].equalsIgnoreCase(class350.field4045)) {
                        short var16 = 0;
                        if (field797 != class103.field1311) {
                            if (field797 == class103.field1310 || field797 == class103.field1312 && var4.field2025 > Statics.field971.field1104) {
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
                            method2926(var12[var15], class101.method6013(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2032 || !field660) {
                method2926(class350.field4044, class101.method6013(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1465 & 0x2) == 2) {
            method2926(field672, field717 + " " + class101.field1293 + " " + class101.method6013(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("an.ki(Ldh;IIII)V")
    public static final void method9(class92 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field971 == arg0 || field651 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1105 == 0) {
            String var4 = arg0.field1120[0] + arg0.field1112 + arg0.field1120[1];
            int var5 = arg0.field1104;
            int var6 = Statics.field971.field1104;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class101.method6013(16711680);
            } else if (var7 < -6) {
                var8 = class101.method6013(16723968);
            } else if (var7 < -3) {
                var8 = class101.method6013(16740352);
            } else if (var7 < 0) {
                var8 = class101.method6013(16756736);
            } else if (var7 > 9) {
                var8 = class101.method6013(65280);
            } else if (var7 > 6) {
                var8 = class101.method6013(4259584);
            } else if (var7 > 3) {
                var8 = class101.method6013(8453888);
            } else if (var7 > 0) {
                var8 = class101.method6013(12648192);
            } else {
                var8 = class101.method6013(16776960);
            }
            var9 = var4 + var8 + " " + class101.field1296 + class350.field4049 + arg0.field1104 + class101.field1297 + arg0.field1120[2];
        } else {
            var9 = arg0.field1120[0] + arg0.field1112 + arg0.field1120[1] + " " + class101.field1296 + class350.field4050 + arg0.field1105 + class101.field1297 + arg0.field1120[2];
        }
        if (field667 == 1) {
            method2926(class350.field4043, field668 + " " + class101.field1293 + " " + class101.method6013(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field669) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field721[var10] != null) {
                    short var11 = 0;
                    if (field721[var10].equalsIgnoreCase(class350.field4045)) {
                        if (field533 == class103.field1311) {
                            continue;
                        }
                        if (field533 == class103.field1310 || field533 == class103.field1312 && arg0.field1104 > Statics.field971.field1104) {
                            var11 = 2000;
                        }
                        if (Statics.field971.field1118 == 0 || arg0.field1118 == 0) {
                            if (field533 == class103.field1308 && arg0.method2182()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field971.field1118 == arg0.field1118) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field639[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field676[var10] + var11;
                    method2926(field721[var10], class101.method6013(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1465 & 0x8) == 8) {
            method2926(field672, field717 + " " + class101.field1293 + " " + class101.method6013(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field651; var14++) {
            if (field714[var14] == 23) {
                field658[var14] = class101.method6013(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("im.ke(IIIIIIIII)V")
    public static final void method4352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class330.method1447(arg0)) {
            Statics.field1576 = null;
            method3181(Statics.field84[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1576 != null) {
                method3181(Statics.field1576, -1412584499, arg1, arg2, arg3, arg4, Statics.field912, Statics.field1826, arg7);
                Statics.field1576 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field724[var8] = true;
            }
        } else {
            field724[arg7] = true;
        }
    }

    @ObfuscatedName("gr.kp([Lmb;IIIIIIIIS)V")
    public static final void method3181(class330[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class511.method8523(arg2, arg3, arg4, arg5);
        class226.method4022();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class330 var10 = arg0[var9];
            if (var10 != null && (var10.field3622 == arg1 || arg1 == -1412584499 && field771 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field727[field722] = var10.field3616 + arg6;
                    field793[field722] = var10.field3626 + arg7;
                    field729[field722] = var10.field3618;
                    field538[field722] = var10.field3735;
                    var11 = ++field722 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3605 = var11;
                var10.field3748 = field506;
                if (!var10.field3662 || !method2734(var10)) {
                    if (var10.field3607 > 0) {
                        method651(var10);
                    }
                    int var12 = var10.field3616 + arg6;
                    int var13 = var10.field3626 + arg7;
                    int var14 = var10.field3639;
                    if (field771 == var10) {
                        if (arg1 != -1412584499 && !var10.field3711) {
                            Statics.field1576 = arg0;
                            Statics.field912 = arg6;
                            Statics.field1826 = arg7;
                            continue;
                        }
                        if (field596 && field640) {
                            int var15 = class36.field221;
                            int var16 = class36.field229;
                            int var17 = var15 - field688;
                            int var18 = var16 - field689;
                            if (var17 < field535) {
                                var17 = field535;
                            }
                            if (var10.field3618 + var17 > field535 + field687.field3618) {
                                var17 = field535 + field687.field3618 - var10.field3618;
                            }
                            if (var18 < field693) {
                                var18 = field693;
                            }
                            if (var10.field3735 + var18 > field693 + field687.field3735) {
                                var18 = field693 + field687.field3735 - var10.field3735;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3711) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3728 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3618 + var12;
                        int var22 = var10.field3735 + var13;
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
                        int var29 = var10.field3618 + var12;
                        int var30 = var10.field3735 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3662 || var25 < var27 && var26 < var28) {
                        if (var10.field3607 != 0) {
                            if (var10.field3607 == 1336) {
                                if (Statics.field48.method2330()) {
                                    var13 += 15;
                                    Statics.field4520.method6804("Fps:" + field197, var10.field3618 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field508) {
                                        var33 = 16711680;
                                    }
                                    Statics.field4520.method6804("Mem:" + var32 + "k", var10.field3618 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3607 == 1337) {
                                field663 = var12;
                                field664 = var13;
                                method4150(var12, var13, var10.field3618, var10.field3735);
                                field724[var10.field3605] = true;
                                class511.method8523(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3607 == 1338) {
                                method1021(var10, var12, var13, var11);
                                class511.method8523(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3607 == 1339) {
                                method2281(var10, var12, var13, var11);
                                class511.method8523(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3607 == 1400) {
                                Statics.field479.method7655(var12, var13, var10.field3618, var10.field3735, field506);
                            }
                            if (var10.field3607 == 1401) {
                                Statics.field479.method7658(var12, var13, var10.field3618, var10.field3735);
                            }
                            if (var10.field3607 == 1402) {
                                Statics.field2681.method2285(var12, field506);
                            }
                        }
                        if (var10.field3728 == 0) {
                            if (!var10.field3662 && method2734(var10) && Statics.field1769 != var10) {
                                continue;
                            }
                            if (!var10.field3662) {
                                if (var10.field3706 > var10.field3627 - var10.field3735) {
                                    var10.field3706 = var10.field3627 - var10.field3735;
                                }
                                if (var10.field3706 < 0) {
                                    var10.field3706 = 0;
                                }
                            }
                            method3181(arg0, var10.field3673, var25, var26, var27, var28, var12 - var10.field3641, var13 - var10.field3706, var11);
                            if (var10.field3731 != null) {
                                method3181(var10.field3731, var10.field3673, var25, var26, var27, var28, var12 - var10.field3641, var13 - var10.field3706, var11);
                            }
                            class87 var34 = (class87) field675.method7872((long) var10.field3673);
                            if (var34 != null) {
                                method4352(var34.field1057, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class511.method8523(arg2, arg3, arg4, arg5);
                            class226.method4022();
                        } else if (var10.field3728 == 11) {
                            if (method2734(var10) && Statics.field1769 != var10) {
                                continue;
                            }
                            if (var10.field3731 != null) {
                                method3181(var10.field3731, var10.field3673, var25, var26, var27, var28, var12 - var10.field3641, var13 - var10.field3706, var11);
                            }
                            class511.method8523(arg2, arg3, arg4, arg5);
                            class226.method4022();
                        }
                        if (field733 || field744[var11] || field565 > 1) {
                            if (var10.field3728 == 0 && !var10.field3662 && var10.field3627 > var10.field3735) {
                                method4651(var10.field3618 + var12, var13, var10.field3706, var10.field3735, var10.field3627);
                            }
                            if (var10.field3728 != 1) {
                                if (var10.field3728 == 3) {
                                    int var35;
                                    if (method3694(var10)) {
                                        var35 = var10.field3629;
                                        if (Statics.field1769 == var10 && var10.field3631 != 0) {
                                            var35 = var10.field3631;
                                        }
                                    } else {
                                        var35 = var10.field3630;
                                        if (Statics.field1769 == var10 && var10.field3705 != 0) {
                                            var35 = var10.field3705;
                                        }
                                    }
                                    if (var10.field3600) {
                                        switch(var10.field3633.field5102) {
                                            case 1:
                                                class511.method8469(var12, var13, var10.field3618, var10.field3735, var10.field3630, var10.field3629);
                                                break;
                                            case 2:
                                                class511.method8489(var12, var13, var10.field3618, var10.field3735, var10.field3630, var10.field3629, 255 - (var10.field3639 & 0xFF), 255 - (var10.field3635 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class511.method8468(var12, var13, var10.field3618, var10.field3735, var35);
                                                } else {
                                                    class511.method8524(var12, var13, var10.field3618, var10.field3735, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class511.method8472(var12, var13, var10.field3618, var10.field3735, var35);
                                    } else {
                                        class511.method8473(var12, var13, var10.field3618, var10.field3735, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3728 == 4) {
                                    class392 var36 = var10.method5781();
                                    if (var36 != null) {
                                        String var37 = var10.field3666;
                                        int var38;
                                        if (method3694(var10)) {
                                            var38 = var10.field3629;
                                            if (Statics.field1769 == var10 && var10.field3631 != 0) {
                                                var38 = var10.field3631;
                                            }
                                            if (var10.field3667.length() > 0) {
                                                var37 = var10.field3667;
                                            }
                                        } else {
                                            var38 = var10.field3630;
                                            if (Statics.field1769 == var10 && var10.field3705 != 0) {
                                                var38 = var10.field3705;
                                            }
                                        }
                                        if (var10.field3662 && var10.field3736 != -1) {
                                            class206 var39 = class206.method5155(var10.field3736);
                                            var37 = var39.field2208;
                                            if (var37 == null) {
                                                var37 = class350.field3887;
                                            }
                                            if ((var39.field2213 == 1 || var10.field3737 != 1) && var10.field3737 != -1) {
                                                var37 = class101.method6013(16748608) + var37 + class101.field1300 + " " + 'x' + method6006(var10.field3737);
                                            }
                                        }
                                        if (field679 == var10) {
                                            var37 = class350.field3919;
                                            var38 = var10.field3630;
                                        }
                                        if (!var10.field3662) {
                                            var37 = method2748(var37, var10);
                                        }
                                        var36.method6786(var37, var12, var13, var10.field3618, var10.field3735, var38, var10.field3671 ? 0 : -1, class455.method6566(var10.field3639), var10.field3669, var10.field3681, var10.field3588);
                                    } else if (class330.field3601) {
                                        method2632(var10);
                                    }
                                } else if (var10.field3728 == 5) {
                                    if (var10.field3662) {
                                        class515 var41;
                                        if (var10.field3736 == -1) {
                                            var41 = var10.method5776(false, Statics.field337);
                                        } else {
                                            var41 = class206.method2154(var10.field3736, var10.field3737, var10.field3643, var10.field3603, var10.field3664, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5119;
                                            int var43 = var41.field5117;
                                            if (var10.field3642) {
                                                class511.method8500(var12, var13, var10.field3618 + var12, var10.field3735 + var13);
                                                int var44 = (var10.field3618 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3735 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3683 != 0) {
                                                            var41.method8637(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3683, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method8661(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method8599(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class511.method8523(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3618 * 4096 / var42;
                                                if (var10.field3683 != 0) {
                                                    var41.method8637(var10.field3618 / 2 + var12, var10.field3735 / 2 + var13, var10.field3683, var48);
                                                } else if (var14 != 0) {
                                                    var41.method8655(var12, var13, var10.field3618, var10.field3735, 256 - (var14 & 0xFF));
                                                } else if (var10.field3618 == var42 && var10.field3735 == var43) {
                                                    var41.method8661(var12, var13);
                                                } else {
                                                    var41.method8595(var12, var13, var10.field3618, var10.field3735);
                                                }
                                            }
                                        } else if (class330.field3601) {
                                            method2632(var10);
                                        }
                                    } else {
                                        class515 var40 = var10.method5776(method3694(var10), Statics.field337);
                                        if (var40 != null) {
                                            var40.method8661(var12, var13);
                                        } else if (class330.field3601) {
                                            method2632(var10);
                                        }
                                    }
                                } else if (var10.field3728 == 6) {
                                    boolean var49 = method3694(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3652;
                                    } else {
                                        var50 = var10.field3651;
                                    }
                                    class239 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3736 != -1) {
                                        class206 var53 = class206.method5155(var10.field3736);
                                        if (var53 != null) {
                                            class206 var54 = var53.method3629(var10.field3737);
                                            var51 = var54.method3628(1);
                                            if (var51 == null) {
                                                method2632(var10);
                                            } else {
                                                var51.method4492();
                                                var52 = var51.field2621 / 2;
                                            }
                                        }
                                    } else if (var10.field3648 == 5) {
                                        if (var10.field3604 == 0) {
                                            var51 = field790.method5441((class208) null, -1, (class208) null, -1);
                                        } else {
                                            var51 = Statics.field971.method1952();
                                        }
                                    } else if (var10.field3648 == 7) {
                                        var51 = var10.field3632.method5441((class208) null, -1, class208.method4648(Statics.field971.field1158), Statics.field971.field1161);
                                    } else {
                                        class195 var55 = null;
                                        class194 var56 = null;
                                        if (var10.field3648 == 6) {
                                            int var57 = var10.field3604;
                                            if (var57 >= 0 && var57 < field563.length) {
                                                class100 var58 = field563[var57];
                                                if (var58 != null) {
                                                    var55 = var58.field1292;
                                                    var56 = var58.method2461();
                                                }
                                            }
                                        }
                                        class208 var59 = null;
                                        int var60 = -1;
                                        if (var50 != -1) {
                                            var59 = class208.method4648(var50);
                                            var60 = var10.field3738;
                                        }
                                        var51 = var10.method5802(var59, var60, var49, Statics.field971.field1100, var55, var56);
                                        if (var51 == null && class330.field3601) {
                                            method2632(var10);
                                        }
                                    }
                                    class226.method4027(var10.field3618 / 2 + var12, var10.field3735 / 2 + var13);
                                    int var61 = var10.field3658 * class226.field2523[var10.field3655] >> 16;
                                    int var62 = var10.field3658 * class226.field2520[var10.field3655] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3662) {
                                            var51.method4492();
                                            if (var10.field3680) {
                                                var51.method4434(0, var10.field3645, var10.field3657, var10.field3655, var10.field3653, var10.field3654 + var52 + var61, var10.field3654 + var62, var10.field3658);
                                            } else {
                                                var51.method4433(0, var10.field3645, var10.field3657, var10.field3655, var10.field3653, var10.field3654 + var52 + var61, var10.field3654 + var62);
                                            }
                                        } else {
                                            var51.method4433(0, var10.field3645, 0, var10.field3655, 0, var61, var62);
                                        }
                                    }
                                    class226.method4026();
                                } else {
                                    if (var10.field3728 == 8 && Statics.field100 == var10 && field666 == field665) {
                                        int var63 = 0;
                                        int var64 = 0;
                                        class392 var65 = Statics.field4520;
                                        String var66 = var10.field3666;
                                        String var67 = method2748(var66, var10);
                                        while (var67.length() > 0) {
                                            int var68 = var67.indexOf(class101.field1299);
                                            String var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = "";
                                            } else {
                                                var69 = var67.substring(0, var68);
                                                var67 = var67.substring(var68 + 4);
                                            }
                                            int var70 = var65.method6775(var69);
                                            if (var70 > var63) {
                                                var63 = var70;
                                            }
                                            var64 += var65.field4447 + 1;
                                        }
                                        var63 += 6;
                                        var64 += 7;
                                        int var71 = var10.field3618 + var12 - 5 - var63;
                                        int var72 = var10.field3735 + var13 + 5;
                                        if (var71 < var12 + 5) {
                                            var71 = var12 + 5;
                                        }
                                        if (var63 + var71 > arg4) {
                                            var71 = arg4 - var63;
                                        }
                                        if (var64 + var72 > arg5) {
                                            var72 = arg5 - var64;
                                        }
                                        class511.method8468(var71, var72, var63, var64, 16777120);
                                        class511.method8472(var71, var72, var63, var64, 0);
                                        String var73 = var10.field3666;
                                        int var74 = var65.field4447 + var72 + 2;
                                        String var75 = method2748(var73, var10);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf(class101.field1299);
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            var65.method6828(var77, var71 + 3, var74, 0, -1);
                                            var74 += var65.field4447 + 1;
                                        }
                                    }
                                    if (var10.field3728 == 9) {
                                        int var78;
                                        int var79;
                                        int var80;
                                        int var81;
                                        if (var10.field3659) {
                                            var78 = var12;
                                            var79 = var10.field3735 + var13;
                                            var80 = var10.field3618 + var12;
                                            var81 = var13;
                                        } else {
                                            var78 = var12;
                                            var79 = var13;
                                            var80 = var10.field3618 + var12;
                                            var81 = var10.field3735 + var13;
                                        }
                                        if (var10.field3636 == 1) {
                                            class511.method8478(var78, var79, var80, var81, var10.field3630);
                                        } else {
                                            method2851(var78, var79, var80, var81, var10.field3630, var10.field3636);
                                        }
                                    } else if (var10.field3728 == 12) {
                                        class328 var82 = var10.method5803();
                                        class323 var83 = var10.method5804();
                                        if (var82 != null && var83 != null && var82.method5661()) {
                                            class392 var84 = var10.method5781();
                                            if (var84 != null) {
                                                field716.method8738(var12, var13, var10.field3618, var10.field3735, var82.method5580(), var82.method5537(), var82.method5662(), var82.method5655(), var82.method5532());
                                                int var85 = var10.field3671 ? var10.field3603 : -1;
                                                if (!var82.method5530() && var82.method5586().method6766()) {
                                                    field716.method8746(var83.field3521, var85, var83.field3523, var83.field3520);
                                                    field716.method8744(var82.method5528(), var84);
                                                } else {
                                                    field716.method8746(var10.field3630, var85, var83.field3523, var83.field3520);
                                                    field716.method8744(var82.method5586(), var84);
                                                }
                                                class511.method8523(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("eq.kk(IIIIIII)V")
    public static final void method2851(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class511.field5093;
        int var18 = arg1 - class511.field5087;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class226.method4047(var19, var20, var21);
        class226.method4030(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class226.method4047(var19, var21, var22);
        class226.method4030(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("eo.kl(Ljava/lang/String;Lmb;I)Ljava/lang/String;")
    public static String method2748(String arg0, class330 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2943(arg1, var2 - 1);
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

    @ObfuscatedName("np.kd(II)Ljava/lang/String;")
    public static final String method6006(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class101.field1294 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class101.method6013(65408) + var1.substring(0, var1.length() - 8) + class350.field4054 + " " + class101.field1296 + var1 + class101.field1297 + class101.field1300;
        } else if (var1.length() > 6) {
            return " " + class101.method6013(16777215) + var1.substring(0, var1.length() - 4) + class350.field4016 + " " + class101.field1296 + var1 + class101.field1297 + class101.field1300;
        } else {
            return " " + class101.method6013(16776960) + var1 + class101.field1300;
        }
    }

    @ObfuscatedName("client.kz(ZB)V")
    public final void method1582(boolean arg0) {
        method163(field799, Statics.field4720, Statics.field3024, arg0);
    }

    @ObfuscatedName("client.lf(Lmb;B)V")
    public void method1220(class330 arg0) {
        class330 var2 = arg0.field3622 == -1 ? null : class330.method1746(arg0.field3622);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field4720;
            var4 = Statics.field3024;
        } else {
            var3 = var2.field3618;
            var4 = var2.field3735;
        }
        method794(arg0, var3, var4, false);
        method2934(arg0, var3, var4);
    }

    @ObfuscatedName("co.lt([Lmb;Lmb;ZB)V")
    public static void method2025(class330[] arg0, class330 arg1, boolean arg2) {
        int var3 = arg1.field3623 == 0 ? arg1.field3618 : arg1.field3623;
        int var4 = arg1.field3627 == 0 ? arg1.field3735 : arg1.field3627;
        method2536(arg0, arg1.field3673, var3, var4, arg2);
        if (arg1.field3731 != null) {
            method2536(arg1.field3731, arg1.field3673, var3, var4, arg2);
        }
        class87 var5 = (class87) field675.method7872((long) arg1.field3673);
        if (var5 != null) {
            method163(var5.field1057, var3, var4, arg2);
        }
        if (arg1.field3607 == 1337) {
        }
    }

    @ObfuscatedName("ad.ld(IIIZI)V")
    public static final void method163(int arg0, int arg1, int arg2, boolean arg3) {
        if (class330.method1447(arg0)) {
            method2536(Statics.field84[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ee.lx([Lmb;IIIZI)V")
    public static void method2536(class330[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class330 var6 = arg0[var5];
            if (var6 != null && var6.field3622 == arg1) {
                method794(var6, arg2, arg3, arg4);
                method2934(var6, arg2, arg3);
                if (var6.field3641 > var6.field3623 - var6.field3618) {
                    var6.field3641 = var6.field3623 - var6.field3618;
                }
                if (var6.field3641 < 0) {
                    var6.field3641 = 0;
                }
                if (var6.field3706 > var6.field3627 - var6.field3735) {
                    var6.field3706 = var6.field3627 - var6.field3735;
                }
                if (var6.field3706 < 0) {
                    var6.field3706 = 0;
                }
                if (var6.field3728 == 0) {
                    method2025(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("bv.la(Lmb;IIZI)V")
    public static void method794(class330 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3618;
        int var5 = arg0.field3735;
        if (arg0.field3610 == 0) {
            arg0.field3618 = arg0.field3614;
        } else if (arg0.field3610 == 1) {
            arg0.field3618 = arg1 - arg0.field3614;
        } else if (arg0.field3610 == 2) {
            arg0.field3618 = arg0.field3614 * arg1 >> 14;
        }
        if (arg0.field3611 == 0) {
            arg0.field3735 = arg0.field3615;
        } else if (arg0.field3611 == 1) {
            arg0.field3735 = arg2 - arg0.field3615;
        } else if (arg0.field3611 == 2) {
            arg0.field3735 = arg0.field3615 * arg2 >> 14;
        }
        if (arg0.field3610 == 4) {
            arg0.field3618 = arg0.field3735 * arg0.field3620 / arg0.field3621;
        }
        if (arg0.field3611 == 4) {
            arg0.field3735 = arg0.field3621 * arg0.field3618 / arg0.field3620;
        }
        if (arg0.field3607 == 1337) {
            field604 = arg0;
        }
        if (arg0.field3728 == 12) {
            arg0.method5803().method5484(arg0.field3618, arg0.field3735);
        }
        if (arg3 && arg0.field3724 != null && (arg0.field3618 != var4 || arg0.field3735 != var5)) {
            class88 var6 = new class88();
            var6.field1061 = arg0;
            var6.field1067 = arg0.field3724;
            field746.method6303(var6);
        }
    }

    @ObfuscatedName("ft.ln(Lmb;III)V")
    public static void method2934(class330 arg0, int arg1, int arg2) {
        if (arg0.field3677 == 0) {
            arg0.field3616 = arg0.field3713;
        } else if (arg0.field3677 == 1) {
            arg0.field3616 = (arg1 - arg0.field3618) / 2 + arg0.field3713;
        } else if (arg0.field3677 == 2) {
            arg0.field3616 = arg1 - arg0.field3618 - arg0.field3713;
        } else if (arg0.field3677 == 3) {
            arg0.field3616 = arg0.field3713 * arg1 >> 14;
        } else if (arg0.field3677 == 4) {
            arg0.field3616 = (arg0.field3713 * arg1 >> 14) + (arg1 - arg0.field3618) / 2;
        } else {
            arg0.field3616 = arg1 - arg0.field3618 - (arg0.field3713 * arg1 >> 14);
        }
        if (arg0.field3609 == 0) {
            arg0.field3626 = arg0.field3613;
        } else if (arg0.field3609 == 1) {
            arg0.field3626 = (arg2 - arg0.field3735) / 2 + arg0.field3613;
        } else if (arg0.field3609 == 2) {
            arg0.field3626 = arg2 - arg0.field3735 - arg0.field3613;
        } else if (arg0.field3609 == 3) {
            arg0.field3626 = arg0.field3613 * arg2 >> 14;
        } else if (arg0.field3609 == 4) {
            arg0.field3626 = (arg0.field3613 * arg2 >> 14) + (arg2 - arg0.field3735) / 2;
        } else {
            arg0.field3626 = arg2 - arg0.field3735 - (arg0.field3613 * arg2 >> 14);
        }
    }

    @ObfuscatedName("ai.lh(Lmb;IIIIIII)V")
    public static final void method297(class330 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field586) {
            field588 = 32;
        } else {
            field588 = 0;
        }
        field586 = false;
        if (class36.field224 == 1 || !Statics.field3402 && class36.field224 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3706 -= 4;
                method2632(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3706 += 4;
                method2632(arg0);
            } else if (arg5 >= arg1 - field588 && arg5 < field588 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3706 = (arg4 - arg3) * var8 / var9;
                method2632(arg0);
                field586 = true;
            }
        }
        if (field715 == 0) {
            return;
        }
        int var10 = arg0.field3618;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3706 += field715 * 45;
            method2632(arg0);
        }
    }

    @ObfuscatedName("jt.li(IIIIII)V")
    public static final void method4651(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field4559[0].method8564(arg0, arg1);
        Statics.field4559[1].method8564(arg0, arg1 + arg3 - 16);
        class511.method8468(arg0, arg1 + 16, 16, arg3 - 32, field583);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class511.method8468(arg0, arg1 + 16 + var6, 16, var5, field584);
        class511.method8476(arg0, arg1 + 16 + var6, var5, field800);
        class511.method8476(arg0 + 1, arg1 + 16 + var6, var5, field800);
        class511.method8474(arg0, arg1 + 16 + var6, 16, field800);
        class511.method8474(arg0, arg1 + 17 + var6, 16, field800);
        class511.method8476(arg0 + 15, arg1 + 16 + var6, var5, field585);
        class511.method8476(arg0 + 14, arg1 + 17 + var6, var5 - 1, field585);
        class511.method8474(arg0, arg1 + 15 + var6 + var5, 16, field585);
        class511.method8474(arg0 + 1, arg1 + 14 + var6 + var5, 15, field585);
    }

    @ObfuscatedName("hz.lj(Lmb;B)Z")
    public static final boolean method3694(class330 arg0) {
        if (arg0.field3729 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3729.length; var1++) {
            int var2 = method2943(arg0, var1);
            int var3 = arg0.field3746[var1];
            if (arg0.field3729[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3729[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3729[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fr.lm(Lmb;II)I")
    public static final int method2943(class330 arg0, int arg1) {
        if (arg0.field3625 == null || arg1 >= arg0.field3625.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3625[arg1];
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
                    var7 = field646[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field647[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field719[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class330 var11 = class330.method1746(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class206.method5155(var12).field2224 || field507)) {
                        for (int var13 = 0; var13 < var11.field3734.length; var13++) {
                            if (var12 + 1 == var11.field3734[var13]) {
                                var7 += var11.field3656[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class320.field3514[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class340.field3811[field647[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class320.field3514[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field971.field1104;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class340.field3812[var14]) {
                            var7 += field647[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class330 var17 = class330.method1746(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class206.method5155(var18).field2224 || field507)) {
                        for (int var19 = 0; var19 < var17.field3734.length; var19++) {
                            if (var18 + 1 == var17.field3734[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field680;
                }
                if (var6 == 12) {
                    var7 = field681;
                }
                if (var6 == 13) {
                    int var20 = class320.field3514[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class320.method5997(var22);
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
                    var7 = (Statics.field971.field1163 >> 7) + Statics.field2380;
                }
                if (var6 == 19) {
                    var7 = (Statics.field971.field1153 >> 7) + Statics.field1302;
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

    @ObfuscatedName("oo.ll(Lmb;I)V")
    public static final void method6282(class330 arg0) {
        if (arg0.field3612 == 1) {
            method384(arg0.field3733, "", 24, 0, 0, arg0.field3673, arg0.field3736);
        }
        if (arg0.field3612 == 2 && !field669) {
            String var1 = method2742(arg0);
            if (var1 != null) {
                method384(var1, class101.method6013(65280) + arg0.field3732, 25, 0, -1, arg0.field3673, arg0.field3736);
            }
        }
        if (arg0.field3612 == 3) {
            method2926(class350.field4083, "", 26, 0, 0, arg0.field3673);
        }
        if (arg0.field3612 == 4) {
            method2926(arg0.field3733, "", 28, 0, 0, arg0.field3673);
        }
        if (arg0.field3612 == 5) {
            method2926(arg0.field3733, "", 29, 0, 0, arg0.field3673);
        }
        if (arg0.field3612 == 6 && field679 == null) {
            method2926(arg0.field3733, "", 30, 0, -1, arg0.field3673);
        }
        if (!arg0.field3662) {
            return;
        }
        if (field669) {
            int var2 = method6005(arg0);
            boolean var3 = (var2 >> 21 & 0x1) != 0;
            if (var3 && (Statics.field1465 & 0x20) == 32) {
                method384(field672, field717 + " " + class101.field1293 + " " + arg0.field3590, 58, 0, arg0.field3663, arg0.field3673, arg0.field3736);
            }
            return;
        }
        for (int var4 = 9; var4 >= 5; var4--) {
            String var5 = method2957(arg0, var4);
            if (var5 != null) {
                method384(var5, arg0.field3590, 1007, var4 + 1, arg0.field3663, arg0.field3673, arg0.field3736);
            }
        }
        String var6 = method2742(arg0);
        if (var6 != null) {
            method384(var6, arg0.field3590, 25, 0, arg0.field3663, arg0.field3673, arg0.field3736);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8;
            if (!class331.method1063(method6005(arg0), var7) && arg0.field3637 == null) {
                var8 = null;
            } else if (arg0.field3684 == null || arg0.field3684.length <= var7 || arg0.field3684[var7] == null || arg0.field3684[var7].trim().length() == 0) {
                var8 = null;
            } else {
                var8 = arg0.field3684[var7];
            }
            if (var8 != null) {
                method4997(var8, arg0.field3590, 57, var7 + 1, arg0.field3663, arg0.field3673, arg0.field3736, arg0.field3752);
            }
        }
        if (class331.method3210(method6005(arg0))) {
            method2926(class350.field3885, "", 30, 0, arg0.field3663, arg0.field3673);
        }
    }

    @ObfuscatedName("er.lp(ZI)V")
    public static void method2537(boolean arg0) {
        field661 = arg0;
    }

    @ObfuscatedName("ig.ls(IIIIIIIS)V")
    public static final void method3866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class330.method1447(arg0)) {
            method2727(Statics.field84[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ep.lw([Lmb;IIIIIIII)V")
    public static final void method2727(class330[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class330 var9 = arg0[var8];
            if (var9 != null && var9.field3622 == arg1 && (var9.method5879() || method6005(var9) != 0 || field687 == var9)) {
                if (var9.field3662) {
                    if (method2734(var9)) {
                        continue;
                    }
                } else if (var9.field3728 == 0 && Statics.field1769 != var9 && method2734(var9)) {
                    continue;
                }
                if (var9.field3728 == 11) {
                    if (var9.method5800(Statics.field337)) {
                        if (var9.method5782()) {
                            method2632(var9);
                            method2025(var9.field3731, var9, true);
                        }
                        if (var9.field3704 != null) {
                            class88 var10 = new class88();
                            var10.field1061 = var9;
                            var10.field1067 = var9.field3704;
                            field746.method6303(var10);
                        }
                    }
                } else if (var9.field3728 == 12 && var9.method5852()) {
                    method2632(var9);
                }
                int var11 = var9.field3616 + arg6;
                int var12 = var9.field3626 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3728 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3618 + var11;
                    int var16 = var9.field3735 + var12;
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
                    int var23 = var9.field3618 + var11;
                    int var24 = var9.field3735 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field771 == var9) {
                    field694 = true;
                    field695 = var11;
                    field736 = var12;
                }
                boolean var25 = false;
                if (var9.field3678) {
                    switch(field518) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3673 >>> 16 == field614) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field614 == var9.field3673) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3662 || var19 < var21 && var20 < var22) {
                    if (var9.field3662) {
                        if (var9.field3750) {
                            if (class36.field221 >= var19 && class36.field229 >= var20 && class36.field221 < var21 && class36.field229 < var22) {
                                for (class88 var26 = (class88) field746.method6309(); var26 != null; var26 = (class88) field746.method6311()) {
                                    if (var26.field1063) {
                                        var26.method7560();
                                        var26.field1061.field3741 = false;
                                    }
                                }
                                method2062();
                                if (Statics.field3878 == 0) {
                                    field771 = null;
                                    field687 = null;
                                }
                                if (!field650) {
                                    method7488();
                                }
                            }
                        } else if (var9.field3751 && class36.field221 >= var19 && class36.field229 >= var20 && class36.field221 < var21 && class36.field229 < var22) {
                            for (class88 var27 = (class88) field746.method6309(); var27 != null; var27 = (class88) field746.method6311()) {
                                if (var27.field1063 && var27.field1061.field3712 == var27.field1067) {
                                    var27.method7560();
                                }
                            }
                        }
                    }
                    int var28 = class36.field221;
                    int var29 = class36.field229;
                    if (class36.field232 != 0) {
                        var28 = class36.field233;
                        var29 = class36.field234;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3607 == 1337) {
                        if (!field517 && !field650 && var30) {
                            method3088(var28, var29, var19, var20);
                        }
                    } else if (var9.field3607 == 1338) {
                        method7115(var9, var11, var12);
                    } else {
                        if (var9.field3607 == 1400) {
                            Statics.field479.method7639(class36.field221, class36.field229, var30, var11, var12, var9.field3618, var9.field3735);
                        }
                        if (!field650 && var30) {
                            if (var9.field3607 == 1400) {
                                Statics.field479.method7802(var11, var12, var9.field3618, var9.field3735, var28, var29);
                            } else {
                                method6282(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3679.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3679[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3679[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3670 != null) {
                                            var35 = field740.method3791(var9.field3679[var31][var34]);
                                        }
                                        if (method4356(var9.field3679[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3670 != null && var9.field3670[var31] > field506) {
                                                break;
                                            }
                                            byte var36 = var9.field3672[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field740.method3791(86) && !field740.method3791(82) && !field740.method3791(81)) && ((var36 & 0x2) == 0 || field740.method3791(86)) && ((var36 & 0x1) == 0 || field740.method3791(82)) && ((var36 & 0x4) == 0 || field740.method3791(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method3256(var31 + 1, var9.field3673, var9.field3663, var9.field3736, "");
                                    } else if (var31 == 10) {
                                        method7081();
                                        method7116(var9.field3673, var9.field3663, class331.method2309(method6005(var9)), var9.field3736);
                                        field672 = method2742(var9);
                                        if (field672 == null) {
                                            field672 = class350.field3887;
                                        }
                                        field717 = var9.field3590 + class101.method6013(16777215);
                                    }
                                    int var37 = var9.field3640[var31];
                                    if (var9.field3670 == null) {
                                        var9.field3670 = new int[var9.field3679.length];
                                    }
                                    if (var9.field3682 == null) {
                                        var9.field3682 = new int[var9.field3679.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3670[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3670[var31] == 0) {
                                        var9.field3670[var31] = field506 + var37 + var9.field3682[var31];
                                    } else {
                                        var9.field3670[var31] = field506 + var37;
                                    }
                                }
                                if (!var32 && var9.field3670 != null) {
                                    var9.field3670[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3662) {
                            boolean var38;
                            if (class36.field221 >= var19 && class36.field229 >= var20 && class36.field221 < var21 && class36.field229 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field224 == 1 || !Statics.field3402 && class36.field224 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field232 == 1 || !Statics.field3402 && class36.field232 == 4) && class36.field233 >= var19 && class36.field234 >= var20 && class36.field233 < var21 && class36.field234 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method2741(var9, class36.field233 - var11, class36.field234 - var12);
                            }
                            if (var9.method5786()) {
                                if (var40) {
                                    field743.method6303(new class211(0, class36.field221 - var11, class36.field229 - var12, var9));
                                }
                                if (var39) {
                                    field743.method6303(new class211(1, class36.field221 - var11, class36.field229 - var12, var9));
                                }
                            }
                            if (var9.field3607 == 1400) {
                                Statics.field479.method7640(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field771 != null && field771 != var9 && var38 && class331.method2953(method6005(var9))) {
                                field690 = var9;
                            }
                            if (field687 == var9) {
                                field640 = true;
                                field535 = var11;
                                field693 = var12;
                            }
                            if (var9.field3730) {
                                if (var38 && field715 != 0 && var9.field3712 != null) {
                                    class88 var41 = new class88();
                                    var41.field1063 = true;
                                    var41.field1061 = var9;
                                    var41.field1059 = field715;
                                    var41.field1067 = var9.field3712;
                                    field746.method6303(var41);
                                }
                                if (field771 != null || field650) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3742 && var40) {
                                    var9.field3742 = true;
                                    if (var9.field3692 != null) {
                                        class88 var42 = new class88();
                                        var42.field1063 = true;
                                        var42.field1061 = var9;
                                        var42.field1062 = class36.field233 - var11;
                                        var42.field1059 = class36.field234 - var12;
                                        var42.field1067 = var9.field3692;
                                        field746.method6303(var42);
                                    }
                                }
                                if (var9.field3742 && var39 && var9.field3624 != null) {
                                    class88 var43 = new class88();
                                    var43.field1063 = true;
                                    var43.field1061 = var9;
                                    var43.field1062 = class36.field221 - var11;
                                    var43.field1059 = class36.field229 - var12;
                                    var43.field1067 = var9.field3624;
                                    field746.method6303(var43);
                                }
                                if (var9.field3742 && !var39) {
                                    var9.field3742 = false;
                                    if (var9.field3591 != null) {
                                        class88 var44 = new class88();
                                        var44.field1063 = true;
                                        var44.field1061 = var9;
                                        var44.field1062 = class36.field221 - var11;
                                        var44.field1059 = class36.field229 - var12;
                                        var44.field1067 = var9.field3591;
                                        field711.method6303(var44);
                                    }
                                }
                                if (var39 && var9.field3695 != null) {
                                    class88 var45 = new class88();
                                    var45.field1063 = true;
                                    var45.field1061 = var9;
                                    var45.field1062 = class36.field221 - var11;
                                    var45.field1059 = class36.field229 - var12;
                                    var45.field1067 = var9.field3695;
                                    field746.method6303(var45);
                                }
                                if (!var9.field3741 && var38) {
                                    var9.field3741 = true;
                                    if (var9.field3696 != null) {
                                        class88 var46 = new class88();
                                        var46.field1063 = true;
                                        var46.field1061 = var9;
                                        var46.field1062 = class36.field221 - var11;
                                        var46.field1059 = class36.field229 - var12;
                                        var46.field1067 = var9.field3696;
                                        field746.method6303(var46);
                                    }
                                }
                                if (var9.field3741 && var38 && var9.field3697 != null) {
                                    class88 var47 = new class88();
                                    var47.field1063 = true;
                                    var47.field1061 = var9;
                                    var47.field1062 = class36.field221 - var11;
                                    var47.field1059 = class36.field229 - var12;
                                    var47.field1067 = var9.field3697;
                                    field746.method6303(var47);
                                }
                                if (var9.field3741 && !var38) {
                                    var9.field3741 = false;
                                    if (var9.field3698 != null) {
                                        class88 var48 = new class88();
                                        var48.field1063 = true;
                                        var48.field1061 = var9;
                                        var48.field1062 = class36.field221 - var11;
                                        var48.field1059 = class36.field229 - var12;
                                        var48.field1067 = var9.field3698;
                                        field711.method6303(var48);
                                    }
                                }
                                if (var9.field3709 != null) {
                                    class88 var49 = new class88();
                                    var49.field1061 = var9;
                                    var49.field1067 = var9.field3709;
                                    field718.method6303(var49);
                                }
                                if (var9.field3703 != null && field700 > var9.field3744) {
                                    if (var9.field3749 == null || field700 - var9.field3744 > 32) {
                                        class88 var54 = new class88();
                                        var54.field1061 = var9;
                                        var54.field1067 = var9.field3703;
                                        field746.method6303(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3744; var50 < field700; var50++) {
                                            int var51 = field654[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3749.length; var52++) {
                                                if (var9.field3749[var52] == var51) {
                                                    class88 var53 = new class88();
                                                    var53.field1061 = var9;
                                                    var53.field1067 = var9.field3703;
                                                    field746.method6303(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3744 = field700;
                                }
                                if (var9.field3687 != null && field702 > var9.field3745) {
                                    if (var9.field3606 == null || field702 - var9.field3745 > 32) {
                                        class88 var59 = new class88();
                                        var59.field1061 = var9;
                                        var59.field1067 = var9.field3687;
                                        field746.method6303(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3745; var55 < field702; var55++) {
                                            int var56 = field701[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3606.length; var57++) {
                                                if (var9.field3606[var57] == var56) {
                                                    class88 var58 = new class88();
                                                    var58.field1061 = var9;
                                                    var58.field1067 = var9.field3687;
                                                    field746.method6303(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3745 = field702;
                                }
                                if (var9.field3707 != null && field704 > var9.field3602) {
                                    if (var9.field3727 == null || field704 - var9.field3602 > 32) {
                                        class88 var64 = new class88();
                                        var64.field1061 = var9;
                                        var64.field1067 = var9.field3707;
                                        field746.method6303(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3602; var60 < field704; var60++) {
                                            int var61 = field673[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3727.length; var62++) {
                                                if (var9.field3727[var62] == var61) {
                                                    class88 var63 = new class88();
                                                    var63.field1061 = var9;
                                                    var63.field1067 = var9.field3707;
                                                    field746.method6303(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3602 = field704;
                                }
                                if (field707 > var9.field3743 && var9.field3592 != null) {
                                    class88 var65 = new class88();
                                    var65.field1061 = var9;
                                    var65.field1067 = var9.field3592;
                                    field746.method6303(var65);
                                }
                                if (field708 > var9.field3743 && var9.field3717 != null) {
                                    class88 var66 = new class88();
                                    var66.field1061 = var9;
                                    var66.field1067 = var9.field3717;
                                    field746.method6303(var66);
                                }
                                if (field767 > var9.field3743 && var9.field3718 != null) {
                                    class88 var67 = new class88();
                                    var67.field1061 = var9;
                                    var67.field1067 = var9.field3718;
                                    field746.method6303(var67);
                                }
                                if (field710 > var9.field3743 && var9.field3719 != null) {
                                    class88 var68 = new class88();
                                    var68.field1061 = var9;
                                    var68.field1067 = var9.field3719;
                                    field746.method6303(var68);
                                }
                                if (field691 > var9.field3743 && var9.field3720 != null) {
                                    class88 var69 = new class88();
                                    var69.field1061 = var9;
                                    var69.field1067 = var9.field3720;
                                    field746.method6303(var69);
                                }
                                if (field735 > var9.field3743 && var9.field3725 != null) {
                                    class88 var70 = new class88();
                                    var70.field1061 = var9;
                                    var70.field1067 = var9.field3725;
                                    field746.method6303(var70);
                                }
                                if (field713 > var9.field3743 && var9.field3726 != null) {
                                    class88 var71 = new class88();
                                    var71.field1061 = var9;
                                    var71.field1067 = var9.field3726;
                                    field746.method6303(var71);
                                }
                                if (field712 > var9.field3743 && var9.field3721 != null) {
                                    class88 var72 = new class88();
                                    var72.field1061 = var9;
                                    var72.field1067 = var9.field3721;
                                    field746.method6303(var72);
                                }
                                var9.field3743 = field587;
                                if (var9.field3714 != null) {
                                    for (int var73 = 0; var73 < field742; var73++) {
                                        class88 var74 = new class88();
                                        var74.field1061 = var9;
                                        var74.field1060 = field546[var73];
                                        var74.field1066 = field677[var73];
                                        var74.field1067 = var9.field3714;
                                        field746.method6303(var74);
                                    }
                                }
                                if (var9.field3715 != null) {
                                    int[] var75 = field740.method3793();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class88 var77 = new class88();
                                        var77.field1061 = var9;
                                        var77.field1060 = var75[var76];
                                        var77.field1067 = var9.field3715;
                                        field746.method6303(var77);
                                    }
                                }
                                if (var9.field3716 != null) {
                                    int[] var78 = field740.method3794();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class88 var80 = new class88();
                                        var80.field1061 = var9;
                                        var80.field1060 = var78[var79];
                                        var80.field1067 = var9.field3716;
                                        field746.method6303(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3662) {
                            if (field771 != null || field650) {
                                continue;
                            }
                            if ((var9.field3644 >= 0 || var9.field3705 != 0) && class36.field221 >= var19 && class36.field229 >= var20 && class36.field221 < var21 && class36.field229 < var22) {
                                if (var9.field3644 >= 0) {
                                    Statics.field1769 = arg0[var9.field3644];
                                } else {
                                    Statics.field1769 = var9;
                                }
                            }
                            if (var9.field3728 == 8 && class36.field221 >= var19 && class36.field229 >= var20 && class36.field221 < var21 && class36.field229 < var22) {
                                Statics.field100 = var9;
                            }
                            if (var9.field3627 > var9.field3735) {
                                method297(var9, var9.field3618 + var11, var12, var9.field3735, var9.field3627, class36.field221, class36.field229);
                            }
                        }
                        if (var9.field3728 == 0) {
                            method2727(arg0, var9.field3673, var19, var20, var21, var22, var11 - var9.field3641, var12 - var9.field3706);
                            if (var9.field3731 != null) {
                                method2727(var9.field3731, var9.field3673, var19, var20, var21, var22, var11 - var9.field3641, var12 - var9.field3706);
                            }
                            class87 var81 = (class87) field675.method7872((long) var9.field3673);
                            if (var81 != null) {
                                if (var81.field1056 == 0 && class36.field221 >= var19 && class36.field229 >= var20 && class36.field221 < var21 && class36.field229 < var22 && !field650) {
                                    for (class88 var82 = (class88) field746.method6309(); var82 != null; var82 = (class88) field746.method6311()) {
                                        if (var82.field1063) {
                                            var82.method7560();
                                            var82.field1061.field3741 = false;
                                        }
                                    }
                                    if (Statics.field3878 == 0) {
                                        field771 = null;
                                        field687 = null;
                                    }
                                    if (!field650) {
                                        method7488();
                                    }
                                }
                                method3866(var81.field1057, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("if.lo(II)Z")
    public static boolean method4356(int arg0) {
        for (int var1 = 0; var1 < field742; var1++) {
            if (field546[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("rt.lg(IIB)V")
    public static final void method7549(int arg0, int arg1) {
        if (class330.method1447(arg0)) {
            method3787(Statics.field84[arg0], arg1);
        }
    }

    @ObfuscatedName("ij.lu([Lmb;IB)V")
    public static final void method3787(class330[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class330 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3728 == 0) {
                    if (var3.field3731 != null) {
                        method3787(var3.field3731, arg1);
                    }
                    class87 var4 = (class87) field675.method7872((long) var3.field3673);
                    if (var4 != null) {
                        method7549(var4.field1057, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3722 != null) {
                    class88 var5 = new class88();
                    var5.field1061 = var3;
                    var5.field1067 = var3.field3722;
                    class71.method3233(var5);
                }
                if (arg1 == 1 && var3.field3723 != null) {
                    if (var3.field3663 >= 0) {
                        class330 var6 = class330.method1746(var3.field3673);
                        if (var6 == null || var6.field3731 == null || var3.field3663 >= var6.field3731.length || var6.field3731[var3.field3663] != var3) {
                            continue;
                        }
                    }
                    class88 var7 = new class88();
                    var7.field1061 = var3;
                    var7.field1067 = var3.field3723;
                    class71.method3233(var7);
                }
            }
        }
    }

    @ObfuscatedName("eb.ly(Lmb;III)V")
    public static final void method2741(class330 arg0, int arg1, int arg2) {
        if (field771 != null || field650 || arg0 == null) {
            return;
        }
        class330 var3 = arg0;
        int var4 = class331.method1872(method6005(arg0));
        class330 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class330.method1746(var3.field3622);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class330 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field3685;
        }
        if (var7 == null) {
            return;
        }
        field771 = arg0;
        class330 var9 = arg0;
        int var10 = class331.method1872(method6005(arg0));
        class330 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class330.method1746(var9.field3622);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class330 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field3685;
        }
        field687 = var13;
        field688 = arg1;
        field689 = arg2;
        Statics.field3878 = 0;
        field596 = false;
        int var15 = method2872();
        if (var15 != -1) {
            method3426(var15);
        }
        return;
    }

    @ObfuscatedName("client.lv(B)V")
    public final void method1421() {
        method2632(field771);
        Statics.field3878++;
        if (field694 && field640) {
            int var1 = class36.field221;
            int var2 = class36.field229;
            int var3 = var1 - field688;
            int var4 = var2 - field689;
            if (var3 < field535) {
                var3 = field535;
            }
            if (field771.field3618 + var3 > field535 + field687.field3618) {
                var3 = field535 + field687.field3618 - field771.field3618;
            }
            if (var4 < field693) {
                var4 = field693;
            }
            if (field771.field3735 + var4 > field693 + field687.field3735) {
                var4 = field693 + field687.field3735 - field771.field3735;
            }
            int var5 = var3 - field695;
            int var6 = var4 - field736;
            int var7 = field771.field3686;
            if (Statics.field3878 > field771.field3674 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field596 = true;
            }
            int var8 = field687.field3641 + (var3 - field535);
            int var9 = field687.field3706 + (var4 - field693);
            if (field771.field3699 != null && field596) {
                class88 var10 = new class88();
                var10.field1061 = field771;
                var10.field1062 = var8;
                var10.field1059 = var9;
                var10.field1067 = field771.field3699;
                class71.method3233(var10);
            }
            if (class36.field224 == 0) {
                if (field596) {
                    if (field771.field3700 != null) {
                        class88 var11 = new class88();
                        var11.field1061 = field771;
                        var11.field1062 = var8;
                        var11.field1059 = var9;
                        var11.field1065 = field690;
                        var11.field1067 = field771.field3700;
                        class71.method3233(var11);
                    }
                    if (field690 != null) {
                        class330 var12 = field771;
                        int var13 = class331.method1872(method6005(var12));
                        class330 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = class330.method1746(var12.field3622);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class296 var16 = class296.method3619(class294.field3120, field568.field1380);
                            var16.field3211.method8168(field771.field3736);
                            var16.field3211.method8168(field690.field3663);
                            var16.field3211.method8270(field690.field3673);
                            var16.field3211.method8181(field771.field3673);
                            var16.field3211.method8169(field771.field3663);
                            var16.field3211.method8220(field690.field3736);
                            field568.method2642(var16);
                        }
                    }
                } else if (this.method1150()) {
                    this.method1628(field695 + field688, field736 + field689);
                } else if (field651 > 0) {
                    method6497(field695 + field688, field736 + field689);
                }
                field771 = null;
            }
        } else if (Statics.field3878 > 1) {
            if (!field596 && field651 > 0) {
                method6497(field695 + field688, field736 + field689);
            }
            field771 = null;
        }
    }

    @ObfuscatedName("hq.lk(IB)V")
    public static void method3426(int arg0) {
        Statics.field1395 = new class74();
        Statics.field1395.field905 = field652[arg0];
        Statics.field1395.field897 = field730[arg0];
        Statics.field1395.field899 = field714[arg0];
        Statics.field1395.field900 = field655[arg0];
        Statics.field1395.field901 = field656[arg0];
        Statics.field1395.field902 = field657[arg0];
        Statics.field1395.field898 = field658[arg0];
    }

    @ObfuscatedName("ok.lb(III)V")
    public static void method6497(int arg0, int arg1) {
        class74 var2 = Statics.field1395;
        if (var2 != null) {
            method4948(var2.field905, var2.field897, var2.field899, var2.field900, var2.field901, var2.field902, var2.field898, arg0, arg1);
        }
        Statics.field1395 = null;
    }

    @ObfuscatedName("ez.lr(Lmb;I)V")
    public static void method2632(class330 arg0) {
        if (arg0 != null && field723 == arg0.field3748) {
            field724[arg0.field3605] = true;
        }
    }

    @ObfuscatedName("rk.le(I)V")
    public static void method7591() {
        for (class87 var0 = (class87) field675.method7871(); var0 != null; var0 = (class87) field675.method7879()) {
            int var1 = var0.field1057;
            if (class330.method1447(var1)) {
                boolean var2 = true;
                class330[] var3 = Statics.field84[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3662;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4757;
                    class330 var6 = class330.method1746(var5);
                    if (var6 != null) {
                        method2632(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fz.lc(IB)V")
    public static final void method2911(int arg0) {
        if (!class330.method1447(arg0)) {
            return;
        }
        class330[] var1 = Statics.field84[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class330 var3 = var1[var2];
            if (var3 != null) {
                var3.field3738 = 0;
                var3.field3739 = 0;
            }
        }
    }

    @ObfuscatedName("ik.lz([Lmb;II)V")
    public static final void method3864(class330[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class330 var3 = arg0[var2];
            if (var3 != null && var3.field3622 == arg1 && (!var3.field3662 || !method2734(var3))) {
                if (var3.field3728 == 0) {
                    if (!var3.field3662 && method2734(var3) && Statics.field1769 != var3) {
                        continue;
                    }
                    method3864(arg0, var3.field3673);
                    if (var3.field3731 != null) {
                        method3864(var3.field3731, var3.field3673);
                    }
                    class87 var4 = (class87) field675.method7872((long) var3.field3673);
                    if (var4 != null) {
                        int var5 = var4.field1057;
                        if (class330.method1447(var5)) {
                            method3864(Statics.field84[var5], -1);
                        }
                    }
                }
                if (var3.field3728 == 6) {
                    if (var3.field3651 != -1 || var3.field3652 != -1) {
                        boolean var6 = method3694(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3652;
                        } else {
                            var7 = var3.field3651;
                        }
                        if (var7 != -1) {
                            class208 var8 = class208.method4648(var7);
                            if (var8.method3754()) {
                                var3.field3738 += field734;
                                int var9 = var8.method3757();
                                if (var3.field3738 >= var9) {
                                    var3.field3738 -= var8.field2289;
                                    if (var3.field3738 < 0 || var3.field3738 >= var9) {
                                        var3.field3738 = 0;
                                    }
                                }
                                method2632(var3);
                            } else {
                                var3.field3739 += field734;
                                while (var3.field3739 > var8.field2287[var3.field3738]) {
                                    var3.field3739 -= var8.field2287[var3.field3738];
                                    var3.field3738++;
                                    if (var3.field3738 >= var8.field2285.length) {
                                        var3.field3738 -= var8.field2289;
                                        if (var3.field3738 < 0 || var3.field3738 >= var8.field2285.length) {
                                            var3.field3738 = 0;
                                        }
                                    }
                                    method2632(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3660 != 0 && !var3.field3662) {
                        int var10 = var3.field3660 >> 16;
                        int var11 = var3.field3660 << 16 >> 16;
                        int var12 = field734 * var10;
                        int var13 = field734 * var11;
                        var3.field3655 = var3.field3655 + var12 & 0x7FF;
                        var3.field3645 = var3.field3645 + var13 & 0x7FF;
                        method2632(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gk.mr(IB)V")
    public static final void method3091(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method6767((double) var3);
    }

    @ObfuscatedName("cd.mi(B)I")
    public static final int method1051() {
        float var0 = 200.0F * ((float) Statics.field48.method2312() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("pk.mv(D)V")
    public static final void method6767(double arg0) {
        class226.method4012(arg0);
        ((class236) class226.field2521.field2793).method4365(arg0);
        class206.method3095();
        Statics.field48.method2325(arg0);
    }

    @ObfuscatedName("ih.ma(IB)V")
    public static final void method3780(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field48.method2370()) {
            return;
        }
        if (Statics.field48.method2370() == 0 && field763 != -1) {
            Statics.method6266(Statics.field255, field763, 0, var1, false);
            field757 = false;
        } else if (var1 == 0) {
            Statics.field3388.method5212();
            class305.field3390 = 1;
            Statics.field1437 = null;
            field757 = false;
        } else if (class305.field3390 == 0) {
            Statics.field3388.method5206(var1);
        } else {
            Statics.field3385 = var1;
        }
        Statics.field48.method2401(var1);
    }

    @ObfuscatedName("fr.mu(II)V")
    public static final void method2942(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field48.method2329(var1);
    }

    @ObfuscatedName("fl.mn(IB)V")
    public static final void method2879(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field48.method2331(var1);
    }

    @ObfuscatedName("pd.mc(IB)V")
    public static final void method6769(int arg0) {
        method7591();
        class70.method2525();
        int var1 = class186.method2498(arg0).field1905;
        if (var1 == 0) {
            return;
        }
        int var2 = class320.field3514[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method6767(0.9D);
            }
            if (var2 == 2) {
                method6767(0.8D);
            }
            if (var2 == 3) {
                method6767(0.7D);
            }
            if (var2 == 4) {
                method6767(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method3780(255);
            }
            if (var2 == 1) {
                method3780(192);
            }
            if (var2 == 2) {
                method3780(128);
            }
            if (var2 == 3) {
                method3780(64);
            }
            if (var2 == 4) {
                method3780(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method2942(127);
            }
            if (var2 == 1) {
                method2942(96);
            }
            if (var2 == 2) {
                method2942(64);
            }
            if (var2 == 3) {
                method2942(32);
            }
            if (var2 == 4) {
                method2942(0);
            }
        }
        if (var1 == 5) {
            field649 = var2 == 1;
        }
        if (var1 == 6) {
            field796 = var2;
        }
        if (var1 == 9) {
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method2879(127);
            }
            if (var2 == 1) {
                method2879(96);
            }
            if (var2 == 2) {
                method2879(64);
            }
            if (var2 == 3) {
                method2879(32);
            }
            if (var2 == 4) {
                method2879(0);
            }
        }
        if (var1 == 17) {
            field683 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field533 = (class103) class371.method4632(class103.method6979(), var2);
            if (field533 == null) {
                field533 = class103.field1312;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field641 = -1;
            } else {
                field641 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field797 = (class103) class371.method4632(class103.method6979(), var2);
            if (field797 == null) {
                field797 = class103.field1312;
            }
        }
    }

    @ObfuscatedName("bb.mq(Lmb;B)V")
    public static final void method651(class330 arg0) {
        int var1 = arg0.field3607;
        if (var1 == 324) {
            if (field791 == -1) {
                field791 = arg0.field3638;
                field792 = arg0.field3628;
            }
            if (field790.field3541 == 1) {
                arg0.field3638 = field791;
            } else {
                arg0.field3638 = field792;
            }
        } else if (var1 == 325) {
            if (field791 == -1) {
                field791 = arg0.field3638;
                field792 = arg0.field3628;
            }
            if (field790.field3541 == 1) {
                arg0.field3638 = field792;
            } else {
                arg0.field3638 = field791;
            }
        } else if (var1 == 327) {
            arg0.field3655 = 150;
            arg0.field3645 = (int) (Math.sin((double) field506 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3648 = 5;
            arg0.field3604 = 0;
        } else if (var1 == 328) {
            arg0.field3655 = 150;
            arg0.field3645 = (int) (Math.sin((double) field506 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3648 = 5;
            arg0.field3604 = 1;
        }
    }

    @ObfuscatedName("bb.mg(I)V")
    public static final void method657() {
        class296 var0 = class296.method3619(class294.field3106, field568.field1380);
        field568.method2642(var0);
        class71.field876 = true;
        for (class87 var1 = (class87) field675.method7871(); var1 != null; var1 = (class87) field675.method7879()) {
            if (var1.field1056 == 0 || var1.field1056 == 3) {
                method815(var1, true);
            }
        }
        if (field679 != null) {
            method2632(field679);
            field679 = null;
        }
        class71.field876 = false;
    }

    @ObfuscatedName("hn.mo(IIII)Ldx;")
    public static final class87 method3265(int arg0, int arg1, int arg2) {
        class87 var3 = new class87();
        var3.field1057 = arg1;
        var3.field1056 = arg2;
        field675.method7878(var3, (long) arg0);
        method2911(arg1);
        class330 var4 = class330.method1746(arg0);
        method2632(var4);
        if (field679 != null) {
            method2632(field679);
            field679 = null;
        }
        method2025(Statics.field84[arg0 >> 16], var4, false);
        class71.method2967(arg1);
        if (field799 != -1) {
            method7549(field799, 1);
        }
        return var3;
    }

    @ObfuscatedName("bz.mx(Ldx;ZB)V")
    public static final void method815(class87 arg0, boolean arg1) {
        int var2 = arg0.field1057;
        int var3 = (int) arg0.field4757;
        arg0.method7560();
        if (arg1) {
            class330.method5134(var2);
        }
        for (class460 var4 = (class460) field537.method7871(); var4 != null; var4 = (class460) field537.method7879()) {
            if ((long) var2 == (var4.field4757 >> 48 & 0xFFFFL)) {
                var4.method7560();
            }
        }
        class330 var5 = class330.method1746(var3);
        if (var5 != null) {
            method2632(var5);
        }
        if (field799 != -1) {
            method7549(field799, 1);
        }
    }

    @ObfuscatedName("hg.mm(Lmb;I)Z")
    public static final boolean method3716(class330 arg0) {
        int var1 = arg0.field3607;
        if (var1 == 205) {
            field569 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field790.method5436(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field790.method5437(var4, var5 == 1);
        }
        if (var1 == 324) {
            field790.method5438(0);
        }
        if (var1 == 325) {
            field790.method5438(1);
        }
        if (var1 == 326) {
            class296 var6 = class296.method3619(class294.field3141, field568.field1380);
            field790.method5439(var6.field3211);
            field568.method2642(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ch.ml(Lmb;IIIB)V")
    public static final void method1021(class330 arg0, int arg1, int arg2, int arg3) {
        method4957();
        class319 var4 = arg0.method5783(false);
        if (var4 == null) {
            return;
        }
        class511.method8523(arg1, arg2, var4.field3504 + arg1, var4.field3506 + arg2);
        if (field755 == 2 || field755 == 5) {
            class511.method8480(arg1, arg2, 0, var4.field3510, var4.field3507);
        } else {
            int var5 = field590 & 0x7FF;
            int var6 = Statics.field971.field1163 / 32 + 48;
            int var7 = 464 - Statics.field971.field1153 / 32;
            Statics.field171.method8687(arg1, arg2, var4.field3504, var4.field3506, var6, var7, var5, 256, var4.field3510, var4.field3507);
            for (int var8 = 0; var8 < field749; var8++) {
                int var9 = field750[var8] * 4 + 2 - Statics.field971.field1163 / 32;
                int var10 = field758[var8] * 4 + 2 - Statics.field971.field1153 / 32;
                method1041(arg1, arg2, var9, var10, field774[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class376 var13 = field642[Statics.field1882][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field971.field1163 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field971.field1153 / 32;
                        method1041(arg1, arg2, var14, var15, Statics.field102[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field542; var16++) {
                class100 var17 = field563[field540[var16]];
                if (var17 != null && var17.method2192()) {
                    class195 var18 = var17.field1292;
                    if (var18 != null && var18.field2022 != null) {
                        var18 = var18.method3404();
                    }
                    if (var18 != null && var18.field2006 && var18.field2001) {
                        int var19 = var17.field1163 / 32 - Statics.field971.field1163 / 32;
                        int var20 = var17.field1153 / 32 - Statics.field971.field1153 / 32;
                        method1041(arg1, arg2, var19, var20, Statics.field102[1], var4);
                    }
                }
            }
            int var21 = class107.field1332;
            int[] var22 = class107.field1335;
            for (int var23 = 0; var23 < var21; var23++) {
                class92 var24 = field613[var22[var23]];
                if (var24 != null && var24.method2192() && !var24.field1115 && Statics.field971 != var24) {
                    int var25 = var24.field1163 / 32 - Statics.field971.field1163 / 32;
                    int var26 = var24.field1153 / 32 - Statics.field971.field1153 / 32;
                    if (var24.method2199()) {
                        method1041(arg1, arg2, var25, var26, Statics.field102[3], var4);
                    } else if (Statics.field971.field1118 != 0 && var24.field1118 != 0 && Statics.field971.field1118 == var24.field1118) {
                        method1041(arg1, arg2, var25, var26, Statics.field102[4], var4);
                    } else if (var24.method2177()) {
                        method1041(arg1, arg2, var25, var26, Statics.field102[5], var4);
                    } else if (var24.method2182()) {
                        method1041(arg1, arg2, var25, var26, Statics.field102[6], var4);
                    } else {
                        method1041(arg1, arg2, var25, var26, Statics.field102[2], var4);
                    }
                }
            }
            if (field525 != 0 && field506 % 20 < 10) {
                if (field525 == 1 && field526 >= 0 && field526 < field563.length) {
                    class100 var27 = field563[field526];
                    if (var27 != null) {
                        int var28 = var27.field1163 / 32 - Statics.field971.field1163 / 32;
                        int var29 = var27.field1153 / 32 - Statics.field971.field1153 / 32;
                        method2912(arg1, arg2, var28, var29, Statics.field1254[1], var4);
                    }
                }
                if (field525 == 2) {
                    int var30 = field528 * 4 - Statics.field2380 * 4 + 2 - Statics.field971.field1163 / 32;
                    int var31 = field698 * 4 - Statics.field1302 * 4 + 2 - Statics.field971.field1153 / 32;
                    method2912(arg1, arg2, var30, var31, Statics.field1254[1], var4);
                }
                if (field525 == 10 && field798 >= 0 && field798 < field613.length) {
                    class92 var32 = field613[field798];
                    if (var32 != null) {
                        int var33 = var32.field1163 / 32 - Statics.field971.field1163 / 32;
                        int var34 = var32.field1153 / 32 - Statics.field971.field1153 / 32;
                        method2912(arg1, arg2, var33, var34, Statics.field1254[1], var4);
                    }
                }
            }
            if (field753 != 0) {
                int var35 = field753 * 4 + 2 - Statics.field971.field1163 / 32;
                int var36 = field754 * 4 + 2 - Statics.field971.field1153 / 32;
                method1041(arg1, arg2, var35, var36, Statics.field1254[0], var4);
            }
            if (!Statics.field971.field1115) {
                class511.method8468(var4.field3504 / 2 + arg1 - 1, var4.field3506 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field725[arg3] = true;
    }

    @ObfuscatedName("dj.ms(Lmb;IIIB)V")
    public static final void method2281(class330 arg0, int arg1, int arg2, int arg3) {
        class319 var4 = arg0.method5783(false);
        if (var4 == null) {
            return;
        }
        if (field755 < 3) {
            Statics.field3399.method8687(arg1, arg2, var4.field3504, var4.field3506, 25, 25, field590, 256, var4.field3510, var4.field3507);
        } else {
            class511.method8480(arg1, arg2, 0, var4.field3510, var4.field3507);
        }
    }

    @ObfuscatedName("fz.mk(IIIILtm;Lmc;B)V")
    public static final void method2912(int arg0, int arg1, int arg2, int arg3, class515 arg4, class319 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method1041(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field590 & 0x7FF;
        int var8 = class226.field2523[var7];
        int var9 = class226.field2520[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3504 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field4523.method8611(arg5.field3504 / 2 + arg0 - var17 / 2 + var15, arg5.field3506 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("cy.mh(IIIILtm;Lmc;I)V")
    public static final void method1041(int arg0, int arg1, int arg2, int arg3, class515 arg4, class319 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field590 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class226.field2523[var6];
        int var9 = class226.field2520[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8609(arg5.field3504 / 2 + var10 - arg4.field5119 / 2, arg5.field3506 / 2 - var11 - arg4.field5117 / 2, arg0, arg1, arg5.field3504, arg5.field3506, arg5.field3510, arg5.field3507);
        } else {
            arg4.method8661(arg5.field3504 / 2 + arg0 + var10 - arg4.field5119 / 2, arg5.field3506 / 2 + arg1 - var11 - arg4.field5117 / 2);
        }
    }

    @ObfuscatedName("dh.mj(I)V")
    public static final void method2195() {
        class110.method2240();
        if (Statics.field4535 != null) {
            Statics.field4535.method7088();
        }
    }

    @ObfuscatedName("lm.mb(I)V")
    public static final void method5135() {
        field708 = field587;
    }

    @ObfuscatedName("gv.mp(B)V")
    public static final void method3077() {
        field767 = field587;
        Statics.field74 = true;
    }

    @ObfuscatedName("hf.mw(B)V")
    public static final void method3476() {
        field710 = field587;
        Statics.field1723 = true;
    }

    @ObfuscatedName("de.mz(Ljava/lang/String;I)V")
    public static final void method2491(String arg0) {
        if (Statics.field4535 != null) {
            class296 var1 = class296.method3619(class294.field3134, field568.field1380);
            var1.field3211.method8113(class501.method5933(arg0));
            var1.field3211.method8119(arg0);
            field568.method2642(var1);
        }
    }

    @ObfuscatedName("ak.my(Ljava/lang/String;I)V")
    public static final void method52(String arg0) {
        if (!arg0.equals("")) {
            class296 var1 = class296.method3619(class294.field3129, field568.field1380);
            var1.field3211.method8113(class501.method5933(arg0));
            var1.field3211.method8119(arg0);
            field568.method2642(var1);
        }
    }

    @ObfuscatedName("qe.md(I)V")
    public static final void method7482() {
        class296 var0 = class296.method3619(class294.field3129, field568.field1380);
        var0.field3211.method8113(0);
        field568.method2642(var0);
    }

    @ObfuscatedName("dm.mf(III)V")
    public static final void method2060(int arg0, int arg1) {
        if (field720[arg0] == null || arg1 < 0 || arg1 >= field720[arg0].method3075()) {
            return;
        }
        class145 var2 = (class145) field720[arg0].field1763.get(arg1);
        if (var2.field1635 != -1) {
            return;
        }
        class296 var3 = class296.method3619(class294.field3147, field568.field1380);
        var3.field3211.method8113(3 + class501.method5933(var2.field1632.method8756()));
        var3.field3211.method8113(arg0);
        var3.field3211.method8114(arg1);
        var3.field3211.method8119(var2.field1632.method8756());
        field568.method2642(var3);
    }

    @ObfuscatedName("cb.me(IIZB)V")
    public static final void method1126(int arg0, int arg1, boolean arg2) {
        if (field720[arg0] == null || arg1 < 0 || arg1 >= field720[arg0].method3075()) {
            return;
        }
        class145 var3 = (class145) field720[arg0].field1763.get(arg1);
        class296 var4 = class296.method3619(class294.field3153, field568.field1380);
        var4.field3211.method8113(4 + class501.method5933(var3.field1632.method8756()));
        var4.field3211.method8113(arg0);
        var4.field3211.method8114(arg1);
        var4.field3211.method8118(arg2);
        var4.field3211.method8119(var3.field1632.method8756());
        field568.method2642(var4);
    }

    @ObfuscatedName("ng.nf(Lmb;I)I")
    public static int method6005(class330 arg0) {
        class460 var1 = (class460) field537.method7872(((long) arg0.field3673 << 32) + (long) arg0.field3663);
        return var1 == null ? arg0.field3619 : var1.field4754;
    }

    @ObfuscatedName("ew.nm(Lmb;I)Z")
    public static boolean method2734(class330 arg0) {
        return arg0.field3608;
    }

    @ObfuscatedName("fo.nv(Lmb;II)Ljava/lang/String;")
    public static String method2957(class330 arg0, int arg1) {
        if (!class331.method1063(method6005(arg0), arg1) && arg0.field3637 == null) {
            return null;
        } else if (arg0.field3684 == null || arg0.field3684.length <= arg1 || arg0.field3684[arg1] == null || arg0.field3684[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3684[arg1];
        }
    }

    @ObfuscatedName("eo.nc(Lmb;B)Ljava/lang/String;")
    public static String method2742(class330 arg0) {
        if (class331.method2309(method6005(arg0)) == 0) {
            return null;
        } else if (arg0.field3689 == null || arg0.field3689.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3689;
        }
    }

    @ObfuscatedName("mb.na(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method5932(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field566 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field566 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field566 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field566 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field566 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4711 != null) {
            var3 = "/p=" + Statics.field4711;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field4618 + "/a=" + Statics.field1727 + var3 + "/";
    }

    @ObfuscatedName("nb.nn(Ljava/lang/String;S)V")
    public static void method6014(String arg0) {
        Statics.field4711 = arg0;
        try {
            String var1 = Statics.field3874.getParameter(Integer.toString(18));
            String var2 = Statics.field3874.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class335.method3365(class301.method4630() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field3874;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("dk.nt(Ljava/lang/String;ZB)V")
    public static void method2304(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field4671; var5++) {
            class206 var6 = class206.method5155(var5);
            if ((!arg1 || var6.field2252) && var6.field2243 == -1 && var6.field2208.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1328 = -1;
                    Statics.field93 = null;
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
        Statics.field93 = var3;
        Statics.field63 = 0;
        Statics.field1328 = var4;
        String[] var9 = new String[Statics.field1328];
        for (int var10 = 0; var10 < Statics.field1328; var10++) {
            var9[var10] = class206.method5155(var3[var10]).field2208;
        }
        short[] var11 = Statics.field93;
        class498.method6076(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("cd.ng(Ltz;II)V")
    public static void method1052(class501 arg0, int arg1) {
        byte[] var2 = arg0.field5016;
        if (field562 == null) {
            field562 = new byte[24];
        }
        class398.method6901(var2, arg1, field562, 0, 24);
        if (class173.field1834 == null) {
            return;
        }
        try {
            class173.field1834.method7936(0L);
            class173.field1834.method7935(arg0.field5016, arg1, 24);
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("client.np(I)Lun;")
    public class525 method1155() {
        return Statics.field971 == null ? null : Statics.field971.field1112;
    }

    @ObfuscatedName("ig.ne(I)Z")
    public static boolean method3865() {
        return field682 >= 2;
    }

    @ObfuscatedName("ky.ni(II)V")
    public static void method4955(int arg0) {
        field595 = arg0;
    }

    @ObfuscatedName("mh.nu(I)V")
    public static void method5764() {
        if (field595 == 1) {
            field603 = true;
        }
    }

    @ObfuscatedName("ay.nb(Ljava/lang/String;B)Ljava/lang/String;")
    public static String method319(String arg0) {
        class352[] var1 = Statics.method3344();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class352 var3 = var1[var2];
            if (var3.field4215 != -1 && arg0.startsWith(class101.method2497(var3.field4215))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4215).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dv.nw(B)V")
    public static void method2241() {
        if (Statics.field153 == null) {
            return;
        }
        field699 = field506;
        Statics.field153.method6261();
        for (int var0 = 0; var0 < field613.length; var0++) {
            if (field613[var0] != null) {
                Statics.field153.method6250((field613[var0].field1163 >> 7) + Statics.field2380, (field613[var0].field1153 >> 7) + Statics.field1302);
            }
        }
    }

    @ObfuscatedName("ne.nd(II)V")
    public static void method6010(int arg0) {
        if (field545 != arg0) {
            field545 = arg0;
        }
    }

    @ObfuscatedName("an.nz(ZI)V")
    public static void method7(boolean arg0) {
        field649 = arg0;
    }

    @ObfuscatedName("fd.no(IB)Ltb;")
    public static class495 method2937(int arg0) {
        class495 var1 = (class495) field548.method5121((long) arg0);
        if (var1 == null) {
            var1 = new class495(Statics.field1378, arg0);
        }
        return var1;
    }

    @ObfuscatedName("am.nq(I)Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard method368() {
        return Statics.field3874.method459();
    }

    @ObfuscatedName("jq.nx(II)V")
    public static void method4656(int arg0) {
        class208 var1 = class208.method4648(arg0);
        if (!var1.method3754()) {
            return;
        }
        int var2 = var1.field2281;
        class137 var3 = class208.method2435(var2);
        int var4;
        if (var3 == null) {
            var4 = 2;
        } else {
            var4 = var3.method2889() ? 0 : 1;
        }
        if (var4 == 2) {
            field801.add(var1.field2281);
        }
    }

    @ObfuscatedName("kt.nl(I)V")
    public static void method5083() {
        for (int var0 = 0; var0 < field801.size(); var0++) {
            int var1 = (Integer) field801.get(var0);
            class137 var2 = class208.method2435(var1);
            int var3;
            if (var2 == null) {
                var3 = 2;
            } else {
                var3 = var2.method2889() ? 0 : 1;
            }
            if (var3 != 2) {
                field801.remove(var0);
                var0--;
            }
        }
    }
}

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
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class428, OAuthApi, class313 {

    @ObfuscatedName("client.bg")
    public static boolean field632 = true;

    @ObfuscatedName("client.bj")
    public static int field517 = 1;

    @ObfuscatedName("client.ct")
    public static int field518 = 0;

    @ObfuscatedName("client.cz")
    public static int field519 = 0;

    @ObfuscatedName("client.cj")
    public static boolean field520 = false;

    @ObfuscatedName("client.cn")
    public static boolean field634 = false;

    @ObfuscatedName("client.ca")
    public static int field522 = -1;

    @ObfuscatedName("client.cx")
    public static int field523 = -1;

    @ObfuscatedName("client.co")
    public static int field658 = -1;

    @ObfuscatedName("client.cu")
    public static boolean field525 = false;

    @ObfuscatedName("client.cr")
    public static int field526 = 215;

    @ObfuscatedName("client.dq")
    public static int field813 = 0;

    @ObfuscatedName("client.dg")
    public static boolean field528 = false;

    @ObfuscatedName("client.et")
    public static boolean field683 = true;

    @ObfuscatedName("client.em")
    public static int field530 = 0;

    @ObfuscatedName("client.ec")
    public static long field531 = 1L;

    @ObfuscatedName("client.er")
    public static int field744 = -1;

    @ObfuscatedName("client.ew")
    public static int field533 = -1;

    @ObfuscatedName("client.eo")
    public static long field534 = -1L;

    @ObfuscatedName("client.eb")
    public static boolean field535 = true;

    @ObfuscatedName("client.ej")
    public static int field536 = 0;

    @ObfuscatedName("client.eh")
    public static int field537 = 0;

    @ObfuscatedName("client.ei")
    public static int field697 = 0;

    @ObfuscatedName("client.en")
    public static int field539 = 0;

    @ObfuscatedName("client.es")
    public static int field540 = 0;

    @ObfuscatedName("client.eq")
    public static int field608 = 0;

    @ObfuscatedName("client.ee")
    public static int field542 = 0;

    @ObfuscatedName("client.eg")
    public static int field543 = 0;

    @ObfuscatedName("client.ey")
    public static int field544 = 0;

    @ObfuscatedName("client.ea")
    public static class104 field545 = class104.field1340;

    @ObfuscatedName("client.ex")
    public static class104 field546 = class104.field1340;

    @ObfuscatedName("client.ef")
    public static boolean field757 = false;

    @ObfuscatedName("client.fq")
    public static class93 field548 = class93.field1145;

    @ObfuscatedName("client.fp")
    public static int field549 = 0;

    @ObfuscatedName("client.fz")
    public static int field550 = 0;

    @ObfuscatedName("client.gs")
    public static int field551 = 0;

    @ObfuscatedName("client.go")
    public static int field552 = 0;

    @ObfuscatedName("client.gh")
    public static int field553 = 0;

    @ObfuscatedName("client.gj")
    public static int field797 = 0;

    @ObfuscatedName("client.gm")
    public static int field555 = 0;

    @ObfuscatedName("client.gx")
    public static class140 field556 = class140.field1630;

    @ObfuscatedName("client.gr")
    public static class519 field557 = class519.field5130;

    @ObfuscatedName("client.gu")
    public String field698;

    @ObfuscatedName("client.gw")
    public class15 field559;

    @ObfuscatedName("client.hf")
    public class19 field635;

    @ObfuscatedName("client.hv")
    public OtlTokenRequester field561;

    @ObfuscatedName("client.hp")
    public Future field562;

    @ObfuscatedName("client.hh")
    public boolean field563 = false;

    @ObfuscatedName("client.hg")
    public class19 field564;

    @ObfuscatedName("client.ho")
    public RefreshAccessTokenRequester field565;

    @ObfuscatedName("client.he")
    public Future field566;

    @ObfuscatedName("client.hx")
    public static final String field567;

    @ObfuscatedName("client.hq")
    public static boolean field568;

    @ObfuscatedName("client.hu")
    public static class78 field569;

    @ObfuscatedName("client.hb")
    public class514 field570;

    @ObfuscatedName("client.hc")
    public class8 field571;

    @ObfuscatedName("client.ia")
    public long field781 = -1L;

    @ObfuscatedName("client.ig")
    public static byte[] field573;

    @ObfuscatedName("client.ih")
    public static class101[] field574;

    @ObfuscatedName("client.ij")
    public static int field650;

    @ObfuscatedName("client.ir")
    public static int[] field576;

    @ObfuscatedName("client.in")
    public static int field802;

    @ObfuscatedName("client.iq")
    public static int[] field588;

    @ObfuscatedName("client.id")
    public static final class112 field521;

    @ObfuscatedName("client.ip")
    public static int field627;

    @ObfuscatedName("client.ic")
    public static boolean field572;

    @ObfuscatedName("client.im")
    public static class415 field582;

    @ObfuscatedName("client.if")
    public static HashMap field583;

    @ObfuscatedName("client.it")
    public static String field558;

    @ObfuscatedName("client.jo")
    public static int field731;

    @ObfuscatedName("client.jr")
    public static int field585;

    @ObfuscatedName("client.jk")
    public static int field680;

    @ObfuscatedName("client.jl")
    public static int field587;

    @ObfuscatedName("client.jw")
    public static int field538;

    @ObfuscatedName("client.jn")
    public static class215[] field589;

    @ObfuscatedName("client.jz")
    public static boolean field590;

    @ObfuscatedName("client.jj")
    public static int[][][] field591;

    @ObfuscatedName("client.jg")
    public static final int[] field592;

    @ObfuscatedName("client.jv")
    public static int field703;

    @ObfuscatedName("client.ka")
    public static int field594;

    @ObfuscatedName("client.kx")
    public static int field595;

    @ObfuscatedName("client.ku")
    public static int field596;

    @ObfuscatedName("client.kq")
    public static int field773;

    @ObfuscatedName("client.ky")
    public static boolean field817;

    @ObfuscatedName("client.kv")
    public static int field599;

    @ObfuscatedName("client.kc")
    public static int field734;

    @ObfuscatedName("client.kb")
    public static int field654;

    @ObfuscatedName("client.kh")
    public static int field775;

    @ObfuscatedName("client.lj")
    public static int field603;

    @ObfuscatedName("client.lr")
    public static int field604;

    @ObfuscatedName("client.ld")
    public static int field818;

    @ObfuscatedName("client.li")
    public static int field606;

    @ObfuscatedName("client.la")
    public static int field607;

    @ObfuscatedName("client.lh")
    public static int field584;

    @ObfuscatedName("client.lw")
    public static int field609;

    @ObfuscatedName("client.lo")
    public static int field610;

    @ObfuscatedName("client.ls")
    public static int field611;

    @ObfuscatedName("client.lx")
    public static int field787;

    @ObfuscatedName("client.ln")
    public static int field625;

    @ObfuscatedName("client.lt")
    public static boolean field614;

    @ObfuscatedName("client.lp")
    public static int field615;

    @ObfuscatedName("client.lf")
    public static boolean field708;

    @ObfuscatedName("client.ly")
    public static int field617;

    @ObfuscatedName("client.lk")
    public static int field532;

    @ObfuscatedName("client.lq")
    public static int field616;

    @ObfuscatedName("client.lc")
    public static int[] field752;

    @ObfuscatedName("client.lb")
    public static int[] field647;

    @ObfuscatedName("client.lg")
    public static int[] field622;

    @ObfuscatedName("client.ll")
    public static int[] field723;

    @ObfuscatedName("client.lm")
    public static int[] field624;

    @ObfuscatedName("client.mn")
    public static int[] field684;

    @ObfuscatedName("client.mf")
    public static int[][] field639;

    @ObfuscatedName("client.mm")
    public static int[] field580;

    @ObfuscatedName("client.mp")
    public static String[] field628;

    @ObfuscatedName("client.mw")
    public static int[][] field629;

    @ObfuscatedName("client.mh")
    public static int field630;

    @ObfuscatedName("client.mj")
    public static int field631;

    @ObfuscatedName("client.mx")
    public static int field750;

    @ObfuscatedName("client.mu")
    public static int field633;

    @ObfuscatedName("client.mi")
    public static int field527;

    @ObfuscatedName("client.mq")
    public static int field766;

    @ObfuscatedName("client.mr")
    public static int field636;

    @ObfuscatedName("client.mv")
    public static boolean field640;

    @ObfuscatedName("client.my")
    public static int field638;

    @ObfuscatedName("client.mc")
    public static boolean field581;

    @ObfuscatedName("client.mb")
    public static class92[] field612;

    @ObfuscatedName("client.mg")
    public static int field801;

    @ObfuscatedName("client.mt")
    public static int field642;

    @ObfuscatedName("client.mk")
    public static long field643;

    @ObfuscatedName("client.ml")
    public static boolean field767;

    @ObfuscatedName("client.nb")
    public static int field645;

    @ObfuscatedName("client.no")
    public static int field646;

    @ObfuscatedName("client.nh")
    public static int[] field602;

    @ObfuscatedName("client.na")
    public static final int[] field648;

    @ObfuscatedName("client.ns")
    public static String[] field662;

    @ObfuscatedName("client.nc")
    public static boolean[] field768;

    @ObfuscatedName("client.ni")
    public static int[] field705;

    @ObfuscatedName("client.nu")
    public static int field652;

    @ObfuscatedName("client.nk")
    public static class379[][][] field653;

    @ObfuscatedName("client.nm")
    public static class379 field678;

    @ObfuscatedName("client.nt")
    public static class379 field524;

    @ObfuscatedName("client.nz")
    public static class379 field656;

    @ObfuscatedName("client.nr")
    public static int[] field657;

    @ObfuscatedName("client.nw")
    public static int[] field578;

    @ObfuscatedName("client.nn")
    public static int[] field659;

    @ObfuscatedName("client.nl")
    public static boolean field660;

    @ObfuscatedName("client.ny")
    public static boolean field661;

    @ObfuscatedName("client.nj")
    public static int field679;

    @ObfuscatedName("client.ou")
    public static int[] field663;

    @ObfuscatedName("client.ow")
    public static int[] field664;

    @ObfuscatedName("client.ok")
    public static int[] field665;

    @ObfuscatedName("client.ol")
    public static int[] field789;

    @ObfuscatedName("client.oc")
    public static int[] field667;

    @ObfuscatedName("client.ov")
    public static String[] field668;

    @ObfuscatedName("client.oq")
    public static String[] field669;

    @ObfuscatedName("client.oe")
    public static boolean[] field670;

    @ObfuscatedName("client.os")
    public static boolean field777;

    @ObfuscatedName("client.ot")
    public static boolean field672;

    @ObfuscatedName("client.ox")
    public static boolean field702;

    @ObfuscatedName("client.og")
    public static int field674;

    @ObfuscatedName("client.ob")
    public static int field675;

    @ObfuscatedName("client.om")
    public static int field676;

    @ObfuscatedName("client.oj")
    public static int field677;

    @ObfuscatedName("client.oz")
    public static int field579;

    @ObfuscatedName("client.oy")
    public static boolean field742;

    @ObfuscatedName("client.op")
    public static int field681;

    @ObfuscatedName("client.of")
    public static int field682;

    @ObfuscatedName("client.pl")
    public static String field637;

    @ObfuscatedName("client.pa")
    public static String field735;

    @ObfuscatedName("client.pg")
    public static int field685;

    @ObfuscatedName("client.pd")
    public static class490 field686;

    @ObfuscatedName("client.pq")
    public static int field618;

    @ObfuscatedName("client.po")
    public static int field688;

    @ObfuscatedName("client.pe")
    public static int field689;

    @ObfuscatedName("client.pj")
    public static class333 field690;

    @ObfuscatedName("client.pu")
    public static int field691;

    @ObfuscatedName("client.pn")
    public static int field692;

    @ObfuscatedName("client.pi")
    public static int field693;

    @ObfuscatedName("client.px")
    public static int field694;

    @ObfuscatedName("client.pb")
    public static boolean field695;

    @ObfuscatedName("client.pp")
    public static class333 field696;

    @ObfuscatedName("client.pf")
    public static class333 field597;

    @ObfuscatedName("client.ps")
    public static class333 field605;

    @ObfuscatedName("client.py")
    public static int field699;

    @ObfuscatedName("client.pw")
    public static int field700;

    @ObfuscatedName("client.pk")
    public static class333 field701;

    @ObfuscatedName("client.pv")
    public static boolean field762;

    @ObfuscatedName("client.pm")
    public static int field649;

    @ObfuscatedName("client.pr")
    public static int field704;

    @ObfuscatedName("client.qx")
    public static boolean field810;

    @ObfuscatedName("client.qw")
    public static int field706;

    @ObfuscatedName("client.qf")
    public static int field707;

    @ObfuscatedName("client.qc")
    public static boolean field601;

    @ObfuscatedName("client.ql")
    public static int field709;

    @ObfuscatedName("client.qv")
    public static int[] field710;

    @ObfuscatedName("client.qp")
    public static int field711;

    @ObfuscatedName("client.qk")
    public static int[] field808;

    @ObfuscatedName("client.qi")
    public static int field687;

    @ObfuscatedName("client.qt")
    public static int[] field714;

    @ObfuscatedName("client.qg")
    public static int field712;

    @ObfuscatedName("client.qe")
    public static int[] field716;

    @ObfuscatedName("client.qz")
    public static int field794;

    @ObfuscatedName("client.qs")
    public static int field718;

    @ObfuscatedName("client.qn")
    public static int field764;

    @ObfuscatedName("client.qa")
    public static int field720;

    @ObfuscatedName("client.qj")
    public static int field554;

    @ObfuscatedName("client.qh")
    public static int field623;

    @ObfuscatedName("client.qq")
    public static int field722;

    @ObfuscatedName("client.qy")
    public static int field724;

    @ObfuscatedName("client.rh")
    public static int field725;

    @ObfuscatedName("client.ra")
    public static int field726;

    @ObfuscatedName("client.ri")
    public static class532 field727;

    @ObfuscatedName("client.rj")
    public static class379 field728;

    @ObfuscatedName("client.rm")
    public static class379 field729;

    @ObfuscatedName("client.rv")
    public static class379 field730;

    @ObfuscatedName("client.rp")
    public static class379 field811;

    @ObfuscatedName("client.rr")
    public static class490 field732;

    @ObfuscatedName("client.rn")
    public static int field733;

    @ObfuscatedName("client.rl")
    public static int field529;

    @ObfuscatedName("client.rc")
    public static boolean[] field719;

    @ObfuscatedName("client.ro")
    public static boolean[] field736;

    @ObfuscatedName("client.rw")
    public static boolean[] field737;

    @ObfuscatedName("client.rs")
    public static int[] field666;

    @ObfuscatedName("client.rq")
    public static int[] field739;

    @ObfuscatedName("client.re")
    public static int[] field740;

    @ObfuscatedName("client.rx")
    public static int[] field741;

    @ObfuscatedName("client.ry")
    public static int field673;

    @ObfuscatedName("client.rd")
    public static long field743;

    @ObfuscatedName("client.rz")
    public static boolean field547;

    @ObfuscatedName("client.su")
    public static int[] field745;

    @ObfuscatedName("client.sy")
    public static int field746;

    @ObfuscatedName("client.sc")
    public static int field747;

    @ObfuscatedName("client.sd")
    public static String field748;

    @ObfuscatedName("client.sl")
    public static long[] field749;

    @ObfuscatedName("client.sk")
    public static int field641;

    @ObfuscatedName("client.st")
    public static class214 field751;

    @ObfuscatedName("client.sq")
    public static class212 field613;

    @ObfuscatedName("client.sg")
    public static int field753;

    @ObfuscatedName("client.sf")
    public static int[] field754;

    @ObfuscatedName("client.sw")
    public static int[] field755;

    @ObfuscatedName("client.sa")
    public static long field651;

    @ObfuscatedName("client.sn")
    public static class155[] field713;

    @ObfuscatedName("client.ta")
    public static class164[] field758;

    @ObfuscatedName("client.ts")
    public static int field759;

    @ObfuscatedName("client.tt")
    public static int field621;

    @ObfuscatedName("client.tp")
    public static int[] field761;

    @ObfuscatedName("client.td")
    public static int[] field577;

    @ObfuscatedName("client.te")
    public static class528[] field763;

    @ObfuscatedName("client.tv")
    public static int field598;

    @ObfuscatedName("client.ti")
    public static int field765;

    @ObfuscatedName("client.tq")
    public static int field671;

    @ObfuscatedName("client.th")
    public static boolean field575;

    @ObfuscatedName("client.tb")
    public static int field717;

    @ObfuscatedName("client.tj")
    public static int[] field769;

    @ObfuscatedName("client.tl")
    public static int[] field770;

    @ObfuscatedName("client.tf")
    public static int[] field771;

    @ObfuscatedName("client.tz")
    public static int[] field586;

    @ObfuscatedName("client.uw")
    public static class40[] field812;

    @ObfuscatedName("client.uh")
    public static boolean field774;

    @ObfuscatedName("client.uv")
    public static boolean field776;

    @ObfuscatedName("client.uz")
    public static boolean field798;

    @ObfuscatedName("client.uy")
    public static boolean field783;

    @ObfuscatedName("client.ub")
    public static class481 field779;

    @ObfuscatedName("client.ui")
    public static class480 field780;

    @ObfuscatedName("client.up")
    public static class480 field644;

    @ObfuscatedName("client.uo")
    public static boolean field782;

    @ObfuscatedName("client.vf")
    public static boolean[] field619;

    @ObfuscatedName("client.vn")
    public static int[] field784;

    @ObfuscatedName("client.vl")
    public static int[] field785;

    @ObfuscatedName("client.vs")
    public static int[] field786;

    @ObfuscatedName("client.vj")
    public static int[] field772;

    @ObfuscatedName("client.vm")
    public static short field788;

    @ObfuscatedName("client.vv")
    public static short field778;

    @ObfuscatedName("client.vo")
    public static short field600;

    @ObfuscatedName("client.vc")
    public static short field791;

    @ObfuscatedName("client.vb")
    public static short field792;

    @ObfuscatedName("client.va")
    public static short field593;

    @ObfuscatedName("client.vk")
    public static short field760;

    @ObfuscatedName("client.vr")
    public static short field795;

    @ObfuscatedName("client.vq")
    public static int field790;

    @ObfuscatedName("client.vu")
    public static int field626;

    @ObfuscatedName("client.vw")
    public static int field541;

    @ObfuscatedName("client.vh")
    public static int field799;

    @ObfuscatedName("client.vg")
    public static int field800;

    @ObfuscatedName("client.vi")
    public static class330 field715;

    @ObfuscatedName("client.vz")
    public static int field721;

    @ObfuscatedName("client.vt")
    public static int field803;

    @ObfuscatedName("client.vy")
    public static class477 field804;

    @ObfuscatedName("client.wu")
    public static class369[] field805;

    @ObfuscatedName("client.we")
    public static class67 field806;

    @ObfuscatedName("client.wv")
    public static class425 field807;

    @ObfuscatedName("client.wc")
    public static class289 field560;

    @ObfuscatedName("client.wl")
    public static class289 field809;

    @ObfuscatedName("client.ws")
    public static int field620;

    @ObfuscatedName("client.wj")
    public static int field793;

    @ObfuscatedName("client.wh")
    public static List field655;

    @ObfuscatedName("client.wz")
    public static ArrayList field516;

    @ObfuscatedName("client.wb")
    public static int field814;

    @ObfuscatedName("client.wy")
    public static int field815;

    @ObfuscatedName("client.xm")
    public static final class66 field816;

    @ObfuscatedName("client.xk")
    public static int[] field796;

    @ObfuscatedName("client.xz")
    public static int[] field738;

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
        field567 = class387.method6026(var1);
        field568 = false;
        field569 = new class78();
        field573 = null;
        field574 = new class101[65536];
        field650 = 0;
        field576 = new int[65536];
        field802 = 0;
        field588 = new int[250];
        field521 = new class112();
        field627 = 0;
        field572 = false;
        field582 = new class415();
        field583 = new HashMap();
        field731 = 0;
        field585 = 1;
        field680 = 0;
        field587 = 1;
        field538 = 0;
        field589 = new class215[4];
        field590 = false;
        field591 = new int[4][13][13];
        field592 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field703 = 0;
        field594 = 2301979;
        field595 = 5063219;
        field596 = 3353893;
        field773 = 7759444;
        field817 = false;
        field599 = 0;
        field734 = 128;
        field654 = 0;
        field775 = 0;
        field603 = 0;
        field604 = 0;
        field818 = 0;
        field606 = 0;
        field607 = 50;
        field584 = 0;
        field609 = 0;
        field610 = 0;
        field611 = 12;
        field787 = 6;
        field625 = 0;
        field614 = false;
        field615 = 0;
        field708 = false;
        field617 = 0;
        field532 = 0;
        field616 = 50;
        field752 = new int[field616];
        field647 = new int[field616];
        field622 = new int[field616];
        field723 = new int[field616];
        field624 = new int[field616];
        field684 = new int[field616];
        field639 = new int[field616][];
        field580 = new int[field616];
        field628 = new String[field616];
        field629 = new int[104][104];
        field630 = 0;
        field631 = -1;
        field750 = -1;
        field633 = 0;
        field527 = 0;
        field766 = 0;
        field636 = 0;
        field640 = true;
        field638 = 0;
        field581 = true;
        field612 = new class92[2048];
        field801 = -1;
        field642 = 0;
        field643 = -1L;
        field767 = true;
        field645 = 0;
        field646 = 0;
        field602 = new int[1000];
        field648 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field662 = new String[8];
        field768 = new boolean[8];
        field705 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field652 = -1;
        field653 = new class379[4][104][104];
        field678 = new class379();
        field524 = new class379();
        field656 = new class379();
        field657 = new int[25];
        field578 = new int[25];
        field659 = new int[25];
        field660 = false;
        field661 = false;
        field679 = 0;
        field663 = new int[500];
        field664 = new int[500];
        field665 = new int[500];
        field789 = new int[500];
        field667 = new int[500];
        field668 = new String[500];
        field669 = new String[500];
        field670 = new boolean[500];
        field777 = false;
        field672 = false;
        field702 = true;
        field674 = -1;
        field675 = -1;
        field676 = 0;
        field677 = 50;
        field579 = 0;
        field558 = null;
        field742 = false;
        field681 = -1;
        field682 = -1;
        field637 = null;
        field735 = null;
        field685 = -1;
        field686 = new class490(8);
        field618 = 0;
        field688 = -1;
        field689 = 0;
        field690 = null;
        field691 = 0;
        field692 = 0;
        field693 = 0;
        field694 = -1;
        field695 = false;
        field696 = null;
        field597 = null;
        field605 = null;
        field699 = 0;
        field700 = 0;
        field701 = null;
        field762 = false;
        field649 = -1;
        field704 = -1;
        field810 = false;
        field706 = -1;
        field707 = -1;
        field601 = false;
        field709 = 1;
        field710 = new int[32];
        field711 = 0;
        field808 = new int[32];
        field687 = 0;
        field714 = new int[32];
        field712 = 0;
        field716 = new int[32];
        field794 = 0;
        field718 = 0;
        field764 = 0;
        field720 = 0;
        field554 = 0;
        field623 = 0;
        field722 = 0;
        field724 = 0;
        field725 = 0;
        field726 = 0;
        field727 = new class532();
        field728 = new class379();
        field729 = new class379();
        field730 = new class379();
        field811 = new class379();
        field732 = new class490(512);
        field733 = 0;
        field529 = -2;
        field719 = new boolean[100];
        field736 = new boolean[100];
        field737 = new boolean[100];
        field666 = new int[100];
        field739 = new int[100];
        field740 = new int[100];
        field741 = new int[100];
        field673 = 0;
        field743 = 0L;
        field547 = true;
        field745 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field746 = 0;
        field747 = 0;
        field748 = "";
        field749 = new long[100];
        field641 = 0;
        field751 = new class214();
        field613 = new class212();
        field753 = 0;
        field754 = new int[128];
        field755 = new int[128];
        field651 = -1L;
        field713 = new class155[4];
        field758 = new class164[4];
        field759 = -1;
        field621 = 0;
        field761 = new int[1000];
        field577 = new int[1000];
        field763 = new class528[1000];
        field598 = 0;
        field765 = 0;
        field671 = 0;
        field575 = false;
        field717 = 0;
        field769 = new int[50];
        field770 = new int[50];
        field771 = new int[50];
        field586 = new int[50];
        field812 = new class40[50];
        field774 = false;
        field776 = false;
        field798 = false;
        field783 = false;
        field779 = null;
        field780 = null;
        field644 = null;
        field782 = false;
        field619 = new boolean[5];
        field784 = new int[5];
        field785 = new int[5];
        field786 = new int[5];
        field772 = new int[5];
        field788 = 256;
        field778 = 205;
        field600 = 256;
        field791 = 320;
        field792 = 1;
        field593 = 32767;
        field760 = 1;
        field795 = 32767;
        field790 = 0;
        field626 = 0;
        field541 = 0;
        field799 = 0;
        field800 = 0;
        field715 = new class330();
        field721 = -1;
        field803 = -1;
        field804 = new class475();
        field805 = new class369[8];
        field806 = new class67();
        field807 = new class425(8, class423.field4610);
        field560 = new class289(64);
        field809 = new class289(64);
        field620 = -1;
        field793 = -1;
        field655 = new ArrayList();
        field516 = new ArrayList(10);
        field814 = 0;
        field815 = 0;
        field816 = new class66();
        field796 = new int[50];
        field738 = new int[50];
    }

    @ObfuscatedName("db.gq(I)Lsq;")
    public static class484 method2539() {
        return Statics.field1500;
    }

    @ObfuscatedName("client.bl(I)V")
    public final void method559() {
    }

    public final void init() {
        if (!this.method483()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class102.field1322)) {
                            field520 = true;
                        } else {
                            field520 = false;
                        }
                        break;
                    case 4:
                        if (field523 == -1) {
                            field523 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field518 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var4 = Integer.parseInt(var2);
                        class375 var5;
                        if (var4 >= 0 && var4 < class375.field4387.length) {
                            var5 = class375.field4387[var4];
                        } else {
                            var5 = null;
                        }
                        Statics.field884 = var5;
                        break;
                    case 7:
                        int var7 = Integer.parseInt(var2);
                        class348[] var8 = new class348[] { class348.field3868, class348.field3866, class348.field3869, class348.field3872 };
                        class348[] var9 = var8;
                        int var10 = 0;
                        class348 var12;
                        while (true) {
                            if (var10 >= var9.length) {
                                var12 = null;
                                break;
                            }
                            class348 var11 = var9[var10];
                            if (var11.field3870 == var7) {
                                var12 = var11;
                                break;
                            }
                            var10++;
                        }
                        Statics.field1045 = var12;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class102.field1322)) {
                        }
                        break;
                    case 9:
                        Statics.field264 = var2;
                        break;
                    case 10:
                        class349[] var6 = new class349[] { class349.field3877, class349.field3878, class349.field3881, class349.field3880, class349.field3874, class349.field3875 };
                        Statics.field139 = (class349) class374.method2465(var6, Integer.parseInt(var2));
                        if (Statics.field139 == class349.field3878) {
                            Statics.field4771 = class494.field4989;
                        } else {
                            Statics.field4771 = class494.field4990;
                        }
                        break;
                    case 11:
                        Statics.field1478 = var2;
                        break;
                    case 12:
                        field517 = Integer.parseInt(var2);
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
                        Statics.field300 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field519 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field3085 = var2;
                        break;
                    case 21:
                        field522 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field526 = Integer.parseInt(var2);
                        } else {
                            field526 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        method2261();
        Statics.field2094 = this.getCodeBase().getHost();
        Statics.field1701 = new class361();
        String var13 = Statics.field1045.field3867;
        byte var14 = 0;
        if ((field518 & 0x10000) != 0) {
            Statics.field1911 = "beta";
        }
        try {
            class174.method3250("oldschool", Statics.field1911, var13, var14, 22);
        } catch (Exception var16) {
            class541.method5458((String) null, var16);
        }
        Statics.field1352 = this;
        Statics.field5237 = field523;
        method2307();
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field563 = true;
        }
        if (field658 == -1) {
            if (this.method1196() || this.method1385()) {
                field658 = 5;
            } else {
                field658 = 0;
            }
        }
        this.method480(765, 503, 215, 1);
    }

    public void finalize() throws Throwable {
        class307.field3401.remove(this);
        super.finalize();
    }

    @ObfuscatedName("dm.gf(I)V")
    public static final void method2261() {
        class232.field2587 = false;
        field634 = false;
    }

    @ObfuscatedName("dx.gk(B)V")
    public static void method2307() {
        Statics.field115 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field1004 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field66 = System.getenv("JX_SESSION_ID");
        Statics.field961 = System.getenv("JX_CHARACTER_ID");
        String var0 = System.getenv("JX_DISPLAY_NAME");
        String var1;
        if (var0 == null || var0.isEmpty() || var0.charAt(0) == '#') {
            var1 = "";
        } else {
            var1 = var0;
        }
        class76.field941 = var1;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field561 = arg0;
            class76.method5513(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field565 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field813 == 10;
    }

    public long getAccountHash() {
        return this.field781;
    }

    @ObfuscatedName("client.gz(B)Z")
    public boolean method1196() {
        return Statics.field115 != null && !Statics.field115.trim().isEmpty() && Statics.field1004 != null && !Statics.field1004.trim().isEmpty();
    }

    @ObfuscatedName("client.gi(B)Z")
    public boolean method1385() {
        return Statics.field66 != null && !Statics.field66.trim().isEmpty() && Statics.field961 != null && !Statics.field961.trim().isEmpty();
    }

    @ObfuscatedName("client.gb(I)Z")
    public boolean method1686() {
        return this.field561 != null;
    }

    @ObfuscatedName("client.gn(Ljava/lang/String;I)V")
    public void method1199(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field1478 + "shield/oauth/token" + (new class465(var2)).method7636());
        class421 var4 = new class421();
        var4.method7060(field567);
        var4.method7057("Host", (new URL(Statics.field1478)).getHost());
        var4.method7064(class462.field4778);
        class10 var5 = class10.field44;
        RefreshAccessTokenRequester var6 = this.field565;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field563);
            this.field564 = this.field559.method175(var7);
        } else {
            this.field566 = var6.request(var5.method69(), var3, var4.method7074(), "");
        }
    }

    @ObfuscatedName("client.gu(Ljava/lang/String;I)V")
    public void method1200(String arg0) throws IOException {
        URL var2 = new URL(Statics.field1478 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class421 var3 = new class421();
        var3.method7061(arg0);
        class10 var4 = class10.field38;
        OtlTokenRequester var5 = this.field561;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field563);
            this.field635 = this.field559.method175(var6);
        } else {
            this.field562 = var5.request(var4.method69(), var2, var3.method7074(), "");
        }
    }

    @ObfuscatedName("client.gw(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1201(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field1478 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field44, this.field563);
        var4.method78().method7061(arg0);
        var4.method78().method7064(class462.field4778);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method79(new class464(var5));
        this.field635 = this.field559.method175(var4);
    }

    @ObfuscatedName("client.br(B)V")
    public final void method496() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field4557 = null;
            Statics.field1491 = null;
            Statics.field1697 = (byte[][][]) null;
            class413.field4558.clear();
            class413.field4558.add(100);
            class413.field4558.add(5000);
            class413.field4558.add(10000);
            class413.field4558.add(30000);
        } else {
            Statics.field4557 = var1;
            Statics.field1491 = new int[var1.length];
            Statics.field1697 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field4557.length; var3++) {
                Statics.field1697[var3] = new byte[var2[var3]][];
                class413.field4558.add(var1[var3]);
            }
            Collections.sort(class413.field4558);
        }
        Statics.field926 = field519 == 0 ? 43594 : field517 + 40000;
        Statics.field60 = field519 == 0 ? 443 : field517 + 50000;
        Statics.field3535 = Statics.field926;
        Statics.field197 = class332.field3606;
        Statics.field1777 = class332.field3605;
        Statics.field2763 = class332.field3603;
        Statics.field2981 = class332.field3604;
        Statics.field3013 = new class114(this.field563, 215);
        this.method472();
        this.method478();
        Statics.field3442 = this.method532();
        this.method474(field613, 0);
        this.method474(field751, 1);
        Statics.field1750 = new class444(255, class174.field1834, class174.field1837, 500000);
        Statics.field1686 = class99.method2811();
        this.method469();
        class32.method4984(this, Statics.field3545);
        method3866(Statics.field1686.method2376());
        Statics.field1858 = new class69(Statics.field4771);
        this.field559 = new class15("tokenRequest", 1, 1);
        class307.method2540(this);
        Statics.field2389 = new class218[1];
        class216 var4 = class216.field2350;
        Statics.field2389[0] = new class218(var4.field2358, var4.field2359);
    }

    @ObfuscatedName("jl.hf(B)Lih;")
    public static class214 method4579() {
        return field751;
    }

    @ObfuscatedName("client.bw(I)V")
    public final void method497() {
        field530++;
        this.method1203();
        class357.method7398();
        boolean var1 = class307.method2181(field530);
        if (var1 && field575 && Statics.field2048 != null) {
            Statics.field2048.method808();
        }
        method2560();
        field751.method3811();
        this.method473();
        class36 var2 = class36.field236;
        synchronized (class36.field236) {
            class36.field244 = class36.field240;
            class36.field245 = class36.field256;
            class36.field246 = class36.field242;
            class36.field247 = class36.field238;
            class36.field252 = class36.field248;
            class36.field253 = class36.field249;
            class36.field254 = class36.field250;
            class36.field255 = class36.field237;
            class36.field248 = 0;
        }
        if (Statics.field3442 != null) {
            int var4 = Statics.field3442.method294();
            field726 = var4;
        }
        if (field813 == 0) {
            method4189();
            class35.method3347();
        } else if (field813 == 5) {
            class76.method3236(this, Statics.field2226, Statics.field1431);
            method4189();
            class35.method3347();
        } else if (field813 == 10 || field813 == 11) {
            class76.method3236(this, Statics.field2226, Statics.field1431);
        } else if (field813 == 20) {
            class76.method3236(this, Statics.field2226, Statics.field1431);
            this.method1206();
        } else if (field813 == 50) {
            class76.method3236(this, Statics.field2226, Statics.field1431);
            this.method1206();
        } else if (field813 == 25) {
            method2809();
        }
        if (field813 == 30) {
            this.method1207();
        } else if (field813 == 40 || field813 == 45) {
            this.method1206();
        }
    }

    @ObfuscatedName("client.be(ZB)V")
    public final void method498(boolean arg0) {
        if ((field813 == 10 || field813 == 20 || field813 == 30) && field743 != 0L && class303.method2705() > field743) {
            method3866(method5997());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field719[var2] = true;
            }
        }
        if (field813 == 0) {
            this.method499(class76.field943, class76.field929, arg0);
        } else if (field813 == 5) {
            class76.method6795(Statics.field3792, Statics.field2226, Statics.field1431);
        } else if (field813 == 10 || field813 == 11) {
            class76.method6795(Statics.field3792, Statics.field2226, Statics.field1431);
        } else if (field813 == 20) {
            class76.method6795(Statics.field3792, Statics.field2226, Statics.field1431);
        } else if (field813 == 50) {
            class76.method6795(Statics.field3792, Statics.field2226, Statics.field1431);
        } else if (field813 == 25) {
            if (field538 == 1) {
                if (field731 > field585) {
                    field585 = field731;
                }
                int var3 = (field585 * 50 - field731 * 50) / field585;
                method2308(class353.field3902 + class102.field1330 + class102.field1326 + var3 + "%" + class102.field1325, false);
            } else if (field538 == 2) {
                if (field680 > field587) {
                    field587 = field680;
                }
                int var4 = (field587 * 50 - field680 * 50) / field587 + 50;
                method2308(class353.field3902 + class102.field1330 + class102.field1326 + var4 + "%" + class102.field1325, false);
            } else {
                method2308(class353.field3902, false);
            }
        } else if (field813 == 30) {
            this.method1210();
        } else if (field813 == 40) {
            method2308(class353.field3910 + class102.field1330 + class353.field3911, false);
        } else if (field813 == 45) {
            method2308(class353.field3915, false);
        }
        if (field813 == 30 && field673 == 0 && !arg0 && !field547) {
            for (int var5 = 0; var5 < field733; var5++) {
                if (field736[var5]) {
                    Statics.field1742.method454(field666[var5], field739[var5], field740[var5], field741[var5]);
                    field736[var5] = false;
                }
            }
        } else if (field813 > 0) {
            Statics.field1742.method453(0, 0);
            for (int var6 = 0; var6 < field733; var6++) {
                field736[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.bc(B)V")
    public final void method574() {
        if (Statics.field1181.method2580()) {
            Statics.field1181.method2597();
        }
        if (Statics.field5016 != null) {
            Statics.field5016.field1089 = false;
        }
        Statics.field5016 = null;
        field521.method2667();
        if (class36.field236 != null) {
            class36 var1 = class36.field236;
            synchronized (class36.field236) {
                class36.field236 = null;
            }
        }
        Statics.field3442 = null;
        if (Statics.field2048 != null) {
            Statics.field2048.method783();
        }
        Statics.field1701.method6208();
        class357.method6046();
        if (Statics.field3013 != null) {
            Statics.field3013.method2692();
            Statics.field3013 = null;
        }
        try {
            class174.field1834.method8039();
            for (int var3 = 0; var3 < Statics.field1841; var3++) {
                Statics.field3373[var3].method8039();
            }
            class174.field1837.method8039();
            class174.field1839.method8039();
        } catch (Exception var6) {
        }
        this.field559.method177();
    }

    @ObfuscatedName("dn.hv(I)V")
    public static void method2182() {
        if (Statics.field1181.method2580()) {
            Statics.field1181.method2597();
        }
        if (Statics.field5016 != null) {
            Statics.field5016.field1089 = false;
        }
        Statics.field5016 = null;
        field521.method2667();
        if (Statics.field206 != null) {
            try {
                Statics.field206.method3203();
            } catch (Exception var6) {
            }
        }
        Statics.field206 = null;
        method3072();
        Statics.field2052.method6131();
        Statics.field4954.method6131();
        Statics.field274.method6131();
        Statics.field1971.method6131();
        Statics.field830.method6131();
        Statics.field1359.method6131();
        Statics.field1403.method6131();
        Statics.field886.method6131();
        Statics.field55 = null;
        Statics.field342 = null;
        Statics.field3067 = null;
        Statics.field5042 = null;
        Statics.field93 = null;
        Statics.field3859 = null;
        Statics.field1015 = null;
        Statics.field2305 = null;
        Statics.field3390 = null;
        Statics.field3372 = null;
        Statics.field3045 = null;
        Statics.field1458.method4320();
        for (int var1 = 0; var1 < 4; var1++) {
            field589[var1].method3824();
        }
        Statics.field1500 = null;
        class307.method3865(0, 0);
        class307.field3399.clear();
        field575 = false;
        class70.method2896();
        if (Statics.field2048 != null) {
            Statics.field2048.method783();
        }
        Statics.field1701.method6208();
        class357.method6046();
        if (Statics.field3013 != null) {
            Statics.field3013.method2692();
        }
        try {
            class174.field1834.method8039();
            for (int var2 = 0; var2 < Statics.field1841; var2++) {
                Statics.field3373[var2].method8039();
            }
            class174.field1837.method8039();
            class174.field1839.method8039();
        } catch (Exception var7) {
        }
        class174.field1834 = null;
        class174.field1837 = null;
        Statics.field3373 = null;
        class176.field1848.clear();
        Statics.field1750 = null;
        field516.clear();
        field815 = 0;
        Statics.field1701 = new class361();
        Statics.field3013 = new class114(Statics.field1352.field563, 215);
        try {
            class174.method3250("oldschool", Statics.field1911, Statics.field1045.field3867, 0, 22);
        } catch (IOException var5) {
            throw new RuntimeException(var5);
        }
        Statics.field1750 = new class444(255, class174.field1834, class174.field1837, 500000);
        Statics.field206 = new class172();
        field548 = class93.field1145;
        method2854(0);
    }

    @ObfuscatedName("ep.hp(IB)V")
    public static void method2854(int arg0) {
        if (field813 == arg0) {
            return;
        }
        if (field813 == 30) {
            field613.method3783();
        }
        if (field813 == 0) {
            Statics.field1352.method627();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method2782(0);
            field553 = 0;
            field797 = 0;
            field582.method7021(arg0);
            if (arg0 != 20) {
                method6247(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1462 != null) {
            Statics.field1462.method7348();
            Statics.field1462 = null;
        }
        if (field813 == 25) {
            field538 = 0;
            field731 = 0;
            field585 = 1;
            field680 = 0;
            field587 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field1686.method2428() >= field522;
            int var3 = var2 ? 0 : 12;
            Statics.method2774(Statics.field1566, Statics.field4437, true, var3);
        } else if (arg0 == 20) {
            int var1 = field813 == 11 ? 4 : 0;
            Statics.method2774(Statics.field1566, Statics.field4437, false, var1);
        } else if (arg0 == 11) {
            Statics.method2774(Statics.field1566, Statics.field4437, false, 4);
        } else if (arg0 == 50) {
            class76.method2306("", "Updating date of birth...", "");
            Statics.method2774(Statics.field1566, Statics.field4437, false, 7);
        } else {
            class76.method4664();
        }
        field813 = arg0;
    }

    @ObfuscatedName("client.hh(I)V")
    public void method1203() {
        if (field813 != 1000) {
            boolean var1 = Statics.field1701.method6213();
            if (!var1) {
                this.method1204();
            }
        }
    }

    @ObfuscatedName("client.hg(I)V")
    public void method1204() {
        if (Statics.field1701.field4319 >= 4) {
            this.method489("js5crc");
            method2854(1000);
            return;
        }
        if (Statics.field1701.field4299 >= 4) {
            if (field813 <= 5) {
                this.method489("js5io");
                method2854(1000);
                return;
            }
            field550 = 3000;
            Statics.field1701.field4299 = 3;
        }
        if (--field550 + 1 > 0) {
            return;
        }
        try {
            if (field549 == 0) {
                Statics.field3376 = Statics.field206.method3209(Statics.field2094, Statics.field3535);
                field549++;
            }
            if (field549 == 1) {
                if (Statics.field3376.field1876 == 2) {
                    this.method1697(-1);
                    return;
                }
                if (Statics.field3376.field1876 == 1) {
                    field549++;
                }
            }
            if (field549 == 2) {
                Statics.field1665 = class440.method5431((Socket) Statics.field3376.field1881, 40000, 5000);
                class514 var1 = new class514(5);
                var1.method8227(15);
                var1.method8230(215);
                Statics.field1665.method7347(var1.field5070, 0, 5);
                field549++;
                Statics.field2060 = class303.method2705();
            }
            if (field549 == 3) {
                if (Statics.field1665.method7344() > 0) {
                    int var2 = Statics.field1665.method7361();
                    if (var2 != 0) {
                        this.method1697(var2);
                        return;
                    }
                    field549++;
                } else if (class303.method2705() - Statics.field2060 > 30000L) {
                    this.method1697(-2);
                    return;
                }
            }
            if (field549 == 4) {
                Statics.field1701.method6201(Statics.field1665, field813 > 20);
                Statics.field3376 = null;
                Statics.field1665 = null;
                field549 = 0;
                field551 = 0;
            }
        } catch (IOException var4) {
            this.method1697(-3);
        }
    }

    @ObfuscatedName("client.ho(II)V")
    public void method1697(int arg0) {
        Statics.field3376 = null;
        Statics.field1665 = null;
        field549 = 0;
        if (Statics.field926 == Statics.field3535) {
            Statics.field3535 = Statics.field60;
        } else {
            Statics.field3535 = Statics.field926;
        }
        field551++;
        if (field551 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field813 <= 5) {
                this.method489("js5connect_full");
                method2854(1000);
            } else {
                field550 = 3000;
            }
        } else if (field551 >= 2 && arg0 == 6) {
            this.method489("js5connect_outofdate");
            method2854(1000);
        } else if (field551 >= 4) {
            if (field813 <= 5) {
                this.method489("js5connect");
                method2854(1000);
            } else {
                field550 = 3000;
            }
        }
    }

    @ObfuscatedName("hd.he(Lny;Ljava/lang/String;I)V")
    public static void method3436(class358 arg0, String arg1) {
        class84 var2 = new class84(arg0, arg1);
        field516.add(var2);
        field815 += var2.field1041;
    }

    @ObfuscatedName("bn.hx(I)Z")
    public static boolean method423() {
        if (field516 == null || field814 >= field516.size()) {
            return true;
        }
        while (field814 < field516.size()) {
            class84 var0 = (class84) field516.get(field814);
            if (!var0.method2161()) {
                return false;
            }
            field814++;
        }
        return true;
    }

    @ObfuscatedName("gh.ha(I)I")
    public static int method3110() {
        if (field516 == null || field814 >= field516.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field814; var1++) {
            var0 += ((class84) field516.get(var1)).field1043;
        }
        return var0 * 10000 / field815;
    }

    @ObfuscatedName("qg.hr(IB)I")
    public static int method7229(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("qd.hm(IIB)V")
    public static void method7114(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = method7229(var4);
            int var6 = class228.field2509[var4];
            int var7 = method7289(var5, arg1);
            var2[var3] = var6 * var7 >> 16;
        }
        class232.method4332(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("ik.hz(B)V")
    public static void method4189() {
        if (field548 == class93.field1145) {
            Statics.field1458 = new class232(4, 104, 104, class82.field1023);
            for (int var0 = 0; var0 < 4; var0++) {
                field589[var0] = new class215(104, 104);
            }
            Statics.field2622 = new class528(512, 512);
            class76.field929 = class353.field4179;
            class76.field943 = 5;
            field548 = class93.field1147;
        } else if (field548 == class93.field1147) {
            class76.field929 = class353.field4162;
            class76.field943 = 10;
            field548 = class93.field1144;
        } else if (field548 == class93.field1144) {
            Statics.field1695 = Statics.method2274(0, false, true, true, false);
            Statics.field1354 = Statics.method2274(1, false, true, true, false);
            Statics.field2052 = Statics.method2274(2, true, false, true, false);
            Statics.field2855 = Statics.method2274(3, false, true, true, false);
            Statics.field1677 = Statics.method2274(4, false, true, true, false);
            Statics.field120 = Statics.method2274(5, true, true, true, false);
            Statics.field70 = Statics.method2274(6, true, true, true, false);
            Statics.field26 = Statics.method2274(7, false, true, true, false);
            Statics.field4437 = Statics.method2274(8, false, true, true, false);
            Statics.field1671 = Statics.method2274(9, false, true, true, false);
            Statics.field1566 = Statics.method2274(10, false, true, true, false);
            Statics.field512 = Statics.method2274(11, false, true, true, false);
            Statics.field1499 = Statics.method2274(12, false, true, true, false);
            Statics.field4954 = Statics.method2274(13, true, false, true, false);
            Statics.field274 = Statics.method2274(14, false, true, true, false);
            Statics.field1971 = Statics.method2274(15, false, true, true, false);
            Statics.field830 = Statics.method2274(17, true, true, true, false);
            Statics.field1359 = Statics.method2274(18, false, true, true, false);
            Statics.field1403 = Statics.method2274(19, false, true, true, false);
            Statics.field886 = Statics.method2274(20, false, true, true, false);
            Statics.field1853 = Statics.method2274(21, false, true, true, true);
            class76.field929 = class353.field4197;
            class76.field943 = 20;
            field548 = class93.field1156;
        } else if (field548 == class93.field1156) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1695.method6065() * 4 / 100;
            int var3 = var2 + Statics.field1354.method6065() * 4 / 100;
            int var4 = var3 + Statics.field2052.method6065() * 2 / 100;
            int var5 = var4 + Statics.field2855.method6065() * 2 / 100;
            int var6 = var5 + Statics.field1677.method6065() * 6 / 100;
            int var7 = var6 + Statics.field120.method6065() * 4 / 100;
            int var8 = var7 + Statics.field70.method6065() * 2 / 100;
            int var9 = var8 + Statics.field26.method6065() * 55 / 100;
            int var10 = var9 + Statics.field4437.method6065() * 2 / 100;
            int var11 = var10 + Statics.field1671.method6065() * 2 / 100;
            int var12 = var11 + Statics.field1566.method6065() * 2 / 100;
            int var13 = var12 + Statics.field512.method6065() * 2 / 100;
            int var14 = var13 + Statics.field1499.method6065() * 2 / 100;
            int var15 = var14 + Statics.field4954.method6065() * 2 / 100;
            int var16 = var15 + Statics.field274.method6065() * 2 / 100;
            int var17 = var16 + Statics.field1971.method6065() * 2 / 100;
            int var18 = var17 + Statics.field1403.method6065() / 100;
            int var19 = var18 + Statics.field1359.method6065() / 100;
            int var20 = var19 + Statics.field886.method6065() / 100;
            int var21 = var20 + Statics.field1853.method6065() / 100;
            int var22 = var21 + (Statics.field830.method6088() && Statics.field830.method6133() ? 1 : 0);
            if (var22 == 100) {
                method3436(Statics.field1695, "Animations");
                method3436(Statics.field1354, "Skeletons");
                method3436(Statics.field1677, "Sound FX");
                method3436(Statics.field120, "Maps");
                method3436(Statics.field70, "Music Tracks");
                method3436(Statics.field26, "Models");
                method3436(Statics.field4437, "Sprites");
                method3436(Statics.field512, "Music Jingles");
                method3436(Statics.field274, "Music Samples");
                method3436(Statics.field1971, "Music Patches");
                method3436(Statics.field1403, "World Map");
                method3436(Statics.field1359, "World Map Geography");
                method3436(Statics.field886, "World Map Ground");
                Statics.field3889 = new class446();
                Statics.field3889.method7416(Statics.field830);
                class76.field929 = class353.field4074;
                class76.field943 = 30;
                field548 = class93.field1146;
            } else {
                if (var22 != 0) {
                    class76.field929 = class353.field3928 + var22 + "%";
                }
                class76.field943 = 30;
            }
        } else if (field548 == class93.field1146) {
            class43.method4940(22050, !field634, 2);
            ArrayList var23 = new ArrayList(3);
            class172 var24 = Statics.field206;
            short var25 = 2048;
            if (Statics.field315 == 0) {
                throw new IllegalStateException();
            }
            if (var25 < 256) {
                var25 = 256;
            }
            class43 var27;
            try {
                class43 var26 = Statics.field3459.method302();
                var26.field304 = new int[(Statics.field4376 ? 2 : 1) * 256];
                var26.field305 = var25;
                var26.method318();
                var26.field319 = (var25 & 0xFFFFFC00) + 1024;
                if (var26.field319 > 16384) {
                    var26.field319 = 16384;
                }
                var26.method334(var26.field319);
                if (Statics.field1887 > 0 && Statics.field2976 == null) {
                    Statics.field2976 = new class45();
                    Statics.field3028 = Executors.newScheduledThreadPool(1);
                    Statics.field3028.scheduleAtFixedRate(Statics.field2976, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field2976 != null) {
                    if (Statics.field2976.field334[0] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field2976.field334[0] = var26;
                }
                var27 = var26;
            } catch (Throwable var113) {
                var27 = new class43();
            }
            Statics.field2048 = var27;
            Statics.field1039 = new class39();
            class39 var29 = new class39();
            var29.method693(Statics.field1039);
            for (int var30 = 0; var30 < 3; var30++) {
                class308 var31 = new class308();
                var31.method5266(9, 128);
                var29.method693(var31);
                var23.add(var31);
            }
            Statics.field2048.method774(var29);
            class307.method5055(Statics.field1971, Statics.field274, Statics.field1677, var23);
            Statics.field339 = new class58(22050, Statics.field315);
            class76.field929 = class353.field3917;
            class76.field943 = 35;
            field548 = class93.field1142;
            Statics.field2505 = new class485(Statics.field4437, Statics.field4954);
        } else if (field548 == class93.field1142) {
            int var32 = class486.method7937().length;
            class485 var33 = Statics.field2505;
            class486[] var34 = new class486[] { class486.field4956, class486.field4951, class486.field4953, class486.field4959, class486.field4949, class486.field4952 };
            field583 = var33.method7932(var34);
            if (field583.size() < var32) {
                class76.field929 = class353.field3918 + field583.size() * 100 / var32 + "%";
                class76.field943 = 40;
            } else {
                Statics.field2226 = (class395) field583.get(class486.field4959);
                Statics.field1431 = (class395) field583.get(class486.field4949);
                Statics.field3792 = (class395) field583.get(class486.field4951);
                Statics.field2043 = field804.method7677();
                class76.field929 = class353.field4104;
                class76.field943 = 40;
                field548 = class93.field1148;
            }
        } else if (field548 == class93.field1148) {
            class358 var35 = Statics.field1566;
            class358 var36 = Statics.field4437;
            int var37 = 0;
            String[] var38 = class76.field920;
            for (int var39 = 0; var39 < var38.length; var39++) {
                String var40 = var38[var39];
                if (var35.method6137(var40, "")) {
                    var37++;
                }
            }
            String[] var41 = class76.field955;
            for (int var42 = 0; var42 < var41.length; var42++) {
                String var43 = var41[var42];
                if (var36.method6137(var43, "")) {
                    var37++;
                }
            }
            String[] var44 = class76.field935;
            for (int var45 = 0; var45 < var44.length; var45++) {
                String var46 = var44[var45];
                if (var36.method6129(var46) != -1 && var36.method6137(var46, "")) {
                    var37++;
                }
            }
            int var49 = class76.method6031(Statics.field4437);
            if (var37 < var49) {
                class76.field929 = class353.field3984 + var37 * 100 / var49 + "%";
                class76.field943 = 50;
            } else {
                class76.field929 = class353.field3921;
                class76.field943 = 50;
                method2854(5);
                field548 = class93.field1149;
            }
        } else if (field548 == class93.field1149) {
            if (!Statics.field2052.method6133()) {
                class76.field929 = class353.field3934 + Statics.field2052.method6076() + "%";
                class76.field943 = 60;
            } else if (Statics.field1853.method6133()) {
                class209.method2989(Statics.field2052);
                class358 var50 = Statics.field2052;
                Statics.field2080 = var50;
                class190.method2743(Statics.field2052, Statics.field26);
                class358 var51 = Statics.field2052;
                class358 var52 = Statics.field26;
                boolean var53 = field634;
                Statics.field2138 = var51;
                Statics.field2136 = var52;
                class207.field2151 = var53;
                class358 var54 = Statics.field2052;
                class358 var55 = Statics.field26;
                Statics.field5212 = var54;
                Statics.field1998 = var55;
                class205.method285(Statics.field2052);
                class208.method1979(Statics.field2052, Statics.field26, field520, Statics.field2226);
                class210.method6972(Statics.field2052, Statics.field1695, Statics.field1354);
                class358 var56 = Statics.field2052;
                class358 var57 = Statics.field26;
                Statics.field2069 = var56;
                Statics.field394 = var57;
                class202.method690(Statics.field2052);
                class358 var58 = Statics.field2052;
                Statics.field1910 = var58;
                Statics.field1905 = Statics.field1910.method6127(16);
                class358 var59 = Statics.field2855;
                class358 var60 = Statics.field26;
                class358 var61 = Statics.field4437;
                class358 var62 = Statics.field4954;
                int var63 = 0;
                if (var59 != null) {
                    Statics.field1047 = var59;
                    Statics.field2819 = var60;
                    Statics.field1474 = var61;
                    Statics.field2832 = var62;
                    var63 = Statics.field1047.method6128();
                }
                Statics.field1046 = new class333[var63][];
                Statics.field3692 = new boolean[var63];
                class358 var64 = Statics.field2052;
                Statics.field1898 = var64;
                class358 var65 = Statics.field2052;
                Statics.field1980 = var65;
                class358 var66 = Statics.field2052;
                Statics.field1938 = var66;
                class358 var67 = Statics.field2052;
                class358 var68 = Statics.field2052;
                Statics.field2101 = var68;
                class507.method6953(Statics.field2052);
                Statics.method6342(Statics.field2052);
                Statics.field3093 = new class499(Statics.field139, 54, Statics.field884, Statics.field2052);
                Statics.field3842 = new class499(Statics.field139, 47, Statics.field884, Statics.field2052);
                Statics.field1181 = new class110();
                class358 var69 = Statics.field2052;
                class358 var70 = Statics.field4437;
                class358 var71 = Statics.field4954;
                Statics.field2117 = var69;
                Statics.field4439 = var70;
                Statics.field2111 = var71;
                class358 var72 = Statics.field2052;
                class358 var73 = Statics.field4437;
                Statics.field1958 = var72;
                Statics.field1955 = var73;
                class358 var74 = Statics.field2052;
                class358 var75 = Statics.field4437;
                Statics.field1914 = var75;
                if (var74.method6133()) {
                    Statics.field436 = var74.method6127(35);
                    Statics.field3784 = new class188[Statics.field436];
                    for (int var76 = 0; var76 < Statics.field436; var76++) {
                        byte[] var77 = var74.method6117(35, var76);
                        Statics.field3784[var76] = new class188(var76);
                        if (var77 != null) {
                            Statics.field3784[var76].method3278(new class514(var77));
                            Statics.field3784[var76].method3287();
                        }
                    }
                }
                class76.field929 = class353.field3923;
                class76.field943 = 60;
                field548 = class93.field1152;
            } else {
                class76.field929 = class353.field3934 + (80 + Statics.field1499.method6076() / 6) + "%";
                class76.field943 = 60;
            }
        } else if (field548 == class93.field1152) {
            int var78 = 0;
            if (Statics.field55 == null) {
                Statics.field55 = class529.method7931(Statics.field4437, Statics.field3889.field4716, 0);
            } else {
                var78++;
            }
            if (Statics.field342 == null) {
                Statics.field342 = class529.method7931(Statics.field4437, Statics.field3889.field4709, 0);
            } else {
                var78++;
            }
            if (Statics.field3067 == null) {
                class358 var79 = Statics.field4437;
                int var80 = Statics.field3889.field4710;
                byte[] var81 = var79.method6117(var80, 0);
                boolean var82;
                if (var81 == null) {
                    var82 = false;
                } else {
                    class529.method3490(var81);
                    var82 = true;
                }
                class527[] var83;
                if (var82) {
                    class527[] var84 = new class527[Statics.field5179];
                    for (int var85 = 0; var85 < Statics.field5179; var85++) {
                        class527 var86 = var84[var85] = new class527();
                        var86.field5162 = Statics.field5175;
                        var86.field5159 = Statics.field5177;
                        var86.field5158 = Statics.field4984[var85];
                        var86.field5160 = Statics.field1598[var85];
                        var86.field5157 = Statics.field1832[var85];
                        var86.field5155 = Statics.field5178[var85];
                        var86.field5156 = Statics.field5176;
                        var86.field5161 = Statics.field4241[var85];
                    }
                    class529.method8143();
                    var83 = var84;
                } else {
                    var83 = null;
                }
                Statics.field3067 = var83;
            } else {
                var78++;
            }
            if (Statics.field5042 == null) {
                Statics.field5042 = class529.method7579(Statics.field4437, Statics.field3889.field4711, 0);
            } else {
                var78++;
            }
            if (Statics.field93 == null) {
                Statics.field93 = class529.method7579(Statics.field4437, Statics.field3889.field4713, 0);
            } else {
                var78++;
            }
            if (Statics.field3859 == null) {
                Statics.field3859 = class529.method7579(Statics.field4437, Statics.field3889.field4708, 0);
            } else {
                var78++;
            }
            if (Statics.field1015 == null) {
                Statics.field1015 = class529.method7579(Statics.field4437, Statics.field3889.field4714, 0);
            } else {
                var78++;
            }
            if (Statics.field2305 == null) {
                Statics.field2305 = class529.method7579(Statics.field4437, Statics.field3889.field4715, 0);
            } else {
                var78++;
            }
            if (Statics.field3390 == null) {
                Statics.field3390 = class529.method7579(Statics.field4437, Statics.field3889.field4712, 0);
            } else {
                var78++;
            }
            if (Statics.field3372 == null) {
                class358 var88 = Statics.field4437;
                int var89 = Statics.field3889.field4717;
                byte[] var90 = var88.method6117(var89, 0);
                boolean var91;
                if (var90 == null) {
                    var91 = false;
                } else {
                    class529.method3490(var90);
                    var91 = true;
                }
                class527[] var92;
                if (var91) {
                    class527[] var93 = new class527[Statics.field5179];
                    for (int var94 = 0; var94 < Statics.field5179; var94++) {
                        class527 var95 = var93[var94] = new class527();
                        var95.field5162 = Statics.field5175;
                        var95.field5159 = Statics.field5177;
                        var95.field5158 = Statics.field4984[var94];
                        var95.field5160 = Statics.field1598[var94];
                        var95.field5157 = Statics.field1832[var94];
                        var95.field5155 = Statics.field5178[var94];
                        var95.field5156 = Statics.field5176;
                        var95.field5161 = Statics.field4241[var94];
                    }
                    class529.method8143();
                    var92 = var93;
                } else {
                    var92 = null;
                }
                Statics.field3372 = var92;
            } else {
                var78++;
            }
            if (Statics.field3045 == null) {
                class358 var97 = Statics.field4437;
                int var98 = Statics.field3889.field4718;
                byte[] var99 = var97.method6117(var98, 0);
                boolean var100;
                if (var99 == null) {
                    var100 = false;
                } else {
                    class529.method3490(var99);
                    var100 = true;
                }
                class527[] var101;
                if (var100) {
                    class527[] var102 = new class527[Statics.field5179];
                    for (int var103 = 0; var103 < Statics.field5179; var103++) {
                        class527 var104 = var102[var103] = new class527();
                        var104.field5162 = Statics.field5175;
                        var104.field5159 = Statics.field5177;
                        var104.field5158 = Statics.field4984[var103];
                        var104.field5160 = Statics.field1598[var103];
                        var104.field5157 = Statics.field1832[var103];
                        var104.field5155 = Statics.field5178[var103];
                        var104.field5156 = Statics.field5176;
                        var104.field5161 = Statics.field4241[var103];
                    }
                    class529.method8143();
                    var101 = var102;
                } else {
                    var101 = null;
                }
                Statics.field3045 = var101;
            } else {
                var78++;
            }
            if (var78 < 11) {
                class76.field929 = class353.field4165 + var78 * 100 / 12 + "%";
                class76.field943 = 70;
            } else {
                Statics.field4487 = Statics.field3045;
                Statics.field342.method8701();
                int var106 = (int) (Math.random() * 21.0D) - 10;
                int var107 = (int) (Math.random() * 21.0D) - 10;
                int var108 = (int) (Math.random() * 21.0D) - 10;
                int var109 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3067[0].method8682(var106 + var109, var107 + var109, var108 + var109);
                class76.field929 = class353.field3925;
                class76.field943 = 70;
                field548 = class93.field1151;
            }
        } else if (field548 == class93.field1151) {
            if (Statics.field1671.method6133()) {
                Statics.field1432 = new class238(Statics.field1671, Statics.field4437, 20, Statics.field1686.method2365(), field634 ? 64 : 128);
                class228.method4036(Statics.field1432);
                class228.method4037(Statics.field1686.method2365());
                field548 = class93.field1150;
            } else {
                class76.field929 = class353.field3926 + "0%";
                class76.field943 = 90;
            }
        } else if (field548 == class93.field1150) {
            int var110 = Statics.field1432.method4385();
            if (var110 < 100) {
                class76.field929 = class353.field3926 + var110 + "%";
                class76.field943 = 90;
            } else {
                class76.field929 = class353.field3927;
                class76.field943 = 90;
                field548 = class93.field1153;
            }
        } else if (field548 == class93.field1153) {
            Statics.field5016 = new class89();
            Statics.field206.method3205(Statics.field5016, 10);
            class76.field929 = class353.field3901;
            class76.field943 = 92;
            field548 = class93.field1154;
        } else if (field548 == class93.field1154) {
            if (Statics.field1566.method6137("huffman", "")) {
                class335 var111 = new class335(Statics.field1566.method6136("huffman", ""));
                Statics.field3785 = var111;
                class76.field929 = class353.field4082;
                class76.field943 = 94;
                field548 = class93.field1155;
            } else {
                class76.field929 = class353.field3929 + "%";
                class76.field943 = 94;
            }
        } else if (field548 == class93.field1155) {
            if (!Statics.field2855.method6133()) {
                class76.field929 = class353.field3931 + Statics.field2855.method6076() * 4 / 5 + "%";
                class76.field943 = 96;
            } else if (!Statics.field1499.method6133()) {
                class76.field929 = class353.field3931 + (80 + Statics.field1499.method6076() / 6) + "%";
                class76.field943 = 96;
            } else if (Statics.field4954.method6133()) {
                class76.field929 = class353.field3932;
                class76.field943 = 98;
                if (Statics.field1499.method6135("version.dat", "")) {
                    class514 var112 = new class514(Statics.field1499.method6136("version.dat", ""));
                    var112.method8246();
                }
                field548 = class93.field1143;
            } else {
                class76.field929 = class353.field3931 + (96 + Statics.field4954.method6076() / 50) + "%";
                class76.field943 = 96;
            }
        } else if (field548 == class93.field1143) {
            class76.field943 = 100;
            if (Statics.field1403.method6128() <= 0 || Statics.field1403.method6138(class277.field3051.field3048)) {
                if (Statics.field1500 == null) {
                    Statics.field1500 = new class484();
                    Statics.field1500.method7911(Statics.field1403, Statics.field1359, Statics.field886, Statics.field3792, field583, Statics.field3067);
                }
                class76.field929 = class353.field3999;
                field548 = class93.field1157;
            } else {
                class76.field929 = class353.field3933 + Statics.field1403.method6152(class277.field3051.field3048) / 10 + "%";
            }
        } else if (field548 == class93.field1157) {
            method2854(10);
        }
    }

    @ObfuscatedName("client.hi(B)V")
    public final void method1206() {
        class440 var1 = field521.method2658();
        class513 var2 = field521.field1412;
        try {
            if (field552 == 0) {
                if (Statics.field1893 == null && (field569.method2055() || field553 > 250)) {
                    Statics.field1893 = field569.method2056();
                    field569.method2054();
                    field569 = null;
                }
                if (Statics.field1893 != null) {
                    if (var1 != null) {
                        var1.method7348();
                        var1 = null;
                    }
                    Statics.field4772 = null;
                    field572 = false;
                    field553 = 0;
                    if (!field557.method8550()) {
                        method2782(1);
                    } else if (this.method1196()) {
                        try {
                            this.method1199(Statics.field1004);
                            method2782(21);
                        } catch (Throwable var79) {
                            class541.method5458((String) null, var79);
                            method6246(65);
                            return;
                        }
                    } else if (this.method1385()) {
                        try {
                            this.method1201(Statics.field66, Statics.field961);
                            method2782(20);
                        } catch (Exception var78) {
                            class541.method5458((String) null, var78);
                            method6246(65);
                            return;
                        }
                    } else {
                        method6246(65);
                        return;
                    }
                }
            }
            if (field552 == 21) {
                if (this.field566 == null) {
                    if (this.field564 == null) {
                        method6246(65);
                        return;
                    }
                    if (!this.field564.method253()) {
                        return;
                    }
                    if (this.field564.method256()) {
                        class541.method5458(this.field564.method255(), (Throwable) null);
                        method6246(65);
                        this.field564 = null;
                        return;
                    }
                    class21 var7 = this.field564.method258();
                    if (var7.method277() != 200) {
                        method6246(65);
                        this.field564 = null;
                        return;
                    }
                    field553 = 0;
                    class464 var8 = new class464(var7.method279());
                    try {
                        Statics.field115 = var8.method7628().getString("access_token");
                        Statics.field1004 = var8.method7628().getString("refresh_token");
                    } catch (Exception var76) {
                        class541.method5458("Error parsing tokens", var76);
                        method6246(65);
                        this.field564 = null;
                        return;
                    }
                } else if (this.field566.isDone()) {
                    if (this.field566.isCancelled()) {
                        method6246(65);
                        this.field566 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field566.get();
                        if (!var5.isSuccess()) {
                            method6246(65);
                            this.field566 = null;
                            return;
                        }
                        Statics.field115 = var5.getAccessToken();
                        Statics.field1004 = var5.getRefreshToken();
                        this.field566 = null;
                    } catch (Exception var77) {
                        class541.method5458((String) null, var77);
                        method6246(65);
                        this.field566 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1200(Statics.field115);
                method2782(20);
            }
            if (field552 == 20) {
                if (this.field562 == null) {
                    if (this.field635 == null) {
                        method6246(65);
                        return;
                    }
                    if (!this.field635.method253()) {
                        return;
                    }
                    if (this.field635.method256()) {
                        class541.method5458(this.field635.method255(), (Throwable) null);
                        method6246(65);
                        this.field635 = null;
                        return;
                    }
                    class21 var12 = this.field635.method258();
                    if (var12.method277() != 200) {
                        class541.method5458("Response code: " + var12.method277() + "Response body: " + var12.method279(), (Throwable) null);
                        method6246(65);
                        this.field635 = null;
                        return;
                    }
                    List var13 = (List) var12.method278().get("Content-Type");
                    if (var13 != null && var13.contains(class462.field4778.method7617())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method279());
                            this.field698 = var14.getString("token");
                        } catch (JSONException var74) {
                            class541.method5458((String) null, var74);
                            method6246(65);
                            this.field635 = null;
                            return;
                        }
                    } else {
                        this.field698 = var12.method279();
                    }
                    this.field635 = null;
                } else if (this.field562.isDone()) {
                    if (this.field562.isCancelled()) {
                        method6246(65);
                        this.field562 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field562.get();
                        if (!var10.isSuccess()) {
                            method6246(65);
                            this.field562 = null;
                            return;
                        }
                        this.field698 = var10.getToken();
                        this.field562 = null;
                    } catch (Exception var75) {
                        class541.method5458((String) null, var75);
                        method6246(65);
                        this.field562 = null;
                        return;
                    }
                } else {
                    return;
                }
                field553 = 0;
                method2782(1);
            }
            if (field552 == 1) {
                if (Statics.field4772 == null) {
                    Statics.field4772 = Statics.field206.method3209(Statics.field2094, Statics.field3535);
                }
                if (Statics.field4772.field1876 == 2) {
                    throw new IOException();
                }
                if (Statics.field4772.field1876 == 1) {
                    var1 = class440.method5431((Socket) Statics.field4772.field1881, 40000, 5000);
                    field521.method2654(var1);
                    Statics.field4772 = null;
                    method2782(2);
                }
            }
            if (field552 == 2) {
                field521.method2651();
                class298 var16 = class298.method2870();
                var16.field3214 = null;
                var16.field3206 = 0;
                var16.field3205 = new class513(5000);
                var16.field3205.method8227(class300.field3342.field3340);
                field521.method2669(var16);
                field521.method2652();
                var2.field5072 = 0;
                method2782(3);
            }
            if (field552 == 3) {
                if (Statics.field2048 != null) {
                    Statics.field2048.method776();
                }
                if (var1.method7356(1)) {
                    int var19 = var1.method7361();
                    if (Statics.field2048 != null) {
                        Statics.field2048.method776();
                    }
                    if (var19 != 0) {
                        method6246(var19);
                        return;
                    }
                    var2.field5072 = 0;
                    method2782(4);
                }
            }
            if (field552 == 4) {
                if (var2.field5072 < 8) {
                    int var20 = var1.method7344();
                    if (var20 > 8 - var2.field5072) {
                        var20 = 8 - var2.field5072;
                    }
                    if (var20 > 0) {
                        var1.method7362(var2.field5070, var2.field5072, var20);
                        var2.field5072 += var20;
                    }
                }
                if (var2.field5072 == 8) {
                    var2.field5072 = 0;
                    Statics.field3480 = var2.method8251();
                    method2782(5);
                }
            }
            if (field552 == 5) {
                field521.field1412.field5072 = 0;
                field521.method2651();
                class513 var21 = new class513(500);
                int[] var22 = new int[] { Statics.field1893.nextInt(), Statics.field1893.nextInt(), Statics.field1893.nextInt(), Statics.field1893.nextInt() };
                var21.field5072 = 0;
                var21.method8227(1);
                var21.method8230(var22[0]);
                var21.method8230(var22[1]);
                var21.method8230(var22[2]);
                var21.method8230(var22[3]);
                var21.method8232(Statics.field3480);
                if (field813 == 40) {
                    var21.method8230(Statics.field4341[0]);
                    var21.method8230(Statics.field4341[1]);
                    var21.method8230(Statics.field4341[2]);
                    var21.method8230(Statics.field4341[3]);
                } else {
                    if (field813 == 50) {
                        var21.method8227(class140.field1632.method36());
                        var21.method8230(Statics.field836);
                    } else {
                        var21.method8227(field556.method36());
                        switch(field556.field1633) {
                            case 1:
                            case 4:
                                var21.method8229(Statics.field4623);
                                var21.field5072++;
                                break;
                            case 2:
                                var21.field5072 += 4;
                                break;
                            case 3:
                                var21.method8230(Statics.field1686.method2379(class76.field934));
                        }
                    }
                    if (field557.method8550()) {
                        var21.method8227(class519.field5123.method36());
                        var21.method8234(this.field698);
                    } else {
                        var21.method8227(class519.field5130.method36());
                        var21.method8234(class76.field938);
                    }
                }
                var21.method8326(class75.field919, class75.field916);
                Statics.field4341 = var22;
                class298 var23 = class298.method2870();
                var23.field3214 = null;
                var23.field3206 = 0;
                var23.field3205 = new class513(5000);
                var23.field3205.field5072 = 0;
                if (field813 == 40) {
                    var23.field3205.method8227(class300.field3344.field3340);
                } else {
                    var23.field3205.method8227(class300.field3343.field3340);
                }
                var23.field3205.method8228(0);
                int var26 = var23.field3205.field5072;
                var23.field3205.method8230(215);
                var23.field3205.method8230(1);
                var23.field3205.method8227(field523);
                var23.field3205.method8227(field658);
                byte var27 = 0;
                var23.field3205.method8227(var27);
                var23.field3205.method8237(var21.field5070, 0, var21.field5072);
                int var28 = var23.field3205.field5072;
                var23.field3205.method8234(class76.field934);
                var23.field3205.method8227((field547 ? 1 : 0) << 1 | (field634 ? 1 : 0));
                var23.field3205.method8228(Statics.field4328);
                var23.field3205.method8228(Statics.field4883);
                method4578(var23.field3205);
                var23.field3205.method8234(Statics.field264);
                var23.field3205.method8230(Statics.field300);
                if (field526 > 213) {
                    var23.field3205.method8227(0);
                }
                class514 var29 = new class514(Statics.field2043.method7681());
                Statics.field2043.method7679(var29);
                var23.field3205.method8237(var29.field5070, 0, var29.field5070.length);
                var23.field3205.method8227(field523);
                var23.field3205.method8230(0);
                var23.field3205.method8296(Statics.field2052.field4289);
                var23.field3205.method8295(Statics.field886.field4289);
                var23.field3205.method8296(Statics.field1695.field4289);
                var23.field3205.method8295(0);
                var23.field3205.method8296(Statics.field2855.field4289);
                var23.field3205.method8297(Statics.field830.field4289);
                var23.field3205.method8230(Statics.field1566.field4289);
                var23.field3205.method8297(Statics.field26.field4289);
                var23.field3205.method8295(Statics.field1499.field4289);
                var23.field3205.method8295(Statics.field120.field4289);
                var23.field3205.method8296(Statics.field1354.field4289);
                var23.field3205.method8296(Statics.field1971.field4289);
                var23.field3205.method8297(Statics.field1403.field4289);
                var23.field3205.method8295(Statics.field4437.field4289);
                var23.field3205.method8230(Statics.field512.field4289);
                var23.field3205.method8297(Statics.field4954.field4289);
                var23.field3205.method8230(Statics.field1359.field4289);
                var23.field3205.method8296(Statics.field274.field4289);
                var23.field3205.method8297(Statics.field1671.field4289);
                var23.field3205.method8296(Statics.field1677.field4289);
                var23.field3205.method8297(Statics.field70.field4289);
                var23.field3205.method8269(var22, var28, var23.field3205.field5072);
                var23.field3205.method8240(var23.field3205.field5072 - var26);
                field521.method2669(var23);
                field521.method2652();
                field521.field1414 = new class531(var22);
                int[] var30 = new int[4];
                for (int var31 = 0; var31 < 4; var31++) {
                    var30[var31] = var22[var31] + 50;
                }
                var2.method8188(var30);
                method2782(6);
            }
            if (field552 == 6 && var1.method7344() > 0) {
                int var32 = var1.method7361();
                if (var32 == 61) {
                    int var33 = var1.method7344();
                    Statics.field507 = var33 == 1 && var1.method7361() == 1;
                    method2782(5);
                }
                if (var32 == 21 && field813 == 20) {
                    method2782(12);
                } else if (var32 == 2) {
                    method2782(14);
                } else if (var32 == 15 && field813 == 40) {
                    field521.field1410 = -1;
                    method2782(19);
                } else if (var32 == 64) {
                    method2782(10);
                } else if (var32 == 23 && field797 < 1) {
                    field797++;
                    method2782(0);
                } else if (var32 == 29) {
                    method2782(17);
                } else if (var32 == 69) {
                    method2782(7);
                } else {
                    method6246(var32);
                    return;
                }
            }
            if (field552 == 7 && var1.method7344() >= 2) {
                var1.method7362(var2.field5070, 0, 2);
                var2.field5072 = 0;
                Statics.field4435 = var2.method8246();
                method2782(8);
            }
            if (field552 == 8 && var1.method7344() >= Statics.field4435) {
                var2.field5072 = 0;
                var1.method7362(var2.field5070, var2.field5072, Statics.field4435);
                class7 var34 = class7.method5221()[var2.method8244()];
                try {
                    class4 var35 = class5.method1978(var34);
                    this.field571 = new class8(var2, var35);
                    method2782(9);
                } catch (Exception var73) {
                    method6246(22);
                    return;
                }
            }
            if (field552 == 9 && this.field571.method52()) {
                this.field570 = this.field571.method46();
                this.field571.method45();
                this.field571 = null;
                if (this.field570 == null) {
                    method6246(22);
                    return;
                }
                field521.method2651();
                class298 var37 = class298.method2870();
                var37.field3214 = null;
                var37.field3206 = 0;
                var37.field3205 = new class513(5000);
                var37.field3205.method8227(class300.field3346.field3340);
                var37.field3205.method8228(this.field570.field5072);
                var37.field3205.method8238(this.field570);
                field521.method2669(var37);
                field521.method2652();
                this.field570 = null;
                method2782(6);
            }
            if (field552 == 10 && var1.method7344() > 0) {
                Statics.field3092 = var1.method7361();
                method2782(11);
            }
            if (field552 == 11 && var1.method7344() >= Statics.field3092) {
                var1.method7362(var2.field5070, 0, Statics.field3092);
                var2.field5072 = 0;
                method2782(6);
            }
            if (field552 == 12 && var1.method7344() > 0) {
                field555 = (var1.method7361() + 3) * 60;
                method2782(13);
            }
            if (field552 == 13) {
                field553 = 0;
                class76.method2306(class353.field3941, class353.field3942, field555 / 60 + class353.field4203);
                if (--field555 <= 0) {
                    method2782(0);
                }
            } else {
                if (field552 == 14 && var1.method7344() >= 1) {
                    Statics.field163 = var1.method7361();
                    method2782(15);
                }
                if (field552 == 15 && var1.method7344() >= Statics.field163) {
                    boolean var40 = var1.method7361() == 1;
                    var1.method7362(var2.field5070, 0, 4);
                    var2.field5072 = 0;
                    boolean var41 = false;
                    if (var40) {
                        int var42 = var2.method8191() << 24;
                        int var43 = var42 | var2.method8191() << 16;
                        int var44 = var43 | var2.method8191() << 8;
                        int var45 = var44 | var2.method8191();
                        Statics.field1686.method2377(class76.field934, var45);
                    }
                    if (field568) {
                        Statics.field1686.method2371(class76.field934);
                    } else {
                        Statics.field1686.method2371((String) null);
                    }
                    class99.method6236();
                    field693 = var1.method7361();
                    field695 = var1.method7361() == 1;
                    field801 = var1.method7361();
                    field801 <<= 0x8;
                    field801 += var1.method7361();
                    field642 = var1.method7361();
                    var1.method7362(var2.field5070, 0, 8);
                    var2.field5072 = 0;
                    this.field781 = var2.method8251();
                    var1.method7362(var2.field5070, 0, 8);
                    var2.field5072 = 0;
                    field643 = var2.method8251();
                    if (field526 >= 214) {
                        var1.method7362(var2.field5070, 0, 8);
                        var2.field5072 = 0;
                        var2.method8251();
                    }
                    var1.method7362(var2.field5070, 0, 1);
                    var2.field5072 = 0;
                    class299[] var46 = class299.method2649();
                    int var47 = var2.method8193();
                    if (var47 < 0 || var47 >= var46.length) {
                        throw new IOException(var47 + " " + var2.field5072);
                    }
                    field521.field1416 = var46[var47];
                    field521.field1410 = field521.field1416.field3339;
                    var1.method7362(var2.field5070, 0, 2);
                    var2.field5072 = 0;
                    field521.field1410 = var2.method8246();
                    try {
                        client var48 = Statics.field1352;
                        JSObject.getWindow(var48).call("zap", (Object[]) null);
                    } catch (Throwable var72) {
                    }
                    method2782(16);
                }
                if (field552 != 16) {
                    if (field552 == 17 && var1.method7344() >= 2) {
                        var2.field5072 = 0;
                        var1.method7362(var2.field5070, 0, 2);
                        var2.field5072 = 0;
                        Statics.field2980 = var2.method8246();
                        method2782(18);
                    }
                    if (field552 == 18 && var1.method7344() >= Statics.field2980) {
                        var2.field5072 = 0;
                        var1.method7362(var2.field5070, 0, Statics.field2980);
                        var2.field5072 = 0;
                        String var63 = var2.method8369();
                        String var64 = var2.method8369();
                        String var65 = var2.method8369();
                        class76.method2306(var63, var64, var65);
                        method2854(10);
                        if (field557.method8550()) {
                            class76.method5513(9);
                        }
                    }
                    if (field552 == 19) {
                        if (field521.field1410 == -1) {
                            if (var1.method7344() < 2) {
                                return;
                            }
                            var1.method7362(var2.field5070, 0, 2);
                            var2.field5072 = 0;
                            field521.field1410 = var2.method8246();
                        }
                        if (var1.method7344() >= field521.field1410) {
                            var1.method7362(var2.field5070, 0, field521.field1410);
                            var2.field5072 = 0;
                            int var66 = field521.field1410;
                            field582.method7024();
                            field521.method2651();
                            field521.field1412.field5072 = 0;
                            field521.field1416 = null;
                            field521.field1417 = null;
                            field521.field1422 = null;
                            field521.field1423 = null;
                            field521.field1410 = 0;
                            field521.field1424 = 0;
                            field536 = 0;
                            field679 = 0;
                            field661 = false;
                            field671 = 0;
                            field598 = 0;
                            for (int var67 = 0; var67 < 2048; var67++) {
                                field612[var67] = null;
                            }
                            Statics.field1605 = null;
                            for (int var68 = 0; var68 < field574.length; var68++) {
                                class101 var69 = field574[var68];
                                if (var69 != null) {
                                    var69.field1218 = -1;
                                    var69.field1219 = false;
                                }
                            }
                            class85.field1050 = new class490(32);
                            method2854(30);
                            for (int var70 = 0; var70 < 100; var70++) {
                                field719[var70] = true;
                            }
                            method6976();
                            class108.method3113(var2);
                            if (var2.field5072 != var66) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field553++;
                        if (field553 > 2000) {
                            if (field797 < 1) {
                                if (Statics.field926 == Statics.field3535) {
                                    Statics.field3535 = Statics.field60;
                                } else {
                                    Statics.field3535 = Statics.field926;
                                }
                                field797++;
                                method2782(0);
                            } else {
                                method6246(-3);
                            }
                        }
                    }
                } else if (var1.method7344() >= field521.field1410) {
                    var2.field5072 = 0;
                    var1.method7362(var2.field5070, 0, field521.field1410);
                    field582.method7022();
                    field531 = 1L;
                    Statics.field5016.field1084 = 0;
                    Statics.field3546 = true;
                    field535 = true;
                    field651 = -1L;
                    class37.method273();
                    field521.method2651();
                    field521.field1412.field5072 = 0;
                    field521.field1416 = null;
                    field521.field1417 = null;
                    field521.field1422 = null;
                    field521.field1423 = null;
                    field521.field1410 = 0;
                    field521.field1424 = 0;
                    field536 = 0;
                    field627 = 0;
                    field537 = 0;
                    field679 = 0;
                    field661 = false;
                    class36.method1174(0);
                    class111.method829();
                    field579 = 0;
                    field742 = false;
                    field717 = 0;
                    field654 = 0;
                    field606 = 0;
                    Statics.field1456 = null;
                    field671 = 0;
                    field759 = -1;
                    field598 = 0;
                    field765 = 0;
                    field545 = class104.field1340;
                    field546 = class104.field1340;
                    field650 = 0;
                    class108.method3847();
                    for (int var50 = 0; var50 < 2048; var50++) {
                        field612[var50] = null;
                    }
                    for (int var51 = 0; var51 < 65536; var51++) {
                        field574[var51] = null;
                    }
                    field652 = -1;
                    field524.method6379();
                    field656.method6379();
                    for (int var52 = 0; var52 < 4; var52++) {
                        for (int var53 = 0; var53 < 104; var53++) {
                            for (int var54 = 0; var54 < 104; var54++) {
                                field653[var52][var53][var54] = null;
                            }
                        }
                    }
                    field678 = new class379();
                    Statics.field1858.method1777();
                    for (int var55 = 0; var55 < Statics.field1905; var55++) {
                        class187 var56 = class187.method3069(var55);
                        if (var56 != null) {
                            class323.field3531[var55] = 0;
                            class323.field3532[var55] = 0;
                        }
                    }
                    Statics.field1181.method2585();
                    field694 = -1;
                    if (field685 != -1) {
                        int var57 = field685;
                        if (var57 != -1 && Statics.field3692[var57]) {
                            Statics.field1047.method6130(var57);
                            if (Statics.field1046[var57] != null) {
                                for (int var58 = 0; var58 < Statics.field1046[var57].length; var58++) {
                                    if (Statics.field1046[var57][var58] != null) {
                                        Statics.field1046[var57][var58] = null;
                                    }
                                }
                                Statics.field1046[var57] = null;
                                Statics.field3692[var57] = false;
                            }
                        }
                    }
                    for (class87 var59 = (class87) field686.method7983(); var59 != null; var59 = (class87) field686.method7991()) {
                        method2291(var59, true);
                    }
                    field685 = -1;
                    field686 = new class490(8);
                    field690 = null;
                    field679 = 0;
                    field661 = false;
                    field715.method5517((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
                    for (int var60 = 0; var60 < 8; var60++) {
                        field662[var60] = null;
                        field768[var60] = false;
                    }
                    class85.field1050 = new class490(32);
                    field683 = true;
                    for (int var61 = 0; var61 < 100; var61++) {
                        field719[var61] = true;
                    }
                    method6976();
                    Statics.field128 = null;
                    Statics.field61 = null;
                    Arrays.fill(field713, (Object) null);
                    Statics.field2860 = null;
                    Arrays.fill(field758, (Object) null);
                    for (int var62 = 0; var62 < 8; var62++) {
                        field805[var62] = new class369();
                    }
                    Statics.field166 = null;
                    field528 = false;
                    class108.method3113(var2);
                    Statics.field3457 = -1;
                    method5193(false, var2);
                    field521.field1416 = null;
                }
            }
        } catch (IOException var80) {
            if (field797 < 1) {
                if (Statics.field926 == Statics.field3535) {
                    Statics.field3535 = Statics.field60;
                } else {
                    Statics.field3535 = Statics.field926;
                }
                field797++;
                method2782(0);
            } else {
                method6246(-2);
            }
        }
    }

    @ObfuscatedName("ne.hl(II)V")
    public static void method6246(int arg0) {
        int var1 = class76.field932;
        if (arg0 == -3) {
            class76.method2306(class353.field3944, class353.field3945, class353.field3946);
        } else if (arg0 == -2) {
            class76.method2306(class353.field3947, class353.field4003, class353.field4008);
        } else if (arg0 == -1) {
            class76.method2306(class353.field3950, class353.field3951, class353.field3952);
        } else if (arg0 == 3) {
            class76.method5513(3);
            class76.field931 = 1;
        } else if (arg0 == 4) {
            class76.method5513(14);
            class76.field930 = 0;
        } else if (arg0 == 5) {
            class76.field931 = 2;
            class76.method2306(class353.field4023, class353.field3957, class353.field3958);
        } else if (arg0 == 68) {
            if (!field528) {
                field528 = true;
                method2182();
                return;
            }
            class76.method2306(class353.field3959, class353.field3960, class353.field4047);
        } else if (!field525 && arg0 == 6) {
            class76.method2306(class353.field3959, class353.field3960, class353.field4047);
        } else if (arg0 == 7) {
            class76.method2306(class353.field3962, class353.field3949, class353.field3964);
        } else if (arg0 == 8) {
            class76.method2306(class353.field3965, class353.field3966, class353.field3967);
        } else if (arg0 == 9) {
            class76.method2306(class353.field3968, class353.field3969, class353.field3970);
        } else if (arg0 == 10) {
            class76.method2306(class353.field3971, class353.field3993, class353.field3973);
        } else if (arg0 == 11) {
            class76.method2306(class353.field4019, class353.field3975, class353.field3976);
        } else if (arg0 == 12) {
            class76.method2306(class353.field3977, class353.field3978, class353.field3979);
        } else if (arg0 == 13) {
            class76.method2306(class353.field3980, class353.field4202, class353.field3982);
        } else if (arg0 == 14) {
            class76.method2306(class353.field4095, class353.field4071, class353.field3985);
        } else if (arg0 == 16) {
            class76.method2306(class353.field3986, class353.field4205, class353.field3930);
            class76.method5513(33);
        } else if (arg0 == 17) {
            class76.method2306(class353.field4070, class353.field3990, class353.field3991);
        } else if (arg0 == 18) {
            class76.method5513(14);
            class76.field930 = 1;
        } else if (arg0 == 19) {
            class76.method2306(class353.field3995, class353.field3920, class353.field3997);
        } else if (arg0 == 20) {
            class76.method2306(class353.field3998, class353.field4112, class353.field4000);
        } else if (arg0 == 22) {
            class76.method2306(class353.field4001, class353.field4002, class353.field4116);
        } else if (arg0 == 23) {
            class76.method2306(class353.field4004, class353.field4005, class353.field4006);
        } else if (arg0 == 24) {
            class76.method2306(class353.field4025, class353.field4106, class353.field4009);
        } else if (arg0 == 25) {
            class76.method2306(class353.field4010, class353.field4011, class353.field4012);
        } else if (arg0 == 26) {
            class76.method2306(class353.field4013, class353.field4014, class353.field4015);
        } else if (arg0 == 27) {
            class76.method2306(class353.field4016, class353.field4017, class353.field4018);
        } else if (arg0 == 31) {
            class76.method2306(class353.field4171, class353.field4026, class353.field4068);
        } else if (arg0 == 32) {
            class76.method5513(14);
            class76.field930 = 2;
        } else if (arg0 == 37) {
            class76.method2306(class353.field4128, class353.field4032, class353.field4033);
        } else if (arg0 == 38) {
            class76.method2306(class353.field4034, class353.field3961, class353.field4036);
        } else if (arg0 == 55) {
            class76.method5513(8);
        } else if (arg0 == 56) {
            class76.method2306(class353.field4041, class353.field4042, class353.field4049);
            method2854(11);
            return;
        } else if (arg0 == 57) {
            class76.method2306(class353.field4204, class353.field4045, class353.field4046);
            method2854(11);
            return;
        } else if (arg0 == 61) {
            class76.method2306("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class76.method5513(7);
        } else if (arg0 == 62) {
            method2854(10);
            class76.method5513(9);
            class76.method2306(class353.field4007, class353.field4048, class353.field4044);
            return;
        } else if (arg0 == 63) {
            method2854(10);
            class76.method5513(9);
            class76.method2306(class353.field4050, class353.field4051, class353.field4052);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method2854(10);
            class76.method5513(9);
            class76.method2306(class353.field4053, class353.field3989, class353.field3943);
            return;
        } else if (arg0 == 71) {
            method2854(10);
            class76.method5513(7);
            class76.method2306("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method2854(10);
            class76.method5513(6);
            class76.method2306(class353.field4185, class353.field4186, class353.field4126);
        } else if (arg0 == 72) {
            method2854(10);
            class76.method5513(32);
        } else {
            class76.method2306(class353.field4056, class353.field3913, class353.field4058);
        }
        method2854(10);
        boolean var3 = var1 != class76.method2263();
        if (!var3 && field557.method8550()) {
            class76.method5513(9);
        }
    }

    @ObfuscatedName("ki.hd(B)V")
    public static final void method5072() {
        field521.method2667();
        method3072();
        Statics.field1458.method4320();
        for (int var0 = 0; var0 < 4; var0++) {
            field589[var0].method3824();
        }
        field613.method3783();
        System.gc();
        class307.method3865(0, 0);
        class307.field3399.clear();
        field575 = false;
        class70.method2896();
        method2854(10);
    }

    @ObfuscatedName("ng.hw(IB)V")
    public static final void method6234(int arg0) {
        method5072();
        switch(arg0) {
            case 1:
                class76.method5513(24);
                class76.method2306(class353.field4132, class353.field4133, class353.field4134);
                break;
            case 2:
                class76.method5513(24);
                class76.method2306(class353.field4129, class353.field4130, class353.field4083);
        }
    }

    @ObfuscatedName("dz.hj(I)J")
    public static long method2268() {
        return field643;
    }

    @ObfuscatedName("gg.hy(S)V")
    public static final void method3072() {
        class209.method6954();
        class200.method6049();
        class190.field1941.method5146();
        class207.field2137.method5146();
        class207.field2144.method5146();
        class207.field2139.method5146();
        class207.field2140.method5146();
        class196.method2757();
        class208.method1181();
        class210.method7653();
        class199.method3267();
        class202.field2091.method5146();
        class187.field1906.method5146();
        Statics.field3093.method8074();
        Statics.field3842.method8074();
        class206.field2112.method5146();
        class206.field2113.method5146();
        class206.field2114.method5146();
        class191.method8118();
        class205.method2903();
        class203.field2098.method5146();
        class188.field1913.method5146();
        class507.method1143();
        class509.field5050.method5146();
        field560.method5146();
        field809.method5146();
        class330.field3571.method5146();
        class333.method1111();
        ((class238) class228.field2511.field2783).method4398();
        class79.field993.method5146();
        field807.method7145();
        Statics.field1695.method6131();
        Statics.field1354.method6131();
        Statics.field2855.method6131();
        Statics.field1677.method6131();
        Statics.field120.method6131();
        Statics.field70.method6131();
        Statics.field26.method6131();
        Statics.field4437.method6131();
        Statics.field1671.method6131();
        Statics.field1566.method6131();
        Statics.field512.method6131();
        Statics.field1499.method6131();
        Statics.field1853.method6131();
    }

    @ObfuscatedName("du.hn(I)V")
    public static final void method2262() {
        if (field627 > 0) {
            method5072();
        } else {
            field582.method7020();
            method2854(40);
            Statics.field1462 = field521.method2658();
            field521.method2671();
        }
    }

    @ObfuscatedName("ne.hq(ZB)V")
    public static final void method6247(boolean arg0) {
        if (arg0) {
            field556 = class76.field944 ? class140.field1629 : class140.field1631;
        } else {
            field556 = Statics.field1686.method2429(class76.field934) ? class140.field1635 : class140.field1630;
        }
    }

    @ObfuscatedName("client.hu(I)V")
    public final void method1207() {
        if (field536 > 1) {
            field536--;
        }
        if (field627 > 0) {
            field627--;
        }
        if (field572) {
            field572 = false;
            method2262();
            return;
        }
        if (!field661) {
            method2204();
        }
        for (int var1 = 0; var1 < 100 && this.method1213(field521); var1++) {
        }
        if (field813 != 30) {
            return;
        }
        while (class37.method1990()) {
            class298 var2 = class298.method8119(class296.field3171, field521.field1414);
            var2.field3205.method8227(0);
            int var3 = var2.field3205.field5072;
            class37.method6048(var2.field3205);
            var2.field3205.method8241(var2.field3205.field5072 - var3);
            field521.method2669(var2);
        }
        if (field582.field4563) {
            class298 var4 = class298.method8119(class296.field3106, field521.field1414);
            var4.field3205.method8227(0);
            int var5 = var4.field3205.field5072;
            field582.method7025(var4.field3205);
            var4.field3205.method8241(var4.field3205.field5072 - var5);
            field521.method2669(var4);
            field582.method7023();
        }
        Object var6 = Statics.field5016.field1088;
        synchronized (Statics.field5016.field1088) {
            if (!field632) {
                Statics.field5016.field1084 = 0;
            } else if (class36.field252 != 0 || Statics.field5016.field1084 >= 40) {
                class298 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field5016.field1084 && (var7 == null || var7.field3205.field5072 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field5016.field1082[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field5016.field1085[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field744 != var14 || field533 != var13) {
                        if (var7 == null) {
                            var7 = class298.method8119(class296.field3116, field521.field1414);
                            var7.field3205.method8227(0);
                            var8 = var7.field3205.field5072;
                            var7.field3205.field5072 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field534 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field744;
                            var16 = var13 - field533;
                            var17 = (int) ((Statics.field5016.field1087[var12] - field534) / 20L);
                            var10 = (int) ((Statics.field5016.field1087[var12] - field534) % 20L + (long) var10);
                        }
                        field744 = var14;
                        field533 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field3205.method8228((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field3205.method8227(var17 + 128);
                            var7.field3205.method8228((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field3205.method8227(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3205.method8230(Integer.MIN_VALUE);
                            } else {
                                var7.field3205.method8230(var14 | var13 << 16);
                            }
                        } else {
                            var7.field3205.method8228((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3205.method8230(Integer.MIN_VALUE);
                            } else {
                                var7.field3205.method8230(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field534 = Statics.field5016.field1087[var12];
                    }
                }
                if (var7 != null) {
                    var7.field3205.method8241(var7.field3205.field5072 - var8);
                    int var18 = var7.field3205.field5072;
                    var7.field3205.field5072 = var8;
                    var7.field3205.method8227(var10 / var11);
                    var7.field3205.method8227(var10 % var11);
                    var7.field3205.field5072 = var18;
                    field521.method2669(var7);
                }
                if (var9 >= Statics.field5016.field1084) {
                    Statics.field5016.field1084 = 0;
                } else {
                    Statics.field5016.field1084 -= var9;
                    System.arraycopy(Statics.field5016.field1085, var9, Statics.field5016.field1085, 0, Statics.field5016.field1084);
                    System.arraycopy(Statics.field5016.field1082, var9, Statics.field5016.field1082, 0, Statics.field5016.field1084);
                    System.arraycopy(Statics.field5016.field1087, var9, Statics.field5016.field1087, 0, Statics.field5016.field1084);
                }
            }
        }
        if (class36.field252 == 1 || !Statics.field170 && class36.field252 == 4 || class36.field252 == 2) {
            long var20 = class36.field255 - field531 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field531 = class36.field255 * -1L;
            int var22 = class36.field254;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field4883) {
                var22 = Statics.field4883;
            }
            int var23 = class36.field253;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field4328) {
                var23 = Statics.field4328;
            }
            int var24 = (int) var20;
            class298 var25 = class298.method8119(class296.field3138, field521.field1414);
            var25.field3205.method8228((var24 << 1) + (class36.field252 == 2 ? 1 : 0));
            var25.field3205.method8228(var23);
            var25.field3205.method8228(var22);
            field521.method2669(var25);
        }
        if (field726 != 0) {
            class298 var26 = class298.method8119(class296.field3191, field521.field1414);
            var26.field3205.method8228(field726);
            field521.method2669(var26);
        }
        if (field751.field2332 > 0) {
            class298 var27 = class298.method8119(class296.field3162, field521.field1414);
            var27.field3205.method8228(0);
            int var28 = var27.field3205.field5072;
            long var29 = class303.method2705();
            for (int var31 = 0; var31 < field751.field2332; var31++) {
                long var32 = var29 - field651;
                if (var32 > 16777215L) {
                    var32 = 16777215L;
                }
                field651 = var29;
                var27.field3205.method8436((int) var32);
                var27.field3205.method8346(field751.field2320[var31]);
            }
            var27.field3205.method8240(var27.field3205.field5072 - var28);
            field521.method2669(var27);
        }
        if (field615 > 0) {
            field615--;
        }
        if (field751.method3796(96) || field751.method3796(97) || field751.method3796(98) || field751.method3796(99)) {
            field708 = true;
        }
        if (field708 && field615 <= 0) {
            field615 = 20;
            field708 = false;
            class298 var34 = class298.method8119(class296.field3102, field521.field1414);
            var34.field3205.method8228(field654);
            var34.field3205.method8228(field734);
            field521.method2669(var34);
        }
        if (Statics.field3546 && !field535) {
            field535 = true;
            class298 var35 = class298.method8119(class296.field3145, field521.field1414);
            var35.field3205.method8227(1);
            field521.method2669(var35);
        }
        if (!Statics.field3546 && field535) {
            field535 = false;
            class298 var36 = class298.method8119(class296.field3145, field521.field1414);
            var36.field3205.method8227(0);
            field521.method2669(var36);
        }
        if (Statics.field1500 != null) {
            Statics.field1500.method7729();
        }
        if (Statics.field1005) {
            if (Statics.field128 != null) {
                Statics.field128.method7271();
            }
            for (int var37 = 0; var37 < class108.field1366; var37++) {
                class92 var38 = field612[class108.field1370[var37]];
                var38.method2220();
            }
            Statics.field1005 = false;
        }
        if (Statics.field4776) {
            for (int var39 = 0; var39 < class108.field1366; var39++) {
                class92 var40 = field612[class108.field1370[var39]];
                var40.method2238();
            }
            Statics.field4776 = false;
        }
        if (Statics.field265 != field759) {
            field759 = Statics.field265;
            method165(Statics.field265);
        }
        if (field813 != 30) {
            return;
        }
        for (class95 var41 = (class95) field678.method6393(); var41 != null; var41 = (class95) field678.method6374()) {
            if (var41.field1177 > 0) {
                var41.field1177--;
            }
            if (var41.field1177 != 0) {
                if (var41.field1176 > 0) {
                    var41.field1176--;
                }
                if (var41.field1176 == 0 && var41.field1166 >= 1 && var41.field1167 >= 1 && var41.field1166 <= 102 && var41.field1167 <= 102 && (var41.field1174 < 0 || class82.method304(var41.field1174, var41.field1171))) {
                    method3251(var41.field1179, var41.field1165, var41.field1166, var41.field1167, var41.field1174, var41.field1172, var41.field1171, var41.field1173);
                    var41.field1176 = -1;
                    if (var41.field1174 == var41.field1168 && var41.field1168 == -1) {
                        var41.method7662();
                    } else if (var41.field1174 == var41.field1168 && var41.field1172 == var41.field1169 && var41.field1171 == var41.field1170) {
                        var41.method7662();
                    }
                }
            } else if (var41.field1168 < 0 || class82.method304(var41.field1168, var41.field1170)) {
                method3251(var41.field1179, var41.field1165, var41.field1166, var41.field1167, var41.field1168, var41.field1169, var41.field1170, var41.field1173);
                var41.method7662();
            }
        }
        int var10002;
        for (int var42 = 0; var42 < field717; var42++) {
            var10002 = field771[var42]--;
            if (field771[var42] >= -10) {
                class40 var44 = field812[var42];
                if (var44 == null) {
                    class40 var10000 = (class40) null;
                    var44 = class40.method746(Statics.field1677, field769[var42], 0);
                    if (var44 == null) {
                        continue;
                    }
                    field771[var42] += var44.method741();
                    field812[var42] = var44;
                }
                if (field771[var42] < 0) {
                    int var51;
                    if (field586[var42] == 0) {
                        var51 = Statics.field1686.method2369();
                    } else {
                        int var45 = (field586[var42] & 0xFF) * 128;
                        int var46 = field586[var42] >> 16 & 0xFF;
                        int var47 = var46 * 128 + 64 - Statics.field1605.field1192;
                        if (var47 < 0) {
                            var47 = -var47;
                        }
                        int var48 = field586[var42] >> 8 & 0xFF;
                        int var49 = var48 * 128 + 64 - Statics.field1605.field1206;
                        if (var49 < 0) {
                            var49 = -var49;
                        }
                        int var50 = var47 + var49 - 128;
                        if (var50 > var45) {
                            field771[var42] = -100;
                            continue;
                        }
                        if (var50 < 0) {
                            var50 = 0;
                        }
                        var51 = (var45 - var50) * Statics.field1686.method2370() / var45;
                    }
                    if (var51 > 0) {
                        class41 var52 = var44.method742().method753(Statics.field339);
                        class49 var53 = class49.method857(var52, 100, var51);
                        var53.method860(field770[var42] - 1);
                        Statics.field1039.method693(var53);
                    }
                    field771[var42] = -100;
                }
            } else {
                field717--;
                for (int var43 = var42; var43 < field717; var43++) {
                    field769[var43] = field769[var43 + 1];
                    field812[var43] = field812[var43 + 1];
                    field770[var43] = field770[var43 + 1];
                    field771[var43] = field771[var43 + 1];
                    field586[var43] = field586[var43 + 1];
                }
                var42--;
            }
        }
        if (field575 && !class307.method2178()) {
            if (Statics.field1686.method2367() != 0 && class307.method3372()) {
                class358 var54 = Statics.field70;
                int var55 = Statics.field1686.method2367();
                if (!class307.field3399.isEmpty()) {
                    ArrayList var56 = new ArrayList();
                    Iterator var57 = class307.field3399.iterator();
                    while (var57.hasNext()) {
                        class319 var58 = (class319) var57.next();
                        var58.field3509 = false;
                        var58.field3514 = false;
                        var58.field3516 = false;
                        var58.field3515 = var54;
                        var58.field3511 = var55;
                        var58.field3512 = 0.0F;
                        var56.add(var58);
                    }
                    class307.method2728(var56, class307.field3393, class307.field3403, class307.field3404, class307.field3408, false);
                }
            }
            field575 = false;
        }
        field521.field1424++;
        if (field521.field1424 > 750) {
            method2262();
            return;
        }
        method414();
        method2894();
        int[] var59 = class108.field1370;
        for (int var60 = 0; var60 < class108.field1366; var60++) {
            class92 var61 = field612[var59[var60]];
            if (var61 != null && var61.field1183 > 0) {
                var61.field1183--;
                if (var61.field1183 == 0) {
                    var61.field1214 = null;
                }
            }
        }
        for (int var62 = 0; var62 < field650; var62++) {
            int var63 = field576[var62];
            class101 var64 = field574[var63];
            if (var64 != null && var64.field1183 > 0) {
                var64.field1183--;
                if (var64.field1183 == 0) {
                    var64.field1214 = null;
                }
            }
        }
        field703++;
        if (field636 != 0) {
            field766 += 20;
            if (field766 >= 400) {
                field636 = 0;
            }
        }
        class333 var65 = Statics.field3061;
        class333 var66 = Statics.field4520;
        Statics.field3061 = null;
        Statics.field4520 = null;
        field701 = null;
        field810 = false;
        field762 = false;
        field753 = 0;
        while (field751.method3802() && field753 < 128) {
            if (field693 >= 2 && field751.method3796(82) && field751.field2331 == 66) {
                StringBuilder var67 = new StringBuilder();
                Iterator var68 = class111.field1405.iterator();
                while (var68.hasNext()) {
                    class65 var69 = (class65) var68.next();
                    if (var69.field500 != null && !var69.field500.isEmpty()) {
                        var67.append(var69.field500).append(':');
                    }
                    var67.append(var69.field498).append('\n');
                }
                String var70 = var67.toString();
                Statics.field1352.method613(var70);
            } else if (field606 != 1 || field751.field2330 <= 0) {
                field755[field753] = field751.field2331;
                field754[field753] = field751.field2330;
                field753++;
            }
        }
        if (method3068() && field751.method3796(82) && field751.method3796(81) && field726 != 0) {
            int var72 = Statics.field1605.field1134 - field726;
            if (var72 < 0) {
                var72 = 0;
            } else if (var72 > 3) {
                var72 = 3;
            }
            if (Statics.field1605.field1134 != var72) {
                int var73 = Statics.field4295 + Statics.field1605.field1188[0];
                int var74 = Statics.field1676 + Statics.field1605.field1255[0];
                class298 var75 = class298.method8119(class296.field3166, field521.field1414);
                var75.field3205.method8296(0);
                var75.field3205.method8430(var73);
                var75.field3205.method8346(var72);
                var75.field3205.method8284(var74);
                field521.method2669(var75);
            }
            field726 = 0;
        }
        if (class36.field252 == 1) {
            field613.method3783();
        }
        if (field685 != -1) {
            Statics.method91(field685, 0, 0, Statics.field4328, Statics.field4883, 0, 0);
        }
        field709++;
        while (true) {
            class88 var76;
            class333 var77;
            class333 var78;
            do {
                var76 = (class88) field729.method6370();
                if (var76 == null) {
                    while (true) {
                        class88 var79;
                        class333 var80;
                        class333 var81;
                        do {
                            var79 = (class88) field730.method6370();
                            if (var79 == null) {
                                while (true) {
                                    class88 var82;
                                    class333 var83;
                                    class333 var84;
                                    do {
                                        var82 = (class88) field728.method6370();
                                        if (var82 == null) {
                                            while (true) {
                                                class213 var85 = (class213) field811.method6370();
                                                if (var85 == null) {
                                                    this.method1452();
                                                    if (Statics.field1500 != null) {
                                                        Statics.field1500.method7739(Statics.field265, (Statics.field1605.field1192 >> 7) + Statics.field4295, (Statics.field1605.field1206 >> 7) + Statics.field1676, false);
                                                        Statics.field1500.method7819();
                                                    }
                                                    if (field597 != null) {
                                                        this.method1219();
                                                    }
                                                    if (class232.method4262()) {
                                                        int var86 = class232.field2602;
                                                        int var87 = class232.field2575;
                                                        class298 var88 = class298.method8119(class296.field3189, field521.field1414);
                                                        var88.field3205.method8227(5);
                                                        var88.field3205.method8228(Statics.field4295 + var86);
                                                        var88.field3205.method8346(field751.method3796(82) ? (field751.method3796(81) ? 2 : 1) : 0);
                                                        var88.field3205.method8301(Statics.field1676 + var87);
                                                        field521.method2669(var88);
                                                        class232.method4233();
                                                        field633 = class36.field253;
                                                        field527 = class36.field254;
                                                        field636 = 1;
                                                        field766 = 0;
                                                        field598 = var86;
                                                        field765 = var87;
                                                    }
                                                    if (Statics.field3061 != var65) {
                                                        if (var65 != null) {
                                                            method3478(var65);
                                                        }
                                                        if (Statics.field3061 != null) {
                                                            method3478(Statics.field3061);
                                                        }
                                                    }
                                                    if (Statics.field4520 != var66 && field677 == field676) {
                                                        if (var66 != null) {
                                                            method3478(var66);
                                                        }
                                                        if (Statics.field4520 != null) {
                                                            method3478(Statics.field4520);
                                                        }
                                                    }
                                                    if (Statics.field4520 == null) {
                                                        if (field676 > 0) {
                                                            field676--;
                                                        }
                                                    } else if (field676 < field677) {
                                                        field676++;
                                                        if (field677 == field676) {
                                                            method3478(Statics.field4520);
                                                        }
                                                    }
                                                    if (field606 == 0) {
                                                        int var89 = Statics.field1605.field1192;
                                                        int var90 = Statics.field1605.field1206;
                                                        if (Statics.field4805 - var89 < -500 || Statics.field4805 - var89 > 500 || Statics.field261 - var90 < -500 || Statics.field261 - var90 > 500) {
                                                            Statics.field4805 = var89;
                                                            Statics.field261 = var90;
                                                        }
                                                        if (Statics.field4805 != var89) {
                                                            Statics.field4805 += (var89 - Statics.field4805) / 16;
                                                        }
                                                        if (Statics.field261 != var90) {
                                                            Statics.field261 += (var90 - Statics.field261) / 16;
                                                        }
                                                        int var91 = Statics.field4805 >> 7;
                                                        int var92 = Statics.field261 >> 7;
                                                        int var93 = method5254(Statics.field4805, Statics.field261, Statics.field265);
                                                        int var94 = 0;
                                                        if (var91 > 3 && var92 > 3 && var91 < 100 && var92 < 100) {
                                                            for (int var95 = var91 - 4; var95 <= var91 + 4; var95++) {
                                                                for (int var96 = var92 - 4; var96 <= var92 + 4; var96++) {
                                                                    int var97 = Statics.field265;
                                                                    if (var97 < 3 && (class82.field1030[1][var95][var96] & 0x2) == 2) {
                                                                        var97++;
                                                                    }
                                                                    int var98 = var93 - class82.field1023[var97][var95][var96];
                                                                    if (var98 > var94) {
                                                                        var94 = var98;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var99 = var94 * 192;
                                                        if (var99 > 98048) {
                                                            var99 = 98048;
                                                        }
                                                        if (var99 < 32768) {
                                                            var99 = 32768;
                                                        }
                                                        if (var99 > field617) {
                                                            field617 += (var99 - field617) / 24;
                                                        } else if (var99 < field617) {
                                                            field617 += (var99 - field617) / 80;
                                                        }
                                                        Statics.field1109 = method5254(Statics.field1605.field1192, Statics.field1605.field1206, Statics.field265) - field607;
                                                    } else if (field606 == 1) {
                                                        method7446();
                                                        short var100 = -1;
                                                        if (field751.method3796(33)) {
                                                            var100 = 0;
                                                        } else if (field751.method3796(49)) {
                                                            var100 = 1024;
                                                        }
                                                        if (field751.method3796(48)) {
                                                            if (var100 == 0) {
                                                                var100 = 1792;
                                                            } else if (var100 == 1024) {
                                                                var100 = 1280;
                                                            } else {
                                                                var100 = 1536;
                                                            }
                                                        } else if (field751.method3796(50)) {
                                                            if (var100 == 0) {
                                                                var100 = 256;
                                                            } else if (var100 == 1024) {
                                                                var100 = 768;
                                                            } else {
                                                                var100 = 512;
                                                            }
                                                        }
                                                        byte var101 = 0;
                                                        if (field751.method3796(35)) {
                                                            var101 = -1;
                                                        } else if (field751.method3796(51)) {
                                                            var101 = 1;
                                                        }
                                                        int var102 = 0;
                                                        if (var100 >= 0 || var101 != 0) {
                                                            int var103 = field751.method3796(81) ? field787 : field611;
                                                            var102 = var103 * 16;
                                                            field609 = var100;
                                                            field610 = var101;
                                                        }
                                                        if (field584 < var102) {
                                                            field584 += var102 / 8;
                                                            if (field584 > var102) {
                                                                field584 = var102;
                                                            }
                                                        } else if (field584 > var102) {
                                                            field584 = field584 * 9 / 10;
                                                        }
                                                        if (field584 > 0) {
                                                            int var104 = field584 / 16;
                                                            if (field609 >= 0) {
                                                                int var105 = field609 - Statics.field4770 & 0x7FF;
                                                                int var106 = class228.field2509[var105];
                                                                int var107 = class228.field2510[var105];
                                                                Statics.field4805 += var104 * var106 / 65536;
                                                                Statics.field261 += var104 * var107 / 65536;
                                                            }
                                                            if (field610 != 0) {
                                                                Statics.field1109 += field610 * var104;
                                                                if (Statics.field1109 > 0) {
                                                                    Statics.field1109 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field609 = -1;
                                                            field610 = -1;
                                                        }
                                                        if (field751.method3796(13)) {
                                                            field521.method2669(class298.method8119(class296.field3100, field521.field1414));
                                                            field606 = 0;
                                                        }
                                                    }
                                                    if (class36.field244 == 4 && Statics.field170) {
                                                        int var108 = class36.field246 - field818;
                                                        field603 = var108 * 2;
                                                        field818 = var108 == -1 || var108 == 1 ? class36.field246 : (field818 + class36.field246) / 2;
                                                        int var109 = field604 - class36.field245;
                                                        field775 = var109 * 2;
                                                        field604 = var109 == -1 || var109 == 1 ? class36.field245 : (field604 + class36.field245) / 2;
                                                    } else {
                                                        if (field751.method3796(96)) {
                                                            field775 += (-24 - field775) / 2;
                                                        } else if (field751.method3796(97)) {
                                                            field775 += (24 - field775) / 2;
                                                        } else {
                                                            field775 /= 2;
                                                        }
                                                        if (field751.method3796(98)) {
                                                            field603 += (12 - field603) / 2;
                                                        } else if (field751.method3796(99)) {
                                                            field603 += (-12 - field603) / 2;
                                                        } else {
                                                            field603 /= 2;
                                                        }
                                                        field818 = class36.field246;
                                                        field604 = class36.field245;
                                                    }
                                                    field654 = field775 / 2 + field654 & 0x7FF;
                                                    field734 += field603 / 2;
                                                    if (field734 < 128) {
                                                        field734 = 128;
                                                    }
                                                    if (field734 > 383) {
                                                        field734 = 383;
                                                    }
                                                    if (field782) {
                                                        method2206(Statics.field4607, Statics.field4523, Statics.field4411);
                                                        method3256(Statics.field1792, Statics.field12);
                                                        if (Statics.field4607 == Statics.field1743 && Statics.field4523 == Statics.field4427 && Statics.field4411 == Statics.field331 && Statics.field1792 == Statics.field104 && Statics.field4770 == Statics.field12) {
                                                            field782 = false;
                                                            field774 = false;
                                                            field776 = false;
                                                            field798 = false;
                                                            Statics.field125 = 0;
                                                            Statics.field1891 = 0;
                                                            Statics.field4950 = 0;
                                                            Statics.field96 = 0;
                                                            Statics.field1744 = 0;
                                                            Statics.field991 = 0;
                                                            Statics.field756 = 0;
                                                            Statics.field2871 = 0;
                                                            Statics.field1575 = 0;
                                                            Statics.field4409 = 0;
                                                            field779 = null;
                                                            field644 = null;
                                                            field780 = null;
                                                        }
                                                    } else if (field774) {
                                                        if (!field776) {
                                                            int var110 = Statics.field2871 * 128 + 64;
                                                            int var111 = Statics.field1575 * 128 + 64;
                                                            int var112 = method5254(var110, var111, Statics.field265) - Statics.field4409;
                                                            method2206(var110, var112, var111);
                                                        } else if (field779 != null) {
                                                            Statics.field1743 = field779.method7690();
                                                            Statics.field331 = field779.method7691();
                                                            if (field783) {
                                                                Statics.field4427 = field779.method7693();
                                                            } else {
                                                                Statics.field4427 = method5254(Statics.field1743, Statics.field331, Statics.field265) - field779.method7693();
                                                            }
                                                            field779.method7704();
                                                        }
                                                        if (field798) {
                                                            if (field644 != null) {
                                                                Statics.field104 = field644.method7700();
                                                                Statics.field104 = Math.min(Math.max(Statics.field104, 128), 383);
                                                                field644.method7704();
                                                            }
                                                            if (field780 != null) {
                                                                Statics.field4770 = field780.method7700() & 0x7FF;
                                                                field780.method7704();
                                                            }
                                                        } else {
                                                            int var113 = Statics.field125 * 128 + 64;
                                                            int var114 = Statics.field1891 * 128 + 64;
                                                            int var115 = method5254(var113, var114, Statics.field265) - Statics.field4950;
                                                            int var116 = var113 - Statics.field1743;
                                                            int var117 = var115 - Statics.field4427;
                                                            int var118 = var114 - Statics.field331;
                                                            int var119 = (int) Math.sqrt((double) (var116 * var116 + var118 * var118));
                                                            int var120 = (int) (Math.atan2((double) var117, (double) var119) * 325.9490051269531D) & 0x7FF;
                                                            int var121 = (int) (Math.atan2((double) var116, (double) var118) * -325.9490051269531D) & 0x7FF;
                                                            method3256(var120, var121);
                                                        }
                                                    }
                                                    for (int var122 = 0; var122 < 5; var122++) {
                                                        var10002 = field772[var122]++;
                                                    }
                                                    Statics.field1181.method2614();
                                                    int var123 = ++class36.field243 - 1;
                                                    int var125 = class35.method12();
                                                    if (var123 > 15000 && var125 > 15000) {
                                                        field627 = 250;
                                                        class36.method1174(14500);
                                                        class298 var126 = class298.method8119(class296.field3098, field521.field1414);
                                                        field521.method2669(var126);
                                                    }
                                                    Statics.field1858.method1773();
                                                    method2971();
                                                    field521.field1420++;
                                                    if (field521.field1420 > 50) {
                                                        class298 var127 = class298.method8119(class296.field3124, field521.field1414);
                                                        field521.method2669(var127);
                                                    }
                                                    try {
                                                        field521.method2652();
                                                    } catch (IOException var129) {
                                                        method2262();
                                                    }
                                                    return;
                                                }
                                                method2674(var85);
                                            }
                                        }
                                        var83 = var82.field1072;
                                        if (var83.field3625 < 0) {
                                            break;
                                        }
                                        var84 = class333.method3491(var83.field3643);
                                    } while (var84 == null || var84.field3761 == null || var83.field3625 >= var84.field3761.length || var84.field3761[var83.field3625] != var83);
                                    class71.method1189(var82);
                                }
                            }
                            var80 = var79.field1072;
                            if (var80.field3625 < 0) {
                                break;
                            }
                            var81 = class333.method3491(var80.field3643);
                        } while (var81 == null || var81.field3761 == null || var80.field3625 >= var81.field3761.length || var81.field3761[var80.field3625] != var80);
                        class71.method1189(var79);
                    }
                }
                var77 = var76.field1072;
                if (var77.field3625 < 0) {
                    break;
                }
                var78 = class333.method3491(var77.field3643);
            } while (var78 == null || var78.field3761 == null || var77.field3625 >= var78.field3761.length || var78.field3761[var77.field3625] != var77);
            class71.method1189(var76);
        }
    }

    @ObfuscatedName("em.ht(B)V")
    public static final void method2560() {
        if (Statics.field2048 != null) {
            Statics.field2048.method775();
        }
    }

    @ObfuscatedName("px.hk(Lig;IIII)V")
    public static void method6955(class210 arg0, int arg1, int arg2, int arg3) {
        if (field717 < 50 && Statics.field1686.method2370() != 0 && arg0.field2266 != null && arg1 < arg0.field2266.length) {
            method825(arg0.field2266[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("az.hb(Lig;IIII)V")
    public static void method49(class210 arg0, int arg1, int arg2, int arg3) {
        if (field717 < 50 && Statics.field1686.method2370() != 0 && arg0.field2268 != null && arg0.field2268.containsKey(arg1)) {
            method825((Integer) arg0.field2268.get(arg1), arg2, arg3);
        }
    }

    @ObfuscatedName("bx.hc(IIIS)V")
    public static void method825(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field769[field717] = var3;
        field770[field717] = var4;
        field771[field717] = 0;
        field812[field717] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field586[field717] = (var6 << 16) + (var7 << 8) + var5;
        field717++;
    }

    @ObfuscatedName("ab.ia(IIIS)V")
    public static void method219(int arg0, int arg1, int arg2) {
        if (Statics.field1686.method2369() == 0 || arg1 == 0 || field717 >= 50) {
            return;
        }
        field769[field717] = arg0;
        field770[field717] = arg1;
        field771[field717] = arg2;
        field812[field717] = null;
        field586[field717] = 0;
        field717++;
    }

    @ObfuscatedName("ke.ig(II)V")
    public static void method4985(int arg0) {
        if (arg0 == -1 && !field575) {
            class307.method3865(0, 0);
        } else if (arg0 != -1) {
            boolean var2;
            if (class307.field3399.isEmpty()) {
                var2 = false;
            } else {
                class319 var1 = (class319) class307.field3399.get(0);
                var2 = var1 != null && var1.field3508 == arg0;
            }
            if (!var2 && Statics.field1686.method2367() != 0) {
                ArrayList var3 = new ArrayList();
                var3.add(new class319(Statics.field70, arg0, 0, Statics.field1686.method2367(), false));
                if (field575) {
                    class307.field3399.clear();
                    class307.field3399.addAll(var3);
                    class307.method2164(0, 100, 100, 0);
                } else {
                    class307.method2728(var3, 0, 100, 100, 0, false);
                }
            }
        }
    }

    @ObfuscatedName("hb.is(Ljava/util/ArrayList;IIIII)V")
    public static void method3628(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field575) {
            class307.method3865(0, 0);
        } else if (var5 != -1) {
            boolean var7;
            if (class307.field3399.isEmpty()) {
                var7 = false;
            } else {
                class319 var6 = (class319) class307.field3399.get(0);
                var7 = var6 != null && var6.field3508 == var5;
            }
            if (!var7 && Statics.field1686.method2367() != 0) {
                ArrayList var8 = new ArrayList();
                for (int var9 = 0; var9 < arg0.size(); var9++) {
                    var8.add(new class319(Statics.field70, (Integer) arg0.get(var9), 0, Statics.field1686.method2367(), false));
                }
                if (field575) {
                    class307.field3399.clear();
                    class307.field3399.addAll(var8);
                    class307.method2164(arg1, arg2, arg3, arg4);
                } else {
                    class307.method2728(var8, arg1, arg2, arg3, arg4, false);
                }
            }
        }
    }

    @ObfuscatedName("ck.iw(IIB)V")
    public static void method1904(int arg0, int arg1) {
        if (Statics.field1686.method2367() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class319(Statics.field512, arg0, 0, Statics.field1686.method2367(), false));
            class307.method2728(var2, 0, 0, 0, 0, true);
            field575 = true;
        }
    }

    @ObfuscatedName("client.iy(IIB)V")
    public void method1532(int arg0, int arg1) {
        if (field521 != null && field521.field1414 != null && arg0 > -1 && Statics.field1686.method2367() > 0 && !field575) {
            class298 var3 = class298.method8119(class296.field3183, field521.field1414);
            var3.field3205.method8230(arg0);
            field521.method2669(var3);
        }
    }

    @ObfuscatedName("gx.ih(Lmt;III)V")
    public static final void method3118(class333 arg0, int arg1, int arg2) {
        if (field671 != 0 && field671 != 3 || field661 || !(class36.field252 == 1 || !Statics.field170 && class36.field252 == 4)) {
            return;
        }
        class322 var3 = arg0.method5847(true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field253 - arg1;
        int var5 = class36.field254 - arg2;
        if (!var3.method5474(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3523 / 2;
        int var7 = var5 - var3.field3524 / 2;
        int var8 = field654 & 0x7FF;
        int var9 = class228.field2509[var8];
        int var10 = class228.field2510[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1605.field1192 + var11 >> 7;
        int var14 = Statics.field1605.field1206 - var12 >> 7;
        class298 var15 = class298.method8119(class296.field3181, field521.field1414);
        var15.field3205.method8227(18);
        var15.field3205.method8228(Statics.field4295 + var13);
        var15.field3205.method8346(field751.method3796(82) ? (field751.method3796(81) ? 2 : 1) : 0);
        var15.field3205.method8301(Statics.field1676 + var14);
        var15.field3205.method8227(var6);
        var15.field3205.method8227(var7);
        var15.field3205.method8228(field654);
        var15.field3205.method8227(57);
        var15.field3205.method8227(0);
        var15.field3205.method8227(0);
        var15.field3205.method8227(89);
        var15.field3205.method8228(Statics.field1605.field1192);
        var15.field3205.method8228(Statics.field1605.field1206);
        var15.field3205.method8227(63);
        field521.method2669(var15);
        field598 = var13;
        field765 = var14;
    }

    @ObfuscatedName("ty.ij(Ljava/lang/String;B)V")
    public static final void method8505(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1686.method2353(!Statics.field1686.method2354());
            if (Statics.field1686.method2354()) {
                class111.method7045(99, "", "Roofs are now all hidden");
            } else {
                class111.method7045(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class388.method5252(arg0.substring(5).trim()) == 1;
            Statics.field1352.method482(var1);
            class228.method4035(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field757 = !field757;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field1686.method2390();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field767 = !field767;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field702 = !field702;
        }
        if (field693 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1500.field4906 = !Statics.field1500.field4906;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field1686.method2408(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field1686.method2408(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2262();
            }
        }
        class298 var2 = class298.method8119(class296.field3170, field521.field1414);
        var2.field3205.method8227(arg0.length() + 1);
        var2.field3205.method8234(arg0);
        field521.method2669(var2);
    }

    @ObfuscatedName("cg.ir(IB)I")
    public static final int method1997(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("as.in(IB)I")
    public static final int method16(int arg0) {
        return Math.abs(arg0 - Statics.field4770) > 1024 ? 2048 * (arg0 < Statics.field4770 ? 1 : -1) + arg0 : arg0;
    }

    @ObfuscatedName("dd.iq(IIIB)V")
    public static final void method2206(int arg0, int arg1, int arg2) {
        if (Statics.field1743 < arg0) {
            Statics.field1743 += Statics.field991 * (arg0 - Statics.field1743) / 1000 + Statics.field756;
            if (Statics.field1743 > arg0) {
                Statics.field1743 = arg0;
            }
        }
        if (Statics.field1743 > arg0) {
            Statics.field1743 -= Statics.field991 * (Statics.field1743 - arg0) / 1000 + Statics.field756;
            if (Statics.field1743 < arg0) {
                Statics.field1743 = arg0;
            }
        }
        if (Statics.field4427 < arg1) {
            Statics.field4427 += Statics.field991 * (arg1 - Statics.field4427) / 1000 + Statics.field756;
            if (Statics.field4427 > arg1) {
                Statics.field4427 = arg1;
            }
        }
        if (Statics.field4427 > arg1) {
            Statics.field4427 -= Statics.field991 * (Statics.field4427 - arg1) / 1000 + Statics.field756;
            if (Statics.field4427 < arg1) {
                Statics.field4427 = arg1;
            }
        }
        if (Statics.field331 < arg2) {
            Statics.field331 += Statics.field991 * (arg2 - Statics.field331) / 1000 + Statics.field756;
            if (Statics.field331 > arg2) {
                Statics.field331 = arg2;
            }
        }
        if (Statics.field331 > arg2) {
            Statics.field331 -= Statics.field991 * (Statics.field331 - arg2) / 1000 + Statics.field756;
            if (Statics.field331 < arg2) {
                Statics.field331 = arg2;
            }
        }
    }

    @ObfuscatedName("hp.io(IIB)V")
    public static final void method3256(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field104 < arg0) {
            Statics.field104 += Statics.field1744 * (arg0 - Statics.field104) / 1000 + Statics.field96;
            if (Statics.field104 > arg0) {
                Statics.field104 = arg0;
            }
        } else if (Statics.field104 > arg0) {
            Statics.field104 -= Statics.field1744 * (Statics.field104 - arg0) / 1000 + Statics.field96;
            if (Statics.field104 < arg0) {
                Statics.field104 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field4770;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field4770 += Statics.field1744 * var3 / 1000 + Statics.field96;
            Statics.field4770 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field4770 -= Statics.field1744 * -var3 / 1000 + Statics.field96;
            Statics.field4770 &= 0x7FF;
        }
        int var4 = var2 - Statics.field4770;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field4770 = var2;
        }
    }

    @ObfuscatedName("bb.ib(S)V")
    public static final void method414() {
        int var0 = class108.field1366;
        int[] var1 = class108.field1370;
        for (int var2 = 0; var2 < var0; var2++) {
            class92 var3 = field612[var1[var2]];
            if (var3 != null) {
                method853(var3, 1);
            }
        }
    }

    @ObfuscatedName("fg.id(I)V")
    public static final void method2894() {
        for (int var0 = 0; var0 < field650; var0++) {
            int var1 = field576[var0];
            class101 var2 = field574[var1];
            if (var2 != null) {
                method853(var2, var2.field1313.field2003);
            }
        }
    }

    @ObfuscatedName("bl.ix(Ldx;II)V")
    public static final void method853(class96 arg0, int arg1) {
        if (arg0.field1207 >= field530) {
            int var2 = Math.max(1, arg0.field1207 - field530);
            int var3 = arg0.field1235 * 128 + arg0.field1224 * 64;
            int var4 = arg0.field1237 * 128 + arg0.field1224 * 64;
            arg0.field1192 += (var3 - arg0.field1192) / var2;
            arg0.field1206 += (var4 - arg0.field1206) / var2;
            arg0.field1257 = 0;
            arg0.field1250 = arg0.field1233;
        } else if (arg0.field1240 >= field530) {
            method3438(arg0);
        } else {
            arg0.field1256 = arg0.field1232;
            if (arg0.field1253 == 0) {
                arg0.field1257 = 0;
            } else {
                label454: {
                    if (arg0.field1211 != -1 && arg0.field1231 == 0) {
                        class210 var5 = class210.method2904(arg0.field1211);
                        if (arg0.field1258 > 0 && var5.field2280 == 0) {
                            arg0.field1257++;
                            break label454;
                        }
                        if (arg0.field1258 <= 0 && var5.field2285 == 0) {
                            arg0.field1257++;
                            break label454;
                        }
                    }
                    int var6 = arg0.field1192;
                    int var7 = arg0.field1206;
                    int var8 = arg0.field1188[arg0.field1253 - 1] * 128 + arg0.field1224 * 64;
                    int var9 = arg0.field1255[arg0.field1253 - 1] * 128 + arg0.field1224 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field1250 = 1280;
                        } else if (var7 > var9) {
                            arg0.field1250 = 1792;
                        } else {
                            arg0.field1250 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field1250 = 768;
                        } else if (var7 > var9) {
                            arg0.field1250 = 256;
                        } else {
                            arg0.field1250 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field1250 = 1024;
                    } else if (var7 > var9) {
                        arg0.field1250 = 0;
                    }
                    class219 var10 = arg0.field1241[arg0.field1253 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field1250 - arg0.field1185 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field1247;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field1236;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field1227;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field1244;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field1236;
                        }
                        arg0.field1256 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class101) {
                            var14 = ((class101) arg0).field1313.field2038;
                        }
                        if (var14) {
                            if (arg0.field1250 != arg0.field1185 && arg0.field1218 == -1 && arg0.field1252 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field1253 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field1253 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field1257 > 0 && arg0.field1253 > 1) {
                                var13 = 8;
                                arg0.field1257--;
                            }
                        } else {
                            if (arg0.field1253 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field1253 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field1257 > 0 && arg0.field1253 > 1) {
                                var13 = 8;
                                arg0.field1257--;
                            }
                        }
                        if (class219.field2378 == var10) {
                            var13 <<= 0x1;
                        } else if (class219.field2379 == var10) {
                            var13 >>= 0x1;
                        }
                        if (var13 >= 8) {
                            if (arg0.field1256 == arg0.field1236 && arg0.field1196 != -1) {
                                arg0.field1256 = arg0.field1196;
                            } else if (arg0.field1256 == arg0.field1247 && arg0.field1195 != -1) {
                                arg0.field1256 = arg0.field1195;
                            } else if (arg0.field1256 == arg0.field1244 && arg0.field1198 != -1) {
                                arg0.field1256 = arg0.field1198;
                            } else if (arg0.field1256 == arg0.field1227 && arg0.field1199 != -1) {
                                arg0.field1256 = arg0.field1199;
                            }
                        } else if (var13 <= 2) {
                            if (arg0.field1256 == arg0.field1236 && arg0.field1212 != -1) {
                                arg0.field1256 = arg0.field1212;
                            } else if (arg0.field1256 == arg0.field1247 && arg0.field1201 != -1) {
                                arg0.field1256 = arg0.field1201;
                            } else if (arg0.field1256 == arg0.field1244 && arg0.field1202 != -1) {
                                arg0.field1256 = arg0.field1202;
                            } else if (arg0.field1256 == arg0.field1227 && arg0.field1203 != -1) {
                                arg0.field1256 = arg0.field1203;
                            }
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field1192 += var13;
                                if (arg0.field1192 > var8) {
                                    arg0.field1192 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field1192 -= var13;
                                if (arg0.field1192 < var8) {
                                    arg0.field1192 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field1206 += var13;
                                if (arg0.field1206 > var9) {
                                    arg0.field1206 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field1206 -= var13;
                                if (arg0.field1206 < var9) {
                                    arg0.field1206 = var9;
                                }
                            }
                        }
                        if (arg0.field1192 == var8 && arg0.field1206 == var9) {
                            arg0.field1253--;
                            if (arg0.field1258 > 0) {
                                arg0.field1258--;
                            }
                        }
                    } else {
                        arg0.field1192 = var8;
                        arg0.field1206 = var9;
                        arg0.field1253--;
                        if (arg0.field1258 > 0) {
                            arg0.field1258--;
                        }
                    }
                }
            }
        }
        if (arg0.field1192 < 128 || arg0.field1206 < 128 || arg0.field1192 >= 13184 || arg0.field1206 >= 13184) {
            arg0.field1211 = -1;
            arg0.field1207 = 0;
            arg0.field1240 = 0;
            arg0.method2298();
            arg0.field1192 = arg0.field1188[0] * 128 + arg0.field1224 * 64;
            arg0.field1206 = arg0.field1255[0] * 128 + arg0.field1224 * 64;
            arg0.method2289();
        }
        if (Statics.field1605 == arg0 && (arg0.field1192 < 1536 || arg0.field1206 < 1536 || arg0.field1192 >= 11776 || arg0.field1206 >= 11776)) {
            arg0.field1211 = -1;
            arg0.field1207 = 0;
            arg0.field1240 = 0;
            arg0.method2298();
            arg0.field1192 = arg0.field1188[0] * 128 + arg0.field1224 * 64;
            arg0.field1206 = arg0.field1255[0] * 128 + arg0.field1224 * 64;
            arg0.method2289();
        }
        method6600(arg0);
        arg0.field1217 = false;
        if (arg0.field1256 != -1) {
            class210 var15 = class210.method2904(arg0.field1256);
            if (var15 == null) {
                arg0.field1256 = -1;
            } else if (!var15.method3738() && var15.field2265 != null) {
                arg0.field1226++;
                if (arg0.field1254 < var15.field2265.length && arg0.field1226 > var15.field2273[arg0.field1254]) {
                    arg0.field1226 = 1;
                    arg0.field1254++;
                    method6955(var15, arg0.field1254, arg0.field1192, arg0.field1206);
                }
                if (arg0.field1254 >= var15.field2265.length) {
                    if (var15.field2284 > 0) {
                        arg0.field1254 -= var15.field2284;
                        if (var15.field2286) {
                            arg0.field1194++;
                        }
                        if (arg0.field1254 < 0 || arg0.field1254 >= var15.field2265.length || var15.field2286 && arg0.field1194 >= var15.field2282) {
                            arg0.field1226 = 0;
                            arg0.field1254 = 0;
                            arg0.field1194 = 0;
                        }
                    } else {
                        arg0.field1226 = 0;
                        arg0.field1254 = 0;
                    }
                    method6955(var15, arg0.field1254, arg0.field1192, arg0.field1206);
                }
            } else if (var15.method3738()) {
                arg0.field1254++;
                int var16 = var15.method3739();
                if (arg0.field1254 < var16) {
                    method49(var15, arg0.field1254, arg0.field1192, arg0.field1206);
                } else {
                    if (var15.field2284 > 0) {
                        arg0.field1254 -= var15.field2284;
                        if (var15.field2286) {
                            arg0.field1194++;
                        }
                        if (arg0.field1254 < 0 || arg0.field1254 >= var16 || var15.field2286 && arg0.field1194 >= var15.field2282) {
                            arg0.field1254 = 0;
                            arg0.field1226 = 0;
                            arg0.field1194 = 0;
                        }
                    } else {
                        arg0.field1226 = 0;
                        arg0.field1254 = 0;
                    }
                    method49(var15, arg0.field1254, arg0.field1192, arg0.field1206);
                }
            } else {
                arg0.field1256 = -1;
            }
        }
        class488 var17 = new class488(arg0.method2280());
        for (class537 var18 = (class537) var17.method7959(); var18 != null; var18 = (class537) var17.next()) {
            if (var18.field5226 != -1 && field530 >= var18.field5222) {
                int var19 = class199.method3394(var18.field5226).field2061;
                if (var19 == -1) {
                    var18.method7662();
                    arg0.field1234--;
                } else {
                    var18.field5225 = Math.max(var18.field5225, 0);
                    class210 var20 = class210.method2904(var19);
                    if (var20.field2265 != null && !var20.method3738()) {
                        var18.field5224++;
                        if (var18.field5225 < var20.field2265.length && var18.field5224 > var20.field2273[var18.field5225]) {
                            var18.field5224 = 1;
                            var18.field5225++;
                            method6955(var20, var18.field5225, arg0.field1192, arg0.field1206);
                        }
                        if (var18.field5225 >= var20.field2265.length) {
                            var18.method7662();
                            arg0.field1234--;
                        }
                    } else if (var20.method3738()) {
                        var18.field5225++;
                        int var21 = var20.method3739();
                        if (var18.field5225 < var21) {
                            method49(var20, var18.field5225, arg0.field1192, arg0.field1206);
                        } else {
                            var18.method7662();
                            arg0.field1234--;
                        }
                    } else {
                        var18.method7662();
                        arg0.field1234--;
                    }
                }
            }
        }
        if (arg0.field1211 != -1 && arg0.field1231 <= 1) {
            class210 var22 = class210.method2904(arg0.field1211);
            if (var22.field2280 == 1 && arg0.field1258 > 0 && arg0.field1207 <= field530 && arg0.field1240 < field530) {
                arg0.field1231 = 1;
                return;
            }
        }
        if (arg0.field1211 != -1 && arg0.field1231 == 0) {
            class210 var23 = class210.method2904(arg0.field1211);
            if (var23 == null) {
                arg0.field1211 = -1;
            } else if (!var23.method3738() && var23.field2265 != null) {
                arg0.field1230++;
                if (arg0.field1229 < var23.field2265.length && arg0.field1230 > var23.field2273[arg0.field1229]) {
                    arg0.field1230 = 1;
                    arg0.field1229++;
                    method6955(var23, arg0.field1229, arg0.field1192, arg0.field1206);
                }
                if (arg0.field1229 >= var23.field2265.length) {
                    arg0.field1229 -= var23.field2284;
                    arg0.field1200++;
                    if (arg0.field1200 >= var23.field2282) {
                        arg0.field1211 = -1;
                    } else if (arg0.field1229 >= 0 && arg0.field1229 < var23.field2265.length) {
                        method6955(var23, arg0.field1229, arg0.field1192, arg0.field1206);
                    } else {
                        arg0.field1211 = -1;
                    }
                }
                arg0.field1217 = var23.field2278;
            } else if (var23.method3738()) {
                arg0.field1229++;
                int var24 = var23.method3739();
                if (arg0.field1229 < var24) {
                    method49(var23, arg0.field1229, arg0.field1192, arg0.field1206);
                } else {
                    arg0.field1229 -= var23.field2284;
                    arg0.field1200++;
                    if (arg0.field1200 >= var23.field2282) {
                        arg0.field1211 = -1;
                    } else if (arg0.field1229 >= 0 && arg0.field1229 < var24) {
                        method49(var23, arg0.field1229, arg0.field1192, arg0.field1206);
                    } else {
                        arg0.field1211 = -1;
                    }
                }
            } else {
                arg0.field1211 = -1;
            }
        }
        if (arg0.field1231 > 0) {
            arg0.field1231--;
        }
    }

    @ObfuscatedName("hd.ie(Ldx;I)V")
    public static final void method3438(class96 arg0) {
        boolean var1 = field530 == arg0.field1240 || arg0.field1211 == -1 || arg0.field1231 != 0;
        if (!var1) {
            class210 var2 = class210.method2904(arg0.field1211);
            if (var2 == null || var2.method3738()) {
                var1 = true;
            } else {
                var1 = arg0.field1230 + 1 > var2.field2273[arg0.field1229];
            }
        }
        if (var1) {
            int var3 = arg0.field1240 - arg0.field1207;
            int var4 = field530 - arg0.field1207;
            int var5 = arg0.field1235 * 128 + arg0.field1224 * 64;
            int var6 = arg0.field1237 * 128 + arg0.field1224 * 64;
            int var7 = arg0.field1224 * 64 + arg0.field1197 * 128;
            int var8 = arg0.field1225 * 128 + arg0.field1224 * 64;
            arg0.field1192 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1206 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1257 = 0;
        arg0.field1250 = arg0.field1233;
        arg0.field1185 = arg0.field1250;
    }

    @ObfuscatedName("oa.ip(Ldx;I)V")
    public static final void method6600(class96 arg0) {
        if (arg0.field1218 != -1) {
            Object var1 = null;
            int var2 = 65536;
            class96 var3;
            if (arg0.field1218 < var2) {
                var3 = field574[arg0.field1218];
            } else {
                var3 = field612[arg0.field1218 - var2];
            }
            if (var3 != null) {
                int var4 = arg0.field1192 - var3.field1192;
                int var5 = arg0.field1206 - var3.field1206;
                if (var4 != 0 || var5 != 0) {
                    int var7 = (int) (Math.atan2((double) var4, (double) var5) * 325.94932345220167D) & 0x7FF;
                    arg0.field1250 = var7;
                }
            } else if (arg0.field1219) {
                arg0.field1218 = -1;
                arg0.field1219 = false;
            }
        }
        if (arg0.field1253 == 0 || arg0.field1257 > 0) {
            int var8 = -1;
            if (arg0.field1221 != -1 && arg0.field1222 != -1) {
                int var9 = arg0.field1221 * 128 - Statics.field4295 * 128 + 64;
                int var10 = arg0.field1222 * 128 - Statics.field1676 * 128 + 64;
                int var11 = arg0.field1192 - var9;
                int var12 = arg0.field1206 - var10;
                if (var11 != 0 || var12 != 0) {
                    int var13 = (int) (Math.atan2((double) var11, (double) var12) * 325.94932345220167D) & 0x7FF;
                    var8 = var13;
                }
            } else if (arg0.field1220 != -1) {
                var8 = arg0.field1220;
            }
            if (var8 != -1) {
                arg0.field1250 = var8;
                if (arg0.field1223) {
                    arg0.field1185 = arg0.field1250;
                }
            }
            arg0.method2284();
        }
        int var14 = arg0.field1250 - arg0.field1185 & 0x7FF;
        if (var14 == 0) {
            if (arg0.field1219) {
                arg0.field1218 = -1;
                arg0.field1219 = false;
            }
            arg0.field1251 = 0;
            return;
        }
        boolean var15 = true;
        boolean var16 = true;
        arg0.field1251++;
        int var17 = var14 > 1024 ? -1 : 1;
        arg0.field1185 += arg0.field1252 * var17;
        boolean var18 = true;
        if (var14 < arg0.field1252 || var14 > 2048 - arg0.field1252) {
            arg0.field1185 = arg0.field1250;
            var18 = false;
        }
        if (arg0.field1252 > 0 && arg0.field1256 == arg0.field1232 && (arg0.field1251 > 25 || var18)) {
            if (var17 == -1 && arg0.field1238 != -1) {
                arg0.field1256 = arg0.field1238;
            } else if (var17 == 1 && arg0.field1191 != -1) {
                arg0.field1256 = arg0.field1191;
            } else {
                arg0.field1256 = arg0.field1236;
            }
        }
        arg0.field1185 &= 0x7FF;
    }

    @ObfuscatedName("ke.ic(Ldf;IIB)V")
    public static void method4988(class92 arg0, int arg1, int arg2) {
        if (arg0.field1211 == arg1 && arg1 != -1) {
            int var3 = class210.method2904(arg1).field2275;
            if (var3 == 1) {
                arg0.field1229 = 0;
                arg0.field1230 = 0;
                arg0.field1231 = arg2;
                arg0.field1200 = 0;
            }
            if (var3 == 2) {
                arg0.field1200 = 0;
            }
        } else if (arg1 == -1 || arg0.field1211 == -1 || class210.method2904(arg1).field2259 >= class210.method2904(arg0.field1211).field2259) {
            arg0.field1211 = arg1;
            arg0.field1229 = 0;
            arg0.field1230 = 0;
            arg0.field1231 = arg2;
            arg0.field1200 = 0;
            arg0.field1258 = arg0.field1253;
        }
    }

    @ObfuscatedName("ma.im(I)I")
    public static int method5997() {
        return field547 ? 2 : 1;
    }

    @ObfuscatedName("in.il(II)V")
    public static void method3866(int arg0) {
        field743 = 0L;
        if (arg0 >= 2) {
            field547 = true;
        } else {
            field547 = false;
        }
        if (method5997() == 1) {
            Statics.field1352.method466(765, 503);
        } else {
            Statics.field1352.method466(7680, 2160);
        }
        if (field813 >= 25) {
            method6976();
        }
    }

    @ObfuscatedName("ps.iu(B)V")
    public static void method6976() {
        class298 var0 = class298.method8119(class296.field3123, field521.field1414);
        var0.field3205.method8227(method5997());
        var0.field3205.method8228(Statics.field4328);
        var0.field3205.method8228(Statics.field4883);
        field521.method2669(var0);
    }

    @ObfuscatedName("client.ao(B)V")
    public final void method477() {
        field743 = class303.method2705() + 500L;
        this.method1209();
        if (field685 != -1) {
            this.method1217(true);
        }
    }

    @ObfuscatedName("client.iv(I)V")
    public void method1209() {
        int var1 = Statics.field4328;
        int var2 = Statics.field4883;
        if (this.field226 < var1) {
            int var3 = this.field226;
        }
        if (this.field203 < var2) {
            int var4 = this.field203;
        }
        if (Statics.field1686 != null) {
            try {
                class27.method376(Statics.field1352, "resize", new Object[] { method5997() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.ii(I)V")
    public final void method1210() {
        if (field685 != -1) {
            int var1 = field685;
            if (class333.method2001(var1)) {
                method2960(Statics.field1046[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field733; var2++) {
            if (field719[var2]) {
                field736[var2] = true;
            }
            field737[var2] = field719[var2];
            field719[var2] = false;
        }
        field529 = field530;
        field674 = -1;
        field675 = -1;
        if (field685 != -1) {
            field733 = 0;
            method60(field685, 0, 0, Statics.field4328, Statics.field4883, 0, 0, -1);
        }
        class524.method8573();
        if (field640) {
            if (field636 == 1) {
                Statics.field2305[field766 / 100].method8812(field633 - 8, field527 - 8);
            }
            if (field636 == 2) {
                Statics.field2305[field766 / 100 + 4].method8812(field633 - 8, field527 - 8);
            }
        }
        if (field661) {
            int var3 = Statics.field126;
            int var4 = Statics.field1482;
            int var5 = Statics.field1460;
            int var6 = Statics.field4407;
            int var7 = 6116423;
            class524.method8582(var3, var4, var5, var6, var7);
            class524.method8582(var3 + 1, var4 + 1, var5 - 2, 16, 0);
            class524.method8574(var3 + 1, var4 + 18, var5 - 2, var6 - 19, 0);
            Statics.field3792.method6810(class353.field4065, var3 + 3, var4 + 14, var7, -1);
            int var8 = class36.field245;
            int var9 = class36.field246;
            for (int var10 = 0; var10 < field679; var10++) {
                int var11 = (field679 - 1 - var10) * 15 + var4 + 31;
                int var12 = 16777215;
                if (var8 > var3 && var8 < var3 + var5 && var9 > var11 - 13 && var9 < var11 + 3) {
                    var12 = 16776960;
                }
                class395 var13 = Statics.field3792;
                String var14;
                if (var10 < 0) {
                    var14 = "";
                } else if (field669[var10].length() > 0) {
                    var14 = field668[var10] + class353.field4072 + field669[var10];
                } else {
                    var14 = field668[var10];
                }
                var13.method6810(var14, var3 + 3, var11, var12, 0);
            }
            int var15 = Statics.field126;
            int var16 = Statics.field1482;
            int var17 = Statics.field1460;
            int var18 = Statics.field4407;
            for (int var19 = 0; var19 < field733; var19++) {
                if (field740[var19] + field666[var19] > var15 && field666[var19] < var15 + var17 && field741[var19] + field739[var19] > var16 && field739[var19] < var16 + var18) {
                    field736[var19] = true;
                }
            }
        } else if (field674 != -1) {
            method6003(field674, field675);
        }
        if (field673 == 3) {
            for (int var20 = 0; var20 < field733; var20++) {
                if (field737[var20]) {
                    class524.method8581(field666[var20], field739[var20], field740[var20], field741[var20], 16711935, 128);
                } else if (field736[var20]) {
                    class524.method8581(field666[var20], field739[var20], field740[var20], field741[var20], 16711680, 128);
                }
            }
        }
        class70.method7601(Statics.field265, Statics.field1605.field1192, Statics.field1605.field1206, field703);
        field703 = 0;
    }

    @ObfuscatedName("dx.ik(Ljava/lang/String;ZI)V")
    public static final void method2308(String arg0, boolean arg1) {
        if (!field581) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1431.method6902(arg0, 250);
        int var6 = Statics.field1431.method6807(arg0, 250) * 13;
        class524.method8582(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class524.method8574(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1431.method6877(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method4185(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field1742.method453(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field733; var11++) {
            if (field740[var11] + field666[var11] > var7 && field666[var11] < var7 + var9 && field741[var11] + field739[var11] > var8 && field739[var11] < var8 + var10) {
                field736[var11] = true;
            }
        }
    }

    @ObfuscatedName("bb.iz(IIIIB)V")
    public static final void method417(int arg0, int arg1, int arg2, int arg3) {
        field630++;
        if (Statics.field1605.field1192 >> 7 == field598 && Statics.field1605.field1206 >> 7 == field765) {
            field598 = 0;
        }
        method2208();
        method2165();
        method8184(true);
        int var4 = class108.field1366;
        int[] var5 = class108.field1370;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field652 != var5[var6] && field801 != var5[var6]) {
                Statics.method6257(field612[var5[var6]], true);
            }
        }
        method8184(false);
        method6642();
        method2898();
        method450(arg0, arg1, arg2, arg3, true);
        int var7 = field790;
        int var8 = field626;
        int var9 = field541;
        int var10 = field799;
        class524.method8655(var7, var8, var7 + var9, var8 + var10);
        class228.method4049();
        class524.method8595();
        int var11 = field734;
        if (field617 / 256 > var11) {
            var11 = field617 / 256;
        }
        if (field619[4] && field785[4] + 128 > var11) {
            var11 = field785[4] + 128;
        }
        int var12 = field654 & 0x7FF;
        method439(Statics.field4805, Statics.field1109, Statics.field261, var11, var12, method7229(var11), var10);
        int var25;
        if (field774) {
            int var26;
            if (Statics.field1686.method2354()) {
                var26 = Statics.field265;
            } else {
                int var27 = method5254(Statics.field1743, Statics.field331, Statics.field265);
                if (var27 - Statics.field4427 >= 800 || (class82.field1030[Statics.field265][Statics.field1743 >> 7][Statics.field331 >> 7] & 0x4) == 0) {
                    var26 = 3;
                } else {
                    var26 = Statics.field265;
                }
            }
            var25 = var26;
        } else {
            int var13;
            if (Statics.field1686.method2354()) {
                var13 = Statics.field265;
            } else {
                label291: {
                    int var14 = 3;
                    if (Statics.field104 < 310) {
                        int var15;
                        int var16;
                        if (field606 == 1) {
                            var15 = Statics.field4805 >> 7;
                            var16 = Statics.field261 >> 7;
                        } else {
                            var15 = Statics.field1605.field1192 >> 7;
                            var16 = Statics.field1605.field1206 >> 7;
                        }
                        int var17 = Statics.field1743 >> 7;
                        int var18 = Statics.field331 >> 7;
                        if (var17 < 0 || var18 < 0 || var17 >= 104 || var18 >= 104) {
                            var13 = Statics.field265;
                            break label291;
                        }
                        if (var15 < 0 || var16 < 0 || var15 >= 104 || var16 >= 104) {
                            var13 = Statics.field265;
                            break label291;
                        }
                        if ((class82.field1030[Statics.field265][var17][var18] & 0x4) != 0) {
                            var14 = Statics.field265;
                        }
                        int var19;
                        if (var15 > var17) {
                            var19 = var15 - var17;
                        } else {
                            var19 = var17 - var15;
                        }
                        int var20;
                        if (var16 > var18) {
                            var20 = var16 - var18;
                        } else {
                            var20 = var18 - var16;
                        }
                        if (var19 > var20) {
                            int var21 = var20 * 65536 / var19;
                            int var22 = 32768;
                            while (var15 != var17) {
                                if (var17 < var15) {
                                    var17++;
                                } else if (var17 > var15) {
                                    var17--;
                                }
                                if ((class82.field1030[Statics.field265][var17][var18] & 0x4) != 0) {
                                    var14 = Statics.field265;
                                }
                                var22 += var21;
                                if (var22 >= 65536) {
                                    var22 -= 65536;
                                    if (var18 < var16) {
                                        var18++;
                                    } else if (var18 > var16) {
                                        var18--;
                                    }
                                    if ((class82.field1030[Statics.field265][var17][var18] & 0x4) != 0) {
                                        var14 = Statics.field265;
                                    }
                                }
                            }
                        } else if (var20 > 0) {
                            int var23 = var19 * 65536 / var20;
                            int var24 = 32768;
                            while (var16 != var18) {
                                if (var18 < var16) {
                                    var18++;
                                } else if (var18 > var16) {
                                    var18--;
                                }
                                if ((class82.field1030[Statics.field265][var17][var18] & 0x4) != 0) {
                                    var14 = Statics.field265;
                                }
                                var24 += var23;
                                if (var24 >= 65536) {
                                    var24 -= 65536;
                                    if (var17 < var15) {
                                        var17++;
                                    } else if (var17 > var15) {
                                        var17--;
                                    }
                                    if ((class82.field1030[Statics.field265][var17][var18] & 0x4) != 0) {
                                        var14 = Statics.field265;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field1605.field1192 >= 0 && Statics.field1605.field1206 >= 0 && Statics.field1605.field1192 < 13312 && Statics.field1605.field1206 < 13312) {
                        if ((class82.field1030[Statics.field265][Statics.field1605.field1192 >> 7][Statics.field1605.field1206 >> 7] & 0x4) != 0) {
                            var14 = Statics.field265;
                        }
                        var13 = var14;
                    } else {
                        var13 = Statics.field265;
                    }
                }
            }
            var25 = var13;
        }
        int var28 = Statics.field1743;
        int var29 = Statics.field4427;
        int var30 = Statics.field331;
        int var31 = Statics.field104;
        int var32 = Statics.field4770;
        for (int var33 = 0; var33 < 5; var33++) {
            if (field619[var33]) {
                int var34 = (int) (Math.random() * (double) (field784[var33] * 2 + 1) - (double) field784[var33] + Math.sin((double) field786[var33] / 100.0D * (double) field772[var33]) * (double) field785[var33]);
                if (var33 == 0) {
                    Statics.field1743 += var34;
                }
                if (var33 == 1) {
                    Statics.field4427 += var34;
                }
                if (var33 == 2) {
                    Statics.field331 += var34;
                }
                if (var33 == 3) {
                    Statics.field4770 = Statics.field4770 + var34 & 0x7FF;
                }
                if (var33 == 4) {
                    Statics.field104 += var34;
                    if (Statics.field104 < 128) {
                        Statics.field104 = 128;
                    }
                    if (Statics.field104 > 383) {
                        Statics.field104 = 383;
                    }
                }
            }
        }
        int var35 = class36.field245;
        int var36 = class36.field246;
        if (class36.field252 != 0) {
            var35 = class36.field253;
            var36 = class36.field254;
        }
        if (var35 >= var7 && var35 < var7 + var9 && var36 >= var8 && var36 < var8 + var10) {
            int var37 = var35 - var7;
            int var38 = var36 - var8;
            class242.field2752 = var37;
            class242.field2753 = var38;
            class242.field2758 = true;
            class242.field2754 = 0;
            class242.field2751 = false;
        } else {
            class242.field2758 = false;
            class242.field2754 = 0;
        }
        method2560();
        class524.method8582(var7, var8, var9, var10, 0);
        method2560();
        int var39 = class228.method4046();
        class228.method4035(Statics.field1352.field211);
        class228.field2511.field2782 = field800;
        Statics.field1458.method4234(Statics.field1743, Statics.field4427, Statics.field331, Statics.field104, Statics.field4770, var25);
        class228.method4035(false);
        if (field757) {
            class524.method8596();
        }
        class228.field2511.field2782 = var39;
        method2560();
        Statics.field1458.method4205();
        method2739(var7, var8, var9, var10);
        if (field537 == 2) {
            method691((field540 - Statics.field4295 << 7) + field543, (field608 - Statics.field1676 << 7) + field544, field542 * 2);
            if (field631 > -1 && field530 % 20 < 10) {
                Statics.field3859[0].method8812(field631 + var7 - 12, field750 + var8 - 28);
            }
        }
        ((class238) class228.field2511.field2783).method4392(field703);
        method7213();
        Statics.field1743 = var28;
        Statics.field4427 = var29;
        Statics.field331 = var30;
        Statics.field104 = var31;
        Statics.field4770 = var32;
        if (field683 && Statics.field1701.method6207(true, false) == 0) {
            field683 = false;
        }
        if (field683) {
            class524.method8582(var7, var8, var9, var10, 0);
            method2308(class353.field3902, false);
        }
    }

    @ObfuscatedName("bs.if(IIIIZB)V")
    public static final void method450(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field788;
        } else if (var5 >= 100) {
            var6 = field778;
        } else {
            var6 = (field778 - field788) * var5 / 100 + field788;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field760) {
            short var8 = field760;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field593) {
                var6 = field593;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class524.method8573();
                    class524.method8582(arg0, arg1, var10, arg3, -16777216);
                    class524.method8582(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field795) {
            short var11 = field795;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field792) {
                var6 = field792;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class524.method8573();
                    class524.method8582(arg0, arg1, arg2, var13, -16777216);
                    class524.method8582(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field800 = arg3 * var6 / 334;
        if (field541 != arg2 || field799 != arg3) {
            method7114(arg2, arg3);
        }
        field790 = arg0;
        field626 = arg1;
        field541 = arg2;
        field799 = arg3;
    }

    @ObfuscatedName("dd.it(I)V")
    public static void method2208() {
        if (field767) {
            Statics.method6257(Statics.field1605, false);
        }
    }

    @ObfuscatedName("dr.jd(I)V")
    public static void method2165() {
        if (field652 >= 0 && field612[field652] != null) {
            Statics.method6257(field612[field652], false);
        }
    }

    @ObfuscatedName("th.jp(ZB)V")
    public static final void method8184(boolean arg0) {
        for (int var1 = 0; var1 < field650; var1++) {
            class101 var2 = field574[field576[var1]];
            if (var2 != null && var2.method2228() && var2.field1313.field2013 == arg0 && var2.field1313.method3386()) {
                int var3 = var2.field1192 >> 7;
                int var4 = var2.field1206 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1224 == 1 && (var2.field1192 & 0x7F) == 64 && (var2.field1206 & 0x7F) == 64) {
                        if (field630 == field629[var3][var4]) {
                            continue;
                        }
                        field629[var3][var4] = field630;
                    }
                    long var5 = class242.method7370(0, 0, 1, !var2.field1313.field2036, field576[var1]);
                    var2.field1228 = field530;
                    Statics.field1458.method4238(Statics.field265, var2.field1192, var2.field1206, method5254(var2.field1192 + (var2.field1224 * 64 - 64), var2.field1206 + (var2.field1224 * 64 - 64), Statics.field265), var2.field1224 * 64 - 64 + 60, var2, var2.field1185, var5, var2.field1217);
                }
            }
        }
    }

    @ObfuscatedName("pd.jb(I)V")
    public static final void method6642() {
        for (class77 var0 = (class77) field524.method6393(); var0 != null; var0 = (class77) field524.method6374()) {
            if (Statics.field265 != var0.field967 || field530 > var0.field969) {
                var0.method7662();
            } else if (field530 >= var0.field968) {
                if (var0.field972 > 0) {
                    class101 var1 = field574[var0.field972 - 1];
                    if (var1 != null && var1.field1192 >= 0 && var1.field1192 < 13312 && var1.field1206 >= 0 && var1.field1206 < 13312) {
                        var0.method2046(var1.field1192, var1.field1206, method5254(var1.field1192, var1.field1206, var0.field967) - var0.field985, field530);
                    }
                }
                if (var0.field972 < 0) {
                    int var2 = -var0.field972 - 1;
                    class92 var3;
                    if (field801 == var2) {
                        var3 = Statics.field1605;
                    } else {
                        var3 = field612[var2];
                    }
                    if (var3 != null && var3.field1192 >= 0 && var3.field1192 < 13312 && var3.field1206 >= 0 && var3.field1206 < 13312) {
                        var0.method2046(var3.field1192, var3.field1206, method5254(var3.field1192, var3.field1206, var0.field967) - var0.field985, field530);
                    }
                }
                var0.method2047(field703);
                Statics.field1458.method4238(Statics.field265, (int) var0.field974, (int) var0.field975, (int) var0.field984, 60, var0, var0.field966, -1L, false);
            }
        }
    }

    @ObfuscatedName("fq.ju(B)V")
    public static final void method2898() {
        for (class72 var0 = (class72) field656.method6393(); var0 != null; var0 = (class72) field656.method6374()) {
            if (Statics.field265 != var0.field891 || var0.field898) {
                var0.method7662();
            } else if (field530 >= var0.field896) {
                var0.method1985(field703);
                if (var0.field898) {
                    var0.method7662();
                } else {
                    Statics.field1458.method4238(var0.field891, var0.field892, var0.field893, var0.field894, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("lw.jh(I)Lod;")
    public static class379 method5163() {
        return field728;
    }

    @ObfuscatedName("qw.jo(S)V")
    public static void method7046() {
        for (class213 var0 = (class213) field811.method6393(); var0 != null; var0 = (class213) field811.method6374()) {
            var0.method7662();
        }
    }

    @ObfuscatedName("eb.jr(Liy;I)V")
    public static void method2674(class213 arg0) {
        if (arg0 == null || arg0.field2314 == null) {
            return;
        }
        if (arg0.field2314.field3625 >= 0) {
            class333 var1 = class333.method3491(arg0.field2314.field3643);
            if (var1 == null || var1.field3761 == null || var1.field3761.length == 0 || arg0.field2314.field3625 >= var1.field3761.length || var1.field3761[arg0.field2314.field3625] != arg0.field2314) {
                return;
            }
        }
        if (arg0.field2314.field3626 == 11 && arg0.field2311 == 0) {
            if (arg0.field2314.method5886(arg0.field2312, arg0.field2313, 0, 0)) {
                switch(arg0.field2314.method5860()) {
                    case 0:
                        class32.method2478(arg0.field2314.method5862(), true, false);
                        break;
                    case 1:
                        int var2 = method2735(arg0.field2314);
                        boolean var3 = (var2 >> 22 & 0x1) != 0;
                        if (var3) {
                            int[] var4 = arg0.field2314.method5959();
                            if (var4 != null) {
                                class298 var5 = class298.method8119(class296.field3187, field521.field1414);
                                var5.field3205.method8430(arg0.field2314.field3625);
                                var5.field3205.method8296(var4[1]);
                                var5.field3205.method8297(arg0.field2314.method5835());
                                var5.field3205.method8295(var4[2]);
                                var5.field3205.method8295(var4[0]);
                                var5.field3205.method8297(arg0.field2314.field3624);
                                field521.method2669(var5);
                            }
                        }
                }
            }
        } else if (arg0.field2314.field3626 == 12) {
            class331 var6 = arg0.field2314.method5902();
            if (var6 != null && var6.method5610()) {
                switch(arg0.field2311) {
                    case 0:
                        field613.method3786(arg0.field2314);
                        var6.method5558(true);
                        var6.method5825(arg0.field2312, arg0.field2313, field751.method3796(82), field751.method3796(81));
                        break;
                    case 1:
                        var6.method5598(arg0.field2312, arg0.field2313);
                }
            }
        }
    }

    @ObfuscatedName("jg.jk(I)Z")
    public static boolean method4692() {
        return (field645 & 0x1) != 0;
    }

    @ObfuscatedName("ox.jl(I)Z")
    public static boolean method6353() {
        return (field645 & 0x2) != 0;
    }

    @ObfuscatedName("ce.jw(Ldf;I)Z")
    public static boolean method1122(class92 arg0) {
        if (field645 == 0) {
            return false;
        } else if (Statics.field1605 == arg0) {
            return (field645 & 0x8) != 0;
        } else {
            boolean var1 = (field645 & 0x4) != 0;
            return var1 || method4692() && arg0.method2214() || method6353() && arg0.method2225();
        }
    }

    @ObfuscatedName("lf.jq(Ldx;IIIIII)V")
    public static final void method5191(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2228()) {
            return;
        }
        if (arg0 instanceof class101) {
            class196 var6 = ((class101) arg0).field1313;
            if (var6.field2020 != null) {
                var6 = var6.method3412();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class108.field1366;
        int[] var8 = class108.field1370;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1214 != null && (!var9 || !arg0.field1193 && (field746 == 4 || !arg0.field1205 && (field746 == 0 || field746 == 3 || field746 == 1 && ((class92) arg0).method2214())))) {
            method2957(arg0, arg0.field1243);
            if (field631 > -1 && field532 < field616) {
                field723[field532] = Statics.field3792.method6864(arg0.field1214) / 2;
                field622[field532] = Statics.field3792.field4493;
                field752[field532] = field631;
                field647[field532] = field750 - var10;
                field624[field532] = arg0.field1208;
                field684[field532] = arg0.field1209;
                field580[field532] = arg0.field1183;
                field639[field532] = arg0.field1190;
                field628[field532] = arg0.field1214;
                field532++;
                var10 += 12;
            }
        }
        if (!arg0.field1189.method6423()) {
            method2957(arg0, arg0.field1243 + 15);
            for (class100 var11 = (class100) arg0.field1189.method6419(); var11 != null; var11 = (class100) arg0.field1189.method6421()) {
                class97 var12 = var11.method2469(field530);
                if (var12 != null) {
                    class191 var13 = var11.field1304;
                    class528 var14 = var13.method3349();
                    class528 var15 = var13.method3354();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field1964;
                    } else {
                        if (var13.field1968 * 2 < var15.field5169) {
                            var16 = var13.field1968;
                        }
                        var17 = var15.field5169 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field530 - var12.field1265;
                    int var21 = var12.field1264 * var17 / var13.field1964;
                    int var24;
                    if (var12.field1262 > var20) {
                        int var22 = var13.field1954 == 0 ? 0 : var20 / var13.field1954 * var13.field1954;
                        int var23 = var12.field1263 * var17 / var13.field1964;
                        var24 = (var21 - var23) * var22 / var12.field1262 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1262 + var13.field1962 - var20;
                        if (var13.field1965 >= 0) {
                            var18 = (var25 << 8) / (var13.field1962 - var13.field1965);
                        }
                    }
                    if (var12.field1264 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field631 > -1) {
                            int var31 = field631 + arg2 - (var17 >> 1);
                            int var32 = field750 + arg3 - var10;
                            class524.method8582(var31, var32, var24, 5, 65280);
                            class524.method8582(var24 + var31, var32, var17 - var24, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var26;
                        if (var17 == var24) {
                            var26 = var16 * 2 + var24;
                        } else {
                            var26 = var16 + var24;
                        }
                        int var27 = var14.field5174;
                        var10 += var27;
                        int var28 = field631 + arg2 - (var17 >> 1);
                        int var29 = field750 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method8714(var30, var29, var18);
                            class524.method8575(var30, var29, var26 + var30, var27 + var29);
                            var15.method8714(var30, var29, var18);
                        } else {
                            var14.method8812(var30, var29);
                            class524.method8575(var30, var29, var26 + var30, var27 + var29);
                            var15.method8812(var30, var29);
                        }
                        class524.method8655(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2470()) {
                    var11.method7662();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field530 == arg0.field1228 && method1122((class92) arg0)) {
            class92 var33 = (class92) arg0;
            if (var9) {
                method2957(arg0, arg0.field1243 + 15);
                class399 var34 = (class399) field583.get(class486.field4949);
                var10 += 4;
                var34.method6813(var33.field1115.method8881(), field631 + arg2, field750 + arg3 - var10, 16777215, 0);
                var10 += 18;
            }
        }
        if (var9) {
            class92 var35 = (class92) arg0;
            if (var35.field1135) {
                return;
            }
            if (var35.field1114 != -1 || var35.field1127 != -1) {
                method2957(arg0, arg0.field1243 + 15);
                if (field631 > -1) {
                    if (var35.field1114 != -1) {
                        var10 += 25;
                        Statics.field5042[var35.field1114].method8812(field631 + arg2 - 12, field750 + arg3 - var10);
                    }
                    if (var35.field1127 != -1) {
                        var10 += 25;
                        Statics.field93[var35.field1127].method8812(field631 + arg2 - 12, field750 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field537 == 10 && field539 == var8[arg1]) {
                method2957(arg0, arg0.field1243 + 15);
                if (field631 > -1) {
                    int var36 = Statics.field3859[1].field5174 + var10;
                    Statics.field3859[1].method8812(field631 + arg2 - 12, field750 + arg3 - var36);
                }
            }
        } else {
            class101 var37 = (class101) arg0;
            int[] var38 = var37.method2485();
            short[] var39 = var37.method2505();
            if (var39 != null && var38 != null) {
                for (int var40 = 0; var40 < var39.length; var40++) {
                    if (var39[var40] >= 0 && var38[var40] >= 0) {
                        long var41 = (long) var38[var40] << 8 | (long) var39[var40];
                        class528 var43 = (class528) field807.method7125(var41);
                        if (var43 == null) {
                            class528[] var44 = class529.method7579(Statics.field4437, var38[var40], 0);
                            if (var44 != null && var39[var40] < var44.length) {
                                var43 = var44[var39[var40]];
                                field807.method7126(var41, var43);
                            }
                        }
                        if (var43 != null) {
                            method2957(arg0, arg0.field1243 + 15);
                            if (field631 > -1) {
                                var43.method8812(field631 + arg2 - (var43.field5169 >> 1), field750 + (arg3 - var43.field5174) - 4);
                            }
                        }
                    }
                }
            }
            if (field537 == 1 && field697 == field576[arg1 - var7] && field530 % 20 < 10) {
                method2957(arg0, arg0.field1243 + 15);
                if (field631 > -1) {
                    Statics.field3859[0].method8812(field631 + arg2 - 12, field750 + arg3 - 28);
                }
            }
        }
        for (int var45 = 0; var45 < 4; var45++) {
            int var46 = arg0.field1204[var45];
            int var47 = arg0.field1186[var45];
            class206 var48 = null;
            int var49 = 0;
            if (var47 >= 0) {
                if (var46 <= field530) {
                    continue;
                }
                var48 = class206.method3238(arg0.field1186[var45]);
                var49 = var48.field2124;
                if (var48 != null && var48.field2131 != null) {
                    var48 = var48.method3565();
                    if (var48 == null) {
                        arg0.field1204[var45] = -1;
                        continue;
                    }
                }
            } else if (var46 < 0) {
                continue;
            }
            int var50 = arg0.field1215[var45];
            class206 var51 = null;
            if (var50 >= 0) {
                var51 = class206.method3238(var50);
                if (var51 != null && var51.field2131 != null) {
                    var51 = var51.method3565();
                }
            }
            if (var46 - var49 <= field530) {
                if (var48 == null) {
                    arg0.field1204[var45] = -1;
                } else {
                    method2957(arg0, arg0.field1243 / 2);
                    if (field631 > -1) {
                        boolean var52 = true;
                        if (var45 == 1) {
                            field750 -= 20;
                        }
                        if (var45 == 2) {
                            field631 -= 15;
                            field750 -= 10;
                        }
                        if (var45 == 3) {
                            field631 += 15;
                            field750 -= 10;
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
                        class528 var65 = null;
                        class528 var66 = null;
                        class528 var67 = null;
                        class528 var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        class528 var78 = var48.method3543();
                        if (var78 != null) {
                            var57 = var78.field5169;
                            int var79 = var78.field5174;
                            if (var79 > var77) {
                                var77 = var79;
                            }
                            var61 = var78.field5166;
                        }
                        class528 var80 = var48.method3547();
                        if (var80 != null) {
                            var58 = var80.field5169;
                            int var81 = var80.field5174;
                            if (var81 > var77) {
                                var77 = var81;
                            }
                            var62 = var80.field5166;
                        }
                        class528 var82 = var48.method3548();
                        if (var82 != null) {
                            var59 = var82.field5169;
                            int var83 = var82.field5174;
                            if (var83 > var77) {
                                var77 = var83;
                            }
                            var63 = var82.field5166;
                        }
                        class528 var84 = var48.method3549();
                        if (var84 != null) {
                            var60 = var84.field5169;
                            int var85 = var84.field5174;
                            if (var85 > var77) {
                                var77 = var85;
                            }
                            var64 = var84.field5166;
                        }
                        if (var51 != null) {
                            var65 = var51.method3543();
                            if (var65 != null) {
                                var69 = var65.field5169;
                                int var86 = var65.field5174;
                                if (var86 > var77) {
                                    var77 = var86;
                                }
                                var73 = var65.field5166;
                            }
                            var66 = var51.method3547();
                            if (var66 != null) {
                                var70 = var66.field5169;
                                int var87 = var66.field5174;
                                if (var87 > var77) {
                                    var77 = var87;
                                }
                                var74 = var66.field5166;
                            }
                            var67 = var51.method3548();
                            if (var67 != null) {
                                var71 = var67.field5169;
                                int var88 = var67.field5174;
                                if (var88 > var77) {
                                    var77 = var88;
                                }
                                var75 = var67.field5166;
                            }
                            var68 = var51.method3549();
                            if (var68 != null) {
                                var72 = var68.field5169;
                                int var89 = var68.field5174;
                                if (var89 > var77) {
                                    var77 = var89;
                                }
                                var76 = var68.field5166;
                            }
                        }
                        class395 var90 = var48.method3576();
                        if (var90 == null) {
                            var90 = Statics.field2226;
                        }
                        class395 var91;
                        if (var51 == null) {
                            var91 = Statics.field2226;
                        } else {
                            var91 = var51.method3576();
                            if (var91 == null) {
                                var91 = Statics.field2226;
                            }
                        }
                        Object var92 = null;
                        String var93 = null;
                        boolean var94 = false;
                        int var95 = 0;
                        String var96 = var48.method3546(arg0.field1213[var45]);
                        int var97 = var90.method6864(var96);
                        if (var51 != null) {
                            var93 = var51.method3546(arg0.field1216[var45]);
                            var95 = var91.method6864(var93);
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
                        int var114 = arg0.field1204[var45] - field530;
                        int var115 = var48.field2130 - var48.field2130 * var114 / var48.field2124;
                        int var116 = var48.field2126 * var114 / var48.field2124 + -var48.field2126;
                        int var117 = field631 + arg2 - (var106 >> 1) + var115;
                        int var118 = field750 + arg3 - 12 + var116;
                        int var119 = var118;
                        int var120 = var77 + var118;
                        int var121 = var48.field2110 + var118 + 15;
                        int var122 = var121 - var90.field4491;
                        int var123 = var90.field4488 + var121;
                        if (var122 < var118) {
                            var119 = var122;
                        }
                        if (var123 > var120) {
                            var120 = var123;
                        }
                        int var124 = 0;
                        if (var51 != null) {
                            var124 = var51.field2110 + var118 + 15;
                            int var125 = var124 - var91.field4491;
                            int var126 = var91.field4488 + var124;
                            if (var125 < var119) {
                                ;
                            }
                            if (var126 > var120) {
                                ;
                            }
                        }
                        int var129 = 255;
                        if (var48.field2127 >= 0) {
                            var129 = (var114 << 8) / (var48.field2124 - var48.field2127);
                        }
                        if (var129 >= 0 && var129 < 255) {
                            if (var78 != null) {
                                var78.method8714(var101 + var117 - var61, var118, var129);
                            }
                            if (var82 != null) {
                                var82.method8714(var102 + var117 - var63, var118, var129);
                            }
                            if (var80 != null) {
                                for (int var130 = 0; var130 < var98; var130++) {
                                    var80.method8714(var58 * var130 + (var103 + var117 - var62), var118, var129);
                                }
                            }
                            if (var84 != null) {
                                var84.method8714(var107 + var117 - var64, var118, var129);
                            }
                            var90.method6811(var96, var104 + var117, var121, var48.field2119, 0, var129);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8714(var108 + var117 - var73, var118, var129);
                                }
                                if (var67 != null) {
                                    var67.method8714(var109 + var117 - var75, var118, var129);
                                }
                                if (var66 != null) {
                                    for (int var131 = 0; var131 < var99; var131++) {
                                        var66.method8714(var70 * var131 + (var110 + var117 - var74), var118, var129);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8714(var111 + var117 - var76, var118, var129);
                                }
                                var91.method6811(var93, var112 + var117, var124, var51.field2119, 0, var129);
                            }
                        } else {
                            if (var78 != null) {
                                var78.method8812(var101 + var117 - var61, var118);
                            }
                            if (var82 != null) {
                                var82.method8812(var102 + var117 - var63, var118);
                            }
                            if (var80 != null) {
                                for (int var132 = 0; var132 < var98; var132++) {
                                    var80.method8812(var58 * var132 + (var103 + var117 - var62), var118);
                                }
                            }
                            if (var84 != null) {
                                var84.method8812(var107 + var117 - var64, var118);
                            }
                            var90.method6810(var96, var104 + var117, var121, var48.field2119 | 0xFF000000, 0);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8812(var108 + var117 - var73, var118);
                                }
                                if (var67 != null) {
                                    var67.method8812(var109 + var117 - var75, var118);
                                }
                                if (var66 != null) {
                                    for (int var133 = 0; var133 < var99; var133++) {
                                        var66.method8812(var70 * var133 + (var110 + var117 - var74), var118);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8812(var111 + var117 - var76, var118);
                                }
                                var91.method6810(var93, var112 + var117, var124, var51.field2119 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("eq.ji(IIIII)V")
    public static final void method2739(int arg0, int arg1, int arg2, int arg3) {
        field532 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class108.field1366;
        int[] var8 = class108.field1370;
        for (int var9 = 0; var9 < field650 + var7; var9++) {
            class96 var10;
            if (var9 < var7) {
                var10 = field612[var8[var9]];
                if (field652 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field1605 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field574[field576[var9 - var7]];
            }
            method5191(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field767 && var6 != -1) {
            method5191(Statics.field1605, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method5191(field612[field652], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field532; var11++) {
            int var12 = field752[var11];
            int var13 = field647[var11];
            int var14 = field723[var11];
            int var15 = field622[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field647[var17] - field622[var17] && var13 - var15 < field647[var17] + 2 && var12 - var14 < field752[var17] + field723[var17] && var12 + var14 > field752[var17] - field723[var17] && field647[var17] - field622[var17] < var13) {
                        var13 = field647[var17] - field622[var17];
                        var16 = true;
                    }
                }
            }
            field631 = field752[var11];
            field750 = field647[var11] = var13;
            String var18 = field628[var11];
            if (field689 == 0) {
                int var19 = 16776960;
                if (field624[var11] < 6) {
                    var19 = field745[field624[var11]];
                }
                if (field624[var11] == 6) {
                    var19 = field630 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field624[var11] == 7) {
                    var19 = field630 % 20 < 10 ? 255 : 65535;
                }
                if (field624[var11] == 8) {
                    var19 = field630 % 20 < 10 ? 45056 : 8454016;
                }
                if (field624[var11] == 9) {
                    int var20 = 150 - field580[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field624[var11] == 10) {
                    int var21 = 150 - field580[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field624[var11] == 11) {
                    int var22 = 150 - field580[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field624[var11] == 12 && field639[var11] == null) {
                    int var23 = var18.length();
                    field639[var11] = new int[var23];
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = (int) ((float) var24 / (float) var23 * 64.0F);
                        int var26 = var25 << 10 | 0x380 | 0x40;
                        field639[var11][var24] = Statics.field4798[var26];
                    }
                }
                if (field684[var11] == 0) {
                    Statics.field3792.method6849(var18, field631 + arg0, field750 + arg1, var19, 0, field639[var11]);
                }
                if (field684[var11] == 1) {
                    Statics.field3792.method6817(var18, field631 + arg0, field750 + arg1, var19, 0, field630, field639[var11]);
                }
                if (field684[var11] == 2) {
                    Statics.field3792.method6818(var18, field631 + arg0, field750 + arg1, var19, 0, field630, field639[var11]);
                }
                if (field684[var11] == 3) {
                    Statics.field3792.method6819(var18, field631 + arg0, field750 + arg1, var19, 0, field630, 150 - field580[var11], field639[var11]);
                }
                if (field684[var11] == 4) {
                    int var27 = (150 - field580[var11]) * (Statics.field3792.method6864(var18) + 100) / 150;
                    class524.method8575(field631 + arg0 - 50, arg1, field631 + arg0 + 50, arg1 + arg3);
                    Statics.field3792.method6842(var18, field631 + arg0 + 50 - var27, field750 + arg1, var19, 0, field639[var11]);
                    class524.method8655(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field684[var11] == 5) {
                    int var28 = 150 - field580[var11];
                    int var29 = 0;
                    if (var28 < 25) {
                        var29 = var28 - 25;
                    } else if (var28 > 125) {
                        var29 = var28 - 125;
                    }
                    class524.method8575(arg0, field750 + arg1 - Statics.field3792.field4493 - 1, arg0 + arg2, field750 + arg1 + 5);
                    Statics.field3792.method6849(var18, field631 + arg0, field750 + arg1 + var29, var19, 0, field639[var11]);
                    class524.method8655(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field3792.method6813(var18, field631 + arg0, field750 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("qt.ja(I)V")
    public static final void method7213() {
        field638 = 0;
        int var0 = (Statics.field1605.field1192 >> 7) + Statics.field4295;
        int var1 = (Statics.field1605.field1206 >> 7) + Statics.field1676;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field638 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field638 = 1;
        }
        if (field638 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field638 = 0;
        }
    }

    @ObfuscatedName("fd.je(Ldx;II)V")
    public static final void method2957(class96 arg0, int arg1) {
        method691(arg0.field1192, arg0.field1206, arg1);
    }

    @ObfuscatedName("bw.jy(IIIB)V")
    public static final void method691(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field631 = -1;
            field750 = -1;
            return;
        }
        int var3 = method5254(arg0, arg1, Statics.field265) - arg2;
        int var4 = arg0 - Statics.field1743;
        int var5 = var3 - Statics.field4427;
        int var6 = arg1 - Statics.field331;
        int var7 = class228.field2509[Statics.field104];
        int var8 = class228.field2510[Statics.field104];
        int var9 = class228.field2509[Statics.field4770];
        int var10 = class228.field2510[Statics.field4770];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field631 = field800 * var11 / var15 + field541 / 2;
            field750 = field800 * var14 / var15 + field799 / 2;
        } else {
            field631 = -1;
            field750 = -1;
        }
    }

    @ObfuscatedName("lq.jt(IIII)I")
    public static final int method5254(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class82.field1030[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class82.field1023[var5][var3][var4] + class82.field1023[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class82.field1023[var5][var3][var4 + 1] + class82.field1023[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("qs.jc(III)I")
    public static int method7289(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field791 - field600) * var2 / 100 + field600;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("bf.jn(IIIIIIIB)V")
    public static final void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method7289(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class228.field2509[var8];
            int var14 = class228.field2510[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class228.field2509[var9];
            int var17 = class228.field2510[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        if (field774) {
            Statics.field4607 = arg0 - var10;
            Statics.field4523 = arg1 - var11;
            Statics.field4411 = arg2 - var12;
            Statics.field1792 = arg3;
            Statics.field12 = arg4;
        } else {
            Statics.field1743 = arg0 - var10;
            Statics.field4427 = arg1 - var11;
            Statics.field331 = arg2 - var12;
            Statics.field104 = arg3;
            Statics.field4770 = arg4;
        }
        if (field606 != 1 || field693 < 2 || field530 % 50 != 0 || !(Statics.field4805 >> 7 != Statics.field1605.field1192 >> 7 || Statics.field261 >> 7 != Statics.field1605.field1206 >> 7)) {
            return;
        }
        int var19 = Statics.field1605.field1134;
        int var20 = (Statics.field4805 >> 7) + Statics.field4295;
        int var21 = (Statics.field261 >> 7) + Statics.field1676;
        class298 var22 = class298.method8119(class296.field3166, field521.field1414);
        var22.field3205.method8296(field625);
        var22.field3205.method8430(var20);
        var22.field3205.method8346(var19);
        var22.field3205.method8284(var21);
        field521.method2669(var22);
    }

    @ObfuscatedName("lf.jz(ZLtc;B)V")
    public static final void method5193(boolean arg0, class513 arg1) {
        field590 = arg0;
        if (!field590) {
            int var2 = arg1.method8246();
            int var3 = arg1.method8246();
            int var4 = arg1.method8246();
            Statics.field98 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field98[var5][var6] = arg1.method8496();
                }
            }
            Statics.field3464 = new int[var4];
            Statics.field1443 = new int[var4];
            Statics.field1819 = new int[var4];
            Statics.field1734 = new byte[var4][];
            Statics.field4442 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field3464[var7] = var10;
                    Statics.field1443[var7] = Statics.field120.method6129("m" + var8 + "_" + var9);
                    Statics.field1819[var7] = Statics.field120.method6129("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method6542(var3, var2, true);
            return;
        }
        int var11 = arg1.method8274();
        int var12 = arg1.method8245();
        boolean var13 = arg1.method8247() == 1;
        int var14 = arg1.method8246();
        arg1.method8189();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8196(1);
                    if (var18 == 1) {
                        field591[var15][var16][var17] = arg1.method8196(26);
                    } else {
                        field591[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8195();
        Statics.field98 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field98[var19][var20] = arg1.method8496();
            }
        }
        Statics.field3464 = new int[var14];
        Statics.field1443 = new int[var14];
        Statics.field1819 = new int[var14];
        Statics.field1734 = new byte[var14][];
        Statics.field4442 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field591[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field3464[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field3464[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field1443[var21] = Statics.field120.method6129("m" + var30 + "_" + var31);
                            Statics.field1819[var21] = Statics.field120.method6129("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method6542(var11, var12, !var13);
    }

    @ObfuscatedName("oy.jj(IIZI)V")
    public static final void method6542(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field3457 == arg0 && Statics.field1641 == arg1) {
            return;
        }
        Statics.field3457 = arg0;
        Statics.field1641 = arg1;
        method2854(25);
        method2308(class353.field3902, true);
        int var3 = Statics.field4295;
        int var4 = Statics.field1676;
        Statics.field4295 = (arg0 - 6) * 8;
        Statics.field1676 = (arg1 - 6) * 8;
        int var5 = Statics.field4295 - var3;
        int var6 = Statics.field1676 - var4;
        int var7 = Statics.field4295;
        int var8 = Statics.field1676;
        for (int var9 = 0; var9 < 65536; var9++) {
            class101 var10 = field574[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1188[var11] -= var5;
                    var10.field1255[var11] -= var6;
                }
                var10.field1192 -= var5 * 128;
                var10.field1206 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class92 var13 = field612[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1188[var14] -= var5;
                    var13.field1255[var14] -= var6;
                }
                var13.field1192 -= var5 * 128;
                var13.field1206 -= var6 * 128;
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
                        field653[var25][var21][var22] = field653[var25][var23][var24];
                    } else {
                        field653[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class95 var26 = (class95) field678.method6393(); var26 != null; var26 = (class95) field678.method6374()) {
            var26.field1166 -= var5;
            var26.field1167 -= var6;
            if (var26.field1166 < 0 || var26.field1167 < 0 || var26.field1166 >= 104 || var26.field1167 >= 104) {
                var26.method7662();
            }
        }
        if (field598 != 0) {
            field598 -= var5;
            field765 -= var6;
        }
        field717 = 0;
        field774 = false;
        Statics.field1743 -= var5 << 7;
        Statics.field331 -= var6 << 7;
        Statics.field4805 -= var5 << 7;
        Statics.field261 -= var6 << 7;
        field759 = -1;
        field656.method6379();
        field524.method6379();
        for (int var27 = 0; var27 < 4; var27++) {
            field589[var27].method3824();
        }
    }

    @ObfuscatedName("ij.jg(ZI)V")
    public static final void method3853(boolean arg0) {
        method2560();
        field521.field1420++;
        if (field521.field1420 < 50 && !arg0) {
            return;
        }
        field521.field1420 = 0;
        if (field572 || field521.method2658() == null) {
            return;
        }
        class298 var1 = class298.method8119(class296.field3124, field521.field1414);
        field521.method2669(var1);
        try {
            field521.method2652();
        } catch (IOException var3) {
            field572 = true;
        }
    }

    @ObfuscatedName("ez.jx(B)V")
    public static final void method2809() {
        method3853(false);
        field731 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1734.length; var1++) {
            if (Statics.field1443[var1] != -1 && Statics.field1734[var1] == null) {
                Statics.field1734[var1] = Statics.field120.method6117(Statics.field1443[var1], 0);
                if (Statics.field1734[var1] == null) {
                    var0 = false;
                    field731++;
                }
            }
            if (Statics.field1819[var1] != -1 && Statics.field4442[var1] == null) {
                Statics.field4442[var1] = Statics.field120.method6119(Statics.field1819[var1], 0, Statics.field98[var1]);
                if (Statics.field4442[var1] == null) {
                    var0 = false;
                    field731++;
                }
            }
        }
        if (!var0) {
            field538 = 1;
            return;
        }
        field680 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1734.length; var3++) {
            byte[] var4 = Statics.field4442[var3];
            if (var4 != null) {
                int var5 = (Statics.field3464[var3] >> 8) * 64 - Statics.field4295;
                int var6 = (Statics.field3464[var3] & 0xFF) * 64 - Statics.field1676;
                if (field590) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= Statics.method5194(var4, var5, var6);
            }
        }
        if (!var2) {
            field538 = 2;
            return;
        }
        if (field538 != 0) {
            method2308(class353.field3902 + class102.field1330 + class102.field1326 + 100 + "%" + class102.field1325, true);
        }
        method2560();
        Statics.field1458.method4320();
        for (int var7 = 0; var7 < 4; var7++) {
            field589[var7].method3824();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class82.field1030[var8][var9][var10] = 0;
                }
            }
        }
        method2560();
        class82.method5502();
        int var11 = Statics.field1734.length;
        class70.method2896();
        method3853(true);
        if (!field590) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field3464[var12] >> 8) * 64 - Statics.field4295;
                int var14 = (Statics.field3464[var12] & 0xFF) * 64 - Statics.field1676;
                byte[] var15 = Statics.field1734[var12];
                if (var15 != null) {
                    method2560();
                    class82.method1771(var15, var13, var14, Statics.field3457 * 8 - 48, Statics.field1641 * 8 - 48, field589);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field3464[var16] >> 8) * 64 - Statics.field4295;
                int var18 = (Statics.field3464[var16] & 0xFF) * 64 - Statics.field1676;
                byte[] var19 = Statics.field1734[var16];
                if (var19 == null && Statics.field1641 < 800) {
                    method2560();
                    class82.method3516(var17, var18, 64, 64);
                }
            }
            method3853(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field4442[var20];
                if (var21 != null) {
                    int var22 = (Statics.field3464[var20] >> 8) * 64 - Statics.field4295;
                    int var23 = (Statics.field3464[var20] & 0xFF) * 64 - Statics.field1676;
                    method2560();
                    class82.method275(var21, var22, var23, Statics.field1458, field589);
                }
            }
        }
        if (field590) {
            for (int var24 = 0; var24 < 4; var24++) {
                method2560();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field591[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field3464.length; var34++) {
                                if (Statics.field3464[var34] == var33 && Statics.field1734[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class82.method3240(Statics.field1734[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field589);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class82.method1996(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field591[0][var37][var38];
                    if (var39 == -1) {
                        class82.method3516(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method3853(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method2560();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field591[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field3464.length; var49++) {
                                if (Statics.field3464[var49] == var48 && Statics.field4442[var49] != null) {
                                    class82.method2097(Statics.field4442[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field1458, field589);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method3853(true);
        method2560();
        class82.method7257(Statics.field1458, field589);
        method3853(true);
        int var50 = class82.field1024;
        if (var50 > Statics.field265) {
            var50 = Statics.field265;
        }
        if (var50 < Statics.field265 - 1) {
            int var51 = Statics.field265 - 1;
        }
        if (field634) {
            Statics.field1458.method4366(class82.field1024);
        } else {
            Statics.field1458.method4366(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method6024(var52, var53);
            }
        }
        method2560();
        method1138();
        class207.field2144.method5146();
        if (Statics.field1352.method505()) {
            class298 var54 = class298.method8119(class296.field3161, field521.field1414);
            var54.field3205.method8230(1057001181);
            field521.method2669(var54);
        }
        if (!field590) {
            int var55 = (Statics.field3457 - 6) / 8;
            int var56 = (Statics.field3457 + 6) / 8;
            int var57 = (Statics.field1641 - 6) / 8;
            int var58 = (Statics.field1641 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field120.method6121("m" + var59 + "_" + var60);
                        Statics.field120.method6121("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method2854(30);
        method2560();
        class82.method3116();
        class298 var61 = class298.method8119(class296.field3174, field521.field1414);
        field521.method2669(var61);
        class35.method3347();
    }

    @ObfuscatedName("ah.js(II)V")
    public static final void method165(int arg0) {
        int[] var1 = Statics.field2622.field5168;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class82.field1030[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1458.method4227(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class82.field1030[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1458.method4227(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field2622.method8700();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class82.field1030[arg0][var10][var9] & 0x18) == 0) {
                    method5222(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class82.field1030[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method5222(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field621 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field1458.method4220(Statics.field265, var11, var12);
                if (var13 != 0L) {
                    int var15 = class242.method7614(var13);
                    int var16 = Statics.method2211(var15).field2163;
                    if (var16 >= 0 && class188.method3780(var16).field1934) {
                        field763[field621] = class188.method3780(var16).method3280(false);
                        field761[field621] = var11;
                        field577[field621] = var12;
                        field621++;
                    }
                }
            }
        }
        Statics.field1742.method8659();
    }

    @ObfuscatedName("lk.jv(IIIIIB)V")
    public static final void method5222(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1458.method4217(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1458.method4221(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field2622.field5168;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class242.method7614(var5);
            class207 var17 = Statics.method2211(var16);
            if (var17.field2164 == -1) {
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
                class527 var18 = Statics.field3067[var17.field2164];
                if (var18 != null) {
                    int var19 = (var17.field2170 * 4 - var18.field5157) / 2;
                    int var20 = (var17.field2174 * 4 - var18.field5155) / 2;
                    var18.method8673(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field2174) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field1458.method4360(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field1458.method4221(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class242.method7614(var21);
            class207 var27 = Statics.method2211(var26);
            if (var27.field2164 != -1) {
                class527 var28 = Statics.field3067[var27.field2164];
                if (var28 != null) {
                    int var29 = (var27.field2170 * 4 - var28.field5157) / 2;
                    int var30 = (var27.field2174 * 4 - var28.field5155) / 2;
                    var28.method8673(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field2174) * 4 + 48 + var30);
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
                int[] var35 = Statics.field2622.field5168;
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
        long var37 = Statics.field1458.method4220(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class242.method7614(var37);
        class207 var40 = Statics.method2211(var39);
        if (var40.field2164 == -1) {
            return;
        }
        class527 var41 = Statics.field3067[var40.field2164];
        if (var41 != null) {
            int var42 = (var40.field2170 * 4 - var41.field5157) / 2;
            int var43 = (var40.field2174 * 4 - var41.field5155) / 2;
            var41.method8673(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field2174) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.jf(Leb;IB)Z")
    public boolean method1433(class112 arg0, int arg1) {
        if (arg0.field1410 == 0) {
            Statics.field128 = null;
        } else {
            if (Statics.field128 == null) {
                Statics.field128 = new class430(Statics.field4771, Statics.field1352);
            }
            Statics.field128.method7180(arg0.field1412, arg1);
        }
        field720 = field709;
        Statics.field1005 = true;
        arg0.field1416 = null;
        return true;
    }

    @ObfuscatedName("client.kt(Leb;B)Z")
    public boolean method1212(class112 arg0) {
        if (Statics.field128 != null) {
            Statics.field128.method7187(arg0.field1412);
        }
        field720 = field709;
        Statics.field1005 = true;
        arg0.field1416 = null;
        return true;
    }

    @ObfuscatedName("client.kd(Leb;I)Z")
    public final boolean method1213(class112 arg0) {
        class440 var2 = arg0.method2658();
        class513 var3 = arg0.field1412;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1416 == null) {
                if (arg0.field1418) {
                    if (!var2.method7356(1)) {
                        return false;
                    }
                    var2.method7362(arg0.field1412.field5070, 0, 1);
                    arg0.field1424 = 0;
                    arg0.field1418 = false;
                }
                var3.field5072 = 0;
                if (var3.method8192()) {
                    if (!var2.method7356(1)) {
                        return false;
                    }
                    var2.method7362(arg0.field1412.field5070, 1, 1);
                    arg0.field1424 = 0;
                }
                arg0.field1418 = true;
                class299[] var4 = class299.method2649();
                int var5 = var3.method8193();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5072);
                }
                arg0.field1416 = var4[var5];
                arg0.field1410 = arg0.field1416.field3339;
            }
            if (arg0.field1410 == -1) {
                if (!var2.method7356(1)) {
                    return false;
                }
                arg0.method2658().method7362(var3.field5070, 0, 1);
                arg0.field1410 = var3.field5070[0] & 0xFF;
            }
            if (arg0.field1410 == -2) {
                if (!var2.method7356(2)) {
                    return false;
                }
                arg0.method2658().method7362(var3.field5070, 0, 2);
                var3.field5072 = 0;
                arg0.field1410 = var3.method8246();
            }
            if (!var2.method7356(arg0.field1410)) {
                return false;
            }
            var3.field5072 = 0;
            var2.method7362(var3.field5070, 0, arg0.field1410);
            arg0.field1424 = 0;
            field582.method7033();
            arg0.field1423 = arg0.field1422;
            arg0.field1422 = arg0.field1417;
            arg0.field1417 = arg0.field1416;
            if (class299.field3230 == arg0.field1416) {
                int var6 = var3.method8358();
                String var7 = var3.method8369();
                class333 var8 = class333.method3491(var6);
                if (!var7.equals(var8.field3639)) {
                    var8.field3639 = var7;
                    method3478(var8);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3254 == arg0.field1416) {
                int var9 = var3.method8278();
                int var10 = var3.method8448();
                int var11 = var10 >> 16;
                int var12 = var10 >> 8 & 0xFF;
                int var13 = (var10 >> 4 & 0x7) + var11;
                int var14 = (var10 & 0x7) + var12;
                int var15 = var3.method8246();
                int var16 = var3.method8246();
                if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104) {
                    int var17 = var13 * 128 + 64;
                    int var18 = var14 * 128 + 64;
                    class72 var19 = new class72(var15, Statics.field265, var17, var18, method5254(var17, var18, Statics.field265) - var9, var16, field530);
                    field656.method6367(var19);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3229 == arg0.field1416) {
                field774 = true;
                field782 = false;
                field776 = true;
                Statics.field2871 = var3.method8244();
                Statics.field1575 = var3.method8244();
                int var20 = var3.method8246();
                int var21 = var3.method8244() * 128 + 64;
                int var22 = var3.method8244() * 128 + 64;
                int var23 = var3.method8246();
                field783 = var3.method8253();
                int var24 = var3.method8244();
                int var25 = Statics.field2871 * 128 + 64;
                int var26 = Statics.field1575 * 128 + 64;
                boolean var27 = false;
                boolean var28 = false;
                int var29;
                int var30;
                if (field783) {
                    var29 = Statics.field4427;
                    var30 = method5254(var25, var26, Statics.field265) - var20;
                } else {
                    var29 = method5254(Statics.field1743, Statics.field331, Statics.field265) - Statics.field4427;
                    var30 = var20;
                }
                field779 = new class478(Statics.field1743, Statics.field331, var29, var25, var26, var30, var21, var22, var23, var24);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3334 == arg0.field1416) {
                int var31 = var3.method8277();
                int var32 = var3.method8245();
                int var33 = var3.method8245();
                if (var33 == 65535) {
                    var33 = -1;
                }
                class101 var34 = field574[var32];
                if (var34 != null) {
                    if (var34.field1211 == var33 && var33 != -1) {
                        int var35 = class210.method2904(var33).field2275;
                        if (var35 == 1) {
                            var34.field1229 = 0;
                            var34.field1230 = 0;
                            var34.field1231 = var31;
                            var34.field1200 = 0;
                        } else if (var35 == 2) {
                            var34.field1200 = 0;
                        }
                    } else if (var33 == -1 || var34.field1211 == -1 || class210.method2904(var33).field2259 >= class210.method2904(var34.field1211).field2259) {
                        var34.field1211 = var33;
                        var34.field1229 = 0;
                        var34.field1230 = 0;
                        var34.field1231 = var31;
                        var34.field1200 = 0;
                        var34.field1258 = var34.field1253;
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3244 == arg0.field1416) {
                method8164();
                int var36 = var3.method8300();
                int var37 = var3.method8244();
                int var38 = var3.method8278();
                field659[var38] = var36;
                field657[var38] = var37;
                field578[var38] = 1;
                for (int var39 = 0; var39 < 98; var39++) {
                    if (var36 >= class343.field3833[var39]) {
                        field578[var38] = var39 + 2;
                    }
                }
                field714[++field712 - 1 & 0x1F] = var38;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3259 == arg0.field1416) {
                for (int var40 = 0; var40 < field612.length; var40++) {
                    if (field612[var40] != null) {
                        field612[var40].field1211 = -1;
                    }
                }
                for (int var41 = 0; var41 < field574.length; var41++) {
                    if (field574[var41] != null) {
                        field574[var41].field1211 = -1;
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3316 == arg0.field1416) {
                int var42 = var3.method8244();
                method6234(var42);
                arg0.field1416 = null;
                return false;
            }
            if (class299.field3226 == arg0.field1416) {
                byte[] var43 = new byte[arg0.field1410];
                var3.method8218(var43, 0, var43.length);
                class514 var44 = new class514(var43);
                String var45 = var44.method8369();
                class32.method2478(var45, true, false);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3327 == arg0.field1416) {
                int var46 = var3.method8300();
                class333 var47 = class333.method3491(var46);
                var47.field3668 = 3;
                var47.field3621 = Statics.field1605.field1139.method5525();
                method3478(var47);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3232 == arg0.field1416) {
                method401(class297.field3202);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3221 == arg0.field1416) {
                int var48 = var3.method8288();
                int var49 = var3.method8288();
                int var50 = var3.method8246();
                int var51 = var3.method8274();
                int var52 = var3.method8274();
                if (var52 == 65535) {
                    var52 = -1;
                }
                ArrayList var53 = new ArrayList();
                var53.add(var52);
                method3628(var53, var49, var51, var48, var50);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3319 == arg0.field1416) {
                field774 = true;
                field782 = false;
                field798 = true;
                Statics.field125 = var3.method8244();
                Statics.field1891 = var3.method8244();
                Statics.field4950 = var3.method8246();
                int var54 = var3.method8246();
                int var55 = var3.method8244();
                int var56 = Statics.field125 * 128 + 64;
                int var57 = Statics.field1891 * 128 + 64;
                int var58 = method5254(var56, var57, Statics.field265) - Statics.field4950;
                int var59 = var56 - Statics.field1743;
                int var60 = var58 - Statics.field4427;
                int var61 = var57 - Statics.field331;
                double var62 = Math.sqrt((double) (var59 * var59 + var61 * var61));
                int var64 = method1997((int) (Math.atan2((double) var60, var62) * 325.9490051269531D) & 0x7FF);
                int var65 = method16((int) (Math.atan2((double) var59, (double) var61) * -325.9490051269531D) & 0x7FF);
                field644 = new class480(Statics.field104, var64, var54, var55);
                field780 = new class480(Statics.field4770, var65, var54, var55);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3314 == arg0.field1416) {
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3320 == arg0.field1416) {
                field774 = true;
                field782 = false;
                field798 = true;
                int var66 = var3.method8497();
                int var67 = var3.method8497();
                int var68 = method1997(Statics.field104 + var67 & 0x7EB);
                int var69 = Statics.field4770 + var66;
                int var70 = var3.method8246();
                int var71 = var3.method8244();
                field644 = new class480(Statics.field104, var68, var70, var71);
                field780 = new class480(Statics.field4770, var69, var70, var71);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3280 == arg0.field1416) {
                field774 = true;
                field782 = false;
                field798 = false;
                Statics.field125 = var3.method8244();
                Statics.field1891 = var3.method8244();
                Statics.field4950 = var3.method8246();
                Statics.field96 = var3.method8244();
                Statics.field1744 = var3.method8244();
                if (Statics.field1744 >= 100) {
                    int var72 = Statics.field125 * 128 + 64;
                    int var73 = Statics.field1891 * 128 + 64;
                    int var74 = method5254(var72, var73, Statics.field265) - Statics.field4950;
                    int var75 = var72 - Statics.field1743;
                    int var76 = var74 - Statics.field4427;
                    int var77 = var73 - Statics.field331;
                    int var78 = (int) Math.sqrt((double) (var75 * var75 + var77 * var77));
                    Statics.field104 = (int) (Math.atan2((double) var76, (double) var78) * 325.9490051269531D) & 0x7FF;
                    Statics.field4770 = (int) (Math.atan2((double) var75, (double) var77) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field104 < 128) {
                        Statics.field104 = 128;
                    }
                    if (Statics.field104 > 383) {
                        Statics.field104 = 383;
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3308 == arg0.field1416) {
                int var79 = var3.method8245();
                int var80 = var3.method8496();
                int var81 = var79 >> 10 & 0x1F;
                int var82 = var79 >> 5 & 0x1F;
                int var83 = var79 & 0x1F;
                int var84 = (var83 << 3) + (var81 << 19) + (var82 << 11);
                class333 var85 = class333.method3491(var80);
                if (var85.field3736 != var84) {
                    var85.field3736 = var84;
                    method3478(var85);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3220 == arg0.field1416) {
                method8164();
                field692 = var3.method8497();
                field725 = field709;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3253 == arg0.field1416) {
                boolean var86 = var3.method8244() == 1;
                if (var86) {
                    Statics.field2050 = class303.method2705() - var3.method8251();
                    Statics.field166 = new class362(var3, true);
                } else {
                    Statics.field166 = null;
                }
                field724 = field709;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3271 == arg0.field1416) {
                return this.method1433(arg0, 1);
            }
            if (class299.field3224 == arg0.field1416) {
                int var87 = var3.method8496();
                if (field625 != var87) {
                    field625 = var87;
                    method2741();
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3222 == arg0.field1416 && field774) {
                field782 = true;
                field798 = false;
                field776 = false;
                for (int var88 = 0; var88 < 5; var88++) {
                    field619[var88] = false;
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3274 == arg0.field1416) {
                int var89 = var3.method8306();
                int var90 = var3.method8496();
                class333 var91 = class333.method3491(var90);
                if (var91.field3672 != var89 || var89 == -1) {
                    var91.field3672 = var89;
                    var91.field3759 = 0;
                    var91.field3760 = 0;
                    method3478(var91);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3293 == arg0.field1416) {
                String var92 = var3.method8369();
                long var93 = var3.method8251();
                long var95 = (long) var3.method8246();
                long var97 = (long) var3.method8248();
                class355 var99 = (class355) class374.method2465(class355.method2275(), var3.method8244());
                long var100 = (var95 << 32) + var97;
                boolean var102 = false;
                for (int var103 = 0; var103 < 100; var103++) {
                    if (field749[var103] == var100) {
                        var102 = true;
                        break;
                    }
                }
                if (var99.field4235 && Statics.field1858.method1779(new class538(var92, Statics.field4771))) {
                    var102 = true;
                }
                if (!var102 && field638 == 0) {
                    field749[field641] = var100;
                    field641 = (field641 + 1) % 100;
                    String var104 = class399.method6808(class388.method2996(class336.method5161(var3)));
                    if (var99.field4233 == -1) {
                        class111.method3823(9, var92, var104, class390.method3200(var93));
                    } else {
                        class111.method3823(9, class102.method2158(var99.field4233) + var92, var104, class390.method3200(var93));
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3335 == arg0.field1416) {
                int var105 = var3.method8288();
                int var106 = var3.method8288();
                class307.method3865(var106, var105);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3317 == arg0.field1416) {
                method5072();
                arg0.field1416 = null;
                return false;
            }
            if (class299.field3272 == arg0.field1416) {
                int var107 = var3.method8260();
                boolean var108 = var3.method8244() == 1;
                String var109 = "";
                boolean var110 = false;
                if (var108) {
                    var109 = var3.method8369();
                    if (Statics.field1858.method1779(new class538(var109, Statics.field4771))) {
                        var110 = true;
                    }
                }
                String var111 = var3.method8369();
                if (!var110) {
                    class111.method7045(var107, var109, var111);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3269 == arg0.field1416) {
                int var112 = var3.method8494();
                int var113 = var3.method8246();
                class333 var114 = class333.method3491(var112);
                if (var114 != null && var114.field3626 == 0) {
                    if (var113 > var114.field3737 - var114.field3640) {
                        var113 = var114.field3737 - var114.field3640;
                    }
                    if (var113 < 0) {
                        var113 = 0;
                    }
                    if (var114.field3646 != var113) {
                        var114.field3646 = var113;
                        method3478(var114);
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3296 == arg0.field1416) {
                field782 = false;
                field774 = false;
                field776 = false;
                field798 = false;
                Statics.field125 = 0;
                Statics.field1891 = 0;
                Statics.field4950 = 0;
                field783 = false;
                Statics.field96 = 0;
                Statics.field1744 = 0;
                Statics.field991 = 0;
                Statics.field756 = 0;
                Statics.field2871 = 0;
                Statics.field1575 = 0;
                Statics.field4409 = 0;
                field779 = null;
                field644 = null;
                field780 = null;
                for (int var115 = 0; var115 < 5; var115++) {
                    field619[var115] = false;
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3225 == arg0.field1416) {
                method401(class297.field3199);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3323 == arg0.field1416) {
                method401(class297.field3200);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3307 == arg0.field1416) {
                byte var116 = var3.method8264();
                long var117 = (long) var3.method8246();
                long var119 = (long) var3.method8248();
                long var121 = (var117 << 32) + var119;
                boolean var123 = false;
                class164 var124 = var116 >= 0 ? field758[var116] : Statics.field2860;
                if (var124 == null) {
                    var123 = true;
                } else {
                    for (int var125 = 0; var125 < 100; var125++) {
                        if (field749[var125] == var121) {
                            var123 = true;
                            break;
                        }
                    }
                }
                if (!var123) {
                    field749[field641] = var121;
                    field641 = (field641 + 1) % 100;
                    String var126 = class336.method5161(var3);
                    int var127 = var116 >= 0 ? 43 : 46;
                    class111.method3823(var127, "", var126, var124.field1778);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3238 == arg0.field1416) {
                byte var128 = var3.method8264();
                int var129 = var3.method8277();
                int var130 = var3.method8244();
                int var131 = var3.method8244() * 4;
                byte var132 = var3.method8280();
                int var133 = var3.method8278() * 4;
                int var134 = var3.method8448();
                int var135 = var134 >> 16;
                int var136 = var134 >> 8 & 0xFF;
                int var137 = (var134 >> 4 & 0x7) + var135;
                int var138 = (var134 & 0x7) + var136;
                int var139 = var3.method8328();
                int var140 = var3.method8288();
                int var141 = var3.method8274();
                int var142 = var3.method8288();
                int var143 = var128 + var137;
                int var144 = var132 + var138;
                if (var137 >= 0 && var138 >= 0 && var137 < 104 && var138 < 104 && var143 >= 0 && var144 >= 0 && var143 < 104 && var144 < 104 && var140 != 65535) {
                    int var145 = var137 * 128 + 64;
                    int var146 = var138 * 128 + 64;
                    int var147 = var143 * 128 + 64;
                    int var148 = var144 * 128 + 64;
                    class77 var149 = new class77(var140, Statics.field265, var145, var146, method5254(var145, var146, Statics.field265) - var133, field530 + var142, field530 + var141, var130, var129, var139, var131);
                    var149.method2046(var147, var148, method5254(var147, var148, Statics.field265) - var131, field530 + var142);
                    field524.method6367(var149);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3218 == arg0.field1416) {
                int var150 = arg0.field1410 + var3.field5072;
                int var151 = var3.method8246();
                if (var151 == 65535) {
                    var151 = -1;
                }
                int var152 = var3.method8246();
                if (field685 != var151) {
                    field685 = var151;
                    this.method1217(false);
                    method2260(field685);
                    class71.method1137(field685);
                    for (int var153 = 0; var153 < 100; var153++) {
                        field719[var153] = true;
                    }
                }
                while (var152-- > 0) {
                    int var154 = var3.method8496();
                    int var155 = var3.method8246();
                    int var156 = var3.method8244();
                    class87 var157 = (class87) field686.method7981((long) var154);
                    if (var157 != null && var157.field1067 != var155) {
                        method2291(var157, true);
                        var157 = null;
                    }
                    if (var157 == null) {
                        var157 = method4669(var154, var155, var156);
                    }
                    var157.field1066 = true;
                }
                for (class87 var158 = (class87) field686.method7983(); var158 != null; var158 = (class87) field686.method7991()) {
                    if (var158.field1066) {
                        var158.field1066 = false;
                    } else {
                        method2291(var158, true);
                    }
                }
                field732 = new class490(512);
                while (var3.field5072 < var150) {
                    int var159 = var3.method8496();
                    int var160 = var3.method8246();
                    int var161 = var3.method8246();
                    int var162 = var3.method8496();
                    for (int var163 = var160; var163 <= var161; var163++) {
                        long var164 = ((long) var159 << 32) + (long) var163;
                        field732.method7990(new class473(var162), var164);
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3304 == arg0.field1416) {
                return this.method1433(arg0, 2);
            }
            if (class299.field3311 == arg0.field1416) {
                int var166 = var3.method8496();
                class333 var167 = class333.method3491(var166);
                for (int var168 = 0; var168 < var167.field3620.length; var168++) {
                    var167.field3620[var168] = -1;
                    var167.field3620[var168] = 0;
                }
                method3478(var167);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3325 == arg0.field1416) {
                method7469(var3.method8369());
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3286 == arg0.field1416) {
                int var169 = var3.method8245();
                class92 var170;
                if (field801 == var169) {
                    var170 = Statics.field1605;
                } else {
                    var170 = field612[var169];
                }
                int var171 = var3.method8244();
                int var172 = var3.method8288();
                int var173 = var3.method8300();
                if (var170 != null) {
                    var170.method2288(var171, var172, var173 >> 16, var173 & 0xFFFF);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3277 == arg0.field1416) {
                var3.field5072 += 28;
                if (var3.method8273()) {
                    method6951(var3, var3.field5072 - 28);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3321 == arg0.field1416) {
                String var174 = var3.method8369();
                Object[] var175 = new Object[var174.length() + 1];
                for (int var176 = var174.length() - 1; var176 >= 0; var176--) {
                    if (var174.charAt(var176) == 's') {
                        var175[var176 + 1] = var3.method8369();
                    } else {
                        var175[var176 + 1] = Integer.valueOf(var3.method8496());
                    }
                }
                var175[0] = Integer.valueOf(var3.method8496());
                class88 var177 = new class88();
                var177.field1076 = var175;
                class71.method1189(var177);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3249 == arg0.field1416) {
                boolean var178 = var3.method8253();
                if (!var178) {
                    Statics.field1456 = null;
                } else if (Statics.field1456 == null) {
                    Statics.field1456 = new class371();
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3284 == arg0.field1416) {
                if (field685 != -1) {
                    method2094(field685, 0);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3245 == arg0.field1416) {
                int var179 = var3.method8245();
                if (var179 == 65535) {
                    var179 = -1;
                }
                int var180 = var3.method8494();
                int var181 = var3.method8494();
                class333 var182 = class333.method3491(var180);
                if (var182.field3623) {
                    var182.field3757 = var179;
                    var182.field3648 = var181;
                    class208 var184 = class208.method2788(var179).method3638(var181);
                    var182.field3664 = var184.field2200;
                    var182.field3677 = var184.field2190;
                    var182.field3768 = var184.field2202;
                    var182.field3674 = var184.field2203;
                    var182.field3675 = var184.field2201;
                    var182.field3679 = var184.field2199;
                    if (var184.field2205 == 1) {
                        var182.field3685 = 1;
                    } else {
                        var182.field3685 = 2;
                    }
                    if (var182.field3680 > 0) {
                        var182.field3679 = var182.field3679 * 32 / var182.field3680;
                    } else if (var182.field3750 > 0) {
                        var182.field3679 = var182.field3679 * 32 / var182.field3750;
                    }
                    method3478(var182);
                } else if (var179 == -1) {
                    var182.field3668 = 0;
                    arg0.field1416 = null;
                    return true;
                } else {
                    class208 var183 = class208.method2788(var179).method3638(var181);
                    var182.field3668 = 4;
                    var182.field3621 = var179;
                    var182.field3664 = var183.field2200;
                    var182.field3677 = var183.field2190;
                    var182.field3679 = var183.field2199 * 100 / var181;
                    method3478(var182);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3278 == arg0.field1416) {
                int var185 = var3.method8245();
                int var186 = var3.method8494();
                int var187 = var3.method8245();
                class333 var188 = class333.method3491(var186);
                var188.field3681 = (var187 << 16) + var185;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3289 == arg0.field1416) {
                field537 = var3.method8244();
                if (field537 == 1) {
                    field697 = var3.method8246();
                }
                if (field537 >= 2 && field537 <= 6) {
                    if (field537 == 2) {
                        field543 = 64;
                        field544 = 64;
                    }
                    if (field537 == 3) {
                        field543 = 0;
                        field544 = 64;
                    }
                    if (field537 == 4) {
                        field543 = 128;
                        field544 = 64;
                    }
                    if (field537 == 5) {
                        field543 = 64;
                        field544 = 0;
                    }
                    if (field537 == 6) {
                        field543 = 64;
                        field544 = 128;
                    }
                    field537 = 2;
                    field540 = var3.method8246();
                    field608 = var3.method8246();
                    field542 = var3.method8244();
                }
                if (field537 == 10) {
                    field539 = var3.method8246();
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3243 == arg0.field1416) {
                int var189 = var3.method8496();
                class87 var190 = (class87) field686.method7981((long) var189);
                if (var190 != null) {
                    method2291(var190, true);
                }
                if (field690 != null) {
                    method3478(field690);
                    field690 = null;
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3315 == arg0.field1416) {
                Statics.field1601 = new class456(Statics.field3842);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3258 == arg0.field1416) {
                Statics.field4441 = var3.method8244();
                Statics.field2979 = var3.method8244();
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3236 == arg0.field1416) {
                field774 = true;
                field782 = false;
                field798 = true;
                int var191 = method16(var3.method8497() & 0x7EB);
                int var192 = method1997(var3.method8497() & 0x7EB);
                int var193 = var3.method8246();
                int var194 = var3.method8244();
                field644 = new class480(Statics.field104, var192, var193, var194);
                field780 = new class480(Statics.field4770, var191, var193, var194);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3299 == arg0.field1416) {
                if (Statics.field1601 == null) {
                    Statics.field1601 = new class456(Statics.field3842);
                }
                class523 var195 = Statics.field3842.method7590(var3);
                Statics.field1601.field4769.method7995(var195.field5136, var195.field5135);
                field716[++field794 - 1 & 0x1F] = var195.field5136;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3216 == arg0.field1416) {
                int var196 = var3.method8247();
                int var197 = var196 >> 2;
                int var198 = var196 & 0x3;
                int var199 = field592[var197];
                int var200 = var3.method8246();
                int var201 = var3.method8248();
                int var202 = var201 >> 16;
                int var203 = var201 >> 8 & 0xFF;
                int var204 = (var201 >> 4 & 0x7) + var202;
                int var205 = (var201 & 0x7) + var203;
                if (var204 >= 0 && var205 >= 0 && var204 < 103 && var205 < 103) {
                    if (var199 == 0) {
                        class249 var206 = Statics.field1458.method4213(Statics.field265, var204, var205);
                        if (var206 != null) {
                            int var207 = class242.method7614(var206.field2816);
                            if (var197 == 2) {
                                var206.field2809 = new class80(var207, 2, var198 + 4, Statics.field265, var204, var205, var200, false, var206.field2809);
                                var206.field2815 = new class80(var207, 2, var198 + 1 & 0x3, Statics.field265, var204, var205, var200, false, var206.field2815);
                            } else {
                                var206.field2809 = new class80(var207, var197, var198, Statics.field265, var204, var205, var200, false, var206.field2809);
                            }
                        }
                    } else if (var199 == 1) {
                        class251 var208 = Statics.field1458.method4248(Statics.field265, var204, var205);
                        if (var208 != null) {
                            int var209 = class242.method7614(var208.field2830);
                            if (var197 == 4 || var197 == 5) {
                                var208.field2828 = new class80(var209, 4, var198, Statics.field265, var204, var205, var200, false, var208.field2828);
                            } else if (var197 == 6) {
                                var208.field2828 = new class80(var209, 4, var198 + 4, Statics.field265, var204, var205, var200, false, var208.field2828);
                            } else if (var197 == 7) {
                                var208.field2828 = new class80(var209, 4, (var198 + 2 & 0x3) + 4, Statics.field265, var204, var205, var200, false, var208.field2828);
                            } else if (var197 == 8) {
                                var208.field2828 = new class80(var209, 4, var198 + 4, Statics.field265, var204, var205, var200, false, var208.field2828);
                                var208.field2823 = new class80(var209, 4, (var198 + 2 & 0x3) + 4, Statics.field265, var204, var205, var200, false, var208.field2823);
                            }
                        }
                    } else if (var199 == 2) {
                        class252 var210 = Statics.field1458.method4215(Statics.field265, var204, var205);
                        if (var197 == 11) {
                            var197 = 10;
                        }
                        if (var210 != null) {
                            var210.field2834 = new class80(class242.method7614(var210.field2846), var197, var198, Statics.field265, var204, var205, var200, false, var210.field2834);
                        }
                    } else if (var199 == 3) {
                        class224 var211 = Statics.field1458.method4216(Statics.field265, var204, var205);
                        if (var211 != null) {
                            var211.field2448 = new class80(class242.method7614(var211.field2451), 22, var198, Statics.field265, var204, var205, var200, false, var211.field2448);
                        }
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3337 == arg0.field1416) {
                int var212 = var3.method8246();
                int var213 = var3.method8246();
                int var214 = var3.method8245();
                int var215 = var3.method8245();
                class307.method7564(var214, var212, var215, var213);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3223 == arg0.field1416) {
                int var216 = var3.method8278();
                int var217 = var3.method8278();
                String var218 = var3.method8369();
                if (var216 >= 1 && var216 <= 8) {
                    if (var218.equalsIgnoreCase(class353.field3906)) {
                        var218 = null;
                    }
                    field662[var216 - 1] = var218;
                    field768[var216 - 1] = var217 == 0;
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3336 == arg0.field1416) {
                int var219 = var3.method8278();
                int var220 = var3.method8274();
                if (var220 == 65535) {
                    var220 = -1;
                }
                method4988(Statics.field1605, var220, var219);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3252 == arg0.field1416) {
                method401(class297.field3195);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3330 == arg0.field1416) {
                int var221 = var3.method8246();
                int var222 = var3.method8358();
                class333 var223 = class333.method3491(var222);
                if (var223.field3668 != 6 || var223.field3621 != var221) {
                    var223.field3668 = 6;
                    var223.field3621 = var221;
                    method3478(var223);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3305 == arg0.field1416) {
                field598 = var3.method8244();
                if (field598 == 255) {
                    field598 = 0;
                }
                field765 = var3.method8244();
                if (field765 == 255) {
                    field765 = 0;
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3312 == arg0.field1416) {
                field623 = field709;
                byte var224 = var3.method8264();
                class161 var225 = new class161(var3);
                class164 var226;
                if (var224 >= 0) {
                    var226 = field758[var224];
                } else {
                    var226 = Statics.field2860;
                }
                var225.method3075(var226);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3302 == arg0.field1416) {
                int var227 = var3.method8288();
                int var228 = var3.method8246();
                if (var228 == 65535) {
                    var228 = -1;
                }
                int var229 = var3.method8274();
                if (var229 == 65535) {
                    var229 = -1;
                }
                int var230 = var3.method8246();
                int var231 = var3.method8274();
                int var232 = var3.method8288();
                ArrayList var233 = new ArrayList();
                var233.add(var229);
                var233.add(var228);
                method3628(var233, var232, var231, var227, var230);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3273 == arg0.field1416) {
                int var234 = var3.method8496();
                int var235 = var3.method8246();
                if (var234 < -70000) {
                    var235 += 32768;
                }
                class333 var236;
                if (var234 >= 0) {
                    var236 = class333.method3491(var234);
                } else {
                    var236 = null;
                }
                if (var236 != null) {
                    for (int var237 = 0; var237 < var236.field3620.length; var237++) {
                        var236.field3620[var237] = 0;
                        var236.field3756[var237] = 0;
                    }
                }
                Statics.method6258(var235);
                int var238 = var3.method8246();
                for (int var239 = 0; var239 < var238; var239++) {
                    int var240 = var3.method8247();
                    if (var240 == 255) {
                        var240 = var3.method8496();
                    }
                    int var241 = var3.method8245();
                    if (var236 != null && var239 < var236.field3620.length) {
                        var236.field3620[var239] = var241;
                        var236.field3756[var239] = var240;
                    }
                    class85.method3627(var235, var239, var241 - 1, var240);
                }
                if (var236 != null) {
                    method3478(var236);
                }
                method8164();
                field808[++field687 - 1 & 0x1F] = var235 & 0x7FFF;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3295 == arg0.field1416) {
                boolean var242 = this.method1220() == null;
                class108.method2180(var3, arg0.field1410);
                Statics.method4987();
                if (var242 && this.method1220() != null && this.method1220().method8882().equalsIgnoreCase("nin")) {
                    class111.method7045(4, "", "$jmod_luck = true");
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3332 == arg0.field1416) {
                byte var243 = var3.method8264();
                String var244 = var3.method8369();
                long var245 = (long) var3.method8246();
                long var247 = (long) var3.method8248();
                class355 var249 = (class355) class374.method2465(class355.method2275(), var3.method8244());
                long var250 = (var245 << 32) + var247;
                boolean var252 = false;
                Object var253 = null;
                class164 var254 = var243 >= 0 ? field758[var243] : Statics.field2860;
                if (var254 == null) {
                    var252 = true;
                } else {
                    int var255 = 0;
                    while (true) {
                        if (var255 >= 100) {
                            if (var249.field4235 && Statics.field1858.method1779(new class538(var244, Statics.field4771))) {
                                var252 = true;
                            }
                            break;
                        }
                        if (field749[var255] == var250) {
                            var252 = true;
                            break;
                        }
                        var255++;
                    }
                }
                if (!var252) {
                    field749[field641] = var250;
                    field641 = (field641 + 1) % 100;
                    String var256 = class399.method6808(class336.method5161(var3));
                    int var257 = var243 >= 0 ? 41 : 44;
                    if (var249.field4233 == -1) {
                        class111.method3823(var257, var244, var256, var254.field1778);
                    } else {
                        class111.method3823(var257, class102.method2158(var249.field4233) + var244, var256, var254.field1778);
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3306 == arg0.field1416) {
                int var258 = var3.method8288();
                if (var258 == 65535) {
                    var258 = -1;
                }
                int var259 = var3.method8300();
                int var260 = var3.method8245();
                if (var260 == 65535) {
                    var260 = -1;
                }
                int var261 = var3.method8300();
                for (int var262 = var258; var262 <= var260; var262++) {
                    long var263 = ((long) var261 << 32) + (long) var262;
                    class474 var265 = field732.method7981(var263);
                    if (var265 != null) {
                        var265.method7662();
                    }
                    field732.method7990(new class473(var259), var263);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3285 == arg0.field1416) {
                int var266 = var3.method8358();
                int var267 = var3.method8496();
                class333 var268 = class333.method3491(var266);
                class333.method2759(var268, var267);
                method3478(var268);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3276 == arg0.field1416) {
                int var269 = var3.method8494();
                int var270 = var3.method8274();
                class333 var271 = class333.method3491(var269);
                if (var271.field3668 != 1 || var271.field3621 != var270) {
                    var271.field3668 = 1;
                    var271.field3621 = var270;
                    method3478(var271);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3257 == arg0.field1416) {
                Statics.field1858.method1820(var3, arg0.field1410);
                field764 = field709;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3275 == arg0.field1416) {
                int var272 = var3.method8496();
                int var273 = var3.method8244();
                int var274 = var3.method8288();
                class87 var275 = (class87) field686.method7981((long) var272);
                if (var275 != null) {
                    method2291(var275, var275.field1067 != var274);
                }
                method4669(var272, var274, var273);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3256 == arg0.field1416) {
                field747 = var3.method8277();
                field746 = var3.method8278();
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3290 == arg0.field1416) {
                for (int var276 = 0; var276 < Statics.field1905; var276++) {
                    class187 var277 = class187.method3069(var276);
                    if (var277 != null) {
                        class323.field3531[var276] = 0;
                        class323.field3532[var276] = 0;
                    }
                }
                method8164();
                field711 += 32;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3333 == arg0.field1416) {
                boolean var278 = var3.method8277() == 1;
                int var279 = var3.method8494();
                class333 var280 = class333.method3491(var279);
                class333.method4957(var280, Statics.field1605.field1139, var278);
                method3478(var280);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3247 == arg0.field1416) {
                int var281 = var3.method8277();
                int var282 = var3.method8247();
                int var283 = var3.method8358();
                class333 var284 = class333.method3491(var283);
                class333.method5430(var284, var282, var281);
                method3478(var284);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3233 == arg0.field1416) {
                int var285 = var3.method8496();
                int var286 = var3.method8247();
                class333 var287 = class333.method3491(var285);
                class333.method3218(var287, Statics.field1605.field1139.field3564, var286);
                method3478(var287);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3268 == arg0.field1416) {
                int var288 = var3.method8246();
                if (var288 == 65535) {
                    var288 = -1;
                }
                method4985(var288);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3261 == arg0.field1416) {
                int var289 = var3.method8292();
                int var290 = var3.method8288();
                if (var290 == 65535) {
                    var290 = -1;
                }
                method1904(var290, var289);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3239 == arg0.field1416) {
                Statics.field80 = class533.method4145(var3.method8244());
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3300 == arg0.field1416) {
                field623 = field709;
                byte var291 = var3.method8264();
                if (arg0.field1410 == 1) {
                    if (var291 >= 0) {
                        field758[var291] = null;
                    } else {
                        Statics.field2860 = null;
                    }
                    arg0.field1416 = null;
                    return true;
                }
                if (var291 >= 0) {
                    field758[var291] = new class164(var3);
                } else {
                    Statics.field2860 = new class164(var3);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3279 == arg0.field1416) {
                int var292 = var3.method8244();
                if (var3.method8244() == 0) {
                    field805[var292] = new class369();
                    var3.field5072 += 18;
                } else {
                    var3.field5072--;
                    field805[var292] = new class369(var3, false);
                }
                field722 = field709;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3250 == arg0.field1416) {
                method401(class297.field3201);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3328 == arg0.field1416) {
                method401(class297.field3194);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3309 == arg0.field1416) {
                method4033();
                byte var293 = var3.method8264();
                class147 var294 = new class147(var3);
                class155 var295;
                if (var293 >= 0) {
                    var295 = field713[var293];
                } else {
                    var295 = Statics.field61;
                }
                var294.method2976(var295);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3246 == arg0.field1416) {
                boolean var296 = var3.method8247() == 1;
                int var297 = var3.method8494();
                class333 var298 = class333.method3491(var297);
                if (var298.field3644 != var296) {
                    var298.field3644 = var296;
                    method3478(var298);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3227 == arg0.field1416) {
                int var299 = var3.method8300();
                int var300 = var3.method8494();
                class87 var301 = (class87) field686.method7981((long) var300);
                class87 var302 = (class87) field686.method7981((long) var299);
                if (var302 != null) {
                    method2291(var302, var301 == null || var301.field1067 != var302.field1067);
                }
                if (var301 != null) {
                    var301.method7662();
                    field686.method7990(var301, (long) var299);
                }
                class333 var303 = class333.method3491(var300);
                if (var303 != null) {
                    method3478(var303);
                }
                class333 var304 = class333.method3491(var299);
                if (var304 != null) {
                    method3478(var304);
                    Statics.method838(Statics.field1046[var304.field3624 >>> 16], var304, true);
                }
                if (field685 != -1) {
                    method2094(field685, 1);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3288 == arg0.field1416) {
                int var305 = var3.method8306();
                int var306 = var3.method8300();
                int var307 = var3.method8289();
                class333 var308 = class333.method3491(var306);
                if (var308.field3633 != var305 || var308.field3634 != var307 || var308.field3718 != 0 || var308.field3630 != 0) {
                    var308.field3633 = var305;
                    var308.field3634 = var307;
                    var308.field3718 = 0;
                    var308.field3630 = 0;
                    method3478(var308);
                    this.method1218(var308);
                    if (var308.field3626 == 0) {
                        Statics.method838(Statics.field1046[var306 >> 16], var308, false);
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3265 == arg0.field1416) {
                for (int var309 = 0; var309 < class323.field3532.length; var309++) {
                    if (class323.field3532[var309] != class323.field3531[var309]) {
                        class323.field3532[var309] = class323.field3531[var309];
                        method1992(var309);
                        field710[++field711 - 1 & 0x1F] = var309;
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3281 == arg0.field1416) {
                Statics.field1601 = null;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3260 == arg0.field1416) {
                int var310 = var3.method8246();
                int var311 = var3.method8244();
                int var312 = var3.method8246();
                method219(var310, var311, var312);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3331 == arg0.field1416) {
                method6111(true, var3);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3303 == arg0.field1416) {
                int var313 = var3.method8244();
                method7191(var313);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3241 == arg0.field1416) {
                int var314 = var3.method8358();
                int var315 = var3.method8274();
                int var316 = var3.method8288();
                class101 var317 = field574[var316];
                int var318 = var3.method8244();
                if (var317 != null) {
                    var317.method2288(var318, var315, var314 >> 16, var314 & 0xFFFF);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3217 == arg0.field1416) {
                method401(class297.field3196);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3282 == arg0.field1416) {
                field671 = var3.method8244();
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3231 == arg0.field1416) {
                return this.method1212(arg0);
            }
            if (class299.field3235 == arg0.field1416) {
                String var319 = var3.method8369();
                String var320 = class399.method6808(class388.method2996(class336.method5161(var3)));
                class111.method7045(6, var319, var320);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3219 == arg0.field1416) {
                int var321 = var3.method8496();
                int var322 = var3.method8496();
                int var323 = class35.method395();
                class298 var324 = class298.method8119(class296.field3129, field521.field1414);
                var324.field3205.method8402(var323);
                var324.field3205.method8346(field208);
                var324.field3205.method8295(var321);
                var324.field3205.method8230(var322);
                field521.method2669(var324);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3292 == arg0.field1416) {
                method4033();
                byte var325 = var3.method8264();
                if (arg0.field1410 == 1) {
                    if (var325 >= 0) {
                        field713[var325] = null;
                    } else {
                        Statics.field61 = null;
                    }
                    arg0.field1416 = null;
                    return true;
                }
                if (var325 >= 0) {
                    field713[var325] = new class155(var3);
                } else {
                    Statics.field61 = new class155(var3);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3301 == arg0.field1416) {
                class37.method4370(var3, arg0.field1410);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3294 == arg0.field1416) {
                method5193(false, arg0.field1412);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3270 == arg0.field1416) {
                method5193(true, arg0.field1412);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3263 == arg0.field1416) {
                String var326 = var3.method8369();
                long var327 = (long) var3.method8246();
                long var329 = (long) var3.method8248();
                class355 var331 = (class355) class374.method2465(class355.method2275(), var3.method8244());
                long var332 = (var327 << 32) + var329;
                boolean var334 = false;
                for (int var335 = 0; var335 < 100; var335++) {
                    if (field749[var335] == var332) {
                        var334 = true;
                        break;
                    }
                }
                if (Statics.field1858.method1779(new class538(var326, Statics.field4771))) {
                    var334 = true;
                }
                if (!var334 && field638 == 0) {
                    field749[field641] = var332;
                    field641 = (field641 + 1) % 100;
                    String var336 = class399.method6808(class388.method2996(class336.method5161(var3)));
                    byte var337;
                    if (var331.field4234) {
                        var337 = 7;
                    } else {
                        var337 = 3;
                    }
                    if (var331.field4233 == -1) {
                        class111.method7045(var337, var326, var336);
                    } else {
                        class111.method7045(var337, class102.method2158(var331.field4233) + var326, var336);
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3310 == arg0.field1416) {
                class68 var338 = new class68();
                var338.field831 = var3.method8369();
                var338.field825 = var3.method8246();
                int var339 = var3.method8496();
                var338.field828 = var339;
                if (var338.method1718()) {
                    var338.field824 = "beta";
                }
                method2854(45);
                var2.method7348();
                Object var340 = null;
                class76.method2913(var338);
                arg0.field1416 = null;
                return false;
            }
            if (class299.field3313 == arg0.field1416) {
                method8164();
                field691 = var3.method8246();
                field725 = field709;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3297 == arg0.field1416) {
                int var341 = var3.method8300();
                short var342 = (short) var3.method8289();
                int var343 = var3.method8277();
                int var344 = var3.method8245();
                class101 var345 = field574[var344];
                if (var345 != null) {
                    var345.method2486(var343, var341, var342);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3322 == arg0.field1416) {
                int var346 = var3.method8288();
                if (var346 == 65535) {
                    var346 = -1;
                }
                field685 = var346;
                this.method1217(false);
                method2260(var346);
                class71.method1137(field685);
                for (int var347 = 0; var347 < 100; var347++) {
                    field719[var347] = true;
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3234 == arg0.field1416) {
                int var348 = var3.method8245();
                class85.method1105(var348);
                field808[++field687 - 1 & 0x1F] = var348 & 0x7FFF;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3291 == arg0.field1416) {
                Statics.field1858.method1774();
                field764 = field709;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3287 == arg0.field1416) {
                method401(class297.field3198);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3251 == arg0.field1416) {
                method401(class297.field3203);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3329 == arg0.field1416) {
                method401(class297.field3197);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3318 == arg0.field1416) {
                Statics.field4441 = var3.method8247();
                Statics.field2979 = var3.method8278();
                while (var3.field5072 < arg0.field1410) {
                    int var349 = var3.method8244();
                    class297 var350 = class297.method4574()[var349];
                    method401(var350);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3264 == arg0.field1416) {
                Statics.field1858.field843.method7167(var3, arg0.field1410);
                method6030();
                field764 = field709;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3262 == arg0.field1416) {
                field536 = var3.method8274() * 30;
                field725 = field709;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3266 == arg0.field1416) {
                int var351 = var3.method8274();
                int var352 = var3.method8496();
                int var353 = var3.method8274();
                int var354 = var3.method8274();
                class333 var355 = class333.method3491(var352);
                if (var355.field3664 != var354 || var355.field3677 != var351 || var355.field3679 != var353) {
                    var355.field3664 = var354;
                    var355.field3677 = var351;
                    var355.field3679 = var353;
                    method3478(var355);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3283 == arg0.field1416) {
                int var356 = var3.method8496();
                int var357 = var3.method8246();
                if (var356 < -70000) {
                    var357 += 32768;
                }
                class333 var358;
                if (var356 >= 0) {
                    var358 = class333.method3491(var356);
                } else {
                    var358 = null;
                }
                while (var3.field5072 < arg0.field1410) {
                    int var359 = var3.method8260();
                    int var360 = var3.method8246();
                    int var361 = 0;
                    if (var360 != 0) {
                        var361 = var3.method8244();
                        if (var361 == 255) {
                            var361 = var3.method8496();
                        }
                    }
                    if (var358 != null && var359 >= 0 && var359 < var358.field3620.length) {
                        var358.field3620[var359] = var360;
                        var358.field3756[var359] = var361;
                    }
                    class85.method3627(var357, var359, var360 - 1, var361);
                }
                if (var358 != null) {
                    method3478(var358);
                }
                method8164();
                field808[++field687 - 1 & 0x1F] = var357 & 0x7FFF;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3255 == arg0.field1416) {
                byte var362 = var3.method8282();
                int var363 = var3.method8246();
                class323.field3531[var363] = var362;
                if (class323.field3532[var363] != var362) {
                    class323.field3532[var363] = var362;
                }
                method1992(var363);
                field710[++field711 - 1 & 0x1F] = var363;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3326 == arg0.field1416) {
                method401(class297.field3204);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3267 == arg0.field1416) {
                Statics.field4441 = var3.method8244();
                Statics.field2979 = var3.method8244();
                for (int var364 = Statics.field2979; var364 < Statics.field2979 + 8; var364++) {
                    for (int var365 = Statics.field4441; var365 < Statics.field4441 + 8; var365++) {
                        if (field653[Statics.field265][var364][var365] != null) {
                            field653[Statics.field265][var364][var365] = null;
                            method6024(var364, var365);
                        }
                    }
                }
                for (class95 var366 = (class95) field678.method6393(); var366 != null; var366 = (class95) field678.method6374()) {
                    if (var366.field1166 >= Statics.field2979 && var366.field1166 < Statics.field2979 + 8 && var366.field1167 >= Statics.field4441 && var366.field1167 < Statics.field4441 + 8 && Statics.field265 == var366.field1179) {
                        var366.field1177 = 0;
                    }
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3242 == arg0.field1416) {
                int var367 = var3.method8245();
                int var368 = var3.method8300();
                class333 var369 = class333.method3491(var368);
                if (var369.field3668 != 2 || var369.field3621 != var367) {
                    var369.field3668 = 2;
                    var369.field3621 = var367;
                    method3478(var369);
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3240 == arg0.field1416) {
                int var370 = var3.method8244();
                int var371 = var3.method8244();
                int var372 = var3.method8244();
                int var373 = var3.method8244();
                field619[var370] = true;
                field784[var370] = var371;
                field785[var370] = var372;
                field786[var370] = var373;
                field772[var370] = 0;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3228 == arg0.field1416) {
                method6111(false, var3);
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3324 == arg0.field1416) {
                field774 = true;
                field782 = false;
                field776 = false;
                Statics.field2871 = var3.method8244();
                Statics.field1575 = var3.method8244();
                Statics.field4409 = var3.method8246();
                Statics.field756 = var3.method8244();
                Statics.field991 = var3.method8244();
                if (Statics.field991 >= 100) {
                    Statics.field1743 = Statics.field2871 * 128 + 64;
                    Statics.field331 = Statics.field1575 * 128 + 64;
                    Statics.field4427 = method5254(Statics.field1743, Statics.field331, Statics.field265) - Statics.field4409;
                }
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3237 == arg0.field1416) {
                int var374 = var3.method8288();
                int var375 = var3.method8300();
                class323.field3531[var374] = var375;
                if (class323.field3532[var374] != var375) {
                    class323.field3532[var374] = var375;
                }
                method1992(var374);
                field710[++field711 - 1 & 0x1F] = var374;
                arg0.field1416 = null;
                return true;
            }
            if (class299.field3298 == arg0.field1416) {
                field774 = true;
                field782 = false;
                field776 = true;
                Statics.field2871 = var3.method8244();
                Statics.field1575 = var3.method8244();
                int var376 = var3.method8246();
                int var377 = var3.method8246();
                field783 = var3.method8253();
                int var378 = var3.method8244();
                int var379 = Statics.field2871 * 128 + 64;
                int var380 = Statics.field1575 * 128 + 64;
                boolean var381 = false;
                boolean var382 = false;
                int var383;
                int var384;
                if (field783) {
                    var383 = Statics.field4427;
                    var384 = method5254(var379, var380, Statics.field265) - var376;
                } else {
                    var383 = method5254(Statics.field1743, Statics.field331, Statics.field265) - Statics.field4427;
                    var384 = var376;
                }
                field779 = new class479(Statics.field1743, Statics.field331, var383, var379, var380, var384, var377, var378);
                arg0.field1416 = null;
                return true;
            }
            class541.method5458("" + (arg0.field1416 == null ? -1 : arg0.field1416.field3338) + class102.field1324 + (arg0.field1422 == null ? -1 : arg0.field1422.field3338) + class102.field1324 + (arg0.field1423 == null ? -1 : arg0.field1423.field3338) + class102.field1324 + arg0.field1410, (Throwable) null);
            method5072();
        } catch (IOException var389) {
            method2262();
        } catch (Exception var390) {
            String var387 = "" + (arg0.field1416 == null ? -1 : arg0.field1416.field3338) + class102.field1324 + (arg0.field1422 == null ? -1 : arg0.field1422.field3338) + class102.field1324 + (arg0.field1423 == null ? -1 : arg0.field1423.field3338) + class102.field1324 + arg0.field1410 + class102.field1324 + (Statics.field4295 + Statics.field1605.field1188[0]) + class102.field1324 + (Statics.field1676 + Statics.field1605.field1255[0]) + class102.field1324;
            for (int var388 = 0; var388 < arg0.field1410 && var388 < 50; var388++) {
                var387 = var387 + var3.field5070[var388] + class102.field1324;
            }
            class541.method5458(var387, var390);
            method5072();
        }
        return true;
    }

    @ObfuscatedName("bb.kr(Llo;B)V")
    public static final void method401(class297 arg0) {
        class513 var1 = field521.field1412;
        if (class297.field3196 == arg0) {
            int var2 = var1.method8278();
            int var3 = var2 >> 4 & 0xF;
            int var4 = var2 & 0x7;
            int var5 = var1.method8277();
            int var6 = var1.method8247();
            int var7 = (var6 >> 4 & 0x7) + Statics.field2979;
            int var8 = (var6 & 0x7) + Statics.field4441;
            int var9 = var1.method8245();
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                int var10 = var3 + 1;
                if (Statics.field1605.field1188[0] >= var7 - var10 && Statics.field1605.field1188[0] <= var7 + var10 && Statics.field1605.field1255[0] >= var8 - var10 && Statics.field1605.field1255[0] <= var8 + var10 && Statics.field1686.method2370() != 0 && var4 > 0 && field717 < 50) {
                    field769[field717] = var9;
                    field770[field717] = var4;
                    field771[field717] = var5;
                    field812[field717] = null;
                    field586[field717] = (var7 << 16) + (var8 << 8) + var3;
                    field717++;
                }
            }
        }
        if (class297.field3195 == arg0) {
            int var11 = var1.method8494();
            int var12 = var1.method8247();
            var1.method8246();
            var1.method8278();
            int var13 = var1.method8246();
            int var14 = var1.method8244();
            int var15 = (var14 >> 4 & 0x7) + Statics.field2979;
            int var16 = (var14 & 0x7) + Statics.field4441;
            var1.method8244();
            var1.method8274();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                class105 var17 = new class105();
                var17.field1346 = var13;
                var17.field1350 = var11;
                var17.method2549(var12);
                if (field653[Statics.field265][var15][var16] == null) {
                    field653[Statics.field265][var15][var16] = new class379();
                }
                field653[Statics.field265][var15][var16].method6367(var17);
                method6024(var15, var16);
            }
        } else if (class297.field3194 == arg0) {
            int var18 = var1.method8245();
            int var19 = var1.method8244();
            int var20 = (var19 >> 4 & 0x7) + Statics.field2979;
            int var21 = (var19 & 0x7) + Statics.field4441;
            int var22 = var1.method8247();
            int var23 = var22 >> 2;
            int var24 = var22 & 0x3;
            int var25 = field592[var23];
            if (var20 >= 0 && var21 >= 0 && var20 < 103 && var21 < 103) {
                if (var25 == 0) {
                    class249 var26 = Statics.field1458.method4213(Statics.field265, var20, var21);
                    if (var26 != null) {
                        int var27 = class242.method7614(var26.field2816);
                        if (var23 == 2) {
                            var26.field2809 = new class80(var27, 2, var24 + 4, Statics.field265, var20, var21, var18, false, var26.field2809);
                            var26.field2815 = new class80(var27, 2, var24 + 1 & 0x3, Statics.field265, var20, var21, var18, false, var26.field2815);
                        } else {
                            var26.field2809 = new class80(var27, var23, var24, Statics.field265, var20, var21, var18, false, var26.field2809);
                        }
                        return;
                    }
                }
                if (var25 == 1) {
                    class251 var28 = Statics.field1458.method4248(Statics.field265, var20, var21);
                    if (var28 != null) {
                        int var29 = class242.method7614(var28.field2830);
                        if (var23 == 4 || var23 == 5) {
                            var28.field2828 = new class80(var29, 4, var24, Statics.field265, var20, var21, var18, false, var28.field2828);
                        } else if (var23 == 6) {
                            var28.field2828 = new class80(var29, 4, var24 + 4, Statics.field265, var20, var21, var18, false, var28.field2828);
                        } else if (var23 == 7) {
                            var28.field2828 = new class80(var29, 4, (var24 + 2 & 0x3) + 4, Statics.field265, var20, var21, var18, false, var28.field2828);
                        } else if (var23 == 8) {
                            var28.field2828 = new class80(var29, 4, var24 + 4, Statics.field265, var20, var21, var18, false, var28.field2828);
                            var28.field2823 = new class80(var29, 4, (var24 + 2 & 0x3) + 4, Statics.field265, var20, var21, var18, false, var28.field2823);
                        }
                        return;
                    }
                }
                if (var25 == 2) {
                    class252 var30 = Statics.field1458.method4215(Statics.field265, var20, var21);
                    if (var23 == 11) {
                        var23 = 10;
                    }
                    if (var30 != null) {
                        var30.field2834 = new class80(class242.method7614(var30.field2846), var23, var24, Statics.field265, var20, var21, var18, false, var30.field2834);
                        return;
                    }
                }
                if (var25 == 3) {
                    class224 var31 = Statics.field1458.method4216(Statics.field265, var20, var21);
                    if (var31 != null) {
                        var31.field2448 = new class80(class242.method7614(var31.field2451), 22, var24, Statics.field265, var20, var21, var18, false, var31.field2448);
                        return;
                    }
                }
                method4372(Statics.field265, var20, var21, var25, var18);
            }
        } else if (class297.field3203 == arg0) {
            int var32 = var1.method8247();
            int var33 = var1.method8244();
            int var34 = (var33 >> 4 & 0x7) + Statics.field2979;
            int var35 = (var33 & 0x7) + Statics.field4441;
            int var36 = var1.method8246();
            int var37 = var1.method8274();
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                int var38 = var34 * 128 + 64;
                int var39 = var35 * 128 + 64;
                class72 var40 = new class72(var36, Statics.field265, var38, var39, method5254(var38, var39, Statics.field265) - var32, var37, field530);
                field656.method6367(var40);
            }
        } else if (class297.field3198 == arg0) {
            int var41 = var1.method8277();
            int var42 = (var41 >> 4 & 0x7) + Statics.field2979;
            int var43 = (var41 & 0x7) + Statics.field4441;
            int var44 = var1.method8246();
            int var45 = var1.method8300();
            int var46 = var1.method8300();
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                class379 var47 = field653[Statics.field265][var42][var43];
                if (var47 != null) {
                    for (class105 var48 = (class105) var47.method6393(); var48 != null; var48 = (class105) var47.method6374()) {
                        if ((var44 & 0x7FFF) == var48.field1346 && var48.field1350 == var45) {
                            var48.field1350 = var46;
                            break;
                        }
                    }
                    method6024(var42, var43);
                }
            }
        } else if (class297.field3199 == arg0) {
            int var49 = var1.method8244();
            int var50 = var1.method8244();
            int var51 = (var50 >> 4 & 0x7) + Statics.field2979;
            int var52 = (var50 & 0x7) + Statics.field4441;
            int var53 = var1.method8246();
            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                class379 var54 = field653[Statics.field265][var51][var52];
                if (var54 != null) {
                    for (class105 var55 = (class105) var54.method6393(); var55 != null; var55 = (class105) var54.method6374()) {
                        if ((var53 & 0x7FFF) == var55.field1346) {
                            var55.method2549(var49);
                            break;
                        }
                    }
                }
            }
        } else if (class297.field3201 == arg0) {
            int var56 = var1.method8247();
            int var57 = (var56 >> 4 & 0x7) + Statics.field2979;
            int var58 = (var56 & 0x7) + Statics.field4441;
            int var59 = var1.method8277();
            int var60 = var1.method8245();
            int var61 = var1.method8244();
            int var62 = var61 >> 2;
            int var63 = var61 & 0x3;
            int var64 = field592[var62];
            if (var57 >= 0 && var58 >= 0 && var57 < 104 && var58 < 104) {
                method5049(Statics.field265, var57, var58, var64, var60, var62, var63, var59, 0, -1);
            }
        } else {
            if (class297.field3204 == arg0) {
                byte var65 = var1.method8280();
                int var66 = var1.method8277();
                int var67 = (var66 >> 4 & 0x7) + Statics.field2979;
                int var68 = (var66 & 0x7) + Statics.field4441;
                int var69 = var1.method8274();
                int var70 = var1.method8245();
                int var71 = var1.method8246();
                int var72 = var1.method8274();
                byte var73 = var1.method8264();
                int var74 = var1.method8244();
                int var75 = var74 >> 2;
                int var76 = var74 & 0x3;
                int var77 = field592[var75];
                byte var78 = var1.method8280();
                byte var79 = var1.method8264();
                class92 var80;
                if (field801 == var69) {
                    var80 = Statics.field1605;
                } else {
                    var80 = field612[var69];
                }
                if (var80 != null) {
                    class207 var81 = Statics.method2211(var70);
                    int var82;
                    int var83;
                    if (var76 == 1 || var76 == 3) {
                        var82 = var81.field2174;
                        var83 = var81.field2170;
                    } else {
                        var82 = var81.field2170;
                        var83 = var81.field2174;
                    }
                    int var84 = (var82 >> 1) + var67;
                    int var85 = (var82 + 1 >> 1) + var67;
                    int var86 = (var83 >> 1) + var68;
                    int var87 = (var83 + 1 >> 1) + var68;
                    int[][] var88 = class82.field1023[Statics.field265];
                    int var89 = var88[var84][var86] + var88[var85][var86] + var88[var84][var87] + var88[var85][var87] >> 2;
                    int var90 = (var67 << 7) + (var82 << 6);
                    int var91 = (var68 << 7) + (var83 << 6);
                    class241 var92 = var81.method3585(var75, var76, var88, var90, var89, var91);
                    if (var92 != null) {
                        method5049(Statics.field265, var67, var68, var77, -1, 0, 0, 31, var72 + 1, var71 + 1);
                        var80.field1112 = field530 + var72;
                        var80.field1122 = field530 + var71;
                        var80.field1126 = var92;
                        var80.field1123 = var67 * 128 + var82 * 64;
                        var80.field1120 = var68 * 128 + var83 * 64;
                        var80.field1124 = var89;
                        if (var65 > var79) {
                            byte var93 = var65;
                            var65 = var79;
                            var79 = var93;
                        }
                        if (var73 > var78) {
                            byte var94 = var73;
                            var73 = var78;
                            var78 = var94;
                        }
                        var80.field1125 = var65 + var67;
                        var80.field1129 = var67 + var79;
                        var80.field1128 = var68 + var73;
                        var80.field1138 = var68 + var78;
                    }
                }
            }
            if (class297.field3202 == arg0) {
                int var95 = var1.method8246();
                int var96 = var1.method8294();
                int var97 = var1.method8278();
                byte var98 = var1.method8282();
                int var99 = var1.method8278();
                int var100 = (var99 >> 4 & 0x7) + Statics.field2979;
                int var101 = (var99 & 0x7) + Statics.field4441;
                int var102 = var1.method8277();
                int var103 = var1.method8274();
                int var104 = var1.method8274();
                byte var105 = var1.method8280();
                int var106 = var1.method8277() * 4;
                int var107 = var1.method8278() * 4;
                int var108 = var98 + var100;
                int var109 = var101 + var105;
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && var104 != 65535) {
                    int var110 = var100 * 128 + 64;
                    int var111 = var101 * 128 + 64;
                    int var112 = var108 * 128 + 64;
                    int var113 = var109 * 128 + 64;
                    class77 var114 = new class77(var104, Statics.field265, var110, var111, method5254(var110, var111, Statics.field265) - var107, field530 + var95, field530 + var103, var102, var97, var96, var106);
                    var114.method2046(var112, var113, method5254(var112, var113, Statics.field265) - var106, field530 + var95);
                    field524.method6367(var114);
                }
            } else if (class297.field3197 == arg0) {
                int var115 = var1.method8494();
                int var116 = var1.method8246();
                int var117 = var1.method8278();
                int var118 = (var117 >> 4 & 0x7) + Statics.field2979;
                int var119 = (var117 & 0x7) + Statics.field4441;
                if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                    class379 var120 = field653[Statics.field265][var118][var119];
                    if (var120 != null) {
                        for (class105 var121 = (class105) var120.method6393(); var121 != null; var121 = (class105) var120.method6374()) {
                            if ((var116 & 0x7FFF) == var121.field1346 && var121.field1350 == var115) {
                                var121.method7662();
                                break;
                            }
                        }
                        if (var120.method6393() == null) {
                            field653[Statics.field265][var118][var119] = null;
                        }
                        method6024(var118, var119);
                    }
                }
            } else if (class297.field3200 == arg0) {
                int var122 = var1.method8247();
                int var123 = (var122 >> 4 & 0x7) + Statics.field2979;
                int var124 = (var122 & 0x7) + Statics.field4441;
                int var125 = var1.method8244();
                int var126 = var125 >> 2;
                int var127 = var125 & 0x3;
                int var128 = field592[var126];
                if (var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104) {
                    method5049(Statics.field265, var123, var124, var128, -1, var126, var127, 31, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("kv.kf(IIIIIIIIIIB)V")
    public static final void method5049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class95 var10 = null;
        for (class95 var11 = (class95) field678.method6393(); var11 != null; var11 = (class95) field678.method6374()) {
            if (var11.field1179 == arg0 && var11.field1166 == arg1 && var11.field1167 == arg2 && var11.field1165 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class95();
            var10.field1179 = arg0;
            var10.field1165 = arg3;
            var10.field1166 = arg1;
            var10.field1167 = arg2;
            var10.field1173 = -1;
            method105(var10);
            field678.method6367(var10);
        }
        var10.field1174 = arg4;
        var10.field1171 = arg5;
        var10.field1172 = arg6;
        var10.field1176 = arg8;
        var10.field1177 = arg9;
        var10.method2269(arg7);
    }

    @ObfuscatedName("if.kg(IIIIII)Z")
    public static final boolean method4372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class95 var5 = null;
        for (class95 var6 = (class95) field678.method6393(); var6 != null; var6 = (class95) field678.method6374()) {
            if (var6.field1179 == arg0 && var6.field1166 == arg1 && var6.field1167 == arg2 && var6.field1165 == arg3) {
                var5 = var6;
                break;
            }
        }
        if (var5 == null) {
            return false;
        } else {
            var5.field1173 = arg4;
            return true;
        }
    }

    @ObfuscatedName("ca.ke(B)V")
    public static final void method1138() {
        for (class95 var0 = (class95) field678.method6393(); var0 != null; var0 = (class95) field678.method6374()) {
            if (var0.field1177 == -1) {
                var0.field1176 = 0;
                method105(var0);
            } else {
                var0.method7662();
            }
        }
    }

    @ObfuscatedName("at.km(Ldz;I)V")
    public static final void method105(class95 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1165 == 0) {
            var1 = Statics.field1458.method4217(arg0.field1179, arg0.field1166, arg0.field1167);
        }
        if (arg0.field1165 == 1) {
            var1 = Statics.field1458.method4218(arg0.field1179, arg0.field1166, arg0.field1167);
        }
        if (arg0.field1165 == 2) {
            var1 = Statics.field1458.method4360(arg0.field1179, arg0.field1166, arg0.field1167);
        }
        if (arg0.field1165 == 3) {
            var1 = Statics.field1458.method4220(arg0.field1179, arg0.field1166, arg0.field1167);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1458.method4221(arg0.field1179, arg0.field1166, arg0.field1167, var1);
            var3 = class242.method7614(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1168 = var3;
        arg0.field1170 = var4;
        arg0.field1169 = var5;
    }

    @ObfuscatedName("hv.kn(IIIIIIIII)V")
    public static final void method3251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field634 && Statics.field265 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field1458.method4217(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field1458.method4218(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field1458.method4360(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field1458.method4220(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field1458.method4221(arg0, arg2, arg3, var8);
            int var14 = class242.method7614(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1458.method4208(arg0, arg2, arg3);
                class207 var17 = Statics.method2211(var14);
                if (var17.field2152 != 0) {
                    field589[arg0].method3841(arg2, arg3, var15, var16, var17.field2135);
                }
            }
            if (arg1 == 1) {
                Statics.field1458.method4306(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1458.method4210(arg0, arg2, arg3);
                class207 var18 = Statics.method2211(var14);
                if (var18.field2170 + arg2 > 103 || var18.field2170 + arg3 > 103 || var18.field2174 + arg2 > 103 || var18.field2174 + arg3 > 103) {
                    return;
                }
                if (var18.field2152 != 0) {
                    field589[arg0].method3831(arg2, arg3, var18.field2170, var18.field2174, var16, var18.field2135);
                }
            }
            if (arg1 == 3) {
                Statics.field1458.method4211(arg0, arg2, arg3);
                class207 var19 = Statics.method2211(var14);
                if (var19.field2152 == 1) {
                    field589[arg0].method3833(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var20 = arg0;
        if (arg0 < 3 && (class82.field1030[1][arg2][arg3] & 0x2) == 2) {
            var20 = arg0 + 1;
        }
        class232 var21 = Statics.field1458;
        class215 var22 = field589[arg0];
        class207 var23 = Statics.method2211(arg4);
        int var24 = arg7 >= 0 ? arg7 : var23.field2160;
        int var25;
        int var26;
        if (arg5 == 1 || arg5 == 3) {
            var25 = var23.field2174;
            var26 = var23.field2170;
        } else {
            var25 = var23.field2170;
            var26 = var23.field2174;
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
        int[][] var31 = class82.field1023[var20];
        int var32 = var31[var27][var29] + var31[var28][var29] + var31[var27][var30] + var31[var28][var30] >> 2;
        int var33 = (arg2 << 7) + (var25 << 6);
        int var34 = (arg3 << 7) + (var26 << 6);
        long var35 = class242.method7370(arg2, arg3, 2, var23.field2154 == 0, arg4);
        int var37 = (arg5 << 6) + arg6;
        if (var23.field2175 == 1) {
            var37 += 256;
        }
        if (arg6 == 22) {
            class234 var38;
            if (var24 == -1 && var23.field2176 == null) {
                var38 = var23.method3585(22, arg5, var31, var33, var32, var34);
            } else {
                var38 = new class80(arg4, 22, arg5, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4197(arg0, arg2, arg3, var32, var38, var35, var37);
            if (var23.field2152 == 1) {
                var22.method3850(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class234 var64;
            if (var24 == -1 && var23.field2176 == null) {
                var64 = var23.method3585(10, arg5, var31, var33, var32, var34);
            } else {
                var64 = new class80(arg4, 10, arg5, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            if (var64 != null) {
                var21.method4201(arg0, arg2, arg3, var32, var25, var26, var64, arg6 == 11 ? 256 : 0, var35, var37);
            }
            if (var23.field2152 != 0) {
                var22.method3826(arg2, arg3, var25, var26, var23.field2135);
            }
        } else if (arg6 >= 12) {
            class234 var39;
            if (var24 == -1 && var23.field2176 == null) {
                var39 = var23.method3585(arg6, arg5, var31, var33, var32, var34);
            } else {
                var39 = new class80(arg4, arg6, arg5, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4201(arg0, arg2, arg3, var32, 1, 1, var39, 0, var35, var37);
            if (var23.field2152 != 0) {
                var22.method3826(arg2, arg3, var25, var26, var23.field2135);
            }
        } else if (arg6 == 0) {
            class234 var40;
            if (var24 == -1 && var23.field2176 == null) {
                var40 = var23.method3585(0, arg5, var31, var33, var32, var34);
            } else {
                var40 = new class80(arg4, 0, arg5, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4199(arg0, arg2, arg3, var32, var40, (class234) null, class82.field1028[arg5], 0, var35, var37);
            if (var23.field2152 != 0) {
                var22.method3830(arg2, arg3, arg6, arg5, var23.field2135);
            }
        } else if (arg6 == 1) {
            class234 var41;
            if (var24 == -1 && var23.field2176 == null) {
                var41 = var23.method3585(1, arg5, var31, var33, var32, var34);
            } else {
                var41 = new class80(arg4, 1, arg5, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4199(arg0, arg2, arg3, var32, var41, (class234) null, class82.field1029[arg5], 0, var35, var37);
            if (var23.field2152 != 0) {
                var22.method3830(arg2, arg3, arg6, arg5, var23.field2135);
            }
        } else if (arg6 == 2) {
            int var42 = arg5 + 1 & 0x3;
            class234 var43;
            class234 var44;
            if (var24 == -1 && var23.field2176 == null) {
                var43 = var23.method3585(2, arg5 + 4, var31, var33, var32, var34);
                var44 = var23.method3585(2, var42, var31, var33, var32, var34);
            } else {
                var43 = new class80(arg4, 2, arg5 + 4, var20, arg2, arg3, var24, var23.field2184, (class234) null);
                var44 = new class80(arg4, 2, var42, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4199(arg0, arg2, arg3, var32, var43, var44, class82.field1028[arg5], class82.field1028[var42], var35, var37);
            if (var23.field2152 != 0) {
                var22.method3830(arg2, arg3, arg6, arg5, var23.field2135);
            }
        } else if (arg6 == 3) {
            class234 var45;
            if (var24 == -1 && var23.field2176 == null) {
                var45 = var23.method3585(3, arg5, var31, var33, var32, var34);
            } else {
                var45 = new class80(arg4, 3, arg5, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4199(arg0, arg2, arg3, var32, var45, (class234) null, class82.field1029[arg5], 0, var35, var37);
            if (var23.field2152 != 0) {
                var22.method3830(arg2, arg3, arg6, arg5, var23.field2135);
            }
        } else if (arg6 == 9) {
            class234 var46;
            if (var24 == -1 && var23.field2176 == null) {
                var46 = var23.method3585(arg6, arg5, var31, var33, var32, var34);
            } else {
                var46 = new class80(arg4, arg6, arg5, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4201(arg0, arg2, arg3, var32, 1, 1, var46, 0, var35, var37);
            if (var23.field2152 != 0) {
                var22.method3826(arg2, arg3, var25, var26, var23.field2135);
            }
        } else if (arg6 == 4) {
            class234 var47;
            if (var24 == -1 && var23.field2176 == null) {
                var47 = var23.method3585(4, arg5, var31, var33, var32, var34);
            } else {
                var47 = new class80(arg4, 4, arg5, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4200(arg0, arg2, arg3, var32, var47, (class234) null, class82.field1028[arg5], 0, 0, 0, var35, var37);
        } else if (arg6 == 5) {
            int var48 = 16;
            long var49 = var21.method4217(arg0, arg2, arg3);
            if (var49 != 0L) {
                var48 = Statics.method2211(class242.method7614(var49)).field2159;
            }
            class234 var51;
            if (var24 == -1 && var23.field2176 == null) {
                var51 = var23.method3585(4, arg5, var31, var33, var32, var34);
            } else {
                var51 = new class80(arg4, 4, arg5, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4200(arg0, arg2, arg3, var32, var51, (class234) null, class82.field1028[arg5], 0, class82.field1038[arg5] * var48, class82.field1035[arg5] * var48, var35, var37);
        } else if (arg6 == 6) {
            int var52 = 8;
            long var53 = var21.method4217(arg0, arg2, arg3);
            if (var53 != 0L) {
                var52 = Statics.method2211(class242.method7614(var53)).field2159 / 2;
            }
            class234 var55;
            if (var24 == -1 && var23.field2176 == null) {
                var55 = var23.method3585(4, arg5 + 4, var31, var33, var32, var34);
            } else {
                var55 = new class80(arg4, 4, arg5 + 4, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4200(arg0, arg2, arg3, var32, var55, (class234) null, 256, arg5, class82.field1032[arg5] * var52, class82.field1033[arg5] * var52, var35, var37);
        } else if (arg6 == 7) {
            int var56 = arg5 + 2 & 0x3;
            class234 var57;
            if (var24 == -1 && var23.field2176 == null) {
                var57 = var23.method3585(4, var56 + 4, var31, var33, var32, var34);
            } else {
                var57 = new class80(arg4, 4, var56 + 4, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4200(arg0, arg2, arg3, var32, var57, (class234) null, 256, var56, 0, 0, var35, var37);
        } else if (arg6 == 8) {
            int var58 = 8;
            long var59 = var21.method4217(arg0, arg2, arg3);
            if (var59 != 0L) {
                var58 = Statics.method2211(class242.method7614(var59)).field2159 / 2;
            }
            int var61 = arg5 + 2 & 0x3;
            class234 var62;
            class234 var63;
            if (var24 == -1 && var23.field2176 == null) {
                var62 = var23.method3585(4, arg5 + 4, var31, var33, var32, var34);
                var63 = var23.method3585(4, var61 + 4, var31, var33, var32, var34);
            } else {
                var62 = new class80(arg4, 4, arg5 + 4, var20, arg2, arg3, var24, var23.field2184, (class234) null);
                var63 = new class80(arg4, 4, var61 + 4, var20, arg2, arg3, var24, var23.field2184, (class234) null);
            }
            var21.method4200(arg0, arg2, arg3, var32, var62, var63, 256, arg5, class82.field1032[arg5] * var58, class82.field1033[arg5] * var58, var35, var37);
        }
    }

    @ObfuscatedName("na.kk(III)V")
    public static final void method6024(int arg0, int arg1) {
        class379 var2 = field653[Statics.field265][arg0][arg1];
        if (var2 == null) {
            Statics.field1458.method4212(Statics.field265, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class105 var5 = null;
        for (class105 var6 = (class105) var2.method6393(); var6 != null; var6 = (class105) var2.method6374()) {
            class208 var7 = class208.method2788(var6.field1346);
            long var8 = (long) var7.field2206;
            if (var7.field2205 == 1) {
                var8 *= var6.field1350 < Integer.MAX_VALUE ? (long) (var6.field1350 + 1) : (long) var6.field1350;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1458.method4212(Statics.field265, arg0, arg1);
            return;
        }
        var2.method6368(var5);
        class105 var10 = null;
        class105 var11 = null;
        for (class105 var12 = (class105) var2.method6393(); var12 != null; var12 = (class105) var2.method6374()) {
            if (var5.field1346 != var12.field1346) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1346 != var12.field1346 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class242.method7370(arg0, arg1, 3, false, 0);
        Statics.field1458.method4198(Statics.field265, arg0, arg1, method5254(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field265), var5, var13, var10, var11);
    }

    @ObfuscatedName("nx.kw(ZLtc;I)V")
    public static final void method6111(boolean arg0, class513 arg1) {
        field646 = 0;
        field802 = 0;
        method1035(arg1);
        while (true) {
            byte var2 = 16;
            int var3 = 0x1 << var2;
            if (arg1.method8198(field521.field1410) < var2 + 12) {
                break;
            }
            int var4 = arg1.method8196(var2);
            if (var3 - 1 == var4) {
                break;
            }
            boolean var78 = false;
            if (field574[var4] == null) {
                field574[var4] = new class101();
                var78 = true;
            }
            class101 var79 = field574[var4];
            field576[++field650 - 1] = var4;
            var79.field1242 = field530;
            int var80 = arg1.method8196(1);
            if (var80 == 1) {
                field588[++field802 - 1] = var4;
            }
            int var81 = arg1.method8196(1);
            boolean var82 = arg1.method8196(1) == 1;
            if (var82) {
                arg1.method8196(32);
            }
            int var83;
            if (arg0) {
                var83 = arg1.method8196(8);
                if (var83 > 127) {
                    var83 -= 256;
                }
            } else {
                var83 = arg1.method8196(5);
                if (var83 > 15) {
                    var83 -= 32;
                }
            }
            int var84;
            if (arg0) {
                var84 = arg1.method8196(8);
                if (var84 > 127) {
                    var84 -= 256;
                }
            } else {
                var84 = arg1.method8196(5);
                if (var84 > 15) {
                    var84 -= 32;
                }
            }
            var79.field1313 = class196.method4032(arg1.method8196(14));
            int var85 = field705[arg1.method8196(3)];
            if (var78) {
                var79.field1250 = var79.field1185 = var85;
            }
            method1533(var79);
            if (var79.field1252 == 0) {
                var79.field1185 = 0;
            }
            var79.method2482(Statics.field1605.field1188[0] + var84, Statics.field1605.field1255[0] + var83, var81 == 1);
        }
        arg1.method8195();
        for (int var5 = 0; var5 < field802; var5++) {
            int var6 = field588[var5];
            class101 var7 = field574[var6];
            int var8 = arg1.method8244();
            if ((var8 & 0x20) != 0) {
                int var9 = arg1.method8244();
                var8 += var9 << 8;
            }
            if ((var8 & 0x400) != 0) {
                int var10 = arg1.method8244();
                var8 += var10 << 16;
            }
            if ((var8 & 0x8) != 0) {
                var7.field1218 = arg1.method8246();
                var7.field1218 += arg1.method8244() << 16;
                int var11 = 16777215;
                if (var7.field1218 == var11) {
                    var7.field1218 = -1;
                }
            }
            if ((var8 & 0x1) != 0) {
                var7.field1313 = class196.method4032(arg1.method8274());
                method1533(var7);
                var7.method2509();
            }
            if ((var8 & 0x4) != 0) {
                int var12 = arg1.method8245();
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = arg1.method8247();
                if (var7.field1211 == var12 && var12 != -1) {
                    int var14 = class210.method2904(var12).field2275;
                    if (var14 == 1) {
                        var7.field1229 = 0;
                        var7.field1230 = 0;
                        var7.field1231 = var13;
                        var7.field1200 = 0;
                    }
                    if (var14 == 2) {
                        var7.field1200 = 0;
                    }
                } else if (var12 == -1 || var7.field1211 == -1 || class210.method2904(var12).field2259 >= class210.method2904(var7.field1211).field2259) {
                    var7.field1211 = var12;
                    var7.field1229 = 0;
                    var7.field1230 = 0;
                    var7.field1231 = var13;
                    var7.field1200 = 0;
                    var7.field1258 = var7.field1253;
                }
            }
            if ((var8 & 0x40) != 0) {
                arg1.method8245();
                arg1.method8496();
            }
            if ((var8 & 0x200) != 0) {
                int var15 = arg1.method8247();
                if ((var15 & 0x1) == 1) {
                    var7.method2493();
                } else {
                    int[] var16 = null;
                    if ((var15 & 0x2) == 2) {
                        int var17 = arg1.method8278();
                        var16 = new int[var17];
                        for (int var18 = 0; var18 < var17; var18++) {
                            int var19 = arg1.method8246();
                            int var20 = var19 == 65535 ? -1 : var19;
                            var16[var18] = var20;
                        }
                    }
                    short[] var21 = null;
                    if ((var15 & 0x4) == 4) {
                        int var22 = 0;
                        if (var7.field1313.field2022 != null) {
                            var22 = var7.field1313.field2022.length;
                        }
                        var21 = new short[var22];
                        for (int var23 = 0; var23 < var22; var23++) {
                            var21[var23] = (short) arg1.method8246();
                        }
                    }
                    short[] var24 = null;
                    if ((var15 & 0x8) == 8) {
                        int var25 = 0;
                        if (var7.field1313.field2010 != null) {
                            var25 = var7.field1313.field2010.length;
                        }
                        var24 = new short[var25];
                        for (int var26 = 0; var26 < var25; var26++) {
                            var24[var26] = (short) arg1.method8274();
                        }
                    }
                    boolean var27 = false;
                    if ((var15 & 0x10) != 0) {
                        var27 = arg1.method8244() == 1;
                    }
                    long var28 = (long) (++class101.field1318 - 1);
                    var7.method2494(new class195(var28, var16, var21, var24, var27));
                }
            }
            if ((var8 & 0x100) != 0) {
                int var30 = arg1.method8247();
                if ((var30 & 0x1) == 1) {
                    var7.method2487();
                } else {
                    int[] var31 = null;
                    if ((var30 & 0x2) == 2) {
                        int var32 = arg1.method8277();
                        var31 = new int[var32];
                        for (int var33 = 0; var33 < var32; var33++) {
                            int var34 = arg1.method8246();
                            int var35 = var34 == 65535 ? -1 : var34;
                            var31[var33] = var35;
                        }
                    }
                    short[] var36 = null;
                    if ((var30 & 0x4) == 4) {
                        int var37 = 0;
                        if (var7.field1313.field2022 != null) {
                            var37 = var7.field1313.field2022.length;
                        }
                        var36 = new short[var37];
                        for (int var38 = 0; var38 < var37; var38++) {
                            var36[var38] = (short) arg1.method8245();
                        }
                    }
                    short[] var39 = null;
                    if ((var30 & 0x8) == 8) {
                        int var40 = 0;
                        if (var7.field1313.field2010 != null) {
                            var40 = var7.field1313.field2010.length;
                        }
                        var39 = new short[var40];
                        for (int var41 = 0; var41 < var40; var41++) {
                            var39[var41] = (short) arg1.method8245();
                        }
                    }
                    boolean var42 = false;
                    if ((var30 & 0x10) != 0) {
                        var42 = arg1.method8278() == 1;
                    }
                    long var43 = (long) (++class101.field1316 - 1);
                    var7.method2492(new class195(var43, var31, var36, var39, var42));
                }
            }
            if ((var8 & 0x40000) != 0) {
                int var45 = arg1.method8358();
                var7.field1238 = (var45 & 0x1) == 0 ? var7.field1313.field2004 : arg1.method8245();
                var7.field1191 = (var45 & 0x2) == 0 ? var7.field1313.field2008 : arg1.method8246();
                var7.field1236 = (var45 & 0x4) == 0 ? var7.field1313.field2037 : arg1.method8246();
                var7.field1247 = (var45 & 0x8) == 0 ? var7.field1313.field2015 : arg1.method8245();
                var7.field1244 = (var45 & 0x10) == 0 ? var7.field1313.field2011 : arg1.method8288();
                var7.field1227 = (var45 & 0x20) == 0 ? var7.field1313.field2012 : arg1.method8274();
                var7.field1196 = (var45 & 0x40) == 0 ? var7.field1313.field1997 : arg1.method8274();
                var7.field1195 = (var45 & 0x80) == 0 ? var7.field1313.field2014 : arg1.method8246();
                var7.field1198 = (var45 & 0x100) == 0 ? var7.field1313.field1999 : arg1.method8288();
                var7.field1199 = (var45 & 0x200) == 0 ? var7.field1313.field2016 : arg1.method8288();
                var7.field1212 = (var45 & 0x400) == 0 ? var7.field1313.field2017 : arg1.method8245();
                var7.field1201 = (var45 & 0x800) == 0 ? var7.field1313.field2018 : arg1.method8245();
                var7.field1202 = (var45 & 0x1000) == 0 ? var7.field1313.field2019 : arg1.method8288();
                var7.field1203 = (var45 & 0x2000) == 0 ? var7.field1313.field2025 : arg1.method8274();
                var7.field1232 = (var45 & 0x4000) == 0 ? var7.field1313.field2006 : arg1.method8245();
            }
            if ((var8 & 0x20000) != 0) {
                int var46 = arg1.method8278();
                for (int var47 = 0; var47 < var46; var47++) {
                    int var48 = arg1.method8278();
                    int var49 = arg1.method8246();
                    int var50 = arg1.method8358();
                    var7.method2288(var48, var49, var50 >> 16, var50 & 0xFFFF);
                }
            }
            if ((var8 & 0x8000) != 0) {
                var7.field1235 = arg1.method8282();
                var7.field1237 = arg1.method8280();
                var7.field1197 = arg1.method8264();
                var7.field1225 = arg1.method8264();
                var7.field1207 = arg1.method8246() + field530;
                var7.field1240 = arg1.method8245() + field530;
                var7.field1233 = arg1.method8274();
                var7.field1253 = 1;
                var7.field1258 = 0;
                var7.field1235 += var7.field1188[0];
                var7.field1237 += var7.field1255[0];
                var7.field1197 += var7.field1188[0];
                var7.field1225 += var7.field1255[0];
            }
            if ((var8 & 0x2) != 0) {
                int var51 = arg1.method8288();
                int var52 = arg1.method8288();
                var7.field1223 = arg1.method8244() == 1;
                if (field526 >= 212) {
                    var7.field1221 = var51;
                    var7.field1222 = var52;
                } else {
                    int var53 = var7.field1192 - (var51 - Statics.field4295 - Statics.field4295) * 64;
                    int var54 = var7.field1206 - (var52 - Statics.field1676 - Statics.field1676) * 64;
                    if (var53 != 0 || var54 != 0) {
                        int var56 = (int) (Math.atan2((double) var53, (double) var54) * 325.94932345220167D) & 0x7FF;
                        var7.field1220 = var56;
                    }
                }
            }
            if ((var8 & 0x1000) != 0) {
                var7.field1184 = field530 + arg1.method8245();
                var7.field1245 = field530 + arg1.method8246();
                var7.field1246 = arg1.method8280();
                var7.field1239 = arg1.method8264();
                var7.field1248 = arg1.method8281();
                var7.field1249 = (byte) arg1.method8244();
            }
            if ((var8 & 0x10) != 0) {
                int var57 = arg1.method8244();
                if (var57 > 0) {
                    for (int var58 = 0; var58 < var57; var58++) {
                        int var59 = -1;
                        int var60 = -1;
                        int var61 = -1;
                        int var62 = arg1.method8260();
                        if (var62 == 32767) {
                            var62 = arg1.method8260();
                            var60 = arg1.method8260();
                            var59 = arg1.method8260();
                            var61 = arg1.method8260();
                        } else if (var62 == 32766) {
                            var62 = -1;
                        } else {
                            var60 = arg1.method8260();
                        }
                        int var63 = arg1.method8260();
                        var7.method2277(var62, var60, var59, var61, field530, var63);
                    }
                }
                int var64 = arg1.method8244();
                if (var64 > 0) {
                    for (int var65 = 0; var65 < var64; var65++) {
                        int var66 = arg1.method8260();
                        int var67 = arg1.method8260();
                        if (var67 == 32767) {
                            var7.method2279(var66);
                        } else {
                            int var68 = arg1.method8260();
                            int var69 = arg1.method8247();
                            int var70 = var67 > 0 ? arg1.method8247() : var69;
                            var7.method2278(var66, field530, var67, var68, var69, var70);
                        }
                    }
                }
            }
            if ((var8 & 0x2000) != 0) {
                var7.method2490(arg1.method8278());
            }
            if ((var8 & 0x4000) != 0) {
                var7.field1259 = arg1.method8494();
            }
            if ((var8 & 0x10000) != 0) {
                int var71 = arg1.method8277();
                int[] var72 = new int[8];
                short[] var73 = new short[8];
                for (int var74 = 0; var74 < 8; var74++) {
                    if ((var71 & 0x1 << var74) == 0) {
                        var72[var74] = -1;
                        var73[var74] = -1;
                    } else {
                        var72[var74] = arg1.method8310();
                        var73[var74] = (short) arg1.method8419();
                    }
                }
                var7.method2483(var72, var73);
            }
            if ((var8 & 0x800) != 0) {
                var7.method2477(arg1.method8369());
            }
            if ((var8 & 0x80) != 0) {
                var7.field1214 = arg1.method8369();
                var7.field1183 = 100;
            }
        }
        for (int var75 = 0; var75 < field646; var75++) {
            int var76 = field602[var75];
            if (field530 != field574[var76].field1242) {
                field574[var76].field1313 = null;
                field574[var76] = null;
            }
        }
        if (field521.field1410 != arg1.field5072) {
            throw new RuntimeException(arg1.field5072 + class102.field1324 + field521.field1410);
        }
        for (int var77 = 0; var77 < field650; var77++) {
            if (field574[field576[var77]] == null) {
                throw new RuntimeException(var77 + class102.field1324 + field650);
            }
        }
    }

    @ObfuscatedName("cf.ka(Ltc;B)V")
    public static final void method1035(class513 arg0) {
        arg0.method8189();
        int var1 = arg0.method8196(8);
        if (var1 < field650) {
            for (int var2 = var1; var2 < field650; var2++) {
                field602[++field646 - 1] = field576[var2];
            }
        }
        if (var1 > field650) {
            throw new RuntimeException("");
        }
        field650 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field576[var3];
            class101 var5 = field574[var4];
            int var6 = arg0.method8196(1);
            if (var6 == 0) {
                field576[++field650 - 1] = var4;
                var5.field1242 = field530;
            } else {
                int var7 = arg0.method8196(2);
                if (var7 == 0) {
                    field576[++field650 - 1] = var4;
                    var5.field1242 = field530;
                    field588[++field802 - 1] = var4;
                } else if (var7 == 1) {
                    field576[++field650 - 1] = var4;
                    var5.field1242 = field530;
                    int var8 = arg0.method8196(3);
                    var5.method2481(var8, class219.field2385);
                    int var9 = arg0.method8196(1);
                    if (var9 == 1) {
                        field588[++field802 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field576[++field650 - 1] = var4;
                    var5.field1242 = field530;
                    if (arg0.method8196(1) == 1) {
                        int var10 = arg0.method8196(3);
                        var5.method2481(var10, class219.field2378);
                        int var11 = arg0.method8196(3);
                        var5.method2481(var11, class219.field2378);
                    } else {
                        int var12 = arg0.method8196(3);
                        var5.method2481(var12, class219.field2379);
                    }
                    int var13 = arg0.method8196(1);
                    if (var13 == 1) {
                        field588[++field802 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field602[++field646 - 1] = var4;
                }
            }
        }
    }

    @ObfuscatedName("client.kx(Ldh;B)V")
    public static void method1533(class101 arg0) {
        arg0.field1224 = arg0.field1313.field2003;
        arg0.field1252 = arg0.field1313.field2033;
        arg0.field1236 = arg0.field1313.field2037;
        arg0.field1247 = arg0.field1313.field2015;
        arg0.field1244 = arg0.field1313.field2011;
        arg0.field1227 = arg0.field1313.field2012;
        arg0.field1232 = arg0.field1313.field2006;
        arg0.field1238 = arg0.field1313.field2004;
        arg0.field1191 = arg0.field1313.field2008;
        arg0.field1196 = arg0.field1313.field1997;
        arg0.field1195 = arg0.field1313.field2014;
        arg0.field1198 = arg0.field1313.field1999;
        arg0.field1199 = arg0.field1313.field2016;
        arg0.field1212 = arg0.field1313.field2017;
        arg0.field1201 = arg0.field1313.field2018;
        arg0.field1202 = arg0.field1313.field2019;
        arg0.field1203 = arg0.field1313.field2025;
    }

    @ObfuscatedName("cr.ku(Ldf;IILio;B)V")
    public static final void method1769(class92 arg0, int arg1, int arg2, class219 arg3) {
        int var4 = arg0.field1188[0];
        int var5 = arg0.field1255[0];
        int var6 = arg0.method2223();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = arg0.method2223();
        field816.field2366 = arg1;
        field816.field2364 = arg2;
        field816.field2365 = 1;
        field816.field2363 = 1;
        class66 var8 = field816;
        class215 var10 = field589[arg0.field1134];
        int[] var11 = field796;
        int[] var12 = field738;
        int var13 = class220.method5028(var4, var5, var7, var8, var10, true, var11, var12, Statics.field2389[0]);
        int var14 = var13;
        if (var13 >= 1) {
            for (int var15 = 0; var15 < var14 - 1; var15++) {
                arg0.method2227(field796[var15], field738[var15], arg3);
            }
        }
    }

    @ObfuscatedName("dd.kq(I)V")
    public static void method2204() {
        field679 = 0;
        field661 = false;
        field668[0] = class353.field4055;
        field669[0] = "";
        field665[0] = 1006;
        field670[0] = false;
        field679 = 1;
    }

    @ObfuscatedName("ml.ky(III)V")
    public static final void method6003(int arg0, int arg1) {
        if (field679 < 2 && field579 == 0 && !field742 || !field702) {
            return;
        }
        int var2 = method1108();
        String var3;
        if (field579 == 1 && field679 < 2) {
            var3 = class353.field4155 + class353.field4072 + field558 + " " + class102.field1323;
        } else if (field742 && field679 < 2) {
            var3 = field637 + class353.field4072 + field735 + " " + class102.field1323;
        } else {
            String var4;
            if (var2 < 0) {
                var4 = "";
            } else if (field669[var2].length() > 0) {
                var4 = field668[var2] + class353.field4072 + field669[var2];
            } else {
                var4 = field668[var2];
            }
            var3 = var4;
        }
        if (field679 > 2) {
            var3 = var3 + class102.method5443(16777215) + " " + '/' + " " + (field679 - 2) + class353.field3904;
        }
        Statics.field3792.method6823(var3, arg0 + 4, arg1 + 15, 16777215, 0, field530 / 1000);
    }

    @ObfuscatedName("dw.kv(B)Z")
    public static final boolean method2543() {
        return field661;
    }

    @ObfuscatedName("ik.kp(IIIII)V")
    public static final void method4185(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field733; var4++) {
            if (field740[var4] + field666[var4] > arg0 && field666[var4] < arg0 + arg2 && field741[var4] + field739[var4] > arg1 && field739[var4] < arg1 + arg3) {
                field719[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.kz(I)V")
    public final void method1452() {
        method2963();
        if (field597 != null) {
            return;
        }
        int var1 = class36.field252;
        if (!field661) {
            int var12 = method1108();
            if ((var1 == 1 || !Statics.field170 && var1 == 4) && this.method1215()) {
                var1 = 2;
            }
            if ((var1 == 1 || !Statics.field170 && var1 == 4) && field679 > 0) {
                method831(var12);
            }
            if (var1 == 2 && field679 > 0) {
                this.method1216(class36.field253, class36.field254);
            }
            return;
        }
        if (var1 != 1 && (Statics.field170 || var1 != 4)) {
            int var2 = class36.field245;
            int var3 = class36.field246;
            if (var2 < Statics.field126 - 10 || var2 > Statics.field1460 + Statics.field126 + 10 || var3 < Statics.field1482 - 10 || var3 > Statics.field4407 + Statics.field1482 + 10) {
                field661 = false;
                method4185(Statics.field126, Statics.field1482, Statics.field1460, Statics.field4407);
            }
        }
        if (var1 != 1 && Statics.field170 || var1 != 4) {
            return;
        }
        int var4 = Statics.field126;
        int var5 = Statics.field1482;
        int var6 = Statics.field1460;
        int var7 = class36.field253;
        int var8 = class36.field254;
        int var9 = -1;
        for (int var10 = 0; var10 < field679; var10++) {
            int var11 = (field679 - 1 - var10) * 15 + var5 + 31;
            if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            method831(var9);
        }
        field661 = false;
        method4185(Statics.field126, Statics.field1482, Statics.field1460, Statics.field4407);
    }

    @ObfuscatedName("client.ko(I)Z")
    public final boolean method1215() {
        int var1 = method1108();
        return (field660 && field679 > 2 || method2829(var1)) && !field670[var1];
    }

    @ObfuscatedName("client.ki(IIB)V")
    public final void method1216(int arg0, int arg1) {
        method3065(arg0, arg1);
        int var3 = arg0 - field790;
        int var4 = arg1 - field626;
        Statics.field1458.method4315(Statics.field265, var3, var4, false);
        field661 = true;
    }

    @ObfuscatedName("fx.kl(III)V")
    public static void method3065(int arg0, int arg1) {
        int var2 = Statics.field3792.method6864(class353.field4065);
        for (int var3 = 0; var3 < field679; var3++) {
            class395 var4 = Statics.field3792;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field669[var3].length() > 0) {
                var5 = field668[var3] + class353.field4072 + field669[var3];
            } else {
                var5 = field668[var3];
            }
            int var6 = var4.method6864(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field679 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field4328) {
            var8 = Statics.field4328 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field4883) {
            var9 = Statics.field4883 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field126 = var8;
        Statics.field1482 = var9;
        Statics.field1460 = var2;
        Statics.field4407 = field679 * 15 + 22;
    }

    @ObfuscatedName("ek.ks(II)Z")
    public static final boolean method2829(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field665[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bh.kj(IB)V")
    public static final void method831(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field663[arg0];
        int var2 = field664[arg0];
        int var3 = field665[arg0];
        int var4 = field789[arg0];
        int var5 = field667[arg0];
        String var6 = field668[arg0];
        String var7 = field669[arg0];
        method1123(var1, var2, var3, var4, var5, var6, var7, class36.field253, class36.field254);
    }

    @ObfuscatedName("ce.kc(IIIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1003) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            class101 var9 = field574[arg3];
            if (var9 != null) {
                class196 var10 = var9.field1313;
                if (var10.field2020 != null) {
                    var10 = var10.method3412();
                }
                if (var10 != null) {
                    class298 var11 = class298.method8119(class296.field3121, field521.field1414);
                    var11.field3205.method8284(var10.field2001);
                    field521.method2669(var11);
                }
            }
        }
        if (arg2 == 7) {
            class101 var12 = field574[arg3];
            if (var12 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var13 = class298.method8119(class296.field3160, field521.field1414);
                var13.field3205.method8284(Statics.field3360);
                var13.field3205.method8430(Statics.field1040);
                var13.field3205.method8297(Statics.field3797);
                var13.field3205.method8284(arg3);
                var13.field3205.method8227(field751.method3796(82) ? 1 : 0);
                field521.method2669(var13);
            }
        }
        if (arg2 == 49) {
            class92 var14 = field612[arg3];
            if (var14 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var15 = class298.method8119(class296.field3141, field521.field1414);
                var15.field3205.method8430(arg3);
                var15.field3205.method8276(field751.method3796(82) ? 1 : 0);
                field521.method2669(var15);
            }
        }
        if (arg2 == 9) {
            class101 var16 = field574[arg3];
            if (var16 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var17 = class298.method8119(class296.field3127, field521.field1414);
                var17.field3205.method8227(field751.method3796(82) ? 1 : 0);
                var17.field3205.method8430(arg3);
                field521.method2669(var17);
            }
        }
        if (arg2 == 45) {
            class92 var18 = field612[arg3];
            if (var18 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var19 = class298.method8119(class296.field3153, field521.field1414);
                var19.field3205.method8430(arg3);
                var19.field3205.method8402(field751.method3796(82) ? 1 : 0);
                field521.method2669(var19);
            }
        }
        if (arg2 == 51) {
            class92 var20 = field612[arg3];
            if (var20 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var21 = class298.method8119(class296.field3117, field521.field1414);
                var21.field3205.method8430(arg3);
                var21.field3205.method8276(field751.method3796(82) ? 1 : 0);
                field521.method2669(var21);
            }
        }
        if (arg2 == 1002) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            class298 var22 = class298.method8119(class296.field3167, field521.field1414);
            var22.field3205.method8228(arg3);
            field521.method2669(var22);
        }
        if (arg2 == 48) {
            class92 var23 = field612[arg3];
            if (var23 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var24 = class298.method8119(class296.field3157, field521.field1414);
                var24.field3205.method8284(arg3);
                var24.field3205.method8402(field751.method3796(82) ? 1 : 0);
                field521.method2669(var24);
            }
        }
        if (arg2 == 1001) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var25 = class298.method8119(class296.field3126, field521.field1414);
            var25.field3205.method8227(field751.method3796(82) ? 1 : 0);
            var25.field3205.method8430(arg3);
            var25.field3205.method8430(Statics.field1676 + arg1);
            var25.field3205.method8430(Statics.field4295 + arg0);
            field521.method2669(var25);
        }
        if (arg2 == 12) {
            class101 var26 = field574[arg3];
            if (var26 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var27 = class298.method8119(class296.field3176, field521.field1414);
                var27.field3205.method8301(arg3);
                var27.field3205.method8227(field751.method3796(82) ? 1 : 0);
                field521.method2669(var27);
            }
        }
        if (arg2 == 58) {
            class333 var28 = class333.method2199(arg1, arg0);
            if (var28 != null) {
                if (var28.field3629 != null) {
                    class88 var29 = new class88();
                    var29.field1072 = var28;
                    var29.field1077 = arg3;
                    var29.field1079 = arg6;
                    var29.field1076 = var28.field3629;
                    class71.method1189(var29);
                }
                class298 var30 = class298.method8119(class296.field3111, field521.field1414);
                var30.field3205.method8284(field682);
                var30.field3205.method8301(arg0);
                var30.field3205.method8284(field681);
                var30.field3205.method8430(arg4);
                var30.field3205.method8296(Statics.field194);
                var30.field3205.method8296(arg1);
                field521.method2669(var30);
            }
        }
        if (arg2 == 8) {
            class101 var31 = field574[arg3];
            if (var31 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var32 = class298.method8119(class296.field3104, field521.field1414);
                var32.field3205.method8297(Statics.field194);
                var32.field3205.method8301(field681);
                var32.field3205.method8301(field682);
                var32.field3205.method8301(arg3);
                var32.field3205.method8227(field751.method3796(82) ? 1 : 0);
                field521.method2669(var32);
            }
        }
        if (arg2 == 1) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var33 = class298.method8119(class296.field3135, field521.field1414);
            var33.field3205.method8301(arg3);
            var33.field3205.method8301(Statics.field1040);
            var33.field3205.method8301(Statics.field3360);
            var33.field3205.method8301(Statics.field4295 + arg0);
            var33.field3205.method8346(field751.method3796(82) ? 1 : 0);
            var33.field3205.method8230(Statics.field3797);
            var33.field3205.method8301(Statics.field1676 + arg1);
            field521.method2669(var33);
        }
        if (arg2 == 47) {
            class92 var34 = field612[arg3];
            if (var34 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var35 = class298.method8119(class296.field3151, field521.field1414);
                var35.field3205.method8284(arg3);
                var35.field3205.method8227(field751.method3796(82) ? 1 : 0);
                field521.method2669(var35);
            }
        }
        if (arg2 == 44) {
            class92 var36 = field612[arg3];
            if (var36 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var37 = class298.method8119(class296.field3175, field521.field1414);
                var37.field3205.method8430(arg3);
                var37.field3205.method8276(field751.method3796(82) ? 1 : 0);
                field521.method2669(var37);
            }
        }
        if (arg2 == 11) {
            class101 var38 = field574[arg3];
            if (var38 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var39 = class298.method8119(class296.field3163, field521.field1414);
                var39.field3205.method8228(arg3);
                var39.field3205.method8346(field751.method3796(82) ? 1 : 0);
                field521.method2669(var39);
            }
        }
        if (arg2 == 29) {
            class298 var40 = class298.method8119(class296.field3192, field521.field1414);
            var40.field3205.method8230(arg1);
            field521.method2669(var40);
            class333 var41 = class333.method3491(arg1);
            if (var41 != null && var41.field3745 != null && var41.field3745[0][0] == 5) {
                int var42 = var41.field3745[0][1];
                if (class323.field3532[var42] != var41.field3622[0]) {
                    class323.field3532[var42] = var41.field3622[0];
                    method1992(var42);
                }
            }
        }
        if (arg2 == 22) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var43 = class298.method8119(class296.field3096, field521.field1414);
            var43.field3205.method8284(Statics.field4295 + arg0);
            var43.field3205.method8346(field751.method3796(82) ? 1 : 0);
            var43.field3205.method8284(arg3);
            var43.field3205.method8284(Statics.field1676 + arg1);
            field521.method2669(var43);
        }
        if (arg2 == 50) {
            class92 var44 = field612[arg3];
            if (var44 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var45 = class298.method8119(class296.field3190, field521.field1414);
                var45.field3205.method8228(arg3);
                var45.field3205.method8402(field751.method3796(82) ? 1 : 0);
                field521.method2669(var45);
            }
        }
        if (arg2 == 14) {
            class92 var46 = field612[arg3];
            if (var46 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var47 = class298.method8119(class296.field3180, field521.field1414);
                var47.field3205.method8430(Statics.field1040);
                var47.field3205.method8430(Statics.field3360);
                var47.field3205.method8295(Statics.field3797);
                var47.field3205.method8228(arg3);
                var47.field3205.method8227(field751.method3796(82) ? 1 : 0);
                field521.method2669(var47);
            }
        }
        if (arg2 == 26) {
            method6602();
        }
        if (arg2 == 23) {
            if (field661) {
                Statics.field1458.method4231();
            } else {
                Statics.field1458.method4315(Statics.field265, arg0, arg1, true);
            }
        }
        if (arg2 == 16) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var48 = class298.method8119(class296.field3131, field521.field1414);
            var48.field3205.method8301(Statics.field3360);
            var48.field3205.method8301(Statics.field1040);
            var48.field3205.method8301(arg3);
            var48.field3205.method8301(Statics.field1676 + arg1);
            var48.field3205.method8430(Statics.field4295 + arg0);
            var48.field3205.method8346(field751.method3796(82) ? 1 : 0);
            var48.field3205.method8296(Statics.field3797);
            field521.method2669(var48);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class333 var49 = class333.method2199(arg1, arg0);
            if (var49 != null) {
                method7371(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 25) {
            class333 var50 = class333.method2199(arg1, arg0);
            if (var50 != null) {
                method847();
                method6047(arg1, arg0, class334.method5039(method2735(var50)), arg4);
                field579 = 0;
                field637 = method167(var50);
                if (field637 == null) {
                    field637 = class353.field3906;
                }
                if (var50.field3623) {
                    field735 = var50.field3704 + class102.method5443(16777215);
                } else {
                    field735 = class102.method5443(65280) + var50.field3753 + class102.method5443(16777215);
                }
            }
            return;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1500.method7784(arg2, arg3, new class324(arg0), new class324(arg1));
        }
        if (arg2 == 46) {
            class92 var51 = field612[arg3];
            if (var51 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var52 = class298.method8119(class296.field3136, field521.field1414);
                var52.field3205.method8227(field751.method3796(82) ? 1 : 0);
                var52.field3205.method8228(arg3);
                field521.method2669(var52);
            }
        }
        if (arg2 == 15) {
            class92 var53 = field612[arg3];
            if (var53 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var54 = class298.method8119(class296.field3186, field521.field1414);
                var54.field3205.method8284(arg3);
                var54.field3205.method8296(Statics.field194);
                var54.field3205.method8227(field751.method3796(82) ? 1 : 0);
                var54.field3205.method8228(field682);
                var54.field3205.method8301(field681);
                field521.method2669(var54);
            }
        }
        if (arg2 == 6) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var55 = class298.method8119(class296.field3155, field521.field1414);
            var55.field3205.method8430(Statics.field1676 + arg1);
            var55.field3205.method8301(Statics.field4295 + arg0);
            var55.field3205.method8228(arg3);
            var55.field3205.method8346(field751.method3796(82) ? 1 : 0);
            field521.method2669(var55);
        }
        if (arg2 == 20) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var56 = class298.method8119(class296.field3168, field521.field1414);
            var56.field3205.method8284(Statics.field4295 + arg0);
            var56.field3205.method8284(arg3);
            var56.field3205.method8301(Statics.field1676 + arg1);
            var56.field3205.method8402(field751.method3796(82) ? 1 : 0);
            field521.method2669(var56);
        }
        if (arg2 == 17) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var57 = class298.method8119(class296.field3159, field521.field1414);
            var57.field3205.method8301(Statics.field1676 + arg1);
            var57.field3205.method8284(field681);
            var57.field3205.method8284(arg3);
            var57.field3205.method8295(Statics.field194);
            var57.field3205.method8284(field682);
            var57.field3205.method8402(field751.method3796(82) ? 1 : 0);
            var57.field3205.method8228(Statics.field4295 + arg0);
            field521.method2669(var57);
        }
        if (arg2 == 19) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var58 = class298.method8119(class296.field3154, field521.field1414);
            var58.field3205.method8301(Statics.field4295 + arg0);
            var58.field3205.method8402(field751.method3796(82) ? 1 : 0);
            var58.field3205.method8301(arg3);
            var58.field3205.method8430(Statics.field1676 + arg1);
            field521.method2669(var58);
        }
        if (arg2 == 10) {
            class101 var59 = field574[arg3];
            if (var59 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var60 = class298.method8119(class296.field3172, field521.field1414);
                var60.field3205.method8227(field751.method3796(82) ? 1 : 0);
                var60.field3205.method8301(arg3);
                field521.method2669(var60);
            }
        }
        if (arg2 == 2) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var61 = class298.method8119(class296.field3185, field521.field1414);
            var61.field3205.method8402(field751.method3796(82) ? 1 : 0);
            var61.field3205.method8228(field682);
            var61.field3205.method8228(arg3);
            var61.field3205.method8228(Statics.field1676 + arg1);
            var61.field3205.method8284(Statics.field4295 + arg0);
            var61.field3205.method8301(field681);
            var61.field3205.method8297(Statics.field194);
            field521.method2669(var61);
        }
        if (arg2 == 3) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var62 = class298.method8119(class296.field3133, field521.field1414);
            var62.field3205.method8301(Statics.field1676 + arg1);
            var62.field3205.method8301(Statics.field4295 + arg0);
            var62.field3205.method8276(field751.method3796(82) ? 1 : 0);
            var62.field3205.method8228(arg3);
            field521.method2669(var62);
        }
        if (arg2 == 24) {
            class333 var63 = class333.method3491(arg1);
            if (var63 != null) {
                boolean var64 = true;
                if (var63.field3649 > 0) {
                    var64 = method7656(var63);
                }
                if (var64) {
                    class298 var65 = class298.method8119(class296.field3192, field521.field1414);
                    var65.field3205.method8230(arg1);
                    field521.method2669(var65);
                }
            }
        }
        if (arg2 == 5) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var66 = class298.method8119(class296.field3147, field521.field1414);
            var66.field3205.method8284(Statics.field4295 + arg0);
            var66.field3205.method8276(field751.method3796(82) ? 1 : 0);
            var66.field3205.method8284(Statics.field1676 + arg1);
            var66.field3205.method8430(arg3);
            field521.method2669(var66);
        }
        if (arg2 == 21) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var67 = class298.method8119(class296.field3149, field521.field1414);
            var67.field3205.method8276(field751.method3796(82) ? 1 : 0);
            var67.field3205.method8301(arg3);
            var67.field3205.method8430(Statics.field1676 + arg1);
            var67.field3205.method8430(Statics.field4295 + arg0);
            field521.method2669(var67);
        }
        if (arg2 == 18) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var68 = class298.method8119(class296.field3103, field521.field1414);
            var68.field3205.method8276(field751.method3796(82) ? 1 : 0);
            var68.field3205.method8430(Statics.field1676 + arg1);
            var68.field3205.method8430(arg3);
            var68.field3205.method8430(Statics.field4295 + arg0);
            field521.method2669(var68);
        }
        if (arg2 == 30 && field690 == null) {
            method4795(arg1, arg0);
            field690 = class333.method2199(arg1, arg0);
            method3478(field690);
        }
        if (arg2 == 1004) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            class298 var69 = class298.method8119(class296.field3108, field521.field1414);
            var69.field3205.method8301(Statics.field4295 + arg0);
            var69.field3205.method8284(arg3);
            var69.field3205.method8430(Statics.field1676 + arg1);
            field521.method2669(var69);
        }
        if (arg2 == 4) {
            field633 = arg7;
            field527 = arg8;
            field636 = 2;
            field766 = 0;
            field598 = arg0;
            field765 = arg1;
            class298 var70 = class298.method8119(class296.field3105, field521.field1414);
            var70.field3205.method8301(Statics.field1676 + arg1);
            var70.field3205.method8430(arg3);
            var70.field3205.method8227(field751.method3796(82) ? 1 : 0);
            var70.field3205.method8284(Statics.field4295 + arg0);
            field521.method2669(var70);
        }
        if (arg2 == 28) {
            class298 var71 = class298.method8119(class296.field3192, field521.field1414);
            var71.field3205.method8230(arg1);
            field521.method2669(var71);
            class333 var72 = class333.method3491(arg1);
            if (var72 != null && var72.field3745 != null && var72.field3745[0][0] == 5) {
                int var73 = var72.field3745[0][1];
                class323.field3532[var73] = 1 - class323.field3532[var73];
                method1992(var73);
            }
        }
        if (arg2 == 13) {
            class101 var74 = field574[arg3];
            if (var74 != null) {
                field633 = arg7;
                field527 = arg8;
                field636 = 2;
                field766 = 0;
                field598 = arg0;
                field765 = arg1;
                class298 var75 = class298.method8119(class296.field3165, field521.field1414);
                var75.field3205.method8276(field751.method3796(82) ? 1 : 0);
                var75.field3205.method8228(arg3);
                field521.method2669(var75);
            }
        }
        if (field579 != 0) {
            field579 = 0;
            method3478(class333.method3491(Statics.field3797));
        }
        if (field742) {
            method847();
        }
    }

    @ObfuscatedName("bn.kb(ILjava/lang/String;B)V")
    public static void method421(int arg0, String arg1) {
        int var2 = class108.field1366;
        int[] var3 = class108.field1370;
        boolean var4 = false;
        class538 var5 = new class538(arg1, Statics.field4771);
        for (int var6 = 0; var6 < var2; var6++) {
            class92 var7 = field612[var3[var6]];
            if (var7 != null && Statics.field1605 != var7 && var7.field1115 != null && var7.field1115.equals(var5)) {
                if (arg0 == 1) {
                    class298 var8 = class298.method8119(class296.field3175, field521.field1414);
                    var8.field3205.method8430(var3[var6]);
                    var8.field3205.method8276(0);
                    field521.method2669(var8);
                } else if (arg0 == 4) {
                    class298 var9 = class298.method8119(class296.field3151, field521.field1414);
                    var9.field3205.method8284(var3[var6]);
                    var9.field3205.method8227(0);
                    field521.method2669(var9);
                } else if (arg0 == 6) {
                    class298 var10 = class298.method8119(class296.field3141, field521.field1414);
                    var10.field3205.method8430(var3[var6]);
                    var10.field3205.method8276(0);
                    field521.method2669(var10);
                } else if (arg0 == 7) {
                    class298 var11 = class298.method8119(class296.field3190, field521.field1414);
                    var11.field3205.method8228(var3[var6]);
                    var11.field3205.method8402(0);
                    field521.method2669(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class111.method7045(4, "", class353.field4123 + arg1);
        }
    }

    @ObfuscatedName("nn.kh(IIIII)V")
    public static void method6047(int arg0, int arg1, int arg2, int arg3) {
        class333 var4 = class333.method2199(arg0, arg1);
        if (var4 != null && var4.field3734 != null) {
            class88 var5 = new class88();
            var5.field1072 = var4;
            var5.field1076 = var4.field3734;
            class71.method1189(var5);
        }
        field682 = arg3;
        field742 = true;
        Statics.field194 = arg0;
        field681 = arg1;
        Statics.field312 = arg2;
        method3478(var4);
    }

    @ObfuscatedName("bh.lj(B)V")
    public static void method847() {
        if (!field742) {
            return;
        }
        class333 var0 = class333.method2199(Statics.field194, field681);
        if (var0 != null && var0.field3724 != null) {
            class88 var1 = new class88();
            var1.field1072 = var0;
            var1.field1076 = var0.field3724;
            class71.method1189(var1);
        }
        field682 = -1;
        field742 = false;
        method3478(var0);
    }

    @ObfuscatedName("js.lr(III)V")
    public static void method4795(int arg0, int arg1) {
        class298 var2 = class298.method8119(class296.field3164, field521.field1414);
        var2.field3205.method8430(arg1);
        var2.field3205.method8296(arg0);
        field521.method2669(var2);
    }

    @ObfuscatedName("qy.ld(IIIILjava/lang/String;B)V")
    public static void method7371(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class333 var5 = class333.method2199(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3731 != null) {
            class88 var6 = new class88();
            var6.field1072 = var5;
            var6.field1077 = arg0;
            var6.field1079 = arg4;
            var6.field1076 = var5.field3731;
            class71.method1189(var6);
        }
        boolean var7 = true;
        if (var5.field3649 > 0) {
            var7 = method7656(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2735(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class298 var11 = class298.method8119(class296.field3130, field521.field1414);
            var11.field3205.method8230(arg1);
            var11.field3205.method8228(arg2);
            var11.field3205.method8228(arg3);
            field521.method2669(var11);
        }
        if (arg0 == 2) {
            class298 var12 = class298.method8119(class296.field3179, field521.field1414);
            var12.field3205.method8230(arg1);
            var12.field3205.method8228(arg2);
            var12.field3205.method8228(arg3);
            field521.method2669(var12);
        }
        if (arg0 == 3) {
            class298 var13 = class298.method8119(class296.field3097, field521.field1414);
            var13.field3205.method8230(arg1);
            var13.field3205.method8228(arg2);
            var13.field3205.method8228(arg3);
            field521.method2669(var13);
        }
        if (arg0 == 4) {
            class298 var14 = class298.method8119(class296.field3132, field521.field1414);
            var14.field3205.method8230(arg1);
            var14.field3205.method8228(arg2);
            var14.field3205.method8228(arg3);
            field521.method2669(var14);
        }
        if (arg0 == 5) {
            class298 var15 = class298.method8119(class296.field3128, field521.field1414);
            var15.field3205.method8230(arg1);
            var15.field3205.method8228(arg2);
            var15.field3205.method8228(arg3);
            field521.method2669(var15);
        }
        if (arg0 == 6) {
            class298 var16 = class298.method8119(class296.field3101, field521.field1414);
            var16.field3205.method8230(arg1);
            var16.field3205.method8228(arg2);
            var16.field3205.method8228(arg3);
            field521.method2669(var16);
        }
        if (arg0 == 7) {
            class298 var17 = class298.method8119(class296.field3178, field521.field1414);
            var17.field3205.method8230(arg1);
            var17.field3205.method8228(arg2);
            var17.field3205.method8228(arg3);
            field521.method2669(var17);
        }
        if (arg0 == 8) {
            class298 var18 = class298.method8119(class296.field3152, field521.field1414);
            var18.field3205.method8230(arg1);
            var18.field3205.method8228(arg2);
            var18.field3205.method8228(arg3);
            field521.method2669(var18);
        }
        if (arg0 == 9) {
            class298 var19 = class298.method8119(class296.field3120, field521.field1414);
            var19.field3205.method8230(arg1);
            var19.field3205.method8228(arg2);
            var19.field3205.method8228(arg3);
            field521.method2669(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class298 var20 = class298.method8119(class296.field3118, field521.field1414);
        var20.field3205.method8230(arg1);
        var20.field3205.method8228(arg2);
        var20.field3205.method8228(arg3);
        field521.method2669(var20);
    }

    @ObfuscatedName("fc.li(I)V")
    public static final void method2963() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field679 - 1; var1++) {
                if (field665[var1] < 1000 && field665[var1 + 1] > 1000) {
                    String var2 = field669[var1];
                    field669[var1] = field669[var1 + 1];
                    field669[var1 + 1] = var2;
                    String var3 = field668[var1];
                    field668[var1] = field668[var1 + 1];
                    field668[var1 + 1] = var3;
                    int var4 = field665[var1];
                    field665[var1] = field665[var1 + 1];
                    field665[var1 + 1] = var4;
                    int var5 = field663[var1];
                    field663[var1] = field663[var1 + 1];
                    field663[var1 + 1] = var5;
                    int var6 = field664[var1];
                    field664[var1] = field664[var1 + 1];
                    field664[var1 + 1] = var6;
                    int var7 = field789[var1];
                    field789[var1] = field789[var1 + 1];
                    field789[var1 + 1] = var7;
                    int var8 = field667[var1];
                    field667[var1] = field667[var1 + 1];
                    field667[var1 + 1] = var8;
                    boolean var9 = field670[var1];
                    field670[var1] = field670[var1 + 1];
                    field670[var1 + 1] = var9;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("gd.la(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method3229(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method43(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("fy.lz(Ljava/lang/String;Ljava/lang/String;IIIIII)V")
    public static final void method2902(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method43(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("az.lu(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method43(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field661 || field679 >= 500) {
            return;
        }
        field668[field679] = arg0;
        field669[field679] = arg1;
        field665[field679] = arg2;
        field789[field679] = arg3;
        field663[field679] = arg4;
        field664[field679] = arg5;
        field667[field679] = arg6;
        field670[field679] = arg7;
        field679++;
    }

    @ObfuscatedName("cw.le(B)I")
    public static final int method1108() {
        return field679 - 1;
    }

    @ObfuscatedName("cw.lh(IIIII)V")
    public static final void method1112(int arg0, int arg1, int arg2, int arg3) {
        if (field579 == 0 && !field742) {
            method3229(class353.field4067, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class242.method7645(); var8++) {
            long var9 = class242.field2759[var8];
            if (var6 != var9) {
                var6 = var9;
                int var13 = class242.method6267(var8);
                int var14 = class242.method3437(class242.field2759[var8]);
                int var15 = var14;
                int var16 = class242.method42(class242.field2759[var8]);
                int var18 = class242.method7614(class242.field2759[var8]);
                int var19 = var18;
                if (var16 == 2 && Statics.field1458.method4221(Statics.field265, var13, var14, var9) >= 0) {
                    class207 var20 = Statics.method2211(var18);
                    if (var20.field2176 != null) {
                        var20 = var20.method3592();
                    }
                    if (var20 == null) {
                        continue;
                    }
                    class95 var21 = null;
                    for (class95 var22 = (class95) field678.method6393(); var22 != null; var22 = (class95) field678.method6374()) {
                        if (Statics.field265 == var22.field1179 && var22.field1166 == var13 && var22.field1167 == var15 && var22.field1174 == var19) {
                            var21 = var22;
                            break;
                        }
                    }
                    if (field579 == 1) {
                        method3229(class353.field4155, field558 + " " + class102.field1323 + " " + class102.method5443(65535) + var20.field2134, 1, var19, var13, var15);
                    } else if (!field742) {
                        String[] var23 = var20.field2162;
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if ((var21 == null || var21.method2265(var24)) && var23[var24] != null) {
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 3;
                                    }
                                    if (var24 == 1) {
                                        var25 = 4;
                                    }
                                    if (var24 == 2) {
                                        var25 = 5;
                                    }
                                    if (var24 == 3) {
                                        var25 = 6;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1001;
                                    }
                                    method3229(var23[var24], class102.method5443(65535) + var20.field2134, var25, var19, var13, var15);
                                }
                            }
                        }
                        method3229(class353.field4063, class102.method5443(65535) + var20.field2134, 1002, var20.field2142, var13, var15);
                    } else if ((Statics.field312 & 0x4) == 4) {
                        method3229(field637, field735 + " " + class102.field1323 + " " + class102.method5443(65535) + var20.field2134, 2, var19, var13, var15);
                    }
                }
                if (var16 == 1) {
                    class101 var26 = field574[var19];
                    if (var26 == null) {
                        continue;
                    }
                    if (var26.field1313.field2003 == 1 && (var26.field1192 & 0x7F) == 64 && (var26.field1206 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < field650; var27++) {
                            class101 var28 = field574[field576[var27]];
                            if (var28 != null && var26 != var28 && var28.field1313.field2003 == 1 && var26.field1192 == var28.field1192 && var26.field1206 == var28.field1206) {
                                method3270(var28, field576[var27], var13, var15);
                            }
                        }
                        int var29 = class108.field1366;
                        int[] var30 = class108.field1370;
                        for (int var31 = 0; var31 < var29; var31++) {
                            class92 var32 = field612[var30[var31]];
                            if (var32 != null && var26.field1192 == var32.field1192 && var26.field1206 == var32.field1206) {
                                method5056(var32, var30[var31], var13, var15);
                            }
                        }
                    }
                    method3270(var26, var19, var13, var15);
                }
                if (var16 == 0) {
                    class92 var33 = field612[var19];
                    if (var33 == null) {
                        continue;
                    }
                    if ((var33.field1192 & 0x7F) == 64 && (var33.field1206 & 0x7F) == 64) {
                        for (int var34 = 0; var34 < field650; var34++) {
                            class101 var35 = field574[field576[var34]];
                            if (var35 != null && var35.field1313.field2003 == 1 && var33.field1192 == var35.field1192 && var33.field1206 == var35.field1206) {
                                method3270(var35, field576[var34], var13, var15);
                            }
                        }
                        int var36 = class108.field1366;
                        int[] var37 = class108.field1370;
                        for (int var38 = 0; var38 < var36; var38++) {
                            class92 var39 = field612[var37[var38]];
                            if (var39 != null && var33 != var39 && var33.field1192 == var39.field1192 && var33.field1206 == var39.field1206) {
                                method5056(var39, var37[var38], var13, var15);
                            }
                        }
                    }
                    if (field652 == var19) {
                        var4 = var9;
                    } else {
                        method5056(var33, var19, var13, var15);
                    }
                }
                if (var16 == 3) {
                    class379 var40 = field653[Statics.field265][var13][var15];
                    if (var40 != null) {
                        for (class105 var41 = (class105) var40.method6382(); var41 != null; var41 = (class105) var40.method6391()) {
                            class208 var42 = class208.method2788(var41.field1346);
                            if (field579 == 1) {
                                method3229(class353.field4155, field558 + " " + class102.field1323 + " " + class102.method5443(16748608) + var42.field2228, 16, var41.field1346, var13, var15);
                            } else if (!field742) {
                                String[] var43 = var42.field2189;
                                for (int var44 = 4; var44 >= 0; var44--) {
                                    if (var41.method2550(var44)) {
                                        if (var43 != null && var43[var44] != null) {
                                            byte var45 = 0;
                                            if (var44 == 0) {
                                                var45 = 18;
                                            }
                                            if (var44 == 1) {
                                                var45 = 19;
                                            }
                                            if (var44 == 2) {
                                                var45 = 20;
                                            }
                                            if (var44 == 3) {
                                                var45 = 21;
                                            }
                                            if (var44 == 4) {
                                                var45 = 22;
                                            }
                                            method3229(var43[var44], class102.method5443(16748608) + var42.field2228, var45, var41.field1346, var13, var15);
                                        } else if (var44 == 2) {
                                            method3229(class353.field3899, class102.method5443(16748608) + var42.field2228, 20, var41.field1346, var13, var15);
                                        }
                                    }
                                }
                                method3229(class353.field4063, class102.method5443(16748608) + var42.field2228, 1004, var41.field1346, var13, var15);
                            } else if ((Statics.field312 & 0x1) == 1) {
                                method3229(field637, field735 + " " + class102.field1323 + " " + class102.method5443(16748608) + var42.field2228, 17, var41.field1346, var13, var15);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var46 = (int) (var4 >>> 0 & 0x7FL);
            int var48 = class242.method3437(var4);
            class92 var49 = field612[field652];
            method5056(var49, field652, var46, var48);
        }
    }

    @ObfuscatedName("hg.lw(Ldh;IIIB)V")
    public static final void method3270(class101 arg0, int arg1, int arg2, int arg3) {
        class196 var4 = arg0.field1313;
        if (field679 >= 400) {
            return;
        }
        if (var4.field2020 != null) {
            var4 = var4.method3412();
        }
        if (var4 == null || !var4.field2036 || var4.field2039 && field694 != arg1) {
            return;
        }
        String var5 = arg0.method2480();
        if (var4.field2027 != 0 && arg0.field1259 != 0) {
            int var6 = arg0.field1259 == -1 ? var4.field2027 : arg0.field1259;
            int var8 = Statics.field1605.field1118;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class102.method5443(16711680);
            } else if (var9 < -6) {
                var10 = class102.method5443(16723968);
            } else if (var9 < -3) {
                var10 = class102.method5443(16740352);
            } else if (var9 < 0) {
                var10 = class102.method5443(16756736);
            } else if (var9 > 9) {
                var10 = class102.method5443(65280);
            } else if (var9 > 6) {
                var10 = class102.method5443(4259584);
            } else if (var9 > 3) {
                var10 = class102.method5443(8453888);
            } else if (var9 > 0) {
                var10 = class102.method5443(12648192);
            } else {
                var10 = class102.method5443(16776960);
            }
            var5 = var5 + var10 + " " + class102.field1326 + class353.field4131 + var6 + class102.field1325;
        }
        if (var4.field2039 && field777) {
            method3229(class353.field4063, class102.method5443(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field579 == 1) {
            method3229(class353.field4155, field558 + " " + class102.field1323 + " " + class102.method5443(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field742) {
            int var11 = var4.field2039 && field777 ? 2000 : 0;
            String[] var12 = var4.field2026;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (arg0.method2479(var13) && var12[var13] != null && !var12[var13].equalsIgnoreCase(class353.field4064)) {
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
                        method3229(var12[var13], class102.method5443(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (arg0.method2479(var15) && var12[var15] != null && var12[var15].equalsIgnoreCase(class353.field4064)) {
                        short var16 = 0;
                        if (field546 != class104.field1340) {
                            if (field546 == class104.field1339 || field546 == class104.field1338 && var4.field2027 > Statics.field1605.field1118) {
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
                            method3229(var12[var15], class102.method5443(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2039 || !field777) {
                method3229(class353.field4063, class102.method5443(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field312 & 0x2) == 2) {
            method3229(field637, field735 + " " + class102.field1323 + " " + class102.method5443(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ko.lo(Ldf;IIIS)V")
    public static final void method5056(class92 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1605 == arg0 || field679 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1136 == 0) {
            String var4 = arg0.field1117[0] + arg0.field1115 + arg0.field1117[1];
            int var5 = arg0.field1118;
            int var6 = Statics.field1605.field1118;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class102.method5443(16711680);
            } else if (var7 < -6) {
                var8 = class102.method5443(16723968);
            } else if (var7 < -3) {
                var8 = class102.method5443(16740352);
            } else if (var7 < 0) {
                var8 = class102.method5443(16756736);
            } else if (var7 > 9) {
                var8 = class102.method5443(65280);
            } else if (var7 > 6) {
                var8 = class102.method5443(4259584);
            } else if (var7 > 3) {
                var8 = class102.method5443(8453888);
            } else if (var7 > 0) {
                var8 = class102.method5443(12648192);
            } else {
                var8 = class102.method5443(16776960);
            }
            var9 = var4 + var8 + " " + class102.field1326 + class353.field4131 + arg0.field1118 + class102.field1325 + arg0.field1117[2];
        } else {
            var9 = arg0.field1117[0] + arg0.field1115 + arg0.field1117[1] + " " + class102.field1326 + class353.field4069 + arg0.field1136 + class102.field1325 + arg0.field1117[2];
        }
        if (field579 == 1) {
            method3229(class353.field4155, field558 + " " + class102.field1323 + " " + class102.method5443(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field742) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field662[var10] != null) {
                    short var11 = 0;
                    if (field662[var10].equalsIgnoreCase(class353.field4064)) {
                        if (field545 == class104.field1340) {
                            continue;
                        }
                        if (field545 == class104.field1339 || field545 == class104.field1338 && arg0.field1118 > Statics.field1605.field1118) {
                            var11 = 2000;
                        }
                        if (Statics.field1605.field1132 == 0 || arg0.field1132 == 0) {
                            if (field545 == class104.field1341 && arg0.method2222()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field1605.field1132 == arg0.field1132) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field768[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field648[var10] + var11;
                    method3229(field662[var10], class102.method5443(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field312 & 0x8) == 8) {
            method3229(field637, field735 + " " + class102.field1323 + " " + class102.method5443(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field679; var14++) {
            if (field665[var14] == 23) {
                field669[var14] = class102.method5443(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("az.lv(IIIIIIIIB)V")
    public static final void method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class333.method2001(arg0)) {
            Statics.field3004 = null;
            method852(Statics.field1046[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3004 != null) {
                method852(Statics.field3004, -1412584499, arg1, arg2, arg3, arg4, Statics.field3352, Statics.field2957, arg7);
                Statics.field3004 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field719[var8] = true;
            }
        } else {
            field719[arg7] = true;
        }
    }

    @ObfuscatedName("bl.ls([Lmt;IIIIIIIII)V")
    public static final void method852(class333[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class524.method8655(arg2, arg3, arg4, arg5);
        class228.method4049();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class333 var10 = arg0[var9];
            if (var10 != null && (var10.field3643 == arg1 || arg1 == -1412584499 && field597 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field666[field733] = var10.field3637 + arg6;
                    field739[field733] = var10.field3638 + arg7;
                    field740[field733] = var10.field3616;
                    field741[field733] = var10.field3640;
                    var11 = ++field733 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3627 = var11;
                var10.field3687 = field530;
                if (!var10.field3623 || !method6020(var10)) {
                    if (var10.field3649 > 0) {
                        method3488(var10);
                    }
                    int var12 = var10.field3637 + arg6;
                    int var13 = var10.field3638 + arg7;
                    int var14 = var10.field3655;
                    if (field597 == var10) {
                        if (arg1 != -1412584499 && !var10.field3709) {
                            Statics.field3004 = arg0;
                            Statics.field3352 = arg6;
                            Statics.field2957 = arg7;
                            continue;
                        }
                        if (field601 && field762) {
                            int var15 = class36.field245;
                            int var16 = class36.field246;
                            int var17 = var15 - field699;
                            int var18 = var16 - field700;
                            if (var17 < field649) {
                                var17 = field649;
                            }
                            if (var10.field3616 + var17 > field649 + field605.field3616) {
                                var17 = field649 + field605.field3616 - var10.field3616;
                            }
                            if (var18 < field704) {
                                var18 = field704;
                            }
                            if (var10.field3640 + var18 > field704 + field605.field3640) {
                                var18 = field704 + field605.field3640 - var10.field3640;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3709) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3626 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3616 + var12;
                        int var22 = var10.field3640 + var13;
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
                        int var29 = var10.field3616 + var12;
                        int var30 = var10.field3640 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3623 || var25 < var27 && var26 < var28) {
                        if (var10.field3649 != 0) {
                            if (var10.field3649 == 1336) {
                                if (Statics.field1686.method2435()) {
                                    var13 += 15;
                                    Statics.field1431.method6812("Fps:" + field208, var10.field3616 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field634) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1431.method6812("Mem:" + var32 + "k", var10.field3616 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3649 == 1337) {
                                field674 = var12;
                                field675 = var13;
                                method417(var12, var13, var10.field3616, var10.field3640);
                                field719[var10.field3627] = true;
                                class524.method8655(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3649 == 1338) {
                                Statics.method4955(var10, var12, var13, var11);
                                class524.method8655(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3649 == 1339) {
                                method305(var10, var12, var13, var11);
                                class524.method8655(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3649 == 1400) {
                                Statics.field1500.method7921(var12, var13, var10.field3616, var10.field3640, field530);
                            }
                            if (var10.field3649 == 1401) {
                                Statics.field1500.method7817(var12, var13, var10.field3616, var10.field3640);
                            }
                            if (var10.field3649 == 1402) {
                                Statics.field1787.method2343(var12, field530);
                            }
                        }
                        if (var10.field3626 == 0) {
                            if (!var10.field3623 && method6020(var10) && Statics.field3061 != var10) {
                                continue;
                            }
                            if (!var10.field3623) {
                                if (var10.field3646 > var10.field3737 - var10.field3640) {
                                    var10.field3646 = var10.field3737 - var10.field3640;
                                }
                                if (var10.field3646 < 0) {
                                    var10.field3646 = 0;
                                }
                            }
                            method852(arg0, var10.field3624, var25, var26, var27, var28, var12 - var10.field3645, var13 - var10.field3646, var11);
                            if (var10.field3761 != null) {
                                method852(var10.field3761, var10.field3624, var25, var26, var27, var28, var12 - var10.field3645, var13 - var10.field3646, var11);
                            }
                            class87 var34 = (class87) field686.method7981((long) var10.field3624);
                            if (var34 != null) {
                                method60(var34.field1067, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class524.method8655(arg2, arg3, arg4, arg5);
                            class228.method4049();
                        } else if (var10.field3626 == 11) {
                            if (method6020(var10) && Statics.field3061 != var10) {
                                continue;
                            }
                            if (var10.field3761 != null) {
                                method852(var10.field3761, var10.field3624, var25, var26, var27, var28, var12 - var10.field3645, var13 - var10.field3646, var11);
                            }
                            class524.method8655(arg2, arg3, arg4, arg5);
                            class228.method4049();
                        }
                        if (field547 || field737[var11] || field673 > 1) {
                            if (var10.field3626 == 0 && !var10.field3623 && var10.field3737 > var10.field3640) {
                                method2995(var10.field3616 + var12, var13, var10.field3646, var10.field3640, var10.field3737);
                            }
                            if (var10.field3626 != 1) {
                                if (var10.field3626 == 3) {
                                    int var35;
                                    if (method1187(var10)) {
                                        var35 = var10.field3650;
                                        if (Statics.field3061 == var10 && var10.field3652 != 0) {
                                            var35 = var10.field3652;
                                        }
                                    } else {
                                        var35 = var10.field3736;
                                        if (Statics.field3061 == var10 && var10.field3651 != 0) {
                                            var35 = var10.field3651;
                                        }
                                    }
                                    if (var10.field3739) {
                                        switch(var10.field3654.field5153) {
                                            case 1:
                                                class524.method8576(var12, var13, var10.field3616, var10.field3640, var10.field3736, var10.field3650);
                                                break;
                                            case 2:
                                                class524.method8584(var12, var13, var10.field3616, var10.field3640, var10.field3736, var10.field3650, 255 - (var10.field3655 & 0xFF), 255 - (var10.field3656 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class524.method8582(var12, var13, var10.field3616, var10.field3640, var35);
                                                } else {
                                                    class524.method8581(var12, var13, var10.field3616, var10.field3640, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class524.method8574(var12, var13, var10.field3616, var10.field3640, var35);
                                    } else {
                                        class524.method8587(var12, var13, var10.field3616, var10.field3640, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3626 == 4) {
                                    class395 var36 = var10.method5845();
                                    if (var36 != null) {
                                        String var37 = var10.field3639;
                                        int var38;
                                        if (method1187(var10)) {
                                            var38 = var10.field3650;
                                            if (Statics.field3061 == var10 && var10.field3652 != 0) {
                                                var38 = var10.field3652;
                                            }
                                            if (var10.field3688.length() > 0) {
                                                var37 = var10.field3688;
                                            }
                                        } else {
                                            var38 = var10.field3736;
                                            if (Statics.field3061 == var10 && var10.field3651 != 0) {
                                                var38 = var10.field3651;
                                            }
                                        }
                                        if (var10.field3623 && var10.field3757 != -1) {
                                            class208 var39 = class208.method2788(var10.field3757);
                                            var37 = var39.field2228;
                                            if (var37 == null) {
                                                var37 = class353.field3906;
                                            }
                                            if ((var39.field2205 == 1 || var10.field3648 != 1) && var10.field3648 != -1) {
                                                var37 = class102.method5443(16748608) + var37 + class102.field1328 + " " + 'x' + method3356(var10.field3648);
                                            }
                                        }
                                        if (field690 == var10) {
                                            var37 = class353.field3915;
                                            var38 = var10.field3736;
                                        }
                                        if (!var10.field3623) {
                                            var37 = method5025(var37, var10);
                                        }
                                        var36.method6815(var37, var12, var13, var10.field3616, var10.field3640, var38, var10.field3706 ? 0 : -1, class468.method7647(var10.field3655), var10.field3690, var10.field3691, var10.field3689);
                                    } else if (class333.field3755) {
                                        method3478(var10);
                                    }
                                } else if (var10.field3626 == 5) {
                                    if (var10.field3623) {
                                        class528 var41;
                                        if (var10.field3757 == -1) {
                                            var41 = var10.method5840(false, Statics.field3013);
                                        } else {
                                            var41 = class208.method4376(var10.field3757, var10.field3648, var10.field3714, var10.field3727, var10.field3685, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5165;
                                            int var43 = var41.field5163;
                                            if (var10.field3663) {
                                                class524.method8575(var12, var13, var10.field3616 + var12, var10.field3640 + var13);
                                                int var44 = (var10.field3616 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3640 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3662 != 0) {
                                                            var41.method8778(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3662, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method8812(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method8714(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class524.method8655(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3616 * 4096 / var42;
                                                if (var10.field3662 != 0) {
                                                    var41.method8778(var10.field3616 / 2 + var12, var10.field3640 / 2 + var13, var10.field3662, var48);
                                                } else if (var14 != 0) {
                                                    var41.method8716(var12, var13, var10.field3616, var10.field3640, 256 - (var14 & 0xFF));
                                                } else if (var10.field3616 == var42 && var10.field3640 == var43) {
                                                    var41.method8812(var12, var13);
                                                } else {
                                                    var41.method8711(var12, var13, var10.field3616, var10.field3640);
                                                }
                                            }
                                        } else if (class333.field3755) {
                                            method3478(var10);
                                        }
                                    } else {
                                        class528 var40 = var10.method5840(method1187(var10), Statics.field3013);
                                        if (var40 != null) {
                                            var40.method8812(var12, var13);
                                        } else if (class333.field3755) {
                                            method3478(var10);
                                        }
                                    }
                                } else if (var10.field3626 == 6) {
                                    boolean var49 = method1187(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3746;
                                    } else {
                                        var50 = var10.field3672;
                                    }
                                    class241 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3757 != -1) {
                                        class208 var53 = class208.method2788(var10.field3757);
                                        if (var53 != null) {
                                            class208 var54 = var53.method3638(var10.field3648);
                                            var51 = var54.method3637(1);
                                            if (var51 == null) {
                                                method3478(var10);
                                            } else {
                                                var51.method4427();
                                                var52 = var51.field2613 / 2;
                                            }
                                        }
                                    } else if (var10.field3668 == 5) {
                                        if (var10.field3621 == 0) {
                                            var51 = field715.method5523((class210) null, -1, (class210) null, -1);
                                        } else {
                                            var51 = Statics.field1605.method1986();
                                        }
                                    } else if (var10.field3668 == 7) {
                                        var51 = var10.field3682.method5523((class210) null, -1, class210.method2904(Statics.field1605.field1232), Statics.field1605.field1254);
                                    } else {
                                        class196 var55 = null;
                                        class195 var56 = null;
                                        if (var10.field3668 == 6) {
                                            int var57 = var10.field3621;
                                            if (var57 >= 0 && var57 < field574.length) {
                                                class101 var58 = field574[var57];
                                                if (var58 != null) {
                                                    var55 = var58.field1313;
                                                    var56 = var58.method2491();
                                                }
                                            }
                                        }
                                        class210 var59 = null;
                                        int var60 = -1;
                                        if (var50 != -1) {
                                            var59 = class210.method2904(var50);
                                            var60 = var10.field3759;
                                        }
                                        var51 = var10.method5846(var59, var60, var49, Statics.field1605.field1139, var55, var56);
                                        if (var51 == null && class333.field3755) {
                                            method3478(var10);
                                        }
                                    }
                                    class228.method4052(var10.field3616 / 2 + var12, var10.field3640 / 2 + var13);
                                    int var61 = var10.field3679 * class228.field2509[var10.field3664] >> 16;
                                    int var62 = var10.field3679 * class228.field2510[var10.field3664] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3623) {
                                            var51.method4427();
                                            if (var10.field3683) {
                                                var51.method4445(0, var10.field3677, var10.field3768, var10.field3664, var10.field3674, var10.field3675 + var52 + var61, var10.field3675 + var62, var10.field3679);
                                            } else {
                                                var51.method4444(0, var10.field3677, var10.field3768, var10.field3664, var10.field3674, var10.field3675 + var52 + var61, var10.field3675 + var62);
                                            }
                                        } else {
                                            var51.method4444(0, var10.field3677, 0, var10.field3664, 0, var61, var62);
                                        }
                                    }
                                    class228.method4051();
                                } else {
                                    if (var10.field3626 == 8 && Statics.field4520 == var10 && field677 == field676) {
                                        int var63 = 0;
                                        int var64 = 0;
                                        class395 var65 = Statics.field1431;
                                        String var66 = var10.field3639;
                                        String var67 = method5025(var66, var10);
                                        while (var67.length() > 0) {
                                            int var68 = var67.indexOf(class102.field1330);
                                            String var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = "";
                                            } else {
                                                var69 = var67.substring(0, var68);
                                                var67 = var67.substring(var68 + 4);
                                            }
                                            int var70 = var65.method6864(var69);
                                            if (var70 > var63) {
                                                var63 = var70;
                                            }
                                            var64 += var65.field4493 + 1;
                                        }
                                        var63 += 6;
                                        var64 += 7;
                                        int var71 = var10.field3616 + var12 - 5 - var63;
                                        int var72 = var10.field3640 + var13 + 5;
                                        if (var71 < var12 + 5) {
                                            var71 = var12 + 5;
                                        }
                                        if (var63 + var71 > arg4) {
                                            var71 = arg4 - var63;
                                        }
                                        if (var64 + var72 > arg5) {
                                            var72 = arg5 - var64;
                                        }
                                        class524.method8582(var71, var72, var63, var64, 16777120);
                                        class524.method8574(var71, var72, var63, var64, 0);
                                        String var73 = var10.field3639;
                                        int var74 = var65.field4493 + var72 + 2;
                                        String var75 = method5025(var73, var10);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf(class102.field1330);
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            var65.method6810(var77, var71 + 3, var74, 0, -1);
                                            var74 += var65.field4493 + 1;
                                        }
                                    }
                                    if (var10.field3626 == 9) {
                                        int var78;
                                        int var79;
                                        int var80;
                                        int var81;
                                        if (var10.field3726) {
                                            var78 = var12;
                                            var79 = var10.field3640 + var13;
                                            var80 = var10.field3616 + var12;
                                            var81 = var13;
                                        } else {
                                            var78 = var12;
                                            var79 = var13;
                                            var80 = var10.field3616 + var12;
                                            var81 = var10.field3640 + var13;
                                        }
                                        if (var10.field3657 == 1) {
                                            class524.method8632(var78, var79, var80, var81, var10.field3736);
                                        } else {
                                            method345(var78, var79, var80, var81, var10.field3736, var10.field3657);
                                        }
                                    } else if (var10.field3626 == 12) {
                                        class331 var82 = var10.method5902();
                                        class326 var83 = var10.method5867();
                                        if (var82 != null && var83 != null && var82.method5614()) {
                                            class395 var84 = var10.method5845();
                                            if (var84 != null) {
                                                field727.method8856(var12, var13, var10.field3616, var10.field3640, var82.method5714(), var82.method5616(), var82.method5612(), var82.method5613(), var82.method5686());
                                                int var85 = var10.field3706 ? var10.field3727 : -1;
                                                if (!var82.method5609() && var82.method5662().method6654()) {
                                                    field727.method8863(var83.field3542, var85, var83.field3540, var83.field3541);
                                                    field727.method8854(var82.method5813(), var84);
                                                } else {
                                                    field727.method8863(var10.field3736, var85, var83.field3540, var83.field3541);
                                                    field727.method8854(var82.method5662(), var84);
                                                }
                                                class524.method8655(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("al.lx(IIIIIII)V")
    public static final void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class524.field5144;
        int var18 = arg1 - class524.field5142;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class228.method4076(var19, var20, var21);
        class228.method4089(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class228.method4076(var19, var21, var22);
        class228.method4089(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("kn.ln(Ljava/lang/String;Lmt;I)Ljava/lang/String;")
    public static String method5025(String arg0, class333 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3248(arg1, var2 - 1);
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

    @ObfuscatedName("hr.lt(II)Ljava/lang/String;")
    public static final String method3356(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class102.field1324 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class102.method5443(65408) + var1.substring(0, var1.length() - 8) + class353.field4073 + " " + class102.field1326 + var1 + class102.field1325 + class102.field1328;
        } else if (var1.length() > 6) {
            return " " + class102.method5443(16777215) + var1.substring(0, var1.length() - 4) + class353.field4040 + " " + class102.field1326 + var1 + class102.field1325 + class102.field1328;
        } else {
            return " " + class102.method5443(16776960) + var1 + class102.field1328;
        }
    }

    @ObfuscatedName("client.lp(ZI)V")
    public final void method1217(boolean arg0) {
        int var2 = field685;
        int var3 = Statics.field4328;
        int var4 = Statics.field4883;
        if (class333.method2001(var2)) {
            method688(Statics.field1046[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.lf(Lmt;I)V")
    public void method1218(class333 arg0) {
        class333 var2 = arg0.field3643 == -1 ? null : class333.method3491(arg0.field3643);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field4328;
            var4 = Statics.field4883;
        } else {
            var3 = var2.field3616;
            var4 = var2.field3640;
        }
        method1844(arg0, var3, var4, false);
        method213(arg0, var3, var4);
    }

    @ObfuscatedName("br.lk([Lmt;IIIZS)V")
    public static void method688(class333[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class333 var6 = arg0[var5];
            if (var6 != null && var6.field3643 == arg1) {
                method1844(var6, arg2, arg3, arg4);
                method213(var6, arg2, arg3);
                if (var6.field3645 > var6.field3647 - var6.field3616) {
                    var6.field3645 = var6.field3647 - var6.field3616;
                }
                if (var6.field3645 < 0) {
                    var6.field3645 = 0;
                }
                if (var6.field3646 > var6.field3737 - var6.field3640) {
                    var6.field3646 = var6.field3737 - var6.field3640;
                }
                if (var6.field3646 < 0) {
                    var6.field3646 = 0;
                }
                if (var6.field3626 == 0) {
                    Statics.method838(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("cd.lq(Lmt;IIZI)V")
    public static void method1844(class333 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3616;
        int var5 = arg0.field3640;
        if (arg0.field3610 == 0) {
            arg0.field3616 = arg0.field3750;
        } else if (arg0.field3610 == 1) {
            arg0.field3616 = arg1 - arg0.field3750;
        } else if (arg0.field3610 == 2) {
            arg0.field3616 = arg0.field3750 * arg1 >> 14;
        }
        if (arg0.field3632 == 0) {
            arg0.field3640 = arg0.field3758;
        } else if (arg0.field3632 == 1) {
            arg0.field3640 = arg2 - arg0.field3758;
        } else if (arg0.field3632 == 2) {
            arg0.field3640 = arg0.field3758 * arg2 >> 14;
        }
        if (arg0.field3610 == 4) {
            arg0.field3616 = arg0.field3673 * arg0.field3640 / arg0.field3642;
        }
        if (arg0.field3632 == 4) {
            arg0.field3640 = arg0.field3642 * arg0.field3616 / arg0.field3673;
        }
        if (arg0.field3649 == 1337) {
            field696 = arg0;
        }
        if (arg0.field3626 == 12) {
            arg0.method5902().method5563(arg0.field3616, arg0.field3640);
        }
        if (arg3 && arg0.field3615 != null && (arg0.field3616 != var4 || arg0.field3640 != var5)) {
            class88 var6 = new class88();
            var6.field1072 = arg0;
            var6.field1076 = arg0.field3615;
            field728.method6367(var6);
        }
    }

    @ObfuscatedName("ab.lc(Lmt;III)V")
    public static void method213(class333 arg0, int arg1, int arg2) {
        if (arg0.field3718 == 0) {
            arg0.field3637 = arg0.field3633;
        } else if (arg0.field3718 == 1) {
            arg0.field3637 = (arg1 - arg0.field3616) / 2 + arg0.field3633;
        } else if (arg0.field3718 == 2) {
            arg0.field3637 = arg1 - arg0.field3616 - arg0.field3633;
        } else if (arg0.field3718 == 3) {
            arg0.field3637 = arg0.field3633 * arg1 >> 14;
        } else if (arg0.field3718 == 4) {
            arg0.field3637 = (arg0.field3633 * arg1 >> 14) + (arg1 - arg0.field3616) / 2;
        } else {
            arg0.field3637 = arg1 - arg0.field3616 - (arg0.field3633 * arg1 >> 14);
        }
        if (arg0.field3630 == 0) {
            arg0.field3638 = arg0.field3634;
        } else if (arg0.field3630 == 1) {
            arg0.field3638 = (arg2 - arg0.field3640) / 2 + arg0.field3634;
        } else if (arg0.field3630 == 2) {
            arg0.field3638 = arg2 - arg0.field3640 - arg0.field3634;
        } else if (arg0.field3630 == 3) {
            arg0.field3638 = arg0.field3634 * arg2 >> 14;
        } else if (arg0.field3630 == 4) {
            arg0.field3638 = (arg0.field3634 * arg2 >> 14) + (arg2 - arg0.field3640) / 2;
        } else {
            arg0.field3638 = arg2 - arg0.field3640 - (arg0.field3634 * arg2 >> 14);
        }
    }

    @ObfuscatedName("fc.lb(Lmt;IIIIIII)V")
    public static final void method2962(class333 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field817) {
            field599 = 32;
        } else {
            field599 = 0;
        }
        field817 = false;
        if (class36.field244 == 1 || !Statics.field170 && class36.field244 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3646 -= 4;
                method3478(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3646 += 4;
                method3478(arg0);
            } else if (arg5 >= arg1 - field599 && arg5 < field599 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3646 = (arg4 - arg3) * var8 / var9;
                method3478(arg0);
                field817 = true;
            }
        }
        if (field726 == 0) {
            return;
        }
        int var10 = arg0.field3616;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3646 += field726 * 45;
            method3478(arg0);
        }
    }

    @ObfuscatedName("fo.lg(IIIIII)V")
    public static final void method2995(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field3372[0].method8673(arg0, arg1);
        Statics.field3372[1].method8673(arg0, arg1 + arg3 - 16);
        class524.method8582(arg0, arg1 + 16, 16, arg3 - 32, field594);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class524.method8582(arg0, arg1 + 16 + var6, 16, var5, field595);
        class524.method8590(arg0, arg1 + 16 + var6, var5, field773);
        class524.method8590(arg0 + 1, arg1 + 16 + var6, var5, field773);
        class524.method8588(arg0, arg1 + 16 + var6, 16, field773);
        class524.method8588(arg0, arg1 + 17 + var6, 16, field773);
        class524.method8590(arg0 + 15, arg1 + 16 + var6, var5, field596);
        class524.method8590(arg0 + 14, arg1 + 17 + var6, var5 - 1, field596);
        class524.method8588(arg0, arg1 + 15 + var6 + var5, 16, field596);
        class524.method8588(arg0 + 1, arg1 + 14 + var6 + var5, 15, field596);
    }

    @ObfuscatedName("cu.ll(Lmt;I)Z")
    public static final boolean method1187(class333 arg0) {
        if (arg0.field3751 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3751.length; var1++) {
            int var2 = method3248(arg0, var1);
            int var3 = arg0.field3622[var1];
            if (arg0.field3751[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3751[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3751[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hf.lm(Lmt;II)I")
    public static final int method3248(class333 arg0, int arg1) {
        if (arg0.field3745 == null || arg1 >= arg0.field3745.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3745[arg1];
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
                    var7 = field657[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field578[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field659[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class333 var11 = class333.method3491(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class208.method2788(var12).field2210 || field520)) {
                        for (int var13 = 0; var13 < var11.field3620.length; var13++) {
                            if (var12 + 1 == var11.field3620[var13]) {
                                var7 += var11.field3756[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class323.field3532[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class343.field3833[field578[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class323.field3532[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1605.field1118;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class343.field3831[var14]) {
                            var7 += field578[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class333 var17 = class333.method3491(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class208.method2788(var18).field2210 || field520)) {
                        for (int var19 = 0; var19 < var17.field3620.length; var19++) {
                            if (var18 + 1 == var17.field3620[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field691;
                }
                if (var6 == 12) {
                    var7 = field692;
                }
                if (var6 == 13) {
                    int var20 = class323.field3532[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class323.method4655(var22);
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
                    var7 = (Statics.field1605.field1192 >> 7) + Statics.field4295;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1605.field1206 >> 7) + Statics.field1676;
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

    @ObfuscatedName("mh.mn(Lmt;I)V")
    public static final void method5459(class333 arg0) {
        if (arg0.field3707 == 1) {
            method2902(arg0.field3754, "", 24, 0, 0, arg0.field3624, arg0.field3757);
        }
        if (arg0.field3707 == 2 && !field742) {
            String var1 = method167(arg0);
            if (var1 != null) {
                method2902(var1, class102.method5443(65280) + arg0.field3753, 25, 0, -1, arg0.field3624, arg0.field3757);
            }
        }
        if (arg0.field3707 == 3) {
            method3229(class353.field4057, "", 26, 0, 0, arg0.field3624);
        }
        if (arg0.field3707 == 4) {
            method3229(arg0.field3754, "", 28, 0, 0, arg0.field3624);
        }
        if (arg0.field3707 == 5) {
            method3229(arg0.field3754, "", 29, 0, 0, arg0.field3624);
        }
        if (arg0.field3707 == 6 && field690 == null) {
            method3229(arg0.field3754, "", 30, 0, -1, arg0.field3624);
        }
        if (!arg0.field3623) {
            return;
        }
        if (!field742) {
            for (int var2 = 9; var2 >= 5; var2--) {
                String var3 = method3793(arg0, var2);
                if (var3 != null) {
                    method2902(var3, arg0.field3704, 1007, var2 + 1, arg0.field3625, arg0.field3624, arg0.field3757);
                }
            }
            String var4 = method167(arg0);
            if (var4 != null) {
                method2902(var4, arg0.field3704, 25, 0, arg0.field3625, arg0.field3624, arg0.field3757);
            }
            for (int var5 = 4; var5 >= 0; var5--) {
                int var6 = method2735(arg0);
                boolean var7 = (var6 >> var5 + 1 & 0x1) != 0;
                String var8;
                if (!var7 && arg0.field3731 == null) {
                    var8 = null;
                } else if (arg0.field3665 == null || arg0.field3665.length <= var5 || arg0.field3665[var5] == null || arg0.field3665[var5].trim().length() == 0) {
                    var8 = null;
                } else {
                    var8 = arg0.field3665[var5];
                }
                if (var8 != null) {
                    method43(var8, arg0.field3704, 57, var5 + 1, arg0.field3625, arg0.field3624, arg0.field3757, arg0.field3773);
                }
            }
            int var10 = method2735(arg0);
            boolean var11 = (var10 & 0x1) != 0;
            if (var11) {
                method3229(class353.field4105, "", 30, 0, arg0.field3625, arg0.field3624);
            }
        } else if (class334.method5024(method2735(arg0)) && (Statics.field312 & 0x20) == 32) {
            method2902(field637, field735 + " " + class102.field1323 + " " + arg0.field3704, 58, 0, arg0.field3625, arg0.field3624, arg0.field3757);
        }
    }

    @ObfuscatedName("ml.mf(ZB)V")
    public static void method6004(boolean arg0) {
        field672 = arg0;
    }

    @ObfuscatedName("fu.mm(I)Z")
    public static boolean method2964() {
        return field672;
    }

    @ObfuscatedName("fv.mw([Lmt;IIIIIIIB)V")
    public static final void method2968(class333[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class333 var9 = arg0[var8];
            if (var9 != null && var9.field3643 == arg1 && (var9.method5903() || method2735(var9) != 0 || field605 == var9)) {
                if (var9.field3623) {
                    if (method6020(var9)) {
                        continue;
                    }
                } else if (var9.field3626 == 0 && Statics.field3061 != var9 && method6020(var9)) {
                    continue;
                }
                if (var9.field3626 == 11) {
                    if (var9.method5864(Statics.field3013)) {
                        if (var9.method5857()) {
                            method3478(var9);
                            Statics.method838(var9.field3761, var9, true);
                        }
                        if (var9.field3748 != null) {
                            class88 var10 = new class88();
                            var10.field1072 = var9;
                            var10.field1076 = var9.field3748;
                            field728.method6367(var10);
                        }
                    }
                } else if (var9.field3626 == 12 && var9.method5871()) {
                    method3478(var9);
                }
                int var11 = var9.field3637 + arg6;
                int var12 = var9.field3638 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3626 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3616 + var11;
                    int var16 = var9.field3640 + var12;
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
                    int var23 = var9.field3616 + var11;
                    int var24 = var9.field3640 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field597 == var9) {
                    field810 = true;
                    field706 = var11;
                    field707 = var12;
                }
                boolean var25 = false;
                if (var9.field3699) {
                    switch(field618) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3624 >>> 16 == field688) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field688 == var9.field3624) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3623 || var19 < var21 && var20 < var22) {
                    if (var9.field3623) {
                        if (var9.field3771) {
                            if (class36.field245 >= var19 && class36.field246 >= var20 && class36.field245 < var21 && class36.field246 < var22) {
                                for (class88 var26 = (class88) field728.method6393(); var26 != null; var26 = (class88) field728.method6374()) {
                                    if (var26.field1071) {
                                        var26.method7662();
                                        var26.field1072.field3762 = false;
                                    }
                                }
                                method7046();
                                if (Statics.field1556 == 0) {
                                    field597 = null;
                                    field605 = null;
                                }
                                if (!field661) {
                                    method2204();
                                }
                            }
                        } else if (var9.field3772 && class36.field245 >= var19 && class36.field246 >= var20 && class36.field245 < var21 && class36.field246 < var22) {
                            for (class88 var27 = (class88) field728.method6393(); var27 != null; var27 = (class88) field728.method6374()) {
                                if (var27.field1071 && var27.field1072.field3733 == var27.field1076) {
                                    var27.method7662();
                                }
                            }
                        }
                    }
                    int var28 = class36.field245;
                    int var29 = class36.field246;
                    if (class36.field252 != 0) {
                        var28 = class36.field253;
                        var29 = class36.field254;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3649 == 1337) {
                        if (!field683 && !field661 && var30) {
                            method1112(var28, var29, var19, var20);
                        }
                    } else if (var9.field3649 == 1338) {
                        method3118(var9, var11, var12);
                    } else {
                        if (var9.field3649 == 1400) {
                            Statics.field1500.method7730(class36.field245, class36.field246, var30, var11, var12, var9.field3616, var9.field3640);
                        }
                        if (!field661 && var30) {
                            if (var9.field3649 == 1400) {
                                Statics.field1500.method7782(var11, var12, var9.field3616, var9.field3640, var28, var29);
                            } else {
                                method5459(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3712.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3712[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3712[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3770 != null) {
                                            var35 = field751.method3796(var9.field3712[var31][var34]);
                                        }
                                        if (method5472(var9.field3712[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3770 != null && var9.field3770[var31] > field530) {
                                                break;
                                            }
                                            byte var36 = var9.field3701[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field751.method3796(86) && !field751.method3796(82) && !field751.method3796(81)) && ((var36 & 0x2) == 0 || field751.method3796(86)) && ((var36 & 0x1) == 0 || field751.method3796(82)) && ((var36 & 0x4) == 0 || field751.method3796(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method7371(var31 + 1, var9.field3624, var9.field3625, var9.field3757, "");
                                    } else if (var31 == 10) {
                                        method847();
                                        method6047(var9.field3624, var9.field3625, class334.method5039(method2735(var9)), var9.field3757);
                                        field637 = method167(var9);
                                        if (field637 == null) {
                                            field637 = class353.field3906;
                                        }
                                        field735 = var9.field3704 + class102.method5443(16777215);
                                    }
                                    int var37 = var9.field3658[var31];
                                    if (var9.field3770 == null) {
                                        var9.field3770 = new int[var9.field3712.length];
                                    }
                                    if (var9.field3631 == null) {
                                        var9.field3631 = new int[var9.field3712.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3770[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3770[var31] == 0) {
                                        var9.field3770[var31] = field530 + var37 + var9.field3631[var31];
                                    } else {
                                        var9.field3770[var31] = field530 + var37;
                                    }
                                }
                                if (!var32 && var9.field3770 != null) {
                                    var9.field3770[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3623) {
                            boolean var38;
                            if (class36.field245 >= var19 && class36.field246 >= var20 && class36.field245 < var21 && class36.field246 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field244 == 1 || !Statics.field170 && class36.field244 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field252 == 1 || !Statics.field170 && class36.field252 == 4) && class36.field253 >= var19 && class36.field254 >= var20 && class36.field253 < var21 && class36.field254 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method6043(var9, class36.field253 - var11, class36.field254 - var12);
                            }
                            if (var9.method5850()) {
                                if (var40) {
                                    field811.method6367(new class213(0, class36.field245 - var11, class36.field246 - var12, var9));
                                }
                                if (var39) {
                                    field811.method6367(new class213(1, class36.field245 - var11, class36.field246 - var12, var9));
                                }
                            }
                            if (var9.field3649 == 1400) {
                                Statics.field1500.method7731(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field597 != null && field597 != var9 && var38 && class334.method5471(method2735(var9))) {
                                field701 = var9;
                            }
                            if (field605 == var9) {
                                field762 = true;
                                field649 = var11;
                                field704 = var12;
                            }
                            if (var9.field3765) {
                                if (var38 && field726 != 0 && var9.field3733 != null) {
                                    class88 var41 = new class88();
                                    var41.field1071 = true;
                                    var41.field1072 = var9;
                                    var41.field1074 = field726;
                                    var41.field1076 = var9.field3733;
                                    field728.method6367(var41);
                                }
                                if (field597 != null || field661) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3763 && var40) {
                                    var9.field3763 = true;
                                    if (var9.field3713 != null) {
                                        class88 var42 = new class88();
                                        var42.field1071 = true;
                                        var42.field1072 = var9;
                                        var42.field1073 = class36.field253 - var11;
                                        var42.field1074 = class36.field254 - var12;
                                        var42.field1076 = var9.field3713;
                                        field728.method6367(var42);
                                    }
                                }
                                if (var9.field3763 && var39 && var9.field3711 != null) {
                                    class88 var43 = new class88();
                                    var43.field1071 = true;
                                    var43.field1072 = var9;
                                    var43.field1073 = class36.field245 - var11;
                                    var43.field1074 = class36.field246 - var12;
                                    var43.field1076 = var9.field3711;
                                    field728.method6367(var43);
                                }
                                if (var9.field3763 && !var39) {
                                    var9.field3763 = false;
                                    if (var9.field3715 != null) {
                                        class88 var44 = new class88();
                                        var44.field1071 = true;
                                        var44.field1072 = var9;
                                        var44.field1073 = class36.field245 - var11;
                                        var44.field1074 = class36.field246 - var12;
                                        var44.field1076 = var9.field3715;
                                        field730.method6367(var44);
                                    }
                                }
                                if (var39 && var9.field3716 != null) {
                                    class88 var45 = new class88();
                                    var45.field1071 = true;
                                    var45.field1072 = var9;
                                    var45.field1073 = class36.field245 - var11;
                                    var45.field1074 = class36.field246 - var12;
                                    var45.field1076 = var9.field3716;
                                    field728.method6367(var45);
                                }
                                if (!var9.field3762 && var38) {
                                    var9.field3762 = true;
                                    if (var9.field3717 != null) {
                                        class88 var46 = new class88();
                                        var46.field1071 = true;
                                        var46.field1072 = var9;
                                        var46.field1073 = class36.field245 - var11;
                                        var46.field1074 = class36.field246 - var12;
                                        var46.field1076 = var9.field3717;
                                        field728.method6367(var46);
                                    }
                                }
                                if (var9.field3762 && var38 && var9.field3678 != null) {
                                    class88 var47 = new class88();
                                    var47.field1071 = true;
                                    var47.field1072 = var9;
                                    var47.field1073 = class36.field245 - var11;
                                    var47.field1074 = class36.field246 - var12;
                                    var47.field1076 = var9.field3678;
                                    field728.method6367(var47);
                                }
                                if (var9.field3762 && !var38) {
                                    var9.field3762 = false;
                                    if (var9.field3719 != null) {
                                        class88 var48 = new class88();
                                        var48.field1071 = true;
                                        var48.field1072 = var9;
                                        var48.field1073 = class36.field245 - var11;
                                        var48.field1074 = class36.field246 - var12;
                                        var48.field1076 = var9.field3719;
                                        field730.method6367(var48);
                                    }
                                }
                                if (var9.field3705 != null) {
                                    class88 var49 = new class88();
                                    var49.field1072 = var9;
                                    var49.field1076 = var9.field3705;
                                    field729.method6367(var49);
                                }
                                if (var9.field3686 != null && field711 > var9.field3749) {
                                    if (var9.field3725 == null || field711 - var9.field3749 > 32) {
                                        class88 var54 = new class88();
                                        var54.field1072 = var9;
                                        var54.field1076 = var9.field3686;
                                        field728.method6367(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3749; var50 < field711; var50++) {
                                            int var51 = field710[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3725.length; var52++) {
                                                if (var9.field3725[var52] == var51) {
                                                    class88 var53 = new class88();
                                                    var53.field1072 = var9;
                                                    var53.field1076 = var9.field3686;
                                                    field728.method6367(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3749 = field711;
                                }
                                if (var9.field3703 != null && field687 > var9.field3676) {
                                    if (var9.field3722 == null || field687 - var9.field3676 > 32) {
                                        class88 var59 = new class88();
                                        var59.field1072 = var9;
                                        var59.field1076 = var9.field3703;
                                        field728.method6367(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3676; var55 < field687; var55++) {
                                            int var56 = field808[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3722.length; var57++) {
                                                if (var9.field3722[var57] == var56) {
                                                    class88 var58 = new class88();
                                                    var58.field1072 = var9;
                                                    var58.field1076 = var9.field3703;
                                                    field728.method6367(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3676 = field687;
                                }
                                if (var9.field3728 != null && field712 > var9.field3767) {
                                    if (var9.field3729 == null || field712 - var9.field3767 > 32) {
                                        class88 var64 = new class88();
                                        var64.field1072 = var9;
                                        var64.field1076 = var9.field3728;
                                        field728.method6367(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3767; var60 < field712; var60++) {
                                            int var61 = field714[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3729.length; var62++) {
                                                if (var9.field3729[var62] == var61) {
                                                    class88 var63 = new class88();
                                                    var63.field1072 = var9;
                                                    var63.field1076 = var9.field3728;
                                                    field728.method6367(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3767 = field712;
                                }
                                if (field718 > var9.field3764 && var9.field3769 != null) {
                                    class88 var65 = new class88();
                                    var65.field1072 = var9;
                                    var65.field1076 = var9.field3769;
                                    field728.method6367(var65);
                                }
                                if (field764 > var9.field3764 && var9.field3738 != null) {
                                    class88 var66 = new class88();
                                    var66.field1072 = var9;
                                    var66.field1076 = var9.field3738;
                                    field728.method6367(var66);
                                }
                                if (field720 > var9.field3764 && var9.field3641 != null) {
                                    class88 var67 = new class88();
                                    var67.field1072 = var9;
                                    var67.field1076 = var9.field3641;
                                    field728.method6367(var67);
                                }
                                if (field554 > var9.field3764 && var9.field3740 != null) {
                                    class88 var68 = new class88();
                                    var68.field1072 = var9;
                                    var68.field1076 = var9.field3740;
                                    field728.method6367(var68);
                                }
                                if (field623 > var9.field3764 && var9.field3741 != null) {
                                    class88 var69 = new class88();
                                    var69.field1072 = var9;
                                    var69.field1076 = var9.field3741;
                                    field728.method6367(var69);
                                }
                                if (field722 > var9.field3764 && var9.field3653 != null) {
                                    class88 var70 = new class88();
                                    var70.field1072 = var9;
                                    var70.field1076 = var9.field3653;
                                    field728.method6367(var70);
                                }
                                if (field724 > var9.field3764 && var9.field3747 != null) {
                                    class88 var71 = new class88();
                                    var71.field1072 = var9;
                                    var71.field1076 = var9.field3747;
                                    field728.method6367(var71);
                                }
                                if (field725 > var9.field3764 && var9.field3742 != null) {
                                    class88 var72 = new class88();
                                    var72.field1072 = var9;
                                    var72.field1076 = var9.field3742;
                                    field728.method6367(var72);
                                }
                                var9.field3764 = field709;
                                if (var9.field3735 != null) {
                                    for (int var73 = 0; var73 < field753; var73++) {
                                        class88 var74 = new class88();
                                        var74.field1072 = var9;
                                        var74.field1070 = field755[var73];
                                        var74.field1078 = field754[var73];
                                        var74.field1076 = var9.field3735;
                                        field728.method6367(var74);
                                    }
                                }
                                if (var9.field3619 != null) {
                                    int[] var75 = field751.method3817();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class88 var77 = new class88();
                                        var77.field1072 = var9;
                                        var77.field1070 = var75[var76];
                                        var77.field1076 = var9.field3619;
                                        field728.method6367(var77);
                                    }
                                }
                                if (var9.field3636 != null) {
                                    int[] var78 = field751.method3799();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class88 var80 = new class88();
                                        var80.field1072 = var9;
                                        var80.field1070 = var78[var79];
                                        var80.field1076 = var9.field3636;
                                        field728.method6367(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3623) {
                            if (field597 != null || field661) {
                                continue;
                            }
                            if ((var9.field3607 >= 0 || var9.field3651 != 0) && class36.field245 >= var19 && class36.field246 >= var20 && class36.field245 < var21 && class36.field246 < var22) {
                                if (var9.field3607 >= 0) {
                                    Statics.field3061 = arg0[var9.field3607];
                                } else {
                                    Statics.field3061 = var9;
                                }
                            }
                            if (var9.field3626 == 8 && class36.field245 >= var19 && class36.field246 >= var20 && class36.field245 < var21 && class36.field246 < var22) {
                                Statics.field4520 = var9;
                            }
                            if (var9.field3737 > var9.field3640) {
                                method2962(var9, var9.field3616 + var11, var12, var9.field3640, var9.field3737, class36.field245, class36.field246);
                            }
                        }
                        if (var9.field3626 == 0) {
                            method2968(arg0, var9.field3624, var19, var20, var21, var22, var11 - var9.field3645, var12 - var9.field3646);
                            if (var9.field3761 != null) {
                                method2968(var9.field3761, var9.field3624, var19, var20, var21, var22, var11 - var9.field3645, var12 - var9.field3646);
                            }
                            class87 var81 = (class87) field686.method7981((long) var9.field3624);
                            if (var81 != null) {
                                if (var81.field1068 == 0 && class36.field245 >= var19 && class36.field246 >= var20 && class36.field245 < var21 && class36.field246 < var22 && !field661) {
                                    for (class88 var82 = (class88) field728.method6393(); var82 != null; var82 = (class88) field728.method6374()) {
                                        if (var82.field1071) {
                                            var82.method7662();
                                            var82.field1072.field3762 = false;
                                        }
                                    }
                                    if (Statics.field1556 == 0) {
                                        field597 = null;
                                        field605 = null;
                                    }
                                    if (!field661) {
                                        method2204();
                                    }
                                }
                                Statics.method91(var81.field1067, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("mx.mh(IB)Z")
    public static boolean method5472(int arg0) {
        for (int var1 = 0; var1 < field753; var1++) {
            if (field755[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dg.mj(IIB)V")
    public static final void method2094(int arg0, int arg1) {
        if (class333.method2001(arg0)) {
            method7079(Statics.field1046[arg0], arg1);
        }
    }

    @ObfuscatedName("qb.mx([Lmt;II)V")
    public static final void method7079(class333[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class333 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3626 == 0) {
                    if (var3.field3761 != null) {
                        method7079(var3.field3761, arg1);
                    }
                    class87 var4 = (class87) field686.method7981((long) var3.field3624);
                    if (var4 != null) {
                        method2094(var4.field1067, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3743 != null) {
                    class88 var5 = new class88();
                    var5.field1072 = var3;
                    var5.field1076 = var3.field3743;
                    class71.method1189(var5);
                }
                if (arg1 == 1 && var3.field3744 != null) {
                    if (var3.field3625 >= 0) {
                        class333 var6 = class333.method3491(var3.field3624);
                        if (var6 == null || var6.field3761 == null || var3.field3625 >= var6.field3761.length || var6.field3761[var3.field3625] != var3) {
                            continue;
                        }
                    }
                    class88 var7 = new class88();
                    var7.field1072 = var3;
                    var7.field1076 = var3.field3744;
                    class71.method1189(var7);
                }
            }
        }
    }

    @ObfuscatedName("nr.mu(Lmt;III)V")
    public static final void method6043(class333 arg0, int arg1, int arg2) {
        if (field597 != null || field661 || arg0 == null || method8117(arg0) == null) {
            return;
        }
        field597 = arg0;
        field605 = method8117(arg0);
        field699 = arg1;
        field700 = arg2;
        Statics.field1556 = 0;
        field601 = false;
        int var3 = method1108();
        if (var3 != -1) {
            method6349(var3);
        }
    }

    @ObfuscatedName("client.mi(B)V")
    public final void method1219() {
        method3478(field597);
        Statics.field1556++;
        if (field810 && field762) {
            int var1 = class36.field245;
            int var2 = class36.field246;
            int var3 = var1 - field699;
            int var4 = var2 - field700;
            if (var3 < field649) {
                var3 = field649;
            }
            if (field597.field3616 + var3 > field649 + field605.field3616) {
                var3 = field649 + field605.field3616 - field597.field3616;
            }
            if (var4 < field704) {
                var4 = field704;
            }
            if (field597.field3640 + var4 > field704 + field605.field3640) {
                var4 = field704 + field605.field3640 - field597.field3640;
            }
            int var5 = var3 - field706;
            int var6 = var4 - field707;
            int var7 = field597.field3669;
            if (Statics.field1556 > field597.field3708 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field601 = true;
            }
            int var8 = field605.field3645 + (var3 - field649);
            int var9 = field605.field3646 + (var4 - field704);
            if (field597.field3720 != null && field601) {
                class88 var10 = new class88();
                var10.field1072 = field597;
                var10.field1073 = var8;
                var10.field1074 = var9;
                var10.field1076 = field597.field3720;
                class71.method1189(var10);
            }
            if (class36.field244 == 0) {
                if (field601) {
                    if (field597.field3721 != null) {
                        class88 var11 = new class88();
                        var11.field1072 = field597;
                        var11.field1073 = var8;
                        var11.field1074 = var9;
                        var11.field1080 = field701;
                        var11.field1076 = field597.field3721;
                        class71.method1189(var11);
                    }
                    if (field701 != null && method5106(field597) != null) {
                        class298 var12 = class298.method8119(class296.field3184, field521.field1414);
                        var12.field3205.method8228(field597.field3757);
                        var12.field3205.method8301(field597.field3625);
                        var12.field3205.method8228(field701.field3625);
                        var12.field3205.method8430(field701.field3757);
                        var12.field3205.method8295(field597.field3624);
                        var12.field3205.method8296(field701.field3624);
                        field521.method2669(var12);
                    }
                } else if (this.method1215()) {
                    this.method1216(field706 + field699, field707 + field700);
                } else if (field679 > 0) {
                    int var13 = field706 + field699;
                    int var14 = field707 + field700;
                    class74 var15 = Statics.field2913;
                    if (var15 != null) {
                        method1123(var15.field910, var15.field915, var15.field909, var15.field911, var15.field913, var15.field914, var15.field912, var13, var14);
                    }
                    Statics.field2913 = null;
                }
                field597 = null;
            }
        } else if (Statics.field1556 > 1) {
            if (!field601 && field679 > 0) {
                int var16 = field706 + field699;
                int var17 = field707 + field700;
                class74 var18 = Statics.field2913;
                if (var18 != null) {
                    method1123(var18.field910, var18.field915, var18.field909, var18.field911, var18.field913, var18.field914, var18.field912, var16, var17);
                }
                Statics.field2913 = null;
            }
            field597 = null;
        }
    }

    @ObfuscatedName("ot.mq(IS)V")
    public static void method6349(int arg0) {
        Statics.field2913 = new class74();
        Statics.field2913.field910 = field663[arg0];
        Statics.field2913.field915 = field664[arg0];
        Statics.field2913.field909 = field665[arg0];
        Statics.field2913.field911 = field789[arg0];
        Statics.field2913.field913 = field667[arg0];
        Statics.field2913.field914 = field668[arg0];
        Statics.field2913.field912 = field669[arg0];
    }

    @ObfuscatedName("hy.mr(Lmt;I)V")
    public static void method3478(class333 arg0) {
        if (arg0 != null && field529 == arg0.field3687) {
            field719[arg0.field3627] = true;
        }
    }

    @ObfuscatedName("tu.mv(I)V")
    public static void method8164() {
        for (class87 var0 = (class87) field686.method7983(); var0 != null; var0 = (class87) field686.method7991()) {
            int var1 = var0.field1067;
            if (class333.method2001(var1)) {
                boolean var2 = true;
                class333[] var3 = Statics.field1046[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3623;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4819;
                    class333 var6 = class333.method3491(var5);
                    if (var6 != null) {
                        method3478(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("tm.my(Lmt;B)Lmt;")
    public static class333 method8117(class333 arg0) {
        class333 var1 = method5106(arg0);
        if (var1 == null) {
            var1 = arg0.field3732;
        }
        return var1;
    }

    @ObfuscatedName("dm.ms(II)V")
    public static final void method2260(int arg0) {
        if (!class333.method2001(arg0)) {
            return;
        }
        class333[] var1 = Statics.field1046[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class333 var3 = var1[var2];
            if (var3 != null) {
                var3.field3759 = 0;
                var3.field3760 = 0;
            }
        }
    }

    @ObfuscatedName("fh.mc([Lmt;II)V")
    public static final void method2960(class333[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class333 var3 = arg0[var2];
            if (var3 != null && var3.field3643 == arg1 && (!var3.field3623 || !method6020(var3))) {
                if (var3.field3626 == 0) {
                    if (!var3.field3623 && method6020(var3) && Statics.field3061 != var3) {
                        continue;
                    }
                    method2960(arg0, var3.field3624);
                    if (var3.field3761 != null) {
                        method2960(var3.field3761, var3.field3624);
                    }
                    class87 var4 = (class87) field686.method7981((long) var3.field3624);
                    if (var4 != null) {
                        int var5 = var4.field1067;
                        if (class333.method2001(var5)) {
                            method2960(Statics.field1046[var5], -1);
                        }
                    }
                }
                if (var3.field3626 == 6) {
                    if (var3.field3672 != -1 || var3.field3746 != -1) {
                        boolean var6 = method1187(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3746;
                        } else {
                            var7 = var3.field3672;
                        }
                        if (var7 != -1) {
                            class210 var8 = class210.method2904(var7);
                            if (var8.method3738()) {
                                var3.field3759 += field703;
                                int var9 = var8.method3739();
                                if (var3.field3759 >= var9) {
                                    var3.field3759 -= var8.field2284;
                                    if (var3.field3759 < 0 || var3.field3759 >= var9) {
                                        var3.field3759 = 0;
                                    }
                                }
                                method3478(var3);
                            } else {
                                var3.field3760 += field703;
                                while (var3.field3760 > var8.field2273[var3.field3759]) {
                                    var3.field3760 -= var8.field2273[var3.field3759];
                                    var3.field3759++;
                                    if (var3.field3759 >= var8.field2265.length) {
                                        var3.field3759 -= var8.field2284;
                                        if (var3.field3759 < 0 || var3.field3759 >= var8.field2265.length) {
                                            var3.field3759 = 0;
                                        }
                                    }
                                    method3478(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3681 != 0 && !var3.field3623) {
                        int var10 = var3.field3681 >> 16;
                        int var11 = var3.field3681 << 16 >> 16;
                        int var12 = field703 * var10;
                        int var13 = field703 * var11;
                        var3.field3664 = var3.field3664 + var12 & 0x7FF;
                        var3.field3677 = var3.field3677 + var13 & 0x7FF;
                        method3478(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ej.mz(II)V")
    public static final void method2695(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        class228.method4037((double) var3);
        ((class238) class228.field2511.field2783).method4386((double) var3);
        class208.method2468();
        Statics.field1686.method2364((double) var3);
    }

    @ObfuscatedName("gd.mb(I)I")
    public static final int method3221() {
        float var0 = 200.0F * ((float) Statics.field1686.method2365() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("nu.mo(IB)V")
    public static final void method6032(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field1686.method2367()) {
            return;
        }
        label36: {
            if (Statics.field1686.method2367() == 0) {
                boolean var2 = !class307.field3399.isEmpty();
                if (var2) {
                    class358 var3 = Statics.field70;
                    if (!class307.field3399.isEmpty()) {
                        ArrayList var4 = new ArrayList();
                        Iterator var5 = class307.field3399.iterator();
                        while (var5.hasNext()) {
                            class319 var6 = (class319) var5.next();
                            var6.field3509 = false;
                            var6.field3514 = false;
                            var6.field3516 = false;
                            var6.field3515 = var3;
                            var6.field3511 = var1;
                            var6.field3512 = 0.0F;
                            var4.add(var6);
                        }
                        class307.method2728(var4, class307.field3393, class307.field3403, class307.field3404, class307.field3408, false);
                    }
                    field575 = false;
                    break label36;
                }
            }
            if (var1 == 0) {
                class307.method3865(0, 0);
                field575 = false;
            } else {
                class307.method58(var1);
            }
        }
        Statics.field1686.method2417(var1);
    }

    @ObfuscatedName("qg.mg(II)V")
    public static final void method7221(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1686.method2368(var1);
    }

    @ObfuscatedName("ck.mt(IB)V")
    public static final void method1875(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1686.method2445(var1);
    }

    @ObfuscatedName("ch.mk(II)V")
    public static final void method1992(int arg0) {
        method8164();
        class70.method270();
        int var1 = class187.method3069(arg0).field1904;
        if (var1 == 0) {
            return;
        }
        int var2 = class323.field3532[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class228.method4037(0.9D);
                ((class238) class228.field2511.field2783).method4386(0.9D);
                class208.method2468();
                Statics.field1686.method2364(0.9D);
            }
            if (var2 == 2) {
                class228.method4037(0.8D);
                ((class238) class228.field2511.field2783).method4386(0.8D);
                class208.method2468();
                Statics.field1686.method2364(0.8D);
            }
            if (var2 == 3) {
                class228.method4037(0.7D);
                ((class238) class228.field2511.field2783).method4386(0.7D);
                class208.method2468();
                Statics.field1686.method2364(0.7D);
            }
            if (var2 == 4) {
                class228.method4037(0.6D);
                ((class238) class228.field2511.field2783).method4386(0.6D);
                class208.method2468();
                Statics.field1686.method2364(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method6032(255);
            }
            if (var2 == 1) {
                method6032(192);
            }
            if (var2 == 2) {
                method6032(128);
            }
            if (var2 == 3) {
                method6032(64);
            }
            if (var2 == 4) {
                method6032(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method7221(127);
            }
            if (var2 == 1) {
                method7221(96);
            }
            if (var2 == 2) {
                method7221(64);
            }
            if (var2 == 3) {
                method7221(32);
            }
            if (var2 == 4) {
                method7221(0);
            }
        }
        if (var1 == 5) {
            field660 = var2 == 1;
        }
        if (var1 == 6) {
            field689 = var2;
        }
        if (var1 == 9) {
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method1875(127);
            }
            if (var2 == 1) {
                method1875(96);
            }
            if (var2 == 2) {
                method1875(64);
            }
            if (var2 == 3) {
                method1875(32);
            }
            if (var2 == 4) {
                method1875(0);
            }
        }
        if (var1 == 17) {
            field694 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field545 = (class104) class374.method2465(class104.method3925(), var2);
            if (field545 == null) {
                field545 = class104.field1338;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field652 = -1;
            } else {
                field652 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field546 = (class104) class374.method2465(class104.method3925(), var2);
            if (field546 == null) {
                field546 = class104.field1338;
            }
        }
    }

    @ObfuscatedName("hn.ma(Lmt;I)V")
    public static final void method3488(class333 arg0) {
        int var1 = arg0.field3649;
        if (var1 == 324) {
            if (field721 == -1) {
                field721 = arg0.field3659;
                field803 = arg0.field3660;
            }
            if (field715.field3564 == 1) {
                arg0.field3659 = field721;
            } else {
                arg0.field3659 = field803;
            }
        } else if (var1 == 325) {
            if (field721 == -1) {
                field721 = arg0.field3659;
                field803 = arg0.field3660;
            }
            if (field715.field3564 == 1) {
                arg0.field3659 = field803;
            } else {
                arg0.field3659 = field721;
            }
        } else if (var1 == 327) {
            arg0.field3664 = 150;
            arg0.field3677 = (int) (Math.sin((double) field530 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3668 = 5;
            arg0.field3621 = 0;
        } else if (var1 == 328) {
            arg0.field3664 = 150;
            arg0.field3677 = (int) (Math.sin((double) field530 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3668 = 5;
            arg0.field3621 = 1;
        }
    }

    @ObfuscatedName("pl.ml(B)V")
    public static final void method6602() {
        class298 var0 = class298.method8119(class296.field3177, field521.field1414);
        field521.method2669(var0);
        class71.field865 = true;
        for (class87 var1 = (class87) field686.method7983(); var1 != null; var1 = (class87) field686.method7991()) {
            if (var1.field1068 == 0 || var1.field1068 == 3) {
                method2291(var1, true);
            }
        }
        if (field690 != null) {
            method3478(field690);
            field690 = null;
        }
        class71.field865 = false;
    }

    @ObfuscatedName("jj.me(IIII)Ldn;")
    public static final class87 method4669(int arg0, int arg1, int arg2) {
        class87 var3 = new class87();
        var3.field1067 = arg1;
        var3.field1068 = arg2;
        field686.method7990(var3, (long) arg0);
        method2260(arg1);
        class333 var4 = class333.method3491(arg0);
        method3478(var4);
        if (field690 != null) {
            method3478(field690);
            field690 = null;
        }
        Statics.method838(Statics.field1046[arg0 >> 16], var4, false);
        class71.method1137(arg1);
        if (field685 != -1) {
            method2094(field685, 1);
        }
        return var3;
    }

    @ObfuscatedName("dx.md(Ldn;ZI)V")
    public static final void method2291(class87 arg0, boolean arg1) {
        int var2 = arg0.field1067;
        int var3 = (int) arg0.field4819;
        arg0.method7662();
        if (arg1 && var2 != -1 && Statics.field3692[var2]) {
            Statics.field1047.method6130(var2);
            if (Statics.field1046[var2] != null) {
                for (int var4 = 0; var4 < Statics.field1046[var2].length; var4++) {
                    if (Statics.field1046[var2][var4] != null) {
                        Statics.field1046[var2][var4] = null;
                    }
                }
                Statics.field1046[var2] = null;
                Statics.field3692[var2] = false;
            }
        }
        for (class473 var5 = (class473) field732.method7983(); var5 != null; var5 = (class473) field732.method7991()) {
            if ((var5.field4819 >> 48 & 0xFFFFL) == (long) var2) {
                var5.method7662();
            }
        }
        class333 var6 = class333.method3491(var3);
        if (var6 != null) {
            method3478(var6);
        }
        if (field685 != -1) {
            method2094(field685, 1);
        }
    }

    @ObfuscatedName("rz.np(Lmt;B)Z")
    public static final boolean method7656(class333 arg0) {
        int var1 = arg0.field3649;
        if (var1 == 205) {
            field627 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field715.method5555(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field715.method5541(var4, var5 == 1);
        }
        if (var1 == 324) {
            field715.method5520(0);
        }
        if (var1 == 325) {
            field715.method5520(1);
        }
        if (var1 == 326) {
            class298 var6 = class298.method8119(class296.field3112, field521.field1414);
            field715.method5521(var6.field3205);
            field521.method2669(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.nb(Lmt;IIII)V")
    public static final void method305(class333 arg0, int arg1, int arg2, int arg3) {
        class322 var4 = arg0.method5847(false);
        if (var4 == null) {
            return;
        }
        if (field671 < 3) {
            Statics.field55.method8725(arg1, arg2, var4.field3523, var4.field3524, 25, 25, field654, 256, var4.field3526, var4.field3525);
        } else {
            class524.method8583(arg1, arg2, 0, var4.field3526, var4.field3525);
        }
    }

    @ObfuscatedName("ga.no(IIIILud;Lmi;I)V")
    public static final void method3070(int arg0, int arg1, int arg2, int arg3, class528 arg4, class322 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method634(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field654 & 0x7FF;
        int var8 = class228.field2509[var7];
        int var9 = class228.field2510[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3523 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field342.method8797(arg5.field3523 / 2 + arg0 - var17 / 2 + var15, arg5.field3524 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("bq.nh(IIIILud;Lmi;I)V")
    public static final void method634(int arg0, int arg1, int arg2, int arg3, class528 arg4, class322 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field654 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class228.field2509[var6];
        int var9 = class228.field2510[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8724(arg5.field3523 / 2 + var10 - arg4.field5165 / 2, arg5.field3524 / 2 - var11 - arg4.field5163 / 2, arg0, arg1, arg5.field3523, arg5.field3524, arg5.field3526, arg5.field3525);
        } else {
            arg4.method8812(arg5.field3523 / 2 + arg0 + var10 - arg4.field5165 / 2, arg5.field3524 / 2 + arg1 - var11 - arg4.field5163 / 2);
        }
    }

    @ObfuscatedName("ni.nv(B)V")
    public static final void method6030() {
        Iterator var0 = class111.field1405.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1139();
        }
        if (Statics.field128 != null) {
            Statics.field128.method7183();
        }
    }

    @ObfuscatedName("il.na(I)V")
    public static final void method4033() {
        field554 = field709;
        Statics.field4776 = true;
    }

    @ObfuscatedName("lv.ns(Ljava/lang/String;B)V")
    public static final void method5176(String arg0) {
        if (Statics.field128 != null) {
            class298 var1 = class298.method8119(class296.field3142, field521.field1414);
            var1.field3205.method8227(class514.method8096(arg0));
            var1.field3205.method8234(arg0);
            field521.method2669(var1);
        }
    }

    @ObfuscatedName("fe.nc(Ljava/lang/String;I)V")
    public static final void method2994(String arg0) {
        if (!arg0.equals("")) {
            class298 var1 = class298.method8119(class296.field3110, field521.field1414);
            var1.field3205.method8227(class514.method8096(arg0));
            var1.field3205.method8234(arg0);
            field521.method2669(var1);
        }
    }

    @ObfuscatedName("ik.ni(B)V")
    public static final void method4187() {
        class298 var0 = class298.method8119(class296.field3110, field521.field1414);
        var0.field3205.method8227(0);
        field521.method2669(var0);
    }

    @ObfuscatedName("client.nu(III)V")
    public static final void method1715(int arg0, int arg1) {
        class164 var2 = arg0 >= 0 ? field758[arg0] : Statics.field2860;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3105()) {
            return;
        }
        class146 var3 = (class146) var2.field1775.get(arg1);
        if (var3.field1656 != -1) {
            return;
        }
        String var4 = var3.field1654.method8881();
        class298 var5 = class298.method8119(class296.field3107, field521.field1414);
        var5.field3205.method8227(3 + class514.method8096(var4));
        var5.field3205.method8227(arg0);
        var5.field3205.method8228(arg1);
        var5.field3205.method8234(var4);
        field521.method2669(var5);
    }

    @ObfuscatedName("tw.nk(III)V")
    public static final void method8121(int arg0, int arg1) {
        if (field758[arg0] == null || arg1 < 0 || arg1 >= field758[arg0].method3105()) {
            return;
        }
        class146 var2 = (class146) field758[arg0].field1775.get(arg1);
        if (var2.field1656 != -1) {
            return;
        }
        class298 var3 = class298.method8119(class296.field3122, field521.field1414);
        var3.field3205.method8227(3 + class514.method8096(var2.field1654.method8881()));
        var3.field3205.method8227(arg0);
        var3.field3205.method8228(arg1);
        var3.field3205.method8234(var2.field1654.method8881());
        field521.method2669(var3);
    }

    @ObfuscatedName("fk.nm(IIZI)V")
    public static final void method2992(int arg0, int arg1, boolean arg2) {
        if (field758[arg0] == null || arg1 < 0 || arg1 >= field758[arg0].method3105()) {
            return;
        }
        class146 var3 = (class146) field758[arg0].field1775.get(arg1);
        class298 var4 = class298.method8119(class296.field3140, field521.field1414);
        var4.field3205.method8227(4 + class514.method8096(var3.field1654.method8881()));
        var4.field3205.method8227(arg0);
        var4.field3205.method8228(arg1);
        var4.field3205.method8233(arg2);
        var4.field3205.method8234(var3.field1654.method8881());
        field521.method2669(var4);
    }

    @ObfuscatedName("es.nt(Lmt;B)I")
    public static int method2735(class333 arg0) {
        class473 var1 = (class473) field732.method7981(((long) arg0.field3624 << 32) + (long) arg0.field3625);
        return var1 == null ? arg0.field3698 : var1.field4817;
    }

    @ObfuscatedName("kl.nz(Lmt;B)Lmt;")
    public static class333 method5106(class333 arg0) {
        int var1 = class334.method5164(method2735(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class333.method3491(arg0.field3643);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("no.nr(Lmt;I)Z")
    public static boolean method6020(class333 arg0) {
        return arg0.field3644;
    }

    @ObfuscatedName("iy.nw(Lmt;II)Ljava/lang/String;")
    public static String method3793(class333 arg0, int arg1) {
        int var2 = method2735(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3731 == null) {
            return null;
        } else if (arg0.field3665 == null || arg0.field3665.length <= arg1 || arg0.field3665[arg1] == null || arg0.field3665[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3665[arg1];
        }
    }

    @ObfuscatedName("ax.nn(Lmt;I)Ljava/lang/String;")
    public static String method167(class333 arg0) {
        if (class334.method5039(method2735(arg0)) == 0) {
            return null;
        } else if (arg0.field3710 == null || arg0.field3710.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3710;
        }
    }

    @ObfuscatedName("ei.nl(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2720(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field519 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field519 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field519 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field519 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field519 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field264 != null) {
            var3 = "/p=" + Statics.field264;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field884 + "/a=" + Statics.field300 + var3 + "/";
    }

    @ObfuscatedName("rj.ny(Ljava/lang/String;I)V")
    public static void method7469(String arg0) {
        Statics.field264 = arg0;
        try {
            String var1 = Statics.field1352.getParameter(Integer.toString(18));
            String var2 = Statics.field1352.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class303.method2705() + 94608000000L;
                class338.field3791.setTime(new Date(var6));
                int var8 = class338.field3791.get(7);
                int var9 = class338.field3791.get(5);
                int var10 = class338.field3791.get(2);
                int var11 = class338.field3791.get(1);
                int var12 = class338.field3791.get(11);
                int var13 = class338.field3791.get(12);
                int var14 = class338.field3791.get(13);
                String var15 = class338.field3789[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class338.field3790[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class27.method374(Statics.field1352, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("fr.nx(Ljava/lang/String;ZB)V")
    public static void method2979(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2672; var5++) {
            class208 var6 = class208.method2788(var5);
            if ((!arg1 || var6.field2238) && var6.field2229 == -1 && var6.field2228.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1844 = -1;
                    Statics.field1083 = null;
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
        Statics.field1083 = var3;
        Statics.field1729 = 0;
        Statics.field1844 = var4;
        String[] var9 = new String[Statics.field1844];
        for (int var10 = 0; var10 < Statics.field1844; var10++) {
            var9[var10] = class208.method2788(var3[var10]).field2228;
        }
        class511.method7707(var9, Statics.field1083);
    }

    @ObfuscatedName("ot.nd([BII)V")
    public static void method6350(byte[] arg0, int arg1) {
        if (field573 == null) {
            field573 = new byte[24];
        }
        class411.method6978(arg0, arg1, field573, 0, 24);
    }

    @ObfuscatedName("pn.nq(Lty;II)V")
    public static void method6951(class514 arg0, int arg1) {
        method6350(arg0.field5070, arg1);
        Statics.method4989(arg0, arg1);
    }

    @ObfuscatedName("jk.ng(Lty;I)V")
    public static void method4578(class514 arg0) {
        if (field573 == null) {
            byte[] var1 = class174.method3862();
            arg0.method8237(var1, 0, var1.length);
        } else {
            arg0.method8237(field573, 0, field573.length);
        }
    }

    @ObfuscatedName("client.ne(I)Lui;")
    public class538 method1220() {
        return Statics.field1605 == null ? null : Statics.field1605.field1115;
    }

    @ObfuscatedName("ga.nj(I)Z")
    public static boolean method3068() {
        return field693 >= 2;
    }

    @ObfuscatedName("qk.ou(IS)V")
    public static void method7191(int arg0) {
        field606 = arg0;
    }

    @ObfuscatedName("eq.ow(I)V")
    public static void method2741() {
        if (field606 == 1) {
            field614 = true;
        }
    }

    @ObfuscatedName("rk.ok(I)V")
    public static void method7446() {
        if (!field614 || Statics.field1605 == null) {
            return;
        }
        int var0 = Statics.field1605.field1188[0];
        int var1 = Statics.field1605.field1255[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field4805 = Statics.field1605.field1192;
        int var2 = method5254(Statics.field1605.field1192, Statics.field1605.field1206, Statics.field265) - field607;
        if (var2 < Statics.field1109) {
            Statics.field1109 = var2;
        }
        Statics.field261 = Statics.field1605.field1206;
        field614 = false;
    }

    @ObfuscatedName("qg.ol(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method7230(String arg0) {
        class355[] var1 = class355.method2275();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class355 var3 = var1[var2];
            if (var3.field4233 != -1 && arg0.startsWith(class102.method2158(var3.field4233))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4233).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ea.ov(II)V")
    public static void method2782(int arg0) {
        if (field552 != arg0) {
            field552 = arg0;
        }
    }

    @ObfuscatedName("aq.oq(ZI)V")
    public static void method93(boolean arg0) {
        field660 = arg0;
    }

    @ObfuscatedName("sc.oe(II)Ltx;")
    public static class508 method7692(int arg0) {
        class508 var1 = (class508) field560.method5152((long) arg0);
        if (var1 == null) {
            var1 = new class508(Statics.field1853, class510.method4557(arg0), class510.method1171(arg0));
            field560.method5149(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("gd.os(IB)Ltx;")
    public static class508 method3228(int arg0) {
        class508 var1 = (class508) field809.method5152((long) arg0);
        if (var1 == null) {
            var1 = new class508(Statics.field1853, arg0);
        }
        return var1;
    }

    @ObfuscatedName("fv.oi(I)Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard method2970() {
        return Statics.field1352.method471();
    }

    @ObfuscatedName("at.ot(IB)V")
    public static void method106(int arg0) {
        class210 var1 = class210.method2904(arg0);
        if (var1.method3738() && class210.method5040(var1.field2267) == 2) {
            field655.add(var1.field2267);
        }
    }

    @ObfuscatedName("fr.ox(I)V")
    public static void method2971() {
        for (int var0 = 0; var0 < field655.size(); var0++) {
            if (class210.method5040((Integer) field655.get(var0)) != 2) {
                field655.remove(var0);
                var0--;
            }
        }
    }
}

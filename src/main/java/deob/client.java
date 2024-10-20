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
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class442, OAuthApi, class326 {

    @ObfuscatedName("client.bq")
    public static boolean field537 = true;

    @ObfuscatedName("client.bw")
    public static int field519 = 1;

    @ObfuscatedName("client.ce")
    public static int field520 = 0;

    @ObfuscatedName("client.cw")
    public static int field529 = 0;

    @ObfuscatedName("client.cg")
    public static boolean field522 = false;

    @ObfuscatedName("client.cq")
    public static boolean field748 = false;

    @ObfuscatedName("client.cn")
    public static int field718 = -1;

    @ObfuscatedName("client.ck")
    public static int field525 = -1;

    @ObfuscatedName("client.cr")
    public static int field526 = -1;

    @ObfuscatedName("client.cs")
    public static boolean field775 = false;

    @ObfuscatedName("client.cm")
    public static int field528 = 217;

    @ObfuscatedName("client.dm")
    public static int field530 = 0;

    @ObfuscatedName("client.ds")
    public static boolean field616 = false;

    @ObfuscatedName("client.eo")
    public static boolean field532 = true;

    @ObfuscatedName("client.em")
    public static int field533 = 0;

    @ObfuscatedName("client.el")
    public static long field570 = -1L;

    @ObfuscatedName("client.eg")
    public static int field653 = -1;

    @ObfuscatedName("client.ei")
    public static int field598 = -1;

    @ObfuscatedName("client.ex")
    public static long field709 = -1L;

    @ObfuscatedName("client.ek")
    public static boolean field538 = true;

    @ObfuscatedName("client.er")
    public static int field640 = 0;

    @ObfuscatedName("client.ez")
    public static int field540 = 0;

    @ObfuscatedName("client.en")
    public static int field541 = 0;

    @ObfuscatedName("client.es")
    public static int field542 = 0;

    @ObfuscatedName("client.eq")
    public static int field584 = 0;

    @ObfuscatedName("client.ej")
    public static int field544 = 0;

    @ObfuscatedName("client.et")
    public static int field545 = 0;

    @ObfuscatedName("client.eh")
    public static int field630 = 0;

    @ObfuscatedName("client.eb")
    public static int field798 = 0;

    @ObfuscatedName("client.ee")
    public static class106 field695 = class106.field1345;

    @ObfuscatedName("client.ea")
    public static class106 field804 = class106.field1345;

    @ObfuscatedName("client.ey")
    public static boolean field550 = false;

    @ObfuscatedName("client.fl")
    public static class95 field578 = class95.field1162;

    @ObfuscatedName("client.fd")
    public static int field552 = 0;

    @ObfuscatedName("client.fi")
    public static int field553 = 0;

    @ObfuscatedName("client.gf")
    public static int field554 = 0;

    @ObfuscatedName("client.gm")
    public static int field732 = 0;

    @ObfuscatedName("client.gb")
    public static int field556 = 0;

    @ObfuscatedName("client.gx")
    public static int field733 = 0;

    @ObfuscatedName("client.gp")
    public static int field558 = 0;

    @ObfuscatedName("client.gd")
    public static class142 field559 = class142.field1631;

    @ObfuscatedName("client.gz")
    public static class535 field560 = class535.field5200;

    @ObfuscatedName("client.hi")
    public String field561;

    @ObfuscatedName("client.hf")
    public class15 field698;

    @ObfuscatedName("client.hu")
    public class19 field563;

    @ObfuscatedName("client.hy")
    public OtlTokenRequester field564;

    @ObfuscatedName("client.hl")
    public Future field741;

    @ObfuscatedName("client.hm")
    public boolean field566 = false;

    @ObfuscatedName("client.hd")
    public int field567 = 0;

    @ObfuscatedName("client.hs")
    public class19 field568;

    @ObfuscatedName("client.hk")
    public RefreshAccessTokenRequester field569;

    @ObfuscatedName("client.hn")
    public Future field608;

    @ObfuscatedName("client.ha")
    public static final String field571;

    @ObfuscatedName("client.hh")
    public static final String field572;

    @ObfuscatedName("client.hr")
    public static boolean field573;

    @ObfuscatedName("client.iv")
    public static class80 field574;

    @ObfuscatedName("client.ie")
    public class530 field765;

    @ObfuscatedName("client.in")
    public class8 field576;

    @ObfuscatedName("client.is")
    public long field577 = -1L;

    @ObfuscatedName("client.im")
    public static byte[] field821;

    @ObfuscatedName("client.iy")
    public static class103[] field705;

    @ObfuscatedName("client.io")
    public static int field668;

    @ObfuscatedName("client.if")
    public static int[] field581;

    @ObfuscatedName("client.ij")
    public static int field582;

    @ObfuscatedName("client.ib")
    public static int[] field534;

    @ObfuscatedName("client.it")
    public static String field773;

    @ObfuscatedName("client.ic")
    public static final class114 field579;

    @ObfuscatedName("client.ig")
    public static int field585;

    @ObfuscatedName("client.ip")
    public static boolean field725;

    @ObfuscatedName("client.ia")
    public static class429 field587;

    @ObfuscatedName("client.ji")
    public static HashMap field637;

    @ObfuscatedName("client.jl")
    public static int field589;

    @ObfuscatedName("client.jy")
    public static int field590;

    @ObfuscatedName("client.jv")
    public static int field591;

    @ObfuscatedName("client.ja")
    public static int field592;

    @ObfuscatedName("client.je")
    public static int field546;

    @ObfuscatedName("client.jm")
    public static class228[] field594;

    @ObfuscatedName("client.jb")
    public static boolean field742;

    @ObfuscatedName("client.jg")
    public static int[][][] field596;

    @ObfuscatedName("client.km")
    public static final int[] field597;

    @ObfuscatedName("client.kq")
    public static int field710;

    @ObfuscatedName("client.kp")
    public static int field599;

    @ObfuscatedName("client.kf")
    public static int field802;

    @ObfuscatedName("client.kw")
    public static int field557;

    @ObfuscatedName("client.ky")
    public static int field602;

    @ObfuscatedName("client.kv")
    public static boolean field583;

    @ObfuscatedName("client.kx")
    public static int field604;

    @ObfuscatedName("client.ll")
    public static int field605;

    @ObfuscatedName("client.lh")
    public static int field650;

    @ObfuscatedName("client.lm")
    public static int field679;

    @ObfuscatedName("client.lj")
    public static int field683;

    @ObfuscatedName("client.lf")
    public static int field609;

    @ObfuscatedName("client.li")
    public static int field610;

    @ObfuscatedName("client.lc")
    public static int field611;

    @ObfuscatedName("client.lk")
    public static int field612;

    @ObfuscatedName("client.ls")
    public static int field613;

    @ObfuscatedName("client.ld")
    public static int field614;

    @ObfuscatedName("client.lr")
    public static int field615;

    @ObfuscatedName("client.lb")
    public static int field810;

    @ObfuscatedName("client.lp")
    public static int field617;

    @ObfuscatedName("client.lt")
    public static int field548;

    @ObfuscatedName("client.le")
    public static boolean field619;

    @ObfuscatedName("client.lg")
    public static int field620;

    @ObfuscatedName("client.ln")
    public static boolean field551;

    @ObfuscatedName("client.lq")
    public static int field622;

    @ObfuscatedName("client.lx")
    public static int field618;

    @ObfuscatedName("client.lu")
    public static int field808;

    @ObfuscatedName("client.mi")
    public static int[] field625;

    @ObfuscatedName("client.ma")
    public static int[] field626;

    @ObfuscatedName("client.mj")
    public static int[] field627;

    @ObfuscatedName("client.mm")
    public static int[] field628;

    @ObfuscatedName("client.mc")
    public static int[] field629;

    @ObfuscatedName("client.mw")
    public static int[] field825;

    @ObfuscatedName("client.mx")
    public static int[][] field631;

    @ObfuscatedName("client.mr")
    public static int[] field734;

    @ObfuscatedName("client.mt")
    public static String[] field633;

    @ObfuscatedName("client.mf")
    public static int[][] field634;

    @ObfuscatedName("client.mz")
    public static int field635;

    @ObfuscatedName("client.mu")
    public static int field636;

    @ObfuscatedName("client.mq")
    public static int field654;

    @ObfuscatedName("client.mh")
    public static int field536;

    @ObfuscatedName("client.ml")
    public static int field639;

    @ObfuscatedName("client.mn")
    public static int field762;

    @ObfuscatedName("client.mk")
    public static int field641;

    @ObfuscatedName("client.ms")
    public static boolean field642;

    @ObfuscatedName("client.me")
    public static int field791;

    @ObfuscatedName("client.my")
    public static boolean field814;

    @ObfuscatedName("client.mp")
    public static class94[] field726;

    @ObfuscatedName("client.mo")
    public static int field646;

    @ObfuscatedName("client.mg")
    public static int field647;

    @ObfuscatedName("client.nt")
    public static long field539;

    @ObfuscatedName("client.nv")
    public static boolean field649;

    @ObfuscatedName("client.nb")
    public static int field823;

    @ObfuscatedName("client.nm")
    public static int field651;

    @ObfuscatedName("client.nc")
    public static int[] field652;

    @ObfuscatedName("client.nk")
    public static final int[] field747;

    @ObfuscatedName("client.nn")
    public static String[] field779;

    @ObfuscatedName("client.na")
    public static boolean[] field655;

    @ObfuscatedName("client.nh")
    public static int[] field656;

    @ObfuscatedName("client.nw")
    public static int field657;

    @ObfuscatedName("client.ny")
    public static class393[][][] field688;

    @ObfuscatedName("client.nl")
    public static class393 field659;

    @ObfuscatedName("client.nu")
    public static class393 field660;

    @ObfuscatedName("client.nj")
    public static class393 field661;

    @ObfuscatedName("client.nr")
    public static int[] field565;

    @ObfuscatedName("client.ne")
    public static int[] field658;

    @ObfuscatedName("client.nq")
    public static int[] field664;

    @ObfuscatedName("client.ng")
    public static boolean field746;

    @ObfuscatedName("client.np")
    public static boolean field666;

    @ObfuscatedName("client.ol")
    public static int field667;

    @ObfuscatedName("client.oe")
    public static int[] field759;

    @ObfuscatedName("client.ob")
    public static int[] field669;

    @ObfuscatedName("client.ok")
    public static int[] field670;

    @ObfuscatedName("client.ou")
    public static int[] field671;

    @ObfuscatedName("client.om")
    public static int[] field672;

    @ObfuscatedName("client.oo")
    public static String[] field673;

    @ObfuscatedName("client.ox")
    public static String[] field674;

    @ObfuscatedName("client.oc")
    public static boolean[] field675;

    @ObfuscatedName("client.oz")
    public static boolean field676;

    @ObfuscatedName("client.op")
    public static boolean field621;

    @ObfuscatedName("client.ov")
    public static boolean field716;

    @ObfuscatedName("client.od")
    public static int field623;

    @ObfuscatedName("client.og")
    public static int field680;

    @ObfuscatedName("client.on")
    public static int field789;

    @ObfuscatedName("client.ot")
    public static int field531;

    @ObfuscatedName("client.oa")
    public static int field580;

    @ObfuscatedName("client.pc")
    public static boolean field685;

    @ObfuscatedName("client.pf")
    public static int field586;

    @ObfuscatedName("client.pj")
    public static int field687;

    @ObfuscatedName("client.ph")
    public static String field752;

    @ObfuscatedName("client.ps")
    public static String field689;

    @ObfuscatedName("client.pt")
    public static int field797;

    @ObfuscatedName("client.pw")
    public static class504 field691;

    @ObfuscatedName("client.px")
    public static int field692;

    @ObfuscatedName("client.pq")
    public static int field693;

    @ObfuscatedName("client.pd")
    public static int field694;

    @ObfuscatedName("client.pm")
    public static class347 field624;

    @ObfuscatedName("client.pn")
    public static int field696;

    @ObfuscatedName("client.pu")
    public static int field697;

    @ObfuscatedName("client.pp")
    public static int field776;

    @ObfuscatedName("client.pb")
    public static int field699;

    @ObfuscatedName("client.pe")
    public static boolean field700;

    @ObfuscatedName("client.pk")
    public static class347 field547;

    @ObfuscatedName("client.pr")
    public static class347 field702;

    @ObfuscatedName("client.pi")
    public static class347 field703;

    @ObfuscatedName("client.pz")
    public static int field704;

    @ObfuscatedName("client.qi")
    public static int field524;

    @ObfuscatedName("client.qb")
    public static class347 field706;

    @ObfuscatedName("client.qw")
    public static boolean field648;

    @ObfuscatedName("client.qk")
    public static int field751;

    @ObfuscatedName("client.qg")
    public static int field749;

    @ObfuscatedName("client.qm")
    public static boolean field686;

    @ObfuscatedName("client.qz")
    public static int field555;

    @ObfuscatedName("client.ql")
    public static int field712;

    @ObfuscatedName("client.qn")
    public static boolean field713;

    @ObfuscatedName("client.qr")
    public static int field665;

    @ObfuscatedName("client.qy")
    public static int[] field717;

    @ObfuscatedName("client.qf")
    public static int field632;

    @ObfuscatedName("client.qv")
    public static int[] field677;

    @ObfuscatedName("client.qa")
    public static int field603;

    @ObfuscatedName("client.qs")
    public static int[] field719;

    @ObfuscatedName("client.qp")
    public static int field606;

    @ObfuscatedName("client.qe")
    public static int[] field721;

    @ObfuscatedName("client.qd")
    public static int field722;

    @ObfuscatedName("client.qu")
    public static int field723;

    @ObfuscatedName("client.qc")
    public static int field724;

    @ObfuscatedName("client.rt")
    public static int field711;

    @ObfuscatedName("client.rl")
    public static int field643;

    @ObfuscatedName("client.rq")
    public static int field518;

    @ObfuscatedName("client.rr")
    public static int field728;

    @ObfuscatedName("client.rm")
    public static int field745;

    @ObfuscatedName("client.rp")
    public static int field730;

    @ObfuscatedName("client.re")
    public static int field731;

    @ObfuscatedName("client.rc")
    public static class548 field786;

    @ObfuscatedName("client.rj")
    public static class393 field707;

    @ObfuscatedName("client.rs")
    public static class393 field543;

    @ObfuscatedName("client.rw")
    public static class393 field735;

    @ObfuscatedName("client.rh")
    public static class393 field535;

    @ObfuscatedName("client.ru")
    public static class504 field737;

    @ObfuscatedName("client.rk")
    public static int field562;

    @ObfuscatedName("client.rf")
    public static int field739;

    @ObfuscatedName("client.ro")
    public static boolean[] field740;

    @ObfuscatedName("client.rd")
    public static boolean[] field736;

    @ObfuscatedName("client.rb")
    public static boolean[] field678;

    @ObfuscatedName("client.rz")
    public static int[] field743;

    @ObfuscatedName("client.rg")
    public static int[] field744;

    @ObfuscatedName("client.sz")
    public static int[] field521;

    @ObfuscatedName("client.sr")
    public static int[] field774;

    @ObfuscatedName("client.sm")
    public static int field720;

    @ObfuscatedName("client.sw")
    public static long field701;

    @ObfuscatedName("client.sl")
    public static boolean field684;

    @ObfuscatedName("client.sy")
    public static int[] field750;

    @ObfuscatedName("client.sf")
    public static int field729;

    @ObfuscatedName("client.sg")
    public static int field809;

    @ObfuscatedName("client.sb")
    public static String field753;

    @ObfuscatedName("client.se")
    public static long[] field754;

    @ObfuscatedName("client.ss")
    public static int field755;

    @ObfuscatedName("client.sj")
    public static class227 field756;

    @ObfuscatedName("client.sn")
    public static class225 field757;

    @ObfuscatedName("client.sk")
    public static int field758;

    @ObfuscatedName("client.so")
    public static int[] field662;

    @ObfuscatedName("client.sc")
    public static int[] field760;

    @ObfuscatedName("client.sp")
    public static long field761;

    @ObfuscatedName("client.tu")
    public static class157[] field607;

    @ObfuscatedName("client.tc")
    public static class166[] field763;

    @ObfuscatedName("client.tm")
    public static int field764;

    @ObfuscatedName("client.tp")
    public static int field600;

    @ObfuscatedName("client.tf")
    public static int[] field766;

    @ObfuscatedName("client.ts")
    public static int[] field767;

    @ObfuscatedName("client.ty")
    public static class544[] field768;

    @ObfuscatedName("client.ta")
    public static int field527;

    @ObfuscatedName("client.te")
    public static int field770;

    @ObfuscatedName("client.tg")
    public static int field771;

    @ObfuscatedName("client.tk")
    public static boolean field772;

    @ObfuscatedName("client.uz")
    public static int field645;

    @ObfuscatedName("client.uq")
    public static int[] field813;

    @ObfuscatedName("client.ug")
    public static int[] field575;

    @ObfuscatedName("client.uu")
    public static int[] field601;

    @ObfuscatedName("client.ua")
    public static int[] field777;

    @ObfuscatedName("client.um")
    public static class40[] field778;

    @ObfuscatedName("client.ub")
    public static boolean field769;

    @ObfuscatedName("client.uk")
    public static boolean field780;

    @ObfuscatedName("client.uh")
    public static boolean field781;

    @ObfuscatedName("client.uw")
    public static boolean field782;

    @ObfuscatedName("client.uf")
    public static class495 field783;

    @ObfuscatedName("client.un")
    public static class494 field784;

    @ObfuscatedName("client.ud")
    public static class494 field785;

    @ObfuscatedName("client.ue")
    public static boolean field727;

    @ObfuscatedName("client.vf")
    public static boolean[] field787;

    @ObfuscatedName("client.vj")
    public static int[] field788;

    @ObfuscatedName("client.vu")
    public static int[] field681;

    @ObfuscatedName("client.ve")
    public static int[] field790;

    @ObfuscatedName("client.vt")
    public static int[] field708;

    @ObfuscatedName("client.vm")
    public static short field792;

    @ObfuscatedName("client.vc")
    public static short field793;

    @ObfuscatedName("client.vs")
    public static short field794;

    @ObfuscatedName("client.vq")
    public static short field795;

    @ObfuscatedName("client.vw")
    public static short field796;

    @ObfuscatedName("client.vy")
    public static short field663;

    @ObfuscatedName("client.vv")
    public static short field595;

    @ObfuscatedName("client.vo")
    public static short field799;

    @ObfuscatedName("client.vg")
    public static int field800;

    @ObfuscatedName("client.vp")
    public static int field801;

    @ObfuscatedName("client.vn")
    public static int field523;

    @ObfuscatedName("client.vl")
    public static int field803;

    @ObfuscatedName("client.vx")
    public static int field593;

    @ObfuscatedName("client.vi")
    public static class344 field805;

    @ObfuscatedName("client.wu")
    public static int field806;

    @ObfuscatedName("client.ww")
    public static int field807;

    @ObfuscatedName("client.wy")
    public static class491 field738;

    @ObfuscatedName("client.wa")
    public static class383[] field715;

    @ObfuscatedName("client.wg")
    public static class68 field682;

    @ObfuscatedName("client.wi")
    public static class439 field811;

    @ObfuscatedName("client.wt")
    public static class302 field812;

    @ObfuscatedName("client.wq")
    public static class302 field690;

    @ObfuscatedName("client.ws")
    public static int field588;

    @ObfuscatedName("client.wp")
    public static int field815;

    @ObfuscatedName("client.wz")
    public static List field816;

    @ObfuscatedName("client.wk")
    public static final class233 field817;

    @ObfuscatedName("client.wc")
    public static ArrayList field818;

    @ObfuscatedName("client.xp")
    public static int field819;

    @ObfuscatedName("client.xy")
    public static int field820;

    @ObfuscatedName("client.xx")
    public static final class67 field644;

    @ObfuscatedName("client.xo")
    public static int[] field822;

    @ObfuscatedName("client.xu")
    public static int[] field638;

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
        field571 = class401.method4056(var1);
        field572 = class401.method4056(class399.method1850("com_jagex_auth_desktop_runelite:public"));
        field573 = false;
        field574 = new class80();
        field821 = null;
        field705 = new class103[65536];
        field668 = 0;
        field581 = new int[65536];
        field582 = 0;
        field534 = new int[250];
        field579 = new class114();
        field585 = 0;
        field725 = false;
        field587 = new class429();
        field637 = new HashMap();
        field589 = 0;
        field590 = 1;
        field591 = 0;
        field592 = 1;
        field546 = 0;
        field594 = new class228[4];
        field742 = false;
        field596 = new int[4][13][13];
        field597 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field710 = 0;
        field599 = 2301979;
        field802 = 5063219;
        field557 = 3353893;
        field602 = 7759444;
        field583 = false;
        field604 = 0;
        field605 = 128;
        field650 = 0;
        field679 = 0;
        field683 = 0;
        field609 = 0;
        field610 = 0;
        field611 = 0;
        field612 = 50;
        field613 = 0;
        field614 = 0;
        field615 = 0;
        field810 = 12;
        field617 = 6;
        field548 = 0;
        field619 = false;
        field620 = 0;
        field551 = false;
        field622 = 0;
        field618 = 0;
        field808 = 50;
        field625 = new int[field808];
        field626 = new int[field808];
        field627 = new int[field808];
        field628 = new int[field808];
        field629 = new int[field808];
        field825 = new int[field808];
        field631 = new int[field808][];
        field734 = new int[field808];
        field633 = new String[field808];
        field634 = new int[104][104];
        field635 = 0;
        field636 = -1;
        field654 = -1;
        field536 = 0;
        field639 = 0;
        field762 = 0;
        field641 = 0;
        field642 = true;
        field791 = 0;
        field814 = true;
        field726 = new class94[2048];
        field646 = -1;
        field647 = 0;
        field539 = -1L;
        field649 = true;
        field823 = 0;
        field651 = 0;
        field652 = new int[1000];
        field747 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field779 = new String[8];
        field655 = new boolean[8];
        field656 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field657 = -1;
        field688 = new class393[4][104][104];
        field659 = new class393();
        field660 = new class393();
        field661 = new class393();
        field565 = new int[25];
        field658 = new int[25];
        field664 = new int[25];
        field746 = false;
        field666 = false;
        field667 = 0;
        field759 = new int[500];
        field669 = new int[500];
        field670 = new int[500];
        field671 = new int[500];
        field672 = new int[500];
        field673 = new String[500];
        field674 = new String[500];
        field675 = new boolean[500];
        field676 = false;
        field621 = false;
        field716 = true;
        field623 = -1;
        field680 = -1;
        field789 = 0;
        field531 = 50;
        field580 = 0;
        field773 = null;
        field685 = false;
        field586 = -1;
        field687 = -1;
        field752 = null;
        field689 = null;
        field797 = -1;
        field691 = new class504(8);
        field692 = 0;
        field693 = -1;
        field694 = 0;
        field624 = null;
        field696 = 0;
        field697 = 0;
        field776 = 0;
        field699 = -1;
        field700 = false;
        field547 = null;
        field702 = null;
        field703 = null;
        field704 = 0;
        field524 = 0;
        field706 = null;
        field648 = false;
        field751 = -1;
        field749 = -1;
        field686 = false;
        field555 = -1;
        field712 = -1;
        field713 = false;
        field665 = 1;
        field717 = new int[32];
        field632 = 0;
        field677 = new int[32];
        field603 = 0;
        field719 = new int[32];
        field606 = 0;
        field721 = new int[32];
        field722 = 0;
        field723 = 0;
        field724 = 0;
        field711 = 0;
        field643 = 0;
        field518 = 0;
        field728 = 0;
        field745 = 0;
        field730 = 0;
        field731 = 0;
        field786 = new class548();
        field707 = new class393();
        field543 = new class393();
        field735 = new class393();
        field535 = new class393();
        field737 = new class504(512);
        field562 = 0;
        field739 = -2;
        field740 = new boolean[100];
        field736 = new boolean[100];
        field678 = new boolean[100];
        field743 = new int[100];
        field744 = new int[100];
        field521 = new int[100];
        field774 = new int[100];
        field720 = 0;
        field701 = 0L;
        field684 = true;
        field750 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field729 = 0;
        field809 = 0;
        field753 = "";
        field754 = new long[100];
        field755 = 0;
        field756 = new class227();
        field757 = new class225();
        field758 = 0;
        field662 = new int[128];
        field760 = new int[128];
        field761 = -1L;
        field607 = new class157[4];
        field763 = new class166[4];
        field764 = -1;
        field600 = 0;
        field766 = new int[1000];
        field767 = new int[1000];
        field768 = new class544[1000];
        field527 = 0;
        field770 = 0;
        field771 = 0;
        field772 = false;
        field645 = 0;
        field813 = new int[50];
        field575 = new int[50];
        field601 = new int[50];
        field777 = new int[50];
        field778 = new class40[50];
        field769 = false;
        field780 = false;
        field781 = false;
        field782 = false;
        field783 = null;
        field784 = null;
        field785 = null;
        field727 = false;
        field787 = new boolean[5];
        field788 = new int[5];
        field681 = new int[5];
        field790 = new int[5];
        field708 = new int[5];
        field792 = 256;
        field793 = 205;
        field794 = 256;
        field795 = 320;
        field796 = 1;
        field663 = 32767;
        field595 = 1;
        field799 = 32767;
        field800 = 0;
        field801 = 0;
        field523 = 0;
        field803 = 0;
        field593 = 0;
        field805 = new class344();
        field806 = -1;
        field807 = -1;
        field738 = new class489();
        field715 = new class383[8];
        field682 = new class68();
        field811 = new class439(8, class437.field4652);
        field812 = new class302(64);
        field690 = new class302(64);
        field588 = -1;
        field815 = -1;
        field816 = new ArrayList();
        field817 = new class233();
        field818 = new ArrayList(10);
        field819 = 0;
        field820 = 0;
        field644 = new class67();
        field822 = new int[50];
        field638 = new int[50];
    }

    @ObfuscatedName("fp.gr(I)Ltu;")
    public static class498 method3009() {
        return Statics.field4641;
    }

    @ObfuscatedName("client.bl(I)V")
    public final void method510() {
    }

    public final void init() {
        if (!this.method518()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class104.field1330)) {
                            field522 = true;
                        } else {
                            field522 = false;
                        }
                        break;
                    case 4:
                        if (field525 == -1) {
                            field525 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field520 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field2910 = class389.method6502(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field326 = class362.method7155(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class104.field1330)) {
                        }
                        break;
                    case 9:
                        Statics.field1996 = var2;
                        break;
                    case 10:
                        Statics.field1437 = (class363) class388.method3894(class363.method6159(), Integer.parseInt(var2));
                        if (Statics.field1437 == class363.field3917) {
                            Statics.field1781 = class508.field5030;
                        } else {
                            Statics.field1781 = class508.field5033;
                        }
                        break;
                    case 11:
                        Statics.field454 = var2;
                        break;
                    case 12:
                        field519 = Integer.parseInt(var2);
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
                        Statics.field2917 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field529 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field451 = var2;
                        break;
                    case 21:
                        field718 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field1265 = var2;
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field528 = Integer.parseInt(var2);
                        } else {
                            field528 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        method7066();
        Statics.field243 = this.getCodeBase().getHost();
        Statics.field453 = new class375();
        String var4 = Statics.field326.field3910;
        byte var5 = 0;
        if ((field520 & class526.field5113.method38()) != 0) {
            Statics.field1472 = "beta";
        }
        try {
            class176.method2957("oldschool", Statics.field1472, var4, var5, 23);
        } catch (Exception var7) {
            class556.method3321((String) null, var7);
        }
        Statics.field1743 = this;
        Statics.field1913 = field525;
        method3896();
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field566 = true;
        }
        if (field526 == -1) {
            if (this.method1674() || this.method1174()) {
                field526 = 5;
            } else {
                field526 = 0;
            }
        }
        this.method485(765, 503, 217, 1);
    }

    public void finalize() throws Throwable {
        class320.field3435.remove(this);
        super.finalize();
    }

    @ObfuscatedName("pi.gs(I)V")
    public static final void method7066() {
        class245.field2588 = false;
        field748 = false;
    }

    @ObfuscatedName("ij.gv(I)V")
    public static void method3896() {
        Statics.field4805 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field1918 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field1284 = System.getenv("JX_SESSION_ID");
        Statics.field1699 = System.getenv("JX_CHARACTER_ID");
        String var0 = System.getenv("JX_DISPLAY_NAME");
        String var1;
        if (var0 == null || var0.isEmpty() || var0.charAt(0) == '#') {
            var1 = "";
        } else {
            var1 = var0;
        }
        class78.field929 = var1;
    }

    @ObfuscatedName("client.gc(S)Z")
    public boolean method1172() {
        return this.field567 == 1;
    }

    public void setClient(int arg0) {
        this.field567 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field564 = arg0;
            class78.method638(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field569 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field530 == 10;
    }

    public long getAccountHash() {
        return this.field577;
    }

    @ObfuscatedName("client.ga(B)Z")
    public boolean method1674() {
        return Statics.field4805 != null && !Statics.field4805.trim().isEmpty() && Statics.field1918 != null && !Statics.field1918.trim().isEmpty();
    }

    @ObfuscatedName("client.gh(I)Z")
    public boolean method1174() {
        return Statics.field1284 != null && !Statics.field1284.trim().isEmpty() && Statics.field1699 != null && !Statics.field1699.trim().isEmpty();
    }

    @ObfuscatedName("client.gg(B)Z")
    public boolean method1175() {
        return this.field564 != null;
    }

    @ObfuscatedName("client.gu(Ljava/lang/String;B)V")
    public void method1176(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field454 + "shield/oauth/token" + (new class479(var2)).method7737());
        class435 var4 = new class435();
        if (this.method1172()) {
            var4.method7165(field572);
        } else {
            var4.method7165(field571);
        }
        var4.method7193("Host", (new URL(Statics.field454)).getHost());
        var4.method7170(class476.field4819);
        class10 var5 = class10.field42;
        RefreshAccessTokenRequester var6 = this.field569;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field566);
            this.field568 = this.field698.method165(var7);
        } else {
            this.field608 = var6.request(var5.method67(), var3, var4.method7198(), "");
        }
    }

    @ObfuscatedName("client.go(Ljava/lang/String;I)V")
    public void method1177(String arg0) throws IOException {
        URL var2 = new URL(Statics.field454 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class435 var3 = new class435();
        var3.method7185(arg0);
        class10 var4 = class10.field33;
        OtlTokenRequester var5 = this.field564;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field566);
            this.field563 = this.field698.method165(var6);
        } else {
            this.field741 = var5.request(var4.method67(), var2, var3.method7198(), "");
        }
    }

    @ObfuscatedName("client.hi(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1178(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field1265 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field42, this.field566);
        var4.method93().method7185(arg0);
        var4.method93().method7170(class476.field4819);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method77(new class478(var5));
        this.field563 = this.field698.method165(var4);
    }

    @ObfuscatedName("client.bb(B)V")
    public final void method501() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field4598 = null;
            Statics.field4591 = null;
            Statics.field165 = (byte[][][]) null;
            class427.field4592.clear();
            class427.field4592.add(100);
            class427.field4592.add(5000);
            class427.field4592.add(10000);
            class427.field4592.add(30000);
        } else {
            Statics.field4598 = var1;
            Statics.field4591 = new int[var1.length];
            Statics.field165 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field4598.length; var3++) {
                Statics.field165[var3] = new byte[var2[var3]][];
                class427.field4592.add(var1[var3]);
            }
            Collections.sort(class427.field4592);
        }
        Statics.field2224 = field529 == 0 ? 43594 : field519 + 40000;
        Statics.field3927 = field529 == 0 ? 443 : field519 + 50000;
        Statics.field1771 = Statics.field2224;
        Statics.field3616 = class346.field3665;
        Statics.field1343 = class346.field3661;
        Statics.field3573 = class346.field3662;
        Statics.field188 = class346.field3664;
        Statics.field3089 = new class116(this.field566, 217);
        this.method626();
        this.method543();
        Statics.field4916 = this.method500();
        this.method479(field757, 0);
        this.method479(field756, 1);
        this.method475();
        Statics.field1481 = new class458(255, class176.field1840, class176.field1841, 500000);
        Statics.field1106 = class101.method7068();
        class32.method7067(this, Statics.field889);
        method3525(Statics.field1106.method2409());
        Statics.field1907 = new class70(Statics.field1781);
        this.field698 = new class15("tokenRequest", 1, 1);
        class320.method4821(this);
        field817.method4024();
    }

    @ObfuscatedName("ku.hf(B)Lit;")
    public static class227 method5171() {
        return field756;
    }

    @ObfuscatedName("client.bo(I)V")
    public final void method552() {
        field533++;
        this.method1182();
        class371.method6173();
        boolean var1 = Statics.method3968();
        if (var1 && field772 && Statics.field1804 != null) {
            Statics.field1804.method771();
        }
        Statics.method5332();
        field756.method3912();
        this.method530();
        class36 var2 = class36.field228;
        synchronized (class36.field228) {
            class36.field234 = class36.field230;
            class36.field235 = class36.field229;
            class36.field241 = class36.field232;
            class36.field237 = class36.field236;
            class36.field242 = class36.field238;
            class36.field244 = class36.field239;
            class36.field248 = class36.field240;
            class36.field245 = class36.field233;
            class36.field238 = 0;
        }
        if (Statics.field4916 != null) {
            int var4 = Statics.field4916.method293();
            field731 = var4;
        }
        if (field530 == 0) {
            method5337();
            class35.method274();
        } else if (field530 == 5) {
            class78.method5091(this, Statics.field81, Statics.field1486);
            method5337();
            class35.method274();
        } else if (field530 == 10 || field530 == 11) {
            class78.method5091(this, Statics.field81, Statics.field1486);
        } else if (field530 == 20) {
            class78.method5091(this, Statics.field81, Statics.field1486);
            this.method1185();
        } else if (field530 == 50) {
            class78.method5091(this, Statics.field81, Statics.field1486);
            this.method1185();
        } else if (field530 == 25) {
            method4491();
        }
        if (field530 == 30) {
            this.method1186();
        } else if (field530 == 40 || field530 == 45) {
            this.method1185();
        }
    }

    @ObfuscatedName("client.bp(ZB)V")
    public final void method562(boolean arg0) {
        if ((field530 == 10 || field530 == 20 || field530 == 30) && field701 != 0L && class316.method6401() > field701) {
            method3525(method3268());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field740[var2] = true;
            }
        }
        if (field530 == 0) {
            this.method628(class78.field935, class78.field936, arg0);
        } else if (field530 == 5) {
            class78.method6194(Statics.field330, Statics.field81, Statics.field1486);
        } else if (field530 == 10 || field530 == 11) {
            class78.method6194(Statics.field330, Statics.field81, Statics.field1486);
        } else if (field530 == 20) {
            class78.method6194(Statics.field330, Statics.field81, Statics.field1486);
        } else if (field530 == 50) {
            class78.method6194(Statics.field330, Statics.field81, Statics.field1486);
        } else if (field530 == 25) {
            if (field546 == 1) {
                if (field589 > field590) {
                    field590 = field589;
                }
                int var3 = (field590 * 50 - field589 * 50) / field590;
                method7130(class367.field3996 + class104.field1335 + class104.field1332 + var3 + "%" + class104.field1333, false);
            } else if (field546 == 2) {
                if (field591 > field592) {
                    field592 = field591;
                }
                int var4 = (field592 * 50 - field591 * 50) / field592 + 50;
                method7130(class367.field3996 + class104.field1335 + class104.field1332 + var4 + "%" + class104.field1333, false);
            } else {
                method7130(class367.field3996, false);
            }
        } else if (field530 == 30) {
            this.method1190();
        } else if (field530 == 40) {
            method7130(class367.field3960 + class104.field1335 + class367.field3961, false);
        } else if (field530 == 45) {
            method7130(class367.field4171, false);
        }
        if (field530 == 30 && field720 == 0 && !arg0 && !field684) {
            for (int var5 = 0; var5 < field562; var5++) {
                if (field736[var5]) {
                    Statics.field2346.method455(field743[var5], field744[var5], field521[var5], field774[var5]);
                    field736[var5] = false;
                }
            }
        } else if (field530 > 0) {
            Statics.field2346.method452(0, 0);
            for (int var6 = 0; var6 < field562; var6++) {
                field736[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.bt(I)V")
    public final void method477() {
        if (Statics.field186.method2634()) {
            Statics.field186.method2631();
        }
        if (Statics.field2435 != null) {
            Statics.field2435.field1096 = false;
        }
        Statics.field2435 = null;
        field579.method2677();
        class36.method7485();
        Statics.field4916 = null;
        if (Statics.field1804 != null) {
            Statics.field1804.method772();
        }
        Statics.field453.method6360();
        class371.method6171();
        if (Statics.field3089 != null) {
            Statics.field3089.method2715();
            Statics.field3089 = null;
        }
        class176.method2499();
        this.field698.method166();
    }

    @ObfuscatedName("fy.hu(B)V")
    public static void method2961() {
        if (Statics.field186.method2634()) {
            Statics.field186.method2631();
        }
        method5369();
        if (Statics.field2435 != null) {
            Statics.field2435.field1096 = false;
        }
        Statics.field2435 = null;
        field579.method2677();
        if (Statics.field218 != null) {
            try {
                Statics.field218.method3224();
            } catch (Exception var4) {
            }
        }
        Statics.field218 = null;
        method3592();
        Statics.method5132();
        Statics.field53.method4294();
        for (int var1 = 0; var1 < 4; var1++) {
            field594[var1].method3943();
        }
        Statics.field4641 = null;
        class320.method3819(0, 0);
        class320.method7699();
        field772 = false;
        class71.method836();
        if (Statics.field1804 != null) {
            Statics.field1804.method772();
        }
        Statics.field453.method6360();
        class371.method6171();
        if (Statics.field3089 != null) {
            Statics.field3089.method2715();
        }
        class176.method2499();
        class176.field1840 = null;
        class176.field1841 = null;
        Statics.field1460 = null;
        class178.method4047();
        Statics.field1481 = null;
        field818.clear();
        field820 = 0;
        Statics.field453 = new class375();
        Statics.field3089 = new class116(Statics.field1743.field566, 217);
        try {
            class176.method2957("oldschool", Statics.field1472, Statics.field326.field3910, 0, 23);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
        Statics.field1481 = new class458(255, class176.field1840, class176.field1841, 500000);
        Statics.field218 = new class174();
        Statics.field1743.method606();
        field578 = class95.field1162;
        method7509(0);
    }

    @ObfuscatedName("rh.hl(II)V")
    public static void method7509(int arg0) {
        if (field530 == arg0) {
            return;
        }
        if (field530 == 30) {
            field757.method3902();
        }
        if (field530 == 0) {
            Statics.field1743.method505();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method6888(0);
            field556 = 0;
            field733 = 0;
            field587.method7133(arg0);
            if (arg0 != 20) {
                method2807(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field60 != null) {
            Statics.field60.method7441();
            Statics.field60 = null;
        }
        if (field530 == 25) {
            field546 = 0;
            field589 = 0;
            field590 = 1;
            field591 = 0;
            field592 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field1106.method2446() >= field718;
            int var3 = var2 ? 0 : 12;
            class78.method2229(Statics.field1917, Statics.field2011, true, var3);
        } else if (arg0 == 20) {
            int var1 = field530 == 11 ? 4 : 0;
            class78.method2229(Statics.field1917, Statics.field2011, false, var1);
        } else if (arg0 == 11) {
            class78.method2229(Statics.field1917, Statics.field2011, false, 4);
        } else if (arg0 == 50) {
            class78.method5196("", "Updating date of birth...", "");
            class78.method2229(Statics.field1917, Statics.field2011, false, 7);
        } else if (Statics.field945) {
            Statics.field942 = null;
            Statics.field1965 = null;
            Statics.field949 = null;
            Statics.field305 = null;
            Statics.field951 = null;
            Statics.field932 = null;
            Statics.field933 = null;
            Statics.field5078 = null;
            Statics.field5199 = null;
            Statics.field1052 = null;
            Statics.field1185 = null;
            Statics.field2853 = null;
            Statics.field1830 = null;
            Statics.field1406 = null;
            Statics.field5246.method2348();
            class320.method3819(0, 100);
            method158().method6352(true);
            Statics.field945 = false;
        }
        field530 = arg0;
    }

    @ObfuscatedName("client.hm(S)V")
    public void method1182() {
        if (field530 != 1000) {
            boolean var1 = Statics.field453.method6379();
            if (!var1) {
                this.method1183();
            }
        }
    }

    @ObfuscatedName("client.hd(I)V")
    public void method1183() {
        if (Statics.field453.field4365 >= 4) {
            this.method506("js5crc");
            method7509(1000);
            return;
        }
        if (Statics.field453.field4357 >= 4) {
            if (field530 <= 5) {
                this.method506("js5io");
                method7509(1000);
                return;
            }
            field553 = 3000;
            Statics.field453.field4357 = 3;
        }
        if (--field553 + 1 > 0) {
            return;
        }
        try {
            if (field552 == 0) {
                Statics.field2004 = Statics.field218.method3220(Statics.field243, Statics.field1771);
                field552++;
            }
            if (field552 == 1) {
                if (Statics.field2004.field1881 == 2) {
                    this.method1618(-1);
                    return;
                }
                if (Statics.field2004.field1881 == 1) {
                    field552++;
                }
            }
            if (field552 == 2) {
                Statics.field1762 = class454.method5116((Socket) Statics.field2004.field1882, 40000, 5000);
                class530 var1 = new class530(5);
                var1.method8348(15);
                var1.method8351(217);
                Statics.field1762.method7435(var1.field5139, 0, 5);
                field552++;
                Statics.field2500 = class316.method6401();
            }
            if (field552 == 3) {
                if (Statics.field1762.method7448() > 0) {
                    int var2 = Statics.field1762.method7438();
                    if (var2 != 0) {
                        this.method1618(var2);
                        return;
                    }
                    field552++;
                } else if (class316.method6401() - Statics.field2500 > 30000L) {
                    this.method1618(-2);
                    return;
                }
            }
            if (field552 == 4) {
                Statics.field453.method6353(Statics.field1762, field530 > 20);
                Statics.field2004 = null;
                Statics.field1762 = null;
                field552 = 0;
                field554 = 0;
            }
        } catch (IOException var4) {
            this.method1618(-3);
        }
    }

    @ObfuscatedName("client.hs(IB)V")
    public void method1618(int arg0) {
        Statics.field2004 = null;
        Statics.field1762 = null;
        field552 = 0;
        if (Statics.field2224 == Statics.field1771) {
            Statics.field1771 = Statics.field3927;
        } else {
            Statics.field1771 = Statics.field2224;
        }
        field554++;
        if (field554 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field530 <= 5) {
                this.method506("js5connect_full");
                method7509(1000);
            } else {
                field553 = 3000;
            }
        } else if (field554 >= 2 && arg0 == 6) {
            this.method506("js5connect_outofdate");
            method7509(1000);
        } else if (field554 >= 4) {
            if (field530 <= 5) {
                this.method506("js5connect");
                method7509(1000);
            } else {
                field553 = 3000;
            }
        }
    }

    @ObfuscatedName("mv.hk(Lok;Ljava/lang/String;B)V")
    public static void method5611(class372 arg0, String arg1) {
        class86 var2 = new class86(arg0, arg1);
        field818.add(var2);
        field820 += var2.field1055;
    }

    @ObfuscatedName("cj.hn(B)Z")
    public static boolean method1857() {
        if (field818 == null || field819 >= field818.size()) {
            return true;
        }
        while (field819 < field818.size()) {
            class86 var0 = (class86) field818.get(field819);
            if (!var0.method2187()) {
                return false;
            }
            field819++;
        }
        return true;
    }

    @ObfuscatedName("fi.ha(I)I")
    public static int method2930() {
        if (field818 == null || field819 >= field818.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field819; var1++) {
            var0 += ((class86) field818.get(var1)).field1053;
        }
        return var0 * 10000 / field820;
    }

    @ObfuscatedName("mj.hh(I)V")
    public static void method5337() {
        if (field578 == class95.field1162) {
            Statics.field53 = new class245(4, 104, 104, class84.field1042);
            for (int var0 = 0; var0 < 4; var0++) {
                field594[var0] = new class228(104, 104);
            }
            Statics.field3560 = new class544(512, 512);
            class78.field936 = class367.field3962;
            class78.field935 = 5;
            field578 = class95.field1150;
        } else if (field578 == class95.field1150) {
            class78.field936 = class367.field3963;
            class78.field935 = 10;
            field578 = class95.field1157;
        } else if (field578 == class95.field1157) {
            Statics.field1118 = method3463(0, false, true, true, false);
            Statics.field2010 = method3463(1, false, true, true, false);
            Statics.field321 = method3463(2, true, false, true, false);
            Statics.field3840 = method3463(3, false, true, true, false);
            Statics.field4813 = method3463(4, false, true, true, false);
            Statics.field2002 = method3463(5, true, true, true, false);
            Statics.field2393 = method3463(6, true, true, true, false);
            Statics.field516 = method3463(7, false, true, true, false);
            Statics.field2011 = method3463(8, false, true, true, false);
            Statics.field2559 = method3463(9, false, true, true, false);
            Statics.field1917 = method3463(10, false, true, true, false);
            Statics.field4436 = method3463(11, false, true, true, false);
            Statics.field4578 = method3463(12, false, true, true, false);
            Statics.field150 = method3463(13, true, false, true, false);
            Statics.field4292 = method3463(14, false, true, true, false);
            Statics.field3416 = method3463(15, false, true, true, false);
            Statics.field3882 = method3463(17, true, true, true, false);
            Statics.field3899 = method3463(18, false, true, true, false);
            Statics.field2659 = method3463(19, false, true, true, false);
            Statics.field2029 = method3463(20, false, true, true, false);
            Statics.field3397 = method3463(21, false, true, true, false);
            class458 var1 = null;
            if (class176.field1840 != null) {
                var1 = new class458(22, class176.field1840, Statics.field1460[22], 1000000);
            }
            class372 var2 = new class372(var1, Statics.field1481, Statics.field453, 22, false, true, true, true, true);
            Statics.field3443 = var2;
            class78.field936 = class367.field3964;
            class78.field935 = 20;
            field578 = class95.field1152;
        } else if (field578 == class95.field1152) {
            byte var3 = 0;
            int var4 = var3 + Statics.field1118.method6218() * 4 / 100;
            int var5 = var4 + Statics.field2010.method6218() * 4 / 100;
            int var6 = var5 + Statics.field321.method6218() * 2 / 100;
            int var7 = var6 + Statics.field3840.method6218() * 2 / 100;
            int var8 = var7 + Statics.field4813.method6218() * 6 / 100;
            int var9 = var8 + Statics.field2002.method6218() * 4 / 100;
            int var10 = var9 + Statics.field2393.method6218() * 2 / 100;
            int var11 = var10 + Statics.field516.method6218() * 54 / 100;
            int var12 = var11 + Statics.field2011.method6218() * 2 / 100;
            int var13 = var12 + Statics.field2559.method6218() * 2 / 100;
            int var14 = var13 + Statics.field1917.method6218() * 2 / 100;
            int var15 = var14 + Statics.field4436.method6218() * 2 / 100;
            int var16 = var15 + Statics.field4578.method6218() * 2 / 100;
            int var17 = var16 + Statics.field150.method6218() * 2 / 100;
            int var18 = var17 + Statics.field4292.method6218() * 2 / 100;
            int var19 = var18 + Statics.field3416.method6218() * 2 / 100;
            int var20 = var19 + Statics.field2659.method6218() / 100;
            int var21 = var20 + Statics.field3899.method6218() / 100;
            int var22 = var21 + Statics.field2029.method6218() / 100;
            int var23 = var22 + Statics.field3397.method6218() / 100;
            int var24 = var23 + Statics.field3443.method6218() / 100;
            int var25 = var24 + (Statics.field3882.method6217() && Statics.field3882.method6328() ? 1 : 0);
            if (var25 == 100) {
                method5611(Statics.field1118, "Animations");
                method5611(Statics.field2010, "Skeletons");
                method5611(Statics.field4813, "Sound FX");
                method5611(Statics.field2002, "Maps");
                method5611(Statics.field2393, "Music Tracks");
                method5611(Statics.field516, "Models");
                method5611(Statics.field2011, "Sprites");
                method5611(Statics.field4436, "Music Jingles");
                method5611(Statics.field4292, "Music Samples");
                method5611(Statics.field3416, "Music Patches");
                method5611(Statics.field2659, "World Map");
                method5611(Statics.field3899, "World Map Geography");
                method5611(Statics.field2029, "World Map Ground");
                Statics.field2563 = new class460();
                Statics.field2563.method7512(Statics.field3882);
                class78.field936 = class367.field4078;
                class78.field935 = 30;
                field578 = class95.field1153;
            } else {
                if (var25 != 0) {
                    class78.field936 = class367.field3965 + var25 + "%";
                }
                class78.field935 = 30;
            }
        } else if (field578 == class95.field1153) {
            class43.method2913(22050, !field748, 2);
            ArrayList var26 = new ArrayList(3);
            class174 var27 = Statics.field218;
            short var28 = 2048;
            if (Statics.field307 == 0) {
                throw new IllegalStateException();
            }
            if (var28 < 256) {
                var28 = 256;
            }
            class43 var30;
            try {
                class43 var29 = Statics.field85.method299();
                var29.field296 = new int[(Statics.field3131 ? 2 : 1) * 256];
                var29.field290 = var28;
                var29.method314();
                var29.field292 = (var28 & 0xFFFFFC00) + 1024;
                if (var29.field292 > 16384) {
                    var29.field292 = 16384;
                }
                var29.method315(var29.field292);
                if (Statics.field2373 > 0 && Statics.field1454 == null) {
                    Statics.field1454 = new class45();
                    Statics.field3846 = Executors.newScheduledThreadPool(1);
                    Statics.field3846.scheduleAtFixedRate(Statics.field1454, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field1454 != null) {
                    if (Statics.field1454.field322[0] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field1454.field322[0] = var29;
                }
                var30 = var29;
            } catch (Throwable var117) {
                var30 = new class43();
            }
            Statics.field1804 = var30;
            Statics.field1626 = new class39();
            class39 var32 = new class39();
            var32.method725(Statics.field1626);
            for (int var33 = 0; var33 < 3; var33++) {
                class321 var34 = new class321();
                var34.method5420(9, 128);
                var32.method725(var34);
                var26.add(var34);
            }
            Statics.field1804.method781(var32);
            class320.method10(Statics.field3416, Statics.field4292, Statics.field4813, var26);
            Statics.field1600 = new class58(22050, Statics.field307);
            class78.field936 = class367.field3955;
            class78.field935 = 35;
            field578 = class95.field1159;
            Statics.field3847 = new class499(Statics.field2011, Statics.field150);
        } else if (field578 == class95.field1159) {
            class500[] var35 = new class500[] { class500.field4996, class500.field5001, class500.field5000, class500.field4997, class500.field5003, class500.field4998 };
            int var36 = var35.length;
            class499 var37 = Statics.field3847;
            class500[] var38 = new class500[] { class500.field4996, class500.field5001, class500.field5000, class500.field4997, class500.field5003, class500.field4998 };
            field637 = var37.method8042(var38);
            if (field637.size() < var36) {
                class78.field936 = class367.field3968 + field637.size() * 100 / var36 + "%";
                class78.field935 = 40;
            } else {
                Statics.field81 = (class409) field637.get(class500.field5003);
                Statics.field1486 = (class409) field637.get(class500.field4996);
                Statics.field330 = (class409) field637.get(class500.field4997);
                Statics.field2584 = field738.method7783();
                class78.field936 = class367.field3969;
                class78.field935 = 40;
                field578 = class95.field1155;
            }
        } else if (field578 == class95.field1155) {
            int var39 = class78.method6258(Statics.field1917, Statics.field2011);
            class372 var40 = Statics.field2011;
            int var41 = class78.field963.length + class78.field940.length;
            String[] var42 = class78.field962;
            for (int var43 = 0; var43 < var42.length; var43++) {
                String var44 = var42[var43];
                if (var40.method6279(var44) != -1) {
                    var41++;
                }
            }
            if (var39 < var41) {
                class78.field936 = class367.field3970 + var39 * 100 / var41 + "%";
                class78.field935 = 50;
            } else {
                class78.field936 = class367.field3971;
                class78.field935 = 50;
                method7509(5);
                field578 = class95.field1156;
            }
        } else if (field578 == class95.field1156) {
            if (!Statics.field321.method6328()) {
                class78.field936 = class367.field4174 + Statics.field321.method6248() + "%";
                class78.field935 = 60;
            } else if (Statics.field3397.method6328()) {
                class222.method3323(Statics.field321);
                class372 var47 = Statics.field321;
                Statics.field2131 = var47;
                class197.method2975(Statics.field321, Statics.field516);
                class220.method8215(Statics.field321, Statics.field516, field748);
                class372 var48 = Statics.field321;
                class372 var49 = Statics.field516;
                Statics.field2045 = var48;
                Statics.field2086 = var49;
                Statics.method2970(Statics.field321);
                class221.method2089(Statics.field321, Statics.field516, field522, Statics.field81);
                class223.method2926(Statics.field321, Statics.field1118, Statics.field2010);
                class372 var50 = Statics.field321;
                class372 var51 = Statics.field516;
                Statics.field2118 = var50;
                Statics.field2117 = var51;
                class372 var52 = Statics.field321;
                Statics.field2146 = var52;
                class372 var53 = Statics.field321;
                Statics.field1928 = var53;
                Statics.field1925 = Statics.field1928.method6273(16);
                Statics.field185 = new class339(Statics.field3840, Statics.field516, Statics.field2011, Statics.field150, Statics.field3443);
                Statics.method1062(Statics.field321);
                class201.method5125(Statics.field321);
                class196.method2922(Statics.field321);
                class213.method1128(Statics.field321);
                class216.method3840(Statics.field321);
                class521.method3282(Statics.field321);
                class523.method2656(Statics.field321);
                Statics.field1989 = new class513(Statics.field1437, 54, Statics.field2910, Statics.field321);
                Statics.field380 = new class513(Statics.field1437, 47, Statics.field2910, Statics.field321);
                Statics.field186 = new class112();
                class219.method2782(Statics.field321, Statics.field2011, Statics.field150);
                class372 var54 = Statics.field321;
                class372 var55 = Statics.field2011;
                Statics.field1982 = var54;
                Statics.field1980 = var55;
                class372 var56 = Statics.field321;
                class372 var57 = Statics.field2011;
                Statics.field1952 = var57;
                if (var56.method6328()) {
                    Statics.field115 = var56.method6273(35);
                    Statics.field1933 = new class195[Statics.field115];
                    for (int var58 = 0; var58 < Statics.field115; var58++) {
                        byte[] var59 = var56.method6342(35, var58);
                        Statics.field1933[var58] = new class195(var58);
                        if (var59 != null) {
                            Statics.field1933[var58].method3341(new class530(var59));
                            Statics.field1933[var58].method3361();
                        }
                    }
                }
                class78.field936 = class367.field3973;
                class78.field935 = 60;
                field578 = class95.field1160;
            } else {
                class78.field936 = class367.field4174 + (80 + Statics.field4578.method6248() / 6) + "%";
                class78.field935 = 60;
            }
        } else if (field578 == class95.field1160) {
            int var60 = 0;
            if (Statics.field4491 == null) {
                Statics.field4491 = class545.method842(Statics.field2011, Statics.field2563.field4759, 0);
            } else {
                var60++;
            }
            if (Statics.field2156 == null) {
                Statics.field2156 = class545.method842(Statics.field2011, Statics.field2563.field4751, 0);
            } else {
                var60++;
            }
            if (Statics.field1977 == null) {
                class372 var61 = Statics.field2011;
                int var62 = Statics.field2563.field4753;
                class543[] var63;
                if (class545.method3115(var61, var62, 0)) {
                    var63 = class545.method8190();
                } else {
                    var63 = null;
                }
                Statics.field1977 = var63;
            } else {
                var60++;
            }
            if (Statics.field1453 == null) {
                class372 var64 = Statics.field2011;
                int var65 = Statics.field2563.field4750;
                class544[] var66;
                if (class545.method3115(var64, var65, 0)) {
                    class544[] var67 = new class544[Statics.field5248];
                    int var68 = 0;
                    while (true) {
                        if (var68 >= Statics.field5248) {
                            Statics.method6787();
                            var66 = var67;
                            break;
                        }
                        class544 var69 = var67[var68] = new class544();
                        var69.field5234 = Statics.field1747;
                        var69.field5240 = Statics.field5007;
                        var69.field5236 = Statics.field3506[var68];
                        var69.field5238 = Statics.field2854[var68];
                        var69.field5237 = Statics.field443[var68];
                        var69.field5239 = Statics.field5247[var68];
                        int var70 = var69.field5239 * var69.field5237;
                        byte[] var71 = Statics.field4559[var68];
                        var69.field5235 = new int[var70];
                        for (int var72 = 0; var72 < var70; var72++) {
                            var69.field5235[var72] = Statics.field4323[var71[var72] & 0xFF];
                        }
                        var68++;
                    }
                } else {
                    var66 = null;
                }
                Statics.field1453 = var66;
            } else {
                var60++;
            }
            if (Statics.field1731 == null) {
                class372 var74 = Statics.field2011;
                int var75 = Statics.field2563.field4754;
                class544[] var76;
                if (class545.method3115(var74, var75, 0)) {
                    class544[] var77 = new class544[Statics.field5248];
                    int var78 = 0;
                    while (true) {
                        if (var78 >= Statics.field5248) {
                            Statics.method6787();
                            var76 = var77;
                            break;
                        }
                        class544 var79 = var77[var78] = new class544();
                        var79.field5234 = Statics.field1747;
                        var79.field5240 = Statics.field5007;
                        var79.field5236 = Statics.field3506[var78];
                        var79.field5238 = Statics.field2854[var78];
                        var79.field5237 = Statics.field443[var78];
                        var79.field5239 = Statics.field5247[var78];
                        int var80 = var79.field5239 * var79.field5237;
                        byte[] var81 = Statics.field4559[var78];
                        var79.field5235 = new int[var80];
                        for (int var82 = 0; var82 < var80; var82++) {
                            var79.field5235[var82] = Statics.field4323[var81[var82] & 0xFF];
                        }
                        var78++;
                    }
                } else {
                    var76 = null;
                }
                Statics.field1731 = var76;
            } else {
                var60++;
            }
            if (Statics.field1458 == null) {
                class372 var84 = Statics.field2011;
                int var85 = Statics.field2563.field4755;
                class544[] var86;
                if (class545.method3115(var84, var85, 0)) {
                    class544[] var87 = new class544[Statics.field5248];
                    int var88 = 0;
                    while (true) {
                        if (var88 >= Statics.field5248) {
                            Statics.method6787();
                            var86 = var87;
                            break;
                        }
                        class544 var89 = var87[var88] = new class544();
                        var89.field5234 = Statics.field1747;
                        var89.field5240 = Statics.field5007;
                        var89.field5236 = Statics.field3506[var88];
                        var89.field5238 = Statics.field2854[var88];
                        var89.field5237 = Statics.field443[var88];
                        var89.field5239 = Statics.field5247[var88];
                        int var90 = var89.field5239 * var89.field5237;
                        byte[] var91 = Statics.field4559[var88];
                        var89.field5235 = new int[var90];
                        for (int var92 = 0; var92 < var90; var92++) {
                            var89.field5235[var92] = Statics.field4323[var91[var92] & 0xFF];
                        }
                        var88++;
                    }
                } else {
                    var86 = null;
                }
                Statics.field1458 = var86;
            } else {
                var60++;
            }
            if (Statics.field344 == null) {
                Statics.field344 = class545.method2232(Statics.field2011, Statics.field2563.field4756, 0);
            } else {
                var60++;
            }
            if (Statics.field2022 == null) {
                class372 var94 = Statics.field2011;
                int var95 = Statics.field2563.field4757;
                class544[] var96;
                if (class545.method3115(var94, var95, 0)) {
                    class544[] var97 = new class544[Statics.field5248];
                    int var98 = 0;
                    while (true) {
                        if (var98 >= Statics.field5248) {
                            Statics.method6787();
                            var96 = var97;
                            break;
                        }
                        class544 var99 = var97[var98] = new class544();
                        var99.field5234 = Statics.field1747;
                        var99.field5240 = Statics.field5007;
                        var99.field5236 = Statics.field3506[var98];
                        var99.field5238 = Statics.field2854[var98];
                        var99.field5237 = Statics.field443[var98];
                        var99.field5239 = Statics.field5247[var98];
                        int var100 = var99.field5239 * var99.field5237;
                        byte[] var101 = Statics.field4559[var98];
                        var99.field5235 = new int[var100];
                        for (int var102 = 0; var102 < var100; var102++) {
                            var99.field5235[var102] = Statics.field4323[var101[var102] & 0xFF];
                        }
                        var98++;
                    }
                } else {
                    var96 = null;
                }
                Statics.field2022 = var96;
            } else {
                var60++;
            }
            if (Statics.field1337 == null) {
                Statics.field1337 = class545.method2232(Statics.field2011, Statics.field2563.field4758, 0);
            } else {
                var60++;
            }
            if (Statics.field254 == null) {
                class372 var104 = Statics.field2011;
                int var105 = Statics.field2563.field4752;
                class543[] var106;
                if (class545.method3115(var104, var105, 0)) {
                    var106 = class545.method8190();
                } else {
                    var106 = null;
                }
                Statics.field254 = var106;
            } else {
                var60++;
            }
            if (Statics.field1855 == null) {
                class372 var107 = Statics.field2011;
                int var108 = Statics.field2563.field4760;
                class543[] var109;
                if (class545.method3115(var107, var108, 0)) {
                    var109 = class545.method8190();
                } else {
                    var109 = null;
                }
                Statics.field1855 = var109;
            } else {
                var60++;
            }
            if (var60 < 11) {
                class78.field936 = class367.field3974 + var60 * 100 / 12 + "%";
                class78.field935 = 70;
            } else {
                Statics.field4539 = Statics.field1855;
                Statics.field2156.method8918();
                int var110 = (int) (Math.random() * 21.0D) - 10;
                int var111 = (int) (Math.random() * 21.0D) - 10;
                int var112 = (int) (Math.random() * 21.0D) - 10;
                int var113 = (int) (Math.random() * 41.0D) - 20;
                Statics.field1977[0].method8788(var110 + var113, var111 + var113, var112 + var113);
                class78.field936 = class367.field4243;
                class78.field935 = 70;
                field578 = class95.field1158;
            }
        } else if (field578 == class95.field1158) {
            if (Statics.field2559.method6328()) {
                Statics.field3130 = new class251(Statics.field2559, Statics.field2011, 20, Statics.field1106.method2397(), field748 ? 64 : 128);
                class241.method4154(Statics.field3130);
                class241.method4152(Statics.field1106.method2397());
                field578 = class95.field1165;
            } else {
                class78.field936 = class367.field3976 + "0%";
                class78.field935 = 90;
            }
        } else if (field578 == class95.field1165) {
            int var114 = Statics.field3130.method4494();
            if (var114 < 100) {
                class78.field936 = class367.field3976 + var114 + "%";
                class78.field935 = 90;
            } else {
                class78.field936 = class367.field3977;
                class78.field935 = 90;
                field578 = class95.field1161;
            }
        } else if (field578 == class95.field1161) {
            Statics.field2435 = new class91();
            Statics.field218.method3218(Statics.field2435, 10);
            class78.field936 = class367.field3978;
            class78.field935 = 92;
            field578 = class95.field1149;
        } else if (field578 == class95.field1149) {
            if (Statics.field1917.method6282("huffman", "")) {
                class349 var115 = new class349(Statics.field1917.method6281("huffman", ""));
                Statics.field3836 = var115;
                class78.field936 = class367.field4254;
                class78.field935 = 94;
                field578 = class95.field1154;
            } else {
                class78.field936 = class367.field3979 + "%";
                class78.field935 = 94;
            }
        } else if (field578 == class95.field1154) {
            if (!Statics.field3840.method6328()) {
                class78.field936 = class367.field4217 + Statics.field3840.method6248() * 4 / 5 + "%";
                class78.field935 = 96;
            } else if (!Statics.field3443.method6328()) {
                class78.field936 = class367.field4217 + Statics.field3443.method6248() * 4 / 5 + "%";
                class78.field935 = 96;
            } else if (!Statics.field4578.method6328()) {
                class78.field936 = class367.field4217 + (80 + Statics.field4578.method6248() / 6) + "%";
                class78.field935 = 96;
            } else if (Statics.field150.method6328()) {
                class78.field936 = class367.field3982;
                class78.field935 = 98;
                if (Statics.field4578.method6285("version.dat", "")) {
                    class530 var116 = new class530(Statics.field4578.method6281("version.dat", ""));
                    var116.method8598();
                }
                field578 = class95.field1163;
            } else {
                class78.field936 = class367.field4217 + (96 + Statics.field150.method6248() / 50) + "%";
                class78.field935 = 96;
            }
        } else if (field578 == class95.field1163) {
            class78.field935 = 100;
            if (Statics.field2659.method6274() <= 0 || Statics.field2659.method6283(class290.field3096.field3093)) {
                if (Statics.field4641 == null) {
                    Statics.field4641 = new class498();
                    Statics.field4641.method7849(Statics.field2659, Statics.field3899, Statics.field2029, Statics.field330, field637, Statics.field1977);
                }
                class78.field936 = class367.field3984;
                field578 = class95.field1164;
            } else {
                class78.field936 = class367.field3983 + Statics.field2659.method6306(class290.field3096.field3093) / 10 + "%";
            }
        } else if (field578 == class95.field1164) {
            method7509(10);
        }
    }

    @ObfuscatedName("hx.hp(IZZZZI)Lok;")
    public static class372 method3463(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class458 var5 = null;
        if (class176.field1840 != null) {
            var5 = new class458(arg0, class176.field1840, Statics.field1460[arg0], 1000000);
        }
        return new class372(var5, Statics.field1481, Statics.field453, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("client.hg(B)V")
    public final void method1185() {
        class454 var1 = field579.method2679();
        class529 var2 = field579.field1426;
        try {
            if (field732 == 0) {
                if (Statics.field2364 == null && (field574.method2093() || field556 > 250)) {
                    Statics.field2364 = field574.method2094();
                    field574.method2092();
                    field574 = null;
                }
                if (Statics.field2364 != null) {
                    if (var1 != null) {
                        var1.method7441();
                        var1 = null;
                    }
                    Statics.field250 = null;
                    field725 = false;
                    field556 = 0;
                    if (!field560.method8666()) {
                        method6888(1);
                    } else if (this.method1674()) {
                        try {
                            this.method1176(Statics.field1918);
                            method6888(21);
                        } catch (Throwable var60) {
                            class556.method3321((String) null, var60);
                            method3430(65);
                            return;
                        }
                    } else if (this.method1174()) {
                        try {
                            this.method1178(Statics.field1284, Statics.field1699);
                            method6888(20);
                        } catch (Exception var59) {
                            class556.method3321((String) null, var59);
                            method3430(65);
                            return;
                        }
                    } else {
                        method3430(65);
                        return;
                    }
                }
            }
            if (field732 == 21) {
                if (this.field608 == null) {
                    if (this.field568 == null) {
                        method3430(65);
                        return;
                    }
                    if (!this.field568.method270()) {
                        return;
                    }
                    if (this.field568.method261()) {
                        class556.method3321(this.field568.method260(), (Throwable) null);
                        method3430(65);
                        this.field568 = null;
                        return;
                    }
                    class21 var7 = this.field568.method263();
                    if (var7.method278() != 200) {
                        method3430(65);
                        this.field568 = null;
                        return;
                    }
                    field556 = 0;
                    class478 var8 = new class478(var7.method280());
                    try {
                        Statics.field4805 = var8.method7727().getString("access_token");
                        Statics.field1918 = var8.method7727().getString("refresh_token");
                    } catch (Exception var57) {
                        class556.method3321("Error parsing tokens", var57);
                        method3430(65);
                        this.field568 = null;
                        return;
                    }
                } else if (this.field608.isDone()) {
                    if (this.field608.isCancelled()) {
                        method3430(65);
                        this.field608 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field608.get();
                        if (!var5.isSuccess()) {
                            method3430(65);
                            this.field608 = null;
                            return;
                        }
                        Statics.field4805 = var5.getAccessToken();
                        Statics.field1918 = var5.getRefreshToken();
                        this.field608 = null;
                    } catch (Exception var58) {
                        class556.method3321((String) null, var58);
                        method3430(65);
                        this.field608 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1177(Statics.field4805);
                method6888(20);
            }
            if (field732 == 20) {
                if (this.field741 == null) {
                    if (this.field563 == null) {
                        method3430(65);
                        return;
                    }
                    if (!this.field563.method270()) {
                        return;
                    }
                    if (this.field563.method261()) {
                        class556.method3321(this.field563.method260(), (Throwable) null);
                        method3430(65);
                        this.field563 = null;
                        return;
                    }
                    class21 var12 = this.field563.method263();
                    if (var12.method278() != 200) {
                        class556.method3321("Response code: " + var12.method278() + "Response body: " + var12.method280(), (Throwable) null);
                        method3430(65);
                        this.field563 = null;
                        return;
                    }
                    List var13 = (List) var12.method279().get("Content-Type");
                    if (var13 != null && var13.contains(class476.field4819.method7714())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method280());
                            this.field561 = var14.getString("token");
                        } catch (JSONException var55) {
                            class556.method3321((String) null, var55);
                            method3430(65);
                            this.field563 = null;
                            return;
                        }
                    } else {
                        this.field561 = var12.method280();
                    }
                    this.field563 = null;
                } else if (this.field741.isDone()) {
                    if (this.field741.isCancelled()) {
                        method3430(65);
                        this.field741 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field741.get();
                        if (!var10.isSuccess()) {
                            method3430(65);
                            this.field741 = null;
                            return;
                        }
                        this.field561 = var10.getToken();
                        this.field741 = null;
                    } catch (Exception var56) {
                        class556.method3321((String) null, var56);
                        method3430(65);
                        this.field741 = null;
                        return;
                    }
                } else {
                    return;
                }
                field556 = 0;
                method6888(1);
            }
            if (field732 == 1) {
                if (Statics.field250 == null) {
                    Statics.field250 = Statics.field218.method3220(Statics.field243, Statics.field1771);
                }
                if (Statics.field250.field1881 == 2) {
                    throw new IOException();
                }
                if (Statics.field250.field1881 == 1) {
                    var1 = class454.method5116((Socket) Statics.field250.field1882, 40000, 5000);
                    field579.method2676(var1);
                    Statics.field250 = null;
                    method6888(2);
                }
            }
            if (field732 == 2) {
                field579.method2692();
                class311 var16 = class311.method2571();
                var16.field3250.method8348(class313.field3388.field3391);
                field579.method2682(var16);
                field579.method2674();
                var2.field5140 = 0;
                method6888(3);
            }
            if (field732 == 3) {
                if (Statics.field1804 != null) {
                    Statics.field1804.method770();
                }
                if (var1.method7436(1)) {
                    int var17 = var1.method7438();
                    if (Statics.field1804 != null) {
                        Statics.field1804.method770();
                    }
                    if (var17 != 0) {
                        method3430(var17);
                        return;
                    }
                    var2.field5140 = 0;
                    method6888(4);
                }
            }
            if (field732 == 4) {
                if (var2.field5140 < 8) {
                    int var18 = var1.method7448();
                    if (var18 > 8 - var2.field5140) {
                        var18 = 8 - var2.field5140;
                    }
                    if (var18 > 0) {
                        var1.method7447(var2.field5139, var2.field5140, var18);
                        var2.field5140 += var18;
                    }
                }
                if (var2.field5140 == 8) {
                    var2.field5140 = 0;
                    Statics.field1355 = var2.method8573();
                    method6888(5);
                }
            }
            if (field732 == 5) {
                field579.field1426.field5140 = 0;
                field579.method2692();
                class529 var19 = new class529(500);
                int[] var20 = new int[] { Statics.field2364.nextInt(), Statics.field2364.nextInt(), Statics.field2364.nextInt(), Statics.field2364.nextInt() };
                var19.field5140 = 0;
                var19.method8348(1);
                var19.method8351(var20[0]);
                var19.method8351(var20[1]);
                var19.method8351(var20[2]);
                var19.method8351(var20[3]);
                var19.method8367(Statics.field1355);
                if (field530 == 40) {
                    var19.method8351(Statics.field1001[0]);
                    var19.method8351(Statics.field1001[1]);
                    var19.method8351(Statics.field1001[2]);
                    var19.method8351(Statics.field1001[3]);
                } else {
                    if (field530 == 50) {
                        var19.method8348(class142.field1635.method38());
                        var19.method8351(Statics.field1694);
                    } else {
                        var19.method8348(field559.method38());
                        switch(field559.field1627) {
                            case 1:
                                var19.field5140 += 4;
                                break;
                            case 2:
                                var19.method8351(Statics.field1106.method2394(class78.field961));
                                break;
                            case 3:
                            case 4:
                                var19.method8350(Statics.field1296);
                                var19.field5140++;
                        }
                    }
                    if (field560.method8666()) {
                        var19.method8348(class535.field5193.method38());
                        var19.method8374(this.field561);
                    } else {
                        var19.method8348(class535.field5200.method38());
                        var19.method8374(class78.field946);
                    }
                }
                var19.method8430(class77.field922, class77.field923);
                Statics.field1001 = var20;
                class311 var21 = class311.method2571();
                var21.field3250.field5140 = 0;
                if (field530 == 40) {
                    var21.field3250.method8348(class313.field3392.field3391);
                } else {
                    var21.field3250.method8348(class313.field3387.field3391);
                }
                var21.field3250.method8349(0);
                int var22 = var21.field3250.field5140;
                var21.field3250.method8351(217);
                var21.field3250.method8351(1);
                var21.field3250.method8348(field525);
                var21.field3250.method8348(field526);
                byte var23 = 0;
                var21.field3250.method8348(var23);
                var21.field3250.method8412(var19.field5139, 0, var19.field5140);
                int var24 = var21.field3250.field5140;
                var21.field3250.method8374(class78.field961);
                var21.field3250.method8348((field684 ? 1 : 0) << 1 | (field748 ? 1 : 0));
                var21.field3250.method8349(Statics.field3598);
                var21.field3250.method8349(Statics.field4908);
                class529 var25 = var21.field3250;
                if (field821 == null) {
                    byte[] var26 = class176.method2874();
                    var25.method8412(var26, 0, var26.length);
                } else {
                    var25.method8412(field821, 0, field821.length);
                }
                var21.field3250.method8374(Statics.field1996);
                var21.field3250.method8351(Statics.field2917);
                if (field528 > 213) {
                    var21.field3250.method8348(0);
                }
                class530 var27 = new class530(Statics.field2584.method7798());
                Statics.field2584.method7797(var27);
                var21.field3250.method8412(var27.field5139, 0, var27.field5139.length);
                var21.field3250.method8348(field525);
                var21.field3250.method8351(0);
                var21.field3250.method8351(Statics.field3882.field4324);
                var21.field3250.method8351(Statics.field2010.field4324);
                var21.field3250.method8420(Statics.field2011.field4324);
                var21.field3250.method8585(Statics.field2559.field4324);
                var21.field3250.method8418(Statics.field150.field4324);
                var21.field3250.method8418(Statics.field4813.field4324);
                var21.field3250.method8418(Statics.field321.field4324);
                var21.field3250.method8585(Statics.field1917.field4324);
                var21.field3250.method8420(Statics.field2029.field4324);
                var21.field3250.method8585(Statics.field516.field4324);
                var21.field3250.method8351(Statics.field3899.field4324);
                var21.field3250.method8585(Statics.field4436.field4324);
                var21.field3250.method8585(0);
                var21.field3250.method8418(Statics.field3840.field4324);
                var21.field3250.method8418(Statics.field2002.field4324);
                var21.field3250.method8418(Statics.field2659.field4324);
                var21.field3250.method8351(Statics.field4292.field4324);
                var21.field3250.method8418(Statics.field2393.field4324);
                var21.field3250.method8351(Statics.field4578.field4324);
                var21.field3250.method8418(Statics.field3416.field4324);
                var21.field3250.method8420(Statics.field1118.field4324);
                var21.field3250.method8390(var20, var24, var21.field3250.field5140);
                var21.field3250.method8581(var21.field3250.field5140 - var22);
                field579.method2682(var21);
                field579.method2674();
                field579.field1425 = new class547(var20);
                int[] var28 = new int[4];
                for (int var29 = 0; var29 < 4; var29++) {
                    var28[var29] = var20[var29] + 50;
                }
                var2.method8306(var28);
                method6888(6);
            }
            if (field732 == 6 && var1.method7448() > 0) {
                int var30 = var1.method7438();
                if (var30 == 61) {
                    int var31 = var1.method7448();
                    Statics.field3428 = var31 == 1 && var1.method7438() == 1;
                    method6888(5);
                }
                if (var30 == 21 && field530 == 20) {
                    method6888(12);
                } else if (var30 == 2) {
                    method6888(14);
                } else if (var30 == 15 && field530 == 40) {
                    field579.field1428 = -1;
                    method6888(19);
                } else if (var30 == 64) {
                    method6888(10);
                } else if (var30 == 23 && field733 < 1) {
                    field733++;
                    method6888(0);
                } else if (var30 == 29) {
                    method6888(17);
                } else if (var30 == 69) {
                    method6888(7);
                } else {
                    method3430(var30);
                    return;
                }
            }
            if (field732 == 7 && var1.method7448() >= 2) {
                var1.method7447(var2.field5139, 0, 2);
                var2.field5140 = 0;
                Statics.field69 = var2.method8598();
                method6888(8);
            }
            if (field732 == 8 && var1.method7448() >= Statics.field69) {
                var2.field5140 = 0;
                var1.method7447(var2.field5139, var2.field5140, Statics.field69);
                class7[] var32 = new class7[] { class7.field15 };
                class7 var33 = var32[var2.method8365()];
                try {
                    switch(var33.field22) {
                        case 0:
                            class1 var34 = new class1();
                            this.field576 = new class8(var2, var34);
                            method6888(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var54) {
                    method3430(22);
                    return;
                }
            }
            if (field732 == 9 && this.field576.method41()) {
                this.field765 = this.field576.method43();
                this.field576.method42();
                this.field576 = null;
                if (this.field765 == null) {
                    method3430(22);
                    return;
                }
                field579.method2692();
                class311 var37 = class311.method2571();
                var37.field3250.method8348(class313.field3389.field3391);
                var37.field3250.method8349(this.field765.field5140);
                var37.field3250.method8359(this.field765);
                field579.method2682(var37);
                field579.method2674();
                this.field765 = null;
                method6888(6);
            }
            if (field732 == 10 && var1.method7448() > 0) {
                Statics.field1834 = var1.method7438();
                method6888(11);
            }
            if (field732 == 11 && var1.method7448() >= Statics.field1834) {
                var1.method7447(var2.field5139, 0, Statics.field1834);
                var2.field5140 = 0;
                method6888(6);
            }
            if (field732 == 12 && var1.method7448() > 0) {
                field558 = (var1.method7438() + 3) * 60;
                method6888(13);
            }
            if (field732 == 13) {
                field556 = 0;
                class78.method5196(class367.field4108, class367.field3992, field558 / 60 + class367.field4081);
                if (--field558 <= 0) {
                    method6888(0);
                }
            } else {
                if (field732 == 14 && var1.method7448() >= 1) {
                    Statics.field1040 = var1.method7438();
                    method6888(15);
                }
                if (field732 == 15 && var1.method7448() >= Statics.field1040) {
                    boolean var38 = var1.method7438() == 1;
                    var1.method7447(var2.field5139, 0, 4);
                    var2.field5140 = 0;
                    boolean var39 = false;
                    if (var38) {
                        int var40 = var2.method8341() << 24;
                        int var41 = var40 | var2.method8341() << 16;
                        int var42 = var41 | var2.method8341() << 8;
                        int var43 = var42 | var2.method8341();
                        Statics.field1106.method2467(class78.field961, var43);
                    }
                    if (field573) {
                        Statics.field1106.method2404(class78.field961);
                    } else {
                        Statics.field1106.method2404((String) null);
                    }
                    class101.method2973();
                    field776 = var1.method7438();
                    field700 = var1.method7438() == 1;
                    field646 = var1.method7438();
                    field646 <<= 0x8;
                    field646 += var1.method7438();
                    field647 = var1.method7438();
                    var1.method7447(var2.field5139, 0, 8);
                    var2.field5140 = 0;
                    this.field577 = var2.method8573();
                    var1.method7447(var2.field5139, 0, 8);
                    var2.field5140 = 0;
                    field539 = var2.method8573();
                    if (field528 >= 214) {
                        var1.method7447(var2.field5139, 0, 8);
                        var2.field5140 = 0;
                        var2.method8573();
                    }
                    var1.method7447(var2.field5139, 0, 1);
                    var2.field5140 = 0;
                    class312[] var44 = class312.method3532();
                    int var45 = var2.method8313();
                    if (var45 < 0 || var45 >= var44.length) {
                        throw new IOException(var45 + " " + var2.field5140);
                    }
                    field579.field1427 = var44[var45];
                    field579.field1428 = field579.field1427.field3326;
                    var1.method7447(var2.field5139, 0, 2);
                    var2.field5140 = 0;
                    field579.field1428 = var2.method8598();
                    try {
                        client var46 = Statics.field1743;
                        JSObject.getWindow(var46).call("zap", (Object[]) null);
                    } catch (Throwable var53) {
                    }
                    method6888(16);
                }
                if (field732 != 16) {
                    if (field732 == 17 && var1.method7448() >= 2) {
                        var2.field5140 = 0;
                        var1.method7447(var2.field5139, 0, 2);
                        var2.field5140 = 0;
                        Statics.field509 = var2.method8598();
                        method6888(18);
                    }
                    if (field732 == 18 && var1.method7448() >= Statics.field509) {
                        var2.field5140 = 0;
                        var1.method7447(var2.field5139, 0, Statics.field509);
                        var2.field5140 = 0;
                        String var48 = var2.method8588();
                        String var49 = var2.method8588();
                        String var50 = var2.method8588();
                        class78.method5196(var48, var49, var50);
                        method7509(10);
                        if (field560.method8666()) {
                            class78.method638(9);
                        }
                    }
                    if (field732 == 19) {
                        if (field579.field1428 == -1) {
                            if (var1.method7448() < 2) {
                                return;
                            }
                            var1.method7447(var2.field5139, 0, 2);
                            var2.field5140 = 0;
                            field579.field1428 = var2.method8598();
                        }
                        if (var1.method7448() >= field579.field1428) {
                            var1.method7447(var2.field5139, 0, field579.field1428);
                            var2.field5140 = 0;
                            int var51 = field579.field1428;
                            field587.method7137();
                            method674();
                            Statics.method3277(var2);
                            if (var2.field5140 != var51) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field556++;
                        if (field556 > 2000) {
                            if (field733 < 1) {
                                if (Statics.field2224 == Statics.field1771) {
                                    Statics.field1771 = Statics.field3927;
                                } else {
                                    Statics.field1771 = Statics.field2224;
                                }
                                field733++;
                                method6888(0);
                            } else {
                                method3430(-3);
                            }
                        }
                    }
                } else if (var1.method7448() >= field579.field1428) {
                    var2.field5140 = 0;
                    var1.method7447(var2.field5139, 0, field579.field1428);
                    field587.method7134();
                    method5369();
                    Statics.method3277(var2);
                    Statics.field1151 = -1;
                    method3005(false, var2);
                    field579.field1427 = null;
                }
            }
        } catch (IOException var61) {
            if (field733 < 1) {
                if (Statics.field2224 == Statics.field1771) {
                    Statics.field1771 = Statics.field3927;
                } else {
                    Statics.field1771 = Statics.field2224;
                }
                field733++;
                method6888(0);
            } else {
                method3430(-2);
            }
        }
    }

    @ObfuscatedName("mx.hz(B)V")
    public static void method5369() {
        field570 = -1L;
        Statics.field2435.field1094 = 0;
        Statics.field133 = true;
        field538 = true;
        field761 = -1L;
        class37.field253 = new class395();
        field579.method2692();
        field579.field1426.field5140 = 0;
        field579.field1427 = null;
        field579.field1432 = null;
        field579.field1421 = null;
        field579.field1434 = null;
        field579.field1428 = 0;
        field579.field1430 = 0;
        field640 = 0;
        field585 = 0;
        field540 = 0;
        method2242();
        class36.method2928(0);
        class113.field1416.clear();
        class113.field1418.method8072();
        class113.field1414.method6666();
        class113.field1417 = 0;
        field580 = 0;
        field685 = false;
        field645 = 0;
        field650 = 0;
        field611 = 0;
        Statics.field2872 = null;
        field771 = 0;
        field764 = -1;
        field527 = 0;
        field770 = 0;
        field695 = class106.field1345;
        field804 = class106.field1345;
        field668 = 0;
        class110.method103();
        for (int var0 = 0; var0 < 2048; var0++) {
            field726[var0] = null;
        }
        for (int var1 = 0; var1 < 65536; var1++) {
            field705[var1] = null;
        }
        field657 = -1;
        field660.method6534();
        field661.method6534();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field688[var2][var3][var4] = null;
                }
            }
        }
        field659 = new class393();
        Statics.field1907.method1823();
        if (Statics.field1925 > 5000) {
        }
        for (int var5 = 0; var5 < Statics.field1925; var5++) {
            class193 var6 = class193.method2997(var5);
            if (var6 != null) {
                class336.field3567[var5] = 0;
                class336.field3568[var5] = 0;
            }
        }
        Statics.field186.method2635();
        field699 = -1;
        if (field797 != -1) {
            Statics.field185.method5642(field797);
        }
        for (class89 var7 = (class89) field691.method8091(); var7 != null; var7 = (class89) field691.method8092()) {
            method7505(var7, true);
        }
        field797 = -1;
        field691 = new class504(8);
        field624 = null;
        method2242();
        field805.method5666((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field779[var8] = null;
            field655[var8] = false;
        }
        class87.method4150();
        field532 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field740[var9] = true;
        }
        method8224();
        Statics.field3897 = null;
        Statics.field2094 = null;
        Arrays.fill(field607, (Object) null);
        Statics.field1659 = null;
        Arrays.fill(field763, (Object) null);
        for (int var10 = 0; var10 < 8; var10++) {
            field715[var10] = new class383();
        }
        Statics.field3570 = null;
        field616 = false;
    }

    @ObfuscatedName("bo.hj(I)V")
    public static void method674() {
        field579.method2692();
        field579.field1426.field5140 = 0;
        field579.field1427 = null;
        field579.field1432 = null;
        field579.field1421 = null;
        field579.field1434 = null;
        field579.field1428 = 0;
        field579.field1430 = 0;
        field640 = 0;
        method2242();
        field771 = 0;
        field527 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field726[var0] = null;
        }
        Statics.field2696 = null;
        for (int var1 = 0; var1 < field705.length; var1++) {
            class103 var2 = field705[var1];
            if (var2 != null) {
                var2.field1222 = -1;
                var2.field1223 = false;
            }
        }
        class87.method4150();
        method7509(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field740[var3] = true;
        }
        method8224();
    }

    @ObfuscatedName("hc.hc(IB)V")
    public static void method3430(int arg0) {
        int var1 = class78.field944;
        if (arg0 == -3) {
            class78.method5196(class367.field4236, class367.field3995, class367.field4176);
        } else if (arg0 == -2) {
            class78.method5196(class367.field4064, class367.field3998, class367.field4056);
        } else if (arg0 == -1) {
            class78.method5196(class367.field4000, class367.field4019, class367.field4002);
        } else if (arg0 == 3) {
            class78.method638(3);
            class78.field939 = 1;
        } else if (arg0 == 4) {
            class78.method384(0);
        } else if (arg0 == 5) {
            class78.field939 = 2;
            class78.method5196(class367.field4074, class367.field4007, class367.field4048);
        } else if (arg0 == 68) {
            if (!field616) {
                field616 = true;
                method2961();
                return;
            }
            class78.method5196(class367.field4116, class367.field4010, class367.field4164);
        } else if (!field775 && arg0 == 6) {
            class78.method5196(class367.field4116, class367.field4010, class367.field4164);
        } else if (arg0 == 7) {
            class78.method5196(class367.field4128, class367.field4013, class367.field4014);
        } else if (arg0 == 8) {
            class78.method5196(class367.field4015, class367.field4016, class367.field3990);
        } else if (arg0 == 9) {
            class78.method5196(class367.field4018, class367.field4119, class367.field4020);
        } else if (arg0 == 10) {
            class78.method5196(class367.field4021, class367.field3972, class367.field4006);
        } else if (arg0 == 11) {
            class78.method5196(class367.field4024, class367.field4092, class367.field4012);
        } else if (arg0 == 12) {
            class78.method5196(class367.field4027, class367.field4028, class367.field4004);
        } else if (arg0 == 13) {
            class78.method5196(class367.field4030, class367.field4031, class367.field4032);
        } else if (arg0 == 14) {
            class78.method5196(class367.field4033, class367.field4034, class367.field4094);
        } else if (arg0 == 16) {
            class78.method5196(class367.field4036, class367.field4159, class367.field4038);
            class78.method638(33);
        } else if (arg0 == 17) {
            class78.method5196(class367.field4009, class367.field4040, class367.field4209);
        } else if (arg0 == 18) {
            class78.method384(1);
        } else if (arg0 == 19) {
            class78.method5196(class367.field4045, class367.field4046, class367.field4047);
        } else if (arg0 == 20) {
            class78.method5196(class367.field4087, class367.field4049, class367.field4050);
        } else if (arg0 == 22) {
            class78.method5196(class367.field4051, class367.field4052, class367.field4053);
        } else if (arg0 == 23) {
            class78.method5196(class367.field4054, class367.field4055, class367.field4155);
        } else if (arg0 == 24) {
            class78.method5196(class367.field4057, class367.field4058, class367.field4059);
        } else if (arg0 == 25) {
            class78.method5196(class367.field4177, class367.field4061, class367.field4185);
        } else if (arg0 == 26) {
            class78.method5196(class367.field4063, class367.field4100, class367.field4065);
        } else if (arg0 == 27) {
            class78.method5196(class367.field4066, class367.field4067, class367.field4068);
        } else if (arg0 == 31) {
            class78.method5196(class367.field4075, class367.field4114, class367.field4077);
        } else if (arg0 == 32) {
            class78.method384(2);
        } else if (arg0 == 37) {
            class78.method5196(class367.field4193, class367.field3994, class367.field4083);
        } else if (arg0 == 38) {
            class78.method5196(class367.field4136, class367.field4085, class367.field4086);
        } else if (arg0 == 55) {
            class78.method638(8);
        } else if (arg0 == 56) {
            class78.method5196(class367.field4060, class367.field4205, class367.field4093);
            method7509(11);
            return;
        } else if (arg0 == 57) {
            class78.method5196(class367.field4145, class367.field4095, class367.field4096);
            method7509(11);
            return;
        } else if (arg0 == 61) {
            class78.method5196("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class78.method638(7);
        } else if (arg0 == 62) {
            method7509(10);
            class78.method638(9);
            class78.method5196(class367.field4097, class367.field4098, class367.field4099);
            return;
        } else if (arg0 == 63) {
            method7509(10);
            class78.method638(9);
            class78.method5196(class367.field4080, class367.field4101, class367.field4102);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method7509(10);
            class78.method638(9);
            class78.method5196(class367.field4037, class367.field4104, class367.field4105);
            return;
        } else if (arg0 == 71) {
            method7509(10);
            class78.method638(7);
            class78.method5196("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method7509(10);
            class78.method638(6);
            class78.method5196(class367.field4234, class367.field4235, class367.field4089);
        } else if (arg0 == 72) {
            method7509(10);
            class78.method638(32);
        } else {
            class78.method5196(class367.field4106, class367.field4168, class367.field4221);
        }
        method7509(10);
        int var4 = class78.field944;
        boolean var5 = var1 != var4;
        if (!var5 && field560.method8666()) {
            class78.method638(9);
        }
    }

    @ObfuscatedName("ih.hv(I)V")
    public static final void method3944() {
        field579.method2677();
        method3592();
        Statics.field53.method4294();
        for (int var0 = 0; var0 < 4; var0++) {
            field594[var0].method3943();
        }
        field757.method3902();
        System.gc();
        class320.method3819(0, 0);
        class320.method7699();
        field772 = false;
        class71.method836();
        method7509(10);
    }

    @ObfuscatedName("ab.ht(II)V")
    public static final void method54(int arg0) {
        method3944();
        switch(arg0) {
            case 1:
                class78.method638(24);
                class78.method5196(class367.field4082, class367.field4182, class367.field4183);
                break;
            case 2:
                class78.method5657();
        }
    }

    @ObfuscatedName("lp.hq(I)J")
    public static long method5299() {
        return field539;
    }

    @ObfuscatedName("im.hx(I)V")
    public static final void method3592() {
        class200.method2789();
        class202.method816();
        class191.method8222();
        class523.method2025();
        class521.method6196();
        class201.field2013.method5288();
        class222.field2303.method5288();
        class212.field2130.method5288();
        class198.field1981.method5288();
        class198.field1991.method5288();
        class219.field2170.method5288();
        class219.field2171.method5288();
        class219.field2184.method5288();
        class190.method670();
        class197.field1971.method5288();
        class188.method3292();
        class220.method5588();
        class195.method467();
        class203.method2962();
        class206.method284();
        class221.method5345();
        class216.method288();
        class223.field2319.method5288();
        class223.field2333.method5288();
        class223.field2321.method5288();
        class211.method3432();
        class218.method2340();
        class214.method2774();
        Statics.field1989.method8184();
        Statics.field380.method8184();
        class207.field2090.method5288();
        class209.field2101.method5288();
        class196.method3013();
        class194.field1931.method5288();
        class189.field1910.method5288();
        Statics.method6501();
        class215.method335();
        class193.method2790();
        class213.method2777();
        field812.method5288();
        field690.method5288();
        class344.field3625.method5288();
        class344.field3629.method7231();
        class344.field3627 = 0;
        Statics.field185.method5651();
        ((class251) class241.field2551.field2837).method4500();
        class81.field1006.method5288();
        field811.method7231();
        Statics.field1118.method6277();
        Statics.field2010.method6277();
        Statics.field1917.method6277();
        Statics.field4578.method6277();
        Statics.field321.method6277();
        Statics.field3397.method6277();
        Statics.field3882.method6277();
        Statics.field150.method6277();
        Statics.field3840.method6277();
        Statics.field3443.method6277();
        Statics.field4813.method6277();
        Statics.field4436.method6277();
        Statics.field2002.method6277();
        Statics.field2393.method6277();
        Statics.field516.method6277();
        Statics.field3416.method6277();
        Statics.field2011.method6277();
        Statics.field2559.method6277();
        Statics.field4292.method6277();
        Statics.field2029.method6277();
        Statics.field3899.method6277();
        Statics.field2659.method6277();
    }

    @ObfuscatedName("ff.hb(B)V")
    public static final void method2992() {
        if (field585 > 0) {
            method3944();
        } else {
            field587.method7136();
            method7509(40);
            Statics.field60 = field579.method2679();
            field579.method2673();
        }
    }

    @ObfuscatedName("ey.he(ZB)V")
    public static final void method2807(boolean arg0) {
        if (arg0) {
            field559 = class78.field952 ? class142.field1628 : class142.field1630;
        } else {
            field559 = Statics.field1106.method2411(class78.field961) ? class142.field1636 : class142.field1631;
        }
    }

    @ObfuscatedName("client.hw(B)V")
    public final void method1186() {
        if (field640 > 1) {
            field640--;
        }
        if (field585 > 0) {
            field585--;
        }
        if (field725) {
            field725 = false;
            method2992();
            return;
        }
        if (!field666) {
            method6186();
        }
        for (int var1 = 0; var1 < 100 && this.method1193(field579); var1++) {
        }
        if (field530 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field253.method6577();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field587.field4618) {
                    class311 var6 = class311.method2978(class309.field3212, field579.field1425);
                    var6.field3250.method8348(0);
                    int var7 = var6.field3250.field5140;
                    field587.method7131(var6.field3250);
                    var6.field3250.method8362(var6.field3250.field5140 - var7);
                    field579.method2682(var6);
                    field587.method7135();
                }
                Object var8 = Statics.field2435.field1091;
                synchronized (Statics.field2435.field1091) {
                    if (!field537) {
                        Statics.field2435.field1094 = 0;
                    } else if (class36.field242 != 0 || Statics.field2435.field1094 >= 40) {
                        class311 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field2435.field1094 && (var9 == null || var9.field3250.field5140 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field2435.field1093[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field2435.field1090[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field653 != var16 || field598 != var15) {
                                if (var9 == null) {
                                    var9 = class311.method2978(class309.field3189, field579.field1425);
                                    var9.field3250.method8348(0);
                                    var10 = var9.field3250.field5140;
                                    var9.field3250.field5140 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field709 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field653;
                                    var18 = var15 - field598;
                                    var19 = (int) ((Statics.field2435.field1095[var14] - field709) / 20L);
                                    var12 = (int) ((Statics.field2435.field1095[var14] - field709) % 20L + (long) var12);
                                }
                                field653 = var16;
                                field598 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3250.method8349((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3250.method8348(var19 + 128);
                                    var9.field3250.method8349((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3250.method8348(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3250.method8351(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3250.method8351(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3250.method8349((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3250.method8351(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3250.method8351(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field709 = Statics.field2435.field1095[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3250.method8362(var9.field3250.field5140 - var10);
                            int var20 = var9.field3250.field5140;
                            var9.field3250.field5140 = var10;
                            var9.field3250.method8348(var12 / var13);
                            var9.field3250.method8348(var12 % var13);
                            var9.field3250.field5140 = var20;
                            field579.method2682(var9);
                        }
                        if (var11 >= Statics.field2435.field1094) {
                            Statics.field2435.field1094 = 0;
                        } else {
                            Statics.field2435.field1094 -= var11;
                            System.arraycopy(Statics.field2435.field1090, var11, Statics.field2435.field1090, 0, Statics.field2435.field1094);
                            System.arraycopy(Statics.field2435.field1093, var11, Statics.field2435.field1093, 0, Statics.field2435.field1094);
                            System.arraycopy(Statics.field2435.field1095, var11, Statics.field2435.field1095, 0, Statics.field2435.field1094);
                        }
                    }
                }
                if (class36.field242 == 1 || !Statics.field1462 && class36.field242 == 4 || class36.field242 == 2) {
                    long var22 = class36.field245 - field570;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field570 = class36.field245;
                    int var24 = class36.field248;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field4908) {
                        var24 = Statics.field4908;
                    }
                    int var25 = class36.field244;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field3598) {
                        var25 = Statics.field3598;
                    }
                    int var26 = (int) var22;
                    class311 var27 = class311.method2978(class309.field3216, field579.field1425);
                    var27.field3250.method8349((var26 << 1) + (class36.field242 == 2 ? 1 : 0));
                    var27.field3250.method8349(var25);
                    var27.field3250.method8349(var24);
                    field579.method2682(var27);
                }
                if (field731 != 0) {
                    class311 var28 = class311.method2978(class309.field3150, field579.field1425);
                    var28.field3250.method8349(field731);
                    field579.method2682(var28);
                }
                if (field756.field2377 > 0) {
                    class311 var29 = class311.method2978(class309.field3195, field579.field1425);
                    var29.field3250.method8349(0);
                    int var30 = var29.field3250.field5140;
                    long var31 = class316.method6401();
                    for (int var33 = 0; var33 < field756.field2377; var33++) {
                        long var34 = var31 - field761;
                        if (var34 > 16777215L) {
                            var34 = 16777215L;
                        }
                        field761 = var31;
                        var29.field3250.method8348(field756.field2374[var33]);
                        var29.field3250.method8571((int) var34);
                    }
                    var29.field3250.method8581(var29.field3250.field5140 - var30);
                    field579.method2682(var29);
                }
                if (field620 > 0) {
                    field620--;
                }
                if (field756.method3924(96) || field756.method3924(97) || field756.method3924(98) || field756.method3924(99)) {
                    field551 = true;
                }
                if (field551 && field620 <= 0) {
                    field620 = 20;
                    field551 = false;
                    class311 var36 = class311.method2978(class309.field3156, field579.field1425);
                    var36.field3250.method8506(field650);
                    var36.field3250.method8405(field605);
                    field579.method2682(var36);
                }
                if (Statics.field133 && !field538) {
                    field538 = true;
                    class311 var37 = class311.method2978(class309.field3171, field579.field1425);
                    var37.field3250.method8348(1);
                    field579.method2682(var37);
                }
                if (!Statics.field133 && field538) {
                    field538 = false;
                    class311 var38 = class311.method2978(class309.field3171, field579.field1425);
                    var38.field3250.method8348(0);
                    field579.method2682(var38);
                }
                if (Statics.field4641 != null) {
                    Statics.field4641.method7914();
                }
                method2972();
                if (Statics.field308) {
                    for (int var39 = 0; var39 < class110.field1375; var39++) {
                        class94 var40 = field726[class110.field1376[var39]];
                        var40.method2283();
                    }
                    Statics.field308 = false;
                }
                if (Statics.field1072 != field764) {
                    field764 = Statics.field1072;
                    method2211(Statics.field1072);
                }
                if (field530 != 30) {
                    return;
                }
                method2755();
                Statics.method2015();
                field579.field1430++;
                if (field579.field1430 > 750) {
                    method2992();
                    return;
                }
                method2931();
                for (int var41 = 0; var41 < field668; var41++) {
                    int var42 = field581[var41];
                    class103 var43 = field705[var42];
                    if (var43 != null) {
                        method39(var43, var43.field1328.field2050);
                    }
                }
                int[] var44 = class110.field1376;
                for (int var45 = 0; var45 < class110.field1375; var45++) {
                    class94 var46 = field726[var44[var45]];
                    if (var46 != null && var46.field1210 > 0) {
                        var46.field1210--;
                        if (var46.field1210 == 0) {
                            var46.field1215 = null;
                        }
                    }
                }
                for (int var47 = 0; var47 < field668; var47++) {
                    int var48 = field581[var47];
                    class103 var49 = field705[var48];
                    if (var49 != null && var49.field1210 > 0) {
                        var49.field1210--;
                        if (var49.field1210 == 0) {
                            var49.field1215 = null;
                        }
                    }
                }
                field710++;
                if (field641 != 0) {
                    field762 += 20;
                    if (field762 >= 400) {
                        field641 = 0;
                    }
                }
                class347 var50 = Statics.field493;
                class347 var51 = Statics.field4375;
                Statics.field493 = null;
                Statics.field4375 = null;
                field706 = null;
                field686 = false;
                field648 = false;
                field758 = 0;
                while (field756.method3915() && field758 < 128) {
                    if (field776 >= 2 && field756.method3924(82) && field756.field2387 == 66) {
                        String var52 = class113.method3982();
                        Statics.field1743.method549(var52);
                    } else if (field611 != 1 || field756.field2376 <= 0) {
                        field760[field758] = field756.field2387;
                        field662[field758] = field756.field2376;
                        field758++;
                    }
                }
                boolean var53 = field776 >= 2;
                if (var53 && field756.method3924(82) && field756.method3924(81) && field731 != 0) {
                    int var54 = Statics.field2696.field1140 - field731;
                    if (var54 < 0) {
                        var54 = 0;
                    } else if (var54 > 3) {
                        var54 = 3;
                    }
                    if (Statics.field2696.field1140 != var54) {
                        int var55 = Statics.field108 + Statics.field2696.field1258[0];
                        int var56 = Statics.field103 + Statics.field2696.field1259[0];
                        class311 var57 = class311.method2978(class309.field3155, field579.field1425);
                        var57.field3250.method8405(var55);
                        var57.field3250.method8506(var56);
                        var57.field3250.method8351(0);
                        var57.field3250.method8485(var54);
                        field579.method2682(var57);
                    }
                    field731 = 0;
                }
                if (class36.field242 == 1) {
                    field757.method3902();
                }
                if (field797 != -1) {
                    method8182(field797, 0, 0, Statics.field3598, Statics.field4908, 0, 0);
                }
                field665++;
                while (true) {
                    class90 var58;
                    class347 var59;
                    class347 var60;
                    do {
                        var58 = (class90) field543.method6531();
                        if (var58 == null) {
                            while (true) {
                                class90 var61;
                                class347 var62;
                                class347 var63;
                                do {
                                    var61 = (class90) field735.method6531();
                                    if (var61 == null) {
                                        while (true) {
                                            class90 var64;
                                            class347 var65;
                                            class347 var66;
                                            do {
                                                var64 = (class90) field707.method6531();
                                                if (var64 == null) {
                                                    while (true) {
                                                        while (true) {
                                                            class226 var67;
                                                            class347 var68;
                                                            do {
                                                                do {
                                                                    do {
                                                                        var67 = (class226) field535.method6531();
                                                                        if (var67 == null) {
                                                                            this.method1557();
                                                                            method437();
                                                                            if (field702 != null) {
                                                                                this.method1199();
                                                                            }
                                                                            if (class245.method4335()) {
                                                                                int var74 = class245.field2620;
                                                                                int var75 = class245.field2636;
                                                                                class311 var76 = class311.method2978(class309.field3222, field579.field1425);
                                                                                var76.field3250.method8348(5);
                                                                                var76.field3250.method8406(Statics.field103 + var75);
                                                                                var76.field3250.method8348(field756.method3924(82) ? (field756.method3924(81) ? 2 : 1) : 0);
                                                                                var76.field3250.method8406(Statics.field108 + var74);
                                                                                field579.method2682(var76);
                                                                                class245.method4418();
                                                                                field536 = class36.field244;
                                                                                field639 = class36.field248;
                                                                                field641 = 1;
                                                                                field762 = 0;
                                                                                field527 = var74;
                                                                                field770 = var75;
                                                                            }
                                                                            if (Statics.field493 != var50) {
                                                                                if (var50 != null) {
                                                                                    method2979(var50);
                                                                                }
                                                                                if (Statics.field493 != null) {
                                                                                    method2979(Statics.field493);
                                                                                }
                                                                            }
                                                                            if (Statics.field4375 != var51 && field789 == field531) {
                                                                                if (var51 != null) {
                                                                                    method2979(var51);
                                                                                }
                                                                                if (Statics.field4375 != null) {
                                                                                    method2979(Statics.field4375);
                                                                                }
                                                                            }
                                                                            if (Statics.field4375 == null) {
                                                                                if (field789 > 0) {
                                                                                    field789--;
                                                                                }
                                                                            } else if (field789 < field531) {
                                                                                field789++;
                                                                                if (field789 == field531) {
                                                                                    method2979(Statics.field4375);
                                                                                }
                                                                            }
                                                                            if (field611 == 0) {
                                                                                int var77 = Statics.field2696.field1227;
                                                                                int var78 = Statics.field2696.field1187;
                                                                                if (Statics.field1029 - var77 < -500 || Statics.field1029 - var77 > 500 || Statics.field3040 - var78 < -500 || Statics.field3040 - var78 > 500) {
                                                                                    Statics.field1029 = var77;
                                                                                    Statics.field3040 = var78;
                                                                                }
                                                                                if (Statics.field1029 != var77) {
                                                                                    Statics.field1029 += (var77 - Statics.field1029) / 16;
                                                                                }
                                                                                if (Statics.field3040 != var78) {
                                                                                    Statics.field3040 += (var78 - Statics.field3040) / 16;
                                                                                }
                                                                                int var79 = Statics.field1029 >> 7;
                                                                                int var80 = Statics.field3040 >> 7;
                                                                                int var81 = method2725(Statics.field1029, Statics.field3040, Statics.field1072);
                                                                                int var82 = 0;
                                                                                if (var79 > 3 && var80 > 3 && var79 < 100 && var80 < 100) {
                                                                                    for (int var83 = var79 - 4; var83 <= var79 + 4; var83++) {
                                                                                        for (int var84 = var80 - 4; var84 <= var80 + 4; var84++) {
                                                                                            int var85 = Statics.field1072;
                                                                                            if (var85 < 3 && (class84.field1032[1][var83][var84] & 0x2) == 2) {
                                                                                                var85++;
                                                                                            }
                                                                                            int var86 = var81 - class84.field1042[var85][var83][var84];
                                                                                            if (var86 > var82) {
                                                                                                var82 = var86;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                int var87 = var82 * 192;
                                                                                if (var87 > 98048) {
                                                                                    var87 = 98048;
                                                                                }
                                                                                if (var87 < 32768) {
                                                                                    var87 = 32768;
                                                                                }
                                                                                if (var87 > field622) {
                                                                                    field622 += (var87 - field622) / 24;
                                                                                } else if (var87 < field622) {
                                                                                    field622 += (var87 - field622) / 80;
                                                                                }
                                                                                Statics.field4640 = method2725(Statics.field2696.field1227, Statics.field2696.field1187, Statics.field1072) - field612;
                                                                            } else if (field611 == 1) {
                                                                                if (field619 && Statics.field2696 != null) {
                                                                                    int var88 = Statics.field2696.field1258[0];
                                                                                    int var89 = Statics.field2696.field1259[0];
                                                                                    if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                                                                                        Statics.field1029 = Statics.field2696.field1227;
                                                                                        int var90 = method2725(Statics.field2696.field1227, Statics.field2696.field1187, Statics.field1072) - field612;
                                                                                        if (var90 < Statics.field4640) {
                                                                                            Statics.field4640 = var90;
                                                                                        }
                                                                                        Statics.field3040 = Statics.field2696.field1187;
                                                                                        field619 = false;
                                                                                    }
                                                                                }
                                                                                short var91 = -1;
                                                                                if (field756.method3924(33)) {
                                                                                    var91 = 0;
                                                                                } else if (field756.method3924(49)) {
                                                                                    var91 = 1024;
                                                                                }
                                                                                if (field756.method3924(48)) {
                                                                                    if (var91 == 0) {
                                                                                        var91 = 1792;
                                                                                    } else if (var91 == 1024) {
                                                                                        var91 = 1280;
                                                                                    } else {
                                                                                        var91 = 1536;
                                                                                    }
                                                                                } else if (field756.method3924(50)) {
                                                                                    if (var91 == 0) {
                                                                                        var91 = 256;
                                                                                    } else if (var91 == 1024) {
                                                                                        var91 = 768;
                                                                                    } else {
                                                                                        var91 = 512;
                                                                                    }
                                                                                }
                                                                                byte var92 = 0;
                                                                                if (field756.method3924(35)) {
                                                                                    var92 = -1;
                                                                                } else if (field756.method3924(51)) {
                                                                                    var92 = 1;
                                                                                }
                                                                                int var93 = 0;
                                                                                if (var91 >= 0 || var92 != 0) {
                                                                                    int var94 = field756.method3924(81) ? field617 : field810;
                                                                                    var93 = var94 * 16;
                                                                                    field614 = var91;
                                                                                    field615 = var92;
                                                                                }
                                                                                if (field613 < var93) {
                                                                                    field613 += var93 / 8;
                                                                                    if (field613 > var93) {
                                                                                        field613 = var93;
                                                                                    }
                                                                                } else if (field613 > var93) {
                                                                                    field613 = field613 * 9 / 10;
                                                                                }
                                                                                if (field613 > 0) {
                                                                                    int var95 = field613 / 16;
                                                                                    if (field614 >= 0) {
                                                                                        int var96 = field614 - Statics.field2875 & 0x7FF;
                                                                                        int var97 = class241.field2553[var96];
                                                                                        int var98 = class241.field2554[var96];
                                                                                        Statics.field1029 += var95 * var97 / 65536;
                                                                                        Statics.field3040 += var95 * var98 / 65536;
                                                                                    }
                                                                                    if (field615 != 0) {
                                                                                        Statics.field4640 += field615 * var95;
                                                                                        if (Statics.field4640 > 0) {
                                                                                            Statics.field4640 = 0;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    field614 = -1;
                                                                                    field615 = -1;
                                                                                }
                                                                                if (field756.method3924(13)) {
                                                                                    method7121();
                                                                                }
                                                                            }
                                                                            if (class36.field234 == 4 && Statics.field1462) {
                                                                                int var99 = class36.field241 - field610;
                                                                                field683 = var99 * 2;
                                                                                field610 = var99 == -1 || var99 == 1 ? class36.field241 : (field610 + class36.field241) / 2;
                                                                                int var100 = field609 - class36.field235;
                                                                                field679 = var100 * 2;
                                                                                field609 = var100 == -1 || var100 == 1 ? class36.field235 : (field609 + class36.field235) / 2;
                                                                            } else {
                                                                                if (field756.method3924(96)) {
                                                                                    field679 += (-24 - field679) / 2;
                                                                                } else if (field756.method3924(97)) {
                                                                                    field679 += (24 - field679) / 2;
                                                                                } else {
                                                                                    field679 /= 2;
                                                                                }
                                                                                if (field756.method3924(98)) {
                                                                                    field683 += (12 - field683) / 2;
                                                                                } else if (field756.method3924(99)) {
                                                                                    field683 += (-12 - field683) / 2;
                                                                                } else {
                                                                                    field683 /= 2;
                                                                                }
                                                                                field610 = class36.field241;
                                                                                field609 = class36.field235;
                                                                            }
                                                                            field650 = field679 / 2 + field650 & 0x7FF;
                                                                            field605 += field683 / 2;
                                                                            if (field605 < 128) {
                                                                                field605 = 128;
                                                                            }
                                                                            if (field605 > 383) {
                                                                                field605 = 383;
                                                                            }
                                                                            if (field727) {
                                                                                method5134(Statics.field4702, Statics.field4719, Statics.field1845);
                                                                                method2088(Statics.field77, Statics.field517);
                                                                                if (Statics.field824 == Statics.field4702 && Statics.field94 == Statics.field4719 && Statics.field2931 == Statics.field1845 && Statics.field77 == Statics.field3946 && Statics.field517 == Statics.field2875) {
                                                                                    field727 = false;
                                                                                    field769 = false;
                                                                                    field780 = false;
                                                                                    field781 = false;
                                                                                    Statics.field1664 = 0;
                                                                                    Statics.field4723 = 0;
                                                                                    Statics.field1755 = 0;
                                                                                    Statics.field2432 = 0;
                                                                                    Statics.field4789 = 0;
                                                                                    Statics.field1536 = 0;
                                                                                    Statics.field1050 = 0;
                                                                                    Statics.field1923 = 0;
                                                                                    Statics.field225 = 0;
                                                                                    Statics.field324 = 0;
                                                                                    field783 = null;
                                                                                    field785 = null;
                                                                                    field784 = null;
                                                                                }
                                                                            } else if (field769) {
                                                                                method792();
                                                                            }
                                                                            for (int var101 = 0; var101 < 5; var101++) {
                                                                                int var10002 = field708[var101]++;
                                                                            }
                                                                            Statics.field186.method2643();
                                                                            int var102 = ++class36.field231 - 1;
                                                                            int var104 = class35.method2801();
                                                                            if (var102 > 15000 && var104 > 15000) {
                                                                                field585 = 250;
                                                                                class36.method2928(14500);
                                                                                class311 var105 = class311.method2978(class309.field3227, field579.field1425);
                                                                                field579.method2682(var105);
                                                                            }
                                                                            Statics.field1907.method1797();
                                                                            for (int var106 = 0; var106 < field816.size(); var106++) {
                                                                                int var107 = (Integer) field816.get(var106);
                                                                                class140 var108 = (class140) class223.field2321.method5286((long) var107);
                                                                                class140 var109;
                                                                                if (var108 == null) {
                                                                                    class374 var110 = Statics.field2316;
                                                                                    class374 var111 = Statics.field2318;
                                                                                    boolean var112 = true;
                                                                                    byte[] var113 = var110.method6312(var107 >> 16 & 0xFFFF, var107 & 0xFFFF);
                                                                                    class140 var115;
                                                                                    if (var113 == null) {
                                                                                        boolean var114 = false;
                                                                                        var115 = null;
                                                                                    } else {
                                                                                        int var116 = (var113[1] & 0xFF) << 8 | var113[2] & 0xFF;
                                                                                        byte[] var117 = var111.method6312(var116, 0);
                                                                                        if (var117 == null) {
                                                                                            var112 = false;
                                                                                        }
                                                                                        if (var112) {
                                                                                            if (Statics.field334 == null) {
                                                                                                Statics.field3511 = Runtime.getRuntime().availableProcessors();
                                                                                                Statics.field334 = new ThreadPoolExecutor(0, Statics.field3511, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field3511 * 100 + 100), new class65(this));
                                                                                            }
                                                                                            try {
                                                                                                var115 = new class140(var110, var111, var107, false);
                                                                                            } catch (Exception var125) {
                                                                                                var115 = null;
                                                                                            }
                                                                                        } else {
                                                                                            var115 = null;
                                                                                        }
                                                                                    }
                                                                                    if (var115 != null) {
                                                                                        class223.field2321.method5289(var115, (long) var107);
                                                                                    }
                                                                                    var109 = var115;
                                                                                } else {
                                                                                    var109 = var108;
                                                                                }
                                                                                int var121;
                                                                                if (var109 == null) {
                                                                                    var121 = 2;
                                                                                } else {
                                                                                    var121 = var109.method2938() ? 0 : 1;
                                                                                }
                                                                                if (var121 != 2) {
                                                                                    field816.remove(var106);
                                                                                    var106--;
                                                                                }
                                                                            }
                                                                            field579.field1431++;
                                                                            if (field579.field1431 > 50) {
                                                                                class311 var122 = class311.method2978(class309.field3181, field579.field1425);
                                                                                field579.method2682(var122);
                                                                            }
                                                                            try {
                                                                                field579.method2674();
                                                                            } catch (IOException var124) {
                                                                                method2992();
                                                                            }
                                                                            return;
                                                                        }
                                                                    } while (var67 == null);
                                                                } while (var67.field2366 == null);
                                                                if (var67.field2366.field3757 < 0) {
                                                                    break;
                                                                }
                                                                var68 = Statics.field185.method5639(var67.field2366.field3696);
                                                            } while (var68 == null || var68.field3815 == null || var68.field3815.length == 0 || var67.field2366.field3757 >= var68.field3815.length || var68.field3815[var67.field2366.field3757] != var67.field2366);
                                                            if (var67.field2366.field3679 == 11 && var67.field2369 == 0) {
                                                                if (var67.field2366.method6079(var67.field2371, var67.field2368, 0, 0)) {
                                                                    switch(var67.field2366.method6030()) {
                                                                        case 0:
                                                                            class32.method4708(var67.field2366.method6008(), true, false);
                                                                            break;
                                                                        case 1:
                                                                            int var69 = method2234(var67.field2366);
                                                                            boolean var70 = (var69 >> 22 & 0x1) != 0;
                                                                            if (var70) {
                                                                                int[] var71 = var67.field2366.method6009();
                                                                                if (var71 != null) {
                                                                                    class311 var72 = class311.method2978(class309.field3138, field579.field1425);
                                                                                    var72.field3250.method8506(var67.field2366.field3757);
                                                                                    var72.field3250.method8351(var67.field2366.method6087());
                                                                                    var72.field3250.method8418(var67.field2366.field3676);
                                                                                    var72.field3250.method8420(var71[1]);
                                                                                    var72.field3250.method8585(var71[0]);
                                                                                    var72.field3250.method8585(var71[2]);
                                                                                    field579.method2682(var72);
                                                                                }
                                                                            }
                                                                    }
                                                                }
                                                            } else if (var67.field2366.field3679 == 12) {
                                                                class345 var73 = var67.field2366.method6013();
                                                                if (var73 != null && var73.method5755()) {
                                                                    switch(var67.field2369) {
                                                                        case 0:
                                                                            field757.method3899(var67.field2366);
                                                                            var73.method5703(true);
                                                                            var73.method5742(var67.field2371, var67.field2368, field756.method3924(82), field756.method3924(81));
                                                                            break;
                                                                        case 1:
                                                                            var73.method5961(var67.field2371, var67.field2368);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var65 = var64.field1088;
                                                if (var65.field3757 < 0) {
                                                    break;
                                                }
                                                var66 = Statics.field185.method5639(var65.field3696);
                                            } while (var66 == null || var66.field3815 == null || var65.field3757 >= var66.field3815.length || var66.field3815[var65.field3757] != var65);
                                            class72.method2004(var64);
                                        }
                                    }
                                    var62 = var61.field1088;
                                    if (var62.field3757 < 0) {
                                        break;
                                    }
                                    var63 = Statics.field185.method5639(var62.field3696);
                                } while (var63 == null || var63.field3815 == null || var62.field3757 >= var63.field3815.length || var63.field3815[var62.field3757] != var62);
                                class72.method2004(var61);
                            }
                        }
                        var59 = var58.field1088;
                        if (var59.field3757 < 0) {
                            break;
                        }
                        var60 = Statics.field185.method5639(var59.field3696);
                    } while (var60 == null || var60.field3815 == null || var59.field3757 >= var60.field3815.length || var60.field3815[var59.field3757] != var59);
                    class72.method2004(var58);
                }
            }
            class311 var4 = class311.method2978(class309.field3139, field579.field1425);
            var4.field3250.method8348(0);
            int var5 = var4.field3250.field5140;
            class37.method5302(var4.field3250);
            var4.field3250.method8362(var4.field3250.field5140 - var5);
            field579.method2682(var4);
        }
    }

    @ObfuscatedName("tc.iv(Lif;IIII)V")
    public static void method8046(class223 arg0, int arg1, int arg2, int arg3) {
        if (field645 < 50 && Statics.field1106.method2473() != 0 && arg0.field2329 != null && arg1 < arg0.field2329.length) {
            method2244(arg0.field2329[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("or.ik(Lif;IIIS)V")
    public static void method6515(class223 arg0, int arg1, int arg2, int arg3) {
        if (field645 < 50 && Statics.field1106.method2473() != 0 && arg0.field2323 != null && arg0.field2323.containsKey(arg1)) {
            method2244((Integer) arg0.field2323.get(arg1), arg2, arg3);
        }
    }

    @ObfuscatedName("do.ir(IIIB)V")
    public static void method2244(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field813[field645] = var3;
        field575[field645] = var4;
        field601[field645] = 0;
        field778[field645] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field777[field645] = (var6 << 16) + (var7 << 8) + var5;
        field645++;
    }

    @ObfuscatedName("ru.ie(IIII)V")
    public static void method7516(int arg0, int arg1, int arg2) {
        if (Statics.field1106.method2401() == 0 || arg1 == 0 || field645 >= 50) {
            return;
        }
        field813[field645] = arg0;
        field575[field645] = arg1;
        field601[field645] = arg2;
        field778[field645] = null;
        field777[field645] = 0;
        field645++;
    }

    @ObfuscatedName("mq.in(II)V")
    public static void method5582(int arg0) {
        if (arg0 == -1 && !field772) {
            class320.method3819(0, 0);
        } else if (arg0 != -1) {
            boolean var2;
            if (class320.field3441.isEmpty()) {
                var2 = false;
            } else {
                class332 var1 = (class332) class320.field3441.get(0);
                var2 = var1 != null && var1.field3540 == arg0;
            }
            if (!var2 && Statics.field1106.method2399() != 0) {
                ArrayList var3 = new ArrayList();
                var3.add(new class332(Statics.field2393, arg0, 0, Statics.field1106.method2399(), false));
                if (field772) {
                    class320.method5120(var3, 0, 100, 100, 0);
                } else {
                    class320.method2981(var3, 0, 100, 100, 0, false);
                }
            }
        }
    }

    @ObfuscatedName("hx.is(Ljava/util/ArrayList;IIIII)V")
    public static void method3459(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field772) {
            class320.method3819(0, 0);
        } else if (var5 != -1) {
            boolean var7;
            if (class320.field3441.isEmpty()) {
                var7 = false;
            } else {
                class332 var6 = (class332) class320.field3441.get(0);
                var7 = var6 != null && var6.field3540 == var5;
            }
            if (!var7 && Statics.field1106.method2399() != 0) {
                ArrayList var8 = new ArrayList();
                for (int var9 = 0; var9 < arg0.size(); var9++) {
                    var8.add(new class332(Statics.field2393, (Integer) arg0.get(var9), 0, Statics.field1106.method2399(), false));
                }
                if (field772) {
                    class320.method5120(var8, arg1, arg2, arg3, arg4);
                } else {
                    class320.method2981(var8, arg1, arg2, arg3, arg4, false);
                }
            }
        }
    }

    @ObfuscatedName("qp.im(III)V")
    public static void method7224(int arg0, int arg1) {
        if (Statics.field1106.method2399() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class332(Statics.field4436, arg0, 0, Statics.field1106.method2399(), false));
            class320.method2981(var2, 0, 0, 0, 0, true);
            field772 = true;
        }
    }

    @ObfuscatedName("client.ix(III)V")
    public void method1187(int arg0, int arg1) {
        if (field579 != null && field579.field1425 != null && arg0 > -1 && Statics.field1106.method2399() > 0 && !field772) {
            class311 var3 = class311.method2978(class309.field3151, field579.field1425);
            var3.field3250.method8351(arg0);
            field579.method2682(var3);
        }
    }

    @ObfuscatedName("ft.iu(B)V")
    public static final void method2972() {
        if (!Statics.field1888) {
            return;
        }
        if (Statics.field3897 != null) {
            Statics.field3897.method7368();
        }
        for (int var0 = 0; var0 < class110.field1375; var0++) {
            class94 var1 = field726[class110.field1376[var0]];
            var1.method2271();
        }
        Statics.field1888 = false;
    }

    @ObfuscatedName("pa.ii(Lnm;III)V")
    public static final void method6729(class347 arg0, int arg1, int arg2) {
        if (field771 != 0 && field771 != 3 || field666 || !(class36.field242 == 1 || !Statics.field1462 && class36.field242 == 4)) {
            return;
        }
        class335 var3 = arg0.method5993(Statics.field185, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field244 - arg1;
        int var5 = class36.field248 - arg2;
        if (!var3.method5613(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3564 / 2;
        int var7 = var5 - var3.field3559 / 2;
        int var8 = field650 & 0x7FF;
        int var9 = class241.field2553[var8];
        int var10 = class241.field2554[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2696.field1227 + var11 >> 7;
        int var14 = Statics.field2696.field1187 - var12 >> 7;
        class311 var15 = class311.method2978(class309.field3198, field579.field1425);
        var15.field3250.method8348(18);
        var15.field3250.method8406(Statics.field103 + var14);
        var15.field3250.method8348(field756.method3924(82) ? (field756.method3924(81) ? 2 : 1) : 0);
        var15.field3250.method8406(Statics.field108 + var13);
        var15.field3250.method8348(var6);
        var15.field3250.method8348(var7);
        var15.field3250.method8349(field650);
        var15.field3250.method8348(57);
        var15.field3250.method8348(0);
        var15.field3250.method8348(0);
        var15.field3250.method8348(89);
        var15.field3250.method8349(Statics.field2696.field1227);
        var15.field3250.method8349(Statics.field2696.field1187);
        var15.field3250.method8348(63);
        field579.method2682(var15);
        field527 = var13;
        field770 = var14;
    }

    @ObfuscatedName("gk.iw(Ljava/lang/String;B)V")
    public static final void method3110(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1106.method2442(!Statics.field1106.method2386());
            if (Statics.field1106.method2386()) {
                class113.method6942(99, "", "Roofs are now all hidden");
            } else {
                class113.method6942(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class402.method677(arg0.substring(5).trim()) == 1;
            Statics.field1743.method487(var1);
            class241.method4153(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field550 = !field550;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field1106.method2392();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field649 = !field649;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field716 = !field716;
        }
        if (field776 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field4641.field4984 = !Statics.field4641.field4984;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field1106.method2457(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field1106.method2457(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2992();
            }
        }
        class311 var2 = class311.method2978(class309.field3188, field579.field1425);
        var2.field3250.method8348(arg0.length() + 1);
        var2.field3250.method8374(arg0);
        field579.method2682(var2);
    }

    @ObfuscatedName("fp.iz(IB)I")
    public static final int method3010(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("dc.iy(IB)I")
    public static final int method2563(int arg0) {
        return Math.abs(arg0 - Statics.field2875) > 1024 ? 2048 * (arg0 < Statics.field2875 ? 1 : -1) + arg0 : arg0;
    }

    @ObfuscatedName("ky.io(IIII)V")
    public static final void method5134(int arg0, int arg1, int arg2) {
        if (Statics.field824 < arg0) {
            Statics.field824 += Statics.field1536 * (arg0 - Statics.field824) / 1000 + Statics.field1050;
            if (Statics.field824 > arg0) {
                Statics.field824 = arg0;
            }
        }
        if (Statics.field824 > arg0) {
            Statics.field824 -= Statics.field1536 * (Statics.field824 - arg0) / 1000 + Statics.field1050;
            if (Statics.field824 < arg0) {
                Statics.field824 = arg0;
            }
        }
        if (Statics.field94 < arg1) {
            Statics.field94 += Statics.field1536 * (arg1 - Statics.field94) / 1000 + Statics.field1050;
            if (Statics.field94 > arg1) {
                Statics.field94 = arg1;
            }
        }
        if (Statics.field94 > arg1) {
            Statics.field94 -= Statics.field1536 * (Statics.field94 - arg1) / 1000 + Statics.field1050;
            if (Statics.field94 < arg1) {
                Statics.field94 = arg1;
            }
        }
        if (Statics.field2931 < arg2) {
            Statics.field2931 += Statics.field1536 * (arg2 - Statics.field2931) / 1000 + Statics.field1050;
            if (Statics.field2931 > arg2) {
                Statics.field2931 = arg2;
            }
        }
        if (Statics.field2931 > arg2) {
            Statics.field2931 -= Statics.field1536 * (Statics.field2931 - arg2) / 1000 + Statics.field1050;
            if (Statics.field2931 < arg2) {
                Statics.field2931 = arg2;
            }
        }
    }

    @ObfuscatedName("dv.if(III)V")
    public static final void method2088(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field3946 < arg0) {
            Statics.field3946 += Statics.field4789 * (arg0 - Statics.field3946) / 1000 + Statics.field2432;
            if (Statics.field3946 > arg0) {
                Statics.field3946 = arg0;
            }
        } else if (Statics.field3946 > arg0) {
            Statics.field3946 -= Statics.field4789 * (Statics.field3946 - arg0) / 1000 + Statics.field2432;
            if (Statics.field3946 < arg0) {
                Statics.field3946 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field2875;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field2875 += Statics.field4789 * var3 / 1000 + Statics.field2432;
            Statics.field2875 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field2875 -= Statics.field4789 * -var3 / 1000 + Statics.field2432;
            Statics.field2875 &= 0x7FF;
        }
        int var4 = var2 - Statics.field2875;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field2875 = var2;
        }
    }

    @ObfuscatedName("bu.ij(B)V")
    public static final void method792() {
        if (!field780) {
            int var0 = Statics.field1923 * 128 + 64;
            int var1 = Statics.field225 * 128 + 64;
            int var2 = method2725(var0, var1, Statics.field1072) - Statics.field324;
            method5134(var0, var2, var1);
        } else if (field783 != null) {
            Statics.field824 = field783.method7810();
            Statics.field2931 = field783.method7812();
            if (field782) {
                Statics.field94 = field783.method7808();
            } else {
                Statics.field94 = method2725(Statics.field824, Statics.field2931, Statics.field1072) - field783.method7808();
            }
            field783.method7823();
        }
        if (field781) {
            if (field785 != null) {
                Statics.field3946 = field785.method7819();
                Statics.field3946 = Math.min(Math.max(Statics.field3946, 128), 383);
                field785.method7823();
            }
            if (field784 != null) {
                Statics.field2875 = field784.method7819() & 0x7FF;
                field784.method7823();
            }
            return;
        }
        int var3 = Statics.field1664 * 128 + 64;
        int var4 = Statics.field4723 * 128 + 64;
        int var5 = method2725(var3, var4, Statics.field1072) - Statics.field1755;
        int var6 = var3 - Statics.field824;
        int var7 = var5 - Statics.field94;
        int var8 = var4 - Statics.field2931;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method2088(var10, var11);
    }

    @ObfuscatedName("fk.ib(I)V")
    public static final void method2931() {
        int var0 = class110.field1375;
        int[] var1 = class110.field1376;
        for (int var2 = 0; var2 < var0; var2++) {
            class94 var3 = field726[var1[var2]];
            if (var3 != null) {
                method39(var3, 1);
            }
        }
    }

    @ObfuscatedName("ar.il(Ldi;II)V")
    public static final void method39(class98 arg0, int arg1) {
        if (arg0.field1243 >= field533) {
            int var2 = Math.max(1, arg0.field1243 - field533);
            int var3 = arg0.field1239 * 128 + arg0.field1190 * 64;
            int var4 = arg0.field1190 * 64 + arg0.field1186 * 128;
            arg0.field1227 += (var3 - arg0.field1227) / var2;
            arg0.field1187 += (var4 - arg0.field1187) / var2;
            arg0.field1234 = 0;
            arg0.field1209 = arg0.field1255;
        } else if (arg0.field1244 >= field533) {
            method3257(arg0);
        } else {
            arg0.field1228 = arg0.field1242;
            if (arg0.field1219 == 0) {
                arg0.field1234 = 0;
            } else {
                label554: {
                    if (arg0.field1232 != -1 && arg0.field1235 == 0) {
                        class223 var5 = class223.method687(arg0.field1232);
                        if (arg0.field1262 > 0 && var5.field2328 == 0) {
                            arg0.field1234++;
                            break label554;
                        }
                        if (arg0.field1262 <= 0 && var5.field2340 == 0) {
                            arg0.field1234++;
                            break label554;
                        }
                    }
                    int var6 = arg0.field1227;
                    int var7 = arg0.field1187;
                    int var8 = arg0.field1258[arg0.field1219 - 1] * 128 + arg0.field1190 * 64;
                    int var9 = arg0.field1259[arg0.field1219 - 1] * 128 + arg0.field1190 * 64;
                    if (var6 < var8) {
                        if (var7 < var9) {
                            arg0.field1209 = 1280;
                        } else if (var7 > var9) {
                            arg0.field1209 = 1792;
                        } else {
                            arg0.field1209 = 1536;
                        }
                    } else if (var6 > var8) {
                        if (var7 < var9) {
                            arg0.field1209 = 768;
                        } else if (var7 > var9) {
                            arg0.field1209 = 256;
                        } else {
                            arg0.field1209 = 512;
                        }
                    } else if (var7 < var9) {
                        arg0.field1209 = 1024;
                    } else if (var7 > var9) {
                        arg0.field1209 = 0;
                    }
                    class232 var10 = arg0.field1200[arg0.field1219 - 1];
                    if (var8 - var6 <= 256 && var8 - var6 >= -256 && var9 - var7 <= 256 && var9 - var7 >= -256) {
                        int var11 = arg0.field1209 - arg0.field1188 & 0x7FF;
                        if (var11 > 1024) {
                            var11 -= 2048;
                        }
                        int var12 = arg0.field1196;
                        if (var11 >= -256 && var11 <= 256) {
                            var12 = arg0.field1189;
                        } else if (var11 >= 256 && var11 < 768) {
                            var12 = arg0.field1198;
                        } else if (var11 >= -768 && var11 <= -256) {
                            var12 = arg0.field1199;
                        }
                        if (var12 == -1) {
                            var12 = arg0.field1189;
                        }
                        arg0.field1228 = var12;
                        int var13 = 4;
                        boolean var14 = true;
                        if (arg0 instanceof class103) {
                            var14 = ((class103) arg0).field1328.field2085;
                        }
                        if (var14) {
                            if (arg0.field1209 != arg0.field1188 && arg0.field1222 == -1 && arg0.field1217 != 0) {
                                var13 = 2;
                            }
                            if (arg0.field1219 > 2) {
                                var13 = 6;
                            }
                            if (arg0.field1219 > 3) {
                                var13 = 8;
                            }
                            if (arg0.field1234 > 0 && arg0.field1219 > 1) {
                                var13 = 8;
                                arg0.field1234--;
                            }
                        } else {
                            if (arg0.field1219 > 1) {
                                var13 = 6;
                            }
                            if (arg0.field1219 > 2) {
                                var13 = 8;
                            }
                            if (arg0.field1234 > 0 && arg0.field1219 > 1) {
                                var13 = 8;
                                arg0.field1234--;
                            }
                        }
                        if (class232.field2428 == var10) {
                            var13 <<= 0x1;
                        } else if (class232.field2427 == var10) {
                            var13 >>= 0x1;
                        }
                        if (var13 >= 8) {
                            if (arg0.field1228 == arg0.field1189 && arg0.field1260 != -1) {
                                arg0.field1228 = arg0.field1260;
                            } else if (arg0.field1228 == arg0.field1196 && arg0.field1218 != -1) {
                                arg0.field1228 = arg0.field1218;
                            } else if (arg0.field1228 == arg0.field1199 && arg0.field1203 != -1) {
                                arg0.field1228 = arg0.field1203;
                            } else if (arg0.field1228 == arg0.field1198 && arg0.field1202 != -1) {
                                arg0.field1228 = arg0.field1202;
                            }
                        } else if (var13 <= 2) {
                            if (arg0.field1228 == arg0.field1189 && arg0.field1197 != -1) {
                                arg0.field1228 = arg0.field1197;
                            } else if (arg0.field1228 == arg0.field1196 && arg0.field1204 != -1) {
                                arg0.field1228 = arg0.field1204;
                            } else if (arg0.field1228 == arg0.field1199 && arg0.field1220 != -1) {
                                arg0.field1228 = arg0.field1220;
                            } else if (arg0.field1228 == arg0.field1198 && arg0.field1206 != -1) {
                                arg0.field1228 = arg0.field1206;
                            }
                        }
                        if (var6 != var8 || var7 != var9) {
                            if (var6 < var8) {
                                arg0.field1227 += var13;
                                if (arg0.field1227 > var8) {
                                    arg0.field1227 = var8;
                                }
                            } else if (var6 > var8) {
                                arg0.field1227 -= var13;
                                if (arg0.field1227 < var8) {
                                    arg0.field1227 = var8;
                                }
                            }
                            if (var7 < var9) {
                                arg0.field1187 += var13;
                                if (arg0.field1187 > var9) {
                                    arg0.field1187 = var9;
                                }
                            } else if (var7 > var9) {
                                arg0.field1187 -= var13;
                                if (arg0.field1187 < var9) {
                                    arg0.field1187 = var9;
                                }
                            }
                        }
                        if (arg0.field1227 == var8 && arg0.field1187 == var9) {
                            arg0.field1219--;
                            if (arg0.field1262 > 0) {
                                arg0.field1262--;
                            }
                        }
                    } else {
                        arg0.field1227 = var8;
                        arg0.field1187 = var9;
                        arg0.field1219--;
                        if (arg0.field1262 > 0) {
                            arg0.field1262--;
                        }
                    }
                }
            }
        }
        if (arg0.field1227 < 128 || arg0.field1187 < 128 || arg0.field1227 >= 13184 || arg0.field1187 >= 13184) {
            arg0.field1232 = -1;
            arg0.field1243 = 0;
            arg0.field1244 = 0;
            arg0.method2318();
            arg0.field1227 = arg0.field1258[0] * 128 + arg0.field1190 * 64;
            arg0.field1187 = arg0.field1259[0] * 128 + arg0.field1190 * 64;
            arg0.method2308();
        }
        if (Statics.field2696 == arg0 && (arg0.field1227 < 1536 || arg0.field1187 < 1536 || arg0.field1227 >= 11776 || arg0.field1187 >= 11776)) {
            arg0.field1232 = -1;
            arg0.field1243 = 0;
            arg0.field1244 = 0;
            arg0.method2318();
            arg0.field1227 = arg0.field1258[0] * 128 + arg0.field1190 * 64;
            arg0.field1187 = arg0.field1259[0] * 128 + arg0.field1190 * 64;
            arg0.method2308();
        }
        if (arg0.field1222 != -1) {
            Object var15 = null;
            int var16 = 65536;
            class98 var17;
            if (arg0.field1222 < var16) {
                var17 = field705[arg0.field1222];
            } else {
                var17 = field726[arg0.field1222 - var16];
            }
            if (var17 != null) {
                int var18 = arg0.field1227 - var17.field1227;
                int var19 = arg0.field1187 - var17.field1187;
                if (var18 != 0 || var19 != 0) {
                    int var21 = (int) (Math.atan2((double) var18, (double) var19) * 325.94932345220167D) & 0x7FF;
                    arg0.field1209 = var21;
                }
            } else if (arg0.field1223) {
                arg0.field1222 = -1;
                arg0.field1223 = false;
            }
        }
        if (arg0.field1219 == 0 || arg0.field1234 > 0) {
            int var22 = -1;
            if (arg0.field1225 != -1 && arg0.field1226 != -1) {
                int var23 = arg0.field1225 * 128 - Statics.field108 * 128 + 64;
                int var24 = arg0.field1226 * 128 - Statics.field103 * 128 + 64;
                int var25 = arg0.field1227 - var23;
                int var26 = arg0.field1187 - var24;
                if (var25 != 0 || var26 != 0) {
                    int var27 = (int) (Math.atan2((double) var25, (double) var26) * 325.94932345220167D) & 0x7FF;
                    var22 = var27;
                }
            } else if (arg0.field1224 != -1) {
                var22 = arg0.field1224;
            }
            if (var22 != -1) {
                arg0.field1209 = var22;
                if (arg0.field1241) {
                    arg0.field1188 = arg0.field1209;
                }
            }
            arg0.method2316();
        }
        int var28 = arg0.field1209 - arg0.field1188 & 0x7FF;
        if (var28 == 0) {
            if (arg0.field1223) {
                arg0.field1222 = -1;
                arg0.field1223 = false;
            }
            arg0.field1213 = 0;
        } else {
            boolean var29 = true;
            boolean var30 = true;
            arg0.field1213++;
            int var31 = var28 > 1024 ? -1 : 1;
            arg0.field1188 += arg0.field1217 * var31;
            boolean var32 = true;
            if (var28 < arg0.field1217 || var28 > 2048 - arg0.field1217) {
                arg0.field1188 = arg0.field1209;
                var32 = false;
            }
            if (arg0.field1217 > 0 && arg0.field1242 == arg0.field1228 && (arg0.field1213 > 25 || var32)) {
                if (var31 == -1 && arg0.field1193 != -1) {
                    arg0.field1228 = arg0.field1193;
                } else if (var31 == 1 && arg0.field1194 != -1) {
                    arg0.field1228 = arg0.field1194;
                } else {
                    arg0.field1228 = arg0.field1189;
                }
            }
            arg0.field1188 &= 0x7FF;
        }
        arg0.field1207 = false;
        if (arg0.field1228 != -1) {
            class223 var34 = class223.method687(arg0.field1228);
            if (var34 == null) {
                arg0.field1228 = -1;
            } else if (!var34.method3851() && var34.field2326 != null) {
                arg0.field1230++;
                if (arg0.field1229 < var34.field2326.length && arg0.field1230 > var34.field2313[arg0.field1229]) {
                    arg0.field1230 = 1;
                    arg0.field1229++;
                    method8046(var34, arg0.field1229, arg0.field1227, arg0.field1187);
                }
                if (arg0.field1229 >= var34.field2326.length) {
                    if (var34.field2330 > 0) {
                        arg0.field1229 -= var34.field2330;
                        if (var34.field2320) {
                            arg0.field1231++;
                        }
                        if (arg0.field1229 < 0 || arg0.field1229 >= var34.field2326.length || var34.field2320 && arg0.field1231 >= var34.field2342) {
                            arg0.field1230 = 0;
                            arg0.field1229 = 0;
                            arg0.field1231 = 0;
                        }
                    } else {
                        arg0.field1230 = 0;
                        arg0.field1229 = 0;
                    }
                    method8046(var34, arg0.field1229, arg0.field1227, arg0.field1187);
                }
            } else if (var34.method3851()) {
                arg0.field1229++;
                int var35 = var34.method3860();
                if (arg0.field1229 < var35) {
                    method6515(var34, arg0.field1229, arg0.field1227, arg0.field1187);
                } else {
                    if (var34.field2330 > 0) {
                        arg0.field1229 -= var34.field2330;
                        if (var34.field2320) {
                            arg0.field1231++;
                        }
                        if (arg0.field1229 < 0 || arg0.field1229 >= var35 || var34.field2320 && arg0.field1231 >= var34.field2342) {
                            arg0.field1229 = 0;
                            arg0.field1230 = 0;
                            arg0.field1231 = 0;
                        }
                    } else {
                        arg0.field1230 = 0;
                        arg0.field1229 = 0;
                    }
                    method6515(var34, arg0.field1229, arg0.field1227, arg0.field1187);
                }
            } else {
                arg0.field1228 = -1;
            }
        }
        class502 var36 = new class502(arg0.method2311());
        for (class552 var37 = (class552) var36.method8057(); var37 != null; var37 = (class552) var36.next()) {
            if (var37.field5282 != -1 && field533 >= var37.field5283) {
                int var38 = class211.method6757(var37.field5282).field2127;
                if (var38 == -1) {
                    var37.method7776();
                    arg0.field1238--;
                } else {
                    var37.field5281 = Math.max(var37.field5281, 0);
                    class223 var39 = class223.method687(var38);
                    if (var39.field2326 != null && !var39.method3851()) {
                        var37.field5280++;
                        if (var37.field5281 < var39.field2326.length && var37.field5280 > var39.field2313[var37.field5281]) {
                            var37.field5280 = 1;
                            var37.field5281++;
                            method8046(var39, var37.field5281, arg0.field1227, arg0.field1187);
                        }
                        if (var37.field5281 >= var39.field2326.length) {
                            var37.method7776();
                            arg0.field1238--;
                        }
                    } else if (var39.method3851()) {
                        var37.field5281++;
                        int var40 = var39.method3860();
                        if (var37.field5281 < var40) {
                            method6515(var39, var37.field5281, arg0.field1227, arg0.field1187);
                        } else {
                            var37.method7776();
                            arg0.field1238--;
                        }
                    } else {
                        var37.method7776();
                        arg0.field1238--;
                    }
                }
            }
        }
        if (arg0.field1232 != -1 && arg0.field1235 <= 1) {
            class223 var41 = class223.method687(arg0.field1232);
            if (var41.field2328 == 1 && arg0.field1262 > 0 && arg0.field1243 <= field533 && arg0.field1244 < field533) {
                arg0.field1235 = 1;
                return;
            }
        }
        if (arg0.field1232 != -1 && arg0.field1235 == 0) {
            class223 var42 = class223.method687(arg0.field1232);
            if (var42 == null) {
                arg0.field1232 = -1;
            } else if (!var42.method3851() && var42.field2326 != null) {
                arg0.field1254++;
                if (arg0.field1192 < var42.field2326.length && arg0.field1254 > var42.field2313[arg0.field1192]) {
                    arg0.field1254 = 1;
                    arg0.field1192++;
                    method8046(var42, arg0.field1192, arg0.field1227, arg0.field1187);
                }
                if (arg0.field1192 >= var42.field2326.length) {
                    arg0.field1192 -= var42.field2330;
                    arg0.field1236++;
                    if (arg0.field1236 >= var42.field2342) {
                        arg0.field1232 = -1;
                    } else if (arg0.field1192 >= 0 && arg0.field1192 < var42.field2326.length) {
                        method8046(var42, arg0.field1192, arg0.field1227, arg0.field1187);
                    } else {
                        arg0.field1232 = -1;
                    }
                }
                arg0.field1207 = var42.field2339;
            } else if (var42.method3851()) {
                arg0.field1192++;
                int var43 = var42.method3860();
                if (arg0.field1192 < var43) {
                    method6515(var42, arg0.field1192, arg0.field1227, arg0.field1187);
                } else {
                    arg0.field1192 -= var42.field2330;
                    arg0.field1236++;
                    if (arg0.field1236 >= var42.field2342) {
                        arg0.field1232 = -1;
                    } else if (arg0.field1192 >= 0 && arg0.field1192 < var43) {
                        method6515(var42, arg0.field1192, arg0.field1227, arg0.field1187);
                    } else {
                        arg0.field1232 = -1;
                    }
                }
            } else {
                arg0.field1232 = -1;
            }
        }
        if (arg0.field1235 > 0) {
            arg0.field1235--;
        }
    }

    @ObfuscatedName("gv.it(Ldi;I)V")
    public static final void method3257(class98 arg0) {
        boolean var1 = field533 == arg0.field1244 || arg0.field1232 == -1 || arg0.field1235 != 0;
        if (!var1) {
            class223 var2 = class223.method687(arg0.field1232);
            if (var2 == null || var2.method3851()) {
                var1 = true;
            } else {
                var1 = arg0.field1254 + 1 > var2.field2313[arg0.field1192];
            }
        }
        if (var1) {
            int var3 = arg0.field1244 - arg0.field1243;
            int var4 = field533 - arg0.field1243;
            int var5 = arg0.field1239 * 128 + arg0.field1190 * 64;
            int var6 = arg0.field1190 * 64 + arg0.field1186 * 128;
            int var7 = arg0.field1240 * 128 + arg0.field1190 * 64;
            int var8 = arg0.field1205 * 128 + arg0.field1190 * 64;
            arg0.field1227 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1187 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1234 = 0;
        arg0.field1209 = arg0.field1255;
        arg0.field1188 = arg0.field1209;
    }

    @ObfuscatedName("be.ih(B)V")
    public static void method437() {
        if (Statics.field4641 != null) {
            Statics.field4641.method7860(Statics.field1072, (Statics.field2696.field1227 >> 7) + Statics.field108, (Statics.field2696.field1187 >> 7) + Statics.field103, false);
            Statics.field4641.method7876();
        }
    }

    @ObfuscatedName("li.ic(Ldj;IIB)V")
    public static void method5249(class94 arg0, int arg1, int arg2) {
        if (arg0.field1232 == arg1 && arg1 != -1) {
            int var3 = class223.method687(arg1).field2341;
            if (var3 == 1) {
                arg0.field1192 = 0;
                arg0.field1254 = 0;
                arg0.field1235 = arg2;
                arg0.field1236 = 0;
            }
            if (var3 == 2) {
                arg0.field1236 = 0;
            }
        } else if (arg1 == -1 || arg0.field1232 == -1 || class223.method687(arg1).field2334 >= class223.method687(arg0.field1232).field2334) {
            arg0.field1232 = arg1;
            arg0.field1192 = 0;
            arg0.field1254 = 0;
            arg0.field1235 = arg2;
            arg0.field1236 = 0;
            arg0.field1262 = arg0.field1219;
        }
    }

    @ObfuscatedName("gh.iq(B)I")
    public static int method3268() {
        return field684 ? 2 : 1;
    }

    @ObfuscatedName("hw.ig(II)V")
    public static void method3525(int arg0) {
        field701 = 0L;
        if (arg0 >= 2) {
            field684 = true;
        } else {
            field684 = false;
        }
        if (method3268() == 1) {
            Statics.field1743.method472(765, 503);
        } else {
            Statics.field1743.method472(7680, 2160);
        }
        if (field530 >= 25) {
            method8224();
        }
    }

    @ObfuscatedName("tr.ip(B)V")
    public static void method8224() {
        class311 var0 = class311.method2978(class309.field3182, field579.field1425);
        var0.field3250.method8348(method3268());
        var0.field3250.method8349(Statics.field3598);
        var0.field3250.method8349(Statics.field4908);
        field579.method2682(var0);
    }

    @ObfuscatedName("client.ai(I)V")
    public final void method482() {
        field701 = class316.method6401() + 500L;
        this.method1189();
        if (field797 != -1) {
            this.method1254(true);
        }
    }

    @ObfuscatedName("client.ia(I)V")
    public void method1189() {
        int var1 = Statics.field3598;
        int var2 = Statics.field4908;
        if (this.field207 < var1) {
            int var3 = this.field207;
        }
        if (this.field199 < var2) {
            int var4 = this.field199;
        }
        if (Statics.field1106 == null) {
            return;
        }
        try {
            client var5 = Statics.field1743;
            Object[] var6 = new Object[] { method3268() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.id(B)V")
    public final void method1190() {
        if (field797 != -1) {
            method3270(field797);
        }
        for (int var1 = 0; var1 < field562; var1++) {
            if (field740[var1]) {
                field736[var1] = true;
            }
            field678[var1] = field740[var1];
            field740[var1] = false;
        }
        field739 = field533;
        field623 = -1;
        field680 = -1;
        if (field797 != -1) {
            field562 = 0;
            method6938(field797, 0, 0, Statics.field3598, Statics.field4908, 0, 0, -1);
        }
        class540.method8747();
        if (field642) {
            if (field641 == 1) {
                Statics.field2022[field762 / 100].method8823(field536 - 8, field639 - 8);
            }
            if (field641 == 2) {
                Statics.field2022[field762 / 100 + 4].method8823(field536 - 8, field639 - 8);
            }
        }
        if (field666) {
            int var2 = Statics.field163;
            int var3 = Statics.field4772;
            int var4 = Statics.field3603;
            int var5 = Statics.field4426;
            int var6 = 6116423;
            class540.method8758(var2, var3, var4, var5, var6);
            class540.method8758(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class540.method8763(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field330.method6954(class367.field4115, var2 + 3, var3 + 14, var6, -1);
            int var7 = class36.field235;
            int var8 = class36.field241;
            for (int var9 = 0; var9 < field667; var9++) {
                int var10 = (field667 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field330.method6954(method3138(var9), var2 + 3, var10, var11, 0);
            }
            int var12 = Statics.field163;
            int var13 = Statics.field4772;
            int var14 = Statics.field3603;
            int var15 = Statics.field4426;
            for (int var16 = 0; var16 < field562; var16++) {
                if (field743[var16] + field521[var16] > var12 && field743[var16] < var12 + var14 && field774[var16] + field744[var16] > var13 && field744[var16] < var13 + var15) {
                    field736[var16] = true;
                }
            }
        } else if (field623 != -1) {
            method2919(field623, field680);
        }
        if (field720 == 3) {
            for (int var17 = 0; var17 < field562; var17++) {
                if (field678[var17]) {
                    class540.method8701(field743[var17], field744[var17], field521[var17], field774[var17], 16711935, 128);
                } else if (field736[var17]) {
                    class540.method8701(field743[var17], field744[var17], field521[var17], field774[var17], 16711680, 128);
                }
            }
        }
        int var18 = Statics.field1072;
        int var19 = Statics.field2696.field1227;
        int var20 = Statics.field2696.field1187;
        int var21 = field710;
        for (class71 var22 = (class71) class71.field858.method6532(); var22 != null; var22 = (class71) class71.field858.method6543()) {
            if (var22.field866 != -1 || var22.field864 != null) {
                int var23 = 0;
                if (var19 > var22.field857) {
                    var23 += var19 - var22.field857;
                } else if (var19 < var22.field855) {
                    var23 += var22.field855 - var19;
                }
                if (var20 > var22.field860) {
                    var23 += var20 - var22.field860;
                } else if (var20 < var22.field856) {
                    var23 += var22.field856 - var20;
                }
                if (var23 - 64 > var22.field854 || Statics.field1106.method2473() == 0 || var22.field853 != var18) {
                    if (var22.field859 != null) {
                        Statics.field1626.method692(var22.field859);
                        var22.field859 = null;
                    }
                    if (var22.field862 != null) {
                        Statics.field1626.method692(var22.field862);
                        var22.field862 = null;
                    }
                } else {
                    var23 -= 64;
                    if (var23 < 0) {
                        var23 = 0;
                    }
                    int var24 = (var22.field854 - var23) * Statics.field1106.method2473() / var22.field854;
                    class40 var10000;
                    if (var22.field859 != null) {
                        var22.field859.method850(var24);
                    } else if (var22.field866 >= 0) {
                        var10000 = (class40) null;
                        class40 var25 = class40.method739(Statics.field4813, var22.field866, 0);
                        if (var25 != null) {
                            class41 var26 = var25.method731().method741(Statics.field1600);
                            class49 var27 = class49.method879(var26, 100, var24);
                            var27.method867(-1);
                            Statics.field1626.method725(var27);
                            var22.field859 = var27;
                        }
                    }
                    if (var22.field862 != null) {
                        var22.field862.method850(var24);
                        if (!var22.field862.method7777()) {
                            var22.field862 = null;
                        }
                    } else if (var22.field864 != null && (var22.field865 -= var21) <= 0) {
                        int var28 = (int) (Math.random() * (double) var22.field864.length);
                        var10000 = (class40) null;
                        class40 var29 = class40.method739(Statics.field4813, var22.field864[var28], 0);
                        if (var29 != null) {
                            class41 var30 = var29.method731().method741(Statics.field1600);
                            class49 var31 = class49.method879(var30, 100, var24);
                            var31.method867(0);
                            Statics.field1626.method725(var31);
                            var22.field862 = var31;
                            var22.field865 = var22.field861 + (int) (Math.random() * (double) (var22.field863 - var22.field861));
                        }
                    }
                }
            }
        }
        field710 = 0;
    }

    @ObfuscatedName("qt.jc(Ljava/lang/String;ZI)V")
    public static final void method7130(String arg0, boolean arg1) {
        if (!field814) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1486.method6950(arg0, 250);
        int var6 = Statics.field1486.method6986(arg0, 250) * 13;
        class540.method8758(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class540.method8763(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1486.method6958(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method275(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field2346.method452(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field562; var11++) {
            if (field743[var11] + field521[var11] > var7 && field743[var11] < var7 + var9 && field774[var11] + field744[var11] > var8 && field744[var11] < var8 + var10) {
                field736[var11] = true;
            }
        }
    }

    @ObfuscatedName("cu.jd(IIIIZI)V")
    public static final void method1017(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field792;
        } else if (var5 >= 100) {
            var6 = field793;
        } else {
            var6 = (field793 - field792) * var5 / 100 + field792;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field595) {
            short var8 = field595;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field663) {
                var6 = field663;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class540.method8747();
                    class540.method8758(arg0, arg1, var10, arg3, -16777216);
                    class540.method8758(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field799) {
            short var11 = field799;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field796) {
                var6 = field796;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class540.method8747();
                    class540.method8758(arg0, arg1, arg2, var13, -16777216);
                    class540.method8758(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field593 = arg3 * var6 / 334;
        if (field523 != arg2 || field803 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class241.field2553[var16];
                int var20 = arg3 - 334;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 100) {
                    var20 = 100;
                }
                int var21 = (field795 - field794) * var20 / 100 + field794;
                int var22 = var17 * var21 / 256;
                var14[var15] = var19 * var22 >> 16;
            }
            class245.method4331(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field800 = arg0;
        field801 = arg1;
        field523 = arg2;
        field803 = arg3;
    }

    @ObfuscatedName("tb.jo(I)V")
    public static void method7839() {
        int var0 = class110.field1375;
        int[] var1 = class110.field1376;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field657 != var1[var2] && field646 != var1[var2]) {
                method3434(field726[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("hv.ji(Ldj;ZI)V")
    public static void method3434(class94 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2265() || arg0.field1139) {
            return;
        }
        arg0.field1137 = false;
        if ((field748 && class110.field1375 > 50 || class110.field1375 > 200) && arg1 && arg0.field1242 == arg0.field1228) {
            arg0.field1137 = true;
        }
        int var2 = arg0.field1227 >> 7;
        int var3 = arg0.field1187 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class255.method6416(0, 0, 0, false, arg0.field1132);
        if (arg0.field1122 != null && field533 >= arg0.field1127 && field533 < arg0.field1142) {
            arg0.field1137 = false;
            arg0.field1126 = method2725(arg0.field1227, arg0.field1187, Statics.field1072);
            arg0.field1191 = field533;
            Statics.field53.method4306(Statics.field1072, arg0.field1227, arg0.field1187, arg0.field1126, 60, arg0, arg0.field1188, var4, arg0.field1146, arg0.field1134, arg0.field1135, arg0.field1145);
            return;
        }
        if ((arg0.field1227 & 0x7F) == 64 && (arg0.field1187 & 0x7F) == 64) {
            if (field635 == field634[var2][var3]) {
                return;
            }
            field634[var2][var3] = field635;
        }
        arg0.field1126 = method2725(arg0.field1227, arg0.field1187, Statics.field1072);
        arg0.field1191 = field533;
        Statics.field53.method4455(Statics.field1072, arg0.field1227, arg0.field1187, arg0.field1126, 60, arg0, arg0.field1188, var4, arg0.field1207);
    }

    @ObfuscatedName("el.jh(ZI)V")
    public static final void method2603(boolean arg0) {
        for (int var1 = 0; var1 < field668; var1++) {
            class103 var2 = field705[field581[var1]];
            if (var2 != null && var2.method2265() && var2.field1328.field2077 == arg0 && var2.field1328.method3476()) {
                int var3 = var2.field1227 >> 7;
                int var4 = var2.field1187 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1190 == 1 && (var2.field1227 & 0x7F) == 64 && (var2.field1187 & 0x7F) == 64) {
                        if (field635 == field634[var3][var4]) {
                            continue;
                        }
                        field634[var3][var4] = field635;
                    }
                    long var5 = class255.method6416(0, 0, 1, !var2.field1328.field2059, field581[var1]);
                    var2.field1191 = field533;
                    Statics.field53.method4455(Statics.field1072, var2.field1227, var2.field1187, method2725(var2.field1227 + (var2.field1190 * 64 - 64), var2.field1187 + (var2.field1190 * 64 - 64), Statics.field1072), var2.field1190 * 64 - 64 + 60, var2, var2.field1188, var5, var2.field1207);
                }
            }
        }
    }

    @ObfuscatedName("sw.jx(I)V")
    public static final void method7700() {
        for (class79 var0 = (class79) field660.method6532(); var0 != null; var0 = (class79) field660.method6543()) {
            if (Statics.field1072 != var0.field970 || field533 > var0.field979) {
                var0.method7776();
            } else if (field533 >= var0.field973) {
                if (!var0.field995 && var0.field977 != 0) {
                    if (var0.field977 > 0) {
                        class103 var1 = field705[var0.field977 - 1];
                        if (var1 != null && var1.field1227 >= 0 && var1.field1227 < 13312 && var1.field1187 >= 0 && var1.field1187 < 13312) {
                            var0.field971 = var1.field1227;
                            var0.field972 = var1.field1187;
                            var0.method2084(var0.field975, var0.field976, var0.field990, field533);
                        }
                    } else {
                        int var2 = -var0.field977 - 1;
                        class94 var3;
                        if (field646 == var2) {
                            var3 = Statics.field2696;
                        } else {
                            var3 = field726[var2];
                        }
                        if (var3 != null && var3.field1227 >= 0 && var3.field1227 < 13312 && var3.field1187 >= 0 && var3.field1187 < 13312) {
                            var0.field971 = var3.field1227;
                            var0.field972 = var3.field1187;
                            var0.method2084(var0.field975, var0.field976, var0.field990, field533);
                        }
                    }
                }
                if (var0.field969 > 0) {
                    class103 var4 = field705[var0.field969 - 1];
                    if (var4 != null && var4.field1227 >= 0 && var4.field1227 < 13312 && var4.field1187 >= 0 && var4.field1187 < 13312) {
                        var0.method2084(var4.field1227, var4.field1187, method2725(var4.field1227, var4.field1187, var0.field970) - var0.field993, field533);
                    }
                }
                if (var0.field969 < 0) {
                    int var5 = -var0.field969 - 1;
                    class94 var6;
                    if (field646 == var5) {
                        var6 = Statics.field2696;
                    } else {
                        var6 = field726[var5];
                    }
                    if (var6 != null && var6.field1227 >= 0 && var6.field1227 < 13312 && var6.field1187 >= 0 && var6.field1187 < 13312) {
                        var0.method2084(var6.field1227, var6.field1187, method2725(var6.field1227, var6.field1187, var0.field970) - var0.field993, field533);
                    }
                }
                var0.method2083(field710);
                Statics.field53.method4455(Statics.field1072, (int) var0.field978, (int) var0.field986, (int) var0.field987, 60, var0, var0.field985, -1L, false);
            }
        }
    }

    @ObfuscatedName("fo.jr(I)I")
    public static final int method2925() {
        if (Statics.field1106.method2386()) {
            return Statics.field1072;
        }
        int var0 = 3;
        if (Statics.field3946 < 310) {
            int var1;
            int var2;
            if (field611 == 1) {
                var1 = Statics.field1029 >> 7;
                var2 = Statics.field3040 >> 7;
            } else {
                var1 = Statics.field2696.field1227 >> 7;
                var2 = Statics.field2696.field1187 >> 7;
            }
            int var3 = Statics.field824 >> 7;
            int var4 = Statics.field2931 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field1072;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1072;
            }
            if ((class84.field1032[Statics.field1072][var3][var4] & 0x4) != 0) {
                var0 = Statics.field1072;
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
                    if ((class84.field1032[Statics.field1072][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1072;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class84.field1032[Statics.field1072][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1072;
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
                    if ((class84.field1032[Statics.field1072][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field1072;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class84.field1032[Statics.field1072][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field1072;
                        }
                    }
                }
            }
        }
        if (Statics.field2696.field1227 >= 0 && Statics.field2696.field1187 >= 0 && Statics.field2696.field1227 < 13312 && Statics.field2696.field1187 < 13312) {
            if ((class84.field1032[Statics.field1072][Statics.field2696.field1227 >> 7][Statics.field2696.field1187 >> 7] & 0x4) != 0) {
                var0 = Statics.field1072;
            }
            return var0;
        } else {
            return Statics.field1072;
        }
    }

    @ObfuscatedName("ab.jt(I)Lpf;")
    public static class393 method55() {
        return field707;
    }

    @ObfuscatedName("hu.jl(I)V")
    public static void method3291() {
        for (class226 var0 = (class226) field535.method6532(); var0 != null; var0 = (class226) field535.method6543()) {
            var0.method7776();
        }
    }

    @ObfuscatedName("iv.jy(B)Z")
    public static boolean method3530() {
        return (field823 & 0x4) != 0;
    }

    @ObfuscatedName("or.jv(I)Z")
    public static boolean method6516() {
        return (field823 & 0x1) != 0;
    }

    @ObfuscatedName("bj.ja(I)Z")
    public static boolean method841() {
        return (field823 & 0x2) != 0;
    }

    @ObfuscatedName("ka.je(B)Z")
    public static boolean method4804() {
        return (field823 & 0x8) != 0;
    }

    @ObfuscatedName("ia.jq(Ldi;IIIIIB)V")
    public static final void method4027(class98 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2265()) {
            return;
        }
        if (arg0 instanceof class103) {
            class206 var6 = ((class103) arg0).field1328;
            if (var6.field2043 != null) {
                var6 = var6.method3500();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class110.field1375;
        int[] var8 = class110.field1376;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1215 != null && (!var9 || !arg0.field1247 && (field729 == 4 || !arg0.field1208 && (field729 == 0 || field729 == 3 || field729 == 1 && ((class94) arg0).method2252())))) {
            method6195(arg0, arg0.field1211);
            if (field636 > -1 && field618 < field808) {
                field628[field618] = Statics.field330.method6948(arg0.field1215) / 2;
                field627[field618] = Statics.field330.field4536;
                field625[field618] = field636;
                field626[field618] = field654 - var10;
                field629[field618] = arg0.field1256;
                field825[field618] = arg0.field1212;
                field734[field618] = arg0.field1210;
                field631[field618] = arg0.field1195;
                field633[field618] = arg0.field1215;
                field618++;
                var10 += 12;
            }
        }
        if (!arg0.field1221.method6581()) {
            method6195(arg0, arg0.field1211 + 15);
            for (class102 var11 = (class102) arg0.field1221.method6577(); var11 != null; var11 = (class102) arg0.field1221.method6623()) {
                class99 var12 = var11.method2497(field533);
                if (var12 != null) {
                    class198 var13 = var11.field1310;
                    class544 var14 = var13.method3408();
                    class544 var15 = var13.method3407();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field1992;
                    } else {
                        if (var13.field1993 * 2 < var15.field5237) {
                            var16 = var13.field1993;
                        }
                        var17 = var15.field5237 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field533 - var12.field1269;
                    int var21 = var12.field1268 * var17 / var13.field1992;
                    int var24;
                    if (var12.field1270 > var20) {
                        int var22 = var13.field1988 == 0 ? 0 : var20 / var13.field1988 * var13.field1988;
                        int var23 = var12.field1267 * var17 / var13.field1992;
                        var24 = (var21 - var23) * var22 / var12.field1270 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1270 + var13.field1985 - var20;
                        if (var13.field1987 >= 0) {
                            var18 = (var25 << 8) / (var13.field1985 - var13.field1987);
                        }
                    }
                    if (var12.field1268 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field636 > -1) {
                            int var31 = field636 + arg2 - (var17 >> 1);
                            int var32 = field654 + arg3 - var10;
                            class540.method8758(var31, var32, var24, 5, 65280);
                            class540.method8758(var24 + var31, var32, var17 - var24, 5, 16711680);
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
                        int var28 = field636 + arg2 - (var17 >> 1);
                        int var29 = field654 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method8864(var30, var29, var18);
                            class540.method8695(var30, var29, var26 + var30, var27 + var29);
                            var15.method8864(var30, var29, var18);
                        } else {
                            var14.method8823(var30, var29);
                            class540.method8695(var30, var29, var26 + var30, var27 + var29);
                            var15.method8823(var30, var29);
                        }
                        class540.method8694(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2492()) {
                    var11.method7776();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field533 == arg0.field1191) {
            class94 var33 = (class94) arg0;
            boolean var34;
            if (field823 == 0) {
                var34 = false;
            } else if (Statics.field2696 == var33) {
                var34 = method4804();
            } else {
                var34 = method3530() || method6516() && var33.method2252() || method841() && var33.method2255();
            }
            if (var34) {
                class94 var35 = (class94) arg0;
                if (var9) {
                    method6195(arg0, arg0.field1211 + 15);
                    class413 var36 = (class413) field637.get(class500.field4996);
                    var10 += 4;
                    var36.method6963(var35.field1136.method8985(), field636 + arg2, field654 + arg3 - var10, 16777215, 0);
                    var10 += 18;
                }
            }
        }
        if (var9) {
            class94 var37 = (class94) arg0;
            if (var37.field1139) {
                return;
            }
            if (var37.field1131 != -1 || var37.field1119 != -1) {
                method6195(arg0, arg0.field1211 + 15);
                if (field636 > -1) {
                    if (var37.field1131 != -1) {
                        var10 += 25;
                        Statics.field1453[var37.field1131].method8823(field636 + arg2 - 12, field654 + arg3 - var10);
                    }
                    if (var37.field1119 != -1) {
                        var10 += 25;
                        Statics.field1731[var37.field1119].method8823(field636 + arg2 - 12, field654 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field540 == 10 && field542 == var8[arg1]) {
                method6195(arg0, arg0.field1211 + 15);
                if (field636 > -1) {
                    int var38 = Statics.field1458[1].field5239 + var10;
                    Statics.field1458[1].method8823(field636 + arg2 - 12, field654 + arg3 - var38);
                }
            }
        } else {
            class103 var39 = (class103) arg0;
            int[] var40 = var39.method2510();
            short[] var41 = var39.method2516();
            if (var41 != null && var40 != null) {
                for (int var42 = 0; var42 < var41.length; var42++) {
                    if (var41[var42] >= 0 && var40[var42] >= 0) {
                        long var43 = (long) var40[var42] << 8 | (long) var41[var42];
                        Object var45 = (class544) field811.method7237(var43);
                        if (var45 == null) {
                            class372 var46 = Statics.field2011;
                            int var47 = var40[var42];
                            class544[] var48;
                            if (class545.method3115(var46, var47, 0)) {
                                class544[] var49 = new class544[Statics.field5248];
                                int var50 = 0;
                                while (true) {
                                    if (var50 >= Statics.field5248) {
                                        Statics.method6787();
                                        var48 = var49;
                                        break;
                                    }
                                    class544 var51 = var49[var50] = new class544();
                                    var51.field5234 = Statics.field1747;
                                    var51.field5240 = Statics.field5007;
                                    var51.field5236 = Statics.field3506[var50];
                                    var51.field5238 = Statics.field2854[var50];
                                    var51.field5237 = Statics.field443[var50];
                                    var51.field5239 = Statics.field5247[var50];
                                    int var52 = var51.field5239 * var51.field5237;
                                    byte[] var53 = Statics.field4559[var50];
                                    var51.field5235 = new int[var52];
                                    for (int var54 = 0; var54 < var52; var54++) {
                                        var51.field5235[var54] = Statics.field4323[var53[var54] & 0xFF];
                                    }
                                    var50++;
                                }
                            } else {
                                var48 = null;
                            }
                            if (var48 != null && var41[var42] < var48.length) {
                                var45 = var48[var41[var42]];
                                field811.method7228(var43, var45);
                            }
                        }
                        if (var45 != null) {
                            method6195(arg0, arg0.field1211 + 15);
                            if (field636 > -1) {
                                ((class544) var45).method8823(field636 + arg2 - (((class544) var45).field5237 >> 1), field654 + (arg3 - ((class544) var45).field5239) - 4);
                            }
                        }
                    }
                }
            }
            if (field540 == 1 && field541 == field581[arg1 - var7] && field533 % 20 < 10) {
                method6195(arg0, arg0.field1211 + 15);
                if (field636 > -1) {
                    Statics.field1458[0].method8823(field636 + arg2 - 12, field654 + arg3 - 28);
                }
            }
        }
        for (int var57 = 0; var57 < 4; var57++) {
            int var58 = arg0.field1257[var57];
            int var59 = arg0.field1216[var57];
            class219 var60 = null;
            int var61 = 0;
            if (var59 >= 0) {
                if (var58 <= field533) {
                    continue;
                }
                var60 = class219.method3322(arg0.field1216[var57]);
                var61 = var60.field2176;
                if (var60 != null && var60.field2187 != null) {
                    var60 = var60.method3654();
                    if (var60 == null) {
                        arg0.field1257[var57] = -1;
                        continue;
                    }
                }
            } else if (var58 < 0) {
                continue;
            }
            int var62 = arg0.field1261[var57];
            class219 var63 = null;
            if (var62 >= 0) {
                var63 = class219.method3322(var62);
                if (var63 != null && var63.field2187 != null) {
                    var63 = var63.method3654();
                }
            }
            if (var58 - var61 <= field533) {
                if (var60 == null) {
                    arg0.field1257[var57] = -1;
                } else {
                    method6195(arg0, arg0.field1211 / 2);
                    if (field636 > -1) {
                        boolean var64 = true;
                        if (var57 == 1) {
                            field654 -= 20;
                        }
                        if (var57 == 2) {
                            field636 -= 15;
                            field654 -= 10;
                        }
                        if (var57 == 3) {
                            field636 += 15;
                            field654 -= 10;
                        }
                        Object var65 = null;
                        Object var66 = null;
                        Object var67 = null;
                        Object var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        class544 var77 = null;
                        class544 var78 = null;
                        class544 var79 = null;
                        class544 var80 = null;
                        int var81 = 0;
                        int var82 = 0;
                        int var83 = 0;
                        int var84 = 0;
                        int var85 = 0;
                        int var86 = 0;
                        int var87 = 0;
                        int var88 = 0;
                        int var89 = 0;
                        class544 var90 = var60.method3656();
                        if (var90 != null) {
                            var69 = var90.field5237;
                            int var91 = var90.field5239;
                            if (var91 > var89) {
                                var89 = var91;
                            }
                            var73 = var90.field5236;
                        }
                        class544 var92 = var60.method3657();
                        if (var92 != null) {
                            var70 = var92.field5237;
                            int var93 = var92.field5239;
                            if (var93 > var89) {
                                var89 = var93;
                            }
                            var74 = var92.field5236;
                        }
                        class544 var94 = var60.method3658();
                        if (var94 != null) {
                            var71 = var94.field5237;
                            int var95 = var94.field5239;
                            if (var95 > var89) {
                                var89 = var95;
                            }
                            var75 = var94.field5236;
                        }
                        class544 var96 = var60.method3659();
                        if (var96 != null) {
                            var72 = var96.field5237;
                            int var97 = var96.field5239;
                            if (var97 > var89) {
                                var89 = var97;
                            }
                            var76 = var96.field5236;
                        }
                        if (var63 != null) {
                            var77 = var63.method3656();
                            if (var77 != null) {
                                var81 = var77.field5237;
                                int var98 = var77.field5239;
                                if (var98 > var89) {
                                    var89 = var98;
                                }
                                var85 = var77.field5236;
                            }
                            var78 = var63.method3657();
                            if (var78 != null) {
                                var82 = var78.field5237;
                                int var99 = var78.field5239;
                                if (var99 > var89) {
                                    var89 = var99;
                                }
                                var86 = var78.field5236;
                            }
                            var79 = var63.method3658();
                            if (var79 != null) {
                                var83 = var79.field5237;
                                int var100 = var79.field5239;
                                if (var100 > var89) {
                                    var89 = var100;
                                }
                                var87 = var79.field5236;
                            }
                            var80 = var63.method3659();
                            if (var80 != null) {
                                var84 = var80.field5237;
                                int var101 = var80.field5239;
                                if (var101 > var89) {
                                    var89 = var101;
                                }
                                var88 = var80.field5236;
                            }
                        }
                        class409 var102 = var60.method3685();
                        if (var102 == null) {
                            var102 = Statics.field81;
                        }
                        class409 var103;
                        if (var63 == null) {
                            var103 = Statics.field81;
                        } else {
                            var103 = var63.method3685();
                            if (var103 == null) {
                                var103 = Statics.field81;
                            }
                        }
                        Object var104 = null;
                        String var105 = null;
                        boolean var106 = false;
                        int var107 = 0;
                        String var108 = var60.method3681(arg0.field1245[var57]);
                        int var109 = var102.method6948(var108);
                        if (var63 != null) {
                            var105 = var63.method3681(arg0.field1233[var57]);
                            var107 = var103.method6948(var105);
                        }
                        int var110 = 0;
                        int var111 = 0;
                        if (var70 > 0) {
                            if (var94 == null && var96 == null) {
                                var110 = 1;
                            } else {
                                var110 = var109 / var70 + 1;
                            }
                        }
                        if (var63 != null && var82 > 0) {
                            if (var79 == null && var80 == null) {
                                var111 = 1;
                            } else {
                                var111 = var107 / var82 + 1;
                            }
                        }
                        int var112 = 0;
                        int var113 = var112;
                        if (var69 > 0) {
                            var112 += var69;
                        }
                        var112 += 2;
                        int var114 = var112;
                        if (var71 > 0) {
                            var112 += var71;
                        }
                        int var115 = var112;
                        int var116 = var112;
                        int var118;
                        if (var70 > 0) {
                            int var117 = var70 * var110;
                            var118 = var112 + var117;
                            var116 = (var117 - var109) / 2 + var112;
                        } else {
                            var118 = var109 + var112;
                        }
                        int var119 = var118;
                        if (var72 > 0) {
                            var118 += var72;
                        }
                        int var120 = 0;
                        int var121 = 0;
                        int var122 = 0;
                        int var123 = 0;
                        int var124 = 0;
                        if (var63 != null) {
                            var118 += 2;
                            var120 = var118;
                            if (var81 > 0) {
                                var118 += var81;
                            }
                            var118 += 2;
                            var121 = var118;
                            if (var83 > 0) {
                                var118 += var83;
                            }
                            var122 = var118;
                            var124 = var118;
                            if (var82 > 0) {
                                int var125 = var82 * var111;
                                var118 += var125;
                                var124 += (var125 - var107) / 2;
                            } else {
                                var118 += var107;
                            }
                            var123 = var118;
                            if (var84 > 0) {
                                var118 += var84;
                            }
                        }
                        int var126 = arg0.field1257[var57] - field533;
                        int var127 = var60.field2181 - var60.field2181 * var126 / var60.field2176;
                        int var128 = var60.field2172 * var126 / var60.field2176 + -var60.field2172;
                        int var129 = field636 + arg2 - (var118 >> 1) + var127;
                        int var130 = field654 + arg3 - 12 + var128;
                        int var131 = var130;
                        int var132 = var89 + var130;
                        int var133 = var60.field2174 + var130 + 15;
                        int var134 = var133 - var102.field4537;
                        int var135 = var102.field4543 + var133;
                        if (var134 < var130) {
                            var131 = var134;
                        }
                        if (var135 > var132) {
                            var132 = var135;
                        }
                        int var136 = 0;
                        if (var63 != null) {
                            var136 = var63.field2174 + var130 + 15;
                            int var137 = var136 - var103.field4537;
                            int var138 = var103.field4543 + var136;
                            if (var137 < var131) {
                                ;
                            }
                            if (var138 > var132) {
                                ;
                            }
                        }
                        int var141 = 255;
                        if (var60.field2183 >= 0) {
                            var141 = (var126 << 8) / (var60.field2176 - var60.field2183);
                        }
                        if (var141 >= 0 && var141 < 255) {
                            if (var90 != null) {
                                var90.method8864(var113 + var129 - var73, var130, var141);
                            }
                            if (var94 != null) {
                                var94.method8864(var114 + var129 - var75, var130, var141);
                            }
                            if (var92 != null) {
                                for (int var142 = 0; var142 < var110; var142++) {
                                    var92.method8864(var70 * var142 + (var115 + var129 - var74), var130, var141);
                                }
                            }
                            if (var96 != null) {
                                var96.method8864(var119 + var129 - var76, var130, var141);
                            }
                            var102.method6955(var108, var116 + var129, var133, var60.field2175, 0, var141);
                            if (var63 != null) {
                                if (var77 != null) {
                                    var77.method8864(var120 + var129 - var85, var130, var141);
                                }
                                if (var79 != null) {
                                    var79.method8864(var121 + var129 - var87, var130, var141);
                                }
                                if (var78 != null) {
                                    for (int var143 = 0; var143 < var111; var143++) {
                                        var78.method8864(var82 * var143 + (var122 + var129 - var86), var130, var141);
                                    }
                                }
                                if (var80 != null) {
                                    var80.method8864(var123 + var129 - var88, var130, var141);
                                }
                                var103.method6955(var105, var124 + var129, var136, var63.field2175, 0, var141);
                            }
                        } else {
                            if (var90 != null) {
                                var90.method8823(var113 + var129 - var73, var130);
                            }
                            if (var94 != null) {
                                var94.method8823(var114 + var129 - var75, var130);
                            }
                            if (var92 != null) {
                                for (int var144 = 0; var144 < var110; var144++) {
                                    var92.method8823(var70 * var144 + (var115 + var129 - var74), var130);
                                }
                            }
                            if (var96 != null) {
                                var96.method8823(var119 + var129 - var76, var130);
                            }
                            var102.method6954(var108, var116 + var129, var133, var60.field2175 | 0xFF000000, 0);
                            if (var63 != null) {
                                if (var77 != null) {
                                    var77.method8823(var120 + var129 - var85, var130);
                                }
                                if (var79 != null) {
                                    var79.method8823(var121 + var129 - var87, var130);
                                }
                                if (var78 != null) {
                                    for (int var145 = 0; var145 < var111; var145++) {
                                        var78.method8823(var82 * var145 + (var122 + var129 - var86), var130);
                                    }
                                }
                                if (var80 != null) {
                                    var80.method8823(var123 + var129 - var88, var130);
                                }
                                var103.method6954(var105, var124 + var129, var136, var63.field2175 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("qz.jf(I)V")
    public static final void method7082() {
        field791 = 0;
        int var0 = (Statics.field2696.field1227 >> 7) + Statics.field108;
        int var1 = (Statics.field2696.field1187 >> 7) + Statics.field103;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field791 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field791 = 1;
        }
        if (field791 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field791 = 0;
        }
    }

    @ObfuscatedName("ol.jk(Ldi;II)V")
    public static final void method6195(class98 arg0, int arg1) {
        method2999(arg0.field1227, arg0.field1187, arg1);
    }

    @ObfuscatedName("fc.jn(IIII)V")
    public static final void method2999(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field636 = -1;
            field654 = -1;
            return;
        }
        int var3 = method2725(arg0, arg1, Statics.field1072) - arg2;
        int var4 = arg0 - Statics.field824;
        int var5 = var3 - Statics.field94;
        int var6 = arg1 - Statics.field2931;
        int var7 = class241.field2553[Statics.field3946];
        int var8 = class241.field2554[Statics.field3946];
        int var9 = class241.field2553[Statics.field2875];
        int var10 = class241.field2554[Statics.field2875];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field636 = field593 * var11 / var15 + field523 / 2;
            field654 = field593 * var14 / var15 + field803 / 2;
        } else {
            field636 = -1;
            field654 = -1;
        }
    }

    @ObfuscatedName("es.js(IIIB)I")
    public static final int method2725(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class84.field1032[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class84.field1042[var5][var3][var4] + class84.field1042[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class84.field1042[var5][var3][var4 + 1] + class84.field1042[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("fr.jp(ZLuy;B)V")
    public static final void method3005(boolean arg0, class529 arg1) {
        field742 = arg0;
        if (!field742) {
            int var2 = arg1.method8598();
            int var3 = arg1.method8346();
            int var4 = arg1.method8598();
            Statics.field1853 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1853[var5][var6] = arg1.method8371();
                }
            }
            Statics.field1689 = new int[var4];
            Statics.field2036 = new int[var4];
            Statics.field2999 = new int[var4];
            Statics.field3660 = new byte[var4][];
            Statics.field2023 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field1689[var7] = var10;
                    Statics.field2036[var7] = Statics.field2002.method6279("m" + var8 + "_" + var9);
                    Statics.field2999[var7] = Statics.field2002.method6279("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method2236(var3, var2, true);
            return;
        }
        int var11 = arg1.method8345();
        boolean var12 = arg1.method8399() == 1;
        int var13 = arg1.method8407();
        int var14 = arg1.method8598();
        arg1.method8312();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8327(1);
                    if (var18 == 1) {
                        field596[var15][var16][var17] = arg1.method8327(26);
                    } else {
                        field596[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8338();
        Statics.field1853 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1853[var19][var20] = arg1.method8371();
            }
        }
        Statics.field1689 = new int[var14];
        Statics.field2036 = new int[var14];
        Statics.field2999 = new int[var14];
        Statics.field3660 = new byte[var14][];
        Statics.field2023 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field596[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field1689[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field1689[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field2036[var21] = Statics.field2002.method6279("m" + var30 + "_" + var31);
                            Statics.field2999[var21] = Statics.field2002.method6279("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method2236(var13, var11, !var12);
    }

    @ObfuscatedName("dp.jz(IIZI)V")
    public static final void method2236(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1151 == arg0 && Statics.field3944 == arg1) {
            return;
        }
        Statics.field1151 = arg0;
        Statics.field3944 = arg1;
        method7509(25);
        method7130(class367.field3996, true);
        int var3 = Statics.field108;
        int var4 = Statics.field103;
        Statics.field108 = (arg0 - 6) * 8;
        Statics.field103 = (arg1 - 6) * 8;
        int var5 = Statics.field108 - var3;
        int var6 = Statics.field103 - var4;
        int var7 = Statics.field108;
        int var8 = Statics.field103;
        for (int var9 = 0; var9 < 65536; var9++) {
            class103 var10 = field705[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1258[var11] -= var5;
                    var10.field1259[var11] -= var6;
                }
                var10.field1227 -= var5 * 128;
                var10.field1187 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class94 var13 = field726[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1258[var14] -= var5;
                    var13.field1259[var14] -= var6;
                }
                var13.field1227 -= var5 * 128;
                var13.field1187 -= var6 * 128;
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
                        field688[var25][var21][var22] = field688[var25][var23][var24];
                    } else {
                        field688[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class97 var26 = (class97) field659.method6532(); var26 != null; var26 = (class97) field659.method6543()) {
            var26.field1176 -= var5;
            var26.field1173 -= var6;
            if (var26.field1176 < 0 || var26.field1173 < 0 || var26.field1176 >= 104 || var26.field1173 >= 104) {
                var26.method7776();
            }
        }
        if (field527 != 0) {
            field527 -= var5;
            field770 -= var6;
        }
        field645 = 0;
        field769 = false;
        Statics.field824 -= var5 << 7;
        Statics.field2931 -= var6 << 7;
        Statics.field1029 -= var5 << 7;
        Statics.field3040 -= var6 << 7;
        field764 = -1;
        field661.method6534();
        field660.method6534();
        for (int var27 = 0; var27 < 4; var27++) {
            field594[var27].method3943();
        }
    }

    @ObfuscatedName("hh.jm(ZI)V")
    public static final void method3339(boolean arg0) {
        Statics.method5332();
        field579.field1431++;
        if (field579.field1431 < 50 && !arg0) {
            return;
        }
        field579.field1431 = 0;
        if (field725 || field579.method2679() == null) {
            return;
        }
        class311 var1 = class311.method2978(class309.field3181, field579.field1425);
        field579.method2682(var1);
        try {
            field579.method2674();
        } catch (IOException var3) {
            field725 = true;
        }
    }

    @ObfuscatedName("je.jb(I)V")
    public static final void method4491() {
        method3339(false);
        field589 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field3660.length; var1++) {
            if (Statics.field2036[var1] != -1 && Statics.field3660[var1] == null) {
                Statics.field3660[var1] = Statics.field2002.method6342(Statics.field2036[var1], 0);
                if (Statics.field3660[var1] == null) {
                    var0 = false;
                    field589++;
                }
            }
            if (Statics.field2999[var1] != -1 && Statics.field2023[var1] == null) {
                Statics.field2023[var1] = Statics.field2002.method6264(Statics.field2999[var1], 0, Statics.field1853[var1]);
                if (Statics.field2023[var1] == null) {
                    var0 = false;
                    field589++;
                }
            }
        }
        if (!var0) {
            field546 = 1;
            return;
        }
        field591 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field3660.length; var3++) {
            byte[] var4 = Statics.field2023[var3];
            if (var4 != null) {
                int var5 = (Statics.field1689[var3] >> 8) * 64 - Statics.field108;
                int var6 = (Statics.field1689[var3] & 0xFF) * 64 - Statics.field103;
                if (field742) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class84.method3529(var4, var5, var6);
            }
        }
        if (!var2) {
            field546 = 2;
            return;
        }
        if (field546 != 0) {
            method7130(class367.field3996 + class104.field1335 + class104.field1332 + 100 + "%" + class104.field1333, true);
        }
        Statics.method5332();
        Statics.field53.method4294();
        for (int var7 = 0; var7 < 4; var7++) {
            field594[var7].method3943();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class84.field1032[var8][var9][var10] = 0;
                }
            }
        }
        Statics.method5332();
        class84.method3293();
        int var11 = Statics.field3660.length;
        class71.method836();
        method3339(true);
        if (!field742) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field1689[var12] >> 8) * 64 - Statics.field108;
                int var14 = (Statics.field1689[var12] & 0xFF) * 64 - Statics.field103;
                byte[] var15 = Statics.field3660[var12];
                if (var15 != null) {
                    Statics.method5332();
                    class84.method7478(var15, var13, var14, Statics.field1151 * 8 - 48, Statics.field3944 * 8 - 48, field594);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field1689[var16] >> 8) * 64 - Statics.field108;
                int var18 = (Statics.field1689[var16] & 0xFF) * 64 - Statics.field103;
                byte[] var19 = Statics.field3660[var16];
                if (var19 == null && Statics.field3944 < 800) {
                    Statics.method5332();
                    class84.method1059(var17, var18, 64, 64);
                }
            }
            method3339(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field2023[var20];
                if (var21 != null) {
                    int var22 = (Statics.field1689[var20] >> 8) * 64 - Statics.field108;
                    int var23 = (Statics.field1689[var20] & 0xFF) * 64 - Statics.field103;
                    Statics.method5332();
                    class84.method8305(var21, var22, var23, Statics.field53, field594);
                }
            }
        }
        if (field742) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.method5332();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field596[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field1689.length; var34++) {
                                if (Statics.field1689[var34] == var33 && Statics.field3660[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class84.method2767(Statics.field3660[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field594);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class84.method13(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field596[0][var37][var38];
                    if (var39 == -1) {
                        class84.method1059(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method3339(true);
            for (int var40 = 0; var40 < 4; var40++) {
                Statics.method5332();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field596[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field1689.length; var49++) {
                                if (Statics.field1689[var49] == var48 && Statics.field2023[var49] != null) {
                                    class84.method2132(Statics.field2023[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field53, field594);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method3339(true);
        Statics.method5332();
        class84.method7764(Statics.field53, field594);
        method3339(true);
        int var50 = class84.field1033;
        if (var50 > Statics.field1072) {
            var50 = Statics.field1072;
        }
        if (var50 < Statics.field1072 - 1) {
            int var51 = Statics.field1072 - 1;
        }
        if (field748) {
            Statics.field53.method4295(class84.field1033);
        } else {
            Statics.field53.method4295(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method432(var52, var53);
            }
        }
        Statics.method5332();
        method5164();
        class220.field2196.method5288();
        if (Statics.field1743.method527()) {
            class311 var54 = class311.method2978(class309.field3214, field579.field1425);
            var54.field3250.method8351(1057001181);
            field579.method2682(var54);
        }
        if (!field742) {
            int var55 = (Statics.field1151 - 6) / 8;
            int var56 = (Statics.field1151 + 6) / 8;
            int var57 = (Statics.field3944 - 6) / 8;
            int var58 = (Statics.field3944 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field2002.method6284("m" + var59 + "_" + var60);
                        Statics.field2002.method6284("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method7509(30);
        Statics.method5332();
        class84.method2798();
        class311 var61 = class311.method2978(class309.field3175, field579.field1425);
        field579.method2682(var61);
        class35.method274();
    }

    @ObfuscatedName("df.jg(II)V")
    public static final void method2211(int arg0) {
        int[] var1 = Statics.field3560.field5235;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class84.field1032[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field53.method4330(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class84.field1032[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field53.method4330(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field3560.method8892();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class84.field1032[arg0][var10][var9] & 0x18) == 0) {
                    method32(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class84.field1032[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method32(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field600 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field53.method4379(Statics.field1072, var11, var12);
                if (var13 != 0L) {
                    int var15 = class255.method2100(var13);
                    int var16 = Statics.method2243(var15).field2219;
                    if (var16 >= 0 && class195.method2991(var16).field1942) {
                        field768[field600] = class195.method2991(var16).method3344(false);
                        field766[field600] = var11;
                        field767[field600] = var12;
                        field600++;
                    }
                }
            }
        }
        Statics.field2346.method8779();
    }

    @ObfuscatedName("ar.km(IIIIII)V")
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field53.method4332(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field53.method4336(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            if (class255.method6259(var5)) {
                var10 = arg4;
            }
            int[] var11 = Statics.field3560.field5235;
            int var12 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var13 = class255.method2100(var5);
            class220 var14 = Statics.method2243(var13);
            if (var14.field2242 == -1) {
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
                class543 var15 = Statics.field1977[var14.field2242];
                if (var15 != null) {
                    int var16 = (var14.field2206 * 4 - var15.field5231) / 2;
                    int var17 = (var14.field2207 * 4 - var15.field5229) / 2;
                    var15.method8786(arg1 * 4 + 48 + var16, (104 - arg2 - var14.field2207) * 4 + 48 + var17);
                }
            }
        }
        long var18 = Statics.field53.method4322(arg0, arg1, arg2);
        if (var18 != 0L) {
            int var20 = Statics.field53.method4336(arg0, arg1, arg2, var18);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = class255.method2100(var18);
            class220 var24 = Statics.method2243(var23);
            if (var24.field2242 != -1) {
                class543 var25 = Statics.field1977[var24.field2242];
                if (var25 != null) {
                    int var26 = (var24.field2206 * 4 - var25.field5231) / 2;
                    int var27 = (var24.field2207 * 4 - var25.field5229) / 2;
                    var25.method8786(arg1 * 4 + 48 + var26, (104 - arg2 - var24.field2207) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (class255.method6259(var18)) {
                    var28 = 15597568;
                }
                int[] var29 = Statics.field3560.field5235;
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
        long var31 = Statics.field53.method4379(arg0, arg1, arg2);
        if (var31 == 0L) {
            return;
        }
        int var33 = class255.method2100(var31);
        class220 var34 = Statics.method2243(var33);
        if (var34.field2242 == -1) {
            return;
        }
        class543 var35 = Statics.field1977[var34.field2242];
        if (var35 != null) {
            int var36 = (var34.field2206 * 4 - var35.field5231) / 2;
            int var37 = (var34.field2207 * 4 - var35.field5229) / 2;
            var35.method8786(arg1 * 4 + 48 + var36, (104 - arg2 - var34.field2207) * 4 + 48 + var37);
        }
    }

    @ObfuscatedName("client.kr(Lez;IS)Z")
    public boolean method1588(class114 arg0, int arg1) {
        if (arg0.field1428 == 0) {
            Statics.field3897 = null;
        } else {
            if (Statics.field3897 == null) {
                Statics.field3897 = new class444(Statics.field1781, Statics.field1743);
            }
            Statics.field3897.method7292(arg0.field1426, arg1);
        }
        method2787();
        arg0.field1427 = null;
        return true;
    }

    @ObfuscatedName("client.kg(Lez;I)Z")
    public boolean method1678(class114 arg0) {
        if (Statics.field3897 != null) {
            Statics.field3897.method7275(arg0.field1426);
        }
        method2787();
        arg0.field1427 = null;
        return true;
    }

    @ObfuscatedName("client.kq(Lez;I)Z")
    public final boolean method1193(class114 arg0) {
        class454 var2 = arg0.method2679();
        class529 var3 = arg0.field1426;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1427 == null) {
                if (arg0.field1433) {
                    if (!var2.method7436(1)) {
                        return false;
                    }
                    var2.method7447(arg0.field1426.field5139, 0, 1);
                    arg0.field1430 = 0;
                    arg0.field1433 = false;
                }
                var3.field5140 = 0;
                if (var3.method8325()) {
                    if (!var2.method7436(1)) {
                        return false;
                    }
                    var2.method7447(arg0.field1426.field5139, 1, 1);
                    arg0.field1430 = 0;
                }
                arg0.field1433 = true;
                class312[] var4 = class312.method3532();
                int var5 = var3.method8313();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5140);
                }
                arg0.field1427 = var4[var5];
                arg0.field1428 = arg0.field1427.field3326;
            }
            if (arg0.field1428 == -1) {
                if (!var2.method7436(1)) {
                    return false;
                }
                arg0.method2679().method7447(var3.field5139, 0, 1);
                arg0.field1428 = var3.field5139[0] & 0xFF;
            }
            if (arg0.field1428 == -2) {
                if (!var2.method7436(2)) {
                    return false;
                }
                arg0.method2679().method7447(var3.field5139, 0, 2);
                var3.field5140 = 0;
                arg0.field1428 = var3.method8598();
            }
            if (!var2.method7436(arg0.field1428)) {
                return false;
            }
            var3.field5140 = 0;
            var2.method7447(var3.field5139, 0, arg0.field1428);
            arg0.field1430 = 0;
            field587.method7132();
            arg0.field1434 = arg0.field1421;
            arg0.field1421 = arg0.field1432;
            arg0.field1432 = arg0.field1427;
            if (class312.field3267 == arg0.field1427) {
                return this.method1588(arg0, 1);
            }
            if (class312.field3288 == arg0.field1427) {
                method3216();
                byte var6 = var3.method8366();
                class149 var7 = new class149(var3);
                class157 var8;
                if (var6 >= 0) {
                    var8 = field607[var6];
                } else {
                    var8 = Statics.field2094;
                }
                if (var8 == null) {
                    this.method1202(var6);
                    arg0.field1427 = null;
                    return true;
                }
                if (var7.field1662 > var8.field1705) {
                    this.method1202(var6);
                    arg0.field1427 = null;
                    return true;
                }
                if (var7.field1662 < var8.field1705) {
                    arg0.field1427 = null;
                    return true;
                }
                var7.method2982(var8);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3352 == arg0.field1427) {
                method3216();
                byte var9 = var3.method8366();
                if (arg0.field1428 == 1) {
                    if (var9 >= 0) {
                        field607[var9] = null;
                    } else {
                        Statics.field2094 = null;
                    }
                    arg0.field1427 = null;
                    return true;
                }
                if (var9 >= 0) {
                    field607[var9] = new class157(var3);
                } else {
                    Statics.field2094 = new class157(var3);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3349 == arg0.field1427) {
                method2742(class310.field3243);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3372 == arg0.field1427) {
                method5612(true, var3);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3379 == arg0.field1427) {
                int var10 = var3.method8346();
                int var11 = var3.method8407();
                int var12 = var3.method8346();
                int var13 = var3.method8598();
                int var14 = var3.method8346();
                if (var14 == 65535) {
                    var14 = -1;
                }
                ArrayList var15 = new ArrayList();
                var15.add(var14);
                method3459(var15, var13, var10, var11, var12);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3262 == arg0.field1427) {
                field769 = true;
                field727 = false;
                field781 = true;
                int var16 = method2563(var3.method8368() & 0x7EB);
                int var17 = method3010(var3.method8368() & 0x7EB);
                int var18 = var3.method8598();
                int var19 = var3.method8365();
                field785 = new class494(Statics.field3946, var17, var18, var19);
                field784 = new class494(Statics.field2875, var16, var18, var19);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3266 == arg0.field1427) {
                method2742(class310.field3240);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3332 == arg0.field1427) {
                int var20 = var3.method8371();
                String var21 = var3.method8588();
                class347 var22 = Statics.field185.method5639(var20);
                if (!var21.equals(var22.field3740)) {
                    var22.field3740 = var21;
                    method2979(var22);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3300 == arg0.field1427) {
                int var23 = var3.method8399();
                int var24 = var3.method8407();
                int var25 = var3.method8346();
                if (var24 == 65535) {
                    var24 = -1;
                }
                class103 var26 = field705[var25];
                if (var26 != null) {
                    if (var26.field1232 == var24 && var24 != -1) {
                        int var27 = class223.method687(var24).field2341;
                        if (var27 == 1) {
                            var26.field1192 = 0;
                            var26.field1254 = 0;
                            var26.field1235 = var23;
                            var26.field1236 = 0;
                        } else if (var27 == 2) {
                            var26.field1236 = 0;
                        }
                    } else if (var24 == -1 || var26.field1232 == -1 || class223.method687(var24).field2334 >= class223.method687(var26.field1232).field2334) {
                        var26.field1232 = var24;
                        var26.field1192 = 0;
                        var26.field1254 = 0;
                        var26.field1235 = var23;
                        var26.field1236 = 0;
                        var26.field1262 = var26.field1219;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3258 == arg0.field1427) {
                int var28 = var3.method8407();
                class87.method6463(var28);
                field677[++field603 - 1 & 0x1F] = var28 & 0x7FFF;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3340 == arg0.field1427) {
                for (int var29 = 0; var29 < Statics.field1925; var29++) {
                    class193 var30 = class193.method2997(var29);
                    if (var30 != null) {
                        class336.field3567[var29] = 0;
                        class336.field3568[var29] = 0;
                    }
                }
                method5301();
                field632 += 32;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3382 == arg0.field1427) {
                method2742(class310.field3245);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3320 == arg0.field1427) {
                byte[] var31 = new byte[arg0.field1428];
                var3.method8311(var31, 0, var31.length);
                class530 var32 = new class530(var31);
                String var33 = var32.method8588();
                class32.method4708(var33, true, false);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3261 == arg0.field1427) {
                int var34 = var3.method8400();
                int var35 = var3.method8345();
                if (var35 == 65535) {
                    var35 = -1;
                }
                method5249(Statics.field2696, var35, var34);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3366 == arg0.field1427) {
                int var36 = var3.method8423();
                int var37 = var3.method8407();
                class347 var38 = Statics.field185.method5639(var36);
                if (var38.field3721 != 1 || var38.field3672 != var37) {
                    var38.field3721 = 1;
                    var38.field3672 = var37;
                    method2979(var38);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3316 == arg0.field1427) {
                int var39 = var3.method8365();
                int var40 = var3.method8365();
                int var41 = var3.method8365();
                int var42 = var3.method8365();
                field787[var39] = true;
                field788[var39] = var40;
                field681[var39] = var41;
                field790[var39] = var42;
                field708[var39] = 0;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3365 == arg0.field1427) {
                field727 = false;
                field769 = false;
                field780 = false;
                field781 = false;
                Statics.field1664 = 0;
                Statics.field4723 = 0;
                Statics.field1755 = 0;
                field782 = false;
                Statics.field2432 = 0;
                Statics.field4789 = 0;
                Statics.field1536 = 0;
                Statics.field1050 = 0;
                Statics.field1923 = 0;
                Statics.field225 = 0;
                Statics.field324 = 0;
                field783 = null;
                field785 = null;
                field784 = null;
                for (int var43 = 0; var43 < 5; var43++) {
                    field787[var43] = false;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3319 == arg0.field1427) {
                if (field797 != -1) {
                    method1976(field797, 0);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3347 == arg0.field1427) {
                method5301();
                field696 = var3.method8598();
                field730 = field665;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3371 == arg0.field1427) {
                int var44 = var3.method8421();
                int var45 = var3.method8398();
                class347 var46 = Statics.field185.method5639(var44);
                class347.method2711(var46, Statics.field2696.field1120.field3612, var45);
                method2979(var46);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3263 == arg0.field1427) {
                int var47 = var3.method8371();
                int var48 = var3.method8371();
                int var49 = class35.method2602();
                class311 var50 = class311.method2978(class309.field3144, field579.field1425);
                var50.field3250.method8585(var47);
                var50.field3250.method8420(var48);
                var50.field3250.method8348(var49);
                var50.field3250.method8396(field198);
                field579.method2682(var50);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3284 == arg0.field1427) {
                method2742(class310.field3235);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3375 == arg0.field1427) {
                field769 = true;
                field727 = false;
                field781 = false;
                Statics.field1664 = var3.method8365();
                Statics.field4723 = var3.method8365();
                Statics.field1755 = var3.method8598();
                Statics.field2432 = var3.method8365();
                Statics.field4789 = var3.method8365();
                if (Statics.field4789 >= 100) {
                    int var51 = Statics.field1664 * 128 + 64;
                    int var52 = Statics.field4723 * 128 + 64;
                    int var53 = method2725(var51, var52, Statics.field1072) - Statics.field1755;
                    int var54 = var51 - Statics.field824;
                    int var55 = var53 - Statics.field94;
                    int var56 = var52 - Statics.field2931;
                    int var57 = (int) Math.sqrt((double) (var54 * var54 + var56 * var56));
                    Statics.field3946 = (int) (Math.atan2((double) var55, (double) var57) * 325.9490051269531D) & 0x7FF;
                    Statics.field2875 = (int) (Math.atan2((double) var54, (double) var56) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field3946 < 128) {
                        Statics.field3946 = 128;
                    }
                    if (Statics.field3946 > 383) {
                        Statics.field3946 = 383;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3357 == arg0.field1427) {
                int var58 = var3.method8346();
                int var59 = var3.method8422();
                class347 var60 = Statics.field185.method5639(var59);
                if (var60.field3721 != 6 || var60.field3672 != var58) {
                    var60.field3721 = 6;
                    var60.field3672 = var58;
                    method2979(var60);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3312 == arg0.field1427) {
                int var61 = var3.method8365();
                if (var3.method8365() == 0) {
                    field715[var61] = new class383();
                    var3.field5140 += 18;
                } else {
                    var3.field5140--;
                    field715[var61] = new class383(var3, false);
                }
                field728 = field665;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3343 == arg0.field1427) {
                method5301();
                field697 = var3.method8368();
                field730 = field665;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3337 == arg0.field1427) {
                int var62 = var3.method8421();
                class347 var63 = Statics.field185.method5639(var62);
                var63.field3721 = 3;
                var63.field3672 = Statics.field2696.field1120.method5680();
                method2979(var63);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3380 == arg0.field1427) {
                field809 = var3.method8365();
                field729 = var3.method8399();
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3342 == arg0.field1427) {
                byte var64 = var3.method8366();
                long var65 = (long) var3.method8598();
                long var67 = (long) var3.method8445();
                long var69 = (var65 << 32) + var67;
                boolean var71 = false;
                class166 var72 = var64 >= 0 ? field763[var64] : Statics.field1659;
                if (var72 == null) {
                    var71 = true;
                } else {
                    for (int var73 = 0; var73 < 100; var73++) {
                        if (field754[var73] == var69) {
                            var71 = true;
                            break;
                        }
                    }
                }
                if (!var71) {
                    field754[field755] = var69;
                    field755 = (field755 + 1) % 100;
                    String var74 = class350.method3150(var3);
                    int var75 = var64 >= 0 ? 43 : 46;
                    class113.method3113(var75, "", var74, var72.field1775);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3325 == arg0.field1427) {
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3278 == arg0.field1427) {
                int var76 = var3.method8365();
                int var77 = var3.method8416();
                byte var78 = var3.method8366();
                int var79 = var3.method8398() * 4;
                int var80 = var3.method8365();
                int var81 = var3.method8399() * 4;
                int var82 = var3.method8345();
                int var83 = var3.method8415();
                int var84 = var83 >> 16;
                int var85 = var83 >> 8 & 0xFF;
                int var86 = (var83 >> 4 & 0x7) + var84;
                int var87 = (var83 & 0x7) + var85;
                int var88 = var3.method8407();
                int var89 = var3.method8345();
                byte var90 = var3.method8366();
                int var91 = var86 + var90;
                int var92 = var78 + var87;
                if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && var91 >= 0 && var92 >= 0 && var91 < 104 && var92 < 104 && var82 != 65535) {
                    int var93 = var86 * 128 + 64;
                    int var94 = var87 * 128 + 64;
                    int var95 = var91 * 128 + 64;
                    int var96 = var92 * 128 + 64;
                    class79 var97 = new class79(var82, Statics.field1072, var93, var94, method2725(var93, var94, Statics.field1072) - var81, field533 + var89, field533 + var88, var76, var80, var77, var79);
                    var97.method2084(var95, var96, method2725(var95, var96, Statics.field1072) - var79, field533 + var89);
                    field660.method6526(var97);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3273 == arg0.field1427) {
                method3005(true, arg0.field1426);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3346 == arg0.field1427) {
                Statics.field1907.field849.method7258(var3, arg0.field1428);
                method7817();
                field724 = field665;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3290 == arg0.field1427) {
                method2742(class310.field3247);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3259 == arg0.field1427) {
                int var98 = var3.method8371();
                int var99 = var3.method8407();
                if (var99 == 65535) {
                    var99 = -1;
                }
                int var100 = var3.method8422();
                class347 var101 = Statics.field185.method5639(var100);
                if (var101.field3675) {
                    var101.field3756 = var99;
                    var101.field3812 = var98;
                    class221 var103 = class221.method3594(var99).method3741(var98);
                    var101.field3729 = var103.field2274;
                    var101.field3674 = var103.field2243;
                    var101.field3765 = var103.field2259;
                    var101.field3731 = var103.field2260;
                    var101.field3728 = var103.field2282;
                    var101.field3723 = var103.field2270;
                    if (var103.field2262 == 1) {
                        var101.field3738 = 1;
                    } else {
                        var101.field3738 = 2;
                    }
                    if (var101.field3733 > 0) {
                        var101.field3723 = var101.field3723 * 32 / var101.field3733;
                    } else if (var101.field3688 > 0) {
                        var101.field3723 = var101.field3723 * 32 / var101.field3688;
                    }
                    method2979(var101);
                } else if (var99 == -1) {
                    var101.field3721 = 0;
                    arg0.field1427 = null;
                    return true;
                } else {
                    class221 var102 = class221.method3594(var99).method3741(var98);
                    var101.field3721 = 4;
                    var101.field3672 = var99;
                    var101.field3729 = var102.field2274;
                    var101.field3674 = var102.field2243;
                    var101.field3723 = var102.field2270 * 100 / var98;
                    method2979(var101);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3369 == arg0.field1427) {
                method2742(class310.field3237);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3378 == arg0.field1427) {
                int var104 = var3.method8371();
                int var105 = var3.method8422();
                class89 var106 = (class89) field691.method8104((long) var104);
                class89 var107 = (class89) field691.method8104((long) var105);
                if (var107 != null) {
                    method7505(var107, var106 == null || var106.field1076 != var107.field1076);
                }
                if (var106 != null) {
                    var106.method7776();
                    field691.method8098(var106, (long) var105);
                }
                class347 var108 = Statics.field185.method5639(var104);
                if (var108 != null) {
                    method2979(var108);
                }
                class347 var109 = Statics.field185.method5639(var105);
                if (var109 != null) {
                    method2979(var109);
                    method2301(Statics.field185.field3588[var109.field3676 >>> 16], var109, true);
                }
                if (field797 != -1) {
                    method1976(field797, 1);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3376 == arg0.field1427) {
                field518 = field665;
                byte var110 = var3.method8366();
                if (arg0.field1428 == 1) {
                    if (var110 >= 0) {
                        field763[var110] = null;
                    } else {
                        Statics.field1659 = null;
                    }
                    arg0.field1427 = null;
                    return true;
                }
                if (var110 >= 0) {
                    field763[var110] = new class166(var3);
                } else {
                    Statics.field1659 = new class166(var3);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3265 == arg0.field1427) {
                int var111 = var3.method8346();
                int var112 = var3.method8399();
                int var113 = var3.method8421();
                class89 var114 = (class89) field691.method8104((long) var113);
                if (var114 != null) {
                    method7505(var114, var114.field1076 != var111);
                }
                Statics.method3134(var113, var111, var112);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3330 == arg0.field1427) {
                field771 = var3.method8365();
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3277 == arg0.field1427) {
                Statics.field2317 = new class470(Statics.field380);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3293 == arg0.field1427) {
                int var115 = var3.method8422();
                class347 var116 = Statics.field185.method5639(var115);
                for (int var117 = 0; var117 < var116.field3787.length; var117++) {
                    var116.field3787[var117] = -1;
                    var116.field3787[var117] = 0;
                }
                method2979(var116);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3333 == arg0.field1427) {
                field769 = true;
                field727 = false;
                field781 = true;
                Statics.field1664 = var3.method8365();
                Statics.field4723 = var3.method8365();
                Statics.field1755 = var3.method8598();
                int var118 = var3.method8598();
                int var119 = var3.method8365();
                int var120 = Statics.field1664 * 128 + 64;
                int var121 = Statics.field4723 * 128 + 64;
                int var122 = method2725(var120, var121, Statics.field1072) - Statics.field1755;
                int var123 = var120 - Statics.field824;
                int var124 = var122 - Statics.field94;
                int var125 = var121 - Statics.field2931;
                double var126 = Math.sqrt((double) (var123 * var123 + var125 * var125));
                int var128 = method3010((int) (Math.atan2((double) var124, var126) * 325.9490051269531D) & 0x7FF);
                int var129 = method2563((int) (Math.atan2((double) var123, (double) var125) * -325.9490051269531D) & 0x7FF);
                field785 = new class494(Statics.field3946, var128, var118, var119);
                field784 = new class494(Statics.field2875, var129, var118, var119);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3295 == arg0.field1427) {
                int var130 = var3.method8345();
                int var131 = var3.method8407();
                class320.method3819(var131, var130);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3302 == arg0.field1427) {
                method5612(false, var3);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3301 == arg0.field1427) {
                int var132 = var3.method8345();
                int var133 = var3.method8399();
                int var134 = var3.method8415();
                int var135 = var134 >> 16;
                int var136 = var134 >> 8 & 0xFF;
                int var137 = (var134 >> 4 & 0x7) + var135;
                int var138 = (var134 & 0x7) + var136;
                int var139 = var3.method8346();
                if (var137 >= 0 && var138 >= 0 && var137 < 104 && var138 < 104) {
                    int var140 = var137 * 128 + 64;
                    int var141 = var138 * 128 + 64;
                    class73 var142 = new class73(var132, Statics.field1072, var140, var141, method2725(var140, var141, Statics.field1072) - var133, var139, field533);
                    field661.method6526(var142);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3274 == arg0.field1427) {
                int var143 = var3.method8365();
                Statics.method3280(var143);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3280 == arg0.field1427) {
                String var144 = var3.method8588();
                Object[] var145 = new Object[var144.length() + 1];
                for (int var146 = var144.length() - 1; var146 >= 0; var146--) {
                    if (var144.charAt(var146) == 's') {
                        var145[var146 + 1] = var3.method8588();
                    } else {
                        var145[var146 + 1] = Integer.valueOf(var3.method8371());
                    }
                }
                var145[0] = Integer.valueOf(var3.method8371());
                class90 var147 = new class90();
                var147.field1087 = var145;
                class72.method2004(var147);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3323 == arg0.field1427) {
                field518 = field665;
                byte var148 = var3.method8366();
                class163 var149 = new class163(var3);
                class166 var150;
                if (var148 >= 0) {
                    var150 = field763[var148];
                } else {
                    var150 = Statics.field1659;
                }
                if (var150 == null) {
                    this.method1418(var148);
                    arg0.field1427 = null;
                    return true;
                }
                if (var149.field1759 > var150.field1776) {
                    this.method1418(var148);
                    arg0.field1427 = null;
                    return true;
                }
                if (var149.field1759 < var150.field1776) {
                    arg0.field1427 = null;
                    return true;
                }
                var149.method3101(var150);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3307 == arg0.field1427) {
                int var151 = var3.method8346();
                if (var151 == 65535) {
                    var151 = -1;
                }
                field797 = var151;
                this.method1254(false);
                method6175(var151);
                class72.method3528(field797);
                for (int var152 = 0; var152 < 100; var152++) {
                    field740[var152] = true;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3287 == arg0.field1427) {
                String var153 = var3.method8588();
                long var154 = (long) var3.method8598();
                long var156 = (long) var3.method8445();
                class369 var158 = (class369) class388.method3894(class369.method3287(), var3.method8365());
                long var159 = (var154 << 32) + var156;
                boolean var161 = false;
                for (int var162 = 0; var162 < 100; var162++) {
                    if (field754[var162] == var159) {
                        var161 = true;
                        break;
                    }
                }
                if (Statics.field1907.method1800(new class553(var153, Statics.field1781))) {
                    var161 = true;
                }
                if (!var161 && field791 == 0) {
                    field754[field755] = var159;
                    field755 = (field755 + 1) % 100;
                    String var163 = class413.method6952(class402.method2346(class350.method3150(var3)));
                    byte var164;
                    if (var158.field4285) {
                        var164 = 7;
                    } else {
                        var164 = 3;
                    }
                    if (var158.field4284 == -1) {
                        class113.method6942(var164, var153, var163);
                    } else {
                        class113.method6942(var164, class104.method7216(var158.field4284) + var153, var163);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3305 == arg0.field1427) {
                int var165 = var3.method8368();
                int var166 = var3.method8421();
                int var167 = var3.method8443();
                class347 var168 = Statics.field185.method5639(var166);
                if (var168.field3686 != var165 || var168.field3687 != var167 || var168.field3803 != 0 || var168.field3683 != 0) {
                    var168.field3686 = var165;
                    var168.field3687 = var167;
                    var168.field3803 = 0;
                    var168.field3683 = 0;
                    method2979(var168);
                    this.method1198(var168);
                    if (var168.field3679 == 0) {
                        method2301(Statics.field185.field3588[var166 >> 16], var168, false);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3383 == arg0.field1427) {
                int var169 = var3.method8371();
                int var170 = var3.method8400();
                int var171 = var3.method8365();
                class347 var172 = Statics.field185.method5639(var169);
                class347.method2740(var172, var171, var170);
                method2979(var172);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3306 == arg0.field1427) {
                int var173 = var3.method8346();
                int var174 = var3.method8371();
                int var175 = var173 >> 10 & 0x1F;
                int var176 = var173 >> 5 & 0x1F;
                int var177 = var173 & 0x1F;
                int var178 = (var177 << 3) + (var175 << 19) + (var176 << 11);
                class347 var179 = Statics.field185.method5639(var174);
                if (var179.field3702 != var178) {
                    var179.field3702 = var178;
                    method2979(var179);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3309 == arg0.field1427) {
                int var180 = var3.method8407();
                byte var181 = var3.method8366();
                class336.field3567[var180] = var181;
                if (class336.field3568[var180] != var181) {
                    class336.field3568[var180] = var181;
                }
                method2224(var180);
                field717[++field632 - 1 & 0x1F] = var180;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3297 == arg0.field1427) {
                int var182 = var3.method8422();
                boolean var183 = var3.method8365() == 1;
                class347 var184 = Statics.field185.method5639(var182);
                class347.method6193(var184, Statics.field2696.field1120, var183);
                method2979(var184);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3350 == arg0.field1427) {
                int var185 = var3.method8346();
                if (var185 == 65535) {
                    var185 = -1;
                }
                int var186 = var3.method8598();
                int var187 = var3.method8346();
                int var188 = var3.method8345();
                int var189 = var3.method8346();
                int var190 = var3.method8345();
                if (var190 == 65535) {
                    var190 = -1;
                }
                ArrayList var191 = new ArrayList();
                var191.add(var185);
                var191.add(var190);
                method3459(var191, var189, var187, var188, var186);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3359 == arg0.field1427) {
                return this.method1678(arg0);
            }
            if (class312.field3377 == arg0.field1427) {
                method2742(class310.field3244);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3291 == arg0.field1427) {
                method2742(class310.field3241);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3328 == arg0.field1427) {
                Statics.field2317 = null;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3368 == arg0.field1427) {
                method2742(class310.field3239);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3355 == arg0.field1427) {
                int var192 = var3.method8598();
                int var193 = var3.method8365();
                int var194 = var3.method8598();
                method7516(var192, var193, var194);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3384 == arg0.field1427) {
                int var195 = arg0.field1428 + var3.field5140;
                int var196 = var3.method8598();
                if (var196 == 65535) {
                    var196 = -1;
                }
                int var197 = var3.method8598();
                if (field797 != var196) {
                    field797 = var196;
                    this.method1254(false);
                    method6175(field797);
                    class72.method3528(field797);
                    for (int var198 = 0; var198 < 100; var198++) {
                        field740[var198] = true;
                    }
                }
                while (var197-- > 0) {
                    int var199 = var3.method8371();
                    int var200 = var3.method8598();
                    int var201 = var3.method8365();
                    class89 var202 = (class89) field691.method8104((long) var199);
                    if (var202 != null && var202.field1076 != var200) {
                        method7505(var202, true);
                        var202 = null;
                    }
                    if (var202 == null) {
                        var202 = Statics.method3134(var199, var200, var201);
                    }
                    var202.field1075 = true;
                }
                for (class89 var203 = (class89) field691.method8091(); var203 != null; var203 = (class89) field691.method8092()) {
                    if (var203.field1075) {
                        var203.field1075 = false;
                    } else {
                        method7505(var203, true);
                    }
                }
                field737 = new class504(512);
                while (var3.field5140 < var195) {
                    int var204 = var3.method8371();
                    int var205 = var3.method8598();
                    int var206 = var3.method8598();
                    int var207 = var3.method8371();
                    for (int var208 = var205; var208 <= var206; var208++) {
                        long var209 = ((long) var204 << 32) + (long) var208;
                        field737.method8098(new class487(var207), var209);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3314 == arg0.field1427) {
                class110.method2144(var3, arg0.field1428);
                method2186();
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3315 == arg0.field1427) {
                boolean var211 = var3.method8365() == 1;
                if (var211) {
                    Statics.field4527 = class316.method6401() - var3.method8573();
                    Statics.field3570 = new class376(var3, true);
                } else {
                    Statics.field3570 = null;
                }
                field745 = field665;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3269 == arg0.field1427) {
                Statics.field1892 = var3.method8365();
                Statics.field3857 = var3.method8365();
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3282 == arg0.field1427) {
                int var212 = var3.method8371();
                int var213 = var3.method8371();
                class347 var214 = Statics.field185.method5639(var213);
                class347.method5311(var214, var212);
                method2979(var214);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3281 == arg0.field1427) {
                int var215 = var3.method8399();
                int var216 = var215 >> 2;
                int var217 = var215 & 0x3;
                int var218 = field597[var216];
                int var219 = var3.method8414();
                int var220 = var219 >> 16;
                int var221 = var219 >> 8 & 0xFF;
                int var222 = (var219 >> 4 & 0x7) + var220;
                int var223 = (var219 & 0x7) + var221;
                int var224 = var3.method8345();
                if (var222 >= 0 && var223 >= 0 && var222 < 103 && var223 < 103) {
                    if (var218 == 0) {
                        class262 var225 = Statics.field53.method4316(Statics.field1072, var222, var223);
                        if (var225 != null) {
                            int var226 = class255.method2100(var225.field2863);
                            if (var216 == 2) {
                                var225.field2860 = new class82(var226, 2, var217 + 4, Statics.field1072, var222, var223, var224, false, var225.field2860);
                                var225.field2861 = new class82(var226, 2, var217 + 1 & 0x3, Statics.field1072, var222, var223, var224, false, var225.field2861);
                            } else {
                                var225.field2860 = new class82(var226, var216, var217, Statics.field1072, var222, var223, var224, false, var225.field2860);
                            }
                        }
                    } else if (var218 == 1) {
                        class264 var227 = Statics.field53.method4317(Statics.field1072, var222, var223);
                        if (var227 != null) {
                            int var228 = class255.method2100(var227.field2873);
                            if (var216 == 4 || var216 == 5) {
                                var227.field2877 = new class82(var228, 4, var217, Statics.field1072, var222, var223, var224, false, var227.field2877);
                            } else if (var216 == 6) {
                                var227.field2877 = new class82(var228, 4, var217 + 4, Statics.field1072, var222, var223, var224, false, var227.field2877);
                            } else if (var216 == 7) {
                                var227.field2877 = new class82(var228, 4, (var217 + 2 & 0x3) + 4, Statics.field1072, var222, var223, var224, false, var227.field2877);
                            } else if (var216 == 8) {
                                var227.field2877 = new class82(var228, 4, var217 + 4, Statics.field1072, var222, var223, var224, false, var227.field2877);
                                var227.field2864 = new class82(var228, 4, (var217 + 2 & 0x3) + 4, Statics.field1072, var222, var223, var224, false, var227.field2864);
                            }
                        }
                    } else if (var218 == 2) {
                        class265 var229 = Statics.field53.method4460(Statics.field1072, var222, var223);
                        if (var216 == 11) {
                            var216 = 10;
                        }
                        if (var229 != null) {
                            var229.field2882 = new class82(class255.method2100(var229.field2890), var216, var217, Statics.field1072, var222, var223, var224, false, var229.field2882);
                        }
                    } else if (var218 == 3) {
                        class237 var230 = Statics.field53.method4466(Statics.field1072, var222, var223);
                        if (var230 != null) {
                            var230.field2495 = new class82(class255.method2100(var230.field2493), 22, var217, Statics.field1072, var222, var223, var224, false, var230.field2495);
                        }
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3335 == arg0.field1427) {
                int var231 = var3.method8407();
                int var232 = var3.method8399();
                int var233 = var3.method8346();
                class94 var234;
                if (field646 == var233) {
                    var234 = Statics.field2696;
                } else {
                    var234 = field726[var233];
                }
                int var235 = var3.method8371();
                if (var234 != null) {
                    var234.method2312(var232, var231, var235 >> 16, var235 & 0xFFFF);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3341 == arg0.field1427) {
                int var236 = var3.method8371();
                boolean var237 = var3.method8365() == 1;
                class347 var238 = Statics.field185.method5639(var236);
                if (var238.field3697 != var237) {
                    var238.field3697 = var237;
                    method2979(var238);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3304 == arg0.field1427) {
                int var239 = var3.method8346();
                int var240 = var3.method8598();
                int var241 = var3.method8345();
                int var242 = var3.method8346();
                class320.method3526(var239, var240, var241, var242);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3353 == arg0.field1427) {
                field640 = var3.method8407() * 30;
                field730 = field665;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3344 == arg0.field1427) {
                int var243 = var3.method8421();
                int var244 = var3.method8345();
                class347 var245 = Statics.field185.method5639(var243);
                if (var245 != null && var245.field3679 == 0) {
                    if (var244 > var245.field3776 - var245.field3693) {
                        var244 = var245.field3776 - var245.field3693;
                    }
                    if (var244 < 0) {
                        var244 = 0;
                    }
                    if (var245.field3699 != var244) {
                        var245.field3699 = var244;
                        method2979(var245);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3283 == arg0.field1427) {
                int var246 = var3.method8421();
                int var247 = var3.method8345();
                if (var247 == 65535) {
                    var247 = -1;
                }
                int var248 = var3.method8598();
                if (var248 == 65535) {
                    var248 = -1;
                }
                int var249 = var3.method8422();
                for (int var250 = var248; var250 <= var247; var250++) {
                    long var251 = ((long) var249 << 32) + (long) var250;
                    class488 var253 = field737.method8104(var251);
                    if (var253 != null) {
                        var253.method7776();
                    }
                    field737.method8098(new class487(var246), var251);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3264 == arg0.field1427) {
                int var254 = var3.method8407();
                if (var254 == 65535) {
                    var254 = -1;
                }
                method5582(var254);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3275 == arg0.field1427) {
                int var255 = var3.method8346();
                if (var255 == 65535) {
                    var255 = -1;
                }
                int var256 = var3.method8414();
                method7224(var255, var256);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3327 == arg0.field1427) {
                class69 var257 = new class69();
                var257.field826 = var3.method8588();
                var257.field833 = var3.method8598();
                int var258 = var3.method8371();
                var257.field832 = var258;
                if (var257.method1736()) {
                    var257.field834 = "beta";
                }
                method7509(45);
                var2.method7441();
                Object var259 = null;
                class78.method6507(var257);
                arg0.field1427 = null;
                return false;
            }
            if (class312.field3270 == arg0.field1427) {
                int var260 = var3.method8346();
                short var261 = (short) var3.method8411();
                int var262 = var3.method8421();
                int var263 = var3.method8399();
                class103 var264 = field705[var260];
                if (var264 != null) {
                    var264.method2545(var263, var262, var261);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3322 == arg0.field1427) {
                String var265 = var3.method8588();
                int var266 = var3.method8365();
                int var267 = var3.method8399();
                if (var266 >= 1 && var266 <= 8) {
                    if (var265.equalsIgnoreCase(class367.field3956)) {
                        var265 = null;
                    }
                    field779[var266 - 1] = var265;
                    field655[var266 - 1] = var267 == 0;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3299 == arg0.field1427) {
                int var268 = var3.method8421();
                int var269 = var3.method8407();
                int var270 = var3.method8365();
                int var271 = var3.method8598();
                class103 var272 = field705[var271];
                if (var272 != null) {
                    var272.method2312(var270, var269, var268 >> 16, var268 & 0xFFFF);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3294 == arg0.field1427) {
                for (int var273 = 0; var273 < field726.length; var273++) {
                    if (field726[var273] != null) {
                        field726[var273].field1232 = -1;
                    }
                }
                for (int var274 = 0; var274 < field705.length; var274++) {
                    if (field705[var274] != null) {
                        field705[var274].field1232 = -1;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3272 == arg0.field1427) {
                field527 = var3.method8365();
                if (field527 == 255) {
                    field527 = 0;
                }
                field770 = var3.method8365();
                if (field770 == 255) {
                    field770 = 0;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3373 == arg0.field1427) {
                if (Statics.field2317 == null) {
                    Statics.field2317 = new class470(Statics.field380);
                }
                class539 var275 = Statics.field380.method7690(var3);
                Statics.field2317.field4816.method8110(var275.field5206, var275.field5205);
                field721[++field722 - 1 & 0x1F] = var275.field5206;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3318 == arg0.field1427) {
                int var276 = var3.method8526();
                boolean var277 = var3.method8365() == 1;
                String var278 = "";
                boolean var279 = false;
                if (var277) {
                    var278 = var3.method8588();
                    if (Statics.field1907.method1800(new class553(var278, Statics.field1781))) {
                        var279 = true;
                    }
                }
                String var280 = var3.method8588();
                if (!var279) {
                    class113.method6942(var276, var278, var280);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3296 == arg0.field1427) {
                Statics.field1892 = var3.method8365();
                Statics.field3857 = var3.method8400();
                while (var3.field5140 < arg0.field1428) {
                    int var281 = var3.method8365();
                    class310 var282 = class310.method6748()[var281];
                    method2742(var282);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3364 == arg0.field1427) {
                int var283 = var3.method8371();
                int var284 = var3.method8598();
                if (var283 < -70000) {
                    var284 += 32768;
                }
                class347 var285;
                if (var283 >= 0) {
                    var285 = Statics.field185.method5639(var283);
                } else {
                    var285 = null;
                }
                while (var3.field5140 < arg0.field1428) {
                    int var286 = var3.method8526();
                    int var287 = var3.method8598();
                    int var288 = 0;
                    if (var287 != 0) {
                        var288 = var3.method8365();
                        if (var288 == 255) {
                            var288 = var3.method8371();
                        }
                    }
                    if (var285 != null && var286 >= 0 && var286 < var285.field3787.length) {
                        var285.field3787[var286] = var287;
                        var285.field3810[var286] = var288;
                    }
                    class87.method2091(var284, var286, var287 - 1, var288);
                }
                if (var285 != null) {
                    method2979(var285);
                }
                method5301();
                field677[++field603 - 1 & 0x1F] = var284 & 0x7FFF;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3321 == arg0.field1427) {
                Statics.field1907.method1794();
                field724 = field665;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3345 == arg0.field1427) {
                method2742(class310.field3246);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3260 == arg0.field1427) {
                var3.field5140 += 28;
                if (var3.method8546()) {
                    method2522(var3, var3.field5140 - 28);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3317 == arg0.field1427) {
                int var289 = var3.method8371();
                int var290 = var3.method8346();
                class347 var291 = Statics.field185.method5639(var289);
                if (var291.field3721 != 2 || var291.field3672 != var290) {
                    var291.field3721 = 2;
                    var291.field3672 = var290;
                    method2979(var291);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3298 == arg0.field1427) {
                int var292 = var3.method8423();
                int var293 = var3.method8407();
                int var294 = var3.method8598();
                class347 var295 = Statics.field185.method5639(var292);
                var295.field3734 = (var294 << 16) + var293;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3374 == arg0.field1427) {
                int var296 = var3.method8371();
                if (field548 != var296) {
                    field548 = var296;
                    method3233();
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3338 == arg0.field1427) {
                class37.method6174(var3, arg0.field1428);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3308 == arg0.field1427) {
                int var297 = var3.method8371();
                class89 var298 = (class89) field691.method8104((long) var297);
                if (var298 != null) {
                    method7505(var298, true);
                }
                if (field624 != null) {
                    method2979(field624);
                    field624 = null;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3313 == arg0.field1427) {
                int var299 = var3.method8371();
                int var300 = var3.method8598();
                if (var299 < -70000) {
                    var300 += 32768;
                }
                class347 var301;
                if (var299 >= 0) {
                    var301 = Statics.field185.method5639(var299);
                } else {
                    var301 = null;
                }
                if (var301 != null) {
                    for (int var302 = 0; var302 < var301.field3787.length; var302++) {
                        var301.field3787[var302] = 0;
                        var301.field3810[var302] = 0;
                    }
                }
                class87.method3015(var300);
                int var303 = var3.method8598();
                for (int var304 = 0; var304 < var303; var304++) {
                    int var305 = var3.method8365();
                    if (var305 == 255) {
                        var305 = var3.method8422();
                    }
                    int var306 = var3.method8598();
                    if (var301 != null && var304 < var301.field3787.length) {
                        var301.field3787[var304] = var306;
                        var301.field3810[var304] = var305;
                    }
                    class87.method2091(var300, var304, var306 - 1, var305);
                }
                if (var301 != null) {
                    method2979(var301);
                }
                method5301();
                field677[++field603 - 1 & 0x1F] = var300 & 0x7FFF;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3286 == arg0.field1427) {
                method5301();
                int var307 = var3.method8365();
                int var308 = var3.method8400();
                int var309 = var3.method8422();
                field664[var307] = var309;
                field565[var307] = var308;
                field658[var307] = 1;
                for (int var310 = 0; var310 < 98; var310++) {
                    if (var309 >= class357.field3886[var310]) {
                        field658[var307] = var310 + 2;
                    }
                }
                field719[++field606 - 1 & 0x1F] = var307;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3311 == arg0.field1427) {
                return this.method1588(arg0, 2);
            }
            if (class312.field3331 == arg0.field1427) {
                method2742(class310.field3238);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3271 == arg0.field1427) {
                field540 = var3.method8365();
                if (field540 == 1) {
                    field541 = var3.method8598();
                }
                if (field540 >= 2 && field540 <= 6) {
                    if (field540 == 2) {
                        field630 = 64;
                        field798 = 64;
                    }
                    if (field540 == 3) {
                        field630 = 0;
                        field798 = 64;
                    }
                    if (field540 == 4) {
                        field630 = 128;
                        field798 = 64;
                    }
                    if (field540 == 5) {
                        field630 = 64;
                        field798 = 0;
                    }
                    if (field540 == 6) {
                        field630 = 64;
                        field798 = 128;
                    }
                    field540 = 2;
                    field584 = var3.method8598();
                    field544 = var3.method8598();
                    field545 = var3.method8365();
                }
                if (field540 == 10) {
                    field542 = var3.method8598();
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3303 == arg0.field1427) {
                Statics.field1907.method1824(var3, arg0.field1428);
                field724 = field665;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3360 == arg0.field1427) {
                int var311 = var3.method8422();
                int var312 = var3.method8407();
                class336.field3567[var312] = var311;
                if (class336.field3568[var312] != var311) {
                    class336.field3568[var312] = var311;
                }
                method2224(var312);
                field717[++field632 - 1 & 0x1F] = var312;
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3276 == arg0.field1427) {
                method3005(false, arg0.field1426);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3362 == arg0.field1427) {
                Statics.field1892 = var3.method8365();
                Statics.field3857 = var3.method8399();
                for (int var313 = Statics.field1892; var313 < Statics.field1892 + 8; var313++) {
                    for (int var314 = Statics.field3857; var314 < Statics.field3857 + 8; var314++) {
                        if (field688[Statics.field1072][var313][var314] != null) {
                            field688[Statics.field1072][var313][var314] = null;
                            method432(var313, var314);
                        }
                    }
                }
                for (class97 var315 = (class97) field659.method6532(); var315 != null; var315 = (class97) field659.method6543()) {
                    if (var315.field1176 >= Statics.field1892 && var315.field1176 < Statics.field1892 + 8 && var315.field1173 >= Statics.field3857 && var315.field1173 < Statics.field3857 + 8 && Statics.field1072 == var315.field1175) {
                        var315.field1184 = 0;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3324 == arg0.field1427) {
                field769 = true;
                field727 = false;
                field781 = true;
                int var316 = var3.method8368();
                int var317 = var3.method8368();
                int var318 = method3010(Statics.field3946 + var317 & 0x7EB);
                int var319 = Statics.field2875 + var316;
                int var320 = var3.method8598();
                int var321 = var3.method8365();
                field785 = new class494(Statics.field3946, var318, var320, var321);
                field784 = new class494(Statics.field2875, var319, var320, var321);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3310 == arg0.field1427) {
                Statics.field120 = class549.method2784(var3.method8365());
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3381 == arg0.field1427) {
                int var322 = var3.method8346();
                int var323 = var3.method8414();
                int var324 = var323 >> 16;
                int var325 = var323 >> 8 & 0xFF;
                int var326 = (var323 >> 4 & 0x7) + var324;
                int var327 = (var323 & 0x7) + var325;
                int var328 = var3.method8345();
                int var329 = var3.method8399() * 4;
                byte var330 = var3.method8402();
                byte var331 = var3.method8401();
                int var332 = var3.method8346();
                int var333 = var3.method8345();
                int var334 = var3.method8370();
                int var335 = var3.method8400();
                int var336 = var3.method8398() * 4;
                int var337 = var326 + var330;
                int var338 = var327 + var331;
                if (var326 >= 0 && var327 >= 0 && var326 < 104 && var327 < 104 && var337 >= 0 && var338 >= 0 && var337 < 104 && var338 < 104 && var322 != 65535) {
                    int var339 = var326 * 128 + 64;
                    int var340 = var327 * 128 + 64;
                    int var341 = var337 * 128 + 64;
                    int var342 = var338 * 128 + 64;
                    class79 var343 = new class79(var322, Statics.field1072, var339, var340, method2725(var339, var340, Statics.field1072) - var329, field533 + var333, field533 + var332, var335, var328, var334, var336);
                    var343.method2084(var341, var342, method2725(var341, var342, Statics.field1072) - var336, field533 + var333);
                    field660.method6526(var343);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3268 == arg0.field1427) {
                String var344 = var3.method8588();
                long var345 = var3.method8573();
                long var347 = (long) var3.method8598();
                long var349 = (long) var3.method8445();
                class369 var351 = (class369) class388.method3894(class369.method3287(), var3.method8365());
                long var352 = (var347 << 32) + var349;
                boolean var354 = false;
                for (int var355 = 0; var355 < 100; var355++) {
                    if (field754[var355] == var352) {
                        var354 = true;
                        break;
                    }
                }
                if (var351.field4272 && Statics.field1907.method1800(new class553(var344, Statics.field1781))) {
                    var354 = true;
                }
                if (!var354 && field791 == 0) {
                    field754[field755] = var352;
                    field755 = (field755 + 1) % 100;
                    String var356 = class413.method6952(class402.method2346(class350.method3150(var3)));
                    if (var351.field4284 == -1) {
                        class113.method3113(9, var344, var356, class404.method3109(var345));
                    } else {
                        class113.method3113(9, class104.method7216(var351.field4284) + var344, var356, class404.method3109(var345));
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3339 == arg0.field1427 && field769) {
                field727 = true;
                field781 = false;
                field780 = false;
                for (int var357 = 0; var357 < 5; var357++) {
                    field787[var357] = false;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3292 == arg0.field1427) {
                int var358 = var3.method8574();
                int var359 = var3.method8422();
                class347 var360 = Statics.field185.method5639(var359);
                if (var360.field3764 != var358 || var358 == -1) {
                    var360.field3764 = var358;
                    var360.field3813 = 0;
                    var360.field3814 = 0;
                    method2979(var360);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3279 == arg0.field1427) {
                boolean var361 = var3.method8577();
                if (!var361) {
                    Statics.field2872 = null;
                } else if (Statics.field2872 == null) {
                    Statics.field2872 = new class385();
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3334 == arg0.field1427) {
                byte var362 = var3.method8366();
                String var363 = var3.method8588();
                long var364 = (long) var3.method8598();
                long var366 = (long) var3.method8445();
                class369 var368 = (class369) class388.method3894(class369.method3287(), var3.method8365());
                long var369 = (var364 << 32) + var366;
                boolean var371 = false;
                Object var372 = null;
                class166 var373 = var362 >= 0 ? field763[var362] : Statics.field1659;
                if (var373 == null) {
                    var371 = true;
                } else {
                    int var374 = 0;
                    while (true) {
                        if (var374 >= 100) {
                            if (var368.field4272 && Statics.field1907.method1800(new class553(var363, Statics.field1781))) {
                                var371 = true;
                            }
                            break;
                        }
                        if (field754[var374] == var369) {
                            var371 = true;
                            break;
                        }
                        var374++;
                    }
                }
                if (!var371) {
                    field754[field755] = var369;
                    field755 = (field755 + 1) % 100;
                    String var375 = class413.method6952(class350.method3150(var3));
                    int var376 = var362 >= 0 ? 41 : 44;
                    if (var368.field4284 == -1) {
                        class113.method3113(var376, var363, var375, var373.field1775);
                    } else {
                        class113.method3113(var376, class104.method7216(var368.field4284) + var363, var375, var373.field1775);
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3363 == arg0.field1427) {
                field769 = true;
                field727 = false;
                field780 = true;
                Statics.field1923 = var3.method8365();
                Statics.field225 = var3.method8365();
                int var377 = var3.method8598();
                int var378 = var3.method8598();
                field782 = var3.method8577();
                int var379 = var3.method8365();
                int var380 = Statics.field1923 * 128 + 64;
                int var381 = Statics.field225 * 128 + 64;
                boolean var382 = false;
                boolean var383 = false;
                int var384;
                int var385;
                if (field782) {
                    var384 = Statics.field94;
                    var385 = method2725(var380, var381, Statics.field1072) - var377;
                } else {
                    var384 = method2725(Statics.field824, Statics.field2931, Statics.field1072) - Statics.field94;
                    var385 = var377;
                }
                field783 = new class493(Statics.field824, Statics.field2931, var384, var380, var381, var385, var378, var379);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3354 == arg0.field1427) {
                for (int var386 = 0; var386 < class336.field3568.length; var386++) {
                    if (class336.field3568[var386] != class336.field3567[var386]) {
                        class336.field3568[var386] = class336.field3567[var386];
                        method2224(var386);
                        field717[++field632 - 1 & 0x1F] = var386;
                    }
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3289 == arg0.field1427) {
                int var387 = var3.method8365();
                method54(var387);
                arg0.field1427 = null;
                return false;
            }
            if (class312.field3348 == arg0.field1427) {
                field769 = true;
                field727 = false;
                field780 = true;
                Statics.field1923 = var3.method8365();
                Statics.field225 = var3.method8365();
                int var388 = var3.method8598();
                int var389 = var3.method8365() * 128 + 64;
                int var390 = var3.method8365() * 128 + 64;
                int var391 = var3.method8598();
                field782 = var3.method8577();
                int var392 = var3.method8365();
                int var393 = Statics.field1923 * 128 + 64;
                int var394 = Statics.field225 * 128 + 64;
                boolean var395 = false;
                boolean var396 = false;
                int var397;
                int var398;
                if (field782) {
                    var397 = Statics.field94;
                    var398 = method2725(var393, var394, Statics.field1072) - var388;
                } else {
                    var397 = method2725(Statics.field824, Statics.field2931, Statics.field1072) - Statics.field94;
                    var398 = var388;
                }
                field783 = new class492(Statics.field824, Statics.field2931, var397, var393, var394, var398, var389, var390, var391, var392);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3329 == arg0.field1427) {
                method3944();
                arg0.field1427 = null;
                return false;
            }
            if (class312.field3370 == arg0.field1427) {
                field769 = true;
                field727 = false;
                field780 = false;
                Statics.field1923 = var3.method8365();
                Statics.field225 = var3.method8365();
                Statics.field324 = var3.method8598();
                Statics.field1050 = var3.method8365();
                Statics.field1536 = var3.method8365();
                if (Statics.field1536 >= 100) {
                    Statics.field824 = Statics.field1923 * 128 + 64;
                    Statics.field2931 = Statics.field225 * 128 + 64;
                    Statics.field94 = method2725(Statics.field824, Statics.field2931, Statics.field1072) - Statics.field324;
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3285 == arg0.field1427) {
                String var399 = var3.method8588();
                String var400 = class413.method6952(class402.method2346(class350.method3150(var3)));
                class113.method6942(6, var399, var400);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3356 == arg0.field1427) {
                method1757(var3.method8588());
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3367 == arg0.field1427) {
                int var401 = var3.method8598();
                int var402 = var3.method8421();
                int var403 = var3.method8598();
                int var404 = var3.method8345();
                class347 var405 = Statics.field185.method5639(var402);
                if (var405.field3729 != var401 || var405.field3674 != var404 || var405.field3723 != var403) {
                    var405.field3729 = var401;
                    var405.field3674 = var404;
                    var405.field3723 = var403;
                    method2979(var405);
                }
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3336 == arg0.field1427) {
                method2742(class310.field3242);
                arg0.field1427 = null;
                return true;
            }
            if (class312.field3361 == arg0.field1427) {
                method2742(class310.field3236);
                arg0.field1427 = null;
                return true;
            }
            class556.method3321("" + (arg0.field1427 == null ? -1 : arg0.field1427.field3358) + class104.field1336 + (arg0.field1421 == null ? -1 : arg0.field1421.field3358) + class104.field1336 + (arg0.field1434 == null ? -1 : arg0.field1434.field3358) + class104.field1336 + arg0.field1428, (Throwable) null);
            method3944();
        } catch (IOException var410) {
            method2992();
        } catch (Exception var411) {
            String var408 = "" + (arg0.field1427 == null ? -1 : arg0.field1427.field3358) + class104.field1336 + (arg0.field1421 == null ? -1 : arg0.field1421.field3358) + class104.field1336 + (arg0.field1434 == null ? -1 : arg0.field1434.field3358) + class104.field1336 + arg0.field1428 + class104.field1336 + (Statics.field108 + Statics.field2696.field1258[0]) + class104.field1336 + (Statics.field103 + Statics.field2696.field1259[0]) + class104.field1336;
            for (int var409 = 0; var409 < arg0.field1428 && var409 < 50; var409++) {
                var408 = var408 + var3.field5139[var409] + class104.field1336;
            }
            class556.method3321(var408, var411);
            method3944();
        }
        return true;
    }

    @ObfuscatedName("eq.kl(Llq;I)V")
    public static final void method2742(class310 arg0) {
        class529 var1 = field579.field1426;
        if (class310.field3246 == arg0) {
            int var2 = var1.method8365();
            int var3 = (var2 >> 4 & 0x7) + Statics.field1892;
            int var4 = (var2 & 0x7) + Statics.field3857;
            int var5 = var1.method8400();
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = field597[var6];
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                method271(Statics.field1072, var3, var4, var8, -1, var6, var7, 31, 0, -1);
            }
        } else if (class310.field3244 == arg0) {
            int var9 = var1.method8398() * 4;
            int var10 = var1.method8398();
            byte var11 = var1.method8401();
            int var12 = var1.method8407();
            byte var13 = var1.method8402();
            int var14 = var1.method8399();
            int var15 = (var14 >> 4 & 0x7) + Statics.field1892;
            int var16 = (var14 & 0x7) + Statics.field3857;
            int var17 = var1.method8416();
            int var18 = var1.method8598();
            int var19 = var1.method8417();
            int var20 = var1.method8399();
            int var21 = var1.method8407();
            int var22 = var1.method8400() * 4;
            int var23 = var13 + var15;
            int var24 = var11 + var16;
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && var18 != 65535) {
                int var25 = var15 * 128 + 64;
                int var26 = var16 * 128 + 64;
                int var27 = var23 * 128 + 64;
                int var28 = var24 * 128 + 64;
                class79 var29 = new class79(var18, Statics.field1072, var25, var26, method2725(var25, var26, Statics.field1072) - var22, field533 + var12, field533 + var21, var10, var20, var19, var17, var9);
                var29.method2084(var27, var28, method2725(var27, var28, Statics.field1072) - var9, field533 + var12);
                field660.method6526(var29);
            }
        } else if (class310.field3245 == arg0) {
            int var30 = var1.method8345();
            int var31 = var1.method8400();
            int var32 = (var31 >> 4 & 0x7) + Statics.field1892;
            int var33 = (var31 & 0x7) + Statics.field3857;
            int var34 = var1.method8421();
            int var35 = var1.method8422();
            if (var32 >= 0 && var33 >= 0 && var32 < 104 && var33 < 104) {
                class393 var36 = field688[Statics.field1072][var32][var33];
                if (var36 != null) {
                    for (class107 var37 = (class107) var36.method6532(); var37 != null; var37 = (class107) var36.method6543()) {
                        if ((var30 & 0x7FFF) == var37.field1356 && var37.field1359 == var35) {
                            var37.field1359 = var34;
                            break;
                        }
                    }
                    method432(var32, var33);
                }
            }
        } else if (class310.field3237 == arg0) {
            int var38 = var1.method8365() * 4;
            int var39 = var1.method8407();
            int var40 = var1.method8416();
            int var41 = var1.method8365() * 4;
            int var42 = var1.method8345();
            int var43 = var1.method8416();
            int var44 = var1.method8407();
            int var45 = var1.method8346();
            int var46 = var1.method8400();
            int var47 = (var46 >> 4 & 0x7) + Statics.field1892;
            int var48 = (var46 & 0x7) + Statics.field3857;
            byte var49 = var1.method8401();
            byte var50 = var1.method8366();
            int var51 = var1.method8400();
            int var52 = var47 + var49;
            int var53 = var48 + var50;
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var44 != 65535) {
                int var54 = var47 * 128 + 64;
                int var55 = var48 * 128 + 64;
                int var56 = var52 * 128 + 64;
                int var57 = var53 * 128 + 64;
                class79 var58 = new class79(var44, Statics.field1072, var54, var55, method2725(var54, var55, Statics.field1072) - var41, field533 + var42, field533 + var39, var51, var45, var40, var43, var38);
                var58.method2084(var56, var57, method2725(var56, var57, Statics.field1072) - var38, field533 + var42);
                field660.method6526(var58);
            }
        } else if (class310.field3247 == arg0) {
            int var59 = var1.method8399();
            int var60 = var1.method8407();
            int var61 = var1.method8400();
            int var62 = (var61 >> 4 & 0x7) + Statics.field1892;
            int var63 = (var61 & 0x7) + Statics.field3857;
            int var64 = var1.method8365() * 4;
            int var65 = var1.method8407();
            int var66 = var1.method8370();
            int var67 = var1.method8399() * 4;
            int var68 = var1.method8346();
            byte var69 = var1.method8366();
            int var70 = var1.method8399();
            byte var71 = var1.method8403();
            int var72 = var62 + var69;
            int var73 = var63 + var71;
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104 && var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104 && var60 != 65535) {
                int var74 = var62 * 128 + 64;
                int var75 = var63 * 128 + 64;
                int var76 = var72 * 128 + 64;
                int var77 = var73 * 128 + 64;
                class79 var78 = new class79(var60, Statics.field1072, var74, var75, method2725(var74, var75, Statics.field1072) - var64, field533 + var68, field533 + var65, var59, var70, var66, var67);
                var78.method2084(var76, var77, method2725(var76, var77, Statics.field1072) - var67, field533 + var68);
                field660.method6526(var78);
            }
        } else if (class310.field3240 == arg0) {
            int var79 = var1.method8345();
            int var80 = var1.method8400();
            int var81 = (var80 >> 4 & 0x7) + Statics.field1892;
            int var82 = (var80 & 0x7) + Statics.field3857;
            int var83 = var1.method8398();
            int var84 = var83 >> 2;
            int var85 = var83 & 0x3;
            int var86 = field597[var84];
            if (var81 >= 0 && var82 >= 0 && var81 < 103 && var82 < 103) {
                if (var86 == 0) {
                    class262 var87 = Statics.field53.method4316(Statics.field1072, var81, var82);
                    if (var87 != null) {
                        int var88 = class255.method2100(var87.field2863);
                        if (var84 == 2) {
                            var87.field2860 = new class82(var88, 2, var85 + 4, Statics.field1072, var81, var82, var79, false, var87.field2860);
                            var87.field2861 = new class82(var88, 2, var85 + 1 & 0x3, Statics.field1072, var81, var82, var79, false, var87.field2861);
                        } else {
                            var87.field2860 = new class82(var88, var84, var85, Statics.field1072, var81, var82, var79, false, var87.field2860);
                        }
                        return;
                    }
                }
                if (var86 == 1) {
                    class264 var89 = Statics.field53.method4317(Statics.field1072, var81, var82);
                    if (var89 != null) {
                        int var90 = class255.method2100(var89.field2873);
                        if (var84 == 4 || var84 == 5) {
                            var89.field2877 = new class82(var90, 4, var85, Statics.field1072, var81, var82, var79, false, var89.field2877);
                        } else if (var84 == 6) {
                            var89.field2877 = new class82(var90, 4, var85 + 4, Statics.field1072, var81, var82, var79, false, var89.field2877);
                        } else if (var84 == 7) {
                            var89.field2877 = new class82(var90, 4, (var85 + 2 & 0x3) + 4, Statics.field1072, var81, var82, var79, false, var89.field2877);
                        } else if (var84 == 8) {
                            var89.field2877 = new class82(var90, 4, var85 + 4, Statics.field1072, var81, var82, var79, false, var89.field2877);
                            var89.field2864 = new class82(var90, 4, (var85 + 2 & 0x3) + 4, Statics.field1072, var81, var82, var79, false, var89.field2864);
                        }
                        return;
                    }
                }
                if (var86 == 2) {
                    class265 var91 = Statics.field53.method4460(Statics.field1072, var81, var82);
                    if (var84 == 11) {
                        var84 = 10;
                    }
                    if (var91 != null) {
                        var91.field2882 = new class82(class255.method2100(var91.field2890), var84, var85, Statics.field1072, var81, var82, var79, false, var91.field2882);
                        return;
                    }
                }
                if (var86 == 3) {
                    class237 var92 = Statics.field53.method4466(Statics.field1072, var81, var82);
                    if (var92 != null) {
                        var92.field2495 = new class82(class255.method2100(var92.field2493), 22, var85, Statics.field1072, var81, var82, var79, false, var92.field2495);
                        return;
                    }
                }
                method4793(Statics.field1072, var81, var82, var86, var79);
            }
        } else {
            if (class310.field3236 == arg0) {
                int var93 = var1.method8398();
                int var94 = var1.method8407();
                int var95 = var1.method8400();
                int var96 = var95 >> 4 & 0xF;
                int var97 = var95 & 0x7;
                int var98 = var1.method8398();
                int var99 = (var98 >> 4 & 0x7) + Statics.field1892;
                int var100 = (var98 & 0x7) + Statics.field3857;
                if (var99 >= 0 && var100 >= 0 && var99 < 104 && var100 < 104) {
                    int var101 = var96 + 1;
                    if (Statics.field2696.field1258[0] >= var99 - var101 && Statics.field2696.field1258[0] <= var99 + var101 && Statics.field2696.field1259[0] >= var100 - var101 && Statics.field2696.field1259[0] <= var100 + var101 && Statics.field1106.method2473() != 0 && var97 > 0 && field645 < 50) {
                        field813[field645] = var94;
                        field575[field645] = var97;
                        field601[field645] = var93;
                        field778[field645] = null;
                        field777[field645] = (var99 << 16) + (var100 << 8) + var96;
                        field645++;
                    }
                }
            }
            if (class310.field3235 == arg0) {
                int var102 = var1.method8345();
                int var103 = var1.method8365();
                int var104 = (var103 >> 4 & 0x7) + Statics.field1892;
                int var105 = (var103 & 0x7) + Statics.field3857;
                byte var106 = var1.method8403();
                int var107 = var1.method8407();
                int var108 = var1.method8598();
                int var109 = var1.method8346();
                int var110 = var1.method8399();
                int var111 = var110 >> 2;
                int var112 = var110 & 0x3;
                int var113 = field597[var111];
                byte var114 = var1.method8402();
                byte var115 = var1.method8403();
                byte var116 = var1.method8401();
                class94 var117;
                if (field646 == var107) {
                    var117 = Statics.field2696;
                } else {
                    var117 = field726[var107];
                }
                if (var117 != null) {
                    class220 var118 = Statics.method2243(var108);
                    int var119;
                    int var120;
                    if (var112 == 1 || var112 == 3) {
                        var119 = var118.field2207;
                        var120 = var118.field2206;
                    } else {
                        var119 = var118.field2206;
                        var120 = var118.field2207;
                    }
                    int var121 = (var119 >> 1) + var104;
                    int var122 = (var119 + 1 >> 1) + var104;
                    int var123 = (var120 >> 1) + var105;
                    int var124 = (var120 + 1 >> 1) + var105;
                    int[][] var125 = class84.field1042[Statics.field1072];
                    int var126 = var125[var121][var123] + var125[var122][var123] + var125[var121][var124] + var125[var122][var124] >> 2;
                    int var127 = (var104 << 7) + (var119 << 6);
                    int var128 = (var105 << 7) + (var120 << 6);
                    class254 var129 = var118.method3693(var111, var112, var125, var127, var126, var128);
                    if (var129 != null) {
                        method271(Statics.field1072, var104, var105, var113, -1, 0, 0, 31, var102 + 1, var109 + 1);
                        var117.field1127 = field533 + var102;
                        var117.field1142 = field533 + var109;
                        var117.field1122 = var129;
                        var117.field1129 = var104 * 128 + var119 * 64;
                        var117.field1121 = var105 * 128 + var120 * 64;
                        var117.field1128 = var126;
                        if (var116 > var106) {
                            byte var130 = var116;
                            var116 = var106;
                            var106 = var130;
                        }
                        if (var114 > var115) {
                            byte var131 = var114;
                            var114 = var115;
                            var115 = var131;
                        }
                        var117.field1146 = var104 + var116;
                        var117.field1135 = var104 + var106;
                        var117.field1134 = var105 + var114;
                        var117.field1145 = var105 + var115;
                    }
                }
            }
            if (class310.field3239 == arg0) {
                int var132 = var1.method8398();
                int var133 = var1.method8423();
                int var134 = var1.method8398();
                int var135 = (var134 >> 4 & 0x7) + Statics.field1892;
                int var136 = (var134 & 0x7) + Statics.field3857;
                var1.method8398();
                var1.method8345();
                var1.method8400();
                int var137 = var1.method8598();
                var1.method8598();
                if (var135 >= 0 && var136 >= 0 && var135 < 104 && var136 < 104) {
                    class107 var138 = new class107();
                    var138.field1356 = var137;
                    var138.field1359 = var133;
                    var138.method2597(var132);
                    if (field688[Statics.field1072][var135][var136] == null) {
                        field688[Statics.field1072][var135][var136] = new class393();
                    }
                    field688[Statics.field1072][var135][var136].method6526(var138);
                    method432(var135, var136);
                }
            } else if (class310.field3238 == arg0) {
                int var139 = var1.method8398();
                int var140 = (var139 >> 4 & 0x7) + Statics.field1892;
                int var141 = (var139 & 0x7) + Statics.field3857;
                int var142 = var1.method8598();
                int var143 = var1.method8400();
                if (var140 >= 0 && var141 >= 0 && var140 < 104 && var141 < 104) {
                    class393 var144 = field688[Statics.field1072][var140][var141];
                    if (var144 != null) {
                        for (class107 var145 = (class107) var144.method6532(); var145 != null; var145 = (class107) var144.method6543()) {
                            if ((var142 & 0x7FFF) == var145.field1356) {
                                var145.method2597(var143);
                                break;
                            }
                        }
                    }
                }
            } else if (class310.field3241 == arg0) {
                int var146 = var1.method8421();
                int var147 = var1.method8398();
                int var148 = (var147 >> 4 & 0x7) + Statics.field1892;
                int var149 = (var147 & 0x7) + Statics.field3857;
                int var150 = var1.method8345();
                if (var148 >= 0 && var149 >= 0 && var148 < 104 && var149 < 104) {
                    class393 var151 = field688[Statics.field1072][var148][var149];
                    if (var151 != null) {
                        for (class107 var152 = (class107) var151.method6532(); var152 != null; var152 = (class107) var151.method6543()) {
                            if ((var150 & 0x7FFF) == var152.field1356 && var152.field1359 == var146) {
                                var152.method7776();
                                break;
                            }
                        }
                        if (var151.method6532() == null) {
                            field688[Statics.field1072][var148][var149] = null;
                        }
                        method432(var148, var149);
                    }
                }
            } else if (class310.field3242 == arg0) {
                int var153 = var1.method8598();
                int var154 = var1.method8598();
                int var155 = var1.method8365();
                int var156 = (var155 >> 4 & 0x7) + Statics.field1892;
                int var157 = (var155 & 0x7) + Statics.field3857;
                int var158 = var1.method8399();
                if (var156 >= 0 && var157 >= 0 && var156 < 104 && var157 < 104) {
                    int var159 = var156 * 128 + 64;
                    int var160 = var157 * 128 + 64;
                    class73 var161 = new class73(var154, Statics.field1072, var159, var160, method2725(var159, var160, Statics.field1072) - var158, var153, field533);
                    field661.method6526(var161);
                }
            } else if (class310.field3243 == arg0) {
                int var162 = var1.method8365();
                int var163 = var1.method8398();
                int var164 = var163 >> 2;
                int var165 = var163 & 0x3;
                int var166 = field597[var164];
                int var167 = var1.method8398();
                int var168 = (var167 >> 4 & 0x7) + Statics.field1892;
                int var169 = (var167 & 0x7) + Statics.field3857;
                int var170 = var1.method8346();
                if (var168 >= 0 && var169 >= 0 && var168 < 104 && var169 < 104) {
                    method271(Statics.field1072, var168, var169, var166, var170, var164, var165, var162, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("ae.kj(IIIIIIIIIIB)V")
    public static final void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class97 var10 = null;
        for (class97 var11 = (class97) field659.method6532(); var11 != null; var11 = (class97) field659.method6543()) {
            if (var11.field1175 == arg0 && var11.field1176 == arg1 && var11.field1173 == arg2 && var11.field1172 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class97();
            var10.field1175 = arg0;
            var10.field1172 = arg3;
            var10.field1176 = arg1;
            var10.field1173 = arg2;
            var10.field1181 = -1;
            method1164(var10);
            field659.method6526(var10);
        }
        var10.field1178 = arg4;
        var10.field1174 = arg5;
        var10.field1171 = arg6;
        var10.field1183 = arg8;
        var10.field1184 = arg9;
        var10.method2300(arg7);
    }

    @ObfuscatedName("ko.ko(IIIIII)Z")
    public static final boolean method4793(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class97 var5 = null;
        for (class97 var6 = (class97) field659.method6532(); var6 != null; var6 = (class97) field659.method6543()) {
            if (var6.field1175 == arg0 && var6.field1176 == arg1 && var6.field1173 == arg2 && var6.field1172 == arg3) {
                var5 = var6;
                break;
            }
        }
        if (var5 == null) {
            return false;
        } else {
            var5.field1181 = arg4;
            return true;
        }
    }

    @ObfuscatedName("kt.ka(I)V")
    public static final void method5164() {
        for (class97 var0 = (class97) field659.method6532(); var0 != null; var0 = (class97) field659.method6543()) {
            if (var0.field1184 == -1) {
                var0.field1183 = 0;
                method1164(var0);
            } else {
                var0.method7776();
            }
        }
    }

    @ObfuscatedName("cm.kb(Ldw;I)V")
    public static final void method1164(class97 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1172 == 0) {
            var1 = Statics.field53.method4332(arg0.field1175, arg0.field1176, arg0.field1173);
        }
        if (arg0.field1172 == 1) {
            var1 = Statics.field53.method4321(arg0.field1175, arg0.field1176, arg0.field1173);
        }
        if (arg0.field1172 == 2) {
            var1 = Statics.field53.method4322(arg0.field1175, arg0.field1176, arg0.field1173);
        }
        if (arg0.field1172 == 3) {
            var1 = Statics.field53.method4379(arg0.field1175, arg0.field1176, arg0.field1173);
        }
        if (var1 != 0L) {
            int var6 = Statics.field53.method4336(arg0.field1175, arg0.field1176, arg0.field1173, var1);
            var3 = class255.method2100(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1180 = var3;
        arg0.field1177 = var4;
        arg0.field1179 = var5;
    }

    @ObfuscatedName("et.kn(B)V")
    public static final void method2755() {
        for (class97 var0 = (class97) field659.method6532(); var0 != null; var0 = (class97) field659.method6543()) {
            if (var0.field1184 > 0) {
                var0.field1184--;
            }
            if (var0.field1184 == 0) {
                if (var0.field1180 >= 0) {
                    int var1 = var0.field1180;
                    int var2 = var0.field1177;
                    class220 var3 = Statics.method2243(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3690(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method2719(var0.field1175, var0.field1172, var0.field1176, var0.field1173, var0.field1180, var0.field1179, var0.field1177, var0.field1181);
                var0.method7776();
            } else {
                if (var0.field1183 > 0) {
                    var0.field1183--;
                }
                if (var0.field1183 == 0 && var0.field1176 >= 1 && var0.field1173 >= 1 && var0.field1176 <= 102 && var0.field1173 <= 102) {
                    if (var0.field1178 >= 0) {
                        int var5 = var0.field1178;
                        int var6 = var0.field1174;
                        class220 var7 = Statics.method2243(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3690(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method2719(var0.field1175, var0.field1172, var0.field1176, var0.field1173, var0.field1178, var0.field1171, var0.field1174, var0.field1181);
                    var0.field1183 = -1;
                    if (var0.field1180 == var0.field1178 && var0.field1180 == -1) {
                        var0.method7776();
                    } else if (var0.field1180 == var0.field1178 && var0.field1179 == var0.field1171 && var0.field1177 == var0.field1174) {
                        var0.method7776();
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.kz(IIIIIIIIB)V")
    public static final void method2719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field748 && Statics.field1072 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field53.method4332(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field53.method4321(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field53.method4322(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field53.method4379(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field53.method4336(arg0, arg2, arg3, var8);
            int var14 = class255.method2100(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field53.method4311(arg0, arg2, arg3);
                class220 var17 = Statics.method2243(var14);
                if (var17.field2208 != 0) {
                    field594[arg0].method3977(arg2, arg3, var15, var16, var17.field2234);
                }
            }
            if (arg1 == 1) {
                Statics.field53.method4312(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field53.method4313(arg0, arg2, arg3);
                class220 var18 = Statics.method2243(var14);
                if (var18.field2206 + arg2 > 103 || var18.field2206 + arg3 > 103 || var18.field2207 + arg2 > 103 || var18.field2207 + arg3 > 103) {
                    return;
                }
                if (var18.field2208 != 0) {
                    field594[arg0].method3950(arg2, arg3, var18.field2206, var18.field2207, var16, var18.field2234);
                }
            }
            if (arg1 == 3) {
                Statics.field53.method4314(arg0, arg2, arg3);
                class220 var19 = Statics.method2243(var14);
                if (var19.field2208 == 1) {
                    field594[arg0].method3958(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var20 = arg0;
        if (arg0 < 3 && (class84.field1032[1][arg2][arg3] & 0x2) == 2) {
            var20 = arg0 + 1;
        }
        Statics.method2233(arg0, var20, arg2, arg3, arg4, arg5, arg6, arg7, Statics.field53, field594[arg0]);
    }

    @ObfuscatedName("be.ke(III)V")
    public static final void method432(int arg0, int arg1) {
        class393 var2 = field688[Statics.field1072][arg0][arg1];
        if (var2 == null) {
            Statics.field53.method4438(Statics.field1072, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class107 var5 = null;
        for (class107 var6 = (class107) var2.method6532(); var6 != null; var6 = (class107) var2.method6543()) {
            class221 var7 = class221.method3594(var6.field1356);
            long var8 = (long) var7.field2257;
            if (var7.field2262 == 1) {
                var8 *= var6.field1359 < Integer.MAX_VALUE ? (long) (var6.field1359 + 1) : (long) var6.field1359;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field53.method4438(Statics.field1072, arg0, arg1);
            return;
        }
        var2.method6535(var5);
        class107 var10 = null;
        class107 var11 = null;
        for (class107 var12 = (class107) var2.method6532(); var12 != null; var12 = (class107) var2.method6543()) {
            if (var5.field1356 != var12.field1356) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1356 != var12.field1356 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class255.method6416(arg0, arg1, 3, false, 0);
        Statics.field53.method4301(Statics.field1072, arg0, arg1, method2725(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1072), var5, var13, var10, var11);
    }

    @ObfuscatedName("my.kk(ZLuy;I)V")
    public static final void method5612(boolean arg0, class529 arg1) {
        field651 = 0;
        field582 = 0;
        arg1.method8312();
        int var2 = arg1.method8327(8);
        if (var2 < field668) {
            for (int var3 = var2; var3 < field668; var3++) {
                field652[++field651 - 1] = field581[var3];
            }
        }
        if (var2 > field668) {
            throw new RuntimeException("");
        }
        field668 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = field581[var4];
            class103 var6 = field705[var5];
            int var7 = arg1.method8327(1);
            if (var7 == 0) {
                field581[++field668 - 1] = var5;
                var6.field1246 = field533;
            } else {
                int var8 = arg1.method8327(2);
                if (var8 == 0) {
                    field581[++field668 - 1] = var5;
                    var6.field1246 = field533;
                    field534[++field582 - 1] = var5;
                } else if (var8 == 1) {
                    field581[++field668 - 1] = var5;
                    var6.field1246 = field533;
                    int var9 = arg1.method8327(3);
                    var6.method2509(var9, class232.field2429);
                    int var10 = arg1.method8327(1);
                    if (var10 == 1) {
                        field534[++field582 - 1] = var5;
                    }
                } else if (var8 == 2) {
                    field581[++field668 - 1] = var5;
                    var6.field1246 = field533;
                    if (arg1.method8327(1) == 1) {
                        int var11 = arg1.method8327(3);
                        var6.method2509(var11, class232.field2428);
                        int var12 = arg1.method8327(3);
                        var6.method2509(var12, class232.field2428);
                    } else {
                        int var13 = arg1.method8327(3);
                        var6.method2509(var13, class232.field2427);
                    }
                    int var14 = arg1.method8327(1);
                    if (var14 == 1) {
                        field534[++field582 - 1] = var5;
                    }
                } else if (var8 == 3) {
                    field652[++field651 - 1] = var5;
                }
            }
        }
        method160(arg0, arg1);
        for (int var15 = 0; var15 < field582; var15++) {
            int var16 = field534[var15];
            class103 var17 = field705[var16];
            int var18 = arg1.method8365();
            if ((var18 & 0x40) != 0) {
                int var19 = arg1.method8365();
                var18 += var19 << 8;
            }
            if ((var18 & 0x800) != 0) {
                int var20 = arg1.method8365();
                var18 += var20 << 16;
            }
            if ((var18 & 0x80) != 0) {
                int var21 = arg1.method8346();
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var22 = arg1.method8365();
                if (var17.field1232 == var21 && var21 != -1) {
                    int var23 = class223.method687(var21).field2341;
                    if (var23 == 1) {
                        var17.field1192 = 0;
                        var17.field1254 = 0;
                        var17.field1235 = var22;
                        var17.field1236 = 0;
                    }
                    if (var23 == 2) {
                        var17.field1236 = 0;
                    }
                } else if (var21 == -1 || var17.field1232 == -1 || class223.method687(var21).field2334 >= class223.method687(var17.field1232).field2334) {
                    var17.field1232 = var21;
                    var17.field1192 = 0;
                    var17.field1254 = 0;
                    var17.field1235 = var22;
                    var17.field1236 = 0;
                    var17.field1262 = var17.field1219;
                }
            }
            if ((var18 & 0x2) != 0) {
                var17.field1328 = class206.method3320(arg1.method8407());
                method5169(var17);
                var17.method2514();
            }
            if ((var18 & 0x8000) != 0) {
                var17.field1239 = arg1.method8401();
                var17.field1186 = arg1.method8366();
                var17.field1240 = arg1.method8366();
                var17.field1205 = arg1.method8403();
                var17.field1243 = arg1.method8407() + field533;
                var17.field1244 = arg1.method8598() + field533;
                var17.field1255 = arg1.method8346();
                var17.field1219 = 1;
                var17.field1262 = 0;
                var17.field1239 += var17.field1258[0];
                var17.field1186 += var17.field1259[0];
                var17.field1240 += var17.field1258[0];
                var17.field1205 += var17.field1259[0];
            }
            if ((var18 & 0x8) != 0) {
                arg1.method8598();
                arg1.method8371();
            }
            if ((var18 & 0x4000) != 0) {
                int var24 = arg1.method8365();
                if ((var24 & 0x1) == 1) {
                    var17.method2518();
                } else {
                    int[] var25 = null;
                    if ((var24 & 0x2) == 2) {
                        int var26 = arg1.method8398();
                        var25 = new int[var26];
                        for (int var27 = 0; var27 < var26; var27++) {
                            int var28 = arg1.method8346();
                            int var29 = var28 == 65535 ? -1 : var28;
                            var25[var27] = var29;
                        }
                    }
                    short[] var30 = null;
                    if ((var24 & 0x4) == 4) {
                        int var31 = 0;
                        if (var17.field1328.field2069 != null) {
                            var31 = var17.field1328.field2069.length;
                        }
                        var30 = new short[var31];
                        for (int var32 = 0; var32 < var31; var32++) {
                            var30[var32] = (short) arg1.method8346();
                        }
                    }
                    short[] var33 = null;
                    if ((var24 & 0x8) == 8) {
                        int var34 = 0;
                        if (var17.field1328.field2078 != null) {
                            var34 = var17.field1328.field2078.length;
                        }
                        var33 = new short[var34];
                        for (int var35 = 0; var35 < var34; var35++) {
                            var33[var35] = (short) arg1.method8598();
                        }
                    }
                    boolean var36 = false;
                    if ((var24 & 0x10) != 0) {
                        var36 = arg1.method8399() == 1;
                    }
                    long var37 = (long) (++class103.field1327 - 1);
                    var17.method2515(new class205(var37, var25, var30, var33, var36));
                }
            }
            if ((var18 & 0x200) != 0) {
                var17.method2505(arg1.method8588());
            }
            if ((var18 & 0x1000) != 0) {
                int var39 = arg1.method8398();
                if ((var39 & 0x1) == 1) {
                    var17.method2519();
                } else {
                    int[] var40 = null;
                    if ((var39 & 0x2) == 2) {
                        int var41 = arg1.method8365();
                        var40 = new int[var41];
                        for (int var42 = 0; var42 < var41; var42++) {
                            int var43 = arg1.method8407();
                            int var44 = var43 == 65535 ? -1 : var43;
                            var40[var42] = var44;
                        }
                    }
                    short[] var45 = null;
                    if ((var39 & 0x4) == 4) {
                        int var46 = 0;
                        if (var17.field1328.field2069 != null) {
                            var46 = var17.field1328.field2069.length;
                        }
                        var45 = new short[var46];
                        for (int var47 = 0; var47 < var46; var47++) {
                            var45[var47] = (short) arg1.method8407();
                        }
                    }
                    short[] var48 = null;
                    if ((var39 & 0x8) == 8) {
                        int var49 = 0;
                        if (var17.field1328.field2078 != null) {
                            var49 = var17.field1328.field2078.length;
                        }
                        var48 = new short[var49];
                        for (int var50 = 0; var50 < var49; var50++) {
                            var48[var50] = (short) arg1.method8346();
                        }
                    }
                    boolean var51 = false;
                    if ((var39 & 0x10) != 0) {
                        var51 = arg1.method8365() == 1;
                    }
                    long var52 = (long) (++class103.field1325 - 1);
                    var17.method2517(new class205(var52, var40, var45, var48, var51));
                }
            }
            if ((var18 & 0x40000) != 0) {
                int var54 = arg1.method8371();
                var17.field1193 = (var54 & 0x1) == 0 ? var17.field1328.field2048 : arg1.method8345();
                var17.field1194 = (var54 & 0x2) == 0 ? var17.field1328.field2055 : arg1.method8345();
                var17.field1189 = (var54 & 0x4) == 0 ? var17.field1328.field2044 : arg1.method8346();
                var17.field1196 = (var54 & 0x8) == 0 ? var17.field1328.field2057 : arg1.method8345();
                var17.field1199 = (var54 & 0x10) == 0 ? var17.field1328.field2058 : arg1.method8598();
                var17.field1198 = (var54 & 0x20) == 0 ? var17.field1328.field2071 : arg1.method8407();
                var17.field1260 = (var54 & 0x40) == 0 ? var17.field1328.field2060 : arg1.method8345();
                var17.field1218 = (var54 & 0x80) == 0 ? var17.field1328.field2061 : arg1.method8346();
                var17.field1203 = (var54 & 0x100) == 0 ? var17.field1328.field2062 : arg1.method8407();
                var17.field1202 = (var54 & 0x200) == 0 ? var17.field1328.field2089 : arg1.method8598();
                var17.field1197 = (var54 & 0x400) == 0 ? var17.field1328.field2064 : arg1.method8598();
                var17.field1204 = (var54 & 0x800) == 0 ? var17.field1328.field2065 : arg1.method8598();
                var17.field1220 = (var54 & 0x1000) == 0 ? var17.field1328.field2066 : arg1.method8407();
                var17.field1206 = (var54 & 0x2000) == 0 ? var17.field1328.field2075 : arg1.method8346();
                var17.field1242 = (var54 & 0x4000) == 0 ? var17.field1328.field2053 : arg1.method8345();
            }
            if ((var18 & 0x20000) != 0) {
                int var55 = arg1.method8398();
                for (int var56 = 0; var56 < var55; var56++) {
                    int var57 = arg1.method8400();
                    int var58 = arg1.method8345();
                    int var59 = arg1.method8423();
                    var17.method2312(var57, var58, var59 >> 16, var59 & 0xFFFF);
                }
            }
            if ((var18 & 0x2000) != 0) {
                var17.method2506(arg1.method8400());
            }
            if ((var18 & 0x20) != 0) {
                var17.field1215 = arg1.method8588();
                var17.field1210 = 100;
            }
            if ((var18 & 0x10) != 0) {
                int var60 = arg1.method8598();
                int var61 = arg1.method8407();
                var17.field1241 = arg1.method8398() == 1;
                if (field528 >= 212) {
                    var17.field1225 = var60;
                    var17.field1226 = var61;
                } else {
                    int var62 = var17.field1227 - (var60 - Statics.field108 - Statics.field108) * 64;
                    int var63 = var17.field1187 - (var61 - Statics.field103 - Statics.field103) * 64;
                    if (var62 != 0 || var63 != 0) {
                        int var65 = (int) (Math.atan2((double) var62, (double) var63) * 325.94932345220167D) & 0x7FF;
                        var17.field1224 = var65;
                    }
                }
            }
            if ((var18 & 0x100) != 0) {
                var17.field1263 = arg1.method8421();
            }
            if ((var18 & 0x4) != 0) {
                var17.field1222 = arg1.method8407();
                var17.field1222 += arg1.method8365() << 16;
                int var66 = 16777215;
                if (var17.field1222 == var66) {
                    var17.field1222 = -1;
                }
            }
            if ((var18 & 0x1) != 0) {
                int var67 = arg1.method8365();
                if (var67 > 0) {
                    for (int var68 = 0; var68 < var67; var68++) {
                        int var69 = -1;
                        int var70 = -1;
                        int var71 = -1;
                        int var72 = arg1.method8526();
                        if (var72 == 32767) {
                            var72 = arg1.method8526();
                            var70 = arg1.method8526();
                            var69 = arg1.method8526();
                            var71 = arg1.method8526();
                        } else if (var72 == 32766) {
                            var72 = -1;
                        } else {
                            var70 = arg1.method8526();
                        }
                        int var73 = arg1.method8526();
                        var17.method2333(var72, var70, var69, var71, field533, var73);
                    }
                }
                int var74 = arg1.method8398();
                if (var74 > 0) {
                    for (int var75 = 0; var75 < var74; var75++) {
                        int var76 = arg1.method8526();
                        int var77 = arg1.method8526();
                        if (var77 == 32767) {
                            var17.method2314(var76);
                        } else {
                            int var78 = arg1.method8526();
                            int var79 = arg1.method8365();
                            int var80 = var77 > 0 ? arg1.method8399() : var79;
                            var17.method2310(var76, field533, var77, var78, var79, var80);
                        }
                    }
                }
            }
            if ((var18 & 0x400) != 0) {
                var17.field1248 = field533 + arg1.method8598();
                var17.field1249 = field533 + arg1.method8345();
                var17.field1250 = arg1.method8403();
                var17.field1251 = arg1.method8366();
                var17.field1252 = arg1.method8402();
                var17.field1253 = (byte) arg1.method8365();
            }
            if ((var18 & 0x10000) != 0) {
                int var81 = arg1.method8399();
                int[] var82 = new int[8];
                short[] var83 = new short[8];
                for (int var84 = 0; var84 < 8; var84++) {
                    if ((var81 & 0x1 << var84) == 0) {
                        var82[var84] = -1;
                        var83[var84] = -1;
                    } else {
                        var82[var84] = arg1.method8385();
                        var83[var84] = (short) arg1.method8382();
                    }
                }
                var17.method2532(var82, var83);
            }
        }
        for (int var85 = 0; var85 < field651; var85++) {
            int var86 = field652[var85];
            if (field533 != field705[var86].field1246) {
                field705[var86].field1328 = null;
                field705[var86] = null;
            }
        }
        if (field579.field1428 != arg1.field5140) {
            throw new RuntimeException(arg1.field5140 + class104.field1336 + field579.field1428);
        }
        for (int var87 = 0; var87 < field668; var87++) {
            if (field705[field581[var87]] == null) {
                throw new RuntimeException(var87 + class104.field1336 + field668);
            }
        }
    }

    @ObfuscatedName("ay.kh(ZLuy;B)V")
    public static final void method160(boolean arg0, class529 arg1) {
        while (true) {
            byte var2 = 16;
            int var3 = 0x1 << var2;
            if (arg1.method8315(field579.field1428) >= var2 + 12) {
                int var4 = arg1.method8327(var2);
                if (var3 - 1 != var4) {
                    boolean var5 = false;
                    if (field705[var4] == null) {
                        field705[var4] = new class103();
                        var5 = true;
                    }
                    class103 var6 = field705[var4];
                    field581[++field668 - 1] = var4;
                    var6.field1246 = field533;
                    int var7 = arg1.method8327(1);
                    if (var7 == 1) {
                        field534[++field582 - 1] = var4;
                    }
                    int var8 = arg1.method8327(1);
                    var6.field1328 = class206.method3320(arg1.method8327(14));
                    int var9 = field656[arg1.method8327(3)];
                    if (var5) {
                        var6.field1209 = var6.field1188 = var9;
                    }
                    int var10;
                    if (arg0) {
                        var10 = arg1.method8327(8);
                        if (var10 > 127) {
                            var10 -= 256;
                        }
                    } else {
                        var10 = arg1.method8327(5);
                        if (var10 > 15) {
                            var10 -= 32;
                        }
                    }
                    int var11;
                    if (arg0) {
                        var11 = arg1.method8327(8);
                        if (var11 > 127) {
                            var11 -= 256;
                        }
                    } else {
                        var11 = arg1.method8327(5);
                        if (var11 > 15) {
                            var11 -= 32;
                        }
                    }
                    boolean var12 = arg1.method8327(1) == 1;
                    if (var12) {
                        arg1.method8327(32);
                    }
                    method5169(var6);
                    if (var6.field1217 == 0) {
                        var6.field1188 = 0;
                    }
                    var6.method2560(Statics.field2696.field1258[0] + var10, Statics.field2696.field1259[0] + var11, var8 == 1);
                    continue;
                }
            }
            arg1.method8338();
            return;
        }
    }

    @ObfuscatedName("kd.ks(Ldc;I)V")
    public static void method5169(class103 arg0) {
        arg0.field1190 = arg0.field1328.field2050;
        arg0.field1217 = arg0.field1328.field2080;
        arg0.field1189 = arg0.field1328.field2044;
        arg0.field1196 = arg0.field1328.field2057;
        arg0.field1199 = arg0.field1328.field2058;
        arg0.field1198 = arg0.field1328.field2071;
        arg0.field1242 = arg0.field1328.field2053;
        arg0.field1193 = arg0.field1328.field2048;
        arg0.field1194 = arg0.field1328.field2055;
        arg0.field1260 = arg0.field1328.field2060;
        arg0.field1218 = arg0.field1328.field2061;
        arg0.field1203 = arg0.field1328.field2062;
        arg0.field1202 = arg0.field1328.field2089;
        arg0.field1197 = arg0.field1328.field2064;
        arg0.field1204 = arg0.field1328.field2065;
        arg0.field1220 = arg0.field1328.field2066;
        arg0.field1206 = arg0.field1328.field2075;
    }

    @ObfuscatedName("gu.kp(Ldj;IILip;I)V")
    public static final void method3275(class94 arg0, int arg1, int arg2, class232 arg3) {
        int var4 = arg0.field1258[0];
        int var5 = arg0.field1259[0];
        int var6 = arg0.method2261();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        class233 var7 = field817;
        int var10 = arg0.method2261();
        field644.field2417 = arg1;
        field644.field2416 = arg2;
        field644.field2414 = 1;
        field644.field2415 = 1;
        class67 var11 = field644;
        int var12 = var7.method4026(var4, var5, var10, var11, field594[arg0.field1140], true, field822, field638);
        if (var12 >= 1) {
            for (int var13 = 0; var13 < var12 - 1; var13++) {
                arg0.method2264(field822[var13], field638[var13], arg3);
            }
        }
    }

    @ObfuscatedName("do.kf(B)V")
    public static void method2242() {
        field667 = 0;
        field666 = false;
    }

    @ObfuscatedName("np.kw(S)V")
    public static void method6186() {
        method2242();
        field673[0] = class367.field4191;
        field674[0] = "";
        field670[0] = 1006;
        field675[0] = false;
        field667 = 1;
    }

    @ObfuscatedName("fe.ky(IIB)V")
    public static final void method2919(int arg0, int arg1) {
        if (field667 < 2 && field580 == 0 && !field685 || !field716) {
            return;
        }
        int var2 = method2593();
        String var3;
        if (field580 == 1 && field667 < 2) {
            var3 = class367.field4112 + class367.field4113 + field773 + " " + class104.field1334;
        } else if (field685 && field667 < 2) {
            var3 = field752 + class367.field4113 + field689 + " " + class104.field1334;
        } else {
            var3 = method3138(var2);
        }
        if (field667 > 2) {
            var3 = var3 + class104.method1732(16777215) + " " + '/' + " " + (field667 - 2) + class367.field4242;
        }
        Statics.field330.method6966(var3, arg0 + 4, arg1 + 15, 16777215, 0, field533 / 1000);
    }

    @ObfuscatedName("hg.kv(I)Z")
    public static final boolean method3373() {
        return field666;
    }

    @ObfuscatedName("ae.kx(IIIII)V")
    public static final void method275(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field562; var4++) {
            if (field743[var4] + field521[var4] > arg0 && field743[var4] < arg0 + arg2 && field774[var4] + field744[var4] > arg1 && field744[var4] < arg1 + arg3) {
                field740[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.kt(B)V")
    public final void method1557() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field667 - 1; var2++) {
                if (field670[var2] < 1000 && field670[var2 + 1] > 1000) {
                    String var3 = field674[var2];
                    field674[var2] = field674[var2 + 1];
                    field674[var2 + 1] = var3;
                    String var4 = field673[var2];
                    field673[var2] = field673[var2 + 1];
                    field673[var2 + 1] = var4;
                    int var5 = field670[var2];
                    field670[var2] = field670[var2 + 1];
                    field670[var2 + 1] = var5;
                    int var6 = field759[var2];
                    field759[var2] = field759[var2 + 1];
                    field759[var2 + 1] = var6;
                    int var7 = field669[var2];
                    field669[var2] = field669[var2 + 1];
                    field669[var2 + 1] = var7;
                    int var8 = field671[var2];
                    field671[var2] = field671[var2 + 1];
                    field671[var2 + 1] = var8;
                    int var9 = field672[var2];
                    field672[var2] = field672[var2 + 1];
                    field672[var2 + 1] = var9;
                    boolean var10 = field675[var2];
                    field675[var2] = field675[var2 + 1];
                    field675[var2 + 1] = var10;
                    var1 = false;
                }
            }
        }
        if (field702 != null) {
            return;
        }
        int var11 = class36.field242;
        if (!field666) {
            int var22 = method2593();
            if ((var11 == 1 || !Statics.field1462 && var11 == 4) && this.method1297()) {
                var11 = 2;
            }
            if ((var11 == 1 || !Statics.field1462 && var11 == 4) && field667 > 0) {
                method7065(var22);
            }
            if (var11 == 2 && field667 > 0) {
                this.method1192(class36.field244, class36.field248);
            }
            return;
        }
        if (var11 != 1 && (Statics.field1462 || var11 != 4)) {
            int var12 = class36.field235;
            int var13 = class36.field241;
            if (var12 < Statics.field163 - 10 || var12 > Statics.field3603 + Statics.field163 + 10 || var13 < Statics.field4772 - 10 || var13 > Statics.field4772 + Statics.field4426 + 10) {
                field666 = false;
                method275(Statics.field163, Statics.field4772, Statics.field3603, Statics.field4426);
            }
        }
        if (var11 != 1 && Statics.field1462 || var11 != 4) {
            return;
        }
        int var14 = Statics.field163;
        int var15 = Statics.field4772;
        int var16 = Statics.field3603;
        int var17 = class36.field244;
        int var18 = class36.field248;
        int var19 = -1;
        for (int var20 = 0; var20 < field667; var20++) {
            int var21 = (field667 - 1 - var20) * 15 + var15 + 31;
            if (var17 > var14 && var17 < var14 + var16 && var18 > var21 - 13 && var18 < var21 + 3) {
                var19 = var20;
            }
        }
        if (var19 != -1) {
            method7065(var19);
        }
        field666 = false;
        method275(Statics.field163, Statics.field4772, Statics.field3603, Statics.field4426);
    }

    @ObfuscatedName("client.kc(S)Z")
    public final boolean method1297() {
        int var1 = method2593();
        return (field746 && field667 > 2 || method4779(var1)) && !field675[var1];
    }

    @ObfuscatedName("client.kd(IIS)V")
    public final void method1192(int arg0, int arg1) {
        method7762(arg0, arg1);
        int var3 = arg0 - field800;
        int var4 = arg1 - field801;
        Statics.field53.method4333(Statics.field1072, var3, var4, false);
        field666 = true;
    }

    @ObfuscatedName("sa.ku(III)V")
    public static void method7762(int arg0, int arg1) {
        int var2 = Statics.field330.method6948(class367.field4115);
        for (int var3 = 0; var3 < field667; var3++) {
            int var4 = Statics.field330.method6948(method3138(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field667 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field3598) {
            var6 = Statics.field3598 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field4908) {
            var7 = Statics.field4908 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field163 = var6;
        Statics.field4772 = var7;
        Statics.field3603 = var2;
        Statics.field4426 = field667 * 15 + 22;
    }

    @ObfuscatedName("kq.ki(IB)Z")
    public static final boolean method4779(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field670[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("pi.la(II)V")
    public static final void method7065(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field759[arg0];
        int var2 = field669[arg0];
        int var3 = field670[arg0];
        int var4 = field671[arg0];
        int var5 = field672[arg0];
        String var6 = field673[arg0];
        String var7 = field674[arg0];
        method468(var1, var2, var3, var4, var5, var6, var7, class36.field244, class36.field248);
    }

    @ObfuscatedName("ap.ly(Lcf;III)V")
    public static final void method153(class76 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method468(arg0.field918, arg0.field919, arg0.field916, arg0.field917, arg0.field921, arg0.field914, arg0.field915, arg1, arg2);
        }
    }

    @ObfuscatedName("bz.ll(IIIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method468(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 16) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var9 = class311.method2978(class309.field3226, field579.field1425);
            var9.field3250.method8406(Statics.field1264);
            var9.field3250.method8506(arg3);
            var9.field3250.method8585(Statics.field11);
            var9.field3250.method8406(Statics.field108 + arg0);
            var9.field3250.method8349(Statics.field1521);
            var9.field3250.method8397(field756.method3924(82) ? 1 : 0);
            var9.field3250.method8506(Statics.field103 + arg1);
            field579.method2682(var9);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field4641.method7905(arg2, arg3, new class337(arg0), new class337(arg1));
        }
        if (arg2 == 28) {
            class311 var10 = class311.method2978(class309.field3168, field579.field1425);
            var10.field3250.method8351(arg1);
            field579.method2682(var10);
            class347 var11 = Statics.field185.method5639(arg1);
            if (var11 != null && var11.field3730 != null && var11.field3730[0][0] == 5) {
                int var12 = var11.field3730[0][1];
                class336.field3568[var12] = 1 - class336.field3568[var12];
                method2224(var12);
            }
        }
        if (arg2 == 4) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var13 = class311.method2978(class309.field3205, field579.field1425);
            var13.field3250.method8406(arg3);
            var13.field3250.method8396(field756.method3924(82) ? 1 : 0);
            var13.field3250.method8406(Statics.field108 + arg0);
            var13.field3250.method8506(Statics.field103 + arg1);
            field579.method2682(var13);
        }
        if (arg2 == 1) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var14 = class311.method2978(class309.field3154, field579.field1425);
            var14.field3250.method8420(Statics.field11);
            var14.field3250.method8506(Statics.field108 + arg0);
            var14.field3250.method8349(Statics.field1264);
            var14.field3250.method8406(Statics.field1521);
            var14.field3250.method8349(arg3);
            var14.field3250.method8396(field756.method3924(82) ? 1 : 0);
            var14.field3250.method8405(Statics.field103 + arg1);
            field579.method2682(var14);
        }
        if (arg2 == 20) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var15 = class311.method2978(class309.field3223, field579.field1425);
            var15.field3250.method8506(Statics.field103 + arg1);
            var15.field3250.method8405(arg3);
            var15.field3250.method8405(Statics.field108 + arg0);
            var15.field3250.method8485(field756.method3924(82) ? 1 : 0);
            field579.method2682(var15);
        }
        if (arg2 == 7) {
            class103 var16 = field705[arg3];
            if (var16 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var17 = class311.method2978(class309.field3161, field579.field1425);
                var17.field3250.method8406(Statics.field1264);
                var17.field3250.method8397(field756.method3924(82) ? 1 : 0);
                var17.field3250.method8351(Statics.field11);
                var17.field3250.method8506(arg3);
                var17.field3250.method8405(Statics.field1521);
                field579.method2682(var17);
            }
        }
        if (arg2 == 6) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var18 = class311.method2978(class309.field3213, field579.field1425);
            var18.field3250.method8506(Statics.field103 + arg1);
            var18.field3250.method8405(arg3);
            var18.field3250.method8405(Statics.field108 + arg0);
            var18.field3250.method8397(field756.method3924(82) ? 1 : 0);
            field579.method2682(var18);
        }
        if (arg2 == 14) {
            class94 var19 = field726[arg3];
            if (var19 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var20 = class311.method2978(class309.field3146, field579.field1425);
                var20.field3250.method8585(Statics.field11);
                var20.field3250.method8406(Statics.field1264);
                var20.field3250.method8348(field756.method3924(82) ? 1 : 0);
                var20.field3250.method8406(arg3);
                var20.field3250.method8405(Statics.field1521);
                field579.method2682(var20);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class347 var21 = Statics.field185.method5640(arg1, arg0);
            if (var21 != null) {
                method4518(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 48) {
            class94 var22 = field726[arg3];
            if (var22 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var23 = class311.method2978(class309.field3219, field579.field1425);
                var23.field3250.method8396(field756.method3924(82) ? 1 : 0);
                var23.field3250.method8506(arg3);
                field579.method2682(var23);
            }
        }
        if (arg2 == 50) {
            class94 var24 = field726[arg3];
            if (var24 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var25 = class311.method2978(class309.field3211, field579.field1425);
                var25.field3250.method8348(field756.method3924(82) ? 1 : 0);
                var25.field3250.method8349(arg3);
                field579.method2682(var25);
            }
        }
        if (arg2 == 23) {
            if (field666) {
                Statics.field53.method4334();
            } else {
                Statics.field53.method4333(Statics.field1072, arg0, arg1, true);
            }
        }
        if (arg2 == 13) {
            class103 var26 = field705[arg3];
            if (var26 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var27 = class311.method2978(class309.field3196, field579.field1425);
                var27.field3250.method8348(field756.method3924(82) ? 1 : 0);
                var27.field3250.method8506(arg3);
                field579.method2682(var27);
            }
        }
        if (arg2 == 1003) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            class103 var28 = field705[arg3];
            if (var28 != null) {
                class206 var29 = var28.field1328;
                if (var29.field2043 != null) {
                    var29 = var29.method3500();
                }
                if (var29 != null) {
                    class311 var30 = class311.method2978(class309.field3201, field579.field1425);
                    var30.field3250.method8405(var29.field2084);
                    field579.method2682(var30);
                }
            }
        }
        if (arg2 == 21) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var31 = class311.method2978(class309.field3167, field579.field1425);
            var31.field3250.method8406(arg3);
            var31.field3250.method8349(Statics.field108 + arg0);
            var31.field3250.method8349(Statics.field103 + arg1);
            var31.field3250.method8397(field756.method3924(82) ? 1 : 0);
            field579.method2682(var31);
        }
        if (arg2 == 44) {
            class94 var32 = field726[arg3];
            if (var32 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var33 = class311.method2978(class309.field3143, field579.field1425);
                var33.field3250.method8485(field756.method3924(82) ? 1 : 0);
                var33.field3250.method8405(arg3);
                field579.method2682(var33);
            }
        }
        if (arg2 == 11) {
            class103 var34 = field705[arg3];
            if (var34 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var35 = class311.method2978(class309.field3178, field579.field1425);
                var35.field3250.method8485(field756.method3924(82) ? 1 : 0);
                var35.field3250.method8405(arg3);
                field579.method2682(var35);
            }
        }
        if (arg2 == 5) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var36 = class311.method2978(class309.field3207, field579.field1425);
            var36.field3250.method8405(Statics.field103 + arg1);
            var36.field3250.method8349(arg3);
            var36.field3250.method8506(Statics.field108 + arg0);
            var36.field3250.method8396(field756.method3924(82) ? 1 : 0);
            field579.method2682(var36);
        }
        if (arg2 == 15) {
            class94 var37 = field726[arg3];
            if (var37 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var38 = class311.method2978(class309.field3174, field579.field1425);
                var38.field3250.method8349(field687);
                var38.field3250.method8406(field586);
                var38.field3250.method8418(Statics.field1842);
                var38.field3250.method8506(arg3);
                var38.field3250.method8485(field756.method3924(82) ? 1 : 0);
                field579.method2682(var38);
            }
        }
        if (arg2 == 51) {
            class94 var39 = field726[arg3];
            if (var39 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var40 = class311.method2978(class309.field3172, field579.field1425);
                var40.field3250.method8348(field756.method3924(82) ? 1 : 0);
                var40.field3250.method8506(arg3);
                field579.method2682(var40);
            }
        }
        if (arg2 == 22) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var41 = class311.method2978(class309.field3148, field579.field1425);
            var41.field3250.method8397(field756.method3924(82) ? 1 : 0);
            var41.field3250.method8349(Statics.field103 + arg1);
            var41.field3250.method8506(Statics.field108 + arg0);
            var41.field3250.method8405(arg3);
            field579.method2682(var41);
        }
        if (arg2 == 24) {
            class347 var42 = Statics.field185.method5639(arg1);
            if (var42 != null) {
                boolean var43 = true;
                if (var42.field3681 > 0) {
                    var43 = method3456(var42);
                }
                if (var43) {
                    class311 var44 = class311.method2978(class309.field3168, field579.field1425);
                    var44.field3250.method8351(arg1);
                    field579.method2682(var44);
                }
            }
        }
        if (arg2 == 2) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var45 = class311.method2978(class309.field3224, field579.field1425);
            var45.field3250.method8396(field756.method3924(82) ? 1 : 0);
            var45.field3250.method8405(field586);
            var45.field3250.method8349(Statics.field108 + arg0);
            var45.field3250.method8420(Statics.field1842);
            var45.field3250.method8506(arg3);
            var45.field3250.method8506(Statics.field103 + arg1);
            var45.field3250.method8406(field687);
            field579.method2682(var45);
        }
        if (arg2 == 30 && field624 == null) {
            method3231(arg1, arg0);
            field624 = Statics.field185.method5640(arg1, arg0);
            method2979(field624);
        }
        if (arg2 == 12) {
            class103 var46 = field705[arg3];
            if (var46 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var47 = class311.method2978(class309.field3203, field579.field1425);
                var47.field3250.method8396(field756.method3924(82) ? 1 : 0);
                var47.field3250.method8349(arg3);
                field579.method2682(var47);
            }
        }
        if (arg2 == 9) {
            class103 var48 = field705[arg3];
            if (var48 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var49 = class311.method2978(class309.field3204, field579.field1425);
                var49.field3250.method8406(arg3);
                var49.field3250.method8348(field756.method3924(82) ? 1 : 0);
                field579.method2682(var49);
            }
        }
        if (arg2 == 49) {
            class94 var50 = field726[arg3];
            if (var50 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var51 = class311.method2978(class309.field3183, field579.field1425);
                var51.field3250.method8396(field756.method3924(82) ? 1 : 0);
                var51.field3250.method8506(arg3);
                field579.method2682(var51);
            }
        }
        if (arg2 == 19) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var52 = class311.method2978(class309.field3185, field579.field1425);
            var52.field3250.method8405(Statics.field108 + arg0);
            var52.field3250.method8349(Statics.field103 + arg1);
            var52.field3250.method8397(field756.method3924(82) ? 1 : 0);
            var52.field3250.method8406(arg3);
            field579.method2682(var52);
        }
        if (arg2 == 1002) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            class311 var53 = class311.method2978(class309.field3165, field579.field1425);
            var53.field3250.method8406(arg3);
            field579.method2682(var53);
        }
        if (arg2 == 17) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var54 = class311.method2978(class309.field3229, field579.field1425);
            var54.field3250.method8406(arg3);
            var54.field3250.method8485(field756.method3924(82) ? 1 : 0);
            var54.field3250.method8351(Statics.field1842);
            var54.field3250.method8349(field687);
            var54.field3250.method8405(Statics.field103 + arg1);
            var54.field3250.method8405(Statics.field108 + arg0);
            var54.field3250.method8506(field586);
            field579.method2682(var54);
        }
        if (arg2 == 46) {
            class94 var55 = field726[arg3];
            if (var55 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var56 = class311.method2978(class309.field3160, field579.field1425);
                var56.field3250.method8406(arg3);
                var56.field3250.method8348(field756.method3924(82) ? 1 : 0);
                field579.method2682(var56);
            }
        }
        if (arg2 == 3) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var57 = class311.method2978(class309.field3152, field579.field1425);
            var57.field3250.method8406(Statics.field108 + arg0);
            var57.field3250.method8405(Statics.field103 + arg1);
            var57.field3250.method8405(arg3);
            var57.field3250.method8348(field756.method3924(82) ? 1 : 0);
            field579.method2682(var57);
        }
        if (arg2 == 45) {
            class94 var58 = field726[arg3];
            if (var58 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var59 = class311.method2978(class309.field3187, field579.field1425);
                var59.field3250.method8397(field756.method3924(82) ? 1 : 0);
                var59.field3250.method8349(arg3);
                field579.method2682(var59);
            }
        }
        if (arg2 == 10) {
            class103 var60 = field705[arg3];
            if (var60 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var61 = class311.method2978(class309.field3145, field579.field1425);
                var61.field3250.method8485(field756.method3924(82) ? 1 : 0);
                var61.field3250.method8406(arg3);
                field579.method2682(var61);
            }
        }
        if (arg2 == 1004) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            class311 var62 = class311.method2978(class309.field3164, field579.field1425);
            var62.field3250.method8349(Statics.field103 + arg1);
            var62.field3250.method8349(Statics.field108 + arg0);
            var62.field3250.method8406(arg3);
            field579.method2682(var62);
        }
        if (arg2 == 58) {
            class347 var63 = Statics.field185.method5640(arg1, arg0);
            if (var63 != null) {
                if (var63.field3786 != null) {
                    class90 var64 = new class90();
                    var64.field1088 = var63;
                    var64.field1082 = arg3;
                    var64.field1077 = arg6;
                    var64.field1087 = var63.field3786;
                    class72.method2004(var64);
                }
                class311 var65 = class311.method2978(class309.field3170, field579.field1425);
                var65.field3250.method8405(field586);
                var65.field3250.method8351(arg1);
                var65.field3250.method8406(arg4);
                var65.field3250.method8420(Statics.field1842);
                var65.field3250.method8405(field687);
                var65.field3250.method8405(arg0);
                field579.method2682(var65);
            }
        }
        if (arg2 == 18) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var66 = class311.method2978(class309.field3163, field579.field1425);
            var66.field3250.method8406(Statics.field103 + arg1);
            var66.field3250.method8397(field756.method3924(82) ? 1 : 0);
            var66.field3250.method8406(Statics.field108 + arg0);
            var66.field3250.method8349(arg3);
            field579.method2682(var66);
        }
        if (arg2 == 1001) {
            field536 = arg7;
            field639 = arg8;
            field641 = 2;
            field762 = 0;
            field527 = arg0;
            field770 = arg1;
            class311 var67 = class311.method2978(class309.field3158, field579.field1425);
            var67.field3250.method8349(arg3);
            var67.field3250.method8406(Statics.field103 + arg1);
            var67.field3250.method8406(Statics.field108 + arg0);
            var67.field3250.method8396(field756.method3924(82) ? 1 : 0);
            field579.method2682(var67);
        }
        if (arg2 == 29) {
            class311 var68 = class311.method2978(class309.field3168, field579.field1425);
            var68.field3250.method8351(arg1);
            field579.method2682(var68);
            class347 var69 = Statics.field185.method5639(arg1);
            if (var69 != null && var69.field3730 != null && var69.field3730[0][0] == 5) {
                int var70 = var69.field3730[0][1];
                if (class336.field3568[var70] != var69.field3805[0]) {
                    class336.field3568[var70] = var69.field3805[0];
                    method2224(var70);
                }
            }
        }
        if (arg2 == 47) {
            class94 var71 = field726[arg3];
            if (var71 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var72 = class311.method2978(class309.field3200, field579.field1425);
                var72.field3250.method8405(arg3);
                var72.field3250.method8396(field756.method3924(82) ? 1 : 0);
                field579.method2682(var72);
            }
        }
        if (arg2 == 26) {
            method1167();
        }
        if (arg2 == 25) {
            class347 var73 = Statics.field185.method5640(arg1, arg0);
            if (var73 != null) {
                method5177();
                method7738(arg1, arg0, Statics.method3398(method2234(var73)), arg4);
                field580 = 0;
                field752 = method3016(var73);
                if (field752 == null) {
                    field752 = class367.field3956;
                }
                if (var73.field3675) {
                    field689 = var73.field3717 + class104.method1732(16777215);
                } else {
                    field689 = class104.method1732(65280) + var73.field3807 + class104.method1732(16777215);
                }
            }
            return;
        }
        if (arg2 == 8) {
            class103 var74 = field705[arg3];
            if (var74 != null) {
                field536 = arg7;
                field639 = arg8;
                field641 = 2;
                field762 = 0;
                field527 = arg0;
                field770 = arg1;
                class311 var75 = class311.method2978(class309.field3230, field579.field1425);
                var75.field3250.method8420(Statics.field1842);
                var75.field3250.method8406(field687);
                var75.field3250.method8485(field756.method3924(82) ? 1 : 0);
                var75.field3250.method8506(field586);
                var75.field3250.method8405(arg3);
                field579.method2682(var75);
            }
        }
        if (field580 != 0) {
            field580 = 0;
            method2979(Statics.field185.method5639(Statics.field11));
        }
        if (field685) {
            method5177();
        }
    }

    @ObfuscatedName("oc.lh(ILjava/lang/String;I)V")
    public static void method6403(int arg0, String arg1) {
        int var2 = class110.field1375;
        int[] var3 = class110.field1376;
        boolean var4 = false;
        class553 var5 = new class553(arg1, Statics.field1781);
        for (int var6 = 0; var6 < var2; var6++) {
            class94 var7 = field726[var3[var6]];
            if (var7 != null && Statics.field2696 != var7 && var7.field1136 != null && var7.field1136.equals(var5)) {
                if (arg0 == 1) {
                    class311 var8 = class311.method2978(class309.field3143, field579.field1425);
                    var8.field3250.method8485(0);
                    var8.field3250.method8405(var3[var6]);
                    field579.method2682(var8);
                } else if (arg0 == 4) {
                    class311 var9 = class311.method2978(class309.field3200, field579.field1425);
                    var9.field3250.method8405(var3[var6]);
                    var9.field3250.method8396(0);
                    field579.method2682(var9);
                } else if (arg0 == 6) {
                    class311 var10 = class311.method2978(class309.field3183, field579.field1425);
                    var10.field3250.method8396(0);
                    var10.field3250.method8506(var3[var6]);
                    field579.method2682(var10);
                } else if (arg0 == 7) {
                    class311 var11 = class311.method2978(class309.field3211, field579.field1425);
                    var11.field3250.method8348(0);
                    var11.field3250.method8349(var3[var6]);
                    field579.method2682(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class113.method6942(4, "", class367.field4120 + arg1);
        }
    }

    @ObfuscatedName("sq.lm(IIIII)V")
    public static void method7738(int arg0, int arg1, int arg2, int arg3) {
        class347 var4 = Statics.field185.method5640(arg0, arg1);
        if (var4 != null && var4.field3743 != null) {
            class90 var5 = new class90();
            var5.field1088 = var4;
            var5.field1087 = var4.field3743;
            class72.method2004(var5);
        }
        field687 = arg3;
        field685 = true;
        Statics.field1842 = arg0;
        field586 = arg1;
        Statics.field174 = arg2;
        method2979(var4);
    }

    @ObfuscatedName("la.lj(I)V")
    public static void method5177() {
        if (!field685) {
            return;
        }
        class347 var0 = Statics.field185.method5640(Statics.field1842, field586);
        if (var0 != null && var0.field3777 != null) {
            class90 var1 = new class90();
            var1.field1088 = var0;
            var1.field1087 = var0.field3777;
            class72.method2004(var1);
        }
        field687 = -1;
        field685 = false;
        method2979(var0);
    }

    @ObfuscatedName("gs.lf(III)V")
    public static void method3231(int arg0, int arg1) {
        class311 var2 = class311.method2978(class309.field3208, field579.field1425);
        var2.field3250.method8349(arg1);
        var2.field3250.method8585(arg0);
        field579.method2682(var2);
    }

    @ObfuscatedName("jq.li(IIIILjava/lang/String;I)V")
    public static void method4518(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class347 var5 = Statics.field185.method5640(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3785 != null) {
            class90 var6 = new class90();
            var6.field1088 = var5;
            var6.field1082 = arg0;
            var6.field1077 = arg4;
            var6.field1087 = var5.field3785;
            class72.method2004(var6);
        }
        boolean var7 = true;
        if (var5.field3681 > 0) {
            var7 = method3456(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method2234(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class311 var11 = class311.method2978(class309.field3184, field579.field1425);
            var11.field3250.method8351(arg1);
            var11.field3250.method8349(arg2);
            var11.field3250.method8349(arg3);
            field579.method2682(var11);
        }
        if (arg0 == 2) {
            class311 var12 = class311.method2978(class309.field3218, field579.field1425);
            var12.field3250.method8351(arg1);
            var12.field3250.method8349(arg2);
            var12.field3250.method8349(arg3);
            field579.method2682(var12);
        }
        if (arg0 == 3) {
            class311 var13 = class311.method2978(class309.field3162, field579.field1425);
            var13.field3250.method8351(arg1);
            var13.field3250.method8349(arg2);
            var13.field3250.method8349(arg3);
            field579.method2682(var13);
        }
        if (arg0 == 4) {
            class311 var14 = class311.method2978(class309.field3209, field579.field1425);
            var14.field3250.method8351(arg1);
            var14.field3250.method8349(arg2);
            var14.field3250.method8349(arg3);
            field579.method2682(var14);
        }
        if (arg0 == 5) {
            class311 var15 = class311.method2978(class309.field3166, field579.field1425);
            var15.field3250.method8351(arg1);
            var15.field3250.method8349(arg2);
            var15.field3250.method8349(arg3);
            field579.method2682(var15);
        }
        if (arg0 == 6) {
            class311 var16 = class311.method2978(class309.field3159, field579.field1425);
            var16.field3250.method8351(arg1);
            var16.field3250.method8349(arg2);
            var16.field3250.method8349(arg3);
            field579.method2682(var16);
        }
        if (arg0 == 7) {
            class311 var17 = class311.method2978(class309.field3194, field579.field1425);
            var17.field3250.method8351(arg1);
            var17.field3250.method8349(arg2);
            var17.field3250.method8349(arg3);
            field579.method2682(var17);
        }
        if (arg0 == 8) {
            class311 var18 = class311.method2978(class309.field3220, field579.field1425);
            var18.field3250.method8351(arg1);
            var18.field3250.method8349(arg2);
            var18.field3250.method8349(arg3);
            field579.method2682(var18);
        }
        if (arg0 == 9) {
            class311 var19 = class311.method2978(class309.field3173, field579.field1425);
            var19.field3250.method8351(arg1);
            var19.field3250.method8349(arg2);
            var19.field3250.method8349(arg3);
            field579.method2682(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class311 var20 = class311.method2978(class309.field3199, field579.field1425);
        var20.field3250.method8351(arg1);
        var20.field3250.method8349(arg2);
        var20.field3250.method8349(arg3);
        field579.method2682(var20);
    }

    @ObfuscatedName("fp.lc(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3011(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method3531(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("iv.lk(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method3531(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field666 || field667 >= 500) {
            return;
        }
        field673[field667] = arg0;
        field674[field667] = arg1;
        field670[field667] = arg2;
        field671[field667] = arg3;
        field759[field667] = arg4;
        field669[field667] = arg5;
        field672[field667] = arg6;
        field675[field667] = arg7;
        field667++;
    }

    @ObfuscatedName("em.lv(I)I")
    public static final int method2593() {
        return field667 - 1;
    }

    @ObfuscatedName("gz.lw(II)Ljava/lang/String;")
    public static String method3138(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field674[arg0].length() > 0) {
            return field673[arg0] + class367.field4113 + field674[arg0];
        } else {
            return field673[arg0];
        }
    }

    @ObfuscatedName("eg.lo(IIIII)V")
    public static final void method2607(int arg0, int arg1, int arg2, int arg3) {
        if (field580 == 0 && !field685) {
            method3011(class367.field4117, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class255.field2811;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = (int) (var4 >>> 7 & 0x7FL);
                    class94 var15 = field726[field657];
                    method6161(var15, field657, var11, var13);
                }
                return;
            }
            long var16 = class255.field2812[var8];
            if (var6 != var16) {
                label309: {
                    var6 = var16;
                    int var20 = class255.method2500(var8);
                    int var21 = class255.method3978(var8);
                    long var22 = class255.field2812[var8];
                    int var24 = (int) (var22 >>> 14 & 0x3L);
                    int var27 = class255.method1169(var8);
                    if (var24 == 2 && Statics.field53.method4336(Statics.field1072, var20, var21, var16) >= 0) {
                        class220 var28 = Statics.method2243(var27);
                        if (var28.field2232 != null) {
                            var28 = var28.method3696();
                        }
                        if (var28 == null) {
                            break label309;
                        }
                        class97 var29 = null;
                        for (class97 var30 = (class97) field659.method6532(); var30 != null; var30 = (class97) field659.method6543()) {
                            if (Statics.field1072 == var30.field1175 && var30.field1176 == var20 && var30.field1173 == var21 && var30.field1178 == var27) {
                                var29 = var30;
                                break;
                            }
                        }
                        if (field580 == 1) {
                            method3011(class367.field4112, field773 + " " + class104.field1334 + " " + class104.method1732(65535) + var28.field2201, 1, var27, var20, var21);
                        } else if (!field685) {
                            String[] var31 = var28.field2218;
                            if (var31 != null) {
                                for (int var32 = 4; var32 >= 0; var32--) {
                                    if ((var29 == null || var29.method2302(var32)) && var31[var32] != null) {
                                        short var33 = 0;
                                        if (var32 == 0) {
                                            var33 = 3;
                                        }
                                        if (var32 == 1) {
                                            var33 = 4;
                                        }
                                        if (var32 == 2) {
                                            var33 = 5;
                                        }
                                        if (var32 == 3) {
                                            var33 = 6;
                                        }
                                        if (var32 == 4) {
                                            var33 = 1001;
                                        }
                                        method3011(var31[var32], class104.method1732(65535) + var28.field2201, var33, var27, var20, var21);
                                    }
                                }
                            }
                            method3011(class367.field4196, class104.method1732(65535) + var28.field2201, 1002, var28.field2198, var20, var21);
                        } else if ((Statics.field174 & 0x4) == 4) {
                            method3011(field752, field689 + " " + class104.field1334 + " " + class104.method1732(65535) + var28.field2201, 2, var27, var20, var21);
                        }
                    }
                    if (var24 == 1) {
                        class103 var34 = field705[var27];
                        if (var34 == null) {
                            break label309;
                        }
                        if (var34.field1328.field2050 == 1 && (var34.field1227 & 0x7F) == 64 && (var34.field1187 & 0x7F) == 64) {
                            for (int var35 = 0; var35 < field668; var35++) {
                                class103 var36 = field705[field581[var35]];
                                if (var36 != null && var34 != var36 && var36.field1328.field2050 == 1 && var34.field1227 == var36.field1227 && var34.field1187 == var36.field1187) {
                                    method190(var36, field581[var35], var20, var21);
                                }
                            }
                            int var37 = class110.field1375;
                            int[] var38 = class110.field1376;
                            for (int var39 = 0; var39 < var37; var39++) {
                                class94 var40 = field726[var38[var39]];
                                if (var40 != null && var34.field1227 == var40.field1227 && var34.field1187 == var40.field1187) {
                                    method6161(var40, var38[var39], var20, var21);
                                }
                            }
                        }
                        method190(var34, var27, var20, var21);
                    }
                    if (var24 == 0) {
                        class94 var41 = field726[var27];
                        if (var41 == null) {
                            break label309;
                        }
                        if ((var41.field1227 & 0x7F) == 64 && (var41.field1187 & 0x7F) == 64) {
                            for (int var42 = 0; var42 < field668; var42++) {
                                class103 var43 = field705[field581[var42]];
                                if (var43 != null && var43.field1328.field2050 == 1 && var41.field1227 == var43.field1227 && var41.field1187 == var43.field1187) {
                                    method190(var43, field581[var42], var20, var21);
                                }
                            }
                            int var44 = class110.field1375;
                            int[] var45 = class110.field1376;
                            for (int var46 = 0; var46 < var44; var46++) {
                                class94 var47 = field726[var45[var46]];
                                if (var47 != null && var41 != var47 && var41.field1227 == var47.field1227 && var41.field1187 == var47.field1187) {
                                    method6161(var47, var45[var46], var20, var21);
                                }
                            }
                        }
                        if (field657 == var27) {
                            var4 = var16;
                        } else {
                            method6161(var41, var27, var20, var21);
                        }
                    }
                    if (var24 == 3) {
                        class393 var48 = field688[Statics.field1072][var20][var21];
                        if (var48 != null) {
                            for (class107 var49 = (class107) var48.method6527(); var49 != null; var49 = (class107) var48.method6530()) {
                                class221 var50 = class221.method3594(var49.field1356);
                                if (field580 == 1) {
                                    method3011(class367.field4112, field773 + " " + class104.field1334 + " " + class104.method1732(16748608) + var50.field2251, 16, var49.field1356, var20, var21);
                                } else if (!field685) {
                                    String[] var51 = var50.field2268;
                                    for (int var52 = 4; var52 >= 0; var52--) {
                                        if (var49.method2598(var52)) {
                                            if (var51 != null && var51[var52] != null) {
                                                byte var53 = 0;
                                                if (var52 == 0) {
                                                    var53 = 18;
                                                }
                                                if (var52 == 1) {
                                                    var53 = 19;
                                                }
                                                if (var52 == 2) {
                                                    var53 = 20;
                                                }
                                                if (var52 == 3) {
                                                    var53 = 21;
                                                }
                                                if (var52 == 4) {
                                                    var53 = 22;
                                                }
                                                method3011(var51[var52], class104.method1732(16748608) + var50.field2251, var53, var49.field1356, var20, var21);
                                            } else if (var52 == 2) {
                                                method3011(class367.field3949, class104.method1732(16748608) + var50.field2251, 20, var49.field1356, var20, var21);
                                            }
                                        }
                                    }
                                    method3011(class367.field4196, class104.method1732(16748608) + var50.field2251, 1004, var49.field1356, var20, var21);
                                } else if ((Statics.field174 & 0x1) == 1) {
                                    method3011(field752, field689 + " " + class104.field1334 + " " + class104.method1732(16748608) + var50.field2251, 17, var49.field1356, var20, var21);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("an.ls(Ldc;IIII)V")
    public static final void method190(class103 arg0, int arg1, int arg2, int arg3) {
        class206 var4 = arg0.field1328;
        if (field667 >= 400) {
            return;
        }
        if (var4.field2043 != null) {
            var4 = var4.method3500();
        }
        if (var4 == null || !var4.field2059 || var4.field2081 && field699 != arg1) {
            return;
        }
        String var5 = arg0.method2551();
        if (var4.field2074 != 0 && arg0.field1263 != 0) {
            int var6 = arg0.field1263 == -1 ? var4.field2074 : arg0.field1263;
            var5 = var5 + method5656(var6, Statics.field2696.field1124) + " " + class104.field1332 + class367.field4118 + var6 + class104.field1333;
        }
        if (var4.field2081 && field676) {
            method3011(class367.field4196, class104.method1732(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field580 == 1) {
            method3011(class367.field4112, field773 + " " + class104.field1334 + " " + class104.method1732(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field685) {
            int var7 = var4.field2081 && field676 ? 2000 : 0;
            String[] var8 = var4.field2056;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (arg0.method2507(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase(class367.field4129)) {
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
                        method3011(var8[var9], class104.method1732(16776960) + var5, var10, arg1, arg2, arg3);
                    }
                }
            }
            if (var8 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (arg0.method2507(var11) && var8[var11] != null && var8[var11].equalsIgnoreCase(class367.field4129)) {
                        short var12 = 0;
                        if (field804 != class106.field1345) {
                            if (field804 == class106.field1346 || field804 == class106.field1350 && var4.field2074 > Statics.field2696.field1124) {
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
                            method3011(var8[var11], class104.method1732(16776960) + var5, var13, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2081 || !field676) {
                method3011(class367.field4196, class104.method1732(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field174 & 0x2) == 2) {
            method3011(field752, field689 + " " + class104.field1334 + " " + class104.method1732(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("nh.ld(Ldj;IIIB)V")
    public static final void method6161(class94 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2696 == arg0 || field667 >= 400) {
            return;
        }
        String var4;
        if (arg0.field1130 == 0) {
            var4 = arg0.field1123[0] + arg0.field1136 + arg0.field1123[1] + method5656(arg0.field1124, Statics.field2696.field1124) + " " + class104.field1332 + class367.field4118 + arg0.field1124 + class104.field1333 + arg0.field1123[2];
        } else {
            var4 = arg0.field1123[0] + arg0.field1136 + arg0.field1123[1] + " " + class104.field1332 + class367.field4248 + arg0.field1130 + class104.field1333 + arg0.field1123[2];
        }
        if (field580 == 1) {
            method3011(class367.field4112, field773 + " " + class104.field1334 + " " + class104.method1732(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field685) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field779[var5] != null) {
                    short var6 = 0;
                    if (field779[var5].equalsIgnoreCase(class367.field4129)) {
                        if (field695 == class106.field1345) {
                            continue;
                        }
                        if (field695 == class106.field1346 || field695 == class106.field1350 && arg0.field1124 > Statics.field2696.field1124) {
                            var6 = 2000;
                        }
                        if (Statics.field2696.field1138 == 0 || arg0.field1138 == 0) {
                            if (field695 == class106.field1349 && arg0.method2288()) {
                                var6 = 2000;
                            }
                        } else if (Statics.field2696.field1138 == arg0.field1138) {
                            var6 = 2000;
                        } else {
                            var6 = 0;
                        }
                    } else if (field655[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field747[var5] + var6;
                    method3011(field779[var5], class104.method1732(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field174 & 0x8) == 8) {
            method3011(field752, field689 + " " + class104.field1334 + " " + class104.method1732(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field667; var9++) {
            if (field670[var9] == 23) {
                field674[var9] = class104.method1732(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("nt.lr(III)Ljava/lang/String;")
    public static final String method5656(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class104.method1732(16711680);
        } else if (var2 < -6) {
            return class104.method1732(16723968);
        } else if (var2 < -3) {
            return class104.method1732(16740352);
        } else if (var2 < 0) {
            return class104.method1732(16756736);
        } else if (var2 > 9) {
            return class104.method1732(65280);
        } else if (var2 > 6) {
            return class104.method1732(4259584);
        } else if (var2 > 3) {
            return class104.method1732(8453888);
        } else if (var2 > 0) {
            return class104.method1732(12648192);
        } else {
            return class104.method1732(16776960);
        }
    }

    @ObfuscatedName("pb.lz(IIIIIIIII)V")
    public static final void method6938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field185.method5641(arg0)) {
            Statics.field36 = null;
            method4149(Statics.field185.field3588[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field36 != null) {
                method4149(Statics.field36, -1412584499, arg1, arg2, arg3, arg4, Statics.field4390, Statics.field49, arg7);
                Statics.field36 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field740[var8] = true;
            }
        } else {
            field740[arg7] = true;
        }
    }

    @ObfuscatedName("jh.lb([Lnm;IIIIIIIII)V")
    public static final void method4149(class347[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class540.method8694(arg2, arg3, arg4, arg5);
        class241.method4170();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class347 var10 = arg0[var9];
            if (var10 != null && (var10.field3696 == arg1 || arg1 == -1412584499 && field702 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field743[field562] = var10.field3670 + arg6;
                    field744[field562] = var10.field3691 + arg7;
                    field521[field562] = var10.field3692;
                    field774[field562] = var10.field3693;
                    var11 = ++field562 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3822 = var11;
                var10.field3823 = field533;
                if (!var10.field3675 || !method3957(var10)) {
                    if (var10.field3681 > 0) {
                        method37(var10);
                    }
                    int var12 = var10.field3670 + arg6;
                    int var13 = var10.field3691 + arg7;
                    int var14 = var10.field3708;
                    if (field702 == var10) {
                        if (arg1 != -1412584499 && !var10.field3763) {
                            Statics.field36 = arg0;
                            Statics.field4390 = arg6;
                            Statics.field49 = arg7;
                            continue;
                        }
                        if (field713 && field648) {
                            int var15 = class36.field235;
                            int var16 = class36.field241;
                            int var17 = var15 - field704;
                            int var18 = var16 - field524;
                            if (var17 < field751) {
                                var17 = field751;
                            }
                            if (var10.field3692 + var17 > field751 + field703.field3692) {
                                var17 = field751 + field703.field3692 - var10.field3692;
                            }
                            if (var18 < field749) {
                                var18 = field749;
                            }
                            if (var10.field3693 + var18 > field749 + field703.field3693) {
                                var18 = field749 + field703.field3693 - var10.field3693;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3763) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3679 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3692 + var12;
                        int var22 = var10.field3693 + var13;
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
                        int var29 = var10.field3692 + var12;
                        int var30 = var10.field3693 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3675 || var25 < var27 && var26 < var28) {
                        if (var10.field3681 != 0) {
                            if (var10.field3681 == 1336) {
                                if (Statics.field1106.method2407()) {
                                    var13 += 15;
                                    Statics.field1486.method6991("Fps:" + field198, var10.field3692 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field748) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1486.method6991("Mem:" + var32 + "k", var10.field3692 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3681 == 1337) {
                                field623 = var12;
                                field680 = var13;
                                Statics.method7154(var12, var13, var10.field3692, var10.field3693);
                                field740[var10.field3822] = true;
                                class540.method8694(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3681 == 1338) {
                                method7215(var10, var12, var13, var11);
                                class540.method8694(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3681 == 1339) {
                                method2811(var10, var12, var13, var11);
                                class540.method8694(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3681 == 1400) {
                                Statics.field4641.method7868(var12, var13, var10.field3692, var10.field3693, field533);
                            }
                            if (var10.field3681 == 1401) {
                                Statics.field4641.method7871(var12, var13, var10.field3692, var10.field3693);
                            }
                            if (var10.field3681 == 1402) {
                                Statics.field5246.method2379(var12, field533);
                            }
                        }
                        if (var10.field3679 == 0) {
                            if (!var10.field3675 && method3957(var10) && Statics.field493 != var10) {
                                continue;
                            }
                            if (!var10.field3675) {
                                if (var10.field3699 > var10.field3776 - var10.field3693) {
                                    var10.field3699 = var10.field3776 - var10.field3693;
                                }
                                if (var10.field3699 < 0) {
                                    var10.field3699 = 0;
                                }
                            }
                            method4149(arg0, var10.field3676, var25, var26, var27, var28, var12 - var10.field3713, var13 - var10.field3699, var11);
                            if (var10.field3815 != null) {
                                method4149(var10.field3815, var10.field3676, var25, var26, var27, var28, var12 - var10.field3713, var13 - var10.field3699, var11);
                            }
                            class89 var34 = (class89) field691.method8104((long) var10.field3676);
                            if (var34 != null) {
                                method6938(var34.field1076, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class540.method8694(arg2, arg3, arg4, arg5);
                            class241.method4170();
                        } else if (var10.field3679 == 11) {
                            if (method3957(var10) && Statics.field493 != var10) {
                                continue;
                            }
                            if (var10.field3815 != null) {
                                method4149(var10.field3815, var10.field3676, var25, var26, var27, var28, var12 - var10.field3713, var13 - var10.field3699, var11);
                            }
                            class540.method8694(arg2, arg3, arg4, arg5);
                            class241.method4170();
                        }
                        if (field684 || field678[var11] || field720 > 1) {
                            if (var10.field3679 == 0 && !var10.field3675 && var10.field3776 > var10.field3693) {
                                method3897(var10.field3692 + var12, var13, var10.field3699, var10.field3693, var10.field3776);
                            }
                            if (var10.field3679 != 1) {
                                if (var10.field3679 == 3) {
                                    int var35;
                                    if (method2779(var10)) {
                                        var35 = var10.field3703;
                                        if (Statics.field493 == var10 && var10.field3705 != 0) {
                                            var35 = var10.field3705;
                                        }
                                    } else {
                                        var35 = var10.field3702;
                                        if (Statics.field493 == var10 && var10.field3806 != 0) {
                                            var35 = var10.field3806;
                                        }
                                    }
                                    if (var10.field3706) {
                                        switch(var10.field3707.field5224) {
                                            case 1:
                                                class540.method8769(var12, var13, var10.field3692, var10.field3693, var10.field3702, var10.field3703);
                                                break;
                                            case 2:
                                                class540.method8704(var12, var13, var10.field3692, var10.field3693, var10.field3702, var10.field3703, 255 - (var10.field3708 & 0xFF), 255 - (var10.field3749 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class540.method8758(var12, var13, var10.field3692, var10.field3693, var35);
                                                } else {
                                                    class540.method8701(var12, var13, var10.field3692, var10.field3693, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class540.method8763(var12, var13, var10.field3692, var10.field3693, var35);
                                    } else {
                                        class540.method8691(var12, var13, var10.field3692, var10.field3693, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3679 == 4) {
                                    class409 var36 = var10.method5991(Statics.field185);
                                    if (var36 != null) {
                                        String var37 = var10.field3740;
                                        int var38;
                                        if (method2779(var10)) {
                                            var38 = var10.field3703;
                                            if (Statics.field493 == var10 && var10.field3705 != 0) {
                                                var38 = var10.field3705;
                                            }
                                            if (var10.field3811.length() > 0) {
                                                var37 = var10.field3811;
                                            }
                                        } else {
                                            var38 = var10.field3702;
                                            if (Statics.field493 == var10 && var10.field3806 != 0) {
                                                var38 = var10.field3806;
                                            }
                                        }
                                        if (var10.field3675 && var10.field3756 != -1) {
                                            class221 var39 = class221.method3594(var10.field3756);
                                            var37 = var39.field2251;
                                            if (var37 == null) {
                                                var37 = class367.field3956;
                                            }
                                            if ((var39.field2262 == 1 || var10.field3812 != 1) && var10.field3812 != -1) {
                                                var37 = class104.method1732(16748608) + var37 + class104.field1329 + " " + 'x' + Statics.method3234(var10.field3812);
                                            }
                                        }
                                        if (field624 == var10) {
                                            var37 = class367.field4171;
                                            var38 = var10.field3702;
                                        }
                                        if (!var10.field3675) {
                                            var37 = method7561(var37, var10);
                                        }
                                        var36.method6959(var37, var12, var13, var10.field3692, var10.field3693, var38, var10.field3745 ? 0 : -1, class482.method7754(var10.field3708), var10.field3755, var10.field3685, var10.field3742);
                                    } else if (class347.field3667) {
                                        method2979(var10);
                                    }
                                } else if (var10.field3679 == 5) {
                                    if (var10.field3675) {
                                        class544 var41;
                                        if (var10.field3756 == -1) {
                                            var41 = var10.method5986(Statics.field185, false, Statics.field3089);
                                        } else {
                                            var41 = class221.method3091(var10.field3756, var10.field3812, var10.field3762, var10.field3761, var10.field3738, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5234;
                                            int var43 = var41.field5240;
                                            if (var10.field3819) {
                                                class540.method8695(var12, var13, var10.field3692 + var12, var10.field3693 + var13);
                                                int var44 = (var10.field3692 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3693 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3715 != 0) {
                                                            var41.method8842(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3715, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method8823(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method8864(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class540.method8694(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3692 * 4096 / var42;
                                                if (var10.field3715 != 0) {
                                                    var41.method8842(var10.field3692 / 2 + var12, var10.field3693 / 2 + var13, var10.field3715, var48);
                                                } else if (var14 != 0) {
                                                    var41.method8831(var12, var13, var10.field3692, var10.field3693, 256 - (var14 & 0xFF));
                                                } else if (var10.field3692 == var42 && var10.field3693 == var43) {
                                                    var41.method8823(var12, var13);
                                                } else {
                                                    var41.method8825(var12, var13, var10.field3692, var10.field3693);
                                                }
                                            }
                                        } else if (class347.field3667) {
                                            method2979(var10);
                                        }
                                    } else {
                                        class544 var40 = var10.method5986(Statics.field185, method2779(var10), Statics.field3089);
                                        if (var40 != null) {
                                            var40.method8823(var12, var13);
                                        } else if (class347.field3667) {
                                            method2979(var10);
                                        }
                                    }
                                } else if (var10.field3679 == 6) {
                                    boolean var49 = method2779(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3726;
                                    } else {
                                        var50 = var10.field3764;
                                    }
                                    class254 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3756 != -1) {
                                        class221 var53 = class221.method3594(var10.field3756);
                                        if (var53 != null) {
                                            class221 var54 = var53.method3741(var10.field3812);
                                            var51 = var54.method3770(1);
                                            if (var51 == null) {
                                                method2979(var10);
                                            } else {
                                                var51.method4543();
                                                var52 = var51.field2662 / 2;
                                            }
                                        }
                                    } else if (var10.field3721 == 5) {
                                        if (var10.field3672 == 0) {
                                            var51 = field805.method5679((class223) null, -1, (class223) null, -1);
                                        } else {
                                            var51 = Statics.field2696.method2007();
                                        }
                                    } else if (var10.field3721 == 7) {
                                        var51 = var10.field3735.method5679((class223) null, -1, class223.method687(Statics.field2696.field1242), Statics.field2696.field1229);
                                    } else {
                                        class206 var55 = null;
                                        class205 var56 = null;
                                        if (var10.field3721 == 6) {
                                            int var57 = var10.field3672;
                                            if (var57 >= 0 && var57 < field705.length) {
                                                class103 var58 = field705[var57];
                                                if (var58 != null) {
                                                    var55 = var58.field1328;
                                                    var56 = var58.method2525();
                                                }
                                            }
                                        }
                                        class223 var59 = null;
                                        int var60 = -1;
                                        if (var50 != -1) {
                                            var59 = class223.method687(var50);
                                            var60 = var10.field3813;
                                        }
                                        var51 = var10.method6025(Statics.field185, var59, var60, var49, Statics.field2696.field1120, var55, var56);
                                        if (var51 == null && class347.field3667) {
                                            method2979(var10);
                                        }
                                    }
                                    class241.method4169(var10.field3692 / 2 + var12, var10.field3693 / 2 + var13);
                                    int var61 = var10.field3723 * class241.field2553[var10.field3729] >> 16;
                                    int var62 = var10.field3723 * class241.field2554[var10.field3729] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3675) {
                                            var51.method4543();
                                            if (var10.field3736) {
                                                var51.method4561(0, var10.field3674, var10.field3765, var10.field3729, var10.field3731, var10.field3728 + var52 + var61, var10.field3728 + var62, var10.field3723);
                                            } else {
                                                var51.method4566(0, var10.field3674, var10.field3765, var10.field3729, var10.field3731, var10.field3728 + var52 + var61, var10.field3728 + var62);
                                            }
                                        } else {
                                            var51.method4566(0, var10.field3674, 0, var10.field3729, 0, var61, var62);
                                        }
                                    }
                                    class241.method4168();
                                } else {
                                    if (var10.field3679 == 8 && Statics.field4375 == var10 && field789 == field531) {
                                        int var63 = 0;
                                        int var64 = 0;
                                        class409 var65 = Statics.field1486;
                                        String var66 = var10.field3740;
                                        String var67 = method7561(var66, var10);
                                        while (var67.length() > 0) {
                                            int var68 = var67.indexOf(class104.field1335);
                                            String var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = "";
                                            } else {
                                                var69 = var67.substring(0, var68);
                                                var67 = var67.substring(var68 + 4);
                                            }
                                            int var70 = var65.method6948(var69);
                                            if (var70 > var63) {
                                                var63 = var70;
                                            }
                                            var64 += var65.field4536 + 1;
                                        }
                                        var63 += 6;
                                        var64 += 7;
                                        int var71 = var10.field3692 + var12 - 5 - var63;
                                        int var72 = var10.field3693 + var13 + 5;
                                        if (var71 < var12 + 5) {
                                            var71 = var12 + 5;
                                        }
                                        if (var63 + var71 > arg4) {
                                            var71 = arg4 - var63;
                                        }
                                        if (var64 + var72 > arg5) {
                                            var72 = arg5 - var64;
                                        }
                                        class540.method8758(var71, var72, var63, var64, 16777120);
                                        class540.method8763(var71, var72, var63, var64, 0);
                                        String var73 = var10.field3740;
                                        int var74 = var65.field4536 + var72 + 2;
                                        String var75 = method7561(var73, var10);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf(class104.field1335);
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            var65.method6954(var77, var71 + 3, var74, 0, -1);
                                            var74 += var65.field4536 + 1;
                                        }
                                    }
                                    if (var10.field3679 == 9) {
                                        int var78;
                                        int var79;
                                        int var80;
                                        int var81;
                                        if (var10.field3701) {
                                            var78 = var12;
                                            var79 = var10.field3693 + var13;
                                            var80 = var10.field3692 + var12;
                                            var81 = var13;
                                        } else {
                                            var78 = var12;
                                            var79 = var13;
                                            var80 = var10.field3692 + var12;
                                            var81 = var10.field3693 + var13;
                                        }
                                        if (var10.field3716 == 1) {
                                            class540.method8712(var78, var79, var80, var81, var10.field3702);
                                        } else {
                                            method3241(var78, var79, var80, var81, var10.field3702, var10.field3716);
                                        }
                                    } else if (var10.field3679 == 12) {
                                        class345 var82 = var10.method6013();
                                        class340 var83 = var10.method6014();
                                        if (var82 != null && var83 != null && var82.method5759()) {
                                            class409 var84 = var10.method5991(Statics.field185);
                                            if (var84 != null) {
                                                field786.method8968(var12, var13, var10.field3692, var10.field3693, var82.method5760(), var82.method5761(), var82.method5757(), var82.method5758(), var82.method5756());
                                                int var85 = var10.field3745 ? var10.field3761 : -1;
                                                if (!var82.method5754() && var82.method5931().method6811()) {
                                                    field786.method8972(var83.field3594, var85, var83.field3592, var83.field3593);
                                                    field786.method8969(var82.method5752(), var84);
                                                } else {
                                                    field786.method8972(var10.field3702, var85, var83.field3592, var83.field3593);
                                                    field786.method8969(var82.method5931(), var84);
                                                }
                                                class540.method8694(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("gv.lp(IIIIIII)V")
    public static final void method3241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class540.field5214;
        int var18 = arg1 - class540.field5213;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class241.method4193(var19, var20, var21);
        class241.method4200(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class241.method4193(var19, var21, var22);
        class241.method4200(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("ro.lt(Ljava/lang/String;Lnm;S)Ljava/lang/String;")
    public static String method7561(String arg0, class347 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method8223(method3376(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("client.lg(ZI)V")
    public final void method1254(boolean arg0) {
        int var2 = field797;
        int var3 = Statics.field3598;
        int var4 = Statics.field4908;
        if (Statics.field185.method5641(var2)) {
            method6176(Statics.field185.field3588[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ln(Lnm;B)V")
    public void method1198(class347 arg0) {
        class347 var2 = arg0.field3696 == -1 ? null : Statics.field185.method5639(arg0.field3696);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field3598;
            var4 = Statics.field4908;
        } else {
            var3 = var2.field3692;
            var4 = var2.field3693;
        }
        method2959(arg0, var3, var4, false);
        method9009(arg0, var3, var4);
    }

    @ObfuscatedName("dw.lq([Lnm;Lnm;ZB)V")
    public static void method2301(class347[] arg0, class347 arg1, boolean arg2) {
        int var3 = arg1.field3744 == 0 ? arg1.field3692 : arg1.field3744;
        int var4 = arg1.field3776 == 0 ? arg1.field3693 : arg1.field3776;
        method6176(arg0, arg1.field3676, var3, var4, arg2);
        if (arg1.field3815 != null) {
            method6176(arg1.field3815, arg1.field3676, var3, var4, arg2);
        }
        class89 var5 = (class89) field691.method8104((long) arg1.field3676);
        if (var5 != null) {
            int var6 = var5.field1076;
            if (Statics.field185.method5641(var6)) {
                method6176(Statics.field185.field3588[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3681 == 1337) {
        }
    }

    @ObfuscatedName("nq.lx([Lnm;IIIZB)V")
    public static void method6176(class347[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class347 var6 = arg0[var5];
            if (var6 != null && var6.field3696 == arg1) {
                method2959(var6, arg2, arg3, arg4);
                method9009(var6, arg2, arg3);
                if (var6.field3713 > var6.field3744 - var6.field3692) {
                    var6.field3713 = var6.field3744 - var6.field3692;
                }
                if (var6.field3713 < 0) {
                    var6.field3713 = 0;
                }
                if (var6.field3699 > var6.field3776 - var6.field3693) {
                    var6.field3699 = var6.field3776 - var6.field3693;
                }
                if (var6.field3699 < 0) {
                    var6.field3699 = 0;
                }
                if (var6.field3679 == 0) {
                    method2301(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("fy.lu(Lnm;IIZI)V")
    public static void method2959(class347 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3692;
        int var5 = arg0.field3693;
        if (arg0.field3684 == 0) {
            arg0.field3692 = arg0.field3688;
        } else if (arg0.field3684 == 1) {
            arg0.field3692 = arg1 - arg0.field3688;
        } else if (arg0.field3684 == 2) {
            arg0.field3692 = arg0.field3688 * arg1 >> 14;
        }
        if (arg0.field3775 == 0) {
            arg0.field3693 = arg0.field3689;
        } else if (arg0.field3775 == 1) {
            arg0.field3693 = arg2 - arg0.field3689;
        } else if (arg0.field3775 == 2) {
            arg0.field3693 = arg0.field3689 * arg2 >> 14;
        }
        if (arg0.field3684 == 4) {
            arg0.field3692 = arg0.field3694 * arg0.field3693 / arg0.field3695;
        }
        if (arg0.field3775 == 4) {
            arg0.field3693 = arg0.field3695 * arg0.field3692 / arg0.field3694;
        }
        if (arg0.field3681 == 1337) {
            field547 = arg0;
        }
        if (arg0.field3679 == 12) {
            arg0.method6013().method5900(arg0.field3692, arg0.field3693);
        }
        if (arg3 && arg0.field3799 != null && (arg0.field3692 != var4 || arg0.field3693 != var5)) {
            class90 var6 = new class90();
            var6.field1088 = arg0;
            var6.field1087 = arg0.field3799;
            field707.method6526(var6);
        }
    }

    @ObfuscatedName("vf.mi(Lnm;III)V")
    public static void method9009(class347 arg0, int arg1, int arg2) {
        if (arg0.field3803 == 0) {
            arg0.field3670 = arg0.field3686;
        } else if (arg0.field3803 == 1) {
            arg0.field3670 = (arg1 - arg0.field3692) / 2 + arg0.field3686;
        } else if (arg0.field3803 == 2) {
            arg0.field3670 = arg1 - arg0.field3692 - arg0.field3686;
        } else if (arg0.field3803 == 3) {
            arg0.field3670 = arg0.field3686 * arg1 >> 14;
        } else if (arg0.field3803 == 4) {
            arg0.field3670 = (arg0.field3686 * arg1 >> 14) + (arg1 - arg0.field3692) / 2;
        } else {
            arg0.field3670 = arg1 - arg0.field3692 - (arg0.field3686 * arg1 >> 14);
        }
        if (arg0.field3683 == 0) {
            arg0.field3691 = arg0.field3687;
        } else if (arg0.field3683 == 1) {
            arg0.field3691 = (arg2 - arg0.field3693) / 2 + arg0.field3687;
        } else if (arg0.field3683 == 2) {
            arg0.field3691 = arg2 - arg0.field3693 - arg0.field3687;
        } else if (arg0.field3683 == 3) {
            arg0.field3691 = arg0.field3687 * arg2 >> 14;
        } else if (arg0.field3683 == 4) {
            arg0.field3691 = (arg0.field3687 * arg2 >> 14) + (arg2 - arg0.field3693) / 2;
        } else {
            arg0.field3691 = arg2 - arg0.field3693 - (arg0.field3687 * arg2 >> 14);
        }
    }

    @ObfuscatedName("lt.ma(Lnm;IIIIIII)V")
    public static final void method5303(class347 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field583) {
            field604 = 32;
        } else {
            field604 = 0;
        }
        field583 = false;
        if (class36.field234 == 1 || !Statics.field1462 && class36.field234 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3699 -= 4;
                method2979(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3699 += 4;
                method2979(arg0);
            } else if (arg5 >= arg1 - field604 && arg5 < field604 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3699 = (arg4 - arg3) * var8 / var9;
                method2979(arg0);
                field583 = true;
            }
        }
        if (field731 == 0) {
            return;
        }
        int var10 = arg0.field3692;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3699 += field731 * 45;
            method2979(arg0);
        }
    }

    @ObfuscatedName("ij.mj(IIIIII)V")
    public static final void method3897(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field254[0].method8786(arg0, arg1);
        Statics.field254[1].method8786(arg0, arg1 + arg3 - 16);
        class540.method8758(arg0, arg1 + 16, 16, arg3 - 32, field599);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class540.method8758(arg0, arg1 + 16 + var6, 16, var5, field802);
        class540.method8710(arg0, arg1 + 16 + var6, var5, field602);
        class540.method8710(arg0 + 1, arg1 + 16 + var6, var5, field602);
        class540.method8708(arg0, arg1 + 16 + var6, 16, field602);
        class540.method8708(arg0, arg1 + 17 + var6, 16, field602);
        class540.method8710(arg0 + 15, arg1 + 16 + var6, var5, field557);
        class540.method8710(arg0 + 14, arg1 + 17 + var6, var5 - 1, field557);
        class540.method8708(arg0, arg1 + 15 + var6 + var5, 16, field557);
        class540.method8708(arg0 + 1, arg1 + 14 + var6 + var5, 15, field557);
    }

    @ObfuscatedName("tr.mm(II)Ljava/lang/String;")
    public static final String method8223(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("ee.mc(Lnm;I)Z")
    public static final boolean method2779(class347 arg0) {
        if (arg0.field3804 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3804.length; var1++) {
            int var2 = method3376(arg0, var1);
            int var3 = arg0.field3805[var1];
            if (arg0.field3804[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3804[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3804[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("hg.mw(Lnm;II)I")
    public static final int method3376(class347 arg0, int arg1) {
        if (arg0.field3730 == null || arg1 >= arg0.field3730.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3730[arg1];
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
                    var7 = field565[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field658[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field664[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class347 var11 = Statics.field185.method5639(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class221.method3594(var12).field2267 || field522)) {
                        for (int var13 = 0; var13 < var11.field3787.length; var13++) {
                            if (var12 + 1 == var11.field3787[var13]) {
                                var7 += var11.field3810[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class336.field3568[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class357.field3886[field658[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class336.field3568[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2696.field1124;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class357.field3884[var14]) {
                            var7 += field658[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class347 var17 = Statics.field185.method5639(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class221.method3594(var18).field2267 || field522)) {
                        for (int var19 = 0; var19 < var17.field3787.length; var19++) {
                            if (var18 + 1 == var17.field3787[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field696;
                }
                if (var6 == 12) {
                    var7 = field697;
                }
                if (var6 == 13) {
                    int var20 = class336.field3568[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class336.method686(var22);
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
                    var7 = (Statics.field2696.field1227 >> 7) + Statics.field108;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2696.field1187 >> 7) + Statics.field103;
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

    @ObfuscatedName("jd.mx(Lnm;B)V")
    public static final void method4135(class347 arg0) {
        if (arg0.field3680 == 1) {
            String var1 = arg0.field3808;
            int var2 = arg0.field3676;
            int var3 = arg0.field3756;
            method3531(var1, "", 24, 0, 0, var2, var3, false);
        }
        if (arg0.field3680 == 2 && !field685) {
            String var4 = method3016(arg0);
            if (var4 != null) {
                String var5 = class104.method1732(65280) + arg0.field3807;
                int var6 = arg0.field3676;
                int var7 = arg0.field3756;
                method3531(var4, var5, 25, 0, -1, var6, var7, false);
            }
        }
        if (arg0.field3680 == 3) {
            method3011(class367.field3950, "", 26, 0, 0, arg0.field3676);
        }
        if (arg0.field3680 == 4) {
            method3011(arg0.field3808, "", 28, 0, 0, arg0.field3676);
        }
        if (arg0.field3680 == 5) {
            method3011(arg0.field3808, "", 29, 0, 0, arg0.field3676);
        }
        if (arg0.field3680 == 6 && field624 == null) {
            method3011(arg0.field3808, "", 30, 0, -1, arg0.field3676);
        }
        if (!arg0.field3675) {
            return;
        }
        if (field685) {
            int var8 = method2234(arg0);
            boolean var9 = (var8 >> 21 & 0x1) != 0;
            if (var9 && (Statics.field174 & 0x20) == 32) {
                String var10 = field752;
                String var11 = field689 + " " + class104.field1334 + " " + arg0.field3717;
                int var12 = arg0.field3757;
                int var13 = arg0.field3676;
                int var14 = arg0.field3756;
                method3531(var10, var11, 58, 0, var12, var13, var14, false);
            }
            return;
        }
        for (int var15 = 9; var15 >= 5; var15--) {
            String var16 = method4022(arg0, var15);
            if (var16 != null) {
                String var17 = arg0.field3717;
                int var18 = var15 + 1;
                int var19 = arg0.field3757;
                int var20 = arg0.field3676;
                int var21 = arg0.field3756;
                method3531(var16, var17, 1007, var18, var19, var20, var21, false);
            }
        }
        String var22 = method3016(arg0);
        if (var22 != null) {
            String var23 = arg0.field3717;
            int var24 = arg0.field3757;
            int var25 = arg0.field3676;
            int var26 = arg0.field3756;
            method3531(var22, var23, 25, 0, var24, var25, var26, false);
        }
        for (int var27 = 4; var27 >= 0; var27--) {
            String var28 = method4022(arg0, var27);
            if (var28 != null) {
                method3531(var28, arg0.field3717, 57, var27 + 1, arg0.field3757, arg0.field3676, arg0.field3756, arg0.field3827);
            }
        }
        if (class348.method2976(method2234(arg0))) {
            method3011(class367.field3954, "", 30, 0, arg0.field3757, arg0.field3676);
        }
    }

    @ObfuscatedName("fu.mr(ZI)V")
    public static void method3014(boolean arg0) {
        field621 = arg0;
    }

    @ObfuscatedName("bj.mt(I)Z")
    public static boolean method840() {
        return field621;
    }

    @ObfuscatedName("tn.mf(IIIIIIIB)V")
    public static final void method8182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field185.method5641(arg0)) {
            method2606(Statics.field185.field3588[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("eg.mz([Lnm;IIIIIIIB)V")
    public static final void method2606(class347[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class347 var9 = arg0[var8];
            if (var9 != null && var9.field3696 == arg1 && (var9.method5995() || method2234(var9) != 0 || field703 == var9)) {
                if (var9.field3675) {
                    if (method3957(var9)) {
                        continue;
                    }
                } else if (var9.field3679 == 0 && Statics.field493 != var9 && method3957(var9)) {
                    continue;
                }
                if (var9.field3679 == 11) {
                    if (var9.method6010(Statics.field185, Statics.field3089)) {
                        if (var9.method6003()) {
                            method2979(var9);
                            method2301(var9.field3815, var9, true);
                        }
                        if (var9.field3802 != null) {
                            class90 var10 = new class90();
                            var10.field1088 = var9;
                            var10.field1087 = var9.field3802;
                            field707.method6526(var10);
                        }
                    }
                } else if (var9.field3679 == 12 && var9.method6018(Statics.field185)) {
                    method2979(var9);
                }
                int var11 = var9.field3670 + arg6;
                int var12 = var9.field3691 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3679 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3692 + var11;
                    int var16 = var9.field3693 + var12;
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
                    int var23 = var9.field3692 + var11;
                    int var24 = var9.field3693 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field702 == var9) {
                    field686 = true;
                    field555 = var11;
                    field712 = var12;
                }
                boolean var25 = false;
                if (var9.field3752) {
                    switch(field692) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3676 >>> 16 == field693) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field693 == var9.field3676) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3675 || var19 < var21 && var20 < var22) {
                    if (var9.field3675) {
                        if (var9.field3825) {
                            if (class36.field235 >= var19 && class36.field241 >= var20 && class36.field235 < var21 && class36.field241 < var22) {
                                for (class90 var26 = (class90) field707.method6532(); var26 != null; var26 = (class90) field707.method6543()) {
                                    if (var26.field1078) {
                                        var26.method7776();
                                        var26.field1088.field3816 = false;
                                    }
                                }
                                method3291();
                                if (Statics.field4688 == 0) {
                                    field702 = null;
                                    field703 = null;
                                }
                                if (!field666) {
                                    method6186();
                                }
                            }
                        } else if (var9.field3704 && class36.field235 >= var19 && class36.field241 >= var20 && class36.field235 < var21 && class36.field241 < var22) {
                            for (class90 var27 = (class90) field707.method6532(); var27 != null; var27 = (class90) field707.method6543()) {
                                if (var27.field1078 && var27.field1088.field3700 == var27.field1087) {
                                    var27.method7776();
                                }
                            }
                        }
                    }
                    int var28 = class36.field235;
                    int var29 = class36.field241;
                    if (class36.field242 != 0) {
                        var28 = class36.field244;
                        var29 = class36.field248;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3681 == 1337) {
                        if (!field532 && !field666 && var30) {
                            method2607(var28, var29, var19, var20);
                        }
                    } else if (var9.field3681 == 1338) {
                        method6729(var9, var11, var12);
                    } else {
                        if (var9.field3681 == 1400) {
                            Statics.field4641.method7851(class36.field235, class36.field241, var30, var11, var12, var9.field3692, var9.field3693);
                        }
                        if (!field666 && var30) {
                            if (var9.field3681 == 1400) {
                                Statics.field4641.method7858(var11, var12, var9.field3692, var9.field3693, var28, var29);
                            } else {
                                method4135(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3753.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3753[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3753[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3690 != null) {
                                            var35 = field756.method3924(var9.field3753[var31][var34]);
                                        }
                                        if (method2875(var9.field3753[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3690 != null && var9.field3690[var31] > field533) {
                                                break;
                                            }
                                            byte var36 = var9.field3780[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field756.method3924(86) && !field756.method3924(82) && !field756.method3924(81)) && ((var36 & 0x2) == 0 || field756.method3924(86)) && ((var36 & 0x1) == 0 || field756.method3924(82)) && ((var36 & 0x4) == 0 || field756.method3924(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method4518(var31 + 1, var9.field3676, var9.field3757, var9.field3756, "");
                                    } else if (var31 == 10) {
                                        method5177();
                                        method7738(var9.field3676, var9.field3757, Statics.method3398(method2234(var9)), var9.field3756);
                                        field752 = method3016(var9);
                                        if (field752 == null) {
                                            field752 = class367.field3956;
                                        }
                                        field689 = var9.field3717 + class104.method1732(16777215);
                                    }
                                    int var37 = var9.field3771[var31];
                                    if (var9.field3690 == null) {
                                        var9.field3690 = new int[var9.field3753.length];
                                    }
                                    if (var9.field3801 == null) {
                                        var9.field3801 = new int[var9.field3753.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3690[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3690[var31] == 0) {
                                        var9.field3690[var31] = field533 + var37 + var9.field3801[var31];
                                    } else {
                                        var9.field3690[var31] = field533 + var37;
                                    }
                                }
                                if (!var32 && var9.field3690 != null) {
                                    var9.field3690[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3675) {
                            boolean var38;
                            if (class36.field235 >= var19 && class36.field241 >= var20 && class36.field235 < var21 && class36.field241 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field234 == 1 || !Statics.field1462 && class36.field234 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field242 == 1 || !Statics.field1462 && class36.field242 == 4) && class36.field244 >= var19 && class36.field248 >= var20 && class36.field244 < var21 && class36.field248 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method3230(var9, class36.field244 - var11, class36.field248 - var12);
                            }
                            if (var9.method5996()) {
                                if (var40) {
                                    field535.method6526(new class226(0, class36.field235 - var11, class36.field241 - var12, var9));
                                }
                                if (var39) {
                                    field535.method6526(new class226(1, class36.field235 - var11, class36.field241 - var12, var9));
                                }
                            }
                            if (var9.field3681 == 1400) {
                                Statics.field4641.method7852(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field702 != null && field702 != var9 && var38 && class348.method8218(method2234(var9))) {
                                field706 = var9;
                            }
                            if (field703 == var9) {
                                field648 = true;
                                field751 = var11;
                                field749 = var12;
                            }
                            if (var9.field3741) {
                                if (var38 && field731 != 0 && var9.field3700 != null) {
                                    class90 var41 = new class90();
                                    var41.field1078 = true;
                                    var41.field1088 = var9;
                                    var41.field1086 = field731;
                                    var41.field1087 = var9.field3700;
                                    field707.method6526(var41);
                                }
                                if (field702 != null || field666) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3817 && var40) {
                                    var9.field3817 = true;
                                    if (var9.field3782 != null) {
                                        class90 var42 = new class90();
                                        var42.field1078 = true;
                                        var42.field1088 = var9;
                                        var42.field1081 = class36.field244 - var11;
                                        var42.field1086 = class36.field248 - var12;
                                        var42.field1087 = var9.field3782;
                                        field707.method6526(var42);
                                    }
                                }
                                if (var9.field3817 && var39 && var9.field3768 != null) {
                                    class90 var43 = new class90();
                                    var43.field1078 = true;
                                    var43.field1088 = var9;
                                    var43.field1081 = class36.field235 - var11;
                                    var43.field1086 = class36.field241 - var12;
                                    var43.field1087 = var9.field3768;
                                    field707.method6526(var43);
                                }
                                if (var9.field3817 && !var39) {
                                    var9.field3817 = false;
                                    if (var9.field3769 != null) {
                                        class90 var44 = new class90();
                                        var44.field1078 = true;
                                        var44.field1088 = var9;
                                        var44.field1081 = class36.field235 - var11;
                                        var44.field1086 = class36.field241 - var12;
                                        var44.field1087 = var9.field3769;
                                        field735.method6526(var44);
                                    }
                                }
                                if (var39 && var9.field3770 != null) {
                                    class90 var45 = new class90();
                                    var45.field1078 = true;
                                    var45.field1088 = var9;
                                    var45.field1081 = class36.field235 - var11;
                                    var45.field1086 = class36.field241 - var12;
                                    var45.field1087 = var9.field3770;
                                    field707.method6526(var45);
                                }
                                if (!var9.field3816 && var38) {
                                    var9.field3816 = true;
                                    if (var9.field3725 != null) {
                                        class90 var46 = new class90();
                                        var46.field1078 = true;
                                        var46.field1088 = var9;
                                        var46.field1081 = class36.field235 - var11;
                                        var46.field1086 = class36.field241 - var12;
                                        var46.field1087 = var9.field3725;
                                        field707.method6526(var46);
                                    }
                                }
                                if (var9.field3816 && var38 && var9.field3767 != null) {
                                    class90 var47 = new class90();
                                    var47.field1078 = true;
                                    var47.field1088 = var9;
                                    var47.field1081 = class36.field235 - var11;
                                    var47.field1086 = class36.field241 - var12;
                                    var47.field1087 = var9.field3767;
                                    field707.method6526(var47);
                                }
                                if (var9.field3816 && !var38) {
                                    var9.field3816 = false;
                                    if (var9.field3773 != null) {
                                        class90 var48 = new class90();
                                        var48.field1078 = true;
                                        var48.field1088 = var9;
                                        var48.field1081 = class36.field235 - var11;
                                        var48.field1086 = class36.field241 - var12;
                                        var48.field1087 = var9.field3773;
                                        field735.method6526(var48);
                                    }
                                }
                                if (var9.field3784 != null) {
                                    class90 var49 = new class90();
                                    var49.field1088 = var9;
                                    var49.field1087 = var9.field3784;
                                    field543.method6526(var49);
                                }
                                if (var9.field3778 != null && field632 > var9.field3668) {
                                    if (var9.field3779 == null || field632 - var9.field3668 > 32) {
                                        class90 var54 = new class90();
                                        var54.field1088 = var9;
                                        var54.field1087 = var9.field3778;
                                        field707.method6526(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3668; var50 < field632; var50++) {
                                            int var51 = field717[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3779.length; var52++) {
                                                if (var9.field3779[var52] == var51) {
                                                    class90 var53 = new class90();
                                                    var53.field1088 = var9;
                                                    var53.field1087 = var9.field3778;
                                                    field707.method6526(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3668 = field632;
                                }
                                if (var9.field3722 != null && field603 > var9.field3820) {
                                    if (var9.field3781 == null || field603 - var9.field3820 > 32) {
                                        class90 var59 = new class90();
                                        var59.field1088 = var9;
                                        var59.field1087 = var9.field3722;
                                        field707.method6526(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3820; var55 < field603; var55++) {
                                            int var56 = field677[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3781.length; var57++) {
                                                if (var9.field3781[var57] == var56) {
                                                    class90 var58 = new class90();
                                                    var58.field1088 = var9;
                                                    var58.field1087 = var9.field3722;
                                                    field707.method6526(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3820 = field603;
                                }
                                if (var9.field3754 != null && field606 > var9.field3821) {
                                    if (var9.field3783 == null || field606 - var9.field3821 > 32) {
                                        class90 var64 = new class90();
                                        var64.field1088 = var9;
                                        var64.field1087 = var9.field3754;
                                        field707.method6526(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3821; var60 < field606; var60++) {
                                            int var61 = field719[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3783.length; var62++) {
                                                if (var9.field3783[var62] == var61) {
                                                    class90 var63 = new class90();
                                                    var63.field1088 = var9;
                                                    var63.field1087 = var9.field3754;
                                                    field707.method6526(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3821 = field606;
                                }
                                if (field723 > var9.field3818 && var9.field3788 != null) {
                                    class90 var65 = new class90();
                                    var65.field1088 = var9;
                                    var65.field1087 = var9.field3788;
                                    field707.method6526(var65);
                                }
                                if (field724 > var9.field3818 && var9.field3826 != null) {
                                    class90 var66 = new class90();
                                    var66.field1088 = var9;
                                    var66.field1087 = var9.field3826;
                                    field707.method6526(var66);
                                }
                                if (field711 > var9.field3818 && var9.field3793 != null) {
                                    class90 var67 = new class90();
                                    var67.field1088 = var9;
                                    var67.field1087 = var9.field3793;
                                    field707.method6526(var67);
                                }
                                if (field643 > var9.field3818 && var9.field3794 != null) {
                                    class90 var68 = new class90();
                                    var68.field1088 = var9;
                                    var68.field1087 = var9.field3794;
                                    field707.method6526(var68);
                                }
                                if (field518 > var9.field3818 && var9.field3795 != null) {
                                    class90 var69 = new class90();
                                    var69.field1088 = var9;
                                    var69.field1087 = var9.field3795;
                                    field707.method6526(var69);
                                }
                                if (field728 > var9.field3818 && var9.field3800 != null) {
                                    class90 var70 = new class90();
                                    var70.field1088 = var9;
                                    var70.field1087 = var9.field3800;
                                    field707.method6526(var70);
                                }
                                if (field745 > var9.field3818 && var9.field3709 != null) {
                                    class90 var71 = new class90();
                                    var71.field1088 = var9;
                                    var71.field1087 = var9.field3709;
                                    field707.method6526(var71);
                                }
                                if (field730 > var9.field3818 && var9.field3796 != null) {
                                    class90 var72 = new class90();
                                    var72.field1088 = var9;
                                    var72.field1087 = var9.field3796;
                                    field707.method6526(var72);
                                }
                                var9.field3818 = field665;
                                if (var9.field3789 != null) {
                                    for (int var73 = 0; var73 < field758; var73++) {
                                        class90 var74 = new class90();
                                        var74.field1088 = var9;
                                        var74.field1080 = field760[var73];
                                        var74.field1085 = field662[var73];
                                        var74.field1087 = var9.field3789;
                                        field707.method6526(var74);
                                    }
                                }
                                if (var9.field3790 != null) {
                                    int[] var75 = field756.method3941();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class90 var77 = new class90();
                                        var77.field1088 = var9;
                                        var77.field1080 = var75[var76];
                                        var77.field1087 = var9.field3790;
                                        field707.method6526(var77);
                                    }
                                }
                                if (var9.field3791 != null) {
                                    int[] var78 = field756.method3935();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class90 var80 = new class90();
                                        var80.field1088 = var9;
                                        var80.field1080 = var78[var79];
                                        var80.field1087 = var9.field3791;
                                        field707.method6526(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3675) {
                            if (field702 != null || field666) {
                                continue;
                            }
                            if ((var9.field3698 >= 0 || var9.field3806 != 0) && class36.field235 >= var19 && class36.field241 >= var20 && class36.field235 < var21 && class36.field241 < var22) {
                                if (var9.field3698 >= 0) {
                                    Statics.field493 = arg0[var9.field3698];
                                } else {
                                    Statics.field493 = var9;
                                }
                            }
                            if (var9.field3679 == 8 && class36.field235 >= var19 && class36.field241 >= var20 && class36.field235 < var21 && class36.field241 < var22) {
                                Statics.field4375 = var9;
                            }
                            if (var9.field3776 > var9.field3693) {
                                method5303(var9, var9.field3692 + var11, var12, var9.field3693, var9.field3776, class36.field235, class36.field241);
                            }
                        }
                        if (var9.field3679 == 0) {
                            method2606(arg0, var9.field3676, var19, var20, var21, var22, var11 - var9.field3713, var12 - var9.field3699);
                            if (var9.field3815 != null) {
                                method2606(var9.field3815, var9.field3676, var19, var20, var21, var22, var11 - var9.field3713, var12 - var9.field3699);
                            }
                            class89 var81 = (class89) field691.method8104((long) var9.field3676);
                            if (var81 != null) {
                                if (var81.field1073 == 0 && class36.field235 >= var19 && class36.field241 >= var20 && class36.field235 < var21 && class36.field241 < var22 && !field666) {
                                    for (class90 var82 = (class90) field707.method6532(); var82 != null; var82 = (class90) field707.method6543()) {
                                        if (var82.field1078) {
                                            var82.method7776();
                                            var82.field1088.field3816 = false;
                                        }
                                    }
                                    if (Statics.field4688 == 0) {
                                        field702 = null;
                                        field703 = null;
                                    }
                                    if (!field666) {
                                        method6186();
                                    }
                                }
                                method8182(var81.field1076, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fh.mu(II)Z")
    public static boolean method2875(int arg0) {
        for (int var1 = 0; var1 < field758; var1++) {
            if (field760[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("cx.mq(III)V")
    public static final void method1976(int arg0, int arg1) {
        if (Statics.field185.method5641(arg0)) {
            method5305(Statics.field185.field3588[arg0], arg1);
        }
    }

    @ObfuscatedName("ln.mh([Lnm;IB)V")
    public static final void method5305(class347[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class347 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3679 == 0) {
                    if (var3.field3815 != null) {
                        method5305(var3.field3815, arg1);
                    }
                    class89 var4 = (class89) field691.method8104((long) var3.field3676);
                    if (var4 != null) {
                        method1976(var4.field1076, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3797 != null) {
                    class90 var5 = new class90();
                    var5.field1088 = var3;
                    var5.field1087 = var3.field3797;
                    class72.method2004(var5);
                }
                if (arg1 == 1 && var3.field3718 != null) {
                    if (var3.field3757 >= 0) {
                        class347 var6 = Statics.field185.method5639(var3.field3676);
                        if (var6 == null || var6.field3815 == null || var3.field3757 >= var6.field3815.length || var6.field3815[var3.field3757] != var3) {
                            continue;
                        }
                    }
                    class90 var7 = new class90();
                    var7.field1088 = var3;
                    var7.field1087 = var3.field3718;
                    class72.method2004(var7);
                }
            }
        }
    }

    @ObfuscatedName("gw.ml(Lnm;III)V")
    public static final void method3230(class347 arg0, int arg1, int arg2) {
        if (field702 != null || field666 || arg0 == null || method5124(arg0) == null) {
            return;
        }
        field702 = arg0;
        field703 = method5124(arg0);
        field704 = arg1;
        field524 = arg2;
        Statics.field4688 = 0;
        field713 = false;
        int var3 = method2593();
        if (var3 == -1) {
            return;
        }
        Statics.field1569 = new class76();
        Statics.field1569.field918 = field759[var3];
        Statics.field1569.field919 = field669[var3];
        Statics.field1569.field916 = field670[var3];
        Statics.field1569.field917 = field671[var3];
        Statics.field1569.field921 = field672[var3];
        Statics.field1569.field914 = field673[var3];
        Statics.field1569.field915 = field674[var3];
    }

    @ObfuscatedName("client.mn(I)V")
    public final void method1199() {
        method2979(field702);
        Statics.field4688++;
        if (field686 && field648) {
            int var1 = class36.field235;
            int var2 = class36.field241;
            int var3 = var1 - field704;
            int var4 = var2 - field524;
            if (var3 < field751) {
                var3 = field751;
            }
            if (field702.field3692 + var3 > field751 + field703.field3692) {
                var3 = field751 + field703.field3692 - field702.field3692;
            }
            if (var4 < field749) {
                var4 = field749;
            }
            if (field702.field3693 + var4 > field749 + field703.field3693) {
                var4 = field749 + field703.field3693 - field702.field3693;
            }
            int var5 = var3 - field555;
            int var6 = var4 - field712;
            int var7 = field702.field3760;
            if (Statics.field4688 > field702.field3712 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field713 = true;
            }
            int var8 = field703.field3713 + (var3 - field751);
            int var9 = field703.field3699 + (var4 - field749);
            if (field702.field3774 != null && field713) {
                class90 var10 = new class90();
                var10.field1088 = field702;
                var10.field1081 = var8;
                var10.field1086 = var9;
                var10.field1087 = field702.field3774;
                class72.method2004(var10);
            }
            if (class36.field234 == 0) {
                if (field713) {
                    if (field702.field3710 != null) {
                        class90 var11 = new class90();
                        var11.field1088 = field702;
                        var11.field1081 = var8;
                        var11.field1086 = var9;
                        var11.field1083 = field706;
                        var11.field1087 = field702.field3710;
                        class72.method2004(var11);
                    }
                    if (field706 != null && method3574(field702) != null) {
                        class311 var12 = class311.method2978(class309.field3221, field579.field1425);
                        var12.field3250.method8418(field702.field3676);
                        var12.field3250.method8349(field706.field3757);
                        var12.field3250.method8349(field702.field3757);
                        var12.field3250.method8351(field706.field3676);
                        var12.field3250.method8405(field702.field3756);
                        var12.field3250.method8349(field706.field3756);
                        field579.method2682(var12);
                    }
                } else if (this.method1297()) {
                    this.method1192(field704 + field555, field712 + field524);
                } else if (field667 > 0) {
                    method3588(field704 + field555, field712 + field524);
                }
                field702 = null;
            }
        } else if (Statics.field4688 > 1) {
            if (!field713 && field667 > 0) {
                method3588(field704 + field555, field712 + field524);
            }
            field702 = null;
        }
    }

    @ObfuscatedName("is.mk(III)V")
    public static void method3588(int arg0, int arg1) {
        method153(Statics.field1569, arg0, arg1);
        Statics.field1569 = null;
    }

    @ObfuscatedName("fv.ms(Lnm;I)V")
    public static void method2979(class347 arg0) {
        if (arg0 != null && field739 == arg0.field3823) {
            field740[arg0.field3822] = true;
        }
    }

    @ObfuscatedName("lp.me(I)V")
    public static void method5301() {
        for (class89 var0 = (class89) field691.method8091(); var0 != null; var0 = (class89) field691.method8092()) {
            int var1 = var0.field1076;
            if (Statics.field185.method5641(var1)) {
                boolean var2 = true;
                class347[] var3 = Statics.field185.field3588[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3675;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4857;
                    class347 var6 = Statics.field185.method5639(var5);
                    if (var6 != null) {
                        method2979(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("kp.mv(Lnm;I)Lnm;")
    public static class347 method5124(class347 arg0) {
        class347 var1 = method3574(arg0);
        if (var1 == null) {
            var1 = arg0.field3719;
        }
        return var1;
    }

    @ObfuscatedName("nj.my(II)V")
    public static final void method6175(int arg0) {
        if (!Statics.field185.method5641(arg0)) {
            return;
        }
        class347[] var1 = Statics.field185.field3588[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class347 var3 = var1[var2];
            if (var3 != null) {
                var3.field3813 = 0;
                var3.field3814 = 0;
            }
        }
    }

    @ObfuscatedName("gh.mb(II)V")
    public static final void method3270(int arg0) {
        if (Statics.field185.method5641(arg0)) {
            method3232(Statics.field185.field3588[arg0], -1);
        }
    }

    @ObfuscatedName("gs.mp([Lnm;II)V")
    public static final void method3232(class347[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class347 var3 = arg0[var2];
            if (var3 != null && var3.field3696 == arg1 && (!var3.field3675 || !method3957(var3))) {
                if (var3.field3679 == 0) {
                    if (!var3.field3675 && method3957(var3) && Statics.field493 != var3) {
                        continue;
                    }
                    method3232(arg0, var3.field3676);
                    if (var3.field3815 != null) {
                        method3232(var3.field3815, var3.field3676);
                    }
                    class89 var4 = (class89) field691.method8104((long) var3.field3676);
                    if (var4 != null) {
                        method3270(var4.field1076);
                    }
                }
                if (var3.field3679 == 6) {
                    if (var3.field3764 != -1 || var3.field3726 != -1) {
                        boolean var5 = method2779(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3726;
                        } else {
                            var6 = var3.field3764;
                        }
                        if (var6 != -1) {
                            class223 var7 = class223.method687(var6);
                            if (var7.method3851()) {
                                var3.field3813 += field710;
                                int var8 = var7.method3860();
                                if (var3.field3813 >= var8) {
                                    var3.field3813 -= var7.field2330;
                                    if (var3.field3813 < 0 || var3.field3813 >= var8) {
                                        var3.field3813 = 0;
                                    }
                                }
                                method2979(var3);
                            } else {
                                var3.field3814 += field710;
                                while (var3.field3814 > var7.field2313[var3.field3813]) {
                                    var3.field3814 -= var7.field2313[var3.field3813];
                                    var3.field3813++;
                                    if (var3.field3813 >= var7.field2326.length) {
                                        var3.field3813 -= var7.field2330;
                                        if (var3.field3813 < 0 || var3.field3813 >= var7.field2326.length) {
                                            var3.field3813 = 0;
                                        }
                                    }
                                    method2979(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3734 != 0 && !var3.field3675) {
                        int var9 = var3.field3734 >> 16;
                        int var10 = var3.field3734 << 16 >> 16;
                        int var11 = field710 * var9;
                        int var12 = field710 * var10;
                        var3.field3729 = var3.field3729 + var11 & 0x7FF;
                        var3.field3674 = var3.field3674 + var12 & 0x7FF;
                        method2979(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("tc.md(II)V")
    public static final void method8047(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method3253((double) var3);
    }

    @ObfuscatedName("jv.mo(I)I")
    public static final int method4478() {
        float var0 = 200.0F * ((float) Statics.field1106.method2397() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("gv.mg(D)V")
    public static final void method3253(double arg0) {
        class241.method4152(arg0);
        ((class251) class241.field2551.field2837).method4502(arg0);
        class221.field2271.method5288();
        Statics.field1106.method2390(arg0);
    }

    @ObfuscatedName("gv.nt(IS)V")
    public static final void method3260(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field1106.method2399()) {
            return;
        }
        if (Statics.field1106.method2399() == 0 && class320.method1121()) {
            class320.method3372(Statics.field2393, var1);
            field772 = false;
        } else if (var1 == 0) {
            class320.method3819(0, 0);
            field772 = false;
        } else if (!class320.field3434.isEmpty()) {
            Iterator var2 = class320.field3434.iterator();
            while (var2.hasNext()) {
                class332 var3 = (class332) var2.next();
                if (var3 != null) {
                    var3.field3542 = var1;
                }
            }
            class332 var4 = (class332) class320.field3434.get(0);
            if (var4 != null && var4.field3539 != null && var4.field3539.method5418() && !var4.field3547) {
                var4.field3539.method5411(var1);
                var4.field3543 = (float) var1;
            }
        }
        Statics.field1106.method2398(var1);
    }

    @ObfuscatedName("io.nx(II)V")
    public static final void method3831(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1106.method2476(var1);
    }

    @ObfuscatedName("hc.nv(II)V")
    public static final void method3431(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1106.method2402(var1);
    }

    @ObfuscatedName("dl.nd(II)V")
    public static final void method2224(int arg0) {
        method5301();
        class71.method5308();
        int var1 = class193.method2997(arg0).field1927;
        if (var1 == 0) {
            return;
        }
        int var2 = class336.field3568[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method3253(0.9D);
            }
            if (var2 == 2) {
                method3253(0.8D);
            }
            if (var2 == 3) {
                method3253(0.7D);
            }
            if (var2 == 4) {
                method3253(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method3260(255);
            }
            if (var2 == 1) {
                method3260(192);
            }
            if (var2 == 2) {
                method3260(128);
            }
            if (var2 == 3) {
                method3260(64);
            }
            if (var2 == 4) {
                method3260(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method3831(127);
            }
            if (var2 == 1) {
                method3831(96);
            }
            if (var2 == 2) {
                method3831(64);
            }
            if (var2 == 3) {
                method3831(32);
            }
            if (var2 == 4) {
                method3831(0);
            }
        }
        if (var1 == 5) {
            field746 = var2 == 1;
        }
        if (var1 == 6) {
            field694 = var2;
        }
        if (var1 == 9) {
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method3431(127);
            }
            if (var2 == 1) {
                method3431(96);
            }
            if (var2 == 2) {
                method3431(64);
            }
            if (var2 == 3) {
                method3431(32);
            }
            if (var2 == 4) {
                method3431(0);
            }
        }
        if (var1 == 17) {
            field699 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field695 = (class106) class388.method3894(class106.method2488(), var2);
            if (field695 == null) {
                field695 = class106.field1350;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field657 = -1;
            } else {
                field657 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field804 = (class106) class388.method3894(class106.method2488(), var2);
            if (field804 == null) {
                field804 = class106.field1350;
            }
        }
    }

    @ObfuscatedName("ar.no(Lnm;I)V")
    public static final void method37(class347 arg0) {
        int var1 = arg0.field3681;
        if (var1 == 324) {
            if (field806 == -1) {
                field806 = arg0.field3809;
                field807 = arg0.field3724;
            }
            if (field805.field3612 == 1) {
                arg0.field3809 = field806;
            } else {
                arg0.field3809 = field807;
            }
        } else if (var1 == 325) {
            if (field806 == -1) {
                field806 = arg0.field3809;
                field807 = arg0.field3724;
            }
            if (field805.field3612 == 1) {
                arg0.field3809 = field807;
            } else {
                arg0.field3809 = field806;
            }
        } else if (var1 == 327) {
            arg0.field3729 = 150;
            arg0.field3674 = (int) (Math.sin((double) field533 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3721 = 5;
            arg0.field3672 = 0;
        } else if (var1 == 328) {
            arg0.field3729 = 150;
            arg0.field3674 = (int) (Math.sin((double) field533 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3721 = 5;
            arg0.field3672 = 1;
        }
    }

    @ObfuscatedName("cm.ni(B)V")
    public static final void method1167() {
        class311 var0 = class311.method2978(class309.field3169, field579.field1425);
        field579.method2682(var0);
        class72.field884 = true;
        for (class89 var1 = (class89) field691.method8091(); var1 != null; var1 = (class89) field691.method8092()) {
            if (var1.field1073 == 0 || var1.field1073 == 3) {
                method7505(var1, true);
            }
        }
        if (field624 != null) {
            method2979(field624);
            field624 = null;
        }
        class72.field884 = false;
    }

    @ObfuscatedName("rw.nb(Lde;ZI)V")
    public static final void method7505(class89 arg0, boolean arg1) {
        int var2 = arg0.field1076;
        int var3 = (int) arg0.field4857;
        arg0.method7776();
        if (arg1) {
            Statics.field185.method5642(var2);
        }
        method6423(var2);
        class347 var4 = Statics.field185.method5639(var3);
        if (var4 != null) {
            method2979(var4);
        }
        if (field797 != -1) {
            method1976(field797, 1);
        }
    }

    @ObfuscatedName("ht.nm(Lnm;B)Z")
    public static final boolean method3456(class347 arg0) {
        int var1 = arg0.field3681;
        if (var1 == 205) {
            field585 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field805.method5668(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field805.method5669(var4, var5 == 1);
        }
        if (var1 == 324) {
            field805.method5664(0);
        }
        if (var1 == 325) {
            field805.method5664(1);
        }
        if (var1 == 326) {
            class311 var6 = class311.method2978(class309.field3141, field579.field1425);
            field805.method5671(var6.field3250);
            field579.method2682(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("qs.nc(Lnm;IIII)V")
    public static final void method7215(class347 arg0, int arg1, int arg2, int arg3) {
        Statics.method5332();
        class335 var4 = arg0.method5993(Statics.field185, false);
        if (var4 == null) {
            return;
        }
        class540.method8694(arg1, arg2, var4.field3564 + arg1, var4.field3559 + arg2);
        if (field771 == 2 || field771 == 5) {
            class540.method8714(arg1, arg2, 0, var4.field3562, var4.field3561);
        } else {
            int var5 = field650 & 0x7FF;
            int var6 = Statics.field2696.field1227 / 32 + 48;
            int var7 = 464 - Statics.field2696.field1187 / 32;
            Statics.field3560.method8840(arg1, arg2, var4.field3564, var4.field3559, var6, var7, var5, 256, var4.field3562, var4.field3561);
            for (int var8 = 0; var8 < field600; var8++) {
                int var9 = field766[var8] * 4 + 2 - Statics.field2696.field1227 / 32;
                int var10 = field767[var8] * 4 + 2 - Statics.field2696.field1187 / 32;
                method2101(arg1, arg2, var9, var10, field768[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class393 var13 = field688[Statics.field1072][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2696.field1227 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2696.field1187 / 32;
                        method2101(arg1, arg2, var14, var15, Statics.field1337[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field668; var16++) {
                class103 var17 = field705[field581[var16]];
                if (var17 != null && var17.method2265()) {
                    class206 var18 = var17.field1328;
                    if (var18 != null && var18.field2043 != null) {
                        var18 = var18.method3500();
                    }
                    if (var18 != null && var18.field2073 && var18.field2059) {
                        int var19 = var17.field1227 / 32 - Statics.field2696.field1227 / 32;
                        int var20 = var17.field1187 / 32 - Statics.field2696.field1187 / 32;
                        method2101(arg1, arg2, var19, var20, Statics.field1337[1], var4);
                    }
                }
            }
            int var21 = class110.field1375;
            int[] var22 = class110.field1376;
            for (int var23 = 0; var23 < var21; var23++) {
                class94 var24 = field726[var22[var23]];
                if (var24 != null && var24.method2265() && !var24.field1139 && Statics.field2696 != var24) {
                    int var25 = var24.field1227 / 32 - Statics.field2696.field1227 / 32;
                    int var26 = var24.field1187 / 32 - Statics.field2696.field1187 / 32;
                    if (var24.method2252()) {
                        method2101(arg1, arg2, var25, var26, Statics.field1337[3], var4);
                    } else if (Statics.field2696.field1138 != 0 && var24.field1138 != 0 && Statics.field2696.field1138 == var24.field1138) {
                        method2101(arg1, arg2, var25, var26, Statics.field1337[4], var4);
                    } else if (var24.method2255()) {
                        method2101(arg1, arg2, var25, var26, Statics.field1337[5], var4);
                    } else if (var24.method2288()) {
                        method2101(arg1, arg2, var25, var26, Statics.field1337[6], var4);
                    } else {
                        method2101(arg1, arg2, var25, var26, Statics.field1337[2], var4);
                    }
                }
            }
            if (field540 != 0 && field533 % 20 < 10) {
                if (field540 == 1 && field541 >= 0 && field541 < field705.length) {
                    class103 var27 = field705[field541];
                    if (var27 != null) {
                        int var28 = var27.field1227 / 32 - Statics.field2696.field1227 / 32;
                        int var29 = var27.field1187 / 32 - Statics.field2696.field1187 / 32;
                        method6506(arg1, arg2, var28, var29, Statics.field344[1], var4);
                    }
                }
                if (field540 == 2) {
                    int var30 = field584 * 4 - Statics.field108 * 4 + 2 - Statics.field2696.field1227 / 32;
                    int var31 = field544 * 4 - Statics.field103 * 4 + 2 - Statics.field2696.field1187 / 32;
                    method6506(arg1, arg2, var30, var31, Statics.field344[1], var4);
                }
                if (field540 == 10 && field542 >= 0 && field542 < field726.length) {
                    class94 var32 = field726[field542];
                    if (var32 != null) {
                        int var33 = var32.field1227 / 32 - Statics.field2696.field1227 / 32;
                        int var34 = var32.field1187 / 32 - Statics.field2696.field1187 / 32;
                        method6506(arg1, arg2, var33, var34, Statics.field344[1], var4);
                    }
                }
            }
            if (field527 != 0) {
                int var35 = field527 * 4 + 2 - Statics.field2696.field1227 / 32;
                int var36 = field770 * 4 + 2 - Statics.field2696.field1187 / 32;
                method2101(arg1, arg2, var35, var36, Statics.field344[0], var4);
            }
            if (!Statics.field2696.field1139) {
                class540.method8758(var4.field3564 / 2 + arg1 - 1, var4.field3559 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field736[arg3] = true;
    }

    @ObfuscatedName("ef.ns(Lnm;IIIB)V")
    public static final void method2811(class347 arg0, int arg1, int arg2, int arg3) {
        class335 var4 = arg0.method5993(Statics.field185, false);
        if (var4 == null) {
            return;
        }
        if (field771 < 3) {
            Statics.field4491.method8840(arg1, arg2, var4.field3564, var4.field3559, 25, 25, field650, 256, var4.field3562, var4.field3561);
        } else {
            class540.method8714(arg1, arg2, 0, var4.field3562, var4.field3561);
        }
    }

    @ObfuscatedName("oa.nk(IIIILud;Lmp;B)V")
    public static final void method6506(int arg0, int arg1, int arg2, int arg3, class544 arg4, class335 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2101(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field650 & 0x7FF;
        int var8 = class241.field2553[var7];
        int var9 = class241.field2554[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3564 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field2156.method8829(arg5.field3564 / 2 + arg0 - var17 / 2 + var15, arg5.field3559 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("dm.nn(IIIILud;Lmp;B)V")
    public static final void method2101(int arg0, int arg1, int arg2, int arg3, class544 arg4, class335 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field650 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class241.field2553[var6];
        int var9 = class241.field2554[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8839(arg5.field3564 / 2 + var10 - arg4.field5234 / 2, arg5.field3559 / 2 - var11 - arg4.field5240 / 2, arg0, arg1, arg5.field3564, arg5.field3559, arg5.field3562, arg5.field3561);
        } else {
            arg4.method8823(arg5.field3564 / 2 + arg0 + var10 - arg4.field5234 / 2, arg5.field3559 / 2 + arg1 - var11 - arg4.field5240 / 2);
        }
    }

    @ObfuscatedName("hr.na(I)V")
    public static final void method3527() {
        for (int var0 = 0; var0 < class110.field1375; var0++) {
            class94 var1 = field726[class110.field1376[var0]];
            var1.method2253();
        }
        Iterator var2 = class113.field1418.iterator();
        while (var2.hasNext()) {
            class66 var3 = (class66) var2.next();
            var3.method1127();
        }
        if (Statics.field3897 != null) {
            Statics.field3897.method7279();
        }
    }

    @ObfuscatedName("sc.nh(B)V")
    public static final void method7817() {
        Iterator var0 = class113.field1418.iterator();
        while (var0.hasNext()) {
            class66 var1 = (class66) var0.next();
            var1.method1132();
        }
        if (Statics.field3897 != null) {
            Statics.field3897.method7280();
        }
    }

    @ObfuscatedName("ea.nw(I)V")
    public static final void method2787() {
        field711 = field665;
        Statics.field1888 = true;
    }

    @ObfuscatedName("gr.ny(I)V")
    public static final void method3216() {
        field643 = field665;
        Statics.field308 = true;
    }

    @ObfuscatedName("as.nl(Ljava/lang/String;B)V")
    public static final void method172(String arg0) {
        if (Statics.field3897 != null) {
            class311 var1 = class311.method2978(class309.field3197, field579.field1425);
            var1.field3250.method8348(class530.method7740(arg0));
            var1.field3250.method8374(arg0);
            field579.method2682(var1);
        }
    }

    @ObfuscatedName("iu.nu(Ljava/lang/String;I)V")
    public static final void method3621(String arg0) {
        if (!arg0.equals("")) {
            class311 var1 = class311.method2978(class309.field3234, field579.field1425);
            var1.field3250.method8348(class530.method7740(arg0));
            var1.field3250.method8374(arg0);
            field579.method2682(var1);
        }
    }

    @ObfuscatedName("kw.nj(B)V")
    public static final void method5131() {
        class311 var0 = class311.method2978(class309.field3234, field579.field1425);
        var0.field3250.method8348(0);
        field579.method2682(var0);
    }

    @ObfuscatedName("rw.nr(III)V")
    public static final void method7506(int arg0, int arg1) {
        class166 var2 = arg0 >= 0 ? field763[arg0] : Statics.field1659;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3120()) {
            return;
        }
        class148 var3 = (class148) var2.field1772.get(arg1);
        if (var3.field1657 != -1) {
            return;
        }
        String var4 = var3.field1660.method8985();
        class311 var5 = class311.method2978(class309.field3192, field579.field1425);
        var5.field3250.method8348(3 + class530.method7740(var4));
        var5.field3250.method8348(arg0);
        var5.field3250.method8349(arg1);
        var5.field3250.method8374(var4);
        field579.method2682(var5);
    }

    @ObfuscatedName("dt.nq(IIZI)V")
    public static final void method2344(int arg0, int arg1, boolean arg2) {
        if (field763[arg0] == null || arg1 < 0 || arg1 >= field763[arg0].method3120()) {
            return;
        }
        class148 var3 = (class148) field763[arg0].field1772.get(arg1);
        class311 var4 = class311.method2978(class309.field3142, field579.field1425);
        var4.field3250.method8348(4 + class530.method7740(var3.field1660.method8985()));
        var4.field3250.method8348(arg0);
        var4.field3250.method8349(arg1);
        var4.field3250.method8354(arg2);
        var4.field3250.method8374(var3.field1660.method8985());
        field579.method2682(var4);
    }

    @ObfuscatedName("op.ng(II)V")
    public static void method6423(int arg0) {
        for (class487 var1 = (class487) field737.method8091(); var1 != null; var1 = (class487) field737.method8092()) {
            if ((long) arg0 == (var1.field4857 >> 48 & 0xFFFFL)) {
                var1.method7776();
            }
        }
    }

    @ObfuscatedName("dp.np(Lnm;I)I")
    public static int method2234(class347 arg0) {
        class487 var1 = (class487) field737.method8104(((long) arg0.field3676 << 32) + (long) arg0.field3757);
        return var1 == null ? arg0.field3751 : var1.field4855;
    }

    @ObfuscatedName("in.nf(Lnm;I)Lnm;")
    public static class347 method3574(class347 arg0) {
        int var1 = method2234(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = Statics.field185.method5639(arg0.field3696);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ih.oh(Lnm;I)Z")
    public static boolean method3957(class347 arg0) {
        return arg0.field3697;
    }

    @ObfuscatedName("ip.of(Lnm;IB)Ljava/lang/String;")
    public static String method4022(class347 arg0, int arg1) {
        int var2 = method2234(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field3785 == null) {
            return null;
        } else if (arg0.field3759 == null || arg0.field3759.length <= arg1 || arg0.field3759[arg1] == null || arg0.field3759[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3759[arg1];
        }
    }

    @ObfuscatedName("fx.oq(Lnm;I)Ljava/lang/String;")
    public static String method3016(class347 arg0) {
        if (Statics.method3398(method2234(arg0)) == 0) {
            return null;
        } else if (arg0.field3772 == null || arg0.field3772.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3772;
        }
    }

    @ObfuscatedName("dl.os(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2216(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field529 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field529 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field529 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field529 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field529 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1996 != null) {
            var3 = "/p=" + Statics.field1996;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field2910 + "/a=" + Statics.field2917 + var3 + "/";
    }

    @ObfuscatedName("cv.ol(Ljava/lang/String;S)V")
    public static void method1757(String arg0) {
        Statics.field1996 = arg0;
        try {
            String var1 = Statics.field1743.getParameter(Integer.toString(18));
            String var2 = Statics.field1743.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class316.method6401() + 94608000000L;
                class352.field3841.setTime(new Date(var6));
                int var8 = class352.field3841.get(7);
                int var9 = class352.field3841.get(5);
                int var10 = class352.field3841.get(2);
                int var11 = class352.field3841.get(1);
                int var12 = class352.field3841.get(11);
                int var13 = class352.field3841.get(12);
                int var14 = class352.field3841.get(13);
                String var15 = class352.field3844[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class352.field3842[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field1743;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("ga.oe(Ljava/lang/String;ZI)V")
    public static void method3267(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field3066; var5++) {
            class221 var6 = class221.method3594(var5);
            if ((!arg1 || var6.field2295) && var6.field2291 == -1 && var6.field2251.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field325 = -1;
                    Statics.field1602 = null;
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
        Statics.field1602 = var3;
        Statics.field3414 = 0;
        Statics.field325 = var4;
        String[] var9 = new String[Statics.field325];
        for (int var10 = 0; var10 < Statics.field325; var10++) {
            var9[var10] = class221.method3594(var3[var10]).field2251;
        }
        class525.method4781(var9, Statics.field1602);
    }

    @ObfuscatedName("ko.ob([BII)V")
    public static void method4795(byte[] arg0, int arg1) {
        if (field821 == null) {
            field821 = new byte[24];
        }
        class425.method7084(arg0, arg1, field821, 0, 24);
    }

    @ObfuscatedName("dc.ok(Lul;II)V")
    public static void method2522(class530 arg0, int arg1) {
        method4795(arg0.field5139, arg1);
        class176.method2501(arg0, arg1);
    }

    @ObfuscatedName("client.ou(I)Lvf;")
    public class553 method1540() {
        return Statics.field2696 == null ? null : Statics.field2696.field1136;
    }

    @ObfuscatedName("dh.om(B)Z")
    public static boolean method2247() {
        return field776 >= 2;
    }

    @ObfuscatedName("qj.ox(I)V")
    public static void method7121() {
        field579.method2682(class311.method2978(class309.field3217, field579.field1425));
        field611 = 0;
    }

    @ObfuscatedName("gs.oc(I)V")
    public static void method3233() {
        if (field611 == 1) {
            field619 = true;
        }
    }

    @ObfuscatedName("de.oz(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method2213(String arg0) {
        class369[] var1 = class369.method3287();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class369 var3 = var1[var2];
            if (var3.field4284 != -1 && arg0.startsWith(class104.method7216(var3.field4284))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4284).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("dz.oy(I)V")
    public static void method2186() {
        if (Statics.field2872 == null) {
            return;
        }
        field815 = field533;
        Statics.field2872.method6472();
        for (int var0 = 0; var0 < field726.length; var0++) {
            if (field726[var0] != null) {
                Statics.field2872.method6471((field726[var0].field1227 >> 7) + Statics.field108, (field726[var0].field1187 >> 7) + Statics.field103);
            }
        }
    }

    @ObfuscatedName("jh.op(I)V")
    public static void method4148() {
        Statics.field1106.method2406(field718);
    }

    @ObfuscatedName("pp.ov(IB)V")
    public static void method6888(int arg0) {
        if (field732 != arg0) {
            field732 = arg0;
        }
    }

    @ObfuscatedName("me.od(ZI)V")
    public static void method5605(boolean arg0) {
        field746 = arg0;
    }

    @ObfuscatedName("bl.og(IB)Luq;")
    public static class522 method835(int arg0) {
        class522 var1 = (class522) field812.method5286((long) arg0);
        if (var1 == null) {
            var1 = new class522(Statics.field3397, class524.method6324(arg0), class524.method3579(arg0));
            field812.method5289(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("ij.oj(II)Luq;")
    public static class522 method3895(int arg0) {
        class522 var1 = (class522) field690.method5286((long) arg0);
        if (var1 == null) {
            var1 = new class522(Statics.field3397, arg0);
        }
        return var1;
    }

    @ObfuscatedName("rf.ow(II)V")
    public static void method7554(int arg0) {
        class223 var1 = class223.method687(arg0);
        if (!var1.method3851()) {
            return;
        }
        int var2 = var1.field2322;
        class140 var3 = (class140) class223.field2321.method5286((long) var2);
        class140 var4;
        if (var3 == null) {
            class374 var5 = Statics.field2316;
            class374 var6 = Statics.field2318;
            boolean var7 = true;
            byte[] var8 = var5.method6312(var2 >> 16 & 0xFFFF, var2 & 0xFFFF);
            class140 var10;
            if (var8 == null) {
                boolean var9 = false;
                var10 = null;
            } else {
                int var11 = (var8[1] & 0xFF) << 8 | var8[2] & 0xFF;
                byte[] var12 = var6.method6312(var11, 0);
                if (var12 == null) {
                    var7 = false;
                }
                if (var7) {
                    if (Statics.field334 == null) {
                        Statics.field3511 = Runtime.getRuntime().availableProcessors();
                        Statics.field334 = new ThreadPoolExecutor(0, Statics.field3511, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field3511 * 100 + 100), new class74());
                    }
                    try {
                        var10 = new class140(var5, var6, var2, false);
                    } catch (Exception var17) {
                        var10 = null;
                    }
                } else {
                    var10 = null;
                }
            }
            if (var10 != null) {
                class223.field2321.method5289(var10, (long) var2);
            }
            var4 = var10;
        } else {
            var4 = var3;
        }
        int var16;
        if (var4 == null) {
            var16 = 2;
        } else {
            var16 = var4.method2938() ? 0 : 1;
        }
        if (var16 == 2) {
            field816.add(var1.field2322);
        }
    }

    @ObfuscatedName("ay.oi(B)Loo;")
    public static class375 method158() {
        return Statics.field453;
    }

    @ObfuscatedName("client.on(IB)V")
    public void method1418(int arg0) {
        if (field528 >= 216) {
            class311 var2 = class311.method2978(class309.field3137, field579.field1425);
            var2.field3250.method8348(arg0);
            field579.method2682(var2);
        }
    }

    @ObfuscatedName("client.ot(II)V")
    public void method1202(int arg0) {
        if (field528 >= 216) {
            class311 var2 = class311.method2978(class309.field3176, field579.field1425);
            var2.field3250.method8348(arg0);
            field579.method2682(var2);
        }
    }
}

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

public final class client extends class35 implements class468, OAuthApi, class341 {

    @ObfuscatedName("client.bc")
    public static boolean field532 = true;

    @ObfuscatedName("client.cn")
    public static int field516 = 1;

    @ObfuscatedName("client.ch")
    public static int field517 = 0;

    @ObfuscatedName("client.cu")
    public static int field518 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field640 = false;

    @ObfuscatedName("client.ci")
    public static boolean field520 = false;

    @ObfuscatedName("client.ct")
    public static int field521 = -1;

    @ObfuscatedName("client.cq")
    public static int field522 = -1;

    @ObfuscatedName("client.cc")
    public static int field523 = -1;

    @ObfuscatedName("client.cz")
    public static boolean field524 = false;

    @ObfuscatedName("client.df")
    public static boolean field773;

    @ObfuscatedName("client.dv")
    public static boolean field613;

    @ObfuscatedName("client.dt")
    public static int field528;

    @ObfuscatedName("client.dk")
    public static boolean field529;

    @ObfuscatedName("client.dl")
    public static boolean field576;

    @ObfuscatedName("client.dj")
    public static boolean field574;

    @ObfuscatedName("client.do")
    public static int field609;

    @ObfuscatedName("client.dh")
    public static int field533;

    @ObfuscatedName("client.dm")
    public static long field798;

    @ObfuscatedName("client.di")
    public static int field649;

    @ObfuscatedName("client.da")
    public static int field536;

    @ObfuscatedName("client.dz")
    public static long field537;

    @ObfuscatedName("client.dg")
    public static boolean field538;

    @ObfuscatedName("client.dr")
    public static int field539;

    @ObfuscatedName("client.dy")
    public static int field540;

    @ObfuscatedName("client.ds")
    public static int field606;

    @ObfuscatedName("client.dn")
    public static int field542;

    @ObfuscatedName("client.du")
    public static int field543;

    @ObfuscatedName("client.dd")
    public static int field544;

    @ObfuscatedName("client.eg")
    public static int field545;

    @ObfuscatedName("client.ea")
    public static int field546;

    @ObfuscatedName("client.ez")
    public static int field754;

    @ObfuscatedName("client.ef")
    public static class109 field548;

    @ObfuscatedName("client.ew")
    public static class109 field549;

    @ObfuscatedName("client.ex")
    public static boolean field550;

    @ObfuscatedName("client.ek")
    public static class96 field604;

    @ObfuscatedName("client.er")
    public static int field531;

    @ObfuscatedName("client.ed")
    public static int field553;

    @ObfuscatedName("client.fi")
    public static int field554;

    @ObfuscatedName("client.fy")
    public static int field555;

    @ObfuscatedName("client.fz")
    public static int field556;

    @ObfuscatedName("client.fa")
    public static int field557;

    @ObfuscatedName("client.fl")
    public static class131 field558;

    @ObfuscatedName("client.ga")
    public static class556 field559;

    @ObfuscatedName("client.gz")
    public String field560;

    @ObfuscatedName("client.gm")
    public class15 field561;

    @ObfuscatedName("client.gc")
    public class19 field562;

    @ObfuscatedName("client.gw")
    public OtlTokenRequester field563;

    @ObfuscatedName("client.gr")
    public Future field564;

    @ObfuscatedName("client.gq")
    public boolean field565 = false;

    @ObfuscatedName("client.gv")
    public int field697 = 0;

    @ObfuscatedName("client.gi")
    public class19 field567;

    @ObfuscatedName("client.gk")
    public RefreshAccessTokenRequester field568;

    @ObfuscatedName("client.gh")
    public Future field569;

    @ObfuscatedName("client.gn")
    public static final String field756;

    @ObfuscatedName("client.gg")
    public static final String field571;

    @ObfuscatedName("client.hn")
    public static boolean field573;

    @ObfuscatedName("client.hb")
    public static class81 field740;

    @ObfuscatedName("client.hm")
    public static int[] field575;

    @ObfuscatedName("client.hz")
    public class551 field585;

    @ObfuscatedName("client.hu")
    public class8 field667;

    @ObfuscatedName("client.ht")
    public long field660 = -1L;

    @ObfuscatedName("client.hh")
    public static byte[] field579;

    @ObfuscatedName("client.hx")
    public static int field730;

    @ObfuscatedName("client.ho")
    public static int[] field581;

    @ObfuscatedName("client.ia")
    public static final class117 field582;

    @ObfuscatedName("client.ii")
    public static int field583;

    @ObfuscatedName("client.ij")
    public static boolean field541;

    @ObfuscatedName("client.ip")
    public static class455 field668;

    @ObfuscatedName("client.it")
    public static String field675;

    @ObfuscatedName("client.ik")
    public static HashMap field619;

    @ObfuscatedName("client.iu")
    public static int field605;

    @ObfuscatedName("client.iq")
    public static int field714;

    @ObfuscatedName("client.im")
    public static int field627;

    @ObfuscatedName("client.in")
    public static int field530;

    @ObfuscatedName("client.ic")
    public static int field591;

    @ObfuscatedName("client.jn")
    public static int[][][] field592;

    @ObfuscatedName("client.ju")
    public static class98 field593;

    @ObfuscatedName("client.jk")
    public static boolean field632;

    @ObfuscatedName("client.jz")
    public static int[][][] field595;

    @ObfuscatedName("client.jq")
    public static final int[] field596;

    @ObfuscatedName("client.jc")
    public static int field597;

    @ObfuscatedName("client.jl")
    public static class113 field718;

    @ObfuscatedName("client.jd")
    public static int field599;

    @ObfuscatedName("client.kx")
    public static int field600;

    @ObfuscatedName("client.ka")
    public static int field601;

    @ObfuscatedName("client.kf")
    public static int field602;

    @ObfuscatedName("client.ks")
    public static int field603;

    @ObfuscatedName("client.kt")
    public static boolean field588;

    @ObfuscatedName("client.kk")
    public static int field552;

    @ObfuscatedName("client.kq")
    public static int field781;

    @ObfuscatedName("client.ky")
    public static int field672;

    @ObfuscatedName("client.ld")
    public static int field709;

    @ObfuscatedName("client.lb")
    public static int field684;

    @ObfuscatedName("client.lu")
    public static int field771;

    @ObfuscatedName("client.lv")
    public static int field611;

    @ObfuscatedName("client.lz")
    public static int field612;

    @ObfuscatedName("client.ll")
    public static int field720;

    @ObfuscatedName("client.ln")
    public static int field614;

    @ObfuscatedName("client.lp")
    public static int field665;

    @ObfuscatedName("client.lc")
    public static int field631;

    @ObfuscatedName("client.lx")
    public static int field617;

    @ObfuscatedName("client.lr")
    public static int field623;

    @ObfuscatedName("client.lm")
    public static int field551;

    @ObfuscatedName("client.lw")
    public static boolean field620;

    @ObfuscatedName("client.ly")
    public static int field621;

    @ObfuscatedName("client.lg")
    public static boolean field622;

    @ObfuscatedName("client.lf")
    public static int field761;

    @ObfuscatedName("client.lh")
    public static int field624;

    @ObfuscatedName("client.lo")
    public static int field625;

    @ObfuscatedName("client.li")
    public static int[] field626;

    @ObfuscatedName("client.lt")
    public static int[] field752;

    @ObfuscatedName("client.lj")
    public static int[] field643;

    @ObfuscatedName("client.lk")
    public static int[] field629;

    @ObfuscatedName("client.mu")
    public static int[] field676;

    @ObfuscatedName("client.mo")
    public static int[] field735;

    @ObfuscatedName("client.mh")
    public static int[][] field646;

    @ObfuscatedName("client.md")
    public static int[] field633;

    @ObfuscatedName("client.ml")
    public static String[] field634;

    @ObfuscatedName("client.mc")
    public static int field635;

    @ObfuscatedName("client.mb")
    public static int field636;

    @ObfuscatedName("client.mg")
    public static int field637;

    @ObfuscatedName("client.mp")
    public static int field638;

    @ObfuscatedName("client.mn")
    public static int field639;

    @ObfuscatedName("client.mr")
    public static int field799;

    @ObfuscatedName("client.mz")
    public static int field641;

    @ObfuscatedName("client.mx")
    public static boolean field642;

    @ObfuscatedName("client.mq")
    public static int field729;

    @ObfuscatedName("client.mk")
    public static boolean field644;

    @ObfuscatedName("client.mf")
    public static int field652;

    @ObfuscatedName("client.mi")
    public static int field566;

    @ObfuscatedName("client.ma")
    public static long field647;

    @ObfuscatedName("client.mw")
    public static long field615;

    @ObfuscatedName("client.mv")
    public static String field598;

    @ObfuscatedName("client.mt")
    public static int field650;

    @ObfuscatedName("client.ne")
    public static boolean field651;

    @ObfuscatedName("client.np")
    public static int field584;

    @ObfuscatedName("client.ns")
    public static int field526;

    @ObfuscatedName("client.nv")
    public static int[] field654;

    @ObfuscatedName("client.nl")
    public static final int[] field655;

    @ObfuscatedName("client.no")
    public static String[] field656;

    @ObfuscatedName("client.nm")
    public static boolean[] field657;

    @ObfuscatedName("client.ni")
    public static int[] field658;

    @ObfuscatedName("client.na")
    public static int field784;

    @ObfuscatedName("client.ng")
    public static int[] field547;

    @ObfuscatedName("client.nx")
    public static int[] field661;

    @ObfuscatedName("client.nj")
    public static int[] field662;

    @ObfuscatedName("client.nd")
    public static int[] field663;

    @ObfuscatedName("client.nu")
    public static boolean field587;

    @ObfuscatedName("client.nr")
    public static boolean field813;

    @ObfuscatedName("client.nn")
    public static class570 field666;

    @ObfuscatedName("client.nf")
    public static boolean field535;

    @ObfuscatedName("client.nz")
    public static boolean field763;

    @ObfuscatedName("client.oc")
    public static boolean field669;

    @ObfuscatedName("client.ot")
    public static int field670;

    @ObfuscatedName("client.oe")
    public static int field671;

    @ObfuscatedName("client.oi")
    public static int field767;

    @ObfuscatedName("client.om")
    public static int field673;

    @ObfuscatedName("client.oa")
    public static int field674;

    @ObfuscatedName("client.od")
    public static boolean field768;

    @ObfuscatedName("client.oj")
    public static int field677;

    @ObfuscatedName("client.ob")
    public static int field678;

    @ObfuscatedName("client.ou")
    public static String field679;

    @ObfuscatedName("client.op")
    public static String field707;

    @ObfuscatedName("client.ok")
    public static int field681;

    @ObfuscatedName("client.ol")
    public static class524 field682;

    @ObfuscatedName("client.of")
    public static int field683;

    @ObfuscatedName("client.oy")
    public static int field630;

    @ObfuscatedName("client.on")
    public static int field785;

    @ObfuscatedName("client.po")
    public static class363 field686;

    @ObfuscatedName("client.py")
    public static int field687;

    @ObfuscatedName("client.pp")
    public static int field688;

    @ObfuscatedName("client.pe")
    public static int field689;

    @ObfuscatedName("client.pz")
    public static int field570;

    @ObfuscatedName("client.ph")
    public static boolean field691;

    @ObfuscatedName("client.pb")
    public static class363 field580;

    @ObfuscatedName("client.pd")
    public static class363 field693;

    @ObfuscatedName("client.pv")
    public static class363 field694;

    @ObfuscatedName("client.pj")
    public static int field695;

    @ObfuscatedName("client.pm")
    public static int field696;

    @ObfuscatedName("client.pn")
    public static class363 field804;

    @ObfuscatedName("client.pg")
    public static boolean field698;

    @ObfuscatedName("client.ps")
    public static int field577;

    @ObfuscatedName("client.pu")
    public static int field685;

    @ObfuscatedName("client.px")
    public static boolean field701;

    @ObfuscatedName("client.pc")
    public static int field702;

    @ObfuscatedName("client.pi")
    public static int field703;

    @ObfuscatedName("client.pl")
    public static boolean field659;

    @ObfuscatedName("client.pf")
    public static int field710;

    @ObfuscatedName("client.qt")
    public static int[] field653;

    @ObfuscatedName("client.qi")
    public static int field586;

    @ObfuscatedName("client.ql")
    public static int[] field708;

    @ObfuscatedName("client.qa")
    public static int field762;

    @ObfuscatedName("client.qj")
    public static int[] field817;

    @ObfuscatedName("client.qh")
    public static int field711;

    @ObfuscatedName("client.qy")
    public static int[] field712;

    @ObfuscatedName("client.qs")
    public static int field713;

    @ObfuscatedName("client.qr")
    public static int field699;

    @ObfuscatedName("client.qv")
    public static int field715;

    @ObfuscatedName("client.qd")
    public static int field716;

    @ObfuscatedName("client.qf")
    public static int field717;

    @ObfuscatedName("client.qx")
    public static int field616;

    @ObfuscatedName("client.qo")
    public static int field719;

    @ObfuscatedName("client.qp")
    public static int field648;

    @ObfuscatedName("client.qq")
    public static int field721;

    @ObfuscatedName("client.qe")
    public static int field722;

    @ObfuscatedName("client.qk")
    public static class569 field723;

    @ObfuscatedName("client.qw")
    public static class410 field724;

    @ObfuscatedName("client.qm")
    public static class410 field725;

    @ObfuscatedName("client.qb")
    public static class410 field726;

    @ObfuscatedName("client.rl")
    public static class410 field727;

    @ObfuscatedName("client.rh")
    public static class524 field589;

    @ObfuscatedName("client.rc")
    public static int field700;

    @ObfuscatedName("client.rj")
    public static int field594;

    @ObfuscatedName("client.ri")
    public static boolean[] field731;

    @ObfuscatedName("client.ru")
    public static boolean[] field732;

    @ObfuscatedName("client.ra")
    public static boolean[] field733;

    @ObfuscatedName("client.rq")
    public static int[] field734;

    @ObfuscatedName("client.rx")
    public static int[] field751;

    @ObfuscatedName("client.rv")
    public static int[] field736;

    @ObfuscatedName("client.rn")
    public static int[] field737;

    @ObfuscatedName("client.rs")
    public static int field738;

    @ObfuscatedName("client.ro")
    public static long field739;

    @ObfuscatedName("client.rw")
    public static boolean field527;

    @ObfuscatedName("client.rp")
    public static int field741;

    @ObfuscatedName("client.ry")
    public static int field742;

    @ObfuscatedName("client.rt")
    public static int[] field743;

    @ObfuscatedName("client.rz")
    public static int field744;

    @ObfuscatedName("client.sd")
    public static int field745;

    @ObfuscatedName("client.sp")
    public static String field746;

    @ObfuscatedName("client.sj")
    public static long[] field747;

    @ObfuscatedName("client.sh")
    public static int field645;

    @ObfuscatedName("client.ss")
    public static class270 field664;

    @ObfuscatedName("client.se")
    public static class268 field680;

    @ObfuscatedName("client.st")
    public static int field515;

    @ObfuscatedName("client.sq")
    public static int[] field534;

    @ObfuscatedName("client.sy")
    public static int[] field753;

    @ObfuscatedName("client.su")
    public static long field749;

    @ObfuscatedName("client.sg")
    public static class162[] field755;

    @ObfuscatedName("client.sl")
    public static class171[] field704;

    @ObfuscatedName("client.sn")
    public static int field757;

    @ObfuscatedName("client.sv")
    public static int field765;

    @ObfuscatedName("client.sb")
    public static int[] field759;

    @ObfuscatedName("client.sa")
    public static int[] field760;

    @ObfuscatedName("client.sx")
    public static class565[] field772;

    @ObfuscatedName("client.sz")
    public static int field758;

    @ObfuscatedName("client.si")
    public static int field690;

    @ObfuscatedName("client.ti")
    public static int field764;

    @ObfuscatedName("client.tm")
    public static boolean field608;

    @ObfuscatedName("client.th")
    public static int field766;

    @ObfuscatedName("client.to")
    public static int[] field705;

    @ObfuscatedName("client.tx")
    public static int[] field748;

    @ObfuscatedName("client.tq")
    public static int[] field769;

    @ObfuscatedName("client.tg")
    public static int[] field770;

    @ObfuscatedName("client.ta")
    public static int[] field628;

    @ObfuscatedName("client.td")
    public static class40[] field750;

    @ObfuscatedName("client.tt")
    public static boolean field706;

    @ObfuscatedName("client.ue")
    public static boolean field774;

    @ObfuscatedName("client.us")
    public static boolean field775;

    @ObfuscatedName("client.ui")
    public static boolean field776;

    @ObfuscatedName("client.uq")
    public static class515 field777;

    @ObfuscatedName("client.ud")
    public static class514 field778;

    @ObfuscatedName("client.ua")
    public static class514 field779;

    @ObfuscatedName("client.ul")
    public static boolean field780;

    @ObfuscatedName("client.up")
    public static boolean[] field578;

    @ObfuscatedName("client.un")
    public static int[] field782;

    @ObfuscatedName("client.uv")
    public static int[] field783;

    @ObfuscatedName("client.uj")
    public static int[] field590;

    @ObfuscatedName("client.um")
    public static int[] field519;

    @ObfuscatedName("client.uz")
    public static short field786;

    @ObfuscatedName("client.uk")
    public static short field787;

    @ObfuscatedName("client.vm")
    public static short field788;

    @ObfuscatedName("client.vk")
    public static short field789;

    @ObfuscatedName("client.vc")
    public static short field728;

    @ObfuscatedName("client.va")
    public static short field791;

    @ObfuscatedName("client.vf")
    public static short field792;

    @ObfuscatedName("client.vh")
    public static short field793;

    @ObfuscatedName("client.vz")
    public static int field794;

    @ObfuscatedName("client.vi")
    public static int field795;

    @ObfuscatedName("client.vb")
    public static int field796;

    @ObfuscatedName("client.vg")
    public static int field797;

    @ObfuscatedName("client.vq")
    public static int field618;

    @ObfuscatedName("client.vn")
    public static final class360 field790;

    @ObfuscatedName("client.vu")
    public static int field800;

    @ObfuscatedName("client.vr")
    public static int field801;

    @ObfuscatedName("client.vo")
    public static class511 field802;

    @ObfuscatedName("client.vv")
    public static class400[] field803;

    @ObfuscatedName("client.vd")
    public static class67 field610;

    @ObfuscatedName("client.vl")
    public static class465 field805;

    @ObfuscatedName("client.vs")
    public static class317 field806;

    @ObfuscatedName("client.wq")
    public static class317 field807;

    @ObfuscatedName("client.ws")
    public static int field808;

    @ObfuscatedName("client.wg")
    public static int field809;

    @ObfuscatedName("client.wo")
    public static List field810;

    @ObfuscatedName("client.wi")
    public static final class279 field811;

    @ObfuscatedName("client.wj")
    public static int field812;

    @ObfuscatedName("client.wz")
    public static ArrayList field607;

    @ObfuscatedName("client.we")
    public static int field814;

    @ObfuscatedName("client.wk")
    public static int field815;

    @ObfuscatedName("client.wn")
    public static final class66 field816;

    @ObfuscatedName("client.wu")
    public static int[] field692;

    @ObfuscatedName("client.xe")
    public static int[] field818;

    static {
        class549.field5408 = 225;
        field773 = false;
        field613 = false;
        field528 = 0;
        field529 = false;
        field576 = false;
        field574 = true;
        field609 = 0;
        field533 = 0;
        field798 = 1L;
        field649 = -1;
        field536 = -1;
        field537 = -1L;
        field538 = true;
        field539 = 0;
        field540 = 0;
        field606 = 0;
        field542 = 0;
        field543 = 0;
        field544 = 0;
        field545 = 0;
        field546 = 0;
        field754 = 0;
        field548 = class109.field1410;
        field549 = class109.field1410;
        field550 = false;
        field604 = class96.field1175;
        field531 = 0;
        field553 = 0;
        field554 = 0;
        field555 = 0;
        field556 = 0;
        field557 = 0;
        field558 = class131.field1547;
        field559 = class556.field5473;
        field756 = class418.method4130(class416.method5143("com_jagex_auth_desktop_osrs:public"));
        field571 = class418.method4130(class416.method5143("com_jagex_auth_desktop_runelite:public"));
        field573 = false;
        field740 = new class81();
        field575 = new int[4];
        field579 = null;
        field730 = 0;
        field581 = new int[250];
        field582 = new class117();
        field583 = 0;
        field541 = false;
        field668 = new class455();
        field619 = new HashMap();
        field605 = 0;
        field714 = 1;
        field627 = 0;
        field530 = 1;
        field591 = 0;
        field592 = new int[4][13][13];
        field593 = new class98();
        field632 = false;
        field595 = new int[4][13][13];
        field596 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field597 = -1;
        field718 = new class113();
        field599 = 0;
        field600 = 2301979;
        field601 = 5063219;
        field602 = 3353893;
        field603 = 7759444;
        field588 = false;
        field552 = 0;
        field781 = 128;
        field672 = 0;
        field709 = 0;
        field684 = 0;
        field771 = 0;
        field611 = 0;
        field612 = 0;
        field720 = 50;
        field614 = 0;
        field665 = 0;
        field631 = 0;
        field617 = 12;
        field623 = 6;
        field551 = 0;
        field620 = false;
        field621 = 0;
        field622 = false;
        field761 = 0;
        field624 = 0;
        field625 = 50;
        field626 = new int[field625];
        field752 = new int[field625];
        field643 = new int[field625];
        field629 = new int[field625];
        field676 = new int[field625];
        field735 = new int[field625];
        field646 = new int[field625][];
        field633 = new int[field625];
        field634 = new String[field625];
        field635 = 0;
        field636 = -1;
        field637 = -1;
        field638 = 0;
        field639 = 0;
        field799 = 0;
        field641 = 0;
        field642 = true;
        field729 = 0;
        field644 = true;
        field652 = -1;
        field566 = 0;
        field647 = -1L;
        field615 = -1L;
        field598 = "";
        field650 = -1;
        field651 = true;
        field584 = 0;
        field526 = 0;
        field654 = new int[1000];
        field655 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field656 = new String[8];
        field657 = new boolean[8];
        field658 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field784 = -1;
        field547 = new int[25];
        field661 = new int[25];
        field662 = new int[25];
        field663 = new int[25];
        field587 = false;
        field813 = false;
        field666 = new class570(true);
        field535 = false;
        field763 = false;
        field669 = true;
        field670 = -1;
        field671 = -1;
        field767 = 0;
        field673 = 50;
        field674 = 0;
        field675 = null;
        field768 = false;
        field677 = -1;
        field678 = -1;
        field679 = null;
        field707 = null;
        field681 = -1;
        field682 = new class524(8);
        field683 = 0;
        field630 = -1;
        field785 = 0;
        field686 = null;
        field687 = 0;
        field688 = 0;
        field689 = 0;
        field570 = -1;
        field691 = false;
        field580 = null;
        field693 = null;
        field694 = null;
        field695 = 0;
        field696 = 0;
        field804 = null;
        field698 = false;
        field577 = -1;
        field685 = -1;
        field701 = false;
        field702 = -1;
        field703 = -1;
        field659 = false;
        field710 = 1;
        field653 = new int[32];
        field586 = 0;
        field708 = new int[32];
        field762 = 0;
        field817 = new int[32];
        field711 = 0;
        field712 = new int[32];
        field713 = 0;
        field699 = 0;
        field715 = 0;
        field716 = 0;
        field717 = 0;
        field616 = 0;
        field719 = 0;
        field648 = 0;
        field721 = 0;
        field722 = 0;
        field723 = new class569();
        field724 = new class410();
        field725 = new class410();
        field726 = new class410();
        field727 = new class410();
        field589 = new class524(512);
        field700 = 0;
        field594 = -2;
        field731 = new boolean[100];
        field732 = new boolean[100];
        field733 = new boolean[100];
        field734 = new int[100];
        field751 = new int[100];
        field736 = new int[100];
        field737 = new int[100];
        field738 = 0;
        field739 = 0L;
        field527 = true;
        field741 = 600;
        field742 = field741 / field191;
        field743 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field744 = 0;
        field745 = 0;
        field746 = "";
        field747 = new long[100];
        field645 = 0;
        field664 = new class270();
        field680 = new class268();
        field515 = 0;
        field534 = new int[128];
        field753 = new int[128];
        field749 = -1L;
        field755 = new class162[4];
        field704 = new class171[4];
        field757 = -1;
        field765 = 0;
        field759 = new int[1000];
        field760 = new int[1000];
        field772 = new class565[1000];
        field758 = 0;
        field690 = 0;
        field764 = 0;
        field608 = false;
        field766 = 0;
        field705 = new int[50];
        field748 = new int[50];
        field769 = new int[50];
        field770 = new int[50];
        field628 = new int[50];
        field750 = new class40[50];
        field706 = false;
        field774 = false;
        field775 = false;
        field776 = false;
        field777 = null;
        field778 = null;
        field779 = null;
        field780 = false;
        field578 = new boolean[5];
        field782 = new int[5];
        field783 = new int[5];
        field590 = new int[5];
        field519 = new int[5];
        field786 = 256;
        field787 = 205;
        field788 = 256;
        field789 = 320;
        field728 = 1;
        field791 = 32767;
        field792 = 1;
        field793 = 32767;
        field794 = 0;
        field795 = 0;
        field796 = 0;
        field797 = 0;
        field618 = 0;
        field790 = new class360();
        field800 = -1;
        field801 = -1;
        field802 = new class509();
        field803 = new class400[8];
        field610 = new class67();
        field805 = new class465(8, class463.field4932);
        field806 = new class317(64);
        field807 = new class317(64);
        field808 = -1;
        field809 = -1;
        field810 = new ArrayList();
        field811 = new class279();
        field812 = 10;
        field607 = new ArrayList(10);
        field814 = 0;
        field815 = 0;
        field816 = new class66();
        field692 = new int[50];
        field818 = new int[50];
    }

    @ObfuscatedName("dx.gy(I)Ltq;")
    public static class510 method2393() {
        return Statics.field3005;
    }

    @ObfuscatedName("fd.hc(B)Ltu;")
    public static class518 method3255() {
        return Statics.field1518;
    }

    @ObfuscatedName("client.bo(I)V")
    public final void method514() {
    }

    public final void init() {
        if (!this.method501()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class107.field1398)) {
                            field640 = true;
                        } else {
                            field640 = false;
                        }
                        break;
                    case 4:
                        if (field522 == -1) {
                            field522 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field517 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field1329 = class406.method6996(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field3218 = class377.method2875(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class107.field1398)) {
                        }
                        break;
                    case 9:
                        Statics.field5092 = var2;
                        break;
                    case 10:
                        class378[] var4 = new class378[] { class378.field4103, class378.field4095, class378.field4096, class378.field4094, class378.field4101, class378.field4097 };
                        Statics.field3604 = (class378) class405.method6719(var4, Integer.parseInt(var2));
                        if (Statics.field3604 == class378.field4103) {
                            Statics.field127 = class528.field5292;
                        } else {
                            Statics.field127 = class528.field5297;
                        }
                        break;
                    case 11:
                        Statics.field2350 = var2;
                        break;
                    case 12:
                        field516 = Integer.parseInt(var2);
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
                        Statics.field2353 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field518 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field3071 = var2;
                        break;
                    case 21:
                        field521 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field5324 = var2;
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            class549.field5408 = Integer.parseInt(var2);
                        } else {
                            class549.field5408 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        class245.field2678 = false;
        field520 = false;
        Statics.field3421 = this.getCodeBase().getHost();
        Statics.field5261 = new class392();
        String var5 = Statics.field3218.field4091;
        byte var6 = 0;
        if ((field517 & class546.field5381.method32()) != 0) {
            Statics.field2383 = "beta";
        }
        try {
            class221.method5611("oldschool", Statics.field2383, var5, var6, 23);
        } catch (Exception var9) {
            class577.method3409((String) null, var9);
        }
        Statics.field3 = this;
        Statics.field4015 = field522;
        Statics.field237 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field4074 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field3599 = System.getenv("JX_SESSION_ID");
        Statics.field4964 = System.getenv("JX_CHARACTER_ID");
        String var8 = System.getenv("JX_DISPLAY_NAME");
        class79.field954 = class529.method8257(var8);
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field565 = true;
        }
        if (field523 == -1) {
            if (this.method1240() || this.method1243()) {
                field523 = 5;
            } else {
                field523 = 0;
            }
        }
        this.method533(765, 503, 225, 1);
    }

    public void finalize() throws Throwable {
        class335.field3624.remove(this);
        super.finalize();
    }

    @ObfuscatedName("client.he(I)Z")
    public boolean method1213() {
        return this.field697 == 1;
    }

    public void setClient(int arg0) {
        this.field697 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field563 = arg0;
            class79.method1207(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field568 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field528 == 10;
    }

    public long getAccountHash() {
        return this.field660;
    }

    @ObfuscatedName("client.hr(I)Z")
    public boolean method1240() {
        return Statics.field237 != null && !Statics.field237.trim().isEmpty() && Statics.field4074 != null && !Statics.field4074.trim().isEmpty();
    }

    @ObfuscatedName("client.hk(I)Z")
    public boolean method1243() {
        return Statics.field3599 != null && !Statics.field3599.trim().isEmpty() && Statics.field4964 != null && !Statics.field4964.trim().isEmpty();
    }

    @ObfuscatedName("client.hi(I)Z")
    public boolean method1228() {
        return this.field563 != null;
    }

    @ObfuscatedName("client.hy(Ljava/lang/String;I)V")
    public void method1218(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field2350 + "shield/oauth/token" + (new class499(var2)).method8331());
        class461 var4 = new class461();
        if (this.method1213()) {
            var4.method7910(field571);
        } else {
            var4.method7910(field756);
        }
        var4.method7907("Host", (new URL(Statics.field2350)).getHost());
        var4.method7914(class496.field5088);
        class10 var5 = class10.field29;
        RefreshAccessTokenRequester var6 = this.field568;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field565);
            this.field567 = this.field561.method156(var7);
        } else {
            this.field569 = var6.request(var5.method66(), var3, var4.method7906(), "");
        }
    }

    @ObfuscatedName("client.hd(Ljava/lang/String;B)V")
    public void method1260(String arg0) throws IOException {
        URL var2 = new URL(Statics.field2350 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class461 var3 = new class461();
        var3.method7905(arg0);
        class10 var4 = class10.field28;
        OtlTokenRequester var5 = this.field563;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field565);
            this.field562 = this.field561.method156(var6);
        } else {
            this.field564 = var5.request(var4.method66(), var2, var3.method7906(), "");
        }
    }

    @ObfuscatedName("client.hj(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1220(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field5324 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field29, this.field565);
        var4.method78().method7905(arg0);
        var4.method78().method7914(class496.field5088);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method86(new class498(var5));
        this.field562 = this.field561.method156(var4);
    }

    @ObfuscatedName("client.bf(I)V")
    public final void method528() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field3737 = null;
            Statics.field1757 = null;
            Statics.field4692 = (byte[][][]) null;
            class453.field4874.clear();
            class453.field4874.add(100);
            class453.field4874.add(5000);
            class453.field4874.add(10000);
            class453.field4874.add(30000);
        } else {
            Statics.field3737 = var1;
            Statics.field1757 = new int[var1.length];
            Statics.field4692 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field3737.length; var3++) {
                Statics.field4692[var3] = new byte[var2[var3]][];
                class453.field4874.add(var1[var3]);
            }
            Collections.sort(class453.field4874);
        }
        int var4 = field517;
        class546 var5 = class546.field5381;
        boolean var6 = (var4 & var5.method32()) != 0;
        Statics.field5084 = var6;
        Statics.field137 = field518 == 0 ? 43594 : field516 + 40000;
        Statics.field3145 = field518 == 0 ? 443 : field516 + 50000;
        Statics.field1544 = Statics.field137;
        Statics.field3802 = class362.field3837;
        Statics.field2770 = class362.field3838;
        Statics.field2769 = class362.field3839;
        Statics.field49 = class362.field3840;
        Statics.field71 = new class120(this.field565, 225);
        this.method474();
        this.method484();
        Statics.field66 = this.method477();
        this.method483(field680, 0);
        this.method483(field664, 1);
        this.method478();
        Statics.field4460 = new class486(255, class221.field2387, class221.field2388, 500000);
        Statics.field4929 = class103.method8782();
        String var8 = Statics.field1941;
        class32.field148 = this;
        if (var8 != null) {
            class32.field144 = var8;
        }
        method90(Statics.field4929.method2625());
        Statics.field4723 = new class71(Statics.field127);
        this.field561 = new class15("tokenRequest", 1, 1);
        class335.method5763(this);
        field811.method5198();
    }

    @ObfuscatedName("client.bj(I)V")
    public final void method505() {
        field609++;
        this.method1555();
        while (true) {
            class410 var1 = class387.field4501;
            class386 var2;
            synchronized (class387.field4501) {
                var2 = (class386) class387.field4496.method7027();
            }
            if (var2 == null) {
                boolean var4 = false;
                boolean var5 = false;
                if (!class335.field3621.isEmpty()) {
                    class448 var6 = (class448) class335.field3621.get(0);
                    if (var6 == null) {
                        class335.field3621.remove(0);
                    } else if (var6.method7804()) {
                        if (var6.method7811()) {
                            System.out.println("Error in midimanager.service: " + var6.method7813());
                            var4 = true;
                        } else {
                            if (var6.method7809() != null) {
                                class335.field3621.add(1, var6.method7809());
                            }
                            var5 = var6.method7812();
                        }
                        class335.field3621.remove(0);
                    } else {
                        var5 = var6.method7812();
                    }
                }
                if (var4) {
                    class335.field3621.clear();
                    class335.method1119();
                }
                if (var5 && field608 && Statics.field1377 != null) {
                    Statics.field1377.method785();
                }
                method6956();
                field664.method5074();
                this.method482();
                class36.method2873();
                if (Statics.field66 != null) {
                    int var9 = Statics.field66.method298();
                    field722 = var9;
                }
                if (field528 == 0) {
                    method5764();
                    class35.method3530();
                } else if (field528 == 5) {
                    class79.method2796(this, Statics.field1830, Statics.field1534);
                    method5764();
                    class35.method3530();
                } else if (field528 == 10 || field528 == 11) {
                    class79.method2796(this, Statics.field1830, Statics.field1534);
                } else if (field528 == 20) {
                    class79.method2796(this, Statics.field1830, Statics.field1534);
                    this.method1226();
                } else if (field528 == 50) {
                    class79.method2796(this, Statics.field1830, Statics.field1534);
                    this.method1226();
                } else if (field528 == 25) {
                    if (field773) {
                        method6703();
                    }
                    if (field613) {
                        method3705(Statics.field4459);
                    }
                    if (!field613 && !field773) {
                        method7976(30);
                    }
                }
                if (field528 == 30) {
                    this.method1476();
                } else if (field528 == 40 || field528 == 45) {
                    this.method1226();
                }
                return;
            }
            var2.field4494.method6736(var2.field4491, (int) var2.field5122, var2.field4492, false);
        }
    }

    @ObfuscatedName("client.bp(ZI)V")
    public final void method506(boolean arg0) {
        if ((field528 == 10 || field528 == 20 || field528 == 30) && field739 != 0L && class331.method3482() > field739) {
            method90(method2290());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field731[var2] = true;
            }
        }
        if (field528 == 0) {
            this.method508(class79.field953, class79.field957, arg0, Statics.field294);
        } else if (field528 == 5) {
            class79.method1175(Statics.field160, Statics.field1830, Statics.field1534);
        } else if (field528 == 10 || field528 == 11) {
            class79.method1175(Statics.field160, Statics.field1830, Statics.field1534);
        } else if (field528 == 20) {
            class79.method1175(Statics.field160, Statics.field1830, Statics.field1534);
        } else if (field528 == 50) {
            class79.method1175(Statics.field160, Statics.field1830, Statics.field1534);
        } else if (field528 == 25) {
            if (field591 == 1) {
                if (field605 > field714) {
                    field714 = field605;
                }
                int var3 = (field714 * 50 - field605 * 50) / field714;
                method5761(class382.field4242 + class107.field1399 + class107.field1396 + var3 + "%" + class107.field1394, false);
            } else if (field591 == 2) {
                if (field627 > field530) {
                    field530 = field627;
                }
                int var4 = (field530 * 50 - field627 * 50) / field530 + 50;
                method5761(class382.field4242 + class107.field1399 + class107.field1396 + var4 + "%" + class107.field1394, false);
            } else {
                method5761(class382.field4242, false);
            }
        } else if (field528 == 30) {
            this.method1409();
        } else if (field528 == 40) {
            method5761(class382.field4411 + class107.field1399 + class382.field4436, false);
        } else if (field528 == 45) {
            method5761(class382.field4311, false);
        }
        if (field528 == 30 && field738 == 0 && !arg0 && !field527) {
            for (int var5 = 0; var5 < field700; var5++) {
                if (field732[var5]) {
                    Statics.field3281.method456(field734[var5], field751[var5], field736[var5], field737[var5]);
                    field732[var5] = false;
                }
            }
        } else if (field528 > 0) {
            Statics.field3281.method463(0, 0);
            for (int var6 = 0; var6 < field700; var6++) {
                field732[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.by(I)V")
    public final void method507() {
        if (Statics.field2460 != null && Statics.field2460.method2887()) {
            Statics.field2460.method2884();
        }
        if (Statics.field1312 != null) {
            Statics.field1312.field1115 = false;
        }
        Statics.field1312 = null;
        field582.method2965();
        if (class36.field202 != null) {
            class36 var1 = class36.field202;
            synchronized (class36.field202) {
                class36.field202 = null;
            }
        }
        Statics.field66 = null;
        if (Statics.field1377 != null) {
            Statics.field1377.method800();
        }
        Statics.field5261.method6869();
        class387.method4771();
        if (Statics.field71 != null) {
            Statics.field71.method2973();
            Statics.field71 = null;
        }
        class221.method3067();
        this.field561.method157();
    }

    @ObfuscatedName("mt.hw(I)V")
    public static void method6019() {
        field576 = true;
        if (Statics.field2460 != null && Statics.field2460.method2887()) {
            Statics.field2460.method2884();
        }
        method5362();
        method8344();
        if (Statics.field1312 != null) {
            Statics.field1312.field1115 = false;
        }
        Statics.field1312 = null;
        field582.method2965();
        if (Statics.field170 != null) {
            try {
                Statics.field170.method4098();
            } catch (Exception var3) {
            }
        }
        Statics.field170 = null;
        method3442();
        method3560();
        field593.method2495();
        Statics.field1518 = null;
        class335.method5635(0, 0);
        class335.method863();
        field608 = false;
        class72.method2197();
        if (Statics.field1377 != null) {
            Statics.field1377.method800();
        }
        Statics.field5261.method6869();
        class387.method4771();
        if (Statics.field71 != null) {
            Statics.field71.method2973();
        }
        class221.method3067();
        class221.field2387 = null;
        class221.field2388 = null;
        Statics.field2351 = null;
        class223.method2919();
        Statics.field4460 = null;
        field607.clear();
        field815 = 0;
        Statics.field5261 = new class392();
        Statics.field71 = new class120(Statics.field3.field565, 225);
        try {
            class221.method5611("oldschool", Statics.field2383, Statics.field3218.field4091, 0, 23);
        } catch (IOException var2) {
            throw new RuntimeException(var2);
        }
        Statics.field4460 = new class486(255, class221.field2387, class221.field2388, 500000);
        Statics.field170 = new class219();
        Statics.field3.method500();
        method5747(class96.field1175);
        method7976(0);
    }

    @ObfuscatedName("hi.hg(B)V")
    public static void method3560() {
        Statics.field1509 = null;
        Statics.field1786 = null;
        Statics.field3069 = null;
        Statics.field5318 = null;
        Statics.field1530 = null;
        Statics.field3244 = null;
        Statics.field1761 = null;
        Statics.field3063 = null;
        Statics.field1594 = null;
        Statics.field2395 = null;
        Statics.field4674 = null;
    }

    @ObfuscatedName("ry.hp(II)V")
    public static void method7976(int arg0) {
        if (field528 == arg0) {
            return;
        }
        if (field528 == 30) {
            field680.method5060();
        }
        if (field528 == 0) {
            Statics.field3.method550();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method3373(class69.field508);
            field555 = 0;
            field556 = 0;
            field668.method7870(arg0);
            if (arg0 != 20) {
                method3367(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field142 != null) {
            Statics.field142.method8198();
            Statics.field142 = null;
        }
        if (field528 == 25) {
            field591 = 0;
            field605 = 0;
            field714 = 1;
            field627 = 0;
            field530 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field4929.method2623() >= field521;
            int var3 = var2 ? 0 : 12;
            class79.method2389(Statics.field2368, Statics.field479, Statics.field1732, true, var3);
        } else if (arg0 == 20) {
            int var1 = field528 == 11 ? 4 : 0;
            class79.method2389(Statics.field2368, Statics.field479, Statics.field1732, false, var1);
        } else if (arg0 == 11) {
            class79.method2389(Statics.field2368, Statics.field479, Statics.field1732, false, 4);
        } else if (arg0 == 50) {
            class79.method2249("", "Updating date of birth...", "");
            class79.method2389(Statics.field2368, Statics.field479, Statics.field1732, false, 7);
        } else if (arg0 != 0) {
            class79.method3439();
        }
        field528 = arg0;
    }

    @ObfuscatedName("client.hn(B)V")
    public void method1555() {
        if (field528 != 1000) {
            boolean var1 = Statics.field5261.method6861();
            if (!var1) {
                this.method1224();
            }
        }
    }

    @ObfuscatedName("client.hb(I)V")
    public void method1224() {
        if (Statics.field5261.field4565 >= 4) {
            this.method624("js5crc");
            method7976(1000);
            return;
        }
        if (Statics.field5261.field4593 >= 4) {
            if (field528 <= 5) {
                this.method624("js5io");
                method7976(1000);
                return;
            }
            field553 = 3000;
            Statics.field5261.field4593 = 3;
        }
        if (--field553 + 1 > 0) {
            return;
        }
        try {
            if (field531 == 0) {
                Statics.field2095 = Statics.field170.method4088(Statics.field3421, Statics.field1544);
                field531++;
            }
            if (field531 == 1) {
                if (Statics.field2095.field2430 == 2) {
                    this.method1225(-1);
                    return;
                }
                if (Statics.field2095.field2430 == 1) {
                    field531++;
                }
            }
            if (field531 == 2) {
                Statics.field4724 = class482.method7807((Socket) Statics.field2095.field2437, 40000, 5000);
                if (class549.field5408 >= 223) {
                    class551 var1 = new class551(class328.field3582.field3577 + 1);
                    var1.method9022(class328.field3582.field3576);
                    var1.method8960(225);
                    var1.method8960(field575[0]);
                    var1.method8960(field575[1]);
                    var1.method8960(field575[2]);
                    var1.method8960(field575[3]);
                    Statics.field4724.method8216(var1.field5413, 0, class328.field3582.field3577 + 1);
                } else {
                    class551 var2 = new class551(5);
                    var2.method9022(class328.field3582.field3576);
                    var2.method8960(225);
                    Statics.field4724.method8216(var2.field5413, 0, 5);
                }
                field531++;
                Statics.field299 = class331.method3482();
            }
            if (field531 == 3) {
                if (Statics.field4724.method8220() > 0) {
                    int var3 = Statics.field4724.method8195();
                    if (var3 != 0) {
                        this.method1225(var3);
                        return;
                    }
                    field531++;
                } else if (class331.method3482() - Statics.field299 > 30000L) {
                    this.method1225(-2);
                    return;
                }
            }
            if (field531 == 4) {
                Statics.field5261.method6862(Statics.field4724, field528 > 20);
                Statics.field2095 = null;
                Statics.field4724 = null;
                field531 = 0;
                field554 = 0;
            }
        } catch (IOException var5) {
            this.method1225(-3);
        }
    }

    @ObfuscatedName("client.hq(II)V")
    public void method1225(int arg0) {
        Statics.field2095 = null;
        Statics.field4724 = null;
        field531 = 0;
        if (Statics.field1544 == Statics.field137) {
            Statics.field1544 = Statics.field3145;
        } else {
            Statics.field1544 = Statics.field137;
        }
        field554++;
        if (field554 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field528 <= 5) {
                this.method624("js5connect_full");
                method7976(1000);
            } else {
                field553 = 3000;
            }
        } else if (field554 >= 2 && arg0 == 6) {
            this.method624("js5connect_outofdate");
            method7976(1000);
        } else if (field554 >= 4) {
            if (field528 <= 5) {
                this.method624("js5connect");
                method7976(1000);
            } else {
                field553 = 3000;
            }
        }
    }

    @ObfuscatedName("ns.hm(Lof;Ljava/lang/String;B)V")
    public static void method6063(class388 arg0, String arg1) {
        class87 var2 = new class87(arg0, arg1);
        field607.add(var2);
        field815 += var2.field1072;
    }

    @ObfuscatedName("eh.hz(B)I")
    public static int method2851() {
        if (field607 == null || field814 >= field607.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field814; var1++) {
            var0 += ((class87) field607.get(var1)).field1075;
        }
        return var0 * 10000 / field815;
    }

    @ObfuscatedName("mf.hu(I)V")
    public static void method5764() {
        if (field604 == class96.field1175) {
            Statics.field426 = method2420(class389.field4532.field4542, false, true, true, false);
            Statics.field1993 = method2420(class389.field4534.field4542, true, true, true, false);
            Statics.field479 = method2420(class389.field4528.field4542, false, true, true, false);
            Statics.field2368 = method2420(class389.field4530.field4542, false, true, true, false);
            Statics.field1540 = method2420(class389.field4533.field4542, true, false, true, false);
            Statics.field1579 = method2420(class389.field4520.field4542, false, true, true, false);
            Statics.field113 = method2420(class389.field4526.field4542, false, true, true, false);
            class79.method3267(20, class382.field4152);
            method5747(class96.field1185);
        } else if (field604 == class96.field1185) {
            byte var0 = 0;
            int var1 = var0 + Statics.field426.method6755() * 53 / 100;
            int var2 = var1 + Statics.field1993.method6755() * 5 / 100;
            int var3 = var2 + Statics.field479.method6755() * 36 / 100;
            int var4 = var3 + Statics.field2368.method6755() / 100;
            int var5 = var4 + Statics.field1540.method6755() / 100;
            int var6 = var5 + Statics.field1579.method6755() * 3 / 100;
            int var7 = var6 + Statics.field113.method6755() / 100;
            if (var7 == 100) {
                method6063(Statics.field426, "Sound FX");
                method6063(Statics.field1993, "Music Tracks");
                method6063(Statics.field479, "Sprites");
                method6063(Statics.field1579, "Music Samples");
                method6063(Statics.field113, "Music Patches");
                class79.method3267(40, class382.field4154);
                method5747(class96.field1179);
            } else if (var7 != 0) {
                class79.method3267(30, class382.field4153 + var7 + "%");
            }
        } else if (field604 == class96.field1179) {
            class43.method3370(22050, !field520, 2);
            ArrayList var8 = new ArrayList(3);
            class219 var9 = Statics.field170;
            short var10 = 2048;
            if (Statics.field271 == 0) {
                throw new IllegalStateException();
            }
            if (var10 < 256) {
                var10 = 256;
            }
            class43 var12;
            try {
                class43 var11 = Statics.field264.method303();
                var11.field265 = new int[256 * (Statics.field262 ? 2 : 1)];
                var11.field280 = var10;
                var11.method330();
                var11.field269 = (var10 & 0xFFFFFC00) + 1024;
                if (var11.field269 > 16384) {
                    var11.field269 = 16384;
                }
                var11.method314(var11.field269);
                if (Statics.field5584 > 0 && Statics.field4848 == null) {
                    Statics.field4848 = new class45();
                    Statics.field263 = Executors.newScheduledThreadPool(1);
                    Statics.field263.scheduleAtFixedRate(Statics.field4848, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field4848 != null) {
                    if (Statics.field4848.field298[0] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field4848.field298[0] = var11;
                }
                var12 = var11;
            } catch (Throwable var90) {
                var12 = new class43();
            }
            Statics.field1377 = var12;
            Statics.field199 = new class39();
            class39 var14 = new class39();
            var14.method705(Statics.field199);
            for (int var15 = 0; var15 < 3; var15++) {
                class336 var16 = new class336(Statics.field1377);
                var16.method5856(9, 128);
                var14.method705(var16);
                var8.add(var16);
            }
            Statics.field1377.method782(var14);
            class335.method6695(Statics.field113, Statics.field1579, Statics.field426, var8);
            Statics.field96 = new class58(22050, Statics.field271);
            class79.method3267(60, class382.field4155);
            method5747(class96.field1180);
        } else if (field604 == class96.field1180) {
            if (Statics.field4032 == null) {
                Statics.field4032 = new class519(Statics.field479, Statics.field1540);
            }
            class520[] var17 = new class520[] { class520.field5263, class520.field5255, class520.field5257, class520.field5258, class520.field5259, class520.field5260 };
            int var18 = var17.length;
            class519 var19 = Statics.field4032;
            class520[] var20 = new class520[] { class520.field5263, class520.field5255, class520.field5257, class520.field5258, class520.field5259, class520.field5260 };
            field619 = var19.method8634(var20);
            if (field619.size() < var18) {
                class79.method3267(80, class382.field4156 + field619.size() * 100 / var18 + "%");
            } else {
                Statics.field1830 = (class435) field619.get(class520.field5263);
                Statics.field1534 = (class435) field619.get(class520.field5255);
                Statics.field160 = (class435) field619.get(class520.field5260);
                Statics.field3005 = field802.method8369();
                class79.method3267(80, class382.field4317);
                method5747(class96.field1191);
            }
        } else if (field604 == class96.field1191) {
            class388 var21 = Statics.field2368;
            class388 var22 = Statics.field479;
            int var23 = 0;
            String[] var24 = class79.field984;
            for (int var25 = 0; var25 < var24.length; var25++) {
                String var26 = var24[var25];
                if (var21.method6801(var26, "")) {
                    var23++;
                }
            }
            String[] var27 = class79.field985;
            for (int var28 = 0; var28 < var27.length; var28++) {
                String var29 = var27[var28];
                if (var22.method6801(var29, "")) {
                    var23++;
                }
            }
            String[] var30 = class79.field986;
            for (int var31 = 0; var31 < var30.length; var31++) {
                String var32 = var30[var31];
                if (var22.method6797(var32) != -1 && var22.method6801(var32, "")) {
                    var23++;
                }
            }
            int var35 = class79.method691(Statics.field479);
            if (var23 < var35) {
                class79.method3267(90, class382.field4158 + var23 * 100 / var35 + "%");
            } else {
                class79.method3267(100, class382.field4159);
                if (Statics.field5084) {
                    method7976(5);
                    method5747(class96.field1190);
                } else {
                    method5747(class96.field1176);
                }
            }
        } else if (field604 == class96.field1190) {
            method7976(10);
        } else if (field604 == class96.field1176) {
            Statics.field111 = method2420(class389.field4523.field4542, false, true, true, false);
            Statics.field2889 = method2420(class389.field4521.field4542, false, true, true, false);
            Statics.field355 = method2420(class389.field4522.field4542, true, false, true, false);
            Statics.field3581 = method2420(class389.field4524.field4542, false, true, true, false);
            Statics.field4712 = method2420(class389.field4525.field4542, true, true, true, false);
            Statics.field3791 = method2420(class389.field4527.field4542, false, true, true, false);
            Statics.field1214 = method2420(class389.field4529.field4542, false, true, true, false);
            Statics.field3691 = method2420(class389.field4541.field4542, false, true, true, false);
            Statics.field1961 = method2420(class389.field4519.field4542, false, true, true, false);
            Statics.field461 = method2420(class389.field4535.field4542, true, true, true, false);
            Statics.field987 = method2420(class389.field4537.field4542, false, true, true, false);
            Statics.field3743 = method2420(class389.field4538.field4542, false, true, true, false);
            Statics.field4947 = method2420(class389.field4539.field4542, false, true, true, false);
            Statics.field1739 = method2420(class389.field4540.field4542, false, true, true, false);
            Statics.field1535 = method6692(class389.field4531.field4542, false, true, true, true, true);
            class79.method3267(20, class382.field4152);
            method5747(class96.field1184);
        } else if (field604 == class96.field1184) {
            byte var36 = 0;
            int var37 = var36 + Statics.field111.method6755() * 5 / 100;
            int var38 = var37 + Statics.field2889.method6755() * 2 / 100;
            int var39 = var38 + Statics.field355.method6755() / 100;
            int var40 = var39 + Statics.field3581.method6755() / 100;
            int var41 = var40 + Statics.field4712.method6755() * 10 / 100;
            int var42 = var41 + Statics.field3791.method6755() * 65 / 100;
            int var43 = var42 + Statics.field1214.method6755() / 100;
            int var44 = var43 + Statics.field3691.method6755() / 100;
            int var45 = var44 + Statics.field1961.method6755() * 6 / 100;
            int var46 = var45 + Statics.field3743.method6755() / 100;
            int var47 = var46 + Statics.field987.method6755() * 2 / 100;
            int var48 = var47 + Statics.field4947.method6755() * 2 / 100;
            int var49 = var48 + Statics.field1739.method6755() / 100;
            int var50 = var49 + Statics.field1535.method6755() / 100;
            int var51 = var50 + (Statics.field461.method6730() && Statics.field461.method6805() ? 1 : 0);
            if (var51 == 100) {
                method6063(Statics.field111, "Animations");
                method6063(Statics.field2889, "Skeletons");
                method6063(Statics.field4712, "Maps");
                method6063(Statics.field3791, "Models");
                method6063(Statics.field3691, "Music Jingles");
                method6063(Statics.field3743, "World Map");
                method6063(Statics.field987, "World Map Geography");
                method6063(Statics.field4947, "World Map Ground");
                Statics.field1732 = new class488();
                Statics.field1732.method8269(Statics.field461);
                class79.method3267(30, class382.field4154);
                method5747(class96.field1178);
            } else if (var51 != 0) {
                class79.method3267(30, class382.field4153 + var51 + "%");
            }
        } else if (field604 == class96.field1178) {
            Statics.field1342 = field593.method2492(104, 104, Statics.field4929.method2672());
            Statics.field1793 = Statics.field1342;
            Statics.field1067 = new class565(512, 512);
            class79.method3267(30, class382.field4151);
            method5747(class96.field1177);
        } else if (field604 == class96.field1177) {
            if (!Statics.field355.method6805()) {
                class79.method3267(40, class382.field4160 + Statics.field355.method6741() + "%");
            } else if (Statics.field1739.method6805()) {
                class388 var52 = Statics.field355;
                Statics.field2290 = var52;
                class201.method3511(Statics.field355);
                class388 var53 = Statics.field355;
                class388 var54 = Statics.field3791;
                Statics.field1938 = var53;
                Statics.field1927 = var54;
                Statics.field1940 = Statics.field1938.method6792(3);
                class210.method3285(Statics.field355, Statics.field3791, field520);
                class388 var55 = Statics.field355;
                class388 var56 = Statics.field3791;
                Statics.field2038 = var55;
                Statics.field2044 = var56;
                class388 var57 = Statics.field355;
                Statics.field2136 = var57;
                class388 var58 = Statics.field355;
                class388 var59 = Statics.field3791;
                boolean var60 = field640;
                class435 var61 = Statics.field1830;
                Statics.field3694 = var58;
                Statics.field2261 = var59;
                Statics.field1981 = var60;
                Statics.field1814 = Statics.field3694.method6792(10);
                Statics.field3680 = var61;
                class213.method5222(Statics.field355, Statics.field111, Statics.field2889);
                class200.method3593(Statics.field355, Statics.field3791);
                class204.method3499(Statics.field355);
                Statics.method8346(Statics.field355);
                Statics.field2371 = new class354(Statics.field3581, Statics.field3791, Statics.field479, Statics.field1540, Statics.field1535);
                class388 var62 = Statics.field355;
                Statics.field1872 = var62;
                class388 var63 = Statics.field355;
                Statics.field1972 = var63;
                class185.method4118(Statics.field355);
                class388 var64 = Statics.field355;
                class206.method5633(Statics.field355);
                class388 var65 = Statics.field355;
                Statics.field5349 = var65;
                class388 var66 = Statics.field355;
                Statics.field5357 = var66;
                Statics.field842 = new class533(Statics.field3604, 54, Statics.field1329, Statics.field355);
                Statics.field478 = new class533(Statics.field3604, 47, Statics.field1329, Statics.field355);
                Statics.field2460 = new class115();
                class208.method2394(Statics.field355, Statics.field479, Statics.field1540);
                class388 var67 = Statics.field355;
                class388 var68 = Statics.field479;
                Statics.field1948 = var67;
                Statics.field1953 = var68;
                class388 var69 = Statics.field355;
                class388 var70 = Statics.field479;
                Statics.field1667 = var70;
                if (var69.method6805()) {
                    Statics.field4937 = var69.method6792(35);
                    Statics.field1911 = new class184[Statics.field4937];
                    for (int var71 = 0; var71 < Statics.field4937; var71++) {
                        byte[] var72 = var69.method6782(35, var71);
                        Statics.field1911[var71] = new class184(var71);
                        if (var72 != null) {
                            Statics.field1911[var71].method3476(new class551(var72));
                            Statics.field1911[var71].method3463();
                        }
                    }
                }
                class79.method3267(50, class382.field4161);
                method5747(class96.field1183);
            } else {
                class79.method3267(40, class382.field4160 + (80 + Statics.field1961.method6741() / 6) + "%");
            }
        } else if (field604 == class96.field1183) {
            int var73 = 0;
            if (Statics.field1509 == null) {
                Statics.field1509 = class566.method8084(Statics.field479, Statics.field1732.field5058, 0);
            } else {
                var73++;
            }
            if (Statics.field1786 == null) {
                Statics.field1786 = class566.method8084(Statics.field479, Statics.field1732.field5056, 0);
            } else {
                var73++;
            }
            if (Statics.field3069 == null) {
                class388 var74 = Statics.field479;
                int var75 = Statics.field1732.field5057;
                class564[] var76;
                if (class566.method8328(var74, var75, 0)) {
                    var76 = class566.method2824();
                } else {
                    var76 = null;
                }
                Statics.field3069 = var76;
            } else {
                var73++;
            }
            if (Statics.field5318 == null) {
                Statics.field5318 = class566.method3068(Statics.field479, Statics.field1732.field5069, 0);
            } else {
                var73++;
            }
            if (Statics.field1530 == null) {
                Statics.field1530 = class566.method3068(Statics.field479, Statics.field1732.field5070, 0);
            } else {
                var73++;
            }
            if (Statics.field3244 == null) {
                Statics.field3244 = class566.method3068(Statics.field479, Statics.field1732.field5060, 0);
            } else {
                var73++;
            }
            if (Statics.field1761 == null) {
                Statics.field1761 = class566.method3068(Statics.field479, Statics.field1732.field5061, 0);
            } else {
                var73++;
            }
            if (Statics.field3063 == null) {
                Statics.field3063 = class566.method3068(Statics.field479, Statics.field1732.field5066, 0);
            } else {
                var73++;
            }
            if (Statics.field1594 == null) {
                Statics.field1594 = class566.method3068(Statics.field479, Statics.field1732.field5063, 0);
            } else {
                var73++;
            }
            if (Statics.field2395 == null) {
                class388 var77 = Statics.field479;
                int var78 = Statics.field1732.field5064;
                class564[] var79;
                if (class566.method8328(var77, var78, 0)) {
                    var79 = class566.method2824();
                } else {
                    var79 = null;
                }
                Statics.field2395 = var79;
            } else {
                var73++;
            }
            if (Statics.field4674 == null) {
                class388 var80 = Statics.field479;
                int var81 = Statics.field1732.field5065;
                class564[] var82;
                if (class566.method8328(var80, var81, 0)) {
                    var82 = class566.method2824();
                } else {
                    var82 = null;
                }
                Statics.field4674 = var82;
            } else {
                var73++;
            }
            if (var73 < 11) {
                class79.method3267(70, class382.field4327 + var73 * 100 / 12 + "%");
            } else {
                Statics.field4819 = Statics.field4674;
                Statics.field1786.method9418();
                int var83 = (int) (Math.random() * 21.0D) - 10;
                int var84 = (int) (Math.random() * 21.0D) - 10;
                int var85 = (int) (Math.random() * 21.0D) - 10;
                int var86 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3069[0].method9405(var83 + var86, var84 + var86, var85 + var86);
                class79.method3267(60, class382.field4163);
                method5747(class96.field1187);
            }
        } else if (field604 == class96.field1187) {
            if (Statics.field1214.method6805()) {
                Statics.field939 = new class252(Statics.field1214, Statics.field479, 20, Statics.field4929.method2705(), field520 ? 64 : 128);
                class240.method4328(Statics.field939);
                class240.method4329(Statics.field4929.method2705());
                method5747(class96.field1181);
            } else {
                class79.method3267(70, class382.field4164 + "0%");
            }
        } else if (field604 == class96.field1181) {
            int var87 = Statics.field939.method4759();
            if (var87 < 100) {
                class79.method3267(80, class382.field4164 + var87 + "%");
            } else {
                class79.method3267(90, class382.field4341);
                method5747(class96.field1186);
            }
        } else if (field604 == class96.field1186) {
            Statics.field1312 = new class92();
            Statics.field170.method4099(Statics.field1312, 10);
            class79.method3267(92, class382.field4166);
            method5747(class96.field1182);
        } else if (field604 == class96.field1182) {
            if (Statics.field2368.method6801("huffman", "")) {
                class365 var88 = new class365(Statics.field2368.method6800("huffman", ""));
                class366.method7826(var88);
                class79.method3267(94, class382.field4168);
                method5747(class96.field1188);
            } else {
                class79.method3267(94, class382.field4167 + "%");
            }
        } else if (field604 == class96.field1188) {
            if (!Statics.field3581.method6805()) {
                class79.method3267(96, class382.field4381 + Statics.field3581.method6741() * 4 / 5 + "%");
            } else if (!Statics.field1535.method6805()) {
                class79.method3267(96, class382.field4381 + Statics.field1535.method6741() * 4 / 5 + "%");
            } else if (!Statics.field1961.method6805()) {
                class79.method3267(96, class382.field4381 + (80 + Statics.field1961.method6741() / 6) + "%");
            } else if (Statics.field1540.method6805()) {
                class79.method3267(98, class382.field4170);
                if (Statics.field1961.method6799("version.dat", "")) {
                    class551 var89 = new class551(Statics.field1961.method6800("version.dat", ""));
                    var89.method9119();
                }
                method5747(class96.field1189);
            } else {
                class79.method3267(96, class382.field4381 + (96 + Statics.field1540.method6741() / 50) + "%");
            }
        } else if (field604 == class96.field1189) {
            if (Statics.field3743.method6793() <= 0 || Statics.field3743.method6802(class305.field3262.field3261)) {
                if (Statics.field1518 == null) {
                    Statics.field1518 = new class518();
                    Statics.field1518.method8472(Statics.field3743, Statics.field987, Statics.field4947, Statics.field160, field619, Statics.field3069);
                }
                class79.method3267(100, class382.field4172);
                if (Statics.field5084) {
                    method5747(class96.field1174);
                } else {
                    method5747(class96.field1190);
                }
                field576 = false;
            } else {
                class79.method3267(100, class382.field4234 + Statics.field3743.method6804(class305.field3262.field3261) / 10 + "%");
            }
        } else if (field604 == class96.field1174) {
            Statics.field294 = false;
            method7976(20);
            method3373(class69.field512);
        }
    }

    @ObfuscatedName("mx.ht(Lda;I)V")
    public static void method5747(class96 arg0) {
        if (field604 != arg0) {
            field604 = arg0;
        }
    }

    @ObfuscatedName("dm.hh(IZZZZI)Lof;")
    public static class388 method2420(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class486 var5 = null;
        if (class221.field2387 != null) {
            var5 = new class486(arg0, class221.field2387, Statics.field2351[arg0], 1000000);
        }
        return new class388(var5, Statics.field4460, Statics.field5261, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("oe.hv(IZZZZZI)Lof;")
    public static class388 method6692(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
        class486 var6 = null;
        if (class221.field2387 != null) {
            var6 = new class486(arg0, class221.field2387, Statics.field2351[arg0], 1000000);
        }
        return new class388(var6, Statics.field4460, Statics.field5261, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("client.hl(I)V")
    public final void method1226() {
        class482 var1 = field582.method2958();
        class550 var2 = field582.field1492;
        try {
            if (Statics.field81 == class69.field508) {
                if (Statics.field70 == null && (field740.method2271() || field555 > 250)) {
                    Statics.field70 = field740.method2261();
                    field740.method2260();
                    field740 = null;
                }
                if (Statics.field70 != null) {
                    if (var1 != null) {
                        var1.method8198();
                        var1 = null;
                    }
                    Statics.field5045 = null;
                    field541 = false;
                    field555 = 0;
                    if (!field559.method9270()) {
                        method3373(class69.field489);
                    } else if (this.method1240()) {
                        try {
                            this.method1218(Statics.field4074);
                            method3373(class69.field510);
                        } catch (Throwable var73) {
                            class577.method3409((String) null, var73);
                            method703(65);
                            return;
                        }
                    } else if (this.method1243()) {
                        try {
                            this.method1220(Statics.field3599, Statics.field4964);
                            method3373(class69.field509);
                        } catch (Exception var72) {
                            class577.method3409((String) null, var72);
                            method703(65);
                            return;
                        }
                    } else {
                        method703(65);
                        return;
                    }
                }
            }
            if (Statics.field81 == class69.field510) {
                if (this.field569 == null) {
                    if (this.field567 == null) {
                        method703(65);
                        return;
                    }
                    if (!this.field567.method258()) {
                        return;
                    }
                    if (this.field567.method257()) {
                        class577.method3409(this.field567.method268(), (Throwable) null);
                        method703(65);
                        this.field567 = null;
                        return;
                    }
                    class21 var7 = this.field567.method259();
                    if (var7.method284() != 200) {
                        method703(65);
                        this.field567 = null;
                        return;
                    }
                    field555 = 0;
                    class498 var8 = new class498(var7.method286());
                    try {
                        Statics.field237 = var8.method8321().getString("access_token");
                        Statics.field4074 = var8.method8321().getString("refresh_token");
                    } catch (Exception var70) {
                        class577.method3409("Error parsing tokens", var70);
                        method703(65);
                        this.field567 = null;
                        return;
                    }
                } else if (this.field569.isDone()) {
                    if (this.field569.isCancelled()) {
                        method703(65);
                        this.field569 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field569.get();
                        if (!var5.isSuccess()) {
                            method703(65);
                            this.field569 = null;
                            return;
                        }
                        Statics.field237 = var5.getAccessToken();
                        Statics.field4074 = var5.getRefreshToken();
                        this.field569 = null;
                    } catch (Exception var71) {
                        class577.method3409((String) null, var71);
                        method703(65);
                        this.field569 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1260(Statics.field237);
                method3373(class69.field509);
            }
            if (Statics.field81 == class69.field509) {
                if (this.field564 == null) {
                    if (this.field562 == null) {
                        method703(65);
                        return;
                    }
                    if (!this.field562.method258()) {
                        return;
                    }
                    if (this.field562.method257()) {
                        class577.method3409(this.field562.method268(), (Throwable) null);
                        method703(65);
                        this.field562 = null;
                        return;
                    }
                    class21 var12 = this.field562.method259();
                    if (var12.method284() != 200) {
                        class577.method3409("Response code: " + var12.method284() + "Response body: " + var12.method286(), (Throwable) null);
                        method703(65);
                        this.field562 = null;
                        return;
                    }
                    List var13 = (List) var12.method289().get("Content-Type");
                    if (var13 != null && var13.contains(class496.field5088.method8309())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method286());
                            this.field560 = var14.getString("token");
                        } catch (JSONException var68) {
                            class577.method3409((String) null, var68);
                            method703(65);
                            this.field562 = null;
                            return;
                        }
                    } else {
                        this.field560 = var12.method286();
                    }
                    this.field562 = null;
                } else if (this.field564.isDone()) {
                    if (this.field564.isCancelled()) {
                        method703(65);
                        this.field564 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field564.get();
                        if (!var10.isSuccess()) {
                            method703(65);
                            this.field564 = null;
                            return;
                        }
                        this.field560 = var10.getToken();
                        this.field564 = null;
                    } catch (Exception var69) {
                        class577.method3409((String) null, var69);
                        method703(65);
                        this.field564 = null;
                        return;
                    }
                } else {
                    return;
                }
                field555 = 0;
                method3373(class69.field489);
            }
            if (Statics.field81 == class69.field489) {
                if (Statics.field5045 == null) {
                    Statics.field5045 = Statics.field170.method4088(Statics.field3421, Statics.field1544);
                }
                if (Statics.field5045.field2430 == 2) {
                    throw new IOException();
                }
                if (Statics.field5045.field2430 == 1) {
                    var1 = class482.method7807((Socket) Statics.field5045.field2437, 40000, 5000);
                    field582.method2944(var1);
                    Statics.field5045 = null;
                    method3373(class69.field490);
                }
            }
            if (Statics.field81 == class69.field490) {
                field582.method2964();
                class326 var16;
                if (class326.field3429 == 0) {
                    var16 = new class326();
                } else {
                    var16 = class326.field3428[--class326.field3429];
                }
                var16.field3424 = null;
                var16.field3425 = 0;
                var16.field3426 = new class550(5000);
                var16.field3426.method9022(class328.field3586.field3576);
                field582.method2943(var16);
                field582.method2942();
                var2.field5415 = 0;
                method3373(class69.field497);
            }
            if (Statics.field81 == class69.field497) {
                if (Statics.field1377 != null) {
                    Statics.field1377.method784();
                }
                if (var1.method8206(1)) {
                    int var20 = var1.method8195();
                    if (Statics.field1377 != null) {
                        Statics.field1377.method784();
                    }
                    if (var20 != 0) {
                        method703(var20);
                        return;
                    }
                    var2.field5415 = 0;
                    method3373(class69.field492);
                }
            }
            if (Statics.field81 == class69.field492) {
                if (var2.field5415 < 8) {
                    int var21 = var1.method8220();
                    if (var21 > 8 - var2.field5415) {
                        var21 = 8 - var2.field5415;
                    }
                    if (var21 > 0) {
                        var1.method8196(var2.field5413, var2.field5415, var21);
                        var2.field5415 += var21;
                    }
                }
                if (var2.field5415 == 8) {
                    var2.field5415 = 0;
                    Statics.field1460 = var2.method8980();
                    method3373(class69.field506);
                }
            }
            if (Statics.field81 == class69.field506) {
                field582.field1492.field5415 = 0;
                field582.method2964();
                class550 var22 = new class550(500);
                int[] var23 = new int[] { Statics.field70.nextInt(), Statics.field70.nextInt(), Statics.field70.nextInt(), Statics.field70.nextInt() };
                var22.field5415 = 0;
                var22.method9022(1);
                var22.method8960(var23[0]);
                var22.method8960(var23[1]);
                var22.method8960(var23[2]);
                var22.method8960(var23[3]);
                var22.method8962(Statics.field1460);
                if (field528 == 40) {
                    var22.method8960(field575[0]);
                    var22.method8960(field575[1]);
                    var22.method8960(field575[2]);
                    var22.method8960(field575[3]);
                } else {
                    if (field528 == 50) {
                        var22.method9022(class131.field1551.method32());
                        var22.method8960(Statics.field1038);
                    } else {
                        var22.method9022(field558.method32());
                        switch(field558.field1549) {
                            case 0:
                                var22.method8960(Statics.field4929.method2628(class79.field967));
                            case 1:
                            default:
                                break;
                            case 2:
                            case 4:
                                var22.method9196(Statics.field353);
                                var22.field5415++;
                                break;
                            case 3:
                                var22.field5415 += 4;
                        }
                    }
                    if (field559.method9270()) {
                        var22.method9022(class556.field5468.method32());
                        var22.method8964(this.field560);
                    } else {
                        var22.method9022(class556.field5473.method32());
                        var22.method8964(class79.field968);
                    }
                }
                var22.method9000(class78.field944, class78.field941);
                field575 = var23;
                class326 var24;
                if (class326.field3429 == 0) {
                    var24 = new class326();
                } else {
                    var24 = class326.field3428[--class326.field3429];
                }
                var24.field3424 = null;
                var24.field3425 = 0;
                var24.field3426 = new class550(5000);
                var24.field3426.field5415 = 0;
                if (field528 == 40) {
                    var24.field3426.method9022(class328.field3574.field3576);
                } else {
                    var24.field3426.method9022(class328.field3575.field3576);
                }
                var24.field3426.method8958(0);
                int var28 = var24.field3426.field5415;
                var24.field3426.method8960(225);
                var24.field3426.method8960(1);
                var24.field3426.method9022(field522);
                var24.field3426.method9022(field523);
                byte var29 = 0;
                var24.field3426.method9022(var29);
                var24.field3426.method8967(var22.field5413, 0, var22.field5415);
                int var30 = var24.field3426.field5415;
                var24.field3426.method8964(class79.field967);
                var24.field3426.method9022((field527 ? 1 : 0) << 1 | (field520 ? 1 : 0));
                var24.field3426.method8958(Statics.field1721);
                var24.field3426.method8958(Statics.field1500);
                method413(var24.field3426);
                var24.field3426.method8964(Statics.field5092);
                var24.field3426.method8960(Statics.field2353);
                var24.field3426.method9022(0);
                class551 var31 = new class551(Statics.field3005.method8388());
                Statics.field3005.method8387(var31);
                var24.field3426.method8967(var31.field5413, 0, var31.field5413.length);
                var24.field3426.method9022(field522);
                var24.field3426.method8960(0);
                if (Statics.field5084) {
                    var24.field3426.method8960(Statics.field1993.field4560);
                    var24.field3426.method9027(Statics.field479.field4560);
                    var24.field3426.method9027(Statics.field1579.field4560);
                    var24.field3426.method9013(Statics.field1540.field4560);
                    var24.field3426.method9029(Statics.field2368.field4560);
                    var24.field3426.method9029(Statics.field426.field4560);
                    var24.field3426.method9027(Statics.field113.field4560);
                } else {
                    var24.field3426.method9029(Statics.field3743.field4560);
                    var24.field3426.method8960(Statics.field1993.field4560);
                    var24.field3426.method9029(Statics.field1579.field4560);
                    var24.field3426.method8960(Statics.field355.field4560);
                    var24.field3426.method8960(0);
                    var24.field3426.method9029(Statics.field111.field4560);
                    var24.field3426.method9029(Statics.field113.field4560);
                    var24.field3426.method9027(Statics.field2368.field4560);
                    var24.field3426.method9027(Statics.field4947.field4560);
                    var24.field3426.method9013(Statics.field2889.field4560);
                    var24.field3426.method8960(Statics.field1961.field4560);
                    var24.field3426.method9013(Statics.field461.field4560);
                    var24.field3426.method9027(Statics.field3581.field4560);
                    var24.field3426.method9029(Statics.field987.field4560);
                    var24.field3426.method9027(Statics.field479.field4560);
                    var24.field3426.method9029(Statics.field4712.field4560);
                    var24.field3426.method9013(Statics.field3791.field4560);
                    var24.field3426.method9029(Statics.field3691.field4560);
                    var24.field3426.method9013(Statics.field426.field4560);
                    var24.field3426.method9027(Statics.field1540.field4560);
                    var24.field3426.method8960(Statics.field1214.field4560);
                }
                var24.field3426.method8998(var23, var30, var24.field3426.field5415);
                var24.field3426.method8970(var24.field3426.field5415 - var28);
                field582.method2943(var24);
                field582.method2942();
                field582.field1486 = new class568(var23);
                int[] var32 = new int[4];
                for (int var33 = 0; var33 < 4; var33++) {
                    var32[var33] = var23[var33] + 50;
                }
                var2.method8915(var32);
                method3373(class69.field494);
            }
            if (Statics.field81 == class69.field494 && var1.method8220() > 0) {
                int var34 = var1.method8195();
                if (var34 == 61) {
                    int var35 = var1.method8220();
                    Statics.field110 = var35 == 1 && var1.method8195() == 1;
                    method3373(class69.field506);
                }
                if (var34 == 21 && field528 == 20) {
                    method3373(class69.field496);
                } else if (var34 == 2) {
                    if (Statics.field5084) {
                        method3373(class69.field511);
                    } else {
                        method3373(class69.field502);
                    }
                } else if (var34 == 15 && field528 == 40) {
                    field582.field1488 = -1;
                    method3373(class69.field500);
                } else if (var34 == 64) {
                    method3373(class69.field498);
                } else if (var34 == 23 && field556 < 1) {
                    field556++;
                    method3373(class69.field508);
                } else if (var34 == 29) {
                    method3373(class69.field504);
                } else if (var34 == 69) {
                    method3373(class69.field495);
                } else {
                    method703(var34);
                    return;
                }
            }
            if (Statics.field81 == class69.field511) {
                Statics.field294 = true;
                method5747(class96.field1176);
                method7976(0);
            }
            if (Statics.field81 == class69.field495 && var1.method8220() >= 2) {
                var1.method8196(var2.field5413, 0, 2);
                var2.field5415 = 0;
                Statics.field4706 = var2.method9119();
                method3373(class69.field488);
            }
            if (Statics.field81 == class69.field488 && var1.method8220() >= Statics.field4706) {
                var2.field5415 = 0;
                var1.method8196(var2.field5413, var2.field5415, Statics.field4706);
                class7[] var36 = new class7[] { class7.field11 };
                class7 var37 = var36[var2.method8955()];
                try {
                    switch(var37.field9) {
                        case 0:
                            class1 var38 = new class1();
                            this.field667 = new class8(var2, var38);
                            method3373(class69.field493);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var67) {
                    method703(22);
                    return;
                }
            }
            if (Statics.field81 == class69.field493 && this.field667.method42()) {
                this.field585 = this.field667.method55();
                this.field667.method43();
                this.field667 = null;
                if (this.field585 == null) {
                    method703(22);
                    return;
                }
                field582.method2964();
                class326 var41;
                if (class326.field3429 == 0) {
                    var41 = new class326();
                } else {
                    var41 = class326.field3428[--class326.field3429];
                }
                var41.field3424 = null;
                var41.field3425 = 0;
                var41.field3426 = new class550(5000);
                var41.field3426.method9022(class328.field3573.field3576);
                var41.field3426.method8958(this.field585.field5415);
                var41.field3426.method8968(this.field585);
                field582.method2943(var41);
                field582.method2942();
                this.field585 = null;
                method3373(class69.field494);
            }
            if (Statics.field81 == class69.field498 && var1.method8220() > 0) {
                Statics.field3783 = var1.method8195();
                method3373(class69.field499);
            }
            if (Statics.field81 == class69.field499 && var1.method8220() >= Statics.field3783) {
                var1.method8196(var2.field5413, 0, Statics.field3783);
                var2.field5415 = 0;
                method3373(class69.field494);
            }
            if (Statics.field81 == class69.field496 && var1.method8220() > 0) {
                field557 = (var1.method8195() + 3) * 60;
                method3373(class69.field501);
            }
            if (Statics.field81 == class69.field501) {
                field555 = 0;
                class79.method2249(class382.field4179, class382.field4180, field557 / 60 + class382.field4181);
                if (--field557 <= 0) {
                    method3373(class69.field508);
                }
            } else if (Statics.field81 == class69.field512) {
                class326 var45;
                if (class326.field3429 == 0) {
                    var45 = new class326();
                } else {
                    var45 = class326.field3428[--class326.field3429];
                }
                var45.field3424 = null;
                var45.field3425 = 0;
                var45.field3426 = new class550(5000);
                var45.field3426.method9022(class328.field3578.field3576);
                var45.field3426.method8958(class328.field3578.field3577);
                method3412(var45);
                field582.method2943(var45);
                field582.method2942();
                method3373(class69.field502);
            } else {
                if (Statics.field81 == class69.field502 && var1.method8220() >= 1) {
                    Statics.field1870 = var1.method8195();
                    if (Statics.field1870 != class328.field3579.field3577) {
                        method703(Statics.field1870);
                        return;
                    }
                    method3373(class69.field503);
                }
                if (Statics.field81 == class69.field503 && var1.method8220() >= Statics.field1870) {
                    boolean var49 = var1.method8195() == 1;
                    var1.method8196(var2.field5413, 0, 4);
                    var2.field5415 = 0;
                    boolean var50 = false;
                    if (var49) {
                        int var51 = var2.method8918() << 24;
                        int var52 = var51 | var2.method8918() << 16;
                        int var53 = var52 | var2.method8918() << 8;
                        int var54 = var53 | var2.method8918();
                        Statics.field4929.method2631(class79.field967, var54);
                    }
                    if (field573) {
                        Statics.field4929.method2620(class79.field967);
                    } else {
                        Statics.field4929.method2620((String) null);
                    }
                    class103.method166();
                    field689 = var1.method8195();
                    field691 = var1.method8195() == 1;
                    field652 = var1.method8195();
                    field652 <<= 0x8;
                    field652 += var1.method8195();
                    field566 = var1.method8195();
                    var1.method8196(var2.field5413, 0, 8);
                    var2.field5415 = 0;
                    this.field660 = var2.method8980();
                    var1.method8196(var2.field5413, 0, 8);
                    var2.field5415 = 0;
                    field647 = var2.method8980();
                    var1.method8196(var2.field5413, 0, 8);
                    var2.field5415 = 0;
                    field615 = var2.method8980();
                    class226.method2488().method4137(this.field565);
                    method3373(class69.field505);
                }
                if (Statics.field81 == class69.field505 && var1.method8220() >= field582.field1488) {
                    var1.method8196(var2.field5413, 0, 1);
                    var2.field5415 = 0;
                    if (var2.method8942()) {
                        var1.method8196(var2.field5413, 1, 1);
                        var2.field5415 = 0;
                    }
                    class327[] var55 = class327.method5694();
                    int var56 = var2.method8914();
                    if (var56 < 0 || var56 >= var55.length) {
                        throw new IOException("Invalid ServerProt: " + var56 + " at " + var2.field5415);
                    }
                    field582.field1487 = var55[var56];
                    field582.field1488 = field582.field1487.field3572;
                    var1.method8196(var2.field5413, 0, 2);
                    var2.field5415 = 0;
                    field582.field1488 = var2.method9119();
                    try {
                        client var57 = Statics.field3;
                        JSObject.getWindow(var57).call("zap", (Object[]) null);
                    } catch (Throwable var66) {
                    }
                    method3373(class69.field491);
                }
                if (Statics.field81 != class69.field491) {
                    if (Statics.field81 == class69.field504 && var1.method8220() >= 2) {
                        var2.field5415 = 0;
                        var1.method8196(var2.field5413, 0, 2);
                        var2.field5415 = 0;
                        Statics.field1020 = var2.method9119();
                        method3373(class69.field507);
                    }
                    if (Statics.field81 == class69.field507 && var1.method8220() >= Statics.field1020) {
                        var2.field5415 = 0;
                        var1.method8196(var2.field5413, 0, Statics.field1020);
                        var2.field5415 = 0;
                        String var59 = var2.method9166();
                        String var60 = var2.method9166();
                        String var61 = var2.method9166();
                        class79.method2249(var59, var60, var61);
                        method7976(10);
                        if (field559.method9270()) {
                            class79.method1207(9);
                        }
                    }
                    if (Statics.field81 == class69.field500) {
                        if (field582.field1488 == -1) {
                            if (var1.method8220() < 2) {
                                return;
                            }
                            var1.method8196(var2.field5413, 0, 2);
                            var2.field5415 = 0;
                            field582.field1488 = var2.method9119();
                        }
                        if (var1.method8220() >= field582.field1488) {
                            var1.method8196(var2.field5413, 0, field582.field1488);
                            var2.field5415 = 0;
                            int var62 = field582.field1488;
                            field668.method7890();
                            field582.method2964();
                            field582.field1492.field5415 = 0;
                            field582.field1487 = null;
                            field582.field1493 = null;
                            field582.field1489 = null;
                            field582.field1494 = null;
                            field582.field1488 = 0;
                            field582.field1490 = 0;
                            field539 = 0;
                            field666.field5551 = 0;
                            field813 = false;
                            field764 = 0;
                            field758 = 0;
                            Statics.field1342.method2719();
                            class88.field1083 = new class524(32);
                            method7976(30);
                            for (int var63 = 0; var63 < 100; var63++) {
                                field731[var63] = true;
                            }
                            if (field582 != null && field582.field1486 != null) {
                                class326 var64 = class326.method3199(class324.field3358, field582.field1486);
                                var64.field3426.method9022(method2290());
                                var64.field3426.method8958(Statics.field1721);
                                var64.field3426.method8958(Statics.field1500);
                                field582.method2943(var64);
                            }
                            field718.method2833(var2);
                            if (var2.field5415 != var62) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field555++;
                        if (field555 > 2000) {
                            if (field556 < 1) {
                                if (Statics.field1544 == Statics.field137) {
                                    Statics.field1544 = Statics.field3145;
                                } else {
                                    Statics.field1544 = Statics.field137;
                                }
                                field556++;
                                method3373(class69.field508);
                            } else {
                                method703(-3);
                            }
                        }
                    }
                } else if (var1.method8220() >= field582.field1488) {
                    var2.field5415 = 0;
                    var1.method8196(var2.field5413, 0, field582.field1488);
                    field668.method7874();
                    method8344();
                    field718.method2833(var2);
                    Statics.field1791 = Statics.field4826;
                    Statics.field1192 = -1;
                    Statics.method1177(false, var2);
                    field582.field1487 = null;
                    field529 = false;
                }
            }
        } catch (IOException var74) {
            if (field556 < 1) {
                if (Statics.field1544 == Statics.field137) {
                    Statics.field1544 = Statics.field3145;
                } else {
                    Statics.field1544 = Statics.field137;
                }
                field556++;
                method3373(class69.field508);
            } else {
                method703(-2);
            }
        }
    }

    @ObfuscatedName("gw.ha(Lmq;I)V")
    public static void method3412(class326 arg0) {
        arg0.field3426.method8960(Statics.field3743.field4560);
        arg0.field3426.method8960(Statics.field355.field4560);
        arg0.field3426.method9029(Statics.field111.field4560);
        arg0.field3426.method9029(Statics.field3791.field4560);
        arg0.field3426.method9029(Statics.field4712.field4560);
        arg0.field3426.method8960(Statics.field1961.field4560);
        arg0.field3426.method9013(Statics.field461.field4560);
        arg0.field3426.method8960(Statics.field3691.field4560);
        arg0.field3426.method9013(Statics.field3581.field4560);
        arg0.field3426.method9013(Statics.field1214.field4560);
        arg0.field3426.method9013(0);
        arg0.field3426.method9029(Statics.field2889.field4560);
        arg0.field3426.method9013(Statics.field4947.field4560);
        arg0.field3426.method9029(Statics.field987.field4560);
    }

    @ObfuscatedName("tm.hx(I)V")
    public static void method8344() {
        field798 = 1L;
        if (Statics.field1312 != null) {
            Statics.field1312.field1117 = 0;
        }
        Statics.field1877 = true;
        field538 = true;
        field749 = -1L;
        class37.field224 = new class412();
        field582.method2964();
        field582.field1492.field5415 = 0;
        field582.field1487 = null;
        field582.field1493 = null;
        field582.field1489 = null;
        field582.field1494 = null;
        field582.field1488 = 0;
        field582.field1490 = 0;
        field539 = 0;
        field583 = 0;
        field540 = 0;
        field666.field5551 = 0;
        field813 = false;
        class36.method8829(0);
        class116.method6021();
        field674 = 0;
        field768 = false;
        field766 = 0;
        field672 = 0;
        field612 = 0;
        Statics.field4543 = null;
        field764 = 0;
        field757 = -1;
        field758 = 0;
        field690 = 0;
        field548 = class109.field1410;
        field549 = class109.field1410;
        field593.method2495();
        field718.method2844();
        Statics.field4723.method1907();
        if (Statics.field1889 > 5000) {
        }
        if (field576) {
            class351.method5760();
        } else {
            for (int var0 = 0; var0 < Statics.field1889; var0++) {
                class182 var1 = class182.method3054(var0);
                if (var1 != null) {
                    class351.field3750[var0] = 0;
                    class351.field3752[var0] = 0;
                }
            }
        }
        if (Statics.field2460 != null) {
            Statics.field2460.method2914();
        }
        field570 = -1;
        if (field681 != -1) {
            Statics.field2371.method6145(field681);
        }
        for (class90 var2 = (class90) field682.method8691(); var2 != null; var2 = (class90) field682.method8692()) {
            method3240(var2, true);
        }
        field681 = -1;
        field682 = new class524(8);
        field686 = null;
        field666.field5551 = 0;
        field813 = false;
        field790.method6204((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var3 = 0; var3 < 8; var3++) {
            field656[var3] = null;
            field657[var3] = false;
        }
        class88.field1083 = new class524(32);
        field574 = true;
        for (int var4 = 0; var4 < 100; var4++) {
            field731[var4] = true;
        }
        if (field582 != null && field582.field1486 != null) {
            class326 var5 = class326.method3199(class324.field3358, field582.field1486);
            var5.field3426.method9022(method2290());
            var5.field3426.method8958(Statics.field1721);
            var5.field3426.method8958(Statics.field1500);
            field582.method2943(var5);
        }
        Statics.field1824 = null;
        Statics.field3189 = null;
        Arrays.fill(field755, (Object) null);
        Statics.field1813 = null;
        Arrays.fill(field704, (Object) null);
        for (int var6 = 0; var6 < 8; var6++) {
            field803[var6] = new class400();
        }
        Statics.field421 = null;
        field794 = 0;
        field795 = 0;
        field796 = 0;
        field797 = 0;
    }

    @ObfuscatedName("by.ho(II)V")
    public static void method703(int arg0) {
        int var1 = class79.field962;
        if (arg0 == -3) {
            class79.method2249(class382.field4182, class382.field4183, class382.field4184);
        } else if (arg0 == -2) {
            class79.method2249(class382.field4185, class382.field4367, class382.field4371);
        } else if (arg0 == -1) {
            class79.method2249(class382.field4186, class382.field4189, class382.field4190);
        } else if (arg0 == 3) {
            class79.method1207(3);
            class79.field961 = 1;
        } else if (arg0 == 4) {
            class79.method1207(14);
            class79.field960 = 0;
        } else if (arg0 == 5) {
            class79.field961 = 2;
            class79.method2249(class382.field4194, class382.field4195, class382.field4193);
        } else if (arg0 == 68) {
            if (!field529) {
                field529 = true;
                method6019();
                return;
            }
            class79.method2249(class382.field4199, class382.field4198, class382.field4212);
        } else if (!field524 && arg0 == 6) {
            class79.method2249(class382.field4199, class382.field4198, class382.field4212);
        } else if (arg0 == 7) {
            class79.method2249(class382.field4403, class382.field4346, class382.field4165);
        } else if (arg0 == 8) {
            class79.method2249(class382.field4203, class382.field4356, class382.field4141);
        } else if (arg0 == 9) {
            class79.method2249(class382.field4206, class382.field4402, class382.field4208);
        } else if (arg0 == 10) {
            class79.method2249(class382.field4209, class382.field4319, class382.field4250);
        } else if (arg0 == 11) {
            class79.method2249(class382.field4420, class382.field4201, class382.field4214);
        } else if (arg0 == 12) {
            class79.method2249(class382.field4215, class382.field4216, class382.field4368);
        } else if (arg0 == 13) {
            class79.method2249(class382.field4136, class382.field4219, class382.field4220);
        } else if (arg0 == 14) {
            class79.method2249(class382.field4221, class382.field4222, class382.field4233);
        } else if (arg0 == 16) {
            class79.method2249(class382.field4362, class382.field4225, class382.field4226);
            class79.method1207(33);
        } else if (arg0 == 17) {
            class79.method2249(class382.field4227, class382.field4228, class382.field4229);
        } else if (arg0 == 18) {
            class79.method1207(14);
            class79.field960 = 1;
        } else if (arg0 == 19) {
            class79.method2249(class382.field4312, class382.field4150, class382.field4252);
        } else if (arg0 == 20) {
            class79.method2249(class382.field4236, class382.field4237, class382.field4238);
        } else if (arg0 == 22) {
            class79.method2249(class382.field4239, class382.field4240, class382.field4241);
        } else if (arg0 == 23) {
            class79.method2249(class382.field4303, class382.field4243, class382.field4138);
        } else if (arg0 == 24) {
            class79.method2249(class382.field4245, class382.field4235, class382.field4247);
        } else if (arg0 == 25) {
            class79.method2249(class382.field4248, class382.field4296, class382.field4424);
        } else if (arg0 == 26) {
            class79.method2249(class382.field4251, class382.field4427, class382.field4148);
        } else if (arg0 == 27) {
            class79.method2249(class382.field4379, class382.field4255, class382.field4407);
        } else if (arg0 == 31) {
            class79.method2249(class382.field4263, class382.field4264, class382.field4265);
        } else if (arg0 == 32) {
            class79.method1207(14);
            class79.field960 = 2;
        } else if (arg0 == 37) {
            class79.method2249(class382.field4269, class382.field4270, class382.field4271);
        } else if (arg0 == 38) {
            class79.method2249(class382.field4272, class382.field4299, class382.field4274);
        } else if (arg0 == 74) {
            class79.method2249(class382.field4275, class382.field4405, class382.field4277);
        } else if (arg0 == 55) {
            class79.method1207(8);
        } else if (arg0 == 56) {
            class79.method2249(class382.field4282, class382.field4283, class382.field4211);
            method7976(11);
            return;
        } else if (arg0 == 57) {
            class79.method2249(class382.field4285, class382.field4286, class382.field4287);
            method7976(11);
            return;
        } else if (arg0 == 61) {
            class79.method2249("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class79.method1207(7);
        } else if (arg0 == 62) {
            method7976(10);
            class79.method1207(9);
            class79.method2249(class382.field4288, class382.field4289, class382.field4290);
            return;
        } else if (arg0 == 63) {
            method7976(10);
            class79.method1207(9);
            class79.method2249(class382.field4415, class382.field4385, class382.field4144);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method7976(10);
            class79.method1207(9);
            class79.method2249(class382.field4176, class382.field4295, class382.field4291);
            return;
        } else if (arg0 == 71) {
            method7976(10);
            class79.method1207(7);
            class79.method2249("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method7976(10);
            class79.method1207(6);
            class79.method2249(class382.field4425, class382.field4426, class382.field4223);
        } else if (arg0 == 72) {
            method7976(10);
            class79.method1207(32);
        } else {
            class79.method2249(class382.field4297, class382.field4302, class382.field4224);
        }
        method7976(10);
        int var4 = class79.field962;
        boolean var5 = var1 != var4;
        if (!var5 && field559.method9270()) {
            class79.method1207(9);
        }
    }

    @ObfuscatedName("bz.hs(I)V")
    public static final void method818() {
        field582.method2965();
        method3442();
        field593.method2495();
        field718.method2844();
        field680.method5060();
        System.gc();
        class335.method5635(0, 0);
        class335.method863();
        field608 = false;
        class72.method2197();
        method7976(10);
        field533 = 0;
        class226.method2488().method4139();
        class226.method2488().method4154();
    }

    @ObfuscatedName("ch.ie(IB)V")
    public static final void method1038(int arg0) {
        method818();
        switch(arg0) {
            case 1:
                class79.method1207(24);
                class79.method2249(class382.field4200, class382.field4213, class382.field4374);
                break;
            case 2:
                class79.method1207(24);
                class79.method2249(class382.field4369, class382.field4370, class382.field4218);
        }
    }

    @ObfuscatedName("fm.id(I)J")
    public static long method3266() {
        return field647;
    }

    @ObfuscatedName("ux.is(B)J")
    public static long method8834() {
        return field615;
    }

    @ObfuscatedName("gn.ia(B)V")
    public static final void method3442() {
        class189.method2803();
        class191.method6706();
        class180.method441();
        class543.method5766();
        class541.field5345.method5736();
        class190.method3191();
        class212.field2289.method5736();
        class201.field2098.method5736();
        class187.field1944.method5736();
        class187.field1949.method5736();
        class208.method38();
        class179.field1880.method5736();
        class186.field1929.method5736();
        class177.field1871.method5736();
        class210.field2173.method5736();
        class210.field2174.method5736();
        class210.field2175.method5736();
        class210.field2176.method5736();
        class184.field1920.method5736();
        class192.field1980.method5736();
        class195.field2006.method5736();
        class195.field2026.method5736();
        class211.method3825();
        class206.method3447();
        class213.method3704();
        class200.field2081.method5736();
        class200.field2087.method5736();
        class207.method3258();
        class204.method3432();
        if (Statics.field842 != null) {
            Statics.field842.method8793();
        }
        if (Statics.field478 != null) {
            Statics.field478.method8793();
        }
        class196.method4734();
        class198.method868();
        class185.method3060();
        class183.field1897.method5736();
        class178.field1876.method5736();
        class181.method3002();
        class205.method438();
        class182.method3613();
        class202.field2105.method5736();
        field806.method5736();
        field807.method5736();
        class360.field3803.method5736();
        class360.field3806.method7964();
        class360.field3807 = 0;
        if (Statics.field2371 != null) {
            Statics.field2371.method6135();
        }
        if (class240.field2589.field2905 != null) {
            ((class252) class240.field2589.field2905).method4761();
        }
        class82.method3201();
        field805.method7964();
        if (Statics.field111 != null) {
            Statics.field111.method6780();
        }
        if (Statics.field2889 != null) {
            Statics.field2889.method6780();
        }
        if (Statics.field2368 != null) {
            Statics.field2368.method6780();
        }
        if (Statics.field1961 != null) {
            Statics.field1961.method6780();
        }
        if (Statics.field355 != null) {
            Statics.field355.method6780();
        }
        if (Statics.field1739 != null) {
            Statics.field1739.method6780();
        }
        if (Statics.field461 != null) {
            Statics.field461.method6780();
        }
        if (Statics.field1540 != null) {
            Statics.field1540.method6780();
        }
        if (Statics.field3581 != null) {
            Statics.field3581.method6780();
        }
        if (Statics.field1535 != null) {
            Statics.field1535.method6780();
        }
        if (Statics.field426 != null) {
            Statics.field426.method6780();
        }
        if (Statics.field3691 != null) {
            Statics.field3691.method6780();
        }
        if (Statics.field4712 != null) {
            Statics.field4712.method6780();
        }
        if (Statics.field1993 != null) {
            Statics.field1993.method6780();
        }
        if (Statics.field3791 != null) {
            Statics.field3791.method6780();
        }
        if (Statics.field113 != null) {
            Statics.field113.method6780();
        }
        if (Statics.field479 != null) {
            Statics.field479.method6780();
        }
        if (Statics.field1214 != null) {
            Statics.field1214.method6780();
        }
        if (Statics.field1579 != null) {
            Statics.field1579.method6780();
        }
        if (Statics.field4947 != null) {
            Statics.field4947.method6780();
        }
        if (Statics.field987 != null) {
            Statics.field987.method6780();
        }
        if (Statics.field3743 != null) {
            Statics.field3743.method6780();
        }
    }

    @ObfuscatedName("ky.if(B)V")
    public static final void method5362() {
        class186.method692();
    }

    @ObfuscatedName("og.ii(I)V")
    public static final void method6699() {
        if (field583 > 0) {
            method818();
        } else {
            field668.method7872();
            method7976(40);
            Statics.field142 = field582.method2958();
            field582.method2955();
        }
    }

    @ObfuscatedName("gs.iz(ZB)V")
    public static final void method3367(boolean arg0) {
        if (arg0) {
            field558 = class79.field974 ? class131.field1548 : class131.field1550;
        } else {
            field558 = Statics.field4929.method2648(class79.field967) ? class131.field1554 : class131.field1547;
        }
    }

    @ObfuscatedName("client.ij(B)V")
    public final void method1476() {
        if (field539 > 1) {
            field539--;
        }
        if (field583 > 0) {
            field583--;
        }
        if (field541) {
            field541 = false;
            method6699();
            return;
        }
        if (!field813) {
            method3551();
        }
        for (int var1 = 0; var1 < 100 && this.method1233(field582); var1++) {
        }
        if (field528 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field224.method7126();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field668.field4880) {
                    class326 var6 = class326.method3199(class324.field3334, field582.field1486);
                    var6.field3426.method9022(0);
                    int var7 = var6.field3426.field5415;
                    field668.method7892(var6.field3426);
                    var6.field3426.method8971(var6.field3426.field5415 - var7);
                    field582.method2943(var6);
                    field668.method7875();
                }
                Object var8 = Statics.field1312.field1116;
                synchronized (Statics.field1312.field1116) {
                    if (!field532) {
                        Statics.field1312.field1117 = 0;
                    } else if (class36.field216 != 0 || Statics.field1312.field1117 >= 40) {
                        class326 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field1312.field1117 && (var9 == null || var9.field3426.field5415 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field1312.field1119[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field1312.field1118[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field649 != var16 || field536 != var15) {
                                if (var9 == null) {
                                    var9 = class326.method3199(class324.field3350, field582.field1486);
                                    var9.field3426.method9022(0);
                                    var10 = var9.field3426.field5415;
                                    var9.field3426.field5415 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field537 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field649;
                                    var18 = var15 - field536;
                                    var19 = (int) ((Statics.field1312.field1121[var14] - field537) / 20L);
                                    var12 = (int) ((Statics.field1312.field1121[var14] - field537) % 20L + (long) var12);
                                }
                                field649 = var16;
                                field536 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3426.method8958((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3426.method9022(var19 + 128);
                                    var9.field3426.method8958((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3426.method9022(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3426.method8960(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3426.method8960(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3426.method8958((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3426.method8960(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3426.method8960(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field537 = Statics.field1312.field1121[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3426.method8971(var9.field3426.field5415 - var10);
                            int var20 = var9.field3426.field5415;
                            var9.field3426.field5415 = var10;
                            var9.field3426.method9022(var12 / var13);
                            var9.field3426.method9022(var12 % var13);
                            var9.field3426.field5415 = var20;
                            field582.method2943(var9);
                        }
                        if (var11 >= Statics.field1312.field1117) {
                            Statics.field1312.field1117 = 0;
                        } else {
                            Statics.field1312.field1117 -= var11;
                            System.arraycopy(Statics.field1312.field1118, var11, Statics.field1312.field1118, 0, Statics.field1312.field1117);
                            System.arraycopy(Statics.field1312.field1119, var11, Statics.field1312.field1119, 0, Statics.field1312.field1117);
                            System.arraycopy(Statics.field1312.field1121, var11, Statics.field1312.field1121, 0, Statics.field1312.field1117);
                        }
                    }
                }
                if (class36.field216 == 1 || !Statics.field1474 && class36.field216 == 4 || class36.field216 == 2) {
                    long var22 = class36.field200 - field798 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field798 = class36.field200 * -1L;
                    int var24 = class36.field207;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field1500) {
                        var24 = Statics.field1500;
                    }
                    int var25 = class36.field209;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field1721) {
                        var25 = Statics.field1721;
                    }
                    int var26 = (int) var22;
                    class326 var27 = class326.method3199(class324.field3388, field582.field1486);
                    var27.field3426.method8958((class36.field216 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field3426.method8958(var25);
                    var27.field3426.method8958(var24);
                    field582.method2943(var27);
                }
                if (field722 != 0) {
                    class326 var28 = class326.method3199(class324.field3378, field582.field1486);
                    var28.field3426.method8958(field722);
                    field582.method2943(var28);
                }
                if (field664.field2988 > 0) {
                    class326 var29 = class326.method3199(class324.field3380, field582.field1486);
                    var29.field3426.method8958(0);
                    int var30 = var29.field3426.field5415;
                    long var31 = class331.method3482();
                    for (int var33 = 0; var33 < field664.field2988; var33++) {
                        long var34 = var31 - field749;
                        if (var34 > 16777215L) {
                            var34 = 16777215L;
                        }
                        field749 = var31;
                        var29.field3426.method9069(field664.field2981[var33]);
                        var29.field3426.method9153((int) var34);
                    }
                    var29.field3426.method8970(var29.field3426.field5415 - var30);
                    field582.method2943(var29);
                }
                if (field621 > 0) {
                    field621--;
                }
                if (field664.method5077(96) || field664.method5077(97) || field664.method5077(98) || field664.method5077(99)) {
                    field622 = true;
                }
                if (field622 && field621 <= 0) {
                    field621 = 20;
                    field622 = false;
                    class326 var36 = class326.method3199(class324.field3375, field582.field1486);
                    var36.field3426.method9012(field781);
                    var36.field3426.method9012(field672);
                    field582.method2943(var36);
                }
                if (Statics.field1877 && !field538) {
                    field538 = true;
                    class326 var37 = class326.method3199(class324.field3377, field582.field1486);
                    var37.field3426.method9022(1);
                    field582.method2943(var37);
                }
                if (!Statics.field1877 && field538) {
                    field538 = false;
                    class326 var38 = class326.method3199(class324.field3377, field582.field1486);
                    var38.field3426.method9022(0);
                    field582.method2943(var38);
                }
                if (Statics.field1518 != null) {
                    Statics.field1518.method8431();
                }
                if (Statics.field1856) {
                    if (Statics.field1824 != null) {
                        Statics.field1824.method8098();
                    }
                    Statics.method50();
                    Statics.field1856 = false;
                }
                if (Statics.field14) {
                    Iterator var39 = field593.iterator();
                    while (var39.hasNext()) {
                        class104 var40 = (class104) var39.next();
                        for (int var41 = 0; var41 < field718.field1438; var41++) {
                            class95 var42 = Statics.field1342.field1369[field718.field1436[var41]];
                            if (var42 != null) {
                                var42.method2437();
                            }
                        }
                    }
                    Statics.field14 = false;
                }
                method333();
                if (field528 != 30) {
                    return;
                }
                Iterator var43 = field593.iterator();
                while (var43.hasNext()) {
                    class104 var44 = (class104) var43.next();
                    method5770(var44);
                }
                int var10002;
                for (int var45 = 0; var45 < field766; var45++) {
                    var10002 = field769[var45]--;
                    if (field769[var45] >= -10) {
                        class40 var47 = field750[var45];
                        if (var47 == null) {
                            class40 var10000 = (class40) null;
                            var47 = class40.method754(Statics.field426, field705[var45], 0);
                            if (var47 == null) {
                                continue;
                            }
                            field769[var45] += var47.method753();
                            field750[var45] = var47;
                        }
                        if (field769[var45] < 0) {
                            int var56;
                            if (field770[var45] == 0) {
                                var56 = Statics.field4929.method2617();
                            } else {
                                int var48 = (field770[var45] & 0xFF) * 128;
                                int var49 = field770[var45] >> 16 & 0xFF;
                                int var50 = Math.abs(class352.method6092(var49) - Statics.field4826.field1300);
                                int var51 = field770[var45] >> 8 & 0xFF;
                                int var52 = Math.abs(class352.method6092(var51) - Statics.field4826.field1225);
                                int var53 = Math.max(var50 + var52 - 128, 0);
                                int var54 = Math.max(((field628[var45] & 0x1F) - 1) * 128, 0);
                                if (var53 >= var48) {
                                    field769[var45] = -100;
                                    continue;
                                }
                                float var55 = var54 < var48 ? Math.min(Math.max((float) (var48 - var53) / (float) (var48 - var54), 0.0F), 1.0F) : 1.0F;
                                var56 = (int) (var55 * (float) Statics.field4929.method2677());
                            }
                            if (var56 > 0) {
                                class41 var57 = var47.method752().method762(Statics.field96);
                                class49 var58 = class49.method874(var57, 100, var56);
                                var58.method887(field748[var45] - 1);
                                Statics.field199.method705(var58);
                            }
                            field769[var45] = -100;
                        }
                    } else {
                        field766--;
                        for (int var46 = var45; var46 < field766; var46++) {
                            field705[var46] = field705[var46 + 1];
                            field750[var46] = field750[var46 + 1];
                            field748[var46] = field748[var46 + 1];
                            field769[var46] = field769[var46 + 1];
                            field770[var46] = field770[var46 + 1];
                            field628[var46] = field628[var46 + 1];
                        }
                        var45--;
                    }
                }
                if (field608 && !class335.method3789()) {
                    if (Statics.field4929.method2615() != 0 && class335.method4123()) {
                        class335.method3078(Statics.field1993, Statics.field4929.method2615());
                    }
                    field608 = false;
                }
                field582.field1490++;
                if (field582.field1490 > 750) {
                    method6699();
                    return;
                }
                method6705();
                method3243();
                Statics.method49();
                method3589();
                field599++;
                if (field641 != 0) {
                    field799 += 20;
                    if (field799 >= 400) {
                        field641 = 0;
                    }
                }
                class363 var59 = Statics.field3036;
                class363 var60 = Statics.field23;
                Statics.field3036 = null;
                Statics.field23 = null;
                field804 = null;
                field701 = false;
                field698 = false;
                field515 = 0;
                while (field664.method5075() && field515 < 128) {
                    if (field689 >= 2 && field664.method5077(82) && field664.field2992 == 66) {
                        StringBuilder var61 = new StringBuilder();
                        Iterator var62 = class116.field1476.iterator();
                        while (var62.hasNext()) {
                            class65 var63 = (class65) var62.next();
                            if (var63.field469 != null && !var63.field469.isEmpty()) {
                                var61.append(var63.field469).append(':');
                            }
                            var61.append(var63.field466).append('\n');
                        }
                        String var64 = var61.toString();
                        Statics.field3.method499(var64);
                    } else if (field612 != 1 || field664.field2991 <= 0) {
                        field753[field515] = field664.field2992;
                        field534[field515] = field664.field2991;
                        field515++;
                    }
                }
                if (method2399() && field664.method5077(82) && field664.method5077(81) && field722 != 0) {
                    int var66 = Statics.field4826.field1167 - field722;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 3) {
                        var66 = 3;
                    }
                    if (Statics.field4826.field1167 != var66) {
                        method8836(Statics.field1342.field1350 + Statics.field4826.field1295[0], Statics.field1342.field1357 + Statics.field4826.field1296[0], var66, false);
                    }
                    field722 = 0;
                }
                if (field681 != -1) {
                    method6022(field681, 0, 0, Statics.field1721, Statics.field1500, 0, 0);
                }
                field710++;
                while (true) {
                    class91 var67;
                    class363 var68;
                    class363 var69;
                    do {
                        var67 = (class91) field725.method7027();
                        if (var67 == null) {
                            while (true) {
                                class91 var70;
                                class363 var71;
                                class363 var72;
                                do {
                                    var70 = (class91) field726.method7027();
                                    if (var70 == null) {
                                        while (true) {
                                            class91 var73;
                                            class363 var74;
                                            class363 var75;
                                            do {
                                                var73 = (class91) field724.method7027();
                                                if (var73 == null) {
                                                    boolean var76 = false;
                                                    while (true) {
                                                        class269 var77 = (class269) field727.method7027();
                                                        if (var77 == null) {
                                                            if (!var76 && class36.field216 == 1) {
                                                                field680.method5060();
                                                            }
                                                            this.method1234();
                                                            if (Statics.field1518 != null) {
                                                                Statics.field1518.method8429(Statics.field1342.field1356, (Statics.field1791.method1197() >> 7) + Statics.field1342.field1350, (Statics.field1791.method1205() >> 7) + Statics.field1342.field1357, false);
                                                                Statics.field1518.method8458();
                                                            }
                                                            if (field693 != null) {
                                                                this.method1239();
                                                            }
                                                            boolean var78 = false;
                                                            for (int var79 = 0; var79 < Statics.field1342.field1366; var79++) {
                                                                class480 var80 = Statics.field1342.field1365[Statics.field1342.field1364[var79]];
                                                                class104 var81 = var80.field5008;
                                                                class245 var82 = var81.field1372;
                                                                if (var80 != null && var82.method4555()) {
                                                                    if (!var78) {
                                                                        int var83 = var82.field2723;
                                                                        int var84 = var82.field2677;
                                                                        class326 var85 = class326.method3199(class324.field3330, field582.field1486);
                                                                        var85.field3426.method9022(5);
                                                                        var85.field3426.method8958(var81.field1357 + var84);
                                                                        var85.field3426.method9005(field664.method5077(82) ? (field664.method5077(81) ? 2 : 1) : 0);
                                                                        var85.field3426.method9198(var81.field1350 + var83);
                                                                        field582.method2943(var85);
                                                                        var78 = true;
                                                                        field638 = class36.field209;
                                                                        field639 = class36.field207;
                                                                        field641 = 1;
                                                                        field799 = 0;
                                                                        field758 = var83;
                                                                        field690 = var84;
                                                                    }
                                                                    var82.method4556();
                                                                }
                                                            }
                                                            if (!var78 && Statics.field1342.field1372.method4555()) {
                                                                int var86 = Statics.field1342.field1372.field2723;
                                                                int var87 = Statics.field1342.field1372.field2677;
                                                                class326 var88 = class326.method3199(class324.field3330, field582.field1486);
                                                                var88.field3426.method9022(5);
                                                                var88.field3426.method8958(Statics.field1342.field1357 + var87);
                                                                var88.field3426.method9005(field664.method5077(82) ? (field664.method5077(81) ? 2 : 1) : 0);
                                                                var88.field3426.method9198(Statics.field1342.field1350 + var86);
                                                                field582.method2943(var88);
                                                                Statics.field1342.field1372.method4556();
                                                                field638 = class36.field209;
                                                                field639 = class36.field207;
                                                                field641 = 1;
                                                                field799 = 0;
                                                                field758 = var86;
                                                                field690 = var87;
                                                            }
                                                            if (var78) {
                                                                Statics.field1342.field1372.method4556();
                                                            }
                                                            if (Statics.field3036 != var59) {
                                                                if (var59 != null) {
                                                                    method2361(var59);
                                                                }
                                                                if (Statics.field3036 != null) {
                                                                    method2361(Statics.field3036);
                                                                }
                                                            }
                                                            if (Statics.field23 != var60 && field767 == field673) {
                                                                if (var60 != null) {
                                                                    method2361(var60);
                                                                }
                                                                if (Statics.field23 != null) {
                                                                    method2361(Statics.field23);
                                                                }
                                                            }
                                                            if (Statics.field23 == null) {
                                                                if (field767 > 0) {
                                                                    field767--;
                                                                }
                                                            } else if (field767 < field673) {
                                                                field767++;
                                                                if (field767 == field673) {
                                                                    method2361(Statics.field23);
                                                                }
                                                            }
                                                            if (field612 == 0) {
                                                                int var89 = Statics.field1791.method1197();
                                                                int var90 = Statics.field1791.method1205();
                                                                if (field650 != -1) {
                                                                    class95 var91 = Statics.field4826.field1169.field1369[field650];
                                                                    if (var91 != null) {
                                                                        class352 var92 = var91.method2521(Statics.field4826.field1169);
                                                                        var89 = var92.field3754;
                                                                        var90 = var92.field3756;
                                                                    }
                                                                }
                                                                int var93 = Statics.field1791.method1202();
                                                                if (Statics.field1545 - var89 < -500 || Statics.field1545 - var89 > 500 || Statics.field73 - var90 < -500 || Statics.field73 - var90 > 500) {
                                                                    Statics.field1545 = var89;
                                                                    Statics.field73 = var90;
                                                                }
                                                                if (Statics.field1545 != var89) {
                                                                    Statics.field1545 += (var89 - Statics.field1545) / 16;
                                                                }
                                                                if (Statics.field73 != var90) {
                                                                    Statics.field73 += (var90 - Statics.field73) / 16;
                                                                }
                                                                int var94 = Statics.field1545 >> 7;
                                                                int var95 = Statics.field73 >> 7;
                                                                int var96 = method3500(Statics.field1342, Statics.field1545, Statics.field73, var93);
                                                                int var97 = 0;
                                                                if (var94 > 3 && var95 > 3 && var94 < 100 && var95 < 100) {
                                                                    for (int var98 = var94 - 4; var98 <= var94 + 4; var98++) {
                                                                        for (int var99 = var95 - 4; var99 <= var95 + 4; var99++) {
                                                                            int var100 = var93;
                                                                            if (var93 < 3 && (Statics.field1342.field1360[1][var98][var99] & 0x2) == 2) {
                                                                                var100 = var93 + 1;
                                                                            }
                                                                            int var101 = var96 - Statics.field1342.field1371[var100][var98][var99];
                                                                            if (var101 > var97) {
                                                                                var97 = var101;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int var102 = var97 * 192;
                                                                if (var102 > 98048) {
                                                                    var102 = 98048;
                                                                }
                                                                if (var102 < 32768) {
                                                                    var102 = 32768;
                                                                }
                                                                if (var102 > field761) {
                                                                    field761 += (var102 - field761) / 24;
                                                                } else if (var102 < field761) {
                                                                    field761 += (var102 - field761) / 80;
                                                                }
                                                                Statics.field1699 = method3500(Statics.field1342, var89, var90, var93) - field720;
                                                            } else if (field612 == 1) {
                                                                method5639();
                                                                short var103 = -1;
                                                                if (field664.method5077(33)) {
                                                                    var103 = 0;
                                                                } else if (field664.method5077(49)) {
                                                                    var103 = 1024;
                                                                }
                                                                if (field664.method5077(48)) {
                                                                    if (var103 == 0) {
                                                                        var103 = 1792;
                                                                    } else if (var103 == 1024) {
                                                                        var103 = 1280;
                                                                    } else {
                                                                        var103 = 1536;
                                                                    }
                                                                } else if (field664.method5077(50)) {
                                                                    if (var103 == 0) {
                                                                        var103 = 256;
                                                                    } else if (var103 == 1024) {
                                                                        var103 = 768;
                                                                    } else {
                                                                        var103 = 512;
                                                                    }
                                                                }
                                                                byte var104 = 0;
                                                                if (field664.method5077(35)) {
                                                                    var104 = -1;
                                                                } else if (field664.method5077(51)) {
                                                                    var104 = 1;
                                                                }
                                                                int var105 = 0;
                                                                if (var103 >= 0 || var104 != 0) {
                                                                    int var106 = field664.method5077(81) ? field623 : field617;
                                                                    var105 = var106 * 16;
                                                                    field665 = var103;
                                                                    field631 = var104;
                                                                }
                                                                if (field614 < var105) {
                                                                    field614 += var105 / 8;
                                                                    if (field614 > var105) {
                                                                        field614 = var105;
                                                                    }
                                                                } else if (field614 > var105) {
                                                                    field614 = field614 * 9 / 10;
                                                                }
                                                                if (field614 > 0) {
                                                                    int var107 = field614 / 16;
                                                                    if (field665 >= 0) {
                                                                        int var108 = field665 - Statics.field2962 & 0x7FF;
                                                                        int var109 = class240.field2590[var108];
                                                                        int var110 = class240.field2588[var108];
                                                                        Statics.field1545 += var107 * var109 / 65536;
                                                                        Statics.field73 += var107 * var110 / 65536;
                                                                    }
                                                                    if (field631 != 0) {
                                                                        Statics.field1699 += field631 * var107;
                                                                        if (Statics.field1699 > 0) {
                                                                            Statics.field1699 = 0;
                                                                        }
                                                                    }
                                                                } else {
                                                                    field665 = -1;
                                                                    field631 = -1;
                                                                }
                                                                if (field664.method5077(13)) {
                                                                    field582.method2943(class326.method3199(class324.field3337, field582.field1486));
                                                                    field612 = 0;
                                                                }
                                                            }
                                                            if (class36.field219 == 4 && Statics.field1474) {
                                                                int var111 = class36.field210 - field611;
                                                                field684 = var111 * 2;
                                                                field611 = var111 == -1 || var111 == 1 ? class36.field210 : (field611 + class36.field210) / 2;
                                                                int var112 = field771 - class36.field217;
                                                                field709 = var112 * 2;
                                                                field771 = var112 == -1 || var112 == 1 ? class36.field217 : (field771 + class36.field217) / 2;
                                                            } else {
                                                                if (field664.method5077(96)) {
                                                                    field709 += (-24 - field709) / 2;
                                                                } else if (field664.method5077(97)) {
                                                                    field709 += (24 - field709) / 2;
                                                                } else {
                                                                    field709 /= 2;
                                                                }
                                                                if (field664.method5077(98)) {
                                                                    field684 += (12 - field684) / 2;
                                                                } else if (field664.method5077(99)) {
                                                                    field684 += (-12 - field684) / 2;
                                                                } else {
                                                                    field684 /= 2;
                                                                }
                                                                field611 = class36.field210;
                                                                field771 = class36.field217;
                                                            }
                                                            field672 = field709 / 2 + field672 & 0x7FF;
                                                            field781 += field684 / 2;
                                                            if (field781 < 128) {
                                                                field781 = 128;
                                                            }
                                                            if (field781 > 383) {
                                                                field781 = 383;
                                                            }
                                                            if (field780) {
                                                                method2487(Statics.field4919, Statics.field1171, Statics.field4451);
                                                                method367(Statics.field304, Statics.field354);
                                                                if (Statics.field4919 == Statics.field3239 && Statics.field1171 == Statics.field1076 && Statics.field4451 == Statics.field161 && Statics.field4936 == Statics.field304 && Statics.field354 == Statics.field2962) {
                                                                    field780 = false;
                                                                    field706 = false;
                                                                    field774 = false;
                                                                    field775 = false;
                                                                    Statics.field1990 = 0;
                                                                    Statics.field134 = 0;
                                                                    Statics.field4134 = 0;
                                                                    Statics.field30 = 0;
                                                                    Statics.field2412 = 0;
                                                                    Statics.field118 = 0;
                                                                    Statics.field2215 = 0;
                                                                    Statics.field1050 = 0;
                                                                    Statics.field4 = 0;
                                                                    Statics.field22 = 0;
                                                                    field777 = null;
                                                                    field779 = null;
                                                                    field778 = null;
                                                                }
                                                            } else if (field706) {
                                                                method3193();
                                                            }
                                                            for (int var113 = 0; var113 < 5; var113++) {
                                                                var10002 = field519[var113]++;
                                                            }
                                                            Statics.field2460.method2886();
                                                            int var114 = class36.method3208();
                                                            int var115 = field196.method362();
                                                            if (var114 > 15000 && var115 > 15000) {
                                                                field583 = 250;
                                                                class36.method8829(14500);
                                                                class326 var117 = class326.method3199(class324.field3390, field582.field1486);
                                                                field582.method2943(var117);
                                                            }
                                                            Statics.field4723.method1915();
                                                            method5696();
                                                            field582.field1491++;
                                                            if (field582.field1491 > 50) {
                                                                class326 var118 = class326.method3199(class324.field3333, field582.field1486);
                                                                field582.method2943(var118);
                                                            }
                                                            try {
                                                                field582.method2942();
                                                            } catch (IOException var120) {
                                                                method6699();
                                                            }
                                                            class226.method2488().method4166();
                                                            return;
                                                        }
                                                        if (var77.field2970.field3855 == 12) {
                                                            var76 = true;
                                                        }
                                                        method7250(var77);
                                                    }
                                                }
                                                var74 = var73.field1112;
                                                if (var74.field3991 < 0) {
                                                    break;
                                                }
                                                var75 = Statics.field2371.method6131(var74.field3872);
                                            } while (var75 == null || var75.field3951 == null || var74.field3991 >= var75.field3951.length || var75.field3951[var74.field3991] != var74);
                                            Statics.method4025(var73);
                                        }
                                    }
                                    var71 = var70.field1112;
                                    if (var71.field3991 < 0) {
                                        break;
                                    }
                                    var72 = Statics.field2371.method6131(var71.field3872);
                                } while (var72 == null || var72.field3951 == null || var71.field3991 >= var72.field3951.length || var72.field3951[var71.field3991] != var71);
                                Statics.method4025(var70);
                            }
                        }
                        var68 = var67.field1112;
                        if (var68.field3991 < 0) {
                            break;
                        }
                        var69 = Statics.field2371.method6131(var68.field3872);
                    } while (var69 == null || var69.field3951 == null || var68.field3991 >= var69.field3951.length || var69.field3951[var68.field3991] != var68);
                    Statics.method4025(var67);
                }
            }
            class326 var4 = class326.method3199(class324.field3317, field582.field1486);
            var4.field3426.method9022(0);
            int var5 = var4.field3426.field5415;
            class37.method7244(var4.field3426);
            var4.field3426.method8971(var4.field3426.field5415 - var5);
            field582.method2943(var4);
        }
    }

    @ObfuscatedName("pj.ip(I)V")
    public static final void method6956() {
        if (Statics.field1377 != null) {
            Statics.field1377.method783();
        }
    }

    @ObfuscatedName("dq.ix(Lif;IIIZI)V")
    public static void method2422(class213 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (field766 >= 50 || arg0.field2317 == null || arg1 >= arg0.field2317.length || arg0.field2317[arg1] == null) {
            return;
        }
        int var5 = arg0.field2317[arg1].field2167 & 0x1F;
        if (!(var5 <= 0 || Statics.field4929.method2677() != 0) || !(var5 != 0 || Statics.field4929.method2617() != 0)) {
            return;
        }
        class209 var6 = arg0.field2317[arg1];
        if (var6 == null) {
            return;
        }
        if (var6.field2167 == 0) {
            if (!arg4) {
                return;
            }
            field770[field766] = 0;
        } else {
            int var10 = (arg2 - 64) / 128;
            int var11 = (arg3 - 64) / 128;
            field770[field766] = var6.field2167 + (var10 << 16) + (var11 << 8);
        }
        field705[field766] = var6.field2169;
        field748[field766] = var6.field2165;
        field769[field766] = 0;
        field750[field766] = null;
        field628[field766] = var6.field2168;
        field766++;
    }

    @ObfuscatedName("aw.ir(Lif;IIIZI)V")
    public static void method311(class213 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (field766 >= 50 || arg0.field2311 == null || !arg0.field2311.containsKey(arg1)) {
            return;
        }
        class209 var5 = (class209) arg0.field2311.get(arg1);
        if (var5 == null) {
            return;
        }
        int var6 = var5.field2167 & 0x1F;
        if (!(var6 <= 0 || Statics.field4929.method2677() != 0) || !(var6 != 0 || Statics.field4929.method2617() != 0) || var5 == null) {
            return;
        }
        if (var5.field2167 == 0) {
            if (!arg4) {
                return;
            }
            field770[field766] = 0;
        } else {
            int var11 = (arg2 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            field770[field766] = var5.field2167 + (var11 << 16) + (var12 << 8);
        }
        field705[field766] = var5.field2169;
        field748[field766] = var5.field2165;
        field769[field766] = 0;
        field750[field766] = null;
        field628[field766] = var5.field2168;
        field766++;
    }

    @ObfuscatedName("ce.it(IIIB)V")
    public static void method2199(int arg0, int arg1, int arg2) {
        if (Statics.field4929.method2617() == 0 || arg1 == 0 || field766 >= 50) {
            return;
        }
        field705[field766] = arg0;
        field748[field766] = arg1;
        field769[field766] = arg2;
        field750[field766] = null;
        field770[field766] = 0;
        field628[field766] = 0;
        field766++;
    }

    @ObfuscatedName("dl.il(II)V")
    public static void method2302(int arg0) {
        if (arg0 == -1 && !field608) {
            class335.method5635(0, 0);
        } else if (arg0 != -1 && !class335.method3685(arg0) && Statics.field4929.method2615() != 0) {
            ArrayList var1 = new ArrayList();
            var1.add(new class347(Statics.field1993, arg0, 0, Statics.field4929.method2615(), false));
            if (field608) {
                class335.method5264(var1, 0, 100, 100, 0);
            } else {
                class335.method3443(var1, 0, 100, 100, 0, false);
            }
        }
    }

    @ObfuscatedName("de.iw(Ljava/util/ArrayList;IIIII)V")
    public static void method2388(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field608) {
            class335.method5635(0, 0);
        } else if (var5 != -1 && !class335.method3685(var5) && Statics.field4929.method2615() != 0) {
            ArrayList var6 = new ArrayList();
            for (int var7 = 0; var7 < arg0.size(); var7++) {
                var6.add(new class347(Statics.field1993, (Integer) arg0.get(var7), 0, Statics.field4929.method2615(), false));
            }
            if (field608) {
                class335.method5264(var6, arg1, arg2, arg3, arg4);
            } else {
                class335.method3443(var6, arg1, arg2, arg3, arg4, false);
            }
        }
    }

    @ObfuscatedName("df.iv(IIB)V")
    public static void method2257(int arg0, int arg1) {
        if (Statics.field4929.method2615() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class347(Statics.field3691, arg0, 0, Statics.field4929.method2615(), false));
            class335.method3443(var2, 0, 0, 0, 0, true);
            field608 = true;
        }
    }

    @ObfuscatedName("client.io(III)V")
    public void method1227(int arg0, int arg1) {
        if (field582 != null && field582.field1486 != null && arg0 > -1 && Statics.field4929.method2615() > 0 && !field608) {
            class326 var3 = class326.method3199(class324.field3366, field582.field1486);
            var3.field3426.method8960(arg0);
            field582.method2943(var3);
        }
    }

    @ObfuscatedName("ak.ik(I)V")
    public static final void method333() {
        if (field757 != Statics.field1342.field1356) {
            field757 = Statics.field1342.field1356;
            method5562(Statics.field1342.field1356);
        }
    }

    @ObfuscatedName("io.ib(Lny;IIB)V")
    public static final void method4131(class363 arg0, int arg1, int arg2) {
        if (field764 != 0 && field764 != 3 || field813 || !(class36.field216 == 1 || !Statics.field1474 && class36.field216 == 4)) {
            return;
        }
        class350 var3 = arg0.method6534(Statics.field2371, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field209 - arg1;
        int var5 = class36.field207 - arg2;
        if (!var3.method6065(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3745 / 2;
        int var7 = var5 - var3.field3747 / 2;
        int var8 = field672 & 0x7FF;
        int var9 = class240.field2590[var8];
        int var10 = class240.field2588[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1791.method1197() + var11 >> 7;
        int var14 = Statics.field1791.method1205() - var12 >> 7;
        class326 var15 = class326.method3199(class324.field3404, field582.field1486);
        var15.field3426.method9022(18);
        var15.field3426.method8958(Statics.field1342.field1357 + var14);
        var15.field3426.method9005(field664.method5077(82) ? (field664.method5077(81) ? 2 : 1) : 0);
        var15.field3426.method9198(Statics.field1342.field1350 + var13);
        var15.field3426.method9022(var6);
        var15.field3426.method9022(var7);
        var15.field3426.method8958(field672);
        var15.field3426.method9022(57);
        var15.field3426.method9022(0);
        var15.field3426.method9022(0);
        var15.field3426.method9022(89);
        var15.field3426.method8958(Statics.field4826.field1300);
        var15.field3426.method8958(Statics.field4826.field1225);
        var15.field3426.method9022(63);
        field582.method2943(var15);
        field758 = var13;
        field690 = var14;
    }

    @ObfuscatedName("hj.ig(B)V")
    public static final void method3589() {
        int[] var0 = field718.field1436;
        Iterator var1 = field593.iterator();
        while (var1.hasNext()) {
            class104 var2 = (class104) var1.next();
            for (int var3 = 0; var3 < field718.field1438; var3++) {
                class95 var4 = var2.field1369[var0[var3]];
                if (var4 != null && var4.field1248 > 0) {
                    var4.field1248--;
                    if (var4.field1248 == 0) {
                        var4.field1245 = null;
                    }
                }
            }
            for (int var5 = 0; var5 < var2.field1367; var5++) {
                int var6 = var2.field1351[var5];
                class106 var7 = var2.field1362[var6];
                if (var7 != null && var7.field1248 > 0) {
                    var7.field1248--;
                    if (var7.field1248 == 0) {
                        var7.field1245 = null;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gh.iy(Ljava/lang/String;I)V")
    public static final void method3431(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field4929.method2597(!Statics.field4929.method2695());
            if (Statics.field4929.method2695()) {
                class116.method3755(99, "", "Roofs are now all hidden");
            } else {
                class116.method3755(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class419.method4086(arg0.substring(5).trim()) == 1;
            Statics.field3.method490(var1);
            class240.method4407(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field550 = !field550;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field4929.method2608();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field651 = !field651;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field669 = !field669;
        }
        if (arg0.startsWith("setdrawdistance")) {
            String[] var2 = arg0.split(" ");
            try {
                int var3 = Integer.parseInt(var2[1]);
                Statics.field4929.method2630(var3);
            } catch (NumberFormatException var10) {
                class116.method3755(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var2[1]));
            }
        }
        if (arg0.startsWith("settilerendermode")) {
            String[] var5 = arg0.split(" ");
            try {
                int var6 = Integer.parseInt(var5[1]);
                Statics.field1342.field1372.method4535(class233.method4238()[var6]);
            } catch (NumberFormatException var9) {
                class116.method3755(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var5[1]));
            }
        }
        if (arg0.equalsIgnoreCase("getdrawdistance")) {
            class116.method3755(99, "", String.format("%d", Statics.field4929.method2672()));
        }
        if (field689 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1518.field5211 = !Statics.field1518.field5211;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field4929.method2607(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field4929.method2607(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method6699();
            }
            if (arg0.equalsIgnoreCase("clientreload")) {
                method6019();
            }
        }
        class326 var8 = class326.method3199(class324.field3397, field582.field1486);
        var8.field3426.method9022(arg0.length() + 1);
        var8.field3426.method8964(arg0);
        field582.method2943(var8);
    }

    @ObfuscatedName("bf.ih(II)I")
    public static final int method440(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("lq.iu(II)I")
    public static final int method5558(int arg0) {
        return Math.abs(arg0 - Statics.field2962) > 1024 ? 2048 * (arg0 < Statics.field2962 ? 1 : -1) + arg0 : arg0;
    }

    @ObfuscatedName("di.iq(IIIB)V")
    public static final void method2487(int arg0, int arg1, int arg2) {
        if (Statics.field3239 < arg0) {
            Statics.field3239 += Statics.field118 * (arg0 - Statics.field3239) / 1000 + Statics.field2215;
            if (Statics.field3239 > arg0) {
                Statics.field3239 = arg0;
            }
        }
        if (Statics.field3239 > arg0) {
            Statics.field3239 -= Statics.field118 * (Statics.field3239 - arg0) / 1000 + Statics.field2215;
            if (Statics.field3239 < arg0) {
                Statics.field3239 = arg0;
            }
        }
        if (Statics.field1076 < arg1) {
            Statics.field1076 += Statics.field118 * (arg1 - Statics.field1076) / 1000 + Statics.field2215;
            if (Statics.field1076 > arg1) {
                Statics.field1076 = arg1;
            }
        }
        if (Statics.field1076 > arg1) {
            Statics.field1076 -= Statics.field118 * (Statics.field1076 - arg1) / 1000 + Statics.field2215;
            if (Statics.field1076 < arg1) {
                Statics.field1076 = arg1;
            }
        }
        if (Statics.field161 < arg2) {
            Statics.field161 += Statics.field118 * (arg2 - Statics.field161) / 1000 + Statics.field2215;
            if (Statics.field161 > arg2) {
                Statics.field161 = arg2;
            }
        }
        if (Statics.field161 > arg2) {
            Statics.field161 -= Statics.field118 * (Statics.field161 - arg2) / 1000 + Statics.field2215;
            if (Statics.field161 < arg2) {
                Statics.field161 = arg2;
            }
        }
    }

    @ObfuscatedName("ak.im(III)V")
    public static final void method367(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field4936 < arg0) {
            Statics.field4936 += Statics.field2412 * (arg0 - Statics.field4936) / 1000 + Statics.field30;
            if (Statics.field4936 > arg0) {
                Statics.field4936 = arg0;
            }
        } else if (Statics.field4936 > arg0) {
            Statics.field4936 -= Statics.field2412 * (Statics.field4936 - arg0) / 1000 + Statics.field30;
            if (Statics.field4936 < arg0) {
                Statics.field4936 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field2962;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field2962 += Statics.field2412 * var3 / 1000 + Statics.field30;
            Statics.field2962 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field2962 -= Statics.field2412 * -var3 / 1000 + Statics.field30;
            Statics.field2962 &= 0x7FF;
        }
        int var4 = var2 - Statics.field2962;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field2962 = var2;
        }
    }

    @ObfuscatedName("fu.in(I)V")
    public static final void method3193() {
        if (!field774) {
            int var0 = class352.method6092(Statics.field1050);
            int var1 = class352.method6092(Statics.field4);
            int var2 = method3500(Statics.field1342, var0, var1, Statics.field1342.field1356) - Statics.field22;
            method2487(var0, var2, var1);
        } else if (field777 != null) {
            Statics.field3239 = field777.method8394();
            Statics.field161 = field777.method8396();
            if (field776) {
                Statics.field1076 = field777.method8397();
            } else {
                Statics.field1076 = method3500(Statics.field1342, Statics.field3239, Statics.field161, Statics.field1342.field1356) - field777.method8397();
            }
            field777.method8409();
        }
        if (field775) {
            if (field779 != null) {
                Statics.field4936 = field779.method8404();
                Statics.field4936 = Math.min(Math.max(Statics.field4936, 128), 383);
                field779.method8409();
            }
            if (field778 != null) {
                Statics.field2962 = field778.method8404() & 0x7FF;
                field778.method8409();
            }
            return;
        }
        int var3 = class352.method6092(Statics.field1990);
        int var4 = class352.method6092(Statics.field134);
        int var5 = method3500(Statics.field1342, var3, var4, Statics.field1342.field1356) - Statics.field4134;
        int var6 = var3 - Statics.field3239;
        int var7 = var5 - Statics.field1076;
        int var8 = var4 - Statics.field161;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method367(var10, var11);
    }

    @ObfuscatedName("ob.ic(I)V")
    public static final void method6705() {
        int var0 = field718.field1438;
        int[] var1 = field718.field1436;
        Iterator var2 = field593.iterator();
        while (var2.hasNext()) {
            class104 var3 = (class104) var2.next();
            for (int var4 = 0; var4 < var0; var4++) {
                class95 var5 = var3.field1369[var1[var4]];
                if (var5 != null) {
                    method7329(var3, var5, 1);
                }
            }
        }
    }

    @ObfuscatedName("fw.jv(I)V")
    public static final void method3243() {
        Iterator var0 = field593.iterator();
        while (var0.hasNext()) {
            class104 var1 = (class104) var0.next();
            for (int var2 = 0; var2 < var1.field1367; var2++) {
                int var3 = var1.field1351[var2];
                class106 var4 = var1.field1362[var3];
                if (var4 != null) {
                    method7329(var1, var4, var4.field1386.field2010);
                }
            }
        }
    }

    @ObfuscatedName("qv.jr(Ldd;Ldy;IB)V")
    public static final void method7329(class104 arg0, class100 arg1, int arg2) {
        if (arg1.field1247 >= field609) {
            int var3 = Math.max(1, arg1.field1247 - field609);
            int var4 = arg1.field1258 * 128 + arg1.field1228 * 64;
            int var5 = arg1.field1249 * 128 + arg1.field1228 * 64;
            arg1.field1300 += (var4 - arg1.field1300) / var3;
            arg1.field1225 += (var5 - arg1.field1225) / var3;
            arg1.field1291 = 0;
            arg1.field1243 = arg1.field1292;
        } else if (arg1.field1234 >= field609) {
            boolean var6 = field609 == arg1.field1234 || arg1.field1269 == -1 || arg1.field1282 != 0;
            if (!var6) {
                class213 var7 = class213.method2555(arg1.field1269);
                if (var7 == null || var7.method3954()) {
                    var6 = true;
                } else {
                    var6 = arg1.field1271 + 1 > var7.field2316[arg1.field1270];
                }
            }
            if (var6) {
                int var8 = arg1.field1234 - arg1.field1247;
                int var9 = field609 - arg1.field1247;
                int var10 = arg1.field1258 * 128 + arg1.field1228 * 64;
                int var11 = arg1.field1249 * 128 + arg1.field1228 * 64;
                int var12 = arg1.field1277 * 128 + arg1.field1228 * 64;
                int var13 = arg1.field1232 * 128 + arg1.field1228 * 64;
                arg1.field1300 = ((var8 - var9) * var10 + var9 * var12) / var8;
                arg1.field1225 = ((var8 - var9) * var11 + var9 * var13) / var8;
            }
            arg1.field1291 = 0;
            arg1.field1243 = arg1.field1292;
            arg1.field1226 = arg1.field1243;
        } else {
            arg1.field1265 = arg1.field1230;
            if (arg1.field1294 == 0) {
                arg1.field1291 = 0;
            } else {
                label540: {
                    if (arg1.field1269 != -1 && arg1.field1282 == 0) {
                        class213 var14 = class213.method2555(arg1.field1269);
                        if (arg1.field1299 > 0 && var14.field2303 == 0) {
                            arg1.field1291++;
                            break label540;
                        }
                        if (arg1.field1299 <= 0 && var14.field2328 == 0) {
                            arg1.field1291++;
                            break label540;
                        }
                    }
                    int var15 = arg1.field1300;
                    int var16 = arg1.field1225;
                    int var17 = arg1.field1295[arg1.field1294 - 1] * 128 + arg1.field1228 * 64;
                    int var18 = arg1.field1296[arg1.field1294 - 1] * 128 + arg1.field1228 * 64;
                    if (var15 < var17) {
                        if (var16 < var18) {
                            arg1.field1243 = 1280;
                        } else if (var16 > var18) {
                            arg1.field1243 = 1792;
                        } else {
                            arg1.field1243 = 1536;
                        }
                    } else if (var15 > var17) {
                        if (var16 < var18) {
                            arg1.field1243 = 768;
                        } else if (var16 > var18) {
                            arg1.field1243 = 256;
                        } else {
                            arg1.field1243 = 512;
                        }
                    } else if (var16 < var18) {
                        arg1.field1243 = 1024;
                    } else if (var16 > var18) {
                        arg1.field1243 = 0;
                    }
                    class277 var19 = arg1.field1290[arg1.field1294 - 1];
                    if (var17 - var15 <= 256 && var17 - var15 >= -256 && var18 - var16 <= 256 && var18 - var16 >= -256) {
                        int var20 = arg1.field1243 - arg1.field1226 & 0x7FF;
                        if (var20 > 1024) {
                            var20 -= 2048;
                        }
                        int var21 = arg1.field1279;
                        if (var20 >= -256 && var20 <= 256) {
                            var21 = arg1.field1272;
                        } else if (var20 >= 256 && var20 < 768) {
                            var21 = arg1.field1236;
                        } else if (var20 >= -768 && var20 <= -256) {
                            var21 = arg1.field1235;
                        }
                        if (var21 == -1) {
                            var21 = arg1.field1272;
                        }
                        arg1.field1265 = var21;
                        int var22 = 4;
                        boolean var23 = true;
                        if (arg1 instanceof class106) {
                            var23 = ((class106) arg1).field1386.field2045;
                        }
                        if (var23) {
                            if (arg1.field1243 != arg1.field1226 && arg1.field1253 == -1 && arg1.field1293 != 0) {
                                var22 = 2;
                            }
                            if (arg1.field1294 > 2) {
                                var22 = 6;
                            }
                            if (arg1.field1294 > 3) {
                                var22 = 8;
                            }
                            if (arg1.field1291 > 0 && arg1.field1294 > 1) {
                                var22 = 8;
                                arg1.field1291--;
                            }
                        } else {
                            if (arg1.field1294 > 1) {
                                var22 = 6;
                            }
                            if (arg1.field1294 > 2) {
                                var22 = 8;
                            }
                            if (arg1.field1291 > 0 && arg1.field1294 > 1) {
                                var22 = 8;
                                arg1.field1291--;
                            }
                        }
                        if (class277.field3040 == var19) {
                            var22 <<= 0x1;
                        } else if (class277.field3038 == var19) {
                            var22 >>= 0x1;
                        }
                        if (var22 >= 8) {
                            if (arg1.field1272 == arg1.field1265 && arg1.field1278 != -1) {
                                arg1.field1265 = arg1.field1278;
                            } else if (arg1.field1279 == arg1.field1265 && arg1.field1238 != -1) {
                                arg1.field1265 = arg1.field1238;
                            } else if (arg1.field1265 == arg1.field1235 && arg1.field1239 != -1) {
                                arg1.field1265 = arg1.field1239;
                            } else if (arg1.field1265 == arg1.field1236 && arg1.field1281 != -1) {
                                arg1.field1265 = arg1.field1281;
                            }
                        } else if (var22 <= 2) {
                            if (arg1.field1272 == arg1.field1265 && arg1.field1287 != -1) {
                                arg1.field1265 = arg1.field1287;
                            } else if (arg1.field1279 == arg1.field1265 && arg1.field1241 != -1) {
                                arg1.field1265 = arg1.field1241;
                            } else if (arg1.field1265 == arg1.field1235 && arg1.field1242 != -1) {
                                arg1.field1265 = arg1.field1242;
                            } else if (arg1.field1265 == arg1.field1236 && arg1.field1244 != -1) {
                                arg1.field1265 = arg1.field1244;
                            }
                        }
                        if (var15 != var17 || var16 != var18) {
                            if (var15 < var17) {
                                arg1.field1300 += var22;
                                if (arg1.field1300 > var17) {
                                    arg1.field1300 = var17;
                                }
                            } else if (var15 > var17) {
                                arg1.field1300 -= var22;
                                if (arg1.field1300 < var17) {
                                    arg1.field1300 = var17;
                                }
                            }
                            if (var16 < var18) {
                                arg1.field1225 += var22;
                                if (arg1.field1225 > var18) {
                                    arg1.field1225 = var18;
                                }
                            } else if (var16 > var18) {
                                arg1.field1225 -= var22;
                                if (arg1.field1225 < var18) {
                                    arg1.field1225 = var18;
                                }
                            }
                        }
                        if (arg1.field1300 == var17 && arg1.field1225 == var18) {
                            arg1.field1294--;
                            if (arg1.field1299 > 0) {
                                arg1.field1299--;
                            }
                        }
                    } else {
                        arg1.field1300 = var17;
                        arg1.field1225 = var18;
                        arg1.field1294--;
                        if (arg1.field1299 > 0) {
                            arg1.field1299--;
                        }
                    }
                }
            }
        }
        if (arg1.field1300 < 128 || 13184 <= arg1.field1300 || arg1.field1225 < 128 || 13184 <= arg1.field1225) {
            arg1.field1269 = -1;
            arg1.field1247 = 0;
            arg1.field1234 = 0;
            arg1.method2518();
            arg1.field1300 = arg1.field1295[0] * 128 + arg1.field1228 * 64;
            arg1.field1225 = arg1.field1296[0] * 128 + arg1.field1228 * 64;
            arg1.method2513();
        }
        if (Statics.field4826 == arg1 && (arg1.field1300 < 1536 || 11776 <= arg1.field1300 || arg1.field1225 < 1536 || 11776 <= arg1.field1225)) {
            arg1.field1269 = -1;
            arg1.field1247 = 0;
            arg1.field1234 = 0;
            arg1.method2518();
            arg1.field1300 = arg1.field1295[0] * 128 + arg1.field1228 * 64;
            arg1.field1225 = arg1.field1296[0] * 128 + arg1.field1228 * 64;
            arg1.method2513();
        }
        method3277(arg0, arg1);
        arg1.field1227 = false;
        if (arg1.field1265 != -1) {
            class213 var24 = class213.method2555(arg1.field1265);
            if (var24 == null) {
                arg1.field1265 = -1;
            } else if (!var24.method3954() && var24.field2314 != null) {
                arg1.field1297++;
                if (arg1.field1266 < var24.field2314.length && arg1.field1297 > var24.field2316[arg1.field1266]) {
                    arg1.field1297 = 1;
                    arg1.field1266++;
                    method2422(var24, arg1.field1266, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                }
                if (arg1.field1266 >= var24.field2314.length) {
                    if (var24.field2318 > 0) {
                        arg1.field1266 -= var24.field2318;
                        if (var24.field2326) {
                            arg1.field1268++;
                        }
                        if (arg1.field1266 < 0 || arg1.field1266 >= var24.field2314.length || var24.field2326 && arg1.field1268 >= var24.field2325) {
                            arg1.field1297 = 0;
                            arg1.field1266 = 0;
                            arg1.field1268 = 0;
                        }
                    } else {
                        arg1.field1297 = 0;
                        arg1.field1266 = 0;
                    }
                    method2422(var24, arg1.field1266, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                }
            } else if (var24.method3954()) {
                arg1.field1266++;
                int var25 = var24.method3999();
                if (arg1.field1266 < var25) {
                    method311(var24, arg1.field1266, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                } else {
                    if (var24.field2318 > 0) {
                        arg1.field1266 -= var24.field2318;
                        if (var24.field2326) {
                            arg1.field1268++;
                        }
                        if (arg1.field1266 < 0 || arg1.field1266 >= var25 || var24.field2326 && arg1.field1268 >= var24.field2325) {
                            arg1.field1266 = 0;
                            arg1.field1297 = 0;
                            arg1.field1268 = 0;
                        }
                    } else {
                        arg1.field1297 = 0;
                        arg1.field1266 = 0;
                    }
                    method311(var24, arg1.field1266, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                }
            } else {
                arg1.field1265 = -1;
            }
        }
        class522 var26 = new class522(arg1.method2519());
        for (class481 var27 = (class481) var26.method8652(); var27 != null; var27 = (class481) var26.next()) {
            if (var27.field5022 != -1 && field609 >= var27.field5023) {
                int var28 = class200.method3501(var27.field5022).field2091;
                if (var28 == -1) {
                    var27.method8362();
                    arg1.field1275--;
                } else {
                    var27.field5020 = Math.max(var27.field5020, 0);
                    class213 var29 = class213.method2555(var28);
                    if (var29.field2314 != null && !var29.method3954()) {
                        var27.field5021++;
                        if (var27.field5020 < var29.field2314.length && var27.field5021 > var29.field2316[var27.field5020]) {
                            var27.field5021 = 1;
                            var27.field5020++;
                            method2422(var29, var27.field5020, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                        }
                        if (var27.field5020 >= var29.field2314.length) {
                            var27.method8362();
                            arg1.field1275--;
                        }
                    } else if (var29.method3954()) {
                        var27.field5020++;
                        int var30 = var29.method3999();
                        if (var27.field5020 < var30) {
                            method311(var29, var27.field5020, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                        } else {
                            var27.method8362();
                            arg1.field1275--;
                        }
                    } else {
                        var27.method8362();
                        arg1.field1275--;
                    }
                }
            }
        }
        if (arg1.field1269 != -1 && arg1.field1282 <= 1) {
            class213 var31 = class213.method2555(arg1.field1269);
            if (var31.field2303 == 1 && arg1.field1299 > 0 && arg1.field1247 <= field609 && arg1.field1234 < field609) {
                arg1.field1282 = 1;
                return;
            }
        }
        if (arg1.field1269 != -1 && arg1.field1282 == 0) {
            class213 var32 = class213.method2555(arg1.field1269);
            if (var32 == null) {
                arg1.field1269 = -1;
            } else if (!var32.method3954() && var32.field2314 != null) {
                arg1.field1271++;
                if (arg1.field1270 < var32.field2314.length && arg1.field1271 > var32.field2316[arg1.field1270]) {
                    arg1.field1271 = 1;
                    arg1.field1270++;
                    method2422(var32, arg1.field1270, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                }
                if (arg1.field1270 >= var32.field2314.length) {
                    arg1.field1270 -= var32.field2318;
                    arg1.field1273++;
                    if (arg1.field1273 >= var32.field2325) {
                        arg1.field1269 = -1;
                    } else if (arg1.field1270 >= 0 && arg1.field1270 < var32.field2314.length) {
                        method2422(var32, arg1.field1270, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                    } else {
                        arg1.field1269 = -1;
                    }
                }
                arg1.field1227 = var32.field2321;
            } else if (var32.method3954()) {
                arg1.field1270++;
                int var33 = var32.method3999();
                if (arg1.field1270 < var33) {
                    method311(var32, arg1.field1270, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                } else {
                    arg1.field1270 -= var32.field2318;
                    arg1.field1273++;
                    if (arg1.field1273 >= var32.field2325) {
                        arg1.field1269 = -1;
                    } else if (arg1.field1270 >= 0 && arg1.field1270 < var33) {
                        method311(var32, arg1.field1270, arg1.field1300, arg1.field1225, Statics.field4826 == arg1);
                    } else {
                        arg1.field1269 = -1;
                    }
                }
            } else {
                arg1.field1269 = -1;
            }
        }
        if (arg1.field1282 > 0) {
            arg1.field1282--;
        }
    }

    @ObfuscatedName("fz.jt(Ldd;Ldy;I)V")
    public static final void method3277(class104 arg0, class100 arg1) {
        if (arg1.field1253 != -1) {
            Object var2 = null;
            int var3 = 65536;
            class100 var4;
            if (arg1.field1253 < var3) {
                var4 = arg0.field1362[arg1.field1253];
            } else {
                var4 = arg0.field1369[arg1.field1253 - var3];
            }
            if (var4 != null) {
                int var5 = arg1.field1300 - var4.field1300;
                int var6 = arg1.field1225 - var4.field1225;
                if (var5 != 0 || var6 != 0) {
                    int var8 = (int) (Math.atan2((double) var5, (double) var6) * 325.94932345220167D) & 0x7FF;
                    arg1.field1243 = var8;
                }
            } else if (arg1.field1237) {
                arg1.field1253 = -1;
                arg1.field1237 = false;
            }
        }
        if (arg1.field1294 == 0 || arg1.field1291 > 0) {
            int var9 = -1;
            if (arg1.field1262 != -1 && arg1.field1263 != -1) {
                int var10 = class352.method6092(arg1.field1262 - Statics.field1342.field1350);
                int var11 = class352.method6092(arg1.field1263 - Statics.field1342.field1357);
                int var12 = arg1.field1300 - var10;
                int var13 = arg1.field1225 - var11;
                if (var12 != 0 || var13 != 0) {
                    int var14 = (int) (Math.atan2((double) var12, (double) var13) * 325.94932345220167D) & 0x7FF;
                    var9 = var14;
                }
            } else if (arg1.field1261 != -1) {
                var9 = arg1.field1261;
            }
            if (var9 != -1) {
                arg1.field1243 = var9;
                if (arg1.field1264) {
                    arg1.field1226 = arg1.field1243;
                }
            }
            arg1.method2538();
        }
        int var15 = arg1.field1243 - arg1.field1226 & 0x7FF;
        if (var15 == 0) {
            if (arg1.field1237) {
                arg1.field1253 = -1;
                arg1.field1237 = false;
            }
            arg1.field1250 = 0;
            return;
        }
        boolean var16 = true;
        boolean var17 = true;
        arg1.field1250++;
        int var18 = var15 > 1024 ? -1 : 1;
        arg1.field1226 += arg1.field1293 * var18;
        boolean var19 = true;
        if (var15 < arg1.field1293 || var15 > 2048 - arg1.field1293) {
            arg1.field1226 = arg1.field1243;
            var19 = false;
        }
        if (arg1.field1293 > 0 && arg1.field1265 == arg1.field1230 && (arg1.field1250 > 25 || var19)) {
            if (var18 == -1 && arg1.field1231 != -1) {
                arg1.field1265 = arg1.field1231;
            } else if (var18 == 1 && arg1.field1246 != -1) {
                arg1.field1265 = arg1.field1246;
            } else {
                arg1.field1265 = arg1.field1272;
            }
        }
        arg1.field1226 &= 0x7FF;
    }

    @ObfuscatedName("kb.je(Ldi;III)V")
    public static void method5196(class95 arg0, int arg1, int arg2) {
        if (arg0.field1269 == arg1 && arg1 != -1) {
            int var3 = class213.method2555(arg1).field2329;
            if (var3 == 1) {
                arg0.field1270 = 0;
                arg0.field1271 = 0;
                arg0.field1282 = arg2;
                arg0.field1273 = 0;
            }
            if (var3 == 2) {
                arg0.field1273 = 0;
            }
        } else if (arg1 == -1 || arg0.field1269 == -1 || class213.method2555(arg1).field2322 >= class213.method2555(arg0.field1269).field2322) {
            arg0.field1269 = arg1;
            arg0.field1270 = 0;
            arg0.field1271 = 0;
            arg0.field1282 = arg2;
            arg0.field1273 = 0;
            arg0.field1299 = arg0.field1294;
        }
    }

    @ObfuscatedName("dt.jw(B)I")
    public static int method2290() {
        return field527 ? 2 : 1;
    }

    @ObfuscatedName("al.jo(IB)V")
    public static void method90(int arg0) {
        field739 = 0L;
        if (arg0 >= 2) {
            field527 = true;
        } else {
            field527 = false;
        }
        if (method2290() == 1) {
            Statics.field3.method590(765, 503);
        } else {
            Statics.field3.method590(7680, 2160);
        }
        if (field528 < 25 || field582 == null || field582.field1486 == null) {
            return;
        }
        class326 var1 = class326.method3199(class324.field3358, field582.field1486);
        var1.field3426.method9022(method2290());
        var1.field3426.method8958(Statics.field1721);
        var1.field3426.method8958(Statics.field1500);
        field582.method2943(var1);
    }

    @ObfuscatedName("client.aa(I)V")
    public final void method486() {
        field739 = class331.method3482() + 500L;
        this.method1229();
        if (field681 != -1) {
            this.method1237(true);
        }
    }

    @ObfuscatedName("client.jp(B)V")
    public void method1229() {
        int var1 = Statics.field1721;
        int var2 = Statics.field1500;
        if (this.field176 < var1) {
            int var3 = this.field176;
        }
        if (this.field177 < var2) {
            int var4 = this.field177;
        }
        if (Statics.field4929 != null) {
            try {
                class27.method369(Statics.field3, "resize", new Object[] { method2290() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.ji(I)V")
    public final void method1409() {
        if (field681 != -1) {
            int var1 = field681;
            if (Statics.field2371.method6146(var1)) {
                method39(Statics.field2371.field3764[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field700; var2++) {
            if (field731[var2]) {
                field732[var2] = true;
            }
            field733[var2] = field731[var2];
            field731[var2] = false;
        }
        field594 = field609;
        field670 = -1;
        field671 = -1;
        if (field681 != -1) {
            field700 = 0;
            method2398(field681, 0, 0, Statics.field1721, Statics.field1500, 0, 0, -1);
        }
        class561.method9355();
        if (field642) {
            if (field641 == 1) {
                Statics.field3063[field799 / 100].method9410(field638 - 8, field639 - 8);
            }
            if (field641 == 2) {
                Statics.field3063[field799 / 100 + 4].method9410(field638 - 8, field639 - 8);
            }
        }
        if (field813) {
            field666.method9577();
        } else if (field670 != -1) {
            method3061(field670, field671);
        }
        if (field738 == 3) {
            for (int var3 = 0; var3 < field700; var3++) {
                if (field733[var3]) {
                    class561.method9301(field734[var3], field751[var3], field736[var3], field737[var3], 16711935, 128);
                } else if (field732[var3]) {
                    class561.method9301(field734[var3], field751[var3], field736[var3], field737[var3], 16711680, 128);
                }
            }
        }
        class72.method3271(Statics.field1342.field1356, Statics.field4826.field1300, Statics.field4826.field1225, field599);
        field599 = 0;
    }

    @ObfuscatedName("me.jg(Ljava/lang/String;ZB)V")
    public static final void method5761(String arg0, boolean arg1) {
        if (!field644) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1534.method7686(arg0, 250);
        int var6 = Statics.field1534.method7659(arg0, 250) * 13;
        class561.method9302(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class561.method9306(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1534.method7665(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field700; var11++) {
            if (field736[var11] + field734[var11] > var7 && field734[var11] < var7 + var9 && field751[var11] + field737[var11] > var8 && field751[var11] < var8 + var10) {
                field731[var11] = true;
            }
        }
        if (arg1) {
            Statics.field3281.method463(0, 0);
        } else {
            method452(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("pv.jh(IIIII)V")
    public static final void method6938(int arg0, int arg1, int arg2, int arg3) {
        field635++;
        Statics.field1342.field1372.field2636 = field609;
        method2806();
        method7992(Statics.field1342);
        class104 var4 = Statics.field1342;
        if (field784 >= 0 && var4.field1369[field784] != null) {
            method1087(var4, field784, false);
        }
        method3084(Statics.field1342, true);
        class104 var5 = Statics.field1342;
        int var6 = field718.field1438;
        int[] var7 = field718.field1436;
        for (int var8 = 0; var8 < var6; var8++) {
            if (field784 != var7[var8] && field652 != var7[var8]) {
                method1087(var5, var7[var8], true);
            }
        }
        method3084(Statics.field1342, false);
        method2273(Statics.field1342);
        method52(Statics.field1342);
        class104 var9 = Statics.field1342;
        for (class75 var10 = (class75) var9.field1363.method7029(); var10 != null; var10 = (class75) var9.field1363.method7031()) {
            if (var9.field1356 != var10.field908 || var10.field913) {
                var10.method8362();
            } else if (field609 >= var10.field906) {
                var10.method2181(field599);
                if (var10.field913) {
                    var10.method8362();
                } else {
                    var9.field1372.method4508(var10.field908, var10.field917, var10.field905, var10.field909, 60, var10, 0, -1L, false);
                }
            }
        }
        method3591(arg0, arg1, arg2, arg3, true);
        int var11 = field794;
        int var12 = field795;
        int var13 = field796;
        int var14 = field797;
        class561.method9294(var11, var12, var11 + var13, var12 + var14);
        class240.method4386();
        class561.method9315();
        int var15 = field781;
        if (field761 / 256 > var15) {
            var15 = field761 / 256;
        }
        if (field578[4] && field783[4] + 128 > var15) {
            var15 = field783[4] + 128;
        }
        int var16 = field672 & 0x7FF;
        int var17 = Statics.field1545;
        int var18 = Statics.field1699;
        int var19 = Statics.field73;
        int var22 = var15 * 3 + 600;
        method3546(var17, var18, var19, var15, var16, var22, var14);
        int var23;
        if (field706) {
            var23 = method1182();
        } else {
            var23 = method3745();
        }
        int var24 = Statics.field3239;
        int var25 = Statics.field1076;
        int var26 = Statics.field161;
        int var27 = Statics.field4936;
        int var28 = Statics.field2962;
        for (int var29 = 0; var29 < 5; var29++) {
            if (field578[var29]) {
                int var30 = (int) (Math.random() * (double) (field782[var29] * 2 + 1) - (double) field782[var29] + Math.sin((double) field590[var29] / 100.0D * (double) field519[var29]) * (double) field783[var29]);
                if (var29 == 0) {
                    Statics.field3239 += var30;
                }
                if (var29 == 1) {
                    Statics.field1076 += var30;
                }
                if (var29 == 2) {
                    Statics.field161 += var30;
                }
                if (var29 == 3) {
                    Statics.field2962 = Statics.field2962 + var30 & 0x7FF;
                }
                if (var29 == 4) {
                    Statics.field4936 += var30;
                    if (Statics.field4936 < 128) {
                        Statics.field4936 = 128;
                    }
                    if (Statics.field4936 > 383) {
                        Statics.field4936 = 383;
                    }
                }
            }
        }
        int var31 = class36.field217;
        int var32 = class36.field210;
        if (class36.field216 != 0) {
            var31 = class36.field209;
            var32 = class36.field207;
        }
        if (var31 >= var11 && var31 < var11 + var13 && var32 >= var12 && var32 < var12 + var14) {
            int var33 = var31 - var11;
            int var34 = var32 - var12;
            class257.field2875 = var33;
            class257.field2876 = var34;
            class257.field2877 = true;
            class257.field2880 = 0;
            class257.field2884 = false;
        } else {
            class257.field2877 = false;
            class257.field2880 = 0;
        }
        method6956();
        class561.method9302(var11, var12, var13, var14, 0);
        method6956();
        int var35 = class240.method4339();
        class240.method4407(Statics.field3.field173);
        class240.field2589.field2919 = field618;
        int var36 = Statics.field1791.method1197();
        int var37 = Statics.field1791.method1205();
        class233 var38 = Statics.field1305 == -1 ? class233.field2471 : class233.field2472;
        Statics.field1342.field1372.method4535(var38);
        Statics.field1342.field1372.method4557(Statics.field3239, Statics.field1076, Statics.field161, Statics.field4936, Statics.field2962, var23, var36, var37, field706);
        class240.method4407(false);
        if (field550) {
            class561.method9316();
        }
        class240.field2589.field2919 = var35;
        method6956();
        Statics.field1342.field1372.method4511();
        for (int var39 = 0; var39 < Statics.field1342.field1366; var39++) {
            class480 var40 = Statics.field1342.field1365[Statics.field1342.field1364[var39]];
            if (var40 != null) {
                var40.field5008.field1372.method4511();
            }
        }
        method3281(Statics.field1342, var11, var12, var13, var14);
        for (int var41 = 0; var41 < Statics.field1342.field1366; var41++) {
            class480 var42 = Statics.field1342.field1365[Statics.field1342.field1364[var41]];
            if (var42 != null) {
                method3281(var42.field5008, var11, var12, var13, var14);
            }
        }
        class104 var43 = Statics.field1342;
        if (field540 == 2) {
            int var44 = (field543 - var43.field1350 << 7) + field546;
            int var45 = (field544 - var43.field1357 << 7) + field754;
            method700(var43, var44, var45, var44, var45, field545 * 2);
            if (field636 > -1 && field609 % 20 < 10) {
                Statics.field3244[0].method9410(field636 + var11 - 12, field637 + var12 - 28);
            }
        }
        ((class252) class240.field2589.field2905).method4757(field599);
        method54(var11, var12, var13, var14);
        Statics.field3239 = var24;
        Statics.field1076 = var25;
        Statics.field161 = var26;
        Statics.field4936 = var27;
        Statics.field2962 = var28;
        if (field574 && Statics.field5261.method6868(true, false) == 0) {
            field574 = false;
        }
        if (field574) {
            class561.method9302(var11, var12, var13, var14, 0);
            method5761(class382.field4242, false);
        }
    }

    @ObfuscatedName("hw.ja(IIIIZI)V")
    public static final void method3591(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field786;
        } else if (var5 >= 100) {
            var6 = field787;
        } else {
            var6 = (field787 - field786) * var5 / 100 + field786;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field792) {
            short var8 = field792;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field791) {
                var6 = field791;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class561.method9355();
                    class561.method9302(arg0, arg1, var10, arg3, -16777216);
                    class561.method9302(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field793) {
            short var11 = field793;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field728) {
                var6 = field728;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class561.method9355();
                    class561.method9302(arg0, arg1, arg2, var13, -16777216);
                    class561.method9302(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field618 = arg3 * var6 / 334;
        if (field796 != arg2 || field797 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class240.field2590[var16];
                int var20 = method2977(var17, arg3);
                var14[var15] = var19 * var20 >> 16;
            }
            Statics.field1342.field1372.method4548(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field794 = arg0;
        field795 = arg1;
        field796 = arg2;
        field797 = arg3;
    }

    @ObfuscatedName("ez.jn(I)V")
    public static void method2806() {
        if (Statics.field4826.field1300 >> 7 == field758 && Statics.field4826.field1225 >> 7 == field690) {
            field758 = 0;
        }
    }

    @ObfuscatedName("rz.ju(Ldd;I)V")
    public static void method7992(class104 arg0) {
        if (field651) {
            method1087(arg0, field652, false);
        }
    }

    @ObfuscatedName("cj.js(Ldd;IZS)V")
    public static void method1087(class104 arg0, int arg1, boolean arg2) {
        class95 var3 = arg0.field1369[arg1];
        if (var3 == null || !var3.method2443() || var3.field1163) {
            return;
        }
        int var4 = var3.field1167;
        var3.field1142 = false;
        if ((field520 && field718.field1438 > 50 || field718.field1438 > 200) && arg2 && var3.field1265 == var3.field1230) {
            var3.field1142 = true;
        }
        int var5 = var3.field1300 >> 7;
        int var6 = var3.field1225 >> 7;
        if (0 > var5 || var5 >= 104 || 0 > var6 || var6 >= 104) {
            return;
        }
        long var7 = Statics.method5153(0, 0, 0, false, var3.field1143, arg0.field1354);
        if (var3.field1156 != null && field609 >= var3.field1164 && field609 < var3.field1152) {
            var3.field1142 = false;
            var3.field1150 = method3500(arg0, var3.field1300, var3.field1225, var4);
            var3.field1229 = field609;
            arg0.field1372.method4509(var4, var3.field1300, var3.field1225, var3.field1150, 60, var3, var3.field1226, var7, var3.field1157, var3.field1158, var3.field1159, var3.field1173);
            return;
        }
        if ((var3.field1300 & 0x7F) == 64 && (var3.field1225 & 0x7F) == 64) {
            if (field635 == arg0.field1358[var5][var6]) {
                return;
            }
            arg0.field1358[var5][var6] = field635;
        }
        var3.field1150 = method3500(arg0, var3.field1300, var3.field1225, var4);
        var3.field1229 = field609;
        arg0.field1372.method4508(var4, var3.field1300, var3.field1225, var3.field1150, 60, var3, var3.field1226, var7, var3.field1227);
    }

    @ObfuscatedName("fe.jk(Ldd;ZI)V")
    public static final void method3084(class104 arg0, boolean arg1) {
        for (int var2 = 0; var2 < arg0.field1367; var2++) {
            class106 var3 = arg0.field1362[arg0.field1351[var2]];
            if (var3 != null && var3.method2443() && var3.field1386.field2037 == arg1 && var3.field1386.method3636()) {
                int var4 = arg0.field1356;
                int var5 = var3.field1300 >> 7;
                int var6 = var3.field1225 >> 7;
                if (var5 >= 0 && var5 < arg0.field1359 && var6 >= 0 && var6 < arg0.field1355) {
                    if (var3.field1228 == 1 && (var3.field1300 & 0x7F) == 64 && (var3.field1225 & 0x7F) == 64) {
                        if (field635 == arg0.field1358[var5][var6]) {
                            continue;
                        }
                        arg0.field1358[var5][var6] = field635;
                    }
                    long var7 = Statics.method5153(0, 0, 1, !var3.field1386.field2047, arg0.field1351[var2], arg0.field1354);
                    var3.field1229 = field609;
                    int var9 = method3500(arg0, var3.field1300 + (var3.field1228 * 64 - 64), var3.field1225 + (var3.field1228 * 64 - 64), var4);
                    arg0.field1372.method4508(var4, var3.field1300, var3.field1225, var9, var3.field1228 * 64 - 64 + 60, var3, var3.field1226, var7, var3.field1227);
                }
            }
        }
    }

    @ObfuscatedName("dv.jz(Ldd;I)V")
    public static void method2273(class104 arg0) {
        int var1 = 0;
        for (int var2 = 0; var2 < arg0.field1366; var2++) {
            class480 var3 = arg0.field1365[arg0.field1364[var2]];
            if (var3 != null) {
                boolean var4 = Statics.field1305 == var3.field5008.field1354;
                if (!var4) {
                    boolean var5 = var1 < field812;
                    if (!var5) {
                        continue;
                    }
                    var1++;
                }
                var3.field5012 = method3500(arg0, var3.field5011, var3.field5006, arg0.field1356);
                var3.field5008.field1372.field2636 = field609;
                var3.method8170();
                arg0.field1372.method4508(arg0.field1356, var3.field5011, var3.field5006, var3.field5012, 60, var3.field5008.field1372, var3.field5014, 0L, false);
                method7992(var3.field5008);
                class104 var6 = var3.field5008;
                if (field784 >= 0 && var6.field1369[field784] != null) {
                    method1087(var6, field784, false);
                }
                method3084(var3.field5008, true);
                class104 var7 = var3.field5008;
                int var8 = field718.field1438;
                int[] var9 = field718.field1436;
                for (int var10 = 0; var10 < var8; var10++) {
                    if (field784 != var9[var10] && field652 != var9[var10]) {
                        method1087(var7, var9[var10], true);
                    }
                }
                method3084(var3.field5008, false);
                method52(var3.field5008);
                class104 var11 = var3.field5008;
                for (class75 var12 = (class75) var11.field1363.method7029(); var12 != null; var12 = (class75) var11.field1363.method7031()) {
                    if (var11.field1356 != var12.field908 || var12.field913) {
                        var12.method8362();
                    } else if (field609 >= var12.field906) {
                        var12.method2181(field599);
                        if (var12.field913) {
                            var12.method8362();
                        } else {
                            var11.field1372.method4508(var12.field908, var12.field917, var12.field905, var12.field909, 60, var12, 0, -1L, false);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.jq(Ldd;B)V")
    public static final void method52(class104 arg0) {
        for (class80 var1 = (class80) arg0.field1370.method7029(); var1 != null; var1 = (class80) arg0.field1370.method7031()) {
            if (arg0.field1356 != var1.field990 || field609 > var1.field999) {
                var1.method8362();
            } else if (field609 >= var1.field1016) {
                if (!var1.field1002 && var1.field1017 != 0) {
                    if (var1.field1017 > 0) {
                        class106 var2 = Statics.field1793.field1362[var1.field1017 - 1];
                        if (var2 != null && 0 <= var2.field1300 && var2.field1300 < 13312 && 0 <= var2.field1225 && var2.field1225 < 13312) {
                            var1.field991 = var2.field1300;
                            var1.field992 = var2.field1225;
                            var1.method2251(var1.field1000, var1.field995, var1.field997, field609);
                        }
                    } else {
                        int var3 = -var1.field1017 - 1;
                        class95 var4;
                        if (field652 == var3) {
                            var4 = Statics.field4826;
                        } else {
                            var4 = Statics.field1793.field1369[var3];
                        }
                        if (var4 != null && 0 <= var4.field1300 && var4.field1300 < 13312 && 0 <= var4.field1225 && var4.field1225 < 13312) {
                            var1.field991 = var4.field1300;
                            var1.field992 = var4.field1225;
                            var1.method2251(var1.field1000, var1.field995, var1.field997, field609);
                        }
                    }
                }
                if (var1.field1003 > 0) {
                    class106 var5 = arg0.field1362[var1.field1003 - 1];
                    if (var5 != null && 0 <= var5.field1300 && var5.field1300 < 13312 && 0 <= var5.field1225 && var5.field1225 < 13312) {
                        var1.method2251(var5.field1300, var5.field1225, method3500(arg0, var5.field1300, var5.field1225, var1.field990) - var1.field994, field609);
                    }
                }
                if (var1.field1003 < 0) {
                    int var6 = -var1.field1003 - 1;
                    class95 var7;
                    if (field652 == var6) {
                        var7 = Statics.field4826;
                    } else {
                        var7 = arg0.field1369[var6];
                    }
                    if (var7 != null && 0 <= var7.field1300 && var7.field1300 < 13312 && 0 <= var7.field1225 && var7.field1225 < 13312) {
                        var1.method2251(var7.field1300, var7.field1225, method3500(arg0, var7.field1300, var7.field1225, var1.field990) - var1.field994, field609);
                    }
                }
                var1.method2252(field599);
                arg0.field1372.method4508(arg0.field1356, (int) var1.field1005, (int) var1.field1006, (int) var1.field1007, 60, var1, var1.field1013, -1L, false);
            }
        }
    }

    @ObfuscatedName("ho.jx(I)I")
    public static final int method3745() {
        if (Statics.field4929.method2695()) {
            return Statics.field1342.field1356;
        }
        int var0 = 3;
        int var1 = Statics.field1791.method1197() >> 7;
        int var2 = Statics.field1791.method1205() >> 7;
        if (Statics.field4936 < 310) {
            int var3;
            int var4;
            if (field612 == 1) {
                var3 = Statics.field1545 >> 7;
                var4 = Statics.field73 >> 7;
            } else {
                var3 = var1;
                var4 = var2;
            }
            int var5 = Statics.field3239 >> 7;
            int var6 = Statics.field161 >> 7;
            if (var5 < 0 || 104 <= var5 || var6 < 0 || 104 <= var6) {
                return Statics.field1342.field1356;
            }
            if (var3 < 0 || 104 <= var3 || var4 < 0 || 104 <= var4) {
                return Statics.field1342.field1356;
            }
            if ((Statics.field1342.field1360[Statics.field1342.field1356][var5][var6] & 0x4) != 0) {
                var0 = Statics.field1342.field1356;
            }
            int var7;
            if (var3 > var5) {
                var7 = var3 - var5;
            } else {
                var7 = var5 - var3;
            }
            int var8;
            if (var4 > var6) {
                var8 = var4 - var6;
            } else {
                var8 = var6 - var4;
            }
            if (var7 > var8) {
                int var9 = var8 * 65536 / var7;
                int var10 = 32768;
                while (var3 != var5) {
                    if (var5 < var3) {
                        var5++;
                    } else if (var5 > var3) {
                        var5--;
                    }
                    if ((Statics.field1342.field1360[Statics.field1342.field1356][var5][var6] & 0x4) != 0) {
                        var0 = Statics.field1342.field1356;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var6 < var4) {
                            var6++;
                        } else if (var6 > var4) {
                            var6--;
                        }
                        if ((Statics.field1342.field1360[Statics.field1342.field1356][var5][var6] & 0x4) != 0) {
                            var0 = Statics.field1342.field1356;
                        }
                    }
                }
            } else if (var8 > 0) {
                int var11 = var7 * 65536 / var8;
                int var12 = 32768;
                while (var4 != var6) {
                    if (var6 < var4) {
                        var6++;
                    } else if (var6 > var4) {
                        var6--;
                    }
                    if ((Statics.field1342.field1360[Statics.field1342.field1356][var5][var6] & 0x4) != 0) {
                        var0 = Statics.field1342.field1356;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var5 < var3) {
                            var5++;
                        } else if (var5 > var3) {
                            var5--;
                        }
                        if ((Statics.field1342.field1360[Statics.field1342.field1356][var5][var6] & 0x4) != 0) {
                            var0 = Statics.field1342.field1356;
                        }
                    }
                }
            }
        }
        if (var1 >= 0 && 104 > var1 && var2 >= 0 && 104 > var2) {
            if ((Statics.field1342.field1360[Statics.field1342.field1356][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1342.field1356;
            }
            return var0;
        } else {
            return Statics.field1342.field1356;
        }
    }

    @ObfuscatedName("cq.jb(I)I")
    public static final int method1182() {
        if (Statics.field4929.method2695()) {
            return Statics.field1342.field1356;
        } else {
            int var0 = method3500(Statics.field1342, Statics.field3239, Statics.field161, Statics.field1342.field1356);
            return var0 - Statics.field1076 >= 800 || (Statics.field1342.field1360[Statics.field1342.field1356][Statics.field3239 >> 7][Statics.field161 >> 7] & 0x4) == 0 ? 3 : Statics.field1342.field1356;
        }
    }

    @ObfuscatedName("hb.jj(I)Lpk;")
    public static class410 method3649() {
        return field724;
    }

    @ObfuscatedName("dt.jm(B)V")
    public static void method2289() {
        for (class269 var0 = (class269) field727.method7029(); var0 != null; var0 = (class269) field727.method7031()) {
            var0.method8362();
        }
    }

    @ObfuscatedName("qj.jy(Lkp;S)V")
    public static void method7250(class269 arg0) {
        if (arg0 == null || arg0.field2970 == null) {
            return;
        }
        if (arg0.field2970.field3991 >= 0) {
            class363 var1 = Statics.field2371.method6131(arg0.field2970.field3872);
            if (var1 == null || var1.field3951 == null || var1.field3951.length == 0 || arg0.field2970.field3991 >= var1.field3951.length || var1.field3951[arg0.field2970.field3991] != arg0.field2970) {
                return;
            }
        }
        if (arg0.field2970.field3855 == 11 && arg0.field2971 == 0) {
            if (arg0.field2970.method6546(arg0.field2975, arg0.field2967, 0, 0)) {
                arg0.field2970.method6589().method4027().method4136(1, arg0.field2970.method6589().method4038());
                switch(arg0.field2970.method6540()) {
                    case 0:
                        class32.method3941(arg0.field2970.method6552(), true, false);
                        break;
                    case 1:
                        int var2 = method5697(arg0.field2970);
                        boolean var3 = (var2 >> 22 & 0x1) != 0;
                        if (var3) {
                            int[] var4 = arg0.field2970.method6633();
                            if (var4 != null) {
                                class326 var5 = class326.method3199(class324.field3357, field582.field1486);
                                var5.field3426.method8958(arg0.field2970.field3991);
                                var5.field3426.method8960(var4[0]);
                                var5.field3426.method9027(var4[1]);
                                var5.field3426.method8960(arg0.field2970.field3852);
                                var5.field3426.method8960(var4[2]);
                                var5.field3426.method9027(arg0.field2970.method6551());
                                field582.method2943(var5);
                            }
                        }
                }
            }
        } else if (arg0.field2970.field3855 == 12) {
            class361 var6 = arg0.field2970.method6558();
            if (var6 != null && var6.method6295()) {
                switch(arg0.field2971) {
                    case 0:
                        field680.method5057(arg0.field2970);
                        var6.method6243(true);
                        var6.method6345(arg0.field2975, arg0.field2967, field664.method5077(82), field664.method5077(81));
                        break;
                    case 1:
                        var6.method6283(arg0.field2975, arg0.field2967);
                }
            }
        }
    }

    @ObfuscatedName("dj.jc(B)Z")
    public static boolean method2396() {
        return (field584 & 0x4) != 0;
    }

    @ObfuscatedName("fd.jl(I)Z")
    public static boolean method3252() {
        return (field584 & 0x1) != 0;
    }

    @ObfuscatedName("ly.jd(I)Z")
    public static boolean method5624() {
        return (field584 & 0x8) != 0;
    }

    @ObfuscatedName("gz.kr(Ldi;I)Z")
    public static boolean method3385(class95 arg0) {
        if (field584 == 0) {
            return false;
        } else if (Statics.field4826 == arg0) {
            return method5624();
        } else {
            boolean var1 = method2396() || method3252() && arg0.method2444();
            if (!var1) {
                boolean var2 = (field584 & 0x2) != 0;
                var1 = var2 && arg0.method2433();
            }
            return var1;
        }
    }

    @ObfuscatedName("sh.km(Ldd;Ldy;IIIIIB)V")
    public static final void method8062(class104 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null || !arg1.method2443()) {
            return;
        }
        if (arg1 instanceof class106) {
            class195 var7 = ((class106) arg1).field1386;
            if (var7.field2041 != null) {
                var7 = var7.method3603();
            }
            if (var7 == null) {
                return;
            }
        }
        int var8 = field718.field1438;
        int[] var9 = field718.field1436;
        boolean var10 = arg2 < var8;
        int var11 = -2;
        if (arg1.field1245 != null && (!var10 || !arg1.field1276 && (field744 == 4 || !arg1.field1280 && (field744 == 0 || field744 == 3 || field744 == 1 && ((class95) arg1).method2444())))) {
            method3438(arg0, arg1, arg1.method2523());
            if (field636 > -1 && field624 < field625) {
                field629[field624] = Statics.field160.method7656(arg1.field1245) / 2;
                field643[field624] = Statics.field160.field4804;
                field626[field624] = field636;
                field752[field624] = field637 - var11;
                field676[field624] = arg1.field1298;
                field735[field624] = arg1.field1224;
                field633[field624] = arg1.field1248;
                field646[field624] = arg1.field1251;
                field634[field624] = arg1.field1245;
                field624++;
                var11 += 12;
            }
        }
        if (!arg1.field1267.method7075()) {
            method3438(arg0, arg1, arg1.method2523() + 15);
            for (class105 var12 = (class105) arg1.field1267.method7126(); var12 != null; var12 = (class105) arg1.field1267.method7084()) {
                class101 var13 = var12.method2728(field609);
                if (var13 != null) {
                    class187 var14 = var12.field1375;
                    class565 var15 = var14.method3538();
                    class565 var16 = var14.method3537();
                    int var17 = 0;
                    int var18;
                    if (var15 == null || var16 == null) {
                        var18 = var14.field1955;
                    } else {
                        if (var14.field1942 * 2 < var16.field5518) {
                            var17 = var14.field1942;
                        }
                        var18 = var16.field5518 - var17 * 2;
                    }
                    int var19 = 255;
                    boolean var20 = true;
                    int var21 = field609 - var13.field1306;
                    int var22 = var13.field1301 * var18 / var14.field1955;
                    int var25;
                    if (var13.field1303 > var21) {
                        int var23 = var14.field1951 == 0 ? 0 : var21 / var14.field1951 * var14.field1951;
                        int var24 = var13.field1302 * var18 / var14.field1955;
                        var25 = (var22 - var24) * var23 / var13.field1303 + var24;
                    } else {
                        var25 = var22;
                        int var26 = var13.field1303 + var14.field1952 - var21;
                        if (var14.field1950 >= 0) {
                            var19 = (var26 << 8) / (var14.field1952 - var14.field1950);
                        }
                    }
                    if (var13.field1301 > 0 && var25 < 1) {
                        var25 = 1;
                    }
                    if (var15 == null || var16 == null) {
                        var11 += 5;
                        if (field636 > -1) {
                            int var32 = field636 + arg3 - (var18 >> 1);
                            int var33 = field637 + arg4 - var11;
                            class561.method9302(var32, var33, var25, 5, 65280);
                            class561.method9302(var25 + var32, var33, var18 - var25, 5, 16711680);
                        }
                        var11 += 2;
                    } else {
                        int var27;
                        if (var18 == var25) {
                            var27 = var17 * 2 + var25;
                        } else {
                            var27 = var17 + var25;
                        }
                        int var28 = var15.field5511;
                        var11 += var28;
                        int var29 = field636 + arg3 - (var18 >> 1);
                        int var30 = field637 + arg4 - var11;
                        int var31 = var29 - var17;
                        if (var19 >= 0 && var19 < 255) {
                            var15.method9441(var31, var30, var19);
                            class561.method9295(var31, var30, var27 + var31, var28 + var30);
                            var16.method9441(var31, var30, var19);
                        } else {
                            var15.method9410(var31, var30);
                            class561.method9295(var31, var30, var27 + var31, var28 + var30);
                            var16.method9410(var31, var30);
                        }
                        class561.method9294(arg3, arg4, arg3 + arg5, arg4 + arg6);
                        var11 += 2;
                    }
                } else if (var12.method2734()) {
                    var12.method8362();
                }
            }
        }
        if (var11 == -2) {
            var11 += 7;
        }
        if (var10 && field609 == arg1.field1229 && method3385((class95) arg1)) {
            class95 var34 = (class95) arg1;
            if (var10) {
                method3438(arg0, arg1, arg1.method2523() + 15);
                class439 var35 = (class439) field619.get(class520.field5255);
                var11 += 4;
                var35.method7758(var34.field1168.method9621(), field636 + arg3, field637 + arg4 - var11, 16777215, 0);
                var11 += 18;
            }
        }
        if (var10) {
            class95 var36 = (class95) arg1;
            if (var36.field1163) {
                return;
            }
            if (var36.field1144 != -1 || var36.field1145 != -1) {
                method3438(arg0, arg1, arg1.field1284 + 15);
                if (field636 > -1) {
                    if (var36.field1144 != -1) {
                        var11 += 25;
                        Statics.field5318[var36.field1144].method9410(field636 + arg3 - 12, field637 + arg4 - var11);
                    }
                    if (var36.field1145 != -1) {
                        var11 += 25;
                        Statics.field1530[var36.field1145].method9410(field636 + arg3 - 12, field637 + arg4 - var11);
                    }
                }
            }
            if (arg2 >= 0 && field540 == 10 && field542 == var9[arg2]) {
                method3438(arg0, arg1, arg1.field1284 + 15);
                if (field636 > -1) {
                    int var37 = Statics.field3244[1].field5511 + var11;
                    Statics.field3244[1].method9410(field636 + arg3 - 12, field637 + arg4 - var37);
                }
            }
        } else {
            class106 var38 = (class106) arg1;
            int[] var39 = var38.method2795();
            short[] var40 = var38.method2743();
            if (var40 != null && var39 != null) {
                for (int var41 = 0; var41 < var40.length; var41++) {
                    if (var40[var41] >= 0 && var39[var41] >= 0) {
                        long var42 = (long) var39[var41] << 8 | (long) var40[var41];
                        class565 var44 = (class565) field805.method7960(var42);
                        if (var44 == null) {
                            class565[] var45 = class566.method3068(Statics.field479, var39[var41], 0);
                            if (var45 != null && var40[var41] < var45.length) {
                                var44 = var45[var40[var41]];
                                field805.method7961(var42, var44);
                            }
                        }
                        if (var44 != null) {
                            method3438(arg0, arg1, arg1.method2523() + 15);
                            if (field636 > -1) {
                                var44.method9410(field636 + arg3 - (var44.field5518 >> 1), field637 + ((arg4 - var44.field5511 - 2) * (var41 + 1) - var44.field5511) - 4);
                            }
                        }
                    }
                }
            }
            if (field540 == 1 && field606 == arg0.field1351[arg2 - var8] && field609 % 20 < 10) {
                method3438(arg0, arg1, arg1.method2523() + 15);
                if (field636 > -1) {
                    Statics.field3244[0].method9410(field636 + arg3 - 12, field637 + arg4 - 28);
                }
            }
        }
        for (int var46 = 0; var46 < 4; var46++) {
            int var47 = arg1.field1255[var46];
            int var48 = arg1.field1233[var46];
            class208 var49 = null;
            int var50 = 0;
            if (var48 >= 0) {
                if (var47 <= field609) {
                    continue;
                }
                int var51 = arg1.field1233[var46];
                class208 var52 = (class208) class208.field2138.method5733((long) var51);
                class208 var53;
                if (var52 == null) {
                    byte[] var54 = Statics.field2161.method6782(32, var51);
                    class208 var55 = new class208();
                    if (var54 != null) {
                        var55.method3759(new class551(var54));
                    }
                    class208.field2138.method5735(var55, (long) var51);
                    var53 = var55;
                } else {
                    var53 = var52;
                }
                var49 = var53;
                var50 = var53.field2148;
                if (var53 != null && var53.field2159 != null) {
                    var49 = var53.method3768();
                    if (var49 == null) {
                        arg1.field1255[var46] = -1;
                        continue;
                    }
                }
            } else if (var47 < 0) {
                continue;
            }
            int var56 = arg1.field1256[var46];
            class208 var57 = null;
            if (var56 >= 0) {
                class208 var58 = (class208) class208.field2138.method5733((long) var56);
                class208 var59;
                if (var58 == null) {
                    byte[] var60 = Statics.field2161.method6782(32, var56);
                    class208 var61 = new class208();
                    if (var60 != null) {
                        var61.method3759(new class551(var60));
                    }
                    class208.field2138.method5735(var61, (long) var56);
                    var59 = var61;
                } else {
                    var59 = var58;
                }
                var57 = var59;
                if (var59 != null && var59.field2159 != null) {
                    var57 = var59.method3768();
                }
            }
            if (var47 - var50 <= field609) {
                if (var49 == null) {
                    arg1.field1255[var46] = -1;
                } else {
                    method3438(arg0, arg1, arg1.method2523() / 2);
                    if (field636 > -1) {
                        boolean var62 = true;
                        if (var46 == 1) {
                            field637 -= 20;
                        }
                        if (var46 == 2) {
                            field636 -= 15;
                            field637 -= 10;
                        }
                        if (var46 == 3) {
                            field636 += 15;
                            field637 -= 10;
                        }
                        Object var63 = null;
                        Object var64 = null;
                        Object var65 = null;
                        Object var66 = null;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        class565 var75 = null;
                        class565 var76 = null;
                        class565 var77 = null;
                        class565 var78 = null;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        int var83 = 0;
                        int var84 = 0;
                        int var85 = 0;
                        int var86 = 0;
                        int var87 = 0;
                        class565 var88 = var49.method3765();
                        if (var88 != null) {
                            var67 = var88.field5518;
                            int var89 = var88.field5511;
                            if (var89 > var87) {
                                var87 = var89;
                            }
                            var71 = var88.field5512;
                        }
                        class565 var90 = var49.method3781();
                        if (var90 != null) {
                            var68 = var90.field5518;
                            int var91 = var90.field5511;
                            if (var91 > var87) {
                                var87 = var91;
                            }
                            var72 = var90.field5512;
                        }
                        class565 var92 = var49.method3787();
                        if (var92 != null) {
                            var69 = var92.field5518;
                            int var93 = var92.field5511;
                            if (var93 > var87) {
                                var87 = var93;
                            }
                            var73 = var92.field5512;
                        }
                        class565 var94 = var49.method3766();
                        if (var94 != null) {
                            var70 = var94.field5518;
                            int var95 = var94.field5511;
                            if (var95 > var87) {
                                var87 = var95;
                            }
                            var74 = var94.field5512;
                        }
                        if (var57 != null) {
                            var75 = var57.method3765();
                            if (var75 != null) {
                                var79 = var75.field5518;
                                int var96 = var75.field5511;
                                if (var96 > var87) {
                                    var87 = var96;
                                }
                                var83 = var75.field5512;
                            }
                            var76 = var57.method3781();
                            if (var76 != null) {
                                var80 = var76.field5518;
                                int var97 = var76.field5511;
                                if (var97 > var87) {
                                    var87 = var97;
                                }
                                var84 = var76.field5512;
                            }
                            var77 = var57.method3787();
                            if (var77 != null) {
                                var81 = var77.field5518;
                                int var98 = var77.field5511;
                                if (var98 > var87) {
                                    var87 = var98;
                                }
                                var85 = var77.field5512;
                            }
                            var78 = var57.method3766();
                            if (var78 != null) {
                                var82 = var78.field5518;
                                int var99 = var78.field5511;
                                if (var99 > var87) {
                                    var87 = var99;
                                }
                                var86 = var78.field5512;
                            }
                        }
                        class435 var100 = var49.method3767();
                        if (var100 == null) {
                            var100 = Statics.field1830;
                        }
                        class435 var101;
                        if (var57 == null) {
                            var101 = Statics.field1830;
                        } else {
                            var101 = var57.method3767();
                            if (var101 == null) {
                                var101 = Statics.field1830;
                            }
                        }
                        Object var102 = null;
                        String var103 = null;
                        boolean var104 = false;
                        int var105 = 0;
                        String var106 = var49.method3761(arg1.field1254[var46]);
                        int var107 = var100.method7656(var106);
                        if (var57 != null) {
                            var103 = var57.method3761(arg1.field1257[var46]);
                            var105 = var101.method7656(var103);
                        }
                        int var108 = 0;
                        int var109 = 0;
                        if (var68 > 0) {
                            if (var92 == null && var94 == null) {
                                var108 = 1;
                            } else {
                                var108 = var107 / var68 + 1;
                            }
                        }
                        if (var57 != null && var80 > 0) {
                            if (var77 == null && var78 == null) {
                                var109 = 1;
                            } else {
                                var109 = var105 / var80 + 1;
                            }
                        }
                        int var110 = 0;
                        int var111 = var110;
                        if (var67 > 0) {
                            var110 += var67;
                        }
                        var110 += 2;
                        int var112 = var110;
                        if (var69 > 0) {
                            var110 += var69;
                        }
                        int var113 = var110;
                        int var114 = var110;
                        int var116;
                        if (var68 > 0) {
                            int var115 = var68 * var108;
                            var116 = var110 + var115;
                            var114 = (var115 - var107) / 2 + var110;
                        } else {
                            var116 = var107 + var110;
                        }
                        int var117 = var116;
                        if (var70 > 0) {
                            var116 += var70;
                        }
                        int var118 = 0;
                        int var119 = 0;
                        int var120 = 0;
                        int var121 = 0;
                        int var122 = 0;
                        if (var57 != null) {
                            var116 += 2;
                            var118 = var116;
                            if (var79 > 0) {
                                var116 += var79;
                            }
                            var116 += 2;
                            var119 = var116;
                            if (var81 > 0) {
                                var116 += var81;
                            }
                            var120 = var116;
                            var122 = var116;
                            if (var80 > 0) {
                                int var123 = var80 * var109;
                                var116 += var123;
                                var122 += (var123 - var105) / 2;
                            } else {
                                var116 += var105;
                            }
                            var121 = var116;
                            if (var82 > 0) {
                                var116 += var82;
                            }
                        }
                        int var124 = arg1.field1255[var46] - field609;
                        int var125 = var49.field2153 - var49.field2153 * var124 / var49.field2148;
                        int var126 = var49.field2154 * var124 / var49.field2148 + -var49.field2154;
                        int var127 = field636 + arg3 - (var116 >> 1) + var125;
                        int var128 = field637 + arg4 - 12 + var126;
                        int var129 = var128;
                        int var130 = var87 + var128;
                        int var131 = var49.field2158 + var128 + 15;
                        int var132 = var131 - var100.field4805;
                        int var133 = var100.field4806 + var131;
                        if (var132 < var128) {
                            var129 = var132;
                        }
                        if (var133 > var130) {
                            var130 = var133;
                        }
                        int var134 = 0;
                        if (var57 != null) {
                            var134 = var57.field2158 + var128 + 15;
                            int var135 = var134 - var101.field4805;
                            int var136 = var101.field4806 + var134;
                            if (var135 < var129) {
                                ;
                            }
                            if (var136 > var130) {
                                ;
                            }
                        }
                        int var139 = 255;
                        if (var49.field2155 >= 0) {
                            var139 = (var124 << 8) / (var49.field2148 - var49.field2155);
                        }
                        if (var139 >= 0 && var139 < 255) {
                            if (var88 != null) {
                                var88.method9441(var111 + var127 - var71, var128, var139);
                            }
                            if (var92 != null) {
                                var92.method9441(var112 + var127 - var73, var128, var139);
                            }
                            if (var90 != null) {
                                for (int var140 = 0; var140 < var108; var140++) {
                                    var90.method9441(var68 * var140 + (var113 + var127 - var72), var128, var139);
                                }
                            }
                            if (var94 != null) {
                                var94.method9441(var117 + var127 - var74, var128, var139);
                            }
                            var100.method7689(var106, var114 + var127, var131, var49.field2147, 0, var139);
                            if (var57 != null) {
                                if (var75 != null) {
                                    var75.method9441(var118 + var127 - var83, var128, var139);
                                }
                                if (var77 != null) {
                                    var77.method9441(var119 + var127 - var85, var128, var139);
                                }
                                if (var76 != null) {
                                    for (int var141 = 0; var141 < var109; var141++) {
                                        var76.method9441(var80 * var141 + (var120 + var127 - var84), var128, var139);
                                    }
                                }
                                if (var78 != null) {
                                    var78.method9441(var121 + var127 - var86, var128, var139);
                                }
                                var101.method7689(var103, var122 + var127, var134, var57.field2147, 0, var139);
                            }
                        } else {
                            if (var88 != null) {
                                var88.method9410(var111 + var127 - var71, var128);
                            }
                            if (var92 != null) {
                                var92.method9410(var112 + var127 - var73, var128);
                            }
                            if (var90 != null) {
                                for (int var142 = 0; var142 < var108; var142++) {
                                    var90.method9410(var68 * var142 + (var113 + var127 - var72), var128);
                                }
                            }
                            if (var94 != null) {
                                var94.method9410(var117 + var127 - var74, var128);
                            }
                            var100.method7662(var106, var114 + var127, var131, var49.field2147 | 0xFF000000, 0);
                            if (var57 != null) {
                                if (var75 != null) {
                                    var75.method9410(var118 + var127 - var83, var128);
                                }
                                if (var77 != null) {
                                    var77.method9410(var119 + var127 - var85, var128);
                                }
                                if (var76 != null) {
                                    for (int var143 = 0; var143 < var109; var143++) {
                                        var76.method9410(var80 * var143 + (var120 + var127 - var84), var128);
                                    }
                                }
                                if (var78 != null) {
                                    var78.method9410(var121 + var127 - var86, var128);
                                }
                                var101.method7662(var103, var122 + var127, var134, var57.field2147 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fz.kj(Ldd;IIIIB)V")
    public static final void method3281(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        field624 = 0;
        boolean var5 = false;
        int var6 = -1;
        int var7 = -1;
        int var8 = field718.field1438;
        int[] var9 = field718.field1436;
        for (int var10 = 0; var10 < arg0.field1367 + var8; var10++) {
            class100 var11;
            if (var10 < var8) {
                var11 = arg0.field1369[var9[var10]];
                if (field784 == var9[var10]) {
                    var5 = true;
                    var6 = var10;
                    continue;
                }
                if (Statics.field4826 == var11) {
                    var7 = var10;
                    continue;
                }
            } else {
                var11 = arg0.field1362[arg0.field1351[var10 - var8]];
            }
            method8062(arg0, var11, var10, arg1, arg2, arg3, arg4);
        }
        if (field651 && var7 != -1) {
            method8062(arg0, Statics.field4826, var7, arg1, arg2, arg3, arg4);
        }
        if (var5) {
            method8062(arg0, arg0.field1369[field784], var6, arg1, arg2, arg3, arg4);
        }
        for (int var12 = 0; var12 < field624; var12++) {
            int var13 = field626[var12];
            int var14 = field752[var12];
            int var15 = field629[var12];
            int var16 = field643[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field752[var18] - field643[var18] && var14 - var16 < field752[var18] + 2 && var13 - var15 < field629[var18] + field626[var18] && var13 + var15 > field626[var18] - field629[var18] && field752[var18] - field643[var18] < var14) {
                        var14 = field752[var18] - field643[var18];
                        var17 = true;
                    }
                }
            }
            field636 = field626[var12];
            field637 = field752[var12] = var14;
            String var19 = field634[var12];
            if (field785 == 0) {
                int var20 = 16776960;
                if (field676[var12] < 6) {
                    var20 = field743[field676[var12]];
                }
                if (field676[var12] == 6) {
                    var20 = field635 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field676[var12] == 7) {
                    var20 = field635 % 20 < 10 ? 255 : 65535;
                }
                if (field676[var12] == 8) {
                    var20 = field635 % 20 < 10 ? 45056 : 8454016;
                }
                if (field676[var12] == 9) {
                    int var21 = 150 - field633[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field676[var12] == 10) {
                    int var22 = 150 - field633[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field676[var12] == 11) {
                    int var23 = 150 - field633[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field676[var12] == 12 && field646[var12] == null) {
                    int var24 = var19.length();
                    field646[var12] = new int[var24];
                    for (int var25 = 0; var25 < var24; var25++) {
                        int var26 = (int) ((float) var25 / (float) var24 * 64.0F);
                        int var27 = var26 << 10 | 0x380 | 0x40;
                        field646[var12][var25] = class502.field5106[var27];
                    }
                }
                if (field735[var12] == 0) {
                    Statics.field160.method7692(var19, field636 + arg1, field637 + arg2, var20, 0, field646[var12]);
                }
                if (field735[var12] == 1) {
                    Statics.field160.method7705(var19, field636 + arg1, field637 + arg2, var20, 0, field635, field646[var12]);
                }
                if (field735[var12] == 2) {
                    Statics.field160.method7762(var19, field636 + arg1, field637 + arg2, var20, 0, field635, field646[var12]);
                }
                if (field735[var12] == 3) {
                    Statics.field160.method7735(var19, field636 + arg1, field637 + arg2, var20, 0, field635, 150 - field633[var12], field646[var12]);
                }
                if (field735[var12] == 4) {
                    int var28 = (150 - field633[var12]) * (Statics.field160.method7656(var19) + 100) / 150;
                    class561.method9295(field636 + arg1 - 50, arg2, field636 + arg1 + 50, arg2 + arg4);
                    Statics.field160.method7670(var19, field636 + arg1 + 50 - var28, field637 + arg2, var20, 0, field646[var12]);
                    class561.method9294(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
                if (field735[var12] == 5) {
                    int var29 = 150 - field633[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    class561.method9295(arg1, field637 + arg2 - Statics.field160.field4804 - 1, arg1 + arg3, field637 + arg2 + 5);
                    Statics.field160.method7692(var19, field636 + arg1, field637 + arg2 + var30, var20, 0, field646[var12]);
                    class561.method9294(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
            } else {
                Statics.field160.method7758(var19, field636 + arg1, field637 + arg2, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("cb.ku(I)V")
    public static final void method2189() {
        field729 = 0;
        int var0 = (Statics.field4826.field1300 >> 7) + Statics.field1342.field1350;
        int var1 = (Statics.field4826.field1225 >> 7) + Statics.field1342.field1357;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field729 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field729 = 1;
        }
        if (field729 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field729 = 0;
        }
    }

    @ObfuscatedName("at.kn(IIIII)V")
    public static final void method54(int arg0, int arg1, int arg2, int arg3) {
        method2189();
    }

    @ObfuscatedName("gn.kg(Ldd;Ldy;II)V")
    public static void method3438(class104 arg0, class100 arg1, int arg2) {
        class352 var3 = arg1.method2521(arg0);
        int var4 = class352.method6091(arg1.field1300, arg1.field1228 - 1);
        int var5 = class352.method6091(arg1.field1225, arg1.field1228 - 1);
        method700(arg0, var3.field3754, var3.field3756, var4, var5, arg2);
    }

    @ObfuscatedName("bp.kc(Ldd;IIIIII)V")
    public static void method700(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 128 || 13056 < arg1 || arg2 < 128 || 13056 < arg2) {
            field636 = -1;
            field637 = -1;
            return;
        }
        int var6 = method3500(arg0, arg3, arg4, arg0.field1356) - arg5;
        int var7 = arg1 - Statics.field3239;
        int var8 = var6 - Statics.field1076;
        int var9 = arg2 - Statics.field161;
        int var10 = class240.field2590[Statics.field4936];
        int var11 = class240.field2588[Statics.field4936];
        int var12 = class240.field2590[Statics.field2962];
        int var13 = class240.field2588[Statics.field2962];
        int var14 = var7 * var13 + var9 * var12 >> 16;
        int var15 = var9 * var13 - var7 * var12 >> 16;
        int var17 = var8 * var11 - var10 * var15 >> 16;
        int var18 = var8 * var10 + var11 * var15 >> 16;
        if (var18 >= 50) {
            field636 = field618 * var14 / var18 + field796 / 2;
            field637 = field618 * var17 / var18 + field797 / 2;
        } else {
            field636 = -1;
            field637 = -1;
        }
    }

    @ObfuscatedName("he.ki(Ldd;IIII)I")
    public static final int method3500(class104 arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 >= arg0.field1360[0].length || var5 >= arg0.field1360[0][0].length) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (arg0.field1360[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * arg0.field1371[var6][var4][var5] + arg0.field1371[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * arg0.field1371[var6][var4][var5 + 1] + arg0.field1371[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @ObfuscatedName("en.kp(III)I")
    public static int method2977(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field789 - field788) * var2 / 100 + field788;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("hk.kh(IIIIIIII)V")
    public static final void method3546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method2977(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class240.field2590[var8];
            int var14 = class240.field2588[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class240.field2590[var9];
            int var17 = class240.field2588[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        if (field706) {
            Statics.field4919 = arg0 - var10;
            Statics.field1171 = arg1 - var11;
            Statics.field4451 = arg2 - var12;
            Statics.field304 = arg3;
            Statics.field354 = arg4;
        } else {
            Statics.field3239 = arg0 - var10;
            Statics.field1076 = arg1 - var11;
            Statics.field161 = arg2 - var12;
            Statics.field4936 = arg3;
            Statics.field2962 = arg4;
        }
        if (field612 == 1 && field689 >= 2 && field609 % 50 == 0 && (Statics.field1545 >> 7 != Statics.field4826.field1300 >> 7 || Statics.field73 >> 7 != Statics.field4826.field1225 >> 7)) {
            int var19 = Statics.field4826.field1167;
            int var20 = (Statics.field1545 >> 7) + Statics.field1342.field1350;
            int var21 = (Statics.field73 >> 7) + Statics.field1342.field1357;
            method8836(var20, var21, var19, true);
        }
    }

    @ObfuscatedName("go.kx(IIZS)V")
    public static final void method3310(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1192 == arg0 && Statics.field474 == arg1) {
            return;
        }
        Statics.field1192 = arg0;
        Statics.field474 = arg1;
        method7976(25);
        field773 = true;
        method5761(class382.field4242, true);
        int var3 = Statics.field1342.field1350;
        int var4 = Statics.field1342.field1357;
        Statics.field1342.field1350 = (arg0 - 6) * 8;
        Statics.field1342.field1357 = (arg1 - 6) * 8;
        int var5 = Statics.field1342.field1350 - var3;
        int var6 = Statics.field1342.field1357 - var4;
        int var7 = Statics.field1342.field1350;
        int var8 = Statics.field1342.field1357;
        for (int var9 = 0; var9 < 65536; var9++) {
            class106 var10 = Statics.field1342.field1362[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1295[var11] -= var5;
                    var10.field1296[var11] -= var6;
                }
                var10.field1300 -= var5 * 128;
                var10.field1225 -= var6 * 128;
                var10.field1258 -= var5;
                var10.field1249 -= var6;
                var10.field1277 -= var5;
                var10.field1232 -= var6;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class95 var13 = Statics.field1342.field1369[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1295[var14] -= var5;
                    var13.field1296[var14] -= var6;
                }
                var13.field1300 -= var5 * 128;
                var13.field1225 -= var6 * 128;
                var13.field1258 -= var5;
                var13.field1249 -= var6;
                var13.field1277 -= var5;
                var13.field1232 -= var6;
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class480 var16 = Statics.field1342.field1365[var15];
            if (var16 != null) {
                for (int var17 = 0; var17 < 10; var17++) {
                    var16.field5017[var17] -= var5;
                    var16.field5018[var17] -= var6;
                }
                var16.field5011 -= var5 * 128;
                var16.field5006 -= var6 * 128;
            }
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var5 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 1;
        if (var6 < 0) {
            var21 = 103;
            var22 = -1;
            var23 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var25 = var21; var25 != var22; var25 += var23) {
                int var26 = var5 + var24;
                int var27 = var6 + var25;
                for (int var28 = 0; var28 < 4; var28++) {
                    if (0 <= var26 && var26 < 104 && 0 <= var27 && var27 < 104) {
                        Statics.field1342.field1368[var28][var24][var25] = Statics.field1342.field1368[var28][var26][var27];
                    } else {
                        Statics.field1342.field1368[var28][var24][var25] = null;
                    }
                }
            }
        }
        for (class99 var29 = (class99) Statics.field1342.field1353.method7029(); var29 != null; var29 = (class99) Statics.field1342.field1353.method7031()) {
            var29.field1208 -= var5;
            var29.field1223 -= var6;
            if (var29.field1208 < 0 || 104 <= var29.field1208 || var29.field1223 < 0 || 104 <= var29.field1223) {
                var29.method8362();
            }
        }
        if (field758 != 0) {
            field758 -= var5;
            field690 -= var6;
        }
        field766 = 0;
        field706 = false;
        Statics.field3239 -= var5 << 7;
        Statics.field161 -= var6 << 7;
        Statics.field1545 -= var5 << 7;
        Statics.field73 -= var6 << 7;
        field757 = -1;
        Statics.field1342.field1363.method7023();
        Statics.field1342.field1370.method7023();
        for (int var30 = 0; var30 < 4; var30++) {
            Statics.field1342.field1352[var30].method5098();
        }
    }

    @ObfuscatedName("kx.ka(ZI)V")
    public static final void method5138(boolean arg0) {
        method6956();
        field582.field1491++;
        if (field582.field1491 < 50 && !arg0) {
            return;
        }
        field582.field1491 = 0;
        if (field541 || field582.method2958() == null) {
            return;
        }
        class326 var1 = class326.method3199(class324.field3333, field582.field1486);
        field582.method2943(var1);
        try {
            field582.method2942();
        } catch (IOException var3) {
            field541 = true;
        }
    }

    @ObfuscatedName("oj.kf(B)V")
    public static final void method6703() {
        method5138(false);
        field605 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1069.length; var1++) {
            if (Statics.field18[var1] != -1 && Statics.field1069[var1] == null) {
                Statics.field1069[var1] = Statics.field4712.method6782(Statics.field18[var1], 0);
                if (Statics.field1069[var1] == null) {
                    var0 = false;
                    field605++;
                }
            }
            if (Statics.field5298[var1] != -1 && Statics.field2301[var1] == null) {
                Statics.field2301[var1] = Statics.field4712.method6833(Statics.field5298[var1], 0, Statics.field3812[var1]);
                if (Statics.field2301[var1] == null) {
                    var0 = false;
                    field605++;
                }
            }
        }
        if (!var0) {
            field591 = 1;
            return;
        }
        field627 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1069.length; var3++) {
            byte[] var4 = Statics.field2301[var3];
            if (var4 != null) {
                int var5 = (Statics.field2761[var3] >> 8) * 64 - Statics.field1342.field1350;
                int var6 = (Statics.field2761[var3] & 0xFF) * 64 - Statics.field1342.field1357;
                if (field632) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class85.method4233(var4, var5, var6);
            }
        }
        if (!var2) {
            field591 = 2;
            return;
        }
        if (field591 != 0) {
            method5761(class382.field4242 + class107.field1399 + class107.field1396 + 100 + "%" + class107.field1394, true);
        }
        method6956();
        Statics.field1342.field1372.method4497();
        for (int var7 = 0; var7 < 4; var7++) {
            Statics.field1342.field1352[var7].method5098();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    Statics.field1342.field1360[var8][var9][var10] = 0;
                }
            }
        }
        method6956();
        class85.method2871();
        int var11 = Statics.field1069.length;
        class72.method2197();
        method5138(true);
        if (!field632) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2761[var12] >> 8) * 64 - Statics.field1342.field1350;
                int var14 = (Statics.field2761[var12] & 0xFF) * 64 - Statics.field1342.field1357;
                byte[] var15 = Statics.field1069[var12];
                if (var15 != null) {
                    method6956();
                    class85.method3658(Statics.field1342, var15, var13, var14, Statics.field1192 * 8 - 48, Statics.field474 * 8 - 48);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field2761[var16] >> 8) * 64 - Statics.field1342.field1350;
                int var18 = (Statics.field2761[var16] & 0xFF) * 64 - Statics.field1342.field1357;
                byte[] var19 = Statics.field1069[var16];
                if (var19 == null && Statics.field474 < 800) {
                    method6956();
                    class85.method5612(Statics.field1342, var17, var18, 64, 64);
                }
            }
            method5138(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field2301[var20];
                if (var21 != null) {
                    int var22 = (Statics.field2761[var20] >> 8) * 64 - Statics.field1342.field1350;
                    int var23 = (Statics.field2761[var20] & 0xFF) * 64 - Statics.field1342.field1357;
                    method6956();
                    class85.method3052(Statics.field1342, var21, var22, var23);
                }
            }
        }
        if (field632) {
            for (int var24 = 0; var24 < 4; var24++) {
                method6956();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field595[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field2761.length; var34++) {
                                if (Statics.field2761[var34] == var33 && Statics.field1069[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class85.method5557(Statics.field1342, Statics.field1069[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class85.method2704(Statics.field1342.field1371, var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field595[0][var37][var38];
                    if (var39 == -1) {
                        class85.method5612(Statics.field1342, var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method5138(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method6956();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field595[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field2761.length; var49++) {
                                if (Statics.field2761[var49] == var48 && Statics.field2301[var49] != null) {
                                    class85.method2312(Statics.field1342, Statics.field2301[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method5138(true);
        method6956();
        class85.method472(Statics.field1342);
        method5138(true);
        int var50 = class85.field1054;
        if (var50 > Statics.field1342.field1356) {
            var50 = Statics.field1342.field1356;
        }
        if (var50 < Statics.field1342.field1356 - 1) {
            int var51 = Statics.field1342.field1356 - 1;
        }
        if (field520) {
            Statics.field1342.field1372.method4498(class85.field1054);
        } else {
            Statics.field1342.field1372.method4498(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method6714(Statics.field1342, var52, var53);
            }
        }
        method6956();
        method6989();
        class210.field2174.method5736();
        if (Statics.field3.method509()) {
            class326 var54 = class326.method3199(class324.field3322, field582.field1486);
            var54.field3426.method8960(1057001181);
            field582.method2943(var54);
        }
        if (!field632) {
            int var55 = (Statics.field1192 - 6) / 8;
            int var56 = (Statics.field1192 + 6) / 8;
            int var57 = (Statics.field474 - 6) / 8;
            int var58 = (Statics.field474 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field4712.method6783("m" + var59 + "_" + var60);
                        Statics.field4712.method6783("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method6956();
        class85.method2831();
        class326 var61 = class326.method3199(class324.field3369, field582.field1486);
        field582.method2943(var61);
        class35.method3530();
        field773 = false;
    }

    @ObfuscatedName("hl.ks(Ldd;I)V")
    public static void method3705(class104 arg0) {
        int var1 = arg0.field1359 / 8;
        int var2 = arg0.field1355 / 8;
        boolean var3 = false;
        method5138(false);
        boolean var4 = true;
        for (int var5 = 0; var5 < Statics.field48.length; var5++) {
            if (Statics.field1428[var5] != -1 && Statics.field48[var5] == null) {
                Statics.field48[var5] = Statics.field4712.method6782(Statics.field1428[var5], 0);
                if (Statics.field48[var5] == null) {
                    var4 = false;
                }
            }
            if (Statics.field4933[var5] != -1 && Statics.field1517[var5] == null) {
                Statics.field1517[var5] = Statics.field4712.method6833(Statics.field4933[var5], 0, Statics.field915[var5]);
                if (Statics.field1517[var5] == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return;
        }
        method5138(false);
        boolean var6 = true;
        for (int var7 = 0; var7 < Statics.field48.length; var7++) {
            byte[] var8 = Statics.field1517[var7];
            if (var8 != null) {
                byte var9 = 10;
                byte var10 = 10;
                var6 &= class85.method4233(var8, var9, var10);
            }
        }
        if (!var6) {
            return;
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < arg0.field1360[var11].length; var12++) {
                Arrays.fill(arg0.field1360[var11][var12], (byte) 0);
            }
        }
        method6956();
        class85.method2871();
        class72.method2197();
        method5138(true);
        for (int var13 = 0; var13 < 4; var13++) {
            method6956();
            for (int var14 = 0; var14 < var1; var14++) {
                for (int var15 = 0; var15 < var2; var15++) {
                    boolean var16 = false;
                    int var17 = field592[var13][var14][var15];
                    if (var17 != -1) {
                        int var18 = var17 >> 24 & 0x3;
                        int var19 = var17 >> 1 & 0x3;
                        int var20 = var17 >> 14 & 0x3FF;
                        int var21 = var17 >> 3 & 0x7FF;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < Statics.field1665.length; var23++) {
                            if (Statics.field1665[var23] == var22 && Statics.field48[var23] != null) {
                                int var24 = (var20 - var14) * 8;
                                int var25 = (var21 - var15) * 8;
                                class85.method5557(arg0, Statics.field48[var23], var13, var14 * 8, var15 * 8, var18, (var20 & 0x7) * 8, (var21 & 0x7) * 8, var19, var24, var25);
                                var16 = true;
                                break;
                            }
                        }
                    }
                    if (!var16) {
                        class85.method2704(arg0.field1371, var13, var14 * 8, var15 * 8);
                    }
                }
            }
        }
        for (int var26 = 0; var26 < 13; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                int var28 = field592[0][var26][var27];
                if (var28 == -1) {
                    class85.method5612(arg0, var26 * 8, var27 * 8, 8, 8);
                }
            }
        }
        method5138(true);
        for (int var29 = 0; var29 < 4; var29++) {
            method6956();
            for (int var30 = 0; var30 < var1; var30++) {
                for (int var31 = 0; var31 < var2; var31++) {
                    int var32 = field592[var29][var30][var31];
                    if (var32 != -1) {
                        int var33 = var32 >> 24 & 0x3;
                        int var34 = var32 >> 1 & 0x3;
                        int var35 = var32 >> 14 & 0x3FF;
                        int var36 = var32 >> 3 & 0x7FF;
                        int var37 = (var35 / 8 << 8) + var36 / 8;
                        for (int var38 = 0; var38 < Statics.field1665.length; var38++) {
                            if (Statics.field1665[var38] == var37 && Statics.field1517[var38] != null) {
                                class85.method2312(arg0, Statics.field1517[var38], var29, var30 * 8, var31 * 8, var33, (var35 & 0x7) * 8, (var36 & 0x7) * 8, var34);
                                break;
                            }
                        }
                    }
                }
            }
        }
        method5138(true);
        method6956();
        class85.method472(arg0);
        method5138(true);
        class210.field2174.method5736();
        method6956();
        class85.method2831();
        field613 = false;
    }

    @ObfuscatedName("lq.kt(II)V")
    public static final void method5562(int arg0) {
        int[] var1 = Statics.field1067.field5513;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((Statics.field1342.field1360[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1342.field1372.method4533(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (Statics.field1342.field1360[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1342.field1372.method4533(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1067.method9414();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((Statics.field1342.field1360[arg0][var10][var9] & 0x18) == 0) {
                    method2742(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (Statics.field1342.field1360[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2742(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field765 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field1342.field1372.method4707(Statics.field1342.field1356, var11, var12);
                if (var13 != 0L) {
                    int var15 = class257.method4010(var13);
                    int var16 = class210.method5152(var15).field2199;
                    if (var16 >= 0 && class184.method3200(var16).field1910) {
                        field772[field765] = class184.method3200(var16).method3467(false);
                        field759[field765] = var11;
                        field760[field765] = var12;
                        field765++;
                    }
                }
            }
        }
        Statics.field3281.method9375();
    }

    @ObfuscatedName("ea.kk(IIIIII)V")
    public static final void method2742(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class245 var5 = Statics.field1342.field1372;
        long var6 = var5.method4523(arg0, arg1, arg2);
        if (var6 != 0L) {
            int var8 = var5.method4677(arg0, arg1, arg2, var6);
            int var9 = var8 >> 6 & 0x3;
            int var10 = var8 & 0x1F;
            int var11 = arg3;
            if (class257.method4146(var6)) {
                var11 = arg4;
            }
            int[] var12 = Statics.field1067.field5513;
            int var13 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var14 = class257.method4010(var6);
            class210 var15 = class210.method5152(var14);
            if (var15.field2200 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 1) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
                if (var10 == 3) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                    }
                }
                if (var10 == 2) {
                    if (var9 == 3) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
            } else {
                class564 var16 = Statics.field3069[var15.field2200];
                if (var16 != null) {
                    int var17 = (var15.field2189 * 4 - var16.field5503) / 2;
                    int var18 = (var15.field2187 * 4 - var16.field5504) / 2;
                    var16.method9387(arg1 * 4 + 48 + var17, (104 - arg2 - var15.field2187) * 4 + 48 + var18);
                }
            }
        }
        long var19 = var5.method4595(arg0, arg1, arg2);
        if (var19 != 0L) {
            int var21 = var5.method4677(arg0, arg1, arg2, var19);
            int var22 = var21 >> 6 & 0x3;
            int var23 = var21 & 0x1F;
            int var24 = class257.method4010(var19);
            class210 var25 = class210.method5152(var24);
            if (var25.field2200 != -1) {
                class564 var26 = Statics.field3069[var25.field2200];
                if (var26 != null) {
                    int var27 = (var25.field2189 * 4 - var26.field5503) / 2;
                    int var28 = (var25.field2187 * 4 - var26.field5504) / 2;
                    var26.method9387(arg1 * 4 + 48 + var27, (104 - arg2 - var25.field2187) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (class257.method4146(var19)) {
                    var29 = 15597568;
                }
                int[] var30 = Statics.field1067.field5513;
                int var31 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var22 == 0 || var22 == 2) {
                    var30[var31 + 1536] = var29;
                    var30[var31 + 1024 + 1] = var29;
                    var30[var31 + 512 + 2] = var29;
                    var30[var31 + 3] = var29;
                } else {
                    var30[var31] = var29;
                    var30[var31 + 512 + 1] = var29;
                    var30[var31 + 1024 + 2] = var29;
                    var30[var31 + 1536 + 3] = var29;
                }
            }
        }
        long var32 = var5.method4707(arg0, arg1, arg2);
        if (var32 == 0L) {
            return;
        }
        int var34 = class257.method4010(var32);
        class210 var35 = class210.method5152(var34);
        if (var35.field2200 == -1) {
            return;
        }
        class564 var36 = Statics.field3069[var35.field2200];
        if (var36 != null) {
            int var37 = (var35.field2189 * 4 - var36.field5503) / 2;
            int var38 = (var35.field2187 * 4 - var36.field5504) / 2;
            var36.method9387(arg1 * 4 + 48 + var37, (104 - arg2 - var35.field2187) * 4 + 48 + var38);
        }
    }

    @ObfuscatedName("client.kb(Lel;II)Z")
    public boolean method1498(class117 arg0, int arg1) {
        if (arg0.field1488 == 0) {
            Statics.field1824 = null;
        } else {
            if (Statics.field1824 == null) {
                Statics.field1824 = new class470(Statics.field127, Statics.field3);
            }
            Statics.field1824.method8011(arg0.field1492, arg1);
        }
        method2800();
        arg0.field1487 = null;
        return true;
    }

    @ObfuscatedName("client.kz(Lel;I)Z")
    public boolean method1232(class117 arg0) {
        if (Statics.field1824 != null) {
            Statics.field1824.method8019(arg0.field1492);
        }
        method2800();
        arg0.field1487 = null;
        return true;
    }

    @ObfuscatedName("client.kl(Lel;B)Z")
    public final boolean method1233(class117 arg0) {
        class482 var2 = arg0.method2958();
        class550 var3 = arg0.field1492;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1487 == null) {
                if (arg0.field1485) {
                    if (!var2.method8206(1)) {
                        return false;
                    }
                    var2.method8196(arg0.field1492.field5413, 0, 1);
                    arg0.field1490 = 0;
                    arg0.field1485 = false;
                }
                var3.field5415 = 0;
                if (var3.method8942()) {
                    if (!var2.method8206(1)) {
                        return false;
                    }
                    var2.method8196(arg0.field1492.field5413, 1, 1);
                    arg0.field1490 = 0;
                }
                arg0.field1485 = true;
                class327[] var4 = class327.method5694();
                int var5 = var3.method8914();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5415);
                }
                arg0.field1487 = var4[var5];
                arg0.field1488 = arg0.field1487.field3572;
            }
            if (arg0.field1488 == -1) {
                if (!var2.method8206(1)) {
                    return false;
                }
                arg0.method2958().method8196(var3.field5413, 0, 1);
                arg0.field1488 = var3.field5413[0] & 0xFF;
            }
            if (arg0.field1488 == -2) {
                if (!var2.method8206(2)) {
                    return false;
                }
                arg0.method2958().method8196(var3.field5413, 0, 2);
                var3.field5415 = 0;
                arg0.field1488 = var3.method9119();
            }
            if (!var2.method8206(arg0.field1488)) {
                return false;
            }
            var3.field5415 = 0;
            var2.method8196(var3.field5413, 0, arg0.field1488);
            arg0.field1490 = 0;
            field668.method7871();
            arg0.field1494 = arg0.field1489;
            arg0.field1489 = arg0.field1493;
            arg0.field1493 = arg0.field1487;
            if (class327.field3540 == arg0.field1487) {
                int var6 = var3.method8979();
                int var7 = var3.method9031();
                int var8 = var3.method9059();
                class90 var9 = (class90) field682.method8688((long) var7);
                if (var9 != null) {
                    method3240(var9, var9.field1095 != var6);
                }
                method3058(var7, var6, var8);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3437 == arg0.field1487) {
                int var10 = var3.method9015();
                int var11 = var3.method9110();
                int var12 = var3.method9024();
                int var13 = var3.method9145();
                class95 var14;
                if (field652 == var13) {
                    var14 = Statics.field4826;
                } else {
                    var14 = Statics.field1793.field1369[var13];
                }
                if (var14 != null) {
                    var14.method2516(var12, var10, var11 >> 16, var11 & 0xFFFF);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3454 == arg0.field1487) {
                String var15 = var3.method9166();
                long var16 = (long) var3.method9119();
                long var18 = (long) var3.method8978();
                class385 var20 = (class385) class405.method6719(class385.method3564(), var3.method8955());
                long var21 = (var16 << 32) + var18;
                boolean var23 = false;
                for (int var24 = 0; var24 < 100; var24++) {
                    if (field747[var24] == var21) {
                        var23 = true;
                        break;
                    }
                }
                if (Statics.field4723.method1889(new class574(var15, Statics.field127))) {
                    var23 = true;
                }
                if (!var23 && field729 == 0) {
                    field747[field645] = var21;
                    field645 = (field645 + 1) % 100;
                    String var25 = class439.method7660(class419.method3366(class366.method8353(var3)));
                    byte var26;
                    if (var20.field4489) {
                        var26 = 7;
                    } else {
                        var26 = 3;
                    }
                    if (var20.field4488 == -1) {
                        class116.method3755(var26, var15, var25);
                    } else {
                        class116.method3755(var26, class107.method3697(var20.field4488) + var15, var25);
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3536 == arg0.field1487) {
                int var27 = var3.method9119();
                if (var27 == 65535) {
                    var27 = -1;
                }
                int var28 = var3.method9015();
                if (var28 == 65535) {
                    var28 = -1;
                }
                int var29 = var3.method9032();
                int var30 = var3.method9110();
                for (int var31 = var27; var31 <= var28; var31++) {
                    long var32 = ((long) var29 << 32) + (long) var31;
                    class508 var34 = field589.method8688(var32);
                    if (var34 != null) {
                        var34.method8362();
                    }
                    field589.method8690(new class507(var30), var32);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3564 == arg0.field1487) {
                Statics.field894 = var3.method8982();
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3490 == arg0.field1487) {
                int var35 = var3.method9031();
                int var36 = var3.method9031();
                class363 var37 = Statics.field2371.method6131(var36);
                var37.field3911.method6184(var35);
                method2361(var37);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3551 == arg0.field1487) {
                int var38 = var3.method9032();
                int var39 = var3.method9030();
                class90 var40 = (class90) field682.method8688((long) var38);
                class90 var41 = (class90) field682.method8688((long) var39);
                if (var41 != null) {
                    method3240(var41, var40 == null || var40.field1095 != var41.field1095);
                }
                if (var40 != null) {
                    var40.method8362();
                    field682.method8690(var40, (long) var39);
                }
                class363 var42 = Statics.field2371.method6131(var38);
                if (var42 != null) {
                    method2361(var42);
                }
                class363 var43 = Statics.field2371.method6131(var39);
                if (var43 != null) {
                    method2361(var43);
                    method265(Statics.field2371.field3764[var43.field3852 >>> 16], var43, true);
                }
                if (field681 != -1) {
                    method3245(field681, 1);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3528 == arg0.field1487) {
                method6907();
                field688 = var3.method8977();
                field721 = field710;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3532 == arg0.field1487) {
                boolean var44 = var3.method8982();
                if (!var44) {
                    Statics.field4543 = null;
                } else if (Statics.field4543 == null) {
                    Statics.field4543 = new class402();
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3493 == arg0.field1487) {
                method818();
                arg0.field1487 = null;
                return false;
            }
            if (class327.field3514 == arg0.field1487) {
                field780 = false;
                field706 = false;
                field774 = false;
                field775 = false;
                Statics.field1990 = 0;
                Statics.field134 = 0;
                Statics.field4134 = 0;
                field776 = false;
                Statics.field30 = 0;
                Statics.field2412 = 0;
                Statics.field118 = 0;
                Statics.field2215 = 0;
                Statics.field1050 = 0;
                Statics.field4 = 0;
                Statics.field22 = 0;
                field777 = null;
                field779 = null;
                field778 = null;
                for (int var45 = 0; var45 < 5; var45++) {
                    field578[var45] = false;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3500 == arg0.field1487) {
                int var46 = var3.method9191();
                int var47 = var3.method9119();
                if (var47 == 65535) {
                    var47 = -1;
                }
                method5196(Statics.field4826, var47, var46);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3535 == arg0.field1487) {
                field764 = var3.method8955();
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3555 == arg0.field1487) {
                method2525(var3.method9166());
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3563 == arg0.field1487) {
                Statics.field942 = var3.method8982();
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3511 == arg0.field1487) {
                int var48 = var3.method8955();
                if (var3.method8955() == 0) {
                    field803[var48] = new class400();
                    var3.field5415 += 18;
                } else {
                    var3.field5415--;
                    field803[var48] = new class400(var3, false);
                }
                field719 = field710;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3456 == arg0.field1487) {
                field744 = var3.method9191();
                field745 = var3.method9024();
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3502 == arg0.field1487) {
                method6907();
                field687 = var3.method9119();
                field721 = field710;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3521 == arg0.field1487) {
                int var49 = var3.method9018();
                int var50 = var3.method9031();
                int var51 = var3.method9019();
                class363 var52 = Statics.field2371.method6131(var50);
                if (var52.field3862 != var51 || var52.field3844 != var49 || var52.field3858 != 0 || var52.field3859 != 0) {
                    var52.field3862 = var51;
                    var52.field3844 = var49;
                    var52.field3858 = 0;
                    var52.field3859 = 0;
                    method2361(var52);
                    this.method1238(var52);
                    if (var52.field3855 == 0) {
                        method265(Statics.field2371.field3764[var50 >> 16], var52, false);
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3482 == arg0.field1487) {
                if (Statics.field3065 == null) {
                    Statics.field3065 = new class490(Statics.field478);
                }
                class560 var53 = Statics.field478.method8282(var3);
                Statics.field3065.field5080.method8702(var53.field5480, var53.field5481);
                field712[++field713 - 1 & 0x1F] = var53.field5480;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3559 == arg0.field1487) {
                int var54 = var3.method8955();
                method165(var54);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3464 == arg0.field1487 && field706) {
                field780 = true;
                field775 = false;
                field774 = false;
                for (int var55 = 0; var55 < 5; var55++) {
                    field578[var55] = false;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3476 == arg0.field1487) {
                method6907();
                int var56 = var3.method9031();
                int var57 = var3.method9191();
                int var58 = var3.method8955();
                field662[var58] = var56;
                field547[var58] = var57;
                field661[var58] = 1;
                field663[var58] = var57;
                for (int var59 = 0; var59 < 98; var59++) {
                    if (var56 >= class373.field4065[var59]) {
                        field661[var58] = var59 + 2;
                    }
                }
                field817[++field711 - 1 & 0x1F] = var58;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3466 == arg0.field1487) {
                for (int var60 = 0; var60 < Statics.field1889; var60++) {
                    class182 var61 = class182.method3054(var60);
                    if (var61 != null) {
                        class351.field3750[var60] = 0;
                        class351.field3752[var60] = 0;
                    }
                }
                method6907();
                field586 += 32;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3554 == arg0.field1487) {
                int var62 = var3.method9145();
                int var63 = var3.method9119();
                int var64 = var3.method9145();
                int var65 = var3.method9145();
                class335.method3369(var62, var64, var65, var63);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3548 == arg0.field1487) {
                int var66 = var3.method9032();
                int var67 = var3.method9119();
                short var68 = (short) var3.method9019();
                int var69 = var3.method9024();
                class106 var70 = Statics.field1793.field1362[var67];
                if (var70 != null) {
                    var70.method2744(var69, var66, var68);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3504 == arg0.field1487) {
                method3372(Statics.field1793, var3);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3438 == arg0.field1487) {
                int var71 = var3.method9110();
                class363 var72 = Statics.field2371.method6131(var71);
                for (int var73 = 0; var73 < var72.field3986.length; var73++) {
                    var72.field3986[var73] = -1;
                    var72.field3986[var73] = 0;
                }
                method2361(var72);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3455 == arg0.field1487) {
                int var74 = var3.method9024() * 4;
                int var75 = var3.method8955() * 4;
                byte var76 = var3.method8993();
                int var77 = var3.method9024();
                int var78 = var3.method9015();
                int var79 = var3.method9023();
                int var80 = var79 >> 16;
                int var81 = var79 >> 8 & 0xFF;
                int var82 = (var79 >> 4 & 0x7) + var80;
                int var83 = (var79 & 0x7) + var81;
                int var84 = var3.method8979();
                int var85 = var3.method9119();
                byte var86 = var3.method8993();
                int var87 = var3.method9092();
                int var88 = var3.method9119();
                int var89 = var76 + var82;
                int var90 = var83 + var86;
                if (0 <= var82 && var82 < 104 && 0 <= var83 && var83 < 104 && 0 <= var89 && var89 < 104 && 0 <= var90 && var90 < 104 && var85 != 65535) {
                    int var91 = class352.method6092(var82);
                    int var92 = class352.method6092(var83);
                    int var93 = class352.method6092(var89);
                    int var94 = class352.method6092(var90);
                    class80 var95 = new class80(var85, Statics.field1793.field1356, var91, var92, method3500(Statics.field1793, var91, var92, Statics.field1793.field1356) - var75, field609 + var78, field609 + var84, var77, var88, var87, var74);
                    var95.method2251(var93, var94, method3500(Statics.field1793, var93, var94, Statics.field1793.field1356) - var74, field609 + var78);
                    Statics.field1793.field1370.method7051(var95);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3475 == arg0.field1487) {
                method5610(class325.field3416);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3553 == arg0.field1487) {
                int var96 = var3.method9031();
                int var97 = var3.method9145();
                class106 var98 = Statics.field1793.field1362[var97];
                int var99 = var3.method9059();
                int var100 = var3.method9119();
                if (var98 != null) {
                    var98.method2516(var99, var100, var96 >> 16, var96 & 0xFFFF);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3446 == arg0.field1487) {
                Statics.field3065 = new class490(Statics.field478);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3486 == arg0.field1487) {
                int var101 = var3.method9119();
                int var102 = var3.method8955();
                int var103 = var3.method9119();
                method2199(var101, var102, var103);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3484 == arg0.field1487) {
                int var104 = var3.method9119();
                if (var104 == 65535) {
                    var104 = -1;
                }
                field681 = var104;
                this.method1237(false);
                method3679(var104);
                class73.method5693(field681);
                for (int var105 = 0; var105 < 100; var105++) {
                    field731[var105] = true;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3487 == arg0.field1487) {
                int var106 = var3.method9145();
                int var107 = var3.method9031();
                class351.field3750[var106] = var107;
                if (class351.field3752[var106] != var107) {
                    class351.field3752[var106] = var107;
                }
                Statics.method3283(var106);
                field653[++field586 - 1 & 0x1F] = var106;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3447 == arg0.field1487) {
                byte var108 = var3.method8975();
                int var109 = var3.method9059() * 4;
                int var110 = var3.method9015();
                int var111 = var3.method9092();
                int var112 = var3.method9024() * 4;
                int var113 = var3.method9191();
                int var114 = var3.method9088();
                int var115 = var114 >> 16;
                int var116 = var114 >> 8 & 0xFF;
                int var117 = (var114 >> 4 & 0x7) + var115;
                int var118 = (var114 & 0x7) + var116;
                byte var119 = var3.method9010();
                int var120 = var3.method8979();
                int var121 = var3.method9145();
                int var122 = var3.method8955();
                int var123 = var117 + var119;
                int var124 = var108 + var118;
                if (var117 >= 0 && var118 >= 0 && var117 < Statics.field1793.field1359 && var118 < Statics.field1793.field1355 && var123 >= 0 && var124 >= 0 && var123 < Statics.field1793.field1359 && var124 < Statics.field1793.field1355 && var110 != 65535) {
                    int var125 = class352.method6092(var117);
                    int var126 = class352.method6092(var118);
                    int var127 = class352.method6092(var123);
                    int var128 = class352.method6092(var124);
                    class80 var129 = new class80(var110, Statics.field1793.field1356, var125, var126, method3500(Statics.field1793, var125, var126, Statics.field1793.field1356) - var109, field609 + var121, field609 + var120, var122, var113, var111, var112);
                    var129.method2251(var127, var128, method3500(Statics.field1793, var127, var128, Statics.field1793.field1356) - var112, field609 + var121);
                    Statics.field1793.field1370.method7051(var129);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3571 == arg0.field1487) {
                Statics.field1831 = var3.method8955();
                field597 = var3.method9024();
                Statics.field3103 = var3.method9024();
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3509 == arg0.field1487) {
                method3419(Statics.field1793, var3, false);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3568 == arg0.field1487) {
                method3419(Statics.field1793, var3, true);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3537 == arg0.field1487) {
                field540 = var3.method8955();
                if (field540 == 1) {
                    field606 = var3.method9119();
                }
                if (field540 >= 2 && field540 <= 6) {
                    if (field540 == 2) {
                        field546 = 64;
                        field754 = 64;
                    }
                    if (field540 == 3) {
                        field546 = 0;
                        field754 = 64;
                    }
                    if (field540 == 4) {
                        field546 = 128;
                        field754 = 64;
                    }
                    if (field540 == 5) {
                        field546 = 64;
                        field754 = 0;
                    }
                    if (field540 == 6) {
                        field546 = 64;
                        field754 = 128;
                    }
                    field540 = 2;
                    field543 = var3.method9119();
                    field544 = var3.method9119();
                    field545 = var3.method8955();
                }
                if (field540 == 10) {
                    field542 = var3.method9119();
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3467 == arg0.field1487) {
                int var130 = var3.method9059();
                int var131 = var3.method9032();
                class363 var132 = Statics.field2371.method6131(var131);
                var132.field3911.method6181(Statics.field4826.field1170.field3796, var130);
                method2361(var132);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3474 == arg0.field1487) {
                int var133 = var3.method9145();
                int var134 = var3.method9119();
                class335.method5635(var134, var133);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3436 == arg0.field1487) {
                field718.method2850(var3, arg0.field1488);
                method6924();
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3550 == arg0.field1487) {
                int var135 = var3.method9119();
                int var136 = var3.method9030();
                int var137 = var135 >> 10 & 0x1F;
                int var138 = var135 >> 5 & 0x1F;
                int var139 = var135 & 0x1F;
                int var140 = (var139 << 3) + (var137 << 19) + (var138 << 11);
                class363 var141 = Statics.field2371.method6131(var136);
                if (var141.field3997 != var140) {
                    var141.field3997 = var140;
                    method2361(var141);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3520 == arg0.field1487) {
                int var142 = var3.method8955();
                int var143 = var3.method9119();
                int var144 = var3.method8955();
                Statics.field89 = var144;
                if (var142 == 0) {
                    Statics.field1342.field1356 = var144;
                    Statics.field1793 = Statics.field1342;
                } else if (var142 == 1) {
                    class480 var145 = Statics.field1342.field1365[var143];
                    var145.field5008.field1356 = var144;
                    Statics.field1793 = var145.field5008;
                } else {
                    throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3523 == arg0.field1487) {
                int var146 = var3.method9030();
                boolean var147 = var3.method9191() == 1;
                class363 var148 = Statics.field2371.method6131(var146);
                var148.method6564(Statics.field4826.field1170, var147);
                method2361(var148);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3516 == arg0.field1487) {
                Statics.field1758 = class571.method2301(var3.method8955());
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3477 == arg0.field1487) {
                method5610(class325.field3423);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3560 == arg0.field1487) {
                Statics.field1361 = var3.method8955();
                Statics.field819 = var3.method8955();
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3449 == arg0.field1487) {
                field758 = var3.method8955();
                if (field758 == 255) {
                    field758 = 0;
                }
                field690 = var3.method8955();
                if (field690 == 255) {
                    field690 = 0;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3499 == arg0.field1487) {
                int var149 = var3.method8977();
                int var150 = var3.method9032();
                class363 var151 = Statics.field2371.method6131(var150);
                if (var151.field3901 != var149 || var149 == -1) {
                    var151.field3901 = var149;
                    var151.field3873 = 0;
                    var151.field3912 = 0;
                    method2361(var151);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3515 == arg0.field1487) {
                byte var152 = var3.method8975();
                long var153 = (long) var3.method9119();
                long var155 = (long) var3.method8978();
                long var157 = (var153 << 32) + var155;
                boolean var159 = false;
                class171 var160 = var152 >= 0 ? field704[var152] : Statics.field1813;
                if (var160 == null) {
                    var159 = true;
                } else {
                    for (int var161 = 0; var161 < 100; var161++) {
                        if (field747[var161] == var157) {
                            var159 = true;
                            break;
                        }
                    }
                }
                if (!var159) {
                    field747[field645] = var157;
                    field645 = (field645 + 1) % 100;
                    String var162 = class366.method8353(var3);
                    int var163 = var152 >= 0 ? 43 : 46;
                    class116.method5096(var163, "", var162, var160.field1841);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3527 == arg0.field1487) {
                field706 = true;
                field780 = false;
                field775 = true;
                int var164 = method5558(var3.method8977() & 0x7EB);
                int var165 = method440(var3.method8977() & 0x7EB);
                int var166 = var3.method9119();
                int var167 = var3.method8955();
                field779 = new class514(Statics.field4936, var165, var166, var167);
                field778 = new class514(Statics.field2962, var164, var166, var167);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3556 == arg0.field1487) {
                class70 var168 = new class70();
                var168.field831 = var3.method9166();
                var168.field828 = var3.method9119();
                int var169 = var3.method9110();
                var168.field829 = var169;
                if (var168.method1836()) {
                    var168.field835 = "beta";
                    Statics.field5084 = true;
                } else {
                    Statics.field5084 = false;
                }
                method7976(45);
                var2.method8198();
                Object var170 = null;
                class79.method7466(var168);
                arg0.field1487 = null;
                return false;
            }
            if (class327.field3460 == arg0.field1487) {
                int var171 = var3.method8989();
                boolean var172 = var3.method8955() == 1;
                String var173 = "";
                boolean var174 = false;
                if (var172) {
                    var173 = var3.method9166();
                    if (Statics.field4723.method1889(new class574(var173, Statics.field127))) {
                        var174 = true;
                    }
                }
                String var175 = var3.method9166();
                if (!var174) {
                    class116.method3755(var171, var173, var175);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3526 == arg0.field1487) {
                field616 = field710;
                byte var176 = var3.method8975();
                if (arg0.field1488 == 1) {
                    if (var176 >= 0) {
                        field704[var176] = null;
                    } else {
                        Statics.field1813 = null;
                    }
                    arg0.field1487 = null;
                    return true;
                }
                if (var176 >= 0) {
                    field704[var176] = new class171(var3);
                } else {
                    Statics.field1813 = new class171(var3);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3461 == arg0.field1487) {
                int var177 = var3.method9110();
                class90 var178 = (class90) field682.method8688((long) var177);
                if (var178 != null) {
                    method3240(var178, true);
                }
                if (field686 != null) {
                    method2361(field686);
                    field686 = null;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3485 == arg0.field1487) {
                int var179 = var3.method8955();
                int var180 = var3.method8955();
                int var181 = var3.method8955();
                int var182 = var3.method8955();
                field578[var179] = true;
                field782[var179] = var180;
                field783[var179] = var181;
                field590[var179] = var182;
                field519[var179] = 0;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3495 == arg0.field1487) {
                Statics.field4723.method1885(var3, arg0.field1488);
                field715 = field710;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3492 == arg0.field1487) {
                boolean var183 = var3.method8955() == 1;
                if (var183) {
                    Statics.field5 = class331.method3482() - var3.method8980();
                    Statics.field421 = new class393(var3, true);
                } else {
                    Statics.field421 = null;
                }
                field648 = field710;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3498 == arg0.field1487) {
                boolean var184 = var3.method9059() == 1;
                int var185 = var3.method9031();
                class363 var186 = Statics.field2371.method6131(var185);
                if (var186.field3927 != var184) {
                    var186.field3927 = var184;
                    method2361(var186);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3567 == arg0.field1487) {
                int var187 = var3.method9145();
                int var188 = var3.method9015();
                int var189 = var3.method9119();
                int var190 = var3.method9031();
                class363 var191 = Statics.field2371.method6131(var190);
                if (var191.field3916 != var189 || var191.field3915 != var187 || var191.field3908 != var188) {
                    var191.field3916 = var189;
                    var191.field3915 = var187;
                    var191.field3908 = var188;
                    method2361(var191);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3533 == arg0.field1487) {
                String var192 = var3.method9166();
                int var193 = var3.method9110();
                class363 var194 = Statics.field2371.method6131(var193);
                if (!var192.equals(var194.field3947)) {
                    var194.field3947 = var192;
                    method2361(var194);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3453 == arg0.field1487) {
                byte var195 = var3.method8975();
                String var196 = var3.method9166();
                long var197 = (long) var3.method9119();
                long var199 = (long) var3.method8978();
                class385 var201 = (class385) class405.method6719(class385.method3564(), var3.method8955());
                long var202 = (var197 << 32) + var199;
                boolean var204 = false;
                Object var205 = null;
                class171 var206 = var195 >= 0 ? field704[var195] : Statics.field1813;
                if (var206 == null) {
                    var204 = true;
                } else {
                    int var207 = 0;
                    while (true) {
                        if (var207 >= 100) {
                            if (var201.field4472 && Statics.field4723.method1889(new class574(var196, Statics.field127))) {
                                var204 = true;
                            }
                            break;
                        }
                        if (field747[var207] == var202) {
                            var204 = true;
                            break;
                        }
                        var207++;
                    }
                }
                if (!var204) {
                    field747[field645] = var202;
                    field645 = (field645 + 1) % 100;
                    String var208 = class439.method7660(class366.method8353(var3));
                    int var209 = var195 >= 0 ? 41 : 44;
                    if (var201.field4488 == -1) {
                        class116.method5096(var209, var196, var208, var206.field1841);
                    } else {
                        class116.method5096(var209, class107.method3697(var201.field4488) + var196, var208, var206.field1841);
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3524 == arg0.field1487) {
                int var210 = var3.method9110();
                int var211 = var3.method9015();
                class363 var212 = Statics.field2371.method6131(var210);
                if (var212.field3897 != 1 || var212.field3898 != var211) {
                    var212.field3897 = 1;
                    var212.field3898 = var211;
                    method2361(var212);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3445 == arg0.field1487) {
                int var213 = var3.method9110();
                if (field551 != var213) {
                    field551 = var213;
                    method2551();
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3557 == arg0.field1487) {
                method5610(class325.field3417);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3565 == arg0.field1487) {
                int var214 = var3.method9145();
                int var215 = var3.method8978();
                int var216 = var215 >> 16;
                int var217 = var215 >> 8 & 0xFF;
                int var218 = (var215 >> 4 & 0x7) + var216;
                int var219 = (var215 & 0x7) + var217;
                int var220 = var3.method9024();
                int var221 = var220 >> 2;
                int var222 = var220 & 0x3;
                int var223 = field596[var221];
                if (0 <= var218 && var218 < 103 && 0 <= var219 && var219 < 103) {
                    method7010(var218, var219, var221, var222, var223, var214);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3439 == arg0.field1487) {
                Statics.field3103 = var3.method8955();
                Statics.field1831 = var3.method9191();
                field597 = var3.method9024();
                while (var3.field5415 < arg0.field1488) {
                    int var224 = var3.method8955();
                    class325 var225 = class325.method4104()[var224];
                    method5610(var225);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3472 == arg0.field1487) {
                int var226 = var3.method9031();
                class363 var227 = Statics.field2371.method6131(var226);
                var227.field3897 = 3;
                var227.field3898 = Statics.field4826.field1170.method6179();
                method2361(var227);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3512 == arg0.field1487) {
                field706 = true;
                field780 = false;
                field774 = false;
                Statics.field1050 = var3.method8955();
                Statics.field4 = var3.method8955();
                Statics.field22 = var3.method9119();
                Statics.field2215 = var3.method8955();
                Statics.field118 = var3.method8955();
                if (Statics.field118 >= 100) {
                    Statics.field3239 = class352.method6092(Statics.field1050);
                    Statics.field161 = class352.method6092(Statics.field4);
                    Statics.field1076 = method3500(Statics.field1342, Statics.field3239, Statics.field161, Statics.field1342.field1356) - Statics.field22;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3546 == arg0.field1487) {
                int var228 = var3.method9110();
                int var229 = var3.method9110();
                int var230 = class35.method8354();
                class326 var231 = class326.method3199(class324.field3383, field582.field1486);
                var231.field3426.method9073(field172);
                var231.field3426.method9013(var228);
                var231.field3426.method8960(var229);
                var231.field3426.method9073(var230);
                field582.method2943(var231);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3450 == arg0.field1487) {
                int var232 = var3.method9145();
                int var233 = var3.method8979();
                int var234 = var3.method9015();
                int var235 = var3.method8979();
                int var236 = var3.method9145();
                if (var235 == 65535) {
                    var235 = -1;
                }
                ArrayList var237 = new ArrayList();
                var237.add(var235);
                method2388(var237, var232, var233, var234, var236);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3470 == arg0.field1487) {
                int var238 = arg0.field1488 + var3.field5415;
                int var239 = var3.method9119();
                if (var239 == 65535) {
                    var239 = -1;
                }
                int var240 = var3.method9119();
                if (field681 != var239) {
                    field681 = var239;
                    this.method1237(false);
                    method3679(field681);
                    class73.method5693(field681);
                    for (int var241 = 0; var241 < 100; var241++) {
                        field731[var241] = true;
                    }
                }
                while (var240-- > 0) {
                    int var242 = var3.method9110();
                    int var243 = var3.method9119();
                    int var244 = var3.method8955();
                    class90 var245 = (class90) field682.method8688((long) var242);
                    if (var245 != null && var245.field1095 != var243) {
                        method3240(var245, true);
                        var245 = null;
                    }
                    if (var245 == null) {
                        var245 = method3058(var242, var243, var244);
                    }
                    var245.field1096 = true;
                }
                for (class90 var246 = (class90) field682.method8691(); var246 != null; var246 = (class90) field682.method8692()) {
                    if (var246.field1096) {
                        var246.field1096 = false;
                    } else {
                        method3240(var246, true);
                    }
                }
                field589 = new class524(512);
                while (var3.field5415 < var238) {
                    int var247 = var3.method9110();
                    int var248 = var3.method9119();
                    int var249 = var3.method9119();
                    int var250 = var3.method9110();
                    for (int var251 = var248; var251 <= var249; var251++) {
                        long var252 = ((long) var247 << 32) + (long) var251;
                        field589.method8690(new class507(var250), var252);
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3542 == arg0.field1487) {
                method5610(class325.field3419);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3566 == arg0.field1487) {
                return this.method1498(arg0, 1);
            }
            if (class327.field3457 == arg0.field1487) {
                field706 = true;
                field780 = false;
                field774 = true;
                Statics.field1050 = var3.method8955();
                Statics.field4 = var3.method8955();
                int var254 = var3.method9119();
                int var255 = class352.method6092(var3.method8955());
                int var256 = class352.method6092(var3.method8955());
                int var257 = var3.method9119();
                field776 = var3.method8982();
                int var258 = var3.method8955();
                int var259 = class352.method6092(Statics.field1050);
                int var260 = class352.method6092(Statics.field4);
                boolean var261 = false;
                boolean var262 = false;
                int var263;
                int var264;
                if (field776) {
                    var263 = Statics.field1076;
                    var264 = method3500(Statics.field1342, var259, var260, Statics.field1342.field1356) - var254;
                } else {
                    var263 = method3500(Statics.field1342, Statics.field3239, Statics.field161, Statics.field1342.field1356) - Statics.field1076;
                    var264 = var254;
                }
                field777 = new class512(Statics.field3239, Statics.field161, var263, var259, var260, var264, var255, var256, var257, var258);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3491 == arg0.field1487) {
                field706 = true;
                field780 = false;
                field774 = true;
                Statics.field1050 = var3.method8955();
                Statics.field4 = var3.method8955();
                int var265 = var3.method9119();
                int var266 = var3.method9119();
                field776 = var3.method8982();
                int var267 = var3.method8955();
                int var268 = class352.method6092(Statics.field1050);
                int var269 = class352.method6092(Statics.field4);
                boolean var270 = false;
                boolean var271 = false;
                int var272;
                int var273;
                if (field776) {
                    var272 = Statics.field1076;
                    var273 = method3500(Statics.field1342, var268, var269, Statics.field1342.field1356) - var265;
                } else {
                    var272 = method3500(Statics.field1342, Statics.field3239, Statics.field161, Statics.field1342.field1356) - Statics.field1076;
                    var273 = var265;
                }
                field777 = new class513(Statics.field3239, Statics.field161, var272, var268, var269, var273, var266, var267);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3434 == arg0.field1487) {
                Statics.field3065 = null;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3469 == arg0.field1487) {
                field706 = true;
                field780 = false;
                field775 = true;
                Statics.field1990 = var3.method8955();
                Statics.field134 = var3.method8955();
                Statics.field4134 = var3.method9119();
                int var274 = var3.method9119();
                int var275 = var3.method8955();
                int var276 = class352.method6092(Statics.field1990);
                int var277 = class352.method6092(Statics.field134);
                int var278 = method3500(Statics.field1342, var276, var277, Statics.field1342.field1356) - Statics.field4134;
                int var279 = var276 - Statics.field3239;
                int var280 = var278 - Statics.field1076;
                int var281 = var277 - Statics.field161;
                double var282 = Math.sqrt((double) (var279 * var279 + var281 * var281));
                int var284 = method440((int) (Math.atan2((double) var280, var282) * 325.9490051269531D) & 0x7FF);
                int var285 = method5558((int) (Math.atan2((double) var279, (double) var281) * -325.9490051269531D) & 0x7FF);
                field779 = new class514(Statics.field4936, var284, var274, var275);
                field778 = new class514(Statics.field2962, var285, var274, var275);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3488 == arg0.field1487) {
                for (int var286 = 0; var286 < Statics.field1793.field1369.length; var286++) {
                    if (Statics.field1793.field1369[var286] != null) {
                        Statics.field1793.field1369[var286].field1269 = -1;
                    }
                }
                for (int var287 = 0; var287 < Statics.field1793.field1362.length; var287++) {
                    if (Statics.field1793.field1362[var287] != null) {
                        Statics.field1793.field1362[var287].field1269 = -1;
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3463 == arg0.field1487) {
                int var288 = var3.method9024();
                int var289 = var3.method9024();
                int var290 = var3.method9030();
                class363 var291 = Statics.field2371.method6131(var290);
                var291.field3911.method6183(var288, var289);
                method2361(var291);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3519 == arg0.field1487) {
                method3562(Statics.field1793, false, var3);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3547 == arg0.field1487) {
                Statics.field4723.field846.method7988(var3, arg0.field1488);
                method7197();
                field715 = field710;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3479 == arg0.field1487) {
                field533++;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3561 == arg0.field1487) {
                var3.field5415 += 28;
                if (var3.method9002()) {
                    method4234(var3, var3.field5415 - 28);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3480 == arg0.field1487) {
                method5610(class325.field3415);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3539 == arg0.field1487) {
                Statics.field2391 = var3.method8982();
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3552 == arg0.field1487) {
                return this.method1498(arg0, 2);
            }
            if (class327.field3448 == arg0.field1487) {
                int var292 = var3.method9145();
                int var293 = var3.method9110();
                int var294 = var3.method9015();
                class363 var295 = Statics.field2371.method6131(var293);
                var295.field3910 = (var294 << 16) + var292;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3442 == arg0.field1487) {
                method6907();
                int var296 = var3.method9032();
                int var297 = var3.method9059();
                int var298 = var3.method9191();
                int var299 = var3.method9024();
                field662[var297] = var296;
                field547[var297] = var299;
                field661[var297] = 1;
                field663[var297] = var298;
                for (int var300 = 0; var300 < 98; var300++) {
                    if (var296 >= class373.field4065[var300]) {
                        field661[var297] = var300 + 2;
                    }
                }
                field817[++field711 - 1 & 0x1F] = var297;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3440 == arg0.field1487) {
                int var301 = var3.method9031();
                int var302 = var3.method9145();
                class363 var303 = Statics.field2371.method6131(var301);
                if (var303.field3897 != 6 || var303.field3898 != var302) {
                    var303.field3897 = 6;
                    var303.field3898 = var302;
                    method2361(var303);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3570 == arg0.field1487) {
                field598 = var3.method9166();
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3503 == arg0.field1487) {
                class37.method7272(var3, arg0.field1488);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3489 == arg0.field1487) {
                field539 = var3.method9145() * 30;
                field721 = field710;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3531 == arg0.field1487) {
                int var304 = var3.method9015();
                int var305 = var3.method9030();
                class363 var306 = Statics.field2371.method6131(var305);
                if (var306.field3897 != 2 || var306.field3898 != var304) {
                    var306.field3897 = 2;
                    var306.field3898 = var304;
                    method2361(var306);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3494 == arg0.field1487) {
                int var307 = var3.method8955();
                int var308 = var3.method9119();
                int var309 = class549.field5408 >= 223 ? var3.method8977() : -1;
                if (var307 == 0) {
                    Statics.field1791 = Statics.field1342.field1369[var308];
                    field650 = -1;
                } else if (var307 == 1) {
                    field650 = -1;
                    Statics.field1791 = Statics.field1342.field1362[var308];
                } else if (var307 == 2) {
                    field650 = var309;
                    Statics.field1791 = Statics.field1342.field1365[var308];
                    this.method490(true);
                }
                if (Statics.field1791 == null) {
                    field650 = -1;
                    Statics.field1791 = Statics.field4826;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3569 == arg0.field1487) {
                int var310 = var3.method9024();
                byte var311 = var3.method8993();
                byte var312 = var3.method8975();
                int var313 = var3.method9026();
                int var314 = var3.method9119();
                int var315 = var3.method9015();
                int var316 = var3.method9024() * 4;
                int var317 = var3.method9092();
                int var318 = var3.method9015();
                int var319 = var3.method8955() * 4;
                int var320 = var3.method8978();
                int var321 = var320 >> 16;
                int var322 = var320 >> 8 & 0xFF;
                int var323 = (var320 >> 4 & 0x7) + var321;
                int var324 = (var320 & 0x7) + var322;
                int var325 = var3.method8979();
                int var326 = var312 + var323;
                int var327 = var311 + var324;
                if (0 <= var323 && var323 < 104 && 0 <= var324 && var324 < 104 && 0 <= var326 && var326 < 104 && 0 <= var327 && var327 < 104 && var318 != 65535) {
                    int var328 = class352.method6092(var323);
                    int var329 = class352.method6092(var324);
                    int var330 = class352.method6092(var326);
                    int var331 = class352.method6092(var327);
                    class80 var332 = new class80(var318, Statics.field1793.field1356, var328, var329, method3500(Statics.field1793, var328, var329, Statics.field1793.field1356) - var319, field609 + var325, field609 + var315, var310, var314, var313, var317, var316);
                    var332.method2251(var330, var331, method3500(Statics.field1793, var330, var331, Statics.field1793.field1356) - var316, field609 + var325);
                    Statics.field1793.field1370.method7051(var332);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3525 == arg0.field1487) {
                byte[] var333 = new byte[arg0.field1488];
                var3.method8921(var333, 0, var333.length);
                class551 var334 = new class551(var333);
                String var335 = var334.method9166();
                class32.method3941(var335, true, false);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3530 == arg0.field1487) {
                int var336 = var3.method9119();
                if (var336 == 65535) {
                    var336 = -1;
                }
                method2302(var336);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3517 == arg0.field1487) {
                int var337 = var3.method9119();
                if (var337 == 65535) {
                    var337 = -1;
                }
                int var338 = var3.method9218();
                method2257(var337, var338);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3508 == arg0.field1487) {
                int var339 = var3.method9145();
                class88.method1115(var339);
                field708[++field762 - 1 & 0x1F] = var339 & 0x7FFF;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3534 == arg0.field1487) {
                Statics.method1177(false, arg0.field1492);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3505 == arg0.field1487) {
                int var340 = var3.method9110();
                int var341 = var3.method9119();
                if (var340 < -70000) {
                    var341 += 32768;
                }
                class363 var342;
                if (var340 >= 0) {
                    var342 = Statics.field2371.method6131(var340);
                } else {
                    var342 = null;
                }
                while (var3.field5415 < arg0.field1488) {
                    int var343 = var3.method8989();
                    int var344 = var3.method9119();
                    int var345 = 0;
                    if (var344 != 0) {
                        var345 = var3.method8955();
                        if (var345 == 255) {
                            var345 = var3.method9110();
                        }
                    }
                    if (var342 != null && var343 >= 0 && var343 < var342.field3986.length) {
                        var342.field3986[var343] = var344;
                        var342.field3987[var343] = var345;
                    }
                    class88.method1126(var341, var343, var344 - 1, var345);
                }
                if (var342 != null) {
                    method2361(var342);
                }
                method6907();
                field708[++field762 - 1 & 0x1F] = var341 & 0x7FFF;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3522 == arg0.field1487) {
                String var346 = var3.method9166();
                Object[] var347 = new Object[var346.length() + 1];
                for (int var348 = var346.length() - 1; var348 >= 0; var348--) {
                    if (var346.charAt(var348) == 's') {
                        var347[var348 + 1] = var3.method9166();
                    } else {
                        var347[var348 + 1] = Integer.valueOf(var3.method9110());
                    }
                }
                var347[0] = Integer.valueOf(var3.method9110());
                class91 var349 = new class91();
                var349.field1111 = var347;
                Statics.method4025(var349);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3549 == arg0.field1487) {
                Statics.method1085();
                byte var350 = var3.method8975();
                class154 var351 = new class154(var3);
                class162 var352;
                if (var350 >= 0) {
                    var352 = field755[var350];
                } else {
                    var352 = Statics.field3189;
                }
                if (var352 == null) {
                    this.method1242(var350);
                    arg0.field1487 = null;
                    return true;
                }
                if (var351.field1716 > var352.field1766) {
                    this.method1242(var350);
                    arg0.field1487 = null;
                    return true;
                }
                if (var351.field1716 < var352.field1766) {
                    arg0.field1487 = null;
                    return true;
                }
                var351.method3278(var352);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3543 == arg0.field1487) {
                method3562(Statics.field1793, true, var3);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3443 == arg0.field1487) {
                return this.method1232(arg0);
            }
            if (class327.field3562 == arg0.field1487) {
                Statics.field1793.field1367 = 0;
                Statics.field1793.field1366 = 0;
                for (int var353 = 0; var353 < 65536; var353++) {
                    Statics.field1793.field1362[var353] = null;
                }
                for (int var354 = 0; var354 < 2048; var354++) {
                    Statics.field1793.field1365[var354] = null;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3465 == arg0.field1487) {
                int var355 = var3.method9088();
                int var356 = var355 >> 16;
                int var357 = var355 >> 8 & 0xFF;
                int var358 = (var355 >> 4 & 0x7) + var356;
                int var359 = (var355 & 0x7) + var357;
                int var360 = var3.method8979();
                int var361 = var3.method9191();
                int var362 = var3.method9015();
                if (var358 >= 0 && var359 >= 0 && var358 < Statics.field1793.field1359 && var359 < Statics.field1793.field1355) {
                    int var363 = class352.method6092(var358);
                    int var364 = class352.method6092(var359);
                    class75 var365 = new class75(var360, Statics.field1793.field1356, var363, var364, method3500(Statics.field1793, var363, var364, Statics.field1793.field1356) - var361, var362, field609);
                    Statics.field1793.field1363.method7051(var365);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3483 == arg0.field1487) {
                String var366 = var3.method9166();
                String var367 = class439.method7660(class419.method3366(class366.method8353(var3)));
                class116.method3755(6, var366, var367);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3468 == arg0.field1487) {
                Statics.method1085();
                byte var368 = var3.method8975();
                if (arg0.field1488 == 1) {
                    if (var368 >= 0) {
                        field755[var368] = null;
                    } else {
                        Statics.field3189 = null;
                    }
                    arg0.field1487 = null;
                    return true;
                }
                if (var368 >= 0) {
                    field755[var368] = new class162(var3);
                } else {
                    Statics.field3189 = new class162(var3);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3473 == arg0.field1487) {
                method5610(class325.field3418);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3435 == arg0.field1487) {
                int var369 = var3.method9191();
                int var370 = var3.method8955();
                String var371 = var3.method9166();
                if (var369 >= 1 && var369 <= 8) {
                    if (var371.equalsIgnoreCase(class382.field4298)) {
                        var371 = null;
                    }
                    field656[var369 - 1] = var371;
                    field657[var369 - 1] = var370 == 0;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3497 == arg0.field1487) {
                Statics.field4723.method1937();
                field715 = field710;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3529 == arg0.field1487) {
                Statics.method1177(true, arg0.field1492);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3545 == arg0.field1487) {
                int var372 = var3.method8979();
                int var373 = var3.method9015();
                int var374 = var3.method8955();
                if (var372 == 65535) {
                    var372 = -1;
                }
                class106 var375 = Statics.field1793.field1362[var373];
                if (var375 != null) {
                    if (var375.field1269 == var372 && var372 != -1) {
                        int var376 = class213.method2555(var372).field2329;
                        if (var376 == 1) {
                            var375.field1270 = 0;
                            var375.field1271 = 0;
                            var375.field1282 = var374;
                            var375.field1273 = 0;
                        } else if (var376 == 2) {
                            var375.field1273 = 0;
                        }
                    } else if (var372 == -1 || var375.field1269 == -1 || class213.method2555(var372).field2322 >= class213.method2555(var375.field1269).field2322) {
                        var375.field1269 = var372;
                        var375.field1270 = 0;
                        var375.field1271 = 0;
                        var375.field1282 = var374;
                        var375.field1273 = 0;
                        var375.field1299 = var375.field1294;
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3541 == arg0.field1487) {
                Statics.field1831 = var3.method9024();
                field597 = var3.method9059();
                Statics.field3103 = var3.method9059();
                for (int var377 = Statics.field1831; var377 < Statics.field1831 + 8; var377++) {
                    for (int var378 = Statics.field3103; var378 < Statics.field3103 + 8; var378++) {
                        if (Statics.field1793.field1368[field597][var377][var378] != null) {
                            Statics.field1793.field1368[field597][var377][var378] = null;
                            method8835(field597, var377, var378);
                        }
                    }
                }
                for (class99 var379 = (class99) Statics.field1793.field1353.method7029(); var379 != null; var379 = (class99) Statics.field1793.field1353.method7031()) {
                    if (var379.field1208 >= Statics.field1831 && var379.field1208 < Statics.field1831 + 8 && var379.field1223 >= Statics.field3103 && var379.field1223 < Statics.field3103 + 8 && field597 == var379.field1209) {
                        var379.field1220 = 0;
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3458 == arg0.field1487) {
                field706 = true;
                field780 = false;
                field775 = true;
                int var380 = var3.method8977();
                int var381 = var3.method8977();
                int var382 = method440(Statics.field4936 + var381 & 0x7EB);
                int var383 = Statics.field2962 + var380;
                int var384 = var3.method9119();
                int var385 = var3.method8955();
                field779 = new class514(Statics.field4936, var382, var384, var385);
                field778 = new class514(Statics.field2962, var383, var384, var385);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3441 == arg0.field1487) {
                method5610(class325.field3420);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3481 == arg0.field1487) {
                int var386 = var3.method8955();
                method1038(var386);
                arg0.field1487 = null;
                return false;
            }
            if (class327.field3444 == arg0.field1487) {
                for (int var387 = 0; var387 < class351.field3752.length; var387++) {
                    if (class351.field3752[var387] != class351.field3750[var387]) {
                        class351.field3752[var387] = class351.field3750[var387];
                        Statics.method3283(var387);
                        field653[++field586 - 1 & 0x1F] = var387;
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3496 == arg0.field1487) {
                field706 = true;
                field780 = false;
                field775 = false;
                Statics.field1990 = var3.method8955();
                Statics.field134 = var3.method8955();
                Statics.field4134 = var3.method9119();
                Statics.field30 = var3.method8955();
                Statics.field2412 = var3.method8955();
                if (Statics.field2412 >= 100) {
                    int var388 = class352.method6092(Statics.field1990);
                    int var389 = class352.method6092(Statics.field134);
                    int var390 = method3500(Statics.field1342, var388, var389, Statics.field1342.field1356) - Statics.field4134;
                    int var391 = var388 - Statics.field3239;
                    int var392 = var390 - Statics.field1076;
                    int var393 = var389 - Statics.field161;
                    int var394 = (int) Math.sqrt((double) (var391 * var391 + var393 * var393));
                    Statics.field4936 = (int) (Math.atan2((double) var392, (double) var394) * 325.9490051269531D) & 0x7FF;
                    Statics.field2962 = (int) (Math.atan2((double) var391, (double) var393) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field4936 < 128) {
                        Statics.field4936 = 128;
                    }
                    if (Statics.field4936 > 383) {
                        Statics.field4936 = 383;
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3507 == arg0.field1487) {
                if (field681 != -1) {
                    method3245(field681, 0);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3452 == arg0.field1487) {
                method5610(class325.field3413);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3478 == arg0.field1487) {
                int var395 = var3.method9030();
                int var396 = var3.method9145();
                class363 var397 = Statics.field2371.method6131(var395);
                if (var397 != null && var397.field3855 == 0) {
                    if (var396 > var397.field3877 - var397.field3869) {
                        var396 = var397.field3877 - var397.field3869;
                    }
                    if (var396 < 0) {
                        var396 = 0;
                    }
                    if (var397.field3875 != var396) {
                        var397.field3875 = var396;
                        method2361(var397);
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3506 == arg0.field1487) {
                method5610(class325.field3411);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3558 == arg0.field1487) {
                int var398 = var3.method9110();
                int var399 = var3.method9119();
                if (var398 < -70000) {
                    var399 += 32768;
                }
                class363 var400;
                if (var398 >= 0) {
                    var400 = Statics.field2371.method6131(var398);
                } else {
                    var400 = null;
                }
                if (var400 != null) {
                    for (int var401 = 0; var401 < var400.field3986.length; var401++) {
                        var400.field3986[var401] = 0;
                        var400.field3987[var401] = 0;
                    }
                }
                class88.method6683(var399);
                int var402 = var3.method9119();
                for (int var403 = 0; var403 < var402; var403++) {
                    int var404 = var3.method9191();
                    if (var404 == 255) {
                        var404 = var3.method9031();
                    }
                    int var405 = var3.method8979();
                    if (var400 != null && var403 < var400.field3986.length) {
                        var400.field3986[var403] = var405;
                        var400.field3987[var403] = var404;
                    }
                    class88.method1126(var399, var403, var405 - 1, var404);
                }
                if (var400 != null) {
                    method2361(var400);
                }
                method6907();
                field708[++field762 - 1 & 0x1F] = var399 & 0x7FFF;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3518 == arg0.field1487) {
                String var406 = var3.method9166();
                long var407 = var3.method8980();
                long var409 = (long) var3.method9119();
                long var411 = (long) var3.method8978();
                class385 var413 = (class385) class405.method6719(class385.method3564(), var3.method8955());
                long var414 = (var409 << 32) + var411;
                boolean var416 = false;
                for (int var417 = 0; var417 < 100; var417++) {
                    if (field747[var417] == var414) {
                        var416 = true;
                        break;
                    }
                }
                if (var413.field4472 && Statics.field4723.method1889(new class574(var406, Statics.field127))) {
                    var416 = true;
                }
                if (!var416 && field729 == 0) {
                    field747[field645] = var414;
                    field645 = (field645 + 1) % 100;
                    String var418 = class439.method7660(class419.method3366(class366.method8353(var3)));
                    if (var413.field4488 == -1) {
                        class116.method5096(9, var406, var418, class421.method5758(var407));
                    } else {
                        class116.method5096(9, class107.method3697(var413.field4488) + var406, var418, class421.method5758(var407));
                    }
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3462 == arg0.field1487) {
                int var419 = var3.method9015();
                if (var419 == 65535) {
                    var419 = -1;
                }
                int var420 = var3.method9031();
                int var421 = var3.method9030();
                class363 var422 = Statics.field2371.method6131(var421);
                if (var422.field3851) {
                    var422.field3960 = var419;
                    var422.field3989 = var420;
                    class211 var424 = class211.method2414(var419).method3853(var420);
                    var422.field3916 = var424.field2242;
                    var422.field3915 = var424.field2243;
                    var422.field3907 = var424.field2244;
                    var422.field3903 = var424.field2245;
                    var422.field3992 = var424.field2250;
                    var422.field3908 = var424.field2241;
                    if (var424.field2247 == 1) {
                        var422.field3914 = 1;
                    } else {
                        var422.field3914 = 2;
                    }
                    if (var422.field3909 > 0) {
                        var422.field3908 = var422.field3908 * 32 / var422.field3909;
                    } else if (var422.field3850 > 0) {
                        var422.field3908 = var422.field3908 * 32 / var422.field3850;
                    }
                    method2361(var422);
                } else if (var419 == -1) {
                    var422.field3897 = 0;
                    arg0.field1487 = null;
                    return true;
                } else {
                    class211 var423 = class211.method2414(var419).method3853(var420);
                    var422.field3897 = 4;
                    var422.field3898 = var419;
                    var422.field3916 = var423.field2242;
                    var422.field3915 = var423.field2243;
                    var422.field3908 = var423.field2241 * 100 / var420;
                    method2361(var422);
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3459 == arg0.field1487) {
                byte var425 = var3.method9011();
                int var426 = var3.method8979();
                class351.field3750[var426] = var425;
                if (class351.field3752[var426] != var425) {
                    class351.field3752[var426] = var425;
                }
                Statics.method3283(var426);
                field653[++field586 - 1 & 0x1F] = var426;
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3471 == arg0.field1487) {
                int var427 = var3.method8955();
                int var428 = var3.method9119();
                this.method490(false);
                if (var427 == 0) {
                    Statics.field1791 = Statics.field1342.field1369[var428];
                } else if (var427 == 1) {
                    Statics.field1791 = Statics.field1342.field1362[var428];
                } else if (var427 == 2) {
                    Statics.field1791 = Statics.field1342.field1365[var428];
                    this.method490(true);
                }
                if (Statics.field1791 == null) {
                    Statics.field1791 = Statics.field4826;
                }
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3513 == arg0.field1487) {
                int var429 = var3.method9119();
                int var430 = var3.method8979();
                int var431 = var3.method9015();
                int var432 = var3.method8979();
                if (var432 == 65535) {
                    var432 = -1;
                }
                int var433 = var3.method9145();
                int var434 = var3.method9119();
                if (var434 == 65535) {
                    var434 = -1;
                }
                ArrayList var435 = new ArrayList();
                var435.add(var434);
                var435.add(var432);
                method2388(var435, var431, var429, var433, var430);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3538 == arg0.field1487) {
                field616 = field710;
                byte var436 = var3.method8975();
                class168 var437 = new class168(var3);
                class171 var438;
                if (var436 >= 0) {
                    var438 = field704[var436];
                } else {
                    var438 = Statics.field1813;
                }
                if (var438 == null) {
                    this.method1308(var436);
                    arg0.field1487 = null;
                    return true;
                }
                if (var437.field1815 > var438.field1838) {
                    this.method1308(var436);
                    arg0.field1487 = null;
                    return true;
                }
                if (var437.field1815 < var438.field1838) {
                    arg0.field1487 = null;
                    return true;
                }
                var437.method3379(var438);
                arg0.field1487 = null;
                return true;
            }
            if (class327.field3510 == arg0.field1487) {
                method5610(class325.field3414);
                arg0.field1487 = null;
                return true;
            }
            class577.method3409("" + (arg0.field1487 == null ? -1 : arg0.field1487.field3544) + class107.field1393 + (arg0.field1489 == null ? -1 : arg0.field1489.field3544) + class107.field1393 + (arg0.field1494 == null ? -1 : arg0.field1494.field3544) + class107.field1393 + arg0.field1488, (Throwable) null);
            method818();
        } catch (IOException var443) {
            method6699();
        } catch (Exception var444) {
            String var441 = "" + (arg0.field1487 == null ? -1 : arg0.field1487.field3544) + class107.field1393 + (arg0.field1489 == null ? -1 : arg0.field1489.field3544) + class107.field1393 + (arg0.field1494 == null ? -1 : arg0.field1494.field3544) + class107.field1393 + arg0.field1488 + class107.field1393 + (Statics.field1342.field1350 + Statics.field4826.field1295[0]) + class107.field1393 + (Statics.field1342.field1357 + Statics.field4826.field1296[0]) + class107.field1393;
            for (int var442 = 0; var442 < arg0.field1488 && var442 < 50; var442++) {
                var441 = var441 + var3.field5413[var442] + class107.field1393;
            }
            class577.method3409(var441, var444);
            method818();
        }
        return true;
    }

    @ObfuscatedName("lc.kv(Lmx;I)V")
    public static final void method5610(class325 arg0) {
        class550 var1 = field582.field1492;
        if (class325.field3418 == arg0) {
            int var2 = var1.method9059();
            int var3 = (var2 >> 4 & 0x7) + Statics.field1831;
            int var4 = (var2 & 0x7) + Statics.field3103;
            int var5 = var1.method9110();
            int var6 = var1.method8979();
            int var7 = var1.method9031();
            if (var3 >= 0 && var4 >= 0 && var3 < Statics.field1793.field1359 && var4 < Statics.field1793.field1355) {
                int var8 = field597 == -1 ? Statics.field1793.field1356 : field597;
                method6141(var8, var3, var4, var6, var7, var5);
            }
        } else if (class325.field3411 == arg0) {
            int var9 = var1.method9145();
            int var10 = var1.method9191();
            int var11 = var1.method9191();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field596[var12];
            int var15 = var1.method9191();
            int var16 = (var15 >> 4 & 0x7) + Statics.field1831;
            int var17 = (var15 & 0x7) + Statics.field3103;
            if (var16 >= 0 && var17 >= 0 && var16 < Statics.field1793.field1359 && var17 < Statics.field1793.field1355) {
                int var18 = field597 == -1 ? Statics.field1793.field1356 : field597;
                method3371(Statics.field1793, var18, var16, var17, var14, var9, var12, var13, var10, 0, -1);
            }
        } else if (class325.field3419 == arg0) {
            int var19 = var1.method9015();
            int var20 = var1.method9059();
            int var21 = (var20 >> 4 & 0x7) + Statics.field1831;
            int var22 = (var20 & 0x7) + Statics.field3103;
            int var23 = var1.method8979();
            int var24 = var1.method9015();
            boolean var25 = var1.method8955() == 1;
            int var26 = var1.method8955();
            int var27 = var1.method9059();
            int var28 = var1.method9030();
            if (var21 >= 0 && var22 >= 0 && var21 < Statics.field1793.field1359 && var22 < Statics.field1793.field1355) {
                int var29 = field597 == -1 ? Statics.field1793.field1356 : field597;
                method4135(var29, var21, var22, var23, var28, var26, var24, var19, var27, var25);
            }
        } else if (class325.field3423 == arg0) {
            int var30 = var1.method9119();
            int var31 = var1.method9059();
            int var32 = (var31 >> 4 & 0x7) + Statics.field1831;
            int var33 = (var31 & 0x7) + Statics.field3103;
            int var34 = var1.method9031();
            int var35 = Statics.field1793.field1356;
            if (0 <= var32 && var32 < 104 && 0 <= var33 && var33 < 104) {
                int var36 = field597 == -1 ? var35 : field597;
                method2368(var36, var32, var33, var30, var34);
            }
        } else {
            if (class325.field3414 == arg0) {
                int var37 = var1.method9024();
                int var38 = (var37 >> 4 & 0x7) + Statics.field1831;
                int var39 = (var37 & 0x7) + Statics.field3103;
                int var40 = var1.method9145();
                int var41 = var1.method9191();
                int var42 = Statics.field1793.field1356;
                if (var38 >= 0 && var39 >= 0 && var38 < Statics.field1793.field1359 && var39 < Statics.field1793.field1355) {
                    class410 var43 = Statics.field1793.field1368[var42][var38][var39];
                    if (var43 != null) {
                        for (class110 var44 = (class110) var43.method7029(); var44 != null; var44 = (class110) var43.method7031()) {
                            if ((var40 & 0x7FFF) == var44.field1416) {
                                var44.method2819(var41);
                                break;
                            }
                        }
                    }
                    if (var38 >= 0 && var39 >= 0 && var38 < Statics.field1793.field1359 && var39 < Statics.field1793.field1355) {
                        int var45 = field597 == -1 ? Statics.field1793.field1356 : field597;
                        method3912(var45, var38, var39, var40, var41);
                    }
                    return;
                }
            }
            if (class325.field3415 == arg0) {
                int var46 = var1.method9015();
                int var47 = var1.method9015();
                int var48 = var1.method9024();
                int var49 = (var48 >> 4 & 0x7) + Statics.field1831;
                int var50 = (var48 & 0x7) + Statics.field3103;
                int var51 = var1.method9145();
                byte var52 = var1.method9010();
                int var53 = var1.method9119();
                byte var54 = var1.method8993();
                byte var55 = var1.method8975();
                byte var56 = var1.method9010();
                int var57 = var1.method9059();
                int var58 = var57 >> 2;
                int var59 = var57 & 0x3;
                int var60 = field596[var58];
                class95 var61;
                if (field652 == var51) {
                    var61 = Statics.field4826;
                } else {
                    var61 = Statics.field1793.field1369[var51];
                }
                if (var61 != null) {
                    int var62 = field597 == -1 ? Statics.field1793.field1356 : field597;
                    method3019(var62, var49, var50, var58, var59, var60, var53, var46, var47, var52, var55, var54, var56, var61);
                }
            }
            if (class325.field3417 == arg0) {
                int var63 = var1.method9119();
                int var64 = var1.method9191() * 4;
                int var65 = var1.method9092();
                int var66 = var1.method9145();
                int var67 = var1.method9119();
                int var68 = var1.method8955();
                int var69 = (var68 >> 4 & 0x7) + Statics.field1831;
                int var70 = (var68 & 0x7) + Statics.field3103;
                int var71 = var1.method9026();
                int var72 = var1.method9024();
                int var73 = var1.method8955() * 4;
                byte var74 = var1.method9011();
                int var75 = var1.method9145();
                byte var76 = var1.method8975();
                int var77 = var69 + var74;
                int var78 = var70 + var76;
                if (var69 >= 0 && var70 >= 0 && var69 < Statics.field1793.field1359 && var70 < Statics.field1793.field1355 && var77 >= 0 && var78 >= 0 && var77 < Statics.field1793.field1359 && var78 < Statics.field1793.field1355 && var63 != 65535) {
                    int var79 = field597 == -1 ? Statics.field1793.field1356 : field597;
                    method3375(var79, var69, var70, var77, var78, var65, var63, var73, var64, var75, var67, var72, var66, var71);
                }
            } else if (class325.field3416 == arg0) {
                int var80 = var1.method8955();
                int var81 = (var80 >> 4 & 0x7) + Statics.field1831;
                int var82 = (var80 & 0x7) + Statics.field3103;
                int var83 = var1.method8955();
                int var84 = var83 >> 2;
                int var85 = var83 & 0x3;
                int var86 = field596[var84];
                if (var81 >= 0 && var82 >= 0 && var81 < Statics.field1793.field1359 && var82 < Statics.field1793.field1355) {
                    int var87 = field597 == -1 ? Statics.field1793.field1356 : field597;
                    method3371(Statics.field1793, var87, var81, var82, var86, -1, var84, var85, 31, 0, -1);
                }
            } else if (class325.field3412 == arg0) {
                int var88 = var1.method8955() & 0x1F;
                int var89 = var1.method9145();
                int var90 = var1.method9059();
                int var91 = var1.method9059();
                int var92 = var1.method8955();
                int var93 = var1.method9024();
                int var94 = (var93 >> 4 & 0x7) + Statics.field1831;
                int var95 = (var93 & 0x7) + Statics.field3103;
                if (var94 >= 0 && var95 >= 0 && var94 < Statics.field1793.field1359 && var95 < Statics.field1793.field1355) {
                    int var96 = var88 + 1;
                    if (Statics.field4826.field1295[0] >= var94 - var96 && Statics.field4826.field1295[0] <= var94 + var96 && Statics.field4826.field1296[0] >= var95 - var96 && Statics.field4826.field1296[0] <= var95 + var96 && Statics.field4929.method2677() != 0 && var91 > 0 && field766 < 50) {
                        field705[field766] = var89;
                        field750[field766] = null;
                        field770[field766] = (var94 << 16) + (var95 << 8) + var88;
                        field748[field766] = var91;
                        field769[field766] = var92;
                        field628[field766] = var90;
                        field766++;
                    }
                }
            } else if (class325.field3413 == arg0) {
                int var97 = var1.method9059();
                int var98 = (var97 >> 4 & 0x7) + Statics.field1831;
                int var99 = (var97 & 0x7) + Statics.field3103;
                int var100 = var1.method9145();
                int var101 = var1.method9059();
                int var102 = var1.method9145();
                if (var98 >= 0 && var99 >= 0 && var98 < Statics.field1793.field1359 && var99 < Statics.field1793.field1355) {
                    int var103 = class352.method6092(var98);
                    int var104 = class352.method6092(var99);
                    int var105 = field597 == -1 ? Statics.field1793.field1356 : field597;
                    class75 var106 = new class75(var100, var105, var103, var104, method3500(Statics.field1793, var103, var104, var105) - var101, var102, field609);
                    Statics.field1793.field1363.method7051(var106);
                }
            } else if (class325.field3420 == arg0) {
                int var107 = var1.method9059();
                int var108 = var107 >> 2;
                int var109 = var107 & 0x3;
                int var110 = field596[var108];
                int var111 = var1.method8955();
                int var112 = (var111 >> 4 & 0x7) + Statics.field1831;
                int var113 = (var111 & 0x7) + Statics.field3103;
                int var114 = var1.method9015();
                if (0 <= var112 && var112 < 103 && 0 <= var113 && var113 < 103) {
                    int var115 = field597 == -1 ? Statics.field1793.field1356 : field597;
                    class99 var116 = Statics.method3754(Statics.field1793, var115, var112, var113, var110);
                    if (var116 != null) {
                        class210 var117 = class210.method5152(var116.field1216);
                        if (var117.field2222) {
                            var116.field1222 = var114;
                            return;
                        }
                    }
                    boolean var118 = method2183(var115, var112, var113, var108, var109, var110, var114);
                    if (var118) {
                        return;
                    }
                    if (var116 != null) {
                        var116.field1222 = var114;
                    }
                }
            }
        }
    }

    @ObfuscatedName("is.ke(IIIIIB)V")
    public static void method3912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class410 var5 = Statics.field1793.field1368[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class110 var6 = (class110) var5.method7029(); var6 != null; var6 = (class110) var5.method7031()) {
            if ((arg3 & 0x7FFF) == var6.field1416) {
                var6.method2819(arg4);
                break;
            }
        }
    }

    @ObfuscatedName("na.ko(IIIIIII)V")
    public static void method6141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class410 var6 = Statics.field1793.field1368[arg0][arg1][arg2];
        if (var6 == null) {
            return;
        }
        for (class110 var7 = (class110) var6.method7029(); var7 != null; var7 = (class110) var6.method7031()) {
            if ((arg3 & 0x7FFF) == var7.field1416 && var7.field1415 == arg4) {
                var7.field1415 = arg5;
                break;
            }
        }
        method8835(arg0, arg1, arg2);
    }

    @ObfuscatedName("ey.kw(IIIIIIIIIIIIILdi;I)V")
    public static void method3019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class95 arg13) {
        class210 var14 = class210.method5152(arg6);
        int var15;
        int var16;
        if (arg4 == 1 || arg4 == 3) {
            var15 = var14.field2187;
            var16 = var14.field2189;
        } else {
            var15 = var14.field2189;
            var16 = var14.field2187;
        }
        int var17 = (var15 >> 1) + arg1;
        int var18 = (var15 + 1 >> 1) + arg1;
        int var19 = (var16 >> 1) + arg2;
        int var20 = (var16 + 1 >> 1) + arg2;
        int[][] var21 = Statics.field1793.field1371[arg0];
        int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
        int var23 = (arg1 << 7) + (var15 << 6);
        int var24 = (arg2 << 7) + (var16 << 6);
        class256 var25 = var14.method3794(arg3, arg4, var21, var23, var22, var24);
        if (var25 == null) {
            return;
        }
        method3371(Statics.field1793, arg0, arg1, arg2, arg5, -1, 0, 0, 31, arg7 + 1, arg8 + 1);
        arg13.field1164 = field609 + arg7;
        arg13.field1152 = field609 + arg8;
        arg13.field1156 = var25;
        arg13.field1153 = arg1 * 128 + var15 * 64;
        arg13.field1151 = arg2 * 128 + var16 * 64;
        arg13.field1154 = var22;
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
        arg13.field1157 = arg1 + arg9;
        arg13.field1159 = arg1 + arg11;
        arg13.field1158 = arg2 + arg10;
        arg13.field1173 = arg2 + arg12;
    }

    @ObfuscatedName("gu.kq(IIIIIIIIIIIIIII)V")
    public static void method3375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg1 * 128 + 64;
        int var15 = arg2 * 128 + 64;
        int var16 = arg3 * 128 + 64;
        int var17 = arg4 * 128 + 64;
        class80 var18 = new class80(arg6, arg0, var14, var15, method3500(Statics.field1793, var14, var15, arg0) - arg7, field609 + arg9, field609 + arg10, arg11, arg12, arg13, arg5, arg8);
        var18.method2251(var16, var17, method3500(Statics.field1793, var16, var17, arg0) - arg8, field609 + arg9);
        Statics.field1793.field1370.method7051(var18);
    }

    @ObfuscatedName("dw.ky(IIIIII)V")
    public static void method2368(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class410 var5 = Statics.field1793.field1368[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class110 var6 = (class110) var5.method7029(); var6 != null; var6 = (class110) var5.method7031()) {
            if ((arg3 & 0x7FFF) == var6.field1416 && var6.field1415 == arg4) {
                var6.method8362();
                break;
            }
        }
        if (var5.method7029() == null) {
            Statics.field1793.field1368[arg0][arg1][arg2] = null;
        }
        method8835(arg0, arg1, arg2);
    }

    @ObfuscatedName("ik.ld(IIIIIIIIIZI)V")
    public static void method4135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        class110 var10 = new class110();
        var10.field1416 = arg3;
        var10.field1415 = arg4;
        var10.method2819(arg5);
        var10.field1421 = field533 + arg6;
        var10.field1418 = field533 + arg7;
        var10.field1419 = arg8;
        var10.field1420 = arg9;
        if (Statics.field1793.field1368[arg0][arg1][arg2] == null) {
            Statics.field1793.field1368[arg0][arg1][arg2] = new class410();
        }
        Statics.field1793.field1368[arg0][arg1][arg2].method7051(var10);
        method8835(arg0, arg1, arg2);
    }

    @ObfuscatedName("pc.lb(IIIIIIB)Z")
    public static boolean method7010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return method2183(Statics.field1793.field1356, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cb.lu(IIIIIIII)Z")
    public static boolean method2183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class245 var7 = Statics.field1793.field1372;
        if (class384.field4462.field4465 == arg5) {
            class264 var8 = var7.method4519(arg0, arg1, arg2);
            if (var8 != null) {
                int var9 = class257.method4010(var8.field2930);
                if (class372.field4062.field4063 == arg3) {
                    var8.field2925 = new class83(Statics.field1793, var9, 2, arg4 + 4, arg0, arg1, arg2, arg6, false, var8.field2925);
                    var8.field2929 = new class83(Statics.field1793, var9, 2, arg4 + 1 & 0x3, arg0, arg1, arg2, arg6, false, var8.field2929);
                } else {
                    var8.field2925 = new class83(Statics.field1793, var9, arg3, arg4, arg0, arg1, arg2, arg6, false, var8.field2925);
                }
                return true;
            }
        } else if (class384.field4463.field4465 == arg5) {
            class266 var10 = var7.method4520(arg0, arg1, arg2);
            if (var10 != null) {
                int var11 = class257.method4010(var10.field2942);
                if (class372.field4045.field4063 == arg3 || class372.field4046.field4063 == arg3) {
                    var10.field2940 = new class83(Statics.field1793, var11, 4, arg4, arg0, arg1, arg2, arg6, false, var10.field2940);
                } else if (class372.field4056.field4063 == arg3) {
                    var10.field2940 = new class83(Statics.field1793, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field2940);
                } else if (class372.field4048.field4063 == arg3) {
                    var10.field2940 = new class83(Statics.field1793, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field2940);
                } else if (class372.field4054.field4063 == arg3) {
                    var10.field2940 = new class83(Statics.field1793, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field2940);
                    var10.field2941 = new class83(Statics.field1793, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field2941);
                }
                return true;
            }
        } else if (class384.field4467.field4465 == arg5) {
            class267 var12 = var7.method4700(arg0, arg1, arg2);
            if (class372.field4061.field4063 == arg3) {
                arg3 = class372.field4060.field4063;
            }
            if (var12 != null) {
                var12.field2950 = new class83(Statics.field1793, class257.method4010(var12.field2958), arg3, arg4, arg0, arg1, arg2, arg6, false, var12.field2950);
                return true;
            }
        } else if (class384.field4461.field4465 == arg5) {
            class236 var13 = var7.method4522(arg0, arg1, arg2);
            if (var13 != null) {
                var13.field2528 = new class83(Statics.field1793, class257.method4010(var13.field2532), 22, arg4, arg0, arg1, arg2, arg6, false, var13.field2528);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gx.lv(Ldd;IIIIIIIIIII)V")
    public static void method3371(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class410 var11 = arg0.field1353;
        class99 var12 = null;
        for (class99 var13 = (class99) var11.method7029(); var13 != null; var13 = (class99) var11.method7031()) {
            if (var13.field1209 == arg1 && var13.field1208 == arg2 && var13.field1223 == arg3 && var13.field1207 == arg4) {
                var12 = var13;
                break;
            }
        }
        if (var12 == null) {
            var12 = new class99();
            var12.field1209 = arg1;
            var12.field1207 = arg4;
            var12.field1208 = arg2;
            var12.field1223 = arg3;
            var12.field1222 = -1;
            method4803(arg0, var12);
            var11.method7051(var12);
        }
        var12.field1216 = arg5;
        var12.field1215 = arg6;
        var12.field1213 = arg7;
        var12.field1219 = arg9;
        var12.field1220 = arg10;
        var12.method2506(arg8);
    }

    @ObfuscatedName("pg.ll(I)V")
    public static final void method6989() {
        for (class99 var0 = (class99) Statics.field1342.field1353.method7029(); var0 != null; var0 = (class99) Statics.field1342.field1353.method7031()) {
            if (var0.field1220 == -1) {
                var0.field1219 = 0;
                method4803(Statics.field1342, var0);
            } else {
                var0.method8362();
            }
        }
    }

    @ObfuscatedName("jj.lq(Ldd;Ldr;S)V")
    public static final void method4803(class104 arg0, class99 arg1) {
        class245 var2 = arg0.field1372;
        long var3 = 0L;
        int var5 = -1;
        int var6 = 0;
        int var7 = 0;
        if (arg1.field1207 == 0) {
            var3 = var2.method4523(arg1.field1209, arg1.field1208, arg1.field1223);
        }
        if (arg1.field1207 == 1) {
            var3 = var2.method4585(arg1.field1209, arg1.field1208, arg1.field1223);
        }
        if (arg1.field1207 == 2) {
            var3 = var2.method4595(arg1.field1209, arg1.field1208, arg1.field1223);
        }
        if (arg1.field1207 == 3) {
            var3 = var2.method4707(arg1.field1209, arg1.field1208, arg1.field1223);
        }
        if (var3 != 0L) {
            int var8 = var2.method4677(arg1.field1209, arg1.field1208, arg1.field1223, var3);
            var5 = class257.method4010(var3);
            var6 = var8 & 0x1F;
            var7 = var8 >> 6 & 0x3;
        }
        arg1.field1210 = var5;
        arg1.field1212 = var6;
        arg1.field1211 = var7;
    }

    @ObfuscatedName("mi.le(Ldd;I)V")
    public static final void method5770(class104 arg0) {
        for (class99 var1 = (class99) arg0.field1353.method7029(); var1 != null; var1 = (class99) arg0.field1353.method7031()) {
            if (var1.field1220 > 0) {
                var1.field1220--;
            }
            if (var1.field1220 != 0) {
                if (var1.field1219 > 0) {
                    var1.field1219--;
                }
                if (var1.field1219 == 0 && var1.field1208 >= 1 && var1.field1223 >= 1 && var1.field1208 <= 102 && var1.field1223 <= 102 && (var1.field1216 < 0 || class85.method3206(var1.field1216, var1.field1215))) {
                    method7188(arg0, var1.field1209, var1.field1207, var1.field1208, var1.field1223, var1.field1216, var1.field1213, var1.field1215, var1.field1222);
                    var1.field1219 = -1;
                    if (var1.field1216 == var1.field1210 && var1.field1210 == -1) {
                        var1.method8362();
                    } else if (var1.field1216 == var1.field1210 && var1.field1213 == var1.field1211 && var1.field1215 == var1.field1212) {
                        var1.method8362();
                    }
                }
            } else if (var1.field1210 < 0 || class85.method3206(var1.field1210, var1.field1212)) {
                method7188(arg0, var1.field1209, var1.field1207, var1.field1208, var1.field1223, var1.field1210, var1.field1211, var1.field1212, var1.field1222);
                var1.method8362();
            }
        }
    }

    @ObfuscatedName("qt.la(Ldd;IIIIIIIII)V")
    public static final void method7188(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class245 var9 = arg0.field1372;
        if (arg3 < 1 || arg4 < 1 || arg3 > arg0.field1359 - 1 || arg4 > arg0.field1355 - 1) {
            return;
        }
        if (field520 && arg0.field1356 != arg1) {
            return;
        }
        long var10 = 0L;
        boolean var12 = true;
        boolean var13 = false;
        boolean var14 = false;
        if (arg2 == 0) {
            var10 = var9.method4523(arg1, arg3, arg4);
        }
        if (arg2 == 1) {
            var10 = var9.method4585(arg1, arg3, arg4);
        }
        if (arg2 == 2) {
            var10 = var9.method4595(arg1, arg3, arg4);
        }
        if (arg2 == 3) {
            var10 = var9.method4707(arg1, arg3, arg4);
        }
        if (var10 != 0L) {
            int var15 = var9.method4677(arg1, arg3, arg4, var10);
            int var16 = class257.method4010(var10);
            int var17 = var15 & 0x1F;
            int var18 = var15 >> 6 & 0x3;
            class210 var19 = class210.method5152(var16);
            Statics.method686(arg1, arg3, arg4, var19, var18);
            if (arg2 == 0) {
                var9.method4527(arg1, arg3, arg4);
                if (var19.field2179 != 0) {
                    arg0.field1352[arg1].method5104(arg3, arg4, var17, var18, var19.field2213);
                }
            }
            if (arg2 == 1) {
                var9.method4515(arg1, arg3, arg4);
            }
            if (arg2 == 2) {
                var9.method4516(arg1, arg3, arg4);
                if (var19.field2189 + arg3 > arg0.field1359 - 1 || var19.field2189 + arg4 > arg0.field1355 - 1 || var19.field2187 + arg3 > arg0.field1359 - 1 || var19.field2187 + arg4 > arg0.field1355 - 1) {
                    return;
                }
                if (var19.field2179 != 0) {
                    arg0.field1352[arg1].method5105(arg3, arg4, var19.field2189, var19.field2187, var18, var19.field2213);
                }
            }
            if (arg2 == 3) {
                var9.method4517(arg1, arg3, arg4);
                if (var19.field2179 == 1) {
                    arg0.field1352[arg1].method5107(arg3, arg4);
                }
            }
        }
        if (arg5 < 0) {
            return;
        }
        int var20 = arg1;
        if (arg1 < 3 && (arg0.field1360[1][arg3][arg4] & 0x2) == 2) {
            var20 = arg1 + 1;
        }
        class271 var21 = arg0.field1352[arg1];
        class210 var22 = class210.method5152(arg5);
        int var23 = arg8 >= 0 ? arg8 : var22.field2172;
        int var24;
        int var25;
        if (arg6 == 1 || arg6 == 3) {
            var24 = var22.field2187;
            var25 = var22.field2189;
        } else {
            var24 = var22.field2189;
            var25 = var22.field2187;
        }
        int var26;
        int var27;
        if (arg3 + var24 <= arg0.field1359) {
            var26 = (var24 >> 1) + arg3;
            var27 = (var24 + 1 >> 1) + arg3;
        } else {
            var26 = arg3;
            var27 = arg3 + 1;
        }
        int var28;
        int var29;
        if (arg4 + var25 <= arg0.field1355) {
            var28 = (var25 >> 1) + arg4;
            var29 = (var25 + 1 >> 1) + arg4;
        } else {
            var28 = arg4;
            var29 = arg4 + 1;
        }
        int[][] var30 = arg0.field1371[var20];
        int var31 = var30[var26][var28] + var30[var27][var28] + var30[var26][var29] + var30[var27][var29] >> 2;
        int var32 = (arg3 << 7) + (var24 << 6);
        int var33 = (arg4 << 7) + (var25 << 6);
        class245 var34 = arg0.field1372;
        long var35 = Statics.method5153(arg3, arg4, 2, var22.field2194 == 0, arg5, arg0.field1354);
        int var37 = (arg6 << 6) + arg7;
        if (var22.field2211 == 1) {
            var37 += 256;
        }
        if (arg7 == 22) {
            class248 var38;
            if (var23 == -1 && var22.field2212 == null) {
                var38 = var22.method3794(22, arg6, var30, var32, var31, var33);
            } else {
                var38 = new class83(arg0, arg5, 22, arg6, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4513(arg1, arg3, arg4, var31, var38, var35, var37);
            if (var22.field2179 == 1 && var21 != null) {
                var21.method5102(arg3, arg4);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class248 var64;
            if (var23 == -1 && var22.field2212 == null) {
                var64 = var22.method3794(10, arg6, var30, var32, var31, var33);
            } else {
                var64 = new class83(arg0, arg5, 10, arg6, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            if (var64 != null) {
                var34.method4507(arg1, arg3, arg4, var31, var24, var25, var64, arg7 == 11 ? 256 : 0, var35, var37);
            }
            if (var22.field2179 != 0 && var21 != null) {
                var21.method5100(arg3, arg4, var24, var25, var22.field2213);
            }
        } else if (arg7 >= 12) {
            class248 var39;
            if (var23 == -1 && var22.field2212 == null) {
                var39 = var22.method3794(arg7, arg6, var30, var32, var31, var33);
            } else {
                var39 = new class83(arg0, arg5, arg7, arg6, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4507(arg1, arg3, arg4, var31, 1, 1, var39, 0, var35, var37);
            if (var22.field2179 != 0 && var21 != null) {
                var21.method5100(arg3, arg4, var24, var25, var22.field2213);
            }
        } else if (arg7 == 0) {
            class248 var40;
            if (var23 == -1 && var22.field2212 == null) {
                var40 = var22.method3794(0, arg6, var30, var32, var31, var33);
            } else {
                var40 = new class83(arg0, arg5, 0, arg6, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4505(arg1, arg3, arg4, var31, var40, (class248) null, class85.field1058[arg6], 0, var35, var37);
            if (var22.field2179 != 0 && var21 != null) {
                var21.method5099(arg3, arg4, arg7, arg6, var22.field2213);
            }
        } else if (arg7 == 1) {
            class248 var41;
            if (var23 == -1 && var22.field2212 == null) {
                var41 = var22.method3794(1, arg6, var30, var32, var31, var33);
            } else {
                var41 = new class83(arg0, arg5, 1, arg6, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4505(arg1, arg3, arg4, var31, var41, (class248) null, class85.field1059[arg6], 0, var35, var37);
            if (var22.field2179 != 0 && var21 != null) {
                var21.method5099(arg3, arg4, arg7, arg6, var22.field2213);
            }
        } else if (arg7 == 2) {
            int var42 = arg6 + 1 & 0x3;
            class248 var43;
            class248 var44;
            if (var23 == -1 && var22.field2212 == null) {
                var43 = var22.method3794(2, arg6 + 4, var30, var32, var31, var33);
                var44 = var22.method3794(2, var42, var30, var32, var31, var33);
            } else {
                var43 = new class83(arg0, arg5, 2, arg6 + 4, var20, arg3, arg4, var23, var22.field2221, (class248) null);
                var44 = new class83(arg0, arg5, 2, var42, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4505(arg1, arg3, arg4, var31, var43, var44, class85.field1058[arg6], class85.field1058[var42], var35, var37);
            if (var22.field2179 != 0 && var21 != null) {
                var21.method5099(arg3, arg4, arg7, arg6, var22.field2213);
            }
        } else if (arg7 == 3) {
            class248 var45;
            if (var23 == -1 && var22.field2212 == null) {
                var45 = var22.method3794(3, arg6, var30, var32, var31, var33);
            } else {
                var45 = new class83(arg0, arg5, 3, arg6, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4505(arg1, arg3, arg4, var31, var45, (class248) null, class85.field1059[arg6], 0, var35, var37);
            if (var22.field2179 != 0 && var21 != null) {
                var21.method5099(arg3, arg4, arg7, arg6, var22.field2213);
            }
        } else if (arg7 == 9) {
            class248 var46;
            if (var23 == -1 && var22.field2212 == null) {
                var46 = var22.method3794(arg7, arg6, var30, var32, var31, var33);
            } else {
                var46 = new class83(arg0, arg5, arg7, arg6, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4507(arg1, arg3, arg4, var31, 1, 1, var46, 0, var35, var37);
            if (var22.field2179 != 0 && var21 != null) {
                var21.method5100(arg3, arg4, var24, var25, var22.field2213);
            }
        } else if (arg7 == 4) {
            class248 var47;
            if (var23 == -1 && var22.field2212 == null) {
                var47 = var22.method3794(4, arg6, var30, var32, var31, var33);
            } else {
                var47 = new class83(arg0, arg5, 4, arg6, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4506(arg1, arg3, arg4, var31, var47, (class248) null, class85.field1058[arg6], 0, 0, 0, var35, var37);
        } else if (arg7 == 5) {
            int var48 = 16;
            long var49 = var34.method4523(arg1, arg3, arg4);
            if (var49 != 0L) {
                var48 = class210.method5152(class257.method4010(var49)).field2195;
            }
            class248 var51;
            if (var23 == -1 && var22.field2212 == null) {
                var51 = var22.method3794(4, arg6, var30, var32, var31, var33);
            } else {
                var51 = new class83(arg0, arg5, 4, arg6, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4506(arg1, arg3, arg4, var31, var51, (class248) null, class85.field1058[arg6], 0, class85.field1062[arg6] * var48, class85.field1061[arg6] * var48, var35, var37);
        } else if (arg7 == 6) {
            int var52 = 8;
            long var53 = var34.method4523(arg1, arg3, arg4);
            if (var53 != 0L) {
                var52 = class210.method5152(class257.method4010(var53)).field2195 / 2;
            }
            class248 var55;
            if (var23 == -1 && var22.field2212 == null) {
                var55 = var22.method3794(4, arg6 + 4, var30, var32, var31, var33);
            } else {
                var55 = new class83(arg0, arg5, 4, arg6 + 4, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4506(arg1, arg3, arg4, var31, var55, (class248) null, 256, arg6, class85.field1064[arg6] * var52, class85.field1063[arg6] * var52, var35, var37);
        } else if (arg7 == 7) {
            int var56 = arg6 + 2 & 0x3;
            class248 var57;
            if (var23 == -1 && var22.field2212 == null) {
                var57 = var22.method3794(4, var56 + 4, var30, var32, var31, var33);
            } else {
                var57 = new class83(arg0, arg5, 4, var56 + 4, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4506(arg1, arg3, arg4, var31, var57, (class248) null, 256, var56, 0, 0, var35, var37);
        } else if (arg7 == 8) {
            int var58 = 8;
            long var59 = var34.method4523(arg1, arg3, arg4);
            if (var59 != 0L) {
                var58 = class210.method5152(class257.method4010(var59)).field2195 / 2;
            }
            int var61 = arg6 + 2 & 0x3;
            class248 var62;
            class248 var63;
            if (var23 == -1 && var22.field2212 == null) {
                var62 = var22.method3794(4, arg6 + 4, var30, var32, var31, var33);
                var63 = var22.method3794(4, var61 + 4, var30, var32, var31, var33);
            } else {
                var62 = new class83(arg0, arg5, 4, arg6 + 4, var20, arg3, arg4, var23, var22.field2221, (class248) null);
                var63 = new class83(arg0, arg5, 4, var61 + 4, var20, arg3, arg4, var23, var22.field2221, (class248) null);
            }
            var34.method4506(arg1, arg3, arg4, var31, var62, var63, 256, arg6, class85.field1064[arg6] * var58, class85.field1063[arg6] * var58, var35, var37);
        }
        class210 var65 = class210.method5152(arg5);
        if (var65 != null && var65.method3797()) {
            Statics.method5552(var20, arg3, arg4, var65, arg6);
        }
    }

    @ObfuscatedName("oz.ln(Ldd;III)V")
    public static final void method6714(class104 arg0, int arg1, int arg2) {
        method2940(arg0, arg0.field1356, arg1, arg2);
    }

    @ObfuscatedName("ux.lp(IIII)V")
    public static final void method8835(int arg0, int arg1, int arg2) {
        method2940(Statics.field1793, arg0, arg1, arg2);
    }

    @ObfuscatedName("eo.lc(Ldd;IIII)V")
    public static final void method2940(class104 arg0, int arg1, int arg2, int arg3) {
        class410 var4 = arg0.field1368[arg1][arg2][arg3];
        if (var4 == null) {
            arg0.field1372.method4518(arg1, arg2, arg3);
            return;
        }
        long var5 = -99999999L;
        class110 var7 = null;
        for (class110 var8 = (class110) var4.method7029(); var8 != null; var8 = (class110) var4.method7031()) {
            class211 var9 = class211.method2414(var8.field1416);
            long var10 = (long) var9.field2226;
            if (var9.field2247 == 1) {
                var10 *= var8.field1415 < Integer.MAX_VALUE ? (long) (var8.field1415 + 1) : (long) var8.field1415;
            }
            if (var10 > var5) {
                var5 = var10;
                var7 = var8;
            }
        }
        if (var7 == null) {
            arg0.field1372.method4518(arg1, arg2, arg3);
            return;
        }
        var4.method7025(var7);
        class110 var12 = null;
        class110 var13 = null;
        for (class110 var14 = (class110) var4.method7029(); var14 != null; var14 = (class110) var4.method7031()) {
            if (var7.field1416 != var14.field1416) {
                if (var12 == null) {
                    var12 = var14;
                }
                if (var12.field1416 != var14.field1416 && var13 == null) {
                    var13 = var14;
                }
            }
        }
        long var15 = Statics.method5153(arg2, arg3, 3, false, 0, arg0.field1354);
        arg0.field1372.method4504(arg1, arg2, arg3, method3500(arg0, class352.method6092(arg2), class352.method6092(arg3), arg1), var7, var15, var12, var13);
    }

    @ObfuscatedName("gq.ls(Ldd;Lva;ZB)V")
    public static void method3419(class104 arg0, class550 arg1, boolean arg2) {
        int var3 = arg1.method8955();
        if (var3 < arg0.field1366) {
            throw new RuntimeException("dang");
        } else if (var3 > arg0.field1366) {
            throw new RuntimeException("dang!");
        } else {
            arg0.field1366 = 0;
            label64: for (int var4 = 0; var4 < var3; var4++) {
                int var5 = arg0.field1364[var4];
                class480 var6 = arg0.field1365[var5];
                boolean var7 = arg1.method8955() == 1;
                if (var7) {
                    arg0.field1364[++arg0.field1366 - 1] = var5;
                    var6.field5007 = arg2 ? arg1.method8975() : 1;
                    byte var8 = arg1.method8975();
                    byte var9 = arg1.method8975();
                    var6.field5010 = arg1.method9119();
                    byte var10 = (byte) arg1.method8955();
                    class277[] var11 = class277.field3044;
                    for (int var12 = 0; var12 < var11.length; var12++) {
                        class277 var13 = var11[var12];
                        if (var13.field3046 == var10) {
                            int var16 = var6.field5010;
                            int var17 = var6.field5014;
                            int var18 = var16 - var17 & 0x7FF;
                            class278 var19 = class278.field3053;
                            if (var18 > 1024) {
                                var18 = 2048 - var18;
                                var19 = class278.field3054;
                            }
                            class273 var20 = new class273(var19, var18);
                            int var22 = Math.min(var20.method5144(), 128);
                            var6.field5009 = var22 / field742;
                            var6.field5015 = var22 % field742;
                            if (var8 != 0 || var9 != 0) {
                                var6.method8172(var6.field5017[0] + var8, var6.field5018[0] + var9, var13);
                            }
                            continue label64;
                        }
                    }
                    throw new RuntimeException("Could not find MoveSpeed with ID " + var10);
                } else {
                    field593.method2491(var6.field5008);
                    arg0.field1365[var5] = null;
                }
            }
            while (arg1.method8926(field582.field1488) >= 10) {
                int var23 = arg1.method9119();
                arg0.field1364[++arg0.field1366 - 1] = var23;
                int var24 = arg1.method8955();
                int var25 = arg1.method8955();
                int var26 = var24 * 8;
                int var27 = var25 * 8;
                class104 var28 = field593.method2493(var23, var26, var27, Statics.field4929.method2672(), class233.field2472);
                class480 var29 = new class480(var23, var28);
                arg0.field1365[var23] = var29;
                int var30 = arg1.method8955();
                int var31 = arg1.method8955();
                var29.method8181(var30, var31);
                var29.field5014 = arg1.method9119();
                arg1.method9119();
            }
        }
    }

    @ObfuscatedName("gu.lx(Ldd;Lva;B)V")
    public static void method3372(class104 arg0, class550 arg1) {
        int var2 = arg1.method9119();
        class480 var3 = arg0.field1365[var2];
        class104 var4 = var3.field5008;
        var4.field1350 = arg1.method9119();
        var4.field1357 = arg1.method9119();
        int var5 = var4.field1359 / 8;
        int var6 = var4.field1355 / 8;
        int var7 = arg1.method9119();
        arg1.method8922();
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < var5; var9++) {
                for (int var10 = 0; var10 < var6; var10++) {
                    int var11 = arg1.method8923(1);
                    if (var11 == 1) {
                        field592[var8][var9][var10] = arg1.method8923(26);
                    } else {
                        field592[var8][var9][var10] = -1;
                    }
                }
            }
        }
        arg1.method8924();
        Statics.field915 = new int[var7][4];
        for (int var12 = 0; var12 < var7; var12++) {
            for (int var13 = 0; var13 < 4; var13++) {
                Statics.field915[var12][var13] = arg1.method9110();
            }
        }
        Statics.field1665 = new int[var7];
        Statics.field1428 = new int[var7];
        Statics.field4933 = new int[var7];
        Statics.field48 = new byte[var7][];
        Statics.field1517 = new byte[var7][];
        int var14 = 0;
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < var5; var16++) {
                for (int var17 = 0; var17 < var6; var17++) {
                    int var18 = field592[var15][var16][var17];
                    if (var18 != -1) {
                        int var19 = var18 >> 14 & 0x3FF;
                        int var20 = var18 >> 3 & 0x7FF;
                        int var21 = (var19 / 8 << 8) + var20 / 8;
                        for (int var22 = 0; var22 < var14; var22++) {
                            if (Statics.field1665[var22] == var21) {
                                var21 = -1;
                                break;
                            }
                        }
                        if (var21 != -1) {
                            Statics.field1665[var14] = var21;
                            int var23 = var21 >> 8 & 0xFF;
                            int var24 = var21 & 0xFF;
                            Statics.field1428[var14] = Statics.field4712.method6797("m" + var23 + "_" + var24);
                            Statics.field4933[var14] = Statics.field4712.method6797("l" + var23 + "_" + var24);
                            var14++;
                        }
                    }
                }
            }
        }
        method7976(25);
        field613 = true;
        Statics.field4459 = var4;
        method3705(var4);
    }

    @ObfuscatedName("hy.lr(Ldd;ZLva;B)V")
    public static final void method3562(class104 arg0, boolean arg1, class550 arg2) {
        field526 = 0;
        field730 = 0;
        method6941(arg0, arg2);
        method5108(arg0, arg1, arg2);
        method4982(arg0, arg2);
        for (int var3 = 0; var3 < field526; var3++) {
            int var4 = field654[var3];
            if (field609 != arg0.field1362[var4].field1283) {
                arg0.field1362[var4].field1386 = null;
                arg0.field1362[var4] = null;
            }
        }
        if (field582.field1488 != arg2.field5415) {
            throw new RuntimeException(arg2.field5415 + class107.field1393 + field582.field1488);
        }
        for (int var5 = 0; var5 < arg0.field1367; var5++) {
            if (arg0.field1362[arg0.field1351[var5]] == null) {
                throw new RuntimeException(var5 + class107.field1393 + arg0.field1367);
            }
        }
    }

    @ObfuscatedName("pj.lm(Ldd;Lva;B)V")
    public static final void method6941(class104 arg0, class550 arg1) {
        arg1.method8922();
        int var2 = arg1.method8923(8);
        if (var2 < arg0.field1367) {
            for (int var3 = var2; var3 < arg0.field1367; var3++) {
                field654[++field526 - 1] = arg0.field1351[var3];
            }
        }
        if (var2 > arg0.field1367) {
            throw new RuntimeException("");
        }
        arg0.field1367 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = arg0.field1351[var4];
            class106 var6 = arg0.field1362[var5];
            int var7 = arg1.method8923(1);
            if (var7 == 0) {
                arg0.field1351[++arg0.field1367 - 1] = var5;
                var6.field1283 = field609;
            } else {
                int var8 = arg1.method8923(2);
                if (var8 == 0) {
                    arg0.field1351[++arg0.field1367 - 1] = var5;
                    var6.field1283 = field609;
                    field581[++field730 - 1] = var5;
                } else if (var8 == 1) {
                    arg0.field1351[++arg0.field1367 - 1] = var5;
                    var6.field1283 = field609;
                    int var9 = arg1.method8923(3);
                    var6.method2740(var9, class277.field3037);
                    int var10 = arg1.method8923(1);
                    if (var10 == 1) {
                        field581[++field730 - 1] = var5;
                    }
                } else if (var8 == 2) {
                    arg0.field1351[++arg0.field1367 - 1] = var5;
                    var6.field1283 = field609;
                    if (arg1.method8923(1) == 1) {
                        int var11 = arg1.method8923(3);
                        var6.method2740(var11, class277.field3040);
                        int var12 = arg1.method8923(3);
                        var6.method2740(var12, class277.field3040);
                    } else {
                        int var13 = arg1.method8923(3);
                        var6.method2740(var13, class277.field3038);
                    }
                    int var14 = arg1.method8923(1);
                    if (var14 == 1) {
                        field581[++field730 - 1] = var5;
                    }
                } else if (var8 == 3) {
                    field654[++field526 - 1] = var5;
                }
            }
        }
    }

    @ObfuscatedName("kd.lw(Ldd;ZLva;I)V")
    public static final void method5108(class104 arg0, boolean arg1, class550 arg2) {
        while (true) {
            byte var3 = 16;
            int var4 = 0x1 << var3;
            if (arg2.method8940(field582.field1488) >= var3 + 12) {
                int var5 = arg2.method8923(var3);
                if (var4 - 1 != var5) {
                    int var6 = Statics.field89;
                    boolean var7 = false;
                    if (arg0.field1362[var5] == null) {
                        arg0.field1362[var5] = new class106();
                        var7 = true;
                    }
                    class106 var8 = arg0.field1362[var5];
                    var8.field1381 = var6;
                    arg0.field1351[++arg0.field1367 - 1] = var5;
                    var8.field1283 = field609;
                    int var9 = arg2.method8923(1);
                    if (var9 == 1) {
                        field581[++field730 - 1] = var5;
                    }
                    int var10 = arg2.method8923(1);
                    int var11;
                    if (arg1) {
                        var11 = arg2.method8923(8);
                        if (var11 > 127) {
                            var11 -= 256;
                        }
                    } else {
                        var11 = arg2.method8923(5);
                        if (var11 > 15) {
                            var11 -= 32;
                        }
                    }
                    boolean var12 = arg2.method8923(1) == 1;
                    if (var12) {
                        arg2.method8923(32);
                    }
                    var8.field1386 = class195.method3383(arg2.method8923(14));
                    int var13 = field658[arg2.method8923(3)];
                    if (var7) {
                        var8.field1243 = var8.field1226 = var13;
                    }
                    int var14;
                    if (arg1) {
                        var14 = arg2.method8923(8);
                        if (var14 > 127) {
                            var14 -= 256;
                        }
                    } else {
                        var14 = arg2.method8923(5);
                        if (var14 > 15) {
                            var14 -= 32;
                        }
                    }
                    method8385(var8);
                    if (var8.field1293 == 0) {
                        var8.field1226 = 0;
                    }
                    if (class549.field5408 >= 222) {
                        var8.method2735(Statics.field1361 + var14, Statics.field819 + var11, var10 == 1);
                        continue;
                    }
                    var8.method2735(Statics.field4826.field1295[0] + var14, Statics.field4826.field1296[0] + var11, var10 == 1);
                    continue;
                }
            }
            arg2.method8924();
            return;
        }
    }

    @ObfuscatedName("jc.ly(Ldd;Lva;I)V")
    public static final void method4982(class104 arg0, class550 arg1) {
        for (int var2 = 0; var2 < field730; var2++) {
            int var3 = field581[var2];
            class106 var4 = arg0.field1362[var3];
            int var5 = arg1.method8955();
            if ((var5 & 0x20) != 0) {
                int var6 = arg1.method8955();
                var5 += var6 << 8;
            }
            if ((var5 & 0x200) != 0) {
                int var7 = arg1.method8955();
                var5 += var7 << 16;
            }
            if ((var5 & 0x40) != 0) {
                var4.field1386 = class195.method3383(arg1.method9145());
                method8385(var4);
            }
            if ((var5 & 0x1) != 0) {
                var4.field1245 = arg1.method9166();
                var4.field1248 = 100;
            }
            if ((var5 & 0x8) != 0) {
                int var8 = arg1.method9119();
                int var9 = arg1.method9015();
                var4.field1264 = arg1.method9191() == 1;
                var4.field1262 = var8;
                var4.field1263 = var9;
            }
            if ((var5 & 0x8000) != 0) {
                var4.method2781(arg1.method8955());
            }
            if ((var5 & 0x2) != 0) {
                int var10 = arg1.method8979();
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg1.method9024();
                if (var4.field1269 == var10 && var10 != -1) {
                    int var12 = class213.method2555(var10).field2329;
                    if (var12 == 1) {
                        var4.field1270 = 0;
                        var4.field1271 = 0;
                        var4.field1282 = var11;
                        var4.field1273 = 0;
                    }
                    if (var12 == 2) {
                        var4.field1273 = 0;
                    }
                } else if (var10 == -1 || var4.field1269 == -1 || class213.method2555(var10).field2322 >= class213.method2555(var4.field1269).field2322) {
                    var4.field1269 = var10;
                    var4.field1270 = 0;
                    var4.field1271 = 0;
                    var4.field1282 = var11;
                    var4.field1273 = 0;
                    var4.field1299 = var4.field1294;
                }
            }
            if ((var5 & 0x10) != 0) {
                var4.field1253 = arg1.method8979();
                var4.field1253 += arg1.method9191() << 16;
                int var13 = 16777215;
                if (var4.field1253 == var13) {
                    var4.field1253 = -1;
                }
            }
            if ((var5 & 0x800) != 0) {
                int var14 = arg1.method9191();
                if ((var14 & 0x1) == 1) {
                    var4.method2750();
                } else {
                    int[] var15 = null;
                    if ((var14 & 0x2) == 2) {
                        int var16 = arg1.method9024();
                        var15 = new int[var16];
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = arg1.method9015();
                            int var19 = var18 == 65535 ? -1 : var18;
                            var15[var17] = var19;
                        }
                    }
                    short[] var20 = null;
                    if ((var14 & 0x4) == 4) {
                        int var21 = 0;
                        if (var4.field1386.field2029 != null) {
                            var21 = var4.field1386.field2029.length;
                        }
                        var20 = new short[var21];
                        for (int var22 = 0; var22 < var21; var22++) {
                            var20[var22] = (short) arg1.method8979();
                        }
                    }
                    short[] var23 = null;
                    if ((var14 & 0x8) == 8) {
                        int var24 = 0;
                        if (var4.field1386.field2031 != null) {
                            var24 = var4.field1386.field2031.length;
                        }
                        var23 = new short[var24];
                        for (int var25 = 0; var25 < var24; var25++) {
                            var23[var25] = (short) arg1.method9145();
                        }
                    }
                    boolean var26 = false;
                    if ((var14 & 0x10) != 0) {
                        var26 = arg1.method9059() == 1;
                    }
                    long var27 = (long) (++class106.field1390 - 1);
                    var4.method2748(new class194(var27, var15, var20, var23, var26));
                }
            }
            if ((var5 & 0x4000) != 0) {
                var4.field1240 = arg1.method9030();
            }
            if ((var5 & 0x100) != 0) {
                var4.method2764(arg1.method9166());
            }
            if ((var5 & 0x400) != 0) {
                var4.field1285 = field609 + arg1.method9015();
                var4.field1259 = field609 + arg1.method9119();
                var4.field1260 = arg1.method8993();
                var4.field1288 = arg1.method9010();
                var4.field1289 = arg1.method8975();
                var4.field1286 = (byte) arg1.method9191();
            }
            if ((var5 & 0x10000) != 0) {
                int var29 = arg1.method9024();
                if (var29 == 0) {
                    var4.method2745();
                } else {
                    int[] var30 = new int[8];
                    short[] var31 = new short[8];
                    for (int var32 = 0; var32 < 8; var32++) {
                        if ((var29 & 0x1 << var32) == 0) {
                            var30[var32] = -1;
                            var31[var32] = -1;
                        } else {
                            var30[var32] = arg1.method9205();
                            var31[var32] = (short) arg1.method8990();
                        }
                    }
                    var4.method2736(var30, var31);
                }
            }
            if ((var5 & 0x20000) != 0) {
                int var33 = arg1.method9030();
                var4.field1231 = (var33 & 0x1) == 0 ? var4.field1386.field2014 : arg1.method9015();
                var4.field1246 = (var33 & 0x2) == 0 ? var4.field1386.field2004 : arg1.method8979();
                var4.field1272 = (var33 & 0x4) == 0 ? var4.field1386.field2015 : arg1.method9145();
                var4.field1279 = (var33 & 0x8) == 0 ? var4.field1386.field2017 : arg1.method9119();
                var4.field1235 = (var33 & 0x10) == 0 ? var4.field1386.field2018 : arg1.method9119();
                var4.field1236 = (var33 & 0x20) == 0 ? var4.field1386.field2019 : arg1.method9015();
                var4.field1278 = (var33 & 0x40) == 0 ? var4.field1386.field2013 : arg1.method9015();
                var4.field1238 = (var33 & 0x80) == 0 ? var4.field1386.field2016 : arg1.method8979();
                var4.field1239 = (var33 & 0x100) == 0 ? var4.field1386.field2022 : arg1.method8979();
                var4.field1281 = (var33 & 0x200) == 0 ? var4.field1386.field2030 : arg1.method9145();
                var4.field1287 = (var33 & 0x400) == 0 ? var4.field1386.field2024 : arg1.method9145();
                var4.field1241 = (var33 & 0x800) == 0 ? var4.field1386.field2052 : arg1.method9015();
                var4.field1242 = (var33 & 0x1000) == 0 ? var4.field1386.field2021 : arg1.method9015();
                var4.field1244 = (var33 & 0x2000) == 0 ? var4.field1386.field2027 : arg1.method9145();
                var4.field1230 = (var33 & 0x4000) == 0 ? var4.field1386.field2007 : arg1.method9015();
            }
            if ((var5 & 0x2000) != 0) {
                int var34 = arg1.method9191();
                if ((var34 & 0x1) == 1) {
                    var4.method2749();
                } else {
                    int[] var35 = null;
                    if ((var34 & 0x2) == 2) {
                        int var36 = arg1.method8955();
                        var35 = new int[var36];
                        for (int var37 = 0; var37 < var36; var37++) {
                            int var38 = arg1.method8979();
                            int var39 = var38 == 65535 ? -1 : var38;
                            var35[var37] = var39;
                        }
                    }
                    short[] var40 = null;
                    if ((var34 & 0x4) == 4) {
                        int var41 = 0;
                        if (var4.field1386.field2029 != null) {
                            var41 = var4.field1386.field2029.length;
                        }
                        var40 = new short[var41];
                        for (int var42 = 0; var42 < var41; var42++) {
                            var40[var42] = (short) arg1.method9119();
                        }
                    }
                    short[] var43 = null;
                    if ((var34 & 0x8) == 8) {
                        int var44 = 0;
                        if (var4.field1386.field2031 != null) {
                            var44 = var4.field1386.field2031.length;
                        }
                        var43 = new short[var44];
                        for (int var45 = 0; var45 < var44; var45++) {
                            var43[var45] = (short) arg1.method8979();
                        }
                    }
                    boolean var46 = false;
                    if ((var34 & 0x10) != 0) {
                        var46 = arg1.method9191() == 1;
                    }
                    long var47 = (long) (++class106.field1389 - 1);
                    var4.method2787(new class194(var47, var35, var40, var43, var46));
                }
            }
            if ((var5 & 0x4) != 0) {
                arg1.method9119();
                arg1.method9032();
            }
            if ((var5 & 0x40000) != 0) {
                int var49 = arg1.method9024();
                for (int var50 = 0; var50 < var49; var50++) {
                    int var51 = arg1.method9059();
                    int var52 = arg1.method9145();
                    int var53 = arg1.method9110();
                    var4.method2516(var51, var52, var53 >> 16, var53 & 0xFFFF);
                }
            }
            if ((var5 & 0x80) != 0) {
                int var54 = arg1.method9059();
                if (var54 > 0) {
                    for (int var55 = 0; var55 < var54; var55++) {
                        int var56 = -1;
                        int var57 = -1;
                        int var58 = -1;
                        int var59 = arg1.method8989();
                        if (var59 == 32767) {
                            var59 = arg1.method8989();
                            var57 = arg1.method8989();
                            var56 = arg1.method8989();
                            var58 = arg1.method8989();
                        } else if (var59 == 32766) {
                            var59 = -1;
                        } else {
                            var57 = arg1.method8989();
                        }
                        int var60 = arg1.method8989();
                        var4.method2514(var59, var57, var56, var58, field609, var60);
                    }
                }
                int var61 = arg1.method9024();
                if (var61 > 0) {
                    for (int var62 = 0; var62 < var61; var62++) {
                        int var63 = arg1.method8989();
                        int var64 = arg1.method8989();
                        if (var64 == 32767) {
                            var4.method2515(var63);
                        } else {
                            int var65 = arg1.method8989();
                            int var66 = arg1.method8955();
                            int var67 = var64 > 0 ? arg1.method9024() : var66;
                            var4.method2520(var63, field609, var64, var65, var66, var67);
                        }
                    }
                }
            }
            if ((var5 & 0x1000) != 0) {
                var4.field1258 = arg1.method9011();
                var4.field1249 = arg1.method8993();
                var4.field1277 = arg1.method8975();
                var4.field1232 = arg1.method9010();
                var4.field1247 = arg1.method9015() + field609;
                var4.field1234 = arg1.method9015() + field609;
                var4.field1292 = arg1.method9119();
                var4.field1294 = 1;
                var4.field1299 = 0;
                var4.field1258 += var4.field1295[0];
                var4.field1249 += var4.field1296[0];
                var4.field1277 += var4.field1295[0];
                var4.field1232 += var4.field1296[0];
            }
        }
    }

    @ObfuscatedName("tx.lg(Lea;I)V")
    public static void method8385(class106 arg0) {
        arg0.field1228 = arg0.field1386.field2010;
        arg0.field1293 = arg0.field1386.field2040;
        arg0.field1272 = arg0.field1386.field2015;
        arg0.field1279 = arg0.field1386.field2017;
        arg0.field1235 = arg0.field1386.field2018;
        arg0.field1236 = arg0.field1386.field2019;
        arg0.field1230 = arg0.field1386.field2007;
        arg0.field1231 = arg0.field1386.field2014;
        arg0.field1246 = arg0.field1386.field2004;
        arg0.field1278 = arg0.field1386.field2013;
        arg0.field1238 = arg0.field1386.field2016;
        arg0.field1239 = arg0.field1386.field2022;
        arg0.field1281 = arg0.field1386.field2030;
        arg0.field1287 = arg0.field1386.field2024;
        arg0.field1241 = arg0.field1386.field2052;
        arg0.field1242 = arg0.field1386.field2021;
        arg0.field1244 = arg0.field1386.field2027;
    }

    @ObfuscatedName("gz.lf(III)Lks;")
    public static class275 method3384(int arg0, int arg1) {
        field816.field3025 = arg0;
        field816.field3023 = arg1;
        field816.field3026 = 1;
        field816.field3024 = 1;
        return field816;
    }

    @ObfuscatedName("hk.lh(I)V")
    public static void method3551() {
        field666.field5551 = 0;
        field813 = false;
        field666.field5555[0] = -1;
        field666.field5556[0] = class382.field4305;
        field666.field5557[0] = "";
        field666.field5565[0] = 1006;
        field666.field5559[0] = false;
        field666.field5549[0] = null;
        field666.field5551 = 1;
    }

    @ObfuscatedName("ej.lo(IIB)V")
    public static final void method3061(int arg0, int arg1) {
        if (field666.field5551 < 2 && field674 == 0 && !field768 || !field669) {
            return;
        }
        int var2 = method8840();
        String var3;
        if (field674 == 1 && field666.field5551 < 2) {
            var3 = class382.field4281 + class382.field4313 + field675 + " " + class107.field1397;
        } else if (field768 && field666.field5551 < 2) {
            var3 = field679 + class382.field4313 + field707 + " " + class107.field1397;
        } else {
            var3 = field666.method9584(var2);
        }
        if (field666.field5551 > 2) {
            var3 = var3 + class107.method74(16777215) + " " + '/' + " " + (field666.field5551 - 2) + class382.field4187;
        }
        Statics.field160.method7672(var3, arg0 + 4, arg1 + 15, 16777215, 0, field609 / 1000);
    }

    @ObfuscatedName("ms.li(I)Z")
    public static final boolean method5849() {
        return field813;
    }

    @ObfuscatedName("bm.lt(IIIIB)V")
    public static final void method452(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field700; var4++) {
            if (field736[var4] + field734[var4] > arg0 && field734[var4] < arg0 + arg2 && field751[var4] + field737[var4] > arg1 && field751[var4] < arg1 + arg3) {
                field732[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.lj(I)V")
    public final void method1234() {
        class570 var1 = field666;
        boolean var2 = false;
        while (!var2) {
            var2 = true;
            for (int var3 = 0; var3 < var1.field5551 - 1; var3++) {
                if (var1.field5565[var3] < 1000 && var1.field5565[var3 + 1] > 1000) {
                    String var4 = var1.field5557[var3];
                    var1.field5557[var3] = var1.field5557[var3 + 1];
                    var1.field5557[var3 + 1] = var4;
                    String var5 = var1.field5556[var3];
                    var1.field5556[var3] = var1.field5556[var3 + 1];
                    var1.field5556[var3 + 1] = var5;
                    class570 var6 = var1.field5549[var3];
                    var1.field5549[var3] = var1.field5549[var3 + 1];
                    var1.field5549[var3 + 1] = var6;
                    int var7 = var1.field5565[var3];
                    var1.field5565[var3] = var1.field5565[var3 + 1];
                    var1.field5565[var3 + 1] = var7;
                    int var8 = var1.field5550[var3];
                    var1.field5550[var3] = var1.field5550[var3 + 1];
                    var1.field5550[var3 + 1] = var8;
                    int var9 = var1.field5552[var3];
                    var1.field5552[var3] = var1.field5552[var3 + 1];
                    var1.field5552[var3 + 1] = var9;
                    int var10 = var1.field5553[var3];
                    var1.field5553[var3] = var1.field5553[var3 + 1];
                    var1.field5553[var3 + 1] = var10;
                    int var11 = var1.field5558[var3];
                    var1.field5558[var3] = var1.field5558[var3 + 1];
                    var1.field5558[var3 + 1] = var11;
                    int var12 = var1.field5555[var3];
                    var1.field5555[var3] = var1.field5555[var3 + 1];
                    var1.field5555[var3 + 1] = var12;
                    boolean var13 = var1.field5559[var3];
                    var1.field5559[var3] = var1.field5559[var3 + 1];
                    var1.field5559[var3 + 1] = var13;
                    var2 = false;
                }
            }
        }
        if (field693 != null) {
            return;
        }
        int var14 = class36.field216;
        if (field813) {
            if (var14 != 1 && (Statics.field1474 || var14 != 4) && !field666.method9607(class36.field217, class36.field210)) {
                field813 = false;
                field666.method9574();
            }
            if (var14 == 1 || !Statics.field1474 && var14 == 4) {
                field666.method9572(class36.field209, class36.field207);
                field813 = false;
                field666.method9574();
            }
        } else if (field666.field5551 > 0) {
            int var15 = method8840();
            if ((var14 == 1 || !Statics.field1474 && var14 == 4) && this.method1235(field666.field5565[var15], field666.field5559[var15])) {
                var14 = 2;
            }
            if (var14 == 1 || !Statics.field1474 && var14 == 4) {
                field666.method9570(var15);
            }
            if (var14 == 2) {
                this.method1230(class36.field209, class36.field207);
            }
        }
    }

    @ObfuscatedName("client.lk(IZI)Z")
    public final boolean method1235(int arg0, boolean arg1) {
        boolean var3 = field587 && field666.field5551 > 2;
        if (!var3) {
            int var4 = arg0;
            if (arg0 >= 2000) {
                var4 = arg0 - 2000;
            }
            boolean var5 = var4 == 1007;
            var3 = var5;
        }
        return var3 && !arg1;
    }

    @ObfuscatedName("client.mu(III)V")
    public final void method1230(int arg0, int arg1) {
        field666.method9567(arg0, arg1);
        int var3 = arg0 - field794;
        int var4 = arg1 - field795;
        Statics.field1342.field1372.method4553(Statics.field1342.field1356, var3, var4, false);
        for (int var5 = 0; var5 < Statics.field1342.field1366; var5++) {
            class480 var6 = Statics.field1342.field1365[Statics.field1342.field1364[var5]];
            if (var6 != null) {
                var6.field5008.field1372.method4553(var6.field5008.field1356, var3, var4, false);
            }
        }
        field813 = true;
        field666.method9586();
    }

    @ObfuscatedName("qt.mo(IIIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method7191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, String arg7, int arg8, int arg9) {
        class104 var10 = null;
        if (arg5 >= 0 && Statics.field1342.field1365[arg5] != null) {
            var10 = Statics.field1342.field1365[arg5].field5008;
        } else if (arg5 == -1) {
            var10 = Statics.field1342;
        }
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1350;
        int var12 = var10.field1357;
        class106[] var13 = var10.field1362;
        class95[] var14 = var10.field1369;
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 30 && field686 == null) {
            method8779(arg1, arg0);
            field686 = Statics.field2371.method6130(arg1, arg0);
            method2361(field686);
        }
        if (arg2 == 29) {
            class326 var15 = class326.method3199(class324.field3326, field582.field1486);
            var15.field3426.method8960(arg1);
            field582.method2943(var15);
            class363 var16 = Statics.field2371.method6131(arg1);
            if (var16 != null && var16.field3980 != null && var16.field3980[0][0] == 5) {
                int var17 = var16.field3980[0][1];
                if (class351.field3752[var17] != var16.field3982[0]) {
                    class351.field3752[var17] = var16.field3982[0];
                    Statics.method3283(var17);
                }
            }
        }
        if (arg2 == 14) {
            class95 var18 = var14[arg3];
            if (var18 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var19 = class326.method3199(class324.field3351, field582.field1486);
                var19.field3426.method9198(Statics.field3220);
                var19.field3426.method9005(field664.method5077(82) ? 1 : 0);
                var19.field3426.method9198(Statics.field112);
                var19.field3426.method9173(arg3);
                var19.field3426.method8960(Statics.field1114);
                field582.method2943(var19);
            }
        }
        if (arg2 == 21) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var20 = class326.method3199(class324.field3393, field582.field1486);
            var20.field3426.method9069(field664.method5077(82) ? 1 : 0);
            var20.field3426.method9173(arg0 + var11);
            var20.field3426.method9173(arg1 + var12);
            var20.field3426.method9173(arg3);
            field582.method2943(var20);
        }
        if (arg2 == 45) {
            class95 var21 = var14[arg3];
            if (var21 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var22 = class326.method3199(class324.field3389, field582.field1486);
                var22.field3426.method9198(arg3);
                var22.field3426.method9069(field664.method5077(82) ? 1 : 0);
                field582.method2943(var22);
            }
        }
        if (arg2 == 51) {
            class95 var23 = var14[arg3];
            if (var23 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var24 = class326.method3199(class324.field3341, field582.field1486);
                var24.field3426.method9022(field664.method5077(82) ? 1 : 0);
                var24.field3426.method8958(arg3);
                field582.method2943(var24);
            }
        }
        if (arg2 == 1) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var25 = class326.method3199(class324.field3323, field582.field1486);
            var25.field3426.method8958(arg0 + var11);
            var25.field3426.method9027(Statics.field1114);
            var25.field3426.method8958(Statics.field112);
            var25.field3426.method9073(field664.method5077(82) ? 1 : 0);
            var25.field3426.method9012(Statics.field3220);
            var25.field3426.method8958(arg3);
            var25.field3426.method9173(arg1 + var12);
            field582.method2943(var25);
        }
        if (arg2 == 23) {
            if (field813) {
                Statics.field1342.field1372.method4571();
            } else {
                Statics.field1342.field1372.method4553(Statics.field1342.field1356, arg0, arg1, true);
            }
            for (int var26 = 0; var26 < Statics.field1342.field1366; var26++) {
                class480 var27 = Statics.field1342.field1365[Statics.field1342.field1364[var26]];
                if (var27 != null) {
                    if (field813) {
                        var27.field5008.field1372.method4571();
                    } else {
                        var27.field5008.field1372.method4553(var27.field5008.field1356, arg0, arg1, true);
                    }
                }
            }
        }
        if (arg2 == 3) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var28 = class326.method3199(class324.field3406, field582.field1486);
            var28.field3426.method9173(arg0 + var11);
            var28.field3426.method8958(arg3);
            var28.field3426.method8958(arg1 + var12);
            var28.field3426.method9005(field664.method5077(82) ? 1 : 0);
            field582.method2943(var28);
        }
        if (arg2 == 18) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var29 = class326.method3199(class324.field3398, field582.field1486);
            var29.field3426.method9173(arg0 + var11);
            var29.field3426.method9012(arg1 + var12);
            var29.field3426.method9198(arg3);
            var29.field3426.method9005(field664.method5077(82) ? 1 : 0);
            field582.method2943(var29);
        }
        if (arg2 == 44) {
            class95 var30 = var14[arg3];
            if (var30 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var31 = class326.method3199(class324.field3364, field582.field1486);
                var31.field3426.method9012(arg3);
                var31.field3426.method9022(field664.method5077(82) ? 1 : 0);
                field582.method2943(var31);
            }
        }
        if (arg2 == 22) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var32 = class326.method3199(class324.field3338, field582.field1486);
            var32.field3426.method8958(arg3);
            var32.field3426.method8958(arg0 + var11);
            var32.field3426.method9198(arg1 + var12);
            var32.field3426.method9005(field664.method5077(82) ? 1 : 0);
            field582.method2943(var32);
        }
        if (arg2 == 24) {
            class363 var33 = Statics.field2371.method6131(arg1);
            if (var33 != null) {
                boolean var34 = true;
                if (var33.field3955 > 0) {
                    var34 = method3169(var33);
                }
                if (var34) {
                    class326 var35 = class326.method3199(class324.field3326, field582.field1486);
                    var35.field3426.method8960(arg1);
                    field582.method2943(var35);
                }
            }
        }
        if (arg2 == 16) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var36 = class326.method3199(class324.field3313, field582.field1486);
            var36.field3426.method9022(field664.method5077(82) ? 1 : 0);
            var36.field3426.method9198(arg1 + var12);
            var36.field3426.method8958(arg3);
            var36.field3426.method8958(Statics.field112);
            var36.field3426.method9173(arg0 + var11);
            var36.field3426.method9027(Statics.field1114);
            var36.field3426.method8958(Statics.field3220);
            field582.method2943(var36);
        }
        if (arg2 == 20) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var37 = class326.method3199(class324.field3324, field582.field1486);
            var37.field3426.method9073(field664.method5077(82) ? 1 : 0);
            var37.field3426.method8958(arg3);
            var37.field3426.method9173(arg0 + var11);
            var37.field3426.method9198(arg1 + var12);
            field582.method2943(var37);
        }
        if (arg2 == 1001) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var38 = class326.method3199(class324.field3312, field582.field1486);
            var38.field3426.method9173(arg1 + var12);
            var38.field3426.method9022(field664.method5077(82) ? 1 : 0);
            var38.field3426.method9012(arg0 + var11);
            var38.field3426.method9173(arg3);
            field582.method2943(var38);
        }
        if (arg2 == 13) {
            class106 var39 = var13[arg3];
            if (var39 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var40 = class326.method3199(class324.field3329, field582.field1486);
                var40.field3426.method9173(arg3);
                var40.field3426.method9069(field664.method5077(82) ? 1 : 0);
                field582.method2943(var40);
            }
        }
        if (arg2 == 25) {
            class363 var41 = Statics.field2371.method6130(arg1, arg0);
            if (var41 != null) {
                method3140();
                method2874(arg1, arg0, Statics.method8637(method5697(var41)), arg4);
                field674 = 0;
                field679 = method3047(var41);
                if (field679 == null) {
                    field679 = class382.field4298;
                }
                if (var41.field3851) {
                    field707 = var41.field3946 + class107.method74(16777215);
                } else {
                    field707 = class107.method74(65280) + var41.field3984 + class107.method74(16777215);
                }
            }
            return;
        }
        if (arg2 == 1002) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            class326 var42 = class326.method3199(class324.field3407, field582.field1486);
            var42.field3426.method8958(arg3);
            field582.method2943(var42);
        }
        if (arg2 == 48) {
            class95 var43 = var14[arg3];
            if (var43 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var44 = class326.method3199(class324.field3356, field582.field1486);
                var44.field3426.method9022(field664.method5077(82) ? 1 : 0);
                var44.field3426.method9012(arg3);
                field582.method2943(var44);
            }
        }
        if (arg2 == 46) {
            class95 var45 = var14[arg3];
            if (var45 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var46 = class326.method3199(class324.field3403, field582.field1486);
                var46.field3426.method9069(field664.method5077(82) ? 1 : 0);
                var46.field3426.method9173(arg3);
                field582.method2943(var46);
            }
        }
        if (arg2 == 9) {
            class106 var47 = var13[arg3];
            if (var47 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var48 = class326.method3199(class324.field3352, field582.field1486);
                var48.field3426.method9198(arg3);
                var48.field3426.method9073(field664.method5077(82) ? 1 : 0);
                field582.method2943(var48);
            }
        }
        if (arg2 == 19) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var49 = class326.method3199(class324.field3385, field582.field1486);
            var49.field3426.method9012(arg3);
            var49.field3426.method9012(arg1 + var12);
            var49.field3426.method9012(arg0 + var11);
            var49.field3426.method9073(field664.method5077(82) ? 1 : 0);
            field582.method2943(var49);
        }
        if (arg2 == 58) {
            class363 var50 = Statics.field2371.method6130(arg1, arg0);
            if (var50 != null) {
                if (var50.field3983 != null) {
                    class91 var51 = new class91();
                    var51.field1112 = var50;
                    var51.field1103 = arg3;
                    var51.field1108 = arg7;
                    var51.field1111 = var50.field3983;
                    Statics.method4025(var51);
                }
                class326 var52 = class326.method3199(class324.field3345, field582.field1486);
                var52.field3426.method9198(arg0);
                var52.field3426.method9013(Statics.field225);
                var52.field3426.method9198(arg4);
                var52.field3426.method9198(field677);
                var52.field3426.method9012(field678);
                var52.field3426.method9029(arg1);
                field582.method2943(var52);
            }
        }
        if (arg2 == 10) {
            class106 var53 = var13[arg3];
            if (var53 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var54 = class326.method3199(class324.field3391, field582.field1486);
                var54.field3426.method9022(field664.method5077(82) ? 1 : 0);
                var54.field3426.method9012(arg3);
                field582.method2943(var54);
            }
        }
        if (arg2 == 17) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var55 = class326.method3199(class324.field3360, field582.field1486);
            var55.field3426.method9022(field664.method5077(82) ? 1 : 0);
            var55.field3426.method9173(arg3);
            var55.field3426.method9029(Statics.field225);
            var55.field3426.method9012(field678);
            var55.field3426.method9012(arg0 + var11);
            var55.field3426.method9198(field677);
            var55.field3426.method9198(arg1 + var12);
            field582.method2943(var55);
        }
        if (arg2 == 47) {
            class95 var56 = var14[arg3];
            if (var56 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var57 = class326.method3199(class324.field3396, field582.field1486);
                var57.field3426.method8958(arg3);
                var57.field3426.method9005(field664.method5077(82) ? 1 : 0);
                field582.method2943(var57);
            }
        }
        if (arg2 == 50) {
            class95 var58 = var14[arg3];
            if (var58 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var59 = class326.method3199(class324.field3318, field582.field1486);
                var59.field3426.method9022(field664.method5077(82) ? 1 : 0);
                var59.field3426.method9198(arg3);
                field582.method2943(var59);
            }
        }
        if (arg2 == 15) {
            class95 var60 = var14[arg3];
            if (var60 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var61 = class326.method3199(class324.field3374, field582.field1486);
                var61.field3426.method9027(Statics.field225);
                var61.field3426.method9173(field677);
                var61.field3426.method9173(arg3);
                var61.field3426.method9198(field678);
                var61.field3426.method9069(field664.method5077(82) ? 1 : 0);
                field582.method2943(var61);
            }
        }
        if (arg2 == 12) {
            class106 var62 = var13[arg3];
            if (var62 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var63 = class326.method3199(class324.field3328, field582.field1486);
                var63.field3426.method9022(field664.method5077(82) ? 1 : 0);
                var63.field3426.method8958(arg3);
                field582.method2943(var63);
            }
        }
        if (arg2 == 1003) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            class106 var64 = var13[arg3];
            if (var64 != null) {
                class195 var65 = var64.field1386;
                if (var65.field2041 != null) {
                    var65 = var65.method3603();
                }
                if (var65 != null) {
                    class326 var66 = class326.method3199(class324.field3325, field582.field1486);
                    var66.field3426.method9012(var65.field2008);
                    field582.method2943(var66);
                }
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1518.method8436(arg2, arg3, new class352(arg0), new class352(arg1));
        }
        if (arg2 == 8) {
            class106 var67 = var13[arg3];
            if (var67 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var68 = class326.method3199(class324.field3347, field582.field1486);
                var68.field3426.method9012(arg3);
                var68.field3426.method9198(field678);
                var68.field3426.method9027(Statics.field225);
                var68.field3426.method9012(field677);
                var68.field3426.method9073(field664.method5077(82) ? 1 : 0);
                field582.method2943(var68);
            }
        }
        if (arg2 == 1004) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            class326 var69 = class326.method3199(class324.field3327, field582.field1486);
            var69.field3426.method8958(arg1 + var12);
            var69.field3426.method9173(arg0 + var11);
            var69.field3426.method9012(arg3);
            field582.method2943(var69);
        }
        if (arg2 == 5) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var70 = class326.method3199(class324.field3392, field582.field1486);
            var70.field3426.method8958(arg1 + var12);
            var70.field3426.method9012(arg3);
            var70.field3426.method9005(field664.method5077(82) ? 1 : 0);
            var70.field3426.method9173(arg0 + var11);
            field582.method2943(var70);
        }
        if (arg2 == 11) {
            class106 var71 = var13[arg3];
            if (var71 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var72 = class326.method3199(class324.field3355, field582.field1486);
                var72.field3426.method9073(field664.method5077(82) ? 1 : 0);
                var72.field3426.method9198(arg3);
                field582.method2943(var72);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class363 var73 = Statics.field2371.method6130(arg1, arg0);
            if (var73 != null) {
                method4084(arg3, arg1, arg0, arg4, arg7);
            }
        }
        if (arg2 == 2) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var74 = class326.method3199(class324.field3370, field582.field1486);
            var74.field3426.method9069(field664.method5077(82) ? 1 : 0);
            var74.field3426.method9198(arg3);
            var74.field3426.method8958(field678);
            var74.field3426.method9012(arg1 + var12);
            var74.field3426.method9012(arg0 + var11);
            var74.field3426.method9027(Statics.field225);
            var74.field3426.method9012(field677);
            field582.method2943(var74);
        }
        if (arg2 == 26) {
            method2594();
        }
        if (arg2 == 28) {
            class326 var75 = class326.method3199(class324.field3326, field582.field1486);
            var75.field3426.method8960(arg1);
            field582.method2943(var75);
            class363 var76 = Statics.field2371.method6131(arg1);
            if (var76 != null && var76.field3980 != null && var76.field3980[0][0] == 5) {
                int var77 = var76.field3980[0][1];
                class351.field3752[var77] = 1 - class351.field3752[var77];
                Statics.method3283(var77);
            }
        }
        if (arg2 == 4) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var78 = class326.method3199(class324.field3315, field582.field1486);
            var78.field3426.method8958(arg1 + var12);
            var78.field3426.method9173(arg3);
            var78.field3426.method9073(field664.method5077(82) ? 1 : 0);
            var78.field3426.method9012(arg0 + var11);
            field582.method2943(var78);
        }
        if (arg2 == 7) {
            class106 var79 = var13[arg3];
            if (var79 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var80 = class326.method3199(class324.field3373, field582.field1486);
                var80.field3426.method9198(Statics.field3220);
                var80.field3426.method9029(Statics.field1114);
                var80.field3426.method9198(arg3);
                var80.field3426.method9022(field664.method5077(82) ? 1 : 0);
                var80.field3426.method9173(Statics.field112);
                field582.method2943(var80);
            }
        }
        if (arg2 == 6) {
            field638 = arg8;
            field639 = arg9;
            field641 = 2;
            field799 = 0;
            field758 = arg0;
            field690 = arg1;
            class326 var81 = class326.method3199(class324.field3349, field582.field1486);
            var81.field3426.method8958(arg1 + var12);
            var81.field3426.method9012(arg0 + var11);
            var81.field3426.method9073(field664.method5077(82) ? 1 : 0);
            var81.field3426.method9173(arg3);
            field582.method2943(var81);
        }
        if (arg2 == 49) {
            class95 var82 = var14[arg3];
            if (var82 != null) {
                field638 = arg8;
                field639 = arg9;
                field641 = 2;
                field799 = 0;
                field758 = arg0;
                field690 = arg1;
                class326 var83 = class326.method3199(class324.field3332, field582.field1486);
                var83.field3426.method9198(arg3);
                var83.field3426.method9069(field664.method5077(82) ? 1 : 0);
                field582.method2943(var83);
            }
        }
        if (field674 != 0) {
            field674 = 0;
            method2361(Statics.field2371.method6131(Statics.field1114));
        }
        if (field768) {
            method3140();
        }
    }

    @ObfuscatedName("eu.md(IIIIB)V")
    public static void method2874(int arg0, int arg1, int arg2, int arg3) {
        class363 var4 = Statics.field2371.method6130(arg0, arg1);
        if (var4 != null && var4.field3953 != null) {
            class91 var5 = new class91();
            var5.field1112 = var4;
            var5.field1111 = var4.field3953;
            Statics.method4025(var5);
        }
        field678 = arg3;
        field768 = true;
        Statics.field225 = arg0;
        field677 = arg1;
        Statics.field3299 = arg2;
        method2361(var4);
    }

    @ObfuscatedName("fb.ml(S)V")
    public static void method3140() {
        if (!field768) {
            return;
        }
        class363 var0 = Statics.field2371.method6130(Statics.field225, field677);
        if (var0 != null && var0.field3904 != null) {
            class91 var1 = new class91();
            var1.field1112 = var0;
            var1.field1111 = var0.field3904;
            Statics.method4025(var1);
        }
        field678 = -1;
        field768 = false;
        method2361(var0);
    }

    @ObfuscatedName("ul.mc(III)V")
    public static void method8779(int arg0, int arg1) {
        class326 var2 = class326.method3199(class324.field3401, field582.field1486);
        var2.field3426.method9198(arg1);
        var2.field3426.method9029(arg0);
        field582.method2943(var2);
    }

    @ObfuscatedName("ip.mb(IIIILjava/lang/String;I)V")
    public static void method4084(int arg0, int arg1, int arg2, int arg3, String arg4) {
        int var5 = arg0 >>> 16;
        int var6 = arg0 & 0xFFFF;
        class363 var7 = Statics.field2371.method6130(arg1, arg2);
        if (var7 == null) {
            return;
        }
        if (var7.field3962 != null) {
            class91 var8 = new class91();
            var8.field1112 = var7;
            var8.field1103 = var6;
            var8.field1104 = var5;
            var8.field1108 = arg4;
            var8.field1111 = var7.field3962;
            Statics.method4025(var8);
        }
        boolean var9 = true;
        if (var7.field3955 > 0) {
            var9 = method3169(var7);
        }
        if (!var9) {
            return;
        }
        int var10 = method5697(var7);
        int var11 = var6 - 1;
        boolean var12 = (var10 >> var11 + 1 & 0x1) != 0;
        if (!var12) {
            return;
        }
        if (arg0 == 1) {
            class326 var13 = class326.method3199(class324.field3363, field582.field1486);
            var13.field3426.method8960(arg1);
            var13.field3426.method8958(arg2);
            var13.field3426.method8958(arg3);
            field582.method2943(var13);
        }
        if (arg0 == 2) {
            class326 var14 = class326.method3199(class324.field3362, field582.field1486);
            var14.field3426.method8960(arg1);
            var14.field3426.method8958(arg2);
            var14.field3426.method8958(arg3);
            field582.method2943(var14);
        }
        if (arg0 == 3) {
            class326 var15 = class326.method3199(class324.field3310, field582.field1486);
            var15.field3426.method8960(arg1);
            var15.field3426.method8958(arg2);
            var15.field3426.method8958(arg3);
            field582.method2943(var15);
        }
        if (arg0 == 4) {
            class326 var16 = class326.method3199(class324.field3319, field582.field1486);
            var16.field3426.method8960(arg1);
            var16.field3426.method8958(arg2);
            var16.field3426.method8958(arg3);
            field582.method2943(var16);
        }
        if (arg0 == 5) {
            class326 var17 = class326.method3199(class324.field3311, field582.field1486);
            var17.field3426.method8960(arg1);
            var17.field3426.method8958(arg2);
            var17.field3426.method8958(arg3);
            field582.method2943(var17);
        }
        if (arg0 == 6) {
            class326 var18 = class326.method3199(class324.field3371, field582.field1486);
            var18.field3426.method8960(arg1);
            var18.field3426.method8958(arg2);
            var18.field3426.method8958(arg3);
            field582.method2943(var18);
        }
        if (arg0 == 7) {
            class326 var19 = class326.method3199(class324.field3387, field582.field1486);
            var19.field3426.method8960(arg1);
            var19.field3426.method8958(arg2);
            var19.field3426.method8958(arg3);
            field582.method2943(var19);
        }
        if (arg0 == 8) {
            class326 var20 = class326.method3199(class324.field3331, field582.field1486);
            var20.field3426.method8960(arg1);
            var20.field3426.method8958(arg2);
            var20.field3426.method8958(arg3);
            field582.method2943(var20);
        }
        if (arg0 == 9) {
            class326 var21 = class326.method3199(class324.field3381, field582.field1486);
            var21.field3426.method8960(arg1);
            var21.field3426.method8958(arg2);
            var21.field3426.method8958(arg3);
            field582.method2943(var21);
        }
        if (arg0 == 10) {
            class326 var22 = class326.method3199(class324.field3359, field582.field1486);
            var22.field3426.method8960(arg1);
            var22.field3426.method8958(arg2);
            var22.field3426.method8958(arg3);
            field582.method2943(var22);
        }
        if (var5 == 0) {
            return;
        }
        class326 var23 = class326.method3199(class324.field3344, field582.field1486);
        var23.field3426.method8960(arg1);
        var23.field3426.method8958(arg2);
        var23.field3426.method8958(arg3);
        var23.field3426.method9022(var6);
        var23.field3426.method9022(var5 - 1);
        field582.method2943(var23);
    }

    @ObfuscatedName("jx.mg(Ljava/lang/String;Ljava/lang/String;IIIIB)I")
    public static final int method4789(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        return method847(arg0, arg1, arg2, arg3, arg4, arg5, -1, false, -1);
    }

    @ObfuscatedName("bo.mp(Ljava/lang/String;Ljava/lang/String;IIIIIZII)I")
    public static final int method847(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (field813) {
            return -1;
        }
        int var9 = arg2;
        if (arg2 >= 2000) {
            var9 = arg2 - 2000;
        }
        boolean var10 = Statics.field1305 == arg8 || arg8 == -1;
        if (!var10) {
            boolean var11 = var9 == 2 || var9 == 8 || var9 == 25 || var9 == 17 || var9 == 25;
            var10 = var11;
        }
        boolean var12 = var10 || class89.method8838(var9);
        if (!var12) {
            boolean var13 = var9 == 1002 || var9 == 1003 || var9 == 1004;
            var12 = var13;
        }
        return var12 ? field666.method9576(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) : -1;
    }

    @ObfuscatedName("ux.mn(B)I")
    public static final int method8840() {
        return field666.field5551 - 1;
    }

    @ObfuscatedName("kx.mr(IIIII)V")
    public static final void method5140(int arg0, int arg1, int arg2, int arg3) {
        if (field674 == 0 && !field768) {
            method4789(class382.field4308, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        int var6 = 0;
        long var7 = -1L;
        for (int var9 = 0; var9 < class257.method167(); var9++) {
            long var10 = class257.field2881[var9];
            if (var7 != var10) {
                var7 = var10;
                int var14 = class257.method3198(class257.field2881[var9]);
                int var15 = var14;
                int var16 = class257.method3024(class257.field2881[var9]);
                int var17 = var16;
                int var18 = class257.method5148(var9);
                int var19 = class257.method4010(class257.field2881[var9]);
                int var20 = var19;
                int var21 = class257.method3756(var9);
                if (var21 == 2047) {
                    var21 = -1;
                }
                class480 var22 = null;
                class104 var23 = null;
                if (var21 >= 0 && Statics.field1342.field1365[var21] != null) {
                    var22 = Statics.field1342.field1365[var21];
                    var23 = var22.field5008;
                } else if (var21 == -1) {
                    var22 = null;
                    var23 = Statics.field1342;
                }
                if (var23 != null) {
                    int var24 = -1;
                    if (Statics.field1305 == var21) {
                        var24 = var23.field1356;
                    } else if (Statics.field1305 == -1) {
                        var24 = var22.field5007;
                    } else {
                        class480 var25 = Statics.field1342.field1365[Statics.field1305];
                        class104 var26 = var25.field5008;
                        if (var25.field5007 == var26.field1356) {
                            if (var21 == -1) {
                                var24 = Statics.field1342.field1365[Statics.field1305].method1202();
                            } else {
                                var24 = var22.field5007;
                            }
                        }
                    }
                    int var28 = var24;
                    if (var24 != -1) {
                        if (var18 == 2 && var23.field1372.method4677(var24, var14, var16, var10) >= 0) {
                            class210 var29 = class210.method5152(var19);
                            if (var29.field2212 != null) {
                                var29 = var29.method3800();
                            }
                            if (var29 == null) {
                                continue;
                            }
                            class99 var30 = null;
                            for (class99 var31 = (class99) var23.field1353.method7029(); var31 != null; var31 = (class99) var23.field1353.method7031()) {
                                if (var31.field1209 == var28 && var31.field1208 == var15 && var31.field1223 == var17 && var31.field1216 == var20) {
                                    var30 = var31;
                                    break;
                                }
                            }
                            if (!Statics.field942 && field674 == 1) {
                                method847(class382.field4281, field675 + " " + class107.field1397 + " " + class107.method74(65535) + var29.field2186, 1, var20, var15, var17, -1, false, var21);
                            } else if (!field768) {
                                String[] var32 = var29.field2198;
                                if (var32 != null) {
                                    for (int var33 = 4; var33 >= 0; var33--) {
                                        if (!Statics.field942 && (var30 == null || var30.method2507(var33)) && var32[var33] != null) {
                                            short var34 = 0;
                                            if (var33 == 0) {
                                                var34 = 3;
                                            }
                                            if (var33 == 1) {
                                                var34 = 4;
                                            }
                                            if (var33 == 2) {
                                                var34 = 5;
                                            }
                                            if (var33 == 3) {
                                                var34 = 6;
                                            }
                                            if (var33 == 4) {
                                                var34 = 1001;
                                            }
                                            method847(var32[var33], class107.method74(65535) + var29.field2186, var34, var20, var15, var17, -1, false, var21);
                                        }
                                    }
                                }
                                method847(class382.field4273, class107.method74(65535) + var29.field2186, 1002, var29.field2178, var15, var17, -1, false, var21);
                            } else if (!Statics.field942 && (Statics.field3299 & 0x4) == 4) {
                                method847(field679, field707 + " " + class107.field1397 + " " + class107.method74(65535) + var29.field2186, 2, var20, var15, var17, -1, false, var21);
                            }
                        }
                        if (var18 == 1) {
                            class106 var35 = var23.field1362[var20];
                            if (var35 == null) {
                                continue;
                            }
                            if (var35.field1386.field2010 == 1 && (var35.field1300 & 0x7F) == 64 && (var35.field1225 & 0x7F) == 64) {
                                for (int var36 = 0; var36 < var23.field1367; var36++) {
                                    class106 var37 = var23.field1362[var23.field1351[var36]];
                                    if (var37 != null && var35 != var37 && var37.field1386.field2010 == 1 && var35.field1300 == var37.field1300 && var35.field1225 == var37.field1225) {
                                        method305(var37, var23.field1351[var36], var15, var17, var21);
                                    }
                                }
                                int var38 = field718.field1438;
                                int[] var39 = field718.field1436;
                                for (int var40 = 0; var40 < var38; var40++) {
                                    class95 var41 = var23.field1369[var39[var40]];
                                    if (var41 != null && var35.field1300 == var41.field1300 && var35.field1225 == var41.field1225) {
                                        method5190(var41, var39[var40], var15, var17, var21);
                                    }
                                }
                            }
                            method305(var35, var20, var15, var17, var21);
                        }
                        if (var18 == 0) {
                            class95 var42 = var23.field1369[var20];
                            if (var42 == null) {
                                continue;
                            }
                            if ((var42.field1300 & 0x7F) == 64 && (var42.field1225 & 0x7F) == 64) {
                                for (int var43 = 0; var43 < var23.field1367; var43++) {
                                    class106 var44 = var23.field1362[var23.field1351[var43]];
                                    if (var44 != null && var44.field1386.field2010 == 1 && var42.field1300 == var44.field1300 && var42.field1225 == var44.field1225) {
                                        method305(var44, var23.field1351[var43], var15, var17, var21);
                                    }
                                }
                                int var45 = field718.field1438;
                                int[] var46 = field718.field1436;
                                for (int var47 = 0; var47 < var45; var47++) {
                                    class95 var48 = var23.field1369[var46[var47]];
                                    if (var48 != null && var42 != var48 && var42.field1300 == var48.field1300 && var42.field1225 == var48.field1225) {
                                        method5190(var48, var46[var47], var15, var17, var21);
                                    }
                                }
                            }
                            if (field784 == var20) {
                                var4 = var10;
                                var6 = var21;
                            } else {
                                method5190(var42, var20, var15, var17, var21);
                            }
                        }
                        if (var18 == 3) {
                            class410 var49 = var23.field1368[var28][var15][var17];
                            if (var49 != null) {
                                for (class110 var50 = (class110) var49.method7028(); var50 != null; var50 = (class110) var49.method7032()) {
                                    class211 var51 = class211.method2414(var50.field1416);
                                    if (!Statics.field894 && field674 == 1) {
                                        method847(class382.field4281, field675 + " " + class107.field1397 + " " + class107.method74(16748608) + var51.field2225, 16, var50.field1416, var15, var17, -1, false, var21);
                                    } else if (!field768) {
                                        String[] var52 = var51.field2253;
                                        for (int var53 = 4; var53 >= 0; var53--) {
                                            if (!Statics.field894 && var50.method2821(var53)) {
                                                if (var52 != null && var52[var53] != null) {
                                                    byte var54 = 0;
                                                    if (var53 == 0) {
                                                        var54 = 18;
                                                    }
                                                    if (var53 == 1) {
                                                        var54 = 19;
                                                    }
                                                    if (var53 == 2) {
                                                        var54 = 20;
                                                    }
                                                    if (var53 == 3) {
                                                        var54 = 21;
                                                    }
                                                    if (var53 == 4) {
                                                        var54 = 22;
                                                    }
                                                    method847(var52[var53], class107.method74(16748608) + var51.field2225, var54, var50.field1416, var15, var17, -1, false, var21);
                                                } else if (var53 == 2) {
                                                    method847(class382.field4399, class107.method74(16748608) + var51.field2225, 20, var50.field1416, var15, var17, -1, false, var21);
                                                }
                                            }
                                        }
                                        method847(class382.field4273, class107.method74(16748608) + var51.field2225, 1004, var50.field1416, var15, var17, -1, false, var21);
                                    } else if (!Statics.field894 && (Statics.field3299 & 0x1) == 1) {
                                        method847(field679, field707 + " " + class107.field1397 + " " + class107.method74(16748608) + var51.field2225, 17, var50.field1416, var15, var17, -1, false, var21);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var55 = class257.method3198(var4);
            int var56 = class257.method3024(var4);
            class95 var57 = Statics.field1342.field1369[field784];
            method5190(var57, field784, var55, var56, var6);
        }
    }

    @ObfuscatedName("av.mz(Lea;IIIIB)V")
    public static final void method305(class106 arg0, int arg1, int arg2, int arg3, int arg4) {
        class195 var5 = arg0.field1386;
        if (field666.field5551 >= 400) {
            return;
        }
        if (var5.field2041 != null) {
            var5 = var5.method3603();
        }
        if (var5 == null || !var5.field2047 || var5.field2046 && field570 != arg1) {
            return;
        }
        String var6 = arg0.method2739();
        if (var5.field2034 != 0 && arg0.field1240 != 0) {
            int var7 = arg0.field1240 == -1 ? var5.field2034 : arg0.field1240;
            var6 = var6 + method5149(var7, Statics.field4826.field1148) + " " + class107.field1396 + class382.field4357 + var7 + class107.field1394;
        }
        if (var5.field2003 && field535) {
            method847(class382.field4273, class107.method74(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
        }
        if (!Statics.field2391 && field674 == 1) {
            method847(class382.field4281, field675 + " " + class107.field1397 + " " + class107.method74(16776960) + var6, 7, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field768) {
            int var8 = var5.field2003 && field535 ? 2000 : 0;
            String[] var9 = var5.field2032;
            if (var9 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (!Statics.field2391 && arg0.method2738(var10) && var9[var10] != null && !var9[var10].equalsIgnoreCase(class382.field4390)) {
                        int var11 = 0;
                        if (var10 == 0) {
                            var11 = var8 + 9;
                        }
                        if (var10 == 1) {
                            var11 = var8 + 10;
                        }
                        if (var10 == 2) {
                            var11 = var8 + 11;
                        }
                        if (var10 == 3) {
                            var11 = var8 + 12;
                        }
                        if (var10 == 4) {
                            var11 = var8 + 13;
                        }
                        method847(var9[var10], class107.method74(16776960) + var6, var11, arg1, arg2, arg3, -1, false, arg4);
                    }
                }
            }
            if (var9 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (!Statics.field2391 && arg0.method2738(var12) && var9[var12] != null && var9[var12].equalsIgnoreCase(class382.field4390)) {
                        short var13 = 0;
                        if (field549 != class109.field1410) {
                            if (field549 == class109.field1407 || field549 == class109.field1411 && var5.field2034 > Statics.field4826.field1148) {
                                var13 = 2000;
                            }
                            int var14 = 0;
                            if (var12 == 0) {
                                var14 = var13 + 9;
                            }
                            if (var12 == 1) {
                                var14 = var13 + 10;
                            }
                            if (var12 == 2) {
                                var14 = var13 + 11;
                            }
                            if (var12 == 3) {
                                var14 = var13 + 12;
                            }
                            if (var12 == 4) {
                                var14 = var13 + 13;
                            }
                            method847(var9[var12], class107.method74(16776960) + var6, var14, arg1, arg2, arg3, -1, false, arg4);
                        }
                    }
                }
            }
            if (!var5.field2003 || !field535) {
                method847(class382.field4273, class107.method74(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
            }
        } else if (!Statics.field2391 && (Statics.field3299 & 0x2) == 2) {
            method847(field679, field707 + " " + class107.field1397 + " " + class107.method74(16776960) + var6, 8, arg1, arg2, arg3, -1, false, arg4);
        }
    }

    @ObfuscatedName("kt.mx(Ldi;IIIII)V")
    public static final void method5190(class95 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field652 == arg0.field1143 || field666.field5551 >= 400) {
            return;
        }
        String var5;
        if (arg0.field1149 == 0) {
            var5 = arg0.field1147[0] + arg0.field1168 + arg0.field1147[1] + method5149(arg0.field1148, Statics.field4826.field1148) + " " + class107.field1396 + class382.field4357 + arg0.field1148 + class107.field1394 + arg0.field1147[2];
        } else {
            var5 = arg0.field1147[0] + arg0.field1168 + arg0.field1147[1] + " " + class107.field1396 + class382.field4310 + arg0.field1149 + class107.field1394 + arg0.field1147[2];
        }
        if (field674 == 1) {
            method847(class382.field4281, field675 + " " + class107.field1397 + " " + class107.method74(16777215) + var5, 14, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field768) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (field656[var6] != null) {
                    short var7 = 0;
                    if (field656[var6].equalsIgnoreCase(class382.field4390)) {
                        if (field548 == class109.field1410) {
                            continue;
                        }
                        if (field548 == class109.field1407 || field548 == class109.field1411 && arg0.field1148 > Statics.field4826.field1148) {
                            var7 = 2000;
                        }
                        if (Statics.field4826.field1162 == 0 || arg0.field1162 == 0) {
                            if (field548 == class109.field1409 && arg0.method2438()) {
                                var7 = 2000;
                            }
                        } else if (Statics.field4826.field1162 == arg0.field1162) {
                            var7 = 2000;
                        } else {
                            var7 = 0;
                        }
                    } else if (field657[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    int var9 = field655[var6] + var7;
                    method847(field656[var6], class107.method74(16777215) + var5, var9, arg1, arg2, arg3, -1, false, arg4);
                }
            }
        } else if ((Statics.field3299 & 0x8) == 8) {
            method847(field679, field707 + " " + class107.field1397 + " " + class107.method74(16777215) + var5, 15, arg1, arg2, arg3, -1, false, arg4);
        }
        for (int var10 = 0; var10 < field666.field5551; var10++) {
            if (field666.field5565[var10] == 23) {
                field666.field5557[var10] = class107.method74(16777215) + var5;
                break;
            }
        }
    }

    @ObfuscatedName("ka.mq(III)Ljava/lang/String;")
    public static final String method5149(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class107.method74(16711680);
        } else if (var2 < -6) {
            return class107.method74(16723968);
        } else if (var2 < -3) {
            return class107.method74(16740352);
        } else if (var2 < 0) {
            return class107.method74(16756736);
        } else if (var2 > 9) {
            return class107.method74(65280);
        } else if (var2 > 6) {
            return class107.method74(4259584);
        } else if (var2 > 3) {
            return class107.method74(8453888);
        } else if (var2 > 0) {
            return class107.method74(12648192);
        } else {
            return class107.method74(16776960);
        }
    }

    @ObfuscatedName("dj.mj(IIIIIIIII)V")
    public static final void method2398(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field2371.method6146(arg0)) {
            Statics.field3303 = null;
            method2865(Statics.field2371.field3764[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3303 != null) {
                method2865(Statics.field3303, -1412584499, arg1, arg2, arg3, arg4, Statics.field1681, Statics.field4450, arg7);
                Statics.field3303 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field731[var8] = true;
            }
        } else {
            field731[arg7] = true;
        }
    }

    @ObfuscatedName("eh.mk([Lny;IIIIIIIII)V")
    public static final void method2865(class363[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class561.method9294(arg2, arg3, arg4, arg5);
        class240.method4386();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class363 var10 = arg0[var9];
            if (var10 != null && (var10.field3872 == arg1 || arg1 == -1412584499 && field693 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field734[field700] = var10.field3866 + arg6;
                    field751[field700] = var10.field3863 + arg7;
                    field736[field700] = var10.field3868;
                    field737[field700] = var10.field3869;
                    var11 = ++field700 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3999 = var11;
                var10.field4000 = field609;
                if (!var10.field3851 || !method3415(var10)) {
                    if (var10.field3955 > 0) {
                        method4748(var10);
                    }
                    int var12 = var10.field3866 + arg6;
                    int var13 = var10.field3863 + arg7;
                    int var14 = var10.field3884;
                    if (field693 == var10) {
                        if (arg1 != -1412584499 && !var10.field3923) {
                            Statics.field3303 = arg0;
                            Statics.field1681 = arg6;
                            Statics.field4450 = arg7;
                            continue;
                        }
                        if (field659 && field698) {
                            int var15 = class36.field217;
                            int var16 = class36.field210;
                            int var17 = var15 - field695;
                            int var18 = var16 - field696;
                            if (var17 < field577) {
                                var17 = field577;
                            }
                            if (var10.field3868 + var17 > field577 + field694.field3868) {
                                var17 = field577 + field694.field3868 - var10.field3868;
                            }
                            if (var18 < field685) {
                                var18 = field685;
                            }
                            if (var10.field3869 + var18 > field685 + field694.field3869) {
                                var18 = field685 + field694.field3869 - var10.field3869;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3923) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3855 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3868 + var12;
                        int var22 = var10.field3869 + var13;
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
                        int var29 = var10.field3868 + var12;
                        int var30 = var10.field3869 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3851 || var25 < var27 && var26 < var28) {
                        if (var10.field3955 != 0) {
                            if (var10.field3955 == 1336) {
                                if (Statics.field4929.method2619()) {
                                    var13 += 15;
                                    Statics.field1534.method7731("Fps:" + field172, var10.field3868 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field520) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1534.method7731("Mem:" + var32 + "k", var10.field3868 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3955 == 1337) {
                                field670 = var12;
                                field671 = var13;
                                method6938(var12, var13, var10.field3868, var10.field3869);
                                field731[var10.field3999] = true;
                                class561.method9294(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3955 == 1338) {
                                Statics.method2369(var10, var12, var13, var11);
                                class561.method9294(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3955 == 1339) {
                                method1944(var10, var12, var13, var11);
                                class561.method9294(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3955 == 1400) {
                                Statics.field1518.method8609(var12, var13, var10.field3868, var10.field3869, field609, Statics.field4929.method2705());
                            }
                            if (var10.field3955 == 1401) {
                                Statics.field1518.method8531(var12, var13, var10.field3868, var10.field3869);
                            }
                            if (var10.field3955 == 1402) {
                                Statics.field2977.method2561(var12, field609);
                            }
                        }
                        if (var10.field3855 == 0) {
                            if (!var10.field3851 && method3415(var10) && Statics.field3036 != var10) {
                                continue;
                            }
                            if (!var10.field3851) {
                                if (var10.field3875 > var10.field3877 - var10.field3869) {
                                    var10.field3875 = var10.field3877 - var10.field3869;
                                }
                                if (var10.field3875 < 0) {
                                    var10.field3875 = 0;
                                }
                            }
                            method2865(arg0, var10.field3852, var25, var26, var27, var28, var12 - var10.field3874, var13 - var10.field3875, var11);
                            if (var10.field3951 != null) {
                                method2865(var10.field3951, var10.field3852, var25, var26, var27, var28, var12 - var10.field3874, var13 - var10.field3875, var11);
                            }
                            class90 var34 = (class90) field682.method8688((long) var10.field3852);
                            if (var34 != null) {
                                method2398(var34.field1095, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class561.method9294(arg2, arg3, arg4, arg5);
                            class240.method4386();
                        } else if (var10.field3855 == 11) {
                            if (method3415(var10) && Statics.field3036 != var10) {
                                continue;
                            }
                            if (var10.field3951 != null) {
                                method2865(var10.field3951, var10.field3852, var25, var26, var27, var28, var12 - var10.field3874, var13 - var10.field3875, var11);
                            }
                            class561.method9294(arg2, arg3, arg4, arg5);
                            class240.method4386();
                        }
                        if (field527 || field733[var11] || field738 > 1) {
                            if (var10.field3855 == 0 && !var10.field3851 && var10.field3877 > var10.field3869) {
                                method8830(var10.field3868 + var12, var13, var10.field3875, var10.field3869, var10.field3877);
                            }
                            if (var10.field3855 != 1) {
                                if (var10.field3855 == 3) {
                                    int var35;
                                    if (method2963(var10)) {
                                        var35 = var10.field3879;
                                        if (Statics.field3036 == var10 && var10.field3881 != 0) {
                                            var35 = var10.field3881;
                                        }
                                    } else {
                                        var35 = var10.field3997;
                                        if (Statics.field3036 == var10 && var10.field3880 != 0) {
                                            var35 = var10.field3880;
                                        }
                                    }
                                    if (var10.field3882) {
                                        switch(var10.field3883.field5498) {
                                            case 1:
                                                class561.method9303(var12, var13, var10.field3868, var10.field3869, var10.field3997, var10.field3879);
                                                break;
                                            case 2:
                                                class561.method9304(var12, var13, var10.field3868, var10.field3869, var10.field3997, var10.field3879, 255 - (var10.field3884 & 0xFF), 255 - (var10.field3885 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class561.method9302(var12, var13, var10.field3868, var10.field3869, var35);
                                                } else {
                                                    class561.method9301(var12, var13, var10.field3868, var10.field3869, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class561.method9306(var12, var13, var10.field3868, var10.field3869, var35);
                                    } else {
                                        class561.method9307(var12, var13, var10.field3868, var10.field3869, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3855 == 4) {
                                    class435 var36 = var10.method6559(Statics.field2371);
                                    if (var36 != null) {
                                        String var37 = var10.field3947;
                                        int var38;
                                        if (method2963(var10)) {
                                            var38 = var10.field3879;
                                            if (Statics.field3036 == var10 && var10.field3881 != 0) {
                                                var38 = var10.field3881;
                                            }
                                            if (var10.field3894.length() > 0) {
                                                var37 = var10.field3894;
                                            }
                                        } else {
                                            var38 = var10.field3997;
                                            if (Statics.field3036 == var10 && var10.field3880 != 0) {
                                                var38 = var10.field3880;
                                            }
                                        }
                                        if (var10.field3851 && var10.field3960 != -1) {
                                            class211 var39 = class211.method2414(var10.field3960);
                                            var37 = var39.field2225;
                                            if (var37 == null) {
                                                var37 = class382.field4298;
                                            }
                                            if ((var39.field2247 == 1 || var10.field3989 != 1) && var10.field3989 != -1) {
                                                var37 = class107.method74(16748608) + var37 + class107.field1395 + " " + 'x' + method424(var10.field3989);
                                            }
                                        }
                                        if (field686 == var10) {
                                            var37 = class382.field4311;
                                            var38 = var10.field3997;
                                        }
                                        if (!var10.field3851) {
                                            var37 = method6166(var37, var10);
                                        }
                                        var36.method7680(var37, var12, var13, var10.field3868, var10.field3869, var38, var10.field3921 ? 0 : -1, class502.method8343(var10.field3884), var10.field3919, var10.field3920, var10.field3918);
                                    } else if (class363.field3988) {
                                        method2361(var10);
                                    }
                                } else if (var10.field3855 == 5) {
                                    if (var10.field3851) {
                                        class565 var41;
                                        if (var10.field3960 == -1) {
                                            var41 = var10.method6529(Statics.field2371, false, Statics.field71);
                                        } else {
                                            var41 = class211.method11(var10.field3960, var10.field3989, var10.field3893, var10.field3994, var10.field3914, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5514;
                                            int var43 = var41.field5515;
                                            if (var10.field3892) {
                                                class561.method9295(var12, var13, var10.field3868 + var12, var10.field3869 + var13);
                                                int var44 = (var10.field3868 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3869 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3891 != 0) {
                                                            var41.method9449(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3891, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method9410(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method9441(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class561.method9294(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3868 * 4096 / var42;
                                                if (var10.field3891 != 0) {
                                                    var41.method9449(var10.field3868 / 2 + var12, var10.field3869 / 2 + var13, var10.field3891, var48);
                                                } else if (var14 != 0) {
                                                    var41.method9430(var12, var13, var10.field3868, var10.field3869, 256 - (var14 & 0xFF));
                                                } else if (var10.field3868 == var42 && var10.field3869 == var43) {
                                                    var41.method9410(var12, var13);
                                                } else {
                                                    var41.method9455(var12, var13, var10.field3868, var10.field3869);
                                                }
                                            }
                                        } else if (class363.field3988) {
                                            method2361(var10);
                                        }
                                    } else {
                                        class565 var40 = var10.method6529(Statics.field2371, method2963(var10), Statics.field71);
                                        if (var40 != null) {
                                            var40.method9410(var12, var13);
                                        } else if (class363.field3988) {
                                            method2361(var10);
                                        }
                                    }
                                } else if (var10.field3855 == 6) {
                                    boolean var49 = method2963(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3856;
                                    } else {
                                        var50 = var10.field3901;
                                    }
                                    class256 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3960 != -1) {
                                        class211 var53 = class211.method2414(var10.field3960);
                                        if (var53 != null) {
                                            class211 var54 = var53.method3853(var10.field3989);
                                            var51 = var54.method3905(1);
                                            if (var51 == null) {
                                                method2361(var10);
                                            } else {
                                                var51.method4814();
                                                var52 = var51.field2736 / 2;
                                            }
                                        }
                                    } else if (var10.field3897 == 5) {
                                        if (var10.field3898 == 0) {
                                            var51 = field790.method6177((class213) null, -1, (class213) null, -1);
                                        } else {
                                            var51 = Statics.field4826.method2182();
                                        }
                                    } else if (var10.field3897 == 7) {
                                        var51 = var10.field3911.method6177((class213) null, -1, class213.method2555(Statics.field4826.field1230), Statics.field4826.field1266);
                                    } else {
                                        class195 var55 = null;
                                        class194 var56 = null;
                                        if (var10.field3897 == 6) {
                                            int var57 = var10.field3898;
                                            if (var57 >= 0 && var57 < Statics.field1342.field1362.length) {
                                                class106 var58 = Statics.field1342.field1362[var57];
                                                if (var58 != null && var58.field1386 != null) {
                                                    var55 = var58.field1386;
                                                    if (var55.field2041 != null) {
                                                        var55 = var55.method3603();
                                                    }
                                                    var56 = var58.method2792();
                                                }
                                            }
                                        } else if (var10.field3897 == 2) {
                                            int var59 = var10.field3898;
                                            var55 = class195.method3383(var59);
                                            if (var55.field2041 != null) {
                                                var55 = var55.method3603();
                                            }
                                        }
                                        class213 var60 = null;
                                        int var61 = -1;
                                        if (var50 != -1) {
                                            var60 = class213.method2555(var50);
                                            var61 = var10.field3873;
                                        }
                                        var51 = var10.method6535(Statics.field2371, var60, var61, var49, Statics.field4826.field1170, var55, var56);
                                        if (var51 == null && class363.field3988) {
                                            method2361(var10);
                                        }
                                    }
                                    class240.method4345(var10.field3868 / 2 + var12, var10.field3869 / 2 + var13);
                                    int var62 = var10.field3908 * class240.field2590[var10.field3916] >> 16;
                                    int var63 = var10.field3908 * class240.field2588[var10.field3916] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3851) {
                                            var51.method4814();
                                            if (var10.field3954) {
                                                var51.method4925(0, var10.field3915, var10.field3907, var10.field3916, var10.field3903, var10.field3992 + var52 + var62, var10.field3992 + var63, var10.field3908);
                                            } else {
                                                var51.method4830(0, var10.field3915, var10.field3907, var10.field3916, var10.field3903, var10.field3992 + var52 + var62, var10.field3992 + var63);
                                            }
                                        } else {
                                            var51.method4830(0, var10.field3915, 0, var10.field3916, 0, var62, var63);
                                        }
                                    }
                                    class240.method4344();
                                } else {
                                    if (var10.field3855 == 8 && Statics.field23 == var10 && field767 == field673) {
                                        int var64 = 0;
                                        int var65 = 0;
                                        class435 var66 = Statics.field1534;
                                        String var67 = var10.field3947;
                                        String var68 = method6166(var67, var10);
                                        while (var68.length() > 0) {
                                            int var69 = var68.indexOf(class107.field1399);
                                            String var70;
                                            if (var69 == -1) {
                                                var70 = var68;
                                                var68 = "";
                                            } else {
                                                var70 = var68.substring(0, var69);
                                                var68 = var68.substring(var69 + 4);
                                            }
                                            int var71 = var66.method7656(var70);
                                            if (var71 > var64) {
                                                var64 = var71;
                                            }
                                            var65 += var66.field4804 + 1;
                                        }
                                        var64 += 6;
                                        var65 += 7;
                                        int var72 = var10.field3868 + var12 - 5 - var64;
                                        int var73 = var10.field3869 + var13 + 5;
                                        if (var72 < var12 + 5) {
                                            var72 = var12 + 5;
                                        }
                                        if (var64 + var72 > arg4) {
                                            var72 = arg4 - var64;
                                        }
                                        if (var65 + var73 > arg5) {
                                            var73 = arg5 - var65;
                                        }
                                        class561.method9302(var72, var73, var64, var65, 16777120);
                                        class561.method9306(var72, var73, var64, var65, 0);
                                        String var74 = var10.field3947;
                                        int var75 = var66.field4804 + var73 + 2;
                                        String var76 = method6166(var74, var10);
                                        while (var76.length() > 0) {
                                            int var77 = var76.indexOf(class107.field1399);
                                            String var78;
                                            if (var77 == -1) {
                                                var78 = var76;
                                                var76 = "";
                                            } else {
                                                var78 = var76.substring(0, var77);
                                                var76 = var76.substring(var77 + 4);
                                            }
                                            var66.method7662(var78, var72 + 3, var75, 0, -1);
                                            var75 += var66.field4804 + 1;
                                        }
                                    }
                                    if (var10.field3855 == 9) {
                                        int var79;
                                        int var80;
                                        int var81;
                                        int var82;
                                        if (var10.field3887) {
                                            var79 = var12;
                                            var80 = var10.field3869 + var13;
                                            var81 = var10.field3868 + var12;
                                            var82 = var13;
                                        } else {
                                            var79 = var12;
                                            var80 = var13;
                                            var81 = var10.field3868 + var12;
                                            var82 = var10.field3869 + var13;
                                        }
                                        if (var10.field3886 == 1) {
                                            class561.method9363(var79, var80, var81, var82, var10.field3997);
                                        } else {
                                            method6668(var79, var80, var81, var82, var10.field3997, var10.field3886);
                                        }
                                    } else if (var10.field3855 == 12) {
                                        class361 var83 = var10.method6558();
                                        class355 var84 = var10.method6593();
                                        if (var83 != null && var84 != null && var83.method6299()) {
                                            class435 var85 = var10.method6559(Statics.field2371);
                                            if (var85 != null) {
                                                field723.method9555(var12, var13, var10.field3868, var10.field3869, var83.method6300(), var83.method6246(), var83.method6297(), var83.method6377(), var83.method6296());
                                                int var86 = var10.field3921 ? var10.field3994 : -1;
                                                if (!var83.method6294() && var83.method6338().method7513()) {
                                                    field723.method9556(var84.field3773, var86, var84.field3775, var84.field3772);
                                                    field723.method9557(var83.method6292(), var85);
                                                } else {
                                                    field723.method9556(var10.field3997, var86, var84.field3775, var84.field3772);
                                                    field723.method9557(var83.method6338(), var85);
                                                }
                                                class561.method9294(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("nz.me(IIIIIIB)V")
    public static final void method6668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class561.field5486;
        int var18 = arg1 - class561.field5482;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class240.method4346(var19, var20, var21);
        class240.method4348(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class240.method4346(var19, var21, var22);
        class240.method4348(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("nu.mf(Ljava/lang/String;Lny;B)Ljava/lang/String;")
    public static String method6166(String arg0, class363 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2640(arg1, var2 - 1);
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

    @ObfuscatedName("bd.mi(II)Ljava/lang/String;")
    public static final String method424(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class107.field1393 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class107.method74(65408) + var1.substring(0, var1.length() - 8) + class382.field4314 + " " + class107.field1396 + var1 + class107.field1394 + class107.field1395;
        } else if (var1.length() > 6) {
            return " " + class107.method74(16777215) + var1.substring(0, var1.length() - 4) + class382.field4316 + " " + class107.field1396 + var1 + class107.field1394 + class107.field1395;
        } else {
            return " " + class107.method74(16776960) + var1 + class107.field1395;
        }
    }

    @ObfuscatedName("client.ma(ZI)V")
    public final void method1237(boolean arg0) {
        method366(field681, Statics.field1721, Statics.field1500, arg0);
    }

    @ObfuscatedName("client.mw(Lny;I)V")
    public void method1238(class363 arg0) {
        class363 var2 = arg0.field3872 == -1 ? null : Statics.field2371.method6131(arg0.field3872);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1721;
            var4 = Statics.field1500;
        } else {
            var3 = var2.field3868;
            var4 = var2.field3869;
        }
        method2258(arg0, var3, var4, false);
        method3421(arg0, var3, var4);
    }

    @ObfuscatedName("ao.mv([Lny;Lny;ZI)V")
    public static void method265(class363[] arg0, class363 arg1, boolean arg2) {
        int var3 = arg1.field3876 == 0 ? arg1.field3868 : arg1.field3876;
        int var4 = arg1.field3877 == 0 ? arg1.field3869 : arg1.field3877;
        method6715(arg0, arg1.field3852, var3, var4, arg2);
        if (arg1.field3951 != null) {
            method6715(arg1.field3951, arg1.field3852, var3, var4, arg2);
        }
        class90 var5 = (class90) field682.method8688((long) arg1.field3852);
        if (var5 != null) {
            method366(var5.field1095, var3, var4, arg2);
        }
        if (arg1.field3955 == 1337) {
        }
    }

    @ObfuscatedName("ak.mm(IIIZI)V")
    public static final void method366(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.field2371.method6146(arg0)) {
            method6715(Statics.field2371.field3764[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("oz.ms([Lny;IIIZI)V")
    public static void method6715(class363[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class363 var6 = arg0[var5];
            if (var6 != null && var6.field3872 == arg1) {
                method2258(var6, arg2, arg3, arg4);
                method3421(var6, arg2, arg3);
                if (var6.field3874 > var6.field3876 - var6.field3868) {
                    var6.field3874 = var6.field3876 - var6.field3868;
                }
                if (var6.field3874 < 0) {
                    var6.field3874 = 0;
                }
                if (var6.field3875 > var6.field3877 - var6.field3869) {
                    var6.field3875 = var6.field3877 - var6.field3869;
                }
                if (var6.field3875 < 0) {
                    var6.field3875 = 0;
                }
                if (var6.field3855 == 0) {
                    method265(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("df.my(Lny;IIZB)V")
    public static void method2258(class363 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3868;
        int var5 = arg0.field3869;
        if (arg0.field3860 == 0) {
            arg0.field3868 = arg0.field3850;
        } else if (arg0.field3860 == 1) {
            arg0.field3868 = arg1 - arg0.field3850;
        } else if (arg0.field3860 == 2) {
            arg0.field3868 = arg0.field3850 * arg1 >> 14;
        }
        if (arg0.field3861 == 0) {
            arg0.field3869 = arg0.field3965;
        } else if (arg0.field3861 == 1) {
            arg0.field3869 = arg2 - arg0.field3965;
        } else if (arg0.field3861 == 2) {
            arg0.field3869 = arg0.field3965 * arg2 >> 14;
        }
        if (arg0.field3860 == 4) {
            arg0.field3868 = arg0.field3870 * arg0.field3869 / arg0.field3871;
        }
        if (arg0.field3861 == 4) {
            arg0.field3869 = arg0.field3871 * arg0.field3868 / arg0.field3870;
        }
        if (arg0.field3955 == 1337) {
            field580 = arg0;
        }
        if (arg0.field3855 == 12) {
            arg0.method6558().method6248(arg0.field3868, arg0.field3869);
        }
        if (arg3 && arg0.field3895 != null && (arg0.field3868 != var4 || arg0.field3869 != var5)) {
            class91 var6 = new class91();
            var6.field1112 = arg0;
            var6.field1111 = arg0.field3895;
            field724.method7051(var6);
        }
    }

    @ObfuscatedName("gi.mt(Lny;III)V")
    public static void method3421(class363 arg0, int arg1, int arg2) {
        if (arg0.field3858 == 0) {
            arg0.field3866 = arg0.field3862;
        } else if (arg0.field3858 == 1) {
            arg0.field3866 = (arg1 - arg0.field3868) / 2 + arg0.field3862;
        } else if (arg0.field3858 == 2) {
            arg0.field3866 = arg1 - arg0.field3868 - arg0.field3862;
        } else if (arg0.field3858 == 3) {
            arg0.field3866 = arg0.field3862 * arg1 >> 14;
        } else if (arg0.field3858 == 4) {
            arg0.field3866 = (arg0.field3862 * arg1 >> 14) + (arg1 - arg0.field3868) / 2;
        } else {
            arg0.field3866 = arg1 - arg0.field3868 - (arg0.field3862 * arg1 >> 14);
        }
        if (arg0.field3859 == 0) {
            arg0.field3863 = arg0.field3844;
        } else if (arg0.field3859 == 1) {
            arg0.field3863 = (arg2 - arg0.field3869) / 2 + arg0.field3844;
        } else if (arg0.field3859 == 2) {
            arg0.field3863 = arg2 - arg0.field3869 - arg0.field3844;
        } else if (arg0.field3859 == 3) {
            arg0.field3863 = arg0.field3844 * arg2 >> 14;
        } else if (arg0.field3859 == 4) {
            arg0.field3863 = (arg0.field3844 * arg2 >> 14) + (arg2 - arg0.field3869) / 2;
        } else {
            arg0.field3863 = arg2 - arg0.field3869 - (arg0.field3844 * arg2 >> 14);
        }
    }

    @ObfuscatedName("mf.nt(Lny;IIIIIIB)V")
    public static final void method5765(class363 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field588) {
            field552 = 32;
        } else {
            field552 = 0;
        }
        field588 = false;
        if (class36.field219 == 1 || !Statics.field1474 && class36.field219 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3875 -= 4;
                method2361(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3875 += 4;
                method2361(arg0);
            } else if (arg5 >= arg1 - field552 && arg5 < field552 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3875 = (arg4 - arg3) * var8 / var9;
                method2361(arg0);
                field588 = true;
            }
        }
        if (field722 == 0) {
            return;
        }
        int var10 = arg0.field3868;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3875 += field722 * 45;
            method2361(arg0);
        }
    }

    @ObfuscatedName("ux.nc(IIIIIB)V")
    public static final void method8830(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2395[0].method9387(arg0, arg1);
        Statics.field2395[1].method9387(arg0, arg1 + arg3 - 16);
        class561.method9302(arg0, arg1 + 16, 16, arg3 - 32, field600);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class561.method9302(arg0, arg1 + 16 + var6, 16, var5, field601);
        class561.method9310(arg0, arg1 + 16 + var6, var5, field603);
        class561.method9310(arg0 + 1, arg1 + 16 + var6, var5, field603);
        class561.method9374(arg0, arg1 + 16 + var6, 16, field603);
        class561.method9374(arg0, arg1 + 17 + var6, 16, field603);
        class561.method9310(arg0 + 15, arg1 + 16 + var6, var5, field602);
        class561.method9310(arg0 + 14, arg1 + 17 + var6, var5 - 1, field602);
        class561.method9374(arg0, arg1 + 15 + var6 + var5, 16, field602);
        class561.method9374(arg0 + 1, arg1 + 14 + var6 + var5, 15, field602);
    }

    @ObfuscatedName("el.ne(Lny;I)Z")
    public static final boolean method2963(class363 arg0) {
        if (arg0.field3981 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3981.length; var1++) {
            int var2 = method2640(arg0, var1);
            int var3 = arg0.field3982[var1];
            if (arg0.field3981[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3981[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3981[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("du.nw(Lny;IB)I")
    public static final int method2640(class363 arg0, int arg1) {
        if (arg0.field3980 == null || arg1 >= arg0.field3980.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3980[arg1];
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
                    var7 = field547[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field661[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field662[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class363 var11 = Statics.field2371.method6131(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class211.method2414(var12).field2252 || field640)) {
                        for (int var13 = 0; var13 < var11.field3986.length; var13++) {
                            if (var12 + 1 == var11.field3986[var13]) {
                                var7 += var11.field3987[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class351.field3752[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class373.field4065[field661[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class351.field3752[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field4826.field1148;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class373.field4064[var14]) {
                            var7 += field661[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class363 var17 = Statics.field2371.method6131(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class211.method2414(var18).field2252 || field640)) {
                        for (int var19 = 0; var19 < var17.field3986.length; var19++) {
                            if (var18 + 1 == var17.field3986[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field687;
                }
                if (var6 == 12) {
                    var7 = field688;
                }
                if (var6 == 13) {
                    int var20 = class351.field3752[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class351.method3259(var22);
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
                    var7 = (Statics.field4826.field1300 >> 7) + Statics.field1342.field1350;
                }
                if (var6 == 19) {
                    var7 = (Statics.field4826.field1225 >> 7) + Statics.field1342.field1357;
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

    @ObfuscatedName("cd.nq(Lny;B)V")
    public static final void method2195(class363 arg0) {
        if (arg0.field4002 == 1) {
            String var1 = arg0.field3900;
            int var2 = arg0.field3852;
            int var3 = arg0.field3960;
            method847(var1, "", 24, 0, 0, var2, var3, false, -1);
        }
        if (arg0.field4002 == 2 && !field768) {
            String var4 = method3047(arg0);
            if (var4 != null) {
                String var5 = class107.method74(65280) + arg0.field3984;
                int var6 = arg0.field3852;
                int var7 = arg0.field3960;
                method847(var4, var5, 25, 0, -1, var6, var7, false, -1);
            }
        }
        if (arg0.field4002 == 3) {
            method4789(class382.field4253, "", 26, 0, 0, arg0.field3852);
        }
        if (arg0.field4002 == 4) {
            method4789(arg0.field3900, "", 28, 0, 0, arg0.field3852);
        }
        if (arg0.field4002 == 5) {
            method4789(arg0.field3900, "", 29, 0, 0, arg0.field3852);
        }
        if (arg0.field4002 == 6 && field686 == null) {
            method4789(arg0.field3900, "", 30, 0, -1, arg0.field3852);
        }
        if (!arg0.field3851) {
            return;
        }
        if (field768) {
            int var8 = method5697(arg0);
            boolean var9 = (var8 >> 21 & 0x1) != 0;
            if (var9 && (Statics.field3299 & 0x20) == 32) {
                String var10 = field679;
                String var11 = field707 + " " + class107.field1397 + " " + arg0.field3946;
                int var12 = arg0.field3991;
                int var13 = arg0.field3852;
                int var14 = arg0.field3960;
                method847(var10, var11, 58, 0, var12, var13, var14, false, -1);
            }
            return;
        }
        for (int var15 = 9; var15 >= 0; var15--) {
            if (arg0.field3969 == var15) {
                String var16 = method3047(arg0);
                if (var16 != null) {
                    String var17 = arg0.field3946;
                    int var18 = arg0.field3991;
                    int var19 = arg0.field3852;
                    int var20 = arg0.field3960;
                    method847(var16, var17, 25, 0, var18, var19, var20, false, -1);
                }
            }
            int var21 = method5697(arg0);
            boolean var22 = (var21 >> var15 + 1 & 0x1) != 0;
            String var23;
            if (!var22 && arg0.field3962 == null) {
                var23 = null;
            } else if (arg0.field3934 == null || arg0.field3934.length <= var15 || arg0.field3934[var15] == null || arg0.field3934[var15].trim().length() == 0) {
                var23 = null;
            } else {
                var23 = arg0.field3934[var15];
            }
            if (var23 != null) {
                short var25;
                int var32;
                if (var15 > arg0.field3969) {
                    var25 = 1007;
                    String var26 = arg0.field3946;
                    int var27 = var15 + 1;
                    int var28 = arg0.field3991;
                    int var29 = arg0.field3852;
                    int var30 = arg0.field3960;
                    int var31 = method847(var23, var26, var25, var27, var28, var29, var30, false, -1);
                    var32 = var31;
                } else {
                    var25 = 57;
                    var32 = method847(var23, arg0.field3946, var25, var15 + 1, arg0.field3991, arg0.field3852, arg0.field3960, arg0.field3924, -1);
                }
                if (arg0.field3899 != null && var15 < arg0.field3899.length && arg0.field3899[var15] != null) {
                    String[] var33 = arg0.field3899[var15];
                    for (int var34 = var33.length - 1; var34 >= 0; var34--) {
                        int var35 = var34 + 1 << 16 | var15 + 1;
                        if (var33[var34] != null && !var33[var34].isEmpty()) {
                            String var36 = var33[var34];
                            int var37 = arg0.field3991;
                            int var38 = arg0.field3852;
                            int var39 = arg0.field3960;
                            if (!field813) {
                                int var40 = var25;
                                if (var25 >= 2000) {
                                    var40 = var25 - 2000;
                                }
                                if (Statics.field1305 != -1) {
                                }
                                boolean var41 = true;
                                if (!var41) {
                                    boolean var42 = var40 == 2 || var40 == 8 || var40 == 25 || var40 == 17 || var40 == 25;
                                    var41 = var42;
                                }
                                boolean var43 = var41 || class89.method8838(var40);
                                if (!var43) {
                                    boolean var44 = var40 == 1002 || var40 == 1003 || var40 == 1004;
                                    var43 = var44;
                                }
                                if (var43 && var32 >= 0 && var32 < field666.field5549.length) {
                                    if (field666.field5549[var32] == null) {
                                        field666.field5549[var32] = new class570(false);
                                    }
                                    field666.field5549[var32].method9576(var36, "", var25, var35, var37, var38, var39, false, -1);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var46 = method5697(arg0);
        boolean var47 = (var46 & 0x1) != 0;
        if (var47) {
            method4789(class382.field4143, "", 30, 0, arg0.field3991, arg0.field3852);
        }
    }

    @ObfuscatedName("gw.nk(ZB)V")
    public static void method3413(boolean arg0) {
        field763 = arg0;
    }

    @ObfuscatedName("fz.nb(I)Z")
    public static boolean method3284() {
        return field763;
    }

    @ObfuscatedName("nt.np(IIIIIIIB)V")
    public static final void method6022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field2371.method6146(arg0)) {
            method6159(Statics.field2371.field3764[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("nx.ns([Lny;IIIIIIII)V")
    public static final void method6159(class363[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class363 var9 = arg0[var8];
            if (var9 != null && var9.field3872 == arg1 && (var9.method6539() || method5697(var9) != 0 || field694 == var9)) {
                if (var9.field3851) {
                    if (method3415(var9)) {
                        continue;
                    }
                } else if (var9.field3855 == 0 && Statics.field3036 != var9 && method3415(var9)) {
                    continue;
                }
                if (var9.field3855 == 11) {
                    if (var9.method6555(Statics.field2371, Statics.field71)) {
                        if (var9.method6547()) {
                            method2361(var9);
                            method265(var9.field3951, var9, true);
                            var9.method6589().method4027().method4136(3, var9.method6589().method4038());
                        }
                        if (var9.field3906 != null) {
                            class91 var10 = new class91();
                            var10.field1112 = var9;
                            var10.field1111 = var9.field3906;
                            field724.method7051(var10);
                        }
                    }
                } else if (var9.field3855 == 12 && var9.method6563(Statics.field2371)) {
                    method2361(var9);
                }
                int var11 = var9.field3866 + arg6;
                int var12 = var9.field3863 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3855 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3868 + var11;
                    int var16 = var9.field3869 + var12;
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
                    int var23 = var9.field3868 + var11;
                    int var24 = var9.field3869 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field693 == var9) {
                    field701 = true;
                    field702 = var11;
                    field703 = var12;
                }
                boolean var25 = false;
                if (var9.field3853) {
                    switch(field683) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3852 >>> 16 == field630) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field630 == var9.field3852) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3851 || var19 < var21 && var20 < var22) {
                    if (var9.field3851) {
                        if (var9.field3936) {
                            if (class36.field217 >= var19 && class36.field210 >= var20 && class36.field217 < var21 && class36.field210 < var22) {
                                for (class91 var26 = (class91) field724.method7029(); var26 != null; var26 = (class91) field724.method7031()) {
                                    if (var26.field1099) {
                                        var26.method8362();
                                        var26.field1112.field3993 = false;
                                    }
                                }
                                method2289();
                                if (Statics.field1660 == 0) {
                                    field693 = null;
                                    field694 = null;
                                }
                                if (!field813) {
                                    method3551();
                                }
                            }
                        } else if (var9.field4003 && class36.field217 >= var19 && class36.field210 >= var20 && class36.field217 < var21 && class36.field210 < var22) {
                            for (class91 var27 = (class91) field724.method7029(); var27 != null; var27 = (class91) field724.method7031()) {
                                if (var27.field1099 && var27.field1112.field3963 == var27.field1111) {
                                    var27.method8362();
                                }
                            }
                        }
                    }
                    int var28 = class36.field217;
                    int var29 = class36.field210;
                    if (class36.field216 != 0) {
                        var28 = class36.field209;
                        var29 = class36.field207;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3955 == 1337) {
                        if (!field574 && !field813 && var30) {
                            method5140(var28, var29, var19, var20);
                        }
                    } else if (var9.field3955 == 1338) {
                        method4131(var9, var11, var12);
                    } else {
                        if (var9.field3955 == 1400) {
                            Statics.field1518.method8432(class36.field217, class36.field210, var30, var11, var12, var9.field3868, var9.field3869);
                        }
                        if (!field813 && var30) {
                            if (var9.field3955 == 1400) {
                                Statics.field1518.method8485(var11, var12, var9.field3868, var9.field3869, var28, var29);
                            } else {
                                method2195(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3929.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3929[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3929[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field4001 != null) {
                                            var35 = field664.method5077(var9.field3929[var31][var34]);
                                        }
                                        if (method3260(var9.field3929[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field4001 != null && var9.field4001[var31] > field609) {
                                                break;
                                            }
                                            byte var36 = var9.field3930[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field664.method5077(86) && !field664.method5077(82) && !field664.method5077(81)) && ((var36 & 0x2) == 0 || field664.method5077(86)) && ((var36 & 0x1) == 0 || field664.method5077(82)) && ((var36 & 0x4) == 0 || field664.method5077(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method4084(var31 + 1, var9.field3852, var9.field3991, var9.field3960, "");
                                    } else if (var31 == 10) {
                                        method3140();
                                        method2874(var9.field3852, var9.field3991, Statics.method8637(method5697(var9)), var9.field3960);
                                        field679 = method3047(var9);
                                        if (field679 == null) {
                                            field679 = class382.field4298;
                                        }
                                        field707 = var9.field3946 + class107.method74(16777215);
                                    }
                                    int var37 = var9.field3932[var31];
                                    if (var9.field4001 == null) {
                                        var9.field4001 = new int[var9.field3929.length];
                                    }
                                    if (var9.field3998 == null) {
                                        var9.field3998 = new int[var9.field3929.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field4001[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field4001[var31] == 0) {
                                        var9.field4001[var31] = field609 + var37 + var9.field3998[var31];
                                    } else {
                                        var9.field4001[var31] = field609 + var37;
                                    }
                                }
                                if (!var32 && var9.field4001 != null) {
                                    var9.field4001[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3851) {
                            boolean var38;
                            if (class36.field217 >= var19 && class36.field210 >= var20 && class36.field217 < var21 && class36.field210 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field219 == 1 || !Statics.field1474 && class36.field219 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field216 == 1 || !Statics.field1474 && class36.field216 == 4) && class36.field209 >= var19 && class36.field207 >= var20 && class36.field209 < var21 && class36.field207 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method1208(var9, class36.field209 - var11, class36.field207 - var12);
                            }
                            if (var9.method6581()) {
                                if (var40) {
                                    field727.method7051(new class269(0, class36.field217 - var11, class36.field210 - var12, var9));
                                }
                                if (var39) {
                                    field727.method7051(new class269(1, class36.field217 - var11, class36.field210 - var12, var9));
                                }
                            }
                            if (var9.field3955 == 1400) {
                                Statics.field1518.method8433(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field693 != null && field693 != var9 && var38 && class364.method276(method5697(var9))) {
                                field804 = var9;
                            }
                            if (field694 == var9) {
                                field698 = true;
                                field577 = var11;
                                field685 = var12;
                            }
                            if (var9.field3942) {
                                if (var38 && field722 != 0 && var9.field3963 != null) {
                                    class91 var41 = new class91();
                                    var41.field1099 = true;
                                    var41.field1112 = var9;
                                    var41.field1109 = field722;
                                    var41.field1111 = var9.field3963;
                                    field724.method7051(var41);
                                }
                                if (field693 != null || field813) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3985 && var40) {
                                    var9.field3985 = true;
                                    if (var9.field3944 != null) {
                                        class91 var42 = new class91();
                                        var42.field1099 = true;
                                        var42.field1112 = var9;
                                        var42.field1101 = class36.field209 - var11;
                                        var42.field1109 = class36.field207 - var12;
                                        var42.field1111 = var9.field3944;
                                        field724.method7051(var42);
                                    }
                                }
                                if (var9.field3985 && var39 && var9.field3945 != null) {
                                    class91 var43 = new class91();
                                    var43.field1099 = true;
                                    var43.field1112 = var9;
                                    var43.field1101 = class36.field217 - var11;
                                    var43.field1109 = class36.field210 - var12;
                                    var43.field1111 = var9.field3945;
                                    field724.method7051(var43);
                                }
                                if (var9.field3985 && !var39) {
                                    var9.field3985 = false;
                                    if (var9.field3933 != null) {
                                        class91 var44 = new class91();
                                        var44.field1099 = true;
                                        var44.field1112 = var9;
                                        var44.field1101 = class36.field217 - var11;
                                        var44.field1109 = class36.field210 - var12;
                                        var44.field1111 = var9.field3933;
                                        field726.method7051(var44);
                                    }
                                }
                                if (var39 && var9.field3977 != null) {
                                    class91 var45 = new class91();
                                    var45.field1099 = true;
                                    var45.field1112 = var9;
                                    var45.field1101 = class36.field217 - var11;
                                    var45.field1109 = class36.field210 - var12;
                                    var45.field1111 = var9.field3977;
                                    field724.method7051(var45);
                                }
                                if (!var9.field3993 && var38) {
                                    var9.field3993 = true;
                                    if (var9.field3948 != null) {
                                        class91 var46 = new class91();
                                        var46.field1099 = true;
                                        var46.field1112 = var9;
                                        var46.field1101 = class36.field217 - var11;
                                        var46.field1109 = class36.field210 - var12;
                                        var46.field1111 = var9.field3948;
                                        field724.method7051(var46);
                                    }
                                }
                                if (var9.field3993 && var38 && var9.field3949 != null) {
                                    class91 var47 = new class91();
                                    var47.field1099 = true;
                                    var47.field1112 = var9;
                                    var47.field1101 = class36.field217 - var11;
                                    var47.field1109 = class36.field210 - var12;
                                    var47.field1111 = var9.field3949;
                                    field724.method7051(var47);
                                }
                                if (var9.field3993 && !var38) {
                                    var9.field3993 = false;
                                    if (var9.field3950 != null) {
                                        class91 var48 = new class91();
                                        var48.field1099 = true;
                                        var48.field1112 = var9;
                                        var48.field1101 = class36.field217 - var11;
                                        var48.field1109 = class36.field210 - var12;
                                        var48.field1111 = var9.field3950;
                                        field726.method7051(var48);
                                    }
                                }
                                if (var9.field3961 != null) {
                                    class91 var49 = new class91();
                                    var49.field1112 = var9;
                                    var49.field1111 = var9.field3961;
                                    field725.method7051(var49);
                                }
                                if (var9.field3958 != null && field586 > var9.field3996) {
                                    if (var9.field3956 == null || field586 - var9.field3996 > 32) {
                                        class91 var54 = new class91();
                                        var54.field1112 = var9;
                                        var54.field1111 = var9.field3958;
                                        field724.method7051(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3996; var50 < field586; var50++) {
                                            int var51 = field653[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3956.length; var52++) {
                                                if (var9.field3956[var52] == var51) {
                                                    class91 var53 = new class91();
                                                    var53.field1112 = var9;
                                                    var53.field1111 = var9.field3958;
                                                    field724.method7051(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3996 = field586;
                                }
                                if (var9.field3957 != null && field762 > var9.field3979) {
                                    if (var9.field3905 == null || field762 - var9.field3979 > 32) {
                                        class91 var59 = new class91();
                                        var59.field1112 = var9;
                                        var59.field1111 = var9.field3957;
                                        field724.method7051(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3979; var55 < field762; var55++) {
                                            int var56 = field708[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3905.length; var57++) {
                                                if (var9.field3905[var57] == var56) {
                                                    class91 var58 = new class91();
                                                    var58.field1112 = var9;
                                                    var58.field1111 = var9.field3957;
                                                    field724.method7051(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3979 = field762;
                                }
                                if (var9.field3959 != null && field711 > var9.field3976) {
                                    if (var9.field3928 == null || field711 - var9.field3976 > 32) {
                                        class91 var64 = new class91();
                                        var64.field1112 = var9;
                                        var64.field1111 = var9.field3959;
                                        field724.method7051(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3976; var60 < field711; var60++) {
                                            int var61 = field817[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3928.length; var62++) {
                                                if (var9.field3928[var62] == var61) {
                                                    class91 var63 = new class91();
                                                    var63.field1112 = var9;
                                                    var63.field1111 = var9.field3959;
                                                    field724.method7051(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3976 = field711;
                                }
                                if (field699 > var9.field3995 && var9.field3867 != null) {
                                    class91 var65 = new class91();
                                    var65.field1112 = var9;
                                    var65.field1111 = var9.field3867;
                                    field724.method7051(var65);
                                }
                                if (field715 > var9.field3995 && var9.field3990 != null) {
                                    class91 var66 = new class91();
                                    var66.field1112 = var9;
                                    var66.field1111 = var9.field3990;
                                    field724.method7051(var66);
                                }
                                if (field716 > var9.field3995 && var9.field3970 != null) {
                                    class91 var67 = new class91();
                                    var67.field1112 = var9;
                                    var67.field1111 = var9.field3970;
                                    field724.method7051(var67);
                                }
                                if (field717 > var9.field3995 && var9.field3971 != null) {
                                    class91 var68 = new class91();
                                    var68.field1112 = var9;
                                    var68.field1111 = var9.field3971;
                                    field724.method7051(var68);
                                }
                                if (field616 > var9.field3995 && var9.field3972 != null) {
                                    class91 var69 = new class91();
                                    var69.field1112 = var9;
                                    var69.field1111 = var9.field3972;
                                    field724.method7051(var69);
                                }
                                if (field719 > var9.field3995 && var9.field3902 != null) {
                                    class91 var70 = new class91();
                                    var70.field1112 = var9;
                                    var70.field1111 = var9.field3902;
                                    field724.method7051(var70);
                                }
                                if (field648 > var9.field3995 && var9.field3964 != null) {
                                    class91 var71 = new class91();
                                    var71.field1112 = var9;
                                    var71.field1111 = var9.field3964;
                                    field724.method7051(var71);
                                }
                                if (field721 > var9.field3995 && var9.field3848 != null) {
                                    class91 var72 = new class91();
                                    var72.field1112 = var9;
                                    var72.field1111 = var9.field3848;
                                    field724.method7051(var72);
                                }
                                var9.field3995 = field710;
                                if (var9.field3966 != null) {
                                    for (int var73 = 0; var73 < field515; var73++) {
                                        class91 var74 = new class91();
                                        var74.field1112 = var9;
                                        var74.field1106 = field753[var73];
                                        var74.field1107 = field534[var73];
                                        var74.field1111 = var9.field3966;
                                        field724.method7051(var74);
                                    }
                                }
                                if (var9.field3967 != null) {
                                    int[] var75 = field664.method5079();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class91 var77 = new class91();
                                        var77.field1112 = var9;
                                        var77.field1106 = var75[var76];
                                        var77.field1111 = var9.field3967;
                                        field724.method7051(var77);
                                    }
                                }
                                if (var9.field3968 != null) {
                                    int[] var78 = field664.method5091();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class91 var80 = new class91();
                                        var80.field1112 = var9;
                                        var80.field1106 = var78[var79];
                                        var80.field1111 = var9.field3968;
                                        field724.method7051(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3851) {
                            if (field693 != null || field813) {
                                continue;
                            }
                            if ((var9.field3952 >= 0 || var9.field3880 != 0) && class36.field217 >= var19 && class36.field210 >= var20 && class36.field217 < var21 && class36.field210 < var22) {
                                if (var9.field3952 >= 0) {
                                    Statics.field3036 = arg0[var9.field3952];
                                } else {
                                    Statics.field3036 = var9;
                                }
                            }
                            if (var9.field3855 == 8 && class36.field217 >= var19 && class36.field210 >= var20 && class36.field217 < var21 && class36.field210 < var22) {
                                Statics.field23 = var9;
                            }
                            if (var9.field3877 > var9.field3869) {
                                method5765(var9, var9.field3868 + var11, var12, var9.field3869, var9.field3877, class36.field217, class36.field210);
                            }
                        }
                        if (var9.field3855 == 0) {
                            method6159(arg0, var9.field3852, var19, var20, var21, var22, var11 - var9.field3874, var12 - var9.field3875);
                            if (var9.field3951 != null) {
                                method6159(var9.field3951, var9.field3852, var19, var20, var21, var22, var11 - var9.field3874, var12 - var9.field3875);
                            }
                            class90 var81 = (class90) field682.method8688((long) var9.field3852);
                            if (var81 != null) {
                                if (var81.field1097 == 0 && class36.field217 >= var19 && class36.field210 >= var20 && class36.field217 < var21 && class36.field210 < var22 && !field813) {
                                    for (class91 var82 = (class91) field724.method7029(); var82 != null; var82 = (class91) field724.method7031()) {
                                        if (var82.field1099) {
                                            var82.method8362();
                                            var82.field1112.field3993 = false;
                                        }
                                    }
                                    if (Statics.field1660 == 0) {
                                        field693 = null;
                                        field694 = null;
                                    }
                                    if (!field813) {
                                        method3551();
                                    }
                                }
                                method6022(var81.field1095, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.nv(II)Z")
    public static boolean method3260(int arg0) {
        for (int var1 = 0; var1 < field515; var1++) {
            if (field753[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fd.nh(III)V")
    public static final void method3245(int arg0, int arg1) {
        if (Statics.field2371.method6146(arg0)) {
            method5749(Statics.field2371.field3764[arg0], arg1);
        }
    }

    @ObfuscatedName("mx.nl([Lny;IB)V")
    public static final void method5749(class363[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class363 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3855 == 0) {
                    if (var3.field3951 != null) {
                        method5749(var3.field3951, arg1);
                    }
                    class90 var4 = (class90) field682.method8688((long) var3.field3852);
                    if (var4 != null) {
                        method3245(var4.field1095, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3974 != null) {
                    class91 var5 = new class91();
                    var5.field1112 = var3;
                    var5.field1111 = var3.field3974;
                    Statics.method4025(var5);
                }
                if (arg1 == 1 && var3.field3975 != null) {
                    if (var3.field3991 >= 0) {
                        class363 var6 = Statics.field2371.method6131(var3.field3852);
                        if (var6 == null || var6.field3951 == null || var3.field3991 >= var6.field3951.length || var6.field3951[var3.field3991] != var3) {
                            continue;
                        }
                    }
                    class91 var7 = new class91();
                    var7.field1112 = var3;
                    var7.field1111 = var3.field3975;
                    Statics.method4025(var7);
                }
            }
        }
    }

    @ObfuscatedName("cw.no(Lny;III)V")
    public static final void method1208(class363 arg0, int arg1, int arg2) {
        if (field693 != null || field813 || arg0 == null || method5551(arg0) == null) {
            return;
        }
        field693 = arg0;
        field694 = method5551(arg0);
        field695 = arg1;
        field696 = arg2;
        Statics.field1660 = 0;
        field659 = false;
        int var3 = method8840();
        if (var3 == -1) {
            return;
        }
        Statics.field4825 = new class77();
        Statics.field4825.field940 = field666.field5550[var3];
        Statics.field4825.field929 = field666.field5552[var3];
        Statics.field4825.field930 = field666.field5565[var3];
        Statics.field4825.field933 = field666.field5553[var3];
        Statics.field4825.field932 = field666.field5558[var3];
        Statics.field4825.field934 = field666.field5556[var3];
        Statics.field4825.field935 = field666.field5557[var3];
        Statics.field4825.field928 = field666.field5555[var3];
        Statics.field4825.field936 = field666.field5559[var3];
    }

    @ObfuscatedName("client.nm(B)V")
    public final void method1239() {
        method2361(field693);
        Statics.field1660++;
        if (field701 && field698) {
            int var1 = class36.field217;
            int var2 = class36.field210;
            int var3 = var1 - field695;
            int var4 = var2 - field696;
            if (var3 < field577) {
                var3 = field577;
            }
            if (field693.field3868 + var3 > field577 + field694.field3868) {
                var3 = field577 + field694.field3868 - field693.field3868;
            }
            if (var4 < field685) {
                var4 = field685;
            }
            if (field693.field3869 + var4 > field685 + field694.field3869) {
                var4 = field685 + field694.field3869 - field693.field3869;
            }
            int var5 = var3 - field702;
            int var6 = var4 - field703;
            int var7 = field693.field3938;
            if (Statics.field1660 > field693.field3941 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field659 = true;
            }
            int var8 = field694.field3874 + (var3 - field577);
            int var9 = field694.field3875 + (var4 - field685);
            if (field693.field3847 != null && field659) {
                class91 var10 = new class91();
                var10.field1112 = field693;
                var10.field1101 = var8;
                var10.field1109 = var9;
                var10.field1111 = field693.field3847;
                Statics.method4025(var10);
            }
            if (class36.field219 == 0) {
                if (field659) {
                    if (field693.field3931 != null) {
                        class91 var11 = new class91();
                        var11.field1112 = field693;
                        var11.field1101 = var8;
                        var11.field1109 = var9;
                        var11.field1098 = field804;
                        var11.field1111 = field693.field3931;
                        Statics.method4025(var11);
                    }
                    if (field804 != null) {
                        class363 var12 = field693;
                        int var13 = Statics.method3261(method5697(var12));
                        class363 var14;
                        if (var13 == 0) {
                            var14 = null;
                        } else {
                            int var15 = 0;
                            while (true) {
                                if (var15 >= var13) {
                                    var14 = var12;
                                    break;
                                }
                                var12 = Statics.field2371.method6131(var12.field3872);
                                if (var12 == null) {
                                    var14 = null;
                                    break;
                                }
                                var15++;
                            }
                        }
                        if (var14 != null) {
                            class326 var16 = class326.method3199(class324.field3367, field582.field1486);
                            var16.field3426.method9027(field693.field3852);
                            var16.field3426.method9012(field693.field3960);
                            var16.field3426.method9173(field693.field3991);
                            var16.field3426.method8958(field804.field3960);
                            var16.field3426.method9012(field804.field3991);
                            var16.field3426.method9027(field804.field3852);
                            field582.method2943(var16);
                        }
                    }
                } else if (Statics.field4825 == null || this.method1235(Statics.field4825.field930, Statics.field4825.field936)) {
                    this.method1230(field702 + field695, field703 + field696);
                } else if (field666.field5551 > 0) {
                    int var17 = field702 + field695;
                    int var18 = field703 + field696;
                    class77 var19 = Statics.field4825;
                    if (var19 != null) {
                        method7191(var19.field940, var19.field929, var19.field930, var19.field933, var19.field932, var19.field928, var19.field934, var19.field935, var17, var18);
                    }
                    Statics.field4825 = null;
                }
                field693 = null;
            }
        } else if (Statics.field1660 > 1) {
            if (!field659 && field666.field5551 > 0) {
                int var20 = field702 + field695;
                int var21 = field703 + field696;
                class77 var22 = Statics.field4825;
                if (var22 != null) {
                    method7191(var22.field940, var22.field929, var22.field930, var22.field933, var22.field932, var22.field928, var22.field934, var22.field935, var20, var21);
                }
                Statics.field4825 = null;
            }
            field693 = null;
        }
    }

    @ObfuscatedName("dc.ni(Lny;I)V")
    public static void method2361(class363 arg0) {
        if (arg0 != null && field594 == arg0.field4000) {
            field731[arg0.field3999] = true;
        }
    }

    @ObfuscatedName("pe.na(I)V")
    public static void method6907() {
        for (class90 var0 = (class90) field682.method8691(); var0 != null; var0 = (class90) field682.method8692()) {
            int var1 = var0.field1095;
            if (Statics.field2371.method6146(var1)) {
                boolean var2 = true;
                class363[] var3 = Statics.field2371.field3764[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3851;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field5122;
                    class363 var6 = Statics.field2371.method6131(var5);
                    if (var6 != null) {
                        method2361(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("lv.ng(Lny;I)Lny;")
    public static class363 method5551(class363 arg0) {
        class363 var1 = arg0;
        int var2 = Statics.method3261(method5697(arg0));
        class363 var3;
        if (var2 == 0) {
            var3 = null;
        } else {
            int var4 = 0;
            while (true) {
                if (var4 >= var2) {
                    var3 = var1;
                    break;
                }
                var1 = Statics.field2371.method6131(var1.field3872);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class363 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field3937;
        }
        return var5;
    }

    @ObfuscatedName("hu.nx(IB)V")
    public static final void method3679(int arg0) {
        if (!Statics.field2371.method6146(arg0)) {
            return;
        }
        class363[] var1 = Statics.field2371.field3764[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class363 var3 = var1[var2];
            if (var3 != null) {
                var3.field3873 = 0;
                var3.field3912 = 0;
            }
        }
    }

    @ObfuscatedName("af.nj([Lny;IB)V")
    public static final void method39(class363[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class363 var3 = arg0[var2];
            if (var3 != null && var3.field3872 == arg1 && (!var3.field3851 || !method3415(var3))) {
                if (var3.field3855 == 0) {
                    if (!var3.field3851 && method3415(var3) && Statics.field3036 != var3) {
                        continue;
                    }
                    method39(arg0, var3.field3852);
                    if (var3.field3951 != null) {
                        method39(var3.field3951, var3.field3852);
                    }
                    class90 var4 = (class90) field682.method8688((long) var3.field3852);
                    if (var4 != null) {
                        int var5 = var4.field1095;
                        if (Statics.field2371.method6146(var5)) {
                            method39(Statics.field2371.field3764[var5], -1);
                        }
                    }
                }
                if (var3.field3855 == 6) {
                    if (var3.field3901 != -1 || var3.field3856 != -1) {
                        boolean var6 = method2963(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3856;
                        } else {
                            var7 = var3.field3901;
                        }
                        if (var7 != -1) {
                            class213 var8 = class213.method2555(var7);
                            if (var8.method3954()) {
                                var3.field3873 += field599;
                                int var9 = var8.method3999();
                                if (var3.field3873 >= var9) {
                                    var3.field3873 -= var8.field2318;
                                    if (var3.field3873 < 0 || var3.field3873 >= var9) {
                                        var3.field3873 = 0;
                                    }
                                }
                                method2361(var3);
                            } else {
                                var3.field3912 += field599;
                                while (var3.field3912 > var8.field2316[var3.field3873]) {
                                    var3.field3912 -= var8.field2316[var3.field3873];
                                    var3.field3873++;
                                    if (var3.field3873 >= var8.field2314.length) {
                                        var3.field3873 -= var8.field2318;
                                        if (var3.field3873 < 0 || var3.field3873 >= var8.field2314.length) {
                                            var3.field3873 = 0;
                                        }
                                    }
                                    method2361(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3910 != 0 && !var3.field3851) {
                        int var10 = var3.field3910 >> 16;
                        int var11 = var3.field3910 << 16 >> 16;
                        int var12 = field599 * var10;
                        int var13 = field599 * var11;
                        var3.field3916 = var3.field3916 + var12 & 0x7FF;
                        var3.field3915 = var3.field3915 + var13 & 0x7FF;
                        method2361(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ed.nd(IB)V")
    public static final void method3038(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method3082((double) var3);
    }

    @ObfuscatedName("fc.nu(I)I")
    public static final int method3263() {
        float var0 = 200.0F * ((float) Statics.field4929.method2705() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("fe.nr(D)V")
    public static final void method3082(double arg0) {
        class240.method4329(arg0);
        ((class252) class240.field2589.field2905).method4767(arg0);
        if (Statics.field1518 != null) {
            Statics.field1518.method8450();
        }
        class211.method3192();
        Statics.field4929.method2612(arg0);
    }

    @ObfuscatedName("ha.nn(II)V")
    public static final void method3709(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field4929.method2615()) {
            return;
        }
        if (Statics.field4929.method2615() == 0 && class335.method4123()) {
            class335.method3078(Statics.field1993, var1);
            field608 = false;
        } else if (var1 == 0) {
            class335.method5635(0, 0);
            field608 = false;
        } else if (!class335.field3627.isEmpty()) {
            Iterator var2 = class335.field3627.iterator();
            while (var2.hasNext()) {
                class347 var3 = (class347) var2.next();
                if (var3 != null) {
                    var3.field3730 = var1;
                }
            }
            class347 var4 = (class347) class335.field3627.get(0);
            if (var4 != null && var4.field3733 != null && var4.field3733.method5854() && !var4.field3735) {
                var4.field3733.method5847(var1);
                var4.field3731 = (float) var1;
            }
        }
        Statics.field4929.method2697(var1);
    }

    @ObfuscatedName("cw.nf(IB)V")
    public static final void method1206(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4929.method2616(var1);
    }

    @ObfuscatedName("jk.oc(Lny;I)V")
    public static final void method4748(class363 arg0) {
        int var1 = arg0.field3955;
        if (var1 == 324) {
            if (field800 == -1) {
                field800 = arg0.field3888;
                field801 = arg0.field3889;
            }
            if (field790.field3796 == 1) {
                arg0.field3888 = field800;
            } else {
                arg0.field3888 = field801;
            }
        } else if (var1 == 325) {
            if (field800 == -1) {
                field800 = arg0.field3888;
                field801 = arg0.field3889;
            }
            if (field790.field3796 == 1) {
                arg0.field3888 = field801;
            } else {
                arg0.field3888 = field800;
            }
        } else if (var1 == 327) {
            arg0.field3916 = 150;
            arg0.field3915 = (int) (Math.sin((double) field609 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3897 = 5;
            arg0.field3898 = 0;
        } else if (var1 == 328) {
            arg0.field3916 = 150;
            arg0.field3915 = (int) (Math.sin((double) field609 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3897 = 5;
            arg0.field3898 = 1;
        }
    }

    @ObfuscatedName("dn.ot(B)V")
    public static final void method2594() {
        class326 var0 = class326.method3199(class324.field3336, field582.field1486);
        field582.method2943(var0);
        class73.field887 = true;
        for (class90 var1 = (class90) field682.method8691(); var1 != null; var1 = (class90) field682.method8692()) {
            if (var1.field1097 == 0 || var1.field1097 == 3) {
                method3240(var1, true);
            }
        }
        if (field686 != null) {
            method2361(field686);
            field686 = null;
        }
        class73.field887 = false;
    }

    @ObfuscatedName("ej.oe(IIII)Ldj;")
    public static final class90 method3058(int arg0, int arg1, int arg2) {
        class90 var3 = new class90();
        var3.field1095 = arg1;
        var3.field1097 = arg2;
        field682.method8690(var3, (long) arg0);
        method3679(arg1);
        class363 var4 = Statics.field2371.method6131(arg0);
        method2361(var4);
        if (field686 != null) {
            method2361(field686);
            field686 = null;
        }
        method265(Statics.field2371.field3764[arg0 >> 16], var4, false);
        class73.method5693(arg1);
        if (field681 != -1) {
            method3245(field681, 1);
        }
        return var3;
    }

    @ObfuscatedName("fo.os(Ldj;ZI)V")
    public static final void method3240(class90 arg0, boolean arg1) {
        int var2 = arg0.field1095;
        int var3 = (int) arg0.field5122;
        arg0.method8362();
        if (arg1) {
            Statics.field2371.method6145(var2);
        }
        for (class507 var4 = (class507) field589.method8691(); var4 != null; var4 = (class507) field589.method8692()) {
            if ((long) var2 == (var4.field5122 >> 48 & 0xFFFFL)) {
                var4.method8362();
            }
        }
        class363 var5 = Statics.field2371.method6131(var3);
        if (var5 != null) {
            method2361(var5);
        }
        if (field681 != -1) {
            method3245(field681, 1);
        }
    }

    @ObfuscatedName("fr.ov(Lny;S)Z")
    public static final boolean method3169(class363 arg0) {
        int var1 = arg0.field3955;
        if (var1 == 205) {
            field583 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field790.method6196(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field790.method6219(var4, var5 == 1);
        }
        if (var1 == 324) {
            field790.method6206(0);
        }
        if (var1 == 325) {
            field790.method6206(1);
        }
        if (var1 == 326) {
            class326 var6 = class326.method3199(class549.field5408 >= 224 ? class324.field3395 : class324.field3342, field582.field1486);
            field790.method6175(var6.field3426);
            field582.method2943(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cl.oi(Lny;IIIB)V")
    public static final void method1944(class363 arg0, int arg1, int arg2, int arg3) {
        class350 var4 = arg0.method6534(Statics.field2371, false);
        if (var4 == null) {
            return;
        }
        if (field764 < 3) {
            Statics.field1509.method9500(arg1, arg2, var4.field3745, var4.field3747, 25, 25, field672, 256, var4.field3748, var4.field3746);
        } else {
            class561.method9314(arg1, arg2, 0, var4.field3748, var4.field3746);
        }
    }

    @ObfuscatedName("gf.om(IIIILvv;Lnl;B)V")
    public static final void method3368(int arg0, int arg1, int arg2, int arg3, class565 arg4, class350 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3942(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field672 & 0x7FF;
        int var8 = class240.field2590[var7];
        int var9 = class240.field2588[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3745 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1786.method9425(arg5.field3745 / 2 + arg0 - var17 / 2 + var15, arg5.field3747 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ia.oa(IIIILvv;Lnl;I)V")
    public static final void method3942(int arg0, int arg1, int arg2, int arg3, class565 arg4, class350 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field672 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class240.field2590[var6];
        int var9 = class240.field2588[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method9438(arg5.field3745 / 2 + var10 - arg4.field5514 / 2, arg5.field3747 / 2 - var11 - arg4.field5515 / 2, arg0, arg1, arg5.field3745, arg5.field3747, arg5.field3748, arg5.field3746);
        } else {
            arg4.method9410(arg5.field3745 / 2 + arg0 + var10 - arg4.field5514 / 2, arg5.field3747 / 2 + arg1 - var11 - arg4.field5515 / 2);
        }
    }

    @ObfuscatedName("kg.or(I)V")
    public static final void method5055() {
        Iterator var0 = field593.iterator();
        while (var0.hasNext()) {
            class104 var1 = (class104) var0.next();
            for (int var2 = 0; var2 < field718.field1438; var2++) {
                class95 var3 = var1.field1369[field718.field1436[var2]];
                if (var3 != null) {
                    var3.method2468();
                }
            }
        }
        Iterator var4 = class116.field1476.iterator();
        while (var4.hasNext()) {
            class65 var5 = (class65) var4.next();
            var5.method1145();
        }
        if (Statics.field1824 != null) {
            Statics.field1824.method8013();
        }
    }

    @ObfuscatedName("qi.od(I)V")
    public static final void method7197() {
        Iterator var0 = class116.field1476.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1163();
        }
        if (Statics.field1824 != null) {
            Statics.field1824.method8014();
        }
    }

    @ObfuscatedName("ez.oj(B)V")
    public static final void method2800() {
        field716 = field710;
        Statics.field1856 = true;
    }

    @ObfuscatedName("bo.oh(Ljava/lang/String;B)V")
    public static final void method861(String arg0) {
        if (Statics.field1824 != null) {
            class326 var1 = class326.method3199(class324.field3368, field582.field1486);
            var1.field3426.method9022(class551.method8819(arg0));
            var1.field3426.method8964(arg0);
            field582.method2943(var1);
        }
    }

    @ObfuscatedName("oz.ou(Ljava/lang/String;I)V")
    public static final void method6716(String arg0) {
        if (!arg0.equals("")) {
            class326 var1 = class326.method3199(class324.field3309, field582.field1486);
            var1.field3426.method9022(class551.method8819(arg0));
            var1.field3426.method8964(arg0);
            field582.method2943(var1);
        }
    }

    @ObfuscatedName("qy.op(I)V")
    public static final void method7291() {
        class326 var0 = class326.method3199(class324.field3309, field582.field1486);
        var0.field3426.method9022(0);
        field582.method2943(var0);
    }

    @ObfuscatedName("ko.ok(IIB)V")
    public static final void method5243(int arg0, int arg1) {
        class171 var2 = arg0 >= 0 ? field704[arg0] : Statics.field1813;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3391()) {
            return;
        }
        class153 var3 = (class153) var2.field1836.get(arg1);
        if (var3.field1712 != -1) {
            return;
        }
        String var4 = var3.field1711.method9621();
        class326 var5 = class326.method3199(class324.field3321, field582.field1486);
        var5.field3426.method9022(3 + class551.method8819(var4));
        var5.field3426.method9022(arg0);
        var5.field3426.method8958(arg1);
        var5.field3426.method8964(var4);
        field582.method2943(var5);
    }

    @ObfuscatedName("ij.ol(III)V")
    public static final void method4024(int arg0, int arg1) {
        if (field704[arg0] == null || arg1 < 0 || arg1 >= field704[arg0].method3391()) {
            return;
        }
        class153 var2 = (class153) field704[arg0].field1836.get(arg1);
        if (var2.field1712 != -1) {
            return;
        }
        class326 var3 = class326.method3199(class324.field3308, field582.field1486);
        var3.field3426.method9022(3 + class551.method8819(var2.field1711.method9621()));
        var3.field3426.method9022(arg0);
        var3.field3426.method8958(arg1);
        var3.field3426.method8964(var2.field1711.method9621());
        field582.method2943(var3);
    }

    @ObfuscatedName("bo.oz(IIZI)V")
    public static final void method862(int arg0, int arg1, boolean arg2) {
        if (field704[arg0] == null || arg1 < 0 || arg1 >= field704[arg0].method3391()) {
            return;
        }
        class153 var3 = (class153) field704[arg0].field1836.get(arg1);
        class326 var4 = class326.method3199(class324.field3339, field582.field1486);
        var4.field3426.method9022(4 + class551.method8819(var3.field1711.method9621()));
        var4.field3426.method9022(arg0);
        var4.field3426.method8958(arg1);
        var4.field3426.method9100(arg2);
        var4.field3426.method8964(var3.field1711.method9621());
        field582.method2943(var4);
    }

    @ObfuscatedName("lj.oq(Lny;B)I")
    public static int method5697(class363 arg0) {
        class507 var1 = (class507) field589.method8688(((long) arg0.field3852 << 32) + (long) arg0.field3991);
        return var1 == null ? arg0.field3878 : var1.field5120;
    }

    @ObfuscatedName("gw.ox(Lny;I)Z")
    public static boolean method3415(class363 arg0) {
        return arg0.field3927;
    }

    @ObfuscatedName("ee.oo(Lny;I)Ljava/lang/String;")
    public static String method3047(class363 arg0) {
        if (Statics.method8637(method5697(arg0)) == 0) {
            return null;
        } else if (arg0.field4004 == null || arg0.field4004.trim().length() == 0) {
            return null;
        } else {
            return arg0.field4004;
        }
    }

    @ObfuscatedName("ng.of(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method6148(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field518 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field518 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field518 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field518 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field518 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field5092 != null) {
            var3 = "/p=" + Statics.field5092;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1329 + "/a=" + Statics.field2353 + var3 + "/";
    }

    @ObfuscatedName("dy.oy(Ljava/lang/String;I)V")
    public static void method2525(String arg0) {
        Statics.field5092 = arg0;
        try {
            String var1 = Statics.field3.getParameter(Integer.toString(18));
            String var2 = Statics.field3.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class331.method3482() + 94608000000L;
                class368.field4022.setTime(new Date(var6));
                int var8 = class368.field4022.get(7);
                int var9 = class368.field4022.get(5);
                int var10 = class368.field4022.get(2);
                int var11 = class368.field4022.get(1);
                int var12 = class368.field4022.get(11);
                int var13 = class368.field4022.get(12);
                int var14 = class368.field4022.get(13);
                String var15 = class368.field4024[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class368.field4023[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field3;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("di.on(Ljava/lang/String;ZI)V")
    public static void method2486(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1814; var5++) {
            class211 var6 = class211.method2414(var5);
            if ((!arg1 || var6.field2281) && var6.field2248 == -1 && var6.field2225.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field3113 = -1;
                    Statics.field1810 = null;
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
        Statics.field1810 = var3;
        Statics.field1658 = 0;
        Statics.field3113 = var4;
        String[] var9 = new String[Statics.field3113];
        for (int var10 = 0; var10 < Statics.field3113; var10++) {
            var9[var10] = class211.method2414(var3[var10]).field2225;
        }
        short[] var11 = Statics.field1810;
        class545.method40(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("ia.po([BII)V")
    public static void method3939(byte[] arg0, int arg1) {
        if (field579 == null) {
            field579 = new byte[24];
        }
        class451.method7828(arg0, arg1, field579, 0, 24);
    }

    @ObfuscatedName("im.py(Lvf;II)V")
    public static void method4234(class551 arg0, int arg1) {
        method3939(arg0.field5413, arg1);
        class221.method3786(arg0, arg1);
    }

    @ObfuscatedName("bh.pp(Lvf;I)V")
    public static void method413(class551 arg0) {
        if (field579 != null) {
            arg0.method8967(field579, 0, field579.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class221.field2386.method8749(0L);
            class221.field2386.method8777(var1);
            int var2;
            for (var2 = 0; var2 < 24 && var1[var2] == 0; var2++) {
            }
            if (var2 >= 24) {
                throw new IOException();
            }
        } catch (Exception var7) {
            for (int var4 = 0; var4 < 24; var4++) {
                var1[var4] = -1;
            }
        }
        arg0.method8967(var1, 0, var1.length);
    }

    @ObfuscatedName("client.pe(I)Lwf;")
    public class574 method1807() {
        return Statics.field4826 == null ? null : Statics.field4826.field1168;
    }

    @ObfuscatedName("ux.pz(IIIZB)V")
    public static void method8836(int arg0, int arg1, int arg2, boolean arg3) {
        class326 var4 = class326.method3199(class324.field3346, field582.field1486);
        var4.field3426.method9027(arg3 ? field551 : 0);
        var4.field3426.method9069(arg2);
        var4.field3426.method9012(arg0);
        var4.field3426.method9012(arg1);
        field582.method2943(var4);
    }

    @ObfuscatedName("dj.ph(I)Z")
    public static boolean method2399() {
        return field689 >= 2;
    }

    @ObfuscatedName("ab.pb(II)V")
    public static void method165(int arg0) {
        field612 = arg0;
    }

    @ObfuscatedName("dy.pd(I)V")
    public static void method2551() {
        if (field612 == 1) {
            field620 = true;
        }
    }

    @ObfuscatedName("lh.pv(I)V")
    public static void method5639() {
        if (!field620 || Statics.field4826 == null) {
            return;
        }
        int var0 = Statics.field4826.field1295[0];
        int var1 = Statics.field4826.field1296[0];
        if (var0 < 0 || 104 <= var0 || var1 < 0 || 104 <= var1) {
            return;
        }
        Statics.field1545 = Statics.field4826.field1300;
        int var2 = method3500(Statics.field1342, Statics.field4826.field1300, Statics.field4826.field1225, Statics.field1342.field1356) - field720;
        if (var2 < Statics.field1699) {
            Statics.field1699 = var2;
        }
        Statics.field73 = Statics.field4826.field1225;
        field620 = false;
    }

    @ObfuscatedName("gl.pj(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3296(String arg0) {
        class385[] var1 = class385.method3564();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class385 var3 = var1[var2];
            if (var3.field4488 != -1 && arg0.startsWith(class107.method3697(var3.field4488))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4488).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("pb.pm(I)V")
    public static void method6924() {
        if (Statics.field4543 == null) {
            return;
        }
        field809 = field609;
        Statics.field4543.method6972();
        for (int var0 = 0; var0 < Statics.field1342.field1369.length; var0++) {
            if (Statics.field1342.field1369[var0] != null) {
                Statics.field4543.method6971((Statics.field1342.field1369[var0].field1300 >> 7) + Statics.field1342.field1350, (Statics.field1342.field1369[var0].field1225 >> 7) + Statics.field1342.field1357);
            }
        }
    }

    @ObfuscatedName("dl.pn(B)V")
    public static void method2308() {
        Statics.field4929.method2622(field521);
    }

    @ObfuscatedName("gu.pg(Lcw;I)V")
    public static void method3373(class69 arg0) {
        if (Statics.field81 != arg0) {
            Statics.field81 = arg0;
        }
    }

    @ObfuscatedName("dr.ps(I)Z")
    public static boolean method2511() {
        return field693 != null;
    }

    @ObfuscatedName("oy.pu(ZI)V")
    public static void method6777(boolean arg0) {
        field587 = arg0;
    }

    @ObfuscatedName("dp.px(II)Luv;")
    public static class542 method2248(int arg0) {
        class542 var1 = (class542) field806.method5733((long) arg0);
        if (var1 == null) {
            var1 = new class542(Statics.field1739, class544.method5604(arg0), class544.method3441(arg0));
            field806.method5735(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("oy.pc(IB)Luv;")
    public static class542 method6778(int arg0) {
        class542 var1 = (class542) field807.method5733((long) arg0);
        if (var1 == null) {
            var1 = new class542(Statics.field1739, arg0);
        }
        return var1;
    }

    @ObfuscatedName("dn.pi(I)Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard method2593() {
        return Statics.field3.method480();
    }

    @ObfuscatedName("ar.pl(II)V")
    public static void method75(int arg0) {
        class213 var1 = class213.method2555(arg0);
        if (var1.method3954() && class213.method3077(var1.field2331) == 2) {
            field810.add(var1.field2331);
        }
    }

    @ObfuscatedName("lj.pk(B)V")
    public static void method5696() {
        for (int var0 = 0; var0 < field810.size(); var0++) {
            int var1 = (Integer) field810.get(var0);
            class146 var2 = class213.method651(var1);
            int var3;
            if (var2 == null) {
                var3 = 2;
            } else {
                var3 = var2.method3214() ? 0 : 1;
            }
            if (var3 != 2) {
                field810.remove(var0);
                var0--;
            }
        }
    }

    @ObfuscatedName("client.pa(IB)V")
    public void method1308(int arg0) {
        class326 var2 = class326.method3199(class324.field3376, field582.field1486);
        var2.field3426.method9022(arg0);
        field582.method2943(var2);
    }

    @ObfuscatedName("client.pr(II)V")
    public void method1242(int arg0) {
        class326 var2 = class326.method3199(class324.field3386, field582.field1486);
        var2.field3426.method9022(arg0);
        field582.method2943(var2);
    }
}

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
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class427, OAuthApi, class312 {

    @ObfuscatedName("client.bc")
    public static boolean field567 = true;

    @ObfuscatedName("client.bg")
    public static int field527 = 1;

    @ObfuscatedName("client.cw")
    public static int field528 = 0;

    @ObfuscatedName("client.cm")
    public static int field552 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field554 = false;

    @ObfuscatedName("client.cr")
    public static boolean field531 = false;

    @ObfuscatedName("client.cv")
    public static int field532 = -1;

    @ObfuscatedName("client.co")
    public static int field533 = -1;

    @ObfuscatedName("client.cl")
    public static int field545 = -1;

    @ObfuscatedName("client.cu")
    public static boolean field762 = false;

    @ObfuscatedName("client.ch")
    public static int field709 = 216;

    @ObfuscatedName("client.dj")
    public static int field611 = 0;

    @ObfuscatedName("client.di")
    public static boolean field538 = false;

    @ObfuscatedName("client.ed")
    public static boolean field540 = true;

    @ObfuscatedName("client.eh")
    public static int field833 = 0;

    @ObfuscatedName("client.ey")
    public static long field590 = -1L;

    @ObfuscatedName("client.eq")
    public static int field543 = -1;

    @ObfuscatedName("client.ej")
    public static int field544 = -1;

    @ObfuscatedName("client.ea")
    public static long field670 = -1L;

    @ObfuscatedName("client.er")
    public static boolean field546 = true;

    @ObfuscatedName("client.ev")
    public static int field547 = 0;

    @ObfuscatedName("client.ez")
    public static int field605 = 0;

    @ObfuscatedName("client.et")
    public static int field549 = 0;

    @ObfuscatedName("client.en")
    public static int field568 = 0;

    @ObfuscatedName("client.eb")
    public static int field551 = 0;

    @ObfuscatedName("client.ei")
    public static int field694 = 0;

    @ObfuscatedName("client.es")
    public static int field558 = 0;

    @ObfuscatedName("client.el")
    public static int field714 = 0;

    @ObfuscatedName("client.em")
    public static int field747 = 0;

    @ObfuscatedName("client.ek")
    public static class104 field556 = class104.field1355;

    @ObfuscatedName("client.ec")
    public static class104 field557 = class104.field1355;

    @ObfuscatedName("client.eu")
    public static boolean field591 = false;

    @ObfuscatedName("client.fl")
    public static class93 field559 = class93.field1170;

    @ObfuscatedName("client.fj")
    public static int field560 = 0;

    @ObfuscatedName("client.fv")
    public static int field561 = 0;

    @ObfuscatedName("client.gg")
    public static int field707 = 0;

    @ObfuscatedName("client.gi")
    public static int field563 = 0;

    @ObfuscatedName("client.go")
    public static int field542 = 0;

    @ObfuscatedName("client.gl")
    public static int field593 = 0;

    @ObfuscatedName("client.gb")
    public static int field665 = 0;

    @ObfuscatedName("client.gj")
    public static class140 field777 = class140.field1654;

    @ObfuscatedName("client.ge")
    public static class520 field572 = class520.field5166;

    @ObfuscatedName("client.gz")
    public String field569;

    @ObfuscatedName("client.gn")
    public class15 field570;

    @ObfuscatedName("client.ht")
    public class19 field649;

    @ObfuscatedName("client.ho")
    public OtlTokenRequester field679;

    @ObfuscatedName("client.hj")
    public Future field573;

    @ObfuscatedName("client.hh")
    public boolean field574 = false;

    @ObfuscatedName("client.hi")
    public int field575 = 0;

    @ObfuscatedName("client.hd")
    public class19 field576;

    @ObfuscatedName("client.hk")
    public RefreshAccessTokenRequester field577;

    @ObfuscatedName("client.hz")
    public Future field578;

    @ObfuscatedName("client.hl")
    public static final String field779;

    @ObfuscatedName("client.hg")
    public static final String field663;

    @ObfuscatedName("client.hm")
    public static boolean field581;

    @ObfuscatedName("client.hv")
    public static class78 field582;

    @ObfuscatedName("client.ib")
    public class515 field614;

    @ObfuscatedName("client.il")
    public class8 field584;

    @ObfuscatedName("client.ig")
    public long field585 = -1L;

    @ObfuscatedName("client.ie")
    public static byte[] field811;

    @ObfuscatedName("client.ij")
    public static class101[] field587;

    @ObfuscatedName("client.in")
    public static int field588;

    @ObfuscatedName("client.ih")
    public static int[] field526;

    @ObfuscatedName("client.it")
    public static String field693;

    @ObfuscatedName("client.ir")
    public static int field641;

    @ObfuscatedName("client.ic")
    public static int[] field738;

    @ObfuscatedName("client.ia")
    public static final class112 field592;

    @ObfuscatedName("client.im")
    public static int field580;

    @ObfuscatedName("client.id")
    public static boolean field594;

    @ObfuscatedName("client.iu")
    public static class414 field595;

    @ObfuscatedName("client.jn")
    public static HashMap field596;

    @ObfuscatedName("client.jg")
    public static int field597;

    @ObfuscatedName("client.ji")
    public static int field631;

    @ObfuscatedName("client.jl")
    public static int field599;

    @ObfuscatedName("client.jj")
    public static int field600;

    @ObfuscatedName("client.jq")
    public static int field601;

    @ObfuscatedName("client.jz")
    public static class214[] field602;

    @ObfuscatedName("client.jp")
    public static boolean field603;

    @ObfuscatedName("client.jf")
    public static int[][][] field604;

    @ObfuscatedName("client.jm")
    public static final int[] field712;

    @ObfuscatedName("client.kb")
    public static int field606;

    @ObfuscatedName("client.kx")
    public static int field608;

    @ObfuscatedName("client.ky")
    public static int field719;

    @ObfuscatedName("client.kp")
    public static int field610;

    @ObfuscatedName("client.kr")
    public static int field799;

    @ObfuscatedName("client.kw")
    public static boolean field612;

    @ObfuscatedName("client.kv")
    public static int field731;

    @ObfuscatedName("client.kg")
    public static int field566;

    @ObfuscatedName("client.lx")
    public static int field705;

    @ObfuscatedName("client.le")
    public static int field616;

    @ObfuscatedName("client.lu")
    public static int field617;

    @ObfuscatedName("client.lo")
    public static int field539;

    @ObfuscatedName("client.ld")
    public static int field683;

    @ObfuscatedName("client.lm")
    public static int field620;

    @ObfuscatedName("client.lp")
    public static int field621;

    @ObfuscatedName("client.ly")
    public static int field622;

    @ObfuscatedName("client.lg")
    public static int field623;

    @ObfuscatedName("client.lk")
    public static int field624;

    @ObfuscatedName("client.lc")
    public static int field625;

    @ObfuscatedName("client.lv")
    public static int field626;

    @ObfuscatedName("client.lr")
    public static int field627;

    @ObfuscatedName("client.lt")
    public static boolean field628;

    @ObfuscatedName("client.lj")
    public static int field629;

    @ObfuscatedName("client.lz")
    public static boolean field630;

    @ObfuscatedName("client.lf")
    public static int field669;

    @ObfuscatedName("client.lq")
    public static int field632;

    @ObfuscatedName("client.lh")
    public static int field564;

    @ObfuscatedName("client.li")
    public static int[] field634;

    @ObfuscatedName("client.ll")
    public static int[] field635;

    @ObfuscatedName("client.lb")
    public static int[] field586;

    @ObfuscatedName("client.md")
    public static int[] field812;

    @ObfuscatedName("client.mh")
    public static int[] field638;

    @ObfuscatedName("client.mv")
    public static int[] field639;

    @ObfuscatedName("client.mg")
    public static int[][] field536;

    @ObfuscatedName("client.mq")
    public static int[] field787;

    @ObfuscatedName("client.mu")
    public static String[] field642;

    @ObfuscatedName("client.mk")
    public static int[][] field643;

    @ObfuscatedName("client.mr")
    public static int field697;

    @ObfuscatedName("client.me")
    public static int field645;

    @ObfuscatedName("client.mz")
    public static int field646;

    @ObfuscatedName("client.mc")
    public static int field647;

    @ObfuscatedName("client.mf")
    public static int field648;

    @ObfuscatedName("client.ml")
    public static int field706;

    @ObfuscatedName("client.mj")
    public static int field764;

    @ObfuscatedName("client.mw")
    public static boolean field818;

    @ObfuscatedName("client.mp")
    public static int field652;

    @ObfuscatedName("client.mb")
    public static boolean field653;

    @ObfuscatedName("client.mi")
    public static class92[] field700;

    @ObfuscatedName("client.mx")
    public static int field655;

    @ObfuscatedName("client.my")
    public static int field656;

    @ObfuscatedName("client.ma")
    public static long field657;

    @ObfuscatedName("client.ms")
    public static boolean field765;

    @ObfuscatedName("client.nd")
    public static int field530;

    @ObfuscatedName("client.ng")
    public static int field797;

    @ObfuscatedName("client.nt")
    public static int[] field553;

    @ObfuscatedName("client.nb")
    public static final int[] field662;

    @ObfuscatedName("client.ns")
    public static String[] field550;

    @ObfuscatedName("client.nz")
    public static boolean[] field664;

    @ObfuscatedName("client.ne")
    public static int[] field708;

    @ObfuscatedName("client.ni")
    public static int field666;

    @ObfuscatedName("client.nr")
    public static class378[][][] field667;

    @ObfuscatedName("client.np")
    public static class378 field668;

    @ObfuscatedName("client.nn")
    public static class378 field654;

    @ObfuscatedName("client.nw")
    public static class378 field798;

    @ObfuscatedName("client.ny")
    public static int[] field671;

    @ObfuscatedName("client.nk")
    public static int[] field821;

    @ObfuscatedName("client.nj")
    public static int[] field824;

    @ObfuscatedName("client.nu")
    public static boolean field674;

    @ObfuscatedName("client.nf")
    public static boolean field640;

    @ObfuscatedName("client.om")
    public static int field676;

    @ObfuscatedName("client.oz")
    public static int[] field677;

    @ObfuscatedName("client.oh")
    public static int[] field678;

    @ObfuscatedName("client.oy")
    public static int[] field720;

    @ObfuscatedName("client.od")
    public static int[] field680;

    @ObfuscatedName("client.og")
    public static int[] field681;

    @ObfuscatedName("client.ob")
    public static String[] field682;

    @ObfuscatedName("client.ok")
    public static String[] field802;

    @ObfuscatedName("client.on")
    public static boolean[] field684;

    @ObfuscatedName("client.oe")
    public static boolean field685;

    @ObfuscatedName("client.os")
    public static boolean field660;

    @ObfuscatedName("client.ow")
    public static boolean field687;

    @ObfuscatedName("client.ot")
    public static int field688;

    @ObfuscatedName("client.oc")
    public static int field689;

    @ObfuscatedName("client.oi")
    public static int field690;

    @ObfuscatedName("client.oq")
    public static int field691;

    @ObfuscatedName("client.ov")
    public static int field692;

    @ObfuscatedName("client.or")
    public static boolean field619;

    @ObfuscatedName("client.of")
    public static int field695;

    @ObfuscatedName("client.ps")
    public static int field661;

    @ObfuscatedName("client.pa")
    public static String field710;

    @ObfuscatedName("client.pi")
    public static String field721;

    @ObfuscatedName("client.pj")
    public static int field699;

    @ObfuscatedName("client.pu")
    public static class489 field548;

    @ObfuscatedName("client.po")
    public static int field541;

    @ObfuscatedName("client.pv")
    public static int field702;

    @ObfuscatedName("client.pn")
    public static int field703;

    @ObfuscatedName("client.pd")
    public static class332 field704;

    @ObfuscatedName("client.px")
    public static int field644;

    @ObfuscatedName("client.pt")
    public static int field815;

    @ObfuscatedName("client.pm")
    public static int field615;

    @ObfuscatedName("client.pe")
    public static int field562;

    @ObfuscatedName("client.pp")
    public static boolean field825;

    @ObfuscatedName("client.pg")
    public static class332 field822;

    @ObfuscatedName("client.ph")
    public static class332 field711;

    @ObfuscatedName("client.pb")
    public static class332 field730;

    @ObfuscatedName("client.pc")
    public static int field713;

    @ObfuscatedName("client.py")
    public static int field786;

    @ObfuscatedName("client.pq")
    public static class332 field715;

    @ObfuscatedName("client.pw")
    public static boolean field716;

    @ObfuscatedName("client.qe")
    public static int field717;

    @ObfuscatedName("client.qd")
    public static int field718;

    @ObfuscatedName("client.qn")
    public static boolean field763;

    @ObfuscatedName("client.qf")
    public static int field565;

    @ObfuscatedName("client.qr")
    public static int field637;

    @ObfuscatedName("client.qm")
    public static boolean field722;

    @ObfuscatedName("client.ql")
    public static int field529;

    @ObfuscatedName("client.qo")
    public static int[] field724;

    @ObfuscatedName("client.qg")
    public static int field725;

    @ObfuscatedName("client.qx")
    public static int[] field726;

    @ObfuscatedName("client.qs")
    public static int field727;

    @ObfuscatedName("client.qz")
    public static int[] field651;

    @ObfuscatedName("client.qt")
    public static int field729;

    @ObfuscatedName("client.qu")
    public static int[] field794;

    @ObfuscatedName("client.qb")
    public static int field658;

    @ObfuscatedName("client.qp")
    public static int field732;

    @ObfuscatedName("client.qi")
    public static int field733;

    @ObfuscatedName("client.qy")
    public static int field734;

    @ObfuscatedName("client.qa")
    public static int field735;

    @ObfuscatedName("client.qh")
    public static int field736;

    @ObfuscatedName("client.ru")
    public static int field737;

    @ObfuscatedName("client.rh")
    public static int field598;

    @ObfuscatedName("client.rr")
    public static int field579;

    @ObfuscatedName("client.rz")
    public static int field740;

    @ObfuscatedName("client.rm")
    public static class533 field741;

    @ObfuscatedName("client.rc")
    public static class378 field742;

    @ObfuscatedName("client.rq")
    public static class378 field728;

    @ObfuscatedName("client.rs")
    public static class378 field744;

    @ObfuscatedName("client.rp")
    public static class378 field781;

    @ObfuscatedName("client.rg")
    public static class489 field746;

    @ObfuscatedName("client.ry")
    public static int field698;

    @ObfuscatedName("client.rk")
    public static int field748;

    @ObfuscatedName("client.re")
    public static boolean[] field537;

    @ObfuscatedName("client.rf")
    public static boolean[] field750;

    @ObfuscatedName("client.rl")
    public static boolean[] field751;

    @ObfuscatedName("client.rt")
    public static int[] field752;

    @ObfuscatedName("client.rx")
    public static int[] field753;

    @ObfuscatedName("client.rw")
    public static int[] field754;

    @ObfuscatedName("client.rn")
    public static int[] field755;

    @ObfuscatedName("client.ri")
    public static int field756;

    @ObfuscatedName("client.sq")
    public static long field757;

    @ObfuscatedName("client.sd")
    public static boolean field758;

    @ObfuscatedName("client.se")
    public static int[] field759;

    @ObfuscatedName("client.sk")
    public static int field760;

    @ObfuscatedName("client.sn")
    public static int field761;

    @ObfuscatedName("client.sc")
    public static String field555;

    @ObfuscatedName("client.si")
    public static long[] field673;

    @ObfuscatedName("client.sr")
    public static int field535;

    @ObfuscatedName("client.sp")
    public static class213 field675;

    @ObfuscatedName("client.ss")
    public static class211 field766;

    @ObfuscatedName("client.sf")
    public static int field767;

    @ObfuscatedName("client.so")
    public static int[] field768;

    @ObfuscatedName("client.su")
    public static int[] field769;

    @ObfuscatedName("client.sx")
    public static long field770;

    @ObfuscatedName("client.tu")
    public static class155[] field771;

    @ObfuscatedName("client.tn")
    public static class164[] field772;

    @ObfuscatedName("client.tj")
    public static int field773;

    @ObfuscatedName("client.tl")
    public static int field774;

    @ObfuscatedName("client.tq")
    public static int[] field775;

    @ObfuscatedName("client.tg")
    public static int[] field776;

    @ObfuscatedName("client.tb")
    public static class529[] field785;

    @ObfuscatedName("client.tz")
    public static int field778;

    @ObfuscatedName("client.ti")
    public static int field701;

    @ObfuscatedName("client.ta")
    public static int field780;

    @ObfuscatedName("client.tp")
    public static boolean field800;

    @ObfuscatedName("client.tt")
    public static int field782;

    @ObfuscatedName("client.tf")
    public static int[] field783;

    @ObfuscatedName("client.tv")
    public static int[] field784;

    @ObfuscatedName("client.ua")
    public static int[] field739;

    @ObfuscatedName("client.uj")
    public static int[] field534;

    @ObfuscatedName("client.uu")
    public static class40[] field571;

    @ObfuscatedName("client.ut")
    public static boolean field788;

    @ObfuscatedName("client.ur")
    public static boolean field789;

    @ObfuscatedName("client.ux")
    public static boolean field790;

    @ObfuscatedName("client.uo")
    public static boolean field791;

    @ObfuscatedName("client.uv")
    public static class480 field792;

    @ObfuscatedName("client.ue")
    public static class479 field583;

    @ObfuscatedName("client.uy")
    public static class479 field609;

    @ObfuscatedName("client.uh")
    public static boolean field795;

    @ObfuscatedName("client.vw")
    public static boolean[] field796;

    @ObfuscatedName("client.vh")
    public static int[] field589;

    @ObfuscatedName("client.vq")
    public static int[] field749;

    @ObfuscatedName("client.vk")
    public static int[] field659;

    @ObfuscatedName("client.vz")
    public static int[] field745;

    @ObfuscatedName("client.vl")
    public static short field801;

    @ObfuscatedName("client.vp")
    public static short field686;

    @ObfuscatedName("client.vm")
    public static short field803;

    @ObfuscatedName("client.vi")
    public static short field804;

    @ObfuscatedName("client.vf")
    public static short field805;

    @ObfuscatedName("client.ve")
    public static short field636;

    @ObfuscatedName("client.vu")
    public static short field807;

    @ObfuscatedName("client.vj")
    public static short field808;

    @ObfuscatedName("client.vd")
    public static int field809;

    @ObfuscatedName("client.vc")
    public static int field810;

    @ObfuscatedName("client.vo")
    public static int field743;

    @ObfuscatedName("client.vn")
    public static int field618;

    @ObfuscatedName("client.vx")
    public static int field813;

    @ObfuscatedName("client.vy")
    public static class329 field814;

    @ObfuscatedName("client.vb")
    public static int field633;

    @ObfuscatedName("client.vs")
    public static int field816;

    @ObfuscatedName("client.wo")
    public static class476 field672;

    @ObfuscatedName("client.wf")
    public static class368[] field806;

    @ObfuscatedName("client.wy")
    public static class67 field819;

    @ObfuscatedName("client.ws")
    public static class424 field820;

    @ObfuscatedName("client.wx")
    public static class288 field723;

    @ObfuscatedName("client.wj")
    public static class288 field613;

    @ObfuscatedName("client.wa")
    public static int field823;

    @ObfuscatedName("client.wd")
    public static int field650;

    @ObfuscatedName("client.wt")
    public static List field696;

    @ObfuscatedName("client.wv")
    public static ArrayList field826;

    @ObfuscatedName("client.wk")
    public static int field827;

    @ObfuscatedName("client.we")
    public static int field828;

    @ObfuscatedName("client.xm")
    public static final class66 field829;

    @ObfuscatedName("client.xy")
    public static int[] field830;

    @ObfuscatedName("client.xf")
    public static int[] field831;

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
        String var6 = class386.method91(var1, 0, var1.length);
        field779 = var6;
        int var7 = "com_jagex_auth_desktop_runelite:public".length();
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            char var10 = "com_jagex_auth_desktop_runelite:public".charAt(var9);
            if (var10 > 127) {
                var8[var9] = 63;
            } else {
                var8[var9] = (byte) var10;
            }
        }
        String var13 = class386.method91(var8, 0, var8.length);
        field663 = var13;
        field581 = false;
        field582 = new class78();
        field811 = null;
        field587 = new class101[65536];
        field588 = 0;
        field526 = new int[65536];
        field641 = 0;
        field738 = new int[250];
        field592 = new class112();
        field580 = 0;
        field594 = false;
        field595 = new class414();
        field596 = new HashMap();
        field597 = 0;
        field631 = 1;
        field599 = 0;
        field600 = 1;
        field601 = 0;
        field602 = new class214[4];
        field603 = false;
        field604 = new int[4][13][13];
        field712 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field606 = 0;
        field608 = 2301979;
        field719 = 5063219;
        field610 = 3353893;
        field799 = 7759444;
        field612 = false;
        field731 = 0;
        field566 = 128;
        field705 = 0;
        field616 = 0;
        field617 = 0;
        field539 = 0;
        field683 = 0;
        field620 = 0;
        field621 = 50;
        field622 = 0;
        field623 = 0;
        field624 = 0;
        field625 = 12;
        field626 = 6;
        field627 = 0;
        field628 = false;
        field629 = 0;
        field630 = false;
        field669 = 0;
        field632 = 0;
        field564 = 50;
        field634 = new int[field564];
        field635 = new int[field564];
        field586 = new int[field564];
        field812 = new int[field564];
        field638 = new int[field564];
        field639 = new int[field564];
        field536 = new int[field564][];
        field787 = new int[field564];
        field642 = new String[field564];
        field643 = new int[104][104];
        field697 = 0;
        field645 = -1;
        field646 = -1;
        field647 = 0;
        field648 = 0;
        field706 = 0;
        field764 = 0;
        field818 = true;
        field652 = 0;
        field653 = true;
        field700 = new class92[2048];
        field655 = -1;
        field656 = 0;
        field657 = -1L;
        field765 = true;
        field530 = 0;
        field797 = 0;
        field553 = new int[1000];
        field662 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field550 = new String[8];
        field664 = new boolean[8];
        field708 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field666 = -1;
        field667 = new class378[4][104][104];
        field668 = new class378();
        field654 = new class378();
        field798 = new class378();
        field671 = new int[25];
        field821 = new int[25];
        field824 = new int[25];
        field674 = false;
        field640 = false;
        field676 = 0;
        field677 = new int[500];
        field678 = new int[500];
        field720 = new int[500];
        field680 = new int[500];
        field681 = new int[500];
        field682 = new String[500];
        field802 = new String[500];
        field684 = new boolean[500];
        field685 = false;
        field660 = false;
        field687 = true;
        field688 = -1;
        field689 = -1;
        field690 = 0;
        field691 = 50;
        field692 = 0;
        field693 = null;
        field619 = false;
        field695 = -1;
        field661 = -1;
        field710 = null;
        field721 = null;
        field699 = -1;
        field548 = new class489(8);
        field541 = 0;
        field702 = -1;
        field703 = 0;
        field704 = null;
        field644 = 0;
        field815 = 0;
        field615 = 0;
        field562 = -1;
        field825 = false;
        field822 = null;
        field711 = null;
        field730 = null;
        field713 = 0;
        field786 = 0;
        field715 = null;
        field716 = false;
        field717 = -1;
        field718 = -1;
        field763 = false;
        field565 = -1;
        field637 = -1;
        field722 = false;
        field529 = 1;
        field724 = new int[32];
        field725 = 0;
        field726 = new int[32];
        field727 = 0;
        field651 = new int[32];
        field729 = 0;
        field794 = new int[32];
        field658 = 0;
        field732 = 0;
        field733 = 0;
        field734 = 0;
        field735 = 0;
        field736 = 0;
        field737 = 0;
        field598 = 0;
        field579 = 0;
        field740 = 0;
        field741 = new class533();
        field742 = new class378();
        field728 = new class378();
        field744 = new class378();
        field781 = new class378();
        field746 = new class489(512);
        field698 = 0;
        field748 = -2;
        field537 = new boolean[100];
        field750 = new boolean[100];
        field751 = new boolean[100];
        field752 = new int[100];
        field753 = new int[100];
        field754 = new int[100];
        field755 = new int[100];
        field756 = 0;
        field757 = 0L;
        field758 = true;
        field759 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field760 = 0;
        field761 = 0;
        field555 = "";
        field673 = new long[100];
        field535 = 0;
        field675 = new class213();
        field766 = new class211();
        field767 = 0;
        field768 = new int[128];
        field769 = new int[128];
        field770 = -1L;
        field771 = new class155[4];
        field772 = new class164[4];
        field773 = -1;
        field774 = 0;
        field775 = new int[1000];
        field776 = new int[1000];
        field785 = new class529[1000];
        field778 = 0;
        field701 = 0;
        field780 = 0;
        field800 = false;
        field782 = 0;
        field783 = new int[50];
        field784 = new int[50];
        field739 = new int[50];
        field534 = new int[50];
        field571 = new class40[50];
        field788 = false;
        field789 = false;
        field790 = false;
        field791 = false;
        field792 = null;
        field583 = null;
        field609 = null;
        field795 = false;
        field796 = new boolean[5];
        field589 = new int[5];
        field749 = new int[5];
        field659 = new int[5];
        field745 = new int[5];
        field801 = 256;
        field686 = 205;
        field803 = 256;
        field804 = 320;
        field805 = 1;
        field636 = 32767;
        field807 = 1;
        field808 = 32767;
        field809 = 0;
        field810 = 0;
        field743 = 0;
        field618 = 0;
        field813 = 0;
        field814 = new class329();
        field633 = -1;
        field816 = -1;
        field672 = new class474();
        field806 = new class368[8];
        field819 = new class67();
        field820 = new class424(8, class422.field4607);
        field723 = new class288(64);
        field613 = new class288(64);
        field823 = -1;
        field650 = -1;
        field696 = new ArrayList();
        field826 = new ArrayList(10);
        field827 = 0;
        field828 = 0;
        field829 = new class66();
        field830 = new int[50];
        field831 = new int[50];
    }

    @ObfuscatedName("im.gp(B)Lsi;")
    public static class483 method4150() {
        return Statics.field114;
    }

    @ObfuscatedName("client.br(I)V")
    public final void method527() {
    }

    public final void init() {
        if (!this.method542()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class102.field1336)) {
                            field554 = true;
                        } else {
                            field554 = false;
                        }
                        break;
                    case 4:
                        if (field533 == -1) {
                            field533 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field528 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field1676 = class374.method6357(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class347[] var4 = class347.method2730();
                        int var5 = 0;
                        class347 var7;
                        while (true) {
                            if (var5 >= var4.length) {
                                var7 = null;
                                break;
                            }
                            class347 var6 = var4[var5];
                            if (var6.field3886 == var3) {
                                var7 = var6;
                                break;
                            }
                            var5++;
                        }
                        Statics.field2883 = var7;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class102.field1336)) {
                        }
                        break;
                    case 9:
                        Statics.field3479 = var2;
                        break;
                    case 10:
                        class348[] var9 = new class348[] { class348.field3887, class348.field3897, class348.field3888, class348.field3894, class348.field3889, class348.field3892 };
                        Statics.field2998 = (class348) class373.method371(var9, Integer.parseInt(var2));
                        if (Statics.field2998 == class348.field3892) {
                            Statics.field4388 = class493.field4997;
                        } else {
                            Statics.field4388 = class493.field4999;
                        }
                        break;
                    case 11:
                        Statics.field5095 = var2;
                        break;
                    case 12:
                        field527 = Integer.parseInt(var2);
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
                        Statics.field2997 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field552 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2122 = var2;
                        break;
                    case 21:
                        field532 = Integer.parseInt(var2);
                        break;
                    case 25:
                        int var8 = var2.indexOf(".");
                        if (var8 == -1) {
                            field709 = Integer.parseInt(var2);
                        } else {
                            field709 = Integer.parseInt(var2.substring(0, var8));
                            Integer.parseInt(var2.substring(var8 + 1));
                        }
                }
            }
        }
        class231.field2601 = false;
        field531 = false;
        Statics.field3106 = this.getCodeBase().getHost();
        Statics.field3463 = new class360();
        String var10 = Statics.field2883.field3881;
        byte var11 = 0;
        if ((field528 & class511.field5078.method30()) != 0) {
            Statics.field167 = "beta";
        }
        try {
            class174.method2155("oldschool", Statics.field167, var10, var11, 22);
        } catch (Exception var13) {
            Statics.method2661((String) null, var13);
        }
        Statics.field2415 = this;
        Statics.field5268 = field533;
        method282();
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field574 = true;
        }
        if (field545 == -1) {
            if (this.method1185() || this.method1347()) {
                field545 = 5;
            } else {
                field545 = 0;
            }
        }
        this.method516(765, 503, 216, 1);
    }

    public void finalize() throws Throwable {
        class306.method3396(this);
        super.finalize();
    }

    @ObfuscatedName("ax.ga(B)V")
    public static void method282() {
        Statics.field145 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field41 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field1763 = System.getenv("JX_SESSION_ID");
        Statics.field1417 = System.getenv("JX_CHARACTER_ID");
        class76.method7749(System.getenv("JX_DISPLAY_NAME"));
    }

    @ObfuscatedName("client.gx(I)Z")
    public boolean method1475() {
        return this.field575 == 1;
    }

    public void setClient(int arg0) {
        this.field575 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field679 = arg0;
            class76.method816(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field577 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field611 == 10;
    }

    public long getAccountHash() {
        return this.field585;
    }

    @ObfuscatedName("client.gq(I)Z")
    public boolean method1185() {
        return Statics.field145 != null && !Statics.field145.trim().isEmpty() && Statics.field41 != null && !Statics.field41.trim().isEmpty();
    }

    @ObfuscatedName("client.gt(B)Z")
    public boolean method1347() {
        return Statics.field1763 != null && !Statics.field1763.trim().isEmpty() && Statics.field1417 != null && !Statics.field1417.trim().isEmpty();
    }

    @ObfuscatedName("client.gr(B)Z")
    public boolean method1187() {
        return this.field679 != null;
    }

    @ObfuscatedName("client.gz(Ljava/lang/String;I)V")
    public void method1400(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field5095 + "shield/oauth/token" + (new class464(var2)).method7659());
        class420 var4 = new class420();
        if (this.method1475()) {
            var4.method7099(field663);
        } else {
            var4.method7099(field779);
        }
        var4.method7096("Host", (new URL(Statics.field5095)).getHost());
        var4.method7103(class461.field4773);
        class10 var5 = class10.field33;
        RefreshAccessTokenRequester var6 = this.field577;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field574);
            this.field576 = this.field570.method159(var7);
        } else {
            this.field578 = var6.request(var5.method58(), var3, var4.method7095(), "");
        }
    }

    @ObfuscatedName("client.gn(Ljava/lang/String;B)V")
    public void method1189(String arg0) throws IOException {
        URL var2 = new URL(Statics.field5095 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class420 var3 = new class420();
        var3.method7135(arg0);
        class10 var4 = class10.field32;
        OtlTokenRequester var5 = this.field679;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field574);
            this.field649 = this.field570.method159(var6);
        } else {
            this.field573 = var5.request(var4.method58(), var2, var3.method7095(), "");
        }
    }

    @ObfuscatedName("client.ht(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1335(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field5095 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field33, this.field574);
        var4.method79().method7135(arg0);
        var4.method79().method7103(class461.field4773);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method72(new class463(var5));
        this.field649 = this.field570.method159(var4);
    }

    @ObfuscatedName("client.by(I)V")
    public final void method589() {
        class412.method5201(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field4880 = field552 == 0 ? 43594 : field527 + 40000;
        Statics.field1547 = field552 == 0 ? 443 : field527 + 50000;
        Statics.field7 = Statics.field4880;
        Statics.field1459 = class331.field3620;
        Statics.field1660 = class331.field3624;
        Statics.field3579 = class331.field3622;
        Statics.field3587 = class331.field3623;
        Statics.field4644 = new class114(this.field574, 216);
        this.method494();
        this.method497();
        Statics.field62 = this.method653();
        this.method646(field766, 0);
        this.method646(field675, 1);
        Statics.field18 = new class443(255, class174.field1865, class174.field1866, 500000);
        class495 var1 = null;
        class99 var2 = new class99();
        try {
            var1 = class174.method1076("", Statics.field2998.field3893, false);
            byte[] var3 = new byte[(int) var1.method8080()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method8081(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class99(new class515(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method8094();
            }
        } catch (Exception var11) {
        }
        Statics.field4737 = var2;
        this.method491();
        class32.method369(this, Statics.field90);
        Statics.method5055(Statics.field4737.method2365());
        Statics.field3367 = new class69(Statics.field4388);
        this.field570 = new class15("tokenRequest", 1, 1);
        if (!class306.field3408.contains(this)) {
            class306.field3408.add(this);
        }
        Statics.field2413 = new class217[1];
        class215 var10 = class215.field2382;
        Statics.field2413[0] = new class217(var10.field2384, var10.field2389);
    }

    @ObfuscatedName("ke.ho(B)Liz;")
    public static class213 method5038() {
        return field675;
    }

    @ObfuscatedName("client.bs(I)V")
    public final void method592() {
        field833++;
        this.method1193();
        while (true) {
            class378 var1 = class356.field4259;
            class355 var2;
            synchronized (class356.field4259) {
                var2 = (class355) class356.field4257.method6391();
            }
            if (var2 == null) {
                boolean var4 = class306.method4783();
                if (var4 && field800 && Statics.field4508 != null) {
                    Statics.field4508.method805();
                }
                method5215();
                field675.method3804();
                this.method495();
                class36 var5 = class36.field252;
                synchronized (class36.field252) {
                    class36.field241 = class36.field237;
                    class36.field255 = class36.field238;
                    class36.field233 = class36.field239;
                    class36.field242 = class36.field240;
                    class36.field249 = class36.field244;
                    class36.field250 = class36.field256;
                    class36.field251 = class36.field254;
                    class36.field234 = class36.field248;
                    class36.field244 = 0;
                }
                if (Statics.field62 != null) {
                    int var7 = Statics.field62.method302();
                    field740 = var7;
                }
                if (field611 == 0) {
                    method3534();
                    class35.method2676();
                } else if (field611 == 5) {
                    class76.method6283(this, Statics.field1279, Statics.field1058);
                    method3534();
                    class35.method2676();
                } else if (field611 == 10 || field611 == 11) {
                    class76.method6283(this, Statics.field1279, Statics.field1058);
                } else if (field611 == 20) {
                    class76.method6283(this, Statics.field1279, Statics.field1058);
                    this.method1196();
                } else if (field611 == 50) {
                    class76.method6283(this, Statics.field1279, Statics.field1058);
                    this.method1196();
                } else if (field611 == 25) {
                    method6349();
                }
                if (field611 == 30) {
                    this.method1386();
                } else if (field611 == 40 || field611 == 45) {
                    this.method1196();
                }
                return;
            }
            var2.field4254.method6124(var2.field4253, (int) var2.field4814, var2.field4251, false);
        }
    }

    @ObfuscatedName("client.bm(ZI)V")
    public final void method520(boolean arg0) {
        if ((field611 == 10 || field611 == 20 || field611 == 30) && field757 != 0L && class302.method655() > field757) {
            Statics.method5055(method3928());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field537[var2] = true;
            }
        }
        if (field611 == 0) {
            this.method513(class76.field938, class76.field939, arg0);
        } else if (field611 == 5) {
            class76.method2569(Statics.field451, Statics.field1279, Statics.field1058);
        } else if (field611 == 10 || field611 == 11) {
            class76.method2569(Statics.field451, Statics.field1279, Statics.field1058);
        } else if (field611 == 20) {
            class76.method2569(Statics.field451, Statics.field1279, Statics.field1058);
        } else if (field611 == 50) {
            class76.method2569(Statics.field451, Statics.field1279, Statics.field1058);
        } else if (field611 == 25) {
            if (field601 == 1) {
                if (field597 > field631) {
                    field631 = field597;
                }
                int var3 = (field631 * 50 - field597 * 50) / field631;
                method6982(class352.field3924 + class102.field1341 + class102.field1335 + var3 + "%" + class102.field1337, false);
            } else if (field601 == 2) {
                if (field599 > field600) {
                    field600 = field599;
                }
                int var4 = (field600 * 50 - field599 * 50) / field600 + 50;
                method6982(class352.field3924 + class102.field1341 + class102.field1335 + var4 + "%" + class102.field1337, false);
            } else {
                method6982(class352.field3924, false);
            }
        } else if (field611 == 30) {
            this.method1200();
        } else if (field611 == 40) {
            method6982(class352.field3925 + class102.field1341 + class352.field3926, false);
        } else if (field611 == 45) {
            method6982(class352.field4185, false);
        }
        if (field611 == 30 && field756 == 0 && !arg0 && !field758) {
            for (int var5 = 0; var5 < field698; var5++) {
                if (field750[var5]) {
                    Statics.field1358.method465(field752[var5], field753[var5], field754[var5], field755[var5]);
                    field750[var5] = false;
                }
            }
        } else if (field611 > 0) {
            Statics.field1358.method472(0, 0);
            for (int var6 = 0; var6 < field698; var6++) {
                field750[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.bf(I)V")
    public final void method489() {
        if (Statics.field137.method2607()) {
            Statics.field137.method2604();
        }
        if (Statics.field1505 != null) {
            Statics.field1505.field1105 = false;
        }
        Statics.field1505 = null;
        field592.method2674();
        if (class36.field252 != null) {
            class36 var1 = class36.field252;
            synchronized (class36.field252) {
                class36.field252 = null;
            }
        }
        Statics.field62 = null;
        if (Statics.field4508 != null) {
            Statics.field4508.method799();
        }
        Statics.field3463.method6223();
        class356.method3865();
        if (Statics.field4644 != null) {
            Statics.field4644.method2692();
            Statics.field4644 = null;
        }
        class174.method8235();
        this.field570.method167();
    }

    @ObfuscatedName("pw.hj(B)V")
    public static void method7087() {
        if (Statics.field137.method2607()) {
            Statics.field137.method2604();
        }
        if (Statics.field1505 != null) {
            Statics.field1505.field1105 = false;
        }
        Statics.field1505 = null;
        field592.method2674();
        if (Statics.field201 != null) {
            try {
                Statics.field201.method3208();
            } catch (Exception var4) {
            }
        }
        Statics.field201 = null;
        method2138();
        Statics.field4.method6142();
        Statics.field1158.method6142();
        Statics.field1372.method6142();
        Statics.field1039.method6142();
        Statics.field47.method6142();
        Statics.field1965.method6142();
        Statics.field1677.method6142();
        Statics.field2546.method6142();
        method1993();
        Statics.field1570.method4201();
        for (int var1 = 0; var1 < 4; var1++) {
            field602[var1].method3853();
        }
        Statics.field114 = null;
        class306.method2092(0, 0);
        Statics.method2707();
        field800 = false;
        class70.method6634();
        if (Statics.field4508 != null) {
            Statics.field4508.method799();
        }
        Statics.field3463.method6223();
        class356.method3865();
        if (Statics.field4644 != null) {
            Statics.field4644.method2692();
        }
        class174.method8235();
        class174.field1865 = null;
        class174.field1866 = null;
        Statics.field2855 = null;
        Statics.method2178();
        Statics.field18 = null;
        field826.clear();
        field828 = 0;
        Statics.field3463 = new class360();
        Statics.field4644 = new class114(Statics.field2415.field574, 216);
        try {
            class174.method2155("oldschool", Statics.field167, Statics.field2883.field3881, 0, 22);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
        Statics.field18 = new class443(255, class174.field1865, class174.field1866, 500000);
        Statics.field201 = new class172();
        Statics.field2415.method508();
        field559 = class93.field1170;
        method5473(0);
    }

    @ObfuscatedName("cj.hh(I)V")
    public static void method1993() {
        Statics.field607 = null;
        Statics.field1826 = null;
        Statics.field3371 = null;
        Statics.field1895 = null;
        Statics.field5030 = null;
        Statics.field1064 = null;
        Statics.field509 = null;
        Statics.field1718 = null;
        Statics.field2290 = null;
        Statics.field525 = null;
        Statics.field4756 = null;
    }

    @ObfuscatedName("mu.hi(IB)V")
    public static void method5473(int arg0) {
        if (field611 == arg0) {
            return;
        }
        if (field611 == 30) {
            field766.method3792();
        }
        if (field611 == 0) {
            Statics.field2415.method652();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method5471(0);
            field542 = 0;
            field593 = 0;
            field595.method7064(arg0);
            if (arg0 != 20) {
                method2268(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field4676 != null) {
            Statics.field4676.method7386();
            Statics.field4676 = null;
        }
        if (field611 == 25) {
            field601 = 0;
            field597 = 0;
            field631 = 1;
            field599 = 0;
            field600 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field4737.method2363() >= field532;
            int var3 = var2 ? 0 : 12;
            class76.method7067(Statics.field1666, Statics.field305, true, var3);
        } else if (arg0 == 20) {
            int var1 = field611 == 11 ? 4 : 0;
            class76.method7067(Statics.field1666, Statics.field305, false, var1);
        } else if (arg0 == 11) {
            class76.method7067(Statics.field1666, Statics.field305, false, 4);
        } else if (arg0 == 50) {
            class76.method5478("", "Updating date of birth...", "");
            class76.method7067(Statics.field1666, Statics.field305, false, 7);
        } else if (Statics.field4516) {
            Statics.field933 = null;
            Statics.field2418 = null;
            Statics.field932 = null;
            Statics.field935 = null;
            Statics.field4721 = null;
            Statics.field330 = null;
            Statics.field68 = null;
            Statics.field930 = null;
            Statics.field1492 = null;
            Statics.field925 = null;
            Statics.field340 = null;
            Statics.field3484 = null;
            Statics.field1057 = null;
            Statics.field1967 = null;
            Statics.field1650.method2310();
            class306.method2092(0, 100);
            Statics.method3862().method6216(true);
            Statics.field4516 = false;
        }
        field611 = arg0;
    }

    @ObfuscatedName("client.hd(I)V")
    public void method1193() {
        if (field611 != 1000) {
            boolean var1 = Statics.field3463.method6220();
            if (!var1) {
                this.method1329();
            }
        }
    }

    @ObfuscatedName("client.hk(I)V")
    public void method1329() {
        if (Statics.field3463.field4301 >= 4) {
            this.method521("js5crc");
            method5473(1000);
            return;
        }
        if (Statics.field3463.field4324 >= 4) {
            if (field611 <= 5) {
                this.method521("js5io");
                method5473(1000);
                return;
            }
            field561 = 3000;
            Statics.field3463.field4324 = 3;
        }
        if (--field561 + 1 > 0) {
            return;
        }
        try {
            if (field560 == 0) {
                Statics.field1511 = Statics.field201.method3204(Statics.field3106, Statics.field7);
                field560++;
            }
            if (field560 == 1) {
                if (Statics.field1511.field1905 == 2) {
                    this.method1304(-1);
                    return;
                }
                if (Statics.field1511.field1905 == 1) {
                    field560++;
                }
            }
            if (field560 == 2) {
                Socket var1 = (Socket) Statics.field1511.field1906;
                class440 var2 = new class440(var1, 40000, 5000);
                Statics.field448 = var2;
                class515 var3 = new class515(5);
                var3.method8283(15);
                var3.method8464(216);
                Statics.field448.method7369(var3.field5108, 0, 5);
                field560++;
                Statics.field3043 = class302.method655();
            }
            if (field560 == 3) {
                if (Statics.field448.method7368() > 0) {
                    int var4 = Statics.field448.method7380();
                    if (var4 != 0) {
                        this.method1304(var4);
                        return;
                    }
                    field560++;
                } else if (class302.method655() - Statics.field3043 > 30000L) {
                    this.method1304(-2);
                    return;
                }
            }
            if (field560 == 4) {
                Statics.field3463.method6215(Statics.field448, field611 > 20);
                Statics.field1511 = null;
                Statics.field448 = null;
                field560 = 0;
                field707 = 0;
            }
        } catch (IOException var6) {
            this.method1304(-3);
        }
    }

    @ObfuscatedName("client.hz(IB)V")
    public void method1304(int arg0) {
        Statics.field1511 = null;
        Statics.field448 = null;
        field560 = 0;
        if (Statics.field7 == Statics.field4880) {
            Statics.field7 = Statics.field1547;
        } else {
            Statics.field7 = Statics.field4880;
        }
        field707++;
        if (field707 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field611 <= 5) {
                this.method521("js5connect_full");
                method5473(1000);
            } else {
                field561 = 3000;
            }
        } else if (field707 >= 2 && arg0 == 6) {
            this.method521("js5connect_outofdate");
            method5473(1000);
        } else if (field707 >= 4) {
            if (field611 <= 5) {
                this.method521("js5connect");
                method5473(1000);
            } else {
                field561 = 3000;
            }
        }
    }

    @ObfuscatedName("rn.hl(Lnk;Ljava/lang/String;I)V")
    public static void method7685(class357 arg0, String arg1) {
        class84 var2 = new class84(arg0, arg1);
        field826.add(var2);
        field828 += var2.field1061;
    }

    @ObfuscatedName("di.hg(I)Z")
    public static boolean method2099() {
        if (field826 == null || field827 >= field826.size()) {
            return true;
        }
        while (field827 < field826.size()) {
            class84 var0 = (class84) field826.get(field827);
            if (!var0.method2158()) {
                return false;
            }
            field827++;
        }
        return true;
    }

    @ObfuscatedName("ci.hu(I)I")
    public static int method1832() {
        if (field826 == null || field827 >= field826.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field827; var1++) {
            var0 += ((class84) field826.get(var1)).field1062;
        }
        return var0 * 10000 / field828;
    }

    @ObfuscatedName("gy.he(IB)I")
    public static int method3219(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("hx.hq(B)V")
    public static void method3534() {
        if (field559 == class93.field1170) {
            Statics.field1570 = new class231(4, 104, 104, class82.field1048);
            for (int var0 = 0; var0 < 4; var0++) {
                field602[var0] = new class214(104, 104);
            }
            Statics.field4659 = new class529(512, 512);
            class76.field939 = class352.field3927;
            class76.field938 = 5;
            field559 = class93.field1160;
        } else if (field559 == class93.field1160) {
            class76.field939 = class352.field3928;
            class76.field938 = 10;
            field559 = class93.field1169;
        } else if (field559 == class93.field1169) {
            Statics.field1352 = method2913(0, false, true, true, false);
            Statics.field3526 = method2913(1, false, true, true, false);
            Statics.field4 = method2913(2, true, false, true, false);
            Statics.field875 = method2913(3, false, true, true, false);
            Statics.field162 = method2913(4, false, true, true, false);
            Statics.field5023 = method2913(5, true, true, true, false);
            Statics.field4431 = method2913(6, true, true, true, false);
            Statics.field508 = method2913(7, false, true, true, false);
            Statics.field305 = method2913(8, false, true, true, false);
            Statics.field1692 = method2913(9, false, true, true, false);
            Statics.field1666 = method2913(10, false, true, true, false);
            Statics.field4436 = method2913(11, false, true, true, false);
            Statics.field4358 = method2913(12, false, true, true, false);
            Statics.field1158 = method2913(13, true, false, true, false);
            Statics.field1372 = method2913(14, false, true, true, false);
            Statics.field1039 = method2913(15, false, true, true, false);
            Statics.field47 = method2913(17, true, true, true, false);
            Statics.field1965 = method2913(18, false, true, true, false);
            Statics.field1677 = method2913(19, false, true, true, false);
            Statics.field2546 = method2913(20, false, true, true, false);
            Statics.field3870 = method2913(21, false, true, true, true);
            class76.field939 = class352.field3953;
            class76.field938 = 20;
            field559 = class93.field1162;
        } else if (field559 == class93.field1162) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1352.method6083() * 4 / 100;
            int var3 = var2 + Statics.field3526.method6083() * 4 / 100;
            int var4 = var3 + Statics.field4.method6083() * 2 / 100;
            int var5 = var4 + Statics.field875.method6083() * 2 / 100;
            int var6 = var5 + Statics.field162.method6083() * 6 / 100;
            int var7 = var6 + Statics.field5023.method6083() * 4 / 100;
            int var8 = var7 + Statics.field4431.method6083() * 2 / 100;
            int var9 = var8 + Statics.field508.method6083() * 55 / 100;
            int var10 = var9 + Statics.field305.method6083() * 2 / 100;
            int var11 = var10 + Statics.field1692.method6083() * 2 / 100;
            int var12 = var11 + Statics.field1666.method6083() * 2 / 100;
            int var13 = var12 + Statics.field4436.method6083() * 2 / 100;
            int var14 = var13 + Statics.field4358.method6083() * 2 / 100;
            int var15 = var14 + Statics.field1158.method6083() * 2 / 100;
            int var16 = var15 + Statics.field1372.method6083() * 2 / 100;
            int var17 = var16 + Statics.field1039.method6083() * 2 / 100;
            int var18 = var17 + Statics.field1677.method6083() / 100;
            int var19 = var18 + Statics.field1965.method6083() / 100;
            int var20 = var19 + Statics.field2546.method6083() / 100;
            int var21 = var20 + Statics.field3870.method6083() / 100;
            int var22 = var21 + (Statics.field47.method6109() && Statics.field47.method6133() ? 1 : 0);
            if (var22 == 100) {
                method7685(Statics.field1352, "Animations");
                method7685(Statics.field3526, "Skeletons");
                method7685(Statics.field162, "Sound FX");
                method7685(Statics.field5023, "Maps");
                method7685(Statics.field4431, "Music Tracks");
                method7685(Statics.field508, "Models");
                method7685(Statics.field305, "Sprites");
                method7685(Statics.field4436, "Music Jingles");
                method7685(Statics.field1372, "Music Samples");
                method7685(Statics.field1039, "Music Patches");
                method7685(Statics.field1677, "World Map");
                method7685(Statics.field1965, "World Map Geography");
                method7685(Statics.field2546, "World Map Ground");
                Statics.field4433 = new class445();
                Statics.field4433.method7442(Statics.field47);
                class76.field939 = class352.field3931;
                class76.field938 = 30;
                field559 = class93.field1163;
            } else {
                if (var22 != 0) {
                    class76.field939 = class352.field3930 + var22 + "%";
                }
                class76.field938 = 30;
            }
        } else if (field559 == class93.field1163) {
            class43.method8181(22050, !field531, 2);
            ArrayList var23 = new ArrayList(3);
            Statics.field4508 = class43.method2565(Statics.field201, 0, 2048);
            Statics.field1794 = new class39();
            class39 var24 = new class39();
            var24.method734(Statics.field1794);
            for (int var25 = 0; var25 < 3; var25++) {
                class307 var26 = new class307();
                var26.method5299(9, 128);
                var24.method734(var26);
                var23.add(var26);
            }
            Statics.field4508.method796(var24);
            class357 var27 = Statics.field1039;
            class357 var28 = Statics.field1372;
            class357 var29 = Statics.field162;
            Statics.field3400 = var27;
            Statics.field3401 = var28;
            Statics.field3404 = var29;
            class306.field3403 = var23;
            Statics.field3625 = new class58(22050, Statics.field294);
            class76.field939 = class352.field3932;
            class76.field938 = 35;
            field559 = class93.field1167;
            Statics.field3231 = new class484(Statics.field305, Statics.field1158);
        } else if (field559 == class93.field1167) {
            class485[] var30 = new class485[] { class485.field4964, class485.field4957, class485.field4955, class485.field4962, class485.field4959, class485.field4958 };
            int var31 = var30.length;
            class484 var32 = Statics.field3231;
            class485[] var33 = new class485[] { class485.field4964, class485.field4957, class485.field4955, class485.field4962, class485.field4959, class485.field4958 };
            field596 = var32.method7977(var33);
            if (field596.size() < var31) {
                class76.field939 = class352.field4125 + field596.size() * 100 / var31 + "%";
                class76.field938 = 40;
            } else {
                Statics.field1279 = (class394) field596.get(class485.field4959);
                Statics.field1058 = (class394) field596.get(class485.field4958);
                Statics.field451 = (class394) field596.get(class485.field4962);
                Statics.field93 = field672.method7706();
                class76.field939 = class352.field3934;
                class76.field938 = 40;
                field559 = class93.field1165;
            }
        } else if (field559 == class93.field1165) {
            class357 var34 = Statics.field1666;
            class357 var35 = Statics.field305;
            int var36 = 0;
            String[] var37 = class76.field947;
            for (int var38 = 0; var38 < var37.length; var38++) {
                String var39 = var37[var38];
                if (var34.method6147(var39, "")) {
                    var36++;
                }
            }
            String[] var40 = class76.field968;
            for (int var41 = 0; var41 < var40.length; var41++) {
                String var42 = var40[var41];
                if (var35.method6147(var42, "")) {
                    var36++;
                }
            }
            String[] var43 = class76.field972;
            for (int var44 = 0; var44 < var43.length; var44++) {
                String var45 = var43[var44];
                if (var35.method6167(var45) != -1 && var35.method6147(var45, "")) {
                    var36++;
                }
            }
            class357 var48 = Statics.field305;
            int var49 = class76.field968.length + class76.field947.length;
            String[] var50 = class76.field972;
            for (int var51 = 0; var51 < var50.length; var51++) {
                String var52 = var50[var51];
                if (var48.method6167(var52) != -1) {
                    var49++;
                }
            }
            if (var36 < var49) {
                class76.field939 = class352.field3935 + var36 * 100 / var49 + "%";
                class76.field938 = 50;
            } else {
                class76.field939 = class352.field3936;
                class76.field938 = 50;
                method5473(5);
                field559 = class93.field1166;
            }
        } else if (field559 == class93.field1166) {
            if (!Statics.field4.method6133()) {
                class76.field939 = class352.field3937 + Statics.field4.method6120() + "%";
                class76.field938 = 60;
            } else if (Statics.field3870.method6133()) {
                class208.method5514(Statics.field4);
                class200.method2075(Statics.field4);
                class357 var55 = Statics.field4;
                class357 var56 = Statics.field508;
                Statics.field1978 = var55;
                Statics.field1979 = var56;
                Statics.field1981 = Statics.field1978.method6173(3);
                class357 var57 = Statics.field4;
                class357 var58 = Statics.field508;
                boolean var59 = field531;
                Statics.field2174 = var57;
                Statics.field2172 = var58;
                class206.field2220 = var59;
                class357 var60 = Statics.field4;
                class357 var61 = Statics.field508;
                Statics.field2032 = var60;
                Statics.field2033 = var61;
                class357 var62 = Statics.field4;
                Statics.field2144 = var62;
                class357 var63 = Statics.field4;
                class357 var64 = Statics.field508;
                boolean var65 = field554;
                class394 var66 = Statics.field1279;
                Statics.field4424 = var63;
                Statics.field2228 = var64;
                Statics.field2229 = var65;
                Statics.field1323 = Statics.field4424.method6173(10);
                Statics.field4760 = var66;
                class209.method4155(Statics.field4, Statics.field1352, Statics.field3526);
                class357 var67 = Statics.field4;
                class357 var68 = Statics.field508;
                Statics.field2110 = var67;
                Statics.field2097 = var68;
                class202.method5202(Statics.field4);
                class187.method3244(Statics.field4);
                class357 var69 = Statics.field875;
                class357 var70 = Statics.field508;
                class357 var71 = Statics.field305;
                class357 var72 = Statics.field1158;
                int var73 = 0;
                if (var69 != null) {
                    Statics.field422 = var69;
                    Statics.field353 = var70;
                    Statics.field4379 = var71;
                    Statics.field1755 = var72;
                    var73 = Statics.field422.method6139();
                }
                Statics.field3229 = new class332[var73][];
                Statics.field3509 = new boolean[var73];
                class186.method6372(Statics.field4);
                class357 var74 = Statics.field4;
                Statics.field2015 = var74;
                class357 var75 = Statics.field4;
                Statics.field1975 = var75;
                class357 var76 = Statics.field4;
                class203.method2946(Statics.field4);
                Statics.method7394(Statics.field4);
                class508.method4660(Statics.field4);
                Statics.field352 = new class498(Statics.field2998, 54, Statics.field1676, Statics.field4);
                Statics.field4511 = new class498(Statics.field2998, 47, Statics.field1676, Statics.field4);
                Statics.field137 = new class110();
                class357 var77 = Statics.field4;
                class357 var78 = Statics.field305;
                class357 var79 = Statics.field1158;
                Statics.field2165 = var77;
                Statics.field2147 = var78;
                Statics.field2149 = var79;
                class191.method2983(Statics.field4, Statics.field305);
                class357 var80 = Statics.field4;
                class357 var81 = Statics.field305;
                Statics.field1953 = var81;
                if (var80.method6133()) {
                    Statics.field1942 = var80.method6173(35);
                    Statics.field1941 = new class188[Statics.field1942];
                    for (int var82 = 0; var82 < Statics.field1942; var82++) {
                        byte[] var83 = var80.method6128(35, var82);
                        Statics.field1941[var82] = new class188(var82);
                        if (var83 != null) {
                            Statics.field1941[var82].method3297(new class515(var83));
                            Statics.field1941[var82].method3299();
                        }
                    }
                }
                class76.field939 = class352.field4130;
                class76.field938 = 60;
                field559 = class93.field1159;
            } else {
                class76.field939 = class352.field3937 + (80 + Statics.field4358.method6120() / 6) + "%";
                class76.field938 = 60;
            }
        } else if (field559 == class93.field1159) {
            int var84 = 0;
            if (Statics.field607 == null) {
                Statics.field607 = class530.method2154(Statics.field305, Statics.field4433.field4716, 0);
            } else {
                var84++;
            }
            if (Statics.field1826 == null) {
                Statics.field1826 = class530.method2154(Statics.field305, Statics.field4433.field4706, 0);
            } else {
                var84++;
            }
            if (Statics.field3371 == null) {
                Statics.field3371 = class530.method418(Statics.field305, Statics.field4433.field4709, 0);
            } else {
                var84++;
            }
            if (Statics.field1895 == null) {
                Statics.field1895 = class530.method7773(Statics.field305, Statics.field4433.field4708, 0);
            } else {
                var84++;
            }
            if (Statics.field5030 == null) {
                Statics.field5030 = class530.method7773(Statics.field305, Statics.field4433.field4714, 0);
            } else {
                var84++;
            }
            if (Statics.field1064 == null) {
                Statics.field1064 = class530.method7773(Statics.field305, Statics.field4433.field4705, 0);
            } else {
                var84++;
            }
            if (Statics.field509 == null) {
                Statics.field509 = class530.method7773(Statics.field305, Statics.field4433.field4711, 0);
            } else {
                var84++;
            }
            if (Statics.field1718 == null) {
                Statics.field1718 = class530.method7773(Statics.field305, Statics.field4433.field4712, 0);
            } else {
                var84++;
            }
            if (Statics.field2290 == null) {
                Statics.field2290 = class530.method7773(Statics.field305, Statics.field4433.field4713, 0);
            } else {
                var84++;
            }
            if (Statics.field525 == null) {
                Statics.field525 = class530.method418(Statics.field305, Statics.field4433.field4710, 0);
            } else {
                var84++;
            }
            if (Statics.field4756 == null) {
                Statics.field4756 = class530.method418(Statics.field305, Statics.field4433.field4715, 0);
            } else {
                var84++;
            }
            if (var84 < 11) {
                class76.field939 = class352.field3939 + var84 * 100 / 12 + "%";
                class76.field938 = 70;
            } else {
                Statics.field4480 = Statics.field4756;
                Statics.field1826.method8716();
                int var85 = (int) (Math.random() * 21.0D) - 10;
                int var86 = (int) (Math.random() * 21.0D) - 10;
                int var87 = (int) (Math.random() * 21.0D) - 10;
                int var88 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3371[0].method8696(var85 + var88, var86 + var88, var87 + var88);
                class76.field939 = class352.field3940;
                class76.field938 = 70;
                field559 = class93.field1174;
            }
        } else if (field559 == class93.field1174) {
            if (Statics.field1692.method6133()) {
                Statics.field1545 = new class237(Statics.field1692, Statics.field305, 20, Statics.field4737.method2400(), field531 ? 64 : 128);
                class227.method4052(Statics.field1545);
                class227.method4053(Statics.field4737.method2400());
                field559 = class93.field1175;
            } else {
                class76.field939 = class352.field3941 + "0%";
                class76.field938 = 90;
            }
        } else if (field559 == class93.field1175) {
            int var89 = Statics.field1545.method4401();
            if (var89 < 100) {
                class76.field939 = class352.field3941 + var89 + "%";
                class76.field938 = 90;
            } else {
                class76.field939 = class352.field4219;
                class76.field938 = 90;
                field559 = class93.field1172;
            }
        } else if (field559 == class93.field1172) {
            Statics.field1505 = new class89();
            Statics.field201.method3205(Statics.field1505, 10);
            class76.field939 = class352.field4047;
            class76.field938 = 92;
            field559 = class93.field1171;
        } else if (field559 == class93.field1171) {
            if (Statics.field1666.method6147("huffman", "")) {
                class334 var90 = new class334(Statics.field1666.method6146("huffman", ""));
                class335.method2771(var90);
                class76.field939 = class352.field3945;
                class76.field938 = 94;
                field559 = class93.field1164;
            } else {
                class76.field939 = class352.field3966 + "%";
                class76.field938 = 94;
            }
        } else if (field559 == class93.field1164) {
            if (!Statics.field875.method6133()) {
                class76.field939 = class352.field3946 + Statics.field875.method6120() * 4 / 5 + "%";
                class76.field938 = 96;
            } else if (!Statics.field4358.method6133()) {
                class76.field939 = class352.field3946 + (80 + Statics.field4358.method6120() / 6) + "%";
                class76.field938 = 96;
            } else if (Statics.field1158.method6133()) {
                class76.field939 = class352.field3947;
                class76.field938 = 98;
                if (Statics.field4358.method6150("version.dat", "")) {
                    class515 var91 = new class515(Statics.field4358.method6146("version.dat", ""));
                    var91.method8448();
                }
                field559 = class93.field1173;
            } else {
                class76.field939 = class352.field3946 + (96 + Statics.field1158.method6120() / 50) + "%";
                class76.field938 = 96;
            }
        } else if (field559 == class93.field1173) {
            class76.field938 = 100;
            if (Statics.field1677.method6139() <= 0 || Statics.field1677.method6148(class276.field3069.field3068)) {
                if (Statics.field114 == null) {
                    Statics.field114 = new class483();
                    Statics.field114.method7775(Statics.field1677, Statics.field1965, Statics.field2546, Statics.field451, field596, Statics.field3371);
                }
                class76.field939 = class352.field4048;
                field559 = class93.field1161;
            } else {
                class76.field939 = class352.field3948 + Statics.field1677.method6193(class276.field3069.field3068) / 10 + "%";
            }
        } else if (field559 == class93.field1161) {
            method5473(10);
        }
    }

    @ObfuscatedName("fl.hw(IZZZZI)Lnk;")
    public static class357 method2913(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class443 var5 = null;
        if (class174.field1865 != null) {
            var5 = new class443(arg0, class174.field1865, Statics.field2855[arg0], 1000000);
        }
        return new class357(var5, Statics.field18, Statics.field3463, arg0, arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("client.hy(B)V")
    public final void method1196() {
        class439 var1 = field592.method2669();
        class514 var2 = field592.field1430;
        try {
            if (field563 == 0) {
                if (Statics.field906 == null && (field582.method2061() || field542 > 250)) {
                    Statics.field906 = field582.method2062();
                    field582.method2072();
                    field582 = null;
                }
                if (Statics.field906 != null) {
                    if (var1 != null) {
                        var1.method7386();
                        var1 = null;
                    }
                    Statics.field1977 = null;
                    field594 = false;
                    field542 = 0;
                    if (!field572.method8579()) {
                        method5471(1);
                    } else if (this.method1185()) {
                        try {
                            this.method1400(Statics.field41);
                            method5471(21);
                        } catch (Throwable var77) {
                            Statics.method2661((String) null, var77);
                            method6628(65);
                            return;
                        }
                    } else if (this.method1347()) {
                        try {
                            this.method1335(Statics.field1763, Statics.field1417);
                            method5471(20);
                        } catch (Exception var76) {
                            Statics.method2661((String) null, var76);
                            method6628(65);
                            return;
                        }
                    } else {
                        method6628(65);
                        return;
                    }
                }
            }
            if (field563 == 21) {
                if (this.field578 == null) {
                    if (this.field576 == null) {
                        method6628(65);
                        return;
                    }
                    if (!this.field576.method265()) {
                        return;
                    }
                    if (this.field576.method270()) {
                        Statics.method2661(this.field576.method280(), (Throwable) null);
                        method6628(65);
                        this.field576 = null;
                        return;
                    }
                    class21 var7 = this.field576.method275();
                    if (var7.method290() != 200) {
                        method6628(65);
                        this.field576 = null;
                        return;
                    }
                    field542 = 0;
                    class463 var8 = new class463(var7.method293());
                    try {
                        Statics.field145 = var8.method7652().getString("access_token");
                        Statics.field41 = var8.method7652().getString("refresh_token");
                    } catch (Exception var74) {
                        Statics.method2661("Error parsing tokens", var74);
                        method6628(65);
                        this.field576 = null;
                        return;
                    }
                } else if (this.field578.isDone()) {
                    if (this.field578.isCancelled()) {
                        method6628(65);
                        this.field578 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field578.get();
                        if (!var5.isSuccess()) {
                            method6628(65);
                            this.field578 = null;
                            return;
                        }
                        Statics.field145 = var5.getAccessToken();
                        Statics.field41 = var5.getRefreshToken();
                        this.field578 = null;
                    } catch (Exception var75) {
                        Statics.method2661((String) null, var75);
                        method6628(65);
                        this.field578 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1189(Statics.field145);
                method5471(20);
            }
            if (field563 == 20) {
                if (this.field573 == null) {
                    if (this.field649 == null) {
                        method6628(65);
                        return;
                    }
                    if (!this.field649.method265()) {
                        return;
                    }
                    if (this.field649.method270()) {
                        Statics.method2661(this.field649.method280(), (Throwable) null);
                        method6628(65);
                        this.field649 = null;
                        return;
                    }
                    class21 var12 = this.field649.method275();
                    if (var12.method290() != 200) {
                        Statics.method2661("Response code: " + var12.method290() + "Response body: " + var12.method293(), (Throwable) null);
                        method6628(65);
                        this.field649 = null;
                        return;
                    }
                    List var13 = (List) var12.method292().get("Content-Type");
                    if (var13 != null && var13.contains(class461.field4773.method7642())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method293());
                            this.field569 = var14.getString("token");
                        } catch (JSONException var72) {
                            Statics.method2661((String) null, var72);
                            method6628(65);
                            this.field649 = null;
                            return;
                        }
                    } else {
                        this.field569 = var12.method293();
                    }
                    this.field649 = null;
                } else if (this.field573.isDone()) {
                    if (this.field573.isCancelled()) {
                        method6628(65);
                        this.field573 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field573.get();
                        if (!var10.isSuccess()) {
                            method6628(65);
                            this.field573 = null;
                            return;
                        }
                        this.field569 = var10.getToken();
                        this.field573 = null;
                    } catch (Exception var73) {
                        Statics.method2661((String) null, var73);
                        method6628(65);
                        this.field573 = null;
                        return;
                    }
                } else {
                    return;
                }
                field542 = 0;
                method5471(1);
            }
            if (field563 == 1) {
                if (Statics.field1977 == null) {
                    Statics.field1977 = Statics.field201.method3204(Statics.field3106, Statics.field7);
                }
                if (Statics.field1977.field1905 == 2) {
                    throw new IOException();
                }
                if (Statics.field1977.field1905 == 1) {
                    Socket var16 = (Socket) Statics.field1977.field1906;
                    class440 var17 = new class440(var16, 40000, 5000);
                    var1 = var17;
                    field592.method2666(var17);
                    Statics.field1977 = null;
                    method5471(2);
                }
            }
            if (field563 == 2) {
                field592.method2678();
                class297 var18 = class297.method2971();
                var18.field3221 = null;
                var18.field3222 = 0;
                var18.field3227 = new class514(5000);
                var18.field3227.method8283(class299.field3366.field3364);
                field592.method2665(var18);
                field592.method2664();
                var2.field5111 = 0;
                method5471(3);
            }
            if (field563 == 3) {
                if (Statics.field4508 != null) {
                    Statics.field4508.method797();
                }
                if (var1.method7364(1)) {
                    int var21 = var1.method7380();
                    if (Statics.field4508 != null) {
                        Statics.field4508.method797();
                    }
                    if (var21 != 0) {
                        method6628(var21);
                        return;
                    }
                    var2.field5111 = 0;
                    method5471(4);
                }
            }
            if (field563 == 4) {
                if (var2.field5111 < 8) {
                    int var22 = var1.method7368();
                    if (var22 > 8 - var2.field5111) {
                        var22 = 8 - var2.field5111;
                    }
                    if (var22 > 0) {
                        var1.method7367(var2.field5108, var2.field5111, var22);
                        var2.field5111 += var22;
                    }
                }
                if (var2.field5111 == 8) {
                    var2.field5111 = 0;
                    Statics.field1502 = var2.method8307();
                    method5471(5);
                }
            }
            if (field563 == 5) {
                field592.field1430.field5111 = 0;
                field592.method2678();
                class514 var23 = new class514(500);
                int[] var24 = new int[] { Statics.field906.nextInt(), Statics.field906.nextInt(), Statics.field906.nextInt(), Statics.field906.nextInt() };
                var23.field5111 = 0;
                var23.method8283(1);
                var23.method8464(var24[0]);
                var23.method8464(var24[1]);
                var23.method8464(var24[2]);
                var23.method8464(var24[3]);
                var23.method8341(Statics.field1502);
                if (field611 == 40) {
                    var23.method8464(Statics.field2030[0]);
                    var23.method8464(Statics.field2030[1]);
                    var23.method8464(Statics.field2030[2]);
                    var23.method8464(Statics.field2030[3]);
                } else {
                    if (field611 == 50) {
                        var23.method8283(class140.field1649.method30());
                        var23.method8464(Statics.field907);
                    } else {
                        var23.method8283(field777.method30());
                        switch(field777.field1652) {
                            case 0:
                                var23.method8464(Statics.field4737.method2401(class76.field960));
                            case 1:
                            default:
                                break;
                            case 2:
                            case 4:
                                var23.method8384(Statics.field5040);
                                var23.field5111++;
                                break;
                            case 3:
                                var23.field5111 += 4;
                        }
                    }
                    if (field572.method8579()) {
                        var23.method8283(class520.field5165.method30());
                        var23.method8290(this.field569);
                    } else {
                        var23.method8283(class520.field5166.method30());
                        var23.method8290(class76.field953);
                    }
                }
                var23.method8348(class75.field926, class75.field929);
                Statics.field2030 = var24;
                class297 var25 = class297.method2971();
                var25.field3221 = null;
                var25.field3222 = 0;
                var25.field3227 = new class514(5000);
                var25.field3227.field5111 = 0;
                if (field611 == 40) {
                    var25.field3227.method8283(class299.field3361.field3364);
                } else {
                    var25.field3227.method8283(class299.field3360.field3364);
                }
                var25.field3227.method8345(0);
                int var28 = var25.field3227.field5111;
                var25.field3227.method8464(216);
                var25.field3227.method8464(1);
                var25.field3227.method8283(field533);
                var25.field3227.method8283(field545);
                byte var29 = 0;
                var25.field3227.method8283(var29);
                var25.field3227.method8293(var23.field5108, 0, var23.field5111);
                int var30 = var25.field3227.field5111;
                var25.field3227.method8290(class76.field960);
                var25.field3227.method8283((field758 ? 1 : 0) << 1 | (field531 ? 1 : 0));
                var25.field3227.method8345(Statics.field1450);
                var25.field3227.method8345(Statics.field1890);
                method3251(var25.field3227);
                var25.field3227.method8290(Statics.field3479);
                var25.field3227.method8464(Statics.field2997);
                if (field709 > 213) {
                    var25.field3227.method8283(0);
                }
                class515 var31 = new class515(Statics.field93.method7725());
                Statics.field93.method7724(var31);
                var25.field3227.method8293(var31.field5108, 0, var31.field5108.length);
                var25.field3227.method8283(field533);
                var25.field3227.method8464(0);
                var25.field3227.method8312(Statics.field5023.field4294);
                var25.field3227.method8312(Statics.field1039.field4294);
                var25.field3227.method8312(Statics.field1372.field4294);
                var25.field3227.method8312(Statics.field1692.field4294);
                var25.field3227.method8312(Statics.field4436.field4294);
                var25.field3227.method8354(Statics.field875.field4294);
                var25.field3227.method8464(Statics.field2546.field4294);
                var25.field3227.method8353(Statics.field162.field4294);
                var25.field3227.method8464(Statics.field1352.field4294);
                var25.field3227.method8312(Statics.field47.field4294);
                var25.field3227.method8312(0);
                var25.field3227.method8354(Statics.field1677.field4294);
                var25.field3227.method8312(Statics.field1158.field4294);
                var25.field3227.method8353(Statics.field1666.field4294);
                var25.field3227.method8312(Statics.field4.field4294);
                var25.field3227.method8354(Statics.field3526.field4294);
                var25.field3227.method8353(Statics.field4431.field4294);
                var25.field3227.method8464(Statics.field1965.field4294);
                var25.field3227.method8353(Statics.field508.field4294);
                var25.field3227.method8354(Statics.field305.field4294);
                var25.field3227.method8464(Statics.field4358.field4294);
                var25.field3227.method8409(var24, var30, var25.field3227.field5111);
                var25.field3227.method8296(var25.field3227.field5111 - var28);
                field592.method2665(var25);
                field592.method2664();
                field592.field1429 = new class532(var24);
                int[] var32 = new int[4];
                for (int var33 = 0; var33 < 4; var33++) {
                    var32[var33] = var24[var33] + 50;
                }
                var2.method8239(var32);
                method5471(6);
            }
            if (field563 == 6 && var1.method7368() > 0) {
                int var34 = var1.method7380();
                if (var34 == 61) {
                    int var35 = var1.method7368();
                    Statics.field4405 = var35 == 1 && var1.method7380() == 1;
                    method5471(5);
                }
                if (var34 == 21 && field611 == 20) {
                    method5471(12);
                } else if (var34 == 2) {
                    method5471(14);
                } else if (var34 == 15 && field611 == 40) {
                    field592.field1432 = -1;
                    method5471(19);
                } else if (var34 == 64) {
                    method5471(10);
                } else if (var34 == 23 && field593 < 1) {
                    field593++;
                    method5471(0);
                } else if (var34 == 29) {
                    method5471(17);
                } else if (var34 == 69) {
                    method5471(7);
                } else {
                    method6628(var34);
                    return;
                }
            }
            if (field563 == 7 && var1.method7368() >= 2) {
                var1.method7367(var2.field5108, 0, 2);
                var2.field5111 = 0;
                Statics.field59 = var2.method8448();
                method5471(8);
            }
            if (field563 == 8 && var1.method7368() >= Statics.field59) {
                var2.field5111 = 0;
                var1.method7367(var2.field5108, var2.field5111, Statics.field59);
                class7 var36 = class7.method5235()[var2.method8300()];
                try {
                    switch(var36.field19) {
                        case 0:
                            class1 var37 = new class1();
                            this.field584 = new class8(var2, var37);
                            method5471(9);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var71) {
                    method6628(22);
                    return;
                }
            }
            if (field563 == 9 && this.field584.method39()) {
                this.field614 = this.field584.method38();
                this.field584.method36();
                this.field584 = null;
                if (this.field614 == null) {
                    method6628(22);
                    return;
                }
                field592.method2678();
                class297 var40 = class297.method2971();
                var40.field3221 = null;
                var40.field3222 = 0;
                var40.field3227 = new class514(5000);
                var40.field3227.method8283(class299.field3362.field3364);
                var40.field3227.method8345(this.field614.field5111);
                var40.field3227.method8294(this.field614);
                field592.method2665(var40);
                field592.method2664();
                this.field614 = null;
                method5471(6);
            }
            if (field563 == 10 && var1.method7368() > 0) {
                Statics.field124 = var1.method7380();
                method5471(11);
            }
            if (field563 == 11 && var1.method7368() >= Statics.field124) {
                var1.method7367(var2.field5108, 0, Statics.field124);
                var2.field5111 = 0;
                method5471(6);
            }
            if (field563 == 12 && var1.method7368() > 0) {
                field665 = (var1.method7380() + 3) * 60;
                method5471(13);
            }
            if (field563 == 13) {
                field542 = 0;
                class76.method5478(class352.field3956, class352.field3957, field665 / 60 + class352.field4136);
                if (--field665 <= 0) {
                    method5471(0);
                }
            } else {
                if (field563 == 14 && var1.method7368() >= 1) {
                    Statics.field4506 = var1.method7380();
                    method5471(15);
                }
                if (field563 == 15 && var1.method7368() >= Statics.field4506) {
                    boolean var43 = var1.method7380() == 1;
                    var1.method7367(var2.field5108, 0, 4);
                    var2.field5111 = 0;
                    boolean var44 = false;
                    if (var43) {
                        int var45 = var2.method8241() << 24;
                        int var46 = var45 | var2.method8241() << 16;
                        int var47 = var46 | var2.method8241() << 8;
                        int var48 = var47 | var2.method8241();
                        Statics.field4737.method2366(class76.field960, var48);
                    }
                    if (field581) {
                        Statics.field4737.method2360(class76.field960);
                    } else {
                        Statics.field4737.method2360((String) null);
                    }
                    class99.method6038();
                    field615 = var1.method7380();
                    field825 = var1.method7380() == 1;
                    field655 = var1.method7380();
                    field655 <<= 0x8;
                    field655 += var1.method7380();
                    field656 = var1.method7380();
                    var1.method7367(var2.field5108, 0, 8);
                    var2.field5111 = 0;
                    this.field585 = var2.method8307();
                    var1.method7367(var2.field5108, 0, 8);
                    var2.field5111 = 0;
                    field657 = var2.method8307();
                    if (field709 >= 214) {
                        var1.method7367(var2.field5108, 0, 8);
                        var2.field5111 = 0;
                        var2.method8307();
                    }
                    var1.method7367(var2.field5108, 0, 1);
                    var2.field5111 = 0;
                    class298[] var49 = class298.method3248();
                    int var50 = var2.method8246();
                    if (var50 < 0 || var50 >= var49.length) {
                        throw new IOException(var50 + " " + var2.field5111);
                    }
                    field592.field1426 = var49[var50];
                    field592.field1432 = field592.field1426.field3357;
                    var1.method7367(var2.field5108, 0, 2);
                    var2.field5111 = 0;
                    field592.field1432 = var2.method8448();
                    try {
                        client var51 = Statics.field2415;
                        JSObject.getWindow(var51).call("zap", (Object[]) null);
                    } catch (Throwable var70) {
                    }
                    method5471(16);
                }
                if (field563 != 16) {
                    if (field563 == 17 && var1.method7368() >= 2) {
                        var2.field5111 = 0;
                        var1.method7367(var2.field5108, 0, 2);
                        var2.field5111 = 0;
                        Statics.field3863 = var2.method8448();
                        method5471(18);
                    }
                    if (field563 == 18 && var1.method7368() >= Statics.field3863) {
                        var2.field5111 = 0;
                        var1.method7367(var2.field5108, 0, Statics.field3863);
                        var2.field5111 = 0;
                        String var65 = var2.method8311();
                        String var66 = var2.method8311();
                        String var67 = var2.method8311();
                        class76.method5478(var65, var66, var67);
                        method5473(10);
                        if (field572.method8579()) {
                            class76.method816(9);
                        }
                    }
                    if (field563 == 19) {
                        if (field592.field1432 == -1) {
                            if (var1.method7368() < 2) {
                                return;
                            }
                            var1.method7367(var2.field5108, 0, 2);
                            var2.field5111 = 0;
                            field592.field1432 = var2.method8448();
                        }
                        if (var1.method7368() >= field592.field1432) {
                            var1.method7367(var2.field5108, 0, field592.field1432);
                            var2.field5111 = 0;
                            int var68 = field592.field1432;
                            field595.method7061();
                            method2570();
                            class108.method2300(var2);
                            if (var2.field5111 != var68) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field542++;
                        if (field542 > 2000) {
                            if (field593 < 1) {
                                if (Statics.field7 == Statics.field4880) {
                                    Statics.field7 = Statics.field1547;
                                } else {
                                    Statics.field7 = Statics.field4880;
                                }
                                field593++;
                                method5471(0);
                            } else {
                                method6628(-3);
                            }
                        }
                    }
                } else if (var1.method7368() >= field592.field1432) {
                    var2.field5111 = 0;
                    var1.method7367(var2.field5108, 0, field592.field1432);
                    field595.method7065();
                    field590 = -1L;
                    Statics.field1505.field1099 = 0;
                    Statics.field4372 = true;
                    field546 = true;
                    field770 = -1L;
                    class37.method6256();
                    field592.method2678();
                    field592.field1430.field5111 = 0;
                    field592.field1426 = null;
                    field592.field1431 = null;
                    field592.field1437 = null;
                    field592.field1438 = null;
                    field592.field1432 = 0;
                    field592.field1436 = 0;
                    field547 = 0;
                    field580 = 0;
                    field605 = 0;
                    method4391();
                    class36.method295(0);
                    class111.method2108();
                    field692 = 0;
                    field619 = false;
                    field782 = 0;
                    field705 = 0;
                    field620 = 0;
                    Statics.field4442 = null;
                    field780 = 0;
                    field773 = -1;
                    field778 = 0;
                    field701 = 0;
                    field556 = class104.field1355;
                    field557 = class104.field1355;
                    field588 = 0;
                    class108.field1380 = 0;
                    for (int var53 = 0; var53 < 2048; var53++) {
                        class108.field1389[var53] = null;
                        class108.field1378[var53] = class218.field2411;
                    }
                    for (int var54 = 0; var54 < 2048; var54++) {
                        field700[var54] = null;
                    }
                    for (int var55 = 0; var55 < 65536; var55++) {
                        field587[var55] = null;
                    }
                    field666 = -1;
                    field654.method6387();
                    field798.method6387();
                    for (int var56 = 0; var56 < 4; var56++) {
                        for (int var57 = 0; var57 < 104; var57++) {
                            for (int var58 = 0; var58 < 104; var58++) {
                                field667[var56][var57][var58] = null;
                            }
                        }
                    }
                    field668 = new class378();
                    Statics.field3367.method1774();
                    for (int var59 = 0; var59 < Statics.field1934; var59++) {
                        class187 var60 = class187.method1165(var59);
                        if (var60 != null) {
                            class322.field3542[var59] = 0;
                            class322.field3540[var59] = 0;
                        }
                    }
                    Statics.field137.method2630();
                    field562 = -1;
                    if (field699 != -1) {
                        class332.method4199(field699);
                    }
                    for (class87 var61 = (class87) field548.method8027(); var61 != null; var61 = (class87) field548.method8028()) {
                        method2257(var61, true);
                    }
                    field699 = -1;
                    field548 = new class489(8);
                    field704 = null;
                    method4391();
                    field814.method5536((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
                    for (int var62 = 0; var62 < 8; var62++) {
                        field550[var62] = null;
                        field664[var62] = false;
                    }
                    class85.method5204();
                    field540 = true;
                    for (int var63 = 0; var63 < 100; var63++) {
                        field537[var63] = true;
                    }
                    method1157();
                    Statics.field265 = null;
                    Statics.field1391 = null;
                    Arrays.fill(field771, (Object) null);
                    Statics.field2085 = null;
                    Arrays.fill(field772, (Object) null);
                    for (int var64 = 0; var64 < 8; var64++) {
                        field806[var64] = new class368();
                    }
                    Statics.field4452 = null;
                    field538 = false;
                    class108.method2300(var2);
                    Statics.field1038 = -1;
                    method5059(false, var2);
                    field592.field1426 = null;
                }
            }
        } catch (IOException var78) {
            if (field593 < 1) {
                if (Statics.field7 == Statics.field4880) {
                    Statics.field7 = Statics.field1547;
                } else {
                    Statics.field7 = Statics.field4880;
                }
                field593++;
                method5471(0);
            } else {
                method6628(-2);
            }
        }
    }

    @ObfuscatedName("eh.hp(I)V")
    public static void method2570() {
        field592.method2678();
        field592.field1430.field5111 = 0;
        field592.field1426 = null;
        field592.field1431 = null;
        field592.field1437 = null;
        field592.field1438 = null;
        field592.field1432 = 0;
        field592.field1436 = 0;
        field547 = 0;
        method4391();
        field780 = 0;
        field778 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field700[var0] = null;
        }
        Statics.field2132 = null;
        for (int var1 = 0; var1 < field587.length; var1++) {
            class101 var2 = field587[var1];
            if (var2 != null) {
                var2.field1233 = -1;
                var2.field1203 = false;
            }
        }
        class85.method5204();
        method5473(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field537[var3] = true;
        }
        method1157();
    }

    @ObfuscatedName("or.ha(IB)V")
    public static void method6628(int arg0) {
        int var1 = Statics.method7688();
        if (arg0 == -3) {
            class76.method5478(class352.field3959, class352.field3960, class352.field4105);
        } else if (arg0 == -2) {
            class76.method5478(class352.field4122, class352.field3963, class352.field3964);
        } else if (arg0 == -1) {
            class76.method5478(class352.field3965, class352.field3998, class352.field4129);
        } else if (arg0 == 3) {
            class76.method816(3);
            class76.field944 = 1;
        } else if (arg0 == 4) {
            class76.method816(14);
            class76.field943 = 0;
        } else if (arg0 == 5) {
            class76.field944 = 2;
            class76.method5478(class352.field3971, class352.field3972, class352.field3973);
        } else if (arg0 == 68) {
            if (!field538) {
                field538 = true;
                method7087();
                return;
            }
            class76.method5478(class352.field3974, class352.field3975, class352.field3943);
        } else if (!field762 && arg0 == 6) {
            class76.method5478(class352.field3974, class352.field3975, class352.field3943);
        } else if (arg0 == 7) {
            class76.method5478(class352.field3916, class352.field3978, class352.field4132);
        } else if (arg0 == 8) {
            class76.method5478(class352.field3980, class352.field3981, class352.field4054);
        } else if (arg0 == 9) {
            class76.method5478(class352.field3983, class352.field3984, class352.field4155);
        } else if (arg0 == 10) {
            class76.method5478(class352.field3991, class352.field3987, class352.field3988);
        } else if (arg0 == 11) {
            class76.method5478(class352.field3989, class352.field3990, class352.field4188);
        } else if (arg0 == 12) {
            class76.method5478(class352.field3992, class352.field3993, class352.field3994);
        } else if (arg0 == 13) {
            class76.method5478(class352.field3995, class352.field4073, class352.field3997);
        } else if (arg0 == 14) {
            class76.method5478(class352.field4192, class352.field3999, class352.field4000);
        } else if (arg0 == 16) {
            class76.method5478(class352.field4001, class352.field4002, class352.field4131);
            class76.method816(33);
        } else if (arg0 == 17) {
            class76.method5478(class352.field4043, class352.field4159, class352.field4006);
        } else if (arg0 == 18) {
            class76.method816(14);
            class76.field943 = 1;
        } else if (arg0 == 19) {
            class76.method5478(class352.field4101, class352.field4044, class352.field4012);
        } else if (arg0 == 20) {
            class76.method5478(class352.field4115, class352.field4014, class352.field4040);
        } else if (arg0 == 22) {
            class76.method5478(class352.field4016, class352.field4083, class352.field4102);
        } else if (arg0 == 23) {
            class76.method5478(class352.field4019, class352.field4020, class352.field3914);
        } else if (arg0 == 24) {
            class76.method5478(class352.field4022, class352.field4023, class352.field4084);
        } else if (arg0 == 25) {
            class76.method5478(class352.field4025, class352.field4026, class352.field4027);
        } else if (arg0 == 26) {
            class76.method5478(class352.field4028, class352.field4005, class352.field4030);
        } else if (arg0 == 27) {
            class76.method5478(class352.field4182, class352.field4032, class352.field4010);
        } else if (arg0 == 31) {
            class76.method5478(class352.field4173, class352.field4041, class352.field4042);
        } else if (arg0 == 32) {
            class76.method816(14);
            class76.field943 = 2;
        } else if (arg0 == 37) {
            class76.method5478(class352.field4046, class352.field4075, class352.field4190);
        } else if (arg0 == 38) {
            class76.method5478(class352.field4049, class352.field4050, class352.field4051);
        } else if (arg0 == 55) {
            class76.method816(8);
        } else if (arg0 == 56) {
            class76.method5478(class352.field4208, class352.field3921, class352.field4058);
            method5473(11);
            return;
        } else if (arg0 == 57) {
            class76.method5478(class352.field4059, class352.field4060, class352.field4061);
            method5473(11);
            return;
        } else if (arg0 == 61) {
            class76.method5478("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class76.method816(7);
        } else if (arg0 == 62) {
            method5473(10);
            class76.method816(9);
            class76.method5478(class352.field4081, class352.field4055, class352.field4064);
            return;
        } else if (arg0 == 63) {
            method5473(10);
            class76.method816(9);
            class76.method5478(class352.field4065, class352.field4066, class352.field4067);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method5473(10);
            class76.method816(9);
            class76.method5478(class352.field4119, class352.field4069, class352.field4088);
            return;
        } else if (arg0 == 71) {
            method5473(10);
            class76.method816(7);
            class76.method5478("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method5473(10);
            class76.method816(6);
            class76.method5478(class352.field4199, class352.field4200, class352.field4201);
        } else if (arg0 == 72) {
            method5473(10);
            class76.method816(32);
        } else {
            class76.method5478(class352.field4071, class352.field3933, class352.field3979);
        }
        method5473(10);
        boolean var2 = var1 != Statics.method7688();
        if (!var2 && field572.method8579()) {
            class76.method816(9);
        }
    }

    @ObfuscatedName("ru.hs(I)V")
    public static final void method7440() {
        field592.method2674();
        method2138();
        Statics.field1570.method4201();
        for (int var0 = 0; var0 < 4; var0++) {
            field602[var0].method3853();
        }
        field766.method3792();
        System.gc();
        class306.method2092(0, 0);
        Statics.method2707();
        field800 = false;
        class70.method6634();
        method5473(10);
    }

    @ObfuscatedName("dh.hf(II)V")
    public static final void method2091(int arg0) {
        method7440();
        switch(arg0) {
            case 1:
                class76.method7658();
                break;
            case 2:
                class76.method816(24);
                class76.method5478(class352.field4143, class352.field4144, class352.field4145);
        }
    }

    @ObfuscatedName("ev.hb(I)J")
    public static long method2688() {
        return field657;
    }

    @ObfuscatedName("du.hx(I)V")
    public static final void method2138() {
        class208.method4386();
        class200.field2114.method5175();
        class190.method2986();
        Statics.method2776();
        class196.field2034.method5175();
        class196.field2040.method5175();
        class207.field2230.method5175();
        class207.field2277.method5175();
        class207.field2232.method5175();
        class209.field2316.method5175();
        class209.field2307.method5175();
        class209.field2315.method5175();
        class199.field2098.method5175();
        class199.field2099.method5175();
        class202.field2125.method5175();
        class187.field1935.method5175();
        Statics.field352.method8139();
        Statics.field4511.method8139();
        class205.method6796();
        class191.field1993.method5175();
        class191.field1994.method5175();
        class204.field2145.method5175();
        class203.method2816();
        class188.field1943.method5175();
        class506.method3938();
        class508.method289();
        field723.method5175();
        field613.method5175();
        class329.field3582.method5175();
        class332.method5001();
        ((class237) class227.field2537.field2813).method4413();
        class79.field1010.method5175();
        field820.method7158();
        Statics.field1352.method6142();
        Statics.field3526.method6142();
        Statics.field875.method6142();
        Statics.field162.method6142();
        Statics.field5023.method6142();
        Statics.field4431.method6142();
        Statics.field508.method6142();
        Statics.field305.method6142();
        Statics.field1692.method6142();
        Statics.field1666.method6142();
        Statics.field4436.method6142();
        Statics.field4358.method6142();
        Statics.field3870.method6142();
    }

    @ObfuscatedName("ik.hc(I)V")
    public static final void method4383() {
        if (field580 > 0) {
            method7440();
        } else {
            field595.method7081();
            method5473(40);
            Statics.field4676 = field592.method2669();
            field592.method2668();
        }
    }

    @ObfuscatedName("dv.hm(ZI)V")
    public static final void method2268(boolean arg0) {
        if (arg0) {
            field777 = class76.field957 ? class140.field1648 : class140.field1647;
        } else {
            field777 = Statics.field4737.method2367(class76.field960) ? class140.field1651 : class140.field1654;
        }
    }

    @ObfuscatedName("client.hv(I)V")
    public final void method1386() {
        if (field547 > 1) {
            field547--;
        }
        if (field580 > 0) {
            field580--;
        }
        if (field594) {
            field594 = false;
            method4383();
            return;
        }
        if (!field640) {
            method6057();
        }
        for (int var1 = 0; var1 < 100 && this.method1203(field592); var1++) {
        }
        if (field611 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field259.method6457();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field595.field4569) {
                    class297 var6 = class297.method1166(class295.field3120, field592.field1429);
                    var6.field3227.method8283(0);
                    int var7 = var6.field3227.field5111;
                    field595.method7079(var6.field3227);
                    var6.field3227.method8297(var6.field3227.field5111 - var7);
                    field592.method2665(var6);
                    field595.method7066();
                }
                Object var8 = Statics.field1505.field1098;
                synchronized (Statics.field1505.field1098) {
                    if (!field567) {
                        Statics.field1505.field1099 = 0;
                    } else if (class36.field249 != 0 || Statics.field1505.field1099 >= 40) {
                        class297 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field1505.field1099 && (var9 == null || var9.field3227.field5111 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field1505.field1101[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field1505.field1100[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field543 != var16 || field544 != var15) {
                                if (var9 == null) {
                                    var9 = class297.method1166(class295.field3180, field592.field1429);
                                    var9.field3227.method8283(0);
                                    var10 = var9.field3227.field5111;
                                    var9.field3227.field5111 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field670 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field543;
                                    var18 = var15 - field544;
                                    var19 = (int) ((Statics.field1505.field1102[var14] - field670) / 20L);
                                    var12 = (int) ((Statics.field1505.field1102[var14] - field670) % 20L + (long) var12);
                                }
                                field543 = var16;
                                field544 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3227.method8345((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3227.method8283(var19 + 128);
                                    var9.field3227.method8345((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3227.method8283(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3227.method8464(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3227.method8464(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3227.method8345((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3227.method8464(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3227.method8464(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field670 = Statics.field1505.field1102[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3227.method8297(var9.field3227.field5111 - var10);
                            int var20 = var9.field3227.field5111;
                            var9.field3227.field5111 = var10;
                            var9.field3227.method8283(var12 / var13);
                            var9.field3227.method8283(var12 % var13);
                            var9.field3227.field5111 = var20;
                            field592.method2665(var9);
                        }
                        if (var11 >= Statics.field1505.field1099) {
                            Statics.field1505.field1099 = 0;
                        } else {
                            Statics.field1505.field1099 -= var11;
                            System.arraycopy(Statics.field1505.field1100, var11, Statics.field1505.field1100, 0, Statics.field1505.field1099);
                            System.arraycopy(Statics.field1505.field1101, var11, Statics.field1505.field1101, 0, Statics.field1505.field1099);
                            System.arraycopy(Statics.field1505.field1102, var11, Statics.field1505.field1102, 0, Statics.field1505.field1099);
                        }
                    }
                }
                if (class36.field249 == 1 || !Statics.field1924 && class36.field249 == 4 || class36.field249 == 2) {
                    long var22 = class36.field234 - field590;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field590 = class36.field234;
                    int var24 = class36.field251;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field1890) {
                        var24 = Statics.field1890;
                    }
                    int var25 = class36.field250;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field1450) {
                        var25 = Statics.field1450;
                    }
                    int var26 = (int) var22;
                    class297 var27 = class297.method1166(class295.field3146, field592.field1429);
                    var27.field3227.method8345((class36.field249 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field3227.method8345(var25);
                    var27.field3227.method8345(var24);
                    field592.method2665(var27);
                }
                if (field740 != 0) {
                    class297 var28 = class297.method1166(class295.field3194, field592.field1429);
                    var28.field3227.method8345(field740);
                    field592.method2665(var28);
                }
                if (field675.field2360 > 0) {
                    class297 var29 = class297.method1166(class295.field3108, field592.field1429);
                    var29.field3227.method8345(0);
                    int var30 = var29.field3227.field5111;
                    long var31 = class302.method655();
                    for (int var33 = 0; var33 < field675.field2360; var33++) {
                        long var34 = var31 - field770;
                        if (var34 > 16777215L) {
                            var34 = 16777215L;
                        }
                        field770 = var31;
                        var29.field3227.method8533(field675.field2359[var33]);
                        var29.field3227.method8347((int) var34);
                    }
                    var29.field3227.method8296(var29.field3227.field5111 - var30);
                    field592.method2665(var29);
                }
                if (field629 > 0) {
                    field629--;
                }
                if (field675.method3811(96) || field675.method3811(97) || field675.method3811(98) || field675.method3811(99)) {
                    field630 = true;
                }
                if (field630 && field629 <= 0) {
                    field629 = 20;
                    field630 = false;
                    class297 var36 = class297.method1166(class295.field3131, field592.field1429);
                    var36.field3227.method8345(field705);
                    var36.field3227.method8340(field566);
                    field592.method2665(var36);
                }
                if (Statics.field4372 && !field546) {
                    field546 = true;
                    class297 var37 = class297.method1166(class295.field3160, field592.field1429);
                    var37.field3227.method8283(1);
                    field592.method2665(var37);
                }
                if (!Statics.field4372 && field546) {
                    field546 = false;
                    class297 var38 = class297.method1166(class295.field3160, field592.field1429);
                    var38.field3227.method8283(0);
                    field592.method2665(var38);
                }
                if (Statics.field114 != null) {
                    Statics.field114.method7776();
                }
                if (Statics.field2103) {
                    if (Statics.field265 != null) {
                        Statics.field265.method7330();
                    }
                    for (int var39 = 0; var39 < class108.field1380; var39++) {
                        class92 var40 = field700[class108.field1381[var39]];
                        var40.method2212();
                    }
                    Statics.field2103 = false;
                }
                method6980();
                method3099();
                if (field611 != 30) {
                    return;
                }
                method7347();
                method318();
                field592.field1436++;
                if (field592.field1436 > 750) {
                    method4383();
                    return;
                }
                int var41 = class108.field1380;
                int[] var42 = class108.field1381;
                for (int var43 = 0; var43 < var41; var43++) {
                    class92 var44 = field700[var42[var43]];
                    if (var44 != null) {
                        method5476(var44, 1);
                    }
                }
                for (int var45 = 0; var45 < field588; var45++) {
                    int var46 = field526[var45];
                    class101 var47 = field587[var46];
                    if (var47 != null) {
                        method5476(var47, var47.field1327.field2038);
                    }
                }
                method4963();
                field606++;
                if (field764 != 0) {
                    field706 += 20;
                    if (field706 >= 400) {
                        field764 = 0;
                    }
                }
                class332 var48 = Statics.field1682;
                class332 var49 = Statics.field3869;
                Statics.field1682 = null;
                Statics.field3869 = null;
                field715 = null;
                field763 = false;
                field716 = false;
                field767 = 0;
                while (field675.method3812() && field767 < 128) {
                    if (field615 >= 2 && field675.method3811(82) && field675.field2370 == 66) {
                        StringBuilder var50 = new StringBuilder();
                        Iterator var51 = class111.field1420.iterator();
                        while (var51.hasNext()) {
                            class65 var52 = (class65) var51.next();
                            if (var52.field501 != null && !var52.field501.isEmpty()) {
                                var50.append(var52.field501).append(':');
                            }
                            var50.append(var52.field506).append('\n');
                        }
                        String var53 = var50.toString();
                        Statics.field2415.method492(var53);
                    } else if (field620 != 1 || field675.field2357 <= 0) {
                        field769[field767] = field675.field2370;
                        field768[field767] = field675.field2357;
                        field767++;
                    }
                }
                boolean var55 = field615 >= 2;
                if (var55 && field675.method3811(82) && field675.method3811(81) && field740 != 0) {
                    int var56 = Statics.field2132.field1150 - field740;
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 3) {
                        var56 = 3;
                    }
                    if (Statics.field2132.field1150 != var56) {
                        method2524(Statics.field1448 + Statics.field2132.field1273[0], Statics.field354 + Statics.field2132.field1270[0], var56, false);
                    }
                    field740 = 0;
                }
                if (class36.field249 == 1) {
                    field766.method3792();
                }
                if (field699 != -1) {
                    method2309(field699, 0, 0, Statics.field1450, Statics.field1890, 0, 0);
                }
                field529++;
                while (true) {
                    class88 var57;
                    class332 var58;
                    class332 var59;
                    do {
                        var57 = (class88) field728.method6391();
                        if (var57 == null) {
                            while (true) {
                                class88 var60;
                                class332 var61;
                                class332 var62;
                                do {
                                    var60 = (class88) field744.method6391();
                                    if (var60 == null) {
                                        while (true) {
                                            class88 var63;
                                            class332 var64;
                                            class332 var65;
                                            do {
                                                var63 = (class88) field742.method6391();
                                                if (var63 == null) {
                                                    while (true) {
                                                        class212 var66 = (class212) field781.method6391();
                                                        if (var66 == null) {
                                                            this.method1204();
                                                            method5039();
                                                            if (field711 != null) {
                                                                this.method1209();
                                                            }
                                                            if (class231.method4242()) {
                                                                int var67 = class231.field2598;
                                                                int var68 = class231.field2599;
                                                                class297 var69 = class297.method1166(class295.field3114, field592.field1429);
                                                                var69.field3227.method8283(5);
                                                                var69.field3227.method8340(Statics.field1448 + var67);
                                                                var69.field3227.method8455(Statics.field354 + var68);
                                                                var69.field3227.method8352(field675.method3811(82) ? (field675.method3811(81) ? 2 : 1) : 0);
                                                                field592.method2665(var69);
                                                                class231.method4342();
                                                                field647 = class36.field250;
                                                                field648 = class36.field251;
                                                                field764 = 1;
                                                                field706 = 0;
                                                                field778 = var67;
                                                                field701 = var68;
                                                            }
                                                            if (Statics.field1682 != var48) {
                                                                if (var48 != null) {
                                                                    method3930(var48);
                                                                }
                                                                if (Statics.field1682 != null) {
                                                                    method3930(Statics.field1682);
                                                                }
                                                            }
                                                            if (Statics.field3869 != var49 && field691 == field690) {
                                                                if (var49 != null) {
                                                                    method3930(var49);
                                                                }
                                                                if (Statics.field3869 != null) {
                                                                    method3930(Statics.field3869);
                                                                }
                                                            }
                                                            if (Statics.field3869 == null) {
                                                                if (field690 > 0) {
                                                                    field690--;
                                                                }
                                                            } else if (field690 < field691) {
                                                                field690++;
                                                                if (field691 == field690) {
                                                                    method3930(Statics.field3869);
                                                                }
                                                            }
                                                            method7088();
                                                            if (field795) {
                                                                method2817(Statics.field4963, Statics.field125, Statics.field174);
                                                                method7090(Statics.field1460, Statics.field2801);
                                                                if (Statics.field4963 == Statics.field2069 && Statics.field1609 == Statics.field125 && Statics.field174 == Statics.field1656 && Statics.field1546 == Statics.field1460 && Statics.field2801 == Statics.field1485) {
                                                                    field795 = false;
                                                                    field788 = false;
                                                                    field789 = false;
                                                                    field790 = false;
                                                                    Statics.field1183 = 0;
                                                                    Statics.field2128 = 0;
                                                                    Statics.field3398 = 0;
                                                                    Statics.field189 = 0;
                                                                    Statics.field1964 = 0;
                                                                    Statics.field253 = 0;
                                                                    Statics.field3875 = 0;
                                                                    Statics.field1375 = 0;
                                                                    Statics.field181 = 0;
                                                                    Statics.field1938 = 0;
                                                                    field792 = null;
                                                                    field609 = null;
                                                                    field583 = null;
                                                                }
                                                            } else if (field788) {
                                                                method2953();
                                                            }
                                                            for (int var70 = 0; var70 < 5; var70++) {
                                                                int var10002 = field745[var70]++;
                                                            }
                                                            Statics.field137.method2605();
                                                            int var71 = class36.method5453();
                                                            int var72 = field229.method339();
                                                            if (var71 > 15000 && var72 > 15000) {
                                                                field580 = 250;
                                                                class36.method295(14500);
                                                                class297 var74 = class297.method1166(class295.field3132, field592.field1429);
                                                                field592.method2665(var74);
                                                            }
                                                            Statics.field3367.method1773();
                                                            method3247();
                                                            field592.field1435++;
                                                            if (field592.field1435 > 50) {
                                                                class297 var75 = class297.method1166(class295.field3148, field592.field1429);
                                                                field592.method2665(var75);
                                                            }
                                                            try {
                                                                field592.method2664();
                                                            } catch (IOException var77) {
                                                                method4383();
                                                            }
                                                            return;
                                                        }
                                                        method3096(var66);
                                                    }
                                                }
                                                var64 = var63.field1084;
                                                if (var64.field3770 < 0) {
                                                    break;
                                                }
                                                var65 = class332.method2255(var64.field3666);
                                            } while (var65 == null || var65.field3784 == null || var64.field3770 >= var65.field3784.length || var65.field3784[var64.field3770] != var64);
                                            class71.method5065(var63);
                                        }
                                    }
                                    var61 = var60.field1084;
                                    if (var61.field3770 < 0) {
                                        break;
                                    }
                                    var62 = class332.method2255(var61.field3666);
                                } while (var62 == null || var62.field3784 == null || var61.field3770 >= var62.field3784.length || var62.field3784[var61.field3770] != var61);
                                class71.method5065(var60);
                            }
                        }
                        var58 = var57.field1084;
                        if (var58.field3770 < 0) {
                            break;
                        }
                        var59 = class332.method2255(var58.field3666);
                    } while (var59 == null || var59.field3784 == null || var58.field3770 >= var59.field3784.length || var59.field3784[var58.field3770] != var58);
                    class71.method5065(var57);
                }
            }
            class297 var4 = class297.method1166(class295.field3112, field592.field1429);
            var4.field3227.method8283(0);
            int var5 = var4.field3227.field5111;
            class37.method4590(var4.field3227);
            var4.field3227.method8297(var4.field3227.field5111 - var5);
            field592.method2665(var4);
        }
    }

    @ObfuscatedName("lv.hn(I)V")
    public static final void method5215() {
        if (Statics.field4508 != null) {
            Statics.field4508.method806();
        }
    }

    @ObfuscatedName("av.hr(I)V")
    public static final void method318() {
        for (int var0 = 0; var0 < field782; var0++) {
            int var10002 = field739[var0]--;
            if (field739[var0] >= -10) {
                class40 var2 = field571[var0];
                if (var2 == null) {
                    class40 var10000 = (class40) null;
                    var2 = class40.method751(Statics.field162, field783[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field739[var0] += var2.method750();
                    field571[var0] = var2;
                }
                if (field739[var0] < 0) {
                    int var9;
                    if (field534[var0] == 0) {
                        var9 = Statics.field4737.method2357();
                    } else {
                        int var3 = (field534[var0] & 0xFF) * 128;
                        int var4 = field534[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2132.field1228;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field534[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2132.field1199;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field739[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * Statics.field4737.method2449() / var3;
                    }
                    if (var9 > 0) {
                        class41 var10 = var2.method749().method770(Statics.field3625);
                        class49 var11 = class49.method952(var10, 100, var9);
                        var11.method880(field784[var0] - 1);
                        Statics.field1794.method734(var11);
                    }
                    field739[var0] = -100;
                }
            } else {
                field782--;
                for (int var1 = var0; var1 < field782; var1++) {
                    field783[var1] = field783[var1 + 1];
                    field571[var1] = field571[var1 + 1];
                    field784[var1] = field784[var1 + 1];
                    field739[var1] = field739[var1 + 1];
                    field534[var1] = field534[var1 + 1];
                }
                var0--;
            }
        }
        if (!field800) {
            return;
        }
        boolean var12;
        if (!class306.field3407.isEmpty()) {
            var12 = true;
        } else if (class306.field3405.isEmpty() || class306.field3405.get(0) == null || ((class318) class306.field3405.get(0)).field3518 == null) {
            var12 = false;
        } else {
            var12 = ((class318) class306.field3405.get(0)).field3518.method5334();
        }
        if (var12) {
            return;
        }
        if (Statics.field4737.method2346() != 0) {
            boolean var13 = !class306.field3406.isEmpty();
            if (var13) {
                class357 var14 = Statics.field4431;
                int var15 = Statics.field4737.method2346();
                if (!class306.field3406.isEmpty()) {
                    ArrayList var16 = new ArrayList();
                    Iterator var17 = class306.field3406.iterator();
                    while (var17.hasNext()) {
                        class318 var18 = (class318) var17.next();
                        var18.field3519 = false;
                        var18.field3517 = false;
                        var18.field3525 = false;
                        var18.field3520 = false;
                        var18.field3515 = var14;
                        var18.field3514 = var15;
                        var18.field3511 = 0.0F;
                        var16.add(var18);
                    }
                    class306.method1037(var16, class306.field3409, class306.field3410, class306.field3411, class306.field3402, false);
                }
            }
        }
        field800 = false;
    }

    @ObfuscatedName("ga.ib(Lib;IIII)V")
    public static void method3246(class209 arg0, int arg1, int arg2, int arg3) {
        if (field782 < 50 && Statics.field4737.method2449() != 0 && arg0.field2308 != null && arg1 < arg0.field2308.length) {
            method659(arg0.field2308[arg1], arg2, arg3);
        }
    }

    @ObfuscatedName("gv.il(Lib;IIII)V")
    public static void method3122(class209 arg0, int arg1, int arg2, int arg3) {
        if (field782 < 50 && Statics.field4737.method2449() != 0 && arg0.field2322 != null && arg0.field2322.containsKey(arg1)) {
            method659((Integer) arg0.field2322.get(arg1), arg2, arg3);
        }
    }

    @ObfuscatedName("bf.ig(IIII)V")
    public static void method659(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            return;
        }
        int var3 = arg0 >> 8;
        int var4 = arg0 >> 4 & 0x7;
        int var5 = arg0 & 0xF;
        field783[field782] = var3;
        field784[field782] = var4;
        field739[field782] = 0;
        field571[field782] = null;
        int var6 = (arg1 - 64) / 128;
        int var7 = (arg2 - 64) / 128;
        field534[field782] = (var6 << 16) + (var7 << 8) + var5;
        field782++;
    }

    @ObfuscatedName("bj.ie(IIII)V")
    public static void method381(int arg0, int arg1, int arg2) {
        if (Statics.field4737.method2357() == 0 || arg1 == 0 || field782 >= 50) {
            return;
        }
        field783[field782] = arg0;
        field784[field782] = arg1;
        field739[field782] = arg2;
        field571[field782] = null;
        field534[field782] = 0;
        field782++;
    }

    @ObfuscatedName("ky.iz(II)V")
    public static void method5072(int arg0) {
        if (arg0 == -1 && !field800) {
            class306.method2092(0, 0);
        } else if (arg0 != -1 && !class306.method3217(arg0) && Statics.field4737.method2346() != 0) {
            ArrayList var1 = new ArrayList();
            var1.add(new class318(Statics.field4431, arg0, 0, Statics.field4737.method2346(), false));
            if (field800) {
                class306.field3406.clear();
                class306.field3406.addAll(var1);
                class306.method5052(0, 100, 100, 0);
            } else {
                class306.method1037(var1, 0, 100, 100, 0, false);
            }
        }
    }

    @ObfuscatedName("gc.is(Ljava/util/ArrayList;IIIIB)V")
    public static void method3056(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field800) {
            class306.method2092(0, 0);
        } else if (var5 != -1 && !class306.method3217(var5) && Statics.field4737.method2346() != 0) {
            ArrayList var6 = new ArrayList();
            for (int var7 = 0; var7 < arg0.size(); var7++) {
                var6.add(new class318(Statics.field4431, (Integer) arg0.get(var7), 0, Statics.field4737.method2346(), false));
            }
            if (field800) {
                class306.field3406.clear();
                class306.field3406.addAll(var6);
                class306.method5052(arg1, arg2, arg3, arg4);
            } else {
                class306.method1037(var6, arg1, arg2, arg3, arg4, false);
            }
        }
    }

    @ObfuscatedName("cy.io(III)V")
    public static void method2051(int arg0, int arg1) {
        if (Statics.field4737.method2346() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class318(Statics.field4436, arg0, 0, Statics.field4737.method2346(), false));
            class306.method1037(var2, 0, 0, 0, 0, true);
            field800 = true;
        }
    }

    @ObfuscatedName("client.iw(IIS)V")
    public void method1684(int arg0, int arg1) {
        if (field592 != null && field592.field1429 != null && arg0 > -1 && Statics.field4737.method2346() > 0 && !field800) {
            class297 var3 = class297.method1166(class295.field3201, field592.field1429);
            var3.field3227.method8464(arg0);
            field592.method2665(var3);
        }
    }

    @ObfuscatedName("pf.ij(B)V")
    public static final void method6980() {
        if (!Statics.field2974) {
            return;
        }
        for (int var0 = 0; var0 < class108.field1380; var0++) {
            class92 var1 = field700[class108.field1381[var0]];
            var1.method2253();
        }
        Statics.field2974 = false;
    }

    @ObfuscatedName("gl.in(I)V")
    public static final void method3099() {
        if (Statics.field1321 != field773) {
            field773 = Statics.field1321;
            method256(Statics.field1321);
        }
    }

    @ObfuscatedName("nz.ih(Lmi;III)V")
    public static final void method6056(class332 arg0, int arg1, int arg2) {
        if (field780 != 0 && field780 != 3 || field640 || !(class36.field249 == 1 || !Statics.field1924 && class36.field249 == 4)) {
            return;
        }
        class321 var3 = arg0.method5851(true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field250 - arg1;
        int var5 = class36.field251 - arg2;
        if (!var3.method5480(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3532 / 2;
        int var7 = var5 - var3.field3531 / 2;
        int var8 = field705 & 0x7FF;
        int var9 = class227.field2535[var8];
        int var10 = class227.field2533[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field2132.field1228 + var11 >> 7;
        int var14 = Statics.field2132.field1199 - var12 >> 7;
        class297 var15 = class297.method1166(class295.field3149, field592.field1429);
        var15.field3227.method8283(18);
        var15.field3227.method8340(Statics.field1448 + var13);
        var15.field3227.method8455(Statics.field354 + var14);
        var15.field3227.method8352(field675.method3811(82) ? (field675.method3811(81) ? 2 : 1) : 0);
        var15.field3227.method8283(var6);
        var15.field3227.method8283(var7);
        var15.field3227.method8345(field705);
        var15.field3227.method8283(57);
        var15.field3227.method8283(0);
        var15.field3227.method8283(0);
        var15.field3227.method8283(89);
        var15.field3227.method8345(Statics.field2132.field1228);
        var15.field3227.method8345(Statics.field2132.field1199);
        var15.field3227.method8283(63);
        field592.method2665(var15);
        field778 = var13;
        field701 = var14;
    }

    @ObfuscatedName("jd.it(I)V")
    public static final void method4963() {
        int[] var0 = class108.field1381;
        for (int var1 = 0; var1 < class108.field1380; var1++) {
            class92 var2 = field700[var0[var1]];
            if (var2 != null && var2.field1222 > 0) {
                var2.field1222--;
                if (var2.field1222 == 0) {
                    var2.field1269 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field588; var3++) {
            int var4 = field526[var3];
            class101 var5 = field587[var4];
            if (var5 != null && var5.field1222 > 0) {
                var5.field1222--;
                if (var5.field1222 == 0) {
                    var5.field1269 = null;
                }
            }
        }
    }

    @ObfuscatedName("da.ir(Ljava/lang/String;B)V")
    public static final void method2183(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field4737.method2342(!Statics.field4737.method2343());
            if (Statics.field4737.method2343()) {
                class111.method683(99, "", "Roofs are now all hidden");
            } else {
                class111.method683(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class387.method2307(arg0.substring(5).trim()) == 1;
            Statics.field2415.method504(var1);
            class227.method4066(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field591 = !field591;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field4737.method2348();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field765 = !field765;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field687 = !field687;
        }
        if (field615 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field114.field4894 = !Statics.field114.field4894;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field4737.method2347(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field4737.method2347(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method4383();
            }
        }
        class297 var2 = class297.method1166(class295.field3191, field592.field1429);
        var2.field3227.method8283(arg0.length() + 1);
        var2.field3227.method8290(arg0);
        field592.method2665(var2);
    }

    @ObfuscatedName("eb.ic(IB)I")
    public static final int method2750(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("ap.iy(IB)I")
    public static final int method50(int arg0) {
        return Math.abs(arg0 - Statics.field1485) > 1024 ? arg0 + 2048 * (arg0 < Statics.field1485 ? 1 : -1) : arg0;
    }

    @ObfuscatedName("ex.if(IIIS)V")
    public static final void method2817(int arg0, int arg1, int arg2) {
        if (Statics.field2069 < arg0) {
            Statics.field2069 += Statics.field253 * (arg0 - Statics.field2069) / 1000 + Statics.field3875;
            if (Statics.field2069 > arg0) {
                Statics.field2069 = arg0;
            }
        }
        if (Statics.field2069 > arg0) {
            Statics.field2069 -= Statics.field253 * (Statics.field2069 - arg0) / 1000 + Statics.field3875;
            if (Statics.field2069 < arg0) {
                Statics.field2069 = arg0;
            }
        }
        if (Statics.field1609 < arg1) {
            Statics.field1609 += Statics.field253 * (arg1 - Statics.field1609) / 1000 + Statics.field3875;
            if (Statics.field1609 > arg1) {
                Statics.field1609 = arg1;
            }
        }
        if (Statics.field1609 > arg1) {
            Statics.field1609 -= Statics.field253 * (Statics.field1609 - arg1) / 1000 + Statics.field3875;
            if (Statics.field1609 < arg1) {
                Statics.field1609 = arg1;
            }
        }
        if (Statics.field1656 < arg2) {
            Statics.field1656 += Statics.field253 * (arg2 - Statics.field1656) / 1000 + Statics.field3875;
            if (Statics.field1656 > arg2) {
                Statics.field1656 = arg2;
            }
        }
        if (Statics.field1656 > arg2) {
            Statics.field1656 -= Statics.field253 * (Statics.field1656 - arg2) / 1000 + Statics.field3875;
            if (Statics.field1656 < arg2) {
                Statics.field1656 = arg2;
            }
        }
    }

    @ObfuscatedName("qe.ia(III)V")
    public static final void method7090(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field1546 < arg0) {
            Statics.field1546 += Statics.field1964 * (arg0 - Statics.field1546) / 1000 + Statics.field189;
            if (Statics.field1546 > arg0) {
                Statics.field1546 = arg0;
            }
        } else if (Statics.field1546 > arg0) {
            Statics.field1546 -= Statics.field1964 * (Statics.field1546 - arg0) / 1000 + Statics.field189;
            if (Statics.field1546 < arg0) {
                Statics.field1546 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field1485;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field1485 += Statics.field1964 * var3 / 1000 + Statics.field189;
            Statics.field1485 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field1485 -= Statics.field1964 * -var3 / 1000 + Statics.field189;
            Statics.field1485 &= 0x7FF;
        }
        int var4 = var2 - Statics.field1485;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field1485 = var2;
        }
    }

    @ObfuscatedName("fq.ii(B)V")
    public static final void method2953() {
        if (!field789) {
            int var0 = Statics.field1375 * 128 + 64;
            int var1 = Statics.field181 * 128 + 64;
            int var2 = method284(var0, var1, Statics.field1321) - Statics.field1938;
            method2817(var0, var2, var1);
        } else if (field792 != null) {
            Statics.field2069 = field792.method7730();
            Statics.field1656 = field792.method7742();
            if (field791) {
                Statics.field1609 = field792.method7732();
            } else {
                Statics.field1609 = method284(Statics.field2069, Statics.field1656, Statics.field1321) - field792.method7732();
            }
            field792.method7757();
        }
        if (field790) {
            if (field609 != null) {
                Statics.field1546 = field609.method7748();
                Statics.field1546 = Math.min(Math.max(Statics.field1546, 128), 383);
                field609.method7757();
            }
            if (field583 != null) {
                Statics.field1485 = field583.method7748() & 0x7FF;
                field583.method7757();
            }
            return;
        }
        int var3 = Statics.field1183 * 128 + 64;
        int var4 = Statics.field2128 * 128 + 64;
        int var5 = method284(var3, var4, Statics.field1321) - Statics.field3398;
        int var6 = var3 - Statics.field2069;
        int var7 = var5 - Statics.field1609;
        int var8 = var4 - Statics.field1656;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method7090(var10, var11);
    }

    @ObfuscatedName("pw.ix(I)V")
    public static final void method7088() {
        if (field620 == 0) {
            int var0 = Statics.field2132.field1228;
            int var1 = Statics.field2132.field1199;
            if (Statics.field4651 - var0 < -500 || Statics.field4651 - var0 > 500 || Statics.field1324 - var1 < -500 || Statics.field1324 - var1 > 500) {
                Statics.field4651 = var0;
                Statics.field1324 = var1;
            }
            if (Statics.field4651 != var0) {
                Statics.field4651 += (var0 - Statics.field4651) / 16;
            }
            if (Statics.field1324 != var1) {
                Statics.field1324 += (var1 - Statics.field1324) / 16;
            }
            int var2 = Statics.field4651 >> 7;
            int var3 = Statics.field1324 >> 7;
            int var4 = method284(Statics.field4651, Statics.field1324, Statics.field1321);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field1321;
                        if (var8 < 3 && (class82.field1050[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class82.field1048[var8][var6][var7];
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
            if (var10 > field669) {
                field669 += (var10 - field669) / 24;
            } else if (var10 < field669) {
                field669 += (var10 - field669) / 80;
            }
            Statics.field1495 = method284(Statics.field2132.field1228, Statics.field2132.field1199, Statics.field1321) - field621;
        } else if (field620 == 1) {
            method424();
            short var11 = -1;
            if (field675.method3811(33)) {
                var11 = 0;
            } else if (field675.method3811(49)) {
                var11 = 1024;
            }
            if (field675.method3811(48)) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (field675.method3811(50)) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (field675.method3811(35)) {
                var12 = -1;
            } else if (field675.method3811(51)) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = field675.method3811(81) ? field626 : field625;
                var13 = var14 * 16;
                field623 = var11;
                field624 = var12;
            }
            if (field622 < var13) {
                field622 += var13 / 8;
                if (field622 > var13) {
                    field622 = var13;
                }
            } else if (field622 > var13) {
                field622 = field622 * 9 / 10;
            }
            if (field622 > 0) {
                int var15 = field622 / 16;
                if (field623 >= 0) {
                    int var16 = field623 - Statics.field1485 & 0x7FF;
                    int var17 = class227.field2535[var16];
                    int var18 = class227.field2533[var16];
                    Statics.field4651 += var15 * var17 / 65536;
                    Statics.field1324 += var15 * var18 / 65536;
                }
                if (field624 != 0) {
                    Statics.field1495 += field624 * var15;
                    if (Statics.field1495 > 0) {
                        Statics.field1495 = 0;
                    }
                }
            } else {
                field623 = -1;
                field624 = -1;
            }
            if (field675.method3811(13)) {
                method1846();
            }
        }
        if (class36.field241 == 4 && Statics.field1924) {
            int var19 = class36.field233 - field683;
            field617 = var19 * 2;
            field683 = var19 == -1 || var19 == 1 ? class36.field233 : (field683 + class36.field233) / 2;
            int var20 = field539 - class36.field255;
            field616 = var20 * 2;
            field539 = var20 == -1 || var20 == 1 ? class36.field255 : (field539 + class36.field255) / 2;
        } else {
            if (field675.method3811(96)) {
                field616 += (-24 - field616) / 2;
            } else if (field675.method3811(97)) {
                field616 += (24 - field616) / 2;
            } else {
                field616 /= 2;
            }
            if (field675.method3811(98)) {
                field617 += (12 - field617) / 2;
            } else if (field675.method3811(99)) {
                field617 += (-12 - field617) / 2;
            } else {
                field617 /= 2;
            }
            field683 = class36.field233;
            field539 = class36.field255;
        }
        field705 = field616 / 2 + field705 & 0x7FF;
        field566 += field617 / 2;
        if (field566 < 128) {
            field566 = 128;
        }
        if (field566 > 383) {
            field566 = 383;
        }
    }

    @ObfuscatedName("mk.im(Ldr;II)V")
    public static final void method5476(class96 arg0, int arg1) {
        if (arg0.field1254 >= field833) {
            method6008(arg0);
        } else if (arg0.field1255 >= field833) {
            boolean var2 = field833 == arg0.field1255 || arg0.field1243 == -1 || arg0.field1260 != 0;
            if (!var2) {
                class209 var3 = class209.method3394(arg0.field1243);
                if (var3 == null || var3.method3775()) {
                    var2 = true;
                } else {
                    var2 = arg0.field1245 + 1 > var3.field2324[arg0.field1244];
                }
            }
            if (var2) {
                int var4 = arg0.field1255 - arg0.field1254;
                int var5 = field833 - arg0.field1254;
                int var6 = arg0.field1250 * 128 + arg0.field1202 * 64;
                int var7 = arg0.field1252 * 128 + arg0.field1202 * 64;
                int var8 = arg0.field1248 * 128 + arg0.field1202 * 64;
                int var9 = arg0.field1218 * 128 + arg0.field1202 * 64;
                arg0.field1228 = ((var4 - var5) * var6 + var5 * var8) / var4;
                arg0.field1199 = ((var4 - var5) * var7 + var5 * var9) / var4;
            }
            arg0.field1272 = 0;
            arg0.field1239 = arg0.field1256;
            arg0.field1200 = arg0.field1239;
        } else {
            arg0.field1211 = arg0.field1204;
            if (arg0.field1246 == 0) {
                arg0.field1272 = 0;
            } else {
                label298: {
                    if (arg0.field1243 != -1 && arg0.field1260 == 0) {
                        class209 var10 = class209.method3394(arg0.field1243);
                        if (arg0.field1262 > 0 && var10.field2326 == 0) {
                            arg0.field1272++;
                            break label298;
                        }
                        if (arg0.field1262 <= 0 && var10.field2327 == 0) {
                            arg0.field1272++;
                            break label298;
                        }
                    }
                    int var11 = arg0.field1228;
                    int var12 = arg0.field1199;
                    int var13 = arg0.field1273[arg0.field1246 - 1] * 128 + arg0.field1202 * 64;
                    int var14 = arg0.field1270[arg0.field1246 - 1] * 128 + arg0.field1202 * 64;
                    if (var11 < var13) {
                        if (var12 < var14) {
                            arg0.field1239 = 1280;
                        } else if (var12 > var14) {
                            arg0.field1239 = 1792;
                        } else {
                            arg0.field1239 = 1536;
                        }
                    } else if (var11 > var13) {
                        if (var12 < var14) {
                            arg0.field1239 = 768;
                        } else if (var12 > var14) {
                            arg0.field1239 = 256;
                        } else {
                            arg0.field1239 = 512;
                        }
                    } else if (var12 < var14) {
                        arg0.field1239 = 1024;
                    } else if (var12 > var14) {
                        arg0.field1239 = 0;
                    }
                    class218 var15 = arg0.field1271[arg0.field1246 - 1];
                    if (var13 - var11 <= 256 && var13 - var11 >= -256 && var14 - var12 <= 256 && var14 - var12 >= -256) {
                        int var16 = arg0.field1239 - arg0.field1200 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field1208;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field1207;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field1257;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field1209;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field1207;
                        }
                        arg0.field1211 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class101) {
                            var19 = ((class101) arg0).field1327.field2031;
                        }
                        if (var19) {
                            if (arg0.field1239 != arg0.field1200 && arg0.field1233 == -1 && arg0.field1267 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field1246 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field1246 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field1272 > 0 && arg0.field1246 > 1) {
                                var18 = 8;
                                arg0.field1272--;
                            }
                        } else {
                            if (arg0.field1246 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field1246 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field1272 > 0 && arg0.field1246 > 1) {
                                var18 = 8;
                                arg0.field1272--;
                            }
                        }
                        if (class218.field2408 == var15) {
                            var18 <<= 0x1;
                        } else if (class218.field2407 == var15) {
                            var18 >>= 0x1;
                        }
                        if (var18 >= 8) {
                            if (arg0.field1211 == arg0.field1207 && arg0.field1268 != -1) {
                                arg0.field1211 = arg0.field1268;
                            } else if (arg0.field1211 == arg0.field1208 && arg0.field1212 != -1) {
                                arg0.field1211 = arg0.field1212;
                            } else if (arg0.field1211 == arg0.field1209 && arg0.field1253 != -1) {
                                arg0.field1211 = arg0.field1253;
                            } else if (arg0.field1257 == arg0.field1211 && arg0.field1214 != -1) {
                                arg0.field1211 = arg0.field1214;
                            }
                        } else if (var18 <= 2) {
                            if (arg0.field1211 == arg0.field1207 && arg0.field1215 != -1) {
                                arg0.field1211 = arg0.field1215;
                            } else if (arg0.field1211 == arg0.field1208 && arg0.field1216 != -1) {
                                arg0.field1211 = arg0.field1216;
                            } else if (arg0.field1211 == arg0.field1209 && arg0.field1217 != -1) {
                                arg0.field1211 = arg0.field1217;
                            } else if (arg0.field1257 == arg0.field1211 && arg0.field1247 != -1) {
                                arg0.field1211 = arg0.field1247;
                            }
                        }
                        if (var11 != var13 || var12 != var14) {
                            if (var11 < var13) {
                                arg0.field1228 += var18;
                                if (arg0.field1228 > var13) {
                                    arg0.field1228 = var13;
                                }
                            } else if (var11 > var13) {
                                arg0.field1228 -= var18;
                                if (arg0.field1228 < var13) {
                                    arg0.field1228 = var13;
                                }
                            }
                            if (var12 < var14) {
                                arg0.field1199 += var18;
                                if (arg0.field1199 > var14) {
                                    arg0.field1199 = var14;
                                }
                            } else if (var12 > var14) {
                                arg0.field1199 -= var18;
                                if (arg0.field1199 < var14) {
                                    arg0.field1199 = var14;
                                }
                            }
                        }
                        if (arg0.field1228 == var13 && arg0.field1199 == var14) {
                            arg0.field1246--;
                            if (arg0.field1262 > 0) {
                                arg0.field1262--;
                            }
                        }
                    } else {
                        arg0.field1228 = var13;
                        arg0.field1199 = var14;
                        arg0.field1246--;
                        if (arg0.field1262 > 0) {
                            arg0.field1262--;
                        }
                    }
                }
            }
        }
        if (arg0.field1228 < 128 || arg0.field1199 < 128 || arg0.field1228 >= 13184 || arg0.field1199 >= 13184) {
            arg0.field1243 = -1;
            arg0.field1254 = 0;
            arg0.field1255 = 0;
            arg0.method2286();
            arg0.field1228 = arg0.field1273[0] * 128 + arg0.field1202 * 64;
            arg0.field1199 = arg0.field1270[0] * 128 + arg0.field1202 * 64;
            arg0.method2272();
        }
        if (Statics.field2132 == arg0 && (arg0.field1228 < 1536 || arg0.field1199 < 1536 || arg0.field1228 >= 11776 || arg0.field1199 >= 11776)) {
            arg0.field1243 = -1;
            arg0.field1254 = 0;
            arg0.field1255 = 0;
            arg0.method2286();
            arg0.field1228 = arg0.field1273[0] * 128 + arg0.field1202 * 64;
            arg0.field1199 = arg0.field1270[0] * 128 + arg0.field1202 * 64;
            arg0.method2272();
        }
        Statics.method2962(arg0);
        method2761(arg0);
    }

    @ObfuscatedName("mx.id(Ldr;I)V")
    public static final void method6008(class96 arg0) {
        int var1 = Math.max(1, arg0.field1254 - field833);
        int var2 = arg0.field1250 * 128 + arg0.field1202 * 64;
        int var3 = arg0.field1252 * 128 + arg0.field1202 * 64;
        arg0.field1228 += (var2 - arg0.field1228) / var1;
        arg0.field1199 += (var3 - arg0.field1199) / var1;
        arg0.field1272 = 0;
        arg0.field1239 = arg0.field1256;
    }

    @ObfuscatedName("es.iv(Ldr;I)V")
    public static final void method2761(class96 arg0) {
        arg0.field1206 = false;
        if (arg0.field1211 != -1) {
            class209 var1 = class209.method3394(arg0.field1211);
            if (var1 == null) {
                arg0.field1211 = -1;
            } else if (!var1.method3775() && var1.field2313 != null) {
                arg0.field1241++;
                if (arg0.field1198 < var1.field2313.length && arg0.field1241 > var1.field2324[arg0.field1198]) {
                    arg0.field1241 = 1;
                    arg0.field1198++;
                    method3246(var1, arg0.field1198, arg0.field1228, arg0.field1199);
                }
                if (arg0.field1198 >= var1.field2313.length) {
                    if (var1.field2317 > 0) {
                        arg0.field1198 -= var1.field2317;
                        if (var1.field2325) {
                            arg0.field1242++;
                        }
                        if (arg0.field1198 < 0 || arg0.field1198 >= var1.field2313.length || var1.field2325 && arg0.field1242 >= var1.field2305) {
                            arg0.field1241 = 0;
                            arg0.field1198 = 0;
                            arg0.field1242 = 0;
                        }
                    } else {
                        arg0.field1241 = 0;
                        arg0.field1198 = 0;
                    }
                    method3246(var1, arg0.field1198, arg0.field1228, arg0.field1199);
                }
            } else if (var1.method3775()) {
                arg0.field1198++;
                int var2 = var1.method3747();
                if (arg0.field1198 < var2) {
                    method3122(var1, arg0.field1198, arg0.field1228, arg0.field1199);
                } else {
                    if (var1.field2317 > 0) {
                        arg0.field1198 -= var1.field2317;
                        if (var1.field2325) {
                            arg0.field1242++;
                        }
                        if (arg0.field1198 < 0 || arg0.field1198 >= var2 || var1.field2325 && arg0.field1242 >= var1.field2305) {
                            arg0.field1198 = 0;
                            arg0.field1241 = 0;
                            arg0.field1242 = 0;
                        }
                    } else {
                        arg0.field1241 = 0;
                        arg0.field1198 = 0;
                    }
                    method3122(var1, arg0.field1198, arg0.field1228, arg0.field1199);
                }
            } else {
                arg0.field1211 = -1;
            }
        }
        class487 var3 = new class487(arg0.method2276());
        for (class537 var4 = (class537) var3.method7991(); var4 != null; var4 = (class537) var3.next()) {
            if (var4.field5257 != -1 && field833 >= var4.field5256) {
                int var5 = class199.method3551(var4.field5257).field2102;
                if (var5 == -1) {
                    var4.method7700();
                    arg0.field1249--;
                } else {
                    var4.field5254 = Math.max(var4.field5254, 0);
                    class209 var6 = class209.method3394(var5);
                    if (var6.field2313 != null && !var6.method3775()) {
                        var4.field5253++;
                        if (var4.field5254 < var6.field2313.length && var4.field5253 > var6.field2324[var4.field5254]) {
                            var4.field5253 = 1;
                            var4.field5254++;
                            method3246(var6, var4.field5254, arg0.field1228, arg0.field1199);
                        }
                        if (var4.field5254 >= var6.field2313.length) {
                            var4.method7700();
                            arg0.field1249--;
                        }
                    } else if (var6.method3775()) {
                        var4.field5254++;
                        int var7 = var6.method3747();
                        if (var4.field5254 < var7) {
                            method3122(var6, var4.field5254, arg0.field1228, arg0.field1199);
                        } else {
                            var4.method7700();
                            arg0.field1249--;
                        }
                    } else {
                        var4.method7700();
                        arg0.field1249--;
                    }
                }
            }
        }
        if (arg0.field1243 != -1 && arg0.field1260 <= 1) {
            class209 var8 = class209.method3394(arg0.field1243);
            if (var8.field2326 == 1 && arg0.field1262 > 0 && arg0.field1254 <= field833 && arg0.field1255 < field833) {
                arg0.field1260 = 1;
                return;
            }
        }
        if (arg0.field1243 != -1 && arg0.field1260 == 0) {
            class209 var9 = class209.method3394(arg0.field1243);
            if (var9 == null) {
                arg0.field1243 = -1;
            } else if (!var9.method3775() && var9.field2313 != null) {
                arg0.field1245++;
                if (arg0.field1244 < var9.field2313.length && arg0.field1245 > var9.field2324[arg0.field1244]) {
                    arg0.field1245 = 1;
                    arg0.field1244++;
                    method3246(var9, arg0.field1244, arg0.field1228, arg0.field1199);
                }
                if (arg0.field1244 >= var9.field2313.length) {
                    arg0.field1244 -= var9.field2317;
                    arg0.field1225++;
                    if (arg0.field1225 >= var9.field2305) {
                        arg0.field1243 = -1;
                    } else if (arg0.field1244 >= 0 && arg0.field1244 < var9.field2313.length) {
                        method3246(var9, arg0.field1244, arg0.field1228, arg0.field1199);
                    } else {
                        arg0.field1243 = -1;
                    }
                }
                arg0.field1206 = var9.field2320;
            } else if (var9.method3775()) {
                arg0.field1244++;
                int var10 = var9.method3747();
                if (arg0.field1244 < var10) {
                    method3122(var9, arg0.field1244, arg0.field1228, arg0.field1199);
                } else {
                    arg0.field1244 -= var9.field2317;
                    arg0.field1225++;
                    if (arg0.field1225 >= var9.field2305) {
                        arg0.field1243 = -1;
                    } else if (arg0.field1244 >= 0 && arg0.field1244 < var10) {
                        method3122(var9, arg0.field1244, arg0.field1228, arg0.field1199);
                    } else {
                        arg0.field1243 = -1;
                    }
                }
            } else {
                arg0.field1243 = -1;
            }
        }
        if (arg0.field1260 > 0) {
            arg0.field1260--;
        }
    }

    @ObfuscatedName("ks.ip(I)V")
    public static void method5039() {
        if (Statics.field114 != null) {
            Statics.field114.method7783(Statics.field1321, (Statics.field2132.field1228 >> 7) + Statics.field1448, (Statics.field2132.field1199 >> 7) + Statics.field354, false);
            Statics.field114.method7802();
        }
    }

    @ObfuscatedName("sl.ik(Ldf;III)V")
    public static void method8060(class92 arg0, int arg1, int arg2) {
        if (arg0.field1243 == arg1 && arg1 != -1) {
            int var3 = class209.method3394(arg1).field2328;
            if (var3 == 1) {
                arg0.field1244 = 0;
                arg0.field1245 = 0;
                arg0.field1260 = arg2;
                arg0.field1225 = 0;
            }
            if (var3 == 2) {
                arg0.field1225 = 0;
            }
        } else if (arg1 == -1 || arg0.field1243 == -1 || class209.method3394(arg1).field2321 >= class209.method3394(arg0.field1243).field2321) {
            arg0.field1243 = arg1;
            arg0.field1244 = 0;
            arg0.field1245 = 0;
            arg0.field1260 = arg2;
            arg0.field1225 = 0;
            arg0.field1262 = arg0.field1246;
        }
    }

    @ObfuscatedName("ih.iq(I)I")
    public static int method3928() {
        return field758 ? 2 : 1;
    }

    @ObfuscatedName("co.jn(B)V")
    public static void method1157() {
        class297 var0 = class297.method1166(class295.field3198, field592.field1429);
        var0.field3227.method8283(method3928());
        var0.field3227.method8345(Statics.field1450);
        var0.field3227.method8345(Statics.field1890);
        field592.method2665(var0);
    }

    @ObfuscatedName("client.ar(B)V")
    public final void method499() {
        field757 = class302.method655() + 500L;
        this.method1199();
        if (field699 != -1) {
            this.method1207(true);
        }
    }

    @ObfuscatedName("client.jk(I)V")
    public void method1199() {
        int var1 = Statics.field1450;
        int var2 = Statics.field1890;
        if (this.field214 < var1) {
            int var3 = this.field214;
        }
        if (this.field220 < var2) {
            int var4 = this.field220;
        }
        if (Statics.field4737 != null) {
            try {
                class27.method375(Statics.field2415, "resize", new Object[] { method3928() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.jv(B)V")
    public final void method1200() {
        if (field699 != -1) {
            method5470(field699);
        }
        for (int var1 = 0; var1 < field698; var1++) {
            if (field537[var1]) {
                field750[var1] = true;
            }
            field751[var1] = field537[var1];
            field537[var1] = false;
        }
        field748 = field833;
        field688 = -1;
        field689 = -1;
        if (field699 != -1) {
            field698 = 0;
            method693(field699, 0, 0, Statics.field1450, Statics.field1890, 0, 0, -1);
        }
        class525.method8603();
        if (field818) {
            if (field764 == 1) {
                Statics.field1718[field706 / 100].method8774(field647 - 8, field648 - 8);
            }
            if (field764 == 2) {
                Statics.field1718[field706 / 100 + 4].method8774(field647 - 8, field648 - 8);
            }
        }
        if (field640) {
            int var7 = Statics.field61;
            int var8 = Statics.field4603;
            int var9 = Statics.field3510;
            int var10 = Statics.field2650;
            int var11 = 6116423;
            class525.method8612(var7, var8, var9, var10, var11);
            class525.method8612(var7 + 1, var8 + 1, var9 - 2, 16, 0);
            class525.method8616(var7 + 1, var8 + 18, var9 - 2, var10 - 19, 0);
            Statics.field451.method6925(class352.field4080, var7 + 3, var8 + 14, var11, -1);
            int var12 = class36.field255;
            int var13 = class36.field233;
            for (int var14 = 0; var14 < field676; var14++) {
                int var15 = (field676 - 1 - var14) * 15 + var8 + 31;
                int var16 = 16777215;
                if (var12 > var7 && var12 < var7 + var9 && var13 > var15 - 13 && var13 < var15 + 3) {
                    var16 = 16776960;
                }
                Statics.field451.method6925(method3261(var14), var7 + 3, var15, var16, 0);
            }
            int var17 = Statics.field61;
            int var18 = Statics.field4603;
            int var19 = Statics.field3510;
            int var20 = Statics.field2650;
            for (int var21 = 0; var21 < field698; var21++) {
                if (field754[var21] + field752[var21] > var17 && field752[var21] < var17 + var19 && field755[var21] + field753[var21] > var18 && field753[var21] < var18 + var20) {
                    field750[var21] = true;
                }
            }
        } else if (field688 != -1) {
            int var2 = field688;
            int var3 = field689;
            if ((field676 >= 2 || field692 != 0 || field619) && field687) {
                int var4 = field676 - 1;
                String var6;
                if (field692 == 1 && field676 < 2) {
                    var6 = class352.field4077 + class352.field3961 + field693 + " " + class102.field1340;
                } else if (field619 && field676 < 2) {
                    var6 = field710 + class352.field3961 + field721 + " " + class102.field1340;
                } else {
                    var6 = method3261(var4);
                }
                if (field676 > 2) {
                    var6 = var6 + class102.method3915(16777215) + " " + '/' + " " + (field676 - 2) + class352.field3944;
                }
                Statics.field451.method6914(var6, var2 + 4, var3 + 15, 16777215, 0, field833 / 1000);
            }
        }
        if (field756 == 3) {
            for (int var22 = 0; var22 < field698; var22++) {
                if (field751[var22]) {
                    class525.method8611(field752[var22], field753[var22], field754[var22], field755[var22], 16711935, 128);
                } else if (field750[var22]) {
                    class525.method8611(field752[var22], field753[var22], field754[var22], field755[var22], 16711680, 128);
                }
            }
        }
        class70.method2900(Statics.field1321, Statics.field2132.field1228, Statics.field2132.field1199, field606);
        field606 = 0;
    }

    @ObfuscatedName("pt.je(Ljava/lang/String;ZB)V")
    public static final void method6982(String arg0, boolean arg1) {
        if (!field653) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1058.method6875(arg0, 250);
        int var6 = Statics.field1058.method6841(arg0, 250) * 13;
        class525.method8612(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class525.method8616(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1058.method6837(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field698; var11++) {
            if (field754[var11] + field752[var11] > var7 && field752[var11] < var7 + var9 && field755[var11] + field753[var11] > var8 && field753[var11] < var8 + var10) {
                field537[var11] = true;
            }
        }
        if (arg1) {
            Statics.field1358.method472(0, 0);
        } else {
            method312(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("fs.jr(IIIII)V")
    public static final void method2910(int arg0, int arg1, int arg2, int arg3) {
        field697++;
        if (Statics.field2132.field1228 >> 7 == field778 && Statics.field2132.field1199 >> 7 == field701) {
            field778 = 0;
        }
        method3872();
        method2187();
        method4670(true);
        method2973();
        method4670(false);
        for (class77 var4 = (class77) field654.method6393(); var4 != null; var4 = (class77) field654.method6395()) {
            if (Statics.field1321 != var4.field974 || field833 > var4.field983) {
                var4.method7700();
            } else if (field833 >= var4.field998) {
                if (!var4.field975 && var4.field989 != 0) {
                    if (var4.field989 > 0) {
                        class101 var5 = field587[var4.field989 - 1];
                        if (var5 != null && var5.field1228 >= 0 && var5.field1228 < 13312 && var5.field1199 >= 0 && var5.field1199 < 13312) {
                            var4.field984 = var5.field1228;
                            var4.field973 = var5.field1199;
                            var4.method2053(var4.field979, var4.field980, var4.field981, field833);
                        }
                    } else {
                        int var6 = -var4.field989 - 1;
                        class92 var7;
                        if (field655 == var6) {
                            var7 = Statics.field2132;
                        } else {
                            var7 = field700[var6];
                        }
                        if (var7 != null && var7.field1228 >= 0 && var7.field1228 < 13312 && var7.field1199 >= 0 && var7.field1199 < 13312) {
                            var4.field984 = var7.field1228;
                            var4.field973 = var7.field1199;
                            var4.method2053(var4.field979, var4.field980, var4.field981, field833);
                        }
                    }
                }
                if (var4.field987 > 0) {
                    class101 var8 = field587[var4.field987 - 1];
                    if (var8 != null && var8.field1228 >= 0 && var8.field1228 < 13312 && var8.field1199 >= 0 && var8.field1199 < 13312) {
                        var4.method2053(var8.field1228, var8.field1199, method284(var8.field1228, var8.field1199, var4.field974) - var4.field978, field833);
                    }
                }
                if (var4.field987 < 0) {
                    int var9 = -var4.field987 - 1;
                    class92 var10;
                    if (field655 == var9) {
                        var10 = Statics.field2132;
                    } else {
                        var10 = field700[var9];
                    }
                    if (var10 != null && var10.field1228 >= 0 && var10.field1228 < 13312 && var10.field1199 >= 0 && var10.field1199 < 13312) {
                        var4.method2053(var10.field1228, var10.field1199, method284(var10.field1228, var10.field1199, var4.field974) - var4.field978, field833);
                    }
                }
                var4.method2054(field606);
                Statics.field1570.method4212(Statics.field1321, (int) var4.field997, (int) var4.field990, (int) var4.field991, 60, var4, var4.field977, -1L, false);
            }
        }
        method3102();
        method1170(arg0, arg1, arg2, arg3, true);
        int var11 = field809;
        int var12 = field810;
        int var13 = field743;
        int var14 = field618;
        class525.method8621(var11, var12, var11 + var13, var12 + var14);
        class227.method4065();
        class525.method8624();
        int var15 = field566;
        if (field669 / 256 > var15) {
            var15 = field669 / 256;
        }
        if (field796[4] && field749[4] + 128 > var15) {
            var15 = field749[4] + 128;
        }
        int var16 = field705 & 0x7FF;
        int var17 = Statics.field4651;
        int var18 = Statics.field1495;
        int var19 = Statics.field1324;
        int var20 = method3219(var15);
        int var21 = var14 - 334;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 100) {
            var21 = 100;
        }
        int var22 = (field804 - field803) * var21 / 100 + field803;
        int var23 = var20 * var22 / 256;
        int var25 = 2048 - var15 & 0x7FF;
        int var26 = 2048 - var16 & 0x7FF;
        int var27 = 0;
        int var28 = 0;
        int var29 = var23;
        if (var25 != 0) {
            int var30 = class227.field2535[var25];
            int var31 = class227.field2533[var25];
            int var32 = var28 * var31 - var23 * var30 >> 16;
            var29 = var28 * var30 + var23 * var31 >> 16;
            var28 = var32;
        }
        if (var26 != 0) {
            int var33 = class227.field2535[var26];
            int var34 = class227.field2533[var26];
            int var35 = var27 * var34 + var29 * var33 >> 16;
            var29 = var29 * var34 - var27 * var33 >> 16;
            var27 = var35;
        }
        if (field788) {
            Statics.field4963 = var17 - var27;
            Statics.field125 = var18 - var28;
            Statics.field174 = var19 - var29;
            Statics.field1460 = var15;
            Statics.field2801 = var16;
        } else {
            Statics.field2069 = var17 - var27;
            Statics.field1609 = var18 - var28;
            Statics.field1656 = var19 - var29;
            Statics.field1546 = var15;
            Statics.field1485 = var16;
        }
        if (field620 == 1 && field615 >= 2 && field833 % 50 == 0 && (Statics.field4651 >> 7 != Statics.field2132.field1228 >> 7 || Statics.field1324 >> 7 != Statics.field2132.field1199 >> 7)) {
            int var36 = Statics.field2132.field1150;
            int var37 = (Statics.field4651 >> 7) + Statics.field1448;
            int var38 = (Statics.field1324 >> 7) + Statics.field354;
            method2524(var37, var38, var36, true);
        }
        int var51;
        if (field788) {
            var51 = method3558();
        } else {
            int var39;
            if (Statics.field4737.method2343()) {
                var39 = Statics.field1321;
            } else {
                label577: {
                    int var40 = 3;
                    if (Statics.field1546 < 310) {
                        int var41;
                        int var42;
                        if (field620 == 1) {
                            var41 = Statics.field4651 >> 7;
                            var42 = Statics.field1324 >> 7;
                        } else {
                            var41 = Statics.field2132.field1228 >> 7;
                            var42 = Statics.field2132.field1199 >> 7;
                        }
                        int var43 = Statics.field2069 >> 7;
                        int var44 = Statics.field1656 >> 7;
                        if (var43 < 0 || var44 < 0 || var43 >= 104 || var44 >= 104) {
                            var39 = Statics.field1321;
                            break label577;
                        }
                        if (var41 < 0 || var42 < 0 || var41 >= 104 || var42 >= 104) {
                            var39 = Statics.field1321;
                            break label577;
                        }
                        if ((class82.field1050[Statics.field1321][var43][var44] & 0x4) != 0) {
                            var40 = Statics.field1321;
                        }
                        int var45;
                        if (var41 > var43) {
                            var45 = var41 - var43;
                        } else {
                            var45 = var43 - var41;
                        }
                        int var46;
                        if (var42 > var44) {
                            var46 = var42 - var44;
                        } else {
                            var46 = var44 - var42;
                        }
                        if (var45 > var46) {
                            int var47 = var46 * 65536 / var45;
                            int var48 = 32768;
                            while (var41 != var43) {
                                if (var43 < var41) {
                                    var43++;
                                } else if (var43 > var41) {
                                    var43--;
                                }
                                if ((class82.field1050[Statics.field1321][var43][var44] & 0x4) != 0) {
                                    var40 = Statics.field1321;
                                }
                                var48 += var47;
                                if (var48 >= 65536) {
                                    var48 -= 65536;
                                    if (var44 < var42) {
                                        var44++;
                                    } else if (var44 > var42) {
                                        var44--;
                                    }
                                    if ((class82.field1050[Statics.field1321][var43][var44] & 0x4) != 0) {
                                        var40 = Statics.field1321;
                                    }
                                }
                            }
                        } else if (var46 > 0) {
                            int var49 = var45 * 65536 / var46;
                            int var50 = 32768;
                            while (var42 != var44) {
                                if (var44 < var42) {
                                    var44++;
                                } else if (var44 > var42) {
                                    var44--;
                                }
                                if ((class82.field1050[Statics.field1321][var43][var44] & 0x4) != 0) {
                                    var40 = Statics.field1321;
                                }
                                var50 += var49;
                                if (var50 >= 65536) {
                                    var50 -= 65536;
                                    if (var43 < var41) {
                                        var43++;
                                    } else if (var43 > var41) {
                                        var43--;
                                    }
                                    if ((class82.field1050[Statics.field1321][var43][var44] & 0x4) != 0) {
                                        var40 = Statics.field1321;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field2132.field1228 >= 0 && Statics.field2132.field1199 >= 0 && Statics.field2132.field1228 < 13312 && Statics.field2132.field1199 < 13312) {
                        if ((class82.field1050[Statics.field1321][Statics.field2132.field1228 >> 7][Statics.field2132.field1199 >> 7] & 0x4) != 0) {
                            var40 = Statics.field1321;
                        }
                        var39 = var40;
                    } else {
                        var39 = Statics.field1321;
                    }
                }
            }
            var51 = var39;
        }
        int var52 = Statics.field2069;
        int var53 = Statics.field1609;
        int var54 = Statics.field1656;
        int var55 = Statics.field1546;
        int var56 = Statics.field1485;
        for (int var57 = 0; var57 < 5; var57++) {
            if (field796[var57]) {
                int var58 = (int) (Math.random() * (double) (field589[var57] * 2 + 1) - (double) field589[var57] + Math.sin((double) field659[var57] / 100.0D * (double) field745[var57]) * (double) field749[var57]);
                if (var57 == 0) {
                    Statics.field2069 += var58;
                }
                if (var57 == 1) {
                    Statics.field1609 += var58;
                }
                if (var57 == 2) {
                    Statics.field1656 += var58;
                }
                if (var57 == 3) {
                    Statics.field1485 = Statics.field1485 + var58 & 0x7FF;
                }
                if (var57 == 4) {
                    Statics.field1546 += var58;
                    if (Statics.field1546 < 128) {
                        Statics.field1546 = 128;
                    }
                    if (Statics.field1546 > 383) {
                        Statics.field1546 = 383;
                    }
                }
            }
        }
        int var59 = class36.field255;
        int var60 = class36.field233;
        if (class36.field249 != 0) {
            var59 = class36.field250;
            var60 = class36.field251;
        }
        if (var59 >= var11 && var59 < var11 + var13 && var60 >= var12 && var60 < var12 + var14) {
            class241.method1998(var59 - var11, var60 - var12);
        } else {
            class241.method2584();
        }
        method5215();
        class525.method8612(var11, var12, var13, var14, 0);
        method5215();
        int var61 = class227.method4062();
        class227.method4066(Statics.field2415.field216);
        class227.field2537.field2816 = field813;
        Statics.field1570.method4244(Statics.field2069, Statics.field1609, Statics.field1656, Statics.field1546, Statics.field1485, var51);
        class227.method4066(false);
        if (field591) {
            class525.method8625();
        }
        class227.field2537.field2816 = var61;
        method5215();
        Statics.field1570.method4329();
        field632 = 0;
        boolean var62 = false;
        int var63 = -1;
        int var64 = -1;
        int var65 = class108.field1380;
        int[] var66 = class108.field1381;
        for (int var67 = 0; var67 < field588 + var65; var67++) {
            class96 var68;
            if (var67 < var65) {
                var68 = field700[var66[var67]];
                if (field666 == var66[var67]) {
                    var62 = true;
                    var63 = var67;
                    continue;
                }
                if (Statics.field2132 == var68) {
                    var64 = var67;
                    continue;
                }
            } else {
                var68 = field587[field526[var67 - var65]];
            }
            method828(var68, var67, var11, var12, var13, var14);
        }
        if (field765 && var64 != -1) {
            method828(Statics.field2132, var64, var11, var12, var13, var14);
        }
        if (var62) {
            method828(field700[field666], var63, var11, var12, var13, var14);
        }
        for (int var69 = 0; var69 < field632; var69++) {
            int var70 = field634[var69];
            int var71 = field635[var69];
            int var72 = field812[var69];
            int var73 = field586[var69];
            boolean var74 = true;
            while (var74) {
                var74 = false;
                for (int var75 = 0; var75 < var69; var75++) {
                    if (var71 + 2 > field635[var75] - field586[var75] && var71 - var73 < field635[var75] + 2 && var70 - var72 < field812[var75] + field634[var75] && var70 + var72 > field634[var75] - field812[var75] && field635[var75] - field586[var75] < var71) {
                        var71 = field635[var75] - field586[var75];
                        var74 = true;
                    }
                }
            }
            field645 = field634[var69];
            field646 = field635[var69] = var71;
            String var76 = field642[var69];
            if (field703 == 0) {
                int var77 = 16776960;
                if (field638[var69] < 6) {
                    var77 = field759[field638[var69]];
                }
                if (field638[var69] == 6) {
                    var77 = field697 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field638[var69] == 7) {
                    var77 = field697 % 20 < 10 ? 255 : 65535;
                }
                if (field638[var69] == 8) {
                    var77 = field697 % 20 < 10 ? 45056 : 8454016;
                }
                if (field638[var69] == 9) {
                    int var78 = 150 - field787[var69];
                    if (var78 < 50) {
                        var77 = var78 * 1280 + 16711680;
                    } else if (var78 < 100) {
                        var77 = 16776960 - (var78 - 50) * 327680;
                    } else if (var78 < 150) {
                        var77 = (var78 - 100) * 5 + 65280;
                    }
                }
                if (field638[var69] == 10) {
                    int var79 = 150 - field787[var69];
                    if (var79 < 50) {
                        var77 = var79 * 5 + 16711680;
                    } else if (var79 < 100) {
                        var77 = 16711935 - (var79 - 50) * 327680;
                    } else if (var79 < 150) {
                        var77 = (var79 - 100) * 327680 + 255 - (var79 - 100) * 5;
                    }
                }
                if (field638[var69] == 11) {
                    int var80 = 150 - field787[var69];
                    if (var80 < 50) {
                        var77 = 16777215 - var80 * 327685;
                    } else if (var80 < 100) {
                        var77 = (var80 - 50) * 327685 + 65280;
                    } else if (var80 < 150) {
                        var77 = 16777215 - (var80 - 100) * 327680;
                    }
                }
                if (field638[var69] == 12 && field536[var69] == null) {
                    int var81 = var76.length();
                    field536[var69] = new int[var81];
                    for (int var82 = 0; var82 < var81; var82++) {
                        int var83 = (int) ((float) var82 / (float) var81 * 64.0F);
                        int var84 = var83 << 10 | 0x380 | 0x40;
                        field536[var69][var82] = Statics.field4796[var84];
                    }
                }
                if (field639[var69] == 0) {
                    Statics.field451.method6853(var76, field645 + var11, field646 + var12, var77, 0, field536[var69]);
                }
                if (field639[var69] == 1) {
                    Statics.field451.method6869(var76, field645 + var11, field646 + var12, var77, 0, field697, field536[var69]);
                }
                if (field639[var69] == 2) {
                    Statics.field451.method6851(var76, field645 + var11, field646 + var12, var77, 0, field697, field536[var69]);
                }
                if (field639[var69] == 3) {
                    Statics.field451.method6889(var76, field645 + var11, field646 + var12, var77, 0, field697, 150 - field787[var69], field536[var69]);
                }
                if (field639[var69] == 4) {
                    int var85 = (150 - field787[var69]) * (Statics.field451.method6838(var76) + 100) / 150;
                    class525.method8657(field645 + var11 - 50, var12, field645 + var11 + 50, var12 + var14);
                    Statics.field451.method6897(var76, field645 + var11 + 50 - var85, field646 + var12, var77, 0, field536[var69]);
                    class525.method8621(var11, var12, var11 + var13, var12 + var14);
                }
                if (field639[var69] == 5) {
                    int var86 = 150 - field787[var69];
                    int var87 = 0;
                    if (var86 < 25) {
                        var87 = var86 - 25;
                    } else if (var86 > 125) {
                        var87 = var86 - 125;
                    }
                    class525.method8657(var11, field646 + var12 - Statics.field451.field4484 - 1, var11 + var13, field646 + var12 + 5);
                    Statics.field451.method6853(var76, field645 + var11, field646 + var12 + var87, var77, 0, field536[var69]);
                    class525.method8621(var11, var12, var11 + var13, var12 + var14);
                }
            } else {
                Statics.field451.method6846(var76, field645 + var11, field646 + var12, 16776960, 0);
            }
        }
        method2180(var11, var12);
        ((class237) class227.field2537.field2813).method4403(field606);
        method2985(var11, var12, var13, var14);
        Statics.field2069 = var52;
        Statics.field1609 = var53;
        Statics.field1656 = var54;
        Statics.field1546 = var55;
        Statics.field1485 = var56;
        if (field540 && Statics.field3463.method6233(true, false) == 0) {
            field540 = false;
        }
        if (field540) {
            class525.method8612(var11, var12, var13, var14, 0);
            method6982(class352.field3924, false);
        }
    }

    @ObfuscatedName("cu.jc(IIIIZI)V")
    public static final void method1170(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field801;
        } else if (var5 >= 100) {
            var6 = field686;
        } else {
            var6 = (field686 - field801) * var5 / 100 + field801;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field807) {
            short var8 = field807;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field636) {
                var6 = field636;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class525.method8603();
                    class525.method8612(arg0, arg1, var10, arg3, -16777216);
                    class525.method8612(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field808) {
            short var11 = field808;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field805) {
                var6 = field805;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class525.method8603();
                    class525.method8612(arg0, arg1, arg2, var13, -16777216);
                    class525.method8612(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field813 = arg3 * var6 / 334;
        if (field743 != arg2 || field618 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method3219(var16);
                int var18 = class227.field2535[var16];
                int var19 = arg3 - 334;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 100) {
                    var19 = 100;
                }
                int var20 = (field804 - field803) * var19 / 100 + field803;
                int var21 = var17 * var20 / 256;
                var14[var15] = var18 * var21 >> 16;
            }
            class231.method4264(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field809 = arg0;
        field810 = arg1;
        field743 = arg2;
        field618 = arg3;
    }

    @ObfuscatedName("iw.ja(I)V")
    public static void method3872() {
        if (field765) {
            method2256(Statics.field2132, false);
        }
    }

    @ObfuscatedName("ds.jg(B)V")
    public static void method2187() {
        if (field666 >= 0 && field700[field666] != null) {
            method2256(field700[field666], false);
        }
    }

    @ObfuscatedName("fx.ji(I)V")
    public static void method2973() {
        int var0 = class108.field1380;
        int[] var1 = class108.field1381;
        for (int var2 = 0; var2 < var0; var2++) {
            if (field666 != var1[var2] && field655 != var1[var2]) {
                method2256(field700[var1[var2]], true);
            }
        }
    }

    @ObfuscatedName("dz.jl(Ldf;ZB)V")
    public static void method2256(class92 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2220() || arg0.field1149) {
            return;
        }
        arg0.field1147 = false;
        if ((field531 && class108.field1380 > 50 || class108.field1380 > 200) && arg1 && arg0.field1211 == arg0.field1204) {
            arg0.field1147 = true;
        }
        int var2 = arg0.field1228 >> 7;
        int var3 = arg0.field1199 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class241.method7981(0, 0, 0, false, arg0.field1128);
        if (arg0.field1142 != null && field833 >= arg0.field1137 && field833 < arg0.field1148) {
            arg0.field1147 = false;
            arg0.field1135 = method284(arg0.field1228, arg0.field1199, Statics.field1321);
            arg0.field1234 = field833;
            Statics.field1570.method4213(Statics.field1321, arg0.field1228, arg0.field1199, arg0.field1135, 60, arg0, arg0.field1200, var4, arg0.field1154, arg0.field1144, arg0.field1145, arg0.field1133);
            return;
        }
        if ((arg0.field1228 & 0x7F) == 64 && (arg0.field1199 & 0x7F) == 64) {
            if (field697 == field643[var2][var3]) {
                return;
            }
            field643[var2][var3] = field697;
        }
        arg0.field1135 = method284(arg0.field1228, arg0.field1199, Statics.field1321);
        arg0.field1234 = field833;
        Statics.field1570.method4212(Statics.field1321, arg0.field1228, arg0.field1199, arg0.field1135, 60, arg0, arg0.field1200, var4, arg0.field1206);
    }

    @ObfuscatedName("jx.jj(ZB)V")
    public static final void method4670(boolean arg0) {
        for (int var1 = 0; var1 < field588; var1++) {
            class101 var2 = field587[field526[var1]];
            if (var2 != null && var2.method2220() && var2.field1327.field2065 == arg0 && var2.field1327.method3415()) {
                int var3 = var2.field1228 >> 7;
                int var4 = var2.field1199 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1202 == 1 && (var2.field1228 & 0x7F) == 64 && (var2.field1199 & 0x7F) == 64) {
                        if (field697 == field643[var3][var4]) {
                            continue;
                        }
                        field643[var3][var4] = field697;
                    }
                    long var5 = class241.method7981(0, 0, 1, !var2.field1327.field2072, field526[var1]);
                    var2.field1234 = field833;
                    Statics.field1570.method4212(Statics.field1321, var2.field1228, var2.field1199, method284(var2.field1228 + (var2.field1202 * 64 - 64), var2.field1199 + (var2.field1202 * 64 - 64), Statics.field1321), var2.field1202 * 64 - 64 + 60, var2, var2.field1200, var5, var2.field1206);
                }
            }
        }
    }

    @ObfuscatedName("ge.jq(I)V")
    public static final void method3102() {
        for (class72 var0 = (class72) field798.method6393(); var0 != null; var0 = (class72) field798.method6395()) {
            if (Statics.field1321 != var0.field897 || var0.field904) {
                var0.method7700();
            } else if (field833 >= var0.field896) {
                var0.method1988(field606);
                if (var0.field904) {
                    var0.method7700();
                } else {
                    Statics.field1570.method4212(var0.field897, var0.field898, var0.field899, var0.field895, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("hc.jo(I)I")
    public static final int method3558() {
        if (Statics.field4737.method2343()) {
            return Statics.field1321;
        } else {
            int var0 = method284(Statics.field2069, Statics.field1656, Statics.field1321);
            return var0 - Statics.field1609 >= 800 || (class82.field1050[Statics.field1321][Statics.field2069 >> 7][Statics.field1656 >> 7] & 0x4) == 0 ? 3 : Statics.field1321;
        }
    }

    @ObfuscatedName("dd.js(III)V")
    public static final void method2180(int arg0, int arg1) {
        if (field605 == 2) {
            method2462((field551 - Statics.field1448 << 7) + field714, (field694 - Statics.field354 << 7) + field747, field558 * 2);
            if (field645 > -1 && field833 % 20 < 10) {
                Statics.field1064[0].method8774(field645 + arg0 - 12, field646 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("bt.jw(I)Low;")
    public static class378 method440() {
        return field742;
    }

    @ObfuscatedName("tq.jy(B)V")
    public static void method8162() {
        for (class212 var0 = (class212) field781.method6393(); var0 != null; var0 = (class212) field781.method6395()) {
            var0.method7700();
        }
    }

    @ObfuscatedName("go.jx(Lie;S)V")
    public static void method3096(class212 arg0) {
        if (arg0 == null || arg0.field2356 == null) {
            return;
        }
        if (arg0.field2356.field3770 >= 0) {
            class332 var1 = class332.method2255(arg0.field2356.field3666);
            if (var1 == null || var1.field3784 == null || var1.field3784.length == 0 || arg0.field2356.field3770 >= var1.field3784.length || var1.field3784[arg0.field2356.field3770] != arg0.field2356) {
                return;
            }
        }
        if (arg0.field2356.field3649 == 11 && arg0.field2351 == 0) {
            if (arg0.field2356.method5860(arg0.field2353, arg0.field2355, 0, 0)) {
                switch(arg0.field2356.method5864()) {
                    case 0:
                        class32.method446(arg0.field2356.method5866(), true, false);
                        break;
                    case 1:
                        int var2 = method3401(arg0.field2356);
                        boolean var3 = (var2 >> 22 & 0x1) != 0;
                        if (var3) {
                            int[] var4 = arg0.field2356.method5880();
                            if (var4 != null) {
                                class297 var5 = class297.method1166(class295.field3125, field592.field1429);
                                var5.field3227.method8353(var4[1]);
                                var5.field3227.method8354(arg0.field2356.field3647);
                                var5.field3227.method8481(arg0.field2356.field3770);
                                var5.field3227.method8464(arg0.field2356.method5865());
                                var5.field3227.method8354(var4[2]);
                                var5.field3227.method8354(var4[0]);
                                field592.method2665(var5);
                            }
                        }
                }
            }
        } else if (arg0.field2356.field3649 == 12) {
            class330 var6 = arg0.field2356.method5988();
            if (var6 != null && var6.method5614()) {
                switch(arg0.field2351) {
                    case 0:
                        field766.method3793(arg0.field2356);
                        var6.method5562(true);
                        var6.method5803(arg0.field2353, arg0.field2355, field675.method3811(82), field675.method3811(81));
                        break;
                    case 1:
                        var6.method5646(arg0.field2353, arg0.field2355);
                }
            }
        }
    }

    @ObfuscatedName("ec.ju(B)Z")
    public static boolean method2796() {
        return (field530 & 0x4) != 0;
    }

    @ObfuscatedName("ev.jb(I)Z")
    public static boolean method2709() {
        return (field530 & 0x2) != 0;
    }

    @ObfuscatedName("jn.jz(Ldf;I)Z")
    public static boolean method4398(class92 arg0) {
        if (field530 == 0) {
            return false;
        } else if (Statics.field2132 == arg0) {
            return (field530 & 0x8) != 0;
        } else {
            boolean var1 = method2796();
            if (!var1) {
                boolean var2 = (field530 & 0x1) != 0;
                var1 = var2 && arg0.method2208();
            }
            return var1 || method2709() && arg0.method2211();
        }
    }

    @ObfuscatedName("bb.jp(Ldr;IIIIIB)V")
    public static final void method828(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2220()) {
            return;
        }
        if (arg0 instanceof class101) {
            class196 var6 = ((class101) arg0).field1327;
            if (var6.field2066 != null) {
                var6 = var6.method3409();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class108.field1380;
        int[] var8 = class108.field1381;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1269 != null && (!var9 || !arg0.field1221 && (field760 == 4 || !arg0.field1220 && (field760 == 0 || field760 == 3 || field760 == 1 && ((class92) arg0).method2208())))) {
            method2068(arg0, arg0.field1258);
            if (field645 > -1 && field632 < field564) {
                field812[field632] = Statics.field451.method6838(arg0.field1269) / 2;
                field586[field632] = Statics.field451.field4484;
                field634[field632] = field645;
                field635[field632] = field646 - var10;
                field638[field632] = arg0.field1223;
                field639[field632] = arg0.field1224;
                field787[field632] = arg0.field1222;
                field536[field632] = arg0.field1265;
                field642[field632] = arg0.field1269;
                field632++;
                var10 += 12;
            }
        }
        if (!arg0.field1232.method6446()) {
            method2068(arg0, arg0.field1258 + 15);
            for (class100 var11 = (class100) arg0.field1232.method6457(); var11 != null; var11 = (class100) arg0.field1232.method6443()) {
                class97 var12 = var11.method2460(field833);
                if (var12 != null) {
                    class191 var13 = var11.field1319;
                    class529 var14 = var13.method3364();
                    class529 var15 = var13.method3363();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field2003;
                    } else {
                        if (var13.field2004 * 2 < var15.field5218) {
                            var16 = var13.field2004;
                        }
                        var17 = var15.field5218 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field833 - var12.field1280;
                    int var21 = var12.field1277 * var17 / var13.field2003;
                    int var24;
                    if (var12.field1278 > var20) {
                        int var22 = var13.field1999 == 0 ? 0 : var20 / var13.field1999 * var13.field1999;
                        int var23 = var12.field1275 * var17 / var13.field2003;
                        var24 = (var21 - var23) * var22 / var12.field1278 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1278 + var13.field1996 - var20;
                        if (var13.field2000 >= 0) {
                            var18 = (var25 << 8) / (var13.field1996 - var13.field2000);
                        }
                    }
                    if (var12.field1277 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field645 > -1) {
                            int var31 = field645 + arg2 - (var17 >> 1);
                            int var32 = field646 + arg3 - var10;
                            class525.method8612(var31, var32, var24, 5, 65280);
                            class525.method8612(var24 + var31, var32, var17 - var24, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var26;
                        if (var17 == var24) {
                            var26 = var16 * 2 + var24;
                        } else {
                            var26 = var16 + var24;
                        }
                        int var27 = var14.field5209;
                        var10 += var27;
                        int var28 = field645 + arg2 - (var17 >> 1);
                        int var29 = field646 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method8764(var30, var29, var18);
                            class525.method8657(var30, var29, var26 + var30, var27 + var29);
                            var15.method8764(var30, var29, var18);
                        } else {
                            var14.method8774(var30, var29);
                            class525.method8657(var30, var29, var26 + var30, var27 + var29);
                            var15.method8774(var30, var29);
                        }
                        class525.method8621(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2461()) {
                    var11.method7700();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field833 == arg0.field1234 && method4398((class92) arg0)) {
            class92 var33 = (class92) arg0;
            if (var9) {
                method2068(arg0, arg0.field1258 + 15);
                class398 var34 = (class398) field596.get(class485.field4958);
                var10 += 4;
                var34.method6846(var33.field1146.method8917(), field645 + arg2, field646 + arg3 - var10, 16777215, 0);
                var10 += 18;
            }
        }
        if (var9) {
            class92 var35 = (class92) arg0;
            if (var35.field1149) {
                return;
            }
            if (var35.field1130 != -1 || var35.field1131 != -1) {
                method2068(arg0, arg0.field1258 + 15);
                if (field645 > -1) {
                    if (var35.field1130 != -1) {
                        var10 += 25;
                        Statics.field1895[var35.field1130].method8774(field645 + arg2 - 12, field646 + arg3 - var10);
                    }
                    if (var35.field1131 != -1) {
                        var10 += 25;
                        Statics.field5030[var35.field1131].method8774(field645 + arg2 - 12, field646 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field605 == 10 && field568 == var8[arg1]) {
                method2068(arg0, arg0.field1258 + 15);
                if (field645 > -1) {
                    int var36 = Statics.field1064[1].field5209 + var10;
                    Statics.field1064[1].method8774(field645 + arg2 - 12, field646 + arg3 - var36);
                }
            }
        } else {
            class101 var37 = (class101) arg0;
            int[] var38 = var37.method2470();
            short[] var39 = var37.method2486();
            if (var39 != null && var38 != null) {
                for (int var40 = 0; var40 < var39.length; var40++) {
                    if (var39[var40] >= 0 && var38[var40] >= 0) {
                        long var41 = (long) var38[var40] << 8 | (long) var39[var40];
                        class529 var43 = (class529) field820.method7160(var41);
                        if (var43 == null) {
                            class529[] var44 = class530.method7773(Statics.field305, var38[var40], 0);
                            if (var44 != null && var39[var40] < var44.length) {
                                var43 = var44[var39[var40]];
                                field820.method7161(var41, var43);
                            }
                        }
                        if (var43 != null) {
                            method2068(arg0, arg0.field1258 + 15);
                            if (field645 > -1) {
                                var43.method8774(field645 + arg2 - (var43.field5218 >> 1), field646 + (arg3 - var43.field5209) - 4);
                            }
                        }
                    }
                }
            }
            if (field605 == 1 && field549 == field526[arg1 - var7] && field833 % 20 < 10) {
                method2068(arg0, arg0.field1258 + 15);
                if (field645 > -1) {
                    Statics.field1064[0].method8774(field645 + arg2 - 12, field646 + arg3 - 28);
                }
            }
        }
        for (int var45 = 0; var45 < 4; var45++) {
            int var46 = arg0.field1229[var45];
            int var47 = arg0.field1227[var45];
            class205 var48 = null;
            int var49 = 0;
            if (var47 >= 0) {
                if (var46 <= field833) {
                    continue;
                }
                var48 = class205.method5085(arg0.field1227[var45]);
                var49 = var48.field2162;
                if (var48 != null && var48.field2166 != null) {
                    var48 = var48.method3562();
                    if (var48 == null) {
                        arg0.field1229[var45] = -1;
                        continue;
                    }
                }
            } else if (var46 < 0) {
                continue;
            }
            int var50 = arg0.field1230[var45];
            class205 var51 = null;
            if (var50 >= 0) {
                var51 = class205.method5085(var50);
                if (var51 != null && var51.field2166 != null) {
                    var51 = var51.method3562();
                }
            }
            if (var46 - var49 <= field833) {
                if (var48 == null) {
                    arg0.field1229[var45] = -1;
                } else {
                    method2068(arg0, arg0.field1258 / 2);
                    if (field645 > -1) {
                        boolean var52 = true;
                        if (var45 == 1) {
                            field646 -= 20;
                        }
                        if (var45 == 2) {
                            field645 -= 15;
                            field646 -= 10;
                        }
                        if (var45 == 3) {
                            field645 += 15;
                            field646 -= 10;
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
                        class529 var65 = null;
                        class529 var66 = null;
                        class529 var67 = null;
                        class529 var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        class529 var78 = var48.method3563();
                        if (var78 != null) {
                            var57 = var78.field5218;
                            int var79 = var78.field5209;
                            if (var79 > var77) {
                                var77 = var79;
                            }
                            var61 = var78.field5207;
                        }
                        class529 var80 = var48.method3559();
                        if (var80 != null) {
                            var58 = var80.field5218;
                            int var81 = var80.field5209;
                            if (var81 > var77) {
                                var77 = var81;
                            }
                            var62 = var80.field5207;
                        }
                        class529 var82 = var48.method3565();
                        if (var82 != null) {
                            var59 = var82.field5218;
                            int var83 = var82.field5209;
                            if (var83 > var77) {
                                var77 = var83;
                            }
                            var63 = var82.field5207;
                        }
                        class529 var84 = var48.method3566();
                        if (var84 != null) {
                            var60 = var84.field5218;
                            int var85 = var84.field5209;
                            if (var85 > var77) {
                                var77 = var85;
                            }
                            var64 = var84.field5207;
                        }
                        if (var51 != null) {
                            var65 = var51.method3563();
                            if (var65 != null) {
                                var69 = var65.field5218;
                                int var86 = var65.field5209;
                                if (var86 > var77) {
                                    var77 = var86;
                                }
                                var73 = var65.field5207;
                            }
                            var66 = var51.method3559();
                            if (var66 != null) {
                                var70 = var66.field5218;
                                int var87 = var66.field5209;
                                if (var87 > var77) {
                                    var77 = var87;
                                }
                                var74 = var66.field5207;
                            }
                            var67 = var51.method3565();
                            if (var67 != null) {
                                var71 = var67.field5218;
                                int var88 = var67.field5209;
                                if (var88 > var77) {
                                    var77 = var88;
                                }
                                var75 = var67.field5207;
                            }
                            var68 = var51.method3566();
                            if (var68 != null) {
                                var72 = var68.field5218;
                                int var89 = var68.field5209;
                                if (var89 > var77) {
                                    var77 = var89;
                                }
                                var76 = var68.field5207;
                            }
                        }
                        class394 var90 = var48.method3599();
                        if (var90 == null) {
                            var90 = Statics.field1279;
                        }
                        class394 var91;
                        if (var51 == null) {
                            var91 = Statics.field1279;
                        } else {
                            var91 = var51.method3599();
                            if (var91 == null) {
                                var91 = Statics.field1279;
                            }
                        }
                        Object var92 = null;
                        String var93 = null;
                        boolean var94 = false;
                        int var95 = 0;
                        String var96 = var48.method3572(arg0.field1210[var45]);
                        int var97 = var90.method6838(var96);
                        if (var51 != null) {
                            var93 = var51.method3572(arg0.field1231[var45]);
                            var95 = var91.method6838(var93);
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
                        int var114 = arg0.field1229[var45] - field833;
                        int var115 = var48.field2160 - var48.field2160 * var114 / var48.field2162;
                        int var116 = var48.field2154 * var114 / var48.field2162 + -var48.field2154;
                        int var117 = field645 + arg2 - (var106 >> 1) + var115;
                        int var118 = field646 + arg3 - 12 + var116;
                        int var119 = var118;
                        int var120 = var77 + var118;
                        int var121 = var48.field2164 + var118 + 15;
                        int var122 = var121 - var90.field4488;
                        int var123 = var90.field4489 + var121;
                        if (var122 < var118) {
                            var119 = var122;
                        }
                        if (var123 > var120) {
                            var120 = var123;
                        }
                        int var124 = 0;
                        if (var51 != null) {
                            var124 = var51.field2164 + var118 + 15;
                            int var125 = var124 - var91.field4488;
                            int var126 = var91.field4489 + var124;
                            if (var125 < var119) {
                                ;
                            }
                            if (var126 > var120) {
                                ;
                            }
                        }
                        int var129 = 255;
                        if (var48.field2148 >= 0) {
                            var129 = (var114 << 8) / (var48.field2162 - var48.field2148);
                        }
                        if (var129 >= 0 && var129 < 255) {
                            if (var78 != null) {
                                var78.method8764(var101 + var117 - var61, var118, var129);
                            }
                            if (var82 != null) {
                                var82.method8764(var102 + var117 - var63, var118, var129);
                            }
                            if (var80 != null) {
                                for (int var130 = 0; var130 < var98; var130++) {
                                    var80.method8764(var58 * var130 + (var103 + var117 - var62), var118, var129);
                                }
                            }
                            if (var84 != null) {
                                var84.method8764(var107 + var117 - var64, var118, var129);
                            }
                            var90.method6844(var96, var104 + var117, var121, var48.field2151, 0, var129);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8764(var108 + var117 - var73, var118, var129);
                                }
                                if (var67 != null) {
                                    var67.method8764(var109 + var117 - var75, var118, var129);
                                }
                                if (var66 != null) {
                                    for (int var131 = 0; var131 < var99; var131++) {
                                        var66.method8764(var70 * var131 + (var110 + var117 - var74), var118, var129);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8764(var111 + var117 - var76, var118, var129);
                                }
                                var91.method6844(var93, var112 + var117, var124, var51.field2151, 0, var129);
                            }
                        } else {
                            if (var78 != null) {
                                var78.method8774(var101 + var117 - var61, var118);
                            }
                            if (var82 != null) {
                                var82.method8774(var102 + var117 - var63, var118);
                            }
                            if (var80 != null) {
                                for (int var132 = 0; var132 < var98; var132++) {
                                    var80.method8774(var58 * var132 + (var103 + var117 - var62), var118);
                                }
                            }
                            if (var84 != null) {
                                var84.method8774(var107 + var117 - var64, var118);
                            }
                            var90.method6925(var96, var104 + var117, var121, var48.field2151 | 0xFF000000, 0);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method8774(var108 + var117 - var73, var118);
                                }
                                if (var67 != null) {
                                    var67.method8774(var109 + var117 - var75, var118);
                                }
                                if (var66 != null) {
                                    for (int var133 = 0; var133 < var99; var133++) {
                                        var66.method8774(var70 * var133 + (var110 + var117 - var74), var118);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method8774(var111 + var117 - var76, var118);
                                }
                                var91.method6925(var93, var112 + var117, var124, var51.field2151 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fw.jf(IIIII)V")
    public static final void method2985(int arg0, int arg1, int arg2, int arg3) {
        field652 = 0;
        int var4 = (Statics.field2132.field1228 >> 7) + Statics.field1448;
        int var5 = (Statics.field2132.field1199 >> 7) + Statics.field354;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field652 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field652 = 1;
        }
        if (field652 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field652 = 0;
        }
    }

    @ObfuscatedName("cc.jm(Ldr;II)V")
    public static final void method2068(class96 arg0, int arg1) {
        method2462(arg0.field1228, arg0.field1199, arg1);
    }

    @ObfuscatedName("dm.jd(IIII)V")
    public static final void method2462(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field645 = -1;
            field646 = -1;
            return;
        }
        int var3 = method284(arg0, arg1, Statics.field1321) - arg2;
        int var4 = arg0 - Statics.field2069;
        int var5 = var3 - Statics.field1609;
        int var6 = arg1 - Statics.field1656;
        int var7 = class227.field2535[Statics.field1546];
        int var8 = class227.field2533[Statics.field1546];
        int var9 = class227.field2535[Statics.field1485];
        int var10 = class227.field2533[Statics.field1485];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field645 = field813 * var11 / var15 + field743 / 2;
            field646 = field813 * var14 / var15 + field618 / 2;
        } else {
            field645 = -1;
            field646 = -1;
        }
    }

    @ObfuscatedName("ax.jh(IIII)I")
    public static final int method284(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class82.field1050[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class82.field1048[var5][var3][var4] + class82.field1048[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class82.field1048[var5][var3][var4 + 1] + class82.field1048[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("kf.kb(ZLto;I)V")
    public static final void method5059(boolean arg0, class514 arg1) {
        field603 = arg0;
        if (!field603) {
            int var2 = arg1.method8448();
            int var3 = arg1.method8344();
            int var4 = arg1.method8448();
            Statics.field5269 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field5269[var5][var6] = arg1.method8306();
                }
            }
            Statics.field2005 = new int[var4];
            Statics.field454 = new int[var4];
            Statics.field1917 = new int[var4];
            Statics.field1476 = new byte[var4][];
            Statics.field2095 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field2005[var7] = var10;
                    Statics.field454[var7] = Statics.field5023.method6167("m" + var8 + "_" + var9);
                    Statics.field1917[var7] = Statics.field5023.method6167("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method5462(var2, var3, true);
            return;
        }
        boolean var11 = arg1.method8300() == 1;
        int var12 = arg1.method8448();
        int var13 = arg1.method8448();
        int var14 = arg1.method8448();
        arg1.method8250();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8247(1);
                    if (var18 == 1) {
                        field604[var15][var16][var17] = arg1.method8247(26);
                    } else {
                        field604[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8264();
        Statics.field5269 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field5269[var19][var20] = arg1.method8306();
            }
        }
        Statics.field2005 = new int[var14];
        Statics.field454 = new int[var14];
        Statics.field1917 = new int[var14];
        Statics.field1476 = new byte[var14][];
        Statics.field2095 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field604[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field2005[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field2005[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field454[var21] = Statics.field5023.method6167("m" + var30 + "_" + var31);
                            Statics.field1917[var21] = Statics.field5023.method6167("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method5462(var13, var12, !var11);
    }

    @ObfuscatedName("mq.kt(IIZB)V")
    public static final void method5462(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field1038 == arg0 && Statics.field1106 == arg1) {
            return;
        }
        Statics.field1038 = arg0;
        Statics.field1106 = arg1;
        method5473(25);
        method6982(class352.field3924, true);
        int var3 = Statics.field1448;
        int var4 = Statics.field354;
        Statics.field1448 = (arg0 - 6) * 8;
        Statics.field354 = (arg1 - 6) * 8;
        int var5 = Statics.field1448 - var3;
        int var6 = Statics.field354 - var4;
        int var7 = Statics.field1448;
        int var8 = Statics.field354;
        for (int var9 = 0; var9 < 65536; var9++) {
            class101 var10 = field587[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1273[var11] -= var5;
                    var10.field1270[var11] -= var6;
                }
                var10.field1228 -= var5 * 128;
                var10.field1199 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class92 var13 = field700[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1273[var14] -= var5;
                    var13.field1270[var14] -= var6;
                }
                var13.field1228 -= var5 * 128;
                var13.field1199 -= var6 * 128;
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
                        field667[var25][var21][var22] = field667[var25][var23][var24];
                    } else {
                        field667[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class95 var26 = (class95) field668.method6393(); var26 != null; var26 = (class95) field668.method6395()) {
            var26.field1189 -= var5;
            var26.field1195 -= var6;
            if (var26.field1189 < 0 || var26.field1195 < 0 || var26.field1189 >= 104 || var26.field1195 >= 104) {
                var26.method7700();
            }
        }
        if (field778 != 0) {
            field778 -= var5;
            field701 -= var6;
        }
        field782 = 0;
        field788 = false;
        Statics.field2069 -= var5 << 7;
        Statics.field1656 -= var6 << 7;
        Statics.field4651 -= var5 << 7;
        Statics.field1324 -= var6 << 7;
        field773 = -1;
        field798.method6387();
        field654.method6387();
        for (int var27 = 0; var27 < 4; var27++) {
            field602[var27].method3853();
        }
    }

    @ObfuscatedName("eq.ki(ZI)V")
    public static final void method2594(boolean arg0) {
        method5215();
        field592.field1435++;
        if (field592.field1435 < 50 && !arg0) {
            return;
        }
        field592.field1435 = 0;
        if (field594 || field592.method2669() == null) {
            return;
        }
        class297 var1 = class297.method1166(class295.field3148, field592.field1429);
        field592.method2665(var1);
        try {
            field592.method2664();
        } catch (IOException var3) {
            field594 = true;
        }
    }

    @ObfuscatedName("og.kj(I)V")
    public static final void method6349() {
        method2594(false);
        field597 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1476.length; var1++) {
            if (Statics.field454[var1] != -1 && Statics.field1476[var1] == null) {
                Statics.field1476[var1] = Statics.field5023.method6128(Statics.field454[var1], 0);
                if (Statics.field1476[var1] == null) {
                    var0 = false;
                    field597++;
                }
            }
            if (Statics.field1917[var1] != -1 && Statics.field2095[var1] == null) {
                Statics.field2095[var1] = Statics.field5023.method6129(Statics.field1917[var1], 0, Statics.field5269[var1]);
                if (Statics.field2095[var1] == null) {
                    var0 = false;
                    field597++;
                }
            }
        }
        if (!var0) {
            field601 = 1;
            return;
        }
        field599 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1476.length; var3++) {
            byte[] var4 = Statics.field2095[var3];
            if (var4 != null) {
                int var5 = (Statics.field2005[var3] >> 8) * 64 - Statics.field1448;
                int var6 = (Statics.field2005[var3] & 0xFF) * 64 - Statics.field354;
                if (field603) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class82.method2956(var4, var5, var6);
            }
        }
        if (!var2) {
            field601 = 2;
            return;
        }
        if (field601 != 0) {
            method6982(class352.field3924 + class102.field1341 + class102.field1335 + 100 + "%" + class102.field1337, true);
        }
        method5215();
        Statics.field1570.method4201();
        for (int var7 = 0; var7 < 4; var7++) {
            field602[var7].method3853();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class82.field1050[var8][var9][var10] = 0;
                }
            }
        }
        method5215();
        class82.method6369();
        int var11 = Statics.field1476.length;
        class70.method6634();
        method2594(true);
        if (!field603) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field2005[var12] >> 8) * 64 - Statics.field1448;
                int var14 = (Statics.field2005[var12] & 0xFF) * 64 - Statics.field354;
                byte[] var15 = Statics.field1476[var12];
                if (var15 != null) {
                    method5215();
                    class82.method4998(var15, var13, var14, Statics.field1038 * 8 - 48, Statics.field1106 * 8 - 48, field602);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field2005[var16] >> 8) * 64 - Statics.field1448;
                int var18 = (Statics.field2005[var16] & 0xFF) * 64 - Statics.field354;
                byte[] var19 = Statics.field1476[var16];
                if (var19 == null && Statics.field1106 < 800) {
                    method5215();
                    class82.method259(var17, var18, 64, 64);
                }
            }
            method2594(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field2095[var20];
                if (var21 != null) {
                    int var22 = (Statics.field2005[var20] >> 8) * 64 - Statics.field1448;
                    int var23 = (Statics.field2005[var20] & 0xFF) * 64 - Statics.field354;
                    method5215();
                    class82.method7224(var21, var22, var23, Statics.field1570, field602);
                }
            }
        }
        if (field603) {
            for (int var24 = 0; var24 < 4; var24++) {
                method5215();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field604[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field2005.length; var34++) {
                                if (Statics.field2005[var34] == var33 && Statics.field1476[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    Statics.method2905(Statics.field1476[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field602);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class82.method6355(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field604[0][var37][var38];
                    if (var39 == -1) {
                        class82.method259(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method2594(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method5215();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field604[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field2005.length; var49++) {
                                if (Statics.field2005[var49] == var48 && Statics.field2095[var49] != null) {
                                    class82.method2111(Statics.field2095[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field1570, field602);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2594(true);
        method5215();
        class82.method2861(Statics.field1570, field602);
        method2594(true);
        int var50 = class82.field1040;
        if (var50 > Statics.field1321) {
            var50 = Statics.field1321;
        }
        if (var50 < Statics.field1321 - 1) {
            int var51 = Statics.field1321 - 1;
        }
        if (field531) {
            Statics.field1570.method4202(class82.field1040);
        } else {
            Statics.field1570.method4202(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method2920(var52, var53);
            }
        }
        method5215();
        method3100();
        class206.field2200.method5175();
        if (Statics.field2415.method529()) {
            class297 var54 = class297.method1166(class295.field3133, field592.field1429);
            var54.field3227.method8464(1057001181);
            field592.method2665(var54);
        }
        if (!field603) {
            int var55 = (Statics.field1038 - 6) / 8;
            int var56 = (Statics.field1038 + 6) / 8;
            int var57 = (Statics.field1106 - 6) / 8;
            int var58 = (Statics.field1106 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field5023.method6155("m" + var59 + "_" + var60);
                        Statics.field5023.method6155("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method5473(30);
        method5215();
        class82.method1842();
        class297 var61 = class297.method1166(class295.field3154, field592.field1429);
        field592.method2665(var61);
        class35.method2676();
    }

    @ObfuscatedName("am.ko(II)V")
    public static final void method256(int arg0) {
        int[] var1 = Statics.field4659.field5216;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class82.field1050[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1570.method4237(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class82.field1050[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1570.method4237(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field4659.method8714();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class82.field1050[arg0][var10][var9] & 0x18) == 0) {
                    method2537(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class82.field1050[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2537(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field774 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field1570.method4344(Statics.field1321, var11, var12);
                if (var13 != 0L) {
                    int var15 = class241.method3275(var13);
                    int var16 = class206.method3321(var15).field2205;
                    if (var16 >= 0 && class188.method2945(var16).field1951) {
                        field785[field774] = class188.method2945(var16).method3300(false);
                        field775[field774] = var11;
                        field776[field774] = var12;
                        field774++;
                    }
                }
            }
        }
        Statics.field1358.method8690();
    }

    @ObfuscatedName("de.ke(IIIIII)V")
    public static final void method2537(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1570.method4255(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1570.method4231(arg0, arg1, arg2, var5);
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
            int[] var14 = Statics.field4659.field5216;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class241.method3275(var5);
            class206 var17 = class206.method3321(var16);
            if (var17.field2204 == -1) {
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
                class528 var18 = Statics.field3371[var17.field2204];
                if (var18 != null) {
                    int var19 = (var17.field2186 * 4 - var18.field5201) / 2;
                    int var20 = (var17.field2171 * 4 - var18.field5202) / 2;
                    var18.method8705(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field2171) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field1570.method4229(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field1570.method4231(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class241.method3275(var21);
            class206 var27 = class206.method3321(var26);
            if (var27.field2204 != -1) {
                class528 var28 = Statics.field3371[var27.field2204];
                if (var28 != null) {
                    int var29 = (var27.field2186 * 4 - var28.field5201) / 2;
                    int var30 = (var27.field2171 * 4 - var28.field5202) / 2;
                    var28.method8705(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field2171) * 4 + 48 + var30);
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
                int[] var35 = Statics.field4659.field5216;
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
        long var37 = Statics.field1570.method4344(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class241.method3275(var37);
        class206 var40 = class206.method3321(var39);
        if (var40.field2204 == -1) {
            return;
        }
        class528 var41 = Statics.field3371[var40.field2204];
        if (var41 != null) {
            int var42 = (var40.field2186 * 4 - var41.field5201) / 2;
            int var43 = (var40.field2171 * 4 - var41.field5202) / 2;
            var41.method8705(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field2171) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.ks(Ler;II)Z")
    public boolean method1534(class112 arg0, int arg1) {
        if (arg0.field1432 == 0) {
            Statics.field265 = null;
        } else {
            if (Statics.field265 == null) {
                Statics.field265 = new class429(Statics.field4388, Statics.field2415);
            }
            Statics.field265.method7205(arg0.field1430, arg1);
        }
        field734 = field529;
        Statics.field2103 = true;
        arg0.field1426 = null;
        return true;
    }

    @ObfuscatedName("client.kn(Ler;I)Z")
    public boolean method1202(class112 arg0) {
        if (Statics.field265 != null) {
            Statics.field265.method7206(arg0.field1430);
        }
        field734 = field529;
        Statics.field2103 = true;
        arg0.field1426 = null;
        return true;
    }

    @ObfuscatedName("client.kd(Ler;I)Z")
    public final boolean method1203(class112 arg0) {
        class439 var2 = arg0.method2669();
        class514 var3 = arg0.field1430;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1426 == null) {
                if (arg0.field1433) {
                    if (!var2.method7364(1)) {
                        return false;
                    }
                    var2.method7367(arg0.field1430.field5108, 0, 1);
                    arg0.field1436 = 0;
                    arg0.field1433 = false;
                }
                var3.field5111 = 0;
                if (var3.method8243()) {
                    if (!var2.method7364(1)) {
                        return false;
                    }
                    var2.method7367(arg0.field1430.field5108, 1, 1);
                    arg0.field1436 = 0;
                }
                arg0.field1433 = true;
                class298[] var4 = class298.method3248();
                int var5 = var3.method8246();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5111);
                }
                arg0.field1426 = var4[var5];
                arg0.field1432 = arg0.field1426.field3357;
            }
            if (arg0.field1432 == -1) {
                if (!var2.method7364(1)) {
                    return false;
                }
                arg0.method2669().method7367(var3.field5108, 0, 1);
                arg0.field1432 = var3.field5108[0] & 0xFF;
            }
            if (arg0.field1432 == -2) {
                if (!var2.method7364(2)) {
                    return false;
                }
                arg0.method2669().method7367(var3.field5108, 0, 2);
                var3.field5111 = 0;
                arg0.field1432 = var3.method8448();
            }
            if (!var2.method7364(arg0.field1432)) {
                return false;
            }
            var3.field5111 = 0;
            var2.method7367(var3.field5108, 0, arg0.field1432);
            arg0.field1436 = 0;
            field595.method7062();
            arg0.field1438 = arg0.field1437;
            arg0.field1437 = arg0.field1431;
            arg0.field1431 = arg0.field1426;
            if (class298.field3294 == arg0.field1426) {
                Statics.field1540 = class534.method311(var3.method8300());
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3317 == arg0.field1426) {
                int var6 = var3.method8468();
                int var7 = var6 >> 16;
                int var8 = var6 >> 8 & 0xFF;
                int var9 = (var6 >> 4 & 0x7) + var7;
                int var10 = (var6 & 0x7) + var8;
                int var11 = var3.method8335();
                int var12 = var11 >> 2;
                int var13 = var11 & 0x3;
                int var14 = field712[var12];
                int var15 = var3.method8448();
                if (var9 >= 0 && var10 >= 0 && var9 < 103 && var10 < 103) {
                    if (var14 == 0) {
                        class248 var16 = Statics.field1570.method4223(Statics.field1321, var9, var10);
                        if (var16 != null) {
                            int var17 = class241.method3275(var16.field2843);
                            if (var12 == 2) {
                                var16.field2844 = new class80(var17, 2, var13 + 4, Statics.field1321, var9, var10, var15, false, var16.field2844);
                                var16.field2842 = new class80(var17, 2, var13 + 1 & 0x3, Statics.field1321, var9, var10, var15, false, var16.field2842);
                            } else {
                                var16.field2844 = new class80(var17, var12, var13, Statics.field1321, var9, var10, var15, false, var16.field2844);
                            }
                        }
                    } else if (var14 == 1) {
                        class250 var18 = Statics.field1570.method4224(Statics.field1321, var9, var10);
                        if (var18 != null) {
                            int var19 = class241.method3275(var18.field2856);
                            if (var12 == 4 || var12 == 5) {
                                var18.field2853 = new class80(var19, 4, var13, Statics.field1321, var9, var10, var15, false, var18.field2853);
                            } else if (var12 == 6) {
                                var18.field2853 = new class80(var19, 4, var13 + 4, Statics.field1321, var9, var10, var15, false, var18.field2853);
                            } else if (var12 == 7) {
                                var18.field2853 = new class80(var19, 4, (var13 + 2 & 0x3) + 4, Statics.field1321, var9, var10, var15, false, var18.field2853);
                            } else if (var12 == 8) {
                                var18.field2853 = new class80(var19, 4, var13 + 4, Statics.field1321, var9, var10, var15, false, var18.field2853);
                                var18.field2854 = new class80(var19, 4, (var13 + 2 & 0x3) + 4, Statics.field1321, var9, var10, var15, false, var18.field2854);
                            }
                        }
                    } else if (var14 == 2) {
                        class251 var20 = Statics.field1570.method4378(Statics.field1321, var9, var10);
                        if (var12 == 11) {
                            var12 = 10;
                        }
                        if (var20 != null) {
                            var20.field2865 = new class80(class241.method3275(var20.field2870), var12, var13, Statics.field1321, var9, var10, var15, false, var20.field2865);
                        }
                    } else if (var14 == 3) {
                        class223 var21 = Statics.field1570.method4292(Statics.field1321, var9, var10);
                        if (var21 != null) {
                            var21.field2477 = new class80(class241.method3275(var21.field2476), 22, var13, Statics.field1321, var9, var10, var15, false, var21.field2477);
                        }
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3291 == arg0.field1426) {
                int var22 = var3.method8306();
                class332 var23 = class332.method2255(var22);
                var23.field3691 = 3;
                var23.field3692 = Statics.field2132.field1129.method5527();
                method3930(var23);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3353 == arg0.field1426) {
                field795 = false;
                field788 = false;
                field789 = false;
                field790 = false;
                Statics.field1183 = 0;
                Statics.field2128 = 0;
                Statics.field3398 = 0;
                field791 = false;
                Statics.field189 = 0;
                Statics.field1964 = 0;
                Statics.field253 = 0;
                Statics.field3875 = 0;
                Statics.field1375 = 0;
                Statics.field181 = 0;
                Statics.field1938 = 0;
                field792 = null;
                field609 = null;
                field583 = null;
                for (int var24 = 0; var24 < 5; var24++) {
                    field796[var24] = false;
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3285 == arg0.field1426) {
                Statics.field1655 = null;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3318 == arg0.field1426) {
                int var25 = var3.method8306();
                int var26 = var3.method8306();
                int var27 = class35.method4949();
                class297 var28 = class297.method1166(class295.field3190, field592.field1429);
                var28.field3227.method8283(field206);
                var28.field3227.method8312(var25);
                var28.field3227.method8354(var26);
                var28.field3227.method8330(var27);
                field592.method2665(var28);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3254 == arg0.field1426) {
                method2718();
                field815 = var3.method8303();
                field579 = field529;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3304 == arg0.field1426) {
                Statics.method1721(class296.field3209);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3240 == arg0.field1426) {
                int var29 = var3.method8342();
                class85.method370(var29);
                field726[++field727 - 1 & 0x1F] = var29 & 0x7FFF;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3346 == arg0.field1426) {
                Statics.method1721(class296.field3213);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3334 == arg0.field1426) {
                byte var30 = var3.method8301();
                long var31 = (long) var3.method8448();
                long var33 = (long) var3.method8466();
                long var35 = (var31 << 32) + var33;
                boolean var37 = false;
                class164 var38 = var30 >= 0 ? field772[var30] : Statics.field2085;
                if (var38 == null) {
                    var37 = true;
                } else {
                    for (int var39 = 0; var39 < 100; var39++) {
                        if (field673[var39] == var35) {
                            var37 = true;
                            break;
                        }
                    }
                }
                if (!var37) {
                    field673[field535] = var35;
                    field535 = (field535 + 1) % 100;
                    String var40 = class335.method6035(var3);
                    int var41 = var30 >= 0 ? 43 : 46;
                    class111.method7089(var41, "", var40, var38.field1806);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3264 == arg0.field1426) {
                class108.method2742(var3, arg0.field1432);
                Statics.method6558();
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3277 == arg0.field1426) {
                field788 = true;
                field795 = false;
                field790 = true;
                Statics.field1183 = var3.method8300();
                Statics.field2128 = var3.method8300();
                Statics.field3398 = var3.method8448();
                int var42 = var3.method8448();
                int var43 = var3.method8300();
                int var44 = Statics.field1183 * 128 + 64;
                int var45 = Statics.field2128 * 128 + 64;
                int var46 = method284(var44, var45, Statics.field1321) - Statics.field3398;
                int var47 = var44 - Statics.field2069;
                int var48 = var46 - Statics.field1609;
                int var49 = var45 - Statics.field1656;
                double var50 = Math.sqrt((double) (var47 * var47 + var49 * var49));
                int var52 = method2750((int) (Math.atan2((double) var48, var50) * 325.9490051269531D) & 0x7FF);
                int var53 = method50((int) (Math.atan2((double) var47, (double) var49) * -325.9490051269531D) & 0x7FF);
                field609 = new class479(Statics.field1546, var52, var42, var43);
                field583 = new class479(Statics.field1485, var53, var42, var43);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3326 == arg0.field1426) {
                int var54 = arg0.field1432 + var3.field5111;
                int var55 = var3.method8448();
                if (var55 == 65535) {
                    var55 = -1;
                }
                int var56 = var3.method8448();
                if (field699 != var55) {
                    field699 = var55;
                    this.method1207(false);
                    method286(field699);
                    class71.method3917(field699);
                    for (int var57 = 0; var57 < 100; var57++) {
                        field537[var57] = true;
                    }
                }
                while (var56-- > 0) {
                    int var58 = var3.method8306();
                    int var59 = var3.method8448();
                    int var60 = var3.method8300();
                    class87 var61 = (class87) field548.method8025((long) var58);
                    if (var61 != null && var61.field1083 != var59) {
                        method2257(var61, true);
                        var61 = null;
                    }
                    if (var61 == null) {
                        var61 = method6039(var58, var59, var60);
                    }
                    var61.field1082 = true;
                }
                for (class87 var62 = (class87) field548.method8027(); var62 != null; var62 = (class87) field548.method8028()) {
                    if (var62.field1082) {
                        var62.field1082 = false;
                    } else {
                        method2257(var62, true);
                    }
                }
                field746 = new class489(512);
                while (var3.field5111 < var54) {
                    int var63 = var3.method8306();
                    int var64 = var3.method8448();
                    int var65 = var3.method8448();
                    int var66 = var3.method8306();
                    for (int var67 = var64; var67 <= var65; var67++) {
                        long var68 = ((long) var63 << 32) + (long) var67;
                        field746.method8035(new class472(var66), var68);
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3343 == arg0.field1426) {
                int var70 = var3.method8306();
                int var71 = var3.method8430();
                class87 var72 = (class87) field548.method8025((long) var71);
                class87 var73 = (class87) field548.method8025((long) var70);
                if (var73 != null) {
                    method2257(var73, var72 == null || var72.field1083 != var73.field1083);
                }
                if (var72 != null) {
                    var72.method7700();
                    field548.method8035(var72, (long) var70);
                }
                class332 var74 = class332.method2255(var71);
                if (var74 != null) {
                    method3930(var74);
                }
                class332 var75 = class332.method2255(var70);
                if (var75 != null) {
                    method3930(var75);
                    method2001(Statics.field3229[var75.field3647 >>> 16], var75, true);
                }
                if (field699 != -1) {
                    method6574(field699, 1);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3298 == arg0.field1426) {
                Statics.method4724();
                byte var76 = var3.method8301();
                if (arg0.field1432 == 1) {
                    if (var76 >= 0) {
                        field771[var76] = null;
                    } else {
                        Statics.field1391 = null;
                    }
                    arg0.field1426 = null;
                    return true;
                }
                if (var76 >= 0) {
                    field771[var76] = new class155(var3);
                } else {
                    Statics.field1391 = new class155(var3);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3311 == arg0.field1426) {
                int var77 = var3.method8306();
                class87 var78 = (class87) field548.method8025((long) var77);
                if (var78 != null) {
                    method2257(var78, true);
                }
                if (field704 != null) {
                    method3930(field704);
                    field704 = null;
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3333 == arg0.field1426) {
                int var79 = var3.method8448();
                int var80 = var3.method8468();
                int var81 = var80 >> 16;
                int var82 = var80 >> 8 & 0xFF;
                int var83 = (var80 >> 4 & 0x7) + var81;
                int var84 = (var80 & 0x7) + var82;
                int var85 = var3.method8333();
                int var86 = var3.method8343();
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var87 = var83 * 128 + 64;
                    int var88 = var84 * 128 + 64;
                    class72 var89 = new class72(var79, Statics.field1321, var87, var88, method284(var87, var88, Statics.field1321) - var85, var86, field833);
                    field798.method6405(var89);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3330 == arg0.field1426) {
                field736 = field529;
                byte var90 = var3.method8301();
                if (arg0.field1432 == 1) {
                    if (var90 >= 0) {
                        field772[var90] = null;
                    } else {
                        Statics.field2085 = null;
                    }
                    arg0.field1426 = null;
                    return true;
                }
                if (var90 >= 0) {
                    field772[var90] = new class164(var3);
                } else {
                    Statics.field2085 = new class164(var3);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3245 == arg0.field1426) {
                Statics.method1721(class296.field3218);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3341 == arg0.field1426) {
                Statics.method1721(class296.field3219);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3349 == arg0.field1426) {
                int var91 = var3.method8342();
                int var92 = var3.method8335();
                if (var91 == 65535) {
                    var91 = -1;
                }
                method8060(Statics.field2132, var91, var92);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3354 == arg0.field1426) {
                method5059(true, arg0.field1430);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3274 == arg0.field1426) {
                if (field699 != -1) {
                    method6574(field699, 0);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3266 == arg0.field1426) {
                int var93 = var3.method8357();
                int var94 = var3.method8344();
                int var95 = var3.method8343();
                class332 var96 = class332.method2255(var93);
                var96.field3742 = (var94 << 16) + var95;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3323 == arg0.field1426) {
                field780 = var3.method8300();
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3335 == arg0.field1426) {
                byte var97 = var3.method8301();
                String var98 = var3.method8311();
                long var99 = (long) var3.method8448();
                long var101 = (long) var3.method8466();
                class354 var103 = (class354) class373.method371(class354.method5300(), var3.method8300());
                long var104 = (var99 << 32) + var101;
                boolean var106 = false;
                Object var107 = null;
                class164 var108 = var97 >= 0 ? field772[var97] : Statics.field2085;
                if (var108 == null) {
                    var106 = true;
                } else {
                    int var109 = 0;
                    while (true) {
                        if (var109 >= 100) {
                            if (var103.field4233 && Statics.field3367.method1776(new class538(var98, Statics.field4388))) {
                                var106 = true;
                            }
                            break;
                        }
                        if (field673[var109] == var104) {
                            var106 = true;
                            break;
                        }
                        var109++;
                    }
                }
                if (!var106) {
                    field673[field535] = var104;
                    field535 = (field535 + 1) % 100;
                    String var110 = class398.method6856(class335.method6035(var3));
                    int var111 = var97 >= 0 ? 41 : 44;
                    if (var103.field4248 == -1) {
                        class111.method7089(var111, var98, var110, var108.field1806);
                    } else {
                        class111.method7089(var111, Statics.method4049(var103.field4248) + var98, var110, var108.field1806);
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3316 == arg0.field1426) {
                var3.field5111 += 28;
                if (var3.method8329()) {
                    method417(var3, var3.field5111 - 28);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3329 == arg0.field1426) {
                String var112 = var3.method8311();
                int var113 = var3.method8333();
                int var114 = var3.method8335();
                if (var114 >= 1 && var114 <= 8) {
                    if (var112.equalsIgnoreCase(class352.field4223)) {
                        var112 = null;
                    }
                    field550[var114 - 1] = var112;
                    field664[var114 - 1] = var113 == 0;
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3282 == arg0.field1426) {
                int var115 = var3.method8448();
                if (var115 == 65535) {
                    var115 = -1;
                }
                method5072(var115);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3314 == arg0.field1426) {
                int var116 = var3.method8344();
                if (var116 == 65535) {
                    var116 = -1;
                }
                int var117 = var3.method8458();
                method2051(var116, var117);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3237 == arg0.field1426) {
                method7440();
                arg0.field1426 = null;
                return false;
            }
            if (class298.field3328 == arg0.field1426) {
                int var118 = var3.method8356();
                int var119 = var3.method8335();
                int var120 = var3.method8344();
                class87 var121 = (class87) field548.method8025((long) var118);
                if (var121 != null) {
                    method2257(var121, var121.field1083 != var120);
                }
                method6039(var118, var120, var119);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3306 == arg0.field1426) {
                boolean var122 = var3.method8498() == 1;
                int var123 = var3.method8306();
                class332 var124 = class332.method2255(var123);
                if (var124.field3667 != var122) {
                    var124.field3667 = var122;
                    method3930(var124);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3238 == arg0.field1426) {
                int var125 = var3.method8344();
                int var126 = var3.method8448();
                int var127 = var3.method8357();
                int var128 = var3.method8448();
                class332 var129 = class332.method2255(var127);
                if (var129.field3699 != var128 || var129.field3718 != var125 || var129.field3702 != var126) {
                    var129.field3699 = var128;
                    var129.field3718 = var125;
                    var129.field3702 = var126;
                    method3930(var129);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3239 == arg0.field1426) {
                int var130 = var3.method8343();
                int var131 = var3.method8356();
                class332 var132 = class332.method2255(var131);
                if (var132.field3691 != 1 || var132.field3692 != var130) {
                    var132.field3691 = 1;
                    var132.field3692 = var130;
                    method3930(var132);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3234 == arg0.field1426) {
                Statics.method1721(class296.field3215);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3279 == arg0.field1426) {
                int var133 = var3.method8343();
                int var134 = var3.method8342();
                int var135 = var3.method8342();
                int var136 = var3.method8344();
                int var137 = var3.method8344();
                if (var136 == 65535) {
                    var136 = -1;
                }
                ArrayList var138 = new ArrayList();
                var138.add(var136);
                method3056(var138, var137, var134, var135, var133);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3255 == arg0.field1426) {
                Statics.method1721(class296.field3208);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3253 == arg0.field1426) {
                Statics.field3367.method1771();
                field733 = field529;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3284 == arg0.field1426) {
                byte[] var139 = new byte[arg0.field1432];
                var3.method8244(var139, 0, var139.length);
                class515 var140 = new class515(var139);
                String var141 = var140.method8311();
                class32.method446(var141, true, false);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3313 == arg0.field1426) {
                class68 var142 = new class68();
                var142.field844 = var3.method8311();
                var142.field841 = var3.method8448();
                int var143 = var3.method8306();
                var142.field837 = var143;
                if (var142.method1719()) {
                    var142.field848 = "beta";
                }
                method5473(45);
                var2.method7386();
                Object var144 = null;
                class76.method6375(var142);
                arg0.field1426 = null;
                return false;
            }
            if (class298.field3299 == arg0.field1426) {
                field547 = var3.method8343() * 30;
                field579 = field529;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3241 == arg0.field1426) {
                int var145 = var3.method8448();
                if (var145 == 65535) {
                    var145 = -1;
                }
                field699 = var145;
                this.method1207(false);
                method286(var145);
                class71.method3917(field699);
                for (int var146 = 0; var146 < 100; var146++) {
                    field537[var146] = true;
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3340 == arg0.field1426) {
                field788 = true;
                field795 = false;
                field789 = true;
                Statics.field1375 = var3.method8300();
                Statics.field181 = var3.method8300();
                int var147 = var3.method8448();
                int var148 = var3.method8448();
                field791 = var3.method8309();
                int var149 = var3.method8300();
                int var150 = Statics.field1375 * 128 + 64;
                int var151 = Statics.field181 * 128 + 64;
                boolean var152 = false;
                boolean var153 = false;
                int var154;
                int var155;
                if (field791) {
                    var154 = Statics.field1609;
                    var155 = method284(var150, var151, Statics.field1321) - var147;
                } else {
                    var154 = method284(Statics.field2069, Statics.field1656, Statics.field1321) - Statics.field1609;
                    var155 = var147;
                }
                field792 = new class478(Statics.field2069, Statics.field1656, var154, var150, var151, var155, var148, var149);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3300 == arg0.field1426) {
                method5059(false, arg0.field1430);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3339 == arg0.field1426) {
                int var156 = var3.method8430();
                class332 var157 = class332.method2255(var156);
                for (int var158 = 0; var158 < var157.field3778.length; var158++) {
                    var157.field3778[var158] = -1;
                    var157.field3778[var158] = 0;
                }
                method3930(var157);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3307 == arg0.field1426) {
                int var159 = var3.method8342();
                int var160 = var3.method8430();
                class332 var161 = class332.method2255(var160);
                if (var161 != null && var161.field3649 == 0) {
                    if (var159 > var161.field3671 - var161.field3635) {
                        var159 = var161.field3671 - var161.field3635;
                    }
                    if (var159 < 0) {
                        var159 = 0;
                    }
                    if (var161.field3682 != var159) {
                        var161.field3682 = var159;
                        method3930(var161);
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3327 == arg0.field1426) {
                field761 = var3.method8300();
                field760 = var3.method8333();
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3321 == arg0.field1426) {
                field788 = true;
                field795 = false;
                field790 = false;
                Statics.field1183 = var3.method8300();
                Statics.field2128 = var3.method8300();
                Statics.field3398 = var3.method8448();
                Statics.field189 = var3.method8300();
                Statics.field1964 = var3.method8300();
                if (Statics.field1964 >= 100) {
                    int var162 = Statics.field1183 * 128 + 64;
                    int var163 = Statics.field2128 * 128 + 64;
                    int var164 = method284(var162, var163, Statics.field1321) - Statics.field3398;
                    int var165 = var162 - Statics.field2069;
                    int var166 = var164 - Statics.field1609;
                    int var167 = var163 - Statics.field1656;
                    int var168 = (int) Math.sqrt((double) (var165 * var165 + var167 * var167));
                    Statics.field1546 = (int) (Math.atan2((double) var166, (double) var168) * 325.9490051269531D) & 0x7FF;
                    Statics.field1485 = (int) (Math.atan2((double) var165, (double) var167) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1546 < 128) {
                        Statics.field1546 = 128;
                    }
                    if (Statics.field1546 > 383) {
                        Statics.field1546 = 383;
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3283 == arg0.field1426) {
                return this.method1534(arg0, 1);
            }
            if (class298.field3292 == arg0.field1426) {
                field605 = var3.method8300();
                if (field605 == 1) {
                    field549 = var3.method8448();
                }
                if (field605 >= 2 && field605 <= 6) {
                    if (field605 == 2) {
                        field714 = 64;
                        field747 = 64;
                    }
                    if (field605 == 3) {
                        field714 = 0;
                        field747 = 64;
                    }
                    if (field605 == 4) {
                        field714 = 128;
                        field747 = 64;
                    }
                    if (field605 == 5) {
                        field714 = 64;
                        field747 = 0;
                    }
                    if (field605 == 6) {
                        field714 = 64;
                        field747 = 128;
                    }
                    field605 = 2;
                    field551 = var3.method8448();
                    field694 = var3.method8448();
                    field558 = var3.method8300();
                }
                if (field605 == 10) {
                    field568 = var3.method8448();
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3250 == arg0.field1426) {
                Statics.method4724();
                byte var169 = var3.method8301();
                class147 var170 = new class147(var3);
                class155 var171;
                if (var169 >= 0) {
                    var171 = field771[var169];
                } else {
                    var171 = Statics.field1391;
                }
                if (var171 == null) {
                    this.method1211(var169);
                    arg0.field1426 = null;
                    return true;
                }
                if (var170.field1683 > var171.field1746) {
                    this.method1211(var169);
                    arg0.field1426 = null;
                    return true;
                }
                if (var170.field1683 < var171.field1746) {
                    arg0.field1426 = null;
                    return true;
                }
                var170.method2964(var171);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3345 == arg0.field1426) {
                Statics.method1721(class296.field3214);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3269 == arg0.field1426) {
                int var172 = var3.method8305();
                int var173 = var3.method8306();
                int var174 = var3.method8303();
                class332 var175 = class332.method2255(var173);
                if (var175.field3656 != var174 || var175.field3657 != var172 || var175.field3652 != 0 || var175.field3653 != 0) {
                    var175.field3656 = var174;
                    var175.field3657 = var172;
                    var175.field3652 = 0;
                    var175.field3653 = 0;
                    method3930(var175);
                    this.method1208(var175);
                    if (var175.field3649 == 0) {
                        method2001(Statics.field3229[var173 >> 16], var175, false);
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3344 == arg0.field1426) {
                int var176 = var3.method8357();
                int var177 = var3.method8356();
                class332 var178 = class332.method2255(var177);
                class332.method704(var178, var176);
                method3930(var178);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3310 == arg0.field1426) {
                int var179 = var3.method8448();
                int var180 = var3.method8430();
                class332 var181 = class332.method2255(var180);
                if (var181.field3691 != 6 || var181.field3692 != var179) {
                    var181.field3691 = 6;
                    var181.field3692 = var179;
                    method3930(var181);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3236 == arg0.field1426) {
                byte var182 = var3.method8320();
                int var183 = var3.method8498() * 4;
                byte var184 = var3.method8320();
                int var185 = var3.method8343();
                int var186 = var3.method8434();
                int var187 = var3.method8342();
                int var188 = var3.method8333() * 4;
                int var189 = var3.method8344();
                int var190 = var3.method8468();
                int var191 = var190 >> 16;
                int var192 = var190 >> 8 & 0xFF;
                int var193 = (var190 >> 4 & 0x7) + var191;
                int var194 = (var190 & 0x7) + var192;
                int var195 = var3.method8300();
                int var196 = var3.method8335();
                int var197 = var182 + var193;
                int var198 = var184 + var194;
                if (var193 >= 0 && var194 >= 0 && var193 < 104 && var194 < 104 && var197 >= 0 && var198 >= 0 && var197 < 104 && var198 < 104 && var185 != 65535) {
                    int var199 = var193 * 128 + 64;
                    int var200 = var194 * 128 + 64;
                    int var201 = var197 * 128 + 64;
                    int var202 = var198 * 128 + 64;
                    class77 var203 = new class77(var185, Statics.field1321, var199, var200, method284(var199, var200, Statics.field1321) - var188, field833 + var189, field833 + var187, var196, var195, var186, var183);
                    var203.method2053(var201, var202, method284(var201, var202, Statics.field1321) - var183, field833 + var189);
                    field654.method6405(var203);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3319 == arg0.field1426) {
                Statics.field1655 = new class455(Statics.field4511);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3290 == arg0.field1426) {
                Statics.field856 = var3.method8498();
                Statics.field1500 = var3.method8335();
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3352 == arg0.field1426) {
                for (int var204 = 0; var204 < field700.length; var204++) {
                    if (field700[var204] != null) {
                        field700[var204].field1243 = -1;
                    }
                }
                for (int var205 = 0; var205 < field587.length; var205++) {
                    if (field587[var205] != null) {
                        field587[var205].field1243 = -1;
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3278 == arg0.field1426) {
                method4393(false, var3);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3271 == arg0.field1426) {
                class37.method3455(var3, arg0.field1432);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3246 == arg0.field1426) {
                method4393(true, var3);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3272 == arg0.field1426) {
                int var206 = var3.method8333();
                int var207 = var3.method8333();
                int var208 = var3.method8430();
                class332 var209 = class332.method2255(var208);
                class332.method2151(var209, var207, var206);
                method3930(var209);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3288 == arg0.field1426) {
                int var210 = var3.method8448();
                int var211 = var3.method8342();
                class306.method2092(var211, var210);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3337 == arg0.field1426) {
                boolean var212 = var3.method8309();
                if (!var212) {
                    Statics.field4442 = null;
                } else if (Statics.field4442 == null) {
                    Statics.field4442 = new class370();
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3308 == arg0.field1426) {
                field788 = true;
                field795 = false;
                field790 = true;
                int var213 = method50(var3.method8303() & 0x7EB);
                int var214 = method2750(var3.method8303() & 0x7EB);
                int var215 = var3.method8448();
                int var216 = var3.method8300();
                field609 = new class479(Statics.field1546, var214, var215, var216);
                field583 = new class479(Statics.field1485, var213, var215, var216);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3270 == arg0.field1426) {
                return this.method1202(arg0);
            }
            if (class298.field3249 == arg0.field1426) {
                Statics.method1721(class296.field3210);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3259 == arg0.field1426) {
                int var217 = var3.method8356();
                int var218 = var3.method8448();
                if (var218 == 65535) {
                    var218 = -1;
                }
                int var219 = var3.method8357();
                int var220 = var3.method8344();
                if (var220 == 65535) {
                    var220 = -1;
                }
                for (int var221 = var220; var221 <= var218; var221++) {
                    long var222 = ((long) var219 << 32) + (long) var221;
                    class473 var224 = field746.method8025(var222);
                    if (var224 != null) {
                        var224.method7700();
                    }
                    field746.method8035(new class472(var217), var222);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3275 == arg0.field1426) {
                int var225 = var3.method8343();
                int var226 = var3.method8344();
                if (var226 == 65535) {
                    var226 = -1;
                }
                int var227 = var3.method8344();
                int var228 = var3.method8342();
                int var229 = var3.method8342();
                int var230 = var3.method8343();
                if (var230 == 65535) {
                    var230 = -1;
                }
                ArrayList var231 = new ArrayList();
                var231.add(var230);
                var231.add(var226);
                method3056(var231, var228, var225, var227, var229);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3280 == arg0.field1426) {
                method2718();
                int var232 = var3.method8335();
                int var233 = var3.method8333();
                int var234 = var3.method8430();
                field824[var233] = var234;
                field671[var233] = var232;
                field821[var233] = 1;
                for (int var235 = 0; var235 < 98; var235++) {
                    if (var234 >= class342.field3852[var235]) {
                        field821[var233] = var235 + 2;
                    }
                }
                field651[++field729 - 1 & 0x1F] = var233;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3342 == arg0.field1426) {
                int var236 = var3.method8448();
                int var237 = var3.method8300();
                int var238 = var3.method8448();
                method381(var236, var237, var238);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3296 == arg0.field1426) {
                int var239 = var3.method8300();
                int var240 = var3.method8357();
                class332 var241 = class332.method2255(var240);
                class332.method2918(var241, Statics.field2132.field1129.field3573, var239);
                method3930(var241);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3265 == arg0.field1426) {
                int var242 = var3.method8357();
                int var243 = var3.method8448();
                class332 var244 = class332.method2255(var242);
                if (var244.field3691 != 2 || var244.field3692 != var243) {
                    var244.field3691 = 2;
                    var244.field3692 = var243;
                    method3930(var244);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3235 == arg0.field1426) {
                int var245 = var3.method8300();
                method2091(var245);
                arg0.field1426 = null;
                return false;
            }
            if (class298.field3251 == arg0.field1426) {
                method2718();
                field644 = var3.method8448();
                field579 = field529;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3347 == arg0.field1426) {
                int var246 = var3.method8357();
                boolean var247 = var3.method8300() == 1;
                class332 var248 = class332.method2255(var246);
                Statics.method3063(var248, Statics.field2132.field1129, var247);
                method3930(var248);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3276 == arg0.field1426) {
                byte var249 = var3.method8337();
                int var250 = var3.method8343();
                class322.field3542[var250] = var249;
                if (class322.field3540[var250] != var249) {
                    class322.field3540[var250] = var249;
                }
                method5042(var250);
                field724[++field725 - 1 & 0x1F] = var250;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3257 == arg0.field1426) {
                String var251 = var3.method8311();
                long var252 = (long) var3.method8448();
                long var254 = (long) var3.method8466();
                class354 var256 = (class354) class373.method371(class354.method5300(), var3.method8300());
                long var257 = (var252 << 32) + var254;
                boolean var259 = false;
                for (int var260 = 0; var260 < 100; var260++) {
                    if (field673[var260] == var257) {
                        var259 = true;
                        break;
                    }
                }
                if (Statics.field3367.method1776(new class538(var251, Statics.field4388))) {
                    var259 = true;
                }
                if (!var259 && field652 == 0) {
                    field673[field535] = var257;
                    field535 = (field535 + 1) % 100;
                    String var261 = class398.method6856(class387.method1745(class335.method6035(var3)));
                    byte var262;
                    if (var256.field4249) {
                        var262 = 7;
                    } else {
                        var262 = 3;
                    }
                    if (var256.field4248 == -1) {
                        class111.method683(var262, var251, var261);
                    } else {
                        class111.method683(var262, Statics.method4049(var256.field4248) + var251, var261);
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3281 == arg0.field1426) {
                if (Statics.field1655 == null) {
                    Statics.field1655 = new class455(Statics.field4511);
                }
                class524 var263 = Statics.field4511.method7619(var3);
                Statics.field1655.field4769.method8042(var263.field5179, var263.field5178);
                field794[++field658 - 1 & 0x1F] = var263.field5179;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3295 == arg0.field1426) {
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3260 == arg0.field1426) {
                short var264 = (short) var3.method8305();
                int var265 = var3.method8300();
                int var266 = var3.method8448();
                int var267 = var3.method8356();
                class101 var268 = field587[var266];
                if (var268 != null) {
                    var268.method2511(var265, var267, var264);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3273 == arg0.field1426) {
                int var269 = var3.method8306();
                if (field627 != var269) {
                    field627 = var269;
                    method4728();
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3305 == arg0.field1426) {
                for (int var270 = 0; var270 < Statics.field1934; var270++) {
                    class187 var271 = class187.method1165(var270);
                    if (var271 != null) {
                        class322.field3542[var270] = 0;
                        class322.field3540[var270] = 0;
                    }
                }
                method2718();
                field725 += 32;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3324 == arg0.field1426) {
                String var272 = var3.method8311();
                Object[] var273 = new Object[var272.length() + 1];
                for (int var274 = var272.length() - 1; var274 >= 0; var274--) {
                    if (var272.charAt(var274) == 's') {
                        var273[var274 + 1] = var3.method8311();
                    } else {
                        var273[var274 + 1] = Integer.valueOf(var3.method8306());
                    }
                }
                var273[0] = Integer.valueOf(var3.method8306());
                class88 var275 = new class88();
                var275.field1087 = var273;
                class71.method5065(var275);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3312 == arg0.field1426) {
                String var276 = var3.method8311();
                String var277 = class398.method6856(class387.method1745(class335.method6035(var3)));
                class111.method683(6, var276, var277);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3233 == arg0.field1426) {
                Statics.field3367.field853.method7186(var3, arg0.field1432);
                method7388();
                field733 = field529;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3256 == arg0.field1426) {
                int var278 = var3.method8436();
                boolean var279 = var3.method8300() == 1;
                String var280 = "";
                boolean var281 = false;
                if (var279) {
                    var280 = var3.method8311();
                    if (Statics.field3367.method1776(new class538(var280, Statics.field4388))) {
                        var281 = true;
                    }
                }
                String var282 = var3.method8311();
                if (!var281) {
                    class111.method683(var278, var280, var282);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3315 == arg0.field1426) {
                boolean var283 = var3.method8300() == 1;
                if (var283) {
                    Statics.field1606 = class302.method655() - var3.method8307();
                    Statics.field4452 = new class361(var3, true);
                } else {
                    Statics.field4452 = null;
                }
                field598 = field529;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3293 == arg0.field1426) {
                int var284 = var3.method8343();
                class101 var285 = field587[var284];
                int var286 = var3.method8333();
                int var287 = var3.method8343();
                int var288 = var3.method8356();
                if (var285 != null) {
                    var285.method2275(var286, var287, var288 >> 16, var288 & 0xFFFF);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3297 == arg0.field1426) {
                int var289 = var3.method8342();
                if (var289 == 65535) {
                    var289 = -1;
                }
                int var290 = var3.method8306();
                int var291 = var3.method8357();
                class332 var292 = class332.method2255(var290);
                if (var292.field3731) {
                    var292.field3780 = var289;
                    var292.field3781 = var291;
                    class207 var294 = class207.method3280(var289).method3659(var291);
                    var292.field3699 = var294.field2223;
                    var292.field3718 = var294.field2242;
                    var292.field3766 = var294.field2227;
                    var292.field3697 = var294.field2224;
                    var292.field3773 = var294.field2245;
                    var292.field3702 = var294.field2250;
                    if (var294.field2246 == 1) {
                        var292.field3708 = 1;
                    } else {
                        var292.field3708 = 2;
                    }
                    if (var292.field3703 > 0) {
                        var292.field3702 = var292.field3702 * 32 / var292.field3703;
                    } else if (var292.field3658 > 0) {
                        var292.field3702 = var292.field3702 * 32 / var292.field3658;
                    }
                    method3930(var292);
                } else if (var289 == -1) {
                    var292.field3691 = 0;
                    arg0.field1426 = null;
                    return true;
                } else {
                    class207 var293 = class207.method3280(var289).method3659(var291);
                    var292.field3691 = 4;
                    var292.field3692 = var289;
                    var292.field3699 = var293.field2223;
                    var292.field3718 = var293.field2242;
                    var292.field3702 = var293.field2250 * 100 / var291;
                    method3930(var292);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3268 == arg0.field1426) {
                int var295 = var3.method8344();
                int var296 = var3.method8333();
                int var297 = var3.method8342();
                if (var295 == 65535) {
                    var295 = -1;
                }
                class101 var298 = field587[var297];
                if (var298 != null) {
                    if (var298.field1243 == var295 && var295 != -1) {
                        int var299 = class209.method3394(var295).field2328;
                        if (var299 == 1) {
                            var298.field1244 = 0;
                            var298.field1245 = 0;
                            var298.field1260 = var296;
                            var298.field1225 = 0;
                        } else if (var299 == 2) {
                            var298.field1225 = 0;
                        }
                    } else if (var295 == -1 || var298.field1243 == -1 || class209.method3394(var295).field2321 >= class209.method3394(var298.field1243).field2321) {
                        var298.field1243 = var295;
                        var298.field1244 = 0;
                        var298.field1245 = 0;
                        var298.field1260 = var296;
                        var298.field1225 = 0;
                        var298.field1262 = var298.field1246;
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3247 == arg0.field1426) {
                String var300 = var3.method8311();
                long var301 = var3.method8307();
                long var303 = (long) var3.method8448();
                long var305 = (long) var3.method8466();
                class354 var307 = (class354) class373.method371(class354.method5300(), var3.method8300());
                long var308 = (var303 << 32) + var305;
                boolean var310 = false;
                for (int var311 = 0; var311 < 100; var311++) {
                    if (field673[var311] == var308) {
                        var310 = true;
                        break;
                    }
                }
                if (var307.field4233 && Statics.field3367.method1776(new class538(var300, Statics.field4388))) {
                    var310 = true;
                }
                if (!var310 && field652 == 0) {
                    field673[field535] = var308;
                    field535 = (field535 + 1) % 100;
                    String var312 = class398.method6856(class387.method1745(class335.method6035(var3)));
                    if (var307.field4248 == -1) {
                        class111.method7089(9, var300, var312, class389.method3801(var301));
                    } else {
                        class111.method7089(9, Statics.method4049(var307.field4248) + var300, var312, class389.method3801(var301));
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3302 == arg0.field1426) {
                int var313 = var3.method8300();
                method5236(var313);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3263 == arg0.field1426) {
                int var314 = var3.method8300();
                int var315 = var3.method8300();
                int var316 = var3.method8300();
                int var317 = var3.method8300();
                field796[var314] = true;
                field589[var314] = var315;
                field749[var314] = var316;
                field659[var314] = var317;
                field745[var314] = 0;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3286 == arg0.field1426) {
                int var318 = var3.method8306();
                int var319 = var3.method8448();
                if (var318 < -70000) {
                    var319 += 32768;
                }
                class332 var320;
                if (var318 >= 0) {
                    var320 = class332.method2255(var318);
                } else {
                    var320 = null;
                }
                while (var3.field5111 < arg0.field1432) {
                    int var321 = var3.method8436();
                    int var322 = var3.method8448();
                    int var323 = 0;
                    if (var322 != 0) {
                        var323 = var3.method8300();
                        if (var323 == 255) {
                            var323 = var3.method8306();
                        }
                    }
                    if (var320 != null && var321 >= 0 && var321 < var320.field3778.length) {
                        var320.field3778[var321] = var322;
                        var320.field3779[var321] = var323;
                    }
                    class85.method7223(var319, var321, var322 - 1, var323);
                }
                if (var320 != null) {
                    method3930(var320);
                }
                method2718();
                field726[++field727 - 1 & 0x1F] = var319 & 0x7FFF;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3242 == arg0.field1426) {
                field788 = true;
                field795 = false;
                field790 = true;
                int var324 = var3.method8303();
                int var325 = var3.method8303();
                int var326 = method2750(Statics.field1546 + var325 & 0x7EB);
                int var327 = Statics.field1485 + var324;
                int var328 = var3.method8448();
                int var329 = var3.method8300();
                field609 = new class479(Statics.field1546, var326, var328, var329);
                field583 = new class479(Statics.field1485, var327, var328, var329);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3348 == arg0.field1426) {
                int var330 = var3.method8333();
                int var331 = var3.method8356();
                int var332 = var3.method8448();
                int var333 = var3.method8342();
                class92 var334;
                if (field655 == var333) {
                    var334 = Statics.field2132;
                } else {
                    var334 = field700[var333];
                }
                if (var334 != null) {
                    var334.method2275(var330, var332, var331 >> 16, var331 & 0xFFFF);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3320 == arg0.field1426) {
                for (int var335 = 0; var335 < class322.field3540.length; var335++) {
                    if (class322.field3542[var335] != class322.field3540[var335]) {
                        class322.field3540[var335] = class322.field3542[var335];
                        method5042(var335);
                        field724[++field725 - 1 & 0x1F] = var335;
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3252 == arg0.field1426) {
                method1985(var3.method8311());
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3332 == arg0.field1426) {
                int var336 = var3.method8357();
                int var337 = var3.method8346();
                class332 var338 = class332.method2255(var336);
                if (var338.field3695 != var337 || var337 == -1) {
                    var338.field3695 = var337;
                    var338.field3782 = 0;
                    var338.field3783 = 0;
                    method3930(var338);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3301 == arg0.field1426) {
                Statics.field856 = var3.method8300();
                Statics.field1500 = var3.method8335();
                while (var3.field5111 < arg0.field1432) {
                    int var339 = var3.method8300();
                    class296 var340 = class296.method5003()[var339];
                    Statics.method1721(var340);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3287 == arg0.field1426) {
                int var341 = var3.method8343();
                int var342 = var3.method8344();
                int var343 = var3.method8344();
                int var344 = var3.method8342();
                class306.method2684(var341, var342, var344, var343);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3303 == arg0.field1426) {
                field788 = true;
                field795 = false;
                field789 = true;
                Statics.field1375 = var3.method8300();
                Statics.field181 = var3.method8300();
                int var345 = var3.method8448();
                int var346 = var3.method8300() * 128 + 64;
                int var347 = var3.method8300() * 128 + 64;
                int var348 = var3.method8448();
                field791 = var3.method8309();
                int var349 = var3.method8300();
                int var350 = Statics.field1375 * 128 + 64;
                int var351 = Statics.field181 * 128 + 64;
                boolean var352 = false;
                boolean var353 = false;
                int var354;
                int var355;
                if (field791) {
                    var354 = Statics.field1609;
                    var355 = method284(var350, var351, Statics.field1321) - var345;
                } else {
                    var354 = method284(Statics.field2069, Statics.field1656, Statics.field1321) - Statics.field1609;
                    var355 = var345;
                }
                field792 = new class477(Statics.field2069, Statics.field1656, var354, var350, var351, var355, var346, var347, var348, var349);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3243 == arg0.field1426) {
                Statics.field3367.method1800(var3, arg0.field1432);
                field733 = field529;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3309 == arg0.field1426) {
                field788 = true;
                field795 = false;
                field789 = false;
                Statics.field1375 = var3.method8300();
                Statics.field181 = var3.method8300();
                Statics.field1938 = var3.method8448();
                Statics.field3875 = var3.method8300();
                Statics.field253 = var3.method8300();
                if (Statics.field253 >= 100) {
                    Statics.field2069 = Statics.field1375 * 128 + 64;
                    Statics.field1656 = Statics.field181 * 128 + 64;
                    Statics.field1609 = method284(Statics.field2069, Statics.field1656, Statics.field1321) - Statics.field1938;
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3325 == arg0.field1426) {
                int var356 = var3.method8357();
                int var357 = var3.method8343();
                int var358 = var357 >> 10 & 0x1F;
                int var359 = var357 >> 5 & 0x1F;
                int var360 = var357 & 0x1F;
                int var361 = (var360 << 3) + (var358 << 19) + (var359 << 11);
                class332 var362 = class332.method2255(var356);
                if (var362.field3672 != var361) {
                    var362.field3672 = var361;
                    method3930(var362);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3289 == arg0.field1426) {
                String var363 = var3.method8311();
                int var364 = var3.method8430();
                class332 var365 = class332.method2255(var364);
                if (!var363.equals(var365.field3710)) {
                    var365.field3710 = var363;
                    method3930(var365);
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3338 == arg0.field1426) {
                int var366 = var3.method8306();
                int var367 = var3.method8448();
                if (var366 < -70000) {
                    var367 += 32768;
                }
                class332 var368;
                if (var366 >= 0) {
                    var368 = class332.method2255(var366);
                } else {
                    var368 = null;
                }
                if (var368 != null) {
                    for (int var369 = 0; var369 < var368.field3778.length; var369++) {
                        var368.field3778[var369] = 0;
                        var368.field3779[var369] = 0;
                    }
                }
                class85.method869(var367);
                int var370 = var3.method8448();
                for (int var371 = 0; var371 < var370; var371++) {
                    int var372 = var3.method8448();
                    int var373 = var3.method8335();
                    if (var373 == 255) {
                        var373 = var3.method8430();
                    }
                    if (var368 != null && var371 < var368.field3778.length) {
                        var368.field3778[var371] = var372;
                        var368.field3779[var371] = var373;
                    }
                    class85.method7223(var367, var371, var372 - 1, var373);
                }
                if (var368 != null) {
                    method3930(var368);
                }
                method2718();
                field726[++field727 - 1 & 0x1F] = var367 & 0x7FFF;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3258 == arg0.field1426) {
                int var374 = var3.method8342();
                int var375 = var3.method8430();
                class322.field3542[var374] = var375;
                if (class322.field3540[var374] != var375) {
                    class322.field3540[var374] = var375;
                }
                method5042(var374);
                field724[++field725 - 1 & 0x1F] = var374;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3262 == arg0.field1426) {
                Statics.method1721(class296.field3211);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3350 == arg0.field1426) {
                Statics.method1721(class296.field3217);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3322 == arg0.field1426) {
                Statics.method1721(class296.field3216);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3331 == arg0.field1426) {
                int var376 = var3.method8300();
                if (var3.method8300() == 0) {
                    field806[var376] = new class368();
                    var3.field5111 += 18;
                } else {
                    var3.field5111--;
                    field806[var376] = new class368(var3, false);
                }
                field737 = field529;
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3248 == arg0.field1426 && field788) {
                field795 = true;
                field790 = false;
                field789 = false;
                for (int var377 = 0; var377 < 5; var377++) {
                    field796[var377] = false;
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3244 == arg0.field1426) {
                Statics.field856 = var3.method8498();
                Statics.field1500 = var3.method8335();
                for (int var378 = Statics.field856; var378 < Statics.field856 + 8; var378++) {
                    for (int var379 = Statics.field1500; var379 < Statics.field1500 + 8; var379++) {
                        if (field667[Statics.field1321][var378][var379] != null) {
                            field667[Statics.field1321][var378][var379] = null;
                            method2920(var378, var379);
                        }
                    }
                }
                for (class95 var380 = (class95) field668.method6393(); var380 != null; var380 = (class95) field668.method6395()) {
                    if (var380.field1189 >= Statics.field856 && var380.field1189 < Statics.field856 + 8 && var380.field1195 >= Statics.field1500 && var380.field1195 < Statics.field1500 + 8 && Statics.field1321 == var380.field1196) {
                        var380.field1194 = 0;
                    }
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3267 == arg0.field1426) {
                return this.method1534(arg0, 2);
            }
            if (class298.field3336 == arg0.field1426) {
                field778 = var3.method8300();
                if (field778 == 255) {
                    field778 = 0;
                }
                field701 = var3.method8300();
                if (field701 == 255) {
                    field701 = 0;
                }
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3261 == arg0.field1426) {
                field736 = field529;
                byte var381 = var3.method8301();
                class161 var382 = new class161(var3);
                class164 var383;
                if (var381 >= 0) {
                    var383 = field772[var381];
                } else {
                    var383 = Statics.field2085;
                }
                if (var383 == null) {
                    this.method1457(var381);
                    arg0.field1426 = null;
                    return true;
                }
                if (var382.field1782 > var383.field1809) {
                    this.method1457(var381);
                    arg0.field1426 = null;
                    return true;
                }
                if (var382.field1782 < var383.field1809) {
                    arg0.field1426 = null;
                    return true;
                }
                var382.method3060(var383);
                arg0.field1426 = null;
                return true;
            }
            if (class298.field3355 == arg0.field1426) {
                Statics.method1721(class296.field3212);
                arg0.field1426 = null;
                return true;
            }
            Statics.method2661("" + (arg0.field1426 == null ? -1 : arg0.field1426.field3356) + class102.field1339 + (arg0.field1437 == null ? -1 : arg0.field1437.field3356) + class102.field1339 + (arg0.field1438 == null ? -1 : arg0.field1438.field3356) + class102.field1339 + arg0.field1432, (Throwable) null);
            method7440();
        } catch (IOException var388) {
            method4383();
        } catch (Exception var389) {
            String var386 = "" + (arg0.field1426 == null ? -1 : arg0.field1426.field3356) + class102.field1339 + (arg0.field1437 == null ? -1 : arg0.field1437.field3356) + class102.field1339 + (arg0.field1438 == null ? -1 : arg0.field1438.field3356) + class102.field1339 + arg0.field1432 + class102.field1339 + (Statics.field1448 + Statics.field2132.field1273[0]) + class102.field1339 + (Statics.field354 + Statics.field2132.field1270[0]) + class102.field1339;
            for (int var387 = 0; var387 < arg0.field1432 && var387 < 50; var387++) {
                var386 = var386 + var3.field5108[var387] + class102.field1339;
            }
            Statics.method2661(var386, var389);
            method7440();
        }
        return true;
    }

    @ObfuscatedName("dp.ka(IIIIIIIIIIS)V")
    public static final void method2370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class95 var10 = null;
        for (class95 var11 = (class95) field668.method6393(); var11 != null; var11 = (class95) field668.method6395()) {
            if (var11.field1196 == arg0 && var11.field1189 == arg1 && var11.field1195 == arg2 && var11.field1182 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class95();
            var10.field1196 = arg0;
            var10.field1182 = arg3;
            var10.field1189 = arg1;
            var10.field1195 = arg2;
            var10.field1191 = -1;
            method2683(var10);
            field668.method6405(var10);
        }
        var10.field1188 = arg4;
        var10.field1184 = arg5;
        var10.field1190 = arg6;
        var10.field1193 = arg8;
        var10.field1194 = arg9;
        var10.method2260(arg7);
    }

    @ObfuscatedName("re.kf(IIIIII)Z")
    public static final boolean method7641(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class95 var5 = null;
        for (class95 var6 = (class95) field668.method6393(); var6 != null; var6 = (class95) field668.method6395()) {
            if (var6.field1196 == arg0 && var6.field1189 == arg1 && var6.field1195 == arg2 && var6.field1182 == arg3) {
                var5 = var6;
                break;
            }
        }
        if (var5 == null) {
            return false;
        } else {
            var5.field1191 = arg4;
            return true;
        }
    }

    @ObfuscatedName("gb.kx(B)V")
    public static final void method3100() {
        for (class95 var0 = (class95) field668.method6393(); var0 != null; var0 = (class95) field668.method6395()) {
            if (var0.field1194 == -1) {
                var0.field1193 = 0;
                method2683(var0);
            } else {
                var0.method7700();
            }
        }
    }

    @ObfuscatedName("er.ky(Ldv;I)V")
    public static final void method2683(class95 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1182 == 0) {
            var1 = Statics.field1570.method4255(arg0.field1196, arg0.field1189, arg0.field1195);
        }
        if (arg0.field1182 == 1) {
            var1 = Statics.field1570.method4302(arg0.field1196, arg0.field1189, arg0.field1195);
        }
        if (arg0.field1182 == 2) {
            var1 = Statics.field1570.method4229(arg0.field1196, arg0.field1189, arg0.field1195);
        }
        if (arg0.field1182 == 3) {
            var1 = Statics.field1570.method4344(arg0.field1196, arg0.field1189, arg0.field1195);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1570.method4231(arg0.field1196, arg0.field1189, arg0.field1195, var1);
            var3 = class241.method3275(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1185 = var3;
        arg0.field1187 = var4;
        arg0.field1186 = var5;
    }

    @ObfuscatedName("qu.kp(B)V")
    public static final void method7347() {
        for (class95 var0 = (class95) field668.method6393(); var0 != null; var0 = (class95) field668.method6395()) {
            if (var0.field1194 > 0) {
                var0.field1194--;
            }
            if (var0.field1194 == 0) {
                if (var0.field1185 >= 0) {
                    int var1 = var0.field1185;
                    int var2 = var0.field1187;
                    class206 var3 = class206.method3321(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method3605(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method7974(var0.field1196, var0.field1182, var0.field1189, var0.field1195, var0.field1185, var0.field1186, var0.field1187, var0.field1191);
                var0.method7700();
            } else {
                if (var0.field1193 > 0) {
                    var0.field1193--;
                }
                if (var0.field1193 == 0 && var0.field1189 >= 1 && var0.field1195 >= 1 && var0.field1189 <= 102 && var0.field1195 <= 102) {
                    if (var0.field1188 >= 0) {
                        int var5 = var0.field1188;
                        int var6 = var0.field1184;
                        class206 var7 = class206.method3321(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method3605(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method7974(var0.field1196, var0.field1182, var0.field1189, var0.field1195, var0.field1188, var0.field1190, var0.field1184, var0.field1191);
                    var0.field1193 = -1;
                    if (var0.field1188 == var0.field1185 && var0.field1185 == -1) {
                        var0.method7700();
                    } else if (var0.field1188 == var0.field1185 && var0.field1190 == var0.field1186 && var0.field1187 == var0.field1184) {
                        var0.method7700();
                    }
                }
            }
        }
    }

    @ObfuscatedName("si.kr(IIIIIIIII)V")
    public static final void method7974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field531 && Statics.field1321 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field1570.method4255(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field1570.method4302(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field1570.method4229(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field1570.method4344(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field1570.method4231(arg0, arg2, arg3, var8);
            int var14 = class241.method3275(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1570.method4315(arg0, arg2, arg3);
                class206 var17 = class206.method3321(var14);
                if (var17.field2188 != 0) {
                    field602[arg0].method3838(arg2, arg3, var15, var16, var17.field2189);
                }
            }
            if (arg1 == 1) {
                Statics.field1570.method4219(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1570.method4317(arg0, arg2, arg3);
                class206 var18 = class206.method3321(var14);
                if (var18.field2186 + arg2 > 103 || var18.field2186 + arg3 > 103 || var18.field2171 + arg2 > 103 || var18.field2171 + arg3 > 103) {
                    return;
                }
                if (var18.field2188 != 0) {
                    field602[arg0].method3861(arg2, arg3, var18.field2186, var18.field2171, var16, var18.field2189);
                }
            }
            if (arg1 == 3) {
                Statics.field1570.method4221(arg0, arg2, arg3);
                class206 var19 = class206.method3321(var14);
                if (var19.field2188 == 1) {
                    field602[arg0].method3840(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var20 = arg0;
        if (arg0 < 3 && (class82.field1050[1][arg2][arg3] & 0x2) == 2) {
            var20 = arg0 + 1;
        }
        class231 var21 = Statics.field1570;
        class214 var22 = field602[arg0];
        class206 var23 = class206.method3321(arg4);
        int var24 = arg7 >= 0 ? arg7 : var23.field2198;
        int var25;
        int var26;
        if (arg5 == 1 || arg5 == 3) {
            var25 = var23.field2171;
            var26 = var23.field2186;
        } else {
            var25 = var23.field2186;
            var26 = var23.field2171;
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
        int[][] var31 = class82.field1048[var20];
        int var32 = var31[var27][var29] + var31[var28][var29] + var31[var27][var30] + var31[var28][var30] >> 2;
        int var33 = (arg2 << 7) + (var25 << 6);
        int var34 = (arg3 << 7) + (var26 << 6);
        long var35 = class241.method7981(arg2, arg3, 2, var23.field2195 == 0, arg4);
        int var37 = (arg5 << 6) + arg6;
        if (var23.field2211 == 1) {
            var37 += 256;
        }
        if (arg6 == 22) {
            class233 var38;
            if (var24 == -1 && var23.field2212 == null) {
                var38 = var23.method3609(22, arg5, var31, var33, var32, var34);
            } else {
                var38 = new class80(arg4, 22, arg5, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4207(arg0, arg2, arg3, var32, var38, var35, var37);
            if (var23.field2188 == 1) {
                var22.method3836(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class233 var64;
            if (var24 == -1 && var23.field2212 == null) {
                var64 = var23.method3609(10, arg5, var31, var33, var32, var34);
            } else {
                var64 = new class80(arg4, 10, arg5, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            if (var64 != null) {
                var21.method4211(arg0, arg2, arg3, var32, var25, var26, var64, arg6 == 11 ? 256 : 0, var35, var37);
            }
            if (var23.field2188 != 0) {
                var22.method3834(arg2, arg3, var25, var26, var23.field2189);
            }
        } else if (arg6 >= 12) {
            class233 var39;
            if (var24 == -1 && var23.field2212 == null) {
                var39 = var23.method3609(arg6, arg5, var31, var33, var32, var34);
            } else {
                var39 = new class80(arg4, arg6, arg5, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4211(arg0, arg2, arg3, var32, 1, 1, var39, 0, var35, var37);
            if (var23.field2188 != 0) {
                var22.method3834(arg2, arg3, var25, var26, var23.field2189);
            }
        } else if (arg6 == 0) {
            class233 var40;
            if (var24 == -1 && var23.field2212 == null) {
                var40 = var23.method3609(0, arg5, var31, var33, var32, var34);
            } else {
                var40 = new class80(arg4, 0, arg5, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4243(arg0, arg2, arg3, var32, var40, (class233) null, class82.field1043[arg5], 0, var35, var37);
            if (var23.field2188 != 0) {
                var22.method3833(arg2, arg3, arg6, arg5, var23.field2189);
            }
        } else if (arg6 == 1) {
            class233 var41;
            if (var24 == -1 && var23.field2212 == null) {
                var41 = var23.method3609(1, arg5, var31, var33, var32, var34);
            } else {
                var41 = new class80(arg4, 1, arg5, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4243(arg0, arg2, arg3, var32, var41, (class233) null, class82.field1044[arg5], 0, var35, var37);
            if (var23.field2188 != 0) {
                var22.method3833(arg2, arg3, arg6, arg5, var23.field2189);
            }
        } else if (arg6 == 2) {
            int var42 = arg5 + 1 & 0x3;
            class233 var43;
            class233 var44;
            if (var24 == -1 && var23.field2212 == null) {
                var43 = var23.method3609(2, arg5 + 4, var31, var33, var32, var34);
                var44 = var23.method3609(2, var42, var31, var33, var32, var34);
            } else {
                var43 = new class80(arg4, 2, arg5 + 4, var20, arg2, arg3, var24, var23.field2203, (class233) null);
                var44 = new class80(arg4, 2, var42, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4243(arg0, arg2, arg3, var32, var43, var44, class82.field1043[arg5], class82.field1043[var42], var35, var37);
            if (var23.field2188 != 0) {
                var22.method3833(arg2, arg3, arg6, arg5, var23.field2189);
            }
        } else if (arg6 == 3) {
            class233 var45;
            if (var24 == -1 && var23.field2212 == null) {
                var45 = var23.method3609(3, arg5, var31, var33, var32, var34);
            } else {
                var45 = new class80(arg4, 3, arg5, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4243(arg0, arg2, arg3, var32, var45, (class233) null, class82.field1044[arg5], 0, var35, var37);
            if (var23.field2188 != 0) {
                var22.method3833(arg2, arg3, arg6, arg5, var23.field2189);
            }
        } else if (arg6 == 9) {
            class233 var46;
            if (var24 == -1 && var23.field2212 == null) {
                var46 = var23.method3609(arg6, arg5, var31, var33, var32, var34);
            } else {
                var46 = new class80(arg4, arg6, arg5, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4211(arg0, arg2, arg3, var32, 1, 1, var46, 0, var35, var37);
            if (var23.field2188 != 0) {
                var22.method3834(arg2, arg3, var25, var26, var23.field2189);
            }
        } else if (arg6 == 4) {
            class233 var47;
            if (var24 == -1 && var23.field2212 == null) {
                var47 = var23.method3609(4, arg5, var31, var33, var32, var34);
            } else {
                var47 = new class80(arg4, 4, arg5, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4310(arg0, arg2, arg3, var32, var47, (class233) null, class82.field1043[arg5], 0, 0, 0, var35, var37);
        } else if (arg6 == 5) {
            int var48 = 16;
            long var49 = var21.method4255(arg0, arg2, arg3);
            if (var49 != 0L) {
                var48 = class206.method3321(class241.method3275(var49)).field2192;
            }
            class233 var51;
            if (var24 == -1 && var23.field2212 == null) {
                var51 = var23.method3609(4, arg5, var31, var33, var32, var34);
            } else {
                var51 = new class80(arg4, 4, arg5, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4310(arg0, arg2, arg3, var32, var51, (class233) null, class82.field1043[arg5], 0, class82.field1045[arg5] * var48, class82.field1046[arg5] * var48, var35, var37);
        } else if (arg6 == 6) {
            int var52 = 8;
            long var53 = var21.method4255(arg0, arg2, arg3);
            if (var53 != 0L) {
                var52 = class206.method3321(class241.method3275(var53)).field2192 / 2;
            }
            class233 var55;
            if (var24 == -1 && var23.field2212 == null) {
                var55 = var23.method3609(4, arg5 + 4, var31, var33, var32, var34);
            } else {
                var55 = new class80(arg4, 4, arg5 + 4, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4310(arg0, arg2, arg3, var32, var55, (class233) null, 256, arg5, class82.field1052[arg5] * var52, class82.field1049[arg5] * var52, var35, var37);
        } else if (arg6 == 7) {
            int var56 = arg5 + 2 & 0x3;
            class233 var57;
            if (var24 == -1 && var23.field2212 == null) {
                var57 = var23.method3609(4, var56 + 4, var31, var33, var32, var34);
            } else {
                var57 = new class80(arg4, 4, var56 + 4, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4310(arg0, arg2, arg3, var32, var57, (class233) null, 256, var56, 0, 0, var35, var37);
        } else if (arg6 == 8) {
            int var58 = 8;
            long var59 = var21.method4255(arg0, arg2, arg3);
            if (var59 != 0L) {
                var58 = class206.method3321(class241.method3275(var59)).field2192 / 2;
            }
            int var61 = arg5 + 2 & 0x3;
            class233 var62;
            class233 var63;
            if (var24 == -1 && var23.field2212 == null) {
                var62 = var23.method3609(4, arg5 + 4, var31, var33, var32, var34);
                var63 = var23.method3609(4, var61 + 4, var31, var33, var32, var34);
            } else {
                var62 = new class80(arg4, 4, arg5 + 4, var20, arg2, arg3, var24, var23.field2203, (class233) null);
                var63 = new class80(arg4, 4, var61 + 4, var20, arg2, arg3, var24, var23.field2203, (class233) null);
            }
            var21.method4310(arg0, arg2, arg3, var32, var62, var63, 256, arg5, class82.field1052[arg5] * var58, class82.field1049[arg5] * var58, var35, var37);
        }
    }

    @ObfuscatedName("fd.kw(III)V")
    public static final void method2920(int arg0, int arg1) {
        class378 var2 = field667[Statics.field1321][arg0][arg1];
        if (var2 == null) {
            Statics.field1570.method4222(Statics.field1321, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class105 var5 = null;
        for (class105 var6 = (class105) var2.method6393(); var6 != null; var6 = (class105) var2.method6395()) {
            class207 var7 = class207.method3280(var6.field1363);
            long var8 = (long) var7.field2247;
            if (var7.field2246 == 1) {
                var8 *= var6.field1364 < Integer.MAX_VALUE ? (long) (var6.field1364 + 1) : (long) var6.field1364;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1570.method4222(Statics.field1321, arg0, arg1);
            return;
        }
        var2.method6407(var5);
        class105 var10 = null;
        class105 var11 = null;
        for (class105 var12 = (class105) var2.method6393(); var12 != null; var12 = (class105) var2.method6395()) {
            if (var5.field1363 != var12.field1363) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1363 != var12.field1363 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class241.method7981(arg0, arg1, 3, false, 0);
        Statics.field1570.method4208(Statics.field1321, arg0, arg1, method284(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1321), var5, var13, var10, var11);
    }

    @ObfuscatedName("jt.kv(ZLto;I)V")
    public static final void method4393(boolean arg0, class514 arg1) {
        field797 = 0;
        field641 = 0;
        arg1.method8250();
        int var2 = arg1.method8247(8);
        if (var2 < field588) {
            for (int var3 = var2; var3 < field588; var3++) {
                field553[++field797 - 1] = field526[var3];
            }
        }
        if (var2 > field588) {
            throw new RuntimeException("");
        }
        field588 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = field526[var4];
            class101 var6 = field587[var5];
            int var7 = arg1.method8247(1);
            if (var7 == 0) {
                field526[++field588 - 1] = var5;
                var6.field1263 = field833;
            } else {
                int var8 = arg1.method8247(2);
                if (var8 == 0) {
                    field526[++field588 - 1] = var5;
                    var6.field1263 = field833;
                    field738[++field641 - 1] = var5;
                } else if (var8 == 1) {
                    field526[++field588 - 1] = var5;
                    var6.field1263 = field833;
                    int var9 = arg1.method8247(3);
                    var6.method2468(var9, class218.field2411);
                    int var10 = arg1.method8247(1);
                    if (var10 == 1) {
                        field738[++field641 - 1] = var5;
                    }
                } else if (var8 == 2) {
                    field526[++field588 - 1] = var5;
                    var6.field1263 = field833;
                    if (arg1.method8247(1) == 1) {
                        int var11 = arg1.method8247(3);
                        var6.method2468(var11, class218.field2408);
                        int var12 = arg1.method8247(3);
                        var6.method2468(var12, class218.field2408);
                    } else {
                        int var13 = arg1.method8247(3);
                        var6.method2468(var13, class218.field2407);
                    }
                    int var14 = arg1.method8247(1);
                    if (var14 == 1) {
                        field738[++field641 - 1] = var5;
                    }
                } else if (var8 == 3) {
                    field553[++field797 - 1] = var5;
                }
            }
        }
        method6058(arg0, arg1);
        method2980(arg1);
        for (int var15 = 0; var15 < field797; var15++) {
            int var16 = field553[var15];
            if (field833 != field587[var16].field1263) {
                field587[var16].field1327 = null;
                field587[var16] = null;
            }
        }
        if (field592.field1432 != arg1.field5111) {
            throw new RuntimeException(arg1.field5111 + class102.field1339 + field592.field1432);
        }
        for (int var17 = 0; var17 < field588; var17++) {
            if (field587[field526[var17]] == null) {
                throw new RuntimeException(var17 + class102.field1339 + field588);
            }
        }
    }

    @ObfuscatedName("ne.ku(ZLto;B)V")
    public static final void method6058(boolean arg0, class514 arg1) {
        while (true) {
            byte var2 = 16;
            int var3 = 0x1 << var2;
            if (arg1.method8249(field592.field1432) >= var2 + 12) {
                int var4 = arg1.method8247(var2);
                if (var3 - 1 != var4) {
                    boolean var5 = false;
                    if (field587[var4] == null) {
                        field587[var4] = new class101();
                        var5 = true;
                    }
                    class101 var6 = field587[var4];
                    field526[++field588 - 1] = var4;
                    var6.field1263 = field833;
                    int var7;
                    if (arg0) {
                        var7 = arg1.method8247(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method8247(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    boolean var8 = arg1.method8247(1) == 1;
                    if (var8) {
                        arg1.method8247(32);
                    }
                    int var9 = arg1.method8247(1);
                    int var10 = field708[arg1.method8247(3)];
                    if (var5) {
                        var6.field1239 = var6.field1200 = var10;
                    }
                    var6.field1327 = class196.method2202(arg1.method8247(14));
                    int var11 = arg1.method8247(1);
                    if (var11 == 1) {
                        field738[++field641 - 1] = var4;
                    }
                    int var12;
                    if (arg0) {
                        var12 = arg1.method8247(8);
                        if (var12 > 127) {
                            var12 -= 256;
                        }
                    } else {
                        var12 = arg1.method8247(5);
                        if (var12 > 15) {
                            var12 -= 32;
                        }
                    }
                    method3942(var6);
                    if (var6.field1267 == 0) {
                        var6.field1200 = 0;
                    }
                    var6.method2469(Statics.field2132.field1273[0] + var7, Statics.field2132.field1270[0] + var12, var9 == 1);
                    continue;
                }
            }
            arg1.method8264();
            return;
        }
    }

    @ObfuscatedName("fm.kl(Lto;I)V")
    public static final void method2980(class514 arg0) {
        for (int var1 = 0; var1 < field641; var1++) {
            int var2 = field738[var1];
            class101 var3 = field587[var2];
            int var4 = arg0.method8300();
            if ((var4 & 0x8) != 0) {
                int var5 = arg0.method8300();
                var4 += var5 << 8;
            }
            if ((var4 & 0x800) != 0) {
                int var6 = arg0.method8300();
                var4 += var6 << 16;
            }
            if ((var4 & 0x80) != 0) {
                int var7 = arg0.method8498();
                if (var7 > 0) {
                    for (int var8 = 0; var8 < var7; var8++) {
                        int var9 = -1;
                        int var10 = -1;
                        int var11 = -1;
                        int var12 = arg0.method8436();
                        if (var12 == 32767) {
                            var12 = arg0.method8436();
                            var10 = arg0.method8436();
                            var9 = arg0.method8436();
                            var11 = arg0.method8436();
                        } else if (var12 == 32766) {
                            var12 = -1;
                        } else {
                            var10 = arg0.method8436();
                        }
                        int var13 = arg0.method8436();
                        var3.method2281(var12, var10, var9, var11, field833, var13);
                    }
                }
                int var14 = arg0.method8335();
                if (var14 > 0) {
                    for (int var15 = 0; var15 < var14; var15++) {
                        int var16 = arg0.method8436();
                        int var17 = arg0.method8436();
                        if (var17 == 32767) {
                            var3.method2282(var16);
                        } else {
                            int var18 = arg0.method8436();
                            int var19 = arg0.method8498();
                            int var20 = var17 > 0 ? arg0.method8498() : var19;
                            var3.method2273(var16, field833, var17, var18, var19, var20);
                        }
                    }
                }
            }
            if ((var4 & 0x200) != 0) {
                int var21 = arg0.method8300();
                if ((var21 & 0x1) == 1) {
                    var3.method2475();
                } else {
                    int[] var22 = null;
                    if ((var21 & 0x2) == 2) {
                        int var23 = arg0.method8333();
                        var22 = new int[var23];
                        for (int var24 = 0; var24 < var23; var24++) {
                            int var25 = arg0.method8344();
                            int var26 = var25 == 65535 ? -1 : var25;
                            var22[var24] = var26;
                        }
                    }
                    short[] var27 = null;
                    if ((var21 & 0x4) == 4) {
                        int var28 = 0;
                        if (var3.field1327.field2057 != null) {
                            var28 = var3.field1327.field2057.length;
                        }
                        var27 = new short[var28];
                        for (int var29 = 0; var29 < var28; var29++) {
                            var27[var29] = (short) arg0.method8343();
                        }
                    }
                    short[] var30 = null;
                    if ((var21 & 0x8) == 8) {
                        int var31 = 0;
                        if (var3.field1327.field2052 != null) {
                            var31 = var3.field1327.field2052.length;
                        }
                        var30 = new short[var31];
                        for (int var32 = 0; var32 < var31; var32++) {
                            var30[var32] = (short) arg0.method8343();
                        }
                    }
                    boolean var33 = false;
                    if ((var21 & 0x10) != 0) {
                        var33 = arg0.method8335() == 1;
                    }
                    long var34 = (long) (++class101.field1334 - 1);
                    var3.method2496(new class195(var34, var22, var27, var30, var33));
                }
            }
            if ((var4 & 0x20) != 0) {
                int var36 = arg0.method8343();
                int var37 = arg0.method8448();
                var3.field1238 = arg0.method8498() == 1;
                if (field709 >= 212) {
                    var3.field1236 = var36;
                    var3.field1237 = var37;
                } else {
                    int var38 = var3.field1228 - (var36 - Statics.field1448 - Statics.field1448) * 64;
                    int var39 = var3.field1199 - (var37 - Statics.field354 - Statics.field354) * 64;
                    if (var38 != 0 || var39 != 0) {
                        int var41 = (int) (Math.atan2((double) var38, (double) var39) * 325.94932345220167D) & 0x7FF;
                        var3.field1235 = var41;
                    }
                }
            }
            if ((var4 & 0x40) != 0) {
                int var42 = arg0.method8448();
                if (var42 == 65535) {
                    var42 = -1;
                }
                int var43 = arg0.method8335();
                if (var3.field1243 == var42 && var42 != -1) {
                    int var44 = class209.method3394(var42).field2328;
                    if (var44 == 1) {
                        var3.field1244 = 0;
                        var3.field1245 = 0;
                        var3.field1260 = var43;
                        var3.field1225 = 0;
                    }
                    if (var44 == 2) {
                        var3.field1225 = 0;
                    }
                } else if (var42 == -1 || var3.field1243 == -1 || class209.method3394(var42).field2321 >= class209.method3394(var3.field1243).field2321) {
                    var3.field1243 = var42;
                    var3.field1244 = 0;
                    var3.field1245 = 0;
                    var3.field1260 = var43;
                    var3.field1225 = 0;
                    var3.field1262 = var3.field1246;
                }
            }
            if ((var4 & 0x20000) != 0) {
                int var45 = arg0.method8498();
                for (int var46 = 0; var46 < var45; var46++) {
                    int var47 = arg0.method8335();
                    int var48 = arg0.method8344();
                    int var49 = arg0.method8430();
                    var3.method2275(var47, var48, var49 >> 16, var49 & 0xFFFF);
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field1327 = class196.method2202(arg0.method8448());
                method3942(var3);
                var3.method2474();
            }
            if ((var4 & 0x10) != 0) {
                var3.field1233 = arg0.method8342();
                var3.field1233 += arg0.method8335() << 16;
                int var50 = 16777215;
                if (var3.field1233 == var50) {
                    var3.field1233 = -1;
                }
            }
            if ((var4 & 0x1000) != 0) {
                var3.field1250 = arg0.method8338();
                var3.field1252 = arg0.method8338();
                var3.field1248 = arg0.method8337();
                var3.field1218 = arg0.method8320();
                var3.field1254 = arg0.method8342() + field833;
                var3.field1255 = arg0.method8448() + field833;
                var3.field1256 = arg0.method8344();
                var3.field1246 = 1;
                var3.field1262 = 0;
                var3.field1250 += var3.field1273[0];
                var3.field1252 += var3.field1270[0];
                var3.field1248 += var3.field1273[0];
                var3.field1218 += var3.field1270[0];
            }
            if ((var4 & 0x10000) != 0) {
                int var51 = arg0.method8357();
                var3.field1205 = (var51 & 0x1) == 0 ? var3.field1327.field2042 : arg0.method8344();
                var3.field1266 = (var51 & 0x2) == 0 ? var3.field1327.field2043 : arg0.method8343();
                var3.field1207 = (var51 & 0x4) == 0 ? var3.field1327.field2059 : arg0.method8342();
                var3.field1208 = (var51 & 0x8) == 0 ? var3.field1327.field2045 : arg0.method8344();
                var3.field1209 = (var51 & 0x10) == 0 ? var3.field1327.field2046 : arg0.method8343();
                var3.field1257 = (var51 & 0x20) == 0 ? var3.field1327.field2047 : arg0.method8343();
                var3.field1268 = (var51 & 0x40) == 0 ? var3.field1327.field2048 : arg0.method8344();
                var3.field1212 = (var51 & 0x80) == 0 ? var3.field1327.field2049 : arg0.method8344();
                var3.field1253 = (var51 & 0x100) == 0 ? var3.field1327.field2050 : arg0.method8342();
                var3.field1214 = (var51 & 0x200) == 0 ? var3.field1327.field2076 : arg0.method8344();
                var3.field1215 = (var51 & 0x400) == 0 ? var3.field1327.field2044 : arg0.method8342();
                var3.field1216 = (var51 & 0x800) == 0 ? var3.field1327.field2053 : arg0.method8344();
                var3.field1217 = (var51 & 0x1000) == 0 ? var3.field1327.field2060 : arg0.method8342();
                var3.field1247 = (var51 & 0x2000) == 0 ? var3.field1327.field2077 : arg0.method8343();
                var3.field1204 = (var51 & 0x4000) == 0 ? var3.field1327.field2041 : arg0.method8342();
            }
            if ((var4 & 0x40000) != 0) {
                int var52 = arg0.method8300();
                int[] var53 = new int[8];
                short[] var54 = new short[8];
                for (int var55 = 0; var55 < 8; var55++) {
                    if ((var52 & 0x1 << var55) == 0) {
                        var53[var55] = -1;
                        var54[var55] = -1;
                    } else {
                        var53[var55] = arg0.method8440();
                        var54[var55] = (short) arg0.method8317();
                    }
                }
                var3.method2473(var53, var54);
            }
            if ((var4 & 0x8000) != 0) {
                var3.method2464(arg0.method8311());
            }
            if ((var4 & 0x2) != 0) {
                arg0.method8448();
                arg0.method8306();
            }
            if ((var4 & 0x1) != 0) {
                var3.field1269 = arg0.method8311();
                var3.field1222 = 100;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1259 = field833 + arg0.method8448();
                var3.field1201 = field833 + arg0.method8448();
                var3.field1261 = arg0.method8337();
                var3.field1219 = arg0.method8337();
                var3.field1213 = arg0.method8337();
                var3.field1251 = (byte) arg0.method8300();
            }
            if ((var4 & 0x100) != 0) {
                int var56 = arg0.method8333();
                if ((var56 & 0x1) == 1) {
                    var3.method2479();
                } else {
                    int[] var57 = null;
                    if ((var56 & 0x2) == 2) {
                        int var58 = arg0.method8333();
                        var57 = new int[var58];
                        for (int var59 = 0; var59 < var58; var59++) {
                            int var60 = arg0.method8343();
                            int var61 = var60 == 65535 ? -1 : var60;
                            var57[var59] = var61;
                        }
                    }
                    short[] var62 = null;
                    if ((var56 & 0x4) == 4) {
                        int var63 = 0;
                        if (var3.field1327.field2057 != null) {
                            var63 = var3.field1327.field2057.length;
                        }
                        var62 = new short[var63];
                        for (int var64 = 0; var64 < var63; var64++) {
                            var62[var64] = (short) arg0.method8343();
                        }
                    }
                    short[] var65 = null;
                    if ((var56 & 0x8) == 8) {
                        int var66 = 0;
                        if (var3.field1327.field2052 != null) {
                            var66 = var3.field1327.field2052.length;
                        }
                        var65 = new short[var66];
                        for (int var67 = 0; var67 < var66; var67++) {
                            var65[var67] = (short) arg0.method8342();
                        }
                    }
                    boolean var68 = false;
                    if ((var56 & 0x10) != 0) {
                        var68 = arg0.method8335() == 1;
                    }
                    long var69 = (long) (++class101.field1326 - 1);
                    var3.method2477(new class195(var69, var57, var62, var65, var68));
                }
            }
            if ((var4 & 0x4000) != 0) {
                var3.method2465(arg0.method8333());
            }
            if ((var4 & 0x400) != 0) {
                var3.field1274 = arg0.method8306();
            }
        }
    }

    @ObfuscatedName("ir.kk(Ldx;B)V")
    public static void method3942(class101 arg0) {
        arg0.field1202 = arg0.field1327.field2038;
        arg0.field1267 = arg0.field1327.field2068;
        arg0.field1207 = arg0.field1327.field2059;
        arg0.field1208 = arg0.field1327.field2045;
        arg0.field1209 = arg0.field1327.field2046;
        arg0.field1257 = arg0.field1327.field2047;
        arg0.field1204 = arg0.field1327.field2041;
        arg0.field1205 = arg0.field1327.field2042;
        arg0.field1266 = arg0.field1327.field2043;
        arg0.field1268 = arg0.field1327.field2048;
        arg0.field1212 = arg0.field1327.field2049;
        arg0.field1253 = arg0.field1327.field2050;
        arg0.field1214 = arg0.field1327.field2076;
        arg0.field1215 = arg0.field1327.field2044;
        arg0.field1216 = arg0.field1327.field2053;
        arg0.field1217 = arg0.field1327.field2060;
        arg0.field1247 = arg0.field1327.field2077;
    }

    @ObfuscatedName("ln.kc(IIB)Liw;")
    public static class216 method5209(int arg0, int arg1) {
        field829.field2393 = arg0;
        field829.field2392 = arg1;
        field829.field2394 = 1;
        field829.field2395 = 1;
        return field829;
    }

    @ObfuscatedName("jt.km(I)V")
    public static void method4391() {
        field676 = 0;
        field640 = false;
    }

    @ObfuscatedName("ne.kz(I)V")
    public static void method6057() {
        method4391();
        field682[0] = class352.field4156;
        field802[0] = "";
        field720[0] = 1006;
        field684[0] = false;
        field676 = 1;
    }

    @ObfuscatedName("qt.kh(I)Z")
    public static final boolean method7346() {
        return field640;
    }

    @ObfuscatedName("aj.kg(IIIIB)V")
    public static final void method312(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field698; var4++) {
            if (field754[var4] + field752[var4] > arg0 && field752[var4] < arg0 + arg2 && field755[var4] + field753[var4] > arg1 && field753[var4] < arg1 + arg3) {
                field750[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.lx(B)V")
    public final void method1204() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field676 - 1; var2++) {
                if (field720[var2] < 1000 && field720[var2 + 1] > 1000) {
                    String var3 = field802[var2];
                    field802[var2] = field802[var2 + 1];
                    field802[var2 + 1] = var3;
                    String var4 = field682[var2];
                    field682[var2] = field682[var2 + 1];
                    field682[var2 + 1] = var4;
                    int var5 = field720[var2];
                    field720[var2] = field720[var2 + 1];
                    field720[var2 + 1] = var5;
                    int var6 = field677[var2];
                    field677[var2] = field677[var2 + 1];
                    field677[var2 + 1] = var6;
                    int var7 = field678[var2];
                    field678[var2] = field678[var2 + 1];
                    field678[var2 + 1] = var7;
                    int var8 = field680[var2];
                    field680[var2] = field680[var2 + 1];
                    field680[var2 + 1] = var8;
                    int var9 = field681[var2];
                    field681[var2] = field681[var2 + 1];
                    field681[var2 + 1] = var9;
                    boolean var10 = field684[var2];
                    field684[var2] = field684[var2 + 1];
                    field684[var2 + 1] = var10;
                    var1 = false;
                }
            }
        }
        if (field711 != null) {
            return;
        }
        int var11 = class36.field249;
        if (!field640) {
            int var39 = field676 - 1;
            if ((var11 == 1 || !Statics.field1924 && var11 == 4) && this.method1205()) {
                var11 = 2;
            }
            if ((var11 == 1 || !Statics.field1924 && var11 == 4) && field676 > 0 && var39 >= 0) {
                int var41 = field677[var39];
                int var42 = field678[var39];
                int var43 = field720[var39];
                int var44 = field680[var39];
                int var45 = field681[var39];
                String var46 = field682[var39];
                String var47 = field802[var39];
                method7193(var41, var42, var43, var44, var45, var46, var47, class36.field250, class36.field251);
            }
            if (var11 == 2 && field676 > 0) {
                this.method1206(class36.field250, class36.field251);
            }
            return;
        }
        if (var11 != 1 && (Statics.field1924 || var11 != 4)) {
            int var12 = class36.field255;
            int var13 = class36.field233;
            if (var12 < Statics.field61 - 10 || var12 > Statics.field61 + Statics.field3510 + 10 || var13 < Statics.field4603 - 10 || var13 > Statics.field4603 + Statics.field2650 + 10) {
                field640 = false;
                int var14 = Statics.field61;
                int var15 = Statics.field4603;
                int var16 = Statics.field3510;
                int var17 = Statics.field2650;
                for (int var18 = 0; var18 < field698; var18++) {
                    if (field754[var18] + field752[var18] > var14 && field752[var18] < var14 + var16 && field755[var18] + field753[var18] > var15 && field753[var18] < var15 + var17) {
                        field537[var18] = true;
                    }
                }
            }
        }
        if (var11 != 1 && Statics.field1924 || var11 != 4) {
            return;
        }
        int var19 = Statics.field61;
        int var20 = Statics.field4603;
        int var21 = Statics.field3510;
        int var22 = class36.field250;
        int var23 = class36.field251;
        int var24 = -1;
        for (int var25 = 0; var25 < field676; var25++) {
            int var26 = (field676 - 1 - var25) * 15 + var20 + 31;
            if (var22 > var19 && var22 < var19 + var21 && var23 > var26 - 13 && var23 < var26 + 3) {
                var24 = var25;
            }
        }
        if (var24 != -1 && var24 >= 0) {
            int var27 = field677[var24];
            int var28 = field678[var24];
            int var29 = field720[var24];
            int var30 = field680[var24];
            int var31 = field681[var24];
            String var32 = field682[var24];
            String var33 = field802[var24];
            method7193(var27, var28, var29, var30, var31, var32, var33, class36.field250, class36.field251);
        }
        field640 = false;
        int var34 = Statics.field61;
        int var35 = Statics.field4603;
        int var36 = Statics.field3510;
        int var37 = Statics.field2650;
        for (int var38 = 0; var38 < field698; var38++) {
            if (field754[var38] + field752[var38] > var34 && field752[var38] < var34 + var36 && field755[var38] + field753[var38] > var35 && field753[var38] < var35 + var37) {
                field537[var38] = true;
            }
        }
    }

    @ObfuscatedName("client.le(B)Z")
    public final boolean method1205() {
        int var1 = field676 - 1;
        return (field674 && field676 > 2 || method1033(var1)) && !field684[var1];
    }

    @ObfuscatedName("client.lu(III)V")
    public final void method1206(int arg0, int arg1) {
        Statics.method6045(arg0, arg1);
        int var3 = arg0 - field809;
        int var4 = arg1 - field810;
        Statics.field1570.method4240(Statics.field1321, var3, var4, false);
        field640 = true;
    }

    @ObfuscatedName("cf.ld(II)Z")
    public static final boolean method1033(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field720[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("qq.lm(IIIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method7193(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 9) {
            class101 var9 = field587[arg3];
            if (var9 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var10 = class297.method1166(class295.field3197, field592.field1429);
                var10.field3227.method8330(field675.method3811(82) ? 1 : 0);
                var10.field3227.method8455(arg3);
                field592.method2665(var10);
            }
        }
        if (arg2 == 12) {
            class101 var11 = field587[arg3];
            if (var11 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var12 = class297.method1166(class295.field3167, field592.field1429);
                var12.field3227.method8330(field675.method3811(82) ? 1 : 0);
                var12.field3227.method8345(arg3);
                field592.method2665(var12);
            }
        }
        if (arg2 == 45) {
            class92 var13 = field700[arg3];
            if (var13 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var14 = class297.method1166(class295.field3159, field592.field1429);
                var14.field3227.method8340(arg3);
                var14.field3227.method8283(field675.method3811(82) ? 1 : 0);
                field592.method2665(var14);
            }
        }
        if (arg2 == 47) {
            class92 var15 = field700[arg3];
            if (var15 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var16 = class297.method1166(class295.field3174, field592.field1429);
                var16.field3227.method8455(arg3);
                var16.field3227.method8533(field675.method3811(82) ? 1 : 0);
                field592.method2665(var16);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class332 var17 = class332.method865(arg1, arg0);
            if (var17 != null) {
                method875(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 19) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var18 = class297.method1166(class295.field3158, field592.field1429);
            var18.field3227.method8345(Statics.field354 + arg1);
            var18.field3227.method8340(Statics.field1448 + arg0);
            var18.field3227.method8330(field675.method3811(82) ? 1 : 0);
            var18.field3227.method8481(arg3);
            field592.method2665(var18);
        }
        if (arg2 == 1) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var19 = class297.method1166(class295.field3126, field592.field1429);
            var19.field3227.method8455(Statics.field1768);
            var19.field3227.method8464(Statics.field1644);
            var19.field3227.method8345(Statics.field2917);
            var19.field3227.method8340(arg3);
            var19.field3227.method8455(Statics.field354 + arg1);
            var19.field3227.method8455(Statics.field1448 + arg0);
            var19.field3227.method8283(field675.method3811(82) ? 1 : 0);
            field592.method2665(var19);
        }
        if (arg2 == 13) {
            class101 var20 = field587[arg3];
            if (var20 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var21 = class297.method1166(class295.field3153, field592.field1429);
                var21.field3227.method8352(field675.method3811(82) ? 1 : 0);
                var21.field3227.method8481(arg3);
                field592.method2665(var21);
            }
        }
        if (arg2 == 14) {
            class92 var22 = field700[arg3];
            if (var22 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var23 = class297.method1166(class295.field3119, field592.field1429);
                var23.field3227.method8312(Statics.field1644);
                var23.field3227.method8455(Statics.field1768);
                var23.field3227.method8455(Statics.field2917);
                var23.field3227.method8455(arg3);
                var23.field3227.method8283(field675.method3811(82) ? 1 : 0);
                field592.method2665(var23);
            }
        }
        if (arg2 == 1002) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            class297 var24 = class297.method1166(class295.field3172, field592.field1429);
            var24.field3227.method8340(arg3);
            field592.method2665(var24);
        }
        if (arg2 == 10) {
            class101 var25 = field587[arg3];
            if (var25 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var26 = class297.method1166(class295.field3161, field592.field1429);
                var26.field3227.method8283(field675.method3811(82) ? 1 : 0);
                var26.field3227.method8481(arg3);
                field592.method2665(var26);
            }
        }
        if (arg2 == 1001) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var27 = class297.method1166(class295.field3144, field592.field1429);
            var27.field3227.method8340(Statics.field354 + arg1);
            var27.field3227.method8481(Statics.field1448 + arg0);
            var27.field3227.method8283(field675.method3811(82) ? 1 : 0);
            var27.field3227.method8455(arg3);
            field592.method2665(var27);
        }
        if (arg2 == 26) {
            method4697();
        }
        if (arg2 == 8) {
            class101 var28 = field587[arg3];
            if (var28 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var29 = class297.method1166(class295.field3186, field592.field1429);
                var29.field3227.method8352(field675.method3811(82) ? 1 : 0);
                var29.field3227.method8455(arg3);
                var29.field3227.method8481(field661);
                var29.field3227.method8354(Statics.field4406);
                var29.field3227.method8340(field695);
                field592.method2665(var29);
            }
        }
        if (arg2 == 18) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var30 = class297.method1166(class295.field3136, field592.field1429);
            var30.field3227.method8455(arg3);
            var30.field3227.method8340(Statics.field1448 + arg0);
            var30.field3227.method8330(field675.method3811(82) ? 1 : 0);
            var30.field3227.method8345(Statics.field354 + arg1);
            field592.method2665(var30);
        }
        if (arg2 == 23) {
            if (field640) {
                Statics.field1570.method4324();
            } else {
                Statics.field1570.method4240(Statics.field1321, arg0, arg1, true);
            }
        }
        if (arg2 == 24) {
            class332 var31 = class332.method2255(arg1);
            if (var31 != null) {
                boolean var32 = true;
                if (var31.field3675 > 0) {
                    var32 = method7463(var31);
                }
                if (var32) {
                    class297 var33 = class297.method1166(class295.field3123, field592.field1429);
                    var33.field3227.method8464(arg1);
                    field592.method2665(var33);
                }
            }
        }
        if (arg2 == 11) {
            class101 var34 = field587[arg3];
            if (var34 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var35 = class297.method1166(class295.field3189, field592.field1429);
                var35.field3227.method8340(arg3);
                var35.field3227.method8283(field675.method3811(82) ? 1 : 0);
                field592.method2665(var35);
            }
        }
        if (arg2 == 49) {
            class92 var36 = field700[arg3];
            if (var36 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var37 = class297.method1166(class295.field3156, field592.field1429);
                var37.field3227.method8455(arg3);
                var37.field3227.method8352(field675.method3811(82) ? 1 : 0);
                field592.method2665(var37);
            }
        }
        if (arg2 == 16) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var38 = class297.method1166(class295.field3162, field592.field1429);
            var38.field3227.method8340(Statics.field1768);
            var38.field3227.method8481(arg3);
            var38.field3227.method8283(field675.method3811(82) ? 1 : 0);
            var38.field3227.method8455(Statics.field2917);
            var38.field3227.method8481(Statics.field1448 + arg0);
            var38.field3227.method8455(Statics.field354 + arg1);
            var38.field3227.method8353(Statics.field1644);
            field592.method2665(var38);
        }
        if (arg2 == 2) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var39 = class297.method1166(class295.field3170, field592.field1429);
            var39.field3227.method8340(arg3);
            var39.field3227.method8455(Statics.field1448 + arg0);
            var39.field3227.method8345(Statics.field354 + arg1);
            var39.field3227.method8340(field695);
            var39.field3227.method8352(field675.method3811(82) ? 1 : 0);
            var39.field3227.method8340(field661);
            var39.field3227.method8312(Statics.field4406);
            field592.method2665(var39);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field114.method7972(arg2, arg3, new class323(arg0), new class323(arg1));
        }
        if (arg2 == 6) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var40 = class297.method1166(class295.field3181, field592.field1429);
            var40.field3227.method8283(field675.method3811(82) ? 1 : 0);
            var40.field3227.method8455(Statics.field354 + arg1);
            var40.field3227.method8345(arg3);
            var40.field3227.method8481(Statics.field1448 + arg0);
            field592.method2665(var40);
        }
        if (arg2 == 21) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var41 = class297.method1166(class295.field3152, field592.field1429);
            var41.field3227.method8283(field675.method3811(82) ? 1 : 0);
            var41.field3227.method8481(Statics.field1448 + arg0);
            var41.field3227.method8455(Statics.field354 + arg1);
            var41.field3227.method8481(arg3);
            field592.method2665(var41);
        }
        if (arg2 == 30 && field704 == null) {
            method7686(arg1, arg0);
            field704 = class332.method865(arg1, arg0);
            method3930(field704);
        }
        if (arg2 == 15) {
            class92 var42 = field700[arg3];
            if (var42 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var43 = class297.method1166(class295.field3166, field592.field1429);
                var43.field3227.method8340(field695);
                var43.field3227.method8481(field661);
                var43.field3227.method8354(Statics.field4406);
                var43.field3227.method8481(arg3);
                var43.field3227.method8330(field675.method3811(82) ? 1 : 0);
                field592.method2665(var43);
            }
        }
        if (arg2 == 28) {
            class297 var44 = class297.method1166(class295.field3123, field592.field1429);
            var44.field3227.method8464(arg1);
            field592.method2665(var44);
            class332 var45 = class332.method2255(arg1);
            if (var45 != null && var45.field3714 != null && var45.field3714[0][0] == 5) {
                int var46 = var45.field3714[0][1];
                class322.field3540[var46] = 1 - class322.field3540[var46];
                method5042(var46);
            }
        }
        if (arg2 == 48) {
            class92 var47 = field700[arg3];
            if (var47 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var48 = class297.method1166(class295.field3121, field592.field1429);
                var48.field3227.method8455(arg3);
                var48.field3227.method8352(field675.method3811(82) ? 1 : 0);
                field592.method2665(var48);
            }
        }
        if (arg2 == 4) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var49 = class297.method1166(class295.field3111, field592.field1429);
            var49.field3227.method8345(Statics.field1448 + arg0);
            var49.field3227.method8345(Statics.field354 + arg1);
            var49.field3227.method8481(arg3);
            var49.field3227.method8533(field675.method3811(82) ? 1 : 0);
            field592.method2665(var49);
        }
        if (arg2 == 29) {
            class297 var50 = class297.method1166(class295.field3123, field592.field1429);
            var50.field3227.method8464(arg1);
            field592.method2665(var50);
            class332 var51 = class332.method2255(arg1);
            if (var51 != null && var51.field3714 != null && var51.field3714[0][0] == 5) {
                int var52 = var51.field3714[0][1];
                if (class322.field3540[var52] != var51.field3774[0]) {
                    class322.field3540[var52] = var51.field3774[0];
                    method5042(var52);
                }
            }
        }
        if (arg2 == 1003) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            class101 var53 = field587[arg3];
            if (var53 != null) {
                class196 var54 = var53.field1327;
                if (var54.field2066 != null) {
                    var54 = var54.method3409();
                }
                if (var54 != null) {
                    class297 var55 = class297.method1166(class295.field3173, field592.field1429);
                    var55.field3227.method8455(var54.field2036);
                    field592.method2665(var55);
                }
            }
        }
        if (arg2 == 44) {
            class92 var56 = field700[arg3];
            if (var56 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var57 = class297.method1166(class295.field3118, field592.field1429);
                var57.field3227.method8340(arg3);
                var57.field3227.method8352(field675.method3811(82) ? 1 : 0);
                field592.method2665(var57);
            }
        }
        if (arg2 == 1004) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            class297 var58 = class297.method1166(class295.field3151, field592.field1429);
            var58.field3227.method8345(Statics.field1448 + arg0);
            var58.field3227.method8340(arg3);
            var58.field3227.method8481(Statics.field354 + arg1);
            field592.method2665(var58);
        }
        if (arg2 == 46) {
            class92 var59 = field700[arg3];
            if (var59 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var60 = class297.method1166(class295.field3171, field592.field1429);
                var60.field3227.method8481(arg3);
                var60.field3227.method8283(field675.method3811(82) ? 1 : 0);
                field592.method2665(var60);
            }
        }
        if (arg2 == 22) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var61 = class297.method1166(class295.field3179, field592.field1429);
            var61.field3227.method8340(Statics.field1448 + arg0);
            var61.field3227.method8345(Statics.field354 + arg1);
            var61.field3227.method8330(field675.method3811(82) ? 1 : 0);
            var61.field3227.method8345(arg3);
            field592.method2665(var61);
        }
        if (arg2 == 58) {
            class332 var62 = class332.method865(arg1, arg0);
            if (var62 != null) {
                if (var62.field3755 != null) {
                    class88 var63 = new class88();
                    var63.field1084 = var62;
                    var63.field1089 = arg3;
                    var63.field1093 = arg6;
                    var63.field1087 = var62.field3755;
                    class71.method5065(var63);
                }
                class297 var64 = class297.method1166(class295.field3122, field592.field1429);
                var64.field3227.method8455(field661);
                var64.field3227.method8345(arg0);
                var64.field3227.method8340(field695);
                var64.field3227.method8345(arg4);
                var64.field3227.method8354(Statics.field4406);
                var64.field3227.method8353(arg1);
                field592.method2665(var64);
            }
        }
        if (arg2 == 5) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var65 = class297.method1166(class295.field3147, field592.field1429);
            var65.field3227.method8345(arg3);
            var65.field3227.method8340(Statics.field1448 + arg0);
            var65.field3227.method8330(field675.method3811(82) ? 1 : 0);
            var65.field3227.method8345(Statics.field354 + arg1);
            field592.method2665(var65);
        }
        if (arg2 == 50) {
            class92 var66 = field700[arg3];
            if (var66 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var67 = class297.method1166(class295.field3207, field592.field1429);
                var67.field3227.method8481(arg3);
                var67.field3227.method8283(field675.method3811(82) ? 1 : 0);
                field592.method2665(var67);
            }
        }
        if (arg2 == 25) {
            class332 var68 = class332.method865(arg1, arg0);
            if (var68 != null) {
                Statics.method3283();
                method6036(arg1, arg0, class333.method3374(method3401(var68)), arg4);
                field692 = 0;
                field710 = method5211(var68);
                if (field710 == null) {
                    field710 = class352.field4223;
                }
                if (var68.field3731) {
                    field721 = var68.field3651 + class102.method3915(16777215);
                } else {
                    field721 = class102.method3915(65280) + var68.field3759 + class102.method3915(16777215);
                }
            }
            return;
        }
        if (arg2 == 17) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var69 = class297.method1166(class295.field3200, field592.field1429);
            var69.field3227.method8481(Statics.field1448 + arg0);
            var69.field3227.method8330(field675.method3811(82) ? 1 : 0);
            var69.field3227.method8455(field661);
            var69.field3227.method8340(field695);
            var69.field3227.method8354(Statics.field4406);
            var69.field3227.method8455(Statics.field354 + arg1);
            var69.field3227.method8455(arg3);
            field592.method2665(var69);
        }
        if (arg2 == 20) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var70 = class297.method1166(class295.field3142, field592.field1429);
            var70.field3227.method8481(Statics.field354 + arg1);
            var70.field3227.method8330(field675.method3811(82) ? 1 : 0);
            var70.field3227.method8340(arg3);
            var70.field3227.method8481(Statics.field1448 + arg0);
            field592.method2665(var70);
        }
        if (arg2 == 3) {
            field647 = arg7;
            field648 = arg8;
            field764 = 2;
            field706 = 0;
            field778 = arg0;
            field701 = arg1;
            class297 var71 = class297.method1166(class295.field3187, field592.field1429);
            var71.field3227.method8345(Statics.field1448 + arg0);
            var71.field3227.method8481(Statics.field354 + arg1);
            var71.field3227.method8283(field675.method3811(82) ? 1 : 0);
            var71.field3227.method8340(arg3);
            field592.method2665(var71);
        }
        if (arg2 == 51) {
            class92 var72 = field700[arg3];
            if (var72 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var73 = class297.method1166(class295.field3203, field592.field1429);
                var73.field3227.method8283(field675.method3811(82) ? 1 : 0);
                var73.field3227.method8455(arg3);
                field592.method2665(var73);
            }
        }
        if (arg2 == 7) {
            class101 var74 = field587[arg3];
            if (var74 != null) {
                field647 = arg7;
                field648 = arg8;
                field764 = 2;
                field706 = 0;
                field778 = arg0;
                field701 = arg1;
                class297 var75 = class297.method1166(class295.field3177, field592.field1429);
                var75.field3227.method8481(Statics.field2917);
                var75.field3227.method8481(Statics.field1768);
                var75.field3227.method8312(Statics.field1644);
                var75.field3227.method8481(arg3);
                var75.field3227.method8330(field675.method3811(82) ? 1 : 0);
                field592.method2665(var75);
            }
        }
        if (field692 != 0) {
            field692 = 0;
            method3930(class332.method2255(Statics.field1644));
        }
        if (field619) {
            Statics.method3283();
        }
    }

    @ObfuscatedName("ar.lp(ILjava/lang/String;I)V")
    public static void method169(int arg0, String arg1) {
        int var2 = class108.field1380;
        int[] var3 = class108.field1381;
        boolean var4 = false;
        class538 var5 = new class538(arg1, Statics.field4388);
        for (int var6 = 0; var6 < var2; var6++) {
            class92 var7 = field700[var3[var6]];
            if (var7 != null && Statics.field2132 != var7 && var7.field1146 != null && var7.field1146.equals(var5)) {
                if (arg0 == 1) {
                    class297 var8 = class297.method1166(class295.field3118, field592.field1429);
                    var8.field3227.method8340(var3[var6]);
                    var8.field3227.method8352(0);
                    field592.method2665(var8);
                } else if (arg0 == 4) {
                    class297 var9 = class297.method1166(class295.field3174, field592.field1429);
                    var9.field3227.method8455(var3[var6]);
                    var9.field3227.method8533(0);
                    field592.method2665(var9);
                } else if (arg0 == 6) {
                    class297 var10 = class297.method1166(class295.field3156, field592.field1429);
                    var10.field3227.method8455(var3[var6]);
                    var10.field3227.method8352(0);
                    field592.method2665(var10);
                } else if (arg0 == 7) {
                    class297 var11 = class297.method1166(class295.field3207, field592.field1429);
                    var11.field3227.method8481(var3[var6]);
                    var11.field3227.method8283(0);
                    field592.method2665(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class111.method683(4, "", class352.field4057 + arg1);
        }
    }

    @ObfuscatedName("ms.la(IIIII)V")
    public static void method6036(int arg0, int arg1, int arg2, int arg3) {
        class332 var4 = class332.method865(arg0, arg1);
        if (var4 != null && var4.field3745 != null) {
            class88 var5 = new class88();
            var5.field1084 = var4;
            var5.field1087 = var4.field3745;
            class71.method5065(var5);
        }
        field661 = arg3;
        field619 = true;
        Statics.field4406 = arg0;
        field695 = arg1;
        Statics.field117 = arg2;
        method3930(var4);
    }

    @ObfuscatedName("rn.ls(IIS)V")
    public static void method7686(int arg0, int arg1) {
        class297 var2 = class297.method1166(class295.field3164, field592.field1429);
        var2.field3227.method8312(arg0);
        var2.field3227.method8481(arg1);
        field592.method2665(var2);
    }

    @ObfuscatedName("bx.ly(IIIILjava/lang/String;I)V")
    public static void method875(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class332 var5 = class332.method865(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3754 != null) {
            class88 var6 = new class88();
            var6.field1084 = var5;
            var6.field1089 = arg0;
            var6.field1093 = arg4;
            var6.field1087 = var5.field3754;
            class71.method5065(var6);
        }
        boolean var7 = true;
        if (var5.field3675 > 0) {
            var7 = method7463(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method3401(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class297 var11 = class297.method1166(class295.field3134, field592.field1429);
            var11.field3227.method8464(arg1);
            var11.field3227.method8345(arg2);
            var11.field3227.method8345(arg3);
            field592.method2665(var11);
        }
        if (arg0 == 2) {
            class297 var12 = class297.method1166(class295.field3124, field592.field1429);
            var12.field3227.method8464(arg1);
            var12.field3227.method8345(arg2);
            var12.field3227.method8345(arg3);
            field592.method2665(var12);
        }
        if (arg0 == 3) {
            class297 var13 = class297.method1166(class295.field3176, field592.field1429);
            var13.field3227.method8464(arg1);
            var13.field3227.method8345(arg2);
            var13.field3227.method8345(arg3);
            field592.method2665(var13);
        }
        if (arg0 == 4) {
            class297 var14 = class297.method1166(class295.field3141, field592.field1429);
            var14.field3227.method8464(arg1);
            var14.field3227.method8345(arg2);
            var14.field3227.method8345(arg3);
            field592.method2665(var14);
        }
        if (arg0 == 5) {
            class297 var15 = class297.method1166(class295.field3157, field592.field1429);
            var15.field3227.method8464(arg1);
            var15.field3227.method8345(arg2);
            var15.field3227.method8345(arg3);
            field592.method2665(var15);
        }
        if (arg0 == 6) {
            class297 var16 = class297.method1166(class295.field3113, field592.field1429);
            var16.field3227.method8464(arg1);
            var16.field3227.method8345(arg2);
            var16.field3227.method8345(arg3);
            field592.method2665(var16);
        }
        if (arg0 == 7) {
            class297 var17 = class297.method1166(class295.field3155, field592.field1429);
            var17.field3227.method8464(arg1);
            var17.field3227.method8345(arg2);
            var17.field3227.method8345(arg3);
            field592.method2665(var17);
        }
        if (arg0 == 8) {
            class297 var18 = class297.method1166(class295.field3109, field592.field1429);
            var18.field3227.method8464(arg1);
            var18.field3227.method8345(arg2);
            var18.field3227.method8345(arg3);
            field592.method2665(var18);
        }
        if (arg0 == 9) {
            class297 var19 = class297.method1166(class295.field3184, field592.field1429);
            var19.field3227.method8464(arg1);
            var19.field3227.method8345(arg2);
            var19.field3227.method8345(arg3);
            field592.method2665(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class297 var20 = class297.method1166(class295.field3140, field592.field1429);
        var20.field3227.method8464(arg1);
        var20.field3227.method8345(arg2);
        var20.field3227.method8345(arg3);
        field592.method2665(var20);
    }

    @ObfuscatedName("ov.lg(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method6575(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method2749(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("eb.lk(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method2749(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field640 || field676 >= 500) {
            return;
        }
        field682[field676] = arg0;
        field802[field676] = arg1;
        field720[field676] = arg2;
        field680[field676] = arg3;
        field677[field676] = arg4;
        field678[field676] = arg5;
        field681[field676] = arg6;
        field684[field676] = arg7;
        field676++;
    }

    @ObfuscatedName("gn.ln(IB)Ljava/lang/String;")
    public static String method3261(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field802[arg0].length() > 0) {
            return field682[arg0] + class352.field3961 + field802[arg0];
        } else {
            return field682[arg0];
        }
    }

    @ObfuscatedName("fe.lc(IIIIB)V")
    public static final void method2916(int arg0, int arg1, int arg2, int arg3) {
        if (field692 == 0 && !field619) {
            method6575(class352.field4082, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        int var8 = 0;
        while (true) {
            int var10 = class241.field2789;
            if (var8 >= var10) {
                if (var4 != -1L) {
                    int var11 = (int) (var4 >>> 0 & 0x7FL);
                    int var13 = (int) (var4 >>> 7 & 0x7FL);
                    class92 var15 = field700[field666];
                    method3941(var15, field666, var11, var13);
                }
                return;
            }
            long var16 = class241.method5009(var8);
            if (var6 != var16) {
                label309: {
                    var6 = var16;
                    int var18 = class241.method1984(var8);
                    int var19 = class241.method830(var8);
                    int var20 = class241.method3250(class241.field2796[var8]);
                    int var22 = class241.method3275(class241.field2796[var8]);
                    int var23 = var22;
                    if (var20 == 2 && Statics.field1570.method4231(Statics.field1321, var18, var19, var16) >= 0) {
                        class206 var24 = class206.method3321(var22);
                        if (var24.field2212 != null) {
                            var24 = var24.method3610();
                        }
                        if (var24 == null) {
                            break label309;
                        }
                        class95 var25 = null;
                        for (class95 var26 = (class95) field668.method6393(); var26 != null; var26 = (class95) field668.method6395()) {
                            if (Statics.field1321 == var26.field1196 && var26.field1189 == var18 && var26.field1195 == var19 && var26.field1188 == var23) {
                                var25 = var26;
                                break;
                            }
                        }
                        if (field692 == 1) {
                            method6575(class352.field4077, field693 + " " + class102.field1340 + " " + class102.method3915(65535) + var24.field2181, 1, var23, var18, var19);
                        } else if (!field619) {
                            String[] var27 = var24.field2190;
                            if (var27 != null) {
                                for (int var28 = 4; var28 >= 0; var28--) {
                                    if ((var25 == null || var25.method2262(var28)) && var27[var28] != null) {
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
                                        method6575(var27[var28], class102.method3915(65535) + var24.field2181, var29, var23, var18, var19);
                                    }
                                }
                            }
                            method6575(class352.field4078, class102.method3915(65535) + var24.field2181, 1002, var24.field2178, var18, var19);
                        } else if ((Statics.field117 & 0x4) == 4) {
                            method6575(field710, field721 + " " + class102.field1340 + " " + class102.method3915(65535) + var24.field2181, 2, var23, var18, var19);
                        }
                    }
                    if (var20 == 1) {
                        class101 var30 = field587[var23];
                        if (var30 == null) {
                            break label309;
                        }
                        if (var30.field1327.field2038 == 1 && (var30.field1228 & 0x7F) == 64 && (var30.field1199 & 0x7F) == 64) {
                            for (int var31 = 0; var31 < field588; var31++) {
                                class101 var32 = field587[field526[var31]];
                                if (var32 != null && var30 != var32 && var32.field1327.field2038 == 1 && var30.field1228 == var32.field1228 && var30.field1199 == var32.field1199) {
                                    method4994(var32, field526[var31], var18, var19);
                                }
                            }
                            int var33 = class108.field1380;
                            int[] var34 = class108.field1381;
                            for (int var35 = 0; var35 < var33; var35++) {
                                class92 var36 = field700[var34[var35]];
                                if (var36 != null && var30.field1228 == var36.field1228 && var30.field1199 == var36.field1199) {
                                    method3941(var36, var34[var35], var18, var19);
                                }
                            }
                        }
                        method4994(var30, var23, var18, var19);
                    }
                    if (var20 == 0) {
                        class92 var37 = field700[var23];
                        if (var37 == null) {
                            break label309;
                        }
                        if ((var37.field1228 & 0x7F) == 64 && (var37.field1199 & 0x7F) == 64) {
                            for (int var38 = 0; var38 < field588; var38++) {
                                class101 var39 = field587[field526[var38]];
                                if (var39 != null && var39.field1327.field2038 == 1 && var37.field1228 == var39.field1228 && var37.field1199 == var39.field1199) {
                                    method4994(var39, field526[var38], var18, var19);
                                }
                            }
                            int var40 = class108.field1380;
                            int[] var41 = class108.field1381;
                            for (int var42 = 0; var42 < var40; var42++) {
                                class92 var43 = field700[var41[var42]];
                                if (var43 != null && var37 != var43 && var37.field1228 == var43.field1228 && var37.field1199 == var43.field1199) {
                                    method3941(var43, var41[var42], var18, var19);
                                }
                            }
                        }
                        if (field666 == var23) {
                            var4 = var16;
                        } else {
                            method3941(var37, var23, var18, var19);
                        }
                    }
                    if (var20 == 3) {
                        class378 var44 = field667[Statics.field1321][var18][var19];
                        if (var44 != null) {
                            for (class105 var45 = (class105) var44.method6394(); var45 != null; var45 = (class105) var44.method6422()) {
                                class207 var46 = class207.method3280(var45.field1363);
                                if (field692 == 1) {
                                    method6575(class352.field4077, field693 + " " + class102.field1340 + " " + class102.method3915(16748608) + var46.field2251, 16, var45.field1363, var18, var19);
                                } else if (!field619) {
                                    String[] var47 = var46.field2252;
                                    for (int var48 = 4; var48 >= 0; var48--) {
                                        if (var45.method2557(var48)) {
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
                                                method6575(var47[var48], class102.method3915(16748608) + var46.field2251, var49, var45.field1363, var18, var19);
                                            } else if (var48 == 2) {
                                                method6575(class352.field4076, class102.method3915(16748608) + var46.field2251, 20, var45.field1363, var18, var19);
                                            }
                                        }
                                    }
                                    method6575(class352.field4078, class102.method3915(16748608) + var46.field2251, 1004, var45.field1363, var18, var19);
                                } else if ((Statics.field117 & 0x1) == 1) {
                                    method6575(field710, field721 + " " + class102.field1340 + " " + class102.method3915(16748608) + var46.field2251, 17, var45.field1363, var18, var19);
                                }
                            }
                        }
                    }
                }
            }
            var8++;
        }
    }

    @ObfuscatedName("kb.lv(Ldx;IIIB)V")
    public static final void method4994(class101 arg0, int arg1, int arg2, int arg3) {
        class196 var4 = arg0.field1327;
        if (field676 >= 400) {
            return;
        }
        if (var4.field2066 != null) {
            var4 = var4.method3409();
        }
        if (var4 == null || !var4.field2072 || var4.field2074 && field562 != arg1) {
            return;
        }
        String var5 = arg0.method2467();
        if (var4.field2062 != 0 && arg0.field1274 != 0) {
            int var6 = arg0.field1274 == -1 ? var4.field2062 : arg0.field1274;
            var5 = var5 + method170(var6, Statics.field2132.field1134) + " " + class102.field1335 + class352.field3923 + var6 + class102.field1337;
        }
        if (var4.field2074 && field685) {
            method6575(class352.field4078, class102.method3915(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field692 == 1) {
            method6575(class352.field4077, field693 + " " + class102.field1340 + " " + class102.method3915(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field619) {
            int var7 = var4.field2074 && field685 ? 2000 : 0;
            String[] var8 = var4.field2035;
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (arg0.method2466(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase(class352.field4079)) {
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
                        method6575(var8[var9], class102.method3915(16776960) + var5, var10, arg1, arg2, arg3);
                    }
                }
            }
            if (var8 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (arg0.method2466(var11) && var8[var11] != null && var8[var11].equalsIgnoreCase(class352.field4079)) {
                        short var12 = 0;
                        if (field557 != class104.field1355) {
                            if (field557 == class104.field1353 || field557 == class104.field1359 && var4.field2062 > Statics.field2132.field1134) {
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
                            method6575(var8[var11], class102.method3915(16776960) + var5, var13, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2074 || !field685) {
                method6575(class352.field4078, class102.method3915(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field117 & 0x2) == 2) {
            method6575(field710, field721 + " " + class102.field1340 + " " + class102.method3915(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ir.lr(Ldf;IIII)V")
    public static final void method3941(class92 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2132 == arg0 || field676 >= 400) {
            return;
        }
        String var4;
        if (arg0.field1143 == 0) {
            var4 = arg0.field1132[0] + arg0.field1146 + arg0.field1132[1] + method170(arg0.field1134, Statics.field2132.field1134) + " " + class102.field1335 + class352.field3923 + arg0.field1134 + class102.field1337 + arg0.field1132[2];
        } else {
            var4 = arg0.field1132[0] + arg0.field1146 + arg0.field1132[1] + " " + class102.field1335 + class352.field4087 + arg0.field1143 + class102.field1337 + arg0.field1132[2];
        }
        if (field692 == 1) {
            method6575(class352.field4077, field693 + " " + class102.field1340 + " " + class102.method3915(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field619) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field550[var5] != null) {
                    short var6 = 0;
                    if (field550[var5].equalsIgnoreCase(class352.field4079)) {
                        if (field556 == class104.field1355) {
                            continue;
                        }
                        if (field556 == class104.field1353 || field556 == class104.field1359 && arg0.field1134 > Statics.field2132.field1134) {
                            var6 = 2000;
                        }
                        if (Statics.field2132.field1156 == 0 || arg0.field1156 == 0) {
                            if (field556 == class104.field1356 && arg0.method2219()) {
                                var6 = 2000;
                            }
                        } else if (Statics.field2132.field1156 == arg0.field1156) {
                            var6 = 2000;
                        } else {
                            var6 = 0;
                        }
                    } else if (field664[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field662[var5] + var6;
                    method6575(field550[var5], class102.method3915(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field117 & 0x8) == 8) {
            method6575(field710, field721 + " " + class102.field1340 + " " + class102.method3915(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field676; var9++) {
            if (field720[var9] == 23) {
                field802[var9] = class102.method3915(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("ar.lt(III)Ljava/lang/String;")
    public static final String method170(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class102.method3915(16711680);
        } else if (var2 < -6) {
            return class102.method3915(16723968);
        } else if (var2 < -3) {
            return class102.method3915(16740352);
        } else if (var2 < 0) {
            return class102.method3915(16756736);
        } else if (var2 > 9) {
            return class102.method3915(65280);
        } else if (var2 > 6) {
            return class102.method3915(4259584);
        } else if (var2 > 3) {
            return class102.method3915(8453888);
        } else if (var2 > 0) {
            return class102.method3915(12648192);
        } else {
            return class102.method3915(16776960);
        }
    }

    @ObfuscatedName("bq.lj(IIIIIIIIB)V")
    public static final void method693(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class332.method6373(arg0)) {
            Statics.field1798 = null;
            method2919(Statics.field3229[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1798 != null) {
                method2919(Statics.field1798, -1412584499, arg1, arg2, arg3, arg4, Statics.field1612, Statics.field3560, arg7);
                Statics.field1798 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field537[var8] = true;
            }
        } else {
            field537[arg7] = true;
        }
    }

    @ObfuscatedName("fd.lz([Lmi;IIIIIIIII)V")
    public static final void method2919(class332[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class525.method8621(arg2, arg3, arg4, arg5);
        class227.method4065();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class332 var10 = arg0[var9];
            if (var10 != null && (var10.field3666 == arg1 || arg1 == -1412584499 && field711 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field752[field698] = var10.field3648 + arg6;
                    field753[field698] = var10.field3661 + arg7;
                    field754[field698] = var10.field3662;
                    field755[field698] = var10.field3635;
                    var11 = ++field698 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3791 = var11;
                var10.field3792 = field833;
                if (!var10.field3731 || !method2957(var10)) {
                    if (var10.field3675 > 0) {
                        method3556(var10);
                    }
                    int var12 = var10.field3648 + arg6;
                    int var13 = var10.field3661 + arg7;
                    int var14 = var10.field3670;
                    if (field711 == var10) {
                        if (arg1 != -1412584499 && !var10.field3732) {
                            Statics.field1798 = arg0;
                            Statics.field1612 = arg6;
                            Statics.field3560 = arg7;
                            continue;
                        }
                        if (field722 && field716) {
                            int var15 = class36.field255;
                            int var16 = class36.field233;
                            int var17 = var15 - field713;
                            int var18 = var16 - field786;
                            if (var17 < field717) {
                                var17 = field717;
                            }
                            if (var10.field3662 + var17 > field717 + field730.field3662) {
                                var17 = field717 + field730.field3662 - var10.field3662;
                            }
                            if (var18 < field718) {
                                var18 = field718;
                            }
                            if (var10.field3635 + var18 > field718 + field730.field3635) {
                                var18 = field718 + field730.field3635 - var10.field3635;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3732) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3649 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3662 + var12;
                        int var22 = var10.field3635 + var13;
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
                        int var29 = var10.field3662 + var12;
                        int var30 = var10.field3635 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3731 || var25 < var27 && var26 < var28) {
                        if (var10.field3675 != 0) {
                            if (var10.field3675 == 1336) {
                                if (Statics.field4737.method2358()) {
                                    var13 += 15;
                                    Statics.field1058.method6845("Fps:" + field206, var10.field3662 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field531) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1058.method6845("Mem:" + var32 + "k", var10.field3662 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3675 == 1337) {
                                field688 = var12;
                                field689 = var13;
                                method2910(var12, var13, var10.field3662, var10.field3635);
                                field537[var10.field3791] = true;
                                class525.method8621(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3675 == 1338) {
                                method34(var10, var12, var13, var11);
                                class525.method8621(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3675 == 1339) {
                                method82(var10, var12, var13, var11);
                                class525.method8621(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3675 == 1400) {
                                Statics.field114.method7945(var12, var13, var10.field3662, var10.field3635, field833);
                            }
                            if (var10.field3675 == 1401) {
                                Statics.field114.method7869(var12, var13, var10.field3662, var10.field3635);
                            }
                            if (var10.field3675 == 1402) {
                                Statics.field1650.method2331(var12, field833);
                            }
                        }
                        if (var10.field3649 == 0) {
                            if (!var10.field3731 && method2957(var10) && Statics.field1682 != var10) {
                                continue;
                            }
                            if (!var10.field3731) {
                                if (var10.field3682 > var10.field3671 - var10.field3635) {
                                    var10.field3682 = var10.field3671 - var10.field3635;
                                }
                                if (var10.field3682 < 0) {
                                    var10.field3682 = 0;
                                }
                            }
                            method2919(arg0, var10.field3647, var25, var26, var27, var28, var12 - var10.field3668, var13 - var10.field3682, var11);
                            if (var10.field3784 != null) {
                                method2919(var10.field3784, var10.field3647, var25, var26, var27, var28, var12 - var10.field3668, var13 - var10.field3682, var11);
                            }
                            class87 var34 = (class87) field548.method8025((long) var10.field3647);
                            if (var34 != null) {
                                method693(var34.field1083, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class525.method8621(arg2, arg3, arg4, arg5);
                            class227.method4065();
                        } else if (var10.field3649 == 11) {
                            if (method2957(var10) && Statics.field1682 != var10) {
                                continue;
                            }
                            if (var10.field3784 != null) {
                                method2919(var10.field3784, var10.field3647, var25, var26, var27, var28, var12 - var10.field3668, var13 - var10.field3682, var11);
                            }
                            class525.method8621(arg2, arg3, arg4, arg5);
                            class227.method4065();
                        }
                        if (field758 || field751[var11] || field756 > 1) {
                            if (var10.field3649 == 0 && !var10.field3731 && var10.field3671 > var10.field3635) {
                                method3098(var10.field3662 + var12, var13, var10.field3682, var10.field3635, var10.field3671);
                            }
                            if (var10.field3649 != 1) {
                                if (var10.field3649 == 3) {
                                    int var35;
                                    if (method416(var10)) {
                                        var35 = var10.field3673;
                                        if (Statics.field1682 == var10 && var10.field3720 != 0) {
                                            var35 = var10.field3720;
                                        }
                                    } else {
                                        var35 = var10.field3672;
                                        if (Statics.field1682 == var10 && var10.field3676 != 0) {
                                            var35 = var10.field3676;
                                        }
                                    }
                                    if (var10.field3712) {
                                        switch(var10.field3677.field5193) {
                                            case 1:
                                                class525.method8613(var12, var13, var10.field3662, var10.field3635, var10.field3672, var10.field3673);
                                                break;
                                            case 2:
                                                class525.method8659(var12, var13, var10.field3662, var10.field3635, var10.field3672, var10.field3673, 255 - (var10.field3670 & 0xFF), 255 - (var10.field3679 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class525.method8612(var12, var13, var10.field3662, var10.field3635, var35);
                                                } else {
                                                    class525.method8611(var12, var13, var10.field3662, var10.field3635, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class525.method8616(var12, var13, var10.field3662, var10.field3635, var35);
                                    } else {
                                        class525.method8617(var12, var13, var10.field3662, var10.field3635, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3649 == 4) {
                                    class394 var36 = var10.method5849();
                                    if (var36 != null) {
                                        String var37 = var10.field3710;
                                        int var38;
                                        if (method416(var10)) {
                                            var38 = var10.field3673;
                                            if (Statics.field1682 == var10 && var10.field3720 != 0) {
                                                var38 = var10.field3720;
                                            }
                                            if (var10.field3627.length() > 0) {
                                                var37 = var10.field3627;
                                            }
                                        } else {
                                            var38 = var10.field3672;
                                            if (Statics.field1682 == var10 && var10.field3676 != 0) {
                                                var38 = var10.field3676;
                                            }
                                        }
                                        if (var10.field3731 && var10.field3780 != -1) {
                                            class207 var39 = class207.method3280(var10.field3780);
                                            var37 = var39.field2251;
                                            if (var37 == null) {
                                                var37 = class352.field4223;
                                            }
                                            if ((var39.field2246 == 1 || var10.field3781 != 1) && var10.field3781 != -1) {
                                                var37 = class102.method3915(16748608) + var37 + class102.field1342 + " " + 'x' + method4678(var10.field3781);
                                            }
                                        }
                                        if (field704 == var10) {
                                            var37 = class352.field4185;
                                            var38 = var10.field3672;
                                        }
                                        if (!var10.field3731) {
                                            var37 = method5008(var37, var10);
                                        }
                                        var36.method6848(var37, var12, var13, var10.field3662, var10.field3635, var38, var10.field3631 ? 0 : -1, class467.method7676(var10.field3670), var10.field3713, var10.field3772, var10.field3747);
                                    } else if (class332.field3645) {
                                        method3930(var10);
                                    }
                                } else if (var10.field3649 == 5) {
                                    if (var10.field3731) {
                                        class529 var41;
                                        if (var10.field3780 == -1) {
                                            var41 = var10.method5883(false, Statics.field4644);
                                        } else {
                                            var41 = class207.method9(var10.field3780, var10.field3781, var10.field3687, var10.field3688, var10.field3708, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5212;
                                            int var43 = var41.field5213;
                                            if (var10.field3686) {
                                                class525.method8657(var12, var13, var10.field3662 + var12, var10.field3635 + var13);
                                                int var44 = (var10.field3662 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3635 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3685 != 0) {
                                                            var41.method8743(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3685, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method8774(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method8764(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class525.method8621(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3662 * 4096 / var42;
                                                if (var10.field3685 != 0) {
                                                    var41.method8743(var10.field3662 / 2 + var12, var10.field3635 / 2 + var13, var10.field3685, var48);
                                                } else if (var14 != 0) {
                                                    var41.method8732(var12, var13, var10.field3662, var10.field3635, 256 - (var14 & 0xFF));
                                                } else if (var10.field3662 == var42 && var10.field3635 == var43) {
                                                    var41.method8774(var12, var13);
                                                } else {
                                                    var41.method8794(var12, var13, var10.field3662, var10.field3635);
                                                }
                                            }
                                        } else if (class332.field3645) {
                                            method3930(var10);
                                        }
                                    } else {
                                        class529 var40 = var10.method5883(method416(var10), Statics.field4644);
                                        if (var40 != null) {
                                            var40.method8774(var12, var13);
                                        } else if (class332.field3645) {
                                            method3930(var10);
                                        }
                                    }
                                } else if (var10.field3649 == 6) {
                                    boolean var49 = method416(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3771;
                                    } else {
                                        var50 = var10.field3695;
                                    }
                                    class240 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3780 != -1) {
                                        class207 var53 = class207.method3280(var10.field3780);
                                        if (var53 != null) {
                                            class207 var54 = var53.method3659(var10.field3781);
                                            var51 = var54.method3658(1);
                                            if (var51 == null) {
                                                method3930(var10);
                                            } else {
                                                var51.method4450();
                                                var52 = var51.field2638 / 2;
                                            }
                                        }
                                    } else if (var10.field3691 == 5) {
                                        if (var10.field3692 == 0) {
                                            var51 = field814.method5543((class209) null, -1, (class209) null, -1);
                                        } else {
                                            var51 = Statics.field2132.method1990();
                                        }
                                    } else if (var10.field3691 == 7) {
                                        var51 = var10.field3705.method5543((class209) null, -1, class209.method3394(Statics.field2132.field1204), Statics.field2132.field1198);
                                    } else {
                                        class196 var55 = null;
                                        class195 var56 = null;
                                        if (var10.field3691 == 6) {
                                            int var57 = var10.field3692;
                                            if (var57 >= 0 && var57 < field587.length) {
                                                class101 var58 = field587[var57];
                                                if (var58 != null) {
                                                    var55 = var58.field1327;
                                                    var56 = var58.method2476();
                                                }
                                            }
                                        }
                                        class209 var59 = null;
                                        int var60 = -1;
                                        if (var50 != -1) {
                                            var59 = class209.method3394(var50);
                                            var60 = var10.field3782;
                                        }
                                        var51 = var10.method5850(var59, var60, var49, Statics.field2132.field1129, var55, var56);
                                        if (var51 == null && class332.field3645) {
                                            method3930(var10);
                                        }
                                    }
                                    class227.method4125(var10.field3662 / 2 + var12, var10.field3635 / 2 + var13);
                                    int var61 = var10.field3702 * class227.field2535[var10.field3699] >> 16;
                                    int var62 = var10.field3702 * class227.field2533[var10.field3699] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3731) {
                                            var51.method4450();
                                            if (var10.field3723) {
                                                var51.method4469(0, var10.field3718, var10.field3766, var10.field3699, var10.field3697, var10.field3773 + var52 + var61, var10.field3773 + var62, var10.field3702);
                                            } else {
                                                var51.method4458(0, var10.field3718, var10.field3766, var10.field3699, var10.field3697, var10.field3773 + var52 + var61, var10.field3773 + var62);
                                            }
                                        } else {
                                            var51.method4458(0, var10.field3718, 0, var10.field3699, 0, var61, var62);
                                        }
                                    }
                                    class227.method4067();
                                } else {
                                    if (var10.field3649 == 8 && Statics.field3869 == var10 && field691 == field690) {
                                        int var63 = 0;
                                        int var64 = 0;
                                        class394 var65 = Statics.field1058;
                                        String var66 = var10.field3710;
                                        String var67 = method5008(var66, var10);
                                        while (var67.length() > 0) {
                                            int var68 = var67.indexOf(class102.field1341);
                                            String var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = "";
                                            } else {
                                                var69 = var67.substring(0, var68);
                                                var67 = var67.substring(var68 + 4);
                                            }
                                            int var70 = var65.method6838(var69);
                                            if (var70 > var63) {
                                                var63 = var70;
                                            }
                                            var64 += var65.field4484 + 1;
                                        }
                                        var63 += 6;
                                        var64 += 7;
                                        int var71 = var10.field3662 + var12 - 5 - var63;
                                        int var72 = var10.field3635 + var13 + 5;
                                        if (var71 < var12 + 5) {
                                            var71 = var12 + 5;
                                        }
                                        if (var63 + var71 > arg4) {
                                            var71 = arg4 - var63;
                                        }
                                        if (var64 + var72 > arg5) {
                                            var72 = arg5 - var64;
                                        }
                                        class525.method8612(var71, var72, var63, var64, 16777120);
                                        class525.method8616(var71, var72, var63, var64, 0);
                                        String var73 = var10.field3710;
                                        int var74 = var65.field4484 + var72 + 2;
                                        String var75 = method5008(var73, var10);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf(class102.field1341);
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            var65.method6925(var77, var71 + 3, var74, 0, -1);
                                            var74 += var65.field4484 + 1;
                                        }
                                    }
                                    if (var10.field3649 == 9) {
                                        int var78;
                                        int var79;
                                        int var80;
                                        int var81;
                                        if (var10.field3681) {
                                            var78 = var12;
                                            var79 = var10.field3635 + var13;
                                            var80 = var10.field3662 + var12;
                                            var81 = var13;
                                        } else {
                                            var78 = var12;
                                            var79 = var13;
                                            var80 = var10.field3662 + var12;
                                            var81 = var10.field3635 + var13;
                                        }
                                        if (var10.field3680 == 1) {
                                            class525.method8614(var78, var79, var80, var81, var10.field3672);
                                        } else {
                                            method6370(var78, var79, var80, var81, var10.field3672, var10.field3680);
                                        }
                                    } else if (var10.field3649 == 12) {
                                        class330 var82 = var10.method5988();
                                        class325 var83 = var10.method5872();
                                        if (var82 != null && var83 != null && var82.method5618()) {
                                            class394 var84 = var10.method5849();
                                            if (var84 != null) {
                                                field741.method8891(var12, var13, var10.field3662, var10.field3635, var82.method5619(), var82.method5742(), var82.method5616(), var82.method5617(), var82.method5666());
                                                int var85 = var10.field3631 ? var10.field3688 : -1;
                                                if (!var82.method5613() && var82.method5686().method6785()) {
                                                    field741.method8892(var83.field3550, var85, var83.field3548, var83.field3549);
                                                    field741.method8894(var82.method5611(), var84);
                                                } else {
                                                    field741.method8892(var10.field3672, var85, var83.field3548, var83.field3549);
                                                    field741.method8894(var82.method5686(), var84);
                                                }
                                                class525.method8621(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("on.lf(IIIIIIB)V")
    public static final void method6370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class525.field5187;
        int var18 = arg1 - class525.field5188;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class227.method4069(var19, var20, var21);
        class227.method4131(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class227.method4069(var19, var21, var22);
        class227.method4131(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("ko.lq(Ljava/lang/String;Lmi;B)Ljava/lang/String;")
    public static String method5008(String arg0, class332 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + Statics.method3249(method2775(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("jx.lh(IB)Ljava/lang/String;")
    public static final String method4678(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class102.field1339 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class102.method3915(65408) + var1.substring(0, var1.length() - 8) + class352.field3982 + " " + class102.field1335 + var1 + class102.field1337 + class102.field1342;
        } else if (var1.length() > 6) {
            return " " + class102.method3915(16777215) + var1.substring(0, var1.length() - 4) + class352.field4090 + " " + class102.field1335 + var1 + class102.field1337 + class102.field1342;
        } else {
            return " " + class102.method3915(16776960) + var1 + class102.field1342;
        }
    }

    @ObfuscatedName("client.li(ZI)V")
    public final void method1207(boolean arg0) {
        int var2 = field699;
        int var3 = Statics.field1450;
        int var4 = Statics.field1890;
        if (class332.method6373(var2)) {
            method829(Statics.field3229[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ll(Lmi;I)V")
    public void method1208(class332 arg0) {
        class332 var2 = arg0.field3666 == -1 ? null : class332.method2255(arg0.field3666);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field1450;
            var4 = Statics.field1890;
        } else {
            var3 = var2.field3662;
            var4 = var2.field3635;
        }
        method6348(arg0, var3, var4, false);
        method4745(arg0, var3, var4);
    }

    @ObfuscatedName("cy.lb([Lmi;Lmi;ZI)V")
    public static void method2001(class332[] arg0, class332 arg1, boolean arg2) {
        int var3 = arg1.field3738 == 0 ? arg1.field3662 : arg1.field3738;
        int var4 = arg1.field3671 == 0 ? arg1.field3635 : arg1.field3671;
        method829(arg0, arg1.field3647, var3, var4, arg2);
        if (arg1.field3784 != null) {
            method829(arg1.field3784, arg1.field3647, var3, var4, arg2);
        }
        class87 var5 = (class87) field548.method8025((long) arg1.field3647);
        if (var5 != null) {
            int var6 = var5.field1083;
            if (class332.method6373(var6)) {
                method829(Statics.field3229[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field3675 == 1337) {
        }
    }

    @ObfuscatedName("bb.md([Lmi;IIIZI)V")
    public static void method829(class332[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class332 var6 = arg0[var5];
            if (var6 != null && var6.field3666 == arg1) {
                method6348(var6, arg2, arg3, arg4);
                method4745(var6, arg2, arg3);
                if (var6.field3668 > var6.field3738 - var6.field3662) {
                    var6.field3668 = var6.field3738 - var6.field3662;
                }
                if (var6.field3668 < 0) {
                    var6.field3668 = 0;
                }
                if (var6.field3682 > var6.field3671 - var6.field3635) {
                    var6.field3682 = var6.field3671 - var6.field3635;
                }
                if (var6.field3682 < 0) {
                    var6.field3682 = 0;
                }
                if (var6.field3649 == 0) {
                    method2001(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("od.mh(Lmi;IIZI)V")
    public static void method6348(class332 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3662;
        int var5 = arg0.field3635;
        if (arg0.field3654 == 0) {
            arg0.field3662 = arg0.field3658;
        } else if (arg0.field3654 == 1) {
            arg0.field3662 = arg1 - arg0.field3658;
        } else if (arg0.field3654 == 2) {
            arg0.field3662 = arg0.field3658 * arg1 >> 14;
        }
        if (arg0.field3655 == 0) {
            arg0.field3635 = arg0.field3659;
        } else if (arg0.field3655 == 1) {
            arg0.field3635 = arg2 - arg0.field3659;
        } else if (arg0.field3655 == 2) {
            arg0.field3635 = arg0.field3659 * arg2 >> 14;
        }
        if (arg0.field3654 == 4) {
            arg0.field3662 = arg0.field3767 * arg0.field3635 / arg0.field3665;
        }
        if (arg0.field3655 == 4) {
            arg0.field3635 = arg0.field3665 * arg0.field3662 / arg0.field3767;
        }
        if (arg0.field3675 == 1337) {
            field822 = arg0;
        }
        if (arg0.field3649 == 12) {
            arg0.method5988().method5567(arg0.field3662, arg0.field3635);
        }
        if (arg3 && arg0.field3639 != null && (arg0.field3662 != var4 || arg0.field3635 != var5)) {
            class88 var6 = new class88();
            var6.field1084 = arg0;
            var6.field1087 = arg0.field3639;
            field742.method6405(var6);
        }
    }

    @ObfuscatedName("jf.mv(Lmi;IIB)V")
    public static void method4745(class332 arg0, int arg1, int arg2) {
        if (arg0.field3652 == 0) {
            arg0.field3648 = arg0.field3656;
        } else if (arg0.field3652 == 1) {
            arg0.field3648 = (arg1 - arg0.field3662) / 2 + arg0.field3656;
        } else if (arg0.field3652 == 2) {
            arg0.field3648 = arg1 - arg0.field3662 - arg0.field3656;
        } else if (arg0.field3652 == 3) {
            arg0.field3648 = arg0.field3656 * arg1 >> 14;
        } else if (arg0.field3652 == 4) {
            arg0.field3648 = (arg0.field3656 * arg1 >> 14) + (arg1 - arg0.field3662) / 2;
        } else {
            arg0.field3648 = arg1 - arg0.field3662 - (arg0.field3656 * arg1 >> 14);
        }
        if (arg0.field3653 == 0) {
            arg0.field3661 = arg0.field3657;
        } else if (arg0.field3653 == 1) {
            arg0.field3661 = (arg2 - arg0.field3635) / 2 + arg0.field3657;
        } else if (arg0.field3653 == 2) {
            arg0.field3661 = arg2 - arg0.field3635 - arg0.field3657;
        } else if (arg0.field3653 == 3) {
            arg0.field3661 = arg0.field3657 * arg2 >> 14;
        } else if (arg0.field3653 == 4) {
            arg0.field3661 = (arg0.field3657 * arg2 >> 14) + (arg2 - arg0.field3635) / 2;
        } else {
            arg0.field3661 = arg2 - arg0.field3635 - (arg0.field3657 * arg2 >> 14);
        }
    }

    @ObfuscatedName("pm.mg(Lmi;IIIIIIB)V")
    public static final void method6997(class332 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field612) {
            field731 = 32;
        } else {
            field731 = 0;
        }
        field612 = false;
        if (class36.field241 == 1 || !Statics.field1924 && class36.field241 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3682 -= 4;
                method3930(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3682 += 4;
                method3930(arg0);
            } else if (arg5 >= arg1 - field731 && arg5 < field731 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3682 = (arg4 - arg3) * var8 / var9;
                method3930(arg0);
                field612 = true;
            }
        }
        if (field740 == 0) {
            return;
        }
        int var10 = arg0.field3662;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3682 += field740 * 45;
            method3930(arg0);
        }
    }

    @ObfuscatedName("gl.mq(IIIIII)V")
    public static final void method3098(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field525[0].method8705(arg0, arg1);
        Statics.field525[1].method8705(arg0, arg1 + arg3 - 16);
        class525.method8612(arg0, arg1 + 16, 16, arg3 - 32, field608);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class525.method8612(arg0, arg1 + 16 + var6, 16, var5, field719);
        class525.method8620(arg0, arg1 + 16 + var6, var5, field799);
        class525.method8620(arg0 + 1, arg1 + 16 + var6, var5, field799);
        class525.method8645(arg0, arg1 + 16 + var6, 16, field799);
        class525.method8645(arg0, arg1 + 17 + var6, 16, field799);
        class525.method8620(arg0 + 15, arg1 + 16 + var6, var5, field610);
        class525.method8620(arg0 + 14, arg1 + 17 + var6, var5 - 1, field610);
        class525.method8645(arg0, arg1 + 15 + var6 + var5, 16, field610);
        class525.method8645(arg0 + 1, arg1 + 14 + var6 + var5, 15, field610);
    }

    @ObfuscatedName("bj.mk(Lmi;B)Z")
    public static final boolean method416(class332 arg0) {
        if (arg0.field3787 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3787.length; var1++) {
            int var2 = method2775(arg0, var1);
            int var3 = arg0.field3774[var1];
            if (arg0.field3787[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3787[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3787[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("em.mr(Lmi;IB)I")
    public static final int method2775(class332 arg0, int arg1) {
        if (arg0.field3714 == null || arg1 >= arg0.field3714.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3714[arg1];
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
                    var7 = field671[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field821[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field824[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class332 var11 = class332.method2255(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class207.method3280(var12).field2238 || field554)) {
                        for (int var13 = 0; var13 < var11.field3778.length; var13++) {
                            if (var12 + 1 == var11.field3778[var13]) {
                                var7 += var11.field3779[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class322.field3540[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class342.field3852[field821[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class322.field3540[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2132.field1134;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class342.field3849[var14]) {
                            var7 += field821[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class332 var17 = class332.method2255(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class207.method3280(var18).field2238 || field554)) {
                        for (int var19 = 0; var19 < var17.field3778.length; var19++) {
                            if (var18 + 1 == var17.field3778[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field644;
                }
                if (var6 == 12) {
                    var7 = field815;
                }
                if (var6 == 13) {
                    int var20 = class322.field3540[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class322.method2448(var22);
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
                    var7 = (Statics.field2132.field1228 >> 7) + Statics.field1448;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2132.field1199 >> 7) + Statics.field354;
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

    @ObfuscatedName("fu.me(Lmi;B)V")
    public static final void method2960(class332 arg0) {
        if (arg0.field3650 == 1) {
            String var1 = arg0.field3700;
            int var2 = arg0.field3647;
            int var3 = arg0.field3780;
            method2749(var1, "", 24, 0, 0, var2, var3, false);
        }
        if (arg0.field3650 == 2 && !field619) {
            String var4 = method5211(arg0);
            if (var4 != null) {
                String var5 = class102.method3915(65280) + arg0.field3759;
                int var6 = arg0.field3647;
                int var7 = arg0.field3780;
                method2749(var4, var5, 25, 0, -1, var6, var7, false);
            }
        }
        if (arg0.field3650 == 3) {
            method6575(class352.field4158, "", 26, 0, 0, arg0.field3647);
        }
        if (arg0.field3650 == 4) {
            method6575(arg0.field3700, "", 28, 0, 0, arg0.field3647);
        }
        if (arg0.field3650 == 5) {
            method6575(arg0.field3700, "", 29, 0, 0, arg0.field3647);
        }
        if (arg0.field3650 == 6 && field704 == null) {
            method6575(arg0.field3700, "", 30, 0, -1, arg0.field3647);
        }
        if (!arg0.field3731) {
            return;
        }
        if (field619) {
            int var8 = method3401(arg0);
            boolean var9 = (var8 >> 21 & 0x1) != 0;
            if (var9 && (Statics.field117 & 0x20) == 32) {
                String var10 = field710;
                String var11 = field721 + " " + class102.field1340 + " " + arg0.field3651;
                int var12 = arg0.field3770;
                int var13 = arg0.field3647;
                int var14 = arg0.field3780;
                method2749(var10, var11, 58, 0, var12, var13, var14, false);
            }
            return;
        }
        for (int var15 = 9; var15 >= 5; var15--) {
            int var16 = method3401(arg0);
            boolean var17 = (var16 >> var15 + 1 & 0x1) != 0;
            String var18;
            if (!var17 && arg0.field3754 == null) {
                var18 = null;
            } else if (arg0.field3728 == null || arg0.field3728.length <= var15 || arg0.field3728[var15] == null || arg0.field3728[var15].trim().length() == 0) {
                var18 = null;
            } else {
                var18 = arg0.field3728[var15];
            }
            if (var18 != null) {
                String var20 = arg0.field3651;
                int var21 = var15 + 1;
                int var22 = arg0.field3770;
                int var23 = arg0.field3647;
                int var24 = arg0.field3780;
                method2749(var18, var20, 1007, var21, var22, var23, var24, false);
            }
        }
        String var25 = method5211(arg0);
        if (var25 != null) {
            String var26 = arg0.field3651;
            int var27 = arg0.field3770;
            int var28 = arg0.field3647;
            int var29 = arg0.field3780;
            method2749(var25, var26, 25, 0, var27, var28, var29, false);
        }
        for (int var30 = 4; var30 >= 0; var30--) {
            int var31 = method3401(arg0);
            boolean var32 = (var31 >> var30 + 1 & 0x1) != 0;
            String var33;
            if (!var32 && arg0.field3754 == null) {
                var33 = null;
            } else if (arg0.field3728 == null || arg0.field3728.length <= var30 || arg0.field3728[var30] == null || arg0.field3728[var30].trim().length() == 0) {
                var33 = null;
            } else {
                var33 = arg0.field3728[var30];
            }
            if (var33 != null) {
                method2749(var33, arg0.field3651, 57, var30 + 1, arg0.field3770, arg0.field3647, arg0.field3780, arg0.field3796);
            }
        }
        int var35 = method3401(arg0);
        boolean var36 = (var35 & 0x1) != 0;
        if (var36) {
            method6575(class352.field3919, "", 30, 0, arg0.field3770, arg0.field3647);
        }
    }

    @ObfuscatedName("ar.mz(ZB)V")
    public static void method168(boolean arg0) {
        field660 = arg0;
    }

    @ObfuscatedName("bt.mc(B)Z")
    public static boolean method445() {
        return field660;
    }

    @ObfuscatedName("db.mf(IIIIIIII)V")
    public static final void method2309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class332.method6373(arg0)) {
            method68(Statics.field3229[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("af.ml([Lmi;IIIIIIIB)V")
    public static final void method68(class332[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class332 var9 = arg0[var8];
            if (var9 != null && var9.field3666 == arg1 && (var9.method5853() || method3401(var9) != 0 || field730 == var9)) {
                if (var9.field3731) {
                    if (method2957(var9)) {
                        continue;
                    }
                } else if (var9.field3649 == 0 && Statics.field1682 != var9 && method2957(var9)) {
                    continue;
                }
                if (var9.field3649 == 11) {
                    if (var9.method5910(Statics.field4644)) {
                        if (var9.method5930()) {
                            method3930(var9);
                            method2001(var9.field3784, var9, true);
                        }
                        if (var9.field3715 != null) {
                            class88 var10 = new class88();
                            var10.field1084 = var9;
                            var10.field1087 = var9.field3715;
                            field742.method6405(var10);
                        }
                    }
                } else if (var9.field3649 == 12 && var9.method5876()) {
                    method3930(var9);
                }
                int var11 = var9.field3648 + arg6;
                int var12 = var9.field3661 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3649 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3662 + var11;
                    int var16 = var9.field3635 + var12;
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
                    int var23 = var9.field3662 + var11;
                    int var24 = var9.field3635 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field711 == var9) {
                    field763 = true;
                    field565 = var11;
                    field637 = var12;
                }
                boolean var25 = false;
                if (var9.field3722) {
                    switch(field541) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3647 >>> 16 == field702) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field702 == var9.field3647) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3731 || var19 < var21 && var20 < var22) {
                    if (var9.field3731) {
                        if (var9.field3794) {
                            if (class36.field255 >= var19 && class36.field233 >= var20 && class36.field255 < var21 && class36.field233 < var22) {
                                for (class88 var26 = (class88) field742.method6393(); var26 != null; var26 = (class88) field742.method6395()) {
                                    if (var26.field1096) {
                                        var26.method7700();
                                        var26.field1084.field3669 = false;
                                    }
                                }
                                method8162();
                                if (Statics.field1778 == 0) {
                                    field711 = null;
                                    field730 = null;
                                }
                                if (!field640) {
                                    method6057();
                                }
                            }
                        } else if (var9.field3795 && class36.field255 >= var19 && class36.field233 >= var20 && class36.field255 < var21 && class36.field233 < var22) {
                            for (class88 var27 = (class88) field742.method6393(); var27 != null; var27 = (class88) field742.method6395()) {
                                if (var27.field1096 && var27.field1084.field3674 == var27.field1087) {
                                    var27.method7700();
                                }
                            }
                        }
                    }
                    int var28 = class36.field255;
                    int var29 = class36.field233;
                    if (class36.field249 != 0) {
                        var28 = class36.field250;
                        var29 = class36.field251;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3675 == 1337) {
                        if (!field540 && !field640 && var30) {
                            method2916(var28, var29, var19, var20);
                        }
                    } else if (var9.field3675 == 1338) {
                        method6056(var9, var11, var12);
                    } else {
                        if (var9.field3675 == 1400) {
                            Statics.field114.method7884(class36.field255, class36.field233, var30, var11, var12, var9.field3662, var9.field3635);
                        }
                        if (!field640 && var30) {
                            if (var9.field3675 == 1400) {
                                Statics.field114.method7829(var11, var12, var9.field3662, var9.field3635, var28, var29);
                            } else {
                                method2960(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3698.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3698[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3698[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3793 != null) {
                                            var35 = field675.method3811(var9.field3698[var31][var34]);
                                        }
                                        if (method6964(var9.field3698[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3793 != null && var9.field3793[var31] > field833) {
                                                break;
                                            }
                                            byte var36 = var9.field3797[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field675.method3811(86) && !field675.method3811(82) && !field675.method3811(81)) && ((var36 & 0x2) == 0 || field675.method3811(86)) && ((var36 & 0x1) == 0 || field675.method3811(82)) && ((var36 & 0x4) == 0 || field675.method3811(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method875(var31 + 1, var9.field3647, var9.field3770, var9.field3780, "");
                                    } else if (var31 == 10) {
                                        Statics.method3283();
                                        method6036(var9.field3647, var9.field3770, class333.method3374(method3401(var9)), var9.field3780);
                                        field710 = method5211(var9);
                                        if (field710 == null) {
                                            field710 = class352.field4223;
                                        }
                                        field721 = var9.field3651 + class102.method3915(16777215);
                                    }
                                    int var37 = var9.field3725[var31];
                                    if (var9.field3793 == null) {
                                        var9.field3793 = new int[var9.field3698.length];
                                    }
                                    if (var9.field3726 == null) {
                                        var9.field3726 = new int[var9.field3698.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3793[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3793[var31] == 0) {
                                        var9.field3793[var31] = field833 + var37 + var9.field3726[var31];
                                    } else {
                                        var9.field3793[var31] = field833 + var37;
                                    }
                                }
                                if (!var32 && var9.field3793 != null) {
                                    var9.field3793[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3731) {
                            boolean var38;
                            if (class36.field255 >= var19 && class36.field233 >= var20 && class36.field255 < var21 && class36.field233 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field241 == 1 || !Statics.field1924 && class36.field241 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field249 == 1 || !Statics.field1924 && class36.field249 == 4) && class36.field250 >= var19 && class36.field251 >= var20 && class36.field250 < var21 && class36.field251 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method4154(var9, class36.field250 - var11, class36.field251 - var12);
                            }
                            if (var9.method5854()) {
                                if (var40) {
                                    field781.method6405(new class212(0, class36.field255 - var11, class36.field233 - var12, var9));
                                }
                                if (var39) {
                                    field781.method6405(new class212(1, class36.field255 - var11, class36.field233 - var12, var9));
                                }
                            }
                            if (var9.field3675 == 1400) {
                                Statics.field114.method7778(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field711 != null && field711 != var9 && var38 && class333.method4438(method3401(var9))) {
                                field715 = var9;
                            }
                            if (field730 == var9) {
                                field716 = true;
                                field717 = var11;
                                field718 = var12;
                            }
                            if (var9.field3734) {
                                if (var38 && field740 != 0 && var9.field3674 != null) {
                                    class88 var41 = new class88();
                                    var41.field1096 = true;
                                    var41.field1084 = var9;
                                    var41.field1088 = field740;
                                    var41.field1087 = var9.field3674;
                                    field742.method6405(var41);
                                }
                                if (field711 != null || field640) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3786 && var40) {
                                    var9.field3786 = true;
                                    if (var9.field3701 != null) {
                                        class88 var42 = new class88();
                                        var42.field1096 = true;
                                        var42.field1084 = var9;
                                        var42.field1085 = class36.field250 - var11;
                                        var42.field1088 = class36.field251 - var12;
                                        var42.field1087 = var9.field3701;
                                        field742.method6405(var42);
                                    }
                                }
                                if (var9.field3786 && var39 && var9.field3644 != null) {
                                    class88 var43 = new class88();
                                    var43.field1096 = true;
                                    var43.field1084 = var9;
                                    var43.field1085 = class36.field255 - var11;
                                    var43.field1088 = class36.field233 - var12;
                                    var43.field1087 = var9.field3644;
                                    field742.method6405(var43);
                                }
                                if (var9.field3786 && !var39) {
                                    var9.field3786 = false;
                                    if (var9.field3736 != null) {
                                        class88 var44 = new class88();
                                        var44.field1096 = true;
                                        var44.field1084 = var9;
                                        var44.field1085 = class36.field255 - var11;
                                        var44.field1088 = class36.field233 - var12;
                                        var44.field1087 = var9.field3736;
                                        field744.method6405(var44);
                                    }
                                }
                                if (var39 && var9.field3739 != null) {
                                    class88 var45 = new class88();
                                    var45.field1096 = true;
                                    var45.field1084 = var9;
                                    var45.field1085 = class36.field255 - var11;
                                    var45.field1088 = class36.field233 - var12;
                                    var45.field1087 = var9.field3739;
                                    field742.method6405(var45);
                                }
                                if (!var9.field3669 && var38) {
                                    var9.field3669 = true;
                                    if (var9.field3740 != null) {
                                        class88 var46 = new class88();
                                        var46.field1096 = true;
                                        var46.field1084 = var9;
                                        var46.field1085 = class36.field255 - var11;
                                        var46.field1088 = class36.field233 - var12;
                                        var46.field1087 = var9.field3740;
                                        field742.method6405(var46);
                                    }
                                }
                                if (var9.field3669 && var38 && var9.field3741 != null) {
                                    class88 var47 = new class88();
                                    var47.field1096 = true;
                                    var47.field1084 = var9;
                                    var47.field1085 = class36.field255 - var11;
                                    var47.field1088 = class36.field233 - var12;
                                    var47.field1087 = var9.field3741;
                                    field742.method6405(var47);
                                }
                                if (var9.field3669 && !var38) {
                                    var9.field3669 = false;
                                    if (var9.field3711 != null) {
                                        class88 var48 = new class88();
                                        var48.field1096 = true;
                                        var48.field1084 = var9;
                                        var48.field1085 = class36.field255 - var11;
                                        var48.field1088 = class36.field233 - var12;
                                        var48.field1087 = var9.field3711;
                                        field744.method6405(var48);
                                    }
                                }
                                if (var9.field3638 != null) {
                                    class88 var49 = new class88();
                                    var49.field1084 = var9;
                                    var49.field1087 = var9.field3638;
                                    field728.method6405(var49);
                                }
                                if (var9.field3717 != null && field725 > var9.field3788) {
                                    if (var9.field3748 == null || field725 - var9.field3788 > 32) {
                                        class88 var54 = new class88();
                                        var54.field1084 = var9;
                                        var54.field1087 = var9.field3717;
                                        field742.method6405(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3788; var50 < field725; var50++) {
                                            int var51 = field724[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3748.length; var52++) {
                                                if (var9.field3748[var52] == var51) {
                                                    class88 var53 = new class88();
                                                    var53.field1084 = var9;
                                                    var53.field1087 = var9.field3717;
                                                    field742.method6405(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3788 = field725;
                                }
                                if (var9.field3749 != null && field727 > var9.field3789) {
                                    if (var9.field3678 == null || field727 - var9.field3789 > 32) {
                                        class88 var59 = new class88();
                                        var59.field1084 = var9;
                                        var59.field1087 = var9.field3749;
                                        field742.method6405(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3789; var55 < field727; var55++) {
                                            int var56 = field726[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3678.length; var57++) {
                                                if (var9.field3678[var57] == var56) {
                                                    class88 var58 = new class88();
                                                    var58.field1084 = var9;
                                                    var58.field1087 = var9.field3749;
                                                    field742.method6405(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3789 = field727;
                                }
                                if (var9.field3751 != null && field729 > var9.field3790) {
                                    if (var9.field3752 == null || field729 - var9.field3790 > 32) {
                                        class88 var64 = new class88();
                                        var64.field1084 = var9;
                                        var64.field1087 = var9.field3751;
                                        field742.method6405(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3790; var60 < field729; var60++) {
                                            int var61 = field651[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3752.length; var62++) {
                                                if (var9.field3752[var62] == var61) {
                                                    class88 var63 = new class88();
                                                    var63.field1084 = var9;
                                                    var63.field1087 = var9.field3751;
                                                    field742.method6405(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3790 = field729;
                                }
                                if (field732 > var9.field3719 && var9.field3634 != null) {
                                    class88 var65 = new class88();
                                    var65.field1084 = var9;
                                    var65.field1087 = var9.field3634;
                                    field742.method6405(var65);
                                }
                                if (field733 > var9.field3719 && var9.field3706 != null) {
                                    class88 var66 = new class88();
                                    var66.field1084 = var9;
                                    var66.field1087 = var9.field3706;
                                    field742.method6405(var66);
                                }
                                if (field734 > var9.field3719 && var9.field3762 != null) {
                                    class88 var67 = new class88();
                                    var67.field1084 = var9;
                                    var67.field1087 = var9.field3762;
                                    field742.method6405(var67);
                                }
                                if (field735 > var9.field3719 && var9.field3763 != null) {
                                    class88 var68 = new class88();
                                    var68.field1084 = var9;
                                    var68.field1087 = var9.field3763;
                                    field742.method6405(var68);
                                }
                                if (field736 > var9.field3719 && var9.field3764 != null) {
                                    class88 var69 = new class88();
                                    var69.field1084 = var9;
                                    var69.field1087 = var9.field3764;
                                    field742.method6405(var69);
                                }
                                if (field737 > var9.field3719 && var9.field3769 != null) {
                                    class88 var70 = new class88();
                                    var70.field1084 = var9;
                                    var70.field1087 = var9.field3769;
                                    field742.method6405(var70);
                                }
                                if (field598 > var9.field3719 && var9.field3785 != null) {
                                    class88 var71 = new class88();
                                    var71.field1084 = var9;
                                    var71.field1087 = var9.field3785;
                                    field742.method6405(var71);
                                }
                                if (field579 > var9.field3719 && var9.field3765 != null) {
                                    class88 var72 = new class88();
                                    var72.field1084 = var9;
                                    var72.field1087 = var9.field3765;
                                    field742.method6405(var72);
                                }
                                var9.field3719 = field529;
                                if (var9.field3758 != null) {
                                    for (int var73 = 0; var73 < field767; var73++) {
                                        class88 var74 = new class88();
                                        var74.field1084 = var9;
                                        var74.field1086 = field769[var73];
                                        var74.field1092 = field768[var73];
                                        var74.field1087 = var9.field3758;
                                        field742.method6405(var74);
                                    }
                                }
                                if (var9.field3768 != null) {
                                    int[] var75 = field675.method3807();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class88 var77 = new class88();
                                        var77.field1084 = var9;
                                        var77.field1086 = var75[var76];
                                        var77.field1087 = var9.field3768;
                                        field742.method6405(var77);
                                    }
                                }
                                if (var9.field3724 != null) {
                                    int[] var78 = field675.method3808();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class88 var80 = new class88();
                                        var80.field1084 = var9;
                                        var80.field1086 = var78[var79];
                                        var80.field1087 = var9.field3724;
                                        field742.method6405(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3731) {
                            if (field711 != null || field640) {
                                continue;
                            }
                            if ((var9.field3775 >= 0 || var9.field3676 != 0) && class36.field255 >= var19 && class36.field233 >= var20 && class36.field255 < var21 && class36.field233 < var22) {
                                if (var9.field3775 >= 0) {
                                    Statics.field1682 = arg0[var9.field3775];
                                } else {
                                    Statics.field1682 = var9;
                                }
                            }
                            if (var9.field3649 == 8 && class36.field255 >= var19 && class36.field233 >= var20 && class36.field255 < var21 && class36.field233 < var22) {
                                Statics.field3869 = var9;
                            }
                            if (var9.field3671 > var9.field3635) {
                                method6997(var9, var9.field3662 + var11, var12, var9.field3635, var9.field3671, class36.field255, class36.field233);
                            }
                        }
                        if (var9.field3649 == 0) {
                            method68(arg0, var9.field3647, var19, var20, var21, var22, var11 - var9.field3668, var12 - var9.field3682);
                            if (var9.field3784 != null) {
                                method68(var9.field3784, var9.field3647, var19, var20, var21, var22, var11 - var9.field3668, var12 - var9.field3682);
                            }
                            class87 var81 = (class87) field548.method8025((long) var9.field3647);
                            if (var81 != null) {
                                if (var81.field1081 == 0 && class36.field255 >= var19 && class36.field233 >= var20 && class36.field255 < var21 && class36.field233 < var22 && !field640) {
                                    for (class88 var82 = (class88) field742.method6393(); var82 != null; var82 = (class88) field742.method6395()) {
                                        if (var82.field1096) {
                                            var82.method7700();
                                            var82.field1084.field3669 = false;
                                        }
                                    }
                                    if (Statics.field1778 == 0) {
                                        field711 = null;
                                        field730 = null;
                                    }
                                    if (!field640) {
                                        method6057();
                                    }
                                }
                                method2309(var81.field1083, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("pl.mj(IB)Z")
    public static boolean method6964(int arg0) {
        for (int var1 = 0; var1 < field767; var1++) {
            if (field769[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ov.mw(III)V")
    public static final void method6574(int arg0, int arg1) {
        if (class332.method6373(arg0)) {
            method3829(Statics.field3229[arg0], arg1);
        }
    }

    @ObfuscatedName("iz.mp([Lmi;IB)V")
    public static final void method3829(class332[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class332 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3649 == 0) {
                    if (var3.field3784 != null) {
                        method3829(var3.field3784, arg1);
                    }
                    class87 var4 = (class87) field548.method8025((long) var3.field3647);
                    if (var4 != null) {
                        method6574(var4.field1083, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3696 != null) {
                    class88 var5 = new class88();
                    var5.field1084 = var3;
                    var5.field1087 = var3.field3696;
                    class71.method5065(var5);
                }
                if (arg1 == 1 && var3.field3729 != null) {
                    if (var3.field3770 >= 0) {
                        class332 var6 = class332.method2255(var3.field3647);
                        if (var6 == null || var6.field3784 == null || var3.field3770 >= var6.field3784.length || var6.field3784[var3.field3770] != var3) {
                            continue;
                        }
                    }
                    class88 var7 = new class88();
                    var7.field1084 = var3;
                    var7.field1087 = var3.field3729;
                    class71.method5065(var7);
                }
            }
        }
    }

    @ObfuscatedName("im.mt(Lmi;III)V")
    public static final void method4154(class332 arg0, int arg1, int arg2) {
        if (field711 != null || field640 || arg0 == null || method4680(arg0) == null) {
            return;
        }
        field711 = arg0;
        field730 = method4680(arg0);
        field713 = arg1;
        field786 = arg2;
        Statics.field1778 = 0;
        field722 = false;
        int var3 = field676 - 1;
        if (var3 == -1) {
            return;
        }
        Statics.field40 = new class74();
        Statics.field40.field918 = field677[var3];
        Statics.field40.field921 = field678[var3];
        Statics.field40.field919 = field720[var3];
        Statics.field40.field920 = field680[var3];
        Statics.field40.field917 = field681[var3];
        Statics.field40.field922 = field682[var3];
        Statics.field40.field923 = field802[var3];
    }

    @ObfuscatedName("client.mb(I)V")
    public final void method1209() {
        method3930(field711);
        Statics.field1778++;
        if (field763 && field716) {
            int var1 = class36.field255;
            int var2 = class36.field233;
            int var3 = var1 - field713;
            int var4 = var2 - field786;
            if (var3 < field717) {
                var3 = field717;
            }
            if (field711.field3662 + var3 > field717 + field730.field3662) {
                var3 = field717 + field730.field3662 - field711.field3662;
            }
            if (var4 < field718) {
                var4 = field718;
            }
            if (field711.field3635 + var4 > field718 + field730.field3635) {
                var4 = field718 + field730.field3635 - field711.field3635;
            }
            int var5 = var3 - field565;
            int var6 = var4 - field637;
            int var7 = field711.field3660;
            if (Statics.field1778 > field711.field3704 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field722 = true;
            }
            int var8 = field730.field3668 + (var3 - field717);
            int var9 = field730.field3682 + (var4 - field718);
            if (field711.field3743 != null && field722) {
                class88 var10 = new class88();
                var10.field1084 = field711;
                var10.field1085 = var8;
                var10.field1088 = var9;
                var10.field1087 = field711.field3743;
                class71.method5065(var10);
            }
            if (class36.field241 == 0) {
                if (field722) {
                    if (field711.field3744 != null) {
                        class88 var11 = new class88();
                        var11.field1084 = field711;
                        var11.field1085 = var8;
                        var11.field1088 = var9;
                        var11.field1090 = field715;
                        var11.field1087 = field711.field3744;
                        class71.method5065(var11);
                    }
                    if (field715 != null && method2791(field711) != null) {
                        class297 var12 = class297.method1166(class295.field3138, field592.field1429);
                        var12.field3227.method8353(field711.field3647);
                        var12.field3227.method8312(field715.field3647);
                        var12.field3227.method8345(field711.field3770);
                        var12.field3227.method8345(field715.field3780);
                        var12.field3227.method8455(field715.field3770);
                        var12.field3227.method8455(field711.field3780);
                        field592.method2665(var12);
                    }
                } else if (this.method1205()) {
                    this.method1206(field713 + field565, field786 + field637);
                } else if (field676 > 0) {
                    method1716(field713 + field565, field786 + field637);
                }
                field711 = null;
            }
        } else if (Statics.field1778 > 1) {
            if (!field722 && field676 > 0) {
                int var13 = field713 + field565;
                int var14 = field786 + field637;
                class74 var15 = Statics.field40;
                if (var15 != null) {
                    method7193(var15.field918, var15.field921, var15.field919, var15.field920, var15.field917, var15.field922, var15.field923, var13, var14);
                }
                Statics.field40 = null;
            }
            field711 = null;
        }
    }

    @ObfuscatedName("client.mm(IIB)V")
    public static void method1716(int arg0, int arg1) {
        class74 var2 = Statics.field40;
        if (var2 != null) {
            method7193(var2.field918, var2.field921, var2.field919, var2.field920, var2.field917, var2.field922, var2.field923, arg0, arg1);
        }
        Statics.field40 = null;
    }

    @ObfuscatedName("ih.mi(Lmi;I)V")
    public static void method3930(class332 arg0) {
        if (arg0 != null && field748 == arg0.field3792) {
            field537[arg0.field3791] = true;
        }
    }

    @ObfuscatedName("ez.mn(I)V")
    public static void method2718() {
        for (class87 var0 = (class87) field548.method8027(); var0 != null; var0 = (class87) field548.method8028()) {
            int var1 = var0.field1083;
            if (class332.method6373(var1)) {
                boolean var2 = true;
                class332[] var3 = Statics.field3229[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3731;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4814;
                    class332 var6 = class332.method2255(var5);
                    if (var6 != null) {
                        method3930(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("jb.mx(Lmi;I)Lmi;")
    public static class332 method4680(class332 arg0) {
        class332 var1 = method2791(arg0);
        if (var1 == null) {
            var1 = arg0.field3750;
        }
        return var1;
    }

    @ObfuscatedName("ah.my(II)V")
    public static final void method286(int arg0) {
        if (!class332.method6373(arg0)) {
            return;
        }
        class332[] var1 = Statics.field3229[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class332 var3 = var1[var2];
            if (var3 != null) {
                var3.field3782 = 0;
                var3.field3783 = 0;
            }
        }
    }

    @ObfuscatedName("mq.ma(II)V")
    public static final void method5470(int arg0) {
        if (class332.method6373(arg0)) {
            method2981(Statics.field3229[arg0], -1);
        }
    }

    @ObfuscatedName("fy.mo([Lmi;II)V")
    public static final void method2981(class332[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class332 var3 = arg0[var2];
            if (var3 != null && var3.field3666 == arg1 && (!var3.field3731 || !method2957(var3))) {
                if (var3.field3649 == 0) {
                    if (!var3.field3731 && method2957(var3) && Statics.field1682 != var3) {
                        continue;
                    }
                    method2981(arg0, var3.field3647);
                    if (var3.field3784 != null) {
                        method2981(var3.field3784, var3.field3647);
                    }
                    class87 var4 = (class87) field548.method8025((long) var3.field3647);
                    if (var4 != null) {
                        int var5 = var4.field1083;
                        if (class332.method6373(var5)) {
                            method2981(Statics.field3229[var5], -1);
                        }
                    }
                }
                if (var3.field3649 == 6) {
                    if (var3.field3695 != -1 || var3.field3771 != -1) {
                        boolean var6 = method416(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field3771;
                        } else {
                            var7 = var3.field3695;
                        }
                        if (var7 != -1) {
                            class209 var8 = class209.method3394(var7);
                            if (var8.method3775()) {
                                var3.field3782 += field606;
                                int var9 = var8.method3747();
                                if (var3.field3782 >= var9) {
                                    var3.field3782 -= var8.field2317;
                                    if (var3.field3782 < 0 || var3.field3782 >= var9) {
                                        var3.field3782 = 0;
                                    }
                                }
                                method3930(var3);
                            } else {
                                var3.field3783 += field606;
                                while (var3.field3783 > var8.field2324[var3.field3782]) {
                                    var3.field3783 -= var8.field2324[var3.field3782];
                                    var3.field3782++;
                                    if (var3.field3782 >= var8.field2313.length) {
                                        var3.field3782 -= var8.field2317;
                                        if (var3.field3782 < 0 || var3.field3782 >= var8.field2313.length) {
                                            var3.field3782 = 0;
                                        }
                                    }
                                    method3930(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3742 != 0 && !var3.field3731) {
                        int var10 = var3.field3742 >> 16;
                        int var11 = var3.field3742 << 16 >> 16;
                        int var12 = field606 * var10;
                        int var13 = field606 * var11;
                        var3.field3699 = var3.field3699 + var12 & 0x7FF;
                        var3.field3718 = var3.field3718 + var13 & 0x7FF;
                        method3930(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.ms(II)V")
    public static final void method298(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method2305((double) var3);
    }

    @ObfuscatedName("nn.nq(B)I")
    public static final int method6063() {
        float var0 = 200.0F * ((float) Statics.field4737.method2400() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("do.na(D)V")
    public static final void method2305(double arg0) {
        class227.method4053(arg0);
        ((class237) class227.field2537.field2813).method4402(arg0);
        class207.method2710();
        Statics.field4737.method2411(arg0);
    }

    @ObfuscatedName("kl.nm(II)V")
    public static final void method5138(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field4737.method2346()) {
            return;
        }
        label36: {
            if (Statics.field4737.method2346() == 0) {
                boolean var2 = !class306.field3406.isEmpty();
                if (var2) {
                    class357 var3 = Statics.field4431;
                    if (!class306.field3406.isEmpty()) {
                        ArrayList var4 = new ArrayList();
                        Iterator var5 = class306.field3406.iterator();
                        while (var5.hasNext()) {
                            class318 var6 = (class318) var5.next();
                            var6.field3519 = false;
                            var6.field3517 = false;
                            var6.field3525 = false;
                            var6.field3520 = false;
                            var6.field3515 = var3;
                            var6.field3514 = var1;
                            var6.field3511 = 0.0F;
                            var4.add(var6);
                        }
                        class306.method1037(var4, class306.field3409, class306.field3410, class306.field3411, class306.field3402, false);
                    }
                    field800 = false;
                    break label36;
                }
            }
            if (var1 == 0) {
                class306.method2092(0, 0);
                field800 = false;
            } else {
                class306.method5212(var1);
            }
        }
        Statics.field4737.method2353(var1);
    }

    @ObfuscatedName("ov.nl(IB)V")
    public static final void method6578(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4737.method2356(var1);
    }

    @ObfuscatedName("ar.nd(II)V")
    public static final void method155(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4737.method2451(var1);
    }

    @ObfuscatedName("kn.ng(IB)V")
    public static final void method5042(int arg0) {
        method2718();
        for (class70 var1 = (class70) class70.field859.method6393(); var1 != null; var1 = (class70) class70.field859.method6395()) {
            if (var1.field870 != null) {
                var1.method1835();
            }
        }
        int var2 = class187.method1165(arg0).field1933;
        if (var2 == 0) {
            return;
        }
        int var3 = class322.field3540[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class227.method4053(0.9D);
                ((class237) class227.field2537.field2813).method4402(0.9D);
                class207.method2710();
                Statics.field4737.method2411(0.9D);
            }
            if (var3 == 2) {
                class227.method4053(0.8D);
                ((class237) class227.field2537.field2813).method4402(0.8D);
                class207.method2710();
                Statics.field4737.method2411(0.8D);
            }
            if (var3 == 3) {
                method2305(0.7D);
            }
            if (var3 == 4) {
                method2305(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method5138(255);
            }
            if (var3 == 1) {
                method5138(192);
            }
            if (var3 == 2) {
                method5138(128);
            }
            if (var3 == 3) {
                method5138(64);
            }
            if (var3 == 4) {
                method5138(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method6578(127);
            }
            if (var3 == 1) {
                method6578(96);
            }
            if (var3 == 2) {
                method6578(64);
            }
            if (var3 == 3) {
                method6578(32);
            }
            if (var3 == 4) {
                method6578(0);
            }
        }
        if (var2 == 5) {
            field674 = var3 == 1;
        }
        if (var2 == 6) {
            field703 = var3;
        }
        if (var2 == 9) {
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method155(127);
            }
            if (var3 == 1) {
                method155(96);
            }
            if (var3 == 2) {
                method155(64);
            }
            if (var3 == 3) {
                method155(32);
            }
            if (var3 == 4) {
                method155(0);
            }
        }
        if (var2 == 17) {
            field562 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field556 = (class104) class373.method371(class104.method6244(), var3);
            if (field556 == null) {
                field556 = class104.field1359;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field666 = -1;
            } else {
                field666 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field557 = (class104) class373.method371(class104.method6244(), var3);
            if (field557 == null) {
                field557 = class104.field1359;
            }
        }
    }

    @ObfuscatedName("hc.nt(Lmi;B)V")
    public static final void method3556(class332 arg0) {
        int var1 = arg0.field3675;
        if (var1 == 324) {
            if (field633 == -1) {
                field633 = arg0.field3737;
                field816 = arg0.field3683;
            }
            if (field814.field3573 == 1) {
                arg0.field3737 = field633;
            } else {
                arg0.field3737 = field816;
            }
        } else if (var1 == 325) {
            if (field633 == -1) {
                field633 = arg0.field3737;
                field816 = arg0.field3683;
            }
            if (field814.field3573 == 1) {
                arg0.field3737 = field816;
            } else {
                arg0.field3737 = field633;
            }
        } else if (var1 == 327) {
            arg0.field3699 = 150;
            arg0.field3718 = (int) (Math.sin((double) field833 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3691 = 5;
            arg0.field3692 = 0;
        } else if (var1 == 328) {
            arg0.field3699 = 150;
            arg0.field3718 = (int) (Math.sin((double) field833 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3691 = 5;
            arg0.field3692 = 1;
        }
    }

    @ObfuscatedName("jz.nv(B)V")
    public static final void method4697() {
        class297 var0 = class297.method1166(class295.field3116, field592.field1429);
        field592.method2665(var0);
        class71.field888 = true;
        for (class87 var1 = (class87) field548.method8027(); var1 != null; var1 = (class87) field548.method8028()) {
            if (var1.field1081 == 0 || var1.field1081 == 3) {
                method2257(var1, true);
            }
        }
        if (field704 != null) {
            method3930(field704);
            field704 = null;
        }
        class71.field888 = false;
    }

    @ObfuscatedName("na.nb(IIII)Lds;")
    public static final class87 method6039(int arg0, int arg1, int arg2) {
        class87 var3 = new class87();
        var3.field1083 = arg1;
        var3.field1081 = arg2;
        field548.method8035(var3, (long) arg0);
        method286(arg1);
        class332 var4 = class332.method2255(arg0);
        method3930(var4);
        if (field704 != null) {
            method3930(field704);
            field704 = null;
        }
        method2001(Statics.field3229[arg0 >> 16], var4, false);
        class71.method3917(arg1);
        if (field699 != -1) {
            method6574(field699, 1);
        }
        return var3;
    }

    @ObfuscatedName("dz.ns(Lds;ZI)V")
    public static final void method2257(class87 arg0, boolean arg1) {
        int var2 = arg0.field1083;
        int var3 = (int) arg0.field4814;
        arg0.method7700();
        if (arg1) {
            class332.method4199(var2);
        }
        method6040(var2);
        class332 var4 = class332.method2255(var3);
        if (var4 != null) {
            method3930(var4);
        }
        if (field699 != -1) {
            method6574(field699, 1);
        }
    }

    @ObfuscatedName("rb.nz(Lmi;I)Z")
    public static final boolean method7463(class332 arg0) {
        int var1 = arg0.field3675;
        if (var1 == 205) {
            field580 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field814.method5520(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field814.method5521(var4, var5 == 1);
        }
        if (var1 == 324) {
            field814.method5540(0);
        }
        if (var1 == 325) {
            field814.method5540(1);
        }
        if (var1 == 326) {
            class297 var6 = class297.method1166(class295.field3169, field592.field1429);
            field814.method5523(var6.field3227);
            field592.method2665(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("az.ne(Lmi;IIIB)V")
    public static final void method34(class332 arg0, int arg1, int arg2, int arg3) {
        method5215();
        class321 var4 = arg0.method5851(false);
        if (var4 == null) {
            return;
        }
        class525.method8621(arg1, arg2, var4.field3532 + arg1, var4.field3531 + arg2);
        if (field780 == 2 || field780 == 5) {
            class525.method8623(arg1, arg2, 0, var4.field3537, var4.field3533);
        } else {
            int var5 = field705 & 0x7FF;
            int var6 = Statics.field2132.field1228 / 32 + 48;
            int var7 = 464 - Statics.field2132.field1199 / 32;
            Statics.field4659.method8741(arg1, arg2, var4.field3532, var4.field3531, var6, var7, var5, 256, var4.field3537, var4.field3533);
            for (int var8 = 0; var8 < field774; var8++) {
                int var9 = field775[var8] * 4 + 2 - Statics.field2132.field1228 / 32;
                int var10 = field776[var8] * 4 + 2 - Statics.field2132.field1199 / 32;
                method3800(arg1, arg2, var9, var10, field785[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class378 var13 = field667[Statics.field1321][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2132.field1228 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2132.field1199 / 32;
                        method3800(arg1, arg2, var14, var15, Statics.field2290[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field588; var16++) {
                class101 var17 = field587[field526[var16]];
                if (var17 != null && var17.method2220()) {
                    class196 var18 = var17.field1327;
                    if (var18 != null && var18.field2066 != null) {
                        var18 = var18.method3409();
                    }
                    if (var18 != null && var18.field2061 && var18.field2072) {
                        int var19 = var17.field1228 / 32 - Statics.field2132.field1228 / 32;
                        int var20 = var17.field1199 / 32 - Statics.field2132.field1199 / 32;
                        method3800(arg1, arg2, var19, var20, Statics.field2290[1], var4);
                    }
                }
            }
            int var21 = class108.field1380;
            int[] var22 = class108.field1381;
            for (int var23 = 0; var23 < var21; var23++) {
                class92 var24 = field700[var22[var23]];
                if (var24 != null && var24.method2220() && !var24.field1149 && Statics.field2132 != var24) {
                    int var25 = var24.field1228 / 32 - Statics.field2132.field1228 / 32;
                    int var26 = var24.field1199 / 32 - Statics.field2132.field1199 / 32;
                    if (var24.method2208()) {
                        method3800(arg1, arg2, var25, var26, Statics.field2290[3], var4);
                    } else if (Statics.field2132.field1156 != 0 && var24.field1156 != 0 && Statics.field2132.field1156 == var24.field1156) {
                        method3800(arg1, arg2, var25, var26, Statics.field2290[4], var4);
                    } else if (var24.method2211()) {
                        method3800(arg1, arg2, var25, var26, Statics.field2290[5], var4);
                    } else if (var24.method2219()) {
                        method3800(arg1, arg2, var25, var26, Statics.field2290[6], var4);
                    } else {
                        method3800(arg1, arg2, var25, var26, Statics.field2290[2], var4);
                    }
                }
            }
            if (field605 != 0 && field833 % 20 < 10) {
                if (field605 == 1 && field549 >= 0 && field549 < field587.length) {
                    class101 var27 = field587[field549];
                    if (var27 != null) {
                        int var28 = var27.field1228 / 32 - Statics.field2132.field1228 / 32;
                        int var29 = var27.field1199 / 32 - Statics.field2132.field1199 / 32;
                        method7000(arg1, arg2, var28, var29, Statics.field509[1], var4);
                    }
                }
                if (field605 == 2) {
                    int var30 = field551 * 4 - Statics.field1448 * 4 + 2 - Statics.field2132.field1228 / 32;
                    int var31 = field694 * 4 - Statics.field354 * 4 + 2 - Statics.field2132.field1199 / 32;
                    method7000(arg1, arg2, var30, var31, Statics.field509[1], var4);
                }
                if (field605 == 10 && field568 >= 0 && field568 < field700.length) {
                    class92 var32 = field700[field568];
                    if (var32 != null) {
                        int var33 = var32.field1228 / 32 - Statics.field2132.field1228 / 32;
                        int var34 = var32.field1199 / 32 - Statics.field2132.field1199 / 32;
                        method7000(arg1, arg2, var33, var34, Statics.field509[1], var4);
                    }
                }
            }
            if (field778 != 0) {
                int var35 = field778 * 4 + 2 - Statics.field2132.field1228 / 32;
                int var36 = field701 * 4 + 2 - Statics.field2132.field1199 / 32;
                method3800(arg1, arg2, var35, var36, Statics.field509[0], var4);
            }
            if (!Statics.field2132.field1149) {
                class525.method8612(var4.field3532 / 2 + arg1 - 1, var4.field3531 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field750[arg3] = true;
    }

    @ObfuscatedName("aq.ni(Lmi;IIII)V")
    public static final void method82(class332 arg0, int arg1, int arg2, int arg3) {
        class321 var4 = arg0.method5851(false);
        if (var4 == null) {
            return;
        }
        if (field780 < 3) {
            Statics.field607.method8741(arg1, arg2, var4.field3532, var4.field3531, 25, 25, field705, 256, var4.field3537, var4.field3533);
        } else {
            class525.method8623(arg1, arg2, 0, var4.field3537, var4.field3533);
        }
    }

    @ObfuscatedName("pp.nr(IIIILui;Lme;I)V")
    public static final void method7000(int arg0, int arg1, int arg2, int arg3, class529 arg4, class321 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method3800(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field705 & 0x7FF;
        int var8 = class227.field2535[var7];
        int var9 = class227.field2533[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3532 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1826.method8710(arg5.field3532 / 2 + arg0 - var17 / 2 + var15, arg5.field3531 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ig.np(IIIILui;Lme;I)V")
    public static final void method3800(int arg0, int arg1, int arg2, int arg3, class529 arg4, class321 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field705 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class227.field2535[var6];
        int var9 = class227.field2533[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method8740(arg5.field3532 / 2 + var10 - arg4.field5212 / 2, arg5.field3531 / 2 - var11 - arg4.field5213 / 2, arg0, arg1, arg5.field3532, arg5.field3531, arg5.field3537, arg5.field3533);
        } else {
            arg4.method8774(arg5.field3532 / 2 + arg0 + var10 - arg4.field5212 / 2, arg5.field3531 / 2 + arg1 - var11 - arg4.field5213 / 2);
        }
    }

    @ObfuscatedName("qi.nn(I)V")
    public static final void method7388() {
        Iterator var0 = class111.field1420.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1143();
        }
        if (Statics.field265 != null) {
            Statics.field265.method7202();
        }
    }

    @ObfuscatedName("ez.nw(I)V")
    public static final void method2720() {
        field733 = field529;
    }

    @ObfuscatedName("ft.nk(Ljava/lang/String;B)V")
    public static final void method2901(String arg0) {
        if (Statics.field265 != null) {
            class297 var1 = class297.method1166(class295.field3195, field592.field1429);
            var1.field3227.method8283(class515.method7389(arg0));
            var1.field3227.method8290(arg0);
            field592.method2665(var1);
        }
    }

    @ObfuscatedName("ev.nj(Ljava/lang/String;I)V")
    public static final void method2706(String arg0) {
        if (!arg0.equals("")) {
            class297 var1 = class297.method1166(class295.field3175, field592.field1429);
            var1.field3227.method8283(class515.method7389(arg0));
            var1.field3227.method8290(arg0);
            field592.method2665(var1);
        }
    }

    @ObfuscatedName("df.nu(I)V")
    public static final void method2206() {
        class297 var0 = class297.method1166(class295.field3175, field592.field1429);
        var0.field3227.method8283(0);
        field592.method2665(var0);
    }

    @ObfuscatedName("ef.nf(III)V")
    public static final void method2782(int arg0, int arg1) {
        class164 var2 = arg0 >= 0 ? field772[arg0] : Statics.field2085;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3076()) {
            return;
        }
        class146 var3 = (class146) var2.field1803.get(arg1);
        if (var3.field1679 != -1) {
            return;
        }
        String var4 = var3.field1678.method8917();
        class297 var5 = class297.method1166(class295.field3137, field592.field1429);
        var5.field3227.method8283(3 + class515.method7389(var4));
        var5.field3227.method8283(arg0);
        var5.field3227.method8345(arg1);
        var5.field3227.method8290(var4);
        field592.method2665(var5);
    }

    @ObfuscatedName("op.no(III)V")
    public static final void method6619(int arg0, int arg1) {
        if (field772[arg0] == null || arg1 < 0 || arg1 >= field772[arg0].method3076()) {
            return;
        }
        class146 var2 = (class146) field772[arg0].field1803.get(arg1);
        if (var2.field1679 != -1) {
            return;
        }
        class297 var3 = class297.method1166(class295.field3128, field592.field1429);
        var3.field3227.method8283(3 + class515.method7389(var2.field1678.method8917()));
        var3.field3227.method8283(arg0);
        var3.field3227.method8345(arg1);
        var3.field3227.method8290(var2.field1678.method8917());
        field592.method2665(var3);
    }

    @ObfuscatedName("be.nx(IIZB)V")
    public static final void method846(int arg0, int arg1, boolean arg2) {
        if (field772[arg0] == null || arg1 < 0 || arg1 >= field772[arg0].method3076()) {
            return;
        }
        class146 var3 = (class146) field772[arg0].field1803.get(arg1);
        class297 var4 = class297.method1166(class295.field3196, field592.field1429);
        var4.field3227.method8283(4 + class515.method7389(var3.field1678.method8917()));
        var4.field3227.method8283(arg0);
        var4.field3227.method8345(arg1);
        var4.field3227.method8289(arg2);
        var4.field3227.method8290(var3.field1678.method8917());
        field592.method2665(var4);
    }

    @ObfuscatedName("na.nh(IB)V")
    public static void method6040(int arg0) {
        for (class472 var1 = (class472) field746.method8027(); var1 != null; var1 = (class472) field746.method8028()) {
            if ((var1.field4814 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method7700();
            }
        }
    }

    @ObfuscatedName("hq.nc(Lmi;I)I")
    public static int method3401(class332 arg0) {
        class472 var1 = (class472) field746.method8025(((long) arg0.field3647 << 32) + (long) arg0.field3770);
        return var1 == null ? arg0.field3721 : var1.field4812;
    }

    @ObfuscatedName("ek.oa(Lmi;I)Lmi;")
    public static class332 method2791(class332 arg0) {
        int var1 = class333.method5482(method3401(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class332.method2255(arg0.field3666);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("fo.om(Lmi;B)Z")
    public static boolean method2957(class332 arg0) {
        return arg0.field3667;
    }

    @ObfuscatedName("lc.oz(Lmi;B)Ljava/lang/String;")
    public static String method5211(class332 arg0) {
        if (class333.method3374(method3401(arg0)) == 0) {
            return null;
        } else if (arg0.field3733 == null || arg0.field3733.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3733;
        }
    }

    @ObfuscatedName("he.oh(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method3400(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field552 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field552 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field552 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field552 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field552 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field3479 != null) {
            var3 = "/p=" + Statics.field3479;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1676 + "/a=" + Statics.field2997 + var3 + "/";
    }

    @ObfuscatedName("cb.oy(Ljava/lang/String;I)V")
    public static void method1985(String arg0) {
        Statics.field3479 = arg0;
        try {
            String var1 = Statics.field2415.getParameter(Integer.toString(18));
            String var2 = Statics.field2415.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class302.method655() + 94608000000L;
                class337.field3809.setTime(new Date(var6));
                int var8 = class337.field3809.get(7);
                int var9 = class337.field3809.get(5);
                int var10 = class337.field3809.get(2);
                int var11 = class337.field3809.get(1);
                int var12 = class337.field3809.get(11);
                int var13 = class337.field3809.get(12);
                int var14 = class337.field3809.get(13);
                String var15 = class337.field3808[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class337.field3810[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field2415;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("gw.od(Ljava/lang/String;ZI)V")
    public static void method3068(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1323; var5++) {
            class207 var6 = class207.method3280(var5);
            if ((!arg1 || var6.field2279) && var6.field2241 == -1 && var6.field2251.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field163 = -1;
                    Statics.field1761 = null;
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
        Statics.field1761 = var3;
        Statics.field4375 = 0;
        Statics.field163 = var4;
        String[] var9 = new String[Statics.field163];
        for (int var10 = 0; var10 < Statics.field163; var10++) {
            var9[var10] = class207.method3280(var3[var10]).field2251;
        }
        short[] var11 = Statics.field1761;
        class510.method1833(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("bj.og(Ltm;II)V")
    public static void method417(class515 arg0, int arg1) {
        byte[] var2 = arg0.field5108;
        if (field811 == null) {
            field811 = new byte[24];
        }
        class410.method7002(var2, arg1, field811, 0, 24);
        class174.method154(arg0, arg1);
    }

    @ObfuscatedName("gq.ob(Ltm;S)V")
    public static void method3251(class515 arg0) {
        if (field811 != null) {
            arg0.method8293(field811, 0, field811.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class174.field1864.method8105(0L);
            class174.field1864.method8106(var1);
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
        arg0.method8293(var1, 0, var1.length);
    }

    @ObfuscatedName("client.ok(S)Luc;")
    public class538 method1210() {
        return Statics.field2132 == null ? null : Statics.field2132.field1146;
    }

    @ObfuscatedName("dx.on(IIIZB)V")
    public static void method2524(int arg0, int arg1, int arg2, boolean arg3) {
        class297 var4 = class297.method1166(class295.field3135, field592.field1429);
        var4.field3227.method8533(arg2);
        var4.field3227.method8345(arg1);
        var4.field3227.method8354(arg3 ? field627 : 0);
        var4.field3227.method8455(arg0);
        field592.method2665(var4);
    }

    @ObfuscatedName("lj.oe(II)V")
    public static void method5236(int arg0) {
        field620 = arg0;
    }

    @ObfuscatedName("ca.oj(S)V")
    public static void method1846() {
        field592.method2665(class297.method1166(class295.field3183, field592.field1429));
        field620 = 0;
    }

    @ObfuscatedName("jp.os(I)V")
    public static void method4728() {
        if (field620 == 1) {
            field628 = true;
        }
    }

    @ObfuscatedName("bk.ow(I)V")
    public static void method424() {
        if (!field628 || Statics.field2132 == null) {
            return;
        }
        int var0 = Statics.field2132.field1273[0];
        int var1 = Statics.field2132.field1270[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field4651 = Statics.field2132.field1228;
        int var2 = method284(Statics.field2132.field1228, Statics.field2132.field1199, Statics.field1321) - field621;
        if (var2 < Statics.field1495) {
            Statics.field1495 = var2;
        }
        Statics.field1324 = Statics.field2132.field1199;
        field628 = false;
    }

    @ObfuscatedName("ho.ot(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3264(String arg0) {
        class354[] var1 = class354.method5300();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class354 var3 = var1[var2];
            if (var3.field4248 != -1 && arg0.startsWith(Statics.method4049(var3.field4248))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4248).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("af.ox(S)V")
    public static void method69() {
        Statics.field4737.method2442(field532);
    }

    @ObfuscatedName("mq.ol(IB)V")
    public static void method5471(int arg0) {
        if (field563 != arg0) {
            field563 = arg0;
        }
    }

    @ObfuscatedName("cc.ou(ZI)V")
    public static void method2063(boolean arg0) {
        field674 = arg0;
    }

    @ObfuscatedName("nt.oi(II)Ltx;")
    public static class507 method6046(int arg0) {
        class507 var1 = (class507) field723.method5182((long) arg0);
        if (var1 == null) {
            var1 = new class507(Statics.field3870, class509.method2770(arg0), class509.method3402(arg0));
            field723.method5177(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("qq.oq(IS)Ltx;")
    public static class507 method7194(int arg0) {
        class507 var1 = (class507) field613.method5182((long) arg0);
        if (var1 == null) {
            var1 = new class507(Statics.field3870, arg0);
        }
        return var1;
    }

    @ObfuscatedName("nx.ov(I)Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard method6257() {
        return Statics.field2415.method493();
    }

    @ObfuscatedName("sp.op(IB)V")
    public static void method7979(int arg0) {
        class209 var1 = class209.method3394(arg0);
        if (var1.method3775() && class209.method2447(var1.field2309) == 2) {
            field696.add(var1.field2309);
        }
    }

    @ObfuscatedName("ga.or(I)V")
    public static void method3247() {
        for (int var0 = 0; var0 < field696.size(); var0++) {
            if (class209.method2447((Integer) field696.get(var0)) != 2) {
                field696.remove(var0);
                var0--;
            }
        }
    }

    @ObfuscatedName("client.of(IS)V")
    public void method1457(int arg0) {
        if (field709 >= 216) {
            class297 var2 = class297.method1166(class295.field3204, field592.field1429);
            var2.field3227.method8283(arg0);
            field592.method2665(var2);
        }
    }

    @ObfuscatedName("client.ps(II)V")
    public void method1211(int arg0) {
        if (field709 >= 216) {
            class297 var2 = class297.method1166(class295.field3205, field592.field1429);
            var2.field3227.method8283(arg0);
            field592.method2665(var2);
        }
    }
}

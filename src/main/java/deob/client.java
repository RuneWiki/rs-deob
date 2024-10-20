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

public final class client extends class35 implements class465, OAuthApi, class337 {

    @ObfuscatedName("client.bf")
    public static boolean field603 = true;

    @ObfuscatedName("client.cf")
    public static int field500 = 1;

    @ObfuscatedName("client.cv")
    public static int field771 = 0;

    @ObfuscatedName("client.cm")
    public static int field502 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field503 = false;

    @ObfuscatedName("client.ce")
    public static boolean field662 = false;

    @ObfuscatedName("client.ck")
    public static int field638 = -1;

    @ObfuscatedName("client.cq")
    public static int field635 = -1;

    @ObfuscatedName("client.cs")
    public static int field507 = -1;

    @ObfuscatedName("client.cp")
    public static boolean field508 = false;

    @ObfuscatedName("client.cy")
    public static int field509 = 223;

    @ObfuscatedName("client.dg")
    public static boolean field510 = false;

    @ObfuscatedName("client.dr")
    public static boolean field511 = false;

    @ObfuscatedName("client.dn")
    public static int field512 = 0;

    @ObfuscatedName("client.ds")
    public static boolean field676 = false;

    @ObfuscatedName("client.do")
    public static boolean field740 = false;

    @ObfuscatedName("client.di")
    public static boolean field515 = true;

    @ObfuscatedName("client.dt")
    public static int field516 = 0;

    @ObfuscatedName("client.da")
    public static int field517 = 0;

    @ObfuscatedName("client.db")
    public static long field518 = 1L;

    @ObfuscatedName("client.dc")
    public static int field520 = -1;

    @ObfuscatedName("client.dy")
    public static int field808 = -1;

    @ObfuscatedName("client.dw")
    public static long field522 = -1L;

    @ObfuscatedName("client.dh")
    public static boolean field523 = true;

    @ObfuscatedName("client.dj")
    public static int field524 = 0;

    @ObfuscatedName("client.dq")
    public static int field525 = 0;

    @ObfuscatedName("client.de")
    public static int field795 = 0;

    @ObfuscatedName("client.dl")
    public static int field527 = 0;

    @ObfuscatedName("client.dx")
    public static int field528 = 0;

    @ObfuscatedName("client.eg")
    public static int field788 = 0;

    @ObfuscatedName("client.es")
    public static int field544 = 0;

    @ObfuscatedName("client.ei")
    public static int field601 = 0;

    @ObfuscatedName("client.eo")
    public static int field532 = 0;

    @ObfuscatedName("client.ej")
    public static class107 field793 = class107.field1383;

    @ObfuscatedName("client.eh")
    public static class107 field766 = class107.field1383;

    @ObfuscatedName("client.eb")
    public static boolean field792 = false;

    @ObfuscatedName("client.em")
    public static class95 field536 = class95.field1158;

    @ObfuscatedName("client.ep")
    public static int field703 = 0;

    @ObfuscatedName("client.ed")
    public static int field538 = 0;

    @ObfuscatedName("client.fa")
    public static int field539 = 0;

    @ObfuscatedName("client.fy")
    public static int field540 = 0;

    @ObfuscatedName("client.fx")
    public static int field561 = 0;

    @ObfuscatedName("client.fj")
    public static int field709 = 0;

    @ObfuscatedName("client.gs")
    public static class129 field543 = class129.field1520;

    @ObfuscatedName("client.gq")
    public static class552 field677 = class552.field5420;

    @ObfuscatedName("client.gl")
    public String field545;

    @ObfuscatedName("client.gf")
    public class15 field546;

    @ObfuscatedName("client.gz")
    public class19 field547;

    @ObfuscatedName("client.go")
    public OtlTokenRequester field548;

    @ObfuscatedName("client.gx")
    public Future field711;

    @ObfuscatedName("client.gd")
    public boolean field550 = false;

    @ObfuscatedName("client.gv")
    public int field533 = 0;

    @ObfuscatedName("client.gb")
    public class19 field615;

    @ObfuscatedName("client.gw")
    public RefreshAccessTokenRequester field553;

    @ObfuscatedName("client.gt")
    public Future field542;

    @ObfuscatedName("client.gy")
    public static final String field620;

    @ObfuscatedName("client.gg")
    public static final String field556;

    @ObfuscatedName("client.hn")
    public static boolean field558;

    @ObfuscatedName("client.ht")
    public static class80 field559;

    @ObfuscatedName("client.hi")
    public static int[] field560;

    @ObfuscatedName("client.hu")
    public class547 field534;

    @ObfuscatedName("client.hc")
    public class8 field562;

    @ObfuscatedName("client.hl")
    public long field563 = -1L;

    @ObfuscatedName("client.hd")
    public static byte[] field564;

    @ObfuscatedName("client.ho")
    public static int field565;

    @ObfuscatedName("client.he")
    public static int[] field566;

    @ObfuscatedName("client.iq")
    public static final class115 field653;

    @ObfuscatedName("client.iu")
    public static int field624;

    @ObfuscatedName("client.ik")
    public static boolean field569;

    @ObfuscatedName("client.iw")
    public static class452 field570;

    @ObfuscatedName("client.in")
    public static HashMap field571;

    @ObfuscatedName("client.im")
    public static int field779;

    @ObfuscatedName("client.it")
    public static String field643;

    @ObfuscatedName("client.ir")
    public static int field756;

    @ObfuscatedName("client.ij")
    public static int field574;

    @ObfuscatedName("client.ip")
    public static int field535;

    @ObfuscatedName("client.jp")
    public static int field576;

    @ObfuscatedName("client.jm")
    public static int[][][] field684;

    @ObfuscatedName("client.jq")
    public static boolean field578;

    @ObfuscatedName("client.jw")
    public static int[][][] field579;

    @ObfuscatedName("client.ja")
    public static final int[] field580;

    @ObfuscatedName("client.jk")
    public static int field581;

    @ObfuscatedName("client.js")
    public static int field806;

    @ObfuscatedName("client.kp")
    public static int field694;

    @ObfuscatedName("client.ku")
    public static int field584;

    @ObfuscatedName("client.kb")
    public static int field585;

    @ObfuscatedName("client.kr")
    public static int field748;

    @ObfuscatedName("client.kk")
    public static boolean field587;

    @ObfuscatedName("client.kz")
    public static int field636;

    @ObfuscatedName("client.kq")
    public static int field632;

    @ObfuscatedName("client.kx")
    public static int field590;

    @ObfuscatedName("client.ka")
    public static int field591;

    @ObfuscatedName("client.kt")
    public static int field592;

    @ObfuscatedName("client.lk")
    public static int field537;

    @ObfuscatedName("client.lf")
    public static int field594;

    @ObfuscatedName("client.lq")
    public static int field595;

    @ObfuscatedName("client.li")
    public static int field686;

    @ObfuscatedName("client.lv")
    public static int field597;

    @ObfuscatedName("client.lj")
    public static int field598;

    @ObfuscatedName("client.lm")
    public static int field599;

    @ObfuscatedName("client.ld")
    public static int field600;

    @ObfuscatedName("client.lo")
    public static int field749;

    @ObfuscatedName("client.lz")
    public static int field602;

    @ObfuscatedName("client.lb")
    public static boolean field713;

    @ObfuscatedName("client.la")
    public static int field651;

    @ObfuscatedName("client.lh")
    public static boolean field605;

    @ObfuscatedName("client.lu")
    public static int field606;

    @ObfuscatedName("client.lp")
    public static int field607;

    @ObfuscatedName("client.ll")
    public static int field608;

    @ObfuscatedName("client.ls")
    public static int[] field609;

    @ObfuscatedName("client.le")
    public static int[] field610;

    @ObfuscatedName("client.ly")
    public static int[] field611;

    @ObfuscatedName("client.lg")
    public static int[] field668;

    @ObfuscatedName("client.lx")
    public static int[] field613;

    @ObfuscatedName("client.lc")
    public static int[] field614;

    @ObfuscatedName("client.mo")
    public static int[][] field541;

    @ObfuscatedName("client.mr")
    public static int[] field616;

    @ObfuscatedName("client.mz")
    public static String[] field617;

    @ObfuscatedName("client.mm")
    public static int field618;

    @ObfuscatedName("client.mt")
    public static int field619;

    @ObfuscatedName("client.mj")
    public static int field586;

    @ObfuscatedName("client.ms")
    public static int field526;

    @ObfuscatedName("client.mi")
    public static int field622;

    @ObfuscatedName("client.md")
    public static int field623;

    @ObfuscatedName("client.mb")
    public static int field675;

    @ObfuscatedName("client.mp")
    public static boolean field625;

    @ObfuscatedName("client.ma")
    public static int field626;

    @ObfuscatedName("client.mh")
    public static boolean field627;

    @ObfuscatedName("client.mx")
    public static int field707;

    @ObfuscatedName("client.my")
    public static int field629;

    @ObfuscatedName("client.ml")
    public static long field630;

    @ObfuscatedName("client.mk")
    public static long field631;

    @ObfuscatedName("client.mw")
    public static int field504;

    @ObfuscatedName("client.mu")
    public static boolean field552;

    @ObfuscatedName("client.nv")
    public static int field634;

    @ObfuscatedName("client.nm")
    public static int field640;

    @ObfuscatedName("client.ni")
    public static int[] field645;

    @ObfuscatedName("client.nw")
    public static final int[] field637;

    @ObfuscatedName("client.no")
    public static String[] field687;

    @ObfuscatedName("client.nl")
    public static boolean[] field639;

    @ObfuscatedName("client.nj")
    public static int[] field704;

    @ObfuscatedName("client.nc")
    public static int field531;

    @ObfuscatedName("client.nu")
    public static int[] field604;

    @ObfuscatedName("client.nh")
    public static int[] field705;

    @ObfuscatedName("client.nq")
    public static int[] field644;

    @ObfuscatedName("client.nf")
    public static int[] field776;

    @ObfuscatedName("client.nd")
    public static boolean field781;

    @ObfuscatedName("client.ne")
    public static boolean field647;

    @ObfuscatedName("client.nr")
    public static int field577;

    @ObfuscatedName("client.nb")
    public static int[] field649;

    @ObfuscatedName("client.nk")
    public static int[] field807;

    @ObfuscatedName("client.on")
    public static int[] field758;

    @ObfuscatedName("client.oq")
    public static int[] field652;

    @ObfuscatedName("client.ov")
    public static int[] field764;

    @ObfuscatedName("client.od")
    public static int[] field654;

    @ObfuscatedName("client.op")
    public static String[] field655;

    @ObfuscatedName("client.ob")
    public static String[] field656;

    @ObfuscatedName("client.or")
    public static boolean[] field529;

    @ObfuscatedName("client.ot")
    public static boolean field658;

    @ObfuscatedName("client.oi")
    public static boolean field659;

    @ObfuscatedName("client.of")
    public static boolean field596;

    @ObfuscatedName("client.om")
    public static int field661;

    @ObfuscatedName("client.og")
    public static int field551;

    @ObfuscatedName("client.ox")
    public static int field663;

    @ObfuscatedName("client.oa")
    public static int field501;

    @ObfuscatedName("client.ow")
    public static int field589;

    @ObfuscatedName("client.oz")
    public static boolean field667;

    @ObfuscatedName("client.oh")
    public static int field802;

    @ObfuscatedName("client.ok")
    public static int field588;

    @ObfuscatedName("client.oj")
    public static String field670;

    @ObfuscatedName("client.pj")
    public static String field671;

    @ObfuscatedName("client.pv")
    public static int field567;

    @ObfuscatedName("client.pn")
    public static class521 field673;

    @ObfuscatedName("client.px")
    public static int field674;

    @ObfuscatedName("client.pb")
    public static int field505;

    @ObfuscatedName("client.ph")
    public static int field612;

    @ObfuscatedName("client.pc")
    public static class359 field582;

    @ObfuscatedName("client.pp")
    public static int field678;

    @ObfuscatedName("client.pe")
    public static int field679;

    @ObfuscatedName("client.pl")
    public static int field680;

    @ObfuscatedName("client.po")
    public static int field681;

    @ObfuscatedName("client.pz")
    public static boolean field682;

    @ObfuscatedName("client.pr")
    public static class359 field683;

    @ObfuscatedName("client.pg")
    public static class359 field736;

    @ObfuscatedName("client.pi")
    public static class359 field685;

    @ObfuscatedName("client.pd")
    public static int field628;

    @ObfuscatedName("client.pf")
    public static int field700;

    @ObfuscatedName("client.pt")
    public static class359 field691;

    @ObfuscatedName("client.pq")
    public static boolean field689;

    @ObfuscatedName("client.pu")
    public static int field690;

    @ObfuscatedName("client.pa")
    public static int field506;

    @ObfuscatedName("client.pw")
    public static boolean field692;

    @ObfuscatedName("client.qb")
    public static int field693;

    @ObfuscatedName("client.qj")
    public static int field664;

    @ObfuscatedName("client.qe")
    public static boolean field695;

    @ObfuscatedName("client.qi")
    public static int field696;

    @ObfuscatedName("client.qu")
    public static int[] field697;

    @ObfuscatedName("client.qm")
    public static int field698;

    @ObfuscatedName("client.qn")
    public static int[] field699;

    @ObfuscatedName("client.qc")
    public static int field621;

    @ObfuscatedName("client.qq")
    public static int[] field688;

    @ObfuscatedName("client.qh")
    public static int field702;

    @ObfuscatedName("client.ql")
    public static int[] field572;

    @ObfuscatedName("client.qk")
    public static int field720;

    @ObfuscatedName("client.qf")
    public static int field648;

    @ObfuscatedName("client.qz")
    public static int field706;

    @ObfuscatedName("client.qw")
    public static int field804;

    @ObfuscatedName("client.qd")
    public static int field708;

    @ObfuscatedName("client.qr")
    public static int field660;

    @ObfuscatedName("client.qt")
    public static int field710;

    @ObfuscatedName("client.qv")
    public static int field728;

    @ObfuscatedName("client.qp")
    public static int field712;

    @ObfuscatedName("client.rp")
    public static int field530;

    @ObfuscatedName("client.rh")
    public static class565 field714;

    @ObfuscatedName("client.rc")
    public static class407 field715;

    @ObfuscatedName("client.rs")
    public static class407 field716;

    @ObfuscatedName("client.ri")
    public static class407 field717;

    @ObfuscatedName("client.rx")
    public static class407 field718;

    @ObfuscatedName("client.rt")
    public static class521 field744;

    @ObfuscatedName("client.rg")
    public static int field641;

    @ObfuscatedName("client.rr")
    public static int field721;

    @ObfuscatedName("client.rw")
    public static boolean[] field722;

    @ObfuscatedName("client.ra")
    public static boolean[] field723;

    @ObfuscatedName("client.rd")
    public static boolean[] field724;

    @ObfuscatedName("client.rf")
    public static int[] field725;

    @ObfuscatedName("client.rb")
    public static int[] field726;

    @ObfuscatedName("client.re")
    public static int[] field727;

    @ObfuscatedName("client.rl")
    public static int[] field573;

    @ObfuscatedName("client.rv")
    public static int field583;

    @ObfuscatedName("client.ry")
    public static long field730;

    @ObfuscatedName("client.rm")
    public static boolean field731;

    @ObfuscatedName("client.sn")
    public static int field732;

    @ObfuscatedName("client.sh")
    public static int field733;

    @ObfuscatedName("client.sv")
    public static int[] field734;

    @ObfuscatedName("client.so")
    public static int field735;

    @ObfuscatedName("client.sp")
    public static int field774;

    @ObfuscatedName("client.sf")
    public static String field737;

    @ObfuscatedName("client.sa")
    public static long[] field738;

    @ObfuscatedName("client.sq")
    public static int field739;

    @ObfuscatedName("client.sw")
    public static class232 field729;

    @ObfuscatedName("client.sy")
    public static class230 field741;

    @ObfuscatedName("client.se")
    public static int field742;

    @ObfuscatedName("client.ss")
    public static int[] field743;

    @ObfuscatedName("client.si")
    public static int[] field593;

    @ObfuscatedName("client.sm")
    public static long field745;

    @ObfuscatedName("client.sr")
    public static class159[] field746;

    @ObfuscatedName("client.tb")
    public static class168[] field747;

    @ObfuscatedName("client.tx")
    public static int field633;

    @ObfuscatedName("client.tg")
    public static int field513;

    @ObfuscatedName("client.tf")
    public static int[] field750;

    @ObfuscatedName("client.tv")
    public static int[] field751;

    @ObfuscatedName("client.tc")
    public static class561[] field555;

    @ObfuscatedName("client.td")
    public static int field753;

    @ObfuscatedName("client.tn")
    public static int field754;

    @ObfuscatedName("client.tt")
    public static int field755;

    @ObfuscatedName("client.tm")
    public static boolean field762;

    @ObfuscatedName("client.ty")
    public static int field757;

    @ObfuscatedName("client.tu")
    public static int[] field549;

    @ObfuscatedName("client.to")
    public static int[] field759;

    @ObfuscatedName("client.th")
    public static int[] field760;

    @ObfuscatedName("client.up")
    public static int[] field761;

    @ObfuscatedName("client.uz")
    public static int[] field669;

    @ObfuscatedName("client.uj")
    public static class40[] field763;

    @ObfuscatedName("client.uu")
    public static boolean field767;

    @ObfuscatedName("client.uc")
    public static boolean field765;

    @ObfuscatedName("client.uv")
    public static boolean field554;

    @ObfuscatedName("client.ub")
    public static boolean field805;

    @ObfuscatedName("client.uh")
    public static class512 field768;

    @ObfuscatedName("client.ut")
    public static class511 field769;

    @ObfuscatedName("client.uo")
    public static class511 field770;

    @ObfuscatedName("client.ua")
    public static boolean field568;

    @ObfuscatedName("client.vb")
    public static boolean[] field772;

    @ObfuscatedName("client.vk")
    public static int[] field773;

    @ObfuscatedName("client.vj")
    public static int[] field665;

    @ObfuscatedName("client.vy")
    public static int[] field775;

    @ObfuscatedName("client.vr")
    public static int[] field499;

    @ObfuscatedName("client.vu")
    public static short field777;

    @ObfuscatedName("client.vt")
    public static short field778;

    @ObfuscatedName("client.vw")
    public static short field650;

    @ObfuscatedName("client.vx")
    public static short field780;

    @ObfuscatedName("client.vq")
    public static short field752;

    @ObfuscatedName("client.vv")
    public static short field782;

    @ObfuscatedName("client.vg")
    public static short field783;

    @ObfuscatedName("client.vh")
    public static short field784;

    @ObfuscatedName("client.va")
    public static int field785;

    @ObfuscatedName("client.vs")
    public static int field786;

    @ObfuscatedName("client.vn")
    public static int field787;

    @ObfuscatedName("client.vc")
    public static int field701;

    @ObfuscatedName("client.vl")
    public static int field789;

    @ObfuscatedName("client.vo")
    public static class356 field790;

    @ObfuscatedName("client.vz")
    public static int field791;

    @ObfuscatedName("client.vd")
    public static int field666;

    @ObfuscatedName("client.wj")
    public static class508 field657;

    @ObfuscatedName("client.wf")
    public static class397[] field794;

    @ObfuscatedName("client.wd")
    public static class67 field809;

    @ObfuscatedName("client.wx")
    public static class462 field796;

    @ObfuscatedName("client.wg")
    public static class313 field797;

    @ObfuscatedName("client.wy")
    public static class313 field798;

    @ObfuscatedName("client.wt")
    public static int field799;

    @ObfuscatedName("client.wb")
    public static int field800;

    @ObfuscatedName("client.wr")
    public static List field801;

    @ObfuscatedName("client.wn")
    public static final class241 field521;

    @ObfuscatedName("client.wc")
    public static ArrayList field803;

    @ObfuscatedName("client.wk")
    public static int field514;

    @ObfuscatedName("client.ww")
    public static int field575;

    @ObfuscatedName("client.xh")
    public static final class66 field646;

    @ObfuscatedName("client.xb")
    public static int[] field642;

    @ObfuscatedName("client.xs")
    public static int[] field672;

    static {
        byte[] var0 = class413.method3195("com_jagex_auth_desktop_osrs:public");
        int var1 = var0.length;
        StringBuilder var2 = new StringBuilder();
        for (int var3 = 0; var3 < var1; var3 += 3) {
            int var4 = var0[var3] & 0xFF;
            var2.append(class415.field4670[var4 >>> 2]);
            if (var3 < var1 - 1) {
                int var5 = var0[var3 + 1] & 0xFF;
                var2.append(class415.field4670[(var4 & 0x3) << 4 | var5 >>> 4]);
                if (var3 < var1 - 2) {
                    int var6 = var0[var3 + 2] & 0xFF;
                    var2.append(class415.field4670[(var5 & 0xF) << 2 | var6 >>> 6]).append(class415.field4670[var6 & 0x3F]);
                } else {
                    var2.append(class415.field4670[(var5 & 0xF) << 2]).append("=");
                }
            } else {
                var2.append(class415.field4670[(var4 & 0x3) << 4]).append("==");
            }
        }
        String var7 = var2.toString();
        field620 = var7;
        int var9 = "com_jagex_auth_desktop_runelite:public".length();
        byte[] var10 = new byte[var9];
        for (int var11 = 0; var11 < var9; var11++) {
            char var12 = "com_jagex_auth_desktop_runelite:public".charAt(var11);
            if (var12 > 127) {
                var10[var11] = 63;
            } else {
                var10[var11] = (byte) var12;
            }
        }
        byte[] var14 = var10;
        int var15 = var10.length;
        StringBuilder var16 = new StringBuilder();
        for (int var17 = 0; var17 < var15; var17 += 3) {
            int var18 = var14[var17] & 0xFF;
            var16.append(class415.field4670[var18 >>> 2]);
            if (var17 < var15 - 1) {
                int var19 = var14[var17 + 1] & 0xFF;
                var16.append(class415.field4670[(var18 & 0x3) << 4 | var19 >>> 4]);
                if (var17 < var15 - 2) {
                    int var20 = var14[var17 + 2] & 0xFF;
                    var16.append(class415.field4670[(var19 & 0xF) << 2 | var20 >>> 6]).append(class415.field4670[var20 & 0x3F]);
                } else {
                    var16.append(class415.field4670[(var19 & 0xF) << 2]).append("=");
                }
            } else {
                var16.append(class415.field4670[(var18 & 0x3) << 4]).append("==");
            }
        }
        String var21 = var16.toString();
        field556 = var21;
        field558 = false;
        field559 = new class80();
        field560 = new int[4];
        field564 = null;
        field565 = 0;
        field566 = new int[250];
        field653 = new class115();
        field624 = 0;
        field569 = false;
        field570 = new class452();
        field571 = new HashMap();
        field779 = 0;
        field756 = 1;
        field574 = 0;
        field535 = 1;
        field576 = 0;
        field684 = new int[4][13][13];
        field578 = false;
        field579 = new int[4][13][13];
        field580 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field581 = -1;
        field806 = 0;
        field694 = 2301979;
        field584 = 5063219;
        field585 = 3353893;
        field748 = 7759444;
        field587 = false;
        field636 = 0;
        field632 = 128;
        field590 = 0;
        field591 = 0;
        field592 = 0;
        field537 = 0;
        field594 = 0;
        field595 = 0;
        field686 = 50;
        field597 = 0;
        field598 = 0;
        field599 = 0;
        field600 = 12;
        field749 = 6;
        field602 = 0;
        field713 = false;
        field651 = 0;
        field605 = false;
        field606 = 0;
        field607 = 0;
        field608 = 50;
        field609 = new int[field608];
        field610 = new int[field608];
        field611 = new int[field608];
        field668 = new int[field608];
        field613 = new int[field608];
        field614 = new int[field608];
        field541 = new int[field608][];
        field616 = new int[field608];
        field617 = new String[field608];
        field618 = 0;
        field619 = -1;
        field586 = -1;
        field526 = 0;
        field622 = 0;
        field623 = 0;
        field675 = 0;
        field625 = true;
        field626 = 0;
        field627 = true;
        field707 = -1;
        field629 = 0;
        field630 = -1L;
        field631 = -1L;
        field504 = -1;
        field552 = true;
        field634 = 0;
        field640 = 0;
        field645 = new int[1000];
        field637 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field687 = new String[8];
        field639 = new boolean[8];
        field704 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field531 = -1;
        field604 = new int[25];
        field705 = new int[25];
        field644 = new int[25];
        field776 = new int[25];
        field781 = false;
        field647 = false;
        field577 = 0;
        field649 = new int[500];
        field807 = new int[500];
        field758 = new int[500];
        field652 = new int[500];
        field764 = new int[500];
        field654 = new int[500];
        field655 = new String[500];
        field656 = new String[500];
        field529 = new boolean[500];
        field658 = false;
        field659 = false;
        field596 = true;
        field661 = -1;
        field551 = -1;
        field663 = 0;
        field501 = 50;
        field589 = 0;
        field643 = null;
        field667 = false;
        field802 = -1;
        field588 = -1;
        field670 = null;
        field671 = null;
        field567 = -1;
        field673 = new class521(8);
        field674 = 0;
        field505 = -1;
        field612 = 0;
        field582 = null;
        field678 = 0;
        field679 = 0;
        field680 = 0;
        field681 = -1;
        field682 = false;
        field683 = null;
        field736 = null;
        field685 = null;
        field628 = 0;
        field700 = 0;
        field691 = null;
        field689 = false;
        field690 = -1;
        field506 = -1;
        field692 = false;
        field693 = -1;
        field664 = -1;
        field695 = false;
        field696 = 1;
        field697 = new int[32];
        field698 = 0;
        field699 = new int[32];
        field621 = 0;
        field688 = new int[32];
        field702 = 0;
        field572 = new int[32];
        field720 = 0;
        field648 = 0;
        field706 = 0;
        field804 = 0;
        field708 = 0;
        field660 = 0;
        field710 = 0;
        field728 = 0;
        field712 = 0;
        field530 = 0;
        field714 = new class565();
        field715 = new class407();
        field716 = new class407();
        field717 = new class407();
        field718 = new class407();
        field744 = new class521(512);
        field641 = 0;
        field721 = -2;
        field722 = new boolean[100];
        field723 = new boolean[100];
        field724 = new boolean[100];
        field725 = new int[100];
        field726 = new int[100];
        field727 = new int[100];
        field573 = new int[100];
        field583 = 0;
        field730 = 0L;
        field731 = true;
        field732 = 600;
        field733 = field732 / field178;
        field734 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field735 = 0;
        field774 = 0;
        field737 = "";
        field738 = new long[100];
        field739 = 0;
        field729 = new class232();
        field741 = new class230();
        field742 = 0;
        field743 = new int[128];
        field593 = new int[128];
        field745 = -1L;
        field746 = new class159[4];
        field747 = new class168[4];
        field633 = -1;
        field513 = 0;
        field750 = new int[1000];
        field751 = new int[1000];
        field555 = new class561[1000];
        field753 = 0;
        field754 = 0;
        field755 = 0;
        field762 = false;
        field757 = 0;
        field549 = new int[50];
        field759 = new int[50];
        field760 = new int[50];
        field761 = new int[50];
        field669 = new int[50];
        field763 = new class40[50];
        field767 = false;
        field765 = false;
        field554 = false;
        field805 = false;
        field768 = null;
        field769 = null;
        field770 = null;
        field568 = false;
        field772 = new boolean[5];
        field773 = new int[5];
        field665 = new int[5];
        field775 = new int[5];
        field499 = new int[5];
        field777 = 256;
        field778 = 205;
        field650 = 256;
        field780 = 320;
        field752 = 1;
        field782 = 32767;
        field783 = 1;
        field784 = 32767;
        field785 = 0;
        field786 = 0;
        field787 = 0;
        field701 = 0;
        field789 = 0;
        field790 = new class356();
        field791 = -1;
        field666 = -1;
        field657 = new class506();
        field794 = new class397[8];
        field809 = new class67();
        field796 = new class462(8, class460.field4898);
        field797 = new class313(64);
        field798 = new class313(64);
        field799 = -1;
        field800 = -1;
        field801 = new ArrayList();
        field521 = new class241();
        field803 = new ArrayList(10);
        field514 = 0;
        field575 = 0;
        field646 = new class66();
        field642 = new int[50];
        field672 = new int[50];
    }

    @ObfuscatedName("rk.gd(B)Ltr;")
    public static class507 method7588() {
        return Statics.field141;
    }

    @ObfuscatedName("al.gv(I)Ltw;")
    public static class515 method196() {
        return Statics.field3175;
    }

    @ObfuscatedName("client.bk(I)V")
    public final void method517() {
    }

    public final void init() {
        if (!this.method498()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class105.field1366)) {
                            field503 = true;
                        } else {
                            field503 = false;
                        }
                        break;
                    case 4:
                        if (field635 == -1) {
                            field635 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field771 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field1514 = class403.method6762(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field3004 = class374.method5514(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class105.field1366)) {
                        }
                        break;
                    case 9:
                        Statics.field82 = var2;
                        break;
                    case 10:
                        Statics.field1401 = (class375) class402.method3799(class375.method4870(), Integer.parseInt(var2));
                        if (Statics.field1401 == class375.field4082) {
                            Statics.field992 = class525.field5254;
                        } else {
                            Statics.field992 = class525.field5256;
                        }
                        break;
                    case 11:
                        Statics.field1865 = var2;
                        break;
                    case 12:
                        field500 = Integer.parseInt(var2);
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
                        Statics.field2084 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field502 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field4494 = var2;
                        break;
                    case 21:
                        field638 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field3270 = var2;
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field509 = Integer.parseInt(var2);
                        } else {
                            field509 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        class283.field2919 = false;
        field662 = false;
        Statics.field93 = this.getCodeBase().getHost();
        Statics.field2487 = new class389();
        String var4 = Statics.field3004.field4075;
        byte var5 = 0;
        if ((field771 & class543.field5332.method32()) != 0) {
            Statics.field4619 = "beta";
        }
        try {
            class218.method3889("oldschool", Statics.field4619, var4, var5, 23);
        } catch (Exception var7) {
            class572.method7807((String) null, var7);
        }
        Statics.field4675 = this;
        Statics.field4868 = field635;
        Statics.field4695 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field228 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field104 = System.getenv("JX_SESSION_ID");
        Statics.field1662 = System.getenv("JX_CHARACTER_ID");
        class78.method4848(System.getenv("JX_DISPLAY_NAME"));
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field550 = true;
        }
        if (field507 == -1) {
            if (this.method1733() || this.method1184()) {
                field507 = 5;
            } else {
                field507 = 0;
            }
        }
        this.method495(765, 503, 223, 1);
    }

    public void finalize() throws Throwable {
        class331.field3589.remove(this);
        super.finalize();
    }

    @ObfuscatedName("client.gw(I)Z")
    public boolean method1180() {
        return this.field533 == 1;
    }

    public void setClient(int arg0) {
        this.field533 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field548 = arg0;
            class78.method3187(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field553 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field512 == 10;
    }

    public long getAccountHash() {
        return this.field563;
    }

    @ObfuscatedName("client.gt(B)Z")
    public boolean method1733() {
        return Statics.field4695 != null && !Statics.field4695.trim().isEmpty() && Statics.field228 != null && !Statics.field228.trim().isEmpty();
    }

    @ObfuscatedName("client.gy(S)Z")
    public boolean method1184() {
        return Statics.field104 != null && !Statics.field104.trim().isEmpty() && Statics.field1662 != null && !Statics.field1662.trim().isEmpty();
    }

    @ObfuscatedName("client.gg(I)Z")
    public boolean method1215() {
        return this.field548 != null;
    }

    @ObfuscatedName("client.hr(Ljava/lang/String;I)V")
    public void method1392(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field1865 + "shield/oauth/token" + (new class496(var2)).method8097());
        class458 var4 = new class458();
        if (this.method1180()) {
            var4.method7709(field556);
        } else {
            var4.method7709(field620);
        }
        var4.method7692("Host", (new URL(Statics.field1865)).getHost());
        var4.method7681(class493.field5043);
        class10 var5 = class10.field42;
        RefreshAccessTokenRequester var6 = this.field553;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field550);
            this.field615 = this.field546.method167(var7);
        } else {
            this.field542 = var6.request(var5.method67(), var3, var4.method7689(), "");
        }
    }

    @ObfuscatedName("client.hq(Ljava/lang/String;I)V")
    public void method1187(String arg0) throws IOException {
        URL var2 = new URL(Statics.field1865 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class458 var3 = new class458();
        var3.method7697(arg0);
        class10 var4 = class10.field50;
        OtlTokenRequester var5 = this.field548;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field550);
            this.field547 = this.field546.method167(var6);
        } else {
            this.field711 = var5.request(var4.method67(), var2, var3.method7689(), "");
        }
    }

    @ObfuscatedName("client.hy(Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1188(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field3270 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field42, this.field550);
        var4.method77().method7697(arg0);
        var4.method77().method7681(class493.field5043);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method78(new class495(var5));
        this.field547 = this.field546.method167(var4);
    }

    @ObfuscatedName("client.by(I)V")
    public final void method507() {
        class450.method2240(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field10 = class544.method3399(field771, class543.field5332);
        Statics.field1987 = field502 == 0 ? 43594 : field500 + 40000;
        Statics.field158 = field502 == 0 ? 443 : field500 + 50000;
        Statics.field1833 = Statics.field1987;
        Statics.field4863 = class358.field3817;
        Statics.field1372 = class358.field3818;
        Statics.field830 = class358.field3819;
        Statics.field1099 = class358.field3815;
        Statics.field4837 = new class118(this.field550, 223);
        this.method487();
        this.method490();
        Statics.field1032 = this.method532();
        this.method489(field741, 0);
        this.method489(field729, 1);
        this.method484();
        Statics.field225 = new class483(255, class218.field2362, class218.field2363, 500000);
        class527 var1 = null;
        class101 var2 = new class101();
        try {
            var1 = class218.method2875("", Statics.field1401.field4084, false);
            byte[] var3 = new byte[(int) var1.method8508()];
            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method8524(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }
            var2 = new class101(new class547(var3));
        } catch (Exception var12) {
        }
        try {
            if (var1 != null) {
                var1.method8506();
            }
        } catch (Exception var11) {
        }
        Statics.field1379 = var2;
        String var10 = Statics.field2698;
        class32.field155 = this;
        if (var10 != null) {
            class32.field151 = var10;
        }
        method3988(Statics.field1379.method2494());
        Statics.field1599 = new class71(Statics.field992);
        this.field546 = new class15("tokenRequest", 1, 1);
        class331.method2285(this);
        field521.method4178();
    }

    @ObfuscatedName("fg.hz(I)Lij;")
    public static class232 method2976() {
        return field729;
    }

    @ObfuscatedName("client.bw(B)V")
    public final void method480() {
        field516++;
        this.method1605();
        class384.method3031();
        boolean var1 = false;
        boolean var2 = false;
        if (!class331.field3582.isEmpty()) {
            class445 var3 = (class445) class331.field3582.get(0);
            if (var3 == null) {
                class331.field3582.remove(0);
            } else if (var3.method7560()) {
                if (var3.method7567()) {
                    System.out.println("Error in midimanager.service: " + var3.method7569());
                    var1 = true;
                } else {
                    if (var3.method7572() != null) {
                        class331.field3582.add(1, var3.method7572());
                    }
                    var2 = var3.method7568();
                }
                class331.field3582.remove(0);
            } else {
                var2 = var3.method7568();
            }
        }
        if (var1) {
            class331.field3582.clear();
            Iterator var4 = class331.field3585.iterator();
            label104: while (true) {
                class343 var5;
                do {
                    if (!var4.hasNext()) {
                        class331.field3585.clear();
                        break label104;
                    }
                    var5 = (class343) var4.next();
                } while (var5 == null);
                var5.field3714.method5642();
                var5.field3714.method5613();
                var5.field3714.method5609(0);
                var5.field3714.field3628 = 0;
                int var6 = var5.field3717;
                int var7 = var5.field3706;
                Iterator var8 = class331.field3589.iterator();
                while (var8.hasNext()) {
                    class337 var9 = (class337) var8.next();
                    var9.method1181(var6, var7);
                }
            }
        }
        if (var2 && field762 && Statics.field978 != null) {
            Statics.field978.method800();
        }
        method3115();
        field729.method4053();
        this.method488();
        class36.method3089();
        if (Statics.field1032 != null) {
            int var12 = Statics.field1032.method301();
            field530 = var12;
        }
        if (field512 == 0) {
            method5836();
            class35.method7817();
        } else if (field512 == 5) {
            class78.method5181(this, Statics.field469, Statics.field2095);
            method5836();
            class35.method7817();
        } else if (field512 == 10 || field512 == 11) {
            class78.method5181(this, Statics.field469, Statics.field2095);
        } else if (field512 == 20) {
            class78.method5181(this, Statics.field469, Statics.field2095);
            this.method1193();
        } else if (field512 == 50) {
            class78.method5181(this, Statics.field469, Statics.field2095);
            this.method1193();
        } else if (field512 == 25) {
            if (field510) {
                method5787();
            }
            if (field511) {
                method3525(Statics.field1840);
            }
            if (!field511 && !field510) {
                method3091(30);
            }
        }
        if (field512 == 30) {
            this.method1194();
        } else if (field512 == 40 || field512 == 45) {
            this.method1193();
        }
    }

    @ObfuscatedName("client.bl(ZI)V")
    public final void method509(boolean arg0) {
        if ((field512 == 10 || field512 == 20 || field512 == 30) && field730 != 0L && class327.method4500() > field730) {
            method3988(method1159());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field722[var2] = true;
            }
        }
        if (field512 == 0) {
            this.method542(class78.field930, class78.field931, arg0, Statics.field2096);
        } else if (field512 == 5) {
            class78.method3035(Statics.field2119, Statics.field469, Statics.field2095);
        } else if (field512 == 10 || field512 == 11) {
            class78.method3035(Statics.field2119, Statics.field469, Statics.field2095);
        } else if (field512 == 20) {
            class78.method3035(Statics.field2119, Statics.field469, Statics.field2095);
        } else if (field512 == 50) {
            class78.method3035(Statics.field2119, Statics.field469, Statics.field2095);
        } else if (field512 == 25) {
            if (field576 == 1) {
                if (field779 > field756) {
                    field756 = field779;
                }
                int var3 = (field756 * 50 - field779 * 50) / field756;
                method1085(class379.field4238 + class105.field1360 + class105.field1357 + var3 + "%" + class105.field1358, false);
            } else if (field576 == 2) {
                if (field574 > field535) {
                    field535 = field574;
                }
                int var4 = (field535 * 50 - field574 * 50) / field535 + 50;
                method1085(class379.field4238 + class105.field1360 + class105.field1357 + var4 + "%" + class105.field1358, false);
            } else {
                method1085(class379.field4238, false);
            }
        } else if (field512 == 30) {
            this.method1197();
        } else if (field512 == 40) {
            method1085(class379.field4163 + class105.field1360 + class379.field4233, false);
        } else if (field512 == 45) {
            method1085(class379.field4291, false);
        }
        if (field512 == 30 && field583 == 0 && !arg0 && !field731) {
            for (int var5 = 0; var5 < field641; var5++) {
                if (field723[var5]) {
                    Statics.field4766.method459(field725[var5], field726[var5], field727[var5], field573[var5]);
                    field723[var5] = false;
                }
            }
        } else if (field512 > 0) {
            Statics.field4766.method461(0, 0);
            for (int var6 = 0; var6 < field641; var6++) {
                field723[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.bc(I)V")
    public final void method545() {
        if (Statics.field4481 != null && Statics.field4481.method2713()) {
            Statics.field4481.method2710();
        }
        if (Statics.field519 != null) {
            Statics.field519.field1093 = false;
        }
        Statics.field519 = null;
        field653.method2775();
        class36.method3100();
        Statics.field1032 = null;
        if (Statics.field978 != null) {
            Statics.field978.method793();
        }
        Statics.field2487.method6633();
        class384.method6457();
        if (Statics.field4837 != null) {
            Statics.field4837.method2800();
            Statics.field4837 = null;
        }
        class218.method2281();
        this.field546.method162();
    }

    @ObfuscatedName("bx.hj(I)V")
    public static void method704() {
        field740 = true;
        if (Statics.field4481 != null && Statics.field4481.method2713()) {
            Statics.field4481.method2710();
        }
        method2944();
        method3297();
        if (Statics.field519 != null) {
            Statics.field519.field1093 = false;
        }
        Statics.field519 = null;
        field653.method2775();
        if (Statics.field173 != null) {
            try {
                Statics.field173.method3884();
            } catch (Exception var4) {
            }
        }
        Statics.field173 = null;
        method2358();
        method3732();
        Statics.field92.method2548();
        for (int var1 = 0; var1 < 4; var1++) {
            if (Statics.field92.field1318[var1] != null) {
                Statics.field92.field1318[var1].method4057();
            }
        }
        Statics.field3175 = null;
        class331.method3026(0, 0);
        class331.method4218();
        field762 = false;
        class72.method1098();
        if (Statics.field978 != null) {
            Statics.field978.method793();
        }
        Statics.field2487.method6633();
        class384.method6457();
        if (Statics.field4837 != null) {
            Statics.field4837.method2800();
        }
        class218.method2281();
        class218.field2362 = null;
        class218.field2363 = null;
        Statics.field1807 = null;
        class220.method3270();
        Statics.field225 = null;
        field803.clear();
        field575 = 0;
        Statics.field2487 = new class389();
        Statics.field4837 = new class118(Statics.field4675.field550, 223);
        try {
            class218.method3889("oldschool", Statics.field4619, Statics.field3004.field4075, 0, 23);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
        Statics.field225 = new class483(255, class218.field2362, class218.field2363, 500000);
        Statics.field173 = new class216();
        Statics.field4675.method501();
        method2855(class95.field1158);
        method3091(0);
    }

    @ObfuscatedName("ie.hw(I)V")
    public static void method3732() {
        Statics.field811 = null;
        Statics.field897 = null;
        Statics.field4684 = null;
        Statics.field3020 = null;
        Statics.field4477 = null;
        Statics.field3666 = null;
        Statics.field119 = null;
        Statics.field1409 = null;
        Statics.field4822 = null;
        Statics.field1487 = null;
        Statics.field2527 = null;
    }

    @ObfuscatedName("fa.hm(IB)V")
    public static void method3091(int arg0) {
        if (field512 == arg0) {
            return;
        }
        if (field512 == 30) {
            field741.method4016();
        }
        if (field512 == 0) {
            Statics.field4675.method591();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method430(class69.field481);
            field540 = 0;
            field561 = 0;
            field570.method7644(arg0);
            if (arg0 != 20) {
                method3832(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field4522 != null) {
            Statics.field4522.method7966();
            Statics.field4522 = null;
        }
        if (field512 == 25) {
            field576 = 0;
            field779 = 0;
            field756 = 1;
            field574 = 0;
            field535 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field1379.method2465() >= field638;
            int var3 = var2 ? 0 : 12;
            class78.method2434(Statics.field2729, Statics.field30, true, var3);
        } else if (arg0 == 20) {
            int var1 = field512 == 11 ? 4 : 0;
            class78.method2434(Statics.field2729, Statics.field30, false, var1);
        } else if (arg0 == 11) {
            class78.method2434(Statics.field2729, Statics.field30, false, 4);
        } else if (arg0 == 50) {
            class78.method3460("", "Updating date of birth...", "");
            class78.method2434(Statics.field2729, Statics.field30, false, 7);
        } else if (arg0 != 0 && Statics.field921) {
            Statics.field5034 = null;
            Statics.field5214 = null;
            Statics.field2708 = null;
            Statics.field924 = null;
            Statics.field1968 = null;
            Statics.field4476 = null;
            Statics.field4730 = null;
            Statics.field1648 = null;
            Statics.field926 = null;
            Statics.field5478 = null;
            Statics.field1367 = null;
            Statics.field918 = null;
            Statics.field4604 = null;
            Statics.field1450 = null;
            Statics.field1107.method2437();
            class331.method3026(0, 100);
            method3085().method6622(true);
            Statics.field921 = false;
        }
        field512 = arg0;
    }

    @ObfuscatedName("client.hs(I)V")
    public void method1605() {
        if (field512 != 1000) {
            boolean var1 = Statics.field2487.method6621();
            if (!var1) {
                this.method1191();
            }
        }
    }

    @ObfuscatedName("client.hp(I)V")
    public void method1191() {
        if (Statics.field2487.field4570 >= 4) {
            this.method627("js5crc");
            method3091(1000);
            return;
        }
        if (Statics.field2487.field4571 >= 4) {
            if (field512 <= 5) {
                this.method627("js5io");
                method3091(1000);
                return;
            }
            field538 = 3000;
            Statics.field2487.field4571 = 3;
        }
        if (--field538 + 1 > 0) {
            return;
        }
        try {
            if (field703 == 0) {
                Statics.field130 = Statics.field173.method3871(Statics.field93, Statics.field1833);
                field703++;
            }
            if (field703 == 1) {
                if (Statics.field130.field2397 == 2) {
                    this.method1192(-1);
                    return;
                }
                if (Statics.field130.field2397 == 1) {
                    field703++;
                }
            }
            if (field703 == 2) {
                Socket var1 = (Socket) Statics.field130.field2403;
                class480 var2 = new class480(var1, 40000, 5000);
                Statics.field69 = var2;
                if (field509 >= 223) {
                    class547 var3 = new class547(class324.field3540.field3546 + 1);
                    var3.method8711(class324.field3540.field3537);
                    var3.method8714(223);
                    var3.method8714(field560[0]);
                    var3.method8714(field560[1]);
                    var3.method8714(field560[2]);
                    var3.method8714(field560[3]);
                    Statics.field69.method7965(var3.field5364, 0, class324.field3540.field3546 + 1);
                } else {
                    class547 var4 = new class547(5);
                    var4.method8711(class324.field3540.field3537);
                    var4.method8714(223);
                    Statics.field69.method7965(var4.field5364, 0, 5);
                }
                field703++;
                Statics.field3006 = class327.method4500();
            }
            if (field703 == 3) {
                if (Statics.field69.method7970() > 0) {
                    int var5 = Statics.field69.method7963();
                    if (var5 != 0) {
                        this.method1192(var5);
                        return;
                    }
                    field703++;
                } else if (class327.method4500() - Statics.field3006 > 30000L) {
                    this.method1192(-2);
                    return;
                }
            }
            if (field703 == 4) {
                Statics.field2487.method6623(Statics.field69, field512 > 20);
                Statics.field130 = null;
                Statics.field69 = null;
                field703 = 0;
                field539 = 0;
            }
        } catch (IOException var7) {
            this.method1192(-3);
        }
    }

    @ObfuscatedName("client.hh(II)V")
    public void method1192(int arg0) {
        Statics.field130 = null;
        Statics.field69 = null;
        field703 = 0;
        if (Statics.field1987 == Statics.field1833) {
            Statics.field1833 = Statics.field158;
        } else {
            Statics.field1833 = Statics.field1987;
        }
        field539++;
        if (field539 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field512 <= 5) {
                this.method627("js5connect_full");
                method3091(1000);
            } else {
                field538 = 3000;
            }
        } else if (field539 >= 2 && arg0 == 6) {
            this.method627("js5connect_outofdate");
            method3091(1000);
        } else if (field539 >= 4) {
            if (field512 <= 5) {
                this.method627("js5connect");
                method3091(1000);
            } else {
                field538 = 3000;
            }
        }
    }

    @ObfuscatedName("ed.hb(Loz;Ljava/lang/String;I)V")
    public static void method2872(class385 arg0, String arg1) {
        class86 var2 = new class86(arg0, arg1);
        field803.add(var2);
        field575 += var2.field1056;
    }

    @ObfuscatedName("eo.hv(I)Z")
    public static boolean method2660() {
        if (field803 == null || field514 >= field803.size()) {
            return true;
        }
        while (field514 < field803.size()) {
            class86 var0 = (class86) field803.get(field514);
            if (!var0.method2251()) {
                return false;
            }
            field514++;
        }
        return true;
    }

    @ObfuscatedName("ss.hx(B)I")
    public static int method8054() {
        if (field803 == null || field514 >= field803.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field514; var1++) {
            var0 += ((class86) field803.get(var1)).field1057;
        }
        return var0 * 10000 / field575;
    }

    @ObfuscatedName("hv.hn(III)V")
    public static void method3458(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class278.field2878[var4];
            int var8 = arg1 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (field780 - field650) * var8 / 100 + field650;
            int var10 = var5 * var9 / 256;
            var2[var3] = var7 * var10 >> 16;
        }
        Statics.field5138.field1317.method4976(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("no.ht(I)V")
    public static void method5836() {
        if (field536 == class95.field1158) {
            Statics.field4704 = method3926(class386.field4517.field4519, false, true, true, false);
            Statics.field2101 = method3926(class386.field4520.field4519, true, true, true, false);
            Statics.field30 = method3926(class386.field4501.field4519, false, true, true, false);
            Statics.field2729 = method3926(class386.field4507.field4519, false, true, true, false);
            Statics.field1029 = method3926(class386.field4513.field4519, true, false, true, false);
            Statics.field2525 = method3926(class386.field4510.field4519, false, true, true, false);
            Statics.field2873 = method3926(class386.field4503.field4519, false, true, true, false);
            class78.method2088(20, class379.field4222);
            method2855(class95.field1152);
        } else if (field536 == class95.field1152) {
            byte var0 = 0;
            int var1 = var0 + Statics.field4704.method6488() * 53 / 100;
            int var2 = var1 + Statics.field2101.method6488() * 5 / 100;
            int var3 = var2 + Statics.field30.method6488() * 36 / 100;
            int var4 = var3 + Statics.field2729.method6488() / 100;
            int var5 = var4 + Statics.field1029.method6488() / 100;
            int var6 = var5 + Statics.field2525.method6488() * 3 / 100;
            int var7 = var6 + Statics.field2873.method6488() / 100;
            if (var7 == 100) {
                method2872(Statics.field4704, "Sound FX");
                method2872(Statics.field2101, "Music Tracks");
                method2872(Statics.field30, "Sprites");
                method2872(Statics.field2525, "Music Samples");
                method2872(Statics.field2873, "Music Patches");
                class78.method2088(40, class379.field4134);
                method2855(class95.field1154);
            } else if (var7 != 0) {
                class78.method2088(30, class379.field4133 + var7 + "%");
            }
        } else if (field536 == class95.field1154) {
            class43.method3398(22050, !field662, 2);
            ArrayList var8 = new ArrayList(3);
            class216 var9 = Statics.field173;
            short var10 = 2048;
            if (Statics.field264 == 0) {
                throw new IllegalStateException();
            }
            if (var10 < 256) {
                var10 = 256;
            }
            class43 var12;
            try {
                class43 var11 = Statics.field910.method306();
                var11.field266 = new int[256 * (Statics.field1001 ? 2 : 1)];
                var11.field271 = var10;
                var11.method323();
                var11.field270 = (var10 & 0xFFFFFC00) + 1024;
                if (var11.field270 > 16384) {
                    var11.field270 = 16384;
                }
                var11.method338(var11.field270);
                if (Statics.field4435 > 0 && Statics.field262 == null) {
                    Statics.field262 = new class45();
                    Statics.field269 = Executors.newScheduledThreadPool(1);
                    Statics.field269.scheduleAtFixedRate(Statics.field262, 0L, 10L, TimeUnit.MILLISECONDS);
                }
                if (Statics.field262 != null) {
                    if (Statics.field262.field295[0] != null) {
                        throw new IllegalArgumentException();
                    }
                    Statics.field262.field295[0] = var11;
                }
                var12 = var11;
            } catch (Throwable var91) {
                var12 = new class43();
            }
            Statics.field978 = var12;
            Statics.field2515 = new class39();
            class39 var14 = new class39();
            var14.method711(Statics.field2515);
            for (int var15 = 0; var15 < 3; var15++) {
                class332 var16 = new class332(Statics.field978);
                var16.method5617(9, 128);
                var14.method711(var16);
                var8.add(var16);
            }
            Statics.field978.method818(var14);
            class331.method6481(Statics.field2873, Statics.field2525, Statics.field4704, var8);
            Statics.field1868 = new class58(22050, Statics.field264);
            class78.method2088(60, class379.field4135);
            method2855(class95.field1155);
        } else if (field536 == class95.field1155) {
            if (Statics.field237 == null) {
                Statics.field237 = new class516(Statics.field30, Statics.field1029);
            }
            int var17 = class517.method8417().length;
            field571 = Statics.field237.method8413(class517.method8417());
            if (field571.size() < var17) {
                class78.method2088(80, class379.field4136 + field571.size() * 100 / var17 + "%");
            } else {
                Statics.field469 = (class432) field571.get(class517.field5215);
                Statics.field2095 = (class432) field571.get(class517.field5216);
                Statics.field2119 = (class432) field571.get(class517.field5217);
                Statics.field141 = field657.method8144();
                class78.method2088(80, class379.field4383);
                method2855(class95.field1161);
            }
        } else if (field536 == class95.field1161) {
            class385 var18 = Statics.field2729;
            class385 var19 = Statics.field30;
            int var20 = 0;
            String[] var21 = class78.field956;
            for (int var22 = 0; var22 < var21.length; var22++) {
                String var23 = var21[var22];
                if (var18.method6572(var23, "")) {
                    var20++;
                }
            }
            String[] var24 = class78.field941;
            for (int var25 = 0; var25 < var24.length; var25++) {
                String var26 = var24[var25];
                if (var19.method6572(var26, "")) {
                    var20++;
                }
            }
            String[] var27 = class78.field943;
            for (int var28 = 0; var28 < var27.length; var28++) {
                String var29 = var27[var28];
                if (var19.method6555(var29) != -1 && var19.method6572(var29, "")) {
                    var20++;
                }
            }
            int var32 = class78.method4205(Statics.field30);
            if (var20 < var32) {
                class78.method2088(90, class379.field4340 + var20 * 100 / var32 + "%");
            } else {
                class78.method2088(100, class379.field4139);
                if (Statics.field10) {
                    method3091(5);
                    method2855(class95.field1165);
                } else {
                    method2855(class95.field1149);
                }
            }
        } else if (field536 == class95.field1165) {
            method3091(10);
        } else if (field536 == class95.field1149) {
            Statics.field498 = method3926(class386.field4497.field4519, false, true, true, false);
            Statics.field5070 = method3926(class386.field4498.field4519, false, true, true, false);
            Statics.field462 = method3926(class386.field4499.field4519, true, false, true, false);
            Statics.field1297 = method3926(class386.field4500.field4519, false, true, true, false);
            Statics.field1757 = method3926(class386.field4512.field4519, true, true, true, false);
            Statics.field2666 = method3926(class386.field4504.field4519, false, true, true, false);
            Statics.field2053 = method3926(class386.field4506.field4519, false, true, true, false);
            Statics.field4546 = method3926(class386.field4508.field4519, false, true, true, false);
            Statics.field4978 = method3926(class386.field4509.field4519, false, true, true, false);
            Statics.field1882 = method3926(class386.field4505.field4519, true, true, true, false);
            Statics.field1716 = method3926(class386.field4511.field4519, false, true, true, false);
            Statics.field1685 = method3926(class386.field4515.field4519, false, true, true, false);
            Statics.field3786 = method3926(class386.field4516.field4519, false, true, true, false);
            Statics.field2676 = method3926(class386.field4496.field4519, false, true, true, false);
            Statics.field857 = method3816(class386.field4518.field4519, false, true, true, true, true);
            class78.method2088(20, class379.field4222);
            method2855(class95.field1156);
        } else if (field536 == class95.field1156) {
            byte var33 = 0;
            int var34 = var33 + Statics.field498.method6488() * 5 / 100;
            int var35 = var34 + Statics.field5070.method6488() * 2 / 100;
            int var36 = var35 + Statics.field462.method6488() / 100;
            int var37 = var36 + Statics.field1297.method6488() / 100;
            int var38 = var37 + Statics.field1757.method6488() * 10 / 100;
            int var39 = var38 + Statics.field2666.method6488() * 65 / 100;
            int var40 = var39 + Statics.field2053.method6488() / 100;
            int var41 = var40 + Statics.field4546.method6488() / 100;
            int var42 = var41 + Statics.field4978.method6488() * 6 / 100;
            int var43 = var42 + Statics.field1685.method6488() / 100;
            int var44 = var43 + Statics.field1716.method6488() * 2 / 100;
            int var45 = var44 + Statics.field3786.method6488() * 2 / 100;
            int var46 = var45 + Statics.field2676.method6488() / 100;
            int var47 = var46 + Statics.field857.method6488() / 100;
            int var48 = var47 + (Statics.field1882.method6487() && Statics.field1882.method6559() ? 1 : 0);
            if (var48 == 100) {
                method2872(Statics.field498, "Animations");
                method2872(Statics.field5070, "Skeletons");
                method2872(Statics.field1757, "Maps");
                method2872(Statics.field2666, "Models");
                method2872(Statics.field4546, "Music Jingles");
                method2872(Statics.field1685, "World Map");
                method2872(Statics.field1716, "World Map Geography");
                method2872(Statics.field3786, "World Map Ground");
                Statics.field2498 = new class485();
                Statics.field2498.method8036(Statics.field1882);
                class78.method2088(30, class379.field4134);
                method2855(class95.field1160);
            } else if (var48 != 0) {
                class78.method2088(30, class379.field4133 + var48 + "%");
            }
        } else if (field536 == class95.field1160) {
            Statics.field5138 = new class102(-1, 104, 104, Statics.field1379.method2440());
            Statics.field92 = Statics.field5138;
            Statics.field2058 = new class561(512, 512);
            class78.method2088(30, class379.field4131);
            method2855(class95.field1157);
        } else if (field536 == class95.field1157) {
            if (!Statics.field462.method6559()) {
                class78.method2088(40, class379.field4392 + Statics.field462.method6498() + "%");
            } else if (Statics.field2676.method6559()) {
                class385 var49 = Statics.field462;
                Statics.field2278 = var49;
                class199.method3182(Statics.field462);
                class385 var50 = Statics.field462;
                class385 var51 = Statics.field2666;
                Statics.field1919 = var50;
                Statics.field1918 = var51;
                Statics.field3647 = Statics.field1919.method6549(3);
                class385 var52 = Statics.field462;
                class385 var53 = Statics.field2666;
                boolean var54 = field662;
                Statics.field2153 = var52;
                Statics.field2167 = var53;
                class207.field2185 = var54;
                class385 var55 = Statics.field462;
                class385 var56 = Statics.field2666;
                Statics.field4678 = var55;
                Statics.field1986 = var56;
                class385 var57 = Statics.field462;
                Statics.field2121 = var57;
                Statics.method2878(Statics.field462, Statics.field2666, field503, Statics.field469);
                class210.method2252(Statics.field462, Statics.field498, Statics.field5070);
                class198.method6771(Statics.field462, Statics.field2666);
                class385 var58 = Statics.field462;
                Statics.field2105 = var58;
                class385 var59 = Statics.field462;
                Statics.field1879 = var59;
                Statics.field1875 = Statics.field1879.method6549(16);
                Statics.field4650 = new class350(Statics.field1297, Statics.field2666, Statics.field30, Statics.field1029, Statics.field857);
                class175.method3040(Statics.field462);
                class385 var60 = Statics.field462;
                Statics.field1960 = var60;
                class385 var61 = Statics.field462;
                Statics.field3646 = var61;
                class200.method2061(Statics.field462);
                class203.method825(Statics.field462);
                class538.method2269(Statics.field462);
                class385 var62 = Statics.field462;
                Statics.field5306 = var62;
                Statics.field1864 = new class530(Statics.field1401, 54, Statics.field1514, Statics.field462);
                Statics.field4445 = new class530(Statics.field1401, 47, Statics.field1514, Statics.field462);
                Statics.field4481 = new class113();
                class205.method6463(Statics.field462, Statics.field30, Statics.field1029);
                class385 var63 = Statics.field462;
                class385 var64 = Statics.field30;
                Statics.field1929 = var63;
                Statics.field1930 = var64;
                class385 var65 = Statics.field462;
                class385 var66 = Statics.field30;
                Statics.field1905 = var66;
                if (var65.method6559()) {
                    Statics.field1887 = var65.method6549(35);
                    Statics.field1886 = new class182[Statics.field1887];
                    for (int var67 = 0; var67 < Statics.field1887; var67++) {
                        byte[] var68 = var65.method6539(35, var67);
                        Statics.field1886[var67] = new class182(var67);
                        if (var68 != null) {
                            Statics.field1886[var67].method3292(new class547(var68));
                            Statics.field1886[var67].method3286();
                        }
                    }
                }
                class78.method2088(50, class379.field4283);
                method2855(class95.field1150);
            } else {
                class78.method2088(40, class379.field4392 + (80 + Statics.field4978.method6498() / 6) + "%");
            }
        } else if (field536 == class95.field1150) {
            int var69 = 0;
            if (Statics.field811 == null) {
                Statics.field811 = class562.method6477(Statics.field30, Statics.field2498.field5023, 0);
            } else {
                var69++;
            }
            if (Statics.field897 == null) {
                Statics.field897 = class562.method6477(Statics.field30, Statics.field2498.field5015, 0);
            } else {
                var69++;
            }
            if (Statics.field4684 == null) {
                class385 var70 = Statics.field30;
                int var71 = Statics.field2498.field5016;
                class560[] var72;
                if (class562.method3083(var70, var71, 0)) {
                    class560[] var73 = new class560[Statics.field5474];
                    for (int var74 = 0; var74 < Statics.field5474; var74++) {
                        class560 var75 = var73[var74] = new class560();
                        var75.field5455 = Statics.field5470;
                        var75.field5454 = Statics.field5475;
                        var75.field5450 = Statics.field1488[var74];
                        var75.field5449 = Statics.field1688[var74];
                        var75.field5451 = Statics.field5472[var74];
                        var75.field5452 = Statics.field3267[var74];
                        var75.field5456 = Statics.field5469;
                        var75.field5453 = Statics.field5471[var74];
                    }
                    class562.method6405();
                    var72 = var73;
                } else {
                    var72 = null;
                }
                Statics.field4684 = var72;
            } else {
                var69++;
            }
            if (Statics.field3020 == null) {
                Statics.field3020 = class562.method7834(Statics.field30, Statics.field2498.field5017, 0);
            } else {
                var69++;
            }
            if (Statics.field4477 == null) {
                Statics.field4477 = class562.method7834(Statics.field30, Statics.field2498.field5014, 0);
            } else {
                var69++;
            }
            if (Statics.field3666 == null) {
                Statics.field3666 = class562.method7834(Statics.field30, Statics.field2498.field5019, 0);
            } else {
                var69++;
            }
            if (Statics.field119 == null) {
                Statics.field119 = class562.method7834(Statics.field30, Statics.field2498.field5020, 0);
            } else {
                var69++;
            }
            if (Statics.field1409 == null) {
                Statics.field1409 = class562.method7834(Statics.field30, Statics.field2498.field5021, 0);
            } else {
                var69++;
            }
            if (Statics.field4822 == null) {
                Statics.field4822 = class562.method7834(Statics.field30, Statics.field2498.field5018, 0);
            } else {
                var69++;
            }
            if (Statics.field1487 == null) {
                class385 var77 = Statics.field30;
                int var78 = Statics.field2498.field5022;
                class560[] var79;
                if (class562.method3083(var77, var78, 0)) {
                    class560[] var80 = new class560[Statics.field5474];
                    for (int var81 = 0; var81 < Statics.field5474; var81++) {
                        class560 var82 = var80[var81] = new class560();
                        var82.field5455 = Statics.field5470;
                        var82.field5454 = Statics.field5475;
                        var82.field5450 = Statics.field1488[var81];
                        var82.field5449 = Statics.field1688[var81];
                        var82.field5451 = Statics.field5472[var81];
                        var82.field5452 = Statics.field3267[var81];
                        var82.field5456 = Statics.field5469;
                        var82.field5453 = Statics.field5471[var81];
                    }
                    class562.method6405();
                    var79 = var80;
                } else {
                    var79 = null;
                }
                Statics.field1487 = var79;
            } else {
                var69++;
            }
            if (Statics.field2527 == null) {
                Statics.field2527 = class562.method5596(Statics.field30, Statics.field2498.field5024, 0);
            } else {
                var69++;
            }
            if (var69 < 11) {
                class78.method2088(70, class379.field4142 + var69 * 100 / 12 + "%");
            } else {
                Statics.field4775 = Statics.field2527;
                Statics.field897.method9159();
                int var84 = (int) (Math.random() * 21.0D) - 10;
                int var85 = (int) (Math.random() * 21.0D) - 10;
                int var86 = (int) (Math.random() * 21.0D) - 10;
                int var87 = (int) (Math.random() * 41.0D) - 20;
                Statics.field4684[0].method9138(var84 + var87, var85 + var87, var86 + var87);
                class78.method2088(60, class379.field4143);
                method2855(class95.field1159);
            }
        } else if (field536 == class95.field1159) {
            if (Statics.field2053.method6559()) {
                Statics.field1380 = new class290(Statics.field2053, Statics.field30, 20, Statics.field1379.method2449(), field662 ? 64 : 128);
                class278.method4821(Statics.field1380);
                class278.method4760(Statics.field1379.method2449());
                method2855(class95.field1151);
            } else {
                class78.method2088(70, class379.field4144 + "0%");
            }
        } else if (field536 == class95.field1151) {
            int var88 = Statics.field1380.method5187();
            if (var88 < 100) {
                class78.method2088(80, class379.field4144 + var88 + "%");
            } else {
                class78.method2088(90, class379.field4311);
                method2855(class95.field1153);
            }
        } else if (field536 == class95.field1153) {
            Statics.field519 = new class91();
            Statics.field173.method3880(Statics.field519, 10);
            class78.method2088(92, class379.field4355);
            method2855(class95.field1162);
        } else if (field536 == class95.field1162) {
            if (Statics.field2729.method6572("huffman", "")) {
                class365 var89 = new class365(Statics.field2729.method6558("huffman", ""));
                Statics.field3999 = var89;
                class78.method2088(94, class379.field4148);
                method2855(class95.field1163);
            } else {
                class78.method2088(94, class379.field4147 + "%");
            }
        } else if (field536 == class95.field1163) {
            if (!Statics.field1297.method6559()) {
                class78.method2088(96, class379.field4410 + Statics.field1297.method6498() * 4 / 5 + "%");
            } else if (!Statics.field857.method6559()) {
                class78.method2088(96, class379.field4410 + Statics.field857.method6498() * 4 / 5 + "%");
            } else if (!Statics.field4978.method6559()) {
                class78.method2088(96, class379.field4410 + (80 + Statics.field4978.method6498() / 6) + "%");
            } else if (Statics.field1029.method6559()) {
                class78.method2088(98, class379.field4150);
                if (Statics.field4978.method6544("version.dat", "")) {
                    class547 var90 = new class547(Statics.field4978.method6558("version.dat", ""));
                    var90.method8899();
                }
                method2855(class95.field1164);
            } else {
                class78.method2088(96, class379.field4410 + (96 + Statics.field1029.method6498() / 50) + "%");
            }
        } else if (field536 == class95.field1164) {
            if (Statics.field1685.method6561() <= 0 || Statics.field1685.method6560(class267.field2741.field2738)) {
                if (Statics.field3175 == null) {
                    Statics.field3175 = new class515();
                    Statics.field3175.method8250(Statics.field1685, Statics.field1716, Statics.field3786, Statics.field2119, field571, Statics.field4684);
                }
                class78.method2088(100, class379.field4152);
                if (Statics.field10) {
                    method2855(class95.field1166);
                } else {
                    method2855(class95.field1165);
                }
                field740 = false;
            } else {
                class78.method2088(100, class379.field4297 + Statics.field1685.method6613(class267.field2741.field2738) / 10 + "%");
            }
        } else if (field536 == class95.field1166) {
            Statics.field2096 = false;
            method3091(20);
            method430(class69.field494);
        }
    }

    @ObfuscatedName("jm.hf(B)V")
    public static void method4340() {
        if (Statics.field5138 != null) {
            Statics.field5138.field1317.method4963(Statics.field1379.method2440());
        }
    }

    @ObfuscatedName("em.hi(Ldz;B)V")
    public static void method2855(class95 arg0) {
        if (field536 != arg0) {
            field536 = arg0;
        }
    }

    @ObfuscatedName("iy.hu(IZZZZI)Loz;")
    public static class385 method3926(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class483 var5 = null;
        if (class218.field2362 != null) {
            var5 = new class483(arg0, class218.field2362, Statics.field1807[arg0], 1000000);
        }
        return new class385(var5, Statics.field225, Statics.field2487, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("iq.hc(IZZZZZI)Loz;")
    public static class385 method3816(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
        class483 var6 = null;
        if (class218.field2362 != null) {
            var6 = new class483(arg0, class218.field2362, Statics.field1807[arg0], 1000000);
        }
        return new class385(var6, Statics.field225, Statics.field2487, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("client.hl(B)V")
    public final void method1193() {
        class479 var1 = field653.method2777();
        class546 var2 = field653.field1461;
        try {
            if (Statics.field1573 == class69.field481) {
                if (Statics.field1712 == null && (field559.method2146() || field540 > 250)) {
                    Statics.field1712 = field559.method2143();
                    field559.method2139();
                    field559 = null;
                }
                if (Statics.field1712 != null) {
                    if (var1 != null) {
                        var1.method7966();
                        var1 = null;
                    }
                    Statics.field2539 = null;
                    field569 = false;
                    field540 = 0;
                    if (!field677.method9024()) {
                        method430(class69.field470);
                    } else if (this.method1733()) {
                        try {
                            this.method1392(Statics.field228);
                            method430(class69.field492);
                        } catch (Throwable var62) {
                            class572.method7807((String) null, var62);
                            method3887(65);
                            return;
                        }
                    } else if (this.method1184()) {
                        try {
                            this.method1188(Statics.field104, Statics.field1662);
                            method430(class69.field491);
                        } catch (Exception var61) {
                            class572.method7807((String) null, var61);
                            method3887(65);
                            return;
                        }
                    } else {
                        method3887(65);
                        return;
                    }
                }
            }
            if (Statics.field1573 == class69.field492) {
                if (this.field542 == null) {
                    if (this.field615 == null) {
                        method3887(65);
                        return;
                    }
                    if (!this.field615.method274()) {
                        return;
                    }
                    if (this.field615.method258()) {
                        class572.method7807(this.field615.method263(), (Throwable) null);
                        method3887(65);
                        this.field615 = null;
                        return;
                    }
                    class21 var7 = this.field615.method265();
                    if (var7.method284() != 200) {
                        method3887(65);
                        this.field615 = null;
                        return;
                    }
                    field540 = 0;
                    class495 var8 = new class495(var7.method283());
                    try {
                        Statics.field4695 = var8.method8085().getString("access_token");
                        Statics.field228 = var8.method8085().getString("refresh_token");
                    } catch (Exception var59) {
                        class572.method7807("Error parsing tokens", var59);
                        method3887(65);
                        this.field615 = null;
                        return;
                    }
                } else if (this.field542.isDone()) {
                    if (this.field542.isCancelled()) {
                        method3887(65);
                        this.field542 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field542.get();
                        if (!var5.isSuccess()) {
                            method3887(65);
                            this.field542 = null;
                            return;
                        }
                        Statics.field4695 = var5.getAccessToken();
                        Statics.field228 = var5.getRefreshToken();
                        this.field542 = null;
                    } catch (Exception var60) {
                        class572.method7807((String) null, var60);
                        method3887(65);
                        this.field542 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1187(Statics.field4695);
                method430(class69.field491);
            }
            if (Statics.field1573 == class69.field491) {
                if (this.field711 == null) {
                    if (this.field547 == null) {
                        method3887(65);
                        return;
                    }
                    if (!this.field547.method274()) {
                        return;
                    }
                    if (this.field547.method258()) {
                        class572.method7807(this.field547.method263(), (Throwable) null);
                        method3887(65);
                        this.field547 = null;
                        return;
                    }
                    class21 var12 = this.field547.method265();
                    if (var12.method284() != 200) {
                        class572.method7807("Response code: " + var12.method284() + "Response body: " + var12.method283(), (Throwable) null);
                        method3887(65);
                        this.field547 = null;
                        return;
                    }
                    List var13 = (List) var12.method292().get("Content-Type");
                    if (var13 != null && var13.contains(class493.field5043.method8073())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method283());
                            this.field545 = var14.getString("token");
                        } catch (JSONException var57) {
                            class572.method7807((String) null, var57);
                            method3887(65);
                            this.field547 = null;
                            return;
                        }
                    } else {
                        this.field545 = var12.method283();
                    }
                    this.field547 = null;
                } else if (this.field711.isDone()) {
                    if (this.field711.isCancelled()) {
                        method3887(65);
                        this.field711 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field711.get();
                        if (!var10.isSuccess()) {
                            method3887(65);
                            this.field711 = null;
                            return;
                        }
                        this.field545 = var10.getToken();
                        this.field711 = null;
                    } catch (Exception var58) {
                        class572.method7807((String) null, var58);
                        method3887(65);
                        this.field711 = null;
                        return;
                    }
                } else {
                    return;
                }
                field540 = 0;
                method430(class69.field470);
            }
            if (Statics.field1573 == class69.field470) {
                if (Statics.field2539 == null) {
                    Statics.field2539 = Statics.field173.method3871(Statics.field93, Statics.field1833);
                }
                if (Statics.field2539.field2397 == 2) {
                    throw new IOException();
                }
                if (Statics.field2539.field2397 == 1) {
                    Socket var16 = (Socket) Statics.field2539.field2403;
                    class480 var17 = new class480(var16, 40000, 5000);
                    var1 = var17;
                    field653.method2789(var17);
                    Statics.field2539 = null;
                    method430(class69.field472);
                }
            }
            if (Statics.field1573 == class69.field472) {
                field653.method2781();
                class322 var18 = class322.method4566();
                var18.field3394.method8711(class324.field3545.field3537);
                field653.method2773(var18);
                field653.method2772();
                var2.field5363 = 0;
                method430(class69.field473);
            }
            if (Statics.field1573 == class69.field473) {
                if (Statics.field978 != null) {
                    Statics.field978.method813();
                }
                if (var1.method7961(1)) {
                    int var19 = var1.method7963();
                    if (Statics.field978 != null) {
                        Statics.field978.method813();
                    }
                    if (var19 != 0) {
                        method3887(var19);
                        return;
                    }
                    var2.field5363 = 0;
                    method430(class69.field474);
                }
            }
            if (Statics.field1573 == class69.field474) {
                if (var2.field5363 < 8) {
                    int var20 = var1.method7970();
                    if (var20 > 8 - var2.field5363) {
                        var20 = 8 - var2.field5363;
                    }
                    if (var20 > 0) {
                        var1.method7968(var2.field5364, var2.field5363, var20);
                        var2.field5363 += var20;
                    }
                }
                if (var2.field5363 == 8) {
                    var2.field5363 = 0;
                    Statics.field128 = var2.method8735();
                    method430(class69.field475);
                }
            }
            if (Statics.field1573 == class69.field475) {
                field653.field1461.field5363 = 0;
                field653.method2781();
                class546 var21 = new class546(500);
                int[] var22 = new int[] { Statics.field1712.nextInt(), Statics.field1712.nextInt(), Statics.field1712.nextInt(), Statics.field1712.nextInt() };
                var21.field5363 = 0;
                var21.method8711(1);
                var21.method8714(var22[0]);
                var21.method8714(var22[1]);
                var21.method8714(var22[2]);
                var21.method8714(var22[3]);
                var21.method8936(Statics.field128);
                if (field512 == 40) {
                    var21.method8714(field560[0]);
                    var21.method8714(field560[1]);
                    var21.method8714(field560[2]);
                    var21.method8714(field560[3]);
                } else {
                    if (field512 == 50) {
                        var21.method8711(class129.field1522.method32());
                        var21.method8714(Statics.field1813);
                    } else {
                        var21.method8711(field543.method32());
                        switch(field543.field1523) {
                            case 0:
                                var21.method8714(Statics.field1379.method2470(class78.field939));
                            case 1:
                            default:
                                break;
                            case 2:
                                var21.field5363 += 4;
                                break;
                            case 3:
                            case 4:
                                var21.method8713(Statics.field21);
                                var21.field5363++;
                        }
                    }
                    if (field677.method9024()) {
                        var21.method8711(class552.field5418.method32());
                        var21.method8718(this.field545);
                    } else {
                        var21.method8711(class552.field5420.method32());
                        var21.method8718(class78.field940);
                    }
                }
                var21.method8755(class77.field914, class77.field913);
                field560 = var22;
                class322 var23 = class322.method4566();
                var23.field3394.field5363 = 0;
                if (field512 == 40) {
                    var23.field3394.method8711(class324.field3538.field3537);
                } else {
                    var23.field3394.method8711(class324.field3539.field3537);
                }
                var23.field3394.method8712(0);
                int var24 = var23.field3394.field5363;
                var23.field3394.method8714(223);
                var23.field3394.method8714(1);
                var23.field3394.method8711(field635);
                var23.field3394.method8711(field507);
                byte var25 = 0;
                var23.field3394.method8711(var25);
                var23.field3394.method8721(var21.field5364, 0, var21.field5363);
                int var26 = var23.field3394.field5363;
                var23.field3394.method8718(class78.field939);
                var23.field3394.method8711((field731 ? 1 : 0) << 1 | (field662 ? 1 : 0));
                var23.field3394.method8712(Statics.field890);
                var23.field3394.method8712(Statics.field5);
                method843(var23.field3394);
                var23.field3394.method8718(Statics.field82);
                var23.field3394.method8714(Statics.field2084);
                var23.field3394.method8711(0);
                class547 var27 = new class547(Statics.field141.method8155());
                Statics.field141.method8150(var27);
                var23.field3394.method8721(var27.field5364, 0, var27.field5364.length);
                var23.field3394.method8711(field635);
                var23.field3394.method8714(0);
                if (Statics.field10) {
                    var23.field3394.method8714(Statics.field2101.field4531);
                    var23.field3394.method8709(Statics.field2525.field4531);
                    var23.field3394.method8782(Statics.field1029.field4531);
                    var23.field3394.method8782(Statics.field30.field4531);
                    var23.field3394.method8782(Statics.field2729.field4531);
                    var23.field3394.method8780(Statics.field4704.field4531);
                    var23.field3394.method8780(Statics.field2873.field4531);
                } else {
                    var23.field3394.method8714(Statics.field2525.field4531);
                    var23.field3394.method8780(Statics.field1029.field4531);
                    var23.field3394.method8780(Statics.field1757.field4531);
                    var23.field3394.method8709(Statics.field5070.field4531);
                    var23.field3394.method8714(Statics.field4704.field4531);
                    var23.field3394.method8709(Statics.field3786.field4531);
                    var23.field3394.method8709(Statics.field1685.field4531);
                    var23.field3394.method8780(0);
                    var23.field3394.method8714(Statics.field462.field4531);
                    var23.field3394.method8782(Statics.field4978.field4531);
                    var23.field3394.method8714(Statics.field1716.field4531);
                    var23.field3394.method8714(Statics.field1882.field4531);
                    var23.field3394.method8714(Statics.field2666.field4531);
                    var23.field3394.method8714(Statics.field2101.field4531);
                    var23.field3394.method8782(Statics.field2873.field4531);
                    var23.field3394.method8780(Statics.field4546.field4531);
                    var23.field3394.method8780(Statics.field1297.field4531);
                    var23.field3394.method8782(Statics.field498.field4531);
                    var23.field3394.method8709(Statics.field2053.field4531);
                    var23.field3394.method8709(Statics.field2729.field4531);
                    var23.field3394.method8780(Statics.field30.field4531);
                }
                var23.field3394.method8753(var22, var26, var23.field3394.field5363);
                var23.field3394.method8921(var23.field3394.field5363 - var24);
                field653.method2773(var23);
                field653.method2772();
                field653.field1456 = new class564(var22);
                int[] var28 = new int[4];
                for (int var29 = 0; var29 < 4; var29++) {
                    var28[var29] = var22[var29] + 50;
                }
                var2.method8670(var28);
                method430(class69.field497);
            }
            if (Statics.field1573 == class69.field497 && var1.method7970() > 0) {
                int var30 = var1.method7963();
                if (var30 == 61) {
                    int var31 = var1.method7970();
                    Statics.field1502 = var31 == 1 && var1.method7963() == 1;
                    method430(class69.field475);
                }
                if (var30 == 21 && field512 == 20) {
                    method430(class69.field482);
                } else if (var30 == 2) {
                    if (Statics.field10) {
                        method430(class69.field493);
                    } else {
                        method430(class69.field479);
                    }
                } else if (var30 == 15 && field512 == 40) {
                    field653.field1459 = -1;
                    method430(class69.field490);
                } else if (var30 == 64) {
                    method430(class69.field480);
                } else if (var30 == 23 && field561 < 1) {
                    field561++;
                    method430(class69.field481);
                } else if (var30 == 29) {
                    method430(class69.field476);
                } else if (var30 == 69) {
                    method430(class69.field477);
                } else {
                    method3887(var30);
                    return;
                }
            }
            if (Statics.field1573 == class69.field493) {
                Statics.field2096 = true;
                method2855(class95.field1149);
                method3091(0);
            }
            if (Statics.field1573 == class69.field477 && var1.method7970() >= 2) {
                var1.method7968(var2.field5364, 0, 2);
                var2.field5363 = 0;
                Statics.field2085 = var2.method8899();
                method430(class69.field488);
            }
            if (Statics.field1573 == class69.field488 && var1.method7970() >= Statics.field2085) {
                var2.field5363 = 0;
                var1.method7968(var2.field5364, var2.field5363, Statics.field2085);
                class7[] var32 = new class7[] { class7.field20 };
                class7 var33 = var32[var2.method8804()];
                try {
                    switch(var33.field18) {
                        case 0:
                            class1 var34 = new class1();
                            this.field562 = new class8(var2, var34);
                            method430(class69.field471);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var56) {
                    method3887(22);
                    return;
                }
            }
            if (Statics.field1573 == class69.field471 && this.field562.method40()) {
                this.field534 = this.field562.method42();
                this.field562.method41();
                this.field562 = null;
                if (this.field534 == null) {
                    method3887(22);
                    return;
                }
                field653.method2781();
                class322 var37 = class322.method4566();
                var37.field3394.method8711(class324.field3541.field3537);
                var37.field3394.method8712(this.field534.field5363);
                var37.field3394.method8958(this.field534);
                field653.method2773(var37);
                field653.method2772();
                this.field534 = null;
                method430(class69.field497);
            }
            if (Statics.field1573 == class69.field480 && var1.method7970() > 0) {
                Statics.field478 = var1.method7963();
                method430(class69.field489);
            }
            if (Statics.field1573 == class69.field489 && var1.method7970() >= Statics.field478) {
                var1.method7968(var2.field5364, 0, Statics.field478);
                var2.field5363 = 0;
                method430(class69.field497);
            }
            if (Statics.field1573 == class69.field482 && var1.method7970() > 0) {
                field709 = (var1.method7963() + 3) * 60;
                method430(class69.field483);
            }
            if (Statics.field1573 == class69.field483) {
                field540 = 0;
                class78.method3460(class379.field4159, class379.field4306, field709 / 60 + class379.field4122);
                if (--field709 <= 0) {
                    method430(class69.field481);
                }
            } else if (Statics.field1573 == class69.field494) {
                class322 var38 = class322.method4566();
                var38.field3394.method8711(class324.field3542.field3537);
                var38.field3394.method8712(class324.field3542.field3546);
                method5391(var38);
                field653.method2773(var38);
                field653.method2772();
                method430(class69.field479);
            } else {
                if (Statics.field1573 == class69.field479 && var1.method7970() >= 1) {
                    Statics.field4641 = var1.method7963();
                    if (Statics.field4641 != class324.field3543.field3546) {
                        method3887(Statics.field4641);
                        return;
                    }
                    method430(class69.field485);
                }
                if (Statics.field1573 == class69.field485 && var1.method7970() >= Statics.field4641) {
                    boolean var39 = var1.method7963() == 1;
                    var1.method7968(var2.field5364, 0, 4);
                    var2.field5363 = 0;
                    boolean var40 = false;
                    if (var39) {
                        int var41 = var2.method8703() << 24;
                        int var42 = var41 | var2.method8703() << 16;
                        int var43 = var42 | var2.method8703() << 8;
                        int var44 = var43 | var2.method8703();
                        Statics.field1379.method2468(class78.field939, var44);
                    }
                    if (field558) {
                        Statics.field1379.method2462(class78.field939);
                    } else {
                        Statics.field1379.method2462((String) null);
                    }
                    class101.method2966();
                    field680 = var1.method7963();
                    field682 = var1.method7963() == 1;
                    field707 = var1.method7963();
                    field707 <<= 0x8;
                    field707 += var1.method7963();
                    field629 = var1.method7963();
                    var1.method7968(var2.field5364, 0, 8);
                    var2.field5363 = 0;
                    this.field563 = var2.method8735();
                    var1.method7968(var2.field5364, 0, 8);
                    var2.field5363 = 0;
                    field630 = var2.method8735();
                    var1.method7968(var2.field5364, 0, 8);
                    var2.field5363 = 0;
                    field631 = var2.method8735();
                    class223.method7422().method3953(this.field550);
                    method430(class69.field486);
                }
                if (Statics.field1573 == class69.field486 && var1.method7970() >= field653.field1459) {
                    var1.method7968(var2.field5364, 0, 1);
                    var2.field5363 = 0;
                    if (var2.method8675()) {
                        var1.method7968(var2.field5364, 1, 1);
                        var2.field5363 = 0;
                    }
                    class323[] var45 = class323.method3096();
                    int var46 = var2.method8692();
                    if (var46 < 0 || var46 >= var45.length) {
                        throw new IOException("Invalid ServerProt: " + var46 + " at " + var2.field5363);
                    }
                    field653.field1464 = var45[var46];
                    field653.field1459 = field653.field1464.field3474;
                    var1.method7968(var2.field5364, 0, 2);
                    var2.field5363 = 0;
                    field653.field1459 = var2.method8899();
                    try {
                        client var47 = Statics.field4675;
                        JSObject.getWindow(var47).call("zap", (Object[]) null);
                    } catch (Throwable var55) {
                    }
                    method430(class69.field487);
                }
                if (Statics.field1573 != class69.field487) {
                    if (Statics.field1573 == class69.field476 && var1.method7970() >= 2) {
                        var2.field5363 = 0;
                        var1.method7968(var2.field5364, 0, 2);
                        var2.field5363 = 0;
                        Statics.field1790 = var2.method8899();
                        method430(class69.field484);
                    }
                    if (Statics.field1573 == class69.field484 && var1.method7970() >= Statics.field1790) {
                        var2.field5363 = 0;
                        var1.method7968(var2.field5364, 0, Statics.field1790);
                        var2.field5363 = 0;
                        String var49 = var2.method8739();
                        String var50 = var2.method8739();
                        String var51 = var2.method8739();
                        class78.method3460(var49, var50, var51);
                        method3091(10);
                        if (field677.method9024()) {
                            class78.method3187(9);
                        }
                    }
                    if (Statics.field1573 == class69.field490) {
                        if (field653.field1459 == -1) {
                            if (var1.method7970() < 2) {
                                return;
                            }
                            var1.method7968(var2.field5364, 0, 2);
                            var2.field5363 = 0;
                            field653.field1459 = var2.method8899();
                        }
                        if (var1.method7970() >= field653.field1459) {
                            var1.method7968(var2.field5364, 0, field653.field1459);
                            var2.field5363 = 0;
                            int var52 = field653.field1459;
                            field570.method7643();
                            field653.method2781();
                            field653.field1461.field5363 = 0;
                            field653.field1464 = null;
                            field653.field1463 = null;
                            field653.field1460 = null;
                            field653.field1465 = null;
                            field653.field1459 = 0;
                            field653.field1458 = 0;
                            field524 = 0;
                            field577 = 0;
                            field647 = false;
                            field755 = 0;
                            field753 = 0;
                            Statics.field5138.method2551();
                            class87.field1064 = new class521(32);
                            method3091(30);
                            for (int var53 = 0; var53 < 100; var53++) {
                                field722[var53] = true;
                            }
                            method5771();
                            Statics.field5138.field1320.method2671(var2, true);
                            if (var2.field5363 != var52) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field540++;
                        if (field540 > 2000) {
                            if (field561 < 1) {
                                if (Statics.field1987 == Statics.field1833) {
                                    Statics.field1833 = Statics.field158;
                                } else {
                                    Statics.field1833 = Statics.field1987;
                                }
                                field561++;
                                method430(class69.field481);
                            } else {
                                method3887(-3);
                            }
                        }
                    }
                } else if (var1.method7970() >= field653.field1459) {
                    var2.field5363 = 0;
                    var1.method7968(var2.field5364, 0, field653.field1459);
                    field570.method7641();
                    method3297();
                    Statics.field5138.field1320.method2671(var2, true);
                    Statics.field4085 = Statics.field297;
                    Statics.field2916 = -1;
                    method5541(false, var2);
                    field653.field1464 = null;
                    field676 = false;
                }
            }
        } catch (IOException var63) {
            if (field561 < 1) {
                if (Statics.field1987 == Statics.field1833) {
                    Statics.field1833 = Statics.field158;
                } else {
                    Statics.field1833 = Statics.field1987;
                }
                field561++;
                method430(class69.field481);
            } else {
                method3887(-2);
            }
        }
    }

    @ObfuscatedName("lm.hd(Lmb;I)V")
    public static void method5391(class322 arg0) {
        arg0.field3394.method8780(Statics.field2666.field4531);
        arg0.field3394.method8780(Statics.field4546.field4531);
        arg0.field3394.method8709(Statics.field2053.field4531);
        arg0.field3394.method8714(Statics.field462.field4531);
        arg0.field3394.method8782(Statics.field1685.field4531);
        arg0.field3394.method8780(Statics.field1882.field4531);
        arg0.field3394.method8709(Statics.field3786.field4531);
        arg0.field3394.method8709(Statics.field1757.field4531);
        arg0.field3394.method8709(Statics.field4978.field4531);
        arg0.field3394.method8714(0);
        arg0.field3394.method8782(Statics.field1716.field4531);
        arg0.field3394.method8714(Statics.field5070.field4531);
        arg0.field3394.method8782(Statics.field1297.field4531);
        arg0.field3394.method8709(Statics.field498.field4531);
    }

    @ObfuscatedName("gg.hk(I)V")
    public static void method3297() {
        field518 = 1L;
        if (Statics.field519 != null) {
            Statics.field519.field1095 = 0;
        }
        Statics.field5071 = true;
        field523 = true;
        field745 = -1L;
        class37.field227 = new class409();
        field653.method2781();
        field653.field1461.field5363 = 0;
        field653.field1464 = null;
        field653.field1463 = null;
        field653.field1460 = null;
        field653.field1465 = null;
        field653.field1459 = 0;
        field653.field1458 = 0;
        field524 = 0;
        field624 = 0;
        field525 = 0;
        field577 = 0;
        field647 = false;
        class36.field207 = 0;
        class114.method2399();
        field589 = 0;
        field667 = false;
        field757 = 0;
        field590 = 0;
        field595 = 0;
        Statics.field5031 = null;
        field755 = 0;
        field633 = -1;
        field753 = 0;
        field754 = 0;
        field793 = class107.field1383;
        field766 = class107.field1383;
        Statics.field5138.method2548();
        Statics.field1599.method1867();
        if (Statics.field1875 > 5000) {
        }
        if (field740) {
            Arrays.fill(class347.field3729, 0);
            Arrays.fill(class347.field3731, 0);
        } else {
            for (int var0 = 0; var0 < Statics.field1875; var0++) {
                class180 var1 = class180.method3920(var0);
                if (var1 != null) {
                    class347.field3729[var0] = 0;
                    class347.field3731[var0] = 0;
                }
            }
        }
        if (Statics.field4481 != null) {
            Statics.field4481.method2708();
        }
        field681 = -1;
        if (field567 != -1) {
            Statics.field4650.method5888(field567);
        }
        for (class89 var2 = (class89) field673.method8467(); var2 != null; var2 = (class89) field673.method8471()) {
            method6484(var2, true);
        }
        field567 = -1;
        field673 = new class521(8);
        field582 = null;
        field577 = 0;
        field647 = false;
        field790.method5917((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var3 = 0; var3 < 8; var3++) {
            field687[var3] = null;
            field639[var3] = false;
        }
        class87.field1064 = new class521(32);
        field515 = true;
        for (int var4 = 0; var4 < 100; var4++) {
            field722[var4] = true;
        }
        method5771();
        Statics.field382 = null;
        Statics.field1649 = null;
        Arrays.fill(field746, (Object) null);
        Statics.field2869 = null;
        Arrays.fill(field747, (Object) null);
        for (int var5 = 0; var5 < 8; var5++) {
            field794[var5] = new class397();
        }
        Statics.field2634 = null;
    }

    @ObfuscatedName("ik.ha(II)V")
    public static void method3887(int arg0) {
        int var1 = class78.field934;
        if (arg0 == -3) {
            class78.method3460(class379.field4428, class379.field4179, class379.field4164);
        } else if (arg0 == -2) {
            class78.method3460(class379.field4165, class379.field4166, class379.field4217);
        } else if (arg0 == -1) {
            class78.method3460(class379.field4427, class379.field4169, class379.field4393);
        } else if (arg0 == 3) {
            class78.method3187(3);
            class78.field933 = 1;
        } else if (arg0 == 4) {
            class78.method3187(14);
            class78.field932 = 0;
        } else if (arg0 == 5) {
            class78.field933 = 2;
            class78.method3460(class379.field4174, class379.field4175, class379.field4176);
        } else if (arg0 == 68) {
            if (!field676) {
                field676 = true;
                method704();
                return;
            }
            class78.method3460(class379.field4285, class379.field4178, class379.field4145);
        } else if (!field508 && arg0 == 6) {
            class78.method3460(class379.field4285, class379.field4178, class379.field4145);
        } else if (arg0 == 7) {
            class78.method3460(class379.field4180, class379.field4181, class379.field4182);
        } else if (arg0 == 8) {
            class78.method3460(class379.field4319, class379.field4184, class379.field4185);
        } else if (arg0 == 9) {
            class78.method3460(class379.field4186, class379.field4187, class379.field4125);
        } else if (arg0 == 10) {
            class78.method3460(class379.field4189, class379.field4160, class379.field4137);
        } else if (arg0 == 11) {
            class78.method3460(class379.field4192, class379.field4193, class379.field4258);
        } else if (arg0 == 12) {
            class78.method3460(class379.field4195, class379.field4196, class379.field4197);
        } else if (arg0 == 13) {
            class78.method3460(class379.field4151, class379.field4199, class379.field4200);
        } else if (arg0 == 14) {
            class78.method3460(class379.field4201, class379.field4301, class379.field4203);
        } else if (arg0 == 16) {
            class78.method3460(class379.field4204, class379.field4205, class379.field4277);
            class78.method3187(33);
        } else if (arg0 == 17) {
            class78.method3460(class379.field4207, class379.field4208, class379.field4141);
        } else if (arg0 == 18) {
            class78.method3187(14);
            class78.field932 = 1;
        } else if (arg0 == 19) {
            class78.method3460(class379.field4213, class379.field4214, class379.field4215);
        } else if (arg0 == 20) {
            class78.method3460(class379.field4219, class379.field4397, class379.field4218);
        } else if (arg0 == 22) {
            class78.method3460(class379.field4257, class379.field4220, class379.field4221);
        } else if (arg0 == 23) {
            class78.method3460(class379.field4168, class379.field4371, class379.field4224);
        } else if (arg0 == 24) {
            class78.method3460(class379.field4293, class379.field4226, class379.field4227);
        } else if (arg0 == 25) {
            class78.method3460(class379.field4132, class379.field4229, class379.field4230);
        } else if (arg0 == 26) {
            class78.method3460(class379.field4382, class379.field4252, class379.field4216);
        } else if (arg0 == 27) {
            class78.method3460(class379.field4362, class379.field4235, class379.field4236);
        } else if (arg0 == 31) {
            class78.method3460(class379.field4161, class379.field4244, class379.field4245);
        } else if (arg0 == 32) {
            class78.method3187(14);
            class78.field932 = 2;
        } else if (arg0 == 37) {
            class78.method3460(class379.field4249, class379.field4191, class379.field4251);
        } else if (arg0 == 38) {
            class78.method3460(class379.field4422, class379.field4253, class379.field4359);
        } else if (arg0 == 74) {
            class78.method3460(class379.field4255, class379.field4256, class379.field4120);
        } else if (arg0 == 55) {
            class78.method3187(8);
        } else if (arg0 == 56) {
            class78.method3460(class379.field4262, class379.field4332, class379.field4264);
            method3091(11);
            return;
        } else if (arg0 == 57) {
            class78.method3460(class379.field4265, class379.field4146, class379.field4267);
            method3091(11);
            return;
        } else if (arg0 == 61) {
            class78.method3460("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class78.method3187(7);
        } else if (arg0 == 62) {
            method3091(10);
            class78.method3187(9);
            class78.method3460(class379.field4268, class379.field4269, class379.field4270);
            return;
        } else if (arg0 == 63) {
            method3091(10);
            class78.method3187(9);
            class78.method3460(class379.field4429, class379.field4272, class379.field4273);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method3091(10);
            class78.method3187(9);
            class78.method3460(class379.field4274, class379.field4275, class379.field4276);
            return;
        } else if (arg0 == 71) {
            method3091(10);
            class78.method3187(7);
            class78.method3460("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method3091(10);
            class78.method3187(6);
            class78.method3460(class379.field4405, class379.field4194, class379.field4407);
        } else if (arg0 == 72) {
            method3091(10);
            class78.method3187(32);
        } else {
            class78.method3460(class379.field4228, class379.field4177, class379.field4279);
        }
        method3091(10);
        int var4 = class78.field934;
        boolean var5 = var1 != var4;
        if (!var5 && field677.method9024()) {
            class78.method3187(9);
        }
    }

    @ObfuscatedName("fd.hg(B)V")
    public static final void method3010() {
        field653.method2775();
        method2358();
        Statics.field5138.method2548();
        field741.method4016();
        System.gc();
        class331.method3026(0, 0);
        class331.method4218();
        field762 = false;
        class72.method1098();
        method3091(10);
        field517 = 0;
        class223.method7422().method3932();
        class223.method7422().method3933();
    }

    @ObfuscatedName("cr.ho(IB)V")
    public static final void method2048(int arg0) {
        method3010();
        switch(arg0) {
            case 1:
                class78.method871();
                break;
            case 2:
                class78.method3187(24);
                class78.method3460(class379.field4188, class379.field4231, class379.field4351);
        }
    }

    @ObfuscatedName("rx.he(B)J")
    public static long method7663() {
        return field630;
    }

    @ObfuscatedName("it.ie(I)J")
    public static long method4029() {
        return field631;
    }

    @ObfuscatedName("dy.ii(I)V")
    public static final void method2358() {
        class187.field1949.method5500();
        class189.method3380();
        class178.method2767();
        class540.method5463();
        class538.field5296.method5500();
        class188.field1958.method5500();
        class209.field2272.method5500();
        class199.field2087.method5500();
        class185.field1933.method5500();
        class185.field1932.method5500();
        class205.field2126.method5500();
        class205.field2127.method5500();
        class205.field2128.method5500();
        class177.field1866.method5500();
        class184.field1923.method5500();
        class175.method5912();
        class207.method8058();
        class182.method281();
        class190.method2699();
        class193.field1995.method5500();
        class193.field1988.method5500();
        class208.field2214.method5500();
        class208.field2219.method5500();
        class208.field2213.method5500();
        class203.field2118.method5500();
        class210.field2303.method5500();
        class210.field2293.method5500();
        class210.field2294.method5500();
        class198.method4469();
        class204.field2120.method5500();
        class201.method3081();
        if (Statics.field1864 != null) {
            Statics.field1864.method8560();
        }
        if (Statics.field4445 != null) {
            Statics.field4445.method8560();
        }
        class194.field2037.method5500();
        class196.field2052.method5500();
        class183.method275();
        class181.field1883.method5500();
        class176.method7979();
        class179.field1873.method5500();
        class202.field2111.method5500();
        class180.method2287();
        class200.field2100.method5500();
        field797.method5500();
        field798.method5500();
        class356.method2057();
        if (Statics.field4650 != null) {
            Statics.field4650.method5892();
        }
        if (class278.field2877.field3195 != null) {
            ((class290) class278.field2877.field3195).method5193();
        }
        class81.field1008.method5500();
        field796.method7731();
        if (Statics.field498 != null) {
            Statics.field498.method6595();
        }
        if (Statics.field5070 != null) {
            Statics.field5070.method6595();
        }
        if (Statics.field2729 != null) {
            Statics.field2729.method6595();
        }
        if (Statics.field4978 != null) {
            Statics.field4978.method6595();
        }
        if (Statics.field462 != null) {
            Statics.field462.method6595();
        }
        if (Statics.field2676 != null) {
            Statics.field2676.method6595();
        }
        if (Statics.field1882 != null) {
            Statics.field1882.method6595();
        }
        if (Statics.field1029 != null) {
            Statics.field1029.method6595();
        }
        if (Statics.field1297 != null) {
            Statics.field1297.method6595();
        }
        if (Statics.field857 != null) {
            Statics.field857.method6595();
        }
        if (Statics.field4704 != null) {
            Statics.field4704.method6595();
        }
        if (Statics.field4546 != null) {
            Statics.field4546.method6595();
        }
        if (Statics.field1757 != null) {
            Statics.field1757.method6595();
        }
        if (Statics.field2101 != null) {
            Statics.field2101.method6595();
        }
        if (Statics.field2666 != null) {
            Statics.field2666.method6595();
        }
        if (Statics.field2873 != null) {
            Statics.field2873.method6595();
        }
        if (Statics.field30 != null) {
            Statics.field30.method6595();
        }
        if (Statics.field2053 != null) {
            Statics.field2053.method6595();
        }
        if (Statics.field2525 != null) {
            Statics.field2525.method6595();
        }
        if (Statics.field3786 != null) {
            Statics.field3786.method6595();
        }
        if (Statics.field1716 != null) {
            Statics.field1716.method6595();
        }
        if (Statics.field1685 != null) {
            Statics.field1685.method6595();
        }
    }

    @ObfuscatedName("fv.id(I)V")
    public static final void method2944() {
        Statics.field1919 = null;
        Statics.field1918 = null;
        Statics.field3647 = 0;
    }

    @ObfuscatedName("fw.io(I)V")
    public static final void method2913() {
        if (field624 > 0) {
            method3010();
        } else {
            field570.method7648();
            method3091(40);
            Statics.field4522 = field653.method2777();
            field653.method2776();
        }
    }

    @ObfuscatedName("is.iq(ZS)V")
    public static final void method3832(boolean arg0) {
        if (arg0) {
            field543 = class78.field925 ? class129.field1521 : class129.field1526;
        } else {
            field543 = Statics.field1379.method2469(class78.field939) ? class129.field1525 : class129.field1520;
        }
    }

    @ObfuscatedName("client.is(I)V")
    public final void method1194() {
        if (field524 > 1) {
            field524--;
        }
        if (field624 > 0) {
            field624--;
        }
        if (field569) {
            field569 = false;
            method2913();
            return;
        }
        if (!field647) {
            method839();
        }
        for (int var1 = 0; var1 < 100 && this.method1200(field653); var1++) {
        }
        if (field512 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field227.method6842();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field570.field4860) {
                    class322 var6 = class322.method3236(class320.field3321, field653.field1456);
                    var6.field3394.method8711(0);
                    int var7 = var6.field3394.field5363;
                    field570.method7646(var6.field3394);
                    var6.field3394.method8776(var6.field3394.field5363 - var7);
                    field653.method2773(var6);
                    field570.method7642();
                }
                Object var8 = Statics.field519.field1094;
                synchronized (Statics.field519.field1094) {
                    if (!field603) {
                        Statics.field519.field1095 = 0;
                    } else if (class36.field220 != 0 || Statics.field519.field1095 >= 40) {
                        class322 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field519.field1095 && (var9 == null || var9.field3394.field5363 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field519.field1098[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field519.field1097[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field520 != var16 || field808 != var15) {
                                if (var9 == null) {
                                    var9 = class322.method3236(class320.field3315, field653.field1456);
                                    var9.field3394.method8711(0);
                                    var10 = var9.field3394.field5363;
                                    var9.field3394.field5363 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field522 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field520;
                                    var18 = var15 - field808;
                                    var19 = (int) ((Statics.field519.field1096[var14] - field522) / 20L);
                                    var12 = (int) ((Statics.field519.field1096[var14] - field522) % 20L + (long) var12);
                                }
                                field520 = var16;
                                field808 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3394.method8712((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3394.method8711(var19 + 128);
                                    var9.field3394.method8712((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3394.method8711(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3394.method8714(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3394.method8714(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3394.method8712((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3394.method8714(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3394.method8714(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field522 = Statics.field519.field1096[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3394.method8776(var9.field3394.field5363 - var10);
                            int var20 = var9.field3394.field5363;
                            var9.field3394.field5363 = var10;
                            var9.field3394.method8711(var12 / var13);
                            var9.field3394.method8711(var12 % var13);
                            var9.field3394.field5363 = var20;
                            field653.method2773(var9);
                        }
                        if (var11 >= Statics.field519.field1095) {
                            Statics.field519.field1095 = 0;
                        } else {
                            Statics.field519.field1095 -= var11;
                            System.arraycopy(Statics.field519.field1097, var11, Statics.field519.field1097, 0, Statics.field519.field1095);
                            System.arraycopy(Statics.field519.field1098, var11, Statics.field519.field1098, 0, Statics.field519.field1095);
                            System.arraycopy(Statics.field519.field1096, var11, Statics.field519.field1096, 0, Statics.field519.field1095);
                        }
                    }
                }
                if (class36.field220 == 1 || !Statics.field828 && class36.field220 == 4 || class36.field220 == 2) {
                    long var22 = class36.field210 - field518 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field518 = class36.field210 * -1L;
                    int var24 = class36.field215;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field5) {
                        var24 = Statics.field5;
                    }
                    int var25 = class36.field223;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field890) {
                        var25 = Statics.field890;
                    }
                    int var26 = (int) var22;
                    class322 var27 = class322.method3236(class320.field3297, field653.field1456);
                    var27.field3394.method8712((var26 << 1) + (class36.field220 == 2 ? 1 : 0));
                    var27.field3394.method8712(var25);
                    var27.field3394.method8712(var24);
                    field653.method2773(var27);
                }
                if (field530 != 0) {
                    class322 var28 = class322.method3236(class320.field3358, field653.field1456);
                    var28.field3394.method8712(field530);
                    field653.method2773(var28);
                }
                if (field729.field2451 > 0) {
                    class322 var29 = class322.method3236(class320.field3280, field653.field1456);
                    var29.field3394.method8712(0);
                    int var30 = var29.field3394.field5363;
                    long var31 = class327.method4500();
                    for (int var33 = 0; var33 < field729.field2451; var33++) {
                        long var34 = var31 - field745;
                        if (var34 > 16777215L) {
                            var34 = 16777215L;
                        }
                        field745 = var31;
                        var29.field3394.method8927(field729.field2458[var33]);
                        var29.field3394.method8713((int) var34);
                    }
                    var29.field3394.method8921(var29.field3394.field5363 - var30);
                    field653.method2773(var29);
                }
                if (field651 > 0) {
                    field651--;
                }
                if (field729.method4036(96) || field729.method4036(97) || field729.method4036(98) || field729.method4036(99)) {
                    field605 = true;
                }
                if (field605 && field651 <= 0) {
                    field651 = 20;
                    field605 = false;
                    class322 var36 = class322.method3236(class320.field3365, field653.field1456);
                    var36.field3394.method8768(field590);
                    var36.field3394.method8938(field632);
                    field653.method2773(var36);
                }
                if (Statics.field5071 && !field523) {
                    field523 = true;
                    class322 var37 = class322.method3236(class320.field3354, field653.field1456);
                    var37.field3394.method8711(1);
                    field653.method2773(var37);
                }
                if (!Statics.field5071 && field523) {
                    field523 = false;
                    class322 var38 = class322.method3236(class320.field3354, field653.field1456);
                    var38.field3394.method8711(0);
                    field653.method2773(var38);
                }
                if (Statics.field3175 != null) {
                    Statics.field3175.method8201();
                }
                method6767();
                method4537();
                if (field633 != Statics.field5138.field1319) {
                    field633 = Statics.field5138.field1319;
                    int var39 = Statics.field5138.field1319;
                    int[] var40 = Statics.field2058.field5466;
                    int var41 = var40.length;
                    for (int var42 = 0; var42 < var41; var42++) {
                        var40[var42] = 0;
                    }
                    for (int var43 = 1; var43 < 103; var43++) {
                        int var44 = (103 - var43) * 2048 + 24628;
                        for (int var45 = 1; var45 < 103; var45++) {
                            if ((Statics.field5138.field1326[var39][var45][var43] & 0x18) == 0) {
                                Statics.field5138.field1317.method4938(var40, var44, 512, var39, var45, var43);
                            }
                            if (var39 < 3 && (Statics.field5138.field1326[var39 + 1][var45][var43] & 0x8) != 0) {
                                Statics.field5138.field1317.method4938(var40, var44, 512, var39 + 1, var45, var43);
                            }
                            var44 += 4;
                        }
                    }
                    int var46 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var47 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field2058.method9158();
                    for (int var48 = 1; var48 < 103; var48++) {
                        for (int var49 = 1; var49 < 103; var49++) {
                            if ((Statics.field5138.field1326[var39][var49][var48] & 0x18) == 0) {
                                method5806(var39, var49, var48, var46, var47);
                            }
                            if (var39 < 3 && (Statics.field5138.field1326[var39 + 1][var49][var48] & 0x8) != 0) {
                                method5806(var39 + 1, var49, var48, var46, var47);
                            }
                        }
                    }
                    field513 = 0;
                    for (int var50 = 0; var50 < 104; var50++) {
                        for (int var51 = 0; var51 < 104; var51++) {
                            long var52 = Statics.field5138.field1317.method5058(Statics.field5138.field1319, var50, var51);
                            if (var52 != 0L) {
                                int var54 = class295.method4017(var52);
                                int var55 = class207.method95(var54).field2181;
                                if (var55 >= 0 && class182.method3196(var55).field1901) {
                                    field555[field513] = class182.method3196(var55).method3287(false);
                                    field750[field513] = var50;
                                    field751[field513] = var51;
                                    field513++;
                                }
                            }
                        }
                    }
                    Statics.field4766.method9127();
                }
                if (field512 != 30) {
                    return;
                }
                method3456(Statics.field5138);
                method5551();
                field653.field1458++;
                if (field653.field1458 > 750) {
                    method2913();
                    return;
                }
                method865(Statics.field5138);
                class102 var56 = Statics.field5138;
                for (int var57 = 0; var57 < var56.field1330; var57++) {
                    int var58 = var56.field1331[var57];
                    class104 var59 = var56.field1316[var58];
                    if (var59 != null) {
                        method4030(var56, var59, var59.field1348.field1991);
                    }
                }
                class102 var60 = Statics.field5138;
                for (int var61 = 0; var61 < var60.field1323; var61++) {
                    int var62 = var60.field1334[var61];
                    class477 var63 = var60.field1332[var62];
                    if (var63 != null) {
                        var63.method7944();
                    }
                }
                method3015(Statics.field5138);
                for (int var64 = 0; var64 < Statics.field5138.field1323; var64++) {
                    class477 var65 = Statics.field5138.field1332[Statics.field5138.field1334[var64]];
                    if (var65 != null) {
                        method3456(var65.field4972);
                        method865(var65.field4972);
                        class102 var66 = var65.field4972;
                        for (int var67 = 0; var67 < var66.field1330; var67++) {
                            int var68 = var66.field1331[var67];
                            class104 var69 = var66.field1316[var68];
                            if (var69 != null) {
                                method4030(var66, var69, var69.field1348.field1991);
                            }
                        }
                        method3015(var65.field4972);
                    }
                }
                field806++;
                if (field675 != 0) {
                    field623 += 20;
                    if (field623 >= 400) {
                        field675 = 0;
                    }
                }
                class359 var70 = Statics.field1884;
                class359 var71 = Statics.field467;
                Statics.field1884 = null;
                Statics.field467 = null;
                field691 = null;
                field692 = false;
                field689 = false;
                field742 = 0;
                while (field729.method4034() && field742 < 128) {
                    if (field680 >= 2 && field729.method4036(82) && field729.field2461 == 66) {
                        String var72 = class114.method2768();
                        Statics.field4675.method552(var72);
                    } else if (field595 != 1 || field729.field2460 <= 0) {
                        field593[field742] = field729.field2461;
                        field743[field742] = field729.field2460;
                        field742++;
                    }
                }
                if (method2885() && field729.method4036(82) && field729.method4036(81) && field530 != 0) {
                    int var73 = Statics.field297.field1128 - field530;
                    if (var73 < 0) {
                        var73 = 0;
                    } else if (var73 > 3) {
                        var73 = 3;
                    }
                    if (Statics.field297.field1128 != var73) {
                        method2582(Statics.field5138.field1322 + Statics.field297.field1205[0], Statics.field5138.field1324 + Statics.field297.field1247[0], var73, false);
                    }
                    field530 = 0;
                }
                if (field567 != -1) {
                    method1106(field567, 0, 0, Statics.field890, Statics.field5, 0, 0);
                }
                field696++;
                while (true) {
                    class90 var74;
                    class359 var75;
                    class359 var76;
                    do {
                        var74 = (class90) field716.method6795();
                        if (var74 == null) {
                            while (true) {
                                class90 var77;
                                class359 var78;
                                class359 var79;
                                do {
                                    var77 = (class90) field717.method6795();
                                    if (var77 == null) {
                                        while (true) {
                                            class90 var80;
                                            class359 var81;
                                            class359 var82;
                                            do {
                                                var80 = (class90) field715.method6795();
                                                if (var80 == null) {
                                                    boolean var83 = false;
                                                    while (true) {
                                                        class231 var84 = (class231) field718.method6795();
                                                        if (var84 == null) {
                                                            if (!var83 && class36.field220 == 1) {
                                                                field741.method4016();
                                                            }
                                                            this.method1201();
                                                            method1153();
                                                            if (field736 != null) {
                                                                this.method1206();
                                                            }
                                                            boolean var91 = false;
                                                            for (int var92 = 0; var92 < Statics.field5138.field1323; var92++) {
                                                                class477 var93 = Statics.field5138.field1332[Statics.field5138.field1334[var92]];
                                                                class102 var94 = var93.field4972;
                                                                class283 var95 = var94.field1317;
                                                                if (var93 != null && var95.method5129()) {
                                                                    if (!var91) {
                                                                        int var96 = var95.field2935;
                                                                        int var97 = var95.field2968;
                                                                        class322 var98 = class322.method3236(class320.field3291, field653.field1456);
                                                                        var98.field3394.method8711(5);
                                                                        var98.field3394.method8912(var94.field1324 + var97);
                                                                        var98.field3394.method8711(field729.method4036(82) ? (field729.method4036(81) ? 2 : 1) : 0);
                                                                        var98.field3394.method8768(var94.field1322 + var96);
                                                                        field653.method2773(var98);
                                                                        var91 = true;
                                                                        field526 = class36.field223;
                                                                        field622 = class36.field215;
                                                                        field675 = 1;
                                                                        field623 = 0;
                                                                        field753 = var96;
                                                                        field754 = var97;
                                                                    }
                                                                    var95.method5043();
                                                                }
                                                            }
                                                            if (!var91 && Statics.field5138.field1317.method5129()) {
                                                                int var99 = Statics.field5138.field1317.field2935;
                                                                int var100 = Statics.field5138.field1317.field2968;
                                                                class322 var101 = class322.method3236(class320.field3291, field653.field1456);
                                                                var101.field3394.method8711(5);
                                                                var101.field3394.method8912(Statics.field5138.field1324 + var100);
                                                                var101.field3394.method8711(field729.method4036(82) ? (field729.method4036(81) ? 2 : 1) : 0);
                                                                var101.field3394.method8768(Statics.field5138.field1322 + var99);
                                                                field653.method2773(var101);
                                                                Statics.field5138.field1317.method5043();
                                                                field526 = class36.field223;
                                                                field622 = class36.field215;
                                                                field675 = 1;
                                                                field623 = 0;
                                                                field753 = var99;
                                                                field754 = var100;
                                                            }
                                                            if (var91) {
                                                                Statics.field5138.field1317.method5043();
                                                            }
                                                            if (Statics.field1884 != var70) {
                                                                if (var70 != null) {
                                                                    method7942(var70);
                                                                }
                                                                if (Statics.field1884 != null) {
                                                                    method7942(Statics.field1884);
                                                                }
                                                            }
                                                            if (Statics.field467 != var71 && field663 == field501) {
                                                                if (var71 != null) {
                                                                    method7942(var71);
                                                                }
                                                                if (Statics.field467 != null) {
                                                                    method7942(Statics.field467);
                                                                }
                                                            }
                                                            if (Statics.field467 == null) {
                                                                if (field663 > 0) {
                                                                    field663--;
                                                                }
                                                            } else if (field663 < field501) {
                                                                field663++;
                                                                if (field663 == field501) {
                                                                    method7942(Statics.field467);
                                                                }
                                                            }
                                                            if (field595 == 0) {
                                                                int var102 = Statics.field4085.method1165();
                                                                int var103 = Statics.field4085.method1172();
                                                                if (field504 != -1) {
                                                                    class94 var104 = Statics.field297.field1148.field1327[field504];
                                                                    if (var104 != null) {
                                                                        class348 var105 = var104.method2371(Statics.field297.field1148);
                                                                        var102 = var105.field3733;
                                                                        var103 = var105.field3735;
                                                                    }
                                                                }
                                                                int var106 = Statics.field4085.method1163();
                                                                if (Statics.field4065 - var102 < -500 || Statics.field4065 - var102 > 500 || Statics.field3399 - var103 < -500 || Statics.field3399 - var103 > 500) {
                                                                    Statics.field4065 = var102;
                                                                    Statics.field3399 = var103;
                                                                }
                                                                if (Statics.field4065 != var102) {
                                                                    Statics.field4065 += (var102 - Statics.field4065) / 16;
                                                                }
                                                                if (Statics.field3399 != var103) {
                                                                    Statics.field3399 += (var103 - Statics.field3399) / 16;
                                                                }
                                                                int var107 = Statics.field4065 >> 7;
                                                                int var108 = Statics.field3399 >> 7;
                                                                int var109 = method3234(Statics.field5138, Statics.field4065, Statics.field3399, var106);
                                                                int var110 = 0;
                                                                if (var107 > 3 && var108 > 3 && var107 < 100 && var108 < 100) {
                                                                    for (int var111 = var107 - 4; var111 <= var107 + 4; var111++) {
                                                                        for (int var112 = var108 - 4; var112 <= var108 + 4; var112++) {
                                                                            int var113 = var106;
                                                                            if (var106 < 3 && (Statics.field5138.field1326[1][var111][var112] & 0x2) == 2) {
                                                                                var113 = var106 + 1;
                                                                            }
                                                                            int var114 = var109 - Statics.field5138.field1328[var113][var111][var112];
                                                                            if (var114 > var110) {
                                                                                var110 = var114;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                int var115 = var110 * 192;
                                                                if (var115 > 98048) {
                                                                    var115 = 98048;
                                                                }
                                                                if (var115 < 32768) {
                                                                    var115 = 32768;
                                                                }
                                                                if (var115 > field606) {
                                                                    field606 += (var115 - field606) / 24;
                                                                } else if (var115 < field606) {
                                                                    field606 += (var115 - field606) / 80;
                                                                }
                                                                Statics.field3216 = method3234(Statics.field5138, var102, var103, var106) - field686;
                                                            } else if (field595 == 1) {
                                                                if (field713 && Statics.field297 != null) {
                                                                    int var116 = Statics.field297.field1205[0];
                                                                    int var117 = Statics.field297.field1247[0];
                                                                    if (var116 >= 0 && 104 > var116 && var117 >= 0 && 104 > var117) {
                                                                        Statics.field4065 = Statics.field297.field1229;
                                                                        int var118 = method3234(Statics.field5138, Statics.field297.field1229, Statics.field297.field1192, Statics.field5138.field1319) - field686;
                                                                        if (var118 < Statics.field3216) {
                                                                            Statics.field3216 = var118;
                                                                        }
                                                                        Statics.field3399 = Statics.field297.field1192;
                                                                        field713 = false;
                                                                    }
                                                                }
                                                                short var119 = -1;
                                                                if (field729.method4036(33)) {
                                                                    var119 = 0;
                                                                } else if (field729.method4036(49)) {
                                                                    var119 = 1024;
                                                                }
                                                                if (field729.method4036(48)) {
                                                                    if (var119 == 0) {
                                                                        var119 = 1792;
                                                                    } else if (var119 == 1024) {
                                                                        var119 = 1280;
                                                                    } else {
                                                                        var119 = 1536;
                                                                    }
                                                                } else if (field729.method4036(50)) {
                                                                    if (var119 == 0) {
                                                                        var119 = 256;
                                                                    } else if (var119 == 1024) {
                                                                        var119 = 768;
                                                                    } else {
                                                                        var119 = 512;
                                                                    }
                                                                }
                                                                byte var120 = 0;
                                                                if (field729.method4036(35)) {
                                                                    var120 = -1;
                                                                } else if (field729.method4036(51)) {
                                                                    var120 = 1;
                                                                }
                                                                int var121 = 0;
                                                                if (var119 >= 0 || var120 != 0) {
                                                                    int var122 = field729.method4036(81) ? field749 : field600;
                                                                    var121 = var122 * 16;
                                                                    field598 = var119;
                                                                    field599 = var120;
                                                                }
                                                                if (field597 < var121) {
                                                                    field597 += var121 / 8;
                                                                    if (field597 > var121) {
                                                                        field597 = var121;
                                                                    }
                                                                } else if (field597 > var121) {
                                                                    field597 = field597 * 9 / 10;
                                                                }
                                                                if (field597 > 0) {
                                                                    int var123 = field597 / 16;
                                                                    if (field598 >= 0) {
                                                                        int var124 = field598 - Statics.field3668 & 0x7FF;
                                                                        int var125 = class278.field2878[var124];
                                                                        int var126 = class278.field2879[var124];
                                                                        Statics.field4065 += var123 * var125 / 65536;
                                                                        Statics.field3399 += var123 * var126 / 65536;
                                                                    }
                                                                    if (field599 != 0) {
                                                                        Statics.field3216 += field599 * var123;
                                                                        if (Statics.field3216 > 0) {
                                                                            Statics.field3216 = 0;
                                                                        }
                                                                    }
                                                                } else {
                                                                    field598 = -1;
                                                                    field599 = -1;
                                                                }
                                                                if (field729.method4036(13)) {
                                                                    method3097();
                                                                }
                                                            }
                                                            if (class36.field212 == 4 && Statics.field828) {
                                                                int var127 = class36.field214 - field594;
                                                                field592 = var127 * 2;
                                                                field594 = var127 == -1 || var127 == 1 ? class36.field214 : (field594 + class36.field214) / 2;
                                                                int var128 = field537 - class36.field224;
                                                                field591 = var128 * 2;
                                                                field537 = var128 == -1 || var128 == 1 ? class36.field224 : (field537 + class36.field224) / 2;
                                                            } else {
                                                                if (field729.method4036(96)) {
                                                                    field591 += (-24 - field591) / 2;
                                                                } else if (field729.method4036(97)) {
                                                                    field591 += (24 - field591) / 2;
                                                                } else {
                                                                    field591 /= 2;
                                                                }
                                                                if (field729.method4036(98)) {
                                                                    field592 += (12 - field592) / 2;
                                                                } else if (field729.method4036(99)) {
                                                                    field592 += (-12 - field592) / 2;
                                                                } else {
                                                                    field592 /= 2;
                                                                }
                                                                field594 = class36.field214;
                                                                field537 = class36.field224;
                                                            }
                                                            field590 = field591 / 2 + field590 & 0x7FF;
                                                            field632 += field592 / 2;
                                                            if (field632 < 128) {
                                                                field632 = 128;
                                                            }
                                                            if (field632 > 383) {
                                                                field632 = 383;
                                                            }
                                                            if (field568) {
                                                                method6432(Statics.field2667, Statics.field854, Statics.field1631);
                                                                method4526(Statics.field3566, Statics.field2552);
                                                                if (Statics.field313 == Statics.field2667 && Statics.field854 == Statics.field3563 && Statics.field412 == Statics.field1631 && Statics.field4631 == Statics.field3566 && Statics.field3668 == Statics.field2552) {
                                                                    field568 = false;
                                                                    field767 = false;
                                                                    field765 = false;
                                                                    field554 = false;
                                                                    Statics.field3559 = 0;
                                                                    Statics.field1189 = 0;
                                                                    Statics.field17 = 0;
                                                                    Statics.field1561 = 0;
                                                                    Statics.field1355 = 0;
                                                                    Statics.field1984 = 0;
                                                                    Statics.field1880 = 0;
                                                                    Statics.field2542 = 0;
                                                                    Statics.field2103 = 0;
                                                                    Statics.field4584 = 0;
                                                                    field768 = null;
                                                                    field770 = null;
                                                                    field769 = null;
                                                                }
                                                            } else if (field767) {
                                                                if (!field765) {
                                                                    int var129 = class377.method6449(Statics.field2542);
                                                                    int var130 = class377.method6449(Statics.field2103);
                                                                    int var131 = method3234(Statics.field5138, var129, var130, Statics.field5138.field1319) - Statics.field4584;
                                                                    method6432(var129, var131, var130);
                                                                } else if (field768 != null) {
                                                                    Statics.field313 = field768.method8160();
                                                                    Statics.field412 = field768.method8161();
                                                                    if (field805) {
                                                                        Statics.field3563 = field768.method8159();
                                                                    } else {
                                                                        Statics.field3563 = method3234(Statics.field5138, Statics.field313, Statics.field412, Statics.field5138.field1319) - field768.method8159();
                                                                    }
                                                                    field768.method8174();
                                                                }
                                                                if (field554) {
                                                                    if (field770 != null) {
                                                                        Statics.field4631 = field770.method8168();
                                                                        Statics.field4631 = Math.min(Math.max(Statics.field4631, 128), 383);
                                                                        field770.method8174();
                                                                    }
                                                                    if (field769 != null) {
                                                                        Statics.field3668 = field769.method8168() & 0x7FF;
                                                                        field769.method8174();
                                                                    }
                                                                } else {
                                                                    int var132 = class377.method6449(Statics.field3559);
                                                                    int var133 = class377.method6449(Statics.field1189);
                                                                    int var134 = method3234(Statics.field5138, var132, var133, Statics.field5138.field1319) - Statics.field17;
                                                                    int var135 = var132 - Statics.field313;
                                                                    int var136 = var134 - Statics.field3563;
                                                                    int var137 = var133 - Statics.field412;
                                                                    int var138 = (int) Math.sqrt((double) (var135 * var135 + var137 * var137));
                                                                    int var139 = (int) (Math.atan2((double) var136, (double) var138) * 325.9490051269531D) & 0x7FF;
                                                                    int var140 = (int) (Math.atan2((double) var135, (double) var137) * -325.9490051269531D) & 0x7FF;
                                                                    method4526(var139, var140);
                                                                }
                                                            }
                                                            for (int var141 = 0; var141 < 5; var141++) {
                                                                int var10002 = field499[var141]++;
                                                            }
                                                            Statics.field4481.method2712();
                                                            int var142 = class36.method268();
                                                            int var143 = class35.method2058();
                                                            if (var142 > 15000 && var143 > 15000) {
                                                                field624 = 250;
                                                                class36.field207 = 14500;
                                                                class322 var144 = class322.method3236(class320.field3312, field653.field1456);
                                                                field653.method2773(var144);
                                                            }
                                                            Statics.field1599.method1826();
                                                            for (int var145 = 0; var145 < field801.size(); var145++) {
                                                                int var146 = (Integer) field801.get(var145);
                                                                class143 var147 = class210.method3029(var146);
                                                                int var148;
                                                                if (var147 == null) {
                                                                    var148 = 2;
                                                                } else {
                                                                    var148 = var147.method3070() ? 0 : 1;
                                                                }
                                                                if (var148 != 2) {
                                                                    field801.remove(var145);
                                                                    var145--;
                                                                }
                                                            }
                                                            field653.field1457++;
                                                            if (field653.field1457 > 50) {
                                                                class322 var149 = class322.method3236(class320.field3368, field653.field1456);
                                                                field653.method2773(var149);
                                                            }
                                                            try {
                                                                field653.method2772();
                                                            } catch (IOException var151) {
                                                                method2913();
                                                            }
                                                            class223.method7422().method3946();
                                                            return;
                                                        }
                                                        if (var84.field2445.field3834 == 12) {
                                                            var83 = true;
                                                        }
                                                        if (var84 != null && var84.field2445 != null) {
                                                            if (var84.field2445.field3870 >= 0) {
                                                                class359 var85 = Statics.field4650.method5895(var84.field2445.field3851);
                                                                if (var85 == null || var85.field3969 == null || var85.field3969.length == 0 || var84.field2445.field3870 >= var85.field3969.length || var85.field3969[var84.field2445.field3870] != var84.field2445) {
                                                                    continue;
                                                                }
                                                            }
                                                            if (var84.field2445.field3834 == 11 && var84.field2441 == 0) {
                                                                if (var84.field2445.method6254(var84.field2446, var84.field2444, 0, 0)) {
                                                                    var84.field2445.method6296().method3818().method3929(1, var84.field2445.method6296().method3830());
                                                                    switch(var84.field2445.method6257()) {
                                                                        case 0:
                                                                            class32.method7064(var84.field2445.method6243(), true, false);
                                                                            break;
                                                                        case 1:
                                                                            int var86 = method3224(var84.field2445);
                                                                            boolean var87 = (var86 >> 22 & 0x1) != 0;
                                                                            if (var87) {
                                                                                int[] var88 = var84.field2445.method6239();
                                                                                if (var88 != null) {
                                                                                    class322 var89 = class322.method3236(class320.field3367, field653.field1456);
                                                                                    var89.field3394.method8780(var84.field2445.field3831);
                                                                                    var89.field3394.method8912(var84.field2445.field3870);
                                                                                    var89.field3394.method8782(var88[1]);
                                                                                    var89.field3394.method8782(var84.field2445.method6258());
                                                                                    var89.field3394.method8780(var88[0]);
                                                                                    var89.field3394.method8780(var88[2]);
                                                                                    field653.method2773(var89);
                                                                                }
                                                                            }
                                                                    }
                                                                }
                                                            } else if (var84.field2445.field3834 == 12) {
                                                                class357 var90 = var84.field2445.method6367();
                                                                if (var90 != null && var90.method6012()) {
                                                                    switch(var84.field2441) {
                                                                        case 0:
                                                                            field741.method4014(var84.field2445);
                                                                            var90.method6139(true);
                                                                            var90.method5999(var84.field2446, var84.field2444, field729.method4036(82), field729.method4036(81));
                                                                            break;
                                                                        case 1:
                                                                            var90.method6000(var84.field2446, var84.field2444);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                var81 = var80.field1086;
                                                if (var81.field3870 < 0) {
                                                    break;
                                                }
                                                var82 = Statics.field4650.method5895(var81.field3851);
                                            } while (var82 == null || var82.field3969 == null || var81.field3870 >= var82.field3969.length || var82.field3969[var81.field3870] != var81);
                                            class73.method2137(var80);
                                        }
                                    }
                                    var78 = var77.field1086;
                                    if (var78.field3870 < 0) {
                                        break;
                                    }
                                    var79 = Statics.field4650.method5895(var78.field3851);
                                } while (var79 == null || var79.field3969 == null || var78.field3870 >= var79.field3969.length || var79.field3969[var78.field3870] != var78);
                                class73.method2137(var77);
                            }
                        }
                        var75 = var74.field1086;
                        if (var75.field3870 < 0) {
                            break;
                        }
                        var76 = Statics.field4650.method5895(var75.field3851);
                    } while (var76 == null || var76.field3969 == null || var75.field3870 >= var76.field3969.length || var76.field3969[var75.field3870] != var75);
                    class73.method2137(var74);
                }
            }
            class322 var4 = class322.method3236(class320.field3342, field653.field1456);
            var4.field3394.method8711(0);
            int var5 = var4.field3394.field5363;
            class37.method93(var4.field3394);
            var4.field3394.method8776(var4.field3394.field5363 - var5);
            field653.method2773(var4);
        }
    }

    @ObfuscatedName("gq.iu(I)V")
    public static final void method3115() {
        if (Statics.field978 != null) {
            Statics.field978.method791();
        }
    }

    @ObfuscatedName("mx.ik(B)V")
    public static final void method5551() {
        for (int var0 = 0; var0 < field757; var0++) {
            int var10002 = field760[var0]--;
            if (field760[var0] >= -10) {
                class40 var2 = field763[var0];
                if (var2 == null) {
                    class40 var10000 = (class40) null;
                    var2 = class40.method765(Statics.field4704, field549[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field760[var0] += var2.method755();
                    field763[var0] = var2;
                }
                if (field760[var0] < 0) {
                    int var11;
                    if (field761[var0] == 0) {
                        var11 = Statics.field1379.method2459();
                    } else {
                        int var3 = (field761[var0] & 0xFF) * 128;
                        int var4 = field761[var0] >> 16 & 0xFF;
                        int var5 = Math.abs(class377.method6449(var4) - Statics.field297.field1229);
                        int var6 = field761[var0] >> 8 & 0xFF;
                        int var7 = Math.abs(class377.method6449(var6) - Statics.field297.field1192);
                        int var8 = Math.max(var5 + var7 - 128, 0);
                        int var9 = Math.max(((field669[var0] & 0x1F) - 1) * 128, 0);
                        if (var8 >= var3) {
                            field760[var0] = -100;
                            continue;
                        }
                        float var10 = var9 < var3 ? Math.min(Math.max((float) (var3 - var8) / (float) (var3 - var9), 0.0F), 1.0F) : 1.0F;
                        var11 = (int) (var10 * (float) Statics.field1379.method2489());
                    }
                    if (var11 > 0) {
                        class41 var12 = var2.method754().method766(Statics.field1868);
                        class49 var13 = class49.method933(var12, 100, var11);
                        var13.method963(field759[var0] - 1);
                        Statics.field2515.method711(var13);
                    }
                    field760[var0] = -100;
                }
            } else {
                field757--;
                for (int var1 = var0; var1 < field757; var1++) {
                    field549[var1] = field549[var1 + 1];
                    field763[var1] = field763[var1 + 1];
                    field759[var1] = field759[var1 + 1];
                    field760[var1] = field760[var1 + 1];
                    field761[var1] = field761[var1 + 1];
                    field669[var1] = field669[var1 + 1];
                }
                var0--;
            }
        }
        if (!field762 || class331.method3228()) {
            return;
        }
        if (Statics.field1379.method2525() != 0 && class331.method4203()) {
            class385 var14 = Statics.field2101;
            int var15 = Statics.field1379.method2525();
            if (!class331.field3586.isEmpty()) {
                ArrayList var16 = new ArrayList();
                Iterator var17 = class331.field3586.iterator();
                while (var17.hasNext()) {
                    class343 var18 = (class343) var17.next();
                    var18.field3711 = false;
                    var18.field3710 = false;
                    var18.field3716 = false;
                    var18.field3713 = false;
                    var18.field3709 = var14;
                    var18.field3707 = var15;
                    var18.field3705 = 0.0F;
                    var16.add(var18);
                }
                class331.method8420(var16, class331.field3581, class331.field3590, class331.field3591, class331.field3587, false);
            }
        }
        field762 = false;
    }

    @ObfuscatedName("hm.iw(Lii;IIIZI)V")
    public static void method3386(class210 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (field757 < 50 && arg0.field2296 != null && arg1 < arg0.field2296.length && arg0.field2296[arg1] != null) {
            int var5 = arg0.field2296[arg1].field2149 & 0x1F;
            if ((var5 <= 0 || Statics.field1379.method2489() != 0) && (var5 != 0 || Statics.field1379.method2459() != 0)) {
                method7664(arg0.field2296[arg1], arg2, arg3, arg4);
            }
        }
    }

    @ObfuscatedName("jx.ic(Lii;IIIZI)V")
    public static void method4211(class210 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (field757 >= 50 || arg0.field2288 == null || !arg0.field2288.containsKey(arg1)) {
            return;
        }
        class206 var5 = (class206) arg0.field2288.get(arg1);
        if (var5 != null) {
            int var6 = var5.field2149 & 0x1F;
            if ((var6 <= 0 || Statics.field1379.method2489() != 0) && (var6 != 0 || Statics.field1379.method2459() != 0)) {
                method7664(var5, arg2, arg3, arg4);
            }
        }
    }

    @ObfuscatedName("rx.iv(Lhg;IIZI)V")
    public static void method7664(class206 arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (arg0.field2149 == 0) {
            if (!arg3) {
                return;
            }
            field761[field757] = 0;
        } else {
            int var4 = (arg1 - 64) / 128;
            int var5 = (arg2 - 64) / 128;
            field761[field757] = arg0.field2149 + (var4 << 16) + (var5 << 8);
        }
        field549[field757] = arg0.field2151;
        field759[field757] = arg0.field2148;
        field760[field757] = 0;
        field763[field757] = null;
        field669[field757] = arg0.field2150;
        field757++;
    }

    @ObfuscatedName("bh.ih(IIII)V")
    public static void method863(int arg0, int arg1, int arg2) {
        if (Statics.field1379.method2459() == 0 || arg1 == 0 || field757 >= 50) {
            return;
        }
        field549[field757] = arg0;
        field759[field757] = arg1;
        field760[field757] = arg2;
        field763[field757] = null;
        field761[field757] = 0;
        field669[field757] = 0;
        field757++;
    }

    @ObfuscatedName("hc.ib(II)V")
    public static void method3524(int arg0) {
        if (arg0 == -1 && !field762) {
            class331.method3026(0, 0);
        } else if (arg0 != -1 && !class331.method4111(arg0) && Statics.field1379.method2525() != 0) {
            ArrayList var1 = new ArrayList();
            var1.add(new class343(Statics.field2101, arg0, 0, Statics.field1379.method2525(), false));
            if (field762) {
                class331.method3114(var1, 0, 100, 100, 0);
            } else {
                class331.method8420(var1, 0, 100, 100, 0, false);
            }
        }
    }

    @ObfuscatedName("tg.iy(Ljava/util/ArrayList;IIIII)V")
    public static void method8120(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field762) {
            class331.method3026(0, 0);
        } else if (var5 != -1) {
            boolean var7;
            if (class331.field3586.isEmpty()) {
                var7 = false;
            } else {
                class343 var6 = (class343) class331.field3586.get(0);
                var7 = var6 != null && var6.field3717 == var5;
            }
            if (!var7 && Statics.field1379.method2525() != 0) {
                ArrayList var8 = new ArrayList();
                for (int var9 = 0; var9 < arg0.size(); var9++) {
                    var8.add(new class343(Statics.field2101, (Integer) arg0.get(var9), 0, Statics.field1379.method2525(), false));
                }
                if (field762) {
                    class331.method3114(var8, arg1, arg2, arg3, arg4);
                } else {
                    class331.method8420(var8, arg1, arg2, arg3, arg4, false);
                }
            }
        }
    }

    @ObfuscatedName("dj.in(III)V")
    public static void method2422(int arg0, int arg1) {
        if (Statics.field1379.method2525() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class343(Statics.field4546, arg0, 0, Statics.field1379.method2525(), false));
            class331.method8420(var2, 0, 0, 0, 0, true);
            field762 = true;
        }
    }

    @ObfuscatedName("client.ig(IIB)V")
    public void method1181(int arg0, int arg1) {
        if (field653 != null && field653.field1456 != null && arg0 > -1 && Statics.field1379.method2525() > 0 && !field762) {
            class322 var3 = class322.method3236(class320.field3283, field653.field1456);
            var3.field3394.method8714(arg0);
            field653.method2773(var3);
        }
    }

    @ObfuscatedName("pe.if(I)V")
    public static final void method6767() {
        if (!Statics.field1843) {
            return;
        }
        if (Statics.field382 != null) {
            Statics.field382.method7877();
        }
        for (int var0 = 0; var0 < Statics.field5138.field1320.field1405; var0++) {
            class94 var1 = Statics.field5138.field1327[Statics.field5138.field1320.field1410[var0]];
            var1.method2344();
        }
        Statics.field1843 = false;
    }

    @ObfuscatedName("jt.ia(B)V")
    public static final void method4537() {
        if (!Statics.field4577) {
            return;
        }
        for (int var0 = 0; var0 < Statics.field5138.field1320.field1405; var0++) {
            class94 var1 = Statics.field5138.field1327[Statics.field5138.field1320.field1410[var0]];
            var1.method2303();
        }
        Statics.field4577 = false;
    }

    @ObfuscatedName("rx.il(Lnx;IIB)V")
    public static final void method7662(class359 arg0, int arg1, int arg2) {
        if (field755 != 0 && field755 != 3 || field647 || !(class36.field220 == 1 || !Statics.field828 && class36.field220 == 4)) {
            return;
        }
        class346 var3 = arg0.method6319(Statics.field4650, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field223 - arg1;
        int var5 = class36.field215 - arg2;
        if (!var3.method5823(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3725 / 2;
        int var7 = var5 - var3.field3726 / 2;
        int var8 = field590 & 0x7FF;
        int var9 = class278.field2878[var8];
        int var10 = class278.field2879[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field4085.method1165() + var11 >> 7;
        int var14 = Statics.field4085.method1172() - var12 >> 7;
        class322 var15 = class322.method3236(class320.field3341, field653.field1456);
        var15.field3394.method8711(18);
        var15.field3394.method8912(Statics.field5138.field1324 + var14);
        var15.field3394.method8711(field729.method4036(82) ? (field729.method4036(81) ? 2 : 1) : 0);
        var15.field3394.method8768(Statics.field5138.field1322 + var13);
        var15.field3394.method8711(var6);
        var15.field3394.method8711(var7);
        var15.field3394.method8712(field590);
        var15.field3394.method8711(57);
        var15.field3394.method8711(0);
        var15.field3394.method8711(0);
        var15.field3394.method8711(89);
        var15.field3394.method8712(Statics.field297.field1229);
        var15.field3394.method8712(Statics.field297.field1192);
        var15.field3394.method8711(63);
        field653.method2773(var15);
        field753 = var13;
        field754 = var14;
    }

    @ObfuscatedName("fi.im(Lde;B)V")
    public static final void method3015(class102 arg0) {
        int[] var1 = arg0.field1320.field1410;
        for (int var2 = 0; var2 < arg0.field1320.field1405; var2++) {
            class94 var3 = arg0.field1327[var1[var2]];
            if (var3 != null && var3.field1207 > 0) {
                var3.field1207--;
                if (var3.field1207 == 0) {
                    var3.field1212 = null;
                }
            }
        }
        for (int var4 = 0; var4 < arg0.field1330; var4++) {
            int var5 = arg0.field1331[var4];
            class104 var6 = arg0.field1316[var5];
            if (var6 != null && var6.field1207 > 0) {
                var6.field1207--;
                if (var6.field1207 == 0) {
                    var6.field1212 = null;
                }
            }
        }
    }

    @ObfuscatedName("gi.ix(Ljava/lang/String;I)V")
    public static final void method3191(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field1379.method2443(!Statics.field1379.method2535());
            if (Statics.field1379.method2535()) {
                class114.method3518(99, "", "Roofs are now all hidden");
            } else {
                class114.method3518(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class416.method6702(arg0.substring(5).trim()) == 1;
            Statics.field4675.method497(var1);
            class278.method4837(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field792 = !field792;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field1379.method2450();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field552 = !field552;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field596 = !field596;
        }
        if (arg0.startsWith("setdrawdistance")) {
            String[] var2 = arg0.split(" ");
            try {
                int var3 = Integer.parseInt(var2[1]);
                Statics.field1379.method2472(var3);
            } catch (NumberFormatException var6) {
                class114.method3518(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var2[1]));
            }
        }
        if (arg0.equalsIgnoreCase("getdrawdistance")) {
            class114.method3518(99, "", String.format("%d", Statics.field1379.method2440()));
        }
        if (field680 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field3175.field5188 = !Statics.field3175.field5188;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field1379.method2513(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field1379.method2513(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method2913();
            }
        }
        class322 var5 = class322.method3236(class320.field3286, field653.field1456);
        var5.field3394.method8711(arg0.length() + 1);
        var5.field3394.method8718(arg0);
        field653.method2773(var5);
    }

    @ObfuscatedName("fq.it(IB)I")
    public static final int method3098(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("jx.ir(IB)I")
    public static final int method4212(int arg0) {
        return Math.abs(arg0 - Statics.field3668) > 1024 ? arg0 + 2048 * (arg0 < Statics.field3668 ? 1 : -1) : arg0;
    }

    @ObfuscatedName("od.ij(IIII)V")
    public static final void method6432(int arg0, int arg1, int arg2) {
        if (Statics.field313 < arg0) {
            Statics.field313 += Statics.field1984 * (arg0 - Statics.field313) / 1000 + Statics.field1880;
            if (Statics.field313 > arg0) {
                Statics.field313 = arg0;
            }
        }
        if (Statics.field313 > arg0) {
            Statics.field313 -= Statics.field1984 * (Statics.field313 - arg0) / 1000 + Statics.field1880;
            if (Statics.field313 < arg0) {
                Statics.field313 = arg0;
            }
        }
        if (Statics.field3563 < arg1) {
            Statics.field3563 += Statics.field1984 * (arg1 - Statics.field3563) / 1000 + Statics.field1880;
            if (Statics.field3563 > arg1) {
                Statics.field3563 = arg1;
            }
        }
        if (Statics.field3563 > arg1) {
            Statics.field3563 -= Statics.field1984 * (Statics.field3563 - arg1) / 1000 + Statics.field1880;
            if (Statics.field3563 < arg1) {
                Statics.field3563 = arg1;
            }
        }
        if (Statics.field412 < arg2) {
            Statics.field412 += Statics.field1984 * (arg2 - Statics.field412) / 1000 + Statics.field1880;
            if (Statics.field412 > arg2) {
                Statics.field412 = arg2;
            }
        }
        if (Statics.field412 > arg2) {
            Statics.field412 -= Statics.field1984 * (Statics.field412 - arg2) / 1000 + Statics.field1880;
            if (Statics.field412 < arg2) {
                Statics.field412 = arg2;
            }
        }
    }

    @ObfuscatedName("je.ip(IIB)V")
    public static final void method4526(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field4631 < arg0) {
            Statics.field4631 += Statics.field1355 * (arg0 - Statics.field4631) / 1000 + Statics.field1561;
            if (Statics.field4631 > arg0) {
                Statics.field4631 = arg0;
            }
        } else if (Statics.field4631 > arg0) {
            Statics.field4631 -= Statics.field1355 * (Statics.field4631 - arg0) / 1000 + Statics.field1561;
            if (Statics.field4631 < arg0) {
                Statics.field4631 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field3668;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field3668 += Statics.field1355 * var3 / 1000 + Statics.field1561;
            Statics.field3668 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field3668 -= Statics.field1355 * -var3 / 1000 + Statics.field1561;
            Statics.field3668 &= 0x7FF;
        }
        int var4 = var2 - Statics.field3668;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field3668 = var2;
        }
    }

    @ObfuscatedName("bh.iz(Lde;I)V")
    public static final void method865(class102 arg0) {
        int var1 = arg0.field1320.field1405;
        int[] var2 = arg0.field1320.field1410;
        for (int var3 = 0; var3 < var1; var3++) {
            class94 var4 = arg0.field1327[var2[var3]];
            if (var4 != null) {
                method4030(arg0, var4, 1);
            }
        }
    }

    @ObfuscatedName("ir.jp(Lde;Ldw;IB)V")
    public static final void method4030(class102 arg0, class98 arg1, int arg2) {
        if (arg1.field1254 >= field516) {
            method4664(arg1);
        } else if (arg1.field1261 >= field516) {
            boolean var3 = field516 == arg1.field1261 || arg1.field1236 == -1 || arg1.field1239 != 0;
            if (!var3) {
                class210 var4 = class210.method5910(arg1.field1236);
                if (var4 == null || var4.method3748()) {
                    var3 = true;
                } else {
                    var3 = arg1.field1238 + 1 > var4.field2285[arg1.field1237];
                }
            }
            if (var3) {
                int var5 = arg1.field1261 - arg1.field1254;
                int var6 = field516 - arg1.field1254;
                int var7 = arg1.field1243 * 128 + arg1.field1195 * 64;
                int var8 = arg1.field1245 * 128 + arg1.field1195 * 64;
                int var9 = arg1.field1244 * 128 + arg1.field1195 * 64;
                int var10 = arg1.field1246 * 128 + arg1.field1195 * 64;
                arg1.field1229 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg1.field1192 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg1.field1265 = 0;
            arg1.field1258 = arg1.field1249;
            arg1.field1193 = arg1.field1258;
        } else {
            arg1.field1199 = arg1.field1197;
            if (arg1.field1230 == 0) {
                arg1.field1265 = 0;
            } else {
                label298: {
                    if (arg1.field1236 != -1 && arg1.field1239 == 0) {
                        class210 var11 = class210.method5910(arg1.field1236);
                        if (arg1.field1266 > 0 && var11.field2304 == 0) {
                            arg1.field1265++;
                            break label298;
                        }
                        if (arg1.field1266 <= 0 && var11.field2284 == 0) {
                            arg1.field1265++;
                            break label298;
                        }
                    }
                    int var12 = arg1.field1229;
                    int var13 = arg1.field1192;
                    int var14 = arg1.field1205[arg1.field1230 - 1] * 128 + arg1.field1195 * 64;
                    int var15 = arg1.field1247[arg1.field1230 - 1] * 128 + arg1.field1195 * 64;
                    if (var12 < var14) {
                        if (var13 < var15) {
                            arg1.field1258 = 1280;
                        } else if (var13 > var15) {
                            arg1.field1258 = 1792;
                        } else {
                            arg1.field1258 = 1536;
                        }
                    } else if (var12 > var14) {
                        if (var13 < var15) {
                            arg1.field1258 = 768;
                        } else if (var13 > var15) {
                            arg1.field1258 = 256;
                        } else {
                            arg1.field1258 = 512;
                        }
                    } else if (var13 < var15) {
                        arg1.field1258 = 1024;
                    } else if (var13 > var15) {
                        arg1.field1258 = 0;
                    }
                    class239 var16 = arg1.field1264[arg1.field1230 - 1];
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        int var17 = arg1.field1258 - arg1.field1193 & 0x7FF;
                        if (var17 > 1024) {
                            var17 -= 2048;
                        }
                        int var18 = arg1.field1201;
                        if (var17 >= -256 && var17 <= 256) {
                            var18 = arg1.field1200;
                        } else if (var17 >= 256 && var17 < 768) {
                            var18 = arg1.field1223;
                        } else if (var17 >= -768 && var17 <= -256) {
                            var18 = arg1.field1202;
                        }
                        if (var18 == -1) {
                            var18 = arg1.field1200;
                        }
                        arg1.field1199 = var18;
                        int var19 = 4;
                        boolean var20 = true;
                        if (arg1 instanceof class104) {
                            var20 = ((class104) arg1).field1348.field2026;
                        }
                        if (var20) {
                            if (arg1.field1258 != arg1.field1193 && arg1.field1191 == -1 && arg1.field1260 != 0) {
                                var19 = 2;
                            }
                            if (arg1.field1230 > 2) {
                                var19 = 6;
                            }
                            if (arg1.field1230 > 3) {
                                var19 = 8;
                            }
                            if (arg1.field1265 > 0 && arg1.field1230 > 1) {
                                var19 = 8;
                                arg1.field1265--;
                            }
                        } else {
                            if (arg1.field1230 > 1) {
                                var19 = 6;
                            }
                            if (arg1.field1230 > 2) {
                                var19 = 8;
                            }
                            if (arg1.field1265 > 0 && arg1.field1230 > 1) {
                                var19 = 8;
                                arg1.field1265--;
                            }
                        }
                        if (class239.field2510 == var16) {
                            var19 <<= 0x1;
                        } else if (class239.field2521 == var16) {
                            var19 >>= 0x1;
                        }
                        if (var19 >= 8) {
                            if (arg1.field1200 == arg1.field1199 && arg1.field1204 != -1) {
                                arg1.field1199 = arg1.field1204;
                            } else if (arg1.field1201 == arg1.field1199 && arg1.field1263 != -1) {
                                arg1.field1199 = arg1.field1263;
                            } else if (arg1.field1202 == arg1.field1199 && arg1.field1220 != -1) {
                                arg1.field1199 = arg1.field1220;
                            } else if (arg1.field1223 == arg1.field1199 && arg1.field1203 != -1) {
                                arg1.field1199 = arg1.field1203;
                            }
                        } else if (var19 <= 2) {
                            if (arg1.field1200 == arg1.field1199 && arg1.field1206 != -1) {
                                arg1.field1199 = arg1.field1206;
                            } else if (arg1.field1201 == arg1.field1199 && arg1.field1209 != -1) {
                                arg1.field1199 = arg1.field1209;
                            } else if (arg1.field1202 == arg1.field1199 && arg1.field1250 != -1) {
                                arg1.field1199 = arg1.field1250;
                            } else if (arg1.field1223 == arg1.field1199 && arg1.field1211 != -1) {
                                arg1.field1199 = arg1.field1211;
                            }
                        }
                        if (var12 != var14 || var13 != var15) {
                            if (var12 < var14) {
                                arg1.field1229 += var19;
                                if (arg1.field1229 > var14) {
                                    arg1.field1229 = var14;
                                }
                            } else if (var12 > var14) {
                                arg1.field1229 -= var19;
                                if (arg1.field1229 < var14) {
                                    arg1.field1229 = var14;
                                }
                            }
                            if (var13 < var15) {
                                arg1.field1192 += var19;
                                if (arg1.field1192 > var15) {
                                    arg1.field1192 = var15;
                                }
                            } else if (var13 > var15) {
                                arg1.field1192 -= var19;
                                if (arg1.field1192 < var15) {
                                    arg1.field1192 = var15;
                                }
                            }
                        }
                        if (arg1.field1229 == var14 && arg1.field1192 == var15) {
                            arg1.field1230--;
                            if (arg1.field1266 > 0) {
                                arg1.field1266--;
                            }
                        }
                    } else {
                        arg1.field1229 = var14;
                        arg1.field1192 = var15;
                        arg1.field1230--;
                        if (arg1.field1266 > 0) {
                            arg1.field1266--;
                        }
                    }
                }
            }
        }
        if (arg1.field1229 < 128 || 13184 <= arg1.field1229 || arg1.field1192 < 128 || 13184 <= arg1.field1192) {
            arg1.field1236 = -1;
            arg1.field1254 = 0;
            arg1.field1261 = 0;
            arg1.method2397();
            arg1.field1229 = arg1.field1205[0] * 128 + arg1.field1195 * 64;
            arg1.field1192 = arg1.field1247[0] * 128 + arg1.field1195 * 64;
            arg1.method2368();
        }
        if (Statics.field297 == arg1 && (arg1.field1229 < 1536 || 11776 <= arg1.field1229 || arg1.field1192 < 1536 || 11776 <= arg1.field1192)) {
            arg1.field1236 = -1;
            arg1.field1254 = 0;
            arg1.field1261 = 0;
            arg1.method2397();
            arg1.field1229 = arg1.field1205[0] * 128 + arg1.field1195 * 64;
            arg1.field1192 = arg1.field1247[0] * 128 + arg1.field1195 * 64;
            arg1.method2368();
        }
        method3184(arg0, arg1);
        method6535(arg1);
    }

    @ObfuscatedName("kp.jd(Ldw;B)V")
    public static final void method4664(class98 arg0) {
        int var1 = Math.max(1, arg0.field1254 - field516);
        int var2 = arg0.field1243 * 128 + arg0.field1195 * 64;
        int var3 = arg0.field1245 * 128 + arg0.field1195 * 64;
        arg0.field1229 += (var2 - arg0.field1229) / var1;
        arg0.field1192 += (var3 - arg0.field1192) / var1;
        arg0.field1265 = 0;
        arg0.field1258 = arg0.field1249;
    }

    @ObfuscatedName("gu.jv(Lde;Ldw;I)V")
    public static final void method3184(class102 arg0, class98 arg1) {
        if (arg1.field1191 != -1) {
            Object var2 = null;
            int var3 = 65536;
            class98 var4;
            if (arg1.field1191 < var3) {
                var4 = arg0.field1316[arg1.field1191];
            } else {
                var4 = arg0.field1327[arg1.field1191 - var3];
            }
            if (var4 != null) {
                int var5 = arg1.field1229 - var4.field1229;
                int var6 = arg1.field1192 - var4.field1192;
                if (var5 != 0 || var6 != 0) {
                    arg1.field1258 = class422.method7018(var5, var6);
                }
            } else if (arg1.field1210) {
                arg1.field1191 = -1;
                arg1.field1210 = false;
            }
        }
        if (arg1.field1230 == 0 || arg1.field1265 > 0) {
            int var7 = -1;
            if (arg1.field1253 != -1 && arg1.field1226 != -1) {
                int var8 = class377.method6449(arg1.field1253 - Statics.field5138.field1322);
                int var9 = class377.method6449(arg1.field1226 - Statics.field5138.field1324);
                int var10 = arg1.field1229 - var8;
                int var11 = arg1.field1192 - var9;
                if (var10 != 0 || var11 != 0) {
                    var7 = class422.method7018(var10, var11);
                }
            } else if (arg1.field1228 != -1) {
                var7 = arg1.field1228;
            }
            if (var7 != -1) {
                arg1.field1258 = var7;
                if (arg1.field1231) {
                    arg1.field1193 = arg1.field1258;
                }
            }
            arg1.method2370();
        }
        int var12 = arg1.field1258 - arg1.field1193 & 0x7FF;
        if (var12 == 0) {
            if (arg1.field1210) {
                arg1.field1191 = -1;
                arg1.field1210 = false;
            }
            arg1.field1259 = 0;
            return;
        }
        boolean var13 = true;
        boolean var14 = true;
        arg1.field1259++;
        int var15 = var12 > 1024 ? -1 : 1;
        arg1.field1193 += arg1.field1260 * var15;
        boolean var16 = true;
        if (var12 < arg1.field1260 || var12 > 2048 - arg1.field1260) {
            arg1.field1193 = arg1.field1258;
            var16 = false;
        }
        if (arg1.field1260 > 0 && arg1.field1199 == arg1.field1197 && (arg1.field1259 > 25 || var16)) {
            if (var15 == -1 && arg1.field1198 != -1) {
                arg1.field1199 = arg1.field1198;
            } else if (var15 == 1 && arg1.field1208 != -1) {
                arg1.field1199 = arg1.field1208;
            } else {
                arg1.field1199 = arg1.field1200;
            }
        }
        arg1.field1193 &= 0x7FF;
    }

    @ObfuscatedName("oh.jf(Ldw;B)V")
    public static final void method6535(class98 arg0) {
        arg0.field1194 = false;
        if (arg0.field1199 != -1) {
            class210 var1 = class210.method5910(arg0.field1199);
            if (var1 == null) {
                arg0.field1199 = -1;
            } else if (!var1.method3748() && var1.field2291 != null) {
                arg0.field1234++;
                if (arg0.field1233 < var1.field2291.length && arg0.field1234 > var1.field2285[arg0.field1233]) {
                    arg0.field1234 = 1;
                    arg0.field1233++;
                    method3386(var1, arg0.field1233, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                }
                if (arg0.field1233 >= var1.field2291.length) {
                    if (var1.field2295 > 0) {
                        arg0.field1233 -= var1.field2295;
                        if (var1.field2305) {
                            arg0.field1235++;
                        }
                        if (arg0.field1233 < 0 || arg0.field1233 >= var1.field2291.length || var1.field2305 && arg0.field1235 >= var1.field2281) {
                            arg0.field1234 = 0;
                            arg0.field1233 = 0;
                            arg0.field1235 = 0;
                        }
                    } else {
                        arg0.field1234 = 0;
                        arg0.field1233 = 0;
                    }
                    method3386(var1, arg0.field1233, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                }
            } else if (var1.method3748()) {
                arg0.field1233++;
                int var2 = var1.method3757();
                if (arg0.field1233 < var2) {
                    method4211(var1, arg0.field1233, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                } else {
                    if (var1.field2295 > 0) {
                        arg0.field1233 -= var1.field2295;
                        if (var1.field2305) {
                            arg0.field1235++;
                        }
                        if (arg0.field1233 < 0 || arg0.field1233 >= var2 || var1.field2305 && arg0.field1235 >= var1.field2281) {
                            arg0.field1233 = 0;
                            arg0.field1234 = 0;
                            arg0.field1235 = 0;
                        }
                    } else {
                        arg0.field1234 = 0;
                        arg0.field1233 = 0;
                    }
                    method4211(var1, arg0.field1233, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                }
            } else {
                arg0.field1199 = -1;
            }
        }
        class519 var3 = new class519(arg0.method2367());
        for (class478 var4 = (class478) var3.method8430(); var4 != null; var4 = (class478) var3.next()) {
            if (var4.field4980 != -1 && field516 >= var4.field4982) {
                int var5 = class198.method3271(var4.field4980).field2081;
                if (var5 == -1) {
                    var4.method8130();
                    arg0.field1242--;
                } else {
                    var4.field4984 = Math.max(var4.field4984, 0);
                    class210 var6 = class210.method5910(var5);
                    if (var6.field2291 != null && !var6.method3748()) {
                        var4.field4981++;
                        if (var4.field4984 < var6.field2291.length && var4.field4981 > var6.field2285[var4.field4984]) {
                            var4.field4981 = 1;
                            var4.field4984++;
                            method3386(var6, var4.field4984, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                        }
                        if (var4.field4984 >= var6.field2291.length) {
                            var4.method8130();
                            arg0.field1242--;
                        }
                    } else if (var6.method3748()) {
                        var4.field4984++;
                        int var7 = var6.method3757();
                        if (var4.field4984 < var7) {
                            method4211(var6, var4.field4984, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                        } else {
                            var4.method8130();
                            arg0.field1242--;
                        }
                    } else {
                        var4.method8130();
                        arg0.field1242--;
                    }
                }
            }
        }
        if (arg0.field1236 != -1 && arg0.field1239 <= 1) {
            class210 var8 = class210.method5910(arg0.field1236);
            if (var8.field2304 == 1 && arg0.field1266 > 0 && arg0.field1254 <= field516 && arg0.field1261 < field516) {
                arg0.field1239 = 1;
                return;
            }
        }
        if (arg0.field1236 != -1 && arg0.field1239 == 0) {
            class210 var9 = class210.method5910(arg0.field1236);
            if (var9 == null) {
                arg0.field1236 = -1;
            } else if (!var9.method3748() && var9.field2291 != null) {
                arg0.field1238++;
                if (arg0.field1237 < var9.field2291.length && arg0.field1238 > var9.field2285[arg0.field1237]) {
                    arg0.field1238 = 1;
                    arg0.field1237++;
                    method3386(var9, arg0.field1237, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                }
                if (arg0.field1237 >= var9.field2291.length) {
                    arg0.field1237 -= var9.field2295;
                    arg0.field1215++;
                    if (arg0.field1215 >= var9.field2281) {
                        arg0.field1236 = -1;
                    } else if (arg0.field1237 >= 0 && arg0.field1237 < var9.field2291.length) {
                        method3386(var9, arg0.field1237, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                    } else {
                        arg0.field1236 = -1;
                    }
                }
                arg0.field1194 = var9.field2298;
            } else if (var9.method3748()) {
                arg0.field1237++;
                int var10 = var9.method3757();
                if (arg0.field1237 < var10) {
                    method4211(var9, arg0.field1237, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                } else {
                    arg0.field1237 -= var9.field2295;
                    arg0.field1215++;
                    if (arg0.field1215 >= var9.field2281) {
                        arg0.field1236 = -1;
                    } else if (arg0.field1237 >= 0 && arg0.field1237 < var10) {
                        method4211(var9, arg0.field1237, arg0.field1229, arg0.field1192, Statics.field297 == arg0);
                    } else {
                        arg0.field1236 = -1;
                    }
                }
            } else {
                arg0.field1236 = -1;
            }
        }
        if (arg0.field1239 > 0) {
            arg0.field1239--;
        }
    }

    @ObfuscatedName("cs.jb(I)V")
    public static void method1153() {
        if (Statics.field3175 != null) {
            Statics.field3175.method8211(Statics.field5138.field1319, (Statics.field4085.method1165() >> 7) + Statics.field5138.field1322, (Statics.field4085.method1172() >> 7) + Statics.field5138.field1324, false);
            Statics.field3175.method8228();
        }
    }

    @ObfuscatedName("cs.jz(B)I")
    public static int method1159() {
        return field731 ? 2 : 1;
    }

    @ObfuscatedName("ia.ji(II)V")
    public static void method3988(int arg0) {
        field730 = 0L;
        if (arg0 >= 2) {
            field731 = true;
        } else {
            field731 = false;
        }
        if (method1159() == 1) {
            Statics.field4675.method481(765, 503);
        } else {
            Statics.field4675.method481(7680, 2160);
        }
        if (field512 >= 25) {
            method5771();
        }
    }

    @ObfuscatedName("mw.jn(I)V")
    public static void method5771() {
        if (field653 == null || field653.field1456 == null) {
            return;
        }
        class322 var0 = class322.method3236(class320.field3301, field653.field1456);
        var0.field3394.method8711(method1159());
        var0.field3394.method8712(Statics.field890);
        var0.field3394.method8712(Statics.field5);
        field653.method2773(var0);
    }

    @ObfuscatedName("client.ao(I)V")
    public final void method492() {
        field730 = class327.method4500() + 500L;
        this.method1423();
        if (field567 != -1) {
            this.method1328(true);
        }
    }

    @ObfuscatedName("client.jj(I)V")
    public void method1423() {
        int var1 = Statics.field890;
        int var2 = Statics.field5;
        if (this.field180 < var1) {
            int var3 = this.field180;
        }
        if (this.field197 < var2) {
            int var4 = this.field197;
        }
        if (Statics.field1379 != null) {
            try {
                class27.method385(Statics.field4675, "resize", new Object[] { method1159() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.jx(B)V")
    public final void method1197() {
        if (field567 != -1) {
            Statics.method3806(field567);
        }
        for (int var1 = 0; var1 < field641; var1++) {
            if (field722[var1]) {
                field723[var1] = true;
            }
            field724[var1] = field722[var1];
            field722[var1] = false;
        }
        field721 = field516;
        field661 = -1;
        field551 = -1;
        if (field567 != -1) {
            field641 = 0;
            method2355(field567, 0, 0, Statics.field890, Statics.field5, 0, 0, -1);
        }
        class557.method9051();
        if (field625) {
            if (field675 == 1) {
                Statics.field1409[field623 / 100].method9189(field526 - 8, field622 - 8);
            }
            if (field675 == 2) {
                Statics.field1409[field623 / 100 + 4].method9189(field526 - 8, field622 - 8);
            }
        }
        if (field647) {
            method2841();
        } else if (field661 != -1) {
            method4564(field661, field551);
        }
        if (field583 == 3) {
            for (int var2 = 0; var2 < field641; var2++) {
                if (field724[var2]) {
                    class557.method9079(field725[var2], field726[var2], field727[var2], field573[var2], 16711935, 128);
                } else if (field723[var2]) {
                    class557.method9079(field725[var2], field726[var2], field727[var2], field573[var2], 16711680, 128);
                }
            }
        }
        class72.method4006(Statics.field5138.field1319, Statics.field297.field1229, Statics.field297.field1192, field806);
        field806 = 0;
    }

    @ObfuscatedName("ce.jh(Ljava/lang/String;ZB)V")
    public static final void method1085(String arg0, boolean arg1) {
        if (!field627) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2095.method7428(arg0, 250);
        int var6 = Statics.field2095.method7429(arg0, 250) * 13;
        class557.method9060(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class557.method9064(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2095.method7436(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method3027(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field4766.method461(0, 0);
        } else {
            method2555(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("gm.jo(IIIII)V")
    public static final void method3235(int arg0, int arg1, int arg2, int arg3) {
        field618++;
        Statics.field5138.field1317.field2967 = field516;
        if (Statics.field297.field1229 >> 7 == field753 && Statics.field297.field1192 >> 7 == field754) {
            field753 = 0;
        }
        class102 var4 = Statics.field5138;
        if (field552) {
            method5817(var4, field707, false);
        }
        class102 var5 = Statics.field5138;
        if (field531 >= 0 && var5.field1327[field531] != null) {
            method5817(var5, field531, false);
        }
        method4150(Statics.field5138, true);
        class102 var6 = Statics.field5138;
        int var7 = var6.field1320.field1405;
        int[] var8 = var6.field1320.field1410;
        for (int var9 = 0; var9 < var7; var9++) {
            if (field531 != var8[var9] && field707 != var8[var9]) {
                method5817(var6, var8[var9], true);
            }
        }
        method4150(Statics.field5138, false);
        class102 var10 = Statics.field5138;
        for (int var11 = 0; var11 < var10.field1323; var11++) {
            class477 var12 = var10.field1332[var10.field1334[var11]];
            if (var12 != null) {
                var12.field4974 = method3234(var10, var12.field4968, var12.field4970, var10.field1319);
                var12.field4972.field1317.field2967 = field516;
                var12.method7943();
                var10.field1317.method4937(var10.field1319, var12.field4968, var12.field4970, var12.field4974, 60, var12.field4972.field1317, var12.field4971, 0L, false);
                method3227(var12.field4972);
                class102 var13 = var12.field4972;
                if (field531 >= 0 && var13.field1327[field531] != null) {
                    method5817(var13, field531, false);
                }
                method4150(var12.field4972, true);
                class102 var14 = var12.field4972;
                int var15 = var14.field1320.field1405;
                int[] var16 = var14.field1320.field1410;
                for (int var17 = 0; var17 < var15; var17++) {
                    if (field531 != var16[var17] && field707 != var16[var17]) {
                        method5817(var14, var16[var17], true);
                    }
                }
                method4150(var12.field4972, false);
                method4592(var12.field4972);
                class102 var18 = var12.field4972;
                for (class74 var19 = (class74) var18.field1338.method6814(); var19 != null; var19 = (class74) var18.field1338.method6799()) {
                    if (var18.field1319 != var19.field877 || var19.field875) {
                        var19.method8130();
                    } else if (field516 >= var19.field876) {
                        var19.method2049(field806);
                        if (var19.field875) {
                            var19.method8130();
                        } else {
                            var18.field1317.method4937(var19.field877, var19.field883, var19.field879, var19.field880, 60, var19, 0, -1L, false);
                        }
                    }
                }
            }
        }
        method4592(Statics.field5138);
        class102 var20 = Statics.field5138;
        for (class74 var21 = (class74) var20.field1338.method6814(); var21 != null; var21 = (class74) var20.field1338.method6799()) {
            if (var20.field1319 != var21.field877 || var21.field875) {
                var21.method8130();
            } else if (field516 >= var21.field876) {
                var21.method2049(field806);
                if (var21.field875) {
                    var21.method8130();
                } else {
                    var20.field1317.method4937(var21.field877, var21.field883, var21.field879, var21.field880, 60, var21, 0, -1L, false);
                }
            }
        }
        method2790(arg0, arg1, arg2, arg3, true);
        int var22 = field785;
        int var23 = field786;
        int var24 = field787;
        int var25 = field701;
        class557.method9105(var22, var23, var22 + var24, var23 + var25);
        class278.method4814();
        class557.method9072();
        int var26 = field632;
        if (field606 / 256 > var26) {
            var26 = field606 / 256;
        }
        if (field772[4] && field665[4] + 128 > var26) {
            var26 = field665[4] + 128;
        }
        int var27 = field590 & 0x7FF;
        int var28 = Statics.field4065;
        int var29 = Statics.field3216;
        int var30 = Statics.field3399;
        int var33 = var26 * 3 + 600;
        method319(var28, var29, var30, var26, var27, var33, var25);
        int var48;
        if (field767) {
            int var49;
            if (Statics.field1379.method2535()) {
                var49 = Statics.field5138.field1319;
            } else {
                int var50 = method3234(Statics.field5138, Statics.field313, Statics.field412, Statics.field5138.field1319);
                if (var50 - Statics.field3563 >= 800 || (Statics.field5138.field1326[Statics.field5138.field1319][Statics.field313 >> 7][Statics.field412 >> 7] & 0x4) == 0) {
                    var49 = 3;
                } else {
                    var49 = Statics.field5138.field1319;
                }
            }
            var48 = var49;
        } else {
            int var34;
            if (Statics.field1379.method2535()) {
                var34 = Statics.field5138.field1319;
            } else {
                label418: {
                    int var35 = 3;
                    int var36 = Statics.field4085.method1165() >> 7;
                    int var37 = Statics.field4085.method1172() >> 7;
                    if (Statics.field4631 < 310) {
                        int var38;
                        int var39;
                        if (field595 == 1) {
                            var38 = Statics.field4065 >> 7;
                            var39 = Statics.field3399 >> 7;
                        } else {
                            var38 = var36;
                            var39 = var37;
                        }
                        int var40 = Statics.field313 >> 7;
                        int var41 = Statics.field412 >> 7;
                        if (var40 < 0 || 104 <= var40 || var41 < 0 || 104 <= var41) {
                            var34 = Statics.field5138.field1319;
                            break label418;
                        }
                        if (var38 < 0 || 104 <= var38 || var39 < 0 || 104 <= var39) {
                            var34 = Statics.field5138.field1319;
                            break label418;
                        }
                        if ((Statics.field5138.field1326[Statics.field5138.field1319][var40][var41] & 0x4) != 0) {
                            var35 = Statics.field5138.field1319;
                        }
                        int var42;
                        if (var38 > var40) {
                            var42 = var38 - var40;
                        } else {
                            var42 = var40 - var38;
                        }
                        int var43;
                        if (var39 > var41) {
                            var43 = var39 - var41;
                        } else {
                            var43 = var41 - var39;
                        }
                        if (var42 > var43) {
                            int var44 = var43 * 65536 / var42;
                            int var45 = 32768;
                            while (var38 != var40) {
                                if (var40 < var38) {
                                    var40++;
                                } else if (var40 > var38) {
                                    var40--;
                                }
                                if ((Statics.field5138.field1326[Statics.field5138.field1319][var40][var41] & 0x4) != 0) {
                                    var35 = Statics.field5138.field1319;
                                }
                                var45 += var44;
                                if (var45 >= 65536) {
                                    var45 -= 65536;
                                    if (var41 < var39) {
                                        var41++;
                                    } else if (var41 > var39) {
                                        var41--;
                                    }
                                    if ((Statics.field5138.field1326[Statics.field5138.field1319][var40][var41] & 0x4) != 0) {
                                        var35 = Statics.field5138.field1319;
                                    }
                                }
                            }
                        } else if (var43 > 0) {
                            int var46 = var42 * 65536 / var43;
                            int var47 = 32768;
                            while (var39 != var41) {
                                if (var41 < var39) {
                                    var41++;
                                } else if (var41 > var39) {
                                    var41--;
                                }
                                if ((Statics.field5138.field1326[Statics.field5138.field1319][var40][var41] & 0x4) != 0) {
                                    var35 = Statics.field5138.field1319;
                                }
                                var47 += var46;
                                if (var47 >= 65536) {
                                    var47 -= 65536;
                                    if (var40 < var38) {
                                        var40++;
                                    } else if (var40 > var38) {
                                        var40--;
                                    }
                                    if ((Statics.field5138.field1326[Statics.field5138.field1319][var40][var41] & 0x4) != 0) {
                                        var35 = Statics.field5138.field1319;
                                    }
                                }
                            }
                        }
                    }
                    if (var36 >= 0 && 104 > var36 && var37 >= 0 && 104 > var37) {
                        if ((Statics.field5138.field1326[Statics.field5138.field1319][var36][var37] & 0x4) != 0) {
                            var35 = Statics.field5138.field1319;
                        }
                        var34 = var35;
                    } else {
                        var34 = Statics.field5138.field1319;
                    }
                }
            }
            var48 = var34;
        }
        int var51 = Statics.field313;
        int var52 = Statics.field3563;
        int var53 = Statics.field412;
        int var54 = Statics.field4631;
        int var55 = Statics.field3668;
        for (int var56 = 0; var56 < 5; var56++) {
            if (field772[var56]) {
                int var57 = (int) (Math.random() * (double) (field773[var56] * 2 + 1) - (double) field773[var56] + Math.sin((double) field775[var56] / 100.0D * (double) field499[var56]) * (double) field665[var56]);
                if (var56 == 0) {
                    Statics.field313 += var57;
                }
                if (var56 == 1) {
                    Statics.field3563 += var57;
                }
                if (var56 == 2) {
                    Statics.field412 += var57;
                }
                if (var56 == 3) {
                    Statics.field3668 = Statics.field3668 + var57 & 0x7FF;
                }
                if (var56 == 4) {
                    Statics.field4631 += var57;
                    if (Statics.field4631 < 128) {
                        Statics.field4631 = 128;
                    }
                    if (Statics.field4631 > 383) {
                        Statics.field4631 = 383;
                    }
                }
            }
        }
        int var58 = class36.field224;
        int var59 = class36.field214;
        if (class36.field220 != 0) {
            var58 = class36.field223;
            var59 = class36.field215;
        }
        if (var58 >= var22 && var58 < var22 + var24 && var59 >= var23 && var59 < var23 + var25) {
            int var60 = var58 - var22;
            int var61 = var59 - var23;
            class295.field3160 = var60;
            class295.field3159 = var61;
            class295.field3163 = true;
            class295.field3165 = 0;
            class295.field3161 = false;
        } else {
            class295.method3282();
        }
        method3115();
        class557.method9060(var22, var23, var24, var25, 0);
        method3115();
        int var62 = class278.method4769();
        class278.method4837(Statics.field4675.field188);
        class278.field2877.field3185 = field789;
        Statics.field5138.field1317.method5017(Statics.field313, Statics.field3563, Statics.field412, Statics.field4631, Statics.field3668, var48);
        class278.method4837(false);
        if (field792) {
            class557.method9073();
        }
        class278.field2877.field3185 = var62;
        method3115();
        Statics.field5138.field1317.method5104();
        for (int var63 = 0; var63 < Statics.field5138.field1323; var63++) {
            class477 var64 = Statics.field5138.field1332[Statics.field5138.field1334[var63]];
            if (var64 != null) {
                var64.field4972.field1317.method5104();
            }
        }
        method7854(Statics.field5138, var22, var23, var24, var25);
        for (int var65 = 0; var65 < Statics.field5138.field1323; var65++) {
            class477 var66 = Statics.field5138.field1332[Statics.field5138.field1334[var65]];
            if (var66 != null) {
                method7854(var66.field4972, var22, var23, var24, var25);
            }
        }
        class102 var67 = Statics.field5138;
        if (field525 == 2) {
            int var68 = (field528 - var67.field1322 << 7) + field601;
            int var69 = (field788 - var67.field1324 << 7) + field532;
            method7219(var67, var68, var69, var68, var69, field544 * 2);
            if (field619 > -1 && field516 % 20 < 10) {
                Statics.field3666[0].method9189(field619 + var22 - 12, field586 + var23 - 28);
            }
        }
        ((class290) class278.field2877.field3195).method5200(field806);
        method5511(var22, var23, var24, var25);
        Statics.field313 = var51;
        Statics.field3563 = var52;
        Statics.field412 = var53;
        Statics.field4631 = var54;
        Statics.field3668 = var55;
        if (field515 && Statics.field2487.method6629(true, false) == 0) {
            field515 = false;
        }
        if (field515) {
            class557.method9060(var22, var23, var24, var25, 0);
            method1085(class379.field4238, false);
        }
    }

    @ObfuscatedName("ev.jm(IIIIZI)V")
    public static final void method2790(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
            var6 = field778;
        } else {
            var6 = (field778 - field777) * var5 / 100 + field777;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field783) {
            short var8 = field783;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field782) {
                var6 = field782;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class557.method9051();
                    class557.method9060(arg0, arg1, var10, arg3, -16777216);
                    class557.method9060(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field784) {
            short var11 = field784;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field752) {
                var6 = field752;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class557.method9051();
                    class557.method9060(arg0, arg1, arg2, var13, -16777216);
                    class557.method9060(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field789 = arg3 * var6 / 334;
        if (field787 != arg2 || field701 != arg3) {
            method3458(arg2, arg3);
        }
        field785 = arg0;
        field786 = arg1;
        field787 = arg2;
        field701 = arg3;
    }

    @ObfuscatedName("gj.jc(Lde;I)V")
    public static void method3227(class102 arg0) {
        if (field552) {
            method5817(arg0, field707, false);
        }
    }

    @ObfuscatedName("nv.jq(Lde;IZI)V")
    public static void method5817(class102 arg0, int arg1, boolean arg2) {
        class94 var3 = arg0.field1327[arg1];
        if (var3 == null || !var3.method2309() || var3.field1139) {
            return;
        }
        var3.field1126 = false;
        if ((field662 && arg0.field1320.field1405 > 50 || arg0.field1320.field1405 > 200) && arg2 && var3.field1199 == var3.field1197) {
            var3.field1126 = true;
        }
        int var4 = var3.field1229 >> 7;
        int var5 = var3.field1192 >> 7;
        if (0 > var4 || var4 >= 104 || 0 > var5 || var5 >= 104) {
            return;
        }
        long var6 = class295.method3918(0, 0, 0, false, var3.field1141, arg0.field1329);
        if (var3.field1132 != null && field516 >= var3.field1120 && field516 < var3.field1119) {
            var3.field1126 = false;
            var3.field1124 = method3234(arg0, var3.field1229, var3.field1192, arg0.field1319);
            var3.field1196 = field516;
            arg0.field1317.method5173(arg0.field1319, var3.field1229, var3.field1192, var3.field1124, 60, var3, var3.field1193, var6, var3.field1133, var3.field1127, var3.field1135, var3.field1140);
            return;
        }
        if ((var3.field1229 & 0x7F) == 64 && (var3.field1192 & 0x7F) == 64) {
            if (field618 == arg0.field1339[var4][var5]) {
                return;
            }
            arg0.field1339[var4][var5] = field618;
        }
        var3.field1124 = method3234(arg0, var3.field1229, var3.field1192, arg0.field1319);
        var3.field1196 = field516;
        arg0.field1317.method4937(arg0.field1319, var3.field1229, var3.field1192, var3.field1124, 60, var3, var3.field1193, var6, var3.field1194);
    }

    @ObfuscatedName("jb.jw(Lde;ZI)V")
    public static final void method4150(class102 arg0, boolean arg1) {
        for (int var2 = 0; var2 < arg0.field1330; var2++) {
            class104 var3 = arg0.field1316[arg0.field1331[var2]];
            if (var3 != null && var3.method2309() && var3.field1348.field2018 == arg1 && var3.field1348.method3437()) {
                int var4 = var3.field1229 >> 7;
                int var5 = var3.field1192 >> 7;
                if (var4 >= 0 && var4 < arg0.field1333 && var5 >= 0 && var5 < arg0.field1321) {
                    if (var3.field1195 == 1 && (var3.field1229 & 0x7F) == 64 && (var3.field1192 & 0x7F) == 64) {
                        if (field618 == arg0.field1339[var4][var5]) {
                            continue;
                        }
                        arg0.field1339[var4][var5] = field618;
                    }
                    long var6 = class295.method3918(0, 0, 1, !var3.field1348.field2022, arg0.field1331[var2], arg0.field1329);
                    var3.field1196 = field516;
                    arg0.field1317.method4937(arg0.field1319, var3.field1229, var3.field1192, method3234(arg0, var3.field1229 + (var3.field1195 * 64 - 64), var3.field1192 + (var3.field1195 * 64 - 64), arg0.field1319), var3.field1195 * 64 - 64 + 60, var3, var3.field1193, var6, var3.field1194);
                }
            }
        }
    }

    @ObfuscatedName("kw.ja(Lde;B)V")
    public static final void method4592(class102 arg0) {
        for (class79 var1 = (class79) arg0.field1325.method6814(); var1 != null; var1 = (class79) arg0.field1325.method6799()) {
            if (arg0.field1319 != var1.field963 || field516 > var1.field973) {
                var1.method8130();
            } else if (field516 >= var1.field970) {
                if (!var1.field993 && var1.field976 != 0) {
                    if (var1.field976 > 0) {
                        class104 var2 = Statics.field92.field1316[var1.field976 - 1];
                        if (var2 != null && 0 <= var2.field1229 && var2.field1229 < 13312 && 0 <= var2.field1192 && var2.field1192 < 13312) {
                            var1.field965 = var2.field1229;
                            var1.field966 = var2.field1192;
                            var1.method2126(var1.field969, var1.field986, var1.field971, field516);
                        }
                    } else {
                        int var3 = -var1.field976 - 1;
                        class94 var4;
                        if (field707 == var3) {
                            var4 = Statics.field297;
                        } else {
                            var4 = Statics.field92.field1327[var3];
                        }
                        if (var4 != null && 0 <= var4.field1229 && var4.field1229 < 13312 && 0 <= var4.field1192 && var4.field1192 < 13312) {
                            var1.field965 = var4.field1229;
                            var1.field966 = var4.field1192;
                            var1.method2126(var1.field969, var1.field986, var1.field971, field516);
                        }
                    }
                }
                if (var1.field989 > 0) {
                    class104 var5 = arg0.field1316[var1.field989 - 1];
                    if (var5 != null && 0 <= var5.field1229 && var5.field1229 < 13312 && 0 <= var5.field1192 && var5.field1192 < 13312) {
                        var1.method2126(var5.field1229, var5.field1192, method3234(arg0, var5.field1229, var5.field1192, var1.field963) - var1.field977, field516);
                    }
                }
                if (var1.field989 < 0) {
                    int var6 = -var1.field989 - 1;
                    class94 var7;
                    if (field707 == var6) {
                        var7 = Statics.field297;
                    } else {
                        var7 = arg0.field1327[var6];
                    }
                    if (var7 != null && 0 <= var7.field1229 && var7.field1229 < 13312 && 0 <= var7.field1192 && var7.field1192 < 13312) {
                        var1.method2126(var7.field1229, var7.field1192, method3234(arg0, var7.field1229, var7.field1192, var1.field963) - var1.field977, field516);
                    }
                }
                var1.method2127(field806);
                arg0.field1317.method4937(arg0.field1319, (int) var1.field979, (int) var1.field980, (int) var1.field981, 60, var1, var1.field987, -1L, false);
            }
        }
    }

    @ObfuscatedName("no.je(I)Lpr;")
    public static class407 method5827() {
        return field715;
    }

    @ObfuscatedName("fa.jr(B)V")
    public static void method3090() {
        for (class231 var0 = (class231) field718.method6814(); var0 != null; var0 = (class231) field718.method6799()) {
            var0.method8130();
        }
    }

    @ObfuscatedName("af.jl(I)Z")
    public static boolean method316() {
        return (field634 & 0x4) != 0;
    }

    @ObfuscatedName("mh.jt(I)Z")
    public static boolean method5542() {
        return (field634 & 0x1) != 0;
    }

    @ObfuscatedName("od.jk(Ldb;I)Z")
    public static boolean method6431(class94 arg0) {
        if (field634 == 0) {
            return false;
        } else if (Statics.field297 == arg0) {
            return (field634 & 0x8) != 0;
        } else {
            boolean var1 = method316() || method5542() && arg0.method2296();
            if (!var1) {
                boolean var2 = (field634 & 0x2) != 0;
                var1 = var2 && arg0.method2299();
            }
            return var1;
        }
    }

    @ObfuscatedName("ed.js(Lde;Ldw;IIIIIB)V")
    public static final void method2873(class102 arg0, class98 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null || !arg1.method2309()) {
            return;
        }
        if (arg1 instanceof class104) {
            class193 var7 = ((class104) arg1).field1348;
            if (var7.field2014 != null) {
                var7 = var7.method3408();
            }
            if (var7 == null) {
                return;
            }
        }
        int var8 = arg0.field1320.field1405;
        int[] var9 = arg0.field1320.field1410;
        boolean var10 = arg2 < var8;
        int var11 = -2;
        if (arg1.field1212 != null && (!var10 || !arg1.field1214 && (field735 == 4 || !arg1.field1213 && (field735 == 0 || field735 == 3 || field735 == 1 && ((class94) arg1).method2296())))) {
            method6671(arg0, arg1, arg1.method2395());
            if (field619 > -1 && field607 < field608) {
                field668[field607] = Statics.field2119.method7427(arg1.field1212) / 2;
                field611[field607] = Statics.field2119.field4768;
                field609[field607] = field619;
                field610[field607] = field586 - var11;
                field613[field607] = arg1.field1227;
                field614[field607] = arg1.field1217;
                field616[field607] = arg1.field1207;
                field541[field607] = arg1.field1218;
                field617[field607] = arg1.field1212;
                field607++;
                var11 += 12;
            }
        }
        if (!arg1.field1225.method6839()) {
            method6671(arg0, arg1, arg1.method2395() + 15);
            for (class103 var12 = (class103) arg1.field1225.method6842(); var12 != null; var12 = (class103) arg1.field1225.method6844()) {
                class99 var13 = var12.method2562(field516);
                if (var13 != null) {
                    class185 var14 = var12.field1343;
                    class561 var15 = var14.method3355();
                    class561 var16 = var14.method3354();
                    int var17 = 0;
                    int var18;
                    if (var15 == null || var16 == null) {
                        var18 = var14.field1941;
                    } else {
                        if (var14.field1943 * 2 < var16.field5458) {
                            var17 = var14.field1943;
                        }
                        var18 = var16.field5458 - var17 * 2;
                    }
                    int var19 = 255;
                    boolean var20 = true;
                    int var21 = field516 - var13.field1275;
                    int var22 = var13.field1272 * var18 / var14.field1941;
                    int var25;
                    if (var13.field1270 > var21) {
                        int var23 = var14.field1937 == 0 ? 0 : var21 / var14.field1937 * var14.field1937;
                        int var24 = var13.field1269 * var18 / var14.field1941;
                        var25 = (var22 - var24) * var23 / var13.field1270 + var24;
                    } else {
                        var25 = var22;
                        int var26 = var13.field1270 + var14.field1938 - var21;
                        if (var14.field1936 >= 0) {
                            var19 = (var26 << 8) / (var14.field1938 - var14.field1936);
                        }
                    }
                    if (var13.field1272 > 0 && var25 < 1) {
                        var25 = 1;
                    }
                    if (var15 == null || var16 == null) {
                        var11 += 5;
                        if (field619 > -1) {
                            int var32 = field619 + arg3 - (var18 >> 1);
                            int var33 = field586 + arg4 - var11;
                            class557.method9060(var32, var33, var25, 5, 65280);
                            class557.method9060(var25 + var32, var33, var18 - var25, 5, 16711680);
                        }
                        var11 += 2;
                    } else {
                        int var27;
                        if (var18 == var25) {
                            var27 = var17 * 2 + var25;
                        } else {
                            var27 = var17 + var25;
                        }
                        int var28 = var15.field5461;
                        var11 += var28;
                        int var29 = field619 + arg3 - (var18 >> 1);
                        int var30 = field586 + arg4 - var11;
                        int var31 = var29 - var17;
                        if (var19 >= 0 && var19 < 255) {
                            var15.method9186(var31, var30, var19);
                            class557.method9059(var31, var30, var27 + var31, var28 + var30);
                            var16.method9186(var31, var30, var19);
                        } else {
                            var15.method9189(var31, var30);
                            class557.method9059(var31, var30, var27 + var31, var28 + var30);
                            var16.method9189(var31, var30);
                        }
                        class557.method9105(arg3, arg4, arg3 + arg5, arg4 + arg6);
                        var11 += 2;
                    }
                } else if (var12.method2563()) {
                    var12.method8130();
                }
            }
        }
        if (var11 == -2) {
            var11 += 7;
        }
        if (var10 && field516 == arg1.field1196 && method6431((class94) arg1)) {
            class94 var34 = (class94) arg1;
            if (var10) {
                method6671(arg0, arg1, arg1.method2395() + 15);
                class436 var35 = (class436) field571.get(class517.field5216);
                var11 += 4;
                var35.method7435(var34.field1137.method9347(), field619 + arg3, field586 + arg4 - var11, 16777215, 0);
                var11 += 18;
            }
        }
        if (var10) {
            class94 var36 = (class94) arg1;
            if (var36.field1139) {
                return;
            }
            if (var36.field1121 != -1 || var36.field1138 != -1) {
                method6671(arg0, arg1, arg1.field1251 + 15);
                if (field619 > -1) {
                    if (var36.field1121 != -1) {
                        var11 += 25;
                        Statics.field3020[var36.field1121].method9189(field619 + arg3 - 12, field586 + arg4 - var11);
                    }
                    if (var36.field1138 != -1) {
                        var11 += 25;
                        Statics.field4477[var36.field1138].method9189(field619 + arg3 - 12, field586 + arg4 - var11);
                    }
                }
            }
            if (arg2 >= 0 && field525 == 10 && field527 == var9[arg2]) {
                method6671(arg0, arg1, arg1.field1251 + 15);
                if (field619 > -1) {
                    int var37 = Statics.field3666[1].field5461 + var11;
                    Statics.field3666[1].method9189(field619 + arg3 - 12, field586 + arg4 - var37);
                }
            }
        } else {
            class104 var38 = (class104) arg1;
            int[] var39 = var38.method2577();
            short[] var40 = var38.method2586();
            if (var40 != null && var39 != null) {
                for (int var41 = 0; var41 < var40.length; var41++) {
                    if (var40[var41] >= 0 && var39[var41] >= 0) {
                        long var42 = (long) var39[var41] << 8 | (long) var40[var41];
                        class561 var44 = (class561) field796.method7728(var42);
                        if (var44 == null) {
                            class561[] var45 = class562.method7834(Statics.field30, var39[var41], 0);
                            if (var45 != null && var40[var41] < var45.length) {
                                var44 = var45[var40[var41]];
                                field796.method7729(var42, var44);
                            }
                        }
                        if (var44 != null) {
                            method6671(arg0, arg1, arg1.method2395() + 15);
                            if (field619 > -1) {
                                var44.method9189(field619 + arg3 - (var44.field5458 >> 1), field586 + ((arg4 - var44.field5461 - 2) * (var41 + 1) - var44.field5461) - 4);
                            }
                        }
                    }
                }
            }
            if (field525 == 1 && field795 == arg0.field1331[arg2 - var8] && field516 % 20 < 10) {
                method6671(arg0, arg1, arg1.method2395() + 15);
                if (field619 > -1) {
                    Statics.field3666[0].method9189(field619 + arg3 - 12, field586 + arg4 - 28);
                }
            }
        }
        for (int var46 = 0; var46 < 4; var46++) {
            int var47 = arg1.field1222[var46];
            int var48 = arg1.field1257[var46];
            class205 var49 = null;
            int var50 = 0;
            if (var48 >= 0) {
                if (var47 <= field516) {
                    continue;
                }
                var49 = Statics.method4536(arg1.field1257[var46]);
                var50 = var49.field2132;
                if (var49 != null && var49.field2134 != null) {
                    var49 = var49.method3598();
                    if (var49 == null) {
                        arg1.field1222[var46] = -1;
                        continue;
                    }
                }
            } else if (var47 < 0) {
                continue;
            }
            int var51 = arg1.field1262[var46];
            class205 var52 = null;
            if (var51 >= 0) {
                var52 = Statics.method4536(var51);
                if (var52 != null && var52.field2134 != null) {
                    var52 = var52.method3598();
                }
            }
            if (var47 - var50 <= field516) {
                if (var49 == null) {
                    arg1.field1222[var46] = -1;
                } else {
                    method6671(arg0, arg1, arg1.method2395() / 2);
                    if (field619 > -1) {
                        boolean var53 = true;
                        if (var46 == 1) {
                            field586 -= 20;
                        }
                        if (var46 == 2) {
                            field619 -= 15;
                            field586 -= 10;
                        }
                        if (var46 == 3) {
                            field619 += 15;
                            field586 -= 10;
                        }
                        Object var54 = null;
                        Object var55 = null;
                        Object var56 = null;
                        Object var57 = null;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        class561 var66 = null;
                        class561 var67 = null;
                        class561 var68 = null;
                        class561 var69 = null;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        class561 var79 = var49.method3577();
                        if (var79 != null) {
                            var58 = var79.field5458;
                            int var80 = var79.field5461;
                            if (var80 > var78) {
                                var78 = var80;
                            }
                            var62 = var79.field5460;
                        }
                        class561 var81 = var49.method3578();
                        if (var81 != null) {
                            var59 = var81.field5458;
                            int var82 = var81.field5461;
                            if (var82 > var78) {
                                var78 = var82;
                            }
                            var63 = var81.field5460;
                        }
                        class561 var83 = var49.method3579();
                        if (var83 != null) {
                            var60 = var83.field5458;
                            int var84 = var83.field5461;
                            if (var84 > var78) {
                                var78 = var84;
                            }
                            var64 = var83.field5460;
                        }
                        class561 var85 = var49.method3580();
                        if (var85 != null) {
                            var61 = var85.field5458;
                            int var86 = var85.field5461;
                            if (var86 > var78) {
                                var78 = var86;
                            }
                            var65 = var85.field5460;
                        }
                        if (var52 != null) {
                            var66 = var52.method3577();
                            if (var66 != null) {
                                var70 = var66.field5458;
                                int var87 = var66.field5461;
                                if (var87 > var78) {
                                    var78 = var87;
                                }
                                var74 = var66.field5460;
                            }
                            var67 = var52.method3578();
                            if (var67 != null) {
                                var71 = var67.field5458;
                                int var88 = var67.field5461;
                                if (var88 > var78) {
                                    var78 = var88;
                                }
                                var75 = var67.field5460;
                            }
                            var68 = var52.method3579();
                            if (var68 != null) {
                                var72 = var68.field5458;
                                int var89 = var68.field5461;
                                if (var89 > var78) {
                                    var78 = var89;
                                }
                                var76 = var68.field5460;
                            }
                            var69 = var52.method3580();
                            if (var69 != null) {
                                var73 = var69.field5458;
                                int var90 = var69.field5461;
                                if (var90 > var78) {
                                    var78 = var90;
                                }
                                var77 = var69.field5460;
                            }
                        }
                        class432 var91 = var49.method3581();
                        if (var91 == null) {
                            var91 = Statics.field469;
                        }
                        class432 var92;
                        if (var52 == null) {
                            var92 = Statics.field469;
                        } else {
                            var92 = var52.method3581();
                            if (var92 == null) {
                                var92 = Statics.field469;
                            }
                        }
                        Object var93 = null;
                        String var94 = null;
                        boolean var95 = false;
                        int var96 = 0;
                        String var97 = var49.method3576(arg1.field1221[var46]);
                        int var98 = var91.method7427(var97);
                        if (var52 != null) {
                            var94 = var52.method3576(arg1.field1232[var46]);
                            var96 = var92.method7427(var94);
                        }
                        int var99 = 0;
                        int var100 = 0;
                        if (var59 > 0) {
                            if (var83 == null && var85 == null) {
                                var99 = 1;
                            } else {
                                var99 = var98 / var59 + 1;
                            }
                        }
                        if (var52 != null && var71 > 0) {
                            if (var68 == null && var69 == null) {
                                var100 = 1;
                            } else {
                                var100 = var96 / var71 + 1;
                            }
                        }
                        int var101 = 0;
                        int var102 = var101;
                        if (var58 > 0) {
                            var101 += var58;
                        }
                        var101 += 2;
                        int var103 = var101;
                        if (var60 > 0) {
                            var101 += var60;
                        }
                        int var104 = var101;
                        int var105 = var101;
                        int var107;
                        if (var59 > 0) {
                            int var106 = var59 * var99;
                            var107 = var101 + var106;
                            var105 = (var106 - var98) / 2 + var101;
                        } else {
                            var107 = var98 + var101;
                        }
                        int var108 = var107;
                        if (var61 > 0) {
                            var107 += var61;
                        }
                        int var109 = 0;
                        int var110 = 0;
                        int var111 = 0;
                        int var112 = 0;
                        int var113 = 0;
                        if (var52 != null) {
                            var107 += 2;
                            var109 = var107;
                            if (var70 > 0) {
                                var107 += var70;
                            }
                            var107 += 2;
                            var110 = var107;
                            if (var72 > 0) {
                                var107 += var72;
                            }
                            var111 = var107;
                            var113 = var107;
                            if (var71 > 0) {
                                int var114 = var71 * var100;
                                var107 += var114;
                                var113 += (var114 - var96) / 2;
                            } else {
                                var107 += var96;
                            }
                            var112 = var107;
                            if (var73 > 0) {
                                var107 += var73;
                            }
                        }
                        int var115 = arg1.field1222[var46] - field516;
                        int var116 = var49.field2129 - var49.field2129 * var115 / var49.field2132;
                        int var117 = var49.field2138 * var115 / var49.field2132 + -var49.field2138;
                        int var118 = field619 + arg3 - (var107 >> 1) + var116;
                        int var119 = field586 + arg4 - 12 + var117;
                        int var120 = var119;
                        int var121 = var78 + var119;
                        int var122 = var49.field2142 + var119 + 15;
                        int var123 = var122 - var91.field4776;
                        int var124 = var91.field4777 + var122;
                        if (var123 < var119) {
                            var120 = var123;
                        }
                        if (var124 > var121) {
                            var121 = var124;
                        }
                        int var125 = 0;
                        if (var52 != null) {
                            var125 = var52.field2142 + var119 + 15;
                            int var126 = var125 - var92.field4776;
                            int var127 = var92.field4777 + var125;
                            if (var126 < var120) {
                                ;
                            }
                            if (var127 > var121) {
                                ;
                            }
                        }
                        int var130 = 255;
                        if (var49.field2139 >= 0) {
                            var130 = (var115 << 8) / (var49.field2132 - var49.field2139);
                        }
                        if (var130 >= 0 && var130 < 255) {
                            if (var79 != null) {
                                var79.method9186(var102 + var118 - var62, var119, var130);
                            }
                            if (var83 != null) {
                                var83.method9186(var103 + var118 - var64, var119, var130);
                            }
                            if (var81 != null) {
                                for (int var131 = 0; var131 < var99; var131++) {
                                    var81.method9186(var59 * var131 + (var104 + var118 - var63), var119, var130);
                                }
                            }
                            if (var85 != null) {
                                var85.method9186(var108 + var118 - var65, var119, var130);
                            }
                            var91.method7433(var97, var105 + var118, var122, var49.field2131, 0, var130);
                            if (var52 != null) {
                                if (var66 != null) {
                                    var66.method9186(var109 + var118 - var74, var119, var130);
                                }
                                if (var68 != null) {
                                    var68.method9186(var110 + var118 - var76, var119, var130);
                                }
                                if (var67 != null) {
                                    for (int var132 = 0; var132 < var100; var132++) {
                                        var67.method9186(var71 * var132 + (var111 + var118 - var75), var119, var130);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method9186(var112 + var118 - var77, var119, var130);
                                }
                                var92.method7433(var94, var113 + var118, var125, var52.field2131, 0, var130);
                            }
                        } else {
                            if (var79 != null) {
                                var79.method9189(var102 + var118 - var62, var119);
                            }
                            if (var83 != null) {
                                var83.method9189(var103 + var118 - var64, var119);
                            }
                            if (var81 != null) {
                                for (int var133 = 0; var133 < var99; var133++) {
                                    var81.method9189(var59 * var133 + (var104 + var118 - var63), var119);
                                }
                            }
                            if (var85 != null) {
                                var85.method9189(var108 + var118 - var65, var119);
                            }
                            var91.method7528(var97, var105 + var118, var122, var49.field2131 | 0xFF000000, 0);
                            if (var52 != null) {
                                if (var66 != null) {
                                    var66.method9189(var109 + var118 - var74, var119);
                                }
                                if (var68 != null) {
                                    var68.method9189(var110 + var118 - var76, var119);
                                }
                                if (var67 != null) {
                                    for (int var134 = 0; var134 < var100; var134++) {
                                        var67.method9189(var71 * var134 + (var111 + var118 - var75), var119);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method9189(var112 + var118 - var77, var119);
                                }
                                var92.method7528(var94, var113 + var118, var125, var52.field2131 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("sk.jy(Lde;IIIII)V")
    public static final void method7854(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        field607 = 0;
        boolean var5 = false;
        int var6 = -1;
        int var7 = -1;
        int var8 = arg0.field1320.field1405;
        int[] var9 = arg0.field1320.field1410;
        for (int var10 = 0; var10 < arg0.field1330 + var8; var10++) {
            class98 var11;
            if (var10 < var8) {
                var11 = arg0.field1327[var9[var10]];
                if (field531 == var9[var10]) {
                    var5 = true;
                    var6 = var10;
                    continue;
                }
                if (Statics.field297 == var11) {
                    var7 = var10;
                    continue;
                }
            } else {
                var11 = arg0.field1316[arg0.field1331[var10 - var8]];
            }
            method2873(arg0, var11, var10, arg1, arg2, arg3, arg4);
        }
        if (field552 && var7 != -1) {
            method2873(arg0, Statics.field297, var7, arg1, arg2, arg3, arg4);
        }
        if (var5) {
            method2873(arg0, arg0.field1327[field531], var6, arg1, arg2, arg3, arg4);
        }
        for (int var12 = 0; var12 < field607; var12++) {
            int var13 = field609[var12];
            int var14 = field610[var12];
            int var15 = field668[var12];
            int var16 = field611[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field610[var18] - field611[var18] && var14 - var16 < field610[var18] + 2 && var13 - var15 < field668[var18] + field609[var18] && var13 + var15 > field609[var18] - field668[var18] && field610[var18] - field611[var18] < var14) {
                        var14 = field610[var18] - field611[var18];
                        var17 = true;
                    }
                }
            }
            field619 = field609[var12];
            field586 = field610[var12] = var14;
            String var19 = field617[var12];
            if (field612 == 0) {
                int var20 = 16776960;
                if (field613[var12] < 6) {
                    var20 = field734[field613[var12]];
                }
                if (field613[var12] == 6) {
                    var20 = field618 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field613[var12] == 7) {
                    var20 = field618 % 20 < 10 ? 255 : 65535;
                }
                if (field613[var12] == 8) {
                    var20 = field618 % 20 < 10 ? 45056 : 8454016;
                }
                if (field613[var12] == 9) {
                    int var21 = 150 - field616[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field613[var12] == 10) {
                    int var22 = 150 - field616[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field613[var12] == 11) {
                    int var23 = 150 - field616[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field613[var12] == 12 && field541[var12] == null) {
                    int var24 = var19.length();
                    field541[var12] = new int[var24];
                    for (int var25 = 0; var25 < var24; var25++) {
                        int var26 = (int) ((float) var25 / (float) var24 * 64.0F);
                        int var27 = var26 << 10 | 0x380 | 0x40;
                        field541[var12][var25] = class499.field5065[var27];
                    }
                }
                if (field614[var12] == 0) {
                    Statics.field2119.method7426(var19, field619 + arg1, field586 + arg2, var20, 0, field541[var12]);
                }
                if (field614[var12] == 1) {
                    Statics.field2119.method7439(var19, field619 + arg1, field586 + arg2, var20, 0, field618, field541[var12]);
                }
                if (field614[var12] == 2) {
                    Statics.field2119.method7440(var19, field619 + arg1, field586 + arg2, var20, 0, field618, field541[var12]);
                }
                if (field614[var12] == 3) {
                    Statics.field2119.method7441(var19, field619 + arg1, field586 + arg2, var20, 0, field618, 150 - field616[var12], field541[var12]);
                }
                if (field614[var12] == 4) {
                    int var28 = (150 - field616[var12]) * (Statics.field2119.method7427(var19) + 100) / 150;
                    class557.method9059(field619 + arg1 - 50, arg2, field619 + arg1 + 50, arg2 + arg4);
                    Statics.field2119.method7443(var19, field619 + arg1 + 50 - var28, field586 + arg2, var20, 0, field541[var12]);
                    class557.method9105(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
                if (field614[var12] == 5) {
                    int var29 = 150 - field616[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    class557.method9059(arg1, field586 + arg2 - Statics.field2119.field4768 - 1, arg1 + arg3, field586 + arg2 + 5);
                    Statics.field2119.method7426(var19, field619 + arg1, field586 + arg2 + var30, var20, 0, field541[var12]);
                    class557.method9105(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
            } else {
                Statics.field2119.method7435(var19, field619 + arg1, field586 + arg2, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("mm.jg(IIIII)V")
    public static final void method5511(int arg0, int arg1, int arg2, int arg3) {
        field626 = 0;
        int var4 = (Statics.field297.field1229 >> 7) + Statics.field5138.field1322;
        int var5 = (Statics.field297.field1192 >> 7) + Statics.field5138.field1324;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field626 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field626 = 1;
        }
        if (field626 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field626 = 0;
        }
    }

    @ObfuscatedName("pv.km(Lde;Ldw;IB)V")
    public static void method6671(class102 arg0, class98 arg1, int arg2) {
        class348 var3 = arg1.method2371(arg0);
        method7219(arg0, var3.field3733, var3.field3735, arg1.field1229, arg1.field1192, arg2);
    }

    @ObfuscatedName("qu.kg(Lde;IIIIII)V")
    public static void method7219(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 128 || 13056 < arg1 || arg2 < 128 || 13056 < arg2) {
            field619 = -1;
            field586 = -1;
            return;
        }
        int var6 = method3234(arg0, arg3, arg4, arg0.field1319) - arg5;
        int var7 = arg1 - Statics.field313;
        int var8 = var6 - Statics.field3563;
        int var9 = arg2 - Statics.field412;
        int var10 = class278.field2878[Statics.field4631];
        int var11 = class278.field2879[Statics.field4631];
        int var12 = class278.field2878[Statics.field3668];
        int var13 = class278.field2879[Statics.field3668];
        int var14 = var7 * var13 + var9 * var12 >> 16;
        int var15 = var9 * var13 - var7 * var12 >> 16;
        int var17 = var8 * var11 - var10 * var15 >> 16;
        int var18 = var8 * var10 + var11 * var15 >> 16;
        if (var18 >= 50) {
            field619 = field789 * var14 / var18 + field787 / 2;
            field586 = field789 * var17 / var18 + field701 / 2;
        } else {
            field619 = -1;
            field586 = -1;
        }
    }

    @ObfuscatedName("gm.ke(Lde;IIIB)I")
    public static final int method3234(class102 arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 >= arg0.field1326[0].length || var5 >= arg0.field1326[0][0].length) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (arg0.field1326[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * arg0.field1328[var6][var4][var5] + arg0.field1328[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * arg0.field1328[var6][var4][var5 + 1] + arg0.field1328[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @ObfuscatedName("af.ks(IIIIIIII)V")
    public static final void method319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 - 334;
        if (var7 < 0) {
            var7 = 0;
        } else if (var7 > 100) {
            var7 = 100;
        }
        int var8 = (field780 - field650) * var7 / 100 + field650;
        int var9 = arg5 * var8 / 256;
        int var11 = 2048 - arg3 & 0x7FF;
        int var12 = 2048 - arg4 & 0x7FF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var9;
        if (var11 != 0) {
            int var16 = class278.field2878[var11];
            int var17 = class278.field2879[var11];
            int var18 = var14 * var17 - var9 * var16 >> 16;
            var15 = var14 * var16 + var9 * var17 >> 16;
            var14 = var18;
        }
        if (var12 != 0) {
            int var19 = class278.field2878[var12];
            int var20 = class278.field2879[var12];
            int var21 = var13 * var20 + var15 * var19 >> 16;
            var15 = var15 * var20 - var13 * var19 >> 16;
            var13 = var21;
        }
        if (field767) {
            Statics.field2667 = arg0 - var13;
            Statics.field854 = arg1 - var14;
            Statics.field1631 = arg2 - var15;
            Statics.field3566 = arg3;
            Statics.field2552 = arg4;
        } else {
            Statics.field313 = arg0 - var13;
            Statics.field3563 = arg1 - var14;
            Statics.field412 = arg2 - var15;
            Statics.field4631 = arg3;
            Statics.field3668 = arg4;
        }
        if (field595 == 1 && field680 >= 2 && field516 % 50 == 0 && (Statics.field4065 >> 7 != Statics.field297.field1229 >> 7 || Statics.field3399 >> 7 != Statics.field297.field1192 >> 7)) {
            int var22 = Statics.field297.field1128;
            int var23 = (Statics.field4065 >> 7) + Statics.field5138.field1322;
            int var24 = (Statics.field3399 >> 7) + Statics.field5138.field1324;
            method2582(var23, var24, var22, true);
        }
    }

    @ObfuscatedName("mh.kw(ZLug;B)V")
    public static final void method5541(boolean arg0, class546 arg1) {
        field578 = arg0;
        if (!field578) {
            arg1.method8871();
            int var2 = arg1.method8771();
            int var3 = arg1.method8770();
            int var4 = arg1.method8899();
            Statics.field1510 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1510[var5][var6] = arg1.method8734();
                }
            }
            Statics.field916 = new int[var4];
            Statics.field1485 = new int[var4];
            Statics.field1539 = new int[var4];
            Statics.field2895 = new byte[var4][];
            Statics.field4639 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field916[var7] = var10;
                    Statics.field1485[var7] = Statics.field1757.method6555("m" + var8 + "_" + var9);
                    Statics.field1539[var7] = Statics.field1757.method6555("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method2279(var2, var3, true);
            return;
        }
        boolean var11 = arg1.method8763() == 1;
        int var12 = arg1.method8883();
        int var13 = arg1.method8899();
        int var14 = arg1.method8899();
        arg1.method8677();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8678(1);
                    if (var18 == 1) {
                        field579[var15][var16][var17] = arg1.method8678(26);
                    } else {
                        field579[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8679();
        Statics.field1510 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1510[var19][var20] = arg1.method8734();
            }
        }
        Statics.field916 = new int[var14];
        Statics.field1485 = new int[var14];
        Statics.field1539 = new int[var14];
        Statics.field2895 = new byte[var14][];
        Statics.field4639 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field579[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field916[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field916[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field1485[var21] = Statics.field1757.method6555("m" + var30 + "_" + var31);
                            Statics.field1539[var21] = Statics.field1757.method6555("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method2279(var13, var12, !var11);
    }

    @ObfuscatedName("du.kh(IIZI)V")
    public static final void method2279(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field2916 == arg0 && Statics.field1419 == arg1) {
            return;
        }
        Statics.field2916 = arg0;
        Statics.field1419 = arg1;
        method3091(25);
        field510 = true;
        method1085(class379.field4238, true);
        int var3 = Statics.field5138.field1322;
        int var4 = Statics.field5138.field1324;
        Statics.field5138.field1322 = (arg0 - 6) * 8;
        Statics.field5138.field1324 = (arg1 - 6) * 8;
        int var5 = Statics.field5138.field1322 - var3;
        int var6 = Statics.field5138.field1324 - var4;
        int var7 = Statics.field5138.field1322;
        int var8 = Statics.field5138.field1324;
        for (int var9 = 0; var9 < 65536; var9++) {
            class104 var10 = Statics.field5138.field1316[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1205[var11] -= var5;
                    var10.field1247[var11] -= var6;
                }
                var10.field1229 -= var5 * 128;
                var10.field1192 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class94 var13 = Statics.field5138.field1327[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1205[var14] -= var5;
                    var13.field1247[var14] -= var6;
                }
                var13.field1229 -= var5 * 128;
                var13.field1192 -= var6 * 128;
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class477 var16 = Statics.field5138.field1332[var15];
            if (var16 != null) {
                for (int var17 = 0; var17 < 10; var17++) {
                    var16.field4975[var17] -= var5;
                    var16.field4966[var17] -= var6;
                }
                var16.field4968 -= var5 * 128;
                var16.field4970 -= var6 * 128;
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
                        Statics.field5138.field1335[var28][var24][var25] = Statics.field5138.field1335[var28][var26][var27];
                    } else {
                        Statics.field5138.field1335[var28][var24][var25] = null;
                    }
                }
            }
        }
        for (class97 var29 = (class97) Statics.field5138.field1336.method6814(); var29 != null; var29 = (class97) Statics.field5138.field1336.method6799()) {
            var29.field1179 -= var5;
            var29.field1178 -= var6;
            if (var29.field1179 < 0 || 104 <= var29.field1179 || var29.field1178 < 0 || 104 <= var29.field1178) {
                var29.method8130();
            }
        }
        if (field753 != 0) {
            field753 -= var5;
            field754 -= var6;
        }
        field757 = 0;
        field767 = false;
        Statics.field313 -= var5 << 7;
        Statics.field412 -= var6 << 7;
        Statics.field4065 -= var5 << 7;
        Statics.field3399 -= var6 << 7;
        field633 = -1;
        Statics.field5138.field1338.method6806();
        Statics.field5138.field1325.method6806();
        for (int var30 = 0; var30 < 4; var30++) {
            Statics.field5138.field1318[var30].method4057();
        }
    }

    @ObfuscatedName("av.kf(ZB)V")
    public static final void method53(boolean arg0) {
        method3115();
        field653.field1457++;
        if (field653.field1457 < 50 && !arg0) {
            return;
        }
        field653.field1457 = 0;
        if (field569 || field653.method2777() == null) {
            return;
        }
        class322 var1 = class322.method3236(class320.field3368, field653.field1456);
        field653.method2773(var1);
        try {
            field653.method2772();
        } catch (IOException var3) {
            field569 = true;
        }
    }

    @ObfuscatedName("nt.kd(B)V")
    public static final void method5787() {
        method53(false);
        field779 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2895.length; var1++) {
            if (Statics.field1485[var1] != -1 && Statics.field2895[var1] == null) {
                Statics.field2895[var1] = Statics.field1757.method6539(Statics.field1485[var1], 0);
                if (Statics.field2895[var1] == null) {
                    var0 = false;
                    field779++;
                }
            }
            if (Statics.field1539[var1] != -1 && Statics.field4639[var1] == null) {
                Statics.field4639[var1] = Statics.field1757.method6571(Statics.field1539[var1], 0, Statics.field1510[var1]);
                if (Statics.field4639[var1] == null) {
                    var0 = false;
                    field779++;
                }
            }
        }
        if (!var0) {
            field576 = 1;
            return;
        }
        field574 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2895.length; var3++) {
            byte[] var4 = Statics.field4639[var3];
            if (var4 != null) {
                int var5 = (Statics.field916[var3] >> 8) * 64 - Statics.field5138.field1322;
                int var6 = (Statics.field916[var3] & 0xFF) * 64 - Statics.field5138.field1324;
                if (field578) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class84.method14(var4, var5, var6);
            }
        }
        if (!var2) {
            field576 = 2;
            return;
        }
        if (field576 != 0) {
            method1085(class379.field4238 + class105.field1360 + class105.field1357 + 100 + "%" + class105.field1358, true);
        }
        method3115();
        Statics.field5138.field1317.method4926();
        for (int var7 = 0; var7 < 4; var7++) {
            Statics.field5138.field1318[var7].method4057();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    Statics.field5138.field1326[var8][var9][var10] = 0;
                }
            }
        }
        method3115();
        class84.method3986();
        int var11 = Statics.field2895.length;
        class72.method1098();
        method53(true);
        if (!field578) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field916[var12] >> 8) * 64 - Statics.field5138.field1322;
                int var14 = (Statics.field916[var12] & 0xFF) * 64 - Statics.field5138.field1324;
                byte[] var15 = Statics.field2895[var12];
                if (var15 != null) {
                    method3115();
                    class84.method2123(Statics.field5138, var15, var13, var14, Statics.field2916 * 8 - 48, Statics.field1419 * 8 - 48);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field916[var16] >> 8) * 64 - Statics.field5138.field1322;
                int var18 = (Statics.field916[var16] & 0xFF) * 64 - Statics.field5138.field1324;
                byte[] var19 = Statics.field2895[var16];
                if (var19 == null && Statics.field1419 < 800) {
                    method3115();
                    class84.method5214(Statics.field5138, var17, var18, 64, 64);
                }
            }
            method53(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field4639[var20];
                if (var21 != null) {
                    int var22 = (Statics.field916[var20] >> 8) * 64 - Statics.field5138.field1322;
                    int var23 = (Statics.field916[var20] & 0xFF) * 64 - Statics.field5138.field1324;
                    method3115();
                    class84.method4097(Statics.field5138, var21, var22, var23);
                }
            }
        }
        if (field578) {
            for (int var24 = 0; var24 < 4; var24++) {
                method3115();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field579[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field916.length; var34++) {
                                if (Statics.field916[var34] == var33 && Statics.field2895[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class84.method3919(Statics.field5138, Statics.field2895[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class84.method1119(Statics.field5138.field1328, var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field579[0][var37][var38];
                    if (var39 == -1) {
                        class84.method5214(Statics.field5138, var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method53(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method3115();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field579[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field916.length; var49++) {
                                if (Statics.field916[var49] == var48 && Statics.field4639[var49] != null) {
                                    class84.method2182(Statics.field5138, Statics.field4639[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method53(true);
        method3115();
        class84.method705(Statics.field5138);
        method53(true);
        int var50 = class84.field1045;
        if (var50 > Statics.field5138.field1319) {
            var50 = Statics.field5138.field1319;
        }
        if (var50 < Statics.field5138.field1319 - 1) {
            int var51 = Statics.field5138.field1319 - 1;
        }
        if (field662) {
            Statics.field5138.field1317.method5165(class84.field1045);
        } else {
            Statics.field5138.field1317.method5165(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method4140(Statics.field5138, var52, var53);
            }
        }
        method3115();
        method8122();
        class207.field2156.method5500();
        if (Statics.field4675.method483()) {
            class322 var54 = class322.method3236(class320.field3304, field653.field1456);
            var54.field3394.method8714(1057001181);
            field653.method2773(var54);
        }
        if (!field578) {
            int var55 = (Statics.field2916 - 6) / 8;
            int var56 = (Statics.field2916 + 6) / 8;
            int var57 = (Statics.field1419 - 6) / 8;
            int var58 = (Statics.field1419 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field1757.method6580("m" + var59 + "_" + var60);
                        Statics.field1757.method6580("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method3115();
        Statics.method5574();
        class322 var61 = class322.method3236(class320.field3318, field653.field1456);
        field653.method2773(var61);
        class35.method7817();
        field510 = false;
    }

    @ObfuscatedName("hl.kl(Lde;I)V")
    public static void method3525(class102 arg0) {
        int var1 = arg0.field1333 / 8;
        int var2 = arg0.field1321 / 8;
        boolean var3 = false;
        method53(false);
        boolean var4 = true;
        for (int var5 = 0; var5 < Statics.field5042.length; var5++) {
            if (Statics.field148[var5] != -1 && Statics.field5042[var5] == null) {
                Statics.field5042[var5] = Statics.field1757.method6539(Statics.field148[var5], 0);
                if (Statics.field5042[var5] == null) {
                    var4 = false;
                }
            }
            if (Statics.field1697[var5] != -1 && Statics.field4006[var5] == null) {
                Statics.field4006[var5] = Statics.field1757.method6571(Statics.field1697[var5], 0, Statics.field461[var5]);
                if (Statics.field4006[var5] == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return;
        }
        method53(false);
        boolean var6 = true;
        for (int var7 = 0; var7 < Statics.field5042.length; var7++) {
            byte[] var8 = Statics.field4006[var7];
            if (var8 != null) {
                byte var9 = 10;
                byte var10 = 10;
                var6 &= class84.method14(var8, var9, var10);
            }
        }
        if (!var6) {
            return;
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < arg0.field1326[var11].length; var12++) {
                Arrays.fill(arg0.field1326[var11][var12], (byte) 0);
            }
        }
        method3115();
        class84.method3986();
        class72.method1098();
        method53(true);
        for (int var13 = 0; var13 < 4; var13++) {
            method3115();
            for (int var14 = 0; var14 < var1; var14++) {
                for (int var15 = 0; var15 < var2; var15++) {
                    boolean var16 = false;
                    int var17 = field684[var13][var14][var15];
                    if (var17 != -1) {
                        int var18 = var17 >> 24 & 0x3;
                        int var19 = var17 >> 1 & 0x3;
                        int var20 = var17 >> 14 & 0x3FF;
                        int var21 = var17 >> 3 & 0x7FF;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < Statics.field3015.length; var23++) {
                            if (Statics.field3015[var23] == var22 && Statics.field5042[var23] != null) {
                                int var24 = (var20 - var14) * 8;
                                int var25 = (var21 - var15) * 8;
                                class84.method3919(arg0, Statics.field5042[var23], var13, var14 * 8, var15 * 8, var18, (var20 & 0x7) * 8, (var21 & 0x7) * 8, var19, var24, var25);
                                var16 = true;
                                break;
                            }
                        }
                    }
                    if (!var16) {
                        class84.method1119(arg0.field1328, var13, var14 * 8, var15 * 8);
                    }
                }
            }
        }
        for (int var26 = 0; var26 < 13; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                int var28 = field684[0][var26][var27];
                if (var28 == -1) {
                    class84.method5214(arg0, var26 * 8, var27 * 8, 8, 8);
                }
            }
        }
        method53(true);
        for (int var29 = 0; var29 < 4; var29++) {
            method3115();
            for (int var30 = 0; var30 < var1; var30++) {
                for (int var31 = 0; var31 < var2; var31++) {
                    int var32 = field684[var29][var30][var31];
                    if (var32 != -1) {
                        int var33 = var32 >> 24 & 0x3;
                        int var34 = var32 >> 1 & 0x3;
                        int var35 = var32 >> 14 & 0x3FF;
                        int var36 = var32 >> 3 & 0x7FF;
                        int var37 = (var35 / 8 << 8) + var36 / 8;
                        for (int var38 = 0; var38 < Statics.field3015.length; var38++) {
                            if (Statics.field3015[var38] == var37 && Statics.field4006[var38] != null) {
                                class84.method2182(arg0, Statics.field4006[var38], var29, var30 * 8, var31 * 8, var33, (var35 & 0x7) * 8, (var36 & 0x7) * 8, var34);
                                break;
                            }
                        }
                    }
                }
            }
        }
        method53(true);
        method3115();
        class84.method705(arg0);
        method53(true);
        class207.field2156.method5500();
        method3115();
        Statics.method5574();
        field511 = false;
    }

    @ObfuscatedName("na.kp(IIIIII)V")
    public static final void method5806(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class283 var5 = Statics.field5138.field1317;
        long var6 = var5.method4952(arg0, arg1, arg2);
        if (var6 != 0L) {
            int var8 = var5.method4956(arg0, arg1, arg2, var6);
            int var9 = var8 >> 6 & 0x3;
            int var10 = var8 & 0x1F;
            int var11 = arg3;
            boolean var12 = var6 != 0L;
            if (var12) {
                boolean var13 = (int) (var6 >>> 16 & 0x1L) == 1;
                var12 = !var13;
            }
            if (var12) {
                var11 = arg4;
            }
            int[] var15 = Statics.field2058.field5466;
            int var16 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var17 = class295.method4017(var6);
            class207 var18 = class207.method95(var17);
            if (var18.field2158 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var15[var16] = var11;
                        var15[var16 + 512] = var11;
                        var15[var16 + 1024] = var11;
                        var15[var16 + 1536] = var11;
                    } else if (var9 == 1) {
                        var15[var16] = var11;
                        var15[var16 + 1] = var11;
                        var15[var16 + 2] = var11;
                        var15[var16 + 3] = var11;
                    } else if (var9 == 2) {
                        var15[var16 + 3] = var11;
                        var15[var16 + 3 + 512] = var11;
                        var15[var16 + 3 + 1024] = var11;
                        var15[var16 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var15[var16 + 1536] = var11;
                        var15[var16 + 1536 + 1] = var11;
                        var15[var16 + 1536 + 2] = var11;
                        var15[var16 + 1536 + 3] = var11;
                    }
                }
                if (var10 == 3) {
                    if (var9 == 0) {
                        var15[var16] = var11;
                    } else if (var9 == 1) {
                        var15[var16 + 3] = var11;
                    } else if (var9 == 2) {
                        var15[var16 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var15[var16 + 1536] = var11;
                    }
                }
                if (var10 == 2) {
                    if (var9 == 3) {
                        var15[var16] = var11;
                        var15[var16 + 512] = var11;
                        var15[var16 + 1024] = var11;
                        var15[var16 + 1536] = var11;
                    } else if (var9 == 0) {
                        var15[var16] = var11;
                        var15[var16 + 1] = var11;
                        var15[var16 + 2] = var11;
                        var15[var16 + 3] = var11;
                    } else if (var9 == 1) {
                        var15[var16 + 3] = var11;
                        var15[var16 + 3 + 512] = var11;
                        var15[var16 + 3 + 1024] = var11;
                        var15[var16 + 3 + 1536] = var11;
                    } else if (var9 == 2) {
                        var15[var16 + 1536] = var11;
                        var15[var16 + 1536 + 1] = var11;
                        var15[var16 + 1536 + 2] = var11;
                        var15[var16 + 1536 + 3] = var11;
                    }
                }
            } else {
                class560 var19 = Statics.field4684[var18.field2158];
                if (var19 != null) {
                    int var20 = (var18.field2168 * 4 - var19.field5451) / 2;
                    int var21 = (var18.field2169 * 4 - var19.field5452) / 2;
                    var19.method9148(arg1 * 4 + 48 + var20, (104 - arg2 - var18.field2169) * 4 + 48 + var21);
                }
            }
        }
        long var22 = var5.method4954(arg0, arg1, arg2);
        if (var22 != 0L) {
            int var24 = var5.method4956(arg0, arg1, arg2, var22);
            int var25 = var24 >> 6 & 0x3;
            int var26 = var24 & 0x1F;
            int var27 = class295.method4017(var22);
            class207 var28 = class207.method95(var27);
            if (var28.field2158 != -1) {
                class560 var29 = Statics.field4684[var28.field2158];
                if (var29 != null) {
                    int var30 = (var28.field2168 * 4 - var29.field5451) / 2;
                    int var31 = (var28.field2169 * 4 - var29.field5452) / 2;
                    var29.method9148(arg1 * 4 + 48 + var30, (104 - arg2 - var28.field2169) * 4 + 48 + var31);
                }
            } else if (var26 == 9) {
                int var32 = 15658734;
                boolean var33 = var22 != 0L;
                if (var33) {
                    boolean var34 = (int) (var22 >>> 16 & 0x1L) == 1;
                    var33 = !var34;
                }
                if (var33) {
                    var32 = 15597568;
                }
                int[] var36 = Statics.field2058.field5466;
                int var37 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var25 == 0 || var25 == 2) {
                    var36[var37 + 1536] = var32;
                    var36[var37 + 1024 + 1] = var32;
                    var36[var37 + 512 + 2] = var32;
                    var36[var37 + 3] = var32;
                } else {
                    var36[var37] = var32;
                    var36[var37 + 512 + 1] = var32;
                    var36[var37 + 1024 + 2] = var32;
                    var36[var37 + 1536 + 3] = var32;
                }
            }
        }
        long var38 = var5.method5058(arg0, arg1, arg2);
        if (var38 == 0L) {
            return;
        }
        int var40 = class295.method4017(var38);
        class207 var41 = class207.method95(var40);
        if (var41.field2158 == -1) {
            return;
        }
        class560 var42 = Statics.field4684[var41.field2158];
        if (var42 != null) {
            int var43 = (var41.field2168 * 4 - var42.field5451) / 2;
            int var44 = (var41.field2169 * 4 - var42.field5452) / 2;
            var42.method9148(arg1 * 4 + 48 + var43, (104 - arg2 - var41.field2169) * 4 + 48 + var44);
        }
    }

    @ObfuscatedName("client.ku(Lev;II)Z")
    public boolean method1198(class115 arg0, int arg1) {
        if (arg0.field1459 == 0) {
            Statics.field382 = null;
        } else {
            if (Statics.field382 == null) {
                Statics.field382 = new class467(Statics.field992, Statics.field4675);
            }
            Statics.field382.method7780(arg0.field1461, arg1);
        }
        method7711();
        arg0.field1464 = null;
        return true;
    }

    @ObfuscatedName("client.kb(Lev;I)Z")
    public boolean method1199(class115 arg0) {
        if (Statics.field382 != null) {
            Statics.field382.method7781(arg0.field1461);
        }
        method7711();
        arg0.field1464 = null;
        return true;
    }

    @ObfuscatedName("client.kr(Lev;I)Z")
    public final boolean method1200(class115 arg0) {
        class479 var2 = arg0.method2777();
        class546 var3 = arg0.field1461;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1464 == null) {
                if (arg0.field1462) {
                    if (!var2.method7961(1)) {
                        return false;
                    }
                    var2.method7968(arg0.field1461.field5364, 0, 1);
                    arg0.field1458 = 0;
                    arg0.field1462 = false;
                }
                var3.field5363 = 0;
                if (var3.method8675()) {
                    if (!var2.method7961(1)) {
                        return false;
                    }
                    var2.method7968(arg0.field1461.field5364, 1, 1);
                    arg0.field1458 = 0;
                }
                arg0.field1462 = true;
                class323[] var4 = class323.method3096();
                int var5 = var3.method8692();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5363);
                }
                arg0.field1464 = var4[var5];
                arg0.field1459 = arg0.field1464.field3474;
            }
            if (arg0.field1459 == -1) {
                if (!var2.method7961(1)) {
                    return false;
                }
                arg0.method2777().method7968(var3.field5364, 0, 1);
                arg0.field1459 = var3.field5364[0] & 0xFF;
            }
            if (arg0.field1459 == -2) {
                if (!var2.method7961(2)) {
                    return false;
                }
                arg0.method2777().method7968(var3.field5364, 0, 2);
                var3.field5363 = 0;
                arg0.field1459 = var3.method8899();
            }
            if (!var2.method7961(arg0.field1459)) {
                return false;
            }
            var3.field5363 = 0;
            var2.method7968(var3.field5364, 0, arg0.field1459);
            arg0.field1458 = 0;
            field570.method7638();
            arg0.field1465 = arg0.field1460;
            arg0.field1460 = arg0.field1463;
            arg0.field1463 = arg0.field1464;
            if (class323.field3416 == arg0.field1464) {
                Statics.field1172 = null;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3406 == arg0.field1464) {
                int var6 = var3.method8784();
                int var7 = var3.method8762();
                int var8 = var3.method8762();
                class359 var9 = Statics.field4650.method5895(var6);
                class359.method2354(var9, var7, var8);
                method7942(var9);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3464 == arg0.field1464) {
                method3107(class321.field3388);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3500 == arg0.field1464) {
                field767 = true;
                field568 = false;
                field554 = false;
                Statics.field3559 = var3.method8804();
                Statics.field1189 = var3.method8804();
                Statics.field17 = var3.method8899();
                Statics.field1561 = var3.method8804();
                Statics.field1355 = var3.method8804();
                if (Statics.field1355 >= 100) {
                    int var10 = class377.method6449(Statics.field3559);
                    int var11 = class377.method6449(Statics.field1189);
                    int var12 = method3234(Statics.field5138, var10, var11, Statics.field5138.field1319) - Statics.field17;
                    int var13 = var10 - Statics.field313;
                    int var14 = var12 - Statics.field3563;
                    int var15 = var11 - Statics.field412;
                    int var16 = (int) Math.sqrt((double) (var13 * var13 + var15 * var15));
                    Statics.field4631 = (int) (Math.atan2((double) var14, (double) var16) * 325.9490051269531D) & 0x7FF;
                    Statics.field3668 = (int) (Math.atan2((double) var13, (double) var15) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field4631 < 128) {
                        Statics.field4631 = 128;
                    }
                    if (Statics.field4631 > 383) {
                        Statics.field4631 = 383;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3531 == arg0.field1464) {
                int var17 = var3.method8804();
                int var18 = var3.method8899();
                int var19 = var3.method8804();
                if (var17 == 0) {
                    Statics.field5138.field1319 = var19;
                    Statics.field92 = Statics.field5138;
                } else if (var17 == 1) {
                    class477 var20 = Statics.field5138.field1332[var18];
                    var20.field4972.field1319 = var19;
                    Statics.field92 = var20.field4972;
                } else {
                    throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3534 == arg0.field1464) {
                Statics.field1683 = var3.method8762();
                field581 = var3.method8763();
                Statics.field1351 = var3.method8761();
                for (int var21 = Statics.field1683; var21 < Statics.field1683 + 8; var21++) {
                    for (int var22 = Statics.field1351; var22 < Statics.field1351 + 8; var22++) {
                        if (Statics.field92.field1335[field581][var21][var22] != null) {
                            Statics.field92.field1335[field581][var21][var22] = null;
                            method4485(field581, var21, var22);
                        }
                    }
                }
                for (class97 var23 = (class97) Statics.field92.field1336.method6814(); var23 != null; var23 = (class97) Statics.field92.field1336.method6799()) {
                    if (var23.field1179 >= Statics.field1683 && var23.field1179 < Statics.field1683 + 8 && var23.field1178 >= Statics.field1351 && var23.field1178 < Statics.field1351 + 8 && field581 == var23.field1175) {
                        var23.field1174 = 0;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3451 == arg0.field1464) {
                int var24 = var3.method8770();
                int var25 = var3.method8771();
                int var26 = var3.method8757();
                class359 var27 = Statics.field4650.method5895(var26);
                var27.field3944 = (var25 << 16) + var24;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3501 == arg0.field1464) {
                int var28 = var3.method8785();
                int var29 = var3.method8763();
                class359 var30 = Statics.field4650.method5895(var28);
                class359.method3987(var30, Statics.field297.field1147.field3776, var29);
                method7942(var30);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3443 == arg0.field1464) {
                method3107(class321.field3383);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3482 == arg0.field1464) {
                boolean var31 = var3.method8804() == 1;
                if (var31) {
                    Statics.field4989 = class327.method4500() - var3.method8735();
                    Statics.field2634 = new class390(var3, true);
                } else {
                    Statics.field2634 = null;
                }
                field728 = field696;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3454 == arg0.field1464) {
                int var32 = var3.method8883();
                int var33 = var3.method8899();
                int var34 = var3.method8763();
                if (var32 == 65535) {
                    var32 = -1;
                }
                class104 var35 = Statics.field92.field1316[var33];
                if (var35 != null) {
                    if (var35.field1236 == var32 && var32 != -1) {
                        int var36 = class210.method5910(var32).field2306;
                        if (var36 == 1) {
                            var35.field1237 = 0;
                            var35.field1238 = 0;
                            var35.field1239 = var34;
                            var35.field1215 = 0;
                        } else if (var36 == 2) {
                            var35.field1215 = 0;
                        }
                    } else if (var32 == -1 || var35.field1236 == -1 || class210.method5910(var32).field2299 >= class210.method5910(var35.field1236).field2299) {
                        var35.field1236 = var32;
                        var35.field1237 = 0;
                        var35.field1238 = 0;
                        var35.field1239 = var34;
                        var35.field1215 = 0;
                        var35.field1266 = var35.field1230;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3458 == arg0.field1464) {
                int var37 = var3.method8871();
                int var38 = var3.method8757();
                int var39 = var3.method8774();
                class359 var40 = Statics.field4650.method5895(var38);
                if (var40.field3907 != var39 || var40.field3842 != var37 || var40.field3837 != 0 || var40.field3897 != 0) {
                    var40.field3907 = var39;
                    var40.field3842 = var37;
                    var40.field3837 = 0;
                    var40.field3897 = 0;
                    method7942(var40);
                    this.method1205(var40);
                    if (var40.field3834 == 0) {
                        method4149(Statics.field4650.field3741[var38 >> 16], var40, false);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3497 == arg0.field1464) {
                int var41 = var3.method8734();
                class89 var42 = (class89) field673.method8464((long) var41);
                if (var42 != null) {
                    method6484(var42, true);
                }
                if (field582 != null) {
                    method7942(field582);
                    field582 = null;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3466 == arg0.field1464) {
                method458();
                int var43 = var3.method8763();
                int var44 = var3.method8804();
                int var45 = var3.method8784();
                int var46 = var3.method8763();
                field644[var43] = var45;
                field604[var43] = var46;
                field705[var43] = 1;
                field776[var43] = var44;
                for (int var47 = 0; var47 < 98; var47++) {
                    if (var45 >= class369.field4039[var47]) {
                        field705[var43] = var47 + 2;
                    }
                }
                field688[++field702 - 1 & 0x1F] = var43;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3526 == arg0.field1464) {
                int var48 = var3.method8804();
                int var49 = var3.method8899();
                int var50 = field509 >= 223 ? var3.method8731() : -1;
                this.method497(false);
                if (var48 == 0) {
                    Statics.field4085 = Statics.field5138.field1327[var49];
                    field504 = -1;
                    Statics.field297.field1148 = Statics.field5138;
                } else if (var48 == 1) {
                    field504 = -1;
                    Statics.field4085 = Statics.field5138.field1316[var49];
                } else if (var48 == 2) {
                    field504 = var50;
                    Statics.field4085 = Statics.field5138.field1332[var49];
                    this.method497(true);
                    Statics.field297.field1148 = Statics.field5138.field1332[var49].field4972;
                }
                if (Statics.field4085 == null) {
                    field504 = -1;
                    Statics.field4085 = Statics.field297;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3412 == arg0.field1464) {
                Statics.field1351 = var3.method8804();
                field581 = var3.method8761();
                Statics.field1683 = var3.method8804();
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3470 == arg0.field1464) {
                int var51 = var3.method8804();
                method2048(var51);
                arg0.field1464 = null;
                return false;
            }
            if (class323.field3524 == arg0.field1464) {
                int var52 = var3.method8770();
                if (var52 == 65535) {
                    var52 = -1;
                }
                field567 = var52;
                this.method1328(false);
                method3017(var52);
                class73.method54(field567);
                for (int var53 = 0; var53 < 100; var53++) {
                    field722[var53] = true;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3413 == arg0.field1464) {
                field660 = field696;
                byte var54 = var3.method8857();
                if (arg0.field1459 == 1) {
                    if (var54 >= 0) {
                        field747[var54] = null;
                    } else {
                        Statics.field2869 = null;
                    }
                    arg0.field1464 = null;
                    return true;
                }
                if (var54 >= 0) {
                    field747[var54] = new class168(var3);
                } else {
                    Statics.field2869 = new class168(var3);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3498 == arg0.field1464) {
                for (int var55 = 0; var55 < Statics.field92.field1327.length; var55++) {
                    if (Statics.field92.field1327[var55] != null) {
                        Statics.field92.field1327[var55].field1236 = -1;
                    }
                }
                for (int var56 = 0; var56 < Statics.field92.field1316.length; var56++) {
                    if (Statics.field92.field1316[var56] != null) {
                        Statics.field92.field1316[var56].field1236 = -1;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3517 == arg0.field1464) {
                field524 = var3.method8883() * 30;
                field712 = field696;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3401 == arg0.field1464) {
                field767 = true;
                field568 = false;
                field765 = false;
                Statics.field2542 = var3.method8804();
                Statics.field2103 = var3.method8804();
                Statics.field4584 = var3.method8899();
                Statics.field1880 = var3.method8804();
                Statics.field1984 = var3.method8804();
                if (Statics.field1984 >= 100) {
                    Statics.field313 = class377.method6449(Statics.field2542);
                    Statics.field412 = class377.method6449(Statics.field2103);
                    Statics.field3563 = method3234(Statics.field5138, Statics.field313, Statics.field412, Statics.field5138.field1319) - Statics.field4584;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3495 == arg0.field1464 && field767) {
                field568 = true;
                field554 = false;
                field765 = false;
                for (int var57 = 0; var57 < 5; var57++) {
                    field772[var57] = false;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3533 == arg0.field1464) {
                Statics.field4671 = var3.method8737();
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3419 == arg0.field1464) {
                String var58 = var3.method8739();
                String var59 = class436.method7430(class416.method1928(class366.method3487(var3)));
                class114.method3518(6, var58, var59);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3440 == arg0.field1464) {
                int var60 = var3.method8804();
                int var61 = var3.method8804();
                int var62 = var3.method8804();
                int var63 = var3.method8804();
                field772[var60] = true;
                field773[var60] = var61;
                field665[var60] = var62;
                field775[var60] = var63;
                field499[var60] = 0;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3476 == arg0.field1464) {
                int var64 = var3.method8761();
                int var65 = var3.method8763();
                String var66 = var3.method8739();
                if (var64 >= 1 && var64 <= 8) {
                    if (var66.equalsIgnoreCase(class379.field4390)) {
                        var66 = null;
                    }
                    field687[var64 - 1] = var66;
                    field639[var64 - 1] = var65 == 0;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3519 == arg0.field1464) {
                int var67 = var3.method8804();
                int var68 = var3.method8764();
                byte var69 = var3.method8920();
                int var70 = var3.method8770();
                int var71 = var3.method8762() * 4;
                byte var72 = var3.method8766();
                int var73 = var3.method8763() * 4;
                int var74 = var3.method8770();
                int var75 = var3.method8883();
                int var76 = var3.method8771();
                int var77 = var3.method8732();
                int var78 = var77 >> 16;
                int var79 = var77 >> 8 & 0xFF;
                int var80 = (var77 >> 4 & 0x7) + var78;
                int var81 = (var77 & 0x7) + var79;
                int var82 = var72 + var80;
                int var83 = var69 + var81;
                if (0 <= var80 && var80 < 104 && 0 <= var81 && var81 < 104 && 0 <= var82 && var82 < 104 && 0 <= var83 && var83 < 104 && var74 != 65535) {
                    int var84 = class377.method6449(var80);
                    int var85 = class377.method6449(var81);
                    int var86 = class377.method6449(var82);
                    int var87 = class377.method6449(var83);
                    class79 var88 = new class79(var74, Statics.field92.field1319, var84, var85, method3234(Statics.field92, var84, var85, Statics.field92.field1319) - var73, field516 + var76, field516 + var70, var67, var75, var68, var71);
                    var88.method2126(var86, var87, method3234(Statics.field92, var86, var87, Statics.field92.field1319) - var71, field516 + var76);
                    Statics.field92.field1325.method6794(var88);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3405 == arg0.field1464) {
                Statics.field1599.method1815();
                field706 = field696;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3418 == arg0.field1464) {
                Statics.field1351 = var3.method8761();
                Statics.field1683 = var3.method8804();
                field581 = var3.method8762();
                while (var3.field5363 < arg0.field1459) {
                    int var89 = var3.method8804();
                    class321 var90 = class321.method285()[var89];
                    method3107(var90);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3455 == arg0.field1464) {
                int var91 = var3.method8757();
                class359 var92 = Statics.field4650.method5895(var91);
                for (int var93 = 0; var93 < var92.field3963.length; var93++) {
                    var92.field3963[var93] = -1;
                    var92.field3963[var93] = 0;
                }
                method7942(var92);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3435 == arg0.field1464) {
                int var94 = var3.method8734();
                if (field602 != var94) {
                    field602 = var94;
                    method4031();
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3453 == arg0.field1464) {
                field568 = false;
                field767 = false;
                field765 = false;
                field554 = false;
                Statics.field3559 = 0;
                Statics.field1189 = 0;
                Statics.field17 = 0;
                field805 = false;
                Statics.field1561 = 0;
                Statics.field1355 = 0;
                Statics.field1984 = 0;
                Statics.field1880 = 0;
                Statics.field2542 = 0;
                Statics.field2103 = 0;
                Statics.field4584 = 0;
                field768 = null;
                field770 = null;
                field769 = null;
                for (int var95 = 0; var95 < 5; var95++) {
                    field772[var95] = false;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3502 == arg0.field1464) {
                class37.method3183(var3, arg0.field1459);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3499 == arg0.field1464) {
                int var96 = var3.method8883();
                int var97 = var3.method8784();
                class347.field3729[var96] = var97;
                if (class347.field3731[var96] != var97) {
                    class347.field3731[var96] = var97;
                }
                method2148(var96);
                field697[++field698 - 1 & 0x1F] = var96;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3475 == arg0.field1464) {
                int var98 = var3.method8763();
                int var99 = var3.method8899();
                int var100 = var3.method8883();
                class94 var101;
                if (field707 == var100) {
                    var101 = Statics.field297;
                } else {
                    var101 = Statics.field92.field1327[var100];
                }
                int var102 = var3.method8757();
                if (var101 != null) {
                    var101.method2366(var98, var99, var102 >> 16, var102 & 0xFFFF);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3410 == arg0.field1464) {
                int var103 = var3.method8771();
                if (var103 == 65535) {
                    var103 = -1;
                }
                int var104 = var3.method8883();
                if (var104 == 65535) {
                    var104 = -1;
                }
                int var105 = var3.method8757();
                int var106 = var3.method8757();
                for (int var107 = var104; var107 <= var103; var107++) {
                    long var108 = ((long) var106 << 32) + (long) var107;
                    class505 var110 = field744.method8464(var108);
                    if (var110 != null) {
                        var110.method8130();
                    }
                    field744.method8470(new class504(var105), var108);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3518 == arg0.field1464) {
                int var111 = var3.method8804();
                if (var3.method8804() == 0) {
                    field794[var111] = new class397();
                    var3.field5363 += 18;
                } else {
                    var3.field5363--;
                    field794[var111] = new class397(var3, false);
                }
                field710 = field696;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3532 == arg0.field1464) {
                Statics.field1725 = var3.method8737();
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3510 == arg0.field1464) {
                field774 = var3.method8763();
                field735 = var3.method8804();
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3452 == arg0.field1464) {
                int var112 = var3.method8734();
                int var113 = var3.method8883();
                int var114 = var3.method8899();
                int var115 = var3.method8899();
                class359 var116 = Statics.field4650.method5895(var112);
                if (var116.field3884 != var113 || var116.field3885 != var114 || var116.field3887 != var115) {
                    var116.field3884 = var113;
                    var116.field3885 = var114;
                    var116.field3887 = var115;
                    method7942(var116);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3490 == arg0.field1464) {
                int var117 = var3.method8757();
                int var118 = var3.method8785();
                class359 var119 = Statics.field4650.method5895(var117);
                class359.method4092(var119, var118);
                method7942(var119);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3508 == arg0.field1464) {
                method458();
                field678 = var3.method8899();
                field712 = field696;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3439 == arg0.field1464) {
                method3107(class321.field3381);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3442 == arg0.field1464) {
                method3010();
                arg0.field1464 = null;
                return false;
            }
            if (class323.field3428 == arg0.field1464) {
                method6777();
                byte var120 = var3.method8857();
                if (arg0.field1459 == 1) {
                    if (var120 >= 0) {
                        field746[var120] = null;
                    } else {
                        Statics.field1649 = null;
                    }
                    arg0.field1464 = null;
                    return true;
                }
                if (var120 >= 0) {
                    field746[var120] = new class159(var3);
                } else {
                    Statics.field1649 = new class159(var3);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3467 == arg0.field1464) {
                field767 = true;
                field568 = false;
                field765 = true;
                Statics.field2542 = var3.method8804();
                Statics.field2103 = var3.method8804();
                int var121 = var3.method8899();
                int var122 = var3.method8899();
                field805 = var3.method8737();
                int var123 = var3.method8804();
                int var124 = class377.method6449(Statics.field2542);
                int var125 = class377.method6449(Statics.field2103);
                boolean var126 = false;
                boolean var127 = false;
                int var128;
                int var129;
                if (field805) {
                    var128 = Statics.field3563;
                    var129 = method3234(Statics.field5138, var124, var125, Statics.field5138.field1319) - var121;
                } else {
                    var128 = method3234(Statics.field5138, Statics.field313, Statics.field412, Statics.field5138.field1319) - Statics.field3563;
                    var129 = var121;
                }
                field768 = new class510(Statics.field313, Statics.field412, var128, var124, var125, var129, var122, var123);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3417 == arg0.field1464) {
                String var130 = var3.method8739();
                long var131 = var3.method8735();
                long var133 = (long) var3.method8899();
                long var135 = (long) var3.method8732();
                class382 var137 = (class382) class402.method3799(class382.method3016(), var3.method8804());
                long var138 = (var133 << 32) + var135;
                boolean var140 = false;
                for (int var141 = 0; var141 < 100; var141++) {
                    if (field738[var141] == var138) {
                        var140 = true;
                        break;
                    }
                }
                if (var137.field4462 && Statics.field1599.method1837(new class569(var130, Statics.field992))) {
                    var140 = true;
                }
                if (!var140 && field626 == 0) {
                    field738[field739] = var138;
                    field739 = (field739 + 1) % 100;
                    String var142 = class436.method7430(class416.method1928(class366.method3487(var3)));
                    if (var137.field4453 == -1) {
                        Statics.method6464(9, var130, var142, class418.method4139(var131));
                    } else {
                        Statics.method6464(9, class105.method6534(var137.field4453) + var130, var142, class418.method4139(var131));
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3404 == arg0.field1464) {
                int var143 = var3.method8771();
                int var144 = var3.method8770();
                class104 var145 = Statics.field92.field1316[var144];
                int var146 = var3.method8763();
                int var147 = var3.method8734();
                if (var145 != null) {
                    var145.method2366(var146, var143, var147 >> 16, var147 & 0xFFFF);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3486 == arg0.field1464) {
                int var148 = var3.method8763();
                int var149 = var3.method8770();
                int var150 = var3.method8734();
                class89 var151 = (class89) field673.method8464((long) var150);
                if (var151 != null) {
                    method6484(var151, var151.field1078 != var149);
                }
                method6689(var150, var149, var148);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3444 == arg0.field1464) {
                method3107(class321.field3387);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3493 == arg0.field1464) {
                int var152 = var3.method8761();
                int var153 = var3.method8899();
                if (var153 == 65535) {
                    var153 = -1;
                }
                Statics.method320(Statics.field297, var153, var152);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3424 == arg0.field1464) {
                method16(Statics.field92, var3);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3515 == arg0.field1464) {
                return this.method1198(arg0, 1);
            }
            if (class323.field3449 == arg0.field1464) {
                int var154 = arg0.field1459 + var3.field5363;
                int var155 = var3.method8899();
                if (var155 == 65535) {
                    var155 = -1;
                }
                int var156 = var3.method8899();
                if (field567 != var155) {
                    field567 = var155;
                    this.method1328(false);
                    method3017(field567);
                    class73.method54(field567);
                    for (int var157 = 0; var157 < 100; var157++) {
                        field722[var157] = true;
                    }
                }
                while (var156-- > 0) {
                    int var158 = var3.method8734();
                    int var159 = var3.method8899();
                    int var160 = var3.method8804();
                    class89 var161 = (class89) field673.method8464((long) var158);
                    if (var161 != null && var161.field1078 != var159) {
                        method6484(var161, true);
                        var161 = null;
                    }
                    if (var161 == null) {
                        var161 = method6689(var158, var159, var160);
                    }
                    var161.field1077 = true;
                }
                for (class89 var162 = (class89) field673.method8467(); var162 != null; var162 = (class89) field673.method8471()) {
                    if (var162.field1077) {
                        var162.field1077 = false;
                    } else {
                        method6484(var162, true);
                    }
                }
                field744 = new class521(512);
                while (var3.field5363 < var154) {
                    int var163 = var3.method8734();
                    int var164 = var3.method8899();
                    int var165 = var3.method8899();
                    int var166 = var3.method8734();
                    for (int var167 = var164; var167 <= var165; var167++) {
                        long var168 = ((long) var163 << 32) + (long) var167;
                        field744.method8470(new class504(var166), var168);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3463 == arg0.field1464) {
                for (int var170 = 0; var170 < class347.field3731.length; var170++) {
                    if (class347.field3731[var170] != class347.field3729[var170]) {
                        class347.field3731[var170] = class347.field3729[var170];
                        method2148(var170);
                        field697[++field698 - 1 & 0x1F] = var170;
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3513 == arg0.field1464) {
                return this.method1198(arg0, 2);
            }
            if (class323.field3437 == arg0.field1464) {
                field767 = true;
                field568 = false;
                field554 = true;
                Statics.field3559 = var3.method8804();
                Statics.field1189 = var3.method8804();
                Statics.field17 = var3.method8899();
                int var171 = var3.method8899();
                int var172 = var3.method8804();
                int var173 = class377.method6449(Statics.field3559);
                int var174 = class377.method6449(Statics.field1189);
                int var175 = method3234(Statics.field5138, var173, var174, Statics.field5138.field1319) - Statics.field17;
                int var176 = var173 - Statics.field313;
                int var177 = var175 - Statics.field3563;
                int var178 = var174 - Statics.field412;
                double var179 = Math.sqrt((double) (var176 * var176 + var178 * var178));
                int var181 = method3098((int) (Math.atan2((double) var177, var179) * 325.9490051269531D) & 0x7FF);
                int var182 = method4212((int) (Math.atan2((double) var176, (double) var178) * -325.9490051269531D) & 0x7FF);
                field770 = new class511(Statics.field4631, var181, var171, var172);
                field769 = new class511(Statics.field3668, var182, var171, var172);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3527 == arg0.field1464) {
                field525 = var3.method8804();
                if (field525 == 1) {
                    field795 = var3.method8899();
                }
                if (field525 >= 2 && field525 <= 6) {
                    if (field525 == 2) {
                        field601 = 64;
                        field532 = 64;
                    }
                    if (field525 == 3) {
                        field601 = 0;
                        field532 = 64;
                    }
                    if (field525 == 4) {
                        field601 = 128;
                        field532 = 64;
                    }
                    if (field525 == 5) {
                        field601 = 64;
                        field532 = 0;
                    }
                    if (field525 == 6) {
                        field601 = 64;
                        field532 = 128;
                    }
                    field525 = 2;
                    field528 = var3.method8899();
                    field788 = var3.method8899();
                    field544 = var3.method8804();
                }
                if (field525 == 10) {
                    field527 = var3.method8899();
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3420 == arg0.field1464) {
                field753 = var3.method8804();
                if (field753 == 255) {
                    field753 = 0;
                }
                field754 = var3.method8804();
                if (field754 == 255) {
                    field754 = 0;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3425 == arg0.field1464) {
                var3.field5363 += 28;
                if (var3.method8948()) {
                    method3497(var3, var3.field5363 - 28);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3402 == arg0.field1464) {
                for (int var183 = 0; var183 < Statics.field1875; var183++) {
                    class180 var184 = class180.method3920(var183);
                    if (var184 != null) {
                        class347.field3729[var183] = 0;
                        class347.field3731[var183] = 0;
                    }
                }
                method458();
                field698 += 32;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3503 == arg0.field1464) {
                int var185 = var3.method8871();
                int var186 = var3.method8757();
                class359 var187 = Statics.field4650.method5895(var186);
                if (var187.field3880 != var185 || var185 == -1) {
                    var187.field3880 = var185;
                    var187.field3872 = 0;
                    var187.field3945 = 0;
                    method7942(var187);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3523 == arg0.field1464) {
                int var188 = var3.method8734();
                int var189 = var3.method8899();
                if (var188 < -70000) {
                    var189 += 32768;
                }
                class359 var190;
                if (var188 >= 0) {
                    var190 = Statics.field4650.method5895(var188);
                } else {
                    var190 = null;
                }
                while (var3.field5363 < arg0.field1459) {
                    int var191 = var3.method8744();
                    int var192 = var3.method8899();
                    int var193 = 0;
                    if (var192 != 0) {
                        var193 = var3.method8804();
                        if (var193 == 255) {
                            var193 = var3.method8734();
                        }
                    }
                    if (var190 != null && var191 >= 0 && var191 < var190.field3963.length) {
                        var190.field3963[var191] = var192;
                        var190.field3964[var191] = var193;
                    }
                    class87.method3885(var189, var191, var192 - 1, var193);
                }
                if (var190 != null) {
                    method7942(var190);
                }
                method458();
                field699[++field621 - 1 & 0x1F] = var189 & 0x7FFF;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3480 == arg0.field1464) {
                int var194 = var3.method8744();
                boolean var195 = var3.method8804() == 1;
                String var196 = "";
                boolean var197 = false;
                if (var195) {
                    var196 = var3.method8739();
                    if (Statics.field1599.method1837(new class569(var196, Statics.field992))) {
                        var197 = true;
                    }
                }
                String var198 = var3.method8739();
                if (!var197) {
                    class114.method3518(var194, var196, var198);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3514 == arg0.field1464) {
                int var199 = var3.method8770();
                int var200 = var3.method8757();
                class359 var201 = Statics.field4650.method5895(var200);
                if (var201.field3910 != 2 || var201.field3877 != var199) {
                    var201.field3910 = 2;
                    var201.field3877 = var199;
                    method7942(var201);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3431 == arg0.field1464) {
                String var202 = var3.method8739();
                Object[] var203 = new Object[var202.length() + 1];
                for (int var204 = var202.length() - 1; var204 >= 0; var204--) {
                    if (var202.charAt(var204) == 's') {
                        var203[var204 + 1] = var3.method8739();
                    } else {
                        var203[var204 + 1] = Integer.valueOf(var3.method8734());
                    }
                }
                var203[0] = Integer.valueOf(var3.method8734());
                class90 var205 = new class90();
                var205.field1088 = var203;
                class73.method2137(var205);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3409 == arg0.field1464) {
                method3107(class321.field3384);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3473 == arg0.field1464) {
                field767 = true;
                field568 = false;
                field554 = true;
                int var206 = var3.method8731();
                int var207 = var3.method8731();
                int var208 = method3098(Statics.field4631 + var207 & 0x7EB);
                int var209 = Statics.field3668 + var206;
                int var210 = var3.method8899();
                int var211 = var3.method8804();
                field770 = new class511(Statics.field4631, var208, var210, var211);
                field769 = new class511(Statics.field3668, var209, var210, var211);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3461 == arg0.field1464) {
                method6777();
                byte var212 = var3.method8857();
                class151 var213 = new class151(var3);
                class159 var214;
                if (var212 >= 0) {
                    var214 = field746[var212];
                } else {
                    var214 = Statics.field1649;
                }
                if (var214 == null) {
                    this.method1313(var212);
                    arg0.field1464 = null;
                    return true;
                }
                if (var213.field1708 > var214.field1763) {
                    this.method1313(var212);
                    arg0.field1464 = null;
                    return true;
                }
                if (var213.field1708 < var214.field1763) {
                    arg0.field1464 = null;
                    return true;
                }
                var213.method3095(var214);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3522 == arg0.field1464) {
                method5541(true, arg0.field1461);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3487 == arg0.field1464) {
                int var215 = var3.method8771();
                int var216 = var3.method8757();
                int var217 = var215 >> 10 & 0x1F;
                int var218 = var215 >> 5 & 0x1F;
                int var219 = var215 & 0x1F;
                int var220 = (var219 << 3) + (var217 << 19) + (var218 << 11);
                class359 var221 = Statics.field4650.method5895(var216);
                if (var221.field3913 != var220) {
                    var221.field3913 = var220;
                    method7942(var221);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3465 == arg0.field1464) {
                int var222 = var3.method8899();
                int var223 = var3.method8784();
                class359 var224 = Statics.field4650.method5895(var223);
                if (var224 != null && var224.field3834 == 0) {
                    if (var222 > var224.field3856 - var224.field3848) {
                        var222 = var224.field3856 - var224.field3848;
                    }
                    if (var222 < 0) {
                        var222 = 0;
                    }
                    if (var224.field3854 != var222) {
                        var224.field3854 = var222;
                        method7942(var224);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3478 == arg0.field1464) {
                int var225 = var3.method8883();
                int var226 = var3.method8770();
                class331.method3026(var226, var225);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3457 == arg0.field1464) {
                int var227 = var3.method8883();
                int var228 = var3.method8762() * 4;
                int var229 = var3.method8770();
                int var230 = var3.method8778();
                int var231 = var3.method8763();
                byte var232 = var3.method8857();
                int var233 = var3.method8761();
                int var234 = var3.method8931();
                int var235 = var234 >> 16;
                int var236 = var234 >> 8 & 0xFF;
                int var237 = (var234 >> 4 & 0x7) + var235;
                int var238 = (var234 & 0x7) + var236;
                byte var239 = var3.method8766();
                int var240 = var3.method8763() * 4;
                int var241 = var3.method8899();
                int var242 = var232 + var237;
                int var243 = var238 + var239;
                if (var237 >= 0 && var238 >= 0 && var237 < Statics.field92.field1333 && var238 < Statics.field92.field1321 && var242 >= 0 && var243 >= 0 && var242 < Statics.field92.field1333 && var243 < Statics.field92.field1321 && var227 != 65535) {
                    int var244 = class377.method6449(var237);
                    int var245 = class377.method6449(var238);
                    int var246 = class377.method6449(var242);
                    int var247 = class377.method6449(var243);
                    class79 var248 = new class79(var227, Statics.field92.field1319, var244, var245, method3234(Statics.field92, var244, var245, Statics.field92.field1319) - var240, field516 + var241, field516 + var229, var231, var233, var230, var228);
                    var248.method2126(var246, var247, method3234(Statics.field92, var246, var247, Statics.field92.field1319) - var228, field516 + var241);
                    Statics.field92.field1325.method6794(var248);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3403 == arg0.field1464) {
                method5461(Statics.field92, var3);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3446 == arg0.field1464) {
                Statics.field92.field1320.method2677(var3, arg0.field1459);
                method4124();
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3483 == arg0.field1464) {
                Statics.field5244 = class566.method38(var3.method8804());
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3450 == arg0.field1464) {
                int var249 = var3.method8883();
                int var250 = var3.method8785();
                class359 var251 = Statics.field4650.method5895(var250);
                if (var251.field3910 != 6 || var251.field3877 != var249) {
                    var251.field3910 = 6;
                    var251.field3877 = var249;
                    method7942(var251);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3438 == arg0.field1464) {
                int var252 = var3.method8771();
                int var253 = var3.method8757();
                short var254 = (short) var3.method8774();
                int var255 = var3.method8761();
                class104 var256 = Statics.field92.field1316[var252];
                if (var256 != null) {
                    var256.method2578(var255, var253, var254);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3491 == arg0.field1464) {
                byte[] var257 = new byte[arg0.field1459];
                var3.method8676(var257, 0, var257.length);
                class547 var258 = new class547(var257);
                String var259 = var258.method8739();
                class32.method7064(var259, true, false);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3488 == arg0.field1464) {
                method3107(class321.field3379);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3525 == arg0.field1464) {
                Statics.field1172 = new class487(Statics.field4445);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3481 == arg0.field1464) {
                int var260 = var3.method8899();
                int var261 = var3.method8771();
                if (var261 == 65535) {
                    var261 = -1;
                }
                int var262 = var3.method8883();
                int var263 = var3.method8899();
                int var264 = var3.method8883();
                int var265 = var3.method8771();
                if (var265 == 65535) {
                    var265 = -1;
                }
                ArrayList var266 = new ArrayList();
                var266.add(var265);
                var266.add(var261);
                method8120(var266, var260, var262, var264, var263);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3414 == arg0.field1464) {
                int var267 = var3.method8785();
                String var268 = var3.method8739();
                class359 var269 = Statics.field4650.method5895(var267);
                if (!var268.equals(var269.field3895)) {
                    var269.field3895 = var268;
                    method7942(var269);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3505 == arg0.field1464) {
                int var270 = var3.method8785();
                int var271 = var3.method8771();
                class359 var272 = Statics.field4650.method5895(var270);
                if (var272.field3910 != 1 || var272.field3877 != var271) {
                    var272.field3910 = 1;
                    var272.field3877 = var271;
                    method7942(var272);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3447 == arg0.field1464) {
                int var273 = var3.method8956();
                int var274 = var273 >> 16;
                int var275 = var273 >> 8 & 0xFF;
                int var276 = (var273 >> 4 & 0x7) + var274;
                int var277 = (var273 & 0x7) + var275;
                int var278 = var3.method8762();
                int var279 = var278 >> 2;
                int var280 = var278 & 0x3;
                int var281 = field580[var279];
                int var282 = var3.method8883();
                if (0 <= var276 && var276 < 103 && 0 <= var277 && var277 < 103) {
                    method698(var276, var277, var279, var280, var281, var282);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3433 == arg0.field1464) {
                method4578(Statics.field92, true, var3);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3504 == arg0.field1464) {
                method3107(class321.field3389);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3494 == arg0.field1464) {
                field660 = field696;
                byte var283 = var3.method8857();
                class165 var284 = new class165(var3);
                class168 var285;
                if (var283 >= 0) {
                    var285 = field747[var283];
                } else {
                    var285 = Statics.field2869;
                }
                if (var285 == null) {
                    this.method1208(var283);
                    arg0.field1464 = null;
                    return true;
                }
                if (var284.field1809 > var285.field1822) {
                    this.method1208(var283);
                    arg0.field1464 = null;
                    return true;
                }
                if (var284.field1809 < var285.field1822) {
                    arg0.field1464 = null;
                    return true;
                }
                var284.method3189(var285);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3432 == arg0.field1464) {
                Statics.field1599.field835.method7761(var3, arg0.field1459);
                method3108();
                field706 = field696;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3521 == arg0.field1464) {
                method4578(Statics.field92, false, var3);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3460 == arg0.field1464) {
                method458();
                int var286 = var3.method8734();
                int var287 = var3.method8763();
                int var288 = var3.method8763();
                field644[var288] = var286;
                field604[var288] = var287;
                field705[var288] = 1;
                field776[var288] = var287;
                for (int var289 = 0; var289 < 98; var289++) {
                    if (var286 >= class369.field4039[var289]) {
                        field705[var288] = var289 + 2;
                    }
                }
                field688[++field702 - 1 & 0x1F] = var288;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3426 == arg0.field1464) {
                byte var290 = var3.method8766();
                int var291 = var3.method8883();
                class347.field3729[var291] = var290;
                if (class347.field3731[var291] != var290) {
                    class347.field3731[var291] = var290;
                }
                method2148(var291);
                field697[++field698 - 1 & 0x1F] = var291;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3536 == arg0.field1464) {
                Statics.field1031 = var3.method8737();
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3507 == arg0.field1464) {
                field517++;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3477 == arg0.field1464) {
                int var292 = var3.method8883();
                int var293 = var3.method8770();
                int var294 = var3.method8956();
                int var295 = var294 >> 16;
                int var296 = var294 >> 8 & 0xFF;
                int var297 = (var294 >> 4 & 0x7) + var295;
                int var298 = (var294 & 0x7) + var296;
                int var299 = var3.method8763();
                if (var297 >= 0 && var298 >= 0 && var297 < Statics.field92.field1333 && var298 < Statics.field92.field1321) {
                    int var300 = class377.method6449(var297);
                    int var301 = class377.method6449(var298);
                    class74 var302 = new class74(var292, Statics.field92.field1319, var300, var301, method3234(Statics.field92, var300, var301, Statics.field92.field1319) - var299, var293, field516);
                    Statics.field92.field1338.method6794(var302);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3459 == arg0.field1464) {
                Statics.field1599.method1816(var3, arg0.field1459);
                field706 = field696;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3485 == arg0.field1464) {
                boolean var303 = var3.method8761() == 1;
                int var304 = var3.method8734();
                class359 var305 = Statics.field4650.method5895(var304);
                class359.method5797(var305, Statics.field297.field1147, var303);
                method7942(var305);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3489 == arg0.field1464) {
                byte var306 = var3.method8857();
                long var307 = (long) var3.method8899();
                long var309 = (long) var3.method8732();
                long var311 = (var307 << 32) + var309;
                boolean var313 = false;
                class168 var314 = var306 >= 0 ? field747[var306] : Statics.field2869;
                if (var314 == null) {
                    var313 = true;
                } else {
                    for (int var315 = 0; var315 < 100; var315++) {
                        if (field738[var315] == var311) {
                            var313 = true;
                            break;
                        }
                    }
                }
                if (!var313) {
                    field738[field739] = var311;
                    field739 = (field739 + 1) % 100;
                    String var316 = class366.method3487(var3);
                    int var317 = var306 >= 0 ? 43 : 46;
                    Statics.method6464(var317, "", var316, var314.field1825);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3448 == arg0.field1464) {
                field767 = true;
                field568 = false;
                field554 = true;
                int var318 = method4212(var3.method8731() & 0x7EB);
                int var319 = method3098(var3.method8731() & 0x7EB);
                int var320 = var3.method8899();
                int var321 = var3.method8804();
                field770 = new class511(Statics.field4631, var319, var320, var321);
                field769 = new class511(Statics.field3668, var318, var320, var321);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3468 == arg0.field1464) {
                method5541(false, arg0.field1461);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3423 == arg0.field1464) {
                method3107(class321.field3385);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3471 == arg0.field1464) {
                if (Statics.field1172 == null) {
                    Statics.field1172 = new class487(Statics.field4445);
                }
                class556 var322 = Statics.field4445.method8044(var3);
                Statics.field1172.field5033.method8491(var322.field5429, var322.field5430);
                field572[++field720 - 1 & 0x1F] = var322.field5429;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3472 == arg0.field1464) {
                int var323 = var3.method8804();
                method3507(var323);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3456 == arg0.field1464) {
                field755 = var3.method8804();
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3511 == arg0.field1464) {
                int var324 = var3.method8771();
                if (var324 == 65535) {
                    var324 = -1;
                }
                method3524(var324);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3408 == arg0.field1464) {
                int var325 = var3.method8883();
                if (var325 == 65535) {
                    var325 = -1;
                }
                int var326 = var3.method8879();
                method2422(var325, var326);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3479 == arg0.field1464) {
                method2849(var3.method8739());
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3411 == arg0.field1464) {
                int var327 = var3.method8771();
                class87.method3568(var327);
                field699[++field621 - 1 & 0x1F] = var327 & 0x7FFF;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3434 == arg0.field1464) {
                boolean var328 = var3.method8737();
                if (!var328) {
                    Statics.field5031 = null;
                } else if (Statics.field5031 == null) {
                    Statics.field5031 = new class399();
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3509 == arg0.field1464) {
                int var329 = var3.method8734();
                int var330 = var3.method8734();
                int var331 = class35.method3371();
                class322 var332 = class322.method3236(class320.field3361, field653.field1456);
                var332.field3394.method8927(var331);
                var332.field3394.method8780(var329);
                var332.field3394.method8714(var330);
                var332.field3394.method8758(field176);
                field653.method2773(var332);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3407 == arg0.field1464) {
                int var333 = var3.method8899();
                int var334 = var3.method8804();
                int var335 = var3.method8899();
                method863(var333, var334, var335);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3415 == arg0.field1464) {
                int var336 = var3.method8899();
                int var337 = var3.method8771();
                int var338 = var3.method8899();
                int var339 = var3.method8899();
                class331.method2667(var339, var338, var336, var337);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3421 == arg0.field1464) {
                String var340 = var3.method8739();
                long var341 = (long) var3.method8899();
                long var343 = (long) var3.method8732();
                class382 var345 = (class382) class402.method3799(class382.method3016(), var3.method8804());
                long var346 = (var341 << 32) + var343;
                boolean var348 = false;
                for (int var349 = 0; var349 < 100; var349++) {
                    if (field738[var349] == var346) {
                        var348 = true;
                        break;
                    }
                }
                if (Statics.field1599.method1837(new class569(var340, Statics.field992))) {
                    var348 = true;
                }
                if (!var348 && field626 == 0) {
                    field738[field739] = var346;
                    field739 = (field739 + 1) % 100;
                    String var350 = class436.method7430(class416.method1928(class366.method3487(var3)));
                    byte var351;
                    if (var345.field4461) {
                        var351 = 7;
                    } else {
                        var351 = 3;
                    }
                    if (var345.field4453 == -1) {
                        class114.method3518(var351, var340, var350);
                    } else {
                        class114.method3518(var351, class105.method6534(var345.field4453) + var340, var350);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3506 == arg0.field1464) {
                int var352 = var3.method8734();
                int var353 = var3.method8883();
                if (var353 == 65535) {
                    var353 = -1;
                }
                int var354 = var3.method8734();
                class359 var355 = Statics.field4650.method5895(var354);
                if (var355.field3915) {
                    var355.field3965 = var353;
                    var355.field3938 = var352;
                    class208 var357 = class208.method3193(var353).method3704(var352);
                    var355.field3884 = var357.field2234;
                    var355.field3885 = var357.field2245;
                    var355.field3886 = var357.field2225;
                    var355.field3882 = var357.field2226;
                    var355.field3883 = var357.field2227;
                    var355.field3887 = var357.field2222;
                    if (var357.field2228 == 1) {
                        var355.field3893 = 1;
                    } else {
                        var355.field3893 = 2;
                    }
                    if (var355.field3888 > 0) {
                        var355.field3887 = var355.field3887 * 32 / var355.field3888;
                    } else if (var355.field3947 > 0) {
                        var355.field3887 = var355.field3887 * 32 / var355.field3947;
                    }
                    method7942(var355);
                } else if (var353 == -1) {
                    var355.field3910 = 0;
                    arg0.field1464 = null;
                    return true;
                } else {
                    class208 var356 = class208.method3193(var353).method3704(var352);
                    var355.field3910 = 4;
                    var355.field3877 = var353;
                    var355.field3884 = var356.field2234;
                    var355.field3885 = var356.field2245;
                    var355.field3887 = var356.field2222 * 100 / var352;
                    method7942(var355);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3496 == arg0.field1464) {
                return this.method1199(arg0);
            }
            if (class323.field3462 == arg0.field1464) {
                int var358 = var3.method8734();
                class359 var359 = Statics.field4650.method5895(var358);
                var359.field3910 = 3;
                var359.field3877 = Statics.field297.field1147.method5926();
                method7942(var359);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3528 == arg0.field1464) {
                int var360 = var3.method8804();
                int var361 = var3.method8899();
                this.method497(false);
                if (var360 == 0) {
                    Statics.field4085 = Statics.field5138.field1327[var361];
                } else if (var360 == 1) {
                    Statics.field4085 = Statics.field5138.field1316[var361];
                } else if (var360 == 2) {
                    Statics.field4085 = Statics.field5138.field1332[var361];
                    this.method497(true);
                }
                if (Statics.field4085 == null) {
                    Statics.field4085 = Statics.field297;
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3484 == arg0.field1464) {
                class70 var362 = new class70();
                var362.field822 = var3.method8739();
                var362.field819 = var3.method8899();
                int var363 = var3.method8734();
                var362.field829 = var363;
                if (var362.method1779()) {
                    var362.field820 = "beta";
                    Statics.field10 = true;
                } else {
                    Statics.field10 = false;
                }
                method3091(45);
                var2.method7966();
                Object var364 = null;
                class78.method2270(var362);
                arg0.field1464 = null;
                return false;
            }
            if (class323.field3436 == arg0.field1464) {
                int var365 = var3.method8757();
                int var366 = var3.method8757();
                class89 var367 = (class89) field673.method8464((long) var366);
                class89 var368 = (class89) field673.method8464((long) var365);
                if (var368 != null) {
                    method6484(var368, var367 == null || var367.field1078 != var368.field1078);
                }
                if (var367 != null) {
                    var367.method8130();
                    field673.method8470(var367, (long) var365);
                }
                class359 var369 = Statics.field4650.method5895(var366);
                if (var369 != null) {
                    method7942(var369);
                }
                class359 var370 = Statics.field4650.method5895(var365);
                if (var370 != null) {
                    method7942(var370);
                    method4149(Statics.field4650.field3741[var370.field3831 >>> 16], var370, true);
                }
                if (field567 != -1) {
                    method2884(field567, 1);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3445 == arg0.field1464) {
                field767 = true;
                field568 = false;
                field765 = true;
                Statics.field2542 = var3.method8804();
                Statics.field2103 = var3.method8804();
                int var371 = var3.method8899();
                int var372 = class377.method6449(var3.method8804());
                int var373 = class377.method6449(var3.method8804());
                int var374 = var3.method8899();
                field805 = var3.method8737();
                int var375 = var3.method8804();
                int var376 = class377.method6449(Statics.field2542);
                int var377 = class377.method6449(Statics.field2103);
                boolean var378 = false;
                boolean var379 = false;
                int var380;
                int var381;
                if (field805) {
                    var380 = Statics.field3563;
                    var381 = method3234(Statics.field5138, var376, var377, Statics.field5138.field1319) - var371;
                } else {
                    var380 = method3234(Statics.field5138, Statics.field313, Statics.field412, Statics.field5138.field1319) - Statics.field3563;
                    var381 = var371;
                }
                field768 = new class509(Statics.field313, Statics.field412, var380, var376, var377, var381, var372, var373, var374, var375);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3429 == arg0.field1464) {
                Statics.field315 = var3.method8804();
                Statics.field87 = var3.method8804();
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3516 == arg0.field1464) {
                if (field567 != -1) {
                    method2884(field567, 0);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3530 == arg0.field1464) {
                method3107(class321.field3382);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3529 == arg0.field1464) {
                Statics.field92.field1330 = 0;
                Statics.field92.field1323 = 0;
                for (int var382 = 0; var382 < 65536; var382++) {
                    Statics.field92.field1316[var382] = null;
                }
                for (int var383 = 0; var383 < 2048; var383++) {
                    Statics.field92.field1332[var383] = null;
                }
                Statics.field297.field1148 = Statics.field5138;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3441 == arg0.field1464) {
                byte var384 = var3.method8857();
                String var385 = var3.method8739();
                long var386 = (long) var3.method8899();
                long var388 = (long) var3.method8732();
                class382 var390 = (class382) class402.method3799(class382.method3016(), var3.method8804());
                long var391 = (var386 << 32) + var388;
                boolean var393 = false;
                Object var394 = null;
                class168 var395 = var384 >= 0 ? field747[var384] : Statics.field2869;
                if (var395 == null) {
                    var393 = true;
                } else {
                    int var396 = 0;
                    while (true) {
                        if (var396 >= 100) {
                            if (var390.field4462 && Statics.field1599.method1837(new class569(var385, Statics.field992))) {
                                var393 = true;
                            }
                            break;
                        }
                        if (field738[var396] == var391) {
                            var393 = true;
                            break;
                        }
                        var396++;
                    }
                }
                if (!var393) {
                    field738[field739] = var391;
                    field739 = (field739 + 1) % 100;
                    String var397 = class436.method7430(class366.method3487(var3));
                    int var398 = var384 >= 0 ? 41 : 44;
                    if (var390.field4453 == -1) {
                        Statics.method6464(var398, var385, var397, var395.field1825);
                    } else {
                        Statics.method6464(var398, class105.method6534(var390.field4453) + var385, var397, var395.field1825);
                    }
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3427 == arg0.field1464) {
                int var399 = var3.method8734();
                int var400 = var3.method8899();
                if (var399 < -70000) {
                    var400 += 32768;
                }
                class359 var401;
                if (var399 >= 0) {
                    var401 = Statics.field4650.method5895(var399);
                } else {
                    var401 = null;
                }
                if (var401 != null) {
                    for (int var402 = 0; var402 < var401.field3963.length; var402++) {
                        var401.field3963[var402] = 0;
                        var401.field3964[var402] = 0;
                    }
                }
                class87.method8598(var400);
                int var403 = var3.method8899();
                for (int var404 = 0; var404 < var403; var404++) {
                    int var405 = var3.method8762();
                    if (var405 == 255) {
                        var405 = var3.method8785();
                    }
                    int var406 = var3.method8899();
                    if (var401 != null && var404 < var401.field3963.length) {
                        var401.field3963[var404] = var406;
                        var401.field3964[var404] = var405;
                    }
                    class87.method3885(var400, var404, var406 - 1, var405);
                }
                if (var401 != null) {
                    method7942(var401);
                }
                method458();
                field699[++field621 - 1 & 0x1F] = var400 & 0x7FFF;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3512 == arg0.field1464) {
                int var407 = var3.method8785();
                boolean var408 = var3.method8804() == 1;
                class359 var409 = Statics.field4650.method5895(var407);
                if (var409.field3852 != var408) {
                    var409.field3852 = var408;
                    method7942(var409);
                }
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3430 == arg0.field1464) {
                int var410 = var3.method8770();
                int var411 = var3.method8899();
                int var412 = var3.method8770();
                int var413 = var3.method8883();
                int var414 = var3.method8883();
                if (var410 == 65535) {
                    var410 = -1;
                }
                ArrayList var415 = new ArrayList();
                var415.add(var410);
                method8120(var415, var412, var413, var411, var414);
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3469 == arg0.field1464) {
                method458();
                field679 = var3.method8731();
                field712 = field696;
                arg0.field1464 = null;
                return true;
            }
            if (class323.field3520 == arg0.field1464) {
                method3107(class321.field3386);
                arg0.field1464 = null;
                return true;
            }
            class572.method7807("" + (arg0.field1464 == null ? -1 : arg0.field1464.field3535) + class105.field1363 + (arg0.field1460 == null ? -1 : arg0.field1460.field3535) + class105.field1363 + (arg0.field1465 == null ? -1 : arg0.field1465.field3535) + class105.field1363 + arg0.field1459, (Throwable) null);
            method3010();
        } catch (IOException var420) {
            method2913();
        } catch (Exception var421) {
            String var418 = "" + (arg0.field1464 == null ? -1 : arg0.field1464.field3535) + class105.field1363 + (arg0.field1460 == null ? -1 : arg0.field1460.field3535) + class105.field1363 + (arg0.field1465 == null ? -1 : arg0.field1465.field3535) + class105.field1363 + arg0.field1459 + class105.field1363 + (Statics.field5138.field1322 + Statics.field297.field1205[0]) + class105.field1363 + (Statics.field5138.field1324 + Statics.field297.field1247[0]) + class105.field1363;
            for (int var419 = 0; var419 < arg0.field1459 && var419 < 50; var419++) {
                var418 = var418 + var3.field5364[var419] + class105.field1363;
            }
            class572.method7807(var418, var421);
            method3010();
        }
        return true;
    }

    @ObfuscatedName("fy.kk(Lmd;S)V")
    public static final void method3107(class321 arg0) {
        class546 var1 = field653.field1461;
        if (class321.field3380 == arg0) {
            int var2 = var1.method8761();
            int var3 = var1.method8763() & 0x1F;
            int var4 = var1.method8763();
            int var5 = var1.method8761();
            int var6 = (var5 >> 4 & 0x7) + Statics.field1683;
            int var7 = (var5 & 0x7) + Statics.field1351;
            int var8 = var1.method8761();
            int var9 = var1.method8770();
            if (var6 >= 0 && var7 >= 0 && var6 < Statics.field92.field1333 && var7 < Statics.field92.field1321) {
                int var10 = var3 + 1;
                if (Statics.field297.field1205[0] >= var6 - var10 && Statics.field297.field1205[0] <= var6 + var10 && Statics.field297.field1247[0] >= var7 - var10 && Statics.field297.field1247[0] <= var7 + var10 && Statics.field1379.method2489() != 0 && var2 > 0 && field757 < 50) {
                    field549[field757] = var9;
                    field763[field757] = null;
                    field761[field757] = (var6 << 16) + (var7 << 8) + var3;
                    field759[field757] = var2;
                    field760[field757] = var4;
                    field669[field757] = var8;
                    field757++;
                }
            }
            return;
        }
        if (class321.field3383 == arg0) {
            int var11 = var1.method8762();
            int var12 = var1.method8762();
            int var13 = (var12 >> 4 & 0x7) + Statics.field1683;
            int var14 = (var12 & 0x7) + Statics.field1351;
            int var15 = var1.method8899();
            int var16 = Statics.field92.field1319;
            if (var13 >= 0 && var14 >= 0 && var13 < Statics.field92.field1333 && var14 < Statics.field92.field1321) {
                class407 var17 = Statics.field92.field1335[var16][var13][var14];
                if (var17 != null) {
                    for (class108 var18 = (class108) var17.method6814(); var18 != null; var18 = (class108) var17.method6799()) {
                        if ((var15 & 0x7FFF) == var18.field1388) {
                            var18.method2653(var11);
                            break;
                        }
                    }
                }
                if (var13 >= 0 && var14 >= 0 && var13 < Statics.field92.field1333 && var14 < Statics.field92.field1321) {
                    int var19 = field581 == -1 ? Statics.field92.field1319 : field581;
                    method5180(var19, var13, var14, var15, var11);
                }
                return;
            }
        }
        if (class321.field3379 == arg0) {
            int var20 = var1.method8804();
            int var21 = (var20 >> 4 & 0x7) + Statics.field1683;
            int var22 = (var20 & 0x7) + Statics.field1351;
            int var23 = var1.method8762();
            int var24 = var23 >> 2;
            int var25 = var23 & 0x3;
            int var26 = field580[var24];
            if (var21 >= 0 && var22 >= 0 && var21 < Statics.field92.field1333 && var22 < Statics.field92.field1321) {
                int var27 = field581 == -1 ? Statics.field92.field1319 : field581;
                method429(Statics.field92, var27, var21, var22, var26, -1, var24, var25, 31, 0, -1);
            }
        } else if (class321.field3386 == arg0) {
            int var28 = var1.method8761();
            int var29 = (var28 >> 4 & 0x7) + Statics.field1683;
            int var30 = (var28 & 0x7) + Statics.field1351;
            int var31 = var1.method8762();
            int var32 = var1.method8771();
            int var33 = var1.method8770();
            if (var29 >= 0 && var30 >= 0 && var29 < Statics.field92.field1333 && var30 < Statics.field92.field1321) {
                int var34 = class377.method6449(var29);
                int var35 = class377.method6449(var30);
                int var36 = field581 == -1 ? Statics.field92.field1319 : field581;
                class74 var37 = new class74(var33, var36, var34, var35, method3234(Statics.field92, var34, var35, var36) - var31, var32, field516);
                Statics.field92.field1338.method6794(var37);
            }
        } else if (class321.field3384 == arg0) {
            int var38 = var1.method8785();
            int var39 = var1.method8899();
            int var40 = var1.method8734();
            int var41 = var1.method8762();
            int var42 = (var41 >> 4 & 0x7) + Statics.field1683;
            int var43 = (var41 & 0x7) + Statics.field1351;
            if (var42 >= 0 && var43 >= 0 && var42 < Statics.field92.field1333 && var43 < Statics.field92.field1321) {
                int var44 = field581 == -1 ? Statics.field92.field1319 : field581;
                method442(var44, var42, var43, var39, var40, var38);
            }
        } else if (class321.field3388 == arg0) {
            byte var45 = var1.method8857();
            int var46 = var1.method8770();
            byte var47 = var1.method8765();
            int var48 = var1.method8733();
            int var49 = var1.method8804();
            int var50 = var1.method8763();
            int var51 = (var50 >> 4 & 0x7) + Statics.field1683;
            int var52 = (var50 & 0x7) + Statics.field1351;
            int var53 = var1.method8804() * 4;
            int var54 = var1.method8883();
            int var55 = var1.method8771();
            int var56 = var1.method8899();
            int var57 = var1.method8762() * 4;
            int var58 = var1.method8778();
            int var59 = var45 + var51;
            int var60 = var47 + var52;
            if (var51 >= 0 && var52 >= 0 && var51 < Statics.field92.field1333 && var52 < Statics.field92.field1321 && var59 >= 0 && var60 >= 0 && var59 < Statics.field92.field1333 && var60 < Statics.field92.field1321 && var54 != 65535) {
                int var61 = field581 == -1 ? Statics.field92.field1319 : field581;
                method4003(var61, var51, var52, var59, var60, var48, var54, var53, var57, var55, var46, var49, var56, var58);
            }
        } else if (class321.field3382 == arg0) {
            int var62 = var1.method8762();
            int var63 = var62 >> 2;
            int var64 = var62 & 0x3;
            int var65 = field580[var63];
            int var66 = var1.method8763();
            int var67 = var1.method8763();
            int var68 = (var67 >> 4 & 0x7) + Statics.field1683;
            int var69 = (var67 & 0x7) + Statics.field1351;
            int var70 = var1.method8771();
            if (var68 >= 0 && var69 >= 0 && var68 < Statics.field92.field1333 && var69 < Statics.field92.field1321) {
                int var71 = field581 == -1 ? Statics.field92.field1319 : field581;
                method429(Statics.field92, var71, var68, var69, var65, var70, var63, var64, var66, 0, -1);
            }
        } else if (class321.field3389 == arg0) {
            int var72 = var1.method8762();
            int var73 = (var72 >> 4 & 0x7) + Statics.field1683;
            int var74 = (var72 & 0x7) + Statics.field1351;
            int var75 = var1.method8757();
            int var76 = var1.method8883();
            int var77 = Statics.field92.field1319;
            if (0 <= var73 && var73 < 104 && 0 <= var74 && var74 < 104) {
                int var78 = field581 == -1 ? var77 : field581;
                method4869(var78, var73, var74, var76, var75);
            }
        } else {
            if (class321.field3387 == arg0) {
                int var79 = var1.method8899();
                byte var80 = var1.method8766();
                int var81 = var1.method8899();
                byte var82 = var1.method8765();
                byte var83 = var1.method8920();
                byte var84 = var1.method8765();
                int var85 = var1.method8763();
                int var86 = (var85 >> 4 & 0x7) + Statics.field1683;
                int var87 = (var85 & 0x7) + Statics.field1351;
                int var88 = var1.method8763();
                int var89 = var88 >> 2;
                int var90 = var88 & 0x3;
                int var91 = field580[var89];
                int var92 = var1.method8883();
                int var93 = var1.method8771();
                class94 var94;
                if (field707 == var93) {
                    var94 = Statics.field297;
                } else {
                    var94 = Statics.field92.field1327[var93];
                }
                if (var94 != null) {
                    int var95 = field581 == -1 ? Statics.field92.field1319 : field581;
                    method6447(var95, var86, var87, var89, var90, var91, var79, var92, var81, var82, var84, var80, var83, var94);
                }
            }
            if (class321.field3385 == arg0) {
                int var96 = var1.method8762();
                int var97 = var96 >> 2;
                int var98 = var96 & 0x3;
                int var99 = field580[var97];
                int var100 = var1.method8762();
                int var101 = (var100 >> 4 & 0x7) + Statics.field1683;
                int var102 = (var100 & 0x7) + Statics.field1351;
                int var103 = var1.method8770();
                if (0 <= var101 && var101 < 103 && 0 <= var102 && var102 < 103) {
                    int var104 = field581 == -1 ? Statics.field92.field1319 : field581;
                    class97 var105 = method7665(Statics.field92, var104, var101, var102, var99);
                    if (var105 != null) {
                        class207 var106 = class207.method95(var105.field1176);
                        if (var106.field2204) {
                            var105.field1182 = var103;
                            return;
                        }
                    }
                    boolean var107 = method2700(var104, var101, var102, var97, var98, var99, var103);
                    if (var107) {
                        return;
                    }
                    if (var105 != null) {
                        var105.field1182 = var103;
                    }
                }
            } else if (class321.field3381 == arg0) {
                int var108 = var1.method8770();
                boolean var109 = var1.method8763() == 1;
                int var110 = var1.method8771();
                int var111 = var1.method8761();
                int var112 = var1.method8761();
                int var113 = var1.method8899();
                int var114 = var1.method8785();
                int var115 = var1.method8804();
                int var116 = (var115 >> 4 & 0x7) + Statics.field1683;
                int var117 = (var115 & 0x7) + Statics.field1351;
                if (var116 >= 0 && var117 >= 0 && var116 < Statics.field92.field1333 && var117 < Statics.field92.field1321) {
                    int var118 = field581 == -1 ? Statics.field92.field1319 : field581;
                    method790(var118, var116, var117, var110, var114, var111, var113, var108, var112, var109);
                }
            }
        }
    }

    @ObfuscatedName("lk.kz(IIIIIB)V")
    public static void method5180(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class407 var5 = Statics.field92.field1335[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class108 var6 = (class108) var5.method6814(); var6 != null; var6 = (class108) var5.method6799()) {
            if ((arg3 & 0x7FFF) == var6.field1388) {
                var6.method2653(arg4);
                break;
            }
        }
    }

    @ObfuscatedName("bo.kv(IIIIIII)V")
    public static void method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class407 var6 = Statics.field92.field1335[arg0][arg1][arg2];
        if (var6 == null) {
            return;
        }
        for (class108 var7 = (class108) var6.method6814(); var7 != null; var7 = (class108) var6.method6799()) {
            if ((arg3 & 0x7FFF) == var7.field1388 && var7.field1392 == arg4) {
                var7.field1392 = arg5;
                break;
            }
        }
        method4485(arg0, arg1, arg2);
    }

    @ObfuscatedName("of.ki(IIIIIIIIIIIIILdb;I)V")
    public static void method6447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13) {
        class207 var14 = class207.method95(arg6);
        int var15;
        int var16;
        if (arg4 == 1 || arg4 == 3) {
            var15 = var14.field2169;
            var16 = var14.field2168;
        } else {
            var15 = var14.field2168;
            var16 = var14.field2169;
        }
        int var17 = (var15 >> 1) + arg1;
        int var18 = (var15 + 1 >> 1) + arg1;
        int var19 = (var16 >> 1) + arg2;
        int var20 = (var16 + 1 >> 1) + arg2;
        int[][] var21 = Statics.field92.field1328[arg0];
        int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
        int var23 = (arg1 << 7) + (var15 << 6);
        int var24 = (arg2 << 7) + (var16 << 6);
        class294 var25 = var14.method3656(arg3, arg4, var21, var23, var22, var24);
        if (var25 == null) {
            return;
        }
        method429(Statics.field92, arg0, arg1, arg2, arg5, -1, 0, 0, 31, arg7 + 1, arg8 + 1);
        arg13.field1120 = field516 + arg7;
        arg13.field1119 = field516 + arg8;
        arg13.field1132 = var25;
        arg13.field1129 = arg1 * 128 + var15 * 64;
        arg13.field1131 = arg2 * 128 + var16 * 64;
        arg13.field1130 = var22;
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
        arg13.field1133 = arg1 + arg9;
        arg13.field1135 = arg1 + arg11;
        arg13.field1127 = arg2 + arg10;
        arg13.field1140 = arg2 + arg12;
    }

    @ObfuscatedName("il.kn(IIIIIIIIIIIIIII)V")
    public static void method4003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg1 * 128 + 64;
        int var15 = arg2 * 128 + 64;
        int var16 = arg3 * 128 + 64;
        int var17 = arg4 * 128 + 64;
        class79 var18 = new class79(arg6, arg0, var14, var15, method3234(Statics.field92, var14, var15, arg0) - arg7, field516 + arg9, field516 + arg10, arg11, arg12, arg13, arg5, arg8);
        var18.method2126(var16, var17, method3234(Statics.field92, var16, var17, arg0) - arg8, field516 + arg9);
        Statics.field92.field1325.method6794(var18);
    }

    @ObfuscatedName("kj.kc(IIIIIB)V")
    public static void method4869(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class407 var5 = Statics.field92.field1335[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class108 var6 = (class108) var5.method6814(); var6 != null; var6 = (class108) var5.method6799()) {
            if ((arg3 & 0x7FFF) == var6.field1388 && var6.field1392 == arg4) {
                var6.method8130();
                break;
            }
        }
        if (var5.method6814() == null) {
            Statics.field92.field1335[arg0][arg1][arg2] = null;
        }
        method4485(arg0, arg1, arg2);
    }

    @ObfuscatedName("bv.kj(IIIIIIIIIZI)V")
    public static void method790(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        class108 var10 = new class108();
        var10.field1388 = arg3;
        var10.field1392 = arg4;
        var10.method2653(arg5);
        var10.field1390 = field517 + arg6;
        var10.field1391 = field517 + arg7;
        var10.field1389 = arg8;
        var10.field1393 = arg9;
        if (Statics.field92.field1335[arg0][arg1][arg2] == null) {
            Statics.field92.field1335[arg0][arg1][arg2] = new class407();
        }
        Statics.field92.field1335[arg0][arg1][arg2].method6794(var10);
        method4485(arg0, arg1, arg2);
    }

    @ObfuscatedName("bx.ky(IIIIIII)Z")
    public static boolean method698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return method2700(Statics.field92.field1319, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("ew.ko(IIIIIIIB)Z")
    public static boolean method2700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class283 var7 = Statics.field92.field1317;
        if (class381.field4436.field4440 == arg5) {
            class302 var8 = var7.method5040(arg0, arg1, arg2);
            if (var8 != null) {
                int var9 = class295.method4017(var8.field3215);
                if (class368.field4028.field4011 == arg3) {
                    var8.field3214 = new class82(Statics.field92, var9, 2, arg4 + 4, arg0, arg1, arg2, arg6, false, var8.field3214);
                    var8.field3209 = new class82(Statics.field92, var9, 2, arg4 + 1 & 0x3, arg0, arg1, arg2, arg6, false, var8.field3209);
                } else {
                    var8.field3214 = new class82(Statics.field92, var9, arg3, arg4, arg0, arg1, arg2, arg6, false, var8.field3214);
                }
                return true;
            }
        } else if (class381.field4437.field4440 == arg5) {
            class304 var10 = var7.method4949(arg0, arg1, arg2);
            if (var10 != null) {
                int var11 = class295.method4017(var10.field3222);
                if (class368.field4015.field4011 == arg3 || class368.field4027.field4011 == arg3) {
                    var10.field3221 = new class82(Statics.field92, var11, 4, arg4, arg0, arg1, arg2, arg6, false, var10.field3221);
                } else if (class368.field4017.field4011 == arg3) {
                    var10.field3221 = new class82(Statics.field92, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field3221);
                } else if (class368.field4018.field4011 == arg3) {
                    var10.field3221 = new class82(Statics.field92, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field3221);
                } else if (class368.field4019.field4011 == arg3) {
                    var10.field3221 = new class82(Statics.field92, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field3221);
                    var10.field3229 = new class82(Statics.field92, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field3229);
                }
                return true;
            }
        } else if (class381.field4438.field4440 == arg5) {
            class305 var12 = var7.method4950(arg0, arg1, arg2);
            if (class368.field4031.field4011 == arg3) {
                arg3 = class368.field4030.field4011;
            }
            if (var12 != null) {
                var12.field3238 = new class82(Statics.field92, class295.method4017(var12.field3246), arg3, arg4, arg0, arg1, arg2, arg6, false, var12.field3238);
                return true;
            }
        } else if (class381.field4439.field4440 == arg5) {
            class274 var13 = var7.method5061(arg0, arg1, arg2);
            if (var13 != null) {
                var13.field2818 = new class82(Statics.field92, class295.method4017(var13.field2817), 22, arg4, arg0, arg1, arg2, arg6, false, var13.field2818);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("be.kq(Lde;IIIIIIIIIII)V")
    public static void method429(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class407 var11 = arg0.field1336;
        class97 var12 = null;
        for (class97 var13 = (class97) var11.method6814(); var13 != null; var13 = (class97) var11.method6799()) {
            if (var13.field1175 == arg1 && var13.field1179 == arg2 && var13.field1178 == arg3 && var13.field1173 == arg4) {
                var12 = var13;
                break;
            }
        }
        if (var12 == null) {
            var12 = new class97();
            var12.field1175 = arg1;
            var12.field1173 = arg4;
            var12.field1179 = arg2;
            var12.field1178 = arg3;
            var12.field1182 = -1;
            method3028(arg0, var12);
            var11.method6794(var12);
        }
        var12.field1176 = arg5;
        var12.field1187 = arg6;
        var12.field1180 = arg7;
        var12.field1185 = arg9;
        var12.field1174 = arg10;
        var12.method2361(arg8);
    }

    @ObfuscatedName("rt.kx(Lde;IIIIB)Ldy;")
    public static final class97 method7665(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class97 var5 = (class97) arg0.field1336.method6814(); var5 != null; var5 = (class97) arg0.field1336.method6799()) {
            if (var5.field1175 == arg1 && var5.field1179 == arg2 && var5.field1178 == arg3 && var5.field1173 == arg4) {
                return var5;
            }
        }
        return null;
    }

    @ObfuscatedName("tg.ka(B)V")
    public static final void method8122() {
        for (class97 var0 = (class97) Statics.field5138.field1336.method6814(); var0 != null; var0 = (class97) Statics.field5138.field1336.method6799()) {
            if (var0.field1174 == -1) {
                var0.field1185 = 0;
                method3028(Statics.field5138, var0);
            } else {
                var0.method8130();
            }
        }
    }

    @ObfuscatedName("fb.kt(Lde;Ldy;I)V")
    public static final void method3028(class102 arg0, class97 arg1) {
        class283 var2 = arg0.field1317;
        long var3 = 0L;
        int var5 = -1;
        int var6 = 0;
        int var7 = 0;
        if (arg1.field1173 == 0) {
            var3 = var2.method4952(arg1.field1175, arg1.field1179, arg1.field1178);
        }
        if (arg1.field1173 == 1) {
            var3 = var2.method4953(arg1.field1175, arg1.field1179, arg1.field1178);
        }
        if (arg1.field1173 == 2) {
            var3 = var2.method4954(arg1.field1175, arg1.field1179, arg1.field1178);
        }
        if (arg1.field1173 == 3) {
            var3 = var2.method5058(arg1.field1175, arg1.field1179, arg1.field1178);
        }
        if (var3 != 0L) {
            int var8 = var2.method4956(arg1.field1175, arg1.field1179, arg1.field1178, var3);
            var5 = class295.method4017(var3);
            var6 = var8 & 0x1F;
            var7 = var8 >> 6 & 0x3;
        }
        arg1.field1181 = var5;
        arg1.field1186 = var6;
        arg1.field1177 = var7;
    }

    @ObfuscatedName("hb.lk(Lde;B)V")
    public static final void method3456(class102 arg0) {
        for (class97 var1 = (class97) arg0.field1336.method6814(); var1 != null; var1 = (class97) arg0.field1336.method6799()) {
            if (var1.field1174 > 0) {
                var1.field1174--;
            }
            if (var1.field1174 == 0) {
                if (var1.field1181 >= 0) {
                    int var2 = var1.field1181;
                    int var3 = var1.field1186;
                    class207 var4 = class207.method95(var2);
                    if (var3 == 11) {
                        var3 = 10;
                    }
                    if (var3 >= 5 && var3 <= 8) {
                        var3 = 4;
                    }
                    boolean var5 = var4.method3611(var3);
                    if (!var5) {
                        continue;
                    }
                }
                method7050(arg0, var1.field1175, var1.field1173, var1.field1179, var1.field1178, var1.field1181, var1.field1177, var1.field1186, var1.field1182);
                var1.method8130();
            } else {
                if (var1.field1185 > 0) {
                    var1.field1185--;
                }
                if (var1.field1185 == 0 && var1.field1179 >= 1 && var1.field1178 >= 1 && var1.field1179 <= 102 && var1.field1178 <= 102) {
                    if (var1.field1176 >= 0) {
                        int var6 = var1.field1176;
                        int var7 = var1.field1187;
                        class207 var8 = class207.method95(var6);
                        if (var7 == 11) {
                            var7 = 10;
                        }
                        if (var7 >= 5 && var7 <= 8) {
                            var7 = 4;
                        }
                        boolean var9 = var8.method3611(var7);
                        if (!var9) {
                            continue;
                        }
                    }
                    method7050(arg0, var1.field1175, var1.field1173, var1.field1179, var1.field1178, var1.field1176, var1.field1180, var1.field1187, var1.field1182);
                    var1.field1185 = -1;
                    if (var1.field1181 == var1.field1176 && var1.field1181 == -1) {
                        var1.method8130();
                    } else if (var1.field1181 == var1.field1176 && var1.field1180 == var1.field1177 && var1.field1187 == var1.field1186) {
                        var1.method8130();
                    }
                }
            }
        }
    }

    @ObfuscatedName("qa.lf(Lde;IIIIIIIII)V")
    public static final void method7050(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class283 var9 = arg0.field1317;
        if (arg3 < 1 || arg4 < 1 || arg3 > arg0.field1333 - 1 || arg4 > arg0.field1321 - 1) {
            return;
        }
        if (field662 && arg0.field1319 != arg1) {
            return;
        }
        long var10 = 0L;
        boolean var12 = true;
        boolean var13 = false;
        boolean var14 = false;
        if (arg2 == 0) {
            var10 = var9.method4952(arg1, arg3, arg4);
        }
        if (arg2 == 1) {
            var10 = var9.method4953(arg1, arg3, arg4);
        }
        if (arg2 == 2) {
            var10 = var9.method4954(arg1, arg3, arg4);
        }
        if (arg2 == 3) {
            var10 = var9.method5058(arg1, arg3, arg4);
        }
        if (var10 != 0L) {
            int var15 = var9.method4956(arg1, arg3, arg4, var10);
            int var16 = class295.method4017(var10);
            int var17 = var15 & 0x1F;
            int var18 = var15 >> 6 & 0x3;
            class207 var19 = class207.method95(var16);
            class72.method864(arg1, arg3, arg4, var19, var18);
            if (arg2 == 0) {
                var9.method5063(arg1, arg3, arg4);
                if (var19.field2154 != 0) {
                    arg0.field1318[arg1].method4086(arg3, arg4, var17, var18, var19.field2171);
                }
            }
            if (arg2 == 1) {
                var9.method4944(arg1, arg3, arg4);
            }
            if (arg2 == 2) {
                var9.method5174(arg1, arg3, arg4);
                if (var19.field2168 + arg3 > arg0.field1333 - 1 || var19.field2168 + arg4 > arg0.field1321 - 1 || var19.field2169 + arg3 > arg0.field1333 - 1 || var19.field2169 + arg4 > arg0.field1321 - 1) {
                    return;
                }
                if (var19.field2154 != 0) {
                    arg0.field1318[arg1].method4063(arg3, arg4, var19.field2168, var19.field2169, var18, var19.field2171);
                }
            }
            if (arg2 == 3) {
                var9.method4946(arg1, arg3, arg4);
                if (var19.field2154 == 1) {
                    arg0.field1318[arg1].method4065(arg3, arg4);
                }
            }
        }
        if (arg5 < 0) {
            return;
        }
        int var20 = arg1;
        if (arg1 < 3 && (arg0.field1326[1][arg3][arg4] & 0x2) == 2) {
            var20 = arg1 + 1;
        }
        class84.method2109(arg0, arg1, var20, arg3, arg4, arg5, arg6, arg7, arg8, arg0.field1318[arg1]);
        class207 var21 = class207.method95(arg5);
        if (var21 != null && var21.method3619()) {
            class72.method2973(var20, arg3, arg4, var21, arg6);
        }
    }

    @ObfuscatedName("jf.lq(Lde;III)V")
    public static final void method4140(class102 arg0, int arg1, int arg2) {
        method5392(arg0, arg0.field1319, arg1, arg2);
    }

    @ObfuscatedName("jq.li(IIII)V")
    public static final void method4485(int arg0, int arg1, int arg2) {
        method5392(Statics.field92, arg0, arg1, arg2);
    }

    @ObfuscatedName("lt.ln(Lde;IIII)V")
    public static final void method5392(class102 arg0, int arg1, int arg2, int arg3) {
        class407 var4 = arg0.field1335[arg1][arg2][arg3];
        if (var4 == null) {
            arg0.field1317.method4947(arg1, arg2, arg3);
            return;
        }
        long var5 = -99999999L;
        class108 var7 = null;
        for (class108 var8 = (class108) var4.method6814(); var8 != null; var8 = (class108) var4.method6799()) {
            class208 var9 = class208.method3193(var8.field1388);
            long var10 = (long) var9.field2229;
            if (var9.field2228 == 1) {
                var10 *= var8.field1392 < Integer.MAX_VALUE ? (long) (var8.field1392 + 1) : (long) var8.field1392;
            }
            if (var10 > var5) {
                var5 = var10;
                var7 = var8;
            }
        }
        if (var7 == null) {
            arg0.field1317.method4947(arg1, arg2, arg3);
            return;
        }
        var4.method6793(var7);
        class108 var12 = null;
        class108 var13 = null;
        for (class108 var14 = (class108) var4.method6814(); var14 != null; var14 = (class108) var4.method6799()) {
            if (var7.field1388 != var14.field1388) {
                if (var12 == null) {
                    var12 = var14;
                }
                if (var12.field1388 != var14.field1388 && var13 == null) {
                    var13 = var14;
                }
            }
        }
        long var15 = class295.method3918(arg2, arg3, 3, false, 0, arg0.field1329);
        arg0.field1317.method4933(arg1, arg2, arg3, method3234(arg0, class377.method6449(arg2), class377.method6449(arg3), arg1), var7, var15, var12, var13);
    }

    @ObfuscatedName("lp.lw(Lde;Lug;B)V")
    public static void method5461(class102 arg0, class546 arg1) {
        int var2 = arg1.method8804();
        if (var2 < arg0.field1323) {
            throw new RuntimeException("dang");
        } else if (var2 > arg0.field1323) {
            throw new RuntimeException("dang!");
        } else {
            arg0.field1323 = 0;
            for (int var3 = 0; var3 < var2; var3++) {
                int var4 = arg0.field1334[var3];
                class477 var5 = arg0.field1332[var4];
                boolean var6 = arg1.method8804() == 1;
                if (var6) {
                    arg0.field1334[++arg0.field1323 - 1] = var4;
                    byte var7 = arg1.method8857();
                    byte var8 = arg1.method8857();
                    var5.field4965 = arg1.method8899();
                    class239 var9 = class239.method3865((byte) arg1.method8804());
                    class235 var10 = class236.method3093(var5.field4965, var5.field4971);
                    int var11 = Math.min(var10.method4093(), 128);
                    var5.field4964 = var11 / field733;
                    var5.field4969 = var11 % field733;
                    if (var7 != 0 || var8 != 0) {
                        var5.method7949(var5.field4975[0] + var7, var5.field4966[0] + var8, var9);
                    }
                } else {
                    arg0.field1332[var4] = null;
                }
            }
            while (arg1.method8681(field653.field1459) >= 10) {
                int var12 = arg1.method8899();
                arg0.field1334[++arg0.field1323 - 1] = var12;
                int var13 = arg1.method8804();
                int var14 = arg1.method8804();
                int var15 = var13 * 8;
                int var16 = var14 * 8;
                class477 var17 = new class477(var12, var15, var16, Statics.field1379.method2440());
                arg0.field1332[var12] = var17;
                int var18 = arg1.method8804();
                int var19 = arg1.method8804();
                var17.method7948(var18, var19);
                var17.field4971 = arg1.method8899();
                arg1.method8899();
            }
        }
    }

    @ObfuscatedName("ap.lr(Lde;Lug;I)V")
    public static void method16(class102 arg0, class546 arg1) {
        int var2 = arg1.method8899();
        class477 var3 = arg0.field1332[var2];
        class102 var4 = var3.field4972;
        var4.field1322 = arg1.method8899();
        var4.field1324 = arg1.method8899();
        var4.field1320.method2671(arg1, false);
        int var5 = var4.field1333 / 8;
        int var6 = var4.field1321 / 8;
        int var7 = arg1.method8899();
        arg1.method8677();
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < var5; var9++) {
                for (int var10 = 0; var10 < var6; var10++) {
                    int var11 = arg1.method8678(1);
                    if (var11 == 1) {
                        field684[var8][var9][var10] = arg1.method8678(26);
                    } else {
                        field684[var8][var9][var10] = -1;
                    }
                }
            }
        }
        arg1.method8679();
        Statics.field461 = new int[var7][4];
        for (int var12 = 0; var12 < var7; var12++) {
            for (int var13 = 0; var13 < 4; var13++) {
                Statics.field461[var12][var13] = arg1.method8734();
            }
        }
        Statics.field3015 = new int[var7];
        Statics.field148 = new int[var7];
        Statics.field1697 = new int[var7];
        Statics.field5042 = new byte[var7][];
        Statics.field4006 = new byte[var7][];
        int var14 = 0;
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < var5; var16++) {
                for (int var17 = 0; var17 < var6; var17++) {
                    int var18 = field684[var15][var16][var17];
                    if (var18 != -1) {
                        int var19 = var18 >> 14 & 0x3FF;
                        int var20 = var18 >> 3 & 0x7FF;
                        int var21 = (var19 / 8 << 8) + var20 / 8;
                        for (int var22 = 0; var22 < var14; var22++) {
                            if (Statics.field3015[var22] == var21) {
                                var21 = -1;
                                break;
                            }
                        }
                        if (var21 != -1) {
                            Statics.field3015[var14] = var21;
                            int var23 = var21 >> 8 & 0xFF;
                            int var24 = var21 & 0xFF;
                            Statics.field148[var14] = Statics.field1757.method6555("m" + var23 + "_" + var24);
                            Statics.field1697[var14] = Statics.field1757.method6555("l" + var23 + "_" + var24);
                            var14++;
                        }
                    }
                }
            }
        }
        method3091(25);
        field511 = true;
        Statics.field1840 = var4;
        method3525(var4);
    }

    @ObfuscatedName("ke.lv(Lde;ZLug;I)V")
    public static final void method4578(class102 arg0, boolean arg1, class546 arg2) {
        field640 = 0;
        field565 = 0;
        arg2.method8677();
        int var3 = arg2.method8678(8);
        if (var3 < arg0.field1330) {
            for (int var4 = var3; var4 < arg0.field1330; var4++) {
                field645[++field640 - 1] = arg0.field1331[var4];
            }
        }
        if (var3 > arg0.field1330) {
            throw new RuntimeException("");
        }
        arg0.field1330 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.field1331[var5];
            class104 var7 = arg0.field1316[var6];
            int var8 = arg2.method8678(1);
            if (var8 == 0) {
                arg0.field1331[++arg0.field1330 - 1] = var6;
                var7.field1241 = field516;
            } else {
                int var9 = arg2.method8678(2);
                if (var9 == 0) {
                    arg0.field1331[++arg0.field1330 - 1] = var6;
                    var7.field1241 = field516;
                    field566[++field565 - 1] = var6;
                } else if (var9 == 1) {
                    arg0.field1331[++arg0.field1330 - 1] = var6;
                    var7.field1241 = field516;
                    int var10 = arg2.method8678(3);
                    var7.method2573(var10, class239.field2520);
                    int var11 = arg2.method8678(1);
                    if (var11 == 1) {
                        field566[++field565 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    arg0.field1331[++arg0.field1330 - 1] = var6;
                    var7.field1241 = field516;
                    if (arg2.method8678(1) == 1) {
                        int var12 = arg2.method8678(3);
                        var7.method2573(var12, class239.field2510);
                        int var13 = arg2.method8678(3);
                        var7.method2573(var13, class239.field2510);
                    } else {
                        int var14 = arg2.method8678(3);
                        var7.method2573(var14, class239.field2521);
                    }
                    int var15 = arg2.method8678(1);
                    if (var15 == 1) {
                        field566[++field565 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field645[++field640 - 1] = var6;
                }
            }
        }
        method426(arg0, arg1, arg2);
        for (int var16 = 0; var16 < field565; var16++) {
            int var17 = field566[var16];
            class104 var18 = arg0.field1316[var17];
            int var19 = arg2.method8804();
            if ((var19 & 0x80) != 0) {
                int var20 = arg2.method8804();
                var19 += var20 << 8;
            }
            if ((var19 & 0x200) != 0) {
                int var21 = arg2.method8804();
                var19 += var21 << 16;
            }
            if ((var19 & 0x10000) != 0) {
                int var22 = arg2.method8784();
                var18.field1198 = (var22 & 0x1) == 0 ? var18.field1348.field1985 : arg2.method8899();
                var18.field1208 = (var22 & 0x2) == 0 ? var18.field1348.field1996 : arg2.method8883();
                var18.field1200 = (var22 & 0x4) == 0 ? var18.field1348.field1997 : arg2.method8770();
                var18.field1201 = (var22 & 0x8) == 0 ? var18.field1348.field1992 : arg2.method8771();
                var18.field1202 = (var22 & 0x10) == 0 ? var18.field1348.field1999 : arg2.method8770();
                var18.field1223 = (var22 & 0x20) == 0 ? var18.field1348.field2000 : arg2.method8771();
                var18.field1204 = (var22 & 0x40) == 0 ? var18.field1348.field2001 : arg2.method8770();
                var18.field1263 = (var22 & 0x80) == 0 ? var18.field1348.field2007 : arg2.method8771();
                var18.field1220 = (var22 & 0x100) == 0 ? var18.field1348.field2003 : arg2.method8770();
                var18.field1203 = (var22 & 0x200) == 0 ? var18.field1348.field2030 : arg2.method8883();
                var18.field1206 = (var22 & 0x400) == 0 ? var18.field1348.field2005 : arg2.method8883();
                var18.field1209 = (var22 & 0x800) == 0 ? var18.field1348.field2006 : arg2.method8899();
                var18.field1250 = (var22 & 0x1000) == 0 ? var18.field1348.field2012 : arg2.method8771();
                var18.field1211 = (var22 & 0x2000) == 0 ? var18.field1348.field2008 : arg2.method8899();
                var18.field1197 = (var22 & 0x4000) == 0 ? var18.field1348.field1994 : arg2.method8883();
            }
            if ((var19 & 0x1) != 0) {
                int var23 = arg2.method8804();
                if (var23 > 0) {
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = -1;
                        int var26 = -1;
                        int var27 = -1;
                        int var28 = arg2.method8744();
                        if (var28 == 32767) {
                            var28 = arg2.method8744();
                            var26 = arg2.method8744();
                            var25 = arg2.method8744();
                            var27 = arg2.method8744();
                        } else if (var28 == 32766) {
                            var28 = -1;
                        } else {
                            var26 = arg2.method8744();
                        }
                        int var29 = arg2.method8744();
                        var18.method2377(var28, var26, var25, var27, field516, var29);
                    }
                }
                int var30 = arg2.method8762();
                if (var30 > 0) {
                    for (int var31 = 0; var31 < var30; var31++) {
                        int var32 = arg2.method8744();
                        int var33 = arg2.method8744();
                        if (var33 == 32767) {
                            var18.method2374(var32);
                        } else {
                            int var34 = arg2.method8744();
                            int var35 = arg2.method8762();
                            int var36 = var33 > 0 ? arg2.method8761() : var35;
                            var18.method2365(var32, field516, var33, var34, var35, var36);
                        }
                    }
                }
            }
            if ((var19 & 0x40000) != 0) {
                int var37 = arg2.method8804();
                for (int var38 = 0; var38 < var37; var38++) {
                    int var39 = arg2.method8804();
                    int var40 = arg2.method8770();
                    int var41 = arg2.method8784();
                    var18.method2366(var39, var40, var41 >> 16, var41 & 0xFFFF);
                }
            }
            if ((var19 & 0x8) != 0) {
                int var42 = arg2.method8771();
                if (var42 == 65535) {
                    var42 = -1;
                }
                int var43 = arg2.method8763();
                if (var18.field1236 == var42 && var42 != -1) {
                    int var44 = class210.method5910(var42).field2306;
                    if (var44 == 1) {
                        var18.field1237 = 0;
                        var18.field1238 = 0;
                        var18.field1239 = var43;
                        var18.field1215 = 0;
                    }
                    if (var44 == 2) {
                        var18.field1215 = 0;
                    }
                } else if (var42 == -1 || var18.field1236 == -1 || class210.method5910(var42).field2299 >= class210.method5910(var18.field1236).field2299) {
                    var18.field1236 = var42;
                    var18.field1237 = 0;
                    var18.field1238 = 0;
                    var18.field1239 = var43;
                    var18.field1215 = 0;
                    var18.field1266 = var18.field1230;
                }
            }
            if ((var19 & 0x2000) != 0) {
                var18.field1267 = arg2.method8734();
            }
            if ((var19 & 0x800) != 0) {
                var18.field1252 = field516 + arg2.method8899();
                var18.field1216 = field516 + arg2.method8883();
                var18.field1224 = arg2.method8766();
                var18.field1255 = arg2.method8920();
                var18.field1256 = arg2.method8920();
                var18.field1240 = (byte) arg2.method8763();
            }
            if ((var19 & 0x10) != 0) {
                var18.field1348 = class193.method2064(arg2.method8770());
                method8072(var18);
                var18.method2587();
            }
            if ((var19 & 0x1000) != 0) {
                var18.method2570(arg2.method8763());
            }
            if ((var19 & 0x20) != 0) {
                var18.field1191 = arg2.method8899();
                var18.field1191 += arg2.method8804() << 16;
                int var45 = 16777215;
                if (var18.field1191 == var45) {
                    var18.field1191 = -1;
                }
            }
            if ((var19 & 0x8000) != 0) {
                int var46 = arg2.method8763();
                if ((var46 & 0x1) == 1) {
                    var18.method2593();
                } else {
                    int[] var47 = null;
                    if ((var46 & 0x2) == 2) {
                        int var48 = arg2.method8804();
                        var47 = new int[var48];
                        for (int var49 = 0; var49 < var48; var49++) {
                            int var50 = arg2.method8883();
                            int var51 = var50 == 65535 ? -1 : var50;
                            var47[var49] = var51;
                        }
                    }
                    short[] var52 = null;
                    if ((var46 & 0x4) == 4) {
                        int var53 = 0;
                        if (var18.field1348.field2034 != null) {
                            var53 = var18.field1348.field2034.length;
                        }
                        var52 = new short[var53];
                        for (int var54 = 0; var54 < var53; var54++) {
                            var52[var54] = (short) arg2.method8883();
                        }
                    }
                    short[] var55 = null;
                    if ((var46 & 0x8) == 8) {
                        int var56 = 0;
                        if (var18.field1348.field1998 != null) {
                            var56 = var18.field1348.field1998.length;
                        }
                        var55 = new short[var56];
                        for (int var57 = 0; var57 < var56; var57++) {
                            var55[var57] = (short) arg2.method8770();
                        }
                    }
                    boolean var58 = false;
                    if ((var46 & 0x10) != 0) {
                        var58 = arg2.method8804() == 1;
                    }
                    long var59 = (long) (++class104.field1350 - 1);
                    var18.method2583(new class192(var59, var47, var52, var55, var58));
                }
            }
            if ((var19 & 0x4000) != 0) {
                int var61 = arg2.method8762();
                if ((var61 & 0x1) == 1) {
                    var18.method2584();
                } else {
                    int[] var62 = null;
                    if ((var61 & 0x2) == 2) {
                        int var63 = arg2.method8761();
                        var62 = new int[var63];
                        for (int var64 = 0; var64 < var63; var64++) {
                            int var65 = arg2.method8899();
                            int var66 = var65 == 65535 ? -1 : var65;
                            var62[var64] = var66;
                        }
                    }
                    short[] var67 = null;
                    if ((var61 & 0x4) == 4) {
                        int var68 = 0;
                        if (var18.field1348.field2034 != null) {
                            var68 = var18.field1348.field2034.length;
                        }
                        var67 = new short[var68];
                        for (int var69 = 0; var69 < var68; var69++) {
                            var67[var69] = (short) arg2.method8770();
                        }
                    }
                    short[] var70 = null;
                    if ((var61 & 0x8) == 8) {
                        int var71 = 0;
                        if (var18.field1348.field1998 != null) {
                            var71 = var18.field1348.field1998.length;
                        }
                        var70 = new short[var71];
                        for (int var72 = 0; var72 < var71; var72++) {
                            var70[var72] = (short) arg2.method8899();
                        }
                    }
                    boolean var73 = false;
                    if ((var61 & 0x10) != 0) {
                        var73 = arg2.method8761() == 1;
                    }
                    long var74 = (long) (++class104.field1352 - 1);
                    var18.method2581(new class192(var74, var62, var67, var70, var73));
                }
            }
            if ((var19 & 0x4) != 0) {
                var18.field1212 = arg2.method8739();
                var18.field1207 = 100;
            }
            if ((var19 & 0x400) != 0) {
                var18.field1243 = arg2.method8765();
                var18.field1245 = arg2.method8920();
                var18.field1244 = arg2.method8765();
                var18.field1246 = arg2.method8765();
                var18.field1254 = arg2.method8899() + field516;
                var18.field1261 = arg2.method8899() + field516;
                var18.field1249 = arg2.method8770();
                var18.field1230 = 1;
                var18.field1266 = 0;
                var18.field1243 += var18.field1205[0];
                var18.field1245 += var18.field1247[0];
                var18.field1244 += var18.field1205[0];
                var18.field1246 += var18.field1247[0];
            }
            if ((var19 & 0x100) != 0) {
                var18.method2569(arg2.method8739());
            }
            if ((var19 & 0x2) != 0) {
                arg2.method8771();
                arg2.method8757();
            }
            if ((var19 & 0x20000) != 0) {
                int var76 = arg2.method8761();
                int[] var77 = new int[8];
                short[] var78 = new short[8];
                for (int var79 = 0; var79 < 8; var79++) {
                    if ((var76 & 0x1 << var79) == 0) {
                        var77[var79] = -1;
                        var78[var79] = -1;
                    } else {
                        var77[var79] = arg2.method8773();
                        var78[var79] = (short) arg2.method8745();
                    }
                }
                var18.method2579(var77, var78);
            }
            if ((var19 & 0x40) != 0) {
                int var80 = arg2.method8883();
                int var81 = arg2.method8899();
                var18.field1231 = arg2.method8761() == 1;
                var18.field1253 = var80;
                var18.field1226 = var81;
            }
        }
        for (int var82 = 0; var82 < field640; var82++) {
            int var83 = field645[var82];
            if (field516 != arg0.field1316[var83].field1241) {
                arg0.field1316[var83].field1348 = null;
                arg0.field1316[var83] = null;
            }
        }
        if (field653.field1459 != arg2.field5363) {
            throw new RuntimeException(arg2.field5363 + class105.field1363 + field653.field1459);
        }
        for (int var84 = 0; var84 < arg0.field1330; var84++) {
            if (arg0.field1316[arg0.field1331[var84]] == null) {
                throw new RuntimeException(var84 + class105.field1363 + arg0.field1330);
            }
        }
    }

    @ObfuscatedName("bj.lj(Lde;ZLug;I)V")
    public static final void method426(class102 arg0, boolean arg1, class546 arg2) {
        while (true) {
            byte var3 = 16;
            int var4 = 0x1 << var3;
            if (arg2.method8673(field653.field1459) >= var3 + 12) {
                int var5 = arg2.method8678(var3);
                if (var4 - 1 != var5) {
                    boolean var6 = false;
                    if (arg0.field1316[var5] == null) {
                        arg0.field1316[var5] = new class104();
                        var6 = true;
                    }
                    class104 var7 = arg0.field1316[var5];
                    arg0.field1331[++arg0.field1330 - 1] = var5;
                    var7.field1241 = field516;
                    boolean var8 = arg2.method8678(1) == 1;
                    if (var8) {
                        arg2.method8678(32);
                    }
                    int var9;
                    if (arg1) {
                        var9 = arg2.method8678(8);
                        if (var9 > 127) {
                            var9 -= 256;
                        }
                    } else {
                        var9 = arg2.method8678(5);
                        if (var9 > 15) {
                            var9 -= 32;
                        }
                    }
                    int var10;
                    if (arg1) {
                        var10 = arg2.method8678(8);
                        if (var10 > 127) {
                            var10 -= 256;
                        }
                    } else {
                        var10 = arg2.method8678(5);
                        if (var10 > 15) {
                            var10 -= 32;
                        }
                    }
                    int var11 = arg2.method8678(1);
                    if (var11 == 1) {
                        field566[++field565 - 1] = var5;
                    }
                    int var12 = field704[arg2.method8678(3)];
                    if (var6) {
                        var7.field1258 = var7.field1193 = var12;
                    }
                    int var13 = arg2.method8678(1);
                    var7.field1348 = class193.method2064(arg2.method8678(14));
                    method8072(var7);
                    if (var7.field1260 == 0) {
                        var7.field1193 = 0;
                    }
                    if (field509 >= 222) {
                        var7.method2574(Statics.field315 + var9, Statics.field87 + var10, var13 == 1);
                        continue;
                    }
                    var7.method2574(Statics.field297.field1205[0] + var9, Statics.field297.field1247[0] + var10, var13 == 1);
                    continue;
                }
            }
            arg2.method8679();
            return;
        }
    }

    @ObfuscatedName("sm.lm(Ldx;I)V")
    public static void method8072(class104 arg0) {
        arg0.field1195 = arg0.field1348.field1991;
        arg0.field1260 = arg0.field1348.field2021;
        arg0.field1200 = arg0.field1348.field1997;
        arg0.field1201 = arg0.field1348.field1992;
        arg0.field1202 = arg0.field1348.field1999;
        arg0.field1223 = arg0.field1348.field2000;
        arg0.field1197 = arg0.field1348.field1994;
        arg0.field1198 = arg0.field1348.field1985;
        arg0.field1208 = arg0.field1348.field1996;
        arg0.field1204 = arg0.field1348.field2001;
        arg0.field1263 = arg0.field1348.field2007;
        arg0.field1220 = arg0.field1348.field2003;
        arg0.field1203 = arg0.field1348.field2030;
        arg0.field1206 = arg0.field1348.field2005;
        arg0.field1209 = arg0.field1348.field2006;
        arg0.field1250 = arg0.field1348.field2012;
        arg0.field1211 = arg0.field1348.field2008;
    }

    @ObfuscatedName("ri.lt(III)Ljv;")
    public static class237 method7658(int arg0, int arg1) {
        field646.field2497 = arg0;
        field646.field2494 = arg1;
        field646.field2495 = 1;
        field646.field2493 = 1;
        return field646;
    }

    @ObfuscatedName("bn.ld(B)V")
    public static void method839() {
        field577 = 0;
        field647 = false;
        field654[0] = -1;
        field655[0] = class379.field4223;
        field656[0] = "";
        field758[0] = 1006;
        field529[0] = false;
        field577 = 1;
    }

    @ObfuscatedName("jk.lo(III)V")
    public static final void method4564(int arg0, int arg1) {
        if (field577 < 2 && field589 == 0 && !field667 || !field596) {
            return;
        }
        int var2 = field577 - 1;
        String var4;
        if (field589 == 1 && field577 < 2) {
            var4 = class379.field4119 + class379.field4337 + field643 + " " + class105.field1359;
        } else if (field667 && field577 < 2) {
            var4 = field670 + class379.field4337 + field671 + " " + class105.field1359;
        } else {
            var4 = method4220(var2);
        }
        if (field577 > 2) {
            var4 = var4 + class105.method3400(16777215) + " " + '/' + " " + (field577 - 2) + class379.field4298;
        }
        Statics.field2119.method7445(var4, arg0 + 4, arg1 + 15, 16777215, 0, field516 / 1000);
    }

    @ObfuscatedName("eq.lz(I)V")
    public static final void method2841() {
        int var0 = Statics.field1378;
        int var1 = Statics.field1509;
        int var2 = Statics.field3595;
        int var3 = Statics.field2893;
        int var4 = 6116423;
        class557.method9060(var0, var1, var2, var3, var4);
        class557.method9060(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class557.method9064(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2119.method7528(class379.field4286, var0 + 3, var1 + 14, var4, -1);
        int var5 = class36.field224;
        int var6 = class36.field214;
        for (int var7 = 0; var7 < field577; var7++) {
            int var8 = (field577 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field2119.method7528(method4220(var7), var0 + 3, var8, var9, 0);
        }
        method2555(Statics.field1378, Statics.field1509, Statics.field3595, Statics.field2893);
    }

    @ObfuscatedName("ei.lb(B)Z")
    public static final boolean method2647() {
        return field647;
    }

    @ObfuscatedName("fb.la(IIIII)V")
    public static final void method3027(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field641; var4++) {
            if (field727[var4] + field725[var4] > arg0 && field725[var4] < arg0 + arg2 && field726[var4] + field573[var4] > arg1 && field726[var4] < arg1 + arg3) {
                field722[var4] = true;
            }
        }
    }

    @ObfuscatedName("de.lh(IIIII)V")
    public static final void method2555(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field641; var4++) {
            if (field727[var4] + field725[var4] > arg0 && field725[var4] < arg0 + arg2 && field726[var4] + field573[var4] > arg1 && field726[var4] < arg1 + arg3) {
                field723[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.lu(I)V")
    public final void method1201() {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field577 - 1; var2++) {
                if (field758[var2] < 1000 && field758[var2 + 1] > 1000) {
                    String var3 = field656[var2];
                    field656[var2] = field656[var2 + 1];
                    field656[var2 + 1] = var3;
                    String var4 = field655[var2];
                    field655[var2] = field655[var2 + 1];
                    field655[var2 + 1] = var4;
                    int var5 = field758[var2];
                    field758[var2] = field758[var2 + 1];
                    field758[var2 + 1] = var5;
                    int var6 = field649[var2];
                    field649[var2] = field649[var2 + 1];
                    field649[var2 + 1] = var6;
                    int var7 = field807[var2];
                    field807[var2] = field807[var2 + 1];
                    field807[var2 + 1] = var7;
                    int var8 = field652[var2];
                    field652[var2] = field652[var2 + 1];
                    field652[var2 + 1] = var8;
                    int var9 = field764[var2];
                    field764[var2] = field764[var2 + 1];
                    field764[var2 + 1] = var9;
                    int var10 = field654[var2];
                    field654[var2] = field654[var2 + 1];
                    field654[var2 + 1] = var10;
                    boolean var11 = field529[var2];
                    field529[var2] = field529[var2 + 1];
                    field529[var2 + 1] = var11;
                    var1 = false;
                }
            }
        }
        if (field736 != null) {
            return;
        }
        int var12 = class36.field220;
        if (!field647) {
            int var31 = field577 - 1;
            if ((var12 == 1 || !Statics.field828 && var12 == 4) && this.method1291()) {
                var12 = 2;
            }
            if ((var12 == 1 || !Statics.field828 && var12 == 4) && field577 > 0 && var31 >= 0) {
                int var33 = field649[var31];
                int var34 = field807[var31];
                int var35 = field758[var31];
                int var36 = field652[var31];
                int var37 = field654[var31];
                int var38 = field764[var31];
                String var39 = field655[var31];
                String var40 = field656[var31];
                method2063(var33, var34, var35, var36, var38, var37, var39, var40, class36.field223, class36.field215);
            }
            if (var12 == 2 && field577 > 0) {
                this.method1203(class36.field223, class36.field215);
            }
            return;
        }
        if (var12 != 1 && (Statics.field828 || var12 != 4)) {
            int var13 = class36.field224;
            int var14 = class36.field214;
            if (var13 < Statics.field1378 - 10 || var13 > Statics.field3595 + Statics.field1378 + 10 || var14 < Statics.field1509 - 10 || var14 > Statics.field2893 + Statics.field1509 + 10) {
                field647 = false;
                method3027(Statics.field1378, Statics.field1509, Statics.field3595, Statics.field2893);
            }
        }
        if (var12 != 1 && Statics.field828 || var12 != 4) {
            return;
        }
        int var15 = Statics.field1378;
        int var16 = Statics.field1509;
        int var17 = Statics.field3595;
        int var18 = class36.field223;
        int var19 = class36.field215;
        int var20 = -1;
        for (int var21 = 0; var21 < field577; var21++) {
            int var22 = (field577 - 1 - var21) * 15 + var16 + 31;
            if (var18 > var15 && var18 < var15 + var17 && var19 > var22 - 13 && var19 < var22 + 3) {
                var20 = var21;
            }
        }
        if (var20 != -1 && var20 >= 0) {
            int var23 = field649[var20];
            int var24 = field807[var20];
            int var25 = field758[var20];
            int var26 = field652[var20];
            int var27 = field654[var20];
            int var28 = field764[var20];
            String var29 = field655[var20];
            String var30 = field656[var20];
            method2063(var23, var24, var25, var26, var28, var27, var29, var30, class36.field223, class36.field215);
        }
        field647 = false;
        method3027(Statics.field1378, Statics.field1509, Statics.field3595, Statics.field2893);
    }

    @ObfuscatedName("client.lp(I)Z")
    public final boolean method1291() {
        int var1 = field577 - 1;
        return (field781 && field577 > 2 || method5606(var1)) && !field529[var1];
    }

    @ObfuscatedName("client.ll(IIB)V")
    public final void method1203(int arg0, int arg1) {
        method5515(arg0, arg1);
        int var3 = arg0 - field785;
        int var4 = arg1 - field786;
        Statics.field5138.field1317.method4981(Statics.field5138.field1319, var3, var4, false);
        for (int var5 = 0; var5 < Statics.field5138.field1323; var5++) {
            class477 var6 = Statics.field5138.field1332[Statics.field5138.field1334[var5]];
            if (var6 != null) {
                var6.field4972.field1317.method4981(var6.field4972.field1319, var3, var4, false);
            }
        }
        field647 = true;
    }

    @ObfuscatedName("mi.ls(III)V")
    public static void method5515(int arg0, int arg1) {
        int var2 = Statics.field2119.method7427(class379.field4286);
        for (int var3 = 0; var3 < field577; var3++) {
            int var4 = Statics.field2119.method7427(method4220(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field577 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field890) {
            var6 = Statics.field890 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field5) {
            var7 = Statics.field5 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        Statics.field1378 = var6;
        Statics.field1509 = var7;
        Statics.field3595 = var2;
        Statics.field2893 = field577 * 15 + 22;
    }

    @ObfuscatedName("mk.le(II)Z")
    public static final boolean method5606(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field758[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("jj.ly(Lcj;III)V")
    public static final void method4204(class76 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method2063(arg0.field901, arg0.field900, arg0.field903, arg0.field902, arg0.field905, arg0.field904, arg0.field899, arg0.field906, arg1, arg2);
        }
    }

    @ObfuscatedName("cj.lg(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2063(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, String arg7, int arg8, int arg9) {
        class102 var10 = null;
        if (arg5 >= 0 && Statics.field5138.field1332[arg5] != null) {
            var10 = Statics.field5138.field1332[arg5].field4972;
        } else if (arg5 == -1) {
            var10 = Statics.field5138;
        }
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1322;
        int var12 = var10.field1324;
        class104[] var13 = var10.field1316;
        class94[] var14 = var10.field1327;
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1002) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            class322 var15 = class322.method3236(class320.field3327, field653.field1456);
            var15.field3394.method8938(arg3);
            field653.method2773(var15);
        }
        if (arg2 == 7) {
            class104 var16 = var13[arg3];
            if (var16 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var17 = class322.method3236(class320.field3296, field653.field1456);
                var17.field3394.method8714(Statics.field95);
                var17.field3394.method8768(arg3);
                var17.field3394.method8711(field729.method4036(82) ? 1 : 0);
                var17.field3394.method8712(Statics.field3561);
                var17.field3394.method8938(Statics.field144);
                field653.method2773(var17);
            }
        }
        if (arg2 == 17) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var18 = class322.method3236(class320.field3289, field653.field1456);
            var18.field3394.method8938(arg3);
            var18.field3394.method8712(arg1 + var12);
            var18.field3394.method8938(field802);
            var18.field3394.method8711(field729.method4036(82) ? 1 : 0);
            var18.field3394.method8714(Statics.field458);
            var18.field3394.method8768(field588);
            var18.field3394.method8712(arg0 + var11);
            field653.method2773(var18);
        }
        if (arg2 == 50) {
            class94 var19 = var14[arg3];
            if (var19 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var20 = class322.method3236(class320.field3329, field653.field1456);
                var20.field3394.method8768(arg3);
                var20.field3394.method8758(field729.method4036(82) ? 1 : 0);
                field653.method2773(var20);
            }
        }
        if (arg2 == 23) {
            if (field647) {
                Statics.field5138.field1317.method4982();
            } else {
                Statics.field5138.field1317.method4981(Statics.field5138.field1319, arg0, arg1, true);
            }
            for (int var21 = 0; var21 < Statics.field5138.field1323; var21++) {
                class477 var22 = Statics.field5138.field1332[Statics.field5138.field1334[var21]];
                if (var22 != null) {
                    if (field647) {
                        var22.field4972.field1317.method4982();
                    } else {
                        var22.field4972.field1317.method4981(var22.field4972.field1319, arg0, arg1, true);
                    }
                }
            }
        }
        if (arg2 == 5) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var23 = class322.method3236(class320.field3298, field653.field1456);
            var23.field3394.method8758(field729.method4036(82) ? 1 : 0);
            var23.field3394.method8912(arg1 + var12);
            var23.field3394.method8938(arg3);
            var23.field3394.method8938(arg0 + var11);
            field653.method2773(var23);
        }
        if (arg2 == 9) {
            class104 var24 = var13[arg3];
            if (var24 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var25 = class322.method3236(class320.field3311, field653.field1456);
                var25.field3394.method8768(arg3);
                var25.field3394.method8711(field729.method4036(82) ? 1 : 0);
                field653.method2773(var25);
            }
        }
        if (arg2 == 6) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var26 = class322.method3236(class320.field3370, field653.field1456);
            var26.field3394.method8938(arg1 + var12);
            var26.field3394.method8768(arg0 + var11);
            var26.field3394.method8768(arg3);
            var26.field3394.method8758(field729.method4036(82) ? 1 : 0);
            field653.method2773(var26);
        }
        if (arg2 == 44) {
            class94 var27 = var14[arg3];
            if (var27 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var28 = class322.method3236(class320.field3346, field653.field1456);
                var28.field3394.method8927(field729.method4036(82) ? 1 : 0);
                var28.field3394.method8938(arg3);
                field653.method2773(var28);
            }
        }
        if (arg2 == 22) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var29 = class322.method3236(class320.field3293, field653.field1456);
            var29.field3394.method8758(field729.method4036(82) ? 1 : 0);
            var29.field3394.method8938(arg3);
            var29.field3394.method8712(arg1 + var12);
            var29.field3394.method8912(arg0 + var11);
            field653.method2773(var29);
        }
        if (arg2 == 48) {
            class94 var30 = var14[arg3];
            if (var30 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var31 = class322.method3236(class320.field3290, field653.field1456);
                var31.field3394.method8759(field729.method4036(82) ? 1 : 0);
                var31.field3394.method8938(arg3);
                field653.method2773(var31);
            }
        }
        if (arg2 == 15) {
            class94 var32 = var14[arg3];
            if (var32 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var33 = class322.method3236(class320.field3323, field653.field1456);
                var33.field3394.method8712(field588);
                var33.field3394.method8938(field802);
                var33.field3394.method8712(arg3);
                var33.field3394.method8782(Statics.field458);
                var33.field3394.method8758(field729.method4036(82) ? 1 : 0);
                field653.method2773(var33);
            }
        }
        if (arg2 == 4) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var34 = class322.method3236(class320.field3351, field653.field1456);
            var34.field3394.method8711(field729.method4036(82) ? 1 : 0);
            var34.field3394.method8768(arg3);
            var34.field3394.method8938(arg0 + var11);
            var34.field3394.method8712(arg1 + var12);
            field653.method2773(var34);
        }
        if (arg2 == 1) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var35 = class322.method3236(class320.field3364, field653.field1456);
            var35.field3394.method8712(arg0 + var11);
            var35.field3394.method8912(Statics.field144);
            var35.field3394.method8714(Statics.field95);
            var35.field3394.method8758(field729.method4036(82) ? 1 : 0);
            var35.field3394.method8912(arg1 + var12);
            var35.field3394.method8912(arg3);
            var35.field3394.method8938(Statics.field3561);
            field653.method2773(var35);
        }
        if (arg2 == 51) {
            class94 var36 = var14[arg3];
            if (var36 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var37 = class322.method3236(class320.field3302, field653.field1456);
                var37.field3394.method8912(arg3);
                var37.field3394.method8759(field729.method4036(82) ? 1 : 0);
                field653.method2773(var37);
            }
        }
        if (arg2 == 1004) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            class322 var38 = class322.method3236(class320.field3348, field653.field1456);
            var38.field3394.method8768(arg0 + var11);
            var38.field3394.method8712(arg3);
            var38.field3394.method8712(arg1 + var12);
            field653.method2773(var38);
        }
        if (arg2 == 47) {
            class94 var39 = var14[arg3];
            if (var39 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var40 = class322.method3236(class320.field3373, field653.field1456);
                var40.field3394.method8927(field729.method4036(82) ? 1 : 0);
                var40.field3394.method8712(arg3);
                field653.method2773(var40);
            }
        }
        if (arg2 == 14) {
            class94 var41 = var14[arg3];
            if (var41 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var42 = class322.method3236(class320.field3319, field653.field1456);
                var42.field3394.method8712(Statics.field144);
                var42.field3394.method8712(Statics.field3561);
                var42.field3394.method8714(Statics.field95);
                var42.field3394.method8938(arg3);
                var42.field3394.method8759(field729.method4036(82) ? 1 : 0);
                field653.method2773(var42);
            }
        }
        if (arg2 == 29) {
            class322 var43 = class322.method3236(class320.field3352, field653.field1456);
            var43.field3394.method8714(arg1);
            field653.method2773(var43);
            class359 var44 = Statics.field4650.method5895(arg1);
            if (var44 != null && var44.field3957 != null && var44.field3957[0][0] == 5) {
                int var45 = var44.field3957[0][1];
                if (class347.field3731[var45] != var44.field3962[0]) {
                    class347.field3731[var45] = var44.field3962[0];
                    method2148(var45);
                }
            }
        }
        if (arg2 == 20) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var46 = class322.method3236(class320.field3316, field653.field1456);
            var46.field3394.method8768(arg1 + var12);
            var46.field3394.method8758(field729.method4036(82) ? 1 : 0);
            var46.field3394.method8768(arg0 + var11);
            var46.field3394.method8768(arg3);
            field653.method2773(var46);
        }
        if (arg2 == 49) {
            class94 var47 = var14[arg3];
            if (var47 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var48 = class322.method3236(class320.field3320, field653.field1456);
                var48.field3394.method8768(arg3);
                var48.field3394.method8758(field729.method4036(82) ? 1 : 0);
                field653.method2773(var48);
            }
        }
        if (arg2 == 13) {
            class104 var49 = var13[arg3];
            if (var49 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var50 = class322.method3236(class320.field3371, field653.field1456);
                var50.field3394.method8768(arg3);
                var50.field3394.method8758(field729.method4036(82) ? 1 : 0);
                field653.method2773(var50);
            }
        }
        if (arg2 == 19) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var51 = class322.method3236(class320.field3306, field653.field1456);
            var51.field3394.method8938(arg3);
            var51.field3394.method8759(field729.method4036(82) ? 1 : 0);
            var51.field3394.method8938(arg0 + var11);
            var51.field3394.method8912(arg1 + var12);
            field653.method2773(var51);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class359 var52 = Statics.field4650.method5889(arg1, arg0);
            if (var52 != null) {
                method7586(arg3, arg1, arg0, arg4, arg7);
            }
        }
        if (arg2 == 58) {
            class359 var53 = Statics.field4650.method5889(arg1, arg0);
            if (var53 != null) {
                if (var53.field3940 != null) {
                    class90 var54 = new class90();
                    var54.field1086 = var53;
                    var54.field1082 = arg3;
                    var54.field1090 = arg7;
                    var54.field1088 = var53.field3940;
                    class73.method2137(var54);
                }
                class322 var55 = class322.method3236(class320.field3294, field653.field1456);
                var55.field3394.method8709(Statics.field458);
                var55.field3394.method8782(arg1);
                var55.field3394.method8938(field588);
                var55.field3394.method8912(field802);
                var55.field3394.method8768(arg0);
                var55.field3394.method8938(arg4);
                field653.method2773(var55);
            }
        }
        if (arg2 == 18) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var56 = class322.method3236(class320.field3347, field653.field1456);
            var56.field3394.method8912(arg3);
            var56.field3394.method8938(arg1 + var12);
            var56.field3394.method8758(field729.method4036(82) ? 1 : 0);
            var56.field3394.method8912(arg0 + var11);
            field653.method2773(var56);
        }
        if (arg2 == 3) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var57 = class322.method3236(class320.field3317, field653.field1456);
            var57.field3394.method8712(arg3);
            var57.field3394.method8912(arg0 + var11);
            var57.field3394.method8938(arg1 + var12);
            var57.field3394.method8711(field729.method4036(82) ? 1 : 0);
            field653.method2773(var57);
        }
        if (arg2 == 1001) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var58 = class322.method3236(class320.field3336, field653.field1456);
            var58.field3394.method8938(arg1 + var12);
            var58.field3394.method8768(arg3);
            var58.field3394.method8768(arg0 + var11);
            var58.field3394.method8759(field729.method4036(82) ? 1 : 0);
            field653.method2773(var58);
        }
        if (arg2 == 24) {
            class359 var59 = Statics.field4650.method5895(arg1);
            if (var59 != null) {
                boolean var60 = true;
                if (var59.field3836 > 0) {
                    var60 = method3113(var59);
                }
                if (var60) {
                    class322 var61 = class322.method3236(class320.field3352, field653.field1456);
                    var61.field3394.method8714(arg1);
                    field653.method2773(var61);
                }
            }
        }
        if (arg2 == 1003) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            class104 var62 = var13[arg3];
            if (var62 != null) {
                class193 var63 = var62.field1348;
                if (var63.field2014 != null) {
                    var63 = var63.method3408();
                }
                if (var63 != null) {
                    class322 var64 = class322.method3236(class320.field3284, field653.field1456);
                    var64.field3394.method8938(var63.field1989);
                    field653.method2773(var64);
                }
            }
        }
        if (arg2 == 12) {
            class104 var65 = var13[arg3];
            if (var65 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var66 = class322.method3236(class320.field3363, field653.field1456);
                var66.field3394.method8758(field729.method4036(82) ? 1 : 0);
                var66.field3394.method8912(arg3);
                field653.method2773(var66);
            }
        }
        if (arg2 == 16) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var67 = class322.method3236(class320.field3307, field653.field1456);
            var67.field3394.method8768(Statics.field144);
            var67.field3394.method8938(arg0 + var11);
            var67.field3394.method8768(arg1 + var12);
            var67.field3394.method8758(field729.method4036(82) ? 1 : 0);
            var67.field3394.method8714(Statics.field95);
            var67.field3394.method8768(arg3);
            var67.field3394.method8912(Statics.field3561);
            field653.method2773(var67);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field3175.method8367(arg2, arg3, new class348(arg0), new class348(arg1));
        }
        if (arg2 == 26) {
            method2669();
        }
        if (arg2 == 2) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var68 = class322.method3236(class320.field3325, field653.field1456);
            var68.field3394.method8912(field802);
            var68.field3394.method8938(field588);
            var68.field3394.method8712(arg1 + var12);
            var68.field3394.method8759(field729.method4036(82) ? 1 : 0);
            var68.field3394.method8768(arg0 + var11);
            var68.field3394.method8780(Statics.field458);
            var68.field3394.method8912(arg3);
            field653.method2773(var68);
        }
        if (arg2 == 25) {
            class359 var69 = Statics.field4650.method5889(arg1, arg0);
            if (var69 != null) {
                method318();
                method5228(arg1, arg0, Statics.method5458(method3224(var69)), arg4);
                field589 = 0;
                field670 = method3042(var69);
                if (field670 == null) {
                    field670 = class379.field4390;
                }
                if (var69.field3915) {
                    field671 = var69.field3959 + class105.method3400(16777215);
                } else {
                    field671 = class105.method3400(65280) + var69.field3961 + class105.method3400(16777215);
                }
            }
            return;
        }
        if (arg2 == 45) {
            class94 var70 = var14[arg3];
            if (var70 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var71 = class322.method3236(class320.field3324, field653.field1456);
                var71.field3394.method8938(arg3);
                var71.field3394.method8759(field729.method4036(82) ? 1 : 0);
                field653.method2773(var71);
            }
        }
        if (arg2 == 21) {
            field526 = arg8;
            field622 = arg9;
            field675 = 2;
            field623 = 0;
            field753 = arg0;
            field754 = arg1;
            class322 var72 = class322.method3236(class320.field3326, field653.field1456);
            var72.field3394.method8927(field729.method4036(82) ? 1 : 0);
            var72.field3394.method8938(arg0 + var11);
            var72.field3394.method8938(arg1 + var12);
            var72.field3394.method8768(arg3);
            field653.method2773(var72);
        }
        if (arg2 == 8) {
            class104 var73 = var13[arg3];
            if (var73 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var74 = class322.method3236(class320.field3334, field653.field1456);
                var74.field3394.method8714(Statics.field458);
                var74.field3394.method8758(field729.method4036(82) ? 1 : 0);
                var74.field3394.method8912(field802);
                var74.field3394.method8912(field588);
                var74.field3394.method8768(arg3);
                field653.method2773(var74);
            }
        }
        if (arg2 == 10) {
            class104 var75 = var13[arg3];
            if (var75 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var76 = class322.method3236(class320.field3279, field653.field1456);
                var76.field3394.method8938(arg3);
                var76.field3394.method8711(field729.method4036(82) ? 1 : 0);
                field653.method2773(var76);
            }
        }
        if (arg2 == 28) {
            class322 var77 = class322.method3236(class320.field3352, field653.field1456);
            var77.field3394.method8714(arg1);
            field653.method2773(var77);
            class359 var78 = Statics.field4650.method5895(arg1);
            if (var78 != null && var78.field3957 != null && var78.field3957[0][0] == 5) {
                int var79 = var78.field3957[0][1];
                class347.field3731[var79] = 1 - class347.field3731[var79];
                method2148(var79);
            }
        }
        if (arg2 == 30 && field582 == null) {
            method3179(arg1, arg0);
            field582 = Statics.field4650.method5889(arg1, arg0);
            method7942(field582);
        }
        if (arg2 == 11) {
            class104 var80 = var13[arg3];
            if (var80 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var81 = class322.method3236(class320.field3313, field653.field1456);
                var81.field3394.method8938(arg3);
                var81.field3394.method8927(field729.method4036(82) ? 1 : 0);
                field653.method2773(var81);
            }
        }
        if (arg2 == 46) {
            class94 var82 = var14[arg3];
            if (var82 != null) {
                field526 = arg8;
                field622 = arg9;
                field675 = 2;
                field623 = 0;
                field753 = arg0;
                field754 = arg1;
                class322 var83 = class322.method3236(class320.field3372, field653.field1456);
                var83.field3394.method8758(field729.method4036(82) ? 1 : 0);
                var83.field3394.method8768(arg3);
                field653.method2773(var83);
            }
        }
        if (field589 != 0) {
            field589 = 0;
            method7942(Statics.field4650.method5895(Statics.field95));
        }
        if (field667) {
            method318();
        }
    }

    @ObfuscatedName("bd.lx(ILjava/lang/String;I)V")
    public static void method873(int arg0, String arg1) {
        int var2 = Statics.field297.field1148.field1320.field1405;
        int[] var3 = Statics.field297.field1148.field1320.field1410;
        boolean var4 = false;
        class569 var5 = new class569(arg1, Statics.field992);
        for (int var6 = 0; var6 < var2; var6++) {
            class94 var7 = Statics.field297.field1148.field1327[var3[var6]];
            if (var7 != null && Statics.field297 != var7 && var7.field1137 != null && var7.field1137.equals(var5)) {
                if (arg0 == 1) {
                    class322 var8 = class322.method3236(class320.field3346, field653.field1456);
                    var8.field3394.method8927(0);
                    var8.field3394.method8938(var3[var6]);
                    field653.method2773(var8);
                } else if (arg0 == 4) {
                    class322 var9 = class322.method3236(class320.field3373, field653.field1456);
                    var9.field3394.method8927(0);
                    var9.field3394.method8712(var3[var6]);
                    field653.method2773(var9);
                } else if (arg0 == 6) {
                    class322 var10 = class322.method3236(class320.field3320, field653.field1456);
                    var10.field3394.method8768(var3[var6]);
                    var10.field3394.method8758(0);
                    field653.method2773(var10);
                } else if (arg0 == 7) {
                    class322 var11 = class322.method3236(class320.field3329, field653.field1456);
                    var11.field3394.method8768(var3[var6]);
                    var11.field3394.method8758(0);
                    field653.method2773(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class114.method3518(4, "", class379.field4282 + arg1);
        }
    }

    @ObfuscatedName("ln.lc(IIIIB)V")
    public static void method5228(int arg0, int arg1, int arg2, int arg3) {
        class359 var4 = Statics.field4650.method5889(arg0, arg1);
        if (var4 != null && var4.field3890 != null) {
            class90 var5 = new class90();
            var5.field1086 = var4;
            var5.field1088 = var4.field3890;
            class73.method2137(var5);
        }
        field588 = arg3;
        field667 = true;
        Statics.field458 = arg0;
        field802 = arg1;
        Statics.field1115 = arg2;
        method7942(var4);
    }

    @ObfuscatedName("af.mo(I)V")
    public static void method318() {
        if (!field667) {
            return;
        }
        class359 var0 = Statics.field4650.method5889(Statics.field458, field802);
        if (var0 != null && var0.field3931 != null) {
            class90 var1 = new class90();
            var1.field1086 = var0;
            var1.field1088 = var0.field3931;
            class73.method2137(var1);
        }
        field588 = -1;
        field667 = false;
        method7942(var0);
    }

    @ObfuscatedName("gk.mr(III)V")
    public static void method3179(int arg0, int arg1) {
        class322 var2 = class322.method3236(class320.field3295, field653.field1456);
        var2.field3394.method8709(arg0);
        var2.field3394.method8768(arg1);
        field653.method2773(var2);
    }

    @ObfuscatedName("ro.mz(IIIILjava/lang/String;B)V")
    public static void method7586(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class359 var5 = Statics.field4650.method5889(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3939 != null) {
            class90 var6 = new class90();
            var6.field1086 = var5;
            var6.field1082 = arg0;
            var6.field1090 = arg4;
            var6.field1088 = var5.field3939;
            class73.method2137(var6);
        }
        boolean var7 = true;
        if (var5.field3836 > 0) {
            var7 = method3113(var5);
        }
        if (!var7 || !class360.method5832(method3224(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class322 var8 = class322.method3236(class320.field3308, field653.field1456);
            var8.field3394.method8714(arg1);
            var8.field3394.method8712(arg2);
            var8.field3394.method8712(arg3);
            field653.method2773(var8);
        }
        if (arg0 == 2) {
            class322 var9 = class322.method3236(class320.field3305, field653.field1456);
            var9.field3394.method8714(arg1);
            var9.field3394.method8712(arg2);
            var9.field3394.method8712(arg3);
            field653.method2773(var9);
        }
        if (arg0 == 3) {
            class322 var10 = class322.method3236(class320.field3375, field653.field1456);
            var10.field3394.method8714(arg1);
            var10.field3394.method8712(arg2);
            var10.field3394.method8712(arg3);
            field653.method2773(var10);
        }
        if (arg0 == 4) {
            class322 var11 = class322.method3236(class320.field3345, field653.field1456);
            var11.field3394.method8714(arg1);
            var11.field3394.method8712(arg2);
            var11.field3394.method8712(arg3);
            field653.method2773(var11);
        }
        if (arg0 == 5) {
            class322 var12 = class322.method3236(class320.field3309, field653.field1456);
            var12.field3394.method8714(arg1);
            var12.field3394.method8712(arg2);
            var12.field3394.method8712(arg3);
            field653.method2773(var12);
        }
        if (arg0 == 6) {
            class322 var13 = class322.method3236(class320.field3335, field653.field1456);
            var13.field3394.method8714(arg1);
            var13.field3394.method8712(arg2);
            var13.field3394.method8712(arg3);
            field653.method2773(var13);
        }
        if (arg0 == 7) {
            class322 var14 = class322.method3236(class320.field3337, field653.field1456);
            var14.field3394.method8714(arg1);
            var14.field3394.method8712(arg2);
            var14.field3394.method8712(arg3);
            field653.method2773(var14);
        }
        if (arg0 == 8) {
            class322 var15 = class322.method3236(class320.field3332, field653.field1456);
            var15.field3394.method8714(arg1);
            var15.field3394.method8712(arg2);
            var15.field3394.method8712(arg3);
            field653.method2773(var15);
        }
        if (arg0 == 9) {
            class322 var16 = class322.method3236(class320.field3356, field653.field1456);
            var16.field3394.method8714(arg1);
            var16.field3394.method8712(arg2);
            var16.field3394.method8712(arg3);
            field653.method2773(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class322 var17 = class322.method3236(class320.field3344, field653.field1456);
        var17.field3394.method8714(arg1);
        var17.field3394.method8712(arg2);
        var17.field3394.method8712(arg3);
        field653.method2773(var17);
    }

    @ObfuscatedName("ea.mm(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2796(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method4339(arg0, arg1, arg2, arg3, arg4, arg5, -1, false, -1);
    }

    @ObfuscatedName("hq.mt(Ljava/lang/String;Ljava/lang/String;IIIIIB)V")
    public static final void method3334(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method4339(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false, -1);
    }

    @ObfuscatedName("jm.mj(Ljava/lang/String;Ljava/lang/String;IIIIIZII)V")
    public static final void method4339(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (field647) {
            return;
        }
        int var9 = arg2;
        if (arg2 >= 2000) {
            var9 = arg2 - 2000;
        }
        boolean var10 = var9 == 16 || var9 == 17 || var9 >= 18 && var9 <= 22;
        boolean var11 = var10 || class88.method3923(var9);
        if (!var11) {
            boolean var12 = var9 == 1002 || var9 == 1003 || var9 == 1004;
            var11 = var12;
        }
        boolean var13 = var11 || arg8 == -1 || Statics.field297.field1148.field1329 == arg8;
        if (!var13 || field577 >= 500) {
            return;
        }
        field655[field577] = arg0;
        field656[field577] = arg1;
        field758[field577] = arg2;
        field652[field577] = arg3;
        field649[field577] = arg4;
        field807[field577] = arg5;
        field764[field577] = arg6;
        field654[field577] = arg8;
        field529[field577] = arg7;
        field577++;
    }

    @ObfuscatedName("jh.ms(II)Ljava/lang/String;")
    public static String method4220(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field656[arg0].length() > 0) {
            return field655[arg0] + class379.field4337 + field656[arg0];
        } else {
            return field655[arg0];
        }
    }

    @ObfuscatedName("pn.mi(IIIIB)V")
    public static final void method6688(int arg0, int arg1, int arg2, int arg3) {
        if (field589 == 0 && !field667) {
            method2796(class379.field4288, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        int var6 = 0;
        long var7 = -1L;
        int var9 = 0;
        while (true) {
            int var11 = class295.field3165;
            if (var9 >= var11) {
                if (var4 != -1L) {
                    int var12 = class295.method2771(var4);
                    int var13 = (int) (var4 >>> 7 & 0x7FL);
                    class94 var15 = Statics.field5138.field1327[field531];
                    method2165(var15, field531, var12, var13, var6);
                }
                return;
            }
            long var16 = class295.field3166[var9];
            if (var7 != var16) {
                var7 = var16;
                int var20 = class295.method2771(class295.field3166[var9]);
                int var21 = var20;
                int var22 = class295.method6430(var9);
                long var23 = class295.field3166[var9];
                int var25 = (int) (var23 >>> 14 & 0x3L);
                int var28 = class295.method3084(var9);
                int var29 = class295.method2918(var9);
                if (var29 == 2047) {
                    var29 = -1;
                }
                class102 var30 = null;
                if (var29 >= 0 && Statics.field5138.field1332[var29] != null) {
                    var30 = Statics.field5138.field1332[var29].field4972;
                } else if (var29 == -1) {
                    var30 = Statics.field5138;
                }
                if (var30 != null) {
                    label346: {
                        int var31 = var30.field1319;
                        if (var25 == 2 && var30.field1317.method4956(var31, var20, var22, var16) >= 0) {
                            class207 var32 = class207.method95(var28);
                            if (var32.field2194 != null) {
                                var32 = var32.method3616();
                            }
                            if (var32 == null) {
                                break label346;
                            }
                            class97 var33 = null;
                            for (class97 var34 = (class97) var30.field1336.method6814(); var34 != null; var34 = (class97) var30.field1336.method6799()) {
                                if (var34.field1175 == var31 && var34.field1179 == var21 && var34.field1178 == var22 && var34.field1176 == var28) {
                                    var33 = var34;
                                    break;
                                }
                            }
                            if (!Statics.field4671 && field589 == 1) {
                                method4339(class379.field4119, field643 + " " + class105.field1359 + " " + class105.method3400(65535) + var32.field2203, 1, var28, var21, var22, -1, false, var29);
                            } else if (!field667) {
                                String[] var35 = var32.field2196;
                                if (var35 != null) {
                                    for (int var36 = 4; var36 >= 0; var36--) {
                                        if (!Statics.field4671 && (var33 == null || var33.method2356(var36)) && var35[var36] != null) {
                                            short var37 = 0;
                                            if (var36 == 0) {
                                                var37 = 3;
                                            }
                                            if (var36 == 1) {
                                                var37 = 4;
                                            }
                                            if (var36 == 2) {
                                                var37 = 5;
                                            }
                                            if (var36 == 3) {
                                                var37 = 6;
                                            }
                                            if (var36 == 4) {
                                                var37 = 1001;
                                            }
                                            method4339(var35[var36], class105.method3400(65535) + var32.field2203, var37, var28, var21, var22, -1, false, var29);
                                        }
                                    }
                                }
                                method4339(class379.field4398, class105.method3400(65535) + var32.field2203, 1002, var32.field2160, var21, var22, -1, false, var29);
                            } else if (!Statics.field4671 && (Statics.field1115 & 0x4) == 4) {
                                method4339(field670, field671 + " " + class105.field1359 + " " + class105.method3400(65535) + var32.field2203, 2, var28, var21, var22, -1, false, var29);
                            }
                        }
                        if (var25 == 1) {
                            class104 var38 = var30.field1316[var28];
                            if (var38 == null) {
                                break label346;
                            }
                            if (var38.field1348.field1991 == 1 && (var38.field1229 & 0x7F) == 64 && (var38.field1192 & 0x7F) == 64) {
                                for (int var39 = 0; var39 < var30.field1330; var39++) {
                                    class104 var40 = var30.field1316[var30.field1331[var39]];
                                    if (var40 != null && var38 != var40 && var40.field1348.field1991 == 1 && var38.field1229 == var40.field1229 && var38.field1192 == var40.field1192) {
                                        method4575(var40, var30.field1331[var39], var21, var22, var29);
                                    }
                                }
                                int var41 = var30.field1320.field1405;
                                int[] var42 = var30.field1320.field1410;
                                for (int var43 = 0; var43 < var41; var43++) {
                                    class94 var44 = var30.field1327[var42[var43]];
                                    if (var44 != null && var38.field1229 == var44.field1229 && var38.field1192 == var44.field1192) {
                                        method2165(var44, var42[var43], var21, var22, var29);
                                    }
                                }
                            }
                            method4575(var38, var28, var21, var22, var29);
                        }
                        if (var25 == 0) {
                            class94 var45 = var30.field1327[var28];
                            if (var45 == null) {
                                break label346;
                            }
                            if ((var45.field1229 & 0x7F) == 64 && (var45.field1192 & 0x7F) == 64) {
                                for (int var46 = 0; var46 < var30.field1330; var46++) {
                                    class104 var47 = var30.field1316[var30.field1331[var46]];
                                    if (var47 != null && var47.field1348.field1991 == 1 && var45.field1229 == var47.field1229 && var45.field1192 == var47.field1192) {
                                        method4575(var47, var30.field1331[var46], var21, var22, var29);
                                    }
                                }
                                int var48 = var30.field1320.field1405;
                                int[] var49 = var30.field1320.field1410;
                                for (int var50 = 0; var50 < var48; var50++) {
                                    class94 var51 = var30.field1327[var49[var50]];
                                    if (var51 != null && var45 != var51 && var45.field1229 == var51.field1229 && var45.field1192 == var51.field1192) {
                                        method2165(var51, var49[var50], var21, var22, var29);
                                    }
                                }
                            }
                            if (field531 == var28) {
                                var4 = var16;
                                var6 = var29;
                            } else {
                                method2165(var45, var28, var21, var22, var29);
                            }
                        }
                        if (var25 == 3) {
                            class407 var52 = var30.field1335[var31][var21][var22];
                            if (var52 != null) {
                                for (class108 var53 = (class108) var52.method6798(); var53 != null; var53 = (class108) var52.method6800()) {
                                    class208 var54 = class208.method3193(var53.field1388);
                                    if (!Statics.field1725 && field589 == 1) {
                                        method4339(class379.field4119, field643 + " " + class105.field1359 + " " + class105.method3400(16748608) + var54.field2216, 16, var53.field1388, var21, var22, -1, false, var29);
                                    } else if (!field667) {
                                        String[] var55 = var54.field2257;
                                        for (int var56 = 4; var56 >= 0; var56--) {
                                            if (!Statics.field1725 && var53.method2656(var56)) {
                                                if (var55 != null && var55[var56] != null) {
                                                    byte var57 = 0;
                                                    if (var56 == 0) {
                                                        var57 = 18;
                                                    }
                                                    if (var56 == 1) {
                                                        var57 = 19;
                                                    }
                                                    if (var56 == 2) {
                                                        var57 = 20;
                                                    }
                                                    if (var56 == 3) {
                                                        var57 = 21;
                                                    }
                                                    if (var56 == 4) {
                                                        var57 = 22;
                                                    }
                                                    method4339(var55[var56], class105.method3400(16748608) + var54.field2216, var57, var53.field1388, var21, var22, -1, false, var29);
                                                } else if (var56 == 2) {
                                                    method4339(class379.field4278, class105.method3400(16748608) + var54.field2216, 20, var53.field1388, var21, var22, -1, false, var29);
                                                }
                                            }
                                        }
                                        method4339(class379.field4398, class105.method3400(16748608) + var54.field2216, 1004, var53.field1388, var21, var22, -1, false, var29);
                                    } else if (!Statics.field1725 && (Statics.field1115 & 0x1) == 1) {
                                        method4339(field670, field671 + " " + class105.field1359 + " " + class105.method3400(16748608) + var54.field2216, 17, var53.field1388, var21, var22, -1, false, var29);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var9++;
        }
    }

    @ObfuscatedName("kg.md(Ldx;IIIIB)V")
    public static final void method4575(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        class193 var5 = arg0.field1348;
        if (field577 >= 400) {
            return;
        }
        if (var5.field2014 != null) {
            var5 = var5.method3408();
        }
        if (var5 == null || !var5.field2022 || var5.field2027 && field681 != arg1) {
            return;
        }
        String var6 = arg0.method2572();
        if (var5.field2015 != 0 && arg0.field1267 != 0) {
            int var7 = arg0.field1267 == -1 ? var5.field2015 : arg0.field1267;
            var6 = var6 + method3606(var7, Statics.field297.field1122) + " " + class105.field1357 + class379.field4289 + var7 + class105.field1358;
        }
        if (var5.field2028 && field658) {
            method4339(class379.field4398, class105.method3400(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
        }
        if (!Statics.field1031 && field589 == 1) {
            method4339(class379.field4119, field643 + " " + class105.field1359 + " " + class105.method3400(16776960) + var6, 7, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field667) {
            int var8 = var5.field2028 && field658 ? 2000 : 0;
            String[] var9 = var5.field2020;
            if (var9 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (!Statics.field1031 && arg0.method2613(var10) && var9[var10] != null && !var9[var10].equalsIgnoreCase(class379.field4130)) {
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
                        method4339(var9[var10], class105.method3400(16776960) + var6, var11, arg1, arg2, arg3, -1, false, arg4);
                    }
                }
            }
            if (var9 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (!Statics.field1031 && arg0.method2613(var12) && var9[var12] != null && var9[var12].equalsIgnoreCase(class379.field4130)) {
                        short var13 = 0;
                        if (field766 != class107.field1383) {
                            if (field766 == class107.field1382 || field766 == class107.field1381 && var5.field2015 > Statics.field297.field1122) {
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
                            method4339(var9[var12], class105.method3400(16776960) + var6, var14, arg1, arg2, arg3, -1, false, arg4);
                        }
                    }
                }
            }
            if (!var5.field2028 || !field658) {
                method4339(class379.field4398, class105.method3400(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
            }
        } else if (!Statics.field1031 && (Statics.field1115 & 0x2) == 2) {
            method4339(field670, field671 + " " + class105.field1359 + " " + class105.method3400(16776960) + var6, 8, arg1, arg2, arg3, -1, false, arg4);
        }
    }

    @ObfuscatedName("dr.mb(Ldb;IIIII)V")
    public static final void method2165(class94 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field707 == arg0.field1141 || field577 >= 400) {
            return;
        }
        String var5;
        if (arg0.field1125 == 0) {
            var5 = arg0.field1123[0] + arg0.field1137 + arg0.field1123[1] + method3606(arg0.field1122, Statics.field297.field1122) + " " + class105.field1357 + class379.field4289 + arg0.field1122 + class105.field1358 + arg0.field1123[2];
        } else {
            var5 = arg0.field1123[0] + arg0.field1137 + arg0.field1123[1] + " " + class105.field1357 + class379.field4290 + arg0.field1125 + class105.field1358 + arg0.field1123[2];
        }
        if (field589 == 1) {
            method4339(class379.field4119, field643 + " " + class105.field1359 + " " + class105.method3400(16777215) + var5, 14, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field667) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (field687[var6] != null) {
                    short var7 = 0;
                    if (field687[var6].equalsIgnoreCase(class379.field4130)) {
                        if (field793 == class107.field1383) {
                            continue;
                        }
                        if (field793 == class107.field1382 || field793 == class107.field1381 && arg0.field1122 > Statics.field297.field1122) {
                            var7 = 2000;
                        }
                        if (Statics.field297.field1144 == 0 || arg0.field1144 == 0) {
                            if (field793 == class107.field1385 && arg0.method2304()) {
                                var7 = 2000;
                            }
                        } else if (Statics.field297.field1144 == arg0.field1144) {
                            var7 = 2000;
                        } else {
                            var7 = 0;
                        }
                    } else if (field639[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    int var9 = field637[var6] + var7;
                    method4339(field687[var6], class105.method3400(16777215) + var5, var9, arg1, arg2, arg3, -1, false, arg4);
                }
            }
        } else if ((Statics.field1115 & 0x8) == 8) {
            method4339(field670, field671 + " " + class105.field1359 + " " + class105.method3400(16777215) + var5, 15, arg1, arg2, arg3, -1, false, arg4);
        }
        for (int var10 = 0; var10 < field577; var10++) {
            if (field758[var10] == 23) {
                field656[var10] = class105.method3400(16777215) + var5;
                break;
            }
        }
    }

    @ObfuscatedName("hg.mp(III)Ljava/lang/String;")
    public static final String method3606(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class105.method3400(16711680);
        } else if (var2 < -6) {
            return class105.method3400(16723968);
        } else if (var2 < -3) {
            return class105.method3400(16740352);
        } else if (var2 < 0) {
            return class105.method3400(16756736);
        } else if (var2 > 9) {
            return class105.method3400(65280);
        } else if (var2 > 6) {
            return class105.method3400(4259584);
        } else if (var2 > 3) {
            return class105.method3400(8453888);
        } else if (var2 > 0) {
            return class105.method3400(12648192);
        } else {
            return class105.method3400(16776960);
        }
    }

    @ObfuscatedName("dy.ma(IIIIIIIII)V")
    public static final void method2355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field4650.method5890(arg0)) {
            Statics.field4762 = null;
            method4568(Statics.field4650.field3741[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field4762 != null) {
                method4568(Statics.field4762, -1412584499, arg1, arg2, arg3, arg4, Statics.field2820, Statics.field1674, arg7);
                Statics.field4762 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field722[var8] = true;
            }
        } else {
            field722[arg7] = true;
        }
    }

    @ObfuscatedName("jy.mn([Lnx;IIIIIIIIB)V")
    public static final void method4568(class359[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class557.method9105(arg2, arg3, arg4, arg5);
        class278.method4814();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class359 var10 = arg0[var9];
            if (var10 != null && (var10.field3851 == arg1 || arg1 == -1412584499 && field736 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field725[field641] = var10.field3845 + arg6;
                    field726[field641] = var10.field3846 + arg7;
                    field727[field641] = var10.field3847;
                    field573[field641] = var10.field3848;
                    var11 = ++field641 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3976 = var11;
                var10.field3871 = field516;
                if (!var10.field3915 || !method3263(var10)) {
                    if (var10.field3836 > 0) {
                        method447(var10);
                    }
                    int var12 = var10.field3845 + arg6;
                    int var13 = var10.field3846 + arg7;
                    int var14 = var10.field3863;
                    if (field736 == var10) {
                        if (arg1 != -1412584499 && !var10.field3868) {
                            Statics.field4762 = arg0;
                            Statics.field2820 = arg6;
                            Statics.field1674 = arg7;
                            continue;
                        }
                        if (field695 && field689) {
                            int var15 = class36.field224;
                            int var16 = class36.field214;
                            int var17 = var15 - field628;
                            int var18 = var16 - field700;
                            if (var17 < field690) {
                                var17 = field690;
                            }
                            if (var10.field3847 + var17 > field690 + field685.field3847) {
                                var17 = field690 + field685.field3847 - var10.field3847;
                            }
                            if (var18 < field506) {
                                var18 = field506;
                            }
                            if (var10.field3848 + var18 > field506 + field685.field3848) {
                                var18 = field506 + field685.field3848 - var10.field3848;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3868) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3834 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3847 + var12;
                        int var22 = var10.field3848 + var13;
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
                        int var29 = var10.field3847 + var12;
                        int var30 = var10.field3848 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3915 || var25 < var27 && var26 < var28) {
                        if (var10.field3836 != 0) {
                            if (var10.field3836 == 1336) {
                                if (Statics.field1379.method2451()) {
                                    var13 += 15;
                                    Statics.field2095.method7480("Fps:" + field176, var10.field3847 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field662) {
                                        var33 = 16711680;
                                    }
                                    Statics.field2095.method7480("Mem:" + var32 + "k", var10.field3847 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3836 == 1337) {
                                field661 = var12;
                                field551 = var13;
                                method3235(var12, var13, var10.field3847, var10.field3848);
                                field722[var10.field3976] = true;
                                class557.method9105(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3836 == 1338) {
                                method7666(var10, var12, var13, var11);
                                class557.method9105(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3836 == 1339) {
                                method3877(var10, var12, var13, var11);
                                class557.method9105(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3836 == 1400) {
                                Statics.field3175.method8316(var12, var13, var10.field3847, var10.field3848, field516, Statics.field1379.method2449());
                            }
                            if (var10.field3836 == 1401) {
                                Statics.field3175.method8223(var12, var13, var10.field3847, var10.field3848);
                            }
                            if (var10.field3836 == 1402) {
                                Statics.field1107.method2408(var12, field516);
                            }
                        }
                        if (var10.field3834 == 0) {
                            if (!var10.field3915 && method3263(var10) && Statics.field1884 != var10) {
                                continue;
                            }
                            if (!var10.field3915) {
                                if (var10.field3854 > var10.field3856 - var10.field3848) {
                                    var10.field3854 = var10.field3856 - var10.field3848;
                                }
                                if (var10.field3854 < 0) {
                                    var10.field3854 = 0;
                                }
                            }
                            method4568(arg0, var10.field3831, var25, var26, var27, var28, var12 - var10.field3977, var13 - var10.field3854, var11);
                            if (var10.field3969 != null) {
                                method4568(var10.field3969, var10.field3831, var25, var26, var27, var28, var12 - var10.field3977, var13 - var10.field3854, var11);
                            }
                            class89 var34 = (class89) field673.method8464((long) var10.field3831);
                            if (var34 != null) {
                                method2355(var34.field1078, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class557.method9105(arg2, arg3, arg4, arg5);
                            class278.method4814();
                        } else if (var10.field3834 == 11) {
                            if (method3263(var10) && Statics.field1884 != var10) {
                                continue;
                            }
                            if (var10.field3969 != null) {
                                method4568(var10.field3969, var10.field3831, var25, var26, var27, var28, var12 - var10.field3977, var13 - var10.field3854, var11);
                            }
                            class557.method9105(arg2, arg3, arg4, arg5);
                            class278.method4814();
                        }
                        if (field731 || field724[var11] || field583 > 1) {
                            if (var10.field3834 == 0 && !var10.field3915 && var10.field3856 > var10.field3848) {
                                method445(var10.field3847 + var12, var13, var10.field3854, var10.field3848, var10.field3856);
                            }
                            if (var10.field3834 != 1) {
                                if (var10.field3834 == 3) {
                                    int var35;
                                    if (method8594(var10)) {
                                        var35 = var10.field3858;
                                        if (Statics.field1884 == var10 && var10.field3860 != 0) {
                                            var35 = var10.field3860;
                                        }
                                    } else {
                                        var35 = var10.field3913;
                                        if (Statics.field1884 == var10 && var10.field3859 != 0) {
                                            var35 = var10.field3859;
                                        }
                                    }
                                    if (var10.field3861) {
                                        switch(var10.field3949.field5444) {
                                            case 1:
                                                class557.method9061(var12, var13, var10.field3847, var10.field3848, var10.field3913, var10.field3858);
                                                break;
                                            case 2:
                                                class557.method9062(var12, var13, var10.field3847, var10.field3848, var10.field3913, var10.field3858, 255 - (var10.field3863 & 0xFF), 255 - (var10.field3864 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class557.method9060(var12, var13, var10.field3847, var10.field3848, var35);
                                                } else {
                                                    class557.method9079(var12, var13, var10.field3847, var10.field3848, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class557.method9064(var12, var13, var10.field3847, var10.field3848, var35);
                                    } else {
                                        class557.method9065(var12, var13, var10.field3847, var10.field3848, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3834 == 4) {
                                    class432 var36 = var10.method6242(Statics.field4650);
                                    if (var36 != null) {
                                        String var37 = var10.field3895;
                                        int var38;
                                        if (method8594(var10)) {
                                            var38 = var10.field3858;
                                            if (Statics.field1884 == var10 && var10.field3860 != 0) {
                                                var38 = var10.field3860;
                                            }
                                            if (var10.field3896.length() > 0) {
                                                var37 = var10.field3896;
                                            }
                                        } else {
                                            var38 = var10.field3913;
                                            if (Statics.field1884 == var10 && var10.field3859 != 0) {
                                                var38 = var10.field3859;
                                            }
                                        }
                                        if (var10.field3915 && var10.field3965 != -1) {
                                            class208 var39 = class208.method3193(var10.field3965);
                                            var37 = var39.field2216;
                                            if (var37 == null) {
                                                var37 = class379.field4390;
                                            }
                                            if ((var39.field2228 == 1 || var10.field3938 != 1) && var10.field3938 != -1) {
                                                var37 = class105.method3400(16748608) + var37 + class105.field1361 + " " + 'x' + method4142(var10.field3938);
                                            }
                                        }
                                        if (field582 == var10) {
                                            var37 = class379.field4291;
                                            var38 = var10.field3913;
                                        }
                                        if (!var10.field3915) {
                                            var37 = method6382(var37, var10);
                                        }
                                        var36.method7437(var37, var12, var13, var10.field3847, var10.field3848, var38, var10.field3933 ? 0 : -1, class499.method8114(var10.field3863), var10.field3898, var10.field3899, var10.field3862);
                                    } else if (class359.field3829) {
                                        method7942(var10);
                                    }
                                } else if (var10.field3834 == 5) {
                                    if (var10.field3915) {
                                        class561 var41;
                                        if (var10.field3965 == -1) {
                                            var41 = var10.method6237(Statics.field4650, false, Statics.field4837);
                                        } else {
                                            var41 = class208.method3605(var10.field3965, var10.field3938, var10.field3943, var10.field3873, var10.field3893, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5462;
                                            int var43 = var41.field5463;
                                            if (var10.field3840) {
                                                class557.method9059(var12, var13, var10.field3847 + var12, var10.field3848 + var13);
                                                int var44 = (var10.field3847 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3848 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3821 != 0) {
                                                            var41.method9183(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3821, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method9189(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method9186(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class557.method9105(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3847 * 4096 / var42;
                                                if (var10.field3821 != 0) {
                                                    var41.method9183(var10.field3847 / 2 + var12, var10.field3848 / 2 + var13, var10.field3821, var48);
                                                } else if (var14 != 0) {
                                                    var41.method9175(var12, var13, var10.field3847, var10.field3848, 256 - (var14 & 0xFF));
                                                } else if (var10.field3847 == var42 && var10.field3848 == var43) {
                                                    var41.method9189(var12, var13);
                                                } else {
                                                    var41.method9270(var12, var13, var10.field3847, var10.field3848);
                                                }
                                            }
                                        } else if (class359.field3829) {
                                            method7942(var10);
                                        }
                                    } else {
                                        class561 var40 = var10.method6237(Statics.field4650, method8594(var10), Statics.field4837);
                                        if (var40 != null) {
                                            var40.method9189(var12, var13);
                                        } else if (class359.field3829) {
                                            method7942(var10);
                                        }
                                    }
                                } else if (var10.field3834 == 6) {
                                    boolean var49 = method8594(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3937;
                                    } else {
                                        var50 = var10.field3880;
                                    }
                                    class294 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3965 != -1) {
                                        class208 var53 = class208.method3193(var10.field3965);
                                        if (var53 != null) {
                                            class208 var54 = var53.method3704(var10.field3938);
                                            var51 = var54.method3694(1);
                                            if (var51 == null) {
                                                method7942(var10);
                                            } else {
                                                var51.method5249();
                                                var52 = var51.field3016 / 2;
                                            }
                                        }
                                    } else if (var10.field3910 == 5) {
                                        if (var10.field3877 == 0) {
                                            var51 = field790.method5923((class210) null, -1, (class210) null, -1);
                                        } else {
                                            var51 = Statics.field297.method2050();
                                        }
                                    } else if (var10.field3910 == 7) {
                                        var51 = var10.field3839.method5923((class210) null, -1, class210.method5910(Statics.field297.field1197), Statics.field297.field1233);
                                    } else {
                                        class192 var55 = null;
                                        if (var10.field3910 == 6) {
                                            int var56 = var10.field3877;
                                            if (var56 >= 0 && var56 < Statics.field5138.field1316.length) {
                                                class104 var57 = Statics.field5138.field1316[var56];
                                                if (var57 != null && var57.field1348 != null) {
                                                    int var58 = var57.field1348.method3431();
                                                    if (var58 != -1) {
                                                        var10.field3877 = var58;
                                                    }
                                                    var55 = var57.method2623();
                                                }
                                            }
                                        } else if (var10.field3910 == 2) {
                                            int var59 = var10.field3877;
                                            int var60 = class193.method2064(var59).method3431();
                                            if (var60 != -1) {
                                                var10.field3877 = var60;
                                            }
                                        }
                                        class210 var61 = null;
                                        int var62 = -1;
                                        if (var50 != -1) {
                                            var61 = class210.method5910(var50);
                                            var62 = var10.field3872;
                                        }
                                        var51 = var10.method6253(Statics.field4650, var61, var62, var49, Statics.field297.field1147, var55);
                                        if (var51 == null && class359.field3829) {
                                            method7942(var10);
                                        }
                                    }
                                    class278.method4819(var10.field3847 / 2 + var12, var10.field3848 / 2 + var13);
                                    int var63 = var10.field3887 * class278.field2878[var10.field3884] >> 16;
                                    int var64 = var10.field3887 * class278.field2879[var10.field3884] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3915) {
                                            var51.method5249();
                                            if (var10.field3891) {
                                                var51.method5267(0, var10.field3885, var10.field3886, var10.field3884, var10.field3882, var10.field3883 + var52 + var63, var10.field3883 + var64, var10.field3887);
                                            } else {
                                                var51.method5266(0, var10.field3885, var10.field3886, var10.field3884, var10.field3882, var10.field3883 + var52 + var63, var10.field3883 + var64);
                                            }
                                        } else {
                                            var51.method5266(0, var10.field3885, 0, var10.field3884, 0, var63, var64);
                                        }
                                    }
                                    class278.method4774();
                                } else {
                                    if (var10.field3834 == 8 && Statics.field467 == var10 && field663 == field501) {
                                        int var65 = 0;
                                        int var66 = 0;
                                        class432 var67 = Statics.field2095;
                                        String var68 = var10.field3895;
                                        String var69 = method6382(var68, var10);
                                        while (var69.length() > 0) {
                                            int var70 = var69.indexOf(class105.field1360);
                                            String var71;
                                            if (var70 == -1) {
                                                var71 = var69;
                                                var69 = "";
                                            } else {
                                                var71 = var69.substring(0, var70);
                                                var69 = var69.substring(var70 + 4);
                                            }
                                            int var72 = var67.method7427(var71);
                                            if (var72 > var65) {
                                                var65 = var72;
                                            }
                                            var66 += var67.field4768 + 1;
                                        }
                                        var65 += 6;
                                        var66 += 7;
                                        int var73 = var10.field3847 + var12 - 5 - var65;
                                        int var74 = var10.field3848 + var13 + 5;
                                        if (var73 < var12 + 5) {
                                            var73 = var12 + 5;
                                        }
                                        if (var65 + var73 > arg4) {
                                            var73 = arg4 - var65;
                                        }
                                        if (var66 + var74 > arg5) {
                                            var74 = arg5 - var66;
                                        }
                                        class557.method9060(var73, var74, var65, var66, 16777120);
                                        class557.method9064(var73, var74, var65, var66, 0);
                                        String var75 = var10.field3895;
                                        int var76 = var67.field4768 + var74 + 2;
                                        String var77 = method6382(var75, var10);
                                        while (var77.length() > 0) {
                                            int var78 = var77.indexOf(class105.field1360);
                                            String var79;
                                            if (var78 == -1) {
                                                var79 = var77;
                                                var77 = "";
                                            } else {
                                                var79 = var77.substring(0, var78);
                                                var77 = var77.substring(var78 + 4);
                                            }
                                            var67.method7528(var79, var73 + 3, var76, 0, -1);
                                            var76 += var67.field4768 + 1;
                                        }
                                    }
                                    if (var10.field3834 == 9) {
                                        int var80;
                                        int var81;
                                        int var82;
                                        int var83;
                                        if (var10.field3881) {
                                            var80 = var12;
                                            var81 = var10.field3848 + var13;
                                            var82 = var10.field3847 + var12;
                                            var83 = var13;
                                        } else {
                                            var80 = var12;
                                            var81 = var13;
                                            var82 = var10.field3847 + var12;
                                            var83 = var10.field3848 + var13;
                                        }
                                        if (var10.field3865 == 1) {
                                            class557.method9070(var80, var81, var82, var83, var10.field3913);
                                        } else {
                                            method4182(var80, var81, var82, var83, var10.field3913, var10.field3865);
                                        }
                                    } else if (var10.field3834 == 12) {
                                        class357 var84 = var10.method6367();
                                        class351 var85 = var10.method6266();
                                        if (var84 != null && var85 != null && var84.method6016()) {
                                            class432 var86 = var10.method6242(Statics.field4650);
                                            if (var86 != null) {
                                                field714.method9322(var12, var13, var10.field3847, var10.field3848, var84.method6017(), var84.method6018(), var84.method6155(), var84.method6015(), var84.method6214());
                                                int var87 = var10.field3933 ? var10.field3873 : -1;
                                                if (!var84.method6011() && var84.method6008().method7281()) {
                                                    field714.method9333(var85.field3751, var87, var85.field3753, var85.field3752);
                                                    field714.method9324(var84.method6051(), var86);
                                                } else {
                                                    field714.method9333(var10.field3913, var87, var85.field3753, var85.field3752);
                                                    field714.method9324(var84.method6008(), var86);
                                                }
                                                class557.method9105(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("ji.mh(IIIIIII)V")
    public static final void method4182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class557.field5438;
        int var18 = arg1 - class557.field5435;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class278.method4838(var19, var20, var21);
        class278.method4778(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class278.method4838(var19, var21, var22);
        class278.method4778(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("nx.mq(Ljava/lang/String;Lnx;B)Ljava/lang/String;")
    public static String method6382(String arg0, class359 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method321(arg1, var2 - 1);
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

    @ObfuscatedName("jb.mx(II)Ljava/lang/String;")
    public static final String method4142(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class105.field1363 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class105.method3400(65408) + var1.substring(0, var1.length() - 8) + class379.field4284 + " " + class105.field1357 + var1 + class105.field1358 + class105.field1361;
        } else if (var1.length() > 6) {
            return " " + class105.method3400(16777215) + var1.substring(0, var1.length() - 4) + class379.field4138 + " " + class105.field1357 + var1 + class105.field1358 + class105.field1361;
        } else {
            return " " + class105.method3400(16776960) + var1 + class105.field1361;
        }
    }

    @ObfuscatedName("client.my(ZB)V")
    public final void method1328(boolean arg0) {
        method3210(field567, Statics.field890, Statics.field5, arg0);
    }

    @ObfuscatedName("client.ml(Lnx;I)V")
    public void method1205(class359 arg0) {
        class359 var2 = arg0.field3851 == -1 ? null : Statics.field4650.method5895(arg0.field3851);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field890;
            var4 = Statics.field5;
        } else {
            var3 = var2.field3847;
            var4 = var2.field3848;
        }
        method4555(arg0, var3, var4, false);
        method2243(arg0, var3, var4);
    }

    @ObfuscatedName("jb.mk([Lnx;Lnx;ZI)V")
    public static void method4149(class359[] arg0, class359 arg1, boolean arg2) {
        int var3 = arg1.field3855 == 0 ? arg1.field3847 : arg1.field3855;
        int var4 = arg1.field3856 == 0 ? arg1.field3848 : arg1.field3856;
        method2253(arg0, arg1.field3831, var3, var4, arg2);
        if (arg1.field3969 != null) {
            method2253(arg1.field3969, arg1.field3831, var3, var4, arg2);
        }
        class89 var5 = (class89) field673.method8464((long) arg1.field3831);
        if (var5 != null) {
            method3210(var5.field1078, var3, var4, arg2);
        }
        if (arg1.field3836 == 1337) {
        }
    }

    @ObfuscatedName("gj.mc(IIIZB)V")
    public static final void method3210(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.field4650.method5890(arg0)) {
            method2253(Statics.field4650.field3741[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dm.mg([Lnx;IIIZI)V")
    public static void method2253(class359[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class359 var6 = arg0[var5];
            if (var6 != null && var6.field3851 == arg1) {
                method4555(var6, arg2, arg3, arg4);
                method2243(var6, arg2, arg3);
                if (var6.field3977 > var6.field3855 - var6.field3847) {
                    var6.field3977 = var6.field3855 - var6.field3847;
                }
                if (var6.field3977 < 0) {
                    var6.field3977 = 0;
                }
                if (var6.field3854 > var6.field3856 - var6.field3848) {
                    var6.field3854 = var6.field3856 - var6.field3848;
                }
                if (var6.field3854 < 0) {
                    var6.field3854 = 0;
                }
                if (var6.field3834 == 0) {
                    method4149(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("jk.mw(Lnx;IIZI)V")
    public static void method4555(class359 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3847;
        int var5 = arg0.field3848;
        if (arg0.field3917 == 0) {
            arg0.field3847 = arg0.field3947;
        } else if (arg0.field3917 == 1) {
            arg0.field3847 = arg1 - arg0.field3947;
        } else if (arg0.field3917 == 2) {
            arg0.field3847 = arg0.field3947 * arg1 >> 14;
        }
        if (arg0.field3921 == 0) {
            arg0.field3848 = arg0.field3844;
        } else if (arg0.field3921 == 1) {
            arg0.field3848 = arg2 - arg0.field3844;
        } else if (arg0.field3921 == 2) {
            arg0.field3848 = arg0.field3844 * arg2 >> 14;
        }
        if (arg0.field3917 == 4) {
            arg0.field3847 = arg0.field3849 * arg0.field3848 / arg0.field3850;
        }
        if (arg0.field3921 == 4) {
            arg0.field3848 = arg0.field3850 * arg0.field3847 / arg0.field3849;
        }
        if (arg0.field3836 == 1337) {
            field683 = arg0;
        }
        if (arg0.field3834 == 12) {
            arg0.method6367().method6013(arg0.field3847, arg0.field3848);
        }
        if (arg3 && arg0.field3953 != null && (arg0.field3847 != var4 || arg0.field3848 != var5)) {
            class90 var6 = new class90();
            var6.field1086 = arg0;
            var6.field1088 = arg0.field3953;
            field715.method6794(var6);
        }
    }

    @ObfuscatedName("do.me(Lnx;III)V")
    public static void method2243(class359 arg0, int arg1, int arg2) {
        if (arg0.field3837 == 0) {
            arg0.field3845 = arg0.field3907;
        } else if (arg0.field3837 == 1) {
            arg0.field3845 = (arg1 - arg0.field3847) / 2 + arg0.field3907;
        } else if (arg0.field3837 == 2) {
            arg0.field3845 = arg1 - arg0.field3847 - arg0.field3907;
        } else if (arg0.field3837 == 3) {
            arg0.field3845 = arg0.field3907 * arg1 >> 14;
        } else if (arg0.field3837 == 4) {
            arg0.field3845 = (arg0.field3907 * arg1 >> 14) + (arg1 - arg0.field3847) / 2;
        } else {
            arg0.field3845 = arg1 - arg0.field3847 - (arg0.field3907 * arg1 >> 14);
        }
        if (arg0.field3897 == 0) {
            arg0.field3846 = arg0.field3842;
        } else if (arg0.field3897 == 1) {
            arg0.field3846 = (arg2 - arg0.field3848) / 2 + arg0.field3842;
        } else if (arg0.field3897 == 2) {
            arg0.field3846 = arg2 - arg0.field3848 - arg0.field3842;
        } else if (arg0.field3897 == 3) {
            arg0.field3846 = arg0.field3842 * arg2 >> 14;
        } else if (arg0.field3897 == 4) {
            arg0.field3846 = (arg0.field3842 * arg2 >> 14) + (arg2 - arg0.field3848) / 2;
        } else {
            arg0.field3846 = arg2 - arg0.field3848 - (arg0.field3842 * arg2 >> 14);
        }
    }

    @ObfuscatedName("pl.mv(Lnx;IIIIIIB)V")
    public static final void method6775(class359 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field587) {
            field636 = 32;
        } else {
            field636 = 0;
        }
        field587 = false;
        if (class36.field212 == 1 || !Statics.field828 && class36.field212 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3854 -= 4;
                method7942(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3854 += 4;
                method7942(arg0);
            } else if (arg5 >= arg1 - field636 && arg5 < field636 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3854 = (arg4 - arg3) * var8 / var9;
                method7942(arg0);
                field587 = true;
            }
        }
        if (field530 == 0) {
            return;
        }
        int var10 = arg0.field3847;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3854 += field530 * 45;
            method7942(arg0);
        }
    }

    @ObfuscatedName("bo.mu(IIIIII)V")
    public static final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1487[0].method9148(arg0, arg1);
        Statics.field1487[1].method9148(arg0, arg1 + arg3 - 16);
        class557.method9060(arg0, arg1 + 16, 16, arg3 - 32, field694);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class557.method9060(arg0, arg1 + 16 + var6, 16, var5, field584);
        class557.method9104(arg0, arg1 + 16 + var6, var5, field748);
        class557.method9104(arg0 + 1, arg1 + 16 + var6, var5, field748);
        class557.method9050(arg0, arg1 + 16 + var6, 16, field748);
        class557.method9050(arg0, arg1 + 17 + var6, 16, field748);
        class557.method9104(arg0 + 15, arg1 + 16 + var6, var5, field585);
        class557.method9104(arg0 + 14, arg1 + 17 + var6, var5 - 1, field585);
        class557.method9050(arg0, arg1 + 15 + var6 + var5, 16, field585);
        class557.method9050(arg0 + 1, arg1 + 14 + var6 + var5, 15, field585);
    }

    @ObfuscatedName("ue.mf(Lnx;I)Z")
    public static final boolean method8594(class359 arg0) {
        if (arg0.field3930 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3930.length; var1++) {
            int var2 = method321(arg0, var1);
            int var3 = arg0.field3962[var1];
            if (arg0.field3930[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3930[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3930[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("af.nt(Lnx;II)I")
    public static final int method321(class359 arg0, int arg1) {
        if (arg0.field3957 == null || arg1 >= arg0.field3957.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3957[arg1];
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
                    var7 = field604[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field705[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field644[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class359 var11 = Statics.field4650.method5895(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class208.method3193(var12).field2233 || field503)) {
                        for (int var13 = 0; var13 < var11.field3963.length; var13++) {
                            if (var12 + 1 == var11.field3963[var13]) {
                                var7 += var11.field3964[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class347.field3731[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class369.field4039[field705[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class347.field3731[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field297.field1122;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class369.field4036[var14]) {
                            var7 += field705[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class359 var17 = Statics.field4650.method5895(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class208.method3193(var18).field2233 || field503)) {
                        for (int var19 = 0; var19 < var17.field3963.length; var19++) {
                            if (var18 + 1 == var17.field3963[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field678;
                }
                if (var6 == 12) {
                    var7 = field679;
                }
                if (var6 == 13) {
                    int var20 = class347.field3731[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class347.method3186(var22);
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
                    var7 = (Statics.field297.field1229 >> 7) + Statics.field5138.field1322;
                }
                if (var6 == 19) {
                    var7 = (Statics.field297.field1192 >> 7) + Statics.field5138.field1324;
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

    @ObfuscatedName("sc.nz(Lnx;I)V")
    public static final void method7865(class359 arg0) {
        if (arg0.field3835 == 1) {
            method3334(arg0.field3971, "", 24, 0, 0, arg0.field3831, arg0.field3965);
        }
        if (arg0.field3835 == 2 && !field667) {
            String var1 = method3042(arg0);
            if (var1 != null) {
                method3334(var1, class105.method3400(65280) + arg0.field3961, 25, 0, -1, arg0.field3831, arg0.field3965);
            }
        }
        if (arg0.field3835 == 3) {
            method2796(class379.field4292, "", 26, 0, 0, arg0.field3831);
        }
        if (arg0.field3835 == 4) {
            method2796(arg0.field3971, "", 28, 0, 0, arg0.field3831);
        }
        if (arg0.field3835 == 5) {
            method2796(arg0.field3971, "", 29, 0, 0, arg0.field3831);
        }
        if (arg0.field3835 == 6 && field582 == null) {
            method2796(arg0.field3971, "", 30, 0, -1, arg0.field3831);
        }
        if (!arg0.field3915) {
            return;
        }
        if (field667) {
            int var2 = method3224(arg0);
            boolean var3 = (var2 >> 21 & 0x1) != 0;
            if (var3 && (Statics.field1115 & 0x20) == 32) {
                method3334(field670, field671 + " " + class105.field1359 + " " + arg0.field3959, 58, 0, arg0.field3870, arg0.field3831, arg0.field3965);
            }
            return;
        }
        for (int var4 = 9; var4 >= 5; var4--) {
            String var5;
            if (!class360.method5832(method3224(arg0), var4) && arg0.field3939 == null) {
                var5 = null;
            } else if (arg0.field3928 == null || arg0.field3928.length <= var4 || arg0.field3928[var4] == null || arg0.field3928[var4].trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field3928[var4];
            }
            if (var5 != null) {
                method3334(var5, arg0.field3959, 1007, var4 + 1, arg0.field3870, arg0.field3831, arg0.field3965);
            }
        }
        String var7 = method3042(arg0);
        if (var7 != null) {
            method3334(var7, arg0.field3959, 25, 0, arg0.field3870, arg0.field3831, arg0.field3965);
        }
        for (int var8 = 4; var8 >= 0; var8--) {
            String var9;
            if (!class360.method5832(method3224(arg0), var8) && arg0.field3939 == null) {
                var9 = null;
            } else if (arg0.field3928 == null || arg0.field3928.length <= var8 || arg0.field3928[var8] == null || arg0.field3928[var8].trim().length() == 0) {
                var9 = null;
            } else {
                var9 = arg0.field3928[var8];
            }
            if (var9 != null) {
                method4339(var9, arg0.field3959, 57, var8 + 1, arg0.field3870, arg0.field3831, arg0.field3965, arg0.field3968, -1);
            }
        }
        int var11 = method3224(arg0);
        boolean var12 = (var11 & 0x1) != 0;
        if (var12) {
            method2796(class379.field4123, "", 30, 0, arg0.field3870, arg0.field3831);
        }
    }

    @ObfuscatedName("as.nv(I)Z")
    public static boolean method295() {
        return field659;
    }

    @ObfuscatedName("co.nm(IIIIIIII)V")
    public static final void method1106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field4650.method5890(arg0)) {
            method255(Statics.field4650.field3741[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("ao.ni([Lnx;IIIIIIIB)V")
    public static final void method255(class359[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class359 var9 = arg0[var8];
            if (var9 != null && var9.field3851 == arg1 && (var9.method6246() || method3224(var9) != 0 || field685 == var9)) {
                if (var9.field3915) {
                    if (method3263(var9)) {
                        continue;
                    }
                } else if (var9.field3834 == 0 && Statics.field1884 != var9 && method3263(var9)) {
                    continue;
                }
                if (var9.field3834 == 11) {
                    if (var9.method6371(Statics.field4650, Statics.field4837)) {
                        if (var9.method6325()) {
                            method7942(var9);
                            method4149(var9.field3969, var9, true);
                            var9.method6296().method3818().method3929(3, var9.method6296().method3830());
                        }
                        if (var9.field3956 != null) {
                            class90 var10 = new class90();
                            var10.field1086 = var9;
                            var10.field1088 = var9.field3956;
                            field715.method6794(var10);
                        }
                    }
                } else if (var9.field3834 == 12 && var9.method6270(Statics.field4650)) {
                    method7942(var9);
                }
                int var11 = var9.field3845 + arg6;
                int var12 = var9.field3846 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3834 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3847 + var11;
                    int var16 = var9.field3848 + var12;
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
                    int var23 = var9.field3847 + var11;
                    int var24 = var9.field3848 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field736 == var9) {
                    field692 = true;
                    field693 = var11;
                    field664 = var12;
                }
                boolean var25 = false;
                if (var9.field3916) {
                    switch(field674) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3831 >>> 16 == field505) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field505 == var9.field3831) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3915 || var19 < var21 && var20 < var22) {
                    if (var9.field3915) {
                        if (var9.field3979) {
                            if (class36.field224 >= var19 && class36.field214 >= var20 && class36.field224 < var21 && class36.field214 < var22) {
                                for (class90 var26 = (class90) field715.method6814(); var26 != null; var26 = (class90) field715.method6799()) {
                                    if (var26.field1084) {
                                        var26.method8130();
                                        var26.field1086.field3970 = false;
                                    }
                                }
                                method3090();
                                if (Statics.field5048 == 0) {
                                    field736 = null;
                                    field685 = null;
                                }
                                if (!field647) {
                                    method839();
                                }
                            }
                        } else if (var9.field3980 && class36.field224 >= var19 && class36.field214 >= var20 && class36.field224 < var21 && class36.field214 < var22) {
                            for (class90 var27 = (class90) field715.method6814(); var27 != null; var27 = (class90) field715.method6799()) {
                                if (var27.field1084 && var27.field1086.field3941 == var27.field1088) {
                                    var27.method8130();
                                }
                            }
                        }
                    }
                    int var28 = class36.field224;
                    int var29 = class36.field214;
                    if (class36.field220 != 0) {
                        var28 = class36.field223;
                        var29 = class36.field215;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3836 == 1337) {
                        if (!field515 && !field647 && var30) {
                            method6688(var28, var29, var19, var20);
                        }
                    } else if (var9.field3836 == 1338) {
                        method7662(var9, var11, var12);
                    } else {
                        if (var9.field3836 == 1400) {
                            Statics.field3175.method8202(class36.field224, class36.field214, var30, var11, var12, var9.field3847, var9.field3848);
                        }
                        if (!field647 && var30) {
                            if (var9.field3836 == 1400) {
                                Statics.field3175.method8247(var11, var12, var9.field3847, var9.field3848, var28, var29);
                            } else {
                                method7865(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3908.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3908[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3908[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3978 != null) {
                                            var35 = field729.method4036(var9.field3908[var31][var34]);
                                        }
                                        if (method652(var9.field3908[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3978 != null && var9.field3978[var31] > field516) {
                                                break;
                                            }
                                            byte var36 = var9.field3981[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field729.method4036(86) && !field729.method4036(82) && !field729.method4036(81)) && ((var36 & 0x2) == 0 || field729.method4036(86)) && ((var36 & 0x1) == 0 || field729.method4036(82)) && ((var36 & 0x4) == 0 || field729.method4036(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method7586(var31 + 1, var9.field3831, var9.field3870, var9.field3965, "");
                                    } else if (var31 == 10) {
                                        method318();
                                        method5228(var9.field3831, var9.field3870, Statics.method5458(method3224(var9)), var9.field3965);
                                        field670 = method3042(var9);
                                        if (field670 == null) {
                                            field670 = class379.field4390;
                                        }
                                        field671 = var9.field3959 + class105.method3400(16777215);
                                    }
                                    int var37 = var9.field3967[var31];
                                    if (var9.field3978 == null) {
                                        var9.field3978 = new int[var9.field3908.length];
                                    }
                                    if (var9.field3911 == null) {
                                        var9.field3911 = new int[var9.field3908.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3978[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3978[var31] == 0) {
                                        var9.field3978[var31] = field516 + var37 + var9.field3911[var31];
                                    } else {
                                        var9.field3978[var31] = field516 + var37;
                                    }
                                }
                                if (!var32 && var9.field3978 != null) {
                                    var9.field3978[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3915) {
                            boolean var38;
                            if (class36.field224 >= var19 && class36.field214 >= var20 && class36.field224 < var21 && class36.field214 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field212 == 1 || !Statics.field828 && class36.field212 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field220 == 1 || !Statics.field828 && class36.field220 == 4) && class36.field223 >= var19 && class36.field215 >= var20 && class36.field223 < var21 && class36.field215 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method670(var9, class36.field223 - var11, class36.field215 - var12);
                            }
                            if (var9.method6247()) {
                                if (var40) {
                                    field718.method6794(new class231(0, class36.field224 - var11, class36.field214 - var12, var9));
                                }
                                if (var39) {
                                    field718.method6794(new class231(1, class36.field224 - var11, class36.field214 - var12, var9));
                                }
                            }
                            if (var9.field3836 == 1400) {
                                Statics.field3175.method8203(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field736 != null && field736 != var9 && var38 && class360.method2874(method3224(var9))) {
                                field691 = var9;
                            }
                            if (field685 == var9) {
                                field689 = true;
                                field690 = var11;
                                field506 = var12;
                            }
                            if (var9.field3919) {
                                if (var38 && field530 != 0 && var9.field3941 != null) {
                                    class90 var41 = new class90();
                                    var41.field1084 = true;
                                    var41.field1086 = var9;
                                    var41.field1085 = field530;
                                    var41.field1088 = var9.field3941;
                                    field715.method6794(var41);
                                }
                                if (field736 != null || field647) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3843 && var40) {
                                    var9.field3843 = true;
                                    if (var9.field3952 != null) {
                                        class90 var42 = new class90();
                                        var42.field1084 = true;
                                        var42.field1086 = var9;
                                        var42.field1083 = class36.field223 - var11;
                                        var42.field1085 = class36.field215 - var12;
                                        var42.field1088 = var9.field3952;
                                        field715.method6794(var42);
                                    }
                                }
                                if (var9.field3843 && var39 && var9.field3922 != null) {
                                    class90 var43 = new class90();
                                    var43.field1084 = true;
                                    var43.field1086 = var9;
                                    var43.field1083 = class36.field224 - var11;
                                    var43.field1085 = class36.field214 - var12;
                                    var43.field1088 = var9.field3922;
                                    field715.method6794(var43);
                                }
                                if (var9.field3843 && !var39) {
                                    var9.field3843 = false;
                                    if (var9.field3923 != null) {
                                        class90 var44 = new class90();
                                        var44.field1084 = true;
                                        var44.field1086 = var9;
                                        var44.field1083 = class36.field224 - var11;
                                        var44.field1085 = class36.field214 - var12;
                                        var44.field1088 = var9.field3923;
                                        field717.method6794(var44);
                                    }
                                }
                                if (var39 && var9.field3924 != null) {
                                    class90 var45 = new class90();
                                    var45.field1084 = true;
                                    var45.field1086 = var9;
                                    var45.field1083 = class36.field224 - var11;
                                    var45.field1085 = class36.field214 - var12;
                                    var45.field1088 = var9.field3924;
                                    field715.method6794(var45);
                                }
                                if (!var9.field3970 && var38) {
                                    var9.field3970 = true;
                                    if (var9.field3958 != null) {
                                        class90 var46 = new class90();
                                        var46.field1084 = true;
                                        var46.field1086 = var9;
                                        var46.field1083 = class36.field224 - var11;
                                        var46.field1085 = class36.field214 - var12;
                                        var46.field1088 = var9.field3958;
                                        field715.method6794(var46);
                                    }
                                }
                                if (var9.field3970 && var38 && var9.field3838 != null) {
                                    class90 var47 = new class90();
                                    var47.field1084 = true;
                                    var47.field1086 = var9;
                                    var47.field1083 = class36.field224 - var11;
                                    var47.field1085 = class36.field214 - var12;
                                    var47.field1088 = var9.field3838;
                                    field715.method6794(var47);
                                }
                                if (var9.field3970 && !var38) {
                                    var9.field3970 = false;
                                    if (var9.field3927 != null) {
                                        class90 var48 = new class90();
                                        var48.field1084 = true;
                                        var48.field1086 = var9;
                                        var48.field1083 = class36.field224 - var11;
                                        var48.field1085 = class36.field214 - var12;
                                        var48.field1088 = var9.field3927;
                                        field717.method6794(var48);
                                    }
                                }
                                if (var9.field3966 != null) {
                                    class90 var49 = new class90();
                                    var49.field1086 = var9;
                                    var49.field1088 = var9.field3966;
                                    field716.method6794(var49);
                                }
                                if (var9.field3932 != null && field698 > var9.field3900) {
                                    if (var9.field3904 == null || field698 - var9.field3900 > 32) {
                                        class90 var54 = new class90();
                                        var54.field1086 = var9;
                                        var54.field1088 = var9.field3932;
                                        field715.method6794(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3900; var50 < field698; var50++) {
                                            int var51 = field697[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3904.length; var52++) {
                                                if (var9.field3904[var52] == var51) {
                                                    class90 var53 = new class90();
                                                    var53.field1086 = var9;
                                                    var53.field1088 = var9.field3932;
                                                    field715.method6794(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3900 = field698;
                                }
                                if (var9.field3934 != null && field621 > var9.field3912) {
                                    if (var9.field3935 == null || field621 - var9.field3912 > 32) {
                                        class90 var59 = new class90();
                                        var59.field1086 = var9;
                                        var59.field1088 = var9.field3934;
                                        field715.method6794(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3912; var55 < field621; var55++) {
                                            int var56 = field699[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3935.length; var57++) {
                                                if (var9.field3935[var57] == var56) {
                                                    class90 var58 = new class90();
                                                    var58.field1086 = var9;
                                                    var58.field1088 = var9.field3934;
                                                    field715.method6794(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3912 = field621;
                                }
                                if (var9.field3936 != null && field702 > var9.field3975) {
                                    if (var9.field3973 == null || field702 - var9.field3975 > 32) {
                                        class90 var64 = new class90();
                                        var64.field1086 = var9;
                                        var64.field1088 = var9.field3936;
                                        field715.method6794(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3975; var60 < field702; var60++) {
                                            int var61 = field688[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3973.length; var62++) {
                                                if (var9.field3973[var62] == var61) {
                                                    class90 var63 = new class90();
                                                    var63.field1086 = var9;
                                                    var63.field1088 = var9.field3936;
                                                    field715.method6794(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3975 = field702;
                                }
                                if (field648 > var9.field3972 && var9.field3942 != null) {
                                    class90 var65 = new class90();
                                    var65.field1086 = var9;
                                    var65.field1088 = var9.field3942;
                                    field715.method6794(var65);
                                }
                                if (field706 > var9.field3972 && var9.field3946 != null) {
                                    class90 var66 = new class90();
                                    var66.field1086 = var9;
                                    var66.field1088 = var9.field3946;
                                    field715.method6794(var66);
                                }
                                if (field804 > var9.field3972 && var9.field3903 != null) {
                                    class90 var67 = new class90();
                                    var67.field1086 = var9;
                                    var67.field1088 = var9.field3903;
                                    field715.method6794(var67);
                                }
                                if (field708 > var9.field3972 && var9.field3948 != null) {
                                    class90 var68 = new class90();
                                    var68.field1086 = var9;
                                    var68.field1088 = var9.field3948;
                                    field715.method6794(var68);
                                }
                                if (field660 > var9.field3972 && var9.field3866 != null) {
                                    class90 var69 = new class90();
                                    var69.field1086 = var9;
                                    var69.field1088 = var9.field3866;
                                    field715.method6794(var69);
                                }
                                if (field710 > var9.field3972 && var9.field3954 != null) {
                                    class90 var70 = new class90();
                                    var70.field1086 = var9;
                                    var70.field1088 = var9.field3954;
                                    field715.method6794(var70);
                                }
                                if (field728 > var9.field3972 && var9.field3955 != null) {
                                    class90 var71 = new class90();
                                    var71.field1086 = var9;
                                    var71.field1088 = var9.field3955;
                                    field715.method6794(var71);
                                }
                                if (field712 > var9.field3972 && var9.field3950 != null) {
                                    class90 var72 = new class90();
                                    var72.field1086 = var9;
                                    var72.field1088 = var9.field3950;
                                    field715.method6794(var72);
                                }
                                var9.field3972 = field696;
                                if (var9.field3832 != null) {
                                    for (int var73 = 0; var73 < field742; var73++) {
                                        class90 var74 = new class90();
                                        var74.field1086 = var9;
                                        var74.field1081 = field593[var73];
                                        var74.field1089 = field743[var73];
                                        var74.field1088 = var9.field3832;
                                        field715.method6794(var74);
                                    }
                                }
                                if (var9.field3841 != null) {
                                    int[] var75 = field729.method4038();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class90 var77 = new class90();
                                        var77.field1086 = var9;
                                        var77.field1081 = var75[var76];
                                        var77.field1088 = var9.field3841;
                                        field715.method6794(var77);
                                    }
                                }
                                if (var9.field3830 != null) {
                                    int[] var78 = field729.method4039();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class90 var80 = new class90();
                                        var80.field1086 = var9;
                                        var80.field1081 = var78[var79];
                                        var80.field1088 = var9.field3830;
                                        field715.method6794(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3915) {
                            if (field736 != null || field647) {
                                continue;
                            }
                            if ((var9.field3960 >= 0 || var9.field3859 != 0) && class36.field224 >= var19 && class36.field214 >= var20 && class36.field224 < var21 && class36.field214 < var22) {
                                if (var9.field3960 >= 0) {
                                    Statics.field1884 = arg0[var9.field3960];
                                } else {
                                    Statics.field1884 = var9;
                                }
                            }
                            if (var9.field3834 == 8 && class36.field224 >= var19 && class36.field214 >= var20 && class36.field224 < var21 && class36.field214 < var22) {
                                Statics.field467 = var9;
                            }
                            if (var9.field3856 > var9.field3848) {
                                method6775(var9, var9.field3847 + var11, var12, var9.field3848, var9.field3856, class36.field224, class36.field214);
                            }
                        }
                        if (var9.field3834 == 0) {
                            method255(arg0, var9.field3831, var19, var20, var21, var22, var11 - var9.field3977, var12 - var9.field3854);
                            if (var9.field3969 != null) {
                                method255(var9.field3969, var9.field3831, var19, var20, var21, var22, var11 - var9.field3977, var12 - var9.field3854);
                            }
                            class89 var81 = (class89) field673.method8464((long) var9.field3831);
                            if (var81 != null) {
                                if (var81.field1076 == 0 && class36.field224 >= var19 && class36.field214 >= var20 && class36.field224 < var21 && class36.field214 < var22 && !field647) {
                                    for (class90 var82 = (class90) field715.method6814(); var82 != null; var82 = (class90) field715.method6799()) {
                                        if (var82.field1084) {
                                            var82.method8130();
                                            var82.field1086.field3970 = false;
                                        }
                                    }
                                    if (Statics.field5048 == 0) {
                                        field736 = null;
                                        field685 = null;
                                    }
                                    if (!field647) {
                                        method839();
                                    }
                                }
                                method1106(var81.field1078, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.nn(II)Z")
    public static boolean method652(int arg0) {
        for (int var1 = 0; var1 < field742; var1++) {
            if (field593[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ee.nw(III)V")
    public static final void method2884(int arg0, int arg1) {
        if (Statics.field4650.method5890(arg0)) {
            method3867(Statics.field4650.field3741[arg0], arg1);
        }
    }

    @ObfuscatedName("iu.no([Lnx;IB)V")
    public static final void method3867(class359[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class359 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3834 == 0) {
                    if (var3.field3969 != null) {
                        method3867(var3.field3969, arg1);
                    }
                    class89 var4 = (class89) field673.method8464((long) var3.field3831);
                    if (var4 != null) {
                        method2884(var4.field1078, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3951 != null) {
                    class90 var5 = new class90();
                    var5.field1086 = var3;
                    var5.field1088 = var3.field3951;
                    class73.method2137(var5);
                }
                if (arg1 == 1 && var3.field3853 != null) {
                    if (var3.field3870 >= 0) {
                        class359 var6 = Statics.field4650.method5895(var3.field3831);
                        if (var6 == null || var6.field3969 == null || var3.field3870 >= var6.field3969.length || var6.field3969[var3.field3870] != var3) {
                            continue;
                        }
                    }
                    class90 var7 = new class90();
                    var7.field1086 = var3;
                    var7.field1088 = var3.field3853;
                    class73.method2137(var7);
                }
            }
        }
    }

    @ObfuscatedName("bp.nl(Lnx;III)V")
    public static final void method670(class359 arg0, int arg1, int arg2) {
        if (field736 != null || field647 || arg0 == null) {
            return;
        }
        class359 var3 = Statics.method1879(arg0);
        if (var3 == null) {
            var3 = arg0.field3914;
        }
        if (var3 == null) {
            return;
        }
        field736 = arg0;
        class359 var5 = Statics.method1879(arg0);
        if (var5 == null) {
            var5 = arg0.field3914;
        }
        field685 = var5;
        field628 = arg1;
        field700 = arg2;
        Statics.field5048 = 0;
        field695 = false;
        int var7 = field577 - 1;
        if (var7 != -1) {
            Statics.method3261(var7);
        }
        return;
    }

    @ObfuscatedName("client.nj(I)V")
    public final void method1206() {
        method7942(field736);
        Statics.field5048++;
        if (field692 && field689) {
            int var1 = class36.field224;
            int var2 = class36.field214;
            int var3 = var1 - field628;
            int var4 = var2 - field700;
            if (var3 < field690) {
                var3 = field690;
            }
            if (field736.field3847 + var3 > field690 + field685.field3847) {
                var3 = field690 + field685.field3847 - field736.field3847;
            }
            if (var4 < field506) {
                var4 = field506;
            }
            if (field736.field3848 + var4 > field506 + field685.field3848) {
                var4 = field506 + field685.field3848 - field736.field3848;
            }
            int var5 = var3 - field693;
            int var6 = var4 - field664;
            int var7 = field736.field3889;
            if (Statics.field5048 > field736.field3892 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field695 = true;
            }
            int var8 = field685.field3977 + (var3 - field690);
            int var9 = field685.field3854 + (var4 - field506);
            if (field736.field3909 != null && field695) {
                class90 var10 = new class90();
                var10.field1086 = field736;
                var10.field1083 = var8;
                var10.field1085 = var9;
                var10.field1088 = field736.field3909;
                class73.method2137(var10);
            }
            if (class36.field212 == 0) {
                if (field695) {
                    if (field736.field3929 != null) {
                        class90 var11 = new class90();
                        var11.field1086 = field736;
                        var11.field1083 = var8;
                        var11.field1085 = var9;
                        var11.field1087 = field691;
                        var11.field1088 = field736.field3929;
                        class73.method2137(var11);
                    }
                    if (field691 != null && Statics.method1879(field736) != null) {
                        class322 var12 = class322.method3236(class320.field3362, field653.field1456);
                        var12.field3394.method8912(field691.field3870);
                        var12.field3394.method8709(field736.field3831);
                        var12.field3394.method8938(field736.field3870);
                        var12.field3394.method8768(field691.field3965);
                        var12.field3394.method8714(field691.field3831);
                        var12.field3394.method8912(field736.field3965);
                        field653.method2773(var12);
                    }
                } else if (this.method1291()) {
                    this.method1203(field693 + field628, field700 + field664);
                } else if (field577 > 0) {
                    int var13 = field693 + field628;
                    int var14 = field700 + field664;
                    method4204(Statics.field1963, var13, var14);
                    Statics.field1963 = null;
                }
                field736 = null;
            }
        } else if (Statics.field5048 > 1) {
            if (!field695 && field577 > 0) {
                int var15 = field693 + field628;
                int var16 = field700 + field664;
                method4204(Statics.field1963, var15, var16);
                Statics.field1963 = null;
            }
            field736 = null;
        }
    }

    @ObfuscatedName("sv.nu(Lnx;I)V")
    public static void method7942(class359 arg0) {
        if (arg0 != null && field721 == arg0.field3871) {
            field722[arg0.field3976] = true;
        }
    }

    @ObfuscatedName("bi.nh(I)V")
    public static void method458() {
        for (class89 var0 = (class89) field673.method8467(); var0 != null; var0 = (class89) field673.method8471()) {
            int var1 = var0.field1078;
            if (Statics.field4650.method5890(var1)) {
                boolean var2 = true;
                class359[] var3 = Statics.field4650.field3741[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3915;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field5082;
                    class359 var6 = Statics.field4650.method5895(var5);
                    if (var6 != null) {
                        method7942(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fb.nq(II)V")
    public static final void method3017(int arg0) {
        if (!Statics.field4650.method5890(arg0)) {
            return;
        }
        class359[] var1 = Statics.field4650.field3741[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class359 var3 = var1[var2];
            if (var3 != null) {
                var3.field3872 = 0;
                var3.field3945 = 0;
            }
        }
    }

    @ObfuscatedName("rg.nd([Lnx;II)V")
    public static final void method7667(class359[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class359 var3 = arg0[var2];
            if (var3 != null && var3.field3851 == arg1 && (!var3.field3915 || !method3263(var3))) {
                if (var3.field3834 == 0) {
                    if (!var3.field3915 && method3263(var3) && Statics.field1884 != var3) {
                        continue;
                    }
                    method7667(arg0, var3.field3831);
                    if (var3.field3969 != null) {
                        method7667(var3.field3969, var3.field3831);
                    }
                    class89 var4 = (class89) field673.method8464((long) var3.field3831);
                    if (var4 != null) {
                        Statics.method3806(var4.field1078);
                    }
                }
                if (var3.field3834 == 6) {
                    if (var3.field3880 != -1 || var3.field3937 != -1) {
                        boolean var5 = method8594(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3937;
                        } else {
                            var6 = var3.field3880;
                        }
                        if (var6 != -1) {
                            class210 var7 = class210.method5910(var6);
                            if (var7.method3748()) {
                                var3.field3872 += field806;
                                int var8 = var7.method3757();
                                if (var3.field3872 >= var8) {
                                    var3.field3872 -= var7.field2295;
                                    if (var3.field3872 < 0 || var3.field3872 >= var8) {
                                        var3.field3872 = 0;
                                    }
                                }
                                method7942(var3);
                            } else {
                                var3.field3945 += field806;
                                while (var3.field3945 > var7.field2285[var3.field3872]) {
                                    var3.field3945 -= var7.field2285[var3.field3872];
                                    var3.field3872++;
                                    if (var3.field3872 >= var7.field2291.length) {
                                        var3.field3872 -= var7.field2295;
                                        if (var3.field3872 < 0 || var3.field3872 >= var7.field2291.length) {
                                            var3.field3872 = 0;
                                        }
                                    }
                                    method7942(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3944 != 0 && !var3.field3915) {
                        int var9 = var3.field3944 >> 16;
                        int var10 = var3.field3944 << 16 >> 16;
                        int var11 = field806 * var9;
                        int var12 = field806 * var10;
                        var3.field3884 = var3.field3884 + var11 & 0x7FF;
                        var3.field3885 = var3.field3885 + var12 & 0x7FF;
                        method7942(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gp.ne(II)V")
    public static final void method3199(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method3257((double) var3);
    }

    @ObfuscatedName("jm.ny(I)I")
    public static final int method4293() {
        float var0 = 200.0F * ((float) Statics.field1379.method2449() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("gx.ns(D)V")
    public static final void method3257(double arg0) {
        class278.method4760(arg0);
        ((class290) class278.field2877.field3195).method5188(arg0);
        if (Statics.field3175 != null) {
            Statics.field3175.method8266();
        }
        class208.field2213.method5500();
        Statics.field1379.method2509(arg0);
    }

    @ObfuscatedName("dg.nx(IB)V")
    public static final void method2164(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field1379.method2525()) {
            return;
        }
        if (Statics.field1379.method2525() == 0 && class331.method4203()) {
            class385 var2 = Statics.field2101;
            if (!class331.field3586.isEmpty()) {
                ArrayList var3 = new ArrayList();
                Iterator var4 = class331.field3586.iterator();
                while (var4.hasNext()) {
                    class343 var5 = (class343) var4.next();
                    var5.field3711 = false;
                    var5.field3710 = false;
                    var5.field3716 = false;
                    var5.field3713 = false;
                    var5.field3709 = var2;
                    var5.field3707 = var1;
                    var5.field3705 = 0.0F;
                    var3.add(var5);
                }
                class331.method8420(var3, class331.field3581, class331.field3590, class331.field3591, class331.field3587, false);
            }
            field762 = false;
        } else if (var1 == 0) {
            class331.method3026(0, 0);
            field762 = false;
        } else {
            class331.method296(var1);
        }
        Statics.field1379.method2461(var1);
    }

    @ObfuscatedName("es.ng(IB)V")
    public static final void method2646(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1379.method2458(var1);
    }

    @ObfuscatedName("fm.np(II)V")
    public static final void method3088(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field1379.method2460(var1);
    }

    @ObfuscatedName("dd.nr(IB)V")
    public static final void method2148(int arg0) {
        method458();
        class72.method4138();
        int var1 = class180.method3920(arg0).field1877;
        if (var1 == 0) {
            return;
        }
        int var2 = class347.field3731[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method3257(0.9D);
            }
            if (var2 == 2) {
                method3257(0.8D);
            }
            if (var2 == 3) {
                method3257(0.7D);
            }
            if (var2 == 4) {
                method3257(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method2164(255);
            }
            if (var2 == 1) {
                method2164(192);
            }
            if (var2 == 2) {
                method2164(128);
            }
            if (var2 == 3) {
                method2164(64);
            }
            if (var2 == 4) {
                method2164(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method2646(127);
            }
            if (var2 == 1) {
                method2646(96);
            }
            if (var2 == 2) {
                method2646(64);
            }
            if (var2 == 3) {
                method2646(32);
            }
            if (var2 == 4) {
                method2646(0);
            }
        }
        if (var1 == 5) {
            field781 = var2 == 1;
        }
        if (var1 == 6) {
            field612 = var2;
        }
        if (var1 == 9) {
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method3088(127);
            }
            if (var2 == 1) {
                method3088(96);
            }
            if (var2 == 2) {
                method3088(64);
            }
            if (var2 == 3) {
                method3088(32);
            }
            if (var2 == 4) {
                method3088(0);
            }
        }
        if (var1 == 17) {
            field681 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class107[] var3 = new class107[] { class107.field1382, class107.field1385, class107.field1386, class107.field1381, class107.field1383 };
            field793 = (class107) class402.method3799(var3, var2);
            if (field793 == null) {
                field793 = class107.field1381;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field531 = -1;
            } else {
                field531 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field766 = (class107) class402.method3799(class107.method3072(), var2);
            if (field766 == null) {
                field766 = class107.field1381;
            }
        }
    }

    @ObfuscatedName("bo.nb(Lnx;I)V")
    public static final void method447(class359 arg0) {
        int var1 = arg0.field3836;
        if (var1 == 324) {
            if (field791 == -1) {
                field791 = arg0.field3867;
                field666 = arg0.field3876;
            }
            if (field790.field3776 == 1) {
                arg0.field3867 = field791;
            } else {
                arg0.field3867 = field666;
            }
        } else if (var1 == 325) {
            if (field791 == -1) {
                field791 = arg0.field3867;
                field666 = arg0.field3876;
            }
            if (field790.field3776 == 1) {
                arg0.field3867 = field666;
            } else {
                arg0.field3867 = field791;
            }
        } else if (var1 == 327) {
            arg0.field3884 = 150;
            arg0.field3885 = (int) (Math.sin((double) field516 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3910 = 5;
            arg0.field3877 = 0;
        } else if (var1 == 328) {
            arg0.field3884 = 150;
            arg0.field3885 = (int) (Math.sin((double) field516 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3910 = 5;
            arg0.field3877 = 1;
        }
    }

    @ObfuscatedName("ej.nk(B)V")
    public static final void method2669() {
        class322 var0 = class322.method3236(class320.field3359, field653.field1456);
        field653.method2773(var0);
        class73.field871 = true;
        for (class89 var1 = (class89) field673.method8467(); var1 != null; var1 = (class89) field673.method8471()) {
            if (var1.field1076 == 0 || var1.field1076 == 3) {
                method6484(var1, true);
            }
        }
        if (field582 != null) {
            method7942(field582);
            field582 = null;
        }
        class73.field871 = false;
    }

    @ObfuscatedName("pk.on(IIII)Ldv;")
    public static final class89 method6689(int arg0, int arg1, int arg2) {
        class89 var3 = new class89();
        var3.field1078 = arg1;
        var3.field1076 = arg2;
        field673.method8470(var3, (long) arg0);
        method3017(arg1);
        class359 var4 = Statics.field4650.method5895(arg0);
        method7942(var4);
        if (field582 != null) {
            method7942(field582);
            field582 = null;
        }
        method4149(Statics.field4650.field3741[arg0 >> 16], var4, false);
        class73.method54(arg1);
        if (field567 != -1) {
            method2884(field567, 1);
        }
        return var3;
    }

    @ObfuscatedName("ou.oq(Ldv;ZI)V")
    public static final void method6484(class89 arg0, boolean arg1) {
        int var2 = arg0.field1078;
        int var3 = (int) arg0.field5082;
        arg0.method8130();
        if (arg1) {
            Statics.field4650.method5888(var2);
        }
        method8181(var2);
        class359 var4 = Statics.field4650.method5895(var3);
        if (var4 != null) {
            method7942(var4);
        }
        if (field567 != -1) {
            method2884(field567, 1);
        }
    }

    @ObfuscatedName("fj.ov(Lnx;I)Z")
    public static final boolean method3113(class359 arg0) {
        int var1 = arg0.field3836;
        if (var1 == 205) {
            field624 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field790.method5915(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field790.method5934(var4, var5 == 1);
        }
        if (var1 == 324) {
            field790.method5920(0);
        }
        if (var1 == 325) {
            field790.method5920(1);
        }
        if (var1 == 326) {
            class322 var6 = class322.method3236(class320.field3300, field653.field1456);
            field790.method5921(var6.field3394);
            field653.method2773(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ru.od(Lnx;IIIB)V")
    public static final void method7666(class359 arg0, int arg1, int arg2, int arg3) {
        method3115();
        class346 var4 = arg0.method6319(Statics.field4650, false);
        if (var4 == null) {
            return;
        }
        class557.method9105(arg1, arg2, var4.field3725 + arg1, var4.field3726 + arg2);
        if (field755 == 2 || field755 == 5) {
            class557.method9071(arg1, arg2, 0, var4.field3724, var4.field3727);
        } else {
            int var5 = field590 & 0x7FF;
            int var6 = 48 + Statics.field4085.method1165() / 32;
            int var7 = 464 - Statics.field4085.method1172() / 32;
            Statics.field2058.method9221(arg1, arg2, var4.field3725, var4.field3726, var6, var7, var5, 256, var4.field3724, var4.field3727);
            for (int var8 = 0; var8 < field513; var8++) {
                int var9 = field750[var8] * 4 + 2 - Statics.field4085.method1165() / 32;
                int var10 = field751[var8] * 4 + 2 - Statics.field4085.method1172() / 32;
                method6533(arg1, arg2, var9, var10, field555[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class407 var13 = Statics.field5138.field1335[Statics.field5138.field1319][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field4085.method1165() / 32;
                        int var15 = var12 * 4 + 2 - Statics.field4085.method1172() / 32;
                        method6533(arg1, arg2, var14, var15, Statics.field4822[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < Statics.field5138.field1330; var16++) {
                class104 var17 = Statics.field5138.field1316[Statics.field5138.field1331[var16]];
                if (var17 != null && var17.method2309()) {
                    class193 var18 = var17.field1348;
                    if (var18 != null && var18.field2014 != null) {
                        var18 = var18.method3408();
                    }
                    if (var18 != null && var18.field2025 && var18.field2022) {
                        int var19 = var17.field1229 / 32 - Statics.field4085.method1165() / 32;
                        int var20 = var17.field1192 / 32 - Statics.field4085.method1172() / 32;
                        method6533(arg1, arg2, var19, var20, Statics.field4822[1], var4);
                    }
                }
            }
            int var21 = Statics.field5138.field1320.field1405;
            int[] var22 = Statics.field5138.field1320.field1410;
            for (int var23 = 0; var23 < var21; var23++) {
                class94 var24 = Statics.field5138.field1327[var22[var23]];
                if (var24 != null && var24.method2309() && !var24.field1139 && Statics.field297 != var24) {
                    int var25 = var24.field1229 / 32 - Statics.field4085.method1165() / 32;
                    int var26 = var24.field1192 / 32 - Statics.field4085.method1172() / 32;
                    if (var24.method2296()) {
                        method6533(arg1, arg2, var25, var26, Statics.field4822[3], var4);
                    } else if (Statics.field297.field1144 != 0 && var24.field1144 != 0 && Statics.field297.field1144 == var24.field1144) {
                        method6533(arg1, arg2, var25, var26, Statics.field4822[4], var4);
                    } else if (var24.method2299()) {
                        method6533(arg1, arg2, var25, var26, Statics.field4822[5], var4);
                    } else if (var24.method2304()) {
                        method6533(arg1, arg2, var25, var26, Statics.field4822[6], var4);
                    } else {
                        method6533(arg1, arg2, var25, var26, Statics.field4822[2], var4);
                    }
                }
            }
            if (field525 != 0 && field516 % 20 < 10) {
                if (field525 == 1 && field795 >= 0 && field795 < Statics.field5138.field1316.length) {
                    class104 var27 = Statics.field5138.field1316[field795];
                    if (var27 != null) {
                        int var28 = var27.field1229 / 32 - Statics.field4085.method1165() / 32;
                        int var29 = var27.field1192 / 32 - Statics.field4085.method1172() / 32;
                        Statics.method168(arg1, arg2, var28, var29, Statics.field119[1], var4);
                    }
                }
                if (field525 == 2) {
                    int var30 = field528 * 4 - Statics.field5138.field1322 * 4 + 2 - Statics.field4085.method1165() / 32;
                    int var31 = field788 * 4 - Statics.field5138.field1324 * 4 + 2 - Statics.field4085.method1172() / 32;
                    Statics.method168(arg1, arg2, var30, var31, Statics.field119[1], var4);
                }
                if (field525 == 10 && field527 >= 0 && field527 < Statics.field5138.field1327.length) {
                    class94 var32 = Statics.field5138.field1327[field527];
                    if (var32 != null) {
                        int var33 = var32.field1229 / 32 - Statics.field4085.method1165() / 32;
                        int var34 = var32.field1192 / 32 - Statics.field4085.method1172() / 32;
                        Statics.method168(arg1, arg2, var33, var34, Statics.field119[1], var4);
                    }
                }
            }
            if (field753 != 0) {
                int var35 = field753 * 4 + 2 - Statics.field4085.method1165() / 32;
                int var36 = field754 * 4 + 2 - Statics.field4085.method1172() / 32;
                method6533(arg1, arg2, var35, var36, Statics.field119[0], var4);
            }
            if (!Statics.field297.field1139) {
                class557.method9060(var4.field3725 / 2 + arg1 - 1, var4.field3726 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field723[arg3] = true;
    }

    @ObfuscatedName("ik.op(Lnx;IIII)V")
    public static final void method3877(class359 arg0, int arg1, int arg2, int arg3) {
        class346 var4 = arg0.method6319(Statics.field4650, false);
        if (var4 == null) {
            return;
        }
        if (field755 < 3) {
            Statics.field811.method9221(arg1, arg2, var4.field3725, var4.field3726, 25, 25, field590, 256, var4.field3724, var4.field3727);
        } else {
            class557.method9071(arg1, arg2, 0, var4.field3724, var4.field3727);
        }
    }

    @ObfuscatedName("oz.or(IIIILvg;Lnw;I)V")
    public static final void method6533(int arg0, int arg1, int arg2, int arg3, class561 arg4, class346 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field590 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class278.field2878[var6];
        int var9 = class278.field2879[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method9237(arg5.field3725 / 2 + var10 - arg4.field5462 / 2, arg5.field3726 / 2 - var11 - arg4.field5463 / 2, arg0, arg1, arg5.field3725, arg5.field3726, arg5.field3724, arg5.field3727);
        } else {
            arg4.method9189(arg5.field3725 / 2 + arg0 + var10 - arg4.field5462 / 2, arg5.field3726 / 2 + arg1 - var11 - arg4.field5463 / 2);
        }
    }

    @ObfuscatedName("mc.ot(I)V")
    public static final void method5721() {
        for (int var0 = 0; var0 < Statics.field5138.field1320.field1405; var0++) {
            class94 var1 = Statics.field5138.field1327[Statics.field5138.field1320.field1410[var0]];
            var1.method2297();
        }
        Iterator var2 = class114.field1447.iterator();
        while (var2.hasNext()) {
            class65 var3 = (class65) var2.next();
            var3.method1143();
        }
        if (Statics.field382 != null) {
            Statics.field382.method7782();
        }
    }

    @ObfuscatedName("fy.oy(I)V")
    public static final void method3108() {
        Iterator var0 = class114.field1447.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1125();
        }
        if (Statics.field382 != null) {
            Statics.field382.method7789();
        }
    }

    @ObfuscatedName("tg.oi(I)V")
    public static final void method8121() {
        field706 = field696;
    }

    @ObfuscatedName("rw.of(I)V")
    public static final void method7711() {
        field804 = field696;
        Statics.field1843 = true;
    }

    @ObfuscatedName("pl.om(I)V")
    public static final void method6777() {
        field708 = field696;
        Statics.field4577 = true;
    }

    @ObfuscatedName("ek.og(Ljava/lang/String;B)V")
    public static final void method2766(String arg0) {
        if (Statics.field382 != null) {
            class322 var1 = class322.method3236(class320.field3360, field653.field1456);
            var1.field3394.method8711(class547.method2396(arg0));
            var1.field3394.method8718(arg0);
            field653.method2773(var1);
        }
    }

    @ObfuscatedName("ek.oc(I)V")
    public static final void method2769() {
        class322 var0 = class322.method3236(class320.field3366, field653.field1456);
        var0.field3394.method8711(0);
        field653.method2773(var0);
    }

    @ObfuscatedName("ex.os(III)V")
    public static final void method2666(int arg0, int arg1) {
        class168 var2 = arg0 >= 0 ? field747[arg0] : Statics.field2869;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3223()) {
            return;
        }
        class150 var3 = (class150) var2.field1820.get(arg1);
        if (var3.field1704 != -1) {
            return;
        }
        String var4 = var3.field1702.method9347();
        class322 var5 = class322.method3236(class320.field3376, field653.field1456);
        var5.field3394.method8711(3 + class547.method2396(var4));
        var5.field3394.method8711(arg0);
        var5.field3394.method8712(arg1);
        var5.field3394.method8718(var4);
        field653.method2773(var5);
    }

    @ObfuscatedName("ln.ox(III)V")
    public static final void method5230(int arg0, int arg1) {
        if (field747[arg0] == null || arg1 < 0 || arg1 >= field747[arg0].method3223()) {
            return;
        }
        class150 var2 = (class150) field747[arg0].field1820.get(arg1);
        if (var2.field1704 != -1) {
            return;
        }
        class322 var3 = class322.method3236(class320.field3287, field653.field1456);
        var3.field3394.method8711(3 + class547.method2396(var2.field1702.method9347()));
        var3.field3394.method8711(arg0);
        var3.field3394.method8712(arg1);
        var3.field3394.method8718(var2.field1702.method9347());
        field653.method2773(var3);
    }

    @ObfuscatedName("ez.oa(IIZI)V")
    public static final void method2832(int arg0, int arg1, boolean arg2) {
        if (field747[arg0] == null || arg1 < 0 || arg1 >= field747[arg0].method3223()) {
            return;
        }
        class150 var3 = (class150) field747[arg0].field1820.get(arg1);
        class322 var4 = class322.method3236(class320.field3349, field653.field1456);
        var4.field3394.method8711(4 + class547.method2396(var3.field1702.method9347()));
        var4.field3394.method8711(arg0);
        var4.field3394.method8712(arg1);
        var4.field3394.method8729(arg2);
        var4.field3394.method8718(var3.field1702.method9347());
        field653.method2773(var4);
    }

    @ObfuscatedName("tq.ow(IB)V")
    public static void method8181(int arg0) {
        for (class504 var1 = (class504) field744.method8467(); var1 != null; var1 = (class504) field744.method8471()) {
            if ((var1.field5082 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method8130();
            }
        }
    }

    @ObfuscatedName("gj.ou(Lnx;I)I")
    public static int method3224(class359 arg0) {
        class504 var1 = (class504) field744.method8464(((long) arg0.field3831 << 32) + (long) arg0.field3870);
        return var1 == null ? arg0.field3906 : var1.field5080;
    }

    @ObfuscatedName("gd.ol(Lnx;I)Z")
    public static boolean method3263(class359 arg0) {
        return arg0.field3852;
    }

    @ObfuscatedName("ft.oh(Lnx;I)Ljava/lang/String;")
    public static String method3042(class359 arg0) {
        if (Statics.method5458(method3224(arg0)) == 0) {
            return null;
        } else if (arg0.field3918 == null || arg0.field3918.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3918;
        }
    }

    @ObfuscatedName("cy.ok(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method1174(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field502 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field502 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field502 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field502 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field502 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field82 != null) {
            var3 = "/p=" + Statics.field82;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1514 + "/a=" + Statics.field2084 + var3 + "/";
    }

    @ObfuscatedName("em.oe(Ljava/lang/String;I)V")
    public static void method2849(String arg0) {
        Statics.field82 = arg0;
        try {
            String var1 = Statics.field4675.getParameter(Integer.toString(18));
            String var2 = Statics.field4675.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class362.method3099(class327.method4500() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field4675;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("aj.oj(Ljava/lang/String;ZI)V")
    public static void method36(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field917; var5++) {
            class208 var6 = class208.method3193(var5);
            if ((!arg1 || var6.field2261) && var6.field2252 == -1 && var6.field2216.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1079 = -1;
                    Statics.field2548 = null;
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
        Statics.field2548 = var3;
        Statics.field908 = 0;
        Statics.field1079 = var4;
        String[] var9 = new String[Statics.field1079];
        for (int var10 = 0; var10 < Statics.field1079; var10++) {
            var9[var10] = class208.method3193(var3[var10]).field2216;
        }
        class542.method3260(var9, Statics.field2548);
    }

    @ObfuscatedName("hi.pj(Lvp;IB)V")
    public static void method3497(class547 arg0, int arg1) {
        byte[] var2 = arg0.field5364;
        if (field564 == null) {
            field564 = new byte[24];
        }
        class448.method7595(var2, arg1, field564, 0, 24);
        class218.method3791(arg0, arg1);
    }

    @ObfuscatedName("bn.pv(Lvp;I)V")
    public static void method843(class547 arg0) {
        if (field564 != null) {
            arg0.method8721(field564, 0, field564.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class218.field2361.method8529(0L);
            class218.field2361.method8545(var1);
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
        arg0.method8721(var1, 0, var1.length);
    }

    @ObfuscatedName("client.pn(I)Lvo;")
    public class569 method1207() {
        return Statics.field297 == null ? null : Statics.field297.field1137;
    }

    @ObfuscatedName("dx.pk(IIIZI)V")
    public static void method2582(int arg0, int arg1, int arg2, boolean arg3) {
        class322 var4 = class322.method3236(class320.field3339, field653.field1456);
        var4.field3394.method8912(arg0);
        var4.field3394.method8938(arg1);
        var4.field3394.method8759(arg2);
        var4.field3394.method8780(arg3 ? field602 : 0);
        field653.method2773(var4);
    }

    @ObfuscatedName("ee.py(I)Z")
    public static boolean method2885() {
        return field680 >= 2;
    }

    @ObfuscatedName("hu.pm(II)V")
    public static void method3507(int arg0) {
        field595 = arg0;
    }

    @ObfuscatedName("fn.ps(B)V")
    public static void method3097() {
        field653.method2773(class322.method3236(class320.field3353, field653.field1456));
        field595 = 0;
    }

    @ObfuscatedName("ir.px(B)V")
    public static void method4031() {
        if (field595 == 1) {
            field713 = true;
        }
    }

    @ObfuscatedName("ty.pb(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method8419(String arg0) {
        class382[] var1 = class382.method3016();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class382 var3 = var1[var2];
            if (var3.field4453 != -1 && arg0.startsWith(class105.method6534(var3.field4453))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4453).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("jf.ph(B)V")
    public static void method4124() {
        if (Statics.field5031 == null) {
            return;
        }
        field800 = field516;
        Statics.field5031.method6730();
        for (int var0 = 0; var0 < Statics.field5138.field1327.length; var0++) {
            if (Statics.field5138.field1327[var0] != null) {
                Statics.field5031.method6733((Statics.field5138.field1327[var0].field1229 >> 7) + Statics.field5138.field1322, (Statics.field5138.field1327[var0].field1192 >> 7) + Statics.field5138.field1324);
            }
        }
    }

    @ObfuscatedName("be.pc(Lcy;I)V")
    public static void method430(class69 arg0) {
        if (Statics.field1573 != arg0) {
            Statics.field1573 = arg0;
        }
    }

    @ObfuscatedName("gh.pp(ZS)V")
    public static void method3231(boolean arg0) {
        field781 = arg0;
    }

    @ObfuscatedName("os.pe(II)Luh;")
    public static class539 method6456(int arg0) {
        class539 var1 = (class539) field797.method5495((long) arg0);
        if (var1 == null) {
            var1 = new class539(Statics.field2676, class541.method3185(arg0), class541.method6964(arg0));
            field797.method5498(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("gx.pl(IB)Luh;")
    public static class539 method3258(int arg0) {
        class539 var1 = (class539) field798.method5495((long) arg0);
        if (var1 == null) {
            var1 = new class539(Statics.field2676, arg0);
        }
        return var1;
    }

    @ObfuscatedName("gy.po(II)V")
    public static void method3281(int arg0) {
        class210 var1 = class210.method5910(arg0);
        if (var1.method3748() && class210.method5516(var1.field2287) == 2) {
            field801.add(var1.field2287);
        }
    }

    @ObfuscatedName("fs.pz(I)Loe;")
    public static class389 method3085() {
        return Statics.field2487;
    }

    @ObfuscatedName("client.pr(II)V")
    public void method1208(int arg0) {
        class322 var2 = class322.method3236(class320.field3281, field653.field1456);
        var2.field3394.method8711(arg0);
        field653.method2773(var2);
    }

    @ObfuscatedName("client.pg(IS)V")
    public void method1313(int arg0) {
        class322 var2 = class322.method3236(class320.field3331, field653.field1456);
        var2.field3394.method8711(arg0);
        field653.method2773(var2);
    }
}

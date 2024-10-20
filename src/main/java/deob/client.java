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
import java.util.concurrent.Future;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class469, OAuthApi, class340 {

    @ObfuscatedName("client.be")
    public static boolean field789 = true;

    @ObfuscatedName("client.cq")
    public static int field502 = 1;

    @ObfuscatedName("client.cb")
    public static int field503 = 0;

    @ObfuscatedName("client.ci")
    public static int field530 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field794 = false;

    @ObfuscatedName("client.cl")
    public static boolean field506 = false;

    @ObfuscatedName("client.ce")
    public static int field538 = -1;

    @ObfuscatedName("client.cg")
    public static int field564 = -1;

    @ObfuscatedName("client.cx")
    public static int field509 = -1;

    @ObfuscatedName("client.cz")
    public static boolean field765 = false;

    @ObfuscatedName("client.dd")
    public static boolean field511;

    @ObfuscatedName("client.dc")
    public static boolean field619;

    @ObfuscatedName("client.da")
    public static int field551;

    @ObfuscatedName("client.dr")
    public static boolean field514;

    @ObfuscatedName("client.dh")
    public static boolean field597;

    @ObfuscatedName("client.dm")
    public static boolean field517;

    @ObfuscatedName("client.dt")
    public static int field518;

    @ObfuscatedName("client.dx")
    public static int field519;

    @ObfuscatedName("client.ds")
    public static long field520;

    @ObfuscatedName("client.dv")
    public static int field707;

    @ObfuscatedName("client.dj")
    public static int field724;

    @ObfuscatedName("client.dp")
    public static long field523;

    @ObfuscatedName("client.dy")
    public static boolean field524;

    @ObfuscatedName("client.do")
    public static int field525;

    @ObfuscatedName("client.dw")
    public static int field526;

    @ObfuscatedName("client.de")
    public static int field677;

    @ObfuscatedName("client.dz")
    public static int field528;

    @ObfuscatedName("client.di")
    public static int field529;

    @ObfuscatedName("client.dn")
    public static int field725;

    @ObfuscatedName("client.eg")
    public static int field622;

    @ObfuscatedName("client.ev")
    public static int field532;

    @ObfuscatedName("client.eh")
    public static int field533;

    @ObfuscatedName("client.ey")
    public static class109 field534;

    @ObfuscatedName("client.ec")
    public static class109 field535;

    @ObfuscatedName("client.er")
    public static boolean field536;

    @ObfuscatedName("client.ei")
    public static class96 field537;

    @ObfuscatedName("client.eq")
    public static int field501;

    @ObfuscatedName("client.eb")
    public static int field539;

    @ObfuscatedName("client.ff")
    public static int field540;

    @ObfuscatedName("client.fs")
    public static int field541;

    @ObfuscatedName("client.fz")
    public static int field542;

    @ObfuscatedName("client.fy")
    public static int field543;

    @ObfuscatedName("client.fi")
    public static class131 field531;

    @ObfuscatedName("client.gp")
    public static class563 field617;

    @ObfuscatedName("client.gx")
    public String field546;

    @ObfuscatedName("client.gw")
    public class15 field576;

    @ObfuscatedName("client.gr")
    public class19 field548;

    @ObfuscatedName("client.gm")
    public OtlTokenRequester field549;

    @ObfuscatedName("client.go")
    public Future field550;

    @ObfuscatedName("client.gi")
    public boolean field688 = false;

    @ObfuscatedName("client.gz")
    public int field686 = 0;

    @ObfuscatedName("client.gq")
    public class19 field553;

    @ObfuscatedName("client.gu")
    public RefreshAccessTokenRequester field554;

    @ObfuscatedName("client.gt")
    public Future field645;

    @ObfuscatedName("client.gs")
    public static final String field556;

    @ObfuscatedName("client.ge")
    public static final String field613;

    @ObfuscatedName("client.hy")
    public static boolean field791;

    @ObfuscatedName("client.hk")
    public static class81 field756;

    @ObfuscatedName("client.hl")
    public static int[] field560;

    @ObfuscatedName("client.hx")
    public class558 field632;

    @ObfuscatedName("client.hj")
    public class8 field562;

    @ObfuscatedName("client.hv")
    public long field563 = -1L;

    @ObfuscatedName("client.hz")
    public static byte[] field635;

    @ObfuscatedName("client.hh")
    public static int field565;

    @ObfuscatedName("client.hb")
    public static int[] field803;

    @ObfuscatedName("client.in")
    public static final class117 field784;

    @ObfuscatedName("client.ii")
    public static int field568;

    @ObfuscatedName("client.ia")
    public static boolean field527;

    @ObfuscatedName("client.iw")
    public static class456 field570;

    @ObfuscatedName("client.if")
    public static HashMap field571;

    @ObfuscatedName("client.it")
    public static String field660;

    @ObfuscatedName("client.ib")
    public static int field654;

    @ObfuscatedName("client.ij")
    public static int field573;

    @ObfuscatedName("client.ie")
    public static int field572;

    @ObfuscatedName("client.im")
    public static int field575;

    @ObfuscatedName("client.is")
    public static int field515;

    @ObfuscatedName("client.jb")
    public static int[][][] field577;

    @ObfuscatedName("client.jv")
    public static class98 field684;

    @ObfuscatedName("client.ja")
    public static boolean field651;

    @ObfuscatedName("client.jo")
    public static int[][][] field746;

    @ObfuscatedName("client.jk")
    public static final int[] field581;

    @ObfuscatedName("client.je")
    public static int field735;

    @ObfuscatedName("client.jp")
    public static class113 field583;

    @ObfuscatedName("client.jh")
    public static int field584;

    @ObfuscatedName("client.kl")
    public static int field585;

    @ObfuscatedName("client.ke")
    public static int field679;

    @ObfuscatedName("client.kj")
    public static int field715;

    @ObfuscatedName("client.kt")
    public static int field557;

    @ObfuscatedName("client.kk")
    public static boolean field589;

    @ObfuscatedName("client.kq")
    public static int field590;

    @ObfuscatedName("client.kp")
    public static int field552;

    @ObfuscatedName("client.kb")
    public static int field592;

    @ObfuscatedName("client.lu")
    public static int field593;

    @ObfuscatedName("client.lf")
    public static int field594;

    @ObfuscatedName("client.li")
    public static int field595;

    @ObfuscatedName("client.lm")
    public static int field596;

    @ObfuscatedName("client.lh")
    public static int field797;

    @ObfuscatedName("client.lw")
    public static int field598;

    @ObfuscatedName("client.lr")
    public static int field599;

    @ObfuscatedName("client.ld")
    public static int field547;

    @ObfuscatedName("client.lp")
    public static int field601;

    @ObfuscatedName("client.lo")
    public static int field602;

    @ObfuscatedName("client.lb")
    public static int field603;

    @ObfuscatedName("client.lt")
    public static int field604;

    @ObfuscatedName("client.lx")
    public static boolean field787;

    @ObfuscatedName("client.lc")
    public static int field606;

    @ObfuscatedName("client.lv")
    public static boolean field607;

    @ObfuscatedName("client.lq")
    public static int field608;

    @ObfuscatedName("client.ll")
    public static int field609;

    @ObfuscatedName("client.lj")
    public static int field610;

    @ObfuscatedName("client.lz")
    public static int[] field611;

    @ObfuscatedName("client.la")
    public static int[] field612;

    @ObfuscatedName("client.ln")
    public static int[] field516;

    @ObfuscatedName("client.le")
    public static int[] field614;

    @ObfuscatedName("client.mg")
    public static int[] field569;

    @ObfuscatedName("client.ml")
    public static int[] field616;

    @ObfuscatedName("client.mo")
    public static int[][] field666;

    @ObfuscatedName("client.mi")
    public static int[] field618;

    @ObfuscatedName("client.mu")
    public static String[] field567;

    @ObfuscatedName("client.mf")
    public static int field544;

    @ObfuscatedName("client.mr")
    public static int field621;

    @ObfuscatedName("client.mb")
    public static int field600;

    @ObfuscatedName("client.mh")
    public static int field623;

    @ObfuscatedName("client.mt")
    public static int field624;

    @ObfuscatedName("client.mm")
    public static int field625;

    @ObfuscatedName("client.mj")
    public static int field626;

    @ObfuscatedName("client.ms")
    public static boolean field728;

    @ObfuscatedName("client.mv")
    public static int field628;

    @ObfuscatedName("client.mz")
    public static boolean field690;

    @ObfuscatedName("client.ma")
    public static int field630;

    @ObfuscatedName("client.md")
    public static int field631;

    @ObfuscatedName("client.mq")
    public static long field657;

    @ObfuscatedName("client.mp")
    public static long field633;

    @ObfuscatedName("client.mn")
    public static String field634;

    @ObfuscatedName("client.np")
    public static int field521;

    @ObfuscatedName("client.nt")
    public static boolean field636;

    @ObfuscatedName("client.ni")
    public static int field637;

    @ObfuscatedName("client.ns")
    public static int field638;

    @ObfuscatedName("client.nw")
    public static int[] field639;

    @ObfuscatedName("client.nn")
    public static final int[] field640;

    @ObfuscatedName("client.nj")
    public static String[] field641;

    @ObfuscatedName("client.nm")
    public static boolean[] field642;

    @ObfuscatedName("client.ny")
    public static int[] field643;

    @ObfuscatedName("client.nk")
    public static int field644;

    @ObfuscatedName("client.nc")
    public static int[] field680;

    @ObfuscatedName("client.nd")
    public static int[] field646;

    @ObfuscatedName("client.na")
    public static int[] field647;

    @ObfuscatedName("client.ne")
    public static int[] field648;

    @ObfuscatedName("client.nz")
    public static boolean field620;

    @ObfuscatedName("client.nr")
    public static boolean field650;

    @ObfuscatedName("client.ng")
    public static class577 field561;

    @ObfuscatedName("client.nl")
    public static boolean field578;

    @ObfuscatedName("client.oh")
    public static boolean field695;

    @ObfuscatedName("client.oe")
    public static boolean field696;

    @ObfuscatedName("client.ox")
    public static int field655;

    @ObfuscatedName("client.oa")
    public static int field656;

    @ObfuscatedName("client.oi")
    public static int field545;

    @ObfuscatedName("client.ov")
    public static int field658;

    @ObfuscatedName("client.oq")
    public static int field659;

    @ObfuscatedName("client.os")
    public static boolean field661;

    @ObfuscatedName("client.oy")
    public static int field662;

    @ObfuscatedName("client.ot")
    public static int field663;

    @ObfuscatedName("client.oj")
    public static String field664;

    @ObfuscatedName("client.ou")
    public static String field513;

    @ObfuscatedName("client.og")
    public static int field723;

    @ObfuscatedName("client.om")
    public static class531 field667;

    @ObfuscatedName("client.or")
    public static int field668;

    @ObfuscatedName("client.oz")
    public static int field669;

    @ObfuscatedName("client.pg")
    public static int field670;

    @ObfuscatedName("client.pe")
    public static class362 field671;

    @ObfuscatedName("client.pk")
    public static int field672;

    @ObfuscatedName("client.pt")
    public static int field652;

    @ObfuscatedName("client.pw")
    public static int field674;

    @ObfuscatedName("client.pq")
    public static int field675;

    @ObfuscatedName("client.pc")
    public static boolean field676;

    @ObfuscatedName("client.pl")
    public static class362 field673;

    @ObfuscatedName("client.pr")
    public static class362 field678;

    @ObfuscatedName("client.pv")
    public static class362 field758;

    @ObfuscatedName("client.pj")
    public static int field760;

    @ObfuscatedName("client.pp")
    public static int field681;

    @ObfuscatedName("client.po")
    public static class362 field682;

    @ObfuscatedName("client.px")
    public static boolean field559;

    @ObfuscatedName("client.ph")
    public static int field759;

    @ObfuscatedName("client.pi")
    public static int field685;

    @ObfuscatedName("client.pn")
    public static boolean field692;

    @ObfuscatedName("client.pa")
    public static int field687;

    @ObfuscatedName("client.pd")
    public static int field522;

    @ObfuscatedName("client.pm")
    public static boolean field689;

    @ObfuscatedName("client.pb")
    public static int field555;

    @ObfuscatedName("client.qf")
    public static int[] field691;

    @ObfuscatedName("client.qn")
    public static int field615;

    @ObfuscatedName("client.qu")
    public static int[] field800;

    @ObfuscatedName("client.qq")
    public static int field779;

    @ObfuscatedName("client.qo")
    public static int[] field629;

    @ObfuscatedName("client.qj")
    public static int field510;

    @ObfuscatedName("client.qg")
    public static int[] field697;

    @ObfuscatedName("client.qv")
    public static int field698;

    @ObfuscatedName("client.qw")
    public static int field665;

    @ObfuscatedName("client.qt")
    public static int field587;

    @ObfuscatedName("client.qp")
    public static int field701;

    @ObfuscatedName("client.qs")
    public static int field702;

    @ObfuscatedName("client.qh")
    public static int field703;

    @ObfuscatedName("client.qc")
    public static int field704;

    @ObfuscatedName("client.qy")
    public static int field705;

    @ObfuscatedName("client.qx")
    public static int field706;

    @ObfuscatedName("client.qm")
    public static int field694;

    @ObfuscatedName("client.qa")
    public static class576 field708;

    @ObfuscatedName("client.qb")
    public static class411 field512;

    @ObfuscatedName("client.qe")
    public static class411 field788;

    @ObfuscatedName("client.rj")
    public static class411 field711;

    @ObfuscatedName("client.rk")
    public static class411 field712;

    @ObfuscatedName("client.ry")
    public static class531 field713;

    @ObfuscatedName("client.rt")
    public static int field714;

    @ObfuscatedName("client.ri")
    public static int field591;

    @ObfuscatedName("client.ra")
    public static boolean[] field716;

    @ObfuscatedName("client.rd")
    public static boolean[] field717;

    @ObfuscatedName("client.rc")
    public static boolean[] field718;

    @ObfuscatedName("client.rb")
    public static int[] field719;

    @ObfuscatedName("client.rh")
    public static int[] field566;

    @ObfuscatedName("client.ru")
    public static int[] field721;

    @ObfuscatedName("client.rx")
    public static int[] field722;

    @ObfuscatedName("client.rf")
    public static int field653;

    @ObfuscatedName("client.ro")
    public static long field773;

    @ObfuscatedName("client.re")
    public static boolean field740;

    @ObfuscatedName("client.rg")
    public static int field726;

    @ObfuscatedName("client.rs")
    public static int field727;

    @ObfuscatedName("client.rw")
    public static int[] field772;

    @ObfuscatedName("client.rr")
    public static int field729;

    @ObfuscatedName("client.ss")
    public static int field730;

    @ObfuscatedName("client.st")
    public static String field731;

    @ObfuscatedName("client.su")
    public static long[] field732;

    @ObfuscatedName("client.sp")
    public static int field733;

    @ObfuscatedName("client.se")
    public static class270 field734;

    @ObfuscatedName("client.si")
    public static class268 field755;

    @ObfuscatedName("client.sr")
    public static int field736;

    @ObfuscatedName("client.sv")
    public static int[] field737;

    @ObfuscatedName("client.sg")
    public static int[] field738;

    @ObfuscatedName("client.so")
    public static long field710;

    @ObfuscatedName("client.sc")
    public static class162[] field776;

    @ObfuscatedName("client.sw")
    public static class171[] field741;

    @ObfuscatedName("client.sm")
    public static int field579;

    @ObfuscatedName("client.sn")
    public static int field743;

    @ObfuscatedName("client.sl")
    public static int[] field744;

    @ObfuscatedName("client.sf")
    public static int[] field745;

    @ObfuscatedName("client.sx")
    public static class572[] field693;

    @ObfuscatedName("client.sa")
    public static int field747;

    @ObfuscatedName("client.tt")
    public static int field748;

    @ObfuscatedName("client.tf")
    public static int field771;

    @ObfuscatedName("client.tz")
    public static boolean field750;

    @ObfuscatedName("client.ty")
    public static int field751;

    @ObfuscatedName("client.tm")
    public static int[] field504;

    @ObfuscatedName("client.tn")
    public static int[] field753;

    @ObfuscatedName("client.tp")
    public static int[] field754;

    @ObfuscatedName("client.tc")
    public static int[] field752;

    @ObfuscatedName("client.td")
    public static int[] field574;

    @ObfuscatedName("client.tb")
    public static class40[] field757;

    @ObfuscatedName("client.to")
    public static boolean field586;

    @ObfuscatedName("client.uw")
    public static boolean field649;

    @ObfuscatedName("client.ug")
    public static boolean field739;

    @ObfuscatedName("client.ub")
    public static boolean field761;

    @ObfuscatedName("client.um")
    public static class522 field762;

    @ObfuscatedName("client.ud")
    public static class521 field505;

    @ObfuscatedName("client.ut")
    public static class521 field764;

    @ObfuscatedName("client.uv")
    public static boolean field749;

    @ObfuscatedName("client.uo")
    public static boolean[] field766;

    @ObfuscatedName("client.uf")
    public static int[] field767;

    @ObfuscatedName("client.uz")
    public static int[] field768;

    @ObfuscatedName("client.ua")
    public static int[] field769;

    @ObfuscatedName("client.ui")
    public static int[] field683;

    @ObfuscatedName("client.uk")
    public static short field588;

    @ObfuscatedName("client.vb")
    public static short field580;

    @ObfuscatedName("client.vn")
    public static short field558;

    @ObfuscatedName("client.vd")
    public static short field774;

    @ObfuscatedName("client.vf")
    public static short field775;

    @ObfuscatedName("client.vi")
    public static short field763;

    @ObfuscatedName("client.vy")
    public static short field777;

    @ObfuscatedName("client.vo")
    public static short field778;

    @ObfuscatedName("client.vu")
    public static int field709;

    @ObfuscatedName("client.vr")
    public static int field780;

    @ObfuscatedName("client.vw")
    public static int field781;

    @ObfuscatedName("client.vm")
    public static int field582;

    @ObfuscatedName("client.vl")
    public static int field783;

    @ObfuscatedName("client.vk")
    public static final class359 field605;

    @ObfuscatedName("client.vh")
    public static int field785;

    @ObfuscatedName("client.vs")
    public static int field786;

    @ObfuscatedName("client.vg")
    public static class518 field795;

    @ObfuscatedName("client.vj")
    public static class401[] field700;

    @ObfuscatedName("client.vq")
    public static class67 field627;

    @ObfuscatedName("client.vc")
    public static class466 field790;

    @ObfuscatedName("client.wk")
    public static class316 field782;

    @ObfuscatedName("client.wc")
    public static class316 field792;

    @ObfuscatedName("client.ww")
    public static int field793;

    @ObfuscatedName("client.wp")
    public static int field801;

    @ObfuscatedName("client.wa")
    public static List field799;

    @ObfuscatedName("client.wi")
    public static final class278 field796;

    @ObfuscatedName("client.wg")
    public static int field508;

    @ObfuscatedName("client.wt")
    public static ArrayList field798;

    @ObfuscatedName("client.wf")
    public static int field699;

    @ObfuscatedName("client.wu")
    public static int field742;

    @ObfuscatedName("client.wv")
    public static final class66 field770;

    @ObfuscatedName("client.xe")
    public static int[] field802;

    @ObfuscatedName("client.xg")
    public static int[] field507;

    static {
        class556.field5458 = 226;
        field511 = false;
        field619 = false;
        field551 = 0;
        field514 = false;
        field597 = false;
        field517 = true;
        field518 = 0;
        field519 = 0;
        field520 = 1L;
        field707 = -1;
        field724 = -1;
        field523 = -1L;
        field524 = true;
        field525 = 0;
        field526 = 0;
        field677 = 0;
        field528 = 0;
        field529 = 0;
        field725 = 0;
        field622 = 0;
        field532 = 0;
        field533 = 0;
        field534 = class109.field1395;
        field535 = class109.field1395;
        field536 = false;
        field537 = class96.field1166;
        field501 = 0;
        field539 = 0;
        field540 = 0;
        field541 = 0;
        field542 = 0;
        field543 = 0;
        field531 = class131.field1537;
        field617 = class563.field5523;
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
        byte[] var5 = var1;
        int var6 = var1.length;
        StringBuilder var7 = new StringBuilder();
        for (int var8 = 0; var8 < var6; var8 += 3) {
            int var9 = var5[var8] & 0xFF;
            var7.append(class419.field4746[var9 >>> 2]);
            if (var8 < var6 - 1) {
                int var10 = var5[var8 + 1] & 0xFF;
                var7.append(class419.field4746[(var9 & 0x3) << 4 | var10 >>> 4]);
                if (var8 < var6 - 2) {
                    int var11 = var5[var8 + 2] & 0xFF;
                    var7.append(class419.field4746[(var10 & 0xF) << 2 | var11 >>> 6]).append(class419.field4746[var11 & 0x3F]);
                } else {
                    var7.append(class419.field4746[(var10 & 0xF) << 2]).append("=");
                }
            } else {
                var7.append(class419.field4746[(var9 & 0x3) << 4]).append("==");
            }
        }
        String var12 = var7.toString();
        field556 = var12;
        int var14 = "com_jagex_auth_desktop_runelite:public".length();
        byte[] var15 = new byte[var14];
        for (int var16 = 0; var16 < var14; var16++) {
            char var17 = "com_jagex_auth_desktop_runelite:public".charAt(var16);
            if (var17 > 127) {
                var15[var16] = 63;
            } else {
                var15[var16] = (byte) var17;
            }
        }
        byte[] var19 = var15;
        int var20 = var15.length;
        StringBuilder var21 = new StringBuilder();
        for (int var22 = 0; var22 < var20; var22 += 3) {
            int var23 = var19[var22] & 0xFF;
            var21.append(class419.field4746[var23 >>> 2]);
            if (var22 < var20 - 1) {
                int var24 = var19[var22 + 1] & 0xFF;
                var21.append(class419.field4746[(var23 & 0x3) << 4 | var24 >>> 4]);
                if (var22 < var20 - 2) {
                    int var25 = var19[var22 + 2] & 0xFF;
                    var21.append(class419.field4746[(var24 & 0xF) << 2 | var25 >>> 6]).append(class419.field4746[var25 & 0x3F]);
                } else {
                    var21.append(class419.field4746[(var24 & 0xF) << 2]).append("=");
                }
            } else {
                var21.append(class419.field4746[(var23 & 0x3) << 4]).append("==");
            }
        }
        String var26 = var21.toString();
        field613 = var26;
        field791 = false;
        field756 = new class81();
        field560 = new int[4];
        field635 = null;
        field565 = 0;
        field803 = new int[250];
        field784 = new class117();
        field568 = 0;
        field527 = false;
        field570 = new class456();
        field571 = new HashMap();
        field654 = 0;
        field573 = 1;
        field572 = 0;
        field575 = 1;
        field515 = 0;
        field577 = new int[4][13][13];
        field684 = new class98();
        field651 = false;
        field746 = new int[4][13][13];
        field581 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field735 = -1;
        field583 = new class113();
        field584 = 0;
        field585 = 2301979;
        field679 = 5063219;
        field715 = 3353893;
        field557 = 7759444;
        field589 = false;
        field590 = 0;
        field552 = 128;
        field592 = 0;
        field593 = 0;
        field594 = 0;
        field595 = 0;
        field596 = 0;
        field797 = 0;
        field598 = 50;
        field599 = 0;
        field547 = 0;
        field601 = 0;
        field602 = 12;
        field603 = 6;
        field604 = 0;
        field787 = false;
        field606 = 0;
        field607 = false;
        field608 = 0;
        field609 = 0;
        field610 = 50;
        field611 = new int[field610];
        field612 = new int[field610];
        field516 = new int[field610];
        field614 = new int[field610];
        field569 = new int[field610];
        field616 = new int[field610];
        field666 = new int[field610][];
        field618 = new int[field610];
        field567 = new String[field610];
        field544 = 0;
        field621 = -1;
        field600 = -1;
        field623 = 0;
        field624 = 0;
        field625 = 0;
        field626 = 0;
        field728 = true;
        field628 = 0;
        field690 = true;
        field630 = -1;
        field631 = 0;
        field657 = -1L;
        field633 = -1L;
        field634 = "";
        field521 = -1;
        field636 = true;
        field637 = 0;
        field638 = 0;
        field639 = new int[1000];
        field640 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field641 = new String[8];
        field642 = new boolean[8];
        field643 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field644 = -1;
        field680 = new int[25];
        field646 = new int[25];
        field647 = new int[25];
        field648 = new int[25];
        field620 = false;
        field650 = false;
        field561 = new class577(true);
        field578 = false;
        field695 = false;
        field696 = true;
        field655 = -1;
        field656 = -1;
        field545 = 0;
        field658 = 50;
        field659 = 0;
        field660 = null;
        field661 = false;
        field662 = -1;
        field663 = -1;
        field664 = null;
        field513 = null;
        field723 = -1;
        field667 = new class531(8);
        field668 = 0;
        field669 = -1;
        field670 = 0;
        field671 = null;
        field672 = 0;
        field652 = 0;
        field674 = 0;
        field675 = -1;
        field676 = false;
        field673 = null;
        field678 = null;
        field758 = null;
        field760 = 0;
        field681 = 0;
        field682 = null;
        field559 = false;
        field759 = -1;
        field685 = -1;
        field692 = false;
        field687 = -1;
        field522 = -1;
        field689 = false;
        field555 = 1;
        field691 = new int[32];
        field615 = 0;
        field800 = new int[32];
        field779 = 0;
        field629 = new int[32];
        field510 = 0;
        field697 = new int[32];
        field698 = 0;
        field665 = 0;
        field587 = 0;
        field701 = 0;
        field702 = 0;
        field703 = 0;
        field704 = 0;
        field705 = 0;
        field706 = 0;
        field694 = 0;
        field708 = new class576();
        field512 = new class411();
        field788 = new class411();
        field711 = new class411();
        field712 = new class411();
        field713 = new class531(512);
        field714 = 0;
        field591 = -2;
        field716 = new boolean[100];
        field717 = new boolean[100];
        field718 = new boolean[100];
        field719 = new int[100];
        field566 = new int[100];
        field721 = new int[100];
        field722 = new int[100];
        field653 = 0;
        field773 = 0L;
        field740 = true;
        field726 = 600;
        field727 = field726 / field179;
        field772 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field729 = 0;
        field730 = 0;
        field731 = "";
        field732 = new long[100];
        field733 = 0;
        field734 = new class270();
        field755 = new class268();
        field736 = 0;
        field737 = new int[128];
        field738 = new int[128];
        field710 = -1L;
        field776 = new class162[4];
        field741 = new class171[4];
        field579 = -1;
        field743 = 0;
        field744 = new int[1000];
        field745 = new int[1000];
        field693 = new class572[1000];
        field747 = 0;
        field748 = 0;
        field771 = 0;
        field750 = false;
        field751 = 0;
        field504 = new int[50];
        field753 = new int[50];
        field754 = new int[50];
        field752 = new int[50];
        field574 = new int[50];
        field757 = new class40[50];
        field586 = false;
        field649 = false;
        field739 = false;
        field761 = false;
        field762 = null;
        field505 = null;
        field764 = null;
        field749 = false;
        field766 = new boolean[5];
        field767 = new int[5];
        field768 = new int[5];
        field769 = new int[5];
        field683 = new int[5];
        field588 = 256;
        field580 = 205;
        field558 = 256;
        field774 = 320;
        field775 = 1;
        field763 = 32767;
        field777 = 1;
        field778 = 32767;
        field709 = 0;
        field780 = 0;
        field781 = 0;
        field582 = 0;
        field783 = 0;
        field605 = new class359();
        field785 = -1;
        field786 = -1;
        field795 = new class516();
        field700 = new class401[8];
        field627 = new class67();
        field790 = new class466(8, class464.field4961);
        field782 = new class316(64);
        field792 = new class316(64);
        field793 = -1;
        field801 = -1;
        field799 = new ArrayList();
        field796 = new class278();
        field508 = 30;
        field798 = new ArrayList(10);
        field699 = 0;
        field742 = 0;
        field770 = new class66();
        field802 = new int[50];
        field507 = new int[50];
    }

    @ObfuscatedName("by.fs(I)Lta;")
    public static class517 method682() {
        return Statics.field1536;
    }

    @ObfuscatedName("gd.fz(B)Luc;")
    public static class525 method3444() {
        return Statics.field472;
    }

    @ObfuscatedName("client.ba(I)V")
    public final void method528() {
    }

    public final void init() {
        if (!this.method506()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class107.field1386)) {
                            field794 = true;
                        } else {
                            field794 = false;
                        }
                        break;
                    case 4:
                        if (field564 == -1) {
                            field564 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field503 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field3268 = class407.method7217(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class376[] var4 = new class376[] { class376.field4117, class376.field4120, class376.field4116, class376.field4118 };
                        class376[] var5 = var4;
                        int var6 = 0;
                        class376 var8;
                        while (true) {
                            if (var6 >= var5.length) {
                                var8 = null;
                                break;
                            }
                            class376 var7 = var5[var6];
                            if (var7.field4115 == var3) {
                                var8 = var7;
                                break;
                            }
                            var6++;
                        }
                        Statics.field2142 = var8;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class107.field1386)) {
                        }
                        break;
                    case 9:
                        Statics.field1669 = var2;
                        break;
                    case 10:
                        Statics.field3157 = (class378) class406.method3580(class378.method275(), Integer.parseInt(var2));
                        if (Statics.field3157 == class378.field4125) {
                            Statics.field3276 = class535.field5345;
                        } else {
                            Statics.field3276 = class535.field5344;
                        }
                        break;
                    case 11:
                        Statics.field4136 = var2;
                        break;
                    case 12:
                        field502 = Integer.parseInt(var2);
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
                        Statics.field5508 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field530 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field448 = var2;
                        break;
                    case 21:
                        field538 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field1701 = var2;
                        break;
                    case 25:
                        int var9 = var2.indexOf(".");
                        if (var9 == -1) {
                            class556.field5458 = Integer.parseInt(var2);
                        } else {
                            class556.field5458 = Integer.parseInt(var2.substring(0, var9));
                            Integer.parseInt(var2.substring(var9 + 1));
                        }
                }
            }
        }
        method4939();
        Statics.field1736 = this.getCodeBase().getHost();
        Statics.field4124 = new class393();
        String var10 = Statics.field2142.field4119;
        byte var11 = 0;
        if ((field503 & class553.field5431.method37()) != 0) {
            Statics.field1689 = "beta";
        }
        try {
            class221.method2618("oldschool", Statics.field1689, var10, var11, 23);
        } catch (Exception var13) {
            class584.method8201((String) null, var13);
        }
        Statics.field995 = this;
        Statics.field1368 = field564;
        Statics.field2636 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field3246 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field3115 = System.getenv("JX_SESSION_ID");
        Statics.field4917 = System.getenv("JX_CHARACTER_ID");
        class79.method3527(System.getenv("JX_DISPLAY_NAME"));
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field688 = true;
        }
        if (field509 == -1) {
            if (this.method1243() || this.method1244()) {
                field509 = 5;
            } else {
                field509 = 0;
            }
        }
        this.method489(765, 503, 226, 1);
    }

    public void finalize() throws Throwable {
        class334.field3628.remove(this);
        super.finalize();
    }

    @ObfuscatedName("jf.fi(B)V")
    public static final void method4939() {
        class245.field2639 = false;
        field506 = false;
    }

    @ObfuscatedName("client.gp(B)Z")
    public boolean method1240() {
        return this.field686 == 1;
    }

    public void setClient(int arg0) {
        this.field686 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field549 = arg0;
            class79.method42(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field554 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field551 == 10;
    }

    public long getAccountHash() {
        return this.field563;
    }

    @ObfuscatedName("client.gl(B)Z")
    public boolean method1243() {
        return Statics.field2636 != null && !Statics.field2636.trim().isEmpty() && Statics.field3246 != null && !Statics.field3246.trim().isEmpty();
    }

    @ObfuscatedName("client.gb(S)Z")
    public boolean method1244() {
        return Statics.field3115 != null && !Statics.field3115.trim().isEmpty() && Statics.field4917 != null && !Statics.field4917.trim().isEmpty();
    }

    @ObfuscatedName("client.gn(I)Z")
    public boolean method1245() {
        return this.field549 != null;
    }

    @ObfuscatedName("client.gd(Ljava/lang/String;I)V")
    public void method1246(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field4136 + "shield/oauth/token" + (new class506(var2)).method8628());
        class462 var4 = new class462();
        if (this.method1240()) {
            var4.method8184(field613);
        } else {
            var4.method8184(field556);
        }
        var4.method8159("Host", (new URL(Statics.field4136)).getHost());
        var4.method8166(class503.field5133);
        class10 var5 = class10.field28;
        RefreshAccessTokenRequester var6 = this.field554;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field688);
            this.field553 = this.field576.method165(var7);
        } else {
            this.field645 = var6.request(var5.method68(), var3, var4.method8158(), "");
        }
    }

    @ObfuscatedName("client.gy(Ljava/lang/String;I)V")
    public void method1242(String arg0) throws IOException {
        URL var2 = new URL(Statics.field4136 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class462 var3 = new class462();
        var3.method8163(arg0);
        class10 var4 = class10.field31;
        OtlTokenRequester var5 = this.field549;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field688);
            this.field548 = this.field576.method165(var6);
        } else {
            this.field550 = var5.request(var4.method68(), var2, var3.method8158(), "");
        }
    }

    @ObfuscatedName("client.gc(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1248(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field1701 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field28, this.field688);
        var4.method82().method8163(arg0);
        var4.method82().method8166(class503.field5133);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method83(new class505(var5));
        this.field548 = this.field576.method165(var4);
    }

    @ObfuscatedName("client.bz(B)V")
    public final void method570() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field5398 = null;
            Statics.field82 = null;
            Statics.field4915 = (byte[][][]) null;
            class454.method5967();
        } else {
            Statics.field5398 = var1;
            Statics.field82 = new int[var1.length];
            Statics.field4915 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field5398.length; var3++) {
                Statics.field4915[var3] = new byte[var2[var3]][];
                class454.field4903.add(var1[var3]);
            }
            Collections.sort(class454.field4903);
        }
        int var4 = field503;
        class553 var5 = class553.field5431;
        boolean var6 = (var4 & var5.method37()) != 0;
        Statics.field720 = var6;
        Statics.field169 = field530 == 0 ? 43594 : field502 + 40000;
        Statics.field4872 = field530 == 0 ? 443 : field502 + 50000;
        Statics.field1995 = Statics.field169;
        Statics.field4540 = class361.field3864;
        Statics.field1982 = class361.field3865;
        Statics.field903 = class361.field3866;
        Statics.field3708 = class361.field3868;
        Statics.field3067 = new class120(this.field688, 226);
        this.method496();
        this.method591();
        Statics.field1757 = this.method552();
        this.method572(field755, 0);
        this.method572(field734, 1);
        this.method513();
        Statics.field1920 = new class491(255, class221.field2397, class221.field2398, 500000);
        class537 var7 = null;
        class103 var8 = new class103();
        try {
            var7 = class221.method8260("", Statics.field3157.field4131, false);
            byte[] var9 = new byte[(int) var7.method9031()];
            int var11;
            for (int var10 = 0; var10 < var9.length; var10 += var11) {
                var11 = var7.method9032(var9, var10, var9.length - var10);
                if (var11 == -1) {
                    throw new IOException();
                }
            }
            var8 = new class103(new class558(var9));
        } catch (Exception var20) {
        }
        try {
            if (var7 != null) {
                var7.method9027();
            }
        } catch (Exception var19) {
        }
        Statics.field2378 = var8;
        String var16 = Statics.field3019;
        class32.field136 = this;
        if (var16 != null) {
            class32.field135 = var16;
        }
        method6218(Statics.field2378.method2736());
        Statics.field1072 = new class71(Statics.field3276);
        this.field576 = new class15("tokenRequest", 1, 1);
        if (!class334.field3628.contains(this)) {
            class334.field3628.add(this);
        }
        field796.method5398();
        class235 var18 = new class235(3, 1, 0);
        var18.method4385(-64, -8, 64);
        var18.method4385(64, -8, 64);
        var18.method4385(0, -8, -24);
        var18.method4386(0, 2, 1, (byte) 1, (byte) -1, (short) -1, (short) -1);
        Statics.field2973 = var18.method4460(128, 256, 0, -128, 0);
    }

    @ObfuscatedName("client.bc(I)V")
    public final void method607() {
        field518++;
        this.method1249();
        while (true) {
            class411 var1 = class388.field4537;
            class387 var2;
            synchronized (class388.field4537) {
                var2 = (class387) class388.field4534.method7246();
            }
            if (var2 == null) {
                boolean var4 = class334.method4375();
                if (var4 && field750 && Statics.field1025 != null) {
                    Statics.field1025.method803();
                }
                method3410();
                field734.method5241();
                this.method497();
                class36.method2907();
                if (Statics.field1757 != null) {
                    int var5 = Statics.field1757.method305();
                    field694 = var5;
                }
                if (field551 == 0) {
                    method5466();
                    class35.method3561();
                } else if (field551 == 5) {
                    class79.method6897(this, Statics.field2412, Statics.field1527);
                    method5466();
                    class35.method3561();
                } else if (field551 == 10 || field551 == 11) {
                    class79.method6897(this, Statics.field2412, Statics.field1527);
                } else if (field551 == 20) {
                    class79.method6897(this, Statics.field2412, Statics.field1527);
                    this.method1622();
                } else if (field551 == 50) {
                    class79.method6897(this, Statics.field2412, Statics.field1527);
                    this.method1622();
                } else if (field551 == 25) {
                    if (field511) {
                        method8059();
                    }
                    if (field619) {
                        method2471(Statics.field2125);
                    }
                    if (!field619 && !field511) {
                        Statics.method3201(30);
                    }
                }
                if (field551 == 30) {
                    this.method1253();
                } else if (field551 == 40 || field551 == 45) {
                    this.method1622();
                }
                return;
            }
            var2.field4530.method6953(var2.field4529, (int) var2.field5170, var2.field4527, false);
        }
    }

    @ObfuscatedName("client.by(ZI)V")
    public final void method520(boolean arg0) {
        if ((field551 == 10 || field551 == 20 || field551 == 30) && field773 != 0L && class330.method2257() > field773) {
            method6218(method3408());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field716[var2] = true;
            }
        }
        if (field551 == 0) {
            this.method522(class79.field935, class79.field934, arg0, Statics.field2403);
        } else if (field551 == 5) {
            class79.method2373(Statics.field4047, Statics.field2412, Statics.field1527);
        } else if (field551 == 10 || field551 == 11) {
            class79.method2373(Statics.field4047, Statics.field2412, Statics.field1527);
        } else if (field551 == 20) {
            class79.method2373(Statics.field4047, Statics.field2412, Statics.field1527);
        } else if (field551 == 50) {
            class79.method2373(Statics.field4047, Statics.field2412, Statics.field1527);
        } else if (field551 == 25) {
            if (field515 == 1) {
                if (field654 > field573) {
                    field573 = field654;
                }
                int var3 = (field573 * 50 - field654 * 50) / field573;
                method3965(class383.field4191 + class107.field1385 + class107.field1379 + var3 + "%" + class107.field1383, false);
            } else if (field515 == 2) {
                if (field572 > field575) {
                    field575 = field572;
                }
                int var4 = (field575 * 50 - field572 * 50) / field575 + 50;
                method3965(class383.field4191 + class107.field1385 + class107.field1379 + var4 + "%" + class107.field1383, false);
            } else {
                method3965(class383.field4191, false);
            }
        } else if (field551 == 30) {
            this.method1256();
        } else if (field551 == 40) {
            method3965(class383.field4360 + class107.field1385 + class383.field4275, false);
        } else if (field551 == 45) {
            method3965(class383.field4296, false);
        }
        if (field551 == 30 && field653 == 0 && !arg0 && !field740) {
            for (int var5 = 0; var5 < field714; var5++) {
                if (field717[var5]) {
                    Statics.field2344.method467(field719[var5], field566[var5], field721[var5], field722[var5]);
                    field717[var5] = false;
                }
            }
        } else if (field551 > 0) {
            Statics.field2344.method470(0, 0);
            for (int var6 = 0; var6 < field714; var6++) {
                field717[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.br(I)V")
    public final void method521() {
        if (Statics.field5155 != null && Statics.field5155.method2996()) {
            Statics.field5155.method2990();
        }
        if (Statics.field4985 != null) {
            Statics.field4985.field1113 = false;
        }
        Statics.field4985 = null;
        field784.method3051();
        class36.method5955();
        Statics.field1757 = null;
        if (Statics.field1025 != null) {
            Statics.field1025.method789();
        }
        Statics.field4124.method7086();
        class388.method3344();
        if (Statics.field3067 != null) {
            Statics.field3067.method3079();
            Statics.field3067 = null;
        }
        class221.method175();
        this.field576.method163();
    }

    @ObfuscatedName("bm.ga(I)V")
    public static void method810() {
        field597 = true;
        if (Statics.field5155 != null && Statics.field5155.method2996()) {
            Statics.field5155.method2990();
        }
        method3407();
        method7228();
        if (Statics.field4985 != null) {
            Statics.field4985.field1113 = false;
        }
        Statics.field4985 = null;
        field784.method3051();
        if (Statics.field185 != null) {
            try {
                Statics.field185.method4221();
            } catch (Exception var3) {
            }
        }
        Statics.field185 = null;
        method2842();
        method3538();
        field684.method2583();
        Statics.field472 = null;
        class334.method3533(0, 0);
        class334.method3610();
        field750 = false;
        class72.method5757();
        if (Statics.field1025 != null) {
            Statics.field1025.method789();
        }
        Statics.field4124.method7086();
        class388.method3344();
        if (Statics.field3067 != null) {
            Statics.field3067.method3079();
        }
        class221.method175();
        class221.field2397 = null;
        class221.field2398 = null;
        Statics.field1525 = null;
        class223.method835();
        Statics.field1920 = null;
        field798.clear();
        field742 = 0;
        Statics.field4124 = new class393();
        Statics.field3067 = new class120(Statics.field995.field688, 226);
        try {
            class221.method2618("oldschool", Statics.field1689, Statics.field2142.field4119, 0, 23);
        } catch (IOException var2) {
            throw new RuntimeException(var2);
        }
        Statics.field1920 = new class491(255, class221.field2397, class221.field2398, 500000);
        Statics.field185 = new class219();
        Statics.field995.method508();
        method7737(class96.field1166);
        Statics.method3201(0);
    }

    @ObfuscatedName("gh.gf(B)V")
    public static void method3538() {
        Statics.field37 = null;
        Statics.field4764 = null;
        Statics.field4749 = null;
        Statics.field3310 = null;
        Statics.field5370 = null;
        Statics.field497 = null;
        Statics.field1589 = null;
        Statics.field3066 = null;
        Statics.field893 = null;
        Statics.field1685 = null;
        Statics.field5089 = null;
    }

    @ObfuscatedName("client.gg(I)V")
    public void method1249() {
        if (field551 != 1000) {
            boolean var1 = Statics.field4124.method7077();
            if (!var1) {
                this.method1250();
            }
        }
    }

    @ObfuscatedName("client.gh(I)V")
    public void method1250() {
        if (Statics.field4124.field4632 >= 4) {
            this.method603("js5crc");
            Statics.method3201(1000);
            return;
        }
        if (Statics.field4124.field4633 >= 4) {
            if (field551 <= 5) {
                this.method603("js5io");
                Statics.method3201(1000);
                return;
            }
            field539 = 3000;
            Statics.field4124.field4633 = 3;
        }
        if (--field539 + 1 > 0) {
            return;
        }
        try {
            if (field501 == 0) {
                Statics.field2117 = Statics.field185.method4223(Statics.field1736, Statics.field1995);
                field501++;
            }
            if (field501 == 1) {
                if (Statics.field2117.field2432 == 2) {
                    this.method1589(-1);
                    return;
                }
                if (Statics.field2117.field2432 == 1) {
                    field501++;
                }
            }
            if (field501 == 2) {
                Statics.field1985 = Statics.method278((Socket) Statics.field2117.field2435, 40000, 5000);
                if (class556.field5458 >= 223) {
                    class558 var1 = new class558(class327.field3585.field3593 + 1);
                    var1.method9241(class327.field3585.field3592);
                    var1.method9244(226);
                    var1.method9244(field560[0]);
                    var1.method9244(field560[1]);
                    var1.method9244(field560[2]);
                    var1.method9244(field560[3]);
                    Statics.field1985.method8502(var1.field5463, 0, class327.field3585.field3593 + 1);
                } else {
                    class558 var2 = new class558(5);
                    var2.method9241(class327.field3585.field3592);
                    var2.method9244(226);
                    Statics.field1985.method8502(var2.field5463, 0, 5);
                }
                field501++;
                Statics.field3285 = class330.method2257();
            }
            if (field501 == 3) {
                if (Statics.field1985.method8500() > 0) {
                    int var3 = Statics.field1985.method8498();
                    if (var3 != 0) {
                        this.method1589(var3);
                        return;
                    }
                    field501++;
                } else if (class330.method2257() - Statics.field3285 > 30000L) {
                    this.method1589(-2);
                    return;
                }
            }
            if (field501 == 4) {
                Statics.field4124.method7079(Statics.field1985, field551 > 20);
                Statics.field2117 = null;
                Statics.field1985 = null;
                field501 = 0;
                field540 = 0;
            }
        } catch (IOException var5) {
            this.method1589(-3);
        }
    }

    @ObfuscatedName("client.gx(II)V")
    public void method1589(int arg0) {
        Statics.field2117 = null;
        Statics.field1985 = null;
        field501 = 0;
        if (Statics.field1995 == Statics.field169) {
            Statics.field1995 = Statics.field4872;
        } else {
            Statics.field1995 = Statics.field169;
        }
        field540++;
        if (field540 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field551 <= 5) {
                this.method603("js5connect_full");
                Statics.method3201(1000);
            } else {
                field539 = 3000;
            }
        } else if (field540 >= 2 && arg0 == 6) {
            this.method603("js5connect_outofdate");
            Statics.method3201(1000);
        } else if (field540 >= 4) {
            if (field551 <= 5) {
                this.method603("js5connect");
                Statics.method3201(1000);
            } else {
                field539 = 3000;
            }
        }
    }

    @ObfuscatedName("ar.gw(Lor;Ljava/lang/String;I)V")
    public static void method179(class389 arg0, String arg1) {
        class87 var2 = new class87(arg0, arg1);
        field798.add(var2);
        field742 += var2.field1059;
    }

    @ObfuscatedName("ch.gr(I)Z")
    public static boolean method1230() {
        if (field798 == null || field699 >= field798.size()) {
            return true;
        }
        while (field699 < field798.size()) {
            class87 var0 = (class87) field798.get(field699);
            if (!var0.method2444()) {
                return false;
            }
            field699++;
        }
        return true;
    }

    @ObfuscatedName("br.gm(I)I")
    public static int method694() {
        if (field798 == null || field699 >= field798.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field699; var1++) {
            var0 += ((class87) field798.get(var1)).field1058;
        }
        return var0 * 10000 / field742;
    }

    @ObfuscatedName("ih.go(II)I")
    public static int method3946(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("kz.gi(I)V")
    public static void method5466() {
        if (field537 == class96.field1166) {
            Statics.field2225 = method5726(class390.field4562.field4580, false, true, true, false);
            Statics.field205 = method5726(class390.field4559.field4580, true, true, true, false);
            Statics.field4893 = method5726(class390.field4570.field4580, false, true, true, false);
            Statics.field6 = method5726(class390.field4568.field4580, false, true, true, false);
            Statics.field963 = method5726(class390.field4571.field4580, true, false, true, false);
            Statics.field1657 = method5726(class390.field4572.field4580, false, true, true, false);
            Statics.field3307 = method5726(class390.field4573.field4580, false, true, true, false);
            class79.method5453(20, class383.field4195);
            method7737(class96.field1168);
        } else if (field537 == class96.field1168) {
            byte var0 = 0;
            int var1 = var0 + Statics.field2225.method6947() * 53 / 100;
            int var2 = var1 + Statics.field205.method6947() * 5 / 100;
            int var3 = var2 + Statics.field4893.method6947() * 36 / 100;
            int var4 = var3 + Statics.field6.method6947() / 100;
            int var5 = var4 + Statics.field963.method6947() / 100;
            int var6 = var5 + Statics.field1657.method6947() * 3 / 100;
            int var7 = var6 + Statics.field3307.method6947() / 100;
            if (var7 == 100) {
                method179(Statics.field2225, "Sound FX");
                method179(Statics.field205, "Music Tracks");
                method179(Statics.field4893, "Sprites");
                method179(Statics.field1657, "Music Samples");
                method179(Statics.field3307, "Music Patches");
                class79.method5453(40, class383.field4197);
                method7737(class96.field1181);
            } else if (var7 != 0) {
                class79.method5453(30, class383.field4384 + var7 + "%");
            }
        } else if (field537 == class96.field1181) {
            boolean var8 = !field506;
            Statics.field1060 = 22050;
            Statics.field5411 = var8;
            Statics.field4887 = 2;
            ArrayList var9 = new ArrayList(3);
            Statics.field1025 = class43.method4929(Statics.field185, 0, 2048);
            Statics.field4035 = new class39();
            class39 var10 = new class39();
            var10.method697(Statics.field4035);
            for (int var11 = 0; var11 < 3; var11++) {
                class335 var12 = new class335(Statics.field1025);
                var12.method6048(9, 128);
                var10.method697(var12);
                var9.add(var12);
            }
            Statics.field1025.method779(var10);
            class334.method3399(Statics.field3307, Statics.field1657, Statics.field2225, var9);
            Statics.field3638 = new class58(22050, Statics.field1060);
            class79.method5453(60, class383.field4198);
            method7737(class96.field1178);
        } else if (field537 == class96.field1178) {
            if (Statics.field77 == null) {
                Statics.field77 = new class526(Statics.field4893, Statics.field963);
            }
            class527[] var13 = new class527[] { class527.field5310, class527.field5311, class527.field5307, class527.field5308, class527.field5312, class527.field5309 };
            int var14 = var13.length;
            class526 var15 = Statics.field77;
            class527[] var16 = new class527[] { class527.field5310, class527.field5311, class527.field5307, class527.field5308, class527.field5312, class527.field5309 };
            field571 = var15.method8930(var16);
            if (field571.size() < var14) {
                class79.method5453(80, class383.field4295 + field571.size() * 100 / var14 + "%");
            } else {
                Statics.field2412 = (class436) field571.get(class527.field5307);
                Statics.field1527 = (class436) field571.get(class527.field5308);
                Statics.field4047 = (class436) field571.get(class527.field5309);
                Statics.field1536 = field795.method8672();
                class79.method5453(80, class383.field4188);
                method7737(class96.field1172);
            }
        } else if (field537 == class96.field1172) {
            int var17 = class79.method4348(Statics.field6, Statics.field4893);
            int var18 = class79.method5220(Statics.field4893);
            if (var17 < var18) {
                class79.method5453(90, class383.field4201 + var17 * 100 / var18 + "%");
            } else {
                class79.method5453(100, class383.field4202);
                if (Statics.field720) {
                    Statics.method3201(5);
                    method7737(class96.field1171);
                } else {
                    method7737(class96.field1167);
                }
            }
        } else if (field537 == class96.field1171) {
            Statics.method3201(10);
        } else if (field537 == class96.field1167) {
            Statics.field2401 = method5726(class390.field4558.field4580, false, true, true, false);
            Statics.field1850 = method5726(class390.field4569.field4580, false, true, true, false);
            Statics.field406 = method5726(class390.field4560.field4580, true, false, true, false);
            Statics.field3138 = method5726(class390.field4561.field4580, false, true, true, false);
            Statics.field1966 = method5726(class390.field4563.field4580, true, true, true, false);
            Statics.field1738 = method5726(class390.field4565.field4580, false, true, true, false);
            Statics.field4721 = method5726(class390.field4567.field4580, false, true, true, false);
            Statics.field3819 = method5726(class390.field4577.field4580, false, true, true, false);
            Statics.field3 = method5726(class390.field4579.field4580, false, true, true, false);
            Statics.field2055 = method5726(class390.field4574.field4580, true, true, true, false);
            Statics.field1747 = method5726(class390.field4575.field4580, false, true, true, false);
            Statics.field1492 = method5726(class390.field4576.field4580, false, true, true, false);
            Statics.field2469 = method5726(class390.field4557.field4580, false, true, true, false);
            Statics.field1760 = method5726(class390.field4578.field4580, false, true, true, false);
            int var19 = class390.field4564.field4580;
            class491 var20 = null;
            if (class221.field2397 != null) {
                var20 = new class491(var19, class221.field2397, Statics.field1525[var19], 1000000);
            }
            class389 var21 = new class389(var20, Statics.field1920, Statics.field4124, var19, false, true, true, true, true);
            Statics.field4702 = var21;
            class79.method5453(20, class383.field4195);
            method7737(class96.field1169);
        } else if (field537 == class96.field1169) {
            byte var22 = 0;
            int var23 = var22 + Statics.field2401.method6947() * 5 / 100;
            int var24 = var23 + Statics.field1850.method6947() * 2 / 100;
            int var25 = var24 + Statics.field406.method6947() / 100;
            int var26 = var25 + Statics.field3138.method6947() / 100;
            int var27 = var26 + Statics.field1966.method6947() * 10 / 100;
            int var28 = var27 + Statics.field1738.method6947() * 65 / 100;
            int var29 = var28 + Statics.field4721.method6947() / 100;
            int var30 = var29 + Statics.field3819.method6947() / 100;
            int var31 = var30 + Statics.field3.method6947() * 6 / 100;
            int var32 = var31 + Statics.field1492.method6947() / 100;
            int var33 = var32 + Statics.field1747.method6947() * 2 / 100;
            int var34 = var33 + Statics.field2469.method6947() * 2 / 100;
            int var35 = var34 + Statics.field1760.method6947() / 100;
            int var36 = var35 + Statics.field4702.method6947() / 100;
            int var37 = var36 + (Statics.field2055.method6946() && Statics.field2055.method6999() ? 1 : 0);
            if (var37 == 100) {
                method179(Statics.field2401, "Animations");
                method179(Statics.field1850, "Skeletons");
                method179(Statics.field1966, "Maps");
                method179(Statics.field1738, "Models");
                method179(Statics.field3819, "Music Jingles");
                method179(Statics.field1492, "World Map");
                method179(Statics.field1747, "World Map Geography");
                method179(Statics.field2469, "World Map Ground");
                Statics.field1807 = new class495();
                Statics.field1807.method8562(Statics.field2055);
                class79.method5453(30, class383.field4197);
                method7737(class96.field1165);
            } else if (var37 != 0) {
                class79.method5453(30, class383.field4384 + var37 + "%");
            }
        } else if (field537 == class96.field1165) {
            Statics.field2071 = field684.method2573(104, 104, Statics.field2378.method2761());
            Statics.field3742 = Statics.field2071;
            Statics.field378 = new class572(512, 512);
            class79.method5453(30, class383.field4194);
            method7737(class96.field1174);
        } else if (field537 == class96.field1174) {
            if (!Statics.field406.method6999()) {
                class79.method5453(40, class383.field4203 + Statics.field406.method6958() + "%");
            } else if (Statics.field1760.method6999()) {
                class212.method3723(Statics.field406);
                class201.method1201(Statics.field406);
                class186.method5809(Statics.field406, Statics.field1738);
                class210.method5969(Statics.field406, Statics.field1738, field506);
                class389 var38 = Statics.field406;
                class389 var39 = Statics.field1738;
                Statics.field2006 = var38;
                Statics.field4644 = var39;
                class207.method285(Statics.field406);
                Statics.method3361(Statics.field406, Statics.field1738, field794, Statics.field2412);
                class389 var40 = Statics.field406;
                class389 var41 = Statics.field2401;
                class389 var42 = Statics.field1850;
                Statics.field5228 = var40;
                Statics.field2384 = var41;
                Statics.field2383 = var42;
                class389 var43 = Statics.field406;
                class389 var44 = Statics.field1738;
                Statics.field2097 = var43;
                Statics.field2098 = var44;
                class204.method3289(Statics.field406);
                class182.method6876(Statics.field406);
                Statics.field4741 = new class353(Statics.field3138, Statics.field1738, Statics.field4893, Statics.field963, Statics.field4702);
                class389 var45 = Statics.field406;
                Statics.field1882 = var45;
                class389 var46 = Statics.field406;
                Statics.field1972 = var46;
                class185.method815(Statics.field406);
                class202.method2329(Statics.field406);
                class389 var47 = Statics.field406;
                Statics.field2132 = var47;
                class548.method6347(Statics.field406);
                class550.method4481(Statics.field406);
                Statics.field67 = new class540(Statics.field3157, 54, Statics.field3268, Statics.field406);
                Statics.field407 = new class540(Statics.field3157, 47, Statics.field3268, Statics.field406);
                Statics.field5155 = new class115();
                class208.method3445(Statics.field406, Statics.field4893, Statics.field963);
                class389 var48 = Statics.field406;
                class389 var49 = Statics.field4893;
                Statics.field1959 = var48;
                Statics.field342 = var49;
                class184.method11(Statics.field406, Statics.field4893);
                class79.method5453(50, class383.field4204);
                method7737(class96.field1175);
            } else {
                class79.method5453(40, class383.field4203 + (80 + Statics.field3.method6958() / 6) + "%");
            }
        } else if (field537 == class96.field1175) {
            int var50 = 0;
            if (Statics.field37 == null) {
                Statics.field37 = class573.method8571(Statics.field4893, Statics.field1807.field5110, 0);
            } else {
                var50++;
            }
            if (Statics.field4764 == null) {
                Statics.field4764 = class573.method8571(Statics.field4893, Statics.field1807.field5101, 0);
            } else {
                var50++;
            }
            if (Statics.field4749 == null) {
                class389 var51 = Statics.field4893;
                int var52 = Statics.field1807.field5102;
                class571[] var53;
                if (class573.method1049(var51, var52, 0)) {
                    class571[] var54 = new class571[Statics.field5574];
                    for (int var55 = 0; var55 < Statics.field5574; var55++) {
                        class571 var56 = var54[var55] = new class571();
                        var56.field5555 = Statics.field5569;
                        var56.field5556 = Statics.field5571;
                        var56.field5553 = Statics.field5572[var55];
                        var56.field5554 = Statics.field5125[var55];
                        var56.field5549 = Statics.field22[var55];
                        var56.field5551 = Statics.field5573[var55];
                        var56.field5550 = Statics.field5575;
                        var56.field5552 = Statics.field3079[var55];
                    }
                    Statics.field5572 = null;
                    Statics.field5125 = null;
                    Statics.field22 = null;
                    Statics.field5573 = null;
                    Statics.field5575 = null;
                    Statics.field3079 = (byte[][]) null;
                    var53 = var54;
                } else {
                    var53 = null;
                }
                Statics.field4749 = var53;
            } else {
                var50++;
            }
            if (Statics.field3310 == null) {
                Statics.field3310 = class573.method3098(Statics.field4893, Statics.field1807.field5103, 0);
            } else {
                var50++;
            }
            if (Statics.field5370 == null) {
                Statics.field5370 = class573.method3098(Statics.field4893, Statics.field1807.field5104, 0);
            } else {
                var50++;
            }
            if (Statics.field497 == null) {
                Statics.field497 = class573.method3098(Statics.field4893, Statics.field1807.field5105, 0);
            } else {
                var50++;
            }
            if (Statics.field1589 == null) {
                Statics.field1589 = class573.method3098(Statics.field4893, Statics.field1807.field5106, 0);
            } else {
                var50++;
            }
            if (Statics.field3066 == null) {
                Statics.field3066 = class573.method3098(Statics.field4893, Statics.field1807.field5107, 0);
            } else {
                var50++;
            }
            if (Statics.field893 == null) {
                Statics.field893 = class573.method3098(Statics.field4893, Statics.field1807.field5115, 0);
            } else {
                var50++;
            }
            if (Statics.field1685 == null) {
                class389 var58 = Statics.field4893;
                int var59 = Statics.field1807.field5109;
                class571[] var60;
                if (class573.method1049(var58, var59, 0)) {
                    class571[] var61 = new class571[Statics.field5574];
                    for (int var62 = 0; var62 < Statics.field5574; var62++) {
                        class571 var63 = var61[var62] = new class571();
                        var63.field5555 = Statics.field5569;
                        var63.field5556 = Statics.field5571;
                        var63.field5553 = Statics.field5572[var62];
                        var63.field5554 = Statics.field5125[var62];
                        var63.field5549 = Statics.field22[var62];
                        var63.field5551 = Statics.field5573[var62];
                        var63.field5550 = Statics.field5575;
                        var63.field5552 = Statics.field3079[var62];
                    }
                    Statics.field5572 = null;
                    Statics.field5125 = null;
                    Statics.field22 = null;
                    Statics.field5573 = null;
                    Statics.field5575 = null;
                    Statics.field3079 = (byte[][]) null;
                    var60 = var61;
                } else {
                    var60 = null;
                }
                Statics.field1685 = var60;
            } else {
                var50++;
            }
            if (Statics.field5089 == null) {
                class389 var65 = Statics.field4893;
                int var66 = Statics.field1807.field5108;
                class571[] var67;
                if (class573.method1049(var65, var66, 0)) {
                    class571[] var68 = new class571[Statics.field5574];
                    for (int var69 = 0; var69 < Statics.field5574; var69++) {
                        class571 var70 = var68[var69] = new class571();
                        var70.field5555 = Statics.field5569;
                        var70.field5556 = Statics.field5571;
                        var70.field5553 = Statics.field5572[var69];
                        var70.field5554 = Statics.field5125[var69];
                        var70.field5549 = Statics.field22[var69];
                        var70.field5551 = Statics.field5573[var69];
                        var70.field5550 = Statics.field5575;
                        var70.field5552 = Statics.field3079[var69];
                    }
                    Statics.field5572 = null;
                    Statics.field5125 = null;
                    Statics.field22 = null;
                    Statics.field5573 = null;
                    Statics.field5575 = null;
                    Statics.field3079 = (byte[][]) null;
                    var67 = var68;
                } else {
                    var67 = null;
                }
                Statics.field5089 = var67;
            } else {
                var50++;
            }
            if (var50 < 11) {
                class79.method5453(70, class383.field4205 + var50 * 100 / 12 + "%");
            } else {
                Statics.field4862 = Statics.field5089;
                Statics.field4764.method9734();
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 21.0D) - 10;
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 41.0D) - 20;
                Statics.field4749[0].method9712(var72 + var75, var73 + var75, var74 + var75);
                class79.method5453(60, class383.field4345);
                method7737(class96.field1173);
            }
        } else if (field537 == class96.field1173) {
            if (Statics.field4721.method6999()) {
                Statics.field2110 = new class252(Statics.field4721, Statics.field4893, 20, Statics.field2378.method2724(), field506 ? 64 : 128);
                class240.method4493(Statics.field2110);
                class240.method4494(Statics.field2378.method2724());
                method7737(class96.field1176);
            } else {
                class79.method5453(70, class383.field4207 + "0%");
            }
        } else if (field537 == class96.field1176) {
            int var76 = Statics.field2110.method4950();
            if (var76 < 100) {
                class79.method5453(80, class383.field4207 + var76 + "%");
            } else {
                class79.method5453(90, class383.field4462);
                method7737(class96.field1177);
            }
        } else if (field537 == class96.field1177) {
            Statics.field4985 = new class92();
            Statics.field185.method4224(Statics.field4985, 10);
            class79.method5453(92, class383.field4368);
            method7737(class96.field1184);
        } else if (field537 == class96.field1184) {
            if (Statics.field6.method7014("huffman", "")) {
                class364 var77 = new class364(Statics.field6.method7013("huffman", ""));
                Statics.method5795(var77);
                class79.method5453(94, class383.field4427);
                method7737(class96.field1170);
            } else {
                class79.method5453(94, class383.field4362 + "%");
            }
        } else if (field537 == class96.field1170) {
            if (!Statics.field3138.method6999()) {
                class79.method5453(96, class383.field4212 + Statics.field3138.method6958() * 4 / 5 + "%");
            } else if (!Statics.field4702.method6999()) {
                class79.method5453(96, class383.field4212 + Statics.field4702.method6958() * 4 / 5 + "%");
            } else if (!Statics.field3.method6999()) {
                class79.method5453(96, class383.field4212 + (80 + Statics.field3.method6958() / 6) + "%");
            } else if (Statics.field963.method6999()) {
                class79.method5453(98, class383.field4213);
                if (Statics.field3.method7012("version.dat", "")) {
                    class558 var78 = new class558(Statics.field3.method7013("version.dat", ""));
                    var78.method9260();
                }
                method7737(class96.field1180);
            } else {
                class79.method5453(96, class383.field4212 + (96 + Statics.field963.method6958() / 50) + "%");
            }
        } else if (field537 == class96.field1180) {
            if (Statics.field1492.method7047() <= 0 || Statics.field1492.method7015(class304.field3264.field3270)) {
                if (Statics.field472 == null) {
                    Statics.field472 = new class525();
                    Statics.field472.method8731(Statics.field1492, Statics.field1747, Statics.field2469, Statics.field4047, field571, Statics.field4749);
                }
                class79.method5453(100, class383.field4215);
                if (Statics.field720) {
                    method7737(class96.field1182);
                } else {
                    method7737(class96.field1171);
                }
                field597 = false;
            } else {
                class79.method5453(100, class383.field4214 + Statics.field1492.method7017(class304.field3264.field3270) / 10 + "%");
            }
        } else if (field537 == class96.field1182) {
            Statics.field2403 = false;
            Statics.method3201(20);
            method3428(class69.field490);
        }
    }

    @ObfuscatedName("ne.gz(B)V")
    public static void method6407() {
        if (Statics.field2071 != null) {
            Statics.field2071.field1352.method4713(Statics.field2378.method2761());
        }
    }

    @ObfuscatedName("qr.gq(Ldj;B)V")
    public static void method7737(class96 arg0) {
        if (field537 != arg0) {
            field537 = arg0;
        }
    }

    @ObfuscatedName("lu.gu(IZZZZI)Lor;")
    public static class389 method5726(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class491 var5 = null;
        if (class221.field2397 != null) {
            var5 = new class491(arg0, class221.field2397, Statics.field1525[arg0], 1000000);
        }
        return new class389(var5, Statics.field1920, Statics.field4124, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("client.gt(B)V")
    public final void method1622() {
        class487 var1 = field784.method3053();
        class557 var2 = field784.field1473;
        try {
            if (Statics.field3765 == class69.field487) {
                if (Statics.field3436 == null && (field756.method2350() || field541 > 250)) {
                    Statics.field3436 = field756.method2343();
                    field756.method2341();
                    field756 = null;
                }
                if (Statics.field3436 != null) {
                    if (var1 != null) {
                        var1.method8512();
                        var1 = null;
                    }
                    Statics.field3065 = null;
                    field527 = false;
                    field541 = 0;
                    if (!field617.method9581()) {
                        method3428(class69.field473);
                    } else if (this.method1243()) {
                        try {
                            this.method1246(Statics.field3246);
                            method3428(class69.field479);
                        } catch (Throwable var63) {
                            class584.method8201((String) null, var63);
                            method3106(65);
                            return;
                        }
                    } else if (this.method1244()) {
                        try {
                            this.method1248(Statics.field3115, Statics.field4917);
                            method3428(class69.field494);
                        } catch (Exception var62) {
                            class584.method8201((String) null, var62);
                            method3106(65);
                            return;
                        }
                    } else {
                        method3106(65);
                        return;
                    }
                }
            }
            if (Statics.field3765 == class69.field479) {
                if (this.field645 == null) {
                    if (this.field553 == null) {
                        method3106(65);
                        return;
                    }
                    if (!this.field553.method263()) {
                        return;
                    }
                    if (this.field553.method272()) {
                        class584.method8201(this.field553.method258(), (Throwable) null);
                        method3106(65);
                        this.field553 = null;
                        return;
                    }
                    class21 var7 = this.field553.method261();
                    if (var7.method292() != 200) {
                        method3106(65);
                        this.field553 = null;
                        return;
                    }
                    field541 = 0;
                    class505 var8 = new class505(var7.method301());
                    try {
                        Statics.field2636 = var8.method8618().getString("access_token");
                        Statics.field3246 = var8.method8618().getString("refresh_token");
                    } catch (Exception var60) {
                        class584.method8201("Error parsing tokens", var60);
                        method3106(65);
                        this.field553 = null;
                        return;
                    }
                } else if (this.field645.isDone()) {
                    if (this.field645.isCancelled()) {
                        method3106(65);
                        this.field645 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field645.get();
                        if (!var5.isSuccess()) {
                            method3106(65);
                            this.field645 = null;
                            return;
                        }
                        Statics.field2636 = var5.getAccessToken();
                        Statics.field3246 = var5.getRefreshToken();
                        this.field645 = null;
                    } catch (Exception var61) {
                        class584.method8201((String) null, var61);
                        method3106(65);
                        this.field645 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1242(Statics.field2636);
                method3428(class69.field494);
            }
            if (Statics.field3765 == class69.field494) {
                if (this.field550 == null) {
                    if (this.field548 == null) {
                        method3106(65);
                        return;
                    }
                    if (!this.field548.method263()) {
                        return;
                    }
                    if (this.field548.method272()) {
                        class584.method8201(this.field548.method258(), (Throwable) null);
                        method3106(65);
                        this.field548 = null;
                        return;
                    }
                    class21 var12 = this.field548.method261();
                    if (var12.method292() != 200) {
                        class584.method8201("Login authentication error. Response code: " + var12.method292() + " " + var12.method290() + " Response body: " + var12.method301(), (Throwable) null);
                        method3106(65);
                        this.field548 = null;
                        return;
                    }
                    List var13 = (List) var12.method296().get("Content-Type");
                    if (var13 != null && var13.contains(class503.field5133.method8603())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method301());
                            this.field546 = var14.getString("token");
                        } catch (JSONException var58) {
                            class584.method8201((String) null, var58);
                            method3106(65);
                            this.field548 = null;
                            return;
                        }
                    } else {
                        this.field546 = var12.method301();
                    }
                    this.field548 = null;
                } else if (this.field550.isDone()) {
                    if (this.field550.isCancelled()) {
                        method3106(65);
                        this.field550 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field550.get();
                        if (!var10.isSuccess()) {
                            method3106(65);
                            this.field550 = null;
                            return;
                        }
                        this.field546 = var10.getToken();
                        this.field550 = null;
                    } catch (Exception var59) {
                        class584.method8201((String) null, var59);
                        method3106(65);
                        this.field550 = null;
                        return;
                    }
                } else {
                    return;
                }
                field541 = 0;
                method3428(class69.field473);
            }
            if (Statics.field3765 == class69.field473) {
                if (Statics.field3065 == null) {
                    Statics.field3065 = Statics.field185.method4223(Statics.field1736, Statics.field1995);
                }
                if (Statics.field3065.field2432 == 2) {
                    throw new IOException();
                }
                if (Statics.field3065.field2432 == 1) {
                    Socket var16 = (Socket) Statics.field3065.field2435;
                    class488 var17 = new class488(var16, 40000, 5000);
                    var1 = var17;
                    field784.method3056(var17);
                    Statics.field3065 = null;
                    method3428(class69.field474);
                }
            }
            if (Statics.field3765 == class69.field474) {
                field784.method3066();
                class325 var18 = class325.method5954();
                var18.field3433.method9241(class327.field3588.field3592);
                field784.method3070(var18);
                field784.method3048();
                var2.field5462 = 0;
                method3428(class69.field475);
            }
            if (Statics.field3765 == class69.field475) {
                if (Statics.field1025 != null) {
                    Statics.field1025.method781();
                }
                if (var1.method8499(1)) {
                    int var19 = var1.method8498();
                    if (Statics.field1025 != null) {
                        Statics.field1025.method781();
                    }
                    if (var19 != 0) {
                        method3106(var19);
                        return;
                    }
                    var2.field5462 = 0;
                    method3428(class69.field476);
                }
            }
            if (Statics.field3765 == class69.field476) {
                if (var2.field5462 < 8) {
                    int var20 = var1.method8500();
                    if (var20 > 8 - var2.field5462) {
                        var20 = 8 - var2.field5462;
                    }
                    if (var20 > 0) {
                        var1.method8501(var2.field5463, var2.field5462, var20);
                        var2.field5462 += var20;
                    }
                }
                if (var2.field5462 == 8) {
                    var2.field5462 = 0;
                    Statics.field1095 = var2.method9265();
                    method3428(class69.field477);
                }
            }
            if (Statics.field3765 == class69.field477) {
                field784.field1473.field5462 = 0;
                field784.method3066();
                class557 var21 = new class557(500);
                int[] var22 = new int[] { Statics.field3436.nextInt(), Statics.field3436.nextInt(), Statics.field3436.nextInt(), Statics.field3436.nextInt() };
                var21.field5462 = 0;
                var21.method9241(1);
                var21.method9244(var22[0]);
                var21.method9244(var22[1]);
                var21.method9244(var22[2]);
                var21.method9244(var22[3]);
                var21.method9381(Statics.field1095);
                if (field551 == 40) {
                    var21.method9244(field560[0]);
                    var21.method9244(field560[1]);
                    var21.method9244(field560[2]);
                    var21.method9244(field560[3]);
                } else {
                    if (field551 == 50) {
                        var21.method9241(class131.field1532.method37());
                        var21.method9244(Statics.field2065);
                    } else {
                        var21.method9241(field531.method37());
                        switch(field531.field1535) {
                            case 1:
                                var21.method9244(Statics.field2378.method2739(class79.field947));
                                break;
                            case 2:
                            case 4:
                                var21.method9243(Statics.field3636);
                                var21.field5462++;
                                break;
                            case 3:
                                var21.field5462 += 4;
                        }
                    }
                    if (field617.method9581()) {
                        var21.method9241(class563.field5518.method37());
                        var21.method9248(this.field546);
                    } else {
                        var21.method9241(class563.field5523.method37());
                        var21.method9248(class79.field943);
                    }
                }
                var21.method9336(class78.field921, class78.field925);
                field560 = var22;
                class325 var23 = class325.method5954();
                var23.field3433.field5462 = 0;
                if (field551 == 40) {
                    var23.field3433.method9241(class327.field3586.field3592);
                } else {
                    var23.field3433.method9241(class327.field3589.field3592);
                }
                var23.field3433.method9257(0);
                int var24 = var23.field3433.field5462;
                var23.field3433.method9244(226);
                var23.field3433.method9244(1);
                var23.field3433.method9241(field564);
                var23.field3433.method9241(field509);
                byte var25 = 0;
                var23.field3433.method9241(var25);
                var23.field3433.method9251(var21.field5463, 0, var21.field5462);
                int var26 = var23.field3433.field5462;
                var23.field3433.method9248(class79.field947);
                var23.field3433.method9241((field740 ? 1 : 0) << 1 | (field506 ? 1 : 0));
                var23.field3433.method9257(Statics.field74);
                var23.field3433.method9257(Statics.field2983);
                class557 var27 = var23.field3433;
                if (field635 == null) {
                    byte[] var28 = class221.method5();
                    var27.method9251(var28, 0, var28.length);
                } else {
                    var27.method9251(field635, 0, field635.length);
                }
                var23.field3433.method9248(Statics.field1669);
                var23.field3433.method9244(Statics.field5508);
                var23.field3433.method9241(0);
                class558 var29 = new class558(Statics.field1536.method8687());
                Statics.field1536.method8686(var29);
                var23.field3433.method9251(var29.field5463, 0, var29.field5463.length);
                var23.field3433.method9241(field564);
                var23.field3433.method9244(0);
                if (Statics.field720) {
                    Statics.method3350(var23);
                } else {
                    Statics.method276(var23);
                }
                var23.field3433.method9428(var22, var26, var23.field3433.field5462);
                var23.field3433.method9254(var23.field3433.field5462 - var24);
                field784.method3070(var23);
                field784.method3048();
                field784.field1485 = new class575(var22);
                int[] var30 = new int[4];
                for (int var31 = 0; var31 < 4; var31++) {
                    var30[var31] = var22[var31] + 50;
                }
                var2.method9199(var30);
                method3428(class69.field478);
            }
            if (Statics.field3765 == class69.field478 && var1.method8500() > 0) {
                int var32 = var1.method8498();
                if (var32 == 61) {
                    int var33 = var1.method8500();
                    Statics.field4742 = var33 == 1 && var1.method8498() == 1;
                    method3428(class69.field477);
                }
                if (var32 == 21 && field551 == 20) {
                    method3428(class69.field484);
                } else if (var32 == 2) {
                    if (Statics.field720) {
                        method3428(class69.field495);
                    } else {
                        method3428(class69.field486);
                    }
                } else if (var32 == 15 && field551 == 40) {
                    field784.field1475 = -1;
                    method3428(class69.field492);
                } else if (var32 == 64) {
                    method3428(class69.field496);
                } else if (var32 == 23 && field542 < 1) {
                    field542++;
                    method3428(class69.field487);
                } else if (var32 == 29) {
                    method3428(class69.field491);
                } else if (var32 == 69) {
                    method3428(class69.field483);
                } else {
                    method3106(var32);
                    return;
                }
            }
            if (Statics.field3765 == class69.field495) {
                Statics.field2403 = true;
                method7737(class96.field1167);
                Statics.method3201(0);
            }
            if (Statics.field3765 == class69.field483 && var1.method8500() >= 2) {
                var1.method8501(var2.field5463, 0, 2);
                var2.field5462 = 0;
                Statics.field1516 = var2.method9260();
                method3428(class69.field480);
            }
            if (Statics.field3765 == class69.field480 && var1.method8500() >= Statics.field1516) {
                var2.field5462 = 0;
                var1.method8501(var2.field5463, var2.field5462, Statics.field1516);
                class7 var34 = class7.method3097()[var2.method9258()];
                try {
                    switch(var34.field13) {
                        case 0:
                            class1 var35 = new class1();
                            this.field562 = new class8(var2, var35);
                            method3428(class69.field481);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var57) {
                    method3106(22);
                    return;
                }
            }
            if (Statics.field3765 == class69.field481 && this.field562.method45()) {
                this.field632 = this.field562.method44();
                this.field562.method46();
                this.field562 = null;
                if (this.field632 == null) {
                    method3106(22);
                    return;
                }
                field784.method3066();
                class325 var38 = class325.method5954();
                var38.field3433.method9241(class327.field3591.field3592);
                var38.field3433.method9257(this.field632.field5462);
                var38.field3433.method9252(this.field632);
                field784.method3070(var38);
                field784.method3048();
                this.field632 = null;
                method3428(class69.field478);
            }
            if (Statics.field3765 == class69.field496 && var1.method8500() > 0) {
                Statics.field3305 = var1.method8498();
                method3428(class69.field493);
            }
            if (Statics.field3765 == class69.field493 && var1.method8500() >= Statics.field3305) {
                var1.method8501(var2.field5463, 0, Statics.field3305);
                var2.field5462 = 0;
                method3428(class69.field478);
            }
            if (Statics.field3765 == class69.field484 && var1.method8500() > 0) {
                field543 = (var1.method8498() + 3) * 60;
                method3428(class69.field485);
            }
            if (Statics.field3765 == class69.field485) {
                field541 = 0;
                class79.method3224(class383.field4222, class383.field4223, field543 / 60 + class383.field4224);
                if (--field543 <= 0) {
                    method3428(class69.field487);
                }
            } else if (Statics.field3765 == class69.field490) {
                class325 var39 = class325.method5954();
                var39.field3433.method9241(class327.field3587.field3592);
                var39.field3433.method9257(class327.field3587.field3593);
                var39.field3433.method9314(Statics.field2401.field4592);
                var39.field3433.method9313(Statics.field1966.field4592);
                var39.field3433.method9312(Statics.field2055.field4592);
                var39.field3433.method9313(Statics.field1492.field4592);
                var39.field3433.method9244(Statics.field3.field4592);
                var39.field3433.method9312(Statics.field4721.field4592);
                var39.field3433.method9244(0);
                var39.field3433.method9314(Statics.field2469.field4592);
                var39.field3433.method9313(Statics.field1747.field4592);
                var39.field3433.method9244(Statics.field3138.field4592);
                var39.field3433.method9314(Statics.field1738.field4592);
                var39.field3433.method9314(Statics.field3819.field4592);
                var39.field3433.method9312(Statics.field406.field4592);
                var39.field3433.method9314(Statics.field1850.field4592);
                field784.method3070(var39);
                field784.method3048();
                method3428(class69.field486);
            } else {
                if (Statics.field3765 == class69.field486 && var1.method8500() >= 1) {
                    Statics.field1667 = var1.method8498();
                    if (Statics.field1667 != class327.field3590.field3593) {
                        method3106(Statics.field1667);
                        return;
                    }
                    method3428(class69.field498);
                }
                if (Statics.field3765 == class69.field498 && var1.method8500() >= Statics.field1667) {
                    boolean var40 = var1.method8498() == 1;
                    var1.method8501(var2.field5463, 0, 4);
                    var2.field5462 = 0;
                    boolean var41 = false;
                    if (var40) {
                        int var42 = var2.method9222() << 24;
                        int var43 = var42 | var2.method9222() << 16;
                        int var44 = var43 | var2.method9222() << 8;
                        int var45 = var44 | var2.method9222();
                        Statics.field2378.method2737(class79.field947, var45);
                    }
                    if (field791) {
                        Statics.field2378.method2766(class79.field947);
                    } else {
                        Statics.field2378.method2766((String) null);
                    }
                    class103.method6908();
                    field674 = var1.method8498();
                    field676 = var1.method8498() == 1;
                    field630 = var1.method8498();
                    field630 <<= 0x8;
                    field630 += var1.method8498();
                    field631 = var1.method8498();
                    var1.method8501(var2.field5463, 0, 8);
                    var2.field5462 = 0;
                    this.field563 = var2.method9265();
                    var1.method8501(var2.field5463, 0, 8);
                    var2.field5462 = 0;
                    field657 = var2.method9265();
                    var1.method8501(var2.field5463, 0, 8);
                    var2.field5462 = 0;
                    field633 = var2.method9265();
                    class226.method7443().method4306(this.field688);
                    method3428(class69.field488);
                }
                if (Statics.field3765 == class69.field488 && var1.method8500() >= field784.field1475) {
                    var1.method8501(var2.field5463, 0, 1);
                    var2.field5462 = 0;
                    if (var2.method9203()) {
                        var1.method8501(var2.field5463, 1, 1);
                        var2.field5462 = 0;
                    }
                    class326[] var46 = class326.method1234();
                    int var47 = var2.method9221();
                    if (var47 < 0 || var47 >= var46.length) {
                        throw new IOException("Invalid ServerProt: " + var47 + " at " + var2.field5462);
                    }
                    field784.field1474 = var46[var47];
                    field784.field1475 = field784.field1474.field3582;
                    var1.method8501(var2.field5463, 0, 2);
                    var2.field5462 = 0;
                    field784.field1475 = var2.method9260();
                    try {
                        class27.method388(Statics.field995, "zap");
                    } catch (Throwable var56) {
                    }
                    method3428(class69.field489);
                }
                if (Statics.field3765 != class69.field489) {
                    if (Statics.field3765 == class69.field491 && var1.method8500() >= 2) {
                        var2.field5462 = 0;
                        var1.method8501(var2.field5463, 0, 2);
                        var2.field5462 = 0;
                        Statics.field1126 = var2.method9260();
                        method3428(class69.field482);
                    }
                    if (Statics.field3765 == class69.field482 && var1.method8500() >= Statics.field1126) {
                        var2.field5462 = 0;
                        var1.method8501(var2.field5463, 0, Statics.field1126);
                        var2.field5462 = 0;
                        String var49 = var2.method9269();
                        String var50 = var2.method9269();
                        String var51 = var2.method9269();
                        class79.method3224(var49, var50, var51);
                        Statics.method3201(10);
                        if (field617.method9581()) {
                            class79.method42(9);
                        }
                    }
                    if (Statics.field3765 == class69.field492) {
                        if (field784.field1475 == -1) {
                            if (var1.method8500() < 2) {
                                return;
                            }
                            var1.method8501(var2.field5463, 0, 2);
                            var2.field5462 = 0;
                            field784.field1475 = var2.method9260();
                        }
                        if (var1.method8500() >= field784.field1475) {
                            var1.method8501(var2.field5463, 0, field784.field1475);
                            var2.field5462 = 0;
                            int var52 = field784.field1475;
                            field570.method8128();
                            field784.method3066();
                            field784.field1473.field5462 = 0;
                            field784.field1474 = null;
                            field784.field1479 = null;
                            field784.field1480 = null;
                            field784.field1481 = null;
                            field784.field1475 = 0;
                            field784.field1468 = 0;
                            field525 = 0;
                            method15();
                            field771 = 0;
                            field747 = 0;
                            Statics.field2071.method2835();
                            class88.field1073 = new class531(32);
                            Statics.method3201(30);
                            for (int var53 = 0; var53 < 100; var53++) {
                                field716[var53] = true;
                            }
                            if (field784 != null && field784.field1485 != null) {
                                class325 var54 = class325.method2983(class323.field3336, field784.field1485);
                                var54.field3433.method9241(method3408());
                                var54.field3433.method9257(Statics.field74);
                                var54.field3433.method9257(Statics.field2983);
                                field784.method3070(var54);
                            }
                            field583.method2947(var2);
                            if (var2.field5462 != var52) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field541++;
                        if (field541 > 2000) {
                            if (field542 < 1) {
                                if (Statics.field1995 == Statics.field169) {
                                    Statics.field1995 = Statics.field4872;
                                } else {
                                    Statics.field1995 = Statics.field169;
                                }
                                field542++;
                                method3428(class69.field487);
                            } else {
                                method3106(-3);
                            }
                        }
                    }
                } else if (var1.method8500() >= field784.field1475) {
                    var2.field5462 = 0;
                    var1.method8501(var2.field5463, 0, field784.field1475);
                    field570.method8126();
                    method7228();
                    field583.method2947(var2);
                    Statics.field194 = Statics.field3772;
                    Statics.field3814 = -1;
                    method5221(false, var2);
                    field784.field1474 = null;
                    field514 = false;
                }
            }
        } catch (IOException var64) {
            if (field542 < 1) {
                if (Statics.field1995 == Statics.field169) {
                    Statics.field1995 = Statics.field4872;
                } else {
                    Statics.field1995 = Statics.field169;
                }
                field542++;
                method3428(class69.field487);
            } else {
                method3106(-2);
            }
        }
    }

    @ObfuscatedName("pn.gk(I)V")
    public static void method7228() {
        field520 = 1L;
        if (Statics.field4985 != null) {
            Statics.field4985.field1111 = 0;
        }
        Statics.field3283 = true;
        field524 = true;
        field710 = -1L;
        class37.method201();
        field784.method3066();
        field784.field1473.field5462 = 0;
        field784.field1474 = null;
        field784.field1479 = null;
        field784.field1480 = null;
        field784.field1481 = null;
        field784.field1475 = 0;
        field784.field1468 = 0;
        field525 = 0;
        field568 = 0;
        field526 = 0;
        method15();
        class36.field199 = 0;
        class116.field1465.clear();
        class116.field1464.method8963();
        class116.field1467.method7421();
        class116.field1466 = 0;
        field659 = 0;
        field661 = false;
        field751 = 0;
        field592 = 0;
        field797 = 0;
        Statics.field923 = null;
        field771 = 0;
        field579 = -1;
        field747 = 0;
        field748 = 0;
        field534 = class109.field1395;
        field535 = class109.field1395;
        field684.method2583();
        field583.method2957();
        Statics.field1072.method1969();
        if (Statics.field2934 > 5000) {
        }
        if (field597) {
            Arrays.fill(class350.field3775, 0);
            Arrays.fill(class350.field3773, 0);
        } else {
            for (int var0 = 0; var0 < Statics.field2934; var0++) {
                class182 var1 = class182.method696(var0);
                if (var1 != null) {
                    class350.field3775[var0] = 0;
                    class350.field3773[var0] = 0;
                }
            }
        }
        if (Statics.field5155 != null) {
            Statics.field5155.method2991();
        }
        field675 = -1;
        if (field723 != -1) {
            Statics.field4741.method6296(field723);
        }
        for (class90 var2 = (class90) field667.method8996(); var2 != null; var2 = (class90) field667.method8999()) {
            method7489(var2, true);
        }
        field723 = -1;
        field667 = new class531(8);
        field671 = null;
        method15();
        field605.method6331((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var3 = 0; var3 < 8; var3++) {
            field641[var3] = null;
            field642[var3] = false;
        }
        class88.field1073 = new class531(32);
        field517 = true;
        for (int var4 = 0; var4 < 100; var4++) {
            field716[var4] = true;
        }
        if (field784 != null && field784.field1485 != null) {
            class325 var5 = class325.method2983(class323.field3336, field784.field1485);
            var5.field3433.method9241(method3408());
            var5.field3433.method9257(Statics.field74);
            var5.field3433.method9257(Statics.field2983);
            field784.method3070(var5);
        }
        Statics.field1216 = null;
        Statics.field804 = null;
        Arrays.fill(field776, (Object) null);
        Statics.field1750 = null;
        Arrays.fill(field741, (Object) null);
        for (int var6 = 0; var6 < 8; var6++) {
            field700[var6] = new class401();
        }
        Statics.field3759 = null;
        field709 = 0;
        field780 = 0;
        field781 = 0;
        field582 = 0;
    }

    @ObfuscatedName("ej.hr(II)V")
    public static void method3106(int arg0) {
        int var1 = Statics.method3213();
        if (arg0 == -3) {
            class79.method3224(class383.field4225, class383.field4440, class383.field4265);
        } else if (arg0 == -2) {
            class79.method3224(class383.field4228, class383.field4229, class383.field4230);
        } else if (arg0 == -1) {
            class79.method3224(class383.field4231, class383.field4232, class383.field4233);
        } else if (arg0 == 3) {
            class79.method42(3);
            class79.field939 = 1;
        } else if (arg0 == 4) {
            class79.method2117(0);
        } else if (arg0 == 5) {
            class79.field939 = 2;
            class79.method3224(class383.field4325, class383.field4305, class383.field4239);
        } else if (arg0 == 68) {
            if (!field514) {
                field514 = true;
                method810();
                return;
            }
            class79.method3224(class383.field4375, class383.field4241, class383.field4242);
        } else if (!field765 && arg0 == 6) {
            class79.method3224(class383.field4375, class383.field4241, class383.field4242);
        } else if (arg0 == 7) {
            class79.method3224(class383.field4359, class383.field4180, class383.field4245);
        } else if (arg0 == 8) {
            class79.method3224(class383.field4246, class383.field4247, class383.field4237);
        } else if (arg0 == 9) {
            class79.method3224(class383.field4249, class383.field4250, class383.field4227);
        } else if (arg0 == 10) {
            class79.method3224(class383.field4252, class383.field4186, class383.field4485);
        } else if (arg0 == 11) {
            class79.method3224(class383.field4270, class383.field4256, class383.field4386);
        } else if (arg0 == 12) {
            class79.method3224(class383.field4258, class383.field4259, class383.field4260);
        } else if (arg0 == 13) {
            class79.method3224(class383.field4261, class383.field4211, class383.field4248);
        } else if (arg0 == 14) {
            class79.method3224(class383.field4264, class383.field4244, class383.field4266);
        } else if (arg0 == 16) {
            class79.method3224(class383.field4267, class383.field4268, class383.field4306);
            class79.method42(33);
        } else if (arg0 == 17) {
            class79.method3224(class383.field4377, class383.field4349, class383.field4209);
        } else if (arg0 == 18) {
            class79.method42(14);
            class79.field927 = 1;
        } else if (arg0 == 19) {
            class79.method3224(class383.field4276, class383.field4277, class383.field4240);
        } else if (arg0 == 20) {
            class79.method3224(class383.field4279, class383.field4280, class383.field4281);
        } else if (arg0 == 22) {
            class79.method3224(class383.field4327, class383.field4283, class383.field4284);
        } else if (arg0 == 23) {
            class79.method3224(class383.field4302, class383.field4408, class383.field4407);
        } else if (arg0 == 24) {
            class79.method3224(class383.field4288, class383.field4218, class383.field4290);
        } else if (arg0 == 25) {
            class79.method3224(class383.field4291, class383.field4282, class383.field4293);
        } else if (arg0 == 26) {
            class79.method3224(class383.field4294, class383.field4437, class383.field4217);
        } else if (arg0 == 27) {
            class79.method3224(class383.field4196, class383.field4298, class383.field4299);
        } else if (arg0 == 31) {
            class79.method3224(class383.field4210, class383.field4307, class383.field4308);
        } else if (arg0 == 32) {
            class79.method42(14);
            class79.field927 = 2;
        } else if (arg0 == 37) {
            class79.method3224(class383.field4312, class383.field4447, class383.field4314);
        } else if (arg0 == 38) {
            class79.method3224(class383.field4315, class383.field4486, class383.field4317);
        } else if (arg0 == 74) {
            class79.method3224(class383.field4318, class383.field4319, class383.field4320);
        } else if (arg0 == 55) {
            class79.method42(8);
        } else if (arg0 == 56) {
            class79.method3224(class383.field4193, class383.field4326, class383.field4398);
            Statics.method3201(11);
            return;
        } else if (arg0 == 57) {
            class79.method3224(class383.field4328, class383.field4329, class383.field4330);
            Statics.method3201(11);
            return;
        } else if (arg0 == 61) {
            class79.method3224("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class79.method42(7);
        } else if (arg0 == 62) {
            Statics.method3201(10);
            class79.method42(9);
            class79.method3224(class383.field4331, class383.field4483, class383.field4333);
            return;
        } else if (arg0 == 63) {
            Statics.method3201(10);
            class79.method42(9);
            class79.method3224(class383.field4334, class383.field4253, class383.field4336);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            Statics.method3201(10);
            class79.method42(9);
            class79.method3224(class383.field4316, class383.field4338, class383.field4379);
            return;
        } else if (arg0 == 71) {
            Statics.method3201(10);
            class79.method42(7);
            class79.method3224("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            Statics.method3201(10);
            class79.method42(6);
            class79.method3224(class383.field4469, class383.field4470, class383.field4393);
        } else if (arg0 == 72) {
            Statics.method3201(10);
            class79.method42(32);
        } else {
            class79.method3224(class383.field4448, class383.field4341, class383.field4286);
        }
        Statics.method3201(10);
        boolean var2 = var1 != Statics.method3213();
        if (!var2 && field617.method9581()) {
            class79.method42(9);
        }
    }

    @ObfuscatedName("oz.hc(B)V")
    public static final void method6988() {
        field784.method3051();
        method2842();
        field684.method2583();
        field583.method2957();
        field755.method5225();
        System.gc();
        class334.method3533(0, 0);
        class334.method3610();
        field750 = false;
        class72.method5757();
        Statics.method3201(10);
        field519 = 0;
        class226.method7443().method4289();
        class226.method7443().method4282();
    }

    @ObfuscatedName("dt.hq(II)V")
    public static final void method2479(int arg0) {
        method6988();
        switch(arg0) {
            case 1:
                class79.method42(24);
                class79.method3224(class383.field4416, class383.field4417, class383.field4418);
                break;
            case 2:
                class79.method695();
        }
    }

    @ObfuscatedName("fp.hu(B)J")
    public static long method3293() {
        return field657;
    }

    @ObfuscatedName("ah.ha(B)J")
    public static long method375() {
        return field633;
    }

    @ObfuscatedName("dn.ho(B)V")
    public static final void method2842() {
        class189.field1964.method5930();
        class191.method4932();
        class180.method2665();
        class550.method8115();
        class548.field5396.method5930();
        class190.field1967.method5930();
        class212.method4052();
        class201.method3440();
        class187.field1950.method5930();
        class187.field1951.method5930();
        class208.method2945();
        class179.field1888.method5930();
        class186.field1937.method5930();
        class177.field1881.method5930();
        class210.method2381();
        class184.field1916.method5930();
        class192.method5770();
        class195.method3522();
        class211.field2249.method5930();
        class211.field2226.method5930();
        class211.field2235.method5930();
        class206.method2501();
        class213.field2307.method5930();
        class213.field2308.method5930();
        class213.field2312.method5930();
        class200.field2083.method5930();
        class200.field2084.method5930();
        class207.method4986();
        class204.method693();
        if (Statics.field67 != null) {
            Statics.field67.method9087();
        }
        if (Statics.field407 != null) {
            Statics.field407.method9087();
        }
        class196.field2057.method5930();
        class198.method3703();
        class185.field1934.method5930();
        class183.method3385();
        class178.field1885.method5930();
        class181.field1896.method5930();
        class205.method3638();
        class182.method4931();
        class202.method3174();
        field782.method5930();
        field792.method5930();
        class359.field3831.method5930();
        class359.field3829.method8231();
        class359.field3830 = 0;
        if (Statics.field4741 != null) {
            Statics.field4741.method6301();
        }
        if (class240.field2589.field2913 != null) {
            ((class252) class240.field2589.field2913).method4955();
        }
        class82.method199();
        field790.method8231();
        if (Statics.field2401 != null) {
            Statics.field2401.method7008();
        }
        if (Statics.field1850 != null) {
            Statics.field1850.method7008();
        }
        if (Statics.field6 != null) {
            Statics.field6.method7008();
        }
        if (Statics.field3 != null) {
            Statics.field3.method7008();
        }
        if (Statics.field406 != null) {
            Statics.field406.method7008();
        }
        if (Statics.field1760 != null) {
            Statics.field1760.method7008();
        }
        if (Statics.field2055 != null) {
            Statics.field2055.method7008();
        }
        if (Statics.field963 != null) {
            Statics.field963.method7008();
        }
        if (Statics.field3138 != null) {
            Statics.field3138.method7008();
        }
        if (Statics.field4702 != null) {
            Statics.field4702.method7008();
        }
        if (Statics.field2225 != null) {
            Statics.field2225.method7008();
        }
        if (Statics.field3819 != null) {
            Statics.field3819.method7008();
        }
        if (Statics.field1966 != null) {
            Statics.field1966.method7008();
        }
        if (Statics.field205 != null) {
            Statics.field205.method7008();
        }
        if (Statics.field1738 != null) {
            Statics.field1738.method7008();
        }
        if (Statics.field3307 != null) {
            Statics.field3307.method7008();
        }
        if (Statics.field4893 != null) {
            Statics.field4893.method7008();
        }
        if (Statics.field4721 != null) {
            Statics.field4721.method7008();
        }
        if (Statics.field1657 != null) {
            Statics.field1657.method7008();
        }
        if (Statics.field2469 != null) {
            Statics.field2469.method7008();
        }
        if (Statics.field1747 != null) {
            Statics.field1747.method7008();
        }
        if (Statics.field1492 != null) {
            Statics.field1492.method7008();
        }
    }

    @ObfuscatedName("ft.hd(B)V")
    public static final void method3407() {
        Statics.field4651 = null;
        Statics.field4646 = null;
        Statics.field1939 = 0;
    }

    @ObfuscatedName("lg.he(I)V")
    public static final void method5769() {
        if (field568 > 0) {
            method6988();
        } else {
            field570.method8124();
            Statics.method3201(40);
            Statics.field2064 = field784.method3053();
            field784.method3052();
        }
    }

    @ObfuscatedName("client.ht(I)V")
    public final void method1253() {
        if (field525 > 1) {
            field525--;
        }
        if (field568 > 0) {
            field568--;
        }
        if (field527) {
            field527 = false;
            method5769();
            return;
        }
        if (!field650) {
            method5810();
        }
        for (int var1 = 0; var1 < 100 && this.method1259(field784); var1++) {
        }
        if (field551 != 30) {
            return;
        }
        while (class37.method6194()) {
            class325 var2 = class325.method2983(class323.field3324, field784.field1485);
            var2.field3433.method9241(0);
            int var3 = var2.field3433.field5462;
            class37.method3521(var2.field3433);
            var2.field3433.method9283(var2.field3433.field5462 - var3);
            field784.method3070(var2);
        }
        if (field570.field4922) {
            class325 var4 = class325.method2983(class323.field3371, field784.field1485);
            var4.field3433.method9241(0);
            int var5 = var4.field3433.field5462;
            field570.method8140(var4.field3433);
            var4.field3433.method9283(var4.field3433.field5462 - var5);
            field784.method3070(var4);
            field570.method8127();
        }
        Object var6 = Statics.field4985.field1112;
        synchronized (Statics.field4985.field1112) {
            if (!field789) {
                Statics.field4985.field1111 = 0;
            } else if (class36.field197 != 0 || Statics.field4985.field1111 >= 40) {
                class325 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field4985.field1111 && (var7 == null || var7.field3433.field5462 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field4985.field1115[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field4985.field1114[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field707 != var14 || field724 != var13) {
                        if (var7 == null) {
                            var7 = class325.method2983(class323.field3316, field784.field1485);
                            var7.field3433.method9241(0);
                            var8 = var7.field3433.field5462;
                            var7.field3433.field5462 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field523 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field707;
                            var16 = var13 - field724;
                            var17 = (int) ((Statics.field4985.field1116[var12] - field523) / 20L);
                            var10 = (int) ((Statics.field4985.field1116[var12] - field523) % 20L + (long) var10);
                        }
                        field707 = var14;
                        field724 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field3433.method9257((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field3433.method9241(var17 + 128);
                            var7.field3433.method9257((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field3433.method9241(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3433.method9244(Integer.MIN_VALUE);
                            } else {
                                var7.field3433.method9244(var14 | var13 << 16);
                            }
                        } else {
                            var7.field3433.method9257((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3433.method9244(Integer.MIN_VALUE);
                            } else {
                                var7.field3433.method9244(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field523 = Statics.field4985.field1116[var12];
                    }
                }
                if (var7 != null) {
                    var7.field3433.method9283(var7.field3433.field5462 - var8);
                    int var18 = var7.field3433.field5462;
                    var7.field3433.field5462 = var8;
                    var7.field3433.method9241(var10 / var11);
                    var7.field3433.method9241(var10 % var11);
                    var7.field3433.field5462 = var18;
                    field784.method3070(var7);
                }
                if (var9 >= Statics.field4985.field1111) {
                    Statics.field4985.field1111 = 0;
                } else {
                    Statics.field4985.field1111 -= var9;
                    System.arraycopy(Statics.field4985.field1114, var9, Statics.field4985.field1114, 0, Statics.field4985.field1111);
                    System.arraycopy(Statics.field4985.field1115, var9, Statics.field4985.field1115, 0, Statics.field4985.field1111);
                    System.arraycopy(Statics.field4985.field1116, var9, Statics.field4985.field1116, 0, Statics.field4985.field1111);
                }
            }
        }
        if (class36.field197 == 1 || !Statics.field1704 && class36.field197 == 4 || class36.field197 == 2) {
            long var20 = class36.field215 - field520 * -1L;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field520 = class36.field215 * -1L;
            int var22 = class36.field214;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field2983) {
                var22 = Statics.field2983;
            }
            int var23 = class36.field213;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field74) {
                var23 = Statics.field74;
            }
            int var24 = (int) var20;
            class325 var25 = class325.method2983(class323.field3367, field784.field1485);
            var25.field3433.method9257((var24 << 1) + (class36.field197 == 2 ? 1 : 0));
            var25.field3433.method9257(var23);
            var25.field3433.method9257(var22);
            field784.method3070(var25);
        }
        if (field694 != 0) {
            class325 var26 = class325.method2983(class323.field3351, field784.field1485);
            var26.field3433.method9257(field694);
            field784.method3070(var26);
        }
        if (field734.field2991 > 0) {
            class325 var27 = class325.method2983(class323.field3366, field784.field1485);
            var27.field3433.method9257(0);
            int var28 = var27.field3433.field5462;
            long var29 = class330.method2257();
            for (int var31 = 0; var31 < field734.field2991; var31++) {
                long var32 = var29 - field710;
                if (var32 > 16777215L) {
                    var32 = 16777215L;
                }
                field710 = var29;
                var27.field3433.method9306((int) var32);
                var27.field3433.method9288(field734.field2987[var31]);
            }
            var27.field3433.method9254(var27.field3433.field5462 - var28);
            field784.method3070(var27);
        }
        if (field606 > 0) {
            field606--;
        }
        if (field734.method5249(96) || field734.method5249(97) || field734.method5249(98) || field734.method5249(99)) {
            field607 = true;
        }
        if (field607 && field606 <= 0) {
            field606 = 20;
            field607 = false;
            class325 var34 = class325.method2983(class323.field3406, field784.field1485);
            var34.field3433.method9257(field552);
            var34.field3433.method9257(field592);
            field784.method3070(var34);
        }
        if (Statics.field3283 && !field524) {
            field524 = true;
            class325 var35 = class325.method2983(class323.field3349, field784.field1485);
            var35.field3433.method9241(1);
            field784.method3070(var35);
        }
        if (!Statics.field3283 && field524) {
            field524 = false;
            class325 var36 = class325.method2983(class323.field3349, field784.field1485);
            var36.field3433.method9241(0);
            field784.method3070(var36);
        }
        if (Statics.field472 != null) {
            Statics.field472.method8732();
        }
        if (Statics.field2470) {
            if (Statics.field1216 != null) {
                Statics.field1216.method8367();
            }
            method6312();
            Statics.field2470 = false;
        }
        if (Statics.field849) {
            Iterator var37 = field684.iterator();
            while (var37.hasNext()) {
                class104 var38 = (class104) var37.next();
                for (int var39 = 0; var39 < field583.field1426; var39++) {
                    class95 var40 = Statics.field2071.field1357[field583.field1427[var39]];
                    if (var40 != null) {
                        var40.method2515();
                    }
                }
            }
            Statics.field849 = false;
        }
        method6896();
        if (field551 != 30) {
            return;
        }
        Iterator var41 = field684.iterator();
        while (var41.hasNext()) {
            class104 var42 = (class104) var41.next();
            for (class99 var43 = (class99) var42.field1341.method7247(); var43 != null; var43 = (class99) var42.field1341.method7249()) {
                if (var43.field1212 > 0) {
                    var43.field1212--;
                }
                if (var43.field1212 == 0) {
                    if (var43.field1209 >= 0) {
                        int var44 = var43.field1209;
                        int var45 = var43.field1205;
                        class210 var46 = class210.method3109(var44);
                        if (var45 == 11) {
                            var45 = 10;
                        }
                        if (var45 >= 5 && var45 <= 8) {
                            var45 = 4;
                        }
                        boolean var47 = var46.method3956(var45);
                        if (!var47) {
                            continue;
                        }
                    }
                    method3528(var42, var43.field1206, var43.field1200, var43.field1199, var43.field1202, var43.field1209, var43.field1203, var43.field1205, var43.field1215);
                    var43.method8667();
                } else {
                    if (var43.field1211 > 0) {
                        var43.field1211--;
                    }
                    if (var43.field1211 == 0 && var43.field1199 >= 1 && var43.field1202 >= 1 && var43.field1199 <= 102 && var43.field1202 <= 102) {
                        if (var43.field1201 >= 0) {
                            int var48 = var43.field1201;
                            int var49 = var43.field1208;
                            class210 var50 = class210.method3109(var48);
                            if (var49 == 11) {
                                var49 = 10;
                            }
                            if (var49 >= 5 && var49 <= 8) {
                                var49 = 4;
                            }
                            boolean var51 = var50.method3956(var49);
                            if (!var51) {
                                continue;
                            }
                        }
                        method3528(var42, var43.field1206, var43.field1200, var43.field1199, var43.field1202, var43.field1201, var43.field1207, var43.field1208, var43.field1215);
                        var43.field1211 = -1;
                        if (var43.field1209 == var43.field1201 && var43.field1209 == -1) {
                            var43.method8667();
                        } else if (var43.field1209 == var43.field1201 && var43.field1207 == var43.field1203 && var43.field1208 == var43.field1205) {
                            var43.method8667();
                        }
                    }
                }
            }
        }
        int var10002;
        for (int var52 = 0; var52 < field751; var52++) {
            var10002 = field754[var52]--;
            if (field754[var52] >= -10) {
                class40 var54 = field757[var52];
                if (var54 == null) {
                    class40 var10000 = (class40) null;
                    var54 = class40.method753(Statics.field2225, field504[var52], 0);
                    if (var54 == null) {
                        continue;
                    }
                    field754[var52] += var54.method751();
                    field757[var52] = var54;
                }
                if (field754[var52] < 0) {
                    int var63;
                    if (field752[var52] == 0) {
                        var63 = Statics.field2378.method2728();
                    } else {
                        int var55 = (field752[var52] & 0xFF) * 128;
                        int var56 = field752[var52] >> 16 & 0xFF;
                        int var57 = Math.abs(class351.method6261(var56) - Statics.field3772.field1247);
                        int var58 = field752[var52] >> 8 & 0xFF;
                        int var59 = Math.abs(class351.method6261(var58) - Statics.field3772.field1270);
                        int var60 = Math.max(var57 + var59 - 128, 0);
                        int var61 = Math.max(((field574[var52] & 0x1F) - 1) * 128, 0);
                        if (var60 >= var55) {
                            field754[var52] = -100;
                            continue;
                        }
                        float var62 = var61 < var55 ? Math.min(Math.max((float) (var55 - var60) / (float) (var55 - var61), 0.0F), 1.0F) : 1.0F;
                        var63 = (int) (var62 * (float) Statics.field2378.method2730());
                    }
                    if (var63 > 0) {
                        class41 var64 = var54.method739().method756(Statics.field3638);
                        class49 var65 = class49.method957(var64, 100, var63);
                        var65.method879(field753[var52] - 1);
                        Statics.field4035.method697(var65);
                    }
                    field754[var52] = -100;
                }
            } else {
                field751--;
                for (int var53 = var52; var53 < field751; var53++) {
                    field504[var53] = field504[var53 + 1];
                    field757[var53] = field757[var53 + 1];
                    field753[var53] = field753[var53 + 1];
                    field754[var53] = field754[var53 + 1];
                    field752[var53] = field752[var53 + 1];
                    field574[var53] = field574[var53 + 1];
                }
                var52--;
            }
        }
        if (field750 && !class334.method5222()) {
            if (Statics.field2378.method2726() != 0) {
                boolean var66 = !class334.field3629.isEmpty();
                if (var66) {
                    class334.method4940(Statics.field205, Statics.field2378.method2726());
                }
            }
            field750 = false;
        }
        field784.field1468++;
        if (field784.field1468 > 750) {
            method5769();
            return;
        }
        method3140();
        Iterator var67 = field684.iterator();
        while (var67.hasNext()) {
            class104 var68 = (class104) var67.next();
            for (int var69 = 0; var69 < var68.field1360; var69++) {
                int var70 = var68.field1342[var69];
                class106 var71 = var68.field1353[var70];
                if (var71 != null) {
                    method4673(var68, var71, var71.field1372.field2014);
                }
            }
        }
        method5457();
        method3294();
        field584++;
        if (field626 != 0) {
            field625 += 20;
            if (field625 >= 400) {
                field626 = 0;
            }
        }
        class362 var72 = Statics.field273;
        class362 var73 = Statics.field5243;
        Statics.field273 = null;
        Statics.field5243 = null;
        field682 = null;
        field692 = false;
        field559 = false;
        field736 = 0;
        while (field734.method5242() && field736 < 128) {
            if (field674 >= 2 && field734.method5249(82) && field734.field2989 == 66) {
                StringBuilder var74 = new StringBuilder();
                Iterator var75 = class116.field1464.iterator();
                while (var75.hasNext()) {
                    class65 var76 = (class65) var75.next();
                    if (var76.field455 != null && !var76.field455.isEmpty()) {
                        var74.append(var76.field455).append(':');
                    }
                    var74.append(var76.field459).append('\n');
                }
                String var77 = var74.toString();
                Statics.field995.method494(var77);
            } else if (field797 != 1 || field734.field2997 <= 0) {
                field738[field736] = field734.field2989;
                field737[field736] = field734.field2997;
                field736++;
            }
        }
        if (method3291() && field734.method5249(82) && field734.method5249(81) && field694 != 0) {
            int var79 = Statics.field3772.field1148 - field694;
            if (var79 < 0) {
                var79 = 0;
            } else if (var79 > 3) {
                var79 = 3;
            }
            if (Statics.field3772.field1148 != var79) {
                int var80 = Statics.field2071.field1347 + Statics.field3772.field1288[0];
                int var81 = Statics.field2071.field1348 + Statics.field3772.field1234[0];
                class325 var82 = class325.method2983(class323.field3403, field784.field1485);
                var82.field3433.method9253(var79);
                var82.field3433.method9313(0);
                var82.field3433.method9297(var81);
                var82.field3433.method9297(var80);
                field784.method3070(var82);
            }
            field694 = 0;
        }
        if (field723 != -1) {
            method3534(field723, 0, 0, Statics.field74, Statics.field2983, 0, 0);
        }
        field555++;
        while (true) {
            class91 var83;
            class362 var84;
            class362 var85;
            do {
                var83 = (class91) field788.method7246();
                if (var83 == null) {
                    while (true) {
                        class91 var86;
                        class362 var87;
                        class362 var88;
                        do {
                            var86 = (class91) field711.method7246();
                            if (var86 == null) {
                                while (true) {
                                    class91 var89;
                                    class362 var90;
                                    class362 var91;
                                    do {
                                        var89 = (class91) field512.method7246();
                                        if (var89 == null) {
                                            boolean var92 = false;
                                            while (true) {
                                                class269 var93 = (class269) field712.method7246();
                                                if (var93 == null) {
                                                    if (!var92 && class36.field197 == 1) {
                                                        field755.method5225();
                                                    }
                                                    this.method1260();
                                                    method4941();
                                                    if (field678 != null) {
                                                        this.method1265();
                                                    }
                                                    Iterator var100 = field684.iterator();
                                                    while (var100.hasNext()) {
                                                        class104 var101 = (class104) var100.next();
                                                        class245 var102 = var101.field1352;
                                                        if (var102.method4735()) {
                                                            int var103 = var102.field2671;
                                                            int var104 = var102.field2684;
                                                            class325 var105 = class325.method2983(class323.field3337, field784.field1485);
                                                            var105.field3433.method9241(5);
                                                            var105.field3433.method9288(field734.method5249(82) ? (field734.method5249(81) ? 2 : 1) : 0);
                                                            var105.field3433.method9299(var101.field1347 + var103);
                                                            var105.field3433.method9298(var101.field1348 + var104);
                                                            field784.method3070(var105);
                                                            field623 = class36.field213;
                                                            field624 = class36.field214;
                                                            field626 = 1;
                                                            field625 = 0;
                                                            field747 = var103;
                                                            field748 = var104;
                                                            var102.method4871();
                                                        }
                                                    }
                                                    if (Statics.field273 != var72) {
                                                        if (var72 != null) {
                                                            method2944(var72);
                                                        }
                                                        if (Statics.field273 != null) {
                                                            method2944(Statics.field273);
                                                        }
                                                    }
                                                    if (Statics.field5243 != var73 && field658 == field545) {
                                                        if (var73 != null) {
                                                            method2944(var73);
                                                        }
                                                        if (Statics.field5243 != null) {
                                                            method2944(Statics.field5243);
                                                        }
                                                    }
                                                    if (Statics.field5243 == null) {
                                                        if (field545 > 0) {
                                                            field545--;
                                                        }
                                                    } else if (field545 < field658) {
                                                        field545++;
                                                        if (field658 == field545) {
                                                            method2944(Statics.field5243);
                                                        }
                                                    }
                                                    if (field797 == 0) {
                                                        int var106 = Statics.field194.method1225();
                                                        int var107 = Statics.field194.method1223();
                                                        if (field521 != -1) {
                                                            class95 var108 = Statics.field3772.field1146.field1357[field521];
                                                            if (var108 != null) {
                                                                class351 var109 = var108.method2629(Statics.field3772.field1146);
                                                                var106 = var109.field3777;
                                                                var107 = var109.field3778;
                                                            }
                                                        }
                                                        int var110 = Statics.field194.method1221();
                                                        if (Statics.field5082 - var106 < -500 || Statics.field5082 - var106 > 500 || Statics.field3241 - var107 < -500 || Statics.field3241 - var107 > 500) {
                                                            Statics.field5082 = var106;
                                                            Statics.field3241 = var107;
                                                        }
                                                        if (Statics.field5082 != var106) {
                                                            Statics.field5082 += (var106 - Statics.field5082) / 16;
                                                        }
                                                        if (Statics.field3241 != var107) {
                                                            Statics.field3241 += (var107 - Statics.field3241) / 16;
                                                        }
                                                        int var111 = Statics.field5082 >> 7;
                                                        int var112 = Statics.field3241 >> 7;
                                                        int var113 = method1164(Statics.field2071, Statics.field5082, Statics.field3241, var110);
                                                        int var114 = 0;
                                                        if (var111 > 3 && var112 > 3 && var111 < 100 && var112 < 100) {
                                                            for (int var115 = var111 - 4; var115 <= var111 + 4; var115++) {
                                                                for (int var116 = var112 - 4; var116 <= var112 + 4; var116++) {
                                                                    int var117 = var110;
                                                                    if (var110 < 3 && (Statics.field2071.field1351[1][var115][var116] & 0x2) == 2) {
                                                                        var117 = var110 + 1;
                                                                    }
                                                                    int var118 = var113 - Statics.field2071.field1350[var117][var115][var116];
                                                                    if (var118 > var114) {
                                                                        var114 = var118;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var119 = var114 * 192;
                                                        if (var119 > 98048) {
                                                            var119 = 98048;
                                                        }
                                                        if (var119 < 32768) {
                                                            var119 = 32768;
                                                        }
                                                        if (var119 > field608) {
                                                            field608 += (var119 - field608) / 24;
                                                        } else if (var119 < field608) {
                                                            field608 += (var119 - field608) / 80;
                                                        }
                                                        Statics.field966 = method1164(Statics.field2071, var106, var107, var110) - field598;
                                                    } else if (field797 == 1) {
                                                        Statics.method1193();
                                                        short var120 = -1;
                                                        if (field734.method5249(33)) {
                                                            var120 = 0;
                                                        } else if (field734.method5249(49)) {
                                                            var120 = 1024;
                                                        }
                                                        if (field734.method5249(48)) {
                                                            if (var120 == 0) {
                                                                var120 = 1792;
                                                            } else if (var120 == 1024) {
                                                                var120 = 1280;
                                                            } else {
                                                                var120 = 1536;
                                                            }
                                                        } else if (field734.method5249(50)) {
                                                            if (var120 == 0) {
                                                                var120 = 256;
                                                            } else if (var120 == 1024) {
                                                                var120 = 768;
                                                            } else {
                                                                var120 = 512;
                                                            }
                                                        }
                                                        byte var121 = 0;
                                                        if (field734.method5249(35)) {
                                                            var121 = -1;
                                                        } else if (field734.method5249(51)) {
                                                            var121 = 1;
                                                        }
                                                        int var122 = 0;
                                                        if (var120 >= 0 || var121 != 0) {
                                                            int var123 = field734.method5249(81) ? field603 : field602;
                                                            var122 = var123 * 16;
                                                            field547 = var120;
                                                            field601 = var121;
                                                        }
                                                        if (field599 < var122) {
                                                            field599 += var122 / 8;
                                                            if (field599 > var122) {
                                                                field599 = var122;
                                                            }
                                                        } else if (field599 > var122) {
                                                            field599 = field599 * 9 / 10;
                                                        }
                                                        if (field599 > 0) {
                                                            int var124 = field599 / 16;
                                                            if (field547 >= 0) {
                                                                int var125 = field547 - Statics.field4586 & 0x7FF;
                                                                int var126 = class240.field2591[var125];
                                                                int var127 = class240.field2592[var125];
                                                                Statics.field5082 += var124 * var126 / 65536;
                                                                Statics.field3241 += var124 * var127 / 65536;
                                                            }
                                                            if (field601 != 0) {
                                                                Statics.field966 += field601 * var124;
                                                                if (Statics.field966 > 0) {
                                                                    Statics.field966 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field547 = -1;
                                                            field601 = -1;
                                                        }
                                                        if (field734.method5249(13)) {
                                                            method2447();
                                                        }
                                                    }
                                                    if (class36.field204 == 4 && Statics.field1704) {
                                                        int var128 = class36.field198 - field596;
                                                        field594 = var128 * 2;
                                                        field596 = var128 == -1 || var128 == 1 ? class36.field198 : (field596 + class36.field198) / 2;
                                                        int var129 = field595 - class36.field195;
                                                        field593 = var129 * 2;
                                                        field595 = var129 == -1 || var129 == 1 ? class36.field195 : (field595 + class36.field195) / 2;
                                                    } else {
                                                        if (field734.method5249(96)) {
                                                            field593 += (-24 - field593) / 2;
                                                        } else if (field734.method5249(97)) {
                                                            field593 += (24 - field593) / 2;
                                                        } else {
                                                            field593 /= 2;
                                                        }
                                                        if (field734.method5249(98)) {
                                                            field594 += (12 - field594) / 2;
                                                        } else if (field734.method5249(99)) {
                                                            field594 += (-12 - field594) / 2;
                                                        } else {
                                                            field594 /= 2;
                                                        }
                                                        field596 = class36.field198;
                                                        field595 = class36.field195;
                                                    }
                                                    field592 = field593 / 2 + field592 & 0x7FF;
                                                    field552 += field594 / 2;
                                                    if (field552 < 128) {
                                                        field552 = 128;
                                                    }
                                                    if (field552 > 383) {
                                                        field552 = 383;
                                                    }
                                                    if (field749) {
                                                        method812();
                                                    } else if (field586) {
                                                        method6895();
                                                    }
                                                    for (int var130 = 0; var130 < 5; var130++) {
                                                        var10002 = field683[var130]++;
                                                    }
                                                    Statics.field5155.method2988();
                                                    int var131 = ++class36.field199 - 1;
                                                    int var133 = field176.method352();
                                                    if (var131 > 15000 && var133 > 15000) {
                                                        field568 = 250;
                                                        class36.field199 = 14500;
                                                        class325 var135 = class325.method2983(class323.field3314, field784.field1485);
                                                        field784.method3070(var135);
                                                    }
                                                    Statics.field1072.method1926();
                                                    Statics.method166();
                                                    field784.field1477++;
                                                    if (field784.field1477 > 50) {
                                                        class325 var136 = class325.method2983(class323.field3332, field784.field1485);
                                                        field784.method3070(var136);
                                                    }
                                                    try {
                                                        field784.method3048();
                                                    } catch (IOException var138) {
                                                        method5769();
                                                    }
                                                    class226.method7443().method4284();
                                                    return;
                                                }
                                                if (var93.field2981.field3881 == 12) {
                                                    var92 = true;
                                                }
                                                if (var93 != null && var93.field2981 != null) {
                                                    if (var93.field2981.field3879 >= 0) {
                                                        class362 var94 = Statics.field4741.method6314(var93.field2981.field3898);
                                                        if (var94 == null || var94.field4009 == null || var94.field4009.length == 0 || var93.field2981.field3879 >= var94.field4009.length || var94.field4009[var93.field2981.field3879] != var93.field2981) {
                                                            continue;
                                                        }
                                                    }
                                                    if (var93.field2981.field3881 == 11 && var93.field2980 == 0) {
                                                        if (var93.field2981.method6765(var93.field2978, var93.field2979, 0, 0)) {
                                                            var93.field2981.method6723().method4205().method4278(1, var93.field2981.method6723().method4158());
                                                            switch(var93.field2981.method6719()) {
                                                                case 0:
                                                                    class32.method7129(var93.field2981.method6721(), true, false);
                                                                    break;
                                                                case 1:
                                                                    int var95 = Statics.method3563(var93.field2981);
                                                                    boolean var96 = (var95 >> 22 & 0x1) != 0;
                                                                    if (var96) {
                                                                        int[] var97 = var93.field2981.method6848();
                                                                        if (var97 != null) {
                                                                            class325 var98 = class325.method2983(class323.field3408, field784.field1485);
                                                                            var98.field3433.method9312(var93.field2981.method6720());
                                                                            var98.field3433.method9244(var97[0]);
                                                                            var98.field3433.method9257(var93.field2981.field3879);
                                                                            var98.field3433.method9313(var93.field2981.field3878);
                                                                            var98.field3433.method9313(var97[1]);
                                                                            var98.field3433.method9312(var97[2]);
                                                                            field784.method3070(var98);
                                                                        }
                                                                    }
                                                            }
                                                        }
                                                    } else if (var93.field2981.field3881 == 12) {
                                                        class360 var99 = var93.field2981.method6707();
                                                        if (var99 != null && var99.method6464()) {
                                                            switch(var93.field2980) {
                                                                case 0:
                                                                    field755.method5224(var93.field2981);
                                                                    var99.method6618(true);
                                                                    var99.method6487(var93.field2978, var93.field2979, field734.method5249(82), field734.method5249(81));
                                                                    break;
                                                                case 1:
                                                                    var99.method6453(var93.field2978, var93.field2979);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        var90 = var89.field1101;
                                        if (var90.field3879 < 0) {
                                            break;
                                        }
                                        var91 = Statics.field4741.method6314(var90.field3898);
                                    } while (var91 == null || var91.field4009 == null || var90.field3879 >= var91.field4009.length || var91.field4009[var90.field3879] != var90);
                                    class73.method8429(var89);
                                }
                            }
                            var87 = var86.field1101;
                            if (var87.field3879 < 0) {
                                break;
                            }
                            var88 = Statics.field4741.method6314(var87.field3898);
                        } while (var88 == null || var88.field4009 == null || var87.field3879 >= var88.field4009.length || var88.field4009[var87.field3879] != var87);
                        class73.method8429(var86);
                    }
                }
                var84 = var83.field1101;
                if (var84.field3879 < 0) {
                    break;
                }
                var85 = Statics.field4741.method6314(var84.field3898);
            } while (var85 == null || var85.field4009 == null || var84.field3879 >= var85.field4009.length || var85.field4009[var84.field3879] != var84);
            class73.method8429(var83);
        }
    }

    @ObfuscatedName("fx.hf(I)V")
    public static final void method3410() {
        if (Statics.field1025 != null) {
            Statics.field1025.method780();
        }
    }

    @ObfuscatedName("lw.hi(Liu;IIIZB)V")
    public static void method5758(class213 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (field751 >= 50 || arg0.field2311 == null || !arg0.field2311.containsKey(arg1)) {
            return;
        }
        ArrayList var5 = (ArrayList) arg0.field2311.get(arg1);
        if (var5.isEmpty()) {
            return;
        }
        int var6 = 0;
        if (var5.size() > 1) {
            int var7 = 1 + (int) (Math.random() * 100.0D);
            int var8 = 0;
            Iterator var9 = var5.iterator();
            while (var9.hasNext()) {
                class209 var10 = (class209) var9.next();
                int var11 = var8;
                var8 += var10.field2167;
                if (var11 <= var7 && var7 < var8) {
                    break;
                }
                var6++;
            }
            if (var6 >= var5.size()) {
                return;
            }
        }
        class209 var12 = (class209) var5.get(var6);
        int var13 = var12.field2166 & 0x1F;
        if (!(var13 <= 0 || Statics.field2378.method2730() != 0) || !(var13 != 0 || Statics.field2378.method2728() != 0) || var12 == null) {
            return;
        }
        if (var12.field2166 == 0) {
            if (!arg4) {
                return;
            }
            field752[field751] = 0;
        } else {
            int var18 = (arg2 - 64) / 128;
            int var19 = (arg3 - 64) / 128;
            field752[field751] = var12.field2166 + (var18 << 16) + (var19 << 8);
        }
        field504[field751] = var12.field2172;
        field753[field751] = var12.field2168;
        field754[field751] = 0;
        field757[field751] = null;
        field574[field751] = var12.field2170;
        field751++;
    }

    @ObfuscatedName("aw.hn(IIII)V")
    public static void method10(int arg0, int arg1, int arg2) {
        if (Statics.field2378.method2728() == 0 || arg1 == 0 || field751 >= 50) {
            return;
        }
        field504[field751] = arg0;
        field753[field751] = arg1;
        field754[field751] = arg2;
        field757[field751] = null;
        field752[field751] = 0;
        field574[field751] = 0;
        field751++;
    }

    @ObfuscatedName("ny.hy(IB)V")
    public static void method6315(int arg0) {
        if (arg0 == -1 && !field750) {
            class334.method3533(0, 0);
        } else if (arg0 != -1 && !class334.method4946(arg0) && Statics.field2378.method2726() != 0) {
            ArrayList var1 = new ArrayList();
            var1.add(new class346(Statics.field205, arg0, 0, Statics.field2378.method2726(), false));
            if (field750) {
                class334.method4984(var1, 0, 100, 100, 0);
            } else {
                class334.method3888(var1, 0, 100, 100, 0, false);
            }
        }
    }

    @ObfuscatedName("lf.hk(Ljava/util/ArrayList;IIIIB)V")
    public static void method5748(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field750) {
            class334.method3533(0, 0);
        } else if (var5 != -1 && !class334.method4946(var5) && Statics.field2378.method2726() != 0) {
            ArrayList var6 = new ArrayList();
            for (int var7 = 0; var7 < arg0.size(); var7++) {
                var6.add(new class346(Statics.field205, (Integer) arg0.get(var7), 0, Statics.field2378.method2726(), false));
            }
            if (field750) {
                class334.method4984(var6, arg1, arg2, arg3, arg4);
            } else {
                class334.method3888(var6, arg1, arg2, arg3, arg4, false);
            }
        }
    }

    @ObfuscatedName("ha.hm(IIB)V")
    public static void method3680(int arg0, int arg1) {
        if (Statics.field2378.method2726() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class346(Statics.field3819, arg0, 0, Statics.field2378.method2726(), false));
            class334.method3888(var2, 0, 0, 0, 0, true);
            field750 = true;
        }
    }

    @ObfuscatedName("client.hl(III)V")
    public void method1254(int arg0, int arg1) {
        if (field784 != null && field784.field1485 != null && arg0 > -1 && Statics.field2378.method2726() > 0 && !field750) {
            class325 var3 = class325.method2983(class323.field3386, field784.field1485);
            var3.field3433.method9244(arg0);
            field784.method3070(var3);
        }
    }

    @ObfuscatedName("oe.hx(I)V")
    public static final void method6896() {
        if (field579 != Statics.field2071.field1344) {
            field579 = Statics.field2071.field1344;
            method440(Statics.field2071.field1344);
        }
    }

    @ObfuscatedName("jd.hj(Lng;III)V")
    public static final void method4480(class362 arg0, int arg1, int arg2) {
        if (field771 != 0 && field771 != 3 || field650 || !(class36.field197 == 1 || !Statics.field1704 && class36.field197 == 4)) {
            return;
        }
        class349 var3 = arg0.method6731(Statics.field4741, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field213 - arg1;
        int var5 = class36.field214 - arg2;
        if (!var3.method6238(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3766 / 2;
        int var7 = var5 - var3.field3770 / 2;
        int var8 = field592 & 0x7FF;
        int var9 = class240.field2591[var8];
        int var10 = class240.field2592[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field194.method1225() + var11 >> 7;
        int var14 = Statics.field194.method1223() - var12 >> 7;
        class325 var15 = class325.method2983(class323.field3387, field784.field1485);
        var15.field3433.method9241(18);
        var15.field3433.method9288(field734.method5249(82) ? (field734.method5249(81) ? 2 : 1) : 0);
        var15.field3433.method9299(Statics.field2071.field1347 + var13);
        var15.field3433.method9298(Statics.field2071.field1348 + var14);
        var15.field3433.method9241(var6);
        var15.field3433.method9241(var7);
        var15.field3433.method9257(field592);
        var15.field3433.method9241(57);
        var15.field3433.method9241(0);
        var15.field3433.method9241(0);
        var15.field3433.method9241(89);
        var15.field3433.method9257(Statics.field3772.field1247);
        var15.field3433.method9257(Statics.field3772.field1270);
        var15.field3433.method9241(63);
        field784.method3070(var15);
        field747 = var13;
        field748 = var14;
    }

    @ObfuscatedName("fp.hv(B)V")
    public static final void method3294() {
        int[] var0 = field583.field1427;
        Iterator var1 = field684.iterator();
        while (var1.hasNext()) {
            class104 var2 = (class104) var1.next();
            for (int var3 = 0; var3 < field583.field1426; var3++) {
                class95 var4 = var2.field1357[var0[var3]];
                if (var4 != null && var4.field1231 > 0) {
                    var4.field1231--;
                    if (var4.field1231 == 0) {
                        var4.field1252 = null;
                    }
                }
            }
            for (int var5 = 0; var5 < var2.field1360; var5++) {
                int var6 = var2.field1342[var5];
                class106 var7 = var2.field1353[var6];
                if (var7 != null && var7.field1231 > 0) {
                    var7.field1231--;
                    if (var7.field1231 == 0) {
                        var7.field1252 = null;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.hz(Ljava/lang/String;B)V")
    public static final void method287(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2378.method2712(!Statics.field2378.method2713());
            if (Statics.field2378.method2713()) {
                Statics.method7725(99, "", "Roofs are now all hidden");
            } else {
                Statics.method7725(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class420.method434(arg0.substring(5).trim()) == 1;
            Statics.field995.method617(var1);
            class240.method4549(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field536 = !field536;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field2378.method2794();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field636 = !field636;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field696 = !field696;
        }
        if (arg0.startsWith("setdrawdistance")) {
            String[] var2 = arg0.split(" ");
            try {
                int var3 = Integer.parseInt(var2[1]);
                Statics.field2378.method2734(var3);
            } catch (NumberFormatException var10) {
                Statics.method7725(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var2[1]));
            }
        }
        if (arg0.startsWith("settilerendermode")) {
            String[] var5 = arg0.split(" ");
            try {
                int var6 = Integer.parseInt(var5[1]);
                Statics.field2071.field1352.method4734(class233.method4373()[var6]);
            } catch (NumberFormatException var9) {
                Statics.method7725(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var5[1]));
            }
        }
        if (arg0.equalsIgnoreCase("getdrawdistance")) {
            Statics.method7725(99, "", String.format("%d", Statics.field2378.method2761()));
        }
        if (field674 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field472.field5255 = !Statics.field472.field5255;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field2378.method2718(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field2378.method2718(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method5769();
            }
            if (arg0.equalsIgnoreCase("clientreload")) {
                method810();
            }
        }
        class325 var8 = class325.method2983(class323.field3344, field784.field1485);
        var8.field3433.method9241(arg0.length() + 1);
        var8.field3433.method9248(arg0);
        field784.method3070(var8);
    }

    @ObfuscatedName("bz.hp(II)I")
    public static final int method641(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("gp.hg(IB)I")
    public static final int method3439(int arg0) {
        return Math.abs(arg0 - Statics.field4586) > 1024 ? arg0 + 2048 * (arg0 < Statics.field4586 ? 1 : -1) : arg0;
    }

    @ObfuscatedName("bm.hs(I)V")
    public static final void method812() {
        method4087(Statics.field1522, Statics.field35, Statics.field4984);
        method3337(Statics.field1340, Statics.field4652);
        if (Statics.field65 != Statics.field1522 || Statics.field35 != Statics.field2297 || Statics.field4984 != Statics.field4526 || Statics.field3415 != Statics.field1340 || Statics.field4652 != Statics.field4586) {
            return;
        }
        field749 = false;
        field586 = false;
        field649 = false;
        field739 = false;
        Statics.field469 = 0;
        Statics.field4584 = 0;
        Statics.field1998 = 0;
        Statics.field1702 = 0;
        Statics.field4044 = 0;
        Statics.field83 = 0;
        Statics.field462 = 0;
        Statics.field1844 = 0;
        Statics.field1526 = 0;
        Statics.field3308 = 0;
        field762 = null;
        field764 = null;
        field505 = null;
    }

    @ObfuscatedName("in.hh(IIII)V")
    public static final void method4087(int arg0, int arg1, int arg2) {
        if (Statics.field65 < arg0) {
            Statics.field65 += Statics.field83 * (arg0 - Statics.field65) / 1000 + Statics.field462;
            if (Statics.field65 > arg0) {
                Statics.field65 = arg0;
            }
        }
        if (Statics.field65 > arg0) {
            Statics.field65 -= Statics.field83 * (Statics.field65 - arg0) / 1000 + Statics.field462;
            if (Statics.field65 < arg0) {
                Statics.field65 = arg0;
            }
        }
        if (Statics.field2297 < arg1) {
            Statics.field2297 += Statics.field83 * (arg1 - Statics.field2297) / 1000 + Statics.field462;
            if (Statics.field2297 > arg1) {
                Statics.field2297 = arg1;
            }
        }
        if (Statics.field2297 > arg1) {
            Statics.field2297 -= Statics.field83 * (Statics.field2297 - arg1) / 1000 + Statics.field462;
            if (Statics.field2297 < arg1) {
                Statics.field2297 = arg1;
            }
        }
        if (Statics.field4526 < arg2) {
            Statics.field4526 += Statics.field83 * (arg2 - Statics.field4526) / 1000 + Statics.field462;
            if (Statics.field4526 > arg2) {
                Statics.field4526 = arg2;
            }
        }
        if (Statics.field4526 > arg2) {
            Statics.field4526 -= Statics.field83 * (Statics.field4526 - arg2) / 1000 + Statics.field462;
            if (Statics.field4526 < arg2) {
                Statics.field4526 = arg2;
            }
        }
    }

    @ObfuscatedName("fl.hb(IIB)V")
    public static final void method3337(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field3415 < arg0) {
            Statics.field3415 += Statics.field4044 * (arg0 - Statics.field3415) / 1000 + Statics.field1702;
            if (Statics.field3415 > arg0) {
                Statics.field3415 = arg0;
            }
        } else if (Statics.field3415 > arg0) {
            Statics.field3415 -= Statics.field4044 * (Statics.field3415 - arg0) / 1000 + Statics.field1702;
            if (Statics.field3415 < arg0) {
                Statics.field3415 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field4586;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field4586 += Statics.field4044 * var3 / 1000 + Statics.field1702;
            Statics.field4586 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field4586 -= Statics.field4044 * -var3 / 1000 + Statics.field1702;
            Statics.field4586 &= 0x7FF;
        }
        int var4 = var2 - Statics.field4586;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field4586 = var2;
        }
    }

    @ObfuscatedName("oe.hw(B)V")
    public static final void method6895() {
        if (!field649) {
            int var0 = class351.method6261(Statics.field1844);
            int var1 = class351.method6261(Statics.field1526);
            int var2 = method1164(Statics.field2071, var0, var1, Statics.field2071.field1344) - Statics.field3308;
            method4087(var0, var2, var1);
        } else if (field762 != null) {
            Statics.field65 = field762.method8695();
            Statics.field4526 = field762.method8699();
            if (field761) {
                Statics.field2297 = field762.method8697();
            } else {
                Statics.field2297 = method1164(Statics.field2071, Statics.field65, Statics.field4526, Statics.field2071.field1344) - field762.method8697();
            }
            field762.method8707();
        }
        if (field739) {
            if (field764 != null) {
                Statics.field3415 = field764.method8704();
                Statics.field3415 = Math.min(Math.max(Statics.field3415, 128), 383);
                field764.method8707();
            }
            if (field505 != null) {
                Statics.field4586 = field505.method8704() & 0x7FF;
                field505.method8707();
            }
            return;
        }
        int var3 = class351.method6261(Statics.field469);
        int var4 = class351.method6261(Statics.field4584);
        int var5 = method1164(Statics.field2071, var3, var4, Statics.field2071.field1344) - Statics.field1998;
        int var6 = var3 - Statics.field65;
        int var7 = var5 - Statics.field2297;
        int var8 = var4 - Statics.field4526;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method3337(var10, var11);
    }

    @ObfuscatedName("eu.ih(I)V")
    public static final void method3140() {
        int var0 = field583.field1426;
        int[] var1 = field583.field1427;
        Iterator var2 = field684.iterator();
        while (var2.hasNext()) {
            class104 var3 = (class104) var2.next();
            for (int var4 = 0; var4 < var0; var4++) {
                class95 var5 = var3.field1357[var1[var4]];
                if (var5 != null) {
                    method4673(var3, var5, 1);
                }
            }
        }
    }

    @ObfuscatedName("kv.ir(B)V")
    public static void method5457() {
        Iterator var0 = field684.iterator();
        while (var0.hasNext()) {
            class104 var1 = (class104) var0.next();
            for (int var2 = 0; var2 < var1.field1356; var2++) {
                int var3 = var1.field1358[var2];
                class481 var4 = var1.field1355[var3];
                if (var4 != null) {
                    var4.method8446(field518);
                }
            }
        }
    }

    @ObfuscatedName("jt.ip(Ldn;Ldw;II)V")
    public static final void method4673(class104 arg0, class100 arg1, int arg2) {
        if (arg1.field1271 >= field518) {
            method692(arg1);
        } else if (arg1.field1274 >= field518) {
            method6236(arg1);
        } else {
            method3214(arg1);
        }
        if (arg1.field1247 < 128 || 13184 <= arg1.field1247 || arg1.field1270 < 128 || 13184 <= arg1.field1270) {
            arg1.field1275 = -1;
            arg1.field1271 = 0;
            arg1.field1274 = 0;
            arg1.method2637();
            arg1.field1247 = arg1.field1288[0] * 128 + arg1.field1221 * 64;
            arg1.field1270 = arg1.field1234[0] * 128 + arg1.field1221 * 64;
            arg1.method2620();
        }
        if (Statics.field3772 == arg1 && (arg1.field1247 < 1536 || 11776 <= arg1.field1247 || arg1.field1270 < 1536 || 11776 <= arg1.field1270)) {
            arg1.field1275 = -1;
            arg1.field1271 = 0;
            arg1.field1274 = 0;
            arg1.method2637();
            arg1.field1247 = arg1.field1288[0] * 128 + arg1.field1221 * 64;
            arg1.field1270 = arg1.field1234[0] * 128 + arg1.field1221 * 64;
            arg1.method2620();
        }
        if (arg1.field1241 != -1) {
            Object var3 = null;
            Object var4 = null;
            int var5 = 65536;
            class104 var6;
            class100 var7;
            if (arg1.field1241 < var5) {
                var6 = class485.method7424(arg1.field1241, field684);
                var7 = var6.field1353[arg1.field1241];
            } else {
                int var8 = arg1.field1241 - var5;
                var6 = class485.method4344(var8, field684);
                var7 = var6.field1357[var8];
            }
            if (var7 != null) {
                class427 var9 = class427.method1235((float) arg1.field1247, 0.0F, (float) arg1.field1270);
                class427 var10 = class427.method1235((float) var7.field1247, 0.0F, (float) var7.field1270);
                if (arg0.field1354 != -1) {
                    class481 var11 = Statics.field2071.field1355[arg0.field1354];
                    var9 = var11.method8447(arg1.field1247, arg1.field1270);
                }
                if (var6.field1354 != -1) {
                    class481 var12 = Statics.field2071.field1355[var6.field1354];
                    var10 = var12.method8447(var7.field1247, var7.field1270);
                }
                int var13 = (int) (var9.field4772 - var10.field4772);
                int var14 = (int) (var9.field4767 - var10.field4767);
                if (var13 != 0 || var14 != 0) {
                    int var16 = (int) (Math.atan2((double) var13, (double) var14) * 325.94932345220167D) & 0x7FF;
                    arg1.field1284 = var16;
                }
            } else if (arg1.field1253) {
                arg1.field1241 = -1;
                arg1.field1253 = false;
            }
        }
        if (arg1.field1256 == 0 || arg1.field1264 > 0) {
            int var17 = -1;
            if (arg1.field1255 != -1 && arg1.field1259 != -1) {
                int var18 = class351.method6261(arg1.field1255 - Statics.field2071.field1347);
                int var19 = class351.method6261(arg1.field1259 - Statics.field2071.field1348);
                int var20 = arg1.field1247 - var18;
                int var21 = arg1.field1270 - var19;
                if (var20 != 0 || var21 != 0) {
                    int var22 = (int) (Math.atan2((double) var20, (double) var21) * 325.94932345220167D) & 0x7FF;
                    var17 = var22;
                }
            } else if (arg1.field1254 != -1) {
                var17 = arg1.field1254;
            }
            if (var17 != -1) {
                arg1.field1284 = var17;
                if (arg1.field1257) {
                    arg1.field1219 = arg1.field1284;
                }
            }
            arg1.method2628();
        }
        int var23 = arg1.field1284 - arg1.field1219 & 0x7FF;
        if (var23 == 0) {
            if (arg1.field1253) {
                arg1.field1241 = -1;
                arg1.field1253 = false;
            }
            arg1.field1285 = 0;
        } else {
            boolean var24 = true;
            boolean var25 = true;
            arg1.field1285++;
            int var26 = var23 > 1024 ? -1 : 1;
            arg1.field1219 += arg1.field1286 * var26;
            boolean var27 = true;
            if (var23 < arg1.field1286 || var23 > 2048 - arg1.field1286) {
                arg1.field1219 = arg1.field1284;
                var27 = false;
            }
            if (arg1.field1286 > 0 && arg1.field1223 == arg1.field1217 && (arg1.field1285 > 25 || var27)) {
                if (var26 == -1 && arg1.field1267 != -1) {
                    arg1.field1217 = arg1.field1267;
                } else if (var26 == 1 && arg1.field1280 != -1) {
                    arg1.field1217 = arg1.field1280;
                } else {
                    arg1.field1217 = arg1.field1226;
                }
            }
            arg1.field1219 &= 0x7FF;
        }
        arg1.field1220 = false;
        if (arg1.field1217 != -1) {
            class213 var29 = class213.method6692(arg1.field1217);
            if (var29 == null) {
                arg1.field1217 = -1;
            } else if (!var29.method4100() && var29.field2314 != null) {
                arg1.field1260++;
                if (arg1.field1236 < var29.field2314.length && arg1.field1260 > var29.field2316[arg1.field1236]) {
                    arg1.field1260 = 1;
                    arg1.field1236++;
                    method5758(var29, arg1.field1236, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                }
                if (arg1.field1236 >= var29.field2314.length) {
                    if (var29.field2309 > 0) {
                        arg1.field1236 -= var29.field2309;
                        if (var29.field2325) {
                            arg1.field1261++;
                        }
                        if (arg1.field1236 < 0 || arg1.field1236 >= var29.field2314.length || var29.field2325 && arg1.field1261 >= var29.field2324) {
                            arg1.field1260 = 0;
                            arg1.field1236 = 0;
                            arg1.field1261 = 0;
                        }
                    } else {
                        arg1.field1260 = 0;
                        arg1.field1236 = 0;
                    }
                    method5758(var29, arg1.field1236, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                }
            } else if (var29.method4100()) {
                arg1.field1236++;
                int var30 = var29.method4101();
                if (arg1.field1236 < var30) {
                    method5758(var29, arg1.field1236, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                } else {
                    if (var29.field2309 > 0) {
                        arg1.field1236 -= var29.field2309;
                        if (var29.field2325) {
                            arg1.field1261++;
                        }
                        if (arg1.field1236 < 0 || arg1.field1236 >= var30 || var29.field2325 && arg1.field1261 >= var29.field2324) {
                            arg1.field1236 = 0;
                            arg1.field1260 = 0;
                            arg1.field1261 = 0;
                        }
                    } else {
                        arg1.field1260 = 0;
                        arg1.field1236 = 0;
                    }
                    method5758(var29, arg1.field1236, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                }
            } else {
                arg1.field1217 = -1;
            }
        }
        class529 var31 = new class529(arg1.method2625());
        for (class486 var32 = (class486) var31.method8949(); var32 != null; var32 = (class486) var31.next()) {
            if (var32.field5054 != -1 && field518 >= var32.field5055) {
                int var33 = class200.method6851(var32.field5054).field2087;
                if (var33 == -1) {
                    var32.method8667();
                    arg1.field1268--;
                } else {
                    var32.field5053 = Math.max(var32.field5053, 0);
                    class213 var34 = class213.method6692(var33);
                    if (var34.field2314 != null && !var34.method4100()) {
                        var32.field5052++;
                        if (var32.field5053 < var34.field2314.length && var32.field5052 > var34.field2316[var32.field5053]) {
                            var32.field5052 = 1;
                            var32.field5053++;
                            method5758(var34, var32.field5053, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                        }
                        if (var32.field5053 >= var34.field2314.length) {
                            var32.method8667();
                            arg1.field1268--;
                        }
                    } else if (var34.method4100()) {
                        var32.field5053++;
                        int var35 = var34.method4101();
                        if (var32.field5053 < var35) {
                            method5758(var34, var32.field5053, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                        } else {
                            var32.method8667();
                            arg1.field1268--;
                        }
                    } else {
                        var32.method8667();
                        arg1.field1268--;
                    }
                }
            }
        }
        if (arg1.field1275 != -1 && arg1.field1235 <= 1) {
            class213 var36 = class213.method6692(arg1.field1275);
            if (var36.field2326 == 1 && arg1.field1292 > 0 && arg1.field1271 <= field518 && arg1.field1274 < field518) {
                arg1.field1235 = 1;
                return;
            }
        }
        if (arg1.field1275 != -1 && arg1.field1235 == 0) {
            class213 var37 = class213.method6692(arg1.field1275);
            if (var37 == null) {
                arg1.field1275 = -1;
            } else if (!var37.method4100() && var37.field2314 != null) {
                arg1.field1290++;
                if (arg1.field1263 < var37.field2314.length && arg1.field1290 > var37.field2316[arg1.field1263]) {
                    arg1.field1290 = 1;
                    arg1.field1263++;
                    method5758(var37, arg1.field1263, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                }
                if (arg1.field1263 >= var37.field2314.length) {
                    arg1.field1263 -= var37.field2309;
                    arg1.field1238++;
                    if (arg1.field1238 >= var37.field2324) {
                        arg1.field1275 = -1;
                    } else if (arg1.field1263 >= 0 && arg1.field1263 < var37.field2314.length) {
                        method5758(var37, arg1.field1263, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                    } else {
                        arg1.field1275 = -1;
                    }
                }
                arg1.field1220 = var37.field2320;
            } else if (var37.method4100()) {
                arg1.field1263++;
                int var38 = var37.method4101();
                if (arg1.field1263 < var38) {
                    method5758(var37, arg1.field1263, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                } else {
                    arg1.field1263 -= var37.field2309;
                    arg1.field1238++;
                    if (arg1.field1238 >= var37.field2324) {
                        arg1.field1275 = -1;
                    } else if (arg1.field1263 >= 0 && arg1.field1263 < var38) {
                        method5758(var37, arg1.field1263, arg1.field1247, arg1.field1270, Statics.field3772 == arg1);
                    } else {
                        arg1.field1275 = -1;
                    }
                }
            } else {
                arg1.field1275 = -1;
            }
        }
        if (arg1.field1235 > 0) {
            arg1.field1235--;
        }
    }

    @ObfuscatedName("by.in(Ldw;I)V")
    public static final void method692(class100 arg0) {
        int var1 = Math.max(1, arg0.field1271 - field518);
        int var2 = arg0.field1269 * 128 + arg0.field1221 * 64;
        int var3 = arg0.field1229 * 128 + arg0.field1221 * 64;
        arg0.field1247 += (var2 - arg0.field1247) / var1;
        arg0.field1270 += (var3 - arg0.field1270) / var1;
        arg0.field1264 = 0;
        arg0.field1284 = arg0.field1224;
    }

    @ObfuscatedName("no.iu(Ldw;I)V")
    public static final void method6236(class100 arg0) {
        boolean var1 = field518 == arg0.field1274 || arg0.field1275 == -1 || arg0.field1235 != 0;
        if (!var1) {
            class213 var2 = class213.method6692(arg0.field1275);
            if (var2 == null || var2.method4100()) {
                var1 = true;
            } else {
                var1 = arg0.field1290 + 1 > var2.field2316[arg0.field1263];
            }
        }
        if (var1) {
            int var3 = arg0.field1274 - arg0.field1271;
            int var4 = field518 - arg0.field1271;
            int var5 = arg0.field1269 * 128 + arg0.field1221 * 64;
            int var6 = arg0.field1229 * 128 + arg0.field1221 * 64;
            int var7 = arg0.field1287 * 128 + arg0.field1221 * 64;
            int var8 = arg0.field1272 * 128 + arg0.field1221 * 64;
            arg0.field1247 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1270 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1264 = 0;
        arg0.field1284 = arg0.field1224;
        arg0.field1219 = arg0.field1284;
    }

    @ObfuscatedName("et.ii(Ldw;I)V")
    public static final void method3214(class100 arg0) {
        arg0.field1217 = arg0.field1223;
        if (arg0.field1256 == 0) {
            arg0.field1264 = 0;
            return;
        }
        if (arg0.field1275 != -1 && arg0.field1235 == 0) {
            class213 var1 = class213.method6692(arg0.field1275);
            if (arg0.field1292 > 0 && var1.field2326 == 0) {
                arg0.field1264++;
                return;
            }
            if (arg0.field1292 <= 0 && var1.field2328 == 0) {
                arg0.field1264++;
                return;
            }
        }
        int var2 = arg0.field1247;
        int var3 = arg0.field1270;
        int var4 = arg0.field1288[arg0.field1256 - 1] * 128 + arg0.field1221 * 64;
        int var5 = arg0.field1234[arg0.field1256 - 1] * 128 + arg0.field1221 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1284 = 1280;
            } else if (var3 > var5) {
                arg0.field1284 = 1792;
            } else {
                arg0.field1284 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1284 = 768;
            } else if (var3 > var5) {
                arg0.field1284 = 256;
            } else {
                arg0.field1284 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1284 = 1024;
        } else if (var3 > var5) {
            arg0.field1284 = 0;
        }
        class276 var6 = arg0.field1230[arg0.field1256 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1247 = var4;
            arg0.field1270 = var5;
            arg0.field1256--;
            if (arg0.field1292 > 0) {
                arg0.field1292--;
            }
            return;
        }
        int var7 = arg0.field1284 - arg0.field1219 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1227;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1226;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1265;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1228;
        }
        if (var8 == -1) {
            var8 = arg0.field1226;
        }
        arg0.field1217 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class106) {
            var10 = ((class106) arg0).field1372.field2045;
        }
        if (var10) {
            if (arg0.field1284 != arg0.field1219 && arg0.field1241 == -1 && arg0.field1286 != 0) {
                var9 = 2;
            }
            if (arg0.field1256 > 2) {
                var9 = 6;
            }
            if (arg0.field1256 > 3) {
                var9 = 8;
            }
            if (arg0.field1264 > 0 && arg0.field1256 > 1) {
                var9 = 8;
                arg0.field1264--;
            }
        } else {
            if (arg0.field1256 > 1) {
                var9 = 6;
            }
            if (arg0.field1256 > 2) {
                var9 = 8;
            }
            if (arg0.field1264 > 0 && arg0.field1256 > 1) {
                var9 = 8;
                arg0.field1264--;
            }
        }
        if (class276.field3058 == var6) {
            var9 <<= 0x1;
        } else if (class276.field3047 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8) {
            if (arg0.field1226 == arg0.field1217 && arg0.field1266 != -1) {
                arg0.field1217 = arg0.field1266;
            } else if (arg0.field1227 == arg0.field1217 && arg0.field1291 != -1) {
                arg0.field1217 = arg0.field1291;
            } else if (arg0.field1228 == arg0.field1217 && arg0.field1232 != -1) {
                arg0.field1217 = arg0.field1232;
            } else if (arg0.field1265 == arg0.field1217 && arg0.field1233 != -1) {
                arg0.field1217 = arg0.field1233;
            }
        } else if (var9 <= 2) {
            if (arg0.field1226 == arg0.field1217 && arg0.field1289 != -1) {
                arg0.field1217 = arg0.field1289;
            } else if (arg0.field1227 == arg0.field1217 && arg0.field1225 != -1) {
                arg0.field1217 = arg0.field1225;
            } else if (arg0.field1228 == arg0.field1217 && arg0.field1258 != -1) {
                arg0.field1217 = arg0.field1258;
            } else if (arg0.field1265 == arg0.field1217 && arg0.field1237 != -1) {
                arg0.field1217 = arg0.field1237;
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
                arg0.field1270 += var9;
                if (arg0.field1270 > var5) {
                    arg0.field1270 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1270 -= var9;
                if (arg0.field1270 < var5) {
                    arg0.field1270 = var5;
                }
            }
        }
        if (arg0.field1247 == var4 && arg0.field1270 == var5) {
            arg0.field1256--;
            if (arg0.field1292 > 0) {
                arg0.field1292--;
            }
        }
    }

    @ObfuscatedName("jf.ia(I)V")
    public static void method4941() {
        if (Statics.field472 != null) {
            Statics.field472.method8925(Statics.field2071.field1344, (Statics.field194.method1225() >> 7) + Statics.field2071.field1347, (Statics.field194.method1223() >> 7) + Statics.field2071.field1348, false);
            Statics.field472.method8759();
        }
    }

    @ObfuscatedName("po.iw(Ldv;III)V")
    public static void method7210(class95 arg0, int arg1, int arg2) {
        if (arg0.field1275 == arg1 && arg1 != -1) {
            int var3 = class213.method6692(arg1).field2323;
            if (var3 == 1) {
                arg0.field1263 = 0;
                arg0.field1290 = 0;
                arg0.field1235 = arg2;
                arg0.field1238 = 0;
            }
            if (var3 == 2) {
                arg0.field1238 = 0;
            }
        } else if (arg1 == -1 || arg0.field1275 == -1 || class213.method6692(arg1).field2321 >= class213.method6692(arg0.field1275).field2321) {
            arg0.field1275 = arg1;
            arg0.field1263 = 0;
            arg0.field1290 = 0;
            arg0.field1235 = arg2;
            arg0.field1238 = 0;
            arg0.field1292 = arg0.field1256;
        }
    }

    @ObfuscatedName("ff.ic(I)I")
    public static int method3408() {
        return field740 ? 2 : 1;
    }

    @ObfuscatedName("nt.ix(IB)V")
    public static void method6218(int arg0) {
        field773 = 0L;
        if (arg0 >= 2) {
            field740 = true;
        } else {
            field740 = false;
        }
        if (method3408() == 1) {
            Statics.field995.method490(765, 503);
        } else {
            Statics.field995.method490(7680, 2160);
        }
        if (field551 < 25 || field784 == null || field784.field1485 == null) {
            return;
        }
        class325 var1 = class325.method2983(class323.field3336, field784.field1485);
        var1.field3433.method9241(method3408());
        var1.field3433.method9257(Statics.field74);
        var1.field3433.method9257(Statics.field2983);
        field784.method3070(var1);
    }

    @ObfuscatedName("client.ar(I)V")
    public final void method500() {
        field773 = class330.method2257() + 500L;
        this.method1255();
        if (field723 != -1) {
            this.method1267(true);
        }
    }

    @ObfuscatedName("client.io(B)V")
    public void method1255() {
        int var1 = Statics.field74;
        int var2 = Statics.field2983;
        if (this.field168 < var1) {
            int var3 = this.field168;
        }
        if (this.field170 < var2) {
            int var4 = this.field170;
        }
        if (Statics.field2378 != null) {
            try {
                class27.method382(Statics.field995, "resize", new Object[] { method3408() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.id(I)V")
    public final void method1256() {
        if (field723 != -1) {
            method1053(field723);
        }
        for (int var1 = 0; var1 < field714; var1++) {
            if (field716[var1]) {
                field717[var1] = true;
            }
            field718[var1] = field716[var1];
            field716[var1] = false;
        }
        field591 = field518;
        field655 = -1;
        field656 = -1;
        if (field723 != -1) {
            field714 = 0;
            method1194(field723, 0, 0, Statics.field74, Statics.field2983, 0, 0, -1);
        }
        class568.method9607();
        if (field728) {
            if (field626 == 1) {
                Statics.field3066[field625 / 100].method9825(field623 - 8, field624 - 8);
            }
            if (field626 == 2) {
                Statics.field3066[field625 / 100 + 4].method9825(field623 - 8, field624 - 8);
            }
        }
        if (field650) {
            field561.method9932();
        } else if (field655 != -1) {
            method3192(field655, field656);
        }
        if (field653 == 3) {
            for (int var2 = 0; var2 < field714; var2++) {
                if (field718[var2]) {
                    class568.method9615(field719[var2], field566[var2], field721[var2], field722[var2], 16711935, 128);
                } else if (field717[var2]) {
                    class568.method9615(field719[var2], field566[var2], field721[var2], field722[var2], 16711680, 128);
                }
            }
        }
        Statics.method5440(Statics.field2071.field1344, Statics.field3772.field1247, Statics.field3772.field1270, field584);
        field584 = 0;
    }

    @ObfuscatedName("ir.iq(Ljava/lang/String;ZB)V")
    public static final void method3965(String arg0, boolean arg1) {
        if (!field690) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1527.method7928(arg0, 250);
        int var6 = Statics.field1527.method7931(arg0, 250) * 13;
        class568.method9616(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class568.method9620(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1527.method8009(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field714; var11++) {
            if (field721[var11] + field719[var11] > var7 && field719[var11] < var7 + var9 && field722[var11] + field566[var11] > var8 && field566[var11] < var8 + var10) {
                field716[var11] = true;
            }
        }
        if (arg1) {
            Statics.field2344.method470(0, 0);
            return;
        }
        int var12 = var3;
        int var13 = var4;
        int var14 = var5;
        int var15 = var6;
        for (int var16 = 0; var16 < field714; var16++) {
            if (field721[var16] + field719[var16] > var12 && field719[var16] < var12 + var14 && field722[var16] + field566[var16] > var13 && field566[var16] < var13 + var15) {
                field717[var16] = true;
            }
        }
    }

    @ObfuscatedName("fs.iv(IIIIB)V")
    public static final void method3416(int arg0, int arg1, int arg2, int arg3) {
        field544++;
        Statics.field2071.field1352.field2640 = field518;
        if (Statics.field3772.field1247 >> 7 == field747 && Statics.field3772.field1270 >> 7 == field748) {
            field747 = 0;
        }
        class104 var4 = Statics.field2071;
        int var5 = method6209();
        if (Statics.field2071 == var4 && var5 >= 0 && field561.field5600[var5] == 60) {
            int var6 = field561.field5605[var5] * 128;
            boolean var7 = true;
            int var8 = Math.max(384, 2000 - field783 * 2);
            int var9 = Statics.field194.method1225();
            double var10 = (double) class508.method5428(var6) / 65536.0D;
            int var12 = var9 - (int) ((double) var8 * var10);
            int var13 = Statics.field194.method1223() - (int) (class508.method8149(var6) * (double) var8);
            int var14 = method1164(var4, Statics.field194.method1225(), Statics.field194.method1223(), Statics.field194.method1221());
            var4.field1352.method4687(var4.field1344, var12, var13, var14, 60, Statics.field2973, var6, 0L, false);
        }
        method8437(Statics.field2071);
        class104 var15 = Statics.field2071;
        if (field644 >= 0 && var15.field1357[field644] != null) {
            method8299(var15, field644, false);
        }
        method5869(Statics.field2071, true);
        method837(Statics.field2071);
        method5869(Statics.field2071, false);
        class104 var16 = Statics.field2071;
        int var17 = 0;
        for (int var18 = 0; var18 < var16.field1356; var18++) {
            class481 var19 = var16.field1355[var16.field1358[var18]];
            if (var19 != null) {
                boolean var20 = Statics.field2459 == var19.field5038.field1354;
                if (!var20) {
                    boolean var21 = var17 < field508;
                    if (!var21) {
                        continue;
                    }
                    var17++;
                }
                var19.field5031.method5354(method1164(var16, var19.method1225(), var19.method1223(), var16.field1344));
                var19.field5038.field1352.field2640 = field518;
                var19.method8448();
                var16.field1352.method4687(var16.field1344, var19.method1225(), var19.method1223(), var19.method8445(), var19.method8440() / 2, var19.field5038.field1352, var19.method8439(), 0L, false);
                method8437(var19.field5038);
                class104 var22 = var19.field5038;
                if (field644 >= 0 && var22.field1357[field644] != null) {
                    method8299(var22, field644, false);
                }
                method5869(var19.field5038, true);
                class104 var23 = var19.field5038;
                int var24 = field583.field1426;
                int[] var25 = field583.field1427;
                for (int var26 = 0; var26 < var24; var26++) {
                    if (field644 != var25[var26] && field630 != var25[var26]) {
                        method8299(var23, var25[var26], true);
                    }
                }
                method5869(var19.field5038, false);
                method2490(var19.field5038);
                method167(var19.field5038);
            }
        }
        method2490(Statics.field2071);
        method167(Statics.field2071);
        method3147(arg0, arg1, arg2, arg3, true);
        int var27 = field709;
        int var28 = field780;
        int var29 = field781;
        int var30 = field582;
        class568.method9608(var27, var28, var27 + var29, var28 + var30);
        class240.method4580();
        class568.method9682();
        int var31 = field552;
        if (field608 / 256 > var31) {
            var31 = field608 / 256;
        }
        if (field766[4] && field768[4] + 128 > var31) {
            var31 = field768[4] + 128;
        }
        int var32 = field592 & 0x7FF;
        method3413(Statics.field5082, Statics.field966, Statics.field3241, var31, var32, method3946(var31), var30);
        int var33;
        if (field586) {
            var33 = method6317();
        } else {
            var33 = method3351();
        }
        int var34 = Statics.field65;
        int var35 = Statics.field2297;
        int var36 = Statics.field4526;
        int var37 = Statics.field3415;
        int var38 = Statics.field4586;
        for (int var39 = 0; var39 < 5; var39++) {
            if (field766[var39]) {
                int var40 = (int) (Math.random() * (double) (field767[var39] * 2 + 1) - (double) field767[var39] + Math.sin((double) field769[var39] / 100.0D * (double) field683[var39]) * (double) field768[var39]);
                if (var39 == 0) {
                    Statics.field65 += var40;
                }
                if (var39 == 1) {
                    Statics.field2297 += var40;
                }
                if (var39 == 2) {
                    Statics.field4526 += var40;
                }
                if (var39 == 3) {
                    Statics.field4586 = Statics.field4586 + var40 & 0x7FF;
                }
                if (var39 == 4) {
                    Statics.field3415 += var40;
                    if (Statics.field3415 < 128) {
                        Statics.field3415 = 128;
                    }
                    if (Statics.field3415 > 383) {
                        Statics.field3415 = 383;
                    }
                }
            }
        }
        int var41 = class36.field195;
        int var42 = class36.field198;
        if (class36.field197 != 0) {
            var41 = class36.field213;
            var42 = class36.field214;
        }
        if (var41 >= var27 && var41 < var27 + var29 && var42 >= var28 && var42 < var28 + var30) {
            int var43 = var41 - var27;
            int var44 = var42 - var28;
            class257.field2890 = var43;
            class257.field2894 = var44;
            class257.field2896 = true;
            class257.field2889 = 0;
            class257.field2892 = false;
            Iterator var45 = field684.iterator();
            while (var45.hasNext()) {
                class104 var46 = (class104) var45.next();
                var46.field1352.method4733(var46.field1344, var41, var42);
            }
        } else {
            class257.field2896 = false;
            class257.field2889 = 0;
        }
        method3410();
        class568.method9616(var27, var28, var29, var30, 0);
        method3410();
        int var47 = class240.method4504();
        class240.method4549(Statics.field995.field177);
        class240.field2589.field2918 = field783;
        int var48 = Statics.field194.method1225();
        int var49 = Statics.field194.method1223();
        class233 var50 = Statics.field2459 == -1 ? class233.field2471 : class233.field2472;
        Statics.field2071.field1352.method4734(var50);
        Statics.field2071.field1352.method4828(Statics.field65, Statics.field2297, Statics.field4526, Statics.field3415, Statics.field4586, var33, var48, var49, field586);
        class240.method4549(false);
        if (field536) {
            class568.method9649();
        }
        class240.field2589.field2918 = var47;
        method3410();
        Statics.field2071.field1352.method4690();
        for (int var51 = 0; var51 < Statics.field2071.field1356; var51++) {
            class481 var52 = Statics.field2071.field1355[Statics.field2071.field1358[var51]];
            if (var52 != null) {
                var52.field5038.field1352.method4690();
            }
        }
        method1873(Statics.field2071, var27, var28, var29, var30);
        for (int var53 = 0; var53 < Statics.field2071.field1356; var53++) {
            class481 var54 = Statics.field2071.field1355[Statics.field2071.field1358[var53]];
            if (var54 != null) {
                method1873(var54.field5038, var27, var28, var29, var30);
            }
        }
        class104 var55 = Statics.field2071;
        if (field526 == 2) {
            int var56 = (field529 - var55.field1347 << 7) + field532;
            int var57 = (field725 - var55.field1348 << 7) + field533;
            method3411(var55, var56, var57, var56, var57, field622 * 2);
            if (field621 > -1 && field518 % 20 < 10) {
                Statics.field497[0].method9825(field621 + var27 - 12, field600 + var28 - 28);
            }
        }
        ((class252) class240.field2589.field2913).method4956(field584);
        method5759(var27, var28, var29, var30);
        Statics.field65 = var34;
        Statics.field2297 = var35;
        Statics.field4526 = var36;
        Statics.field3415 = var37;
        Statics.field4586 = var38;
        if (field517 && Statics.field4124.method7102(true, false) == 0) {
            field517 = false;
        }
        if (field517) {
            class568.method9616(var27, var28, var29, var30, 0);
            method3965(class383.field4191, false);
        }
    }

    @ObfuscatedName("eq.if(IIIIZI)V")
    public static final void method3147(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field588;
        } else if (var5 >= 100) {
            var6 = field580;
        } else {
            var6 = (field580 - field588) * var5 / 100 + field588;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field777) {
            short var8 = field777;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field763) {
                var6 = field763;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class568.method9607();
                    class568.method9616(arg0, arg1, var10, arg3, -16777216);
                    class568.method9616(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field778) {
            short var11 = field778;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field775) {
                var6 = field775;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class568.method9607();
                    class568.method9616(arg0, arg1, arg2, var13, -16777216);
                    class568.method9616(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field783 = arg3 * var6 / 334;
        if (field781 != arg2 || field582 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method3946(var16);
                int var18 = class240.field2591[var16];
                int var19 = arg3 - 334;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > 100) {
                    var19 = 100;
                }
                int var20 = (field774 - field558) * var19 / 100 + field558;
                int var21 = var17 * var20 / 256;
                var14[var15] = var18 * var21 >> 16;
            }
            Statics.field2071.field1352.method4749(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field709 = arg0;
        field780 = arg1;
        field781 = arg2;
        field582 = arg3;
    }

    @ObfuscatedName("sg.il(Ldn;B)V")
    public static void method8437(class104 arg0) {
        if (field636) {
            method8299(arg0, field630, false);
        }
    }

    @ObfuscatedName("bd.iy(Ldn;B)V")
    public static void method837(class104 arg0) {
        int var1 = field583.field1426;
        int[] var2 = field583.field1427;
        for (int var3 = 0; var3 < var1; var3++) {
            if (field644 != var2[var3] && field630 != var2[var3]) {
                method8299(arg0, var2[var3], true);
            }
        }
    }

    @ObfuscatedName("sk.it(Ldn;IZS)V")
    public static void method8299(class104 arg0, int arg1, boolean arg2) {
        class95 var3 = arg0.field1357[arg1];
        if (var3 == null || !var3.method2526() || var3.field1142) {
            return;
        }
        int var4 = var3.field1148;
        var3.field1154 = false;
        if ((field506 && field583.field1426 > 50 || field583.field1426 > 200) && arg2 && var3.field1223 == var3.field1217) {
            var3.field1154 = true;
        }
        int var5 = var3.field1247 >> 7;
        int var6 = var3.field1270 >> 7;
        if (0 > var5 || var5 >= 104 || 0 > var6 || var6 >= 104) {
            return;
        }
        long var7 = class257.method3345(0, 0, 0, false, var3.field1162, arg0.field1354);
        if (var3.field1143 != null && field518 >= var3.field1135 && field518 < var3.field1145) {
            var3.field1154 = false;
            var3.field1160 = method1164(arg0, var3.field1247, var3.field1270, var4);
            var3.field1222 = field518;
            arg0.field1352.method4688(var4, var3.field1247, var3.field1270, var3.field1160, 60, var3, var3.field1219, var7, var3.field1150, var3.field1151, var3.field1152, var3.field1144);
            return;
        }
        if ((var3.field1247 & 0x7F) == 64 && (var3.field1270 & 0x7F) == 64) {
            if (field544 == arg0.field1349[var5][var6]) {
                return;
            }
            arg0.field1349[var5][var6] = field544;
        }
        var3.field1160 = method1164(arg0, var3.field1247, var3.field1270, var4);
        var3.field1222 = field518;
        arg0.field1352.method4687(var4, var3.field1247, var3.field1270, var3.field1160, 60, var3, var3.field1219, var7, var3.field1220);
    }

    @ObfuscatedName("ll.iz(Ldn;ZB)V")
    public static final void method5869(class104 arg0, boolean arg1) {
        for (int var2 = 0; var2 < arg0.field1360; var2++) {
            class106 var3 = arg0.field1353[arg0.field1342[var2]];
            if (var3 != null && var3.method2526() && var3.field1372.field2017 == arg1 && var3.field1372.method3763()) {
                int var4 = arg0.field1344;
                int var5 = var3.field1247 >> 7;
                int var6 = var3.field1270 >> 7;
                if (var5 >= 0 && var5 < arg0.field1345 && var6 >= 0 && var6 < arg0.field1346) {
                    if (var3.field1221 == 1 && (var3.field1247 & 0x7F) == 64 && (var3.field1270 & 0x7F) == 64) {
                        if (field544 == arg0.field1349[var5][var6]) {
                            continue;
                        }
                        arg0.field1349[var5][var6] = field544;
                    }
                    long var7 = class257.method3345(0, 0, 1, !var3.field1372.field2016, arg0.field1342[var2], arg0.field1354);
                    var3.field1222 = field518;
                    int var9 = method1164(arg0, var3.field1247 + (var3.field1221 * 64 - 64), var3.field1270 + (var3.field1221 * 64 - 64), var4);
                    arg0.field1352.method4687(var4, var3.field1247, var3.field1270, var9, var3.field1221 * 64 - 64 + 60, var3, var3.field1219, var7, var3.field1220);
                }
            }
        }
    }

    @ObfuscatedName("ds.ik(Ldn;B)V")
    public static final void method2490(class104 arg0) {
        for (class80 var1 = (class80) arg0.field1361.method7247(); var1 != null; var1 = (class80) arg0.field1361.method7249()) {
            if (arg0.field1344 != var1.field967 || field518 > var1.field992) {
                var1.method8667();
            } else if (field518 >= var1.field990) {
                if (!var1.field985 && var1.field979 != 0) {
                    if (var1.field979 > 0) {
                        class106 var2 = Statics.field3742.field1353[var1.field979 - 1];
                        if (var2 != null && 0 <= var2.field1247 && var2.field1247 < 13312 && 0 <= var2.field1270 && var2.field1270 < 13312) {
                            var1.field968 = var2.field1247;
                            var1.field969 = var2.field1270;
                            var1.method2332(var1.field972, var1.field973, var1.field974, field518);
                        }
                    } else {
                        int var3 = -var1.field979 - 1;
                        class95 var4;
                        if (field630 == var3) {
                            var4 = Statics.field3772;
                        } else {
                            var4 = Statics.field3742.field1357[var3];
                        }
                        if (var4 != null && 0 <= var4.field1247 && var4.field1247 < 13312 && 0 <= var4.field1270 && var4.field1270 < 13312) {
                            var1.field968 = var4.field1247;
                            var1.field969 = var4.field1270;
                            var1.method2332(var1.field972, var1.field973, var1.field974, field518);
                        }
                    }
                }
                if (var1.field980 > 0) {
                    class106 var5 = arg0.field1353[var1.field980 - 1];
                    if (var5 != null && 0 <= var5.field1247 && var5.field1247 < 13312 && 0 <= var5.field1270 && var5.field1270 < 13312) {
                        var1.method2332(var5.field1247, var5.field1270, method1164(arg0, var5.field1247, var5.field1270, var1.field967) - var1.field971, field518);
                    }
                }
                if (var1.field980 < 0) {
                    int var6 = -var1.field980 - 1;
                    class95 var7;
                    if (field630 == var6) {
                        var7 = Statics.field3772;
                    } else {
                        var7 = arg0.field1357[var6];
                    }
                    if (var7 != null && 0 <= var7.field1247 && var7.field1247 < 13312 && 0 <= var7.field1270 && var7.field1270 < 13312) {
                        var1.method2332(var7.field1247, var7.field1270, method1164(arg0, var7.field1247, var7.field1270, var1.field967) - var1.field971, field518);
                    }
                }
                var1.method2335(field584);
                arg0.field1352.method4687(arg0.field1344, (int) var1.field975, (int) var1.field983, (int) var1.field984, 60, var1, var1.field989, -1L, false);
            }
        }
    }

    @ObfuscatedName("ar.ig(Ldn;B)V")
    public static final void method167(class104 arg0) {
        for (class75 var1 = (class75) arg0.field1362.method7247(); var1 != null; var1 = (class75) arg0.field1362.method7249()) {
            if (arg0.field1344 != var1.field885 || var1.field892) {
                var1.method8667();
            } else if (field518 >= var1.field891) {
                var1.method2244(field584);
                if (var1.field892) {
                    var1.method8667();
                } else {
                    arg0.field1352.method4687(var1.field885, var1.field886, var1.field883, var1.field884, 60, var1, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("fm.ib(I)I")
    public static final int method3351() {
        if (Statics.field2378.method2713()) {
            return Statics.field2071.field1344;
        }
        int var0 = 3;
        int var1 = Statics.field194.method1225() >> 7;
        int var2 = Statics.field194.method1223() >> 7;
        if (Statics.field3415 < 310) {
            int var3;
            int var4;
            if (field797 == 1) {
                var3 = Statics.field5082 >> 7;
                var4 = Statics.field3241 >> 7;
            } else {
                var3 = var1;
                var4 = var2;
            }
            int var5 = Statics.field65 >> 7;
            int var6 = Statics.field4526 >> 7;
            if (var5 < 0 || 104 <= var5 || var6 < 0 || 104 <= var6) {
                return Statics.field2071.field1344;
            }
            if (var3 < 0 || 104 <= var3 || var4 < 0 || 104 <= var4) {
                return Statics.field2071.field1344;
            }
            if ((Statics.field2071.field1351[Statics.field2071.field1344][var5][var6] & 0x4) != 0) {
                var0 = Statics.field2071.field1344;
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
                    if ((Statics.field2071.field1351[Statics.field2071.field1344][var5][var6] & 0x4) != 0) {
                        var0 = Statics.field2071.field1344;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var6 < var4) {
                            var6++;
                        } else if (var6 > var4) {
                            var6--;
                        }
                        if ((Statics.field2071.field1351[Statics.field2071.field1344][var5][var6] & 0x4) != 0) {
                            var0 = Statics.field2071.field1344;
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
                    if ((Statics.field2071.field1351[Statics.field2071.field1344][var5][var6] & 0x4) != 0) {
                        var0 = Statics.field2071.field1344;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var5 < var3) {
                            var5++;
                        } else if (var5 > var3) {
                            var5--;
                        }
                        if ((Statics.field2071.field1351[Statics.field2071.field1344][var5][var6] & 0x4) != 0) {
                            var0 = Statics.field2071.field1344;
                        }
                    }
                }
            }
        }
        if (var1 >= 0 && 104 > var1 && var2 >= 0 && 104 > var2) {
            if ((Statics.field2071.field1351[Statics.field2071.field1344][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2071.field1344;
            }
            return var0;
        } else {
            return Statics.field2071.field1344;
        }
    }

    @ObfuscatedName("nk.ij(I)I")
    public static final int method6317() {
        if (Statics.field2378.method2713()) {
            return Statics.field2071.field1344;
        } else {
            int var0 = method1164(Statics.field2071, Statics.field65, Statics.field4526, Statics.field2071.field1344);
            return var0 - Statics.field2297 >= 800 || (Statics.field2071.field1351[Statics.field2071.field1344][Statics.field65 >> 7][Statics.field4526 >> 7] & 0x4) == 0 ? 3 : Statics.field2071.field1344;
        }
    }

    @ObfuscatedName("or.ie(I)Lpu;")
    public static class411 method6980() {
        return field512;
    }

    @ObfuscatedName("kb.im(I)V")
    public static void method5687() {
        for (class269 var0 = (class269) field712.method7247(); var0 != null; var0 = (class269) field712.method7249()) {
            var0.method8667();
        }
    }

    @ObfuscatedName("ma.is(I)Z")
    public static boolean method5980() {
        return (field637 & 0x2) != 0;
    }

    @ObfuscatedName("di.jj(I)Z")
    public static boolean method2831() {
        return (field637 & 0x8) != 0;
    }

    @ObfuscatedName("hb.jd(Ldv;I)Z")
    public static boolean method3907(class95 arg0) {
        if (field637 == 0) {
            return false;
        } else if (Statics.field3772 == arg0) {
            return method2831();
        } else {
            boolean var1 = (field637 & 0x4) != 0;
            boolean var2 = var1;
            if (!var1) {
                boolean var3 = (field637 & 0x1) != 0;
                var2 = var3 && arg0.method2508();
            }
            return var2 || method5980() && arg0.method2511();
        }
    }

    @ObfuscatedName("ce.ju(Ldn;Ldw;IIIIII)V")
    public static final void method1175(class104 arg0, class100 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null || !arg1.method2526()) {
            return;
        }
        if (arg1 instanceof class106) {
            class195 var7 = ((class106) arg1).field1372;
            if (var7.field2042 != null) {
                var7 = var7.method3733();
            }
            if (var7 == null) {
                return;
            }
        }
        int var8 = field583.field1426;
        int[] var9 = field583.field1427;
        boolean var10 = arg2 < var8;
        int var11 = -2;
        if (arg1.field1252 != null && (!var10 || !arg1.field1240 && (field729 == 4 || !arg1.field1239 && (field729 == 0 || field729 == 3 || field729 == 1 && ((class95) arg1).method2508())))) {
            method5797(arg0, arg1, arg1.method2630());
            if (field621 > -1 && field609 < field610) {
                field614[field609] = Statics.field4047.method7933(arg1.field1252) / 2;
                field516[field609] = Statics.field4047.field4851;
                field611[field609] = field621;
                field612[field609] = field600 - var11;
                field569[field609] = arg1.field1242;
                field616[field609] = arg1.field1243;
                field618[field609] = arg1.field1231;
                field666[field609] = arg1.field1244;
                field567[field609] = arg1.field1252;
                field609++;
                var11 += 12;
            }
        }
        if (!arg1.field1251.method7305()) {
            method5797(arg0, arg1, arg1.method2630() + 15);
            for (class105 var12 = (class105) arg1.field1251.method7322(); var12 != null; var12 = (class105) arg1.field1251.method7303()) {
                class101 var13 = var12.method2845(field518);
                if (var13 != null) {
                    class187 var14 = var12.field1364;
                    class572 var15 = var14.method3681();
                    class572 var16 = var14.method3691();
                    int var17 = 0;
                    int var18;
                    if (var15 == null || var16 == null) {
                        var18 = var14.field1957;
                    } else {
                        if (var14.field1949 * 2 < var16.field5558) {
                            var17 = var14.field1949;
                        }
                        var18 = var16.field5558 - var17 * 2;
                    }
                    int var19 = 255;
                    boolean var20 = true;
                    int var21 = field518 - var13.field1300;
                    int var22 = var13.field1297 * var18 / var14.field1957;
                    int var25;
                    if (var13.field1298 > var21) {
                        int var23 = var14.field1961 == 0 ? 0 : var21 / var14.field1961 * var14.field1961;
                        int var24 = var13.field1296 * var18 / var14.field1957;
                        var25 = (var22 - var24) * var23 / var13.field1298 + var24;
                    } else {
                        var25 = var22;
                        int var26 = var13.field1298 + var14.field1956 - var21;
                        if (var14.field1955 >= 0) {
                            var19 = (var26 << 8) / (var14.field1956 - var14.field1955);
                        }
                    }
                    if (var13.field1297 > 0 && var25 < 1) {
                        var25 = 1;
                    }
                    if (var15 == null || var16 == null) {
                        var11 += 5;
                        if (field621 > -1) {
                            int var32 = field621 + arg3 - (var18 >> 1);
                            int var33 = field600 + arg4 - var11;
                            class568.method9616(var32, var33, var25, 5, 65280);
                            class568.method9616(var25 + var32, var33, var18 - var25, 5, 16711680);
                        }
                        var11 += 2;
                    } else {
                        int var27;
                        if (var18 == var25) {
                            var27 = var17 * 2 + var25;
                        } else {
                            var27 = var17 + var25;
                        }
                        int var28 = var15.field5559;
                        var11 += var28;
                        int var29 = field621 + arg3 - (var18 >> 1);
                        int var30 = field600 + arg4 - var11;
                        int var31 = var29 - var17;
                        if (var19 >= 0 && var19 < 255) {
                            var15.method9748(var31, var30, var19);
                            class568.method9630(var31, var30, var27 + var31, var28 + var30);
                            var16.method9748(var31, var30, var19);
                        } else {
                            var15.method9825(var31, var30);
                            class568.method9630(var31, var30, var27 + var31, var28 + var30);
                            var16.method9825(var31, var30);
                        }
                        class568.method9608(arg3, arg4, arg3 + arg5, arg4 + arg6);
                        var11 += 2;
                    }
                } else if (var12.method2850()) {
                    var12.method8667();
                }
            }
        }
        if (var11 == -2) {
            var11 += 7;
        }
        if (var10 && field518 == arg1.field1222 && method3907((class95) arg1)) {
            class95 var34 = (class95) arg1;
            if (var10) {
                method5797(arg0, arg1, arg1.method2630() + 15);
                class440 var35 = (class440) field571.get(class527.field5308);
                var11 += 4;
                var35.method7935(var34.field1141.method9989(), field621 + arg3, field600 + arg4 - var11, 16777215, 0);
                var11 += 18;
            }
        }
        if (var10) {
            class95 var36 = (class95) arg1;
            if (var36.field1142) {
                return;
            }
            if (var36.field1137 != -1 || var36.field1157 != -1) {
                method5797(arg0, arg1, arg1.field1294 + 15);
                if (field621 > -1) {
                    if (var36.field1137 != -1) {
                        var11 += 25;
                        Statics.field3310[var36.field1137].method9825(field621 + arg3 - 12, field600 + arg4 - var11);
                    }
                    if (var36.field1157 != -1) {
                        var11 += 25;
                        Statics.field5370[var36.field1157].method9825(field621 + arg3 - 12, field600 + arg4 - var11);
                    }
                }
            }
            if (arg2 >= 0 && field526 == 10 && field528 == var9[arg2]) {
                method5797(arg0, arg1, arg1.field1294 + 15);
                if (field621 > -1) {
                    int var37 = Statics.field497[1].field5559 + var11;
                    Statics.field497[1].method9825(field621 + arg3 - 12, field600 + arg4 - var37);
                }
            }
        } else {
            class106 var38 = (class106) arg1;
            int[] var39 = var38.method2872();
            short[] var40 = var38.method2861();
            if (var40 != null && var39 != null) {
                for (int var41 = 0; var41 < var40.length; var41++) {
                    if (var40[var41] >= 0 && var39[var41] >= 0) {
                        long var42 = (long) var39[var41] << 8 | (long) var40[var41];
                        class572 var44 = (class572) field790.method8225(var42);
                        if (var44 == null) {
                            class572[] var45 = class573.method3098(Statics.field4893, var39[var41], 0);
                            if (var45 != null && var40[var41] < var45.length) {
                                var44 = var45[var40[var41]];
                                field790.method8228(var42, var44);
                            }
                        }
                        if (var44 != null) {
                            method5797(arg0, arg1, arg1.method2630() + 15);
                            if (field621 > -1) {
                                var44.method9825(field621 + arg3 - (var44.field5558 >> 1), field600 + ((arg4 - var44.field5559 - 2) * (var41 + 1) - var44.field5559) - 4);
                            }
                        }
                    }
                }
            }
            if (field526 == 1 && field677 == arg0.field1342[arg2 - var8] && field518 % 20 < 10) {
                method5797(arg0, arg1, arg1.method2630() + 15);
                if (field621 > -1) {
                    Statics.field497[0].method9825(field621 + arg3 - 12, field600 + arg4 - 28);
                }
            }
        }
        for (int var46 = 0; var46 < 4; var46++) {
            int var47 = arg1.field1248[var46];
            int var48 = arg1.field1246[var46];
            class208 var49 = null;
            int var50 = 0;
            if (var48 >= 0) {
                if (var47 <= field518) {
                    continue;
                }
                var49 = class208.method9196(arg1.field1246[var46]);
                var50 = var49.field2152;
                if (var49 != null && var49.field2163 != null) {
                    var49 = var49.method3944();
                    if (var49 == null) {
                        arg1.field1248[var46] = -1;
                        continue;
                    }
                }
            } else if (var47 < 0) {
                continue;
            }
            int var51 = arg1.field1249[var46];
            class208 var52 = null;
            if (var51 >= 0) {
                var52 = class208.method9196(var51);
                if (var52 != null && var52.field2163 != null) {
                    var52 = var52.method3944();
                }
            }
            if (var47 - var50 <= field518) {
                if (var49 == null) {
                    arg1.field1248[var46] = -1;
                } else {
                    method5797(arg0, arg1, arg1.method2630() / 2);
                    if (field621 > -1) {
                        boolean var53 = true;
                        if (var46 == 1) {
                            field600 -= 20;
                        }
                        if (var46 == 2) {
                            field621 -= 15;
                            field600 -= 10;
                        }
                        if (var46 == 3) {
                            field621 += 15;
                            field600 -= 10;
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
                        class572 var66 = null;
                        class572 var67 = null;
                        class572 var68 = null;
                        class572 var69 = null;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        class572 var79 = var49.method3914();
                        if (var79 != null) {
                            var58 = var79.field5558;
                            int var80 = var79.field5559;
                            if (var80 > var78) {
                                var78 = var80;
                            }
                            var62 = var79.field5562;
                        }
                        class572 var81 = var49.method3915();
                        if (var81 != null) {
                            var59 = var81.field5558;
                            int var82 = var81.field5559;
                            if (var82 > var78) {
                                var78 = var82;
                            }
                            var63 = var81.field5562;
                        }
                        class572 var83 = var49.method3916();
                        if (var83 != null) {
                            var60 = var83.field5558;
                            int var84 = var83.field5559;
                            if (var84 > var78) {
                                var78 = var84;
                            }
                            var64 = var83.field5562;
                        }
                        class572 var85 = var49.method3912();
                        if (var85 != null) {
                            var61 = var85.field5558;
                            int var86 = var85.field5559;
                            if (var86 > var78) {
                                var78 = var86;
                            }
                            var65 = var85.field5562;
                        }
                        if (var52 != null) {
                            var66 = var52.method3914();
                            if (var66 != null) {
                                var70 = var66.field5558;
                                int var87 = var66.field5559;
                                if (var87 > var78) {
                                    var78 = var87;
                                }
                                var74 = var66.field5562;
                            }
                            var67 = var52.method3915();
                            if (var67 != null) {
                                var71 = var67.field5558;
                                int var88 = var67.field5559;
                                if (var88 > var78) {
                                    var78 = var88;
                                }
                                var75 = var67.field5562;
                            }
                            var68 = var52.method3916();
                            if (var68 != null) {
                                var72 = var68.field5558;
                                int var89 = var68.field5559;
                                if (var89 > var78) {
                                    var78 = var89;
                                }
                                var76 = var68.field5562;
                            }
                            var69 = var52.method3912();
                            if (var69 != null) {
                                var73 = var69.field5558;
                                int var90 = var69.field5559;
                                if (var90 > var78) {
                                    var78 = var90;
                                }
                                var77 = var69.field5562;
                            }
                        }
                        class436 var91 = var49.method3928();
                        if (var91 == null) {
                            var91 = Statics.field2412;
                        }
                        class436 var92;
                        if (var52 == null) {
                            var92 = Statics.field2412;
                        } else {
                            var92 = var52.method3928();
                            if (var92 == null) {
                                var92 = Statics.field2412;
                            }
                        }
                        Object var93 = null;
                        String var94 = null;
                        boolean var95 = false;
                        int var96 = 0;
                        String var97 = var49.method3913(arg1.field1273[var46]);
                        int var98 = var91.method7933(var97);
                        if (var52 != null) {
                            var94 = var52.method3913(arg1.field1250[var46]);
                            var96 = var92.method7933(var94);
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
                        int var115 = arg1.field1248[var46] - field518;
                        int var116 = var49.field2157 - var49.field2157 * var115 / var49.field2152;
                        int var117 = var49.field2150 * var115 / var49.field2152 + -var49.field2150;
                        int var118 = field621 + arg3 - (var107 >> 1) + var116;
                        int var119 = field600 + arg4 - 12 + var117;
                        int var120 = var119;
                        int var121 = var78 + var119;
                        int var122 = var49.field2159 + var119 + 15;
                        int var123 = var122 - var91.field4843;
                        int var124 = var91.field4852 + var122;
                        if (var123 < var119) {
                            var120 = var123;
                        }
                        if (var124 > var121) {
                            var121 = var124;
                        }
                        int var125 = 0;
                        if (var52 != null) {
                            var125 = var52.field2159 + var119 + 15;
                            int var126 = var125 - var92.field4843;
                            int var127 = var92.field4852 + var125;
                            if (var126 < var120) {
                                ;
                            }
                            if (var127 > var121) {
                                ;
                            }
                        }
                        int var130 = 255;
                        if (var49.field2143 >= 0) {
                            var130 = (var115 << 8) / (var49.field2152 - var49.field2143);
                        }
                        if (var130 >= 0 && var130 < 255) {
                            if (var79 != null) {
                                var79.method9748(var102 + var118 - var62, var119, var130);
                            }
                            if (var83 != null) {
                                var83.method9748(var103 + var118 - var64, var119, var130);
                            }
                            if (var81 != null) {
                                for (int var131 = 0; var131 < var99; var131++) {
                                    var81.method9748(var59 * var131 + (var104 + var118 - var63), var119, var130);
                                }
                            }
                            if (var85 != null) {
                                var85.method9748(var108 + var118 - var65, var119, var130);
                            }
                            var91.method7926(var97, var105 + var118, var122, var49.field2161, 0, var130);
                            if (var52 != null) {
                                if (var66 != null) {
                                    var66.method9748(var109 + var118 - var74, var119, var130);
                                }
                                if (var68 != null) {
                                    var68.method9748(var110 + var118 - var76, var119, var130);
                                }
                                if (var67 != null) {
                                    for (int var132 = 0; var132 < var100; var132++) {
                                        var67.method9748(var71 * var132 + (var111 + var118 - var75), var119, var130);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method9748(var112 + var118 - var77, var119, var130);
                                }
                                var92.method7926(var94, var113 + var118, var125, var52.field2161, 0, var130);
                            }
                        } else {
                            if (var79 != null) {
                                var79.method9825(var102 + var118 - var62, var119);
                            }
                            if (var83 != null) {
                                var83.method9825(var103 + var118 - var64, var119);
                            }
                            if (var81 != null) {
                                for (int var133 = 0; var133 < var99; var133++) {
                                    var81.method9825(var59 * var133 + (var104 + var118 - var63), var119);
                                }
                            }
                            if (var85 != null) {
                                var85.method9825(var108 + var118 - var65, var119);
                            }
                            var91.method7932(var97, var105 + var118, var122, var49.field2161 | 0xFF000000, 0);
                            if (var52 != null) {
                                if (var66 != null) {
                                    var66.method9825(var109 + var118 - var74, var119);
                                }
                                if (var68 != null) {
                                    var68.method9825(var110 + var118 - var76, var119);
                                }
                                if (var67 != null) {
                                    for (int var134 = 0; var134 < var100; var134++) {
                                        var67.method9825(var71 * var134 + (var111 + var118 - var75), var119);
                                    }
                                }
                                if (var69 != null) {
                                    var69.method9825(var112 + var118 - var77, var119);
                                }
                                var92.method7932(var94, var113 + var118, var125, var52.field2161 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("client.jg(Ldn;IIIII)V")
    public static final void method1873(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        field609 = 0;
        boolean var5 = false;
        int var6 = -1;
        int var7 = -1;
        int var8 = field583.field1426;
        int[] var9 = field583.field1427;
        for (int var10 = 0; var10 < arg0.field1360 + var8; var10++) {
            class100 var11;
            if (var10 < var8) {
                var11 = arg0.field1357[var9[var10]];
                if (field644 == var9[var10]) {
                    var5 = true;
                    var6 = var10;
                    continue;
                }
                if (Statics.field3772 == var11) {
                    var7 = var10;
                    continue;
                }
            } else {
                var11 = arg0.field1353[arg0.field1342[var10 - var8]];
            }
            method1175(arg0, var11, var10, arg1, arg2, arg3, arg4);
        }
        if (field636 && var7 != -1) {
            method1175(arg0, Statics.field3772, var7, arg1, arg2, arg3, arg4);
        }
        if (var5) {
            method1175(arg0, arg0.field1357[field644], var6, arg1, arg2, arg3, arg4);
        }
        for (int var12 = 0; var12 < field609; var12++) {
            int var13 = field611[var12];
            int var14 = field612[var12];
            int var15 = field614[var12];
            int var16 = field516[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field612[var18] - field516[var18] && var14 - var16 < field612[var18] + 2 && var13 - var15 < field614[var18] + field611[var18] && var13 + var15 > field611[var18] - field614[var18] && field612[var18] - field516[var18] < var14) {
                        var14 = field612[var18] - field516[var18];
                        var17 = true;
                    }
                }
            }
            field621 = field611[var12];
            field600 = field612[var12] = var14;
            String var19 = field567[var12];
            if (field670 == 0) {
                int var20 = 16776960;
                if (field569[var12] < 6) {
                    var20 = field772[field569[var12]];
                }
                if (field569[var12] == 6) {
                    var20 = field544 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field569[var12] == 7) {
                    var20 = field544 % 20 < 10 ? 255 : 65535;
                }
                if (field569[var12] == 8) {
                    var20 = field544 % 20 < 10 ? 45056 : 8454016;
                }
                if (field569[var12] == 9) {
                    int var21 = 150 - field618[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field569[var12] == 10) {
                    int var22 = 150 - field618[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field569[var12] == 11) {
                    int var23 = 150 - field618[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field569[var12] == 12 && field666[var12] == null) {
                    int var24 = var19.length();
                    field666[var12] = new int[var24];
                    for (int var25 = 0; var25 < var24; var25++) {
                        int var26 = (int) ((float) var25 / (float) var24 * 64.0F);
                        int var27 = var26 << 10 | 0x380 | 0x40;
                        field666[var12][var25] = class509.field5158[var27];
                    }
                }
                if (field616[var12] == 0) {
                    Statics.field4047.method7967(var19, field621 + arg1, field600 + arg2, var20, 0, field666[var12]);
                }
                if (field616[var12] == 1) {
                    Statics.field4047.method8018(var19, field621 + arg1, field600 + arg2, var20, 0, field544, field666[var12]);
                }
                if (field616[var12] == 2) {
                    Statics.field4047.method7940(var19, field621 + arg1, field600 + arg2, var20, 0, field544, field666[var12]);
                }
                if (field616[var12] == 3) {
                    Statics.field4047.method7941(var19, field621 + arg1, field600 + arg2, var20, 0, field544, 150 - field618[var12], field666[var12]);
                }
                if (field616[var12] == 4) {
                    int var28 = (150 - field618[var12]) * (Statics.field4047.method7933(var19) + 100) / 150;
                    class568.method9630(field621 + arg1 - 50, arg2, field621 + arg1 + 50, arg2 + arg4);
                    Statics.field4047.method7943(var19, field621 + arg1 + 50 - var28, field600 + arg2, var20, 0, field666[var12]);
                    class568.method9608(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
                if (field616[var12] == 5) {
                    int var29 = 150 - field618[var12];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    class568.method9630(arg1, field600 + arg2 - Statics.field4047.field4851 - 1, arg1 + arg3, field600 + arg2 + 5);
                    Statics.field4047.method7967(var19, field621 + arg1, field600 + arg2 + var30, var20, 0, field666[var12]);
                    class568.method9608(arg1, arg2, arg1 + arg3, arg2 + arg4);
                }
            } else {
                Statics.field4047.method7935(var19, field621 + arg1, field600 + arg2, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("si.jw(B)V")
    public static final void method8346() {
        field628 = 0;
        int var0 = (Statics.field3772.field1247 >> 7) + Statics.field2071.field1347;
        int var1 = (Statics.field3772.field1270 >> 7) + Statics.field2071.field1348;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field628 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field628 = 1;
        }
        if (field628 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field628 = 0;
        }
    }

    @ObfuscatedName("lw.jm(IIIII)V")
    public static final void method5759(int arg0, int arg1, int arg2, int arg3) {
        method8346();
    }

    @ObfuscatedName("lr.jq(Ldn;Ldw;II)V")
    public static void method5797(class104 arg0, class100 arg1, int arg2) {
        class351 var3 = arg1.method2629(arg0);
        int var4 = arg1.field1247;
        int var5 = arg1.field1221 - 1;
        int var6 = (var5 << 6) + var4;
        int var8 = arg1.field1270;
        int var9 = arg1.field1221 - 1;
        int var10 = (var9 << 6) + var8;
        method3411(arg0, var3.field3777, var3.field3778, var6, var10, arg2);
    }

    @ObfuscatedName("fq.jx(Ldn;IIIIII)V")
    public static void method3411(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 128 || 13056 < arg1 || arg2 < 128 || 13056 < arg2) {
            field621 = -1;
            field600 = -1;
            return;
        }
        int var6 = method1164(arg0, arg3, arg4, arg0.field1344) - arg5;
        int var7 = arg1 - Statics.field65;
        int var8 = var6 - Statics.field2297;
        int var9 = arg2 - Statics.field4526;
        int var10 = class240.field2591[Statics.field3415];
        int var11 = class240.field2592[Statics.field3415];
        int var12 = class240.field2591[Statics.field4586];
        int var13 = class240.field2592[Statics.field4586];
        int var14 = var7 * var13 + var9 * var12 >> 16;
        int var15 = var9 * var13 - var7 * var12 >> 16;
        int var17 = var8 * var11 - var10 * var15 >> 16;
        int var18 = var8 * var10 + var11 * var15 >> 16;
        if (var18 >= 50) {
            field621 = field783 * var14 / var18 + field781 / 2;
            field600 = field783 * var17 / var18 + field582 / 2;
        } else {
            field621 = -1;
            field600 = -1;
        }
    }

    @ObfuscatedName("cu.jl(Ldn;IIII)I")
    public static final int method1164(class104 arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 >= arg0.field1351[0].length || var5 >= arg0.field1351[0][0].length) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (arg0.field1351[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * arg0.field1350[var6][var4][var5] + arg0.field1350[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * arg0.field1350[var6][var4][var5 + 1] + arg0.field1350[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @ObfuscatedName("qt.jt(IIB)I")
    public static int method7585(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field774 - field558) * var2 / 100 + field558;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("fs.ji(IIIIIIII)V")
    public static final void method3413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method7585(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class240.field2591[var8];
            int var14 = class240.field2592[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class240.field2591[var9];
            int var17 = class240.field2592[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        if (field586) {
            Statics.field1522 = arg0 - var10;
            Statics.field35 = arg1 - var11;
            Statics.field4984 = arg2 - var12;
            Statics.field1340 = arg3;
            Statics.field4652 = arg4;
        } else {
            Statics.field65 = arg0 - var10;
            Statics.field2297 = arg1 - var11;
            Statics.field4526 = arg2 - var12;
            Statics.field3415 = arg3;
            Statics.field4586 = arg4;
        }
        if (field797 != 1 || field674 < 2 || field518 % 50 != 0 || !(Statics.field5082 >> 7 != Statics.field3772.field1247 >> 7 || Statics.field3241 >> 7 != Statics.field3772.field1270 >> 7)) {
            return;
        }
        int var19 = Statics.field3772.field1148;
        int var20 = (Statics.field5082 >> 7) + Statics.field2071.field1347;
        int var21 = (Statics.field3241 >> 7) + Statics.field2071.field1348;
        class325 var22 = class325.method2983(class323.field3403, field784.field1485);
        var22.field3433.method9253(var19);
        var22.field3433.method9313(field604);
        var22.field3433.method9297(var21);
        var22.field3433.method9297(var20);
        field784.method3070(var22);
    }

    @ObfuscatedName("ku.jc(ZLvm;I)V")
    public static final void method5221(boolean arg0, class557 arg1) {
        field651 = arg0;
        if (!field651) {
            arg1.method9304();
            int var2 = arg1.method9301();
            int var3 = arg1.method9260();
            int var4 = arg1.method9260();
            Statics.field1557 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1557[var5][var6] = arg1.method9264();
                }
            }
            Statics.field3055 = new int[var4];
            Statics.field1755 = new int[var4];
            Statics.field2349 = new int[var4];
            Statics.field4133 = new byte[var4][];
            Statics.field7 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
                for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field3055[var7] = var10;
                    Statics.field1755[var7] = Statics.field1966.method7010("m" + var8 + "_" + var9);
                    Statics.field2349[var7] = Statics.field1966.method7010("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method2488(var2, var3, true);
            return;
        }
        int var11 = arg1.method9388();
        int var12 = arg1.method9388();
        boolean var13 = arg1.method9478() == 1;
        int var14 = arg1.method9260();
        arg1.method9206();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method9207(1);
                    if (var18 == 1) {
                        field746[var15][var16][var17] = arg1.method9207(26);
                    } else {
                        field746[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method9208();
        Statics.field1557 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field1557[var19][var20] = arg1.method9264();
            }
        }
        Statics.field3055 = new int[var14];
        Statics.field1755 = new int[var14];
        Statics.field2349 = new int[var14];
        Statics.field4133 = new byte[var14][];
        Statics.field7 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field746[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field3055[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field3055[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field1755[var21] = Statics.field1966.method7010("m" + var30 + "_" + var31);
                            Statics.field2349[var21] = Statics.field1966.method7010("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method2488(var12, var11, !var13);
    }

    @ObfuscatedName("dx.jb(IIZI)V")
    public static final void method2488(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field3814 == arg0 && Statics.field1547 == arg1) {
            return;
        }
        Statics.field3814 = arg0;
        Statics.field1547 = arg1;
        Statics.method3201(25);
        field511 = true;
        method3965(class383.field4191, true);
        int var3 = Statics.field2071.field1347;
        int var4 = Statics.field2071.field1348;
        Statics.field2071.field1347 = (arg0 - 6) * 8;
        Statics.field2071.field1348 = (arg1 - 6) * 8;
        int var5 = Statics.field2071.field1347 - var3;
        int var6 = Statics.field2071.field1348 - var4;
        int var7 = var5 * 128;
        int var8 = var6 * 128;
        for (int var9 = 0; var9 < 65536; var9++) {
            class106 var10 = Statics.field2071.field1353[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1288[var11] -= var5;
                    var10.field1234[var11] -= var6;
                }
                var10.field1247 -= var7;
                var10.field1270 -= var8;
                var10.field1269 -= var5;
                var10.field1229 -= var6;
                var10.field1287 -= var5;
                var10.field1272 -= var6;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class95 var13 = Statics.field2071.field1357[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1288[var14] -= var5;
                    var13.field1234[var14] -= var6;
                }
                var13.field1247 -= var7;
                var13.field1270 -= var8;
                var13.field1269 -= var5;
                var13.field1229 -= var6;
                var13.field1287 -= var5;
                var13.field1272 -= var6;
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class481 var16 = Statics.field2071.field1355[var15];
            if (var16 != null) {
                var16.method8442(-var7, -var8);
            }
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var5 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        byte var20 = 0;
        byte var21 = 104;
        byte var22 = 1;
        if (var6 < 0) {
            var20 = 103;
            var21 = -1;
            var22 = -1;
        }
        for (int var23 = var17; var23 != var18; var23 += var19) {
            for (int var24 = var20; var24 != var21; var24 += var22) {
                int var25 = var5 + var23;
                int var26 = var6 + var24;
                for (int var27 = 0; var27 < 4; var27++) {
                    if (0 <= var25 && var25 < 104 && 0 <= var26 && var26 < 104) {
                        Statics.field2071.field1359[var27][var23][var24] = Statics.field2071.field1359[var27][var25][var26];
                    } else {
                        Statics.field2071.field1359[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class99 var28 = (class99) Statics.field2071.field1341.method7247(); var28 != null; var28 = (class99) Statics.field2071.field1341.method7249()) {
            var28.field1199 -= var5;
            var28.field1202 -= var6;
            if (var28.field1199 < 0 || 104 <= var28.field1199 || var28.field1202 < 0 || 104 <= var28.field1202) {
                var28.method8667();
            }
        }
        if (field747 != 0) {
            field747 -= var5;
            field748 -= var6;
        }
        field751 = 0;
        field586 = false;
        Statics.field65 -= var5 << 7;
        Statics.field4526 -= var6 << 7;
        Statics.field5082 -= var5 << 7;
        Statics.field3241 -= var6 << 7;
        field579 = -1;
        Statics.field2071.field1362.method7248();
        Statics.field2071.field1361.method7248();
        for (int var29 = 0; var29 < 4; var29++) {
            Statics.field2071.field1343[var29].method5280();
        }
    }

    @ObfuscatedName("ec.jv(ZB)V")
    public static final void method2937(boolean arg0) {
        method3410();
        field784.field1477++;
        if (field784.field1477 < 50 && !arg0) {
            return;
        }
        field784.field1477 = 0;
        if (field527 || field784.method3053() == null) {
            return;
        }
        class325 var1 = class325.method2983(class323.field3332, field784.field1485);
        field784.method3070(var1);
        try {
            field784.method3048();
        } catch (IOException var3) {
            field527 = true;
        }
    }

    @ObfuscatedName("rq.jf(I)V")
    public static final void method8059() {
        method2937(false);
        field654 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field4133.length; var1++) {
            if (Statics.field1755[var1] != -1 && Statics.field4133[var1] == null) {
                Statics.field4133[var1] = Statics.field1966.method7009(Statics.field1755[var1], 0);
                if (Statics.field4133[var1] == null) {
                    var0 = false;
                    field654++;
                }
            }
            if (Statics.field2349[var1] != -1 && Statics.field7[var1] == null) {
                Statics.field7[var1] = Statics.field1966.method6998(Statics.field2349[var1], 0, Statics.field1557[var1]);
                if (Statics.field7[var1] == null) {
                    var0 = false;
                    field654++;
                }
            }
        }
        if (!var0) {
            field515 = 1;
            return;
        }
        field572 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field4133.length; var3++) {
            byte[] var4 = Statics.field7[var3];
            if (var4 != null) {
                int var5 = (Statics.field3055[var3] >> 8) * 64 - Statics.field2071.field1347;
                int var6 = (Statics.field3055[var3] & 0xFF) * 64 - Statics.field2071.field1348;
                if (field651) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class85.method2385(var4, var5, var6);
            }
        }
        if (!var2) {
            field515 = 2;
            return;
        }
        if (field515 != 0) {
            method3965(class383.field4191 + class107.field1385 + class107.field1379 + 100 + "%" + class107.field1383, true);
        }
        method3410();
        Statics.field2071.field1352.method4676();
        for (int var7 = 0; var7 < 4; var7++) {
            Statics.field2071.field1343[var7].method5280();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    Statics.field2071.field1351[var8][var9][var10] = 0;
                }
            }
        }
        method3410();
        class85.method3116();
        int var11 = Statics.field4133.length;
        class72.method5757();
        method2937(true);
        if (!field651) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field3055[var12] >> 8) * 64 - Statics.field2071.field1347;
                int var14 = (Statics.field3055[var12] & 0xFF) * 64 - Statics.field2071.field1348;
                byte[] var15 = Statics.field4133[var12];
                if (var15 != null) {
                    method3410();
                    Statics.method13(Statics.field2071, var15, var13, var14, Statics.field3814 * 8 - 48, Statics.field1547 * 8 - 48);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field3055[var16] >> 8) * 64 - Statics.field2071.field1347;
                int var18 = (Statics.field3055[var16] & 0xFF) * 64 - Statics.field2071.field1348;
                byte[] var19 = Statics.field4133[var16];
                if (var19 == null && Statics.field1547 < 800) {
                    method3410();
                    class85.method2371(Statics.field2071, var17, var18, 64, 64);
                }
            }
            method2937(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field7[var20];
                if (var21 != null) {
                    int var22 = (Statics.field3055[var20] >> 8) * 64 - Statics.field2071.field1347;
                    int var23 = (Statics.field3055[var20] & 0xFF) * 64 - Statics.field2071.field1348;
                    method3410();
                    class85.method43(Statics.field2071, var21, var22, var23);
                }
            }
        }
        if (field651) {
            for (int var24 = 0; var24 < 4; var24++) {
                method3410();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field746[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field3055.length; var34++) {
                                if (Statics.field3055[var34] == var33 && Statics.field4133[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class85.method8212(Statics.field2071, Statics.field4133[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class85.method3352(Statics.field2071.field1350, var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field746[0][var37][var38];
                    if (var39 == -1) {
                        class85.method2371(Statics.field2071, var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method2937(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method3410();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field746[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field3055.length; var49++) {
                                if (Statics.field3055[var49] == var48 && Statics.field7[var49] != null) {
                                    class85.method2428(Statics.field2071, Statics.field7[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2937(true);
        method3410();
        class85.method8660(Statics.field2071);
        method2937(true);
        int var50 = class85.field1035;
        if (var50 > Statics.field2071.field1344) {
            var50 = Statics.field2071.field1344;
        }
        if (var50 < Statics.field2071.field1344 - 1) {
            int var51 = Statics.field2071.field1344 - 1;
        }
        if (field506) {
            Statics.field2071.field1352.method4677(class85.field1035);
        } else {
            Statics.field2071.field1352.method4677(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method7119(Statics.field2071, var52, var53);
            }
        }
        method3410();
        method2663();
        class210.field2175.method5930();
        if (Statics.field995.method527()) {
            class325 var54 = class325.method2983(class323.field3362, field784.field1485);
            var54.field3433.method9244(1057001181);
            field784.method3070(var54);
        }
        if (!field651) {
            int var55 = (Statics.field3814 - 6) / 8;
            int var56 = (Statics.field3814 + 6) / 8;
            int var57 = (Statics.field1547 - 6) / 8;
            int var58 = (Statics.field1547 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field1966.method7016("m" + var59 + "_" + var60);
                        Statics.field1966.method7016("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method3410();
        class85.method2497();
        class325 var61 = class325.method2983(class323.field3339, field784.field1485);
        field784.method3070(var61);
        class35.method3561();
        field511 = false;
    }

    @ObfuscatedName("dl.ja(Ldn;B)V")
    public static void method2471(class104 arg0) {
        int var1 = arg0.field1345 / 8;
        int var2 = arg0.field1346 / 8;
        boolean var3 = false;
        method2937(false);
        boolean var4 = true;
        for (int var5 = 0; var5 < Statics.field3717.length; var5++) {
            if (Statics.field2126[var5] != -1 && Statics.field3717[var5] == null) {
                Statics.field3717[var5] = Statics.field1966.method7009(Statics.field2126[var5], 0);
                if (Statics.field3717[var5] == null) {
                    var4 = false;
                }
            }
            if (Statics.field2734[var5] != -1 && Statics.field3609[var5] == null) {
                Statics.field3609[var5] = Statics.field1966.method6998(Statics.field2734[var5], 0, Statics.field3718[var5]);
                if (Statics.field3609[var5] == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return;
        }
        method2937(false);
        boolean var6 = true;
        for (int var7 = 0; var7 < Statics.field3717.length; var7++) {
            byte[] var8 = Statics.field3609[var7];
            if (var8 != null) {
                byte var9 = 10;
                byte var10 = 10;
                var6 &= class85.method2385(var8, var9, var10);
            }
        }
        if (!var6) {
            return;
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < arg0.field1351[var11].length; var12++) {
                Arrays.fill(arg0.field1351[var11][var12], (byte) 0);
            }
        }
        method3410();
        class85.method3116();
        class72.method5757();
        method2937(true);
        for (int var13 = 0; var13 < 4; var13++) {
            method3410();
            for (int var14 = 0; var14 < var1; var14++) {
                for (int var15 = 0; var15 < var2; var15++) {
                    boolean var16 = false;
                    int var17 = field577[var13][var14][var15];
                    if (var17 != -1) {
                        int var18 = var17 >> 24 & 0x3;
                        int var19 = var17 >> 1 & 0x3;
                        int var20 = var17 >> 14 & 0x3FF;
                        int var21 = var17 >> 3 & 0x7FF;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < Statics.field1375.length; var23++) {
                            if (Statics.field1375[var23] == var22 && Statics.field3717[var23] != null) {
                                int var24 = (var20 - var14) * 8;
                                int var25 = (var21 - var15) * 8;
                                class85.method8212(arg0, Statics.field3717[var23], var13, var14 * 8, var15 * 8, var18, (var20 & 0x7) * 8, (var21 & 0x7) * 8, var19, var24, var25);
                                var16 = true;
                                break;
                            }
                        }
                    }
                    if (!var16) {
                        class85.method3352(arg0.field1350, var13, var14 * 8, var15 * 8);
                    }
                }
            }
        }
        for (int var26 = 0; var26 < 13; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                int var28 = field577[0][var26][var27];
                if (var28 == -1) {
                    class85.method2371(arg0, var26 * 8, var27 * 8, 8, 8);
                }
            }
        }
        method2937(true);
        for (int var29 = 0; var29 < 4; var29++) {
            method3410();
            for (int var30 = 0; var30 < var1; var30++) {
                for (int var31 = 0; var31 < var2; var31++) {
                    int var32 = field577[var29][var30][var31];
                    if (var32 != -1) {
                        int var33 = var32 >> 24 & 0x3;
                        int var34 = var32 >> 1 & 0x3;
                        int var35 = var32 >> 14 & 0x3FF;
                        int var36 = var32 >> 3 & 0x7FF;
                        int var37 = (var35 / 8 << 8) + var36 / 8;
                        for (int var38 = 0; var38 < Statics.field1375.length; var38++) {
                            if (Statics.field1375[var38] == var37 && Statics.field3609[var38] != null) {
                                class85.method2428(arg0, Statics.field3609[var38], var29, var30 * 8, var31 * 8, var33, (var35 & 0x7) * 8, (var36 & 0x7) * 8, var34);
                                break;
                            }
                        }
                    }
                }
            }
        }
        method2937(true);
        method3410();
        class85.method8660(arg0);
        method2937(true);
        class210.field2175.method5930();
        method3410();
        class85.method2497();
        field619 = false;
    }

    @ObfuscatedName("bv.jo(II)V")
    public static final void method440(int arg0) {
        int[] var1 = Statics.field378.field5567;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((Statics.field2071.field1351[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field2071.field1352.method4878(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (Statics.field2071.field1351[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field2071.field1352.method4878(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field378.method9733();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((Statics.field2071.field1351[arg0][var10][var9] & 0x18) == 0) {
                    method3584(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (Statics.field2071.field1351[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method3584(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field743 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field2071.field1352.method4705(Statics.field2071.field1344, var11, var12);
                if (var13 != 0L) {
                    int var15 = class257.method5896(var13);
                    int var16 = class210.method3109(var15).field2200;
                    if (var16 >= 0 && class184.method174(var16).field1917) {
                        field693[field743] = class184.method174(var16).method3615(false);
                        field744[field743] = var11;
                        field745[field743] = var12;
                        field743++;
                    }
                }
            }
        }
        Statics.field2344.method9696();
    }

    @ObfuscatedName("gs.jk(IIIIII)V")
    public static final void method3584(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class245 var5 = Statics.field2071.field1352;
        long var6 = var5.method4790(arg0, arg1, arg2);
        if (var6 != 0L) {
            int var8 = var5.method4776(arg0, arg1, arg2, var6);
            int var9 = var8 >> 6 & 0x3;
            int var10 = var8 & 0x1F;
            int var11 = arg3;
            if (class257.method7140(var6)) {
                var11 = arg4;
            }
            int[] var12 = Statics.field378.field5567;
            int var13 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var14 = class257.method5896(var6);
            class210 var15 = class210.method3109(var14);
            if (var15.field2201 == -1) {
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
                class571 var16 = Statics.field4749[var15.field2201];
                if (var16 != null) {
                    int var17 = (var15.field2187 * 4 - var16.field5549) / 2;
                    int var18 = (var15.field2216 * 4 - var16.field5551) / 2;
                    var16.method9720(arg1 * 4 + 48 + var17, (104 - arg2 - var15.field2216) * 4 + 48 + var18);
                }
            }
        }
        long var19 = var5.method4817(arg0, arg1, arg2);
        if (var19 != 0L) {
            int var21 = var5.method4776(arg0, arg1, arg2, var19);
            int var22 = var21 >> 6 & 0x3;
            int var23 = var21 & 0x1F;
            int var24 = class257.method5896(var19);
            class210 var25 = class210.method3109(var24);
            if (var25.field2201 != -1) {
                class571 var26 = Statics.field4749[var25.field2201];
                if (var26 != null) {
                    int var27 = (var25.field2187 * 4 - var26.field5549) / 2;
                    int var28 = (var25.field2216 * 4 - var26.field5551) / 2;
                    var26.method9720(arg1 * 4 + 48 + var27, (104 - arg2 - var25.field2216) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (class257.method7140(var19)) {
                    var29 = 15597568;
                }
                int[] var30 = Statics.field378.field5567;
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
        long var32 = var5.method4705(arg0, arg1, arg2);
        if (var32 == 0L) {
            return;
        }
        int var34 = class257.method5896(var32);
        class210 var35 = class210.method3109(var34);
        if (var35.field2201 == -1) {
            return;
        }
        class571 var36 = Statics.field4749[var35.field2201];
        if (var36 != null) {
            int var37 = (var35.field2187 * 4 - var36.field5549) / 2;
            int var38 = (var35.field2216 * 4 - var36.field5551) / 2;
            var36.method9720(arg1 * 4 + 48 + var37, (104 - arg2 - var35.field2216) * 4 + 48 + var38);
        }
    }

    @ObfuscatedName("client.jz(Led;IB)Z")
    public boolean method1419(class117 arg0, int arg1) {
        if (arg0.field1475 == 0) {
            Statics.field1216 = null;
        } else {
            if (Statics.field1216 == null) {
                Statics.field1216 = new class471(Statics.field3276, Statics.field995);
            }
            Statics.field1216.method8280(arg0.field1473, arg1);
        }
        method8407();
        arg0.field1474 = null;
        return true;
    }

    @ObfuscatedName("client.js(Led;I)Z")
    public boolean method1384(class117 arg0) {
        if (Statics.field1216 != null) {
            Statics.field1216.method8281(arg0.field1473);
        }
        method8407();
        arg0.field1474 = null;
        return true;
    }

    @ObfuscatedName("client.jn(Led;I)Z")
    public final boolean method1259(class117 arg0) {
        class487 var2 = arg0.method3053();
        class557 var3 = arg0.field1473;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1474 == null) {
                if (arg0.field1476) {
                    if (!var2.method8499(1)) {
                        return false;
                    }
                    var2.method8501(arg0.field1473.field5463, 0, 1);
                    arg0.field1468 = 0;
                    arg0.field1476 = false;
                }
                var3.field5462 = 0;
                if (var3.method9203()) {
                    if (!var2.method8499(1)) {
                        return false;
                    }
                    var2.method8501(arg0.field1473.field5463, 1, 1);
                    arg0.field1468 = 0;
                }
                arg0.field1476 = true;
                class326[] var4 = class326.method1234();
                int var5 = var3.method9221();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5462);
                }
                arg0.field1474 = var4[var5];
                arg0.field1475 = arg0.field1474.field3582;
            }
            if (arg0.field1475 == -1) {
                if (!var2.method8499(1)) {
                    return false;
                }
                arg0.method3053().method8501(var3.field5463, 0, 1);
                arg0.field1475 = var3.field5463[0] & 0xFF;
            }
            if (arg0.field1475 == -2) {
                if (!var2.method8499(2)) {
                    return false;
                }
                arg0.method3053().method8501(var3.field5463, 0, 2);
                var3.field5462 = 0;
                arg0.field1475 = var3.method9260();
            }
            if (!var2.method8499(arg0.field1475)) {
                return false;
            }
            var3.field5462 = 0;
            var2.method8501(var3.field5463, 0, arg0.field1475);
            arg0.field1468 = 0;
            field570.method8142();
            arg0.field1481 = arg0.field1480;
            arg0.field1480 = arg0.field1479;
            arg0.field1479 = arg0.field1474;
            if (class326.field3543 == arg0.field1474) {
                int var6 = var3.method9264();
                class362 var7 = Statics.field4741.method6314(var6);
                for (int var8 = 0; var8 < var7.field4016.length; var8++) {
                    var7.field4016[var8] = -1;
                    var7.field4016[var8] = 0;
                }
                method2944(var7);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3490 == arg0.field1474) {
                int var9 = var3.method9308();
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = (var9 >> 4 & 0x7) + var10;
                int var13 = (var9 & 0x7) + var11;
                int var14 = var3.method9301();
                int var15 = var3.method9291();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = field581[var16];
                if (0 <= var12 && var12 < 103 && 0 <= var13 && var13 < 103) {
                    method5798(var12, var13, var16, var17, var18, var14);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3553 == arg0.field1474) {
                int var19 = var3.method9507();
                int var20 = var3.method9388();
                int var21 = var3.method9258();
                int var22 = var3.method9540();
                class95 var23;
                if (field630 == var22) {
                    var23 = Statics.field3772;
                } else {
                    var23 = Statics.field3742.field1357[var22];
                }
                if (var23 != null) {
                    var23.method2624(var21, var20, var19 >> 16, var19 & 0xFFFF);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3524 == arg0.field1474) {
                method7481(Statics.field3742, false, var3, 4);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3540 == arg0.field1474) {
                method7481(Statics.field3742, false, var3, 5);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3464 == arg0.field1474) {
                return this.method1419(arg0, 2);
            }
            if (class326.field3547 == arg0.field1474) {
                int var24 = var3.method9388();
                if (var24 == 65535) {
                    var24 = -1;
                }
                field723 = var24;
                this.method1267(false);
                method3702(var24);
                class73.method1232(field723);
                for (int var25 = 0; var25 < 100; var25++) {
                    field716[var25] = true;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3462 == arg0.field1474) {
                method5221(true, arg0.field1473);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3564 == arg0.field1474) {
                Statics.field1697 = var3.method9267();
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3523 == arg0.field1474) {
                int var26 = var3.method9264();
                class90 var27 = (class90) field667.method8993((long) var26);
                if (var27 != null) {
                    method7489(var27, true);
                }
                if (field671 != null) {
                    method2944(field671);
                    field671 = null;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3566 == arg0.field1474) {
                field771 = var3.method9258();
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3473 == arg0.field1474) {
                Statics.field1072.field832.method8261(var3, arg0.field1475);
                method6902();
                field587 = field555;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3474 == arg0.field1474) {
                method3178(class324.field3425);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3444 == arg0.field1474) {
                Statics.field4110 = class578.method9186(var3.method9258());
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3549 == arg0.field1474) {
                field747 = var3.method9258();
                if (field747 == 255) {
                    field747 = 0;
                }
                field748 = var3.method9258();
                if (field748 == 255) {
                    field748 = 0;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3489 == arg0.field1474) {
                int var28 = var3.method9478() * 4;
                byte var29 = var3.method9294();
                int var30 = var3.method9439();
                int var31 = var3.method9380();
                int var32 = var31 >> 16;
                int var33 = var31 >> 8 & 0xFF;
                int var34 = (var31 >> 4 & 0x7) + var32;
                int var35 = (var31 & 0x7) + var33;
                int var36 = var3.method9301();
                int var37 = var3.method9291();
                byte var38 = var3.method9259();
                int var39 = var3.method9260();
                int var40 = var3.method9293() * 4;
                int var41 = var3.method9301();
                int var42 = var3.method9258();
                int var43 = var29 + var34;
                int var44 = var35 + var38;
                if (var34 >= 0 && var35 >= 0 && var34 < Statics.field3742.field1345 && var35 < Statics.field3742.field1346 && var43 >= 0 && var44 >= 0 && var43 < Statics.field3742.field1345 && var44 < Statics.field3742.field1346 && var39 != 65535) {
                    int var45 = class351.method6261(var34);
                    int var46 = class351.method6261(var35);
                    int var47 = class351.method6261(var43);
                    int var48 = class351.method6261(var44);
                    class80 var49 = new class80(var39, Statics.field3742.field1344, var45, var46, method1164(Statics.field3742, var45, var46, Statics.field3742.field1344) - var40, field518 + var41, field518 + var36, var37, var42, var30, var28);
                    var49.method2332(var47, var48, method1164(Statics.field3742, var47, var48, Statics.field3742.field1344) - var28, field518 + var41);
                    Statics.field3742.field1361.method7243(var49);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3533 == arg0.field1474) {
                method3069();
                int var50 = var3.method9258();
                int var51 = var3.method9507();
                int var52 = var3.method9258();
                int var53 = var3.method9478();
                field647[var50] = var51;
                field680[var50] = var53;
                field646[var50] = 1;
                field648[var50] = var52;
                for (int var54 = 0; var54 < 98; var54++) {
                    if (var51 >= class372.field4089[var54]) {
                        field646[var50] = var54 + 2;
                    }
                }
                field629[++field510 - 1 & 0x1F] = var50;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3526 == arg0.field1474) {
                field586 = true;
                field749 = false;
                field739 = false;
                Statics.field469 = var3.method9258();
                Statics.field4584 = var3.method9258();
                Statics.field1998 = var3.method9260();
                Statics.field1702 = var3.method9258();
                Statics.field4044 = var3.method9258();
                if (Statics.field4044 >= 100) {
                    int var55 = class351.method6261(Statics.field469);
                    int var56 = class351.method6261(Statics.field4584);
                    int var57 = method1164(Statics.field2071, var55, var56, Statics.field2071.field1344) - Statics.field1998;
                    int var58 = var55 - Statics.field65;
                    int var59 = var57 - Statics.field2297;
                    int var60 = var56 - Statics.field4526;
                    int var61 = (int) Math.sqrt((double) (var58 * var58 + var60 * var60));
                    Statics.field3415 = (int) (Math.atan2((double) var59, (double) var61) * 325.9490051269531D) & 0x7FF;
                    Statics.field4586 = (int) (Math.atan2((double) var58, (double) var60) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field3415 < 128) {
                        Statics.field3415 = 128;
                    }
                    if (Statics.field3415 > 383) {
                        Statics.field3415 = 383;
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3465 == arg0.field1474) {
                int var62 = var3.method9264();
                if (field604 != var62) {
                    field604 = var62;
                    Statics.method3432();
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3528 == arg0.field1474) {
                byte var63 = var3.method9259();
                long var64 = (long) var3.method9260();
                long var66 = (long) var3.method9380();
                long var68 = (var64 << 32) + var66;
                boolean var70 = false;
                class171 var71 = var63 >= 0 ? field741[var63] : Statics.field1750;
                if (var71 == null) {
                    var70 = true;
                } else {
                    for (int var72 = 0; var72 < 100; var72++) {
                        if (field732[var72] == var68) {
                            var70 = true;
                            break;
                        }
                    }
                }
                if (!var70) {
                    field732[field733] = var68;
                    field733 = (field733 + 1) % 100;
                    String var73 = class365.method7422(var3);
                    int var74 = var63 >= 0 ? 43 : 46;
                    class116.method7444(var74, "", var73, var71.field1840);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3445 == arg0.field1474) {
                var3.field5462 += 28;
                if (var3.method9287()) {
                    method2943(var3, var3.field5462 - 28);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3565 == arg0.field1474) {
                int var75 = var3.method9261();
                field684.method2607(var75);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3548 == arg0.field1474) {
                int var76 = var3.method9329();
                int var77 = var3.method9260();
                int var78 = var3.method9478();
                short var79 = (short) var3.method9303();
                class106 var80 = Statics.field3742.field1353[var77];
                if (var80 != null) {
                    var80.method2885(var78, var76, var79);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3451 == arg0.field1474) {
                method3069();
                field652 = var3.method9261();
                field706 = field555;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3531 == arg0.field1474) {
                int var81 = var3.method9301();
                int var82 = var3.method9301();
                int var83 = var3.method9388();
                int var84 = var3.method9260();
                class334.method5803(var83, var82, var84, var81);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3449 == arg0.field1474) {
                if (field723 != -1) {
                    method8352(field723, 0);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3545 == arg0.field1474) {
                field586 = true;
                field749 = false;
                field739 = true;
                int var85 = method3439(var3.method9261() & 0x7EB);
                int var86 = method641(var3.method9261() & 0x7EB);
                int var87 = var3.method9260();
                int var88 = var3.method9258();
                field764 = new class521(Statics.field3415, var86, var87, var88);
                field505 = new class521(Statics.field4586, var85, var87, var88);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3579 == arg0.field1474) {
                method5839(Statics.field3742, var3, 2);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3559 == arg0.field1474) {
                method3178(class324.field3417);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3447 == arg0.field1474) {
                field730 = var3.method9291();
                field729 = var3.method9258();
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3499 == arg0.field1474) {
                for (int var89 = 0; var89 < Statics.field3742.field1357.length; var89++) {
                    if (Statics.field3742.field1357[var89] != null) {
                        Statics.field3742.field1357[var89].field1275 = -1;
                    }
                }
                for (int var90 = 0; var90 < Statics.field3742.field1353.length; var90++) {
                    if (Statics.field3742.field1353[var90] != null) {
                        Statics.field3742.field1353[var90].field1275 = -1;
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3481 == arg0.field1474) {
                int var91 = var3.method9507();
                boolean var92 = var3.method9258() == 1;
                class362 var93 = Statics.field4741.method6314(var91);
                var93.method6733(Statics.field3772.field1136, var92);
                method2944(var93);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3576 == arg0.field1474) {
                byte var94 = var3.method9296();
                int var95 = var3.method9540();
                class350.field3775[var95] = var94;
                if (class350.field3773[var95] != var94) {
                    class350.field3773[var95] = var94;
                }
                method6326(var95);
                field691[++field615 - 1 & 0x1F] = var95;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3485 == arg0.field1474) {
                int var96 = var3.method9307();
                int var97 = var96 >> 16;
                int var98 = var96 >> 8 & 0xFF;
                int var99 = (var96 >> 4 & 0x7) + var97;
                int var100 = (var96 & 0x7) + var98;
                int var101 = var3.method9293() * 4;
                int var102 = var3.method9301();
                byte var103 = var3.method9296();
                int var104 = var3.method9478();
                int var105 = var3.method9260();
                byte var106 = var3.method9259();
                int var107 = var3.method9310();
                int var108 = var3.method9258() * 4;
                int var109 = var3.method9260();
                int var110 = var3.method9388();
                int var111 = var99 + var106;
                int var112 = var100 + var103;
                if (0 <= var99 && var99 < 104 && 0 <= var100 && var100 < 104 && 0 <= var111 && var111 < 104 && 0 <= var112 && var112 < 104 && var109 != 65535) {
                    int var113 = class351.method6261(var99);
                    int var114 = class351.method6261(var100);
                    int var115 = class351.method6261(var111);
                    int var116 = class351.method6261(var112);
                    class80 var117 = new class80(var109, Statics.field3742.field1344, var113, var114, method1164(Statics.field3742, var113, var114, Statics.field3742.field1344) - var108, field518 + var110, field518 + var105, var104, var102, var107, var101);
                    var117.method2332(var115, var116, method1164(Statics.field3742, var115, var116, Statics.field3742.field1344) - var101, field518 + var110);
                    Statics.field3742.field1361.method7243(var117);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3437 == arg0.field1474) {
                int var118 = var3.method9388();
                int var119 = var3.method9540();
                int var120 = var3.method9260();
                if (var120 == 65535) {
                    var120 = -1;
                }
                int var121 = var3.method9540();
                if (var121 == 65535) {
                    var121 = -1;
                }
                int var122 = var3.method9301();
                int var123 = var3.method9301();
                ArrayList var124 = new ArrayList();
                var124.add(var120);
                var124.add(var121);
                method5748(var124, var119, var122, var118, var123);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3510 == arg0.field1474) {
                int var125 = var3.method9260();
                int var126 = var3.method9258();
                int var127 = var3.method9260();
                method10(var125, var126, var127);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3568 == arg0.field1474) {
                int var128 = var3.method9258();
                int var129 = var3.method9260();
                int var130 = var3.method9258();
                Statics.field1904 = var130;
                if (var128 == 0) {
                    Statics.field2071.field1344 = var130;
                    Statics.field3742 = Statics.field2071;
                } else if (var128 == 1) {
                    class481 var131 = Statics.field2071.field1355[var129];
                    var131.field5038.field1344 = var130;
                    Statics.field3742 = var131.field5038;
                } else {
                    throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3486 == arg0.field1474) {
                method3069();
                int var132 = var3.method9258();
                int var133 = var3.method9329();
                int var134 = var3.method9293();
                field647[var134] = var133;
                field680[var134] = var132;
                field646[var134] = 1;
                field648[var134] = var132;
                for (int var135 = 0; var135 < 98; var135++) {
                    if (var133 >= class372.field4089[var135]) {
                        field646[var134] = var135 + 2;
                    }
                }
                field629[++field510 - 1 & 0x1F] = var134;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3468 == arg0.field1474) {
                Statics.field1573 = var3.method9478();
                field735 = var3.method9293();
                Statics.field2481 = var3.method9291();
                while (var3.field5462 < arg0.field1475) {
                    int var136 = var3.method9258();
                    class324 var137 = class324.method3200()[var136];
                    method3178(var137);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3511 == arg0.field1474) {
                method3178(class324.field3426);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3492 == arg0.field1474) {
                int var138 = var3.method9258();
                if (var3.method9258() == 0) {
                    field700[var138] = new class401();
                    var3.field5462 += 18;
                } else {
                    var3.field5462--;
                    field700[var138] = new class401(var3, false);
                }
                field704 = field555;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3506 == arg0.field1474) {
                Statics.field5380 = null;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3520 == arg0.field1474) {
                int var139 = var3.method9301();
                int var140 = var3.method9293();
                int var141 = var3.method9264();
                int var142 = var3.method9540();
                class106 var143 = Statics.field3742.field1353[var142];
                if (var143 != null) {
                    var143.method2624(var140, var139, var141 >> 16, var141 & 0xFFFF);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3558 == arg0.field1474) {
                field749 = false;
                field586 = false;
                field649 = false;
                field739 = false;
                Statics.field469 = 0;
                Statics.field4584 = 0;
                Statics.field1998 = 0;
                field761 = false;
                Statics.field1702 = 0;
                Statics.field4044 = 0;
                Statics.field83 = 0;
                Statics.field462 = 0;
                Statics.field1844 = 0;
                Statics.field1526 = 0;
                Statics.field3308 = 0;
                field762 = null;
                field764 = null;
                field505 = null;
                for (int var144 = 0; var144 < 5; var144++) {
                    field766[var144] = false;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3554 == arg0.field1474) {
                int var145 = var3.method9303();
                int var146 = var3.method9521();
                int var147 = var3.method9303();
                class362 var148 = Statics.field4741.method6314(var146);
                if (var148.field3933 != var147 || var148.field3882 != var145 || var148.field3884 != 0 || var148.field3885 != 0) {
                    var148.field3933 = var147;
                    var148.field3882 = var145;
                    var148.field3884 = 0;
                    var148.field3885 = 0;
                    method2944(var148);
                    this.method1264(var148);
                    if (var148.field3881 == 0) {
                        method861(Statics.field4741.field3785[var146 >> 16], var148, false);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3570 == arg0.field1474) {
                Statics.field3217 = var3.method9267();
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3463 == arg0.field1474) {
                int var149 = var3.method9264();
                int var150 = var3.method9260();
                if (var149 < -70000) {
                    var150 += 32768;
                }
                class362 var151;
                if (var149 >= 0) {
                    var151 = Statics.field4741.method6314(var149);
                } else {
                    var151 = null;
                }
                if (var151 != null) {
                    for (int var152 = 0; var152 < var151.field4016.length; var152++) {
                        var151.field4016[var152] = 0;
                        var151.field3993[var152] = 0;
                    }
                }
                class88.method3338(var150);
                int var153 = var3.method9260();
                for (int var154 = 0; var154 < var153; var154++) {
                    int var155 = var3.method9540();
                    int var156 = var3.method9478();
                    if (var156 == 255) {
                        var156 = var3.method9507();
                    }
                    if (var151 != null && var154 < var151.field4016.length) {
                        var151.field4016[var154] = var155;
                        var151.field3993[var154] = var156;
                    }
                    class88.method1198(var150, var154, var155 - 1, var156);
                }
                if (var151 != null) {
                    method2944(var151);
                }
                method3069();
                field800[++field779 - 1 & 0x1F] = var150 & 0x7FFF;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3537 == arg0.field1474) {
                method3178(class324.field3416);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3500 == arg0.field1474) {
                field583.method2948(var3, arg0.field1475);
                method4948();
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3503 == arg0.field1474) {
                int var157 = var3.method9264();
                int var158 = var3.method9301();
                class362 var159 = Statics.field4741.method6314(var157);
                if (var159 != null && var159.field3881 == 0) {
                    if (var158 > var159.field3903 - var159.field3895) {
                        var158 = var159.field3903 - var159.field3895;
                    }
                    if (var158 < 0) {
                        var158 = 0;
                    }
                    if (var159.field3901 != var158) {
                        var159.field3901 = var158;
                        method2944(var159);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3508 == arg0.field1474) {
                int var160 = var3.method9507();
                int var161 = var3.method9507();
                class90 var162 = (class90) field667.method8993((long) var160);
                class90 var163 = (class90) field667.method8993((long) var161);
                if (var163 != null) {
                    method7489(var163, var162 == null || var162.field1090 != var163.field1090);
                }
                if (var162 != null) {
                    var162.method8667();
                    field667.method8990(var162, (long) var161);
                }
                class362 var164 = Statics.field4741.method6314(var160);
                if (var164 != null) {
                    method2944(var164);
                }
                class362 var165 = Statics.field4741.method6314(var161);
                if (var165 != null) {
                    method2944(var165);
                    method861(Statics.field4741.field3785[var165.field3878 >>> 16], var165, true);
                }
                if (field723 != -1) {
                    method8352(field723, 1);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3454 == arg0.field1474) {
                method3178(class324.field3424);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3514 == arg0.field1474) {
                int var166 = var3.method9540();
                if (var166 == 65535) {
                    var166 = -1;
                }
                int var167 = var3.method9329();
                int var168 = var3.method9388();
                if (var168 == 65535) {
                    var168 = -1;
                }
                int var169 = var3.method9507();
                for (int var170 = var168; var170 <= var166; var170++) {
                    long var171 = ((long) var169 << 32) + (long) var170;
                    class515 var173 = field713.method8993(var171);
                    if (var173 != null) {
                        var173.method8667();
                    }
                    field713.method8990(new class514(var167), var171);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3476 == arg0.field1474) {
                method3178(class324.field3423);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3470 == arg0.field1474) {
                int var174 = var3.method9258();
                int var175 = var3.method9260();
                int var176 = class556.field5458 >= 223 ? var3.method9261() : -1;
                if (var174 == 0) {
                    Statics.field194 = Statics.field2071.field1357[var175];
                    field521 = -1;
                } else if (var174 == 1) {
                    field521 = -1;
                    Statics.field194 = Statics.field2071.field1353[var175];
                } else if (var174 == 2) {
                    field521 = var176;
                    Statics.field194 = Statics.field2071.field1355[var175];
                    this.method617(true);
                }
                if (Statics.field194 == null) {
                    field521 = -1;
                    Statics.field194 = Statics.field3772;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3567 == arg0.field1474) {
                method9011(Statics.field2071, var3);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3472 == arg0.field1474) {
                class70 var177 = new class70();
                var177.field816 = var3.method9269();
                var177.field813 = var3.method9260();
                int var178 = var3.method9264();
                var177.field812 = var178;
                if (var177.method1877()) {
                    var177.field822 = "beta";
                    Statics.field720 = true;
                } else {
                    Statics.field720 = false;
                }
                Statics.method3201(45);
                var2.method8512();
                Object var179 = null;
                Statics.method6905(var177);
                arg0.field1474 = null;
                return false;
            }
            if (class326.field3518 == arg0.field1474) {
                int var180 = var3.method9478();
                int var181 = var3.method9260();
                int var182 = var3.method9260();
                if (var181 == 65535) {
                    var181 = -1;
                }
                class106 var183 = Statics.field3742.field1353[var182];
                if (var183 != null) {
                    if (var183.field1275 == var181 && var181 != -1) {
                        int var184 = class213.method6692(var181).field2323;
                        if (var184 == 1) {
                            var183.field1263 = 0;
                            var183.field1290 = 0;
                            var183.field1235 = var180;
                            var183.field1238 = 0;
                        } else if (var184 == 2) {
                            var183.field1238 = 0;
                        }
                    } else if (var181 == -1 || var183.field1275 == -1 || class213.method6692(var181).field2321 >= class213.method6692(var183.field1275).field2321) {
                        var183.field1275 = var181;
                        var183.field1263 = 0;
                        var183.field1290 = 0;
                        var183.field1235 = var180;
                        var183.field1238 = 0;
                        var183.field1292 = var183.field1256;
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3469 == arg0.field1474) {
                method3069();
                field672 = var3.method9260();
                field706 = field555;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3448 == arg0.field1474) {
                Statics.field1573 = var3.method9293();
                field735 = var3.method9258();
                Statics.field2481 = var3.method9478();
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3575 == arg0.field1474) {
                Statics.field1897 = var3.method9258();
                Statics.field3095 = var3.method9258();
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3446 == arg0.field1474) {
                String var185 = var3.method9269();
                long var186 = var3.method9265();
                long var188 = (long) var3.method9260();
                long var190 = (long) var3.method9380();
                class386 var192 = (class386) class406.method3580(class386.method5893(), var3.method9258());
                long var193 = (var188 << 32) + var190;
                boolean var195 = false;
                for (int var196 = 0; var196 < 100; var196++) {
                    if (field732[var196] == var193) {
                        var195 = true;
                        break;
                    }
                }
                if (var192.field4525 && Statics.field1072.method1929(new class581(var185, Statics.field3276))) {
                    var195 = true;
                }
                if (!var195 && field628 == 0) {
                    field732[field733] = var193;
                    field733 = (field733 + 1) % 100;
                    String var197 = class440.method7930(class420.method4271(class365.method7422(var3)));
                    if (var192.field4523 == -1) {
                        class116.method7444(9, var185, var197, class422.method2357(var186));
                    } else {
                        class116.method7444(9, class107.method2432(var192.field4523) + var185, var197, class422.method2357(var186));
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3521 == arg0.field1474) {
                int var198 = var3.method9540();
                if (var198 == 65535) {
                    var198 = -1;
                }
                method6315(var198);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3493 == arg0.field1474) {
                int var199 = var3.method9540();
                if (var199 == 65535) {
                    var199 = -1;
                }
                int var200 = var3.method9309();
                method3680(var199, var200);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3527 == arg0.field1474) {
                method3443();
                byte var201 = var3.method9259();
                if (arg0.field1475 == 1) {
                    if (var201 >= 0) {
                        field776[var201] = null;
                    } else {
                        Statics.field804 = null;
                    }
                    arg0.field1474 = null;
                    return true;
                }
                if (var201 >= 0) {
                    field776[var201] = new class162(var3);
                } else {
                    Statics.field804 = new class162(var3);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3467 == arg0.field1474) {
                field703 = field555;
                byte var202 = var3.method9259();
                if (arg0.field1475 == 1) {
                    if (var202 >= 0) {
                        field741[var202] = null;
                    } else {
                        Statics.field1750 = null;
                    }
                    arg0.field1474 = null;
                    return true;
                }
                if (var202 >= 0) {
                    field741[var202] = new class171(var3);
                } else {
                    Statics.field1750 = new class171(var3);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3504 == arg0.field1474) {
                int var203 = var3.method9507();
                int var204 = var3.method9264();
                class362 var205 = Statics.field4741.method6314(var203);
                var205.field3937.method6345(var204);
                method2944(var205);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3457 == arg0.field1474) {
                int var206 = var3.method9258();
                method2479(var206);
                arg0.field1474 = null;
                return false;
            }
            if (class326.field3551 == arg0.field1474) {
                int var207 = var3.method9329();
                int var208 = var3.method9540();
                if (var208 == 65535) {
                    var208 = -1;
                }
                int var209 = var3.method9507();
                class362 var210 = Statics.field4741.method6314(var207);
                if (var210.field3929) {
                    var210.field4018 = var208;
                    var210.field4027 = var209;
                    class211 var212 = class211.method7530(var208).method4011(var209);
                    var210.field3931 = var212.field2262;
                    var210.field3932 = var212.field2246;
                    var210.field3977 = var212.field2287;
                    var210.field3889 = var212.field2256;
                    var210.field3927 = var212.field2245;
                    var210.field3967 = var212.field2244;
                    if (var212.field2250 == 1) {
                        var210.field3940 = 1;
                    } else {
                        var210.field3940 = 2;
                    }
                    if (var210.field3924 > 0) {
                        var210.field3967 = var210.field3967 * 32 / var210.field3924;
                    } else if (var210.field3938 > 0) {
                        var210.field3967 = var210.field3967 * 32 / var210.field3938;
                    }
                    method2944(var210);
                } else if (var208 == -1) {
                    var210.field4034 = 0;
                    arg0.field1474 = null;
                    return true;
                } else {
                    class211 var211 = class211.method7530(var208).method4011(var209);
                    var210.field4034 = 4;
                    var210.field4017 = var208;
                    var210.field3931 = var211.field2262;
                    var210.field3932 = var211.field2246;
                    var210.field3967 = var211.field2244 * 100 / var209;
                    method2944(var210);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3505 == arg0.field1474) {
                String var213 = var3.method9269();
                long var214 = (long) var3.method9260();
                long var216 = (long) var3.method9380();
                class386 var218 = (class386) class406.method3580(class386.method5893(), var3.method9258());
                long var219 = (var214 << 32) + var216;
                boolean var221 = false;
                for (int var222 = 0; var222 < 100; var222++) {
                    if (field732[var222] == var219) {
                        var221 = true;
                        break;
                    }
                }
                if (Statics.field1072.method1929(new class581(var213, Statics.field3276))) {
                    var221 = true;
                }
                if (!var221 && field628 == 0) {
                    field732[field733] = var219;
                    field733 = (field733 + 1) % 100;
                    String var223 = class440.method7930(class420.method4271(class365.method7422(var3)));
                    byte var224;
                    if (var218.field4524) {
                        var224 = 7;
                    } else {
                        var224 = 3;
                    }
                    if (var218.field4523 == -1) {
                        Statics.method7725(var224, var213, var223);
                    } else {
                        Statics.method7725(var224, class107.method2432(var218.field4523) + var213, var223);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3498 == arg0.field1474) {
                int var225 = var3.method9258();
                int var226 = var3.method9258();
                int var227 = var3.method9258();
                int var228 = var3.method9258();
                field766[var225] = true;
                field767[var225] = var226;
                field768[var225] = var227;
                field769[var225] = var228;
                field683[var225] = 0;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3542 == arg0.field1474) {
                if (Statics.field5380 == null) {
                    Statics.field5380 = new class497(Statics.field407);
                }
                class567 var229 = Statics.field407.method8576(var3);
                Statics.field5380.field5124.method9008(var229.field5529, var229.field5530);
                field697[++field698 - 1 & 0x1F] = var229.field5529;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3466 == arg0.field1474) {
                int var230 = var3.method9507();
                int var231 = var3.method9301();
                int var232 = var3.method9291();
                class90 var233 = (class90) field667.method8993((long) var230);
                if (var233 != null) {
                    method7489(var233, var233.field1090 != var231);
                }
                method2472(var230, var231, var232);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3534 == arg0.field1474) {
                String var234 = var3.method9269();
                Object[] var235 = new Object[var234.length() + 1];
                for (int var236 = var234.length() - 1; var236 >= 0; var236--) {
                    if (var234.charAt(var236) == 's') {
                        var235[var236 + 1] = var3.method9269();
                    } else {
                        var235[var236 + 1] = Integer.valueOf(var3.method9264());
                    }
                }
                var235[0] = Integer.valueOf(var3.method9264());
                class91 var237 = new class91();
                var237.field1103 = var235;
                class73.method8429(var237);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3519 == arg0.field1474) {
                method264(var3.method9269());
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3502 == arg0.field1474) {
                method7481(Statics.field3742, true, var3, 4);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3580 == arg0.field1474) {
                method7481(Statics.field3742, true, var3, 5);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3452 == arg0.field1474) {
                int var238 = var3.method9260();
                int var239 = var3.method9293();
                int var240 = var3.method9260();
                int var241 = var3.method9307();
                int var242 = var241 >> 16;
                int var243 = var241 >> 8 & 0xFF;
                int var244 = (var241 >> 4 & 0x7) + var242;
                int var245 = (var241 & 0x7) + var243;
                if (var244 >= 0 && var245 >= 0 && var244 < Statics.field3742.field1345 && var245 < Statics.field3742.field1346) {
                    int var246 = class351.method6261(var244);
                    int var247 = class351.method6261(var245);
                    class75 var248 = new class75(var238, Statics.field3742.field1344, var246, var247, method1164(Statics.field3742, var246, var247, Statics.field3742.field1344) - var239, var240, field518);
                    Statics.field3742.field1362.method7243(var248);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3456 == arg0.field1474) {
                boolean var249 = var3.method9258() == 1;
                if (var249) {
                    Statics.field869 = class330.method2257() - var3.method9265();
                    Statics.field3759 = new class394(var3, true);
                } else {
                    Statics.field3759 = null;
                }
                field705 = field555;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3507 == arg0.field1474) {
                int var250 = var3.method9304();
                int var251 = var3.method9329();
                class362 var252 = Statics.field4741.method6314(var251);
                if (var252.field3973 != var250 || var250 == -1) {
                    var252.field3973 = var250;
                    var252.field4020 = 0;
                    var252.field4021 = 0;
                    method2944(var252);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3488 == arg0.field1474) {
                field586 = true;
                field749 = false;
                field739 = true;
                Statics.field469 = var3.method9258();
                Statics.field4584 = var3.method9258();
                Statics.field1998 = var3.method9260();
                int var253 = var3.method9260();
                int var254 = var3.method9258();
                int var255 = class351.method6261(Statics.field469);
                int var256 = class351.method6261(Statics.field4584);
                int var257 = method1164(Statics.field2071, var255, var256, Statics.field2071.field1344) - Statics.field1998;
                int var258 = var255 - Statics.field65;
                int var259 = var257 - Statics.field2297;
                int var260 = var256 - Statics.field4526;
                double var261 = Math.sqrt((double) (var258 * var258 + var260 * var260));
                int var263 = method641((int) (Math.atan2((double) var259, var261) * 325.9490051269531D) & 0x7FF);
                int var264 = method3439((int) (Math.atan2((double) var258, (double) var260) * -325.9490051269531D) & 0x7FF);
                field764 = new class521(Statics.field3415, var263, var253, var254);
                field505 = new class521(Statics.field4586, var264, var253, var254);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3487 == arg0.field1474) {
                int var265 = var3.method9260();
                int var266 = var3.method9264();
                class350.field3775[var265] = var266;
                if (class350.field3773[var265] != var266) {
                    class350.field3773[var265] = var266;
                }
                method6326(var265);
                field691[++field615 - 1 & 0x1F] = var265;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3555 == arg0.field1474) {
                int var267 = var3.method9264();
                int var268 = var3.method9264();
                int var269 = class35.method6925();
                class325 var270 = class325.method2983(class323.field3379, field784.field1485);
                var270.field3433.method9312(var267);
                var270.field3433.method9313(var268);
                var270.field3433.method9241(var269);
                var270.field3433.method9288(field165);
                field784.method3070(var270);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3517 == arg0.field1474) {
                method3178(class324.field3422);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3443 == arg0.field1474) {
                int var271 = var3.method9540();
                int var272 = var3.method9260();
                int var273 = var3.method9301();
                int var274 = var3.method9388();
                int var275 = var3.method9260();
                if (var273 == 65535) {
                    var273 = -1;
                }
                ArrayList var276 = new ArrayList();
                var276.add(var273);
                method5748(var276, var271, var275, var272, var274);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3471 == arg0.field1474) {
                int var277 = var3.method9478();
                int var278 = var3.method9329();
                class362 var279 = Statics.field4741.method6314(var278);
                var279.field3937.method6342(Statics.field3772.field1136.field3821, var277);
                method2944(var279);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3453 == arg0.field1474) {
                for (int var280 = 0; var280 < Statics.field2934; var280++) {
                    class182 var281 = class182.method696(var280);
                    if (var281 != null) {
                        class350.field3775[var280] = 0;
                        class350.field3773[var280] = 0;
                    }
                }
                method3069();
                field615 += 32;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3560 == arg0.field1474) {
                method3178(class324.field3428);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3450 == arg0.field1474) {
                method3178(class324.field3419);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3442 == arg0.field1474) {
                field525 = var3.method9388() * 30;
                field706 = field555;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3552 == arg0.field1474) {
                method3178(class324.field3420);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3438 == arg0.field1474) {
                int var282 = var3.method9478();
                int var283 = var3.method9388();
                if (var283 == 65535) {
                    var283 = -1;
                }
                method7210(Statics.field3772, var283, var282);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3484 == arg0.field1474) {
                int var284 = var3.method9274();
                boolean var285 = var3.method9258() == 1;
                String var286 = "";
                boolean var287 = false;
                if (var285) {
                    var286 = var3.method9269();
                    if (Statics.field1072.method1929(new class581(var286, Statics.field3276))) {
                        var287 = true;
                    }
                }
                String var288 = var3.method9269();
                if (!var287) {
                    Statics.method7725(var284, var286, var288);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3544 == arg0.field1474) {
                int var289 = var3.method9264();
                int var290 = var3.method9260();
                if (var289 < -70000) {
                    var290 += 32768;
                }
                class362 var291;
                if (var289 >= 0) {
                    var291 = Statics.field4741.method6314(var289);
                } else {
                    var291 = null;
                }
                while (var3.field5462 < arg0.field1475) {
                    int var292 = var3.method9274();
                    int var293 = var3.method9260();
                    int var294 = 0;
                    if (var293 != 0) {
                        var294 = var3.method9258();
                        if (var294 == 255) {
                            var294 = var3.method9264();
                        }
                    }
                    if (var291 != null && var292 >= 0 && var292 < var291.field4016.length) {
                        var291.field4016[var292] = var293;
                        var291.field3993[var292] = var294;
                    }
                    class88.method1198(var290, var292, var293 - 1, var294);
                }
                if (var291 != null) {
                    method2944(var291);
                }
                method3069();
                field800[++field779 - 1 & 0x1F] = var290 & 0x7FFF;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3515 == arg0.field1474) {
                class37.method5395(var3, arg0.field1475);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3536 == arg0.field1474) {
                byte[] var295 = new byte[arg0.field1475];
                var3.method9205(var295, 0, var295.length);
                class558 var296 = new class558(var295);
                String var297 = var296.method9269();
                class32.method7129(var297, true, false);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3563 == arg0.field1474) {
                int var298 = var3.method9258();
                int var299 = var3.method9260();
                this.method617(false);
                if (var298 == 0) {
                    Statics.field194 = Statics.field2071.field1357[var299];
                } else if (var298 == 1) {
                    Statics.field194 = Statics.field2071.field1353[var299];
                } else if (var298 == 2) {
                    Statics.field194 = Statics.field2071.field1355[var299];
                    this.method617(true);
                }
                if (Statics.field194 == null) {
                    Statics.field194 = Statics.field3772;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3495 == arg0.field1474) {
                int var300 = var3.method9507();
                int var301 = var3.method9388();
                int var302 = var301 >> 10 & 0x1F;
                int var303 = var301 >> 5 & 0x1F;
                int var304 = var301 & 0x1F;
                int var305 = (var304 << 3) + (var302 << 19) + (var303 << 11);
                class362 var306 = Statics.field4741.method6314(var300);
                if (var306.field3904 != var305) {
                    var306.field3904 = var305;
                    method2944(var306);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3572 == arg0.field1474) {
                for (int var307 = 0; var307 < class350.field3773.length; var307++) {
                    if (class350.field3775[var307] != class350.field3773[var307]) {
                        class350.field3773[var307] = class350.field3775[var307];
                        method6326(var307);
                        field691[++field615 - 1 & 0x1F] = var307;
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3440 == arg0.field1474) {
                int var308 = var3.method9478();
                int var309 = var3.method9507();
                int var310 = var3.method9258();
                class362 var311 = Statics.field4741.method6314(var309);
                var311.field3937.method6329(var310, var308);
                method2944(var311);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3483 == arg0.field1474) {
                method3178(class324.field3418);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3571 == arg0.field1474) {
                method5839(Statics.field3742, var3, 1);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3532 == arg0.field1474) {
                field526 = var3.method9258();
                if (field526 == 1) {
                    field677 = var3.method9260();
                }
                if (field526 >= 2 && field526 <= 6) {
                    if (field526 == 2) {
                        field532 = 64;
                        field533 = 64;
                    }
                    if (field526 == 3) {
                        field532 = 0;
                        field533 = 64;
                    }
                    if (field526 == 4) {
                        field532 = 128;
                        field533 = 64;
                    }
                    if (field526 == 5) {
                        field532 = 64;
                        field533 = 0;
                    }
                    if (field526 == 6) {
                        field532 = 64;
                        field533 = 128;
                    }
                    field526 = 2;
                    field529 = var3.method9260();
                    field725 = var3.method9260();
                    field622 = var3.method9258();
                }
                if (field526 == 10) {
                    field528 = var3.method9260();
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3439 == arg0.field1474) {
                method3178(class324.field3427);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3516 == arg0.field1474) {
                int var312 = var3.method9521();
                class362 var313 = Statics.field4741.method6314(var312);
                var313.field4034 = 3;
                var313.field4017 = Statics.field3772.field1136.method6358();
                method2944(var313);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3569 == arg0.field1474) {
                Statics.field3742.field1360 = 0;
                Statics.field3742.field1356 = 0;
                for (int var314 = 0; var314 < 65536; var314++) {
                    Statics.field3742.field1353[var314] = null;
                }
                for (int var315 = 0; var315 < 2048; var315++) {
                    Statics.field3742.field1355[var315] = null;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3561 == arg0.field1474) {
                int var316 = var3.method9260();
                int var317 = var3.method9540();
                int var318 = var3.method9540();
                int var319 = var3.method9507();
                class362 var320 = Statics.field4741.method6314(var319);
                if (var320.field3931 != var317 || var320.field3932 != var318 || var320.field3967 != var316) {
                    var320.field3931 = var317;
                    var320.field3932 = var318;
                    var320.field3967 = var316;
                    method2944(var320);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3539 == arg0.field1474) {
                field519++;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3475 == arg0.field1474) {
                boolean var321 = var3.method9267();
                if (!var321) {
                    Statics.field923 = null;
                } else if (Statics.field923 == null) {
                    Statics.field923 = new class403();
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3479 == arg0.field1474) {
                int var322 = var3.method9329();
                int var323 = var3.method9260();
                class362 var324 = Statics.field4741.method6314(var322);
                if (var324.field4034 != 6 || var324.field4017 != var323) {
                    var324.field4034 = 6;
                    var324.field4017 = var323;
                    method2944(var324);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3455 == arg0.field1474) {
                String var325 = var3.method9269();
                String var326 = class440.method7930(class420.method4271(class365.method7422(var3)));
                Statics.method7725(6, var325, var326);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3497 == arg0.field1474) {
                int var327 = var3.method9258();
                method3857(var327);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3458 == arg0.field1474) {
                int var328 = var3.method9260();
                int var329 = var3.method9291() * 4;
                int var330 = var3.method9258() * 4;
                int var331 = var3.method9439();
                int var332 = var3.method9478();
                int var333 = var3.method9309();
                int var334 = var333 >> 16;
                int var335 = var333 >> 8 & 0xFF;
                int var336 = (var333 >> 4 & 0x7) + var334;
                int var337 = (var333 & 0x7) + var335;
                int var338 = var3.method9260();
                int var339 = var3.method9388();
                int var340 = var3.method9388();
                byte var341 = var3.method9378();
                int var342 = var3.method9311();
                byte var343 = var3.method9294();
                int var344 = var336 + var341;
                int var345 = var337 + var343;
                if (0 <= var336 && var336 < 104 && 0 <= var337 && var337 < 104 && 0 <= var344 && var344 < 104 && 0 <= var345 && var345 < 104 && var328 != 65535) {
                    int var346 = class351.method6261(var336);
                    int var347 = class351.method6261(var337);
                    int var348 = class351.method6261(var344);
                    int var349 = class351.method6261(var345);
                    class80 var350 = new class80(var328, Statics.field3742.field1344, var346, var347, method1164(Statics.field3742, var346, var347, Statics.field3742.field1344) - var330, field518 + var338, field518 + var339, var332, var340, var331, var342, var329);
                    var350.method2332(var348, var349, method1164(Statics.field3742, var348, var349, Statics.field3742.field1344) - var329, field518 + var338);
                    Statics.field3742.field1361.method7243(var350);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3460 == arg0.field1474) {
                field735 = var3.method9291();
                Statics.field1573 = var3.method9478();
                Statics.field2481 = var3.method9478();
                for (int var351 = Statics.field2481; var351 < Statics.field2481 + 8; var351++) {
                    for (int var352 = Statics.field1573; var352 < Statics.field1573 + 8; var352++) {
                        if (Statics.field3742.field1359[field735][var351][var352] != null) {
                            Statics.field3742.field1359[field735][var351][var352] = null;
                            method7139(field735, var351, var352);
                        }
                    }
                }
                for (class99 var353 = (class99) Statics.field3742.field1341.method7247(); var353 != null; var353 = (class99) Statics.field3742.field1341.method7249()) {
                    if (var353.field1199 >= Statics.field2481 && var353.field1199 < Statics.field2481 + 8 && var353.field1202 >= Statics.field1573 && var353.field1202 < Statics.field1573 + 8 && field735 == var353.field1206) {
                        var353.field1212 = 0;
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3461 == arg0.field1474) {
                String var354 = var3.method9269();
                int var355 = var3.method9293();
                int var356 = var3.method9293();
                if (var356 >= 1 && var356 <= 8) {
                    if (var354.equalsIgnoreCase(class383.field4405)) {
                        var354 = null;
                    }
                    field641[var356 - 1] = var354;
                    field642[var356 - 1] = var355 == 0;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3477 == arg0.field1474) {
                field586 = true;
                field749 = false;
                field649 = true;
                Statics.field1844 = var3.method9258();
                Statics.field1526 = var3.method9258();
                int var357 = var3.method9260();
                int var358 = var3.method9260();
                field761 = var3.method9267();
                int var359 = var3.method9258();
                int var360 = class351.method6261(Statics.field1844);
                int var361 = class351.method6261(Statics.field1526);
                boolean var362 = false;
                boolean var363 = false;
                int var364;
                int var365;
                if (field761) {
                    var364 = Statics.field2297;
                    var365 = method1164(Statics.field2071, var360, var361, Statics.field2071.field1344) - var357;
                } else {
                    var364 = method1164(Statics.field2071, Statics.field65, Statics.field4526, Statics.field2071.field1344) - Statics.field2297;
                    var365 = var357;
                }
                field762 = new class520(Statics.field65, Statics.field4526, var364, var360, var361, var365, var358, var359);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3494 == arg0.field1474) {
                int var366 = var3.method9264();
                boolean var367 = var3.method9258() == 1;
                class362 var368 = Statics.field4741.method6314(var366);
                if (var368.field3899 != var367) {
                    var368.field3899 = var367;
                    method2944(var368);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3550 == arg0.field1474) {
                method6988();
                arg0.field1474 = null;
                return false;
            }
            if (class326.field3530 == arg0.field1474) {
                String var369 = var3.method9269();
                int var370 = var3.method9507();
                class362 var371 = Statics.field4741.method6314(var370);
                if (!var369.equals(var371.field4013)) {
                    var371.field4013 = var369;
                    method2944(var371);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3541 == arg0.field1474) {
                field586 = true;
                field749 = false;
                field649 = false;
                Statics.field1844 = var3.method9258();
                Statics.field1526 = var3.method9258();
                Statics.field3308 = var3.method9260();
                Statics.field462 = var3.method9258();
                Statics.field83 = var3.method9258();
                if (Statics.field83 >= 100) {
                    Statics.field65 = class351.method6261(Statics.field1844);
                    Statics.field4526 = class351.method6261(Statics.field1526);
                    Statics.field2297 = method1164(Statics.field2071, Statics.field65, Statics.field4526, Statics.field2071.field1344) - Statics.field3308;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3478 == arg0.field1474) {
                Statics.field5380 = new class497(Statics.field407);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3574 == arg0.field1474) {
                int var372 = var3.method9261();
                class493 var373 = (class493) class406.method3580(class493.method6989(), var3.method9258());
                class492 var374 = (class492) class406.method3580(Statics.method7183(), var3.method9258());
                if (var372 == -2) {
                    field684.method2578(var373, var374);
                } else {
                    field684.method2579(var372, var373, var374);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3578 == arg0.field1474) {
                return this.method1419(arg0, 1);
            }
            if (class326.field3538 == arg0.field1474) {
                method3443();
                byte var375 = var3.method9259();
                class154 var376 = new class154(var3);
                class162 var377;
                if (var375 >= 0) {
                    var377 = field776[var375];
                } else {
                    var377 = Statics.field804;
                }
                if (var377 == null) {
                    this.method1797(var375);
                    arg0.field1474 = null;
                    return true;
                }
                if (var376.field1716 > var377.field1768) {
                    this.method1797(var375);
                    arg0.field1474 = null;
                    return true;
                }
                if (var376.field1716 < var377.field1768) {
                    arg0.field1474 = null;
                    return true;
                }
                var376.method3425(var377);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3480 == arg0.field1474) {
                int var378 = var3.method9264();
                int var379 = var3.method9540();
                int var380 = var3.method9301();
                class362 var381 = Statics.field4741.method6314(var378);
                var381.field3906 = (var380 << 16) + var379;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3577 == arg0.field1474) {
                method5839(Statics.field3742, var3, 3);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3562 == arg0.field1474) {
                field586 = true;
                field749 = false;
                field739 = true;
                int var382 = var3.method9261();
                int var383 = var3.method9261();
                int var384 = method641(Statics.field3415 + var383 & 0x7EB);
                int var385 = Statics.field4586 + var382;
                int var386 = var3.method9260();
                int var387 = var3.method9258();
                field764 = new class521(Statics.field3415, var384, var386, var387);
                field505 = new class521(Statics.field4586, var385, var386, var387);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3482 == arg0.field1474) {
                int var388 = var3.method9388();
                int var389 = var3.method9260();
                class334.method3533(var388, var389);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3573 == arg0.field1474) {
                field634 = var3.method9269();
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3441 == arg0.field1474) {
                field586 = true;
                field749 = false;
                field649 = true;
                Statics.field1844 = var3.method9258();
                Statics.field1526 = var3.method9258();
                int var390 = var3.method9260();
                int var391 = class351.method6261(var3.method9258());
                int var392 = class351.method6261(var3.method9258());
                int var393 = var3.method9260();
                field761 = var3.method9267();
                int var394 = var3.method9258();
                int var395 = class351.method6261(Statics.field1844);
                int var396 = class351.method6261(Statics.field1526);
                boolean var397 = false;
                boolean var398 = false;
                int var399;
                int var400;
                if (field761) {
                    var399 = Statics.field2297;
                    var400 = method1164(Statics.field2071, var395, var396, Statics.field2071.field1344) - var390;
                } else {
                    var399 = method1164(Statics.field2071, Statics.field65, Statics.field4526, Statics.field2071.field1344) - Statics.field2297;
                    var400 = var390;
                }
                field762 = new class519(Statics.field65, Statics.field4526, var399, var395, var396, var400, var391, var392, var393, var394);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3459 == arg0.field1474) {
                Statics.field1856 = var3.method9267();
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3513 == arg0.field1474 && field586) {
                field749 = true;
                field739 = false;
                field649 = false;
                for (int var401 = 0; var401 < 5; var401++) {
                    field766[var401] = false;
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3583 == arg0.field1474) {
                int var402 = var3.method9329();
                int var403 = var3.method9260();
                class362 var404 = Statics.field4741.method6314(var402);
                if (var404.field4034 != 2 || var404.field4017 != var403) {
                    var404.field4034 = 2;
                    var404.field4017 = var403;
                    method2944(var404);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3546 == arg0.field1474) {
                method5221(false, arg0.field1473);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3501 == arg0.field1474) {
                Statics.field1072.method1925(var3, arg0.field1475);
                field587 = field555;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3522 == arg0.field1474) {
                Statics.field1072.method1924();
                field587 = field555;
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3535 == arg0.field1474) {
                byte var405 = var3.method9259();
                String var406 = var3.method9269();
                long var407 = (long) var3.method9260();
                long var409 = (long) var3.method9380();
                class386 var411 = (class386) class406.method3580(class386.method5893(), var3.method9258());
                long var412 = (var407 << 32) + var409;
                boolean var414 = false;
                Object var415 = null;
                class171 var416 = var405 >= 0 ? field741[var405] : Statics.field1750;
                if (var416 == null) {
                    var414 = true;
                } else {
                    int var417 = 0;
                    while (true) {
                        if (var417 >= 100) {
                            if (var411.field4525 && Statics.field1072.method1929(new class581(var406, Statics.field3276))) {
                                var414 = true;
                            }
                            break;
                        }
                        if (field732[var417] == var412) {
                            var414 = true;
                            break;
                        }
                        var417++;
                    }
                }
                if (!var414) {
                    field732[field733] = var412;
                    field733 = (field733 + 1) % 100;
                    String var418 = class440.method7930(class365.method7422(var3));
                    int var419 = var405 >= 0 ? 41 : 44;
                    if (var411.field4523 == -1) {
                        class116.method7444(var419, var406, var418, var416.field1840);
                    } else {
                        class116.method7444(var419, class107.method2432(var411.field4523) + var406, var418, var416.field1840);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3496 == arg0.field1474) {
                int var420 = var3.method9388();
                int var421 = var3.method9521();
                class362 var422 = Statics.field4741.method6314(var421);
                if (var422.field4034 != 1 || var422.field4017 != var420) {
                    var422.field4034 = 1;
                    var422.field4017 = var420;
                    method2944(var422);
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3491 == arg0.field1474) {
                return this.method1384(arg0);
            }
            if (class326.field3556 == arg0.field1474) {
                int var423 = arg0.field1475 + var3.field5462;
                int var424 = var3.method9260();
                if (var424 == 65535) {
                    var424 = -1;
                }
                int var425 = var3.method9260();
                if (field723 != var424) {
                    field723 = var424;
                    this.method1267(false);
                    method3702(field723);
                    class73.method1232(field723);
                    for (int var426 = 0; var426 < 100; var426++) {
                        field716[var426] = true;
                    }
                }
                while (var425-- > 0) {
                    int var427 = var3.method9264();
                    int var428 = var3.method9260();
                    int var429 = var3.method9258();
                    class90 var430 = (class90) field667.method8993((long) var427);
                    if (var430 != null && var430.field1090 != var428) {
                        method7489(var430, true);
                        var430 = null;
                    }
                    if (var430 == null) {
                        var430 = method2472(var427, var428, var429);
                    }
                    var430.field1096 = true;
                }
                for (class90 var431 = (class90) field667.method8996(); var431 != null; var431 = (class90) field667.method8999()) {
                    if (var431.field1096) {
                        var431.field1096 = false;
                    } else {
                        method7489(var431, true);
                    }
                }
                field713 = new class531(512);
                while (var3.field5462 < var423) {
                    int var432 = var3.method9264();
                    int var433 = var3.method9260();
                    int var434 = var3.method9260();
                    int var435 = var3.method9264();
                    for (int var436 = var433; var436 <= var434; var436++) {
                        long var437 = ((long) var432 << 32) + (long) var436;
                        field713.method8990(new class514(var435), var437);
                    }
                }
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3525 == arg0.field1474) {
                field703 = field555;
                byte var439 = var3.method9259();
                class168 var440 = new class168(var3);
                class171 var441;
                if (var439 >= 0) {
                    var441 = field741[var439];
                } else {
                    var441 = Statics.field1750;
                }
                if (var441 == null) {
                    this.method1765(var439);
                    arg0.field1474 = null;
                    return true;
                }
                if (var440.field1819 > var441.field1837) {
                    this.method1765(var439);
                    arg0.field1474 = null;
                    return true;
                }
                if (var440.field1819 < var441.field1837) {
                    arg0.field1474 = null;
                    return true;
                }
                var440.method3535(var441);
                arg0.field1474 = null;
                return true;
            }
            if (class326.field3509 == arg0.field1474) {
                int var442 = var3.method9388();
                class88.method2938(var442);
                field800[++field779 - 1 & 0x1F] = var442 & 0x7FFF;
                arg0.field1474 = null;
                return true;
            }
            class584.method8201("" + (arg0.field1474 == null ? -1 : arg0.field1474.field3581) + class107.field1382 + (arg0.field1480 == null ? -1 : arg0.field1480.field3581) + class107.field1382 + (arg0.field1481 == null ? -1 : arg0.field1481.field3581) + class107.field1382 + arg0.field1475, (Throwable) null);
            method6988();
        } catch (IOException var447) {
            method5769();
        } catch (Exception var448) {
            String var445 = "" + (arg0.field1474 == null ? -1 : arg0.field1474.field3581) + class107.field1382 + (arg0.field1480 == null ? -1 : arg0.field1480.field3581) + class107.field1382 + (arg0.field1481 == null ? -1 : arg0.field1481.field3581) + class107.field1382 + arg0.field1475 + class107.field1382 + (Statics.field2071.field1347 + Statics.field3772.field1288[0]) + class107.field1382 + (Statics.field2071.field1348 + Statics.field3772.field1234[0]) + class107.field1382;
            for (int var446 = 0; var446 < arg0.field1475 && var446 < 50; var446++) {
                var445 = var445 + var3.field5463[var446] + class107.field1382;
            }
            class584.method8201(var445, var448);
            method6988();
        }
        return true;
    }

    @ObfuscatedName("eo.jy(Lmj;I)V")
    public static final void method3178(class324 arg0) {
        class557 var1 = field784.field1473;
        if (class324.field3416 == arg0) {
            int var2 = var1.method9329();
            int var3 = var1.method9301();
            int var4 = var1.method9258();
            int var5 = (var4 >> 4 & 0x7) + Statics.field2481;
            int var6 = (var4 & 0x7) + Statics.field1573;
            int var7 = var1.method9264();
            if (var5 >= 0 && var6 >= 0 && var5 < Statics.field3742.field1345 && var6 < Statics.field3742.field1346) {
                int var8 = field735 == -1 ? Statics.field3742.field1344 : field735;
                method2493(var8, var5, var6, var3, var2, var7);
            }
        } else if (class324.field3421 == arg0) {
            int var9 = var1.method9540();
            int var10 = var1.method9291();
            int var11 = var1.method9258() & 0x1F;
            int var12 = var1.method9478();
            int var13 = var1.method9258();
            int var14 = var1.method9478();
            int var15 = (var14 >> 4 & 0x7) + Statics.field2481;
            int var16 = (var14 & 0x7) + Statics.field1573;
            if (var15 >= 0 && var16 >= 0 && var15 < Statics.field3742.field1345 && var16 < Statics.field3742.field1346) {
                int var17 = var11 + 1;
                if (Statics.field3772.field1288[0] >= var15 - var17 && Statics.field3772.field1288[0] <= var15 + var17 && Statics.field3772.field1234[0] >= var16 - var17 && Statics.field3772.field1234[0] <= var16 + var17 && Statics.field2378.method2730() != 0 && var10 > 0 && field751 < 50) {
                    field504[field751] = var9;
                    field757[field751] = null;
                    field752[field751] = (var15 << 16) + (var16 << 8) + var11;
                    field753[field751] = var10;
                    field754[field751] = var13;
                    field574[field751] = var12;
                    field751++;
                }
            }
        } else if (class324.field3417 == arg0) {
            int var18 = var1.method9293();
            int var19 = (var18 >> 4 & 0x7) + Statics.field2481;
            int var20 = (var18 & 0x7) + Statics.field1573;
            int var21 = var1.method9301();
            int var22 = var1.method9521();
            int var23 = Statics.field3742.field1344;
            if (0 <= var19 && var19 < 104 && 0 <= var20 && var20 < 104) {
                int var24 = field735 == -1 ? var23 : field735;
                method3295(var24, var19, var20, var21, var22);
            }
        } else if (class324.field3419 == arg0) {
            int var25 = var1.method9293();
            int var26 = var25 >> 2;
            int var27 = var25 & 0x3;
            int var28 = field581[var26];
            int var29 = var1.method9293();
            int var30 = var1.method9540();
            int var31 = var1.method9291();
            int var32 = (var31 >> 4 & 0x7) + Statics.field2481;
            int var33 = (var31 & 0x7) + Statics.field1573;
            if (var32 >= 0 && var33 >= 0 && var32 < Statics.field3742.field1345 && var33 < Statics.field3742.field1346) {
                int var34 = field735 == -1 ? Statics.field3742.field1344 : field735;
                method4219(Statics.field3742, var34, var32, var33, var28, var30, var26, var27, var29, 0, -1);
            }
        } else if (class324.field3423 == arg0) {
            int var35 = var1.method9478();
            int var36 = (var35 >> 4 & 0x7) + Statics.field2481;
            int var37 = (var35 & 0x7) + Statics.field1573;
            int var38 = var1.method9540();
            int var39 = var1.method9264();
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                int var40 = field735 == -1 ? Statics.field3742.field1344 : field735;
                method6917(var40, var36, var37, var38, var39);
            }
        } else {
            if (class324.field3425 == arg0) {
                byte var41 = var1.method9378();
                byte var42 = var1.method9378();
                int var43 = var1.method9388();
                byte var44 = var1.method9378();
                int var45 = var1.method9260();
                byte var46 = var1.method9294();
                int var47 = var1.method9291();
                int var48 = (var47 >> 4 & 0x7) + Statics.field2481;
                int var49 = (var47 & 0x7) + Statics.field1573;
                int var50 = var1.method9301();
                int var51 = var1.method9478();
                int var52 = var51 >> 2;
                int var53 = var51 & 0x3;
                int var54 = field581[var52];
                int var55 = var1.method9540();
                class95 var56;
                if (field630 == var55) {
                    var56 = Statics.field3772;
                } else {
                    var56 = Statics.field3742.field1357[var55];
                }
                if (var56 != null) {
                    int var57 = field735 == -1 ? Statics.field3742.field1344 : field735;
                    method6912(var57, var48, var49, var52, var53, var54, var45, var43, var50, var44, var41, var46, var42, var56);
                }
            }
            if (class324.field3422 == arg0) {
                int var58 = var1.method9258();
                int var59 = var58 >> 2;
                int var60 = var58 & 0x3;
                int var61 = field581[var59];
                int var62 = var1.method9388();
                int var63 = var1.method9258();
                int var64 = (var63 >> 4 & 0x7) + Statics.field2481;
                int var65 = (var63 & 0x7) + Statics.field1573;
                if (0 <= var64 && var64 < 103 && 0 <= var65 && var65 < 103) {
                    int var66 = field735 == -1 ? Statics.field3742.field1344 : field735;
                    class99 var67 = method3846(Statics.field3742, var66, var64, var65, var61);
                    if (var67 != null) {
                        class210 var68 = class210.method3109(var67.field1201);
                        if (var68.field2223) {
                            var67.field1215 = var62;
                            return;
                        }
                    }
                    boolean var69 = method2852(var66, var64, var65, var59, var60, var61, var62);
                    if (var69) {
                        return;
                    }
                    if (var67 != null) {
                        var67.field1215 = var62;
                    }
                }
            } else if (class324.field3428 == arg0) {
                int var70 = var1.method9301();
                int var71 = var1.method9439();
                int var72 = var1.method9301();
                int var73 = var1.method9388();
                int var74 = var1.method9310();
                int var75 = var1.method9258() * 4;
                int var76 = var1.method9293();
                int var77 = (var76 >> 4 & 0x7) + Statics.field2481;
                int var78 = (var76 & 0x7) + Statics.field1573;
                int var79 = var1.method9291() * 4;
                int var80 = var1.method9301();
                byte var81 = var1.method9378();
                int var82 = var1.method9478();
                byte var83 = var1.method9294();
                int var84 = var77 + var83;
                int var85 = var78 + var81;
                if (var77 >= 0 && var78 >= 0 && var77 < Statics.field3742.field1345 && var78 < Statics.field3742.field1346 && var84 >= 0 && var85 >= 0 && var84 < Statics.field3742.field1345 && var85 < Statics.field3742.field1346 && var80 != 65535) {
                    int var86 = field735 == -1 ? Statics.field3742.field1344 : field735;
                    method3426(var86, var77, var78, var84, var85, var74, var80, var75, var79, var72, var70, var82, var73, var71);
                }
            } else if (class324.field3426 == arg0) {
                int var87 = var1.method9258();
                int var88 = var87 >> 2;
                int var89 = var87 & 0x3;
                int var90 = field581[var88];
                int var91 = var1.method9293();
                int var92 = (var91 >> 4 & 0x7) + Statics.field2481;
                int var93 = (var91 & 0x7) + Statics.field1573;
                if (var92 >= 0 && var93 >= 0 && var92 < Statics.field3742.field1345 && var93 < Statics.field3742.field1346) {
                    int var94 = field735 == -1 ? Statics.field3742.field1344 : field735;
                    method4219(Statics.field3742, var94, var92, var93, var90, -1, var88, var89, 31, 0, -1);
                }
            } else if (class324.field3427 == arg0) {
                int var95 = var1.method9258();
                int var96 = (var95 >> 4 & 0x7) + Statics.field2481;
                int var97 = (var95 & 0x7) + Statics.field1573;
                int var98 = var1.method9260();
                short var99 = (short) var1.method9303();
                int var100 = var1.method9521();
                int var101 = var1.method9301();
                short var102 = (short) var1.method9261();
                int var103 = var1.method9305();
                int var104 = var1.method9303();
                if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                    int var105 = field735 == -1 ? Statics.field3742.field1344 : field735;
                    method5962(var105, var96, var97, var101, var100, var102, var104, var99, var103, var98);
                }
            } else if (class324.field3420 == arg0) {
                int var106 = var1.method9540();
                int var107 = var1.method9388();
                int var108 = var1.method9478();
                int var109 = (var108 >> 4 & 0x7) + Statics.field2481;
                int var110 = (var108 & 0x7) + Statics.field1573;
                int var111 = var1.method9258();
                if (var109 >= 0 && var110 >= 0 && var109 < Statics.field3742.field1345 && var110 < Statics.field3742.field1346) {
                    int var112 = class351.method6261(var109);
                    int var113 = class351.method6261(var110);
                    int var114 = field735 == -1 ? Statics.field3742.field1344 : field735;
                    class75 var115 = new class75(var106, var114, var112, var113, method1164(Statics.field3742, var112, var113, var114) - var111, var107, field518);
                    Statics.field3742.field1362.method7243(var115);
                }
            } else {
                if (class324.field3424 == arg0) {
                    int var116 = var1.method9293();
                    int var117 = var1.method9260();
                    int var118 = var1.method9293();
                    int var119 = (var118 >> 4 & 0x7) + Statics.field2481;
                    int var120 = (var118 & 0x7) + Statics.field1573;
                    int var121 = Statics.field3742.field1344;
                    if (var119 >= 0 && var120 >= 0 && var119 < Statics.field3742.field1345 && var120 < Statics.field3742.field1346) {
                        class411 var122 = Statics.field3742.field1359[var121][var119][var120];
                        if (var122 != null) {
                            for (class110 var123 = (class110) var122.method7247(); var123 != null; var123 = (class110) var122.method7249()) {
                                if ((var117 & 0x7FFF) == var123.field1411) {
                                    var123.method2925(var116);
                                    break;
                                }
                            }
                        }
                        if (var119 >= 0 && var120 >= 0 && var119 < Statics.field3742.field1345 && var120 < Statics.field3742.field1346) {
                            int var124 = field735 == -1 ? Statics.field3742.field1344 : field735;
                            method3175(var124, var119, var120, var117, var116);
                        }
                        return;
                    }
                }
                if (class324.field3418 == arg0) {
                    int var125 = var1.method9293();
                    int var126 = (var125 >> 4 & 0x7) + Statics.field2481;
                    int var127 = (var125 & 0x7) + Statics.field1573;
                    int var128 = var1.method9258();
                    boolean var129 = var1.method9258() == 1;
                    int var130 = var1.method9264();
                    int var131 = var1.method9388();
                    int var132 = var1.method9291();
                    int var133 = var1.method9540();
                    int var134 = var1.method9540();
                    if (var126 >= 0 && var127 >= 0 && var126 < Statics.field3742.field1345 && var127 < Statics.field3742.field1346) {
                        int var135 = field735 == -1 ? Statics.field3742.field1344 : field735;
                        method5771(var135, var126, var127, var131, var130, var128, var134, var133, var132, var129);
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.jr(IIIIII)V")
    public static void method3175(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class411 var5 = Statics.field3742.field1359[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class110 var6 = (class110) var5.method7247(); var6 != null; var6 = (class110) var5.method7249()) {
            if ((arg3 & 0x7FFF) == var6.field1411) {
                var6.method2925(arg4);
                break;
            }
        }
    }

    @ObfuscatedName("ds.je(IIIIIII)V")
    public static void method2493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class411 var6 = Statics.field3742.field1359[arg0][arg1][arg2];
        if (var6 == null) {
            return;
        }
        for (class110 var7 = (class110) var6.method7247(); var7 != null; var7 = (class110) var6.method7249()) {
            if ((arg3 & 0x7FFF) == var7.field1411 && var7.field1404 == arg4) {
                var7.field1404 = arg5;
                break;
            }
        }
        method7139(arg0, arg1, arg2);
    }

    @ObfuscatedName("me.jp(IIIIISISIII)V")
    public static void method5962(int arg0, int arg1, int arg2, int arg3, int arg4, short arg5, int arg6, short arg7, int arg8, int arg9) {
        class411 var10 = Statics.field3742.field1359[arg0][arg1][arg2];
        if (var10 == null) {
            return;
        }
        for (class110 var11 = (class110) var10.method7247(); var11 != null; var11 = (class110) var10.method7249()) {
            if ((arg3 & 0x7FFF) == var11.field1411 && var11.field1404 == arg4) {
                class176 var12 = var11.method2924();
                if (var12 == null) {
                    var12 = new class176(arg3);
                }
                if (var12.method3567() && arg6 > -1 && arg6 < var12.field1873.length) {
                    var12.field1873[arg6] = arg5;
                }
                if (var12.method3568() && arg8 > -1 && arg8 < var12.field1872.length) {
                    var12.field1872[arg8] = arg7;
                }
                if (arg9 > -1) {
                    var12.field1877 = arg9;
                    var12.field1868 = null;
                }
                var11.method2927(var12);
                break;
            }
        }
        method7139(arg0, arg1, arg2);
    }

    @ObfuscatedName("oy.jh(IIIIII)V")
    public static void method6917(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class411 var5 = Statics.field3742.field1359[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class110 var6 = (class110) var5.method7247(); var6 != null; var6 = (class110) var5.method7249()) {
            if ((arg3 & 0x7FFF) == var6.field1411 && var6.field1404 == arg4) {
                var6.method2929();
                break;
            }
        }
        method7139(arg0, arg1, arg2);
    }

    @ObfuscatedName("oc.ky(IIIIIIIIIIIIILdv;I)V")
    public static void method6912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class95 arg13) {
        class210 var14 = class210.method3109(arg6);
        int var15;
        int var16;
        if (arg4 == 1 || arg4 == 3) {
            var15 = var14.field2216;
            var16 = var14.field2187;
        } else {
            var15 = var14.field2187;
            var16 = var14.field2216;
        }
        int var17 = (var15 >> 1) + arg1;
        int var18 = (var15 + 1 >> 1) + arg1;
        int var19 = (var16 >> 1) + arg2;
        int var20 = (var16 + 1 >> 1) + arg2;
        int[][] var21 = Statics.field3742.field1350[arg0];
        int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
        int var23 = (arg1 << 7) + (var15 << 6);
        int var24 = (arg2 << 7) + (var16 << 6);
        class256 var25 = var14.method3953(arg3, arg4, var21, var23, var22, var24);
        if (var25 == null) {
            return;
        }
        method4219(Statics.field3742, arg0, arg1, arg2, arg5, -1, 0, 0, 31, arg7 + 1, arg8 + 1);
        arg13.field1135 = field518 + arg7;
        arg13.field1145 = field518 + arg8;
        arg13.field1143 = var25;
        arg13.field1139 = arg1 * 128 + var15 * 64;
        arg13.field1153 = arg2 * 128 + var16 * 64;
        arg13.field1147 = var22;
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
        arg13.field1150 = arg1 + arg9;
        arg13.field1152 = arg1 + arg11;
        arg13.field1151 = arg2 + arg10;
        arg13.field1144 = arg2 + arg12;
    }

    @ObfuscatedName("fz.kh(IIIIIIIIIIIIIII)V")
    public static void method3426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg1 * 128 + 64;
        int var15 = arg2 * 128 + 64;
        int var16 = arg3 * 128 + 64;
        int var17 = arg4 * 128 + 64;
        class80 var18 = new class80(arg6, arg0, var14, var15, method1164(Statics.field3742, var14, var15, arg0) - arg7, field518 + arg9, field518 + arg10, arg11, arg12, arg13, arg5, arg8);
        var18.method2332(var16, var17, method1164(Statics.field3742, var16, var17, arg0) - arg8, field518 + arg9);
        Statics.field3742.field1361.method7243(var18);
    }

    @ObfuscatedName("fh.kg(IIIIIB)V")
    public static void method3295(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class411 var5 = Statics.field3742.field1359[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class110 var6 = (class110) var5.method7247(); var6 != null; var6 = (class110) var5.method7249()) {
            if ((arg3 & 0x7FFF) == var6.field1411 && var6.field1404 == arg4) {
                var6.method8667();
                break;
            }
        }
        if (var5.method7247() == null) {
            Statics.field3742.field1359[arg0][arg1][arg2] = null;
        }
        method7139(arg0, arg1, arg2);
    }

    @ObfuscatedName("lg.ka(IIIIIIIIIZI)V")
    public static void method5771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        class110 var10 = new class110();
        var10.field1411 = arg3;
        var10.field1404 = arg4;
        var10.method2925(arg5);
        var10.field1405 = field519 + arg6;
        var10.field1412 = field519 + arg7;
        var10.field1407 = arg8;
        var10.field1408 = arg9;
        if (Statics.field3742.field1359[arg0][arg1][arg2] == null) {
            Statics.field3742.field1359[arg0][arg1][arg2] = new class411();
        }
        Statics.field3742.field1359[arg0][arg1][arg2].method7243(var10);
        method7139(arg0, arg1, arg2);
    }

    @ObfuscatedName("lr.kn(IIIIIIB)Z")
    public static boolean method5798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return method2852(Statics.field3742.field1344, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("eg.ku(IIIIIIII)Z")
    public static boolean method2852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class245 var7 = Statics.field3742.field1352;
        if (class385.field4502.field4503 == arg5) {
            class264 var8 = var7.method4848(arg0, arg1, arg2);
            if (var8 != null) {
                int var9 = class257.method5896(var8.field2944);
                if (class371.field4065.field4086 == arg3) {
                    var8.field2942 = new class83(Statics.field3742, var9, 2, arg4 + 4, arg0, arg1, arg2, arg6, false, var8.field2942);
                    var8.field2937 = new class83(Statics.field3742, var9, 2, arg4 + 1 & 0x3, arg0, arg1, arg2, arg6, false, var8.field2937);
                } else {
                    var8.field2942 = new class83(Statics.field3742, var9, arg3, arg4, arg0, arg1, arg2, arg6, false, var8.field2942);
                }
                return true;
            }
        } else if (class385.field4500.field4503 == arg5) {
            class266 var10 = var7.method4840(arg0, arg1, arg2);
            if (var10 != null) {
                int var11 = class257.method5896(var10.field2955);
                if (class371.field4068.field4086 == arg3 || class371.field4069.field4086 == arg3) {
                    var10.field2953 = new class83(Statics.field3742, var11, 4, arg4, arg0, arg1, arg2, arg6, false, var10.field2953);
                } else if (class371.field4070.field4086 == arg3) {
                    var10.field2953 = new class83(Statics.field3742, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field2953);
                } else if (class371.field4071.field4086 == arg3) {
                    var10.field2953 = new class83(Statics.field3742, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field2953);
                } else if (class371.field4085.field4086 == arg3) {
                    var10.field2953 = new class83(Statics.field3742, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field2953);
                    var10.field2954 = new class83(Statics.field3742, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field2954);
                }
                return true;
            }
        } else if (class385.field4501.field4503 == arg5) {
            class267 var12 = var7.method4886(arg0, arg1, arg2);
            if (class371.field4084.field4086 == arg3) {
                arg3 = class371.field4063.field4086;
            }
            if (var12 != null) {
                var12.field2968 = new class83(Statics.field3742, class257.method5896(var12.field2961), arg3, arg4, arg0, arg1, arg2, arg6, false, var12.field2968);
                return true;
            }
        } else if (class385.field4504.field4503 == arg5) {
            class236 var13 = var7.method4701(arg0, arg1, arg2);
            if (var13 != null) {
                var13.field2534 = new class83(Statics.field3742, class257.method5896(var13.field2530), 22, arg4, arg0, arg1, arg2, arg6, false, var13.field2534);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ix.kf(Ldn;IIIIIIIIIIB)V")
    public static void method4219(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class411 var11 = arg0.field1341;
        class99 var12 = null;
        for (class99 var13 = (class99) var11.method7247(); var13 != null; var13 = (class99) var11.method7249()) {
            if (var13.field1206 == arg1 && var13.field1199 == arg2 && var13.field1202 == arg3 && var13.field1200 == arg4) {
                var12 = var13;
                break;
            }
        }
        if (var12 == null) {
            var12 = new class99();
            var12.field1206 = arg1;
            var12.field1200 = arg4;
            var12.field1199 = arg2;
            var12.field1202 = arg3;
            var12.field1215 = -1;
            method814(arg0, var12);
            var11.method7243(var12);
        }
        var12.field1201 = arg5;
        var12.field1208 = arg6;
        var12.field1207 = arg7;
        var12.field1211 = arg9;
        var12.field1212 = arg10;
        var12.method2608(arg8);
    }

    @ObfuscatedName("hp.km(Ldn;IIIII)Ldo;")
    public static final class99 method3846(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class99 var5 = (class99) arg0.field1341.method7247(); var5 != null; var5 = (class99) arg0.field1341.method7249()) {
            if (var5.field1206 == arg1 && var5.field1199 == arg2 && var5.field1202 == arg3 && var5.field1200 == arg4) {
                return var5;
            }
        }
        return null;
    }

    @ObfuscatedName("dw.ki(I)V")
    public static final void method2663() {
        for (class99 var0 = (class99) Statics.field2071.field1341.method7247(); var0 != null; var0 = (class99) Statics.field2071.field1341.method7249()) {
            if (var0.field1212 == -1) {
                var0.field1211 = 0;
                method814(Statics.field2071, var0);
            } else {
                var0.method8667();
            }
        }
    }

    @ObfuscatedName("bm.kr(Ldn;Ldo;I)V")
    public static final void method814(class104 arg0, class99 arg1) {
        class245 var2 = arg0.field1352;
        long var3 = 0L;
        int var5 = -1;
        int var6 = 0;
        int var7 = 0;
        if (arg1.field1200 == 0) {
            var3 = var2.method4790(arg1.field1206, arg1.field1199, arg1.field1202);
        }
        if (arg1.field1200 == 1) {
            var3 = var2.method4703(arg1.field1206, arg1.field1199, arg1.field1202);
        }
        if (arg1.field1200 == 2) {
            var3 = var2.method4817(arg1.field1206, arg1.field1199, arg1.field1202);
        }
        if (arg1.field1200 == 3) {
            var3 = var2.method4705(arg1.field1206, arg1.field1199, arg1.field1202);
        }
        if (var3 != 0L) {
            int var8 = var2.method4776(arg1.field1206, arg1.field1199, arg1.field1202, var3);
            var5 = class257.method5896(var3);
            var6 = var8 & 0x1F;
            var7 = var8 >> 6 & 0x3;
        }
        arg1.field1209 = var5;
        arg1.field1205 = var6;
        arg1.field1203 = var7;
    }

    @ObfuscatedName("gv.ko(Ldn;IIIIIIIII)V")
    public static final void method3528(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class245 var9 = arg0.field1352;
        if (arg3 < 1 || arg4 < 1 || arg3 > arg0.field1345 - 1 || arg4 > arg0.field1346 - 1) {
            return;
        }
        if (field506 && arg0.field1344 != arg1) {
            return;
        }
        long var10 = 0L;
        boolean var12 = true;
        boolean var13 = false;
        boolean var14 = false;
        if (arg2 == 0) {
            var10 = var9.method4790(arg1, arg3, arg4);
        }
        if (arg2 == 1) {
            var10 = var9.method4703(arg1, arg3, arg4);
        }
        if (arg2 == 2) {
            var10 = var9.method4817(arg1, arg3, arg4);
        }
        if (arg2 == 3) {
            var10 = var9.method4705(arg1, arg3, arg4);
        }
        if (var10 != 0L) {
            int var15 = var9.method4776(arg1, arg3, arg4, var10);
            int var16 = class257.method5896(var10);
            int var17 = var15 & 0x1F;
            int var18 = var15 >> 6 & 0x3;
            class210 var19 = class210.method3109(var16);
            if (var19 != null && var19.method3959()) {
                int var22 = var19.field2187;
                int var23 = var19.field2216;
                if (var18 == 1 || var18 == 3) {
                    var22 = var19.field2216;
                    var23 = var19.field2187;
                }
                int var24 = (arg3 + var22) * 128;
                int var25 = (arg4 + var23) * 128;
                int var26 = arg3 * 128;
                int var27 = arg4 * 128;
                int var28 = var19.field2177;
                int var29 = var19.field2217 * 128;
                int var30 = var19.field2218 * 128;
                if (var19.field2178 != null) {
                    class210 var31 = var19.method3968();
                    if (var31 != null) {
                        var28 = var31.field2177;
                        var29 = var31.field2217 * 128;
                        var30 = var31.field2218 * 128;
                    }
                }
                class72 var10000 = (class72) null;
                for (class72 var32 = (class72) class72.field848.method7247(); var32 != null; var32 = (class72) class72.field848.method7249()) {
                    if (var32.field834 == arg1 && var32.field835 == var26 && var32.field836 == var27 && var32.field837 == var24 && var32.field838 == var25 && var32.field841 == var28 && var32.field833 == var29 && var32.field840 == var30) {
                        if (var32.field850 != null) {
                            Statics.field4035.method699(var32.field850);
                            var32.field850 = null;
                        }
                        if (var32.field847 != null) {
                            Statics.field4035.method699(var32.field847);
                            var32.field847 = null;
                        }
                        var32.method8667();
                        break;
                    }
                    var10000 = (class72) null;
                }
            }
            if (arg2 == 0) {
                var9.method4693(arg1, arg3, arg4);
                if (var19.field2189 != 0) {
                    arg0.field1343[arg1].method5299(arg3, arg4, var17, var18, var19.field2190);
                }
            }
            if (arg2 == 1) {
                var9.method4874(arg1, arg3, arg4);
            }
            if (arg2 == 2) {
                var9.method4695(arg1, arg3, arg4);
                if (var19.field2187 + arg3 > arg0.field1345 - 1 || var19.field2187 + arg4 > arg0.field1346 - 1 || var19.field2216 + arg3 > arg0.field1345 - 1 || var19.field2216 + arg4 > arg0.field1346 - 1) {
                    return;
                }
                if (var19.field2189 != 0) {
                    arg0.field1343[arg1].method5275(arg3, arg4, var19.field2187, var19.field2216, var18, var19.field2190);
                }
            }
            if (arg2 == 3) {
                var9.method4696(arg1, arg3, arg4);
                if (var19.field2189 == 1) {
                    arg0.field1343[arg1].method5301(arg3, arg4);
                }
            }
        }
        if (arg5 < 0) {
            return;
        }
        int var33 = arg1;
        if (arg1 < 3 && (arg0.field1351[1][arg3][arg4] & 0x2) == 2) {
            var33 = arg1 + 1;
        }
        class85.method662(arg0, arg1, var33, arg3, arg4, arg5, arg6, arg7, arg8, arg0.field1343[arg1]);
        class210 var34 = class210.method3109(arg5);
        if (var34 != null && var34.method3959()) {
            class72.method3333(var33, arg3, arg4, var34, arg6);
        }
    }

    @ObfuscatedName("pw.kl(Ldn;IIB)V")
    public static final void method7119(class104 arg0, int arg1, int arg2) {
        method4276(arg0, arg0.field1344, arg1, arg2);
    }

    @ObfuscatedName("pl.ke(IIII)V")
    public static final void method7139(int arg0, int arg1, int arg2) {
        method4276(Statics.field3742, arg0, arg1, arg2);
    }

    @ObfuscatedName("iy.kj(Ldn;IIII)V")
    public static final void method4276(class104 arg0, int arg1, int arg2, int arg3) {
        class411 var4 = arg0.field1359[arg1][arg2][arg3];
        if (var4 == null) {
            arg0.field1352.method4745(arg1, arg2, arg3);
            return;
        }
        long var5 = -99999999L;
        class110 var7 = null;
        for (class110 var8 = (class110) var4.method7247(); var8 != null; var8 = (class110) var4.method7249()) {
            class211 var9 = class211.method7530(var8.field1411);
            long var10 = (long) var9.field2234;
            if (var9.field2250 == 1) {
                var10 *= var8.field1404 < Integer.MAX_VALUE ? (long) (var8.field1404 + 1) : (long) var8.field1404;
            }
            if (var10 > var5) {
                var5 = var10;
                var7 = var8;
            }
        }
        if (var7 == null) {
            arg0.field1352.method4745(arg1, arg2, arg3);
            return;
        }
        var4.method7244(var7);
        class110 var12 = null;
        class110 var13 = null;
        for (class110 var14 = (class110) var4.method7247(); var14 != null; var14 = (class110) var4.method7249()) {
            if (var7.field1411 != var14.field1411) {
                if (var12 == null) {
                    var12 = var14;
                }
                if (var12.field1411 != var14.field1411 && var13 == null) {
                    var13 = var14;
                }
            }
        }
        long var15 = class257.method3345(arg2, arg3, 3, false, 0, arg0.field1354);
        arg0.field1352.method4683(arg1, arg2, arg3, method1164(arg0, class351.method6261(arg2), class351.method6261(arg3), arg1), var7, var15, var12, var13);
    }

    @ObfuscatedName("lx.kt(Ldn;Lvm;II)V")
    public static void method5839(class104 arg0, class557 arg1, int arg2) {
        int var3 = arg1.method9258();
        if (var3 < arg0.field1356) {
            throw new RuntimeException("dang");
        } else if (var3 > arg0.field1356) {
            throw new RuntimeException("dang!");
        } else {
            arg0.field1356 = 0;
            class275 var4 = new class275();
            for (int var5 = 0; var5 < var3; var5++) {
                int var6 = arg0.field1358[var5];
                class481 var7 = arg0.field1355[var6];
                int var8 = arg1.method9258();
                if (var8 == 0) {
                    field684.method2606(var7.field5038);
                    arg0.field1355[var6] = null;
                } else {
                    arg0.field1358[++arg0.field1356 - 1] = var6;
                    if (arg2 < 3) {
                        var7.field5032 = arg2 == 1 ? 1 : arg1.method9259();
                        byte var9 = arg1.method9259();
                        byte var10 = arg1.method9259();
                        int var11 = arg1.method9260();
                        Statics.method838((byte) arg1.method9258());
                        var4.method5370(var9, var10);
                        var4.method5353(var11);
                        if (var4.method5345() != 0 || var4.method5347() != 0) {
                            var7.method8443(var4);
                        }
                    } else if (arg2 == 3 && var8 != 1) {
                        var4.method5351(var7.method8441());
                        byte var12 = arg1.method9259();
                        if (var12 != 0) {
                            int var13 = class277.method8572(arg1, var12, 0);
                            int var14 = class277.method8572(arg1, var12, 2);
                            int var15 = class277.method8572(arg1, var12, 4);
                            int var16 = class277.method8572(arg1, var12, 6);
                            var4.method5362(var13, var14, var15, var16);
                        }
                        if (var8 == 2) {
                            var7.method8443(var4);
                        } else {
                            var7.method8444(var4);
                        }
                    }
                }
            }
            while (arg1.method9198(field784.field1475) >= 10) {
                int var17 = arg1.method9260();
                arg0.field1358[++arg0.field1356 - 1] = var17;
                int var18 = arg1.method9258();
                int var19 = arg1.method9258();
                int var20 = var18 * 8;
                int var21 = var19 * 8;
                class104 var22 = field684.method2590(var17, var20, var21, Statics.field2378.method2761(), class233.field2472);
                class481 var23 = new class481(var17, var22);
                arg0.field1355[var17] = var23;
                if (arg2 < 3) {
                    int var24 = arg1.method9258();
                    int var25 = arg1.method9258();
                    var23.field5031.method5370(var24, var25);
                    var23.field5031.method5353(arg1.method9260());
                    arg1.method9260();
                } else if (arg2 == 3) {
                    var23.field5032 = arg1.method9259();
                    class277.method5147(arg1, var23.field5031, 0, 0);
                    var23.method8443(var23.field5031);
                }
            }
        }
    }

    @ObfuscatedName("uv.kk(Ldn;Lvm;B)V")
    public static void method9011(class104 arg0, class557 arg1) {
        int var2 = arg1.method9260();
        class481 var3 = arg0.field1355[var2];
        class104 var4 = var3.field5038;
        var4.field1347 = arg1.method9260();
        var4.field1348 = arg1.method9260();
        int var5 = var4.field1345 / 8;
        int var6 = var4.field1346 / 8;
        int var7 = arg1.method9260();
        arg1.method9206();
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < var5; var9++) {
                for (int var10 = 0; var10 < var6; var10++) {
                    int var11 = arg1.method9207(1);
                    if (var11 == 1) {
                        field577[var8][var9][var10] = arg1.method9207(26);
                    } else {
                        field577[var8][var9][var10] = -1;
                    }
                }
            }
        }
        arg1.method9208();
        Statics.field3718 = new int[var7][4];
        for (int var12 = 0; var12 < var7; var12++) {
            for (int var13 = 0; var13 < 4; var13++) {
                Statics.field3718[var12][var13] = arg1.method9264();
            }
        }
        Statics.field1375 = new int[var7];
        Statics.field2126 = new int[var7];
        Statics.field2734 = new int[var7];
        Statics.field3717 = new byte[var7][];
        Statics.field3609 = new byte[var7][];
        int var14 = 0;
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < var5; var16++) {
                for (int var17 = 0; var17 < var6; var17++) {
                    int var18 = field577[var15][var16][var17];
                    if (var18 != -1) {
                        int var19 = var18 >> 14 & 0x3FF;
                        int var20 = var18 >> 3 & 0x7FF;
                        int var21 = (var19 / 8 << 8) + var20 / 8;
                        for (int var22 = 0; var22 < var14; var22++) {
                            if (Statics.field1375[var22] == var21) {
                                var21 = -1;
                                break;
                            }
                        }
                        if (var21 != -1) {
                            Statics.field1375[var14] = var21;
                            int var23 = var21 >> 8 & 0xFF;
                            int var24 = var21 & 0xFF;
                            Statics.field2126[var14] = Statics.field1966.method7010("m" + var23 + "_" + var24);
                            Statics.field2734[var14] = Statics.field1966.method7010("l" + var23 + "_" + var24);
                            var14++;
                        }
                    }
                }
            }
        }
        Statics.method3201(25);
        field619 = true;
        Statics.field2125 = var4;
        method2471(var4);
    }

    @ObfuscatedName("qq.kq(Ldn;ZLvm;IB)V")
    public static final void method7481(class104 arg0, boolean arg1, class557 arg2, int arg3) {
        field638 = 0;
        field565 = 0;
        arg2.method9206();
        int var4 = arg2.method9207(8);
        if (var4 < arg0.field1360) {
            for (int var5 = var4; var5 < arg0.field1360; var5++) {
                field639[++field638 - 1] = arg0.field1342[var5];
            }
        }
        if (var4 > arg0.field1360) {
            throw new RuntimeException("");
        }
        arg0.field1360 = 0;
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg0.field1342[var6];
            class106 var8 = arg0.field1353[var7];
            int var9 = arg2.method9207(1);
            if (var9 == 0) {
                arg0.field1342[++arg0.field1360 - 1] = var7;
                var8.field1276 = field518;
            } else {
                int var10 = arg2.method9207(2);
                if (var10 == 0) {
                    arg0.field1342[++arg0.field1360 - 1] = var7;
                    var8.field1276 = field518;
                    field803[++field565 - 1] = var7;
                } else if (var10 == 1) {
                    arg0.field1342[++arg0.field1360 - 1] = var7;
                    var8.field1276 = field518;
                    int var11 = arg2.method9207(3);
                    var8.method2858(var11, class276.field3049);
                    int var12 = arg2.method9207(1);
                    if (var12 == 1) {
                        field803[++field565 - 1] = var7;
                    }
                } else if (var10 == 2) {
                    arg0.field1342[++arg0.field1360 - 1] = var7;
                    var8.field1276 = field518;
                    if (arg2.method9207(1) == 1) {
                        int var13 = arg2.method9207(3);
                        var8.method2858(var13, class276.field3058);
                        int var14 = arg2.method9207(3);
                        var8.method2858(var14, class276.field3058);
                    } else {
                        int var15 = arg2.method9207(3);
                        var8.method2858(var15, class276.field3047);
                    }
                    int var16 = arg2.method9207(1);
                    if (var16 == 1) {
                        field803[++field565 - 1] = var7;
                    }
                } else if (var10 == 3) {
                    field639[++field638 - 1] = var7;
                }
            }
        }
        while (true) {
            byte var17 = 16;
            int var18 = 0x1 << var17;
            if (arg2.method9209(field784.field1475) < var17 + 12) {
                break;
            }
            int var19 = arg2.method9207(var17);
            if (var18 - 1 == var19) {
                break;
            }
            int var23 = Statics.field1904;
            boolean var24 = false;
            if (arg0.field1353[var19] == null) {
                arg0.field1353[var19] = new class106();
                var24 = true;
            }
            class106 var25 = arg0.field1353[var19];
            var25.field1373 = var23;
            arg0.field1342[++arg0.field1360 - 1] = var19;
            var25.field1276 = field518;
            int var26;
            int var27;
            int var29;
            if (arg3 == 4) {
                var25.field1372 = class195.method8497(arg2.method9207(14));
                if (arg1) {
                    var26 = arg2.method9207(8);
                    if (var26 > 127) {
                        var26 -= 256;
                    }
                } else {
                    var26 = arg2.method9207(5);
                    if (var26 > 15) {
                        var26 -= 32;
                    }
                }
                if (arg1) {
                    var27 = arg2.method9207(8);
                    if (var27 > 127) {
                        var27 -= 256;
                    }
                } else {
                    var27 = arg2.method9207(5);
                    if (var27 > 15) {
                        var27 -= 32;
                    }
                }
                int var28 = arg2.method9207(1);
                if (var28 == 1) {
                    field803[++field565 - 1] = var19;
                }
                var29 = arg2.method9207(1);
                int var30 = field643[arg2.method9207(3)];
                if (var24) {
                    var25.field1284 = var25.field1219 = var30;
                }
                boolean var31 = arg2.method9207(1) == 1;
                if (var31) {
                    arg2.method9207(32);
                }
            } else if (arg3 == 5) {
                if (arg1) {
                    var27 = arg2.method9207(8);
                    if (var27 > 127) {
                        var27 -= 256;
                    }
                } else {
                    var27 = arg2.method9207(6);
                    if (var27 > 31) {
                        var27 -= 64;
                    }
                }
                if (arg1) {
                    var26 = arg2.method9207(8);
                    if (var26 > 127) {
                        var26 -= 256;
                    }
                } else {
                    var26 = arg2.method9207(6);
                    if (var26 > 31) {
                        var26 -= 64;
                    }
                }
                int var32 = field643[arg2.method9207(3)];
                if (var24) {
                    var25.field1284 = var25.field1219 = var32;
                }
                boolean var33 = arg2.method9207(1) == 1;
                if (var33) {
                    arg2.method9207(32);
                }
                int var34 = arg2.method9207(1);
                if (var34 == 1) {
                    field803[++field565 - 1] = var19;
                }
                var25.field1372 = class195.method8497(arg2.method9207(14));
                var29 = arg2.method9207(1);
            } else {
                var29 = 0;
                var27 = 0;
                var26 = 0;
            }
            method6149(var25);
            if (var25.field1286 == 0) {
                var25.field1219 = 0;
            }
            if (class556.field5458 >= 222) {
                var25.method2859(Statics.field1897 + var27, Statics.field3095 + var26, var29 == 1);
            } else {
                var25.method2859(Statics.field3772.field1288[0] + var27, Statics.field3772.field1234[0] + var26, var29 == 1);
            }
        }
        arg2.method9208();
        method6409(arg0, arg2);
        for (int var20 = 0; var20 < field638; var20++) {
            int var21 = field639[var20];
            if (field518 != arg0.field1353[var21].field1276) {
                arg0.field1353[var21].field1372 = null;
                arg0.field1353[var21] = null;
            }
        }
        if (field784.field1475 != arg2.field5462) {
            throw new RuntimeException(arg2.field5462 + class107.field1382 + field784.field1475);
        }
        for (int var22 = 0; var22 < arg0.field1360; var22++) {
            if (arg0.field1353[arg0.field1342[var22]] == null) {
                throw new RuntimeException(var22 + class107.field1382 + arg0.field1360);
            }
        }
    }

    @ObfuscatedName("ne.kx(Ldn;Lvm;I)V")
    public static final void method6409(class104 arg0, class557 arg1) {
        for (int var2 = 0; var2 < field565; var2++) {
            int var3 = field803[var2];
            class106 var4 = arg0.field1353[var3];
            int var5 = arg1.method9258();
            if ((var5 & 0x80) != 0) {
                int var6 = arg1.method9258();
                var5 += var6 << 8;
            }
            if ((var5 & 0x2000) != 0) {
                int var7 = arg1.method9258();
                var5 += var7 << 16;
            }
            if ((var5 & 0x100) != 0) {
                var4.field1293 = arg1.method9507();
            }
            if ((var5 & 0x400) != 0) {
                var4.method2855(arg1.method9291());
            }
            if ((var5 & 0x4000) != 0) {
                int var8 = arg1.method9293();
                if ((var8 & 0x1) == 1) {
                    var4.method2869();
                } else {
                    int[] var9 = null;
                    if ((var8 & 0x2) == 2) {
                        int var10 = arg1.method9291();
                        var9 = new int[var10];
                        for (int var11 = 0; var11 < var10; var11++) {
                            int var12 = arg1.method9388();
                            int var13 = var12 == 65535 ? -1 : var12;
                            var9[var11] = var13;
                        }
                    }
                    short[] var14 = null;
                    if ((var8 & 0x4) == 4) {
                        int var15 = 0;
                        if (var4.field1372.field2018 != null) {
                            var15 = var4.field1372.field2018.length;
                        }
                        var14 = new short[var15];
                        for (int var16 = 0; var16 < var15; var16++) {
                            var14[var16] = (short) arg1.method9260();
                        }
                    }
                    short[] var17 = null;
                    if ((var8 & 0x8) == 8) {
                        int var18 = 0;
                        if (var4.field1372.field2032 != null) {
                            var18 = var4.field1372.field2032.length;
                        }
                        var17 = new short[var18];
                        for (int var19 = 0; var19 < var18; var19++) {
                            var17[var19] = (short) arg1.method9260();
                        }
                    }
                    boolean var20 = false;
                    if ((var8 & 0x10) != 0) {
                        var20 = arg1.method9478() == 1;
                    }
                    long var21 = (long) (++class106.field1370 - 1);
                    var4.method2867(new class194(var21, var9, var14, var17, var20));
                }
            }
            if ((var5 & 0x1000) != 0) {
                int var23 = arg1.method9293();
                if ((var23 & 0x1) == 1) {
                    var4.method2868();
                } else {
                    int[] var24 = null;
                    if ((var23 & 0x2) == 2) {
                        int var25 = arg1.method9258();
                        var24 = new int[var25];
                        for (int var26 = 0; var26 < var25; var26++) {
                            int var27 = arg1.method9388();
                            int var28 = var27 == 65535 ? -1 : var27;
                            var24[var26] = var28;
                        }
                    }
                    short[] var29 = null;
                    if ((var23 & 0x4) == 4) {
                        int var30 = 0;
                        if (var4.field1372.field2018 != null) {
                            var30 = var4.field1372.field2018.length;
                        }
                        var29 = new short[var30];
                        for (int var31 = 0; var31 < var30; var31++) {
                            var29[var31] = (short) arg1.method9388();
                        }
                    }
                    short[] var32 = null;
                    if ((var23 & 0x8) == 8) {
                        int var33 = 0;
                        if (var4.field1372.field2032 != null) {
                            var33 = var4.field1372.field2032.length;
                        }
                        var32 = new short[var33];
                        for (int var34 = 0; var34 < var33; var34++) {
                            var32[var34] = (short) arg1.method9388();
                        }
                    }
                    boolean var35 = false;
                    if ((var23 & 0x10) != 0) {
                        var35 = arg1.method9478() == 1;
                    }
                    long var36 = (long) (++class106.field1377 - 1);
                    var4.method2865(new class194(var36, var24, var29, var32, var35));
                }
            }
            if ((var5 & 0x40000) != 0) {
                int var38 = arg1.method9258();
                if (var38 == 0) {
                    var4.method2864();
                } else {
                    int[] var39 = new int[8];
                    short[] var40 = new short[8];
                    for (int var41 = 0; var41 < 8; var41++) {
                        if ((var38 & 0x1 << var41) == 0) {
                            var39[var41] = -1;
                            var40[var41] = -1;
                        } else {
                            var39[var41] = arg1.method9278();
                            var40[var41] = (short) arg1.method9275();
                        }
                    }
                    var4.method2897(var39, var40);
                }
            }
            if ((var5 & 0x10000) != 0) {
                int var42 = arg1.method9329();
                var4.field1267 = (var42 & 0x1) == 0 ? var4.field1372.field2015 : arg1.method9540();
                var4.field1280 = (var42 & 0x2) == 0 ? var4.field1372.field2005 : arg1.method9260();
                var4.field1226 = (var42 & 0x4) == 0 ? var4.field1372.field2019 : arg1.method9388();
                var4.field1227 = (var42 & 0x8) == 0 ? var4.field1372.field2034 : arg1.method9388();
                var4.field1228 = (var42 & 0x10) == 0 ? var4.field1372.field2038 : arg1.method9388();
                var4.field1265 = (var42 & 0x20) == 0 ? var4.field1372.field2020 : arg1.method9260();
                var4.field1266 = (var42 & 0x40) == 0 ? var4.field1372.field2039 : arg1.method9301();
                var4.field1291 = (var42 & 0x80) == 0 ? var4.field1372.field2022 : arg1.method9260();
                var4.field1232 = (var42 & 0x100) == 0 ? var4.field1372.field2023 : arg1.method9260();
                var4.field1233 = (var42 & 0x200) == 0 ? var4.field1372.field2024 : arg1.method9260();
                var4.field1289 = (var42 & 0x400) == 0 ? var4.field1372.field2025 : arg1.method9388();
                var4.field1225 = (var42 & 0x800) == 0 ? var4.field1372.field2026 : arg1.method9388();
                var4.field1258 = (var42 & 0x1000) == 0 ? var4.field1372.field2027 : arg1.method9260();
                var4.field1237 = (var42 & 0x2000) == 0 ? var4.field1372.field2028 : arg1.method9301();
                var4.field1223 = (var42 & 0x4000) == 0 ? var4.field1372.field2029 : arg1.method9388();
            }
            if ((var5 & 0x10) != 0) {
                var4.field1241 = arg1.method9260();
                var4.field1241 += arg1.method9291() << 16;
                int var43 = 16777215;
                if (var4.field1241 == var43) {
                    var4.field1241 = -1;
                }
            }
            if ((var5 & 0x40) != 0) {
                int var44 = arg1.method9388();
                if (var44 == 65535) {
                    var44 = -1;
                }
                int var45 = arg1.method9293();
                if (var4.field1275 == var44 && var44 != -1) {
                    int var46 = class213.method6692(var44).field2323;
                    if (var46 == 1) {
                        var4.field1263 = 0;
                        var4.field1290 = 0;
                        var4.field1235 = var45;
                        var4.field1238 = 0;
                    }
                    if (var46 == 2) {
                        var4.field1238 = 0;
                    }
                } else if (var44 == -1 || var4.field1275 == -1 || class213.method6692(var44).field2321 >= class213.method6692(var4.field1275).field2321) {
                    var4.field1275 = var44;
                    var4.field1263 = 0;
                    var4.field1290 = 0;
                    var4.field1235 = var45;
                    var4.field1238 = 0;
                    var4.field1292 = var4.field1256;
                }
            }
            if ((var5 & 0x20000) != 0) {
                int var47 = arg1.method9291();
                for (int var48 = 0; var48 < var47; var48++) {
                    int var49 = arg1.method9291();
                    int var50 = arg1.method9388();
                    int var51 = arg1.method9264();
                    var4.method2624(var49, var50, var51 >> 16, var51 & 0xFFFF);
                }
            }
            if ((var5 & 0x200) != 0) {
                var4.method2854(arg1.method9269());
            }
            if ((var5 & 0x20) != 0) {
                var4.field1252 = arg1.method9269();
                var4.field1231 = 100;
            }
            if ((var5 & 0x800) != 0) {
                var4.field1269 = arg1.method9296();
                var4.field1229 = arg1.method9378();
                var4.field1287 = arg1.method9378();
                var4.field1272 = arg1.method9294();
                var4.field1271 = arg1.method9540() + field518;
                var4.field1274 = arg1.method9540() + field518;
                var4.field1224 = arg1.method9260();
                var4.field1256 = 1;
                var4.field1292 = 0;
                var4.field1269 += var4.field1288[0];
                var4.field1229 += var4.field1234[0];
                var4.field1287 += var4.field1288[0];
                var4.field1272 += var4.field1234[0];
            }
            if ((var5 & 0x8) != 0) {
                int var52 = arg1.method9388();
                int var53 = arg1.method9540();
                var4.field1257 = arg1.method9478() == 1;
                var4.field1255 = var52;
                var4.field1259 = var53;
            }
            if ((var5 & 0x8000) != 0) {
                var4.field1278 = field518 + arg1.method9301();
                var4.field1279 = field518 + arg1.method9388();
                var4.field1277 = arg1.method9294();
                var4.field1281 = arg1.method9296();
                var4.field1282 = arg1.method9259();
                var4.field1283 = (byte) arg1.method9291();
            }
            if ((var5 & 0x4) != 0) {
                arg1.method9540();
                arg1.method9329();
            }
            if ((var5 & 0x1) != 0) {
                var4.field1372 = class195.method8497(arg1.method9260());
                method6149(var4);
            }
            if ((var5 & 0x2) != 0) {
                int var54 = arg1.method9293();
                if (var54 > 0) {
                    for (int var55 = 0; var55 < var54; var55++) {
                        int var56 = -1;
                        int var57 = -1;
                        int var58 = -1;
                        int var59 = arg1.method9274();
                        if (var59 == 32767) {
                            var59 = arg1.method9274();
                            var57 = arg1.method9274();
                            var56 = arg1.method9274();
                            var58 = arg1.method9274();
                        } else if (var59 == 32766) {
                            var59 = -1;
                        } else {
                            var57 = arg1.method9274();
                        }
                        int var60 = arg1.method9274();
                        var4.method2622(var59, var57, var56, var58, field518, var60);
                    }
                }
                int var61 = arg1.method9293();
                if (var61 > 0) {
                    for (int var62 = 0; var62 < var61; var62++) {
                        int var63 = arg1.method9274();
                        int var64 = arg1.method9274();
                        if (var64 == 32767) {
                            var4.method2650(var63);
                        } else {
                            int var65 = arg1.method9274();
                            int var66 = arg1.method9478();
                            int var67 = var64 > 0 ? arg1.method9293() : var66;
                            var4.method2623(var63, field518, var64, var65, var66, var67);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("mn.kd(Lev;I)V")
    public static void method6149(class106 arg0) {
        arg0.field1221 = arg0.field1372.field2014;
        arg0.field1286 = arg0.field1372.field2041;
        arg0.field1226 = arg0.field1372.field2019;
        arg0.field1227 = arg0.field1372.field2034;
        arg0.field1228 = arg0.field1372.field2038;
        arg0.field1265 = arg0.field1372.field2020;
        arg0.field1223 = arg0.field1372.field2029;
        arg0.field1267 = arg0.field1372.field2015;
        arg0.field1280 = arg0.field1372.field2005;
        arg0.field1266 = arg0.field1372.field2039;
        arg0.field1291 = arg0.field1372.field2022;
        arg0.field1232 = arg0.field1372.field2023;
        arg0.field1233 = arg0.field1372.field2024;
        arg0.field1289 = arg0.field1372.field2025;
        arg0.field1225 = arg0.field1372.field2026;
        arg0.field1258 = arg0.field1372.field2027;
        arg0.field1237 = arg0.field1372.field2028;
    }

    @ObfuscatedName("hg.kw(Ldn;Ldv;IILkk;I)V")
    public static final void method3864(class104 arg0, class95 arg1, int arg2, int arg3, class276 arg4) {
        int var5 = arg1.field1288[0];
        int var6 = arg1.field1234[0];
        int var7 = arg1.method2530();
        class271 var8 = arg0.field1343[arg0.field1344];
        if (var5 < var7 || var5 >= var8.field3015 - var7 || var6 < var7 || var6 >= var8.field3011 - var7 || arg2 < var7 || arg2 >= var8.field3015 - var7 || arg3 < var7 || arg3 >= var8.field3011 - var7) {
            return;
        }
        int var9 = field796.method5402(var5, var6, arg1.method2530(), method6297(arg2, arg3), var8, true, field802, field507);
        if (var9 >= 1) {
            for (int var10 = 0; var10 < var9 - 1; var10++) {
                arg1.method2520(field802[var10], field507[var10], arg4);
            }
        }
    }

    @ObfuscatedName("nm.ks(III)Lke;")
    public static class273 method6297(int arg0, int arg1) {
        field770.field3031 = arg0;
        field770.field3033 = arg1;
        field770.field3030 = 1;
        field770.field3029 = 1;
        return field770;
    }

    @ObfuscatedName("ai.kv(B)V")
    public static void method15() {
        field561.field5601 = 0;
        field650 = false;
    }

    @ObfuscatedName("lo.kz(I)V")
    public static void method5810() {
        method15();
        field561.field5608[0] = -1;
        field561.field5604[0] = class383.field4426;
        field561.field5609[0] = "";
        field561.field5600[0] = 1006;
        field561.field5611[0] = false;
        field561.field5610[0] = null;
        field561.field5601 = 1;
    }

    @ObfuscatedName("ee.kc(III)V")
    public static final void method3192(int arg0, int arg1) {
        if (field561.field5601 < 2 && field659 == 0 && !field661 || !field696) {
            return;
        }
        int var2 = method6209();
        String var3;
        if (field659 == 1 && field561.field5601 < 2) {
            var3 = class383.field4346 + class383.field4357 + field660 + " " + class107.field1384;
        } else if (field661 && field561.field5601 < 2) {
            var3 = field664 + class383.field4357 + field513 + " " + class107.field1384;
        } else {
            var3 = field561.method9914(var2);
        }
        if (field561.field5601 > 2) {
            var3 = var3 + class107.method3870(16777215) + " " + '/' + " " + (field561.field5601 - 2) + class383.field4350;
        }
        Statics.field4047.method7945(var3, arg0 + 4, arg1 + 15, 16777215, 0, field518 / 1000);
    }

    @ObfuscatedName("cj.kp(I)Z")
    public static final boolean method2001() {
        return field650;
    }

    @ObfuscatedName("client.kb(I)V")
    public final void method1260() {
        method3908(field561);
        if (field678 != null) {
            return;
        }
        int var1 = class36.field197;
        if (field650) {
            if (var1 != 1 && (Statics.field1704 || var1 != 4) && !field561.method9966(class36.field195, class36.field198)) {
                field650 = false;
                field561.method9950();
            }
            if (var1 == 1 || !Statics.field1704 && var1 == 4) {
                field561.method9921(class36.field213, class36.field214);
                field650 = false;
                field561.method9950();
            }
        } else if (field561.field5601 > 0) {
            int var2 = method6209();
            if ((var1 == 1 || !Statics.field1704 && var1 == 4) && this.method1261(field561.field5600[var2], field561.field5611[var2])) {
                var1 = 2;
            }
            if (var1 == 1 || !Statics.field1704 && var1 == 4) {
                field561.method9954(var2);
            }
            if (var1 == 2) {
                this.method1262(class36.field213, class36.field214);
            }
        }
    }

    @ObfuscatedName("client.lu(IZI)Z")
    public final boolean method1261(int arg0, boolean arg1) {
        return (field620 && field561.field5601 > 2 || method3409(arg0)) && !arg1;
    }

    @ObfuscatedName("client.lf(III)V")
    public final void method1262(int arg0, int arg1) {
        field561.method9916(arg0, arg1);
        int var3 = arg0 - field709;
        int var4 = arg1 - field780;
        Iterator var5 = field684.iterator();
        while (var5.hasNext()) {
            class104 var6 = (class104) var5.next();
            var6.field1352.method4825(false);
        }
        field650 = true;
        field561.method9922();
    }

    @ObfuscatedName("fx.li(II)Z")
    public static final boolean method3409(int arg0) {
        if (arg0 >= 2000) {
            arg0 -= 2000;
        }
        return arg0 == 1007;
    }

    @ObfuscatedName("cg.lm(Lcr;III)V")
    public static final void method1197(class77 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method5396(arg0.field915, arg0.field909, arg0.field908, arg0.field911, arg0.field916, arg0.field913, arg0.field914, arg0.field912, arg1, arg2);
        }
    }

    @ObfuscatedName("kq.lh(IIIIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method5396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, String arg7, int arg8, int arg9) {
        class104 var10 = null;
        if (arg5 >= 0 && Statics.field2071.field1355[arg5] != null) {
            var10 = Statics.field2071.field1355[arg5].field5038;
        } else if (arg5 == -1) {
            var10 = Statics.field2071;
        }
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1347;
        int var12 = var10.field1348;
        class106[] var13 = var10.field1353;
        class95[] var14 = var10.field1357;
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 26) {
            method1192();
        }
        if (arg2 == 46) {
            class95 var15 = var14[arg3];
            if (var15 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var16 = class325.method2983(class323.field3361, field784.field1485);
                var16.field3433.method9470(field734.method5249(82) ? 1 : 0);
                var16.field3433.method9299(arg3);
                field784.method3070(var16);
            }
        }
        if (arg2 == 3) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var17 = class325.method2983(class323.field3322, field784.field1485);
            var17.field3433.method9297(arg0 + var11);
            var17.field3433.method9299(arg1 + var12);
            var17.field3433.method9470(field734.method5249(82) ? 1 : 0);
            var17.field3433.method9297(arg3);
            field784.method3070(var17);
        }
        if (arg2 == 29) {
            class325 var18 = class325.method2983(class323.field3348, field784.field1485);
            var18.field3433.method9244(arg1);
            field784.method3070(var18);
            class362 var19 = Statics.field4741.method6314(arg1);
            if (var19 != null && var19.field4010 != null && var19.field4010[0][0] == 5) {
                int var20 = var19.field4010[0][1];
                if (class350.field3773[var20] != var19.field4012[0]) {
                    class350.field3773[var20] = var19.field4012[0];
                    method6326(var20);
                }
            }
        }
        if (arg2 == 30 && field671 == null) {
            method6910(arg1, arg0);
            field671 = Statics.field4741.method6298(arg1, arg0);
            method2944(field671);
        }
        if (arg2 == 17) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var21 = class325.method2983(class323.field3400, field784.field1485);
            var21.field3433.method9257(arg0 + var11);
            var21.field3433.method9297(field663);
            var21.field3433.method9297(arg3);
            var21.field3433.method9297(arg1 + var12);
            var21.field3433.method9288(field734.method5249(82) ? 1 : 0);
            var21.field3433.method9314(Statics.field5047);
            var21.field3433.method9257(field662);
            field784.method3070(var21);
        }
        if (arg2 == 23) {
            if (field650) {
                var10.field1352.method4732();
            } else {
                var10.field1352.method4825(true);
            }
        }
        if (arg2 == 19) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var22 = class325.method2983(class323.field3313, field784.field1485);
            var22.field3433.method9297(arg3);
            var22.field3433.method9288(field734.method5249(82) ? 1 : 0);
            var22.field3433.method9297(arg1 + var12);
            var22.field3433.method9297(arg0 + var11);
            field784.method3070(var22);
        }
        if (arg2 == 50) {
            class95 var23 = var14[arg3];
            if (var23 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var24 = class325.method2983(class323.field3315, field784.field1485);
                var24.field3433.method9297(arg3);
                var24.field3433.method9470(field734.method5249(82) ? 1 : 0);
                field784.method3070(var24);
            }
        }
        if (arg2 == 16) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var25 = class325.method2983(class323.field3401, field784.field1485);
            var25.field3433.method9257(arg3);
            var25.field3433.method9253(field734.method5249(82) ? 1 : 0);
            var25.field3433.method9313(Statics.field499);
            var25.field3433.method9257(arg1 + var12);
            var25.field3433.method9298(Statics.field4144);
            var25.field3433.method9299(Statics.field1656);
            var25.field3433.method9257(arg0 + var11);
            field784.method3070(var25);
        }
        if (arg2 == 4) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var26 = class325.method2983(class323.field3407, field784.field1485);
            var26.field3433.method9241(field734.method5249(82) ? 1 : 0);
            var26.field3433.method9297(arg3);
            var26.field3433.method9298(arg0 + var11);
            var26.field3433.method9297(arg1 + var12);
            field784.method3070(var26);
        }
        if (arg2 == 14) {
            class95 var27 = var14[arg3];
            if (var27 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var28 = class325.method2983(class323.field3319, field784.field1485);
                var28.field3433.method9298(arg3);
                var28.field3433.method9288(field734.method5249(82) ? 1 : 0);
                var28.field3433.method9257(Statics.field4144);
                var28.field3433.method9257(Statics.field1656);
                var28.field3433.method9312(Statics.field499);
                field784.method3070(var28);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field472.method8788(arg2, arg3, new class351(arg0), new class351(arg1));
        }
        if (arg2 == 6) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var29 = class325.method2983(class323.field3374, field784.field1485);
            var29.field3433.method9298(arg1 + var12);
            var29.field3433.method9297(arg3);
            var29.field3433.method9241(field734.method5249(82) ? 1 : 0);
            var29.field3433.method9299(arg0 + var11);
            field784.method3070(var29);
        }
        if (arg2 == 18) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var30 = class325.method2983(class323.field3338, field784.field1485);
            var30.field3433.method9257(arg3);
            var30.field3433.method9241(field734.method5249(82) ? 1 : 0);
            var30.field3433.method9257(arg1 + var12);
            var30.field3433.method9257(arg0 + var11);
            field784.method3070(var30);
        }
        if (arg2 == 51) {
            class95 var31 = var14[arg3];
            if (var31 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var32 = class325.method2983(class323.field3356, field784.field1485);
                var32.field3433.method9253(field734.method5249(82) ? 1 : 0);
                var32.field3433.method9298(arg3);
                field784.method3070(var32);
            }
        }
        if (arg2 == 7) {
            class106 var33 = var13[arg3];
            if (var33 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var34 = class325.method2983(class323.field3411, field784.field1485);
                var34.field3433.method9297(arg3);
                var34.field3433.method9244(Statics.field499);
                var34.field3433.method9299(Statics.field1656);
                var34.field3433.method9253(field734.method5249(82) ? 1 : 0);
                var34.field3433.method9257(Statics.field4144);
                field784.method3070(var34);
            }
        }
        if (arg2 == 1) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var35 = class325.method2983(class323.field3333, field784.field1485);
            var35.field3433.method9297(Statics.field4144);
            var35.field3433.method9298(arg0 + var11);
            var35.field3433.method9257(arg1 + var12);
            var35.field3433.method9299(arg3);
            var35.field3433.method9244(Statics.field499);
            var35.field3433.method9298(Statics.field1656);
            var35.field3433.method9288(field734.method5249(82) ? 1 : 0);
            field784.method3070(var35);
        }
        if (arg2 == 1001) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var36 = class325.method2983(class323.field3359, field784.field1485);
            var36.field3433.method9299(arg0 + var11);
            var36.field3433.method9470(field734.method5249(82) ? 1 : 0);
            var36.field3433.method9299(arg3);
            var36.field3433.method9257(arg1 + var12);
            field784.method3070(var36);
        }
        if (arg2 == 58) {
            class362 var37 = Statics.field4741.method6298(arg1, arg0);
            if (var37 != null) {
                if (var37.field3919 != null) {
                    class91 var38 = new class91();
                    var38.field1101 = var37;
                    var38.field1102 = arg3;
                    var38.field1100 = arg7;
                    var38.field1103 = var37.field3919;
                    class73.method8429(var38);
                }
                class325 var39 = class325.method2983(class323.field3377, field784.field1485);
                var39.field3433.method9299(arg4);
                var39.field3433.method9299(arg0);
                var39.field3433.method9297(field663);
                var39.field3433.method9314(arg1);
                var39.field3433.method9244(Statics.field5047);
                var39.field3433.method9298(field662);
                field784.method3070(var39);
            }
        }
        if (arg2 == 5) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var40 = class325.method2983(class323.field3352, field784.field1485);
            var40.field3433.method9253(field734.method5249(82) ? 1 : 0);
            var40.field3433.method9298(arg3);
            var40.field3433.method9298(arg1 + var12);
            var40.field3433.method9299(arg0 + var11);
            field784.method3070(var40);
        }
        if (arg2 == 12) {
            class106 var41 = var13[arg3];
            if (var41 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var42 = class325.method2983(class323.field3320, field784.field1485);
                var42.field3433.method9298(arg3);
                var42.field3433.method9288(field734.method5249(82) ? 1 : 0);
                field784.method3070(var42);
            }
        }
        if (arg2 == 2) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var43 = class325.method2983(class323.field3364, field784.field1485);
            var43.field3433.method9298(arg0 + var11);
            var43.field3433.method9297(arg1 + var12);
            var43.field3433.method9312(Statics.field5047);
            var43.field3433.method9253(field734.method5249(82) ? 1 : 0);
            var43.field3433.method9299(field663);
            var43.field3433.method9299(arg3);
            var43.field3433.method9299(field662);
            field784.method3070(var43);
        }
        if (arg2 == 20) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var44 = class325.method2983(class323.field3412, field784.field1485);
            var44.field3433.method9299(arg3);
            var44.field3433.method9288(field734.method5249(82) ? 1 : 0);
            var44.field3433.method9298(arg1 + var12);
            var44.field3433.method9297(arg0 + var11);
            field784.method3070(var44);
        }
        if (arg2 == 9) {
            class106 var45 = var13[arg3];
            if (var45 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var46 = class325.method2983(class323.field3394, field784.field1485);
                var46.field3433.method9241(field734.method5249(82) ? 1 : 0);
                var46.field3433.method9257(arg3);
                field784.method3070(var46);
            }
        }
        if (arg2 == 47) {
            class95 var47 = var14[arg3];
            if (var47 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var48 = class325.method2983(class323.field3404, field784.field1485);
                var48.field3433.method9470(field734.method5249(82) ? 1 : 0);
                var48.field3433.method9299(arg3);
                field784.method3070(var48);
            }
        }
        if (arg2 == 21) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var49 = class325.method2983(class323.field3392, field784.field1485);
            var49.field3433.method9297(arg1 + var12);
            var49.field3433.method9470(field734.method5249(82) ? 1 : 0);
            var49.field3433.method9298(arg0 + var11);
            var49.field3433.method9297(arg3);
            field784.method3070(var49);
        }
        if (arg2 == 44) {
            class95 var50 = var14[arg3];
            if (var50 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var51 = class325.method2983(class323.field3353, field784.field1485);
                var51.field3433.method9299(arg3);
                var51.field3433.method9470(field734.method5249(82) ? 1 : 0);
                field784.method3070(var51);
            }
        }
        if (arg2 == 24) {
            class362 var52 = Statics.field4741.method6314(arg1);
            if (var52 != null) {
                boolean var53 = true;
                if (var52.field3883 > 0) {
                    var53 = method5277(var52);
                }
                if (var53) {
                    class325 var54 = class325.method2983(class323.field3348, field784.field1485);
                    var54.field3433.method9244(arg1);
                    field784.method3070(var54);
                }
            }
        }
        if (arg2 == 60) {
            field623 = arg8;
            field624 = arg9;
            field626 = 1;
            field625 = 0;
            class325 var55 = class325.method2983(class323.field3334, field784.field1485);
            var55.field3433.method9253(arg3);
            field784.method3070(var55);
        }
        if (arg2 == 10) {
            class106 var56 = var13[arg3];
            if (var56 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var57 = class325.method2983(class323.field3373, field784.field1485);
                var57.field3433.method9241(field734.method5249(82) ? 1 : 0);
                var57.field3433.method9297(arg3);
                field784.method3070(var57);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class362 var58 = Statics.field4741.method6298(arg1, arg0);
            if (var58 != null) {
                method3367(arg3, arg1, arg0, arg4, arg7);
            }
        }
        if (arg2 == 22) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            field747 = arg0;
            field748 = arg1;
            class325 var59 = class325.method2983(class323.field3342, field784.field1485);
            var59.field3433.method9257(arg3);
            var59.field3433.method9297(arg1 + var12);
            var59.field3433.method9299(arg0 + var11);
            var59.field3433.method9288(field734.method5249(82) ? 1 : 0);
            field784.method3070(var59);
        }
        if (arg2 == 1004) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            class325 var60 = class325.method2983(class323.field3326, field784.field1485);
            var60.field3433.method9297(arg3);
            var60.field3433.method9298(arg1 + var12);
            var60.field3433.method9297(arg0 + var11);
            field784.method3070(var60);
        }
        if (arg2 == 11) {
            class106 var61 = var13[arg3];
            if (var61 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var62 = class325.method2983(class323.field3346, field784.field1485);
                var62.field3433.method9241(field734.method5249(82) ? 1 : 0);
                var62.field3433.method9257(arg3);
                field784.method3070(var62);
            }
        }
        if (arg2 == 49) {
            class95 var63 = var14[arg3];
            if (var63 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var64 = class325.method2983(class323.field3391, field784.field1485);
                var64.field3433.method9257(arg3);
                var64.field3433.method9288(field734.method5249(82) ? 1 : 0);
                field784.method3070(var64);
            }
        }
        if (arg2 == 13) {
            class106 var65 = var13[arg3];
            if (var65 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var66 = class325.method2983(class323.field3376, field784.field1485);
                var66.field3433.method9288(field734.method5249(82) ? 1 : 0);
                var66.field3433.method9299(arg3);
                field784.method3070(var66);
            }
        }
        if (arg2 == 8) {
            class106 var67 = var13[arg3];
            if (var67 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var68 = class325.method2983(class323.field3343, field784.field1485);
                var68.field3433.method9253(field734.method5249(82) ? 1 : 0);
                var68.field3433.method9297(field662);
                var68.field3433.method9244(Statics.field5047);
                var68.field3433.method9299(arg3);
                var68.field3433.method9299(field663);
                field784.method3070(var68);
            }
        }
        if (arg2 == 48) {
            class95 var69 = var14[arg3];
            if (var69 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var70 = class325.method2983(class323.field3365, field784.field1485);
                var70.field3433.method9299(arg3);
                var70.field3433.method9470(field734.method5249(82) ? 1 : 0);
                field784.method3070(var70);
            }
        }
        if (arg2 == 15) {
            class95 var71 = var14[arg3];
            if (var71 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var72 = class325.method2983(class323.field3385, field784.field1485);
                var72.field3433.method9312(Statics.field5047);
                var72.field3433.method9298(arg3);
                var72.field3433.method9257(field662);
                var72.field3433.method9257(field663);
                var72.field3433.method9241(field734.method5249(82) ? 1 : 0);
                field784.method3070(var72);
            }
        }
        if (arg2 == 1003) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            class106 var73 = var13[arg3];
            if (var73 != null) {
                class195 var74 = var73.field1372;
                if (var74.field2042 != null) {
                    var74 = var74.method3733();
                }
                if (var74 != null) {
                    class325 var75 = class325.method2983(class323.field3325, field784.field1485);
                    var75.field3433.method9257(var74.field2009);
                    field784.method3070(var75);
                }
            }
        }
        if (arg2 == 28) {
            class325 var76 = class325.method2983(class323.field3348, field784.field1485);
            var76.field3433.method9244(arg1);
            field784.method3070(var76);
            class362 var77 = Statics.field4741.method6314(arg1);
            if (var77 != null && var77.field4010 != null && var77.field4010[0][0] == 5) {
                int var78 = var77.field4010[0][1];
                class350.field3773[var78] = 1 - class350.field3773[var78];
                method6326(var78);
            }
        }
        if (arg2 == 45) {
            class95 var79 = var14[arg3];
            if (var79 != null) {
                field623 = arg8;
                field624 = arg9;
                field626 = 2;
                field625 = 0;
                field747 = arg0;
                field748 = arg1;
                class325 var80 = class325.method2983(class323.field3396, field784.field1485);
                var80.field3433.method9257(arg3);
                var80.field3433.method9288(field734.method5249(82) ? 1 : 0);
                field784.method3070(var80);
            }
        }
        if (arg2 == 1002) {
            field623 = arg8;
            field624 = arg9;
            field626 = 2;
            field625 = 0;
            class325 var81 = class325.method2983(class323.field3390, field784.field1485);
            var81.field3433.method9297(arg3);
            field784.method3070(var81);
        }
        if (arg2 != 25) {
            if (field659 != 0) {
                field659 = 0;
                method2944(Statics.field4741.method6314(Statics.field499));
            }
            if (field661) {
                method7231();
            }
            return;
        }
        class362 var82 = Statics.field4741.method6298(arg1, arg0);
        if (var82 == null) {
            return;
        }
        method7231();
        method2505(arg1, arg0, Statics.method2504(Statics.method3563(var82)), arg4);
        field659 = 0;
        field664 = method4322(var82);
        if (field664 == null) {
            field664 = class383.field4405;
        }
        if (var82.field3929) {
            field513 = var82.field4028 + class107.method3870(16777215);
        } else {
            field513 = class107.method3870(65280) + var82.field4014 + class107.method3870(16777215);
        }
    }

    @ObfuscatedName("fl.lw(ILjava/lang/String;I)V")
    public static void method3339(int arg0, String arg1) {
        int var2 = field583.field1426;
        int[] var3 = field583.field1427;
        boolean var4 = false;
        class581 var5 = new class581(arg1, Statics.field3276);
        for (int var6 = 0; var6 < var2; var6++) {
            class95 var7 = Statics.field3772.field1146.field1357[var3[var6]];
            if (var7 != null && Statics.field3772 != var7 && var7.field1141 != null && var7.field1141.equals(var5)) {
                if (arg0 == 1) {
                    class325 var8 = class325.method2983(class323.field3353, field784.field1485);
                    var8.field3433.method9299(var3[var6]);
                    var8.field3433.method9470(0);
                    field784.method3070(var8);
                } else if (arg0 == 4) {
                    class325 var9 = class325.method2983(class323.field3404, field784.field1485);
                    var9.field3433.method9470(0);
                    var9.field3433.method9299(var3[var6]);
                    field784.method3070(var9);
                } else if (arg0 == 6) {
                    class325 var10 = class325.method2983(class323.field3391, field784.field1485);
                    var10.field3433.method9257(var3[var6]);
                    var10.field3433.method9288(0);
                    field784.method3070(var10);
                } else if (arg0 == 7) {
                    class325 var11 = class325.method2983(class323.field3315, field784.field1485);
                    var11.field3433.method9297(var3[var6]);
                    var11.field3433.method9470(0);
                    field784.method3070(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            Statics.method7725(4, "", class383.field4272 + arg1);
        }
    }

    @ObfuscatedName("db.lg(IIIII)V")
    public static void method2505(int arg0, int arg1, int arg2, int arg3) {
        class362 var4 = Statics.field4741.method6298(arg0, arg1);
        if (var4 != null && var4.field3983 != null) {
            class91 var5 = new class91();
            var5.field1101 = var4;
            var5.field1103 = var4.field3983;
            class73.method8429(var5);
        }
        field663 = arg3;
        field661 = true;
        Statics.field5047 = arg0;
        field662 = arg1;
        Statics.field4106 = arg2;
        method2944(var4);
    }

    @ObfuscatedName("pa.lk(I)V")
    public static void method7231() {
        if (!field661) {
            return;
        }
        class362 var0 = Statics.field4741.method6298(Statics.field5047, field662);
        if (var0 != null && var0.field3925 != null) {
            class91 var1 = new class91();
            var1.field1101 = var0;
            var1.field1103 = var0.field3925;
            class73.method8429(var1);
        }
        field663 = -1;
        field661 = false;
        method2944(var0);
    }

    @ObfuscatedName("os.ls(III)V")
    public static void method6910(int arg0, int arg1) {
        class325 var2 = class325.method2983(class323.field3355, field784.field1485);
        var2.field3433.method9313(arg0);
        var2.field3433.method9257(arg1);
        field784.method3070(var2);
    }

    @ObfuscatedName("fr.lr(IIIILjava/lang/String;B)V")
    public static void method3367(int arg0, int arg1, int arg2, int arg3, String arg4) {
        int var5 = arg0 >>> 16;
        int var6 = arg0 & 0xFFFF;
        class362 var7 = Statics.field4741.method6298(arg1, arg2);
        if (var7 == null) {
            return;
        }
        if (var7.field3890 != null) {
            class91 var8 = new class91();
            var8.field1101 = var7;
            var8.field1102 = var6;
            var8.field1104 = var5;
            var8.field1100 = arg4;
            var8.field1103 = var7.field3890;
            class73.method8429(var8);
        }
        boolean var9 = true;
        if (var7.field3883 > 0) {
            var9 = method5277(var7);
        }
        if (!var9 || !class363.method8570(Statics.method3563(var7), var6 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class325 var10 = class325.method2983(class323.field3381, field784.field1485);
            var10.field3433.method9244(arg1);
            var10.field3433.method9257(arg2);
            var10.field3433.method9257(arg3);
            field784.method3070(var10);
        }
        if (arg0 == 2) {
            class325 var11 = class325.method2983(class323.field3329, field784.field1485);
            var11.field3433.method9244(arg1);
            var11.field3433.method9257(arg2);
            var11.field3433.method9257(arg3);
            field784.method3070(var11);
        }
        if (arg0 == 3) {
            class325 var12 = class325.method2983(class323.field3330, field784.field1485);
            var12.field3433.method9244(arg1);
            var12.field3433.method9257(arg2);
            var12.field3433.method9257(arg3);
            field784.method3070(var12);
        }
        if (arg0 == 4) {
            class325 var13 = class325.method2983(class323.field3347, field784.field1485);
            var13.field3433.method9244(arg1);
            var13.field3433.method9257(arg2);
            var13.field3433.method9257(arg3);
            field784.method3070(var13);
        }
        if (arg0 == 5) {
            class325 var14 = class325.method2983(class323.field3363, field784.field1485);
            var14.field3433.method9244(arg1);
            var14.field3433.method9257(arg2);
            var14.field3433.method9257(arg3);
            field784.method3070(var14);
        }
        if (arg0 == 6) {
            class325 var15 = class325.method2983(class323.field3368, field784.field1485);
            var15.field3433.method9244(arg1);
            var15.field3433.method9257(arg2);
            var15.field3433.method9257(arg3);
            field784.method3070(var15);
        }
        if (arg0 == 7) {
            class325 var16 = class325.method2983(class323.field3358, field784.field1485);
            var16.field3433.method9244(arg1);
            var16.field3433.method9257(arg2);
            var16.field3433.method9257(arg3);
            field784.method3070(var16);
        }
        if (arg0 == 8) {
            class325 var17 = class325.method2983(class323.field3335, field784.field1485);
            var17.field3433.method9244(arg1);
            var17.field3433.method9257(arg2);
            var17.field3433.method9257(arg3);
            field784.method3070(var17);
        }
        if (arg0 == 9) {
            class325 var18 = class325.method2983(class323.field3402, field784.field1485);
            var18.field3433.method9244(arg1);
            var18.field3433.method9257(arg2);
            var18.field3433.method9257(arg3);
            field784.method3070(var18);
        }
        if (arg0 == 10) {
            class325 var19 = class325.method2983(class323.field3405, field784.field1485);
            var19.field3433.method9244(arg1);
            var19.field3433.method9257(arg2);
            var19.field3433.method9257(arg3);
            field784.method3070(var19);
        }
        if (var5 == 0) {
            return;
        }
        class325 var20 = class325.method2983(class323.field3345, field784.field1485);
        var20.field3433.method9244(arg1);
        var20.field3433.method9257(arg2);
        var20.field3433.method9257(arg3);
        var20.field3433.method9241(var6);
        var20.field3433.method9241(var5 - 1);
        field784.method3070(var20);
    }

    @ObfuscatedName("hb.ld(Lww;I)V")
    public static final void method3908(class577 arg0) {
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < arg0.field5601 - 1; var2++) {
                if (arg0.field5600[var2] < 1000 && arg0.field5600[var2 + 1] > 1000) {
                    String var3 = arg0.field5609[var2];
                    arg0.field5609[var2] = arg0.field5609[var2 + 1];
                    arg0.field5609[var2 + 1] = var3;
                    String var4 = arg0.field5604[var2];
                    arg0.field5604[var2] = arg0.field5604[var2 + 1];
                    arg0.field5604[var2 + 1] = var4;
                    class577 var5 = arg0.field5610[var2];
                    arg0.field5610[var2] = arg0.field5610[var2 + 1];
                    arg0.field5610[var2 + 1] = var5;
                    int var6 = arg0.field5600[var2];
                    arg0.field5600[var2] = arg0.field5600[var2 + 1];
                    arg0.field5600[var2 + 1] = var6;
                    int var7 = arg0.field5602[var2];
                    arg0.field5602[var2] = arg0.field5602[var2 + 1];
                    arg0.field5602[var2 + 1] = var7;
                    int var8 = arg0.field5612[var2];
                    arg0.field5612[var2] = arg0.field5612[var2 + 1];
                    arg0.field5612[var2 + 1] = var8;
                    int var9 = arg0.field5605[var2];
                    arg0.field5605[var2] = arg0.field5605[var2 + 1];
                    arg0.field5605[var2 + 1] = var9;
                    int var10 = arg0.field5606[var2];
                    arg0.field5606[var2] = arg0.field5606[var2 + 1];
                    arg0.field5606[var2 + 1] = var10;
                    int var11 = arg0.field5608[var2];
                    arg0.field5608[var2] = arg0.field5608[var2 + 1];
                    arg0.field5608[var2 + 1] = var11;
                    boolean var12 = arg0.field5611[var2];
                    arg0.field5611[var2] = arg0.field5611[var2 + 1];
                    arg0.field5611[var2 + 1] = var12;
                    var1 = false;
                }
            }
        }
    }

    @ObfuscatedName("on.lp(Ljava/lang/String;Ljava/lang/String;IIIII)I")
    public static final int method6901(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        return method173(arg0, arg1, arg2, arg3, arg4, arg5, -1, false, -1);
    }

    @ObfuscatedName("pv.ly(Ljava/lang/String;Ljava/lang/String;IIIIII)I")
    public static final int method7156(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        return method173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false, -1);
    }

    @ObfuscatedName("ar.lo(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I")
    public static final int method173(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (field650) {
            return -1;
        } else if (method1107(arg8, arg2)) {
            return field561.method9951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        } else {
            return -1;
        }
    }

    @ObfuscatedName("kk.lb(ILjava/lang/String;Ljava/lang/String;IIIIIII)V")
    public static final void method5388(int arg0, String arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!field650 && method1107(arg8, arg3) && arg0 >= 0 && arg0 < field561.field5610.length) {
            if (field561.field5610[arg0] == null) {
                field561.field5610[arg0] = new class577(false);
            }
            field561.field5610[arg0].method9951(arg1, arg2, arg3, arg4, arg5, arg6, arg7, false, arg8);
        }
    }

    @ObfuscatedName("co.lt(IIB)Z")
    public static boolean method1107(int arg0, int arg1) {
        int var2 = arg1;
        if (arg1 >= 2000) {
            var2 = arg1 - 2000;
        }
        boolean var3 = Statics.field2459 == arg0 || arg0 == -1;
        if (!var3) {
            boolean var4 = var2 == 2 || var2 == 8 || var2 == 25 || var2 == 17 || var2 == 25;
            var3 = var4;
        }
        boolean var5 = var3;
        if (!var3) {
            boolean var6 = var2 == 14 || var2 == 15 || var2 >= 44 && var2 <= 51;
            var5 = var6;
        }
        boolean var7 = var5;
        if (!var5) {
            boolean var8 = var2 == 1002 || var2 == 1003 || var2 == 1004;
            var7 = var8;
        }
        if (!var7) {
            return false;
        }
        boolean var10 = arg1 == 14 || arg1 == 15 || arg1 >= 44 && arg1 <= 51;
        boolean var11 = var10;
        if (!var10) {
            boolean var12 = arg1 == 1 || arg1 == 2 || arg1 >= 3 && arg1 <= 6 || arg1 == 1001;
            var11 = var12;
        }
        boolean var13 = var11;
        if (!var11) {
            boolean var14 = arg1 == 7 || arg1 == 8 || arg1 >= 9 && arg1 <= 13;
            var13 = var14;
        }
        boolean var15 = var13;
        if (!var13) {
            boolean var16 = arg1 == 16 || arg1 == 17 || arg1 >= 18 && arg1 <= 22;
            var15 = var16;
        }
        boolean var17 = var15;
        if (!var15) {
            boolean var18 = arg1 == 1002 || arg1 == 1003 || arg1 == 1004;
            var17 = var18;
        }
        if (var17) {
            class492 var20 = field684.method2582(arg0);
            if (class492.field5087 == var20) {
                return false;
            }
            if (class492.field5086 == var20) {
                boolean var21 = arg1 == 1002 || arg1 == 1003 || arg1 == 1004;
                if (!var21) {
                    return false;
                }
            }
        }
        return true;
    }

    @ObfuscatedName("nt.lx(I)I")
    public static final int method6209() {
        return field561.field5601 - 1;
    }

    @ObfuscatedName("gf.lc(IIIII)V")
    public static final void method3525(int arg0, int arg1, int arg2, int arg3) {
        if (field659 == 0 && !field661) {
            int var4 = arg0 - arg2;
            int var5 = arg1 - arg3;
            int[] var6 = new int[field684.method2577()];
            float[] var7 = new float[field684.method2577()];
            int var8 = 0;
            Iterator var9 = field684.iterator();
            while (var9.hasNext()) {
                class104 var10 = (class104) var9.next();
                var6[var8] = var10.field1354;
                var7[var8] = var10.field1352.field2687;
                var8++;
            }
            class552.method3604(var7, var6);
            HashMap var11 = new HashMap();
            for (int var12 = var6.length - 1; var12 >= 0; var12--) {
                if (var7[var12] > 0.0F) {
                    class493 var13 = field684.method2581(var6[var12]);
                    if (!var11.containsKey(var13)) {
                        var11.put(var13, var6[var12]);
                    }
                }
            }
            for (int var14 = 0; var14 < var6.length; var14++) {
                int var15 = var6[var14];
                class493 var16 = field684.method2581(var15);
                Integer var17 = (Integer) var11.get(var16);
                if (var17 != null && var17.equals(var15)) {
                    if (class493.field5090 == var16) {
                        method173(class383.field4351, "", 23, 0, var4, var5, 0, false, var15);
                    } else if (class493.field5095 == var16) {
                        int var18 = method1164(Statics.field2071, Statics.field194.method1225(), Statics.field194.method1223(), Statics.field194.method1221());
                        class427 var19 = class427.method1235((float) Statics.field194.method1225(), (float) var18, (float) Statics.field194.method1223());
                        class427 var20 = class257.method3586(var18, Statics.field65, Statics.field2297, Statics.field4526);
                        if (var20 != null) {
                            class427[] var21 = class427.field4769;
                            class427 var22;
                            synchronized (class427.field4769) {
                                if (class427.field4771 == 0) {
                                    var22 = new class427(var20);
                                } else {
                                    class427.field4769[--class427.field4771].method7535(var20);
                                    var22 = class427.field4769[class427.field4771];
                                }
                            }
                            var22.method7562(var19);
                            class427 var27 = class427.field4774;
                            class427[] var28 = class427.field4769;
                            class427 var29;
                            synchronized (class427.field4769) {
                                if (class427.field4771 == 0) {
                                    var29 = new class427(var27);
                                } else {
                                    class427.field4769[--class427.field4771].method7535(var27);
                                    var29 = class427.field4769[class427.field4771];
                                }
                            }
                            var29.method7541(var22);
                            class427 var34 = class427.field4768;
                            float var35 = var29.method7542(var34);
                            class427 var37 = class427.field4774;
                            float var38 = var37.method7542(var22);
                            float var39 = (float) Math.atan2((double) var35, (double) var38);
                            int var40 = class508.method327(var39);
                            int var97 = var40 + 64;
                            int var41 = (var97 & 0x7FF) / 128;
                            method173(class383.field4352, "", 60, var41, 0, 0, 0, false, var15);
                            var22.method7534();
                            var29.method7534();
                            var20.method7534();
                        }
                    }
                }
            }
        }
        long var42 = -1L;
        int var44 = 0;
        long var45 = -1L;
        for (int var47 = 0; var47 < class257.method8659(); var47++) {
            long var48 = class257.field2900[var47];
            if (var45 != var48) {
                var45 = var48;
                int var52 = class257.method3583(var47);
                long var53 = class257.field2900[var47];
                int var55 = (int) (var53 >>> 7 & 0x7FL);
                int var57 = var55;
                int var58 = class257.method8056(var47);
                int var59 = class257.method5896(class257.field2900[var47]);
                int var60 = var59;
                int var61 = class257.method5850(var47);
                if (var61 == 2047) {
                    var61 = -1;
                }
                class481 var62 = null;
                class104 var63 = null;
                if (var61 >= 0 && Statics.field2071.field1355[var61] != null) {
                    var62 = Statics.field2071.field1355[var61];
                    var63 = var62.field5038;
                } else if (var61 == -1) {
                    var62 = null;
                    var63 = Statics.field2071;
                }
                if (var63 != null) {
                    int var64 = method3689(var61, var62, var63);
                    if (var64 != -1) {
                        if (var58 == 2 && var63.field1352.method4776(var64, var52, var55, var48) >= 0) {
                            class210 var65 = class210.method3109(var59);
                            if (var65.field2178 != null) {
                                var65 = var65.method3968();
                            }
                            if (var65 == null) {
                                continue;
                            }
                            class99 var66 = null;
                            for (class99 var67 = (class99) var63.field1341.method7247(); var67 != null; var67 = (class99) var63.field1341.method7249()) {
                                if (var67.field1206 == var64 && var67.field1199 == var52 && var67.field1202 == var57 && var67.field1201 == var60) {
                                    var66 = var67;
                                    break;
                                }
                            }
                            if (!Statics.field1697 && field659 == 1) {
                                method173(class383.field4346, field660 + " " + class107.field1384 + " " + class107.method3870(65535) + var65.field2182, 1, var60, var52, var57, -1, false, var61);
                            } else if (!field661) {
                                String[] var68 = var65.field2199;
                                if (var68 != null) {
                                    for (int var69 = 4; var69 >= 0; var69--) {
                                        if (!Statics.field1697 && (var66 == null || var66.method2610(var69)) && var68[var69] != null) {
                                            short var70 = 0;
                                            if (var69 == 0) {
                                                var70 = 3;
                                            }
                                            if (var69 == 1) {
                                                var70 = 4;
                                            }
                                            if (var69 == 2) {
                                                var70 = 5;
                                            }
                                            if (var69 == 3) {
                                                var70 = 6;
                                            }
                                            if (var69 == 4) {
                                                var70 = 1001;
                                            }
                                            method173(var68[var69], class107.method3870(65535) + var65.field2182, var70, var60, var52, var57, -1, false, var61);
                                        }
                                    }
                                }
                                method173(class383.field4347, class107.method3870(65535) + var65.field2182, 1002, var65.field2179, var52, var57, -1, false, var61);
                            } else if (!Statics.field1697 && (Statics.field4106 & 0x4) == 4) {
                                method173(field664, field513 + " " + class107.field1384 + " " + class107.method3870(65535) + var65.field2182, 2, var60, var52, var57, -1, false, var61);
                            }
                        }
                        if (var58 == 1) {
                            class106 var71 = var63.field1353[var60];
                            if (var71 == null) {
                                continue;
                            }
                            if (var71.field1372.field2014 == 1 && (var71.field1247 & 0x7F) == 64 && (var71.field1270 & 0x7F) == 64) {
                                for (int var72 = 0; var72 < var63.field1360; var72++) {
                                    class106 var73 = var63.field1353[var63.field1342[var72]];
                                    if (var73 != null && var71 != var73 && var73.field1372.field2014 == 1 && var71.field1247 == var73.field1247 && var71.field1270 == var73.field1270) {
                                        method3783(var73, var63.field1342[var72], var52, var57, var61);
                                    }
                                }
                                int var74 = field583.field1426;
                                int[] var75 = field583.field1427;
                                for (int var76 = 0; var76 < var74; var76++) {
                                    class95 var77 = var63.field1357[var75[var76]];
                                    if (var77 != null && var71.field1247 == var77.field1247 && var71.field1270 == var77.field1270) {
                                        method3206(var77, var75[var76], var52, var57, var61);
                                    }
                                }
                            }
                            method3783(var71, var60, var52, var57, var61);
                        }
                        if (var58 == 0) {
                            class95 var78 = var63.field1357[var60];
                            if (var78 == null) {
                                continue;
                            }
                            if ((var78.field1247 & 0x7F) == 64 && (var78.field1270 & 0x7F) == 64) {
                                for (int var79 = 0; var79 < var63.field1360; var79++) {
                                    class106 var80 = var63.field1353[var63.field1342[var79]];
                                    if (var80 != null && var80.field1372.field2014 == 1 && var78.field1247 == var80.field1247 && var78.field1270 == var80.field1270) {
                                        method3783(var80, var63.field1342[var79], var52, var57, var61);
                                    }
                                }
                                int var81 = field583.field1426;
                                int[] var82 = field583.field1427;
                                for (int var83 = 0; var83 < var81; var83++) {
                                    class95 var84 = var63.field1357[var82[var83]];
                                    if (var84 != null && var78 != var84 && var78.field1247 == var84.field1247 && var78.field1270 == var84.field1270) {
                                        method3206(var84, var82[var83], var52, var57, var61);
                                    }
                                }
                            }
                            if (field644 == var60) {
                                var42 = var48;
                                var44 = var61;
                            } else {
                                method3206(var78, var60, var52, var57, var61);
                            }
                        }
                        if (var58 == 3) {
                            class411 var85 = var63.field1359[var64][var52][var57];
                            if (var85 != null) {
                                for (class110 var86 = (class110) var85.method7262(); var86 != null; var86 = (class110) var85.method7273()) {
                                    class211 var87 = class211.method7530(var86.field1411);
                                    if (!Statics.field3217 && field659 == 1) {
                                        method173(class383.field4346, field660 + " " + class107.field1384 + " " + class107.method3870(16748608) + var87.field2282, 16, var86.field1411, var52, var57, -1, false, var61);
                                    } else if (!field661) {
                                        String[] var88 = var87.field2238;
                                        for (int var89 = 4; var89 >= 0; var89--) {
                                            if (!Statics.field3217 && var86.method2928(var89)) {
                                                if (var88 != null && var88[var89] != null) {
                                                    byte var90 = 0;
                                                    if (var89 == 0) {
                                                        var90 = 18;
                                                    }
                                                    if (var89 == 1) {
                                                        var90 = 19;
                                                    }
                                                    if (var89 == 2) {
                                                        var90 = 20;
                                                    }
                                                    if (var89 == 3) {
                                                        var90 = 21;
                                                    }
                                                    if (var89 == 4) {
                                                        var90 = 22;
                                                    }
                                                    method173(var88[var89], class107.method3870(16748608) + var87.field2282, var90, var86.field1411, var52, var57, -1, false, var61);
                                                } else if (var89 == 2) {
                                                    method173(class383.field4181, class107.method3870(16748608) + var87.field2282, 20, var86.field1411, var52, var57, -1, false, var61);
                                                }
                                            }
                                        }
                                        method173(class383.field4347, class107.method3870(16748608) + var87.field2282, 1004, var86.field1411, var52, var57, -1, false, var61);
                                    } else if (!Statics.field3217 && (Statics.field4106 & 0x1) == 1) {
                                        method173(field664, field513 + " " + class107.field1384 + " " + class107.method3870(16748608) + var87.field2282, 17, var86.field1411, var52, var57, -1, false, var61);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var42 != -1L) {
            int var91 = class257.method3216(var42);
            int var92 = (int) (var42 >>> 7 & 0x7FL);
            class95 var94 = Statics.field2071.field1357[field644];
            method3206(var94, field644, var91, var92, var44);
        }
    }

    @ObfuscatedName("ha.lv(ILso;Ldn;I)I")
    public static int method3689(int arg0, class481 arg1, class104 arg2) {
        int var3 = -1;
        if (Statics.field2459 == arg0) {
            var3 = arg2.field1344;
        } else if (Statics.field2459 == -1) {
            var3 = arg1.field5032;
        } else {
            class481 var4 = Statics.field2071.field1355[Statics.field2459];
            class104 var5 = var4.field5038;
            if (var4.field5032 == var5.field1344) {
                if (arg0 == -1) {
                    var3 = Statics.field2071.field1355[Statics.field2459].method1221();
                } else {
                    var3 = arg1.field5032;
                }
            }
        }
        return var3;
    }

    @ObfuscatedName("hy.lq(Lev;IIIIB)V")
    public static final void method3783(class106 arg0, int arg1, int arg2, int arg3, int arg4) {
        class195 var5 = arg0.field1372;
        if (field561.field5601 >= 400) {
            return;
        }
        if (var5.field2042 != null) {
            var5 = var5.method3733();
        }
        if (var5 == null || !var5.field2016 || var5.field2047 && field675 != arg1) {
            return;
        }
        String var6 = arg0.method2857();
        if (var5.field2035 != 0 && arg0.field1293 != 0) {
            int var7 = arg0.field1293 == -1 ? var5.field2035 : arg0.field1293;
            int var9 = Statics.field3772.field1164;
            int var10 = var9 - var7;
            String var11;
            if (var10 < -9) {
                var11 = class107.method3870(16711680);
            } else if (var10 < -6) {
                var11 = class107.method3870(16723968);
            } else if (var10 < -3) {
                var11 = class107.method3870(16740352);
            } else if (var10 < 0) {
                var11 = class107.method3870(16756736);
            } else if (var10 > 9) {
                var11 = class107.method3870(65280);
            } else if (var10 > 6) {
                var11 = class107.method3870(4259584);
            } else if (var10 > 3) {
                var11 = class107.method3870(8453888);
            } else if (var10 > 0) {
                var11 = class107.method3870(12648192);
            } else {
                var11 = class107.method3870(16776960);
            }
            var6 = var6 + var11 + " " + class107.field1379 + class383.field4382 + var7 + class107.field1383;
        }
        if (var5.field2048 && field578) {
            method173(class383.field4347, class107.method3870(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
        }
        if (!Statics.field1856 && field659 == 1) {
            method173(class383.field4346, field660 + " " + class107.field1384 + " " + class107.method3870(16776960) + var6, 7, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field661) {
            int var12 = var5.field2048 && field578 ? 2000 : 0;
            String[] var13 = var5.field2033;
            if (var13 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (!Statics.field1856 && arg0.method2874(var14) && var13[var14] != null && !var13[var14].equalsIgnoreCase(class383.field4348)) {
                        int var15 = 0;
                        if (var14 == 0) {
                            var15 = var12 + 9;
                        }
                        if (var14 == 1) {
                            var15 = var12 + 10;
                        }
                        if (var14 == 2) {
                            var15 = var12 + 11;
                        }
                        if (var14 == 3) {
                            var15 = var12 + 12;
                        }
                        if (var14 == 4) {
                            var15 = var12 + 13;
                        }
                        method173(var13[var14], class107.method3870(16776960) + var6, var15, arg1, arg2, arg3, -1, false, arg4);
                    }
                }
            }
            if (var13 != null) {
                for (int var16 = 4; var16 >= 0; var16--) {
                    if (!Statics.field1856 && arg0.method2874(var16) && var13[var16] != null && var13[var16].equalsIgnoreCase(class383.field4348)) {
                        short var17 = 0;
                        if (field535 != class109.field1395) {
                            if (field535 == class109.field1400 || field535 == class109.field1398 && var5.field2035 > Statics.field3772.field1164) {
                                var17 = 2000;
                            }
                            int var18 = 0;
                            if (var16 == 0) {
                                var18 = var17 + 9;
                            }
                            if (var16 == 1) {
                                var18 = var17 + 10;
                            }
                            if (var16 == 2) {
                                var18 = var17 + 11;
                            }
                            if (var16 == 3) {
                                var18 = var17 + 12;
                            }
                            if (var16 == 4) {
                                var18 = var17 + 13;
                            }
                            method173(var13[var16], class107.method3870(16776960) + var6, var18, arg1, arg2, arg3, -1, false, arg4);
                        }
                    }
                }
            }
            if (!var5.field2048 || !field578) {
                method173(class383.field4347, class107.method3870(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
            }
        } else if (!Statics.field1856 && (Statics.field4106 & 0x2) == 2) {
            method173(field664, field513 + " " + class107.field1384 + " " + class107.method3870(16776960) + var6, 8, arg1, arg2, arg3, -1, false, arg4);
        }
    }

    @ObfuscatedName("et.ll(Ldv;IIIII)V")
    public static final void method3206(class95 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field630 == arg0.field1162 || field561.field5601 >= 400) {
            return;
        }
        String var10;
        if (arg0.field1138 == 0) {
            String var5 = arg0.field1140[0] + arg0.field1141 + arg0.field1140[1];
            int var6 = arg0.field1164;
            int var7 = Statics.field3772.field1164;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class107.method3870(16711680);
            } else if (var8 < -6) {
                var9 = class107.method3870(16723968);
            } else if (var8 < -3) {
                var9 = class107.method3870(16740352);
            } else if (var8 < 0) {
                var9 = class107.method3870(16756736);
            } else if (var8 > 9) {
                var9 = class107.method3870(65280);
            } else if (var8 > 6) {
                var9 = class107.method3870(4259584);
            } else if (var8 > 3) {
                var9 = class107.method3870(8453888);
            } else if (var8 > 0) {
                var9 = class107.method3870(12648192);
            } else {
                var9 = class107.method3870(16776960);
            }
            var10 = var5 + var9 + " " + class107.field1379 + class383.field4382 + arg0.field1164 + class107.field1383 + arg0.field1140[2];
        } else {
            var10 = arg0.field1140[0] + arg0.field1141 + arg0.field1140[1] + " " + class107.field1379 + class383.field4278 + arg0.field1138 + class107.field1383 + arg0.field1140[2];
        }
        if (field659 == 1) {
            method173(class383.field4346, field660 + " " + class107.field1384 + " " + class107.method3870(16777215) + var10, 14, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field661) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (field641[var11] != null) {
                    short var12 = 0;
                    if (field641[var11].equalsIgnoreCase(class383.field4348)) {
                        if (field534 == class109.field1395) {
                            continue;
                        }
                        if (field534 == class109.field1400 || field534 == class109.field1398 && arg0.field1164 > Statics.field3772.field1164) {
                            var12 = 2000;
                        }
                        if (Statics.field3772.field1155 == 0 || arg0.field1155 == 0) {
                            if (field534 == class109.field1396 && arg0.method2516()) {
                                var12 = 2000;
                            }
                        } else if (Statics.field3772.field1155 == arg0.field1155) {
                            var12 = 2000;
                        } else {
                            var12 = 0;
                        }
                    } else if (field642[var11]) {
                        var12 = 2000;
                    }
                    boolean var13 = false;
                    int var14 = field640[var11] + var12;
                    method173(field641[var11], class107.method3870(16777215) + var10, var14, arg1, arg2, arg3, -1, false, arg4);
                }
            }
        } else if ((Statics.field4106 & 0x8) == 8) {
            method173(field664, field513 + " " + class107.field1384 + " " + class107.method3870(16777215) + var10, 15, arg1, arg2, arg3, -1, false, arg4);
        }
        for (int var15 = 0; var15 < field561.field5601; var15++) {
            if (field561.field5600[var15] == 23) {
                field561.field5609[var15] = class107.method3870(16777215) + var10;
                break;
            }
        }
    }

    @ObfuscatedName("cg.lj(IIIIIIIII)V")
    public static final void method1194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field4741.method6299(arg0)) {
            Statics.field41 = null;
            method3530(Statics.field4741.field3785[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field41 != null) {
                method3530(Statics.field41, -1412584499, arg1, arg2, arg3, arg4, Statics.field5003, Statics.field2466, arg7);
                Statics.field41 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field716[var8] = true;
            }
        } else {
            field716[arg7] = true;
        }
    }

    @ObfuscatedName("gj.lz([Lng;IIIIIIIII)V")
    public static final void method3530(class362[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class568.method9608(arg2, arg3, arg4, arg5);
        class240.method4580();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class362 var10 = arg0[var9];
            if (var10 != null && (var10.field3898 == arg1 || arg1 == -1412584499 && field678 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field719[field714] = var10.field3892 + arg6;
                    field566[field714] = var10.field4004 + arg7;
                    field721[field714] = var10.field3894;
                    field722[field714] = var10.field3895;
                    var11 = ++field714 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field4029 = var11;
                var10.field4030 = field518;
                if (!var10.field3929 || !method2348(var10)) {
                    if (var10.field3883 > 0) {
                        method5811(var10);
                    }
                    int var12 = var10.field3892 + arg6;
                    int var13 = var10.field4004 + arg7;
                    int var14 = var10.field3910;
                    if (field678 == var10) {
                        if (arg1 != -1412584499 && !var10.field3970) {
                            Statics.field41 = arg0;
                            Statics.field5003 = arg6;
                            Statics.field2466 = arg7;
                            continue;
                        }
                        if (field689 && field559) {
                            int var15 = class36.field195;
                            int var16 = class36.field198;
                            int var17 = var15 - field760;
                            int var18 = var16 - field681;
                            if (var17 < field759) {
                                var17 = field759;
                            }
                            if (var10.field3894 + var17 > field759 + field758.field3894) {
                                var17 = field759 + field758.field3894 - var10.field3894;
                            }
                            if (var18 < field685) {
                                var18 = field685;
                            }
                            if (var10.field3895 + var18 > field685 + field758.field3895) {
                                var18 = field685 + field758.field3895 - var10.field3895;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3970) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3881 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3894 + var12;
                        int var22 = var10.field3895 + var13;
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
                        int var29 = var10.field3894 + var12;
                        int var30 = var10.field3895 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3929 || var25 < var27 && var26 < var28) {
                        if (var10.field3883 != 0) {
                            if (var10.field3883 == 1336) {
                                if (Statics.field2378.method2764()) {
                                    var13 += 15;
                                    Statics.field1527.method7934("Fps:" + field165, var10.field3894 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field506) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1527.method7934("Mem:" + var32 + "k", var10.field3894 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3883 == 1337) {
                                field655 = var12;
                                field656 = var13;
                                method3416(var12, var13, var10.field3894, var10.field3895);
                                field716[var10.field4029] = true;
                                class568.method9608(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3883 == 1338) {
                                method4667(var10, var12, var13, var11);
                                class568.method9608(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3883 == 1339) {
                                method2260(var10, var12, var13, var11);
                                class568.method9608(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3883 == 1400) {
                                Statics.field472.method8750(var12, var13, var10.field3894, var10.field3895, field518, Statics.field2378.method2724());
                            }
                            if (var10.field3883 == 1401) {
                                Statics.field472.method8754(var12, var13, var10.field3894, var10.field3895);
                            }
                            if (var10.field3883 == 1402) {
                                Statics.field4930.method2672(var12, field518);
                            }
                        }
                        if (var10.field3881 == 0) {
                            if (!var10.field3929 && method2348(var10) && Statics.field273 != var10) {
                                continue;
                            }
                            if (!var10.field3929) {
                                if (var10.field3901 > var10.field3903 - var10.field3895) {
                                    var10.field3901 = var10.field3903 - var10.field3895;
                                }
                                if (var10.field3901 < 0) {
                                    var10.field3901 = 0;
                                }
                            }
                            method3530(arg0, var10.field3878, var25, var26, var27, var28, var12 - var10.field3900, var13 - var10.field3901, var11);
                            if (var10.field4009 != null) {
                                method3530(var10.field4009, var10.field3878, var25, var26, var27, var28, var12 - var10.field3900, var13 - var10.field3901, var11);
                            }
                            class90 var34 = (class90) field667.method8993((long) var10.field3878);
                            if (var34 != null) {
                                method1194(var34.field1090, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class568.method9608(arg2, arg3, arg4, arg5);
                            class240.method4580();
                        } else if (var10.field3881 == 11) {
                            if (method2348(var10) && Statics.field273 != var10) {
                                continue;
                            }
                            if (var10.field4009 != null) {
                                method3530(var10.field4009, var10.field3878, var25, var26, var27, var28, var12 - var10.field3900, var13 - var10.field3901, var11);
                            }
                            class568.method9608(arg2, arg3, arg4, arg5);
                            class240.method4580();
                        }
                        if (field740 || field718[var11] || field653 > 1) {
                            if (var10.field3881 == 0 && !var10.field3929 && var10.field3903 > var10.field3895) {
                                method839(var10.field3894 + var12, var13, var10.field3901, var10.field3895, var10.field3903);
                            }
                            if (var10.field3881 != 1) {
                                if (var10.field3881 == 3) {
                                    int var35;
                                    if (method3403(var10)) {
                                        var35 = var10.field3905;
                                        if (Statics.field273 == var10 && var10.field3907 != 0) {
                                            var35 = var10.field3907;
                                        }
                                    } else {
                                        var35 = var10.field3904;
                                        if (Statics.field273 == var10 && var10.field3911 != 0) {
                                            var35 = var10.field3911;
                                        }
                                    }
                                    if (var10.field3908) {
                                        switch(var10.field3909.field5547) {
                                            case 1:
                                                class568.method9617(var12, var13, var10.field3894, var10.field3895, var10.field3904, var10.field3905);
                                                break;
                                            case 2:
                                                class568.method9618(var12, var13, var10.field3894, var10.field3895, var10.field3904, var10.field3905, 255 - (var10.field3910 & 0xFF), 255 - (var10.field3893 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class568.method9616(var12, var13, var10.field3894, var10.field3895, var35);
                                                } else {
                                                    class568.method9615(var12, var13, var10.field3894, var10.field3895, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class568.method9620(var12, var13, var10.field3894, var10.field3895, var35);
                                    } else {
                                        class568.method9621(var12, var13, var10.field3894, var10.field3895, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3881 == 4) {
                                    class436 var36 = var10.method6761(Statics.field4741);
                                    if (var36 != null) {
                                        String var37 = var10.field4013;
                                        int var38;
                                        if (method3403(var10)) {
                                            var38 = var10.field3905;
                                            if (Statics.field273 == var10 && var10.field3907 != 0) {
                                                var38 = var10.field3907;
                                            }
                                            if (var10.field3943.length() > 0) {
                                                var37 = var10.field3943;
                                            }
                                        } else {
                                            var38 = var10.field3904;
                                            if (Statics.field273 == var10 && var10.field3911 != 0) {
                                                var38 = var10.field3911;
                                            }
                                        }
                                        if (var10.field3929 && var10.field4018 != -1) {
                                            class211 var39 = class211.method7530(var10.field4018);
                                            var37 = var39.field2282;
                                            if (var37 == null) {
                                                var37 = class383.field4405;
                                            }
                                            if ((var39.field2250 == 1 || var10.field4027 != 1) && var10.field4027 != -1) {
                                                var37 = class107.method3870(16748608) + var37 + class107.field1380 + " " + 'x' + method12(var10.field4027);
                                            }
                                        }
                                        if (field671 == var10) {
                                            var37 = class383.field4296;
                                            var38 = var10.field3904;
                                        }
                                        if (!var10.field3929) {
                                            var37 = method5458(var37, var10);
                                        }
                                        var36.method7994(var37, var12, var13, var10.field3894, var10.field3895, var38, var10.field3947 ? 0 : -1, class509.method8653(var10.field3910), var10.field3972, var10.field3946, var10.field3944);
                                    } else if (class362.field3876) {
                                        method2944(var10);
                                    }
                                } else if (var10.field3881 == 5) {
                                    if (var10.field3929) {
                                        class572 var41;
                                        if (var10.field4018 == -1) {
                                            var41 = var10.method6716(Statics.field4741, false, Statics.field3067);
                                        } else {
                                            var41 = class211.method3108(var10.field4018, var10.field4027, var10.field3935, var10.field3920, var10.field3940, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5565;
                                            int var43 = var41.field5563;
                                            if (var10.field3918) {
                                                class568.method9630(var12, var13, var10.field3894 + var12, var10.field3895 + var13);
                                                int var44 = (var10.field3894 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3895 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3981 != 0) {
                                                            var41.method9761(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3981, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method9825(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method9748(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class568.method9608(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3894 * 4096 / var42;
                                                if (var10.field3981 != 0) {
                                                    var41.method9761(var10.field3894 / 2 + var12, var10.field3895 / 2 + var13, var10.field3981, var48);
                                                } else if (var14 != 0) {
                                                    var41.method9750(var12, var13, var10.field3894, var10.field3895, 256 - (var14 & 0xFF));
                                                } else if (var10.field3894 == var42 && var10.field3895 == var43) {
                                                    var41.method9825(var12, var13);
                                                } else {
                                                    var41.method9785(var12, var13, var10.field3894, var10.field3895);
                                                }
                                            }
                                        } else if (class362.field3876) {
                                            method2944(var10);
                                        }
                                    } else {
                                        class572 var40 = var10.method6716(Statics.field4741, method3403(var10), Statics.field3067);
                                        if (var40 != null) {
                                            var40.method9825(var12, var13);
                                        } else if (class362.field3876) {
                                            method2944(var10);
                                        }
                                    }
                                } else if (var10.field3881 == 6) {
                                    boolean var49 = method3403(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3875;
                                    } else {
                                        var50 = var10.field3973;
                                    }
                                    class256 var51 = null;
                                    int var52 = 0;
                                    if (var10.field4018 != -1) {
                                        class211 var53 = class211.method7530(var10.field4018);
                                        if (var53 != null) {
                                            class211 var54 = var53.method4011(var10.field4027);
                                            var51 = var54.method4010(1);
                                            if (var51 == null) {
                                                method2944(var10);
                                            } else {
                                                var51.method5013();
                                                var52 = var51.field2745 / 2;
                                            }
                                        }
                                    } else if (var10.field4034 == 5) {
                                        if (var10.field4017 == 0) {
                                            var51 = field605.method6338((class213) null, -1, (class213) null, -1);
                                        } else {
                                            var51 = Statics.field3772.method2245();
                                        }
                                    } else if (var10.field4034 == 7) {
                                        var51 = var10.field3937.method6338((class213) null, -1, class213.method6692(Statics.field3772.field1223), Statics.field3772.field1236);
                                    } else {
                                        class195 var55 = null;
                                        class194 var56 = null;
                                        if (var10.field4034 == 6) {
                                            int var57 = var10.field4017;
                                            if (var57 >= 0 && var57 < Statics.field2071.field1353.length) {
                                                class106 var58 = Statics.field2071.field1353[var57];
                                                if (var58 != null && var58.field1372 != null) {
                                                    var55 = var58.field1372;
                                                    if (var55.field2042 != null) {
                                                        var55 = var55.method3733();
                                                    }
                                                    var56 = var58.method2866();
                                                }
                                            }
                                        } else if (var10.field4034 == 2) {
                                            int var59 = var10.field4017;
                                            var55 = class195.method8497(var59);
                                            if (var55.field2042 != null) {
                                                var55 = var55.method3733();
                                            }
                                        }
                                        class213 var60 = null;
                                        int var61 = -1;
                                        if (var50 != -1) {
                                            var60 = class213.method6692(var50);
                                            var61 = var10.field4020;
                                        }
                                        var51 = var10.method6706(Statics.field4741, var60, var61, var49, Statics.field3772.field1136, var55, var56);
                                        if (var51 == null && class362.field3876) {
                                            method2944(var10);
                                        }
                                    }
                                    class240.method4516(var10.field3894 / 2 + var12, var10.field3895 / 2 + var13);
                                    int var62 = var10.field3967 * class240.field2591[var10.field3931] >> 16;
                                    int var63 = var10.field3967 * class240.field2592[var10.field3931] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3929) {
                                            var51.method5013();
                                            if (var10.field4019) {
                                                var51.method5040(0, var10.field3932, var10.field3977, var10.field3931, var10.field3889, var10.field3927 + var52 + var62, var10.field3927 + var63, var10.field3967);
                                            } else {
                                                var51.method5018(0, var10.field3932, var10.field3977, var10.field3931, var10.field3889, var10.field3927 + var52 + var62, var10.field3927 + var63);
                                            }
                                        } else {
                                            var51.method5018(0, var10.field3932, 0, var10.field3931, 0, var62, var63);
                                        }
                                    }
                                    class240.method4508();
                                } else {
                                    if (var10.field3881 == 8 && Statics.field5243 == var10 && field658 == field545) {
                                        int var64 = 0;
                                        int var65 = 0;
                                        class436 var66 = Statics.field1527;
                                        String var67 = var10.field4013;
                                        String var68 = method5458(var67, var10);
                                        while (var68.length() > 0) {
                                            int var69 = var68.indexOf(class107.field1385);
                                            String var70;
                                            if (var69 == -1) {
                                                var70 = var68;
                                                var68 = "";
                                            } else {
                                                var70 = var68.substring(0, var69);
                                                var68 = var68.substring(var69 + 4);
                                            }
                                            int var71 = var66.method7933(var70);
                                            if (var71 > var64) {
                                                var64 = var71;
                                            }
                                            var65 += var66.field4851 + 1;
                                        }
                                        var64 += 6;
                                        var65 += 7;
                                        int var72 = var10.field3894 + var12 - 5 - var64;
                                        int var73 = var10.field3895 + var13 + 5;
                                        if (var72 < var12 + 5) {
                                            var72 = var12 + 5;
                                        }
                                        if (var64 + var72 > arg4) {
                                            var72 = arg4 - var64;
                                        }
                                        if (var65 + var73 > arg5) {
                                            var73 = arg5 - var65;
                                        }
                                        class568.method9616(var72, var73, var64, var65, 16777120);
                                        class568.method9620(var72, var73, var64, var65, 0);
                                        String var74 = var10.field4013;
                                        int var75 = var66.field4851 + var73 + 2;
                                        String var76 = method5458(var74, var10);
                                        while (var76.length() > 0) {
                                            int var77 = var76.indexOf(class107.field1385);
                                            String var78;
                                            if (var77 == -1) {
                                                var78 = var76;
                                                var76 = "";
                                            } else {
                                                var78 = var76.substring(0, var77);
                                                var76 = var76.substring(var77 + 4);
                                            }
                                            var66.method7932(var78, var72 + 3, var75, 0, -1);
                                            var75 += var66.field4851 + 1;
                                        }
                                    }
                                    if (var10.field3881 == 9) {
                                        int var79;
                                        int var80;
                                        int var81;
                                        int var82;
                                        if (var10.field3913) {
                                            var79 = var12;
                                            var80 = var10.field3895 + var13;
                                            var81 = var10.field3894 + var12;
                                            var82 = var13;
                                        } else {
                                            var79 = var12;
                                            var80 = var13;
                                            var81 = var10.field3894 + var12;
                                            var82 = var10.field3895 + var13;
                                        }
                                        if (var10.field3912 == 1) {
                                            class568.method9671(var79, var80, var81, var82, var10.field3904);
                                        } else {
                                            method3677(var79, var80, var81, var82, var10.field3904, var10.field3912);
                                        }
                                    } else if (var10.field3881 == 12) {
                                        class360 var83 = var10.method6707();
                                        class354 var84 = var10.method6728();
                                        if (var83 != null && var84 != null && var83.method6468()) {
                                            class436 var85 = var10.method6761(Statics.field4741);
                                            if (var85 != null) {
                                                field708.method9903(var12, var13, var10.field3894, var10.field3895, var83.method6469(), var83.method6571(), var83.method6466(), var83.method6467(), var83.method6465());
                                                int var86 = var10.field3947 ? var10.field3920 : -1;
                                                if (!var83.method6463() && var83.method6460().method7778()) {
                                                    field708.method9905(var84.field3796, var86, var84.field3795, var84.field3794);
                                                    field708.method9908(var83.method6514(), var85);
                                                } else {
                                                    field708.method9905(var10.field3904, var86, var84.field3795, var84.field3794);
                                                    field708.method9908(var83.method6460(), var85);
                                                }
                                                class568.method9608(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("hu.la(IIIIIII)V")
    public static final void method3677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class568.field5538;
        int var18 = arg1 - class568.field5536;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class240.method4510(var19, var20, var21);
        class240.method4512(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class240.method4510(var19, var21, var22);
        class240.method4512(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("kv.ln(Ljava/lang/String;Lng;I)Ljava/lang/String;")
    public static String method5458(String arg0, class362 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method3429(arg1, var2 - 1);
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

    @ObfuscatedName("aw.le(IB)Ljava/lang/String;")
    public static final String method12(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class107.field1382 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class107.method3870(65408) + var1.substring(0, var1.length() - 8) + class383.field4332 + " " + class107.field1379 + var1 + class107.field1383 + class107.field1380;
        } else if (var1.length() > 6) {
            return " " + class107.method3870(16777215) + var1.substring(0, var1.length() - 4) + class383.field4410 + " " + class107.field1379 + var1 + class107.field1383 + class107.field1380;
        } else {
            return " " + class107.method3870(16776960) + var1 + class107.field1380;
        }
    }

    @ObfuscatedName("client.mg(ZB)V")
    public final void method1267(boolean arg0) {
        method5308(field723, Statics.field74, Statics.field2983, arg0);
    }

    @ObfuscatedName("client.ml(Lng;I)V")
    public void method1264(class362 arg0) {
        class362 var2 = arg0.field3898 == -1 ? null : Statics.field4741.method6314(arg0.field3898);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field74;
            var4 = Statics.field2983;
        } else {
            var3 = var2.field3894;
            var4 = var2.field3895;
        }
        method3376(arg0, var3, var4, false);
        method5948(arg0, var3, var4);
    }

    @ObfuscatedName("ba.mo([Lng;Lng;ZB)V")
    public static void method861(class362[] arg0, class362 arg1, boolean arg2) {
        int var3 = arg1.field3902 == 0 ? arg1.field3894 : arg1.field3902;
        int var4 = arg1.field3903 == 0 ? arg1.field3895 : arg1.field3903;
        method3523(arg0, arg1.field3878, var3, var4, arg2);
        if (arg1.field4009 != null) {
            method3523(arg1.field4009, arg1.field3878, var3, var4, arg2);
        }
        class90 var5 = (class90) field667.method8993((long) arg1.field3878);
        if (var5 != null) {
            method5308(var5.field1090, var3, var4, arg2);
        }
        if (arg1.field3883 == 1337) {
        }
    }

    @ObfuscatedName("kl.mi(IIIZB)V")
    public static final void method5308(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.field4741.method6299(arg0)) {
            method3523(Statics.field4741.field3785[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ga.mu([Lng;IIIZI)V")
    public static void method3523(class362[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class362 var6 = arg0[var5];
            if (var6 != null && var6.field3898 == arg1) {
                method3376(var6, arg2, arg3, arg4);
                method5948(var6, arg2, arg3);
                if (var6.field3900 > var6.field3902 - var6.field3894) {
                    var6.field3900 = var6.field3902 - var6.field3894;
                }
                if (var6.field3900 < 0) {
                    var6.field3900 = 0;
                }
                if (var6.field3901 > var6.field3903 - var6.field3895) {
                    var6.field3901 = var6.field3903 - var6.field3895;
                }
                if (var6.field3901 < 0) {
                    var6.field3901 = 0;
                }
                if (var6.field3881 == 0) {
                    method861(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("fr.mf(Lng;IIZI)V")
    public static void method3376(class362 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3894;
        int var5 = arg0.field3895;
        if (arg0.field3886 == 0) {
            arg0.field3894 = arg0.field3938;
        } else if (arg0.field3886 == 1) {
            arg0.field3894 = arg1 - arg0.field3938;
        } else if (arg0.field3886 == 2) {
            arg0.field3894 = arg0.field3938 * arg1 >> 14;
        }
        if (arg0.field3968 == 0) {
            arg0.field3895 = arg0.field3891;
        } else if (arg0.field3968 == 1) {
            arg0.field3895 = arg2 - arg0.field3891;
        } else if (arg0.field3968 == 2) {
            arg0.field3895 = arg0.field3891 * arg2 >> 14;
        }
        if (arg0.field3886 == 4) {
            arg0.field3894 = arg0.field4007 * arg0.field3895 / arg0.field3971;
        }
        if (arg0.field3968 == 4) {
            arg0.field3895 = arg0.field3971 * arg0.field3894 / arg0.field4007;
        }
        if (arg0.field3883 == 1337) {
            field673 = arg0;
        }
        if (arg0.field3881 == 12) {
            arg0.method6707().method6632(arg0.field3894, arg0.field3895);
        }
        if (arg3 && arg0.field4006 != null && (arg0.field3894 != var4 || arg0.field3895 != var5)) {
            class91 var6 = new class91();
            var6.field1101 = arg0;
            var6.field1103 = arg0.field4006;
            field512.method7243(var6);
        }
    }

    @ObfuscatedName("mb.mr(Lng;IIB)V")
    public static void method5948(class362 arg0, int arg1, int arg2) {
        if (arg0.field3884 == 0) {
            arg0.field3892 = arg0.field3933;
        } else if (arg0.field3884 == 1) {
            arg0.field3892 = (arg1 - arg0.field3894) / 2 + arg0.field3933;
        } else if (arg0.field3884 == 2) {
            arg0.field3892 = arg1 - arg0.field3894 - arg0.field3933;
        } else if (arg0.field3884 == 3) {
            arg0.field3892 = arg0.field3933 * arg1 >> 14;
        } else if (arg0.field3884 == 4) {
            arg0.field3892 = (arg0.field3933 * arg1 >> 14) + (arg1 - arg0.field3894) / 2;
        } else {
            arg0.field3892 = arg1 - arg0.field3894 - (arg0.field3933 * arg1 >> 14);
        }
        if (arg0.field3885 == 0) {
            arg0.field4004 = arg0.field3882;
        } else if (arg0.field3885 == 1) {
            arg0.field4004 = (arg2 - arg0.field3895) / 2 + arg0.field3882;
        } else if (arg0.field3885 == 2) {
            arg0.field4004 = arg2 - arg0.field3895 - arg0.field3882;
        } else if (arg0.field3885 == 3) {
            arg0.field4004 = arg0.field3882 * arg2 >> 14;
        } else if (arg0.field3885 == 4) {
            arg0.field4004 = (arg0.field3882 * arg2 >> 14) + (arg2 - arg0.field3895) / 2;
        } else {
            arg0.field4004 = arg2 - arg0.field3895 - (arg0.field3882 * arg2 >> 14);
        }
    }

    @ObfuscatedName("lk.mb(Lng;IIIIIII)V")
    public static final void method5778(class362 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field589) {
            field590 = 32;
        } else {
            field590 = 0;
        }
        field589 = false;
        if (class36.field204 == 1 || !Statics.field1704 && class36.field204 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3901 -= 4;
                method2944(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3901 += 4;
                method2944(arg0);
            } else if (arg5 >= arg1 - field590 && arg5 < field590 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3901 = (arg4 - arg3) * var8 / var9;
                method2944(arg0);
                field589 = true;
            }
        }
        if (field694 == 0) {
            return;
        }
        int var10 = arg0.field3894;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3901 += field694 * 45;
            method2944(arg0);
        }
    }

    @ObfuscatedName("bd.mh(IIIIII)V")
    public static final void method839(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1685[0].method9720(arg0, arg1);
        Statics.field1685[1].method9720(arg0, arg1 + arg3 - 16);
        class568.method9616(arg0, arg1 + 16, 16, arg3 - 32, field585);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class568.method9616(arg0, arg1 + 16 + var6, 16, var5, field679);
        class568.method9624(arg0, arg1 + 16 + var6, var5, field557);
        class568.method9624(arg0 + 1, arg1 + 16 + var6, var5, field557);
        class568.method9622(arg0, arg1 + 16 + var6, 16, field557);
        class568.method9622(arg0, arg1 + 17 + var6, 16, field557);
        class568.method9624(arg0 + 15, arg1 + 16 + var6, var5, field715);
        class568.method9624(arg0 + 14, arg1 + 17 + var6, var5 - 1, field715);
        class568.method9622(arg0, arg1 + 15 + var6 + var5, 16, field715);
        class568.method9622(arg0 + 1, arg1 + 14 + var6 + var5, 15, field715);
    }

    @ObfuscatedName("ft.mt(Lng;B)Z")
    public static final boolean method3403(class362 arg0) {
        if (arg0.field3928 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3928.length; var1++) {
            int var2 = method3429(arg0, var1);
            int var3 = arg0.field4012[var1];
            if (arg0.field3928[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3928[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3928[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("fz.mm(Lng;II)I")
    public static final int method3429(class362 arg0, int arg1) {
        if (arg0.field4010 == null || arg1 >= arg0.field4010.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field4010[arg1];
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
                    var7 = field680[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field646[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field647[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class362 var11 = Statics.field4741.method6314(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class211.method7530(var12).field2268 || field794)) {
                        for (int var13 = 0; var13 < var11.field4016.length; var13++) {
                            if (var12 + 1 == var11.field4016[var13]) {
                                var7 += var11.field3993[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class350.field3773[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class372.field4089[field646[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class350.field3773[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field3772.field1164;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class372.field4088[var14]) {
                            var7 += field646[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class362 var17 = Statics.field4741.method6314(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class211.method7530(var18).field2268 || field794)) {
                        for (int var19 = 0; var19 < var17.field4016.length; var19++) {
                            if (var18 + 1 == var17.field4016[var19]) {
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
                    var7 = field652;
                }
                if (var6 == 13) {
                    int var20 = class350.field3773[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class350.method2339(var22);
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
                    var7 = (Statics.field3772.field1247 >> 7) + Statics.field2071.field1347;
                }
                if (var6 == 19) {
                    var7 = (Statics.field3772.field1270 >> 7) + Statics.field2071.field1348;
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

    @ObfuscatedName("dq.mj(Lng;B)V")
    public static final void method2330(class362 arg0) {
        if (arg0.field3957 == 1) {
            method7156(arg0.field3997, "", 24, 0, 0, arg0.field3878, arg0.field4018);
        }
        if (arg0.field3957 == 2 && !field661) {
            String var1 = method4322(arg0);
            if (var1 != null) {
                method7156(var1, class107.method3870(65280) + arg0.field4014, 25, 0, -1, arg0.field3878, arg0.field4018);
            }
        }
        if (arg0.field3957 == 3) {
            method6901(class383.field4356, "", 26, 0, 0, arg0.field3878);
        }
        if (arg0.field3957 == 4) {
            method6901(arg0.field3997, "", 28, 0, 0, arg0.field3878);
        }
        if (arg0.field3957 == 5) {
            method6901(arg0.field3997, "", 29, 0, 0, arg0.field3878);
        }
        if (arg0.field3957 == 6 && field671 == null) {
            method6901(arg0.field3997, "", 30, 0, -1, arg0.field3878);
        }
        if (!arg0.field3929) {
            return;
        }
        if (field661) {
            int var2 = Statics.method3563(arg0);
            boolean var3 = (var2 >> 21 & 0x1) != 0;
            if (var3 && (Statics.field4106 & 0x20) == 32) {
                method7156(field664, field513 + " " + class107.field1384 + " " + arg0.field4028, 58, 0, arg0.field3879, arg0.field3878, arg0.field4018);
            }
            return;
        }
        for (int var4 = 9; var4 >= 0; var4--) {
            if (arg0.field3926 == var4) {
                String var5 = method4322(arg0);
                if (var5 != null) {
                    method7156(var5, arg0.field4028, 25, 0, arg0.field3879, arg0.field3878, arg0.field4018);
                }
            }
            String var6 = method8425(arg0, var4);
            if (var6 != null) {
                short var7;
                int var8;
                if (var4 > arg0.field3926) {
                    var7 = 1007;
                    var8 = method7156(var6, arg0.field4028, var7, var4 + 1, arg0.field3879, arg0.field3878, arg0.field4018);
                } else {
                    var7 = 57;
                    var8 = method173(var6, arg0.field4028, var7, var4 + 1, arg0.field3879, arg0.field3878, arg0.field4018, arg0.field3963, -1);
                }
                if (arg0.field3965 != null && var4 < arg0.field3965.length && arg0.field3965[var4] != null) {
                    String[] var9 = arg0.field3965[var4];
                    for (int var10 = var9.length - 1; var10 >= 0; var10--) {
                        int var11 = var10 + 1 << 16 | var4 + 1;
                        if (var9[var10] != null && !var9[var10].isEmpty()) {
                            method5388(var8, var9[var10], "", var7, var11, arg0.field3879, arg0.field3878, arg0.field4018, -1);
                        }
                    }
                }
            }
        }
        int var12 = Statics.method3563(arg0);
        boolean var13 = (var12 & 0x1) != 0;
        if (var13) {
            method6901(class383.field4404, "", 30, 0, arg0.field3879, arg0.field3878);
        }
    }

    @ObfuscatedName("fz.me(ZI)V")
    public static void method3427(boolean arg0) {
        field695 = arg0;
    }

    @ObfuscatedName("client.ms(B)Z")
    public static boolean method1874() {
        return field695;
    }

    @ObfuscatedName("gg.mv(IIIIIIIS)V")
    public static final void method3534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field4741.method6299(arg0)) {
            method3617(Statics.field4741.field3785[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("hc.mw([Lng;IIIIIIIB)V")
    public static final void method3617(class362[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class362 var9 = arg0[var8];
            if (var9 != null && var9.field3898 == arg1 && (var9.method6840() || Statics.method3563(var9) != 0 || field758 == var9)) {
                if (var9.field3929) {
                    if (method2348(var9)) {
                        continue;
                    }
                } else if (var9.field3881 == 0 && Statics.field273 != var9 && method2348(var9)) {
                    continue;
                }
                if (var9.field3881 == 11) {
                    if (var9.method6726(Statics.field4741, Statics.field3067)) {
                        if (var9.method6812()) {
                            method2944(var9);
                            method861(var9.field4009, var9, true);
                            var9.method6723().method4205().method4278(3, var9.method6723().method4158());
                        }
                        if (var9.field3992 != null) {
                            class91 var10 = new class91();
                            var10.field1101 = var9;
                            var10.field1103 = var9.field3992;
                            field512.method7243(var10);
                        }
                    }
                } else if (var9.field3881 == 12 && var9.method6732(Statics.field4741)) {
                    method2944(var9);
                }
                int var11 = var9.field3892 + arg6;
                int var12 = var9.field4004 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3881 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3894 + var11;
                    int var16 = var9.field3895 + var12;
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
                    int var23 = var9.field3894 + var11;
                    int var24 = var9.field3895 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field678 == var9) {
                    field692 = true;
                    field687 = var11;
                    field522 = var12;
                }
                boolean var25 = false;
                if (var9.field3958) {
                    switch(field668) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3878 >>> 16 == field669) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field669 == var9.field3878) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3929 || var19 < var21 && var20 < var22) {
                    if (var9.field3929) {
                        if (var9.field4032) {
                            if (class36.field195 >= var19 && class36.field198 >= var20 && class36.field195 < var21 && class36.field198 < var22) {
                                for (class91 var26 = (class91) field512.method7247(); var26 != null; var26 = (class91) field512.method7249()) {
                                    if (var26.field1099) {
                                        var26.method8667();
                                        var26.field1101.field4023 = false;
                                    }
                                }
                                method5687();
                                if (Statics.field1097 == 0) {
                                    field678 = null;
                                    field758 = null;
                                }
                                if (!field650) {
                                    method5810();
                                }
                            }
                        } else if (var9.field4033 && class36.field195 >= var19 && class36.field198 >= var20 && class36.field195 < var21 && class36.field198 < var22) {
                            for (class91 var27 = (class91) field512.method7247(); var27 != null; var27 = (class91) field512.method7249()) {
                                if (var27.field1099 && var27.field1101.field3994 == var27.field1103) {
                                    var27.method8667();
                                }
                            }
                        }
                    }
                    int var28 = class36.field195;
                    int var29 = class36.field198;
                    if (class36.field197 != 0) {
                        var28 = class36.field213;
                        var29 = class36.field214;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3883 == 1337) {
                        if (!field517 && !field650 && var30) {
                            method3525(var28, var29, var19, var20);
                        }
                    } else if (var9.field3883 == 1338) {
                        method4480(var9, var11, var12);
                    } else {
                        if (var9.field3883 == 1400) {
                            Statics.field472.method8733(class36.field195, class36.field198, var30, var11, var12, var9.field3894, var9.field3895);
                        }
                        if (!field650 && var30) {
                            if (var9.field3883 == 1400) {
                                Statics.field472.method8786(var11, var12, var9.field3894, var9.field3895, var28, var29);
                            } else {
                                method2330(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3959.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3959[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3959[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field4031 != null) {
                                            var35 = field734.method5249(var9.field3959[var31][var34]);
                                        }
                                        if (method5456(var9.field3959[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field4031 != null && var9.field4031[var31] > field518) {
                                                break;
                                            }
                                            byte var36 = var9.field3960[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field734.method5249(86) && !field734.method5249(82) && !field734.method5249(81)) && ((var36 & 0x2) == 0 || field734.method5249(86)) && ((var36 & 0x1) == 0 || field734.method5249(82)) && ((var36 & 0x4) == 0 || field734.method5249(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method3367(var31 + 1, var9.field3878, var9.field3879, var9.field4018, "");
                                    } else if (var31 == 10) {
                                        method7231();
                                        method2505(var9.field3878, var9.field3879, Statics.method2504(Statics.method3563(var9)), var9.field4018);
                                        field664 = method4322(var9);
                                        if (field664 == null) {
                                            field664 = class383.field4405;
                                        }
                                        field513 = var9.field4028 + class107.method3870(16777215);
                                    }
                                    int var37 = var9.field3996[var31];
                                    if (var9.field4031 == null) {
                                        var9.field4031 = new int[var9.field3959.length];
                                    }
                                    if (var9.field3962 == null) {
                                        var9.field3962 = new int[var9.field3959.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field4031[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field4031[var31] == 0) {
                                        var9.field4031[var31] = field518 + var37 + var9.field3962[var31];
                                    } else {
                                        var9.field4031[var31] = field518 + var37;
                                    }
                                }
                                if (!var32 && var9.field4031 != null) {
                                    var9.field4031[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3929) {
                            boolean var38;
                            if (class36.field195 >= var19 && class36.field198 >= var20 && class36.field195 < var21 && class36.field198 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field204 == 1 || !Statics.field1704 && class36.field204 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field197 == 1 || !Statics.field1704 && class36.field197 == 4) && class36.field213 >= var19 && class36.field214 >= var20 && class36.field213 < var21 && class36.field214 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method7423(var9, class36.field213 - var11, class36.field214 - var12);
                            }
                            if (var9.method6703()) {
                                if (var40) {
                                    field712.method7243(new class269(0, class36.field195 - var11, class36.field198 - var12, var9));
                                }
                                if (var39) {
                                    field712.method7243(new class269(1, class36.field195 - var11, class36.field198 - var12, var9));
                                }
                            }
                            if (var9.field3883 == 1400) {
                                Statics.field472.method8734(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field678 != null && field678 != var9 && var38 && class363.method3724(Statics.method3563(var9))) {
                                field682 = var9;
                            }
                            if (field758 == var9) {
                                field559 = true;
                                field759 = var11;
                                field685 = var12;
                            }
                            if (var9.field3930) {
                                if (var38 && field694 != 0 && var9.field3994 != null) {
                                    class91 var41 = new class91();
                                    var41.field1099 = true;
                                    var41.field1101 = var9;
                                    var41.field1098 = field694;
                                    var41.field1103 = var9.field3994;
                                    field512.method7243(var41);
                                }
                                if (field678 != null || field650) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field4024 && var40) {
                                    var9.field4024 = true;
                                    if (var9.field3974 != null) {
                                        class91 var42 = new class91();
                                        var42.field1099 = true;
                                        var42.field1101 = var9;
                                        var42.field1108 = class36.field213 - var11;
                                        var42.field1098 = class36.field214 - var12;
                                        var42.field1103 = var9.field3974;
                                        field512.method7243(var42);
                                    }
                                }
                                if (var9.field4024 && var39 && var9.field3975 != null) {
                                    class91 var43 = new class91();
                                    var43.field1099 = true;
                                    var43.field1101 = var9;
                                    var43.field1108 = class36.field195 - var11;
                                    var43.field1098 = class36.field198 - var12;
                                    var43.field1103 = var9.field3975;
                                    field512.method7243(var43);
                                }
                                if (var9.field4024 && !var39) {
                                    var9.field4024 = false;
                                    if (var9.field3976 != null) {
                                        class91 var44 = new class91();
                                        var44.field1099 = true;
                                        var44.field1101 = var9;
                                        var44.field1108 = class36.field195 - var11;
                                        var44.field1098 = class36.field198 - var12;
                                        var44.field1103 = var9.field3976;
                                        field711.method7243(var44);
                                    }
                                }
                                if (var39 && var9.field3934 != null) {
                                    class91 var45 = new class91();
                                    var45.field1099 = true;
                                    var45.field1101 = var9;
                                    var45.field1108 = class36.field195 - var11;
                                    var45.field1098 = class36.field198 - var12;
                                    var45.field1103 = var9.field3934;
                                    field512.method7243(var45);
                                }
                                if (!var9.field4023 && var38) {
                                    var9.field4023 = true;
                                    if (var9.field3978 != null) {
                                        class91 var46 = new class91();
                                        var46.field1099 = true;
                                        var46.field1101 = var9;
                                        var46.field1108 = class36.field195 - var11;
                                        var46.field1098 = class36.field198 - var12;
                                        var46.field1103 = var9.field3978;
                                        field512.method7243(var46);
                                    }
                                }
                                if (var9.field4023 && var38 && var9.field3979 != null) {
                                    class91 var47 = new class91();
                                    var47.field1099 = true;
                                    var47.field1101 = var9;
                                    var47.field1108 = class36.field195 - var11;
                                    var47.field1098 = class36.field198 - var12;
                                    var47.field1103 = var9.field3979;
                                    field512.method7243(var47);
                                }
                                if (var9.field4023 && !var38) {
                                    var9.field4023 = false;
                                    if (var9.field3915 != null) {
                                        class91 var48 = new class91();
                                        var48.field1099 = true;
                                        var48.field1101 = var9;
                                        var48.field1108 = class36.field195 - var11;
                                        var48.field1098 = class36.field198 - var12;
                                        var48.field1103 = var9.field3915;
                                        field711.method7243(var48);
                                    }
                                }
                                if (var9.field3991 != null) {
                                    class91 var49 = new class91();
                                    var49.field1101 = var9;
                                    var49.field1103 = var9.field3991;
                                    field788.method7243(var49);
                                }
                                if (var9.field3985 != null && field615 > var9.field4026) {
                                    if (var9.field3949 == null || field615 - var9.field4026 > 32) {
                                        class91 var54 = new class91();
                                        var54.field1101 = var9;
                                        var54.field1103 = var9.field3985;
                                        field512.method7243(var54);
                                    } else {
                                        label647: for (int var50 = var9.field4026; var50 < field615; var50++) {
                                            int var51 = field691[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3949.length; var52++) {
                                                if (var9.field3949[var52] == var51) {
                                                    class91 var53 = new class91();
                                                    var53.field1101 = var9;
                                                    var53.field1103 = var9.field3985;
                                                    field512.method7243(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field4026 = field615;
                                }
                                if (var9.field3987 != null && field779 > var9.field4015) {
                                    if (var9.field3923 == null || field779 - var9.field4015 > 32) {
                                        class91 var59 = new class91();
                                        var59.field1101 = var9;
                                        var59.field1103 = var9.field3987;
                                        field512.method7243(var59);
                                    } else {
                                        label623: for (int var55 = var9.field4015; var55 < field779; var55++) {
                                            int var56 = field800[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3923.length; var57++) {
                                                if (var9.field3923[var57] == var56) {
                                                    class91 var58 = new class91();
                                                    var58.field1101 = var9;
                                                    var58.field1103 = var9.field3987;
                                                    field512.method7243(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field4015 = field779;
                                }
                                if (var9.field3989 != null && field510 > var9.field4000) {
                                    if (var9.field3990 == null || field510 - var9.field4000 > 32) {
                                        class91 var64 = new class91();
                                        var64.field1101 = var9;
                                        var64.field1103 = var9.field3989;
                                        field512.method7243(var64);
                                    } else {
                                        label599: for (int var60 = var9.field4000; var60 < field510; var60++) {
                                            int var61 = field629[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3990.length; var62++) {
                                                if (var9.field3990[var62] == var61) {
                                                    class91 var63 = new class91();
                                                    var63.field1101 = var9;
                                                    var63.field1103 = var9.field3989;
                                                    field512.method7243(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field4000 = field510;
                                }
                                if (field665 > var9.field4025 && var9.field3995 != null) {
                                    class91 var65 = new class91();
                                    var65.field1101 = var9;
                                    var65.field1103 = var9.field3995;
                                    field512.method7243(var65);
                                }
                                if (field587 > var9.field4025 && var9.field3999 != null) {
                                    class91 var66 = new class91();
                                    var66.field1101 = var9;
                                    var66.field1103 = var9.field3999;
                                    field512.method7243(var66);
                                }
                                if (field701 > var9.field4025 && var9.field3942 != null) {
                                    class91 var67 = new class91();
                                    var67.field1101 = var9;
                                    var67.field1103 = var9.field3942;
                                    field512.method7243(var67);
                                }
                                if (field702 > var9.field4025 && var9.field3966 != null) {
                                    class91 var68 = new class91();
                                    var68.field1101 = var9;
                                    var68.field1103 = var9.field3966;
                                    field512.method7243(var68);
                                }
                                if (field703 > var9.field4025 && var9.field4002 != null) {
                                    class91 var69 = new class91();
                                    var69.field1101 = var9;
                                    var69.field1103 = var9.field4002;
                                    field512.method7243(var69);
                                }
                                if (field704 > var9.field4025 && var9.field4001 != null) {
                                    class91 var70 = new class91();
                                    var70.field1101 = var9;
                                    var70.field1103 = var9.field4001;
                                    field512.method7243(var70);
                                }
                                if (field705 > var9.field4025 && var9.field4008 != null) {
                                    class91 var71 = new class91();
                                    var71.field1101 = var9;
                                    var71.field1103 = var9.field4008;
                                    field512.method7243(var71);
                                }
                                if (field706 > var9.field4025 && var9.field4003 != null) {
                                    class91 var72 = new class91();
                                    var72.field1101 = var9;
                                    var72.field1103 = var9.field4003;
                                    field512.method7243(var72);
                                }
                                var9.field4025 = field555;
                                if (var9.field3955 != null) {
                                    for (int var73 = 0; var73 < field736; var73++) {
                                        class91 var74 = new class91();
                                        var74.field1101 = var9;
                                        var74.field1106 = field738[var73];
                                        var74.field1107 = field737[var73];
                                        var74.field1103 = var9.field3955;
                                        field512.method7243(var74);
                                    }
                                }
                                if (var9.field3917 != null) {
                                    int[] var75 = field734.method5245();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class91 var77 = new class91();
                                        var77.field1101 = var9;
                                        var77.field1106 = var75[var76];
                                        var77.field1103 = var9.field3917;
                                        field512.method7243(var77);
                                    }
                                }
                                if (var9.field3998 != null) {
                                    int[] var78 = field734.method5246();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class91 var80 = new class91();
                                        var80.field1101 = var9;
                                        var80.field1106 = var78[var79];
                                        var80.field1103 = var9.field3998;
                                        field512.method7243(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3929) {
                            if (field678 != null || field650) {
                                continue;
                            }
                            if ((var9.field3877 >= 0 || var9.field3911 != 0) && class36.field195 >= var19 && class36.field198 >= var20 && class36.field195 < var21 && class36.field198 < var22) {
                                if (var9.field3877 >= 0) {
                                    Statics.field273 = arg0[var9.field3877];
                                } else {
                                    Statics.field273 = var9;
                                }
                            }
                            if (var9.field3881 == 8 && class36.field195 >= var19 && class36.field198 >= var20 && class36.field195 < var21 && class36.field198 < var22) {
                                Statics.field5243 = var9;
                            }
                            if (var9.field3903 > var9.field3895) {
                                method5778(var9, var9.field3894 + var11, var12, var9.field3895, var9.field3903, class36.field195, class36.field198);
                            }
                        }
                        if (var9.field3881 == 0) {
                            method3617(arg0, var9.field3878, var19, var20, var21, var22, var11 - var9.field3900, var12 - var9.field3901);
                            if (var9.field4009 != null) {
                                method3617(var9.field4009, var9.field3878, var19, var20, var21, var22, var11 - var9.field3900, var12 - var9.field3901);
                            }
                            class90 var81 = (class90) field667.method8993((long) var9.field3878);
                            if (var81 != null) {
                                if (var81.field1091 == 0 && class36.field195 >= var19 && class36.field198 >= var20 && class36.field195 < var21 && class36.field198 < var22 && !field650) {
                                    for (class91 var82 = (class91) field512.method7247(); var82 != null; var82 = (class91) field512.method7249()) {
                                        if (var82.field1099) {
                                            var82.method8667();
                                            var82.field1101.field4023 = false;
                                        }
                                    }
                                    if (Statics.field1097 == 0) {
                                        field678 = null;
                                        field758 = null;
                                    }
                                    if (!field650) {
                                        method5810();
                                    }
                                }
                                method3534(var81.field1090, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kv.mz(II)Z")
    public static boolean method5456(int arg0) {
        for (int var1 = 0; var1 < field736; var1++) {
            if (field738[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("si.my(IIS)V")
    public static final void method8352(int arg0, int arg1) {
        if (Statics.field4741.method6299(arg0)) {
            method2662(Statics.field4741.field3785[arg0], arg1);
        }
    }

    @ObfuscatedName("dw.ma([Lng;II)V")
    public static final void method2662(class362[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class362 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3881 == 0) {
                    if (var3.field4009 != null) {
                        method2662(var3.field4009, arg1);
                    }
                    class90 var4 = (class90) field667.method8993((long) var3.field3878);
                    if (var4 != null) {
                        method8352(var4.field1090, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3982 != null) {
                    class91 var5 = new class91();
                    var5.field1101 = var3;
                    var5.field1103 = var3.field3982;
                    class73.method8429(var5);
                }
                if (arg1 == 1 && var3.field4005 != null) {
                    if (var3.field3879 >= 0) {
                        class362 var6 = Statics.field4741.method6314(var3.field3878);
                        if (var6 == null || var6.field4009 == null || var3.field3879 >= var6.field4009.length || var6.field4009[var3.field3879] != var3) {
                            continue;
                        }
                    }
                    class91 var7 = new class91();
                    var7.field1101 = var3;
                    var7.field1103 = var3.field4005;
                    class73.method8429(var7);
                }
            }
        }
    }

    @ObfuscatedName("qk.md(Lng;III)V")
    public static final void method7423(class362 arg0, int arg1, int arg2) {
        if (field678 != null || field650 || arg0 == null || method1163(arg0) == null) {
            return;
        }
        field678 = arg0;
        field758 = method1163(arg0);
        field760 = arg1;
        field681 = arg2;
        Statics.field1097 = 0;
        field689 = false;
        int var3 = method6209();
        if (var3 == -1) {
            return;
        }
        Statics.field1893 = new class77();
        Statics.field1893.field915 = field561.field5602[var3];
        Statics.field1893.field909 = field561.field5612[var3];
        Statics.field1893.field908 = field561.field5600[var3];
        Statics.field1893.field911 = field561.field5605[var3];
        Statics.field1893.field916 = field561.field5606[var3];
        Statics.field1893.field914 = field561.field5604[var3];
        Statics.field1893.field912 = field561.field5609[var3];
        Statics.field1893.field913 = field561.field5608[var3];
        Statics.field1893.field910 = field561.field5611[var3];
    }

    @ObfuscatedName("client.mq(I)V")
    public final void method1265() {
        method2944(field678);
        Statics.field1097++;
        if (field692 && field559) {
            int var1 = class36.field195;
            int var2 = class36.field198;
            int var3 = var1 - field760;
            int var4 = var2 - field681;
            if (var3 < field759) {
                var3 = field759;
            }
            if (field678.field3894 + var3 > field759 + field758.field3894) {
                var3 = field759 + field758.field3894 - field678.field3894;
            }
            if (var4 < field685) {
                var4 = field685;
            }
            if (field678.field3895 + var4 > field685 + field758.field3895) {
                var4 = field685 + field758.field3895 - field678.field3895;
            }
            int var5 = var3 - field687;
            int var6 = var4 - field522;
            int var7 = field678.field3936;
            if (Statics.field1097 > field678.field3969 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field689 = true;
            }
            int var8 = field758.field3900 + (var3 - field759);
            int var9 = field758.field3901 + (var4 - field685);
            if (field678.field3986 != null && field689) {
                class91 var10 = new class91();
                var10.field1101 = field678;
                var10.field1108 = var8;
                var10.field1098 = var9;
                var10.field1103 = field678.field3986;
                class73.method8429(var10);
            }
            if (class36.field204 == 0) {
                if (field689) {
                    if (field678.field3896 != null) {
                        class91 var11 = new class91();
                        var11.field1101 = field678;
                        var11.field1108 = var8;
                        var11.field1098 = var9;
                        var11.field1105 = field682;
                        var11.field1103 = field678.field3896;
                        class73.method8429(var11);
                    }
                    if (field682 != null && Statics.method7921(field678) != null) {
                        class325 var12 = class325.method2983(class323.field3370, field784.field1485);
                        var12.field3433.method9314(field678.field3878);
                        var12.field3433.method9313(field682.field3878);
                        var12.field3433.method9299(field682.field3879);
                        var12.field3433.method9299(field678.field4018);
                        var12.field3433.method9257(field682.field4018);
                        var12.field3433.method9257(field678.field3879);
                        field784.method3070(var12);
                    }
                } else if (Statics.field1893 == null || this.method1261(Statics.field1893.field908, Statics.field1893.field910)) {
                    this.method1262(field760 + field687, field681 + field522);
                } else if (field561.field5601 > 0) {
                    int var13 = field760 + field687;
                    int var14 = field681 + field522;
                    method1197(Statics.field1893, var13, var14);
                    Statics.field1893 = null;
                }
                field678 = null;
            }
        } else if (Statics.field1097 > 1) {
            if (!field689 && field561.field5601 > 0) {
                int var15 = field760 + field687;
                int var16 = field681 + field522;
                method1197(Statics.field1893, var15, var16);
                Statics.field1893 = null;
            }
            field678 = null;
        }
    }

    @ObfuscatedName("ek.mp(Lng;I)V")
    public static void method2944(class362 arg0) {
        if (arg0 != null && field591 == arg0.field4030) {
            field716[arg0.field4029] = true;
        }
    }

    @ObfuscatedName("ed.mn(I)V")
    public static void method3069() {
        for (class90 var0 = (class90) field667.method8996(); var0 != null; var0 = (class90) field667.method8999()) {
            int var1 = var0.field1090;
            if (Statics.field4741.method6299(var1)) {
                boolean var2 = true;
                class362[] var3 = Statics.field4741.field3785[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3929;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field5170;
                    class362 var6 = Statics.field4741.method6314(var5);
                    if (var6 != null) {
                        method2944(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cu.mc(Lng;I)Lng;")
    public static class362 method1163(class362 arg0) {
        class362 var1 = Statics.method7921(arg0);
        if (var1 == null) {
            var1 = arg0.field3961;
        }
        return var1;
    }

    @ObfuscatedName("ho.mk(II)V")
    public static final void method3702(int arg0) {
        if (!Statics.field4741.method6299(arg0)) {
            return;
        }
        class362[] var1 = Statics.field4741.field3785[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class362 var3 = var1[var2];
            if (var3 != null) {
                var3.field4020 = 0;
                var3.field4021 = 0;
            }
        }
    }

    @ObfuscatedName("cb.mx(II)V")
    public static final void method1053(int arg0) {
        if (Statics.field4741.method6299(arg0)) {
            method3215(Statics.field4741.field3785[arg0], -1);
        }
    }

    @ObfuscatedName("et.np([Lng;IB)V")
    public static final void method3215(class362[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class362 var3 = arg0[var2];
            if (var3 != null && var3.field3898 == arg1 && (!var3.field3929 || !method2348(var3))) {
                if (var3.field3881 == 0) {
                    if (!var3.field3929 && method2348(var3) && Statics.field273 != var3) {
                        continue;
                    }
                    method3215(arg0, var3.field3878);
                    if (var3.field4009 != null) {
                        method3215(var3.field4009, var3.field3878);
                    }
                    class90 var4 = (class90) field667.method8993((long) var3.field3878);
                    if (var4 != null) {
                        method1053(var4.field1090);
                    }
                }
                if (var3.field3881 == 6) {
                    if (var3.field3973 != -1 || var3.field3875 != -1) {
                        boolean var5 = method3403(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3875;
                        } else {
                            var6 = var3.field3973;
                        }
                        if (var6 != -1) {
                            class213 var7 = class213.method6692(var6);
                            if (var7.method4100()) {
                                var3.field4020 += field584;
                                int var8 = var7.method4101();
                                if (var3.field4020 >= var8) {
                                    var3.field4020 -= var7.field2309;
                                    if (var3.field4020 < 0 || var3.field4020 >= var8) {
                                        var3.field4020 = 0;
                                    }
                                }
                                method2944(var3);
                            } else {
                                var3.field4021 += field584;
                                while (var3.field4021 > var7.field2316[var3.field4020]) {
                                    var3.field4021 -= var7.field2316[var3.field4020];
                                    var3.field4020++;
                                    if (var3.field4020 >= var7.field2314.length) {
                                        var3.field4020 -= var7.field2309;
                                        if (var3.field4020 < 0 || var3.field4020 >= var7.field2314.length) {
                                            var3.field4020 = 0;
                                        }
                                    }
                                    method2944(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3906 != 0 && !var3.field3929) {
                        int var9 = var3.field3906 >> 16;
                        int var10 = var3.field3906 << 16 >> 16;
                        int var11 = field584 * var9;
                        int var12 = field584 * var10;
                        var3.field3931 = var3.field3931 + var11 & 0x7FF;
                        var3.field3932 = var3.field3932 + var12 & 0x7FF;
                        method2944(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gh.nh(II)V")
    public static final void method3537(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        method1990((double) var3);
    }

    @ObfuscatedName("av.nf(I)I")
    public static final int method293() {
        float var0 = 200.0F * ((float) Statics.field2378.method2724() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("cc.nt(D)V")
    public static final void method1990(double arg0) {
        class240.method4494(arg0);
        ((class252) class240.field2589.field2913).method4949(arg0);
        if (Statics.field472 != null) {
            Statics.field472.method8915();
        }
        class211.method3869();
        Statics.field2378.method2723(arg0);
    }

    @ObfuscatedName("qd.nv(IB)V")
    public static final void method7918(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field2378.method2726()) {
            return;
        }
        label22: {
            if (Statics.field2378.method2726() == 0) {
                boolean var2 = !class334.field3629.isEmpty();
                if (var2) {
                    class334.method4940(Statics.field205, var1);
                    field750 = false;
                    break label22;
                }
            }
            if (var1 == 0) {
                class334.method3533(0, 0);
                field750 = false;
            } else {
                class334.method200(var1);
            }
        }
        Statics.field2378.method2784(var1);
    }

    @ObfuscatedName("ne.nx(IB)V")
    public static final void method6406(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field2378.method2727(var1);
    }

    @ObfuscatedName("hr.nq(II)V")
    public static final void method3607(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field2378.method2791(var1);
    }

    @ObfuscatedName("nd.no(II)V")
    public static final void method6326(int arg0) {
        method3069();
        class72.method317();
        int var1 = class182.method696(arg0).field1899;
        if (var1 == 0) {
            return;
        }
        int var2 = class350.field3773[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method1990(0.9D);
            }
            if (var2 == 2) {
                method1990(0.8D);
            }
            if (var2 == 3) {
                method1990(0.7D);
            }
            if (var2 == 4) {
                method1990(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method7918(255);
            }
            if (var2 == 1) {
                method7918(192);
            }
            if (var2 == 2) {
                method7918(128);
            }
            if (var2 == 3) {
                method7918(64);
            }
            if (var2 == 4) {
                method7918(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method6406(127);
            }
            if (var2 == 1) {
                method6406(96);
            }
            if (var2 == 2) {
                method6406(64);
            }
            if (var2 == 3) {
                method6406(32);
            }
            if (var2 == 4) {
                method6406(0);
            }
        }
        if (var1 == 5) {
            field620 = var2 == 1;
        }
        if (var1 == 6) {
            field670 = var2;
        }
        if (var1 == 9) {
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method3607(127);
            }
            if (var2 == 1) {
                method3607(96);
            }
            if (var2 == 2) {
                method3607(64);
            }
            if (var2 == 3) {
                method3607(32);
            }
            if (var2 == 4) {
                method3607(0);
            }
        }
        if (var1 == 17) {
            field675 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class109[] var3 = new class109[] { class109.field1395, class109.field1400, class109.field1398, class109.field1397, class109.field1396 };
            field534 = (class109) class406.method3580(var3, var2);
            if (field534 == null) {
                field534 = class109.field1398;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field644 = -1;
            } else {
                field644 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class109[] var4 = new class109[] { class109.field1395, class109.field1400, class109.field1398, class109.field1397, class109.field1396 };
        field535 = (class109) class406.method3580(var4, var2);
        if (field535 == null) {
            field535 = class109.field1398;
        }
    }

    @ObfuscatedName("lo.ni(Lng;I)V")
    public static final void method5811(class362 arg0) {
        int var1 = arg0.field3883;
        if (var1 == 324) {
            if (field785 == -1) {
                field785 = arg0.field3914;
                field786 = arg0.field4022;
            }
            if (field605.field3821 == 1) {
                arg0.field3914 = field785;
            } else {
                arg0.field3914 = field786;
            }
        } else if (var1 == 325) {
            if (field785 == -1) {
                field785 = arg0.field3914;
                field786 = arg0.field4022;
            }
            if (field605.field3821 == 1) {
                arg0.field3914 = field786;
            } else {
                arg0.field3914 = field785;
            }
        } else if (var1 == 327) {
            arg0.field3931 = 150;
            arg0.field3932 = (int) (Math.sin((double) field518 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4034 = 5;
            arg0.field4017 = 0;
        } else if (var1 == 328) {
            arg0.field3931 = 150;
            arg0.field3932 = (int) (Math.sin((double) field518 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4034 = 5;
            arg0.field4017 = 1;
        }
    }

    @ObfuscatedName("ce.ns(I)V")
    public static final void method1192() {
        class325 var0 = class325.method2983(class323.field3341, field784.field1485);
        field784.method3070(var0);
        class73.field864 = true;
        for (class90 var1 = (class90) field667.method8996(); var1 != null; var1 = (class90) field667.method8999()) {
            if (var1.field1091 == 0 || var1.field1091 == 3) {
                method7489(var1, true);
            }
        }
        if (field671 != null) {
            method2944(field671);
            field671 = null;
        }
        class73.field864 = false;
    }

    @ObfuscatedName("dl.nw(IIII)Ldm;")
    public static final class90 method2472(int arg0, int arg1, int arg2) {
        class90 var3 = new class90();
        var3.field1090 = arg1;
        var3.field1091 = arg2;
        field667.method8990(var3, (long) arg0);
        method3702(arg1);
        class362 var4 = Statics.field4741.method6314(arg0);
        method2944(var4);
        if (field671 != null) {
            method2944(field671);
            field671 = null;
        }
        method861(Statics.field4741.field3785[arg0 >> 16], var4, false);
        class73.method1232(arg1);
        if (field723 != -1) {
            method8352(field723, 1);
        }
        return var3;
    }

    @ObfuscatedName("qo.nb(Ldm;ZI)V")
    public static final void method7489(class90 arg0, boolean arg1) {
        int var2 = arg0.field1090;
        int var3 = (int) arg0.field5170;
        arg0.method8667();
        if (arg1) {
            Statics.field4741.method6296(var2);
        }
        for (class514 var4 = (class514) field713.method8996(); var4 != null; var4 = (class514) field713.method8999()) {
            if ((long) var2 == (var4.field5170 >> 48 & 0xFFFFL)) {
                var4.method8667();
            }
        }
        class362 var5 = Statics.field4741.method6314(var3);
        if (var5 != null) {
            method2944(var5);
        }
        if (field723 != -1) {
            method8352(field723, 1);
        }
    }

    @ObfuscatedName("ko.nn(Lng;B)Z")
    public static final boolean method5277(class362 arg0) {
        int var1 = arg0.field3883;
        if (var1 == 205) {
            field568 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field605.method6353(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field605.method6392(var4, var5 == 1);
        }
        if (var1 == 324) {
            field605.method6335(0);
        }
        if (var1 == 325) {
            field605.method6335(1);
        }
        if (var1 == 326) {
            class325 var6 = class325.method2983(class556.field5458 >= 224 ? class323.field3384 : class323.field3380, field784.field1485);
            field605.method6336(var6.field3433);
            field784.method3070(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("jt.nj(Lng;IIII)V")
    public static final void method4667(class362 arg0, int arg1, int arg2, int arg3) {
        method3410();
        class349 var4 = arg0.method6731(Statics.field4741, false);
        if (var4 == null) {
            return;
        }
        class568.method9608(arg1, arg2, var4.field3766 + arg1, var4.field3770 + arg2);
        if (field771 == 2 || field771 == 5) {
            class568.method9628(arg1, arg2, 0, var4.field3769, var4.field3768);
        } else {
            int var5 = field592 & 0x7FF;
            int var6 = 48 + Statics.field194.method1225() / 32;
            int var7 = 464 - Statics.field194.method1223() / 32;
            Statics.field378.method9803(arg1, arg2, var4.field3766, var4.field3770, var6, var7, var5, 256, var4.field3769, var4.field3768);
            for (int var8 = 0; var8 < field743; var8++) {
                int var9 = field744[var8] * 4 + 2 - Statics.field194.method1225() / 32;
                int var10 = field745[var8] * 4 + 2 - Statics.field194.method1223() / 32;
                method7485(arg1, arg2, var9, var10, field693[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class411 var13 = Statics.field2071.field1359[Statics.field2071.field1344][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field194.method1225() / 32;
                        int var15 = var12 * 4 + 2 - Statics.field194.method1223() / 32;
                        method7485(arg1, arg2, var14, var15, Statics.field893[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < Statics.field2071.field1360; var16++) {
                class106 var17 = Statics.field2071.field1353[Statics.field2071.field1342[var16]];
                if (var17 != null && var17.method2526()) {
                    class195 var18 = var17.field1372;
                    if (var18 != null && var18.field2042 != null) {
                        var18 = var18.method3733();
                    }
                    if (var18 != null && var18.field2011 && var18.field2016) {
                        int var19 = var17.field1247 / 32 - Statics.field194.method1225() / 32;
                        int var20 = var17.field1270 / 32 - Statics.field194.method1223() / 32;
                        method7485(arg1, arg2, var19, var20, Statics.field893[1], var4);
                    }
                }
            }
            int var21 = field583.field1426;
            int[] var22 = field583.field1427;
            for (int var23 = 0; var23 < var21; var23++) {
                class95 var24 = Statics.field2071.field1357[var22[var23]];
                if (var24 != null && var24.method2526() && !var24.field1142 && Statics.field3772 != var24) {
                    int var25 = var24.field1247 / 32 - Statics.field194.method1225() / 32;
                    int var26 = var24.field1270 / 32 - Statics.field194.method1223() / 32;
                    if (var24.method2508()) {
                        method7485(arg1, arg2, var25, var26, Statics.field893[3], var4);
                    } else if (Statics.field3772.field1155 != 0 && var24.field1155 != 0 && Statics.field3772.field1155 == var24.field1155) {
                        method7485(arg1, arg2, var25, var26, Statics.field893[4], var4);
                    } else if (var24.method2511()) {
                        method7485(arg1, arg2, var25, var26, Statics.field893[5], var4);
                    } else if (var24.method2516()) {
                        method7485(arg1, arg2, var25, var26, Statics.field893[6], var4);
                    } else {
                        method7485(arg1, arg2, var25, var26, Statics.field893[2], var4);
                    }
                }
            }
            if (field526 != 0 && field518 % 20 < 10) {
                if (field526 == 1 && field677 >= 0 && field677 < Statics.field2071.field1353.length) {
                    class106 var27 = Statics.field2071.field1353[field677];
                    if (var27 != null) {
                        int var28 = var27.field1247 / 32 - Statics.field194.method1225() / 32;
                        int var29 = var27.field1270 / 32 - Statics.field194.method1223() / 32;
                        method177(arg1, arg2, var28, var29, Statics.field1589[1], var4);
                    }
                }
                if (field526 == 2) {
                    int var30 = field529 * 4 - Statics.field2071.field1347 * 4 + 2 - Statics.field194.method1225() / 32;
                    int var31 = field725 * 4 - Statics.field2071.field1348 * 4 + 2 - Statics.field194.method1223() / 32;
                    method177(arg1, arg2, var30, var31, Statics.field1589[1], var4);
                }
                if (field526 == 10 && field528 >= 0 && field528 < Statics.field2071.field1357.length) {
                    class95 var32 = Statics.field2071.field1357[field528];
                    if (var32 != null) {
                        int var33 = var32.field1247 / 32 - Statics.field194.method1225() / 32;
                        int var34 = var32.field1270 / 32 - Statics.field194.method1223() / 32;
                        method177(arg1, arg2, var33, var34, Statics.field1589[1], var4);
                    }
                }
            }
            if (field747 != 0) {
                int var35 = field747 * 4 + 2 - Statics.field194.method1225() / 32;
                int var36 = field748 * 4 + 2 - Statics.field194.method1223() / 32;
                method7485(arg1, arg2, var35, var36, Statics.field1589[0], var4);
            }
            if (!Statics.field3772.field1142) {
                class568.method9616(var4.field3766 / 2 + arg1 - 1, var4.field3770 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field717[arg3] = true;
    }

    @ObfuscatedName("ck.nm(Lng;IIIB)V")
    public static final void method2260(class362 arg0, int arg1, int arg2, int arg3) {
        class349 var4 = arg0.method6731(Statics.field4741, false);
        if (var4 == null) {
            return;
        }
        if (field771 < 3) {
            Statics.field37.method9803(arg1, arg2, var4.field3766, var4.field3770, 25, 25, field592, 256, var4.field3769, var4.field3768);
        } else {
            class568.method9628(arg1, arg2, 0, var4.field3769, var4.field3768);
        }
    }

    @ObfuscatedName("ar.ny(IIIILvv;Lnw;I)V")
    public static final void method177(int arg0, int arg1, int arg2, int arg3, class572 arg4, class349 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method7485(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field592 & 0x7FF;
        int var8 = class240.field2591[var7];
        int var9 = class240.field2592[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3766 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field4764.method9760(arg5.field3766 / 2 + arg0 - var17 / 2 + var15, arg5.field3770 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("qo.nk(IIIILvv;Lnw;S)V")
    public static final void method7485(int arg0, int arg1, int arg2, int arg3, class572 arg4, class349 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field592 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class240.field2591[var6];
        int var9 = class240.field2592[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method9758(arg5.field3766 / 2 + var10 - arg4.field5565 / 2, arg5.field3770 / 2 - var11 - arg4.field5563 / 2, arg0, arg1, arg5.field3766, arg5.field3770, arg5.field3769, arg5.field3768);
        } else {
            arg4.method9825(arg5.field3766 / 2 + arg0 + var10 - arg4.field5565 / 2, arg5.field3770 / 2 + arg1 - var11 - arg4.field5563 / 2);
        }
    }

    @ObfuscatedName("ds.nc(I)V")
    public static final void method2494() {
        Iterator var0 = field684.iterator();
        while (var0.hasNext()) {
            class104 var1 = (class104) var0.next();
            for (int var2 = 0; var2 < field583.field1426; var2++) {
                class95 var3 = var1.field1357[field583.field1427[var2]];
                if (var3 != null) {
                    var3.method2509();
                }
            }
        }
        Iterator var4 = class116.field1464.iterator();
        while (var4.hasNext()) {
            class65 var5 = (class65) var4.next();
            var5.method1182();
        }
        if (Statics.field1216 != null) {
            Statics.field1216.method8277();
        }
    }

    @ObfuscatedName("od.nd(B)V")
    public static final void method6902() {
        class116.method1162();
        if (Statics.field1216 != null) {
            Statics.field1216.method8290();
        }
    }

    @ObfuscatedName("nm.na(B)V")
    public static final void method6312() {
        Iterator var0 = field684.iterator();
        while (var0.hasNext()) {
            class104 var1 = (class104) var0.next();
            for (int var2 = 0; var2 < field583.field1426; var2++) {
                class95 var3 = Statics.field2071.field1357[field583.field1427[var2]];
                if (var3 != null) {
                    var3.method2512();
                }
            }
        }
    }

    @ObfuscatedName("fk.ne(I)V")
    public static final void method3412() {
        field587 = field555;
    }

    @ObfuscatedName("sz.nz(I)V")
    public static final void method8407() {
        field701 = field555;
        Statics.field2470 = true;
    }

    @ObfuscatedName("gn.nr(I)V")
    public static final void method3443() {
        field702 = field555;
        Statics.field849 = true;
    }

    @ObfuscatedName("al.nl(Ljava/lang/String;I)V")
    public static final void method321(String arg0) {
        if (!arg0.equals("")) {
            class325 var1 = class325.method2983(class323.field3410, field784.field1485);
            var1.field3433.method9241(class558.method1876(arg0));
            var1.field3433.method9248(arg0);
            field784.method3070(var1);
        }
    }

    @ObfuscatedName("cg.nu(S)V")
    public static final void method1199() {
        class325 var0 = class325.method2983(class323.field3410, field784.field1485);
        var0.field3433.method9241(0);
        field784.method3070(var0);
    }

    @ObfuscatedName("ct.oh(IIB)V")
    public static final void method1919(int arg0, int arg1) {
        class171 var2 = arg0 >= 0 ? field741[arg0] : Statics.field1750;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3541()) {
            return;
        }
        class153 var3 = (class153) var2.field1836.get(arg1);
        if (var3.field1714 != -1) {
            return;
        }
        String var4 = var3.field1712.method9989();
        class325 var5 = class325.method2983(class323.field3409, field784.field1485);
        var5.field3433.method9241(3 + class558.method1876(var4));
        var5.field3433.method9241(arg0);
        var5.field3433.method9257(arg1);
        var5.field3433.method9248(var4);
        field784.method3070(var5);
    }

    @ObfuscatedName("cx.oe(III)V")
    public static final void method1211(int arg0, int arg1) {
        if (field741[arg0] == null || arg1 < 0 || arg1 >= field741[arg0].method3541()) {
            return;
        }
        class153 var2 = (class153) field741[arg0].field1836.get(arg1);
        if (var2.field1714 != -1) {
            return;
        }
        class325 var3 = class325.method2983(class323.field3318, field784.field1485);
        var3.field3433.method9241(3 + class558.method1876(var2.field1712.method9989()));
        var3.field3433.method9241(arg0);
        var3.field3433.method9257(arg1);
        var3.field3433.method9248(var2.field1712.method9989());
        field784.method3070(var3);
    }

    @ObfuscatedName("mz.ox(IIZB)V")
    public static final void method5970(int arg0, int arg1, boolean arg2) {
        if (field741[arg0] == null || arg1 < 0 || arg1 >= field741[arg0].method3541()) {
            return;
        }
        class153 var3 = (class153) field741[arg0].field1836.get(arg1);
        class325 var4 = class325.method2983(class323.field3399, field784.field1485);
        var4.field3433.method9241(4 + class558.method1876(var3.field1712.method9989()));
        var4.field3433.method9241(arg0);
        var4.field3433.method9257(arg1);
        var4.field3433.method9247(arg2);
        var4.field3433.method9248(var3.field1712.method9989());
        field784.method3070(var4);
    }

    @ObfuscatedName("dc.od(Lng;I)Z")
    public static boolean method2348(class362 arg0) {
        return arg0.field3899;
    }

    @ObfuscatedName("sr.of(Lng;IS)Ljava/lang/String;")
    public static String method8425(class362 arg0, int arg1) {
        if (!class363.method8570(Statics.method3563(arg0), arg1) && arg0.field3890 == null) {
            return null;
        } else if (arg0.field3964 == null || arg0.field3964.length <= arg1 || arg0.field3964[arg1] == null || arg0.field3964[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field3964[arg1];
        }
    }

    @ObfuscatedName("ik.oi(Lng;I)Ljava/lang/String;")
    public static String method4322(class362 arg0) {
        if (Statics.method2504(Statics.method3563(arg0)) == 0) {
            return null;
        } else if (arg0.field3988 == null || arg0.field3988.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3988;
        }
    }

    @ObfuscatedName("el.ov(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method3043(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field530 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field530 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field530 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field530 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field530 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1669 != null) {
            var3 = "/p=" + Statics.field1669;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3268 + "/a=" + Statics.field5508 + var3 + "/";
    }

    @ObfuscatedName("ad.oq(Ljava/lang/String;I)V")
    public static void method264(String arg0) {
        Statics.field1669 = arg0;
        try {
            String var1 = Statics.field995.getParameter(Integer.toString(18));
            String var2 = Statics.field995.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class330.method2257() + 94608000000L;
                class367.field4049.setTime(new Date(var6));
                int var8 = class367.field4049.get(7);
                int var9 = class367.field4049.get(5);
                int var10 = class367.field4049.get(2);
                int var11 = class367.field4049.get(1);
                int var12 = class367.field4049.get(11);
                int var13 = class367.field4049.get(12);
                int var14 = class367.field4049.get(13);
                String var15 = class367.field4048[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class367.field4050[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field995;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("qz.ok(Ljava/lang/String;ZI)V")
    public static void method7735(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2267; var5++) {
            class211 var6 = class211.method7530(var5);
            if ((!arg1 || var6.field2284) && var6.field2275 == -1 && var6.field2282.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1845 = -1;
                    Statics.field5021 = null;
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
        Statics.field5021 = var3;
        Statics.field2080 = 0;
        Statics.field1845 = var4;
        String[] var9 = new String[Statics.field1845];
        for (int var10 = 0; var10 < Statics.field1845; var10++) {
            var9[var10] = class211.method7530(var3[var10]).field2282;
        }
        short[] var11 = Statics.field5021;
        class552.method3071(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("fy.os([BII)V")
    public static void method3430(byte[] arg0, int arg1) {
        if (field635 == null) {
            field635 = new byte[24];
        }
        class452.method8108(arg0, arg1, field635, 0, 24);
    }

    @ObfuscatedName("ek.oc(Lvl;IB)V")
    public static void method2943(class558 arg0, int arg1) {
        method3430(arg0.field5463, arg1);
        class221.method2502(arg0, arg1);
    }

    @ObfuscatedName("client.oy(I)Lwx;")
    public class581 method1266() {
        return Statics.field3772 == null ? null : Statics.field3772.field1141;
    }

    @ObfuscatedName("fp.ot(I)Z")
    public static boolean method3291() {
        return field674 >= 2;
    }

    @ObfuscatedName("hg.ow(II)V")
    public static void method3857(int arg0) {
        field797 = arg0;
    }

    @ObfuscatedName("du.oj(I)V")
    public static void method2447() {
        field784.method3070(class325.method2983(class323.field3327, field784.field1485));
        field797 = 0;
    }

    @ObfuscatedName("km.om(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method5237(String arg0) {
        class386[] var1 = class386.method5893();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class386 var3 = var1[var2];
            if (var3.field4523 != -1 && arg0.startsWith(class107.method2432(var3.field4523))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4523).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("jo.ob(I)V")
    public static void method4948() {
        if (Statics.field923 == null) {
            return;
        }
        field801 = field518;
        Statics.field923.method7190();
        for (int var0 = 0; var0 < Statics.field2071.field1357.length; var0++) {
            if (Statics.field2071.field1357[var0] != null) {
                Statics.field923.method7189((Statics.field2071.field1357[var0].field1247 >> 7) + Statics.field2071.field1347, (Statics.field2071.field1357[var0].field1270 >> 7) + Statics.field2071.field1348);
            }
        }
    }

    @ObfuscatedName("ne.oo(I)Z")
    public static boolean method6362() {
        return Statics.field2378.method2785() >= field538;
    }

    @ObfuscatedName("gu.op(I)V")
    public static void method3582() {
        Statics.field2378.method2733(field538);
    }

    @ObfuscatedName("fz.ol(Lch;B)V")
    public static void method3428(class69 arg0) {
        if (Statics.field3765 != arg0) {
            Statics.field3765 = arg0;
        }
    }

    @ObfuscatedName("da.or(ZI)V")
    public static void method2370(boolean arg0) {
        field620 = arg0;
    }

    @ObfuscatedName("gw.oz(II)Lvd;")
    public static class549 method3560(int arg0) {
        class549 var1 = (class549) field782.method5928((long) arg0);
        if (var1 == null) {
            var1 = new class549(Statics.field1760, class551.method8934(arg0), class551.method2002(arg0));
            field782.method5931(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("hg.pg(II)Lvd;")
    public static class549 method3863(int arg0) {
        class549 var1 = (class549) field792.method5928((long) arg0);
        if (var1 == null) {
            var1 = new class549(Statics.field1760, arg0);
        }
        return var1;
    }

    @ObfuscatedName("mz.pe(I)Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard method5972() {
        return Statics.field995.method495();
    }

    @ObfuscatedName("rl.pk(IB)V")
    public static void method8200(int arg0) {
        class213 var1 = class213.method6692(arg0);
        if (var1.method4100() && class213.method3217(var1.field2310) == 2) {
            field799.add(var1.field2310);
        }
    }

    @ObfuscatedName("client.pw(II)V")
    public void method1765(int arg0) {
        class325 var2 = class325.method2983(class323.field3395, field784.field1485);
        var2.field3433.method9241(arg0);
        field784.method3070(var2);
    }

    @ObfuscatedName("client.pq(II)V")
    public void method1797(int arg0) {
        class325 var2 = class325.method2983(class323.field3331, field784.field1485);
        var2.field3433.method9241(arg0);
        field784.method3070(var2);
    }
}

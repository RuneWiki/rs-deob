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

public final class client extends class35 implements class464, OAuthApi, class336 {

    @ObfuscatedName("client.by")
    public static boolean field552 = true;

    @ObfuscatedName("client.cw")
    public static int field600 = 1;

    @ObfuscatedName("client.ck")
    public static int field718 = 0;

    @ObfuscatedName("client.ch")
    public static int field575 = 0;

    @ObfuscatedName("client.cs")
    public static boolean field571 = false;

    @ObfuscatedName("client.cm")
    public static boolean field642 = false;

    @ObfuscatedName("client.co")
    public static int field532 = -1;

    @ObfuscatedName("client.cf")
    public static int field604 = -1;

    @ObfuscatedName("client.ce")
    public static int field534 = -1;

    @ObfuscatedName("client.cz")
    public static boolean field608 = false;

    @ObfuscatedName("client.ca")
    public static int field558 = 222;

    @ObfuscatedName("client.dm")
    public static boolean field528 = false;

    @ObfuscatedName("client.dr")
    public static boolean field685 = false;

    @ObfuscatedName("client.db")
    public static int field598 = 0;

    @ObfuscatedName("client.do")
    public static boolean field540 = false;

    @ObfuscatedName("client.ds")
    public static boolean field541 = false;

    @ObfuscatedName("client.df")
    public static boolean field542 = true;

    @ObfuscatedName("client.dz")
    public static int field821 = 0;

    @ObfuscatedName("client.dw")
    public static int field544 = 0;

    @ObfuscatedName("client.dg")
    public static long field545 = 1L;

    @ObfuscatedName("client.dc")
    public static int field752 = -1;

    @ObfuscatedName("client.de")
    public static int field547 = -1;

    @ObfuscatedName("client.dn")
    public static long field548 = -1L;

    @ObfuscatedName("client.dl")
    public static boolean field549 = true;

    @ObfuscatedName("client.dk")
    public static int field692 = 0;

    @ObfuscatedName("client.dh")
    public static int field785 = 0;

    @ObfuscatedName("client.dy")
    public static int field611 = 0;

    @ObfuscatedName("client.di")
    public static int field818 = 0;

    @ObfuscatedName("client.dx")
    public static int field770 = 0;

    @ObfuscatedName("client.dt")
    public static int field555 = 0;

    @ObfuscatedName("client.dp")
    public static int field556 = 0;

    @ObfuscatedName("client.dv")
    public static int field557 = 0;

    @ObfuscatedName("client.ei")
    public static int field535 = 0;

    @ObfuscatedName("client.ej")
    public static class107 field559 = class107.field1387;

    @ObfuscatedName("client.em")
    public static class107 field560 = class107.field1387;

    @ObfuscatedName("client.ev")
    public static boolean field561 = false;

    @ObfuscatedName("client.ey")
    public static class95 field562 = class95.field1167;

    @ObfuscatedName("client.ec")
    public static int field658 = 0;

    @ObfuscatedName("client.eu")
    public static int field564 = 0;

    @ObfuscatedName("client.fn")
    public static int field627 = 0;

    @ObfuscatedName("client.fu")
    public static int field536 = 0;

    @ObfuscatedName("client.fq")
    public static int field567 = 0;

    @ObfuscatedName("client.fd")
    public static int field631 = 0;

    @ObfuscatedName("client.ff")
    public static class144 field569 = class144.field1671;

    @ObfuscatedName("client.fi")
    public static class551 field570 = class551.field5404;

    @ObfuscatedName("client.go")
    public String field701;

    @ObfuscatedName("client.gl")
    public class15 field572;

    @ObfuscatedName("client.gk")
    public class19 field748;

    @ObfuscatedName("client.gr")
    public OtlTokenRequester field653;

    @ObfuscatedName("client.gb")
    public Future field568;

    @ObfuscatedName("client.gv")
    public boolean field810 = false;

    @ObfuscatedName("client.gu")
    public int field577 = 0;

    @ObfuscatedName("client.gh")
    public class19 field578;

    @ObfuscatedName("client.ge")
    public RefreshAccessTokenRequester field646;

    @ObfuscatedName("client.gz")
    public Future field580;

    @ObfuscatedName("client.gd")
    public static final String field581;

    @ObfuscatedName("client.gw")
    public static final String field582;

    @ObfuscatedName("client.hu")
    public static boolean field583;

    @ObfuscatedName("client.hy")
    public static class80 field662;

    @ObfuscatedName("client.hw")
    public class546 field533;

    @ObfuscatedName("client.hd")
    public class8 field586;

    @ObfuscatedName("client.hr")
    public long field587 = -1L;

    @ObfuscatedName("client.hk")
    public static byte[] field588;

    @ObfuscatedName("client.hs")
    public static int field589;

    @ObfuscatedName("client.hz")
    public static int[] field590;

    @ObfuscatedName("client.iq")
    public static final class115 field591;

    @ObfuscatedName("client.ie")
    public static int field592;

    @ObfuscatedName("client.if")
    public static boolean field593;

    @ObfuscatedName("client.ig")
    public static class451 field594;

    @ObfuscatedName("client.it")
    public static String field546;

    @ObfuscatedName("client.ij")
    public static HashMap field595;

    @ObfuscatedName("client.iu")
    public static int field596;

    @ObfuscatedName("client.ih")
    public static int field597;

    @ObfuscatedName("client.iw")
    public static int field700;

    @ObfuscatedName("client.is")
    public static int field639;

    @ObfuscatedName("client.ir")
    public static int field585;

    @ObfuscatedName("client.jw")
    public static int[][][] field602;

    @ObfuscatedName("client.jz")
    public static boolean field603;

    @ObfuscatedName("client.js")
    public static int[][][] field610;

    @ObfuscatedName("client.jg")
    public static final int[] field605;

    @ObfuscatedName("client.jk")
    public static int field754;

    @ObfuscatedName("client.jo")
    public static int field607;

    @ObfuscatedName("client.kg")
    public static int field760;

    @ObfuscatedName("client.ko")
    public static int field609;

    @ObfuscatedName("client.kp")
    public static int field527;

    @ObfuscatedName("client.kk")
    public static int field663;

    @ObfuscatedName("client.ka")
    public static boolean field612;

    @ObfuscatedName("client.kt")
    public static int field613;

    @ObfuscatedName("client.ky")
    public static int field614;

    @ObfuscatedName("client.kz")
    public static int field615;

    @ObfuscatedName("client.ks")
    public static int field666;

    @ObfuscatedName("client.ki")
    public static int field617;

    @ObfuscatedName("client.ku")
    public static int field827;

    @ObfuscatedName("client.kh")
    public static int field619;

    @ObfuscatedName("client.kx")
    public static int field620;

    @ObfuscatedName("client.lc")
    public static int field565;

    @ObfuscatedName("client.ly")
    public static int field622;

    @ObfuscatedName("client.le")
    public static int field623;

    @ObfuscatedName("client.lu")
    public static int field624;

    @ObfuscatedName("client.lg")
    public static int field625;

    @ObfuscatedName("client.ln")
    public static int field626;

    @ObfuscatedName("client.lf")
    public static int field806;

    @ObfuscatedName("client.lo")
    public static boolean field628;

    @ObfuscatedName("client.ls")
    public static int field629;

    @ObfuscatedName("client.lv")
    public static boolean field630;

    @ObfuscatedName("client.ll")
    public static int field616;

    @ObfuscatedName("client.lt")
    public static int field632;

    @ObfuscatedName("client.lr")
    public static int field633;

    @ObfuscatedName("client.lw")
    public static int[] field634;

    @ObfuscatedName("client.lk")
    public static int[] field635;

    @ObfuscatedName("client.lx")
    public static int[] field636;

    @ObfuscatedName("client.lz")
    public static int[] field563;

    @ObfuscatedName("client.la")
    public static int[] field649;

    @ObfuscatedName("client.lp")
    public static int[] field743;

    @ObfuscatedName("client.ld")
    public static int[][] field788;

    @ObfuscatedName("client.lj")
    public static int[] field641;

    @ObfuscatedName("client.lm")
    public static String[] field695;

    @ObfuscatedName("client.mb")
    public static int field643;

    @ObfuscatedName("client.mh")
    public static int field644;

    @ObfuscatedName("client.mv")
    public static int field529;

    @ObfuscatedName("client.mq")
    public static int field741;

    @ObfuscatedName("client.mf")
    public static int field647;

    @ObfuscatedName("client.mi")
    public static int field648;

    @ObfuscatedName("client.mc")
    public static int field778;

    @ObfuscatedName("client.mn")
    public static boolean field650;

    @ObfuscatedName("client.md")
    public static int field651;

    @ObfuscatedName("client.mj")
    public static boolean field664;

    @ObfuscatedName("client.me")
    public static int field689;

    @ObfuscatedName("client.mo")
    public static int field654;

    @ObfuscatedName("client.mk")
    public static long field655;

    @ObfuscatedName("client.mg")
    public static long field656;

    @ObfuscatedName("client.ma")
    public static boolean field723;

    @ObfuscatedName("client.ml")
    public static int field573;

    @ObfuscatedName("client.no")
    public static int field659;

    @ObfuscatedName("client.ne")
    public static int[] field660;

    @ObfuscatedName("client.ns")
    public static final int[] field661;

    @ObfuscatedName("client.nr")
    public static String[] field722;

    @ObfuscatedName("client.nq")
    public static boolean[] field645;

    @ObfuscatedName("client.nw")
    public static int[] field804;

    @ObfuscatedName("client.nm")
    public static int field665;

    @ObfuscatedName("client.nj")
    public static int[] field538;

    @ObfuscatedName("client.nl")
    public static int[] field667;

    @ObfuscatedName("client.nk")
    public static int[] field668;

    @ObfuscatedName("client.nz")
    public static int[] field670;

    @ObfuscatedName("client.nu")
    public static boolean field537;

    @ObfuscatedName("client.nv")
    public static boolean field671;

    @ObfuscatedName("client.nb")
    public static int field672;

    @ObfuscatedName("client.nf")
    public static int[] field673;

    @ObfuscatedName("client.nd")
    public static int[] field674;

    @ObfuscatedName("client.na")
    public static int[] field675;

    @ObfuscatedName("client.nx")
    public static int[] field676;

    @ObfuscatedName("client.ni")
    public static int[] field677;

    @ObfuscatedName("client.nc")
    public static int[] field678;

    @ObfuscatedName("client.of")
    public static String[] field679;

    @ObfuscatedName("client.oo")
    public static String[] field680;

    @ObfuscatedName("client.oi")
    public static boolean[] field681;

    @ObfuscatedName("client.op")
    public static boolean field682;

    @ObfuscatedName("client.oh")
    public static boolean field683;

    @ObfuscatedName("client.oe")
    public static boolean field684;

    @ObfuscatedName("client.oq")
    public static int field704;

    @ObfuscatedName("client.ob")
    public static int field686;

    @ObfuscatedName("client.oy")
    public static int field781;

    @ObfuscatedName("client.on")
    public static int field688;

    @ObfuscatedName("client.ow")
    public static int field745;

    @ObfuscatedName("client.og")
    public static boolean field691;

    @ObfuscatedName("client.om")
    public static int field638;

    @ObfuscatedName("client.ot")
    public static int field530;

    @ObfuscatedName("client.oc")
    public static String field694;

    @ObfuscatedName("client.or")
    public static String field621;

    @ObfuscatedName("client.oj")
    public static int field783;

    @ObfuscatedName("client.oa")
    public static class520 field697;

    @ObfuscatedName("client.pt")
    public static int field698;

    @ObfuscatedName("client.pm")
    public static int field699;

    @ObfuscatedName("client.pg")
    public static int field531;

    @ObfuscatedName("client.pf")
    public static class358 field576;

    @ObfuscatedName("client.pr")
    public static int field702;

    @ObfuscatedName("client.pa")
    public static int field703;

    @ObfuscatedName("client.pc")
    public static int field669;

    @ObfuscatedName("client.py")
    public static int field705;

    @ObfuscatedName("client.pl")
    public static boolean field706;

    @ObfuscatedName("client.pe")
    public static class358 field584;

    @ObfuscatedName("client.pn")
    public static class358 field708;

    @ObfuscatedName("client.px")
    public static class358 field709;

    @ObfuscatedName("client.pk")
    public static int field687;

    @ObfuscatedName("client.pw")
    public static int field711;

    @ObfuscatedName("client.ps")
    public static class358 field712;

    @ObfuscatedName("client.pq")
    public static boolean field735;

    @ObfuscatedName("client.pj")
    public static int field714;

    @ObfuscatedName("client.pb")
    public static int field796;

    @ObfuscatedName("client.pi")
    public static boolean field716;

    @ObfuscatedName("client.po")
    public static int field717;

    @ObfuscatedName("client.pz")
    public static int field749;

    @ObfuscatedName("client.pv")
    public static boolean field719;

    @ObfuscatedName("client.qa")
    public static int field720;

    @ObfuscatedName("client.qz")
    public static int[] field721;

    @ObfuscatedName("client.ql")
    public static int field762;

    @ObfuscatedName("client.qx")
    public static int[] field798;

    @ObfuscatedName("client.qg")
    public static int field724;

    @ObfuscatedName("client.qm")
    public static int[] field725;

    @ObfuscatedName("client.qq")
    public static int field726;

    @ObfuscatedName("client.qr")
    public static int[] field707;

    @ObfuscatedName("client.qc")
    public static int field728;

    @ObfuscatedName("client.qb")
    public static int field729;

    @ObfuscatedName("client.qw")
    public static int field730;

    @ObfuscatedName("client.qs")
    public static int field731;

    @ObfuscatedName("client.qo")
    public static int field732;

    @ObfuscatedName("client.qt")
    public static int field746;

    @ObfuscatedName("client.qv")
    public static int field734;

    @ObfuscatedName("client.qh")
    public static int field652;

    @ObfuscatedName("client.qk")
    public static int field736;

    @ObfuscatedName("client.re")
    public static int field737;

    @ObfuscatedName("client.rs")
    public static class564 field738;

    @ObfuscatedName("client.rz")
    public static class406 field739;

    @ObfuscatedName("client.rc")
    public static class406 field740;

    @ObfuscatedName("client.rg")
    public static class406 field566;

    @ObfuscatedName("client.ri")
    public static class406 field742;

    @ObfuscatedName("client.rj")
    public static class520 field550;

    @ObfuscatedName("client.rb")
    public static int field744;

    @ObfuscatedName("client.rh")
    public static int field601;

    @ObfuscatedName("client.rv")
    public static boolean[] field657;

    @ObfuscatedName("client.rk")
    public static boolean[] field747;

    @ObfuscatedName("client.ru")
    public static boolean[] field758;

    @ObfuscatedName("client.rt")
    public static int[] field765;

    @ObfuscatedName("client.rl")
    public static int[] field750;

    @ObfuscatedName("client.rq")
    public static int[] field751;

    @ObfuscatedName("client.rm")
    public static int[] field800;

    @ObfuscatedName("client.ry")
    public static int field753;

    @ObfuscatedName("client.rp")
    public static long field579;

    @ObfuscatedName("client.rw")
    public static boolean field755;

    @ObfuscatedName("client.sg")
    public static int field543;

    @ObfuscatedName("client.sc")
    public static int field757;

    @ObfuscatedName("client.sk")
    public static int[] field826;

    @ObfuscatedName("client.sj")
    public static int field759;

    @ObfuscatedName("client.si")
    public static int field640;

    @ObfuscatedName("client.st")
    public static String field526;

    @ObfuscatedName("client.sm")
    public static long[] field773;

    @ObfuscatedName("client.sb")
    public static int field763;

    @ObfuscatedName("client.se")
    public static class231 field764;

    @ObfuscatedName("client.sr")
    public static class229 field553;

    @ObfuscatedName("client.sw")
    public static int field766;

    @ObfuscatedName("client.ss")
    public static int[] field767;

    @ObfuscatedName("client.sy")
    public static int[] field768;

    @ObfuscatedName("client.sz")
    public static long field769;

    @ObfuscatedName("client.sl")
    public static class159[] field713;

    @ObfuscatedName("client.sd")
    public static class168[] field727;

    @ObfuscatedName("client.sv")
    public static int field772;

    @ObfuscatedName("client.tw")
    public static int field776;

    @ObfuscatedName("client.ti")
    public static int[] field774;

    @ObfuscatedName("client.tj")
    public static int[] field775;

    @ObfuscatedName("client.tk")
    public static class560[] field618;

    @ObfuscatedName("client.tq")
    public static int field777;

    @ObfuscatedName("client.tm")
    public static int field637;

    @ObfuscatedName("client.tn")
    public static int field779;

    @ObfuscatedName("client.tg")
    public static boolean field780;

    @ObfuscatedName("client.th")
    public static int field693;

    @ObfuscatedName("client.tb")
    public static int[] field782;

    @ObfuscatedName("client.tz")
    public static int[] field606;

    @ObfuscatedName("client.tc")
    public static int[] field784;

    @ObfuscatedName("client.to")
    public static int[] field554;

    @ObfuscatedName("client.ta")
    public static int[] field786;

    @ObfuscatedName("client.tu")
    public static class40[] field787;

    @ObfuscatedName("client.uv")
    public static boolean field539;

    @ObfuscatedName("client.uh")
    public static boolean field789;

    @ObfuscatedName("client.ud")
    public static boolean field790;

    @ObfuscatedName("client.uj")
    public static boolean field791;

    @ObfuscatedName("client.uc")
    public static class511 field792;

    @ObfuscatedName("client.ub")
    public static class510 field793;

    @ObfuscatedName("client.ut")
    public static class510 field794;

    @ObfuscatedName("client.um")
    public static boolean field795;

    @ObfuscatedName("client.ua")
    public static boolean[] field599;

    @ObfuscatedName("client.vs")
    public static int[] field797;

    @ObfuscatedName("client.vt")
    public static int[] field715;

    @ObfuscatedName("client.vo")
    public static int[] field799;

    @ObfuscatedName("client.va")
    public static int[] field710;

    @ObfuscatedName("client.vj")
    public static short field801;

    @ObfuscatedName("client.vq")
    public static short field802;

    @ObfuscatedName("client.vd")
    public static short field803;

    @ObfuscatedName("client.vg")
    public static short field551;

    @ObfuscatedName("client.vf")
    public static short field805;

    @ObfuscatedName("client.vp")
    public static short field761;

    @ObfuscatedName("client.vx")
    public static short field696;

    @ObfuscatedName("client.vm")
    public static short field808;

    @ObfuscatedName("client.vl")
    public static int field809;

    @ObfuscatedName("client.vc")
    public static int field807;

    @ObfuscatedName("client.vi")
    public static int field811;

    @ObfuscatedName("client.vk")
    public static int field812;

    @ObfuscatedName("client.vr")
    public static int field813;

    @ObfuscatedName("client.vh")
    public static class355 field814;

    @ObfuscatedName("client.vu")
    public static int field815;

    @ObfuscatedName("client.vw")
    public static int field816;

    @ObfuscatedName("client.vn")
    public static class507 field817;

    @ObfuscatedName("client.vb")
    public static class396[] field574;

    @ObfuscatedName("client.wg")
    public static class67 field819;

    @ObfuscatedName("client.ws")
    public static class461 field820;

    @ObfuscatedName("client.wt")
    public static class312 field690;

    @ObfuscatedName("client.wb")
    public static class312 field822;

    @ObfuscatedName("client.wk")
    public static int field823;

    @ObfuscatedName("client.wh")
    public static int field824;

    @ObfuscatedName("client.wc")
    public static List field825;

    @ObfuscatedName("client.wo")
    public static final class240 field771;

    @ObfuscatedName("client.wz")
    public static ArrayList field756;

    @ObfuscatedName("client.wi")
    public static int field828;

    @ObfuscatedName("client.wr")
    public static int field829;

    @ObfuscatedName("client.xw")
    public static final class66 field830;

    @ObfuscatedName("client.xq")
    public static int[] field831;

    @ObfuscatedName("client.xf")
    public static int[] field832;

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
        field581 = class414.method3233(var1);
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
        String var11 = class414.method3491(var6, 0, var6.length);
        field582 = var11;
        field583 = false;
        field662 = new class80();
        field588 = null;
        field589 = 0;
        field590 = new int[250];
        field591 = new class115();
        field592 = 0;
        field593 = false;
        field594 = new class451();
        field595 = new HashMap();
        field596 = 0;
        field597 = 1;
        field700 = 0;
        field639 = 1;
        field585 = 0;
        field602 = new int[4][13][13];
        field603 = false;
        field610 = new int[4][13][13];
        field605 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field754 = -1;
        field607 = 0;
        field760 = 2301979;
        field609 = 5063219;
        field527 = 3353893;
        field663 = 7759444;
        field612 = false;
        field613 = 0;
        field614 = 128;
        field615 = 0;
        field666 = 0;
        field617 = 0;
        field827 = 0;
        field619 = 0;
        field620 = 0;
        field565 = 50;
        field622 = 0;
        field623 = 0;
        field624 = 0;
        field625 = 12;
        field626 = 6;
        field806 = 0;
        field628 = false;
        field629 = 0;
        field630 = false;
        field616 = 0;
        field632 = 0;
        field633 = 50;
        field634 = new int[field633];
        field635 = new int[field633];
        field636 = new int[field633];
        field563 = new int[field633];
        field649 = new int[field633];
        field743 = new int[field633];
        field788 = new int[field633][];
        field641 = new int[field633];
        field695 = new String[field633];
        field643 = 0;
        field644 = -1;
        field529 = -1;
        field741 = 0;
        field647 = 0;
        field648 = 0;
        field778 = 0;
        field650 = true;
        field651 = 0;
        field664 = true;
        field689 = -1;
        field654 = 0;
        field655 = -1L;
        field656 = -1L;
        field723 = true;
        field573 = 0;
        field659 = 0;
        field660 = new int[1000];
        field661 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field722 = new String[8];
        field645 = new boolean[8];
        field804 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field665 = -1;
        field538 = new int[25];
        field667 = new int[25];
        field668 = new int[25];
        field670 = new int[25];
        field537 = false;
        field671 = false;
        field672 = 0;
        field673 = new int[500];
        field674 = new int[500];
        field675 = new int[500];
        field676 = new int[500];
        field677 = new int[500];
        field678 = new int[500];
        field679 = new String[500];
        field680 = new String[500];
        field681 = new boolean[500];
        field682 = false;
        field683 = false;
        field684 = true;
        field704 = -1;
        field686 = -1;
        field781 = 0;
        field688 = 50;
        field745 = 0;
        field546 = null;
        field691 = false;
        field638 = -1;
        field530 = -1;
        field694 = null;
        field621 = null;
        field783 = -1;
        field697 = new class520(8);
        field698 = 0;
        field699 = -1;
        field531 = 0;
        field576 = null;
        field702 = 0;
        field703 = 0;
        field669 = 0;
        field705 = -1;
        field706 = false;
        field584 = null;
        field708 = null;
        field709 = null;
        field687 = 0;
        field711 = 0;
        field712 = null;
        field735 = false;
        field714 = -1;
        field796 = -32669 * 715718325;
        field716 = false;
        field717 = -1;
        field749 = -1;
        field719 = false;
        field720 = 1;
        field721 = new int[32];
        field762 = 0;
        field798 = new int[32];
        field724 = 0;
        field725 = new int[32];
        field726 = 0;
        field707 = new int[32];
        field728 = 0;
        field729 = 0;
        field730 = 0;
        field731 = 0;
        field732 = 0;
        field746 = 0;
        field734 = 0;
        field652 = 0;
        field736 = 0;
        field737 = 0;
        field738 = new class564();
        field739 = new class406();
        field740 = new class406();
        field566 = new class406();
        field742 = new class406();
        field550 = new class520(512);
        field744 = 0;
        field601 = -2;
        field657 = new boolean[100];
        field747 = new boolean[100];
        field758 = new boolean[100];
        field765 = new int[100];
        field750 = new int[100];
        field751 = new int[100];
        field800 = new int[100];
        field753 = 0;
        field579 = 0L;
        field755 = true;
        field543 = 600;
        field757 = field543 / field189;
        field826 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field759 = 0;
        field640 = 0;
        field526 = "";
        field773 = new long[100];
        field763 = 0;
        field764 = new class231();
        field553 = new class229();
        field766 = 0;
        field767 = new int[128];
        field768 = new int[128];
        field769 = -1L;
        field713 = new class159[4];
        field727 = new class168[4];
        field772 = -1;
        field776 = 0;
        field774 = new int[1000];
        field775 = new int[1000];
        field618 = new class560[1000];
        field777 = 0;
        field637 = 0;
        field779 = 0;
        field780 = false;
        field693 = 0;
        field782 = new int[50];
        field606 = new int[50];
        field784 = new int[50];
        field554 = new int[50];
        field786 = new int[50];
        field787 = new class40[50];
        field539 = false;
        field789 = false;
        field790 = false;
        field791 = false;
        field792 = null;
        field793 = null;
        field794 = null;
        field795 = false;
        field599 = new boolean[5];
        field797 = new int[5];
        field715 = new int[5];
        field799 = new int[5];
        field710 = new int[5];
        field801 = 256;
        field802 = 205;
        field803 = 256;
        field551 = 320;
        field805 = 1;
        field761 = 32767;
        field696 = 1;
        field808 = 32767;
        field809 = 0;
        field807 = 0;
        field811 = 0;
        field812 = 0;
        field813 = 0;
        field814 = new class355();
        field815 = -1;
        field816 = -1;
        field817 = new class505();
        field574 = new class396[8];
        field819 = new class67();
        field820 = new class461(8, class459.field4878);
        field690 = new class312(64);
        field822 = new class312(64);
        field823 = -1;
        field824 = -1;
        field825 = new ArrayList();
        field771 = new class240();
        field756 = new ArrayList(10);
        field828 = 0;
        field829 = 0;
        field830 = new class66();
        field831 = new int[50];
        field832 = new int[50];
    }

    @ObfuscatedName("eo.gp(B)Ltf;")
    public static class506 method2890() {
        return Statics.field3741;
    }

    @ObfuscatedName("fx.hm(B)Ltb;")
    public static class514 method3048() {
        return Statics.field18;
    }

    @ObfuscatedName("client.ba(I)V")
    public final void method511() {
    }

    public final void init() {
        if (!this.method489()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class105.field1377)) {
                            field571 = true;
                        } else {
                            field571 = false;
                        }
                        break;
                    case 4:
                        if (field604 == -1) {
                            field604 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field718 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field1965 = Statics.method6794(Integer.parseInt(var2));
                        break;
                    case 7:
                        Statics.field2401 = class373.method1023(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class105.field1377)) {
                        }
                        break;
                    case 9:
                        Statics.field4746 = var2;
                        break;
                    case 10:
                        Statics.field1432 = (class374) class401.method2027(class374.method6473(), Integer.parseInt(var2));
                        if (Statics.field1432 == class374.field4061) {
                            Statics.field2521 = class524.field5222;
                        } else {
                            Statics.field2521 = class524.field5228;
                        }
                        break;
                    case 11:
                        Statics.field3559 = var2;
                        break;
                    case 12:
                        field600 = Integer.parseInt(var2);
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
                        Statics.field1814 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field575 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field2698 = var2;
                        break;
                    case 21:
                        field532 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field4077 = var2;
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field558 = Integer.parseInt(var2);
                        } else {
                            field558 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        class253.field2760 = false;
        field642 = false;
        Statics.field60 = this.getCodeBase().getHost();
        Statics.field33 = new class388();
        String var4 = Statics.field2401.field4053;
        byte var5 = 0;
        if ((field718 & class542.field5314.method34()) != 0) {
            Statics.field4076 = "beta";
        }
        try {
            class179.method2308("oldschool", Statics.field4076, var4, var5, 23);
        } catch (Exception var7) {
            class571.method8083((String) null, var7);
        }
        Statics.field1971 = this;
        Statics.field3145 = field604;
        Statics.field101 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field2503 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field48 = System.getenv("JX_SESSION_ID");
        Statics.field880 = System.getenv("JX_CHARACTER_ID");
        class78.method2828(System.getenv("JX_DISPLAY_NAME"));
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field810 = true;
        }
        if (field534 == -1) {
            if (this.method1162() || this.method1684()) {
                field534 = 5;
            } else {
                field534 = 0;
            }
        }
        this.method486(765, 503, 222, 1);
    }

    public void finalize() throws Throwable {
        class330.field3583.remove(this);
        super.finalize();
    }

    @ObfuscatedName("client.he(I)Z")
    public boolean method1692() {
        return this.field577 == 1;
    }

    public void setClient(int arg0) {
        this.field577 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field653 = arg0;
            class78.method3803(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field646 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field598 == 10;
    }

    public long getAccountHash() {
        return this.field587;
    }

    @ObfuscatedName("client.hj(I)Z")
    public boolean method1162() {
        return Statics.field101 != null && !Statics.field101.trim().isEmpty() && Statics.field2503 != null && !Statics.field2503.trim().isEmpty();
    }

    @ObfuscatedName("client.hg(I)Z")
    public boolean method1684() {
        return Statics.field48 != null && !Statics.field48.trim().isEmpty() && Statics.field880 != null && !Statics.field880.trim().isEmpty();
    }

    @ObfuscatedName("client.hb(I)Z")
    public boolean method1244() {
        return this.field653 != null;
    }

    @ObfuscatedName("client.ht(Ljava/lang/String;B)V")
    public void method1165(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field3559 + "shield/oauth/token" + (new class495(var2)).method8156());
        class457 var4 = new class457();
        if (this.method1692()) {
            var4.method7708(field582);
        } else {
            var4.method7708(field581);
        }
        var4.method7739("Host", (new URL(Statics.field3559)).getHost());
        var4.method7712(class492.field5014);
        class10 var5 = class10.field36;
        RefreshAccessTokenRequester var6 = this.field646;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field810);
            this.field578 = this.field572.method165(var7);
        } else {
            this.field580 = var6.request(var5.method66(), var3, var4.method7704(), "");
        }
    }

    @ObfuscatedName("client.hh(Ljava/lang/String;I)V")
    public void method1166(String arg0) throws IOException {
        URL var2 = new URL(Statics.field3559 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class457 var3 = new class457();
        var3.method7709(arg0);
        class10 var4 = class10.field30;
        OtlTokenRequester var5 = this.field653;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field810);
            this.field748 = this.field572.method165(var6);
        } else {
            this.field568 = var5.request(var4.method66(), var2, var3.method7704(), "");
        }
    }

    @ObfuscatedName("client.ha(Ljava/lang/String;Ljava/lang/String;B)V")
    public void method1167(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field4077 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field36, this.field810);
        var4.method78().method7709(arg0);
        var4.method78().method7712(class492.field5014);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method91(new class494(var5));
        this.field748 = this.field572.method165(var4);
    }

    @ObfuscatedName("client.bk(S)V")
    public final void method501() {
        class449.method6273(new int[] { 20, 260, 10000 }, new int[] { 1000, 100, 500 });
        Statics.field903 = class543.method5035(field718, class542.field5314);
        Statics.field490 = field575 == 0 ? 43594 : field600 + 40000;
        Statics.field3208 = field575 == 0 ? 443 : field600 + 50000;
        Statics.field3050 = Statics.field490;
        Statics.field295 = class357.field3801;
        Statics.field4781 = class357.field3798;
        Statics.field495 = class357.field3800;
        Statics.field2492 = class357.field3799;
        Statics.field3400 = new class117(this.field810, 222);
        this.method498();
        this.method611();
        Statics.field320 = this.method475();
        this.method481(field553, 0);
        this.method481(field764, 1);
        this.method476();
        Statics.field3636 = new class482(255, class179.field1892, class179.field1897, 500000);
        Statics.field4879 = class101.method6809();
        String var2 = Statics.field5271;
        class32.field166 = this;
        if (var2 != null) {
            class32.field163 = var2;
        }
        method3064(Statics.field4879.method2475());
        Statics.field182 = new class71(Statics.field2521);
        this.field572 = new class15("tokenRequest", 1, 1);
        class330.method3488(this);
        field771.method4205();
    }

    @ObfuscatedName("ot.hq(B)Lis;")
    public static class231 method6569() {
        return field764;
    }

    @ObfuscatedName("client.bp(B)V")
    public final void method492() {
        field821++;
        this.method1438();
        while (true) {
            class406 var1 = class383.field4450;
            class382 var2;
            synchronized (class383.field4450) {
                var2 = (class382) class383.field4447.method6832();
            }
            if (var2 == null) {
                boolean var4 = false;
                boolean var5 = false;
                if (!class330.field3582.isEmpty()) {
                    class444 var6 = (class444) class330.field3582.get(0);
                    if (var6 == null) {
                        class330.field3582.remove(0);
                    } else if (var6.method7581()) {
                        if (var6.method7596()) {
                            System.out.println("Error in midimanager.service: " + var6.method7611());
                            var4 = true;
                        } else {
                            if (var6.method7598() != null) {
                                class330.field3582.add(1, var6.method7598());
                            }
                            var5 = var6.method7597();
                        }
                        class330.field3582.remove(0);
                    } else {
                        var5 = var6.method7597();
                    }
                }
                if (var4) {
                    class330.field3582.clear();
                    class330.method2353();
                }
                if (var5 && field780 && Statics.field1642 != null) {
                    Statics.field1642.method782();
                }
                method3723();
                field764.method4085();
                this.method480();
                class36.method7003();
                if (Statics.field320 != null) {
                    int var9 = Statics.field320.method280();
                    field737 = var9;
                }
                if (field598 == 0) {
                    method695();
                    class35.method307();
                } else if (field598 == 5) {
                    class78.method298(this, Statics.field5408, Statics.field3069);
                    method695();
                    class35.method307();
                } else if (field598 == 10 || field598 == 11) {
                    class78.method298(this, Statics.field5408, Statics.field3069);
                } else if (field598 == 20) {
                    class78.method298(this, Statics.field5408, Statics.field3069);
                    this.method1172();
                } else if (field598 == 50) {
                    class78.method298(this, Statics.field5408, Statics.field3069);
                    this.method1172();
                } else if (field598 == 25) {
                    if (field528) {
                        method5113();
                    }
                    if (field685) {
                        method3042(Statics.field156);
                    }
                    if (!field685 && !field528) {
                        Statics.method2625(30);
                    }
                }
                if (field598 == 30) {
                    this.method1386();
                } else if (field598 == 40 || field598 == 45) {
                    this.method1172();
                }
                return;
            }
            var2.field4440.method6541(var2.field4439, (int) var2.field5049, var2.field4438, false);
        }
    }

    @ObfuscatedName("client.br(ZI)V")
    public final void method503(boolean arg0) {
        if ((field598 == 10 || field598 == 20 || field598 == 30) && field579 != 0L && class326.method2895() > field579) {
            method3064(method8667());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field657[var2] = true;
            }
        }
        if (field598 == 0) {
            this.method505(class78.field949, class78.field963, arg0, Statics.field5253);
        } else if (field598 == 5) {
            class78.method2849(Statics.field3119, Statics.field5408, Statics.field3069);
        } else if (field598 == 10 || field598 == 11) {
            class78.method2849(Statics.field3119, Statics.field5408, Statics.field3069);
        } else if (field598 == 20) {
            class78.method2849(Statics.field3119, Statics.field5408, Statics.field3069);
        } else if (field598 == 50) {
            class78.method2849(Statics.field3119, Statics.field5408, Statics.field3069);
        } else if (field598 == 25) {
            if (field585 == 1) {
                if (field596 > field597) {
                    field597 = field596;
                }
                int var3 = (field597 * 50 - field596 * 50) / field597;
                method7795(class378.field4100 + class105.field1375 + class105.field1371 + var3 + "%" + class105.field1376, false);
            } else if (field585 == 2) {
                if (field700 > field639) {
                    field639 = field700;
                }
                int var4 = (field639 * 50 - field700 * 50) / field639 + 50;
                method7795(class378.field4100 + class105.field1375 + class105.field1371 + var4 + "%" + class105.field1376, false);
            } else {
                method7795(class378.field4100, false);
            }
        } else if (field598 == 30) {
            this.method1323();
        } else if (field598 == 40) {
            method7795(class378.field4101 + class105.field1375 + class378.field4366, false);
        } else if (field598 == 45) {
            method7795(class378.field4263, false);
        }
        if (field598 == 30 && field753 == 0 && !arg0 && !field755) {
            for (int var5 = 0; var5 < field744; var5++) {
                if (field747[var5]) {
                    Statics.field3196.method449(field765[var5], field750[var5], field751[var5], field800[var5]);
                    field747[var5] = false;
                }
            }
        } else if (field598 > 0) {
            Statics.field3196.method451(0, 0);
            for (int var6 = 0; var6 < field744; var6++) {
                field747[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.bx(I)V")
    public final void method504() {
        if (Statics.field3238 != null && Statics.field3238.method2706()) {
            Statics.field3238.method2679();
        }
        if (Statics.field474 != null) {
            Statics.field474.field1111 = false;
        }
        Statics.field474 = null;
        field591.method2749();
        class36.method1020();
        Statics.field320 = null;
        if (Statics.field1642 != null) {
            Statics.field1642.method775();
        }
        Statics.field33.method6680();
        class383.method5582();
        if (Statics.field3400 != null) {
            Statics.field3400.method2769();
            Statics.field3400 = null;
        }
        class179.method3176();
        this.field572.method168();
    }

    @ObfuscatedName("ad.hu(I)V")
    public static void method273() {
        field541 = true;
        if (Statics.field3238 != null && Statics.field3238.method2706()) {
            Statics.field3238.method2679();
        }
        method2224();
        method7672();
        if (Statics.field474 != null) {
            Statics.field474.field1111 = false;
        }
        Statics.field474 = null;
        field591.method2749();
        if (Statics.field217 != null) {
            try {
                Statics.field217.method3325();
            } catch (Exception var4) {
            }
        }
        Statics.field217 = null;
        method161();
        method3017();
        Statics.field4624.method2517();
        for (int var1 = 0; var1 < 4; var1++) {
            if (Statics.field4624.field1333[var1] != null) {
                Statics.field4624.field1333[var1].method4112();
            }
        }
        Statics.field18 = null;
        class330.method6481(0, 0);
        class330.method821();
        field780 = false;
        class72.method3087();
        if (Statics.field1642 != null) {
            Statics.field1642.method775();
        }
        Statics.field33.method6680();
        class383.method5582();
        if (Statics.field3400 != null) {
            Statics.field3400.method2769();
        }
        class179.method3176();
        class179.field1892 = null;
        class179.field1897 = null;
        Statics.field920 = null;
        class181.method2012();
        Statics.field3636 = null;
        field756.clear();
        field829 = 0;
        Statics.field33 = new class388();
        Statics.field3400 = new class117(Statics.field1971.field810, 222);
        try {
            class179.method2308("oldschool", Statics.field4076, Statics.field2401.field4053, 0, 23);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
        Statics.field3636 = new class482(255, class179.field1892, class179.field1897, 500000);
        Statics.field217 = new class177();
        Statics.field1971.method491();
        method2882(class95.field1167);
        Statics.method2625(0);
    }

    @ObfuscatedName("fo.hy(I)V")
    public static void method3017() {
        Statics.field4919 = null;
        Statics.field83 = null;
        Statics.field73 = null;
        Statics.field7 = null;
        Statics.field40 = null;
        Statics.field4037 = null;
        Statics.field1456 = null;
        Statics.field2535 = null;
        Statics.field2435 = null;
        Statics.field1492 = null;
        Statics.field157 = null;
    }

    @ObfuscatedName("client.hv(B)V")
    public void method1438() {
        if (field598 != 1000) {
            boolean var1 = Statics.field33.method6677();
            if (!var1) {
                this.method1487();
            }
        }
    }

    @ObfuscatedName("client.hw(S)V")
    public void method1487() {
        if (Statics.field33.field4543 >= 4) {
            this.method507("js5crc");
            Statics.method2625(1000);
            return;
        }
        if (Statics.field33.field4544 >= 4) {
            if (field598 <= 5) {
                this.method507("js5io");
                Statics.method2625(1000);
                return;
            }
            field564 = 3000;
            Statics.field33.field4544 = 3;
        }
        if (--field564 + 1 > 0) {
            return;
        }
        try {
            if (field658 == 0) {
                Statics.field1806 = Statics.field217.method3324(Statics.field60, Statics.field3050);
                field658++;
            }
            if (field658 == 1) {
                if (Statics.field1806.field1932 == 2) {
                    this.method1171(-1);
                    return;
                }
                if (Statics.field1806.field1932 == 1) {
                    field658++;
                }
            }
            if (field658 == 2) {
                Statics.field373 = class478.method2985((Socket) Statics.field1806.field1929, 40000, 5000);
                class546 var1 = new class546(5);
                var1.method8779(class323.field3534.field3539);
                var1.method8981(222);
                Statics.field373.method8023(var1.field5346, 0, 5);
                field658++;
                Statics.field1613 = class326.method2895();
            }
            if (field658 == 3) {
                if (Statics.field373.method8020() > 0) {
                    int var2 = Statics.field373.method8021();
                    if (var2 != 0) {
                        this.method1171(var2);
                        return;
                    }
                    field658++;
                } else if (class326.method2895() - Statics.field1613 > 30000L) {
                    this.method1171(-2);
                    return;
                }
            }
            if (field658 == 4) {
                Statics.field33.method6658(Statics.field373, field598 > 20);
                Statics.field1806 = null;
                Statics.field373 = null;
                field658 = 0;
                field627 = 0;
            }
        } catch (IOException var4) {
            this.method1171(-3);
        }
    }

    @ObfuscatedName("client.hd(II)V")
    public void method1171(int arg0) {
        Statics.field1806 = null;
        Statics.field373 = null;
        field658 = 0;
        if (Statics.field490 == Statics.field3050) {
            Statics.field3050 = Statics.field3208;
        } else {
            Statics.field3050 = Statics.field490;
        }
        field627++;
        if (field627 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field598 <= 5) {
                this.method507("js5connect_full");
                Statics.method2625(1000);
            } else {
                field564 = 3000;
            }
        } else if (field627 >= 2 && arg0 == 6) {
            this.method507("js5connect_outofdate");
            Statics.method2625(1000);
        } else if (field627 >= 4) {
            if (field598 <= 5) {
                this.method507("js5connect");
                Statics.method2625(1000);
            } else {
                field564 = 3000;
            }
        }
    }

    @ObfuscatedName("fw.hr(Lot;Ljava/lang/String;B)V")
    public static void method3102(class384 arg0, String arg1) {
        class86 var2 = new class86(arg0, arg1);
        field756.add(var2);
        field829 += var2.field1069;
    }

    @ObfuscatedName("qy.hk(I)Z")
    public static boolean method7589() {
        if (field756 == null || field828 >= field756.size()) {
            return true;
        }
        while (field828 < field756.size()) {
            class86 var0 = (class86) field756.get(field828);
            if (!var0.method2198()) {
                return false;
            }
            field828++;
        }
        return true;
    }

    @ObfuscatedName("ez.ho(B)I")
    public static int method2899() {
        if (field756 == null || field828 >= field756.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field828; var1++) {
            var0 += ((class86) field756.get(var1)).field1067;
        }
        return var0 * 10000 / field829;
    }

    @ObfuscatedName("ci.hl(IIB)V")
    public static void method1080(int arg0, int arg1) {
        int[] var2 = new int[9];
        for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var3 * 32 + 128 + 15;
            int var5 = var4 * 3 + 600;
            int var7 = class248.field2665[var4];
            int var8 = arg1 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = (field551 - field803) * var8 / 100 + field803;
            int var10 = var5 * var9 / 256;
            var2[var3] = var7 * var10 >> 16;
        }
        Statics.field3967.field1332.method4551(var2, 500, 800, arg0 * 334 / arg1, 334);
    }

    @ObfuscatedName("bh.hf(I)V")
    public static void method695() {
        if (field562 == class95.field1167) {
            Statics.field1638 = method2225(class385.field4476.field4494, false, true, true, false);
            Statics.field3033 = method2225(class385.field4478.field4494, true, true, true, false);
            Statics.field1885 = method2225(class385.field4480.field4494, false, true, true, false);
            Statics.field1644 = method2225(class385.field4482.field4494, false, true, true, false);
            Statics.field1378 = method2225(class385.field4485.field4494, true, false, true, false);
            Statics.field3639 = method2225(class385.field4484.field4494, false, true, true, false);
            Statics.field1657 = method2225(class385.field4492.field4494, false, true, true, false);
            class78.method3303(20, class378.field4291);
            method2882(class95.field1182);
        } else if (field562 == class95.field1182) {
            byte var0 = 0;
            int var1 = var0 + Statics.field1638.method6524() * 53 / 100;
            int var2 = var1 + Statics.field3033.method6524() * 5 / 100;
            int var3 = var2 + Statics.field1885.method6524() * 36 / 100;
            int var4 = var3 + Statics.field1644.method6524() / 100;
            int var5 = var4 + Statics.field1378.method6524() / 100;
            int var6 = var5 + Statics.field3639.method6524() * 3 / 100;
            int var7 = var6 + Statics.field1657.method6524() / 100;
            if (var7 == 100) {
                method3102(Statics.field1638, "Sound FX");
                method3102(Statics.field3033, "Music Tracks");
                method3102(Statics.field1885, "Sprites");
                method3102(Statics.field3639, "Music Samples");
                method3102(Statics.field1657, "Music Patches");
                class78.method3303(40, class378.field4106);
                method2882(class95.field1184);
            } else if (var7 != 0) {
                class78.method3303(30, class378.field4372 + var7 + "%");
            }
        } else if (field562 == class95.field1184) {
            boolean var8 = !field642;
            Statics.field1509 = 22050;
            Statics.field1894 = var8;
            Statics.field2793 = 2;
            ArrayList var9 = new ArrayList(3);
            Statics.field1642 = class43.method92(Statics.field217, 0, 2048);
            Statics.field3737 = new class39();
            class39 var10 = new class39();
            var10.method699(Statics.field3737);
            for (int var11 = 0; var11 < 3; var11++) {
                class331 var12 = new class331(Statics.field1642);
                var12.method5675(9, 128);
                var10.method699(var12);
                var9.add(var12);
            }
            Statics.field1642.method773(var10);
            class384 var13 = Statics.field1657;
            class384 var14 = Statics.field3639;
            class384 var15 = Statics.field1638;
            Statics.field4661 = var13;
            Statics.field3587 = var14;
            Statics.field1683 = var15;
            class330.field3578 = var9;
            Statics.field1354 = new class58(22050, Statics.field1509);
            class78.method3303(60, class378.field4107);
            method2882(class95.field1172);
        } else if (field562 == class95.field1172) {
            if (Statics.field4064 == null) {
                Statics.field4064 = new class515(Statics.field1885, Statics.field1378);
            }
            class516[] var16 = new class516[] { class516.field5189, class516.field5186, class516.field5198, class516.field5190, class516.field5191, class516.field5188 };
            int var17 = var16.length;
            class515 var18 = Statics.field4064;
            class516[] var19 = new class516[] { class516.field5189, class516.field5186, class516.field5198, class516.field5190, class516.field5191, class516.field5188 };
            field595 = var18.method8472(var19);
            if (field595.size() < var17) {
                class78.method3303(80, class378.field4108 + field595.size() * 100 / var17 + "%");
            } else {
                Statics.field5408 = (class431) field595.get(class516.field5198);
                Statics.field3069 = (class431) field595.get(class516.field5188);
                Statics.field3119 = (class431) field595.get(class516.field5186);
                Statics.field3741 = field817.method8193();
                class78.method3303(80, class378.field4109);
                method2882(class95.field1173);
            }
        } else if (field562 == class95.field1173) {
            class384 var20 = Statics.field1644;
            class384 var21 = Statics.field1885;
            int var22 = 0;
            String[] var23 = class78.field975;
            for (int var24 = 0; var24 < var23.length; var24++) {
                String var25 = var23[var24];
                if (var20.method6602(var25, "")) {
                    var22++;
                }
            }
            String[] var26 = class78.field957;
            for (int var27 = 0; var27 < var26.length; var27++) {
                String var28 = var26[var27];
                if (var21.method6602(var28, "")) {
                    var22++;
                }
            }
            String[] var29 = class78.field943;
            for (int var30 = 0; var30 < var29.length; var30++) {
                String var31 = var29[var30];
                if (var21.method6587(var31) != -1 && var21.method6602(var31, "")) {
                    var22++;
                }
            }
            int var34 = class78.method5268(Statics.field1885);
            if (var22 < var34) {
                class78.method3303(90, class378.field4228 + var22 * 100 / var34 + "%");
            } else {
                class78.method3303(100, class378.field4111);
                if (Statics.field903) {
                    Statics.method2625(5);
                    method2882(class95.field1181);
                } else {
                    method2882(class95.field1171);
                }
            }
        } else if (field562 == class95.field1181) {
            Statics.method2625(10);
        } else if (field562 == class95.field1171) {
            Statics.field3094 = method2225(class385.field4472.field4494, false, true, true, false);
            Statics.field3553 = method2225(class385.field4487.field4494, false, true, true, false);
            Statics.field2840 = method2225(class385.field4486.field4494, true, false, true, false);
            Statics.field522 = method2225(class385.field4475.field4494, false, true, true, false);
            Statics.field2971 = method2225(class385.field4477.field4494, true, true, true, false);
            Statics.field1453 = method2225(class385.field4479.field4494, false, true, true, false);
            Statics.field106 = method2225(class385.field4483.field4494, false, true, true, false);
            Statics.field3644 = method2225(class385.field4490.field4494, false, true, true, false);
            Statics.field4783 = method2225(class385.field4481.field4494, false, true, true, false);
            Statics.field3375 = method2225(class385.field4488.field4494, true, true, true, false);
            Statics.field371 = method2225(class385.field4471.field4494, false, true, true, false);
            Statics.field3565 = method2225(class385.field4489.field4494, false, true, true, false);
            Statics.field1603 = method2225(class385.field4491.field4494, false, true, true, false);
            Statics.field1358 = method2225(class385.field4473.field4494, false, true, true, false);
            Statics.field1039 = method1873(class385.field4493.field4494, false, true, true, true, true);
            class78.method3303(20, class378.field4291);
            method2882(class95.field1174);
        } else if (field562 == class95.field1174) {
            byte var35 = 0;
            int var36 = var35 + Statics.field3094.method6524() * 5 / 100;
            int var37 = var36 + Statics.field3553.method6524() * 2 / 100;
            int var38 = var37 + Statics.field2840.method6524() / 100;
            int var39 = var38 + Statics.field522.method6524() / 100;
            int var40 = var39 + Statics.field2971.method6524() * 10 / 100;
            int var41 = var40 + Statics.field1453.method6524() * 65 / 100;
            int var42 = var41 + Statics.field106.method6524() / 100;
            int var43 = var42 + Statics.field3644.method6524() / 100;
            int var44 = var43 + Statics.field4783.method6524() * 6 / 100;
            int var45 = var44 + Statics.field3565.method6524() / 100;
            int var46 = var45 + Statics.field371.method6524() * 2 / 100;
            int var47 = var46 + Statics.field1603.method6524() * 2 / 100;
            int var48 = var47 + Statics.field1358.method6524() / 100;
            int var49 = var48 + Statics.field1039.method6524() / 100;
            int var50 = var49 + (Statics.field3375.method6523() && Statics.field3375.method6604() ? 1 : 0);
            if (var50 == 100) {
                method3102(Statics.field3094, "Animations");
                method3102(Statics.field3553, "Skeletons");
                method3102(Statics.field2971, "Maps");
                method3102(Statics.field1453, "Models");
                method3102(Statics.field3644, "Music Jingles");
                method3102(Statics.field3565, "World Map");
                method3102(Statics.field371, "World Map Geography");
                method3102(Statics.field1603, "World Map Ground");
                Statics.field3113 = new class484();
                Statics.field3113.method8096(Statics.field3375);
                class78.method3303(30, class378.field4106);
                method2882(class95.field1168);
            } else if (var50 != 0) {
                class78.method3303(30, class378.field4372 + var50 + "%");
            }
        } else if (field562 == class95.field1168) {
            Statics.field3967 = new class102(-1, 104, 104, Statics.field4879.method2459());
            Statics.field4624 = Statics.field3967;
            Statics.field1288 = new class560(512, 512);
            class78.method3303(30, class378.field4286);
            method2882(class95.field1166);
        } else if (field562 == class95.field1166) {
            if (!Statics.field2840.method6604()) {
                class78.method3303(40, class378.field4112 + Statics.field2840.method6535() + "%");
            } else if (Statics.field1358.method6604()) {
                class226.method2817(Statics.field2840);
                class384 var51 = Statics.field2840;
                Statics.field2211 = var51;
                class384 var52 = Statics.field2840;
                class384 var53 = Statics.field1453;
                Statics.field2044 = var52;
                Statics.field1753 = var53;
                Statics.field4677 = Statics.field2044.method6591(3);
                class224.method809(Statics.field2840, Statics.field1453, field642);
                class384 var54 = Statics.field2840;
                class384 var55 = Statics.field1453;
                Statics.field2116 = var54;
                Statics.field159 = var55;
                class221.method6570(Statics.field2840);
                class225.method2220(Statics.field2840, Statics.field1453, field571, Statics.field5408);
                class384 var56 = Statics.field2840;
                class384 var57 = Statics.field3094;
                class384 var58 = Statics.field3553;
                Statics.field2409 = var56;
                Statics.field2405 = var57;
                Statics.field2413 = var58;
                class384 var59 = Statics.field2840;
                class384 var60 = Statics.field1453;
                Statics.field2074 = var59;
                Statics.field2208 = var60;
                Statics.method3073(Statics.field2840);
                class197.method3481(Statics.field2840);
                Statics.field75 = new class349(Statics.field522, Statics.field1453, Statics.field1885, Statics.field1378, Statics.field1039);
                class384 var61 = Statics.field2840;
                Statics.field1987 = var61;
                class384 var62 = Statics.field2840;
                Statics.field2087 = var62;
                class200.method268(Statics.field2840);
                class217.method4236(Statics.field2840);
                class220.method2223(Statics.field2840);
                class537.method5473(Statics.field2840);
                class384 var63 = Statics.field2840;
                Statics.field5289 = var63;
                Statics.field2640 = new class529(Statics.field1432, 54, Statics.field1965, Statics.field2840);
                Statics.field492 = new class529(Statics.field1432, 47, Statics.field1965, Statics.field2840);
                Statics.field3238 = new class113();
                class384 var64 = Statics.field2840;
                class384 var65 = Statics.field1885;
                class384 var66 = Statics.field1378;
                Statics.field2256 = var64;
                Statics.field3637 = var65;
                Statics.field2247 = var66;
                class384 var67 = Statics.field2840;
                class384 var68 = Statics.field1885;
                Statics.field2064 = var67;
                Statics.field2065 = var68;
                class199.method4736(Statics.field2840, Statics.field1885);
                class78.method3303(50, class378.field4233);
                method2882(class95.field1175);
            } else {
                class78.method3303(40, class378.field4112 + (80 + Statics.field4783.method6535() / 6) + "%");
            }
        } else if (field562 == class95.field1175) {
            int var69 = 0;
            if (Statics.field4919 == null) {
                Statics.field4919 = class561.method8728(Statics.field1885, Statics.field3113.field4997, 0);
            } else {
                var69++;
            }
            if (Statics.field83 == null) {
                Statics.field83 = class561.method8728(Statics.field1885, Statics.field3113.field4989, 0);
            } else {
                var69++;
            }
            if (Statics.field73 == null) {
                Statics.field73 = class561.method7276(Statics.field1885, Statics.field3113.field4988, 0);
            } else {
                var69++;
            }
            if (Statics.field7 == null) {
                Statics.field7 = class561.method5445(Statics.field1885, Statics.field3113.field4990, 0);
            } else {
                var69++;
            }
            if (Statics.field40 == null) {
                Statics.field40 = class561.method5445(Statics.field1885, Statics.field3113.field4992, 0);
            } else {
                var69++;
            }
            if (Statics.field4037 == null) {
                Statics.field4037 = class561.method5445(Statics.field1885, Statics.field3113.field4993, 0);
            } else {
                var69++;
            }
            if (Statics.field1456 == null) {
                Statics.field1456 = class561.method5445(Statics.field1885, Statics.field3113.field4994, 0);
            } else {
                var69++;
            }
            if (Statics.field2535 == null) {
                Statics.field2535 = class561.method5445(Statics.field1885, Statics.field3113.field4991, 0);
            } else {
                var69++;
            }
            if (Statics.field2435 == null) {
                Statics.field2435 = class561.method5445(Statics.field1885, Statics.field3113.field4996, 0);
            } else {
                var69++;
            }
            if (Statics.field1492 == null) {
                Statics.field1492 = class561.method7276(Statics.field1885, Statics.field3113.field4995, 0);
            } else {
                var69++;
            }
            if (Statics.field157 == null) {
                Statics.field157 = class561.method7276(Statics.field1885, Statics.field3113.field4998, 0);
            } else {
                var69++;
            }
            if (var69 < 11) {
                class78.method3303(70, class378.field4114 + var69 * 100 / 12 + "%");
            } else {
                Statics.field4763 = Statics.field157;
                Statics.field83.method9219();
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 21.0D) - 10;
                int var73 = (int) (Math.random() * 41.0D) - 20;
                Statics.field73[0].method9202(var70 + var73, var71 + var73, var72 + var73);
                class78.method3303(60, class378.field4356);
                method2882(class95.field1176);
            }
        } else if (field562 == class95.field1176) {
            if (Statics.field106.method6604()) {
                Statics.field1973 = new class260(Statics.field106, Statics.field1885, 20, Statics.field4879.method2401(), field642 ? 64 : 128);
                class248.method4330(Statics.field1973);
                class248.method4331(Statics.field4879.method2401());
                method2882(class95.field1177);
            } else {
                class78.method3303(70, class378.field4116 + "0%");
            }
        } else if (field562 == class95.field1177) {
            int var74 = Statics.field1973.method4749();
            if (var74 < 100) {
                class78.method3303(80, class378.field4116 + var74 + "%");
            } else {
                class78.method3303(90, class378.field4269);
                method2882(class95.field1178);
            }
        } else if (field562 == class95.field1178) {
            Statics.field474 = new class91();
            Statics.field217.method3313(Statics.field474, 10);
            class78.method3303(92, class378.field4118);
            method2882(class95.field1179);
        } else if (field562 == class95.field1179) {
            if (Statics.field1644.method6602("huffman", "")) {
                class360 var75 = new class360(Statics.field1644.method6620("huffman", ""));
                Statics.field3974 = var75;
                class78.method3303(94, class378.field4379);
                method2882(class95.field1180);
            } else {
                class78.method3303(94, class378.field4119 + "%");
            }
        } else if (field562 == class95.field1180) {
            if (!Statics.field522.method6604()) {
                class78.method3303(96, class378.field4095 + Statics.field522.method6535() * 4 / 5 + "%");
            } else if (!Statics.field1039.method6604()) {
                class78.method3303(96, class378.field4095 + Statics.field1039.method6535() * 4 / 5 + "%");
            } else if (!Statics.field4783.method6604()) {
                class78.method3303(96, class378.field4095 + (80 + Statics.field4783.method6535() / 6) + "%");
            } else if (Statics.field1378.method6604()) {
                class78.method3303(98, class378.field4122);
                if (Statics.field4783.method6589("version.dat", "")) {
                    class546 var76 = new class546(Statics.field4783.method6620("version.dat", ""));
                    var76.method8798();
                }
                method2882(class95.field1170);
            } else {
                class78.method3303(96, class378.field4095 + (96 + Statics.field1378.method6535() / 50) + "%");
            }
        } else if (field562 == class95.field1170) {
            if (Statics.field3565.method6582() <= 0 || Statics.field3565.method6592(class300.field3237.field3239)) {
                if (Statics.field18 == null) {
                    Statics.field18 = new class514();
                    Statics.field18.method8257(Statics.field3565, Statics.field371, Statics.field1603, Statics.field3119, field595, Statics.field73);
                }
                class78.method3303(100, class378.field4306);
                if (Statics.field903) {
                    method2882(class95.field1183);
                } else {
                    method2882(class95.field1181);
                }
                field541 = false;
            } else {
                class78.method3303(100, class378.field4137 + Statics.field3565.method6593(class300.field3237.field3239) / 10 + "%");
            }
        } else if (field562 == class95.field1183) {
            Statics.field5253 = false;
            Statics.method2625(20);
            method824(class69.field523);
        }
    }

    @ObfuscatedName("eq.hs(Ldn;I)V")
    public static void method2882(class95 arg0) {
        if (field562 != arg0) {
            field562 = arg0;
        }
    }

    @ObfuscatedName("dz.hz(IZZZZI)Lot;")
    public static class384 method2225(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class482 var5 = null;
        if (class179.field1892 != null) {
            var5 = new class482(arg0, class179.field1892, Statics.field920[arg0], 1000000);
        }
        return new class384(var5, Statics.field3636, Statics.field33, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("cy.hn(IZZZZZI)Lot;")
    public static class384 method1873(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
        class482 var6 = null;
        if (class179.field1892 != null) {
            var6 = new class482(arg0, class179.field1892, Statics.field920[arg0], 1000000);
        }
        return new class384(var6, Statics.field3636, Statics.field33, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("client.hp(I)V")
    public final void method1172() {
        class478 var1 = field591.method2748();
        class545 var2 = field591.field1468;
        try {
            if (Statics.field1061 == class69.field499) {
                if (Statics.field121 == null && (field662.method2107() || field536 > 250)) {
                    Statics.field121 = field662.method2116();
                    field662.method2106();
                    field662 = null;
                }
                if (Statics.field121 != null) {
                    if (var1 != null) {
                        var1.method8024();
                        var1 = null;
                    }
                    Statics.field4780 = null;
                    field593 = false;
                    field536 = 0;
                    if (!field570.method9076()) {
                        method824(class69.field500);
                    } else if (this.method1162()) {
                        try {
                            this.method1165(Statics.field2503);
                            method824(class69.field518);
                        } catch (Throwable var67) {
                            class571.method8083((String) null, var67);
                            method3717(65);
                            return;
                        }
                    } else if (this.method1684()) {
                        try {
                            this.method1167(Statics.field48, Statics.field880);
                            method824(class69.field520);
                        } catch (Exception var66) {
                            class571.method8083((String) null, var66);
                            method3717(65);
                            return;
                        }
                    } else {
                        method3717(65);
                        return;
                    }
                }
            }
            if (Statics.field1061 == class69.field518) {
                if (this.field580 == null) {
                    if (this.field578 == null) {
                        method3717(65);
                        return;
                    }
                    if (!this.field578.method248()) {
                        return;
                    }
                    if (this.field578.method247()) {
                        class571.method8083(this.field578.method250(), (Throwable) null);
                        method3717(65);
                        this.field578 = null;
                        return;
                    }
                    class21 var7 = this.field578.method254();
                    if (var7.method265() != 200) {
                        method3717(65);
                        this.field578 = null;
                        return;
                    }
                    field536 = 0;
                    class494 var8 = new class494(var7.method267());
                    try {
                        Statics.field101 = var8.method8150().getString("access_token");
                        Statics.field2503 = var8.method8150().getString("refresh_token");
                    } catch (Exception var64) {
                        class571.method8083("Error parsing tokens", var64);
                        method3717(65);
                        this.field578 = null;
                        return;
                    }
                } else if (this.field580.isDone()) {
                    if (this.field580.isCancelled()) {
                        method3717(65);
                        this.field580 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field580.get();
                        if (!var5.isSuccess()) {
                            method3717(65);
                            this.field580 = null;
                            return;
                        }
                        Statics.field101 = var5.getAccessToken();
                        Statics.field2503 = var5.getRefreshToken();
                        this.field580 = null;
                    } catch (Exception var65) {
                        class571.method8083((String) null, var65);
                        method3717(65);
                        this.field580 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1166(Statics.field101);
                method824(class69.field520);
            }
            if (Statics.field1061 == class69.field520) {
                if (this.field568 == null) {
                    if (this.field748 == null) {
                        method3717(65);
                        return;
                    }
                    if (!this.field748.method248()) {
                        return;
                    }
                    if (this.field748.method247()) {
                        class571.method8083(this.field748.method250(), (Throwable) null);
                        method3717(65);
                        this.field748 = null;
                        return;
                    }
                    class21 var12 = this.field748.method254();
                    if (var12.method265() != 200) {
                        class571.method8083("Response code: " + var12.method265() + "Response body: " + var12.method267(), (Throwable) null);
                        method3717(65);
                        this.field748 = null;
                        return;
                    }
                    List var13 = (List) var12.method266().get("Content-Type");
                    if (var13 != null && var13.contains(class492.field5014.method8138())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method267());
                            this.field701 = var14.getString("token");
                        } catch (JSONException var62) {
                            class571.method8083((String) null, var62);
                            method3717(65);
                            this.field748 = null;
                            return;
                        }
                    } else {
                        this.field701 = var12.method267();
                    }
                    this.field748 = null;
                } else if (this.field568.isDone()) {
                    if (this.field568.isCancelled()) {
                        method3717(65);
                        this.field568 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field568.get();
                        if (!var10.isSuccess()) {
                            method3717(65);
                            this.field568 = null;
                            return;
                        }
                        this.field701 = var10.getToken();
                        this.field568 = null;
                    } catch (Exception var63) {
                        class571.method8083((String) null, var63);
                        method3717(65);
                        this.field568 = null;
                        return;
                    }
                } else {
                    return;
                }
                field536 = 0;
                method824(class69.field500);
            }
            if (Statics.field1061 == class69.field500) {
                if (Statics.field4780 == null) {
                    Statics.field4780 = Statics.field217.method3324(Statics.field60, Statics.field3050);
                }
                if (Statics.field4780.field1932 == 2) {
                    throw new IOException();
                }
                if (Statics.field4780.field1932 == 1) {
                    var1 = class478.method2985((Socket) Statics.field4780.field1929, 40000, 5000);
                    field591.method2742(var1);
                    Statics.field4780 = null;
                    method824(class69.field501);
                }
            }
            if (Statics.field1061 == class69.field501) {
                field591.method2743();
                class321 var16 = class321.method5519();
                var16.field3398 = null;
                var16.field3392 = 0;
                var16.field3393 = new class545(5000);
                var16.field3393.method8779(class323.field3536.field3539);
                field591.method2745(var16);
                field591.method2747();
                var2.field5344 = 0;
                method824(class69.field502);
            }
            if (Statics.field1061 == class69.field502) {
                if (Statics.field1642 != null) {
                    Statics.field1642.method774();
                }
                if (var1.method8027(1)) {
                    int var19 = var1.method8021();
                    if (Statics.field1642 != null) {
                        Statics.field1642.method774();
                    }
                    if (var19 != 0) {
                        method3717(var19);
                        return;
                    }
                    var2.field5344 = 0;
                    method824(class69.field503);
                }
            }
            if (Statics.field1061 == class69.field503) {
                if (var2.field5344 < 8) {
                    int var20 = var1.method8020();
                    if (var20 > 8 - var2.field5344) {
                        var20 = 8 - var2.field5344;
                    }
                    if (var20 > 0) {
                        var1.method8022(var2.field5346, var2.field5344, var20);
                        var2.field5344 += var20;
                    }
                }
                if (var2.field5344 == 8) {
                    var2.field5344 = 0;
                    Statics.field3660 = var2.method8802();
                    method824(class69.field504);
                }
            }
            if (Statics.field1061 == class69.field504) {
                field591.field1468.field5344 = 0;
                field591.method2743();
                class545 var21 = new class545(500);
                int[] var22 = new int[] { Statics.field121.nextInt(), Statics.field121.nextInt(), Statics.field121.nextInt(), Statics.field121.nextInt() };
                var21.field5344 = 0;
                var21.method8779(1);
                var21.method8981(var22[0]);
                var21.method8981(var22[1]);
                var21.method8981(var22[2]);
                var21.method8981(var22[3]);
                var21.method8784(Statics.field3660);
                if (field598 == 40) {
                    var21.method8981(Statics.field870[0]);
                    var21.method8981(Statics.field870[1]);
                    var21.method8981(Statics.field870[2]);
                    var21.method8981(Statics.field870[3]);
                } else {
                    if (field598 == 50) {
                        var21.method8779(class144.field1675.method34());
                        var21.method8981(Statics.field1027);
                    } else {
                        var21.method8779(field569.method34());
                        switch(field569.field1676) {
                            case 0:
                            case 3:
                                var21.method8781(Statics.field4658);
                                var21.field5344++;
                            case 1:
                            default:
                                break;
                            case 2:
                                var21.method8981(Statics.field4879.method2416(class78.field976));
                                break;
                            case 4:
                                var21.field5344 += 4;
                        }
                    }
                    if (field570.method9076()) {
                        var21.method8779(class551.field5397.method34());
                        var21.method8864(this.field701);
                    } else {
                        var21.method8779(class551.field5404.method34());
                        var21.method8864(class78.field959);
                    }
                }
                var21.method8821(class77.field936, class77.field937);
                Statics.field870 = var22;
                class321 var23 = class321.method5519();
                var23.field3398 = null;
                var23.field3392 = 0;
                var23.field3393 = new class545(5000);
                var23.field3393.field5344 = 0;
                if (field598 == 40) {
                    var23.field3393.method8779(class323.field3535.field3539);
                } else {
                    var23.field3393.method8779(class323.field3541.field3539);
                }
                var23.field3393.method8780(0);
                int var26 = var23.field3393.field5344;
                var23.field3393.method8981(222);
                var23.field3393.method8981(1);
                var23.field3393.method8779(field604);
                var23.field3393.method8779(field534);
                byte var27 = 0;
                var23.field3393.method8779(var27);
                var23.field3393.method8939(var21.field5346, 0, var21.field5344);
                int var28 = var23.field3393.field5344;
                var23.field3393.method8864(class78.field976);
                var23.field3393.method8779((field755 ? 1 : 0) << 1 | (field642 ? 1 : 0));
                var23.field3393.method8780(Statics.field190);
                var23.field3393.method8780(Statics.field5283);
                method2237(var23.field3393);
                var23.field3393.method8864(Statics.field4746);
                var23.field3393.method8981(Statics.field1814);
                var23.field3393.method8779(0);
                class546 var29 = new class546(Statics.field3741.method8204());
                Statics.field3741.method8205(var29);
                var23.field3393.method8939(var29.field5346, 0, var29.field5346.length);
                var23.field3393.method8779(field604);
                var23.field3393.method8981(0);
                if (Statics.field903) {
                    method3493(var23);
                } else {
                    method5932(var23);
                }
                var23.field3393.method8922(var22, var28, var23.field3393.field5344);
                var23.field3393.method8792(var23.field3393.field5344 - var26);
                field591.method2745(var23);
                field591.method2747();
                field591.field1467 = new class563(var22);
                int[] var30 = new int[4];
                for (int var31 = 0; var31 < 4; var31++) {
                    var30[var31] = var22[var31] + 50;
                }
                var2.method8739(var30);
                method824(class69.field509);
            }
            if (Statics.field1061 == class69.field509 && var1.method8020() > 0) {
                int var32 = var1.method8021();
                if (var32 == 61) {
                    int var33 = var1.method8020();
                    Statics.field3977 = var33 == 1 && var1.method8021() == 1;
                    method824(class69.field504);
                }
                if (var32 == 21 && field598 == 20) {
                    method824(class69.field511);
                } else if (var32 == 2) {
                    if (Statics.field903) {
                        method824(class69.field524);
                    } else {
                        method824(class69.field513);
                    }
                } else if (var32 == 15 && field598 == 40) {
                    field591.field1465 = -1;
                    method824(class69.field519);
                } else if (var32 == 64) {
                    method824(class69.field521);
                } else if (var32 == 23 && field567 < 1) {
                    field567++;
                    method824(class69.field499);
                } else if (var32 == 29) {
                    method824(class69.field517);
                } else if (var32 == 69) {
                    method824(class69.field506);
                } else {
                    method3717(var32);
                    return;
                }
            }
            if (Statics.field1061 == class69.field524) {
                Statics.field5253 = true;
                method2882(class95.field1171);
                Statics.method2625(0);
            }
            if (Statics.field1061 == class69.field506 && var1.method8020() >= 2) {
                var1.method8022(var2.field5346, 0, 2);
                var2.field5344 = 0;
                Statics.field3391 = var2.method8798();
                method824(class69.field516);
            }
            if (Statics.field1061 == class69.field516 && var1.method8020() >= Statics.field3391) {
                var2.field5344 = 0;
                var1.method8022(var2.field5346, var2.field5344, Statics.field3391);
                class7[] var34 = new class7[] { class7.field16 };
                class7 var35 = var34[var2.method8796()];
                try {
                    class4 var36 = class5.method6506(var35);
                    this.field586 = new class8(var2, var36);
                    method824(class69.field505);
                } catch (Exception var61) {
                    method3717(22);
                    return;
                }
            }
            if (Statics.field1061 == class69.field505 && this.field586.method39()) {
                this.field533 = this.field586.method41();
                this.field586.method40();
                this.field586 = null;
                if (this.field533 == null) {
                    method3717(22);
                    return;
                }
                field591.method2743();
                class321 var38 = class321.method5519();
                var38.field3398 = null;
                var38.field3392 = 0;
                var38.field3393 = new class545(5000);
                var38.field3393.method8779(class323.field3533.field3539);
                var38.field3393.method8780(this.field533.field5344);
                var38.field3393.method8843(this.field533);
                field591.method2745(var38);
                field591.method2747();
                this.field533 = null;
                method824(class69.field509);
            }
            if (Statics.field1061 == class69.field521 && var1.method8020() > 0) {
                Statics.field115 = var1.method8021();
                method824(class69.field508);
            }
            if (Statics.field1061 == class69.field508 && var1.method8020() >= Statics.field115) {
                var1.method8022(var2.field5346, 0, Statics.field115);
                var2.field5344 = 0;
                method824(class69.field509);
            }
            if (Statics.field1061 == class69.field511 && var1.method8020() > 0) {
                field631 = (var1.method8021() + 3) * 60;
                method824(class69.field512);
            }
            if (Statics.field1061 == class69.field512) {
                field536 = 0;
                class78.method5108(class378.field4343, class378.field4132, field631 / 60 + class378.field4133);
                if (--field631 <= 0) {
                    method824(class69.field499);
                }
            } else if (Statics.field1061 == class69.field523) {
                class321 var41 = class321.method5519();
                var41.field3398 = null;
                var41.field3392 = 0;
                var41.field3393 = new class545(5000);
                var41.field3393.method8779(class323.field3538.field3539);
                var41.field3393.method8780(class323.field3538.field3537);
                var41.field3393.method8849(Statics.field522.field4513);
                var41.field3393.method8947(0);
                var41.field3393.method8850(Statics.field4783.field4513);
                var41.field3393.method8850(Statics.field3094.field4513);
                var41.field3393.method8850(Statics.field3644.field4513);
                var41.field3393.method8850(Statics.field3553.field4513);
                var41.field3393.method8849(Statics.field3565.field4513);
                var41.field3393.method8849(Statics.field106.field4513);
                var41.field3393.method8981(Statics.field2840.field4513);
                var41.field3393.method8947(Statics.field1603.field4513);
                var41.field3393.method8849(Statics.field2971.field4513);
                var41.field3393.method8947(Statics.field371.field4513);
                var41.field3393.method8849(Statics.field1453.field4513);
                var41.field3393.method8849(Statics.field3375.field4513);
                field591.method2745(var41);
                field591.method2747();
                method824(class69.field513);
            } else {
                if (Statics.field1061 == class69.field513 && var1.method8020() >= 1) {
                    Statics.field1483 = var1.method8021();
                    if (Statics.field1483 != class323.field3542.field3537) {
                        method3717(Statics.field1483);
                        return;
                    }
                    method824(class69.field514);
                }
                if (Statics.field1061 == class69.field514 && var1.method8020() >= Statics.field1483) {
                    boolean var44 = var1.method8021() == 1;
                    var1.method8022(var2.field5346, 0, 4);
                    var2.field5344 = 0;
                    boolean var45 = false;
                    if (var44) {
                        int var46 = var2.method8734() << 24;
                        int var47 = var46 | var2.method8734() << 16;
                        int var48 = var47 | var2.method8734() << 8;
                        int var49 = var48 | var2.method8734();
                        Statics.field4879.method2414(class78.field976, var49);
                    }
                    if (field583) {
                        Statics.field4879.method2408(class78.field976);
                    } else {
                        Statics.field4879.method2408((String) null);
                    }
                    class101.method3619();
                    field669 = var1.method8021();
                    field706 = var1.method8021() == 1;
                    field689 = var1.method8021();
                    field689 <<= 0x8;
                    field689 += var1.method8021();
                    field654 = var1.method8021();
                    var1.method8022(var2.field5346, 0, 8);
                    var2.field5344 = 0;
                    this.field587 = var2.method8802();
                    var1.method8022(var2.field5346, 0, 8);
                    var2.field5344 = 0;
                    field655 = var2.method8802();
                    var1.method8022(var2.field5346, 0, 8);
                    var2.field5344 = 0;
                    field656 = var2.method8802();
                    class184.method3361().method3370(this.field810);
                    method824(class69.field515);
                }
                if (Statics.field1061 == class69.field515 && var1.method8020() >= field591.field1465) {
                    var1.method8022(var2.field5346, 0, 1);
                    var2.field5344 = 0;
                    if (var2.method8740()) {
                        var1.method8022(var2.field5346, 1, 1);
                        var2.field5344 = 0;
                    }
                    class322[] var50 = Statics.method439();
                    int var51 = var2.method8764();
                    if (var51 < 0 || var51 >= var50.length) {
                        throw new IOException("Invalid ServerProt: " + var51 + " at " + var2.field5344);
                    }
                    field591.field1470 = var50[var51];
                    field591.field1465 = field591.field1470.field3408;
                    var1.method8022(var2.field5346, 0, 2);
                    var2.field5344 = 0;
                    field591.field1465 = var2.method8798();
                    try {
                        class27.method371(Statics.field1971, "zap");
                    } catch (Throwable var60) {
                    }
                    method824(class69.field510);
                }
                if (Statics.field1061 != class69.field510) {
                    if (Statics.field1061 == class69.field517 && var1.method8020() >= 2) {
                        var2.field5344 = 0;
                        var1.method8022(var2.field5346, 0, 2);
                        var2.field5344 = 0;
                        Statics.field1521 = var2.method8798();
                        method824(class69.field507);
                    }
                    if (Statics.field1061 == class69.field507 && var1.method8020() >= Statics.field1521) {
                        var2.field5344 = 0;
                        var1.method8022(var2.field5346, 0, Statics.field1521);
                        var2.field5344 = 0;
                        String var53 = var2.method8806();
                        String var54 = var2.method8806();
                        String var55 = var2.method8806();
                        class78.method5108(var53, var54, var55);
                        Statics.method2625(10);
                        if (field570.method9076()) {
                            class78.method3803(9);
                        }
                    }
                    if (Statics.field1061 == class69.field519) {
                        if (field591.field1465 == -1) {
                            if (var1.method8020() < 2) {
                                return;
                            }
                            var1.method8022(var2.field5346, 0, 2);
                            var2.field5344 = 0;
                            field591.field1465 = var2.method8798();
                        }
                        if (var1.method8020() >= field591.field1465) {
                            var1.method8022(var2.field5346, 0, field591.field1465);
                            var2.field5344 = 0;
                            int var56 = field591.field1465;
                            field594.method7679();
                            field591.method2743();
                            field591.field1468.field5344 = 0;
                            field591.field1470 = null;
                            field591.field1475 = null;
                            field591.field1476 = null;
                            field591.field1477 = null;
                            field591.field1465 = 0;
                            field591.field1471 = 0;
                            field692 = 0;
                            method6448();
                            field779 = 0;
                            field777 = 0;
                            Statics.field3967.method2522();
                            class87.method3061();
                            Statics.method2625(30);
                            for (int var57 = 0; var57 < 100; var57++) {
                                field657[var57] = true;
                            }
                            if (field591 != null && field591.field1467 != null) {
                                class321 var58 = class321.method3542(class319.field3369, field591.field1467);
                                var58.field3393.method8779(method8667());
                                var58.field3393.method8780(Statics.field190);
                                var58.field3393.method8780(Statics.field5283);
                                field591.method2745(var58);
                            }
                            Statics.field3967.field1337.method2642(var2, true);
                            if (var2.field5344 != var56) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field536++;
                        if (field536 > 2000) {
                            if (field567 < 1) {
                                if (Statics.field490 == Statics.field3050) {
                                    Statics.field3050 = Statics.field3208;
                                } else {
                                    Statics.field3050 = Statics.field490;
                                }
                                field567++;
                                method824(class69.field499);
                            } else {
                                method3717(-3);
                            }
                        }
                    }
                } else if (var1.method8020() >= field591.field1465) {
                    var2.field5344 = 0;
                    var1.method8022(var2.field5346, 0, field591.field1465);
                    field594.method7677();
                    method7672();
                    Statics.field3967.field1337.method2642(var2, true);
                    Statics.field900 = Statics.field84;
                    Statics.field5008 = -1;
                    method7269(false, var2);
                    field591.field1470 = null;
                    field540 = false;
                }
            }
        } catch (IOException var68) {
            if (field567 < 1) {
                if (Statics.field490 == Statics.field3050) {
                    Statics.field3050 = Statics.field3208;
                } else {
                    Statics.field3050 = Statics.field490;
                }
                field567++;
                method824(class69.field499);
            } else {
                method3717(-2);
            }
        }
    }

    @ObfuscatedName("ny.hc(Lmd;I)V")
    public static void method5932(class321 arg0) {
        arg0.field3393.method8981(0);
        arg0.field3393.method8981(Statics.field1603.field4513);
        arg0.field3393.method8849(Statics.field3644.field4513);
        arg0.field3393.method8947(Statics.field3639.field4513);
        arg0.field3393.method8947(Statics.field2840.field4513);
        arg0.field3393.method8850(Statics.field3565.field4513);
        arg0.field3393.method8947(Statics.field106.field4513);
        arg0.field3393.method8981(Statics.field1885.field4513);
        arg0.field3393.method8981(Statics.field3375.field4513);
        arg0.field3393.method8981(Statics.field1638.field4513);
        arg0.field3393.method8947(Statics.field1644.field4513);
        arg0.field3393.method8981(Statics.field1657.field4513);
        arg0.field3393.method8947(Statics.field3553.field4513);
        arg0.field3393.method8850(Statics.field522.field4513);
        arg0.field3393.method8981(Statics.field1453.field4513);
        arg0.field3393.method8947(Statics.field4783.field4513);
        arg0.field3393.method8849(Statics.field3094.field4513);
        arg0.field3393.method8947(Statics.field2971.field4513);
        arg0.field3393.method8849(Statics.field3033.field4513);
        arg0.field3393.method8850(Statics.field371.field4513);
        arg0.field3393.method8947(Statics.field1378.field4513);
    }

    @ObfuscatedName("hx.io(Lmd;I)V")
    public static void method3493(class321 arg0) {
        arg0.field3393.method8850(Statics.field1885.field4513);
        arg0.field3393.method8849(Statics.field1657.field4513);
        arg0.field3393.method8981(Statics.field3639.field4513);
        arg0.field3393.method8981(Statics.field3033.field4513);
        arg0.field3393.method8849(Statics.field1378.field4513);
        arg0.field3393.method8947(Statics.field1638.field4513);
        arg0.field3393.method8850(Statics.field1644.field4513);
    }

    @ObfuscatedName("rj.iq(B)V")
    public static void method7672() {
        field545 = 1L;
        if (Statics.field474 != null) {
            Statics.field474.field1109 = 0;
        }
        Statics.field4865 = true;
        field549 = true;
        field769 = -1L;
        class37.field247 = new class408();
        field591.method2743();
        field591.field1468.field5344 = 0;
        field591.field1470 = null;
        field591.field1475 = null;
        field591.field1476 = null;
        field591.field1477 = null;
        field591.field1465 = 0;
        field591.field1471 = 0;
        field692 = 0;
        field592 = 0;
        field785 = 0;
        method6448();
        class36.field242 = 0;
        class114.method2524();
        field745 = 0;
        field691 = false;
        field693 = 0;
        field615 = 0;
        field620 = 0;
        Statics.field414 = null;
        field779 = 0;
        field772 = -1;
        field777 = 0;
        field637 = 0;
        field559 = class107.field1387;
        field560 = class107.field1387;
        Statics.field3967.method2517();
        Statics.field182.method1801();
        if (Statics.field2004 > 5000) {
        }
        if (field541) {
            class346.method3770();
        } else {
            for (int var0 = 0; var0 < Statics.field2004; var0++) {
                class197 var1 = class197.method4446(var0);
                if (var1 != null) {
                    class346.field3709[var0] = 0;
                    class346.field3710[var0] = 0;
                }
            }
        }
        if (Statics.field3238 != null) {
            Statics.field3238.method2678();
        }
        field705 = -1;
        if (field783 != -1) {
            Statics.field75.method5910(field783);
        }
        for (class89 var2 = (class89) field697.method8530(); var2 != null; var2 = (class89) field697.method8531()) {
            method687(var2, true);
        }
        field783 = -1;
        field697 = new class520(8);
        field576 = null;
        method6448();
        field814.method5936((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var3 = 0; var3 < 8; var3++) {
            field722[var3] = null;
            field645[var3] = false;
        }
        class87.method3061();
        field542 = true;
        for (int var4 = 0; var4 < 100; var4++) {
            field657[var4] = true;
        }
        if (field591 != null && field591.field1467 != null) {
            class321 var5 = class321.method3542(class319.field3369, field591.field1467);
            var5.field3393.method8779(method8667());
            var5.field3393.method8780(Statics.field190);
            var5.field3393.method8780(Statics.field5283);
            field591.method2745(var5);
        }
        Statics.field1404 = null;
        Statics.field2052 = null;
        Arrays.fill(field713, (Object) null);
        Statics.field4608 = null;
        Arrays.fill(field727, (Object) null);
        for (int var6 = 0; var6 < 8; var6++) {
            field574[var6] = new class396();
        }
        Statics.field1797 = null;
    }

    @ObfuscatedName("ib.ib(II)V")
    public static void method3717(int arg0) {
        int var1 = class78.field953;
        if (arg0 == -3) {
            class78.method5108(class378.field4134, class378.field4135, class378.field4238);
        } else if (arg0 == -2) {
            class78.method5108(class378.field4124, class378.field4138, class378.field4182);
        } else if (arg0 == -1) {
            class78.method5108(class378.field4140, class378.field4141, class378.field4142);
        } else if (arg0 == 3) {
            class78.method3803(3);
            class78.field950 = 1;
        } else if (arg0 == 4) {
            class78.method3803(14);
            class78.field948 = 0;
        } else if (arg0 == 5) {
            class78.field950 = 2;
            class78.method5108(class378.field4136, class378.field4103, class378.field4148);
        } else if (arg0 == 68) {
            if (!field540) {
                field540 = true;
                method273();
                return;
            }
            class78.method5108(class378.field4149, class378.field4150, class378.field4151);
        } else if (!field608 && arg0 == 6) {
            class78.method5108(class378.field4149, class378.field4150, class378.field4151);
        } else if (arg0 == 7) {
            class78.method5108(class378.field4152, class378.field4096, class378.field4184);
        } else if (arg0 == 8) {
            class78.method5108(class378.field4155, class378.field4091, class378.field4157);
        } else if (arg0 == 9) {
            class78.method5108(class378.field4158, class378.field4210, class378.field4160);
        } else if (arg0 == 10) {
            class78.method5108(class378.field4161, class378.field4402, class378.field4163);
        } else if (arg0 == 11) {
            class78.method5108(class378.field4341, class378.field4259, class378.field4166);
        } else if (arg0 == 12) {
            class78.method5108(class378.field4181, class378.field4130, class378.field4110);
        } else if (arg0 == 13) {
            class78.method5108(class378.field4174, class378.field4171, class378.field4172);
        } else if (arg0 == 14) {
            class78.method5108(class378.field4173, class378.field4235, class378.field4175);
        } else if (arg0 == 16) {
            class78.method5108(class378.field4176, class378.field4177, class378.field4307);
            class78.method3803(33);
        } else if (arg0 == 17) {
            class78.method5108(class378.field4179, class378.field4180, class378.field4089);
        } else if (arg0 == 18) {
            class78.method3803(14);
            class78.field948 = 1;
        } else if (arg0 == 19) {
            class78.method5108(class378.field4185, class378.field4186, class378.field4187);
        } else if (arg0 == 20) {
            class78.method5108(class378.field4168, class378.field4189, class378.field4188);
        } else if (arg0 == 22) {
            class78.method5108(class378.field4154, class378.field4192, class378.field4178);
        } else if (arg0 == 23) {
            class78.method5108(class378.field4257, class378.field4243, class378.field4196);
        } else if (arg0 == 24) {
            class78.method5108(class378.field4197, class378.field4199, class378.field4316);
        } else if (arg0 == 25) {
            class78.method5108(class378.field4200, class378.field4201, class378.field4131);
        } else if (arg0 == 26) {
            class78.method5108(class378.field4203, class378.field4204, class378.field4205);
        } else if (arg0 == 27) {
            class78.method5108(class378.field4342, class378.field4207, class378.field4208);
        } else if (arg0 == 31) {
            class78.method5108(class378.field4215, class378.field4216, class378.field4217);
        } else if (arg0 == 32) {
            class78.method3803(14);
            class78.field948 = 2;
        } else if (arg0 == 37) {
            class78.method5108(class378.field4221, class378.field4222, class378.field4302);
        } else if (arg0 == 38) {
            class78.method5108(class378.field4224, class378.field4191, class378.field4226);
        } else if (arg0 == 74) {
            class78.method5108(class378.field4227, class378.field4211, class378.field4229);
        } else if (arg0 == 55) {
            class78.method3803(8);
        } else if (arg0 == 56) {
            class78.method5108(class378.field4234, class378.field4225, class378.field4244);
            Statics.method2625(11);
            return;
        } else if (arg0 == 57) {
            class78.method5108(class378.field4237, class378.field4283, class378.field4169);
            Statics.method2625(11);
            return;
        } else if (arg0 == 61) {
            class78.method5108("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class78.method3803(7);
        } else if (arg0 == 62) {
            Statics.method2625(10);
            class78.method3803(9);
            class78.method5108(class378.field4088, class378.field4241, class378.field4242);
            return;
        } else if (arg0 == 63) {
            Statics.method2625(10);
            class78.method3803(9);
            class78.method5108(class378.field4120, class378.field4391, class378.field4245);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            Statics.method2625(10);
            class78.method3803(9);
            class78.method5108(class378.field4246, class378.field4247, class378.field4333);
            return;
        } else if (arg0 == 71) {
            Statics.method2625(10);
            class78.method3803(7);
            class78.method5108("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            Statics.method2625(10);
            class78.method3803(6);
            class78.method5108(class378.field4377, class378.field4195, class378.field4395);
        } else if (arg0 == 72) {
            Statics.method2625(10);
            class78.method3803(32);
        } else {
            class78.method5108(class378.field4249, class378.field4250, class378.field4248);
        }
        Statics.method2625(10);
        int var4 = class78.field953;
        boolean var5 = var1 != var4;
        if (!var5 && field570.method9076()) {
            class78.method3803(9);
        }
    }

    @ObfuscatedName("ho.ie(B)V")
    public static final void method3595() {
        field591.method2749();
        method161();
        Statics.field3967.method2517();
        field553.method4070();
        System.gc();
        class330.method6481(0, 0);
        class330.method821();
        field780 = false;
        class72.method3087();
        Statics.method2625(10);
        field544 = 0;
        class184.method3361().method3372();
        class184.method3361().method3375();
    }

    @ObfuscatedName("sq.if(IB)V")
    public static final void method8017(int arg0) {
        method3595();
        switch(arg0) {
            case 1:
                class78.method5429();
                break;
            case 2:
                class78.method3722();
        }
    }

    @ObfuscatedName("dc.ig(B)J")
    public static long method2255() {
        return field655;
    }

    @ObfuscatedName("fa.ip(I)J")
    public static long method2997() {
        return field656;
    }

    @ObfuscatedName("ap.ia(I)V")
    public static final void method161() {
        class204.method4152();
        class206.method697();
        class195.field1994.method5572();
        Statics.method441();
        class537.method3304();
        class205.field2086.method5572();
        class226.field2395.method5572();
        class216.method3495();
        class202.field2059.method5572();
        class202.field2060.method5572();
        class222.method3329();
        class194.field1991.method5572();
        class201.field2045.method5572();
        class192.method2805();
        Statics.method4499();
        class199.field2017.method5572();
        class207.method2996();
        class210.field2117.method5572();
        class210.field2118.method5572();
        class225.field2343.method5572();
        class225.field2334.method5572();
        class225.field2329.method5572();
        Statics.method858();
        class227.method4155();
        class215.field2192.method5572();
        class215.field2193.method5572();
        class221.field2242.method5572();
        class218.method5460();
        if (Statics.field2640 != null) {
            Statics.field2640.method8634();
        }
        if (Statics.field492 != null) {
            Statics.field492.method8634();
        }
        class211.field2164.method5572();
        class213.field2180.method5572();
        class200.method2851();
        class198.method4963();
        class193.field1990.method5572();
        class196.method3065();
        Statics.method825();
        class197.field2005.method5572();
        class217.method2639();
        field690.method5572();
        field822.method5572();
        class355.field3766.method5572();
        class355.field3759.method7775();
        class355.field3767 = 0;
        if (Statics.field75 != null) {
            Statics.field75.method5920();
        }
        if (class248.field2670.field2978 != null) {
            ((class260) class248.field2670.field2978).method4775();
        }
        class81.field1018.method5572();
        field820.method7775();
        if (Statics.field3094 != null) {
            Statics.field3094.method6585();
        }
        if (Statics.field3553 != null) {
            Statics.field3553.method6585();
        }
        if (Statics.field1644 != null) {
            Statics.field1644.method6585();
        }
        if (Statics.field4783 != null) {
            Statics.field4783.method6585();
        }
        if (Statics.field2840 != null) {
            Statics.field2840.method6585();
        }
        if (Statics.field1358 != null) {
            Statics.field1358.method6585();
        }
        if (Statics.field3375 != null) {
            Statics.field3375.method6585();
        }
        if (Statics.field1378 != null) {
            Statics.field1378.method6585();
        }
        if (Statics.field522 != null) {
            Statics.field522.method6585();
        }
        if (Statics.field1039 != null) {
            Statics.field1039.method6585();
        }
        if (Statics.field1638 != null) {
            Statics.field1638.method6585();
        }
        if (Statics.field3644 != null) {
            Statics.field3644.method6585();
        }
        if (Statics.field2971 != null) {
            Statics.field2971.method6585();
        }
        if (Statics.field3033 != null) {
            Statics.field3033.method6585();
        }
        if (Statics.field1453 != null) {
            Statics.field1453.method6585();
        }
        if (Statics.field1657 != null) {
            Statics.field1657.method6585();
        }
        if (Statics.field1885 != null) {
            Statics.field1885.method6585();
        }
        if (Statics.field106 != null) {
            Statics.field106.method6585();
        }
        if (Statics.field3639 != null) {
            Statics.field3639.method6585();
        }
        if (Statics.field1603 != null) {
            Statics.field1603.method6585();
        }
        if (Statics.field371 != null) {
            Statics.field371.method6585();
        }
        if (Statics.field3565 != null) {
            Statics.field3565.method6585();
        }
    }

    @ObfuscatedName("dz.iy(I)V")
    public static final void method2224() {
        Statics.field2044 = null;
        Statics.field1753 = null;
        Statics.field4677 = 0;
    }

    @ObfuscatedName("mc.it(I)V")
    public static final void method5577() {
        if (field592 > 0) {
            method3595();
        } else {
            field594.method7673();
            Statics.method2625(40);
            Statics.field4871 = field591.method2748();
            field591.method2751();
        }
    }

    @ObfuscatedName("ls.il(ZI)V")
    public static final void method5453(boolean arg0) {
        if (arg0) {
            field569 = class78.field965 ? class144.field1672 : class144.field1674;
        } else {
            field569 = Statics.field4879.method2469(class78.field976) ? class144.field1673 : class144.field1671;
        }
    }

    @ObfuscatedName("client.ii(I)V")
    public final void method1386() {
        if (field692 > 1) {
            field692--;
        }
        if (field592 > 0) {
            field592--;
        }
        if (field593) {
            field593 = false;
            method5577();
            return;
        }
        if (!field671) {
            method688();
        }
        for (int var1 = 0; var1 < 100 && this.method1178(field591); var1++) {
        }
        if (field598 != 30) {
            return;
        }
        while (true) {
            class38 var2 = (class38) class37.field247.method6889();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field594.field4836) {
                    class321 var6 = class321.method3542(class319.field3290, field591.field1467);
                    var6.field3393.method8779(0);
                    int var7 = var6.field3393.field5344;
                    field594.method7685(var6.field3393);
                    var6.field3393.method8777(var6.field3393.field5344 - var7);
                    field591.method2745(var6);
                    field594.method7678();
                }
                Object var8 = Statics.field474.field1108;
                synchronized (Statics.field474.field1108) {
                    if (!field552) {
                        Statics.field474.field1109 = 0;
                    } else if (class36.field238 != 0 || Statics.field474.field1109 >= 40) {
                        class321 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field474.field1109 && (var9 == null || var9.field3393.field5344 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field474.field1114[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field474.field1110[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field752 != var16 || field547 != var15) {
                                if (var9 == null) {
                                    var9 = class321.method3542(class319.field3319, field591.field1467);
                                    var9.field3393.method8779(0);
                                    var10 = var9.field3393.field5344;
                                    var9.field3393.field5344 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field548 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field752;
                                    var18 = var15 - field547;
                                    var19 = (int) ((Statics.field474.field1112[var14] - field548) / 20L);
                                    var12 = (int) ((Statics.field474.field1112[var14] - field548) % 20L + (long) var12);
                                }
                                field752 = var16;
                                field547 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field3393.method8780((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field3393.method8779(var19 + 128);
                                    var9.field3393.method8780((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field3393.method8779(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3393.method8981(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3393.method8981(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field3393.method8780((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field3393.method8981(Integer.MIN_VALUE);
                                    } else {
                                        var9.field3393.method8981(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field548 = Statics.field474.field1112[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field3393.method8777(var9.field3393.field5344 - var10);
                            int var20 = var9.field3393.field5344;
                            var9.field3393.field5344 = var10;
                            var9.field3393.method8779(var12 / var13);
                            var9.field3393.method8779(var12 % var13);
                            var9.field3393.field5344 = var20;
                            field591.method2745(var9);
                        }
                        if (var11 >= Statics.field474.field1109) {
                            Statics.field474.field1109 = 0;
                        } else {
                            Statics.field474.field1109 -= var11;
                            System.arraycopy(Statics.field474.field1110, var11, Statics.field474.field1110, 0, Statics.field474.field1109);
                            System.arraycopy(Statics.field474.field1114, var11, Statics.field474.field1114, 0, Statics.field474.field1109);
                            System.arraycopy(Statics.field474.field1112, var11, Statics.field474.field1112, 0, Statics.field474.field1109);
                        }
                    }
                }
                if (class36.field238 == 1 || !Statics.field1379 && class36.field238 == 4 || class36.field238 == 2) {
                    long var22 = class36.field241 - field545 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field545 = class36.field241 * -1L;
                    int var24 = class36.field240;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field5283) {
                        var24 = Statics.field5283;
                    }
                    int var25 = class36.field239;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field190) {
                        var25 = Statics.field190;
                    }
                    int var26 = (int) var22;
                    class321 var27 = class321.method3542(class319.field3323, field591.field1467);
                    var27.field3393.method8780((class36.field238 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field3393.method8780(var25);
                    var27.field3393.method8780(var24);
                    field591.method2745(var27);
                }
                if (field737 != 0) {
                    class321 var28 = class321.method3542(class319.field3365, field591.field1467);
                    var28.field3393.method8780(field737);
                    field591.method2745(var28);
                }
                if (field764.field2468 > 0) {
                    class321 var29 = class321.method3542(class319.field3363, field591.field1467);
                    var29.field3393.method8780(0);
                    int var30 = var29.field3393.field5344;
                    long var31 = class326.method2895();
                    for (int var33 = 0; var33 < field764.field2468; var33++) {
                        long var34 = var31 - field769;
                        if (var34 > 16777215L) {
                            var34 = 16777215L;
                        }
                        field769 = var31;
                        var29.field3393.method8779(field764.field2474[var33]);
                        var29.field3393.method8841((int) var34);
                    }
                    var29.field3393.method8792(var29.field3393.field5344 - var30);
                    field591.method2745(var29);
                }
                if (field629 > 0) {
                    field629--;
                }
                if (field764.method4087(96) || field764.method4087(97) || field764.method4087(98) || field764.method4087(99)) {
                    field630 = true;
                }
                if (field630 && field629 <= 0) {
                    field629 = 20;
                    field630 = false;
                    class321 var36 = class321.method3542(class319.field3306, field591.field1467);
                    var36.field3393.method8867(field614);
                    var36.field3393.method8834(field615);
                    field591.method2745(var36);
                }
                if (Statics.field4865 && !field549) {
                    field549 = true;
                    class321 var37 = class321.method3542(class319.field3277, field591.field1467);
                    var37.field3393.method8779(1);
                    field591.method2745(var37);
                }
                if (!Statics.field4865 && field549) {
                    field549 = false;
                    class321 var38 = class321.method3542(class319.field3277, field591.field1467);
                    var38.field3393.method8779(0);
                    field591.method2745(var38);
                }
                if (Statics.field18 != null) {
                    Statics.field18.method8440();
                }
                method4200();
                if (Statics.field2540) {
                    method8148();
                    Statics.field2540 = false;
                }
                if (field772 != Statics.field3967.field1349) {
                    field772 = Statics.field3967.field1349;
                    int var39 = Statics.field3967.field1349;
                    int[] var40 = Statics.field1288.field5445;
                    int var41 = var40.length;
                    for (int var42 = 0; var42 < var41; var42++) {
                        var40[var42] = 0;
                    }
                    for (int var43 = 1; var43 < 103; var43++) {
                        int var44 = (103 - var43) * 2048 + 24628;
                        for (int var45 = 1; var45 < 103; var45++) {
                            if ((Statics.field3967.field1341[var39][var45][var43] & 0x18) == 0) {
                                Statics.field3967.field1332.method4537(var40, var44, 512, var39, var45, var43);
                            }
                            if (var39 < 3 && (Statics.field3967.field1341[var39 + 1][var45][var43] & 0x8) != 0) {
                                Statics.field3967.field1332.method4537(var40, var44, 512, var39 + 1, var45, var43);
                            }
                            var44 += 4;
                        }
                    }
                    int var46 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var47 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field1288.method9218();
                    for (int var48 = 1; var48 < 103; var48++) {
                        for (int var49 = 1; var49 < 103; var49++) {
                            if ((Statics.field3967.field1341[var39][var49][var48] & 0x18) == 0) {
                                method411(var39, var49, var48, var46, var47);
                            }
                            if (var39 < 3 && (Statics.field3967.field1341[var39 + 1][var49][var48] & 0x8) != 0) {
                                method411(var39 + 1, var49, var48, var46, var47);
                            }
                        }
                    }
                    field776 = 0;
                    for (int var50 = 0; var50 < 104; var50++) {
                        for (int var51 = 0; var51 < 104; var51++) {
                            long var52 = Statics.field3967.field1332.method4530(Statics.field3967.field1349, var50, var51);
                            if (var52 != 0L) {
                                int var54 = class265.method2622(var52);
                                int var55 = class224.method3868(var54).field2311;
                                if (var55 >= 0 && class199.method3551(var55).field2029) {
                                    field618[field776] = class199.method3551(var55).method3527(false);
                                    field774[field776] = var50;
                                    field775[field776] = var51;
                                    field776++;
                                }
                            }
                        }
                    }
                    Statics.field3196.method9185();
                }
                if (field598 != 30) {
                    return;
                }
                method2346(Statics.field3967);
                method412();
                field591.field1471++;
                if (field591.field1471 > 750) {
                    method5577();
                    return;
                }
                class102 var56 = Statics.field3967;
                int var57 = var56.field1337.field1416;
                int[] var58 = var56.field1337.field1417;
                for (int var59 = 0; var59 < var57; var59++) {
                    class94 var60 = var56.field1342[var58[var59]];
                    if (var60 != null) {
                        method1142(var56, var60, 1);
                    }
                }
                method4082(Statics.field3967);
                class102 var61 = Statics.field3967;
                for (int var62 = 0; var62 < var61.field1335; var62++) {
                    int var63 = var61.field1351[var62];
                    class476 var64 = var61.field1348[var63];
                    if (var64 != null) {
                        var64.method7999();
                    }
                }
                method1021(Statics.field3967);
                for (int var65 = 0; var65 < Statics.field3967.field1335; var65++) {
                    class476 var66 = Statics.field3967.field1348[Statics.field3967.field1351[var65]];
                    if (var66 != null) {
                        method2346(var66.field4948);
                        class102 var67 = var66.field4948;
                        int var68 = var67.field1337.field1416;
                        int[] var69 = var67.field1337.field1417;
                        for (int var70 = 0; var70 < var68; var70++) {
                            class94 var71 = var67.field1342[var69[var70]];
                            if (var71 != null) {
                                method1142(var67, var71, 1);
                            }
                        }
                        method4082(var66.field4948);
                        method1021(var66.field4948);
                    }
                }
                field607++;
                if (field778 != 0) {
                    field648 += 20;
                    if (field648 >= 400) {
                        field778 = 0;
                    }
                }
                class358 var72 = Statics.field231;
                class358 var73 = Statics.field2163;
                Statics.field231 = null;
                Statics.field2163 = null;
                field712 = null;
                field716 = false;
                field735 = false;
                field766 = 0;
                while (field764.method4098() && field766 < 128) {
                    if (field669 >= 2 && field764.method4087(82) && field764.field2477 == 66) {
                        String var74 = class114.method6428();
                        Statics.field1971.method477(var74);
                    } else if (field620 != 1 || field764.field2465 <= 0) {
                        field768[field766] = field764.field2477;
                        field767[field766] = field764.field2465;
                        field766++;
                    }
                }
                if (Statics.method4147() && field764.method4087(82) && field764.method4087(81) && field737 != 0) {
                    int var75 = Statics.field84.field1151 - field737;
                    if (var75 < 0) {
                        var75 = 0;
                    } else if (var75 > 3) {
                        var75 = 3;
                    }
                    if (Statics.field84.field1151 != var75) {
                        int var76 = Statics.field3967.field1338 + Statics.field84.field1230[0];
                        int var77 = Statics.field3967.field1334 + Statics.field84.field1277[0];
                        class321 var78 = class321.method3542(class319.field3337, field591.field1467);
                        var78.field3393.method8887(var75);
                        var78.field3393.method8834(var77);
                        var78.field3393.method8850(0);
                        var78.field3393.method8780(var76);
                        field591.method2745(var78);
                    }
                    field737 = 0;
                }
                if (field783 != -1) {
                    method3655(field783, 0, 0, Statics.field190, Statics.field5283, 0, 0);
                }
                field720++;
                while (true) {
                    class90 var79;
                    class358 var80;
                    class358 var81;
                    do {
                        var79 = (class90) field740.method6832();
                        if (var79 == null) {
                            while (true) {
                                class90 var82;
                                class358 var83;
                                class358 var84;
                                do {
                                    var82 = (class90) field566.method6832();
                                    if (var82 == null) {
                                        while (true) {
                                            class90 var85;
                                            class358 var86;
                                            class358 var87;
                                            do {
                                                var85 = (class90) field739.method6832();
                                                if (var85 == null) {
                                                    boolean var88 = false;
                                                    while (true) {
                                                        class230 var89 = (class230) field742.method6832();
                                                        if (var89 == null) {
                                                            if (!var88 && class36.field238 == 1) {
                                                                field553.method4070();
                                                            }
                                                            this.method1179();
                                                            if (Statics.field18 != null) {
                                                                Statics.field18.method8268(Statics.field3967.field1349, (Statics.field900.method1154() >> 7) + Statics.field3967.field1338, (Statics.field900.method1146() >> 7) + Statics.field3967.field1334, false);
                                                                Statics.field18.method8272();
                                                            }
                                                            if (field708 != null) {
                                                                this.method1184();
                                                            }
                                                            boolean var90 = false;
                                                            for (int var91 = 0; var91 < Statics.field3967.field1335; var91++) {
                                                                class476 var92 = Statics.field3967.field1348[Statics.field3967.field1351[var91]];
                                                                class102 var93 = var92.field4948;
                                                                class253 var94 = var93.field1332;
                                                                if (var92 != null && var94.method4665()) {
                                                                    if (!var90) {
                                                                        int var95 = var94.field2741;
                                                                        int var96 = var94.field2742;
                                                                        class321 var97 = class321.method3542(class319.field3299, field591.field1467);
                                                                        var97.field3393.method8779(5);
                                                                        var97.field3393.method8834(var93.field1334 + var96);
                                                                        var97.field3393.method8867(var93.field1338 + var95);
                                                                        var97.field3393.method8779(field764.method4087(82) ? (field764.method4087(81) ? 2 : 1) : 0);
                                                                        field591.method2745(var97);
                                                                        var90 = true;
                                                                        field741 = class36.field239;
                                                                        field647 = class36.field240;
                                                                        field778 = 1;
                                                                        field648 = 0;
                                                                        field777 = var95;
                                                                        field637 = var96;
                                                                    }
                                                                    var94.method4636();
                                                                }
                                                            }
                                                            if (!var90 && Statics.field3967.field1332.method4665()) {
                                                                int var98 = Statics.field3967.field1332.field2741;
                                                                int var99 = Statics.field3967.field1332.field2742;
                                                                class321 var100 = class321.method3542(class319.field3299, field591.field1467);
                                                                var100.field3393.method8779(5);
                                                                var100.field3393.method8834(Statics.field3967.field1334 + var99);
                                                                var100.field3393.method8867(Statics.field3967.field1338 + var98);
                                                                var100.field3393.method8779(field764.method4087(82) ? (field764.method4087(81) ? 2 : 1) : 0);
                                                                field591.method2745(var100);
                                                                Statics.field3967.field1332.method4636();
                                                                field741 = class36.field239;
                                                                field647 = class36.field240;
                                                                field778 = 1;
                                                                field648 = 0;
                                                                field777 = var98;
                                                                field637 = var99;
                                                            }
                                                            if (var90) {
                                                                Statics.field3967.field1332.method4636();
                                                            }
                                                            if (Statics.field231 != var72) {
                                                                if (var72 != null) {
                                                                    Statics.method5599(var72);
                                                                }
                                                                if (Statics.field231 != null) {
                                                                    Statics.method5599(Statics.field231);
                                                                }
                                                            }
                                                            if (Statics.field2163 != var73 && field781 == field688) {
                                                                if (var73 != null) {
                                                                    Statics.method5599(var73);
                                                                }
                                                                if (Statics.field2163 != null) {
                                                                    Statics.method5599(Statics.field2163);
                                                                }
                                                            }
                                                            if (Statics.field2163 == null) {
                                                                if (field781 > 0) {
                                                                    field781--;
                                                                }
                                                            } else if (field781 < field688) {
                                                                field781++;
                                                                if (field781 == field688) {
                                                                    Statics.method5599(Statics.field2163);
                                                                }
                                                            }
                                                            method6817();
                                                            if (field795) {
                                                                method2900();
                                                            } else if (field539) {
                                                                if (!field789) {
                                                                    int var101 = Statics.field939 * 128 + 64;
                                                                    int var102 = Statics.field3708 * 128 + 64;
                                                                    int var103 = method826(Statics.field3967, var101, var102, Statics.field3967.field1349) - Statics.field4881;
                                                                    method2243(var101, var103, var102);
                                                                } else if (field792 != null) {
                                                                    Statics.field3770 = field792.method8215();
                                                                    Statics.field1498 = field792.method8216();
                                                                    if (field791) {
                                                                        Statics.field1848 = field792.method8217();
                                                                    } else {
                                                                        Statics.field1848 = method826(Statics.field3967, Statics.field3770, Statics.field1498, Statics.field3967.field1349) - field792.method8217();
                                                                    }
                                                                    field792.method8230();
                                                                }
                                                                if (field790) {
                                                                    if (field794 != null) {
                                                                        Statics.field1255 = field794.method8224();
                                                                        Statics.field1255 = Math.min(Math.max(Statics.field1255, 128), 383);
                                                                        field794.method8230();
                                                                    }
                                                                    if (field793 != null) {
                                                                        Statics.field2100 = field793.method8224() & 0x7FF;
                                                                        field793.method8230();
                                                                    }
                                                                } else {
                                                                    int var104 = Statics.field3270 * 128 + 64;
                                                                    int var105 = Statics.field3134 * 128 + 64;
                                                                    int var106 = method826(Statics.field3967, var104, var105, Statics.field3967.field1349) - Statics.field1503;
                                                                    int var107 = var104 - Statics.field3770;
                                                                    int var108 = var106 - Statics.field1848;
                                                                    int var109 = var105 - Statics.field1498;
                                                                    int var110 = (int) Math.sqrt((double) (var107 * var107 + var109 * var109));
                                                                    int var111 = (int) (Math.atan2((double) var108, (double) var110) * 325.9490051269531D) & 0x7FF;
                                                                    int var112 = (int) (Math.atan2((double) var107, (double) var109) * -325.9490051269531D) & 0x7FF;
                                                                    Statics.method5575(var111, var112);
                                                                }
                                                            }
                                                            for (int var113 = 0; var113 < 5; var113++) {
                                                                int var10002 = field710[var113]++;
                                                            }
                                                            Statics.field3238.method2697();
                                                            int var114 = class36.method5031();
                                                            int var115 = field216.method334();
                                                            if (var114 > 15000 && var115 > 15000) {
                                                                field592 = 250;
                                                                class36.field242 = 14500;
                                                                class321 var117 = class321.method3542(class319.field3328, field591.field1467);
                                                                field591.method2745(var117);
                                                            }
                                                            Statics.field182.method1843();
                                                            method8179();
                                                            field591.field1464++;
                                                            if (field591.field1464 > 50) {
                                                                class321 var118 = class321.method3542(class319.field3358, field591.field1467);
                                                                field591.method2745(var118);
                                                            }
                                                            try {
                                                                field591.method2747();
                                                            } catch (IOException var120) {
                                                                method5577();
                                                            }
                                                            class184.method3361().method3381();
                                                            return;
                                                        }
                                                        if (var89.field2460.field3894 == 12) {
                                                            var88 = true;
                                                        }
                                                        method8664(var89);
                                                    }
                                                }
                                                var86 = var85.field1095;
                                                if (var86.field3930 < 0) {
                                                    break;
                                                }
                                                var87 = Statics.field75.method5906(var86.field3965);
                                            } while (var87 == null || var87.field3884 == null || var86.field3930 >= var87.field3884.length || var87.field3884[var86.field3930] != var86);
                                            class73.method6486(var85);
                                        }
                                    }
                                    var83 = var82.field1095;
                                    if (var83.field3930 < 0) {
                                        break;
                                    }
                                    var84 = Statics.field75.method5906(var83.field3965);
                                } while (var84 == null || var84.field3884 == null || var83.field3930 >= var84.field3884.length || var84.field3884[var83.field3930] != var83);
                                class73.method6486(var82);
                            }
                        }
                        var80 = var79.field1095;
                        if (var80.field3930 < 0) {
                            break;
                        }
                        var81 = Statics.field75.method5906(var80.field3965);
                    } while (var81 == null || var81.field3884 == null || var80.field3930 >= var81.field3884.length || var81.field3884[var80.field3930] != var80);
                    class73.method6486(var79);
                }
            }
            class321 var4 = class321.method3542(class319.field3287, field591.field1467);
            var4.field3393.method8779(0);
            int var5 = var4.field3393.field5344;
            Statics.method3632(var4.field3393);
            var4.field3393.method8777(var4.field3393.field5344 - var5);
            field591.method2745(var4);
        }
    }

    @ObfuscatedName("if.iz(I)V")
    public static final void method3723() {
        if (Statics.field1642 != null) {
            Statics.field1642.method797();
        }
    }

    @ObfuscatedName("bf.ij(B)V")
    public static final void method412() {
        for (int var0 = 0; var0 < field693; var0++) {
            int var10002 = field784[var0]--;
            if (field784[var0] >= -10) {
                class40 var2 = field787[var0];
                if (var2 == null) {
                    class40 var10000 = (class40) null;
                    var2 = class40.method750(Statics.field1638, field782[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field784[var0] += var2.method739();
                    field787[var0] = var2;
                }
                if (field784[var0] < 0) {
                    int var11;
                    if (field554[var0] == 0) {
                        var11 = Statics.field4879.method2484();
                    } else {
                        int var3 = (field554[var0] & 0xFF) * 128;
                        int var4 = field554[var0] >> 16 & 0xFF;
                        int var5 = Math.abs(var4 * 128 + 64 - Statics.field84.field1215);
                        int var6 = field554[var0] >> 8 & 0xFF;
                        int var7 = Math.abs(var6 * 128 + 64 - Statics.field84.field1276);
                        int var8 = Math.max(var5 + var7 - 128, 0);
                        int var9 = Math.max(((field786[var0] & 0x1F) - 1) * 128, 0);
                        if (var8 >= var3) {
                            field784[var0] = -100;
                            continue;
                        }
                        float var10 = var9 < var3 ? Math.min(Math.max((float) (var3 - var8) / (float) (var3 - var9), 0.0F), 1.0F) : 1.0F;
                        var11 = (int) (var10 * (float) Statics.field4879.method2437());
                    }
                    if (var11 > 0) {
                        class41 var12 = var2.method738().method754(Statics.field1354);
                        class49 var13 = class49.method863(var12, 100, var11);
                        var13.method866(field606[var0] - 1);
                        Statics.field3737.method699(var13);
                    }
                    field784[var0] = -100;
                }
            } else {
                field693--;
                for (int var1 = var0; var1 < field693; var1++) {
                    field782[var1] = field782[var1 + 1];
                    field787[var1] = field787[var1 + 1];
                    field606[var1] = field606[var1 + 1];
                    field784[var1] = field784[var1 + 1];
                    field554[var1] = field554[var1 + 1];
                    field786[var1] = field786[var1 + 1];
                }
                var0--;
            }
        }
        if (!field780) {
            return;
        }
        boolean var14;
        if (!class330.field3582.isEmpty()) {
            var14 = true;
        } else if (class330.field3579.isEmpty() || class330.field3579.get(0) == null || ((class342) class330.field3579.get(0)).field3694 == null) {
            var14 = false;
        } else {
            var14 = ((class342) class330.field3579.get(0)).field3694.method5673();
        }
        if (var14) {
            return;
        }
        if (Statics.field4879.method2417() != 0) {
            boolean var15 = !class330.field3580.isEmpty();
            if (var15) {
                class330.method5428(Statics.field3033, Statics.field4879.method2417());
            }
        }
        field780 = false;
    }

    @ObfuscatedName("do.ik(Lic;IIILdh;I)V")
    public static void method2178(class227 arg0, int arg1, int arg2, int arg3, class98 arg4) {
        if (field693 >= 50 || arg0.field2422 == null || arg1 >= arg0.field2422.length || arg0.field2422[arg1] == null) {
            return;
        }
        int var5 = arg0.field2422[arg1].field2272 & 0x1F;
        if (!(var5 <= 0 || Statics.field4879.method2437() != 0) || !(var5 != 0 || Statics.field4879.method2484() != 0)) {
            return;
        }
        class223 var6 = arg0.field2422[arg1];
        boolean var9 = Statics.field84 == arg4;
        if (var6 == null) {
            return;
        }
        if (var6.field2272 == 0) {
            if (!var9) {
                return;
            }
            field554[field693] = 0;
        } else {
            int var10 = (arg2 - 64) / 128;
            int var11 = (arg3 - 64) / 128;
            field554[field693] = var6.field2272 + (var10 << 16) + (var11 << 8);
        }
        field782[field693] = var6.field2273;
        field606[field693] = var6.field2270;
        field784[field693] = 0;
        field787[field693] = null;
        field786[field693] = var6.field2274;
        field693++;
    }

    @ObfuscatedName("bn.in(Lic;IIILdh;I)V")
    public static void method444(class227 arg0, int arg1, int arg2, int arg3, class98 arg4) {
        if (field693 >= 50 || arg0.field2416 == null || !arg0.field2416.containsKey(arg1)) {
            return;
        }
        class223 var5 = (class223) arg0.field2416.get(arg1);
        if (var5 == null) {
            return;
        }
        int var6 = var5.field2272 & 0x1F;
        if (!(var6 <= 0 || Statics.field4879.method2437() != 0) || !(var6 != 0 || Statics.field4879.method2484() != 0)) {
            return;
        }
        boolean var10 = Statics.field84 == arg4;
        if (var5 == null) {
            return;
        }
        if (var5.field2272 == 0) {
            if (!var10) {
                return;
            }
            field554[field693] = 0;
        } else {
            int var11 = (arg2 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            field554[field693] = var5.field2272 + (var11 << 16) + (var12 << 8);
        }
        field782[field693] = var5.field2273;
        field606[field693] = var5.field2270;
        field784[field693] = 0;
        field787[field693] = null;
        field786[field693] = var5.field2274;
        field693++;
    }

    @ObfuscatedName("rv.ix(IIII)V")
    public static void method7696(int arg0, int arg1, int arg2) {
        if (Statics.field4879.method2484() == 0 || arg1 == 0 || field693 >= 50) {
            return;
        }
        field782[field693] = arg0;
        field606[field693] = arg1;
        field784[field693] = arg2;
        field787[field693] = null;
        field554[field693] = 0;
        field786[field693] = 0;
        field693++;
    }

    @ObfuscatedName("ag.iv(IB)V")
    public static void method370(int arg0) {
        if (arg0 == -1 && !field780) {
            class330.method6481(0, 0);
        } else if (arg0 != -1) {
            boolean var2;
            if (class330.field3580.isEmpty()) {
                var2 = false;
            } else {
                class342 var1 = (class342) class330.field3580.get(0);
                var2 = var1 != null && var1.field3691 == arg0;
            }
            if (!var2 && Statics.field4879.method2417() != 0) {
                ArrayList var3 = new ArrayList();
                var3.add(new class342(Statics.field3033, arg0, 0, Statics.field4879.method2417(), false));
                if (field780) {
                    class330.field3580.clear();
                    class330.field3580.addAll(var3);
                    class330.method3062(0, 100, 100, 0);
                } else {
                    class330.method1099(var3, 0, 100, 100, 0, false);
                }
            }
        }
    }

    @ObfuscatedName("am.ic(Ljava/util/ArrayList;IIIII)V")
    public static void method303(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field780) {
            class330.method6481(0, 0);
        } else if (var5 != -1) {
            boolean var7;
            if (class330.field3580.isEmpty()) {
                var7 = false;
            } else {
                class342 var6 = (class342) class330.field3580.get(0);
                var7 = var6 != null && var6.field3691 == var5;
            }
            if (!var7 && Statics.field4879.method2417() != 0) {
                ArrayList var8 = new ArrayList();
                for (int var9 = 0; var9 < arg0.size(); var9++) {
                    var8.add(new class342(Statics.field3033, (Integer) arg0.get(var9), 0, Statics.field4879.method2417(), false));
                }
                if (field780) {
                    class330.field3580.clear();
                    class330.field3580.addAll(var8);
                    class330.method3062(arg1, arg2, arg3, arg4);
                } else {
                    class330.method1099(var8, arg1, arg2, arg3, arg4, false);
                }
            }
        }
    }

    @ObfuscatedName("bf.iu(III)V")
    public static void method410(int arg0, int arg1) {
        if (Statics.field4879.method2417() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class342(Statics.field3644, arg0, 0, Statics.field4879.method2417(), false));
            class330.method1099(var2, 0, 0, 0, 0, true);
            field780 = true;
        }
    }

    @ObfuscatedName("client.ih(III)V")
    public void method1169(int arg0, int arg1) {
        if (field591 != null && field591.field1467 != null && arg0 > -1 && Statics.field4879.method2417() > 0 && !field780) {
            class321 var3 = class321.method3542(class319.field3278, field591.field1467);
            var3.field3393.method8981(arg0);
            field591.method2745(var3);
        }
    }

    @ObfuscatedName("jv.iw(B)V")
    public static final void method4200() {
        if (!Statics.field3138) {
            return;
        }
        if (Statics.field1404 != null) {
            Statics.field1404.method7917();
        }
        for (int var0 = 0; var0 < Statics.field3967.field1337.field1416; var0++) {
            class94 var1 = Statics.field3967.field1342[Statics.field3967.field1337.field1417[var0]];
            var1.method2263();
        }
        Statics.field3138 = false;
    }

    @ObfuscatedName("an.is(Lnb;III)V")
    public static final void method292(class358 arg0, int arg1, int arg2) {
        if (field779 != 0 && field779 != 3 || field671 || !(class36.field238 == 1 || !Statics.field1379 && class36.field238 == 4)) {
            return;
        }
        class345 var3 = arg0.method6294(Statics.field75, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field239 - arg1;
        int var5 = class36.field240 - arg2;
        if (!var3.method5869(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3705 / 2;
        int var7 = var5 - var3.field3703 / 2;
        int var8 = field615 & 0x7FF;
        int var9 = class248.field2665[var8];
        int var10 = class248.field2669[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field900.method1154() + var11 >> 7;
        int var14 = Statics.field900.method1146() - var12 >> 7;
        class321 var15 = class321.method3542(class319.field3283, field591.field1467);
        var15.field3393.method8779(18);
        var15.field3393.method8834(Statics.field3967.field1334 + var14);
        var15.field3393.method8867(Statics.field3967.field1338 + var13);
        var15.field3393.method8779(field764.method4087(82) ? (field764.method4087(81) ? 2 : 1) : 0);
        var15.field3393.method8779(var6);
        var15.field3393.method8779(var7);
        var15.field3393.method8780(field615);
        var15.field3393.method8779(57);
        var15.field3393.method8779(0);
        var15.field3393.method8779(0);
        var15.field3393.method8779(89);
        var15.field3393.method8780(Statics.field84.field1215);
        var15.field3393.method8780(Statics.field84.field1276);
        var15.field3393.method8779(63);
        field591.method2745(var15);
        field777 = var13;
        field637 = var14;
    }

    @ObfuscatedName("ck.ir(Ldt;I)V")
    public static final void method1021(class102 arg0) {
        int[] var1 = arg0.field1337.field1417;
        for (int var2 = 0; var2 < arg0.field1337.field1416; var2++) {
            class94 var3 = arg0.field1342[var1[var2]];
            if (var3 != null && var3.field1219 > 0) {
                var3.field1219--;
                if (var3.field1219 == 0) {
                    var3.field1225 = null;
                }
            }
        }
        for (int var4 = 0; var4 < arg0.field1345; var4++) {
            int var5 = arg0.field1346[var4];
            class104 var6 = arg0.field1344[var5];
            if (var6 != null && var6.field1219 > 0) {
                var6.field1219--;
                if (var6.field1219 == 0) {
                    var6.field1225 = null;
                }
            }
        }
    }

    @ObfuscatedName("dc.im(Ljava/lang/String;I)V")
    public static final void method2250(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field4879.method2389(!Statics.field4879.method2481());
            if (Statics.field4879.method2481()) {
                class114.method2802(99, "", "Roofs are now all hidden");
            } else {
                class114.method2802(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class415.method3328(arg0.substring(5).trim()) == 1;
            Statics.field1971.method488(var1);
            class248.method4348(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field561 = !field561;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field4879.method2396();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field723 = !field723;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field684 = !field684;
        }
        if (arg0.startsWith("setdrawdistance")) {
            String[] var2 = arg0.split(" ");
            try {
                int var3 = Integer.parseInt(var2[1]);
                Statics.field4879.method2418(var3);
            } catch (NumberFormatException var6) {
                class114.method2802(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var2[1]));
            }
        }
        if (arg0.equalsIgnoreCase("getdrawdistance")) {
            class114.method2802(99, "", String.format("%d", Statics.field4879.method2459()));
        }
        if (field669 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field18.field5175 = !Statics.field18.field5175;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field4879.method2513(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field4879.method2513(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method5577();
            }
        }
        class321 var5 = class321.method3542(class319.field3331, field591.field1467);
        var5.field3393.method8779(arg0.length() + 1);
        var5.field3393.method8864(arg0);
        field591.method2745(var5);
    }

    @ObfuscatedName("ap.jx(II)I")
    public static final int method162(int arg0) {
        return Math.abs(arg0 - Statics.field2100) > 1024 ? (arg0 < Statics.field2100 ? 1 : -1) * 2048 + arg0 : arg0;
    }

    @ObfuscatedName("ez.jp(I)V")
    public static final void method2900() {
        method2243(Statics.field3739, Statics.field87, Statics.field167);
        Statics.method5575(Statics.field333, Statics.field2642);
        if (Statics.field3770 != Statics.field3739 || Statics.field87 != Statics.field1848 || Statics.field167 != Statics.field1498 || Statics.field333 != Statics.field1255 || Statics.field2642 != Statics.field2100) {
            return;
        }
        field795 = false;
        field539 = false;
        field789 = false;
        field790 = false;
        Statics.field3270 = 0;
        Statics.field3134 = 0;
        Statics.field1503 = 0;
        Statics.field1451 = 0;
        Statics.field3032 = 0;
        Statics.field3968 = 0;
        Statics.field1506 = 0;
        Statics.field939 = 0;
        Statics.field3708 = 0;
        Statics.field4881 = 0;
        field792 = null;
        field794 = null;
        field793 = null;
    }

    @ObfuscatedName("du.ji(IIII)V")
    public static final void method2243(int arg0, int arg1, int arg2) {
        if (Statics.field3770 < arg0) {
            Statics.field3770 += Statics.field3968 * (arg0 - Statics.field3770) / 1000 + Statics.field1506;
            if (Statics.field3770 > arg0) {
                Statics.field3770 = arg0;
            }
        }
        if (Statics.field3770 > arg0) {
            Statics.field3770 -= Statics.field3968 * (Statics.field3770 - arg0) / 1000 + Statics.field1506;
            if (Statics.field3770 < arg0) {
                Statics.field3770 = arg0;
            }
        }
        if (Statics.field1848 < arg1) {
            Statics.field1848 += Statics.field3968 * (arg1 - Statics.field1848) / 1000 + Statics.field1506;
            if (Statics.field1848 > arg1) {
                Statics.field1848 = arg1;
            }
        }
        if (Statics.field1848 > arg1) {
            Statics.field1848 -= Statics.field3968 * (Statics.field1848 - arg1) / 1000 + Statics.field1506;
            if (Statics.field1848 < arg1) {
                Statics.field1848 = arg1;
            }
        }
        if (Statics.field1498 < arg2) {
            Statics.field1498 += Statics.field3968 * (arg2 - Statics.field1498) / 1000 + Statics.field1506;
            if (Statics.field1498 > arg2) {
                Statics.field1498 = arg2;
            }
        }
        if (Statics.field1498 > arg2) {
            Statics.field1498 -= Statics.field3968 * (Statics.field1498 - arg2) / 1000 + Statics.field1506;
            if (Statics.field1498 < arg2) {
                Statics.field1498 = arg2;
            }
        }
    }

    @ObfuscatedName("pe.jr(S)V")
    public static final void method6817() {
        if (field620 == 0) {
            int var0 = Statics.field900.method1154();
            int var1 = Statics.field900.method1146();
            int var2 = Statics.field900.method1148();
            if (Statics.field179 - var0 < -500 || Statics.field179 - var0 > 500 || Statics.field932 - var1 < -500 || Statics.field932 - var1 > 500) {
                Statics.field179 = var0;
                Statics.field932 = var1;
            }
            if (Statics.field179 != var0) {
                Statics.field179 += (var0 - Statics.field179) / 16;
            }
            if (Statics.field932 != var1) {
                Statics.field932 += (var1 - Statics.field932) / 16;
            }
            int var3 = Statics.field179 >> 7;
            int var4 = Statics.field932 >> 7;
            int var5 = method826(Statics.field3967, Statics.field179, Statics.field932, var2);
            int var6 = 0;
            if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                        int var9 = var2;
                        if (var2 < 3 && (Statics.field3967.field1341[1][var7][var8] & 0x2) == 2) {
                            var9 = var2 + 1;
                        }
                        int var10 = var5 - Statics.field3967.field1340[var9][var7][var8];
                        if (var10 > var6) {
                            var6 = var10;
                        }
                    }
                }
            }
            int var11 = var6 * 192;
            if (var11 > 98048) {
                var11 = 98048;
            }
            if (var11 < 32768) {
                var11 = 32768;
            }
            if (var11 > field616) {
                field616 += (var11 - field616) / 24;
            } else if (var11 < field616) {
                field616 += (var11 - field616) / 80;
            }
            Statics.field2831 = method826(Statics.field3967, var0, var1, var2) - field565;
        } else if (field620 == 1) {
            method96();
            short var12 = -1;
            if (field764.method4087(33)) {
                var12 = 0;
            } else if (field764.method4087(49)) {
                var12 = 1024;
            }
            if (field764.method4087(48)) {
                if (var12 == 0) {
                    var12 = 1792;
                } else if (var12 == 1024) {
                    var12 = 1280;
                } else {
                    var12 = 1536;
                }
            } else if (field764.method4087(50)) {
                if (var12 == 0) {
                    var12 = 256;
                } else if (var12 == 1024) {
                    var12 = 768;
                } else {
                    var12 = 512;
                }
            }
            byte var13 = 0;
            if (field764.method4087(35)) {
                var13 = -1;
            } else if (field764.method4087(51)) {
                var13 = 1;
            }
            int var14 = 0;
            if (var12 >= 0 || var13 != 0) {
                int var15 = field764.method4087(81) ? field626 : field625;
                var14 = var15 * 16;
                field623 = var12;
                field624 = var13;
            }
            if (field622 < var14) {
                field622 += var14 / 8;
                if (field622 > var14) {
                    field622 = var14;
                }
            } else if (field622 > var14) {
                field622 = field622 * 9 / 10;
            }
            if (field622 > 0) {
                int var16 = field622 / 16;
                if (field623 >= 0) {
                    int var17 = field623 - Statics.field2100 & 0x7FF;
                    int var18 = class248.field2665[var17];
                    int var19 = class248.field2669[var17];
                    Statics.field179 += var16 * var18 / 65536;
                    Statics.field932 += var16 * var19 / 65536;
                }
                if (field624 != 0) {
                    Statics.field2831 += field624 * var16;
                    if (Statics.field2831 > 0) {
                        Statics.field2831 = 0;
                    }
                }
            } else {
                field623 = -1;
                field624 = -1;
            }
            if (field764.method4087(13)) {
                method5034();
            }
        }
        if (class36.field228 == 4 && Statics.field1379) {
            int var20 = class36.field221 - field619;
            field617 = var20 * 2;
            field619 = var20 == -1 || var20 == 1 ? class36.field221 : (field619 + class36.field221) / 2;
            int var21 = field827 - class36.field230;
            field666 = var21 * 2;
            field827 = var21 == -1 || var21 == 1 ? class36.field230 : (field827 + class36.field230) / 2;
        } else {
            if (field764.method4087(96)) {
                field666 += (-24 - field666) / 2;
            } else if (field764.method4087(97)) {
                field666 += (24 - field666) / 2;
            } else {
                field666 /= 2;
            }
            if (field764.method4087(98)) {
                field617 += (12 - field617) / 2;
            } else if (field764.method4087(99)) {
                field617 += (-12 - field617) / 2;
            } else {
                field617 /= 2;
            }
            field619 = class36.field221;
            field827 = class36.field230;
        }
        field615 = field666 / 2 + field615 & 0x7FF;
        field614 += field617 / 2;
        if (field614 < 128) {
            field614 = 128;
        }
        if (field614 > 383) {
            field614 = 383;
        }
    }

    @ObfuscatedName("iw.jt(Ldt;B)V")
    public static final void method4082(class102 arg0) {
        for (int var1 = 0; var1 < arg0.field1345; var1++) {
            int var2 = arg0.field1346[var1];
            class104 var3 = arg0.field1344[var2];
            if (var3 != null) {
                method1142(arg0, var3, var3.field1360.field2121);
            }
        }
    }

    @ObfuscatedName("ce.jq(Ldt;Ldh;IB)V")
    public static final void method1142(class102 arg0, class98 arg1, int arg2) {
        if (arg1.field1261 >= field821) {
            int var3 = Math.max(1, arg1.field1261 - field821);
            int var4 = arg1.field1257 * 128 + arg1.field1209 * 64;
            int var5 = arg1.field1259 * 128 + arg1.field1209 * 64;
            arg1.field1215 += (var4 - arg1.field1215) / var3;
            arg1.field1276 += (var5 - arg1.field1276) / var3;
            arg1.field1279 = 0;
            arg1.field1283 = arg1.field1263;
        } else if (arg1.field1262 >= field821) {
            boolean var6 = field821 == arg1.field1262 || arg1.field1224 == -1 || arg1.field1253 != 0;
            if (!var6) {
                class227 var7 = class227.method4744(arg1.field1224);
                if (var7 == null || var7.method4051()) {
                    var6 = true;
                } else {
                    var6 = arg1.field1252 + 1 > var7.field2421[arg1.field1251];
                }
            }
            if (var6) {
                int var8 = arg1.field1262 - arg1.field1261;
                int var9 = field821 - arg1.field1261;
                int var10 = arg1.field1257 * 128 + arg1.field1209 * 64;
                int var11 = arg1.field1259 * 128 + arg1.field1209 * 64;
                int var12 = arg1.field1258 * 128 + arg1.field1209 * 64;
                int var13 = arg1.field1260 * 128 + arg1.field1209 * 64;
                arg1.field1215 = ((var8 - var9) * var10 + var9 * var12) / var8;
                arg1.field1276 = ((var8 - var9) * var11 + var9 * var13) / var8;
            }
            arg1.field1279 = 0;
            arg1.field1283 = arg1.field1263;
            arg1.field1210 = arg1.field1283;
        } else {
            method3447(arg1);
        }
        if (arg1.field1215 < 128 || arg1.field1276 < 128 || arg1.field1215 >= 13184 || arg1.field1276 >= 13184) {
            arg1.field1224 = -1;
            arg1.field1261 = 0;
            arg1.field1262 = 0;
            arg1.method2322();
            arg1.field1215 = arg1.field1230[0] * 128 + arg1.field1209 * 64;
            arg1.field1276 = arg1.field1277[0] * 128 + arg1.field1209 * 64;
            arg1.method2317();
        }
        if (Statics.field84 == arg1 && (arg1.field1215 < 1536 || arg1.field1276 < 1536 || arg1.field1215 >= 11776 || arg1.field1276 >= 11776)) {
            arg1.field1224 = -1;
            arg1.field1261 = 0;
            arg1.field1262 = 0;
            arg1.method2322();
            arg1.field1215 = arg1.field1230[0] * 128 + arg1.field1209 * 64;
            arg1.field1276 = arg1.field1277[0] * 128 + arg1.field1209 * 64;
            arg1.method2317();
        }
        Statics.method5983(arg0, arg1);
        arg1.field1208 = false;
        if (arg1.field1246 != -1) {
            class227 var14 = class227.method4744(arg1.field1246);
            if (var14 == null) {
                arg1.field1246 = -1;
            } else if (!var14.method4051() && var14.field2424 != null) {
                arg1.field1248++;
                if (arg1.field1272 < var14.field2424.length && arg1.field1248 > var14.field2421[arg1.field1272]) {
                    arg1.field1248 = 1;
                    arg1.field1272++;
                    method2178(var14, arg1.field1272, arg1.field1215, arg1.field1276, arg1);
                }
                if (arg1.field1272 >= var14.field2424.length) {
                    if (var14.field2425 > 0) {
                        arg1.field1272 -= var14.field2425;
                        if (var14.field2431) {
                            arg1.field1249++;
                        }
                        if (arg1.field1272 < 0 || arg1.field1272 >= var14.field2424.length || var14.field2431 && arg1.field1249 >= var14.field2427) {
                            arg1.field1248 = 0;
                            arg1.field1272 = 0;
                            arg1.field1249 = 0;
                        }
                    } else {
                        arg1.field1248 = 0;
                        arg1.field1272 = 0;
                    }
                    method2178(var14, arg1.field1272, arg1.field1215, arg1.field1276, arg1);
                }
            } else if (var14.method4051()) {
                arg1.field1272++;
                int var15 = var14.method4018();
                if (arg1.field1272 < var15) {
                    method444(var14, arg1.field1272, arg1.field1215, arg1.field1276, arg1);
                } else {
                    if (var14.field2425 > 0) {
                        arg1.field1272 -= var14.field2425;
                        if (var14.field2431) {
                            arg1.field1249++;
                        }
                        if (arg1.field1272 < 0 || arg1.field1272 >= var15 || var14.field2431 && arg1.field1249 >= var14.field2427) {
                            arg1.field1272 = 0;
                            arg1.field1248 = 0;
                            arg1.field1249 = 0;
                        }
                    } else {
                        arg1.field1248 = 0;
                        arg1.field1272 = 0;
                    }
                    method444(var14, arg1.field1272, arg1.field1215, arg1.field1276, arg1);
                }
            } else {
                arg1.field1246 = -1;
            }
        }
        class518 var16 = new class518(arg1.method2321());
        for (class477 var17 = (class477) var16.method8498(); var17 != null; var17 = (class477) var16.next()) {
            if (var17.field4954 != -1 && field821 >= var17.field4956) {
                int var18 = class215.method3870(var17.field4954).field2196;
                if (var18 == -1) {
                    var17.method8189();
                    arg1.field1256--;
                } else {
                    var17.field4955 = Math.max(var17.field4955, 0);
                    class227 var19 = class227.method4744(var18);
                    if (var19.field2424 != null && !var19.method4051()) {
                        var17.field4953++;
                        if (var17.field4955 < var19.field2424.length && var17.field4953 > var19.field2421[var17.field4955]) {
                            var17.field4953 = 1;
                            var17.field4955++;
                            method2178(var19, var17.field4955, arg1.field1215, arg1.field1276, arg1);
                        }
                        if (var17.field4955 >= var19.field2424.length) {
                            var17.method8189();
                            arg1.field1256--;
                        }
                    } else if (var19.method4051()) {
                        var17.field4955++;
                        int var20 = var19.method4018();
                        if (var17.field4955 < var20) {
                            method444(var19, var17.field4955, arg1.field1215, arg1.field1276, arg1);
                        } else {
                            var17.method8189();
                            arg1.field1256--;
                        }
                    } else {
                        var17.method8189();
                        arg1.field1256--;
                    }
                }
            }
        }
        if (arg1.field1224 != -1 && arg1.field1253 <= 1) {
            class227 var21 = class227.method4744(arg1.field1224);
            if (var21.field2432 == 1 && arg1.field1227 > 0 && arg1.field1261 <= field821 && arg1.field1262 < field821) {
                arg1.field1253 = 1;
                return;
            }
        }
        if (arg1.field1224 != -1 && arg1.field1253 == 0) {
            class227 var22 = class227.method4744(arg1.field1224);
            if (var22 == null) {
                arg1.field1224 = -1;
            } else if (!var22.method4051() && var22.field2424 != null) {
                arg1.field1252++;
                if (arg1.field1251 < var22.field2424.length && arg1.field1252 > var22.field2421[arg1.field1251]) {
                    arg1.field1252 = 1;
                    arg1.field1251++;
                    method2178(var22, arg1.field1251, arg1.field1215, arg1.field1276, arg1);
                }
                if (arg1.field1251 >= var22.field2424.length) {
                    arg1.field1251 -= var22.field2425;
                    arg1.field1240++;
                    if (arg1.field1240 >= var22.field2427) {
                        arg1.field1224 = -1;
                    } else if (arg1.field1251 >= 0 && arg1.field1251 < var22.field2424.length) {
                        method2178(var22, arg1.field1251, arg1.field1215, arg1.field1276, arg1);
                    } else {
                        arg1.field1224 = -1;
                    }
                }
                arg1.field1208 = var22.field2426;
            } else if (var22.method4051()) {
                arg1.field1251++;
                int var23 = var22.method4018();
                if (arg1.field1251 < var23) {
                    method444(var22, arg1.field1251, arg1.field1215, arg1.field1276, arg1);
                } else {
                    arg1.field1251 -= var22.field2425;
                    arg1.field1240++;
                    if (arg1.field1240 >= var22.field2427) {
                        arg1.field1224 = -1;
                    } else if (arg1.field1251 >= 0 && arg1.field1251 < var23) {
                        method444(var22, arg1.field1251, arg1.field1215, arg1.field1276, arg1);
                    } else {
                        arg1.field1224 = -1;
                    }
                }
            } else {
                arg1.field1224 = -1;
            }
        }
        if (arg1.field1253 > 0) {
            arg1.field1253--;
        }
    }

    @ObfuscatedName("hg.jh(Ldh;I)V")
    public static final void method3447(class98 arg0) {
        arg0.field1246 = arg0.field1211;
        if (arg0.field1275 == 0) {
            arg0.field1279 = 0;
            return;
        }
        if (arg0.field1224 != -1 && arg0.field1253 == 0) {
            class227 var1 = class227.method4744(arg0.field1224);
            if (arg0.field1227 > 0 && var1.field2432 == 0) {
                arg0.field1279++;
                return;
            }
            if (arg0.field1227 <= 0 && var1.field2423 == 0) {
                arg0.field1279++;
                return;
            }
        }
        int var2 = arg0.field1215;
        int var3 = arg0.field1276;
        int var4 = arg0.field1230[arg0.field1275 - 1] * 128 + arg0.field1209 * 64;
        int var5 = arg0.field1277[arg0.field1275 - 1] * 128 + arg0.field1209 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1283 = 1280;
            } else if (var3 > var5) {
                arg0.field1283 = 1792;
            } else {
                arg0.field1283 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1283 = 768;
            } else if (var3 > var5) {
                arg0.field1283 = 256;
            } else {
                arg0.field1283 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1283 = 1024;
        } else if (var3 > var5) {
            arg0.field1283 = 0;
        }
        class238 var6 = arg0.field1278[arg0.field1275 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1215 = var4;
            arg0.field1276 = var5;
            arg0.field1275--;
            if (arg0.field1227 > 0) {
                arg0.field1227--;
            }
            return;
        }
        int var7 = arg0.field1283 - arg0.field1210 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1223;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1214;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1217;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1206;
        }
        if (var8 == -1) {
            var8 = arg0.field1214;
        }
        arg0.field1246 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class104) {
            var10 = ((class104) arg0).field1360.field2156;
        }
        if (var10) {
            if (arg0.field1283 != arg0.field1210 && arg0.field1220 == -1 && arg0.field1239 != 0) {
                var9 = 2;
            }
            if (arg0.field1275 > 2) {
                var9 = 6;
            }
            if (arg0.field1275 > 3) {
                var9 = 8;
            }
            if (arg0.field1279 > 0 && arg0.field1275 > 1) {
                var9 = 8;
                arg0.field1279--;
            }
        } else {
            if (arg0.field1275 > 1) {
                var9 = 6;
            }
            if (arg0.field1275 > 2) {
                var9 = 8;
            }
            if (arg0.field1279 > 0 && arg0.field1275 > 1) {
                var9 = 8;
                arg0.field1279--;
            }
        }
        if (class238.field2530 == var6) {
            var9 <<= 0x1;
        } else if (class238.field2525 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8) {
            if (arg0.field1246 == arg0.field1214 && arg0.field1218 != -1) {
                arg0.field1246 = arg0.field1218;
            } else if (arg0.field1246 == arg0.field1223 && arg0.field1216 != -1) {
                arg0.field1246 = arg0.field1216;
            } else if (arg0.field1246 == arg0.field1206 && arg0.field1226 != -1) {
                arg0.field1246 = arg0.field1226;
            } else if (arg0.field1246 == arg0.field1217 && arg0.field1221 != -1) {
                arg0.field1246 = arg0.field1221;
            }
        } else if (var9 <= 2) {
            if (arg0.field1246 == arg0.field1214 && arg0.field1274 != -1) {
                arg0.field1246 = arg0.field1274;
            } else if (arg0.field1246 == arg0.field1223 && arg0.field1207 != -1) {
                arg0.field1246 = arg0.field1207;
            } else if (arg0.field1246 == arg0.field1206 && arg0.field1282 != -1) {
                arg0.field1246 = arg0.field1282;
            } else if (arg0.field1246 == arg0.field1217 && arg0.field1229 != -1) {
                arg0.field1246 = arg0.field1229;
            }
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1215 += var9;
                if (arg0.field1215 > var4) {
                    arg0.field1215 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1215 -= var9;
                if (arg0.field1215 < var4) {
                    arg0.field1215 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1276 += var9;
                if (arg0.field1276 > var5) {
                    arg0.field1276 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1276 -= var9;
                if (arg0.field1276 < var5) {
                    arg0.field1276 = var5;
                }
            }
        }
        if (arg0.field1215 == var4 && arg0.field1276 == var5) {
            arg0.field1275--;
            if (arg0.field1227 > 0) {
                arg0.field1227--;
            }
        }
    }

    @ObfuscatedName("gs.jm(Lde;III)V")
    public static void method3179(class94 arg0, int arg1, int arg2) {
        if (arg0.field1224 == arg1 && arg1 != -1) {
            int var3 = class227.method4744(arg1).field2434;
            if (var3 == 1) {
                arg0.field1251 = 0;
                arg0.field1252 = 0;
                arg0.field1253 = arg2;
                arg0.field1240 = 0;
            }
            if (var3 == 2) {
                arg0.field1240 = 0;
            }
        } else if (arg1 == -1 || arg0.field1224 == -1 || class227.method4744(arg1).field2410 >= class227.method4744(arg0.field1224).field2410) {
            arg0.field1224 = arg1;
            arg0.field1251 = 0;
            arg0.field1252 = 0;
            arg0.field1253 = arg2;
            arg0.field1240 = 0;
            arg0.field1227 = arg0.field1275;
        }
    }

    @ObfuscatedName("uc.jw(I)I")
    public static int method8667() {
        return field755 ? 2 : 1;
    }

    @ObfuscatedName("fs.jd(IB)V")
    public static void method3064(int arg0) {
        field579 = 0L;
        if (arg0 >= 2) {
            field755 = true;
        } else {
            field755 = false;
        }
        if (method8667() == 1) {
            Statics.field1971.method473(765, 503);
        } else {
            Statics.field1971.method473(7680, 2160);
        }
        if (field598 < 25 || field591 == null || field591.field1467 == null) {
            return;
        }
        class321 var1 = class321.method3542(class319.field3369, field591.field1467);
        var1.field3393.method8779(method8667());
        var1.field3393.method8780(Statics.field190);
        var1.field3393.method8780(Statics.field5283);
        field591.method2745(var1);
    }

    @ObfuscatedName("client.as(I)V")
    public final void method546() {
        field579 = class326.method2895() + 500L;
        this.method1175();
        if (field783 != -1) {
            this.method1709(true);
        }
    }

    @ObfuscatedName("client.jz(I)V")
    public void method1175() {
        int var1 = Statics.field190;
        int var2 = Statics.field5283;
        if (this.field191 < var1) {
            int var3 = this.field191;
        }
        if (this.field196 < var2) {
            int var4 = this.field196;
        }
        if (Statics.field4879 == null) {
            return;
        }
        try {
            client var5 = Statics.field1971;
            Object[] var6 = new Object[] { method8667() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.js(I)V")
    public final void method1323() {
        if (field783 != -1) {
            method2998(field783);
        }
        for (int var1 = 0; var1 < field744; var1++) {
            if (field657[var1]) {
                field747[var1] = true;
            }
            field758[var1] = field657[var1];
            field657[var1] = false;
        }
        field601 = field821;
        field704 = -1;
        field686 = -1;
        if (field783 != -1) {
            field744 = 0;
            method6476(field783, 0, 0, Statics.field190, Statics.field5283, 0, 0, -1);
        }
        class556.method9103();
        if (field650) {
            if (field778 == 1) {
                Statics.field2535[field648 / 100].method9319(field741 - 8, field647 - 8);
            }
            if (field778 == 2) {
                Statics.field2535[field648 / 100 + 4].method9319(field741 - 8, field647 - 8);
            }
        }
        if (field671) {
            int var8 = Statics.field1751;
            int var9 = Statics.field4930;
            int var10 = Statics.field3051;
            int var11 = Statics.field4453;
            int var12 = 6116423;
            class556.method9112(var8, var9, var10, var11, var12);
            class556.method9112(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class556.method9116(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field3119.method7488(class378.field4258, var8 + 3, var9 + 14, var12, -1);
            int var13 = class36.field230;
            int var14 = class36.field221;
            for (int var15 = 0; var15 < field672; var15++) {
                int var16 = (field672 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                class431 var18 = Statics.field3119;
                String var19;
                if (var15 < 0) {
                    var19 = "";
                } else if (field680[var15].length() > 0) {
                    var19 = field679[var15] + class378.field4265 + field680[var15];
                } else {
                    var19 = field679[var15];
                }
                var18.method7488(var19, var8 + 3, var16, var17, 0);
            }
            Statics.method306(Statics.field1751, Statics.field4930, Statics.field3051, Statics.field4453);
        } else if (field704 != -1) {
            int var2 = field704;
            int var3 = field686;
            if ((field672 >= 2 || field745 != 0 || field691) && field684) {
                int var4 = field672 - 1;
                String var6;
                if (field745 == 1 && field672 < 2) {
                    var6 = class378.field4255 + class378.field4265 + field546 + " " + class105.field1372;
                } else if (field691 && field672 < 2) {
                    var6 = field694 + class378.field4265 + field621 + " " + class105.field1372;
                } else {
                    String var7;
                    if (var4 < 0) {
                        var7 = "";
                    } else if (field680[var4].length() > 0) {
                        var7 = field679[var4] + class378.field4265 + field680[var4];
                    } else {
                        var7 = field679[var4];
                    }
                    var6 = var7;
                }
                if (field672 > 2) {
                    var6 = var6 + class105.method7700(16777215) + " " + '/' + " " + (field672 - 2) + class378.field4325;
                }
                Statics.field3119.method7478(var6, var2 + 4, var3 + 15, 16777215, 0, field821 / 1000);
            }
        }
        if (field753 == 3) {
            for (int var20 = 0; var20 < field744; var20++) {
                if (field758[var20]) {
                    class556.method9111(field765[var20], field750[var20], field751[var20], field800[var20], 16711935, 128);
                } else if (field747[var20]) {
                    class556.method9111(field765[var20], field750[var20], field751[var20], field800[var20], 16711680, 128);
                }
            }
        }
        int var21 = Statics.field3967.field1349;
        int var22 = Statics.field84.field1215;
        int var23 = Statics.field84.field1276;
        int var24 = field607;
        for (class72 var25 = (class72) class72.field876.method6834(); var25 != null; var25 = (class72) class72.field876.method6842()) {
            if (var25.field866 != -1 || var25.field864 != null) {
                int var26 = 0;
                if (var22 > var25.field862) {
                    var26 += var22 - var25.field862;
                } else if (var22 < var25.field873) {
                    var26 += var25.field873 - var22;
                }
                if (var23 > var25.field863) {
                    var26 += var23 - var25.field863;
                } else if (var23 < var25.field861) {
                    var26 += var25.field861 - var23;
                }
                int var27 = Math.max(var26 - 64, 0);
                if (var27 >= var25.field860 || Statics.field4879.method2437() == 0 || var25.field874 != var21) {
                    if (var25.field858 != null) {
                        Statics.field3737.method711(var25.field858);
                        var25.field858 = null;
                    }
                    if (var25.field872 != null) {
                        Statics.field3737.method711(var25.field872);
                        var25.field872 = null;
                    }
                } else {
                    float var28 = var25.field859 < var25.field860 ? Math.min(Math.max((float) (var25.field860 - var27) / (float) (var25.field860 - var25.field859), 0.0F), 1.0F) : 1.0F;
                    int var29 = (int) (var28 * (float) Statics.field4879.method2437());
                    class40 var10000;
                    if (var25.field858 != null) {
                        var25.field858.method867(var29);
                    } else if (var25.field866 >= 0) {
                        var10000 = (class40) null;
                        class40 var30 = class40.method750(Statics.field1638, var25.field866, 0);
                        if (var30 != null) {
                            class41 var31 = var30.method738().method754(Statics.field1354);
                            class49 var32 = class49.method863(var31, 100, var29);
                            var32.method866(-1);
                            Statics.field3737.method699(var32);
                            var25.field858 = var32;
                        }
                    }
                    if (var25.field872 != null) {
                        var25.field872.method867(var29);
                        if (!var25.field872.method8187()) {
                            var25.field872 = null;
                        }
                    } else if (var25.field864 != null && (var25.field871 -= var24) <= 0) {
                        int var33 = (int) (Math.random() * (double) var25.field864.length);
                        var10000 = (class40) null;
                        class40 var34 = class40.method750(Statics.field1638, var25.field864[var33], 0);
                        if (var34 != null) {
                            class41 var35 = var34.method738().method754(Statics.field1354);
                            class49 var36 = class49.method863(var35, 100, var29);
                            var36.method866(0);
                            Statics.field3737.method699(var36);
                            var25.field872 = var36;
                            var25.field871 = var25.field868 + (int) (Math.random() * (double) (var25.field869 - var25.field868));
                        }
                    }
                }
            }
        }
        field607 = 0;
    }

    @ObfuscatedName("rw.jg(Ljava/lang/String;ZS)V")
    public static final void method7795(String arg0, boolean arg1) {
        if (!field664) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3069.method7540(arg0, 250);
        int var6 = Statics.field3069.method7463(arg0, 250) * 13;
        class556.method9112(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class556.method9116(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3069.method7483(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method8115(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field3196.method451(0, 0);
            return;
        }
        int var7 = var3;
        int var8 = var4;
        int var9 = var5;
        int var10 = var6;
        for (int var11 = 0; var11 < field744; var11++) {
            if (field765[var11] + field751[var11] > var7 && field765[var11] < var7 + var9 && field800[var11] + field750[var11] > var8 && field750[var11] < var8 + var10) {
                field747[var11] = true;
            }
        }
    }

    @ObfuscatedName("jc.je(IIIII)V")
    public static final void method4743(int arg0, int arg1, int arg2, int arg3) {
        field643++;
        Statics.field3967.field1332.field2708 = field821;
        if (Statics.field84.field1215 >> 7 == field777 && Statics.field84.field1276 >> 7 == field637) {
            field777 = 0;
        }
        method2024(Statics.field3967);
        method3716(Statics.field3967);
        method52(Statics.field3967, true);
        class102 var4 = Statics.field3967;
        int var5 = var4.field1337.field1416;
        int[] var6 = var4.field1337.field1417;
        for (int var7 = 0; var7 < var5; var7++) {
            if (field665 != var6[var7] && field689 != var6[var7]) {
                method7274(var4, var6[var7], true);
            }
        }
        method52(Statics.field3967, false);
        class102 var8 = Statics.field3967;
        for (int var9 = 0; var9 < var8.field1335; var9++) {
            class476 var10 = var8.field1348[var8.field1351[var9]];
            if (var10 != null) {
                var10.field4947 = method826(var8, var10.field4944, var10.field4946, var8.field1349);
                var10.field4948.field1332.field2708 = field821;
                var10.method8002();
                var8.field1332.method4705(var8.field1349, var10.field4944, var10.field4946, var10.field4947, 60, var10.field4948.field1332, var10.field4940, 0L, false);
                method2024(var10.field4948);
                method3716(var10.field4948);
                method52(var10.field4948, true);
                class102 var11 = var10.field4948;
                int var12 = var11.field1337.field1416;
                int[] var13 = var11.field1337.field1417;
                for (int var14 = 0; var14 < var12; var14++) {
                    if (field665 != var13[var14] && field689 != var13[var14]) {
                        method7274(var11, var13[var14], true);
                    }
                }
                method52(var10.field4948, false);
                method3217(var10.field4948);
                method4202(var10.field4948);
            }
        }
        method3217(Statics.field3967);
        method4202(Statics.field3967);
        method5779(arg0, arg1, arg2, arg3, true);
        int var15 = field809;
        int var16 = field807;
        int var17 = field811;
        int var18 = field812;
        class556.method9104(var15, var16, var15 + var17, var16 + var18);
        class248.method4398();
        class556.method9125();
        int var19 = field614;
        if (field616 / 256 > var19) {
            var19 = field616 / 256;
        }
        if (field599[4] && field715[4] + 128 > var19) {
            var19 = field715[4] + 128;
        }
        int var20 = field615 & 0x7FF;
        int var21 = Statics.field179;
        int var22 = Statics.field2831;
        int var23 = Statics.field932;
        int var24 = var19 * 3 + 600;
        int var26 = var18 - 334;
        if (var26 < 0) {
            var26 = 0;
        } else if (var26 > 100) {
            var26 = 100;
        }
        int var27 = (field551 - field803) * var26 / 100 + field803;
        int var28 = var24 * var27 / 256;
        int var30 = 2048 - var19 & 0x7FF;
        int var31 = 2048 - var20 & 0x7FF;
        int var32 = 0;
        int var33 = 0;
        int var34 = var28;
        if (var30 != 0) {
            int var35 = class248.field2665[var30];
            int var36 = class248.field2669[var30];
            int var37 = var33 * var36 - var28 * var35 >> 16;
            var34 = var33 * var35 + var28 * var36 >> 16;
            var33 = var37;
        }
        if (var31 != 0) {
            int var38 = class248.field2665[var31];
            int var39 = class248.field2669[var31];
            int var40 = var32 * var39 + var34 * var38 >> 16;
            var34 = var34 * var39 - var32 * var38 >> 16;
            var32 = var40;
        }
        if (field539) {
            Statics.field3739 = var21 - var32;
            Statics.field87 = var22 - var33;
            Statics.field167 = var23 - var34;
            Statics.field333 = var19;
            Statics.field2642 = var20;
        } else {
            Statics.field3770 = var21 - var32;
            Statics.field1848 = var22 - var33;
            Statics.field1498 = var23 - var34;
            Statics.field1255 = var19;
            Statics.field2100 = var20;
        }
        if (field620 == 1 && field669 >= 2 && field821 % 50 == 0 && (Statics.field179 >> 7 != Statics.field84.field1215 >> 7 || Statics.field932 >> 7 != Statics.field84.field1276 >> 7)) {
            int var41 = Statics.field84.field1151;
            int var42 = (Statics.field179 >> 7) + Statics.field3967.field1338;
            int var43 = (Statics.field932 >> 7) + Statics.field3967.field1334;
            class321 var44 = class321.method3542(class319.field3337, field591.field1467);
            var44.field3393.method8887(var41);
            var44.field3393.method8834(var43);
            var44.field3393.method8850(field806);
            var44.field3393.method8780(var42);
            field591.method2745(var44);
        }
        int var59;
        if (field539) {
            var59 = method7594();
        } else {
            int var45;
            if (Statics.field4879.method2481()) {
                var45 = Statics.field3967.field1349;
            } else {
                label535: {
                    int var46 = 3;
                    int var47 = Statics.field900.method1154() >> 7;
                    int var48 = Statics.field900.method1146() >> 7;
                    if (Statics.field1255 < 310) {
                        label525: {
                            int var49;
                            int var50;
                            if (field620 == 1) {
                                var49 = Statics.field179 >> 7;
                                var50 = Statics.field932 >> 7;
                            } else {
                                var49 = var47;
                                var50 = var48;
                            }
                            int var51 = Statics.field3770 >> 7;
                            int var52 = Statics.field1498 >> 7;
                            if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                                    if ((Statics.field3967.field1341[Statics.field3967.field1349][var51][var52] & 0x4) != 0) {
                                        var46 = Statics.field3967.field1349;
                                    }
                                    int var53;
                                    if (var49 > var51) {
                                        var53 = var49 - var51;
                                    } else {
                                        var53 = var51 - var49;
                                    }
                                    int var54;
                                    if (var50 > var52) {
                                        var54 = var50 - var52;
                                    } else {
                                        var54 = var52 - var50;
                                    }
                                    if (var53 > var54) {
                                        int var55 = var54 * 65536 / var53;
                                        int var56 = 32768;
                                        while (true) {
                                            if (var49 == var51) {
                                                break label525;
                                            }
                                            if (var51 < var49) {
                                                var51++;
                                            } else if (var51 > var49) {
                                                var51--;
                                            }
                                            if ((Statics.field3967.field1341[Statics.field3967.field1349][var51][var52] & 0x4) != 0) {
                                                var46 = Statics.field3967.field1349;
                                            }
                                            var56 += var55;
                                            if (var56 >= 65536) {
                                                var56 -= 65536;
                                                if (var52 < var50) {
                                                    var52++;
                                                } else if (var52 > var50) {
                                                    var52--;
                                                }
                                                if ((Statics.field3967.field1341[Statics.field3967.field1349][var51][var52] & 0x4) != 0) {
                                                    var46 = Statics.field3967.field1349;
                                                }
                                            }
                                        }
                                    } else {
                                        if (var54 > 0) {
                                            int var57 = var53 * 65536 / var54;
                                            int var58 = 32768;
                                            while (var50 != var52) {
                                                if (var52 < var50) {
                                                    var52++;
                                                } else if (var52 > var50) {
                                                    var52--;
                                                }
                                                if ((Statics.field3967.field1341[Statics.field3967.field1349][var51][var52] & 0x4) != 0) {
                                                    var46 = Statics.field3967.field1349;
                                                }
                                                var58 += var57;
                                                if (var58 >= 65536) {
                                                    var58 -= 65536;
                                                    if (var51 < var49) {
                                                        var51++;
                                                    } else if (var51 > var49) {
                                                        var51--;
                                                    }
                                                    if ((Statics.field3967.field1341[Statics.field3967.field1349][var51][var52] & 0x4) != 0) {
                                                        var46 = Statics.field3967.field1349;
                                                    }
                                                }
                                            }
                                        }
                                        break label525;
                                    }
                                }
                                var45 = Statics.field3967.field1349;
                                break label535;
                            }
                            var45 = Statics.field3967.field1349;
                            break label535;
                        }
                    }
                    if (var47 >= 0 && var48 >= 0 && var47 < 13312 && var48 < 13312) {
                        if ((Statics.field3967.field1341[Statics.field3967.field1349][var47][var48] & 0x4) != 0) {
                            var46 = Statics.field3967.field1349;
                        }
                        var45 = var46;
                    } else {
                        var45 = Statics.field3967.field1349;
                    }
                }
            }
            var59 = var45;
        }
        int var60 = Statics.field3770;
        int var61 = Statics.field1848;
        int var62 = Statics.field1498;
        int var63 = Statics.field1255;
        int var64 = Statics.field2100;
        for (int var65 = 0; var65 < 5; var65++) {
            if (field599[var65]) {
                int var66 = (int) (Math.random() * (double) (field797[var65] * 2 + 1) - (double) field797[var65] + Math.sin((double) field799[var65] / 100.0D * (double) field710[var65]) * (double) field715[var65]);
                if (var65 == 0) {
                    Statics.field3770 += var66;
                }
                if (var65 == 1) {
                    Statics.field1848 += var66;
                }
                if (var65 == 2) {
                    Statics.field1498 += var66;
                }
                if (var65 == 3) {
                    Statics.field2100 = Statics.field2100 + var66 & 0x7FF;
                }
                if (var65 == 4) {
                    Statics.field1255 += var66;
                    if (Statics.field1255 < 128) {
                        Statics.field1255 = 128;
                    }
                    if (Statics.field1255 > 383) {
                        Statics.field1255 = 383;
                    }
                }
            }
        }
        int var67 = class36.field230;
        int var68 = class36.field221;
        if (class36.field238 != 0) {
            var67 = class36.field239;
            var68 = class36.field240;
        }
        if (var67 >= var15 && var67 < var15 + var17 && var68 >= var16 && var68 < var16 + var18) {
            class265.method4787(var67 - var15, var68 - var16);
        } else {
            class265.method3044();
        }
        method3723();
        class556.method9112(var15, var16, var17, var18, 0);
        method3723();
        int var69 = class248.method4339();
        class248.method4348(Statics.field1971.field204);
        class248.field2670.field2977 = field813;
        Statics.field3967.field1332.method4560(Statics.field3770, Statics.field1848, Statics.field1498, Statics.field1255, Statics.field2100, var59);
        class248.method4348(false);
        if (field561) {
            class556.method9126();
        }
        class248.field2670.field2977 = var69;
        method3723();
        Statics.field3967.field1332.method4515();
        for (int var70 = 0; var70 < Statics.field3967.field1335; var70++) {
            class476 var71 = Statics.field3967.field1348[Statics.field3967.field1351[var70]];
            if (var71 != null) {
                var71.field4948.field1332.method4515();
            }
        }
        class102 var72 = Statics.field3967;
        field632 = 0;
        boolean var73 = false;
        int var74 = -1;
        int var75 = -1;
        int var76 = var72.field1337.field1416;
        int[] var77 = var72.field1337.field1417;
        for (int var78 = 0; var78 < var72.field1345 + var76; var78++) {
            class98 var79;
            if (var78 < var76) {
                var79 = var72.field1342[var77[var78]];
                if (field665 == var77[var78]) {
                    var73 = true;
                    var74 = var78;
                    continue;
                }
                if (Statics.field84 == var79) {
                    var75 = var78;
                    continue;
                }
            } else {
                var79 = var72.field1344[var72.field1346[var78 - var76]];
            }
            method856(var72, var79, var78, var15, var16, var17, var18);
        }
        if (field723 && var75 != -1) {
            method856(var72, Statics.field84, var75, var15, var16, var17, var18);
        }
        if (var73) {
            method856(var72, var72.field1342[field665], var74, var15, var16, var17, var18);
        }
        for (int var80 = 0; var80 < field632; var80++) {
            int var81 = field634[var80];
            int var82 = field635[var80];
            int var83 = field563[var80];
            int var84 = field636[var80];
            boolean var85 = true;
            while (var85) {
                var85 = false;
                for (int var86 = 0; var86 < var80; var86++) {
                    if (var82 + 2 > field635[var86] - field636[var86] && var82 - var84 < field635[var86] + 2 && var81 - var83 < field634[var86] + field563[var86] && var81 + var83 > field634[var86] - field563[var86] && field635[var86] - field636[var86] < var82) {
                        var82 = field635[var86] - field636[var86];
                        var85 = true;
                    }
                }
            }
            field644 = field634[var80];
            field529 = field635[var80] = var82;
            String var87 = field695[var80];
            if (field531 == 0) {
                int var88 = 16776960;
                if (field649[var80] < 6) {
                    var88 = field826[field649[var80]];
                }
                if (field649[var80] == 6) {
                    var88 = field643 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field649[var80] == 7) {
                    var88 = field643 % 20 < 10 ? 255 : 65535;
                }
                if (field649[var80] == 8) {
                    var88 = field643 % 20 < 10 ? 45056 : 8454016;
                }
                if (field649[var80] == 9) {
                    int var89 = 150 - field641[var80];
                    if (var89 < 50) {
                        var88 = var89 * 1280 + 16711680;
                    } else if (var89 < 100) {
                        var88 = 16776960 - (var89 - 50) * 327680;
                    } else if (var89 < 150) {
                        var88 = (var89 - 100) * 5 + 65280;
                    }
                }
                if (field649[var80] == 10) {
                    int var90 = 150 - field641[var80];
                    if (var90 < 50) {
                        var88 = var90 * 5 + 16711680;
                    } else if (var90 < 100) {
                        var88 = 16711935 - (var90 - 50) * 327680;
                    } else if (var90 < 150) {
                        var88 = (var90 - 100) * 327680 + 255 - (var90 - 100) * 5;
                    }
                }
                if (field649[var80] == 11) {
                    int var91 = 150 - field641[var80];
                    if (var91 < 50) {
                        var88 = 16777215 - var91 * 327685;
                    } else if (var91 < 100) {
                        var88 = (var91 - 50) * 327685 + 65280;
                    } else if (var91 < 150) {
                        var88 = 16777215 - (var91 - 100) * 327680;
                    }
                }
                if (field649[var80] == 12 && field788[var80] == null) {
                    int var92 = var87.length();
                    field788[var80] = new int[var92];
                    for (int var93 = 0; var93 < var92; var93++) {
                        int var94 = (int) ((float) var93 / (float) var92 * 64.0F);
                        int var95 = var94 << 10 | 0x380 | 0x40;
                        field788[var80][var93] = Statics.field5036[var95];
                    }
                }
                if (field743[var80] == 0) {
                    Statics.field3119.method7475(var87, field644 + var15, field529 + var16, var88, 0, field788[var80]);
                }
                if (field743[var80] == 1) {
                    Statics.field3119.method7528(var87, field644 + var15, field529 + var16, var88, 0, field643, field788[var80]);
                }
                if (field743[var80] == 2) {
                    Statics.field3119.method7510(var87, field644 + var15, field529 + var16, var88, 0, field643, field788[var80]);
                }
                if (field743[var80] == 3) {
                    Statics.field3119.method7474(var87, field644 + var15, field529 + var16, var88, 0, field643, 150 - field641[var80], field788[var80]);
                }
                if (field743[var80] == 4) {
                    int var96 = (150 - field641[var80]) * (Statics.field3119.method7547(var87) + 100) / 150;
                    class556.method9113(field644 + var15 - 50, var16, field644 + var15 + 50, var16 + var18);
                    Statics.field3119.method7476(var87, field644 + var15 + 50 - var96, field529 + var16, var88, 0, field788[var80]);
                    class556.method9104(var15, var16, var15 + var17, var16 + var18);
                }
                if (field743[var80] == 5) {
                    int var97 = 150 - field641[var80];
                    int var98 = 0;
                    if (var97 < 25) {
                        var98 = var97 - 25;
                    } else if (var97 > 125) {
                        var98 = var97 - 125;
                    }
                    class556.method9113(var15, field529 + var16 - Statics.field3119.field4760 - 1, var15 + var17, field529 + var16 + 5);
                    Statics.field3119.method7475(var87, field644 + var15, field529 + var16 + var98, var88, 0, field788[var80]);
                    class556.method9104(var15, var16, var15 + var17, var16 + var18);
                }
            } else {
                Statics.field3119.method7468(var87, field644 + var15, field529 + var16, 16776960, 0);
            }
        }
        method5578(Statics.field3967, var15, var16);
        ((class260) class248.field2670.field2978).method4768(field607);
        method6477();
        Statics.field3770 = var60;
        Statics.field1848 = var61;
        Statics.field1498 = var62;
        Statics.field1255 = var63;
        Statics.field2100 = var64;
        if (field542 && Statics.field33.method6665(true, false) == 0) {
            field542 = false;
        }
        if (field542) {
            class556.method9112(var15, var16, var17, var18, 0);
            method7795(class378.field4100, false);
        }
    }

    @ObfuscatedName("mw.ja(IIIIZI)V")
    public static final void method5779(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
            var6 = field802;
        } else {
            var6 = (field802 - field801) * var5 / 100 + field801;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field696) {
            short var8 = field696;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field761) {
                var6 = field761;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class556.method9103();
                    class556.method9112(arg0, arg1, var10, arg3, -16777216);
                    class556.method9112(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
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
                    class556.method9103();
                    class556.method9112(arg0, arg1, arg2, var13, -16777216);
                    class556.method9112(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field813 = arg3 * var6 / 334;
        if (field811 != arg2 || field812 != arg3) {
            method1080(arg2, arg3);
        }
        field809 = arg0;
        field807 = arg1;
        field811 = arg2;
        field812 = arg3;
    }

    @ObfuscatedName("cv.jn(Ldt;I)V")
    public static void method2024(class102 arg0) {
        if (field723) {
            method7274(arg0, field689, false);
        }
    }

    @ObfuscatedName("ib.jy(Ldt;I)V")
    public static void method3716(class102 arg0) {
        if (field665 >= 0 && arg0.field1342[field665] != null) {
            method7274(arg0, field665, false);
        }
    }

    @ObfuscatedName("qg.jk(Ldt;IZI)V")
    public static void method7274(class102 arg0, int arg1, boolean arg2) {
        class94 var3 = arg0.field1342[arg1];
        if (var3 == null || !var3.method2272() || var3.field1143) {
            return;
        }
        var3.field1154 = false;
        if ((field642 && arg0.field1337.field1416 > 50 || arg0.field1337.field1416 > 200) && arg2 && var3.field1246 == var3.field1211) {
            var3.field1154 = true;
        }
        int var4 = var3.field1215 >> 7;
        int var5 = var3.field1276 >> 7;
        if (var4 < 0 || var4 >= 104 || var5 < 0 || var5 >= 104) {
            return;
        }
        long var6 = class265.method3598(0, 0, 0, false, var3.field1158, arg0.field1336);
        if (var3.field1159 != null && field821 >= var3.field1144 && field821 < var3.field1145) {
            var3.field1154 = false;
            var3.field1149 = method826(arg0, var3.field1215, var3.field1276, arg0.field1349);
            var3.field1265 = field821;
            arg0.field1332.method4513(arg0.field1349, var3.field1215, var3.field1276, var3.field1149, 60, var3, var3.field1210, var6, var3.field1150, var3.field1156, var3.field1152, var3.field1141);
            return;
        }
        if ((var3.field1215 & 0x7F) == 64 && (var3.field1276 & 0x7F) == 64) {
            if (field643 == arg0.field1339[var4][var5]) {
                return;
            }
            arg0.field1339[var4][var5] = field643;
        }
        var3.field1149 = method826(arg0, var3.field1215, var3.field1276, arg0.field1349);
        var3.field1265 = field821;
        arg0.field1332.method4705(arg0.field1349, var3.field1215, var3.field1276, var3.field1149, 60, var3, var3.field1210, var6, var3.field1208);
    }

    @ObfuscatedName("ab.jo(Ldt;ZB)V")
    public static final void method52(class102 arg0, boolean arg1) {
        for (int var2 = 0; var2 < arg0.field1345; var2++) {
            class104 var3 = arg0.field1344[arg0.field1346[var2]];
            if (var3 != null && var3.method2272() && var3.field1360.field2150 == arg1 && var3.field1360.method3666()) {
                int var4 = var3.field1215 >> 7;
                int var5 = var3.field1276 >> 7;
                if (var4 >= 0 && var4 < arg0.field1347 && var5 >= 0 && var5 < arg0.field1331) {
                    if (var3.field1209 == 1 && (var3.field1215 & 0x7F) == 64 && (var3.field1276 & 0x7F) == 64) {
                        if (field643 == arg0.field1339[var4][var5]) {
                            continue;
                        }
                        arg0.field1339[var4][var5] = field643;
                    }
                    long var6 = class265.method3598(0, 0, 1, !var3.field1360.field2155, arg0.field1346[var2], arg0.field1336);
                    var3.field1265 = field821;
                    arg0.field1332.method4705(arg0.field1349, var3.field1215, var3.field1276, method826(arg0, var3.field1215 + (var3.field1209 * 64 - 64), var3.field1276 + (var3.field1209 * 64 - 64), arg0.field1349), var3.field1209 * 64 - 64 + 60, var3, var3.field1210, var6, var3.field1208);
                }
            }
        }
    }

    @ObfuscatedName("gr.ju(Ldt;I)V")
    public static final void method3217(class102 arg0) {
        for (class79 var1 = (class79) arg0.field1352.method6834(); var1 != null; var1 = (class79) arg0.field1352.method6842()) {
            if (arg0.field1349 != var1.field1007 || field821 > var1.field989) {
                var1.method8189();
            } else if (field821 >= var1.field980) {
                if (!var1.field994 && var1.field1006 != 0) {
                    if (var1.field1006 > 0) {
                        class104 var2 = Statics.field4624.field1344[var1.field1006 - 1];
                        if (var2 != null && var2.field1215 >= 0 && var2.field1215 < 13312 && var2.field1276 >= 0 && var2.field1276 < 13312) {
                            var1.field981 = var2.field1215;
                            var1.field1004 = var2.field1276;
                            var1.method2097(var1.field985, var1.field986, var1.field982, field821);
                        }
                    } else {
                        int var3 = -var1.field1006 - 1;
                        class94 var4;
                        if (field689 == var3) {
                            var4 = Statics.field84;
                        } else {
                            var4 = Statics.field4624.field1342[var3];
                        }
                        if (var4 != null && var4.field1215 >= 0 && var4.field1215 < 13312 && var4.field1276 >= 0 && var4.field1276 < 13312) {
                            var1.field981 = var4.field1215;
                            var1.field1004 = var4.field1276;
                            var1.method2097(var1.field985, var1.field986, var1.field982, field821);
                        }
                    }
                }
                if (var1.field993 > 0) {
                    class104 var5 = arg0.field1344[var1.field993 - 1];
                    if (var5 != null && var5.field1215 >= 0 && var5.field1215 < 13312 && var5.field1276 >= 0 && var5.field1276 < 13312) {
                        var1.method2097(var5.field1215, var5.field1276, method826(arg0, var5.field1215, var5.field1276, var1.field1007) - var1.field1005, field821);
                    }
                }
                if (var1.field993 < 0) {
                    int var6 = -var1.field993 - 1;
                    class94 var7;
                    if (field689 == var6) {
                        var7 = Statics.field84;
                    } else {
                        var7 = arg0.field1342[var6];
                    }
                    if (var7 != null && var7.field1215 >= 0 && var7.field1215 < 13312 && var7.field1276 >= 0 && var7.field1276 < 13312) {
                        var1.method2097(var7.field1215, var7.field1276, method826(arg0, var7.field1215, var7.field1276, var1.field1007) - var1.field1005, field821);
                    }
                }
                var1.method2101(field607);
                arg0.field1332.method4705(arg0.field1349, (int) var1.field995, (int) var1.field996, (int) var1.field997, 60, var1, var1.field988, -1L, false);
            }
        }
    }

    @ObfuscatedName("jv.jc(Ldt;B)V")
    public static final void method4202(class102 arg0) {
        for (class74 var1 = (class74) arg0.field1353.method6834(); var1 != null; var1 = (class74) arg0.field1353.method6842()) {
            if (arg0.field1349 != var1.field905 || var1.field912) {
                var1.method8189();
            } else if (field821 >= var1.field904) {
                var1.method2006(field607);
                if (var1.field912) {
                    var1.method8189();
                } else {
                    arg0.field1332.method4705(var1.field905, var1.field906, var1.field910, var1.field908, 60, var1, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("qu.jl(B)I")
    public static final int method7594() {
        if (Statics.field4879.method2481()) {
            return Statics.field3967.field1349;
        } else {
            int var0 = method826(Statics.field3967, Statics.field3770, Statics.field1498, Statics.field3967.field1349);
            return var0 - Statics.field1848 >= 800 || (Statics.field3967.field1341[Statics.field3967.field1349][Statics.field3770 >> 7][Statics.field1498 >> 7] & 0x4) == 0 ? 3 : Statics.field3967.field1349;
        }
    }

    @ObfuscatedName("mn.jf(Ldt;III)V")
    public static final void method5578(class102 arg0, int arg1, int arg2) {
        if (field785 == 2) {
            method2025(arg0, (field770 - arg0.field1338 << 7) + field557, (field555 - arg0.field1334 << 7) + field535, field556 * 2);
            if (field644 > -1 && field821 % 20 < 10) {
                Statics.field4037[0].method9319(field644 + arg1 - 12, field529 + arg2 - 28);
            }
        }
    }

    @ObfuscatedName("bc.jj(B)Lpk;")
    public static class406 method857() {
        return field739;
    }

    @ObfuscatedName("ny.kl(I)V")
    public static void method5931() {
        for (class230 var0 = (class230) field742.method6834(); var0 != null; var0 = (class230) field742.method6842()) {
            var0.method8189();
        }
    }

    @ObfuscatedName("uy.ke(Liw;I)V")
    public static void method8664(class230 arg0) {
        if (arg0 == null || arg0.field2460 == null) {
            return;
        }
        if (arg0.field2460.field3930 >= 0) {
            class358 var1 = Statics.field75.method5906(arg0.field2460.field3965);
            if (var1 == null || var1.field3884 == null || var1.field3884.length == 0 || arg0.field2460.field3930 >= var1.field3884.length || var1.field3884[arg0.field2460.field3930] != arg0.field2460) {
                return;
            }
        }
        if (arg0.field2460.field3894 == 11 && arg0.field2459 == 0) {
            if (arg0.field2460.method6300(arg0.field2458, arg0.field2461, 0, 0)) {
                arg0.field2460.method6308().method3235().method3369(1, arg0.field2460.method6308().method3247());
                switch(arg0.field2460.method6304()) {
                    case 0:
                        class32.method6508(arg0.field2460.method6306(), true, false);
                        break;
                    case 1:
                        int var2 = method3177(arg0.field2460);
                        boolean var3 = (var2 >> 22 & 0x1) != 0;
                        if (var3) {
                            int[] var4 = arg0.field2460.method6307();
                            if (var4 != null) {
                                class321 var5 = class321.method3542(class319.field3343, field591.field1467);
                                var5.field3393.method8849(arg0.field2460.method6422());
                                var5.field3393.method8849(var4[1]);
                                var5.field3393.method8850(var4[2]);
                                var5.field3393.method8834(arg0.field2460.field3930);
                                var5.field3393.method8850(arg0.field2460.field3815);
                                var5.field3393.method8947(var4[0]);
                                field591.method2745(var5);
                            }
                        }
                }
            }
        } else if (arg0.field2460.field3894 == 12) {
            class356 var6 = arg0.field2460.method6312();
            if (var6 != null && var6.method6101()) {
                switch(arg0.field2459) {
                    case 0:
                        field553.method4068(arg0.field2460);
                        var6.method5987(true);
                        var6.method6038(arg0.field2458, arg0.field2461, field764.method4087(82), field764.method4087(81));
                        break;
                    case 1:
                        var6.method6073(arg0.field2458, arg0.field2461);
                }
            }
        }
    }

    @ObfuscatedName("rh.kd(B)Z")
    public static boolean method7695() {
        return (field573 & 0x1) != 0;
    }

    @ObfuscatedName("pl.kb(I)Z")
    public static boolean method6810() {
        return (field573 & 0x8) != 0;
    }

    @ObfuscatedName("bc.kn(Ldt;Ldh;IIIIII)V")
    public static final void method856(class102 arg0, class98 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 == null || !arg1.method2272()) {
            return;
        }
        if (arg1 instanceof class104) {
            class210 var7 = ((class104) arg1).field1360;
            if (var7.field2152 != null) {
                var7 = var7.method3664();
            }
            if (var7 == null) {
                return;
            }
        }
        int var8 = arg0.field1337.field1416;
        int[] var9 = arg0.field1337.field1417;
        boolean var10 = arg2 < var8;
        int var11 = -2;
        if (arg1.field1225 != null && (!var10 || !arg1.field1228 && (field759 == 4 || !arg1.field1222 && (field759 == 0 || field759 == 3 || field759 == 1 && ((class94) arg1).method2259())))) {
            method1156(arg0, arg1, arg1.field1280);
            if (field644 > -1 && field632 < field633) {
                field563[field632] = Statics.field3119.method7547(arg1.field1225) / 2;
                field636[field632] = Statics.field3119.field4760;
                field634[field632] = field644;
                field635[field632] = field529 - var11;
                field649[field632] = arg1.field1254;
                field743[field632] = arg1.field1231;
                field641[field632] = arg1.field1219;
                field788[field632] = arg1.field1212;
                field695[field632] = arg1.field1225;
                field632++;
                var11 += 12;
            }
        }
        if (!arg1.field1250.method6914()) {
            method1156(arg0, arg1, arg1.field1280 + 15);
            for (class103 var12 = (class103) arg1.field1250.method6889(); var12 != null; var12 = (class103) arg1.field1250.method6926()) {
                class99 var13 = var12.method2530(field821);
                if (var13 != null) {
                    class202 var14 = var12.field1356;
                    class560 var15 = var14.method3603();
                    class560 var16 = var14.method3602();
                    int var17 = 0;
                    int var18;
                    if (var15 == null || var16 == null) {
                        var18 = var14.field2071;
                    } else {
                        if (var14.field2072 * 2 < var16.field5441) {
                            var17 = var14.field2072;
                        }
                        var18 = var16.field5441 - var17 * 2;
                    }
                    int var19 = 255;
                    boolean var20 = true;
                    int var21 = field821 - var13.field1289;
                    int var22 = var13.field1286 * var18 / var14.field2071;
                    int var25;
                    if (var13.field1291 > var21) {
                        int var23 = var14.field2070 == 0 ? 0 : var21 / var14.field2070 * var14.field2070;
                        int var24 = var13.field1285 * var18 / var14.field2071;
                        var25 = (var22 - var24) * var23 / var13.field1291 + var24;
                    } else {
                        var25 = var22;
                        int var26 = var13.field1291 + var14.field2058 - var21;
                        if (var14.field2066 >= 0) {
                            var19 = (var26 << 8) / (var14.field2058 - var14.field2066);
                        }
                    }
                    if (var13.field1286 > 0 && var25 < 1) {
                        var25 = 1;
                    }
                    if (var15 == null || var16 == null) {
                        var11 += 5;
                        if (field644 > -1) {
                            int var32 = field644 + arg3 - (var18 >> 1);
                            int var33 = field529 + arg4 - var11;
                            class556.method9112(var32, var33, var25, 5, 65280);
                            class556.method9112(var25 + var32, var33, var18 - var25, 5, 16711680);
                        }
                        var11 += 2;
                    } else {
                        int var27;
                        if (var18 == var25) {
                            var27 = var17 * 2 + var25;
                        } else {
                            var27 = var17 + var25;
                        }
                        int var28 = var15.field5442;
                        var11 += var28;
                        int var29 = field644 + arg3 - (var18 >> 1);
                        int var30 = field529 + arg4 - var11;
                        int var31 = var29 - var17;
                        if (var19 >= 0 && var19 < 255) {
                            var15.method9233(var31, var30, var19);
                            class556.method9113(var31, var30, var27 + var31, var28 + var30);
                            var16.method9233(var31, var30, var19);
                        } else {
                            var15.method9319(var31, var30);
                            class556.method9113(var31, var30, var27 + var31, var28 + var30);
                            var16.method9319(var31, var30);
                        }
                        class556.method9104(arg3, arg4, arg3 + arg5, arg4 + arg6);
                        var11 += 2;
                    }
                } else if (var12.method2528()) {
                    var12.method8189();
                }
            }
        }
        if (var11 == -2) {
            var11 += 7;
        }
        if (var10 && field821 == arg1.field1265) {
            class94 var34 = (class94) arg1;
            boolean var35;
            if (field573 == 0) {
                var35 = false;
            } else if (Statics.field84 == var34) {
                var35 = method6810();
            } else {
                boolean var36 = (field573 & 0x4) != 0;
                boolean var37 = var36 || method7695() && var34.method2259();
                if (!var37) {
                    boolean var38 = (field573 & 0x2) != 0;
                    var37 = var38 && var34.method2262();
                }
                var35 = var37;
            }
            if (var35) {
                class94 var39 = (class94) arg1;
                if (var10) {
                    method1156(arg0, arg1, arg1.field1280 + 15);
                    class435 var40 = (class435) field595.get(class516.field5188);
                    var11 += 4;
                    var40.method7468(var39.field1153.method9385(), field644 + arg3, field529 + arg4 - var11, 16777215, 0);
                    var11 += 18;
                }
            }
        }
        if (var10) {
            class94 var41 = (class94) arg1;
            if (var41.field1143) {
                return;
            }
            if (var41.field1137 != -1 || var41.field1138 != -1) {
                method1156(arg0, arg1, arg1.field1280 + 15);
                if (field644 > -1) {
                    if (var41.field1137 != -1) {
                        var11 += 25;
                        Statics.field7[var41.field1137].method9319(field644 + arg3 - 12, field529 + arg4 - var11);
                    }
                    if (var41.field1138 != -1) {
                        var11 += 25;
                        Statics.field40[var41.field1138].method9319(field644 + arg3 - 12, field529 + arg4 - var11);
                    }
                }
            }
            if (arg2 >= 0 && field785 == 10 && field818 == var9[arg2]) {
                method1156(arg0, arg1, arg1.field1280 + 15);
                if (field644 > -1) {
                    int var42 = Statics.field4037[1].field5442 + var11;
                    Statics.field4037[1].method9319(field644 + arg3 - 12, field529 + arg4 - var42);
                }
            }
        } else {
            class104 var43 = (class104) arg1;
            int[] var44 = var43.method2542();
            short[] var45 = var43.method2543();
            if (var45 != null && var44 != null) {
                for (int var46 = 0; var46 < var45.length; var46++) {
                    if (var45[var46] >= 0 && var44[var46] >= 0) {
                        long var47 = (long) var44[var46] << 8 | (long) var45[var46];
                        class560 var49 = (class560) field820.method7767(var47);
                        if (var49 == null) {
                            class560[] var50 = class561.method5445(Statics.field1885, var44[var46], 0);
                            if (var50 != null && var45[var46] < var50.length) {
                                var49 = var50[var45[var46]];
                                field820.method7772(var47, var49);
                            }
                        }
                        if (var49 != null) {
                            method1156(arg0, arg1, arg1.field1280 + 15);
                            if (field644 > -1) {
                                var49.method9319(field644 + arg3 - (var49.field5441 >> 1), field529 + (arg4 - var49.field5442) - 4);
                            }
                        }
                    }
                }
            }
            if (field785 == 1 && field611 == arg0.field1346[arg2 - var8] && field821 % 20 < 10) {
                method1156(arg0, arg1, arg1.field1280 + 15);
                if (field644 > -1) {
                    Statics.field4037[0].method9319(field644 + arg3 - 12, field529 + arg4 - 28);
                }
            }
        }
        for (int var51 = 0; var51 < 4; var51++) {
            int var52 = arg1.field1236[var51];
            int var53 = arg1.field1234[var51];
            class222 var54 = null;
            int var55 = 0;
            if (var53 >= 0) {
                if (var52 <= field821) {
                    continue;
                }
                var54 = class222.method256(arg1.field1234[var51]);
                var55 = var54.field2262;
                if (var54 != null && var54.field2267 != null) {
                    var54 = var54.method3859();
                    if (var54 == null) {
                        arg1.field1236[var51] = -1;
                        continue;
                    }
                }
            } else if (var52 < 0) {
                continue;
            }
            int var56 = arg1.field1237[var51];
            class222 var57 = null;
            if (var56 >= 0) {
                var57 = class222.method256(var56);
                if (var57 != null && var57.field2267 != null) {
                    var57 = var57.method3859();
                }
            }
            if (var52 - var55 <= field821) {
                if (var54 == null) {
                    arg1.field1236[var51] = -1;
                } else {
                    method1156(arg0, arg1, arg1.field1280 / 2);
                    if (field644 > -1) {
                        boolean var58 = true;
                        if (var51 == 1) {
                            field529 -= 20;
                        }
                        if (var51 == 2) {
                            field644 -= 15;
                            field529 -= 10;
                        }
                        if (var51 == 3) {
                            field644 += 15;
                            field529 -= 10;
                        }
                        Object var59 = null;
                        Object var60 = null;
                        Object var61 = null;
                        Object var62 = null;
                        int var63 = 0;
                        int var64 = 0;
                        int var65 = 0;
                        int var66 = 0;
                        int var67 = 0;
                        int var68 = 0;
                        int var69 = 0;
                        int var70 = 0;
                        class560 var71 = null;
                        class560 var72 = null;
                        class560 var73 = null;
                        class560 var74 = null;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        int var78 = 0;
                        int var79 = 0;
                        int var80 = 0;
                        int var81 = 0;
                        int var82 = 0;
                        int var83 = 0;
                        class560 var84 = var54.method3832();
                        if (var84 != null) {
                            var63 = var84.field5441;
                            int var85 = var84.field5442;
                            if (var85 > var83) {
                                var83 = var85;
                            }
                            var67 = var84.field5451;
                        }
                        class560 var86 = var54.method3831();
                        if (var86 != null) {
                            var64 = var86.field5441;
                            int var87 = var86.field5442;
                            if (var87 > var83) {
                                var83 = var87;
                            }
                            var68 = var86.field5451;
                        }
                        class560 var88 = var54.method3834();
                        if (var88 != null) {
                            var65 = var88.field5441;
                            int var89 = var88.field5442;
                            if (var89 > var83) {
                                var83 = var89;
                            }
                            var69 = var88.field5451;
                        }
                        class560 var90 = var54.method3835();
                        if (var90 != null) {
                            var66 = var90.field5441;
                            int var91 = var90.field5442;
                            if (var91 > var83) {
                                var83 = var91;
                            }
                            var70 = var90.field5451;
                        }
                        if (var57 != null) {
                            var71 = var57.method3832();
                            if (var71 != null) {
                                var75 = var71.field5441;
                                int var92 = var71.field5442;
                                if (var92 > var83) {
                                    var83 = var92;
                                }
                                var79 = var71.field5451;
                            }
                            var72 = var57.method3831();
                            if (var72 != null) {
                                var76 = var72.field5441;
                                int var93 = var72.field5442;
                                if (var93 > var83) {
                                    var83 = var93;
                                }
                                var80 = var72.field5451;
                            }
                            var73 = var57.method3834();
                            if (var73 != null) {
                                var77 = var73.field5441;
                                int var94 = var73.field5442;
                                if (var94 > var83) {
                                    var83 = var94;
                                }
                                var81 = var73.field5451;
                            }
                            var74 = var57.method3835();
                            if (var74 != null) {
                                var78 = var74.field5441;
                                int var95 = var74.field5442;
                                if (var95 > var83) {
                                    var83 = var95;
                                }
                                var82 = var74.field5451;
                            }
                        }
                        class431 var96 = var54.method3842();
                        if (var96 == null) {
                            var96 = Statics.field5408;
                        }
                        class431 var97;
                        if (var57 == null) {
                            var97 = Statics.field5408;
                        } else {
                            var97 = var57.method3842();
                            if (var97 == null) {
                                var97 = Statics.field5408;
                            }
                        }
                        Object var98 = null;
                        String var99 = null;
                        boolean var100 = false;
                        int var101 = 0;
                        String var102 = var54.method3858(arg1.field1235[var51]);
                        int var103 = var96.method7547(var102);
                        if (var57 != null) {
                            var99 = var57.method3858(arg1.field1247[var51]);
                            var101 = var97.method7547(var99);
                        }
                        int var104 = 0;
                        int var105 = 0;
                        if (var64 > 0) {
                            if (var88 == null && var90 == null) {
                                var104 = 1;
                            } else {
                                var104 = var103 / var64 + 1;
                            }
                        }
                        if (var57 != null && var76 > 0) {
                            if (var73 == null && var74 == null) {
                                var105 = 1;
                            } else {
                                var105 = var101 / var76 + 1;
                            }
                        }
                        int var106 = 0;
                        int var107 = var106;
                        if (var63 > 0) {
                            var106 += var63;
                        }
                        var106 += 2;
                        int var108 = var106;
                        if (var65 > 0) {
                            var106 += var65;
                        }
                        int var109 = var106;
                        int var110 = var106;
                        int var112;
                        if (var64 > 0) {
                            int var111 = var64 * var104;
                            var112 = var106 + var111;
                            var110 = (var111 - var103) / 2 + var106;
                        } else {
                            var112 = var103 + var106;
                        }
                        int var113 = var112;
                        if (var66 > 0) {
                            var112 += var66;
                        }
                        int var114 = 0;
                        int var115 = 0;
                        int var116 = 0;
                        int var117 = 0;
                        int var118 = 0;
                        if (var57 != null) {
                            var112 += 2;
                            var114 = var112;
                            if (var75 > 0) {
                                var112 += var75;
                            }
                            var112 += 2;
                            var115 = var112;
                            if (var77 > 0) {
                                var112 += var77;
                            }
                            var116 = var112;
                            var118 = var112;
                            if (var76 > 0) {
                                int var119 = var76 * var105;
                                var112 += var119;
                                var118 += (var119 - var101) / 2;
                            } else {
                                var112 += var101;
                            }
                            var117 = var112;
                            if (var78 > 0) {
                                var112 += var78;
                            }
                        }
                        int var120 = arg1.field1236[var51] - field821;
                        int var121 = var54.field2261 - var54.field2261 * var120 / var54.field2262;
                        int var122 = var54.field2246 * var120 / var54.field2262 + -var54.field2246;
                        int var123 = field644 + arg3 - (var112 >> 1) + var121;
                        int var124 = field529 + arg4 - 12 + var122;
                        int var125 = var124;
                        int var126 = var83 + var124;
                        int var127 = var54.field2266 + var124 + 15;
                        int var128 = var127 - var96.field4762;
                        int var129 = var96.field4764 + var127;
                        if (var128 < var124) {
                            var125 = var128;
                        }
                        if (var129 > var126) {
                            var126 = var129;
                        }
                        int var130 = 0;
                        if (var57 != null) {
                            var130 = var57.field2266 + var124 + 15;
                            int var131 = var130 - var97.field4762;
                            int var132 = var97.field4764 + var130;
                            if (var131 < var125) {
                                ;
                            }
                            if (var132 > var126) {
                                ;
                            }
                        }
                        int var135 = 255;
                        if (var54.field2260 >= 0) {
                            var135 = (var120 << 8) / (var54.field2262 - var54.field2260);
                        }
                        if (var135 >= 0 && var135 < 255) {
                            if (var84 != null) {
                                var84.method9233(var107 + var123 - var67, var124, var135);
                            }
                            if (var88 != null) {
                                var88.method9233(var108 + var123 - var69, var124, var135);
                            }
                            if (var86 != null) {
                                for (int var136 = 0; var136 < var104; var136++) {
                                    var86.method9233(var64 * var136 + (var109 + var123 - var68), var124, var135);
                                }
                            }
                            if (var90 != null) {
                                var90.method9233(var113 + var123 - var70, var124, var135);
                            }
                            var96.method7466(var102, var110 + var123, var127, var54.field2268, 0, var135);
                            if (var57 != null) {
                                if (var71 != null) {
                                    var71.method9233(var114 + var123 - var79, var124, var135);
                                }
                                if (var73 != null) {
                                    var73.method9233(var115 + var123 - var81, var124, var135);
                                }
                                if (var72 != null) {
                                    for (int var137 = 0; var137 < var105; var137++) {
                                        var72.method9233(var76 * var137 + (var116 + var123 - var80), var124, var135);
                                    }
                                }
                                if (var74 != null) {
                                    var74.method9233(var117 + var123 - var82, var124, var135);
                                }
                                var97.method7466(var99, var118 + var123, var130, var57.field2268, 0, var135);
                            }
                        } else {
                            if (var84 != null) {
                                var84.method9319(var107 + var123 - var67, var124);
                            }
                            if (var88 != null) {
                                var88.method9319(var108 + var123 - var69, var124);
                            }
                            if (var86 != null) {
                                for (int var138 = 0; var138 < var104; var138++) {
                                    var86.method9319(var64 * var138 + (var109 + var123 - var68), var124);
                                }
                            }
                            if (var90 != null) {
                                var90.method9319(var113 + var123 - var70, var124);
                            }
                            var96.method7488(var102, var110 + var123, var127, var54.field2268 | 0xFF000000, 0);
                            if (var57 != null) {
                                if (var71 != null) {
                                    var71.method9319(var114 + var123 - var79, var124);
                                }
                                if (var73 != null) {
                                    var73.method9319(var115 + var123 - var81, var124);
                                }
                                if (var72 != null) {
                                    for (int var139 = 0; var139 < var105; var139++) {
                                        var72.method9319(var76 * var139 + (var116 + var123 - var80), var124);
                                    }
                                }
                                if (var74 != null) {
                                    var74.method9319(var117 + var123 - var82, var124);
                                }
                                var97.method7488(var99, var118 + var123, var130, var57.field2268 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("oo.km(B)V")
    public static final void method6477() {
        field651 = 0;
        int var0 = (Statics.field84.field1215 >> 7) + Statics.field3967.field1338;
        int var1 = (Statics.field84.field1276 >> 7) + Statics.field3967.field1334;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field651 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field651 = 1;
        }
        if (field651 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field651 = 0;
        }
    }

    @ObfuscatedName("ca.kg(Ldt;Ldh;IB)V")
    public static final void method1156(class102 arg0, class98 arg1, int arg2) {
        method2025(arg0, arg1.field1215, arg1.field1276, arg2);
    }

    @ObfuscatedName("cj.ko(Ldt;IIIB)V")
    public static final void method2025(class102 arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
            field644 = -1;
            field529 = -1;
            return;
        }
        int var4 = method826(arg0, arg1, arg2, arg0.field1349) - arg3;
        int var5 = arg1 - Statics.field3770;
        int var6 = var4 - Statics.field1848;
        int var7 = arg2 - Statics.field1498;
        int var8 = class248.field2665[Statics.field1255];
        int var9 = class248.field2669[Statics.field1255];
        int var10 = class248.field2665[Statics.field2100];
        int var11 = class248.field2669[Statics.field2100];
        int var12 = var5 * var11 + var7 * var10 >> 16;
        int var13 = var7 * var11 - var5 * var10 >> 16;
        int var15 = var6 * var9 - var8 * var13 >> 16;
        int var16 = var6 * var8 + var9 * var13 >> 16;
        if (var16 >= 50) {
            field644 = field813 * var12 / var16 + field811 / 2;
            field529 = field813 * var15 / var16 + field812 / 2;
        } else {
            field644 = -1;
            field529 = -1;
        }
    }

    @ObfuscatedName("bm.kp(Ldt;IIIB)I")
    public static final int method826(class102 arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 >= arg0.field1341[0].length || var5 >= arg0.field1341[0][0].length) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (arg0.field1341[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * arg0.field1340[var6][var4][var5] + arg0.field1340[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * arg0.field1340[var6][var4][var5 + 1] + arg0.field1340[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @ObfuscatedName("qx.kk(ZLuk;I)V")
    public static final void method7269(boolean arg0, class545 arg1) {
        field603 = arg0;
        if (!field603) {
            int var2 = arg1.method8896();
            arg1.method8852();
            int var3 = arg1.method8896();
            int var4 = arg1.method8798();
            Statics.field89 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field89[var5][var6] = arg1.method8801();
                }
            }
            Statics.field733 = new int[var4];
            Statics.field1759 = new int[var4];
            Statics.field5051 = new int[var4];
            Statics.field1647 = new byte[var4][];
            Statics.field5119 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field733[var7] = var10;
                    Statics.field1759[var7] = Statics.field2971.method6587("m" + var8 + "_" + var9);
                    Statics.field5051[var7] = Statics.field2971.method6587("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method6761(var3, var2, true);
            return;
        }
        int var11 = arg1.method8837();
        boolean var12 = arg1.method8829() == 1;
        int var13 = arg1.method8836();
        int var14 = arg1.method8798();
        arg1.method8738();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8743(1);
                    if (var18 == 1) {
                        field610[var15][var16][var17] = arg1.method8743(26);
                    } else {
                        field610[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8772();
        Statics.field89 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field89[var19][var20] = arg1.method8801();
            }
        }
        Statics.field733 = new int[var14];
        Statics.field1759 = new int[var14];
        Statics.field5051 = new int[var14];
        Statics.field1647 = new byte[var14][];
        Statics.field5119 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field610[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field733[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field733[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field1759[var21] = Statics.field2971.method6587("m" + var30 + "_" + var31);
                            Statics.field5051[var21] = Statics.field2971.method6587("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method6761(var11, var13, !var12);
    }

    @ObfuscatedName("pg.ka(IIZI)V")
    public static final void method6761(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field5008 == arg0 && Statics.field4787 == arg1) {
            return;
        }
        Statics.field5008 = arg0;
        Statics.field4787 = arg1;
        Statics.method2625(25);
        field528 = true;
        method7795(class378.field4100, true);
        int var3 = Statics.field3967.field1338;
        int var4 = Statics.field3967.field1334;
        Statics.field3967.field1338 = (arg0 - 6) * 8;
        Statics.field3967.field1334 = (arg1 - 6) * 8;
        int var5 = Statics.field3967.field1338 - var3;
        int var6 = Statics.field3967.field1334 - var4;
        int var7 = Statics.field3967.field1338;
        int var8 = Statics.field3967.field1334;
        for (int var9 = 0; var9 < 65536; var9++) {
            class104 var10 = Statics.field3967.field1344[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1230[var11] -= var5;
                    var10.field1277[var11] -= var6;
                }
                var10.field1215 -= var5 * 128;
                var10.field1276 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class94 var13 = Statics.field3967.field1342[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1230[var14] -= var5;
                    var13.field1277[var14] -= var6;
                }
                var13.field1215 -= var5 * 128;
                var13.field1276 -= var6 * 128;
            }
        }
        for (int var15 = 0; var15 < 2048; var15++) {
            class476 var16 = Statics.field3967.field1348[var15];
            if (var16 != null) {
                for (int var17 = 0; var17 < 10; var17++) {
                    var16.field4943[var17] -= var5;
                    var16.field4951[var17] -= var6;
                }
                var16.field4944 -= var5 * 128;
                var16.field4946 -= var6 * 128;
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
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                        Statics.field3967.field1350[var28][var24][var25] = Statics.field3967.field1350[var28][var26][var27];
                    } else {
                        Statics.field3967.field1350[var28][var24][var25] = null;
                    }
                }
            }
        }
        for (class97 var29 = (class97) Statics.field3967.field1343.method6834(); var29 != null; var29 = (class97) Statics.field3967.field1343.method6842()) {
            var29.field1193 -= var5;
            var29.field1197 -= var6;
            if (var29.field1193 < 0 || var29.field1197 < 0 || var29.field1193 >= 104 || var29.field1197 >= 104) {
                var29.method8189();
            }
        }
        if (field777 != 0) {
            field777 -= var5;
            field637 -= var6;
        }
        field693 = 0;
        field539 = false;
        Statics.field3770 -= var5 << 7;
        Statics.field1498 -= var6 << 7;
        Statics.field179 -= var5 << 7;
        Statics.field932 -= var6 << 7;
        field772 = -1;
        Statics.field3967.field1353.method6828();
        Statics.field3967.field1352.method6828();
        for (int var30 = 0; var30 < 4; var30++) {
            Statics.field3967.field1333[var30].method4112();
        }
    }

    @ObfuscatedName("ah.kt(ZB)V")
    public static final void method95(boolean arg0) {
        method3723();
        field591.field1464++;
        if (field591.field1464 < 50 && !arg0) {
            return;
        }
        field591.field1464 = 0;
        if (field593 || field591.method2748() == null) {
            return;
        }
        class321 var1 = class321.method3542(class319.field3358, field591.field1467);
        field591.method2745(var1);
        try {
            field591.method2747();
        } catch (IOException var3) {
            field593 = true;
        }
    }

    @ObfuscatedName("ky.kc(B)V")
    public static final void method5113() {
        method95(false);
        field596 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1647.length; var1++) {
            if (Statics.field1759[var1] != -1 && Statics.field1647[var1] == null) {
                Statics.field1647[var1] = Statics.field2971.method6573(Statics.field1759[var1], 0);
                if (Statics.field1647[var1] == null) {
                    var0 = false;
                    field596++;
                }
            }
            if (Statics.field5051[var1] != -1 && Statics.field5119[var1] == null) {
                Statics.field5119[var1] = Statics.field2971.method6646(Statics.field5051[var1], 0, Statics.field89[var1]);
                if (Statics.field5119[var1] == null) {
                    var0 = false;
                    field596++;
                }
            }
        }
        if (!var0) {
            field585 = 1;
            return;
        }
        field700 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1647.length; var3++) {
            byte[] var4 = Statics.field5119[var3];
            if (var4 != null) {
                int var5 = (Statics.field733[var3] >> 8) * 64 - Statics.field3967.field1338;
                int var6 = (Statics.field733[var3] & 0xFF) * 64 - Statics.field3967.field1334;
                if (field603) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class84.method8032(var4, var5, var6);
            }
        }
        if (!var2) {
            field585 = 2;
            return;
        }
        if (field585 != 0) {
            method7795(class378.field4100 + class105.field1375 + class105.field1371 + 100 + "%" + class105.field1376, true);
        }
        method3723();
        Statics.field3967.field1332.method4501();
        for (int var7 = 0; var7 < 4; var7++) {
            Statics.field3967.field1333[var7].method4112();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    Statics.field3967.field1341[var8][var9][var10] = 0;
                }
            }
        }
        method3723();
        class84.method6717();
        int var11 = Statics.field1647.length;
        class72.method3087();
        method95(true);
        if (!field603) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field733[var12] >> 8) * 64 - Statics.field3967.field1338;
                int var14 = (Statics.field733[var12] & 0xFF) * 64 - Statics.field3967.field1334;
                byte[] var15 = Statics.field1647[var12];
                if (var15 != null) {
                    method3723();
                    class84.method8108(Statics.field3967, var15, var13, var14, Statics.field5008 * 8 - 48, Statics.field4787 * 8 - 48);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field733[var16] >> 8) * 64 - Statics.field3967.field1338;
                int var18 = (Statics.field733[var16] & 0xFF) * 64 - Statics.field3967.field1334;
                byte[] var19 = Statics.field1647[var16];
                if (var19 == null && Statics.field4787 < 800) {
                    method3723();
                    class84.method4145(Statics.field3967, var17, var18, 64, 64);
                }
            }
            method95(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field5119[var20];
                if (var21 != null) {
                    int var22 = (Statics.field733[var20] >> 8) * 64 - Statics.field3967.field1338;
                    int var23 = (Statics.field733[var20] & 0xFF) * 64 - Statics.field3967.field1334;
                    method3723();
                    class84.method2969(Statics.field3967, var21, var22, var23);
                }
            }
        }
        if (field603) {
            for (int var24 = 0; var24 < 4; var24++) {
                method3723();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field610[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field733.length; var34++) {
                                if (Statics.field733[var34] == var33 && Statics.field1647[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class84.method2860(Statics.field3967, Statics.field1647[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class84.method4065(Statics.field3967.field1340, var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field610[0][var37][var38];
                    if (var39 == -1) {
                        class84.method4145(Statics.field3967, var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method95(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method3723();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field610[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field733.length; var49++) {
                                if (Statics.field733[var49] == var48 && Statics.field5119[var49] != null) {
                                    class84.method2155(Statics.field3967, Statics.field5119[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method95(true);
        method3723();
        class84.method8665(Statics.field3967);
        method95(true);
        int var50 = class84.field1053;
        if (var50 > Statics.field3967.field1349) {
            var50 = Statics.field3967.field1349;
        }
        if (var50 < Statics.field3967.field1349 - 1) {
            int var51 = Statics.field3967.field1349 - 1;
        }
        if (field642) {
            Statics.field3967.field1332.method4707(class84.field1053);
        } else {
            Statics.field3967.field1332.method4707(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method5056(Statics.field3967, var52, var53);
            }
        }
        method3723();
        method7693();
        class224.field2315.method5572();
        if (Statics.field1971.method510()) {
            class321 var54 = class321.method3542(class319.field3364, field591.field1467);
            var54.field3393.method8981(1057001181);
            field591.method2745(var54);
        }
        if (!field603) {
            int var55 = (Statics.field5008 - 6) / 8;
            int var56 = (Statics.field5008 + 6) / 8;
            int var57 = (Statics.field4787 - 6) / 8;
            int var58 = (Statics.field4787 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field2971.method6599("m" + var59 + "_" + var60);
                        Statics.field2971.method6599("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method3723();
        class84.method2878();
        class321 var61 = class321.method3542(class319.field3293, field591.field1467);
        field591.method2745(var61);
        class35.method307();
        field528 = false;
    }

    @ObfuscatedName("fx.kj(Ldt;I)V")
    public static void method3042(class102 arg0) {
        int var1 = arg0.field1347 / 8;
        int var2 = arg0.field1331 / 8;
        boolean var3 = false;
        method95(false);
        boolean var4 = true;
        for (int var5 = 0; var5 < Statics.field3707.length; var5++) {
            if (Statics.field1697[var5] != -1 && Statics.field3707[var5] == null) {
                Statics.field3707[var5] = Statics.field2971.method6573(Statics.field1697[var5], 0);
                if (Statics.field3707[var5] == null) {
                    var4 = false;
                }
            }
            if (Statics.field334[var5] != -1 && Statics.field1637[var5] == null) {
                Statics.field1637[var5] = Statics.field2971.method6646(Statics.field334[var5], 0, Statics.field5103[var5]);
                if (Statics.field1637[var5] == null) {
                    var4 = false;
                }
            }
        }
        if (!var4) {
            return;
        }
        method95(false);
        boolean var6 = true;
        for (int var7 = 0; var7 < Statics.field3707.length; var7++) {
            byte[] var8 = Statics.field1637[var7];
            if (var8 != null) {
                byte var9 = 10;
                byte var10 = 10;
                var6 &= class84.method8032(var8, var9, var10);
            }
        }
        if (!var6) {
            return;
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < arg0.field1341[var11].length; var12++) {
                Arrays.fill(arg0.field1341[var11][var12], (byte) 0);
            }
        }
        method3723();
        class84.method6717();
        class72.method3087();
        method95(true);
        for (int var13 = 0; var13 < 4; var13++) {
            method3723();
            for (int var14 = 0; var14 < var1; var14++) {
                for (int var15 = 0; var15 < var2; var15++) {
                    boolean var16 = false;
                    int var17 = field602[var13][var14][var15];
                    if (var17 != -1) {
                        int var18 = var17 >> 24 & 0x3;
                        int var19 = var17 >> 1 & 0x3;
                        int var20 = var17 >> 14 & 0x3FF;
                        int var21 = var17 >> 3 & 0x7FF;
                        int var22 = (var20 / 8 << 8) + var21 / 8;
                        for (int var23 = 0; var23 < Statics.field1496.length; var23++) {
                            if (Statics.field1496[var23] == var22 && Statics.field3707[var23] != null) {
                                int var24 = (var20 - var14) * 8;
                                int var25 = (var21 - var15) * 8;
                                class84.method2860(arg0, Statics.field3707[var23], var13, var14 * 8, var15 * 8, var18, (var20 & 0x7) * 8, (var21 & 0x7) * 8, var19, var24, var25);
                                var16 = true;
                                break;
                            }
                        }
                    }
                    if (!var16) {
                        class84.method4065(arg0.field1340, var13, var14 * 8, var15 * 8);
                    }
                }
            }
        }
        for (int var26 = 0; var26 < 13; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                int var28 = field602[0][var26][var27];
                if (var28 == -1) {
                    class84.method4145(arg0, var26 * 8, var27 * 8, 8, 8);
                }
            }
        }
        method95(true);
        for (int var29 = 0; var29 < 4; var29++) {
            method3723();
            for (int var30 = 0; var30 < var1; var30++) {
                for (int var31 = 0; var31 < var2; var31++) {
                    int var32 = field602[var29][var30][var31];
                    if (var32 != -1) {
                        int var33 = var32 >> 24 & 0x3;
                        int var34 = var32 >> 1 & 0x3;
                        int var35 = var32 >> 14 & 0x3FF;
                        int var36 = var32 >> 3 & 0x7FF;
                        int var37 = (var35 / 8 << 8) + var36 / 8;
                        for (int var38 = 0; var38 < Statics.field1496.length; var38++) {
                            if (Statics.field1496[var38] == var37 && Statics.field1637[var38] != null) {
                                class84.method2155(arg0, Statics.field1637[var38], var29, var30 * 8, var31 * 8, var33, (var35 & 0x7) * 8, (var36 & 0x7) * 8, var34);
                                break;
                            }
                        }
                    }
                }
            }
        }
        method95(true);
        method3723();
        class84.method8665(arg0);
        method95(true);
        class224.field2315.method5572();
        method3723();
        class84.method2878();
        field685 = false;
    }

    @ObfuscatedName("bf.kf(IIIIII)V")
    public static final void method411(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class253 var5 = Statics.field3967.field1332;
        long var6 = var5.method4527(arg0, arg1, arg2);
        if (var6 != 0L) {
            int var8 = var5.method4579(arg0, arg1, arg2, var6);
            int var9 = var8 >> 6 & 0x3;
            int var10 = var8 & 0x1F;
            int var11 = arg3;
            boolean var12 = var6 != 0L && !class265.method2020(var6);
            if (var12) {
                var11 = arg4;
            }
            int[] var13 = Statics.field1288.field5445;
            int var14 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var15 = class265.method2622(var6);
            class224 var16 = class224.method3868(var15);
            if (var16.field2305 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var13[var14] = var11;
                        var13[var14 + 512] = var11;
                        var13[var14 + 1024] = var11;
                        var13[var14 + 1536] = var11;
                    } else if (var9 == 1) {
                        var13[var14] = var11;
                        var13[var14 + 1] = var11;
                        var13[var14 + 2] = var11;
                        var13[var14 + 3] = var11;
                    } else if (var9 == 2) {
                        var13[var14 + 3] = var11;
                        var13[var14 + 3 + 512] = var11;
                        var13[var14 + 3 + 1024] = var11;
                        var13[var14 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var13[var14 + 1536] = var11;
                        var13[var14 + 1536 + 1] = var11;
                        var13[var14 + 1536 + 2] = var11;
                        var13[var14 + 1536 + 3] = var11;
                    }
                }
                if (var10 == 3) {
                    if (var9 == 0) {
                        var13[var14] = var11;
                    } else if (var9 == 1) {
                        var13[var14 + 3] = var11;
                    } else if (var9 == 2) {
                        var13[var14 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var13[var14 + 1536] = var11;
                    }
                }
                if (var10 == 2) {
                    if (var9 == 3) {
                        var13[var14] = var11;
                        var13[var14 + 512] = var11;
                        var13[var14 + 1024] = var11;
                        var13[var14 + 1536] = var11;
                    } else if (var9 == 0) {
                        var13[var14] = var11;
                        var13[var14 + 1] = var11;
                        var13[var14 + 2] = var11;
                        var13[var14 + 3] = var11;
                    } else if (var9 == 1) {
                        var13[var14 + 3] = var11;
                        var13[var14 + 3 + 512] = var11;
                        var13[var14 + 3 + 1024] = var11;
                        var13[var14 + 3 + 1536] = var11;
                    } else if (var9 == 2) {
                        var13[var14 + 1536] = var11;
                        var13[var14 + 1536 + 1] = var11;
                        var13[var14 + 1536 + 2] = var11;
                        var13[var14 + 1536 + 3] = var11;
                    }
                }
            } else {
                class559 var17 = Statics.field73[var16.field2305];
                if (var17 != null) {
                    int var18 = (var16.field2291 * 4 - var17.field5432) / 2;
                    int var19 = (var16.field2292 * 4 - var17.field5435) / 2;
                    var17.method9196(arg1 * 4 + 48 + var18, (104 - arg2 - var16.field2292) * 4 + 48 + var19);
                }
            }
        }
        long var20 = var5.method4529(arg0, arg1, arg2);
        if (var20 != 0L) {
            int var22 = var5.method4579(arg0, arg1, arg2, var20);
            int var23 = var22 >> 6 & 0x3;
            int var24 = var22 & 0x1F;
            int var25 = class265.method2622(var20);
            class224 var26 = class224.method3868(var25);
            if (var26.field2305 != -1) {
                class559 var27 = Statics.field73[var26.field2305];
                if (var27 != null) {
                    int var28 = (var26.field2291 * 4 - var27.field5432) / 2;
                    int var29 = (var26.field2292 * 4 - var27.field5435) / 2;
                    var27.method9196(arg1 * 4 + 48 + var28, (104 - arg2 - var26.field2292) * 4 + 48 + var29);
                }
            } else if (var24 == 9) {
                int var30 = 15658734;
                boolean var31 = var20 != 0L && !class265.method2020(var20);
                if (var31) {
                    var30 = 15597568;
                }
                int[] var32 = Statics.field1288.field5445;
                int var33 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var23 == 0 || var23 == 2) {
                    var32[var33 + 1536] = var30;
                    var32[var33 + 1024 + 1] = var30;
                    var32[var33 + 512 + 2] = var30;
                    var32[var33 + 3] = var30;
                } else {
                    var32[var33] = var30;
                    var32[var33 + 512 + 1] = var30;
                    var32[var33 + 1024 + 2] = var30;
                    var32[var33 + 1536 + 3] = var30;
                }
            }
        }
        long var34 = var5.method4530(arg0, arg1, arg2);
        if (var34 == 0L) {
            return;
        }
        int var36 = class265.method2622(var34);
        class224 var37 = class224.method3868(var36);
        if (var37.field2305 == -1) {
            return;
        }
        class559 var38 = Statics.field73[var37.field2305];
        if (var38 != null) {
            int var39 = (var37.field2291 * 4 - var38.field5432) / 2;
            int var40 = (var37.field2292 * 4 - var38.field5435) / 2;
            var38.method9196(arg1 * 4 + 48 + var39, (104 - arg2 - var37.field2292) * 4 + 48 + var40);
        }
    }

    @ObfuscatedName("client.kv(Lel;IB)Z")
    public boolean method1210(class115 arg0, int arg1) {
        if (arg0.field1465 == 0) {
            Statics.field1404 = null;
        } else {
            if (Statics.field1404 == null) {
                Statics.field1404 = new class466(Statics.field2521, Statics.field1971);
            }
            Statics.field1404.method7818(arg0.field1468, arg1);
        }
        field731 = field720;
        Statics.field3138 = true;
        arg0.field1470 = null;
        return true;
    }

    @ObfuscatedName("client.kq(Lel;B)Z")
    public boolean method1198(class115 arg0) {
        if (Statics.field1404 != null) {
            Statics.field1404.method7819(arg0.field1468);
        }
        field731 = field720;
        Statics.field3138 = true;
        arg0.field1470 = null;
        return true;
    }

    @ObfuscatedName("client.kr(Lel;I)Z")
    public final boolean method1178(class115 arg0) {
        class478 var2 = arg0.method2748();
        class545 var3 = arg0.field1468;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1470 == null) {
                if (arg0.field1472) {
                    if (!var2.method8027(1)) {
                        return false;
                    }
                    var2.method8022(arg0.field1468.field5346, 0, 1);
                    arg0.field1471 = 0;
                    arg0.field1472 = false;
                }
                var3.field5344 = 0;
                if (var3.method8740()) {
                    if (!var2.method8027(1)) {
                        return false;
                    }
                    var2.method8022(arg0.field1468.field5346, 1, 1);
                    arg0.field1471 = 0;
                }
                arg0.field1472 = true;
                class322[] var4 = Statics.method439();
                int var5 = var3.method8764();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5344);
                }
                arg0.field1470 = var4[var5];
                arg0.field1465 = arg0.field1470.field3408;
            }
            if (arg0.field1465 == -1) {
                if (!var2.method8027(1)) {
                    return false;
                }
                arg0.method2748().method8022(var3.field5346, 0, 1);
                arg0.field1465 = var3.field5346[0] & 0xFF;
            }
            if (arg0.field1465 == -2) {
                if (!var2.method8027(2)) {
                    return false;
                }
                arg0.method2748().method8022(var3.field5346, 0, 2);
                var3.field5344 = 0;
                arg0.field1465 = var3.method8798();
            }
            if (!var2.method8027(arg0.field1465)) {
                return false;
            }
            var3.field5344 = 0;
            var2.method8022(var3.field5346, 0, arg0.field1465);
            arg0.field1471 = 0;
            field594.method7674();
            arg0.field1477 = arg0.field1476;
            arg0.field1476 = arg0.field1475;
            arg0.field1475 = arg0.field1470;
            if (class322.field3436 == arg0.field1470) {
                int var6 = var3.method8836();
                int var7 = var3.method8851();
                class358 var8 = Statics.field75.method5906(var7);
                if (var8.field3931 != 2 || var8.field3861 != var6) {
                    var8.field3931 = 2;
                    var8.field3861 = var6;
                    Statics.method5599(var8);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3467 == arg0.field1470) {
                field795 = false;
                field539 = false;
                field789 = false;
                field790 = false;
                Statics.field3270 = 0;
                Statics.field3134 = 0;
                Statics.field1503 = 0;
                field791 = false;
                Statics.field1451 = 0;
                Statics.field3032 = 0;
                Statics.field3968 = 0;
                Statics.field1506 = 0;
                Statics.field939 = 0;
                Statics.field3708 = 0;
                Statics.field4881 = 0;
                field792 = null;
                field794 = null;
                field793 = null;
                for (int var9 = 0; var9 < 5; var9++) {
                    field599[var9] = false;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3431 == arg0.field1470) {
                if (field783 != -1) {
                    method2795(field783, 0);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3522 == arg0.field1470) {
                int var10 = var3.method8796();
                int var11 = var3.method8798();
                this.method488(false);
                if (var10 == 0) {
                    Statics.field900 = Statics.field3967.field1342[var11];
                } else if (var10 == 1) {
                    Statics.field900 = Statics.field3967.field1344[var11];
                } else if (var10 == 2) {
                    Statics.field900 = Statics.field3967.field1348[var11];
                    this.method488(true);
                }
                if (Statics.field900 == null) {
                    Statics.field900 = Statics.field84;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3483 == arg0.field1470) {
                boolean var12 = var3.method8829() == 1;
                int var13 = var3.method8946();
                class358 var14 = Statics.field75.method5906(var13);
                class358.method1117(var14, Statics.field84.field1157, var12);
                Statics.method5599(var14);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3494 == arg0.field1470) {
                int var15 = var3.method8801();
                if (field806 != var15) {
                    field806 = var15;
                    method2624();
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3487 == arg0.field1470) {
                int var16 = var3.method8837();
                int var17 = var3.method8798();
                int var18 = var3.method8798();
                int var19 = var3.method8836();
                int var20 = var3.method8896();
                if (var19 == 65535) {
                    var19 = -1;
                }
                ArrayList var21 = new ArrayList();
                var21.add(var19);
                method303(var21, var16, var17, var20, var18);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3490 == arg0.field1470) {
                field539 = true;
                field795 = false;
                field789 = true;
                Statics.field939 = var3.method8796();
                Statics.field3708 = var3.method8796();
                int var22 = var3.method8798();
                int var23 = var3.method8796() * 128 + 64;
                int var24 = var3.method8796() * 128 + 64;
                int var25 = var3.method8798();
                field791 = var3.method8804();
                int var26 = var3.method8796();
                int var27 = Statics.field939 * 128 + 64;
                int var28 = Statics.field3708 * 128 + 64;
                boolean var29 = false;
                boolean var30 = false;
                int var31;
                int var32;
                if (field791) {
                    var31 = Statics.field1848;
                    var32 = method826(Statics.field3967, var27, var28, Statics.field3967.field1349) - var22;
                } else {
                    var31 = method826(Statics.field3967, Statics.field3770, Statics.field1498, Statics.field3967.field1349) - Statics.field1848;
                    var32 = var22;
                }
                field792 = new class508(Statics.field3770, Statics.field1498, var31, var27, var28, var32, var23, var24, var25, var26);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3477 == arg0.field1470) {
                Statics.field182.method1798();
                field730 = field720;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3403 == arg0.field1470) {
                int var33 = var3.method8796();
                int var34 = var3.method8829() * 4;
                int var35 = var3.method8837();
                byte var36 = var3.method8830();
                int var37 = var3.method8789();
                int var38 = var3.method8976();
                int var39 = var38 >> 16;
                int var40 = var38 >> 8 & 0xFF;
                int var41 = (var38 >> 4 & 0x7) + var39;
                int var42 = (var38 & 0x7) + var40;
                int var43 = var3.method8836();
                int var44 = var3.method8796() * 4;
                int var45 = var3.method8798();
                byte var46 = var3.method8965();
                int var47 = var3.method8829();
                int var48 = var36 + var41;
                int var49 = var42 + var46;
                if (var41 >= 0 && var42 >= 0 && var41 < Statics.field4624.field1347 && var42 < Statics.field4624.field1331 && var48 >= 0 && var49 >= 0 && var48 < Statics.field4624.field1347 && var49 < Statics.field4624.field1331 && var35 != 65535) {
                    int var50 = var41 * 128 + 64;
                    int var51 = var42 * 128 + 64;
                    int var52 = var48 * 128 + 64;
                    int var53 = var49 * 128 + 64;
                    class79 var54 = new class79(var35, Statics.field4624.field1349, var50, var51, method826(Statics.field4624, var50, var51, Statics.field4624.field1349) - var34, field821 + var43, field821 + var45, var33, var47, var37, var44);
                    var54.method2097(var52, var53, method826(Statics.field4624, var52, var53, Statics.field4624.field1349) - var44, field821 + var43);
                    Statics.field4624.field1352.method6829(var54);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3502 == arg0.field1470) {
                int var55 = var3.method8796();
                int var56 = var3.method8796();
                int var57 = var3.method8796();
                int var58 = var3.method8796();
                field599[var55] = true;
                field797[var55] = var56;
                field715[var55] = var57;
                field799[var55] = var58;
                field710[var55] = 0;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3480 == arg0.field1470) {
                int var59 = var3.method8836();
                int var60 = var3.method8798();
                int var61 = var3.method8837();
                int var62 = var3.method8837();
                class330.method3759(var60, var59, var61, var62);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3496 == arg0.field1470) {
                int var63 = var3.method8798();
                int var64 = var3.method8796();
                int var65 = var3.method8837();
                if (var65 == 65535) {
                    var65 = -1;
                }
                class104 var66 = Statics.field4624.field1344[var63];
                if (var66 != null) {
                    if (var66.field1224 == var65 && var65 != -1) {
                        int var67 = class227.method4744(var65).field2434;
                        if (var67 == 1) {
                            var66.field1251 = 0;
                            var66.field1252 = 0;
                            var66.field1253 = var64;
                            var66.field1240 = 0;
                        } else if (var67 == 2) {
                            var66.field1240 = 0;
                        }
                    } else if (var65 == -1 || var66.field1224 == -1 || class227.method4744(var65).field2410 >= class227.method4744(var66.field1224).field2410) {
                        var66.field1224 = var65;
                        var66.field1251 = 0;
                        var66.field1252 = 0;
                        var66.field1253 = var64;
                        var66.field1240 = 0;
                        var66.field1227 = var66.field1275;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3419 == arg0.field1470) {
                String var68 = var3.method8806();
                String var69 = class435.method7464(class415.method6484(class361.method5598(var3)));
                class114.method2802(6, var68, var69);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3519 == arg0.field1470) {
                boolean var70 = var3.method8796() == 1;
                if (var70) {
                    Statics.field2039 = class326.method2895() - var3.method8802();
                    Statics.field1797 = new class389(var3, true);
                } else {
                    Statics.field1797 = null;
                }
                field652 = field720;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3460 == arg0.field1470) {
                int var71 = var3.method8853();
                int var72 = var3.method8801();
                int var73 = var3.method8836();
                if (var73 == 65535) {
                    var73 = -1;
                }
                class358 var74 = Statics.field75.method5906(var72);
                if (var74.field3814) {
                    var74.field3949 = var73;
                    var74.field3950 = var71;
                    class225 var76 = class225.method369(var73).method3933(var71);
                    var74.field3868 = var76.field2345;
                    var74.field3953 = var76.field2369;
                    var74.field3870 = var76.field2346;
                    var74.field3908 = var76.field2348;
                    var74.field3923 = var76.field2331;
                    var74.field3871 = var76.field2344;
                    if (var76.field2351 == 1) {
                        var74.field3877 = 1;
                    } else {
                        var74.field3877 = 2;
                    }
                    if (var74.field3872 > 0) {
                        var74.field3871 = var74.field3871 * 32 / var74.field3872;
                    } else if (var74.field3867 > 0) {
                        var74.field3871 = var74.field3871 * 32 / var74.field3867;
                    }
                    Statics.method5599(var74);
                } else if (var73 == -1) {
                    var74.field3931 = 0;
                    arg0.field1470 = null;
                    return true;
                } else {
                    class225 var75 = class225.method369(var73).method3933(var71);
                    var74.field3931 = 4;
                    var74.field3861 = var73;
                    var74.field3868 = var75.field2345;
                    var74.field3953 = var75.field2369;
                    var74.field3871 = var75.field2344 * 100 / var71;
                    Statics.method5599(var74);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3456 == arg0.field1470) {
                field539 = true;
                field795 = false;
                field790 = true;
                int var77 = var3.method8926();
                int var78 = var3.method8926();
                int var79 = Statics.method5380(Statics.field1255 + var78 & 0x7EB);
                int var80 = Statics.field2100 + var77;
                int var81 = var3.method8798();
                int var82 = var3.method8796();
                field794 = new class510(Statics.field1255, var79, var81, var82);
                field793 = new class510(Statics.field2100, var80, var81, var82);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3446 == arg0.field1470) {
                int var83 = arg0.field1465 + var3.field5344;
                int var84 = var3.method8798();
                if (var84 == 65535) {
                    var84 = -1;
                }
                int var85 = var3.method8798();
                if (field783 != var84) {
                    field783 = var84;
                    this.method1709(false);
                    method3308(field783);
                    class73.method55(field783);
                    for (int var86 = 0; var86 < 100; var86++) {
                        field657[var86] = true;
                    }
                }
                while (var85-- > 0) {
                    int var87 = var3.method8801();
                    int var88 = var3.method8798();
                    int var89 = var3.method8796();
                    class89 var90 = (class89) field697.method8528((long) var87);
                    if (var90 != null && var90.field1090 != var88) {
                        method687(var90, true);
                        var90 = null;
                    }
                    if (var90 == null) {
                        var90 = method5047(var87, var88, var89);
                    }
                    var90.field1092 = true;
                }
                for (class89 var91 = (class89) field697.method8530(); var91 != null; var91 = (class89) field697.method8531()) {
                    if (var91.field1092) {
                        var91.field1092 = false;
                    } else {
                        method687(var91, true);
                    }
                }
                field550 = new class520(512);
                while (var3.field5344 < var83) {
                    int var92 = var3.method8801();
                    int var93 = var3.method8798();
                    int var94 = var3.method8798();
                    int var95 = var3.method8801();
                    for (int var96 = var93; var96 <= var94; var96++) {
                        long var97 = ((long) var92 << 32) + (long) var96;
                        field550.method8527(new class503(var95), var97);
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3525 == arg0.field1470) {
                int var99 = var3.method8828();
                int var100 = var3.method8913();
                String var101 = var3.method8806();
                if (var99 >= 1 && var99 <= 8) {
                    if (var101.equalsIgnoreCase(class378.field4097)) {
                        var101 = null;
                    }
                    field722[var99 - 1] = var101;
                    field645[var99 - 1] = var100 == 0;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3497 == arg0.field1470) {
                method6694();
                byte var102 = var3.method8797();
                if (arg0.field1465 == 1) {
                    if (var102 >= 0) {
                        field713[var102] = null;
                    } else {
                        Statics.field2052 = null;
                    }
                    arg0.field1470 = null;
                    return true;
                }
                if (var102 >= 0) {
                    field713[var102] = new class159(var3);
                } else {
                    Statics.field2052 = new class159(var3);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3471 == arg0.field1470) {
                boolean var103 = var3.method8804();
                if (!var103) {
                    Statics.field414 = null;
                } else if (Statics.field414 == null) {
                    Statics.field414 = new class398();
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3461 == arg0.field1470) {
                field785 = var3.method8796();
                if (field785 == 1) {
                    field611 = var3.method8798();
                }
                if (field785 >= 2 && field785 <= 6) {
                    if (field785 == 2) {
                        field557 = 64;
                        field535 = 64;
                    }
                    if (field785 == 3) {
                        field557 = 0;
                        field535 = 64;
                    }
                    if (field785 == 4) {
                        field557 = 128;
                        field535 = 64;
                    }
                    if (field785 == 5) {
                        field557 = 64;
                        field535 = 0;
                    }
                    if (field785 == 6) {
                        field557 = 64;
                        field535 = 128;
                    }
                    field785 = 2;
                    field770 = var3.method8798();
                    field555 = var3.method8798();
                    field556 = var3.method8796();
                }
                if (field785 == 10) {
                    field818 = var3.method8798();
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3404 == arg0.field1470) {
                int var104 = var3.method8845();
                int var105 = var3.method8837();
                byte var106 = var3.method8830();
                int var107 = var3.method8829();
                int var108 = var3.method8836();
                byte var109 = var3.method8965();
                int var110 = var3.method8828() * 4;
                int var111 = var3.method8836();
                int var112 = var3.method8913() * 4;
                int var113 = var3.method8896();
                int var114 = var3.method9002();
                int var115 = var114 >> 16;
                int var116 = var114 >> 8 & 0xFF;
                int var117 = (var114 >> 4 & 0x7) + var115;
                int var118 = (var114 & 0x7) + var116;
                int var119 = var109 + var117;
                int var120 = var106 + var118;
                if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104 && var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104 && var105 != 65535) {
                    int var121 = var117 * 128 + 64;
                    int var122 = var118 * 128 + 64;
                    int var123 = var119 * 128 + 64;
                    int var124 = var120 * 128 + 64;
                    class79 var125 = new class79(var105, Statics.field4624.field1349, var121, var122, method826(Statics.field4624, var121, var122, Statics.field4624.field1349) - var112, field821 + var113, field821 + var111, var107, var108, var104, var110);
                    var125.method2097(var123, var124, method826(Statics.field4624, var123, var124, Statics.field4624.field1349) - var110, field821 + var113);
                    Statics.field4624.field1352.method6829(var125);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3465 == arg0.field1470) {
                int var126 = var3.method8896();
                if (var126 == 65535) {
                    var126 = -1;
                }
                field783 = var126;
                this.method1709(false);
                method3308(var126);
                class73.method55(field783);
                for (int var127 = 0; var127 < 100; var127++) {
                    field657[var127] = true;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3481 == arg0.field1470) {
                method3597(class320.field3383);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3479 == arg0.field1470) {
                int var128 = var3.method8946();
                int var129 = var3.method8926();
                int var130 = var3.method8839();
                class358 var131 = Statics.field75.method5906(var128);
                if (var131.field3825 != var129 || var131.field3826 != var130 || var131.field3821 != 0 || var131.field3822 != 0) {
                    var131.field3825 = var129;
                    var131.field3826 = var130;
                    var131.field3821 = 0;
                    var131.field3822 = 0;
                    Statics.method5599(var131);
                    this.method1183(var131);
                    if (var131.field3894 == 0) {
                        method3068(Statics.field75.field3722[var128 >> 16], var131, false);
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3445 == arg0.field1470) {
                Statics.field243 = null;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3425 == arg0.field1470) {
                field692 = var3.method8896() * 30;
                field736 = field720;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3410 == arg0.field1470) {
                if (Statics.field243 == null) {
                    Statics.field243 = new class486(Statics.field492);
                }
                class555 var132 = Statics.field492.method8113(var3);
                Statics.field243.field5009.method8547(var132.field5409, var132.field5411);
                field707[++field728 - 1 & 0x1F] = var132.field5409;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3428 == arg0.field1470) {
                method3597(class320.field3384);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3444 == arg0.field1470) {
                for (int var133 = 0; var133 < Statics.field2004; var133++) {
                    class197 var134 = class197.method4446(var133);
                    if (var134 != null) {
                        class346.field3709[var133] = 0;
                        class346.field3710[var133] = 0;
                    }
                }
                method2383();
                field762 += 32;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3508 == arg0.field1470) {
                int var135 = var3.method8946();
                int var136 = var3.method8913();
                class358 var137 = Statics.field75.method5906(var135);
                class358.method6693(var137, Statics.field84.field1157.field3756, var136);
                Statics.method5599(var137);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3507 == arg0.field1470) {
                field539 = true;
                field795 = false;
                field789 = false;
                Statics.field939 = var3.method8796();
                Statics.field3708 = var3.method8796();
                Statics.field4881 = var3.method8798();
                Statics.field1506 = var3.method8796();
                Statics.field3968 = var3.method8796();
                if (Statics.field3968 >= 100) {
                    Statics.field3770 = Statics.field939 * 128 + 64;
                    Statics.field1498 = Statics.field3708 * 128 + 64;
                    Statics.field1848 = method826(Statics.field3967, Statics.field3770, Statics.field1498, Statics.field3967.field1349) - Statics.field4881;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3523 == arg0.field1470) {
                return this.method1210(arg0, 2);
            }
            if (class322.field3495 == arg0.field1470) {
                int var138 = var3.method8946();
                int var139 = var3.method8852();
                class358 var140 = Statics.field75.method5906(var138);
                if (var140.field3864 != var139 || var139 == -1) {
                    var140.field3864 = var139;
                    var140.field3951 = 0;
                    var140.field3952 = 0;
                    Statics.method5599(var140);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3429 == arg0.field1470) {
                method3595();
                arg0.field1470 = null;
                return false;
            }
            if (class322.field3438 == arg0.field1470) {
                Statics.field4624.field1337.method2643(var3, arg0.field1465);
                method3475();
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3468 == arg0.field1470) {
                method3597(class320.field3379);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3458 == arg0.field1470) {
                int var141 = var3.method8851();
                int var142 = var3.method8853();
                class358 var143 = Statics.field75.method5906(var142);
                class358.method2282(var143, var141);
                Statics.method5599(var143);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3435 == arg0.field1470) {
                int var144 = var3.method8960();
                int var145 = var144 >> 16;
                int var146 = var144 >> 8 & 0xFF;
                int var147 = (var144 >> 4 & 0x7) + var145;
                int var148 = (var144 & 0x7) + var146;
                int var149 = var3.method8896();
                int var150 = var3.method8829();
                int var151 = var3.method8836();
                if (var147 >= 0 && var148 >= 0 && var147 < Statics.field4624.field1347 && var148 < Statics.field4624.field1331) {
                    int var152 = var147 * 128 + 64;
                    int var153 = var148 * 128 + 64;
                    class74 var154 = new class74(var151, Statics.field4624.field1349, var152, var153, method826(Statics.field4624, var152, var153, Statics.field4624.field1349) - var150, var149, field821);
                    Statics.field4624.field1353.method6829(var154);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3510 == arg0.field1470) {
                field539 = true;
                field795 = false;
                field789 = true;
                Statics.field939 = var3.method8796();
                Statics.field3708 = var3.method8796();
                int var155 = var3.method8798();
                int var156 = var3.method8798();
                field791 = var3.method8804();
                int var157 = var3.method8796();
                int var158 = Statics.field939 * 128 + 64;
                int var159 = Statics.field3708 * 128 + 64;
                boolean var160 = false;
                boolean var161 = false;
                int var162;
                int var163;
                if (field791) {
                    var162 = Statics.field1848;
                    var163 = method826(Statics.field3967, var158, var159, Statics.field3967.field1349) - var155;
                } else {
                    var162 = method826(Statics.field3967, Statics.field3770, Statics.field1498, Statics.field3967.field1349) - Statics.field1848;
                    var163 = var155;
                }
                field792 = new class509(Statics.field3770, Statics.field1498, var162, var158, var159, var163, var156, var157);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3489 == arg0.field1470) {
                int var164 = var3.method8796();
                if (var3.method8796() == 0) {
                    field574[var164] = new class396();
                    var3.field5344 += 18;
                } else {
                    var3.field5344--;
                    field574[var164] = new class396(var3, false);
                }
                field734 = field720;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3421 == arg0.field1470) {
                method2383();
                int var165 = var3.method8796();
                int var166 = var3.method8946();
                int var167 = var3.method8913();
                int var168 = var3.method8913();
                field668[var168] = var166;
                field538[var168] = var167;
                field667[var168] = 1;
                field670[var168] = var165;
                for (int var169 = 0; var169 < 98; var169++) {
                    if (var166 >= class368.field4020[var169]) {
                        field667[var168] = var169 + 2;
                    }
                }
                field725[++field726 - 1 & 0x1F] = var168;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3529 == arg0.field1470) {
                Statics.field4624.field1345 = 0;
                Statics.field4624.field1335 = 0;
                for (int var170 = 0; var170 < 65536; var170++) {
                    Statics.field4624.field1344[var170] = null;
                }
                for (int var171 = 0; var171 < 2048; var171++) {
                    Statics.field4624.field1348[var171] = null;
                }
                Statics.field84.field1135 = Statics.field3967;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3418 == arg0.field1470) {
                int var172 = var3.method8801();
                int var173 = var3.method8851();
                class89 var174 = (class89) field697.method8528((long) var173);
                class89 var175 = (class89) field697.method8528((long) var172);
                if (var175 != null) {
                    method687(var175, var174 == null || var174.field1090 != var175.field1090);
                }
                if (var174 != null) {
                    var174.method8189();
                    field697.method8527(var174, (long) var172);
                }
                class358 var176 = Statics.field75.method5906(var173);
                if (var176 != null) {
                    Statics.method5599(var176);
                }
                class358 var177 = Statics.field75.method5906(var172);
                if (var177 != null) {
                    Statics.method5599(var177);
                    method3068(Statics.field75.field3722[var177.field3815 >>> 16], var177, true);
                }
                if (field783 != -1) {
                    method2795(field783, 1);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3506 == arg0.field1470) {
                for (int var178 = 0; var178 < class346.field3710.length; var178++) {
                    if (class346.field3710[var178] != class346.field3709[var178]) {
                        class346.field3710[var178] = class346.field3709[var178];
                        method3070(var178);
                        field721[++field762 - 1 & 0x1F] = var178;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3424 == arg0.field1470) {
                String var179 = var3.method8806();
                long var180 = (long) var3.method8798();
                long var182 = (long) var3.method8790();
                class381 var184 = (class381) class401.method2027(class381.method2635(), var3.method8796());
                long var185 = (var180 << 32) + var182;
                boolean var187 = false;
                for (int var188 = 0; var188 < 100; var188++) {
                    if (field773[var188] == var185) {
                        var187 = true;
                        break;
                    }
                }
                if (Statics.field182.method1803(new class568(var179, Statics.field2521))) {
                    var187 = true;
                }
                if (!var187 && field651 == 0) {
                    field773[field763] = var185;
                    field763 = (field763 + 1) % 100;
                    String var189 = class435.method7464(class415.method6484(class361.method5598(var3)));
                    byte var190;
                    if (var184.field4432) {
                        var190 = 7;
                    } else {
                        var190 = 3;
                    }
                    if (var184.field4427 == -1) {
                        class114.method2802(var190, var179, var189);
                    } else {
                        class114.method2802(var190, class105.method5596(var184.field4427) + var179, var189);
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3416 == arg0.field1470) {
                field539 = true;
                field795 = false;
                field790 = true;
                Statics.field3270 = var3.method8796();
                Statics.field3134 = var3.method8796();
                Statics.field1503 = var3.method8798();
                int var191 = var3.method8798();
                int var192 = var3.method8796();
                int var193 = Statics.field3270 * 128 + 64;
                int var194 = Statics.field3134 * 128 + 64;
                int var195 = method826(Statics.field3967, var193, var194, Statics.field3967.field1349) - Statics.field1503;
                int var196 = var193 - Statics.field3770;
                int var197 = var195 - Statics.field1848;
                int var198 = var194 - Statics.field1498;
                double var199 = Math.sqrt((double) (var196 * var196 + var198 * var198));
                int var201 = Statics.method5380((int) (Math.atan2((double) var197, var199) * 325.9490051269531D) & 0x7FF);
                int var202 = method162((int) (Math.atan2((double) var196, (double) var198) * -325.9490051269531D) & 0x7FF);
                field794 = new class510(Statics.field1255, var201, var191, var192);
                field793 = new class510(Statics.field2100, var202, var191, var192);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3493 == arg0.field1470) {
                int var203 = var3.method8801();
                class89 var204 = (class89) field697.method8528((long) var203);
                if (var204 != null) {
                    method687(var204, true);
                }
                if (field576 != null) {
                    Statics.method5599(field576);
                    field576 = null;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3526 == arg0.field1470) {
                Statics.field297 = var3.method8796();
                Statics.field1563 = var3.method8796();
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3530 == arg0.field1470) {
                int var205 = var3.method8896();
                class94 var206;
                if (field689 == var205) {
                    var206 = Statics.field84;
                } else {
                    var206 = Statics.field4624.field1342[var205];
                }
                int var207 = var3.method8837();
                int var208 = var3.method8796();
                int var209 = var3.method8853();
                if (var206 != null) {
                    var206.method2328(var208, var207, var209 >> 16, var209 & 0xFFFF);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3411 == arg0.field1470) {
                method6694();
                byte var210 = var3.method8797();
                class151 var211 = new class151(var3);
                class159 var212;
                if (var210 >= 0) {
                    var212 = field713[var210];
                } else {
                    var212 = Statics.field2052;
                }
                if (var212 == null) {
                    this.method1187(var210);
                    arg0.field1470 = null;
                    return true;
                }
                if (var211.field1707 > var212.field1764) {
                    this.method1187(var210);
                    arg0.field1470 = null;
                    return true;
                }
                if (var211.field1707 < var212.field1764) {
                    arg0.field1470 = null;
                    return true;
                }
                var211.method3084(var212);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3422 == arg0.field1470) {
                byte var213 = var3.method8797();
                long var214 = (long) var3.method8798();
                long var216 = (long) var3.method8790();
                long var218 = (var214 << 32) + var216;
                boolean var220 = false;
                class168 var221 = var213 >= 0 ? field727[var213] : Statics.field4608;
                if (var221 == null) {
                    var220 = true;
                } else {
                    for (int var222 = 0; var222 < 100; var222++) {
                        if (field773[var222] == var218) {
                            var220 = true;
                            break;
                        }
                    }
                }
                if (!var220) {
                    field773[field763] = var218;
                    field763 = (field763 + 1) % 100;
                    String var223 = class361.method5598(var3);
                    int var224 = var213 >= 0 ? 43 : 46;
                    class114.method8180(var224, "", var223, var221.field1828);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3515 == arg0.field1470) {
                return this.method1210(arg0, 1);
            }
            if (class322.field3401 == arg0.field1470) {
                byte[] var225 = new byte[arg0.field1465];
                var3.method8732(var225, 0, var225.length);
                class546 var226 = new class546(var225);
                String var227 = var226.method8806();
                class32.method6508(var227, true, false);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3450 == arg0.field1470) {
                int var228 = var3.method8796();
                method8017(var228);
                arg0.field1470 = null;
                return false;
            }
            if (class322.field3469 == arg0.field1470) {
                int var229 = var3.method8829();
                int var230 = var3.method8946();
                int var231 = var3.method8828();
                class358 var232 = Statics.field75.method5906(var230);
                class358.method4157(var232, var229, var231);
                Statics.method5599(var232);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3474 == arg0.field1470) {
                Statics.field182.method1806(var3, arg0.field1465);
                field730 = field720;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3437 == arg0.field1470) {
                field539 = true;
                field795 = false;
                field790 = true;
                int var233 = method162(var3.method8926() & 0x7EB);
                int var234 = Statics.method5380(var3.method8926() & 0x7EB);
                int var235 = var3.method8798();
                int var236 = var3.method8796();
                field794 = new class510(Statics.field1255, var234, var235, var236);
                field793 = new class510(Statics.field2100, var233, var235, var236);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3486 == arg0.field1470) {
                field640 = var3.method8913();
                field759 = var3.method8913();
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3464 == arg0.field1470) {
                Statics.field5181 = Statics.method2601(var3.method8796());
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3451 == arg0.field1470) {
                byte var237 = var3.method8797();
                int var238 = var3.method8798();
                class346.field3709[var238] = var237;
                if (class346.field3710[var238] != var237) {
                    class346.field3710[var238] = var237;
                }
                method3070(var238);
                field721[++field762 - 1 & 0x1F] = var238;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3442 == arg0.field1470) {
                int var239 = var3.method8801();
                int var240 = var3.method8798();
                if (var239 < -70000) {
                    var240 += 32768;
                }
                class358 var241;
                if (var239 >= 0) {
                    var241 = Statics.field75.method5906(var239);
                } else {
                    var241 = null;
                }
                if (var241 != null) {
                    for (int var242 = 0; var242 < var241.field3947.length; var242++) {
                        var241.field3947[var242] = 0;
                        var241.field3808[var242] = 0;
                    }
                }
                class87.method270(var240);
                int var243 = var3.method8798();
                for (int var244 = 0; var244 < var243; var244++) {
                    int var245 = var3.method8896();
                    int var246 = var3.method8828();
                    if (var246 == 255) {
                        var246 = var3.method8946();
                    }
                    if (var241 != null && var244 < var241.field3947.length) {
                        var241.field3947[var244] = var245;
                        var241.field3808[var244] = var246;
                    }
                    class87.method3992(var240, var244, var245 - 1, var246);
                }
                if (var241 != null) {
                    Statics.method5599(var241);
                }
                method2383();
                field798[++field724 - 1 & 0x1F] = var240 & 0x7FFF;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3414 == arg0.field1470) {
                int var247 = var3.method8798();
                int var248 = var3.method8796();
                int var249 = var3.method8798();
                method7696(var247, var248, var249);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3453 == arg0.field1470) {
                String var250 = var3.method8806();
                long var251 = var3.method8802();
                long var253 = (long) var3.method8798();
                long var255 = (long) var3.method8790();
                class381 var257 = (class381) class401.method2027(class381.method2635(), var3.method8796());
                long var258 = (var253 << 32) + var255;
                boolean var260 = false;
                for (int var261 = 0; var261 < 100; var261++) {
                    if (field773[var261] == var258) {
                        var260 = true;
                        break;
                    }
                }
                if (var257.field4422 && Statics.field182.method1803(new class568(var250, Statics.field2521))) {
                    var260 = true;
                }
                if (!var260 && field651 == 0) {
                    field773[field763] = var258;
                    field763 = (field763 + 1) % 100;
                    String var262 = class435.method7464(class415.method6484(class361.method5598(var3)));
                    if (var257.field4427 == -1) {
                        class114.method8180(9, var250, var262, class417.method3190(var251));
                    } else {
                        class114.method8180(9, class105.method5596(var257.field4427) + var250, var262, class417.method3190(var251));
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3509 == arg0.field1470) {
                method3597(class320.field3386);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3412 == arg0.field1470) {
                int var263 = var3.method8796();
                Statics.method5369(var263);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3430 == arg0.field1470) {
                int var264 = var3.method8801();
                int var265 = var3.method8798();
                if (var264 < -70000) {
                    var265 += 32768;
                }
                class358 var266;
                if (var264 >= 0) {
                    var266 = Statics.field75.method5906(var264);
                } else {
                    var266 = null;
                }
                while (var3.field5344 < arg0.field1465) {
                    int var267 = var3.method8810();
                    int var268 = var3.method8798();
                    int var269 = 0;
                    if (var268 != 0) {
                        var269 = var3.method8796();
                        if (var269 == 255) {
                            var269 = var3.method8801();
                        }
                    }
                    if (var266 != null && var267 >= 0 && var267 < var266.field3947.length) {
                        var266.field3947[var267] = var268;
                        var266.field3808[var267] = var269;
                    }
                    class87.method3992(var265, var267, var268 - 1, var269);
                }
                if (var266 != null) {
                    Statics.method5599(var266);
                }
                method2383();
                field798[++field724 - 1 & 0x1F] = var265 & 0x7FFF;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3518 == arg0.field1470) {
                int var270 = var3.method8796();
                int var271 = var270 >> 2;
                int var272 = var270 & 0x3;
                int var273 = field605[var271];
                int var274 = var3.method8836();
                int var275 = var3.method9002();
                int var276 = var275 >> 16;
                int var277 = var275 >> 8 & 0xFF;
                int var278 = (var275 >> 4 & 0x7) + var276;
                int var279 = (var275 & 0x7) + var277;
                if (var278 >= 0 && var279 >= 0 && var278 < 103 && var279 < 103) {
                    method8474(var278, var279, var271, var272, var273, var274);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3488 == arg0.field1470) {
                int var280 = var3.method8837();
                int var281 = var3.method8801();
                class358 var282 = Statics.field75.method5906(var281);
                if (var282.field3931 != 6 || var282.field3861 != var280) {
                    var282.field3931 = 6;
                    var282.field3861 = var280;
                    Statics.method5599(var282);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3516 == arg0.field1470) {
                int var283 = var3.method8851();
                int var284 = var3.method8828();
                int var285 = var3.method8896();
                class104 var286 = Statics.field4624.field1344[var285];
                int var287 = var3.method8798();
                if (var286 != null) {
                    var286.method2328(var284, var287, var283 >> 16, var283 & 0xFFFF);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3498 == arg0.field1470) {
                method7269(false, arg0.field1468);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3413 == arg0.field1470) {
                boolean var288 = var3.method8828() == 1;
                int var289 = var3.method8801();
                class358 var290 = Statics.field75.method5906(var289);
                if (var290.field3914 != var288) {
                    var290.field3914 = var288;
                    Statics.method5599(var290);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3485 == arg0.field1470) {
                int var291 = var3.method8836();
                if (var291 == 65535) {
                    var291 = -1;
                }
                method370(var291);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3512 == arg0.field1470) {
                int var292 = var3.method8837();
                if (var292 == 65535) {
                    var292 = -1;
                }
                int var293 = var3.method9002();
                method410(var292, var293);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3500 == arg0.field1470) {
                int var294 = var3.method8896();
                int var295 = var3.method8851();
                class358 var296 = Statics.field75.method5906(var295);
                if (var296.field3931 != 1 || var296.field3861 != var294) {
                    var296.field3931 = 1;
                    var296.field3861 = var294;
                    Statics.method5599(var296);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3492 == arg0.field1470) {
                int var297 = var3.method8946();
                class358 var298 = Statics.field75.method5906(var297);
                var298.field3931 = 3;
                var298.field3861 = Statics.field84.field1157.method5945();
                Statics.method5599(var298);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3440 == arg0.field1470) {
                method2428(Statics.field4624, false, var3);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3511 == arg0.field1470) {
                class37.method2669(var3, arg0.field1465);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3452 == arg0.field1470) {
                int var299 = var3.method8801();
                int var300 = var3.method8801();
                int var301 = class35.method3568();
                class321 var302 = class321.method3542(class319.field3286, field591.field1467);
                var302.field3393.method8887(field195);
                var302.field3393.method8981(var299);
                var302.field3393.method8849(var300);
                var302.field3393.method8779(var301);
                field591.method2745(var302);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3443 == arg0.field1470) {
                var3.field5344 += 28;
                if (var3.method8936()) {
                    method2128(var3, var3.field5344 - 28);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3447 == arg0.field1470) {
                method3597(class320.field3376);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3420 == arg0.field1470) {
                method2383();
                field703 = var3.method8926();
                field736 = field720;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3517 == arg0.field1470) {
                String var303 = var3.method8806();
                Object[] var304 = new Object[var303.length() + 1];
                for (int var305 = var303.length() - 1; var305 >= 0; var305--) {
                    if (var303.charAt(var305) == 's') {
                        var304[var305 + 1] = var3.method8806();
                    } else {
                        var304[var305 + 1] = Integer.valueOf(var3.method8801());
                    }
                }
                var304[0] = Integer.valueOf(var3.method8801());
                class90 var306 = new class90();
                var306.field1103 = var304;
                class73.method6486(var306);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3462 == arg0.field1470) {
                method7269(true, arg0.field1468);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3528 == arg0.field1470) {
                int var307 = var3.method8837();
                int var308 = var3.method8851();
                int var309 = var3.method8798();
                class358 var310 = Statics.field75.method5906(var308);
                var310.field3873 = (var307 << 16) + var309;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3441 == arg0.field1470) {
                int var311 = var3.method8837();
                class87.method7840(var311);
                field798[++field724 - 1 & 0x1F] = var311 & 0x7FFF;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3491 == arg0.field1470) {
                int var312 = var3.method8796();
                int var313 = var3.method8798();
                int var314 = var3.method8796();
                if (var312 == 0) {
                    Statics.field3967.field1349 = var314;
                    Statics.field4624 = Statics.field3967;
                } else if (var312 == 1) {
                    class476 var315 = Statics.field3967.field1348[var313];
                    var315.field4948.field1349 = var314;
                    Statics.field4624 = var315.field4948;
                } else {
                    throw new RuntimeException("Don't know what world we're about to receive updates for, this is bad");
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3439 == arg0.field1470) {
                method3597(class320.field3378);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3520 == arg0.field1470 && field539) {
                field795 = true;
                field790 = false;
                field789 = false;
                for (int var316 = 0; var316 < 5; var316++) {
                    field599[var316] = false;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3409 == arg0.field1470) {
                method3597(class320.field3381);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3476 == arg0.field1470) {
                int var317 = var3.method8836();
                int var318 = var3.method8801();
                class358 var319 = Statics.field75.method5906(var318);
                if (var319 != null && var319.field3894 == 0) {
                    if (var317 > var319.field3840 - var319.field3875) {
                        var317 = var319.field3840 - var319.field3875;
                    }
                    if (var317 < 0) {
                        var317 = 0;
                    }
                    if (var319.field3838 != var317) {
                        var319.field3838 = var317;
                        Statics.method5599(var319);
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3532 == arg0.field1470) {
                String var320 = var3.method8806();
                int var321 = var3.method8853();
                class358 var322 = Statics.field75.method5906(var321);
                if (!var320.equals(var322.field3879)) {
                    var322.field3879 = var320;
                    Statics.method5599(var322);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3473 == arg0.field1470) {
                int var323 = var3.method8798();
                int var324 = var3.method8829();
                if (var323 == 65535) {
                    var323 = -1;
                }
                method3179(Statics.field84, var323, var324);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3504 == arg0.field1470) {
                field544++;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3527 == arg0.field1470) {
                int var325 = var3.method8810();
                boolean var326 = var3.method8796() == 1;
                String var327 = "";
                boolean var328 = false;
                if (var326) {
                    var327 = var3.method8806();
                    if (Statics.field182.method1803(new class568(var327, Statics.field2521))) {
                        var328 = true;
                    }
                }
                String var329 = var3.method8806();
                if (!var328) {
                    class114.method2802(var325, var327, var329);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3459 == arg0.field1470) {
                int var330 = var3.method8853();
                int var331 = var3.method8836();
                int var332 = var331 >> 10 & 0x1F;
                int var333 = var331 >> 5 & 0x1F;
                int var334 = var331 & 0x1F;
                int var335 = (var334 << 3) + (var332 << 19) + (var333 << 11);
                class358 var336 = Statics.field75.method5906(var330);
                if (var336.field3841 != var335) {
                    var336.field3841 = var335;
                    Statics.method5599(var336);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3521 == arg0.field1470) {
                byte var337 = var3.method8797();
                String var338 = var3.method8806();
                long var339 = (long) var3.method8798();
                long var341 = (long) var3.method8790();
                class381 var343 = (class381) class401.method2027(class381.method2635(), var3.method8796());
                long var344 = (var339 << 32) + var341;
                boolean var346 = false;
                Object var347 = null;
                class168 var348 = var337 >= 0 ? field727[var337] : Statics.field4608;
                if (var348 == null) {
                    var346 = true;
                } else {
                    int var349 = 0;
                    while (true) {
                        if (var349 >= 100) {
                            if (var343.field4422 && Statics.field182.method1803(new class568(var338, Statics.field2521))) {
                                var346 = true;
                            }
                            break;
                        }
                        if (field773[var349] == var344) {
                            var346 = true;
                            break;
                        }
                        var349++;
                    }
                }
                if (!var346) {
                    field773[field763] = var344;
                    field763 = (field763 + 1) % 100;
                    String var350 = class435.method7464(class361.method5598(var3));
                    int var351 = var337 >= 0 ? 41 : 44;
                    if (var343.field4427 == -1) {
                        class114.method8180(var351, var338, var350, var348.field1828);
                    } else {
                        class114.method8180(var351, class105.method5596(var343.field4427) + var338, var350, var348.field1828);
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3457 == arg0.field1470) {
                int var352 = var3.method8836();
                int var353 = var3.method8896();
                int var354 = var3.method8798();
                int var355 = var3.method8946();
                class358 var356 = Statics.field75.method5906(var355);
                if (var356.field3868 != var354 || var356.field3953 != var353 || var356.field3871 != var352) {
                    var356.field3868 = var354;
                    var356.field3953 = var353;
                    var356.field3871 = var352;
                    Statics.method5599(var356);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3503 == arg0.field1470) {
                int var357 = var3.method8896();
                int var358 = var3.method8836();
                int var359 = var3.method8836();
                int var360 = var3.method8837();
                if (var360 == 65535) {
                    var360 = -1;
                }
                int var361 = var3.method8836();
                if (var361 == 65535) {
                    var361 = -1;
                }
                int var362 = var3.method8798();
                ArrayList var363 = new ArrayList();
                var363.add(var361);
                var363.add(var360);
                method303(var363, var358, var362, var357, var359);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3454 == arg0.field1470) {
                method7592(Statics.field4624, var3);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3472 == arg0.field1470) {
                Statics.field97 = var3.method8913();
                field754 = var3.method8829();
                Statics.field3545 = var3.method8796();
                for (int var364 = Statics.field97; var364 < Statics.field97 + 8; var364++) {
                    for (int var365 = Statics.field3545; var365 < Statics.field3545 + 8; var365++) {
                        if (Statics.field4624.field1350[field754][var364][var365] != null) {
                            Statics.field4624.field1350[field754][var364][var365] = null;
                            method5921(field754, var364, var365);
                        }
                    }
                }
                for (class97 var366 = (class97) Statics.field4624.field1343.method6834(); var366 != null; var366 = (class97) Statics.field4624.field1343.method6842()) {
                    if (var366.field1193 >= Statics.field97 && var366.field1193 < Statics.field97 + 8 && var366.field1197 >= Statics.field3545 && var366.field1197 < Statics.field3545 + 8 && field754 == var366.field1201) {
                        var366.field1204 = 0;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3475 == arg0.field1470) {
                field779 = var3.method8796();
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3423 == arg0.field1470) {
                Statics.field243 = new class486(Statics.field492);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3405 == arg0.field1470) {
                int var367 = var3.method8896();
                int var368 = var3.method8913();
                short var369 = (short) var3.method8852();
                int var370 = var3.method8801();
                class104 var371 = Statics.field4624.field1344[var367];
                if (var371 != null) {
                    var371.method2544(var368, var370, var369);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3426 == arg0.field1470) {
                Statics.field97 = var3.method8829();
                Statics.field3545 = var3.method8828();
                field754 = var3.method8913();
                while (var3.field5344 < arg0.field1465) {
                    int var372 = var3.method8796();
                    class320 var373 = class320.method420()[var372];
                    method3597(var373);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3514 == arg0.field1470) {
                method2428(Statics.field4624, true, var3);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3470 == arg0.field1470) {
                Statics.field182.field854.method7797(var3, arg0.field1465);
                method2221();
                field730 = field720;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3433 == arg0.field1470) {
                int var374 = var3.method8837();
                if (var374 == 65535) {
                    var374 = -1;
                }
                int var375 = var3.method8836();
                if (var375 == 65535) {
                    var375 = -1;
                }
                int var376 = var3.method8946();
                int var377 = var3.method8851();
                for (int var378 = var374; var378 <= var375; var378++) {
                    long var379 = ((long) var377 << 32) + (long) var378;
                    class504 var381 = field550.method8528(var379);
                    if (var381 != null) {
                        var381.method8189();
                    }
                    field550.method8527(new class503(var376), var379);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3415 == arg0.field1470) {
                return this.method1198(arg0);
            }
            if (class322.field3531 == arg0.field1470) {
                field746 = field720;
                byte var382 = var3.method8797();
                if (arg0.field1465 == 1) {
                    if (var382 >= 0) {
                        field727[var382] = null;
                    } else {
                        Statics.field4608 = null;
                    }
                    arg0.field1470 = null;
                    return true;
                }
                if (var382 >= 0) {
                    field727[var382] = new class168(var3);
                } else {
                    Statics.field4608 = new class168(var3);
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3434 == arg0.field1470) {
                method3597(class320.field3388);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3402 == arg0.field1470) {
                int var383 = var3.method8853();
                class358 var384 = Statics.field75.method5906(var383);
                for (int var385 = 0; var385 < var384.field3947.length; var385++) {
                    var384.field3947[var385] = -1;
                    var384.field3947[var385] = 0;
                }
                Statics.method5599(var384);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3466 == arg0.field1470) {
                method2383();
                field702 = var3.method8798();
                field736 = field720;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3463 == arg0.field1470) {
                int var386 = var3.method8896();
                int var387 = var3.method8837();
                class330.method6481(var387, var386);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3432 == arg0.field1470) {
                method3597(class320.field3389);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3449 == arg0.field1470) {
                method2741(var3.method8806());
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3407 == arg0.field1470) {
                field746 = field720;
                byte var388 = var3.method8797();
                class165 var389 = new class165(var3);
                class168 var390;
                if (var388 >= 0) {
                    var390 = field727[var388];
                } else {
                    var390 = Statics.field4608;
                }
                if (var390 == null) {
                    this.method1186(var388);
                    arg0.field1470 = null;
                    return true;
                }
                if (var389.field1807 > var390.field1827) {
                    this.method1186(var388);
                    arg0.field1470 = null;
                    return true;
                }
                if (var389.field1807 < var390.field1827) {
                    arg0.field1470 = null;
                    return true;
                }
                var389.method3182(var390);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3482 == arg0.field1470) {
                field539 = true;
                field795 = false;
                field790 = false;
                Statics.field3270 = var3.method8796();
                Statics.field3134 = var3.method8796();
                Statics.field1503 = var3.method8798();
                Statics.field1451 = var3.method8796();
                Statics.field3032 = var3.method8796();
                if (Statics.field3032 >= 100) {
                    int var391 = Statics.field3270 * 128 + 64;
                    int var392 = Statics.field3134 * 128 + 64;
                    int var393 = method826(Statics.field3967, var391, var392, Statics.field3967.field1349) - Statics.field1503;
                    int var394 = var391 - Statics.field3770;
                    int var395 = var393 - Statics.field1848;
                    int var396 = var392 - Statics.field1498;
                    int var397 = (int) Math.sqrt((double) (var394 * var394 + var396 * var396));
                    Statics.field1255 = (int) (Math.atan2((double) var395, (double) var397) * 325.9490051269531D) & 0x7FF;
                    Statics.field2100 = (int) (Math.atan2((double) var394, (double) var396) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field1255 < 128) {
                        Statics.field1255 = 128;
                    }
                    if (Statics.field1255 > 383) {
                        Statics.field1255 = 383;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3513 == arg0.field1470) {
                Statics.method1078(Statics.field4624, var3);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3505 == arg0.field1470) {
                Statics.field97 = var3.method8913();
                field754 = var3.method8829();
                Statics.field3545 = var3.method8796();
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3524 == arg0.field1470) {
                method3597(class320.field3380);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3499 == arg0.field1470) {
                method2383();
                int var398 = var3.method8913();
                int var399 = var3.method8828();
                int var400 = var3.method8946();
                field668[var398] = var400;
                field538[var398] = var399;
                field667[var398] = 1;
                field670[var398] = var399;
                for (int var401 = 0; var401 < 98; var401++) {
                    if (var400 >= class368.field4020[var401]) {
                        field667[var398] = var401 + 2;
                    }
                }
                field725[++field726 - 1 & 0x1F] = var398;
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3455 == arg0.field1470) {
                class70 var402 = new class70();
                var402.field842 = var3.method8806();
                var402.field839 = var3.method8798();
                int var403 = var3.method8801();
                var402.field846 = var403;
                if (var402.method1743()) {
                    var402.field833 = "beta";
                    Statics.field903 = true;
                } else {
                    Statics.field903 = false;
                }
                Statics.method2625(45);
                var2.method8024();
                Object var404 = null;
                class78.method8255(var402);
                arg0.field1470 = null;
                return false;
            }
            if (class322.field3448 == arg0.field1470) {
                field777 = var3.method8796();
                if (field777 == 255) {
                    field777 = 0;
                }
                field637 = var3.method8796();
                if (field637 == 255) {
                    field637 = 0;
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3478 == arg0.field1470) {
                int var405 = var3.method8828();
                int var406 = var3.method8837();
                int var407 = var3.method8946();
                class89 var408 = (class89) field697.method8528((long) var407);
                if (var408 != null) {
                    method687(var408, var408.field1090 != var406);
                }
                method5047(var407, var406, var405);
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3417 == arg0.field1470) {
                for (int var409 = 0; var409 < Statics.field4624.field1342.length; var409++) {
                    if (Statics.field4624.field1342[var409] != null) {
                        Statics.field4624.field1342[var409].field1224 = -1;
                    }
                }
                for (int var410 = 0; var410 < Statics.field4624.field1344.length; var410++) {
                    if (Statics.field4624.field1344[var410] != null) {
                        Statics.field4624.field1344[var410].field1224 = -1;
                    }
                }
                arg0.field1470 = null;
                return true;
            }
            if (class322.field3484 == arg0.field1470) {
                int var411 = var3.method8837();
                int var412 = var3.method8946();
                class346.field3709[var411] = var412;
                if (class346.field3710[var411] != var412) {
                    class346.field3710[var411] = var412;
                }
                method3070(var411);
                field721[++field762 - 1 & 0x1F] = var411;
                arg0.field1470 = null;
                return true;
            }
            class571.method8083("" + (arg0.field1470 == null ? -1 : arg0.field1470.field3427) + class105.field1370 + (arg0.field1476 == null ? -1 : arg0.field1476.field3427) + class105.field1370 + (arg0.field1477 == null ? -1 : arg0.field1477.field3427) + class105.field1370 + arg0.field1465, (Throwable) null);
            method3595();
        } catch (IOException var417) {
            method5577();
        } catch (Exception var418) {
            String var415 = "" + (arg0.field1470 == null ? -1 : arg0.field1470.field3427) + class105.field1370 + (arg0.field1476 == null ? -1 : arg0.field1476.field3427) + class105.field1370 + (arg0.field1477 == null ? -1 : arg0.field1477.field3427) + class105.field1370 + arg0.field1465 + class105.field1370 + (Statics.field3967.field1338 + Statics.field84.field1230[0]) + class105.field1370 + (Statics.field3967.field1334 + Statics.field84.field1277[0]) + class105.field1370;
            for (int var416 = 0; var416 < arg0.field1465 && var416 < 50; var416++) {
                var415 = var415 + var3.field5346[var416] + class105.field1370;
            }
            class571.method8083(var415, var418);
            method3595();
        }
        return true;
    }

    @ObfuscatedName("ho.kw(Lmn;I)V")
    public static final void method3597(class320 arg0) {
        class545 var1 = field591.field1468;
        if (class320.field3385 == arg0) {
            int var2 = var1.method8828();
            int var3 = (var2 >> 4 & 0x7) + Statics.field97;
            int var4 = (var2 & 0x7) + Statics.field3545;
            int var5 = var1.method8913() & 0x1F;
            int var6 = var1.method8796();
            int var7 = var1.method8828();
            int var8 = var1.method8913();
            int var9 = var1.method8836();
            if (var3 >= 0 && var4 >= 0 && var3 < Statics.field4624.field1347 && var4 < Statics.field4624.field1331) {
                int var10 = var5 + 1;
                if (Statics.field84.field1230[0] >= var3 - var10 && Statics.field84.field1230[0] <= var3 + var10 && Statics.field84.field1277[0] >= var4 - var10 && Statics.field84.field1277[0] <= var4 + var10 && Statics.field4879.method2437() != 0 && var8 > 0 && field693 < 50) {
                    field782[field693] = var9;
                    field787[field693] = null;
                    field554[field693] = (var3 << 16) + (var4 << 8) + var5;
                    field606[field693] = var8;
                    field784[field693] = var7;
                    field786[field693] = var6;
                    field693++;
                }
            }
            return;
        }
        if (class320.field3383 == arg0) {
            byte var11 = var1.method8830();
            int var12 = var1.method8837();
            int var13 = var1.method8837();
            byte var14 = var1.method8831();
            int var15 = var1.method8837();
            int var16 = var1.method8796();
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = field605[var17];
            byte var20 = var1.method8965();
            int var21 = var1.method8913();
            int var22 = (var21 >> 4 & 0x7) + Statics.field97;
            int var23 = (var21 & 0x7) + Statics.field3545;
            int var24 = var1.method8896();
            byte var25 = var1.method8830();
            class94 var26;
            if (field689 == var24) {
                var26 = Statics.field84;
            } else {
                var26 = Statics.field4624.field1342[var24];
            }
            if (var26 != null) {
                int var27 = field754 == -1 ? Statics.field4624.field1349 : field754;
                method3047(var27, var22, var23, var17, var18, var19, var12, var15, var13, var14, var20, var11, var25, var26);
            }
        }
        if (class320.field3376 == arg0) {
            int var28 = var1.method8796();
            int var29 = var1.method8913();
            int var30 = (var29 >> 4 & 0x7) + Statics.field97;
            int var31 = (var29 & 0x7) + Statics.field3545;
            int var32 = var1.method8913();
            int var33 = var32 >> 2;
            int var34 = var32 & 0x3;
            int var35 = field605[var33];
            int var36 = var1.method8837();
            if (var30 >= 0 && var31 >= 0 && var30 < Statics.field4624.field1347 && var31 < Statics.field4624.field1331) {
                int var37 = field754 == -1 ? Statics.field4624.field1349 : field754;
                method3180(Statics.field4624, var37, var30, var31, var35, var36, var33, var34, var28, 0, -1);
            }
        } else if (class320.field3379 == arg0) {
            int var38 = var1.method8798();
            int var39 = var1.method8913();
            int var40 = (var39 >> 4 & 0x7) + Statics.field97;
            int var41 = (var39 & 0x7) + Statics.field3545;
            int var42 = var1.method8828();
            int var43 = var42 >> 2;
            int var44 = var42 & 0x3;
            int var45 = field605[var43];
            if (var40 >= 0 && var41 >= 0 && var40 < 103 && var41 < 103) {
                int var46 = field754 == -1 ? Statics.field4624.field1349 : field754;
                class97 var47 = method3330(Statics.field4624, var46, var40, var41, var45);
                if (var47 != null) {
                    class224 var48 = class224.method3868(var47.field1194);
                    if (var48.field2316) {
                        var47.field1191 = var38;
                        return;
                    }
                }
                boolean var49 = method1077(var46, var40, var41, var43, var44, var45, var38);
                if (var49) {
                    return;
                }
                if (var47 != null) {
                    var47.field1191 = var38;
                }
            }
        } else if (class320.field3380 == arg0) {
            int var50 = var1.method8836();
            int var51 = var1.method8798();
            int var52 = var1.method8846();
            int var53 = var1.method8829();
            int var54 = var1.method8829() * 4;
            byte var55 = var1.method8831();
            int var56 = var1.method8846();
            int var57 = var1.method8828();
            int var58 = (var57 >> 4 & 0x7) + Statics.field97;
            int var59 = (var57 & 0x7) + Statics.field3545;
            int var60 = var1.method8828() * 4;
            int var61 = var1.method8798();
            int var62 = var1.method8798();
            byte var63 = var1.method8797();
            int var64 = var55 + var58;
            int var65 = var59 + var63;
            if (var58 >= 0 && var59 >= 0 && var58 < Statics.field4624.field1347 && var59 < Statics.field4624.field1331 && var64 >= 0 && var65 >= 0 && var64 < Statics.field4624.field1347 && var65 < Statics.field4624.field1331 && var51 != 65535) {
                int var66 = field754 == -1 ? Statics.field4624.field1349 : field754;
                method5520(var66, var58, var59, var64, var65, var52, var51, var54, var60, var62, var61, var53, var50, var56);
            }
        } else if (class320.field3384 == arg0) {
            int var67 = var1.method8829();
            int var68 = (var67 >> 4 & 0x7) + Statics.field97;
            int var69 = (var67 & 0x7) + Statics.field3545;
            int var70 = var1.method8853();
            int var71 = var1.method8896();
            int var72 = var1.method8853();
            if (var68 >= 0 && var69 >= 0 && var68 < Statics.field4624.field1347 && var69 < Statics.field4624.field1331) {
                int var73 = field754 == -1 ? Statics.field4624.field1349 : field754;
                method2981(var73, var68, var69, var71, var72, var70);
            }
        } else {
            if (class320.field3388 == arg0) {
                int var74 = var1.method8798();
                int var75 = var1.method8828();
                int var76 = var1.method8913();
                int var77 = (var76 >> 4 & 0x7) + Statics.field97;
                int var78 = (var76 & 0x7) + Statics.field3545;
                int var79 = Statics.field4624.field1349;
                if (var77 >= 0 && var78 >= 0 && var77 < Statics.field4624.field1347 && var78 < Statics.field4624.field1331) {
                    class406 var80 = Statics.field4624.field1350[var79][var77][var78];
                    if (var80 != null) {
                        for (class108 var81 = (class108) var80.method6834(); var81 != null; var81 = (class108) var80.method6842()) {
                            if ((var74 & 0x7FFF) == var81.field1401) {
                                var81.method2628(var75);
                                break;
                            }
                        }
                    }
                    if (var77 >= 0 && var78 >= 0 && var77 < Statics.field4624.field1347 && var78 < Statics.field4624.field1331) {
                        int var82 = field754 == -1 ? Statics.field4624.field1349 : field754;
                        method2999(var82, var77, var78, var74, var75);
                    }
                    return;
                }
            }
            if (class320.field3378 == arg0) {
                int var83 = var1.method8798();
                int var84 = var1.method8837();
                int var85 = var1.method8851();
                int var86 = var1.method8837();
                int var87 = var1.method8796();
                boolean var88 = var1.method8796() == 1;
                int var89 = var1.method8829();
                int var90 = (var89 >> 4 & 0x7) + Statics.field97;
                int var91 = (var89 & 0x7) + Statics.field3545;
                int var92 = var1.method8829();
                if (var90 >= 0 && var91 >= 0 && var90 < Statics.field4624.field1347 && var91 < Statics.field4624.field1331) {
                    int var93 = field754 == -1 ? Statics.field4624.field1349 : field754;
                    method5433(var93, var90, var91, var86, var85, var92, var83, var84, var87, var88);
                }
            } else if (class320.field3381 == arg0) {
                int var94 = var1.method8828();
                int var95 = var94 >> 2;
                int var96 = var94 & 0x3;
                int var97 = field605[var95];
                int var98 = var1.method8796();
                int var99 = (var98 >> 4 & 0x7) + Statics.field97;
                int var100 = (var98 & 0x7) + Statics.field3545;
                if (var99 >= 0 && var100 >= 0 && var99 < Statics.field4624.field1347 && var100 < Statics.field4624.field1331) {
                    int var101 = field754 == -1 ? Statics.field4624.field1349 : field754;
                    method3180(Statics.field4624, var101, var99, var100, var97, -1, var95, var96, 31, 0, -1);
                }
            } else if (class320.field3389 == arg0) {
                int var102 = var1.method8829();
                int var103 = (var102 >> 4 & 0x7) + Statics.field97;
                int var104 = (var102 & 0x7) + Statics.field3545;
                int var105 = var1.method8836();
                int var106 = var1.method8829();
                int var107 = var1.method8798();
                if (var103 >= 0 && var104 >= 0 && var103 < Statics.field4624.field1347 && var104 < Statics.field4624.field1331) {
                    int var108 = var103 * 128 + 64;
                    int var109 = var104 * 128 + 64;
                    int var110 = field754 == -1 ? Statics.field4624.field1349 : field754;
                    class74 var111 = new class74(var105, var110, var108, var109, method826(Statics.field4624, var108, var109, var110) - var106, var107, field821);
                    Statics.field4624.field1353.method6829(var111);
                }
            } else if (class320.field3386 == arg0) {
                int var112 = var1.method8829();
                int var113 = (var112 >> 4 & 0x7) + Statics.field97;
                int var114 = (var112 & 0x7) + Statics.field3545;
                int var115 = var1.method8853();
                int var116 = var1.method8896();
                int var117 = Statics.field4624.field1349;
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    int var118 = field754 == -1 ? var117 : field754;
                    method5896(var118, var113, var114, var116, var115);
                }
            }
        }
    }

    @ObfuscatedName("fa.ky(IIIIII)V")
    public static void method2999(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class406 var5 = Statics.field4624.field1350[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class108 var6 = (class108) var5.method6834(); var6 != null; var6 = (class108) var5.method6842()) {
            if ((arg3 & 0x7FFF) == var6.field1401) {
                var6.method2628(arg4);
                break;
            }
        }
    }

    @ObfuscatedName("fg.kz(IIIIIII)V")
    public static void method2981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class406 var6 = Statics.field4624.field1350[arg0][arg1][arg2];
        if (var6 == null) {
            return;
        }
        for (class108 var7 = (class108) var6.method6834(); var7 != null; var7 = (class108) var6.method6842()) {
            if ((arg3 & 0x7FFF) == var7.field1401 && var7.field1394 == arg4) {
                var7.field1394 = arg5;
                break;
            }
        }
        method5921(arg0, arg1, arg2);
    }

    @ObfuscatedName("fx.ks(IIIIIIIIIIIIILde;I)V")
    public static void method3047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class94 arg13) {
        class224 var14 = class224.method3868(arg6);
        int var15;
        int var16;
        if (arg4 == 1 || arg4 == 3) {
            var15 = var14.field2292;
            var16 = var14.field2291;
        } else {
            var15 = var14.field2291;
            var16 = var14.field2292;
        }
        int var17 = (var15 >> 1) + arg1;
        int var18 = (var15 + 1 >> 1) + arg1;
        int var19 = (var16 >> 1) + arg2;
        int var20 = (var16 + 1 >> 1) + arg2;
        int[][] var21 = Statics.field4624.field1340[arg0];
        int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
        int var23 = (arg1 << 7) + (var15 << 6);
        int var24 = (arg2 << 7) + (var16 << 6);
        class264 var25 = var14.method3895(arg3, arg4, var21, var23, var22, var24);
        if (var25 == null) {
            return;
        }
        method3180(Statics.field4624, arg0, arg1, arg2, arg5, -1, 0, 0, 31, arg7 + 1, arg8 + 1);
        arg13.field1144 = field821 + arg7;
        arg13.field1145 = field821 + arg8;
        arg13.field1159 = var25;
        arg13.field1146 = arg1 * 128 + var15 * 64;
        arg13.field1155 = arg2 * 128 + var16 * 64;
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
        arg13.field1156 = arg2 + arg10;
        arg13.field1141 = arg2 + arg12;
    }

    @ObfuscatedName("lw.ki(IIIIIIIIIIIIIII)V")
    public static void method5520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg1 * 128 + 64;
        int var15 = arg2 * 128 + 64;
        int var16 = arg3 * 128 + 64;
        int var17 = arg4 * 128 + 64;
        class79 var18 = new class79(arg6, arg0, var14, var15, method826(Statics.field4624, var14, var15, arg0) - arg7, field821 + arg9, field821 + arg10, arg11, arg12, arg13, arg5, arg8);
        var18.method2097(var16, var17, method826(Statics.field4624, var16, var17, arg0) - arg8, field821 + arg9);
        Statics.field4624.field1352.method6829(var18);
    }

    @ObfuscatedName("nj.ku(IIIIII)V")
    public static void method5896(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class406 var5 = Statics.field4624.field1350[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class108 var6 = (class108) var5.method6834(); var6 != null; var6 = (class108) var5.method6842()) {
            if ((arg3 & 0x7FFF) == var6.field1401 && var6.field1394 == arg4) {
                var6.method8189();
                break;
            }
        }
        if (var5.method6834() == null) {
            Statics.field4624.field1350[arg0][arg1][arg2] = null;
        }
        method5921(arg0, arg1, arg2);
    }

    @ObfuscatedName("ln.kh(IIIIIIIIIZB)V")
    public static void method5433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        class108 var10 = new class108();
        var10.field1401 = arg3;
        var10.field1394 = arg4;
        var10.method2628(arg5);
        var10.field1395 = field544 + arg6;
        var10.field1400 = field544 + arg7;
        var10.field1397 = arg8;
        var10.field1396 = arg9;
        if (Statics.field4624.field1350[arg0][arg1][arg2] == null) {
            Statics.field4624.field1350[arg0][arg1][arg2] = new class406();
        }
        Statics.field4624.field1350[arg0][arg1][arg2].method6829(var10);
        method5921(arg0, arg1, arg2);
    }

    @ObfuscatedName("tc.kx(IIIIIII)Z")
    public static boolean method8474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return method1077(Statics.field4624.field1349, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("cm.lc(IIIIIIII)Z")
    public static boolean method1077(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class253 var7 = Statics.field4624.field1332;
        if (class380.field4409.field4412 == arg5) {
            class272 var8 = var7.method4523(arg0, arg1, arg2);
            if (var8 != null) {
                int var9 = class265.method2622(var8.field3001);
                if (class367.field3996.field4017 == arg3) {
                    var8.field3003 = new class82(Statics.field4624, var9, 2, arg4 + 4, arg0, arg1, arg2, arg6, false, var8.field3003);
                    var8.field3002 = new class82(Statics.field4624, var9, 2, arg4 + 1 & 0x3, arg0, arg1, arg2, arg6, false, var8.field3002);
                } else {
                    var8.field3003 = new class82(Statics.field4624, var9, arg3, arg4, arg0, arg1, arg2, arg6, false, var8.field3003);
                }
                return true;
            }
        } else if (class380.field4408.field4412 == arg5) {
            class274 var10 = var7.method4524(arg0, arg1, arg2);
            if (var10 != null) {
                int var11 = class265.method2622(var10.field3010);
                if (class367.field4005.field4017 == arg3 || class367.field4003.field4017 == arg3) {
                    var10.field3012 = new class82(Statics.field4624, var11, 4, arg4, arg0, arg1, arg2, arg6, false, var10.field3012);
                } else if (class367.field4001.field4017 == arg3) {
                    var10.field3012 = new class82(Statics.field4624, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field3012);
                } else if (class367.field3999.field4017 == arg3) {
                    var10.field3012 = new class82(Statics.field4624, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field3012);
                } else if (class367.field3997.field4017 == arg3) {
                    var10.field3012 = new class82(Statics.field4624, var11, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var10.field3012);
                    var10.field3013 = new class82(Statics.field4624, var11, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var10.field3013);
                }
                return true;
            }
        } else if (class380.field4410.field4412 == arg5) {
            class275 var12 = var7.method4525(arg0, arg1, arg2);
            if (class367.field4015.field4017 == arg3) {
                arg3 = class367.field4014.field4017;
            }
            if (var12 != null) {
                var12.field3022 = new class82(Statics.field4624, class265.method2622(var12.field3030), arg3, arg4, arg0, arg1, arg2, arg6, false, var12.field3022);
                return true;
            }
        } else if (class380.field4411.field4412 == arg5) {
            class244 var13 = var7.method4526(arg0, arg1, arg2);
            if (var13 != null) {
                var13.field2607 = new class82(Statics.field4624, class265.method2622(var13.field2608), 22, arg4, arg0, arg1, arg2, arg6, false, var13.field2607);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("gs.li(Ldt;IIIIIIIIIII)V")
    public static void method3180(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class406 var11 = arg0.field1343;
        class97 var12 = null;
        for (class97 var13 = (class97) var11.method6834(); var13 != null; var13 = (class97) var11.method6842()) {
            if (var13.field1201 == arg1 && var13.field1193 == arg2 && var13.field1197 == arg3 && var13.field1192 == arg4) {
                var12 = var13;
                break;
            }
        }
        if (var12 == null) {
            var12 = new class97();
            var12.field1201 = arg1;
            var12.field1192 = arg4;
            var12.field1193 = arg2;
            var12.field1197 = arg3;
            var12.field1191 = -1;
            method2009(arg0, var12);
            var11.method6829(var12);
        }
        var12.field1194 = arg5;
        var12.field1198 = arg6;
        var12.field1199 = arg7;
        var12.field1203 = arg9;
        var12.field1204 = arg10;
        var12.method2310(arg8);
    }

    @ObfuscatedName("gd.lb(Ldt;IIIII)Ldk;")
    public static final class97 method3330(class102 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class97 var5 = (class97) arg0.field1343.method6834(); var5 != null; var5 = (class97) arg0.field1343.method6842()) {
            if (var5.field1201 == arg1 && var5.field1193 == arg2 && var5.field1197 == arg3 && var5.field1192 == arg4) {
                return var5;
            }
        }
        return null;
    }

    @ObfuscatedName("rb.lq(I)V")
    public static final void method7693() {
        for (class97 var0 = (class97) Statics.field3967.field1343.method6834(); var0 != null; var0 = (class97) Statics.field3967.field1343.method6842()) {
            if (var0.field1204 == -1) {
                var0.field1203 = 0;
                method2009(Statics.field3967, var0);
            } else {
                var0.method8189();
            }
        }
    }

    @ObfuscatedName("cg.ly(Ldt;Ldk;I)V")
    public static final void method2009(class102 arg0, class97 arg1) {
        class253 var2 = arg0.field1332;
        long var3 = 0L;
        int var5 = -1;
        int var6 = 0;
        int var7 = 0;
        if (arg1.field1192 == 0) {
            var3 = var2.method4527(arg1.field1201, arg1.field1193, arg1.field1197);
        }
        if (arg1.field1192 == 1) {
            var3 = var2.method4528(arg1.field1201, arg1.field1193, arg1.field1197);
        }
        if (arg1.field1192 == 2) {
            var3 = var2.method4529(arg1.field1201, arg1.field1193, arg1.field1197);
        }
        if (arg1.field1192 == 3) {
            var3 = var2.method4530(arg1.field1201, arg1.field1193, arg1.field1197);
        }
        if (var3 != 0L) {
            int var8 = var2.method4579(arg1.field1201, arg1.field1193, arg1.field1197, var3);
            var5 = class265.method2622(var3);
            var6 = var8 & 0x1F;
            var7 = var8 >> 6 & 0x3;
        }
        arg1.field1195 = var5;
        arg1.field1202 = var6;
        arg1.field1196 = var7;
    }

    @ObfuscatedName("dh.le(Ldt;I)V")
    public static final void method2346(class102 arg0) {
        for (class97 var1 = (class97) arg0.field1343.method6834(); var1 != null; var1 = (class97) arg0.field1343.method6842()) {
            if (var1.field1204 > 0) {
                var1.field1204--;
            }
            if (var1.field1204 == 0) {
                if (var1.field1195 >= 0) {
                    int var2 = var1.field1195;
                    int var3 = var1.field1202;
                    class224 var4 = class224.method3868(var2);
                    if (var3 == 11) {
                        var3 = 10;
                    }
                    if (var3 >= 5 && var3 <= 8) {
                        var3 = 4;
                    }
                    boolean var5 = var4.method3876(var3);
                    if (!var5) {
                        continue;
                    }
                }
                method1132(arg0, var1.field1201, var1.field1192, var1.field1193, var1.field1197, var1.field1195, var1.field1196, var1.field1202, var1.field1191);
                var1.method8189();
            } else {
                if (var1.field1203 > 0) {
                    var1.field1203--;
                }
                if (var1.field1203 == 0 && var1.field1193 >= 1 && var1.field1197 >= 1 && var1.field1193 <= 102 && var1.field1197 <= 102) {
                    if (var1.field1194 >= 0) {
                        int var6 = var1.field1194;
                        int var7 = var1.field1198;
                        class224 var8 = class224.method3868(var6);
                        if (var7 == 11) {
                            var7 = 10;
                        }
                        if (var7 >= 5 && var7 <= 8) {
                            var7 = 4;
                        }
                        boolean var9 = var8.method3876(var7);
                        if (!var9) {
                            continue;
                        }
                    }
                    method1132(arg0, var1.field1201, var1.field1192, var1.field1193, var1.field1197, var1.field1194, var1.field1199, var1.field1198, var1.field1191);
                    var1.field1203 = -1;
                    if (var1.field1195 == var1.field1194 && var1.field1195 == -1) {
                        var1.method8189();
                    } else if (var1.field1195 == var1.field1194 && var1.field1199 == var1.field1196 && var1.field1202 == var1.field1198) {
                        var1.method8189();
                    }
                }
            }
        }
    }

    @ObfuscatedName("ce.lu(Ldt;IIIIIIIII)V")
    public static final void method1132(class102 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class253 var9 = arg0.field1332;
        if (arg3 < 1 || arg4 < 1 || arg3 > arg0.field1347 - 1 || arg4 > arg0.field1331 - 1) {
            return;
        }
        if (field642 && arg0.field1349 != arg1) {
            return;
        }
        long var10 = 0L;
        boolean var12 = true;
        boolean var13 = false;
        boolean var14 = false;
        if (arg2 == 0) {
            var10 = var9.method4527(arg1, arg3, arg4);
        }
        if (arg2 == 1) {
            var10 = var9.method4528(arg1, arg3, arg4);
        }
        if (arg2 == 2) {
            var10 = var9.method4529(arg1, arg3, arg4);
        }
        if (arg2 == 3) {
            var10 = var9.method4530(arg1, arg3, arg4);
        }
        if (var10 != 0L) {
            int var15 = var9.method4579(arg1, arg3, arg4, var10);
            int var16 = class265.method2622(var10);
            int var17 = var15 & 0x1F;
            int var18 = var15 >> 6 & 0x3;
            class224 var19 = class224.method3868(var16);
            if (var19 != null && var19.method3911()) {
                int var22 = var19.field2291;
                int var23 = var19.field2292;
                if (var18 == 1 || var18 == 3) {
                    var22 = var19.field2292;
                    var23 = var19.field2291;
                }
                int var24 = (arg3 + var22) * 128;
                int var25 = (arg4 + var23) * 128;
                int var26 = arg3 * 128;
                int var27 = arg4 * 128;
                int var28 = var19.field2284;
                int var29 = var19.field2312 * 128;
                int var30 = var19.field2322 * 128;
                if (var19.field2317 != null) {
                    class224 var31 = var19.method3882();
                    if (var31 != null) {
                        var28 = var31.field2284;
                        var29 = var31.field2312 * 128;
                        var30 = var31.field2322 * 128;
                    }
                }
                class72 var10000 = (class72) null;
                for (class72 var32 = (class72) class72.field876.method6834(); var32 != null; var32 = (class72) class72.field876.method6842()) {
                    if (var32.field874 == arg1 && var32.field873 == var26 && var32.field861 == var27 && var32.field862 == var24 && var32.field863 == var25 && var32.field866 == var28 && var32.field860 == var29 && var32.field859 == var30) {
                        if (var32.field858 != null) {
                            Statics.field3737.method711(var32.field858);
                            var32.field858 = null;
                        }
                        if (var32.field872 != null) {
                            Statics.field3737.method711(var32.field872);
                            var32.field872 = null;
                        }
                        var32.method8189();
                        break;
                    }
                    var10000 = (class72) null;
                }
            }
            if (arg2 == 0) {
                var9.method4650(arg1, arg3, arg4);
                if (var19.field2321 != 0) {
                    arg0.field1333[arg1].method4134(arg3, arg4, var17, var18, var19.field2294);
                }
            }
            if (arg2 == 1) {
                var9.method4519(arg1, arg3, arg4);
            }
            if (arg2 == 2) {
                var9.method4609(arg1, arg3, arg4);
                if (var19.field2291 + arg3 > arg0.field1347 - 1 || var19.field2291 + arg4 > arg0.field1331 - 1 || var19.field2292 + arg3 > arg0.field1347 - 1 || var19.field2292 + arg4 > arg0.field1331 - 1) {
                    return;
                }
                if (var19.field2321 != 0) {
                    arg0.field1333[arg1].method4118(arg3, arg4, var19.field2291, var19.field2292, var18, var19.field2294);
                }
            }
            if (arg2 == 3) {
                var9.method4521(arg1, arg3, arg4);
                if (var19.field2321 == 1) {
                    arg0.field1333[arg1].method4126(arg3, arg4);
                }
            }
        }
        if (arg5 < 0) {
            return;
        }
        int var33 = arg1;
        if (arg1 < 3 && (arg0.field1341[1][arg3][arg4] & 0x2) == 2) {
            var33 = arg1 + 1;
        }
        class84.method5833(arg0, arg1, var33, arg3, arg4, arg5, arg6, arg7, arg8, arg0.field1333[arg1]);
        class224 var34 = class224.method3868(arg5);
        if (var34 != null && var34.method3911()) {
            class72.method852(var33, arg3, arg4, var34, arg6);
        }
    }

    @ObfuscatedName("kr.lh(Ldt;IIB)V")
    public static final void method5056(class102 arg0, int arg1, int arg2) {
        method3191(arg0, arg0.field1349, arg1, arg2);
    }

    @ObfuscatedName("nz.lg(IIII)V")
    public static final void method5921(int arg0, int arg1, int arg2) {
        method3191(Statics.field4624, arg0, arg1, arg2);
    }

    @ObfuscatedName("gg.ln(Ldt;IIIS)V")
    public static final void method3191(class102 arg0, int arg1, int arg2, int arg3) {
        class406 var4 = arg0.field1350[arg1][arg2][arg3];
        if (var4 == null) {
            arg0.field1332.method4522(arg1, arg2, arg3);
            return;
        }
        long var5 = -99999999L;
        class108 var7 = null;
        for (class108 var8 = (class108) var4.method6834(); var8 != null; var8 = (class108) var4.method6842()) {
            class225 var9 = class225.method369(var8.field1401);
            long var10 = (long) var9.field2353;
            if (var9.field2351 == 1) {
                var10 *= var8.field1394 < Integer.MAX_VALUE ? (long) (var8.field1394 + 1) : (long) var8.field1394;
            }
            if (var10 > var5) {
                var5 = var10;
                var7 = var8;
            }
        }
        if (var7 == null) {
            arg0.field1332.method4522(arg1, arg2, arg3);
            return;
        }
        var4.method6830(var7);
        class108 var12 = null;
        class108 var13 = null;
        for (class108 var14 = (class108) var4.method6834(); var14 != null; var14 = (class108) var4.method6842()) {
            if (var7.field1401 != var14.field1401) {
                if (var12 == null) {
                    var12 = var14;
                }
                if (var12.field1401 != var14.field1401 && var13 == null) {
                    var13 = var14;
                }
            }
        }
        long var15 = class265.method3598(arg2, arg3, 3, false, 0, arg0.field1336);
        arg0.field1332.method4508(arg1, arg2, arg3, method826(arg0, arg2 * 128 + 64, arg3 * 128 + 64, arg1), var7, var15, var12, var13);
    }

    @ObfuscatedName("qj.lo(Ldt;Luk;B)V")
    public static void method7592(class102 arg0, class545 arg1) {
        int var2 = arg1.method8798();
        class476 var3 = arg0.field1348[var2];
        class102 var4 = var3.field4948;
        var4.field1338 = arg1.method8798();
        var4.field1334 = arg1.method8798();
        var4.field1337.method2642(arg1, false);
        int var5 = var4.field1347 / 8;
        int var6 = var4.field1331 / 8;
        int var7 = arg1.method8798();
        arg1.method8738();
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < var5; var9++) {
                for (int var10 = 0; var10 < var6; var10++) {
                    int var11 = arg1.method8743(1);
                    if (var11 == 1) {
                        field602[var8][var9][var10] = arg1.method8743(26);
                    } else {
                        field602[var8][var9][var10] = -1;
                    }
                }
            }
        }
        arg1.method8772();
        Statics.field5103 = new int[var7][4];
        for (int var12 = 0; var12 < var7; var12++) {
            for (int var13 = 0; var13 < 4; var13++) {
                Statics.field5103[var12][var13] = arg1.method8801();
            }
        }
        Statics.field1496 = new int[var7];
        Statics.field1697 = new int[var7];
        Statics.field334 = new int[var7];
        Statics.field3707 = new byte[var7][];
        Statics.field1637 = new byte[var7][];
        int var14 = 0;
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < var5; var16++) {
                for (int var17 = 0; var17 < var6; var17++) {
                    int var18 = field602[var15][var16][var17];
                    if (var18 != -1) {
                        int var19 = var18 >> 14 & 0x3FF;
                        int var20 = var18 >> 3 & 0x7FF;
                        int var21 = (var19 / 8 << 8) + var20 / 8;
                        for (int var22 = 0; var22 < var14; var22++) {
                            if (Statics.field1496[var22] == var21) {
                                var21 = -1;
                                break;
                            }
                        }
                        if (var21 != -1) {
                            Statics.field1496[var14] = var21;
                            int var23 = var21 >> 8 & 0xFF;
                            int var24 = var21 & 0xFF;
                            Statics.field1697[var14] = Statics.field2971.method6587("m" + var23 + "_" + var24);
                            Statics.field334[var14] = Statics.field2971.method6587("l" + var23 + "_" + var24);
                            var14++;
                        }
                    }
                }
            }
        }
        Statics.method2625(25);
        field685 = true;
        Statics.field156 = var4;
        method3042(var4);
    }

    @ObfuscatedName("dx.ls(Ldt;ZLuk;I)V")
    public static final void method2428(class102 arg0, boolean arg1, class545 arg2) {
        field659 = 0;
        field589 = 0;
        arg2.method8738();
        int var3 = arg2.method8743(8);
        if (var3 < arg0.field1345) {
            for (int var4 = var3; var4 < arg0.field1345; var4++) {
                field660[++field659 - 1] = arg0.field1346[var4];
            }
        }
        if (var3 > arg0.field1345) {
            throw new RuntimeException("");
        }
        arg0.field1345 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = arg0.field1346[var5];
            class104 var7 = arg0.field1344[var6];
            int var8 = arg2.method8743(1);
            if (var8 == 0) {
                arg0.field1346[++arg0.field1345 - 1] = var6;
                var7.field1264 = field821;
            } else {
                int var9 = arg2.method8743(2);
                if (var9 == 0) {
                    arg0.field1346[++arg0.field1345 - 1] = var6;
                    var7.field1264 = field821;
                    field590[++field589 - 1] = var6;
                } else if (var9 == 1) {
                    arg0.field1346[++arg0.field1345 - 1] = var6;
                    var7.field1264 = field821;
                    int var10 = arg2.method8743(3);
                    var7.method2539(var10, class238.field2526);
                    int var11 = arg2.method8743(1);
                    if (var11 == 1) {
                        field590[++field589 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    arg0.field1346[++arg0.field1345 - 1] = var6;
                    var7.field1264 = field821;
                    if (arg2.method8743(1) == 1) {
                        int var12 = arg2.method8743(3);
                        var7.method2539(var12, class238.field2530);
                        int var13 = arg2.method8743(3);
                        var7.method2539(var13, class238.field2530);
                    } else {
                        int var14 = arg2.method8743(3);
                        var7.method2539(var14, class238.field2525);
                    }
                    int var15 = arg2.method8743(1);
                    if (var15 == 1) {
                        field590[++field589 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field660[++field659 - 1] = var6;
                }
            }
        }
        method3100(arg0, arg1, arg2);
        for (int var16 = 0; var16 < field589; var16++) {
            int var17 = field590[var16];
            class104 var18 = arg0.field1344[var17];
            int var19 = arg2.method8796();
            if ((var19 & 0x1) != 0) {
                int var20 = arg2.method8796();
                var19 += var20 << 8;
            }
            if ((var19 & 0x1000) != 0) {
                int var21 = arg2.method8796();
                var19 += var21 << 16;
            }
            if ((var19 & 0x8) != 0) {
                var18.field1360 = class210.method2967(arg2.method8896());
                method14(var18);
                var18.method2546();
            }
            if ((var19 & 0x4) != 0) {
                int var22 = arg2.method8896();
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = arg2.method8796();
                if (var18.field1224 == var22 && var22 != -1) {
                    int var24 = class227.method4744(var22).field2434;
                    if (var24 == 1) {
                        var18.field1251 = 0;
                        var18.field1252 = 0;
                        var18.field1253 = var23;
                        var18.field1240 = 0;
                    }
                    if (var24 == 2) {
                        var18.field1240 = 0;
                    }
                } else if (var22 == -1 || var18.field1224 == -1 || class227.method4744(var22).field2410 >= class227.method4744(var18.field1224).field2410) {
                    var18.field1224 = var22;
                    var18.field1251 = 0;
                    var18.field1252 = 0;
                    var18.field1253 = var23;
                    var18.field1240 = 0;
                    var18.field1227 = var18.field1275;
                }
            }
            if ((var19 & 0x2) != 0) {
                var18.field1225 = arg2.method8806();
                var18.field1219 = 100;
            }
            if ((var19 & 0x200) != 0) {
                int var25 = arg2.method8796();
                if ((var25 & 0x1) == 1) {
                    var18.method2563();
                } else {
                    int[] var26 = null;
                    if ((var25 & 0x2) == 2) {
                        int var27 = arg2.method8913();
                        var26 = new int[var27];
                        for (int var28 = 0; var28 < var27; var28++) {
                            int var29 = arg2.method8836();
                            int var30 = var29 == 65535 ? -1 : var29;
                            var26[var28] = var30;
                        }
                    }
                    short[] var31 = null;
                    if ((var25 & 0x4) == 4) {
                        int var32 = 0;
                        if (var18.field1360.field2140 != null) {
                            var32 = var18.field1360.field2140.length;
                        }
                        var31 = new short[var32];
                        for (int var33 = 0; var33 < var32; var33++) {
                            var31[var33] = (short) arg2.method8837();
                        }
                    }
                    short[] var34 = null;
                    if ((var25 & 0x8) == 8) {
                        int var35 = 0;
                        if (var18.field1360.field2151 != null) {
                            var35 = var18.field1360.field2151.length;
                        }
                        var34 = new short[var35];
                        for (int var36 = 0; var36 < var35; var36++) {
                            var34[var36] = (short) arg2.method8798();
                        }
                    }
                    boolean var37 = false;
                    if ((var25 & 0x10) != 0) {
                        var37 = arg2.method8828() == 1;
                    }
                    long var38 = (long) (++class104.field1365 - 1);
                    var18.method2549(new class209(var38, var26, var31, var34, var37));
                }
            }
            if ((var19 & 0x80) != 0) {
                int var40 = arg2.method8837();
                int var41 = arg2.method8798();
                var18.field1245 = arg2.method8829() == 1;
                var18.field1243 = var40;
                var18.field1244 = var41;
            }
            if ((var19 & 0x20000) != 0) {
                int var42 = arg2.method8796();
                int[] var43 = new int[8];
                short[] var44 = new short[8];
                for (int var45 = 0; var45 < 8; var45++) {
                    if ((var42 & 0x1 << var45) == 0) {
                        var43[var45] = -1;
                        var44[var45] = -1;
                    } else {
                        var43[var45] = arg2.method8814();
                        var44[var45] = (short) arg2.method8811();
                    }
                }
                var18.method2545(var43, var44);
            }
            if ((var19 & 0x800) != 0) {
                int var46 = arg2.method8828();
                if ((var46 & 0x1) == 1) {
                    var18.method2550();
                } else {
                    int[] var47 = null;
                    if ((var46 & 0x2) == 2) {
                        int var48 = arg2.method8913();
                        var47 = new int[var48];
                        for (int var49 = 0; var49 < var48; var49++) {
                            int var50 = arg2.method8837();
                            int var51 = var50 == 65535 ? -1 : var50;
                            var47[var49] = var51;
                        }
                    }
                    short[] var52 = null;
                    if ((var46 & 0x4) == 4) {
                        int var53 = 0;
                        if (var18.field1360.field2140 != null) {
                            var53 = var18.field1360.field2140.length;
                        }
                        var52 = new short[var53];
                        for (int var54 = 0; var54 < var53; var54++) {
                            var52[var54] = (short) arg2.method8896();
                        }
                    }
                    short[] var55 = null;
                    if ((var46 & 0x8) == 8) {
                        int var56 = 0;
                        if (var18.field1360.field2151 != null) {
                            var56 = var18.field1360.field2151.length;
                        }
                        var55 = new short[var56];
                        for (int var57 = 0; var57 < var56; var57++) {
                            var55[var57] = (short) arg2.method8837();
                        }
                    }
                    boolean var58 = false;
                    if ((var46 & 0x10) != 0) {
                        var58 = arg2.method8796() == 1;
                    }
                    long var59 = (long) (++class104.field1367 - 1);
                    var18.method2567(new class209(var59, var47, var52, var55, var58));
                }
            }
            if ((var19 & 0x400) != 0) {
                var18.method2535(arg2.method8806());
            }
            if ((var19 & 0x20) != 0) {
                int var61 = arg2.method8829();
                if (var61 > 0) {
                    for (int var62 = 0; var62 < var61; var62++) {
                        int var63 = -1;
                        int var64 = -1;
                        int var65 = -1;
                        int var66 = arg2.method8810();
                        if (var66 == 32767) {
                            var66 = arg2.method8810();
                            var64 = arg2.method8810();
                            var63 = arg2.method8810();
                            var65 = arg2.method8810();
                        } else if (var66 == 32766) {
                            var66 = -1;
                        } else {
                            var64 = arg2.method8810();
                        }
                        int var67 = arg2.method8810();
                        var18.method2318(var66, var64, var63, var65, field821, var67);
                    }
                }
                int var68 = arg2.method8828();
                if (var68 > 0) {
                    for (int var69 = 0; var69 < var68; var69++) {
                        int var70 = arg2.method8810();
                        int var71 = arg2.method8810();
                        if (var71 == 32767) {
                            var18.method2335(var70);
                        } else {
                            int var72 = arg2.method8810();
                            int var73 = arg2.method8829();
                            int var74 = var71 > 0 ? arg2.method8913() : var73;
                            var18.method2319(var70, field821, var71, var72, var73, var74);
                        }
                    }
                }
            }
            if ((var19 & 0x100) != 0) {
                var18.field1266 = field821 + arg2.method8837();
                var18.field1267 = field821 + arg2.method8836();
                var18.field1268 = arg2.method8831();
                var18.field1269 = arg2.method8797();
                var18.field1270 = arg2.method8797();
                var18.field1271 = (byte) arg2.method8828();
            }
            if ((var19 & 0x8000) != 0) {
                var18.field1281 = arg2.method8801();
            }
            if ((var19 & 0x40) != 0) {
                var18.field1220 = arg2.method8836();
                var18.field1220 += arg2.method8828() << 16;
                int var75 = 16777215;
                if (var18.field1220 == var75) {
                    var18.field1220 = -1;
                }
            }
            if ((var19 & 0x40000) != 0) {
                int var76 = arg2.method8851();
                var18.field1242 = (var76 & 0x1) == 0 ? var18.field1360.field2122 : arg2.method8798();
                var18.field1213 = (var76 & 0x2) == 0 ? var18.field1360.field2115 : arg2.method8836();
                var18.field1214 = (var76 & 0x4) == 0 ? var18.field1360.field2127 : arg2.method8798();
                var18.field1223 = (var76 & 0x8) == 0 ? var18.field1360.field2148 : arg2.method8837();
                var18.field1206 = (var76 & 0x10) == 0 ? var18.field1360.field2129 : arg2.method8896();
                var18.field1217 = (var76 & 0x20) == 0 ? var18.field1360.field2130 : arg2.method8836();
                var18.field1218 = (var76 & 0x40) == 0 ? var18.field1360.field2131 : arg2.method8836();
                var18.field1216 = (var76 & 0x80) == 0 ? var18.field1360.field2132 : arg2.method8836();
                var18.field1226 = (var76 & 0x100) == 0 ? var18.field1360.field2162 : arg2.method8836();
                var18.field1221 = (var76 & 0x200) == 0 ? var18.field1360.field2134 : arg2.method8837();
                var18.field1274 = (var76 & 0x400) == 0 ? var18.field1360.field2135 : arg2.method8896();
                var18.field1207 = (var76 & 0x800) == 0 ? var18.field1360.field2136 : arg2.method8836();
                var18.field1282 = (var76 & 0x1000) == 0 ? var18.field1360.field2137 : arg2.method8836();
                var18.field1229 = (var76 & 0x2000) == 0 ? var18.field1360.field2125 : arg2.method8896();
                var18.field1211 = (var76 & 0x4000) == 0 ? var18.field1360.field2124 : arg2.method8837();
            }
            if ((var19 & 0x10) != 0) {
                arg2.method8798();
                arg2.method8946();
            }
            if ((var19 & 0x10000) != 0) {
                int var77 = arg2.method8829();
                for (int var78 = 0; var78 < var77; var78++) {
                    int var79 = arg2.method8829();
                    int var80 = arg2.method8836();
                    int var81 = arg2.method8801();
                    var18.method2328(var79, var80, var81 >> 16, var81 & 0xFFFF);
                }
            }
            if ((var19 & 0x2000) != 0) {
                var18.method2553(arg2.method8913());
            }
            if ((var19 & 0x4000) != 0) {
                var18.field1257 = arg2.method8830();
                var18.field1259 = arg2.method8797();
                var18.field1258 = arg2.method8965();
                var18.field1260 = arg2.method8830();
                var18.field1261 = arg2.method8798() + field821;
                var18.field1262 = arg2.method8798() + field821;
                var18.field1263 = arg2.method8836();
                var18.field1275 = 1;
                var18.field1227 = 0;
                var18.field1257 += var18.field1230[0];
                var18.field1259 += var18.field1277[0];
                var18.field1258 += var18.field1230[0];
                var18.field1260 += var18.field1277[0];
            }
        }
        for (int var82 = 0; var82 < field659; var82++) {
            int var83 = field660[var82];
            if (field821 != arg0.field1344[var83].field1264) {
                arg0.field1344[var83].field1360 = null;
                arg0.field1344[var83] = null;
            }
        }
        if (field591.field1465 != arg2.field5344) {
            throw new RuntimeException(arg2.field5344 + class105.field1370 + field591.field1465);
        }
        for (int var84 = 0; var84 < arg0.field1345; var84++) {
            if (arg0.field1344[arg0.field1346[var84]] == null) {
                throw new RuntimeException(var84 + class105.field1370 + arg0.field1345);
            }
        }
    }

    @ObfuscatedName("fw.lv(Ldt;ZLuk;I)V")
    public static final void method3100(class102 arg0, boolean arg1, class545 arg2) {
        while (true) {
            byte var3 = 16;
            int var4 = 0x1 << var3;
            if (arg2.method8741(field591.field1465) >= var3 + 12) {
                int var5 = arg2.method8743(var3);
                if (var4 - 1 != var5) {
                    boolean var6 = false;
                    if (arg0.field1344[var5] == null) {
                        arg0.field1344[var5] = new class104();
                        var6 = true;
                    }
                    class104 var7 = arg0.field1344[var5];
                    arg0.field1346[++arg0.field1345 - 1] = var5;
                    var7.field1264 = field821;
                    var7.field1360 = class210.method2967(arg2.method8743(14));
                    int var8 = arg2.method8743(1);
                    int var9 = arg2.method8743(1);
                    if (var9 == 1) {
                        field590[++field589 - 1] = var5;
                    }
                    int var10;
                    if (arg1) {
                        var10 = arg2.method8743(8);
                        if (var10 > 127) {
                            var10 -= 256;
                        }
                    } else {
                        var10 = arg2.method8743(5);
                        if (var10 > 15) {
                            var10 -= 32;
                        }
                    }
                    int var11 = field804[arg2.method8743(3)];
                    if (var6) {
                        var7.field1283 = var7.field1210 = var11;
                    }
                    boolean var12 = arg2.method8743(1) == 1;
                    if (var12) {
                        arg2.method8743(32);
                    }
                    int var13;
                    if (arg1) {
                        var13 = arg2.method8743(8);
                        if (var13 > 127) {
                            var13 -= 256;
                        }
                    } else {
                        var13 = arg2.method8743(5);
                        if (var13 > 15) {
                            var13 -= 32;
                        }
                    }
                    method14(var7);
                    if (var7.field1239 == 0) {
                        var7.field1210 = 0;
                    }
                    if (field558 >= 222) {
                        var7.method2540(Statics.field297 + var10, Statics.field1563 + var13, var8 == 1);
                        continue;
                    }
                    var7.method2540(Statics.field84.field1230[0] + var10, Statics.field84.field1277[0] + var13, var8 == 1);
                    continue;
                }
            }
            arg2.method8772();
            return;
        }
    }

    @ObfuscatedName("af.ll(Ldv;B)V")
    public static void method14(class104 arg0) {
        arg0.field1209 = arg0.field1360.field2121;
        arg0.field1239 = arg0.field1360.field2133;
        arg0.field1214 = arg0.field1360.field2127;
        arg0.field1223 = arg0.field1360.field2148;
        arg0.field1206 = arg0.field1360.field2129;
        arg0.field1217 = arg0.field1360.field2130;
        arg0.field1211 = arg0.field1360.field2124;
        arg0.field1242 = arg0.field1360.field2122;
        arg0.field1213 = arg0.field1360.field2115;
        arg0.field1218 = arg0.field1360.field2131;
        arg0.field1216 = arg0.field1360.field2132;
        arg0.field1226 = arg0.field1360.field2162;
        arg0.field1221 = arg0.field1360.field2134;
        arg0.field1274 = arg0.field1360.field2135;
        arg0.field1207 = arg0.field1360.field2136;
        arg0.field1282 = arg0.field1360.field2137;
        arg0.field1229 = arg0.field1360.field2125;
    }

    @ObfuscatedName("fo.lt(Ldt;Lde;IILjv;I)V")
    public static final void method3037(class102 arg0, class94 arg1, int arg2, int arg3, class238 arg4) {
        int var5 = arg1.field1230[0];
        int var6 = arg1.field1277[0];
        int var7 = arg1.method2267();
        if (var5 < var7 || var5 >= 104 - var7 || var6 < var7 || var6 >= 104 - var7 || arg2 < var7 || arg2 >= 104 - var7 || arg3 < var7 || arg3 >= 104 - var7) {
            return;
        }
        class240 var8 = field771;
        int var11 = arg1.method2267();
        field830.field2512 = arg2;
        field830.field2511 = arg3;
        field830.field2510 = 1;
        field830.field2513 = 1;
        class66 var12 = field830;
        int var13 = var8.method4206(var5, var6, var11, var12, arg0.field1333[arg1.field1151], true, field831, field832);
        if (var13 >= 1) {
            for (int var14 = 0; var14 < var13 - 1; var14++) {
                arg1.method2271(field831[var14], field832[var14], arg4);
            }
        }
    }

    @ObfuscatedName("nd.lr(S)V")
    public static void method6448() {
        field672 = 0;
        field671 = false;
    }

    @ObfuscatedName("bg.lw(S)V")
    public static void method688() {
        method6448();
        field678[0] = -1;
        field679[0] = class378.field4153;
        field680[0] = "";
        field675[0] = 1006;
        field681[0] = false;
        field672 = 1;
    }

    @ObfuscatedName("fu.lk(S)Z")
    public static final boolean method3077() {
        return field671;
    }

    @ObfuscatedName("sa.lx(IIIII)V")
    public static final void method8115(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field744; var4++) {
            if (field765[var4] + field751[var4] > arg0 && field765[var4] < arg0 + arg2 && field800[var4] + field750[var4] > arg1 && field750[var4] < arg1 + arg3) {
                field657[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.la(I)V")
    public final void method1179() {
        method5431();
        if (field708 != null) {
            return;
        }
        int var1 = class36.field238;
        if (!field671) {
            int var12 = method3181();
            if ((var1 == 1 || !Statics.field1379 && var1 == 4) && this.method1180()) {
                var1 = 2;
            }
            if ((var1 == 1 || !Statics.field1379 && var1 == 4) && field672 > 0) {
                method3049(var12);
            }
            if (var1 == 2 && field672 > 0) {
                this.method1181(class36.field239, class36.field240);
            }
            return;
        }
        if (var1 != 1 && (Statics.field1379 || var1 != 4)) {
            int var2 = class36.field230;
            int var3 = class36.field221;
            if (var2 < Statics.field1751 - 10 || var2 > Statics.field3051 + Statics.field1751 + 10 || var3 < Statics.field4930 - 10 || var3 > Statics.field4930 + Statics.field4453 + 10) {
                field671 = false;
                method8115(Statics.field1751, Statics.field4930, Statics.field3051, Statics.field4453);
            }
        }
        if (var1 != 1 && Statics.field1379 || var1 != 4) {
            return;
        }
        int var4 = Statics.field1751;
        int var5 = Statics.field4930;
        int var6 = Statics.field3051;
        int var7 = class36.field239;
        int var8 = class36.field240;
        int var9 = -1;
        for (int var10 = 0; var10 < field672; var10++) {
            int var11 = (field672 - 1 - var10) * 15 + var5 + 31;
            if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            method3049(var9);
        }
        field671 = false;
        method8115(Statics.field1751, Statics.field4930, Statics.field3051, Statics.field4453);
    }

    @ObfuscatedName("client.lp(I)Z")
    public final boolean method1180() {
        int var1 = field672 - 1;
        boolean var3 = field537 && field672 > 2;
        if (!var3) {
            boolean var4;
            if (var1 < 0) {
                var4 = false;
            } else {
                int var5 = field675[var1];
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
        return var3 && !field681[var1];
    }

    @ObfuscatedName("client.ld(IIB)V")
    public final void method1181(int arg0, int arg1) {
        int var3 = Statics.field3119.method7547(class378.field4258);
        for (int var4 = 0; var4 < field672; var4++) {
            class431 var5 = Statics.field3119;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (field680[var4].length() > 0) {
                var6 = field679[var4] + class378.field4265 + field680[var4];
            } else {
                var6 = field679[var4];
            }
            int var7 = var5.method7547(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }
        var3 += 8;
        int var8 = field672 * 15 + 22;
        int var9 = arg0 - var3 / 2;
        if (var3 + var9 > Statics.field190) {
            var9 = Statics.field190 - var3;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        int var10 = arg1;
        if (var8 + arg1 > Statics.field5283) {
            var10 = Statics.field5283 - var8;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        Statics.field1751 = var9;
        Statics.field4930 = var10;
        Statics.field3051 = var3;
        Statics.field4453 = field672 * 15 + 22;
        int var11 = arg0 - field809;
        int var12 = arg1 - field807;
        Statics.field3967.field1332.method4556(Statics.field3967.field1349, var11, var12, false);
        for (int var13 = 0; var13 < Statics.field3967.field1335; var13++) {
            class476 var14 = Statics.field3967.field1348[Statics.field3967.field1351[var13]];
            if (var14 != null) {
                var14.field4948.field1332.method4556(var14.field4948.field1349, var11, var12, false);
            }
        }
        field671 = true;
    }

    @ObfuscatedName("fb.lj(II)V")
    public static final void method3049(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field673[arg0];
        int var2 = field674[arg0];
        int var3 = field675[arg0];
        int var4 = field676[arg0];
        int var5 = field678[arg0];
        int var6 = field677[arg0];
        String var7 = field679[arg0];
        String var8 = field680[arg0];
        method2765(var1, var2, var3, var4, var6, var5, var7, var8, class36.field239, class36.field240);
    }

    @ObfuscatedName("fy.lm(Lcj;III)V")
    public static final void method2935(class76 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            method2765(arg0.field930, arg0.field923, arg0.field924, arg0.field926, arg0.field927, arg0.field928, arg0.field929, arg0.field925, arg1, arg2);
        }
    }

    @ObfuscatedName("el.mb(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method2765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, String arg6, String arg7, int arg8, int arg9) {
        class102 var10 = null;
        if (arg5 >= 0 && Statics.field3967.field1348[arg5] != null) {
            var10 = Statics.field3967.field1348[arg5].field4948;
        } else if (arg5 == -1) {
            var10 = Statics.field3967;
        }
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1338;
        int var12 = var10.field1334;
        class104[] var13 = var10.field1344;
        class94[] var14 = var10.field1342;
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 7) {
            class104 var15 = var13[arg3];
            if (var15 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var16 = class321.method3542(class319.field3310, field591.field1467);
                var16.field3393.method8824(field764.method4087(82) ? 1 : 0);
                var16.field3393.method8981(Statics.field3101);
                var16.field3393.method8834(Statics.field4);
                var16.field3393.method8833(Statics.field1457);
                var16.field3393.method8834(arg3);
                field591.method2745(var16);
            }
        }
        if (arg2 == 24) {
            class358 var17 = Statics.field75.method5906(arg1);
            if (var17 != null) {
                boolean var18 = true;
                if (var17.field3820 > 0) {
                    var18 = method6774(var17);
                }
                if (var18) {
                    class321 var19 = class321.method3542(class319.field3288, field591.field1467);
                    var19.field3393.method8981(arg1);
                    field591.method2745(var19);
                }
            }
        }
        if (arg2 == 46) {
            class94 var20 = var14[arg3];
            if (var20 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var21 = class321.method3542(class319.field3335, field591.field1467);
                var21.field3393.method8834(arg3);
                var21.field3393.method8779(field764.method4087(82) ? 1 : 0);
                field591.method2745(var21);
            }
        }
        if (arg2 == 21) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var22 = class321.method3542(class319.field3304, field591.field1467);
            var22.field3393.method8780(arg0 + var11);
            var22.field3393.method8833(arg3);
            var22.field3393.method8834(arg1 + var12);
            var22.field3393.method8824(field764.method4087(82) ? 1 : 0);
            field591.method2745(var22);
        }
        if (arg2 == 48) {
            class94 var23 = var14[arg3];
            if (var23 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var24 = class321.method3542(class319.field3327, field591.field1467);
                var24.field3393.method8826(field764.method4087(82) ? 1 : 0);
                var24.field3393.method8834(arg3);
                field591.method2745(var24);
            }
        }
        if (arg2 == 1002) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            class321 var25 = class321.method3542(class319.field3372, field591.field1467);
            var25.field3393.method8833(arg3);
            field591.method2745(var25);
        }
        if (arg2 == 29) {
            class321 var26 = class321.method3542(class319.field3288, field591.field1467);
            var26.field3393.method8981(arg1);
            field591.method2745(var26);
            class358 var27 = Statics.field75.method5906(arg1);
            if (var27 != null && var27.field3856 != null && var27.field3856[0][0] == 5) {
                int var28 = var27.field3856[0][1];
                if (class346.field3710[var28] != var27.field3943[0]) {
                    class346.field3710[var28] = var27.field3943[0];
                    method3070(var28);
                }
            }
        }
        if (arg2 == 45) {
            class94 var29 = var14[arg3];
            if (var29 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var30 = class321.method3542(class319.field3305, field591.field1467);
                var30.field3393.method8833(arg3);
                var30.field3393.method8887(field764.method4087(82) ? 1 : 0);
                field591.method2745(var30);
            }
        }
        if (arg2 == 11) {
            class104 var31 = var13[arg3];
            if (var31 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var32 = class321.method3542(class319.field3370, field591.field1467);
                var32.field3393.method8833(arg3);
                var32.field3393.method8887(field764.method4087(82) ? 1 : 0);
                field591.method2745(var32);
            }
        }
        if (arg2 == 15) {
            class94 var33 = var14[arg3];
            if (var33 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var34 = class321.method3542(class319.field3366, field591.field1467);
                var34.field3393.method8824(field764.method4087(82) ? 1 : 0);
                var34.field3393.method8780(arg3);
                var34.field3393.method8850(Statics.field4293);
                var34.field3393.method8867(field638);
                var34.field3393.method8833(field530);
                field591.method2745(var34);
            }
        }
        if (arg2 == 14) {
            class94 var35 = var14[arg3];
            if (var35 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var36 = class321.method3542(class319.field3338, field591.field1467);
                var36.field3393.method8833(Statics.field4);
                var36.field3393.method8834(arg3);
                var36.field3393.method8826(field764.method4087(82) ? 1 : 0);
                var36.field3393.method8849(Statics.field3101);
                var36.field3393.method8780(Statics.field1457);
                field591.method2745(var36);
            }
        }
        if (arg2 == 10) {
            class104 var37 = var13[arg3];
            if (var37 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var38 = class321.method3542(class319.field3294, field591.field1467);
                var38.field3393.method8834(arg3);
                var38.field3393.method8779(field764.method4087(82) ? 1 : 0);
                field591.method2745(var38);
            }
        }
        if (arg2 == 3) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var39 = class321.method3542(class319.field3360, field591.field1467);
            var39.field3393.method8833(arg0 + var11);
            var39.field3393.method8887(field764.method4087(82) ? 1 : 0);
            var39.field3393.method8834(arg1 + var12);
            var39.field3393.method8834(arg3);
            field591.method2745(var39);
        }
        if (arg2 == 49) {
            class94 var40 = var14[arg3];
            if (var40 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var41 = class321.method3542(class319.field3298, field591.field1467);
                var41.field3393.method8779(field764.method4087(82) ? 1 : 0);
                var41.field3393.method8867(arg3);
                field591.method2745(var41);
            }
        }
        if (arg2 == 4) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var42 = class321.method3542(class319.field3314, field591.field1467);
            var42.field3393.method8867(arg0 + var11);
            var42.field3393.method8834(arg3);
            var42.field3393.method8867(arg1 + var12);
            var42.field3393.method8887(field764.method4087(82) ? 1 : 0);
            field591.method2745(var42);
        }
        if (arg2 == 26) {
            method1876();
        }
        if (arg2 == 13) {
            class104 var43 = var13[arg3];
            if (var43 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var44 = class321.method3542(class319.field3291, field591.field1467);
                var44.field3393.method8867(arg3);
                var44.field3393.method8779(field764.method4087(82) ? 1 : 0);
                field591.method2745(var44);
            }
        }
        if (arg2 == 50) {
            class94 var45 = var14[arg3];
            if (var45 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var46 = class321.method3542(class319.field3279, field591.field1467);
                var46.field3393.method8887(field764.method4087(82) ? 1 : 0);
                var46.field3393.method8833(arg3);
                field591.method2745(var46);
            }
        }
        if (arg2 == 1) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var47 = class321.method3542(class319.field3318, field591.field1467);
            var47.field3393.method8849(Statics.field3101);
            var47.field3393.method8824(field764.method4087(82) ? 1 : 0);
            var47.field3393.method8833(Statics.field1457);
            var47.field3393.method8833(arg0 + var11);
            var47.field3393.method8867(arg1 + var12);
            var47.field3393.method8834(Statics.field4);
            var47.field3393.method8780(arg3);
            field591.method2745(var47);
        }
        if (arg2 == 2) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var48 = class321.method3542(class319.field3357, field591.field1467);
            var48.field3393.method8834(field530);
            var48.field3393.method8947(Statics.field4293);
            var48.field3393.method8779(field764.method4087(82) ? 1 : 0);
            var48.field3393.method8834(arg1 + var12);
            var48.field3393.method8833(arg0 + var11);
            var48.field3393.method8833(arg3);
            var48.field3393.method8834(field638);
            field591.method2745(var48);
        }
        if (arg2 == 8) {
            class104 var49 = var13[arg3];
            if (var49 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var50 = class321.method3542(class319.field3292, field591.field1467);
                var50.field3393.method8824(field764.method4087(82) ? 1 : 0);
                var50.field3393.method8833(field638);
                var50.field3393.method8981(Statics.field4293);
                var50.field3393.method8834(arg3);
                var50.field3393.method8780(field530);
                field591.method2745(var50);
            }
        }
        if (arg2 == 51) {
            class94 var51 = var14[arg3];
            if (var51 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var52 = class321.method3542(class319.field3352, field591.field1467);
                var52.field3393.method8826(field764.method4087(82) ? 1 : 0);
                var52.field3393.method8834(arg3);
                field591.method2745(var52);
            }
        }
        if (arg2 == 58) {
            class358 var53 = Statics.field75.method5909(arg1, arg0);
            if (var53 != null) {
                if (var53.field3958 != null) {
                    class90 var54 = new class90();
                    var54.field1095 = var53;
                    var54.field1098 = arg3;
                    var54.field1097 = arg7;
                    var54.field1103 = var53.field3958;
                    class73.method6486(var54);
                }
                class321 var55 = class321.method3542(class319.field3355, field591.field1467);
                var55.field3393.method8947(arg1);
                var55.field3393.method8867(field638);
                var55.field3393.method8867(arg0);
                var55.field3393.method8780(field530);
                var55.field3393.method8981(Statics.field4293);
                var55.field3393.method8867(arg4);
                field591.method2745(var55);
            }
        }
        if (arg2 == 47) {
            class94 var56 = var14[arg3];
            if (var56 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var57 = class321.method3542(class319.field3308, field591.field1467);
                var57.field3393.method8887(field764.method4087(82) ? 1 : 0);
                var57.field3393.method8780(arg3);
                field591.method2745(var57);
            }
        }
        if (arg2 == 28) {
            class321 var58 = class321.method3542(class319.field3288, field591.field1467);
            var58.field3393.method8981(arg1);
            field591.method2745(var58);
            class358 var59 = Statics.field75.method5906(arg1);
            if (var59 != null && var59.field3856 != null && var59.field3856[0][0] == 5) {
                int var60 = var59.field3856[0][1];
                class346.field3710[var60] = 1 - class346.field3710[var60];
                method3070(var60);
            }
        }
        if (arg2 == 1001) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var61 = class321.method3542(class319.field3276, field591.field1467);
            var61.field3393.method8834(arg1 + var12);
            var61.field3393.method8834(arg3);
            var61.field3393.method8779(field764.method4087(82) ? 1 : 0);
            var61.field3393.method8834(arg0 + var11);
            field591.method2745(var61);
        }
        if (arg2 == 44) {
            class94 var62 = var14[arg3];
            if (var62 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var63 = class321.method3542(class319.field3275, field591.field1467);
                var63.field3393.method8826(field764.method4087(82) ? 1 : 0);
                var63.field3393.method8834(arg3);
                field591.method2745(var63);
            }
        }
        if (arg2 == 30 && field576 == null) {
            method850(arg1, arg0);
            field576 = Statics.field75.method5909(arg1, arg0);
            Statics.method5599(field576);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class358 var64 = Statics.field75.method5909(arg1, arg0);
            if (var64 != null) {
                method5926(arg3, arg1, arg0, arg4, arg7);
            }
        }
        if (arg2 == 16) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var65 = class321.method3542(class319.field3349, field591.field1467);
            var65.field3393.method8834(arg1 + var12);
            var65.field3393.method8867(Statics.field1457);
            var65.field3393.method8834(Statics.field4);
            var65.field3393.method8849(Statics.field3101);
            var65.field3393.method8867(arg3);
            var65.field3393.method8887(field764.method4087(82) ? 1 : 0);
            var65.field3393.method8834(arg0 + var11);
            field591.method2745(var65);
        }
        if (arg2 == 20) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var66 = class321.method3542(class319.field3329, field591.field1467);
            var66.field3393.method8824(field764.method4087(82) ? 1 : 0);
            var66.field3393.method8833(arg3);
            var66.field3393.method8834(arg0 + var11);
            var66.field3393.method8780(arg1 + var12);
            field591.method2745(var66);
        }
        if (arg2 == 25) {
            class358 var67 = Statics.field75.method5909(arg1, arg0);
            if (var67 != null) {
                method1864();
                method6483(arg1, arg0, class359.method3320(method3177(var67)), arg4);
                field745 = 0;
                field694 = method2611(var67);
                if (field694 == null) {
                    field694 = class378.field4097;
                }
                if (var67.field3814) {
                    field621 = var67.field3924 + class105.method7700(16777215);
                } else {
                    field621 = class105.method7700(65280) + var67.field3849 + class105.method7700(16777215);
                }
            }
            return;
        }
        if (arg2 == 23) {
            if (field671) {
                Statics.field3967.field1332.method4557();
            } else {
                Statics.field3967.field1332.method4556(Statics.field3967.field1349, arg0, arg1, true);
            }
            for (int var68 = 0; var68 < Statics.field3967.field1335; var68++) {
                class476 var69 = Statics.field3967.field1348[Statics.field3967.field1351[var68]];
                if (var69 != null) {
                    if (field671) {
                        var69.field4948.field1332.method4557();
                    } else {
                        var69.field4948.field1332.method4556(var69.field4948.field1349, arg0, arg1, true);
                    }
                }
            }
        }
        if (arg2 == 6) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var70 = class321.method3542(class319.field3280, field591.field1467);
            var70.field3393.method8824(field764.method4087(82) ? 1 : 0);
            var70.field3393.method8833(arg3);
            var70.field3393.method8833(arg0 + var11);
            var70.field3393.method8834(arg1 + var12);
            field591.method2745(var70);
        }
        if (arg2 == 17) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var71 = class321.method3542(class319.field3371, field591.field1467);
            var71.field3393.method8833(field638);
            var71.field3393.method8833(arg3);
            var71.field3393.method8834(arg0 + var11);
            var71.field3393.method8833(field530);
            var71.field3393.method8824(field764.method4087(82) ? 1 : 0);
            var71.field3393.method8780(arg1 + var12);
            var71.field3393.method8947(Statics.field4293);
            field591.method2745(var71);
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field18.method8313(arg2, arg3, new class347(arg0), new class347(arg1));
        }
        if (arg2 == 22) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var72 = class321.method3542(class319.field3300, field591.field1467);
            var72.field3393.method8867(arg3);
            var72.field3393.method8867(arg0 + var11);
            var72.field3393.method8887(field764.method4087(82) ? 1 : 0);
            var72.field3393.method8834(arg1 + var12);
            field591.method2745(var72);
        }
        if (arg2 == 12) {
            class104 var73 = var13[arg3];
            if (var73 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var74 = class321.method3542(class319.field3362, field591.field1467);
                var74.field3393.method8826(field764.method4087(82) ? 1 : 0);
                var74.field3393.method8834(arg3);
                field591.method2745(var74);
            }
        }
        if (arg2 == 19) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var75 = class321.method3542(class319.field3301, field591.field1467);
            var75.field3393.method8780(arg3);
            var75.field3393.method8824(field764.method4087(82) ? 1 : 0);
            var75.field3393.method8834(arg0 + var11);
            var75.field3393.method8867(arg1 + var12);
            field591.method2745(var75);
        }
        if (arg2 == 5) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var76 = class321.method3542(class319.field3367, field591.field1467);
            var76.field3393.method8887(field764.method4087(82) ? 1 : 0);
            var76.field3393.method8867(arg1 + var12);
            var76.field3393.method8833(arg0 + var11);
            var76.field3393.method8780(arg3);
            field591.method2745(var76);
        }
        if (arg2 == 1004) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            class321 var77 = class321.method3542(class319.field3303, field591.field1467);
            var77.field3393.method8867(arg0 + var11);
            var77.field3393.method8833(arg1 + var12);
            var77.field3393.method8780(arg3);
            field591.method2745(var77);
        }
        if (arg2 == 18) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            field777 = arg0;
            field637 = arg1;
            class321 var78 = class321.method3542(class319.field3285, field591.field1467);
            var78.field3393.method8780(arg0 + var11);
            var78.field3393.method8779(field764.method4087(82) ? 1 : 0);
            var78.field3393.method8833(arg1 + var12);
            var78.field3393.method8867(arg3);
            field591.method2745(var78);
        }
        if (arg2 == 1003) {
            field741 = arg8;
            field647 = arg9;
            field778 = 2;
            field648 = 0;
            class104 var79 = var13[arg3];
            if (var79 != null) {
                class210 var80 = var79.field1360;
                if (var80.field2152 != null) {
                    var80 = var80.method3664();
                }
                if (var80 != null) {
                    class321 var81 = class321.method3542(class319.field3342, field591.field1467);
                    var81.field3393.method8834(var80.field2119);
                    field591.method2745(var81);
                }
            }
        }
        if (arg2 == 9) {
            class104 var82 = var13[arg3];
            if (var82 != null) {
                field741 = arg8;
                field647 = arg9;
                field778 = 2;
                field648 = 0;
                field777 = arg0;
                field637 = arg1;
                class321 var83 = class321.method3542(class319.field3307, field591.field1467);
                var83.field3393.method8834(arg3);
                var83.field3393.method8887(field764.method4087(82) ? 1 : 0);
                field591.method2745(var83);
            }
        }
        if (field745 != 0) {
            field745 = 0;
            Statics.method5599(Statics.field75.method5906(Statics.field3101));
        }
        if (field691) {
            method1864();
        }
    }

    @ObfuscatedName("db.mh(ILjava/lang/String;I)V")
    public static void method2132(int arg0, String arg1) {
        int var2 = Statics.field84.field1135.field1337.field1416;
        int[] var3 = Statics.field84.field1135.field1337.field1417;
        boolean var4 = false;
        class568 var5 = new class568(arg1, Statics.field2521);
        for (int var6 = 0; var6 < var2; var6++) {
            class94 var7 = Statics.field84.field1135.field1342[var3[var6]];
            if (var7 != null && Statics.field84 != var7 && var7.field1153 != null && var7.field1153.equals(var5)) {
                if (arg0 == 1) {
                    class321 var8 = class321.method3542(class319.field3275, field591.field1467);
                    var8.field3393.method8826(0);
                    var8.field3393.method8834(var3[var6]);
                    field591.method2745(var8);
                } else if (arg0 == 4) {
                    class321 var9 = class321.method3542(class319.field3308, field591.field1467);
                    var9.field3393.method8887(0);
                    var9.field3393.method8780(var3[var6]);
                    field591.method2745(var9);
                } else if (arg0 == 6) {
                    class321 var10 = class321.method3542(class319.field3298, field591.field1467);
                    var10.field3393.method8779(0);
                    var10.field3393.method8867(var3[var6]);
                    field591.method2745(var10);
                } else if (arg0 == 7) {
                    class321 var11 = class321.method3542(class319.field3279, field591.field1467);
                    var11.field3393.method8887(0);
                    var11.field3393.method8833(var3[var6]);
                    field591.method2745(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class114.method2802(4, "", class378.field4254 + arg1);
        }
    }

    @ObfuscatedName("ol.mv(IIIII)V")
    public static void method6483(int arg0, int arg1, int arg2, int arg3) {
        class358 var4 = Statics.field75.method5909(arg0, arg1);
        if (var4 != null && var4.field3827 != null) {
            class90 var5 = new class90();
            var5.field1095 = var4;
            var5.field1103 = var4.field3827;
            class73.method6486(var5);
        }
        field530 = arg3;
        field691 = true;
        Statics.field4293 = arg0;
        field638 = arg1;
        Statics.field4578 = arg2;
        Statics.method5599(var4);
    }

    @ObfuscatedName("cy.mq(I)V")
    public static void method1864() {
        if (!field691) {
            return;
        }
        class358 var0 = Statics.field75.method5909(Statics.field4293, field638);
        if (var0 != null && var0.field3915 != null) {
            class90 var1 = new class90();
            var1.field1095 = var0;
            var1.field1103 = var0.field3915;
            class73.method6486(var1);
        }
        field530 = -1;
        field691 = false;
        Statics.method5599(var0);
    }

    @ObfuscatedName("bq.mf(III)V")
    public static void method850(int arg0, int arg1) {
        class321 var2 = class321.method3542(class319.field3325, field591.field1467);
        var2.field3393.method8850(arg0);
        var2.field3393.method8867(arg1);
        field591.method2745(var2);
    }

    @ObfuscatedName("nv.mi(IIIILjava/lang/String;I)V")
    public static void method5926(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class358 var5 = Statics.field75.method5909(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3811 != null) {
            class90 var6 = new class90();
            var6.field1095 = var5;
            var6.field1098 = arg0;
            var6.field1097 = arg4;
            var6.field1103 = var5.field3811;
            class73.method6486(var6);
        }
        boolean var7 = true;
        if (var5.field3820 > 0) {
            var7 = method6774(var5);
        }
        if (!var7 || !class359.method3024(method3177(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            class321 var8 = class321.method3542(class319.field3353, field591.field1467);
            var8.field3393.method8981(arg1);
            var8.field3393.method8780(arg2);
            var8.field3393.method8780(arg3);
            field591.method2745(var8);
        }
        if (arg0 == 2) {
            class321 var9 = class321.method3542(class319.field3281, field591.field1467);
            var9.field3393.method8981(arg1);
            var9.field3393.method8780(arg2);
            var9.field3393.method8780(arg3);
            field591.method2745(var9);
        }
        if (arg0 == 3) {
            class321 var10 = class321.method3542(class319.field3361, field591.field1467);
            var10.field3393.method8981(arg1);
            var10.field3393.method8780(arg2);
            var10.field3393.method8780(arg3);
            field591.method2745(var10);
        }
        if (arg0 == 4) {
            class321 var11 = class321.method3542(class319.field3340, field591.field1467);
            var11.field3393.method8981(arg1);
            var11.field3393.method8780(arg2);
            var11.field3393.method8780(arg3);
            field591.method2745(var11);
        }
        if (arg0 == 5) {
            class321 var12 = class321.method3542(class319.field3344, field591.field1467);
            var12.field3393.method8981(arg1);
            var12.field3393.method8780(arg2);
            var12.field3393.method8780(arg3);
            field591.method2745(var12);
        }
        if (arg0 == 6) {
            class321 var13 = class321.method3542(class319.field3368, field591.field1467);
            var13.field3393.method8981(arg1);
            var13.field3393.method8780(arg2);
            var13.field3393.method8780(arg3);
            field591.method2745(var13);
        }
        if (arg0 == 7) {
            class321 var14 = class321.method3542(class319.field3321, field591.field1467);
            var14.field3393.method8981(arg1);
            var14.field3393.method8780(arg2);
            var14.field3393.method8780(arg3);
            field591.method2745(var14);
        }
        if (arg0 == 8) {
            class321 var15 = class321.method3542(class319.field3326, field591.field1467);
            var15.field3393.method8981(arg1);
            var15.field3393.method8780(arg2);
            var15.field3393.method8780(arg3);
            field591.method2745(var15);
        }
        if (arg0 == 9) {
            class321 var16 = class321.method3542(class319.field3345, field591.field1467);
            var16.field3393.method8981(arg1);
            var16.field3393.method8780(arg2);
            var16.field3393.method8780(arg3);
            field591.method2745(var16);
        }
        if (arg0 != 10) {
            return;
        }
        class321 var17 = class321.method3542(class319.field3311, field591.field1467);
        var17.field3393.method8981(arg1);
        var17.field3393.method8780(arg2);
        var17.field3393.method8780(arg3);
        field591.method2745(var17);
    }

    @ObfuscatedName("ln.mc(I)V")
    public static final void method5431() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field672 - 1; var1++) {
                if (field675[var1] < 1000 && field675[var1 + 1] > 1000) {
                    String var2 = field680[var1];
                    field680[var1] = field680[var1 + 1];
                    field680[var1 + 1] = var2;
                    String var3 = field679[var1];
                    field679[var1] = field679[var1 + 1];
                    field679[var1 + 1] = var3;
                    int var4 = field675[var1];
                    field675[var1] = field675[var1 + 1];
                    field675[var1 + 1] = var4;
                    int var5 = field673[var1];
                    field673[var1] = field673[var1 + 1];
                    field673[var1 + 1] = var5;
                    int var6 = field674[var1];
                    field674[var1] = field674[var1 + 1];
                    field674[var1 + 1] = var6;
                    int var7 = field676[var1];
                    field676[var1] = field676[var1 + 1];
                    field676[var1 + 1] = var7;
                    int var8 = field677[var1];
                    field677[var1] = field677[var1 + 1];
                    field677[var1 + 1] = var8;
                    int var9 = field678[var1];
                    field678[var1] = field678[var1 + 1];
                    field678[var1 + 1] = var9;
                    boolean var10 = field681[var1];
                    field681[var1] = field681[var1 + 1];
                    field681[var1 + 1] = var10;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("hx.md(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)V")
    public static final void method3494(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (field671 || field672 >= 500) {
            return;
        }
        field679[field672] = arg0;
        field680[field672] = arg1;
        field675[field672] = arg2;
        field676[field672] = arg3;
        field673[field672] = arg4;
        field674[field672] = arg5;
        field677[field672] = arg6;
        field678[field672] = arg8;
        field681[field672] = arg7;
        field672++;
    }

    @ObfuscatedName("gy.mz(I)I")
    public static final int method3181() {
        return field672 - 1;
    }

    @ObfuscatedName("fn.mj(IIIII)V")
    public static final void method3063(int arg0, int arg1, int arg2, int arg3) {
        if (field745 == 0 && !field691) {
            Statics.method353(class378.field4260, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        int var6 = 0;
        long var7 = -1L;
        for (int var9 = 0; var9 < class265.method3569(); var9++) {
            long var10 = class265.field2949[var9];
            if (var7 != var10) {
                var7 = var10;
                long var14 = class265.field2949[var9];
                int var16 = (int) (var14 >>> 0 & 0x7FL);
                int var18 = var16;
                int var19 = class265.method5518(class265.field2949[var9]);
                int var20 = var19;
                int var21 = class265.method2640(class265.field2949[var9]);
                int var23 = class265.method2622(class265.field2949[var9]);
                int var24 = var23;
                int var25 = class265.method5430(var9);
                if (var25 == 2047) {
                    var25 = -1;
                }
                class102 var26 = null;
                if (var25 >= 0 && Statics.field3967.field1348[var25] != null) {
                    var26 = Statics.field3967.field1348[var25].field4948;
                } else if (var25 == -1) {
                    var26 = Statics.field3967;
                }
                if (var26 != null) {
                    int var27 = var26.field1349;
                    if (var21 == 2 && var26.field1332.method4579(var27, var16, var19, var10) >= 0) {
                        class224 var28 = class224.method3868(var23);
                        if (var28.field2317 != null) {
                            var28 = var28.method3882();
                        }
                        if (var28 == null) {
                            continue;
                        }
                        class97 var29 = null;
                        for (class97 var30 = (class97) var26.field1343.method6834(); var30 != null; var30 = (class97) var26.field1343.method6842()) {
                            if (var30.field1201 == var27 && var30.field1193 == var18 && var30.field1197 == var20 && var30.field1194 == var24) {
                                var29 = var30;
                                break;
                            }
                        }
                        if (field745 == 1) {
                            method3494(class378.field4255, field546 + " " + class105.field1372 + " " + class105.method7700(65535) + var28.field2286, 1, var24, var18, var20, -1, false, var25);
                        } else if (!field691) {
                            String[] var31 = var28.field2303;
                            if (var31 != null) {
                                for (int var32 = 4; var32 >= 0; var32--) {
                                    if ((var29 == null || var29.method2313(var32)) && var31[var32] != null) {
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
                                        method3494(var31[var32], class105.method7700(65535) + var28.field2286, var33, var24, var18, var20, -1, false, var25);
                                    }
                                }
                            }
                            method3494(class378.field4256, class105.method7700(65535) + var28.field2286, 1002, var28.field2283, var18, var20, -1, false, var25);
                        } else if ((Statics.field4578 & 0x4) == 4) {
                            method3494(field694, field621 + " " + class105.field1372 + " " + class105.method7700(65535) + var28.field2286, 2, var24, var18, var20, -1, false, var25);
                        }
                    }
                    if (var21 == 1) {
                        class104 var34 = var26.field1344[var24];
                        if (var34 == null) {
                            continue;
                        }
                        if (var34.field1360.field2121 == 1 && (var34.field1215 & 0x7F) == 64 && (var34.field1276 & 0x7F) == 64) {
                            for (int var35 = 0; var35 < var26.field1345; var35++) {
                                class104 var36 = var26.field1344[var26.field1346[var35]];
                                if (var36 != null && var34 != var36 && var36.field1360.field2121 == 1 && var34.field1215 == var36.field1215 && var34.field1276 == var36.field1276) {
                                    method15(var36, var26.field1346[var35], var18, var20, var25);
                                }
                            }
                            int var37 = var26.field1337.field1416;
                            int[] var38 = var26.field1337.field1417;
                            for (int var39 = 0; var39 < var37; var39++) {
                                class94 var40 = var26.field1342[var38[var39]];
                                if (var40 != null && var34.field1215 == var40.field1215 && var34.field1276 == var40.field1276) {
                                    method419(var40, var38[var39], var18, var20, var25);
                                }
                            }
                        }
                        method15(var34, var24, var18, var20, var25);
                    }
                    if (var21 == 0) {
                        class94 var41 = var26.field1342[var24];
                        if (var41 == null) {
                            continue;
                        }
                        if ((var41.field1215 & 0x7F) == 64 && (var41.field1276 & 0x7F) == 64) {
                            for (int var42 = 0; var42 < var26.field1345; var42++) {
                                class104 var43 = var26.field1344[var26.field1346[var42]];
                                if (var43 != null && var43.field1360.field2121 == 1 && var41.field1215 == var43.field1215 && var41.field1276 == var43.field1276) {
                                    method15(var43, var26.field1346[var42], var18, var20, var25);
                                }
                            }
                            int var44 = var26.field1337.field1416;
                            int[] var45 = var26.field1337.field1417;
                            for (int var46 = 0; var46 < var44; var46++) {
                                class94 var47 = var26.field1342[var45[var46]];
                                if (var47 != null && var41 != var47 && var41.field1215 == var47.field1215 && var41.field1276 == var47.field1276) {
                                    method419(var47, var45[var46], var18, var20, var25);
                                }
                            }
                        }
                        if (field665 == var24) {
                            var4 = var10;
                            var6 = var25;
                        } else {
                            method419(var41, var24, var18, var20, var25);
                        }
                    }
                    if (var21 == 3) {
                        class406 var48 = var26.field1350[var27][var18][var20];
                        if (var48 != null) {
                            for (class108 var49 = (class108) var48.method6835(); var49 != null; var49 = (class108) var48.method6856()) {
                                class225 var50 = class225.method369(var49.field1401);
                                if (field745 == 1) {
                                    method3494(class378.field4255, field546 + " " + class105.field1372 + " " + class105.method7700(16748608) + var50.field2338, 16, var49.field1401, var18, var20, -1, false, var25);
                                } else if (!field691) {
                                    String[] var51 = var50.field2358;
                                    for (int var52 = 4; var52 >= 0; var52--) {
                                        if (var49.method2629(var52)) {
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
                                                method3494(var51[var52], class105.method7700(16748608) + var50.field2338, var53, var49.field1401, var18, var20, -1, false, var25);
                                            } else if (var52 == 2) {
                                                method3494(class378.field4090, class105.method7700(16748608) + var50.field2338, 20, var49.field1401, var18, var20, -1, false, var25);
                                            }
                                        }
                                    }
                                    method3494(class378.field4256, class105.method7700(16748608) + var50.field2338, 1004, var49.field1401, var18, var20, -1, false, var25);
                                } else if ((Statics.field4578 & 0x1) == 1) {
                                    method3494(field694, field621 + " " + class105.field1372 + " " + class105.method7700(16748608) + var50.field2338, 17, var49.field1401, var18, var20, -1, false, var25);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var54 = (int) (var4 >>> 0 & 0x7FL);
            int var56 = class265.method5518(var4);
            class94 var57 = Statics.field3967.field1342[field665];
            method419(var57, field665, var54, var56, var6);
        }
    }

    @ObfuscatedName("af.mp(Ldv;IIIII)V")
    public static final void method15(class104 arg0, int arg1, int arg2, int arg3, int arg4) {
        class210 var5 = arg0.field1360;
        if (field672 >= 400) {
            return;
        }
        if (var5.field2152 != null) {
            var5 = var5.method3664();
        }
        if (var5 == null || !var5.field2155 || var5.field2157 && field705 != arg1) {
            return;
        }
        String var6 = arg0.method2538();
        if (var5.field2120 != 0 && arg0.field1281 != 0) {
            int var7 = arg0.field1281 == -1 ? var5.field2120 : arg0.field1281;
            var6 = var6 + method5574(var7, Statics.field84.field1148) + " " + class105.field1371 + class378.field4261 + var7 + class105.field1376;
        }
        if (var5.field2145 && field682) {
            method3494(class378.field4256, class105.method7700(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
        }
        if (field745 == 1) {
            method3494(class378.field4255, field546 + " " + class105.field1372 + " " + class105.method7700(16776960) + var6, 7, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field691) {
            int var8 = var5.field2145 && field682 ? 2000 : 0;
            String[] var9 = var5.field2143;
            if (var9 != null) {
                for (int var10 = 4; var10 >= 0; var10--) {
                    if (arg0.method2568(var10) && var9[var10] != null && !var9[var10].equalsIgnoreCase(class378.field4146)) {
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
                        method3494(var9[var10], class105.method7700(16776960) + var6, var11, arg1, arg2, arg3, -1, false, arg4);
                    }
                }
            }
            if (var9 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (arg0.method2568(var12) && var9[var12] != null && var9[var12].equalsIgnoreCase(class378.field4146)) {
                        short var13 = 0;
                        if (field560 != class107.field1387) {
                            if (field560 == class107.field1385 || field560 == class107.field1384 && var5.field2120 > Statics.field84.field1148) {
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
                            method3494(var9[var12], class105.method7700(16776960) + var6, var14, arg1, arg2, arg3, -1, false, arg4);
                        }
                    }
                }
            }
            if (!var5.field2145 || !field682) {
                method3494(class378.field4256, class105.method7700(16776960) + var6, 1003, arg1, arg2, arg3, -1, false, arg4);
            }
        } else if ((Statics.field4578 & 0x2) == 2) {
            method3494(field694, field621 + " " + class105.field1372 + " " + class105.method7700(16776960) + var6, 8, arg1, arg2, arg3, -1, false, arg4);
        }
    }

    @ObfuscatedName("bo.me(Lde;IIIII)V")
    public static final void method419(class94 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (field689 == arg0.field1158 || field672 >= 400) {
            return;
        }
        String var5;
        if (arg0.field1142 == 0) {
            var5 = arg0.field1140[0] + arg0.field1153 + arg0.field1140[1] + method5574(arg0.field1148, Statics.field84.field1148) + " " + class105.field1371 + class378.field4261 + arg0.field1148 + class105.field1376 + arg0.field1140[2];
        } else {
            var5 = arg0.field1140[0] + arg0.field1153 + arg0.field1140[1] + " " + class105.field1371 + class378.field4262 + arg0.field1142 + class105.field1376 + arg0.field1140[2];
        }
        if (field745 == 1) {
            method3494(class378.field4255, field546 + " " + class105.field1372 + " " + class105.method7700(16777215) + var5, 14, arg1, arg2, arg3, -1, false, arg4);
        } else if (!field691) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (field722[var6] != null) {
                    short var7 = 0;
                    if (field722[var6].equalsIgnoreCase(class378.field4146)) {
                        if (field559 == class107.field1387) {
                            continue;
                        }
                        if (field559 == class107.field1385 || field559 == class107.field1384 && arg0.field1148 > Statics.field84.field1148) {
                            var7 = 2000;
                        }
                        if (Statics.field84.field1165 == 0 || arg0.field1165 == 0) {
                            if (field559 == class107.field1391 && arg0.method2300()) {
                                var7 = 2000;
                            }
                        } else if (Statics.field84.field1165 == arg0.field1165) {
                            var7 = 2000;
                        } else {
                            var7 = 0;
                        }
                    } else if (field645[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    int var9 = field661[var6] + var7;
                    method3494(field722[var6], class105.method7700(16777215) + var5, var9, arg1, arg2, arg3, -1, false, arg4);
                }
            }
        } else if ((Statics.field4578 & 0x8) == 8) {
            method3494(field694, field621 + " " + class105.field1372 + " " + class105.method7700(16777215) + var5, 15, arg1, arg2, arg3, -1, false, arg4);
        }
        for (int var10 = 0; var10 < field672; var10++) {
            if (field675[var10] == 23) {
                field680[var10] = class105.method7700(16777215) + var5;
                break;
            }
        }
    }

    @ObfuscatedName("mq.mo(IIB)Ljava/lang/String;")
    public static final String method5574(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class105.method7700(16711680);
        } else if (var2 < -6) {
            return class105.method7700(16723968);
        } else if (var2 < -3) {
            return class105.method7700(16740352);
        } else if (var2 < 0) {
            return class105.method7700(16756736);
        } else if (var2 > 9) {
            return class105.method7700(65280);
        } else if (var2 > 6) {
            return class105.method7700(4259584);
        } else if (var2 > 3) {
            return class105.method7700(8453888);
        } else if (var2 > 0) {
            return class105.method7700(12648192);
        } else {
            return class105.method7700(16776960);
        }
    }

    @ObfuscatedName("oo.mk(IIIIIIIIB)V")
    public static final void method6476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field75.method5908(arg0)) {
            Statics.field2011 = null;
            method6474(Statics.field75.field3722[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2011 != null) {
                method6474(Statics.field2011, -1412584499, arg1, arg2, arg3, arg4, Statics.field1909, Statics.field5, arg7);
                Statics.field2011 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field657[var8] = true;
            }
        } else {
            field657[arg7] = true;
        }
    }

    @ObfuscatedName("of.mg([Lnb;IIIIIIIII)V")
    public static final void method6474(class358[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class556.method9104(arg2, arg3, arg4, arg5);
        class248.method4398();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class358 var10 = arg0[var9];
            if (var10 != null && (var10.field3965 == arg1 || arg1 == -1412584499 && field708 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field765[field744] = var10.field3844 + arg6;
                    field750[field744] = var10.field3830 + arg7;
                    field751[field744] = var10.field3831;
                    field800[field744] = var10.field3875;
                    var11 = ++field744 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3960 = var11;
                var10.field3901 = field821;
                if (!var10.field3814 || !method6456(var10)) {
                    if (var10.field3820 > 0) {
                        Statics.method3104(var10);
                    }
                    int var12 = var10.field3844 + arg6;
                    int var13 = var10.field3830 + arg7;
                    int var14 = var10.field3847;
                    if (field708 == var10) {
                        if (arg1 != -1412584499 && !var10.field3962) {
                            Statics.field2011 = arg0;
                            Statics.field1909 = arg6;
                            Statics.field5 = arg7;
                            continue;
                        }
                        if (field719 && field735) {
                            int var15 = class36.field230;
                            int var16 = class36.field221;
                            int var17 = var15 - field687;
                            int var18 = var16 - field711;
                            if (var17 < field714) {
                                var17 = field714;
                            }
                            if (var10.field3831 + var17 > field714 + field709.field3831) {
                                var17 = field714 + field709.field3831 - var10.field3831;
                            }
                            if (var18 < field796) {
                                var18 = field796;
                            }
                            if (var10.field3875 + var18 > field796 + field709.field3875) {
                                var18 = field796 + field709.field3875 - var10.field3875;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3962) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3894 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3831 + var12;
                        int var22 = var10.field3875 + var13;
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
                        int var29 = var10.field3831 + var12;
                        int var30 = var10.field3875 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3814 || var25 < var27 && var26 < var28) {
                        if (var10.field3820 != 0) {
                            if (var10.field3820 == 1336) {
                                if (Statics.field4879.method2397()) {
                                    var13 += 15;
                                    Statics.field3069.method7467("Fps:" + field195, var10.field3831 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field642) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3069.method7467("Mem:" + var32 + "k", var10.field3831 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3820 == 1337) {
                                field704 = var12;
                                field686 = var13;
                                method4743(var12, var13, var10.field3831, var10.field3875);
                                field657[var10.field3960] = true;
                                class556.method9104(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3820 == 1338) {
                                method3228(var10, var12, var13, var11);
                                class556.method9104(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3820 == 1339) {
                                method3066(var10, var12, var13, var11);
                                class556.method9104(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3820 == 1400) {
                                Statics.field18.method8275(var12, var13, var10.field3831, var10.field3875, field821, Statics.field4879.method2401());
                            }
                            if (var10.field3820 == 1401) {
                                Statics.field18.method8365(var12, var13, var10.field3831, var10.field3875);
                            }
                            if (var10.field3820 == 1402) {
                                Statics.field2546.method2365(var12, field821);
                            }
                        }
                        if (var10.field3894 == 0) {
                            if (!var10.field3814 && method6456(var10) && Statics.field231 != var10) {
                                continue;
                            }
                            if (!var10.field3814) {
                                if (var10.field3838 > var10.field3840 - var10.field3875) {
                                    var10.field3838 = var10.field3840 - var10.field3875;
                                }
                                if (var10.field3838 < 0) {
                                    var10.field3838 = 0;
                                }
                            }
                            method6474(arg0, var10.field3815, var25, var26, var27, var28, var12 - var10.field3837, var13 - var10.field3838, var11);
                            if (var10.field3884 != null) {
                                method6474(var10.field3884, var10.field3815, var25, var26, var27, var28, var12 - var10.field3837, var13 - var10.field3838, var11);
                            }
                            class89 var34 = (class89) field697.method8528((long) var10.field3815);
                            if (var34 != null) {
                                method6476(var34.field1090, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class556.method9104(arg2, arg3, arg4, arg5);
                            class248.method4398();
                        } else if (var10.field3894 == 11) {
                            if (method6456(var10) && Statics.field231 != var10) {
                                continue;
                            }
                            if (var10.field3884 != null) {
                                method6474(var10.field3884, var10.field3815, var25, var26, var27, var28, var12 - var10.field3837, var13 - var10.field3838, var11);
                            }
                            class556.method9104(arg2, arg3, arg4, arg5);
                            class248.method4398();
                        }
                        if (field755 || field758[var11] || field753 > 1) {
                            if (var10.field3894 == 0 && !var10.field3814 && var10.field3840 > var10.field3875) {
                                method4779(var10.field3831 + var12, var13, var10.field3838, var10.field3875, var10.field3840);
                            }
                            if (var10.field3894 != 1) {
                                if (var10.field3894 == 3) {
                                    int var35;
                                    if (method4203(var10)) {
                                        var35 = var10.field3842;
                                        if (Statics.field231 == var10 && var10.field3926 != 0) {
                                            var35 = var10.field3926;
                                        }
                                    } else {
                                        var35 = var10.field3841;
                                        if (Statics.field231 == var10 && var10.field3843 != 0) {
                                            var35 = var10.field3843;
                                        }
                                    }
                                    if (var10.field3845) {
                                        switch(var10.field3809.field5430) {
                                            case 1:
                                                class556.method9181(var12, var13, var10.field3831, var10.field3875, var10.field3841, var10.field3842);
                                                break;
                                            case 2:
                                                class556.method9122(var12, var13, var10.field3831, var10.field3875, var10.field3841, var10.field3842, 255 - (var10.field3847 & 0xFF), 255 - (var10.field3848 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class556.method9112(var12, var13, var10.field3831, var10.field3875, var35);
                                                } else {
                                                    class556.method9111(var12, var13, var10.field3831, var10.field3875, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class556.method9116(var12, var13, var10.field3831, var10.field3875, var35);
                                    } else {
                                        class556.method9117(var12, var13, var10.field3831, var10.field3875, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3894 == 4) {
                                    class431 var36 = var10.method6285(Statics.field75);
                                    if (var36 != null) {
                                        String var37 = var10.field3879;
                                        int var38;
                                        if (method4203(var10)) {
                                            var38 = var10.field3842;
                                            if (Statics.field231 == var10 && var10.field3926 != 0) {
                                                var38 = var10.field3926;
                                            }
                                            if (var10.field3880.length() > 0) {
                                                var37 = var10.field3880;
                                            }
                                        } else {
                                            var38 = var10.field3841;
                                            if (Statics.field231 == var10 && var10.field3843 != 0) {
                                                var38 = var10.field3843;
                                            }
                                        }
                                        if (var10.field3814 && var10.field3949 != -1) {
                                            class225 var39 = class225.method369(var10.field3949);
                                            var37 = var39.field2338;
                                            if (var37 == null) {
                                                var37 = class378.field4097;
                                            }
                                            if ((var39.field2351 == 1 || var10.field3950 != 1) && var10.field3950 != -1) {
                                                var37 = class105.method7700(16748608) + var37 + class105.field1369 + " " + 'x' + method4067(var10.field3950);
                                            }
                                        }
                                        if (field576 == var10) {
                                            var37 = class378.field4263;
                                            var38 = var10.field3841;
                                        }
                                        if (!var10.field3814) {
                                            var37 = method8158(var37, var10);
                                        }
                                        var36.method7470(var37, var12, var13, var10.field3831, var10.field3875, var38, var10.field3890 ? 0 : -1, class498.method8177(var10.field3847), var10.field3882, var10.field3883, var10.field3896);
                                    } else if (class358.field3813) {
                                        Statics.method5599(var10);
                                    }
                                } else if (var10.field3894 == 5) {
                                    if (var10.field3814) {
                                        class560 var41;
                                        if (var10.field3949 == -1) {
                                            var41 = var10.method6370(Statics.field75, false, Statics.field3400);
                                        } else {
                                            var41 = class225.method3302(var10.field3949, var10.field3950, var10.field3833, var10.field3857, var10.field3877, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5449;
                                            int var43 = var41.field5446;
                                            if (var10.field3832) {
                                                class556.method9113(var12, var13, var10.field3831 + var12, var10.field3875 + var13);
                                                int var44 = (var10.field3831 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3875 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3916 != 0) {
                                                            var41.method9246(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3916, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method9319(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method9233(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class556.method9104(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3831 * 4096 / var42;
                                                if (var10.field3916 != 0) {
                                                    var41.method9246(var10.field3831 / 2 + var12, var10.field3875 / 2 + var13, var10.field3916, var48);
                                                } else if (var14 != 0) {
                                                    var41.method9235(var12, var13, var10.field3831, var10.field3875, 256 - (var14 & 0xFF));
                                                } else if (var10.field3831 == var42 && var10.field3875 == var43) {
                                                    var41.method9319(var12, var13);
                                                } else {
                                                    var41.method9243(var12, var13, var10.field3831, var10.field3875);
                                                }
                                            }
                                        } else if (class358.field3813) {
                                            Statics.method5599(var10);
                                        }
                                    } else {
                                        class560 var40 = var10.method6370(Statics.field75, method4203(var10), Statics.field3400);
                                        if (var40 != null) {
                                            var40.method9319(var12, var13);
                                        } else if (class358.field3813) {
                                            Statics.method5599(var10);
                                        }
                                    }
                                } else if (var10.field3894 == 6) {
                                    boolean var49 = method4203(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3865;
                                    } else {
                                        var50 = var10.field3864;
                                    }
                                    class264 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3949 != -1) {
                                        class225 var53 = class225.method369(var10.field3949);
                                        if (var53 != null) {
                                            class225 var54 = var53.method3933(var10.field3950);
                                            var51 = var54.method3932(1);
                                            if (var51 == null) {
                                                Statics.method5599(var10);
                                            } else {
                                                var51.method4806();
                                                var52 = var51.field2801 / 2;
                                            }
                                        }
                                    } else if (var10.field3931 == 5) {
                                        if (var10.field3861 == 0) {
                                            var51 = field814.method5977((class227) null, -1, (class227) null, -1);
                                        } else {
                                            var51 = Statics.field84.method2007();
                                        }
                                    } else if (var10.field3931 == 7) {
                                        var51 = var10.field3903.method5977((class227) null, -1, class227.method4744(Statics.field84.field1211), Statics.field84.field1272);
                                    } else {
                                        class209 var55 = null;
                                        if (var10.field3931 == 6) {
                                            int var56 = var10.field3861;
                                            if (var56 >= 0 && var56 < Statics.field3967.field1344.length) {
                                                class104 var57 = Statics.field3967.field1344[var56];
                                                if (var57 != null && var57.field1360 != null) {
                                                    int var58 = var57.field1360.method3680();
                                                    if (var58 != -1) {
                                                        var10.field3861 = var58;
                                                    }
                                                    var55 = var57.method2548();
                                                }
                                            }
                                        } else if (var10.field3931 == 2) {
                                            int var59 = var10.field3861;
                                            int var60 = class210.method2967(var59).method3680();
                                            if (var60 != -1) {
                                                var10.field3861 = var60;
                                            }
                                        }
                                        class227 var61 = null;
                                        int var62 = -1;
                                        if (var50 != -1) {
                                            var61 = class227.method4744(var50);
                                            var62 = var10.field3951;
                                        }
                                        var51 = var10.method6290(Statics.field75, var61, var62, var49, Statics.field84.field1157, var55);
                                        if (var51 == null && class358.field3813) {
                                            Statics.method5599(var10);
                                        }
                                    }
                                    class248.method4345(var10.field3831 / 2 + var12, var10.field3875 / 2 + var13);
                                    int var63 = var10.field3871 * class248.field2665[var10.field3868] >> 16;
                                    int var64 = var10.field3871 * class248.field2669[var10.field3868] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3814) {
                                            var51.method4806();
                                            if (var10.field3839) {
                                                var51.method4824(0, var10.field3953, var10.field3870, var10.field3868, var10.field3908, var10.field3923 + var52 + var63, var10.field3923 + var64, var10.field3871);
                                            } else {
                                                var51.method4914(0, var10.field3953, var10.field3870, var10.field3868, var10.field3908, var10.field3923 + var52 + var63, var10.field3923 + var64);
                                            }
                                        } else {
                                            var51.method4914(0, var10.field3953, 0, var10.field3868, 0, var63, var64);
                                        }
                                    }
                                    class248.method4344();
                                } else {
                                    if (var10.field3894 == 8 && Statics.field2163 == var10 && field781 == field688) {
                                        int var65 = 0;
                                        int var66 = 0;
                                        class431 var67 = Statics.field3069;
                                        String var68 = var10.field3879;
                                        String var69 = method8158(var68, var10);
                                        while (var69.length() > 0) {
                                            int var70 = var69.indexOf(class105.field1375);
                                            String var71;
                                            if (var70 == -1) {
                                                var71 = var69;
                                                var69 = "";
                                            } else {
                                                var71 = var69.substring(0, var70);
                                                var69 = var69.substring(var70 + 4);
                                            }
                                            int var72 = var67.method7547(var71);
                                            if (var72 > var65) {
                                                var65 = var72;
                                            }
                                            var66 += var67.field4760 + 1;
                                        }
                                        var65 += 6;
                                        var66 += 7;
                                        int var73 = var10.field3831 + var12 - 5 - var65;
                                        int var74 = var10.field3875 + var13 + 5;
                                        if (var73 < var12 + 5) {
                                            var73 = var12 + 5;
                                        }
                                        if (var65 + var73 > arg4) {
                                            var73 = arg4 - var65;
                                        }
                                        if (var66 + var74 > arg5) {
                                            var74 = arg5 - var66;
                                        }
                                        class556.method9112(var73, var74, var65, var66, 16777120);
                                        class556.method9116(var73, var74, var65, var66, 0);
                                        String var75 = var10.field3879;
                                        int var76 = var67.field4760 + var74 + 2;
                                        String var77 = method8158(var75, var10);
                                        while (var77.length() > 0) {
                                            int var78 = var77.indexOf(class105.field1375);
                                            String var79;
                                            if (var78 == -1) {
                                                var79 = var77;
                                                var77 = "";
                                            } else {
                                                var79 = var77.substring(0, var78);
                                                var77 = var77.substring(var78 + 4);
                                            }
                                            var67.method7488(var79, var73 + 3, var76, 0, -1);
                                            var76 += var67.field4760 + 1;
                                        }
                                    }
                                    if (var10.field3894 == 9) {
                                        int var80;
                                        int var81;
                                        int var82;
                                        int var83;
                                        if (var10.field3850) {
                                            var80 = var12;
                                            var81 = var10.field3875 + var13;
                                            var82 = var10.field3831 + var12;
                                            var83 = var13;
                                        } else {
                                            var80 = var12;
                                            var81 = var13;
                                            var82 = var10.field3831 + var12;
                                            var83 = var10.field3875 + var13;
                                        }
                                        if (var10.field3893 == 1) {
                                            class556.method9180(var80, var81, var82, var83, var10.field3841);
                                        } else {
                                            method2026(var80, var81, var82, var83, var10.field3841, var10.field3893);
                                        }
                                    } else if (var10.field3894 == 12) {
                                        class356 var84 = var10.method6312();
                                        class350 var85 = var10.method6313();
                                        if (var84 != null && var85 != null && var84.method6043()) {
                                            class431 var86 = var10.method6285(Statics.field75);
                                            if (var86 != null) {
                                                field738.method9374(var12, var13, var10.field3831, var10.field3875, var84.method6042(), var84.method6067(), var84.method6041(), var84.method6192(), var84.method6040());
                                                int var87 = var10.field3890 ? var10.field3857 : -1;
                                                if (!var84.method6163() && var84.method6035().method7323()) {
                                                    field738.method9367(var85.field3734, var87, var85.field3732, var85.field3733);
                                                    field738.method9369(var84.method6036(), var86);
                                                } else {
                                                    field738.method9367(var10.field3841, var87, var85.field3732, var85.field3733);
                                                    field738.method9369(var84.method6035(), var86);
                                                }
                                                class556.method9104(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("cj.ms(IIIIIII)V")
    public static final void method2026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class556.field5419;
        int var18 = arg1 - class556.field5417;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class248.method4328(var19, var20, var21);
        class248.method4378(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class248.method4328(var19, var21, var22);
        class248.method4378(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("tw.mt(Ljava/lang/String;Lnb;B)Ljava/lang/String;")
    public static String method8158(String arg0, class358 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method8476(arg1, var2 - 1);
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

    @ObfuscatedName("iu.mw(II)Ljava/lang/String;")
    public static final String method4067(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class105.field1370 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class105.method7700(65408) + var1.substring(0, var1.length() - 8) + class378.field4266 + " " + class105.field1371 + var1 + class105.field1376 + class105.field1369;
        } else if (var1.length() > 6) {
            return " " + class105.method7700(16777215) + var1.substring(0, var1.length() - 4) + class378.field4268 + " " + class105.field1371 + var1 + class105.field1376 + class105.field1369;
        } else {
            return " " + class105.method7700(16776960) + var1 + class105.field1369;
        }
    }

    @ObfuscatedName("client.mx(ZB)V")
    public final void method1709(boolean arg0) {
        method2210(field783, Statics.field190, Statics.field5283, arg0);
    }

    @ObfuscatedName("client.ma(Lnb;I)V")
    public void method1183(class358 arg0) {
        class358 var2 = arg0.field3965 == -1 ? null : Statics.field75.method5906(arg0.field3965);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field190;
            var4 = Statics.field5283;
        } else {
            var3 = var2.field3831;
            var4 = var2.field3875;
        }
        method5927(arg0, var3, var4, false);
        method47(arg0, var3, var4);
    }

    @ObfuscatedName("fl.my([Lnb;Lnb;ZB)V")
    public static void method3068(class358[] arg0, class358 arg1, boolean arg2) {
        int var3 = arg1.field3939 == 0 ? arg1.field3831 : arg1.field3939;
        int var4 = arg1.field3840 == 0 ? arg1.field3875 : arg1.field3840;
        method3869(arg0, arg1.field3815, var3, var4, arg2);
        if (arg1.field3884 != null) {
            method3869(arg1.field3884, arg1.field3815, var3, var4, arg2);
        }
        class89 var5 = (class89) field697.method8528((long) arg1.field3815);
        if (var5 != null) {
            method2210(var5.field1090, var3, var4, arg2);
        }
        if (arg1.field3820 == 1337) {
        }
    }

    @ObfuscatedName("da.mu(IIIZI)V")
    public static final void method2210(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.field75.method5908(arg0)) {
            method3869(Statics.field75.field3722[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ij.mr([Lnb;IIIZI)V")
    public static void method3869(class358[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class358 var6 = arg0[var5];
            if (var6 != null && var6.field3965 == arg1) {
                method5927(var6, arg2, arg3, arg4);
                method47(var6, arg2, arg3);
                if (var6.field3837 > var6.field3939 - var6.field3831) {
                    var6.field3837 = var6.field3939 - var6.field3831;
                }
                if (var6.field3837 < 0) {
                    var6.field3837 = 0;
                }
                if (var6.field3838 > var6.field3840 - var6.field3875) {
                    var6.field3838 = var6.field3840 - var6.field3875;
                }
                if (var6.field3838 < 0) {
                    var6.field3838 = 0;
                }
                if (var6.field3894 == 0) {
                    method3068(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("ny.mm(Lnb;IIZI)V")
    public static void method5927(class358 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3831;
        int var5 = arg0.field3875;
        if (arg0.field3917 == 0) {
            arg0.field3831 = arg0.field3867;
        } else if (arg0.field3917 == 1) {
            arg0.field3831 = arg1 - arg0.field3867;
        } else if (arg0.field3917 == 2) {
            arg0.field3831 = arg0.field3867 * arg1 >> 14;
        }
        if (arg0.field3824 == 0) {
            arg0.field3875 = arg0.field3846;
        } else if (arg0.field3824 == 1) {
            arg0.field3875 = arg2 - arg0.field3846;
        } else if (arg0.field3824 == 2) {
            arg0.field3875 = arg0.field3846 * arg2 >> 14;
        }
        if (arg0.field3917 == 4) {
            arg0.field3831 = arg0.field3887 * arg0.field3875 / arg0.field3834;
        }
        if (arg0.field3824 == 4) {
            arg0.field3875 = arg0.field3834 * arg0.field3831 / arg0.field3887;
        }
        if (arg0.field3820 == 1337) {
            field584 = arg0;
        }
        if (arg0.field3894 == 12) {
            arg0.method6312().method5992(arg0.field3831, arg0.field3875);
        }
        if (arg3 && arg0.field3941 != null && (arg0.field3831 != var4 || arg0.field3875 != var5)) {
            class90 var6 = new class90();
            var6.field1095 = arg0;
            var6.field1103 = arg0.field3941;
            field739.method6829(var6);
        }
    }

    @ObfuscatedName("ab.ml(Lnb;IIB)V")
    public static void method47(class358 arg0, int arg1, int arg2) {
        if (arg0.field3821 == 0) {
            arg0.field3844 = arg0.field3825;
        } else if (arg0.field3821 == 1) {
            arg0.field3844 = (arg1 - arg0.field3831) / 2 + arg0.field3825;
        } else if (arg0.field3821 == 2) {
            arg0.field3844 = arg1 - arg0.field3831 - arg0.field3825;
        } else if (arg0.field3821 == 3) {
            arg0.field3844 = arg0.field3825 * arg1 >> 14;
        } else if (arg0.field3821 == 4) {
            arg0.field3844 = (arg0.field3825 * arg1 >> 14) + (arg1 - arg0.field3831) / 2;
        } else {
            arg0.field3844 = arg1 - arg0.field3831 - (arg0.field3825 * arg1 >> 14);
        }
        if (arg0.field3822 == 0) {
            arg0.field3830 = arg0.field3826;
        } else if (arg0.field3822 == 1) {
            arg0.field3830 = (arg2 - arg0.field3875) / 2 + arg0.field3826;
        } else if (arg0.field3822 == 2) {
            arg0.field3830 = arg2 - arg0.field3875 - arg0.field3826;
        } else if (arg0.field3822 == 3) {
            arg0.field3830 = arg0.field3826 * arg2 >> 14;
        } else if (arg0.field3822 == 4) {
            arg0.field3830 = (arg0.field3826 * arg2 >> 14) + (arg2 - arg0.field3875) / 2;
        } else {
            arg0.field3830 = arg2 - arg0.field3875 - (arg0.field3826 * arg2 >> 14);
        }
    }

    @ObfuscatedName("an.no(Lnb;IIIIIII)V")
    public static final void method291(class358 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field612) {
            field613 = 32;
        } else {
            field613 = 0;
        }
        field612 = false;
        if (class36.field228 == 1 || !Statics.field1379 && class36.field228 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3838 -= 4;
                Statics.method5599(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3838 += 4;
                Statics.method5599(arg0);
            } else if (arg5 >= arg1 - field613 && arg5 < field613 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3838 = (arg4 - arg3) * var8 / var9;
                Statics.method5599(arg0);
                field612 = true;
            }
        }
        if (field737 == 0) {
            return;
        }
        int var10 = arg0.field3831;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3838 += field737 * 45;
            Statics.method5599(arg0);
        }
    }

    @ObfuscatedName("jj.ne(IIIIII)V")
    public static final void method4779(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1492[0].method9196(arg0, arg1);
        Statics.field1492[1].method9196(arg0, arg1 + arg3 - 16);
        class556.method9112(arg0, arg1 + 16, 16, arg3 - 32, field760);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class556.method9112(arg0, arg1 + 16 + var6, 16, var5, field609);
        class556.method9145(arg0, arg1 + 16 + var6, var5, field663);
        class556.method9145(arg0 + 1, arg1 + 16 + var6, var5, field663);
        class556.method9160(arg0, arg1 + 16 + var6, 16, field663);
        class556.method9160(arg0, arg1 + 17 + var6, 16, field663);
        class556.method9145(arg0 + 15, arg1 + 16 + var6, var5, field527);
        class556.method9145(arg0 + 14, arg1 + 17 + var6, var5 - 1, field527);
        class556.method9160(arg0, arg1 + 15 + var6 + var5, 16, field527);
        class556.method9160(arg0 + 1, arg1 + 14 + var6 + var5, 15, field527);
    }

    @ObfuscatedName("jr.ng(Lnb;I)Z")
    public static final boolean method4203(class358 arg0) {
        if (arg0.field3942 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3942.length; var1++) {
            int var2 = method8476(arg0, var1);
            int var3 = arg0.field3943[var1];
            if (arg0.field3942[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3942[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3942[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("tc.ns(Lnb;IB)I")
    public static final int method8476(class358 arg0, int arg1) {
        if (arg0.field3856 == null || arg1 >= arg0.field3856.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3856[arg1];
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
                    var7 = field538[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field667[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field668[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class358 var11 = Statics.field75.method5906(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class225.method369(var12).field2356 || field571)) {
                        for (int var13 = 0; var13 < var11.field3947.length; var13++) {
                            if (var12 + 1 == var11.field3947[var13]) {
                                var7 += var11.field3808[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class346.field3710[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class368.field4020[field667[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class346.field3710[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field84.field1148;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class368.field4018[var14]) {
                            var7 += field667[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class358 var17 = Statics.field75.method5906(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class225.method369(var18).field2356 || field571)) {
                        for (int var19 = 0; var19 < var17.field3947.length; var19++) {
                            if (var18 + 1 == var17.field3947[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field702;
                }
                if (var6 == 12) {
                    var7 = field703;
                }
                if (var6 == 13) {
                    int var20 = class346.field3710[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class346.method5576(var22);
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
                    var7 = (Statics.field84.field1215 >> 7) + Statics.field3967.field1338;
                }
                if (var6 == 19) {
                    var7 = (Statics.field84.field1276 >> 7) + Statics.field3967.field1334;
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

    @ObfuscatedName("an.nr(Lnb;I)V")
    public static final void method293(class358 arg0) {
        if (arg0.field3927 == 1) {
            String var1 = arg0.field3946;
            int var2 = arg0.field3815;
            int var3 = arg0.field3949;
            method3494(var1, "", 24, 0, 0, var2, var3, false, -1);
        }
        if (arg0.field3927 == 2 && !field691) {
            String var4 = method2611(arg0);
            if (var4 != null) {
                String var5 = class105.method7700(65280) + arg0.field3849;
                int var6 = arg0.field3815;
                int var7 = arg0.field3949;
                method3494(var4, var5, 25, 0, -1, var6, var7, false, -1);
            }
        }
        if (arg0.field3927 == 3) {
            Statics.method353(class378.field4264, "", 26, 0, 0, arg0.field3815);
        }
        if (arg0.field3927 == 4) {
            Statics.method353(arg0.field3946, "", 28, 0, 0, arg0.field3815);
        }
        if (arg0.field3927 == 5) {
            Statics.method353(arg0.field3946, "", 29, 0, 0, arg0.field3815);
        }
        if (arg0.field3927 == 6 && field576 == null) {
            Statics.method353(arg0.field3946, "", 30, 0, -1, arg0.field3815);
        }
        if (!arg0.field3814) {
            return;
        }
        if (!field691) {
            for (int var13 = 9; var13 >= 5; var13--) {
                String var14;
                if (!class359.method3024(method3177(arg0), var13) && arg0.field3811 == null) {
                    var14 = null;
                } else if (arg0.field3897 == null || arg0.field3897.length <= var13 || arg0.field3897[var13] == null || arg0.field3897[var13].trim().length() == 0) {
                    var14 = null;
                } else {
                    var14 = arg0.field3897[var13];
                }
                if (var14 != null) {
                    String var16 = arg0.field3924;
                    int var17 = var13 + 1;
                    int var18 = arg0.field3930;
                    int var19 = arg0.field3815;
                    int var20 = arg0.field3949;
                    method3494(var14, var16, 1007, var17, var18, var19, var20, false, -1);
                }
            }
            String var21 = method2611(arg0);
            if (var21 != null) {
                String var22 = arg0.field3924;
                int var23 = arg0.field3930;
                int var24 = arg0.field3815;
                int var25 = arg0.field3949;
                method3494(var21, var22, 25, 0, var23, var24, var25, false, -1);
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                String var27;
                if (!class359.method3024(method3177(arg0), var26) && arg0.field3811 == null) {
                    var27 = null;
                } else if (arg0.field3897 == null || arg0.field3897.length <= var26 || arg0.field3897[var26] == null || arg0.field3897[var26].trim().length() == 0) {
                    var27 = null;
                } else {
                    var27 = arg0.field3897[var26];
                }
                if (var27 != null) {
                    method3494(var27, arg0.field3924, 57, var26 + 1, arg0.field3930, arg0.field3815, arg0.field3949, arg0.field3891, -1);
                }
            }
            int var29 = method3177(arg0);
            boolean var30 = (var29 & 0x1) != 0;
            if (var30) {
                Statics.method353(class378.field4371, "", 30, 0, arg0.field3930, arg0.field3815);
            }
        } else if (class359.method3193(method3177(arg0)) && (Statics.field4578 & 0x20) == 32) {
            String var8 = field694;
            String var9 = field621 + " " + class105.field1372 + " " + arg0.field3924;
            int var10 = arg0.field3930;
            int var11 = arg0.field3815;
            int var12 = arg0.field3949;
            method3494(var8, var9, 58, 0, var10, var11, var12, false, -1);
        }
    }

    @ObfuscatedName("hj.nq(ZI)V")
    public static void method3443(boolean arg0) {
        field683 = arg0;
    }

    @ObfuscatedName("qm.nw(I)Z")
    public static boolean method7275() {
        return field683;
    }

    @ObfuscatedName("hc.nm(IIIIIIII)V")
    public static final void method3655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field75.method5908(arg0)) {
            method5521(Statics.field75.field3722[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("lx.nj([Lnb;IIIIIIIB)V")
    public static final void method5521(class358[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class358 var9 = arg0[var8];
            if (var9 != null && var9.field3965 == arg1 && (var9.method6292() || method3177(var9) != 0 || field709 == var9)) {
                if (var9.field3814) {
                    if (method6456(var9)) {
                        continue;
                    }
                } else if (var9.field3894 == 0 && Statics.field231 != var9 && method6456(var9)) {
                    continue;
                }
                if (var9.field3894 == 11) {
                    if (var9.method6278(Statics.field75, Statics.field3400)) {
                        if (var9.method6301()) {
                            Statics.method5599(var9);
                            method3068(var9.field3884, var9, true);
                            var9.method6308().method3235().method3369(3, var9.method6308().method3247());
                        }
                        if (var9.field3940 != null) {
                            class90 var10 = new class90();
                            var10.field1095 = var9;
                            var10.field1103 = var9.field3940;
                            field739.method6829(var10);
                        }
                    }
                } else if (var9.field3894 == 12 && var9.method6317(Statics.field75)) {
                    Statics.method5599(var9);
                }
                int var11 = var9.field3844 + arg6;
                int var12 = var9.field3830 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3894 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3831 + var11;
                    int var16 = var9.field3875 + var12;
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
                    int var23 = var9.field3831 + var11;
                    int var24 = var9.field3875 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field708 == var9) {
                    field716 = true;
                    field717 = var11;
                    field749 = var12;
                }
                boolean var25 = false;
                if (var9.field3869) {
                    switch(field698) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3815 >>> 16 == field699) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field699 == var9.field3815) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3814 || var19 < var21 && var20 < var22) {
                    if (var9.field3814) {
                        if (var9.field3963) {
                            if (class36.field230 >= var19 && class36.field221 >= var20 && class36.field230 < var21 && class36.field221 < var22) {
                                for (class90 var26 = (class90) field739.method6834(); var26 != null; var26 = (class90) field739.method6842()) {
                                    if (var26.field1093) {
                                        var26.method8189();
                                        var26.field1095.field3954 = false;
                                    }
                                }
                                method5931();
                                if (Statics.field2664 == 0) {
                                    field708 = null;
                                    field709 = null;
                                }
                                if (!field671) {
                                    method688();
                                }
                            }
                        } else if (var9.field3964 && class36.field230 >= var19 && class36.field221 >= var20 && class36.field230 < var21 && class36.field221 < var22) {
                            for (class90 var27 = (class90) field739.method6834(); var27 != null; var27 = (class90) field739.method6842()) {
                                if (var27.field1093 && var27.field1095.field3819 == var27.field1103) {
                                    var27.method8189();
                                }
                            }
                        }
                    }
                    int var28 = class36.field230;
                    int var29 = class36.field221;
                    if (class36.field238 != 0) {
                        var28 = class36.field239;
                        var29 = class36.field240;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3820 == 1337) {
                        if (!field542 && !field671 && var30) {
                            method3063(var28, var29, var19, var20);
                        }
                    } else if (var9.field3820 == 1338) {
                        method292(var9, var11, var12);
                    } else {
                        if (var9.field3820 == 1400) {
                            Statics.field18.method8416(class36.field230, class36.field221, var30, var11, var12, var9.field3831, var9.field3875);
                        }
                        if (!field671 && var30) {
                            if (var9.field3820 == 1400) {
                                Statics.field18.method8311(var11, var12, var9.field3831, var9.field3875, var28, var29);
                            } else {
                                method293(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3892.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3892[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3892[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3823 != null) {
                                            var35 = field764.method4087(var9.field3892[var31][var34]);
                                        }
                                        if (method3474(var9.field3892[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3823 != null && var9.field3823[var31] > field821) {
                                                break;
                                            }
                                            byte var36 = var9.field3874[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field764.method4087(86) && !field764.method4087(82) && !field764.method4087(81)) && ((var36 & 0x2) == 0 || field764.method4087(86)) && ((var36 & 0x1) == 0 || field764.method4087(82)) && ((var36 & 0x4) == 0 || field764.method4087(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method5926(var31 + 1, var9.field3815, var9.field3930, var9.field3949, "");
                                    } else if (var31 == 10) {
                                        method1864();
                                        method6483(var9.field3815, var9.field3930, class359.method3320(method3177(var9)), var9.field3949);
                                        field694 = method2611(var9);
                                        if (field694 == null) {
                                            field694 = class378.field4097;
                                        }
                                        field621 = var9.field3924 + class105.method7700(16777215);
                                    }
                                    int var37 = var9.field3836[var31];
                                    if (var9.field3823 == null) {
                                        var9.field3823 = new int[var9.field3892.length];
                                    }
                                    if (var9.field3895 == null) {
                                        var9.field3895 = new int[var9.field3892.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3823[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3823[var31] == 0) {
                                        var9.field3823[var31] = field821 + var37 + var9.field3895[var31];
                                    } else {
                                        var9.field3823[var31] = field821 + var37;
                                    }
                                }
                                if (!var32 && var9.field3823 != null) {
                                    var9.field3823[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3814) {
                            boolean var38;
                            if (class36.field230 >= var19 && class36.field221 >= var20 && class36.field230 < var21 && class36.field221 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field228 == 1 || !Statics.field1379 && class36.field228 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field238 == 1 || !Statics.field1379 && class36.field238 == 4) && class36.field239 >= var19 && class36.field240 >= var20 && class36.field239 < var21 && class36.field240 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method2247(var9, class36.field239 - var11, class36.field240 - var12);
                            }
                            if (var9.method6401()) {
                                if (var40) {
                                    field742.method6829(new class230(0, class36.field230 - var11, class36.field221 - var12, var9));
                                }
                                if (var39) {
                                    field742.method6829(new class230(1, class36.field230 - var11, class36.field221 - var12, var9));
                                }
                            }
                            if (var9.field3820 == 1400) {
                                Statics.field18.method8260(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field708 != null && field708 != var9 && var38 && class359.method101(method3177(var9))) {
                                field712 = var9;
                            }
                            if (field709 == var9) {
                                field735 = true;
                                field714 = var11;
                                field796 = var12 * 32669 * 715718325;
                            }
                            if (var9.field3961) {
                                if (var38 && field737 != 0 && var9.field3819 != null) {
                                    class90 var41 = new class90();
                                    var41.field1093 = true;
                                    var41.field1095 = var9;
                                    var41.field1099 = field737;
                                    var41.field1103 = var9.field3819;
                                    field739.method6829(var41);
                                }
                                if (field708 != null || field671) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3955 && var40) {
                                    var9.field3955 = true;
                                    if (var9.field3957 != null) {
                                        class90 var42 = new class90();
                                        var42.field1093 = true;
                                        var42.field1095 = var9;
                                        var42.field1096 = class36.field239 - var11;
                                        var42.field1099 = class36.field240 - var12;
                                        var42.field1103 = var9.field3957;
                                        field739.method6829(var42);
                                    }
                                }
                                if (var9.field3955 && var39 && var9.field3906 != null) {
                                    class90 var43 = new class90();
                                    var43.field1093 = true;
                                    var43.field1095 = var9;
                                    var43.field1096 = class36.field230 - var11;
                                    var43.field1099 = class36.field221 - var12;
                                    var43.field1103 = var9.field3906;
                                    field739.method6829(var43);
                                }
                                if (var9.field3955 && !var39) {
                                    var9.field3955 = false;
                                    if (var9.field3907 != null) {
                                        class90 var44 = new class90();
                                        var44.field1093 = true;
                                        var44.field1095 = var9;
                                        var44.field1096 = class36.field230 - var11;
                                        var44.field1099 = class36.field221 - var12;
                                        var44.field1103 = var9.field3907;
                                        field566.method6829(var44);
                                    }
                                }
                                if (var39 && var9.field3802 != null) {
                                    class90 var45 = new class90();
                                    var45.field1093 = true;
                                    var45.field1095 = var9;
                                    var45.field1096 = class36.field230 - var11;
                                    var45.field1099 = class36.field221 - var12;
                                    var45.field1103 = var9.field3802;
                                    field739.method6829(var45);
                                }
                                if (!var9.field3954 && var38) {
                                    var9.field3954 = true;
                                    if (var9.field3959 != null) {
                                        class90 var46 = new class90();
                                        var46.field1093 = true;
                                        var46.field1095 = var9;
                                        var46.field1096 = class36.field230 - var11;
                                        var46.field1099 = class36.field221 - var12;
                                        var46.field1103 = var9.field3959;
                                        field739.method6829(var46);
                                    }
                                }
                                if (var9.field3954 && var38 && var9.field3910 != null) {
                                    class90 var47 = new class90();
                                    var47.field1093 = true;
                                    var47.field1095 = var9;
                                    var47.field1096 = class36.field230 - var11;
                                    var47.field1099 = class36.field221 - var12;
                                    var47.field1103 = var9.field3910;
                                    field739.method6829(var47);
                                }
                                if (var9.field3954 && !var38) {
                                    var9.field3954 = false;
                                    if (var9.field3911 != null) {
                                        class90 var48 = new class90();
                                        var48.field1093 = true;
                                        var48.field1095 = var9;
                                        var48.field1096 = class36.field230 - var11;
                                        var48.field1099 = class36.field221 - var12;
                                        var48.field1103 = var9.field3911;
                                        field566.method6829(var48);
                                    }
                                }
                                if (var9.field3922 != null) {
                                    class90 var49 = new class90();
                                    var49.field1095 = var9;
                                    var49.field1103 = var9.field3922;
                                    field740.method6829(var49);
                                }
                                if (var9.field3966 != null && field762 > var9.field3925) {
                                    if (var9.field3920 == null || field762 - var9.field3925 > 32) {
                                        class90 var54 = new class90();
                                        var54.field1095 = var9;
                                        var54.field1103 = var9.field3966;
                                        field739.method6829(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3925; var50 < field762; var50++) {
                                            int var51 = field721[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3920.length; var52++) {
                                                if (var9.field3920[var52] == var51) {
                                                    class90 var53 = new class90();
                                                    var53.field1095 = var9;
                                                    var53.field1103 = var9.field3966;
                                                    field739.method6829(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3925 = field762;
                                }
                                if (var9.field3918 != null && field724 > var9.field3829) {
                                    if (var9.field3919 == null || field724 - var9.field3829 > 32) {
                                        class90 var59 = new class90();
                                        var59.field1095 = var9;
                                        var59.field1103 = var9.field3918;
                                        field739.method6829(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3829; var55 < field724; var55++) {
                                            int var56 = field798[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3919.length; var57++) {
                                                if (var9.field3919[var57] == var56) {
                                                    class90 var58 = new class90();
                                                    var58.field1095 = var9;
                                                    var58.field1103 = var9.field3918;
                                                    field739.method6829(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3829 = field724;
                                }
                                if (var9.field3854 != null && field726 > var9.field3810) {
                                    if (var9.field3921 == null || field726 - var9.field3810 > 32) {
                                        class90 var64 = new class90();
                                        var64.field1095 = var9;
                                        var64.field1103 = var9.field3854;
                                        field739.method6829(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3810; var60 < field726; var60++) {
                                            int var61 = field725[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3921.length; var62++) {
                                                if (var9.field3921[var62] == var61) {
                                                    class90 var63 = new class90();
                                                    var63.field1095 = var9;
                                                    var63.field1103 = var9.field3854;
                                                    field739.method6829(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3810 = field726;
                                }
                                if (field729 > var9.field3956 && var9.field3937 != null) {
                                    class90 var65 = new class90();
                                    var65.field1095 = var9;
                                    var65.field1103 = var9.field3937;
                                    field739.method6829(var65);
                                }
                                if (field730 > var9.field3956 && var9.field3860 != null) {
                                    class90 var66 = new class90();
                                    var66.field1095 = var9;
                                    var66.field1103 = var9.field3860;
                                    field739.method6829(var66);
                                }
                                if (field731 > var9.field3956 && var9.field3866 != null) {
                                    class90 var67 = new class90();
                                    var67.field1095 = var9;
                                    var67.field1103 = var9.field3866;
                                    field739.method6829(var67);
                                }
                                if (field732 > var9.field3956 && var9.field3932 != null) {
                                    class90 var68 = new class90();
                                    var68.field1095 = var9;
                                    var68.field1103 = var9.field3932;
                                    field739.method6829(var68);
                                }
                                if (field746 > var9.field3956 && var9.field3933 != null) {
                                    class90 var69 = new class90();
                                    var69.field1095 = var9;
                                    var69.field1103 = var9.field3933;
                                    field739.method6829(var69);
                                }
                                if (field734 > var9.field3956 && var9.field3938 != null) {
                                    class90 var70 = new class90();
                                    var70.field1095 = var9;
                                    var70.field1103 = var9.field3938;
                                    field739.method6829(var70);
                                }
                                if (field652 > var9.field3956 && var9.field3905 != null) {
                                    class90 var71 = new class90();
                                    var71.field1095 = var9;
                                    var71.field1103 = var9.field3905;
                                    field739.method6829(var71);
                                }
                                if (field736 > var9.field3956 && var9.field3934 != null) {
                                    class90 var72 = new class90();
                                    var72.field1095 = var9;
                                    var72.field1103 = var9.field3934;
                                    field739.method6829(var72);
                                }
                                var9.field3956 = field720;
                                if (var9.field3828 != null) {
                                    for (int var73 = 0; var73 < field766; var73++) {
                                        class90 var74 = new class90();
                                        var74.field1095 = var9;
                                        var74.field1100 = field768[var73];
                                        var74.field1102 = field767[var73];
                                        var74.field1103 = var9.field3828;
                                        field739.method6829(var74);
                                    }
                                }
                                if (var9.field3928 != null) {
                                    int[] var75 = field764.method4091();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class90 var77 = new class90();
                                        var77.field1095 = var9;
                                        var77.field1100 = var75[var76];
                                        var77.field1103 = var9.field3928;
                                        field739.method6829(var77);
                                    }
                                }
                                if (var9.field3929 != null) {
                                    int[] var78 = field764.method4104();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class90 var80 = new class90();
                                        var80.field1095 = var9;
                                        var80.field1100 = var78[var79];
                                        var80.field1103 = var9.field3929;
                                        field739.method6829(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3814) {
                            if (field708 != null || field671) {
                                continue;
                            }
                            if ((var9.field3944 >= 0 || var9.field3843 != 0) && class36.field230 >= var19 && class36.field221 >= var20 && class36.field230 < var21 && class36.field221 < var22) {
                                if (var9.field3944 >= 0) {
                                    Statics.field231 = arg0[var9.field3944];
                                } else {
                                    Statics.field231 = var9;
                                }
                            }
                            if (var9.field3894 == 8 && class36.field230 >= var19 && class36.field221 >= var20 && class36.field230 < var21 && class36.field221 < var22) {
                                Statics.field2163 = var9;
                            }
                            if (var9.field3840 > var9.field3875) {
                                method291(var9, var9.field3831 + var11, var12, var9.field3875, var9.field3840, class36.field230, class36.field221);
                            }
                        }
                        if (var9.field3894 == 0) {
                            method5521(arg0, var9.field3815, var19, var20, var21, var22, var11 - var9.field3837, var12 - var9.field3838);
                            if (var9.field3884 != null) {
                                method5521(var9.field3884, var9.field3815, var19, var20, var21, var22, var11 - var9.field3837, var12 - var9.field3838);
                            }
                            class89 var81 = (class89) field697.method8528((long) var9.field3815);
                            if (var81 != null) {
                                if (var81.field1088 == 0 && class36.field230 >= var19 && class36.field221 >= var20 && class36.field230 < var21 && class36.field221 < var22 && !field671) {
                                    for (class90 var82 = (class90) field739.method6834(); var82 != null; var82 = (class90) field739.method6842()) {
                                        if (var82.field1093) {
                                            var82.method8189();
                                            var82.field1095.field3954 = false;
                                        }
                                    }
                                    if (Statics.field2664 == 0) {
                                        field708 = null;
                                        field709 = null;
                                    }
                                    if (!field671) {
                                        method688();
                                    }
                                }
                                method3655(var81.field1090, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ha.nl(II)Z")
    public static boolean method3474(int arg0) {
        for (int var1 = 0; var1 < field766; var1++) {
            if (field768[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ep.nk(III)V")
    public static final void method2795(int arg0, int arg1) {
        if (Statics.field75.method5908(arg0)) {
            method2514(Statics.field75.field3722[arg0], arg1);
        }
    }

    @ObfuscatedName("dx.nz([Lnb;II)V")
    public static final void method2514(class358[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class358 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3894 == 0) {
                    if (var3.field3884 != null) {
                        method2514(var3.field3884, arg1);
                    }
                    class89 var4 = (class89) field697.method8528((long) var3.field3815);
                    if (var4 != null) {
                        method2795(var4.field1090, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3935 != null) {
                    class90 var5 = new class90();
                    var5.field1095 = var3;
                    var5.field1103 = var3.field3935;
                    class73.method6486(var5);
                }
                if (arg1 == 1 && var3.field3936 != null) {
                    if (var3.field3930 >= 0) {
                        class358 var6 = Statics.field75.method5906(var3.field3815);
                        if (var6 == null || var6.field3884 == null || var3.field3930 >= var6.field3884.length || var6.field3884[var3.field3930] != var3) {
                            continue;
                        }
                    }
                    class90 var7 = new class90();
                    var7.field1095 = var3;
                    var7.field1103 = var3.field3936;
                    class73.method6486(var7);
                }
            }
        }
    }

    @ObfuscatedName("du.nu(Lnb;III)V")
    public static final void method2247(class358 arg0, int arg1, int arg2) {
        if (field708 != null || field671 || arg0 == null) {
            return;
        }
        class358 var3 = method163(arg0);
        if (var3 == null) {
            var3 = arg0.field3898;
        }
        if (var3 == null) {
            return;
        }
        field708 = arg0;
        class358 var5 = method163(arg0);
        if (var5 == null) {
            var5 = arg0.field3898;
        }
        field709 = var5;
        field687 = arg1;
        field711 = arg2;
        Statics.field2664 = 0;
        field719 = false;
        int var7 = field672 - 1;
        if (var7 != -1) {
            method1131(var7);
        }
        return;
    }

    @ObfuscatedName("client.nv(S)V")
    public final void method1184() {
        Statics.method5599(field708);
        Statics.field2664++;
        if (field716 && field735) {
            int var1 = class36.field230;
            int var2 = class36.field221;
            int var3 = var1 - field687;
            int var4 = var2 - field711;
            if (var3 < field714) {
                var3 = field714;
            }
            if (field708.field3831 + var3 > field714 + field709.field3831) {
                var3 = field714 + field709.field3831 - field708.field3831;
            }
            if (var4 < field796) {
                var4 = field796;
            }
            if (field708.field3875 + var4 > field796 + field709.field3875) {
                var4 = field796 + field709.field3875 - field708.field3875;
            }
            int var5 = var3 - field717;
            int var6 = var4 - field749;
            int var7 = field708.field3899;
            if (Statics.field2664 > field708.field3900 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field719 = true;
            }
            int var8 = field709.field3837 + (var3 - field714);
            int var9 = field709.field3838 + (var4 - field796);
            if (field708.field3912 != null && field719) {
                class90 var10 = new class90();
                var10.field1095 = field708;
                var10.field1096 = var8;
                var10.field1099 = var9;
                var10.field1103 = field708.field3912;
                class73.method6486(var10);
            }
            if (class36.field228 == 0) {
                if (field719) {
                    if (field708.field3913 != null) {
                        class90 var11 = new class90();
                        var11.field1095 = field708;
                        var11.field1096 = var8;
                        var11.field1099 = var9;
                        var11.field1094 = field712;
                        var11.field1103 = field708.field3913;
                        class73.method6486(var11);
                    }
                    if (field712 != null && method163(field708) != null) {
                        class321 var12 = class321.method3542(class319.field3289, field591.field1467);
                        var12.field3393.method8947(field708.field3815);
                        var12.field3393.method8834(field708.field3930);
                        var12.field3393.method8867(field708.field3949);
                        var12.field3393.method8849(field712.field3815);
                        var12.field3393.method8780(field712.field3949);
                        var12.field3393.method8867(field712.field3930);
                        field591.method2745(var12);
                    }
                } else if (this.method1180()) {
                    this.method1181(field717 + field687, field749 + field711);
                } else if (field672 > 0) {
                    method3446(field717 + field687, field749 + field711);
                }
                field708 = null;
            }
        } else if (Statics.field2664 > 1) {
            if (!field719 && field672 > 0) {
                method3446(field717 + field687, field749 + field711);
            }
            field708 = null;
        }
    }

    @ObfuscatedName("cf.ny(II)V")
    public static void method1131(int arg0) {
        Statics.field3048 = new class76();
        Statics.field3048.field930 = field673[arg0];
        Statics.field3048.field923 = field674[arg0];
        Statics.field3048.field924 = field675[arg0];
        Statics.field3048.field926 = field676[arg0];
        Statics.field3048.field927 = field677[arg0];
        Statics.field3048.field929 = field679[arg0];
        Statics.field3048.field925 = field680[arg0];
        Statics.field3048.field928 = field678[arg0];
    }

    @ObfuscatedName("hg.nn(III)V")
    public static void method3446(int arg0, int arg1) {
        method2935(Statics.field3048, arg0, arg1);
        Statics.field3048 = null;
    }

    @ObfuscatedName("di.np(I)V")
    public static void method2383() {
        for (class89 var0 = (class89) field697.method8530(); var0 != null; var0 = (class89) field697.method8531()) {
            int var1 = var0.field1090;
            if (Statics.field75.method5908(var1)) {
                boolean var2 = true;
                class358[] var3 = Statics.field75.field3722[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3814;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field5049;
                    class358 var6 = Statics.field75.method5906(var5);
                    if (var6 != null) {
                        Statics.method5599(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("gz.nh(II)V")
    public static final void method3308(int arg0) {
        if (!Statics.field75.method5908(arg0)) {
            return;
        }
        class358[] var1 = Statics.field75.field3722[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class358 var3 = var1[var2];
            if (var3 != null) {
                var3.field3951 = 0;
                var3.field3952 = 0;
            }
        }
    }

    @ObfuscatedName("fa.nb(IB)V")
    public static final void method2998(int arg0) {
        if (Statics.field75.method5908(arg0)) {
            method5573(Statics.field75.field3722[arg0], -1);
        }
    }

    @ObfuscatedName("mv.nf([Lnb;IB)V")
    public static final void method5573(class358[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class358 var3 = arg0[var2];
            if (var3 != null && var3.field3965 == arg1 && (!var3.field3814 || !method6456(var3))) {
                if (var3.field3894 == 0) {
                    if (!var3.field3814 && method6456(var3) && Statics.field231 != var3) {
                        continue;
                    }
                    method5573(arg0, var3.field3815);
                    if (var3.field3884 != null) {
                        method5573(var3.field3884, var3.field3815);
                    }
                    class89 var4 = (class89) field697.method8528((long) var3.field3815);
                    if (var4 != null) {
                        method2998(var4.field1090);
                    }
                }
                if (var3.field3894 == 6) {
                    if (var3.field3864 != -1 || var3.field3865 != -1) {
                        boolean var5 = method4203(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3865;
                        } else {
                            var6 = var3.field3864;
                        }
                        if (var6 != -1) {
                            class227 var7 = class227.method4744(var6);
                            if (var7.method4051()) {
                                var3.field3951 += field607;
                                int var8 = var7.method4018();
                                if (var3.field3951 >= var8) {
                                    var3.field3951 -= var7.field2425;
                                    if (var3.field3951 < 0 || var3.field3951 >= var8) {
                                        var3.field3951 = 0;
                                    }
                                }
                                Statics.method5599(var3);
                            } else {
                                var3.field3952 += field607;
                                while (var3.field3952 > var7.field2421[var3.field3951]) {
                                    var3.field3952 -= var7.field2421[var3.field3951];
                                    var3.field3951++;
                                    if (var3.field3951 >= var7.field2424.length) {
                                        var3.field3951 -= var7.field2425;
                                        if (var3.field3951 < 0 || var3.field3951 >= var7.field2424.length) {
                                            var3.field3951 = 0;
                                        }
                                    }
                                    Statics.method5599(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3873 != 0 && !var3.field3814) {
                        int var9 = var3.field3873 >> 16;
                        int var10 = var3.field3873 << 16 >> 16;
                        int var11 = field607 * var9;
                        int var12 = field607 * var10;
                        var3.field3868 = var3.field3868 + var11 & 0x7FF;
                        var3.field3953 = var3.field3953 + var12 & 0x7FF;
                        Statics.method5599(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("hx.nd(II)V")
    public static final void method3492(int arg0) {
        int var1 = Math.max(Math.min(arg0, 100), 0);
        int var2 = 100 - var1;
        float var3 = (float) var2 / 200.0F + 0.5F;
        class248.method4331((double) var3);
        ((class260) class248.field2670.field2978).method4750((double) var3);
        if (Statics.field18 != null) {
            Statics.field18.method8401();
        }
        class225.method3118();
        Statics.field4879.method2400((double) var3);
    }

    @ObfuscatedName("bg.na(I)I")
    public static final int method686() {
        float var0 = 200.0F * ((float) Statics.field4879.method2401() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("nj.nx(II)V")
    public static final void method5902(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field4879.method2417()) {
            return;
        }
        label50: {
            if (Statics.field4879.method2417() == 0) {
                boolean var2 = !class330.field3580.isEmpty();
                if (var2) {
                    class330.method5428(Statics.field3033, var1);
                    field780 = false;
                    break label50;
                }
            }
            if (var1 == 0) {
                class330.method6481(0, 0);
                field780 = false;
            } else if (!class330.field3579.isEmpty()) {
                Iterator var3 = class330.field3579.iterator();
                while (var3.hasNext()) {
                    class342 var4 = (class342) var3.next();
                    if (var4 != null) {
                        var4.field3685 = var1;
                    }
                }
                class342 var5 = (class342) class330.field3579.get(0);
                if (var5 != null && var5.field3694 != null && var5.field3694.method5673() && !var5.field3697) {
                    var5.field3694.method5736(var1);
                    var5.field3689 = (float) var1;
                }
            }
        }
        Statics.field4879.method2402(var1);
    }

    @ObfuscatedName("bn.ni(IB)V")
    public static final void method445(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4879.method2404(var1);
    }

    @ObfuscatedName("client.nc(II)V")
    public static final void method1720(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field4879.method2406(var1);
    }

    @ObfuscatedName("fj.of(II)V")
    public static final void method3070(int arg0) {
        method2383();
        class72.method3629();
        int var1 = class197.method4446(arg0).field2006;
        if (var1 == 0) {
            return;
        }
        int var2 = class346.field3710[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class248.method4331(0.9D);
                ((class260) class248.field2670.field2978).method4750(0.9D);
                if (Statics.field18 != null) {
                    Statics.field18.method8401();
                }
                class225.method3118();
                Statics.field4879.method2400(0.9D);
            }
            if (var2 == 2) {
                class248.method4331(0.8D);
                ((class260) class248.field2670.field2978).method4750(0.8D);
                if (Statics.field18 != null) {
                    Statics.field18.method8401();
                }
                class225.method3118();
                Statics.field4879.method2400(0.8D);
            }
            if (var2 == 3) {
                class248.method4331(0.7D);
                ((class260) class248.field2670.field2978).method4750(0.7D);
                if (Statics.field18 != null) {
                    Statics.field18.method8401();
                }
                class225.method3118();
                Statics.field4879.method2400(0.7D);
            }
            if (var2 == 4) {
                class248.method4331(0.6D);
                ((class260) class248.field2670.field2978).method4750(0.6D);
                if (Statics.field18 != null) {
                    Statics.field18.method8401();
                }
                class225.method3118();
                Statics.field4879.method2400(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method5902(255);
            }
            if (var2 == 1) {
                method5902(192);
            }
            if (var2 == 2) {
                method5902(128);
            }
            if (var2 == 3) {
                method5902(64);
            }
            if (var2 == 4) {
                method5902(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method445(127);
            }
            if (var2 == 1) {
                method445(96);
            }
            if (var2 == 2) {
                method445(64);
            }
            if (var2 == 3) {
                method445(32);
            }
            if (var2 == 4) {
                method445(0);
            }
        }
        if (var1 == 5) {
            field537 = var2 == 1;
        }
        if (var1 == 6) {
            field531 = var2;
        }
        if (var1 == 9) {
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method1720(127);
            }
            if (var2 == 1) {
                method1720(96);
            }
            if (var2 == 2) {
                method1720(64);
            }
            if (var2 == 3) {
                method1720(32);
            }
            if (var2 == 4) {
                method1720(0);
            }
        }
        if (var1 == 17) {
            field705 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field559 = (class107) class401.method2027(class107.method2384(), var2);
            if (field559 == null) {
                field559 = class107.field1384;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field665 = -1;
            } else {
                field665 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class107[] var3 = new class107[] { class107.field1391, class107.field1387, class107.field1384, class107.field1385, class107.field1386 };
        field560 = (class107) class401.method2027(var3, var2);
        if (field560 == null) {
            field560 = class107.field1384;
        }
    }

    @ObfuscatedName("cy.oi(B)V")
    public static final void method1876() {
        class321 var0 = class321.method3542(class319.field3330, field591.field1467);
        field591.method2745(var0);
        class73.field896 = true;
        for (class89 var1 = (class89) field697.method8530(); var1 != null; var1 = (class89) field697.method8531()) {
            if (var1.field1088 == 0 || var1.field1088 == 3) {
                method687(var1, true);
            }
        }
        if (field576 != null) {
            Statics.method5599(field576);
            field576 = null;
        }
        class73.field896 = false;
    }

    @ObfuscatedName("kr.op(IIIB)Ldz;")
    public static final class89 method5047(int arg0, int arg1, int arg2) {
        class89 var3 = new class89();
        var3.field1090 = arg1;
        var3.field1088 = arg2;
        field697.method8527(var3, (long) arg0);
        method3308(arg1);
        class358 var4 = Statics.field75.method5906(arg0);
        Statics.method5599(var4);
        if (field576 != null) {
            Statics.method5599(field576);
            field576 = null;
        }
        method3068(Statics.field75.field3722[arg0 >> 16], var4, false);
        class73.method55(arg1);
        if (field783 != -1) {
            method2795(field783, 1);
        }
        return var3;
    }

    @ObfuscatedName("bg.ol(Ldz;ZI)V")
    public static final void method687(class89 arg0, boolean arg1) {
        int var2 = arg0.field1090;
        int var3 = (int) arg0.field5049;
        arg0.method8189();
        if (arg1) {
            Statics.field75.method5910(var2);
        }
        method6509(var2);
        class358 var4 = Statics.field75.method5906(var3);
        if (var4 != null) {
            Statics.method5599(var4);
        }
        if (field783 != -1) {
            method2795(field783, 1);
        }
    }

    @ObfuscatedName("pf.oh(Lnb;S)Z")
    public static final boolean method6774(class358 arg0) {
        int var1 = arg0.field3820;
        if (var1 == 205) {
            field592 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field814.method5968(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field814.method5939(var4, var5 == 1);
        }
        if (var1 == 324) {
            field814.method5940(0);
        }
        if (var1 == 325) {
            field814.method5940(1);
        }
        if (var1 == 326) {
            class321 var6 = class321.method3542(class319.field3359, field591.field1467);
            field814.method5941(var6.field3393);
            field591.method2745(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gu.oe(Lnb;IIIB)V")
    public static final void method3228(class358 arg0, int arg1, int arg2, int arg3) {
        method3723();
        class345 var4 = arg0.method6294(Statics.field75, false);
        if (var4 == null) {
            return;
        }
        class556.method9104(arg1, arg2, var4.field3705 + arg1, var4.field3703 + arg2);
        if (field779 == 2 || field779 == 5) {
            class556.method9124(arg1, arg2, 0, var4.field3702, var4.field3704);
        } else {
            int var5 = field615 & 0x7FF;
            int var6 = 48 + Statics.field900.method1154() / 32;
            int var7 = 464 - Statics.field900.method1146() / 32;
            Statics.field1288.method9257(arg1, arg2, var4.field3705, var4.field3703, var6, var7, var5, 256, var4.field3702, var4.field3704);
            for (int var8 = 0; var8 < field776; var8++) {
                int var9 = field774[var8] * 4 + 2 - Statics.field900.method1154() / 32;
                int var10 = field775[var8] * 4 + 2 - Statics.field900.method1146() / 32;
                method2306(arg1, arg2, var9, var10, field618[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class406 var13 = Statics.field3967.field1350[Statics.field3967.field1349][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field900.method1154() / 32;
                        int var15 = var12 * 4 + 2 - Statics.field900.method1146() / 32;
                        method2306(arg1, arg2, var14, var15, Statics.field2435[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < Statics.field3967.field1345; var16++) {
                class104 var17 = Statics.field3967.field1344[Statics.field3967.field1346[var16]];
                if (var17 != null && var17.method2272()) {
                    class210 var18 = var17.field1360;
                    if (var18 != null && var18.field2152 != null) {
                        var18 = var18.method3664();
                    }
                    if (var18 != null && var18.field2144 && var18.field2155) {
                        int var19 = var17.field1215 / 32 - Statics.field900.method1154() / 32;
                        int var20 = var17.field1276 / 32 - Statics.field900.method1146() / 32;
                        method2306(arg1, arg2, var19, var20, Statics.field2435[1], var4);
                    }
                }
            }
            int var21 = Statics.field3967.field1337.field1416;
            int[] var22 = Statics.field3967.field1337.field1417;
            for (int var23 = 0; var23 < var21; var23++) {
                class94 var24 = Statics.field3967.field1342[var22[var23]];
                if (var24 != null && var24.method2272() && !var24.field1143 && Statics.field84 != var24) {
                    int var25 = var24.field1215 / 32 - Statics.field900.method1154() / 32;
                    int var26 = var24.field1276 / 32 - Statics.field900.method1146() / 32;
                    if (var24.method2259()) {
                        method2306(arg1, arg2, var25, var26, Statics.field2435[3], var4);
                    } else if (Statics.field84.field1165 != 0 && var24.field1165 != 0 && Statics.field84.field1165 == var24.field1165) {
                        method2306(arg1, arg2, var25, var26, Statics.field2435[4], var4);
                    } else if (var24.method2262()) {
                        method2306(arg1, arg2, var25, var26, Statics.field2435[5], var4);
                    } else if (var24.method2300()) {
                        method2306(arg1, arg2, var25, var26, Statics.field2435[6], var4);
                    } else {
                        method2306(arg1, arg2, var25, var26, Statics.field2435[2], var4);
                    }
                }
            }
            if (field785 != 0 && field821 % 20 < 10) {
                if (field785 == 1 && field611 >= 0 && field611 < Statics.field3967.field1344.length) {
                    class104 var27 = Statics.field3967.field1344[field611];
                    if (var27 != null) {
                        int var28 = var27.field1215 / 32 - Statics.field900.method1154() / 32;
                        int var29 = var27.field1276 / 32 - Statics.field900.method1146() / 32;
                        method2115(arg1, arg2, var28, var29, Statics.field1456[1], var4);
                    }
                }
                if (field785 == 2) {
                    int var30 = field770 * 4 - Statics.field3967.field1338 * 4 + 2 - Statics.field900.method1154() / 32;
                    int var31 = field555 * 4 - Statics.field3967.field1334 * 4 + 2 - Statics.field900.method1146() / 32;
                    method2115(arg1, arg2, var30, var31, Statics.field1456[1], var4);
                }
                if (field785 == 10 && field818 >= 0 && field818 < Statics.field3967.field1342.length) {
                    class94 var32 = Statics.field3967.field1342[field818];
                    if (var32 != null) {
                        int var33 = var32.field1215 / 32 - Statics.field900.method1154() / 32;
                        int var34 = var32.field1276 / 32 - Statics.field900.method1146() / 32;
                        method2115(arg1, arg2, var33, var34, Statics.field1456[1], var4);
                    }
                }
            }
            if (field777 != 0) {
                int var35 = field777 * 4 + 2 - Statics.field900.method1154() / 32;
                int var36 = field637 * 4 + 2 - Statics.field900.method1146() / 32;
                method2306(arg1, arg2, var35, var36, Statics.field1456[0], var4);
            }
            if (!Statics.field84.field1143) {
                class556.method9112(var4.field3705 / 2 + arg1 - 1, var4.field3703 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field747[arg3] = true;
    }

    @ObfuscatedName("fl.oq(Lnb;IIII)V")
    public static final void method3066(class358 arg0, int arg1, int arg2, int arg3) {
        class345 var4 = arg0.method6294(Statics.field75, false);
        if (var4 == null) {
            return;
        }
        if (field779 < 3) {
            Statics.field4919.method9257(arg1, arg2, var4.field3705, var4.field3703, 25, 25, field615, 256, var4.field3702, var4.field3704);
        } else {
            class556.method9124(arg1, arg2, 0, var4.field3702, var4.field3704);
        }
    }

    @ObfuscatedName("dq.ob(IIIILvc;Lnw;I)V")
    public static final void method2115(int arg0, int arg1, int arg2, int arg3, class560 arg4, class345 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2306(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field615 & 0x7FF;
        int var8 = class248.field2665[var7];
        int var9 = class248.field2669[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3705 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field83.method9326(arg5.field3705 / 2 + arg0 - var17 / 2 + var15, arg5.field3703 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("dn.oz(IIIILvc;Lnw;I)V")
    public static final void method2306(int arg0, int arg1, int arg2, int arg3, class560 arg4, class345 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field615 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class248.field2665[var6];
        int var9 = class248.field2669[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method9271(arg5.field3705 / 2 + var10 - arg4.field5449 / 2, arg5.field3703 / 2 - var11 - arg4.field5446 / 2, arg0, arg1, arg5.field3705, arg5.field3703, arg5.field3702, arg5.field3704);
        } else {
            arg4.method9319(arg5.field3705 / 2 + arg0 + var10 - arg4.field5449 / 2, arg5.field3703 / 2 + arg1 - var11 - arg4.field5446 / 2);
        }
    }

    @ObfuscatedName("dn.ox(B)V")
    public static final void method2307() {
        for (int var0 = 0; var0 < Statics.field3967.field1337.field1416; var0++) {
            class94 var1 = Statics.field3967.field1342[Statics.field3967.field1337.field1417[var0]];
            var1.method2260();
        }
        Iterator var2 = class114.field1459.iterator();
        while (var2.hasNext()) {
            class65 var3 = (class65) var2.next();
            var3.method1102();
        }
        if (Statics.field1404 != null) {
            Statics.field1404.method7830();
        }
    }

    @ObfuscatedName("da.ou(I)V")
    public static final void method2221() {
        Iterator var0 = class114.field1459.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1110();
        }
        if (Statics.field1404 != null) {
            Statics.field1404.method7831();
        }
    }

    @ObfuscatedName("sv.oy(S)V")
    public static final void method8148() {
        for (int var0 = 0; var0 < Statics.field3967.field1337.field1416; var0++) {
            class94 var1 = Statics.field3967.field1342[Statics.field3967.field1337.field1417[var0]];
            var1.method2266();
        }
    }

    @ObfuscatedName("oa.on(B)V")
    public static final void method6694() {
        field732 = field720;
        Statics.field2540 = true;
    }

    @ObfuscatedName("ck.ow(Ljava/lang/String;I)V")
    public static final void method1011(String arg0) {
        if (Statics.field1404 != null) {
            class321 var1 = class321.method3542(class319.field3324, field591.field1467);
            var1.field3393.method8779(class546.method7454(arg0));
            var1.field3393.method8864(arg0);
            field591.method2745(var1);
        }
    }

    @ObfuscatedName("fu.og(I)V")
    public static final void method3074() {
        class321 var0 = class321.method3542(class319.field3348, field591.field1467);
        var0.field3393.method8779(0);
        field591.method2745(var0);
    }

    @ObfuscatedName("do.ov(IIB)V")
    public static final void method2175(int arg0, int arg1) {
        class168 var2 = arg0 >= 0 ? field727[arg0] : Statics.field4608;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3198()) {
            return;
        }
        class150 var3 = (class150) var2.field1831.get(arg1);
        if (var3.field1699 != -1) {
            return;
        }
        String var4 = var3.field1698.method9385();
        class321 var5 = class321.method3542(class319.field3351, field591.field1467);
        var5.field3393.method8779(3 + class546.method7454(var4));
        var5.field3393.method8779(arg0);
        var5.field3393.method8780(arg1);
        var5.field3393.method8864(var4);
        field591.method2745(var5);
    }

    @ObfuscatedName("jo.om(IIB)V")
    public static final void method4735(int arg0, int arg1) {
        if (field727[arg0] == null || arg1 < 0 || arg1 >= field727[arg0].method3198()) {
            return;
        }
        class150 var2 = (class150) field727[arg0].field1831.get(arg1);
        if (var2.field1699 != -1) {
            return;
        }
        class321 var3 = class321.method3542(class319.field3312, field591.field1467);
        var3.field3393.method8779(3 + class546.method7454(var2.field1698.method9385()));
        var3.field3393.method8779(arg0);
        var3.field3393.method8780(arg1);
        var3.field3393.method8864(var2.field1698.method9385());
        field591.method2745(var3);
    }

    @ObfuscatedName("ec.ot(IIZI)V")
    public static final void method2837(int arg0, int arg1, boolean arg2) {
        if (field727[arg0] == null || arg1 < 0 || arg1 >= field727[arg0].method3198()) {
            return;
        }
        class150 var3 = (class150) field727[arg0].field1831.get(arg1);
        class321 var4 = class321.method3542(class319.field3347, field591.field1467);
        var4.field3393.method8779(4 + class546.method7454(var3.field1698.method9385()));
        var4.field3393.method8779(arg0);
        var4.field3393.method8780(arg1);
        var4.field3393.method8785(arg2);
        var4.field3393.method8864(var3.field1698.method9385());
        field591.method2745(var4);
    }

    @ObfuscatedName("od.ok(II)V")
    public static void method6509(int arg0) {
        for (class503 var1 = (class503) field550.method8530(); var1 != null; var1 = (class503) field550.method8531()) {
            if ((long) arg0 == (var1.field5049 >> 48 & 0xFFFFL)) {
                var1.method8189();
            }
        }
    }

    @ObfuscatedName("gj.oc(Lnb;I)I")
    public static int method3177(class358 arg0) {
        class503 var1 = (class503) field550.method8528(((long) arg0.field3815 << 32) + (long) arg0.field3930);
        return var1 == null ? arg0.field3818 : var1.field5047;
    }

    @ObfuscatedName("ap.or(Lnb;I)Lnb;")
    public static class358 method163(class358 arg0) {
        int var1 = class359.method5633(method3177(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = Statics.field75.method5906(arg0.field3965);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("na.oj(Lnb;B)Z")
    public static boolean method6456(class358 arg0) {
        return arg0.field3914;
    }

    @ObfuscatedName("en.oa(Lnb;I)Ljava/lang/String;")
    public static String method2611(class358 arg0) {
        if (class359.method3320(method3177(arg0)) == 0) {
            return null;
        } else if (arg0.field3902 == null || arg0.field3902.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3902;
        }
    }

    @ObfuscatedName("rj.os(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method7671(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field575 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field575 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field575 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field575 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field575 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field4746 != null) {
            var3 = "/p=" + Statics.field4746;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field1965 + "/a=" + Statics.field1814 + var3 + "/";
    }

    @ObfuscatedName("ex.pu(Ljava/lang/String;I)V")
    public static void method2741(String arg0) {
        Statics.field4746 = arg0;
        try {
            String var1 = Statics.field1971.getParameter(Integer.toString(18));
            String var2 = Statics.field1971.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class326.method2895() + 94608000000L;
                class363.field3980.setTime(new Date(var6));
                int var8 = class363.field3980.get(7);
                int var9 = class363.field3980.get(5);
                int var10 = class363.field3980.get(2);
                int var11 = class363.field3980.get(1);
                int var12 = class363.field3980.get(11);
                int var13 = class363.field3980.get(12);
                int var14 = class363.field3980.get(13);
                String var15 = class363.field3979[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class363.field3982[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            client var16 = Statics.field1971;
            String var17 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var16).eval(var17);
        } catch (Throwable var19) {
        }
    }

    @ObfuscatedName("ls.pp(Ljava/lang/String;ZB)V")
    public static void method5459(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1758; var5++) {
            class225 var6 = class225.method369(var5);
            if ((!arg1 || var6.field2350) && var6.field2375 == -1 && var6.field2338.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field1754 = -1;
                    Statics.field313 = null;
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
        Statics.field313 = var3;
        Statics.field1504 = 0;
        Statics.field1754 = var4;
        String[] var9 = new String[Statics.field1754];
        for (int var10 = 0; var10 < Statics.field1754; var10++) {
            var9[var10] = class225.method369(var3[var10]).field2338;
        }
        short[] var11 = Statics.field313;
        class541.method8631(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("dm.pd(Lua;II)V")
    public static void method2128(class546 arg0, int arg1) {
        byte[] var2 = arg0.field5346;
        if (field588 == null) {
            field588 = new byte[24];
        }
        class447.method7618(var2, arg1, field588, 0, 24);
        class179.method2806(arg0, arg1);
    }

    @ObfuscatedName("dg.pt(Lua;B)V")
    public static void method2237(class546 arg0) {
        if (field588 == null) {
            byte[] var1 = class179.method1076();
            arg0.method8939(var1, 0, var1.length);
        } else {
            arg0.method8939(field588, 0, field588.length);
        }
    }

    @ObfuscatedName("client.pm(I)Lvv;")
    public class568 method1185() {
        return Statics.field84 == null ? null : Statics.field84.field1153;
    }

    @ObfuscatedName("ka.pr(I)V")
    public static void method5034() {
        field591.method2745(class321.method3542(class319.field3315, field591.field1467));
        field620 = 0;
    }

    @ObfuscatedName("en.pa(B)V")
    public static void method2624() {
        if (field620 == 1) {
            field628 = true;
        }
    }

    @ObfuscatedName("av.pc(I)V")
    public static void method96() {
        if (!field628 || Statics.field84 == null) {
            return;
        }
        int var0 = Statics.field84.field1230[0];
        int var1 = Statics.field84.field1277[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field179 = Statics.field84.field1215;
        int var2 = method826(Statics.field3967, Statics.field84.field1215, Statics.field84.field1276, Statics.field3967.field1349) - field565;
        if (var2 < Statics.field2831) {
            Statics.field2831 = var2;
        }
        Statics.field932 = Statics.field84.field1276;
        field628 = false;
    }

    @ObfuscatedName("fi.py(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method3098(String arg0) {
        class381[] var1 = class381.method2635();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class381 var3 = var1[var2];
            if (var3.field4427 != -1 && arg0.startsWith(class105.method5596(var3.field4427))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4427).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ha.pl(I)V")
    public static void method3475() {
        if (Statics.field414 == null) {
            return;
        }
        field824 = field821;
        Statics.field414.method6791();
        for (int var0 = 0; var0 < Statics.field3967.field1342.length; var0++) {
            if (Statics.field3967.field1342[var0] != null) {
                Statics.field414.method6778((Statics.field3967.field1342[var0].field1215 >> 7) + Statics.field3967.field1338, (Statics.field3967.field1342[var0].field1276 >> 7) + Statics.field3967.field1334);
            }
        }
    }

    @ObfuscatedName("aw.pe(B)Z")
    public static boolean method260() {
        return Statics.field4879.method2411() >= field532;
    }

    @ObfuscatedName("nb.pn(I)V")
    public static void method6427() {
        Statics.field4879.method2410(field532);
    }

    @ObfuscatedName("bm.px(Lca;I)V")
    public static void method824(class69 arg0) {
        if (Statics.field1061 != arg0) {
            Statics.field1061 = arg0;
        }
    }

    @ObfuscatedName("an.pk(ZI)V")
    public static void method295(boolean arg0) {
        field537 = arg0;
    }

    @ObfuscatedName("bh.pw(II)Lum;")
    public static class538 method696(int arg0) {
        class538 var1 = (class538) field690.method5570((long) arg0);
        if (var1 == null) {
            var1 = new class538(Statics.field1358, class540.method6440(arg0), class540.method2960(arg0));
            field690.method5564(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("ho.ps(IB)Lum;")
    public static class538 method3596(int arg0) {
        class538 var1 = (class538) field822.method5570((long) arg0);
        if (var1 == null) {
            var1 = new class538(Statics.field1358, arg0);
        }
        return var1;
    }

    @ObfuscatedName("ha.pq(B)Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard method3476() {
        return Statics.field1971.method478();
    }

    @ObfuscatedName("rf.pj(II)V")
    public static void method7853(int arg0) {
        class227 var1 = class227.method4744(arg0);
        if (!var1.method4051()) {
            return;
        }
        int var2 = var1.field2415;
        class142 var3 = class227.method2533(var2);
        int var4;
        if (var3 == null) {
            var4 = 2;
        } else {
            var4 = var3.method3002() ? 0 : 1;
        }
        if (var4 == 2) {
            field825.add(var1.field2415);
        }
    }

    @ObfuscatedName("tk.pb(I)V")
    public static void method8179() {
        for (int var0 = 0; var0 < field825.size(); var0++) {
            int var1 = (Integer) field825.get(var0);
            class142 var2 = class227.method2533(var1);
            int var3;
            if (var2 == null) {
                var3 = 2;
            } else {
                var3 = var2.method3002() ? 0 : 1;
            }
            if (var3 != 2) {
                field825.remove(var0);
                var0--;
            }
        }
    }

    @ObfuscatedName("client.pi(IB)V")
    public void method1186(int arg0) {
        class321 var2 = class321.method3542(class319.field3354, field591.field1467);
        var2.field3393.method8779(arg0);
        field591.method2745(var2);
    }

    @ObfuscatedName("client.po(II)V")
    public void method1187(int arg0) {
        class321 var2 = class321.method3542(class319.field3350, field591.field1467);
        var2.field3393.method8779(arg0);
        field591.method2745(var2);
    }
}

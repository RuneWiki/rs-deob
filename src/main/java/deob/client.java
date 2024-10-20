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
import java.util.concurrent.Future;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

public final class client extends class35 implements class446, OAuthApi, class328 {

    @ObfuscatedName("client.bl")
    public static boolean field714 = true;

    @ObfuscatedName("client.bx")
    public static int field522 = 1;

    @ObfuscatedName("client.cs")
    public static int field588 = 0;

    @ObfuscatedName("client.co")
    public static int field821 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field525 = false;

    @ObfuscatedName("client.cz")
    public static boolean field716 = false;

    @ObfuscatedName("client.cw")
    public static int field689 = -1;

    @ObfuscatedName("client.cy")
    public static int field528 = -1;

    @ObfuscatedName("client.cu")
    public static int field529 = -1;

    @ObfuscatedName("client.ce")
    public static boolean field530 = false;

    @ObfuscatedName("client.cv")
    public static int field531 = 220;

    @ObfuscatedName("client.dc")
    public static int field532 = 0;

    @ObfuscatedName("client.do")
    public static boolean field533 = false;

    @ObfuscatedName("client.dv")
    public static boolean field719 = false;

    @ObfuscatedName("client.dw")
    public static boolean field611 = true;

    @ObfuscatedName("client.du")
    public static int field536 = 0;

    @ObfuscatedName("client.dt")
    public static long field724 = -1L;

    @ObfuscatedName("client.da")
    public static int field558 = -1;

    @ObfuscatedName("client.dq")
    public static int field698 = -1;

    @ObfuscatedName("client.dd")
    public static long field540 = -1L;

    @ObfuscatedName("client.dh")
    public static boolean field568 = true;

    @ObfuscatedName("client.dj")
    public static int field653 = 0;

    @ObfuscatedName("client.di")
    public static int field543 = 0;

    @ObfuscatedName("client.ds")
    public static int field544 = 0;

    @ObfuscatedName("client.dy")
    public static int field537 = 0;

    @ObfuscatedName("client.dz")
    public static int field546 = 0;

    @ObfuscatedName("client.dp")
    public static int field547 = 0;

    @ObfuscatedName("client.de")
    public static int field548 = 0;

    @ObfuscatedName("client.df")
    public static int field549 = 0;

    @ObfuscatedName("client.db")
    public static int field550 = 0;

    @ObfuscatedName("client.dn")
    public static class105 field551 = class105.field1362;

    @ObfuscatedName("client.dr")
    public static class105 field552 = class105.field1362;

    @ObfuscatedName("client.ej")
    public static boolean field586 = false;

    @ObfuscatedName("client.eg")
    public static class94 field554 = class94.field1166;

    @ObfuscatedName("client.ef")
    public static int field713 = 0;

    @ObfuscatedName("client.er")
    public static int field556 = 0;

    @ObfuscatedName("client.fy")
    public static int field567 = 0;

    @ObfuscatedName("client.ff")
    public static int field560 = 0;

    @ObfuscatedName("client.fe")
    public static int field561 = 0;

    @ObfuscatedName("client.fg")
    public static int field562 = 0;

    @ObfuscatedName("client.fs")
    public static class126 field574 = class126.field1499;

    @ObfuscatedName("client.fw")
    public static class539 field564 = class539.field5256;

    @ObfuscatedName("client.ge")
    public String field565;

    @ObfuscatedName("client.gm")
    public class15 field566;

    @ObfuscatedName("client.gg")
    public class19 field523;

    @ObfuscatedName("client.gl")
    public OtlTokenRequester field765;

    @ObfuscatedName("client.go")
    public Future field569;

    @ObfuscatedName("client.gy")
    public boolean field618 = false;

    @ObfuscatedName("client.gr")
    public int field700 = 0;

    @ObfuscatedName("client.gj")
    public class19 field809;

    @ObfuscatedName("client.gk")
    public RefreshAccessTokenRequester field573;

    @ObfuscatedName("client.gs")
    public Future field542;

    @ObfuscatedName("client.gq")
    public static final String field709;

    @ObfuscatedName("client.gz")
    public static final String field720;

    @ObfuscatedName("client.ht")
    public static boolean field579;

    @ObfuscatedName("client.ho")
    public static class79 field580;

    @ObfuscatedName("client.hl")
    public class534 field581;

    @ObfuscatedName("client.hx")
    public class8 field582;

    @ObfuscatedName("client.hn")
    public long field583 = -1L;

    @ObfuscatedName("client.hr")
    public static byte[] field607;

    @ObfuscatedName("client.hp")
    public static class102[] field629;

    @ObfuscatedName("client.hh")
    public static int field572;

    @ObfuscatedName("client.hi")
    public static int[] field587;

    @ObfuscatedName("client.hy")
    public static int field635;

    @ObfuscatedName("client.he")
    public static int[] field589;

    @ObfuscatedName("client.hs")
    public static final class113 field590;

    @ObfuscatedName("client.is")
    public static int field591;

    @ObfuscatedName("client.if")
    public static boolean field592;

    @ObfuscatedName("client.il")
    public static class433 field593;

    @ObfuscatedName("client.iv")
    public static HashMap field744;

    @ObfuscatedName("client.it")
    public static String field823;

    @ObfuscatedName("client.in")
    public static int field595;

    @ObfuscatedName("client.ir")
    public static int field667;

    @ObfuscatedName("client.ie")
    public static int field622;

    @ObfuscatedName("client.iw")
    public static int field598;

    @ObfuscatedName("client.ic")
    public static int field599;

    @ObfuscatedName("client.jh")
    public static class230[] field600;

    @ObfuscatedName("client.jr")
    public static boolean field601;

    @ObfuscatedName("client.jv")
    public static int[][][] field831;

    @ObfuscatedName("client.jw")
    public static final int[] field603;

    @ObfuscatedName("client.jq")
    public static int field832;

    @ObfuscatedName("client.jj")
    public static int field605;

    @ObfuscatedName("client.jp")
    public static int field606;

    @ObfuscatedName("client.ju")
    public static int field610;

    @ObfuscatedName("client.jd")
    public static int field619;

    @ObfuscatedName("client.kl")
    public static int field668;

    @ObfuscatedName("client.kv")
    public static boolean field718;

    @ObfuscatedName("client.ki")
    public static int field526;

    @ObfuscatedName("client.kw")
    public static int field612;

    @ObfuscatedName("client.km")
    public static int field541;

    @ObfuscatedName("client.kn")
    public static int field820;

    @ObfuscatedName("client.kg")
    public static int field633;

    @ObfuscatedName("client.ku")
    public static int field616;

    @ObfuscatedName("client.kq")
    public static int field617;

    @ObfuscatedName("client.kt")
    public static int field535;

    @ObfuscatedName("client.ky")
    public static int field604;

    @ObfuscatedName("client.kd")
    public static int field620;

    @ObfuscatedName("client.kh")
    public static int field621;

    @ObfuscatedName("client.kp")
    public static int field578;

    @ObfuscatedName("client.kr")
    public static int field623;

    @ObfuscatedName("client.lr")
    public static int field829;

    @ObfuscatedName("client.lk")
    public static int field625;

    @ObfuscatedName("client.lp")
    public static boolean field626;

    @ObfuscatedName("client.le")
    public static int field627;

    @ObfuscatedName("client.lm")
    public static boolean field545;

    @ObfuscatedName("client.lv")
    public static int field796;

    @ObfuscatedName("client.lf")
    public static int field630;

    @ObfuscatedName("client.lo")
    public static int field631;

    @ObfuscatedName("client.lc")
    public static int[] field632;

    @ObfuscatedName("client.la")
    public static int[] field797;

    @ObfuscatedName("client.lj")
    public static int[] field634;

    @ObfuscatedName("client.lg")
    public static int[] field563;

    @ObfuscatedName("client.ln")
    public static int[] field636;

    @ObfuscatedName("client.lx")
    public static int[] field637;

    @ObfuscatedName("client.lw")
    public static int[][] field638;

    @ObfuscatedName("client.ls")
    public static int[] field639;

    @ObfuscatedName("client.lh")
    public static String[] field770;

    @ObfuscatedName("client.ll")
    public static int[][] field613;

    @ObfuscatedName("client.lu")
    public static int field642;

    @ObfuscatedName("client.lb")
    public static int field643;

    @ObfuscatedName("client.ly")
    public static int field596;

    @ObfuscatedName("client.ld")
    public static int field645;

    @ObfuscatedName("client.li")
    public static int field646;

    @ObfuscatedName("client.lz")
    public static int field750;

    @ObfuscatedName("client.lt")
    public static int field648;

    @ObfuscatedName("client.lq")
    public static boolean field789;

    @ObfuscatedName("client.mn")
    public static int field650;

    @ObfuscatedName("client.mf")
    public static boolean field651;

    @ObfuscatedName("client.mi")
    public static class93[] field652;

    @ObfuscatedName("client.ml")
    public static int field692;

    @ObfuscatedName("client.mm")
    public static int field654;

    @ObfuscatedName("client.mh")
    public static long field655;

    @ObfuscatedName("client.mt")
    public static long field602;

    @ObfuscatedName("client.ms")
    public static boolean field657;

    @ObfuscatedName("client.mz")
    public static int field662;

    @ObfuscatedName("client.md")
    public static int field659;

    @ObfuscatedName("client.mu")
    public static int[] field660;

    @ObfuscatedName("client.mv")
    public static final int[] field711;

    @ObfuscatedName("client.my")
    public static String[] field762;

    @ObfuscatedName("client.me")
    public static boolean[] field663;

    @ObfuscatedName("client.ma")
    public static int[] field664;

    @ObfuscatedName("client.mc")
    public static int field665;

    @ObfuscatedName("client.mp")
    public static class397[][][] field666;

    @ObfuscatedName("client.ns")
    public static class397 field658;

    @ObfuscatedName("client.nw")
    public static class397 field577;

    @ObfuscatedName("client.nd")
    public static class397 field669;

    @ObfuscatedName("client.nv")
    public static int[] field670;

    @ObfuscatedName("client.nb")
    public static int[] field671;

    @ObfuscatedName("client.nj")
    public static int[] field672;

    @ObfuscatedName("client.nm")
    public static int[] field673;

    @ObfuscatedName("client.nn")
    public static boolean field674;

    @ObfuscatedName("client.nt")
    public static boolean field675;

    @ObfuscatedName("client.nq")
    public static int field701;

    @ObfuscatedName("client.nh")
    public static int[] field677;

    @ObfuscatedName("client.ne")
    public static int[] field678;

    @ObfuscatedName("client.ny")
    public static int[] field679;

    @ObfuscatedName("client.nz")
    public static int[] field649;

    @ObfuscatedName("client.nk")
    public static int[] field681;

    @ObfuscatedName("client.nr")
    public static String[] field682;

    @ObfuscatedName("client.na")
    public static String[] field683;

    @ObfuscatedName("client.nl")
    public static boolean[] field684;

    @ObfuscatedName("client.nu")
    public static boolean field685;

    @ObfuscatedName("client.ni")
    public static boolean field686;

    @ObfuscatedName("client.oy")
    public static boolean field687;

    @ObfuscatedName("client.ox")
    public static int field688;

    @ObfuscatedName("client.oe")
    public static int field715;

    @ObfuscatedName("client.oz")
    public static int field690;

    @ObfuscatedName("client.oi")
    public static int field691;

    @ObfuscatedName("client.oo")
    public static int field749;

    @ObfuscatedName("client.or")
    public static boolean field694;

    @ObfuscatedName("client.og")
    public static int field539;

    @ObfuscatedName("client.of")
    public static int field696;

    @ObfuscatedName("client.ov")
    public static String field697;

    @ObfuscatedName("client.oc")
    public static String field575;

    @ObfuscatedName("client.ol")
    public static int field699;

    @ObfuscatedName("client.ou")
    public static class508 field727;

    @ObfuscatedName("client.od")
    public static int field576;

    @ObfuscatedName("client.oq")
    public static int field702;

    @ObfuscatedName("client.ow")
    public static int field585;

    @ObfuscatedName("client.pp")
    public static class350 field704;

    @ObfuscatedName("client.pt")
    public static int field705;

    @ObfuscatedName("client.pe")
    public static int field706;

    @ObfuscatedName("client.pl")
    public static int field676;

    @ObfuscatedName("client.pf")
    public static int field708;

    @ObfuscatedName("client.pd")
    public static boolean field527;

    @ObfuscatedName("client.pr")
    public static class350 field710;

    @ObfuscatedName("client.pn")
    public static class350 field570;

    @ObfuscatedName("client.po")
    public static class350 field712;

    @ObfuscatedName("client.py")
    public static int field792;

    @ObfuscatedName("client.pq")
    public static int field818;

    @ObfuscatedName("client.ph")
    public static class350 field751;

    @ObfuscatedName("client.ps")
    public static boolean field747;

    @ObfuscatedName("client.pg")
    public static int field766;

    @ObfuscatedName("client.px")
    public static int field775;

    @ObfuscatedName("client.pk")
    public static boolean field811;

    @ObfuscatedName("client.pw")
    public static int field641;

    @ObfuscatedName("client.pc")
    public static int field721;

    @ObfuscatedName("client.pi")
    public static boolean field693;

    @ObfuscatedName("client.pv")
    public static int field726;

    @ObfuscatedName("client.qi")
    public static int[] field703;

    @ObfuscatedName("client.qz")
    public static int field824;

    @ObfuscatedName("client.ql")
    public static int[] field647;

    @ObfuscatedName("client.qg")
    public static int field609;

    @ObfuscatedName("client.qm")
    public static int[] field728;

    @ObfuscatedName("client.qx")
    public static int field783;

    @ObfuscatedName("client.qa")
    public static int[] field730;

    @ObfuscatedName("client.qu")
    public static int field731;

    @ObfuscatedName("client.qd")
    public static int field732;

    @ObfuscatedName("client.qe")
    public static int field733;

    @ObfuscatedName("client.qh")
    public static int field734;

    @ObfuscatedName("client.qk")
    public static int field735;

    @ObfuscatedName("client.qj")
    public static int field736;

    @ObfuscatedName("client.qc")
    public static int field737;

    @ObfuscatedName("client.qr")
    public static int field538;

    @ObfuscatedName("client.qq")
    public static int field739;

    @ObfuscatedName("client.qn")
    public static int field740;

    @ObfuscatedName("client.qw")
    public static class552 field741;

    @ObfuscatedName("client.qo")
    public static class397 field742;

    @ObfuscatedName("client.qb")
    public static class397 field803;

    @ObfuscatedName("client.qt")
    public static class397 field534;

    @ObfuscatedName("client.rw")
    public static class397 field745;

    @ObfuscatedName("client.rq")
    public static class508 field746;

    @ObfuscatedName("client.ru")
    public static int field608;

    @ObfuscatedName("client.rh")
    public static int field833;

    @ObfuscatedName("client.rt")
    public static boolean[] field817;

    @ObfuscatedName("client.rd")
    public static boolean[] field722;

    @ObfuscatedName("client.rk")
    public static boolean[] field571;

    @ObfuscatedName("client.rj")
    public static int[] field752;

    @ObfuscatedName("client.ra")
    public static int[] field753;

    @ObfuscatedName("client.rg")
    public static int[] field754;

    @ObfuscatedName("client.re")
    public static int[] field758;

    @ObfuscatedName("client.rb")
    public static int field756;

    @ObfuscatedName("client.ry")
    public static long field757;

    @ObfuscatedName("client.rm")
    public static boolean field695;

    @ObfuscatedName("client.rp")
    public static int[] field759;

    @ObfuscatedName("client.rc")
    public static int field760;

    @ObfuscatedName("client.rf")
    public static int field761;

    @ObfuscatedName("client.rx")
    public static String field644;

    @ObfuscatedName("client.sr")
    public static long[] field763;

    @ObfuscatedName("client.ss")
    public static int field764;

    @ObfuscatedName("client.sk")
    public static class229 field793;

    @ObfuscatedName("client.sa")
    public static class227 field738;

    @ObfuscatedName("client.sq")
    public static int field707;

    @ObfuscatedName("client.sn")
    public static int[] field661;

    @ObfuscatedName("client.sy")
    public static int[] field769;

    @ObfuscatedName("client.su")
    public static long field584;

    @ObfuscatedName("client.si")
    public static class157[] field771;

    @ObfuscatedName("client.sx")
    public static class166[] field772;

    @ObfuscatedName("client.sl")
    public static int field773;

    @ObfuscatedName("client.sw")
    public static int field774;

    @ObfuscatedName("client.sm")
    public static int[] field553;

    @ObfuscatedName("client.sb")
    public static int[] field776;

    @ObfuscatedName("client.st")
    public static class548[] field777;

    @ObfuscatedName("client.sj")
    public static int field778;

    @ObfuscatedName("client.se")
    public static int field779;

    @ObfuscatedName("client.tb")
    public static int field780;

    @ObfuscatedName("client.tp")
    public static boolean field781;

    @ObfuscatedName("client.th")
    public static int field782;

    @ObfuscatedName("client.tj")
    public static int[] field767;

    @ObfuscatedName("client.ta")
    public static int[] field784;

    @ObfuscatedName("client.tl")
    public static int[] field785;

    @ObfuscatedName("client.ty")
    public static int[] field786;

    @ObfuscatedName("client.ti")
    public static int[] field555;

    @ObfuscatedName("client.tt")
    public static class40[] field788;

    @ObfuscatedName("client.tw")
    public static boolean field743;

    @ObfuscatedName("client.td")
    public static boolean field790;

    @ObfuscatedName("client.to")
    public static boolean field791;

    @ObfuscatedName("client.uw")
    public static boolean field615;

    @ObfuscatedName("client.uf")
    public static class499 field814;

    @ObfuscatedName("client.ux")
    public static class498 field794;

    @ObfuscatedName("client.us")
    public static class498 field795;

    @ObfuscatedName("client.uu")
    public static boolean field729;

    @ObfuscatedName("client.up")
    public static boolean[] field798;

    @ObfuscatedName("client.ul")
    public static int[] field799;

    @ObfuscatedName("client.ug")
    public static int[] field800;

    @ObfuscatedName("client.uj")
    public static int[] field801;

    @ObfuscatedName("client.ur")
    public static int[] field755;

    @ObfuscatedName("client.uk")
    public static short field725;

    @ObfuscatedName("client.uv")
    public static short field804;

    @ObfuscatedName("client.ua")
    public static short field805;

    @ObfuscatedName("client.uy")
    public static short field806;

    @ObfuscatedName("client.vg")
    public static short field807;

    @ObfuscatedName("client.vd")
    public static short field808;

    @ObfuscatedName("client.vp")
    public static short field723;

    @ObfuscatedName("client.ve")
    public static short field810;

    @ObfuscatedName("client.vk")
    public static int field830;

    @ObfuscatedName("client.vc")
    public static int field812;

    @ObfuscatedName("client.vi")
    public static int field813;

    @ObfuscatedName("client.vo")
    public static int field656;

    @ObfuscatedName("client.vl")
    public static int field815;

    @ObfuscatedName("client.vn")
    public static class347 field816;

    @ObfuscatedName("client.va")
    public static int field594;

    @ObfuscatedName("client.vu")
    public static int field717;

    @ObfuscatedName("client.vm")
    public static class495 field819;

    @ObfuscatedName("client.vj")
    public static class387[] field628;

    @ObfuscatedName("client.vr")
    public static class67 field614;

    @ObfuscatedName("client.vy")
    public static class443 field822;

    @ObfuscatedName("client.vf")
    public static class304 field768;

    @ObfuscatedName("client.vb")
    public static class304 field524;

    @ObfuscatedName("client.wi")
    public static int field825;

    @ObfuscatedName("client.wh")
    public static int field826;

    @ObfuscatedName("client.wy")
    public static List field827;

    @ObfuscatedName("client.wk")
    public static final class235 field828;

    @ObfuscatedName("client.wz")
    public static ArrayList field597;

    @ObfuscatedName("client.wg")
    public static int field624;

    @ObfuscatedName("client.ws")
    public static int field787;

    @ObfuscatedName("client.we")
    public static final class66 field802;

    @ObfuscatedName("client.wm")
    public static int[] field748;

    @ObfuscatedName("client.wu")
    public static int[] field834;

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
        field709 = class405.method6343(var1);
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
        field720 = class405.method6343(var6);
        field579 = false;
        field580 = new class79();
        field607 = null;
        field629 = new class102[65536];
        field572 = 0;
        field587 = new int[65536];
        field635 = 0;
        field589 = new int[250];
        field590 = new class113();
        field591 = 0;
        field592 = false;
        field593 = new class433();
        field744 = new HashMap();
        field595 = 0;
        field667 = 1;
        field622 = 0;
        field598 = 1;
        field599 = 0;
        field600 = new class230[4];
        field601 = false;
        field831 = new int[4][13][13];
        field603 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
        field832 = -1;
        field605 = 0;
        field606 = 2301979;
        field610 = 5063219;
        field619 = 3353893;
        field668 = 7759444;
        field718 = false;
        field526 = 0;
        field612 = 128;
        field541 = 0;
        field820 = 0;
        field633 = 0;
        field616 = 0;
        field617 = 0;
        field535 = 0;
        field604 = 50;
        field620 = 0;
        field621 = 0;
        field578 = 0;
        field623 = 12;
        field829 = 6;
        field625 = 0;
        field626 = false;
        field627 = 0;
        field545 = false;
        field796 = 0;
        field630 = 0;
        field631 = 50;
        field632 = new int[field631];
        field797 = new int[field631];
        field634 = new int[field631];
        field563 = new int[field631];
        field636 = new int[field631];
        field637 = new int[field631];
        field638 = new int[field631][];
        field639 = new int[field631];
        field770 = new String[field631];
        field613 = new int[104][104];
        field642 = 0;
        field643 = -1;
        field596 = -1;
        field645 = 0;
        field646 = 0;
        field750 = 0;
        field648 = 0;
        field789 = true;
        field650 = 0;
        field651 = true;
        field652 = new class93[2048];
        field692 = -1;
        field654 = 0;
        field655 = -1L;
        field602 = -1L;
        field657 = true;
        field662 = 0;
        field659 = 0;
        field660 = new int[1000];
        field711 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };
        field762 = new String[8];
        field663 = new boolean[8];
        field664 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
        field665 = -1;
        field666 = new class397[4][104][104];
        field658 = new class397();
        field577 = new class397();
        field669 = new class397();
        field670 = new int[25];
        field671 = new int[25];
        field672 = new int[25];
        field673 = new int[25];
        field674 = false;
        field675 = false;
        field701 = 0;
        field677 = new int[500];
        field678 = new int[500];
        field679 = new int[500];
        field649 = new int[500];
        field681 = new int[500];
        field682 = new String[500];
        field683 = new String[500];
        field684 = new boolean[500];
        field685 = false;
        field686 = false;
        field687 = true;
        field688 = -1;
        field715 = -1;
        field690 = 0;
        field691 = 50;
        field749 = 0;
        field823 = null;
        field694 = false;
        field539 = -1;
        field696 = -1;
        field697 = null;
        field575 = null;
        field699 = -1;
        field727 = new class508(8);
        field576 = 0;
        field702 = -1;
        field585 = 0;
        field704 = null;
        field705 = 0;
        field706 = 0;
        field676 = 0;
        field708 = -1;
        field527 = false;
        field710 = null;
        field570 = null;
        field712 = null;
        field792 = 0;
        field818 = 0;
        field751 = null;
        field747 = false;
        field766 = -1;
        field775 = -1;
        field811 = false;
        field641 = -1;
        field721 = -1;
        field693 = false;
        field726 = 1;
        field703 = new int[32];
        field824 = 0;
        field647 = new int[32];
        field609 = 0;
        field728 = new int[32];
        field783 = 0;
        field730 = new int[32];
        field731 = 0;
        field732 = 0;
        field733 = 0;
        field734 = 0;
        field735 = 0;
        field736 = 0;
        field737 = 0;
        field538 = 0;
        field739 = 0;
        field740 = 0;
        field741 = new class552();
        field742 = new class397();
        field803 = new class397();
        field534 = new class397();
        field745 = new class397();
        field746 = new class508(512);
        field608 = 0;
        field833 = -2;
        field817 = new boolean[100];
        field722 = new boolean[100];
        field571 = new boolean[100];
        field752 = new int[100];
        field753 = new int[100];
        field754 = new int[100];
        field758 = new int[100];
        field756 = 0;
        field757 = 0L;
        field695 = true;
        field759 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
        field760 = 0;
        field761 = 0;
        field644 = "";
        field763 = new long[100];
        field764 = 0;
        field793 = new class229();
        field738 = new class227();
        field707 = 0;
        field661 = new int[128];
        field769 = new int[128];
        field584 = -1L;
        field771 = new class157[4];
        field772 = new class166[4];
        field773 = -1;
        field774 = 0;
        field553 = new int[1000];
        field776 = new int[1000];
        field777 = new class548[1000];
        field778 = 0;
        field779 = 0;
        field780 = 0;
        field781 = false;
        field782 = 0;
        field767 = new int[50];
        field784 = new int[50];
        field785 = new int[50];
        field786 = new int[50];
        field555 = new int[50];
        field788 = new class40[50];
        field743 = false;
        field790 = false;
        field791 = false;
        field615 = false;
        field814 = null;
        field794 = null;
        field795 = null;
        field729 = false;
        field798 = new boolean[5];
        field799 = new int[5];
        field800 = new int[5];
        field801 = new int[5];
        field755 = new int[5];
        field725 = 256;
        field804 = 205;
        field805 = 256;
        field806 = 320;
        field807 = 1;
        field808 = 32767;
        field723 = 1;
        field810 = 32767;
        field830 = 0;
        field812 = 0;
        field813 = 0;
        field656 = 0;
        field815 = 0;
        field816 = new class347();
        field594 = -1;
        field717 = -1;
        field819 = new class493();
        field628 = new class387[8];
        field614 = new class67();
        field822 = new class443(8, class441.field4713);
        field768 = new class304(64);
        field524 = new class304(64);
        field825 = -1;
        field826 = -1;
        field827 = new ArrayList();
        field828 = new class235();
        field597 = new ArrayList(10);
        field624 = 0;
        field787 = 0;
        field802 = new class66();
        field748 = new int[50];
        field834 = new int[50];
    }

    @ObfuscatedName("qe.gd(I)Lsg;")
    public static class494 method7298() {
        return Statics.field166;
    }

    @ObfuscatedName("sl.gb(B)Lts;")
    public static class502 method7974() {
        return Statics.field1053;
    }

    @ObfuscatedName("client.bs(B)V")
    public final void method490() {
    }

    public final void init() {
        if (!this.method467()) {
            return;
        }
        for (int var1 = 0; var1 <= 28; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 3:
                        if (var2.equalsIgnoreCase(class103.field1350)) {
                            field525 = true;
                        } else {
                            field525 = false;
                        }
                        break;
                    case 4:
                        if (field528 == -1) {
                            field528 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field588 = Integer.parseInt(var2);
                        break;
                    case 6:
                        int var4 = Integer.parseInt(var2);
                        class393 var5;
                        if (var4 >= 0 && var4 < class393.field4496.length) {
                            var5 = class393.field4496[var4];
                        } else {
                            var5 = null;
                        }
                        Statics.field2689 = var5;
                        break;
                    case 7:
                        Statics.field1537 = class365.method445(Integer.parseInt(var2));
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class103.field1350)) {
                        }
                        break;
                    case 9:
                        Statics.field1373 = var2;
                        break;
                    case 10:
                        Statics.field152 = (class366) class392.method6317(class366.method2700(), Integer.parseInt(var2));
                        if (Statics.field152 == class366.field3982) {
                            Statics.field4750 = class512.field5086;
                        } else {
                            Statics.field4750 = class512.field5092;
                        }
                        break;
                    case 11:
                        Statics.field4485 = var2;
                        break;
                    case 12:
                        field522 = Integer.parseInt(var2);
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
                        Statics.field4532 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field821 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field1923 = var2;
                        break;
                    case 21:
                        field689 = Integer.parseInt(var2);
                        break;
                    case 22:
                        Statics.field1598 = var2;
                        break;
                    case 25:
                        int var3 = var2.indexOf(".");
                        if (var3 == -1) {
                            field531 = Integer.parseInt(var2);
                        } else {
                            field531 = Integer.parseInt(var2.substring(0, var3));
                            Integer.parseInt(var2.substring(var3 + 1));
                        }
                }
            }
        }
        method2146();
        Statics.field1931 = this.getCodeBase().getHost();
        Statics.field3898 = new class379();
        String var6 = Statics.field1537.field3977;
        byte var7 = 0;
        if ((field588 & class530.field5175.method35()) != 0) {
            Statics.field153 = "beta";
        }
        try {
            class215.method417("oldschool", Statics.field153, var6, var7, 23);
        } catch (Exception var9) {
            Statics.method5453((String) null, var9);
        }
        Statics.field2033 = this;
        Statics.field5368 = field528;
        method984();
        if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
            this.field618 = true;
        }
        if (field529 == -1) {
            if (this.method1144() || this.method1145()) {
                field529 = 5;
            } else {
                field529 = 0;
            }
        }
        this.method465(765, 503, 220, 1);
    }

    public void finalize() throws Throwable {
        class322.field3483.remove(this);
        super.finalize();
    }

    @ObfuscatedName("do.gh(I)V")
    public static final void method2146() {
        class276.field2902 = false;
        field716 = false;
    }

    @ObfuscatedName("ch.gn(B)V")
    public static void method984() {
        Statics.field120 = System.getenv("JX_ACCESS_TOKEN");
        Statics.field5132 = System.getenv("JX_REFRESH_TOKEN");
        Statics.field3902 = System.getenv("JX_SESSION_ID");
        Statics.field2923 = System.getenv("JX_CHARACTER_ID");
        class77.method6319(System.getenv("JX_DISPLAY_NAME"));
    }

    @ObfuscatedName("client.ga(B)Z")
    public boolean method1142() {
        return this.field700 == 1;
    }

    public void setClient(int arg0) {
        this.field700 = arg0;
    }

    public void setOtlTokenRequester(OtlTokenRequester arg0) {
        if (arg0 != null) {
            this.field765 = arg0;
            class77.method3891(10);
        }
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester arg0) {
        if (arg0 != null) {
            this.field573 = arg0;
        }
    }

    public boolean isOnLoginScreen() {
        return field532 == 10;
    }

    public long getAccountHash() {
        return this.field583;
    }

    @ObfuscatedName("client.ge(I)Z")
    public boolean method1144() {
        return Statics.field120 != null && !Statics.field120.trim().isEmpty() && Statics.field5132 != null && !Statics.field5132.trim().isEmpty();
    }

    @ObfuscatedName("client.gm(I)Z")
    public boolean method1145() {
        return Statics.field3902 != null && !Statics.field3902.trim().isEmpty() && Statics.field2923 != null && !Statics.field2923.trim().isEmpty();
    }

    @ObfuscatedName("client.gg(I)Z")
    public boolean method1146() {
        return this.field765 != null;
    }

    @ObfuscatedName("client.gl(Ljava/lang/String;I)V")
    public void method1549(String arg0) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", arg0);
        URL var3 = new URL(Statics.field4485 + "shield/oauth/token" + (new class483(var2)).method7961());
        class439 var4 = new class439();
        if (this.method1142()) {
            var4.method7395(field720);
        } else {
            var4.method7395(field709);
        }
        var4.method7392("Host", (new URL(Statics.field4485)).getHost());
        var4.method7399(class480.field4880);
        class10 var5 = class10.field29;
        RefreshAccessTokenRequester var6 = this.field573;
        if (var6 == null) {
            class11 var7 = new class11(var3, var5, var4, this.field618);
            this.field809 = this.field566.method153(var7);
        } else {
            this.field542 = var6.request(var5.method62(), var3, var4.method7412(), "");
        }
    }

    @ObfuscatedName("client.go(Ljava/lang/String;I)V")
    public void method1148(String arg0) throws IOException {
        URL var2 = new URL(Statics.field4485 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class439 var3 = new class439();
        var3.method7396(arg0);
        class10 var4 = class10.field27;
        OtlTokenRequester var5 = this.field765;
        if (var5 == null) {
            class11 var6 = new class11(var2, var4, var3, this.field618);
            this.field523 = this.field566.method153(var6);
        } else {
            this.field569 = var5.request(var4.method62(), var2, var3.method7412(), "");
        }
    }

    @ObfuscatedName("client.gy(Ljava/lang/String;Ljava/lang/String;I)V")
    public void method1149(String arg0, String arg1) throws IOException, JSONException {
        URL var3 = new URL(Statics.field1598 + "game-session/v1/tokens");
        class11 var4 = new class11(var3, class10.field29, this.field618);
        var4.method80().method7396(arg0);
        var4.method80().method7399(class480.field4880);
        JSONObject var5 = new JSONObject();
        var5.put("accountId", (Object) arg1);
        var4.method81(new class482(var5));
        this.field523 = this.field566.method153(var4);
    }

    @ObfuscatedName("client.by(I)V")
    public final void method481() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field4660 = null;
            Statics.field1539 = null;
            Statics.field1416 = (byte[][][]) null;
            class431.method1114();
        } else {
            Statics.field4660 = var1;
            Statics.field1539 = new int[var1.length];
            Statics.field1416 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field4660.length; var3++) {
                Statics.field1416[var3] = new byte[var2[var3]][];
                class431.field4647.add(var1[var3]);
            }
            Collections.sort(class431.field4647);
        }
        Statics.field2697 = class531.method1063(field588, class530.field5175);
        Statics.field2313 = field821 == 0 ? 43594 : field522 + 40000;
        Statics.field1706 = field821 == 0 ? 443 : field522 + 50000;
        Statics.field3447 = Statics.field2313;
        Statics.field1423 = class349.field3705;
        Statics.field4548 = class349.field3707;
        Statics.field3672 = class349.field3708;
        Statics.field1666 = class349.field3706;
        Statics.field1838 = new class115(this.field618, 220);
        this.method468();
        this.method480();
        Statics.field3424 = this.method453();
        this.method541(field738, 0);
        this.method541(field793, 1);
        this.method454();
        Statics.field1731 = new class462(255, class215.field2336, class215.field2340, 500000);
        Statics.field156 = class100.method3191();
        String var5 = Statics.field1782;
        class32.field165 = this;
        if (var5 != null) {
            class32.field161 = var5;
        }
        method3718(Statics.field156.method2436());
        Statics.field1091 = new class70(Statics.field4750);
        this.field566 = new class15("tokenRequest", 1, 1);
        class322.method4886(this);
        field828.method4159();
    }

    @ObfuscatedName("mn.gr(I)Liw;")
    public static class229 method5445() {
        return field793;
    }

    @ObfuscatedName("client.bb(I)V")
    public final void method479() {
        field536++;
        this.method1150();
        class375.method2613();
        boolean var1 = false;
        boolean var2 = false;
        if (!class322.field3482.isEmpty()) {
            class426 var3 = (class426) class322.field3482.get(0);
            if (var3 == null) {
                class322.field3482.remove(0);
            } else if (var3.method7266()) {
                if (var3.method7277()) {
                    System.out.println("Error in midimanager.service: " + var3.method7278());
                    var1 = true;
                } else {
                    if (var3.method7279() != null) {
                        class322.field3482.add(1, var3.method7279());
                    }
                    var2 = var3.method7299();
                }
                class322.field3482.remove(0);
            } else {
                var2 = var3.method7299();
            }
        }
        if (var1) {
            class322.field3482.clear();
            Iterator var4 = class322.field3475.iterator();
            label101: while (true) {
                class334 var5;
                do {
                    if (!var4.hasNext()) {
                        class322.field3475.clear();
                        break label101;
                    }
                    var5 = (class334) var4.next();
                } while (var5 == null);
                var5.field3595.method5550();
                var5.field3595.method5582();
                var5.field3595.method5622(0);
                var5.field3595.field3519 = 0;
                int var6 = var5.field3591;
                int var7 = var5.field3592;
                Iterator var8 = class322.field3483.iterator();
                while (var8.hasNext()) {
                    class328 var9 = (class328) var8.next();
                    var9.method1275(var6, var7);
                }
            }
        }
        if (var2 && field781 && Statics.field1497 != null) {
            Statics.field1497.method741();
        }
        method3445();
        field793.method4042();
        this.method527();
        class36 var12 = class36.field219;
        synchronized (class36.field219) {
            class36.field228 = class36.field236;
            class36.field229 = class36.field239;
            class36.field230 = class36.field222;
            class36.field231 = class36.field235;
            class36.field227 = class36.field232;
            class36.field225 = class36.field224;
            class36.field238 = class36.field234;
            class36.field233 = class36.field226;
            class36.field232 = 0;
        }
        if (Statics.field3424 != null) {
            int var14 = Statics.field3424.method272();
            field740 = var14;
        }
        if (field532 == 0) {
            method7694();
            class35.method5539();
        } else if (field532 == 5) {
            class77.method7343(this, Statics.field436, Statics.field1655);
            method7694();
            class35.method5539();
        } else if (field532 == 10 || field532 == 11) {
            class77.method7343(this, Statics.field436, Statics.field1655);
        } else if (field532 == 20) {
            class77.method7343(this, Statics.field436, Statics.field1655);
            this.method1153();
        } else if (field532 == 50) {
            class77.method7343(this, Statics.field436, Statics.field1655);
            this.method1153();
        } else if (field532 == 25) {
            method1064();
        }
        if (field532 == 30) {
            this.method1389();
        } else if (field532 == 40 || field532 == 45) {
            this.method1153();
        }
    }

    @ObfuscatedName("client.bn(ZI)V")
    public final void method483(boolean arg0) {
        if ((field532 == 10 || field532 == 20 || field532 == 30) && field757 != 0L && class318.method2218() > field757) {
            method3718(method7585());
        }
        if (arg0) {
            for (int var2 = 0; var2 < 100; var2++) {
                field817[var2] = true;
            }
        }
        if (field532 == 0) {
            this.method474(class77.field951, class77.field977, arg0, Statics.field2062);
        } else if (field532 == 5) {
            class77.method2102(Statics.field1813, Statics.field436, Statics.field1655);
        } else if (field532 == 10 || field532 == 11) {
            class77.method2102(Statics.field1813, Statics.field436, Statics.field1655);
        } else if (field532 == 20) {
            class77.method2102(Statics.field1813, Statics.field436, Statics.field1655);
        } else if (field532 == 50) {
            class77.method2102(Statics.field1813, Statics.field436, Statics.field1655);
        } else if (field532 == 25) {
            if (field599 == 1) {
                if (field595 > field667) {
                    field667 = field595;
                }
                int var3 = (field667 * 50 - field595 * 50) / field667;
                method4110(class370.field4312 + class103.field1348 + class103.field1345 + var3 + "%" + class103.field1346, false);
            } else if (field599 == 2) {
                if (field622 > field598) {
                    field598 = field622;
                }
                int var4 = (field598 * 50 - field622 * 50) / field598 + 50;
                method4110(class370.field4312 + class103.field1348 + class103.field1345 + var4 + "%" + class103.field1346, false);
            } else {
                method4110(class370.field4312, false);
            }
        } else if (field532 == 30) {
            this.method1157();
        } else if (field532 == 40) {
            method4110(class370.field4019 + class103.field1348 + class370.field4020, false);
        } else if (field532 == 45) {
            method4110(class370.field4220, false);
        }
        if (field532 == 30 && field756 == 0 && !arg0 && !field695) {
            for (int var5 = 0; var5 < field608; var5++) {
                if (field722[var5]) {
                    Statics.field1455.method429(field752[var5], field753[var5], field754[var5], field758[var5]);
                    field722[var5] = false;
                }
            }
        } else if (field532 > 0) {
            Statics.field1455.method428(0, 0);
            for (int var6 = 0; var6 < field608; var6++) {
                field722[var6] = false;
            }
        }
    }

    @ObfuscatedName("client.br(I)V")
    public final void method484() {
        if (Statics.field470 != null && Statics.field470.method2671()) {
            Statics.field470.method2668();
        }
        if (Statics.field4662 != null) {
            Statics.field4662.field1110 = false;
        }
        Statics.field4662 = null;
        field590.method2737();
        Statics.method6934();
        Statics.field3424 = null;
        if (Statics.field1497 != null) {
            Statics.field1497.method739();
        }
        Statics.field3898.method6515();
        class375.method3448();
        if (Statics.field1838 != null) {
            Statics.field1838.method2756();
            Statics.field1838 = null;
        }
        class215.method2337();
        this.field566.method161();
    }

    @ObfuscatedName("oi.gj(I)V")
    public static void method6345() {
        field719 = true;
        if (Statics.field470 != null && Statics.field470.method2671()) {
            Statics.field470.method2668();
        }
        method75();
        method1103();
        if (Statics.field4662 != null) {
            Statics.field4662.field1110 = false;
        }
        Statics.field4662 = null;
        field590.method2737();
        if (Statics.field217 != null) {
            try {
                Statics.field217.method3857();
            } catch (Exception var4) {
            }
        }
        Statics.field217 = null;
        method2968();
        method3036();
        if (Statics.field1283 != null) {
            Statics.field1283.method5071();
        }
        for (int var1 = 0; var1 < field600.length; var1++) {
            if (field600[var1] != null) {
                field600[var1].method4069();
            }
        }
        Statics.field1053 = null;
        class322.method3196(0, 0);
        class322.method1122();
        field781 = false;
        class71.method2248();
        if (Statics.field1497 != null) {
            Statics.field1497.method739();
        }
        Statics.field3898.method6515();
        class375.method3448();
        if (Statics.field1838 != null) {
            Statics.field1838.method2756();
        }
        class215.method2337();
        class215.field2336 = null;
        class215.field2340 = null;
        Statics.field1847 = null;
        class217.method2984();
        Statics.field1731 = null;
        field597.clear();
        field787 = 0;
        Statics.field3898 = new class379();
        Statics.field1838 = new class115(Statics.field2033.field618, 220);
        try {
            class215.method417("oldschool", Statics.field153, Statics.field1537.field3977, 0, 23);
        } catch (IOException var3) {
            throw new RuntimeException(var3);
        }
        Statics.field1731 = new class462(255, class215.field2336, class215.field2340, 500000);
        Statics.field217 = new class213();
        Statics.field2033.method485();
        method4555(class94.field1166);
        method2012(0);
    }

    @ObfuscatedName("fx.gk(I)V")
    public static void method3036() {
        Statics.field3616 = null;
        Statics.field2170 = null;
        Statics.field4779 = null;
        Statics.field62 = null;
        Statics.field1827 = null;
        Statics.field1042 = null;
        Statics.field1391 = null;
        Statics.field493 = null;
        Statics.field2582 = null;
        Statics.field1682 = null;
        Statics.field2686 = null;
    }

    @ObfuscatedName("ca.gs(II)V")
    public static void method2012(int arg0) {
        if (field532 == arg0) {
            return;
        }
        if (field532 == 30) {
            field738.method4022();
        }
        if (field532 == 0) {
            Statics.field2033.method566();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45 || arg0 == 50) {
            method6928(class68.field520);
            field560 = 0;
            field561 = 0;
            field593.method7363(arg0);
            if (arg0 != 20) {
                method2259(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field3540 != null) {
            Statics.field3540.method7672();
            Statics.field3540 = null;
        }
        if (field532 == 25) {
            field599 = 0;
            field595 = 0;
            field667 = 1;
            field622 = 0;
            field598 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            boolean var2 = Statics.field156.method2422() >= field689;
            int var3 = var2 ? 0 : 12;
            class77.method5804(Statics.field469, Statics.field3275, true, var3);
        } else if (arg0 == 20) {
            int var1 = field532 == 11 ? 4 : 0;
            class77.method5804(Statics.field469, Statics.field3275, false, var1);
        } else if (arg0 == 11) {
            class77.method5804(Statics.field469, Statics.field3275, false, 4);
        } else if (arg0 == 50) {
            class77.method2776("", "Updating date of birth...", "");
            class77.method5804(Statics.field469, Statics.field3275, false, 7);
        } else if (arg0 != 0) {
            class77.method4556();
        }
        field532 = arg0;
    }

    @ObfuscatedName("client.gq(I)V")
    public void method1150() {
        if (field532 != 1000) {
            boolean var1 = Statics.field3898.method6512();
            if (!var1) {
                this.method1151();
            }
        }
    }

    @ObfuscatedName("client.gz(B)V")
    public void method1151() {
        if (Statics.field3898.field4417 >= 4) {
            this.method486("js5crc");
            method2012(1000);
            return;
        }
        if (Statics.field3898.field4434 >= 4) {
            if (field532 <= 5) {
                this.method486("js5io");
                method2012(1000);
                return;
            }
            field556 = 3000;
            Statics.field3898.field4434 = 3;
        }
        if (--field556 + 1 > 0) {
            return;
        }
        try {
            if (field713 == 0) {
                Statics.field4462 = Statics.field217.method3856(Statics.field1931, Statics.field3447);
                field713++;
            }
            if (field713 == 1) {
                if (Statics.field4462.field2380 == 2) {
                    this.method1335(-1);
                    return;
                }
                if (Statics.field4462.field2380 == 1) {
                    field713++;
                }
            }
            if (field713 == 2) {
                Socket var1 = (Socket) Statics.field4462.field2381;
                class459 var2 = new class459(var1, 40000, 5000);
                Statics.field2299 = var2;
                class534 var3 = new class534(5);
                var3.method8574(class315.field3426.field3433);
                var3.method8577(220);
                Statics.field2299.method7671(var3.field5199, 0, 5);
                field713++;
                Statics.field923 = class318.method2218();
            }
            if (field713 == 3) {
                if (Statics.field2299.method7668() > 0) {
                    int var4 = Statics.field2299.method7669();
                    if (var4 != 0) {
                        this.method1335(var4);
                        return;
                    }
                    field713++;
                } else if (class318.method2218() - Statics.field923 > 30000L) {
                    this.method1335(-2);
                    return;
                }
            }
            if (field713 == 4) {
                Statics.field3898.method6520(Statics.field2299, field532 > 20);
                Statics.field4462 = null;
                Statics.field2299 = null;
                field713 = 0;
                field567 = 0;
            }
        } catch (IOException var6) {
            this.method1335(-3);
        }
    }

    @ObfuscatedName("client.gv(II)V")
    public void method1335(int arg0) {
        Statics.field4462 = null;
        Statics.field2299 = null;
        field713 = 0;
        if (Statics.field3447 == Statics.field2313) {
            Statics.field3447 = Statics.field1706;
        } else {
            Statics.field3447 = Statics.field2313;
        }
        field567++;
        if (field567 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field532 <= 5) {
                this.method486("js5connect_full");
                method2012(1000);
            } else {
                field556 = 3000;
            }
        } else if (field567 >= 2 && arg0 == 6) {
            this.method486("js5connect_outofdate");
            method2012(1000);
        } else if (field567 >= 4) {
            if (field532 <= 5) {
                this.method486("js5connect");
                method2012(1000);
            } else {
                field556 = 3000;
            }
        }
    }

    @ObfuscatedName("cf.gu(Lom;Ljava/lang/String;I)V")
    public static void method2074(class376 arg0, String arg1) {
        class85 var2 = new class85(arg0, arg1);
        field597.add(var2);
        field787 += var2.field1067;
    }

    @ObfuscatedName("ul.gc(I)I")
    public static int method8866() {
        if (field597 == null || field624 >= field597.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field624; var1++) {
            var0 += ((class85) field597.get(var1)).field1068;
        }
        return var0 * 10000 / field787;
    }

    @ObfuscatedName("kl.gx(II)I")
    public static int method4600(int arg0) {
        return arg0 * 3 + 600;
    }

    @ObfuscatedName("rz.hg(I)V")
    public static void method7694() {
        if (field554 == class94.field1166) {
            Statics.field4388 = method1089(4, false, true, true, false);
            Statics.field2922 = method1089(6, true, true, true, false);
            Statics.field3275 = method1089(8, false, true, true, false);
            Statics.field469 = method1089(10, false, true, true, false);
            Statics.field122 = method1089(13, true, false, true, false);
            Statics.field4484 = method1089(14, false, true, true, false);
            Statics.field1085 = method1089(15, false, true, true, false);
            Statics.method2874(20, class370.field4022);
            method4555(class94.field1168);
        } else if (field554 == class94.field1168) {
            byte var0 = 0;
            int var1 = var0 + Statics.field4388.method6365() * 53 / 100;
            int var2 = var1 + Statics.field2922.method6365() * 5 / 100;
            int var3 = var2 + Statics.field3275.method6365() * 36 / 100;
            int var4 = var3 + Statics.field469.method6365() / 100;
            int var5 = var4 + Statics.field122.method6365() / 100;
            int var6 = var5 + Statics.field4484.method6365() * 3 / 100;
            int var7 = var6 + Statics.field1085.method6365() / 100;
            if (var7 == 100) {
                method2074(Statics.field4388, "Sound FX");
                method2074(Statics.field2922, "Music Tracks");
                method2074(Statics.field3275, "Sprites");
                method2074(Statics.field4484, "Music Samples");
                method2074(Statics.field1085, "Music Patches");
                Statics.method2874(40, class370.field4024);
                method4555(class94.field1178);
            } else if (var7 != 0) {
                Statics.method2874(30, class370.field4023 + var7 + "%");
            }
        } else if (field554 == class94.field1178) {
            class43.method778(22050, !field716, 2);
            ArrayList var8 = new ArrayList(3);
            Statics.field1497 = class43.method4044(Statics.field217, 0, 2048);
            Statics.field3083 = new class39();
            class39 var9 = new class39();
            var9.method699(Statics.field3083);
            for (int var10 = 0; var10 < 3; var10++) {
                class323 var11 = new class323(Statics.field1497);
                var11.method5609(9, 128);
                var9.method699(var11);
                var8.add(var11);
            }
            Statics.field1497.method735(var9);
            class376 var12 = Statics.field1085;
            class376 var13 = Statics.field4484;
            class376 var14 = Statics.field4388;
            Statics.field3481 = var12;
            Statics.field3476 = var13;
            Statics.field3478 = var14;
            class322.field3480 = var8;
            Statics.field920 = new class58(22050, Statics.field296);
            Statics.method2874(60, class370.field4252);
            method4555(class94.field1171);
        } else if (field554 == class94.field1171) {
            if (Statics.field1926 == null) {
                Statics.field1926 = new class503(Statics.field3275, Statics.field122);
            }
            int var15 = class504.method8268().length;
            field744 = Statics.field1926.method8264(class504.method8268());
            if (field744.size() < var15) {
                Statics.method2874(80, class370.field4267 + field744.size() * 100 / var15 + "%");
            } else {
                Statics.field436 = (class413) field744.get(class504.field5053);
                Statics.field1655 = (class413) field744.get(class504.field5054);
                Statics.field1813 = (class413) field744.get(class504.field5055);
                Statics.field166 = field819.method7999();
                Statics.method2874(80, class370.field4027);
                method4555(class94.field1174);
            }
        } else if (field554 == class94.field1174) {
            int var16 = class77.method4178(Statics.field469, Statics.field3275);
            int var17 = class77.method624(Statics.field3275);
            if (var16 < var17) {
                Statics.method2874(90, class370.field4264 + var16 * 100 / var17 + "%");
            } else {
                Statics.method2874(100, class370.field4164);
                if (Statics.field2697) {
                    method2012(5);
                    method4555(class94.field1170);
                } else {
                    method4555(class94.field1167);
                }
            }
        } else if (field554 == class94.field1170) {
            method2012(10);
        } else if (field554 == class94.field1167) {
            Statics.field1725 = method1089(0, false, true, true, false);
            Statics.field557 = method1089(1, false, true, true, false);
            Statics.field95 = method1089(2, true, false, true, false);
            Statics.field465 = method1089(3, false, true, true, false);
            Statics.field2337 = method1089(5, true, true, true, false);
            Statics.field2071 = method1089(7, false, true, true, false);
            Statics.field1418 = method1089(9, false, true, true, false);
            Statics.field2613 = method1089(11, false, true, true, false);
            Statics.field2612 = method1089(12, false, true, true, false);
            Statics.field53 = method1089(17, true, true, true, false);
            Statics.field2046 = method1089(18, false, true, true, false);
            Statics.field1833 = method1089(19, false, true, true, false);
            Statics.field3959 = method1089(20, false, true, true, false);
            Statics.field1704 = method1089(21, false, true, true, false);
            Statics.field240 = method3359(22, false, true, true, true, true);
            Statics.method2874(20, class370.field4022);
            method4555(class94.field1169);
        } else if (field554 == class94.field1169) {
            byte var18 = 0;
            int var19 = var18 + Statics.field1725.method6365() * 5 / 100;
            int var20 = var19 + Statics.field557.method6365() * 2 / 100;
            int var21 = var20 + Statics.field95.method6365() / 100;
            int var22 = var21 + Statics.field465.method6365() / 100;
            int var23 = var22 + Statics.field2337.method6365() * 10 / 100;
            int var24 = var23 + Statics.field2071.method6365() * 65 / 100;
            int var25 = var24 + Statics.field1418.method6365() / 100;
            int var26 = var25 + Statics.field2613.method6365() / 100;
            int var27 = var26 + Statics.field2612.method6365() * 6 / 100;
            int var28 = var27 + Statics.field1833.method6365() / 100;
            int var29 = var28 + Statics.field2046.method6365() * 2 / 100;
            int var30 = var29 + Statics.field3959.method6365() * 2 / 100;
            int var31 = var30 + Statics.field1704.method6365() / 100;
            int var32 = var31 + Statics.field240.method6365() / 100;
            int var33 = var32 + (Statics.field53.method6364() && Statics.field53.method6446() ? 1 : 0);
            if (var33 == 100) {
                method2074(Statics.field1725, "Animations");
                method2074(Statics.field557, "Skeletons");
                method2074(Statics.field2337, "Maps");
                method2074(Statics.field2071, "Models");
                method2074(Statics.field2613, "Music Jingles");
                method2074(Statics.field1833, "World Map");
                method2074(Statics.field2046, "World Map Geography");
                method2074(Statics.field3959, "World Map Ground");
                Statics.field1515 = new class464();
                Statics.field1515.method7738(Statics.field53);
                Statics.method2874(30, class370.field4024);
                method4555(class94.field1172);
            } else if (var33 != 0) {
                Statics.method2874(30, class370.field4023 + var33 + "%");
            }
        } else if (field554 == class94.field1172) {
            Statics.field1283 = new class276(4, 104, 104, class83.field1049);
            for (int var34 = 0; var34 < 4; var34++) {
                field600[var34] = new class230(104, 104);
            }
            Statics.field119 = new class548(512, 512);
            Statics.method2874(30, class370.field4149);
            method4555(class94.field1173);
        } else if (field554 == class94.field1173) {
            if (!Statics.field95.method6446()) {
                Statics.method2874(40, class370.field4297 + Statics.field95.method6376() + "%");
            } else if (Statics.field1704.method6446()) {
                Statics.method3696(Statics.field95);
                class376 var35 = Statics.field95;
                Statics.field2052 = var35;
                class181.method7251(Statics.field95, Statics.field2071);
                class376 var36 = Statics.field95;
                class376 var37 = Statics.field2071;
                boolean var38 = field716;
                boolean var39 = field531 >= 220;
                Statics.field2161 = var36;
                Statics.field2118 = var37;
                class204.field2117 = var38;
                class204.field2119 = var39;
                class376 var40 = Statics.field95;
                class376 var41 = Statics.field2071;
                Statics.field1964 = var40;
                Statics.field1965 = var41;
                class376 var42 = Statics.field95;
                Statics.field2081 = var42;
                class376 var43 = Statics.field95;
                class376 var44 = Statics.field2071;
                boolean var45 = field525;
                class413 var46 = Statics.field436;
                Statics.field2175 = var43;
                Statics.field2231 = var44;
                Statics.field1288 = var45;
                Statics.field2177 = Statics.field2175.method6429(10);
                Statics.field407 = var46;
                class376 var47 = Statics.field95;
                class376 var48 = Statics.field1725;
                class376 var49 = Statics.field557;
                boolean var50 = field531 >= 220;
                Statics.field1697 = var47;
                Statics.field1618 = var48;
                Statics.field1627 = var49;
                class207.field2251 = var50;
                class376 var51 = Statics.field95;
                class376 var52 = Statics.field2071;
                Statics.field2043 = var51;
                Statics.field2035 = var52;
                class198.method4256(Statics.field95);
                class177.method2098(Statics.field95);
                Statics.field1071 = new class341(Statics.field465, Statics.field2071, Statics.field3275, Statics.field122, Statics.field240);
                class172.method8272(Statics.field95);
                class185.method7735(Statics.field95);
                class180.method2754(Statics.field95);
                class376 var53 = Statics.field95;
                class200.method655(Statics.field95);
                class525.method2378(Statics.field95);
                class527.method2273(Statics.field95);
                Statics.field1932 = new class517(Statics.field152, 54, Statics.field2689, Statics.field95);
                Statics.field489 = new class517(Statics.field152, 47, Statics.field2689, Statics.field95);
                Statics.field470 = new class111();
                class376 var54 = Statics.field95;
                class376 var55 = Statics.field3275;
                class376 var56 = Statics.field122;
                Statics.field2098 = var54;
                Statics.field82 = var55;
                Statics.field2086 = var56;
                class376 var57 = Statics.field95;
                class376 var58 = Statics.field3275;
                Statics.field1911 = var57;
                Statics.field1908 = var58;
                class376 var59 = Statics.field95;
                class376 var60 = Statics.field3275;
                Statics.field1888 = var60;
                if (var59.method6446()) {
                    Statics.field1880 = var59.method6429(35);
                    Statics.field1876 = new class179[Statics.field1880];
                    for (int var61 = 0; var61 < Statics.field1880; var61++) {
                        byte[] var62 = var59.method6489(35, var61);
                        Statics.field1876[var61] = new class179(var61);
                        if (var62 != null) {
                            Statics.field1876[var61].method3240(new class534(var62));
                            Statics.field1876[var61].method3265();
                        }
                    }
                }
                Statics.method2874(50, class370.field4316);
                method4555(class94.field1176);
            } else {
                Statics.method2874(40, class370.field4297 + (80 + Statics.field2612.method6376() / 6) + "%");
            }
        } else if (field554 == class94.field1176) {
            int var63 = 0;
            if (Statics.field3616 == null) {
                Statics.field3616 = class549.method3899(Statics.field3275, Statics.field1515.field4820, 0);
            } else {
                var63++;
            }
            if (Statics.field2170 == null) {
                Statics.field2170 = class549.method3899(Statics.field3275, Statics.field1515.field4811, 0);
            } else {
                var63++;
            }
            if (Statics.field4779 == null) {
                class376 var64 = Statics.field3275;
                int var65 = Statics.field1515.field4813;
                class547[] var66;
                if (class549.method2926(var64, var65, 0)) {
                    class547[] var67 = new class547[Statics.field5312];
                    for (int var68 = 0; var68 < Statics.field5312; var68++) {
                        class547 var69 = var67[var68] = new class547();
                        var69.field5294 = Statics.field5309;
                        var69.field5291 = Statics.field5310;
                        var69.field5292 = Statics.field5311[var68];
                        var69.field5293 = Statics.field5313[var68];
                        var69.field5290 = Statics.field2482[var68];
                        var69.field5295 = Statics.field5315[var68];
                        var69.field5289 = Statics.field4778;
                        var69.field5288 = Statics.field5314[var68];
                    }
                    Statics.field5311 = null;
                    Statics.field5313 = null;
                    Statics.field2482 = null;
                    Statics.field5315 = null;
                    Statics.field4778 = null;
                    Statics.field5314 = (byte[][]) null;
                    var66 = var67;
                } else {
                    var66 = null;
                }
                Statics.field4779 = var66;
            } else {
                var63++;
            }
            if (Statics.field62 == null) {
                Statics.field62 = Statics.method2990(Statics.field3275, Statics.field1515.field4814, 0);
            } else {
                var63++;
            }
            if (Statics.field1827 == null) {
                Statics.field1827 = Statics.method2990(Statics.field3275, Statics.field1515.field4815, 0);
            } else {
                var63++;
            }
            if (Statics.field1042 == null) {
                Statics.field1042 = Statics.method2990(Statics.field3275, Statics.field1515.field4816, 0);
            } else {
                var63++;
            }
            if (Statics.field1391 == null) {
                Statics.field1391 = Statics.method2990(Statics.field3275, Statics.field1515.field4823, 0);
            } else {
                var63++;
            }
            if (Statics.field493 == null) {
                Statics.field493 = Statics.method2990(Statics.field3275, Statics.field1515.field4818, 0);
            } else {
                var63++;
            }
            if (Statics.field2582 == null) {
                Statics.field2582 = Statics.method2990(Statics.field3275, Statics.field1515.field4819, 0);
            } else {
                var63++;
            }
            if (Statics.field1682 == null) {
                class376 var71 = Statics.field3275;
                int var72 = Statics.field1515.field4817;
                class547[] var73;
                if (class549.method2926(var71, var72, 0)) {
                    class547[] var74 = new class547[Statics.field5312];
                    for (int var75 = 0; var75 < Statics.field5312; var75++) {
                        class547 var76 = var74[var75] = new class547();
                        var76.field5294 = Statics.field5309;
                        var76.field5291 = Statics.field5310;
                        var76.field5292 = Statics.field5311[var75];
                        var76.field5293 = Statics.field5313[var75];
                        var76.field5290 = Statics.field2482[var75];
                        var76.field5295 = Statics.field5315[var75];
                        var76.field5289 = Statics.field4778;
                        var76.field5288 = Statics.field5314[var75];
                    }
                    Statics.field5311 = null;
                    Statics.field5313 = null;
                    Statics.field2482 = null;
                    Statics.field5315 = null;
                    Statics.field4778 = null;
                    Statics.field5314 = (byte[][]) null;
                    var73 = var74;
                } else {
                    var73 = null;
                }
                Statics.field1682 = var73;
            } else {
                var63++;
            }
            if (Statics.field2686 == null) {
                class376 var78 = Statics.field3275;
                int var79 = Statics.field1515.field4821;
                class547[] var80;
                if (class549.method2926(var78, var79, 0)) {
                    class547[] var81 = new class547[Statics.field5312];
                    for (int var82 = 0; var82 < Statics.field5312; var82++) {
                        class547 var83 = var81[var82] = new class547();
                        var83.field5294 = Statics.field5309;
                        var83.field5291 = Statics.field5310;
                        var83.field5292 = Statics.field5311[var82];
                        var83.field5293 = Statics.field5313[var82];
                        var83.field5290 = Statics.field2482[var82];
                        var83.field5295 = Statics.field5315[var82];
                        var83.field5289 = Statics.field4778;
                        var83.field5288 = Statics.field5314[var82];
                    }
                    Statics.field5311 = null;
                    Statics.field5313 = null;
                    Statics.field2482 = null;
                    Statics.field5315 = null;
                    Statics.field4778 = null;
                    Statics.field5314 = (byte[][]) null;
                    var80 = var81;
                } else {
                    var80 = null;
                }
                Statics.field2686 = var80;
            } else {
                var63++;
            }
            if (var63 < 11) {
                Statics.method2874(70, class370.field4156 + var63 * 100 / 12 + "%");
            } else {
                Statics.field4597 = Statics.field2686;
                Statics.field2170.method9110();
                int var85 = (int) (Math.random() * 21.0D) - 10;
                int var86 = (int) (Math.random() * 21.0D) - 10;
                int var87 = (int) (Math.random() * 21.0D) - 10;
                int var88 = (int) (Math.random() * 41.0D) - 20;
                Statics.field4779[0].method8983(var85 + var88, var86 + var88, var87 + var88);
                Statics.method2874(60, class370.field4033);
                method4555(class94.field1179);
            }
        } else if (field554 == class94.field1179) {
            if (Statics.field1418.method6446()) {
                Statics.field1774 = new class282(Statics.field1418, Statics.field3275, 20, Statics.field156.method2425(), field716 ? 64 : 128);
                class272.method4813(Statics.field1774);
                class272.method4749(Statics.field156.method2425());
                method4555(class94.field1165);
            } else {
                Statics.method2874(70, class370.field4059 + "0%");
            }
        } else if (field554 == class94.field1165) {
            int var89 = Statics.field1774.method5104();
            if (var89 < 100) {
                Statics.method2874(80, class370.field4059 + var89 + "%");
            } else {
                Statics.method2874(90, class370.field4035);
                method4555(class94.field1177);
            }
        } else if (field554 == class94.field1177) {
            Statics.field4662 = new class90();
            Statics.field217.method3858(Statics.field4662, 10);
            Statics.method2874(92, class370.field4082);
            method4555(class94.field1175);
        } else if (field554 == class94.field1175) {
            if (Statics.field469.method6430("huffman", "")) {
                class356 var90 = new class356(Statics.field469.method6438("huffman", ""));
                Statics.field4540 = var90;
                Statics.method2874(94, class370.field4038);
                method4555(class94.field1181);
            } else {
                Statics.method2874(94, class370.field4138 + "%");
            }
        } else if (field554 == class94.field1181) {
            if (!Statics.field465.method6446()) {
                Statics.method2874(96, class370.field4029 + Statics.field465.method6376() * 4 / 5 + "%");
            } else if (!Statics.field240.method6446()) {
                Statics.method2874(96, class370.field4029 + Statics.field240.method6376() * 4 / 5 + "%");
            } else if (!Statics.field2612.method6446()) {
                Statics.method2874(96, class370.field4029 + (80 + Statics.field2612.method6376() / 6) + "%");
            } else if (Statics.field122.method6446()) {
                Statics.method2874(98, class370.field4025);
                if (Statics.field2612.method6496("version.dat", "")) {
                    class534 var91 = new class534(Statics.field2612.method6438("version.dat", ""));
                    var91.method8593();
                }
                method4555(class94.field1180);
            } else {
                Statics.method2874(96, class370.field4029 + (96 + Statics.field122.method6376() / 50) + "%");
            }
        } else if (field554 == class94.field1180) {
            if (Statics.field1833.method6454() <= 0 || Statics.field1833.method6448(class261.field2681.field2680)) {
                if (Statics.field1053 == null) {
                    Statics.field1053 = new class502();
                    Statics.field1053.method8107(Statics.field1833, Statics.field2046, Statics.field3959, Statics.field1813, field744, Statics.field4779);
                }
                Statics.method2874(100, class370.field4042);
                if (Statics.field2697) {
                    method4555(class94.field1182);
                } else {
                    method4555(class94.field1170);
                }
                field719 = false;
            } else {
                Statics.method2874(100, class370.field4041 + Statics.field1833.method6441(class261.field2681.field2680) / 10 + "%");
            }
        } else if (field554 == class94.field1182) {
            Statics.field2062 = false;
            method2012(20);
            method6928(class68.field515);
        }
    }

    @ObfuscatedName("jk.hd(Ldi;B)V")
    public static void method4555(class94 arg0) {
        if (field554 != arg0) {
            field554 = arg0;
        }
    }

    @ObfuscatedName("cw.hw(IZZZZS)Lom;")
    public static class376 method1089(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        class462 var5 = null;
        if (class215.field2336 != null) {
            var5 = new class462(arg0, class215.field2336, Statics.field1847[arg0], 1000000);
        }
        return new class376(var5, Statics.field1731, Statics.field3898, arg0, arg1, arg2, arg3, arg4, false);
    }

    @ObfuscatedName("hu.hq(IZZZZZB)Lom;")
    public static class376 method3359(int arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5) {
        class462 var6 = null;
        if (class215.field2336 != null) {
            var6 = new class462(arg0, class215.field2336, Statics.field1847[arg0], 1000000);
        }
        return new class376(var6, Statics.field1731, Statics.field3898, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @ObfuscatedName("client.hu(I)V")
    public final void method1153() {
        class458 var1 = field590.method2732();
        class533 var2 = field590.field1429;
        try {
            if (Statics.field559 == class68.field520) {
                if (Statics.field490 == null && (field580.method2124() || field560 > 250)) {
                    Statics.field490 = field580.method2123();
                    field580.method2121();
                    field580 = null;
                }
                if (Statics.field490 != null) {
                    if (var1 != null) {
                        var1.method7672();
                        var1 = null;
                    }
                    Statics.field1325 = null;
                    field592 = false;
                    field560 = 0;
                    if (!field564.method8869()) {
                        method6928(class68.field496);
                    } else if (this.method1144()) {
                        try {
                            this.method1549(Statics.field5132);
                            method6928(class68.field517);
                        } catch (Throwable var65) {
                            Statics.method5453((String) null, var65);
                            method2330(65);
                            return;
                        }
                    } else if (this.method1145()) {
                        try {
                            this.method1149(Statics.field3902, Statics.field2923);
                            method6928(class68.field516);
                        } catch (Exception var64) {
                            Statics.method5453((String) null, var64);
                            method2330(65);
                            return;
                        }
                    } else {
                        method2330(65);
                        return;
                    }
                }
            }
            if (Statics.field559 == class68.field517) {
                if (this.field542 == null) {
                    if (this.field809 == null) {
                        method2330(65);
                        return;
                    }
                    if (!this.field809.method245()) {
                        return;
                    }
                    if (this.field809.method233()) {
                        Statics.method5453(this.field809.method232(), (Throwable) null);
                        method2330(65);
                        this.field809 = null;
                        return;
                    }
                    class21 var7 = this.field809.method234();
                    if (var7.method259() != 200) {
                        method2330(65);
                        this.field809 = null;
                        return;
                    }
                    field560 = 0;
                    class482 var8 = new class482(var7.method258());
                    try {
                        Statics.field120 = var8.method7953().getString("access_token");
                        Statics.field5132 = var8.method7953().getString("refresh_token");
                    } catch (Exception var62) {
                        Statics.method5453("Error parsing tokens", var62);
                        method2330(65);
                        this.field809 = null;
                        return;
                    }
                } else if (this.field542.isDone()) {
                    if (this.field542.isCancelled()) {
                        method2330(65);
                        this.field542 = null;
                        return;
                    }
                    try {
                        RefreshAccessTokenResponse var5 = (RefreshAccessTokenResponse) this.field542.get();
                        if (!var5.isSuccess()) {
                            method2330(65);
                            this.field542 = null;
                            return;
                        }
                        Statics.field120 = var5.getAccessToken();
                        Statics.field5132 = var5.getRefreshToken();
                        this.field542 = null;
                    } catch (Exception var63) {
                        Statics.method5453((String) null, var63);
                        method2330(65);
                        this.field542 = null;
                        return;
                    }
                } else {
                    return;
                }
                this.method1148(Statics.field120);
                method6928(class68.field516);
            }
            if (Statics.field559 == class68.field516) {
                if (this.field569 == null) {
                    if (this.field523 == null) {
                        method2330(65);
                        return;
                    }
                    if (!this.field523.method245()) {
                        return;
                    }
                    if (this.field523.method233()) {
                        Statics.method5453(this.field523.method232(), (Throwable) null);
                        method2330(65);
                        this.field523 = null;
                        return;
                    }
                    class21 var12 = this.field523.method234();
                    if (var12.method259() != 200) {
                        Statics.method5453("Response code: " + var12.method259() + "Response body: " + var12.method258(), (Throwable) null);
                        method2330(65);
                        this.field523 = null;
                        return;
                    }
                    List var13 = (List) var12.method257().get("Content-Type");
                    if (var13 != null && var13.contains(class480.field4880.method7937())) {
                        try {
                            JSONObject var14 = new JSONObject(var12.method258());
                            this.field565 = var14.getString("token");
                        } catch (JSONException var60) {
                            Statics.method5453((String) null, var60);
                            method2330(65);
                            this.field523 = null;
                            return;
                        }
                    } else {
                        this.field565 = var12.method258();
                    }
                    this.field523 = null;
                } else if (this.field569.isDone()) {
                    if (this.field569.isCancelled()) {
                        method2330(65);
                        this.field569 = null;
                        return;
                    }
                    try {
                        OtlTokenResponse var10 = (OtlTokenResponse) this.field569.get();
                        if (!var10.isSuccess()) {
                            method2330(65);
                            this.field569 = null;
                            return;
                        }
                        this.field565 = var10.getToken();
                        this.field569 = null;
                    } catch (Exception var61) {
                        Statics.method5453((String) null, var61);
                        method2330(65);
                        this.field569 = null;
                        return;
                    }
                } else {
                    return;
                }
                field560 = 0;
                method6928(class68.field496);
            }
            if (Statics.field559 == class68.field496) {
                if (Statics.field1325 == null) {
                    Statics.field1325 = Statics.field217.method3856(Statics.field1931, Statics.field3447);
                }
                if (Statics.field1325.field2380 == 2) {
                    throw new IOException();
                }
                if (Statics.field1325.field2380 == 1) {
                    Socket var16 = (Socket) Statics.field1325.field2381;
                    class459 var17 = new class459(var16, 40000, 5000);
                    var1 = var17;
                    field590.method2729(var17);
                    Statics.field1325 = null;
                    method6928(class68.field497);
                }
            }
            if (Statics.field559 == class68.field497) {
                field590.method2728();
                class313 var18 = class313.method3190();
                var18.field3291.method8574(class315.field3436.field3433);
                field590.method2741(var18);
                field590.method2731();
                var2.field5200 = 0;
                method6928(class68.field498);
            }
            if (Statics.field559 == class68.field498) {
                if (Statics.field1497 != null) {
                    Statics.field1497.method736();
                }
                if (var1.method7675(1)) {
                    int var19 = var1.method7669();
                    if (Statics.field1497 != null) {
                        Statics.field1497.method736();
                    }
                    if (var19 != 0) {
                        method2330(var19);
                        return;
                    }
                    var2.field5200 = 0;
                    method6928(class68.field499);
                }
            }
            if (Statics.field559 == class68.field499) {
                if (var2.field5200 < 8) {
                    int var20 = var1.method7668();
                    if (var20 > 8 - var2.field5200) {
                        var20 = 8 - var2.field5200;
                    }
                    if (var20 > 0) {
                        var1.method7670(var2.field5199, var2.field5200, var20);
                        var2.field5200 += var20;
                    }
                }
                if (var2.field5200 == 8) {
                    var2.field5200 = 0;
                    Statics.field1863 = var2.method8598();
                    method6928(class68.field500);
                }
            }
            if (Statics.field559 == class68.field500) {
                field590.field1429.field5200 = 0;
                field590.method2728();
                class533 var21 = new class533(500);
                int[] var22 = new int[] { Statics.field490.nextInt(), Statics.field490.nextInt(), Statics.field490.nextInt(), Statics.field490.nextInt() };
                var21.field5200 = 0;
                var21.method8574(1);
                var21.method8577(var22[0]);
                var21.method8577(var22[1]);
                var21.method8577(var22[2]);
                var21.method8577(var22[3]);
                var21.method8726(Statics.field1863);
                if (field532 == 40) {
                    var21.method8577(Statics.field1[0]);
                    var21.method8577(Statics.field1[1]);
                    var21.method8577(Statics.field1[2]);
                    var21.method8577(Statics.field1[3]);
                } else {
                    if (field532 == 50) {
                        var21.method8574(class126.field1494.method35());
                        var21.method8577(Statics.field3458);
                    } else {
                        var21.method8574(field574.method35());
                        switch(field574.field1495) {
                            case 0:
                            case 2:
                                var21.method8576(Statics.field248);
                                var21.field5200++;
                            case 1:
                            default:
                                break;
                            case 3:
                                var21.method8577(Statics.field156.method2419(class77.field940));
                                break;
                            case 4:
                                var21.field5200 += 4;
                        }
                    }
                    if (field564.method8869()) {
                        var21.method8574(class539.field5254.method35());
                        var21.method8581(this.field565);
                    } else {
                        var21.method8574(class539.field5256.method35());
                        var21.method8581(class77.field961);
                    }
                }
                var21.method8672(class76.field935, class76.field936);
                Statics.field1 = var22;
                class313 var23 = class313.method3190();
                var23.field3291.field5200 = 0;
                if (field532 == 40) {
                    var23.field3291.method8574(class315.field3427.field3433);
                } else {
                    var23.field3291.method8574(class315.field3425.field3433);
                }
                var23.field3291.method8575(0);
                int var24 = var23.field3291.field5200;
                var23.field3291.method8577(220);
                var23.field3291.method8577(1);
                var23.field3291.method8574(field528);
                var23.field3291.method8574(field529);
                byte var25 = 0;
                var23.field3291.method8574(var25);
                var23.field3291.method8584(var21.field5199, 0, var21.field5200);
                int var26 = var23.field3291.field5200;
                var23.field3291.method8581(class77.field940);
                var23.field3291.method8574((field695 ? 1 : 0) << 1 | (field716 ? 1 : 0));
                var23.field3291.method8575(Statics.field199);
                var23.field3291.method8575(Statics.field2531);
                method3311(var23.field3291);
                var23.field3291.method8581(Statics.field1373);
                var23.field3291.method8577(Statics.field4532);
                var23.field3291.method8574(0);
                class534 var27 = new class534(Statics.field166.method8013());
                Statics.field166.method8011(var27);
                var23.field3291.method8584(var27.field5199, 0, var27.field5199.length);
                var23.field3291.method8574(field528);
                var23.field3291.method8577(0);
                if (Statics.field2697) {
                    var23.field3291.method8643(Statics.field3275.field4403);
                    var23.field3291.method8643(Statics.field4388.field4403);
                    var23.field3291.method8646(Statics.field2922.field4403);
                    var23.field3291.method8795(Statics.field4484.field4403);
                    var23.field3291.method8643(Statics.field1085.field4403);
                    var23.field3291.method8643(Statics.field469.field4403);
                    var23.field3291.method8795(Statics.field122.field4403);
                } else {
                    var23.field3291.method8643(Statics.field3275.field4403);
                    var23.field3291.method8577(Statics.field2337.field4403);
                    var23.field3291.method8795(Statics.field53.field4403);
                    var23.field3291.method8795(Statics.field3959.field4403);
                    var23.field3291.method8577(Statics.field95.field4403);
                    var23.field3291.method8577(Statics.field465.field4403);
                    var23.field3291.method8795(Statics.field469.field4403);
                    var23.field3291.method8795(Statics.field1725.field4403);
                    var23.field3291.method8795(0);
                    var23.field3291.method8646(Statics.field4388.field4403);
                    var23.field3291.method8646(Statics.field1418.field4403);
                    var23.field3291.method8577(Statics.field2071.field4403);
                    var23.field3291.method8795(Statics.field2612.field4403);
                    var23.field3291.method8577(Statics.field1085.field4403);
                    var23.field3291.method8577(Statics.field557.field4403);
                    var23.field3291.method8577(Statics.field122.field4403);
                    var23.field3291.method8577(Statics.field2922.field4403);
                    var23.field3291.method8643(Statics.field1833.field4403);
                    var23.field3291.method8646(Statics.field2613.field4403);
                    var23.field3291.method8577(Statics.field4484.field4403);
                    var23.field3291.method8795(Statics.field2046.field4403);
                }
                var23.field3291.method8579(var22, var26, var23.field3291.field5200);
                var23.field3291.method8690(var23.field3291.field5200 - var24);
                field590.method2741(var23);
                field590.method2731();
                field590.field1435 = new class551(var22);
                int[] var28 = new int[4];
                for (int var29 = 0; var29 < 4; var29++) {
                    var28[var29] = var22[var29] + 50;
                }
                var2.method8542(var28);
                method6928(class68.field501);
            }
            if (Statics.field559 == class68.field501 && var1.method7668() > 0) {
                int var30 = var1.method7669();
                if (var30 == 61) {
                    int var31 = var1.method7668();
                    Statics.field3132 = var31 == 1 && var1.method7669() == 1;
                    method6928(class68.field500);
                }
                if (var30 == 21 && field532 == 20) {
                    method6928(class68.field512);
                } else if (var30 == 2) {
                    if (Statics.field2697) {
                        method6928(class68.field518);
                    } else {
                        method6928(class68.field502);
                    }
                } else if (var30 == 15 && field532 == 40) {
                    field590.field1431 = -1;
                    method6928(class68.field508);
                } else if (var30 == 64) {
                    method6928(class68.field505);
                } else if (var30 == 23 && field561 < 1) {
                    field561++;
                    method6928(class68.field520);
                } else if (var30 == 29) {
                    method6928(class68.field513);
                } else if (var30 == 69) {
                    method6928(class68.field495);
                } else {
                    method2330(var30);
                    return;
                }
            }
            if (Statics.field559 == class68.field518) {
                Statics.field2062 = true;
                method4555(class94.field1167);
                method2012(0);
            }
            if (Statics.field559 == class68.field495 && var1.method7668() >= 2) {
                var1.method7670(var2.field5199, 0, 2);
                var2.field5200 = 0;
                Statics.field4557 = var2.method8593();
                method6928(class68.field503);
            }
            if (Statics.field559 == class68.field503 && var1.method7668() >= Statics.field4557) {
                var2.field5200 = 0;
                var1.method7670(var2.field5199, var2.field5200, Statics.field4557);
                class7[] var32 = new class7[] { class7.field13 };
                class7 var33 = var32[var2.method8591()];
                try {
                    class4 var34 = class5.method3903(var33);
                    this.field582 = new class8(var2, var34);
                    method6928(class68.field504);
                } catch (Exception var59) {
                    method2330(22);
                    return;
                }
            }
            if (Statics.field559 == class68.field504 && this.field582.method39()) {
                this.field581 = this.field582.method41();
                this.field582.method40();
                this.field582 = null;
                if (this.field581 == null) {
                    method2330(22);
                    return;
                }
                field590.method2728();
                class313 var36 = class313.method3190();
                var36.field3291.method8574(class315.field3434.field3433);
                var36.field3291.method8575(this.field581.field5200);
                var36.field3291.method8585(this.field581);
                field590.method2741(var36);
                field590.method2731();
                this.field581 = null;
                method6928(class68.field501);
            }
            if (Statics.field559 == class68.field505 && var1.method7668() > 0) {
                Statics.field1590 = var1.method7669();
                method6928(class68.field506);
            }
            if (Statics.field559 == class68.field506 && var1.method7668() >= Statics.field1590) {
                var1.method7670(var2.field5199, 0, Statics.field1590);
                var2.field5200 = 0;
                method6928(class68.field501);
            }
            if (Statics.field559 == class68.field512 && var1.method7668() > 0) {
                field562 = (var1.method7669() + 3) * 60;
                method6928(class68.field507);
            }
            if (Statics.field559 == class68.field507) {
                field560 = 0;
                class77.method2776(class370.field4307, class370.field4050, field562 / 60 + class370.field4051);
                if (--field562 <= 0) {
                    method6928(class68.field520);
                }
            } else if (Statics.field559 == class68.field515) {
                class313 var37 = class313.method3190();
                var37.field3291.method8574(class315.field3430.field3433);
                var37.field3291.method8575(class315.field3430.field3432);
                method3155(var37);
                field590.method2741(var37);
                field590.method2731();
                method6928(class68.field502);
            } else {
                if (Statics.field559 == class68.field502 && var1.method7668() >= 1) {
                    Statics.field1443 = var1.method7669();
                    if (Statics.field1443 != class315.field3431.field3432) {
                        method2330(Statics.field1443);
                        return;
                    }
                    method6928(class68.field510);
                }
                if (Statics.field559 == class68.field510 && var1.method7668() >= Statics.field1443) {
                    boolean var38 = var1.method7669() == 1;
                    var1.method7670(var2.field5199, 0, 4);
                    var2.field5200 = 0;
                    boolean var39 = false;
                    if (var38) {
                        int var40 = var2.method8545() << 24;
                        int var41 = var40 | var2.method8545() << 16;
                        int var42 = var41 | var2.method8545() << 8;
                        int var43 = var42 | var2.method8545();
                        Statics.field156.method2456(class77.field940, var43);
                    }
                    if (field579) {
                        Statics.field156.method2431(class77.field940);
                    } else {
                        Statics.field156.method2431((String) null);
                    }
                    class100.method3154();
                    field676 = var1.method7669();
                    field527 = var1.method7669() == 1;
                    field692 = var1.method7669();
                    field692 <<= 0x8;
                    field692 += var1.method7669();
                    field654 = var1.method7669();
                    var1.method7670(var2.field5199, 0, 8);
                    var2.field5200 = 0;
                    this.field583 = var2.method8598();
                    var1.method7670(var2.field5199, 0, 8);
                    var2.field5200 = 0;
                    field655 = var2.method8598();
                    var1.method7670(var2.field5199, 0, 8);
                    var2.field5200 = 0;
                    field602 = var2.method8598();
                    class220.method3497().method3911(this.field618);
                    method6928(class68.field519);
                }
                if (Statics.field559 == class68.field519 && var1.method7668() >= field590.field1431) {
                    var1.method7670(var2.field5199, 0, 1);
                    var2.field5200 = 0;
                    if (var2.method8549()) {
                        var1.method7670(var2.field5199, 1, 1);
                        var2.field5200 = 0;
                    }
                    class314[] var44 = class314.method3375();
                    int var45 = var2.method8547();
                    if (var45 < 0 || var45 >= var44.length) {
                        throw new IOException("Invalid ServerProt: " + var45 + " at " + var2.field5200);
                    }
                    field590.field1430 = var44[var45];
                    field590.field1431 = field590.field1430.field3423;
                    var1.method7670(var2.field5199, 0, 2);
                    var2.field5200 = 0;
                    field590.field1431 = var2.method8593();
                    try {
                        client var46 = Statics.field2033;
                        JSObject.getWindow(var46).call("zap", (Object[]) null);
                    } catch (Throwable var58) {
                    }
                    method6928(class68.field509);
                }
                if (Statics.field559 != class68.field509) {
                    if (Statics.field559 == class68.field513 && var1.method7668() >= 2) {
                        var2.field5200 = 0;
                        var1.method7670(var2.field5199, 0, 2);
                        var2.field5200 = 0;
                        Statics.field1551 = var2.method8593();
                        method6928(class68.field514);
                    }
                    if (Statics.field559 == class68.field514 && var1.method7668() >= Statics.field1551) {
                        var2.field5200 = 0;
                        var1.method7670(var2.field5199, 0, Statics.field1551);
                        var2.field5200 = 0;
                        String var48 = var2.method8741();
                        String var49 = var2.method8741();
                        String var50 = var2.method8741();
                        class77.method2776(var48, var49, var50);
                        method2012(10);
                        if (field564.method8869()) {
                            class77.method3891(9);
                        }
                    }
                    if (Statics.field559 == class68.field508) {
                        if (field590.field1431 == -1) {
                            if (var1.method7668() < 2) {
                                return;
                            }
                            var1.method7670(var2.field5199, 0, 2);
                            var2.field5200 = 0;
                            field590.field1431 = var2.method8593();
                        }
                        if (var1.method7668() >= field590.field1431) {
                            var1.method7670(var2.field5199, 0, field590.field1431);
                            var2.field5200 = 0;
                            int var51 = field590.field1431;
                            field593.method7378();
                            field590.method2728();
                            field590.field1429.field5200 = 0;
                            field590.field1430 = null;
                            field590.field1424 = null;
                            field590.field1436 = null;
                            field590.field1425 = null;
                            field590.field1431 = 0;
                            field590.field1433 = 0;
                            field653 = 0;
                            field701 = 0;
                            field675 = false;
                            field780 = 0;
                            field778 = 0;
                            for (int var52 = 0; var52 < 2048; var52++) {
                                field652[var52] = null;
                            }
                            Statics.field1858 = null;
                            for (int var53 = 0; var53 < field629.length; var53++) {
                                class102 var54 = field629[var53];
                                if (var54 != null) {
                                    var54.field1241 = -1;
                                    var54.field1242 = false;
                                }
                            }
                            class86.method2345();
                            method2012(30);
                            for (int var55 = 0; var55 < 100; var55++) {
                                field817[var55] = true;
                            }
                            if (field590 != null && field590.field1435 != null) {
                                class313 var56 = class313.method5301(class311.field3178, field590.field1435);
                                var56.field3291.method8574(method7585());
                                var56.field3291.method8575(Statics.field199);
                                var56.field3291.method8575(Statics.field2531);
                                field590.method2741(var56);
                            }
                            class109.method13(var2);
                            if (var2.field5200 != var51) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field560++;
                        if (field560 > 2000) {
                            if (field561 < 1) {
                                if (Statics.field3447 == Statics.field2313) {
                                    Statics.field3447 = Statics.field1706;
                                } else {
                                    Statics.field3447 = Statics.field2313;
                                }
                                field561++;
                                method6928(class68.field520);
                            } else {
                                method2330(-3);
                            }
                        }
                    }
                } else if (var1.method7668() >= field590.field1431) {
                    var2.field5200 = 0;
                    var1.method7670(var2.field5199, 0, field590.field1431);
                    field593.method7359();
                    method1103();
                    class109.method13(var2);
                    Statics.field4435 = -1;
                    method2840(false, var2);
                    field590.field1430 = null;
                    field533 = false;
                }
            }
        } catch (IOException var66) {
            if (field561 < 1) {
                if (Statics.field3447 == Statics.field2313) {
                    Statics.field3447 = Statics.field1706;
                } else {
                    Statics.field3447 = Statics.field2313;
                }
                field561++;
                method6928(class68.field520);
            } else {
                method2330(-2);
            }
        }
    }

    @ObfuscatedName("gn.hj(Lmn;B)V")
    public static void method3155(class313 arg0) {
        arg0.field3291.method8795(Statics.field557.field4403);
        arg0.field3291.method8795(Statics.field95.field4403);
        arg0.field3291.method8643(Statics.field1725.field4403);
        arg0.field3291.method8643(Statics.field1833.field4403);
        arg0.field3291.method8795(Statics.field3959.field4403);
        arg0.field3291.method8646(Statics.field2612.field4403);
        arg0.field3291.method8643(Statics.field465.field4403);
        arg0.field3291.method8577(0);
        arg0.field3291.method8643(Statics.field2613.field4403);
        arg0.field3291.method8577(Statics.field1418.field4403);
        arg0.field3291.method8646(Statics.field2046.field4403);
        arg0.field3291.method8646(Statics.field53.field4403);
        arg0.field3291.method8577(Statics.field2071.field4403);
        arg0.field3291.method8646(Statics.field2337.field4403);
    }

    @ObfuscatedName("cy.ht(B)V")
    public static void method1103() {
        field724 = -1L;
        if (Statics.field4662 != null) {
            Statics.field4662.field1112 = 0;
        }
        Statics.field4621 = true;
        field568 = true;
        field584 = -1L;
        class37.field242 = new class399();
        field590.method2728();
        field590.field1429.field5200 = 0;
        field590.field1430 = null;
        field590.field1424 = null;
        field590.field1436 = null;
        field590.field1425 = null;
        field590.field1431 = 0;
        field590.field1433 = 0;
        field653 = 0;
        field591 = 0;
        field543 = 0;
        field701 = 0;
        field675 = false;
        class36.method6384(0);
        class112.method2521();
        field749 = 0;
        field694 = false;
        field782 = 0;
        field541 = 0;
        field535 = 0;
        Statics.field2353 = null;
        field780 = 0;
        field773 = -1;
        field778 = 0;
        field779 = 0;
        field551 = class105.field1362;
        field552 = class105.field1362;
        field572 = 0;
        class109.method2336();
        for (int var0 = 0; var0 < 2048; var0++) {
            field652[var0] = null;
        }
        for (int var1 = 0; var1 < 65536; var1++) {
            field629[var1] = null;
        }
        field665 = -1;
        field577.method6677();
        field669.method6677();
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    field666[var2][var3][var4] = null;
                }
            }
        }
        field658 = new class397();
        Statics.field1091.method1778();
        if (Statics.field1856 > 5000) {
        }
        if (field719) {
            class338.method3871();
        } else {
            for (int var5 = 0; var5 < Statics.field1856; var5++) {
                class177 var6 = class177.method3053(var5);
                if (var6 != null) {
                    class338.field3618[var5] = 0;
                    class338.field3620[var5] = 0;
                }
            }
        }
        if (Statics.field470 != null) {
            Statics.field470.method2667();
        }
        field708 = -1;
        if (field699 != -1) {
            Statics.field1071.method5780(field699);
        }
        for (class88 var7 = (class88) field727.method8325(); var7 != null; var7 = (class88) field727.method8333()) {
            method2122(var7, true);
        }
        field699 = -1;
        field727 = new class508(8);
        field704 = null;
        field701 = 0;
        field675 = false;
        field816.method5814((int[]) null, (int[]) null, new int[] { 0, 0, 0, 0, 0 }, 0, -1);
        for (int var8 = 0; var8 < 8; var8++) {
            field762[var8] = null;
            field663[var8] = false;
        }
        class86.method2345();
        field611 = true;
        for (int var9 = 0; var9 < 100; var9++) {
            field817[var9] = true;
        }
        if (field590 != null && field590.field1435 != null) {
            class313 var10 = class313.method5301(class311.field3178, field590.field1435);
            var10.field3291.method8574(method7585());
            var10.field3291.method8575(Statics.field199);
            var10.field3291.method8575(Statics.field2531);
            field590.method2741(var10);
        }
        Statics.field1010 = null;
        Statics.field2405 = null;
        Arrays.fill(field771, (Object) null);
        Statics.field3446 = null;
        Arrays.fill(field772, (Object) null);
        for (int var11 = 0; var11 < 8; var11++) {
            field628[var11] = new class387();
        }
        Statics.field2344 = null;
    }

    @ObfuscatedName("di.ho(II)V")
    public static void method2330(int arg0) {
        int var1 = class77.method781();
        if (arg0 == -3) {
            class77.method2776(class370.field4052, class370.field4174, class370.field4053);
        } else if (arg0 == -2) {
            class77.method2776(class370.field4155, class370.field4056, class370.field4057);
        } else if (arg0 == -1) {
            class77.method2776(class370.field4058, class370.field4036, class370.field4060);
        } else if (arg0 == 3) {
            class77.method3891(3);
            class77.field978 = 1;
        } else if (arg0 == 4) {
            class77.method3058(0);
        } else if (arg0 == 5) {
            class77.field978 = 2;
            class77.method2776(class370.field4064, class370.field4065, class370.field4066);
        } else if (arg0 == 68) {
            if (!field533) {
                field533 = true;
                method6345();
                return;
            }
            class77.method2776(class370.field4067, class370.field4285, class370.field4069);
        } else if (!field530 && arg0 == 6) {
            class77.method2776(class370.field4067, class370.field4285, class370.field4069);
        } else if (arg0 == 7) {
            class77.method2776(class370.field4046, class370.field4071, class370.field4276);
        } else if (arg0 == 8) {
            class77.method2776(class370.field4129, class370.field4074, class370.field4116);
        } else if (arg0 == 9) {
            class77.method2776(class370.field4076, class370.field4040, class370.field4078);
        } else if (arg0 == 10) {
            class77.method2776(class370.field4049, class370.field4084, class370.field4081);
        } else if (arg0 == 11) {
            class77.method2776(class370.field4180, class370.field4083, class370.field4257);
        } else if (arg0 == 12) {
            class77.method2776(class370.field4085, class370.field4086, class370.field4087);
        } else if (arg0 == 13) {
            class77.method2776(class370.field4088, class370.field4299, class370.field4090);
        } else if (arg0 == 14) {
            class77.method2776(class370.field4298, class370.field4148, class370.field4093);
        } else if (arg0 == 16) {
            class77.method2776(class370.field4068, class370.field4095, class370.field4096);
            class77.method3891(33);
        } else if (arg0 == 17) {
            class77.method2776(class370.field4196, class370.field4098, class370.field4099);
        } else if (arg0 == 18) {
            class77.method3058(1);
        } else if (arg0 == 19) {
            class77.method2776(class370.field4103, class370.field4222, class370.field4070);
        } else if (arg0 == 20) {
            class77.method2776(class370.field4106, class370.field4107, class370.field4108);
        } else if (arg0 == 22) {
            class77.method2776(class370.field4303, class370.field4110, class370.field4111);
        } else if (arg0 == 23) {
            class77.method2776(class370.field4151, class370.field4113, class370.field4114);
        } else if (arg0 == 24) {
            class77.method2776(class370.field4115, class370.field4271, class370.field4094);
        } else if (arg0 == 25) {
            class77.method2776(class370.field4118, class370.field4119, class370.field4120);
        } else if (arg0 == 26) {
            class77.method2776(class370.field4121, class370.field4122, class370.field4161);
        } else if (arg0 == 27) {
            class77.method2776(class370.field4007, class370.field4170, class370.field4126);
        } else if (arg0 == 31) {
            class77.method2776(class370.field4073, class370.field4134, class370.field4135);
        } else if (arg0 == 32) {
            class77.method3058(2);
        } else if (arg0 == 37) {
            class77.method2776(class370.field4016, class370.field4304, class370.field4141);
        } else if (arg0 == 38) {
            class77.method2776(class370.field4142, class370.field4143, class370.field4144);
        } else if (arg0 == 74) {
            class77.method2776(class370.field4145, class370.field4101, class370.field4147);
        } else if (arg0 == 55) {
            class77.method3891(8);
        } else if (arg0 == 56) {
            class77.method2776(class370.field4152, class370.field4104, class370.field4154);
            method2012(11);
            return;
        } else if (arg0 == 57) {
            class77.method2776(class370.field4079, class370.field4018, class370.field4097);
            method2012(11);
            return;
        } else if (arg0 == 61) {
            class77.method2776("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class77.method3891(7);
        } else if (arg0 == 62) {
            method2012(10);
            class77.method3891(9);
            class77.method2776(class370.field4158, class370.field4159, class370.field4160);
            return;
        } else if (arg0 == 63) {
            method2012(10);
            class77.method3891(9);
            class77.method2776(class370.field4112, class370.field4162, class370.field4163);
            return;
        } else if (arg0 == 65 || arg0 == 67) {
            method2012(10);
            class77.method3891(9);
            class77.method2776(class370.field4146, class370.field4165, class370.field4124);
            return;
        } else if (arg0 == 71) {
            method2012(10);
            class77.method3891(7);
            class77.method2776("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
        } else if (arg0 == 73) {
            method2012(10);
            class77.method3891(6);
            class77.method2776(class370.field4295, class370.field4296, class370.field4208);
        } else if (arg0 == 72) {
            method2012(10);
            class77.method3891(32);
        } else {
            class77.method2776(class370.field4167, class370.field4168, class370.field4184);
        }
        method2012(10);
        boolean var2 = var1 != class77.method781();
        if (!var2 && field564.method8869()) {
            class77.method3891(9);
        }
    }

    @ObfuscatedName("sl.hm(B)V")
    public static final void method7978() {
        field590.method2737();
        method2968();
        Statics.field1283.method5071();
        for (int var0 = 0; var0 < 4; var0++) {
            field600[var0].method4069();
        }
        field738.method4022();
        System.gc();
        class322.method3196(0, 0);
        class322.method1122();
        field781 = false;
        class71.method2248();
        method2012(10);
        class220.method3497().method3913();
        class220.method3497().method3914();
    }

    @ObfuscatedName("ab.hk(IS)V")
    public static final void method283(int arg0) {
        method7978();
        switch(arg0) {
            case 1:
                class77.method3891(24);
                class77.method2776(class370.field4017, class370.field4243, class370.field4244);
                break;
            case 2:
                class77.method2028();
        }
    }

    @ObfuscatedName("ea.hl(I)J")
    public static long method2627() {
        return field655;
    }

    @ObfuscatedName("fv.hn(B)V")
    public static final void method2968() {
        class184.field1928.method5418();
        class186.field1944.method5418();
        class175.method3152();
        class527.method3305();
        class525.method3194();
        class185.method4570();
        class206.method2961();
        class196.method160();
        class182.method4737();
        class202.method1059();
        class174.field1845.method5418();
        class181.method3771();
        class172.method5426();
        class204.method3065();
        class179.method415();
        class187.method2245();
        class190.method5724();
        class205.method3444();
        class200.field2076.method5418();
        class207.method6666();
        class195.field2036.method5418();
        class195.field2037.method5418();
        class201.field2082.method5418();
        class198.field2067.method5418();
        if (Statics.field1932 != null) {
            Statics.field1932.method8424();
        }
        if (Statics.field489 != null) {
            Statics.field489.method8424();
        }
        class191.method425();
        class193.field2023.method5418();
        class180.field1891.method5418();
        class178.field1865.method5418();
        class173.field1843.method5418();
        class176.field1852.method5418();
        class199.field2068.method5418();
        Statics.method3365();
        class197.field2059.method5418();
        field768.method5418();
        field524.method5418();
        class347.field3674.method5418();
        class347.field3675.method7452();
        class347.field3662 = 0;
        if (Statics.field1071 != null) {
            Statics.field1071.method5782();
        }
        if (class272.field2821.field3091 != null) {
            ((class282) class272.field2821.field3091).method5110();
        }
        class80.field1017.method5418();
        field822.method7452();
        if (Statics.field1725 != null) {
            Statics.field1725.method6433();
        }
        if (Statics.field557 != null) {
            Statics.field557.method6433();
        }
        if (Statics.field469 != null) {
            Statics.field469.method6433();
        }
        if (Statics.field2612 != null) {
            Statics.field2612.method6433();
        }
        if (Statics.field95 != null) {
            Statics.field95.method6433();
        }
        if (Statics.field1704 != null) {
            Statics.field1704.method6433();
        }
        if (Statics.field53 != null) {
            Statics.field53.method6433();
        }
        if (Statics.field122 != null) {
            Statics.field122.method6433();
        }
        if (Statics.field465 != null) {
            Statics.field465.method6433();
        }
        if (Statics.field240 != null) {
            Statics.field240.method6433();
        }
        if (Statics.field4388 != null) {
            Statics.field4388.method6433();
        }
        if (Statics.field2613 != null) {
            Statics.field2613.method6433();
        }
        if (Statics.field2337 != null) {
            Statics.field2337.method6433();
        }
        if (Statics.field2922 != null) {
            Statics.field2922.method6433();
        }
        if (Statics.field2071 != null) {
            Statics.field2071.method6433();
        }
        if (Statics.field1085 != null) {
            Statics.field1085.method6433();
        }
        if (Statics.field3275 != null) {
            Statics.field3275.method6433();
        }
        if (Statics.field1418 != null) {
            Statics.field1418.method6433();
        }
        if (Statics.field4484 != null) {
            Statics.field4484.method6433();
        }
        if (Statics.field3959 != null) {
            Statics.field3959.method6433();
        }
        if (Statics.field2046 != null) {
            Statics.field2046.method6433();
        }
        if (Statics.field1833 != null) {
            Statics.field1833.method6433();
        }
    }

    @ObfuscatedName("au.hr(I)V")
    public static final void method75() {
        class181.method7538();
    }

    @ObfuscatedName("ny.ha(B)V")
    public static final void method6305() {
        if (field591 > 0) {
            method7978();
        } else {
            field593.method7357();
            method2012(40);
            Statics.field3540 = field590.method2732();
            field590.method2739();
        }
    }

    @ObfuscatedName("da.hc(ZB)V")
    public static final void method2259(boolean arg0) {
        if (arg0) {
            field574 = class77.field967 ? class126.field1491 : class126.field1498;
        } else {
            field574 = Statics.field156.method2438(class77.field940) ? class126.field1496 : class126.field1499;
        }
    }

    @ObfuscatedName("client.hv(I)V")
    public final void method1389() {
        if (field653 > 1) {
            field653--;
        }
        if (field591 > 0) {
            field591--;
        }
        if (field592) {
            field592 = false;
            method6305();
            return;
        }
        if (!field675) {
            method4564();
        }
        for (int var1 = 0; var1 < 100 && this.method1209(field590); var1++) {
        }
        if (field532 != 30) {
            return;
        }
        while (class37.method2644()) {
            class313 var2 = class313.method5301(class311.field3246, field590.field1435);
            var2.field3291.method8574(0);
            int var3 = var2.field3291.field5200;
            class37.method6439(var2.field3291);
            var2.field3291.method8588(var2.field3291.field5200 - var3);
            field590.method2741(var2);
        }
        if (field593.field4666) {
            class313 var4 = class313.method5301(class311.field3229, field590.field1435);
            var4.field3291.method8574(0);
            int var5 = var4.field3291.field5200;
            field593.method7361(var4.field3291);
            var4.field3291.method8588(var4.field3291.field5200 - var5);
            field590.method2741(var4);
            field593.method7360();
        }
        Object var6 = Statics.field4662.field1109;
        synchronized (Statics.field4662.field1109) {
            if (!field714) {
                Statics.field4662.field1112 = 0;
            } else if (class36.field227 != 0 || Statics.field4662.field1112 >= 40) {
                class313 var7 = null;
                int var8 = 0;
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                for (int var12 = 0; var12 < Statics.field4662.field1112 && (var7 == null || var7.field3291.field5200 - var8 < 246); var12++) {
                    var9 = var12;
                    int var13 = Statics.field4662.field1108[var12];
                    if (var13 < -1) {
                        var13 = -1;
                    } else if (var13 > 65534) {
                        var13 = 65534;
                    }
                    int var14 = Statics.field4662.field1111[var12];
                    if (var14 < -1) {
                        var14 = -1;
                    } else if (var14 > 65534) {
                        var14 = 65534;
                    }
                    if (field558 != var14 || field698 != var13) {
                        if (var7 == null) {
                            var7 = class313.method5301(class311.field3230, field590.field1435);
                            var7.field3291.method8574(0);
                            var8 = var7.field3291.field5200;
                            var7.field3291.field5200 += 2;
                            var10 = 0;
                            var11 = 0;
                        }
                        int var15;
                        int var16;
                        int var17;
                        if (field540 == -1L) {
                            var15 = var14;
                            var16 = var13;
                            var17 = Integer.MAX_VALUE;
                        } else {
                            var15 = var14 - field558;
                            var16 = var13 - field698;
                            var17 = (int) ((Statics.field4662.field1113[var12] - field540) / 20L);
                            var10 = (int) ((Statics.field4662.field1113[var12] - field540) % 20L + (long) var10);
                        }
                        field558 = var14;
                        field698 = var13;
                        if (var17 < 8 && var15 >= -32 && var15 <= 31 && var16 >= -32 && var16 <= 31) {
                            var15 += 32;
                            var16 += 32;
                            var7.field3291.method8575((var15 << 6) + (var17 << 12) + var16);
                        } else if (var17 < 32 && var15 >= -128 && var15 <= 127 && var16 >= -128 && var16 <= 127) {
                            var15 += 128;
                            var16 += 128;
                            var7.field3291.method8574(var17 + 128);
                            var7.field3291.method8575((var15 << 8) + var16);
                        } else if (var17 < 32) {
                            var7.field3291.method8574(var17 + 192);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3291.method8577(Integer.MIN_VALUE);
                            } else {
                                var7.field3291.method8577(var14 | var13 << 16);
                            }
                        } else {
                            var7.field3291.method8575((var17 & 0x1FFF) + 57344);
                            if (var14 == -1 || var13 == -1) {
                                var7.field3291.method8577(Integer.MIN_VALUE);
                            } else {
                                var7.field3291.method8577(var14 | var13 << 16);
                            }
                        }
                        var11++;
                        field540 = Statics.field4662.field1113[var12];
                    }
                }
                if (var7 != null) {
                    var7.field3291.method8588(var7.field3291.field5200 - var8);
                    int var18 = var7.field3291.field5200;
                    var7.field3291.field5200 = var8;
                    var7.field3291.method8574(var10 / var11);
                    var7.field3291.method8574(var10 % var11);
                    var7.field3291.field5200 = var18;
                    field590.method2741(var7);
                }
                if (var9 >= Statics.field4662.field1112) {
                    Statics.field4662.field1112 = 0;
                } else {
                    Statics.field4662.field1112 -= var9;
                    System.arraycopy(Statics.field4662.field1111, var9, Statics.field4662.field1111, 0, Statics.field4662.field1112);
                    System.arraycopy(Statics.field4662.field1108, var9, Statics.field4662.field1108, 0, Statics.field4662.field1112);
                    System.arraycopy(Statics.field4662.field1113, var9, Statics.field4662.field1113, 0, Statics.field4662.field1112);
                }
            }
        }
        if (class36.field227 == 1 || !Statics.field5137 && class36.field227 == 4 || class36.field227 == 2) {
            long var20 = class36.field233 - field724;
            if (var20 > 32767L) {
                var20 = 32767L;
            }
            field724 = class36.field233;
            int var22 = class36.field238;
            if (var22 < 0) {
                var22 = 0;
            } else if (var22 > Statics.field2531) {
                var22 = Statics.field2531;
            }
            int var23 = class36.field225;
            if (var23 < 0) {
                var23 = 0;
            } else if (var23 > Statics.field199) {
                var23 = Statics.field199;
            }
            int var24 = (int) var20;
            class313 var25 = class313.method5301(class311.field3213, field590.field1435);
            var25.field3291.method8575((var24 << 1) + (class36.field227 == 2 ? 1 : 0));
            var25.field3291.method8575(var23);
            var25.field3291.method8575(var22);
            field590.method2741(var25);
        }
        if (field740 != 0) {
            class313 var26 = class313.method5301(class311.field3270, field590.field1435);
            var26.field3291.method8575(field740);
            field590.method2741(var26);
        }
        if (field793.field2432 > 0) {
            class313 var27 = class313.method5301(class311.field3175, field590.field1435);
            var27.field3291.method8575(0);
            int var28 = var27.field3291.field5200;
            long var29 = class318.method2218();
            for (int var31 = 0; var31 < field793.field2432; var31++) {
                long var32 = var29 - field584;
                if (var32 > 16777215L) {
                    var32 = 16777215L;
                }
                field584 = var29;
                var27.field3291.method8817((int) var32);
                var27.field3291.method8574(field793.field2424[var31]);
            }
            var27.field3291.method8690(var27.field3291.field5200 - var28);
            field590.method2741(var27);
        }
        if (field627 > 0) {
            field627--;
        }
        if (field793.method4065(96) || field793.method4065(97) || field793.method4065(98) || field793.method4065(99)) {
            field545 = true;
        }
        if (field545 && field627 <= 0) {
            field627 = 20;
            field545 = false;
            class313 var34 = class313.method5301(class311.field3183, field590.field1435);
            var34.field3291.method8666(field541);
            var34.field3291.method8626(field612);
            field590.method2741(var34);
        }
        if (Statics.field4621 && !field568) {
            field568 = true;
            class313 var35 = class313.method5301(class311.field3214, field590.field1435);
            var35.field3291.method8574(1);
            field590.method2741(var35);
        }
        if (!Statics.field4621 && field568) {
            field568 = false;
            class313 var36 = class313.method5301(class311.field3214, field590.field1435);
            var36.field3291.method8574(0);
            field590.method2741(var36);
        }
        if (Statics.field1053 != null) {
            Statics.field1053.method8059();
        }
        if (Statics.field104) {
            if (Statics.field1010 != null) {
                Statics.field1010.method7607();
            }
            for (int var37 = 0; var37 < class109.field1381; var37++) {
                class93 var38 = field652[class109.field1376[var37]];
                var38.method2280();
            }
            Statics.field104 = false;
        }
        if (Statics.field2666) {
            for (int var39 = 0; var39 < class109.field1381; var39++) {
                class93 var40 = field652[class109.field1376[var39]];
                var40.method2278();
            }
            Statics.field2666 = false;
        }
        if (Statics.field4873 != field773) {
            field773 = Statics.field4873;
            method1026(Statics.field4873);
        }
        if (field532 != 30) {
            return;
        }
        method1065();
        int var10002;
        for (int var41 = 0; var41 < field782; var41++) {
            var10002 = field785[var41]--;
            if (field785[var41] >= -10) {
                class40 var43 = field788[var41];
                if (var43 == null) {
                    class40 var10000 = (class40) null;
                    var43 = class40.method705(Statics.field4388, field767[var41], 0);
                    if (var43 == null) {
                        continue;
                    }
                    field785[var41] += var43.method706();
                    field788[var41] = var43;
                }
                if (field785[var41] < 0) {
                    int var52;
                    if (field786[var41] == 0) {
                        var52 = Statics.field156.method2505();
                    } else {
                        int var44 = (field786[var41] & 0xFF) * 128;
                        int var45 = field786[var41] >> 16 & 0xFF;
                        int var46 = Math.abs(var45 * 128 + 64 - Statics.field1858.field1208);
                        int var47 = field786[var41] >> 8 & 0xFF;
                        int var48 = Math.abs(var47 * 128 + 64 - Statics.field1858.field1253);
                        int var49 = Math.max(var46 + var48 - 128, 0);
                        int var50 = Math.max(((field555[var41] & 0x1F) - 1) * 128, 0);
                        if (var49 >= var44) {
                            field785[var41] = -100;
                            continue;
                        }
                        float var51 = var50 < var44 ? Math.min(Math.max((float) (var44 - var49) / (float) (var44 - var50), 0.0F), 1.0F) : 1.0F;
                        var52 = (int) (var51 * (float) Statics.field156.method2455());
                    }
                    if (var52 > 0) {
                        class41 var53 = var43.method710().method715(Statics.field920);
                        class49 var54 = class49.method818(var53, 100, var52);
                        var54.method900(field784[var41] - 1);
                        Statics.field3083.method699(var54);
                    }
                    field785[var41] = -100;
                }
            } else {
                field782--;
                for (int var42 = var41; var42 < field782; var42++) {
                    field767[var42] = field767[var42 + 1];
                    field788[var42] = field788[var42 + 1];
                    field784[var42] = field784[var42 + 1];
                    field785[var42] = field785[var42 + 1];
                    field786[var42] = field786[var42 + 1];
                    field555[var42] = field555[var42 + 1];
                }
                var41--;
            }
        }
        if (field781) {
            boolean var55;
            if (!class322.field3482.isEmpty()) {
                var55 = true;
            } else if (class322.field3475.isEmpty() || class322.field3475.get(0) == null || ((class334) class322.field3475.get(0)).field3595 == null) {
                var55 = false;
            } else {
                var55 = ((class334) class322.field3475.get(0)).field3595.method5551();
            }
            if (!var55) {
                if (Statics.field156.method2427() != 0 && class322.method3498()) {
                    class322.method1962(Statics.field2922, Statics.field156.method2427());
                }
                field781 = false;
            }
        }
        field590.field1433++;
        if (field590.field1433 > 750) {
            method6305();
            return;
        }
        method6300();
        method2084();
        int[] var56 = class109.field1376;
        for (int var57 = 0; var57 < class109.field1381; var57++) {
            class93 var58 = field652[var56[var57]];
            if (var58 != null && var58.field1230 > 0) {
                var58.field1230--;
                if (var58.field1230 == 0) {
                    var58.field1252 = null;
                }
            }
        }
        for (int var59 = 0; var59 < field572; var59++) {
            int var60 = field587[var59];
            class102 var61 = field629[var60];
            if (var61 != null && var61.field1230 > 0) {
                var61.field1230--;
                if (var61.field1230 == 0) {
                    var61.field1252 = null;
                }
            }
        }
        field605++;
        if (field648 != 0) {
            field750 += 20;
            if (field750 >= 400) {
                field648 = 0;
            }
        }
        class350 var62 = Statics.field1615;
        class350 var63 = Statics.field5063;
        Statics.field1615 = null;
        Statics.field5063 = null;
        field751 = null;
        field811 = false;
        field747 = false;
        field707 = 0;
        while (field793.method4043() && field707 < 128) {
            if (field676 >= 2 && field793.method4065(82) && field793.field2435 == 66) {
                StringBuilder var64 = new StringBuilder();
                Iterator var65 = class112.field1422.iterator();
                while (var65.hasNext()) {
                    class65 var66 = (class65) var65.next();
                    if (var66.field480 != null && !var66.field480.isEmpty()) {
                        var64.append(var66.field480).append(':');
                    }
                    var64.append(var66.field485).append('\n');
                }
                String var67 = var64.toString();
                Statics.field2033.method458(var67);
            } else if (field535 != 1 || field793.field2429 <= 0) {
                field769[field707] = field793.field2435;
                field661[field707] = field793.field2429;
                field707++;
            }
        }
        boolean var69 = field676 >= 2;
        if (var69 && field793.method4065(82) && field793.method4065(81) && field740 != 0) {
            int var70 = Statics.field1858.field1156 - field740;
            if (var70 < 0) {
                var70 = 0;
            } else if (var70 > 3) {
                var70 = 3;
            }
            if (Statics.field1858.field1156 != var70) {
                method2101(Statics.field1011 + Statics.field1858.field1235[0], Statics.field216 + Statics.field1858.field1278[0], var70, false);
            }
            field740 = 0;
        }
        if (field699 != -1) {
            method3089(field699, 0, 0, Statics.field199, Statics.field2531, 0, 0);
        }
        field726++;
        while (true) {
            class89 var71;
            class350 var72;
            class350 var73;
            do {
                var71 = (class89) field803.method6681();
                if (var71 == null) {
                    while (true) {
                        class89 var74;
                        class350 var75;
                        class350 var76;
                        do {
                            var74 = (class89) field534.method6681();
                            if (var74 == null) {
                                while (true) {
                                    class89 var77;
                                    class350 var78;
                                    class350 var79;
                                    do {
                                        var77 = (class89) field742.method6681();
                                        if (var77 == null) {
                                            boolean var80 = false;
                                            while (true) {
                                                class228 var81 = (class228) field745.method6681();
                                                if (var81 == null) {
                                                    if (!var80 && class36.field227 == 1) {
                                                        field738.method4022();
                                                    }
                                                    this.method1678();
                                                    if (Statics.field1053 != null) {
                                                        Statics.field1053.method8069(Statics.field4873, (Statics.field1858.field1208 >> 7) + Statics.field1011, (Statics.field1858.field1253 >> 7) + Statics.field216, false);
                                                        Statics.field1053.method8159();
                                                    }
                                                    if (field570 != null) {
                                                        this.method1466();
                                                    }
                                                    if (class276.method4964()) {
                                                        int var88 = class276.field2882;
                                                        int var89 = class276.field2886;
                                                        class313 var90 = class313.method5301(class311.field3257, field590.field1435);
                                                        var90.field3291.method8574(5);
                                                        var90.field3291.method8623(field793.method4065(82) ? (field793.method4065(81) ? 2 : 1) : 0);
                                                        var90.field3291.method8666(Statics.field1011 + var88);
                                                        var90.field3291.method8666(Statics.field216 + var89);
                                                        field590.method2741(var90);
                                                        class276.method4931();
                                                        field645 = class36.field225;
                                                        field646 = class36.field238;
                                                        field648 = 1;
                                                        field750 = 0;
                                                        field778 = var88;
                                                        field779 = var89;
                                                    }
                                                    if (Statics.field1615 != var62) {
                                                        if (var62 != null) {
                                                            method2816(var62);
                                                        }
                                                        if (Statics.field1615 != null) {
                                                            method2816(Statics.field1615);
                                                        }
                                                    }
                                                    if (Statics.field5063 != var63 && field691 == field690) {
                                                        if (var63 != null) {
                                                            method2816(var63);
                                                        }
                                                        if (Statics.field5063 != null) {
                                                            method2816(Statics.field5063);
                                                        }
                                                    }
                                                    if (Statics.field5063 == null) {
                                                        if (field690 > 0) {
                                                            field690--;
                                                        }
                                                    } else if (field690 < field691) {
                                                        field690++;
                                                        if (field691 == field690) {
                                                            method2816(Statics.field5063);
                                                        }
                                                    }
                                                    method5455();
                                                    if (field729) {
                                                        Statics.method52(Statics.field3962, Statics.field4356, Statics.field2915);
                                                        method2258(Statics.field2684, Statics.field4737);
                                                        if (Statics.field4756 == Statics.field3962 && Statics.field84 == Statics.field4356 && Statics.field3456 == Statics.field2915 && Statics.field861 == Statics.field2684 && Statics.field4737 == Statics.field1025) {
                                                            field729 = false;
                                                            field743 = false;
                                                            field790 = false;
                                                            field791 = false;
                                                            Statics.field2066 = 0;
                                                            Statics.field47 = 0;
                                                            Statics.field1046 = 0;
                                                            Statics.field1619 = 0;
                                                            Statics.field87 = 0;
                                                            Statics.field3979 = 0;
                                                            Statics.field5119 = 0;
                                                            Statics.field2530 = 0;
                                                            Statics.field1463 = 0;
                                                            Statics.field2610 = 0;
                                                            field814 = null;
                                                            field795 = null;
                                                            field794 = null;
                                                        }
                                                    } else if (field743) {
                                                        method3446();
                                                    }
                                                    for (int var91 = 0; var91 < 5; var91++) {
                                                        var10002 = field755[var91]++;
                                                    }
                                                    Statics.field470.method2670();
                                                    int var92 = ++class36.field223 - 1;
                                                    int var94 = class35.method7354();
                                                    if (var92 > 15000 && var94 > 15000) {
                                                        field591 = 250;
                                                        class36.method6384(14500);
                                                        class313 var95 = class313.method5301(class311.field3188, field590.field1435);
                                                        field590.method2741(var95);
                                                    }
                                                    Statics.field1091.method1777();
                                                    for (int var96 = 0; var96 < field827.size(); var96++) {
                                                        int var97 = (Integer) field827.get(var96);
                                                        class141 var98 = (class141) class207.field2254.method5414((long) var97);
                                                        class141 var99;
                                                        if (var98 == null) {
                                                            class141 var100 = Statics.method2326(Statics.field1618, Statics.field1627, var97, false);
                                                            if (var100 != null) {
                                                                class207.field2254.method5421(var100, (long) var97);
                                                            }
                                                            var99 = var100;
                                                        } else {
                                                            var99 = var98;
                                                        }
                                                        int var102;
                                                        if (var99 == null) {
                                                            var102 = 2;
                                                        } else {
                                                            var102 = var99.method3004() ? 0 : 1;
                                                        }
                                                        if (var102 != 2) {
                                                            field827.remove(var96);
                                                            var96--;
                                                        }
                                                    }
                                                    field590.field1434++;
                                                    if (field590.field1434 > 50) {
                                                        class313 var103 = class313.method5301(class311.field3226, field590.field1435);
                                                        field590.method2741(var103);
                                                    }
                                                    try {
                                                        field590.method2731();
                                                    } catch (IOException var105) {
                                                        method6305();
                                                    }
                                                    class220.method3497().method3916();
                                                    return;
                                                }
                                                if (var81.field2421.field3735 == 12) {
                                                    var80 = true;
                                                }
                                                if (var81 != null && var81.field2421 != null) {
                                                    if (var81.field2421.field3726 >= 0) {
                                                        class350 var82 = Statics.field1071.method5777(var81.field2421.field3772);
                                                        if (var82 == null || var82.field3863 == null || var82.field3863.length == 0 || var81.field2421.field3726 >= var82.field3863.length || var82.field3863[var81.field2421.field3726] != var81.field2421) {
                                                            continue;
                                                        }
                                                    }
                                                    if (var81.field2421.field3735 == 11 && var81.field2420 == 0) {
                                                        if (var81.field2421.method6234(var81.field2418, var81.field2419, 0, 0)) {
                                                            var81.field2421.method6165().method3828().method3910(1, var81.field2421.method6165().method3808());
                                                            switch(var81.field2421.method6161()) {
                                                                case 0:
                                                                    class32.method2989(var81.field2421.method6163(), true, false);
                                                                    break;
                                                                case 1:
                                                                    int var83 = method7342(var81.field2421);
                                                                    boolean var84 = (var83 >> 22 & 0x1) != 0;
                                                                    if (var84) {
                                                                        int[] var85 = var81.field2421.method6170();
                                                                        if (var85 != null) {
                                                                            class313 var86 = class313.method5301(class311.field3191, field590.field1435);
                                                                            var86.field3291.method8643(var81.field2421.field3725);
                                                                            var86.field3291.method8575(var81.field2421.field3726);
                                                                            var86.field3291.method8577(var85[0]);
                                                                            var86.field3291.method8577(var85[1]);
                                                                            var86.field3291.method8795(var81.field2421.method6162());
                                                                            var86.field3291.method8646(var85[2]);
                                                                            field590.method2741(var86);
                                                                        }
                                                                    }
                                                            }
                                                        }
                                                    } else if (var81.field2421.field3735 == 12) {
                                                        class348 var87 = var81.field2421.method6152();
                                                        if (var87 != null && var87.method5904()) {
                                                            switch(var81.field2420) {
                                                                case 0:
                                                                    field738.method4026(var81.field2421);
                                                                    var87.method6068(true);
                                                                    var87.method5891(var81.field2418, var81.field2419, field793.method4065(82), field793.method4065(81));
                                                                    break;
                                                                case 1:
                                                                    var87.method5892(var81.field2418, var81.field2419);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        var78 = var77.field1095;
                                        if (var78.field3726 < 0) {
                                            break;
                                        }
                                        var79 = Statics.field1071.method5777(var78.field3772);
                                    } while (var79 == null || var79.field3863 == null || var78.field3726 >= var79.field3863.length || var79.field3863[var78.field3726] != var78);
                                    class72.method3238(var77);
                                }
                            }
                            var75 = var74.field1095;
                            if (var75.field3726 < 0) {
                                break;
                            }
                            var76 = Statics.field1071.method5777(var75.field3772);
                        } while (var76 == null || var76.field3863 == null || var75.field3726 >= var76.field3863.length || var76.field3863[var75.field3726] != var75);
                        class72.method3238(var74);
                    }
                }
                var72 = var71.field1095;
                if (var72.field3726 < 0) {
                    break;
                }
                var73 = Statics.field1071.method5777(var72.field3772);
            } while (var73 == null || var73.field3863 == null || var72.field3726 >= var73.field3863.length || var73.field3863[var72.field3726] != var72);
            class72.method3238(var71);
        }
    }

    @ObfuscatedName("hm.hp(I)V")
    public static final void method3445() {
        if (Statics.field1497 != null) {
            Statics.field1497.method742();
        }
    }

    @ObfuscatedName("cp.hh(Lhs;IIILdz;I)V")
    public static void method2022(class207 arg0, int arg1, int arg2, int arg3, class97 arg4) {
        if (field782 < 50 && arg0.field2258 != null && arg1 < arg0.field2258.length && arg0.field2258[arg1] != null) {
            int var5 = arg0.field2258[arg1].field2110 & 0x1F;
            if ((var5 <= 0 || Statics.field156.method2455() != 0) && (var5 != 0 || Statics.field156.method2505() != 0)) {
                method2339(arg0.field2258[arg1], arg2, arg3, Statics.field1858 == arg4);
            }
        }
    }

    @ObfuscatedName("me.hi(Lhs;IIILdz;B)V")
    public static void method5746(class207 arg0, int arg1, int arg2, int arg3, class97 arg4) {
        if (field782 >= 50 || arg0.field2256 == null || !arg0.field2256.containsKey(arg1)) {
            return;
        }
        class203 var5 = (class203) arg0.field2256.get(arg1);
        if (var5 != null) {
            int var6 = var5.field2110 & 0x1F;
            if ((var6 <= 0 || Statics.field156.method2455() != 0) && (var6 != 0 || Statics.field156.method2505() != 0)) {
                method2339(var5, arg2, arg3, Statics.field1858 == arg4);
            }
        }
    }

    @ObfuscatedName("ds.hy(Lhy;IIZS)V")
    public static void method2339(class203 arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (arg0.field2110 == 0) {
            if (!arg3) {
                return;
            }
            field786[field782] = 0;
        } else {
            int var4 = (arg1 - 64) / 128;
            int var5 = (arg2 - 64) / 128;
            field786[field782] = arg0.field2110 + (var4 << 16) + (var5 << 8);
        }
        field767[field782] = arg0.field2108;
        field784[field782] = arg0.field2109;
        field785[field782] = 0;
        field788[field782] = null;
        field555[field782] = arg0.field2114;
        field782++;
    }

    @ObfuscatedName("fj.he(IIIB)V")
    public static void method2973(int arg0, int arg1, int arg2) {
        if (Statics.field156.method2505() == 0 || arg1 == 0 || field782 >= 50) {
            return;
        }
        field767[field782] = arg0;
        field784[field782] = arg1;
        field785[field782] = arg2;
        field788[field782] = null;
        field786[field782] = 0;
        field555[field782] = 0;
        field782++;
    }

    @ObfuscatedName("no.hb(II)V")
    public static void method6299(int arg0) {
        if (arg0 == -1 && !field781) {
            class322.method3196(0, 0);
        } else if (arg0 != -1 && !class322.method4483(arg0) && Statics.field156.method2427() != 0) {
            ArrayList var1 = new ArrayList();
            var1.add(new class334(Statics.field2922, arg0, 0, Statics.field156.method2427(), false));
            if (field781) {
                class322.method2969(var1, 0, 100, 100, 0);
            } else {
                class322.method2753(var1, 0, 100, 100, 0, false);
            }
        }
    }

    @ObfuscatedName("fq.hf(Ljava/util/ArrayList;IIIIB)V")
    public static void method2985(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.isEmpty()) {
            return;
        }
        int var5 = (Integer) arg0.get(0);
        if (var5 == -1 && !field781) {
            class322.method3196(0, 0);
        } else if (var5 != -1 && !class322.method4483(var5) && Statics.field156.method2427() != 0) {
            ArrayList var6 = new ArrayList();
            for (int var7 = 0; var7 < arg0.size(); var7++) {
                var6.add(new class334(Statics.field2922, (Integer) arg0.get(var7), 0, Statics.field156.method2427(), false));
            }
            if (field781) {
                class322.method2969(var6, arg1, arg2, arg3, arg4);
            } else {
                class322.method2753(var6, arg1, arg2, arg3, arg4, false);
            }
        }
    }

    @ObfuscatedName("az.hs(III)V")
    public static void method38(int arg0, int arg1) {
        if (Statics.field156.method2427() != 0 && arg0 != -1) {
            ArrayList var2 = new ArrayList();
            var2.add(new class334(Statics.field2613, arg0, 0, Statics.field156.method2427(), false));
            class322.method2753(var2, 0, 0, 0, 0, true);
            field781 = true;
        }
    }

    @ObfuscatedName("client.hz(IIB)V")
    public void method1275(int arg0, int arg1) {
        if (field590 != null && field590.field1435 != null && arg0 > -1 && Statics.field156.method2427() > 0 && !field781) {
            class313 var3 = class313.method5301(class311.field3196, field590.field1435);
            var3.field3291.method8577(arg0);
            field590.method2741(var3);
        }
    }

    @ObfuscatedName("oj.is(Lng;III)V")
    public static final void method6595(class350 arg0, int arg1, int arg2) {
        if (field780 != 0 && field780 != 3 || field675 || !(class36.field227 == 1 || !Statics.field5137 && class36.field227 == 4)) {
            return;
        }
        class337 var3 = arg0.method6147(Statics.field1071, true);
        if (var3 == null) {
            return;
        }
        int var4 = class36.field225 - arg1;
        int var5 = class36.field238 - arg2;
        if (!var3.method5749(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field3615 / 2;
        int var7 = var5 - var3.field3612 / 2;
        int var8 = field541 & 0x7FF;
        int var9 = class272.field2819[var8];
        int var10 = class272.field2820[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field1858.field1208 + var11 >> 7;
        int var14 = Statics.field1858.field1253 - var12 >> 7;
        class313 var15 = class313.method5301(class311.field3177, field590.field1435);
        var15.field3291.method8574(18);
        var15.field3291.method8623(field793.method4065(82) ? (field793.method4065(81) ? 2 : 1) : 0);
        var15.field3291.method8666(Statics.field1011 + var13);
        var15.field3291.method8666(Statics.field216 + var14);
        var15.field3291.method8574(var6);
        var15.field3291.method8574(var7);
        var15.field3291.method8575(field541);
        var15.field3291.method8574(57);
        var15.field3291.method8574(0);
        var15.field3291.method8574(0);
        var15.field3291.method8574(89);
        var15.field3291.method8575(Statics.field1858.field1208);
        var15.field3291.method8575(Statics.field1858.field1253);
        var15.field3291.method8574(63);
        field590.method2741(var15);
        field778 = var13;
        field779 = var14;
    }

    @ObfuscatedName("dx.if(Ljava/lang/String;I)V")
    public static final void method2553(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field156.method2413(!Statics.field156.method2518());
            if (Statics.field156.method2518()) {
                class112.method3792(99, "", "Roofs are now all hidden");
            } else {
                class112.method3792(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.startsWith("zbuf")) {
            boolean var1 = class406.method2922(arg0.substring(5).trim()) == 1;
            Statics.field2033.method466(var1);
            class272.method4747(var1);
        }
        if (arg0.equalsIgnoreCase("z")) {
            field586 = !field586;
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            Statics.field156.method2514();
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field657 = !field657;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field687 = !field687;
        }
        if (field676 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field1053.field5044 = !Statics.field1053.field5044;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                Statics.field156.method2446(true);
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                Statics.field156.method2446(false);
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method6305();
            }
        }
        class313 var2 = class313.method5301(class311.field3181, field590.field1435);
        var2.field3291.method8574(arg0.length() + 1);
        var2.field3291.method8581(arg0);
        field590.method2741(var2);
    }

    @ObfuscatedName("hm.il(II)I")
    public static final int method3439(int arg0) {
        return Math.min(Math.max(arg0, 128), 383);
    }

    @ObfuscatedName("gq.iy(II)I")
    public static final int method3220(int arg0) {
        return Math.abs(arg0 - Statics.field1025) > 1024 ? 2048 * (arg0 < Statics.field1025 ? 1 : -1) + arg0 : arg0;
    }

    @ObfuscatedName("da.ib(III)V")
    public static final void method2258(int arg0, int arg1) {
        if (arg0 < 128) {
            arg0 = 128;
        } else if (arg0 > 383) {
            arg0 = 383;
        }
        if (Statics.field861 < arg0) {
            Statics.field861 += Statics.field87 * (arg0 - Statics.field861) / 1000 + Statics.field1619;
            if (Statics.field861 > arg0) {
                Statics.field861 = arg0;
            }
        } else if (Statics.field861 > arg0) {
            Statics.field861 -= Statics.field87 * (Statics.field861 - arg0) / 1000 + Statics.field1619;
            if (Statics.field861 < arg0) {
                Statics.field861 = arg0;
            }
        }
        int var2 = arg1 & 0x7FF;
        int var3 = var2 - Statics.field1025;
        if (var3 > 1024) {
            var3 -= 2048;
        } else if (var3 < -1024) {
            var3 += 2048;
        }
        if (var3 > 0) {
            Statics.field1025 += Statics.field87 * var3 / 1000 + Statics.field1619;
            Statics.field1025 &= 0x7FF;
        } else if (var3 < 0) {
            Statics.field1025 -= Statics.field87 * -var3 / 1000 + Statics.field1619;
            Statics.field1025 &= 0x7FF;
        }
        int var4 = var2 - Statics.field1025;
        if (var4 > 1024) {
            var4 -= 2048;
        } else if (var4 < -1024) {
            var4 += 2048;
        }
        if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
            Statics.field1025 = var2;
        }
    }

    @ObfuscatedName("hl.ik(I)V")
    public static final void method3446() {
        if (!field790) {
            int var0 = Statics.field2530 * 128 + 64;
            int var1 = Statics.field1463 * 128 + 64;
            int var2 = method4842(var0, var1, Statics.field4873) - Statics.field2610;
            Statics.method52(var0, var2, var1);
        } else if (field814 != null) {
            Statics.field4756 = field814.method8021();
            Statics.field3456 = field814.method8022();
            if (field615) {
                Statics.field84 = field814.method8024();
            } else {
                Statics.field84 = method4842(Statics.field4756, Statics.field3456, Statics.field4873) - field814.method8024();
            }
            field814.method8040();
        }
        if (field791) {
            if (field795 != null) {
                Statics.field861 = field795.method8030();
                Statics.field861 = Math.min(Math.max(Statics.field861, 128), 383);
                field795.method8040();
            }
            if (field794 != null) {
                Statics.field1025 = field794.method8030() & 0x7FF;
                field794.method8040();
            }
            return;
        }
        int var3 = Statics.field2066 * 128 + 64;
        int var4 = Statics.field47 * 128 + 64;
        int var5 = method4842(var3, var4, Statics.field4873) - Statics.field1046;
        int var6 = var3 - Statics.field4756;
        int var7 = var5 - Statics.field84;
        int var8 = var4 - Statics.field3456;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.9490051269531D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.9490051269531D) & 0x7FF;
        method2258(var10, var11);
    }

    @ObfuscatedName("mr.ij(I)V")
    public static final void method5455() {
        if (field535 == 0) {
            int var0 = Statics.field1858.field1208;
            int var1 = Statics.field1858.field1253;
            if (Statics.field4747 - var0 < -500 || Statics.field4747 - var0 > 500 || Statics.field429 - var1 < -500 || Statics.field429 - var1 > 500) {
                Statics.field4747 = var0;
                Statics.field429 = var1;
            }
            if (Statics.field4747 != var0) {
                Statics.field4747 += (var0 - Statics.field4747) / 16;
            }
            if (Statics.field429 != var1) {
                Statics.field429 += (var1 - Statics.field429) / 16;
            }
            int var2 = Statics.field4747 >> 7;
            int var3 = Statics.field429 >> 7;
            int var4 = method4842(Statics.field4747, Statics.field429, Statics.field4873);
            int var5 = 0;
            if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                        int var8 = Statics.field4873;
                        if (var8 < 3 && (class83.field1048[1][var6][var7] & 0x2) == 2) {
                            var8++;
                        }
                        int var9 = var4 - class83.field1049[var8][var6][var7];
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
            if (var10 > field796) {
                field796 += (var10 - field796) / 24;
            } else if (var10 < field796) {
                field796 += (var10 - field796) / 80;
            }
            Statics.field4450 = method4842(Statics.field1858.field1208, Statics.field1858.field1253, Statics.field4873) - field604;
        } else if (field535 == 1) {
            method8439();
            short var11 = -1;
            if (field793.method4065(33)) {
                var11 = 0;
            } else if (field793.method4065(49)) {
                var11 = 1024;
            }
            if (field793.method4065(48)) {
                if (var11 == 0) {
                    var11 = 1792;
                } else if (var11 == 1024) {
                    var11 = 1280;
                } else {
                    var11 = 1536;
                }
            } else if (field793.method4065(50)) {
                if (var11 == 0) {
                    var11 = 256;
                } else if (var11 == 1024) {
                    var11 = 768;
                } else {
                    var11 = 512;
                }
            }
            byte var12 = 0;
            if (field793.method4065(35)) {
                var12 = -1;
            } else if (field793.method4065(51)) {
                var12 = 1;
            }
            int var13 = 0;
            if (var11 >= 0 || var12 != 0) {
                int var14 = field793.method4065(81) ? field829 : field623;
                var13 = var14 * 16;
                field621 = var11;
                field578 = var12;
            }
            if (field620 < var13) {
                field620 += var13 / 8;
                if (field620 > var13) {
                    field620 = var13;
                }
            } else if (field620 > var13) {
                field620 = field620 * 9 / 10;
            }
            if (field620 > 0) {
                int var15 = field620 / 16;
                if (field621 >= 0) {
                    int var16 = field621 - Statics.field1025 & 0x7FF;
                    int var17 = class272.field2819[var16];
                    int var18 = class272.field2820[var16];
                    Statics.field4747 += var15 * var17 / 65536;
                    Statics.field429 += var15 * var18 / 65536;
                }
                if (field578 != 0) {
                    Statics.field4450 += field578 * var15;
                    if (Statics.field4450 > 0) {
                        Statics.field4450 = 0;
                    }
                }
            } else {
                field621 = -1;
                field578 = -1;
            }
            if (field793.method4065(13)) {
                field590.method2741(class313.method5301(class311.field3195, field590.field1435));
                field535 = 0;
            }
        }
        if (class36.field228 == 4 && Statics.field5137) {
            int var19 = class36.field230 - field617;
            field633 = var19 * 2;
            field617 = var19 == -1 || var19 == 1 ? class36.field230 : (field617 + class36.field230) / 2;
            int var20 = field616 - class36.field229;
            field820 = var20 * 2;
            field616 = var20 == -1 || var20 == 1 ? class36.field229 : (field616 + class36.field229) / 2;
        } else {
            if (field793.method4065(96)) {
                field820 += (-24 - field820) / 2;
            } else if (field793.method4065(97)) {
                field820 += (24 - field820) / 2;
            } else {
                field820 /= 2;
            }
            if (field793.method4065(98)) {
                field633 += (12 - field633) / 2;
            } else if (field793.method4065(99)) {
                field633 += (-12 - field633) / 2;
            } else {
                field633 /= 2;
            }
            field617 = class36.field230;
            field616 = class36.field229;
        }
        field541 = field820 / 2 + field541 & 0x7FF;
        field612 += field633 / 2;
        if (field612 < 128) {
            field612 = 128;
        }
        if (field612 > 383) {
            field612 = 383;
        }
    }

    @ObfuscatedName("no.iv(I)V")
    public static final void method6300() {
        int var0 = class109.field1381;
        int[] var1 = class109.field1376;
        for (int var2 = 0; var2 < var0; var2++) {
            class93 var3 = field652[var1[var2]];
            if (var3 != null) {
                method2261(var3, 1);
            }
        }
    }

    @ObfuscatedName("cf.io(I)V")
    public static final void method2084() {
        for (int var0 = 0; var0 < field572; var0++) {
            int var1 = field587[var0];
            class102 var2 = field629[var1];
            if (var2 != null) {
                method2261(var2, var2.field1331.field1986);
            }
        }
    }

    @ObfuscatedName("da.ix(Ldz;IS)V")
    public static final void method2261(class97 arg0, int arg1) {
        if (arg0.field1262 >= field536) {
            method814(arg0);
        } else if (arg0.field1272 >= field536) {
            boolean var2 = field536 == arg0.field1272 || arg0.field1251 == -1 || arg0.field1254 != 0;
            if (!var2) {
                class207 var3 = class207.method3902(arg0.field1251);
                if (var3 == null || var3.method3731()) {
                    var2 = true;
                } else {
                    var2 = arg0.field1211 + 1 > var3.field2257[arg0.field1231];
                }
            }
            if (var2) {
                int var4 = arg0.field1272 - arg0.field1262;
                int var5 = field536 - arg0.field1262;
                int var6 = arg0.field1258 * 128 + arg0.field1213 * 64;
                int var7 = arg0.field1260 * 128 + arg0.field1213 * 64;
                int var8 = arg0.field1259 * 128 + arg0.field1213 * 64;
                int var9 = arg0.field1249 * 128 + arg0.field1213 * 64;
                arg0.field1208 = ((var4 - var5) * var6 + var5 * var8) / var4;
                arg0.field1253 = ((var4 - var5) * var7 + var5 * var9) / var4;
            }
            arg0.field1280 = 0;
            arg0.field1273 = arg0.field1224;
            arg0.field1275 = arg0.field1273;
        } else {
            method4212(arg0);
        }
        if (arg0.field1208 < 128 || arg0.field1253 < 128 || arg0.field1208 >= 13184 || arg0.field1253 >= 13184) {
            arg0.field1251 = -1;
            arg0.field1262 = 0;
            arg0.field1272 = 0;
            arg0.method2354();
            arg0.field1208 = arg0.field1235[0] * 128 + arg0.field1213 * 64;
            arg0.field1253 = arg0.field1278[0] * 128 + arg0.field1213 * 64;
            arg0.method2348();
        }
        if (Statics.field1858 == arg0 && (arg0.field1208 < 1536 || arg0.field1253 < 1536 || arg0.field1208 >= 11776 || arg0.field1253 >= 11776)) {
            arg0.field1251 = -1;
            arg0.field1262 = 0;
            arg0.field1272 = 0;
            arg0.method2354();
            arg0.field1208 = arg0.field1235[0] * 128 + arg0.field1213 * 64;
            arg0.field1253 = arg0.field1278[0] * 128 + arg0.field1213 * 64;
            arg0.method2348();
        }
        if (arg0.field1241 != -1) {
            Object var10 = null;
            int var11 = 65536;
            class97 var12;
            if (arg0.field1241 < var11) {
                var12 = field629[arg0.field1241];
            } else {
                var12 = field652[arg0.field1241 - var11];
            }
            if (var12 != null) {
                int var13 = arg0.field1208 - var12.field1208;
                int var14 = arg0.field1253 - var12.field1253;
                if (var13 != 0 || var14 != 0) {
                    arg0.field1273 = class467.method5446(var13, var14);
                }
            } else if (arg0.field1242) {
                arg0.field1241 = -1;
                arg0.field1242 = false;
            }
        }
        if (arg0.field1276 == 0 || arg0.field1280 > 0) {
            int var15 = -1;
            if (arg0.field1244 != -1 && arg0.field1245 != -1) {
                int var16 = arg0.field1244 * 128 - Statics.field1011 * 128 + 64;
                int var17 = arg0.field1245 * 128 - Statics.field216 * 128 + 64;
                int var18 = arg0.field1208 - var16;
                int var19 = arg0.field1253 - var17;
                if (var18 != 0 || var19 != 0) {
                    var15 = class467.method5446(var18, var19);
                }
            } else if (arg0.field1243 != -1) {
                var15 = arg0.field1243;
            }
            if (var15 != -1) {
                arg0.field1273 = var15;
                if (arg0.field1246) {
                    arg0.field1275 = arg0.field1273;
                }
            }
            arg0.method2356();
        }
        int var20 = arg0.field1273 - arg0.field1275 & 0x7FF;
        if (var20 == 0) {
            if (arg0.field1242) {
                arg0.field1241 = -1;
                arg0.field1242 = false;
            }
            arg0.field1228 = 0;
        } else {
            boolean var21 = true;
            boolean var22 = true;
            arg0.field1228++;
            int var23 = var20 > 1024 ? -1 : 1;
            arg0.field1275 += arg0.field1250 * var23;
            boolean var24 = true;
            if (var20 < arg0.field1250 || var20 > 2048 - arg0.field1250) {
                arg0.field1275 = arg0.field1273;
                var24 = false;
            }
            if (arg0.field1250 > 0 && arg0.field1247 == arg0.field1212 && (arg0.field1228 > 25 || var24)) {
                if (var23 == -1 && arg0.field1267 != -1) {
                    arg0.field1247 = arg0.field1267;
                } else if (var23 == 1 && arg0.field1214 != -1) {
                    arg0.field1247 = arg0.field1214;
                } else {
                    arg0.field1247 = arg0.field1215;
                }
            }
            arg0.field1275 &= 0x7FF;
        }
        method7439(arg0);
    }

    @ObfuscatedName("bh.im(Ldz;I)V")
    public static final void method814(class97 arg0) {
        int var1 = Math.max(1, arg0.field1262 - field536);
        int var2 = arg0.field1258 * 128 + arg0.field1213 * 64;
        int var3 = arg0.field1260 * 128 + arg0.field1213 * 64;
        arg0.field1208 += (var2 - arg0.field1208) / var1;
        arg0.field1253 += (var3 - arg0.field1253) / var1;
        arg0.field1280 = 0;
        arg0.field1273 = arg0.field1224;
    }

    @ObfuscatedName("jh.ii(Ldz;I)V")
    public static final void method4212(class97 arg0) {
        arg0.field1247 = arg0.field1212;
        if (arg0.field1276 == 0) {
            arg0.field1280 = 0;
            return;
        }
        if (arg0.field1251 != -1 && arg0.field1254 == 0) {
            class207 var1 = class207.method3902(arg0.field1251);
            if (arg0.field1281 > 0 && var1.field2272 == 0) {
                arg0.field1280++;
                return;
            }
            if (arg0.field1281 <= 0 && var1.field2274 == 0) {
                arg0.field1280++;
                return;
            }
        }
        int var2 = arg0.field1208;
        int var3 = arg0.field1253;
        int var4 = arg0.field1235[arg0.field1276 - 1] * 128 + arg0.field1213 * 64;
        int var5 = arg0.field1278[arg0.field1276 - 1] * 128 + arg0.field1213 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1273 = 1280;
            } else if (var3 > var5) {
                arg0.field1273 = 1792;
            } else {
                arg0.field1273 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1273 = 768;
            } else if (var3 > var5) {
                arg0.field1273 = 256;
            } else {
                arg0.field1273 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1273 = 1024;
        } else if (var3 > var5) {
            arg0.field1273 = 0;
        }
        class234 var6 = arg0.field1274[arg0.field1276 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1208 = var4;
            arg0.field1253 = var5;
            arg0.field1276--;
            if (arg0.field1281 > 0) {
                arg0.field1281--;
            }
            return;
        }
        int var7 = arg0.field1273 - arg0.field1275 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1216;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1215;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1218;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1282;
        }
        if (var8 == -1) {
            var8 = arg0.field1215;
        }
        arg0.field1247 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class102) {
            var10 = ((class102) arg0).field1331.field2005;
        }
        if (var10) {
            if (arg0.field1275 != arg0.field1273 && arg0.field1241 == -1 && arg0.field1250 != 0) {
                var9 = 2;
            }
            if (arg0.field1276 > 2) {
                var9 = 6;
            }
            if (arg0.field1276 > 3) {
                var9 = 8;
            }
            if (arg0.field1280 > 0 && arg0.field1276 > 1) {
                var9 = 8;
                arg0.field1280--;
            }
        } else {
            if (arg0.field1276 > 1) {
                var9 = 6;
            }
            if (arg0.field1276 > 2) {
                var9 = 8;
            }
            if (arg0.field1280 > 0 && arg0.field1276 > 1) {
                var9 = 8;
                arg0.field1280--;
            }
        }
        if (class234.field2473 == var6) {
            var9 <<= 0x1;
        } else if (class234.field2470 == var6) {
            var9 >>= 0x1;
        }
        if (var9 >= 8) {
            if (arg0.field1247 == arg0.field1215 && arg0.field1219 != -1) {
                arg0.field1247 = arg0.field1219;
            } else if (arg0.field1247 == arg0.field1216 && arg0.field1220 != -1) {
                arg0.field1247 = arg0.field1220;
            } else if (arg0.field1282 == arg0.field1247 && arg0.field1221 != -1) {
                arg0.field1247 = arg0.field1221;
            } else if (arg0.field1247 == arg0.field1218 && arg0.field1222 != -1) {
                arg0.field1247 = arg0.field1222;
            }
        } else if (var9 <= 2) {
            if (arg0.field1247 == arg0.field1215 && arg0.field1223 != -1) {
                arg0.field1247 = arg0.field1223;
            } else if (arg0.field1247 == arg0.field1216 && arg0.field1217 != -1) {
                arg0.field1247 = arg0.field1217;
            } else if (arg0.field1282 == arg0.field1247 && arg0.field1225 != -1) {
                arg0.field1247 = arg0.field1225;
            } else if (arg0.field1247 == arg0.field1218 && arg0.field1226 != -1) {
                arg0.field1247 = arg0.field1226;
            }
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1208 += var9;
                if (arg0.field1208 > var4) {
                    arg0.field1208 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1208 -= var9;
                if (arg0.field1208 < var4) {
                    arg0.field1208 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1253 += var9;
                if (arg0.field1253 > var5) {
                    arg0.field1253 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1253 -= var9;
                if (arg0.field1253 < var5) {
                    arg0.field1253 = var5;
                }
            }
        }
        if (arg0.field1208 == var4 && arg0.field1253 == var5) {
            arg0.field1276--;
            if (arg0.field1281 > 0) {
                arg0.field1281--;
            }
        }
    }

    @ObfuscatedName("qo.it(Ldz;I)V")
    public static final void method7439(class97 arg0) {
        arg0.field1236 = false;
        if (arg0.field1247 != -1) {
            class207 var1 = class207.method3902(arg0.field1247);
            if (var1 == null) {
                arg0.field1247 = -1;
            } else if (!var1.method3731() && var1.field2259 != null) {
                arg0.field1268++;
                if (arg0.field1248 < var1.field2259.length && arg0.field1268 > var1.field2257[arg0.field1248]) {
                    arg0.field1268 = 1;
                    arg0.field1248++;
                    method2022(var1, arg0.field1248, arg0.field1208, arg0.field1253, arg0);
                }
                if (arg0.field1248 >= var1.field2259.length) {
                    if (var1.field2247 > 0) {
                        arg0.field1248 -= var1.field2247;
                        if (var1.field2271) {
                            arg0.field1233++;
                        }
                        if (arg0.field1248 < 0 || arg0.field1248 >= var1.field2259.length || var1.field2271 && arg0.field1233 >= var1.field2270) {
                            arg0.field1268 = 0;
                            arg0.field1248 = 0;
                            arg0.field1233 = 0;
                        }
                    } else {
                        arg0.field1268 = 0;
                        arg0.field1248 = 0;
                    }
                    method2022(var1, arg0.field1248, arg0.field1208, arg0.field1253, arg0);
                }
            } else if (var1.method3731()) {
                arg0.field1248++;
                int var2 = var1.method3732();
                if (arg0.field1248 < var2) {
                    method5746(var1, arg0.field1248, arg0.field1208, arg0.field1253, arg0);
                } else {
                    if (var1.field2247 > 0) {
                        arg0.field1248 -= var1.field2247;
                        if (var1.field2271) {
                            arg0.field1233++;
                        }
                        if (arg0.field1248 < 0 || arg0.field1248 >= var2 || var1.field2271 && arg0.field1233 >= var1.field2270) {
                            arg0.field1248 = 0;
                            arg0.field1268 = 0;
                            arg0.field1233 = 0;
                        }
                    } else {
                        arg0.field1268 = 0;
                        arg0.field1248 = 0;
                    }
                    method5746(var1, arg0.field1248, arg0.field1208, arg0.field1253, arg0);
                }
            } else {
                arg0.field1247 = -1;
            }
        }
        class506 var3 = new class506(arg0.method2360());
        for (class556 var4 = (class556) var3.method8285(); var4 != null; var4 = (class556) var3.next()) {
            if (var4.field5353 != -1 && field536 >= var4.field5352) {
                int var5 = Statics.method3501(var4.field5353).field2040;
                if (var5 == -1) {
                    var4.method7996();
                    arg0.field1257--;
                } else {
                    var4.field5350 = Math.max(var4.field5350, 0);
                    class207 var6 = class207.method3902(var5);
                    if (var6.field2259 != null && !var6.method3731()) {
                        var4.field5351++;
                        if (var4.field5350 < var6.field2259.length && var4.field5351 > var6.field2257[var4.field5350]) {
                            var4.field5351 = 1;
                            var4.field5350++;
                            method2022(var6, var4.field5350, arg0.field1208, arg0.field1253, arg0);
                        }
                        if (var4.field5350 >= var6.field2259.length) {
                            var4.method7996();
                            arg0.field1257--;
                        }
                    } else if (var6.method3731()) {
                        var4.field5350++;
                        int var7 = var6.method3732();
                        if (var4.field5350 < var7) {
                            method5746(var6, var4.field5350, arg0.field1208, arg0.field1253, arg0);
                        } else {
                            var4.method7996();
                            arg0.field1257--;
                        }
                    } else {
                        var4.method7996();
                        arg0.field1257--;
                    }
                }
            }
        }
        if (arg0.field1251 != -1 && arg0.field1254 <= 1) {
            class207 var8 = class207.method3902(arg0.field1251);
            if (var8.field2272 == 1 && arg0.field1281 > 0 && arg0.field1262 <= field536 && arg0.field1272 < field536) {
                arg0.field1254 = 1;
                return;
            }
        }
        if (arg0.field1251 != -1 && arg0.field1254 == 0) {
            class207 var9 = class207.method3902(arg0.field1251);
            if (var9 == null) {
                arg0.field1251 = -1;
            } else if (!var9.method3731() && var9.field2259 != null) {
                arg0.field1211++;
                if (arg0.field1231 < var9.field2259.length && arg0.field1211 > var9.field2257[arg0.field1231]) {
                    arg0.field1211 = 1;
                    arg0.field1231++;
                    method2022(var9, arg0.field1231, arg0.field1208, arg0.field1253, arg0);
                }
                if (arg0.field1231 >= var9.field2259.length) {
                    arg0.field1231 -= var9.field2247;
                    arg0.field1255++;
                    if (arg0.field1255 >= var9.field2270) {
                        arg0.field1251 = -1;
                    } else if (arg0.field1231 >= 0 && arg0.field1231 < var9.field2259.length) {
                        method2022(var9, arg0.field1231, arg0.field1208, arg0.field1253, arg0);
                    } else {
                        arg0.field1251 = -1;
                    }
                }
                arg0.field1236 = var9.field2266;
            } else if (var9.method3731()) {
                arg0.field1231++;
                int var10 = var9.method3732();
                if (arg0.field1231 < var10) {
                    method5746(var9, arg0.field1231, arg0.field1208, arg0.field1253, arg0);
                } else {
                    arg0.field1231 -= var9.field2247;
                    arg0.field1255++;
                    if (arg0.field1255 >= var9.field2270) {
                        arg0.field1251 = -1;
                    } else if (arg0.field1231 >= 0 && arg0.field1231 < var10) {
                        method5746(var9, arg0.field1231, arg0.field1208, arg0.field1253, arg0);
                    } else {
                        arg0.field1251 = -1;
                    }
                }
            } else {
                arg0.field1251 = -1;
            }
        }
        if (arg0.field1254 > 0) {
            arg0.field1254--;
        }
    }

    @ObfuscatedName("sl.iu(Ldj;III)V")
    public static void method7979(class93 arg0, int arg1, int arg2) {
        if (arg0.field1251 == arg1 && arg1 != -1) {
            int var3 = class207.method3902(arg1).field2273;
            if (var3 == 1) {
                arg0.field1231 = 0;
                arg0.field1211 = 0;
                arg0.field1254 = arg2;
                arg0.field1255 = 0;
            }
            if (var3 == 2) {
                arg0.field1255 = 0;
            }
        } else if (arg1 == -1 || arg0.field1251 == -1 || class207.method3902(arg1).field2267 >= class207.method3902(arg0.field1251).field2267) {
            arg0.field1251 = arg1;
            arg0.field1231 = 0;
            arg0.field1211 = 0;
            arg0.field1254 = arg2;
            arg0.field1255 = 0;
            arg0.field1281 = arg0.field1276;
        }
    }

    @ObfuscatedName("rg.ia(I)I")
    public static int method7585() {
        return field695 ? 2 : 1;
    }

    @ObfuscatedName("hf.iq(IB)V")
    public static void method3718(int arg0) {
        field757 = 0L;
        if (arg0 >= 2) {
            field695 = true;
        } else {
            field695 = false;
        }
        if (method7585() == 1) {
            Statics.field2033.method451(765, 503);
        } else {
            Statics.field2033.method451(7680, 2160);
        }
        if (field532 < 25 || field590 == null || field590.field1435 == null) {
            return;
        }
        class313 var1 = class313.method5301(class311.field3178, field590.field1435);
        var1.field3291.method8574(method7585());
        var1.field3291.method8575(Statics.field199);
        var1.field3291.method8575(Statics.field2531);
        field590.method2741(var1);
    }

    @ObfuscatedName("client.ad(B)V")
    public final void method461() {
        field757 = class318.method2218() + 500L;
        this.method1156();
        if (field699 != -1) {
            this.method1267(true);
        }
    }

    @ObfuscatedName("client.in(I)V")
    public void method1156() {
        int var1 = Statics.field199;
        int var2 = Statics.field2531;
        if (this.field215 < var1) {
            int var3 = this.field215;
        }
        if (this.field193 < var2) {
            int var4 = this.field193;
        }
        if (Statics.field156 == null) {
            return;
        }
        try {
            client var5 = Statics.field2033;
            Object[] var6 = new Object[] { method7585() };
            JSObject.getWindow(var5).call("resize", var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("client.ir(I)V")
    public final void method1157() {
        if (field699 != -1) {
            method4470(field699);
        }
        for (int var1 = 0; var1 < field608; var1++) {
            if (field817[var1]) {
                field722[var1] = true;
            }
            field571[var1] = field817[var1];
            field817[var1] = false;
        }
        field833 = field536;
        field688 = -1;
        field715 = -1;
        if (field699 != -1) {
            field608 = 0;
            method4056(field699, 0, 0, Statics.field199, Statics.field2531, 0, 0, -1);
        }
        class544.method8944();
        if (field789) {
            if (field648 == 1) {
                Statics.field493[field750 / 100].method9027(field645 - 8, field646 - 8);
            }
            if (field648 == 2) {
                Statics.field493[field750 / 100 + 4].method9027(field645 - 8, field646 - 8);
            }
        }
        if (field675) {
            method3195();
        } else if (field688 != -1) {
            method247(field688, field715);
        }
        if (field756 == 3) {
            for (int var2 = 0; var2 < field608; var2++) {
                if (field571[var2]) {
                    class544.method8899(field752[var2], field753[var2], field754[var2], field758[var2], 16711935, 128);
                } else if (field722[var2]) {
                    class544.method8899(field752[var2], field753[var2], field754[var2], field758[var2], 16711680, 128);
                }
            }
        }
        int var3 = Statics.field4873;
        int var4 = Statics.field1858.field1208;
        int var5 = Statics.field1858.field1253;
        int var6 = field605;
        for (class71 var7 = (class71) class71.field870.method6702(); var7 != null; var7 = (class71) class71.field870.method6684()) {
            if (var7.field871 != -1 || var7.field875 != null) {
                int var8 = 0;
                if (var4 > var7.field867) {
                    var8 += var4 - var7.field867;
                } else if (var4 < var7.field868) {
                    var8 += var7.field868 - var4;
                }
                if (var5 > var7.field869) {
                    var8 += var5 - var7.field869;
                } else if (var5 < var7.field866) {
                    var8 += var7.field866 - var5;
                }
                int var9 = Math.max(var8 - 64, 0);
                if (var9 >= var7.field873 || Statics.field156.method2455() == 0 || var7.field864 != var3) {
                    if (var7.field872 != null) {
                        Statics.field3083.method659(var7.field872);
                        var7.field872 = null;
                    }
                    if (var7.field877 != null) {
                        Statics.field3083.method659(var7.field877);
                        var7.field877 = null;
                    }
                } else {
                    float var10 = var7.field865 < var7.field873 ? Math.min(Math.max((float) (var7.field873 - var9) / (float) (var7.field873 - var7.field865), 0.0F), 1.0F) : 1.0F;
                    int var11 = (int) (var10 * (float) Statics.field156.method2455());
                    class40 var10000;
                    if (var7.field872 != null) {
                        var7.field872.method875(var11);
                    } else if (var7.field871 >= 0) {
                        var10000 = (class40) null;
                        class40 var12 = class40.method705(Statics.field4388, var7.field871, 0);
                        if (var12 != null) {
                            class41 var13 = var12.method710().method715(Statics.field920);
                            class49 var14 = class49.method818(var13, 100, var11);
                            var14.method900(-1);
                            Statics.field3083.method699(var14);
                            var7.field872 = var14;
                        }
                    }
                    if (var7.field877 != null) {
                        var7.field877.method875(var11);
                        if (!var7.field877.method7992()) {
                            var7.field877 = null;
                        }
                    } else if (var7.field875 != null && (var7.field879 -= var6) <= 0) {
                        int var15 = (int) (Math.random() * (double) var7.field875.length);
                        var10000 = (class40) null;
                        class40 var16 = class40.method705(Statics.field4388, var7.field875[var15], 0);
                        if (var16 != null) {
                            class41 var17 = var16.method710().method715(Statics.field920);
                            class49 var18 = class49.method818(var17, 100, var11);
                            var18.method900(0);
                            Statics.field3083.method699(var18);
                            var7.field877 = var18;
                            var7.field879 = var7.field876 + (int) (Math.random() * (double) (var7.field878 - var7.field876));
                        }
                    }
                }
            }
        }
        field605 = 0;
    }

    @ObfuscatedName("ih.ie(Ljava/lang/String;ZB)V")
    public static final void method4110(String arg0, boolean arg1) {
        if (!field651) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1655.method7157(arg0, 250);
        int var6 = Statics.field1655.method7182(arg0, 250) * 13;
        class544.method8900(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class544.method8945(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1655.method7208(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method6658(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            Statics.field1455.method428(0, 0);
        } else {
            method2642(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("oe.iw(IIIIB)V")
    public static final void method6335(int arg0, int arg1, int arg2, int arg3) {
        field642++;
        method8269();
        method337();
        method7471();
        method5376(true);
        int var4 = class109.field1381;
        int[] var5 = class109.field1376;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field665 != var5[var6] && field692 != var5[var6]) {
                method7921(field652[var5[var6]], true);
            }
        }
        method5376(false);
        for (class78 var7 = (class78) field577.method6702(); var7 != null; var7 = (class78) field577.method6684()) {
            if (Statics.field4873 != var7.field985 || field536 > var7.field1008) {
                var7.method7996();
            } else if (field536 >= var7.field1002) {
                if (!var7.field996 && var7.field994 != 0) {
                    if (var7.field994 > 0) {
                        class102 var8 = field629[var7.field994 - 1];
                        if (var8 != null && var8.field1208 >= 0 && var8.field1208 < 13312 && var8.field1253 >= 0 && var8.field1253 < 13312) {
                            var7.field990 = var8.field1208;
                            var7.field984 = var8.field1253;
                            var7.method2118(var7.field1009, var7.field988, var7.field989, field536);
                        }
                    } else {
                        int var9 = -var7.field994 - 1;
                        class93 var10;
                        if (field692 == var9) {
                            var10 = Statics.field1858;
                        } else {
                            var10 = field652[var9];
                        }
                        if (var10 != null && var10.field1208 >= 0 && var10.field1208 < 13312 && var10.field1253 >= 0 && var10.field1253 < 13312) {
                            var7.field990 = var10.field1208;
                            var7.field984 = var10.field1253;
                            var7.method2118(var7.field1009, var7.field988, var7.field989, field536);
                        }
                    }
                }
                if (var7.field995 > 0) {
                    class102 var11 = field629[var7.field995 - 1];
                    if (var11 != null && var11.field1208 >= 0 && var11.field1208 < 13312 && var11.field1253 >= 0 && var11.field1253 < 13312) {
                        var7.method2118(var11.field1208, var11.field1253, method4842(var11.field1208, var11.field1253, var7.field985) - var7.field986, field536);
                    }
                }
                if (var7.field995 < 0) {
                    int var12 = -var7.field995 - 1;
                    class93 var13;
                    if (field692 == var12) {
                        var13 = Statics.field1858;
                    } else {
                        var13 = field652[var12];
                    }
                    if (var13 != null && var13.field1208 >= 0 && var13.field1208 < 13312 && var13.field1253 >= 0 && var13.field1253 < 13312) {
                        var7.method2118(var13.field1208, var13.field1253, method4842(var13.field1208, var13.field1253, var7.field985) - var7.field986, field536);
                    }
                }
                var7.method2110(field605);
                Statics.field1283.method4900(Statics.field4873, (int) var7.field981, (int) var7.field998, (int) var7.field999, 60, var7, var7.field1005, -1L, false);
            }
        }
        for (class73 var14 = (class73) field669.method6702(); var14 != null; var14 = (class73) field669.method6684()) {
            if (Statics.field4873 != var14.field906 || var14.field908) {
                var14.method7996();
            } else if (field536 >= var14.field903) {
                var14.method2017(field605);
                if (var14.field908) {
                    var14.method7996();
                } else {
                    Statics.field1283.method4900(var14.field906, var14.field902, var14.field900, var14.field901, 60, var14, 0, -1L, false);
                }
            }
        }
        method3047(arg0, arg1, arg2, arg3, true);
        int var15 = field830;
        int var16 = field812;
        int var17 = field813;
        int var18 = field656;
        class544.method8892(var15, var16, var15 + var17, var16 + var18);
        class272.method4761();
        class544.method8913();
        int var19 = field612;
        if (field796 / 256 > var19) {
            var19 = field796 / 256;
        }
        if (field798[4] && field800[4] + 128 > var19) {
            var19 = field800[4] + 128;
        }
        int var20 = field541 & 0x7FF;
        method7274(Statics.field4747, Statics.field4450, Statics.field429, var19, var20, method4600(var19), var18);
        int var33;
        if (field743) {
            int var34;
            if (Statics.field156.method2518()) {
                var34 = Statics.field4873;
            } else {
                int var35 = method4842(Statics.field4756, Statics.field3456, Statics.field4873);
                if (var35 - Statics.field84 >= 800 || (class83.field1048[Statics.field4873][Statics.field4756 >> 7][Statics.field3456 >> 7] & 0x4) == 0) {
                    var34 = 3;
                } else {
                    var34 = Statics.field4873;
                }
            }
            var33 = var34;
        } else {
            int var21;
            if (Statics.field156.method2518()) {
                var21 = Statics.field4873;
            } else {
                label403: {
                    int var22 = 3;
                    if (Statics.field861 < 310) {
                        int var23;
                        int var24;
                        if (field535 == 1) {
                            var23 = Statics.field4747 >> 7;
                            var24 = Statics.field429 >> 7;
                        } else {
                            var23 = Statics.field1858.field1208 >> 7;
                            var24 = Statics.field1858.field1253 >> 7;
                        }
                        int var25 = Statics.field4756 >> 7;
                        int var26 = Statics.field3456 >> 7;
                        if (var25 < 0 || var26 < 0 || var25 >= 104 || var26 >= 104) {
                            var21 = Statics.field4873;
                            break label403;
                        }
                        if (var23 < 0 || var24 < 0 || var23 >= 104 || var24 >= 104) {
                            var21 = Statics.field4873;
                            break label403;
                        }
                        if ((class83.field1048[Statics.field4873][var25][var26] & 0x4) != 0) {
                            var22 = Statics.field4873;
                        }
                        int var27;
                        if (var23 > var25) {
                            var27 = var23 - var25;
                        } else {
                            var27 = var25 - var23;
                        }
                        int var28;
                        if (var24 > var26) {
                            var28 = var24 - var26;
                        } else {
                            var28 = var26 - var24;
                        }
                        if (var27 > var28) {
                            int var29 = var28 * 65536 / var27;
                            int var30 = 32768;
                            while (var23 != var25) {
                                if (var25 < var23) {
                                    var25++;
                                } else if (var25 > var23) {
                                    var25--;
                                }
                                if ((class83.field1048[Statics.field4873][var25][var26] & 0x4) != 0) {
                                    var22 = Statics.field4873;
                                }
                                var30 += var29;
                                if (var30 >= 65536) {
                                    var30 -= 65536;
                                    if (var26 < var24) {
                                        var26++;
                                    } else if (var26 > var24) {
                                        var26--;
                                    }
                                    if ((class83.field1048[Statics.field4873][var25][var26] & 0x4) != 0) {
                                        var22 = Statics.field4873;
                                    }
                                }
                            }
                        } else if (var28 > 0) {
                            int var31 = var27 * 65536 / var28;
                            int var32 = 32768;
                            while (var24 != var26) {
                                if (var26 < var24) {
                                    var26++;
                                } else if (var26 > var24) {
                                    var26--;
                                }
                                if ((class83.field1048[Statics.field4873][var25][var26] & 0x4) != 0) {
                                    var22 = Statics.field4873;
                                }
                                var32 += var31;
                                if (var32 >= 65536) {
                                    var32 -= 65536;
                                    if (var25 < var23) {
                                        var25++;
                                    } else if (var25 > var23) {
                                        var25--;
                                    }
                                    if ((class83.field1048[Statics.field4873][var25][var26] & 0x4) != 0) {
                                        var22 = Statics.field4873;
                                    }
                                }
                            }
                        }
                    }
                    if (Statics.field1858.field1208 >= 0 && Statics.field1858.field1253 >= 0 && Statics.field1858.field1208 < 13312 && Statics.field1858.field1253 < 13312) {
                        if ((class83.field1048[Statics.field4873][Statics.field1858.field1208 >> 7][Statics.field1858.field1253 >> 7] & 0x4) != 0) {
                            var22 = Statics.field4873;
                        }
                        var21 = var22;
                    } else {
                        var21 = Statics.field4873;
                    }
                }
            }
            var33 = var21;
        }
        int var36 = Statics.field4756;
        int var37 = Statics.field84;
        int var38 = Statics.field3456;
        int var39 = Statics.field861;
        int var40 = Statics.field1025;
        for (int var41 = 0; var41 < 5; var41++) {
            if (field798[var41]) {
                int var42 = (int) (Math.random() * (double) (field799[var41] * 2 + 1) - (double) field799[var41] + Math.sin((double) field801[var41] / 100.0D * (double) field755[var41]) * (double) field800[var41]);
                if (var41 == 0) {
                    Statics.field4756 += var42;
                }
                if (var41 == 1) {
                    Statics.field84 += var42;
                }
                if (var41 == 2) {
                    Statics.field3456 += var42;
                }
                if (var41 == 3) {
                    Statics.field1025 = Statics.field1025 + var42 & 0x7FF;
                }
                if (var41 == 4) {
                    Statics.field861 += var42;
                    if (Statics.field861 < 128) {
                        Statics.field861 = 128;
                    }
                    if (Statics.field861 > 383) {
                        Statics.field861 = 383;
                    }
                }
            }
        }
        int var43 = class36.field229;
        int var44 = class36.field230;
        if (class36.field227 != 0) {
            var43 = class36.field225;
            var44 = class36.field238;
        }
        if (var43 >= var15 && var43 < var15 + var17 && var44 >= var16 && var44 < var16 + var18) {
            class286.method3167(var43 - var15, var44 - var16);
        } else {
            class286.field3067 = false;
            class286.field3066 = 0;
        }
        method3445();
        class544.method8900(var15, var16, var17, var18, 0);
        method3445();
        int var45 = class272.method4771();
        class272.method4747(Statics.field2033.field201);
        class272.field2821.field3090 = field815;
        Statics.field1283.method4948(Statics.field4756, Statics.field84, Statics.field3456, Statics.field861, Statics.field1025, var33);
        class272.method4747(false);
        if (field586) {
            class544.method8914();
        }
        class272.field2821.field3090 = var45;
        method3445();
        Statics.field1283.method4903();
        method5465(var15, var16, var17, var18);
        if (field543 == 2) {
            method3044((field546 - Statics.field1011 << 7) + field549, (field547 - Statics.field216 << 7) + field550, field548 * 2);
            if (field643 > -1 && field536 % 20 < 10) {
                Statics.field1042[0].method9027(field643 + var15 - 12, field596 + var16 - 28);
            }
        }
        ((class282) class272.field2821.field3091).method5111(field605);
        Statics.method6933();
        Statics.field4756 = var36;
        Statics.field84 = var37;
        Statics.field3456 = var38;
        Statics.field861 = var39;
        Statics.field1025 = var40;
        if (field611 && Statics.field3898.method6513(true, false) == 0) {
            field611 = false;
        }
        if (field611) {
            class544.method8900(var15, var16, var17, var18, 0);
            method4110(class370.field4312, false);
        }
    }

    @ObfuscatedName("fg.iz(IIIIZI)V")
    public static final void method3047(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field725;
        } else if (var5 >= 100) {
            var6 = field804;
        } else {
            var6 = (field804 - field725) * var5 / 100 + field725;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field723) {
            short var8 = field723;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field808) {
                var6 = field808;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class544.method8944();
                    class544.method8900(arg0, arg1, var10, arg3, -16777216);
                    class544.method8900(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field810) {
            short var11 = field810;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field807) {
                var6 = field807;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class544.method8944();
                    class544.method8900(arg0, arg1, arg2, var13, -16777216);
                    class544.method8900(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field815 = arg3 * var6 / 334;
        if (field813 != arg2 || field656 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = method4600(var16);
                int var18 = class272.field2819[var16];
                int var19 = method2854(var17, arg3);
                var14[var15] = var18 * var19 >> 16;
            }
            class276.method4926(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field830 = arg0;
        field812 = arg1;
        field813 = arg2;
        field656 = arg3;
    }

    @ObfuscatedName("tu.ic(S)V")
    public static void method8269() {
        if (Statics.field1858.field1208 >> 7 == field778 && Statics.field1858.field1253 >> 7 == field779) {
            field778 = 0;
        }
    }

    @ObfuscatedName("ap.ih(B)V")
    public static void method337() {
        if (field657) {
            method7921(Statics.field1858, false);
        }
    }

    @ObfuscatedName("rw.id(I)V")
    public static void method7471() {
        if (field665 >= 0 && field652[field665] != null) {
            method7921(field652[field665], false);
        }
    }

    @ObfuscatedName("sn.ip(Ldj;ZI)V")
    public static void method7921(class93 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method2289() || arg0.field1155) {
            return;
        }
        arg0.field1137 = false;
        if ((field716 && class109.field1381 > 50 || class109.field1381 > 200) && arg1 && arg0.field1247 == arg0.field1212) {
            arg0.field1137 = true;
        }
        int var2 = arg0.field1208 >> 7;
        int var3 = arg0.field1253 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class286.method248(0, 0, 0, false, arg0.field1157);
        if (arg0.field1154 != null && field536 >= arg0.field1161 && field536 < arg0.field1144) {
            arg0.field1137 = false;
            arg0.field1142 = method4842(arg0.field1208, arg0.field1253, Statics.field4873);
            arg0.field1261 = field536;
            Statics.field1283.method4901(Statics.field4873, arg0.field1208, arg0.field1253, arg0.field1142, 60, arg0, arg0.field1275, var4, arg0.field1149, arg0.field1134, arg0.field1151, arg0.field1152);
            return;
        }
        if ((arg0.field1208 & 0x7F) == 64 && (arg0.field1253 & 0x7F) == 64) {
            if (field642 == field613[var2][var3]) {
                return;
            }
            field613[var2][var3] = field642;
        }
        arg0.field1142 = method4842(arg0.field1208, arg0.field1253, Statics.field4873);
        arg0.field1261 = field536;
        Statics.field1283.method4900(Statics.field4873, arg0.field1208, arg0.field1253, arg0.field1142, 60, arg0, arg0.field1275, var4, arg0.field1236);
    }

    @ObfuscatedName("la.js(ZI)V")
    public static final void method5376(boolean arg0) {
        for (int var1 = 0; var1 < field572; var1++) {
            class102 var2 = field629[field587[var1]];
            if (var2 != null && var2.method2289() && var2.field1331.field1989 == arg0 && var2.field1331.method3389()) {
                int var3 = var2.field1208 >> 7;
                int var4 = var2.field1253 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1213 == 1 && (var2.field1208 & 0x7F) == 64 && (var2.field1253 & 0x7F) == 64) {
                        if (field642 == field613[var3][var4]) {
                            continue;
                        }
                        field613[var3][var4] = field642;
                    }
                    long var5 = class286.method248(0, 0, 1, !var2.field1331.field2004, field587[var1]);
                    var2.field1261 = field536;
                    Statics.field1283.method4900(Statics.field4873, var2.field1208, var2.field1253, method4842(var2.field1208 + (var2.field1213 * 64 - 64), var2.field1253 + (var2.field1213 * 64 - 64), Statics.field4873), var2.field1213 * 64 - 64 + 60, var2, var2.field1275, var5, var2.field1236);
                }
            }
        }
    }

    @ObfuscatedName("nh.jz(I)Lpr;")
    public static class397 method6301() {
        return field742;
    }

    @ObfuscatedName("mg.ji(I)V")
    public static void method5701() {
        for (class228 var0 = (class228) field745.method6702(); var0 != null; var0 = (class228) field745.method6684()) {
            var0.method7996();
        }
    }

    @ObfuscatedName("ht.jy(B)Z")
    public static boolean method3367() {
        return (field662 & 0x1) != 0;
    }

    @ObfuscatedName("hn.jh(Ldj;I)Z")
    public static boolean method3465(class93 arg0) {
        if (field662 == 0) {
            return false;
        } else if (Statics.field1858 == arg0) {
            return (field662 & 0x8) != 0;
        } else {
            boolean var1 = (field662 & 0x4) != 0;
            boolean var2 = var1 || method3367() && arg0.method2276();
            if (!var2) {
                boolean var3 = (field662 & 0x2) != 0;
                var2 = var3 && arg0.method2279();
            }
            return var2;
        }
    }

    @ObfuscatedName("ke.jr(Ldz;IIIIII)V")
    public static final void method5102(class97 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method2289()) {
            return;
        }
        if (arg0 instanceof class102) {
            class190 var6 = ((class102) arg0).field1331;
            if (var6.field2001 != null) {
                var6 = var6.method3398();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class109.field1381;
        int[] var8 = class109.field1376;
        boolean var9 = arg1 < var7;
        int var10 = -2;
        if (arg0.field1252 != null && (!var9 || !arg0.field1206 && (field760 == 4 || !arg0.field1229 && (field760 == 0 || field760 == 3 || field760 == 1 && ((class93) arg0).method2276())))) {
            method2522(arg0, arg0.field1207);
            if (field643 > -1 && field630 < field631) {
                field563[field630] = Statics.field1813.method7128(arg0.field1252) / 2;
                field634[field630] = Statics.field1813.field4594;
                field632[field630] = field643;
                field797[field630] = field596 - var10;
                field636[field630] = arg0.field1209;
                field637[field630] = arg0.field1232;
                field639[field630] = arg0.field1230;
                field638[field630] = arg0.field1227;
                field770[field630] = arg0.field1252;
                field630++;
                var10 += 12;
            }
        }
        if (!arg0.field1240.method6746()) {
            method2522(arg0, arg0.field1207 + 15);
            for (class101 var11 = (class101) arg0.field1240.method6756(); var11 != null; var11 = (class101) arg0.field1240.method6758()) {
                class98 var12 = var11.method2531(field536);
                if (var12 != null) {
                    class182 var13 = var11.field1326;
                    class548 var14 = var13.method3317();
                    class548 var15 = var13.method3316();
                    int var16 = 0;
                    int var17;
                    if (var14 == null || var15 == null) {
                        var17 = var13.field1921;
                    } else {
                        if (var13.field1922 * 2 < var15.field5304) {
                            var16 = var13.field1922;
                        }
                        var17 = var15.field5304 - var16 * 2;
                    }
                    int var18 = 255;
                    boolean var19 = true;
                    int var20 = field536 - var12.field1285;
                    int var21 = var12.field1286 * var17 / var13.field1921;
                    int var24;
                    if (var12.field1284 > var20) {
                        int var22 = var13.field1917 == 0 ? 0 : var20 / var13.field1917 * var13.field1917;
                        int var23 = var12.field1287 * var17 / var13.field1921;
                        var24 = (var21 - var23) * var22 / var12.field1284 + var23;
                    } else {
                        var24 = var21;
                        int var25 = var12.field1284 + var13.field1918 - var20;
                        if (var13.field1907 >= 0) {
                            var18 = (var25 << 8) / (var13.field1918 - var13.field1907);
                        }
                    }
                    if (var12.field1286 > 0 && var24 < 1) {
                        var24 = 1;
                    }
                    if (var14 == null || var15 == null) {
                        var10 += 5;
                        if (field643 > -1) {
                            int var31 = field643 + arg2 - (var17 >> 1);
                            int var32 = field596 + arg3 - var10;
                            class544.method8900(var31, var32, var24, 5, 65280);
                            class544.method8900(var24 + var31, var32, var17 - var24, 5, 16711680);
                        }
                        var10 += 2;
                    } else {
                        int var26;
                        if (var17 == var24) {
                            var26 = var16 * 2 + var24;
                        } else {
                            var26 = var16 + var24;
                        }
                        int var27 = var14.field5298;
                        var10 += var27;
                        int var28 = field643 + arg2 - (var17 >> 1);
                        int var29 = field596 + arg3 - var10;
                        int var30 = var28 - var16;
                        if (var18 >= 0 && var18 < 255) {
                            var14.method9078(var30, var29, var18);
                            class544.method8919(var30, var29, var26 + var30, var27 + var29);
                            var15.method9078(var30, var29, var18);
                        } else {
                            var14.method9027(var30, var29);
                            class544.method8919(var30, var29, var26 + var30, var27 + var29);
                            var15.method9027(var30, var29);
                        }
                        class544.method8892(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var10 += 2;
                    }
                } else if (var11.method2527()) {
                    var11.method7996();
                }
            }
        }
        if (var10 == -2) {
            var10 += 7;
        }
        if (var9 && field536 == arg0.field1261 && method3465((class93) arg0)) {
            class93 var33 = (class93) arg0;
            if (var9) {
                method2522(arg0, arg0.field1207 + 15);
                class417 var34 = (class417) field744.get(class504.field5054);
                var10 += 4;
                var34.method7130(var33.field1162.method9185(), field643 + arg2, field596 + arg3 - var10, 16777215, 0);
                var10 += 18;
            }
        }
        if (var9) {
            class93 var35 = (class93) arg0;
            if (var35.field1155) {
                return;
            }
            if (var35.field1136 != -1 || var35.field1160 != -1) {
                method2522(arg0, arg0.field1207 + 15);
                if (field643 > -1) {
                    if (var35.field1136 != -1) {
                        var10 += 25;
                        Statics.field62[var35.field1136].method9027(field643 + arg2 - 12, field596 + arg3 - var10);
                    }
                    if (var35.field1160 != -1) {
                        var10 += 25;
                        Statics.field1827[var35.field1160].method9027(field643 + arg2 - 12, field596 + arg3 - var10);
                    }
                }
            }
            if (arg1 >= 0 && field543 == 10 && field537 == var8[arg1]) {
                method2522(arg0, arg0.field1207 + 15);
                if (field643 > -1) {
                    int var36 = Statics.field1042[1].field5298 + var10;
                    Statics.field1042[1].method9027(field643 + arg2 - 12, field596 + arg3 - var36);
                }
            }
        } else {
            class102 var37 = (class102) arg0;
            int[] var38 = var37.method2591();
            short[] var39 = var37.method2598();
            if (var39 != null && var38 != null) {
                for (int var40 = 0; var40 < var39.length; var40++) {
                    if (var39[var40] >= 0 && var38[var40] >= 0) {
                        long var41 = (long) var38[var40] << 8 | (long) var39[var40];
                        class548 var43 = (class548) field822.method7453(var41);
                        if (var43 == null) {
                            class548[] var44 = Statics.method2990(Statics.field3275, var38[var40], 0);
                            if (var44 != null && var39[var40] < var44.length) {
                                var43 = var44[var39[var40]];
                                field822.method7456(var41, var43);
                            }
                        }
                        if (var43 != null) {
                            method2522(arg0, arg0.field1207 + 15);
                            if (field643 > -1) {
                                var43.method9027(field643 + arg2 - (var43.field5304 >> 1), field596 + (arg3 - var43.field5298) - 4);
                            }
                        }
                    }
                }
            }
            if (field543 == 1 && field544 == field587[arg1 - var7] && field536 % 20 < 10) {
                method2522(arg0, arg0.field1207 + 15);
                if (field643 > -1) {
                    Statics.field1042[0].method9027(field643 + arg2 - 12, field596 + arg3 - 28);
                }
            }
        }
        for (int var45 = 0; var45 < 4; var45++) {
            int var46 = arg0.field1237[var45];
            int var47 = arg0.field1210[var45];
            class202 var48 = null;
            int var49 = 0;
            if (var47 >= 0) {
                if (var46 <= field536) {
                    continue;
                }
                var48 = class202.method6652(arg0.field1210[var45]);
                var49 = var48.field2093;
                if (var48 != null && var48.field2104 != null) {
                    var48 = var48.method3576();
                    if (var48 == null) {
                        arg0.field1237[var45] = -1;
                        continue;
                    }
                }
            } else if (var46 < 0) {
                continue;
            }
            int var50 = arg0.field1238[var45];
            class202 var51 = null;
            if (var50 >= 0) {
                var51 = class202.method6652(var50);
                if (var51 != null && var51.field2104 != null) {
                    var51 = var51.method3576();
                }
            }
            if (var46 - var49 <= field536) {
                if (var48 == null) {
                    arg0.field1237[var45] = -1;
                } else {
                    method2522(arg0, arg0.field1207 / 2);
                    if (field643 > -1) {
                        boolean var52 = true;
                        if (var45 == 1) {
                            field596 -= 20;
                        }
                        if (var45 == 2) {
                            field643 -= 15;
                            field596 -= 10;
                        }
                        if (var45 == 3) {
                            field643 += 15;
                            field596 -= 10;
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
                        class548 var65 = null;
                        class548 var66 = null;
                        class548 var67 = null;
                        class548 var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        class548 var78 = var48.method3581();
                        if (var78 != null) {
                            var57 = var78.field5304;
                            int var79 = var78.field5298;
                            if (var79 > var77) {
                                var77 = var79;
                            }
                            var61 = var78.field5299;
                        }
                        class548 var80 = var48.method3551();
                        if (var80 != null) {
                            var58 = var80.field5304;
                            int var81 = var80.field5298;
                            if (var81 > var77) {
                                var77 = var81;
                            }
                            var62 = var80.field5299;
                        }
                        class548 var82 = var48.method3571();
                        if (var82 != null) {
                            var59 = var82.field5304;
                            int var83 = var82.field5298;
                            if (var83 > var77) {
                                var77 = var83;
                            }
                            var63 = var82.field5299;
                        }
                        class548 var84 = var48.method3553();
                        if (var84 != null) {
                            var60 = var84.field5304;
                            int var85 = var84.field5298;
                            if (var85 > var77) {
                                var77 = var85;
                            }
                            var64 = var84.field5299;
                        }
                        if (var51 != null) {
                            var65 = var51.method3581();
                            if (var65 != null) {
                                var69 = var65.field5304;
                                int var86 = var65.field5298;
                                if (var86 > var77) {
                                    var77 = var86;
                                }
                                var73 = var65.field5299;
                            }
                            var66 = var51.method3551();
                            if (var66 != null) {
                                var70 = var66.field5304;
                                int var87 = var66.field5298;
                                if (var87 > var77) {
                                    var77 = var87;
                                }
                                var74 = var66.field5299;
                            }
                            var67 = var51.method3571();
                            if (var67 != null) {
                                var71 = var67.field5304;
                                int var88 = var67.field5298;
                                if (var88 > var77) {
                                    var77 = var88;
                                }
                                var75 = var67.field5299;
                            }
                            var68 = var51.method3553();
                            if (var68 != null) {
                                var72 = var68.field5304;
                                int var89 = var68.field5298;
                                if (var89 > var77) {
                                    var77 = var89;
                                }
                                var76 = var68.field5299;
                            }
                        }
                        class413 var90 = var48.method3573();
                        if (var90 == null) {
                            var90 = Statics.field436;
                        }
                        class413 var91;
                        if (var51 == null) {
                            var91 = Statics.field436;
                        } else {
                            var91 = var51.method3573();
                            if (var91 == null) {
                                var91 = Statics.field436;
                            }
                        }
                        Object var92 = null;
                        String var93 = null;
                        boolean var94 = false;
                        int var95 = 0;
                        String var96 = var48.method3563(arg0.field1266[var45]);
                        int var97 = var90.method7128(var96);
                        if (var51 != null) {
                            var93 = var51.method3563(arg0.field1239[var45]);
                            var95 = var91.method7128(var93);
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
                        int var114 = arg0.field1237[var45] - field536;
                        int var115 = var48.field2101 - var48.field2101 * var114 / var48.field2093;
                        int var116 = var48.field2099 * var114 / var48.field2093 + -var48.field2099;
                        int var117 = field643 + arg2 - (var106 >> 1) + var115;
                        int var118 = field596 + arg3 - 12 + var116;
                        int var119 = var118;
                        int var120 = var77 + var118;
                        int var121 = var48.field2091 + var118 + 15;
                        int var122 = var121 - var90.field4595;
                        int var123 = var90.field4599 + var121;
                        if (var122 < var118) {
                            var119 = var122;
                        }
                        if (var123 > var120) {
                            var120 = var123;
                        }
                        int var124 = 0;
                        if (var51 != null) {
                            var124 = var51.field2091 + var118 + 15;
                            int var125 = var124 - var91.field4595;
                            int var126 = var91.field4599 + var124;
                            if (var125 < var119) {
                                ;
                            }
                            if (var126 > var120) {
                                ;
                            }
                        }
                        int var129 = 255;
                        if (var48.field2100 >= 0) {
                            var129 = (var114 << 8) / (var48.field2093 - var48.field2100);
                        }
                        if (var129 >= 0 && var129 < 255) {
                            if (var78 != null) {
                                var78.method9078(var101 + var117 - var61, var118, var129);
                            }
                            if (var82 != null) {
                                var82.method9078(var102 + var117 - var63, var118, var129);
                            }
                            if (var80 != null) {
                                for (int var130 = 0; var130 < var98; var130++) {
                                    var80.method9078(var58 * var130 + (var103 + var117 - var62), var118, var129);
                                }
                            }
                            if (var84 != null) {
                                var84.method9078(var107 + var117 - var64, var118, var129);
                            }
                            var90.method7134(var96, var104 + var117, var121, var48.field2097, 0, var129);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method9078(var108 + var117 - var73, var118, var129);
                                }
                                if (var67 != null) {
                                    var67.method9078(var109 + var117 - var75, var118, var129);
                                }
                                if (var66 != null) {
                                    for (int var131 = 0; var131 < var99; var131++) {
                                        var66.method9078(var70 * var131 + (var110 + var117 - var74), var118, var129);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method9078(var111 + var117 - var76, var118, var129);
                                }
                                var91.method7134(var93, var112 + var117, var124, var51.field2097, 0, var129);
                            }
                        } else {
                            if (var78 != null) {
                                var78.method9027(var101 + var117 - var61, var118);
                            }
                            if (var82 != null) {
                                var82.method9027(var102 + var117 - var63, var118);
                            }
                            if (var80 != null) {
                                for (int var132 = 0; var132 < var98; var132++) {
                                    var80.method9027(var58 * var132 + (var103 + var117 - var62), var118);
                                }
                            }
                            if (var84 != null) {
                                var84.method9027(var107 + var117 - var64, var118);
                            }
                            var90.method7170(var96, var104 + var117, var121, var48.field2097 | 0xFF000000, 0);
                            if (var51 != null) {
                                if (var65 != null) {
                                    var65.method9027(var108 + var117 - var73, var118);
                                }
                                if (var67 != null) {
                                    var67.method9027(var109 + var117 - var75, var118);
                                }
                                if (var66 != null) {
                                    for (int var133 = 0; var133 < var99; var133++) {
                                        var66.method9027(var70 * var133 + (var110 + var117 - var74), var118);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method9027(var111 + var117 - var76, var118);
                                }
                                var91.method7170(var93, var112 + var117, var124, var51.field2097 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("mb.jv(IIIII)V")
    public static final void method5465(int arg0, int arg1, int arg2, int arg3) {
        field630 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = -1;
        int var7 = class109.field1381;
        int[] var8 = class109.field1376;
        for (int var9 = 0; var9 < field572 + var7; var9++) {
            class97 var10;
            if (var9 < var7) {
                var10 = field652[var8[var9]];
                if (field665 == var8[var9]) {
                    var4 = true;
                    var5 = var9;
                    continue;
                }
                if (Statics.field1858 == var10) {
                    var6 = var9;
                    continue;
                }
            } else {
                var10 = field629[field587[var9 - var7]];
            }
            method5102(var10, var9, arg0, arg1, arg2, arg3);
        }
        if (field657 && var6 != -1) {
            method5102(Statics.field1858, var6, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method5102(field652[field665], var5, arg0, arg1, arg2, arg3);
        }
        for (int var11 = 0; var11 < field630; var11++) {
            int var12 = field632[var11];
            int var13 = field797[var11];
            int var14 = field563[var11];
            int var15 = field634[var11];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var17 = 0; var17 < var11; var17++) {
                    if (var13 + 2 > field797[var17] - field634[var17] && var13 - var15 < field797[var17] + 2 && var12 - var14 < field632[var17] + field563[var17] && var12 + var14 > field632[var17] - field563[var17] && field797[var17] - field634[var17] < var13) {
                        var13 = field797[var17] - field634[var17];
                        var16 = true;
                    }
                }
            }
            field643 = field632[var11];
            field596 = field797[var11] = var13;
            String var18 = field770[var11];
            if (field585 == 0) {
                int var19 = 16776960;
                if (field636[var11] < 6) {
                    var19 = field759[field636[var11]];
                }
                if (field636[var11] == 6) {
                    var19 = field642 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field636[var11] == 7) {
                    var19 = field642 % 20 < 10 ? 255 : 65535;
                }
                if (field636[var11] == 8) {
                    var19 = field642 % 20 < 10 ? 45056 : 8454016;
                }
                if (field636[var11] == 9) {
                    int var20 = 150 - field639[var11];
                    if (var20 < 50) {
                        var19 = var20 * 1280 + 16711680;
                    } else if (var20 < 100) {
                        var19 = 16776960 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var19 = (var20 - 100) * 5 + 65280;
                    }
                }
                if (field636[var11] == 10) {
                    int var21 = 150 - field639[var11];
                    if (var21 < 50) {
                        var19 = var21 * 5 + 16711680;
                    } else if (var21 < 100) {
                        var19 = 16711935 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var19 = (var21 - 100) * 327680 + 255 - (var21 - 100) * 5;
                    }
                }
                if (field636[var11] == 11) {
                    int var22 = 150 - field639[var11];
                    if (var22 < 50) {
                        var19 = 16777215 - var22 * 327685;
                    } else if (var22 < 100) {
                        var19 = (var22 - 50) * 327685 + 65280;
                    } else if (var22 < 150) {
                        var19 = 16777215 - (var22 - 100) * 327680;
                    }
                }
                if (field636[var11] == 12 && field638[var11] == null) {
                    int var23 = var18.length();
                    field638[var11] = new int[var23];
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = (int) ((float) var24 / (float) var23 * 64.0F);
                        int var26 = var25 << 10 | 0x380 | 0x40;
                        field638[var11][var24] = class486.field4905[var26];
                    }
                }
                if (field637[var11] == 0) {
                    Statics.field1813.method7201(var18, field643 + arg0, field596 + arg1, var19, 0, field638[var11]);
                }
                if (field637[var11] == 1) {
                    Statics.field1813.method7140(var18, field643 + arg0, field596 + arg1, var19, 0, field642, field638[var11]);
                }
                if (field637[var11] == 2) {
                    Statics.field1813.method7167(var18, field643 + arg0, field596 + arg1, var19, 0, field642, field638[var11]);
                }
                if (field637[var11] == 3) {
                    Statics.field1813.method7142(var18, field643 + arg0, field596 + arg1, var19, 0, field642, 150 - field639[var11], field638[var11]);
                }
                if (field637[var11] == 4) {
                    int var27 = (150 - field639[var11]) * (Statics.field1813.method7128(var18) + 100) / 150;
                    class544.method8919(field643 + arg0 - 50, arg1, field643 + arg0 + 50, arg1 + arg3);
                    Statics.field1813.method7144(var18, field643 + arg0 + 50 - var27, field596 + arg1, var19, 0, field638[var11]);
                    class544.method8892(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field637[var11] == 5) {
                    int var28 = 150 - field639[var11];
                    int var29 = 0;
                    if (var28 < 25) {
                        var29 = var28 - 25;
                    } else if (var28 > 125) {
                        var29 = var28 - 125;
                    }
                    class544.method8919(arg0, field596 + arg1 - Statics.field1813.field4594 - 1, arg0 + arg2, field596 + arg1 + 5);
                    Statics.field1813.method7201(var18, field643 + arg0, field596 + arg1 + var29, var19, 0, field638[var11]);
                    class544.method8892(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1813.method7130(var18, field643 + arg0, field596 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("df.jt(Ldz;IB)V")
    public static final void method2522(class97 arg0, int arg1) {
        method3044(arg0.field1208, arg0.field1253, arg1);
    }

    @ObfuscatedName("fe.jn(IIII)V")
    public static final void method3044(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field643 = -1;
            field596 = -1;
            return;
        }
        int var3 = method4842(arg0, arg1, Statics.field4873) - arg2;
        int var4 = arg0 - Statics.field4756;
        int var5 = var3 - Statics.field84;
        int var6 = arg1 - Statics.field3456;
        int var7 = class272.field2819[Statics.field861];
        int var8 = class272.field2820[Statics.field861];
        int var9 = class272.field2819[Statics.field1025];
        int var10 = class272.field2820[Statics.field1025];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field643 = field815 * var11 / var15 + field813 / 2;
            field596 = field815 * var14 / var15 + field656 / 2;
        } else {
            field643 = -1;
            field596 = -1;
        }
    }

    @ObfuscatedName("kn.jq(IIIB)I")
    public static final int method4842(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class83.field1048[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class83.field1049[var5][var3][var4] + class83.field1049[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class83.field1049[var5][var3][var4 + 1] + class83.field1049[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("eo.jj(III)I")
    public static int method2854(int arg0, int arg1) {
        int var2 = arg1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (field806 - field805) * var2 / 100 + field805;
        return arg0 * var3 / 256;
    }

    @ObfuscatedName("qd.jl(IIIIIIII)V")
    public static final void method7274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = method2854(arg5, arg6);
        int var8 = 2048 - arg3 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = var7;
        if (var8 != 0) {
            int var13 = class272.field2819[var8];
            int var14 = class272.field2820[var8];
            int var15 = var11 * var14 - var7 * var13 >> 16;
            var12 = var11 * var13 + var7 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class272.field2819[var9];
            int var17 = class272.field2820[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        if (field743) {
            Statics.field3962 = arg0 - var10;
            Statics.field4356 = arg1 - var11;
            Statics.field2915 = arg2 - var12;
            Statics.field2684 = arg3;
            Statics.field4737 = arg4;
        } else {
            Statics.field4756 = arg0 - var10;
            Statics.field84 = arg1 - var11;
            Statics.field3456 = arg2 - var12;
            Statics.field861 = arg3;
            Statics.field1025 = arg4;
        }
        if (field535 == 1 && field676 >= 2 && field536 % 50 == 0 && (Statics.field4747 >> 7 != Statics.field1858.field1208 >> 7 || Statics.field429 >> 7 != Statics.field1858.field1253 >> 7)) {
            int var19 = Statics.field1858.field1156;
            int var20 = (Statics.field4747 >> 7) + Statics.field1011;
            int var21 = (Statics.field429 >> 7) + Statics.field216;
            method2101(var20, var21, var19, true);
        }
    }

    @ObfuscatedName("en.jx(ZLun;B)V")
    public static final void method2840(boolean arg0, class533 arg1) {
        field601 = arg0;
        if (!field601) {
            int var2 = arg1.method8610();
            arg1.method8594();
            int var3 = arg1.method8821();
            int var4 = arg1.method8593();
            Statics.field4753 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field4753[var5][var6] = arg1.method8597();
                }
            }
            Statics.field64 = new int[var4];
            Statics.field3462 = new int[var4];
            Statics.field1676 = new int[var4];
            Statics.field1164 = new byte[var4][];
            Statics.field1953 = new byte[var4][];
            int var7 = 0;
            for (int var8 = (var3 - 6) / 8; var8 <= (var3 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    Statics.field64[var7] = var10;
                    Statics.field3462[var7] = Statics.field2337.method6435("m" + var8 + "_" + var9);
                    Statics.field1676[var7] = Statics.field2337.method6435("l" + var8 + "_" + var9);
                    var7++;
                }
            }
            method2626(var3, var2, true);
            return;
        }
        boolean var11 = arg1.method8624() == 1;
        int var12 = arg1.method8754();
        int var13 = arg1.method8593();
        int var14 = arg1.method8593();
        arg1.method8541();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = arg1.method8567(1);
                    if (var18 == 1) {
                        field831[var15][var16][var17] = arg1.method8567(26);
                    } else {
                        field831[var15][var16][var17] = -1;
                    }
                }
            }
        }
        arg1.method8551();
        Statics.field4753 = new int[var14][4];
        for (int var19 = 0; var19 < var14; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field4753[var19][var20] = arg1.method8597();
            }
        }
        Statics.field64 = new int[var14];
        Statics.field3462 = new int[var14];
        Statics.field1676 = new int[var14];
        Statics.field1164 = new byte[var14][];
        Statics.field1953 = new byte[var14][];
        int var21 = 0;
        for (int var22 = 0; var22 < 4; var22++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = field831[var22][var23][var24];
                    if (var25 != -1) {
                        int var26 = var25 >> 14 & 0x3FF;
                        int var27 = var25 >> 3 & 0x7FF;
                        int var28 = (var26 / 8 << 8) + var27 / 8;
                        for (int var29 = 0; var29 < var21; var29++) {
                            if (Statics.field64[var29] == var28) {
                                var28 = -1;
                                break;
                            }
                        }
                        if (var28 != -1) {
                            Statics.field64[var21] = var28;
                            int var30 = var28 >> 8 & 0xFF;
                            int var31 = var28 & 0xFF;
                            Statics.field3462[var21] = Statics.field2337.method6435("m" + var30 + "_" + var31);
                            Statics.field1676[var21] = Statics.field2337.method6435("l" + var30 + "_" + var31);
                            var21++;
                        }
                    }
                }
            }
        }
        method2626(var13, var12, !var11);
    }

    @ObfuscatedName("dr.jg(IIZI)V")
    public static final void method2626(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field4435 == arg0 && Statics.field3457 == arg1) {
            return;
        }
        Statics.field4435 = arg0;
        Statics.field3457 = arg1;
        method2012(25);
        method4110(class370.field4312, true);
        int var3 = Statics.field1011;
        int var4 = Statics.field216;
        Statics.field1011 = (arg0 - 6) * 8;
        Statics.field216 = (arg1 - 6) * 8;
        int var5 = Statics.field1011 - var3;
        int var6 = Statics.field216 - var4;
        int var7 = Statics.field1011;
        int var8 = Statics.field216;
        for (int var9 = 0; var9 < 65536; var9++) {
            class102 var10 = field629[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1235[var11] -= var5;
                    var10.field1278[var11] -= var6;
                }
                var10.field1208 -= var5 * 128;
                var10.field1253 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class93 var13 = field652[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1235[var14] -= var5;
                    var13.field1278[var14] -= var6;
                }
                var13.field1208 -= var5 * 128;
                var13.field1253 -= var6 * 128;
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
                        field666[var25][var21][var22] = field666[var25][var23][var24];
                    } else {
                        field666[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class96 var26 = (class96) field658.method6702(); var26 != null; var26 = (class96) field658.method6684()) {
            var26.field1194 -= var5;
            var26.field1195 -= var6;
            if (var26.field1194 < 0 || var26.field1195 < 0 || var26.field1194 >= 104 || var26.field1195 >= 104) {
                var26.method7996();
            }
        }
        if (field778 != 0) {
            field778 -= var5;
            field779 -= var6;
        }
        field782 = 0;
        field743 = false;
        Statics.field4756 -= var5 << 7;
        Statics.field3456 -= var6 << 7;
        Statics.field4747 -= var5 << 7;
        Statics.field429 -= var6 << 7;
        field773 = -1;
        field669.method6677();
        field577.method6677();
        for (int var27 = 0; var27 < 4; var27++) {
            field600[var27].method4069();
        }
    }

    @ObfuscatedName("ac.jf(ZB)V")
    public static final void method282(boolean arg0) {
        method3445();
        field590.field1434++;
        if (field590.field1434 < 50 && !arg0) {
            return;
        }
        field590.field1434 = 0;
        if (field592 || field590.method2732() == null) {
            return;
        }
        class313 var1 = class313.method5301(class311.field3226, field590.field1435);
        field590.method2741(var1);
        try {
            field590.method2731();
        } catch (IOException var3) {
            field592 = true;
        }
    }

    @ObfuscatedName("ci.jo(B)V")
    public static final void method1064() {
        method282(false);
        field595 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1164.length; var1++) {
            if (Statics.field3462[var1] != -1 && Statics.field1164[var1] == null) {
                Statics.field1164[var1] = Statics.field2337.method6489(Statics.field3462[var1], 0);
                if (Statics.field1164[var1] == null) {
                    var0 = false;
                    field595++;
                }
            }
            if (Statics.field1676[var1] != -1 && Statics.field1953[var1] == null) {
                Statics.field1953[var1] = Statics.field2337.method6419(Statics.field1676[var1], 0, Statics.field4753[var1]);
                if (Statics.field1953[var1] == null) {
                    var0 = false;
                    field595++;
                }
            }
        }
        if (!var0) {
            field599 = 1;
            return;
        }
        field622 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1164.length; var3++) {
            byte[] var4 = Statics.field1953[var3];
            if (var4 != null) {
                int var5 = (Statics.field64[var3] >> 8) * 64 - Statics.field1011;
                int var6 = (Statics.field64[var3] & 0xFF) * 64 - Statics.field216;
                if (field601) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class83.method2855(var4, var5, var6);
            }
        }
        if (!var2) {
            field599 = 2;
            return;
        }
        if (field599 != 0) {
            method4110(class370.field4312 + class103.field1348 + class103.field1345 + 100 + "%" + class103.field1346, true);
        }
        method3445();
        Statics.field1283.method5071();
        for (int var7 = 0; var7 < 4; var7++) {
            field600[var7].method4069();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class83.field1048[var8][var9][var10] = 0;
                }
            }
        }
        method3445();
        class83.method600();
        int var11 = Statics.field1164.length;
        class71.method2248();
        method282(true);
        if (!field601) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field64[var12] >> 8) * 64 - Statics.field1011;
                int var14 = (Statics.field64[var12] & 0xFF) * 64 - Statics.field216;
                byte[] var15 = Statics.field1164[var12];
                if (var15 != null) {
                    method3445();
                    class83.method7960(var15, var13, var14, Statics.field4435 * 8 - 48, Statics.field3457 * 8 - 48, field600);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field64[var16] >> 8) * 64 - Statics.field1011;
                int var18 = (Statics.field64[var16] & 0xFF) * 64 - Statics.field216;
                byte[] var19 = Statics.field1164[var16];
                if (var19 == null && Statics.field3457 < 800) {
                    method3445();
                    class83.method2106(var17, var18, 64, 64);
                }
            }
            method282(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field1953[var20];
                if (var21 != null) {
                    int var22 = (Statics.field64[var20] >> 8) * 64 - Statics.field1011;
                    int var23 = (Statics.field64[var20] & 0xFF) * 64 - Statics.field216;
                    method3445();
                    class83.method3281(var21, var22, var23, Statics.field1283, field600);
                }
            }
        }
        if (field601) {
            for (int var24 = 0; var24 < 4; var24++) {
                method3445();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field831[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field64.length; var34++) {
                                if (Statics.field64[var34] == var33 && Statics.field1164[var34] != null) {
                                    int var35 = (var31 - var25) * 8;
                                    int var36 = (var32 - var26) * 8;
                                    class83.method264(Statics.field1164[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, var35, var36, field600);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            class83.method449(var24, var25 * 8, var26 * 8);
                        }
                    }
                }
            }
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = field831[0][var37][var38];
                    if (var39 == -1) {
                        class83.method2106(var37 * 8, var38 * 8, 8, 8);
                    }
                }
            }
            method282(true);
            for (int var40 = 0; var40 < 4; var40++) {
                method3445();
                for (int var41 = 0; var41 < 13; var41++) {
                    for (int var42 = 0; var42 < 13; var42++) {
                        int var43 = field831[var40][var41][var42];
                        if (var43 != -1) {
                            int var44 = var43 >> 24 & 0x3;
                            int var45 = var43 >> 1 & 0x3;
                            int var46 = var43 >> 14 & 0x3FF;
                            int var47 = var43 >> 3 & 0x7FF;
                            int var48 = (var46 / 8 << 8) + var47 / 8;
                            for (int var49 = 0; var49 < Statics.field64.length; var49++) {
                                if (Statics.field64[var49] == var48 && Statics.field1953[var49] != null) {
                                    class83.method2183(Statics.field1953[var49], var40, var41 * 8, var42 * 8, var44, (var46 & 0x7) * 8, (var47 & 0x7) * 8, var45, Statics.field1283, field600);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method282(true);
        method3445();
        class83.method999(Statics.field1283, field600);
        method282(true);
        int var50 = class83.field1052;
        if (var50 > Statics.field4873) {
            var50 = Statics.field4873;
        }
        if (var50 < Statics.field4873 - 1) {
            int var51 = Statics.field4873 - 1;
        }
        if (field716) {
            Statics.field1283.method4968(class83.field1052);
        } else {
            Statics.field1283.method4968(0);
        }
        for (int var52 = 0; var52 < 104; var52++) {
            for (int var53 = 0; var53 < 104; var53++) {
                method2023(Statics.field4873, var52, var53);
            }
        }
        method3445();
        method4101();
        class204.field2121.method5418();
        if (Statics.field2033.method489()) {
            class313 var54 = class313.method5301(class311.field3200, field590.field1435);
            var54.field3291.method8577(1057001181);
            field590.method2741(var54);
        }
        if (!field601) {
            int var55 = (Statics.field4435 - 6) / 8;
            int var56 = (Statics.field4435 + 6) / 8;
            int var57 = (Statics.field3457 - 6) / 8;
            int var58 = (Statics.field3457 + 6) / 8;
            for (int var59 = var55 - 1; var59 <= var56 + 1; var59++) {
                for (int var60 = var57 - 1; var60 <= var58 + 1; var60++) {
                    if (var59 < var55 || var59 > var56 || var60 < var57 || var60 > var58) {
                        Statics.field2337.method6440("m" + var59 + "_" + var60);
                        Statics.field2337.method6440("l" + var59 + "_" + var60);
                    }
                }
            }
        }
        method2012(30);
        method3445();
        class83.method2264();
        class313 var61 = class313.method5301(class311.field3194, field590.field1435);
        field590.method2741(var61);
        class35.method5539();
    }

    @ObfuscatedName("cn.jb(IB)V")
    public static final void method1026(int arg0) {
        int[] var1 = Statics.field119.field5296;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class83.field1048[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1283.method4925(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class83.field1048[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1283.method4925(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field119.method9101();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class83.field1048[arg0][var10][var9] & 0x18) == 0) {
                    method3715(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class83.field1048[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method3715(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field774 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                long var13 = Statics.field1283.method4918(Statics.field4873, var11, var12);
                if (var13 != 0L) {
                    int var15 = class286.method1110(var13);
                    int var16 = class204.method2849(var15).field2146;
                    if (var16 >= 0 && class179.method2995(var16).field1877) {
                        field777[field774] = class179.method2995(var16).method3242(false);
                        field553[field774] = var11;
                        field776[field774] = var12;
                        field774++;
                    }
                }
            }
        }
        Statics.field1455.method8970();
    }

    @ObfuscatedName("hf.jk(IIIIIS)V")
    public static final void method3715(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1283.method4915(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1283.method4951(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L && !class286.method3166(var5);
            if (var11) {
                var10 = arg4;
            }
            int[] var12 = Statics.field119.field5296;
            int var13 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var14 = class286.method1110(var5);
            class204 var15 = class204.method2849(var14);
            if (var15.field2147 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var12[var13] = var10;
                        var12[var13 + 512] = var10;
                        var12[var13 + 1024] = var10;
                        var12[var13 + 1536] = var10;
                    } else if (var8 == 1) {
                        var12[var13] = var10;
                        var12[var13 + 1] = var10;
                        var12[var13 + 2] = var10;
                        var12[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var13 + 3] = var10;
                        var12[var13 + 3 + 512] = var10;
                        var12[var13 + 3 + 1024] = var10;
                        var12[var13 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var12[var13 + 1536] = var10;
                        var12[var13 + 1536 + 1] = var10;
                        var12[var13 + 1536 + 2] = var10;
                        var12[var13 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var12[var13] = var10;
                    } else if (var8 == 1) {
                        var12[var13 + 3] = var10;
                    } else if (var8 == 2) {
                        var12[var13 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var12[var13 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var12[var13] = var10;
                        var12[var13 + 512] = var10;
                        var12[var13 + 1024] = var10;
                        var12[var13 + 1536] = var10;
                    } else if (var8 == 0) {
                        var12[var13] = var10;
                        var12[var13 + 1] = var10;
                        var12[var13 + 2] = var10;
                        var12[var13 + 3] = var10;
                    } else if (var8 == 1) {
                        var12[var13 + 3] = var10;
                        var12[var13 + 3 + 512] = var10;
                        var12[var13 + 3 + 1024] = var10;
                        var12[var13 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var12[var13 + 1536] = var10;
                        var12[var13 + 1536 + 1] = var10;
                        var12[var13 + 1536 + 2] = var10;
                        var12[var13 + 1536 + 3] = var10;
                    }
                }
            } else {
                class547 var16 = Statics.field4779[var15.field2147];
                if (var16 != null) {
                    int var17 = (var15.field2133 * 4 - var16.field5290) / 2;
                    int var18 = (var15.field2134 * 4 - var16.field5295) / 2;
                    var16.method8984(arg1 * 4 + 48 + var17, (104 - arg2 - var15.field2134) * 4 + 48 + var18);
                }
            }
        }
        long var19 = Statics.field1283.method4917(arg0, arg1, arg2);
        if (var19 != 0L) {
            int var21 = Statics.field1283.method4951(arg0, arg1, arg2, var19);
            int var22 = var21 >> 6 & 0x3;
            int var23 = var21 & 0x1F;
            int var24 = class286.method1110(var19);
            class204 var25 = class204.method2849(var24);
            if (var25.field2147 != -1) {
                class547 var26 = Statics.field4779[var25.field2147];
                if (var26 != null) {
                    int var27 = (var25.field2133 * 4 - var26.field5290) / 2;
                    int var28 = (var25.field2134 * 4 - var26.field5295) / 2;
                    var26.method8984(arg1 * 4 + 48 + var27, (104 - arg2 - var25.field2134) * 4 + 48 + var28);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                boolean var30 = var19 != 0L && !class286.method3166(var19);
                if (var30) {
                    var29 = 15597568;
                }
                int[] var31 = Statics.field119.field5296;
                int var32 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var22 == 0 || var22 == 2) {
                    var31[var32 + 1536] = var29;
                    var31[var32 + 1024 + 1] = var29;
                    var31[var32 + 512 + 2] = var29;
                    var31[var32 + 3] = var29;
                } else {
                    var31[var32] = var29;
                    var31[var32 + 512 + 1] = var29;
                    var31[var32 + 1024 + 2] = var29;
                    var31[var32 + 1536 + 3] = var29;
                }
            }
        }
        long var33 = Statics.field1283.method4918(arg0, arg1, arg2);
        if (var33 == 0L) {
            return;
        }
        int var35 = class286.method1110(var33);
        class204 var36 = class204.method2849(var35);
        if (var36.field2147 == -1) {
            return;
        }
        class547 var37 = Statics.field4779[var36.field2147];
        if (var37 != null) {
            int var38 = (var36.field2133 * 4 - var37.field5290) / 2;
            int var39 = (var36.field2134 * 4 - var37.field5295) / 2;
            var37.method8984(arg1 * 4 + 48 + var38, (104 - arg2 - var36.field2134) * 4 + 48 + var39);
        }
    }

    @ObfuscatedName("client.je(Lek;IB)Z")
    public boolean method1576(class113 arg0, int arg1) {
        if (arg0.field1431 == 0) {
            Statics.field1010 = null;
        } else {
            if (Statics.field1010 == null) {
                Statics.field1010 = new class448(Statics.field4750, Statics.field2033);
            }
            Statics.field1010.method7515(arg0.field1429, arg1);
        }
        field734 = field726;
        Statics.field104 = true;
        arg0.field1430 = null;
        return true;
    }

    @ObfuscatedName("client.ja(Lek;I)Z")
    public boolean method1159(class113 arg0) {
        if (Statics.field1010 != null) {
            Statics.field1010.method7510(arg0.field1429);
        }
        field734 = field726;
        Statics.field104 = true;
        arg0.field1430 = null;
        return true;
    }

    @ObfuscatedName("client.jm(Lek;I)Z")
    public final boolean method1209(class113 arg0) {
        class458 var2 = arg0.method2732();
        class533 var3 = arg0.field1429;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1430 == null) {
                if (arg0.field1432) {
                    if (!var2.method7675(1)) {
                        return false;
                    }
                    var2.method7670(arg0.field1429.field5199, 0, 1);
                    arg0.field1433 = 0;
                    arg0.field1432 = false;
                }
                var3.field5200 = 0;
                if (var3.method8549()) {
                    if (!var2.method7675(1)) {
                        return false;
                    }
                    var2.method7670(arg0.field1429.field5199, 1, 1);
                    arg0.field1433 = 0;
                }
                arg0.field1432 = true;
                class314[] var4 = class314.method3375();
                int var5 = var3.method8547();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field5200);
                }
                arg0.field1430 = var4[var5];
                arg0.field1431 = arg0.field1430.field3423;
            }
            if (arg0.field1431 == -1) {
                if (!var2.method7675(1)) {
                    return false;
                }
                arg0.method2732().method7670(var3.field5199, 0, 1);
                arg0.field1431 = var3.field5199[0] & 0xFF;
            }
            if (arg0.field1431 == -2) {
                if (!var2.method7675(2)) {
                    return false;
                }
                arg0.method2732().method7670(var3.field5199, 0, 2);
                var3.field5200 = 0;
                arg0.field1431 = var3.method8593();
            }
            if (!var2.method7675(arg0.field1431)) {
                return false;
            }
            var3.field5200 = 0;
            var2.method7670(var3.field5199, 0, arg0.field1431);
            arg0.field1433 = 0;
            field593.method7375();
            arg0.field1425 = arg0.field1436;
            arg0.field1436 = arg0.field1424;
            arg0.field1424 = arg0.field1430;
            if (class314.field3326 == arg0.field1430) {
                int var6 = var3.method8591();
                int var7 = var3.method8591();
                int var8 = var3.method8591();
                int var9 = var3.method8591();
                field798[var6] = true;
                field799[var6] = var7;
                field800[var6] = var8;
                field801[var6] = var9;
                field755[var6] = 0;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3362 == arg0.field1430) {
                int var10 = var3.method8647();
                class350 var11 = Statics.field1071.method5777(var10);
                var11.field3770 = 3;
                var11.field3771 = Statics.field1858.field1158.method5849();
                method2816(var11);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3337 == arg0.field1430) {
                int var12 = var3.method8593();
                int var13 = var3.method8624() * 4;
                int var14 = var3.method8754();
                int var15 = var3.method8641();
                int var16 = var15 >> 16;
                int var17 = var15 >> 8 & 0xFF;
                int var18 = (var15 >> 4 & 0x7) + var16;
                int var19 = (var15 & 0x7) + var17;
                int var20 = var3.method8697();
                int var21 = var3.method8591();
                byte var22 = var3.method8627();
                int var23 = var3.method8596();
                int var24 = var3.method8821();
                byte var25 = var3.method8628();
                int var26 = var3.method8591() * 4;
                int var27 = var18 + var25;
                int var28 = var19 + var22;
                if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104 && var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && var12 != 65535) {
                    int var29 = var18 * 128 + 64;
                    int var30 = var19 * 128 + 64;
                    int var31 = var27 * 128 + 64;
                    int var32 = var28 * 128 + 64;
                    class78 var33 = new class78(var12, Statics.field4873, var29, var30, method4842(var29, var30, Statics.field4873) - var26, field536 + var24, field536 + var14, var20, var21, var23, var13);
                    var33.method2118(var31, var32, method4842(var31, var32, Statics.field4873) - var13, field536 + var24);
                    field577.method6678(var33);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3416 == arg0.field1430) {
                Statics.field1091.field857.method7489(var3, arg0.field1431);
                method4017();
                field733 = field726;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3347 == arg0.field1430) {
                int var34 = var3.method8821();
                int var35 = var3.method8754();
                int var36 = var3.method8647();
                int var37 = var3.method8610();
                class350 var38 = Statics.field1071.method5777(var36);
                if (var38.field3860 != var34 || var38.field3779 != var35 || var38.field3781 != var37) {
                    var38.field3860 = var34;
                    var38.field3779 = var35;
                    var38.field3781 = var37;
                    method2816(var38);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3401 == arg0.field1430) {
                for (int var39 = 0; var39 < Statics.field1856; var39++) {
                    class177 var40 = class177.method3053(var39);
                    if (var40 != null) {
                        class338.field3618[var39] = 0;
                        class338.field3620[var39] = 0;
                    }
                }
                method1136();
                field824 += 32;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3331 == arg0.field1430) {
                int var41 = var3.method8597();
                class88 var42 = (class88) field727.method8322((long) var41);
                if (var42 != null) {
                    method2122(var42, true);
                }
                if (field704 != null) {
                    method2816(field704);
                    field704 = null;
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3358 == arg0.field1430) {
                int var43 = var3.method8640();
                int var44 = var43 >> 16;
                int var45 = var43 >> 8 & 0xFF;
                int var46 = (var43 >> 4 & 0x7) + var44;
                int var47 = (var43 & 0x7) + var45;
                int var48 = var3.method8723();
                int var49 = var48 >> 2;
                int var50 = var48 & 0x3;
                int var51 = field603[var49];
                int var52 = var3.method8610();
                if (var46 >= 0 && var47 >= 0 && var46 < 103 && var47 < 103) {
                    method3198(Statics.field4873, var46, var47, var49, var50, var51, var52);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3342 == arg0.field1430) {
                String var53 = var3.method8741();
                Object[] var54 = new Object[var53.length() + 1];
                for (int var55 = var53.length() - 1; var55 >= 0; var55--) {
                    if (var53.charAt(var55) == 's') {
                        var54[var55 + 1] = var3.method8741();
                    } else {
                        var54[var55 + 1] = Integer.valueOf(var3.method8597());
                    }
                }
                var54[0] = Integer.valueOf(var3.method8597());
                class89 var56 = new class89();
                var56.field1106 = var54;
                class72.method3238(var56);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3415 == arg0.field1430) {
                method1136();
                int var57 = var3.method8648();
                int var58 = var3.method8591();
                int var59 = var3.method8697();
                field672[var59] = var57;
                field670[var59] = var58;
                field671[var59] = 1;
                field673[var59] = var58;
                for (int var60 = 0; var60 < 98; var60++) {
                    if (var57 >= class360.field3936[var60]) {
                        field671[var59] = var60 + 2;
                    }
                }
                field728[++field783 - 1 & 0x1F] = var59;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3360 == arg0.field1430) {
                int var61 = var3.method8593();
                int var62 = var3.method8591();
                int var63 = var3.method8593();
                method2973(var61, var62, var63);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3321 == arg0.field1430) {
                field743 = true;
                field729 = false;
                field790 = true;
                Statics.field2530 = var3.method8591();
                Statics.field1463 = var3.method8591();
                int var64 = var3.method8593();
                int var65 = var3.method8593();
                field615 = var3.method8600();
                int var66 = var3.method8591();
                int var67 = Statics.field2530 * 128 + 64;
                int var68 = Statics.field1463 * 128 + 64;
                boolean var69 = false;
                boolean var70 = false;
                int var71;
                int var72;
                if (field615) {
                    var71 = Statics.field84;
                    var72 = method4842(var67, var68, Statics.field4873) - var64;
                } else {
                    var71 = method4842(Statics.field4756, Statics.field3456, Statics.field4873) - Statics.field84;
                    var72 = var64;
                }
                field814 = new class497(Statics.field4756, Statics.field3456, var71, var67, var68, var72, var65, var66);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3400 == arg0.field1430) {
                field653 = var3.method8754() * 30;
                field739 = field726;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3413 == arg0.field1430) {
                class37.method3230(var3, arg0.field1431);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3402 == arg0.field1430) {
                Statics.field1091.method1776(var3, arg0.field1431);
                field733 = field726;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3316 == arg0.field1430) {
                int var73 = var3.method8636();
                int var74 = var3.method8648();
                int var75 = var3.method8637();
                class350 var76 = Statics.field1071.method5777(var74);
                if (var76.field3811 != var75 || var76.field3736 != var73 || var76.field3801 != 0 || var76.field3797 != 0) {
                    var76.field3811 = var75;
                    var76.field3736 = var73;
                    var76.field3801 = 0;
                    var76.field3797 = 0;
                    method2816(var76);
                    this.method1165(var76);
                    if (var76.field3735 == 0) {
                        method3192(Statics.field1071.field3634[var74 >> 16], var76, false);
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3384 == arg0.field1430) {
                byte var77 = var3.method8592();
                long var78 = (long) var3.method8593();
                long var80 = (long) var3.method8595();
                long var82 = (var78 << 32) + var80;
                boolean var84 = false;
                class166 var85 = var77 >= 0 ? field772[var77] : Statics.field3446;
                if (var85 == null) {
                    var84 = true;
                } else {
                    for (int var86 = 0; var86 < 100; var86++) {
                        if (field763[var86] == var82) {
                            var84 = true;
                            break;
                        }
                    }
                }
                if (!var84) {
                    field763[field764] = var82;
                    field764 = (field764 + 1) % 100;
                    String var87 = class357.method8028(var3);
                    int var88 = var77 >= 0 ? 43 : 46;
                    class112.method1111(var88, "", var87, var85.field1808);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3398 == arg0.field1430) {
                int var89 = var3.method8591();
                method283(var89);
                arg0.field1430 = null;
                return false;
            }
            if (class314.field3414 == arg0.field1430) {
                class69 var90 = new class69();
                var90.field850 = var3.method8741();
                var90.field837 = var3.method8593();
                int var91 = var3.method8597();
                var90.field852 = var91;
                if (var90.method1719()) {
                    var90.field851 = "beta";
                    Statics.field2697 = true;
                } else {
                    Statics.field2697 = false;
                }
                method2012(45);
                var2.method7672();
                Object var92 = null;
                class77.method4517(var90);
                arg0.field1430 = null;
                return false;
            }
            if (class314.field3418 == arg0.field1430) {
                method1136();
                field706 = var3.method8594();
                field739 = field726;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3313 == arg0.field1430) {
                method2840(false, arg0.field1429);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3315 == arg0.field1430) {
                String var93 = var3.method8741();
                String var94 = class417.method7131(class406.method3189(class357.method8028(var3)));
                class112.method3792(6, var93, var94);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3367 == arg0.field1430) {
                int var95 = var3.method8597();
                int var96 = var3.method8593();
                if (var95 < -70000) {
                    var96 += 32768;
                }
                class350 var97;
                if (var95 >= 0) {
                    var97 = Statics.field1071.method5777(var95);
                } else {
                    var97 = null;
                }
                while (var3.field5200 < arg0.field1431) {
                    int var98 = var3.method8820();
                    int var99 = var3.method8593();
                    int var100 = 0;
                    if (var99 != 0) {
                        var100 = var3.method8591();
                        if (var100 == 255) {
                            var100 = var3.method8597();
                        }
                    }
                    if (var97 != null && var98 >= 0 && var98 < var97.field3857.length) {
                        var97.field3857[var98] = var99;
                        var97.field3858[var98] = var100;
                    }
                    class86.method10(var96, var98, var99 - 1, var100);
                }
                if (var97 != null) {
                    method2816(var97);
                }
                method1136();
                field647[++field609 - 1 & 0x1F] = var96 & 0x7FFF;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3306 == arg0.field1430) {
                int var101 = var3.method8821();
                if (var101 == 65535) {
                    var101 = -1;
                }
                field699 = var101;
                this.method1267(false);
                Statics.method3866(var101);
                class72.method7565(field699);
                for (int var102 = 0; var102 < 100; var102++) {
                    field817[var102] = true;
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3355 == arg0.field1430) {
                field760 = var3.method8723();
                field761 = var3.method8697();
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3419 == arg0.field1430) {
                int var103 = var3.method8648();
                int var104 = var3.method8821();
                if (var104 == 65535) {
                    var104 = -1;
                }
                int var105 = var3.method8597();
                int var106 = var3.method8821();
                if (var106 == 65535) {
                    var106 = -1;
                }
                for (int var107 = var104; var107 <= var106; var107++) {
                    long var108 = ((long) var103 << 32) + (long) var107;
                    class492 var110 = field746.method8322(var108);
                    if (var110 != null) {
                        var110.method7996();
                    }
                    field746.method8324(new class491(var105), var108);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3297 == arg0.field1430) {
                field743 = true;
                field729 = false;
                field791 = true;
                int var111 = method3220(var3.method8594() & 0x7EB);
                int var112 = method3439(var3.method8594() & 0x7EB);
                int var113 = var3.method8593();
                int var114 = var3.method8591();
                field795 = new class498(Statics.field861, var112, var113, var114);
                field794 = new class498(Statics.field1025, var111, var113, var114);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3421 == arg0.field1430) {
                Statics.method2131(true, var3);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3397 == arg0.field1430) {
                int var115 = var3.method8593();
                int var116 = var3.method8647();
                class338.field3618[var115] = var116;
                if (class338.field3620[var115] != var116) {
                    class338.field3620[var115] = var116;
                }
                method1850(var115);
                field703[++field824 - 1 & 0x1F] = var115;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3300 == arg0.field1430 && field743) {
                field729 = true;
                field791 = false;
                field790 = false;
                for (int var117 = 0; var117 < 5; var117++) {
                    field798[var117] = false;
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3378 == arg0.field1430) {
                int var118 = var3.method8593();
                int var119 = var3.method8703();
                class350 var120 = Statics.field1071.method5777(var119);
                if (var120 != null && var120.field3735 == 0) {
                    if (var118 > var120.field3750 - var120.field3742) {
                        var118 = var120.field3750 - var120.field3742;
                    }
                    if (var118 < 0) {
                        var118 = 0;
                    }
                    if (var120.field3828 != var118) {
                        var120.field3828 = var118;
                        method2816(var120);
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3371 == arg0.field1430) {
                field743 = true;
                field729 = false;
                field790 = true;
                Statics.field2530 = var3.method8591();
                Statics.field1463 = var3.method8591();
                int var121 = var3.method8593();
                int var122 = var3.method8591() * 128 + 64;
                int var123 = var3.method8591() * 128 + 64;
                int var124 = var3.method8593();
                field615 = var3.method8600();
                int var125 = var3.method8591();
                int var126 = Statics.field2530 * 128 + 64;
                int var127 = Statics.field1463 * 128 + 64;
                boolean var128 = false;
                boolean var129 = false;
                int var130;
                int var131;
                if (field615) {
                    var130 = Statics.field84;
                    var131 = method4842(var126, var127, Statics.field4873) - var121;
                } else {
                    var130 = method4842(Statics.field4756, Statics.field3456, Statics.field4873) - Statics.field84;
                    var131 = var121;
                }
                field814 = new class496(Statics.field4756, Statics.field3456, var130, var126, var127, var131, var122, var123, var124, var125);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3369 == arg0.field1430) {
                int var132 = var3.method8821();
                int var133 = var3.method8591();
                if (var132 == 65535) {
                    var132 = -1;
                }
                method7979(Statics.field1858, var132, var133);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3319 == arg0.field1430) {
                int var134 = var3.method8593();
                int var135 = var3.method8821();
                int var136 = var3.method8821();
                int var137 = var3.method8593();
                int var138 = var3.method8754();
                if (var138 == 65535) {
                    var138 = -1;
                }
                ArrayList var139 = new ArrayList();
                var139.add(var138);
                method2985(var139, var136, var135, var134, var137);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3301 == arg0.field1430) {
                int var140 = var3.method8754();
                class93 var141;
                if (field692 == var140) {
                    var141 = Statics.field1858;
                } else {
                    var141 = field652[var140];
                }
                int var142 = var3.method8591();
                int var143 = var3.method8754();
                int var144 = var3.method8703();
                if (var141 != null) {
                    var141.method2352(var142, var143, var144 >> 16, var144 & 0xFFFF);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3387 == arg0.field1430) {
                field729 = false;
                field743 = false;
                field790 = false;
                field791 = false;
                Statics.field2066 = 0;
                Statics.field47 = 0;
                Statics.field1046 = 0;
                field615 = false;
                Statics.field1619 = 0;
                Statics.field87 = 0;
                Statics.field3979 = 0;
                Statics.field5119 = 0;
                Statics.field2530 = 0;
                Statics.field1463 = 0;
                Statics.field2610 = 0;
                field814 = null;
                field795 = null;
                field794 = null;
                for (int var145 = 0; var145 < 5; var145++) {
                    field798[var145] = false;
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3314 == arg0.field1430) {
                method3332(class312.field3285);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3389 == arg0.field1430) {
                method8834();
                byte var146 = var3.method8592();
                class149 var147 = new class149(var3);
                class157 var148;
                if (var146 >= 0) {
                    var148 = field771[var146];
                } else {
                    var148 = Statics.field2405;
                }
                if (var148 == null) {
                    this.method1169(var146);
                    arg0.field1430 = null;
                    return true;
                }
                if (var147.field1687 > var148.field1755) {
                    this.method1169(var146);
                    arg0.field1430 = null;
                    return true;
                }
                if (var147.field1687 < var148.field1755) {
                    arg0.field1430 = null;
                    return true;
                }
                var147.method3049(var148);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3374 == arg0.field1430) {
                boolean var149 = var3.method8591() == 1;
                if (var149) {
                    Statics.field3610 = class318.method2218() - var3.method8598();
                    Statics.field2344 = new class380(var3, true);
                } else {
                    Statics.field2344 = null;
                }
                field538 = field726;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3392 == arg0.field1430) {
                field743 = true;
                field729 = false;
                field791 = false;
                Statics.field2066 = var3.method8591();
                Statics.field47 = var3.method8591();
                Statics.field1046 = var3.method8593();
                Statics.field1619 = var3.method8591();
                Statics.field87 = var3.method8591();
                if (Statics.field87 >= 100) {
                    int var150 = Statics.field2066 * 128 + 64;
                    int var151 = Statics.field47 * 128 + 64;
                    int var152 = method4842(var150, var151, Statics.field4873) - Statics.field1046;
                    int var153 = var150 - Statics.field4756;
                    int var154 = var152 - Statics.field84;
                    int var155 = var151 - Statics.field3456;
                    int var156 = (int) Math.sqrt((double) (var153 * var153 + var155 * var155));
                    Statics.field861 = (int) (Math.atan2((double) var154, (double) var156) * 325.9490051269531D) & 0x7FF;
                    Statics.field1025 = (int) (Math.atan2((double) var153, (double) var155) * -325.9490051269531D) & 0x7FF;
                    if (Statics.field861 < 128) {
                        Statics.field861 = 128;
                    }
                    if (Statics.field861 > 383) {
                        Statics.field861 = 383;
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3338 == arg0.field1430) {
                Statics.field4 = var3.method8624();
                Statics.field2330 = var3.method8697();
                field832 = var3.method8723();
                for (int var157 = Statics.field2330; var157 < Statics.field2330 + 8; var157++) {
                    for (int var158 = Statics.field4; var158 < Statics.field4 + 8; var158++) {
                        if (field666[field832][var157][var158] != null) {
                            field666[field832][var157][var158] = null;
                            method2023(field832, var157, var158);
                        }
                    }
                }
                for (class96 var159 = (class96) field658.method6702(); var159 != null; var159 = (class96) field658.method6684()) {
                    if (var159.field1194 >= Statics.field2330 && var159.field1194 < Statics.field2330 + 8 && var159.field1195 >= Statics.field4 && var159.field1195 < Statics.field4 + 8 && field832 == var159.field1202) {
                        var159.field1205 = 0;
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3346 == arg0.field1430) {
                int var160 = var3.method8594();
                int var161 = var3.method8597();
                class350 var162 = Statics.field1071.method5777(var161);
                if (var162.field3774 != var160 || var160 == -1) {
                    var162.field3774 = var160;
                    var162.field3861 = 0;
                    var162.field3862 = 0;
                    method2816(var162);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3310 == arg0.field1430) {
                int var163 = var3.method8597();
                int var164 = var3.method8597();
                int var165 = class35.method3733();
                class313 var166 = class313.method5301(class311.field3205, field590.field1435);
                var166.field3291.method8795(var163);
                var166.field3291.method8643(var164);
                var166.field3291.method8621(field188);
                var166.field3291.method8623(var165);
                field590.method2741(var166);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3353 == arg0.field1430) {
                int var167 = var3.method8723();
                int var168 = var3.method8754();
                int var169 = var3.method8593();
                if (var168 == 65535) {
                    var168 = -1;
                }
                class102 var170 = field629[var169];
                if (var170 != null) {
                    if (var170.field1251 == var168 && var168 != -1) {
                        int var171 = class207.method3902(var168).field2273;
                        if (var171 == 1) {
                            var170.field1231 = 0;
                            var170.field1211 = 0;
                            var170.field1254 = var167;
                            var170.field1255 = 0;
                        } else if (var171 == 2) {
                            var170.field1255 = 0;
                        }
                    } else if (var168 == -1 || var170.field1251 == -1 || class207.method3902(var168).field2267 >= class207.method3902(var170.field1251).field2267) {
                        var170.field1251 = var168;
                        var170.field1231 = 0;
                        var170.field1211 = 0;
                        var170.field1254 = var167;
                        var170.field1255 = 0;
                        var170.field1281 = var170.field1276;
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3354 == arg0.field1430) {
                int var172 = var3.method8647();
                int var173 = var3.method8597();
                class88 var174 = (class88) field727.method8322((long) var173);
                class88 var175 = (class88) field727.method8322((long) var172);
                if (var175 != null) {
                    method2122(var175, var174 == null || var174.field1090 != var175.field1090);
                }
                if (var174 != null) {
                    var174.method7996();
                    field727.method8324(var174, (long) var172);
                }
                class350 var176 = Statics.field1071.method5777(var173);
                if (var176 != null) {
                    method2816(var176);
                }
                class350 var177 = Statics.field1071.method5777(var172);
                if (var177 != null) {
                    method2816(var177);
                    method3192(Statics.field1071.field3634[var177.field3725 >>> 16], var177, true);
                }
                if (field699 != -1) {
                    method287(field699, 1);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3308 == arg0.field1430) {
                byte[] var178 = new byte[arg0.field1431];
                var3.method8558(var178, 0, var178.length);
                class534 var179 = new class534(var178);
                String var180 = var179.method8741();
                class32.method2989(var180, true, false);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3406 == arg0.field1430) {
                byte var181 = var3.method8629();
                int var182 = var3.method8593();
                class338.field3618[var182] = var181;
                if (class338.field3620[var182] != var181) {
                    class338.field3620[var182] = var181;
                }
                method1850(var182);
                field703[++field824 - 1 & 0x1F] = var182;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3329 == arg0.field1430) {
                int var183 = var3.method8597();
                int var184 = var3.method8593();
                if (var183 < -70000) {
                    var184 += 32768;
                }
                class350 var185;
                if (var183 >= 0) {
                    var185 = Statics.field1071.method5777(var183);
                } else {
                    var185 = null;
                }
                if (var185 != null) {
                    for (int var186 = 0; var186 < var185.field3857.length; var186++) {
                        var185.field3857[var186] = 0;
                        var185.field3858[var186] = 0;
                    }
                }
                class86.method4839(var184);
                int var187 = var3.method8593();
                for (int var188 = 0; var188 < var187; var188++) {
                    int var189 = var3.method8610();
                    int var190 = var3.method8723();
                    if (var190 == 255) {
                        var190 = var3.method8648();
                    }
                    if (var185 != null && var188 < var185.field3857.length) {
                        var185.field3857[var188] = var189;
                        var185.field3858[var188] = var190;
                    }
                    class86.method10(var184, var188, var189 - 1, var190);
                }
                if (var185 != null) {
                    method2816(var185);
                }
                method1136();
                field647[++field609 - 1 & 0x1F] = var184 & 0x7FFF;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3356 == arg0.field1430) {
                method7978();
                arg0.field1430 = null;
                return false;
            }
            if (class314.field3422 == arg0.field1430) {
                field743 = true;
                field729 = false;
                field791 = true;
                Statics.field2066 = var3.method8591();
                Statics.field47 = var3.method8591();
                Statics.field1046 = var3.method8593();
                int var191 = var3.method8593();
                int var192 = var3.method8591();
                int var193 = Statics.field2066 * 128 + 64;
                int var194 = Statics.field47 * 128 + 64;
                int var195 = method4842(var193, var194, Statics.field4873) - Statics.field1046;
                int var196 = var193 - Statics.field4756;
                int var197 = var195 - Statics.field84;
                int var198 = var194 - Statics.field3456;
                double var199 = Math.sqrt((double) (var196 * var196 + var198 * var198));
                int var201 = method3439((int) (Math.atan2((double) var197, var199) * 325.9490051269531D) & 0x7FF);
                int var202 = method3220((int) (Math.atan2((double) var196, (double) var198) * -325.9490051269531D) & 0x7FF);
                field795 = new class498(Statics.field861, var201, var191, var192);
                field794 = new class498(Statics.field1025, var202, var191, var192);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3365 == arg0.field1430) {
                int var203 = var3.method8597();
                int var204 = var3.method8703();
                class350 var205 = Statics.field1071.method5777(var204);
                class350.method2802(var205, var203);
                method2816(var205);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3304 == arg0.field1430) {
                field543 = var3.method8591();
                if (field543 == 1) {
                    field544 = var3.method8593();
                }
                if (field543 >= 2 && field543 <= 6) {
                    if (field543 == 2) {
                        field549 = 64;
                        field550 = 64;
                    }
                    if (field543 == 3) {
                        field549 = 0;
                        field550 = 64;
                    }
                    if (field543 == 4) {
                        field549 = 128;
                        field550 = 64;
                    }
                    if (field543 == 5) {
                        field549 = 64;
                        field550 = 0;
                    }
                    if (field543 == 6) {
                        field549 = 64;
                        field550 = 128;
                    }
                    field543 = 2;
                    field546 = var3.method8593();
                    field547 = var3.method8593();
                    field548 = var3.method8591();
                }
                if (field543 == 10) {
                    field537 = var3.method8593();
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3372 == arg0.field1430) {
                int var206 = var3.method8597();
                int var207 = var3.method8593();
                int var208 = var3.method8591();
                class88 var209 = (class88) field727.method8322((long) var206);
                if (var209 != null) {
                    method2122(var209, var209.field1090 != var207);
                }
                method813(var206, var207, var208);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3343 == arg0.field1430) {
                int var210 = arg0.field1431 + var3.field5200;
                int var211 = var3.method8593();
                if (var211 == 65535) {
                    var211 = -1;
                }
                int var212 = var3.method8593();
                if (field699 != var211) {
                    field699 = var211;
                    this.method1267(false);
                    Statics.method3866(field699);
                    class72.method7565(field699);
                    for (int var213 = 0; var213 < 100; var213++) {
                        field817[var213] = true;
                    }
                }
                while (var212-- > 0) {
                    int var214 = var3.method8597();
                    int var215 = var3.method8593();
                    int var216 = var3.method8591();
                    class88 var217 = (class88) field727.method8322((long) var214);
                    if (var217 != null && var217.field1090 != var215) {
                        method2122(var217, true);
                        var217 = null;
                    }
                    if (var217 == null) {
                        var217 = method813(var214, var215, var216);
                    }
                    var217.field1088 = true;
                }
                for (class88 var218 = (class88) field727.method8325(); var218 != null; var218 = (class88) field727.method8333()) {
                    if (var218.field1088) {
                        var218.field1088 = false;
                    } else {
                        method2122(var218, true);
                    }
                }
                field746 = new class508(512);
                while (var3.field5200 < var210) {
                    int var219 = var3.method8597();
                    int var220 = var3.method8593();
                    int var221 = var3.method8593();
                    int var222 = var3.method8597();
                    for (int var223 = var220; var223 <= var221; var223++) {
                        long var224 = ((long) var219 << 32) + (long) var223;
                        field746.method8324(new class491(var222), var224);
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3332 == arg0.field1430) {
                method3332(class312.field3287);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3390 == arg0.field1430) {
                var3.field5200 += 28;
                if (var3.method8609()) {
                    method2407(var3, var3.field5200 - 28);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3336 == arg0.field1430) {
                int var226 = var3.method8821();
                if (var226 == 65535) {
                    var226 = -1;
                }
                method6299(var226);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3377 == arg0.field1430) {
                int var227 = var3.method8593();
                if (var227 == 65535) {
                    var227 = -1;
                }
                int var228 = var3.method8640();
                method38(var227, var228);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3404 == arg0.field1430) {
                int var229 = var3.method8820();
                boolean var230 = var3.method8591() == 1;
                String var231 = "";
                boolean var232 = false;
                if (var230) {
                    var231 = var3.method8741();
                    if (Statics.field1091.method1814(new class557(var231, Statics.field4750))) {
                        var232 = true;
                    }
                }
                String var233 = var3.method8741();
                if (!var232) {
                    class112.method3792(var229, var231, var233);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3382 == arg0.field1430) {
                Statics.field921 = new class474(Statics.field489);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3391 == arg0.field1430) {
                boolean var234 = var3.method8600();
                if (!var234) {
                    Statics.field2353 = null;
                } else if (Statics.field2353 == null) {
                    Statics.field2353 = new class389();
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3322 == arg0.field1430) {
                Statics.field1091.method1780();
                field733 = field726;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3409 == arg0.field1430) {
                method3332(class312.field3276);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3302 == arg0.field1430) {
                int var235 = var3.method8723();
                int var236 = var3.method8595();
                int var237 = var236 >> 16;
                int var238 = var236 >> 8 & 0xFF;
                int var239 = (var236 >> 4 & 0x7) + var237;
                int var240 = (var236 & 0x7) + var238;
                int var241 = var3.method8593();
                int var242 = var3.method8754();
                if (var239 >= 0 && var240 >= 0 && var239 < 104 && var240 < 104) {
                    int var243 = var239 * 128 + 64;
                    int var244 = var240 * 128 + 64;
                    class73 var245 = new class73(var242, Statics.field4873, var243, var244, method4842(var243, var244, Statics.field4873) - var235, var241, field536);
                    field669.method6678(var245);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3335 == arg0.field1430) {
                method8834();
                byte var246 = var3.method8592();
                if (arg0.field1431 == 1) {
                    if (var246 >= 0) {
                        field771[var246] = null;
                    } else {
                        Statics.field2405 = null;
                    }
                    arg0.field1430 = null;
                    return true;
                }
                if (var246 >= 0) {
                    field771[var246] = new class157(var3);
                } else {
                    Statics.field2405 = new class157(var3);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3375 == arg0.field1430) {
                int var247 = var3.method8821();
                int var248 = var3.method8624();
                int var249 = var3.method8754();
                class102 var250 = field629[var249];
                int var251 = var3.method8648();
                if (var250 != null) {
                    var250.method2352(var248, var247, var251 >> 16, var251 & 0xFFFF);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3328 == arg0.field1430) {
                Statics.method2131(false, var3);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3317 == arg0.field1430) {
                field743 = true;
                field729 = false;
                field790 = false;
                Statics.field2530 = var3.method8591();
                Statics.field1463 = var3.method8591();
                Statics.field2610 = var3.method8593();
                Statics.field5119 = var3.method8591();
                Statics.field3979 = var3.method8591();
                if (Statics.field3979 >= 100) {
                    Statics.field4756 = Statics.field2530 * 128 + 64;
                    Statics.field3456 = Statics.field1463 * 128 + 64;
                    Statics.field84 = method4842(Statics.field4756, Statics.field3456, Statics.field4873) - Statics.field2610;
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3410 == arg0.field1430) {
                int var252 = var3.method8593();
                int var253 = var3.method8648();
                class350 var254 = Statics.field1071.method5777(var253);
                if (var254.field3770 != 2 || var254.field3771 != var252) {
                    var254.field3770 = 2;
                    var254.field3771 = var252;
                    method2816(var254);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3361 == arg0.field1430) {
                int var255 = var3.method8591();
                if (var3.method8591() == 0) {
                    field628[var255] = new class387();
                    var3.field5200 += 18;
                } else {
                    var3.field5200--;
                    field628[var255] = new class387(var3, false);
                }
                field737 = field726;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3325 == arg0.field1430) {
                method2840(true, arg0.field1429);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3385 == arg0.field1430) {
                return this.method1576(arg0, 1);
            }
            if (class314.field3305 == arg0.field1430) {
                int var256 = var3.method8593();
                int var257 = var3.method8610();
                int var258 = var3.method8754();
                int var259 = var3.method8593();
                class322.method2027(var259, var256, var258, var257);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3299 == arg0.field1430) {
                int var260 = var3.method8597();
                if (field625 != var260) {
                    field625 = var260;
                    method3218();
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3379 == arg0.field1430) {
                return this.method1159(arg0);
            }
            if (class314.field3327 == arg0.field1430) {
                int var261 = var3.method8593();
                int var262 = var3.method8610();
                class322.method3196(var261, var262);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3309 == arg0.field1430) {
                Statics.field4 = var3.method8591();
                Statics.field2330 = var3.method8591();
                field832 = var3.method8697();
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3381 == arg0.field1430) {
                for (int var263 = 0; var263 < class338.field3620.length; var263++) {
                    if (class338.field3620[var263] != class338.field3618[var263]) {
                        class338.field3620[var263] = class338.field3618[var263];
                        method1850(var263);
                        field703[++field824 - 1 & 0x1F] = var263;
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3340 == arg0.field1430) {
                field780 = var3.method8591();
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3417 == arg0.field1430) {
                int var264 = var3.method8591();
                String var265 = var3.method8741();
                int var266 = var3.method8624();
                if (var266 >= 1 && var266 <= 8) {
                    if (var265.equalsIgnoreCase(class370.field4015)) {
                        var265 = null;
                    }
                    field762[var266 - 1] = var265;
                    field663[var266 - 1] = var264 == 0;
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3373 == arg0.field1430) {
                byte var267 = var3.method8592();
                String var268 = var3.method8741();
                long var269 = (long) var3.method8593();
                long var271 = (long) var3.method8595();
                class373 var273 = (class373) class392.method6317(class373.method8273(), var3.method8591());
                long var274 = (var269 << 32) + var271;
                boolean var276 = false;
                Object var277 = null;
                class166 var278 = var267 >= 0 ? field772[var267] : Statics.field3446;
                if (var278 == null) {
                    var276 = true;
                } else {
                    int var279 = 0;
                    while (true) {
                        if (var279 >= 100) {
                            if (var273.field4335 && Statics.field1091.method1814(new class557(var268, Statics.field4750))) {
                                var276 = true;
                            }
                            break;
                        }
                        if (field763[var279] == var274) {
                            var276 = true;
                            break;
                        }
                        var279++;
                    }
                }
                if (!var276) {
                    field763[field764] = var274;
                    field764 = (field764 + 1) % 100;
                    String var280 = class417.method7131(class357.method8028(var3));
                    int var281 = var267 >= 0 ? 41 : 44;
                    if (var273.field4353 == -1) {
                        class112.method1111(var281, var268, var280, var278.field1808);
                    } else {
                        class112.method1111(var281, class103.method7123(var273.field4353) + var268, var280, var278.field1808);
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3320 == arg0.field1430) {
                Statics.method2157(var3, arg0.field1431);
                method7939();
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3311 == arg0.field1430) {
                int var282 = var3.method8591();
                int var283 = var3.method8648();
                class350 var284 = Statics.field1071.method5777(var283);
                class350.method3255(var284, Statics.field1858.field1158.field3666, var282);
                method2816(var284);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3345 == arg0.field1430) {
                Statics.field921 = null;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3318 == arg0.field1430) {
                method3332(class312.field3288);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3351 == arg0.field1430) {
                int var285 = var3.method8591();
                method5137(var285);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3330 == arg0.field1430) {
                int var286 = var3.method8597();
                int var287 = var3.method8647();
                int var288 = var3.method8610();
                if (var288 == 65535) {
                    var288 = -1;
                }
                class350 var289 = Statics.field1071.method5777(var286);
                if (var289.field3724) {
                    var289.field3728 = var288;
                    var289.field3721 = var287;
                    class205 var291 = class205.method6353(var288).method3642(var287);
                    var289.field3860 = var291.field2189;
                    var289.field3779 = var291.field2190;
                    var289.field3780 = var291.field2213;
                    var289.field3711 = var291.field2201;
                    var289.field3777 = var291.field2193;
                    var289.field3781 = var291.field2188;
                    if (var291.field2194 == 1) {
                        var289.field3787 = 1;
                    } else {
                        var289.field3787 = 2;
                    }
                    if (var289.field3782 > 0) {
                        var289.field3781 = var289.field3781 * 32 / var289.field3782;
                    } else if (var289.field3745 > 0) {
                        var289.field3781 = var289.field3781 * 32 / var289.field3745;
                    }
                    method2816(var289);
                } else if (var288 == -1) {
                    var289.field3770 = 0;
                    arg0.field1430 = null;
                    return true;
                } else {
                    class205 var290 = class205.method6353(var288).method3642(var287);
                    var289.field3770 = 4;
                    var289.field3771 = var288;
                    var289.field3860 = var290.field2189;
                    var289.field3779 = var290.field2190;
                    var289.field3781 = var290.field2188 * 100 / var287;
                    method2816(var289);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3350 == arg0.field1430) {
                int var292 = var3.method8821();
                class86.method2928(var292);
                field647[++field609 - 1 & 0x1F] = var292 & 0x7FFF;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3312 == arg0.field1430) {
                int var293 = var3.method8648();
                int var294 = var3.method8754();
                class350 var295 = Statics.field1071.method5777(var293);
                if (var295.field3770 != 6 || var295.field3771 != var294) {
                    var295.field3770 = 6;
                    var295.field3771 = var294;
                    method2816(var295);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3420 == arg0.field1430) {
                if (Statics.field921 == null) {
                    Statics.field921 = new class474(Statics.field489);
                }
                class543 var296 = Statics.field489.method7914(var3);
                Statics.field921.field4874.method8340(var296.field5268, var296.field5269);
                field730[++field731 - 1 & 0x1F] = var296.field5268;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3395 == arg0.field1430) {
                int var297 = var3.method8703();
                String var298 = var3.method8741();
                class350 var299 = Statics.field1071.method5777(var297);
                if (!var298.equals(var299.field3802)) {
                    var299.field3802 = var298;
                    method2816(var299);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3298 == arg0.field1430) {
                field736 = field726;
                byte var300 = var3.method8592();
                class163 var301 = new class163(var3);
                class166 var302;
                if (var300 >= 0) {
                    var302 = field772[var300];
                } else {
                    var302 = Statics.field3446;
                }
                if (var302 == null) {
                    this.method1168(var300);
                    arg0.field1430 = null;
                    return true;
                }
                if (var301.field1786 > var302.field1809) {
                    this.method1168(var300);
                    arg0.field1430 = null;
                    return true;
                }
                if (var301.field1786 < var302.field1809) {
                    arg0.field1430 = null;
                    return true;
                }
                var301.method3159(var302);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3399 == arg0.field1430) {
                method5747(var3.method8741());
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3324 == arg0.field1430) {
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3352 == arg0.field1430) {
                int var303 = var3.method8597();
                int var304 = var3.method8821();
                class350 var305 = Statics.field1071.method5777(var303);
                if (var305.field3770 != 1 || var305.field3771 != var304) {
                    var305.field3770 = 1;
                    var305.field3771 = var304;
                    method2816(var305);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3394 == arg0.field1430) {
                method1136();
                int var306 = var3.method8723();
                int var307 = var3.method8723();
                int var308 = var3.method8697();
                int var309 = var3.method8597();
                field672[var308] = var309;
                field670[var308] = var307;
                field671[var308] = 1;
                field673[var308] = var306;
                for (int var310 = 0; var310 < 98; var310++) {
                    if (var309 >= class360.field3936[var310]) {
                        field671[var308] = var310 + 2;
                    }
                }
                field728[++field783 - 1 & 0x1F] = var308;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3405 == arg0.field1430) {
                for (int var311 = 0; var311 < field652.length; var311++) {
                    if (field652[var311] != null) {
                        field652[var311].field1251 = -1;
                    }
                }
                for (int var312 = 0; var312 < field629.length; var312++) {
                    if (field629[var312] != null) {
                        field629[var312].field1251 = -1;
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3403 == arg0.field1430) {
                method3332(class312.field3277);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3396 == arg0.field1430) {
                int var313 = var3.method8597();
                boolean var314 = var3.method8723() == 1;
                class350 var315 = Statics.field1071.method5777(var313);
                if (var315.field3746 != var314) {
                    var315.field3746 = var314;
                    method2816(var315);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3357 == arg0.field1430) {
                Statics.field1583 = class553.method3237(var3.method8591());
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3376 == arg0.field1430) {
                boolean var316 = var3.method8624() == 1;
                int var317 = var3.method8703();
                class350 var318 = Statics.field1071.method5777(var317);
                class350.method156(var318, Statics.field1858.field1158, var316);
                method2816(var318);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3411 == arg0.field1430) {
                int var319 = var3.method8597();
                class350 var320 = Statics.field1071.method5777(var319);
                for (int var321 = 0; var321 < var320.field3857.length; var321++) {
                    var320.field3857[var321] = -1;
                    var320.field3857[var321] = 0;
                }
                method2816(var320);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3368 == arg0.field1430) {
                Statics.field2330 = var3.method8591();
                field832 = var3.method8624();
                Statics.field4 = var3.method8723();
                while (var3.field5200 < arg0.field1431) {
                    int var322 = var3.method8591();
                    class312 var323 = class312.method3901()[var322];
                    method3332(var323);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3407 == arg0.field1430) {
                method3332(class312.field3281);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3364 == arg0.field1430) {
                String var324 = var3.method8741();
                long var325 = (long) var3.method8593();
                long var327 = (long) var3.method8595();
                class373 var329 = (class373) class392.method6317(class373.method8273(), var3.method8591());
                long var330 = (var325 << 32) + var327;
                boolean var332 = false;
                for (int var333 = 0; var333 < 100; var333++) {
                    if (field763[var333] == var330) {
                        var332 = true;
                        break;
                    }
                }
                if (Statics.field1091.method1814(new class557(var324, Statics.field4750))) {
                    var332 = true;
                }
                if (!var332 && field650 == 0) {
                    field763[field764] = var330;
                    field764 = (field764 + 1) % 100;
                    String var334 = class417.method7131(class406.method3189(class357.method8028(var3)));
                    byte var335;
                    if (var329.field4354) {
                        var335 = 7;
                    } else {
                        var335 = 3;
                    }
                    if (var329.field4353 == -1) {
                        class112.method3792(var335, var324, var334);
                    } else {
                        class112.method3792(var335, class103.method7123(var329.field4353) + var324, var334);
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3349 == arg0.field1430) {
                int var336 = var3.method8703();
                int var337 = var3.method8754();
                int var338 = var337 >> 10 & 0x1F;
                int var339 = var337 >> 5 & 0x1F;
                int var340 = var337 & 0x1F;
                int var341 = (var340 << 3) + (var338 << 19) + (var339 << 11);
                class350 var342 = Statics.field1071.method5777(var336);
                if (var342.field3751 != var341) {
                    var342.field3751 = var341;
                    method2816(var342);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3307 == arg0.field1430) {
                short var343 = (short) var3.method8637();
                int var344 = var3.method8591();
                int var345 = var3.method8597();
                int var346 = var3.method8821();
                class102 var347 = field629[var346];
                if (var347 != null) {
                    var347.method2546(var344, var345, var343);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3323 == arg0.field1430) {
                field778 = var3.method8591();
                if (field778 == 255) {
                    field778 = 0;
                }
                field779 = var3.method8591();
                if (field779 == 255) {
                    field779 = 0;
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3348 == arg0.field1430) {
                int var348 = var3.method8647();
                int var349 = var3.method8821();
                int var350 = var3.method8610();
                class350 var351 = Statics.field1071.method5777(var348);
                var351.field3783 = (var349 << 16) + var350;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3359 == arg0.field1430) {
                method3332(class312.field3279);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3408 == arg0.field1430) {
                String var352 = var3.method8741();
                long var353 = var3.method8598();
                long var355 = (long) var3.method8593();
                long var357 = (long) var3.method8595();
                class373 var359 = (class373) class392.method6317(class373.method8273(), var3.method8591());
                long var360 = (var355 << 32) + var357;
                boolean var362 = false;
                for (int var363 = 0; var363 < 100; var363++) {
                    if (field763[var363] == var360) {
                        var362 = true;
                        break;
                    }
                }
                if (var359.field4335 && Statics.field1091.method1814(new class557(var352, Statics.field4750))) {
                    var362 = true;
                }
                if (!var362 && field650 == 0) {
                    field763[field764] = var360;
                    field764 = (field764 + 1) % 100;
                    String var364 = class417.method7131(class406.method3189(class357.method8028(var3)));
                    if (var359.field4353 == -1) {
                        class112.method1111(9, var352, var364, class408.method4018(var353));
                    } else {
                        class112.method1111(9, class103.method7123(var359.field4353) + var352, var364, class408.method4018(var353));
                    }
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3370 == arg0.field1430) {
                if (field699 != -1) {
                    method287(field699, 0);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3363 == arg0.field1430) {
                method3332(class312.field3282);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3393 == arg0.field1430) {
                method3332(class312.field3280);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3383 == arg0.field1430) {
                return this.method1576(arg0, 2);
            }
            if (class314.field3339 == arg0.field1430) {
                int var365 = var3.method8624();
                int var366 = var3.method8624();
                int var367 = var3.method8647();
                class350 var368 = Statics.field1071.method5777(var367);
                class350.method3147(var368, var366, var365);
                method2816(var368);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3303 == arg0.field1430) {
                method1136();
                field705 = var3.method8593();
                field739 = field726;
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3334 == arg0.field1430) {
                field743 = true;
                field729 = false;
                field791 = true;
                int var369 = var3.method8594();
                int var370 = var3.method8594();
                int var371 = method3439(Statics.field861 + var370 & 0x7EB);
                int var372 = Statics.field1025 + var369;
                int var373 = var3.method8593();
                int var374 = var3.method8591();
                field795 = new class498(Statics.field861, var371, var373, var374);
                field794 = new class498(Statics.field1025, var372, var373, var374);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3366 == arg0.field1430) {
                int var375 = var3.method8754();
                int var376 = var3.method8610();
                int var377 = var3.method8610();
                int var378 = var3.method8610();
                int var379 = var3.method8821();
                if (var379 == 65535) {
                    var379 = -1;
                }
                int var380 = var3.method8593();
                if (var380 == 65535) {
                    var380 = -1;
                }
                ArrayList var381 = new ArrayList();
                var381.add(var380);
                var381.add(var379);
                method2985(var381, var376, var375, var378, var377);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3388 == arg0.field1430) {
                method3332(class312.field3283);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3333 == arg0.field1430) {
                int var382 = var3.method8821();
                int var383 = var3.method8610();
                byte var384 = var3.method8628();
                int var385 = var3.method8754();
                byte var386 = var3.method8628();
                int var387 = var3.method8639();
                int var388 = var387 >> 16;
                int var389 = var387 >> 8 & 0xFF;
                int var390 = (var387 >> 4 & 0x7) + var388;
                int var391 = (var387 & 0x7) + var389;
                int var392 = var3.method8591();
                int var393 = var3.method8591() * 4;
                int var394 = var3.method8697() * 4;
                int var395 = var3.method8821();
                int var396 = var3.method8596();
                int var397 = var386 + var390;
                int var398 = var384 + var391;
                if (var390 >= 0 && var391 >= 0 && var390 < 104 && var391 < 104 && var397 >= 0 && var398 >= 0 && var397 < 104 && var398 < 104 && var385 != 65535) {
                    int var399 = var390 * 128 + 64;
                    int var400 = var391 * 128 + 64;
                    int var401 = var397 * 128 + 64;
                    int var402 = var398 * 128 + 64;
                    class78 var403 = new class78(var385, Statics.field4873, var399, var400, method4842(var399, var400, Statics.field4873) - var393, field536 + var382, field536 + var395, var392, var383, var396, var394);
                    var403.method2118(var401, var402, method4842(var401, var402, Statics.field4873) - var394, field536 + var382);
                    field577.method6678(var403);
                }
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3341 == arg0.field1430) {
                method3332(class312.field3286);
                arg0.field1430 = null;
                return true;
            }
            if (class314.field3344 == arg0.field1430) {
                field736 = field726;
                byte var404 = var3.method8592();
                if (arg0.field1431 == 1) {
                    if (var404 >= 0) {
                        field772[var404] = null;
                    } else {
                        Statics.field3446 = null;
                    }
                    arg0.field1430 = null;
                    return true;
                }
                if (var404 >= 0) {
                    field772[var404] = new class166(var3);
                } else {
                    Statics.field3446 = new class166(var3);
                }
                arg0.field1430 = null;
                return true;
            }
            Statics.method5453("" + (arg0.field1430 == null ? -1 : arg0.field1430.field3380) + class103.field1343 + (arg0.field1436 == null ? -1 : arg0.field1436.field3380) + class103.field1343 + (arg0.field1425 == null ? -1 : arg0.field1425.field3380) + class103.field1343 + arg0.field1431, (Throwable) null);
            method7978();
        } catch (IOException var409) {
            method6305();
        } catch (Exception var410) {
            String var407 = "" + (arg0.field1430 == null ? -1 : arg0.field1430.field3380) + class103.field1343 + (arg0.field1436 == null ? -1 : arg0.field1436.field3380) + class103.field1343 + (arg0.field1425 == null ? -1 : arg0.field1425.field3380) + class103.field1343 + arg0.field1431 + class103.field1343 + (Statics.field1011 + Statics.field1858.field1235[0]) + class103.field1343 + (Statics.field216 + Statics.field1858.field1278[0]) + class103.field1343;
            for (int var408 = 0; var408 < arg0.field1431 && var408 < 50; var408++) {
                var407 = var407 + var3.field5199[var408] + class103.field1343;
            }
            Statics.method5453(var407, var410);
            method7978();
        }
        return true;
    }

    @ObfuscatedName("gx.jc(Llq;I)V")
    public static final void method3332(class312 arg0) {
        class533 var1 = field590.field1429;
        if (class312.field3286 == arg0) {
            int var2 = var1.method8754();
            byte var3 = var1.method8592();
            int var4 = var1.method8821();
            int var5 = var1.method8593();
            byte var6 = var1.method8627();
            int var7 = var1.method8697();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field603[var8];
            int var11 = var1.method8624();
            int var12 = (var11 >> 4 & 0x7) + Statics.field2330;
            int var13 = (var11 & 0x7) + Statics.field4;
            int var14 = var1.method8821();
            byte var15 = var1.method8628();
            byte var16 = var1.method8628();
            class93 var17;
            if (field692 == var5) {
                var17 = Statics.field1858;
            } else {
                var17 = field652[var5];
            }
            if (var17 != null) {
                int var18 = field832 == -1 ? Statics.field4873 : field832;
                method6629(var18, var12, var13, var8, var9, var10, var2, var4, var14, var16, var6, var3, var15, var17);
            }
        }
        if (class312.field3276 == arg0) {
            int var19 = var1.method8624();
            int var20 = (var19 >> 4 & 0x7) + Statics.field2330;
            int var21 = (var19 & 0x7) + Statics.field4;
            int var22 = var1.method8624();
            int var23 = var1.method8821();
            if (var20 >= 0 && var21 >= 0 && var20 < 104 && var21 < 104) {
                int var24 = field832 == -1 ? Statics.field4873 : field832;
                method1115(var24, var20, var21, var23, var22);
            }
        } else if (class312.field3281 == arg0) {
            int var25 = var1.method8591();
            int var26 = (var25 >> 4 & 0x7) + Statics.field2330;
            int var27 = (var25 & 0x7) + Statics.field4;
            int var28 = var1.method8593();
            int var29 = var1.method8591();
            int var30 = var1.method8624();
            int var31 = var30 >> 4 & 0xF;
            int var32 = var30 & 0x7;
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                int var33 = var31 + 1;
                if (Statics.field1858.field1235[0] >= var26 - var33 && Statics.field1858.field1235[0] <= var26 + var33 && Statics.field1858.field1278[0] >= var27 - var33 && Statics.field1858.field1278[0] <= var27 + var33 && Statics.field156.method2455() != 0 && var32 > 0 && field782 < 50) {
                    field767[field782] = var28;
                    field784[field782] = var32;
                    field785[field782] = var29;
                    field788[field782] = null;
                    field786[field782] = (var26 << 16) + (var27 << 8) + var31;
                    field555[field782] = 0;
                    field782++;
                }
            }
        } else if (class312.field3278 == arg0) {
            int var34 = var1.method8591();
            int var35 = var1.method8610();
            int var36 = var1.method8591();
            int var37 = var1.method8591();
            int var38 = var1.method8697();
            int var39 = (var38 >> 4 & 0x7) + Statics.field2330;
            int var40 = (var38 & 0x7) + Statics.field4;
            int var41 = var1.method8697() & 0x1F;
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                int var42 = var41 + 1;
                if (Statics.field1858.field1235[0] >= var39 - var42 && Statics.field1858.field1235[0] <= var39 + var42 && Statics.field1858.field1278[0] >= var40 - var42 && Statics.field1858.field1278[0] <= var40 + var42 && Statics.field156.method2455() != 0 && var36 > 0 && field782 < 50) {
                    field767[field782] = var35;
                    field788[field782] = null;
                    field786[field782] = (var39 << 16) + (var40 << 8) + var41;
                    field784[field782] = var36;
                    field785[field782] = var34;
                    field555[field782] = var37;
                    field782++;
                }
            }
        } else if (class312.field3280 == arg0) {
            int var43 = var1.method8703();
            int var44 = var1.method8723();
            int var45 = (var44 >> 4 & 0x7) + Statics.field2330;
            int var46 = (var44 & 0x7) + Statics.field4;
            int var47 = var1.method8648();
            int var48 = var1.method8754();
            if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                int var49 = field832 == -1 ? Statics.field4873 : field832;
                method2020(var49, var45, var46, var48, var47, var43);
            }
        } else if (class312.field3279 == arg0) {
            int var50 = var1.method8723();
            int var51 = var50 >> 2;
            int var52 = var50 & 0x3;
            int var53 = field603[var51];
            int var54 = var1.method8723();
            int var55 = (var54 >> 4 & 0x7) + Statics.field2330;
            int var56 = (var54 & 0x7) + Statics.field4;
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                int var57 = field832 == -1 ? Statics.field4873 : field832;
                method2272(var57, var55, var56, var53, -1, var51, var52, 31, 0, -1);
            }
        } else if (class312.field3277 == arg0) {
            int var58 = var1.method8624();
            int var59 = var1.method8593();
            int var60 = var1.method8624();
            int var61 = (var60 >> 4 & 0x7) + Statics.field2330;
            int var62 = (var60 & 0x7) + Statics.field4;
            int var63 = var1.method8593();
            if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                int var64 = var61 * 128 + 64;
                int var65 = var62 * 128 + 64;
                int var66 = field832 == -1 ? Statics.field4873 : field832;
                class73 var67 = new class73(var63, var66, var64, var65, method4842(var64, var65, var66) - var58, var59, field536);
                field669.method6678(var67);
            }
        } else if (class312.field3283 == arg0) {
            int var68 = var1.method8697();
            int var69 = (var68 >> 4 & 0x7) + Statics.field2330;
            int var70 = (var68 & 0x7) + Statics.field4;
            int var71 = var1.method8754();
            int var72 = var1.method8610();
            int var73 = var1.method8723();
            int var74 = var1.method8642();
            int var75 = var1.method8591() * 4;
            byte var76 = var1.method8592();
            int var77 = var1.method8642();
            int var78 = var1.method8591() * 4;
            byte var79 = var1.method8627();
            int var80 = var1.method8754();
            int var81 = var1.method8610();
            int var82 = var69 + var79;
            int var83 = var70 + var76;
            if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104 && var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var81 != 65535) {
                int var84 = field832 == -1 ? Statics.field4873 : field832;
                method805(var84, var69, var70, var82, var83, var77, var81, var75, var78, var80, var72, var73, var71, var74);
            }
        } else if (class312.field3288 == arg0) {
            int var85 = var1.method8697();
            int var86 = (var85 >> 4 & 0x7) + Statics.field2330;
            int var87 = (var85 & 0x7) + Statics.field4;
            int var88 = var1.method8593();
            int var89 = var1.method8597();
            if (var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104) {
                int var90 = field832 == -1 ? Statics.field4873 : field832;
                method6324(var90, var86, var87, var88, var89);
            }
        } else if (class312.field3287 == arg0) {
            int var91 = var1.method8697();
            int var92 = var1.method8754();
            int var93 = var1.method8624();
            int var94 = var93 >> 2;
            int var95 = var93 & 0x3;
            int var96 = field603[var94];
            int var97 = var1.method8697();
            int var98 = (var97 >> 4 & 0x7) + Statics.field2330;
            int var99 = (var97 & 0x7) + Statics.field4;
            if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                int var100 = field832 == -1 ? Statics.field4873 : field832;
                method2272(var100, var98, var99, var96, var92, var94, var95, var91, 0, -1);
            }
        } else if (class312.field3282 == arg0) {
            int var101 = var1.method8723();
            int var102 = var1.method8754();
            int var103 = var1.method8697();
            int var104 = (var103 >> 4 & 0x7) + Statics.field2330;
            int var105 = (var103 & 0x7) + Statics.field4;
            int var106 = var1.method8723();
            int var107 = var1.method8593();
            boolean var108 = var1.method8697() == 1;
            int var109 = var1.method8593();
            int var110 = var1.method8597();
            if (var104 >= 0 && var105 >= 0 && var104 < 104 && var105 < 104) {
                int var111 = field832 == -1 ? Statics.field4873 : field832;
                method3066(var111, var104, var105, var107, var110, var101, var109, var102, var106, var108);
            }
        } else if (class312.field3285 == arg0) {
            int var112 = var1.method8821();
            int var113 = var1.method8591();
            int var114 = var113 >> 2;
            int var115 = var113 & 0x3;
            int var116 = field603[var114];
            int var117 = var1.method8697();
            int var118 = (var117 >> 4 & 0x7) + Statics.field2330;
            int var119 = (var117 & 0x7) + Statics.field4;
            if (var118 >= 0 && var119 >= 0 && var118 < 103 && var119 < 103) {
                int var120 = field832 == -1 ? Statics.field4873 : field832;
                boolean var121 = method3198(var120, var118, var119, var114, var115, var116, var112);
                if (var121) {
                    return;
                }
                method8263(var120, var118, var119, var116, var112);
            }
        }
    }

    @ObfuscatedName("cu.jp(IIIIIB)V")
    public static void method1115(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class397 var5 = field666[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class106 var6 = (class106) var5.method6702(); var6 != null; var6 = (class106) var5.method6684()) {
            if ((arg3 & 0x7FFF) == var6.field1367) {
                var6.method2630(arg4);
                break;
            }
        }
    }

    @ObfuscatedName("cp.ju(IIIIIII)V")
    public static void method2020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class397 var6 = field666[arg0][arg1][arg2];
        if (var6 == null) {
            return;
        }
        for (class106 var7 = (class106) var6.method6702(); var7 != null; var7 = (class106) var6.method6684()) {
            if ((arg3 & 0x7FFF) == var7.field1367 && var7.field1370 == arg4) {
                var7.field1370 = arg5;
                break;
            }
        }
        method2023(arg0, arg1, arg2);
    }

    @ObfuscatedName("oq.jd(IIIIIIIIIIIIILdj;B)V")
    public static void method6629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class93 arg13) {
        class204 var14 = class204.method2849(arg6);
        int var15;
        int var16;
        if (arg4 == 1 || arg4 == 3) {
            var15 = var14.field2134;
            var16 = var14.field2133;
        } else {
            var15 = var14.field2133;
            var16 = var14.field2134;
        }
        int var17 = (var15 >> 1) + arg1;
        int var18 = (var15 + 1 >> 1) + arg1;
        int var19 = (var16 >> 1) + arg2;
        int var20 = (var16 + 1 >> 1) + arg2;
        int[][] var21 = class83.field1049[arg0];
        int var22 = var21[var17][var19] + var21[var18][var19] + var21[var17][var20] + var21[var18][var20] >> 2;
        int var23 = (arg1 << 7) + (var15 << 6);
        int var24 = (arg2 << 7) + (var16 << 6);
        class285 var25 = var14.method3595(arg3, arg4, var21, var23, var22, var24);
        if (var25 == null) {
            return;
        }
        method2272(arg0, arg1, arg2, arg5, -1, 0, 0, 31, arg7 + 1, arg8 + 1);
        arg13.field1161 = field536 + arg7;
        arg13.field1144 = field536 + arg8;
        arg13.field1154 = var25;
        arg13.field1145 = arg1 * 128 + var15 * 64;
        arg13.field1147 = arg2 * 128 + var16 * 64;
        arg13.field1146 = var22;
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
        arg13.field1149 = arg1 + arg9;
        arg13.field1151 = arg1 + arg11;
        arg13.field1134 = arg2 + arg10;
        arg13.field1152 = arg2 + arg12;
    }

    @ObfuscatedName("bc.kl(IIIIIIIIIIIIIII)V")
    public static void method805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg1 * 128 + 64;
        int var15 = arg2 * 128 + 64;
        int var16 = arg3 * 128 + 64;
        int var17 = arg4 * 128 + 64;
        class78 var18 = new class78(arg6, arg0, var14, var15, method4842(var14, var15, arg0) - arg7, field536 + arg9, field536 + arg10, arg11, arg12, arg13, arg5, arg8);
        var18.method2118(var16, var17, method4842(var16, var17, arg0) - arg8, field536 + arg9);
        field577.method6678(var18);
    }

    @ObfuscatedName("nl.kv(IIIIIB)V")
    public static void method6324(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class397 var5 = field666[arg0][arg1][arg2];
        if (var5 == null) {
            return;
        }
        for (class106 var6 = (class106) var5.method6702(); var6 != null; var6 = (class106) var5.method6684()) {
            if ((arg3 & 0x7FFF) == var6.field1367 && var6.field1370 == arg4) {
                var6.method7996();
                break;
            }
        }
        if (var5.method6702() == null) {
            field666[arg0][arg1][arg2] = null;
        }
        method2023(arg0, arg1, arg2);
    }

    @ObfuscatedName("fb.ki(IIIIIIIIIZI)V")
    public static void method3066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        class106 var10 = new class106();
        var10.field1367 = arg3;
        var10.field1370 = arg4;
        var10.method2630(arg5);
        if (field666[arg0][arg1][arg2] == null) {
            field666[arg0][arg1][arg2] = new class397();
        }
        field666[arg0][arg1][arg2].method6678(var10);
        method2023(arg0, arg1, arg2);
    }

    @ObfuscatedName("gj.kc(IIIIIIIS)Z")
    public static boolean method3198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class372.field4334.field4332 == arg5) {
            class293 var7 = Statics.field1283.method4932(arg0, arg1, arg2);
            if (var7 != null) {
                int var8 = class286.method1110(var7.field3115);
                if (class359.field3932.field3926 == arg3) {
                    var7.field3116 = new class81(var8, 2, arg4 + 4, arg0, arg1, arg2, arg6, false, var7.field3116);
                    var7.field3114 = new class81(var8, 2, arg4 + 1 & 0x3, arg0, arg1, arg2, arg6, false, var7.field3114);
                } else {
                    var7.field3116 = new class81(var8, arg3, arg4, arg0, arg1, arg2, arg6, false, var7.field3116);
                }
                return true;
            }
        } else if (class372.field4333.field4332 == arg5) {
            class295 var9 = Statics.field1283.method4912(arg0, arg1, arg2);
            if (var9 != null) {
                int var10 = class286.method1110(var9.field3120);
                if (class359.field3933.field3926 == arg3 || class359.field3916.field3926 == arg3) {
                    var9.field3119 = new class81(var10, 4, arg4, arg0, arg1, arg2, arg6, false, var9.field3119);
                } else if (class359.field3928.field3926 == arg3) {
                    var9.field3119 = new class81(var10, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var9.field3119);
                } else if (class359.field3931.field3926 == arg3) {
                    var9.field3119 = new class81(var10, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var9.field3119);
                } else if (class359.field3919.field3926 == arg3) {
                    var9.field3119 = new class81(var10, 4, arg4 + 4, arg0, arg1, arg2, arg6, false, var9.field3119);
                    var9.field3128 = new class81(var10, 4, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg2, arg6, false, var9.field3128);
                }
                return true;
            }
        } else if (class372.field4330.field4332 == arg5) {
            class296 var11 = Statics.field1283.method4913(arg0, arg1, arg2);
            if (class359.field3913.field3926 == arg3) {
                arg3 = class359.field3930.field3926;
            }
            if (var11 != null) {
                var11.field3136 = new class81(class286.method1110(var11.field3144), arg3, arg4, arg0, arg1, arg2, arg6, false, var11.field3136);
                return true;
            }
        } else if (class372.field4331.field4332 == arg5) {
            class268 var12 = Statics.field1283.method4933(arg0, arg1, arg2);
            if (var12 != null) {
                var12.field2762 = new class81(class286.method1110(var12.field2761), 22, arg4, arg0, arg1, arg2, arg6, false, var12.field2762);
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dh.kk(IIIIIIIIIII)V")
    public static final void method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class96 var10 = null;
        for (class96 var11 = (class96) field658.method6702(); var11 != null; var11 = (class96) field658.method6684()) {
            if (var11.field1202 == arg0 && var11.field1194 == arg1 && var11.field1195 == arg2 && var11.field1193 == arg3) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class96();
            var10.field1202 = arg0;
            var10.field1193 = arg3;
            var10.field1194 = arg1;
            var10.field1195 = arg2;
            var10.field1204 = -1;
            method3793(var10);
            field658.method6678(var10);
        }
        var10.field1199 = arg4;
        var10.field1192 = arg5;
        var10.field1200 = arg6;
        var10.field1201 = arg8;
        var10.field1205 = arg9;
        var10.method2341(arg7);
    }

    @ObfuscatedName("tv.ka(IIIIII)Z")
    public static final boolean method8263(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class96 var5 = null;
        for (class96 var6 = (class96) field658.method6702(); var6 != null; var6 = (class96) field658.method6684()) {
            if (var6.field1202 == arg0 && var6.field1194 == arg1 && var6.field1195 == arg2 && var6.field1193 == arg3) {
                var5 = var6;
                break;
            }
        }
        if (var5 == null) {
            return false;
        } else {
            var5.field1204 = arg4;
            return true;
        }
    }

    @ObfuscatedName("iz.kf(B)V")
    public static final void method4101() {
        for (class96 var0 = (class96) field658.method6702(); var0 != null; var0 = (class96) field658.method6684()) {
            if (var0.field1205 == -1) {
                var0.field1201 = 0;
                method3793(var0);
            } else {
                var0.method7996();
            }
        }
    }

    @ObfuscatedName("if.kj(Ldy;I)V")
    public static final void method3793(class96 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1193 == 0) {
            var1 = Statics.field1283.method4915(arg0.field1202, arg0.field1194, arg0.field1195);
        }
        if (arg0.field1193 == 1) {
            var1 = Statics.field1283.method4916(arg0.field1202, arg0.field1194, arg0.field1195);
        }
        if (arg0.field1193 == 2) {
            var1 = Statics.field1283.method4917(arg0.field1202, arg0.field1194, arg0.field1195);
        }
        if (arg0.field1193 == 3) {
            var1 = Statics.field1283.method4918(arg0.field1202, arg0.field1194, arg0.field1195);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1283.method4951(arg0.field1202, arg0.field1194, arg0.field1195, var1);
            var3 = class286.method1110(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1196 = var3;
        arg0.field1197 = var4;
        arg0.field1198 = var5;
    }

    @ObfuscatedName("ci.ko(I)V")
    public static final void method1065() {
        for (class96 var0 = (class96) field658.method6702(); var0 != null; var0 = (class96) field658.method6684()) {
            if (var0.field1205 > 0) {
                var0.field1205--;
            }
            if (var0.field1205 != 0) {
                if (var0.field1201 > 0) {
                    var0.field1201--;
                }
                if (var0.field1201 == 0 && var0.field1194 >= 1 && var0.field1195 >= 1 && var0.field1194 <= 102 && var0.field1195 <= 102 && (var0.field1199 < 0 || class83.method4204(var0.field1199, var0.field1192))) {
                    method7444(var0.field1202, var0.field1193, var0.field1194, var0.field1195, var0.field1199, var0.field1200, var0.field1192, var0.field1204);
                    var0.field1201 = -1;
                    if (var0.field1199 == var0.field1196 && var0.field1196 == -1) {
                        var0.method7996();
                    } else if (var0.field1199 == var0.field1196 && var0.field1200 == var0.field1198 && var0.field1197 == var0.field1192) {
                        var0.method7996();
                    }
                }
            } else if (var0.field1196 < 0 || class83.method4204(var0.field1196, var0.field1197)) {
                method7444(var0.field1202, var0.field1193, var0.field1194, var0.field1195, var0.field1196, var0.field1198, var0.field1197, var0.field1204);
                var0.method7996();
            }
        }
    }

    @ObfuscatedName("qo.kb(IIIIIIIII)V")
    public static final void method7444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field716 && Statics.field4873 != arg0) {
            return;
        }
        long var8 = 0L;
        boolean var10 = true;
        boolean var11 = false;
        boolean var12 = false;
        if (arg1 == 0) {
            var8 = Statics.field1283.method4915(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var8 = Statics.field1283.method4916(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var8 = Statics.field1283.method4917(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var8 = Statics.field1283.method4918(arg0, arg2, arg3);
        }
        if (var8 != 0L) {
            int var13 = Statics.field1283.method4951(arg0, arg2, arg3, var8);
            int var14 = class286.method1110(var8);
            int var15 = var13 & 0x1F;
            int var16 = var13 >> 6 & 0x3;
            class204 var17 = class204.method2849(var14);
            if (var17 != null && var17.method3588()) {
                int var20 = var17.field2133;
                int var21 = var17.field2134;
                if (var16 == 1 || var16 == 3) {
                    var20 = var17.field2134;
                    var21 = var17.field2133;
                }
                int var22 = (arg2 + var20) * 128;
                int var23 = (arg3 + var21) * 128;
                int var24 = arg2 * 128;
                int var25 = arg3 * 128;
                int var26 = var17.field2162;
                int var27 = var17.field2163 * 128;
                int var28 = var17.field2131 * 128;
                if (var17.field2159 != null) {
                    class204 var29 = var17.method3597();
                    if (var29 != null) {
                        var26 = var29.field2162;
                        var27 = var29.field2163 * 128;
                        var28 = var29.field2131 * 128;
                    }
                }
                class71 var10000 = (class71) null;
                for (class71 var30 = (class71) class71.field870.method6702(); var30 != null; var30 = (class71) class71.field870.method6684()) {
                    if (var30.field864 == arg0 && var30.field868 == var24 && var30.field866 == var25 && var30.field867 == var22 && var30.field869 == var23 && var30.field871 == var26 && var30.field873 == var27 && var30.field865 == var28) {
                        if (var30.field872 != null) {
                            Statics.field3083.method659(var30.field872);
                            var30.field872 = null;
                        }
                        if (var30.field877 != null) {
                            Statics.field3083.method659(var30.field877);
                            var30.field877 = null;
                        }
                        var30.method7996();
                        break;
                    }
                    var10000 = (class71) null;
                }
            }
            if (arg1 == 0) {
                Statics.field1283.method4906(arg0, arg2, arg3);
                if (var17.field2135 != 0) {
                    field600[arg0].method4074(arg2, arg3, var15, var16, var17.field2136);
                }
            }
            if (arg1 == 1) {
                Statics.field1283.method4907(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1283.method5017(arg0, arg2, arg3);
                if (var17.field2133 + arg2 > 103 || var17.field2133 + arg3 > 103 || var17.field2134 + arg2 > 103 || var17.field2134 + arg3 > 103) {
                    return;
                }
                if (var17.field2135 != 0) {
                    field600[arg0].method4083(arg2, arg3, var17.field2133, var17.field2134, var16, var17.field2136);
                }
            }
            if (arg1 == 3) {
                Statics.field1283.method4909(arg0, arg2, arg3);
                if (var17.field2135 == 1) {
                    field600[arg0].method4087(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var31 = arg0;
        if (arg0 < 3 && (class83.field1048[1][arg2][arg3] & 0x2) == 2) {
            var31 = arg0 + 1;
        }
        Statics.method1727(arg0, var31, arg2, arg3, arg4, arg5, arg6, arg7, Statics.field1283, field600[arg0]);
        class204 var32 = class204.method2849(arg4);
        if (var32 != null && var32.method3588()) {
            class71.method4622(var31, arg2, arg3, var32, arg5);
        }
    }

    @ObfuscatedName("cc.kw(IIII)V")
    public static void method2023(int arg0, int arg1, int arg2) {
        class397 var3 = field666[arg0][arg1][arg2];
        if (var3 == null) {
            Statics.field1283.method4910(arg0, arg1, arg2);
            return;
        }
        long var4 = -99999999L;
        class106 var6 = null;
        for (class106 var7 = (class106) var3.method6702(); var7 != null; var7 = (class106) var3.method6684()) {
            class205 var8 = class205.method6353(var7.field1367);
            long var9 = (long) var8.field2195;
            if (var8.field2194 == 1) {
                var9 *= var7.field1370 < Integer.MAX_VALUE ? (long) (var7.field1370 + 1) : (long) var7.field1370;
            }
            if (var9 > var4) {
                var4 = var9;
                var6 = var7;
            }
        }
        if (var6 == null) {
            Statics.field1283.method4910(arg0, arg1, arg2);
            return;
        }
        var3.method6686(var6);
        class106 var11 = null;
        class106 var12 = null;
        for (class106 var13 = (class106) var3.method6702(); var13 != null; var13 = (class106) var3.method6684()) {
            if (var6.field1367 != var13.field1367) {
                if (var11 == null) {
                    var11 = var13;
                }
                if (var11.field1367 != var13.field1367 && var12 == null) {
                    var12 = var13;
                }
            }
        }
        long var14 = class286.method248(arg1, arg2, 3, false, 0);
        Statics.field1283.method4936(arg0, arg1, arg2, method4842(arg1 * 128 + 64, arg2 * 128 + 64, arg0), var6, var14, var11, var12);
    }

    @ObfuscatedName("fx.kn(Ldx;B)V")
    public static void method3038(class102 arg0) {
        arg0.field1213 = arg0.field1331.field1986;
        arg0.field1250 = arg0.field1331.field1998;
        arg0.field1215 = arg0.field1331.field1976;
        arg0.field1216 = arg0.field1331.field1977;
        arg0.field1282 = arg0.field1331.field1972;
        arg0.field1218 = arg0.field1331.field1991;
        arg0.field1212 = arg0.field1331.field1973;
        arg0.field1267 = arg0.field1331.field2003;
        arg0.field1214 = arg0.field1331.field1975;
        arg0.field1219 = arg0.field1331.field1980;
        arg0.field1220 = arg0.field1331.field1981;
        arg0.field1221 = arg0.field1331.field1988;
        arg0.field1222 = arg0.field1331.field1983;
        arg0.field1223 = arg0.field1331.field1984;
        arg0.field1217 = arg0.field1331.field1967;
        arg0.field1225 = arg0.field1331.field1985;
        arg0.field1226 = arg0.field1331.field1987;
    }

    @ObfuscatedName("pl.kg(III)Lih;")
    public static class232 method6664(int arg0, int arg1) {
        field802.field2457 = arg0;
        field802.field2458 = arg1;
        field802.field2460 = 1;
        field802.field2459 = 1;
        return field802;
    }

    @ObfuscatedName("jm.ku(I)V")
    public static void method4564() {
        field701 = 0;
        field675 = false;
        field682[0] = class370.field4235;
        field683[0] = "";
        field679[0] = 1006;
        field684[0] = false;
        field701 = 1;
    }

    @ObfuscatedName("ad.kq(IIB)V")
    public static final void method247(int arg0, int arg1) {
        if (field701 < 2 && field749 == 0 && !field694 || !field687) {
            return;
        }
        int var2 = method8271();
        String var3;
        if (field749 == 1 && field701 < 2) {
            var3 = class370.field4173 + class370.field4183 + field823 + " " + class103.field1347;
        } else if (field694 && field701 < 2) {
            var3 = field697 + class370.field4183 + field575 + " " + class103.field1347;
        } else {
            var3 = method783(var2);
        }
        if (field701 > 2) {
            var3 = var3 + class103.method6341(16777215) + " " + '/' + " " + (field701 - 2) + class370.field4281;
        }
        Statics.field1813.method7150(var3, arg0 + 4, arg1 + 15, 16777215, 0, field536 / 1000);
    }

    @ObfuscatedName("gr.kt(B)V")
    public static final void method3195() {
        int var0 = Statics.field2577;
        int var1 = Statics.field410;
        int var2 = Statics.field434;
        int var3 = Statics.field1819;
        int var4 = 6116423;
        class544.method8900(var0, var1, var2, var3, var4);
        class544.method8900(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class544.method8945(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field1813.method7170(class370.field4176, var0 + 3, var1 + 14, var4, -1);
        int var5 = class36.field229;
        int var6 = class36.field230;
        for (int var7 = 0; var7 < field701; var7++) {
            int var8 = (field701 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class413 var10 = Statics.field1813;
            String var11;
            if (var7 < 0) {
                var11 = "";
            } else if (field683[var7].length() > 0) {
                var11 = field682[var7] + class370.field4183 + field683[var7];
            } else {
                var11 = field682[var7];
            }
            var10.method7170(var11, var0 + 3, var8, var9, 0);
        }
        method2642(Statics.field2577, Statics.field410, Statics.field434, Statics.field1819);
    }

    @ObfuscatedName("ss.ky(I)Z")
    public static final boolean method7890() {
        return field675;
    }

    @ObfuscatedName("pe.kx(IIIIB)V")
    public static final void method6658(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field608; var4++) {
            if (field754[var4] + field752[var4] > arg0 && field752[var4] < arg0 + arg2 && field758[var4] + field753[var4] > arg1 && field753[var4] < arg1 + arg3) {
                field817[var4] = true;
            }
        }
    }

    @ObfuscatedName("ee.ks(IIIII)V")
    public static final void method2642(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field608; var4++) {
            if (field754[var4] + field752[var4] > arg0 && field752[var4] < arg0 + arg2 && field758[var4] + field753[var4] > arg1 && field753[var4] < arg1 + arg3) {
                field722[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.ke(I)V")
    public final void method1678() {
        method5466();
        if (field570 != null) {
            return;
        }
        int var1 = class36.field227;
        if (!field675) {
            int var12 = method8271();
            if ((var1 == 1 || !Statics.field5137 && var1 == 4) && this.method1198()) {
                var1 = 2;
            }
            if ((var1 == 1 || !Statics.field5137 && var1 == 4) && field701 > 0) {
                method2923(var12);
            }
            if (var1 == 2 && field701 > 0) {
                this.method1643(class36.field225, class36.field238);
            }
            return;
        }
        if (var1 != 1 && (Statics.field5137 || var1 != 4)) {
            int var2 = class36.field229;
            int var3 = class36.field230;
            if (var2 < Statics.field2577 - 10 || var2 > Statics.field434 + Statics.field2577 + 10 || var3 < Statics.field410 - 10 || var3 > Statics.field410 + Statics.field1819 + 10) {
                field675 = false;
                method6658(Statics.field2577, Statics.field410, Statics.field434, Statics.field1819);
            }
        }
        if (var1 != 1 && Statics.field5137 || var1 != 4) {
            return;
        }
        int var4 = Statics.field2577;
        int var5 = Statics.field410;
        int var6 = Statics.field434;
        int var7 = class36.field225;
        int var8 = class36.field238;
        int var9 = -1;
        for (int var10 = 0; var10 < field701; var10++) {
            int var11 = (field701 - 1 - var10) * 15 + var5 + 31;
            if (var7 > var4 && var7 < var4 + var6 && var8 > var11 - 13 && var8 < var11 + 3) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            method2923(var9);
        }
        field675 = false;
        method6658(Statics.field2577, Statics.field410, Statics.field434, Statics.field1819);
    }

    @ObfuscatedName("client.kd(I)Z")
    public final boolean method1198() {
        int var1 = method8271();
        return (field674 && field701 > 2 || method7714(var1)) && !field684[var1];
    }

    @ObfuscatedName("client.kh(III)V")
    public final void method1643(int arg0, int arg1) {
        int var3 = Statics.field1813.method7128(class370.field4176);
        for (int var4 = 0; var4 < field701; var4++) {
            int var5 = Statics.field1813.method7128(method783(var4));
            if (var5 > var3) {
                var3 = var5;
            }
        }
        var3 += 8;
        int var6 = field701 * 15 + 22;
        int var7 = arg0 - var3 / 2;
        if (var3 + var7 > Statics.field199) {
            var7 = Statics.field199 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg1;
        if (var6 + arg1 > Statics.field2531) {
            var8 = Statics.field2531 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        Statics.field2577 = var7;
        Statics.field410 = var8;
        Statics.field434 = var3;
        Statics.field1819 = field701 * 15 + 22;
        int var9 = arg0 - field830;
        int var10 = arg1 - field812;
        Statics.field1283.method4928(Statics.field4873, var9, var10, false);
        field675 = true;
    }

    @ObfuscatedName("ro.kp(II)Z")
    public static final boolean method7714(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field679[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ez.kz(II)V")
    public static final void method2923(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field677[arg0];
        int var2 = field678[arg0];
        int var3 = field679[arg0];
        int var4 = field649[arg0];
        int var5 = field681[arg0];
        String var6 = field682[arg0];
        String var7 = field683[arg0];
        method656(var1, var2, var3, var4, var5, var6, var7, class36.field225, class36.field238);
    }

    @ObfuscatedName("by.kr(IIIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method656(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, String arg6, int arg7, int arg8) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 1001) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var9 = class313.method5301(class311.field3222, field590.field1435);
            var9.field3291.method8706(Statics.field216 + arg1);
            var9.field3291.method8575(Statics.field1011 + arg0);
            var9.field3291.method8621(field793.method4065(82) ? 1 : 0);
            var9.field3291.method8706(arg3);
            field590.method2741(var9);
        }
        if (arg2 == 58) {
            class350 var10 = Statics.field1071.method5779(arg1, arg0);
            if (var10 != null) {
                if (var10.field3834 != null) {
                    class89 var11 = new class89();
                    var11.field1095 = var10;
                    var11.field1098 = arg3;
                    var11.field1102 = arg6;
                    var11.field1106 = var10.field3834;
                    class72.method3238(var11);
                }
                class313 var12 = class313.method5301(class311.field3231, field590.field1435);
                var12.field3291.method8795(Statics.field1779);
                var12.field3291.method8626(field539);
                var12.field3291.method8706(arg0);
                var12.field3291.method8577(arg1);
                var12.field3291.method8706(field696);
                var12.field3291.method8575(arg4);
                field590.method2741(var12);
            }
        }
        if (arg2 == 22) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var13 = class313.method5301(class311.field3186, field590.field1435);
            var13.field3291.method8658(field793.method4065(82) ? 1 : 0);
            var13.field3291.method8575(Statics.field216 + arg1);
            var13.field3291.method8626(arg3);
            var13.field3291.method8706(Statics.field1011 + arg0);
            field590.method2741(var13);
        }
        if (arg2 == 20) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var14 = class313.method5301(class311.field3242, field590.field1435);
            var14.field3291.method8626(Statics.field216 + arg1);
            var14.field3291.method8575(arg3);
            var14.field3291.method8706(Statics.field1011 + arg0);
            var14.field3291.method8623(field793.method4065(82) ? 1 : 0);
            field590.method2741(var14);
        }
        if (arg2 == 1003) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            class102 var15 = field629[arg3];
            if (var15 != null) {
                class190 var16 = var15.field1331;
                if (var16.field2001 != null) {
                    var16 = var16.method3398();
                }
                if (var16 != null) {
                    class313 var17 = class313.method5301(class311.field3180, field590.field1435);
                    var17.field3291.method8575(var16.field1968);
                    field590.method2741(var17);
                }
            }
        }
        if (arg2 == 3) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var18 = class313.method5301(class311.field3185, field590.field1435);
            var18.field3291.method8575(arg3);
            var18.field3291.method8623(field793.method4065(82) ? 1 : 0);
            var18.field3291.method8626(Statics.field216 + arg1);
            var18.field3291.method8706(Statics.field1011 + arg0);
            field590.method2741(var18);
        }
        if (arg2 == 16) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var19 = class313.method5301(class311.field3259, field590.field1435);
            var19.field3291.method8658(field793.method4065(82) ? 1 : 0);
            var19.field3291.method8626(Statics.field1514);
            var19.field3291.method8643(Statics.field3538);
            var19.field3291.method8666(Statics.field4619);
            var19.field3291.method8706(Statics.field1011 + arg0);
            var19.field3291.method8666(arg3);
            var19.field3291.method8575(Statics.field216 + arg1);
            field590.method2741(var19);
        }
        if (arg2 == 21) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var20 = class313.method5301(class311.field3207, field590.field1435);
            var20.field3291.method8626(arg3);
            var20.field3291.method8575(Statics.field1011 + arg0);
            var20.field3291.method8574(field793.method4065(82) ? 1 : 0);
            var20.field3291.method8575(Statics.field216 + arg1);
            field590.method2741(var20);
        }
        if (arg2 == 30 && field704 == null) {
            method3447(arg1, arg0);
            field704 = Statics.field1071.method5779(arg1, arg0);
            method2816(field704);
        }
        if (arg2 == 4) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var21 = class313.method5301(class311.field3217, field590.field1435);
            var21.field3291.method8623(field793.method4065(82) ? 1 : 0);
            var21.field3291.method8666(Statics.field1011 + arg0);
            var21.field3291.method8666(Statics.field216 + arg1);
            var21.field3291.method8706(arg3);
            field590.method2741(var21);
        }
        if (arg2 == 17) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var22 = class313.method5301(class311.field3254, field590.field1435);
            var22.field3291.method8706(arg3);
            var22.field3291.method8666(Statics.field1011 + arg0);
            var22.field3291.method8626(field696);
            var22.field3291.method8575(Statics.field216 + arg1);
            var22.field3291.method8706(field539);
            var22.field3291.method8646(Statics.field1779);
            var22.field3291.method8621(field793.method4065(82) ? 1 : 0);
            field590.method2741(var22);
        }
        if (arg2 == 15) {
            class93 var23 = field652[arg3];
            if (var23 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var24 = class313.method5301(class311.field3220, field590.field1435);
                var24.field3291.method8646(Statics.field1779);
                var24.field3291.method8621(field793.method4065(82) ? 1 : 0);
                var24.field3291.method8706(field696);
                var24.field3291.method8706(arg3);
                var24.field3291.method8575(field539);
                field590.method2741(var24);
            }
        }
        if (arg2 == 9) {
            class102 var25 = field629[arg3];
            if (var25 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var26 = class313.method5301(class311.field3215, field590.field1435);
                var26.field3291.method8706(arg3);
                var26.field3291.method8623(field793.method4065(82) ? 1 : 0);
                field590.method2741(var26);
            }
        }
        if (arg2 == 6) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var27 = class313.method5301(class311.field3267, field590.field1435);
            var27.field3291.method8666(Statics.field216 + arg1);
            var27.field3291.method8621(field793.method4065(82) ? 1 : 0);
            var27.field3291.method8575(arg3);
            var27.field3291.method8706(Statics.field1011 + arg0);
            field590.method2741(var27);
        }
        if (arg2 == 49) {
            class93 var28 = field652[arg3];
            if (var28 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var29 = class313.method5301(class311.field3248, field590.field1435);
                var29.field3291.method8623(field793.method4065(82) ? 1 : 0);
                var29.field3291.method8626(arg3);
                field590.method2741(var29);
            }
        }
        if (arg2 == 13) {
            class102 var30 = field629[arg3];
            if (var30 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var31 = class313.method5301(class311.field3232, field590.field1435);
                var31.field3291.method8623(field793.method4065(82) ? 1 : 0);
                var31.field3291.method8626(arg3);
                field590.method2741(var31);
            }
        }
        if (arg2 == 1002) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            class313 var32 = class313.method5301(class311.field3189, field590.field1435);
            var32.field3291.method8706(arg3);
            field590.method2741(var32);
        }
        if (arg2 == 1004) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            class313 var33 = class313.method5301(class311.field3271, field590.field1435);
            var33.field3291.method8706(arg3);
            var33.field3291.method8666(Statics.field216 + arg1);
            var33.field3291.method8575(Statics.field1011 + arg0);
            field590.method2741(var33);
        }
        if (arg2 == 23) {
            if (field675) {
                Statics.field1283.method4929();
            } else {
                Statics.field1283.method4928(Statics.field4873, arg0, arg1, true);
            }
        }
        if (arg2 == 48) {
            class93 var34 = field652[arg3];
            if (var34 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var35 = class313.method5301(class311.field3247, field590.field1435);
                var35.field3291.method8626(arg3);
                var35.field3291.method8623(field793.method4065(82) ? 1 : 0);
                field590.method2741(var35);
            }
        }
        if (arg2 == 46) {
            class93 var36 = field652[arg3];
            if (var36 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var37 = class313.method5301(class311.field3219, field590.field1435);
                var37.field3291.method8706(arg3);
                var37.field3291.method8623(field793.method4065(82) ? 1 : 0);
                field590.method2741(var37);
            }
        }
        if (arg2 == 14) {
            class93 var38 = field652[arg3];
            if (var38 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var39 = class313.method5301(class311.field3227, field590.field1435);
                var39.field3291.method8706(arg3);
                var39.field3291.method8643(Statics.field3538);
                var39.field3291.method8626(Statics.field1514);
                var39.field3291.method8666(Statics.field4619);
                var39.field3291.method8658(field793.method4065(82) ? 1 : 0);
                field590.method2741(var39);
            }
        }
        if (arg2 == 7) {
            class102 var40 = field629[arg3];
            if (var40 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var41 = class313.method5301(class311.field3240, field590.field1435);
                var41.field3291.method8623(field793.method4065(82) ? 1 : 0);
                var41.field3291.method8643(Statics.field3538);
                var41.field3291.method8666(arg3);
                var41.field3291.method8666(Statics.field4619);
                var41.field3291.method8626(Statics.field1514);
                field590.method2741(var41);
            }
        }
        if (arg2 == 5) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var42 = class313.method5301(class311.field3265, field590.field1435);
            var42.field3291.method8706(Statics.field1011 + arg0);
            var42.field3291.method8706(Statics.field216 + arg1);
            var42.field3291.method8621(field793.method4065(82) ? 1 : 0);
            var42.field3291.method8666(arg3);
            field590.method2741(var42);
        }
        if (arg2 == 10) {
            class102 var43 = field629[arg3];
            if (var43 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var44 = class313.method5301(class311.field3238, field590.field1435);
                var44.field3291.method8574(field793.method4065(82) ? 1 : 0);
                var44.field3291.method8666(arg3);
                field590.method2741(var44);
            }
        }
        if (arg2 == 47) {
            class93 var45 = field652[arg3];
            if (var45 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var46 = class313.method5301(class311.field3266, field590.field1435);
                var46.field3291.method8575(arg3);
                var46.field3291.method8623(field793.method4065(82) ? 1 : 0);
                field590.method2741(var46);
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class350 var47 = Statics.field1071.method5779(arg1, arg0);
            if (var47 != null) {
                method3354(arg3, arg1, arg0, arg4, arg6);
            }
        }
        if (arg2 == 1) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var48 = class313.method5301(class311.field3193, field590.field1435);
            var48.field3291.method8626(Statics.field1514);
            var48.field3291.method8666(Statics.field216 + arg1);
            var48.field3291.method8666(Statics.field4619);
            var48.field3291.method8621(field793.method4065(82) ? 1 : 0);
            var48.field3291.method8626(Statics.field1011 + arg0);
            var48.field3291.method8575(arg3);
            var48.field3291.method8795(Statics.field3538);
            field590.method2741(var48);
        }
        if (arg2 == 50) {
            class93 var49 = field652[arg3];
            if (var49 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var50 = class313.method5301(class311.field3208, field590.field1435);
                var50.field3291.method8623(field793.method4065(82) ? 1 : 0);
                var50.field3291.method8666(arg3);
                field590.method2741(var50);
            }
        }
        if (arg2 == 45) {
            class93 var51 = field652[arg3];
            if (var51 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var52 = class313.method5301(class311.field3223, field590.field1435);
                var52.field3291.method8626(arg3);
                var52.field3291.method8621(field793.method4065(82) ? 1 : 0);
                field590.method2741(var52);
            }
        }
        if (arg2 == 18) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var53 = class313.method5301(class311.field3221, field590.field1435);
            var53.field3291.method8706(Statics.field1011 + arg0);
            var53.field3291.method8666(Statics.field216 + arg1);
            var53.field3291.method8658(field793.method4065(82) ? 1 : 0);
            var53.field3291.method8575(arg3);
            field590.method2741(var53);
        }
        if (arg2 == 28) {
            class313 var54 = class313.method5301(class311.field3228, field590.field1435);
            var54.field3291.method8577(arg1);
            field590.method2741(var54);
            class350 var55 = Statics.field1071.method5777(arg1);
            if (var55 != null && var55.field3851 != null && var55.field3851[0][0] == 5) {
                int var56 = var55.field3851[0][1];
                class338.field3620[var56] = 1 - class338.field3620[var56];
                method1850(var56);
            }
        }
        if (arg2 == 12) {
            class102 var57 = field629[arg3];
            if (var57 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var58 = class313.method5301(class311.field3203, field590.field1435);
                var58.field3291.method8666(arg3);
                var58.field3291.method8574(field793.method4065(82) ? 1 : 0);
                field590.method2741(var58);
            }
        }
        if (arg2 == 26) {
            method4841();
        }
        if (arg2 == 19) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var59 = class313.method5301(class311.field3251, field590.field1435);
            var59.field3291.method8574(field793.method4065(82) ? 1 : 0);
            var59.field3291.method8626(arg3);
            var59.field3291.method8626(Statics.field216 + arg1);
            var59.field3291.method8575(Statics.field1011 + arg0);
            field590.method2741(var59);
        }
        if (arg2 == 11) {
            class102 var60 = field629[arg3];
            if (var60 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var61 = class313.method5301(class311.field3224, field590.field1435);
                var61.field3291.method8621(field793.method4065(82) ? 1 : 0);
                var61.field3291.method8706(arg3);
                field590.method2741(var61);
            }
        }
        if (arg2 == 51) {
            class93 var62 = field652[arg3];
            if (var62 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var63 = class313.method5301(class311.field3210, field590.field1435);
                var63.field3291.method8621(field793.method4065(82) ? 1 : 0);
                var63.field3291.method8706(arg3);
                field590.method2741(var63);
            }
        }
        if (arg2 == 25) {
            class350 var64 = Statics.field1071.method5779(arg1, arg0);
            if (var64 != null) {
                method5375();
                method3487(arg1, arg0, class351.method5135(method7342(var64)), arg4);
                field749 = 0;
                field697 = method2830(var64);
                if (field697 == null) {
                    field697 = class370.field4015;
                }
                if (var64.field3724) {
                    field575 = var64.field3806 + class103.method6341(16777215);
                } else {
                    field575 = class103.method6341(65280) + var64.field3786 + class103.method6341(16777215);
                }
            }
            return;
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field1053.method8133(arg2, arg3, new class339(arg0), new class339(arg1));
        }
        if (arg2 == 24) {
            class350 var65 = Statics.field1071.method5777(arg1);
            if (var65 != null) {
                boolean var66 = true;
                if (var65.field3798 > 0) {
                    var66 = method780(var65);
                }
                if (var66) {
                    class313 var67 = class313.method5301(class311.field3228, field590.field1435);
                    var67.field3291.method8577(arg1);
                    field590.method2741(var67);
                }
            }
        }
        if (arg2 == 29) {
            class313 var68 = class313.method5301(class311.field3228, field590.field1435);
            var68.field3291.method8577(arg1);
            field590.method2741(var68);
            class350 var69 = Statics.field1071.method5777(arg1);
            if (var69 != null && var69.field3851 != null && var69.field3851[0][0] == 5) {
                int var70 = var69.field3851[0][1];
                if (class338.field3620[var70] != var69.field3853[0]) {
                    class338.field3620[var70] = var69.field3853[0];
                    method1850(var70);
                }
            }
        }
        if (arg2 == 44) {
            class93 var71 = field652[arg3];
            if (var71 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var72 = class313.method5301(class311.field3212, field590.field1435);
                var72.field3291.method8574(field793.method4065(82) ? 1 : 0);
                var72.field3291.method8626(arg3);
                field590.method2741(var72);
            }
        }
        if (arg2 == 2) {
            field645 = arg7;
            field646 = arg8;
            field648 = 2;
            field750 = 0;
            field778 = arg0;
            field779 = arg1;
            class313 var73 = class313.method5301(class311.field3263, field590.field1435);
            var73.field3291.method8795(Statics.field1779);
            var73.field3291.method8706(arg3);
            var73.field3291.method8575(field696);
            var73.field3291.method8626(Statics.field216 + arg1);
            var73.field3291.method8575(field539);
            var73.field3291.method8706(Statics.field1011 + arg0);
            var73.field3291.method8574(field793.method4065(82) ? 1 : 0);
            field590.method2741(var73);
        }
        if (arg2 == 8) {
            class102 var74 = field629[arg3];
            if (var74 != null) {
                field645 = arg7;
                field646 = arg8;
                field648 = 2;
                field750 = 0;
                field778 = arg0;
                field779 = arg1;
                class313 var75 = class313.method5301(class311.field3239, field590.field1435);
                var75.field3291.method8577(Statics.field1779);
                var75.field3291.method8658(field793.method4065(82) ? 1 : 0);
                var75.field3291.method8706(arg3);
                var75.field3291.method8706(field696);
                var75.field3291.method8706(field539);
                field590.method2741(var75);
            }
        }
        if (field749 != 0) {
            field749 = 0;
            method2816(Statics.field1071.method5777(Statics.field3538));
        }
        if (field694) {
            method5375();
        }
    }

    @ObfuscatedName("dk.lr(ILjava/lang/String;I)V")
    public static void method2216(int arg0, String arg1) {
        int var2 = class109.field1381;
        int[] var3 = class109.field1376;
        boolean var4 = false;
        class557 var5 = new class557(arg1, Statics.field4750);
        for (int var6 = 0; var6 < var2; var6++) {
            class93 var7 = field652[var3[var6]];
            if (var7 != null && Statics.field1858 != var7 && var7.field1162 != null && var7.field1162.equals(var5)) {
                if (arg0 == 1) {
                    class313 var8 = class313.method5301(class311.field3212, field590.field1435);
                    var8.field3291.method8574(0);
                    var8.field3291.method8626(var3[var6]);
                    field590.method2741(var8);
                } else if (arg0 == 4) {
                    class313 var9 = class313.method5301(class311.field3266, field590.field1435);
                    var9.field3291.method8575(var3[var6]);
                    var9.field3291.method8623(0);
                    field590.method2741(var9);
                } else if (arg0 == 6) {
                    class313 var10 = class313.method5301(class311.field3248, field590.field1435);
                    var10.field3291.method8623(0);
                    var10.field3291.method8626(var3[var6]);
                    field590.method2741(var10);
                } else if (arg0 == 7) {
                    class313 var11 = class313.method5301(class311.field3208, field590.field1435);
                    var11.field3291.method8623(0);
                    var11.field3291.method8666(var3[var6]);
                    field590.method2741(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class112.method3792(4, "", class370.field4130 + arg1);
        }
    }

    @ObfuscatedName("hc.lk(IIIIB)V")
    public static void method3487(int arg0, int arg1, int arg2, int arg3) {
        class350 var4 = Statics.field1071.method5779(arg0, arg1);
        if (var4 != null && var4.field3824 != null) {
            class89 var5 = new class89();
            var5.field1095 = var4;
            var5.field1106 = var4.field3824;
            class72.method3238(var5);
        }
        field696 = arg3;
        field694 = true;
        Statics.field1779 = arg0;
        field539 = arg1;
        Statics.field1521 = arg2;
        method2816(var4);
    }

    @ObfuscatedName("la.lp(I)V")
    public static void method5375() {
        if (!field694) {
            return;
        }
        class350 var0 = Statics.field1071.method5779(Statics.field1779, field539);
        if (var0 != null && var0.field3859 != null) {
            class89 var1 = new class89();
            var1.field1095 = var0;
            var1.field1106 = var0.field3859;
            class72.method3238(var1);
        }
        field696 = -1;
        field694 = false;
        method2816(var0);
    }

    @ObfuscatedName("hl.le(III)V")
    public static void method3447(int arg0, int arg1) {
        class313 var2 = class313.method5301(class311.field3252, field590.field1435);
        var2.field3291.method8706(arg1);
        var2.field3291.method8643(arg0);
        field590.method2741(var2);
    }

    @ObfuscatedName("hq.lm(IIIILjava/lang/String;B)V")
    public static void method3354(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class350 var5 = Statics.field1071.method5779(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3833 != null) {
            class89 var6 = new class89();
            var6.field1095 = var5;
            var6.field1098 = arg0;
            var6.field1102 = arg4;
            var6.field1106 = var5.field3833;
            class72.method3238(var6);
        }
        boolean var7 = true;
        if (var5.field3798 > 0) {
            var7 = method780(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method7342(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class313 var11 = class313.method5301(class311.field3198, field590.field1435);
            var11.field3291.method8577(arg1);
            var11.field3291.method8575(arg2);
            var11.field3291.method8575(arg3);
            field590.method2741(var11);
        }
        if (arg0 == 2) {
            class313 var12 = class313.method5301(class311.field3182, field590.field1435);
            var12.field3291.method8577(arg1);
            var12.field3291.method8575(arg2);
            var12.field3291.method8575(arg3);
            field590.method2741(var12);
        }
        if (arg0 == 3) {
            class313 var13 = class313.method5301(class311.field3255, field590.field1435);
            var13.field3291.method8577(arg1);
            var13.field3291.method8575(arg2);
            var13.field3291.method8575(arg3);
            field590.method2741(var13);
        }
        if (arg0 == 4) {
            class313 var14 = class313.method5301(class311.field3269, field590.field1435);
            var14.field3291.method8577(arg1);
            var14.field3291.method8575(arg2);
            var14.field3291.method8575(arg3);
            field590.method2741(var14);
        }
        if (arg0 == 5) {
            class313 var15 = class313.method5301(class311.field3201, field590.field1435);
            var15.field3291.method8577(arg1);
            var15.field3291.method8575(arg2);
            var15.field3291.method8575(arg3);
            field590.method2741(var15);
        }
        if (arg0 == 6) {
            class313 var16 = class313.method5301(class311.field3209, field590.field1435);
            var16.field3291.method8577(arg1);
            var16.field3291.method8575(arg2);
            var16.field3291.method8575(arg3);
            field590.method2741(var16);
        }
        if (arg0 == 7) {
            class313 var17 = class313.method5301(class311.field3197, field590.field1435);
            var17.field3291.method8577(arg1);
            var17.field3291.method8575(arg2);
            var17.field3291.method8575(arg3);
            field590.method2741(var17);
        }
        if (arg0 == 8) {
            class313 var18 = class313.method5301(class311.field3187, field590.field1435);
            var18.field3291.method8577(arg1);
            var18.field3291.method8575(arg2);
            var18.field3291.method8575(arg3);
            field590.method2741(var18);
        }
        if (arg0 == 9) {
            class313 var19 = class313.method5301(class311.field3233, field590.field1435);
            var19.field3291.method8577(arg1);
            var19.field3291.method8575(arg2);
            var19.field3291.method8575(arg3);
            field590.method2741(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class313 var20 = class313.method5301(class311.field3211, field590.field1435);
        var20.field3291.method8577(arg1);
        var20.field3291.method8575(arg2);
        var20.field3291.method8575(arg3);
        field590.method2741(var20);
    }

    @ObfuscatedName("mb.lv(I)V")
    public static final void method5466() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field701 - 1; var1++) {
                if (field679[var1] < 1000 && field679[var1 + 1] > 1000) {
                    String var2 = field683[var1];
                    field683[var1] = field683[var1 + 1];
                    field683[var1 + 1] = var2;
                    String var3 = field682[var1];
                    field682[var1] = field682[var1 + 1];
                    field682[var1 + 1] = var3;
                    int var4 = field679[var1];
                    field679[var1] = field679[var1 + 1];
                    field679[var1 + 1] = var4;
                    int var5 = field677[var1];
                    field677[var1] = field677[var1 + 1];
                    field677[var1 + 1] = var5;
                    int var6 = field678[var1];
                    field678[var1] = field678[var1 + 1];
                    field678[var1 + 1] = var6;
                    int var7 = field649[var1];
                    field649[var1] = field649[var1 + 1];
                    field649[var1 + 1] = var7;
                    int var8 = field681[var1];
                    field681[var1] = field681[var1 + 1];
                    field681[var1 + 1] = var8;
                    boolean var9 = field684[var1];
                    field684[var1] = field684[var1 + 1];
                    field684[var1 + 1] = var9;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("eb.lf(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2788(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method4519(arg0, arg1, arg2, arg3, arg4, arg5, -1, false);
    }

    @ObfuscatedName("ee.lo(Ljava/lang/String;Ljava/lang/String;IIIIII)V")
    public static final void method2643(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        method4519(arg0, arg1, arg2, arg3, arg4, arg5, arg6, false);
    }

    @ObfuscatedName("jl.lc(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V")
    public static final void method4519(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        if (field675 || field701 >= 500) {
            return;
        }
        field682[field701] = arg0;
        field683[field701] = arg1;
        field679[field701] = arg2;
        field649[field701] = arg3;
        field677[field701] = arg4;
        field678[field701] = arg5;
        field681[field701] = arg6;
        field684[field701] = arg7;
        field701++;
    }

    @ObfuscatedName("tu.la(I)I")
    public static final int method8271() {
        return field701 - 1;
    }

    @ObfuscatedName("be.lj(II)Ljava/lang/String;")
    public static String method783(int arg0) {
        if (arg0 < 0) {
            return "";
        } else if (field683[arg0].length() > 0) {
            return field682[arg0] + class370.field4183 + field683[arg0];
        } else {
            return field682[arg0];
        }
    }

    @ObfuscatedName("ia.lg(IIIII)V")
    public static final void method4010(int arg0, int arg1, int arg2, int arg3) {
        if (field749 == 0 && !field694) {
            method2788(class370.field4178, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class286.method2130(); var8++) {
            long var9 = class286.method3482(var8);
            if (var6 != var9) {
                var6 = var9;
                int var11 = class286.method2247(var8);
                int var12 = class286.method6336(var8);
                int var13 = class286.method4554(var8);
                int var14 = class286.method1110(class286.field3061[var8]);
                int var15 = var14;
                if (var13 == 2 && Statics.field1283.method4951(Statics.field4873, var11, var12, var9) >= 0) {
                    class204 var16 = class204.method2849(var14);
                    if (var16.field2159 != null) {
                        var16 = var16.method3597();
                    }
                    if (var16 == null) {
                        continue;
                    }
                    class96 var17 = null;
                    for (class96 var18 = (class96) field658.method6702(); var18 != null; var18 = (class96) field658.method6684()) {
                        if (Statics.field4873 == var18.field1202 && var18.field1194 == var11 && var18.field1195 == var12 && var18.field1199 == var15) {
                            var17 = var18;
                            break;
                        }
                    }
                    if (field749 == 1) {
                        method2788(class370.field4173, field823 + " " + class103.field1347 + " " + class103.method6341(65535) + var16.field2139, 1, var15, var11, var12);
                    } else if (!field694) {
                        String[] var19 = var16.field2116;
                        if (var19 != null) {
                            for (int var20 = 4; var20 >= 0; var20--) {
                                if ((var17 == null || var17.method2346(var20)) && var19[var20] != null) {
                                    short var21 = 0;
                                    if (var20 == 0) {
                                        var21 = 3;
                                    }
                                    if (var20 == 1) {
                                        var21 = 4;
                                    }
                                    if (var20 == 2) {
                                        var21 = 5;
                                    }
                                    if (var20 == 3) {
                                        var21 = 6;
                                    }
                                    if (var20 == 4) {
                                        var21 = 1001;
                                    }
                                    method2788(var19[var20], class103.method6341(65535) + var16.field2139, var21, var15, var11, var12);
                                }
                            }
                        }
                        method2788(class370.field4246, class103.method6341(65535) + var16.field2139, 1002, var16.field2128, var11, var12);
                    } else if ((Statics.field1521 & 0x4) == 4) {
                        method2788(field697, field575 + " " + class103.field1347 + " " + class103.method6341(65535) + var16.field2139, 2, var15, var11, var12);
                    }
                }
                if (var13 == 1) {
                    class102 var22 = field629[var15];
                    if (var22 == null) {
                        continue;
                    }
                    if (var22.field1331.field1986 == 1 && (var22.field1208 & 0x7F) == 64 && (var22.field1253 & 0x7F) == 64) {
                        for (int var23 = 0; var23 < field572; var23++) {
                            class102 var24 = field629[field587[var23]];
                            if (var24 != null && var22 != var24 && var24.field1331.field1986 == 1 && var22.field1208 == var24.field1208 && var22.field1253 == var24.field1253) {
                                method4879(var24, field587[var23], var11, var12);
                            }
                        }
                        int var25 = class109.field1381;
                        int[] var26 = class109.field1376;
                        for (int var27 = 0; var27 < var25; var27++) {
                            class93 var28 = field652[var26[var27]];
                            if (var28 != null && var22.field1208 == var28.field1208 && var22.field1253 == var28.field1253) {
                                method3900(var28, var26[var27], var11, var12);
                            }
                        }
                    }
                    method4879(var22, var15, var11, var12);
                }
                if (var13 == 0) {
                    class93 var29 = field652[var15];
                    if (var29 == null) {
                        continue;
                    }
                    if ((var29.field1208 & 0x7F) == 64 && (var29.field1253 & 0x7F) == 64) {
                        for (int var30 = 0; var30 < field572; var30++) {
                            class102 var31 = field629[field587[var30]];
                            if (var31 != null && var31.field1331.field1986 == 1 && var29.field1208 == var31.field1208 && var29.field1253 == var31.field1253) {
                                method4879(var31, field587[var30], var11, var12);
                            }
                        }
                        int var32 = class109.field1381;
                        int[] var33 = class109.field1376;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class93 var35 = field652[var33[var34]];
                            if (var35 != null && var29 != var35 && var29.field1208 == var35.field1208 && var29.field1253 == var35.field1253) {
                                method3900(var35, var33[var34], var11, var12);
                            }
                        }
                    }
                    if (field665 == var15) {
                        var4 = var9;
                    } else {
                        method3900(var29, var15, var11, var12);
                    }
                }
                if (var13 == 3) {
                    class397 var36 = field666[Statics.field4873][var11][var12];
                    if (var36 != null) {
                        for (class106 var37 = (class106) var36.method6695(); var37 != null; var37 = (class106) var36.method6685()) {
                            class205 var38 = class205.method6353(var37.field1367);
                            if (field749 == 1) {
                                method2788(class370.field4173, field823 + " " + class103.field1347 + " " + class103.method6341(16748608) + var38.field2210, 16, var37.field1367, var11, var12);
                            } else if (!field694) {
                                String[] var39 = var38.field2200;
                                for (int var40 = 4; var40 >= 0; var40--) {
                                    if (var37.method2631(var40)) {
                                        if (var39 != null && var39[var40] != null) {
                                            byte var41 = 0;
                                            if (var40 == 0) {
                                                var41 = 18;
                                            }
                                            if (var40 == 1) {
                                                var41 = 19;
                                            }
                                            if (var40 == 2) {
                                                var41 = 20;
                                            }
                                            if (var40 == 3) {
                                                var41 = 21;
                                            }
                                            if (var40 == 4) {
                                                var41 = 22;
                                            }
                                            method2788(var39[var40], class103.method6341(16748608) + var38.field2210, var41, var37.field1367, var11, var12);
                                        } else if (var40 == 2) {
                                            method2788(class370.field4008, class103.method6341(16748608) + var38.field2210, 20, var37.field1367, var11, var12);
                                        }
                                    }
                                }
                                method2788(class370.field4246, class103.method6341(16748608) + var38.field2210, 1004, var37.field1367, var11, var12);
                            } else if ((Statics.field1521 & 0x1) == 1) {
                                method2788(field697, field575 + " " + class103.field1347 + " " + class103.method6341(16748608) + var38.field2210, 17, var37.field1367, var11, var12);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var42 = class286.method6573(var4);
            int var43 = class286.method782(var4);
            class93 var44 = field652[field665];
            method3900(var44, field665, var42, var43);
        }
    }

    @ObfuscatedName("ku.ln(Ldx;IIII)V")
    public static final void method4879(class102 arg0, int arg1, int arg2, int arg3) {
        class190 var4 = arg0.field1331;
        if (field701 >= 400) {
            return;
        }
        if (var4.field2001 != null) {
            var4 = var4.method3398();
        }
        if (var4 == null || !var4.field2004 || var4.field2006 && field708 != arg1) {
            return;
        }
        String var5 = arg0.method2550();
        if (var4.field1994 != 0 && arg0.field1271 != 0) {
            int var6 = arg0.field1271 == -1 ? var4.field1994 : arg0.field1271;
            int var8 = Statics.field1858.field1140;
            int var9 = var8 - var6;
            String var10;
            if (var9 < -9) {
                var10 = class103.method6341(16711680);
            } else if (var9 < -6) {
                var10 = class103.method6341(16723968);
            } else if (var9 < -3) {
                var10 = class103.method6341(16740352);
            } else if (var9 < 0) {
                var10 = class103.method6341(16756736);
            } else if (var9 > 9) {
                var10 = class103.method6341(65280);
            } else if (var9 > 6) {
                var10 = class103.method6341(4259584);
            } else if (var9 > 3) {
                var10 = class103.method6341(8453888);
            } else if (var9 > 0) {
                var10 = class103.method6341(12648192);
            } else {
                var10 = class103.method6341(16776960);
            }
            var5 = var5 + var10 + " " + class103.field1345 + class370.field4179 + var6 + class103.field1346;
        }
        if (var4.field2007 && field685) {
            method2788(class370.field4246, class103.method6341(16776960) + var5, 1003, arg1, arg2, arg3);
        }
        if (field749 == 1) {
            method2788(class370.field4173, field823 + " " + class103.field1347 + " " + class103.method6341(16776960) + var5, 7, arg1, arg2, arg3);
        } else if (!field694) {
            int var11 = var4.field2007 && field685 ? 2000 : 0;
            String[] var12 = var4.field1992;
            if (var12 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (arg0.method2545(var13) && var12[var13] != null && !var12[var13].equalsIgnoreCase(class370.field4175)) {
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
                        method2788(var12[var13], class103.method6341(16776960) + var5, var14, arg1, arg2, arg3);
                    }
                }
            }
            if (var12 != null) {
                for (int var15 = 4; var15 >= 0; var15--) {
                    if (arg0.method2545(var15) && var12[var15] != null && var12[var15].equalsIgnoreCase(class370.field4175)) {
                        short var16 = 0;
                        if (field552 != class105.field1362) {
                            if (field552 == class105.field1360 || field552 == class105.field1359 && var4.field1994 > Statics.field1858.field1140) {
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
                            method2788(var12[var15], class103.method6341(16776960) + var5, var17, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!var4.field2007 || !field685) {
                method2788(class370.field4246, class103.method6341(16776960) + var5, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field1521 & 0x2) == 2) {
            method2788(field697, field575 + " " + class103.field1347 + " " + class103.method6341(16776960) + var5, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("io.lx(Ldj;IIII)V")
    public static final void method3900(class93 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1858 == arg0 || field701 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1141 == 0) {
            String var4 = arg0.field1139[0] + arg0.field1162 + arg0.field1139[1];
            int var5 = arg0.field1140;
            int var6 = Statics.field1858.field1140;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class103.method6341(16711680);
            } else if (var7 < -6) {
                var8 = class103.method6341(16723968);
            } else if (var7 < -3) {
                var8 = class103.method6341(16740352);
            } else if (var7 < 0) {
                var8 = class103.method6341(16756736);
            } else if (var7 > 9) {
                var8 = class103.method6341(65280);
            } else if (var7 > 6) {
                var8 = class103.method6341(4259584);
            } else if (var7 > 3) {
                var8 = class103.method6341(8453888);
            } else if (var7 > 0) {
                var8 = class103.method6341(12648192);
            } else {
                var8 = class103.method6341(16776960);
            }
            var9 = var4 + var8 + " " + class103.field1345 + class370.field4179 + arg0.field1140 + class103.field1346 + arg0.field1139[2];
        } else {
            var9 = arg0.field1139[0] + arg0.field1162 + arg0.field1139[1] + " " + class103.field1345 + class370.field4030 + arg0.field1141 + class103.field1346 + arg0.field1139[2];
        }
        if (field749 == 1) {
            method2788(class370.field4173, field823 + " " + class103.field1347 + " " + class103.method6341(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field694) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field762[var10] != null) {
                    short var11 = 0;
                    if (field762[var10].equalsIgnoreCase(class370.field4175)) {
                        if (field551 == class105.field1362) {
                            continue;
                        }
                        if (field551 == class105.field1360 || field551 == class105.field1359 && arg0.field1140 > Statics.field1858.field1140) {
                            var11 = 2000;
                        }
                        if (Statics.field1858.field1163 == 0 || arg0.field1163 == 0) {
                            if (field551 == class105.field1363 && arg0.method2307()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field1858.field1163 == arg0.field1163) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field663[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field711[var10] + var11;
                    method2788(field762[var10], class103.method6341(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1521 & 0x8) == 8) {
            method2788(field697, field575 + " " + class103.field1347 + " " + class103.method6341(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field701; var14++) {
            if (field679[var14] == 23) {
                field683[var14] = class103.method6341(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("iw.lw(IIIIIIIII)V")
    public static final void method4056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (Statics.field1071.method5783(arg0)) {
            Statics.field3106 = null;
            method2921(Statics.field1071.field3634[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field3106 != null) {
                method2921(Statics.field3106, -1412584499, arg1, arg2, arg3, arg4, Statics.field1355, Statics.field3112, arg7);
                Statics.field3106 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field817[var8] = true;
            }
        } else {
            field817[arg7] = true;
        }
    }

    @ObfuscatedName("ez.ls([Lng;IIIIIIIII)V")
    public static final void method2921(class350[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class544.method8892(arg2, arg3, arg4, arg5);
        class272.method4761();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class350 var10 = arg0[var9];
            if (var10 != null && (var10.field3772 == arg1 || arg1 == -1412584499 && field570 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field752[field608] = var10.field3739 + arg6;
                    field753[field608] = var10.field3869 + arg7;
                    field754[field608] = var10.field3741;
                    field758[field608] = var10.field3742;
                    var11 = ++field608 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field3874 = var11;
                var10.field3830 = field536;
                if (!var10.field3724 || !method748(var10)) {
                    if (var10.field3798 > 0) {
                        method1132(var10);
                    }
                    int var12 = var10.field3739 + arg6;
                    int var13 = var10.field3869 + arg7;
                    int var14 = var10.field3757;
                    if (field570 == var10) {
                        if (arg1 != -1412584499 && !var10.field3850) {
                            Statics.field3106 = arg0;
                            Statics.field1355 = arg6;
                            Statics.field3112 = arg7;
                            continue;
                        }
                        if (field693 && field747) {
                            int var15 = class36.field229;
                            int var16 = class36.field230;
                            int var17 = var15 - field792;
                            int var18 = var16 - field818;
                            if (var17 < field766) {
                                var17 = field766;
                            }
                            if (var10.field3741 + var17 > field766 + field712.field3741) {
                                var17 = field766 + field712.field3741 - var10.field3741;
                            }
                            if (var18 < field775) {
                                var18 = field775;
                            }
                            if (var10.field3742 + var18 > field775 + field712.field3742) {
                                var18 = field775 + field712.field3742 - var10.field3742;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3850) {
                            var14 = 128;
                        }
                    }
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    if (var10.field3735 == 9) {
                        int var19 = var12;
                        int var20 = var13;
                        int var21 = var10.field3741 + var12;
                        int var22 = var10.field3742 + var13;
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
                        int var29 = var10.field3741 + var12;
                        int var30 = var10.field3742 + var13;
                        var25 = var12 > arg2 ? var12 : arg2;
                        var26 = var13 > arg3 ? var13 : arg3;
                        var27 = var29 < arg4 ? var29 : arg4;
                        var28 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field3724 || var25 < var27 && var26 < var28) {
                        if (var10.field3798 != 0) {
                            if (var10.field3798 == 1336) {
                                if (Statics.field156.method2520()) {
                                    var13 += 15;
                                    Statics.field1655.method7164("Fps:" + field188, var10.field3741 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field716) {
                                        var33 = 16711680;
                                    }
                                    Statics.field1655.method7164("Mem:" + var32 + "k", var10.field3741 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field3798 == 1337) {
                                field688 = var12;
                                field715 = var13;
                                method6335(var12, var13, var10.field3741, var10.field3742);
                                field817[var10.field3874] = true;
                                class544.method8892(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3798 == 1338) {
                                Statics.method2263(var10, var12, var13, var11);
                                class544.method8892(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3798 == 1339) {
                                Statics.method6563(var10, var12, var13, var11);
                                class544.method8892(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field3798 == 1400) {
                                Statics.field1053.method8058(var12, var13, var10.field3741, var10.field3742, field536, Statics.field156.method2425());
                            }
                            if (var10.field3798 == 1401) {
                                Statics.field1053.method8081(var12, var13, var10.field3741, var10.field3742);
                            }
                            if (var10.field3798 == 1402) {
                                Statics.field3545.method2396(var12, field536);
                            }
                        }
                        if (var10.field3735 == 0) {
                            if (!var10.field3724 && method748(var10) && Statics.field1615 != var10) {
                                continue;
                            }
                            if (!var10.field3724) {
                                if (var10.field3828 > var10.field3750 - var10.field3742) {
                                    var10.field3828 = var10.field3750 - var10.field3742;
                                }
                                if (var10.field3828 < 0) {
                                    var10.field3828 = 0;
                                }
                            }
                            method2921(arg0, var10.field3725, var25, var26, var27, var28, var12 - var10.field3747, var13 - var10.field3828, var11);
                            if (var10.field3863 != null) {
                                method2921(var10.field3863, var10.field3725, var25, var26, var27, var28, var12 - var10.field3747, var13 - var10.field3828, var11);
                            }
                            class88 var34 = (class88) field727.method8322((long) var10.field3725);
                            if (var34 != null) {
                                method4056(var34.field1090, var25, var26, var27, var28, var12, var13, var11);
                            }
                            class544.method8892(arg2, arg3, arg4, arg5);
                            class272.method4761();
                        } else if (var10.field3735 == 11) {
                            if (method748(var10) && Statics.field1615 != var10) {
                                continue;
                            }
                            if (var10.field3863 != null) {
                                method2921(var10.field3863, var10.field3725, var25, var26, var27, var28, var12 - var10.field3747, var13 - var10.field3828, var11);
                            }
                            class544.method8892(arg2, arg3, arg4, arg5);
                            class272.method4761();
                        }
                        if (field695 || field571[var11] || field756 > 1) {
                            if (var10.field3735 == 0 && !var10.field3724 && var10.field3750 > var10.field3742) {
                                method3197(var10.field3741 + var12, var13, var10.field3828, var10.field3742, var10.field3750);
                            }
                            if (var10.field3735 != 1) {
                                if (var10.field3735 == 3) {
                                    int var35;
                                    if (method5794(var10)) {
                                        var35 = var10.field3752;
                                        if (Statics.field1615 == var10 && var10.field3744 != 0) {
                                            var35 = var10.field3744;
                                        }
                                    } else {
                                        var35 = var10.field3751;
                                        if (Statics.field1615 == var10 && var10.field3753 != 0) {
                                            var35 = var10.field3753;
                                        }
                                    }
                                    if (var10.field3755) {
                                        switch(var10.field3846.field5287) {
                                            case 1:
                                                class544.method8901(var12, var13, var10.field3741, var10.field3742, var10.field3751, var10.field3752);
                                                break;
                                            case 2:
                                                class544.method8959(var12, var13, var10.field3741, var10.field3742, var10.field3751, var10.field3752, 255 - (var10.field3757 & 0xFF), 255 - (var10.field3789 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class544.method8900(var12, var13, var10.field3741, var10.field3742, var35);
                                                } else {
                                                    class544.method8899(var12, var13, var10.field3741, var10.field3742, var35, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class544.method8945(var12, var13, var10.field3741, var10.field3742, var35);
                                    } else {
                                        class544.method8905(var12, var13, var10.field3741, var10.field3742, var35, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field3735 == 4) {
                                    class413 var36 = var10.method6145(Statics.field1071);
                                    if (var36 != null) {
                                        String var37 = var10.field3802;
                                        int var38;
                                        if (method5794(var10)) {
                                            var38 = var10.field3752;
                                            if (Statics.field1615 == var10 && var10.field3744 != 0) {
                                                var38 = var10.field3744;
                                            }
                                            if (var10.field3790.length() > 0) {
                                                var37 = var10.field3790;
                                            }
                                        } else {
                                            var38 = var10.field3751;
                                            if (Statics.field1615 == var10 && var10.field3753 != 0) {
                                                var38 = var10.field3753;
                                            }
                                        }
                                        if (var10.field3724 && var10.field3728 != -1) {
                                            class205 var39 = class205.method6353(var10.field3728);
                                            var37 = var39.field2210;
                                            if (var37 == null) {
                                                var37 = class370.field4015;
                                            }
                                            if ((var39.field2194 == 1 || var10.field3721 != 1) && var10.field3721 != -1) {
                                                var37 = class103.method6341(16748608) + var37 + class103.field1349 + " " + 'x' + method2847(var10.field3721);
                                            }
                                        }
                                        if (field704 == var10) {
                                            var37 = class370.field4220;
                                            var38 = var10.field3751;
                                        }
                                        if (!var10.field3724) {
                                            var37 = method150(var37, var10);
                                        }
                                        var36.method7156(var37, var12, var13, var10.field3741, var10.field3742, var38, var10.field3794 ? 0 : -1, class486.method7983(var10.field3757), var10.field3792, var10.field3793, var10.field3791);
                                    } else if (class350.field3723) {
                                        method2816(var10);
                                    }
                                } else if (var10.field3735 == 5) {
                                    if (var10.field3724) {
                                        class548 var41;
                                        if (var10.field3728 == -1) {
                                            var41 = var10.method6262(Statics.field1071, false, Statics.field1838);
                                        } else {
                                            var41 = class205.method2606(var10.field3728, var10.field3721, var10.field3766, var10.field3767, var10.field3787, false);
                                        }
                                        if (var41 != null) {
                                            int var42 = var41.field5297;
                                            int var43 = var41.field5302;
                                            if (var10.field3765) {
                                                class544.method8919(var12, var13, var10.field3741 + var12, var10.field3742 + var13);
                                                int var44 = (var10.field3741 + (var42 - 1)) / var42;
                                                int var45 = (var10.field3742 + (var43 - 1)) / var43;
                                                for (int var46 = 0; var46 < var44; var46++) {
                                                    for (int var47 = 0; var47 < var45; var47++) {
                                                        if (var10.field3804 != 0) {
                                                            var41.method9031(var42 / 2 + var42 * var46 + var12, var43 / 2 + var43 * var47 + var13, var10.field3804, 4096);
                                                        } else if (var14 == 0) {
                                                            var41.method9027(var42 * var46 + var12, var43 * var47 + var13);
                                                        } else {
                                                            var41.method9078(var42 * var46 + var12, var43 * var47 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class544.method8892(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var48 = var10.field3741 * 4096 / var42;
                                                if (var10.field3804 != 0) {
                                                    var41.method9031(var10.field3741 / 2 + var12, var10.field3742 / 2 + var13, var10.field3804, var48);
                                                } else if (var14 != 0) {
                                                    var41.method9068(var12, var13, var10.field3741, var10.field3742, 256 - (var14 & 0xFF));
                                                } else if (var10.field3741 == var42 && var10.field3742 == var43) {
                                                    var41.method9027(var12, var13);
                                                } else {
                                                    var41.method9014(var12, var13, var10.field3741, var10.field3742);
                                                }
                                            }
                                        } else if (class350.field3723) {
                                            method2816(var10);
                                        }
                                    } else {
                                        class548 var40 = var10.method6262(Statics.field1071, method5794(var10), Statics.field1838);
                                        if (var40 != null) {
                                            var40.method9027(var12, var13);
                                        } else if (class350.field3723) {
                                            method2816(var10);
                                        }
                                    }
                                } else if (var10.field3735 == 6) {
                                    boolean var49 = method5794(var10);
                                    int var50;
                                    if (var49) {
                                        var50 = var10.field3823;
                                    } else {
                                        var50 = var10.field3774;
                                    }
                                    class285 var51 = null;
                                    int var52 = 0;
                                    if (var10.field3728 != -1) {
                                        class205 var53 = class205.method6353(var10.field3728);
                                        if (var53 != null) {
                                            class205 var54 = var53.method3642(var10.field3721);
                                            var51 = var54.method3653(1);
                                            if (var51 == null) {
                                                method2816(var10);
                                            } else {
                                                var51.method5204();
                                                var52 = var51.field2924 / 2;
                                            }
                                        }
                                    } else if (var10.field3770 == 5) {
                                        if (var10.field3771 == 0) {
                                            var51 = field816.method5837((class207) null, -1, (class207) null, -1);
                                        } else {
                                            var51 = Statics.field1858.method2016();
                                        }
                                    } else if (var10.field3770 == 7) {
                                        var51 = var10.field3775.method5837((class207) null, -1, class207.method3902(Statics.field1858.field1212), Statics.field1858.field1248);
                                    } else {
                                        class190 var55 = null;
                                        class189 var56 = null;
                                        if (var10.field3770 == 6) {
                                            int var57 = var10.field3771;
                                            if (var57 >= 0 && var57 < field629.length) {
                                                class102 var58 = field629[var57];
                                                if (var58 != null) {
                                                    var55 = var58.field1331;
                                                    var56 = var58.method2549();
                                                }
                                            }
                                        }
                                        class207 var59 = null;
                                        int var60 = -1;
                                        if (var50 != -1) {
                                            var59 = class207.method3902(var50);
                                            var60 = var10.field3861;
                                        }
                                        var51 = var10.method6146(Statics.field1071, var59, var60, var49, Statics.field1858.field1158, var55, var56);
                                        if (var51 == null && class350.field3723) {
                                            method2816(var10);
                                        }
                                    }
                                    class272.method4746(var10.field3741 / 2 + var12, var10.field3742 / 2 + var13);
                                    int var61 = var10.field3781 * class272.field2819[var10.field3860] >> 16;
                                    int var62 = var10.field3781 * class272.field2820[var10.field3860] >> 16;
                                    if (var51 != null) {
                                        if (var10.field3724) {
                                            var51.method5204();
                                            if (var10.field3785) {
                                                var51.method5173(0, var10.field3779, var10.field3780, var10.field3860, var10.field3711, var10.field3777 + var52 + var61, var10.field3777 + var62, var10.field3781);
                                            } else {
                                                var51.method5245(0, var10.field3779, var10.field3780, var10.field3860, var10.field3711, var10.field3777 + var52 + var61, var10.field3777 + var62);
                                            }
                                        } else {
                                            var51.method5245(0, var10.field3779, 0, var10.field3860, 0, var61, var62);
                                        }
                                    }
                                    class272.method4763();
                                } else {
                                    if (var10.field3735 == 8 && Statics.field5063 == var10 && field691 == field690) {
                                        int var63 = 0;
                                        int var64 = 0;
                                        class413 var65 = Statics.field1655;
                                        String var66 = var10.field3802;
                                        String var67 = method150(var66, var10);
                                        while (var67.length() > 0) {
                                            int var68 = var67.indexOf(class103.field1348);
                                            String var69;
                                            if (var68 == -1) {
                                                var69 = var67;
                                                var67 = "";
                                            } else {
                                                var69 = var67.substring(0, var68);
                                                var67 = var67.substring(var68 + 4);
                                            }
                                            int var70 = var65.method7128(var69);
                                            if (var70 > var63) {
                                                var63 = var70;
                                            }
                                            var64 += var65.field4594 + 1;
                                        }
                                        var63 += 6;
                                        var64 += 7;
                                        int var71 = var10.field3741 + var12 - 5 - var63;
                                        int var72 = var10.field3742 + var13 + 5;
                                        if (var71 < var12 + 5) {
                                            var71 = var12 + 5;
                                        }
                                        if (var63 + var71 > arg4) {
                                            var71 = arg4 - var63;
                                        }
                                        if (var64 + var72 > arg5) {
                                            var72 = arg5 - var64;
                                        }
                                        class544.method8900(var71, var72, var63, var64, 16777120);
                                        class544.method8945(var71, var72, var63, var64, 0);
                                        String var73 = var10.field3802;
                                        int var74 = var65.field4594 + var72 + 2;
                                        String var75 = method150(var73, var10);
                                        while (var75.length() > 0) {
                                            int var76 = var75.indexOf(class103.field1348);
                                            String var77;
                                            if (var76 == -1) {
                                                var77 = var75;
                                                var75 = "";
                                            } else {
                                                var77 = var75.substring(0, var76);
                                                var75 = var75.substring(var76 + 4);
                                            }
                                            var65.method7170(var77, var71 + 3, var74, 0, -1);
                                            var74 += var65.field4594 + 1;
                                        }
                                    }
                                    if (var10.field3735 == 9) {
                                        int var78;
                                        int var79;
                                        int var80;
                                        int var81;
                                        if (var10.field3760) {
                                            var78 = var12;
                                            var79 = var10.field3742 + var13;
                                            var80 = var10.field3741 + var12;
                                            var81 = var13;
                                        } else {
                                            var78 = var12;
                                            var79 = var13;
                                            var80 = var10.field3741 + var12;
                                            var81 = var10.field3742 + var13;
                                        }
                                        if (var10.field3759 == 1) {
                                            class544.method8911(var78, var79, var80, var81, var10.field3751);
                                        } else {
                                            method5733(var78, var79, var80, var81, var10.field3751, var10.field3759);
                                        }
                                    } else if (var10.field3735 == 12) {
                                        class348 var82 = var10.method6152();
                                        class342 var83 = var10.method6169();
                                        if (var82 != null && var83 != null && var82.method5908()) {
                                            class413 var84 = var10.method6145(Statics.field1071);
                                            if (var84 != null) {
                                                field741.method9160(var12, var13, var10.field3741, var10.field3742, var82.method5853(), var82.method5910(), var82.method5906(), var82.method5907(), var82.method5905());
                                                int var85 = var10.field3794 ? var10.field3767 : -1;
                                                if (!var82.method5903() && var82.method5861().method7068()) {
                                                    field741.method9161(var83.field3641, var85, var83.field3644, var83.field3640);
                                                    field741.method9162(var82.method6057(), var84);
                                                } else {
                                                    field741.method9161(var10.field3751, var85, var83.field3644, var83.field3640);
                                                    field741.method9162(var82.method5861(), var84);
                                                }
                                                class544.method8892(arg2, arg3, arg4, arg5);
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

    @ObfuscatedName("mw.lh(IIIIIIB)V")
    public static final void method5733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
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
        int var17 = arg0 - class544.field5273;
        int var18 = arg1 - class544.field5277;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class272.method4765(var19, var20, var21);
        class272.method4775(var23, var24, var25, var19, var20, var21, 0.0F, 0.0F, 0.0F, arg4);
        class272.method4765(var19, var21, var22);
        class272.method4775(var23, var25, var26, var19, var21, var22, 0.0F, 0.0F, 0.0F, arg4);
    }

    @ObfuscatedName("af.ll(Ljava/lang/String;Lng;B)Ljava/lang/String;")
    public static String method150(String arg0, class350 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1669(arg1, var2 - 1);
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

    @ObfuscatedName("ed.lu(IB)Ljava/lang/String;")
    public static final String method2847(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class103.field1343 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class103.method6341(65408) + var1.substring(0, var1.length() - 8) + class370.field4125 + " " + class103.field1345 + var1 + class103.field1346 + class103.field1349;
        } else if (var1.length() > 6) {
            return " " + class103.method6341(16777215) + var1.substring(0, var1.length() - 4) + class370.field4186 + " " + class103.field1345 + var1 + class103.field1346 + class103.field1349;
        } else {
            return " " + class103.method6341(16776960) + var1 + class103.field1349;
        }
    }

    @ObfuscatedName("client.lb(ZB)V")
    public final void method1267(boolean arg0) {
        method3226(field699, Statics.field199, Statics.field2531, arg0);
    }

    @ObfuscatedName("client.ly(Lng;I)V")
    public void method1165(class350 arg0) {
        class350 var2 = arg0.field3772 == -1 ? null : Statics.field1071.method5777(arg0.field3772);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field199;
            var4 = Statics.field2531;
        } else {
            var3 = var2.field3741;
            var4 = var2.field3742;
        }
        method2212(arg0, var3, var4, false);
        method3069(arg0, var3, var4);
    }

    @ObfuscatedName("go.ld([Lng;Lng;ZS)V")
    public static void method3192(class350[] arg0, class350 arg1, boolean arg2) {
        int var3 = arg1.field3749 == 0 ? arg1.field3741 : arg1.field3749;
        int var4 = arg1.field3750 == 0 ? arg1.field3742 : arg1.field3750;
        method5803(arg0, arg1.field3725, var3, var4, arg2);
        if (arg1.field3863 != null) {
            method5803(arg1.field3863, arg1.field3725, var3, var4, arg2);
        }
        class88 var5 = (class88) field727.method8322((long) arg1.field3725);
        if (var5 != null) {
            method3226(var5.field1090, var3, var4, arg2);
        }
        if (arg1.field3798 == 1337) {
        }
    }

    @ObfuscatedName("gf.li(IIIZB)V")
    public static final void method3226(int arg0, int arg1, int arg2, boolean arg3) {
        if (Statics.field1071.method5783(arg0)) {
            method5803(Statics.field1071.field3634[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("nj.lz([Lng;IIIZS)V")
    public static void method5803(class350[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class350 var6 = arg0[var5];
            if (var6 != null && var6.field3772 == arg1) {
                method2212(var6, arg2, arg3, arg4);
                method3069(var6, arg2, arg3);
                if (var6.field3747 > var6.field3749 - var6.field3741) {
                    var6.field3747 = var6.field3749 - var6.field3741;
                }
                if (var6.field3747 < 0) {
                    var6.field3747 = 0;
                }
                if (var6.field3828 > var6.field3750 - var6.field3742) {
                    var6.field3828 = var6.field3750 - var6.field3742;
                }
                if (var6.field3828 < 0) {
                    var6.field3828 = 0;
                }
                if (var6.field3735 == 0) {
                    method3192(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("dk.lt(Lng;IIZI)V")
    public static void method2212(class350 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field3741;
        int var5 = arg0.field3742;
        if (arg0.field3754 == 0) {
            arg0.field3741 = arg0.field3745;
        } else if (arg0.field3754 == 1) {
            arg0.field3741 = arg1 - arg0.field3745;
        } else if (arg0.field3754 == 2) {
            arg0.field3741 = arg0.field3745 * arg1 >> 14;
        }
        if (arg0.field3719 == 0) {
            arg0.field3742 = arg0.field3784;
        } else if (arg0.field3719 == 1) {
            arg0.field3742 = arg2 - arg0.field3784;
        } else if (arg0.field3719 == 2) {
            arg0.field3742 = arg0.field3784 * arg2 >> 14;
        }
        if (arg0.field3754 == 4) {
            arg0.field3741 = arg0.field3844 * arg0.field3742 / arg0.field3733;
        }
        if (arg0.field3719 == 4) {
            arg0.field3742 = arg0.field3741 * arg0.field3733 / arg0.field3844;
        }
        if (arg0.field3798 == 1337) {
            field710 = arg0;
        }
        if (arg0.field3735 == 12) {
            arg0.method6152().method5858(arg0.field3741, arg0.field3742);
        }
        if (arg3 && arg0.field3843 != null && (arg0.field3741 != var4 || arg0.field3742 != var5)) {
            class89 var6 = new class89();
            var6.field1095 = arg0;
            var6.field1106 = arg0.field3843;
            field742.method6678(var6);
        }
    }

    @ObfuscatedName("fp.lq(Lng;IIB)V")
    public static void method3069(class350 arg0, int arg1, int arg2) {
        if (arg0.field3801 == 0) {
            arg0.field3739 = arg0.field3811;
        } else if (arg0.field3801 == 1) {
            arg0.field3739 = (arg1 - arg0.field3741) / 2 + arg0.field3811;
        } else if (arg0.field3801 == 2) {
            arg0.field3739 = arg1 - arg0.field3741 - arg0.field3811;
        } else if (arg0.field3801 == 3) {
            arg0.field3739 = arg0.field3811 * arg1 >> 14;
        } else if (arg0.field3801 == 4) {
            arg0.field3739 = (arg0.field3811 * arg1 >> 14) + (arg1 - arg0.field3741) / 2;
        } else {
            arg0.field3739 = arg1 - arg0.field3741 - (arg0.field3811 * arg1 >> 14);
        }
        if (arg0.field3797 == 0) {
            arg0.field3869 = arg0.field3736;
        } else if (arg0.field3797 == 1) {
            arg0.field3869 = (arg2 - arg0.field3742) / 2 + arg0.field3736;
        } else if (arg0.field3797 == 2) {
            arg0.field3869 = arg2 - arg0.field3742 - arg0.field3736;
        } else if (arg0.field3797 == 3) {
            arg0.field3869 = arg0.field3736 * arg2 >> 14;
        } else if (arg0.field3797 == 4) {
            arg0.field3869 = (arg0.field3736 * arg2 >> 14) + (arg2 - arg0.field3742) / 2;
        } else {
            arg0.field3869 = arg2 - arg0.field3742 - (arg0.field3736 * arg2 >> 14);
        }
    }

    @ObfuscatedName("cf.mn(Lng;IIIIIII)V")
    public static final void method2107(class350 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field718) {
            field526 = 32;
        } else {
            field526 = 0;
        }
        field718 = false;
        if (class36.field228 == 1 || !Statics.field5137 && class36.field228 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field3828 -= 4;
                method2816(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field3828 += 4;
                method2816(arg0);
            } else if (arg5 >= arg1 - field526 && arg5 < field526 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field3828 = (arg4 - arg3) * var8 / var9;
                method2816(arg0);
                field718 = true;
            }
        }
        if (field740 == 0) {
            return;
        }
        int var10 = arg0.field3741;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field3828 += field740 * 45;
            method2816(arg0);
        }
    }

    @ObfuscatedName("gj.mj(IIIIIB)V")
    public static final void method3197(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field1682[0].method8984(arg0, arg1);
        Statics.field1682[1].method8984(arg0, arg1 + arg3 - 16);
        class544.method8900(arg0, arg1 + 16, 16, arg3 - 32, field606);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class544.method8900(arg0, arg1 + 16 + var6, 16, var5, field610);
        class544.method8908(arg0, arg1 + 16 + var6, var5, field668);
        class544.method8908(arg0 + 1, arg1 + 16 + var6, var5, field668);
        class544.method8906(arg0, arg1 + 16 + var6, 16, field668);
        class544.method8906(arg0, arg1 + 17 + var6, 16, field668);
        class544.method8908(arg0 + 15, arg1 + 16 + var6, var5, field619);
        class544.method8908(arg0 + 14, arg1 + 17 + var6, var5 - 1, field619);
        class544.method8906(arg0, arg1 + 15 + var6 + var5, 16, field619);
        class544.method8906(arg0 + 1, arg1 + 14 + var6 + var5, 15, field619);
    }

    @ObfuscatedName("nv.mf(Lng;I)Z")
    public static final boolean method5794(class350 arg0) {
        if (arg0.field3870 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3870.length; var1++) {
            int var2 = method1669(arg0, var1);
            int var3 = arg0.field3853[var1];
            if (arg0.field3870[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3870[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3870[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("client.mr(Lng;IB)I")
    public static final int method1669(class350 arg0, int arg1) {
        if (arg0.field3851 == null || arg1 >= arg0.field3851.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3851[arg1];
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
                    var7 = field670[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field671[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field672[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class350 var11 = Statics.field1071.method5777(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class205.method6353(var12).field2199 || field525)) {
                        for (int var13 = 0; var13 < var11.field3857.length; var13++) {
                            if (var12 + 1 == var11.field3857[var13]) {
                                var7 += var11.field3858[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class338.field3620[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class360.field3936[field671[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class338.field3620[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1858.field1140;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class360.field3935[var14]) {
                            var7 += field671[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class350 var17 = Statics.field1071.method5777(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class205.method6353(var18).field2199 || field525)) {
                        for (int var19 = 0; var19 < var17.field3857.length; var19++) {
                            if (var18 + 1 == var17.field3857[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field705;
                }
                if (var6 == 12) {
                    var7 = field706;
                }
                if (var6 == 13) {
                    int var20 = class338.field3620[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class338.method5735(var22);
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
                    var7 = (Statics.field1858.field1208 >> 7) + Statics.field1011;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1858.field1253 >> 7) + Statics.field216;
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

    @ObfuscatedName("ht.mi(Lng;I)V")
    public static final void method3366(class350 arg0) {
        if (arg0.field3729 == 1) {
            method2643(arg0.field3856, "", 24, 0, 0, arg0.field3725, arg0.field3728);
        }
        if (arg0.field3729 == 2 && !field694) {
            String var1 = method2830(arg0);
            if (var1 != null) {
                method2643(var1, class103.method6341(65280) + arg0.field3786, 25, 0, -1, arg0.field3725, arg0.field3728);
            }
        }
        if (arg0.field3729 == 3) {
            method2788(class370.field4278, "", 26, 0, 0, arg0.field3725);
        }
        if (arg0.field3729 == 4) {
            method2788(arg0.field3856, "", 28, 0, 0, arg0.field3725);
        }
        if (arg0.field3729 == 5) {
            method2788(arg0.field3856, "", 29, 0, 0, arg0.field3725);
        }
        if (arg0.field3729 == 6 && field704 == null) {
            method2788(arg0.field3856, "", 30, 0, -1, arg0.field3725);
        }
        if (!arg0.field3724) {
            return;
        }
        if (!field694) {
            for (int var2 = 9; var2 >= 5; var2--) {
                int var3 = method7342(arg0);
                boolean var4 = (var3 >> var2 + 1 & 0x1) != 0;
                String var5;
                if (!var4 && arg0.field3833 == null) {
                    var5 = null;
                } else if (arg0.field3737 == null || arg0.field3737.length <= var2 || arg0.field3737[var2] == null || arg0.field3737[var2].trim().length() == 0) {
                    var5 = null;
                } else {
                    var5 = arg0.field3737[var2];
                }
                if (var5 != null) {
                    method2643(var5, arg0.field3806, 1007, var2 + 1, arg0.field3726, arg0.field3725, arg0.field3728);
                }
            }
            String var7 = method2830(arg0);
            if (var7 != null) {
                method2643(var7, arg0.field3806, 25, 0, arg0.field3726, arg0.field3725, arg0.field3728);
            }
            for (int var8 = 4; var8 >= 0; var8--) {
                int var9 = method7342(arg0);
                boolean var10 = (var9 >> var8 + 1 & 0x1) != 0;
                String var11;
                if (!var10 && arg0.field3833 == null) {
                    var11 = null;
                } else if (arg0.field3737 == null || arg0.field3737.length <= var8 || arg0.field3737[var8] == null || arg0.field3737[var8].trim().length() == 0) {
                    var11 = null;
                } else {
                    var11 = arg0.field3737[var8];
                }
                if (var11 != null) {
                    method4519(var11, arg0.field3806, 57, var8 + 1, arg0.field3726, arg0.field3725, arg0.field3728, arg0.field3875);
                }
            }
            if (class351.method5710(method7342(arg0))) {
                method2788(class370.field4045, "", 30, 0, arg0.field3726, arg0.field3725);
            }
        } else if (class351.method3225(method7342(arg0)) && (Statics.field1521 & 0x20) == 32) {
            method2643(field697, field575 + " " + class103.field1347 + " " + arg0.field3806, 58, 0, arg0.field3726, arg0.field3725, arg0.field3728);
        }
    }

    @ObfuscatedName("di.mb(ZB)V")
    public static void method2331(boolean arg0) {
        field686 = arg0;
    }

    @ObfuscatedName("ok.ml(B)Z")
    public static boolean method6586() {
        return field686;
    }

    @ObfuscatedName("gt.mm(IIIIIIIB)V")
    public static final void method3089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (Statics.field1071.method5783(arg0)) {
            method3156(Statics.field1071.field3634[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("gn.mh([Lng;IIIIIIIB)V")
    public static final void method3156(class350[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class350 var9 = arg0[var8];
            if (var9 != null && var9.field3772 == arg1 && (var9.method6149() || method7342(var9) != 0 || field712 == var9)) {
                if (var9.field3724) {
                    if (method748(var9)) {
                        continue;
                    }
                } else if (var9.field3735 == 0 && Statics.field1615 != var9 && method748(var9)) {
                    continue;
                }
                if (var9.field3735 == 11) {
                    if (var9.method6166(Statics.field1071, Statics.field1838)) {
                        if (var9.method6241()) {
                            method2816(var9);
                            method3192(var9.field3863, var9, true);
                            var9.method6165().method3828().method3910(3, var9.method6165().method3808());
                        }
                        if (var9.field3738 != null) {
                            class89 var10 = new class89();
                            var10.field1095 = var9;
                            var10.field1106 = var9.field3738;
                            field742.method6678(var10);
                        }
                    }
                } else if (var9.field3735 == 12 && var9.method6174(Statics.field1071)) {
                    method2816(var9);
                }
                int var11 = var9.field3739 + arg6;
                int var12 = var9.field3869 + arg7;
                int var19;
                int var20;
                int var21;
                int var22;
                if (var9.field3735 == 9) {
                    int var13 = var11;
                    int var14 = var12;
                    int var15 = var9.field3741 + var11;
                    int var16 = var9.field3742 + var12;
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
                    int var23 = var9.field3741 + var11;
                    int var24 = var9.field3742 + var12;
                    var19 = var11 > arg2 ? var11 : arg2;
                    var20 = var12 > arg3 ? var12 : arg3;
                    var21 = var23 < arg4 ? var23 : arg4;
                    var22 = var24 < arg5 ? var24 : arg5;
                }
                if (field570 == var9) {
                    field811 = true;
                    field641 = var11;
                    field721 = var12;
                }
                boolean var25 = false;
                if (var9.field3809) {
                    switch(field576) {
                        case 0:
                            var25 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field3725 >>> 16 == field702) {
                                var25 = true;
                            }
                            break;
                        case 3:
                            if (field702 == var9.field3725) {
                                var25 = true;
                            }
                    }
                }
                if (var25 || !var9.field3724 || var19 < var21 && var20 < var22) {
                    if (var9.field3724) {
                        if (var9.field3873) {
                            if (class36.field229 >= var19 && class36.field230 >= var20 && class36.field229 < var21 && class36.field230 < var22) {
                                for (class89 var26 = (class89) field742.method6702(); var26 != null; var26 = (class89) field742.method6684()) {
                                    if (var26.field1096) {
                                        var26.method7996();
                                        var26.field1095.field3864 = false;
                                    }
                                }
                                method5701();
                                if (Statics.field2496 == 0) {
                                    field570 = null;
                                    field712 = null;
                                }
                                if (!field675) {
                                    method4564();
                                }
                            }
                        } else if (var9.field3762 && class36.field229 >= var19 && class36.field230 >= var20 && class36.field229 < var21 && class36.field230 < var22) {
                            for (class89 var27 = (class89) field742.method6702(); var27 != null; var27 = (class89) field742.method6684()) {
                                if (var27.field1096 && var27.field1095.field3835 == var27.field1106) {
                                    var27.method7996();
                                }
                            }
                        }
                    }
                    int var28 = class36.field229;
                    int var29 = class36.field230;
                    if (class36.field227 != 0) {
                        var28 = class36.field225;
                        var29 = class36.field238;
                    }
                    boolean var30 = var28 >= var19 && var29 >= var20 && var28 < var21 && var29 < var22;
                    if (var9.field3798 == 1337) {
                        if (!field611 && !field675 && var30) {
                            method4010(var28, var29, var19, var20);
                        }
                    } else if (var9.field3798 == 1338) {
                        method6595(var9, var11, var12);
                    } else {
                        if (var9.field3798 == 1400) {
                            Statics.field1053.method8143(class36.field229, class36.field230, var30, var11, var12, var9.field3741, var9.field3742);
                        }
                        if (!field675 && var30) {
                            if (var9.field3798 == 1400) {
                                Statics.field1053.method8113(var11, var12, var9.field3741, var9.field3742, var28, var29);
                            } else {
                                method3366(var9);
                            }
                        }
                        if (var25) {
                            for (int var31 = 0; var31 < var9.field3740.length; var31++) {
                                boolean var32 = false;
                                boolean var33 = false;
                                if (!var32 && var9.field3740[var31] != null) {
                                    for (int var34 = 0; var34 < var9.field3740[var31].length; var34++) {
                                        boolean var35 = false;
                                        if (var9.field3872 != null) {
                                            var35 = field793.method4065(var9.field3740[var31][var34]);
                                        }
                                        if (method2099(var9.field3740[var31][var34]) || var35) {
                                            var32 = true;
                                            if (var9.field3872 != null && var9.field3872[var31] > field536) {
                                                break;
                                            }
                                            byte var36 = var9.field3807[var31][var34];
                                            if (var36 == 0 || ((var36 & 0x8) == 0 || !field793.method4065(86) && !field793.method4065(82) && !field793.method4065(81)) && ((var36 & 0x2) == 0 || field793.method4065(86)) && ((var36 & 0x1) == 0 || field793.method4065(82)) && ((var36 & 0x4) == 0 || field793.method4065(81))) {
                                                var33 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var33) {
                                    if (var31 < 10) {
                                        method3354(var31 + 1, var9.field3725, var9.field3726, var9.field3728, "");
                                    } else if (var31 == 10) {
                                        method5375();
                                        method3487(var9.field3725, var9.field3726, class351.method5135(method7342(var9)), var9.field3728);
                                        field697 = method2830(var9);
                                        if (field697 == null) {
                                            field697 = class370.field4015;
                                        }
                                        field575 = var9.field3806 + class103.method6341(16777215);
                                    }
                                    int var37 = var9.field3821[var31];
                                    if (var9.field3872 == null) {
                                        var9.field3872 = new int[var9.field3740.length];
                                    }
                                    if (var9.field3805 == null) {
                                        var9.field3805 = new int[var9.field3740.length];
                                    }
                                    if (var37 == 0) {
                                        var9.field3872[var31] = Integer.MAX_VALUE;
                                    } else if (var9.field3872[var31] == 0) {
                                        var9.field3872[var31] = field536 + var37 + var9.field3805[var31];
                                    } else {
                                        var9.field3872[var31] = field536 + var37;
                                    }
                                }
                                if (!var32 && var9.field3872 != null) {
                                    var9.field3872[var31] = 0;
                                }
                            }
                        }
                        if (var9.field3724) {
                            boolean var38;
                            if (class36.field229 >= var19 && class36.field230 >= var20 && class36.field229 < var21 && class36.field230 < var22) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if ((class36.field228 == 1 || !Statics.field5137 && class36.field228 == 4) && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if ((class36.field227 == 1 || !Statics.field5137 && class36.field227 == 4) && class36.field225 >= var19 && class36.field238 >= var20 && class36.field225 < var21 && class36.field238 < var22) {
                                var40 = true;
                            }
                            if (var40) {
                                method392(var9, class36.field225 - var11, class36.field238 - var12);
                            }
                            if (var9.method6177()) {
                                if (var40) {
                                    field745.method6678(new class228(0, class36.field229 - var11, class36.field230 - var12, var9));
                                }
                                if (var39) {
                                    field745.method6678(new class228(1, class36.field229 - var11, class36.field230 - var12, var9));
                                }
                            }
                            if (var9.field3798 == 1400) {
                                Statics.field1053.method8061(var28, var29, var38 & var39, var38 & var40);
                            }
                            if (field570 != null && field570 != var9 && var38 && class351.method1033(method7342(var9))) {
                                field751 = var9;
                            }
                            if (field712 == var9) {
                                field747 = true;
                                field766 = var11;
                                field775 = var12;
                            }
                            if (var9.field3813) {
                                if (var38 && field740 != 0 && var9.field3835 != null) {
                                    class89 var41 = new class89();
                                    var41.field1096 = true;
                                    var41.field1095 = var9;
                                    var41.field1097 = field740;
                                    var41.field1106 = var9.field3835;
                                    field742.method6678(var41);
                                }
                                if (field570 != null || field675) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field3865 && var40) {
                                    var9.field3865 = true;
                                    if (var9.field3815 != null) {
                                        class89 var42 = new class89();
                                        var42.field1096 = true;
                                        var42.field1095 = var9;
                                        var42.field1101 = class36.field225 - var11;
                                        var42.field1097 = class36.field238 - var12;
                                        var42.field1106 = var9.field3815;
                                        field742.method6678(var42);
                                    }
                                }
                                if (var9.field3865 && var39 && var9.field3816 != null) {
                                    class89 var43 = new class89();
                                    var43.field1096 = true;
                                    var43.field1095 = var9;
                                    var43.field1101 = class36.field229 - var11;
                                    var43.field1097 = class36.field230 - var12;
                                    var43.field1106 = var9.field3816;
                                    field742.method6678(var43);
                                }
                                if (var9.field3865 && !var39) {
                                    var9.field3865 = false;
                                    if (var9.field3817 != null) {
                                        class89 var44 = new class89();
                                        var44.field1096 = true;
                                        var44.field1095 = var9;
                                        var44.field1101 = class36.field229 - var11;
                                        var44.field1097 = class36.field230 - var12;
                                        var44.field1106 = var9.field3817;
                                        field534.method6678(var44);
                                    }
                                }
                                if (var39 && var9.field3761 != null) {
                                    class89 var45 = new class89();
                                    var45.field1096 = true;
                                    var45.field1095 = var9;
                                    var45.field1101 = class36.field229 - var11;
                                    var45.field1097 = class36.field230 - var12;
                                    var45.field1106 = var9.field3761;
                                    field742.method6678(var45);
                                }
                                if (!var9.field3864 && var38) {
                                    var9.field3864 = true;
                                    if (var9.field3819 != null) {
                                        class89 var46 = new class89();
                                        var46.field1096 = true;
                                        var46.field1095 = var9;
                                        var46.field1101 = class36.field229 - var11;
                                        var46.field1097 = class36.field230 - var12;
                                        var46.field1106 = var9.field3819;
                                        field742.method6678(var46);
                                    }
                                }
                                if (var9.field3864 && var38 && var9.field3852 != null) {
                                    class89 var47 = new class89();
                                    var47.field1096 = true;
                                    var47.field1095 = var9;
                                    var47.field1101 = class36.field229 - var11;
                                    var47.field1097 = class36.field230 - var12;
                                    var47.field1106 = var9.field3852;
                                    field742.method6678(var47);
                                }
                                if (var9.field3864 && !var38) {
                                    var9.field3864 = false;
                                    if (var9.field3756 != null) {
                                        class89 var48 = new class89();
                                        var48.field1096 = true;
                                        var48.field1095 = var9;
                                        var48.field1101 = class36.field229 - var11;
                                        var48.field1097 = class36.field230 - var12;
                                        var48.field1106 = var9.field3756;
                                        field534.method6678(var48);
                                    }
                                }
                                if (var9.field3722 != null) {
                                    class89 var49 = new class89();
                                    var49.field1095 = var9;
                                    var49.field1106 = var9.field3722;
                                    field803.method6678(var49);
                                }
                                if (var9.field3826 != null && field824 > var9.field3867) {
                                    if (var9.field3827 == null || field824 - var9.field3867 > 32) {
                                        class89 var54 = new class89();
                                        var54.field1095 = var9;
                                        var54.field1106 = var9.field3826;
                                        field742.method6678(var54);
                                    } else {
                                        label647: for (int var50 = var9.field3867; var50 < field824; var50++) {
                                            int var51 = field703[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field3827.length; var52++) {
                                                if (var9.field3827[var52] == var51) {
                                                    class89 var53 = new class89();
                                                    var53.field1095 = var9;
                                                    var53.field1106 = var9.field3826;
                                                    field742.method6678(var53);
                                                    break label647;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3867 = field824;
                                }
                                if (var9.field3776 != null && field609 > var9.field3868) {
                                    if (var9.field3829 == null || field609 - var9.field3868 > 32) {
                                        class89 var59 = new class89();
                                        var59.field1095 = var9;
                                        var59.field1106 = var9.field3776;
                                        field742.method6678(var59);
                                    } else {
                                        label623: for (int var55 = var9.field3868; var55 < field609; var55++) {
                                            int var56 = field647[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field3829.length; var57++) {
                                                if (var9.field3829[var57] == var56) {
                                                    class89 var58 = new class89();
                                                    var58.field1095 = var9;
                                                    var58.field1106 = var9.field3776;
                                                    field742.method6678(var58);
                                                    break label623;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3868 = field609;
                                }
                                if (var9.field3727 != null && field783 > var9.field3832) {
                                    if (var9.field3831 == null || field783 - var9.field3832 > 32) {
                                        class89 var64 = new class89();
                                        var64.field1095 = var9;
                                        var64.field1106 = var9.field3727;
                                        field742.method6678(var64);
                                    } else {
                                        label599: for (int var60 = var9.field3832; var60 < field783; var60++) {
                                            int var61 = field728[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field3831.length; var62++) {
                                                if (var9.field3831[var62] == var61) {
                                                    class89 var63 = new class89();
                                                    var63.field1095 = var9;
                                                    var63.field1106 = var9.field3727;
                                                    field742.method6678(var63);
                                                    break label599;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3832 = field783;
                                }
                                if (field732 > var9.field3866 && var9.field3836 != null) {
                                    class89 var65 = new class89();
                                    var65.field1095 = var9;
                                    var65.field1106 = var9.field3836;
                                    field742.method6678(var65);
                                }
                                if (field733 > var9.field3866 && var9.field3758 != null) {
                                    class89 var66 = new class89();
                                    var66.field1095 = var9;
                                    var66.field1106 = var9.field3758;
                                    field742.method6678(var66);
                                }
                                if (field734 > var9.field3866 && var9.field3841 != null) {
                                    class89 var67 = new class89();
                                    var67.field1095 = var9;
                                    var67.field1106 = var9.field3841;
                                    field742.method6678(var67);
                                }
                                if (field735 > var9.field3866 && var9.field3842 != null) {
                                    class89 var68 = new class89();
                                    var68.field1095 = var9;
                                    var68.field1106 = var9.field3842;
                                    field742.method6678(var68);
                                }
                                if (field736 > var9.field3866 && var9.field3731 != null) {
                                    class89 var69 = new class89();
                                    var69.field1095 = var9;
                                    var69.field1106 = var9.field3731;
                                    field742.method6678(var69);
                                }
                                if (field737 > var9.field3866 && var9.field3855 != null) {
                                    class89 var70 = new class89();
                                    var70.field1095 = var9;
                                    var70.field1106 = var9.field3855;
                                    field742.method6678(var70);
                                }
                                if (field538 > var9.field3866 && var9.field3849 != null) {
                                    class89 var71 = new class89();
                                    var71.field1095 = var9;
                                    var71.field1106 = var9.field3849;
                                    field742.method6678(var71);
                                }
                                if (field739 > var9.field3866 && var9.field3848 != null) {
                                    class89 var72 = new class89();
                                    var72.field1095 = var9;
                                    var72.field1106 = var9.field3848;
                                    field742.method6678(var72);
                                }
                                var9.field3866 = field726;
                                if (var9.field3837 != null) {
                                    for (int var73 = 0; var73 < field707; var73++) {
                                        class89 var74 = new class89();
                                        var74.field1095 = var9;
                                        var74.field1100 = field769[var73];
                                        var74.field1099 = field661[var73];
                                        var74.field1106 = var9.field3837;
                                        field742.method6678(var74);
                                    }
                                }
                                if (var9.field3838 != null) {
                                    int[] var75 = field793.method4045();
                                    for (int var76 = 0; var76 < var75.length; var76++) {
                                        class89 var77 = new class89();
                                        var77.field1095 = var9;
                                        var77.field1100 = var75[var76];
                                        var77.field1106 = var9.field3838;
                                        field742.method6678(var77);
                                    }
                                }
                                if (var9.field3839 != null) {
                                    int[] var78 = field793.method4046();
                                    for (int var79 = 0; var79 < var78.length; var79++) {
                                        class89 var80 = new class89();
                                        var80.field1095 = var9;
                                        var80.field1100 = var78[var79];
                                        var80.field1106 = var9.field3839;
                                        field742.method6678(var80);
                                    }
                                }
                            }
                        }
                        if (!var9.field3724) {
                            if (field570 != null || field675) {
                                continue;
                            }
                            if ((var9.field3854 >= 0 || var9.field3753 != 0) && class36.field229 >= var19 && class36.field230 >= var20 && class36.field229 < var21 && class36.field230 < var22) {
                                if (var9.field3854 >= 0) {
                                    Statics.field1615 = arg0[var9.field3854];
                                } else {
                                    Statics.field1615 = var9;
                                }
                            }
                            if (var9.field3735 == 8 && class36.field229 >= var19 && class36.field230 >= var20 && class36.field229 < var21 && class36.field230 < var22) {
                                Statics.field5063 = var9;
                            }
                            if (var9.field3750 > var9.field3742) {
                                method2107(var9, var9.field3741 + var11, var12, var9.field3742, var9.field3750, class36.field229, class36.field230);
                            }
                        }
                        if (var9.field3735 == 0) {
                            method3156(arg0, var9.field3725, var19, var20, var21, var22, var11 - var9.field3747, var12 - var9.field3828);
                            if (var9.field3863 != null) {
                                method3156(var9.field3863, var9.field3725, var19, var20, var21, var22, var11 - var9.field3747, var12 - var9.field3828);
                            }
                            class88 var81 = (class88) field727.method8322((long) var9.field3725);
                            if (var81 != null) {
                                if (var81.field1089 == 0 && class36.field229 >= var19 && class36.field230 >= var20 && class36.field229 < var21 && class36.field230 < var22 && !field675) {
                                    for (class89 var82 = (class89) field742.method6702(); var82 != null; var82 = (class89) field742.method6684()) {
                                        if (var82.field1096) {
                                            var82.method7996();
                                            var82.field1095.field3864 = false;
                                        }
                                    }
                                    if (Statics.field2496 == 0) {
                                        field570 = null;
                                        field712 = null;
                                    }
                                    if (!field675) {
                                        method4564();
                                    }
                                }
                                method3089(var81.field1090, var19, var20, var21, var22, var11, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cf.mt(IB)Z")
    public static boolean method2099(int arg0) {
        for (int var1 = 0; var1 < field707; var1++) {
            if (field769[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ab.mo(III)V")
    public static final void method287(int arg0, int arg1) {
        if (Statics.field1071.method5783(arg0)) {
            method2858(Statics.field1071.field3634[arg0], arg1);
        }
    }

    @ObfuscatedName("eq.ms([Lng;IB)V")
    public static final void method2858(class350[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class350 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field3735 == 0) {
                    if (var3.field3863 != null) {
                        method2858(var3.field3863, arg1);
                    }
                    class88 var4 = (class88) field727.method8322((long) var3.field3725);
                    if (var4 != null) {
                        method287(var4.field1090, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3845 != null) {
                    class89 var5 = new class89();
                    var5.field1095 = var3;
                    var5.field1106 = var3.field3845;
                    class72.method3238(var5);
                }
                if (arg1 == 1 && var3.field3718 != null) {
                    if (var3.field3726 >= 0) {
                        class350 var6 = Statics.field1071.method5777(var3.field3725);
                        if (var6 == null || var6.field3863 == null || var3.field3726 >= var6.field3863.length || var6.field3863[var3.field3726] != var3) {
                            continue;
                        }
                    }
                    class89 var7 = new class89();
                    var7.field1095 = var3;
                    var7.field1106 = var3.field3718;
                    class72.method3238(var7);
                }
            }
        }
    }

    @ObfuscatedName("bo.mk(Lng;IIB)V")
    public static final void method392(class350 arg0, int arg1, int arg2) {
        if (field570 != null || field675 || arg0 == null) {
            return;
        }
        class350 var3 = arg0;
        int var4 = method7342(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class350 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = Statics.field1071.method5777(var3.field3772);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class350 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field3808;
        }
        if (var9 == null) {
            return;
        }
        field570 = arg0;
        class350 var11 = arg0;
        int var12 = method7342(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class350 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = Statics.field1071.method5777(var11.field3772);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class350 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field3808;
        }
        field712 = var17;
        field792 = arg1;
        field818 = arg2;
        Statics.field2496 = 0;
        field693 = false;
        int var19 = method8271();
        if (var19 != -1) {
            Statics.field3971 = new class75();
            Statics.field3971.field930 = field677[var19];
            Statics.field3971.field926 = field678[var19];
            Statics.field3971.field927 = field679[var19];
            Statics.field3971.field928 = field649[var19];
            Statics.field3971.field929 = field681[var19];
            Statics.field3971.field932 = field682[var19];
            Statics.field3971.field931 = field683[var19];
        }
        return;
    }

    @ObfuscatedName("client.mg(I)V")
    public final void method1466() {
        method2816(field570);
        Statics.field2496++;
        if (field811 && field747) {
            int var1 = class36.field229;
            int var2 = class36.field230;
            int var3 = var1 - field792;
            int var4 = var2 - field818;
            if (var3 < field766) {
                var3 = field766;
            }
            if (field570.field3741 + var3 > field766 + field712.field3741) {
                var3 = field766 + field712.field3741 - field570.field3741;
            }
            if (var4 < field775) {
                var4 = field775;
            }
            if (field570.field3742 + var4 > field775 + field712.field3742) {
                var4 = field775 + field712.field3742 - field570.field3742;
            }
            int var5 = var3 - field641;
            int var6 = var4 - field721;
            int var7 = field570.field3871;
            if (Statics.field2496 > field570.field3764 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field693 = true;
            }
            int var8 = field712.field3747 + (var3 - field766);
            int var9 = field712.field3828 + (var4 - field775);
            if (field570.field3822 != null && field693) {
                class89 var10 = new class89();
                var10.field1095 = field570;
                var10.field1101 = var8;
                var10.field1097 = var9;
                var10.field1106 = field570.field3822;
                class72.method3238(var10);
            }
            if (class36.field228 == 0) {
                if (field693) {
                    if (field570.field3825 != null) {
                        class89 var11 = new class89();
                        var11.field1095 = field570;
                        var11.field1101 = var8;
                        var11.field1097 = var9;
                        var11.field1094 = field751;
                        var11.field1106 = field570.field3825;
                        class72.method3238(var11);
                    }
                    if (field751 != null) {
                        class350 var12 = field570;
                        int var13 = method7342(var12);
                        int var14 = var13 >> 17 & 0x7;
                        int var15 = var14;
                        class350 var16;
                        if (var14 == 0) {
                            var16 = null;
                        } else {
                            int var17 = 0;
                            while (true) {
                                if (var17 >= var15) {
                                    var16 = var12;
                                    break;
                                }
                                var12 = Statics.field1071.method5777(var12.field3772);
                                if (var12 == null) {
                                    var16 = null;
                                    break;
                                }
                                var17++;
                            }
                        }
                        if (var16 != null) {
                            class313 var18 = class313.method5301(class311.field3225, field590.field1435);
                            var18.field3291.method8706(field570.field3726);
                            var18.field3291.method8706(field751.field3728);
                            var18.field3291.method8706(field570.field3728);
                            var18.field3291.method8577(field570.field3725);
                            var18.field3291.method8795(field751.field3725);
                            var18.field3291.method8706(field751.field3726);
                            field590.method2741(var18);
                        }
                    }
                } else if (this.method1198()) {
                    this.method1643(field792 + field641, field818 + field721);
                } else if (field701 > 0) {
                    method6340(field792 + field641, field818 + field721);
                }
                field570 = null;
            }
        } else if (Statics.field2496 > 1) {
            if (!field693 && field701 > 0) {
                method6340(field792 + field641, field818 + field721);
            }
            field570 = null;
        }
    }

    @ObfuscatedName("os.mq(III)V")
    public static void method6340(int arg0, int arg1) {
        class75 var2 = Statics.field3971;
        if (var2 != null) {
            method656(var2.field930, var2.field926, var2.field927, var2.field928, var2.field929, var2.field932, var2.field931, arg0, arg1);
        }
        Statics.field3971 = null;
    }

    @ObfuscatedName("eh.mx(Lng;B)V")
    public static void method2816(class350 arg0) {
        if (arg0 != null && field833 == arg0.field3830) {
            field817[arg0.field3874] = true;
        }
    }

    @ObfuscatedName("cv.mz(I)V")
    public static void method1136() {
        for (class88 var0 = (class88) field727.method8325(); var0 != null; var0 = (class88) field727.method8333()) {
            int var1 = var0.field1090;
            if (Statics.field1071.method5783(var1)) {
                boolean var2 = true;
                class350[] var3 = Statics.field1071.field3634[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field3724;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field4920;
                    class350 var6 = Statics.field1071.method5777(var5);
                    if (var6 != null) {
                        method2816(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("jn.mu(II)V")
    public static final void method4470(int arg0) {
        if (Statics.field1071.method5783(arg0)) {
            method3165(Statics.field1071.field3634[arg0], -1);
        }
    }

    @ObfuscatedName("ge.mw([Lng;II)V")
    public static final void method3165(class350[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class350 var3 = arg0[var2];
            if (var3 != null && var3.field3772 == arg1 && (!var3.field3724 || !method748(var3))) {
                if (var3.field3735 == 0) {
                    if (!var3.field3724 && method748(var3) && Statics.field1615 != var3) {
                        continue;
                    }
                    method3165(arg0, var3.field3725);
                    if (var3.field3863 != null) {
                        method3165(var3.field3863, var3.field3725);
                    }
                    class88 var4 = (class88) field727.method8322((long) var3.field3725);
                    if (var4 != null) {
                        method4470(var4.field1090);
                    }
                }
                if (var3.field3735 == 6) {
                    if (var3.field3774 != -1 || var3.field3823 != -1) {
                        boolean var5 = method5794(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field3823;
                        } else {
                            var6 = var3.field3774;
                        }
                        if (var6 != -1) {
                            class207 var7 = class207.method3902(var6);
                            if (var7.method3731()) {
                                var3.field3861 += field605;
                                int var8 = var7.method3732();
                                if (var3.field3861 >= var8) {
                                    var3.field3861 -= var7.field2247;
                                    if (var3.field3861 < 0 || var3.field3861 >= var8) {
                                        var3.field3861 = 0;
                                    }
                                }
                                method2816(var3);
                            } else {
                                var3.field3862 += field605;
                                while (var3.field3862 > var7.field2257[var3.field3861]) {
                                    var3.field3862 -= var7.field2257[var3.field3861];
                                    var3.field3861++;
                                    if (var3.field3861 >= var7.field2259.length) {
                                        var3.field3861 -= var7.field2247;
                                        if (var3.field3861 < 0 || var3.field3861 >= var7.field2259.length) {
                                            var3.field3861 = 0;
                                        }
                                    }
                                    method2816(var3);
                                }
                            }
                        }
                    }
                    if (var3.field3783 != 0 && !var3.field3724) {
                        int var9 = var3.field3783 >> 16;
                        int var10 = var3.field3783 << 16 >> 16;
                        int var11 = field605 * var9;
                        int var12 = field605 * var10;
                        var3.field3860 = var3.field3860 + var11 & 0x7FF;
                        var3.field3779 = var3.field3779 + var12 & 0x7FF;
                        method2816(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ks.my(I)I")
    public static final int method5100() {
        float var0 = 200.0F * ((float) Statics.field156.method2425() - 0.5F);
        return 100 - Math.round(var0);
    }

    @ObfuscatedName("at.me(D)V")
    public static final void method255(double arg0) {
        class272.method4749(arg0);
        ((class282) class272.field2821.field3091).method5105(arg0);
        if (Statics.field1053 != null) {
            Statics.field1053.method8078();
        }
        class205.field2180.method5418();
        Statics.field156.method2421(arg0);
    }

    @ObfuscatedName("mc.ma(II)V")
    public static final void method5751(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (var1 == Statics.field156.method2427()) {
            return;
        }
        if (Statics.field156.method2427() == 0 && class322.method3498()) {
            class322.method1962(Statics.field2922, var1);
            field781 = false;
        } else if (var1 == 0) {
            class322.method3196(0, 0);
            field781 = false;
        } else if (!class322.field3475.isEmpty()) {
            Iterator var2 = class322.field3475.iterator();
            while (var2.hasNext()) {
                class334 var3 = (class334) var2.next();
                if (var3 != null) {
                    var3.field3593 = var1;
                }
            }
            class334 var4 = (class334) class322.field3475.get(0);
            if (var4 != null && var4.field3595 != null && var4.field3595.method5551() && !var4.field3598) {
                var4.field3595.method5622(var1);
                var4.field3603 = (float) var1;
            }
        }
        Statics.field156.method2439(var1);
    }

    @ObfuscatedName("bc.mc(II)V")
    public static final void method804(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field156.method2430(var1);
    }

    @ObfuscatedName("iu.mp(IB)V")
    public static final void method3992(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field156.method2429(var1);
    }

    @ObfuscatedName("ct.ns(II)V")
    public static final void method1850(int arg0) {
        method1136();
        for (class71 var1 = (class71) class71.field870.method6702(); var1 != null; var1 = (class71) class71.field870.method6684()) {
            if (var1.field863 != null) {
                var1.method1851();
            }
        }
        int var2 = class177.method3053(arg0).field1857;
        if (var2 == 0) {
            return;
        }
        int var3 = class338.field3620[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                method255(0.9D);
            }
            if (var3 == 2) {
                method255(0.8D);
            }
            if (var3 == 3) {
                method255(0.7D);
            }
            if (var3 == 4) {
                method255(0.6D);
            }
        }
        if (var2 == 3) {
            if (var3 == 0) {
                method5751(255);
            }
            if (var3 == 1) {
                method5751(192);
            }
            if (var3 == 2) {
                method5751(128);
            }
            if (var3 == 3) {
                method5751(64);
            }
            if (var3 == 4) {
                method5751(0);
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                method804(127);
            }
            if (var3 == 1) {
                method804(96);
            }
            if (var3 == 2) {
                method804(64);
            }
            if (var3 == 3) {
                method804(32);
            }
            if (var3 == 4) {
                method804(0);
            }
        }
        if (var2 == 5) {
            field674 = var3 == 1;
        }
        if (var2 == 6) {
            field585 = var3;
        }
        if (var2 == 9) {
        }
        if (var2 == 10) {
            if (var3 == 0) {
                method3992(127);
            }
            if (var3 == 1) {
                method3992(96);
            }
            if (var3 == 2) {
                method3992(64);
            }
            if (var3 == 3) {
                method3992(32);
            }
            if (var3 == 4) {
                method3992(0);
            }
        }
        if (var2 == 17) {
            field708 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field551 = (class105) class392.method6317(Statics.method2811(), var3);
            if (field551 == null) {
                field551 = class105.field1359;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field665 = -1;
            } else {
                field665 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field552 = (class105) class392.method6317(Statics.method2811(), var3);
            if (field552 == null) {
                field552 = class105.field1359;
            }
        }
    }

    @ObfuscatedName("ce.nw(Lng;B)V")
    public static final void method1132(class350 arg0) {
        int var1 = arg0.field3798;
        if (var1 == 324) {
            if (field594 == -1) {
                field594 = arg0.field3803;
                field717 = arg0.field3810;
            }
            if (field816.field3666 == 1) {
                arg0.field3803 = field594;
            } else {
                arg0.field3803 = field717;
            }
        } else if (var1 == 325) {
            if (field594 == -1) {
                field594 = arg0.field3803;
                field717 = arg0.field3810;
            }
            if (field816.field3666 == 1) {
                arg0.field3803 = field717;
            } else {
                arg0.field3803 = field594;
            }
        } else if (var1 == 327) {
            arg0.field3860 = 150;
            arg0.field3779 = (int) (Math.sin((double) field536 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3770 = 5;
            arg0.field3771 = 0;
        } else if (var1 == 328) {
            arg0.field3860 = 150;
            arg0.field3779 = (int) (Math.sin((double) field536 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field3770 = 5;
            arg0.field3771 = 1;
        }
    }

    @ObfuscatedName("kn.nd(I)V")
    public static final void method4841() {
        class313 var0 = class313.method5301(class311.field3244, field590.field1435);
        field590.method2741(var0);
        class72.field895 = true;
        for (class88 var1 = (class88) field727.method8325(); var1 != null; var1 = (class88) field727.method8333()) {
            if (var1.field1089 == 0 || var1.field1089 == 3) {
                method2122(var1, true);
            }
        }
        if (field704 != null) {
            method2816(field704);
            field704 = null;
        }
        class72.field895 = false;
    }

    @ObfuscatedName("bh.nv(IIII)Ldm;")
    public static final class88 method813(int arg0, int arg1, int arg2) {
        class88 var3 = new class88();
        var3.field1090 = arg1;
        var3.field1089 = arg2;
        field727.method8324(var3, (long) arg0);
        Statics.method3866(arg1);
        class350 var4 = Statics.field1071.method5777(arg0);
        method2816(var4);
        if (field704 != null) {
            method2816(field704);
            field704 = null;
        }
        method3192(Statics.field1071.field3634[arg0 >> 16], var4, false);
        class72.method7565(arg1);
        if (field699 != -1) {
            method287(field699, 1);
        }
        return var3;
    }

    @ObfuscatedName("dg.nb(Ldm;ZI)V")
    public static final void method2122(class88 arg0, boolean arg1) {
        int var2 = arg0.field1090;
        int var3 = (int) arg0.field4920;
        arg0.method7996();
        if (arg1) {
            Statics.field1071.method5780(var2);
        }
        method393(var2);
        class350 var4 = Statics.field1071.method5777(var3);
        if (var4 != null) {
            method2816(var4);
        }
        if (field699 != -1) {
            method287(field699, 1);
        }
    }

    @ObfuscatedName("be.nj(Lng;I)Z")
    public static final boolean method780(class350 arg0) {
        int var1 = arg0.field3798;
        if (var1 == 205) {
            field591 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field816.method5821(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field816.method5817(var4, var5 == 1);
        }
        if (var1 == 324) {
            field816.method5839(0);
        }
        if (var1 == 325) {
            field816.method5839(1);
        }
        if (var1 == 326) {
            class313 var6 = class313.method5301(class311.field3202, field590.field1435);
            field816.method5819(var6.field3291);
            field590.method2741(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.nt(IIIILvd;Lmc;I)V")
    public static final void method266(int arg0, int arg1, int arg2, int arg3, class548 arg4, class337 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method102(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field541 & 0x7FF;
        int var8 = class272.field2819[var7];
        int var9 = class272.field2820[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field3615 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field2170.method9030(arg5.field3615 / 2 + arg0 - var17 / 2 + var15, arg5.field3612 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("ah.nf(IIIILvd;Lmc;I)V")
    public static final void method102(int arg0, int arg1, int arg2, int arg3, class548 arg4, class337 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field541 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class272.field2819[var6];
        int var9 = class272.field2820[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method9028(arg5.field3615 / 2 + var10 - arg4.field5297 / 2, arg5.field3612 / 2 - var11 - arg4.field5302 / 2, arg0, arg1, arg5.field3615, arg5.field3612, arg5.field3611, arg5.field3613);
        } else {
            arg4.method9027(arg5.field3615 / 2 + arg0 + var10 - arg4.field5297 / 2, arg5.field3612 / 2 + arg1 - var11 - arg4.field5302 / 2);
        }
    }

    @ObfuscatedName("iq.np(S)V")
    public static final void method4017() {
        class112.method2142();
        if (Statics.field1010 != null) {
            Statics.field1010.method7512();
        }
    }

    @ObfuscatedName("ub.ng(I)V")
    public static final void method8834() {
        field735 = field726;
        Statics.field2666 = true;
    }

    @ObfuscatedName("ef.nc(Ljava/lang/String;B)V")
    public static final void method2805(String arg0) {
        if (Statics.field1010 != null) {
            class313 var1 = class313.method5301(class311.field3260, field590.field1435);
            var1.field3291.method8574(class534.method3043(arg0));
            var1.field3291.method8581(arg0);
            field590.method2741(var1);
        }
    }

    @ObfuscatedName("cu.no(Ljava/lang/String;S)V")
    public static final void method1120(String arg0) {
        if (!arg0.equals("")) {
            class313 var1 = class313.method5301(class311.field3234, field590.field1435);
            var1.field3291.method8574(class534.method3043(arg0));
            var1.field3291.method8581(arg0);
            field590.method2741(var1);
        }
    }

    @ObfuscatedName("dn.nq(I)V")
    public static final void method2604() {
        class313 var0 = class313.method5301(class311.field3234, field590.field1435);
        var0.field3291.method8574(0);
        field590.method2741(var0);
    }

    @ObfuscatedName("di.nh(III)V")
    public static final void method2328(int arg0, int arg1) {
        class166 var2 = arg0 >= 0 ? field772[arg0] : Statics.field3446;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method3180()) {
            return;
        }
        class148 var3 = (class148) var2.field1804.get(arg1);
        if (var3.field1680 != -1) {
            return;
        }
        String var4 = var3.field1679.method9185();
        class313 var5 = class313.method5301(class311.field3199, field590.field1435);
        var5.field3291.method8574(3 + class534.method3043(var4));
        var5.field3291.method8574(arg0);
        var5.field3291.method8575(arg1);
        var5.field3291.method8581(var4);
        field590.method2741(var5);
    }

    @ObfuscatedName("db.ny(IIZI)V")
    public static final void method2536(int arg0, int arg1, boolean arg2) {
        if (field772[arg0] == null || arg1 < 0 || arg1 >= field772[arg0].method3180()) {
            return;
        }
        class148 var3 = (class148) field772[arg0].field1804.get(arg1);
        class313 var4 = class313.method5301(class311.field3184, field590.field1435);
        var4.field3291.method8574(4 + class534.method3043(var3.field1679.method9185()));
        var4.field3291.method8574(arg0);
        var4.field3291.method8575(arg1);
        var4.field3291.method8580(arg2);
        var4.field3291.method8581(var3.field1679.method9185());
        field590.method2741(var4);
    }

    @ObfuscatedName("bd.nz(II)V")
    public static void method393(int arg0) {
        for (class491 var1 = (class491) field746.method8325(); var1 != null; var1 = (class491) field746.method8333()) {
            if ((long) arg0 == (var1.field4920 >> 48 & 0xFFFFL)) {
                var1.method7996();
            }
        }
    }

    @ObfuscatedName("qc.nk(Lng;S)I")
    public static int method7342(class350 arg0) {
        class491 var1 = (class491) field746.method8322(((long) arg0.field3725 << 32) + (long) arg0.field3726);
        return var1 == null ? arg0.field3748 : var1.field4917;
    }

    @ObfuscatedName("bf.nr(Lng;I)Z")
    public static boolean method748(class350 arg0) {
        return arg0.field3746;
    }

    @ObfuscatedName("es.na(Lng;B)Ljava/lang/String;")
    public static String method2830(class350 arg0) {
        if (class351.method5135(method7342(arg0)) == 0) {
            return null;
        } else if (arg0.field3812 == null || arg0.field3812.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3812;
        }
    }

    @ObfuscatedName("mb.nl(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method5467(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field821 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field821 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field821 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field821 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field821 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1373 != null) {
            var3 = "/p=" + Statics.field1373;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field2689 + "/a=" + Statics.field4532 + var3 + "/";
    }

    @ObfuscatedName("me.nu(Ljava/lang/String;I)V")
    public static void method5747(String arg0) {
        Statics.field1373 = arg0;
        try {
            String var1 = Statics.field2033.getParameter(Integer.toString(18));
            String var2 = Statics.field2033.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                String var5 = var3 + "; Expires=";
                long var6 = class318.method2218() + 94608000000L;
                class353.field3886.setTime(new Date(var6));
                int var8 = class353.field3886.get(7);
                int var9 = class353.field3886.get(5);
                int var10 = class353.field3886.get(2);
                int var11 = class353.field3886.get(1);
                int var12 = class353.field3886.get(11);
                int var13 = class353.field3886.get(12);
                int var14 = class353.field3886.get(13);
                String var15 = class353.field3887[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + class353.field3885[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
                var4 = var5 + var15 + "; Max-Age=" + 94608000L;
            }
            class27.method352(Statics.field2033, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var17) {
        }
    }

    @ObfuscatedName("jc.nx(Ljava/lang/String;ZI)V")
    public static void method4566(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field2177; var5++) {
            class205 var6 = class205.method6353(var5);
            if ((!arg1 || var6.field2227) && var6.field2218 == -1 && var6.field2210.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2292 = -1;
                    Statics.field924 = null;
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
        Statics.field924 = var3;
        Statics.field3147 = 0;
        Statics.field2292 = var4;
        String[] var9 = new String[Statics.field2292];
        for (int var10 = 0; var10 < Statics.field2292; var10++) {
            var9[var10] = class205.method6353(var3[var10]).field2210;
        }
        short[] var11 = Statics.field924;
        class529.method2134(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("de.ni(Luq;II)V")
    public static void method2407(class534 arg0, int arg1) {
        byte[] var2 = arg0.field5199;
        if (field607 == null) {
            field607 = new byte[24];
        }
        class429.method7301(var2, arg1, field607, 0, 24);
        class215.method6927(arg0, arg1);
    }

    @ObfuscatedName("gc.oy(Luq;B)V")
    public static void method3311(class534 arg0) {
        if (field607 != null) {
            arg0.method8584(field607, 0, field607.length);
            return;
        }
        byte[] var1 = new byte[24];
        try {
            class215.field2335.method8385(0L);
            class215.field2335.method8394(var1);
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
        arg0.method8584(var1, 0, var1.length);
    }

    @ObfuscatedName("client.ox(B)Lvn;")
    public class557 method1167() {
        return Statics.field1858 == null ? null : Statics.field1858.field1162;
    }

    @ObfuscatedName("cf.oe(IIIZB)V")
    public static void method2101(int arg0, int arg1, int arg2, boolean arg3) {
        class313 var4 = class313.method5301(class311.field3258, field590.field1435);
        var4.field3291.method8575(arg1);
        var4.field3291.method8575(arg0);
        var4.field3291.method8643(arg3 ? field625 : 0);
        var4.field3291.method8574(arg2);
        field590.method2741(var4);
    }

    @ObfuscatedName("kd.ob(IB)V")
    public static void method5137(int arg0) {
        field535 = arg0;
    }

    @ObfuscatedName("gq.on(I)V")
    public static void method3218() {
        if (field535 == 1) {
            field626 = true;
        }
    }

    @ObfuscatedName("td.os(I)V")
    public static void method8439() {
        if (!field626 || Statics.field1858 == null) {
            return;
        }
        int var0 = Statics.field1858.field1235[0];
        int var1 = Statics.field1858.field1278[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field4747 = Statics.field1858.field1208;
        int var2 = method4842(Statics.field1858.field1208, Statics.field1858.field1253, Statics.field4873) - field604;
        if (var2 < Statics.field4450) {
            Statics.field4450 = var2;
        }
        Statics.field429 = Statics.field1858.field1253;
        field626 = false;
    }

    @ObfuscatedName("qp.oz(Ljava/lang/String;I)Ljava/lang/String;")
    public static String method7382(String arg0) {
        class373[] var1 = class373.method8273();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class373 var3 = var1[var2];
            if (var3.field4353 != -1 && arg0.startsWith(class103.method7123(var3.field4353))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field4353).length());
                break;
            }
        }
        return arg0;
    }

    @ObfuscatedName("sp.oi(B)V")
    public static void method7939() {
        if (Statics.field2353 == null) {
            return;
        }
        field826 = field536;
        Statics.field2353.method6624();
        for (int var0 = 0; var0 < field652.length; var0++) {
            if (field652[var0] != null) {
                Statics.field2353.method6622((field652[var0].field1208 >> 7) + Statics.field1011, (field652[var0].field1253 >> 7) + Statics.field216);
            }
        }
    }

    @ObfuscatedName("bv.oo(B)V")
    public static void method653() {
        Statics.field156.method2433(field689);
    }

    @ObfuscatedName("pc.oh(Lcv;I)V")
    public static void method6928(class68 arg0) {
        if (Statics.field559 != arg0) {
            Statics.field559 = arg0;
        }
    }

    @ObfuscatedName("gd.or(ZI)V")
    public static void method3146(boolean arg0) {
        field674 = arg0;
    }

    @ObfuscatedName("lv.om(II)Luz;")
    public static class526 method5370(int arg0) {
        class526 var1 = (class526) field768.method5414((long) arg0);
        if (var1 == null) {
            var1 = new class526(Statics.field1704, class528.method2964(arg0), class528.method4037(arg0));
            field768.method5421(var1, (long) arg0);
        }
        return var1;
    }

    @ObfuscatedName("qx.og(II)Luz;")
    public static class526 method7271(int arg0) {
        class526 var1 = (class526) field524.method5414((long) arg0);
        if (var1 == null) {
            var1 = new class526(Statics.field1704, arg0);
        }
        return var1;
    }

    @ObfuscatedName("gk.of(IB)V")
    public static void method3215(int arg0) {
        class207 var1 = class207.method3902(arg0);
        if (!var1.method3731()) {
            return;
        }
        int var2 = var1.field2255;
        class141 var3 = (class141) class207.field2254.method5414((long) var2);
        class141 var4;
        if (var3 == null) {
            class141 var5 = Statics.method2326(Statics.field1618, Statics.field1627, var2, false);
            if (var5 != null) {
                class207.field2254.method5421(var5, (long) var2);
            }
            var4 = var5;
        } else {
            var4 = var3;
        }
        int var7;
        if (var4 == null) {
            var7 = 2;
        } else {
            var7 = var4.method3004() ? 0 : 1;
        }
        if (var7 == 2) {
            field827.add(var1.field2255);
        }
    }

    @ObfuscatedName("tv.ot(I)Lot;")
    public static class379 method8267() {
        return Statics.field3898;
    }

    @ObfuscatedName("client.ov(II)V")
    public void method1168(int arg0) {
        class313 var2 = class313.method5301(class311.field3253, field590.field1435);
        var2.field3291.method8574(arg0);
        field590.method2741(var2);
    }

    @ObfuscatedName("client.oc(IS)V")
    public void method1169(int arg0) {
        class313 var2 = class313.method5301(class311.field3272, field590.field1435);
        var2.field3291.method8574(arg0);
        field590.method2741(var2);
    }
}
